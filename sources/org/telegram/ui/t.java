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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
        xq0 xq0Var;
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
                        backgroundColor = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Dl, false);
                    } else {
                        r11 = 0;
                        backgroundColor = g4Var.u0[0].getBackgroundColor();
                    }
                    if (org.telegram.messenger.iz.v0) {
                        i11 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.G6, r11);
                    } else if (org.telegram.messenger.g0.B(g4Var.u0[r11].getBackgroundColor()) >= 0.721f) {
                        i11 = -16777216;
                    }
                    int r12 = org.telegram.ui.ActionBar.m6.r1(0.65f, i11);
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
                    F2.W(org.telegram.ui.ActionBar.m6.L(org.telegram.messenger.g0.L(40.0f), g4Var.h0.getBackgroundColor()));
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
                pk pkVar = (pk) obj;
                cn cnVar = pkVar.c;
                if (org.telegram.messenger.g0.Q1() || (cnVar.ea() && !org.telegram.messenger.t10.t(cnVar.f))) {
                    return false;
                }
                pkVar.b = pkVar.a;
                cnVar.Ka(true);
                return true;
            case 3:
                pm0 pm0Var = (pm0) obj;
                cn cnVar2 = pm0Var.F;
                if (cnVar2 == null || pm0Var.G == 1) {
                    return false;
                }
                TLRPC.User j3 = cnVar2.j();
                if (pm0Var.J == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(pm0Var.getParentActivity(), null);
                    pm0Var.J = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
                    pm0Var.J.setOnTouchListener(new org.telegram.ui.Components.re(pm0Var));
                    pm0Var.J.setDispatchKeyEventListener(new lm0(pm0Var, i14));
                    pm0Var.J.setShownFromBottom(false);
                    pm0Var.K = new org.telegram.ui.ActionBar.z0[2];
                    int i23 = 0;
                    while (i23 < 2) {
                        if ((i23 != 0 || cnVar2.S6()) && (i23 != 1 || !org.telegram.messenger.t10.B(j3))) {
                            pm0Var.K[i23] = new org.telegram.ui.ActionBar.z0(pm0Var.getParentActivity(), i23 == 0, i23 == 1);
                            if (i23 != 0) {
                                pm0Var.K[i23].j(org.telegram.messenger.id.M0(2131745583, null), R.drawable.input_notify_off, null);
                            } else if (org.telegram.messenger.t10.B(j3)) {
                                pm0Var.K[i23].j(org.telegram.messenger.id.M0(2131745514, null), R.drawable.msg_calendar2, null);
                            } else {
                                pm0Var.K[i23].j(org.telegram.messenger.id.M0(2131745859, null), R.drawable.msg_calendar2, null);
                            }
                            pm0Var.K[i23].setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                            pm0Var.J.a(pm0Var.K[i23], c8.ha.o(-1, 48));
                            pm0Var.K[i23].setOnClickListener(new ai.v(pm0Var, i23, 27));
                        }
                        i23++;
                    }
                    pm0Var.J.setupRadialSelectors(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.I5, false));
                    org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(pm0Var.J, -2, -2);
                    pm0Var.I = g1Var;
                    g1Var.b = false;
                    g1Var.setAnimationStyle(R.style.PopupContextAnimation2);
                    pm0Var.I.setOutsideTouchable(true);
                    pm0Var.I.setClippingEnabled(true);
                    pm0Var.I.setInputMethodMode(2);
                    pm0Var.I.setSoftInputMode(0);
                    pm0Var.I.getContentView().setFocusableInTouchMode(true);
                }
                pm0Var.J.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                pm0Var.I.setFocusable(true);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                pm0Var.I.showAtLocation(view, 51, org.telegram.messenger.g0.L(8.0f) + ((view.getMeasuredWidth() + iArr[0]) - pm0Var.J.getMeasuredWidth()), (iArr[1] - pm0Var.J.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f));
                pm0Var.I.b();
                try {
                    view.performHapticFeedback(3, 2);
                    return false;
                } catch (Exception unused) {
                    return false;
                }
            case 4:
                an0 an0Var = (an0) obj;
                cn cnVar3 = an0Var.U;
                if (cnVar3 == null || an0Var.H == 1) {
                    return false;
                }
                TLRPC.User j10 = cnVar3.j();
                if (an0Var.n0 == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(an0Var.getParentActivity(), null);
                    an0Var.n0 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
                    an0Var.n0.setOnTouchListener(new org.telegram.ui.Components.re(an0Var));
                    an0Var.n0.setDispatchKeyEventListener(new tm0(an0Var, i12));
                    an0Var.n0.setShownFromBottom(false);
                    an0Var.o0 = new org.telegram.ui.ActionBar.z0[2];
                    int i24 = 0;
                    while (i24 < 2) {
                        if ((i24 != 0 || cnVar3.S6()) && (i24 != 1 || !org.telegram.messenger.t10.B(j10))) {
                            an0Var.o0[i24] = new org.telegram.ui.ActionBar.z0(an0Var.getParentActivity(), i24 == 0, i24 == 1);
                            if (i24 != 0) {
                                an0Var.o0[i24].j(org.telegram.messenger.id.M0(2131745583, null), R.drawable.input_notify_off, null);
                            } else if (org.telegram.messenger.t10.B(j10)) {
                                an0Var.o0[i24].j(org.telegram.messenger.id.M0(2131745514, null), R.drawable.msg_calendar2, null);
                            } else {
                                an0Var.o0[i24].j(org.telegram.messenger.id.M0(2131745859, null), R.drawable.msg_calendar2, null);
                            }
                            an0Var.o0[i24].setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                            an0Var.n0.a(an0Var.o0[i24], c8.ha.o(-1, 48));
                            an0Var.o0[i24].setOnClickListener(new ai.v(an0Var, i24, 28));
                        }
                        i24++;
                    }
                    an0Var.n0.setupRadialSelectors(org.telegram.ui.ActionBar.m6.x0(null, an0Var.w0, false));
                    org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(an0Var.n0, -2, -2);
                    an0Var.m0 = g1Var2;
                    g1Var2.b = false;
                    g1Var2.setAnimationStyle(R.style.PopupContextAnimation2);
                    an0Var.m0.setOutsideTouchable(true);
                    an0Var.m0.setClippingEnabled(true);
                    an0Var.m0.setInputMethodMode(2);
                    an0Var.m0.setSoftInputMode(0);
                    an0Var.m0.getContentView().setFocusableInTouchMode(true);
                }
                an0Var.n0.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                an0Var.m0.setFocusable(true);
                int[] iArr2 = new int[2];
                view.getLocationInWindow(iArr2);
                an0Var.m0.showAtLocation(view, 51, org.telegram.messenger.g0.L(8.0f) + ((view.getMeasuredWidth() + iArr2[0]) - an0Var.n0.getMeasuredWidth()), (iArr2[1] - an0Var.n0.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f));
                an0Var.m0.b();
                try {
                    view.performHapticFeedback(3, 2);
                    return false;
                } catch (Exception unused2) {
                    return false;
                }
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                xq0 xq0Var2 = photoViewer.d;
                if ((xq0Var2 == null || xq0Var2.U()) && photoViewer.c2 != 11) {
                    org.telegram.ui.ActionBar.f2 f2Var = photoViewer.l4;
                    boolean z11 = (f2Var == null || f2Var.getLastStoryViewer() == null) ? false : true;
                    cn cnVar4 = photoViewer.k4;
                    if ((cnVar4 == null || !cnVar4.c()) && ((photoViewer.k4 != null || z11 || photoViewer.d != null) && !photoViewer.U1.o())) {
                        cn cnVar5 = photoViewer.k4;
                        if (cnVar5 != null) {
                            a22 = cnVar5.j();
                            b10 = photoViewer.k4.S6();
                        } else {
                            xq0 xq0Var3 = photoViewer.d;
                            if (xq0Var3 != null) {
                                long a10 = xq0Var3.a();
                                a22 = a10 != 0 ? org.telegram.messenger.qp.s1(photoViewer.T).a2(Long.valueOf(a10)) : null;
                                b10 = photoViewer.d.b();
                            }
                        }
                        xq0 xq0Var4 = photoViewer.d;
                        boolean z12 = xq0Var4 != null && xq0Var4.p();
                        xq0 xq0Var5 = photoViewer.d;
                        boolean z13 = xq0Var5 != null && xq0Var5.r();
                        boolean B = org.telegram.messenger.t10.B(a22);
                        xq0 xq0Var6 = photoViewer.d;
                        if (xq0Var6 != null && xq0Var6.v() != null) {
                            Iterator it = photoViewer.d.v().entrySet().iterator();
                            while (it.hasNext()) {
                                Object value = ((Map.Entry) it.next()).getValue();
                                if (!(value instanceof org.telegram.messenger.gf)) {
                                    z9 = (value instanceof org.telegram.messenger.kf) && ((org.telegram.messenger.kf) value).x != 0;
                                } else if (((org.telegram.messenger.gf) value).x != 0) {
                                }
                                if (!z12) {
                                    cp0 cp0Var = photoViewer.U1;
                                    if ((!cp0Var.T0 || cp0Var.a1 <= 0) && ((xq0Var = photoViewer.d) == null || xq0Var.I())) {
                                        ?? r122 = photoViewer.f7;
                                        int i25 = photoViewer.O4;
                                        Object obj3 = (i25 < 0 || i25 >= r122.size()) ? null : r122.get(photoViewer.O4);
                                        if (photoViewer.r1) {
                                            pq0 pq0Var = photoViewer.W4;
                                            if (!photoViewer.r) {
                                                if (photoViewer.n8 <= 0.0f) {
                                                    if (photoViewer.o8 >= 1.0f) {
                                                        if (obj3 instanceof org.telegram.messenger.ze) {
                                                            break;
                                                        }
                                                        if (pq0Var != null) {
                                                            org.telegram.messenger.ye yeVar = pq0Var.c;
                                                            if (yeVar != null) {
                                                                break;
                                                            }
                                                            if (pq0Var.d == null) {
                                                                if (pq0Var.a == null) {
                                                                    ArrayList arrayList2 = pq0Var.e;
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
                                        xq0 xq0Var7 = photoViewer.d;
                                        HashMap v = xq0Var7 != null ? xq0Var7.v() : null;
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
                                        xq0 xq0Var8 = photoViewer.d;
                                        boolean z16 = xq0Var8 == null && xq0Var8.H() > 1;
                                        F = org.telegram.ui.Components.k60.F(photoViewer.e0, new di.b(), view);
                                        F.l(R.drawable.msg_sendfile, org.telegram.messenger.id.M0(z16 ? 2131745635 : 2131745636, null), new fn0(photoViewer, i13), z10);
                                        F.l(R.drawable.msg_send, org.telegram.messenger.id.M0(2131745634, null), new fn0(photoViewer, i12), z13);
                                        F.l(R.drawable.msg_replace, org.telegram.messenger.id.M0(2131746269, null), new fn0(photoViewer, 4), z13);
                                        F.l(R.drawable.msg_calendar2, org.telegram.messenger.id.M0(B ? 2131745514 : 2131745859, null), new fn0(photoViewer, 5), z14);
                                        F.l(R.drawable.input_notify_off, org.telegram.messenger.id.M0(2131745583, null), new fn0(photoViewer, 6), z15);
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
                                xq0 xq0Var82 = photoViewer.d;
                                if (xq0Var82 == null) {
                                }
                                F = org.telegram.ui.Components.k60.F(photoViewer.e0, new di.b(), view);
                                F.l(R.drawable.msg_sendfile, org.telegram.messenger.id.M0(z16 ? 2131745635 : 2131745636, null), new fn0(photoViewer, i13), z10);
                                F.l(R.drawable.msg_send, org.telegram.messenger.id.M0(2131745634, null), new fn0(photoViewer, i12), z13);
                                F.l(R.drawable.msg_replace, org.telegram.messenger.id.M0(2131746269, null), new fn0(photoViewer, 4), z13);
                                F.l(R.drawable.msg_calendar2, org.telegram.messenger.id.M0(B ? 2131745514 : 2131745859, null), new fn0(photoViewer, 5), z14);
                                F.l(R.drawable.input_notify_off, org.telegram.messenger.id.M0(2131745583, null), new fn0(photoViewer, 6), z15);
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
                        xq0 xq0Var822 = photoViewer.d;
                        if (xq0Var822 == null) {
                        }
                        F = org.telegram.ui.Components.k60.F(photoViewer.e0, new di.b(), view);
                        F.l(R.drawable.msg_sendfile, org.telegram.messenger.id.M0(z16 ? 2131745635 : 2131745636, null), new fn0(photoViewer, i13), z10);
                        F.l(R.drawable.msg_send, org.telegram.messenger.id.M0(2131745634, null), new fn0(photoViewer, i12), z13);
                        F.l(R.drawable.msg_replace, org.telegram.messenger.id.M0(2131746269, null), new fn0(photoViewer, 4), z13);
                        F.l(R.drawable.msg_calendar2, org.telegram.messenger.id.M0(B ? 2131745514 : 2131745859, null), new fn0(photoViewer, 5), z14);
                        F.l(R.drawable.input_notify_off, org.telegram.messenger.id.M0(2131745583, null), new fn0(photoViewer, 6), z15);
                        if (F.x() != 0) {
                        }
                    }
                }
                return false;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (profileActivity.I2 == null && !profileActivity.p1) {
                    profileActivity.N4(false);
                }
                return false;
            default:
                t11 t11Var = (t11) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, t11Var.getContext(), null);
                String M0 = org.telegram.messenger.id.M0(2131752070, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.id.M0(2131752071, null);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131752101, null), new yz0(t11Var));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                u1Var.P0 = false;
                alertDialog$Builder.j(new q5(t11Var, 14));
                alertDialog$Builder.p();
                t11Var.w(1.0f);
                try {
                    t11Var.performHapticFeedback(0, 1);
                } catch (Exception unused3) {
                }
                return true;
        }
    }
}
