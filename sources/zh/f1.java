package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.wr;
import xh.l8;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class f1 extends View {
    public float E;
    public final int[] F;
    public final float G;
    public final e1 a;
    public final RectF b;
    public final Path c;
    public final l8 d;
    public final org.telegram.ui.Components.d6 e;
    public final org.telegram.ui.Components.d6 f;
    public final org.telegram.ui.Components.n6 h;
    public final Paint n;
    public final Paint r;
    public final Drawable s;
    public final zg.i v;
    public int w;
    public boolean x;
    public long y;

    public f1(Context context, e1 e1Var, ch.b bVar) {
        super(context);
        this.b = new RectF();
        this.c = new Path();
        wr wrVar = wr.h;
        this.e = new org.telegram.ui.Components.d6(this, 320L, wrVar);
        this.f = new org.telegram.ui.Components.d6(this, 320L, wrVar);
        Paint paint = new Paint(1);
        this.n = paint;
        Paint paint2 = new Paint(1);
        this.r = paint2;
        this.F = new int[2];
        this.G = 1.0f;
        this.a = e1Var;
        w7.c6.a(this);
        this.s = context.getResources().getDrawable(R.drawable.star).mutate();
        zg.i iVar = new zg.i();
        this.v = iVar;
        iVar.a(bVar);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, true, true, false);
        this.h = n6Var;
        n6Var.r(-9866632);
        n6Var.t(AndroidUtilities.dp(9.0f));
        n6Var.setCallback(this);
        n6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        n6Var.D = true;
        paint.setColor(-14670806);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        new uq(R.drawable.star, 0).setScale(1.8f, 1.8f);
        setCount(0);
        this.d = new l8(1, 50);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float dp = AndroidUtilities.dp(38.0f);
        float e = this.e.e(this.x);
        float e7 = this.f.e(this.w > 0);
        float width = (getWidth() - dp) / 2.0f;
        float height = (getHeight() - dp) / 2.0f;
        float width2 = (getWidth() + dp) / 2.0f;
        float height2 = (getHeight() + dp) / 2.0f;
        RectF rectF = this.b;
        rectF.set(width, height, width2, height2);
        int d = i0.a.d(e, -14670806, -548067);
        Paint paint = this.n;
        paint.setColor(d);
        int i10 = (int) rectF.left;
        int i11 = (int) rectF.top;
        int i12 = (int) rectF.right;
        int i13 = (int) rectF.bottom;
        zg.i iVar = this.v;
        iVar.setBounds(i10, i11, i12, i13);
        iVar.g.setColor(d);
        iVar.invalidateSelf();
        iVar.draw(canvas);
        int dp2 = AndroidUtilities.dp(20.0f);
        int width3 = (getWidth() - dp2) / 2;
        int height3 = (getHeight() - dp2) / 2;
        int width4 = (getWidth() + dp2) / 2;
        int height4 = (getHeight() + dp2) / 2;
        Drawable drawable = this.s;
        drawable.setBounds(width3, height3, width4, height4);
        drawable.draw(canvas);
        canvas.save();
        Path path = this.c;
        path.rewind();
        path.addRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
        canvas.clipPath(path);
        float lerp = AndroidUtilities.lerp(5.0f, 15.0f, e);
        l8 l8Var = this.d;
        l8Var.h = lerp;
        l8Var.g(rectF);
        l8Var.d();
        l8Var.b(canvas, -1, AndroidUtilities.lerp(0.5f, 1.0f, e));
        invalidate();
        canvas.restore();
        if (e7 > 0.0f) {
            float dp3 = AndroidUtilities.dp(12.0f);
            float dp4 = AndroidUtilities.dp(6.0f);
            org.telegram.ui.Components.n6 n6Var = this.h;
            float max = Math.max(dp3, n6Var.d() + dp4);
            float g10 = n6Var.g() * this.G * e7;
            canvas.save();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(getWidth() - max, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
            canvas.scale(g10, g10, rectF2.centerX(), rectF2.centerY());
            rectF2.inset(-AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, this.r);
            rectF2.set(getWidth() - max, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint);
            canvas.translate(((max - n6Var.d()) / 2.0f) + rectF2.left, AndroidUtilities.dp(6.33f));
            n6Var.r(i0.a.d(e, -9866632, -1));
            n6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.a.c(this);
    }

    public void setCount(int i10) {
        this.w = i10;
        org.telegram.ui.Components.n6 n6Var = this.h;
        if (i10 > 50000) {
            n6Var.q(AndroidUtilities.formatWholeNumber(i10, 0), true, true);
        } else {
            n6Var.q(LocaleController.formatNumber(i10, ','), true, true);
        }
        invalidate();
        requestLayout();
    }

    public void setFilled(boolean z10) {
        if (this.x == z10) {
            return;
        }
        this.x = z10;
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.h == drawable || super.verifyDrawable(drawable);
    }
}
