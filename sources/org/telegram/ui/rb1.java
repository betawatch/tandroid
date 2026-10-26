package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class rb1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public int b = 0;
    public final /* synthetic */ tc1 c;

    public /* synthetic */ rb1(tc1 tc1Var, int i10) {
        this.a = i10;
        this.c = tc1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                tc1 tc1Var = this.c;
                tc1Var.G0.setRotation(this.b);
                this.b -= 45;
                tc1Var.G0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.ds.g).start();
                ic1[] ic1VarArr = tc1Var.x0;
                ic1 ic1Var = ic1VarArr[0];
                if (ic1Var != null) {
                    Drawable background = ic1Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.uc0) {
                        ((org.telegram.ui.Components.uc0) background).w(false);
                    } else {
                        org.telegram.ui.ActionBar.w6 w6Var = tc1Var.v;
                        if (tc1Var.b == 2) {
                            tc1Var.i1 += 45;
                            while (true) {
                                int i10 = tc1Var.i1;
                                if (i10 >= 360) {
                                    tc1Var.i1 = i10 - 360;
                                } else {
                                    tc1Var.b1(tc1Var.a1, 0, true);
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
                ic1 ic1Var2 = ic1VarArr[1];
                if (ic1Var2 != null) {
                    Drawable background2 = ic1Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.uc0) {
                        ((org.telegram.ui.Components.uc0) background2).w(false);
                        break;
                    }
                }
                break;
            default:
                tc1 tc1Var2 = this.c;
                org.telegram.ui.ActionBar.g6 g6Var = tc1Var2.S;
                tc1Var2.H0.setRotation(this.b);
                this.b -= 45;
                tc1Var2.H0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.ds.g).start();
                org.telegram.ui.ActionBar.w6 w6Var2 = tc1Var2.v;
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
                    tc1Var2.W.e(w6Var2.h, 3);
                    tc1Var2.W.e(w6Var2.g, 2);
                    tc1Var2.W.e(w6Var2.f, 1);
                    org.telegram.ui.Components.yq yqVar = tc1Var2.W;
                    int i15 = w6Var2.e;
                    if (i15 == 0) {
                        i15 = w6Var2.c;
                    }
                    yqVar.e(i15, 0);
                    tc1Var2.L0[1].b(0, w6Var2.e);
                    tc1Var2.L0[1].b(1, w6Var2.f);
                    tc1Var2.L0[1].b(2, w6Var2.g);
                    tc1Var2.L0[1].b(3, w6Var2.h);
                    org.telegram.ui.ActionBar.y6.q1(true, true);
                    tc1Var2.v0.g1();
                    break;
                } else if (g6Var.i() != null) {
                    g6Var.i().w(false);
                    break;
                }
                break;
        }
    }
}
