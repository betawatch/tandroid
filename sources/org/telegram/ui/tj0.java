package org.telegram.ui;

import android.content.Intent;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class tj0 implements org.telegram.messenger.o20, org.telegram.ui.Cells.z5, org.telegram.ui.Components.j61, org.telegram.ui.ActionBar.u1, org.telegram.ui.ActionBar.j1, r0.m, org.telegram.messenger.k20, org.telegram.ui.Cells.d5, org.telegram.messenger.pc, RequestTimeDelegate, org.telegram.ui.ActionBar.j2, org.telegram.ui.Components.ik0, bg.g, zf.l1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tj0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // zf.l1
    public /* synthetic */ a0.h M() {
        return null;
    }

    @Override // r0.m
    public r0.j1 R0(View view, r0.j1 j1Var) {
        View fragmentView;
        switch (this.a) {
            case 8:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                i0.c I0 = org.telegram.messenger.i0.I0(j1Var, false);
                premiumPreviewFragment.o0 = I0;
                premiumPreviewFragment.a.setPadding(0, I0.b, 0, org.telegram.messenger.i0.L(48.0f) + premiumPreviewFragment.o0.d);
                org.telegram.ui.Components.tk0 tk0Var = premiumPreviewFragment.a;
                i0.c cVar = premiumPreviewFragment.o0;
                org.telegram.messenger.i0.A3(tk0Var, cVar.a, 0, cVar.c, 0);
                du0 du0Var = premiumPreviewFragment.U;
                i0.c cVar2 = premiumPreviewFragment.o0;
                du0Var.setPadding(cVar2.a, 0, cVar2.c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.J;
                if (frameLayout != null) {
                    int i10 = premiumPreviewFragment.o0.a;
                    int L = org.telegram.messenger.i0.L(14.0f);
                    i0.c cVar3 = premiumPreviewFragment.o0;
                    frameLayout.setPadding(i10, L, cVar3.c, cVar3.d);
                }
                break;
            default:
                pf0 pf0Var = (pf0) ((jd1) this.b);
                i0.c I02 = org.telegram.messenger.i0.I0(j1Var, false);
                int i11 = I02.a;
                pf0Var.M = i11;
                int i12 = I02.c;
                pf0Var.N = i12;
                pf0Var.L = I02.d;
                boolean a2 = pf0Var.D.a();
                int L2 = a2 ? org.telegram.messenger.i0.L(44.0f) : 0;
                pf0Var.D.setPadding(0, 0, 0, pf0Var.L);
                int L3 = org.telegram.messenger.i0.L(72.0f) + pf0Var.L + L2;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) pf0Var.H.getLayoutParams();
                if (marginLayoutParams.height != L3) {
                    marginLayoutParams.height = L3;
                    pf0Var.H.setLayoutParams(marginLayoutParams);
                }
                int i13 = a2 ? pf0Var.L + L2 : 0;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) pf0Var.c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i13 || marginLayoutParams2.leftMargin != i11 || marginLayoutParams2.rightMargin != i12) {
                    marginLayoutParams2.leftMargin = i11;
                    marginLayoutParams2.rightMargin = i12;
                    marginLayoutParams2.bottomMargin = i13;
                    pf0Var.c.setLayoutParams(marginLayoutParams2);
                }
                pf0Var.E.setPadding(i11, 0, i12, pf0Var.L);
                if (a2) {
                    j1Var = j1Var.a.m(0, 0, 0, pf0Var.L);
                }
                pf0Var.n0();
                pf0Var.m0();
                SparseArray sparseArray = pf0Var.a;
                int size = sparseArray.size();
                for (int i14 = 0; i14 < size; i14++) {
                    hd1 hd1Var = (hd1) sparseArray.valueAt(i14);
                    if (hd1Var != null && (fragmentView = hd1Var.a.getFragmentView()) != null) {
                        r0.h0.b(fragmentView, j1Var);
                    }
                }
                break;
        }
        return r0.j1.b;
    }

    @Override // zf.l1
    public /* synthetic */ boolean Y(int i10) {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.j1
    public void a() {
        switch (this.a) {
            case 6:
                ((kt0) this.b).e();
                break;
            default:
                ((x91) this.b).e();
                break;
        }
    }

    @Override // org.telegram.ui.Components.j61
    public void b(org.telegram.ui.Components.gz gzVar) {
        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) this.b;
        Drawable[] drawableArr = PhotoViewer.U8;
        gzVar.d(new n2.u(ffVar, 10));
    }

    @Override // org.telegram.ui.Cells.d5
    public boolean c(org.telegram.ui.Cells.e5 e5Var, boolean z10) {
        zu0 zu0Var = (zu0) this.b;
        if (!z10) {
            return true;
        }
        zu0Var.d.Y((Long) e5Var.getTag(), e5Var);
        return true;
    }

    @Override // org.telegram.messenger.k20
    public Object d(Number number, Object obj) {
        Integer num = (Integer) obj;
        PrivacyControlActivity privacyControlActivity = ((su0) this.b).d;
        if (((Integer) number).intValue() != 0) {
            return org.telegram.messenger.cd.E(num.intValue(), ',');
        }
        if (privacyControlActivity.getUserConfig().q()) {
            return org.telegram.messenger.cd.H(',', "Stars", num.intValue());
        }
        if (privacyControlActivity.y0 == null) {
            SpannableString spannableString = new SpannableString("l");
            org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(R.drawable.msg_mini_lock3, 0);
            float L = org.telegram.messenger.i0.L(2.0f);
            float L2 = org.telegram.messenger.i0.L(1.0f);
            dqVar.r = L;
            dqVar.s = L2;
            spannableString.setSpan(dqVar, 0, 1, 33);
            privacyControlActivity.y0 = spannableString;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) privacyControlActivity.y0);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.cd.H(',', "Stars", num.intValue()));
        return spannableStringBuilder;
    }

    @Override // org.telegram.ui.Components.ik0
    public boolean f(int i10, View view) {
        switch (this.a) {
            case 17:
                return ((t31) this.b).e1(i10, view);
            default:
                ((ea1) this.b).J.f(i10, view);
                return true;
        }
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        int i11;
        int i12;
        int i13;
        switch (this.a) {
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) ((b2.u) this.b).c;
                try {
                    org.telegram.messenger.i0.u2(photoViewer.T4, photoViewer.D, photoViewer.v2, true);
                    photoViewer.H0(false, false);
                    break;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            case 4:
                ((at0) this.b).finishFragment();
                break;
            case 5:
                ((us0) this.b).a.R.r();
                break;
            case 7:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.b;
                int i14 = PopupNotificationActivity.b0;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.w0.b.getPackageName()));
                    popupNotificationActivity.startActivity(intent);
                    break;
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                    return;
                }
            case 11:
                dv0 dv0Var = (dv0) this.b;
                RectF rectF = ProfileActivity.R6;
                dv0Var.a(1);
                break;
            case 14:
                ProxyListActivity proxyListActivity = (ProxyListActivity) ((pj0) this.b).c;
                ArrayList arrayList = proxyListActivity.E;
                int size = arrayList.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj = arrayList.get(i15);
                    i15++;
                    org.telegram.messenger.tz.i((org.telegram.messenger.sz) obj);
                }
                if (org.telegram.messenger.tz.B1 == null) {
                    proxyListActivity.d = false;
                }
                org.telegram.messenger.zs.e().n(proxyListActivity, org.telegram.messenger.zs.A4);
                org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.A4, new Object[0]);
                org.telegram.messenger.zs.e().c(proxyListActivity, org.telegram.messenger.zs.A4);
                proxyListActivity.g0(true);
                fg.j jVar = proxyListActivity.a;
                if (jVar != null) {
                    if (org.telegram.messenger.tz.B1 == null) {
                        i11 = proxyListActivity.useProxyRow;
                        jVar.h(i11, 0);
                    }
                    proxyListActivity.a.F();
                    break;
                }
                break;
            case 19:
                ThemeActivity themeActivity = ((n71) this.b).a;
                boolean o02 = ThemeActivity.o0(themeActivity, org.telegram.messenger.i0.Q1() ? 18 : 16);
                if (ThemeActivity.c0(themeActivity, 17, true)) {
                    o02 = true;
                }
                if (o02) {
                    x71 x71Var = themeActivity.a;
                    i12 = themeActivity.textSizeRow;
                    x71Var.h(i12, new Object());
                    x71 x71Var2 = themeActivity.a;
                    i13 = themeActivity.bubbleRadiusRow;
                    x71Var2.h(i13, new Object());
                }
                if (themeActivity.c != null) {
                    org.telegram.ui.ActionBar.s6 Q0 = org.telegram.ui.ActionBar.t6.Q0("Blue");
                    org.telegram.ui.ActionBar.s6 D0 = org.telegram.ui.ActionBar.t6.D0();
                    SparseArray sparseArray = Q0.a0;
                    int i16 = org.telegram.ui.ActionBar.t6.n;
                    org.telegram.ui.ActionBar.r6 r6Var = (org.telegram.ui.ActionBar.r6) sparseArray.get(i16);
                    if (r6Var != null) {
                        org.telegram.ui.ActionBar.m6 m6Var = new org.telegram.ui.ActionBar.m6();
                        m6Var.c = "d";
                        m6Var.a = "Blue_99_wp.jpg";
                        m6Var.b = "Blue_99_wp.jpg";
                        r6Var.y = m6Var;
                        Q0.v(m6Var);
                    }
                    if (Q0 == D0) {
                        if (Q0.Y == i16) {
                            org.telegram.ui.ActionBar.t6.u1(true);
                            break;
                        } else {
                            org.telegram.ui.ActionBar.t6.K1(D0, themeActivity.f == 1, i16, null);
                            themeActivity.a.g(themeActivity.q0);
                            break;
                        }
                    } else {
                        Q0.u(i16);
                        org.telegram.ui.ActionBar.t6.z1(Q0, true, false, true, false, false);
                        themeActivity.c.B1(Q0, null);
                        themeActivity.c.y0(0);
                        break;
                    }
                }
                break;
            case 20:
                m91 m91Var = ((q81) this.b).a;
                org.telegram.ui.ActionBar.s6 s6Var = m91Var.f0;
                org.telegram.ui.ActionBar.t6.l0(s6Var, m91Var.w, true);
                org.telegram.ui.ActionBar.t6.p();
                org.telegram.ui.ActionBar.t6.t1(false, false);
                org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.t4, s6Var, Boolean.valueOf(m91Var.g0), null, -1);
                m91Var.finishFragment();
                break;
            default:
                ((rc1) this.b).a.I0(true);
                break;
        }
    }

    @Override // zf.l1
    public void i(int i10) {
        fd1 fd1Var = (fd1) this.b;
        if (fd1Var.h == null && !fd1Var.f.e()) {
            fd1Var.w.f.e(false, true);
        }
        fd1Var.f();
    }

    @Override // org.telegram.messenger.o20
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        switch (this.a) {
            case 0:
                PasskeysActivity.a0((PasskeysActivity) this.b, (org.telegram.ui.Components.a51) obj, (View) obj2);
                break;
            default:
                b01 b01Var = (b01) this.b;
                org.telegram.ui.Components.a51 a51Var = (org.telegram.ui.Components.a51) obj;
                c01 c01Var = b01Var.w;
                if (a51Var.a == 30) {
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = b01Var.b;
                    if (tL_channels_sponsoredMessageReportResultChooseOption == null) {
                        TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = b01Var.c;
                        if (tL_reportResultChooseOption == null) {
                            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = b01Var.d;
                            if (tL_reportResultAddComment == null) {
                                c01.I0(c01Var, a51Var.l, null, null);
                                break;
                            } else {
                                byte[] bArr = tL_reportResultAddComment.option;
                                if (bArr != null) {
                                    c01.I0(c01Var, null, bArr, null);
                                    break;
                                }
                            }
                        } else {
                            TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(a51Var.d);
                            if (tL_messageReportOption != null) {
                                c01.I0(c01Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                                break;
                            }
                        }
                    } else {
                        TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(a51Var.d);
                        if (tL_sponsoredMessageReportOption != null) {
                            c01.I0(c01Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // org.telegram.messenger.pc
    public void q(Exception exc) {
        org.telegram.messenger.fe feVar = (org.telegram.messenger.fe) this.b;
        RectF rectF = ProfileActivity.R6;
        org.telegram.messenger.f8.e("mlkit: failed to detect language in selection", exc);
        feVar.run();
    }

    @Override // org.telegram.tgnet.RequestTimeDelegate
    public void run(long j10) {
        org.telegram.messenger.i0.g3(new bi.e((org.telegram.messenger.sz) this.b, j10, 18));
    }

    @Override // zf.l1
    public /* synthetic */ a0.h x() {
        return null;
    }

    @Override // zf.l1
    public /* synthetic */ void c0(ArrayList arrayList) {
    }
}
