package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.Components.vw0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class e0 extends vw0 {
    public final /* synthetic */ i0 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(i0 i0Var, Context context) {
        super(context, null);
        this.l0 = i0Var;
    }

    @Override // org.telegram.ui.Components.vw0
    public final boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Components.vw0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.vw0
    public final void T(Drawable drawable) {
        if (drawable instanceof uc0) {
            ((uc0) drawable).p();
        }
        i0 i0Var = this.l0;
        i0Var.d.a = i0Var.c.c(drawable);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.L) {
            return super.drawChild(canvas, view, j10);
        }
        i0 i0Var = this.l0;
        hh.a aVar = i0Var.d.a;
        if (aVar instanceof hh.b) {
            ((hh.b) aVar).b(getWidth(), getHeight());
        }
        i0Var.d.w(canvas, 0.0f, 0.0f, getWidth(), getHeight());
        return false;
    }

    @Override // org.telegram.ui.Components.vw0
    public final Drawable getNewDrawable() {
        Drawable drawable = this.l0.y;
        return drawable != null ? drawable : super.getNewDrawable();
    }

    @Override // org.telegram.ui.Components.vw0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.l0.q();
    }
}
