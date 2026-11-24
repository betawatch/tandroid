// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class pd {
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

    public pd() {
        this.c = new Paint(1);
        this.d = new Paint(1);
        this.e = new u85[4];
        this.a = true;
        this.j = new ln(new qn4(this, (byte) 20), 320L, d53.h, 0);
        this.k = new RectF();
        this.l = new RectF();
        this.m = new Path();
        int i = 0;
        while (true) {
            u85[] u85VarArr = (u85[]) this.e;
            if (i >= u85VarArr.length) {
                ((Paint) this.c).setColor(cmb.w0(null, cmb.jh, false));
                this.f = new uib(jb6.M0(2131751758, null), 12.0f, gm.o());
                uib uibVar = new uib(jb6.M0(2131751756, null), 11.0f, null);
                uibVar.l(99);
                uibVar.o(gm.L(200.0f));
                uibVar.k(gm.L(2.66f));
                this.g = uibVar;
                this.h = new uib(jb6.M0(2131751757, null), 14.0f, gm.o());
                b(null);
                return;
            }
            u85VarArr[i] = new u85(i);
            i++;
        }
    }

    public final boolean a(Canvas canvas, float f, float f2) {
        Paint paint = (Paint) this.d;
        canvas.save();
        uib uibVar = (uib) this.f;
        uibVar.p = f - gm.L(132.0f);
        Paint paint2 = (Paint) this.c;
        paint2.setColor(on2.f(f2, this.b, cmb.w0(null, cmb.jh, false)));
        float d = ((ln) this.j).d(this.a);
        float j = uibVar.j() + gm.L(86.0f) + gm.L(14.0f);
        float L = gm.L(28.0f);
        float L2 = gm.L(232.0f);
        float h = ((uib) this.g).h() + gm.L(54.0f) + gm.L(50.0f);
        float R1 = gm.R1(j, L2, f2);
        float R12 = gm.R1(L, h, f2);
        float U1 = gm.U1(f2, gm.L(14.0f), gm.L(16.0f));
        RectF rectF = gm.P;
        rectF.set((f - R1) / 2.0f, 0.0f, (f + R1) / 2.0f, R12);
        canvas.drawRoundRect(rectF, U1, U1, paint2);
        Path path = (Path) this.m;
        path.rewind();
        path.addRoundRect(rectF, U1, U1, Path.Direction.CW);
        canvas.clipPath(path);
        int L3 = gm.L(18.0f);
        int L4 = gm.L(30.0f);
        int i = L3 / 2;
        int centerY = ((int) rectF.centerY()) - i;
        int centerY2 = ((int) rectF.centerY()) + i;
        RectF rectF2 = (RectF) this.k;
        float f3 = L3 / 2.0f;
        float f4 = centerY;
        float f5 = centerY2;
        rectF2.set((gm.L(10.0f) + (gm.L(7.0f) + ((int) rectF.left))) - f3, f4, gm.L(10.0f) + gm.L(7.0f) + ((int) rectF.left) + f3, f5);
        float f6 = f / 2.0f;
        float f7 = f6 - (r4 << 1);
        float L5 = (int) ((L2 - gm.L(32.0f)) / 4.0f);
        RectF rectF3 = (RectF) this.l;
        float f8 = (int) ((0.5f * L5) + f7);
        float f9 = L4 / 2.0f;
        rectF3.set(f8 - f9, (int) ((rectF.top + gm.L(27.33f)) - f9), f8 + f9, (int) (rectF.top + gm.L(27.33f) + f9));
        gm.a2(rectF2, rectF3, f2, rectF3);
        u85[] u85VarArr = (u85[]) this.e;
        boolean b = u85VarArr[0].b(canvas, rectF3, f2);
        rectF2.set((gm.L(10.0f) + (gm.L(27.0f) + ((int) rectF.left))) - f3, f4, gm.L(10.0f) + gm.L(27.0f) + ((int) rectF.left) + f3, f5);
        float f10 = (int) ((1.5f * L5) + f7);
        boolean z = b;
        rectF3.set(f10 - f9, (int) ((rectF.top + gm.L(27.33f)) - f9), f10 + f9, (int) (rectF.top + gm.L(27.33f) + f9));
        gm.a2(rectF2, rectF3, f2, rectF3);
        if (u85VarArr[1].b(canvas, rectF3, f2)) {
            z = true;
        }
        uibVar.c(f6 - (uibVar.j() / 2.0f), L / 2.0f, gm.R1(1.0f, 0.75f, d) * (1.0f - f2), -1, canvas);
        rectF2.set((gm.L(10.0f) + (((int) rectF.right) - gm.L(47.0f))) - f3, f4, gm.L(10.0f) + (((int) rectF.right) - gm.L(47.0f)) + f3, f5);
        float f11 = (int) ((L5 * 2.5f) + f7);
        rectF3.set(f11 - f9, (int) ((rectF.top + gm.L(27.33f)) - f9), f11 + f9, (int) (rectF.top + gm.L(27.33f) + f9));
        gm.a2(rectF2, rectF3, f2, rectF3);
        if (u85VarArr[2].b(canvas, rectF3, f2)) {
            z = true;
        }
        rectF2.set((gm.L(10.0f) + (((int) rectF.right) - gm.L(27.0f))) - f3, f4, gm.L(10.0f) + (((int) rectF.right) - gm.L(27.0f)) + f3, f5);
        float f12 = (int) ((L5 * 3.5f) + f7);
        rectF3.set(f12 - f9, (int) ((rectF.top + gm.L(27.33f)) - f9), f12 + f9, (int) (rectF.top + gm.L(27.33f) + f9));
        gm.a2(rectF2, rectF3, f2, rectF3);
        boolean z2 = u85VarArr[3].b(canvas, rectF3, f2) ? true : z;
        if (f2 > 0.0f) {
            ((uib) this.g).c((rectF.centerX() - (L2 / 2.0f)) + gm.L(16.0f), gm.L(54.0f), f2, -1, canvas);
            paint.setColor(-16777216);
            paint.setAlpha((int) (255.0f * f2));
            canvas.drawRect(rectF.left, h - gm.L(40.0f), rectF.right, gm.L(0.66f) + (h - gm.L(40.0f)), paint);
            ((uib) this.h).c(rectF.centerX() - (((uib) this.h).j() / 2.0f), h - gm.L(20.0f), f2, -1, canvas);
        }
        canvas.restore();
        return z2;
    }

    public final void b(String[] strArr) {
        this.a = strArr == null;
        for (int i = 0; i < 4; i++) {
            u85 u85Var = ((u85[]) this.e)[i];
            String str = strArr == null ? null : strArr[i];
            ec2 ec2Var = u85Var.k;
            boolean z = u85Var.f;
            u85Var.f = str != null;
            if (str != null && (u85Var.d == null || !TextUtils.equals(u85Var.l, str))) {
                vm vmVar = u85Var.d;
                if (vmVar != null) {
                    vmVar.n(ec2Var);
                }
                u85Var.c = gw3.g(str);
                int k = z8c.k();
                vm vmVar2 = new vm();
                vmVar2.l = 1.0f;
                vmVar2.n = null;
                vmVar2.o = null;
                vmVar2.g = 21;
                vmVar2.h = k;
                vmVar2.x();
                vm.w();
                u85Var.d = vmVar2;
                u85Var.l = str;
                vmVar2.q(str);
                u85Var.c();
                if (u85Var.j) {
                    u85Var.d.a(ec2Var);
                }
            }
            if (u85Var.f && !z) {
                u85Var.e = false;
            }
        }
        sb sbVar = (sb) this.i;
        if (sbVar != null) {
            sbVar.invalidate();
        }
    }

    public pd(ContextThemeWrapper contextThemeWrapper) {
        this.b = -1;
        this.c = contextThemeWrapper;
        this.d = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
    }
}
