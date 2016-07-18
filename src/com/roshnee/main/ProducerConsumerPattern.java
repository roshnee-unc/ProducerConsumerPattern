package com.roshnee.main;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;



public class ProducerConsumerPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BlockingQueue sharedQueue = new LinkedBlockingQueue();
		 
	     //Creating Producer and Consumer Thread
	     Thread prodThread = new Thread(new Producer(sharedQueue));
	     Thread consThread = new Thread(new Consumer(sharedQueue));

	     //Starting producer and Consumer thread
	     prodThread.start();
	     consThread.start();
	    }


	}


