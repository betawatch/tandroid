// default package

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class yac extends wac implements Choreographer$VsyncCallback {
    public final Handler e;

    public yac(Choreographer choreographer, DisplayManager displayManager) {
        super(choreographer, displayManager);
        this.e = g8c.q(null);
    }

    @Override // wac
    public final void a() {
        this.b.registerDisplayListener(this, g8c.q(null));
        Choreographer choreographer = this.a;
        choreographer.removeVsyncCallback(this);
        choreographer.postVsyncCallback(this);
    }

    @Override // wac
    public final void b() {
        this.b.unregisterDisplayListener(this);
        this.e.removeCallbacksAndMessages(null);
        this.a.removeVsyncCallback(this);
        this.c = -9223372036854775807L;
        this.d = -9223372036854775807L;
    }

    public final /* synthetic */ void c() {
        this.a.postVsyncCallback(this);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            this.e.removeCallbacksAndMessages(null);
            Choreographer choreographer = this.a;
            choreographer.removeVsyncCallback(this);
            choreographer.postVsyncCallback(this);
        }
    }

    public final void onVsync(Choreographer.FrameData frameData) {
        this.c = frameData.getFrameTimeNanos();
        Choreographer.FrameTimeline[] frameTimelines = frameData.getFrameTimelines();
        if (frameTimelines.length >= 2) {
            long expectedPresentationTimeNanos = frameTimelines[1].getExpectedPresentationTimeNanos() - frameTimelines[0].getExpectedPresentationTimeNanos();
            this.d = expectedPresentationTimeNanos != 0 ? expectedPresentationTimeNanos : -9223372036854775807L;
        } else {
            this.d = -9223372036854775807L;
        }
        this.e.removeCallbacksAndMessages(null);
        this.e.postDelayed(new cib(this, (byte) 27), 500L);
    }
}
