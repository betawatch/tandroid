package wh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.lc0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class g0 extends aw0 {
    public final /* synthetic */ k0 w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(k0 k0Var, Context context) {
        super(context, null);
        this.w0 = k0Var;
    }

    @Override // org.telegram.ui.Components.aw0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.aw0
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Components.aw0
    public final void U(Drawable drawable) {
        if (drawable instanceof lc0) {
            ((lc0) drawable).p();
        }
        k0 k0Var = this.w0;
        k0Var.d.a = k0Var.c.c(drawable);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != this.L) {
            return super.drawChild(canvas, view, j3);
        }
        k0 k0Var = this.w0;
        eh.a aVar = k0Var.d.a;
        if (aVar instanceof eh.b) {
            ((eh.b) aVar).c(getWidth(), getHeight());
        }
        k0Var.d.u(canvas, 0.0f, 0.0f, getWidth(), getHeight());
        return false;
    }

    @Override // org.telegram.ui.Components.aw0
    public final Drawable getNewDrawable() {
        Drawable drawable = this.w0.y;
        return drawable != null ? drawable : super.getNewDrawable();
    }

    @Override // org.telegram.ui.Components.aw0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.w0.o();
    }
}
