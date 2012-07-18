/*
 * Copyright 2006-2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */


package org.springframework.security.oauth2.provider;

import java.util.Map;

/**
 * Strategy for a factory of AuthorizationRequest instances during a token grant. Typical implementations would load the
 * client details from the client id provided and validate the grant type and scopes, populating any fields in the
 * request that are known only to the authorization server.
 * 
 * @author Dave Syer
 * 
 */
public interface AuthorizationRequestFactory {

	AuthorizationRequest createAuthorizationRequest(Map<String, String> authorizationParameters);

}