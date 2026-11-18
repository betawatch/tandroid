package org.telegram.ui;

import android.content.Intent;
import android.graphics.RectF;
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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class qi0 implements org.telegram.messenger.v10, org.telegram.ui.Cells.w5, org.telegram.ui.ActionBar.r1, org.telegram.ui.ActionBar.g1, r0.m, org.telegram.messenger.r10, org.telegram.ui.Cells.a5, org.telegram.messenger.mc, RequestTimeDelegate, org.telegram.ui.ActionBar.g2, org.telegram.ui.Components.qj0, lg.e, jg.y1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qi0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // jg.y1
    public /* synthetic */ a0.h K0() {
        return null;
    }

    @Override // r0.m
    public r0.l1 P0(View view, r0.l1 l1Var) {
        View fragmentView;
        switch (this.a) {
            case 7:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
                premiumPreviewFragment.p0 = I0;
                premiumPreviewFragment.a.setPadding(0, I0.b, 0, org.telegram.messenger.g0.L(48.0f) + premiumPreviewFragment.p0.d);
                org.telegram.ui.Components.ck0 ck0Var = premiumPreviewFragment.a;
                i0.b bVar = premiumPreviewFragment.p0;
                org.telegram.messenger.g0.z3(ck0Var, bVar.a, 0, bVar.c, 0);
                vs0 vs0Var = premiumPreviewFragment.V;
                i0.b bVar2 = premiumPreviewFragment.p0;
                vs0Var.setPadding(bVar2.a, 0, bVar2.c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.K;
                if (frameLayout != null) {
                    int i7 = premiumPreviewFragment.p0.a;
                    int L = org.telegram.messenger.g0.L(14.0f);
                    i0.b bVar3 = premiumPreviewFragment.p0;
                    frameLayout.setPadding(i7, L, bVar3.c, bVar3.d);
                }
                break;
            default:
                me0 me0Var = (me0) ((qb1) this.b);
                i0.b I02 = org.telegram.messenger.g0.I0(l1Var, false);
                int i10 = I02.a;
                me0Var.N = i10;
                int i11 = I02.c;
                me0Var.O = i11;
                me0Var.M = I02.d;
                boolean a10 = me0Var.E.a();
                int L2 = a10 ? org.telegram.messenger.g0.L(44.0f) : 0;
                me0Var.E.setPadding(0, 0, 0, me0Var.M);
                int L3 = org.telegram.messenger.g0.L(72.0f) + me0Var.M + L2;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) me0Var.I.getLayoutParams();
                if (marginLayoutParams.height != L3) {
                    marginLayoutParams.height = L3;
                    me0Var.I.setLayoutParams(marginLayoutParams);
                }
                int i12 = a10 ? me0Var.M + L2 : 0;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) me0Var.c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i12 || marginLayoutParams2.leftMargin != i10 || marginLayoutParams2.rightMargin != i11) {
                    marginLayoutParams2.leftMargin = i10;
                    marginLayoutParams2.rightMargin = i11;
                    marginLayoutParams2.bottomMargin = i12;
                    me0Var.c.setLayoutParams(marginLayoutParams2);
                }
                me0Var.F.setPadding(i10, 0, i11, me0Var.M);
                if (a10) {
                    l1Var = l1Var.a.m(0, 0, 0, me0Var.M);
                }
                me0Var.o0();
                me0Var.n0();
                SparseArray sparseArray = me0Var.a;
                int size = sparseArray.size();
                for (int i13 = 0; i13 < size; i13++) {
                    ob1 ob1Var = (ob1) sparseArray.valueAt(i13);
                    if (ob1Var != null && (fragmentView = ob1Var.a.getFragmentView()) != null) {
                        r0.i0.b(fragmentView, l1Var);
                    }
                }
                break;
        }
        return r0.l1.b;
    }

    @Override // org.telegram.ui.ActionBar.g1
    public void a() {
        switch (this.a) {
            case 5:
                ((as0) this.b).e();
                break;
            default:
                ((i81) this.b).e();
                break;
        }
    }

    @Override // org.telegram.ui.Cells.a5
    public boolean b(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        rt0 rt0Var = (rt0) this.b;
        if (!z10) {
            return true;
        }
        rt0Var.d.Z((Long) b5Var.getTag(), b5Var);
        return true;
    }

    @Override // org.telegram.ui.Components.qj0
    public boolean c(int i7, View view) {
        switch (this.a) {
            case 16:
                return ((d21) this.b).f1(i7, view);
            default:
                ((p81) this.b).K.c(i7, view);
                return true;
        }
    }

    @Override // jg.y1
    public /* synthetic */ a0.h d1() {
        return null;
    }

    @Override // org.telegram.messenger.r10
    public Object g(Number number, Object obj) {
        Integer num = (Integer) obj;
        PrivacyControlActivity privacyControlActivity = ((kt0) this.b).d;
        if (((Integer) number).intValue() != 0) {
            return org.telegram.messenger.gd.E(num.intValue(), ',');
        }
        if (privacyControlActivity.getUserConfig().q()) {
            return org.telegram.messenger.gd.H(',', "Stars", num.intValue());
        }
        if (privacyControlActivity.B0 == null) {
            SpannableString spannableString = new SpannableString("l");
            org.telegram.ui.Components.lq lqVar = new org.telegram.ui.Components.lq(R.drawable.msg_mini_lock3, 0);
            float L = org.telegram.messenger.g0.L(2.0f);
            float L2 = org.telegram.messenger.g0.L(1.0f);
            lqVar.r = L;
            lqVar.s = L2;
            spannableString.setSpan(lqVar, 0, 1, 33);
            privacyControlActivity.B0 = spannableString;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) privacyControlActivity.B0);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.H(',', "Stars", num.intValue()));
        return spannableStringBuilder;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10;
        int i11;
        int i12;
        switch (this.a) {
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) ((ca.i) this.b).c;
                try {
                    org.telegram.messenger.g0.u2(photoViewer.T4, photoViewer.E, photoViewer.w2, true);
                    photoViewer.z0(false, false);
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 3:
                ((pr0) this.b).finishFragment();
                break;
            case 4:
                ((jr0) this.b).a.S.r();
                break;
            case 6:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.b;
                int i13 = PopupNotificationActivity.c0;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
                    popupNotificationActivity.startActivity(intent);
                    break;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            case 10:
                ut0 ut0Var = (ut0) this.b;
                RectF rectF = ProfileActivity.Z6;
                ut0Var.a(1);
                break;
            case 13:
                ProxyListActivity proxyListActivity = (ProxyListActivity) ((mi0) this.b).c;
                ArrayList arrayList = proxyListActivity.F;
                int size = arrayList.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList.get(i14);
                    i14++;
                    org.telegram.messenger.bz.i((org.telegram.messenger.az) obj);
                }
                if (org.telegram.messenger.bz.B1 == null) {
                    proxyListActivity.d = false;
                }
                org.telegram.messenger.ks.e().n(proxyListActivity, org.telegram.messenger.ks.D4);
                org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.D4, new Object[0]);
                org.telegram.messenger.ks.e().c(proxyListActivity, org.telegram.messenger.ks.D4);
                proxyListActivity.h0(true);
                l4 l4Var = proxyListActivity.a;
                if (l4Var != null) {
                    if (org.telegram.messenger.bz.B1 == null) {
                        i10 = proxyListActivity.useProxyRow;
                        l4Var.h(i10, 0);
                    }
                    proxyListActivity.a.F();
                    break;
                }
                break;
            case 18:
                ThemeActivity themeActivity = ((w51) this.b).a;
                boolean p02 = ThemeActivity.p0(themeActivity, org.telegram.messenger.g0.Q1() ? 18 : 16);
                if (ThemeActivity.d0(themeActivity, 17, true)) {
                    p02 = true;
                }
                if (p02) {
                    g61 g61Var = themeActivity.a;
                    i11 = themeActivity.textSizeRow;
                    g61Var.h(i11, new Object());
                    g61 g61Var2 = themeActivity.a;
                    i12 = themeActivity.bubbleRadiusRow;
                    g61Var2.h(i12, new Object());
                }
                if (themeActivity.c != null) {
                    org.telegram.ui.ActionBar.m6 Q0 = org.telegram.ui.ActionBar.n6.Q0("Blue");
                    org.telegram.ui.ActionBar.m6 D0 = org.telegram.ui.ActionBar.n6.D0();
                    SparseArray sparseArray = Q0.b0;
                    int i15 = org.telegram.ui.ActionBar.n6.n;
                    org.telegram.ui.ActionBar.k6 k6Var = (org.telegram.ui.ActionBar.k6) sparseArray.get(i15);
                    if (k6Var != null) {
                        org.telegram.ui.ActionBar.e6 e6Var = new org.telegram.ui.ActionBar.e6();
                        e6Var.c = "d";
                        e6Var.a = "Blue_99_wp.jpg";
                        e6Var.b = "Blue_99_wp.jpg";
                        k6Var.y = e6Var;
                        Q0.v(e6Var);
                    }
                    if (Q0 == D0) {
                        if (Q0.Z == i15) {
                            org.telegram.ui.ActionBar.n6.u1(true);
                            break;
                        } else {
                            org.telegram.ui.ActionBar.n6.K1(D0, themeActivity.f == 1, i15, null);
                            themeActivity.a.g(themeActivity.r0);
                            break;
                        }
                    } else {
                        Q0.u(i15);
                        org.telegram.ui.ActionBar.n6.z1(Q0, true, false, true, false, false);
                        themeActivity.c.B1(Q0, null);
                        themeActivity.c.y0(0);
                        break;
                    }
                }
                break;
            case 19:
                x71 x71Var = ((a71) this.b).a;
                org.telegram.ui.ActionBar.m6 m6Var = x71Var.g0;
                org.telegram.ui.ActionBar.n6.l0(m6Var, x71Var.w, true);
                org.telegram.ui.ActionBar.n6.p();
                org.telegram.ui.ActionBar.n6.t1(false, false);
                org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.w4, m6Var, Boolean.valueOf(x71Var.h0), null, -1);
                x71Var.finishFragment();
                break;
            default:
                ((za1) this.b).a.J0(true);
                break;
        }
    }

    @Override // org.telegram.messenger.v10
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        switch (this.a) {
            case 0:
                PasskeysActivity.b0((PasskeysActivity) this.b, (org.telegram.ui.Components.l41) obj, (View) obj2);
                break;
            default:
                py0 py0Var = (py0) this.b;
                org.telegram.ui.Components.l41 l41Var = (org.telegram.ui.Components.l41) obj;
                qy0 qy0Var = py0Var.w;
                if (l41Var.a == 30) {
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = py0Var.b;
                    if (tL_channels_sponsoredMessageReportResultChooseOption == null) {
                        TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = py0Var.c;
                        if (tL_reportResultChooseOption == null) {
                            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = py0Var.d;
                            if (tL_reportResultAddComment == null) {
                                qy0.J0(qy0Var, l41Var.m, null, null);
                                break;
                            } else {
                                byte[] bArr = tL_reportResultAddComment.option;
                                if (bArr != null) {
                                    qy0.J0(qy0Var, null, bArr, null);
                                    break;
                                }
                            }
                        } else {
                            TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(l41Var.d);
                            if (tL_messageReportOption != null) {
                                qy0.J0(qy0Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                                break;
                            }
                        }
                    } else {
                        TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(l41Var.d);
                        if (tL_sponsoredMessageReportOption != null) {
                            qy0.J0(qy0Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // org.telegram.messenger.mc
    public void q(Exception exc) {
        bi.c5 c5Var = (bi.c5) this.b;
        RectF rectF = ProfileActivity.Z6;
        org.telegram.messenger.a8.e("mlkit: failed to detect language in selection", exc);
        c5Var.run();
    }

    @Override // jg.y1
    public void r(int i7) {
        mb1 mb1Var = (mb1) this.b;
        if (mb1Var.h == null && !mb1Var.f.e()) {
            mb1Var.w.f.e(false, true);
        }
        mb1Var.f();
    }

    @Override // org.telegram.tgnet.RequestTimeDelegate
    public void run(long j3) {
        org.telegram.messenger.g0.g3(new qx0((org.telegram.messenger.az) this.b, j3, 0));
    }

    @Override // jg.y1
    public /* synthetic */ boolean v1(int i7) {
        return true;
    }

    @Override // jg.y1
    public /* synthetic */ void P1(ArrayList arrayList) {
    }
}
