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

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
        org.telegram.ui.Components.b80 F;
        ws0 ws0Var;
        switch (this.a) {
            case 0:
                final i4 i4Var = (i4) this.b;
                ArrayList arrayList = i4Var.d0;
                ?? r52 = 0;
                if (i4Var.u0[0] != null) {
                    float f7 = i4Var.h0.M.d;
                    v3 v3Var = i4Var.K;
                    org.telegram.ui.Components.b80 F2 = org.telegram.ui.Components.b80.F(v3Var != null ? v3Var.c : i4Var.f0, null, view);
                    int w02 = SharedConfig.adaptableColorInBrowser ? org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Pk, false) : i4Var.u0[0].getBackgroundColor();
                    int w03 = SharedConfig.adaptableColorInBrowser ? org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.G6, false) : AndroidUtilities.computePerceivedBrightness(i4Var.u0[0].getBackgroundColor()) >= 0.721f ? -16777216 : -1;
                    int l1 = org.telegram.ui.ActionBar.i6.l1(0.65f, w03);
                    org.telegram.ui.web.z0 webView = i4Var.u0[0].getWebView();
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
                            org.telegram.ui.ActionBar.f1 y10 = F2.y();
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
                    F2.W(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(40.0f), i4Var.h0.getBackgroundColor()));
                    F2.P(w02);
                    if (F2.x() > 0) {
                        i4Var.m(new org.telegram.messenger.a6(i4Var, F2, f7, 1));
                        return true;
                    }
                }
                return false;
            case 1:
                h8 h8Var = (h8) this.b;
                k8 k8Var = h8Var.x;
                if (h8Var.n != null) {
                    int i13 = -1;
                    int i14 = -1;
                    for (int i15 = 0; i15 < h8Var.d; i15++) {
                        i8 i8Var = (i8) h8Var.n.get(i15, null);
                        if (i8Var != null) {
                            if (i13 == -1) {
                                i13 = i8Var.h;
                            }
                            i14 = i8Var.h;
                        }
                    }
                    if (i13 >= 0 && i14 >= 0) {
                        k8Var.G = true;
                        k8Var.P = i13;
                        k8Var.Q = i14;
                        k8Var.t0();
                        k8Var.o0();
                    }
                }
                return false;
            case 2:
                gl glVar = (gl) this.b;
                yn ynVar = glVar.c;
                if (AndroidUtilities.isTablet() || (ynVar.E9() && !UserObject.isBot(ynVar.f))) {
                    return false;
                }
                glVar.b = glVar.a;
                ynVar.ha(true);
                return true;
            case 3:
                fq0 fq0Var = (fq0) this.b;
                yn ynVar2 = fq0Var.F;
                if (ynVar2 != null && fq0Var.G != 1) {
                    TLRPC.User i16 = ynVar2.i();
                    if (fq0Var.J == null) {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(fq0Var.getParentActivity(), null);
                        fq0Var.J = actionBarPopupWindow$ActionBarPopupWindowLayout;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
                        fq0Var.J.setOnTouchListener(new org.telegram.ui.Components.mf(fq0Var));
                        fq0Var.J.setDispatchKeyEventListener(new xp0(fq0Var, 1));
                        fq0Var.J.setShownFromBottom(false);
                        fq0Var.K = new org.telegram.ui.ActionBar.f1[2];
                        int i17 = 0;
                        while (i17 < 2) {
                            if ((i17 != 0 || ynVar2.D6()) && (i17 != 1 || !UserObject.isUserSelf(i16))) {
                                fq0Var.K[i17] = new org.telegram.ui.ActionBar.f1(fq0Var.getParentActivity(), i17 == 0, i17 == 1);
                                if (i17 != 0) {
                                    fq0Var.K[i17].g(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
                                } else if (UserObject.isUserSelf(i16)) {
                                    fq0Var.K[i17].g(LocaleController.getString(R.string.SetReminder), R.drawable.msg_calendar2, null);
                                } else {
                                    fq0Var.K[i17].g(LocaleController.getString(R.string.ScheduleMessage), R.drawable.msg_calendar2, null);
                                }
                                fq0Var.K[i17].setMinimumWidth(AndroidUtilities.dp(196.0f));
                                fq0Var.J.a(fq0Var.K[i17], w7.z5.n(-1, 48));
                                fq0Var.K[i17].setOnClickListener(new ci.n4(fq0Var, i17, 21));
                            }
                            i17++;
                        }
                        fq0Var.J.setupRadialSelectors(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.I5, false));
                        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(fq0Var.J, -2, -2);
                        fq0Var.I = n1Var;
                        n1Var.b = false;
                        n1Var.setAnimationStyle(R.style.PopupContextAnimation2);
                        fq0Var.I.setOutsideTouchable(true);
                        fq0Var.I.setClippingEnabled(true);
                        fq0Var.I.setInputMethodMode(2);
                        fq0Var.I.setSoftInputMode(0);
                        fq0Var.I.getContentView().setFocusableInTouchMode(true);
                    }
                    fq0Var.J.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                    fq0Var.I.setFocusable(true);
                    int[] iArr = new int[2];
                    view.getLocationInWindow(iArr);
                    fq0Var.I.showAtLocation(view, 51, AndroidUtilities.dp(8.0f) + ((view.getMeasuredWidth() + iArr[0]) - fq0Var.J.getMeasuredWidth()), (iArr[1] - fq0Var.J.getMeasuredHeight()) - AndroidUtilities.dp(2.0f));
                    fq0Var.I.b();
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                return false;
            case 4:
                wq0 wq0Var = (wq0) this.b;
                yn ynVar3 = wq0Var.U;
                if (ynVar3 != null && wq0Var.H != 1) {
                    TLRPC.User i18 = ynVar3.i();
                    if (wq0Var.n0 == null) {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(wq0Var.getParentActivity(), null);
                        wq0Var.n0 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                        actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
                        wq0Var.n0.setOnTouchListener(new org.telegram.ui.Components.mf(wq0Var));
                        wq0Var.n0.setDispatchKeyEventListener(new jq0(wq0Var, 3));
                        wq0Var.n0.setShownFromBottom(false);
                        wq0Var.o0 = new org.telegram.ui.ActionBar.f1[2];
                        int i19 = 0;
                        while (i19 < 2) {
                            if ((i19 != 0 || ynVar3.D6()) && (i19 != 1 || !UserObject.isUserSelf(i18))) {
                                wq0Var.o0[i19] = new org.telegram.ui.ActionBar.f1(wq0Var.getParentActivity(), i19 == 0, i19 == 1);
                                if (i19 != 0) {
                                    wq0Var.o0[i19].g(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
                                } else if (UserObject.isUserSelf(i18)) {
                                    wq0Var.o0[i19].g(LocaleController.getString(R.string.SetReminder), R.drawable.msg_calendar2, null);
                                } else {
                                    wq0Var.o0[i19].g(LocaleController.getString(R.string.ScheduleMessage), R.drawable.msg_calendar2, null);
                                }
                                wq0Var.o0[i19].setMinimumWidth(AndroidUtilities.dp(196.0f));
                                wq0Var.n0.a(wq0Var.o0[i19], w7.z5.n(-1, 48));
                                wq0Var.o0[i19].setOnClickListener(new ci.n4(wq0Var, i19, 22));
                            }
                            i19++;
                        }
                        wq0Var.n0.setupRadialSelectors(org.telegram.ui.ActionBar.i6.w0(null, wq0Var.w0, false));
                        org.telegram.ui.ActionBar.n1 n1Var2 = new org.telegram.ui.ActionBar.n1(wq0Var.n0, -2, -2);
                        wq0Var.m0 = n1Var2;
                        n1Var2.b = false;
                        n1Var2.setAnimationStyle(R.style.PopupContextAnimation2);
                        wq0Var.m0.setOutsideTouchable(true);
                        wq0Var.m0.setClippingEnabled(true);
                        wq0Var.m0.setInputMethodMode(2);
                        wq0Var.m0.setSoftInputMode(0);
                        wq0Var.m0.getContentView().setFocusableInTouchMode(true);
                    }
                    wq0Var.n0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                    wq0Var.m0.setFocusable(true);
                    int[] iArr2 = new int[2];
                    view.getLocationInWindow(iArr2);
                    wq0Var.m0.showAtLocation(view, 51, AndroidUtilities.dp(8.0f) + ((view.getMeasuredWidth() + iArr2[0]) - wq0Var.n0.getMeasuredWidth()), (iArr2[1] - wq0Var.n0.getMeasuredHeight()) - AndroidUtilities.dp(2.0f));
                    wq0Var.m0.b();
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused2) {
                    }
                }
                return false;
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                wu0 wu0Var = photoViewer.d;
                if ((wu0Var != null && !wu0Var.T()) || photoViewer.c2 == 11) {
                    return false;
                }
                org.telegram.ui.ActionBar.n2 n2Var = photoViewer.m4;
                boolean z12 = (n2Var == null || n2Var.getLastStoryViewer() == null) ? false : true;
                yn ynVar4 = photoViewer.l4;
                if (ynVar4 != null && ynVar4.c()) {
                    return false;
                }
                if ((photoViewer.l4 == null && !z12 && photoViewer.d == null) || photoViewer.U1.o()) {
                    return false;
                }
                yn ynVar5 = photoViewer.l4;
                if (ynVar5 != null) {
                    user = ynVar5.i();
                    b10 = photoViewer.l4.D6();
                } else {
                    wu0 wu0Var2 = photoViewer.d;
                    if (wu0Var2 == null) {
                        return false;
                    }
                    long a2 = wu0Var2.a();
                    user = a2 != 0 ? MessagesController.getInstance(photoViewer.T).getUser(Long.valueOf(a2)) : null;
                    b10 = photoViewer.d.b();
                }
                wu0 wu0Var3 = photoViewer.d;
                boolean z13 = wu0Var3 != null && wu0Var3.p();
                wu0 wu0Var4 = photoViewer.d;
                boolean z14 = wu0Var4 != null && wu0Var4.r();
                boolean isUserSelf = UserObject.isUserSelf(user);
                wu0 wu0Var5 = photoViewer.d;
                if (wu0Var5 != null && wu0Var5.v() != null) {
                    Iterator it = photoViewer.d.v().entrySet().iterator();
                    while (it.hasNext()) {
                        Object value = ((Map.Entry) it.next()).getValue();
                        if (!(value instanceof MediaController.PhotoEntry)) {
                            z10 = (value instanceof MediaController.SearchImage) && ((MediaController.SearchImage) value).ttl != 0;
                        } else if (((MediaController.PhotoEntry) value).ttl != 0) {
                        }
                        if (!z13 && !photoViewer.r1) {
                            ws0Var = photoViewer.U1;
                            if (ws0Var.U0 || ws0Var.b1 <= 0) {
                                z11 = true;
                                boolean z15 = z13 && b10 && !z10;
                                boolean z16 = (z13 || !z14) && !isUserSelf;
                                wu0 wu0Var6 = photoViewer.d;
                                boolean z17 = wu0Var6 == null && wu0Var6.H() > 1;
                                F = org.telegram.ui.Components.b80.F(photoViewer.e0, new ai.d(), view);
                                F.l(R.drawable.msg_sendfile, LocaleController.getString(!z17 ? R.string.SendAsFiles : R.string.SendAsFile), new dr0(photoViewer, 2), z11);
                                F.l(R.drawable.msg_send, LocaleController.getString(R.string.SendAsNewPhoto), new dr0(photoViewer, 3), z14);
                                F.l(R.drawable.msg_replace, LocaleController.getString(R.string.ReplacePhoto), new dr0(photoViewer, 4), z14);
                                F.l(R.drawable.msg_calendar2, LocaleController.getString(!isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new dr0(photoViewer, 5), z15);
                                F.l(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new dr0(photoViewer, 6), z16);
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
                        wu0 wu0Var62 = photoViewer.d;
                        if (wu0Var62 == null) {
                        }
                        F = org.telegram.ui.Components.b80.F(photoViewer.e0, new ai.d(), view);
                        F.l(R.drawable.msg_sendfile, LocaleController.getString(!z17 ? R.string.SendAsFiles : R.string.SendAsFile), new dr0(photoViewer, 2), z11);
                        F.l(R.drawable.msg_send, LocaleController.getString(R.string.SendAsNewPhoto), new dr0(photoViewer, 3), z14);
                        F.l(R.drawable.msg_replace, LocaleController.getString(R.string.ReplacePhoto), new dr0(photoViewer, 4), z14);
                        F.l(R.drawable.msg_calendar2, LocaleController.getString(!isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new dr0(photoViewer, 5), z15);
                        F.l(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new dr0(photoViewer, 6), z16);
                        if (F.x() != 0) {
                        }
                    }
                }
                if (!z13) {
                    ws0Var = photoViewer.U1;
                    if (ws0Var.U0) {
                    }
                    z11 = true;
                    if (z13) {
                    }
                    if (z13) {
                    }
                    wu0 wu0Var622 = photoViewer.d;
                    if (wu0Var622 == null) {
                    }
                    F = org.telegram.ui.Components.b80.F(photoViewer.e0, new ai.d(), view);
                    F.l(R.drawable.msg_sendfile, LocaleController.getString(!z17 ? R.string.SendAsFiles : R.string.SendAsFile), new dr0(photoViewer, 2), z11);
                    F.l(R.drawable.msg_send, LocaleController.getString(R.string.SendAsNewPhoto), new dr0(photoViewer, 3), z14);
                    F.l(R.drawable.msg_replace, LocaleController.getString(R.string.ReplacePhoto), new dr0(photoViewer, 4), z14);
                    F.l(R.drawable.msg_calendar2, LocaleController.getString(!isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new dr0(photoViewer, 5), z15);
                    F.l(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new dr0(photoViewer, 6), z16);
                    if (F.x() != 0) {
                    }
                }
                z11 = false;
                if (z13) {
                }
                if (z13) {
                }
                wu0 wu0Var6222 = photoViewer.d;
                if (wu0Var6222 == null) {
                }
                F = org.telegram.ui.Components.b80.F(photoViewer.e0, new ai.d(), view);
                F.l(R.drawable.msg_sendfile, LocaleController.getString(!z17 ? R.string.SendAsFiles : R.string.SendAsFile), new dr0(photoViewer, 2), z11);
                F.l(R.drawable.msg_send, LocaleController.getString(R.string.SendAsNewPhoto), new dr0(photoViewer, 3), z14);
                F.l(R.drawable.msg_replace, LocaleController.getString(R.string.ReplacePhoto), new dr0(photoViewer, 4), z14);
                F.l(R.drawable.msg_calendar2, LocaleController.getString(!isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new dr0(photoViewer, 5), z15);
                F.l(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new dr0(photoViewer, 6), z16);
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
                alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new f51(a71Var));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.a.P0 = false;
                alertDialog$Builder.j(new s5(a71Var, 15));
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
