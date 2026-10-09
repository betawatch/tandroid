package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.sw0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class h0 extends sw0 {
    public final /* synthetic */ l0 w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(l0 l0Var, Context context) {
        super(context, null);
        this.w0 = l0Var;
    }

    @Override // org.telegram.ui.Components.sw0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.sw0
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Components.sw0
    public final void U(Drawable drawable) {
        if (drawable instanceof cd0) {
            ((cd0) drawable).p();
        }
        l0 l0Var = this.w0;
        l0Var.d.a = l0Var.c.c(drawable);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != this.L) {
            return super.drawChild(canvas, view, j3);
        }
        l0 l0Var = this.w0;
        fh.a aVar = l0Var.d.a;
        if (aVar instanceof fh.b) {
            ((fh.b) aVar).b(getWidth(), getHeight());
        }
        l0Var.d.v(canvas, 0.0f, 0.0f, getWidth(), getHeight());
        return false;
    }

    @Override // org.telegram.ui.Components.sw0
    public final Drawable getNewDrawable() {
        Drawable drawable = this.w0.y;
        return drawable != null ? drawable : super.getNewDrawable();
    }

    @Override // org.telegram.ui.Components.sw0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.w0.q();
    }
}
