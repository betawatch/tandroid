package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.rt0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class d0 extends rt0 {
    public final /* synthetic */ h0 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(h0 h0Var, Context context) {
        super(context, null);
        this.f0 = h0Var;
    }

    @Override // org.telegram.ui.Components.rt0
    public final boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Components.rt0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.rt0
    public final void T(Drawable drawable) {
        if (drawable instanceof qa0) {
            ((qa0) drawable).p();
        }
        h0 h0Var = this.f0;
        h0Var.k1.a = h0Var.j1.c(drawable);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != this.L) {
            return super.drawChild(canvas, view, j3);
        }
        h0 h0Var = this.f0;
        ri.a aVar = h0Var.k1.a;
        if (aVar instanceof ri.b) {
            ((ri.b) aVar).b(getWidth(), getHeight());
        }
        h0Var.k1.e(canvas, 0.0f, 0.0f, getWidth(), getHeight());
        return false;
    }

    @Override // org.telegram.ui.Components.rt0
    public final Drawable getNewDrawable() {
        Drawable drawable = this.f0.u1;
        return drawable != null ? drawable : super.getNewDrawable();
    }

    @Override // org.telegram.ui.Components.rt0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        this.f0.I0();
    }
}
