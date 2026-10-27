package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import java.util.ArrayList;
import java.util.HashMap;
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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01a8, code lost:
    
        if (r14.isEmpty() != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01ba, code lost:
    
        if (r13.isEmpty() != false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x019a, code lost:
    
        if (((org.telegram.messenger.MediaController.MediaEditState) r12).coverPath == null) goto L112;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ed A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014d  */
    /* JADX WARN: Type inference failed for: r11v46, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v47, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r11v52, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, org.telegram.ui.Components.l80] */
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
        org.telegram.ui.Components.l80 F;
        qu0 qu0Var;
        switch (this.a) {
            case 0:
                final j4 j4Var = (j4) this.b;
                ArrayList arrayList = j4Var.d0;
                ?? r52 = 0;
                if (j4Var.u0[0] != null) {
                    float f7 = j4Var.h0.M.d;
                    v3 v3Var = j4Var.K;
                    ?? F2 = org.telegram.ui.Components.l80.F(v3Var != null ? v3Var.c : j4Var.f0, null, view);
                    int x02 = SharedConfig.adaptableColorInBrowser ? org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Pk, false) : j4Var.u0[0].getBackgroundColor();
                    int x03 = SharedConfig.adaptableColorInBrowser ? org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.G6, false) : AndroidUtilities.computePerceivedBrightness(j4Var.u0[0].getBackgroundColor()) >= 0.721f ? -16777216 : -1;
                    int o12 = org.telegram.ui.ActionBar.y6.o1(0.65f, x03);
                    org.telegram.ui.web.x0 webView = j4Var.u0[0].getWebView();
                    if (webView != null) {
                        WebBackForwardList copyBackForwardList = webView.copyBackForwardList();
                        int currentIndex = copyBackForwardList.getCurrentIndex();
                        if (copyBackForwardList.getCurrentIndex() > 0) {
                            int i10 = 0;
                            while (i10 < currentIndex) {
                                WebHistoryItem itemAtIndex = copyBackForwardList.getItemAtIndex(i10);
                                F2.c(r52, itemAtIndex.getTitle(), new i2.v(currentIndex, i10, webView, 6), r52);
                                org.telegram.ui.ActionBar.g1 y3 = F2.y();
                                if (y3 != null) {
                                    y3.setSubtext(itemAtIndex.getUrl());
                                    Bitmap bitmap = (Bitmap) webView.P.get(itemAtIndex.getUrl());
                                    if (bitmap == null) {
                                        bitmap = itemAtIndex.getFavicon();
                                    }
                                    webBackForwardList = copyBackForwardList;
                                    y3.j(itemAtIndex.getTitle(), 0, new ai.u1(bitmap, new Paint(3), 1));
                                    y3.setTextColor(x03);
                                    y3.setSubtextColor(o12);
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
                            F2.c(0, y2Var.b(), new Runnable() { // from class: org.telegram.ui.v
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
                                y10.setSubtext(y2Var.x);
                                Bitmap bitmap2 = webView != null ? (Bitmap) webView.P.get(y2Var.x) : null;
                                if (bitmap2 == null) {
                                    bitmap2 = y2Var.F;
                                }
                                y10.j(y2Var.b(), 0, new ai.u1(bitmap2, new Paint(3), 2));
                                y10.setTextColor(x03);
                                y10.setSubtextColor(o12);
                                y10.d(x03, x03);
                            }
                        } else if (obj instanceof TLRPC.WebPage) {
                            TLRPC.WebPage webPage = (TLRPC.WebPage) obj;
                            final int i12 = 1;
                            F2.c(0, webPage.title, new Runnable() { // from class: org.telegram.ui.v
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
                                org.telegram.ui.Components.bk0 bk0Var = y11.c;
                                y11.j(webPage.title, R.drawable.msg_instant, null);
                                y11.setTextColor(x03);
                                if (!TextUtils.isEmpty(webPage.site_name)) {
                                    y11.setSubtext(webPage.site_name);
                                }
                                y11.setSubtextColor(o12);
                                bk0Var.getLayoutParams().width = AndroidUtilities.dp(24.0f);
                                bk0Var.setScaleX(1.45f);
                                bk0Var.setScaleY(1.45f);
                                y11.d(x03, x03);
                            }
                        }
                    }
                    F2.W(org.telegram.ui.ActionBar.y6.K(AndroidUtilities.dp(40.0f), j4Var.h0.getBackgroundColor()));
                    F2.P(x02);
                    if (F2.x() > 0) {
                        j4Var.m(new org.telegram.messenger.j6(j4Var, F2, f7, 1));
                        return true;
                    }
                }
                return false;
            case 1:
                k8 k8Var = (k8) this.b;
                n8 n8Var = k8Var.x;
                if (k8Var.n != null) {
                    int i13 = -1;
                    int i14 = -1;
                    for (int i15 = 0; i15 < k8Var.d; i15++) {
                        l8 l8Var = (l8) k8Var.n.get(i15, null);
                        if (l8Var != null) {
                            if (i13 == -1) {
                                i13 = l8Var.h;
                            }
                            i14 = l8Var.h;
                        }
                    }
                    if (i13 >= 0 && i14 >= 0) {
                        n8Var.G = true;
                        n8Var.P = i13;
                        n8Var.Q = i14;
                        n8Var.x0();
                        n8Var.q0();
                    }
                }
                return false;
            case 2:
                gl glVar = (gl) this.b;
                wn wnVar = glVar.c;
                if (AndroidUtilities.isTablet() || (wnVar.R9() && !UserObject.isBot(wnVar.f))) {
                    return false;
                }
                glVar.b = glVar.a;
                wnVar.va(true);
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
                        cq0Var.J.setOnTouchListener(new org.telegram.ui.Components.kf(cq0Var));
                        cq0Var.J.setDispatchKeyEventListener(new up0(cq0Var, 1));
                        cq0Var.J.setShownFromBottom(false);
                        cq0Var.K = new org.telegram.ui.ActionBar.g1[2];
                        int i17 = 0;
                        while (i17 < 2) {
                            if ((i17 != 0 || wnVar2.K6()) && (i17 != 1 || !UserObject.isUserSelf(i16))) {
                                cq0Var.K[i17] = new org.telegram.ui.ActionBar.g1(cq0Var.getParentActivity(), i17 == 0, i17 == 1);
                                if (i17 != 0) {
                                    cq0Var.K[i17].j(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
                                } else if (UserObject.isUserSelf(i16)) {
                                    cq0Var.K[i17].j(LocaleController.getString(R.string.SetReminder), R.drawable.msg_calendar2, null);
                                } else {
                                    cq0Var.K[i17].j(LocaleController.getString(R.string.ScheduleMessage), R.drawable.msg_calendar2, null);
                                }
                                cq0Var.K[i17].setMinimumWidth(AndroidUtilities.dp(196.0f));
                                cq0Var.J.a(cq0Var.K[i17], org.telegram.ui.Components.kb1.r(-1, 48));
                                cq0Var.K[i17].setOnClickListener(new ai.w(cq0Var, i17, 28));
                            }
                            i17++;
                        }
                        cq0Var.J.setupRadialSelectors(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.I5, false));
                        org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(cq0Var.J, -2, -2);
                        cq0Var.I = o1Var;
                        o1Var.b = false;
                        o1Var.setAnimationStyle(R.style.PopupContextAnimation2);
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
                        tq0Var.n0.setOnTouchListener(new org.telegram.ui.Components.kf(tq0Var));
                        tq0Var.n0.setDispatchKeyEventListener(new gq0(tq0Var, 3));
                        tq0Var.n0.setShownFromBottom(false);
                        tq0Var.o0 = new org.telegram.ui.ActionBar.g1[2];
                        int i19 = 0;
                        while (i19 < 2) {
                            if ((i19 != 0 || wnVar3.K6()) && (i19 != 1 || !UserObject.isUserSelf(i18))) {
                                tq0Var.o0[i19] = new org.telegram.ui.ActionBar.g1(tq0Var.getParentActivity(), i19 == 0, i19 == 1);
                                if (i19 != 0) {
                                    tq0Var.o0[i19].j(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
                                } else if (UserObject.isUserSelf(i18)) {
                                    tq0Var.o0[i19].j(LocaleController.getString(R.string.SetReminder), R.drawable.msg_calendar2, null);
                                } else {
                                    tq0Var.o0[i19].j(LocaleController.getString(R.string.ScheduleMessage), R.drawable.msg_calendar2, null);
                                }
                                tq0Var.o0[i19].setMinimumWidth(AndroidUtilities.dp(196.0f));
                                tq0Var.n0.a(tq0Var.o0[i19], org.telegram.ui.Components.kb1.r(-1, 48));
                                tq0Var.o0[i19].setOnClickListener(new ai.w(tq0Var, i19, 29));
                            }
                            i19++;
                        }
                        tq0Var.n0.setupRadialSelectors(org.telegram.ui.ActionBar.y6.x0(null, tq0Var.w0, false));
                        org.telegram.ui.ActionBar.o1 o1Var2 = new org.telegram.ui.ActionBar.o1(tq0Var.n0, -2, -2);
                        tq0Var.m0 = o1Var2;
                        o1Var2.b = false;
                        o1Var2.setAnimationStyle(R.style.PopupContextAnimation2);
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
                qu0 qu0Var2 = photoViewer.d;
                if ((qu0Var2 != null && !qu0Var2.U()) || photoViewer.c2 == 11) {
                    return false;
                }
                org.telegram.ui.ActionBar.r2 r2Var = photoViewer.m4;
                boolean z12 = (r2Var == null || r2Var.getLastStoryViewer() == null) ? false : true;
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
                    b10 = photoViewer.l4.K6();
                } else {
                    qu0 qu0Var3 = photoViewer.d;
                    if (qu0Var3 == null) {
                        return false;
                    }
                    long a2 = qu0Var3.a();
                    user = a2 != 0 ? MessagesController.getInstance(photoViewer.T).getUser(Long.valueOf(a2)) : null;
                    b10 = photoViewer.d.b();
                }
                qu0 qu0Var4 = photoViewer.d;
                boolean z13 = qu0Var4 != null && qu0Var4.p();
                qu0 qu0Var5 = photoViewer.d;
                boolean z14 = qu0Var5 != null && qu0Var5.r();
                boolean isUserSelf = UserObject.isUserSelf(user);
                qu0 qu0Var6 = photoViewer.d;
                if (qu0Var6 != null && qu0Var6.v() != null) {
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
                        if (!z13) {
                            qs0 qs0Var = photoViewer.U1;
                            if ((!qs0Var.U0 || qs0Var.b1 <= 0) && ((qu0Var = photoViewer.d) == null || qu0Var.I())) {
                                ?? r11 = photoViewer.g7;
                                int i20 = photoViewer.P4;
                                Object obj2 = (i20 < 0 || i20 >= r11.size()) ? null : r11.get(photoViewer.P4);
                                if (photoViewer.r1) {
                                    hu0 hu0Var = photoViewer.X4;
                                    if (!photoViewer.r) {
                                        if (photoViewer.o8 <= 0.0f) {
                                            if (photoViewer.p8 >= 1.0f) {
                                                if (obj2 instanceof MediaController.MediaEditState) {
                                                    break;
                                                }
                                                if (hu0Var != null) {
                                                    MediaController.CropState cropState = hu0Var.c;
                                                    if (cropState != null) {
                                                        break;
                                                    }
                                                    if (hu0Var.d == null) {
                                                        if (hu0Var.a == null) {
                                                            ArrayList arrayList2 = hu0Var.e;
                                                            if (arrayList2 != null) {
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                qu0 qu0Var7 = photoViewer.d;
                                HashMap v = qu0Var7 != null ? qu0Var7.v() : null;
                                if (v != null) {
                                    r11 = v.values();
                                }
                                for (Object obj3 : r11) {
                                    if (obj3 == obj2 || !(obj3 instanceof MediaController.MediaEditState) || !((MediaController.MediaEditState) obj3).hasVideoEditsLostAsDocument()) {
                                    }
                                }
                                z11 = true;
                                boolean z15 = z13 && b10 && !z10;
                                boolean z16 = (z13 || !z14) && !isUserSelf;
                                qu0 qu0Var8 = photoViewer.d;
                                boolean z17 = qu0Var8 == null && qu0Var8.H() > 1;
                                F = org.telegram.ui.Components.l80.F(photoViewer.e0, new di.b(), view);
                                F.l(R.drawable.msg_sendfile, LocaleController.getString(z17 ? R.string.SendAsFiles : R.string.SendAsFile), new zq0(photoViewer, 2), z11);
                                F.l(R.drawable.msg_send, LocaleController.getString(R.string.SendAsNewPhoto), new zq0(photoViewer, 3), z14);
                                F.l(R.drawable.msg_replace, LocaleController.getString(R.string.ReplacePhoto), new zq0(photoViewer, 4), z14);
                                F.l(R.drawable.msg_calendar2, LocaleController.getString(isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new zq0(photoViewer, 5), z15);
                                F.l(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new zq0(photoViewer, 6), z16);
                                if (F.x() == 0) {
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
                        qu0 qu0Var82 = photoViewer.d;
                        if (qu0Var82 == null) {
                        }
                        F = org.telegram.ui.Components.l80.F(photoViewer.e0, new di.b(), view);
                        F.l(R.drawable.msg_sendfile, LocaleController.getString(z17 ? R.string.SendAsFiles : R.string.SendAsFile), new zq0(photoViewer, 2), z11);
                        F.l(R.drawable.msg_send, LocaleController.getString(R.string.SendAsNewPhoto), new zq0(photoViewer, 3), z14);
                        F.l(R.drawable.msg_replace, LocaleController.getString(R.string.ReplacePhoto), new zq0(photoViewer, 4), z14);
                        F.l(R.drawable.msg_calendar2, LocaleController.getString(isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new zq0(photoViewer, 5), z15);
                        F.l(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new zq0(photoViewer, 6), z16);
                        if (F.x() == 0) {
                        }
                    }
                }
                z10 = false;
                if (!z13) {
                }
                z11 = false;
                if (z13) {
                }
                if (z13) {
                }
                qu0 qu0Var822 = photoViewer.d;
                if (qu0Var822 == null) {
                }
                F = org.telegram.ui.Components.l80.F(photoViewer.e0, new di.b(), view);
                F.l(R.drawable.msg_sendfile, LocaleController.getString(z17 ? R.string.SendAsFiles : R.string.SendAsFile), new zq0(photoViewer, 2), z11);
                F.l(R.drawable.msg_send, LocaleController.getString(R.string.SendAsNewPhoto), new zq0(photoViewer, 3), z14);
                F.l(R.drawable.msg_replace, LocaleController.getString(R.string.ReplacePhoto), new zq0(photoViewer, 4), z14);
                F.l(R.drawable.msg_calendar2, LocaleController.getString(isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new zq0(photoViewer, 5), z15);
                F.l(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new zq0(photoViewer, 6), z16);
                if (F.x() == 0) {
                }
                break;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                if (profileActivity.J2 == null && !profileActivity.q1) {
                    profileActivity.E4(false);
                }
                return false;
            default:
                f61 f61Var = (f61) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f61Var.getContext(), 0, null);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearRecentEmojiStatusesTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearRecentEmojiStatusesText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new i41(f61Var));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.a.R0 = false;
                alertDialog$Builder.j(new u5(f61Var, 14));
                alertDialog$Builder.p();
                f61Var.w(1.0f);
                try {
                    f61Var.performHapticFeedback(0, 1);
                } catch (Exception unused3) {
                }
                return true;
        }
    }
}
