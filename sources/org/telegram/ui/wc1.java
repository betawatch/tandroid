package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class wc1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public int b = 0;
    public final /* synthetic */ xd1 c;

    public /* synthetic */ wc1(xd1 xd1Var, int i10) {
        this.a = i10;
        this.c = xd1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                xd1 xd1Var = this.c;
                xd1Var.F0.setRotation(this.b);
                this.b -= 45;
                xd1Var.F0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.hs.g).start();
                md1[] md1VarArr = xd1Var.w0;
                md1 md1Var = md1VarArr[0];
                if (md1Var != null) {
                    Drawable background = md1Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.cd0) {
                        ((org.telegram.ui.Components.cd0) background).x(false);
                    } else {
                        org.telegram.ui.ActionBar.g6 g6Var = xd1Var.s;
                        if (xd1Var.b == 2) {
                            xd1Var.h1 += 45;
                            while (true) {
                                int i10 = xd1Var.h1;
                                if (i10 >= 360) {
                                    xd1Var.h1 = i10 - 360;
                                } else {
                                    xd1Var.a1(xd1Var.Z0, 0, true);
                                }
                            }
                        } else if (g6Var != null) {
                            g6Var.n += 45;
                            while (true) {
                                int i11 = g6Var.n;
                                if (i11 >= 360) {
                                    g6Var.n = i11 - 360;
                                } else {
                                    org.telegram.ui.ActionBar.i6.o1(false, false);
                                }
                            }
                        }
                    }
                }
                md1 md1Var2 = md1VarArr[1];
                if (md1Var2 != null) {
                    Drawable background2 = md1Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.cd0) {
                        ((org.telegram.ui.Components.cd0) background2).x(false);
                        break;
                    }
                }
                break;
            default:
                xd1 xd1Var2 = this.c;
                org.telegram.ui.ActionBar.q5 q5Var = xd1Var2.R;
                xd1Var2.G0.setRotation(this.b);
                this.b -= 45;
                xd1Var2.G0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.hs.g).start();
                org.telegram.ui.ActionBar.g6 g6Var2 = xd1Var2.s;
                if (!g6Var2.i) {
                    int i12 = g6Var2.h;
                    if (i12 != 0) {
                        int i13 = g6Var2.e;
                        if (i13 == 0) {
                            i13 = g6Var2.c;
                        }
                        g6Var2.e = g6Var2.f;
                        g6Var2.f = g6Var2.g;
                        g6Var2.g = i12;
                        g6Var2.h = i13;
                    } else {
                        int i14 = g6Var2.e;
                        if (i14 == 0) {
                            i14 = g6Var2.c;
                        }
                        g6Var2.e = g6Var2.f;
                        g6Var2.f = g6Var2.g;
                        g6Var2.g = i14;
                    }
                    xd1Var2.V.e(g6Var2.h, 3);
                    xd1Var2.V.e(g6Var2.g, 2);
                    xd1Var2.V.e(g6Var2.f, 1);
                    org.telegram.ui.Components.cr crVar = xd1Var2.V;
                    int i15 = g6Var2.e;
                    if (i15 == 0) {
                        i15 = g6Var2.c;
                    }
                    crVar.e(i15, 0);
                    xd1Var2.K0[1].b(0, g6Var2.e);
                    xd1Var2.K0[1].b(1, g6Var2.f);
                    xd1Var2.K0[1].b(2, g6Var2.g);
                    xd1Var2.K0[1].b(3, g6Var2.h);
                    org.telegram.ui.ActionBar.i6.o1(true, true);
                    xd1Var2.u0.f1();
                    break;
                } else if (q5Var.i() != null) {
                    q5Var.i().x(false);
                    break;
                }
                break;
        }
    }
}
