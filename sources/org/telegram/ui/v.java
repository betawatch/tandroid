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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
        org.telegram.ui.Components.w70 F;
        at0 at0Var;
        switch (this.a) {
            case 0:
                final j4 j4Var = (j4) this.b;
                ArrayList arrayList = j4Var.d0;
                ?? r52 = 0;
                if (j4Var.u0[0] != null) {
                    float f7 = j4Var.h0.M.d;
                    w3 w3Var = j4Var.K;
                    org.telegram.ui.Components.w70 F2 = org.telegram.ui.Components.w70.F(w3Var != null ? w3Var.c : j4Var.f0, null, view);
                    int w02 = SharedConfig.adaptableColorInBrowser ? org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false) : j4Var.u0[0].getBackgroundColor();
                    int w03 = SharedConfig.adaptableColorInBrowser ? org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false) : AndroidUtilities.computePerceivedBrightness(j4Var.u0[0].getBackgroundColor()) >= 0.721f ? -16777216 : -1;
                    int l1 = org.telegram.ui.ActionBar.j6.l1(0.65f, w03);
                    org.telegram.ui.web.y0 webView = j4Var.u0[0].getWebView();
                    if (webView != null) {
                        WebBackForwardList copyBackForwardList = webView.copyBackForwardList();
                        int currentIndex = copyBackForwardList.getCurrentIndex();
                        if (copyBackForwardList.getCurrentIndex() > 0) {
                            int i10 = 0;
                            while (i10 < currentIndex) {
                                WebHistoryItem itemAtIndex = copyBackForwardList.getItemAtIndex(i10);
                                F2.c(r52, itemAtIndex.getTitle(), new fg.n(currentIndex, i10, webView, 6), r52);
                                org.telegram.ui.ActionBar.g1 y3 = F2.y();
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
                        if (obj instanceof a3) {
                            a3 a3Var = (a3) obj;
                            final int i11 = 0;
                            F2.c(0, a3Var.b(), new Runnable() { // from class: org.telegram.ui.x
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i11) {
                                        case 0:
                                            j4Var.H(size);
                                            break;
                                        default:
                                            j4Var.H(size);
                                            break;
                                    }
                                }
                            }, false);
                            org.telegram.ui.ActionBar.g1 y10 = F2.y();
                            if (y10 != null) {
                                y10.setSubtext(a3Var.x);
                                Bitmap bitmap2 = webView != null ? (Bitmap) webView.P.get(a3Var.x) : null;
                                if (bitmap2 == null) {
                                    bitmap2 = a3Var.F;
                                }
                                y10.g(a3Var.b(), 0, new n0(bitmap2, new Paint(3), 1));
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
                                            j4Var.H(size);
                                            break;
                                        default:
                                            j4Var.H(size);
                                            break;
                                    }
                                }
                            }, false);
                            org.telegram.ui.ActionBar.g1 y11 = F2.y();
                            if (y11 != null) {
                                org.telegram.ui.Components.kj0 kj0Var = y11.c;
                                y11.g(webPage.title, R.drawable.msg_instant, null);
                                y11.setTextColor(w03);
                                if (!TextUtils.isEmpty(webPage.site_name)) {
                                    y11.setSubtext(webPage.site_name);
                                }
                                y11.setSubtextColor(l1);
                                kj0Var.getLayoutParams().width = AndroidUtilities.dp(24.0f);
                                kj0Var.setScaleX(1.45f);
                                kj0Var.setScaleY(1.45f);
                                y11.c(w03, w03);
                            }
                        }
                    }
                    F2.W(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(40.0f), j4Var.h0.getBackgroundColor()));
                    F2.P(w02);
                    if (F2.x() > 0) {
                        j4Var.m(new org.telegram.messenger.g6(j4Var, F2, f7, 1));
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
                ml mlVar = (ml) this.b;
                eo eoVar = mlVar.c;
                if (AndroidUtilities.isTablet() || (eoVar.F9() && !UserObject.isBot(eoVar.f))) {
                    return false;
                }
                mlVar.b = mlVar.a;
                eoVar.ia(true);
                return true;
            case 3:
                kq0 kq0Var = (kq0) this.b;
                eo eoVar2 = kq0Var.F;
                if (eoVar2 != null && kq0Var.G != 1) {
                    TLRPC.User i16 = eoVar2.i();
                    if (kq0Var.J == null) {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(kq0Var.getParentActivity(), null);
                        kq0Var.J = actionBarPopupWindow$ActionBarPopupWindowLayout;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
                        kq0Var.J.setOnTouchListener(new org.telegram.ui.Components.mf(kq0Var));
                        kq0Var.J.setDispatchKeyEventListener(new cq0(kq0Var, 1));
                        kq0Var.J.setShownFromBottom(false);
                        kq0Var.K = new org.telegram.ui.ActionBar.g1[2];
                        int i17 = 0;
                        while (i17 < 2) {
                            if ((i17 != 0 || eoVar2.D6()) && (i17 != 1 || !UserObject.isUserSelf(i16))) {
                                kq0Var.K[i17] = new org.telegram.ui.ActionBar.g1(kq0Var.getParentActivity(), i17 == 0, i17 == 1);
                                if (i17 != 0) {
                                    kq0Var.K[i17].g(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
                                } else if (UserObject.isUserSelf(i16)) {
                                    kq0Var.K[i17].g(LocaleController.getString(R.string.SetReminder), R.drawable.msg_calendar2, null);
                                } else {
                                    kq0Var.K[i17].g(LocaleController.getString(R.string.ScheduleMessage), R.drawable.msg_calendar2, null);
                                }
                                kq0Var.K[i17].setMinimumWidth(AndroidUtilities.dp(196.0f));
                                kq0Var.J.a(kq0Var.K[i17], w7.a6.n(-1, 48));
                                kq0Var.K[i17].setOnClickListener(new bi.j5(kq0Var, i17, 21));
                            }
                            i17++;
                        }
                        kq0Var.J.setupRadialSelectors(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I5, false));
                        org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(kq0Var.J, -2, -2);
                        kq0Var.I = p1Var;
                        p1Var.b = false;
                        p1Var.setAnimationStyle(R.style.PopupContextAnimation2);
                        kq0Var.I.setOutsideTouchable(true);
                        kq0Var.I.setClippingEnabled(true);
                        kq0Var.I.setInputMethodMode(2);
                        kq0Var.I.setSoftInputMode(0);
                        kq0Var.I.getContentView().setFocusableInTouchMode(true);
                    }
                    kq0Var.J.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                    kq0Var.I.setFocusable(true);
                    int[] iArr = new int[2];
                    view.getLocationInWindow(iArr);
                    kq0Var.I.showAtLocation(view, 51, AndroidUtilities.dp(8.0f) + ((view.getMeasuredWidth() + iArr[0]) - kq0Var.J.getMeasuredWidth()), (iArr[1] - kq0Var.J.getMeasuredHeight()) - AndroidUtilities.dp(2.0f));
                    kq0Var.I.b();
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                return false;
            case 4:
                br0 br0Var = (br0) this.b;
                eo eoVar3 = br0Var.U;
                if (eoVar3 != null && br0Var.H != 1) {
                    TLRPC.User i18 = eoVar3.i();
                    if (br0Var.n0 == null) {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(br0Var.getParentActivity(), null);
                        br0Var.n0 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                        actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
                        br0Var.n0.setOnTouchListener(new org.telegram.ui.Components.mf(br0Var));
                        br0Var.n0.setDispatchKeyEventListener(new oq0(br0Var, 3));
                        br0Var.n0.setShownFromBottom(false);
                        br0Var.o0 = new org.telegram.ui.ActionBar.g1[2];
                        int i19 = 0;
                        while (i19 < 2) {
                            if ((i19 != 0 || eoVar3.D6()) && (i19 != 1 || !UserObject.isUserSelf(i18))) {
                                br0Var.o0[i19] = new org.telegram.ui.ActionBar.g1(br0Var.getParentActivity(), i19 == 0, i19 == 1);
                                if (i19 != 0) {
                                    br0Var.o0[i19].g(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
                                } else if (UserObject.isUserSelf(i18)) {
                                    br0Var.o0[i19].g(LocaleController.getString(R.string.SetReminder), R.drawable.msg_calendar2, null);
                                } else {
                                    br0Var.o0[i19].g(LocaleController.getString(R.string.ScheduleMessage), R.drawable.msg_calendar2, null);
                                }
                                br0Var.o0[i19].setMinimumWidth(AndroidUtilities.dp(196.0f));
                                br0Var.n0.a(br0Var.o0[i19], w7.a6.n(-1, 48));
                                br0Var.o0[i19].setOnClickListener(new bi.j5(br0Var, i19, 22));
                            }
                            i19++;
                        }
                        br0Var.n0.setupRadialSelectors(org.telegram.ui.ActionBar.j6.w0(null, br0Var.w0, false));
                        org.telegram.ui.ActionBar.p1 p1Var2 = new org.telegram.ui.ActionBar.p1(br0Var.n0, -2, -2);
                        br0Var.m0 = p1Var2;
                        p1Var2.b = false;
                        p1Var2.setAnimationStyle(R.style.PopupContextAnimation2);
                        br0Var.m0.setOutsideTouchable(true);
                        br0Var.m0.setClippingEnabled(true);
                        br0Var.m0.setInputMethodMode(2);
                        br0Var.m0.setSoftInputMode(0);
                        br0Var.m0.getContentView().setFocusableInTouchMode(true);
                    }
                    br0Var.n0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                    br0Var.m0.setFocusable(true);
                    int[] iArr2 = new int[2];
                    view.getLocationInWindow(iArr2);
                    br0Var.m0.showAtLocation(view, 51, AndroidUtilities.dp(8.0f) + ((view.getMeasuredWidth() + iArr2[0]) - br0Var.n0.getMeasuredWidth()), (iArr2[1] - br0Var.n0.getMeasuredHeight()) - AndroidUtilities.dp(2.0f));
                    br0Var.m0.b();
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused2) {
                    }
                }
                return false;
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                cv0 cv0Var = photoViewer.d;
                if ((cv0Var != null && !cv0Var.T()) || photoViewer.c2 == 11) {
                    return false;
                }
                org.telegram.ui.ActionBar.p2 p2Var = photoViewer.m4;
                boolean z12 = (p2Var == null || p2Var.getLastStoryViewer() == null) ? false : true;
                eo eoVar4 = photoViewer.l4;
                if (eoVar4 != null && eoVar4.c()) {
                    return false;
                }
                if ((photoViewer.l4 == null && !z12 && photoViewer.d == null) || photoViewer.U1.o()) {
                    return false;
                }
                eo eoVar5 = photoViewer.l4;
                if (eoVar5 != null) {
                    user = eoVar5.i();
                    b10 = photoViewer.l4.D6();
                } else {
                    cv0 cv0Var2 = photoViewer.d;
                    if (cv0Var2 == null) {
                        return false;
                    }
                    long a2 = cv0Var2.a();
                    user = a2 != 0 ? MessagesController.getInstance(photoViewer.T).getUser(Long.valueOf(a2)) : null;
                    b10 = photoViewer.d.b();
                }
                cv0 cv0Var3 = photoViewer.d;
                boolean z13 = cv0Var3 != null && cv0Var3.p();
                cv0 cv0Var4 = photoViewer.d;
                boolean z14 = cv0Var4 != null && cv0Var4.r();
                boolean isUserSelf = UserObject.isUserSelf(user);
                cv0 cv0Var5 = photoViewer.d;
                if (cv0Var5 != null && cv0Var5.v() != null) {
                    Iterator it = photoViewer.d.v().entrySet().iterator();
                    while (it.hasNext()) {
                        Object value = ((Map.Entry) it.next()).getValue();
                        if (!(value instanceof MediaController.PhotoEntry)) {
                            z10 = (value instanceof MediaController.SearchImage) && ((MediaController.SearchImage) value).ttl != 0;
                        } else if (((MediaController.PhotoEntry) value).ttl != 0) {
                        }
                        if (!z13 && !photoViewer.r1) {
                            at0Var = photoViewer.U1;
                            if (at0Var.U0 || at0Var.b1 <= 0) {
                                z11 = true;
                                boolean z15 = z13 && b10 && !z10;
                                boolean z16 = (z13 || !z14) && !isUserSelf;
                                cv0 cv0Var6 = photoViewer.d;
                                boolean z17 = cv0Var6 == null && cv0Var6.H() > 1;
                                F = org.telegram.ui.Components.w70.F(photoViewer.e0, new zh.b(), view);
                                F.l(R.drawable.msg_sendfile, LocaleController.getString(!z17 ? R.string.SendAsFiles : R.string.SendAsFile), new ir0(photoViewer, 2), z11);
                                F.l(R.drawable.msg_send, LocaleController.getString(R.string.SendAsNewPhoto), new ir0(photoViewer, 3), z14);
                                F.l(R.drawable.msg_replace, LocaleController.getString(R.string.ReplacePhoto), new ir0(photoViewer, 4), z14);
                                F.l(R.drawable.msg_calendar2, LocaleController.getString(!isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new ir0(photoViewer, 5), z15);
                                F.l(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new ir0(photoViewer, 6), z16);
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
                        cv0 cv0Var62 = photoViewer.d;
                        if (cv0Var62 == null) {
                        }
                        F = org.telegram.ui.Components.w70.F(photoViewer.e0, new zh.b(), view);
                        F.l(R.drawable.msg_sendfile, LocaleController.getString(!z17 ? R.string.SendAsFiles : R.string.SendAsFile), new ir0(photoViewer, 2), z11);
                        F.l(R.drawable.msg_send, LocaleController.getString(R.string.SendAsNewPhoto), new ir0(photoViewer, 3), z14);
                        F.l(R.drawable.msg_replace, LocaleController.getString(R.string.ReplacePhoto), new ir0(photoViewer, 4), z14);
                        F.l(R.drawable.msg_calendar2, LocaleController.getString(!isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new ir0(photoViewer, 5), z15);
                        F.l(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new ir0(photoViewer, 6), z16);
                        if (F.x() != 0) {
                        }
                    }
                }
                if (!z13) {
                    at0Var = photoViewer.U1;
                    if (at0Var.U0) {
                    }
                    z11 = true;
                    if (z13) {
                    }
                    if (z13) {
                    }
                    cv0 cv0Var622 = photoViewer.d;
                    if (cv0Var622 == null) {
                    }
                    F = org.telegram.ui.Components.w70.F(photoViewer.e0, new zh.b(), view);
                    F.l(R.drawable.msg_sendfile, LocaleController.getString(!z17 ? R.string.SendAsFiles : R.string.SendAsFile), new ir0(photoViewer, 2), z11);
                    F.l(R.drawable.msg_send, LocaleController.getString(R.string.SendAsNewPhoto), new ir0(photoViewer, 3), z14);
                    F.l(R.drawable.msg_replace, LocaleController.getString(R.string.ReplacePhoto), new ir0(photoViewer, 4), z14);
                    F.l(R.drawable.msg_calendar2, LocaleController.getString(!isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new ir0(photoViewer, 5), z15);
                    F.l(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new ir0(photoViewer, 6), z16);
                    if (F.x() != 0) {
                    }
                }
                z11 = false;
                if (z13) {
                }
                if (z13) {
                }
                cv0 cv0Var6222 = photoViewer.d;
                if (cv0Var6222 == null) {
                }
                F = org.telegram.ui.Components.w70.F(photoViewer.e0, new zh.b(), view);
                F.l(R.drawable.msg_sendfile, LocaleController.getString(!z17 ? R.string.SendAsFiles : R.string.SendAsFile), new ir0(photoViewer, 2), z11);
                F.l(R.drawable.msg_send, LocaleController.getString(R.string.SendAsNewPhoto), new ir0(photoViewer, 3), z14);
                F.l(R.drawable.msg_replace, LocaleController.getString(R.string.ReplacePhoto), new ir0(photoViewer, 4), z14);
                F.l(R.drawable.msg_calendar2, LocaleController.getString(!isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new ir0(photoViewer, 5), z15);
                F.l(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new ir0(photoViewer, 6), z16);
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
                l71 l71Var = (l71) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(l71Var.getContext(), 0, null);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearRecentEmojiStatusesTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearRecentEmojiStatusesText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new q51(l71Var));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.a.P0 = false;
                alertDialog$Builder.j(new s5(l71Var, 15));
                alertDialog$Builder.o();
                l71Var.w(1.0f);
                try {
                    l71Var.performHapticFeedback(0, 1);
                } catch (Exception unused3) {
                }
                return true;
        }
    }
}
