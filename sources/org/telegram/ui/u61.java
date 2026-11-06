package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class u61 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public int b = 0;
    public final /* synthetic */ u71 c;

    public /* synthetic */ u61(u71 u71Var, int i7) {
        this.a = i7;
        this.c = u71Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                u71 u71Var = this.c;
                u71Var.G0.setRotation(this.b);
                this.b -= 45;
                u71Var.G0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.xq.g).start();
                k71[] k71VarArr = u71Var.x0;
                k71 k71Var = k71VarArr[0];
                if (k71Var != null) {
                    Drawable background = k71Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.qa0) {
                        ((org.telegram.ui.Components.qa0) background).w(false);
                    } else {
                        org.telegram.ui.ActionBar.h6 h6Var = u71Var.w;
                        if (u71Var.b == 2) {
                            u71Var.i1 += 45;
                            while (true) {
                                int i7 = u71Var.i1;
                                if (i7 >= 360) {
                                    u71Var.i1 = i7 - 360;
                                } else {
                                    u71Var.f1(u71Var.a1, 0, true);
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
                k71 k71Var2 = k71VarArr[1];
                if (k71Var2 != null) {
                    Drawable background2 = k71Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.qa0) {
                        ((org.telegram.ui.Components.qa0) background2).w(false);
                        break;
                    }
                }
                break;
            default:
                u71 u71Var2 = this.c;
                org.telegram.ui.ActionBar.q5 q5Var = u71Var2.S;
                u71Var2.H0.setRotation(this.b);
                this.b -= 45;
                u71Var2.H0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.xq.g).start();
                org.telegram.ui.ActionBar.h6 h6Var2 = u71Var2.w;
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
                    u71Var2.W.e(h6Var2.h, 3);
                    u71Var2.W.e(h6Var2.g, 2);
                    u71Var2.W.e(h6Var2.f, 1);
                    org.telegram.ui.Components.vp vpVar = u71Var2.W;
                    int i14 = h6Var2.e;
                    if (i14 == 0) {
                        i14 = h6Var2.c;
                    }
                    vpVar.e(i14, 0);
                    u71Var2.L0[1].b(0, h6Var2.e);
                    u71Var2.L0[1].b(1, h6Var2.f);
                    u71Var2.L0[1].b(2, h6Var2.g);
                    u71Var2.L0[1].b(3, h6Var2.h);
                    org.telegram.ui.ActionBar.k6.t1(true, true);
                    u71Var2.v0.g1();
                    break;
                } else if (q5Var.k() != null) {
                    q5Var.k().w(false);
                    break;
                }
                break;
        }
    }
}
