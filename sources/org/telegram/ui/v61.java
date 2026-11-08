package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class v61 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public int b = 0;
    public final /* synthetic */ v71 c;

    public /* synthetic */ v61(v71 v71Var, int i7) {
        this.a = i7;
        this.c = v71Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                v71 v71Var = this.c;
                v71Var.G0.setRotation(this.b);
                this.b -= 45;
                v71Var.G0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.xq.g).start();
                l71[] l71VarArr = v71Var.x0;
                l71 l71Var = l71VarArr[0];
                if (l71Var != null) {
                    Drawable background = l71Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.qa0) {
                        ((org.telegram.ui.Components.qa0) background).w(false);
                    } else {
                        org.telegram.ui.ActionBar.h6 h6Var = v71Var.w;
                        if (v71Var.b == 2) {
                            v71Var.i1 += 45;
                            while (true) {
                                int i7 = v71Var.i1;
                                if (i7 >= 360) {
                                    v71Var.i1 = i7 - 360;
                                } else {
                                    v71Var.f1(v71Var.a1, 0, true);
                                }
                            }
                        } else if (h6Var != null) {
                            h6Var.n += 45;
                            while (true) {
                                int i10 = h6Var.n;
                                if (i10 >= 360) {
                                    h6Var.n = i10 - 360;
                                } else {
                                    org.telegram.ui.ActionBar.k6.t1(false, false);
                                }
                            }
                        }
                    }
                }
                l71 l71Var2 = l71VarArr[1];
                if (l71Var2 != null) {
                    Drawable background2 = l71Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.qa0) {
                        ((org.telegram.ui.Components.qa0) background2).w(false);
                        break;
                    }
                }
                break;
            default:
                v71 v71Var2 = this.c;
                org.telegram.ui.ActionBar.q5 q5Var = v71Var2.S;
                v71Var2.H0.setRotation(this.b);
                this.b -= 45;
                v71Var2.H0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.xq.g).start();
                org.telegram.ui.ActionBar.h6 h6Var2 = v71Var2.w;
                if (!h6Var2.i) {
                    int i11 = h6Var2.h;
                    if (i11 != 0) {
                        int i12 = h6Var2.e;
                        if (i12 == 0) {
                            i12 = h6Var2.c;
                        }
                        h6Var2.e = h6Var2.f;
                        h6Var2.f = h6Var2.g;
                        h6Var2.g = i11;
                        h6Var2.h = i12;
                    } else {
                        int i13 = h6Var2.e;
                        if (i13 == 0) {
                            i13 = h6Var2.c;
                        }
                        h6Var2.e = h6Var2.f;
                        h6Var2.f = h6Var2.g;
                        h6Var2.g = i13;
                    }
                    v71Var2.W.e(h6Var2.h, 3);
                    v71Var2.W.e(h6Var2.g, 2);
                    v71Var2.W.e(h6Var2.f, 1);
                    org.telegram.ui.Components.vp vpVar = v71Var2.W;
                    int i14 = h6Var2.e;
                    if (i14 == 0) {
                        i14 = h6Var2.c;
                    }
                    vpVar.e(i14, 0);
                    v71Var2.L0[1].b(0, h6Var2.e);
                    v71Var2.L0[1].b(1, h6Var2.f);
                    v71Var2.L0[1].b(2, h6Var2.g);
                    v71Var2.L0[1].b(3, h6Var2.h);
                    org.telegram.ui.ActionBar.k6.t1(true, true);
                    v71Var2.v0.g1();
                    break;
                } else if (q5Var.j() != null) {
                    q5Var.j().w(false);
                    break;
                }
                break;
        }
    }
}
