package com.jlcg.demo.controller;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import java.util.*;

import org.junit.*;

import com.jlcg.demo.controller.DemoController;
import com.jlcg.demo.model.PingResponse;

public class PingControllerTest {
	
	private final static String INPUT = "Hola, mundo";

	private final DemoController pingController = new DemoController();

	@Test
	public void shouldReturnInputString() {
		final PingResponse pingResponse = pingController.ping(INPUT);
		assertThat(pingResponse, notNullValue());
		assertThat(pingResponse.getInput(), is(INPUT));
	}
	
	@Test
	public void shouldReturnDate() {
		final PingResponse pingResponse = pingController.ping(INPUT);
		assertThat(pingResponse, notNullValue());
		assertThat(pingResponse.getDate(), org.hamcrest.Matchers.isA(Date.class));
	}
	

 }
