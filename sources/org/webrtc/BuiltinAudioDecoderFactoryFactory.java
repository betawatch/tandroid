package org.webrtc;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public class BuiltinAudioDecoderFactoryFactory implements AudioDecoderFactoryFactory {

    /* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
    interface Natives {
        long createBuiltinAudioDecoderFactory();
    }

    @Override // org.webrtc.AudioDecoderFactoryFactory
    public long createNativeAudioDecoderFactory() {
        return BuiltinAudioDecoderFactoryFactoryJni.get().createBuiltinAudioDecoderFactory();
    }
}
