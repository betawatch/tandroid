package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class r61 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public int b = 0;
    public final /* synthetic */ t71 c;

    public /* synthetic */ r61(t71 t71Var, int i7) {
        this.a = i7;
        this.c = t71Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                t71 t71Var = this.c;
                t71Var.H0.setRotation(this.b);
                this.b -= 45;
                t71Var.H0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.er.g).start();
                j71[] j71VarArr = t71Var.y0;
                j71 j71Var = j71VarArr[0];
                if (j71Var != null) {
                    Drawable background = j71Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.ra0) {
                        ((org.telegram.ui.Components.ra0) background).w(false);
                    } else {
                        org.telegram.ui.ActionBar.g6 g6Var = t71Var.w;
                        if (t71Var.b == 2) {
                            t71Var.j1 += 45;
                            while (true) {
                                int i7 = t71Var.j1;
                                if (i7 >= 360) {
                                    t71Var.j1 = i7 - 360;
                                } else {
                                    t71Var.f1(t71Var.b1, 0, true);
                                }
                            }
                        } else if (g6Var != null) {
                            g6Var.n += 45;
                            while (true) {
                                int i10 = g6Var.n;
                                if (i10 >= 360) {
                                    g6Var.n = i10 - 360;
                                } else {
                                    org.telegram.ui.ActionBar.j6.t1(false, false);
                                }
                            }
                        }
                    }
                }
                j71 j71Var2 = j71VarArr[1];
                if (j71Var2 != null) {
                    Drawable background2 = j71Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.ra0) {
                        ((org.telegram.ui.Components.ra0) background2).w(false);
                        break;
                    }
                }
                break;
            default:
                t71 t71Var2 = this.c;
                org.telegram.ui.ActionBar.p5 p5Var = t71Var2.T;
                t71Var2.I0.setRotation(this.b);
                this.b -= 45;
                t71Var2.I0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.er.g).start();
                org.telegram.ui.ActionBar.g6 g6Var2 = t71Var2.w;
                if (!g6Var2.i) {
                    int i11 = g6Var2.h;
                    if (i11 != 0) {
                        int i12 = g6Var2.e;
                        if (i12 == 0) {
                            i12 = g6Var2.c;
                        }
                        g6Var2.e = g6Var2.f;
                        g6Var2.f = g6Var2.g;
                        g6Var2.g = i11;
                        g6Var2.h = i12;
                    } else {
                        int i13 = g6Var2.e;
                        if (i13 == 0) {
                            i13 = g6Var2.c;
                        }
                        g6Var2.e = g6Var2.f;
                        g6Var2.f = g6Var2.g;
                        g6Var2.g = i13;
                    }
                    t71Var2.X.e(g6Var2.h, 3);
                    t71Var2.X.e(g6Var2.g, 2);
                    t71Var2.X.e(g6Var2.f, 1);
                    org.telegram.ui.Components.dq dqVar = t71Var2.X;
                    int i14 = g6Var2.e;
                    if (i14 == 0) {
                        i14 = g6Var2.c;
                    }
                    dqVar.e(i14, 0);
                    t71Var2.M0[1].b(0, g6Var2.e);
                    t71Var2.M0[1].b(1, g6Var2.f);
                    t71Var2.M0[1].b(2, g6Var2.g);
                    t71Var2.M0[1].b(3, g6Var2.h);
                    org.telegram.ui.ActionBar.j6.t1(true, true);
                    t71Var2.w0.g1();
                    break;
                } else if (p5Var.j() != null) {
                    p5Var.j().w(false);
                    break;
                }
                break;
        }
    }
}
