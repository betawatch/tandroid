// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class tt8 extends xib {
    public final yxa a0;
    public final int b0;
    public final pp8 c0;

    public tt8(int i, ylb ylbVar, Context context) {
        super(context, ylbVar);
        this.a0 = new yxa(1, 15);
        this.c0 = new pp8(this, (byte) 6);
        this.b0 = i == 1 ? cmb.Vk : cmb.Ck;
    }

    @Override // xib, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean e = e86.e(131072);
        pp8 pp8Var = this.c0;
        if (e) {
            yxa yxaVar = this.a0;
            yxaVar.d();
            yxaVar.a(canvas, cmb.w0(null, this.b0, false));
            fi2.d().a(15, pp8Var);
        } else {
            fi2.d().g(pp8Var);
        }
        super.dispatchDraw(canvas);
    }

    @Override // xib, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        fi2.d().g(this.c0);
    }

    @Override // xib, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        s09 s09Var = this.e;
        float width = (s09Var.getWidth() / 2.0f) + s09Var.getX();
        float height = ((s09Var.getHeight() / 2.0f) + (s09Var.getY() + s09Var.getPaddingTop())) - gm.L(3.0f);
        RectF rectF = gm.P;
        rectF.set(width - gm.L(16.0f), height - gm.L(16.0f), width + gm.L(16.0f), height + gm.L(16.0f));
        this.a0.g(rectF);
    }
}
