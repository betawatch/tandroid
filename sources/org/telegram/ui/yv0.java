package org.telegram.ui;

import android.animation.ObjectAnimator;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.CheckBoxBase;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class yv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yv0(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CheckBoxBase checkBoxBase;
        CheckBoxBase[] checkBoxBaseArr;
        CheckBoxBase checkBoxBase2;
        int i10 = this.a;
        int i11 = 1;
        boolean z10 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                RectF rectF = ProfileActivity.R6;
                ((ProfileActivity) obj).C5(z10, true);
                break;
            case 1:
                ((FrameLayout) obj).setVisibility(z10 ? 4 : 0);
                break;
            case 2:
                gf.f.r(((xx0) obj).e.getParentActivity(), org.telegram.messenger.cd.L0(z10 ? 2131746719 : 2131746721, null));
                break;
            case 3:
                x91 x91Var = (x91) obj;
                org.telegram.messenger.i0.g3(new q91(x91Var, i11));
                org.telegram.ui.Cells.q1 q1Var = x91Var.K;
                if (q1Var != null) {
                    q1Var.setVisibility(0);
                    if (!z10) {
                        org.telegram.ui.Cells.q1 q1Var2 = x91Var.K;
                        int Z1 = q1Var2.Z1(x91Var.O);
                        v91 v91Var = x91Var.I;
                        CheckBoxBase[] checkBoxBaseArr2 = q1Var2.d7;
                        if (checkBoxBaseArr2 != null && Z1 >= 0 && Z1 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[Z1]) != null && v91Var != null && (checkBoxBaseArr = v91Var.d7) != null && Z1 >= 0 && Z1 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[Z1]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.q, true);
                        }
                    }
                    org.telegram.ui.Cells.q1 q1Var3 = x91Var.K;
                    q1Var3.a6 = -1;
                    q1Var3.invalidate();
                }
                pm pmVar = x91Var.c0;
                if (pmVar != null) {
                    org.telegram.messenger.i0.g3(pmVar);
                    x91Var.c0 = null;
                    break;
                }
                break;
            case 4:
                ((View) obj).setVisibility(z10 ? 0 : 8);
                break;
            case 5:
                rh.t0 t0Var = (rh.t0) obj;
                if (!z10) {
                    t0Var.i2.setVisibility(8);
                    break;
                } else {
                    t0Var.getClass();
                    break;
                }
            case 6:
                rh.e4 e4Var = (rh.e4) obj;
                e4Var.getClass();
                e4Var.p2(e4Var.b3, org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, z10 ? 2131750433 : 2131750430, e4Var.z1())), true);
                break;
            case 7:
                rh.e4 e4Var2 = ((rh.l2) obj).V;
                TL_stars.SavedStarGift E1 = e4Var2.E1(z10);
                if (E1 != null) {
                    e4Var2.W2 = true;
                    e4Var2.j2(E1, e4Var2.y2);
                } else {
                    TL_stars.TL_starGiftUnique F1 = e4Var2.F1(z10);
                    if (F1 != null) {
                        e4Var2.W2 = true;
                        e4Var2.h2(F1.slug, F1, e4Var2.y2);
                    }
                }
                e4Var2.M2 = -1;
                org.telegram.ui.Components.wb wbVar = org.telegram.ui.Components.wb.w;
                if (wbVar != null) {
                    wbVar.c(0L, false);
                    break;
                }
                break;
            case 8:
                sg.k kVar = (sg.k) obj;
                if (!z10) {
                    kVar.getClass();
                    break;
                } else {
                    ((sg.o) kVar.x.c).w.setVisibility(4);
                    break;
                }
            case 9:
                uh.i iVar = (uh.i) obj;
                org.telegram.ui.Components.uq0 uq0Var = iVar.W;
                if (!z10) {
                    uq0Var.b(iVar.a.E);
                    break;
                } else {
                    new uh.l(uq0Var.a, org.telegram.messenger.cd.L0(2131746708, null), new ph.h1(uq0Var, 18)).show();
                    break;
                }
            case 10:
                vh.h2 h2Var = (vh.h2) obj;
                if (!z10) {
                    h2Var.I.setVisibility(8);
                    break;
                } else {
                    h2Var.getClass();
                    break;
                }
            case 11:
                ((vh.s2) obj).b.setVisibility(z10 ? 0 : 8);
                break;
            case 12:
                vh.b4 b4Var = (vh.b4) obj;
                if (!z10) {
                    b4Var.G0.setVisibility(8);
                    break;
                } else {
                    b4Var.getClass();
                    break;
                }
            case 13:
                vh.g5 g5Var = (vh.g5) obj;
                if (!z10) {
                    g5Var.setVisibility(8);
                    break;
                } else {
                    g5Var.getClass();
                    break;
                }
            case 14:
                vh.s7 s7Var = (vh.s7) obj;
                if (!z10) {
                    s7Var.j2.j1.setVisibility(8);
                    break;
                } else {
                    s7Var.getClass();
                    break;
                }
            case 15:
                xh.m2 m2Var = (xh.m2) obj;
                xh.k2 k2Var = m2Var.E;
                xh.e2 e2Var = m2Var.D;
                if (e2Var.getWebView() != null) {
                    e2Var.getWebView().animate().cancel();
                    e2Var.getWebView().animate().alpha(0.0f).start();
                }
                k2Var.setLoadProgress(0.0f);
                k2Var.setAlpha(1.0f);
                k2Var.setVisibility(0);
                e2Var.setBotUser(z10 ? null : org.telegram.messenger.vp.r1(m2Var.H).Z1(Long.valueOf(m2Var.I)));
                if (!z10) {
                    e2Var.s(m2Var.H, m2Var.I);
                }
                org.telegram.messenger.zs.f(e2Var.M).d(new org.telegram.ui.web.q(e2Var, i11));
                break;
            default:
                ((yh.e0) obj).f(z10, false);
                break;
        }
    }
}
