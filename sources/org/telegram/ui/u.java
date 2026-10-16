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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u(Object obj, int i10) {
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
        hv0 hv0Var;
        switch (this.a) {
            case 0:
                final k4 k4Var = (k4) this.b;
                ArrayList arrayList = k4Var.d0;
                ?? r52 = 0;
                if (k4Var.u0[0] != null) {
                    float f7 = k4Var.h0.M.d;
                    x3 x3Var = k4Var.K;
                    ?? F2 = org.telegram.ui.Components.l80.F(x3Var != null ? x3Var.c : k4Var.f0, null, view);
                    int x02 = SharedConfig.adaptableColorInBrowser ? org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Pk, false) : k4Var.u0[0].getBackgroundColor();
                    int x03 = SharedConfig.adaptableColorInBrowser ? org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G6, false) : AndroidUtilities.computePerceivedBrightness(k4Var.u0[0].getBackgroundColor()) >= 0.721f ? -16777216 : -1;
                    int m12 = org.telegram.ui.ActionBar.g6.m1(0.65f, x03);
                    org.telegram.ui.web.z0 webView = k4Var.u0[0].getWebView();
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
                oq0 oq0Var = (oq0) this.b;
                fo foVar2 = oq0Var.F;
                if (foVar2 != null && oq0Var.G != 1) {
                    TLRPC.User i16 = foVar2.i();
                    if (oq0Var.J == null) {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(oq0Var.getParentActivity(), null);
                        oq0Var.J = actionBarPopupWindow$ActionBarPopupWindowLayout;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
                        oq0Var.J.setOnTouchListener(new org.telegram.ui.Components.mf(oq0Var));
                        oq0Var.J.setDispatchKeyEventListener(new fq0(oq0Var, 1));
                        oq0Var.J.setShownFromBottom(false);
                        oq0Var.K = new org.telegram.ui.ActionBar.e1[2];
                        int i17 = 0;
                        while (i17 < 2) {
                            if ((i17 != 0 || foVar2.G6()) && (i17 != 1 || !UserObject.isUserSelf(i16))) {
                                oq0Var.K[i17] = new org.telegram.ui.ActionBar.e1(oq0Var.getParentActivity(), i17 == 0, i17 == 1);
                                if (i17 != 0) {
                                    oq0Var.K[i17].g(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
                                } else if (UserObject.isUserSelf(i16)) {
                                    oq0Var.K[i17].g(LocaleController.getString(R.string.SetReminder), R.drawable.msg_calendar2, null);
                                } else {
                                    oq0Var.K[i17].g(LocaleController.getString(R.string.ScheduleMessage), R.drawable.msg_calendar2, null);
                                }
                                oq0Var.K[i17].setMinimumWidth(AndroidUtilities.dp(196.0f));
                                oq0Var.J.a(oq0Var.K[i17], w7.z5.n(-1, 48));
                                oq0Var.K[i17].setOnClickListener(new di.m4(oq0Var, i17, 21));
                            }
                            i17++;
                        }
                        oq0Var.J.setupRadialSelectors(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.I5, false));
                        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(oq0Var.J, -2, -2);
                        oq0Var.I = m1Var;
                        m1Var.b = false;
                        m1Var.setAnimationStyle(R.style.PopupContextAnimation2);
                        oq0Var.I.setOutsideTouchable(true);
                        oq0Var.I.setClippingEnabled(true);
                        oq0Var.I.setInputMethodMode(2);
                        oq0Var.I.setSoftInputMode(0);
                        oq0Var.I.getContentView().setFocusableInTouchMode(true);
                    }
                    oq0Var.J.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                    oq0Var.I.setFocusable(true);
                    int[] iArr = new int[2];
                    view.getLocationInWindow(iArr);
                    oq0Var.I.showAtLocation(view, 51, AndroidUtilities.dp(8.0f) + ((view.getMeasuredWidth() + iArr[0]) - oq0Var.J.getMeasuredWidth()), (iArr[1] - oq0Var.J.getMeasuredHeight()) - AndroidUtilities.dp(2.0f));
                    oq0Var.I.b();
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                return false;
            case 4:
                fr0 fr0Var = (fr0) this.b;
                fo foVar3 = fr0Var.U;
                if (foVar3 != null && fr0Var.H != 1) {
                    TLRPC.User i18 = foVar3.i();
                    if (fr0Var.n0 == null) {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(fr0Var.getParentActivity(), null);
                        fr0Var.n0 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                        actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
                        fr0Var.n0.setOnTouchListener(new org.telegram.ui.Components.mf(fr0Var));
                        fr0Var.n0.setDispatchKeyEventListener(new sq0(fr0Var, 3));
                        fr0Var.n0.setShownFromBottom(false);
                        fr0Var.o0 = new org.telegram.ui.ActionBar.e1[2];
                        int i19 = 0;
                        while (i19 < 2) {
                            if ((i19 != 0 || foVar3.G6()) && (i19 != 1 || !UserObject.isUserSelf(i18))) {
                                fr0Var.o0[i19] = new org.telegram.ui.ActionBar.e1(fr0Var.getParentActivity(), i19 == 0, i19 == 1);
                                if (i19 != 0) {
                                    fr0Var.o0[i19].g(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
                                } else if (UserObject.isUserSelf(i18)) {
                                    fr0Var.o0[i19].g(LocaleController.getString(R.string.SetReminder), R.drawable.msg_calendar2, null);
                                } else {
                                    fr0Var.o0[i19].g(LocaleController.getString(R.string.ScheduleMessage), R.drawable.msg_calendar2, null);
                                }
                                fr0Var.o0[i19].setMinimumWidth(AndroidUtilities.dp(196.0f));
                                fr0Var.n0.a(fr0Var.o0[i19], w7.z5.n(-1, 48));
                                fr0Var.o0[i19].setOnClickListener(new di.m4(fr0Var, i19, 22));
                            }
                            i19++;
                        }
                        fr0Var.n0.setupRadialSelectors(org.telegram.ui.ActionBar.g6.x0(null, fr0Var.w0, false));
                        org.telegram.ui.ActionBar.m1 m1Var2 = new org.telegram.ui.ActionBar.m1(fr0Var.n0, -2, -2);
                        fr0Var.m0 = m1Var2;
                        m1Var2.b = false;
                        m1Var2.setAnimationStyle(R.style.PopupContextAnimation2);
                        fr0Var.m0.setOutsideTouchable(true);
                        fr0Var.m0.setClippingEnabled(true);
                        fr0Var.m0.setInputMethodMode(2);
                        fr0Var.m0.setSoftInputMode(0);
                        fr0Var.m0.getContentView().setFocusableInTouchMode(true);
                    }
                    fr0Var.n0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                    fr0Var.m0.setFocusable(true);
                    int[] iArr2 = new int[2];
                    view.getLocationInWindow(iArr2);
                    fr0Var.m0.showAtLocation(view, 51, AndroidUtilities.dp(8.0f) + ((view.getMeasuredWidth() + iArr2[0]) - fr0Var.n0.getMeasuredWidth()), (iArr2[1] - fr0Var.n0.getMeasuredHeight()) - AndroidUtilities.dp(2.0f));
                    fr0Var.m0.b();
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused2) {
                    }
                }
                return false;
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                hv0 hv0Var2 = photoViewer.d;
                if ((hv0Var2 != null && !hv0Var2.U()) || photoViewer.c2 == 11) {
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
                    hv0 hv0Var3 = photoViewer.d;
                    if (hv0Var3 == null) {
                        return false;
                    }
                    long a2 = hv0Var3.a();
                    user = a2 != 0 ? MessagesController.getInstance(photoViewer.T).getUser(Long.valueOf(a2)) : null;
                    b10 = photoViewer.d.b();
                }
                hv0 hv0Var4 = photoViewer.d;
                boolean z13 = hv0Var4 != null && hv0Var4.p();
                hv0 hv0Var5 = photoViewer.d;
                boolean z14 = hv0Var5 != null && hv0Var5.r();
                boolean isUserSelf = UserObject.isUserSelf(user);
                hv0 hv0Var6 = photoViewer.d;
                if (hv0Var6 != null && hv0Var6.v() != null) {
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
                            ht0 ht0Var = photoViewer.U1;
                            if ((!ht0Var.U0 || ht0Var.b1 <= 0) && ((hv0Var = photoViewer.d) == null || hv0Var.I())) {
                                ?? r11 = photoViewer.g7;
                                int i20 = photoViewer.P4;
                                Object obj2 = (i20 < 0 || i20 >= r11.size()) ? null : r11.get(photoViewer.P4);
                                if (photoViewer.r1) {
                                    yu0 yu0Var = photoViewer.X4;
                                    if (!photoViewer.r) {
                                        if (photoViewer.o8 <= 0.0f) {
                                            if (photoViewer.p8 >= 1.0f) {
                                                if (obj2 instanceof MediaController.MediaEditState) {
                                                    break;
                                                }
                                                if (yu0Var != null) {
                                                    MediaController.CropState cropState = yu0Var.c;
                                                    if (cropState != null) {
                                                        break;
                                                    }
                                                    if (yu0Var.d == null) {
                                                        if (yu0Var.a == null) {
                                                            ArrayList arrayList2 = yu0Var.e;
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
                                hv0 hv0Var7 = photoViewer.d;
                                HashMap v = hv0Var7 != null ? hv0Var7.v() : null;
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
                                hv0 hv0Var8 = photoViewer.d;
                                boolean z17 = hv0Var8 == null && hv0Var8.H() > 1;
                                F = org.telegram.ui.Components.l80.F(photoViewer.e0, new bi.b(), view);
                                F.l(R.drawable.msg_sendfile, LocaleController.getString(z17 ? R.string.SendAsFiles : R.string.SendAsFile), new mr0(photoViewer, 2), z11);
                                F.l(R.drawable.msg_send, LocaleController.getString(R.string.SendAsNewPhoto), new mr0(photoViewer, 3), z14);
                                F.l(R.drawable.msg_replace, LocaleController.getString(R.string.ReplacePhoto), new mr0(photoViewer, 4), z14);
                                F.l(R.drawable.msg_calendar2, LocaleController.getString(isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new mr0(photoViewer, 5), z15);
                                F.l(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new mr0(photoViewer, 6), z16);
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
                        hv0 hv0Var82 = photoViewer.d;
                        if (hv0Var82 == null) {
                        }
                        F = org.telegram.ui.Components.l80.F(photoViewer.e0, new bi.b(), view);
                        F.l(R.drawable.msg_sendfile, LocaleController.getString(z17 ? R.string.SendAsFiles : R.string.SendAsFile), new mr0(photoViewer, 2), z11);
                        F.l(R.drawable.msg_send, LocaleController.getString(R.string.SendAsNewPhoto), new mr0(photoViewer, 3), z14);
                        F.l(R.drawable.msg_replace, LocaleController.getString(R.string.ReplacePhoto), new mr0(photoViewer, 4), z14);
                        F.l(R.drawable.msg_calendar2, LocaleController.getString(isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new mr0(photoViewer, 5), z15);
                        F.l(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new mr0(photoViewer, 6), z16);
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
                hv0 hv0Var822 = photoViewer.d;
                if (hv0Var822 == null) {
                }
                F = org.telegram.ui.Components.l80.F(photoViewer.e0, new bi.b(), view);
                F.l(R.drawable.msg_sendfile, LocaleController.getString(z17 ? R.string.SendAsFiles : R.string.SendAsFile), new mr0(photoViewer, 2), z11);
                F.l(R.drawable.msg_send, LocaleController.getString(R.string.SendAsNewPhoto), new mr0(photoViewer, 3), z14);
                F.l(R.drawable.msg_replace, LocaleController.getString(R.string.ReplacePhoto), new mr0(photoViewer, 4), z14);
                F.l(R.drawable.msg_calendar2, LocaleController.getString(isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new mr0(photoViewer, 5), z15);
                F.l(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new mr0(photoViewer, 6), z16);
                if (F.x() == 0) {
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
