// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class zmb {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public Drawable d;
    public Drawable e;
    public final /* synthetic */ anb f;

    public zmb(anb anbVar) {
        this.f = anbVar;
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Paint(1);
        this.c = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gl.L(2.0f));
    }

    public final void a(Canvas canvas, float f) {
        float f2;
        float f3;
        float f4;
        StaticLayout noThemeStaticLayout;
        float f5;
        float f6;
        float f7;
        byte b;
        anb anbVar = this.f;
        ImageReceiver imageReceiver = anbVar.Q;
        float f8 = anbVar.e;
        m17 m17Var = anbVar.T;
        m17 m17Var2 = anbVar.S;
        float f9 = anbVar.d;
        float f10 = anbVar.c;
        byte b2 = anbVar.L;
        RectF rectF = anbVar.w;
        if (anbVar.a0 || anbVar.E != null) {
            wd2 wd2Var = anbVar.H;
            f2 = 255.0f;
            int v0 = anbVar.H.a.l() ? bkb.v0(bkb.Ei, anbVar.y) : ((iy3) wd2Var.a.f.get(wd2Var.c)).j;
            Paint paint = this.a;
            paint.setColor(v0);
            paint.setAlpha((int) (anbVar.N * f * 255.0f));
            f3 = 4.0f;
            f4 = 0.5f;
            float A = tb4.A(1.0f, anbVar.N, gl.L(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(A, A, anbVar.getWidth() - A, anbVar.getHeight() - A);
            float f11 = anbVar.a;
            canvas.drawRoundRect(rectF, f11, f11, paint);
        } else {
            f4 = 0.5f;
            f2 = 255.0f;
            f3 = 4.0f;
        }
        int i = (int) (f * f2);
        Paint paint2 = this.b;
        paint2.setAlpha(i);
        Paint paint3 = this.c;
        paint3.setAlpha(i);
        rectF.set(f10, f10, anbVar.getWidth() - f10, anbVar.getHeight() - f10);
        jy3 jy3Var = anbVar.H.a;
        if (jy3Var != null) {
            if (!jy3Var.l()) {
                if (b2 != 4) {
                    if (b2 == 2) {
                        anbVar.H.getClass();
                        return;
                    }
                    float L = gl.L(8.0f) + f10;
                    float L2 = gl.L(b2 == 3 ? 5.0f : 22.0f) + f10;
                    if (b2 == 0 || b2 == 3) {
                        f5 = f8;
                        rectF.set(L2, L, ((b2 == 3 ? 1.2f : 1.0f) * f5) + L2, L + f9);
                    } else {
                        L = 0.12f * anbVar.getMeasuredHeight();
                        f5 = f8;
                        rectF.set(anbVar.getMeasuredWidth() - (anbVar.getMeasuredWidth() * 0.65f), L, anbVar.getMeasuredWidth() - (anbVar.getMeasuredWidth() * 0.1f), anbVar.getMeasuredHeight() * 0.32f);
                    }
                    if (b2 == 3) {
                        paint2 = paint3;
                    }
                    if (b2 == 0 || b2 == 3) {
                        f6 = f9;
                        f7 = 2.0f;
                        canvas.drawRoundRect(rectF, rectF.height() * f4, rectF.height() * f4, paint2);
                    } else {
                        f7 = 2.0f;
                        f6 = f9;
                        m17Var2.setBounds((int) rectF.left, ((int) rectF.top) - gl.L(2.0f), gl.L(f3) + ((int) rectF.right), gl.L(2.0f) + ((int) rectF.bottom));
                        m17Var2.Q = (int) (rectF.height() * f4);
                        m17Var2.c(canvas, paint2);
                    }
                    if (b2 == 0 || b2 == 3) {
                        float L3 = f10 + gl.L(5.0f);
                        float L4 = f6 + gl.L(f3) + L;
                        b = 3;
                        rectF.set(L3, L4, (f5 * (b2 == 3 ? 0.8f : 1.0f)) + L3, L4 + f6);
                    } else {
                        rectF.set(anbVar.getMeasuredWidth() * 0.1f, anbVar.getMeasuredHeight() * 0.35f, anbVar.getMeasuredWidth() * 0.65f, anbVar.getMeasuredHeight() * 0.55f);
                        b = 3;
                    }
                    if (b2 != 0 && b2 != b) {
                        m17Var.setBounds(((int) rectF.left) - gl.L(f3), ((int) rectF.top) - gl.L(f7), (int) rectF.right, gl.L(f7) + ((int) rectF.bottom));
                        m17Var.Q = (int) (rectF.height() * f4);
                        m17Var.c(canvas, paint3);
                        return;
                    }
                    canvas.drawRoundRect(rectF, rectF.height() * f4, rectF.height() * f4, paint3);
                    if (anbVar.V != 0) {
                        float centerY = rectF.centerY();
                        float height = (rectF.height() / f7) + rectF.left;
                        float height2 = rectF.right - (rectF.height() / f7);
                        rectF.set(height - gl.L(8.0f), centerY - gl.L(8.0f), height + gl.L(8.0f), gl.L(8.0f) + centerY);
                        imageReceiver.k0(rectF);
                        imageReceiver.h(canvas, null);
                        Drawable drawable = this.e;
                        if (drawable == null) {
                            drawable = anbVar.getContext().getDrawable(R.drawable.mini_replace_16).mutate();
                            this.e = drawable;
                        }
                        int i2 = (int) height2;
                        int i3 = (int) centerY;
                        drawable.setBounds(i2 - gl.L(8.0f), i3 - gl.L(8.0f), gl.L(8.0f) + i2, gl.L(8.0f) + i3);
                        this.e.draw(canvas);
                        return;
                    }
                    return;
                }
                return;
            }
            anbVar.H.a.getClass();
        }
        if (anbVar.U == null) {
            float f12 = anbVar.b;
            canvas.drawRoundRect(rectF, f12, f12, anbVar.s);
            canvas.save();
            noThemeStaticLayout = anbVar.getNoThemeStaticLayout();
            canvas.translate((anbVar.getWidth() - noThemeStaticLayout.getWidth()) * f4, gl.L(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f) {
        jy3 jy3Var;
        int[] iArr;
        int i;
        anb anbVar = this.f;
        float f2 = anbVar.b;
        Paint paint = anbVar.r;
        if (this.d == null) {
            wd2 wd2Var = anbVar.H;
            if (wd2Var == null || (jy3Var = wd2Var.a) == null || !jy3Var.l() || anbVar.O == null) {
                canvas.drawRoundRect(anbVar.w, f2, f2, anbVar.s);
                return;
            }
            return;
        }
        canvas.save();
        canvas.clipPath(anbVar.x);
        Drawable drawable = this.d;
        if (drawable instanceof BitmapDrawable) {
            float intrinsicWidth = drawable.getIntrinsicWidth();
            float intrinsicHeight = this.d.getIntrinsicHeight();
            if (intrinsicWidth / intrinsicHeight > anbVar.getWidth() / anbVar.getHeight()) {
                int width = (int) ((anbVar.getWidth() * intrinsicHeight) / intrinsicWidth);
                int width2 = (width - anbVar.getWidth()) / 2;
                this.d.setBounds(width2, 0, width + width2, anbVar.getHeight());
            } else {
                int height = (int) ((anbVar.getHeight() * intrinsicHeight) / intrinsicWidth);
                int height2 = (anbVar.getHeight() - height) / 2;
                this.d.setBounds(0, height2, anbVar.getWidth(), height + height2);
            }
        } else {
            drawable.setBounds(0, 0, anbVar.getWidth(), anbVar.getHeight());
        }
        this.d.setAlpha((int) (255.0f * f));
        this.d.draw(canvas);
        Drawable drawable2 = this.d;
        if ((drawable2 instanceof ColorDrawable) || ((drawable2 instanceof ye7) && (i = (iArr = ((ye7) drawable2).a)[0]) == iArr[1] && i == iArr[2] && i == iArr[3])) {
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (alpha * f));
            float f3 = anbVar.c;
            RectF rectF = gl.P;
            rectF.set(f3, f3, anbVar.getWidth() - f3, anbVar.getHeight() - f3);
            canvas.drawRoundRect(rectF, f2, f2, paint);
            paint.setAlpha(alpha);
        }
        canvas.restore();
    }
}
