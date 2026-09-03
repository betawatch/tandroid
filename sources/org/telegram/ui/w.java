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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w(Object obj, int i10) {
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
        boolean z4;
        boolean z10;
        org.telegram.ui.Components.q70 F;
        ms0 ms0Var;
        switch (this.a) {
            case 0:
                final l4 l4Var = (l4) this.b;
                ArrayList arrayList = l4Var.a0;
                ?? r52 = 0;
                if (l4Var.r0[0] != null) {
                    float f10 = l4Var.e0.J.d;
                    y3 y3Var = l4Var.H;
                    org.telegram.ui.Components.q70 F2 = org.telegram.ui.Components.q70.F(y3Var != null ? y3Var.c : l4Var.c0, null, view);
                    int w02 = SharedConfig.adaptableColorInBrowser ? org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Pk, false) : l4Var.r0[0].getBackgroundColor();
                    int w03 = SharedConfig.adaptableColorInBrowser ? org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false) : AndroidUtilities.computePerceivedBrightness(l4Var.r0[0].getBackgroundColor()) >= 0.721f ? -16777216 : -1;
                    int l1 = org.telegram.ui.ActionBar.k6.l1(0.65f, w03);
                    org.telegram.ui.web.x0 webView = l4Var.r0[0].getWebView();
                    if (webView != null) {
                        WebBackForwardList copyBackForwardList = webView.copyBackForwardList();
                        int currentIndex = copyBackForwardList.getCurrentIndex();
                        if (copyBackForwardList.getCurrentIndex() > 0) {
                            int i10 = 0;
                            while (i10 < currentIndex) {
                                WebHistoryItem itemAtIndex = copyBackForwardList.getItemAtIndex(i10);
                                F2.c(r52, itemAtIndex.getTitle(), new j3.v(currentIndex, i10, webView, 5), r52);
                                org.telegram.ui.ActionBar.g1 y10 = F2.y();
                                if (y10 != null) {
                                    y10.setSubtext(itemAtIndex.getUrl());
                                    Bitmap bitmap = (Bitmap) webView.M.get(itemAtIndex.getUrl());
                                    if (bitmap == null) {
                                        bitmap = itemAtIndex.getFavicon();
                                    }
                                    webBackForwardList = copyBackForwardList;
                                    y10.g(itemAtIndex.getTitle(), 0, new o0(bitmap, new Paint(3), 0));
                                    y10.setTextColor(w03);
                                    y10.setSubtextColor(l1);
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
                            F2.c(0, b3Var.b(), new Runnable() { // from class: org.telegram.ui.y
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i11) {
                                        case 0:
                                            l4Var.H(size);
                                            break;
                                        default:
                                            l4Var.H(size);
                                            break;
                                    }
                                }
                            }, false);
                            org.telegram.ui.ActionBar.g1 y11 = F2.y();
                            if (y11 != null) {
                                y11.setSubtext(b3Var.v);
                                Bitmap bitmap2 = webView != null ? (Bitmap) webView.M.get(b3Var.v) : null;
                                if (bitmap2 == null) {
                                    bitmap2 = b3Var.D;
                                }
                                y11.g(b3Var.b(), 0, new o0(bitmap2, new Paint(3), 1));
                                y11.setTextColor(w03);
                                y11.setSubtextColor(l1);
                                y11.c(w03, w03);
                            }
                        } else if (obj instanceof TLRPC.WebPage) {
                            TLRPC.WebPage webPage = (TLRPC.WebPage) obj;
                            final int i12 = 1;
                            F2.c(0, webPage.title, new Runnable() { // from class: org.telegram.ui.y
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            l4Var.H(size);
                                            break;
                                        default:
                                            l4Var.H(size);
                                            break;
                                    }
                                }
                            }, false);
                            org.telegram.ui.ActionBar.g1 y12 = F2.y();
                            if (y12 != null) {
                                org.telegram.ui.Components.kj0 kj0Var = y12.c;
                                y12.g(webPage.title, R.drawable.msg_instant, null);
                                y12.setTextColor(w03);
                                if (!TextUtils.isEmpty(webPage.site_name)) {
                                    y12.setSubtext(webPage.site_name);
                                }
                                y12.setSubtextColor(l1);
                                kj0Var.getLayoutParams().width = AndroidUtilities.dp(24.0f);
                                kj0Var.setScaleX(1.45f);
                                kj0Var.setScaleY(1.45f);
                                y12.c(w03, w03);
                            }
                        }
                    }
                    F2.W(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(40.0f), l4Var.e0.getBackgroundColor()));
                    F2.P(w02);
                    if (F2.x() > 0) {
                        l4Var.m(new org.telegram.messenger.c6(l4Var, F2, f10, 1));
                        return true;
                    }
                }
                return false;
            case 1:
                g8 g8Var = (g8) this.b;
                j8 j8Var = g8Var.x;
                if (g8Var.n != null) {
                    int i13 = -1;
                    int i14 = -1;
                    for (int i15 = 0; i15 < g8Var.d; i15++) {
                        h8 h8Var = (h8) g8Var.n.get(i15, null);
                        if (h8Var != null) {
                            if (i13 == -1) {
                                i13 = h8Var.h;
                            }
                            i14 = h8Var.h;
                        }
                    }
                    if (i13 >= 0 && i14 >= 0) {
                        j8Var.D = true;
                        j8Var.M = i13;
                        j8Var.N = i14;
                        j8Var.t0();
                        j8Var.o0();
                    }
                }
                return false;
            case 2:
                hl hlVar = (hl) this.b;
                xn xnVar = hlVar.c;
                if (AndroidUtilities.isTablet() || (xnVar.F9() && !UserObject.isBot(xnVar.f))) {
                    return false;
                }
                hlVar.b = hlVar.a;
                xnVar.ia(true);
                return true;
            case 3:
                wp0 wp0Var = (wp0) this.b;
                xn xnVar2 = wp0Var.C;
                if (xnVar2 != null && wp0Var.D != 1) {
                    TLRPC.User i16 = xnVar2.i();
                    if (wp0Var.G == null) {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(wp0Var.getParentActivity(), null);
                        wp0Var.G = actionBarPopupWindow$ActionBarPopupWindowLayout;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
                        wp0Var.G.setOnTouchListener(new org.telegram.ui.Components.af(wp0Var));
                        wp0Var.G.setDispatchKeyEventListener(new op0(wp0Var, 1));
                        wp0Var.G.setShownFromBottom(false);
                        wp0Var.H = new org.telegram.ui.ActionBar.g1[2];
                        int i17 = 0;
                        while (i17 < 2) {
                            if ((i17 != 0 || xnVar2.D6()) && (i17 != 1 || !UserObject.isUserSelf(i16))) {
                                wp0Var.H[i17] = new org.telegram.ui.ActionBar.g1(wp0Var.getParentActivity(), i17 == 0, i17 == 1);
                                if (i17 != 0) {
                                    wp0Var.H[i17].g(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
                                } else if (UserObject.isUserSelf(i16)) {
                                    wp0Var.H[i17].g(LocaleController.getString(R.string.SetReminder), R.drawable.msg_calendar2, null);
                                } else {
                                    wp0Var.H[i17].g(LocaleController.getString(R.string.ScheduleMessage), R.drawable.msg_calendar2, null);
                                }
                                wp0Var.H[i17].setMinimumWidth(AndroidUtilities.dp(196.0f));
                                wp0Var.G.a(wp0Var.H[i17], k7.c6.n(-1, 48));
                                wp0Var.H[i17].setOnClickListener(new mh.x0(wp0Var, i17, 18));
                            }
                            i17++;
                        }
                        wp0Var.G.setupRadialSelectors(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.I5, false));
                        org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(wp0Var.G, -2, -2);
                        wp0Var.F = p1Var;
                        p1Var.b = false;
                        p1Var.setAnimationStyle(R.style.PopupContextAnimation2);
                        wp0Var.F.setOutsideTouchable(true);
                        wp0Var.F.setClippingEnabled(true);
                        wp0Var.F.setInputMethodMode(2);
                        wp0Var.F.setSoftInputMode(0);
                        wp0Var.F.getContentView().setFocusableInTouchMode(true);
                    }
                    wp0Var.G.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                    wp0Var.F.setFocusable(true);
                    int[] iArr = new int[2];
                    view.getLocationInWindow(iArr);
                    wp0Var.F.showAtLocation(view, 51, AndroidUtilities.dp(8.0f) + ((view.getMeasuredWidth() + iArr[0]) - wp0Var.G.getMeasuredWidth()), (iArr[1] - wp0Var.G.getMeasuredHeight()) - AndroidUtilities.dp(2.0f));
                    wp0Var.F.b();
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                return false;
            case 4:
                mq0 mq0Var = (mq0) this.b;
                xn xnVar3 = mq0Var.R;
                if (xnVar3 != null && mq0Var.E != 1) {
                    TLRPC.User i18 = xnVar3.i();
                    if (mq0Var.k0 == null) {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(mq0Var.getParentActivity(), null);
                        mq0Var.k0 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                        actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
                        mq0Var.k0.setOnTouchListener(new org.telegram.ui.Components.af(mq0Var));
                        mq0Var.k0.setDispatchKeyEventListener(new aq0(mq0Var, 3));
                        mq0Var.k0.setShownFromBottom(false);
                        mq0Var.l0 = new org.telegram.ui.ActionBar.g1[2];
                        int i19 = 0;
                        while (i19 < 2) {
                            if ((i19 != 0 || xnVar3.D6()) && (i19 != 1 || !UserObject.isUserSelf(i18))) {
                                mq0Var.l0[i19] = new org.telegram.ui.ActionBar.g1(mq0Var.getParentActivity(), i19 == 0, i19 == 1);
                                if (i19 != 0) {
                                    mq0Var.l0[i19].g(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
                                } else if (UserObject.isUserSelf(i18)) {
                                    mq0Var.l0[i19].g(LocaleController.getString(R.string.SetReminder), R.drawable.msg_calendar2, null);
                                } else {
                                    mq0Var.l0[i19].g(LocaleController.getString(R.string.ScheduleMessage), R.drawable.msg_calendar2, null);
                                }
                                mq0Var.l0[i19].setMinimumWidth(AndroidUtilities.dp(196.0f));
                                mq0Var.k0.a(mq0Var.l0[i19], k7.c6.n(-1, 48));
                                mq0Var.l0[i19].setOnClickListener(new mh.x0(mq0Var, i19, 19));
                            }
                            i19++;
                        }
                        mq0Var.k0.setupRadialSelectors(org.telegram.ui.ActionBar.k6.w0(null, mq0Var.t0, false));
                        org.telegram.ui.ActionBar.p1 p1Var2 = new org.telegram.ui.ActionBar.p1(mq0Var.k0, -2, -2);
                        mq0Var.j0 = p1Var2;
                        p1Var2.b = false;
                        p1Var2.setAnimationStyle(R.style.PopupContextAnimation2);
                        mq0Var.j0.setOutsideTouchable(true);
                        mq0Var.j0.setClippingEnabled(true);
                        mq0Var.j0.setInputMethodMode(2);
                        mq0Var.j0.setSoftInputMode(0);
                        mq0Var.j0.getContentView().setFocusableInTouchMode(true);
                    }
                    mq0Var.k0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                    mq0Var.j0.setFocusable(true);
                    int[] iArr2 = new int[2];
                    view.getLocationInWindow(iArr2);
                    mq0Var.j0.showAtLocation(view, 51, AndroidUtilities.dp(8.0f) + ((view.getMeasuredWidth() + iArr2[0]) - mq0Var.k0.getMeasuredWidth()), (iArr2[1] - mq0Var.k0.getMeasuredHeight()) - AndroidUtilities.dp(2.0f));
                    mq0Var.j0.b();
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused2) {
                    }
                }
                return false;
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                ou0 ou0Var = photoViewer.d;
                if ((ou0Var != null && !ou0Var.T()) || photoViewer.Z1 == 11) {
                    return false;
                }
                org.telegram.ui.ActionBar.p2 p2Var = photoViewer.j4;
                boolean z11 = (p2Var == null || p2Var.getLastStoryViewer() == null) ? false : true;
                xn xnVar4 = photoViewer.i4;
                if (xnVar4 != null && xnVar4.c()) {
                    return false;
                }
                if ((photoViewer.i4 == null && !z11 && photoViewer.d == null) || photoViewer.R1.o()) {
                    return false;
                }
                xn xnVar5 = photoViewer.i4;
                if (xnVar5 != null) {
                    user = xnVar5.i();
                    b10 = photoViewer.i4.D6();
                } else {
                    ou0 ou0Var2 = photoViewer.d;
                    if (ou0Var2 == null) {
                        return false;
                    }
                    long a2 = ou0Var2.a();
                    user = a2 != 0 ? MessagesController.getInstance(photoViewer.Q).getUser(Long.valueOf(a2)) : null;
                    b10 = photoViewer.d.b();
                }
                ou0 ou0Var3 = photoViewer.d;
                boolean z12 = ou0Var3 != null && ou0Var3.p();
                ou0 ou0Var4 = photoViewer.d;
                boolean z13 = ou0Var4 != null && ou0Var4.r();
                boolean isUserSelf = UserObject.isUserSelf(user);
                ou0 ou0Var5 = photoViewer.d;
                if (ou0Var5 != null && ou0Var5.v() != null) {
                    Iterator it = photoViewer.d.v().entrySet().iterator();
                    while (it.hasNext()) {
                        Object value = ((Map.Entry) it.next()).getValue();
                        if (!(value instanceof MediaController.PhotoEntry)) {
                            z4 = (value instanceof MediaController.SearchImage) && ((MediaController.SearchImage) value).ttl != 0;
                        } else if (((MediaController.PhotoEntry) value).ttl != 0) {
                        }
                        if (!z12 && !photoViewer.o1) {
                            ms0Var = photoViewer.R1;
                            if (ms0Var.R0 || ms0Var.Y0 <= 0) {
                                z10 = true;
                                boolean z14 = z12 && b10 && !z4;
                                boolean z15 = (z12 || !z13) && !isUserSelf;
                                ou0 ou0Var6 = photoViewer.d;
                                boolean z16 = ou0Var6 == null && ou0Var6.H() > 1;
                                F = org.telegram.ui.Components.q70.F(photoViewer.b0, new oh.b(), view);
                                F.l(R.drawable.msg_sendfile, LocaleController.getString(!z16 ? R.string.SendAsFiles : R.string.SendAsFile), new tq0(photoViewer, 2), z10);
                                F.l(R.drawable.msg_send, LocaleController.getString(R.string.SendAsNewPhoto), new tq0(photoViewer, 3), z13);
                                F.l(R.drawable.msg_replace, LocaleController.getString(R.string.ReplacePhoto), new tq0(photoViewer, 4), z13);
                                F.l(R.drawable.msg_calendar2, LocaleController.getString(!isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new tq0(photoViewer, 5), z14);
                                F.l(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new tq0(photoViewer, 6), z15);
                                if (F.x() != 0) {
                                    return false;
                                }
                                F.V(5);
                                F.Z();
                                return true;
                            }
                        }
                        z10 = false;
                        if (z12) {
                        }
                        if (z12) {
                        }
                        ou0 ou0Var62 = photoViewer.d;
                        if (ou0Var62 == null) {
                        }
                        F = org.telegram.ui.Components.q70.F(photoViewer.b0, new oh.b(), view);
                        F.l(R.drawable.msg_sendfile, LocaleController.getString(!z16 ? R.string.SendAsFiles : R.string.SendAsFile), new tq0(photoViewer, 2), z10);
                        F.l(R.drawable.msg_send, LocaleController.getString(R.string.SendAsNewPhoto), new tq0(photoViewer, 3), z13);
                        F.l(R.drawable.msg_replace, LocaleController.getString(R.string.ReplacePhoto), new tq0(photoViewer, 4), z13);
                        F.l(R.drawable.msg_calendar2, LocaleController.getString(!isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new tq0(photoViewer, 5), z14);
                        F.l(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new tq0(photoViewer, 6), z15);
                        if (F.x() != 0) {
                        }
                    }
                }
                if (!z12) {
                    ms0Var = photoViewer.R1;
                    if (ms0Var.R0) {
                    }
                    z10 = true;
                    if (z12) {
                    }
                    if (z12) {
                    }
                    ou0 ou0Var622 = photoViewer.d;
                    if (ou0Var622 == null) {
                    }
                    F = org.telegram.ui.Components.q70.F(photoViewer.b0, new oh.b(), view);
                    F.l(R.drawable.msg_sendfile, LocaleController.getString(!z16 ? R.string.SendAsFiles : R.string.SendAsFile), new tq0(photoViewer, 2), z10);
                    F.l(R.drawable.msg_send, LocaleController.getString(R.string.SendAsNewPhoto), new tq0(photoViewer, 3), z13);
                    F.l(R.drawable.msg_replace, LocaleController.getString(R.string.ReplacePhoto), new tq0(photoViewer, 4), z13);
                    F.l(R.drawable.msg_calendar2, LocaleController.getString(!isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new tq0(photoViewer, 5), z14);
                    F.l(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new tq0(photoViewer, 6), z15);
                    if (F.x() != 0) {
                    }
                }
                z10 = false;
                if (z12) {
                }
                if (z12) {
                }
                ou0 ou0Var6222 = photoViewer.d;
                if (ou0Var6222 == null) {
                }
                F = org.telegram.ui.Components.q70.F(photoViewer.b0, new oh.b(), view);
                F.l(R.drawable.msg_sendfile, LocaleController.getString(!z16 ? R.string.SendAsFiles : R.string.SendAsFile), new tq0(photoViewer, 2), z10);
                F.l(R.drawable.msg_send, LocaleController.getString(R.string.SendAsNewPhoto), new tq0(photoViewer, 3), z13);
                F.l(R.drawable.msg_replace, LocaleController.getString(R.string.ReplacePhoto), new tq0(photoViewer, 4), z13);
                F.l(R.drawable.msg_calendar2, LocaleController.getString(!isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new tq0(photoViewer, 5), z14);
                F.l(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new tq0(photoViewer, 6), z15);
                if (F.x() != 0) {
                }
                break;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                if (profileActivity.G2 == null && !profileActivity.n1) {
                    profileActivity.w4(false);
                }
                return false;
            default:
                w61 w61Var = (w61) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(w61Var.getContext(), 0, null);
                alertDialog$Builder.a.O = LocaleController.getString(R.string.ClearRecentEmojiStatusesTitle);
                alertDialog$Builder.a.Q = LocaleController.getString(R.string.ClearRecentEmojiStatusesText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new z41(w61Var));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.a.M0 = false;
                alertDialog$Builder.j(new v5(w61Var, 15));
                alertDialog$Builder.o();
                w61Var.w(1.0f);
                try {
                    w61Var.performHapticFeedback(0, 1);
                } catch (Exception unused3) {
                }
                return true;
        }
    }
}
