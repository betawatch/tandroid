package org.webrtc;

import java.util.Collections;
import java.util.List;
import org.webrtc.PeerConnection;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public class RtcCertificatePem {
    private static final long DEFAULT_EXPIRY = 2592000;
    public final String certificate;
    public final String privateKey;

    /* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
    interface Natives {
        RtcCertificatePem generateCertificate(PeerConnection.KeyType keyType, long j);

        DtlsFingerprint getFingerprint(String str, String str2);
    }

    public RtcCertificatePem(String str, String str2) {
        this.privateKey = str;
        this.certificate = str2;
    }

    public static RtcCertificatePem generateCertificate() {
        return RtcCertificatePemJni.get().generateCertificate(PeerConnection.KeyType.ECDSA, DEFAULT_EXPIRY);
    }

    public String getCertificate() {
        return this.certificate;
    }

    public List<DtlsFingerprint> getFingerprints() {
        DtlsFingerprint fingerprint = RtcCertificatePemJni.get().getFingerprint(this.privateKey, this.certificate);
        return fingerprint == null ? Collections.EMPTY_LIST : Collections.singletonList(fingerprint);
    }

    public String getPrivateKey() {
        return this.privateKey;
    }

    public static RtcCertificatePem generateCertificate(PeerConnection.KeyType keyType) {
        return RtcCertificatePemJni.get().generateCertificate(keyType, DEFAULT_EXPIRY);
    }

    public static RtcCertificatePem generateCertificate(long j) {
        return RtcCertificatePemJni.get().generateCertificate(PeerConnection.KeyType.ECDSA, j);
    }

    public static RtcCertificatePem generateCertificate(PeerConnection.KeyType keyType, long j) {
        return RtcCertificatePemJni.get().generateCertificate(keyType, j);
    }
}
