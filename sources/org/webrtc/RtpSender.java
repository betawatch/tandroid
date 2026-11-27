package org.webrtc;

import java.util.List;
import org.webrtc.NativeLifecycleLock;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public class RtpSender {
    private MediaStreamTrack cachedTrack;
    private final DtmfSender dtmfSender;
    final NativeLifecycleLock lifecycleLock;
    private boolean ownsTrack = true;

    /* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
    interface Natives {
        long getDtmfSender(long j);

        String getId(long j);

        String getMediaType(long j);

        RtpParameters getParameters(long j);

        List<String> getStreams(long j);

        long getTrack(long j);

        void setFrameEncryptor(long j, long j2);

        boolean setParameters(long j, RtpParameters rtpParameters);

        void setStreams(long j, List<String> list);

        boolean setTrack(long j, long j2);
    }

    public RtpSender(long j) {
        this.lifecycleLock = new NativeLifecycleLock("RtpSender", j);
        this.cachedTrack = MediaStreamTrack.createMediaStreamTrack(RtpSenderJni.get().getTrack(j));
        if (!RtpSenderJni.get().getMediaType(j).equalsIgnoreCase(MediaStreamTrack.AUDIO_TRACK_KIND)) {
            this.dtmfSender = null;
        } else {
            long dtmfSender = RtpSenderJni.get().getDtmfSender(j);
            this.dtmfSender = dtmfSender != 0 ? new DtmfSender(dtmfSender) : null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dispose$8(long j) {
        DtmfSender dtmfSender = this.dtmfSender;
        if (dtmfSender != null) {
            dtmfSender.dispose();
        }
        MediaStreamTrack mediaStreamTrack = this.cachedTrack;
        if (mediaStreamTrack != null && this.ownsTrack) {
            mediaStreamTrack.dispose();
        }
        JniCommon.nativeReleaseRef(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ RtpParameters lambda$getParameters$5(long j) {
        return RtpSenderJni.get().getParameters(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$getStreams$3(long j) {
        return RtpSenderJni.get().getStreams(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$id$6(long j) {
        return RtpSenderJni.get().getId(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setFrameEncryptor$7(FrameEncryptor frameEncryptor, long j) {
        RtpSenderJni.get().setFrameEncryptor(j, frameEncryptor.getNativeFrameEncryptor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$setParameters$4(RtpParameters rtpParameters, long j) {
        return Boolean.valueOf(RtpSenderJni.get().setParameters(j, rtpParameters));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setStreams$2(List list, long j) {
        RtpSenderJni.get().setStreams(j, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$setTrack$0(long j, long j2) {
        return Boolean.valueOf(RtpSenderJni.get().setTrack(j, j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$setTrack$1(MediaStreamTrack mediaStreamTrack, boolean z, long j) {
        if (!(mediaStreamTrack == null ? RtpSenderJni.get().setTrack(j, 0L) : ((Boolean) mediaStreamTrack.lifecycleLock.callOrDefault((NativeLifecycleLock.NativePointerCallable<h40>) new h40((byte) 5, j), (h40) Boolean.FALSE)).booleanValue())) {
            return Boolean.FALSE;
        }
        MediaStreamTrack mediaStreamTrack2 = this.cachedTrack;
        if (mediaStreamTrack2 != null && this.ownsTrack) {
            mediaStreamTrack2.dispose();
        }
        this.cachedTrack = mediaStreamTrack;
        this.ownsTrack = z;
        return Boolean.TRUE;
    }

    public void dispose() {
        this.lifecycleLock.dispose(new ye9(this, (byte) 18));
    }

    public DtmfSender dtmf() {
        return this.dtmfSender;
    }

    public long getNativeRtpSender() {
        return this.lifecycleLock.getNativePointer();
    }

    public RtpParameters getParameters() {
        return (RtpParameters) this.lifecycleLock.call(new iy8((byte) 23));
    }

    public List<String> getStreams() {
        return (List) this.lifecycleLock.call(new iy8((byte) 24));
    }

    public String id() {
        return (String) this.lifecycleLock.call(new iy8((byte) 22));
    }

    public void setFrameEncryptor(FrameEncryptor frameEncryptor) {
        this.lifecycleLock.run(new ye9(frameEncryptor, (byte) 16));
    }

    public boolean setParameters(RtpParameters rtpParameters) {
        return ((Boolean) this.lifecycleLock.call(new ye9(rtpParameters, (byte) 17))).booleanValue();
    }

    public void setStreams(List<String> list) {
        this.lifecycleLock.run(new ur9(list));
    }

    public boolean setTrack(MediaStreamTrack mediaStreamTrack, boolean z) {
        return ((Boolean) this.lifecycleLock.callOrDefault((NativeLifecycleLock.NativePointerCallable<bh>) new bh((Object) this, (Object) mediaStreamTrack, z, (byte) 12), (bh) Boolean.FALSE)).booleanValue();
    }

    public MediaStreamTrack track() {
        return this.cachedTrack;
    }
}
