package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.uu0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g0 extends uu0 {
    public final /* synthetic */ k0 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(k0 k0Var, Context context) {
        super(context, null);
        this.f0 = k0Var;
    }

    @Override // org.telegram.ui.Components.uu0
    public final boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Components.uu0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.uu0
    public final void T(Drawable drawable) {
        if (drawable instanceof jb0) {
            ((jb0) drawable).p();
        }
        k0 k0Var = this.f0;
        k0Var.k1.a = k0Var.j1.c(drawable);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.L) {
            return super.drawChild(canvas, view, j10);
        }
        k0 k0Var = this.f0;
        hi.a aVar = k0Var.k1.a;
        if (aVar instanceof hi.b) {
            ((hi.b) aVar).b(getWidth(), getHeight());
        }
        k0Var.k1.e(canvas, 0.0f, 0.0f, getWidth(), getHeight());
        return false;
    }

    @Override // org.telegram.ui.Components.uu0
    public final Drawable getNewDrawable() {
        Drawable drawable = this.f0.u1;
        return drawable != null ? drawable : super.getNewDrawable();
    }

    @Override // org.telegram.ui.Components.uu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f0.I0();
    }
}
