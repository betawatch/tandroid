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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01aa, code lost:
    
        if (r6.b() != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01bc, code lost:
    
        if (r6.isEmpty() != false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x019c, code lost:
    
        if (((org.telegram.messenger.xe) r12).g == null) goto L112;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01fa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0150  */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r13v32, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v33, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v38, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, org.telegram.ui.Components.x60] */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v70 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r9v65 */
    /* JADX WARN: Type inference failed for: r9v66 */
    /* JADX WARN: Type inference failed for: r9v72 */
    @Override // android.view.View.OnLongClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onLongClick(View view) {
        WebBackForwardList webBackForwardList;
        float f10;
        TLRPC.User c22;
        boolean b10;
        ?? r92;
        boolean z10;
        org.telegram.ui.Components.x60 G;
        uq0 uq0Var;
        int i7 = this.a;
        int i10 = 29;
        int i11 = 3;
        Object obj = this.b;
        ?? r52 = 0;
        ?? r53 = 0;
        ?? r54 = 0;
        int i12 = 1;
        switch (i7) {
            case 0:
                final g4 g4Var = (g4) obj;
                ArrayList arrayList = g4Var.e0;
                if (g4Var.v0[0] != null) {
                    float f11 = g4Var.i0.N.d;
                    t3 t3Var = g4Var.L;
                    ?? G2 = org.telegram.ui.Components.x60.G(t3Var != null ? t3Var.c : g4Var.g0, null, view);
                    int x02 = org.telegram.messenger.bz.v0 ? org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Gl, false) : g4Var.v0[0].getBackgroundColor();
                    int x03 = org.telegram.messenger.bz.v0 ? org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false) : org.telegram.messenger.g0.B(g4Var.v0[0].getBackgroundColor()) >= 0.721f ? -16777216 : -1;
                    int r12 = org.telegram.ui.ActionBar.n6.r1(0.65f, x03);
                    org.telegram.ui.web.s0 webView = g4Var.v0[0].getWebView();
                    if (webView != null) {
                        WebBackForwardList copyBackForwardList = webView.copyBackForwardList();
                        int currentIndex = copyBackForwardList.getCurrentIndex();
                        if (copyBackForwardList.getCurrentIndex() > 0) {
                            int i13 = 0;
                            while (i13 < currentIndex) {
                                WebHistoryItem itemAtIndex = copyBackForwardList.getItemAtIndex(i13);
                                G2.c(r52, itemAtIndex.getTitle(), new jg.q(currentIndex, i13, webView, 9), r52);
                                org.telegram.ui.ActionBar.y0 z11 = G2.z();
                                if (z11 != null) {
                                    z11.setSubtext(itemAtIndex.getUrl());
                                    Bitmap bitmap = (Bitmap) webView.Q.get(itemAtIndex.getUrl());
                                    if (bitmap == null) {
                                        bitmap = itemAtIndex.getFavicon();
                                    }
                                    webBackForwardList = copyBackForwardList;
                                    z11.j(itemAtIndex.getTitle(), 0, new ci.a1(bitmap, new Paint(3), 1));
                                    z11.setTextColor(x03);
                                    z11.setSubtextColor(r12);
                                } else {
                                    webBackForwardList = copyBackForwardList;
                                }
                                i13++;
                                copyBackForwardList = webBackForwardList;
                                r52 = 0;
                            }
                        }
                    }
                    for (final int size = arrayList.size() - 2; size >= 0; size--) {
                        Object obj2 = arrayList.get(size);
                        if (obj2 instanceof x2) {
                            x2 x2Var = (x2) obj2;
                            final int i14 = 0;
                            G2.c(0, x2Var.b(), new Runnable() { // from class: org.telegram.ui.v
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i14) {
                                        case 0:
                                            g4Var.F(size);
                                            break;
                                        default:
                                            g4Var.F(size);
                                            break;
                                    }
                                }
                            }, false);
                            org.telegram.ui.ActionBar.y0 z12 = G2.z();
                            if (z12 != null) {
                                z12.setSubtext(x2Var.x);
                                Bitmap bitmap2 = webView != null ? (Bitmap) webView.Q.get(x2Var.x) : null;
                                if (bitmap2 == null) {
                                    bitmap2 = x2Var.F;
                                }
                                z12.j(x2Var.b(), 0, new ci.a1(bitmap2, new Paint(3), 2));
                                z12.setTextColor(x03);
                                z12.setSubtextColor(r12);
                                z12.d(x03, x03);
                            }
                        } else if (obj2 instanceof TLRPC.WebPage) {
                            TLRPC.WebPage webPage = (TLRPC.WebPage) obj2;
                            final int i15 = 1;
                            G2.c(0, webPage.title, new Runnable() { // from class: org.telegram.ui.v
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i15) {
                                        case 0:
                                            g4Var.F(size);
                                            break;
                                        default:
                                            g4Var.F(size);
                                            break;
                                    }
                                }
                            }, false);
                            org.telegram.ui.ActionBar.y0 z13 = G2.z();
                            if (z13 != null) {
                                org.telegram.ui.Components.qh0 qh0Var = z13.c;
                                z13.j(webPage.title, R.drawable.msg_instant, null);
                                z13.setTextColor(x03);
                                if (!TextUtils.isEmpty(webPage.site_name)) {
                                    z13.setSubtext(webPage.site_name);
                                }
                                z13.setSubtextColor(r12);
                                qh0Var.getLayoutParams().width = org.telegram.messenger.g0.L(24.0f);
                                qh0Var.setScaleX(1.45f);
                                qh0Var.setScaleY(1.45f);
                                z13.d(x03, x03);
                            }
                        }
                    }
                    G2.X(org.telegram.ui.ActionBar.n6.L(org.telegram.messenger.g0.L(40.0f), g4Var.i0.getBackgroundColor()));
                    G2.Q(x02);
                    if (G2.y() > 0) {
                        g4Var.k(new org.telegram.messenger.ee(g4Var, G2, f11, 1));
                        return true;
                    }
                }
                return false;
            case 1:
                g8 g8Var = (g8) obj;
                j8 j8Var = g8Var.y;
                if (g8Var.n != null) {
                    int i16 = -1;
                    int i17 = -1;
                    for (int i18 = 0; i18 < g8Var.d; i18++) {
                        h8 h8Var = (h8) g8Var.n.get(i18, null);
                        if (h8Var != null) {
                            if (i17 == -1) {
                                i17 = h8Var.h;
                            }
                            i16 = h8Var.h;
                        }
                    }
                    if (i17 >= 0 && i16 >= 0) {
                        j8Var.H = true;
                        j8Var.Q = i17;
                        j8Var.R = i16;
                        j8Var.B0();
                        j8Var.u0();
                    }
                }
                return false;
            case 2:
                ok okVar = (ok) obj;
                bn bnVar = okVar.c;
                if (org.telegram.messenger.g0.Q1()) {
                    return false;
                }
                if (bnVar.fa() && !org.telegram.messenger.n10.u(bnVar.f)) {
                    return false;
                }
                okVar.b = okVar.a;
                bnVar.La(true);
                return true;
            case 3:
                om0 om0Var = (om0) obj;
                bn bnVar2 = om0Var.G;
                if (bnVar2 != null && om0Var.H != 1) {
                    TLRPC.User j3 = bnVar2.j();
                    if (om0Var.K == null) {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(om0Var.getParentActivity(), null);
                        om0Var.K = actionBarPopupWindow$ActionBarPopupWindowLayout;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
                        om0Var.K.setOnTouchListener(new org.telegram.ui.Components.cf(om0Var));
                        om0Var.K.setDispatchKeyEventListener(new km0(om0Var, i12));
                        om0Var.K.setShownFromBottom(false);
                        om0Var.L = new org.telegram.ui.ActionBar.y0[2];
                        int i19 = 0;
                        for (int i20 = 2; i19 < i20; i20 = 2) {
                            if ((i19 != 0 || bnVar2.S6()) && (i19 != 1 || !org.telegram.messenger.n10.C(j3))) {
                                om0Var.L[i19] = new org.telegram.ui.ActionBar.y0(om0Var.getParentActivity(), i19 == 0, i19 == 1);
                                if (i19 != 0) {
                                    om0Var.L[i19].j(org.telegram.messenger.gd.N0(2131745387, null), R.drawable.input_notify_off, null);
                                } else if (org.telegram.messenger.n10.C(j3)) {
                                    om0Var.L[i19].j(org.telegram.messenger.gd.N0(2131745318, null), R.drawable.msg_calendar2, null);
                                } else {
                                    om0Var.L[i19].j(org.telegram.messenger.gd.N0(2131745663, null), R.drawable.msg_calendar2, null);
                                }
                                om0Var.L[i19].setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                                om0Var.K.a(om0Var.L[i19], c8.na.o(-1, 48));
                                om0Var.L[i19].setOnClickListener(new ci.q(om0Var, i19, i10));
                            }
                            i19++;
                        }
                        om0Var.K.setupRadialSelectors(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.I5, false));
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(om0Var.K, -2, -2);
                        om0Var.J = g1Var;
                        g1Var.b = false;
                        g1Var.setAnimationStyle(R.style.PopupContextAnimation2);
                        om0Var.J.setOutsideTouchable(true);
                        om0Var.J.setClippingEnabled(true);
                        om0Var.J.setInputMethodMode(2);
                        om0Var.J.setSoftInputMode(0);
                        om0Var.J.getContentView().setFocusableInTouchMode(true);
                    }
                    om0Var.K.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                    om0Var.J.setFocusable(true);
                    int[] iArr = new int[2];
                    view.getLocationInWindow(iArr);
                    om0Var.J.showAtLocation(view, 51, org.telegram.messenger.g0.L(8.0f) + ((view.getMeasuredWidth() + iArr[0]) - om0Var.K.getMeasuredWidth()), (iArr[1] - om0Var.K.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f));
                    om0Var.J.b();
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                return false;
            case 4:
                an0 an0Var = (an0) obj;
                bn bnVar3 = an0Var.V;
                if (bnVar3 != null && an0Var.I != 1) {
                    TLRPC.User j10 = bnVar3.j();
                    if (an0Var.o0 == null) {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(an0Var.getParentActivity(), null);
                        an0Var.o0 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                        actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
                        an0Var.o0.setOnTouchListener(new org.telegram.ui.Components.cf(an0Var));
                        an0Var.o0.setDispatchKeyEventListener(new sm0(an0Var, i11));
                        an0Var.o0.setShownFromBottom(false);
                        an0Var.p0 = new org.telegram.ui.ActionBar.y0[2];
                        int i21 = 0;
                        for (int i22 = 2; i21 < i22; i22 = 2) {
                            if ((i21 != 0 || bnVar3.S6()) && (i21 != 1 || !org.telegram.messenger.n10.C(j10))) {
                                an0Var.p0[i21] = new org.telegram.ui.ActionBar.y0(an0Var.getParentActivity(), i21 == 0, i21 == 1);
                                if (i21 != 0) {
                                    an0Var.p0[i21].j(org.telegram.messenger.gd.N0(2131745387, null), R.drawable.input_notify_off, null);
                                } else if (org.telegram.messenger.n10.C(j10)) {
                                    an0Var.p0[i21].j(org.telegram.messenger.gd.N0(2131745318, null), R.drawable.msg_calendar2, null);
                                } else {
                                    an0Var.p0[i21].j(org.telegram.messenger.gd.N0(2131745663, null), R.drawable.msg_calendar2, null);
                                }
                                an0Var.p0[i21].setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                                an0Var.o0.a(an0Var.p0[i21], c8.na.o(-1, 48));
                                an0Var.p0[i21].setOnClickListener(new tm0(an0Var, i21, r53 == true ? 1 : 0));
                            }
                            i21++;
                        }
                        an0Var.o0.setupRadialSelectors(org.telegram.ui.ActionBar.n6.x0(null, an0Var.x0, false));
                        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(an0Var.o0, -2, -2);
                        an0Var.n0 = g1Var2;
                        g1Var2.b = false;
                        g1Var2.setAnimationStyle(R.style.PopupContextAnimation2);
                        an0Var.n0.setOutsideTouchable(true);
                        an0Var.n0.setClippingEnabled(true);
                        an0Var.n0.setInputMethodMode(2);
                        an0Var.n0.setSoftInputMode(0);
                        an0Var.n0.getContentView().setFocusableInTouchMode(true);
                    }
                    an0Var.o0.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                    an0Var.n0.setFocusable(true);
                    int[] iArr2 = new int[2];
                    view.getLocationInWindow(iArr2);
                    an0Var.n0.showAtLocation(view, 51, org.telegram.messenger.g0.L(8.0f) + ((view.getMeasuredWidth() + iArr2[0]) - an0Var.o0.getMeasuredWidth()), (iArr2[1] - an0Var.o0.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f));
                    an0Var.n0.b();
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused2) {
                    }
                }
                return false;
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                uq0 uq0Var2 = photoViewer.d;
                if ((uq0Var2 != null && !uq0Var2.U()) || photoViewer.d2 == 11) {
                    return false;
                }
                org.telegram.ui.ActionBar.g2 g2Var = photoViewer.m4;
                ?? r22 = (g2Var == null || g2Var.getLastStoryViewer() == null) ? false : true;
                bn bnVar4 = photoViewer.l4;
                if (bnVar4 != null && bnVar4.c()) {
                    return false;
                }
                if ((photoViewer.l4 == null && r22 != true && photoViewer.d == null) || photoViewer.V1.o()) {
                    return false;
                }
                bn bnVar5 = photoViewer.l4;
                if (bnVar5 != null) {
                    c22 = bnVar5.j();
                    b10 = photoViewer.l4.S6();
                    f10 = 1.0f;
                } else {
                    uq0 uq0Var3 = photoViewer.d;
                    if (uq0Var3 == null) {
                        return false;
                    }
                    long a10 = uq0Var3.a();
                    f10 = 1.0f;
                    c22 = a10 != 0 ? org.telegram.messenger.mp.u1(photoViewer.U).c2(Long.valueOf(a10)) : null;
                    b10 = photoViewer.d.b();
                }
                uq0 uq0Var4 = photoViewer.d;
                ?? r11 = uq0Var4 != null && uq0Var4.p();
                uq0 uq0Var5 = photoViewer.d;
                boolean z14 = uq0Var5 != null && uq0Var5.r();
                boolean C = org.telegram.messenger.n10.C(c22);
                uq0 uq0Var6 = photoViewer.d;
                if (uq0Var6 != null && uq0Var6.v() != null) {
                    Iterator it = photoViewer.d.v().entrySet().iterator();
                    while (it.hasNext()) {
                        Object value = ((Map.Entry) it.next()).getValue();
                        if (value instanceof org.telegram.messenger.ef) {
                            if (((org.telegram.messenger.ef) value).x != 0) {
                                r92 = true;
                            }
                        } else if ((value instanceof org.telegram.messenger.hf) && ((org.telegram.messenger.hf) value).x != 0) {
                            r92 = true;
                        }
                        if (r11 == false) {
                            zo0 zo0Var = photoViewer.V1;
                            if ((!zo0Var.U0 || zo0Var.b1 <= 0) && ((uq0Var = photoViewer.d) == null || uq0Var.I())) {
                                ?? r13 = photoViewer.g7;
                                int i23 = photoViewer.P4;
                                Object obj3 = (i23 < 0 || i23 >= r13.size()) ? null : r13.get(photoViewer.P4);
                                if (photoViewer.s1) {
                                    nq0 nq0Var = photoViewer.X4;
                                    if (!photoViewer.r) {
                                        if (photoViewer.u8 <= 0.0f) {
                                            if (photoViewer.v8 >= f10) {
                                                if (obj3 instanceof org.telegram.messenger.xe) {
                                                    break;
                                                }
                                                if (nq0Var != null) {
                                                    org.telegram.messenger.we weVar = nq0Var.c;
                                                    if (weVar != null) {
                                                        break;
                                                    }
                                                    if (nq0Var.d == null) {
                                                        if (nq0Var.a == null) {
                                                            ArrayList arrayList2 = nq0Var.e;
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
                                    r13 = v.values();
                                }
                                for (Object obj4 : r13) {
                                    if (obj4 == obj3 || !(obj4 instanceof org.telegram.messenger.xe) || !((org.telegram.messenger.xe) obj4).b()) {
                                    }
                                }
                                z10 = true;
                                boolean z15 = r11 == true && b10 && !r92 == true;
                                boolean z16 = (r11 == true || !z14) && !C;
                                uq0 uq0Var8 = photoViewer.d;
                                ?? r112 = uq0Var8 == null && uq0Var8.H() > 1;
                                G = org.telegram.ui.Components.x60.G(photoViewer.f0, new fi.b(), view);
                                G.l(R.drawable.msg_sendfile, org.telegram.messenger.gd.N0(r112 != false ? 2131745439 : 2131745440, null), new kn0(photoViewer, 28), z10);
                                G.l(R.drawable.msg_send, org.telegram.messenger.gd.N0(2131745438, null), new kn0(photoViewer, i10), z14);
                                G.l(R.drawable.msg_replace, org.telegram.messenger.gd.N0(2131746073, null), new zn0(photoViewer, r54 == true ? 1 : 0), z14);
                                G.l(R.drawable.msg_calendar2, org.telegram.messenger.gd.N0(C ? 2131745318 : 2131745663, null), new zn0(photoViewer, i12), z15);
                                G.l(R.drawable.input_notify_off, org.telegram.messenger.gd.N0(2131745387, null), new zn0(photoViewer, 2), z16);
                                if (G.y() == 0) {
                                    return false;
                                }
                                G.W(5);
                                G.a0();
                                return true;
                            }
                        }
                        z10 = false;
                        if (r11 == true) {
                        }
                        if (r11 == true) {
                        }
                        uq0 uq0Var82 = photoViewer.d;
                        if (uq0Var82 == null) {
                        }
                        G = org.telegram.ui.Components.x60.G(photoViewer.f0, new fi.b(), view);
                        G.l(R.drawable.msg_sendfile, org.telegram.messenger.gd.N0(r112 != false ? 2131745439 : 2131745440, null), new kn0(photoViewer, 28), z10);
                        G.l(R.drawable.msg_send, org.telegram.messenger.gd.N0(2131745438, null), new kn0(photoViewer, i10), z14);
                        G.l(R.drawable.msg_replace, org.telegram.messenger.gd.N0(2131746073, null), new zn0(photoViewer, r54 == true ? 1 : 0), z14);
                        G.l(R.drawable.msg_calendar2, org.telegram.messenger.gd.N0(C ? 2131745318 : 2131745663, null), new zn0(photoViewer, i12), z15);
                        G.l(R.drawable.input_notify_off, org.telegram.messenger.gd.N0(2131745387, null), new zn0(photoViewer, 2), z16);
                        if (G.y() == 0) {
                        }
                    }
                }
                r92 = false;
                if (r11 == false) {
                }
                z10 = false;
                if (r11 == true) {
                }
                if (r11 == true) {
                }
                uq0 uq0Var822 = photoViewer.d;
                if (uq0Var822 == null) {
                }
                G = org.telegram.ui.Components.x60.G(photoViewer.f0, new fi.b(), view);
                G.l(R.drawable.msg_sendfile, org.telegram.messenger.gd.N0(r112 != false ? 2131745439 : 2131745440, null), new kn0(photoViewer, 28), z10);
                G.l(R.drawable.msg_send, org.telegram.messenger.gd.N0(2131745438, null), new kn0(photoViewer, i10), z14);
                G.l(R.drawable.msg_replace, org.telegram.messenger.gd.N0(2131746073, null), new zn0(photoViewer, r54 == true ? 1 : 0), z14);
                G.l(R.drawable.msg_calendar2, org.telegram.messenger.gd.N0(C ? 2131745318 : 2131745663, null), new zn0(photoViewer, i12), z15);
                G.l(R.drawable.input_notify_off, org.telegram.messenger.gd.N0(2131745387, null), new zn0(photoViewer, 2), z16);
                if (G.y() == 0) {
                }
                break;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (profileActivity.K2 == null && !profileActivity.q1) {
                    profileActivity.N4(false);
                }
                return false;
            default:
                q11 q11Var = (q11) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, q11Var.getContext(), null);
                String N0 = org.telegram.messenger.gd.N0(2131752058, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = N0;
                t1Var.U = org.telegram.messenger.gd.N0(2131752059, null);
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131752089, null), new vz0(q11Var));
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                t1Var.Q0 = false;
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
