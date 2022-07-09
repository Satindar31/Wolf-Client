package io.github.solclient.client.event.impl.shader;

import java.util.List;

import io.github.solclient.abstraction.mc.shader.ShaderChain;
import lombok.Data;

@Data
public class PostProcessingEvent {

	private final Type type;
	private final List<ShaderChain> shaders;

	public enum Type {
		RENDER,
		UPDATE
	}

}
