// default package

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class sc2 {
    public final rc2 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int f = 0;
    public ArrayList g;
    public boolean h;

    public sc2(rc2 rc2Var) {
        this.a = rc2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        int i;
        boolean z;
        rc2 rc2Var = this.a;
        rc2Var.A0(0);
        if (this.b) {
            boolean z2 = this.d;
            if (this.c) {
                boolean z3 = (z2 ? 1 : 0) | 2;
                i = (z2 ? 1 : 0) + 1;
                z = z3;
            } else {
                i = z2 ? 1 : 0;
                z = z2;
            }
            boolean z4 = z;
            if (this.e) {
                i++;
                z4 = (z ? 1 : 0) | 4;
            }
            if (i == 0) {
                this.g = null;
                this.f = 0;
                return;
            }
            rc2Var.v0 = gm.L(60.0f) + rc2Var.v0;
            if (z4 != this.f) {
                this.f = 0;
                int D = wi8.D(75.0f, rc2Var.b7, i);
                float N = (rc2Var.b7 - gm.N(37.0f)) / i;
                ArrayList arrayList = this.g;
                if (arrayList == null) {
                    this.g = new ArrayList(i);
                } else {
                    arrayList.clear();
                }
                if (this.d) {
                    this.f |= 1;
                    this.g.add(rc2.w0(5, jb6.M0(2131743240, "ViewContact"), D, N));
                }
                if (this.c) {
                    this.f |= 2;
                    this.g.add(rc2.w0(30, jb6.M0(2131745151, "SharedContactMessage"), D, N));
                }
                if (this.e) {
                    this.f |= 4;
                    this.g.add(rc2.w0(31, jb6.M0(2131745152, "SharedContactAdd"), D, N));
                }
            }
        }
    }

    public final void b(Canvas canvas) {
        float f;
        boolean z;
        boolean z2;
        float f2;
        u51 u51Var;
        rc2 rc2Var = this.a;
        Drawable[] drawableArr = rc2Var.J2;
        mm mmVar = rc2Var.U0;
        p99 p99Var = rc2Var.q8;
        if (p99Var == null) {
            p99Var = new p99(rc2Var);
            rc2Var.q8 = p99Var;
        }
        int a = p99Var.a(rc2Var.Q5, rc2Var.va, rc2Var.wa, rc2Var.cc, 4);
        if (rc2Var.Sa == null) {
            rc2Var.Sa = new u51(rc2Var, 2.0f, 2.0f);
        }
        int L = (int) (mmVar.L0 - gm.L(13.0f));
        int L2 = rc2Var.e7 - gm.L(62.0f);
        l39 l39Var = rc2Var.O;
        if (!l39Var.p) {
            L2 -= l39Var.n;
        }
        if (rc2Var.x7) {
            L2 -= gm.L(rc2Var.I3() ? 39.3f : 41.0f);
        }
        int i = L2;
        if (rc2Var.v2 == null) {
            rc2Var.v2 = new RectF();
        }
        float backgroundDrawableRight = (rc2Var.getBackgroundDrawableRight() - (gm.L(10.0f) + ((!rc2Var.Q5.O3() || rc2Var.C6 || rc2Var.K) ? 0 : gm.L(6.0f)))) - rc2Var.getExtraTextX();
        yc2 yc2Var = rc2Var.ub;
        if (yc2Var.x0) {
            backgroundDrawableRight += yc2Var.i0;
        }
        rc2Var.v2.set(L, mmVar.M0 - gm.L(9.0f), backgroundDrawableRight, gm.L(38.0f) + i);
        float a2 = rc2Var.Sa.a(0.0125f);
        boolean z3 = a2 != 1.0f;
        if (z3) {
            canvas.save();
            canvas.scale(a2, a2, rc2Var.v2.centerX(), rc2Var.v2.centerY());
        }
        Drawable drawable = drawableArr[0];
        if (drawable != null) {
            rc2Var.L2[0] = 0;
            f = 2.0f;
            drawable.setBounds(L, (int) (mmVar.M0 - gm.L(9.0f)), (int) backgroundDrawableRight, gm.L(38.0f) + i);
            if (rc2Var.I2 != cmb.p1(0.1f, rc2Var.q8.h())) {
                Drawable drawable2 = drawableArr[0];
                int p1 = cmb.p1(0.1f, rc2Var.q8.h());
                rc2Var.I2 = p1;
                cmb.F1(drawable2, p1, true);
            }
            drawableArr[0].draw(canvas);
        } else {
            f = 2.0f;
        }
        float floor = (float) Math.floor(gda.U0 / 3.0f);
        int i2 = (int) floor;
        float f3 = 1.0f;
        rc2Var.q8.c(floor, floor, floor, 1.0f, canvas, rc2Var.v2);
        rc2Var.q8.f(canvas, rc2Var.v2, 1.0f);
        cmb.Q2.setColor(a);
        cmb.R2.setColor(cmb.v0(cmb.Wd, rc2Var.cc));
        if (rc2Var.Q5.O3()) {
            cmb.R2.setColor(cmb.v0(cmb.Vc, rc2Var.cc));
        } else {
            cmb.R2.setColor(cmb.v0(cmb.Uc, rc2Var.cc));
        }
        if (rc2Var.o2 != null) {
            canvas.save();
            canvas.translate(mmVar.L0 + mmVar.N0 + gm.L(9.0f), gm.L(27.0f) + rc2Var.gb);
            rna.f(canvas, rc2Var.o2);
            canvas.restore();
        }
        if (rc2Var.e3 != null) {
            canvas.save();
            canvas.translate(mmVar.L0 + mmVar.N0 + gm.L(9.0f), gm.L(50.0f) + rc2Var.gb);
            rna.f(canvas, rc2Var.e3);
            canvas.restore();
        }
        ArrayList arrayList = this.g;
        if (arrayList != null && arrayList.size() > 0) {
            cmb.L2.setColor(a);
            cmb.X1.setColor(cmb.p1(0.1f, a));
            int alpha = cmb.L2.getAlpha();
            cmb.L2.setAlpha((int) (alpha * 0.18f));
            canvas.drawRect(rc2Var.v2.left + gm.L(10.0f), gm.L(f) + i, rc2Var.v2.right - gm.L(7.0f), Math.max(1, gm.L(0.66f)) + gm.L(f) + i, cmb.L2);
            cmb.L2.setAlpha(alpha);
            int L3 = gm.L(f) + i;
            float L4 = gm.L(3.0f) + L;
            ArrayList arrayList2 = this.g;
            boolean z4 = arrayList2 != null && arrayList2.size() > 1;
            int i3 = rc2Var.q8.x;
            int i4 = 0;
            while (i4 < this.g.size()) {
                oc2 oc2Var = (oc2) this.g.get(i4);
                float f4 = oc2Var.b;
                RectF rectF = oc2Var.e;
                float min = Math.min(f4 + L4, rc2Var.v2.right);
                rectF.set(L4, L3, min, gm.L(36.0f) + L3);
                if (z4 && oc2Var.g == null) {
                    rc2Var.db = i3;
                    z = false;
                    fg0 a0 = cmb.a0(i3, 0, 0, i4 == this.g.size() - 1 ? i2 : 0, 0);
                    oc2Var.g = a0;
                    a0.setCallback(rc2Var);
                } else {
                    z = false;
                }
                fg0 fg0Var = oc2Var.g;
                float f5 = f3;
                if (fg0Var != null) {
                    fg0Var.setBounds((int) L4, L3, (int) min, gm.L(36.0f) + L3);
                    oc2Var.g.draw(canvas);
                }
                if (z3 || (u51Var = oc2Var.f) == null) {
                    z2 = z;
                    f2 = f5;
                } else {
                    f2 = u51Var.a(0.02f);
                    z2 = f2 != f5 ? true : z;
                }
                if (z2) {
                    canvas.save();
                    canvas.scale(f2, f2, rectF.centerX(), rectF.centerY());
                }
                if (oc2Var.d != null) {
                    canvas.save();
                    canvas.translate(oc2Var.c + L4, gm.L(10.5f) + L3);
                    oc2Var.d.draw(canvas);
                    canvas.restore();
                }
                if (z2) {
                    canvas.restore();
                }
                L4 += oc2Var.b;
                i4++;
                f3 = f5;
            }
        }
        if (z3) {
            canvas.restore();
        }
    }
}
