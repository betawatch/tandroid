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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zk0 implements Utilities.Callback5, org.telegram.ui.Cells.v5, org.telegram.ui.Components.k61, org.telegram.ui.ActionBar.b2, org.telegram.ui.ActionBar.n1, r0.o, Utilities.Callback2Return, org.telegram.ui.Cells.y4, LanguageDetector.ExceptionCallback, RequestTimeDelegate, org.telegram.ui.ActionBar.n2, org.telegram.ui.Components.bl0, tf.e, rf.j1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zk0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // rf.j1
    public /* synthetic */ boolean A(int i10) {
        return true;
    }

    @Override // r0.o
    public r0.m1 I0(View view, r0.m1 m1Var) {
        View fragmentView;
        switch (this.a) {
            case 8:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
                premiumPreviewFragment.k0 = defaultWindowInsets;
                premiumPreviewFragment.a.setPadding(0, defaultWindowInsets.b, 0, AndroidUtilities.dp(48.0f) + premiumPreviewFragment.k0.d);
                org.telegram.ui.Components.jl0 jl0Var = premiumPreviewFragment.a;
                i0.b bVar = premiumPreviewFragment.k0;
                AndroidUtilities.setViewLayoutMargins(jl0Var, bVar.a, 0, bVar.c, 0);
                ew0 ew0Var = premiumPreviewFragment.Q;
                i0.b bVar2 = premiumPreviewFragment.k0;
                ew0Var.setPadding(bVar2.a, 0, bVar2.c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.F;
                if (frameLayout != null) {
                    int i10 = premiumPreviewFragment.k0.a;
                    int dp = AndroidUtilities.dp(14.0f);
                    i0.b bVar3 = premiumPreviewFragment.k0;
                    frameLayout.setPadding(i10, dp, bVar3.c, bVar3.d);
                }
                break;
            default:
                ng0 ng0Var = (ng0) ((vg1) this.b);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
                int i11 = defaultWindowInsets2.a;
                ng0Var.I = i11;
                int i12 = defaultWindowInsets2.c;
                ng0Var.J = i12;
                ng0Var.H = defaultWindowInsets2.d;
                View view2 = ng0Var.y.b;
                boolean z10 = view2 != null && view2.getVisibility() == 0;
                int dp2 = z10 ? AndroidUtilities.dp(44.0f) : 0;
                ng0Var.y.setPadding(0, 0, 0, ng0Var.H);
                int dp3 = AndroidUtilities.dp(72.0f) + ng0Var.H + dp2;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ng0Var.D.getLayoutParams();
                if (marginLayoutParams.height != dp3) {
                    marginLayoutParams.height = dp3;
                    ng0Var.D.setLayoutParams(marginLayoutParams);
                }
                int i13 = z10 ? ng0Var.H + dp2 : 0;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) ng0Var.c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i13 || marginLayoutParams2.leftMargin != i11 || marginLayoutParams2.rightMargin != i12) {
                    marginLayoutParams2.leftMargin = i11;
                    marginLayoutParams2.rightMargin = i12;
                    marginLayoutParams2.bottomMargin = i13;
                    ng0Var.c.setLayoutParams(marginLayoutParams2);
                }
                ng0Var.A.setPadding(i11, 0, i12, ng0Var.H);
                if (z10) {
                    m1Var = m1Var.a.m(0, 0, 0, ng0Var.H);
                }
                ng0Var.i0();
                ng0Var.h0();
                SparseArray sparseArray = ng0Var.a;
                int size = sparseArray.size();
                for (int i14 = 0; i14 < size; i14++) {
                    tg1 tg1Var = (tg1) sparseArray.valueAt(i14);
                    if (tg1Var != null && (fragmentView = tg1Var.a.getFragmentView()) != null) {
                        r0.j0.b(fragmentView, m1Var);
                    }
                }
                break;
        }
        return r0.m1.b;
    }

    @Override // org.telegram.ui.ActionBar.n1
    public void a() {
        switch (this.a) {
            case 6:
                ((iv0) this.b).e();
                break;
            default:
                ((fd1) this.b).e();
                break;
        }
    }

    @Override // org.telegram.ui.Components.k61
    public void b(org.telegram.ui.Components.qz qzVar) {
        MediaController.SavedFilterState savedFilterState = (MediaController.SavedFilterState) this.b;
        Drawable[] drawableArr = PhotoViewer.P8;
        qzVar.f(new org.telegram.ui.Components.rz(savedFilterState));
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean c(int i10, View view) {
        switch (this.a) {
            case 17:
                return ((q61) this.b).Q(i10, view);
            case 18:
                final t91 t91Var = (t91) this.b;
                org.telegram.ui.ActionBar.c2[] c2VarArr = t91Var.d0;
                y81 y81Var = t91Var.T;
                int i11 = y81Var.E;
                if (i10 < i11 || i10 > y81Var.F) {
                    int i12 = y81Var.Q;
                    if (i10 < i12 || i10 > y81Var.R) {
                        int i13 = y81Var.N;
                        if (i10 < i13 || i10 > y81Var.O) {
                            int i14 = y81Var.T;
                            if (i10 < i14 || i10 > y81Var.U) {
                                return false;
                            }
                            ((m91) t91Var.L.get(i10 - i14)).c(t91Var.a, t91Var, c2VarArr, true);
                        } else {
                            ((m91) t91Var.K.get(i10 - i13)).c(t91Var.a, t91Var, c2VarArr, true);
                        }
                    } else {
                        ((m91) t91Var.M.get(i10 - i12)).c(t91Var.a, t91Var, c2VarArr, true);
                    }
                } else {
                    final MessageObject messageObject = ((q91) t91Var.r0.get(i10 - i11)).b;
                    if (messageObject.isStory()) {
                        return false;
                    }
                    org.telegram.ui.Components.j70 H = org.telegram.ui.Components.j70.H(t91Var, view);
                    final int i15 = 0;
                    H.c(R.drawable.msg_stats, LocaleController.getString(R.string.ViewMessageStatistic), new Runnable() { // from class: org.telegram.ui.o81
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i15) {
                                case 0:
                                    t91 t91Var2 = t91Var;
                                    t91Var2.getClass();
                                    t91Var2.presentFragment(new si0(messageObject));
                                    break;
                                default:
                                    t91 t91Var3 = t91Var;
                                    t91Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", t91Var3.b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    t91Var3.presentFragment(new tn(bundle), false);
                                    break;
                            }
                        }
                    }, false);
                    final int i16 = 1;
                    H.c(R.drawable.msg_msgbubble3, LocaleController.getString(R.string.ViewMessage), new Runnable() { // from class: org.telegram.ui.o81
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i16) {
                                case 0:
                                    t91 t91Var2 = t91Var;
                                    t91Var2.getClass();
                                    t91Var2.presentFragment(new si0(messageObject));
                                    break;
                                default:
                                    t91 t91Var3 = t91Var;
                                    t91Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", t91Var3.b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    t91Var3.presentFragment(new tn(bundle), false);
                                    break;
                            }
                        }
                    }, false);
                    H.W(t91Var.O.V0(view, false));
                    H.Z();
                }
                return true;
            default:
                ((md1) this.b).F.c(i10, view);
                return true;
        }
    }

    @Override // org.telegram.ui.Cells.y4
    public boolean d(org.telegram.ui.Cells.z4 z4Var, boolean z10) {
        ax0 ax0Var = (ax0) this.b;
        if (!z10) {
            return true;
        }
        ax0Var.d.U((Long) z4Var.getTag(), z4Var);
        return true;
    }

    @Override // rf.j1
    public void f(int i10) {
        rg1 rg1Var = (rg1) this.b;
        if (rg1Var.h == null && !rg1Var.f.e()) {
            rg1Var.v.f.e(false, true);
        }
        rg1Var.l();
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        switch (this.a) {
            case 3:
                PhotoViewer photoViewer = ((ms0) this.b).b;
                try {
                    AndroidUtilities.openForView(photoViewer.P4, photoViewer.y, photoViewer.r2, true);
                    photoViewer.G0(false, false);
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 4:
                ((vu0) this.b).finishFragment();
                break;
            case 5:
                ((pu0) this.b).a.N.r();
                break;
            case 7:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.b;
                int i15 = PopupNotificationActivity.X;
                popupNotificationActivity.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    popupNotificationActivity.startActivity(intent);
                    break;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            case 11:
                ((org.telegram.messenger.kk) this.b).run(1);
                break;
            case 14:
                ProxyListActivity proxyListActivity = ((b11) this.b).b;
                ArrayList arrayList = proxyListActivity.D;
                int size = arrayList.size();
                int i16 = 0;
                while (i16 < size) {
                    Object obj = arrayList.get(i16);
                    i16++;
                    SharedConfig.deleteProxy((SharedConfig.ProxyInfo) obj);
                }
                if (SharedConfig.currentProxy == null) {
                    proxyListActivity.e = false;
                    proxyListActivity.d = false;
                }
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                int i17 = NotificationCenter.proxySettingsChanged;
                globalInstance.removeObserver(proxyListActivity, i17);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(i17, new Object[0]);
                NotificationCenter.getGlobalInstance().addObserver(proxyListActivity, i17);
                proxyListActivity.c0(true);
                c11 c11Var = proxyListActivity.a;
                if (c11Var != null) {
                    if (SharedConfig.currentProxy == null) {
                        i11 = proxyListActivity.useProxyRow;
                        c11Var.n(i11, 0);
                        c11 c11Var2 = proxyListActivity.a;
                        i12 = proxyListActivity.callsRow;
                        c11Var2.n(i12, 0);
                    }
                    proxyListActivity.a.F();
                    break;
                }
                break;
            case 20:
                ThemeActivity themeActivity = ((na1) this.b).a;
                boolean k02 = ThemeActivity.k0(themeActivity, AndroidUtilities.isTablet() ? 18 : 16);
                if (ThemeActivity.Y(themeActivity, 17, true)) {
                    k02 = true;
                }
                if (k02) {
                    ya1 ya1Var = themeActivity.a;
                    i13 = themeActivity.textSizeRow;
                    ya1Var.n(i13, new Object());
                    ya1 ya1Var2 = themeActivity.a;
                    i14 = themeActivity.bubbleRadiusRow;
                    ya1Var2.n(i14, new Object());
                }
                if (themeActivity.c != null) {
                    org.telegram.ui.ActionBar.f6 N0 = org.telegram.ui.ActionBar.g6.N0("Blue");
                    org.telegram.ui.ActionBar.f6 A0 = org.telegram.ui.ActionBar.g6.A0();
                    SparseArray sparseArray = N0.W;
                    int i18 = org.telegram.ui.ActionBar.g6.n;
                    org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) sparseArray.get(i18);
                    if (e6Var != null) {
                        org.telegram.ui.ActionBar.z5 z5Var = new org.telegram.ui.ActionBar.z5();
                        z5Var.c = "d";
                        z5Var.a = "Blue_99_wp.jpg";
                        z5Var.b = "Blue_99_wp.jpg";
                        e6Var.y = z5Var;
                        N0.v(z5Var);
                    }
                    if (N0 == A0) {
                        if (N0.U == i18) {
                            org.telegram.ui.ActionBar.g6.o1(true);
                            break;
                        } else {
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, A0, Boolean.valueOf(themeActivity.f == 1), null, Integer.valueOf(i18));
                            themeActivity.a.m(themeActivity.m0);
                            break;
                        }
                    } else {
                        N0.u(i18);
                        org.telegram.ui.ActionBar.g6.t1(N0, true, false, true, false, false);
                        themeActivity.c.y1(N0);
                        themeActivity.c.x0(0);
                        break;
                    }
                }
                break;
            case 21:
                qc1 qc1Var = ((sb1) this.b).a;
                org.telegram.ui.ActionBar.g6.j0(qc1Var.a0, qc1Var.s, true);
                org.telegram.ui.ActionBar.g6.o();
                org.telegram.ui.ActionBar.g6.n1(false, false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, qc1Var.a0, Boolean.valueOf(qc1Var.b0), null, -1);
                qc1Var.finishFragment();
                break;
            default:
                ((ag1) this.b).a.E0(true);
                break;
        }
    }

    @Override // rf.j1
    public /* synthetic */ a0.h q() {
        return null;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.a) {
            case 0:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                PasskeysActivity.W((PasskeysActivity) this.b, (org.telegram.ui.Components.w41) obj, (View) obj2);
                break;
            default:
                x21 x21Var = (x21) this.b;
                org.telegram.ui.Components.w41 w41Var = (org.telegram.ui.Components.w41) obj;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                y21 y21Var = x21Var.v;
                if (w41Var.a == 30) {
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = x21Var.b;
                    if (tL_channels_sponsoredMessageReportResultChooseOption == null) {
                        TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = x21Var.c;
                        if (tL_reportResultChooseOption == null) {
                            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = x21Var.d;
                            if (tL_reportResultAddComment == null) {
                                y21.G(y21Var, w41Var.l, null, null);
                                break;
                            } else {
                                byte[] bArr = tL_reportResultAddComment.option;
                                if (bArr != null) {
                                    y21.G(y21Var, null, bArr, null);
                                    break;
                                }
                            }
                        } else {
                            TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(w41Var.d);
                            if (tL_messageReportOption != null) {
                                y21.G(y21Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                                break;
                            }
                        }
                    } else {
                        TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(w41Var.d);
                        if (tL_sponsoredMessageReportOption != null) {
                            y21.G(y21Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // rf.j1
    public /* synthetic */ a0.h t() {
        return null;
    }

    @Override // org.telegram.tgnet.RequestTimeDelegate
    public void run(long j10) {
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.qh((SharedConfig.ProxyInfo) this.b, j10, 1));
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        PrivacyControlActivity privacyControlActivity = ((tw0) this.b).d;
        if (((Integer) obj).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().isPremium()) {
                if (privacyControlActivity.v0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.iq iqVar = new org.telegram.ui.Components.iq(R.drawable.msg_mini_lock3, 0);
                    iqVar.translate(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
                    spannableString.setSpan(iqVar, 0, 1, 33);
                    privacyControlActivity.v0 = spannableString;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) privacyControlActivity.v0);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralStringComma("Stars", num.intValue()));
                return spannableStringBuilder;
            }
            return LocaleController.formatPluralStringComma("Stars", num.intValue());
        }
        return LocaleController.formatNumber(num.intValue(), ',');
    }

    @Override // rf.j1
    public /* synthetic */ void E(ArrayList arrayList) {
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        ih.m2 m2Var = (ih.m2) this.b;
        FileLog.e("mlkit: failed to detect language in selection", exc);
        m2Var.run();
    }
}
