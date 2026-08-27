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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v(Object obj, int i10) {
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
        org.telegram.ui.Components.b70 F;
        zr0 zr0Var;
        switch (this.a) {
            case 0:
                final m4 m4Var = (m4) this.b;
                ArrayList arrayList = m4Var.Z;
                ?? r52 = 0;
                if (m4Var.q0[0] != null) {
                    float f10 = m4Var.d0.I.d;
                    z3 z3Var = m4Var.G;
                    org.telegram.ui.Components.b70 F2 = org.telegram.ui.Components.b70.F(z3Var != null ? z3Var.c : m4Var.b0, null, view);
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
                                F2.c(r52, itemAtIndex.getTitle(), new h3.z(currentIndex, i10, webView, 5), r52);
                                org.telegram.ui.ActionBar.f1 y10 = F2.y();
                                if (y10 != null) {
                                    y10.setSubtext(itemAtIndex.getUrl());
                                    Bitmap bitmap = (Bitmap) webView.L.get(itemAtIndex.getUrl());
                                    if (bitmap == null) {
                                        bitmap = itemAtIndex.getFavicon();
                                    }
                                    webBackForwardList = copyBackForwardList;
                                    y10.g(itemAtIndex.getTitle(), 0, new q0(bitmap, new Paint(3), 0));
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
                            org.telegram.ui.ActionBar.f1 y11 = F2.y();
                            if (y11 != null) {
                                y11.setSubtext(d3Var.v);
                                Bitmap bitmap2 = webView != null ? (Bitmap) webView.L.get(d3Var.v) : null;
                                if (bitmap2 == null) {
                                    bitmap2 = d3Var.D;
                                }
                                y11.g(d3Var.b(), 0, new q0(bitmap2, new Paint(3), 1));
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
                                            m4Var.H(size);
                                            break;
                                        default:
                                            m4Var.H(size);
                                            break;
                                    }
                                }
                            }, false);
                            org.telegram.ui.ActionBar.f1 y12 = F2.y();
                            if (y12 != null) {
                                org.telegram.ui.Components.ri0 ri0Var = y12.c;
                                y12.g(webPage.title, R.drawable.msg_instant, null);
                                y12.setTextColor(w03);
                                if (!TextUtils.isEmpty(webPage.site_name)) {
                                    y12.setSubtext(webPage.site_name);
                                }
                                y12.setSubtextColor(l1);
                                ri0Var.getLayoutParams().width = AndroidUtilities.dp(24.0f);
                                ri0Var.setScaleX(1.45f);
                                ri0Var.setScaleY(1.45f);
                                y12.c(w03, w03);
                            }
                        }
                    }
                    F2.W(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(40.0f), m4Var.d0.getBackgroundColor()));
                    F2.P(w02);
                    if (F2.x() > 0) {
                        m4Var.m(new org.telegram.messenger.b6(m4Var, F2, f10, 1));
                        return true;
                    }
                }
                return false;
            case 1:
                e8 e8Var = (e8) this.b;
                h8 h8Var = e8Var.x;
                if (e8Var.n != null) {
                    int i13 = -1;
                    int i14 = -1;
                    for (int i15 = 0; i15 < e8Var.d; i15++) {
                        f8 f8Var = (f8) e8Var.n.get(i15, null);
                        if (f8Var != null) {
                            if (i13 == -1) {
                                i13 = f8Var.h;
                            }
                            i14 = f8Var.h;
                        }
                    }
                    if (i13 >= 0 && i14 >= 0) {
                        h8Var.C = true;
                        h8Var.L = i13;
                        h8Var.M = i14;
                        h8Var.t0();
                        h8Var.o0();
                    }
                }
                return false;
            case 2:
                al alVar = (al) this.b;
                rn rnVar = alVar.c;
                if (AndroidUtilities.isTablet() || (rnVar.F9() && !UserObject.isBot(rnVar.f))) {
                    return false;
                }
                alVar.b = alVar.a;
                rnVar.ia(true);
                return true;
            case 3:
                jp0 jp0Var = (jp0) this.b;
                rn rnVar2 = jp0Var.B;
                if (rnVar2 != null && jp0Var.C != 1) {
                    TLRPC.User i16 = rnVar2.i();
                    if (jp0Var.F == null) {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(jp0Var.getParentActivity(), null);
                        jp0Var.F = actionBarPopupWindow$ActionBarPopupWindowLayout;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
                        jp0Var.F.setOnTouchListener(new org.telegram.ui.Components.we(jp0Var));
                        jp0Var.F.setDispatchKeyEventListener(new bp0(jp0Var, 1));
                        jp0Var.F.setShownFromBottom(false);
                        jp0Var.G = new org.telegram.ui.ActionBar.f1[2];
                        int i17 = 0;
                        while (i17 < 2) {
                            if ((i17 != 0 || rnVar2.D6()) && (i17 != 1 || !UserObject.isUserSelf(i16))) {
                                jp0Var.G[i17] = new org.telegram.ui.ActionBar.f1(jp0Var.getParentActivity(), i17 == 0, i17 == 1);
                                if (i17 != 0) {
                                    jp0Var.G[i17].g(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
                                } else if (UserObject.isUserSelf(i16)) {
                                    jp0Var.G[i17].g(LocaleController.getString(R.string.SetReminder), R.drawable.msg_calendar2, null);
                                } else {
                                    jp0Var.G[i17].g(LocaleController.getString(R.string.ScheduleMessage), R.drawable.msg_calendar2, null);
                                }
                                jp0Var.G[i17].setMinimumWidth(AndroidUtilities.dp(196.0f));
                                jp0Var.F.a(jp0Var.G[i17], h7.z5.n(-1, 48));
                                jp0Var.G[i17].setOnClickListener(new hh.z0(jp0Var, i17, 20));
                            }
                            i17++;
                        }
                        jp0Var.F.setupRadialSelectors(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I5, false));
                        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(jp0Var.F, -2, -2);
                        jp0Var.E = n1Var;
                        n1Var.b = false;
                        n1Var.setAnimationStyle(R.style.PopupContextAnimation2);
                        jp0Var.E.setOutsideTouchable(true);
                        jp0Var.E.setClippingEnabled(true);
                        jp0Var.E.setInputMethodMode(2);
                        jp0Var.E.setSoftInputMode(0);
                        jp0Var.E.getContentView().setFocusableInTouchMode(true);
                    }
                    jp0Var.F.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                    jp0Var.E.setFocusable(true);
                    int[] iArr = new int[2];
                    view.getLocationInWindow(iArr);
                    jp0Var.E.showAtLocation(view, 51, AndroidUtilities.dp(8.0f) + ((view.getMeasuredWidth() + iArr[0]) - jp0Var.F.getMeasuredWidth()), (iArr[1] - jp0Var.F.getMeasuredHeight()) - AndroidUtilities.dp(2.0f));
                    jp0Var.E.b();
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                return false;
            case 4:
                aq0 aq0Var = (aq0) this.b;
                rn rnVar3 = aq0Var.Q;
                if (rnVar3 != null && aq0Var.D != 1) {
                    TLRPC.User i18 = rnVar3.i();
                    if (aq0Var.j0 == null) {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(aq0Var.getParentActivity(), null);
                        aq0Var.j0 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                        actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
                        aq0Var.j0.setOnTouchListener(new org.telegram.ui.Components.we(aq0Var));
                        aq0Var.j0.setDispatchKeyEventListener(new np0(aq0Var, 3));
                        aq0Var.j0.setShownFromBottom(false);
                        aq0Var.k0 = new org.telegram.ui.ActionBar.f1[2];
                        int i19 = 0;
                        while (i19 < 2) {
                            if ((i19 != 0 || rnVar3.D6()) && (i19 != 1 || !UserObject.isUserSelf(i18))) {
                                aq0Var.k0[i19] = new org.telegram.ui.ActionBar.f1(aq0Var.getParentActivity(), i19 == 0, i19 == 1);
                                if (i19 != 0) {
                                    aq0Var.k0[i19].g(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
                                } else if (UserObject.isUserSelf(i18)) {
                                    aq0Var.k0[i19].g(LocaleController.getString(R.string.SetReminder), R.drawable.msg_calendar2, null);
                                } else {
                                    aq0Var.k0[i19].g(LocaleController.getString(R.string.ScheduleMessage), R.drawable.msg_calendar2, null);
                                }
                                aq0Var.k0[i19].setMinimumWidth(AndroidUtilities.dp(196.0f));
                                aq0Var.j0.a(aq0Var.k0[i19], h7.z5.n(-1, 48));
                                aq0Var.k0[i19].setOnClickListener(new hh.z0(aq0Var, i19, 21));
                            }
                            i19++;
                        }
                        aq0Var.j0.setupRadialSelectors(org.telegram.ui.ActionBar.g6.w0(null, aq0Var.s0, false));
                        org.telegram.ui.ActionBar.n1 n1Var2 = new org.telegram.ui.ActionBar.n1(aq0Var.j0, -2, -2);
                        aq0Var.i0 = n1Var2;
                        n1Var2.b = false;
                        n1Var2.setAnimationStyle(R.style.PopupContextAnimation2);
                        aq0Var.i0.setOutsideTouchable(true);
                        aq0Var.i0.setClippingEnabled(true);
                        aq0Var.i0.setInputMethodMode(2);
                        aq0Var.i0.setSoftInputMode(0);
                        aq0Var.i0.getContentView().setFocusableInTouchMode(true);
                    }
                    aq0Var.j0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                    aq0Var.i0.setFocusable(true);
                    int[] iArr2 = new int[2];
                    view.getLocationInWindow(iArr2);
                    aq0Var.i0.showAtLocation(view, 51, AndroidUtilities.dp(8.0f) + ((view.getMeasuredWidth() + iArr2[0]) - aq0Var.j0.getMeasuredWidth()), (iArr2[1] - aq0Var.j0.getMeasuredHeight()) - AndroidUtilities.dp(2.0f));
                    aq0Var.i0.b();
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused2) {
                    }
                }
                return false;
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                au0 au0Var = photoViewer.d;
                if ((au0Var != null && !au0Var.T()) || photoViewer.Y1 == 11) {
                    return false;
                }
                org.telegram.ui.ActionBar.n2 n2Var = photoViewer.i4;
                boolean z12 = (n2Var == null || n2Var.getLastStoryViewer() == null) ? false : true;
                rn rnVar4 = photoViewer.h4;
                if (rnVar4 != null && rnVar4.c()) {
                    return false;
                }
                if ((photoViewer.h4 == null && !z12 && photoViewer.d == null) || photoViewer.Q1.o()) {
                    return false;
                }
                rn rnVar5 = photoViewer.h4;
                if (rnVar5 != null) {
                    user = rnVar5.i();
                    b10 = photoViewer.h4.D6();
                } else {
                    au0 au0Var2 = photoViewer.d;
                    if (au0Var2 == null) {
                        return false;
                    }
                    long a2 = au0Var2.a();
                    user = a2 != 0 ? MessagesController.getInstance(photoViewer.P).getUser(Long.valueOf(a2)) : null;
                    b10 = photoViewer.d.b();
                }
                au0 au0Var3 = photoViewer.d;
                boolean z13 = au0Var3 != null && au0Var3.p();
                au0 au0Var4 = photoViewer.d;
                boolean z14 = au0Var4 != null && au0Var4.r();
                boolean isUserSelf = UserObject.isUserSelf(user);
                au0 au0Var5 = photoViewer.d;
                if (au0Var5 != null && au0Var5.v() != null) {
                    Iterator it = photoViewer.d.v().entrySet().iterator();
                    while (it.hasNext()) {
                        Object value = ((Map.Entry) it.next()).getValue();
                        if (!(value instanceof MediaController.PhotoEntry)) {
                            z10 = (value instanceof MediaController.SearchImage) && ((MediaController.SearchImage) value).ttl != 0;
                        } else if (((MediaController.PhotoEntry) value).ttl != 0) {
                        }
                        if (!z13 && !photoViewer.n1) {
                            zr0Var = photoViewer.Q1;
                            if (zr0Var.Q0 || zr0Var.X0 <= 0) {
                                z11 = true;
                                boolean z15 = z13 && b10 && !z10;
                                boolean z16 = (z13 || !z14) && !isUserSelf;
                                au0 au0Var6 = photoViewer.d;
                                boolean z17 = au0Var6 == null && au0Var6.H() > 1;
                                F = org.telegram.ui.Components.b70.F(photoViewer.a0, new jh.b(), view);
                                F.l(R.drawable.msg_sendfile, LocaleController.getString(!z17 ? R.string.SendAsFiles : R.string.SendAsFile), new hq0(photoViewer, 2), z11);
                                F.l(R.drawable.msg_send, LocaleController.getString(R.string.SendAsNewPhoto), new hq0(photoViewer, 3), z14);
                                F.l(R.drawable.msg_replace, LocaleController.getString(R.string.ReplacePhoto), new hq0(photoViewer, 4), z14);
                                F.l(R.drawable.msg_calendar2, LocaleController.getString(!isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new hq0(photoViewer, 5), z15);
                                F.l(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new hq0(photoViewer, 6), z16);
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
                        au0 au0Var62 = photoViewer.d;
                        if (au0Var62 == null) {
                        }
                        F = org.telegram.ui.Components.b70.F(photoViewer.a0, new jh.b(), view);
                        F.l(R.drawable.msg_sendfile, LocaleController.getString(!z17 ? R.string.SendAsFiles : R.string.SendAsFile), new hq0(photoViewer, 2), z11);
                        F.l(R.drawable.msg_send, LocaleController.getString(R.string.SendAsNewPhoto), new hq0(photoViewer, 3), z14);
                        F.l(R.drawable.msg_replace, LocaleController.getString(R.string.ReplacePhoto), new hq0(photoViewer, 4), z14);
                        F.l(R.drawable.msg_calendar2, LocaleController.getString(!isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new hq0(photoViewer, 5), z15);
                        F.l(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new hq0(photoViewer, 6), z16);
                        if (F.x() != 0) {
                        }
                    }
                }
                if (!z13) {
                    zr0Var = photoViewer.Q1;
                    if (zr0Var.Q0) {
                    }
                    z11 = true;
                    if (z13) {
                    }
                    if (z13) {
                    }
                    au0 au0Var622 = photoViewer.d;
                    if (au0Var622 == null) {
                    }
                    F = org.telegram.ui.Components.b70.F(photoViewer.a0, new jh.b(), view);
                    F.l(R.drawable.msg_sendfile, LocaleController.getString(!z17 ? R.string.SendAsFiles : R.string.SendAsFile), new hq0(photoViewer, 2), z11);
                    F.l(R.drawable.msg_send, LocaleController.getString(R.string.SendAsNewPhoto), new hq0(photoViewer, 3), z14);
                    F.l(R.drawable.msg_replace, LocaleController.getString(R.string.ReplacePhoto), new hq0(photoViewer, 4), z14);
                    F.l(R.drawable.msg_calendar2, LocaleController.getString(!isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new hq0(photoViewer, 5), z15);
                    F.l(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new hq0(photoViewer, 6), z16);
                    if (F.x() != 0) {
                    }
                }
                z11 = false;
                if (z13) {
                }
                if (z13) {
                }
                au0 au0Var6222 = photoViewer.d;
                if (au0Var6222 == null) {
                }
                F = org.telegram.ui.Components.b70.F(photoViewer.a0, new jh.b(), view);
                F.l(R.drawable.msg_sendfile, LocaleController.getString(!z17 ? R.string.SendAsFiles : R.string.SendAsFile), new hq0(photoViewer, 2), z11);
                F.l(R.drawable.msg_send, LocaleController.getString(R.string.SendAsNewPhoto), new hq0(photoViewer, 3), z14);
                F.l(R.drawable.msg_replace, LocaleController.getString(R.string.ReplacePhoto), new hq0(photoViewer, 4), z14);
                F.l(R.drawable.msg_calendar2, LocaleController.getString(!isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new hq0(photoViewer, 5), z15);
                F.l(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new hq0(photoViewer, 6), z16);
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
                a61 a61Var = (a61) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(a61Var.getContext(), 0, null);
                alertDialog$Builder.a.N = LocaleController.getString(R.string.ClearRecentEmojiStatusesTitle);
                alertDialog$Builder.a.P = LocaleController.getString(R.string.ClearRecentEmojiStatusesText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new f41(a61Var));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.a.L0 = false;
                alertDialog$Builder.j(new s5(a61Var, 15));
                alertDialog$Builder.o();
                a61Var.w(1.0f);
                try {
                    a61Var.performHapticFeedback(0, 1);
                } catch (Exception unused3) {
                }
                return true;
        }
    }
}
