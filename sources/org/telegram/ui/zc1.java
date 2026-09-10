package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class zc1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public int b = 0;
    public final /* synthetic */ ae1 c;

    public /* synthetic */ zc1(ae1 ae1Var, int i10) {
        this.a = i10;
        this.c = ae1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ae1 ae1Var = this.c;
                ae1Var.F0.setRotation(this.b);
                this.b -= 45;
                ae1Var.F0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.wr.g).start();
                pd1[] pd1VarArr = ae1Var.w0;
                pd1 pd1Var = pd1VarArr[0];
                if (pd1Var != null) {
                    Drawable background = pd1Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.lc0) {
                        ((org.telegram.ui.Components.lc0) background).x(false);
                    } else {
                        org.telegram.ui.ActionBar.h6 h6Var = ae1Var.s;
                        if (ae1Var.b == 2) {
                            ae1Var.h1 += 45;
                            while (true) {
                                int i10 = ae1Var.h1;
                                if (i10 >= 360) {
                                    ae1Var.h1 = i10 - 360;
                                } else {
                                    ae1Var.a1(ae1Var.Z0, 0, true);
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
                pd1 pd1Var2 = pd1VarArr[1];
                if (pd1Var2 != null) {
                    Drawable background2 = pd1Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.lc0) {
                        ((org.telegram.ui.Components.lc0) background2).x(false);
                        break;
                    }
                }
                break;
            default:
                ae1 ae1Var2 = this.c;
                org.telegram.ui.ActionBar.r5 r5Var = ae1Var2.R;
                ae1Var2.G0.setRotation(this.b);
                this.b -= 45;
                ae1Var2.G0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.wr.g).start();
                org.telegram.ui.ActionBar.h6 h6Var2 = ae1Var2.s;
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
                    ae1Var2.V.e(h6Var2.h, 3);
                    ae1Var2.V.e(h6Var2.g, 2);
                    ae1Var2.V.e(h6Var2.f, 1);
                    org.telegram.ui.Components.sq sqVar = ae1Var2.V;
                    int i15 = h6Var2.e;
                    if (i15 == 0) {
                        i15 = h6Var2.c;
                    }
                    sqVar.e(i15, 0);
                    ae1Var2.K0[1].b(0, h6Var2.e);
                    ae1Var2.K0[1].b(1, h6Var2.f);
                    ae1Var2.K0[1].b(2, h6Var2.g);
                    ae1Var2.K0[1].b(3, h6Var2.h);
                    org.telegram.ui.ActionBar.j6.n1(true, true);
                    ae1Var2.u0.e1();
                    break;
                } else if (r5Var.i() != null) {
                    r5Var.i().x(false);
                    break;
                }
                break;
        }
    }
}
