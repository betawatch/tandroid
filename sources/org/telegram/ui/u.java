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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u(Object obj, int i9) {
        this.a = i9;
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
        org.telegram.ui.Components.x60 F;
        yr0 yr0Var;
        switch (this.a) {
            case 0:
                final l4 l4Var = (l4) this.b;
                ArrayList arrayList = l4Var.Z;
                ?? r52 = 0;
                if (l4Var.q0[0] != null) {
                    float f10 = l4Var.d0.I.d;
                    y3 y3Var = l4Var.G;
                    org.telegram.ui.Components.x60 F2 = org.telegram.ui.Components.x60.F(y3Var != null ? y3Var.c : l4Var.b0, null, view);
                    int w02 = SharedConfig.adaptableColorInBrowser ? org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Pk, false) : l4Var.q0[0].getBackgroundColor();
                    int w03 = SharedConfig.adaptableColorInBrowser ? org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false) : AndroidUtilities.computePerceivedBrightness(l4Var.q0[0].getBackgroundColor()) >= 0.721f ? -16777216 : -1;
                    int l1 = org.telegram.ui.ActionBar.f6.l1(0.65f, w03);
                    org.telegram.ui.web.v0 webView = l4Var.q0[0].getWebView();
                    if (webView != null) {
                        WebBackForwardList copyBackForwardList = webView.copyBackForwardList();
                        int currentIndex = copyBackForwardList.getCurrentIndex();
                        if (copyBackForwardList.getCurrentIndex() > 0) {
                            int i9 = 0;
                            while (i9 < currentIndex) {
                                WebHistoryItem itemAtIndex = copyBackForwardList.getItemAtIndex(i9);
                                F2.c(r52, itemAtIndex.getTitle(), new h3.y(currentIndex, i9, webView, 6), r52);
                                org.telegram.ui.ActionBar.g1 y10 = F2.y();
                                if (y10 != null) {
                                    y10.setSubtext(itemAtIndex.getUrl());
                                    Bitmap bitmap = (Bitmap) webView.L.get(itemAtIndex.getUrl());
                                    if (bitmap == null) {
                                        bitmap = itemAtIndex.getFavicon();
                                    }
                                    webBackForwardList = copyBackForwardList;
                                    y10.g(itemAtIndex.getTitle(), 0, new p0(bitmap, new Paint(3), 0));
                                    y10.setTextColor(w03);
                                    y10.setSubtextColor(l1);
                                } else {
                                    webBackForwardList = copyBackForwardList;
                                }
                                i9++;
                                copyBackForwardList = webBackForwardList;
                                r52 = 0;
                            }
                        }
                    }
                    for (final int size = arrayList.size() - 2; size >= 0; size--) {
                        Object obj = arrayList.get(size);
                        if (obj instanceof c3) {
                            c3 c3Var = (c3) obj;
                            final int i10 = 0;
                            F2.c(0, c3Var.b(), new Runnable() { // from class: org.telegram.ui.x
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i10) {
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
                                y11.setSubtext(c3Var.v);
                                Bitmap bitmap2 = webView != null ? (Bitmap) webView.L.get(c3Var.v) : null;
                                if (bitmap2 == null) {
                                    bitmap2 = c3Var.D;
                                }
                                y11.g(c3Var.b(), 0, new p0(bitmap2, new Paint(3), 1));
                                y11.setTextColor(w03);
                                y11.setSubtextColor(l1);
                                y11.c(w03, w03);
                            }
                        } else if (obj instanceof TLRPC.WebPage) {
                            TLRPC.WebPage webPage = (TLRPC.WebPage) obj;
                            final int i11 = 1;
                            F2.c(0, webPage.title, new Runnable() { // from class: org.telegram.ui.x
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
                            org.telegram.ui.ActionBar.g1 y12 = F2.y();
                            if (y12 != null) {
                                org.telegram.ui.Components.pi0 pi0Var = y12.c;
                                y12.g(webPage.title, R.drawable.msg_instant, null);
                                y12.setTextColor(w03);
                                if (!TextUtils.isEmpty(webPage.site_name)) {
                                    y12.setSubtext(webPage.site_name);
                                }
                                y12.setSubtextColor(l1);
                                pi0Var.getLayoutParams().width = AndroidUtilities.dp(24.0f);
                                pi0Var.setScaleX(1.45f);
                                pi0Var.setScaleY(1.45f);
                                y12.c(w03, w03);
                            }
                        }
                    }
                    F2.W(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(40.0f), l4Var.d0.getBackgroundColor()));
                    F2.P(w02);
                    if (F2.x() > 0) {
                        l4Var.m(new org.telegram.messenger.z5(l4Var, F2, f10, 1));
                        return true;
                    }
                }
                return false;
            case 1:
                d8 d8Var = (d8) this.b;
                g8 g8Var = d8Var.x;
                if (d8Var.n != null) {
                    int i12 = -1;
                    int i13 = -1;
                    for (int i14 = 0; i14 < d8Var.d; i14++) {
                        e8 e8Var = (e8) d8Var.n.get(i14, null);
                        if (e8Var != null) {
                            if (i12 == -1) {
                                i12 = e8Var.h;
                            }
                            i13 = e8Var.h;
                        }
                    }
                    if (i12 >= 0 && i13 >= 0) {
                        g8Var.C = true;
                        g8Var.L = i12;
                        g8Var.M = i13;
                        g8Var.s0();
                        g8Var.n0();
                    }
                }
                return false;
            case 2:
                yk ykVar = (yk) this.b;
                qn qnVar = ykVar.c;
                if (AndroidUtilities.isTablet() || (qnVar.F9() && !UserObject.isBot(qnVar.f))) {
                    return false;
                }
                ykVar.b = ykVar.a;
                qnVar.ia(true);
                return true;
            case 3:
                ip0 ip0Var = (ip0) this.b;
                qn qnVar2 = ip0Var.B;
                if (qnVar2 != null && ip0Var.C != 1) {
                    TLRPC.User i15 = qnVar2.i();
                    if (ip0Var.F == null) {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(ip0Var.getParentActivity(), null);
                        ip0Var.F = actionBarPopupWindow$ActionBarPopupWindowLayout;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
                        ip0Var.F.setOnTouchListener(new org.telegram.ui.Components.af(ip0Var));
                        ip0Var.F.setDispatchKeyEventListener(new ap0(ip0Var, 1));
                        ip0Var.F.setShownFromBottom(false);
                        ip0Var.G = new org.telegram.ui.ActionBar.g1[2];
                        int i16 = 0;
                        while (i16 < 2) {
                            if ((i16 != 0 || qnVar2.D6()) && (i16 != 1 || !UserObject.isUserSelf(i15))) {
                                ip0Var.G[i16] = new org.telegram.ui.ActionBar.g1(ip0Var.getParentActivity(), i16 == 0, i16 == 1);
                                if (i16 != 0) {
                                    ip0Var.G[i16].g(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
                                } else if (UserObject.isUserSelf(i15)) {
                                    ip0Var.G[i16].g(LocaleController.getString(R.string.SetReminder), R.drawable.msg_calendar2, null);
                                } else {
                                    ip0Var.G[i16].g(LocaleController.getString(R.string.ScheduleMessage), R.drawable.msg_calendar2, null);
                                }
                                ip0Var.G[i16].setMinimumWidth(AndroidUtilities.dp(196.0f));
                                ip0Var.F.a(ip0Var.G[i16], g7.e6.n(-1, 48));
                                ip0Var.G[i16].setOnClickListener(new gh.z0(ip0Var, i16, 20));
                            }
                            i16++;
                        }
                        ip0Var.F.setupRadialSelectors(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.I5, false));
                        org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(ip0Var.F, -2, -2);
                        ip0Var.E = o1Var;
                        o1Var.b = false;
                        o1Var.setAnimationStyle(R.style.PopupContextAnimation2);
                        ip0Var.E.setOutsideTouchable(true);
                        ip0Var.E.setClippingEnabled(true);
                        ip0Var.E.setInputMethodMode(2);
                        ip0Var.E.setSoftInputMode(0);
                        ip0Var.E.getContentView().setFocusableInTouchMode(true);
                    }
                    ip0Var.F.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                    ip0Var.E.setFocusable(true);
                    int[] iArr = new int[2];
                    view.getLocationInWindow(iArr);
                    ip0Var.E.showAtLocation(view, 51, AndroidUtilities.dp(8.0f) + ((view.getMeasuredWidth() + iArr[0]) - ip0Var.F.getMeasuredWidth()), (iArr[1] - ip0Var.F.getMeasuredHeight()) - AndroidUtilities.dp(2.0f));
                    ip0Var.E.b();
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                return false;
            case 4:
                zp0 zp0Var = (zp0) this.b;
                qn qnVar3 = zp0Var.Q;
                if (qnVar3 != null && zp0Var.D != 1) {
                    TLRPC.User i17 = qnVar3.i();
                    if (zp0Var.j0 == null) {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(zp0Var.getParentActivity(), null);
                        zp0Var.j0 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                        actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
                        zp0Var.j0.setOnTouchListener(new org.telegram.ui.Components.af(zp0Var));
                        zp0Var.j0.setDispatchKeyEventListener(new mp0(zp0Var, 3));
                        zp0Var.j0.setShownFromBottom(false);
                        zp0Var.k0 = new org.telegram.ui.ActionBar.g1[2];
                        int i18 = 0;
                        while (i18 < 2) {
                            if ((i18 != 0 || qnVar3.D6()) && (i18 != 1 || !UserObject.isUserSelf(i17))) {
                                zp0Var.k0[i18] = new org.telegram.ui.ActionBar.g1(zp0Var.getParentActivity(), i18 == 0, i18 == 1);
                                if (i18 != 0) {
                                    zp0Var.k0[i18].g(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
                                } else if (UserObject.isUserSelf(i17)) {
                                    zp0Var.k0[i18].g(LocaleController.getString(R.string.SetReminder), R.drawable.msg_calendar2, null);
                                } else {
                                    zp0Var.k0[i18].g(LocaleController.getString(R.string.ScheduleMessage), R.drawable.msg_calendar2, null);
                                }
                                zp0Var.k0[i18].setMinimumWidth(AndroidUtilities.dp(196.0f));
                                zp0Var.j0.a(zp0Var.k0[i18], g7.e6.n(-1, 48));
                                zp0Var.k0[i18].setOnClickListener(new gh.z0(zp0Var, i18, 21));
                            }
                            i18++;
                        }
                        zp0Var.j0.setupRadialSelectors(org.telegram.ui.ActionBar.f6.w0(null, zp0Var.s0, false));
                        org.telegram.ui.ActionBar.o1 o1Var2 = new org.telegram.ui.ActionBar.o1(zp0Var.j0, -2, -2);
                        zp0Var.i0 = o1Var2;
                        o1Var2.b = false;
                        o1Var2.setAnimationStyle(R.style.PopupContextAnimation2);
                        zp0Var.i0.setOutsideTouchable(true);
                        zp0Var.i0.setClippingEnabled(true);
                        zp0Var.i0.setInputMethodMode(2);
                        zp0Var.i0.setSoftInputMode(0);
                        zp0Var.i0.getContentView().setFocusableInTouchMode(true);
                    }
                    zp0Var.j0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                    zp0Var.i0.setFocusable(true);
                    int[] iArr2 = new int[2];
                    view.getLocationInWindow(iArr2);
                    zp0Var.i0.showAtLocation(view, 51, AndroidUtilities.dp(8.0f) + ((view.getMeasuredWidth() + iArr2[0]) - zp0Var.j0.getMeasuredWidth()), (iArr2[1] - zp0Var.j0.getMeasuredHeight()) - AndroidUtilities.dp(2.0f));
                    zp0Var.i0.b();
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused2) {
                    }
                }
                return false;
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                zt0 zt0Var = photoViewer.d;
                if ((zt0Var != null && !zt0Var.T()) || photoViewer.Y1 == 11) {
                    return false;
                }
                org.telegram.ui.ActionBar.o2 o2Var = photoViewer.i4;
                boolean z12 = (o2Var == null || o2Var.getLastStoryViewer() == null) ? false : true;
                qn qnVar4 = photoViewer.h4;
                if (qnVar4 != null && qnVar4.c()) {
                    return false;
                }
                if ((photoViewer.h4 == null && !z12 && photoViewer.d == null) || photoViewer.Q1.o()) {
                    return false;
                }
                qn qnVar5 = photoViewer.h4;
                if (qnVar5 != null) {
                    user = qnVar5.i();
                    b10 = photoViewer.h4.D6();
                } else {
                    zt0 zt0Var2 = photoViewer.d;
                    if (zt0Var2 == null) {
                        return false;
                    }
                    long a2 = zt0Var2.a();
                    user = a2 != 0 ? MessagesController.getInstance(photoViewer.P).getUser(Long.valueOf(a2)) : null;
                    b10 = photoViewer.d.b();
                }
                zt0 zt0Var3 = photoViewer.d;
                boolean z13 = zt0Var3 != null && zt0Var3.p();
                zt0 zt0Var4 = photoViewer.d;
                boolean z14 = zt0Var4 != null && zt0Var4.r();
                boolean isUserSelf = UserObject.isUserSelf(user);
                zt0 zt0Var5 = photoViewer.d;
                if (zt0Var5 != null && zt0Var5.v() != null) {
                    Iterator it = photoViewer.d.v().entrySet().iterator();
                    while (it.hasNext()) {
                        Object value = ((Map.Entry) it.next()).getValue();
                        if (!(value instanceof MediaController.PhotoEntry)) {
                            z10 = (value instanceof MediaController.SearchImage) && ((MediaController.SearchImage) value).ttl != 0;
                        } else if (((MediaController.PhotoEntry) value).ttl != 0) {
                        }
                        if (!z13 && !photoViewer.n1) {
                            yr0Var = photoViewer.Q1;
                            if (yr0Var.Q0 || yr0Var.X0 <= 0) {
                                z11 = true;
                                boolean z15 = z13 && b10 && !z10;
                                boolean z16 = (z13 || !z14) && !isUserSelf;
                                zt0 zt0Var6 = photoViewer.d;
                                boolean z17 = zt0Var6 == null && zt0Var6.H() > 1;
                                F = org.telegram.ui.Components.x60.F(photoViewer.a0, new ih.b(), view);
                                F.l(R.drawable.msg_sendfile, LocaleController.getString(!z17 ? R.string.SendAsFiles : R.string.SendAsFile), new gq0(photoViewer, 2), z11);
                                F.l(R.drawable.msg_send, LocaleController.getString(R.string.SendAsNewPhoto), new gq0(photoViewer, 3), z14);
                                F.l(R.drawable.msg_replace, LocaleController.getString(R.string.ReplacePhoto), new gq0(photoViewer, 4), z14);
                                F.l(R.drawable.msg_calendar2, LocaleController.getString(!isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new gq0(photoViewer, 5), z15);
                                F.l(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new gq0(photoViewer, 6), z16);
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
                        zt0 zt0Var62 = photoViewer.d;
                        if (zt0Var62 == null) {
                        }
                        F = org.telegram.ui.Components.x60.F(photoViewer.a0, new ih.b(), view);
                        F.l(R.drawable.msg_sendfile, LocaleController.getString(!z17 ? R.string.SendAsFiles : R.string.SendAsFile), new gq0(photoViewer, 2), z11);
                        F.l(R.drawable.msg_send, LocaleController.getString(R.string.SendAsNewPhoto), new gq0(photoViewer, 3), z14);
                        F.l(R.drawable.msg_replace, LocaleController.getString(R.string.ReplacePhoto), new gq0(photoViewer, 4), z14);
                        F.l(R.drawable.msg_calendar2, LocaleController.getString(!isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new gq0(photoViewer, 5), z15);
                        F.l(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new gq0(photoViewer, 6), z16);
                        if (F.x() != 0) {
                        }
                    }
                }
                if (!z13) {
                    yr0Var = photoViewer.Q1;
                    if (yr0Var.Q0) {
                    }
                    z11 = true;
                    if (z13) {
                    }
                    if (z13) {
                    }
                    zt0 zt0Var622 = photoViewer.d;
                    if (zt0Var622 == null) {
                    }
                    F = org.telegram.ui.Components.x60.F(photoViewer.a0, new ih.b(), view);
                    F.l(R.drawable.msg_sendfile, LocaleController.getString(!z17 ? R.string.SendAsFiles : R.string.SendAsFile), new gq0(photoViewer, 2), z11);
                    F.l(R.drawable.msg_send, LocaleController.getString(R.string.SendAsNewPhoto), new gq0(photoViewer, 3), z14);
                    F.l(R.drawable.msg_replace, LocaleController.getString(R.string.ReplacePhoto), new gq0(photoViewer, 4), z14);
                    F.l(R.drawable.msg_calendar2, LocaleController.getString(!isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new gq0(photoViewer, 5), z15);
                    F.l(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new gq0(photoViewer, 6), z16);
                    if (F.x() != 0) {
                    }
                }
                z11 = false;
                if (z13) {
                }
                if (z13) {
                }
                zt0 zt0Var6222 = photoViewer.d;
                if (zt0Var6222 == null) {
                }
                F = org.telegram.ui.Components.x60.F(photoViewer.a0, new ih.b(), view);
                F.l(R.drawable.msg_sendfile, LocaleController.getString(!z17 ? R.string.SendAsFiles : R.string.SendAsFile), new gq0(photoViewer, 2), z11);
                F.l(R.drawable.msg_send, LocaleController.getString(R.string.SendAsNewPhoto), new gq0(photoViewer, 3), z14);
                F.l(R.drawable.msg_replace, LocaleController.getString(R.string.ReplacePhoto), new gq0(photoViewer, 4), z14);
                F.l(R.drawable.msg_calendar2, LocaleController.getString(!isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new gq0(photoViewer, 5), z15);
                F.l(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new gq0(photoViewer, 6), z16);
                if (F.x() != 0) {
                }
                break;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                if (profileActivity.F2 == null && !profileActivity.m1) {
                    profileActivity.w4(false);
                }
                return false;
            default:
                b61 b61Var = (b61) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b61Var.getContext(), 0, null);
                alertDialog$Builder.a.N = LocaleController.getString(R.string.ClearRecentEmojiStatusesTitle);
                alertDialog$Builder.a.P = LocaleController.getString(R.string.ClearRecentEmojiStatusesText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new g41(b61Var));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.a.L0 = false;
                alertDialog$Builder.j(new r5(b61Var, 15));
                alertDialog$Builder.o();
                b61Var.w(1.0f);
                try {
                    b61Var.performHapticFeedback(0, 1);
                } catch (Exception unused3) {
                }
                return true;
        }
    }
}
