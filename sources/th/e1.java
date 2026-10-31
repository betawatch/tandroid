package th;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.gr;
import rh.s8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e1 extends View {
    public long D;
    public float E;
    public final int[] F;
    public final float G;
    public final d1 a;
    public final RectF b;
    public final Path c;
    public final s8 d;
    public final org.telegram.ui.Components.t5 e;
    public final org.telegram.ui.Components.t5 f;
    public final org.telegram.ui.Components.e6 h;
    public final Paint n;
    public final Paint r;
    public final Drawable s;
    public final tg.i w;
    public int x;
    public boolean y;

    public e1(Context context, d1 d1Var, wg.b bVar) {
        super(context);
        this.b = new RectF();
        this.c = new Path();
        gr grVar = gr.h;
        this.e = new org.telegram.ui.Components.t5(this, 320L, grVar);
        this.f = new org.telegram.ui.Components.t5(this, 320L, grVar);
        Paint paint = new Paint(1);
        this.n = paint;
        Paint paint2 = new Paint(1);
        this.r = paint2;
        this.F = new int[2];
        this.G = 1.0f;
        this.a = d1Var;
        w7.e6.a(this);
        this.s = context.getResources().getDrawable(R.drawable.star).mutate();
        tg.i iVar = new tg.i();
        this.w = iVar;
        iVar.a = bVar;
        iVar.a();
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(false, true, true);
        this.h = e6Var;
        e6Var.u(-9866632);
        e6Var.w(org.telegram.messenger.i0.L(9.0f));
        e6Var.setCallback(this);
        e6Var.x(org.telegram.messenger.i0.o1("fonts/num.otf"));
        e6Var.J = true;
        paint.setColor(-14670806);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        dq dqVar = new dq(R.drawable.star, 0);
        dqVar.H = 1.8f;
        dqVar.I = 1.8f;
        setCount(0);
        this.d = new s8(1, 50);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float L = org.telegram.messenger.i0.L(38.0f);
        float d = this.e.d(this.y);
        float d10 = this.f.d(this.x > 0);
        float width = (getWidth() - L) / 2.0f;
        float height = (getHeight() - L) / 2.0f;
        float width2 = (getWidth() + L) / 2.0f;
        float height2 = (getHeight() + L) / 2.0f;
        RectF rectF = this.b;
        rectF.set(width, height, width2, height2);
        int f7 = i0.b.f(d, -14670806, -548067);
        Paint paint = this.n;
        paint.setColor(f7);
        int i10 = (int) rectF.left;
        int i11 = (int) rectF.top;
        int i12 = (int) rectF.right;
        int i13 = (int) rectF.bottom;
        tg.i iVar = this.w;
        iVar.setBounds(i10, i11, i12, i13);
        iVar.g.setColor(f7);
        iVar.invalidateSelf();
        iVar.draw(canvas);
        int L2 = org.telegram.messenger.i0.L(20.0f);
        int width3 = (getWidth() - L2) / 2;
        int height3 = (getHeight() - L2) / 2;
        int width4 = (getWidth() + L2) / 2;
        int height4 = (getHeight() + L2) / 2;
        Drawable drawable = this.s;
        drawable.setBounds(width3, height3, width4, height4);
        drawable.draw(canvas);
        canvas.save();
        Path path = this.c;
        path.rewind();
        path.addRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
        canvas.clipPath(path);
        float T1 = org.telegram.messenger.i0.T1(5.0f, 15.0f, d);
        s8 s8Var = this.d;
        s8Var.h = T1;
        s8Var.g(rectF);
        s8Var.d();
        s8Var.b(canvas, -1, org.telegram.messenger.i0.T1(0.5f, 1.0f, d));
        invalidate();
        canvas.restore();
        if (d10 > 0.0f) {
            float L3 = org.telegram.messenger.i0.L(12.0f);
            float L4 = org.telegram.messenger.i0.L(6.0f);
            org.telegram.ui.Components.e6 e6Var = this.h;
            float max = Math.max(L3, e6Var.c() + L4);
            float i14 = e6Var.i() * this.G * d10;
            canvas.save();
            RectF rectF2 = org.telegram.messenger.i0.P;
            rectF2.set(getWidth() - max, 0.0f, getWidth(), org.telegram.messenger.i0.L(13.0f));
            canvas.scale(i14, i14, rectF2.centerX(), rectF2.centerY());
            rectF2.inset(-org.telegram.messenger.i0.L(2.0f), -org.telegram.messenger.i0.L(2.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, this.r);
            rectF2.set(getWidth() - max, 0.0f, getWidth(), org.telegram.messenger.i0.L(13.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint);
            canvas.translate(((max - e6Var.c()) / 2.0f) + rectF2.left, org.telegram.messenger.i0.L(6.33f));
            e6Var.u(i0.b.f(d, -9866632, -1));
            e6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.a.c(this);
    }

    public void setCount(int i10) {
        this.x = i10;
        org.telegram.ui.Components.e6 e6Var = this.h;
        if (i10 > 50000) {
            e6Var.t(org.telegram.messenger.i0.o0(i10, 0), true, true);
        } else {
            e6Var.t(cd.E(i10, ','), true, true);
        }
        invalidate();
        requestLayout();
    }

    public void setFilled(boolean z10) {
        if (this.y == z10) {
            return;
        }
        this.y = z10;
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.h == drawable || super.verifyDrawable(drawable);
    }
}
