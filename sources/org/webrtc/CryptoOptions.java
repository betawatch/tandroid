package org.webrtc;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class CryptoOptions {
    private final SFrame sframe;
    private final Srtp srtp;

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
    public static class Builder {
        private boolean enableAes128Sha1_32CryptoCipher;
        private boolean enableEncryptedRtpHeaderExtensions;
        private boolean enableGcmCryptoSuites;
        private boolean requireFrameEncryption;

        public CryptoOptions createCryptoOptions() {
            return new CryptoOptions(this.enableGcmCryptoSuites, this.enableAes128Sha1_32CryptoCipher, this.enableEncryptedRtpHeaderExtensions, this.requireFrameEncryption);
        }

        public Builder setEnableAes128Sha1_32CryptoCipher(boolean z4) {
            this.enableAes128Sha1_32CryptoCipher = z4;
            return this;
        }

        public Builder setEnableEncryptedRtpHeaderExtensions(boolean z4) {
            this.enableEncryptedRtpHeaderExtensions = z4;
            return this;
        }

        public Builder setEnableGcmCryptoSuites(boolean z4) {
            this.enableGcmCryptoSuites = z4;
            return this;
        }

        public Builder setRequireFrameEncryption(boolean z4) {
            this.requireFrameEncryption = z4;
            return this;
        }

        private Builder() {
        }
    }

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
    public final class SFrame {
        private final boolean requireFrameEncryption;

        public boolean getRequireFrameEncryption() {
            return this.requireFrameEncryption;
        }

        private SFrame(boolean z4) {
            this.requireFrameEncryption = z4;
        }
    }

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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

        private Srtp(boolean z4, boolean z10, boolean z11) {
            this.enableGcmCryptoSuites = z4;
            this.enableAes128Sha1_32CryptoCipher = z10;
            this.enableEncryptedRtpHeaderExtensions = z11;
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

    private CryptoOptions(boolean z4, boolean z10, boolean z11, boolean z12) {
        this.srtp = new Srtp(z4, z10, z11);
        this.sframe = new SFrame(z12);
    }
}
