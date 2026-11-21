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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
    
        if (((org.telegram.messenger.xe) r11).g == null) goto L114;
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
        TLRPC.User c22;
        boolean b10;
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.a70 G;
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
                ArrayList arrayList = g4Var.e0;
                if (g4Var.v0[0] != null) {
                    float f10 = g4Var.i0.N.d;
                    t3 t3Var = g4Var.L;
                    org.telegram.ui.Components.a70 G2 = org.telegram.ui.Components.a70.G(t3Var != null ? t3Var.c : g4Var.g0, null, view);
                    if (org.telegram.messenger.bz.v0) {
                        r11 = 0;
                        backgroundColor = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Gl, false);
                    } else {
                        r11 = 0;
                        backgroundColor = g4Var.v0[0].getBackgroundColor();
                    }
                    if (org.telegram.messenger.bz.v0) {
                        i11 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.G6, r11);
                    } else if (org.telegram.messenger.g0.B(g4Var.v0[r11].getBackgroundColor()) >= 0.721f) {
                        i11 = -16777216;
                    }
                    int r12 = org.telegram.ui.ActionBar.m6.r1(0.65f, i11);
                    org.telegram.ui.web.s0 webView = g4Var.v0[0].getWebView();
                    if (webView != null) {
                        WebBackForwardList copyBackForwardList = webView.copyBackForwardList();
                        int currentIndex = copyBackForwardList.getCurrentIndex();
                        if (copyBackForwardList.getCurrentIndex() > 0) {
                            int i15 = 0;
                            while (i15 < currentIndex) {
                                WebHistoryItem itemAtIndex = copyBackForwardList.getItemAtIndex(i15);
                                int i16 = i13;
                                G2.c(0, itemAtIndex.getTitle(), new jg.q(currentIndex, i15, webView, 9), false);
                                org.telegram.ui.ActionBar.y0 z12 = G2.z();
                                if (z12 != null) {
                                    z12.setSubtext(itemAtIndex.getUrl());
                                    Bitmap bitmap = (Bitmap) webView.Q.get(itemAtIndex.getUrl());
                                    if (bitmap == null) {
                                        bitmap = itemAtIndex.getFavicon();
                                    }
                                    webBackForwardList = copyBackForwardList;
                                    z12.j(itemAtIndex.getTitle(), 0, new ci.a1(bitmap, new Paint(i12), 1));
                                    z12.setTextColor(i11);
                                    z12.setSubtextColor(r12);
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
                            G2.c(0, x2Var.b(), new Runnable() { // from class: org.telegram.ui.v
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
                            org.telegram.ui.ActionBar.y0 z13 = G2.z();
                            if (z13 != null) {
                                z13.setSubtext(x2Var.x);
                                Bitmap bitmap2 = webView != null ? (Bitmap) webView.Q.get(x2Var.x) : null;
                                if (bitmap2 == null) {
                                    bitmap2 = x2Var.F;
                                }
                                i7 = i17;
                                z13.j(x2Var.b(), 0, new ci.a1(bitmap2, new Paint(3), i7));
                                z13.setTextColor(i11);
                                z13.setSubtextColor(r12);
                                z13.d(i11, i11);
                            } else {
                                i7 = i17;
                            }
                        } else {
                            i7 = i17;
                            if (obj2 instanceof TLRPC.WebPage) {
                                TLRPC.WebPage webPage = (TLRPC.WebPage) obj2;
                                final int i19 = 1;
                                G2.c(0, webPage.title, new Runnable() { // from class: org.telegram.ui.v
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
                                org.telegram.ui.ActionBar.y0 z14 = G2.z();
                                if (z14 != null) {
                                    org.telegram.ui.Components.rh0 rh0Var = z14.c;
                                    z14.j(webPage.title, R.drawable.msg_instant, null);
                                    z14.setTextColor(i11);
                                    if (!TextUtils.isEmpty(webPage.site_name)) {
                                        z14.setSubtext(webPage.site_name);
                                    }
                                    z14.setSubtextColor(r12);
                                    rh0Var.getLayoutParams().width = org.telegram.messenger.g0.L(24.0f);
                                    rh0Var.setScaleX(1.45f);
                                    rh0Var.setScaleY(1.45f);
                                    z14.d(i11, i11);
                                    size--;
                                    i17 = i7;
                                }
                            }
                        }
                        size--;
                        i17 = i7;
                    }
                    G2.X(org.telegram.ui.ActionBar.m6.L(org.telegram.messenger.g0.L(40.0f), g4Var.i0.getBackgroundColor()));
                    G2.Q(backgroundColor);
                    if (G2.y() > 0) {
                        g4Var.k(new org.telegram.messenger.ee(g4Var, G2, f10, 1));
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
                ok okVar = (ok) obj;
                bn bnVar = okVar.c;
                if (org.telegram.messenger.g0.Q1() || (bnVar.fa() && !org.telegram.messenger.o10.u(bnVar.f))) {
                    return false;
                }
                okVar.b = okVar.a;
                bnVar.La(true);
                return true;
            case 3:
                qm0 qm0Var = (qm0) obj;
                bn bnVar2 = qm0Var.G;
                if (bnVar2 == null || qm0Var.H == 1) {
                    return false;
                }
                TLRPC.User j3 = bnVar2.j();
                if (qm0Var.K == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(qm0Var.getParentActivity(), null);
                    qm0Var.K = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
                    qm0Var.K.setOnTouchListener(new org.telegram.ui.Components.bf(qm0Var));
                    qm0Var.K.setDispatchKeyEventListener(new mm0(qm0Var, i14));
                    qm0Var.K.setShownFromBottom(false);
                    qm0Var.L = new org.telegram.ui.ActionBar.y0[2];
                    int i23 = 0;
                    while (i23 < 2) {
                        if ((i23 != 0 || bnVar2.S6()) && (i23 != 1 || !org.telegram.messenger.o10.C(j3))) {
                            qm0Var.L[i23] = new org.telegram.ui.ActionBar.y0(qm0Var.getParentActivity(), i23 == 0, i23 == 1);
                            if (i23 != 0) {
                                qm0Var.L[i23].j(org.telegram.messenger.gd.N0(2131745387, null), R.drawable.input_notify_off, null);
                            } else if (org.telegram.messenger.o10.C(j3)) {
                                qm0Var.L[i23].j(org.telegram.messenger.gd.N0(2131745318, null), R.drawable.msg_calendar2, null);
                            } else {
                                qm0Var.L[i23].j(org.telegram.messenger.gd.N0(2131745663, null), R.drawable.msg_calendar2, null);
                            }
                            qm0Var.L[i23].setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                            qm0Var.K.a(qm0Var.L[i23], c8.ma.o(-1, 48));
                            qm0Var.L[i23].setOnClickListener(new ci.q(qm0Var, i23, 29));
                        }
                        i23++;
                    }
                    qm0Var.K.setupRadialSelectors(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.I5, false));
                    org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(qm0Var.K, -2, -2);
                    qm0Var.J = g1Var;
                    g1Var.b = false;
                    g1Var.setAnimationStyle(R.style.PopupContextAnimation2);
                    qm0Var.J.setOutsideTouchable(true);
                    qm0Var.J.setClippingEnabled(true);
                    qm0Var.J.setInputMethodMode(2);
                    qm0Var.J.setSoftInputMode(0);
                    qm0Var.J.getContentView().setFocusableInTouchMode(true);
                }
                qm0Var.K.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                qm0Var.J.setFocusable(true);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                qm0Var.J.showAtLocation(view, 51, org.telegram.messenger.g0.L(8.0f) + ((view.getMeasuredWidth() + iArr[0]) - qm0Var.K.getMeasuredWidth()), (iArr[1] - qm0Var.K.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f));
                qm0Var.J.b();
                try {
                    view.performHapticFeedback(3, 2);
                    return false;
                } catch (Exception unused) {
                    return false;
                }
            case 4:
                cn0 cn0Var = (cn0) obj;
                bn bnVar3 = cn0Var.V;
                if (bnVar3 == null || cn0Var.I == 1) {
                    return false;
                }
                TLRPC.User j10 = bnVar3.j();
                if (cn0Var.o0 == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(cn0Var.getParentActivity(), null);
                    cn0Var.o0 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
                    cn0Var.o0.setOnTouchListener(new org.telegram.ui.Components.bf(cn0Var));
                    cn0Var.o0.setDispatchKeyEventListener(new um0(cn0Var, i12));
                    cn0Var.o0.setShownFromBottom(false);
                    cn0Var.p0 = new org.telegram.ui.ActionBar.y0[2];
                    int i24 = 0;
                    while (i24 < 2) {
                        if ((i24 != 0 || bnVar3.S6()) && (i24 != 1 || !org.telegram.messenger.o10.C(j10))) {
                            cn0Var.p0[i24] = new org.telegram.ui.ActionBar.y0(cn0Var.getParentActivity(), i24 == 0, i24 == 1);
                            if (i24 != 0) {
                                cn0Var.p0[i24].j(org.telegram.messenger.gd.N0(2131745387, null), R.drawable.input_notify_off, null);
                            } else if (org.telegram.messenger.o10.C(j10)) {
                                cn0Var.p0[i24].j(org.telegram.messenger.gd.N0(2131745318, null), R.drawable.msg_calendar2, null);
                            } else {
                                cn0Var.p0[i24].j(org.telegram.messenger.gd.N0(2131745663, null), R.drawable.msg_calendar2, null);
                            }
                            cn0Var.p0[i24].setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                            cn0Var.o0.a(cn0Var.p0[i24], c8.ma.o(-1, 48));
                            cn0Var.p0[i24].setOnClickListener(new vm0(cn0Var, i24, 0));
                        }
                        i24++;
                    }
                    cn0Var.o0.setupRadialSelectors(org.telegram.ui.ActionBar.m6.x0(null, cn0Var.x0, false));
                    org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(cn0Var.o0, -2, -2);
                    cn0Var.n0 = g1Var2;
                    g1Var2.b = false;
                    g1Var2.setAnimationStyle(R.style.PopupContextAnimation2);
                    cn0Var.n0.setOutsideTouchable(true);
                    cn0Var.n0.setClippingEnabled(true);
                    cn0Var.n0.setInputMethodMode(2);
                    cn0Var.n0.setSoftInputMode(0);
                    cn0Var.n0.getContentView().setFocusableInTouchMode(true);
                }
                cn0Var.o0.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                cn0Var.n0.setFocusable(true);
                int[] iArr2 = new int[2];
                view.getLocationInWindow(iArr2);
                cn0Var.n0.showAtLocation(view, 51, org.telegram.messenger.g0.L(8.0f) + ((view.getMeasuredWidth() + iArr2[0]) - cn0Var.o0.getMeasuredWidth()), (iArr2[1] - cn0Var.o0.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f));
                cn0Var.n0.b();
                try {
                    view.performHapticFeedback(3, 2);
                    return false;
                } catch (Exception unused2) {
                    return false;
                }
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                uq0 uq0Var2 = photoViewer.d;
                if ((uq0Var2 == null || uq0Var2.U()) && photoViewer.d2 != 11) {
                    org.telegram.ui.ActionBar.g2 g2Var = photoViewer.m4;
                    boolean z15 = (g2Var == null || g2Var.getLastStoryViewer() == null) ? false : true;
                    bn bnVar4 = photoViewer.l4;
                    if ((bnVar4 == null || !bnVar4.c()) && ((photoViewer.l4 != null || z15 || photoViewer.d != null) && !photoViewer.V1.o())) {
                        bn bnVar5 = photoViewer.l4;
                        if (bnVar5 != null) {
                            c22 = bnVar5.j();
                            b10 = photoViewer.l4.S6();
                        } else {
                            uq0 uq0Var3 = photoViewer.d;
                            if (uq0Var3 != null) {
                                long a10 = uq0Var3.a();
                                c22 = a10 != 0 ? org.telegram.messenger.mp.u1(photoViewer.U).c2(Long.valueOf(a10)) : null;
                                b10 = photoViewer.d.b();
                            }
                        }
                        uq0 uq0Var4 = photoViewer.d;
                        boolean z16 = uq0Var4 != null && uq0Var4.p();
                        uq0 uq0Var5 = photoViewer.d;
                        boolean z17 = uq0Var5 != null && uq0Var5.r();
                        boolean C = org.telegram.messenger.o10.C(c22);
                        uq0 uq0Var6 = photoViewer.d;
                        if (uq0Var6 != null && uq0Var6.v() != null) {
                            Iterator it = photoViewer.d.v().entrySet().iterator();
                            while (it.hasNext()) {
                                Object value = ((Map.Entry) it.next()).getValue();
                                if (!(value instanceof org.telegram.messenger.ef)) {
                                    z10 = (value instanceof org.telegram.messenger.hf) && ((org.telegram.messenger.hf) value).x != 0;
                                } else if (((org.telegram.messenger.ef) value).x != 0) {
                                }
                                if (!z16) {
                                    ap0 ap0Var = photoViewer.V1;
                                    if ((!ap0Var.U0 || ap0Var.b1 <= 0) && ((uq0Var = photoViewer.d) == null || uq0Var.I())) {
                                        ?? r122 = photoViewer.g7;
                                        int i25 = photoViewer.P4;
                                        Object obj3 = (i25 < 0 || i25 >= r122.size()) ? null : r122.get(photoViewer.P4);
                                        if (photoViewer.s1) {
                                            nq0 nq0Var = photoViewer.X4;
                                            if (!photoViewer.r) {
                                                if (photoViewer.o8 <= 0.0f) {
                                                    if (photoViewer.p8 >= 1.0f) {
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
                                            r122 = v.values();
                                        }
                                        for (Object obj4 : r122) {
                                            if (obj4 == obj3 || !(obj4 instanceof org.telegram.messenger.xe) || !((org.telegram.messenger.xe) obj4).b()) {
                                            }
                                        }
                                        z11 = true;
                                        boolean z18 = z16 && b10 && !z10;
                                        boolean z19 = (z16 || !z17) && !C;
                                        uq0 uq0Var8 = photoViewer.d;
                                        boolean z20 = uq0Var8 == null && uq0Var8.H() > 1;
                                        G = org.telegram.ui.Components.a70.G(photoViewer.f0, new fi.b(), view);
                                        G.l(R.drawable.msg_sendfile, org.telegram.messenger.gd.N0(z20 ? 2131745439 : 2131745440, null), new hn0(photoViewer, i13), z11);
                                        G.l(R.drawable.msg_send, org.telegram.messenger.gd.N0(2131745438, null), new hn0(photoViewer, i12), z17);
                                        G.l(R.drawable.msg_replace, org.telegram.messenger.gd.N0(2131746073, null), new hn0(photoViewer, 4), z17);
                                        G.l(R.drawable.msg_calendar2, org.telegram.messenger.gd.N0(C ? 2131745318 : 2131745663, null), new hn0(photoViewer, 5), z18);
                                        G.l(R.drawable.input_notify_off, org.telegram.messenger.gd.N0(2131745387, null), new hn0(photoViewer, 6), z19);
                                        if (G.y() != 0) {
                                            G.W(5);
                                            G.a0();
                                            return true;
                                        }
                                    }
                                }
                                z11 = false;
                                if (z16) {
                                }
                                if (z16) {
                                }
                                uq0 uq0Var82 = photoViewer.d;
                                if (uq0Var82 == null) {
                                }
                                G = org.telegram.ui.Components.a70.G(photoViewer.f0, new fi.b(), view);
                                G.l(R.drawable.msg_sendfile, org.telegram.messenger.gd.N0(z20 ? 2131745439 : 2131745440, null), new hn0(photoViewer, i13), z11);
                                G.l(R.drawable.msg_send, org.telegram.messenger.gd.N0(2131745438, null), new hn0(photoViewer, i12), z17);
                                G.l(R.drawable.msg_replace, org.telegram.messenger.gd.N0(2131746073, null), new hn0(photoViewer, 4), z17);
                                G.l(R.drawable.msg_calendar2, org.telegram.messenger.gd.N0(C ? 2131745318 : 2131745663, null), new hn0(photoViewer, 5), z18);
                                G.l(R.drawable.input_notify_off, org.telegram.messenger.gd.N0(2131745387, null), new hn0(photoViewer, 6), z19);
                                if (G.y() != 0) {
                                }
                            }
                        }
                        if (!z16) {
                        }
                        z11 = false;
                        if (z16) {
                        }
                        if (z16) {
                        }
                        uq0 uq0Var822 = photoViewer.d;
                        if (uq0Var822 == null) {
                        }
                        G = org.telegram.ui.Components.a70.G(photoViewer.f0, new fi.b(), view);
                        G.l(R.drawable.msg_sendfile, org.telegram.messenger.gd.N0(z20 ? 2131745439 : 2131745440, null), new hn0(photoViewer, i13), z11);
                        G.l(R.drawable.msg_send, org.telegram.messenger.gd.N0(2131745438, null), new hn0(photoViewer, i12), z17);
                        G.l(R.drawable.msg_replace, org.telegram.messenger.gd.N0(2131746073, null), new hn0(photoViewer, 4), z17);
                        G.l(R.drawable.msg_calendar2, org.telegram.messenger.gd.N0(C ? 2131745318 : 2131745663, null), new hn0(photoViewer, 5), z18);
                        G.l(R.drawable.input_notify_off, org.telegram.messenger.gd.N0(2131745387, null), new hn0(photoViewer, 6), z19);
                        if (G.y() != 0) {
                        }
                    }
                }
                return false;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (profileActivity.K2 == null && !profileActivity.q1) {
                    profileActivity.N4(false);
                }
                return false;
            default:
                s11 s11Var = (s11) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, s11Var.getContext(), null);
                String N0 = org.telegram.messenger.gd.N0(2131752058, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = N0;
                t1Var.U = org.telegram.messenger.gd.N0(2131752059, null);
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131752089, null), new xz0(s11Var));
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                t1Var.Q0 = false;
                alertDialog$Builder.j(new q5(s11Var, 14));
                alertDialog$Builder.p();
                s11Var.w(1.0f);
                try {
                    s11Var.performHapticFeedback(0, 1);
                } catch (Exception unused3) {
                }
                return true;
        }
    }
}
