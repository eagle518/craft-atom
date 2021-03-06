package io.craft.atom.protocol.ssl.api;

import io.craft.atom.protocol.ssl.spi.SslHandshakeHandler;


/**
 * SSL codec, it is a combination of ssl encoder and decoder.
 * 
 * @author mindwind
 * @version 1.0, Aug 5, 2014
 */
public interface SslCodec {
	
	/**
	 * Encode data to ssl encrypted data.
	 * 
	 * @param data
	 * @return Encrypted app data
	 */
	byte[] encode(byte[] data);
	
	/**
	 * Decode for ssl encrypted data
	 * 
	 * @param data
	 * @return Only decrypted app data, the handshake data will write back to remote by {@link SslHandshakeHandler}
	 */
	byte[] decode(byte[] data);
	
}
