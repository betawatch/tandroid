package org.telegram.ui;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class xr implements Drawable.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Drawable b;

    public /* synthetic */ xr(int i10, Drawable drawable) {
        this.a = i10;
        this.b = drawable;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                ((yr) this.b).invalidateSelf();
                break;
            default:
                org.telegram.ui.Cells.w0 w0Var = ((l11) this.b).h;
                if (w0Var != null) {
                    w0Var.invalidate();
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.a) {
            case 0:
                ((yr) this.b).scheduleSelf(runnable, j3);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.a) {
            case 0:
                ((yr) this.b).unscheduleSelf(runnable);
                break;
        }
    }

    private final void b(Drawable drawable, Runnable runnable) {
    }

    private final void a(Drawable drawable, Runnable runnable, long j3) {
    }
}
