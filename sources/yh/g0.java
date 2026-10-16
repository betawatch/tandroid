package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.ow0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class g0 extends ow0 {
    public final /* synthetic */ k0 w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(k0 k0Var, Context context) {
        super(context, null);
        this.w0 = k0Var;
    }

    @Override // org.telegram.ui.Components.ow0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.ow0
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Components.ow0
    public final void U(Drawable drawable) {
        if (drawable instanceof cd0) {
            ((cd0) drawable).p();
        }
        k0 k0Var = this.w0;
        k0Var.d.a = k0Var.c.c(drawable);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.L) {
            return super.drawChild(canvas, view, j10);
        }
        k0 k0Var = this.w0;
        gh.a aVar = k0Var.d.a;
        if (aVar instanceof gh.b) {
            ((gh.b) aVar).c(getWidth(), getHeight());
        }
        k0Var.d.v(canvas, 0.0f, 0.0f, getWidth(), getHeight());
        return false;
    }

    @Override // org.telegram.ui.Components.ow0
    public final Drawable getNewDrawable() {
        Drawable drawable = this.w0.y;
        return drawable != null ? drawable : super.getNewDrawable();
    }

    @Override // org.telegram.ui.Components.ow0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.w0.q();
    }
}
