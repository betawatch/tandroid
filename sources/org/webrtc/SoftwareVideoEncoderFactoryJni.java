package org.webrtc;

import java.util.List;
import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.SoftwareVideoEncoderFactory;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
class SoftwareVideoEncoderFactoryJni implements SoftwareVideoEncoderFactory.Natives {
    private static JniTestInstanceHolder sOverride;

    public static SoftwareVideoEncoderFactory.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new SoftwareVideoEncoderFactoryJni() : (SoftwareVideoEncoderFactory.Natives) obj;
    }

    public static void setInstanceForTesting(SoftwareVideoEncoderFactory.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override // org.webrtc.SoftwareVideoEncoderFactory.Natives
    public long create(long j, long j2, VideoCodecInfo videoCodecInfo) {
        return GEN_JNI.org_webrtc_SoftwareVideoEncoderFactory_create(j, j2, videoCodecInfo);
    }

    @Override // org.webrtc.SoftwareVideoEncoderFactory.Natives
    public long createFactory() {
        return GEN_JNI.org_webrtc_SoftwareVideoEncoderFactory_createFactory();
    }

    @Override // org.webrtc.SoftwareVideoEncoderFactory.Natives
    public List getSupportedCodecs(long j) {
        return (List) GEN_JNI.org_webrtc_SoftwareVideoEncoderFactory_getSupportedCodecs(j);
    }

    @Override // org.webrtc.SoftwareVideoEncoderFactory.Natives
    public boolean isSupported(long j, VideoCodecInfo videoCodecInfo) {
        return GEN_JNI.org_webrtc_SoftwareVideoEncoderFactory_isSupported(j, videoCodecInfo);
    }
}
