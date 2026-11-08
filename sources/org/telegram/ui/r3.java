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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        int i7 = this.a;
        Object obj2 = this.b;
        switch (i7) {
            case 0:
                ((t3) obj2).K.o0 = ((Integer) obj).intValue() - org.telegram.messenger.g0.n > org.telegram.messenger.g0.L(20.0f);
                break;
            case 1:
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.p(21, (tb) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.p(27, (zd) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 3:
                ((jp) obj2).e.S = (String) obj;
                break;
            case 4:
                oq oqVar = ((kq) obj2).d;
                oqVar.z1 = ((Integer) obj).intValue();
                org.telegram.messenger.g0.a4(oqVar.q0, oqVar.c);
                break;
            case 5:
                nr.Z((nr) obj2, (TL_account.TL_birthday) obj);
                break;
            case 6:
                nx nxVar = (nx) obj2;
                int intValue = ((Integer) obj).intValue();
                if (intValue != (nxVar.e ? 2 : nxVar.d ? 0 : 1)) {
                    nxVar.d = intValue == 0;
                    nxVar.e = intValue == 2;
                    di.b0 b0Var = nxVar.h;
                    if (b0Var != null) {
                        b0Var.a(Boolean.valueOf(nxVar.c), Boolean.valueOf(nxVar.d), Boolean.valueOf(nxVar.e));
                    }
                    if (nxVar.d && nxVar.getParentLayout() != null) {
                        for (org.telegram.ui.ActionBar.f2 f2Var : nxVar.getParentLayout().getFragmentStack()) {
                            if (f2Var instanceof ww) {
                                sv svVar = ((ww) f2Var).F3;
                                if (svVar.c()) {
                                    svVar.a();
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 7:
                ((e00) obj2).e.g0(true);
                break;
            case 8:
                ((p30) obj2).c();
                break;
            case 9:
                String str = LaunchActivity.B1;
                ((u70) obj2).run();
                break;
            case 10:
                ((w90) obj2).d0();
                break;
            case 11:
                ld0 ld0Var = (ld0) obj2;
                String str2 = (String) obj;
                org.telegram.messenger.a8.b("LoginBilling purchased done " + str2);
                if ("CANCELLED".equalsIgnoreCase(str2)) {
                    ld0Var.b.setLoading(false);
                    break;
                }
                break;
            case 12:
                final be0 be0Var = (be0) obj2;
                List list = (List) obj;
                if (be0Var.o()) {
                    if (list != null && !list.isEmpty()) {
                        db.c cVar = (db.c) list.get(0);
                        Context context = be0Var.getContext();
                        org.telegram.messenger.d1 a10 = org.telegram.messenger.i9.a(context, cVar);
                        ce0 ce0Var = be0Var.g0;
                        f6Var = ((org.telegram.ui.ActionBar.f2) ce0Var).resourceProvider;
                        org.telegram.ui.Components.tx0 tx0Var = new org.telegram.ui.Components.tx0(context, f6Var);
                        if (a10.b != null) {
                            tx0Var.c(org.telegram.messenger.id.M0(2131750529, null), a10.b, null, null);
                        }
                        if (a10.a >= 0) {
                            tx0Var.c(org.telegram.messenger.id.M0(2131750526, null), org.telegram.messenger.id.a0(null, null, 2131750525, Integer.valueOf(a10.a + 1)), null, null);
                        }
                        if (a10.c != null) {
                            tx0Var.c(org.telegram.messenger.id.M0(2131750527, null), a10.c.startsWith("+") ? pf.b.c().b(a10.c) : a10.c, null, null);
                        }
                        FrameLayout frameLayout = new FrameLayout(context);
                        frameLayout.addView(tx0Var, c8.ha.d(-1, -2.0f, 55, 24.0f, 4.0f, 24.0f, 4.0f));
                        final boolean[] zArr = new boolean[1];
                        f6Var2 = ((org.telegram.ui.ActionBar.f2) ce0Var).resourceProvider;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, f6Var2);
                        String M0 = org.telegram.messenger.id.M0(2131750523, null);
                        final org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                        u1Var.R = M0;
                        u1Var.T = org.telegram.messenger.id.M0(2131750524, null);
                        alertDialog$Builder.o(frameLayout);
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131750528, null), new pu(23, be0Var, zArr));
                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        u1Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.ud0
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                be0 be0Var2 = be0.this;
                                if (be0Var2.c0 == u1Var) {
                                    be0Var2.c0 = null;
                                }
                                if (zArr[0] || !be0Var2.o()) {
                                    return;
                                }
                                be0Var2.t(false);
                            }
                        });
                        be0Var.c0 = u1Var;
                        u1Var.show();
                        break;
                    } else {
                        be0Var.t(false);
                        break;
                    }
                }
                break;
            case 13:
                bg0 bg0Var = (bg0) obj2;
                Integer num = (Integer) obj;
                bg0Var.getClass();
                boolean z9 = num.intValue() - bg0Var.d.d > org.telegram.messenger.g0.L(20.0f);
                bg0Var.a0 = z9;
                bg0Var.c0.animate().translationY((z9 ? Math.min(bg0Var.b0, (bg0Var.E.getHeight() - num.intValue()) - bg0Var.c0.getMeasuredHeight()) : bg0Var.b0) - bg0Var.c0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.i1.w).start();
                break;
            case 14:
                qg0 qg0Var = (qg0) obj2;
                qg0Var.b2 = (String) obj;
                m4 m4Var = qg0Var.l2;
                org.telegram.messenger.g0.r(m4Var);
                org.telegram.messenger.g0.i3(m4Var, 100L);
                break;
            case 15:
                ah0 ah0Var = (ah0) obj2;
                ah0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    ah0Var.J0();
                    break;
                }
                break;
            case 16:
                bm0 bm0Var = (bm0) obj2;
                View view = (View) obj;
                hm0 hm0Var = bm0Var.p0;
                if (view instanceof em0) {
                    view.setBackgroundColor(hm0Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                    ((em0) view).updateColors();
                    break;
                } else if (view instanceof org.telegram.ui.Cells.m8) {
                    view.setBackgroundColor(hm0Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                    ((org.telegram.ui.Cells.m8) view).updateColors();
                    break;
                } else if (view instanceof am0) {
                    view.setBackgroundColor(hm0Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                    ((am0) view).updateColors();
                    break;
                } else if (view instanceof org.telegram.ui.Cells.n4) {
                    view.setBackgroundColor(hm0Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                    break;
                } else if (view instanceof ql0) {
                    ((ql0) view).d.invalidate();
                    break;
                } else if (view instanceof gm0) {
                    bm0Var.l((gm0) view);
                    break;
                } else if (view instanceof zl0) {
                    ((zl0) view).updateColors();
                    break;
                }
                break;
            case 17:
                super/*android.widget.LinearLayout*/.draw((Canvas) obj);
                break;
            case 18:
                ((zl0) obj2).c.e();
                break;
            case 19:
                ((fi.g1) obj2).E(((Integer) obj).intValue());
                break;
            case 20:
                hs0 hs0Var = (hs0) obj2;
                hs0Var.r = ((Integer) obj).intValue();
                View B1 = hs0Var.d.B1(4);
                if (B1 instanceof org.telegram.ui.Cells.z8) {
                    org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) B1;
                    if (z8Var.getFixedSize() <= 0 && hs0Var.r > 0) {
                        z8Var.setText(hs0Var.b0());
                        hs0Var.a0(true);
                        break;
                    }
                }
                hs0Var.d.f3.O(true);
                hs0Var.a0(true);
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
                RectF rectF = ProfileActivity.S6;
                ViewPropertyAnimator scaleY = w70VarArr[0].animate().alpha(bool.booleanValue() ? 0.0f : 1.0f).scaleX(bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 0.8f : 1.0f);
                org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
                org.telegram.messenger.camera.q.l(scaleY, xqVar, 600L);
                w70VarArr[1].animate().alpha(bool.booleanValue() ? 1.0f : 0.0f).scaleX(!bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 1.0f : 0.8f).setInterpolator(xqVar).setDuration(600L).start();
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
                ((w91) obj2).X = (TL_stories.TL_premium_boostsStatus) obj;
                break;
            default:
                ((fc1) obj2).v(true);
                break;
        }
    }
}
