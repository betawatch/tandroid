package org.webrtc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.webrtc.NativeLifecycleLock;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public class MediaStream {
    private static final String TAG = "MediaStream";
    final NativeLifecycleLock lifecycleLock;
    public final List<AudioTrack> audioTracks = new ArrayList();
    public final List<VideoTrack> videoTracks = new ArrayList();
    public final List<VideoTrack> preservedVideoTracks = new ArrayList();

    /* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
    interface Natives {
        boolean addAudioTrackToNativeStream(long j, long j2);

        boolean addVideoTrackToNativeStream(long j, long j2);

        String getId(long j);

        boolean removeAudioTrack(long j, long j2);

        boolean removeVideoTrack(long j, long j2);
    }

    public MediaStream(long j) {
        this.lifecycleLock = new NativeLifecycleLock(TAG, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$addPreservedTrack$4(long j, VideoTrack videoTrack, long j2) {
        if (!MediaStreamJni.get().addVideoTrackToNativeStream(j, j2)) {
            return Boolean.FALSE;
        }
        this.preservedVideoTracks.add(videoTrack);
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$addPreservedTrack$5(VideoTrack videoTrack, long j) {
        return (Boolean) videoTrack.lifecycleLock.call(new l07(this, j, videoTrack, (byte) 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$addTrack$0(long j, AudioTrack audioTrack, long j2) {
        if (!MediaStreamJni.get().addAudioTrackToNativeStream(j, j2)) {
            return Boolean.FALSE;
        }
        this.audioTracks.add(audioTrack);
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$addTrack$1(AudioTrack audioTrack, long j) {
        return (Boolean) audioTrack.lifecycleLock.call(new ps0((Object) this, j, (Object) audioTrack, (byte) 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$addTrack$2(long j, VideoTrack videoTrack, long j2) {
        if (!MediaStreamJni.get().addVideoTrackToNativeStream(j, j2)) {
            return Boolean.FALSE;
        }
        this.videoTracks.add(videoTrack);
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$addTrack$3(VideoTrack videoTrack, long j) {
        return (Boolean) videoTrack.lifecycleLock.call(new l07(this, j, videoTrack, (byte) 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dispose$10(long j) {
        while (!this.audioTracks.isEmpty()) {
            AudioTrack audioTrack = this.audioTracks.get(0);
            removeTrack(audioTrack);
            audioTrack.dispose();
        }
        while (!this.videoTracks.isEmpty()) {
            VideoTrack videoTrack = this.videoTracks.get(0);
            removeTrack(videoTrack);
            videoTrack.dispose();
        }
        while (!this.preservedVideoTracks.isEmpty()) {
            removeTrack(this.preservedVideoTracks.get(0));
        }
        JniCommon.nativeReleaseRef(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getId$11(long j) {
        return MediaStreamJni.get().getId(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$removeMediaStreamTrack$12(long j, long j2) {
        return Boolean.valueOf(j2 == j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$removeTrack$6(long j, long j2) {
        return Boolean.valueOf(MediaStreamJni.get().removeAudioTrack(j, j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$removeTrack$7(AudioTrack audioTrack, long j) {
        this.audioTracks.remove(audioTrack);
        return (Boolean) audioTrack.lifecycleLock.callOrDefault((NativeLifecycleLock.NativePointerCallable<h40>) new h40((byte) 4, j), (h40) Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$removeTrack$8(long j, long j2) {
        return Boolean.valueOf(MediaStreamJni.get().removeVideoTrack(j, j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$removeTrack$9(VideoTrack videoTrack, long j) {
        this.videoTracks.remove(videoTrack);
        this.preservedVideoTracks.remove(videoTrack);
        return (Boolean) videoTrack.lifecycleLock.callOrDefault((NativeLifecycleLock.NativePointerCallable<h40>) new h40((byte) 3, j), (h40) Boolean.FALSE);
    }

    private static void removeMediaStreamTrack(List<? extends MediaStreamTrack> list, long j) {
        Iterator<? extends MediaStreamTrack> it = list.iterator();
        while (it.hasNext()) {
            MediaStreamTrack next = it.next();
            if (((Boolean) next.lifecycleLock.callOrDefault((NativeLifecycleLock.NativePointerCallable<h40>) new h40((byte) 2, j), (h40) Boolean.FALSE)).booleanValue()) {
                next.dispose();
                it.remove();
                return;
            }
        }
        Logging.e(TAG, "Couldn't not find track");
    }

    public void addNativeAudioTrack(long j) {
        this.audioTracks.add(new AudioTrack(j));
    }

    public void addNativeVideoTrack(long j) {
        this.videoTracks.add(new VideoTrack(j));
    }

    public boolean addPreservedTrack(VideoTrack videoTrack) {
        return ((Boolean) this.lifecycleLock.call(new k07(this, videoTrack, (byte) 1))).booleanValue();
    }

    public boolean addTrack(AudioTrack audioTrack) {
        return ((Boolean) this.lifecycleLock.call(new m07(this, audioTrack, (byte) 0))).booleanValue();
    }

    public void dispose() {
        this.lifecycleLock.dispose(new bm6(this, (byte) 10));
    }

    public String getId() {
        return (String) this.lifecycleLock.call(new hz6((byte) 6));
    }

    public long getNativeMediaStream() {
        return this.lifecycleLock.getNativePointer();
    }

    public void removeAudioTrack(long j) {
        removeMediaStreamTrack(this.audioTracks, j);
    }

    public boolean removeTrack(AudioTrack audioTrack) {
        return ((Boolean) this.lifecycleLock.callOrDefault((NativeLifecycleLock.NativePointerCallable<m07>) new m07(this, audioTrack, (byte) 1), (m07) Boolean.FALSE)).booleanValue();
    }

    public void removeVideoTrack(long j) {
        removeMediaStreamTrack(this.videoTracks, j);
    }

    public String toString() {
        return "[" + getId() + ":A=" + this.audioTracks.size() + ":V=" + this.videoTracks.size() + "]";
    }

    public boolean addTrack(VideoTrack videoTrack) {
        return ((Boolean) this.lifecycleLock.call(new k07(this, videoTrack, (byte) 2))).booleanValue();
    }

    public boolean removeTrack(VideoTrack videoTrack) {
        return ((Boolean) this.lifecycleLock.callOrDefault((NativeLifecycleLock.NativePointerCallable<k07>) new k07(this, videoTrack, (byte) 0), (k07) Boolean.FALSE)).booleanValue();
    }
}
