package org.telegram.ui;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class sr implements Drawable.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Drawable b;

    public /* synthetic */ sr(int i10, Drawable drawable) {
        this.a = i10;
        this.b = drawable;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                ((tr) this.b).invalidateSelf();
                break;
            default:
                org.telegram.ui.Cells.w0 w0Var = ((b11) this.b).h;
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
                ((tr) this.b).scheduleSelf(runnable, j3);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.a) {
            case 0:
                ((tr) this.b).unscheduleSelf(runnable);
                break;
        }
    }

    private final void b(Drawable drawable, Runnable runnable) {
    }

    private final void a(Drawable drawable, Runnable runnable, long j3) {
    }
}
