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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rj0 implements org.telegram.messenger.p20, org.telegram.ui.Cells.z5, org.telegram.ui.Components.k61, org.telegram.ui.ActionBar.u1, org.telegram.ui.ActionBar.j1, r0.m, org.telegram.messenger.l20, org.telegram.ui.Cells.d5, org.telegram.messenger.qc, RequestTimeDelegate, org.telegram.ui.ActionBar.j2, org.telegram.ui.Components.jk0, bg.g, zf.l1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rj0(Object obj, int i10) {
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
                org.telegram.ui.Components.uk0 uk0Var = premiumPreviewFragment.a;
                i0.c cVar = premiumPreviewFragment.o0;
                org.telegram.messenger.i0.A3(uk0Var, cVar.a, 0, cVar.c, 0);
                cu0 cu0Var = premiumPreviewFragment.U;
                i0.c cVar2 = premiumPreviewFragment.o0;
                cu0Var.setPadding(cVar2.a, 0, cVar2.c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.J;
                if (frameLayout != null) {
                    int i10 = premiumPreviewFragment.o0.a;
                    int L = org.telegram.messenger.i0.L(14.0f);
                    i0.c cVar3 = premiumPreviewFragment.o0;
                    frameLayout.setPadding(i10, L, cVar3.c, cVar3.d);
                }
                break;
            default:
                of0 of0Var = (of0) ((hd1) this.b);
                i0.c I02 = org.telegram.messenger.i0.I0(j1Var, false);
                int i11 = I02.a;
                of0Var.M = i11;
                int i12 = I02.c;
                of0Var.N = i12;
                of0Var.L = I02.d;
                boolean a2 = of0Var.D.a();
                int L2 = a2 ? org.telegram.messenger.i0.L(44.0f) : 0;
                of0Var.D.setPadding(0, 0, 0, of0Var.L);
                int L3 = org.telegram.messenger.i0.L(72.0f) + of0Var.L + L2;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) of0Var.H.getLayoutParams();
                if (marginLayoutParams.height != L3) {
                    marginLayoutParams.height = L3;
                    of0Var.H.setLayoutParams(marginLayoutParams);
                }
                int i13 = a2 ? of0Var.L + L2 : 0;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) of0Var.c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i13 || marginLayoutParams2.leftMargin != i11 || marginLayoutParams2.rightMargin != i12) {
                    marginLayoutParams2.leftMargin = i11;
                    marginLayoutParams2.rightMargin = i12;
                    marginLayoutParams2.bottomMargin = i13;
                    of0Var.c.setLayoutParams(marginLayoutParams2);
                }
                of0Var.E.setPadding(i11, 0, i12, of0Var.L);
                if (a2) {
                    j1Var = j1Var.a.m(0, 0, 0, of0Var.L);
                }
                of0Var.o0();
                of0Var.n0();
                SparseArray sparseArray = of0Var.a;
                int size = sparseArray.size();
                for (int i14 = 0; i14 < size; i14++) {
                    fd1 fd1Var = (fd1) sparseArray.valueAt(i14);
                    if (fd1Var != null && (fragmentView = fd1Var.a.getFragmentView()) != null) {
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
                ((jt0) this.b).e();
                break;
            default:
                ((v91) this.b).e();
                break;
        }
    }

    @Override // org.telegram.ui.Components.k61
    public void b(org.telegram.ui.Components.gz gzVar) {
        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) this.b;
        Drawable[] drawableArr = PhotoViewer.U8;
        gzVar.d(new n2.u(gfVar, 10));
    }

    @Override // org.telegram.ui.Cells.d5
    public boolean c(org.telegram.ui.Cells.e5 e5Var, boolean z10) {
        yu0 yu0Var = (yu0) this.b;
        if (!z10) {
            return true;
        }
        yu0Var.d.Z((Long) e5Var.getTag(), e5Var);
        return true;
    }

    @Override // org.telegram.messenger.l20
    public Object d(Number number, Object obj) {
        Integer num = (Integer) obj;
        PrivacyControlActivity privacyControlActivity = ((ru0) this.b).d;
        if (((Integer) number).intValue() != 0) {
            return org.telegram.messenger.dd.E(num.intValue(), ',');
        }
        if (privacyControlActivity.getUserConfig().q()) {
            return org.telegram.messenger.dd.H(',', "Stars", num.intValue());
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
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.dd.H(',', "Stars", num.intValue()));
        return spannableStringBuilder;
    }

    @Override // org.telegram.ui.Components.jk0
    public boolean f(int i10, View view) {
        switch (this.a) {
            case 17:
                return ((r31) this.b).e1(i10, view);
            default:
                ((ca1) this.b).J.f(i10, view);
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
                ((zs0) this.b).finishFragment();
                break;
            case 5:
                ((ts0) this.b).a.R.r();
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
                cv0 cv0Var = (cv0) this.b;
                RectF rectF = ProfileActivity.S6;
                cv0Var.a(1);
                break;
            case 14:
                ProxyListActivity proxyListActivity = (ProxyListActivity) ((nj0) this.b).c;
                ArrayList arrayList = proxyListActivity.E;
                int size = arrayList.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj = arrayList.get(i15);
                    i15++;
                    org.telegram.messenger.uz.i((org.telegram.messenger.tz) obj);
                }
                if (org.telegram.messenger.uz.B1 == null) {
                    proxyListActivity.d = false;
                }
                org.telegram.messenger.at.e().n(proxyListActivity, org.telegram.messenger.at.A4);
                org.telegram.messenger.at.e().k(org.telegram.messenger.at.A4, new Object[0]);
                org.telegram.messenger.at.e().c(proxyListActivity, org.telegram.messenger.at.A4);
                proxyListActivity.h0(true);
                fg.j jVar = proxyListActivity.a;
                if (jVar != null) {
                    if (org.telegram.messenger.uz.B1 == null) {
                        i11 = proxyListActivity.useProxyRow;
                        jVar.h(i11, 0);
                    }
                    proxyListActivity.a.F();
                    break;
                }
                break;
            case 19:
                ThemeActivity themeActivity = ((l71) this.b).a;
                boolean p02 = ThemeActivity.p0(themeActivity, org.telegram.messenger.i0.Q1() ? 18 : 16);
                if (ThemeActivity.d0(themeActivity, 17, true)) {
                    p02 = true;
                }
                if (p02) {
                    v71 v71Var = themeActivity.a;
                    i12 = themeActivity.textSizeRow;
                    v71Var.h(i12, new Object());
                    v71 v71Var2 = themeActivity.a;
                    i13 = themeActivity.bubbleRadiusRow;
                    v71Var2.h(i13, new Object());
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
                k91 k91Var = ((o81) this.b).a;
                org.telegram.ui.ActionBar.s6 s6Var = k91Var.f0;
                org.telegram.ui.ActionBar.t6.l0(s6Var, k91Var.w, true);
                org.telegram.ui.ActionBar.t6.p();
                org.telegram.ui.ActionBar.t6.t1(false, false);
                org.telegram.messenger.at.e().k(org.telegram.messenger.at.t4, s6Var, Boolean.valueOf(k91Var.g0), null, -1);
                k91Var.finishFragment();
                break;
            default:
                ((pc1) this.b).a.J0(true);
                break;
        }
    }

    @Override // zf.l1
    public void i(int i10) {
        dd1 dd1Var = (dd1) this.b;
        if (dd1Var.h == null && !dd1Var.f.e()) {
            dd1Var.w.f.e(false, true);
        }
        dd1Var.f();
    }

    @Override // org.telegram.messenger.p20
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        switch (this.a) {
            case 0:
                PasskeysActivity.b0((PasskeysActivity) this.b, (org.telegram.ui.Components.b51) obj, (View) obj2);
                break;
            default:
                a01 a01Var = (a01) this.b;
                org.telegram.ui.Components.b51 b51Var = (org.telegram.ui.Components.b51) obj;
                b01 b01Var = a01Var.w;
                if (b51Var.a == 30) {
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = a01Var.b;
                    if (tL_channels_sponsoredMessageReportResultChooseOption == null) {
                        TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = a01Var.c;
                        if (tL_reportResultChooseOption == null) {
                            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = a01Var.d;
                            if (tL_reportResultAddComment == null) {
                                b01.I0(b01Var, b51Var.l, null, null);
                                break;
                            } else {
                                byte[] bArr = tL_reportResultAddComment.option;
                                if (bArr != null) {
                                    b01.I0(b01Var, null, bArr, null);
                                    break;
                                }
                            }
                        } else {
                            TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(b51Var.d);
                            if (tL_messageReportOption != null) {
                                b01.I0(b01Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                                break;
                            }
                        }
                    } else {
                        TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(b51Var.d);
                        if (tL_sponsoredMessageReportOption != null) {
                            b01.I0(b01Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // org.telegram.messenger.qc
    public void p(Exception exc) {
        org.telegram.messenger.ge geVar = (org.telegram.messenger.ge) this.b;
        RectF rectF = ProfileActivity.S6;
        org.telegram.messenger.f8.e("mlkit: failed to detect language in selection", exc);
        geVar.run();
    }

    @Override // org.telegram.tgnet.RequestTimeDelegate
    public void run(long j10) {
        org.telegram.messenger.i0.g3(new bi.e((org.telegram.messenger.tz) this.b, j10, 18));
    }

    @Override // zf.l1
    public /* synthetic */ a0.h x() {
        return null;
    }

    @Override // zf.l1
    public /* synthetic */ void c0(ArrayList arrayList) {
    }
}
