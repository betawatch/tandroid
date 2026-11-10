package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class x61 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public int b = 0;
    public final /* synthetic */ x71 c;

    public /* synthetic */ x61(x71 x71Var, int i7) {
        this.a = i7;
        this.c = x71Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                x71 x71Var = this.c;
                x71Var.G0.setRotation(this.b);
                this.b -= 45;
                x71Var.G0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.wq.g).start();
                n71[] n71VarArr = x71Var.x0;
                n71 n71Var = n71VarArr[0];
                if (n71Var != null) {
                    Drawable background = n71Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.qa0) {
                        ((org.telegram.ui.Components.qa0) background).w(false);
                    } else {
                        org.telegram.ui.ActionBar.j6 j6Var = x71Var.w;
                        if (x71Var.b == 2) {
                            x71Var.i1 += 45;
                            while (true) {
                                int i7 = x71Var.i1;
                                if (i7 >= 360) {
                                    x71Var.i1 = i7 - 360;
                                } else {
                                    x71Var.f1(x71Var.a1, 0, true);
                                }
                            }
                        } else if (j6Var != null) {
                            j6Var.n += 45;
                            while (true) {
                                int i10 = j6Var.n;
                                if (i10 >= 360) {
                                    j6Var.n = i10 - 360;
                                } else {
                                    org.telegram.ui.ActionBar.m6.t1(false, false);
                                }
                            }
                        }
                    }
                }
                n71 n71Var2 = n71VarArr[1];
                if (n71Var2 != null) {
                    Drawable background2 = n71Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.qa0) {
                        ((org.telegram.ui.Components.qa0) background2).w(false);
                        break;
                    }
                }
                break;
            default:
                x71 x71Var2 = this.c;
                org.telegram.ui.ActionBar.s5 s5Var = x71Var2.S;
                x71Var2.H0.setRotation(this.b);
                this.b -= 45;
                x71Var2.H0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.wq.g).start();
                org.telegram.ui.ActionBar.j6 j6Var2 = x71Var2.w;
                if (!j6Var2.i) {
                    int i11 = j6Var2.h;
                    if (i11 != 0) {
                        int i12 = j6Var2.e;
                        if (i12 == 0) {
                            i12 = j6Var2.c;
                        }
                        j6Var2.e = j6Var2.f;
                        j6Var2.f = j6Var2.g;
                        j6Var2.g = i11;
                        j6Var2.h = i12;
                    } else {
                        int i13 = j6Var2.e;
                        if (i13 == 0) {
                            i13 = j6Var2.c;
                        }
                        j6Var2.e = j6Var2.f;
                        j6Var2.f = j6Var2.g;
                        j6Var2.g = i13;
                    }
                    x71Var2.W.e(j6Var2.h, 3);
                    x71Var2.W.e(j6Var2.g, 2);
                    x71Var2.W.e(j6Var2.f, 1);
                    org.telegram.ui.Components.vp vpVar = x71Var2.W;
                    int i14 = j6Var2.e;
                    if (i14 == 0) {
                        i14 = j6Var2.c;
                    }
                    vpVar.e(i14, 0);
                    x71Var2.L0[1].b(0, j6Var2.e);
                    x71Var2.L0[1].b(1, j6Var2.f);
                    x71Var2.L0[1].b(2, j6Var2.g);
                    x71Var2.L0[1].b(3, j6Var2.h);
                    org.telegram.ui.ActionBar.m6.t1(true, true);
                    x71Var2.v0.g1();
                    break;
                } else if (s5Var.j() != null) {
                    s5Var.j().w(false);
                    break;
                }
                break;
        }
    }
}
