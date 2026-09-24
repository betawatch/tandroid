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

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
        org.telegram.ui.Components.y70 F;
        ts0 ts0Var;
        switch (this.a) {
            case 0:
                final i4 i4Var = (i4) this.b;
                ArrayList arrayList = i4Var.d0;
                ?? r52 = 0;
                if (i4Var.u0[0] != null) {
                    float f7 = i4Var.h0.M.d;
                    v3 v3Var = i4Var.K;
                    org.telegram.ui.Components.y70 F2 = org.telegram.ui.Components.y70.F(v3Var != null ? v3Var.c : i4Var.f0, null, view);
                    int w02 = SharedConfig.adaptableColorInBrowser ? org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Pk, false) : i4Var.u0[0].getBackgroundColor();
                    int w03 = SharedConfig.adaptableColorInBrowser ? org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.G6, false) : AndroidUtilities.computePerceivedBrightness(i4Var.u0[0].getBackgroundColor()) >= 0.721f ? -16777216 : -1;
                    int l1 = org.telegram.ui.ActionBar.h6.l1(0.65f, w03);
                    org.telegram.ui.web.y0 webView = i4Var.u0[0].getWebView();
                    if (webView != null) {
                        WebBackForwardList copyBackForwardList = webView.copyBackForwardList();
                        int currentIndex = copyBackForwardList.getCurrentIndex();
                        if (copyBackForwardList.getCurrentIndex() > 0) {
                            int i10 = 0;
                            while (i10 < currentIndex) {
                                WebHistoryItem itemAtIndex = copyBackForwardList.getItemAtIndex(i10);
                                F2.c(r52, itemAtIndex.getTitle(), new gg.n(currentIndex, i10, webView, 6), r52);
                                org.telegram.ui.ActionBar.e1 y3 = F2.y();
                                if (y3 != null) {
                                    y3.setSubtext(itemAtIndex.getUrl());
                                    Bitmap bitmap = (Bitmap) webView.P.get(itemAtIndex.getUrl());
                                    if (bitmap == null) {
                                        bitmap = itemAtIndex.getFavicon();
                                    }
                                    webBackForwardList = copyBackForwardList;
                                    y3.g(itemAtIndex.getTitle(), 0, new n0(bitmap, new Paint(3), 0));
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
                        if (obj instanceof z2) {
                            z2 z2Var = (z2) obj;
                            final int i11 = 0;
                            F2.c(0, z2Var.b(), new Runnable() { // from class: org.telegram.ui.x
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i11) {
                                        case 0:
                                            i4Var.H(size);
                                            break;
                                        default:
                                            i4Var.H(size);
                                            break;
                                    }
                                }
                            }, false);
                            org.telegram.ui.ActionBar.e1 y10 = F2.y();
                            if (y10 != null) {
                                y10.setSubtext(z2Var.x);
                                Bitmap bitmap2 = webView != null ? (Bitmap) webView.P.get(z2Var.x) : null;
                                if (bitmap2 == null) {
                                    bitmap2 = z2Var.F;
                                }
                                y10.g(z2Var.b(), 0, new n0(bitmap2, new Paint(3), 1));
                                y10.setTextColor(w03);
                                y10.setSubtextColor(l1);
                                y10.c(w03, w03);
                            }
                        } else if (obj instanceof TLRPC.WebPage) {
                            TLRPC.WebPage webPage = (TLRPC.WebPage) obj;
                            final int i12 = 1;
                            F2.c(0, webPage.title, new Runnable() { // from class: org.telegram.ui.x
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            i4Var.H(size);
                                            break;
                                        default:
                                            i4Var.H(size);
                                            break;
                                    }
                                }
                            }, false);
                            org.telegram.ui.ActionBar.e1 y11 = F2.y();
                            if (y11 != null) {
                                org.telegram.ui.Components.lj0 lj0Var = y11.c;
                                y11.g(webPage.title, R.drawable.msg_instant, null);
                                y11.setTextColor(w03);
                                if (!TextUtils.isEmpty(webPage.site_name)) {
                                    y11.setSubtext(webPage.site_name);
                                }
                                y11.setSubtextColor(l1);
                                lj0Var.getLayoutParams().width = AndroidUtilities.dp(24.0f);
                                lj0Var.setScaleX(1.45f);
                                lj0Var.setScaleY(1.45f);
                                y11.c(w03, w03);
                            }
                        }
                    }
                    F2.W(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(40.0f), i4Var.h0.getBackgroundColor()));
                    F2.P(w02);
                    if (F2.x() > 0) {
                        i4Var.m(new org.telegram.messenger.a6(i4Var, F2, f7, 1));
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
                        h8Var.G = true;
                        h8Var.P = i13;
                        h8Var.Q = i14;
                        h8Var.t0();
                        h8Var.o0();
                    }
                }
                return false;
            case 2:
                gl glVar = (gl) this.b;
                wn wnVar = glVar.c;
                if (AndroidUtilities.isTablet() || (wnVar.F9() && !UserObject.isBot(wnVar.f))) {
                    return false;
                }
                glVar.b = glVar.a;
                wnVar.ia(true);
                return true;
            case 3:
                cq0 cq0Var = (cq0) this.b;
                wn wnVar2 = cq0Var.F;
                if (wnVar2 != null && cq0Var.G != 1) {
                    TLRPC.User i16 = wnVar2.i();
                    if (cq0Var.J == null) {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(cq0Var.getParentActivity(), null);
                        cq0Var.J = actionBarPopupWindow$ActionBarPopupWindowLayout;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
                        cq0Var.J.setOnTouchListener(new org.telegram.ui.Components.lf(cq0Var));
                        cq0Var.J.setDispatchKeyEventListener(new up0(cq0Var, 1));
                        cq0Var.J.setShownFromBottom(false);
                        cq0Var.K = new org.telegram.ui.ActionBar.e1[2];
                        int i17 = 0;
                        while (i17 < 2) {
                            if ((i17 != 0 || wnVar2.D6()) && (i17 != 1 || !UserObject.isUserSelf(i16))) {
                                cq0Var.K[i17] = new org.telegram.ui.ActionBar.e1(cq0Var.getParentActivity(), i17 == 0, i17 == 1);
                                if (i17 != 0) {
                                    cq0Var.K[i17].g(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
                                } else if (UserObject.isUserSelf(i16)) {
                                    cq0Var.K[i17].g(LocaleController.getString(R.string.SetReminder), R.drawable.msg_calendar2, null);
                                } else {
                                    cq0Var.K[i17].g(LocaleController.getString(R.string.ScheduleMessage), R.drawable.msg_calendar2, null);
                                }
                                cq0Var.K[i17].setMinimumWidth(AndroidUtilities.dp(196.0f));
                                cq0Var.J.a(cq0Var.K[i17], w7.y5.n(-1, 48));
                                cq0Var.K[i17].setOnClickListener(new ci.n4(cq0Var, i17, 21));
                            }
                            i17++;
                        }
                        cq0Var.J.setupRadialSelectors(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.I5, false));
                        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(cq0Var.J, -2, -2);
                        cq0Var.I = m1Var;
                        m1Var.b = false;
                        m1Var.setAnimationStyle(R.style.PopupContextAnimation2);
                        cq0Var.I.setOutsideTouchable(true);
                        cq0Var.I.setClippingEnabled(true);
                        cq0Var.I.setInputMethodMode(2);
                        cq0Var.I.setSoftInputMode(0);
                        cq0Var.I.getContentView().setFocusableInTouchMode(true);
                    }
                    cq0Var.J.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                    cq0Var.I.setFocusable(true);
                    int[] iArr = new int[2];
                    view.getLocationInWindow(iArr);
                    cq0Var.I.showAtLocation(view, 51, AndroidUtilities.dp(8.0f) + ((view.getMeasuredWidth() + iArr[0]) - cq0Var.J.getMeasuredWidth()), (iArr[1] - cq0Var.J.getMeasuredHeight()) - AndroidUtilities.dp(2.0f));
                    cq0Var.I.b();
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                return false;
            case 4:
                tq0 tq0Var = (tq0) this.b;
                wn wnVar3 = tq0Var.U;
                if (wnVar3 != null && tq0Var.H != 1) {
                    TLRPC.User i18 = wnVar3.i();
                    if (tq0Var.n0 == null) {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(tq0Var.getParentActivity(), null);
                        tq0Var.n0 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                        actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
                        tq0Var.n0.setOnTouchListener(new org.telegram.ui.Components.lf(tq0Var));
                        tq0Var.n0.setDispatchKeyEventListener(new gq0(tq0Var, 3));
                        tq0Var.n0.setShownFromBottom(false);
                        tq0Var.o0 = new org.telegram.ui.ActionBar.e1[2];
                        int i19 = 0;
                        while (i19 < 2) {
                            if ((i19 != 0 || wnVar3.D6()) && (i19 != 1 || !UserObject.isUserSelf(i18))) {
                                tq0Var.o0[i19] = new org.telegram.ui.ActionBar.e1(tq0Var.getParentActivity(), i19 == 0, i19 == 1);
                                if (i19 != 0) {
                                    tq0Var.o0[i19].g(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
                                } else if (UserObject.isUserSelf(i18)) {
                                    tq0Var.o0[i19].g(LocaleController.getString(R.string.SetReminder), R.drawable.msg_calendar2, null);
                                } else {
                                    tq0Var.o0[i19].g(LocaleController.getString(R.string.ScheduleMessage), R.drawable.msg_calendar2, null);
                                }
                                tq0Var.o0[i19].setMinimumWidth(AndroidUtilities.dp(196.0f));
                                tq0Var.n0.a(tq0Var.o0[i19], w7.y5.n(-1, 48));
                                tq0Var.o0[i19].setOnClickListener(new ci.n4(tq0Var, i19, 22));
                            }
                            i19++;
                        }
                        tq0Var.n0.setupRadialSelectors(org.telegram.ui.ActionBar.h6.w0(null, tq0Var.w0, false));
                        org.telegram.ui.ActionBar.m1 m1Var2 = new org.telegram.ui.ActionBar.m1(tq0Var.n0, -2, -2);
                        tq0Var.m0 = m1Var2;
                        m1Var2.b = false;
                        m1Var2.setAnimationStyle(R.style.PopupContextAnimation2);
                        tq0Var.m0.setOutsideTouchable(true);
                        tq0Var.m0.setClippingEnabled(true);
                        tq0Var.m0.setInputMethodMode(2);
                        tq0Var.m0.setSoftInputMode(0);
                        tq0Var.m0.getContentView().setFocusableInTouchMode(true);
                    }
                    tq0Var.n0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                    tq0Var.m0.setFocusable(true);
                    int[] iArr2 = new int[2];
                    view.getLocationInWindow(iArr2);
                    tq0Var.m0.showAtLocation(view, 51, AndroidUtilities.dp(8.0f) + ((view.getMeasuredWidth() + iArr2[0]) - tq0Var.n0.getMeasuredWidth()), (iArr2[1] - tq0Var.n0.getMeasuredHeight()) - AndroidUtilities.dp(2.0f));
                    tq0Var.m0.b();
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused2) {
                    }
                }
                return false;
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                tu0 tu0Var = photoViewer.d;
                if ((tu0Var != null && !tu0Var.T()) || photoViewer.c2 == 11) {
                    return false;
                }
                org.telegram.ui.ActionBar.m2 m2Var = photoViewer.m4;
                boolean z12 = (m2Var == null || m2Var.getLastStoryViewer() == null) ? false : true;
                wn wnVar4 = photoViewer.l4;
                if (wnVar4 != null && wnVar4.c()) {
                    return false;
                }
                if ((photoViewer.l4 == null && !z12 && photoViewer.d == null) || photoViewer.U1.o()) {
                    return false;
                }
                wn wnVar5 = photoViewer.l4;
                if (wnVar5 != null) {
                    user = wnVar5.i();
                    b10 = photoViewer.l4.D6();
                } else {
                    tu0 tu0Var2 = photoViewer.d;
                    if (tu0Var2 == null) {
                        return false;
                    }
                    long a2 = tu0Var2.a();
                    user = a2 != 0 ? MessagesController.getInstance(photoViewer.T).getUser(Long.valueOf(a2)) : null;
                    b10 = photoViewer.d.b();
                }
                tu0 tu0Var3 = photoViewer.d;
                boolean z13 = tu0Var3 != null && tu0Var3.p();
                tu0 tu0Var4 = photoViewer.d;
                boolean z14 = tu0Var4 != null && tu0Var4.r();
                boolean isUserSelf = UserObject.isUserSelf(user);
                tu0 tu0Var5 = photoViewer.d;
                if (tu0Var5 != null && tu0Var5.v() != null) {
                    Iterator it = photoViewer.d.v().entrySet().iterator();
                    while (it.hasNext()) {
                        Object value = ((Map.Entry) it.next()).getValue();
                        if (!(value instanceof MediaController.PhotoEntry)) {
                            z10 = (value instanceof MediaController.SearchImage) && ((MediaController.SearchImage) value).ttl != 0;
                        } else if (((MediaController.PhotoEntry) value).ttl != 0) {
                        }
                        if (!z13 && !photoViewer.r1) {
                            ts0Var = photoViewer.U1;
                            if (ts0Var.U0 || ts0Var.b1 <= 0) {
                                z11 = true;
                                boolean z15 = z13 && b10 && !z10;
                                boolean z16 = (z13 || !z14) && !isUserSelf;
                                tu0 tu0Var6 = photoViewer.d;
                                boolean z17 = tu0Var6 == null && tu0Var6.H() > 1;
                                F = org.telegram.ui.Components.y70.F(photoViewer.e0, new ai.d(), view);
                                F.l(R.drawable.msg_sendfile, LocaleController.getString(!z17 ? R.string.SendAsFiles : R.string.SendAsFile), new ar0(photoViewer, 2), z11);
                                F.l(R.drawable.msg_send, LocaleController.getString(R.string.SendAsNewPhoto), new ar0(photoViewer, 3), z14);
                                F.l(R.drawable.msg_replace, LocaleController.getString(R.string.ReplacePhoto), new ar0(photoViewer, 4), z14);
                                F.l(R.drawable.msg_calendar2, LocaleController.getString(!isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new ar0(photoViewer, 5), z15);
                                F.l(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new ar0(photoViewer, 6), z16);
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
                        tu0 tu0Var62 = photoViewer.d;
                        if (tu0Var62 == null) {
                        }
                        F = org.telegram.ui.Components.y70.F(photoViewer.e0, new ai.d(), view);
                        F.l(R.drawable.msg_sendfile, LocaleController.getString(!z17 ? R.string.SendAsFiles : R.string.SendAsFile), new ar0(photoViewer, 2), z11);
                        F.l(R.drawable.msg_send, LocaleController.getString(R.string.SendAsNewPhoto), new ar0(photoViewer, 3), z14);
                        F.l(R.drawable.msg_replace, LocaleController.getString(R.string.ReplacePhoto), new ar0(photoViewer, 4), z14);
                        F.l(R.drawable.msg_calendar2, LocaleController.getString(!isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new ar0(photoViewer, 5), z15);
                        F.l(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new ar0(photoViewer, 6), z16);
                        if (F.x() != 0) {
                        }
                    }
                }
                if (!z13) {
                    ts0Var = photoViewer.U1;
                    if (ts0Var.U0) {
                    }
                    z11 = true;
                    if (z13) {
                    }
                    if (z13) {
                    }
                    tu0 tu0Var622 = photoViewer.d;
                    if (tu0Var622 == null) {
                    }
                    F = org.telegram.ui.Components.y70.F(photoViewer.e0, new ai.d(), view);
                    F.l(R.drawable.msg_sendfile, LocaleController.getString(!z17 ? R.string.SendAsFiles : R.string.SendAsFile), new ar0(photoViewer, 2), z11);
                    F.l(R.drawable.msg_send, LocaleController.getString(R.string.SendAsNewPhoto), new ar0(photoViewer, 3), z14);
                    F.l(R.drawable.msg_replace, LocaleController.getString(R.string.ReplacePhoto), new ar0(photoViewer, 4), z14);
                    F.l(R.drawable.msg_calendar2, LocaleController.getString(!isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new ar0(photoViewer, 5), z15);
                    F.l(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new ar0(photoViewer, 6), z16);
                    if (F.x() != 0) {
                    }
                }
                z11 = false;
                if (z13) {
                }
                if (z13) {
                }
                tu0 tu0Var6222 = photoViewer.d;
                if (tu0Var6222 == null) {
                }
                F = org.telegram.ui.Components.y70.F(photoViewer.e0, new ai.d(), view);
                F.l(R.drawable.msg_sendfile, LocaleController.getString(!z17 ? R.string.SendAsFiles : R.string.SendAsFile), new ar0(photoViewer, 2), z11);
                F.l(R.drawable.msg_send, LocaleController.getString(R.string.SendAsNewPhoto), new ar0(photoViewer, 3), z14);
                F.l(R.drawable.msg_replace, LocaleController.getString(R.string.ReplacePhoto), new ar0(photoViewer, 4), z14);
                F.l(R.drawable.msg_calendar2, LocaleController.getString(!isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new ar0(photoViewer, 5), z15);
                F.l(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new ar0(photoViewer, 6), z16);
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
                a71 a71Var = (a71) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(a71Var.getContext(), 0, null);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearRecentEmojiStatusesTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearRecentEmojiStatusesText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new e51(a71Var));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.a.P0 = false;
                alertDialog$Builder.j(new r5(a71Var, 15));
                alertDialog$Builder.o();
                a71Var.w(1.0f);
                try {
                    a71Var.performHapticFeedback(0, 1);
                } catch (Exception unused3) {
                }
                return true;
        }
    }
}
