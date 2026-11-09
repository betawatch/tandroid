package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class w61 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public int b = 0;
    public final /* synthetic */ w71 c;

    public /* synthetic */ w61(w71 w71Var, int i7) {
        this.a = i7;
        this.c = w71Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                w71 w71Var = this.c;
                w71Var.G0.setRotation(this.b);
                this.b -= 45;
                w71Var.G0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.xq.g).start();
                m71[] m71VarArr = w71Var.x0;
                m71 m71Var = m71VarArr[0];
                if (m71Var != null) {
                    Drawable background = m71Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.ra0) {
                        ((org.telegram.ui.Components.ra0) background).w(false);
                    } else {
                        org.telegram.ui.ActionBar.i6 i6Var = w71Var.w;
                        if (w71Var.b == 2) {
                            w71Var.i1 += 45;
                            while (true) {
                                int i7 = w71Var.i1;
                                if (i7 >= 360) {
                                    w71Var.i1 = i7 - 360;
                                } else {
                                    w71Var.f1(w71Var.a1, 0, true);
                                }
                            }
                        } else if (i6Var != null) {
                            i6Var.n += 45;
                            while (true) {
                                int i10 = i6Var.n;
                                if (i10 >= 360) {
                                    i6Var.n = i10 - 360;
                                } else {
                                    org.telegram.ui.ActionBar.l6.t1(false, false);
                                }
                            }
                        }
                    }
                }
                m71 m71Var2 = m71VarArr[1];
                if (m71Var2 != null) {
                    Drawable background2 = m71Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.ra0) {
                        ((org.telegram.ui.Components.ra0) background2).w(false);
                        break;
                    }
                }
                break;
            default:
                w71 w71Var2 = this.c;
                org.telegram.ui.ActionBar.r5 r5Var = w71Var2.S;
                w71Var2.H0.setRotation(this.b);
                this.b -= 45;
                w71Var2.H0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.xq.g).start();
                org.telegram.ui.ActionBar.i6 i6Var2 = w71Var2.w;
                if (!i6Var2.i) {
                    int i11 = i6Var2.h;
                    if (i11 != 0) {
                        int i12 = i6Var2.e;
                        if (i12 == 0) {
                            i12 = i6Var2.c;
                        }
                        i6Var2.e = i6Var2.f;
                        i6Var2.f = i6Var2.g;
                        i6Var2.g = i11;
                        i6Var2.h = i12;
                    } else {
                        int i13 = i6Var2.e;
                        if (i13 == 0) {
                            i13 = i6Var2.c;
                        }
                        i6Var2.e = i6Var2.f;
                        i6Var2.f = i6Var2.g;
                        i6Var2.g = i13;
                    }
                    w71Var2.W.e(i6Var2.h, 3);
                    w71Var2.W.e(i6Var2.g, 2);
                    w71Var2.W.e(i6Var2.f, 1);
                    org.telegram.ui.Components.vp vpVar = w71Var2.W;
                    int i14 = i6Var2.e;
                    if (i14 == 0) {
                        i14 = i6Var2.c;
                    }
                    vpVar.e(i14, 0);
                    w71Var2.L0[1].b(0, i6Var2.e);
                    w71Var2.L0[1].b(1, i6Var2.f);
                    w71Var2.L0[1].b(2, i6Var2.g);
                    w71Var2.L0[1].b(3, i6Var2.h);
                    org.telegram.ui.ActionBar.l6.t1(true, true);
                    w71Var2.v0.g1();
                    break;
                } else if (r5Var.j() != null) {
                    r5Var.j().w(false);
                    break;
                }
                break;
        }
    }
}
