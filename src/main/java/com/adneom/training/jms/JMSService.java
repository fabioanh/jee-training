package com.adneom.training.jms;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jms.JMSContext;
import javax.jms.Queue;

@Stateless
public class JMSService {

	@Resource(mappedName = "java:jboss/jms/queue/exampleQueue")
	private Queue queueExample;

	// JMS Context uses the default JMSConnectionFactory java:/ConnectionFactory
	// -> @JMSConnectionFactory
	@Inject
	JMSContext context;

	public void sendMessage(String txt) {

		try {

			context.createProducer().send(queueExample, txt);

		} catch (Exception exc) {
			exc.printStackTrace();
		}

	}
}