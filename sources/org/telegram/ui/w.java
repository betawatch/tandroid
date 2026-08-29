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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.j70 F;
        xr0 xr0Var;
        switch (this.a) {
            case 0:
                final m4 m4Var = (m4) this.b;
                ArrayList arrayList = m4Var.Z;
                ?? r52 = 0;
                if (m4Var.q0[0] != null) {
                    float f9 = m4Var.d0.I.d;
                    z3 z3Var = m4Var.G;
                    org.telegram.ui.Components.j70 F2 = org.telegram.ui.Components.j70.F(z3Var != null ? z3Var.c : m4Var.b0, null, view);
                    int w02 = SharedConfig.adaptableColorInBrowser ? org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pk, false) : m4Var.q0[0].getBackgroundColor();
                    int w03 = SharedConfig.adaptableColorInBrowser ? org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false) : AndroidUtilities.computePerceivedBrightness(m4Var.q0[0].getBackgroundColor()) >= 0.721f ? -16777216 : -1;
                    int l1 = org.telegram.ui.ActionBar.g6.l1(0.65f, w03);
                    org.telegram.ui.web.w0 webView = m4Var.q0[0].getWebView();
                    if (webView != null) {
                        WebBackForwardList copyBackForwardList = webView.copyBackForwardList();
                        int currentIndex = copyBackForwardList.getCurrentIndex();
                        if (copyBackForwardList.getCurrentIndex() > 0) {
                            int i10 = 0;
                            while (i10 < currentIndex) {
                                WebHistoryItem itemAtIndex = copyBackForwardList.getItemAtIndex(i10);
                                F2.c(r52, itemAtIndex.getTitle(), new j3.y(currentIndex, i10, webView, 5), r52);
                                org.telegram.ui.ActionBar.g1 y8 = F2.y();
                                if (y8 != null) {
                                    y8.setSubtext(itemAtIndex.getUrl());
                                    Bitmap bitmap = (Bitmap) webView.L.get(itemAtIndex.getUrl());
                                    if (bitmap == null) {
                                        bitmap = itemAtIndex.getFavicon();
                                    }
                                    webBackForwardList = copyBackForwardList;
                                    y8.g(itemAtIndex.getTitle(), 0, new q0(bitmap, new Paint(3), 0));
                                    y8.setTextColor(w03);
                                    y8.setSubtextColor(l1);
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
                        if (obj instanceof d3) {
                            d3 d3Var = (d3) obj;
                            final int i11 = 0;
                            F2.c(0, d3Var.b(), new Runnable() { // from class: org.telegram.ui.y
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i11) {
                                        case 0:
                                            m4Var.H(size);
                                            break;
                                        default:
                                            m4Var.H(size);
                                            break;
                                    }
                                }
                            }, false);
                            org.telegram.ui.ActionBar.g1 y10 = F2.y();
                            if (y10 != null) {
                                y10.setSubtext(d3Var.v);
                                Bitmap bitmap2 = webView != null ? (Bitmap) webView.L.get(d3Var.v) : null;
                                if (bitmap2 == null) {
                                    bitmap2 = d3Var.D;
                                }
                                y10.g(d3Var.b(), 0, new q0(bitmap2, new Paint(3), 1));
                                y10.setTextColor(w03);
                                y10.setSubtextColor(l1);
                                y10.c(w03, w03);
                            }
                        } else if (obj instanceof TLRPC.WebPage) {
                            TLRPC.WebPage webPage = (TLRPC.WebPage) obj;
                            final int i12 = 1;
                            F2.c(0, webPage.title, new Runnable() { // from class: org.telegram.ui.y
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            m4Var.H(size);
                                            break;
                                        default:
                                            m4Var.H(size);
                                            break;
                                    }
                                }
                            }, false);
                            org.telegram.ui.ActionBar.g1 y11 = F2.y();
                            if (y11 != null) {
                                org.telegram.ui.Components.aj0 aj0Var = y11.c;
                                y11.g(webPage.title, R.drawable.msg_instant, null);
                                y11.setTextColor(w03);
                                if (!TextUtils.isEmpty(webPage.site_name)) {
                                    y11.setSubtext(webPage.site_name);
                                }
                                y11.setSubtextColor(l1);
                                aj0Var.getLayoutParams().width = AndroidUtilities.dp(24.0f);
                                aj0Var.setScaleX(1.45f);
                                aj0Var.setScaleY(1.45f);
                                y11.c(w03, w03);
                            }
                        }
                    }
                    F2.W(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(40.0f), m4Var.d0.getBackgroundColor()));
                    F2.P(w02);
                    if (F2.x() > 0) {
                        m4Var.m(new org.telegram.messenger.b6(m4Var, F2, f9, 1));
                        return true;
                    }
                }
                return false;
            case 1:
                c8 c8Var = (c8) this.b;
                f8 f8Var = c8Var.x;
                if (c8Var.n != null) {
                    int i13 = -1;
                    int i14 = -1;
                    for (int i15 = 0; i15 < c8Var.d; i15++) {
                        d8 d8Var = (d8) c8Var.n.get(i15, null);
                        if (d8Var != null) {
                            if (i13 == -1) {
                                i13 = d8Var.h;
                            }
                            i14 = d8Var.h;
                        }
                    }
                    if (i13 >= 0 && i14 >= 0) {
                        f8Var.C = true;
                        f8Var.L = i13;
                        f8Var.M = i14;
                        f8Var.t0();
                        f8Var.o0();
                    }
                }
                return false;
            case 2:
                bl blVar = (bl) this.b;
                tn tnVar = blVar.c;
                if (AndroidUtilities.isTablet() || (tnVar.F9() && !UserObject.isBot(tnVar.f))) {
                    return false;
                }
                blVar.b = blVar.a;
                tnVar.ia(true);
                return true;
            case 3:
                hp0 hp0Var = (hp0) this.b;
                tn tnVar2 = hp0Var.B;
                if (tnVar2 != null && hp0Var.C != 1) {
                    TLRPC.User i16 = tnVar2.i();
                    if (hp0Var.F == null) {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(hp0Var.getParentActivity(), null);
                        hp0Var.F = actionBarPopupWindow$ActionBarPopupWindowLayout;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
                        hp0Var.F.setOnTouchListener(new org.telegram.ui.Components.df(hp0Var));
                        hp0Var.F.setDispatchKeyEventListener(new zo0(hp0Var, 1));
                        hp0Var.F.setShownFromBottom(false);
                        hp0Var.G = new org.telegram.ui.ActionBar.g1[2];
                        int i17 = 0;
                        while (i17 < 2) {
                            if ((i17 != 0 || tnVar2.D6()) && (i17 != 1 || !UserObject.isUserSelf(i16))) {
                                hp0Var.G[i17] = new org.telegram.ui.ActionBar.g1(hp0Var.getParentActivity(), i17 == 0, i17 == 1);
                                if (i17 != 0) {
                                    hp0Var.G[i17].g(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
                                } else if (UserObject.isUserSelf(i16)) {
                                    hp0Var.G[i17].g(LocaleController.getString(R.string.SetReminder), R.drawable.msg_calendar2, null);
                                } else {
                                    hp0Var.G[i17].g(LocaleController.getString(R.string.ScheduleMessage), R.drawable.msg_calendar2, null);
                                }
                                hp0Var.G[i17].setMinimumWidth(AndroidUtilities.dp(196.0f));
                                hp0Var.F.a(hp0Var.G[i17], i7.f6.n(-1, 48));
                                hp0Var.G[i17].setOnClickListener(new jh.y0(hp0Var, i17, 20));
                            }
                            i17++;
                        }
                        hp0Var.F.setupRadialSelectors(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I5, false));
                        org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(hp0Var.F, -2, -2);
                        hp0Var.E = o1Var;
                        o1Var.b = false;
                        o1Var.setAnimationStyle(R.style.PopupContextAnimation2);
                        hp0Var.E.setOutsideTouchable(true);
                        hp0Var.E.setClippingEnabled(true);
                        hp0Var.E.setInputMethodMode(2);
                        hp0Var.E.setSoftInputMode(0);
                        hp0Var.E.getContentView().setFocusableInTouchMode(true);
                    }
                    hp0Var.F.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                    hp0Var.E.setFocusable(true);
                    int[] iArr = new int[2];
                    view.getLocationInWindow(iArr);
                    hp0Var.E.showAtLocation(view, 51, AndroidUtilities.dp(8.0f) + ((view.getMeasuredWidth() + iArr[0]) - hp0Var.F.getMeasuredWidth()), (iArr[1] - hp0Var.F.getMeasuredHeight()) - AndroidUtilities.dp(2.0f));
                    hp0Var.E.b();
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                return false;
            case 4:
                zp0 zp0Var = (zp0) this.b;
                tn tnVar3 = zp0Var.Q;
                if (tnVar3 != null && zp0Var.D != 1) {
                    TLRPC.User i18 = tnVar3.i();
                    if (zp0Var.j0 == null) {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(zp0Var.getParentActivity(), null);
                        zp0Var.j0 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                        actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
                        zp0Var.j0.setOnTouchListener(new org.telegram.ui.Components.df(zp0Var));
                        zp0Var.j0.setDispatchKeyEventListener(new lp0(zp0Var, 3));
                        zp0Var.j0.setShownFromBottom(false);
                        zp0Var.k0 = new org.telegram.ui.ActionBar.g1[2];
                        int i19 = 0;
                        while (i19 < 2) {
                            if ((i19 != 0 || tnVar3.D6()) && (i19 != 1 || !UserObject.isUserSelf(i18))) {
                                zp0Var.k0[i19] = new org.telegram.ui.ActionBar.g1(zp0Var.getParentActivity(), i19 == 0, i19 == 1);
                                if (i19 != 0) {
                                    zp0Var.k0[i19].g(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
                                } else if (UserObject.isUserSelf(i18)) {
                                    zp0Var.k0[i19].g(LocaleController.getString(R.string.SetReminder), R.drawable.msg_calendar2, null);
                                } else {
                                    zp0Var.k0[i19].g(LocaleController.getString(R.string.ScheduleMessage), R.drawable.msg_calendar2, null);
                                }
                                zp0Var.k0[i19].setMinimumWidth(AndroidUtilities.dp(196.0f));
                                zp0Var.j0.a(zp0Var.k0[i19], i7.f6.n(-1, 48));
                                zp0Var.k0[i19].setOnClickListener(new jh.y0(zp0Var, i19, 21));
                            }
                            i19++;
                        }
                        zp0Var.j0.setupRadialSelectors(org.telegram.ui.ActionBar.g6.w0(null, zp0Var.s0, false));
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
                xt0 xt0Var = photoViewer.d;
                if ((xt0Var != null && !xt0Var.T()) || photoViewer.Y1 == 11) {
                    return false;
                }
                org.telegram.ui.ActionBar.o2 o2Var = photoViewer.i4;
                boolean z12 = (o2Var == null || o2Var.getLastStoryViewer() == null) ? false : true;
                tn tnVar4 = photoViewer.h4;
                if (tnVar4 != null && tnVar4.c()) {
                    return false;
                }
                if ((photoViewer.h4 == null && !z12 && photoViewer.d == null) || photoViewer.Q1.o()) {
                    return false;
                }
                tn tnVar5 = photoViewer.h4;
                if (tnVar5 != null) {
                    user = tnVar5.i();
                    b10 = photoViewer.h4.D6();
                } else {
                    xt0 xt0Var2 = photoViewer.d;
                    if (xt0Var2 == null) {
                        return false;
                    }
                    long a2 = xt0Var2.a();
                    user = a2 != 0 ? MessagesController.getInstance(photoViewer.P).getUser(Long.valueOf(a2)) : null;
                    b10 = photoViewer.d.b();
                }
                xt0 xt0Var3 = photoViewer.d;
                boolean z13 = xt0Var3 != null && xt0Var3.p();
                xt0 xt0Var4 = photoViewer.d;
                boolean z14 = xt0Var4 != null && xt0Var4.r();
                boolean isUserSelf = UserObject.isUserSelf(user);
                xt0 xt0Var5 = photoViewer.d;
                if (xt0Var5 != null && xt0Var5.v() != null) {
                    Iterator it = photoViewer.d.v().entrySet().iterator();
                    while (it.hasNext()) {
                        Object value = ((Map.Entry) it.next()).getValue();
                        if (!(value instanceof MediaController.PhotoEntry)) {
                            z10 = (value instanceof MediaController.SearchImage) && ((MediaController.SearchImage) value).ttl != 0;
                        } else if (((MediaController.PhotoEntry) value).ttl != 0) {
                        }
                        if (!z13 && !photoViewer.n1) {
                            xr0Var = photoViewer.Q1;
                            if (xr0Var.Q0 || xr0Var.X0 <= 0) {
                                z11 = true;
                                boolean z15 = z13 && b10 && !z10;
                                boolean z16 = (z13 || !z14) && !isUserSelf;
                                xt0 xt0Var6 = photoViewer.d;
                                boolean z17 = xt0Var6 == null && xt0Var6.H() > 1;
                                F = org.telegram.ui.Components.j70.F(photoViewer.a0, new lh.b(), view);
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
                        xt0 xt0Var62 = photoViewer.d;
                        if (xt0Var62 == null) {
                        }
                        F = org.telegram.ui.Components.j70.F(photoViewer.a0, new lh.b(), view);
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
                    xr0Var = photoViewer.Q1;
                    if (xr0Var.Q0) {
                    }
                    z11 = true;
                    if (z13) {
                    }
                    if (z13) {
                    }
                    xt0 xt0Var622 = photoViewer.d;
                    if (xt0Var622 == null) {
                    }
                    F = org.telegram.ui.Components.j70.F(photoViewer.a0, new lh.b(), view);
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
                xt0 xt0Var6222 = photoViewer.d;
                if (xt0Var6222 == null) {
                }
                F = org.telegram.ui.Components.j70.F(photoViewer.a0, new lh.b(), view);
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
                d61 d61Var = (d61) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d61Var.getContext(), 0, null);
                alertDialog$Builder.a.N = LocaleController.getString(R.string.ClearRecentEmojiStatusesTitle);
                alertDialog$Builder.a.P = LocaleController.getString(R.string.ClearRecentEmojiStatusesText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new i41(d61Var));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.a.L0 = false;
                alertDialog$Builder.j(new s5(d61Var, 15));
                alertDialog$Builder.o();
                d61Var.w(1.0f);
                try {
                    d61Var.performHapticFeedback(0, 1);
                } catch (Exception unused3) {
                }
                return true;
        }
    }
}
