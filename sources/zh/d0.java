package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.st0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class d0 extends st0 {
    public final /* synthetic */ h0 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(h0 h0Var, Context context) {
        super(context, null);
        this.f0 = h0Var;
    }

    @Override // org.telegram.ui.Components.st0
    public final boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Components.st0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.st0
    public final void T(Drawable drawable) {
        if (drawable instanceof qa0) {
            ((qa0) drawable).p();
        }
        h0 h0Var = this.f0;
        h0Var.n1.a = h0Var.m1.c(drawable);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != this.L) {
            return super.drawChild(canvas, view, j3);
        }
        h0 h0Var = this.f0;
        ri.a aVar = h0Var.n1.a;
        if (aVar instanceof ri.b) {
            ((ri.b) aVar).b(getWidth(), getHeight());
        }
        h0Var.n1.e(canvas, 0.0f, 0.0f, getWidth(), getHeight());
        return false;
    }

    @Override // org.telegram.ui.Components.st0
    public final Drawable getNewDrawable() {
        Drawable drawable = this.f0.x1;
        return drawable != null ? drawable : super.getNewDrawable();
    }

    @Override // org.telegram.ui.Components.st0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        this.f0.I0();
    }
}
