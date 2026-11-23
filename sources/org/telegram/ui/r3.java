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
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class r3 implements org.telegram.messenger.y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r3(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.y10
    public final void a(Object obj) {
        org.telegram.ui.ActionBar.h6 h6Var;
        org.telegram.ui.ActionBar.h6 h6Var2;
        int i7 = this.a;
        Object obj2 = this.b;
        switch (i7) {
            case 0:
                ((t3) obj2).L.p0 = ((Integer) obj).intValue() - org.telegram.messenger.g0.n > org.telegram.messenger.g0.L(20.0f);
                break;
            case 1:
                org.telegram.messenger.g0.g3(new u8(8, (sb) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 2:
                org.telegram.messenger.g0.g3(new u8(14, (xd) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 3:
                ((mp) obj2).e.T = (String) obj;
                break;
            case 4:
                rq rqVar = ((nq) obj2).d;
                rqVar.A1 = ((Integer) obj).intValue();
                org.telegram.messenger.g0.Y3(rqVar.r0, rqVar.c);
                break;
            case 5:
                qr.Z((qr) obj2, (TL_account.TL_birthday) obj);
                break;
            case 6:
                rx rxVar = (rx) obj2;
                int intValue = ((Integer) obj).intValue();
                if (intValue != (rxVar.e ? 2 : rxVar.d ? 0 : 1)) {
                    rxVar.d = intValue == 0;
                    rxVar.e = intValue == 2;
                    fi.b0 b0Var = rxVar.h;
                    if (b0Var != null) {
                        b0Var.a(Boolean.valueOf(rxVar.c), Boolean.valueOf(rxVar.d), Boolean.valueOf(rxVar.e));
                    }
                    if (rxVar.d && rxVar.getParentLayout() != null) {
                        for (org.telegram.ui.ActionBar.g2 g2Var : rxVar.getParentLayout().getFragmentStack()) {
                            if (g2Var instanceof cx) {
                                xv xvVar = ((cx) g2Var).H3;
                                if (xvVar.c()) {
                                    xvVar.a();
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 7:
                ((j00) obj2).e.g0(true);
                break;
            case 8:
                ((s30) obj2).c();
                break;
            case 9:
                String str = LaunchActivity.C1;
                ((v70) obj2).run();
                break;
            case 10:
                s90 s90Var = (s90) obj2;
                Long l10 = (Long) obj;
                int i10 = s90Var.b;
                s90Var.c();
                TLRPC.User c22 = (l10 == null || l10.longValue() <= 0) ? null : org.telegram.messenger.np.u1(i10).c2(l10);
                if (c22 == null || !c22.bot) {
                    org.telegram.messenger.f3.o(null, 2131747941, s90.d(), null);
                    break;
                } else {
                    ki.h0.a(LaunchActivity.T(), i10, c22);
                    break;
                }
                break;
            case 11:
                ((z90) obj2).d0();
                break;
            case 12:
                ld0 ld0Var = (ld0) obj2;
                String str2 = (String) obj;
                org.telegram.messenger.a8.b("LoginBilling purchased done " + str2);
                if ("CANCELLED".equalsIgnoreCase(str2)) {
                    ld0Var.b.setLoading(false);
                    break;
                }
                break;
            case 13:
                final ce0 ce0Var = (ce0) obj2;
                List list = (List) obj;
                if (ce0Var.o()) {
                    if (list != null && !list.isEmpty()) {
                        db.c cVar = (db.c) list.get(0);
                        Context context = ce0Var.getContext();
                        org.telegram.messenger.d1 a10 = org.telegram.messenger.h9.a(context, cVar);
                        de0 de0Var = ce0Var.h0;
                        h6Var = ((org.telegram.ui.ActionBar.g2) de0Var).resourceProvider;
                        org.telegram.ui.Components.ey0 ey0Var = new org.telegram.ui.Components.ey0(context, h6Var);
                        if (a10.b != null) {
                            ey0Var.e(org.telegram.messenger.hd.N0(2131750511, null), a10.b, null, null);
                        }
                        if (a10.a >= 0) {
                            ey0Var.e(org.telegram.messenger.hd.N0(2131750508, null), org.telegram.messenger.hd.a0(null, null, 2131750507, Integer.valueOf(a10.a + 1)), null, null);
                        }
                        if (a10.c != null) {
                            ey0Var.e(org.telegram.messenger.hd.N0(2131750509, null), a10.c.startsWith("+") ? pf.b.c().b(a10.c) : a10.c, null, null);
                        }
                        FrameLayout frameLayout = new FrameLayout(context);
                        frameLayout.addView(ey0Var, c8.ma.d(-1, -2.0f, 55, 24.0f, 4.0f, 24.0f, 4.0f));
                        final boolean[] zArr = new boolean[1];
                        h6Var2 = ((org.telegram.ui.ActionBar.g2) de0Var).resourceProvider;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var2);
                        String N0 = org.telegram.messenger.hd.N0(2131750505, null);
                        final org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                        t1Var.S = N0;
                        t1Var.U = org.telegram.messenger.hd.N0(2131750506, null);
                        alertDialog$Builder.o(frameLayout);
                        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131750510, null), new at(26, ce0Var, zArr));
                        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                        t1Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.vd0
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                ce0 ce0Var2 = ce0.this;
                                if (ce0Var2.d0 == t1Var) {
                                    ce0Var2.d0 = null;
                                }
                                if (zArr[0] || !ce0Var2.o()) {
                                    return;
                                }
                                ce0Var2.t(false);
                            }
                        });
                        ce0Var.d0 = t1Var;
                        t1Var.show();
                        break;
                    } else {
                        ce0Var.t(false);
                        break;
                    }
                }
                break;
            case 14:
                eg0 eg0Var = (eg0) obj2;
                Integer num = (Integer) obj;
                eg0Var.getClass();
                boolean z10 = num.intValue() - eg0Var.d.d > org.telegram.messenger.g0.L(20.0f);
                eg0Var.b0 = z10;
                eg0Var.d0.animate().translationY((z10 ? Math.min(eg0Var.c0, (eg0Var.F.getHeight() - num.intValue()) - eg0Var.d0.getMeasuredHeight()) : eg0Var.c0) - eg0Var.d0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.i1.w).start();
                break;
            case 15:
                vg0 vg0Var = (vg0) obj2;
                vg0Var.f2 = (String) obj;
                m4 m4Var = vg0Var.p2;
                org.telegram.messenger.g0.r(m4Var);
                org.telegram.messenger.g0.h3(m4Var, 100L);
                break;
            case 16:
                fh0 fh0Var = (fh0) obj2;
                fh0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    fh0Var.K0();
                    break;
                }
                break;
            case 17:
                fm0 fm0Var = (fm0) obj2;
                View view = (View) obj;
                lm0 lm0Var = fm0Var.q0;
                if (view instanceof im0) {
                    view.setBackgroundColor(lm0Var.getThemedColor(org.telegram.ui.ActionBar.m6.d6));
                    ((im0) view).updateColors();
                    break;
                } else if (view instanceof org.telegram.ui.Cells.n8) {
                    view.setBackgroundColor(lm0Var.getThemedColor(org.telegram.ui.ActionBar.m6.d6));
                    ((org.telegram.ui.Cells.n8) view).updateColors();
                    break;
                } else if (view instanceof em0) {
                    view.setBackgroundColor(lm0Var.getThemedColor(org.telegram.ui.ActionBar.m6.d6));
                    ((em0) view).updateColors();
                    break;
                } else if (view instanceof org.telegram.ui.Cells.o4) {
                    view.setBackgroundColor(lm0Var.getThemedColor(org.telegram.ui.ActionBar.m6.d6));
                    break;
                } else if (view instanceof ul0) {
                    ((ul0) view).d.invalidate();
                    break;
                } else if (view instanceof km0) {
                    fm0Var.l((km0) view);
                    break;
                } else if (view instanceof dm0) {
                    ((dm0) view).updateColors();
                    break;
                }
                break;
            case 18:
                super/*android.widget.LinearLayout*/.draw((Canvas) obj);
                break;
            case 19:
                ((dm0) obj2).c.e();
                break;
            case 20:
                ((hi.i1) obj2).A(((Integer) obj).intValue());
                break;
            case 21:
                is0 is0Var = (is0) obj2;
                is0Var.r = ((Integer) obj).intValue();
                View B1 = is0Var.d.B1(4);
                if (B1 instanceof org.telegram.ui.Cells.a9) {
                    org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) B1;
                    if (a9Var.getFixedSize() <= 0 && is0Var.r > 0) {
                        a9Var.setText(is0Var.b0());
                        is0Var.a0(true);
                        break;
                    }
                }
                is0Var.d.g3.O(true);
                is0Var.a0(true);
                break;
            case 22:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                ArrayList arrayList = privacySettingsActivity.Q;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.F0(true);
                break;
            case 23:
                org.telegram.ui.Components.m80[] m80VarArr = (org.telegram.ui.Components.m80[]) obj2;
                Boolean bool = (Boolean) obj;
                RectF rectF = ProfileActivity.Z6;
                ViewPropertyAnimator scaleY = m80VarArr[0].animate().alpha(bool.booleanValue() ? 0.0f : 1.0f).scaleX(bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 0.8f : 1.0f);
                org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.h;
                org.telegram.messenger.o10.o(scaleY, nrVar, 600L);
                m80VarArr[1].animate().alpha(bool.booleanValue() ? 1.0f : 0.0f).scaleX(!bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 1.0f : 0.8f).setInterpolator(nrVar).setDuration(600L).start();
                break;
            case 24:
                StickersActivity.g0((StickersActivity) obj2, (View) obj);
                break;
            case 25:
                ThemeActivity.Z((ThemeActivity) obj2, (TL_account.contentSettings) obj);
                break;
            case 26:
                ((hi.i1) obj2).A(((Integer) obj).intValue());
                break;
            case 27:
                ((y91) obj2).Y = (TL_stories.TL_premium_boostsStatus) obj;
                break;
            default:
                ((hc1) obj2).v(true);
                break;
        }
    }
}
