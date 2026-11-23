package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class t61 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public int b = 0;
    public final /* synthetic */ v71 c;

    public /* synthetic */ t61(v71 v71Var, int i7) {
        this.a = i7;
        this.c = v71Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                v71 v71Var = this.c;
                v71Var.H0.setRotation(this.b);
                this.b -= 45;
                v71Var.H0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.kr.g).start();
                l71[] l71VarArr = v71Var.y0;
                l71 l71Var = l71VarArr[0];
                if (l71Var != null) {
                    Drawable background = l71Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.za0) {
                        ((org.telegram.ui.Components.za0) background).w(false);
                    } else {
                        org.telegram.ui.ActionBar.k6 k6Var = v71Var.w;
                        if (v71Var.b == 2) {
                            v71Var.j1 += 45;
                            while (true) {
                                int i7 = v71Var.j1;
                                if (i7 >= 360) {
                                    v71Var.j1 = i7 - 360;
                                } else {
                                    v71Var.f1(v71Var.b1, 0, true);
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
                l71 l71Var2 = l71VarArr[1];
                if (l71Var2 != null) {
                    Drawable background2 = l71Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.za0) {
                        ((org.telegram.ui.Components.za0) background2).w(false);
                        break;
                    }
                }
                break;
            default:
                v71 v71Var2 = this.c;
                org.telegram.ui.ActionBar.s5 s5Var = v71Var2.T;
                v71Var2.I0.setRotation(this.b);
                this.b -= 45;
                v71Var2.I0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.kr.g).start();
                org.telegram.ui.ActionBar.k6 k6Var2 = v71Var2.w;
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
                    v71Var2.X.e(k6Var2.h, 3);
                    v71Var2.X.e(k6Var2.g, 2);
                    v71Var2.X.e(k6Var2.f, 1);
                    org.telegram.ui.Components.jq jqVar = v71Var2.X;
                    int i14 = k6Var2.e;
                    if (i14 == 0) {
                        i14 = k6Var2.c;
                    }
                    jqVar.e(i14, 0);
                    v71Var2.M0[1].b(0, k6Var2.e);
                    v71Var2.M0[1].b(1, k6Var2.f);
                    v71Var2.M0[1].b(2, k6Var2.g);
                    v71Var2.M0[1].b(3, k6Var2.h);
                    org.telegram.ui.ActionBar.n6.t1(true, true);
                    v71Var2.w0.g1();
                    break;
                } else if (s5Var.j() != null) {
                    s5Var.j().w(false);
                    break;
                }
                break;
        }
    }
}
