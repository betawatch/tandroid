package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.PeerConnection;
import org.webrtc.RtcCertificatePem;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
class RtcCertificatePemJni implements RtcCertificatePem.Natives {
    private static JniTestInstanceHolder sOverride;

    public static RtcCertificatePem.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new RtcCertificatePemJni() : (RtcCertificatePem.Natives) obj;
    }

    public static void setInstanceForTesting(RtcCertificatePem.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override // org.webrtc.RtcCertificatePem.Natives
    public RtcCertificatePem generateCertificate(PeerConnection.KeyType keyType, long j) {
        return (RtcCertificatePem) GEN_JNI.org_webrtc_RtcCertificatePem_generateCertificate(keyType, j);
    }

    @Override // org.webrtc.RtcCertificatePem.Natives
    public DtlsFingerprint getFingerprint(String str, String str2) {
        return (DtlsFingerprint) GEN_JNI.org_webrtc_RtcCertificatePem_getFingerprint(str, str2);
    }
}
