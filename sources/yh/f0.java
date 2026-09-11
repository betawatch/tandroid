package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.ov0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class f0 extends ov0 {
    public final /* synthetic */ j0 w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(j0 j0Var, Context context) {
        super(context, null);
        this.w0 = j0Var;
    }

    @Override // org.telegram.ui.Components.ov0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.ov0
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Components.ov0
    public final void U(Drawable drawable) {
        if (drawable instanceof dc0) {
            ((dc0) drawable).p();
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
        gh.a aVar = j0Var.d.a;
        if (aVar instanceof gh.b) {
            ((gh.b) aVar).b(getWidth(), getHeight());
        }
        j0Var.d.v(canvas, 0.0f, 0.0f, getWidth(), getHeight());
        return false;
    }

    @Override // org.telegram.ui.Components.ov0
    public final Drawable getNewDrawable() {
        Drawable drawable = this.w0.y;
        return drawable != null ? drawable : super.getNewDrawable();
    }

    @Override // org.telegram.ui.Components.ov0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.w0.o();
    }
}
