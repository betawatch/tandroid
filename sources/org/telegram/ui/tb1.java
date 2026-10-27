package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class tb1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public int b = 0;
    public final /* synthetic */ vc1 c;

    public /* synthetic */ tb1(vc1 vc1Var, int i10) {
        this.a = i10;
        this.c = vc1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                vc1 vc1Var = this.c;
                vc1Var.G0.setRotation(this.b);
                this.b -= 45;
                vc1Var.G0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.ds.g).start();
                kc1[] kc1VarArr = vc1Var.x0;
                kc1 kc1Var = kc1VarArr[0];
                if (kc1Var != null) {
                    Drawable background = kc1Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.vc0) {
                        ((org.telegram.ui.Components.vc0) background).w(false);
                    } else {
                        org.telegram.ui.ActionBar.w6 w6Var = vc1Var.v;
                        if (vc1Var.b == 2) {
                            vc1Var.i1 += 45;
                            while (true) {
                                int i10 = vc1Var.i1;
                                if (i10 >= 360) {
                                    vc1Var.i1 = i10 - 360;
                                } else {
                                    vc1Var.b1(vc1Var.a1, 0, true);
                                }
                            }
                        } else if (w6Var != null) {
                            w6Var.n += 45;
                            while (true) {
                                int i11 = w6Var.n;
                                if (i11 >= 360) {
                                    w6Var.n = i11 - 360;
                                } else {
                                    org.telegram.ui.ActionBar.y6.q1(false, false);
                                }
                            }
                        }
                    }
                }
                kc1 kc1Var2 = kc1VarArr[1];
                if (kc1Var2 != null) {
                    Drawable background2 = kc1Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.vc0) {
                        ((org.telegram.ui.Components.vc0) background2).w(false);
                        break;
                    }
                }
                break;
            default:
                vc1 vc1Var2 = this.c;
                org.telegram.ui.ActionBar.g6 g6Var = vc1Var2.S;
                vc1Var2.H0.setRotation(this.b);
                this.b -= 45;
                vc1Var2.H0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.ds.g).start();
                org.telegram.ui.ActionBar.w6 w6Var2 = vc1Var2.v;
                if (!w6Var2.i) {
                    int i12 = w6Var2.h;
                    if (i12 != 0) {
                        int i13 = w6Var2.e;
                        if (i13 == 0) {
                            i13 = w6Var2.c;
                        }
                        w6Var2.e = w6Var2.f;
                        w6Var2.f = w6Var2.g;
                        w6Var2.g = i12;
                        w6Var2.h = i13;
                    } else {
                        int i14 = w6Var2.e;
                        if (i14 == 0) {
                            i14 = w6Var2.c;
                        }
                        w6Var2.e = w6Var2.f;
                        w6Var2.f = w6Var2.g;
                        w6Var2.g = i14;
                    }
                    vc1Var2.W.e(w6Var2.h, 3);
                    vc1Var2.W.e(w6Var2.g, 2);
                    vc1Var2.W.e(w6Var2.f, 1);
                    org.telegram.ui.Components.yq yqVar = vc1Var2.W;
                    int i15 = w6Var2.e;
                    if (i15 == 0) {
                        i15 = w6Var2.c;
                    }
                    yqVar.e(i15, 0);
                    vc1Var2.L0[1].b(0, w6Var2.e);
                    vc1Var2.L0[1].b(1, w6Var2.f);
                    vc1Var2.L0[1].b(2, w6Var2.g);
                    vc1Var2.L0[1].b(3, w6Var2.h);
                    org.telegram.ui.ActionBar.y6.q1(true, true);
                    vc1Var2.v0.g1();
                    break;
                } else if (g6Var.i() != null) {
                    g6Var.i().w(false);
                    break;
                }
                break;
        }
    }
}
