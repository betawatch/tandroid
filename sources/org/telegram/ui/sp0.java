package org.telegram.ui;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class sp0 implements org.telegram.ui.Cells.x5, org.telegram.ui.Components.y71, org.telegram.ui.ActionBar.z1, org.telegram.ui.ActionBar.l1, r0.n, Utilities.Callback2Return, org.telegram.ui.Cells.z4, LanguageDetector.ExceptionCallback, RequestTimeDelegate, Utilities.Callback5, org.telegram.ui.ActionBar.n2, org.telegram.ui.Components.cm0, jg.e, hg.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sp0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // r0.n
    public r0.k1 B0(View view, r0.k1 k1Var) {
        View fragmentView;
        switch (this.a) {
            case 7:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
                premiumPreviewFragment.o0 = defaultWindowInsets;
                premiumPreviewFragment.a.setPadding(0, defaultWindowInsets.b, 0, AndroidUtilities.dp(48.0f) + premiumPreviewFragment.o0.d);
                org.telegram.ui.Components.mm0 mm0Var = premiumPreviewFragment.a;
                i0.b bVar = premiumPreviewFragment.o0;
                AndroidUtilities.setViewLayoutMargins(mm0Var, bVar.a, 0, bVar.c, 0);
                rw0 rw0Var = premiumPreviewFragment.U;
                i0.b bVar2 = premiumPreviewFragment.o0;
                rw0Var.setPadding(bVar2.a, 0, bVar2.c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.J;
                if (frameLayout != null) {
                    int i10 = premiumPreviewFragment.o0.a;
                    int dp = AndroidUtilities.dp(14.0f);
                    i0.b bVar3 = premiumPreviewFragment.o0;
                    frameLayout.setPadding(i10, dp, bVar3.c, bVar3.d);
                }
                break;
            default:
                rg0 rg0Var = (rg0) ((ug1) this.b);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
                int i11 = defaultWindowInsets2.a;
                rg0Var.M = i11;
                int i12 = defaultWindowInsets2.c;
                rg0Var.N = i12;
                rg0Var.L = defaultWindowInsets2.d;
                View view2 = rg0Var.y.b;
                boolean z10 = view2 != null && view2.getVisibility() == 0;
                int dp2 = z10 ? AndroidUtilities.dp(44.0f) : 0;
                rg0Var.y.setPadding(0, 0, 0, rg0Var.L);
                int dp3 = AndroidUtilities.dp(72.0f) + rg0Var.L + dp2;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) rg0Var.H.getLayoutParams();
                if (marginLayoutParams.height != dp3) {
                    marginLayoutParams.height = dp3;
                    rg0Var.H.setLayoutParams(marginLayoutParams);
                }
                int i13 = z10 ? rg0Var.L + dp2 : 0;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) rg0Var.c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i13 || marginLayoutParams2.leftMargin != i11 || marginLayoutParams2.rightMargin != i12) {
                    marginLayoutParams2.leftMargin = i11;
                    marginLayoutParams2.rightMargin = i12;
                    marginLayoutParams2.bottomMargin = i13;
                    rg0Var.c.setLayoutParams(marginLayoutParams2);
                }
                rg0Var.E.setPadding(i11, 0, i12, rg0Var.L);
                if (z10) {
                    k1Var = k1Var.a.m(0, 0, 0, rg0Var.L);
                }
                rg0Var.i0();
                rg0Var.h0();
                SparseArray sparseArray = rg0Var.a;
                int size = sparseArray.size();
                for (int i14 = 0; i14 < size; i14++) {
                    sg1 sg1Var = (sg1) sparseArray.valueAt(i14);
                    if (sg1Var != null && (fragmentView = sg1Var.a.getFragmentView()) != null) {
                        r0.i0.b(fragmentView, k1Var);
                    }
                }
                break;
        }
        return r0.k1.b;
    }

    @Override // hg.z1
    public /* synthetic */ a0.h G() {
        return null;
    }

    @Override // hg.z1
    public /* synthetic */ boolean O(int i10) {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void a() {
        switch (this.a) {
            case 5:
                ((uv0) this.b).e();
                break;
            default:
                ((ed1) this.b).e();
                break;
        }
    }

    @Override // org.telegram.ui.Components.y71
    public void b(org.telegram.ui.Components.e00 e00Var) {
        MediaController.SavedFilterState savedFilterState = (MediaController.SavedFilterState) this.b;
        Drawable[] drawableArr = PhotoViewer.U8;
        e00Var.f(new org.telegram.ui.Components.f00(savedFilterState));
    }

    @Override // org.telegram.ui.Cells.z4
    public boolean c(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        nx0 nx0Var = (nx0) this.b;
        if (!z10) {
            return true;
        }
        nx0Var.d.U((Long) a5Var.getTag(), a5Var);
        return true;
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean d(int i10, View view) {
        switch (this.a) {
            case 16:
                break;
            case 17:
                final u91 u91Var = (u91) this.b;
                org.telegram.ui.ActionBar.c2[] c2VarArr = u91Var.h0;
                z81 z81Var = u91Var.X;
                int i11 = z81Var.I;
                if (i10 < i11 || i10 > z81Var.J) {
                    int i12 = z81Var.U;
                    if (i10 < i12 || i10 > z81Var.V) {
                        int i13 = z81Var.R;
                        if (i10 < i13 || i10 > z81Var.S) {
                            int i14 = z81Var.X;
                            if (i10 >= i14 && i10 <= z81Var.Y) {
                                ((n91) u91Var.P.get(i10 - i14)).c(u91Var.a, u91Var, c2VarArr, true);
                            }
                        } else {
                            ((n91) u91Var.O.get(i10 - i13)).c(u91Var.a, u91Var, c2VarArr, true);
                        }
                    } else {
                        ((n91) u91Var.Q.get(i10 - i12)).c(u91Var.a, u91Var, c2VarArr, true);
                    }
                } else {
                    final MessageObject messageObject = ((r91) u91Var.v0.get(i10 - i11)).b;
                    if (!messageObject.isStory()) {
                        org.telegram.ui.Components.j80 H = org.telegram.ui.Components.j80.H(u91Var, view);
                        final int i15 = 0;
                        H.c(R.drawable.msg_stats, LocaleController.getString(R.string.ViewMessageStatistic), new Runnable() { // from class: org.telegram.ui.p81
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i15) {
                                    case 0:
                                        u91 u91Var2 = u91Var;
                                        u91Var2.getClass();
                                        u91Var2.presentFragment(new yi0(messageObject));
                                        break;
                                    default:
                                        u91 u91Var3 = u91Var;
                                        u91Var3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", u91Var3.b);
                                        bundle.putInt("message_id", messageObject.getId());
                                        bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                        u91Var3.presentFragment(new sn(bundle), false);
                                        break;
                                }
                            }
                        }, false);
                        final int i16 = 1;
                        H.c(R.drawable.msg_msgbubble3, LocaleController.getString(R.string.ViewMessage), new Runnable() { // from class: org.telegram.ui.p81
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i16) {
                                    case 0:
                                        u91 u91Var2 = u91Var;
                                        u91Var2.getClass();
                                        u91Var2.presentFragment(new yi0(messageObject));
                                        break;
                                    default:
                                        u91 u91Var3 = u91Var;
                                        u91Var3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", u91Var3.b);
                                        bundle.putInt("message_id", messageObject.getId());
                                        bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                        u91Var3.presentFragment(new sn(bundle), false);
                                        break;
                                }
                            }
                        }, false);
                        H.W(u91Var.S.W0(view, false));
                        H.Z();
                    }
                }
                break;
            default:
                ((md1) this.b).J.d(i10, view);
                break;
        }
        return true;
    }

    @Override // hg.z1
    public void f(int i10) {
        qg1 qg1Var = (qg1) this.b;
        if (qg1Var.h == null && !qg1Var.f.e()) {
            qg1Var.v.f.e(false, true);
        }
        qg1Var.l();
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        int i11;
        int i12;
        int i13;
        switch (this.a) {
            case 2:
                PhotoViewer photoViewer = ((zs0) this.b).b;
                try {
                    AndroidUtilities.openForView(photoViewer.T4, photoViewer.y, photoViewer.v2, true);
                    photoViewer.H0(false, false);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 3:
                ((iv0) this.b).finishFragment();
                break;
            case 4:
                ((cv0) this.b).a.R.s();
                break;
            case 6:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.b;
                int i14 = PopupNotificationActivity.b0;
                popupNotificationActivity.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    popupNotificationActivity.startActivity(intent);
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 10:
                ((org.telegram.messenger.hk) this.b).run(1);
                break;
            case 13:
                ProxyListActivity proxyListActivity = ((m11) this.b).b;
                ArrayList arrayList = proxyListActivity.F;
                int size = arrayList.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj = arrayList.get(i15);
                    i15++;
                    SharedConfig.deleteProxy((SharedConfig.ProxyInfo) obj);
                }
                if (SharedConfig.currentProxy == null) {
                    proxyListActivity.d = false;
                }
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                int i16 = NotificationCenter.proxySettingsChanged;
                globalInstance.removeObserver(proxyListActivity, i16);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(i16, new Object[0]);
                NotificationCenter.getGlobalInstance().addObserver(proxyListActivity, i16);
                proxyListActivity.b0(true);
                n11 n11Var = proxyListActivity.a;
                if (n11Var != null) {
                    if (SharedConfig.currentProxy == null) {
                        i11 = proxyListActivity.useProxyRow;
                        n11Var.n(i11, 0);
                    }
                    proxyListActivity.a.F();
                    break;
                }
                break;
            case 19:
                ThemeActivity themeActivity = ((oa1) this.b).a;
                boolean k02 = ThemeActivity.k0(themeActivity, AndroidUtilities.isTablet() ? 18 : 16);
                if (ThemeActivity.Y(themeActivity, 17, true)) {
                    k02 = true;
                }
                if (k02) {
                    za1 za1Var = themeActivity.a;
                    i12 = themeActivity.textSizeRow;
                    za1Var.n(i12, new Object());
                    za1 za1Var2 = themeActivity.a;
                    i13 = themeActivity.bubbleRadiusRow;
                    za1Var2.n(i13, new Object());
                }
                if (themeActivity.c != null) {
                    org.telegram.ui.ActionBar.j6 P0 = org.telegram.ui.ActionBar.k6.P0("Blue");
                    org.telegram.ui.ActionBar.j6 C0 = org.telegram.ui.ActionBar.k6.C0();
                    SparseArray sparseArray = P0.a0;
                    int i17 = org.telegram.ui.ActionBar.k6.n;
                    org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) sparseArray.get(i17);
                    if (i6Var != null) {
                        org.telegram.ui.ActionBar.d6 d6Var = new org.telegram.ui.ActionBar.d6();
                        d6Var.c = "d";
                        d6Var.a = "Blue_99_wp.jpg";
                        d6Var.b = "Blue_99_wp.jpg";
                        i6Var.y = d6Var;
                        P0.v(d6Var);
                    }
                    if (P0 == C0) {
                        if (P0.Y == i17) {
                            org.telegram.ui.ActionBar.k6.r1(true);
                            break;
                        } else {
                            org.telegram.ui.ActionBar.k6.H1(C0, themeActivity.f == 1, i17, null);
                            themeActivity.a.m(themeActivity.q0);
                            break;
                        }
                    } else {
                        P0.u(i17);
                        org.telegram.ui.ActionBar.k6.w1(P0, true, false, true, false, false);
                        themeActivity.c.E1(P0, null);
                        themeActivity.c.x0(0);
                        break;
                    }
                }
                break;
            case 20:
                qc1 qc1Var = ((tb1) this.b).a;
                org.telegram.ui.ActionBar.k6.k0(qc1Var.f0, qc1Var.v, true);
                org.telegram.ui.ActionBar.k6.o();
                org.telegram.ui.ActionBar.k6.q1(false, false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, qc1Var.f0, Boolean.valueOf(qc1Var.g0), null, -1);
                qc1Var.finishFragment();
                break;
            default:
                ((zf1) this.b).a.E0(true);
                break;
        }
    }

    @Override // org.telegram.tgnet.RequestTimeDelegate
    public void run(long j10) {
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.oh((SharedConfig.ProxyInfo) this.b, j10, 1));
    }

    @Override // hg.z1
    public /* synthetic */ a0.h x() {
        return null;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        r21 r21Var = (r21) this.b;
        org.telegram.ui.Components.m61 m61Var = (org.telegram.ui.Components.m61) obj;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        s21 s21Var = r21Var.v;
        if (m61Var.a == 30) {
            TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = r21Var.b;
            if (tL_channels_sponsoredMessageReportResultChooseOption != null) {
                TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(m61Var.d);
                if (tL_sponsoredMessageReportOption != null) {
                    s21.J(s21Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                    return;
                }
                return;
            }
            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = r21Var.c;
            if (tL_reportResultChooseOption != null) {
                TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(m61Var.d);
                if (tL_messageReportOption != null) {
                    s21.J(s21Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                    return;
                }
                return;
            }
            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = r21Var.d;
            if (tL_reportResultAddComment == null) {
                s21.J(s21Var, m61Var.l, null, null);
                return;
            }
            byte[] bArr = tL_reportResultAddComment.option;
            if (bArr != null) {
                s21.J(s21Var, null, bArr, null);
            }
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        PrivacyControlActivity privacyControlActivity = ((gx0) this.b).d;
        if (((Integer) obj).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().isPremium()) {
                if (privacyControlActivity.A0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.xq xqVar = new org.telegram.ui.Components.xq(R.drawable.msg_mini_lock3, 0);
                    xqVar.translate(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
                    spannableString.setSpan(xqVar, 0, 1, 33);
                    privacyControlActivity.A0 = spannableString;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) privacyControlActivity.A0);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralStringComma("Stars", num.intValue()));
                return spannableStringBuilder;
            }
            return LocaleController.formatPluralStringComma("Stars", num.intValue());
        }
        return LocaleController.formatNumber(num.intValue(), ',');
    }

    @Override // hg.z1
    public /* synthetic */ void S(ArrayList arrayList) {
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        hg.d1 d1Var = (hg.d1) this.b;
        FileLog.e("mlkit: failed to detect language in selection", exc);
        d1Var.run();
    }
}
