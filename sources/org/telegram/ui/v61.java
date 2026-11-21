package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
                x71Var.H0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.nr.g).start();
                n71[] n71VarArr = x71Var.y0;
                n71 n71Var = n71VarArr[0];
                if (n71Var != null) {
                    Drawable background = n71Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.cb0) {
                        ((org.telegram.ui.Components.cb0) background).w(false);
                    } else {
                        org.telegram.ui.ActionBar.j6 j6Var = x71Var.w;
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
                    if (background2 instanceof org.telegram.ui.Components.cb0) {
                        ((org.telegram.ui.Components.cb0) background2).w(false);
                        break;
                    }
                }
                break;
            default:
                x71 x71Var2 = this.c;
                org.telegram.ui.ActionBar.r5 r5Var = x71Var2.T;
                x71Var2.I0.setRotation(this.b);
                this.b -= 45;
                x71Var2.I0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.nr.g).start();
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
                    x71Var2.X.e(j6Var2.h, 3);
                    x71Var2.X.e(j6Var2.g, 2);
                    x71Var2.X.e(j6Var2.f, 1);
                    org.telegram.ui.Components.mq mqVar = x71Var2.X;
                    int i14 = j6Var2.e;
                    if (i14 == 0) {
                        i14 = j6Var2.c;
                    }
                    mqVar.e(i14, 0);
                    x71Var2.M0[1].b(0, j6Var2.e);
                    x71Var2.M0[1].b(1, j6Var2.f);
                    x71Var2.M0[1].b(2, j6Var2.g);
                    x71Var2.M0[1].b(3, j6Var2.h);
                    org.telegram.ui.ActionBar.m6.t1(true, true);
                    x71Var2.w0.g1();
                    break;
                } else if (r5Var.j() != null) {
                    r5Var.j().w(false);
                    break;
                }
                break;
        }
    }
}
