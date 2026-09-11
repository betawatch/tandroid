package org.webrtc;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class CryptoOptions {
    private final SFrame sframe;
    private final Srtp srtp;

    /* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
    public static class Builder {
        private boolean enableAes128Sha1_32CryptoCipher;
        private boolean enableEncryptedRtpHeaderExtensions;
        private boolean enableGcmCryptoSuites;
        private boolean requireFrameEncryption;

        public CryptoOptions createCryptoOptions() {
            return new CryptoOptions(this.enableGcmCryptoSuites, this.enableAes128Sha1_32CryptoCipher, this.enableEncryptedRtpHeaderExtensions, this.requireFrameEncryption);
        }

        public Builder setEnableAes128Sha1_32CryptoCipher(boolean z10) {
            this.enableAes128Sha1_32CryptoCipher = z10;
            return this;
        }

        public Builder setEnableEncryptedRtpHeaderExtensions(boolean z10) {
            this.enableEncryptedRtpHeaderExtensions = z10;
            return this;
        }

        public Builder setEnableGcmCryptoSuites(boolean z10) {
            this.enableGcmCryptoSuites = z10;
            return this;
        }

        public Builder setRequireFrameEncryption(boolean z10) {
            this.requireFrameEncryption = z10;
            return this;
        }

        private Builder() {
        }
    }

    /* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
    public final class SFrame {
        private final boolean requireFrameEncryption;

        public boolean getRequireFrameEncryption() {
            return this.requireFrameEncryption;
        }

        private SFrame(boolean z10) {
            this.requireFrameEncryption = z10;
        }
    }

    /* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
    public final class Srtp {
        private final boolean enableAes128Sha1_32CryptoCipher;
        private final boolean enableEncryptedRtpHeaderExtensions;
        private final boolean enableGcmCryptoSuites;

        public boolean getEnableAes128Sha1_32CryptoCipher() {
            return this.enableAes128Sha1_32CryptoCipher;
        }

        public boolean getEnableEncryptedRtpHeaderExtensions() {
            return this.enableEncryptedRtpHeaderExtensions;
        }

        public boolean getEnableGcmCryptoSuites() {
            return this.enableGcmCryptoSuites;
        }

        private Srtp(boolean z10, boolean z11, boolean z12) {
            this.enableGcmCryptoSuites = z10;
            this.enableAes128Sha1_32CryptoCipher = z11;
            this.enableEncryptedRtpHeaderExtensions = z12;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public SFrame getSFrame() {
        return this.sframe;
    }

    public Srtp getSrtp() {
        return this.srtp;
    }

    private CryptoOptions(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.srtp = new Srtp(z10, z11, z12);
        this.sframe = new SFrame(z13);
    }
}
