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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class ul0 implements Utilities.Callback5, org.telegram.ui.Cells.y5, org.telegram.ui.Components.g71, org.telegram.ui.ActionBar.c2, org.telegram.ui.ActionBar.o1, r0.n, Utilities.Callback2Return, org.telegram.ui.Cells.a5, LanguageDetector.ExceptionCallback, RequestTimeDelegate, org.telegram.ui.ActionBar.o2, org.telegram.ui.Components.ll0, hg.e, fg.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ul0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // fg.c2
    public /* synthetic */ a0.i D() {
        return null;
    }

    @Override // fg.c2
    public /* synthetic */ a0.i P() {
        return null;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        View fragmentView;
        switch (this.a) {
            case 8:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                premiumPreviewFragment.o0 = defaultWindowInsets;
                premiumPreviewFragment.a.setPadding(0, defaultWindowInsets.b, 0, AndroidUtilities.dp(48.0f) + premiumPreviewFragment.o0.d);
                org.telegram.ui.Components.vl0 vl0Var = premiumPreviewFragment.a;
                i0.c cVar = premiumPreviewFragment.o0;
                AndroidUtilities.setViewLayoutMargins(vl0Var, cVar.a, 0, cVar.c, 0);
                lx0 lx0Var = premiumPreviewFragment.U;
                i0.c cVar2 = premiumPreviewFragment.o0;
                lx0Var.setPadding(cVar2.a, 0, cVar2.c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.J;
                if (frameLayout != null) {
                    int i10 = premiumPreviewFragment.o0.a;
                    int dp = AndroidUtilities.dp(14.0f);
                    i0.c cVar3 = premiumPreviewFragment.o0;
                    frameLayout.setPadding(i10, dp, cVar3.c, cVar3.d);
                }
                break;
            default:
                fh0 fh0Var = (fh0) ((gi1) this.b);
                i0.c defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                int i11 = defaultWindowInsets2.a;
                fh0Var.M = i11;
                int i12 = defaultWindowInsets2.c;
                fh0Var.N = i12;
                fh0Var.L = defaultWindowInsets2.d;
                View view2 = fh0Var.y.b;
                boolean z10 = view2 != null && view2.getVisibility() == 0;
                int dp2 = z10 ? AndroidUtilities.dp(44.0f) : 0;
                fh0Var.y.setPadding(0, 0, 0, fh0Var.L);
                int dp3 = AndroidUtilities.dp(72.0f) + fh0Var.L + dp2;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fh0Var.H.getLayoutParams();
                if (marginLayoutParams.height != dp3) {
                    marginLayoutParams.height = dp3;
                    fh0Var.H.setLayoutParams(marginLayoutParams);
                }
                int i13 = z10 ? fh0Var.L + dp2 : 0;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) fh0Var.c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i13 || marginLayoutParams2.leftMargin != i11 || marginLayoutParams2.rightMargin != i12) {
                    marginLayoutParams2.leftMargin = i11;
                    marginLayoutParams2.rightMargin = i12;
                    marginLayoutParams2.bottomMargin = i13;
                    fh0Var.c.setLayoutParams(marginLayoutParams2);
                }
                fh0Var.E.setPadding(i11, 0, i12, fh0Var.L);
                if (z10) {
                    l1Var = l1Var.a.m(0, 0, 0, fh0Var.L);
                }
                fh0Var.i0();
                fh0Var.h0();
                SparseArray sparseArray = fh0Var.a;
                int size = sparseArray.size();
                for (int i14 = 0; i14 < size; i14++) {
                    ei1 ei1Var = (ei1) sparseArray.valueAt(i14);
                    if (ei1Var != null && (fragmentView = ei1Var.a.getFragmentView()) != null) {
                        r0.i0.b(fragmentView, l1Var);
                    }
                }
                break;
        }
        return r0.l1.b;
    }

    @Override // fg.c2
    public void a(int i10) {
        ci1 ci1Var = (ci1) this.b;
        if (ci1Var.h == null && !ci1Var.f.e()) {
            ci1Var.v.f.e(false, true);
        }
        ci1Var.l();
    }

    @Override // org.telegram.ui.ActionBar.o1
    public void b() {
        switch (this.a) {
            case 6:
                ((ow0) this.b).e();
                break;
            default:
                ((pe1) this.b).e();
                break;
        }
    }

    @Override // org.telegram.ui.Components.g71
    public void c(org.telegram.ui.Components.c00 c00Var) {
        MediaController.SavedFilterState savedFilterState = (MediaController.SavedFilterState) this.b;
        Drawable[] drawableArr = PhotoViewer.T8;
        c00Var.f(new org.telegram.ui.Components.d00(savedFilterState));
    }

    @Override // fg.c2
    public /* synthetic */ boolean c0(int i10) {
        return true;
    }

    @Override // org.telegram.ui.Components.ll0
    public boolean d(int i10, View view) {
        switch (this.a) {
            case 17:
                return ((z71) this.b).Q(i10, view);
            case 18:
                final fb1 fb1Var = (fb1) this.b;
                org.telegram.ui.ActionBar.d2[] d2VarArr = fb1Var.h0;
                ka1 ka1Var = fb1Var.X;
                int i11 = ka1Var.I;
                if (i10 < i11 || i10 > ka1Var.J) {
                    int i12 = ka1Var.U;
                    if (i10 < i12 || i10 > ka1Var.V) {
                        int i13 = ka1Var.R;
                        if (i10 < i13 || i10 > ka1Var.S) {
                            int i14 = ka1Var.X;
                            if (i10 < i14 || i10 > ka1Var.Y) {
                                return false;
                            }
                            ((ya1) fb1Var.P.get(i10 - i14)).c(fb1Var.a, fb1Var, d2VarArr, true);
                        } else {
                            ((ya1) fb1Var.O.get(i10 - i13)).c(fb1Var.a, fb1Var, d2VarArr, true);
                        }
                    } else {
                        ((ya1) fb1Var.Q.get(i10 - i12)).c(fb1Var.a, fb1Var, d2VarArr, true);
                    }
                } else {
                    final MessageObject messageObject = ((cb1) fb1Var.v0.get(i10 - i11)).b;
                    if (messageObject.isStory()) {
                        return false;
                    }
                    org.telegram.ui.Components.w70 H = org.telegram.ui.Components.w70.H(fb1Var, view);
                    final int i15 = 0;
                    H.c(R.drawable.msg_stats, LocaleController.getString(R.string.ViewMessageStatistic), new Runnable() { // from class: org.telegram.ui.aa1
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i15) {
                                case 0:
                                    fb1 fb1Var2 = fb1Var;
                                    fb1Var2.getClass();
                                    fb1Var2.presentFragment(new kj0(messageObject));
                                    break;
                                default:
                                    fb1 fb1Var3 = fb1Var;
                                    fb1Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", fb1Var3.b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    fb1Var3.presentFragment(new eo(bundle), false);
                                    break;
                            }
                        }
                    }, false);
                    final int i16 = 1;
                    H.c(R.drawable.msg_msgbubble3, LocaleController.getString(R.string.ViewMessage), new Runnable() { // from class: org.telegram.ui.aa1
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i16) {
                                case 0:
                                    fb1 fb1Var2 = fb1Var;
                                    fb1Var2.getClass();
                                    fb1Var2.presentFragment(new kj0(messageObject));
                                    break;
                                default:
                                    fb1 fb1Var3 = fb1Var;
                                    fb1Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", fb1Var3.b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    fb1Var3.presentFragment(new eo(bundle), false);
                                    break;
                            }
                        }
                    }, false);
                    H.W(fb1Var.S.U0(view, false));
                    H.Z();
                }
                return true;
            default:
                ((xe1) this.b).J.d(i10, view);
                return true;
        }
    }

    @Override // org.telegram.ui.Cells.a5
    public boolean e(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        jy0 jy0Var = (jy0) this.b;
        if (!z10) {
            return true;
        }
        jy0Var.d.U((Long) b5Var.getTag(), b5Var);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        switch (this.a) {
            case 3:
                PhotoViewer photoViewer = ((pt0) this.b).b;
                try {
                    AndroidUtilities.openForView(photoViewer.T4, photoViewer.y, photoViewer.v2, true);
                    photoViewer.G0(false, false);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 4:
                ((bw0) this.b).finishFragment();
                break;
            case 5:
                ((vv0) this.b).a.R.r();
                break;
            case 7:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.b;
                int i15 = PopupNotificationActivity.b0;
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
            case 11:
                ((org.telegram.messenger.vk) this.b).run(1);
                break;
            case 14:
                ProxyListActivity proxyListActivity = ((k21) this.b).b;
                ArrayList arrayList = proxyListActivity.H;
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
                l21 l21Var = proxyListActivity.a;
                if (l21Var != null) {
                    if (SharedConfig.currentProxy == null) {
                        i11 = proxyListActivity.useProxyRow;
                        l21Var.n(i11, 0);
                        l21 l21Var2 = proxyListActivity.a;
                        i12 = proxyListActivity.callsRow;
                        l21Var2.n(i12, 0);
                    }
                    proxyListActivity.a.F();
                    break;
                }
                break;
            case 20:
                ThemeActivity themeActivity = ((zb1) this.b).a;
                boolean k02 = ThemeActivity.k0(themeActivity, AndroidUtilities.isTablet() ? 18 : 16);
                if (ThemeActivity.Y(themeActivity, 17, true)) {
                    k02 = true;
                }
                if (k02) {
                    kc1 kc1Var = themeActivity.a;
                    i13 = themeActivity.textSizeRow;
                    kc1Var.n(i13, new Object());
                    kc1 kc1Var2 = themeActivity.a;
                    i14 = themeActivity.bubbleRadiusRow;
                    kc1Var2.n(i14, new Object());
                }
                if (themeActivity.c != null) {
                    org.telegram.ui.ActionBar.i6 N0 = org.telegram.ui.ActionBar.j6.N0("Blue");
                    org.telegram.ui.ActionBar.i6 A0 = org.telegram.ui.ActionBar.j6.A0();
                    SparseArray sparseArray = N0.a0;
                    int i18 = org.telegram.ui.ActionBar.j6.n;
                    org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) sparseArray.get(i18);
                    if (h6Var != null) {
                        org.telegram.ui.ActionBar.c6 c6Var = new org.telegram.ui.ActionBar.c6();
                        c6Var.c = "d";
                        c6Var.a = "Blue_99_wp.jpg";
                        c6Var.b = "Blue_99_wp.jpg";
                        h6Var.y = c6Var;
                        N0.v(c6Var);
                    }
                    if (N0 == A0) {
                        if (N0.Y == i18) {
                            org.telegram.ui.ActionBar.j6.o1(true);
                            break;
                        } else {
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, A0, Boolean.valueOf(themeActivity.f == 1), null, Integer.valueOf(i18));
                            themeActivity.a.m(themeActivity.q0);
                            break;
                        }
                    } else {
                        N0.u(i18);
                        org.telegram.ui.ActionBar.j6.t1(N0, true, false, true, false, false);
                        themeActivity.c.x1(N0);
                        themeActivity.c.x0(0);
                        break;
                    }
                }
                break;
            case 21:
                ae1 ae1Var = ((dd1) this.b).a;
                org.telegram.ui.ActionBar.j6.j0(ae1Var.e0, ae1Var.s, true);
                org.telegram.ui.ActionBar.j6.o();
                org.telegram.ui.ActionBar.j6.n1(false, false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, ae1Var.e0, Boolean.valueOf(ae1Var.f0), null, -1);
                ae1Var.finishFragment();
                break;
            default:
                ((kh1) this.b).a.E0(true);
                break;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.a) {
            case 0:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                PasskeysActivity.W((PasskeysActivity) this.b, (org.telegram.ui.Components.v51) obj, (View) obj2);
                break;
            default:
                g41 g41Var = (g41) this.b;
                org.telegram.ui.Components.v51 v51Var = (org.telegram.ui.Components.v51) obj;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                h41 h41Var = g41Var.v;
                if (v51Var.a == 30) {
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = g41Var.b;
                    if (tL_channels_sponsoredMessageReportResultChooseOption == null) {
                        TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = g41Var.c;
                        if (tL_reportResultChooseOption == null) {
                            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = g41Var.d;
                            if (tL_reportResultAddComment == null) {
                                h41.H(h41Var, v51Var.l, null, null);
                                break;
                            } else {
                                byte[] bArr = tL_reportResultAddComment.option;
                                if (bArr != null) {
                                    h41.H(h41Var, null, bArr, null);
                                    break;
                                }
                            }
                        } else {
                            TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(v51Var.d);
                            if (tL_messageReportOption != null) {
                                h41.H(h41Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                                break;
                            }
                        }
                    } else {
                        TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(v51Var.d);
                        if (tL_sponsoredMessageReportOption != null) {
                            h41.H(h41Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // org.telegram.tgnet.RequestTimeDelegate
    public void run(long j3) {
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.zh((SharedConfig.ProxyInfo) this.b, j3, 1));
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        PrivacyControlActivity privacyControlActivity = ((ay0) this.b).d;
        if (((Integer) obj).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().isPremium()) {
                if (privacyControlActivity.z0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.uq uqVar = new org.telegram.ui.Components.uq(R.drawable.msg_mini_lock3, 0);
                    uqVar.translate(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
                    spannableString.setSpan(uqVar, 0, 1, 33);
                    privacyControlActivity.z0 = spannableString;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) privacyControlActivity.z0);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralStringComma("Stars", num.intValue()));
                return spannableStringBuilder;
            }
            return LocaleController.formatPluralStringComma("Stars", num.intValue());
        }
        return LocaleController.formatNumber(num.intValue(), ',');
    }

    @Override // fg.c2
    public /* synthetic */ void k0(ArrayList arrayList) {
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        fg.f1 f1Var = (fg.f1) this.b;
        FileLog.e("mlkit: failed to detect language in selection", exc);
        f1Var.run();
    }
}
