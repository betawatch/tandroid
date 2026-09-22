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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tl0 implements Utilities.Callback5, org.telegram.ui.Cells.x5, org.telegram.ui.Components.t61, org.telegram.ui.ActionBar.a2, org.telegram.ui.ActionBar.m1, r0.n, Utilities.Callback2Return, org.telegram.ui.Cells.a5, LanguageDetector.ExceptionCallback, RequestTimeDelegate, org.telegram.ui.ActionBar.m2, org.telegram.ui.Components.bl0, ig.e, gg.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tl0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // gg.b2
    public /* synthetic */ a0.i F() {
        return null;
    }

    @Override // gg.b2
    public /* synthetic */ boolean O(int i10) {
        return true;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        View fragmentView;
        switch (this.a) {
            case 8:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                premiumPreviewFragment.o0 = defaultWindowInsets;
                premiumPreviewFragment.a.setPadding(0, defaultWindowInsets.b, 0, AndroidUtilities.dp(48.0f) + premiumPreviewFragment.o0.d);
                org.telegram.ui.Components.ll0 ll0Var = premiumPreviewFragment.a;
                i0.b bVar = premiumPreviewFragment.o0;
                AndroidUtilities.setViewLayoutMargins(ll0Var, bVar.a, 0, bVar.c, 0);
                jx0 jx0Var = premiumPreviewFragment.U;
                i0.b bVar2 = premiumPreviewFragment.o0;
                jx0Var.setPadding(bVar2.a, 0, bVar2.c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.J;
                if (frameLayout != null) {
                    int i10 = premiumPreviewFragment.o0.a;
                    int dp = AndroidUtilities.dp(14.0f);
                    i0.b bVar3 = premiumPreviewFragment.o0;
                    frameLayout.setPadding(i10, dp, bVar3.c, bVar3.d);
                }
                break;
            default:
                eh0 eh0Var = (eh0) ((bi1) this.b);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                int i11 = defaultWindowInsets2.a;
                eh0Var.M = i11;
                int i12 = defaultWindowInsets2.c;
                eh0Var.N = i12;
                eh0Var.L = defaultWindowInsets2.d;
                View view2 = eh0Var.y.b;
                boolean z10 = view2 != null && view2.getVisibility() == 0;
                int dp2 = z10 ? AndroidUtilities.dp(44.0f) : 0;
                eh0Var.y.setPadding(0, 0, 0, eh0Var.L);
                int dp3 = AndroidUtilities.dp(72.0f) + eh0Var.L + dp2;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) eh0Var.H.getLayoutParams();
                if (marginLayoutParams.height != dp3) {
                    marginLayoutParams.height = dp3;
                    eh0Var.H.setLayoutParams(marginLayoutParams);
                }
                int i13 = z10 ? eh0Var.L + dp2 : 0;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) eh0Var.c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i13 || marginLayoutParams2.leftMargin != i11 || marginLayoutParams2.rightMargin != i12) {
                    marginLayoutParams2.leftMargin = i11;
                    marginLayoutParams2.rightMargin = i12;
                    marginLayoutParams2.bottomMargin = i13;
                    eh0Var.c.setLayoutParams(marginLayoutParams2);
                }
                eh0Var.E.setPadding(i11, 0, i12, eh0Var.L);
                if (z10) {
                    l1Var = l1Var.a.m(0, 0, 0, eh0Var.L);
                }
                eh0Var.i0();
                eh0Var.h0();
                SparseArray sparseArray = eh0Var.a;
                int size = sparseArray.size();
                for (int i14 = 0; i14 < size; i14++) {
                    zh1 zh1Var = (zh1) sparseArray.valueAt(i14);
                    if (zh1Var != null && (fragmentView = zh1Var.a.getFragmentView()) != null) {
                        r0.i0.b(fragmentView, l1Var);
                    }
                }
                break;
        }
        return r0.l1.b;
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void a() {
        switch (this.a) {
            case 6:
                ((mw0) this.b).e();
                break;
            default:
                ((le1) this.b).e();
                break;
        }
    }

    @Override // org.telegram.ui.Components.t61
    public void b(org.telegram.ui.Components.vz vzVar) {
        MediaController.SavedFilterState savedFilterState = (MediaController.SavedFilterState) this.b;
        Drawable[] drawableArr = PhotoViewer.U8;
        vzVar.f(new org.telegram.ui.Components.wz(savedFilterState));
    }

    @Override // org.telegram.ui.Cells.a5
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        fy0 fy0Var = (fy0) this.b;
        if (!z10) {
            return true;
        }
        fy0Var.d.U((Long) b5Var.getTag(), b5Var);
        return true;
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean d(int i10, View view) {
        switch (this.a) {
            case 17:
                return ((u71) this.b).Q(i10, view);
            case 18:
                final za1 za1Var = (za1) this.b;
                org.telegram.ui.ActionBar.b2[] b2VarArr = za1Var.h0;
                ea1 ea1Var = za1Var.X;
                int i11 = ea1Var.I;
                if (i10 < i11 || i10 > ea1Var.J) {
                    int i12 = ea1Var.U;
                    if (i10 < i12 || i10 > ea1Var.V) {
                        int i13 = ea1Var.R;
                        if (i10 < i13 || i10 > ea1Var.S) {
                            int i14 = ea1Var.X;
                            if (i10 < i14 || i10 > ea1Var.Y) {
                                return false;
                            }
                            ((sa1) za1Var.P.get(i10 - i14)).c(za1Var.a, za1Var, b2VarArr, true);
                        } else {
                            ((sa1) za1Var.O.get(i10 - i13)).c(za1Var.a, za1Var, b2VarArr, true);
                        }
                    } else {
                        ((sa1) za1Var.Q.get(i10 - i12)).c(za1Var.a, za1Var, b2VarArr, true);
                    }
                } else {
                    final MessageObject messageObject = ((wa1) za1Var.v0.get(i10 - i11)).b;
                    if (messageObject.isStory()) {
                        return false;
                    }
                    org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(za1Var, view);
                    final int i15 = 0;
                    H.c(R.drawable.msg_stats, LocaleController.getString(R.string.ViewMessageStatistic), new Runnable() { // from class: org.telegram.ui.u91
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i15) {
                                case 0:
                                    za1 za1Var2 = za1Var;
                                    za1Var2.getClass();
                                    za1Var2.presentFragment(new jj0(messageObject));
                                    break;
                                default:
                                    za1 za1Var3 = za1Var;
                                    za1Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", za1Var3.b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    za1Var3.presentFragment(new bo(bundle), false);
                                    break;
                            }
                        }
                    }, false);
                    final int i16 = 1;
                    H.c(R.drawable.msg_msgbubble3, LocaleController.getString(R.string.ViewMessage), new Runnable() { // from class: org.telegram.ui.u91
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i16) {
                                case 0:
                                    za1 za1Var2 = za1Var;
                                    za1Var2.getClass();
                                    za1Var2.presentFragment(new jj0(messageObject));
                                    break;
                                default:
                                    za1 za1Var3 = za1Var;
                                    za1Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", za1Var3.b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    za1Var3.presentFragment(new bo(bundle), false);
                                    break;
                            }
                        }
                    }, false);
                    H.W(za1Var.S.V0(view, false));
                    H.Z();
                }
                return true;
            default:
                ((te1) this.b).J.d(i10, view);
                return true;
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        int i12;
        int i13;
        switch (this.a) {
            case 3:
                PhotoViewer photoViewer = ((qt0) this.b).b;
                try {
                    AndroidUtilities.openForView(photoViewer.T4, photoViewer.y, photoViewer.v2, true);
                    photoViewer.G0(false, false);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 4:
                ((aw0) this.b).finishFragment();
                break;
            case 5:
                ((uv0) this.b).a.R.r();
                break;
            case 7:
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
            case 11:
                ((org.telegram.messenger.nk) this.b).run(1);
                break;
            case 14:
                ProxyListActivity proxyListActivity = ((f21) this.b).b;
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
                g21 g21Var = proxyListActivity.a;
                if (g21Var != null) {
                    if (SharedConfig.currentProxy == null) {
                        i11 = proxyListActivity.useProxyRow;
                        g21Var.n(i11, 0);
                    }
                    proxyListActivity.a.F();
                    break;
                }
                break;
            case 20:
                ThemeActivity themeActivity = ((vb1) this.b).a;
                boolean k02 = ThemeActivity.k0(themeActivity, AndroidUtilities.isTablet() ? 18 : 16);
                if (ThemeActivity.Y(themeActivity, 17, true)) {
                    k02 = true;
                }
                if (k02) {
                    gc1 gc1Var = themeActivity.a;
                    i12 = themeActivity.textSizeRow;
                    gc1Var.n(i12, new Object());
                    gc1 gc1Var2 = themeActivity.a;
                    i13 = themeActivity.bubbleRadiusRow;
                    gc1Var2.n(i13, new Object());
                }
                if (themeActivity.c != null) {
                    org.telegram.ui.ActionBar.h6 N0 = org.telegram.ui.ActionBar.i6.N0("Blue");
                    org.telegram.ui.ActionBar.h6 A0 = org.telegram.ui.ActionBar.i6.A0();
                    SparseArray sparseArray = N0.a0;
                    int i17 = org.telegram.ui.ActionBar.i6.n;
                    org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) sparseArray.get(i17);
                    if (g6Var != null) {
                        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6();
                        b6Var.c = "d";
                        b6Var.a = "Blue_99_wp.jpg";
                        b6Var.b = "Blue_99_wp.jpg";
                        g6Var.y = b6Var;
                        N0.v(b6Var);
                    }
                    if (N0 == A0) {
                        if (N0.Y == i17) {
                            org.telegram.ui.ActionBar.i6.o1(true);
                            break;
                        } else {
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, A0, Boolean.valueOf(themeActivity.f == 1), null, Integer.valueOf(i17));
                            themeActivity.a.m(themeActivity.q0);
                            break;
                        }
                    } else {
                        N0.u(i17);
                        org.telegram.ui.ActionBar.i6.t1(N0, true, false, true, false, false);
                        themeActivity.c.y1(N0);
                        themeActivity.c.x0(0);
                        break;
                    }
                }
                break;
            case 21:
                wd1 wd1Var = ((zc1) this.b).a;
                org.telegram.ui.ActionBar.i6.j0(wd1Var.e0, wd1Var.s, true);
                org.telegram.ui.ActionBar.i6.o();
                org.telegram.ui.ActionBar.i6.n1(false, false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, wd1Var.e0, Boolean.valueOf(wd1Var.f0), null, -1);
                wd1Var.finishFragment();
                break;
            default:
                ((fh1) this.b).a.E0(true);
                break;
        }
    }

    @Override // gg.b2
    public void h(int i10) {
        xh1 xh1Var = (xh1) this.b;
        if (xh1Var.h == null && !xh1Var.f.e()) {
            xh1Var.v.f.e(false, true);
        }
        xh1Var.l();
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.a) {
            case 0:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                PasskeysActivity.W((PasskeysActivity) this.b, (org.telegram.ui.Components.i51) obj, (View) obj2);
                break;
            default:
                b41 b41Var = (b41) this.b;
                org.telegram.ui.Components.i51 i51Var = (org.telegram.ui.Components.i51) obj;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                c41 c41Var = b41Var.v;
                if (i51Var.a == 30) {
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = b41Var.b;
                    if (tL_channels_sponsoredMessageReportResultChooseOption == null) {
                        TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = b41Var.c;
                        if (tL_reportResultChooseOption == null) {
                            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = b41Var.d;
                            if (tL_reportResultAddComment == null) {
                                c41.H(c41Var, i51Var.l, null, null);
                                break;
                            } else {
                                byte[] bArr = tL_reportResultAddComment.option;
                                if (bArr != null) {
                                    c41.H(c41Var, null, bArr, null);
                                    break;
                                }
                            }
                        } else {
                            TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(i51Var.d);
                            if (tL_messageReportOption != null) {
                                c41.H(c41Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                                break;
                            }
                        }
                    } else {
                        TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(i51Var.d);
                        if (tL_sponsoredMessageReportOption != null) {
                            c41.H(c41Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // gg.b2
    public /* synthetic */ a0.i w() {
        return null;
    }

    @Override // org.telegram.tgnet.RequestTimeDelegate
    public void run(long j3) {
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.rh((SharedConfig.ProxyInfo) this.b, j3, 1));
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        PrivacyControlActivity privacyControlActivity = ((yx0) this.b).d;
        if (((Integer) obj).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().isPremium()) {
                if (privacyControlActivity.z0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(R.drawable.msg_mini_lock3, 0);
                    oqVar.translate(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
                    spannableString.setSpan(oqVar, 0, 1, 33);
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

    @Override // gg.b2
    public /* synthetic */ void Q(ArrayList arrayList) {
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        gg.e1 e1Var = (gg.e1) this.b;
        FileLog.e("mlkit: failed to detect language in selection", exc);
        e1Var.run();
    }
}
