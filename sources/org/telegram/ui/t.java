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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01bd, code lost:
    
        if (r14.isEmpty() != false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x019d, code lost:
    
        if (((org.telegram.messenger.se) r11).g == null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01ab, code lost:
    
        if (r15.b() != false) goto L120;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01fb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0151  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r12v34, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v35, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v37, types: [java.util.Collection] */
    @Override // android.view.View.OnLongClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onLongClick(View view) {
        ?? r11;
        int backgroundColor;
        int i3;
        WebBackForwardList webBackForwardList;
        TLRPC.User a22;
        boolean b10;
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.f60 F;
        kq0 kq0Var;
        int i10 = this.a;
        int i11 = -1;
        int i12 = 3;
        int i13 = 2;
        Object obj = this.b;
        int i14 = 1;
        switch (i10) {
            case 0:
                final i4 i4Var = (i4) obj;
                ArrayList arrayList = i4Var.e0;
                if (i4Var.v0[0] != null) {
                    float f10 = i4Var.i0.N.d;
                    u3 u3Var = i4Var.L;
                    org.telegram.ui.Components.f60 F2 = org.telegram.ui.Components.f60.F(u3Var != null ? u3Var.c : i4Var.g0, null, view);
                    if (org.telegram.messenger.az.v0) {
                        r11 = 0;
                        backgroundColor = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dl, false);
                    } else {
                        r11 = 0;
                        backgroundColor = i4Var.v0[0].getBackgroundColor();
                    }
                    if (org.telegram.messenger.az.v0) {
                        i11 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, r11);
                    } else if (org.telegram.messenger.g0.B(i4Var.v0[r11].getBackgroundColor()) >= 0.721f) {
                        i11 = -16777216;
                    }
                    int r12 = org.telegram.ui.ActionBar.k6.r1(0.65f, i11);
                    org.telegram.ui.web.t0 webView = i4Var.v0[0].getWebView();
                    if (webView != null) {
                        WebBackForwardList copyBackForwardList = webView.copyBackForwardList();
                        int currentIndex = copyBackForwardList.getCurrentIndex();
                        if (copyBackForwardList.getCurrentIndex() > 0) {
                            int i15 = 0;
                            while (i15 < currentIndex) {
                                WebHistoryItem itemAtIndex = copyBackForwardList.getItemAtIndex(i15);
                                int i16 = i13;
                                F2.c(0, itemAtIndex.getTitle(), new k2.u(currentIndex, i15, webView, 9), false);
                                org.telegram.ui.ActionBar.y0 y9 = F2.y();
                                if (y9 != null) {
                                    y9.setSubtext(itemAtIndex.getUrl());
                                    Bitmap bitmap = (Bitmap) webView.Q.get(itemAtIndex.getUrl());
                                    if (bitmap == null) {
                                        bitmap = itemAtIndex.getFavicon();
                                    }
                                    webBackForwardList = copyBackForwardList;
                                    y9.j(itemAtIndex.getTitle(), 0, new bi.b1(bitmap, new Paint(i12), 1));
                                    y9.setTextColor(i11);
                                    y9.setSubtextColor(r12);
                                } else {
                                    webBackForwardList = copyBackForwardList;
                                }
                                i15++;
                                copyBackForwardList = webBackForwardList;
                                i13 = i16;
                                i12 = 3;
                            }
                        }
                    }
                    int i17 = i13;
                    final int size = arrayList.size() - 2;
                    while (size >= 0) {
                        Object obj2 = arrayList.get(size);
                        if (obj2 instanceof y2) {
                            y2 y2Var = (y2) obj2;
                            final int i18 = 0;
                            F2.c(0, y2Var.b(), new Runnable() { // from class: org.telegram.ui.w
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i18) {
                                        case 0:
                                            i4Var.F(size);
                                            break;
                                        default:
                                            i4Var.F(size);
                                            break;
                                    }
                                }
                            }, false);
                            org.telegram.ui.ActionBar.y0 y10 = F2.y();
                            if (y10 != null) {
                                y10.setSubtext(y2Var.x);
                                Bitmap bitmap2 = webView != null ? (Bitmap) webView.Q.get(y2Var.x) : null;
                                if (bitmap2 == null) {
                                    bitmap2 = y2Var.F;
                                }
                                i3 = i17;
                                y10.j(y2Var.b(), 0, new bi.b1(bitmap2, new Paint(3), i3));
                                y10.setTextColor(i11);
                                y10.setSubtextColor(r12);
                                y10.d(i11, i11);
                            } else {
                                i3 = i17;
                            }
                        } else {
                            i3 = i17;
                            if (obj2 instanceof TLRPC.WebPage) {
                                TLRPC.WebPage webPage = (TLRPC.WebPage) obj2;
                                final int i19 = 1;
                                F2.c(0, webPage.title, new Runnable() { // from class: org.telegram.ui.w
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i19) {
                                            case 0:
                                                i4Var.F(size);
                                                break;
                                            default:
                                                i4Var.F(size);
                                                break;
                                        }
                                    }
                                }, false);
                                org.telegram.ui.ActionBar.y0 y11 = F2.y();
                                if (y11 != null) {
                                    org.telegram.ui.Components.fh0 fh0Var = y11.c;
                                    y11.j(webPage.title, R.drawable.msg_instant, null);
                                    y11.setTextColor(i11);
                                    if (!TextUtils.isEmpty(webPage.site_name)) {
                                        y11.setSubtext(webPage.site_name);
                                    }
                                    y11.setSubtextColor(r12);
                                    fh0Var.getLayoutParams().width = org.telegram.messenger.g0.L(24.0f);
                                    fh0Var.setScaleX(1.45f);
                                    fh0Var.setScaleY(1.45f);
                                    y11.d(i11, i11);
                                    size--;
                                    i17 = i3;
                                }
                            }
                        }
                        size--;
                        i17 = i3;
                    }
                    F2.W(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(40.0f), i4Var.i0.getBackgroundColor()));
                    F2.P(backgroundColor);
                    if (F2.x() > 0) {
                        i4Var.k(new org.telegram.messenger.ce(i4Var, F2, f10, 1));
                        return true;
                    }
                }
                return false;
            case 1:
                f8 f8Var = (f8) obj;
                i8 i8Var = f8Var.y;
                if (f8Var.n == null) {
                    return false;
                }
                int i20 = -1;
                int i21 = -1;
                for (int i22 = 0; i22 < f8Var.d; i22++) {
                    g8 g8Var = (g8) f8Var.n.get(i22, null);
                    if (g8Var != null) {
                        if (i20 == -1) {
                            i20 = g8Var.h;
                        }
                        i21 = g8Var.h;
                    }
                }
                if (i20 < 0 || i21 < 0) {
                    return false;
                }
                i8Var.H = true;
                i8Var.Q = i20;
                i8Var.R = i21;
                i8Var.B0();
                i8Var.u0();
                return false;
            case 2:
                jk jkVar = (jk) obj;
                wm wmVar = jkVar.c;
                if (org.telegram.messenger.g0.Q1() || (wmVar.da() && !org.telegram.messenger.l10.t(wmVar.f))) {
                    return false;
                }
                jkVar.b = jkVar.a;
                wmVar.Ia(true);
                return true;
            case 3:
                hm0 hm0Var = (hm0) obj;
                wm wmVar2 = hm0Var.G;
                if (wmVar2 == null || hm0Var.H == 1) {
                    return false;
                }
                TLRPC.User j10 = wmVar2.j();
                if (hm0Var.K == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(hm0Var.getParentActivity(), null);
                    hm0Var.K = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
                    hm0Var.K.setOnTouchListener(new org.telegram.ui.Components.qe(hm0Var));
                    hm0Var.K.setDispatchKeyEventListener(new dm0(hm0Var, i14));
                    hm0Var.K.setShownFromBottom(false);
                    hm0Var.L = new org.telegram.ui.ActionBar.y0[2];
                    int i23 = 0;
                    while (i23 < 2) {
                        if ((i23 != 0 || wmVar2.R6()) && (i23 != 1 || !org.telegram.messenger.l10.B(j10))) {
                            hm0Var.L[i23] = new org.telegram.ui.ActionBar.y0(hm0Var.getParentActivity(), i23 == 0, i23 == 1);
                            if (i23 != 0) {
                                hm0Var.L[i23].j(org.telegram.messenger.bd.M0(2131745593, null), R.drawable.input_notify_off, null);
                            } else if (org.telegram.messenger.l10.B(j10)) {
                                hm0Var.L[i23].j(org.telegram.messenger.bd.M0(2131745524, null), R.drawable.msg_calendar2, null);
                            } else {
                                hm0Var.L[i23].j(org.telegram.messenger.bd.M0(2131745869, null), R.drawable.msg_calendar2, null);
                            }
                            hm0Var.L[i23].setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                            hm0Var.K.a(hm0Var.L[i23], b8.mf.o(-1, 48));
                            hm0Var.L[i23].setOnClickListener(new bi.q(hm0Var, i23, 27));
                        }
                        i23++;
                    }
                    hm0Var.K.setupRadialSelectors(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.I5, false));
                    org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(hm0Var.K, -2, -2);
                    hm0Var.J = f1Var;
                    f1Var.b = false;
                    f1Var.setAnimationStyle(R.style.PopupContextAnimation2);
                    hm0Var.J.setOutsideTouchable(true);
                    hm0Var.J.setClippingEnabled(true);
                    hm0Var.J.setInputMethodMode(2);
                    hm0Var.J.setSoftInputMode(0);
                    hm0Var.J.getContentView().setFocusableInTouchMode(true);
                }
                hm0Var.K.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                hm0Var.J.setFocusable(true);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                hm0Var.J.showAtLocation(view, 51, org.telegram.messenger.g0.L(8.0f) + ((view.getMeasuredWidth() + iArr[0]) - hm0Var.K.getMeasuredWidth()), (iArr[1] - hm0Var.K.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f));
                hm0Var.J.b();
                try {
                    view.performHapticFeedback(3, 2);
                    return false;
                } catch (Exception unused) {
                    return false;
                }
            case 4:
                sm0 sm0Var = (sm0) obj;
                wm wmVar3 = sm0Var.V;
                if (wmVar3 == null || sm0Var.I == 1) {
                    return false;
                }
                TLRPC.User j11 = wmVar3.j();
                if (sm0Var.o0 == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(sm0Var.getParentActivity(), null);
                    sm0Var.o0 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
                    sm0Var.o0.setOnTouchListener(new org.telegram.ui.Components.qe(sm0Var));
                    sm0Var.o0.setDispatchKeyEventListener(new lm0(sm0Var, i12));
                    sm0Var.o0.setShownFromBottom(false);
                    sm0Var.p0 = new org.telegram.ui.ActionBar.y0[2];
                    int i24 = 0;
                    while (i24 < 2) {
                        if ((i24 != 0 || wmVar3.R6()) && (i24 != 1 || !org.telegram.messenger.l10.B(j11))) {
                            sm0Var.p0[i24] = new org.telegram.ui.ActionBar.y0(sm0Var.getParentActivity(), i24 == 0, i24 == 1);
                            if (i24 != 0) {
                                sm0Var.p0[i24].j(org.telegram.messenger.bd.M0(2131745593, null), R.drawable.input_notify_off, null);
                            } else if (org.telegram.messenger.l10.B(j11)) {
                                sm0Var.p0[i24].j(org.telegram.messenger.bd.M0(2131745524, null), R.drawable.msg_calendar2, null);
                            } else {
                                sm0Var.p0[i24].j(org.telegram.messenger.bd.M0(2131745869, null), R.drawable.msg_calendar2, null);
                            }
                            sm0Var.p0[i24].setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                            sm0Var.o0.a(sm0Var.p0[i24], b8.mf.o(-1, 48));
                            sm0Var.p0[i24].setOnClickListener(new bi.q(sm0Var, i24, 28));
                        }
                        i24++;
                    }
                    sm0Var.o0.setupRadialSelectors(org.telegram.ui.ActionBar.k6.x0(null, sm0Var.x0, false));
                    org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(sm0Var.o0, -2, -2);
                    sm0Var.n0 = f1Var2;
                    f1Var2.b = false;
                    f1Var2.setAnimationStyle(R.style.PopupContextAnimation2);
                    sm0Var.n0.setOutsideTouchable(true);
                    sm0Var.n0.setClippingEnabled(true);
                    sm0Var.n0.setInputMethodMode(2);
                    sm0Var.n0.setSoftInputMode(0);
                    sm0Var.n0.getContentView().setFocusableInTouchMode(true);
                }
                sm0Var.o0.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                sm0Var.n0.setFocusable(true);
                int[] iArr2 = new int[2];
                view.getLocationInWindow(iArr2);
                sm0Var.n0.showAtLocation(view, 51, org.telegram.messenger.g0.L(8.0f) + ((view.getMeasuredWidth() + iArr2[0]) - sm0Var.o0.getMeasuredWidth()), (iArr2[1] - sm0Var.o0.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f));
                sm0Var.n0.b();
                try {
                    view.performHapticFeedback(3, 2);
                    return false;
                } catch (Exception unused2) {
                    return false;
                }
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                kq0 kq0Var2 = photoViewer.d;
                if ((kq0Var2 == null || kq0Var2.U()) && photoViewer.d2 != 11) {
                    org.telegram.ui.ActionBar.d2 d2Var = photoViewer.n4;
                    boolean z12 = (d2Var == null || d2Var.getLastStoryViewer() == null) ? false : true;
                    wm wmVar4 = photoViewer.m4;
                    if ((wmVar4 == null || !wmVar4.c()) && ((photoViewer.m4 != null || z12 || photoViewer.d != null) && !photoViewer.V1.o())) {
                        wm wmVar5 = photoViewer.m4;
                        if (wmVar5 != null) {
                            a22 = wmVar5.j();
                            b10 = photoViewer.m4.R6();
                        } else {
                            kq0 kq0Var3 = photoViewer.d;
                            if (kq0Var3 != null) {
                                long a10 = kq0Var3.a();
                                a22 = a10 != 0 ? org.telegram.messenger.hp.s1(photoViewer.U).a2(Long.valueOf(a10)) : null;
                                b10 = photoViewer.d.b();
                            }
                        }
                        kq0 kq0Var4 = photoViewer.d;
                        boolean z13 = kq0Var4 != null && kq0Var4.p();
                        kq0 kq0Var5 = photoViewer.d;
                        boolean z14 = kq0Var5 != null && kq0Var5.r();
                        boolean B = org.telegram.messenger.l10.B(a22);
                        kq0 kq0Var6 = photoViewer.d;
                        if (kq0Var6 != null && kq0Var6.v() != null) {
                            Iterator it = photoViewer.d.v().entrySet().iterator();
                            while (it.hasNext()) {
                                Object value = ((Map.Entry) it.next()).getValue();
                                if (!(value instanceof org.telegram.messenger.ye)) {
                                    z10 = (value instanceof org.telegram.messenger.bf) && ((org.telegram.messenger.bf) value).x != 0;
                                } else if (((org.telegram.messenger.ye) value).x != 0) {
                                }
                                if (!z13) {
                                    qo0 qo0Var = photoViewer.V1;
                                    if ((!qo0Var.U0 || qo0Var.b1 <= 0) && ((kq0Var = photoViewer.d) == null || kq0Var.I())) {
                                        ?? r122 = photoViewer.h7;
                                        int i25 = photoViewer.Q4;
                                        Object obj3 = (i25 < 0 || i25 >= r122.size()) ? null : r122.get(photoViewer.Q4);
                                        if (photoViewer.s1) {
                                            dq0 dq0Var = photoViewer.Y4;
                                            if (!photoViewer.r) {
                                                if (photoViewer.p8 <= 0.0f) {
                                                    if (photoViewer.q8 >= 1.0f) {
                                                        if (obj3 instanceof org.telegram.messenger.se) {
                                                            break;
                                                        }
                                                        if (dq0Var != null) {
                                                            org.telegram.messenger.re reVar = dq0Var.c;
                                                            if (reVar != null) {
                                                                break;
                                                            }
                                                            if (dq0Var.d == null) {
                                                                if (dq0Var.a == null) {
                                                                    ArrayList arrayList2 = dq0Var.e;
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
                                        kq0 kq0Var7 = photoViewer.d;
                                        HashMap v = kq0Var7 != null ? kq0Var7.v() : null;
                                        if (v != null) {
                                            r122 = v.values();
                                        }
                                        for (Object obj4 : r122) {
                                            if (obj4 == obj3 || !(obj4 instanceof org.telegram.messenger.se) || !((org.telegram.messenger.se) obj4).b()) {
                                            }
                                        }
                                        z11 = true;
                                        boolean z15 = z13 && b10 && !z10;
                                        boolean z16 = (z13 || !z14) && !B;
                                        kq0 kq0Var8 = photoViewer.d;
                                        boolean z17 = kq0Var8 == null && kq0Var8.H() > 1;
                                        F = org.telegram.ui.Components.f60.F(photoViewer.f0, new ei.b(), view);
                                        F.l(R.drawable.msg_sendfile, org.telegram.messenger.bd.M0(z17 ? 2131745645 : 2131745646, null), new xm0(photoViewer, i13), z11);
                                        F.l(R.drawable.msg_send, org.telegram.messenger.bd.M0(2131745644, null), new xm0(photoViewer, i12), z14);
                                        F.l(R.drawable.msg_replace, org.telegram.messenger.bd.M0(2131746277, null), new xm0(photoViewer, 4), z14);
                                        F.l(R.drawable.msg_calendar2, org.telegram.messenger.bd.M0(B ? 2131745524 : 2131745869, null), new xm0(photoViewer, 5), z15);
                                        F.l(R.drawable.input_notify_off, org.telegram.messenger.bd.M0(2131745593, null), new xm0(photoViewer, 6), z16);
                                        if (F.x() != 0) {
                                            F.V(5);
                                            F.Z();
                                            return true;
                                        }
                                    }
                                }
                                z11 = false;
                                if (z13) {
                                }
                                if (z13) {
                                }
                                kq0 kq0Var82 = photoViewer.d;
                                if (kq0Var82 == null) {
                                }
                                F = org.telegram.ui.Components.f60.F(photoViewer.f0, new ei.b(), view);
                                F.l(R.drawable.msg_sendfile, org.telegram.messenger.bd.M0(z17 ? 2131745645 : 2131745646, null), new xm0(photoViewer, i13), z11);
                                F.l(R.drawable.msg_send, org.telegram.messenger.bd.M0(2131745644, null), new xm0(photoViewer, i12), z14);
                                F.l(R.drawable.msg_replace, org.telegram.messenger.bd.M0(2131746277, null), new xm0(photoViewer, 4), z14);
                                F.l(R.drawable.msg_calendar2, org.telegram.messenger.bd.M0(B ? 2131745524 : 2131745869, null), new xm0(photoViewer, 5), z15);
                                F.l(R.drawable.input_notify_off, org.telegram.messenger.bd.M0(2131745593, null), new xm0(photoViewer, 6), z16);
                                if (F.x() != 0) {
                                }
                            }
                        }
                        if (!z13) {
                        }
                        z11 = false;
                        if (z13) {
                        }
                        if (z13) {
                        }
                        kq0 kq0Var822 = photoViewer.d;
                        if (kq0Var822 == null) {
                        }
                        F = org.telegram.ui.Components.f60.F(photoViewer.f0, new ei.b(), view);
                        F.l(R.drawable.msg_sendfile, org.telegram.messenger.bd.M0(z17 ? 2131745645 : 2131745646, null), new xm0(photoViewer, i13), z11);
                        F.l(R.drawable.msg_send, org.telegram.messenger.bd.M0(2131745644, null), new xm0(photoViewer, i12), z14);
                        F.l(R.drawable.msg_replace, org.telegram.messenger.bd.M0(2131746277, null), new xm0(photoViewer, 4), z14);
                        F.l(R.drawable.msg_calendar2, org.telegram.messenger.bd.M0(B ? 2131745524 : 2131745869, null), new xm0(photoViewer, 5), z15);
                        F.l(R.drawable.input_notify_off, org.telegram.messenger.bd.M0(2131745593, null), new xm0(photoViewer, 6), z16);
                        if (F.x() != 0) {
                        }
                    }
                }
                return false;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (profileActivity.J2 == null && !profileActivity.q1) {
                    profileActivity.K4(false);
                }
                return false;
            default:
                g11 g11Var = (g11) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, g11Var.getContext(), null);
                String M0 = org.telegram.messenger.bd.M0(2131752070, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                s1Var.S = M0;
                s1Var.U = org.telegram.messenger.bd.M0(2131752071, null);
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752101, null), new lz0(g11Var));
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                s1Var.S0 = false;
                alertDialog$Builder.j(new s5(g11Var, 14));
                alertDialog$Builder.p();
                g11Var.w(1.0f);
                try {
                    g11Var.performHapticFeedback(0, 1);
                } catch (Exception unused3) {
                }
                return true;
        }
    }
}
