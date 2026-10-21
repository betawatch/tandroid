package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.lw0;
import org.telegram.ui.Components.wc0;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final class e0 extends lw0 {
    public final /* synthetic */ i0 w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(i0 i0Var, Context context) {
        super(context, null);
        this.w0 = i0Var;
    }

    @Override // org.telegram.ui.Components.lw0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.lw0
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Components.lw0
    public final void U(Drawable drawable) {
        if (drawable instanceof wc0) {
            ((wc0) drawable).p();
        }
        i0 i0Var = this.w0;
        i0Var.d.a = i0Var.c.c(drawable);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.L) {
            return super.drawChild(canvas, view, j10);
        }
        i0 i0Var = this.w0;
        gh.a aVar = i0Var.d.a;
        if (aVar instanceof gh.b) {
            ((gh.b) aVar).c(getWidth(), getHeight());
        }
        i0Var.d.y(canvas, 0.0f, 0.0f, getWidth(), getHeight());
        return false;
    }

    @Override // org.telegram.ui.Components.lw0
    public final Drawable getNewDrawable() {
        Drawable drawable = this.w0.y;
        return drawable != null ? drawable : super.getNewDrawable();
    }

    @Override // org.telegram.ui.Components.lw0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.w0.p();
    }
}
