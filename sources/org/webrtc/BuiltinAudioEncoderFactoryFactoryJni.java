package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.BuiltinAudioEncoderFactoryFactory;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
class BuiltinAudioEncoderFactoryFactoryJni implements BuiltinAudioEncoderFactoryFactory.Natives {
    private static JniTestInstanceHolder sOverride;

    public static BuiltinAudioEncoderFactoryFactory.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new BuiltinAudioEncoderFactoryFactoryJni() : (BuiltinAudioEncoderFactoryFactory.Natives) obj;
    }

    public static void setInstanceForTesting(BuiltinAudioEncoderFactoryFactory.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override // org.webrtc.BuiltinAudioEncoderFactoryFactory.Natives
    public long createBuiltinAudioEncoderFactory() {
        return GEN_JNI.org_webrtc_BuiltinAudioEncoderFactoryFactory_createBuiltinAudioEncoderFactory();
    }
}
