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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class r3 implements org.telegram.messenger.z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r3(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        int i7 = this.a;
        Object obj2 = this.b;
        switch (i7) {
            case 0:
                ((t3) obj2).L.p0 = ((Integer) obj).intValue() - org.telegram.messenger.g0.n > org.telegram.messenger.g0.L(20.0f);
                break;
            case 1:
                org.telegram.messenger.g0.h3(new u5(10, (sb) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new u5(16, (xd) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 3:
                ((lp) obj2).e.T = (String) obj;
                break;
            case 4:
                qq qqVar = ((mq) obj2).d;
                qqVar.A1 = ((Integer) obj).intValue();
                org.telegram.messenger.g0.Z3(qqVar.r0, qqVar.c);
                break;
            case 5:
                pr.Z((pr) obj2, (TL_account.TL_birthday) obj);
                break;
            case 6:
                ox oxVar = (ox) obj2;
                int intValue = ((Integer) obj).intValue();
                if (intValue != (oxVar.e ? 2 : oxVar.d ? 0 : 1)) {
                    oxVar.d = intValue == 0;
                    oxVar.e = intValue == 2;
                    fi.b0 b0Var = oxVar.h;
                    if (b0Var != null) {
                        b0Var.a(Boolean.valueOf(oxVar.c), Boolean.valueOf(oxVar.d), Boolean.valueOf(oxVar.e));
                    }
                    if (oxVar.d && oxVar.getParentLayout() != null) {
                        for (org.telegram.ui.ActionBar.e2 e2Var : oxVar.getParentLayout().getFragmentStack()) {
                            if (e2Var instanceof yw) {
                                uv uvVar = ((yw) e2Var).H3;
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
                ((p30) obj2).c();
                break;
            case 9:
                String str = LaunchActivity.C1;
                ((s70) obj2).run();
                break;
            case 10:
                ((x90) obj2).d0();
                break;
            case 11:
                kd0 kd0Var = (kd0) obj2;
                String str2 = (String) obj;
                org.telegram.messenger.a8.b("LoginBilling purchased done " + str2);
                if ("CANCELLED".equalsIgnoreCase(str2)) {
                    kd0Var.b.setLoading(false);
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
                        org.telegram.messenger.d1 a10 = org.telegram.messenger.h9.a(context, cVar);
                        ce0 ce0Var = be0Var.h0;
                        e6Var = ((org.telegram.ui.ActionBar.e2) ce0Var).resourceProvider;
                        org.telegram.ui.Components.vx0 vx0Var = new org.telegram.ui.Components.vx0(context, e6Var);
                        if (a10.b != null) {
                            vx0Var.c(org.telegram.messenger.hd.M0(2131750528, null), a10.b, null, null);
                        }
                        if (a10.a >= 0) {
                            vx0Var.c(org.telegram.messenger.hd.M0(2131750525, null), org.telegram.messenger.hd.a0(null, null, 2131750524, Integer.valueOf(a10.a + 1)), null, null);
                        }
                        if (a10.c != null) {
                            vx0Var.c(org.telegram.messenger.hd.M0(2131750526, null), a10.c.startsWith("+") ? pf.b.c().b(a10.c) : a10.c, null, null);
                        }
                        FrameLayout frameLayout = new FrameLayout(context);
                        frameLayout.addView(vx0Var, c8.ja.d(-1, -2.0f, 55, 24.0f, 4.0f, 24.0f, 4.0f));
                        final boolean[] zArr = new boolean[1];
                        e6Var2 = ((org.telegram.ui.ActionBar.e2) ce0Var).resourceProvider;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var2);
                        String M0 = org.telegram.messenger.hd.M0(2131750522, null);
                        final org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                        t1Var.S = M0;
                        t1Var.U = org.telegram.messenger.hd.M0(2131750523, null);
                        alertDialog$Builder.o(frameLayout);
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131750527, null), new tr(27, be0Var, zArr));
                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                        t1Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.ud0
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                be0 be0Var2 = be0.this;
                                if (be0Var2.d0 == t1Var) {
                                    be0Var2.d0 = null;
                                }
                                if (zArr[0] || !be0Var2.o()) {
                                    return;
                                }
                                be0Var2.t(false);
                            }
                        });
                        be0Var.d0 = t1Var;
                        t1Var.show();
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
                boolean z10 = num.intValue() - bg0Var.d.d > org.telegram.messenger.g0.L(20.0f);
                bg0Var.b0 = z10;
                bg0Var.d0.animate().translationY((z10 ? Math.min(bg0Var.c0, (bg0Var.F.getHeight() - num.intValue()) - bg0Var.d0.getMeasuredHeight()) : bg0Var.c0) - bg0Var.d0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.i1.w).start();
                break;
            case 14:
                qg0 qg0Var = (qg0) obj2;
                qg0Var.f2 = (String) obj;
                m4 m4Var = qg0Var.p2;
                org.telegram.messenger.g0.r(m4Var);
                org.telegram.messenger.g0.i3(m4Var, 100L);
                break;
            case 15:
                bh0 bh0Var = (bh0) obj2;
                bh0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    bh0Var.J0();
                    break;
                }
                break;
            case 16:
                cm0 cm0Var = (cm0) obj2;
                View view = (View) obj;
                im0 im0Var = cm0Var.q0;
                if (view instanceof fm0) {
                    view.setBackgroundColor(im0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                    ((fm0) view).updateColors();
                    break;
                } else if (view instanceof org.telegram.ui.Cells.l8) {
                    view.setBackgroundColor(im0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                    ((org.telegram.ui.Cells.l8) view).updateColors();
                    break;
                } else if (view instanceof bm0) {
                    view.setBackgroundColor(im0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                    ((bm0) view).updateColors();
                    break;
                } else if (view instanceof org.telegram.ui.Cells.n4) {
                    view.setBackgroundColor(im0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                    break;
                } else if (view instanceof rl0) {
                    ((rl0) view).d.invalidate();
                    break;
                } else if (view instanceof hm0) {
                    cm0Var.l((hm0) view);
                    break;
                } else if (view instanceof am0) {
                    ((am0) view).updateColors();
                    break;
                }
                break;
            case 17:
                super/*android.widget.LinearLayout*/.draw((Canvas) obj);
                break;
            case 18:
                ((am0) obj2).c.e();
                break;
            case 19:
                ((hi.i1) obj2).C(((Integer) obj).intValue());
                break;
            case 20:
                es0 es0Var = (es0) obj2;
                es0Var.r = ((Integer) obj).intValue();
                View B1 = es0Var.d.B1(4);
                if (B1 instanceof org.telegram.ui.Cells.y8) {
                    org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) B1;
                    if (y8Var.getFixedSize() <= 0 && es0Var.r > 0) {
                        y8Var.setText(es0Var.b0());
                        es0Var.a0(true);
                        break;
                    }
                }
                es0Var.d.g3.O(true);
                es0Var.a0(true);
                break;
            case 21:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                ArrayList arrayList = privacySettingsActivity.Q;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.F0(true);
                break;
            case 22:
                org.telegram.ui.Components.z70[] z70VarArr = (org.telegram.ui.Components.z70[]) obj2;
                Boolean bool = (Boolean) obj;
                RectF rectF = ProfileActivity.X6;
                ViewPropertyAnimator scaleY = z70VarArr[0].animate().alpha(bool.booleanValue() ? 0.0f : 1.0f).scaleX(bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 0.8f : 1.0f);
                org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
                org.telegram.messenger.i20.n(scaleY, erVar, 600L);
                z70VarArr[1].animate().alpha(bool.booleanValue() ? 1.0f : 0.0f).scaleX(!bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 1.0f : 0.8f).setInterpolator(erVar).setDuration(600L).start();
                break;
            case 23:
                StickersActivity.g0((StickersActivity) obj2, (View) obj);
                break;
            case 24:
                ThemeActivity.Z((ThemeActivity) obj2, (TL_account.contentSettings) obj);
                break;
            case 25:
                ((hi.i1) obj2).C(((Integer) obj).intValue());
                break;
            case 26:
                ((u91) obj2).Y = (TL_stories.TL_premium_boostsStatus) obj;
                break;
            default:
                ((ec1) obj2).v(true);
                break;
        }
    }
}
