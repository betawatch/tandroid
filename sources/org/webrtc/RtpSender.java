package org.webrtc;

import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public class RtpSender {
    private MediaStreamTrack cachedTrack;
    private final DtmfSender dtmfSender;
    private long nativeRtpSender;
    private boolean ownsTrack = true;

    public RtpSender(long j) {
        this.nativeRtpSender = j;
        this.cachedTrack = MediaStreamTrack.createMediaStreamTrack(nativeGetTrack(j));
        if (!nativeGetMediaType(j).equalsIgnoreCase(MediaStreamTrack.AUDIO_TRACK_KIND)) {
            this.dtmfSender = null;
        } else {
            long nativeGetDtmfSender = nativeGetDtmfSender(j);
            this.dtmfSender = nativeGetDtmfSender != 0 ? new DtmfSender(nativeGetDtmfSender) : null;
        }
    }

    private void checkRtpSenderExists() {
        if (this.nativeRtpSender != 0) {
            return;
        }
        dq9.m("RtpSender has been disposed.");
    }

    private static native long nativeGetDtmfSender(long j);

    private static native String nativeGetId(long j);

    private static native String nativeGetMediaType(long j);

    private static native RtpParameters nativeGetParameters(long j);

    private static native List<String> nativeGetStreams(long j);

    private static native long nativeGetTrack(long j);

    private static native void nativeSetFrameEncryptor(long j, long j2);

    private static native boolean nativeSetParameters(long j, RtpParameters rtpParameters);

    private static native void nativeSetStreams(long j, List<String> list);

    private static native boolean nativeSetTrack(long j, long j2);

    public void dispose() {
        checkRtpSenderExists();
        DtmfSender dtmfSender = this.dtmfSender;
        if (dtmfSender != null) {
            dtmfSender.dispose();
        }
        MediaStreamTrack mediaStreamTrack = this.cachedTrack;
        if (mediaStreamTrack != null && this.ownsTrack) {
            mediaStreamTrack.dispose();
        }
        JniCommon.nativeReleaseRef(this.nativeRtpSender);
        this.nativeRtpSender = 0L;
    }

    public DtmfSender dtmf() {
        return this.dtmfSender;
    }

    public long getNativeRtpSender() {
        checkRtpSenderExists();
        return this.nativeRtpSender;
    }

    public RtpParameters getParameters() {
        checkRtpSenderExists();
        return nativeGetParameters(this.nativeRtpSender);
    }

    public List<String> getStreams() {
        checkRtpSenderExists();
        return nativeGetStreams(this.nativeRtpSender);
    }

    public String id() {
        checkRtpSenderExists();
        return nativeGetId(this.nativeRtpSender);
    }

    public void setFrameEncryptor(FrameEncryptor frameEncryptor) {
        checkRtpSenderExists();
        nativeSetFrameEncryptor(this.nativeRtpSender, frameEncryptor.getNativeFrameEncryptor());
    }

    public boolean setParameters(RtpParameters rtpParameters) {
        checkRtpSenderExists();
        return nativeSetParameters(this.nativeRtpSender, rtpParameters);
    }

    public void setStreams(List<String> list) {
        checkRtpSenderExists();
        nativeSetStreams(this.nativeRtpSender, list);
    }

    public boolean setTrack(MediaStreamTrack mediaStreamTrack, boolean z) {
        checkRtpSenderExists();
        if (!nativeSetTrack(this.nativeRtpSender, mediaStreamTrack == null ? 0L : mediaStreamTrack.getNativeMediaStreamTrack())) {
            return false;
        }
        MediaStreamTrack mediaStreamTrack2 = this.cachedTrack;
        if (mediaStreamTrack2 != null && this.ownsTrack) {
            mediaStreamTrack2.dispose();
        }
        this.cachedTrack = mediaStreamTrack;
        this.ownsTrack = z;
        return true;
    }

    public MediaStreamTrack track() {
        return this.cachedTrack;
    }
}
