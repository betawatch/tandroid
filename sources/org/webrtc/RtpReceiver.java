package org.webrtc;

import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public class RtpReceiver {
    private MediaStreamTrack cachedTrack;
    private long nativeObserver;
    private long nativeRtpReceiver;

    /* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
    public interface Observer {
        void onFirstPacketReceived(MediaStreamTrack.MediaType mediaType);
    }

    public RtpReceiver(long j3) {
        this.nativeRtpReceiver = j3;
        this.cachedTrack = MediaStreamTrack.createMediaStreamTrack(nativeGetTrack(j3));
    }

    private void checkRtpReceiverExists() {
        if (this.nativeRtpReceiver == 0) {
            throw new IllegalStateException("RtpReceiver has been disposed.");
        }
    }

    private static native String nativeGetId(long j3);

    private static native RtpParameters nativeGetParameters(long j3);

    private static native long nativeGetTrack(long j3);

    private static native void nativeSetFrameDecryptor(long j3, long j10);

    private static native long nativeSetObserver(long j3, Observer observer);

    private static native void nativeUnsetObserver(long j3, long j10);

    public void SetObserver(Observer observer) {
        checkRtpReceiverExists();
        long j3 = this.nativeObserver;
        if (j3 != 0) {
            nativeUnsetObserver(this.nativeRtpReceiver, j3);
        }
        this.nativeObserver = nativeSetObserver(this.nativeRtpReceiver, observer);
    }

    public void dispose() {
        checkRtpReceiverExists();
        this.cachedTrack.dispose();
        long j3 = this.nativeObserver;
        if (j3 != 0) {
            nativeUnsetObserver(this.nativeRtpReceiver, j3);
            this.nativeObserver = 0L;
        }
        JniCommon.nativeReleaseRef(this.nativeRtpReceiver);
        this.nativeRtpReceiver = 0L;
    }

    public long getNativeRtpReceiver() {
        checkRtpReceiverExists();
        return this.nativeRtpReceiver;
    }

    public RtpParameters getParameters() {
        checkRtpReceiverExists();
        return nativeGetParameters(this.nativeRtpReceiver);
    }

    public String id() {
        checkRtpReceiverExists();
        return nativeGetId(this.nativeRtpReceiver);
    }

    public void setFrameDecryptor(FrameDecryptor frameDecryptor) {
        checkRtpReceiverExists();
        nativeSetFrameDecryptor(this.nativeRtpReceiver, frameDecryptor.getNativeFrameDecryptor());
    }

    public MediaStreamTrack track() {
        return this.cachedTrack;
    }
}
