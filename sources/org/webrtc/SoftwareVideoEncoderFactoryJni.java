package org.webrtc;

import java.util.List;
import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.SoftwareVideoEncoderFactory;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
