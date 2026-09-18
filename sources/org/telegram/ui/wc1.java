package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                xd1Var.F0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.qr.g).start();
                md1[] md1VarArr = xd1Var.w0;
                md1 md1Var = md1VarArr[0];
                if (md1Var != null) {
                    Drawable background = md1Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.cc0) {
                        ((org.telegram.ui.Components.cc0) background).x(false);
                    } else {
                        org.telegram.ui.ActionBar.h6 h6Var = xd1Var.s;
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
                md1 md1Var2 = md1VarArr[1];
                if (md1Var2 != null) {
                    Drawable background2 = md1Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.cc0) {
                        ((org.telegram.ui.Components.cc0) background2).x(false);
                        break;
                    }
                }
                break;
            default:
                xd1 xd1Var2 = this.c;
                org.telegram.ui.ActionBar.r5 r5Var = xd1Var2.R;
                xd1Var2.G0.setRotation(this.b);
                this.b -= 45;
                xd1Var2.G0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.qr.g).start();
                org.telegram.ui.ActionBar.h6 h6Var2 = xd1Var2.s;
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
                    xd1Var2.V.e(h6Var2.h, 3);
                    xd1Var2.V.e(h6Var2.g, 2);
                    xd1Var2.V.e(h6Var2.f, 1);
                    org.telegram.ui.Components.mq mqVar = xd1Var2.V;
                    int i15 = h6Var2.e;
                    if (i15 == 0) {
                        i15 = h6Var2.c;
                    }
                    mqVar.e(i15, 0);
                    xd1Var2.K0[1].b(0, h6Var2.e);
                    xd1Var2.K0[1].b(1, h6Var2.f);
                    xd1Var2.K0[1].b(2, h6Var2.g);
                    xd1Var2.K0[1].b(3, h6Var2.h);
                    org.telegram.ui.ActionBar.j6.n1(true, true);
                    xd1Var2.u0.g1();
                    break;
                } else if (r5Var.i() != null) {
                    r5Var.i().x(false);
                    break;
                }
                break;
        }
    }
}
