package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class vc1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public int b = 0;
    public final /* synthetic */ wd1 c;

    public /* synthetic */ vc1(wd1 wd1Var, int i10) {
        this.a = i10;
        this.c = wd1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                wd1 wd1Var = this.c;
                wd1Var.F0.setRotation(this.b);
                this.b -= 45;
                wd1Var.F0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.pr.g).start();
                ld1[] ld1VarArr = wd1Var.w0;
                ld1 ld1Var = ld1VarArr[0];
                if (ld1Var != null) {
                    Drawable background = ld1Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.dc0) {
                        ((org.telegram.ui.Components.dc0) background).x(false);
                    } else {
                        org.telegram.ui.ActionBar.h6 h6Var = wd1Var.s;
                        if (wd1Var.b == 2) {
                            wd1Var.h1 += 45;
                            while (true) {
                                int i10 = wd1Var.h1;
                                if (i10 >= 360) {
                                    wd1Var.h1 = i10 - 360;
                                } else {
                                    wd1Var.a1(wd1Var.Z0, 0, true);
                                }
                            }
                        } else if (h6Var != null) {
                            h6Var.n += 45;
                            while (true) {
                                int i11 = h6Var.n;
                                if (i11 >= 360) {
                                    h6Var.n = i11 - 360;
                                } else {
                                    org.telegram.ui.ActionBar.j6.n1(false, false);
                                }
                            }
                        }
                    }
                }
                ld1 ld1Var2 = ld1VarArr[1];
                if (ld1Var2 != null) {
                    Drawable background2 = ld1Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.dc0) {
                        ((org.telegram.ui.Components.dc0) background2).x(false);
                        break;
                    }
                }
                break;
            default:
                wd1 wd1Var2 = this.c;
                org.telegram.ui.ActionBar.q5 q5Var = wd1Var2.R;
                wd1Var2.G0.setRotation(this.b);
                this.b -= 45;
                wd1Var2.G0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.pr.g).start();
                org.telegram.ui.ActionBar.h6 h6Var2 = wd1Var2.s;
                if (!h6Var2.i) {
                    int i12 = h6Var2.h;
                    if (i12 != 0) {
                        int i13 = h6Var2.e;
                        if (i13 == 0) {
                            i13 = h6Var2.c;
                        }
                        h6Var2.e = h6Var2.f;
                        h6Var2.f = h6Var2.g;
                        h6Var2.g = i12;
                        h6Var2.h = i13;
                    } else {
                        int i14 = h6Var2.e;
                        if (i14 == 0) {
                            i14 = h6Var2.c;
                        }
                        h6Var2.e = h6Var2.f;
                        h6Var2.f = h6Var2.g;
                        h6Var2.g = i14;
                    }
                    wd1Var2.V.e(h6Var2.h, 3);
                    wd1Var2.V.e(h6Var2.g, 2);
                    wd1Var2.V.e(h6Var2.f, 1);
                    org.telegram.ui.Components.lq lqVar = wd1Var2.V;
                    int i15 = h6Var2.e;
                    if (i15 == 0) {
                        i15 = h6Var2.c;
                    }
                    lqVar.e(i15, 0);
                    wd1Var2.K0[1].b(0, h6Var2.e);
                    wd1Var2.K0[1].b(1, h6Var2.f);
                    wd1Var2.K0[1].b(2, h6Var2.g);
                    wd1Var2.K0[1].b(3, h6Var2.h);
                    org.telegram.ui.ActionBar.j6.n1(true, true);
                    wd1Var2.u0.e1();
                    break;
                } else if (q5Var.i() != null) {
                    q5Var.i().x(false);
                    break;
                }
                break;
        }
    }
}
