// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class yt4 extends cja {
    public final /* synthetic */ du4 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yt4(du4 du4Var, Context context) {
        super(context, null);
        this.m0 = du4Var;
    }

    @Override // cja
    public final boolean O() {
        return false;
    }

    @Override // cja
    public final boolean P() {
        return false;
    }

    @Override // cja
    public final void T(Drawable drawable) {
        if (drawable instanceof ye7) {
            ((ye7) drawable).o();
        }
        du4 du4Var = this.m0;
        du4Var.n1.a = du4Var.m1.c(drawable);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view != this.M) {
            return super.drawChild(canvas, view, j);
        }
        du4 du4Var = this.m0;
        gx4 gx4Var = du4Var.n1.a;
        if (gx4Var instanceof hx4) {
            ((hx4) gx4Var).b(getWidth(), getHeight());
        }
        du4Var.n1.e(0.0f, 0.0f, getWidth(), getHeight(), canvas);
        return false;
    }

    @Override // cja
    public final Drawable getNewDrawable() {
        Drawable drawable = this.m0.x1;
        return drawable != null ? drawable : super.getNewDrawable();
    }

    @Override // cja, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.m0.D0();
    }
}
