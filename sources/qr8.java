// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class qr8 extends wgb {
    public final vva a0;
    public final int b0;
    public final w88 c0;

    public qr8(int i, wjb wjbVar, Context context) {
        super(context, wjbVar);
        this.a0 = new vva(1, 15);
        this.c0 = new w88(this, (byte) 28);
        this.b0 = i == 1 ? bkb.Vk : bkb.Ck;
    }

    @Override // wgb, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean e = e66.e(131072);
        w88 w88Var = this.c0;
        if (e) {
            vva vvaVar = this.a0;
            vvaVar.d();
            vvaVar.a(canvas, bkb.w0(null, this.b0, false));
            rg2.d().a(15, w88Var);
        } else {
            rg2.d().g(w88Var);
        }
        super.dispatchDraw(canvas);
    }

    @Override // wgb, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        rg2.d().g(this.c0);
    }

    @Override // wgb, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ry8 ry8Var = this.e;
        float width = (ry8Var.getWidth() / 2.0f) + ry8Var.getX();
        float height = ((ry8Var.getHeight() / 2.0f) + (ry8Var.getY() + ry8Var.getPaddingTop())) - gl.L(3.0f);
        RectF rectF = gl.P;
        rectF.set(width - gl.L(16.0f), height - gl.L(16.0f), width + gl.L(16.0f), height + gl.L(16.0f));
        this.a0.g(rectF);
    }
}
