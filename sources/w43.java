// default package

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class w43 implements Drawable.Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x43 b;

    public /* synthetic */ w43(x43 x43Var, byte b) {
        this.a = b;
        this.b = x43Var;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        byte b = this.a;
        x43 x43Var = this.b;
        switch (b) {
            case 0:
                if (x43Var.c < 1.0f) {
                    x43Var.invalidateSelf();
                    break;
                }
                break;
            default:
                if (x43Var.c > 0.0f) {
                    x43Var.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        byte b = this.a;
        x43 x43Var = this.b;
        switch (b) {
            case 0:
                if (x43Var.c < 1.0f) {
                    x43Var.scheduleSelf(runnable, j);
                    break;
                }
                break;
            default:
                if (x43Var.c > 0.0f) {
                    x43Var.scheduleSelf(runnable, j);
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        byte b = this.a;
        x43 x43Var = this.b;
        switch (b) {
            case 0:
                if (x43Var.c < 1.0f) {
                    x43Var.unscheduleSelf(runnable);
                    break;
                }
                break;
            default:
                if (x43Var.c > 0.0f) {
                    x43Var.unscheduleSelf(runnable);
                    break;
                }
                break;
        }
    }
}
