package org.eurekaclinical.phenotype.service.config;

import org.eurekaclinical.protempa.client.EurekaClinicalProtempaClient;

import com.google.inject.Provider;

/*-
 * #%L
 * Eureka WebApp
 * %%
 * Copyright (C) 2012 - 2017 Emory University
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

/**
 *
 * @author Andrew Post
 */
public class EtlClientProvider implements Provider<EurekaClinicalProtempaClient> {

	private final String etlUrl;

	public EtlClientProvider(String inEtlUrl) {
		this.etlUrl = inEtlUrl;
	}
	
	@Override
	public EurekaClinicalProtempaClient get() {
		return new EurekaClinicalProtempaClient(this.etlUrl);
	}

}
