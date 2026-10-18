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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rp0 implements org.telegram.ui.Cells.w5, org.telegram.ui.Components.o71, org.telegram.ui.ActionBar.a2, org.telegram.ui.ActionBar.l1, r0.n, Utilities.Callback2Return, org.telegram.ui.Cells.z4, LanguageDetector.ExceptionCallback, RequestTimeDelegate, Utilities.Callback5, org.telegram.ui.ActionBar.m2, org.telegram.ui.Components.yl0, jg.e, hg.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rp0(Object obj, int i10) {
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
                org.telegram.ui.Components.im0 im0Var = premiumPreviewFragment.a;
                i0.b bVar = premiumPreviewFragment.o0;
                AndroidUtilities.setViewLayoutMargins(im0Var, bVar.a, 0, bVar.c, 0);
                pw0 pw0Var = premiumPreviewFragment.U;
                i0.b bVar2 = premiumPreviewFragment.o0;
                pw0Var.setPadding(bVar2.a, 0, bVar2.c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.J;
                if (frameLayout != null) {
                    int i10 = premiumPreviewFragment.o0.a;
                    int dp = AndroidUtilities.dp(14.0f);
                    i0.b bVar3 = premiumPreviewFragment.o0;
                    frameLayout.setPadding(i10, dp, bVar3.c, bVar3.d);
                }
                break;
            default:
                og0 og0Var = (og0) ((qg1) this.b);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
                int i11 = defaultWindowInsets2.a;
                og0Var.M = i11;
                int i12 = defaultWindowInsets2.c;
                og0Var.N = i12;
                og0Var.L = defaultWindowInsets2.d;
                View view2 = og0Var.y.b;
                boolean z10 = view2 != null && view2.getVisibility() == 0;
                int dp2 = z10 ? AndroidUtilities.dp(44.0f) : 0;
                og0Var.y.setPadding(0, 0, 0, og0Var.L);
                int dp3 = AndroidUtilities.dp(72.0f) + og0Var.L + dp2;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) og0Var.H.getLayoutParams();
                if (marginLayoutParams.height != dp3) {
                    marginLayoutParams.height = dp3;
                    og0Var.H.setLayoutParams(marginLayoutParams);
                }
                int i13 = z10 ? og0Var.L + dp2 : 0;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) og0Var.c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i13 || marginLayoutParams2.leftMargin != i11 || marginLayoutParams2.rightMargin != i12) {
                    marginLayoutParams2.leftMargin = i11;
                    marginLayoutParams2.rightMargin = i12;
                    marginLayoutParams2.bottomMargin = i13;
                    og0Var.c.setLayoutParams(marginLayoutParams2);
                }
                og0Var.E.setPadding(i11, 0, i12, og0Var.L);
                if (z10) {
                    k1Var = k1Var.a.m(0, 0, 0, og0Var.L);
                }
                og0Var.i0();
                og0Var.h0();
                SparseArray sparseArray = og0Var.a;
                int size = sparseArray.size();
                for (int i14 = 0; i14 < size; i14++) {
                    og1 og1Var = (og1) sparseArray.valueAt(i14);
                    if (og1Var != null && (fragmentView = og1Var.a.getFragmentView()) != null) {
                        r0.i0.b(fragmentView, k1Var);
                    }
                }
                break;
        }
        return r0.k1.b;
    }

    @Override // hg.z1
    public /* synthetic */ a0.h J() {
        return null;
    }

    @Override // hg.z1
    public /* synthetic */ boolean O(int i10) {
        return true;
    }

    @Override // org.telegram.ui.Components.yl0
    public boolean a(int i10, View view) {
        switch (this.a) {
            case 16:
                break;
            case 17:
                final r91 r91Var = (r91) this.b;
                org.telegram.ui.ActionBar.b2[] b2VarArr = r91Var.h0;
                w81 w81Var = r91Var.X;
                int i11 = w81Var.I;
                if (i10 < i11 || i10 > w81Var.J) {
                    int i12 = w81Var.U;
                    if (i10 < i12 || i10 > w81Var.V) {
                        int i13 = w81Var.R;
                        if (i10 < i13 || i10 > w81Var.S) {
                            int i14 = w81Var.X;
                            if (i10 >= i14 && i10 <= w81Var.Y) {
                                ((k91) r91Var.P.get(i10 - i14)).c(r91Var.a, r91Var, b2VarArr, true);
                            }
                        } else {
                            ((k91) r91Var.O.get(i10 - i13)).c(r91Var.a, r91Var, b2VarArr, true);
                        }
                    } else {
                        ((k91) r91Var.Q.get(i10 - i12)).c(r91Var.a, r91Var, b2VarArr, true);
                    }
                } else {
                    final MessageObject messageObject = ((o91) r91Var.v0.get(i10 - i11)).b;
                    if (!messageObject.isStory()) {
                        org.telegram.ui.Components.i80 H = org.telegram.ui.Components.i80.H(r91Var, view);
                        final int i15 = 0;
                        H.c(R.drawable.msg_stats, LocaleController.getString(R.string.ViewMessageStatistic), new Runnable() { // from class: org.telegram.ui.m81
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i15) {
                                    case 0:
                                        r91 r91Var2 = r91Var;
                                        r91Var2.getClass();
                                        r91Var2.presentFragment(new vi0(messageObject));
                                        break;
                                    default:
                                        r91 r91Var3 = r91Var;
                                        r91Var3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", r91Var3.b);
                                        bundle.putInt("message_id", messageObject.getId());
                                        bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                        r91Var3.presentFragment(new sn(bundle), false);
                                        break;
                                }
                            }
                        }, false);
                        final int i16 = 1;
                        H.c(R.drawable.msg_msgbubble3, LocaleController.getString(R.string.ViewMessage), new Runnable() { // from class: org.telegram.ui.m81
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i16) {
                                    case 0:
                                        r91 r91Var2 = r91Var;
                                        r91Var2.getClass();
                                        r91Var2.presentFragment(new vi0(messageObject));
                                        break;
                                    default:
                                        r91 r91Var3 = r91Var;
                                        r91Var3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", r91Var3.b);
                                        bundle.putInt("message_id", messageObject.getId());
                                        bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                        r91Var3.presentFragment(new sn(bundle), false);
                                        break;
                                }
                            }
                        }, false);
                        H.W(r91Var.S.V0(view, false));
                        H.Z();
                    }
                }
                break;
            default:
                ((id1) this.b).J.a(i10, view);
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void b() {
        switch (this.a) {
            case 5:
                ((sv0) this.b).e();
                break;
            default:
                ((ad1) this.b).e();
                break;
        }
    }

    @Override // org.telegram.ui.Components.o71
    public void c(org.telegram.ui.Components.e00 e00Var) {
        MediaController.SavedFilterState savedFilterState = (MediaController.SavedFilterState) this.b;
        Drawable[] drawableArr = PhotoViewer.U8;
        e00Var.f(new org.telegram.ui.Components.f00(savedFilterState));
    }

    @Override // org.telegram.ui.Cells.z4
    public boolean d(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        lx0 lx0Var = (lx0) this.b;
        if (!z10) {
            return true;
        }
        lx0Var.d.U((Long) a5Var.getTag(), a5Var);
        return true;
    }

    @Override // hg.z1
    public void f(int i10) {
        mg1 mg1Var = (mg1) this.b;
        if (mg1Var.h == null && !mg1Var.f.e()) {
            mg1Var.v.f.e(false, true);
        }
        mg1Var.l();
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        int i12;
        int i13;
        switch (this.a) {
            case 2:
                PhotoViewer photoViewer = ((ys0) this.b).b;
                try {
                    AndroidUtilities.openForView(photoViewer.T4, photoViewer.y, photoViewer.v2, true);
                    photoViewer.G0(false, false);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 3:
                ((hv0) this.b).finishFragment();
                break;
            case 4:
                ((bv0) this.b).a.R.r();
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
                ((org.telegram.messenger.fk) this.b).run(1);
                break;
            case 13:
                ProxyListActivity proxyListActivity = ((k11) this.b).b;
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
                l11 l11Var = proxyListActivity.a;
                if (l11Var != null) {
                    if (SharedConfig.currentProxy == null) {
                        i11 = proxyListActivity.useProxyRow;
                        l11Var.n(i11, 0);
                    }
                    proxyListActivity.a.F();
                    break;
                }
                break;
            case 19:
                ThemeActivity themeActivity = ((la1) this.b).a;
                boolean k02 = ThemeActivity.k0(themeActivity, AndroidUtilities.isTablet() ? 18 : 16);
                if (ThemeActivity.Y(themeActivity, 17, true)) {
                    k02 = true;
                }
                if (k02) {
                    wa1 wa1Var = themeActivity.a;
                    i12 = themeActivity.textSizeRow;
                    wa1Var.n(i12, new Object());
                    wa1 wa1Var2 = themeActivity.a;
                    i13 = themeActivity.bubbleRadiusRow;
                    wa1Var2.n(i13, new Object());
                }
                if (themeActivity.c != null) {
                    org.telegram.ui.ActionBar.g6 O0 = org.telegram.ui.ActionBar.h6.O0("Blue");
                    org.telegram.ui.ActionBar.g6 B0 = org.telegram.ui.ActionBar.h6.B0();
                    SparseArray sparseArray = O0.a0;
                    int i17 = org.telegram.ui.ActionBar.h6.n;
                    org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) sparseArray.get(i17);
                    if (f6Var != null) {
                        org.telegram.ui.ActionBar.a6 a6Var = new org.telegram.ui.ActionBar.a6();
                        a6Var.c = "d";
                        a6Var.a = "Blue_99_wp.jpg";
                        a6Var.b = "Blue_99_wp.jpg";
                        f6Var.y = a6Var;
                        O0.v(a6Var);
                    }
                    if (O0 == B0) {
                        if (O0.Y == i17) {
                            org.telegram.ui.ActionBar.h6.p1(true);
                            break;
                        } else {
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, B0, Boolean.valueOf(themeActivity.f == 1), null, Integer.valueOf(i17));
                            themeActivity.a.m(themeActivity.q0);
                            break;
                        }
                    } else {
                        O0.u(i17);
                        org.telegram.ui.ActionBar.h6.u1(O0, true, false, true, false, false);
                        themeActivity.c.z1(O0);
                        themeActivity.c.x0(0);
                        break;
                    }
                }
                break;
            case 20:
                mc1 mc1Var = ((pb1) this.b).a;
                org.telegram.ui.ActionBar.h6.k0(mc1Var.e0, mc1Var.s, true);
                org.telegram.ui.ActionBar.h6.o();
                org.telegram.ui.ActionBar.h6.o1(false, false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, mc1Var.e0, Boolean.valueOf(mc1Var.f0), null, -1);
                mc1Var.finishFragment();
                break;
            default:
                ((uf1) this.b).a.E0(true);
                break;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        p21 p21Var = (p21) this.b;
        org.telegram.ui.Components.f61 f61Var = (org.telegram.ui.Components.f61) obj;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        q21 q21Var = p21Var.v;
        if (f61Var.a == 30) {
            TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = p21Var.b;
            if (tL_channels_sponsoredMessageReportResultChooseOption != null) {
                TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(f61Var.d);
                if (tL_sponsoredMessageReportOption != null) {
                    q21.I(q21Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                    return;
                }
                return;
            }
            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = p21Var.c;
            if (tL_reportResultChooseOption != null) {
                TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(f61Var.d);
                if (tL_messageReportOption != null) {
                    q21.I(q21Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                    return;
                }
                return;
            }
            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = p21Var.d;
            if (tL_reportResultAddComment == null) {
                q21.I(q21Var, f61Var.l, null, null);
                return;
            }
            byte[] bArr = tL_reportResultAddComment.option;
            if (bArr != null) {
                q21.I(q21Var, null, bArr, null);
            }
        }
    }

    @Override // hg.z1
    public /* synthetic */ a0.h y() {
        return null;
    }

    @Override // org.telegram.tgnet.RequestTimeDelegate
    public void run(long j10) {
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.mh((SharedConfig.ProxyInfo) this.b, j10, 1));
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        PrivacyControlActivity privacyControlActivity = ((ex0) this.b).d;
        if (((Integer) obj).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().isPremium()) {
                if (privacyControlActivity.z0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.yq yqVar = new org.telegram.ui.Components.yq(R.drawable.msg_mini_lock3, 0);
                    yqVar.translate(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
                    spannableString.setSpan(yqVar, 0, 1, 33);
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

    @Override // hg.z1
    public /* synthetic */ void Y(ArrayList arrayList) {
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        hg.d1 d1Var = (hg.d1) this.b;
        FileLog.e("mlkit: failed to detect language in selection", exc);
        d1Var.run();
    }
}
