package org.webrtc;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public class BuiltinAudioDecoderFactoryFactory implements AudioDecoderFactoryFactory {

    /* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
    interface Natives {
        long createBuiltinAudioDecoderFactory();
    }

    @Override // org.webrtc.AudioDecoderFactoryFactory
    public long createNativeAudioDecoderFactory() {
        return BuiltinAudioDecoderFactoryFactoryJni.get().createBuiltinAudioDecoderFactory();
    }
}
