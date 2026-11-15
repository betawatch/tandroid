package org.webrtc;

import org.webrtc.PeerConnection;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public class RtcCertificatePem {
    private static final long DEFAULT_EXPIRY = 2592000;
    public final String certificate;
    public final String privateKey;

    public RtcCertificatePem(String str, String str2) {
        this.privateKey = str;
        this.certificate = str2;
    }

    public static RtcCertificatePem generateCertificate() {
        return nativeGenerateCertificate(PeerConnection.KeyType.ECDSA, DEFAULT_EXPIRY);
    }

    private static native RtcCertificatePem nativeGenerateCertificate(PeerConnection.KeyType keyType, long j3);

    public String getCertificate() {
        return this.certificate;
    }

    public String getPrivateKey() {
        return this.privateKey;
    }

    public static RtcCertificatePem generateCertificate(PeerConnection.KeyType keyType) {
        return nativeGenerateCertificate(keyType, DEFAULT_EXPIRY);
    }

    public static RtcCertificatePem generateCertificate(long j3) {
        return nativeGenerateCertificate(PeerConnection.KeyType.ECDSA, j3);
    }

    public static RtcCertificatePem generateCertificate(PeerConnection.KeyType keyType, long j3) {
        return nativeGenerateCertificate(keyType, j3);
    }
}
