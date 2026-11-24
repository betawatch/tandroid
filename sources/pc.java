// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class pc {
    public boolean a;
    public int b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public View i;
    public Object j;
    public Object k;
    public Object l;
    public Object m;

    public pc() {
        this.c = new Paint(1);
        this.d = new Paint(1);
        this.e = new w65[4];
        this.a = true;
        this.j = new lm(new iu4(this, (byte) 13), 320L, s33.h, 0);
        this.k = new RectF();
        this.l = new RectF();
        this.m = new Path();
        int i = 0;
        while (true) {
            w65[] w65VarArr = (w65[]) this.e;
            if (i >= w65VarArr.length) {
                ((Paint) this.c).setColor(bkb.w0(null, bkb.jh, false));
                this.f = new tgb(k96.M0(2131751809, null), 12.0f, gl.o());
                tgb tgbVar = new tgb(k96.M0(2131751807, null), 11.0f, null);
                tgbVar.l(99);
                tgbVar.o(gl.L(200.0f));
                tgbVar.k(gl.L(2.66f));
                this.g = tgbVar;
                this.h = new tgb(k96.M0(2131751808, null), 14.0f, gl.o());
                b(null);
                return;
            }
            w65VarArr[i] = new w65(i);
            i++;
        }
    }

    public final boolean a(Canvas canvas, float f, float f2) {
        Paint paint = (Paint) this.d;
        canvas.save();
        tgb tgbVar = (tgb) this.f;
        tgbVar.p = f - gl.L(132.0f);
        Paint paint2 = (Paint) this.c;
        paint2.setColor(bm2.f(f2, this.b, bkb.w0(null, bkb.jh, false)));
        float d = ((lm) this.j).d(this.a);
        float j = tgbVar.j() + gl.L(86.0f) + gl.L(14.0f);
        float L = gl.L(28.0f);
        float L2 = gl.L(232.0f);
        float h = ((tgb) this.g).h() + gl.L(54.0f) + gl.L(50.0f);
        float R1 = gl.R1(j, L2, f2);
        float R12 = gl.R1(L, h, f2);
        float U1 = gl.U1(f2, gl.L(14.0f), gl.L(16.0f));
        RectF rectF = gl.P;
        rectF.set((f - R1) / 2.0f, 0.0f, (f + R1) / 2.0f, R12);
        canvas.drawRoundRect(rectF, U1, U1, paint2);
        Path path = (Path) this.m;
        path.rewind();
        path.addRoundRect(rectF, U1, U1, Path.Direction.CW);
        canvas.clipPath(path);
        int L3 = gl.L(18.0f);
        int L4 = gl.L(30.0f);
        int i = L3 / 2;
        int centerY = ((int) rectF.centerY()) - i;
        int centerY2 = ((int) rectF.centerY()) + i;
        RectF rectF2 = (RectF) this.k;
        float f3 = L3 / 2.0f;
        float f4 = centerY;
        float f5 = centerY2;
        rectF2.set((gl.L(10.0f) + (gl.L(7.0f) + ((int) rectF.left))) - f3, f4, gl.L(10.0f) + gl.L(7.0f) + ((int) rectF.left) + f3, f5);
        float f6 = f / 2.0f;
        float f7 = f6 - (r4 << 1);
        float L5 = (int) ((L2 - gl.L(32.0f)) / 4.0f);
        RectF rectF3 = (RectF) this.l;
        float f8 = (int) ((0.5f * L5) + f7);
        float f9 = L4 / 2.0f;
        rectF3.set(f8 - f9, (int) ((rectF.top + gl.L(27.33f)) - f9), f8 + f9, (int) (rectF.top + gl.L(27.33f) + f9));
        gl.a2(rectF2, rectF3, f2, rectF3);
        w65[] w65VarArr = (w65[]) this.e;
        boolean b = w65VarArr[0].b(canvas, rectF3, f2);
        rectF2.set((gl.L(10.0f) + (gl.L(27.0f) + ((int) rectF.left))) - f3, f4, gl.L(10.0f) + gl.L(27.0f) + ((int) rectF.left) + f3, f5);
        float f10 = (int) ((1.5f * L5) + f7);
        boolean z = b;
        rectF3.set(f10 - f9, (int) ((rectF.top + gl.L(27.33f)) - f9), f10 + f9, (int) (rectF.top + gl.L(27.33f) + f9));
        gl.a2(rectF2, rectF3, f2, rectF3);
        if (w65VarArr[1].b(canvas, rectF3, f2)) {
            z = true;
        }
        tgbVar.c(f6 - (tgbVar.j() / 2.0f), L / 2.0f, gl.R1(1.0f, 0.75f, d) * (1.0f - f2), -1, canvas);
        rectF2.set((gl.L(10.0f) + (((int) rectF.right) - gl.L(47.0f))) - f3, f4, gl.L(10.0f) + (((int) rectF.right) - gl.L(47.0f)) + f3, f5);
        float f11 = (int) ((L5 * 2.5f) + f7);
        rectF3.set(f11 - f9, (int) ((rectF.top + gl.L(27.33f)) - f9), f11 + f9, (int) (rectF.top + gl.L(27.33f) + f9));
        gl.a2(rectF2, rectF3, f2, rectF3);
        if (w65VarArr[2].b(canvas, rectF3, f2)) {
            z = true;
        }
        rectF2.set((gl.L(10.0f) + (((int) rectF.right) - gl.L(27.0f))) - f3, f4, gl.L(10.0f) + (((int) rectF.right) - gl.L(27.0f)) + f3, f5);
        float f12 = (int) ((L5 * 3.5f) + f7);
        rectF3.set(f12 - f9, (int) ((rectF.top + gl.L(27.33f)) - f9), f12 + f9, (int) (rectF.top + gl.L(27.33f) + f9));
        gl.a2(rectF2, rectF3, f2, rectF3);
        boolean z2 = w65VarArr[3].b(canvas, rectF3, f2) ? true : z;
        if (f2 > 0.0f) {
            ((tgb) this.g).c((rectF.centerX() - (L2 / 2.0f)) + gl.L(16.0f), gl.L(54.0f), f2, -1, canvas);
            paint.setColor(-16777216);
            paint.setAlpha((int) (255.0f * f2));
            canvas.drawRect(rectF.left, h - gl.L(40.0f), rectF.right, gl.L(0.66f) + (h - gl.L(40.0f)), paint);
            ((tgb) this.h).c(rectF.centerX() - (((tgb) this.h).j() / 2.0f), h - gl.L(20.0f), f2, -1, canvas);
        }
        canvas.restore();
        return z2;
    }

    public final void b(String[] strArr) {
        this.a = strArr == null;
        for (int i = 0; i < 4; i++) {
            w65 w65Var = ((w65[]) this.e)[i];
            String str = strArr == null ? null : strArr[i];
            ta2 ta2Var = w65Var.k;
            boolean z = w65Var.f;
            w65Var.f = str != null;
            if (str != null && (w65Var.d == null || !TextUtils.equals(w65Var.l, str))) {
                vl vlVar = w65Var.d;
                if (vlVar != null) {
                    vlVar.n(ta2Var);
                }
                w65Var.c = vu3.g(str);
                int k = y6c.k();
                vl vlVar2 = new vl();
                vlVar2.l = 1.0f;
                vlVar2.n = null;
                vlVar2.o = null;
                vlVar2.g = 21;
                vlVar2.h = k;
                vlVar2.x();
                vl.w();
                w65Var.d = vlVar2;
                w65Var.l = str;
                vlVar2.q(str);
                w65Var.c();
                if (w65Var.j) {
                    w65Var.d.a(ta2Var);
                }
            }
            if (w65Var.f && !z) {
                w65Var.e = false;
            }
        }
        sb sbVar = (sb) this.i;
        if (sbVar != null) {
            sbVar.invalidate();
        }
    }

    public pc(ContextThemeWrapper contextThemeWrapper) {
        this.b = -1;
        this.c = contextThemeWrapper;
        this.d = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
    }
}
