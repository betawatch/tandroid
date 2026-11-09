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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
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
                ((lp) obj2).e.S = (String) obj;
                break;
            case 4:
                qq qqVar = ((mq) obj2).d;
                qqVar.z1 = ((Integer) obj).intValue();
                org.telegram.messenger.g0.a4(qqVar.q0, qqVar.c);
                break;
            case 5:
                pr.Z((pr) obj2, (TL_account.TL_birthday) obj);
                break;
            case 6:
                px pxVar = (px) obj2;
                int intValue = ((Integer) obj).intValue();
                if (intValue != (pxVar.e ? 2 : pxVar.d ? 0 : 1)) {
                    pxVar.d = intValue == 0;
                    pxVar.e = intValue == 2;
                    di.b0 b0Var = pxVar.h;
                    if (b0Var != null) {
                        b0Var.a(Boolean.valueOf(pxVar.c), Boolean.valueOf(pxVar.d), Boolean.valueOf(pxVar.e));
                    }
                    if (pxVar.d && pxVar.getParentLayout() != null) {
                        for (org.telegram.ui.ActionBar.f2 f2Var : pxVar.getParentLayout().getFragmentStack()) {
                            if (f2Var instanceof yw) {
                                uv uvVar = ((yw) f2Var).G3;
                                if (uvVar.c()) {
                                    uvVar.a();
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 7:
                ((g00) obj2).e.g0(true);
                break;
            case 8:
                ((r30) obj2).c();
                break;
            case 9:
                String str = LaunchActivity.B1;
                ((w70) obj2).run();
                break;
            case 10:
                ((y90) obj2).d0();
                break;
            case 11:
                nd0 nd0Var = (nd0) obj2;
                String str2 = (String) obj;
                org.telegram.messenger.a8.b("LoginBilling purchased done " + str2);
                if ("CANCELLED".equalsIgnoreCase(str2)) {
                    nd0Var.b.setLoading(false);
                    break;
                }
                break;
            case 12:
                final de0 de0Var = (de0) obj2;
                List list = (List) obj;
                if (de0Var.o()) {
                    if (list != null && !list.isEmpty()) {
                        db.c cVar = (db.c) list.get(0);
                        Context context = de0Var.getContext();
                        org.telegram.messenger.d1 a10 = org.telegram.messenger.i9.a(context, cVar);
                        ee0 ee0Var = de0Var.g0;
                        g6Var = ((org.telegram.ui.ActionBar.f2) ee0Var).resourceProvider;
                        org.telegram.ui.Components.ux0 ux0Var = new org.telegram.ui.Components.ux0(context, g6Var);
                        if (a10.b != null) {
                            ux0Var.c(org.telegram.messenger.id.M0(2131750528, null), a10.b, null, null);
                        }
                        if (a10.a >= 0) {
                            ux0Var.c(org.telegram.messenger.id.M0(2131750525, null), org.telegram.messenger.id.a0(null, null, 2131750524, Integer.valueOf(a10.a + 1)), null, null);
                        }
                        if (a10.c != null) {
                            ux0Var.c(org.telegram.messenger.id.M0(2131750526, null), a10.c.startsWith("+") ? pf.b.c().b(a10.c) : a10.c, null, null);
                        }
                        FrameLayout frameLayout = new FrameLayout(context);
                        frameLayout.addView(ux0Var, c8.ha.d(-1, -2.0f, 55, 24.0f, 4.0f, 24.0f, 4.0f));
                        final boolean[] zArr = new boolean[1];
                        g6Var2 = ((org.telegram.ui.ActionBar.f2) ee0Var).resourceProvider;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, g6Var2);
                        String M0 = org.telegram.messenger.id.M0(2131750522, null);
                        final org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                        u1Var.R = M0;
                        u1Var.T = org.telegram.messenger.id.M0(2131750523, null);
                        alertDialog$Builder.o(frameLayout);
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131750527, null), new ru(23, de0Var, zArr));
                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        u1Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.wd0
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                de0 de0Var2 = de0.this;
                                if (de0Var2.c0 == u1Var) {
                                    de0Var2.c0 = null;
                                }
                                if (zArr[0] || !de0Var2.o()) {
                                    return;
                                }
                                de0Var2.t(false);
                            }
                        });
                        de0Var.c0 = u1Var;
                        u1Var.show();
                        break;
                    } else {
                        de0Var.t(false);
                        break;
                    }
                }
                break;
            case 13:
                dg0 dg0Var = (dg0) obj2;
                Integer num = (Integer) obj;
                dg0Var.getClass();
                boolean z9 = num.intValue() - dg0Var.d.d > org.telegram.messenger.g0.L(20.0f);
                dg0Var.a0 = z9;
                dg0Var.c0.animate().translationY((z9 ? Math.min(dg0Var.b0, (dg0Var.E.getHeight() - num.intValue()) - dg0Var.c0.getMeasuredHeight()) : dg0Var.b0) - dg0Var.c0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.i1.w).start();
                break;
            case 14:
                sg0 sg0Var = (sg0) obj2;
                sg0Var.b2 = (String) obj;
                m4 m4Var = sg0Var.l2;
                org.telegram.messenger.g0.r(m4Var);
                org.telegram.messenger.g0.i3(m4Var, 100L);
                break;
            case 15:
                ch0 ch0Var = (ch0) obj2;
                ch0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    ch0Var.J0();
                    break;
                }
                break;
            case 16:
                dm0 dm0Var = (dm0) obj2;
                View view = (View) obj;
                jm0 jm0Var = dm0Var.p0;
                if (view instanceof gm0) {
                    view.setBackgroundColor(jm0Var.getThemedColor(org.telegram.ui.ActionBar.l6.d6));
                    ((gm0) view).updateColors();
                    break;
                } else if (view instanceof org.telegram.ui.Cells.m8) {
                    view.setBackgroundColor(jm0Var.getThemedColor(org.telegram.ui.ActionBar.l6.d6));
                    ((org.telegram.ui.Cells.m8) view).updateColors();
                    break;
                } else if (view instanceof cm0) {
                    view.setBackgroundColor(jm0Var.getThemedColor(org.telegram.ui.ActionBar.l6.d6));
                    ((cm0) view).updateColors();
                    break;
                } else if (view instanceof org.telegram.ui.Cells.n4) {
                    view.setBackgroundColor(jm0Var.getThemedColor(org.telegram.ui.ActionBar.l6.d6));
                    break;
                } else if (view instanceof sl0) {
                    ((sl0) view).d.invalidate();
                    break;
                } else if (view instanceof im0) {
                    dm0Var.l((im0) view);
                    break;
                } else if (view instanceof bm0) {
                    ((bm0) view).updateColors();
                    break;
                }
                break;
            case 17:
                super/*android.widget.LinearLayout*/.draw((Canvas) obj);
                break;
            case 18:
                ((bm0) obj2).c.e();
                break;
            case 19:
                ((fi.g1) obj2).E(((Integer) obj).intValue());
                break;
            case 20:
                js0 js0Var = (js0) obj2;
                js0Var.r = ((Integer) obj).intValue();
                View B1 = js0Var.d.B1(4);
                if (B1 instanceof org.telegram.ui.Cells.z8) {
                    org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) B1;
                    if (z8Var.getFixedSize() <= 0 && js0Var.r > 0) {
                        z8Var.setText(js0Var.b0());
                        js0Var.a0(true);
                        break;
                    }
                }
                js0Var.d.f3.O(true);
                js0Var.a0(true);
                break;
            case 21:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                ArrayList arrayList = privacySettingsActivity.P;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.F0(true);
                break;
            case 22:
                org.telegram.ui.Components.x70[] x70VarArr = (org.telegram.ui.Components.x70[]) obj2;
                Boolean bool = (Boolean) obj;
                RectF rectF = ProfileActivity.V6;
                ViewPropertyAnimator scaleY = x70VarArr[0].animate().alpha(bool.booleanValue() ? 0.0f : 1.0f).scaleX(bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 0.8f : 1.0f);
                org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
                org.telegram.messenger.camera.q.l(scaleY, xqVar, 600L);
                x70VarArr[1].animate().alpha(bool.booleanValue() ? 1.0f : 0.0f).scaleX(!bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 1.0f : 0.8f).setInterpolator(xqVar).setDuration(600L).start();
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
                ((y91) obj2).X = (TL_stories.TL_premium_boostsStatus) obj;
                break;
            default:
                ((ic1) obj2).v(true);
                break;
        }
    }
}
