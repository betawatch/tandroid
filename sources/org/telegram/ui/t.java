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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01bd, code lost:
    
        if (r14.isEmpty() != false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x019d, code lost:
    
        if (((org.telegram.messenger.ze) r11).g == null) goto L114;
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
        int i7;
        WebBackForwardList webBackForwardList;
        TLRPC.User a22;
        boolean b10;
        boolean z9;
        boolean z10;
        org.telegram.ui.Components.k60 F;
        uq0 uq0Var;
        int i10 = this.a;
        int i11 = -1;
        int i12 = 3;
        int i13 = 2;
        Object obj = this.b;
        int i14 = 1;
        switch (i10) {
            case 0:
                final g4 g4Var = (g4) obj;
                ArrayList arrayList = g4Var.d0;
                if (g4Var.u0[0] != null) {
                    float f10 = g4Var.h0.M.d;
                    t3 t3Var = g4Var.K;
                    org.telegram.ui.Components.k60 F2 = org.telegram.ui.Components.k60.F(t3Var != null ? t3Var.c : g4Var.f0, null, view);
                    if (org.telegram.messenger.iz.v0) {
                        r11 = 0;
                        backgroundColor = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dl, false);
                    } else {
                        r11 = 0;
                        backgroundColor = g4Var.u0[0].getBackgroundColor();
                    }
                    if (org.telegram.messenger.iz.v0) {
                        i11 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, r11);
                    } else if (org.telegram.messenger.g0.B(g4Var.u0[r11].getBackgroundColor()) >= 0.721f) {
                        i11 = -16777216;
                    }
                    int r12 = org.telegram.ui.ActionBar.k6.r1(0.65f, i11);
                    org.telegram.ui.web.u0 webView = g4Var.u0[0].getWebView();
                    if (webView != null) {
                        WebBackForwardList copyBackForwardList = webView.copyBackForwardList();
                        int currentIndex = copyBackForwardList.getCurrentIndex();
                        if (copyBackForwardList.getCurrentIndex() > 0) {
                            int i15 = 0;
                            while (i15 < currentIndex) {
                                WebHistoryItem itemAtIndex = copyBackForwardList.getItemAtIndex(i15);
                                int i16 = i13;
                                F2.c(0, itemAtIndex.getTitle(), new jg.r(currentIndex, i15, webView, 9), false);
                                org.telegram.ui.ActionBar.z0 y10 = F2.y();
                                if (y10 != null) {
                                    y10.setSubtext(itemAtIndex.getUrl());
                                    Bitmap bitmap = (Bitmap) webView.P.get(itemAtIndex.getUrl());
                                    if (bitmap == null) {
                                        bitmap = itemAtIndex.getFavicon();
                                    }
                                    webBackForwardList = copyBackForwardList;
                                    y10.j(itemAtIndex.getTitle(), 0, new ai.m1(bitmap, new Paint(i12), 1));
                                    y10.setTextColor(i11);
                                    y10.setSubtextColor(r12);
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
                        if (obj2 instanceof x2) {
                            x2 x2Var = (x2) obj2;
                            final int i18 = 0;
                            F2.c(0, x2Var.b(), new Runnable() { // from class: org.telegram.ui.v
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i18) {
                                        case 0:
                                            g4Var.F(size);
                                            break;
                                        default:
                                            g4Var.F(size);
                                            break;
                                    }
                                }
                            }, false);
                            org.telegram.ui.ActionBar.z0 y11 = F2.y();
                            if (y11 != null) {
                                y11.setSubtext(x2Var.x);
                                Bitmap bitmap2 = webView != null ? (Bitmap) webView.P.get(x2Var.x) : null;
                                if (bitmap2 == null) {
                                    bitmap2 = x2Var.F;
                                }
                                i7 = i17;
                                y11.j(x2Var.b(), 0, new ai.m1(bitmap2, new Paint(3), i7));
                                y11.setTextColor(i11);
                                y11.setSubtextColor(r12);
                                y11.d(i11, i11);
                            } else {
                                i7 = i17;
                            }
                        } else {
                            i7 = i17;
                            if (obj2 instanceof TLRPC.WebPage) {
                                TLRPC.WebPage webPage = (TLRPC.WebPage) obj2;
                                final int i19 = 1;
                                F2.c(0, webPage.title, new Runnable() { // from class: org.telegram.ui.v
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i19) {
                                            case 0:
                                                g4Var.F(size);
                                                break;
                                            default:
                                                g4Var.F(size);
                                                break;
                                        }
                                    }
                                }, false);
                                org.telegram.ui.ActionBar.z0 y12 = F2.y();
                                if (y12 != null) {
                                    org.telegram.ui.Components.ch0 ch0Var = y12.c;
                                    y12.j(webPage.title, R.drawable.msg_instant, null);
                                    y12.setTextColor(i11);
                                    if (!TextUtils.isEmpty(webPage.site_name)) {
                                        y12.setSubtext(webPage.site_name);
                                    }
                                    y12.setSubtextColor(r12);
                                    ch0Var.getLayoutParams().width = org.telegram.messenger.g0.L(24.0f);
                                    ch0Var.setScaleX(1.45f);
                                    ch0Var.setScaleY(1.45f);
                                    y12.d(i11, i11);
                                    size--;
                                    i17 = i7;
                                }
                            }
                        }
                        size--;
                        i17 = i7;
                    }
                    F2.W(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(40.0f), g4Var.h0.getBackgroundColor()));
                    F2.P(backgroundColor);
                    if (F2.x() > 0) {
                        g4Var.k(new org.telegram.messenger.ie(g4Var, F2, f10, 1));
                        return true;
                    }
                }
                return false;
            case 1:
                e8 e8Var = (e8) obj;
                h8 h8Var = e8Var.y;
                if (e8Var.n == null) {
                    return false;
                }
                int i20 = -1;
                int i21 = -1;
                for (int i22 = 0; i22 < e8Var.d; i22++) {
                    f8 f8Var = (f8) e8Var.n.get(i22, null);
                    if (f8Var != null) {
                        if (i20 == -1) {
                            i20 = f8Var.h;
                        }
                        i21 = f8Var.h;
                    }
                }
                if (i20 < 0 || i21 < 0) {
                    return false;
                }
                h8Var.G = true;
                h8Var.P = i20;
                h8Var.Q = i21;
                h8Var.B0();
                h8Var.u0();
                return false;
            case 2:
                nk nkVar = (nk) obj;
                an anVar = nkVar.c;
                if (org.telegram.messenger.g0.Q1() || (anVar.da() && !org.telegram.messenger.t10.t(anVar.f))) {
                    return false;
                }
                nkVar.b = nkVar.a;
                anVar.Ia(true);
                return true;
            case 3:
                mm0 mm0Var = (mm0) obj;
                an anVar2 = mm0Var.F;
                if (anVar2 == null || mm0Var.G == 1) {
                    return false;
                }
                TLRPC.User j3 = anVar2.j();
                if (mm0Var.J == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(mm0Var.getParentActivity(), null);
                    mm0Var.J = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
                    mm0Var.J.setOnTouchListener(new org.telegram.ui.Components.se(mm0Var));
                    mm0Var.J.setDispatchKeyEventListener(new im0(mm0Var, i14));
                    mm0Var.J.setShownFromBottom(false);
                    mm0Var.K = new org.telegram.ui.ActionBar.z0[2];
                    int i23 = 0;
                    while (i23 < 2) {
                        if ((i23 != 0 || anVar2.R6()) && (i23 != 1 || !org.telegram.messenger.t10.B(j3))) {
                            mm0Var.K[i23] = new org.telegram.ui.ActionBar.z0(mm0Var.getParentActivity(), i23 == 0, i23 == 1);
                            if (i23 != 0) {
                                mm0Var.K[i23].j(org.telegram.messenger.id.M0(2131745586, null), R.drawable.input_notify_off, null);
                            } else if (org.telegram.messenger.t10.B(j3)) {
                                mm0Var.K[i23].j(org.telegram.messenger.id.M0(2131745517, null), R.drawable.msg_calendar2, null);
                            } else {
                                mm0Var.K[i23].j(org.telegram.messenger.id.M0(2131745862, null), R.drawable.msg_calendar2, null);
                            }
                            mm0Var.K[i23].setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                            mm0Var.J.a(mm0Var.K[i23], c8.ha.o(-1, 48));
                            mm0Var.K[i23].setOnClickListener(new ai.v(mm0Var, i23, 27));
                        }
                        i23++;
                    }
                    mm0Var.J.setupRadialSelectors(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.I5, false));
                    org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(mm0Var.J, -2, -2);
                    mm0Var.I = g1Var;
                    g1Var.b = false;
                    g1Var.setAnimationStyle(R.style.PopupContextAnimation2);
                    mm0Var.I.setOutsideTouchable(true);
                    mm0Var.I.setClippingEnabled(true);
                    mm0Var.I.setInputMethodMode(2);
                    mm0Var.I.setSoftInputMode(0);
                    mm0Var.I.getContentView().setFocusableInTouchMode(true);
                }
                mm0Var.J.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                mm0Var.I.setFocusable(true);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                mm0Var.I.showAtLocation(view, 51, org.telegram.messenger.g0.L(8.0f) + ((view.getMeasuredWidth() + iArr[0]) - mm0Var.J.getMeasuredWidth()), (iArr[1] - mm0Var.J.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f));
                mm0Var.I.b();
                try {
                    view.performHapticFeedback(3, 2);
                    return false;
                } catch (Exception unused) {
                    return false;
                }
            case 4:
                xm0 xm0Var = (xm0) obj;
                an anVar3 = xm0Var.U;
                if (anVar3 == null || xm0Var.H == 1) {
                    return false;
                }
                TLRPC.User j10 = anVar3.j();
                if (xm0Var.n0 == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(xm0Var.getParentActivity(), null);
                    xm0Var.n0 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
                    xm0Var.n0.setOnTouchListener(new org.telegram.ui.Components.se(xm0Var));
                    xm0Var.n0.setDispatchKeyEventListener(new qm0(xm0Var, i12));
                    xm0Var.n0.setShownFromBottom(false);
                    xm0Var.o0 = new org.telegram.ui.ActionBar.z0[2];
                    int i24 = 0;
                    while (i24 < 2) {
                        if ((i24 != 0 || anVar3.R6()) && (i24 != 1 || !org.telegram.messenger.t10.B(j10))) {
                            xm0Var.o0[i24] = new org.telegram.ui.ActionBar.z0(xm0Var.getParentActivity(), i24 == 0, i24 == 1);
                            if (i24 != 0) {
                                xm0Var.o0[i24].j(org.telegram.messenger.id.M0(2131745586, null), R.drawable.input_notify_off, null);
                            } else if (org.telegram.messenger.t10.B(j10)) {
                                xm0Var.o0[i24].j(org.telegram.messenger.id.M0(2131745517, null), R.drawable.msg_calendar2, null);
                            } else {
                                xm0Var.o0[i24].j(org.telegram.messenger.id.M0(2131745862, null), R.drawable.msg_calendar2, null);
                            }
                            xm0Var.o0[i24].setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                            xm0Var.n0.a(xm0Var.o0[i24], c8.ha.o(-1, 48));
                            xm0Var.o0[i24].setOnClickListener(new ai.v(xm0Var, i24, 28));
                        }
                        i24++;
                    }
                    xm0Var.n0.setupRadialSelectors(org.telegram.ui.ActionBar.k6.x0(null, xm0Var.w0, false));
                    org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(xm0Var.n0, -2, -2);
                    xm0Var.m0 = g1Var2;
                    g1Var2.b = false;
                    g1Var2.setAnimationStyle(R.style.PopupContextAnimation2);
                    xm0Var.m0.setOutsideTouchable(true);
                    xm0Var.m0.setClippingEnabled(true);
                    xm0Var.m0.setInputMethodMode(2);
                    xm0Var.m0.setSoftInputMode(0);
                    xm0Var.m0.getContentView().setFocusableInTouchMode(true);
                }
                xm0Var.n0.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                xm0Var.m0.setFocusable(true);
                int[] iArr2 = new int[2];
                view.getLocationInWindow(iArr2);
                xm0Var.m0.showAtLocation(view, 51, org.telegram.messenger.g0.L(8.0f) + ((view.getMeasuredWidth() + iArr2[0]) - xm0Var.n0.getMeasuredWidth()), (iArr2[1] - xm0Var.n0.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f));
                xm0Var.m0.b();
                try {
                    view.performHapticFeedback(3, 2);
                    return false;
                } catch (Exception unused2) {
                    return false;
                }
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                uq0 uq0Var2 = photoViewer.d;
                if ((uq0Var2 == null || uq0Var2.U()) && photoViewer.c2 != 11) {
                    org.telegram.ui.ActionBar.f2 f2Var = photoViewer.l4;
                    boolean z11 = (f2Var == null || f2Var.getLastStoryViewer() == null) ? false : true;
                    an anVar4 = photoViewer.k4;
                    if ((anVar4 == null || !anVar4.c()) && ((photoViewer.k4 != null || z11 || photoViewer.d != null) && !photoViewer.U1.o())) {
                        an anVar5 = photoViewer.k4;
                        if (anVar5 != null) {
                            a22 = anVar5.j();
                            b10 = photoViewer.k4.R6();
                        } else {
                            uq0 uq0Var3 = photoViewer.d;
                            if (uq0Var3 != null) {
                                long a10 = uq0Var3.a();
                                a22 = a10 != 0 ? org.telegram.messenger.qp.s1(photoViewer.T).a2(Long.valueOf(a10)) : null;
                                b10 = photoViewer.d.b();
                            }
                        }
                        uq0 uq0Var4 = photoViewer.d;
                        boolean z12 = uq0Var4 != null && uq0Var4.p();
                        uq0 uq0Var5 = photoViewer.d;
                        boolean z13 = uq0Var5 != null && uq0Var5.r();
                        boolean B = org.telegram.messenger.t10.B(a22);
                        uq0 uq0Var6 = photoViewer.d;
                        if (uq0Var6 != null && uq0Var6.v() != null) {
                            Iterator it = photoViewer.d.v().entrySet().iterator();
                            while (it.hasNext()) {
                                Object value = ((Map.Entry) it.next()).getValue();
                                if (!(value instanceof org.telegram.messenger.gf)) {
                                    z9 = (value instanceof org.telegram.messenger.kf) && ((org.telegram.messenger.kf) value).x != 0;
                                } else if (((org.telegram.messenger.gf) value).x != 0) {
                                }
                                if (!z12) {
                                    zo0 zo0Var = photoViewer.U1;
                                    if ((!zo0Var.T0 || zo0Var.a1 <= 0) && ((uq0Var = photoViewer.d) == null || uq0Var.I())) {
                                        ?? r122 = photoViewer.f7;
                                        int i25 = photoViewer.O4;
                                        Object obj3 = (i25 < 0 || i25 >= r122.size()) ? null : r122.get(photoViewer.O4);
                                        if (photoViewer.r1) {
                                            mq0 mq0Var = photoViewer.W4;
                                            if (!photoViewer.r) {
                                                if (photoViewer.n8 <= 0.0f) {
                                                    if (photoViewer.o8 >= 1.0f) {
                                                        if (obj3 instanceof org.telegram.messenger.ze) {
                                                            break;
                                                        }
                                                        if (mq0Var != null) {
                                                            org.telegram.messenger.ye yeVar = mq0Var.c;
                                                            if (yeVar != null) {
                                                                break;
                                                            }
                                                            if (mq0Var.d == null) {
                                                                if (mq0Var.a == null) {
                                                                    ArrayList arrayList2 = mq0Var.e;
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
                                        uq0 uq0Var7 = photoViewer.d;
                                        HashMap v = uq0Var7 != null ? uq0Var7.v() : null;
                                        if (v != null) {
                                            r122 = v.values();
                                        }
                                        for (Object obj4 : r122) {
                                            if (obj4 == obj3 || !(obj4 instanceof org.telegram.messenger.ze) || !((org.telegram.messenger.ze) obj4).b()) {
                                            }
                                        }
                                        z10 = true;
                                        boolean z14 = z12 && b10 && !z9;
                                        boolean z15 = (z12 || !z13) && !B;
                                        uq0 uq0Var8 = photoViewer.d;
                                        boolean z16 = uq0Var8 == null && uq0Var8.H() > 1;
                                        F = org.telegram.ui.Components.k60.F(photoViewer.e0, new di.b(), view);
                                        F.l(R.drawable.msg_sendfile, org.telegram.messenger.id.M0(z16 ? 2131745638 : 2131745639, null), new cn0(photoViewer, i13), z10);
                                        F.l(R.drawable.msg_send, org.telegram.messenger.id.M0(2131745637, null), new cn0(photoViewer, i12), z13);
                                        F.l(R.drawable.msg_replace, org.telegram.messenger.id.M0(2131746270, null), new cn0(photoViewer, 4), z13);
                                        F.l(R.drawable.msg_calendar2, org.telegram.messenger.id.M0(B ? 2131745517 : 2131745862, null), new cn0(photoViewer, 5), z14);
                                        F.l(R.drawable.input_notify_off, org.telegram.messenger.id.M0(2131745586, null), new cn0(photoViewer, 6), z15);
                                        if (F.x() != 0) {
                                            F.V(5);
                                            F.Z();
                                            return true;
                                        }
                                    }
                                }
                                z10 = false;
                                if (z12) {
                                }
                                if (z12) {
                                }
                                uq0 uq0Var82 = photoViewer.d;
                                if (uq0Var82 == null) {
                                }
                                F = org.telegram.ui.Components.k60.F(photoViewer.e0, new di.b(), view);
                                F.l(R.drawable.msg_sendfile, org.telegram.messenger.id.M0(z16 ? 2131745638 : 2131745639, null), new cn0(photoViewer, i13), z10);
                                F.l(R.drawable.msg_send, org.telegram.messenger.id.M0(2131745637, null), new cn0(photoViewer, i12), z13);
                                F.l(R.drawable.msg_replace, org.telegram.messenger.id.M0(2131746270, null), new cn0(photoViewer, 4), z13);
                                F.l(R.drawable.msg_calendar2, org.telegram.messenger.id.M0(B ? 2131745517 : 2131745862, null), new cn0(photoViewer, 5), z14);
                                F.l(R.drawable.input_notify_off, org.telegram.messenger.id.M0(2131745586, null), new cn0(photoViewer, 6), z15);
                                if (F.x() != 0) {
                                }
                            }
                        }
                        if (!z12) {
                        }
                        z10 = false;
                        if (z12) {
                        }
                        if (z12) {
                        }
                        uq0 uq0Var822 = photoViewer.d;
                        if (uq0Var822 == null) {
                        }
                        F = org.telegram.ui.Components.k60.F(photoViewer.e0, new di.b(), view);
                        F.l(R.drawable.msg_sendfile, org.telegram.messenger.id.M0(z16 ? 2131745638 : 2131745639, null), new cn0(photoViewer, i13), z10);
                        F.l(R.drawable.msg_send, org.telegram.messenger.id.M0(2131745637, null), new cn0(photoViewer, i12), z13);
                        F.l(R.drawable.msg_replace, org.telegram.messenger.id.M0(2131746270, null), new cn0(photoViewer, 4), z13);
                        F.l(R.drawable.msg_calendar2, org.telegram.messenger.id.M0(B ? 2131745517 : 2131745862, null), new cn0(photoViewer, 5), z14);
                        F.l(R.drawable.input_notify_off, org.telegram.messenger.id.M0(2131745586, null), new cn0(photoViewer, 6), z15);
                        if (F.x() != 0) {
                        }
                    }
                }
                return false;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (profileActivity.I2 == null && !profileActivity.p1) {
                    profileActivity.K4(false);
                }
                return false;
            default:
                q11 q11Var = (q11) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, q11Var.getContext(), null);
                String M0 = org.telegram.messenger.id.M0(2131752070, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.id.M0(2131752071, null);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131752101, null), new uz0(q11Var));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                u1Var.P0 = false;
                alertDialog$Builder.j(new q5(q11Var, 14));
                alertDialog$Builder.p();
                q11Var.w(1.0f);
                try {
                    q11Var.performHapticFeedback(0, 1);
                } catch (Exception unused3) {
                }
                return true;
        }
    }
}
