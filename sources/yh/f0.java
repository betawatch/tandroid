package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.wc0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class f0 extends jw0 {
    public final /* synthetic */ j0 w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(j0 j0Var, Context context) {
        super(context, null);
        this.w0 = j0Var;
    }

    @Override // org.telegram.ui.Components.jw0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.jw0
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Components.jw0
    public final void U(Drawable drawable) {
        if (drawable instanceof wc0) {
            ((wc0) drawable).p();
        }
        j0 j0Var = this.w0;
        j0Var.d.a = j0Var.c.c(drawable);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.L) {
            return super.drawChild(canvas, view, j10);
        }
        j0 j0Var = this.w0;
        gh.a aVar = j0Var.d.a;
        if (aVar instanceof gh.b) {
            ((gh.b) aVar).c(getWidth(), getHeight());
        }
        j0Var.d.y(canvas, 0.0f, 0.0f, getWidth(), getHeight());
        return false;
    }

    @Override // org.telegram.ui.Components.jw0
    public final Drawable getNewDrawable() {
        Drawable drawable = this.w0.y;
        return drawable != null ? drawable : super.getNewDrawable();
    }

    @Override // org.telegram.ui.Components.jw0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.w0.p();
    }
}
