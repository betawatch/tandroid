package org.webrtc;

import java.util.IdentityHashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public class VideoTrack extends MediaStreamTrack {
    private final IdentityHashMap<VideoSink, Long> sinks;

    /* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
    interface Natives {
        void addSink(long j, long j2);

        void freeSink(long j);

        void removeSink(long j, long j2);

        long wrapSink(VideoSink videoSink);
    }

    public VideoTrack(long j) {
        super(j);
        this.sinks = new IdentityHashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addSink$0(VideoSink videoSink, long j) {
        synchronized (this.sinks) {
            if (!this.sinks.containsKey(videoSink)) {
                long wrapSink = VideoTrackJni.get().wrapSink(videoSink);
                this.sinks.put(videoSink, Long.valueOf(wrapSink));
                VideoTrackJni.get().addSink(j, wrapSink);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dispose$2(long j) {
        synchronized (this.sinks) {
            Iterator<Long> it = this.sinks.values().iterator();
            while (it.hasNext()) {
                long longValue = it.next().longValue();
                VideoTrackJni.get().removeSink(j, longValue);
                VideoTrackJni.get().freeSink(longValue);
            }
            this.sinks.clear();
        }
        JniCommon.nativeReleaseRef(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeSink$1(VideoSink videoSink, long j) {
        synchronized (this.sinks) {
            Long remove = this.sinks.remove(videoSink);
            if (remove != null) {
                VideoTrackJni.get().removeSink(j, remove.longValue());
                VideoTrackJni.get().freeSink(remove.longValue());
            }
        }
    }

    public void addSink(VideoSink videoSink) {
        if (videoSink != null) {
            this.lifecycleLock.run(new sgc(this, videoSink, (byte) 1));
        } else {
            lq5.j("The VideoSink is not allowed to be null");
        }
    }

    @Override // org.webrtc.MediaStreamTrack
    public void dispose() {
        this.lifecycleLock.dispose(new ftb(this, (byte) 12));
    }

    public long getNativeVideoTrack() {
        return getNativeMediaStreamTrack();
    }

    public void removeSink(VideoSink videoSink) {
        this.lifecycleLock.runIfAlive(new sgc(this, videoSink, (byte) 0));
    }
}
