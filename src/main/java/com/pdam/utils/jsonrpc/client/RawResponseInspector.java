package com.pdam.utils.jsonrpc.client;

import com.pdam.utils.jsonrpc.client.RawResponse;


/**
 * Interface allowing for inspection of the raw HTTP response to a JSON-RPC 2.0
 * request or notification. Can be used to retrieve the unparsed response 
 * content and headers.
 *
 */
public interface RawResponseInspector {


	/**
	 * Allows for inspection of the specified raw HTTP response to a JSON-RPC
	 * 2.0 request or nofitication.
	 *
	 * @param rawResponse The raw HTTP response. Must not be {@code null}.
	 */
	public void inspect(final RawResponse rawResponse);

}
