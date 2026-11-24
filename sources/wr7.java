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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class wr7 extends View {
    public long E;
    public float F;
    public final int[] G;
    public final float H;
    public final vr7 a;
    public final RectF b;
    public final Path c;
    public final vva d;
    public final lm e;
    public final lm f;
    public final gn h;
    public final Paint n;
    public final Paint r;
    public final Drawable s;
    public final u9b w;
    public int x;
    public boolean y;

    public wr7(Context context, vr7 vr7Var, bl0 bl0Var) {
        super(context);
        this.b = new RectF();
        this.c = new Path();
        s33 s33Var = s33.h;
        this.e = new lm(320L, this, s33Var);
        this.f = new lm(320L, this, s33Var);
        Paint paint = new Paint(1);
        this.n = paint;
        Paint paint2 = new Paint(1);
        this.r = paint2;
        this.G = new int[2];
        this.H = 1.0f;
        this.a = vr7Var;
        ote.a(this);
        this.s = context.getResources().getDrawable(R.drawable.star).mutate();
        u9b u9bVar = new u9b();
        this.w = u9bVar;
        u9bVar.a = bl0Var;
        u9bVar.a();
        gn gnVar = new gn(false, true, true);
        this.h = gnVar;
        gnVar.u(-9866632);
        gnVar.w(gl.L(9.0f));
        gnVar.setCallback(this);
        gnVar.x(gl.n1("fonts/num.otf"));
        gnVar.K = true;
        paint.setColor(-14670806);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        cm2 cm2Var = new cm2(R.drawable.star, 0);
        cm2Var.I = 1.8f;
        cm2Var.J = 1.8f;
        setCount(0);
        this.d = new vva(1, 50);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float L = gl.L(38.0f);
        float d = this.e.d(this.y);
        float d2 = this.f.d(this.x > 0);
        float width = (getWidth() - L) / 2.0f;
        float height = (getHeight() - L) / 2.0f;
        float width2 = (getWidth() + L) / 2.0f;
        float height2 = (getHeight() + L) / 2.0f;
        RectF rectF = this.b;
        rectF.set(width, height, width2, height2);
        int f = bm2.f(d, -14670806, -548067);
        Paint paint = this.n;
        paint.setColor(f);
        int i = (int) rectF.left;
        int i2 = (int) rectF.top;
        int i3 = (int) rectF.right;
        int i4 = (int) rectF.bottom;
        u9b u9bVar = this.w;
        u9bVar.setBounds(i, i2, i3, i4);
        u9bVar.g.setColor(f);
        u9bVar.invalidateSelf();
        u9bVar.draw(canvas);
        int L2 = gl.L(20.0f);
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
        float R1 = gl.R1(5.0f, 15.0f, d);
        vva vvaVar = this.d;
        vvaVar.h = R1;
        vvaVar.g(rectF);
        vvaVar.d();
        vvaVar.b(canvas, -1, gl.R1(0.5f, 1.0f, d));
        invalidate();
        canvas.restore();
        if (d2 > 0.0f) {
            float L3 = gl.L(12.0f);
            float L4 = gl.L(6.0f);
            gn gnVar = this.h;
            float max = Math.max(L3, gnVar.c() + L4);
            float i5 = gnVar.i() * this.H * d2;
            canvas.save();
            RectF rectF2 = gl.P;
            rectF2.set(getWidth() - max, 0.0f, getWidth(), gl.L(13.0f));
            canvas.scale(i5, i5, rectF2.centerX(), rectF2.centerY());
            rectF2.inset(-gl.L(2.0f), -gl.L(2.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, this.r);
            rectF2.set(getWidth() - max, 0.0f, getWidth(), gl.L(13.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint);
            canvas.translate(((max - gnVar.c()) / 2.0f) + rectF2.left, gl.L(6.33f));
            gnVar.u(bm2.f(d, -9866632, -1));
            gnVar.draw(canvas);
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
        gn gnVar = this.h;
        if (i > 50000) {
            gnVar.t(gl.o0(i, 0), true, true);
        } else {
            gnVar.t(k96.E(i, ','), true, true);
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
