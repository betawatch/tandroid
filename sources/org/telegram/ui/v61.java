package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class v61 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public int b = 0;
    public final /* synthetic */ x71 c;

    public /* synthetic */ v61(x71 x71Var, int i7) {
        this.a = i7;
        this.c = x71Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                x71 x71Var = this.c;
                x71Var.H0.setRotation(this.b);
                this.b -= 45;
                x71Var.H0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.lr.g).start();
                n71[] n71VarArr = x71Var.y0;
                n71 n71Var = n71VarArr[0];
                if (n71Var != null) {
                    Drawable background = n71Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.bb0) {
                        ((org.telegram.ui.Components.bb0) background).w(false);
                    } else {
                        org.telegram.ui.ActionBar.k6 k6Var = x71Var.w;
                        if (x71Var.b == 2) {
                            x71Var.j1 += 45;
                            while (true) {
                                int i7 = x71Var.j1;
                                if (i7 >= 360) {
                                    x71Var.j1 = i7 - 360;
                                } else {
                                    x71Var.f1(x71Var.b1, 0, true);
                                }
                            }
                        } else if (k6Var != null) {
                            k6Var.n += 45;
                            while (true) {
                                int i10 = k6Var.n;
                                if (i10 >= 360) {
                                    k6Var.n = i10 - 360;
                                } else {
                                    org.telegram.ui.ActionBar.n6.t1(false, false);
                                }
                            }
                        }
                    }
                }
                n71 n71Var2 = n71VarArr[1];
                if (n71Var2 != null) {
                    Drawable background2 = n71Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.bb0) {
                        ((org.telegram.ui.Components.bb0) background2).w(false);
                        break;
                    }
                }
                break;
            default:
                x71 x71Var2 = this.c;
                org.telegram.ui.ActionBar.s5 s5Var = x71Var2.T;
                x71Var2.I0.setRotation(this.b);
                this.b -= 45;
                x71Var2.I0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.lr.g).start();
                org.telegram.ui.ActionBar.k6 k6Var2 = x71Var2.w;
                if (!k6Var2.i) {
                    int i11 = k6Var2.h;
                    if (i11 != 0) {
                        int i12 = k6Var2.e;
                        if (i12 == 0) {
                            i12 = k6Var2.c;
                        }
                        k6Var2.e = k6Var2.f;
                        k6Var2.f = k6Var2.g;
                        k6Var2.g = i11;
                        k6Var2.h = i12;
                    } else {
                        int i13 = k6Var2.e;
                        if (i13 == 0) {
                            i13 = k6Var2.c;
                        }
                        k6Var2.e = k6Var2.f;
                        k6Var2.f = k6Var2.g;
                        k6Var2.g = i13;
                    }
                    x71Var2.X.e(k6Var2.h, 3);
                    x71Var2.X.e(k6Var2.g, 2);
                    x71Var2.X.e(k6Var2.f, 1);
                    org.telegram.ui.Components.kq kqVar = x71Var2.X;
                    int i14 = k6Var2.e;
                    if (i14 == 0) {
                        i14 = k6Var2.c;
                    }
                    kqVar.e(i14, 0);
                    x71Var2.M0[1].b(0, k6Var2.e);
                    x71Var2.M0[1].b(1, k6Var2.f);
                    x71Var2.M0[1].b(2, k6Var2.g);
                    x71Var2.M0[1].b(3, k6Var2.h);
                    org.telegram.ui.ActionBar.n6.t1(true, true);
                    x71Var2.w0.g1();
                    break;
                } else if (s5Var.j() != null) {
                    s5Var.j().w(false);
                    break;
                }
                break;
        }
    }
}
