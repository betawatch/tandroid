// default package

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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class xt7 extends View {
    public long E;
    public float F;
    public final int[] G;
    public final float H;
    public final wt7 a;
    public final RectF b;
    public final Path c;
    public final yxa d;
    public final ln e;
    public final ln f;
    public final ho h;
    public final Paint n;
    public final Paint r;
    public final Drawable s;
    public final wbb w;
    public int x;
    public boolean y;

    public xt7(Context context, wt7 wt7Var, bm0 bm0Var) {
        super(context);
        this.b = new RectF();
        this.c = new Path();
        d53 d53Var = d53.h;
        this.e = new ln(320L, this, d53Var);
        this.f = new ln(320L, this, d53Var);
        Paint paint = new Paint(1);
        this.n = paint;
        Paint paint2 = new Paint(1);
        this.r = paint2;
        this.G = new int[2];
        this.H = 1.0f;
        this.a = wt7Var;
        rve.a(this);
        this.s = context.getResources().getDrawable(R.drawable.star).mutate();
        wbb wbbVar = new wbb();
        this.w = wbbVar;
        wbbVar.a = bm0Var;
        wbbVar.a();
        ho hoVar = new ho(false, true, true);
        this.h = hoVar;
        hoVar.u(-9866632);
        hoVar.w(gm.L(9.0f));
        hoVar.setCallback(this);
        hoVar.x(gm.n1("fonts/num.otf"));
        hoVar.K = true;
        paint.setColor(-14670806);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        pn2 pn2Var = new pn2(R.drawable.star, 0);
        pn2Var.I = 1.8f;
        pn2Var.J = 1.8f;
        setCount(0);
        this.d = new yxa(1, 50);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float L = gm.L(38.0f);
        float d = this.e.d(this.y);
        float d2 = this.f.d(this.x > 0);
        float width = (getWidth() - L) / 2.0f;
        float height = (getHeight() - L) / 2.0f;
        float width2 = (getWidth() + L) / 2.0f;
        float height2 = (getHeight() + L) / 2.0f;
        RectF rectF = this.b;
        rectF.set(width, height, width2, height2);
        int f = on2.f(d, -14670806, -548067);
        Paint paint = this.n;
        paint.setColor(f);
        int i = (int) rectF.left;
        int i2 = (int) rectF.top;
        int i3 = (int) rectF.right;
        int i4 = (int) rectF.bottom;
        wbb wbbVar = this.w;
        wbbVar.setBounds(i, i2, i3, i4);
        wbbVar.g.setColor(f);
        wbbVar.invalidateSelf();
        wbbVar.draw(canvas);
        int L2 = gm.L(20.0f);
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
        float R1 = gm.R1(5.0f, 15.0f, d);
        yxa yxaVar = this.d;
        yxaVar.h = R1;
        yxaVar.g(rectF);
        yxaVar.d();
        yxaVar.b(canvas, -1, gm.R1(0.5f, 1.0f, d));
        invalidate();
        canvas.restore();
        if (d2 > 0.0f) {
            float L3 = gm.L(12.0f);
            float L4 = gm.L(6.0f);
            ho hoVar = this.h;
            float max = Math.max(L3, hoVar.c() + L4);
            float i5 = hoVar.i() * this.H * d2;
            canvas.save();
            RectF rectF2 = gm.P;
            rectF2.set(getWidth() - max, 0.0f, getWidth(), gm.L(13.0f));
            canvas.scale(i5, i5, rectF2.centerX(), rectF2.centerY());
            rectF2.inset(-gm.L(2.0f), -gm.L(2.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, this.r);
            rectF2.set(getWidth() - max, 0.0f, getWidth(), gm.L(13.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint);
            canvas.translate(((max - hoVar.c()) / 2.0f) + rectF2.left, gm.L(6.33f));
            hoVar.u(on2.f(d, -9866632, -1));
            hoVar.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.a.c(this);
    }

    public void setCount(int i) {
        this.x = i;
        ho hoVar = this.h;
        if (i > 50000) {
            hoVar.t(gm.o0(i, 0), true, true);
        } else {
            hoVar.t(jb6.E(i, ','), true, true);
        }
        invalidate();
        requestLayout();
    }

    public void setFilled(boolean z) {
        if (this.y == z) {
            return;
        }
        this.y = z;
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.h == drawable || super.verifyDrawable(drawable);
    }
}
