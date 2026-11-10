package org.telegram.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r3 implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r3(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        org.telegram.ui.ActionBar.h6 h6Var;
        org.telegram.ui.ActionBar.h6 h6Var2;
        int i7 = this.a;
        Object obj2 = this.b;
        switch (i7) {
            case 0:
                ((t3) obj2).K.o0 = ((Integer) obj).intValue() - org.telegram.messenger.g0.n > org.telegram.messenger.g0.L(20.0f);
                break;
            case 1:
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.c(22, (tb) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.c(28, (zd) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 3:
                ((lp) obj2).e.S = (String) obj;
                break;
            case 4:
                rq rqVar = ((nq) obj2).d;
                rqVar.z1 = ((Integer) obj).intValue();
                org.telegram.messenger.g0.a4(rqVar.q0, rqVar.c);
                break;
            case 5:
                qr.Z((qr) obj2, (TL_account.TL_birthday) obj);
                break;
            case 6:
                qx qxVar = (qx) obj2;
                int intValue = ((Integer) obj).intValue();
                if (intValue != (qxVar.e ? 2 : qxVar.d ? 0 : 1)) {
                    qxVar.d = intValue == 0;
                    qxVar.e = intValue == 2;
                    di.b0 b0Var = qxVar.h;
                    if (b0Var != null) {
                        b0Var.a(Boolean.valueOf(qxVar.c), Boolean.valueOf(qxVar.d), Boolean.valueOf(qxVar.e));
                    }
                    if (qxVar.d && qxVar.getParentLayout() != null) {
                        for (org.telegram.ui.ActionBar.f2 f2Var : qxVar.getParentLayout().getFragmentStack()) {
                            if (f2Var instanceof zw) {
                                vv vvVar = ((zw) f2Var).G3;
                                if (vvVar.c()) {
                                    vvVar.a();
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 7:
                ((h00) obj2).e.g0(true);
                break;
            case 8:
                ((s30) obj2).c();
                break;
            case 9:
                String str = LaunchActivity.B1;
                ((x70) obj2).run();
                break;
            case 10:
                ((z90) obj2).d0();
                break;
            case 11:
                od0 od0Var = (od0) obj2;
                String str2 = (String) obj;
                org.telegram.messenger.a8.b("LoginBilling purchased done " + str2);
                if ("CANCELLED".equalsIgnoreCase(str2)) {
                    od0Var.b.setLoading(false);
                    break;
                }
                break;
            case 12:
                final ee0 ee0Var = (ee0) obj2;
                List list = (List) obj;
                if (ee0Var.o()) {
                    if (list != null && !list.isEmpty()) {
                        db.c cVar = (db.c) list.get(0);
                        Context context = ee0Var.getContext();
                        org.telegram.messenger.d1 a10 = org.telegram.messenger.i9.a(context, cVar);
                        fe0 fe0Var = ee0Var.g0;
                        h6Var = ((org.telegram.ui.ActionBar.f2) fe0Var).resourceProvider;
                        org.telegram.ui.Components.tx0 tx0Var = new org.telegram.ui.Components.tx0(context, h6Var);
                        if (a10.b != null) {
                            tx0Var.c(org.telegram.messenger.id.M0(2131750528, null), a10.b, null, null);
                        }
                        if (a10.a >= 0) {
                            tx0Var.c(org.telegram.messenger.id.M0(2131750525, null), org.telegram.messenger.id.a0(null, null, 2131750524, Integer.valueOf(a10.a + 1)), null, null);
                        }
                        if (a10.c != null) {
                            tx0Var.c(org.telegram.messenger.id.M0(2131750526, null), a10.c.startsWith("+") ? pf.b.c().b(a10.c) : a10.c, null, null);
                        }
                        FrameLayout frameLayout = new FrameLayout(context);
                        frameLayout.addView(tx0Var, c8.ha.d(-1, -2.0f, 55, 24.0f, 4.0f, 24.0f, 4.0f));
                        final boolean[] zArr = new boolean[1];
                        h6Var2 = ((org.telegram.ui.ActionBar.f2) fe0Var).resourceProvider;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var2);
                        String M0 = org.telegram.messenger.id.M0(2131750522, null);
                        final org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                        u1Var.R = M0;
                        u1Var.T = org.telegram.messenger.id.M0(2131750523, null);
                        alertDialog$Builder.o(frameLayout);
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131750527, null), new su(23, ee0Var, zArr));
                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        u1Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.xd0
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                ee0 ee0Var2 = ee0.this;
                                if (ee0Var2.c0 == u1Var) {
                                    ee0Var2.c0 = null;
                                }
                                if (zArr[0] || !ee0Var2.o()) {
                                    return;
                                }
                                ee0Var2.t(false);
                            }
                        });
                        ee0Var.c0 = u1Var;
                        u1Var.show();
                        break;
                    } else {
                        ee0Var.t(false);
                        break;
                    }
                }
                break;
            case 13:
                eg0 eg0Var = (eg0) obj2;
                Integer num = (Integer) obj;
                eg0Var.getClass();
                boolean z9 = num.intValue() - eg0Var.d.d > org.telegram.messenger.g0.L(20.0f);
                eg0Var.a0 = z9;
                eg0Var.c0.animate().translationY((z9 ? Math.min(eg0Var.b0, (eg0Var.E.getHeight() - num.intValue()) - eg0Var.c0.getMeasuredHeight()) : eg0Var.b0) - eg0Var.c0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.i1.w).start();
                break;
            case 14:
                tg0 tg0Var = (tg0) obj2;
                tg0Var.e2 = (String) obj;
                m4 m4Var = tg0Var.o2;
                org.telegram.messenger.g0.r(m4Var);
                org.telegram.messenger.g0.i3(m4Var, 100L);
                break;
            case 15:
                dh0 dh0Var = (dh0) obj2;
                dh0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    dh0Var.J0();
                    break;
                }
                break;
            case 16:
                em0 em0Var = (em0) obj2;
                View view = (View) obj;
                km0 km0Var = em0Var.p0;
                if (view instanceof hm0) {
                    view.setBackgroundColor(km0Var.getThemedColor(org.telegram.ui.ActionBar.m6.d6));
                    ((hm0) view).updateColors();
                    break;
                } else if (view instanceof org.telegram.ui.Cells.m8) {
                    view.setBackgroundColor(km0Var.getThemedColor(org.telegram.ui.ActionBar.m6.d6));
                    ((org.telegram.ui.Cells.m8) view).updateColors();
                    break;
                } else if (view instanceof dm0) {
                    view.setBackgroundColor(km0Var.getThemedColor(org.telegram.ui.ActionBar.m6.d6));
                    ((dm0) view).updateColors();
                    break;
                } else if (view instanceof org.telegram.ui.Cells.n4) {
                    view.setBackgroundColor(km0Var.getThemedColor(org.telegram.ui.ActionBar.m6.d6));
                    break;
                } else if (view instanceof tl0) {
                    ((tl0) view).d.invalidate();
                    break;
                } else if (view instanceof jm0) {
                    em0Var.l((jm0) view);
                    break;
                } else if (view instanceof cm0) {
                    ((cm0) view).updateColors();
                    break;
                }
                break;
            case 17:
                super/*android.widget.LinearLayout*/.draw((Canvas) obj);
                break;
            case 18:
                ((cm0) obj2).c.e();
                break;
            case 19:
                ((fi.g1) obj2).E(((Integer) obj).intValue());
                break;
            case 20:
                ks0 ks0Var = (ks0) obj2;
                ks0Var.r = ((Integer) obj).intValue();
                View B1 = ks0Var.d.B1(4);
                if (B1 instanceof org.telegram.ui.Cells.z8) {
                    org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) B1;
                    if (z8Var.getFixedSize() <= 0 && ks0Var.r > 0) {
                        z8Var.setText(ks0Var.b0());
                        ks0Var.a0(true);
                        break;
                    }
                }
                ks0Var.d.f3.O(true);
                ks0Var.a0(true);
                break;
            case 21:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                ArrayList arrayList = privacySettingsActivity.P;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.F0(true);
                break;
            case 22:
                org.telegram.ui.Components.w70[] w70VarArr = (org.telegram.ui.Components.w70[]) obj2;
                Boolean bool = (Boolean) obj;
                RectF rectF = ProfileActivity.V6;
                ViewPropertyAnimator scaleY = w70VarArr[0].animate().alpha(bool.booleanValue() ? 0.0f : 1.0f).scaleX(bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 0.8f : 1.0f);
                org.telegram.ui.Components.wq wqVar = org.telegram.ui.Components.wq.h;
                org.telegram.messenger.camera.q.l(scaleY, wqVar, 600L);
                w70VarArr[1].animate().alpha(bool.booleanValue() ? 1.0f : 0.0f).scaleX(!bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 1.0f : 0.8f).setInterpolator(wqVar).setDuration(600L).start();
                break;
            case 23:
                StickersActivity.g0((StickersActivity) obj2, (View) obj);
                break;
            case 24:
                ThemeActivity.Z((ThemeActivity) obj2, (TL_account.contentSettings) obj);
                break;
            case 25:
                ((fi.g1) obj2).E(((Integer) obj).intValue());
                break;
            case 26:
                ((z91) obj2).X = (TL_stories.TL_premium_boostsStatus) obj;
                break;
            default:
                ((jc1) obj2).v(true);
                break;
        }
    }
}
