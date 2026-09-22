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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
        org.telegram.ui.Components.y70 F;
        bt0 bt0Var;
        switch (this.a) {
            case 0:
                final h4 h4Var = (h4) this.b;
                ArrayList arrayList = h4Var.d0;
                ?? r52 = 0;
                if (h4Var.u0[0] != null) {
                    float f7 = h4Var.h0.M.d;
                    u3 u3Var = h4Var.K;
                    org.telegram.ui.Components.y70 F2 = org.telegram.ui.Components.y70.F(u3Var != null ? u3Var.c : h4Var.f0, null, view);
                    int w02 = SharedConfig.adaptableColorInBrowser ? org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false) : h4Var.u0[0].getBackgroundColor();
                    int w03 = SharedConfig.adaptableColorInBrowser ? org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false) : AndroidUtilities.computePerceivedBrightness(h4Var.u0[0].getBackgroundColor()) >= 0.721f ? -16777216 : -1;
                    int l1 = org.telegram.ui.ActionBar.j6.l1(0.65f, w03);
                    org.telegram.ui.web.z0 webView = h4Var.u0[0].getWebView();
                    if (webView != null) {
                        WebBackForwardList copyBackForwardList = webView.copyBackForwardList();
                        int currentIndex = copyBackForwardList.getCurrentIndex();
                        if (copyBackForwardList.getCurrentIndex() > 0) {
                            int i10 = 0;
                            while (i10 < currentIndex) {
                                WebHistoryItem itemAtIndex = copyBackForwardList.getItemAtIndex(i10);
                                F2.c(r52, itemAtIndex.getTitle(), new gg.n(currentIndex, i10, webView, 6), r52);
                                org.telegram.ui.ActionBar.f1 y3 = F2.y();
                                if (y3 != null) {
                                    y3.setSubtext(itemAtIndex.getUrl());
                                    Bitmap bitmap = (Bitmap) webView.P.get(itemAtIndex.getUrl());
                                    if (bitmap == null) {
                                        bitmap = itemAtIndex.getFavicon();
                                    }
                                    webBackForwardList = copyBackForwardList;
                                    y3.g(itemAtIndex.getTitle(), 0, new m0(bitmap, new Paint(3), 0));
                                    y3.setTextColor(w03);
                                    y3.setSubtextColor(l1);
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
                        if (obj instanceof y2) {
                            y2 y2Var = (y2) obj;
                            final int i11 = 0;
                            F2.c(0, y2Var.b(), new Runnable() { // from class: org.telegram.ui.w
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i11) {
                                        case 0:
                                            h4Var.H(size);
                                            break;
                                        default:
                                            h4Var.H(size);
                                            break;
                                    }
                                }
                            }, false);
                            org.telegram.ui.ActionBar.f1 y10 = F2.y();
                            if (y10 != null) {
                                y10.setSubtext(y2Var.x);
                                Bitmap bitmap2 = webView != null ? (Bitmap) webView.P.get(y2Var.x) : null;
                                if (bitmap2 == null) {
                                    bitmap2 = y2Var.F;
                                }
                                y10.g(y2Var.b(), 0, new m0(bitmap2, new Paint(3), 1));
                                y10.setTextColor(w03);
                                y10.setSubtextColor(l1);
                                y10.c(w03, w03);
                            }
                        } else if (obj instanceof TLRPC.WebPage) {
                            TLRPC.WebPage webPage = (TLRPC.WebPage) obj;
                            final int i12 = 1;
                            F2.c(0, webPage.title, new Runnable() { // from class: org.telegram.ui.w
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            h4Var.H(size);
                                            break;
                                        default:
                                            h4Var.H(size);
                                            break;
                                    }
                                }
                            }, false);
                            org.telegram.ui.ActionBar.f1 y11 = F2.y();
                            if (y11 != null) {
                                org.telegram.ui.Components.nj0 nj0Var = y11.c;
                                y11.g(webPage.title, R.drawable.msg_instant, null);
                                y11.setTextColor(w03);
                                if (!TextUtils.isEmpty(webPage.site_name)) {
                                    y11.setSubtext(webPage.site_name);
                                }
                                y11.setSubtextColor(l1);
                                nj0Var.getLayoutParams().width = AndroidUtilities.dp(24.0f);
                                nj0Var.setScaleX(1.45f);
                                nj0Var.setScaleY(1.45f);
                                y11.c(w03, w03);
                            }
                        }
                    }
                    F2.W(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(40.0f), h4Var.h0.getBackgroundColor()));
                    F2.P(w02);
                    if (F2.x() > 0) {
                        h4Var.m(new org.telegram.messenger.a6(h4Var, F2, f7, 1));
                        return true;
                    }
                }
                return false;
            case 1:
                f8 f8Var = (f8) this.b;
                i8 i8Var = f8Var.x;
                if (f8Var.n != null) {
                    int i13 = -1;
                    int i14 = -1;
                    for (int i15 = 0; i15 < f8Var.d; i15++) {
                        g8 g8Var = (g8) f8Var.n.get(i15, null);
                        if (g8Var != null) {
                            if (i13 == -1) {
                                i13 = g8Var.h;
                            }
                            i14 = g8Var.h;
                        }
                    }
                    if (i13 >= 0 && i14 >= 0) {
                        i8Var.G = true;
                        i8Var.P = i13;
                        i8Var.Q = i14;
                        i8Var.t0();
                        i8Var.o0();
                    }
                }
                return false;
            case 2:
                il ilVar = (il) this.b;
                zn znVar = ilVar.c;
                if (AndroidUtilities.isTablet() || (znVar.F9() && !UserObject.isBot(znVar.f))) {
                    return false;
                }
                ilVar.b = ilVar.a;
                znVar.ia(true);
                return true;
            case 3:
                lq0 lq0Var = (lq0) this.b;
                zn znVar2 = lq0Var.F;
                if (znVar2 != null && lq0Var.G != 1) {
                    TLRPC.User i16 = znVar2.i();
                    if (lq0Var.J == null) {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(lq0Var.getParentActivity(), null);
                        lq0Var.J = actionBarPopupWindow$ActionBarPopupWindowLayout;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
                        lq0Var.J.setOnTouchListener(new org.telegram.ui.Components.kf(lq0Var));
                        lq0Var.J.setDispatchKeyEventListener(new dq0(lq0Var, 1));
                        lq0Var.J.setShownFromBottom(false);
                        lq0Var.K = new org.telegram.ui.ActionBar.f1[2];
                        int i17 = 0;
                        while (i17 < 2) {
                            if ((i17 != 0 || znVar2.D6()) && (i17 != 1 || !UserObject.isUserSelf(i16))) {
                                lq0Var.K[i17] = new org.telegram.ui.ActionBar.f1(lq0Var.getParentActivity(), i17 == 0, i17 == 1);
                                if (i17 != 0) {
                                    lq0Var.K[i17].g(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
                                } else if (UserObject.isUserSelf(i16)) {
                                    lq0Var.K[i17].g(LocaleController.getString(R.string.SetReminder), R.drawable.msg_calendar2, null);
                                } else {
                                    lq0Var.K[i17].g(LocaleController.getString(R.string.ScheduleMessage), R.drawable.msg_calendar2, null);
                                }
                                lq0Var.K[i17].setMinimumWidth(AndroidUtilities.dp(196.0f));
                                lq0Var.J.a(lq0Var.K[i17], w7.y5.n(-1, 48));
                                lq0Var.K[i17].setOnClickListener(new ci.o4(lq0Var, i17, 21));
                            }
                            i17++;
                        }
                        lq0Var.J.setupRadialSelectors(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I5, false));
                        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(lq0Var.J, -2, -2);
                        lq0Var.I = n1Var;
                        n1Var.b = false;
                        n1Var.setAnimationStyle(R.style.PopupContextAnimation2);
                        lq0Var.I.setOutsideTouchable(true);
                        lq0Var.I.setClippingEnabled(true);
                        lq0Var.I.setInputMethodMode(2);
                        lq0Var.I.setSoftInputMode(0);
                        lq0Var.I.getContentView().setFocusableInTouchMode(true);
                    }
                    lq0Var.J.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                    lq0Var.I.setFocusable(true);
                    int[] iArr = new int[2];
                    view.getLocationInWindow(iArr);
                    lq0Var.I.showAtLocation(view, 51, AndroidUtilities.dp(8.0f) + ((view.getMeasuredWidth() + iArr[0]) - lq0Var.J.getMeasuredWidth()), (iArr[1] - lq0Var.J.getMeasuredHeight()) - AndroidUtilities.dp(2.0f));
                    lq0Var.I.b();
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                return false;
            case 4:
                cr0 cr0Var = (cr0) this.b;
                zn znVar3 = cr0Var.U;
                if (znVar3 != null && cr0Var.H != 1) {
                    TLRPC.User i18 = znVar3.i();
                    if (cr0Var.n0 == null) {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(cr0Var.getParentActivity(), null);
                        cr0Var.n0 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                        actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
                        cr0Var.n0.setOnTouchListener(new org.telegram.ui.Components.kf(cr0Var));
                        cr0Var.n0.setDispatchKeyEventListener(new pq0(cr0Var, 3));
                        cr0Var.n0.setShownFromBottom(false);
                        cr0Var.o0 = new org.telegram.ui.ActionBar.f1[2];
                        int i19 = 0;
                        while (i19 < 2) {
                            if ((i19 != 0 || znVar3.D6()) && (i19 != 1 || !UserObject.isUserSelf(i18))) {
                                cr0Var.o0[i19] = new org.telegram.ui.ActionBar.f1(cr0Var.getParentActivity(), i19 == 0, i19 == 1);
                                if (i19 != 0) {
                                    cr0Var.o0[i19].g(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
                                } else if (UserObject.isUserSelf(i18)) {
                                    cr0Var.o0[i19].g(LocaleController.getString(R.string.SetReminder), R.drawable.msg_calendar2, null);
                                } else {
                                    cr0Var.o0[i19].g(LocaleController.getString(R.string.ScheduleMessage), R.drawable.msg_calendar2, null);
                                }
                                cr0Var.o0[i19].setMinimumWidth(AndroidUtilities.dp(196.0f));
                                cr0Var.n0.a(cr0Var.o0[i19], w7.y5.n(-1, 48));
                                cr0Var.o0[i19].setOnClickListener(new ci.o4(cr0Var, i19, 22));
                            }
                            i19++;
                        }
                        cr0Var.n0.setupRadialSelectors(org.telegram.ui.ActionBar.j6.w0(null, cr0Var.w0, false));
                        org.telegram.ui.ActionBar.n1 n1Var2 = new org.telegram.ui.ActionBar.n1(cr0Var.n0, -2, -2);
                        cr0Var.m0 = n1Var2;
                        n1Var2.b = false;
                        n1Var2.setAnimationStyle(R.style.PopupContextAnimation2);
                        cr0Var.m0.setOutsideTouchable(true);
                        cr0Var.m0.setClippingEnabled(true);
                        cr0Var.m0.setInputMethodMode(2);
                        cr0Var.m0.setSoftInputMode(0);
                        cr0Var.m0.getContentView().setFocusableInTouchMode(true);
                    }
                    cr0Var.n0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                    cr0Var.m0.setFocusable(true);
                    int[] iArr2 = new int[2];
                    view.getLocationInWindow(iArr2);
                    cr0Var.m0.showAtLocation(view, 51, AndroidUtilities.dp(8.0f) + ((view.getMeasuredWidth() + iArr2[0]) - cr0Var.n0.getMeasuredWidth()), (iArr2[1] - cr0Var.n0.getMeasuredHeight()) - AndroidUtilities.dp(2.0f));
                    cr0Var.m0.b();
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused2) {
                    }
                }
                return false;
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                bv0 bv0Var = photoViewer.d;
                if ((bv0Var != null && !bv0Var.T()) || photoViewer.c2 == 11) {
                    return false;
                }
                org.telegram.ui.ActionBar.n2 n2Var = photoViewer.m4;
                boolean z12 = (n2Var == null || n2Var.getLastStoryViewer() == null) ? false : true;
                zn znVar4 = photoViewer.l4;
                if (znVar4 != null && znVar4.c()) {
                    return false;
                }
                if ((photoViewer.l4 == null && !z12 && photoViewer.d == null) || photoViewer.U1.o()) {
                    return false;
                }
                zn znVar5 = photoViewer.l4;
                if (znVar5 != null) {
                    user = znVar5.i();
                    b10 = photoViewer.l4.D6();
                } else {
                    bv0 bv0Var2 = photoViewer.d;
                    if (bv0Var2 == null) {
                        return false;
                    }
                    long a2 = bv0Var2.a();
                    user = a2 != 0 ? MessagesController.getInstance(photoViewer.T).getUser(Long.valueOf(a2)) : null;
                    b10 = photoViewer.d.b();
                }
                bv0 bv0Var3 = photoViewer.d;
                boolean z13 = bv0Var3 != null && bv0Var3.p();
                bv0 bv0Var4 = photoViewer.d;
                boolean z14 = bv0Var4 != null && bv0Var4.r();
                boolean isUserSelf = UserObject.isUserSelf(user);
                bv0 bv0Var5 = photoViewer.d;
                if (bv0Var5 != null && bv0Var5.v() != null) {
                    Iterator it = photoViewer.d.v().entrySet().iterator();
                    while (it.hasNext()) {
                        Object value = ((Map.Entry) it.next()).getValue();
                        if (!(value instanceof MediaController.PhotoEntry)) {
                            z10 = (value instanceof MediaController.SearchImage) && ((MediaController.SearchImage) value).ttl != 0;
                        } else if (((MediaController.PhotoEntry) value).ttl != 0) {
                        }
                        if (!z13 && !photoViewer.r1) {
                            bt0Var = photoViewer.U1;
                            if (bt0Var.U0 || bt0Var.b1 <= 0) {
                                z11 = true;
                                boolean z15 = z13 && b10 && !z10;
                                boolean z16 = (z13 || !z14) && !isUserSelf;
                                bv0 bv0Var6 = photoViewer.d;
                                boolean z17 = bv0Var6 == null && bv0Var6.H() > 1;
                                F = org.telegram.ui.Components.y70.F(photoViewer.e0, new ai.d(), view);
                                F.l(R.drawable.msg_sendfile, LocaleController.getString(!z17 ? R.string.SendAsFiles : R.string.SendAsFile), new jr0(photoViewer, 2), z11);
                                F.l(R.drawable.msg_send, LocaleController.getString(R.string.SendAsNewPhoto), new jr0(photoViewer, 3), z14);
                                F.l(R.drawable.msg_replace, LocaleController.getString(R.string.ReplacePhoto), new jr0(photoViewer, 4), z14);
                                F.l(R.drawable.msg_calendar2, LocaleController.getString(!isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new jr0(photoViewer, 5), z15);
                                F.l(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new jr0(photoViewer, 6), z16);
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
                        bv0 bv0Var62 = photoViewer.d;
                        if (bv0Var62 == null) {
                        }
                        F = org.telegram.ui.Components.y70.F(photoViewer.e0, new ai.d(), view);
                        F.l(R.drawable.msg_sendfile, LocaleController.getString(!z17 ? R.string.SendAsFiles : R.string.SendAsFile), new jr0(photoViewer, 2), z11);
                        F.l(R.drawable.msg_send, LocaleController.getString(R.string.SendAsNewPhoto), new jr0(photoViewer, 3), z14);
                        F.l(R.drawable.msg_replace, LocaleController.getString(R.string.ReplacePhoto), new jr0(photoViewer, 4), z14);
                        F.l(R.drawable.msg_calendar2, LocaleController.getString(!isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new jr0(photoViewer, 5), z15);
                        F.l(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new jr0(photoViewer, 6), z16);
                        if (F.x() != 0) {
                        }
                    }
                }
                if (!z13) {
                    bt0Var = photoViewer.U1;
                    if (bt0Var.U0) {
                    }
                    z11 = true;
                    if (z13) {
                    }
                    if (z13) {
                    }
                    bv0 bv0Var622 = photoViewer.d;
                    if (bv0Var622 == null) {
                    }
                    F = org.telegram.ui.Components.y70.F(photoViewer.e0, new ai.d(), view);
                    F.l(R.drawable.msg_sendfile, LocaleController.getString(!z17 ? R.string.SendAsFiles : R.string.SendAsFile), new jr0(photoViewer, 2), z11);
                    F.l(R.drawable.msg_send, LocaleController.getString(R.string.SendAsNewPhoto), new jr0(photoViewer, 3), z14);
                    F.l(R.drawable.msg_replace, LocaleController.getString(R.string.ReplacePhoto), new jr0(photoViewer, 4), z14);
                    F.l(R.drawable.msg_calendar2, LocaleController.getString(!isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new jr0(photoViewer, 5), z15);
                    F.l(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new jr0(photoViewer, 6), z16);
                    if (F.x() != 0) {
                    }
                }
                z11 = false;
                if (z13) {
                }
                if (z13) {
                }
                bv0 bv0Var6222 = photoViewer.d;
                if (bv0Var6222 == null) {
                }
                F = org.telegram.ui.Components.y70.F(photoViewer.e0, new ai.d(), view);
                F.l(R.drawable.msg_sendfile, LocaleController.getString(!z17 ? R.string.SendAsFiles : R.string.SendAsFile), new jr0(photoViewer, 2), z11);
                F.l(R.drawable.msg_send, LocaleController.getString(R.string.SendAsNewPhoto), new jr0(photoViewer, 3), z14);
                F.l(R.drawable.msg_replace, LocaleController.getString(R.string.ReplacePhoto), new jr0(photoViewer, 4), z14);
                F.l(R.drawable.msg_calendar2, LocaleController.getString(!isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new jr0(photoViewer, 5), z15);
                F.l(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new jr0(photoViewer, 6), z16);
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
                j71 j71Var = (j71) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(j71Var.getContext(), 0, null);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearRecentEmojiStatusesTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearRecentEmojiStatusesText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new o51(j71Var));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.a.P0 = false;
                alertDialog$Builder.j(new r5(j71Var, 15));
                alertDialog$Builder.o();
                j71Var.w(1.0f);
                try {
                    j71Var.performHapticFeedback(0, 1);
                } catch (Exception unused3) {
                }
                return true;
        }
    }
}
