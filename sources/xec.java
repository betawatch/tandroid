// default package

import android.view.Choreographer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class xec extends wec implements Choreographer.FrameCallback {
    @Override // wec
    public final void a() {
        long j;
        this.b.registerDisplayListener(this, gcc.q(null));
        this.a.removeFrameCallback(this);
        this.a.postFrameCallback(this);
        if (this.b.getDisplay(0) != null) {
            j = (long) (1.0E9d / r0.getRefreshRate());
        } else {
            efd.f("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j = -9223372036854775807L;
        }
        this.d = j;
    }

    @Override // wec
    public final void b() {
        this.b.unregisterDisplayListener(this);
        this.a.removeFrameCallback(this);
        this.c = -9223372036854775807L;
        this.d = -9223372036854775807L;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.c = j;
        this.a.removeFrameCallback(this);
        this.a.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        long j;
        if (i == 0) {
            this.a.removeFrameCallback(this);
            this.a.postFrameCallback(this);
            if (this.b.getDisplay(0) != null) {
                j = (long) (1.0E9d / r5.getRefreshRate());
            } else {
                efd.f("VideoFrameReleaseHelper", "Unable to query display refresh rate");
                j = -9223372036854775807L;
            }
            this.d = j;
        }
    }
}
