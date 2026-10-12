package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0160 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0169 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ee  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v11 */
    @Override // android.view.View.OnLongClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onLongClick(View view) {
        WebBackForwardList webBackForwardList;
        TLRPC.User user;
        boolean b10;
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.m80 F;
        it0 it0Var;
        switch (this.a) {
            case 0:
                final k4 k4Var = (k4) this.b;
                ArrayList arrayList = k4Var.d0;
                ?? r52 = 0;
                if (k4Var.u0[0] != null) {
                    float f7 = k4Var.h0.M.d;
                    x3 x3Var = k4Var.K;
                    org.telegram.ui.Components.m80 F2 = org.telegram.ui.Components.m80.F(x3Var != null ? x3Var.c : k4Var.f0, null, view);
                    int x02 = SharedConfig.adaptableColorInBrowser ? org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Pk, false) : k4Var.u0[0].getBackgroundColor();
                    int x03 = SharedConfig.adaptableColorInBrowser ? org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G6, false) : AndroidUtilities.computePerceivedBrightness(k4Var.u0[0].getBackgroundColor()) >= 0.721f ? -16777216 : -1;
                    int m12 = org.telegram.ui.ActionBar.g6.m1(0.65f, x03);
                    org.telegram.ui.web.y0 webView = k4Var.u0[0].getWebView();
                    if (webView != null) {
                        WebBackForwardList copyBackForwardList = webView.copyBackForwardList();
                        int currentIndex = copyBackForwardList.getCurrentIndex();
                        if (copyBackForwardList.getCurrentIndex() > 0) {
                            int i10 = 0;
                            while (i10 < currentIndex) {
                                WebHistoryItem itemAtIndex = copyBackForwardList.getItemAtIndex(i10);
                                F2.c(r52, itemAtIndex.getTitle(), new hg.n(currentIndex, i10, webView, 5), r52);
                                org.telegram.ui.ActionBar.e1 y3 = F2.y();
                                if (y3 != null) {
                                    y3.setSubtext(itemAtIndex.getUrl());
                                    Bitmap bitmap = (Bitmap) webView.P.get(itemAtIndex.getUrl());
                                    if (bitmap == null) {
                                        bitmap = itemAtIndex.getFavicon();
                                    }
                                    webBackForwardList = copyBackForwardList;
                                    y3.g(itemAtIndex.getTitle(), 0, new o0(bitmap, new Paint(3), 0));
                                    y3.setTextColor(x03);
                                    y3.setSubtextColor(m12);
                                } else {
                                    webBackForwardList = copyBackForwardList;
                                }
                                i10++;
                                copyBackForwardList = webBackForwardList;
                                r52 = 0;
                            }
                        }
                    }
                    for (final int size = arrayList.size() - 2; size >= 0; size--) {
                        Object obj = arrayList.get(size);
                        if (obj instanceof b3) {
                            b3 b3Var = (b3) obj;
                            final int i11 = 0;
                            F2.c(0, b3Var.b(), new Runnable() { // from class: org.telegram.ui.w
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i11) {
                                        case 0:
                                            k4Var.H(size);
                                            break;
                                        default:
                                            k4Var.H(size);
                                            break;
                                    }
                                }
                            }, false);
                            org.telegram.ui.ActionBar.e1 y10 = F2.y();
                            if (y10 != null) {
                                y10.setSubtext(b3Var.x);
                                Bitmap bitmap2 = webView != null ? (Bitmap) webView.P.get(b3Var.x) : null;
                                if (bitmap2 == null) {
                                    bitmap2 = b3Var.F;
                                }
                                y10.g(b3Var.b(), 0, new o0(bitmap2, new Paint(3), 1));
                                y10.setTextColor(x03);
                                y10.setSubtextColor(m12);
                                y10.c(x03, x03);
                            }
                        } else if (obj instanceof TLRPC.WebPage) {
                            TLRPC.WebPage webPage = (TLRPC.WebPage) obj;
                            final int i12 = 1;
                            F2.c(0, webPage.title, new Runnable() { // from class: org.telegram.ui.w
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            k4Var.H(size);
                                            break;
                                        default:
                                            k4Var.H(size);
                                            break;
                                    }
                                }
                            }, false);
                            org.telegram.ui.ActionBar.e1 y11 = F2.y();
                            if (y11 != null) {
                                org.telegram.ui.Components.bk0 bk0Var = y11.c;
                                y11.g(webPage.title, R.drawable.msg_instant, null);
                                y11.setTextColor(x03);
                                if (!TextUtils.isEmpty(webPage.site_name)) {
                                    y11.setSubtext(webPage.site_name);
                                }
                                y11.setSubtextColor(m12);
                                bk0Var.getLayoutParams().width = AndroidUtilities.dp(24.0f);
                                bk0Var.setScaleX(1.45f);
                                bk0Var.setScaleY(1.45f);
                                y11.c(x03, x03);
                            }
                        }
                    }
                    F2.W(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(40.0f), k4Var.h0.getBackgroundColor()));
                    F2.P(x02);
                    if (F2.x() > 0) {
                        k4Var.m(new org.telegram.messenger.f6(k4Var, F2, f7, 1));
                        return true;
                    }
                }
                return false;
            case 1:
                i8 i8Var = (i8) this.b;
                l8 l8Var = i8Var.x;
                if (i8Var.n != null) {
                    int i13 = -1;
                    int i14 = -1;
                    for (int i15 = 0; i15 < i8Var.d; i15++) {
                        j8 j8Var = (j8) i8Var.n.get(i15, null);
                        if (j8Var != null) {
                            if (i13 == -1) {
                                i13 = j8Var.h;
                            }
                            i14 = j8Var.h;
                        }
                    }
                    if (i13 >= 0 && i14 >= 0) {
                        l8Var.G = true;
                        l8Var.P = i13;
                        l8Var.Q = i14;
                        l8Var.t0();
                        l8Var.o0();
                    }
                }
                return false;
            case 2:
                pl plVar = (pl) this.b;
                fo foVar = plVar.c;
                if (AndroidUtilities.isTablet() || (foVar.K9() && !UserObject.isBot(foVar.f))) {
                    return false;
                }
                plVar.b = plVar.a;
                foVar.na(true);
                return true;
            case 3:
                qq0 qq0Var = (qq0) this.b;
                fo foVar2 = qq0Var.F;
                if (foVar2 != null && qq0Var.G != 1) {
                    TLRPC.User i16 = foVar2.i();
                    if (qq0Var.J == null) {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(qq0Var.getParentActivity(), null);
                        qq0Var.J = actionBarPopupWindow$ActionBarPopupWindowLayout;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
                        qq0Var.J.setOnTouchListener(new org.telegram.ui.Components.mf(qq0Var));
                        qq0Var.J.setDispatchKeyEventListener(new hq0(qq0Var, 1));
                        qq0Var.J.setShownFromBottom(false);
                        qq0Var.K = new org.telegram.ui.ActionBar.e1[2];
                        int i17 = 0;
                        while (i17 < 2) {
                            if ((i17 != 0 || foVar2.G6()) && (i17 != 1 || !UserObject.isUserSelf(i16))) {
                                qq0Var.K[i17] = new org.telegram.ui.ActionBar.e1(qq0Var.getParentActivity(), i17 == 0, i17 == 1);
                                if (i17 != 0) {
                                    qq0Var.K[i17].g(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
                                } else if (UserObject.isUserSelf(i16)) {
                                    qq0Var.K[i17].g(LocaleController.getString(R.string.SetReminder), R.drawable.msg_calendar2, null);
                                } else {
                                    qq0Var.K[i17].g(LocaleController.getString(R.string.ScheduleMessage), R.drawable.msg_calendar2, null);
                                }
                                qq0Var.K[i17].setMinimumWidth(AndroidUtilities.dp(196.0f));
                                qq0Var.J.a(qq0Var.K[i17], w7.a6.n(-1, 48));
                                qq0Var.K[i17].setOnClickListener(new di.m4(qq0Var, i17, 21));
                            }
                            i17++;
                        }
                        qq0Var.J.setupRadialSelectors(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.I5, false));
                        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(qq0Var.J, -2, -2);
                        qq0Var.I = m1Var;
                        m1Var.b = false;
                        m1Var.setAnimationStyle(R.style.PopupContextAnimation2);
                        qq0Var.I.setOutsideTouchable(true);
                        qq0Var.I.setClippingEnabled(true);
                        qq0Var.I.setInputMethodMode(2);
                        qq0Var.I.setSoftInputMode(0);
                        qq0Var.I.getContentView().setFocusableInTouchMode(true);
                    }
                    qq0Var.J.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                    qq0Var.I.setFocusable(true);
                    int[] iArr = new int[2];
                    view.getLocationInWindow(iArr);
                    qq0Var.I.showAtLocation(view, 51, AndroidUtilities.dp(8.0f) + ((view.getMeasuredWidth() + iArr[0]) - qq0Var.J.getMeasuredWidth()), (iArr[1] - qq0Var.J.getMeasuredHeight()) - AndroidUtilities.dp(2.0f));
                    qq0Var.I.b();
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                return false;
            case 4:
                hr0 hr0Var = (hr0) this.b;
                fo foVar3 = hr0Var.U;
                if (foVar3 != null && hr0Var.H != 1) {
                    TLRPC.User i18 = foVar3.i();
                    if (hr0Var.n0 == null) {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(hr0Var.getParentActivity(), null);
                        hr0Var.n0 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                        actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
                        hr0Var.n0.setOnTouchListener(new org.telegram.ui.Components.mf(hr0Var));
                        hr0Var.n0.setDispatchKeyEventListener(new uq0(hr0Var, 3));
                        hr0Var.n0.setShownFromBottom(false);
                        hr0Var.o0 = new org.telegram.ui.ActionBar.e1[2];
                        int i19 = 0;
                        while (i19 < 2) {
                            if ((i19 != 0 || foVar3.G6()) && (i19 != 1 || !UserObject.isUserSelf(i18))) {
                                hr0Var.o0[i19] = new org.telegram.ui.ActionBar.e1(hr0Var.getParentActivity(), i19 == 0, i19 == 1);
                                if (i19 != 0) {
                                    hr0Var.o0[i19].g(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
                                } else if (UserObject.isUserSelf(i18)) {
                                    hr0Var.o0[i19].g(LocaleController.getString(R.string.SetReminder), R.drawable.msg_calendar2, null);
                                } else {
                                    hr0Var.o0[i19].g(LocaleController.getString(R.string.ScheduleMessage), R.drawable.msg_calendar2, null);
                                }
                                hr0Var.o0[i19].setMinimumWidth(AndroidUtilities.dp(196.0f));
                                hr0Var.n0.a(hr0Var.o0[i19], w7.a6.n(-1, 48));
                                hr0Var.o0[i19].setOnClickListener(new di.m4(hr0Var, i19, 22));
                            }
                            i19++;
                        }
                        hr0Var.n0.setupRadialSelectors(org.telegram.ui.ActionBar.g6.x0(null, hr0Var.w0, false));
                        org.telegram.ui.ActionBar.m1 m1Var2 = new org.telegram.ui.ActionBar.m1(hr0Var.n0, -2, -2);
                        hr0Var.m0 = m1Var2;
                        m1Var2.b = false;
                        m1Var2.setAnimationStyle(R.style.PopupContextAnimation2);
                        hr0Var.m0.setOutsideTouchable(true);
                        hr0Var.m0.setClippingEnabled(true);
                        hr0Var.m0.setInputMethodMode(2);
                        hr0Var.m0.setSoftInputMode(0);
                        hr0Var.m0.getContentView().setFocusableInTouchMode(true);
                    }
                    hr0Var.n0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                    hr0Var.m0.setFocusable(true);
                    int[] iArr2 = new int[2];
                    view.getLocationInWindow(iArr2);
                    hr0Var.m0.showAtLocation(view, 51, AndroidUtilities.dp(8.0f) + ((view.getMeasuredWidth() + iArr2[0]) - hr0Var.n0.getMeasuredWidth()), (iArr2[1] - hr0Var.n0.getMeasuredHeight()) - AndroidUtilities.dp(2.0f));
                    hr0Var.m0.b();
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused2) {
                    }
                }
                return false;
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                iv0 iv0Var = photoViewer.d;
                if ((iv0Var != null && !iv0Var.T()) || photoViewer.c2 == 11) {
                    return false;
                }
                org.telegram.ui.ActionBar.m2 m2Var = photoViewer.m4;
                boolean z12 = (m2Var == null || m2Var.getLastStoryViewer() == null) ? false : true;
                fo foVar4 = photoViewer.l4;
                if (foVar4 != null && foVar4.c()) {
                    return false;
                }
                if ((photoViewer.l4 == null && !z12 && photoViewer.d == null) || photoViewer.U1.o()) {
                    return false;
                }
                fo foVar5 = photoViewer.l4;
                if (foVar5 != null) {
                    user = foVar5.i();
                    b10 = photoViewer.l4.G6();
                } else {
                    iv0 iv0Var2 = photoViewer.d;
                    if (iv0Var2 == null) {
                        return false;
                    }
                    long a2 = iv0Var2.a();
                    user = a2 != 0 ? MessagesController.getInstance(photoViewer.T).getUser(Long.valueOf(a2)) : null;
                    b10 = photoViewer.d.b();
                }
                iv0 iv0Var3 = photoViewer.d;
                boolean z13 = iv0Var3 != null && iv0Var3.p();
                iv0 iv0Var4 = photoViewer.d;
                boolean z14 = iv0Var4 != null && iv0Var4.r();
                boolean isUserSelf = UserObject.isUserSelf(user);
                iv0 iv0Var5 = photoViewer.d;
                if (iv0Var5 != null && iv0Var5.v() != null) {
                    Iterator it = photoViewer.d.v().entrySet().iterator();
                    while (it.hasNext()) {
                        Object value = ((Map.Entry) it.next()).getValue();
                        if (value instanceof MediaController.PhotoEntry) {
                            if (((MediaController.PhotoEntry) value).ttl != 0) {
                                z10 = true;
                            }
                        } else if ((value instanceof MediaController.SearchImage) && ((MediaController.SearchImage) value).ttl != 0) {
                            z10 = true;
                        }
                        if (!z13 && !photoViewer.r1) {
                            it0Var = photoViewer.U1;
                            if (it0Var.U0 || it0Var.b1 <= 0) {
                                z11 = true;
                                boolean z15 = z13 && b10 && !z10;
                                boolean z16 = (z13 || !z14) && !isUserSelf;
                                iv0 iv0Var6 = photoViewer.d;
                                boolean z17 = iv0Var6 == null && iv0Var6.H() > 1;
                                F = org.telegram.ui.Components.m80.F(photoViewer.e0, new bi.b(), view);
                                F.l(R.drawable.msg_sendfile, LocaleController.getString(!z17 ? R.string.SendAsFiles : R.string.SendAsFile), new or0(photoViewer, 2), z11);
                                F.l(R.drawable.msg_send, LocaleController.getString(R.string.SendAsNewPhoto), new or0(photoViewer, 3), z14);
                                F.l(R.drawable.msg_replace, LocaleController.getString(R.string.ReplacePhoto), new or0(photoViewer, 4), z14);
                                F.l(R.drawable.msg_calendar2, LocaleController.getString(!isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new or0(photoViewer, 5), z15);
                                F.l(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new or0(photoViewer, 6), z16);
                                if (F.x() != 0) {
                                    return false;
                                }
                                F.V(5);
                                F.Z();
                                return true;
                            }
                        }
                        z11 = false;
                        if (z13) {
                        }
                        if (z13) {
                        }
                        iv0 iv0Var62 = photoViewer.d;
                        if (iv0Var62 == null) {
                        }
                        F = org.telegram.ui.Components.m80.F(photoViewer.e0, new bi.b(), view);
                        F.l(R.drawable.msg_sendfile, LocaleController.getString(!z17 ? R.string.SendAsFiles : R.string.SendAsFile), new or0(photoViewer, 2), z11);
                        F.l(R.drawable.msg_send, LocaleController.getString(R.string.SendAsNewPhoto), new or0(photoViewer, 3), z14);
                        F.l(R.drawable.msg_replace, LocaleController.getString(R.string.ReplacePhoto), new or0(photoViewer, 4), z14);
                        F.l(R.drawable.msg_calendar2, LocaleController.getString(!isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new or0(photoViewer, 5), z15);
                        F.l(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new or0(photoViewer, 6), z16);
                        if (F.x() != 0) {
                        }
                    }
                }
                z10 = false;
                if (!z13) {
                    it0Var = photoViewer.U1;
                    if (it0Var.U0) {
                    }
                    z11 = true;
                    if (z13) {
                    }
                    if (z13) {
                    }
                    iv0 iv0Var622 = photoViewer.d;
                    if (iv0Var622 == null) {
                    }
                    F = org.telegram.ui.Components.m80.F(photoViewer.e0, new bi.b(), view);
                    F.l(R.drawable.msg_sendfile, LocaleController.getString(!z17 ? R.string.SendAsFiles : R.string.SendAsFile), new or0(photoViewer, 2), z11);
                    F.l(R.drawable.msg_send, LocaleController.getString(R.string.SendAsNewPhoto), new or0(photoViewer, 3), z14);
                    F.l(R.drawable.msg_replace, LocaleController.getString(R.string.ReplacePhoto), new or0(photoViewer, 4), z14);
                    F.l(R.drawable.msg_calendar2, LocaleController.getString(!isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new or0(photoViewer, 5), z15);
                    F.l(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new or0(photoViewer, 6), z16);
                    if (F.x() != 0) {
                    }
                }
                z11 = false;
                if (z13) {
                }
                if (z13) {
                }
                iv0 iv0Var6222 = photoViewer.d;
                if (iv0Var6222 == null) {
                }
                F = org.telegram.ui.Components.m80.F(photoViewer.e0, new bi.b(), view);
                F.l(R.drawable.msg_sendfile, LocaleController.getString(!z17 ? R.string.SendAsFiles : R.string.SendAsFile), new or0(photoViewer, 2), z11);
                F.l(R.drawable.msg_send, LocaleController.getString(R.string.SendAsNewPhoto), new or0(photoViewer, 3), z14);
                F.l(R.drawable.msg_replace, LocaleController.getString(R.string.ReplacePhoto), new or0(photoViewer, 4), z14);
                F.l(R.drawable.msg_calendar2, LocaleController.getString(!isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new or0(photoViewer, 5), z15);
                F.l(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new or0(photoViewer, 6), z16);
                if (F.x() != 0) {
                }
                break;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                if (profileActivity.J2 == null && !profileActivity.q1) {
                    profileActivity.w4(false);
                }
                return false;
            default:
                r71 r71Var = (r71) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r71Var.getContext(), 0, null);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearRecentEmojiStatusesTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearRecentEmojiStatusesText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new u51(r71Var));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.a.P0 = false;
                alertDialog$Builder.j(new v5(r71Var, 14));
                alertDialog$Builder.o();
                r71Var.w(1.0f);
                try {
                    r71Var.performHapticFeedback(0, 1);
                } catch (Exception unused3) {
                }
                return true;
        }
    }
}
