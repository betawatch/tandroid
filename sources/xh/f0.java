package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.cw0;
import org.telegram.ui.Components.nc0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class f0 extends cw0 {
    public final /* synthetic */ j0 w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(j0 j0Var, Context context) {
        super(context, null);
        this.w0 = j0Var;
    }

    @Override // org.telegram.ui.Components.cw0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.cw0
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Components.cw0
    public final void U(Drawable drawable) {
        if (drawable instanceof nc0) {
            ((nc0) drawable).p();
        }
        j0 j0Var = this.w0;
        j0Var.d.a = j0Var.c.c(drawable);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != this.L) {
            return super.drawChild(canvas, view, j3);
        }
        j0 j0Var = this.w0;
        fh.a aVar = j0Var.d.a;
        if (aVar instanceof fh.b) {
            ((fh.b) aVar).b(getWidth(), getHeight());
        }
        j0Var.d.v(canvas, 0.0f, 0.0f, getWidth(), getHeight());
        return false;
    }

    @Override // org.telegram.ui.Components.cw0
    public final Drawable getNewDrawable() {
        Drawable drawable = this.w0.y;
        return drawable != null ? drawable : super.getNewDrawable();
    }

    @Override // org.telegram.ui.Components.cw0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.w0.o();
    }
}
