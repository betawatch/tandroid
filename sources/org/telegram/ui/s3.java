package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s3 implements org.telegram.messenger.u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s3(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        int i3 = this.a;
        int i10 = 2;
        Object obj2 = this.b;
        switch (i3) {
            case 0:
                ((u3) obj2).L.p0 = ((Integer) obj).intValue() - org.telegram.messenger.g0.n > org.telegram.messenger.g0.L(20.0f);
                break;
            case 1:
                org.telegram.messenger.g0.h3(new org.telegram.messenger.voip.l0(26, (rb) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new sc(i10, (xd) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 3:
                ((hp) obj2).e.T = (String) obj;
                break;
            case 4:
                nq nqVar = ((iq) obj2).d;
                nqVar.A1 = ((Integer) obj).intValue();
                org.telegram.messenger.g0.a4(nqVar.r0, nqVar.c);
                break;
            case 5:
                lr.Z((lr) obj2, (TL_account.TL_birthday) obj);
                break;
            case 6:
                kx kxVar = (kx) obj2;
                int intValue = ((Integer) obj).intValue();
                if (intValue != (kxVar.e ? 2 : kxVar.d ? 0 : 1)) {
                    kxVar.d = intValue == 0;
                    kxVar.e = intValue == 2;
                    ei.d0 d0Var = kxVar.h;
                    if (d0Var != null) {
                        d0Var.a(Boolean.valueOf(kxVar.c), Boolean.valueOf(kxVar.d), Boolean.valueOf(kxVar.e));
                    }
                    if (kxVar.d && kxVar.getParentLayout() != null) {
                        for (org.telegram.ui.ActionBar.d2 d2Var : kxVar.getParentLayout().getFragmentStack()) {
                            if (d2Var instanceof uw) {
                                pv pvVar = ((uw) d2Var).G3;
                                if (pvVar.c()) {
                                    pvVar.a();
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 7:
                ((c00) obj2).e.g0(true);
                break;
            case 8:
                ((k30) obj2).c();
                break;
            case 9:
                String str = LaunchActivity.E1;
                ((o70) obj2).run();
                break;
            case 10:
                ((t90) obj2).d0();
                break;
            case 11:
                id0 id0Var = (id0) obj2;
                String str2 = (String) obj;
                org.telegram.messenger.a8.b("LoginBilling purchased done " + str2);
                if ("CANCELLED".equalsIgnoreCase(str2)) {
                    id0Var.b.setLoading(false);
                    break;
                }
                break;
            case 12:
                vf0 vf0Var = (vf0) obj2;
                Integer num = (Integer) obj;
                vf0Var.getClass();
                boolean z10 = num.intValue() - vf0Var.d.d > org.telegram.messenger.g0.L(20.0f);
                vf0Var.b0 = z10;
                vf0Var.d0.animate().translationY((z10 ? Math.min(vf0Var.c0, (vf0Var.F.getHeight() - num.intValue()) - vf0Var.d0.getMeasuredHeight()) : vf0Var.c0) - vf0Var.d0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.h1.w).start();
                break;
            case 13:
                kg0 kg0Var = (kg0) obj2;
                kg0Var.c2 = (String) obj;
                o4 o4Var = kg0Var.m2;
                org.telegram.messenger.g0.r(o4Var);
                org.telegram.messenger.g0.i3(o4Var, 100L);
                break;
            case 14:
                vg0 vg0Var = (vg0) obj2;
                vg0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    vg0Var.J0();
                    break;
                }
                break;
            case 15:
                wl0 wl0Var = (wl0) obj2;
                View view = (View) obj;
                cm0 cm0Var = wl0Var.q0;
                if (view instanceof zl0) {
                    view.setBackgroundColor(cm0Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                    ((zl0) view).updateColors();
                    break;
                } else if (view instanceof org.telegram.ui.Cells.l8) {
                    view.setBackgroundColor(cm0Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                    ((org.telegram.ui.Cells.l8) view).updateColors();
                    break;
                } else if (view instanceof vl0) {
                    view.setBackgroundColor(cm0Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                    ((vl0) view).updateColors();
                    break;
                } else if (view instanceof org.telegram.ui.Cells.n4) {
                    view.setBackgroundColor(cm0Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                    break;
                } else if (view instanceof ll0) {
                    ((ll0) view).d.invalidate();
                    break;
                } else if (view instanceof bm0) {
                    wl0Var.l((bm0) view);
                    break;
                } else if (view instanceof ul0) {
                    ((ul0) view).updateColors();
                    break;
                }
                break;
            case 16:
                super/*android.widget.LinearLayout*/.draw((Canvas) obj);
                break;
            case 17:
                ((ul0) obj2).c.e();
                break;
            case 18:
                ((gi.g1) obj2).D(((Integer) obj).intValue());
                break;
            case 19:
                xr0 xr0Var = (xr0) obj2;
                xr0Var.r = ((Integer) obj).intValue();
                View B1 = xr0Var.d.B1(4);
                if (B1 instanceof org.telegram.ui.Cells.y8) {
                    org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) B1;
                    if (y8Var.getFixedSize() <= 0 && xr0Var.r > 0) {
                        y8Var.setText(xr0Var.b0());
                        xr0Var.a0(true);
                        break;
                    }
                }
                xr0Var.d.g3.O(true);
                xr0Var.a0(true);
                break;
            case 20:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                ArrayList arrayList = privacySettingsActivity.Q;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.F0(true);
                break;
            case 21:
                org.telegram.ui.Components.s70[] s70VarArr = (org.telegram.ui.Components.s70[]) obj2;
                Boolean bool = (Boolean) obj;
                RectF rectF = ProfileActivity.T6;
                ViewPropertyAnimator scaleY = s70VarArr[0].animate().alpha(bool.booleanValue() ? 0.0f : 1.0f).scaleX(bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 0.8f : 1.0f);
                org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
                org.telegram.messenger.camera.q.l(scaleY, xqVar, 600L);
                s70VarArr[1].animate().alpha(bool.booleanValue() ? 1.0f : 0.0f).scaleX(!bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 1.0f : 0.8f).setInterpolator(xqVar).setDuration(600L).start();
                break;
            case 22:
                StickersActivity.g0((StickersActivity) obj2, (View) obj);
                break;
            case 23:
                ThemeActivity.Z((ThemeActivity) obj2, (TL_account.contentSettings) obj);
                break;
            case 24:
                ((gi.g1) obj2).D(((Integer) obj).intValue());
                break;
            case 25:
                ((m91) obj2).Y = (TL_stories.TL_premium_boostsStatus) obj;
                break;
            default:
                ((zb1) obj2).D(true);
                break;
        }
    }
}
