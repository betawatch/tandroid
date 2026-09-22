package org.webrtc;

import org.webrtc.PeerConnection;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class PeerConnectionDependencies {
    private final PeerConnection.Observer observer;
    private final SSLCertificateVerifier sslCertificateVerifier;

    /* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
    public static class Builder {
        private PeerConnection.Observer observer;
        private SSLCertificateVerifier sslCertificateVerifier;

        public PeerConnectionDependencies createPeerConnectionDependencies() {
            return new PeerConnectionDependencies(this.observer, this.sslCertificateVerifier);
        }

        public Builder setSSLCertificateVerifier(SSLCertificateVerifier sSLCertificateVerifier) {
            this.sslCertificateVerifier = sSLCertificateVerifier;
            return this;
        }

        private Builder(PeerConnection.Observer observer) {
            this.observer = observer;
        }
    }

    public static Builder builder(PeerConnection.Observer observer) {
        return new Builder(observer);
    }

    public PeerConnection.Observer getObserver() {
        return this.observer;
    }

    public SSLCertificateVerifier getSSLCertificateVerifier() {
        return this.sslCertificateVerifier;
    }

    private PeerConnectionDependencies(PeerConnection.Observer observer, SSLCertificateVerifier sSLCertificateVerifier) {
        this.observer = observer;
        this.sslCertificateVerifier = sSLCertificateVerifier;
    }
}
