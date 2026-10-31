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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s(Object obj, int i10) {
        this.a = i10;
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
        WebBackForwardList webBackForwardList;
        TLRPC.User Z1;
        boolean b10;
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.z60 F;
        es0 es0Var;
        int i10 = this.a;
        int i11 = -1;
        int i12 = 2;
        int i13 = 3;
        Object obj = this.b;
        int i14 = 1;
        switch (i10) {
            case 0:
                final h4 h4Var = (h4) obj;
                ArrayList arrayList = h4Var.d0;
                if (h4Var.u0[0] != null) {
                    float f7 = h4Var.h0.M.d;
                    u3 u3Var = h4Var.K;
                    org.telegram.ui.Components.z60 F2 = org.telegram.ui.Components.z60.F(u3Var != null ? u3Var.c : h4Var.f0, null, view);
                    if (org.telegram.messenger.tz.v0) {
                        r11 = 0;
                        backgroundColor = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Dl, false);
                    } else {
                        r11 = 0;
                        backgroundColor = h4Var.u0[0].getBackgroundColor();
                    }
                    if (org.telegram.messenger.tz.v0) {
                        i11 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, r11);
                    } else if (org.telegram.messenger.i0.B(h4Var.u0[r11].getBackgroundColor()) >= 0.721f) {
                        i11 = -16777216;
                    }
                    int r12 = org.telegram.ui.ActionBar.t6.r1(0.65f, i11);
                    org.telegram.ui.web.v0 webView = h4Var.u0[0].getWebView();
                    if (webView != null) {
                        WebBackForwardList copyBackForwardList = webView.copyBackForwardList();
                        int currentIndex = copyBackForwardList.getCurrentIndex();
                        if (copyBackForwardList.getCurrentIndex() > 0) {
                            int i15 = 0;
                            while (i15 < currentIndex) {
                                WebHistoryItem itemAtIndex = copyBackForwardList.getItemAtIndex(i15);
                                int i16 = i12;
                                F2.c(0, itemAtIndex.getTitle(), new i2.u(currentIndex, i15, webView, 8), false);
                                org.telegram.ui.ActionBar.b1 y3 = F2.y();
                                if (y3 != null) {
                                    y3.setSubtext(itemAtIndex.getUrl());
                                    Bitmap bitmap = (Bitmap) webView.P.get(itemAtIndex.getUrl());
                                    if (bitmap == null) {
                                        bitmap = itemAtIndex.getFavicon();
                                    }
                                    webBackForwardList = copyBackForwardList;
                                    y3.j(itemAtIndex.getTitle(), 0, new o0(bitmap, new Paint(i13), 0));
                                    y3.setTextColor(i11);
                                    y3.setSubtextColor(r12);
                                } else {
                                    webBackForwardList = copyBackForwardList;
                                }
                                i15++;
                                copyBackForwardList = webBackForwardList;
                                i12 = i16;
                                i13 = 3;
                            }
                        }
                    }
                    for (final int size = arrayList.size() - 2; size >= 0; size--) {
                        Object obj2 = arrayList.get(size);
                        if (obj2 instanceof x2) {
                            x2 x2Var = (x2) obj2;
                            final int i17 = 0;
                            F2.c(0, x2Var.b(), new Runnable() { // from class: org.telegram.ui.u
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i17) {
                                        case 0:
                                            h4Var.F(size);
                                            break;
                                        default:
                                            h4Var.F(size);
                                            break;
                                    }
                                }
                            }, false);
                            org.telegram.ui.ActionBar.b1 y10 = F2.y();
                            if (y10 != null) {
                                y10.setSubtext(x2Var.x);
                                Bitmap bitmap2 = webView != null ? (Bitmap) webView.P.get(x2Var.x) : null;
                                if (bitmap2 == null) {
                                    bitmap2 = x2Var.F;
                                }
                                y10.j(x2Var.b(), 0, new o0(bitmap2, new Paint(3), 1));
                                y10.setTextColor(i11);
                                y10.setSubtextColor(r12);
                                y10.d(i11, i11);
                            }
                        } else if (obj2 instanceof TLRPC.WebPage) {
                            TLRPC.WebPage webPage = (TLRPC.WebPage) obj2;
                            final int i18 = 1;
                            F2.c(0, webPage.title, new Runnable() { // from class: org.telegram.ui.u
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i18) {
                                        case 0:
                                            h4Var.F(size);
                                            break;
                                        default:
                                            h4Var.F(size);
                                            break;
                                    }
                                }
                            }, false);
                            org.telegram.ui.ActionBar.b1 y11 = F2.y();
                            if (y11 != null) {
                                org.telegram.ui.Components.ei0 ei0Var = y11.c;
                                y11.j(webPage.title, R.drawable.msg_instant, null);
                                y11.setTextColor(i11);
                                if (!TextUtils.isEmpty(webPage.site_name)) {
                                    y11.setSubtext(webPage.site_name);
                                }
                                y11.setSubtextColor(r12);
                                ei0Var.getLayoutParams().width = org.telegram.messenger.i0.L(24.0f);
                                ei0Var.setScaleX(1.45f);
                                ei0Var.setScaleY(1.45f);
                                y11.d(i11, i11);
                            }
                        }
                    }
                    F2.W(org.telegram.ui.ActionBar.t6.L(org.telegram.messenger.i0.L(40.0f), h4Var.h0.getBackgroundColor()));
                    F2.P(backgroundColor);
                    if (F2.x() > 0) {
                        h4Var.k(new org.telegram.messenger.ie(h4Var, F2, f7, 1));
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
                int i19 = -1;
                int i20 = -1;
                for (int i21 = 0; i21 < e8Var.d; i21++) {
                    f8 f8Var = (f8) e8Var.n.get(i21, null);
                    if (f8Var != null) {
                        if (i19 == -1) {
                            i19 = f8Var.h;
                        }
                        i20 = f8Var.h;
                    }
                }
                if (i19 < 0 || i20 < 0) {
                    return false;
                }
                h8Var.G = true;
                h8Var.P = i19;
                h8Var.Q = i20;
                h8Var.A0();
                h8Var.t0();
                return false;
            case 2:
                jl jlVar = (jl) obj;
                un unVar = jlVar.c;
                if (org.telegram.messenger.i0.Q1() || (unVar.T9() && !org.telegram.messenger.h20.t(unVar.f))) {
                    return false;
                }
                jlVar.b = jlVar.a;
                unVar.ya(true);
                return true;
            case 3:
                yn0 yn0Var = (yn0) obj;
                un unVar2 = yn0Var.F;
                if (unVar2 == null || yn0Var.G == 1) {
                    return false;
                }
                TLRPC.User j10 = unVar2.j();
                if (yn0Var.J == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(yn0Var.getParentActivity(), null);
                    yn0Var.J = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
                    yn0Var.J.setOnTouchListener(new org.telegram.ui.Components.ne(yn0Var));
                    yn0Var.J.setDispatchKeyEventListener(new un0(yn0Var, i14));
                    yn0Var.J.setShownFromBottom(false);
                    yn0Var.K = new org.telegram.ui.ActionBar.b1[2];
                    int i22 = 0;
                    while (i22 < 2) {
                        if ((i22 != 0 || unVar2.L6()) && (i22 != 1 || !org.telegram.messenger.h20.B(j10))) {
                            yn0Var.K[i22] = new org.telegram.ui.ActionBar.b1(yn0Var.getParentActivity(), i22 == 0, i22 == 1);
                            if (i22 != 0) {
                                yn0Var.K[i22].j(org.telegram.messenger.cd.L0(2131745600, null), R.drawable.input_notify_off, null);
                            } else if (org.telegram.messenger.h20.B(j10)) {
                                yn0Var.K[i22].j(org.telegram.messenger.cd.L0(2131745531, null), R.drawable.msg_calendar2, null);
                            } else {
                                yn0Var.K[i22].j(org.telegram.messenger.cd.L0(2131745876, null), R.drawable.msg_calendar2, null);
                            }
                            yn0Var.K[i22].setMinimumWidth(org.telegram.messenger.i0.L(196.0f));
                            yn0Var.J.a(yn0Var.K[i22], w7.b6.o(-1, 48));
                            yn0Var.K[i22].setOnClickListener(new bh.f(yn0Var, i22, 22));
                        }
                        i22++;
                    }
                    yn0Var.J.setupRadialSelectors(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.I5, false));
                    org.telegram.ui.ActionBar.k1 k1Var = new org.telegram.ui.ActionBar.k1(yn0Var.J, -2, -2);
                    yn0Var.I = k1Var;
                    k1Var.b = false;
                    k1Var.setAnimationStyle(R.style.PopupContextAnimation2);
                    yn0Var.I.setOutsideTouchable(true);
                    yn0Var.I.setClippingEnabled(true);
                    yn0Var.I.setInputMethodMode(2);
                    yn0Var.I.setSoftInputMode(0);
                    yn0Var.I.getContentView().setFocusableInTouchMode(true);
                }
                yn0Var.J.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31));
                yn0Var.I.setFocusable(true);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                yn0Var.I.showAtLocation(view, 51, org.telegram.messenger.i0.L(8.0f) + ((view.getMeasuredWidth() + iArr[0]) - yn0Var.J.getMeasuredWidth()), (iArr[1] - yn0Var.J.getMeasuredHeight()) - org.telegram.messenger.i0.L(2.0f));
                yn0Var.I.b();
                try {
                    view.performHapticFeedback(3, 2);
                    return false;
                } catch (Exception unused) {
                    return false;
                }
            case 4:
                lo0 lo0Var = (lo0) obj;
                un unVar3 = lo0Var.U;
                if (unVar3 == null || lo0Var.H == 1) {
                    return false;
                }
                TLRPC.User j11 = unVar3.j();
                if (lo0Var.n0 == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(lo0Var.getParentActivity(), null);
                    lo0Var.n0 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
                    lo0Var.n0.setOnTouchListener(new org.telegram.ui.Components.ne(lo0Var));
                    lo0Var.n0.setDispatchKeyEventListener(new co0(lo0Var, i13));
                    lo0Var.n0.setShownFromBottom(false);
                    lo0Var.o0 = new org.telegram.ui.ActionBar.b1[2];
                    int i23 = 0;
                    while (i23 < 2) {
                        if ((i23 != 0 || unVar3.L6()) && (i23 != 1 || !org.telegram.messenger.h20.B(j11))) {
                            lo0Var.o0[i23] = new org.telegram.ui.ActionBar.b1(lo0Var.getParentActivity(), i23 == 0, i23 == 1);
                            if (i23 != 0) {
                                lo0Var.o0[i23].j(org.telegram.messenger.cd.L0(2131745600, null), R.drawable.input_notify_off, null);
                            } else if (org.telegram.messenger.h20.B(j11)) {
                                lo0Var.o0[i23].j(org.telegram.messenger.cd.L0(2131745531, null), R.drawable.msg_calendar2, null);
                            } else {
                                lo0Var.o0[i23].j(org.telegram.messenger.cd.L0(2131745876, null), R.drawable.msg_calendar2, null);
                            }
                            lo0Var.o0[i23].setMinimumWidth(org.telegram.messenger.i0.L(196.0f));
                            lo0Var.n0.a(lo0Var.o0[i23], w7.b6.o(-1, 48));
                            lo0Var.o0[i23].setOnClickListener(new bh.f(lo0Var, i23, 23));
                        }
                        i23++;
                    }
                    lo0Var.n0.setupRadialSelectors(org.telegram.ui.ActionBar.t6.x0(null, lo0Var.w0, false));
                    org.telegram.ui.ActionBar.k1 k1Var2 = new org.telegram.ui.ActionBar.k1(lo0Var.n0, -2, -2);
                    lo0Var.m0 = k1Var2;
                    k1Var2.b = false;
                    k1Var2.setAnimationStyle(R.style.PopupContextAnimation2);
                    lo0Var.m0.setOutsideTouchable(true);
                    lo0Var.m0.setClippingEnabled(true);
                    lo0Var.m0.setInputMethodMode(2);
                    lo0Var.m0.setSoftInputMode(0);
                    lo0Var.m0.getContentView().setFocusableInTouchMode(true);
                }
                lo0Var.n0.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31));
                lo0Var.m0.setFocusable(true);
                int[] iArr2 = new int[2];
                view.getLocationInWindow(iArr2);
                lo0Var.m0.showAtLocation(view, 51, org.telegram.messenger.i0.L(8.0f) + ((view.getMeasuredWidth() + iArr2[0]) - lo0Var.n0.getMeasuredWidth()), (iArr2[1] - lo0Var.n0.getMeasuredHeight()) - org.telegram.messenger.i0.L(2.0f));
                lo0Var.m0.b();
                try {
                    view.performHapticFeedback(3, 2);
                    return false;
                } catch (Exception unused2) {
                    return false;
                }
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                es0 es0Var2 = photoViewer.d;
                if ((es0Var2 == null || es0Var2.U()) && photoViewer.c2 != 11) {
                    org.telegram.ui.ActionBar.k2 k2Var = photoViewer.m4;
                    boolean z12 = (k2Var == null || k2Var.getLastStoryViewer() == null) ? false : true;
                    un unVar4 = photoViewer.l4;
                    if ((unVar4 == null || !unVar4.c()) && ((photoViewer.l4 != null || z12 || photoViewer.d != null) && !photoViewer.U1.o())) {
                        un unVar5 = photoViewer.l4;
                        if (unVar5 != null) {
                            Z1 = unVar5.j();
                            b10 = photoViewer.l4.L6();
                        } else {
                            es0 es0Var3 = photoViewer.d;
                            if (es0Var3 != null) {
                                long a2 = es0Var3.a();
                                Z1 = a2 != 0 ? org.telegram.messenger.vp.r1(photoViewer.T).Z1(Long.valueOf(a2)) : null;
                                b10 = photoViewer.d.b();
                            }
                        }
                        es0 es0Var4 = photoViewer.d;
                        boolean z13 = es0Var4 != null && es0Var4.p();
                        es0 es0Var5 = photoViewer.d;
                        boolean z14 = es0Var5 != null && es0Var5.r();
                        boolean B = org.telegram.messenger.h20.B(Z1);
                        es0 es0Var6 = photoViewer.d;
                        if (es0Var6 != null && es0Var6.v() != null) {
                            Iterator it = photoViewer.d.v().entrySet().iterator();
                            while (it.hasNext()) {
                                Object value = ((Map.Entry) it.next()).getValue();
                                if (!(value instanceof org.telegram.messenger.ef)) {
                                    z10 = (value instanceof org.telegram.messenger.hf) && ((org.telegram.messenger.hf) value).x != 0;
                                } else if (((org.telegram.messenger.ef) value).x != 0) {
                                }
                                if (!z13) {
                                    jq0 jq0Var = photoViewer.U1;
                                    if ((!jq0Var.T0 || jq0Var.a1 <= 0) && ((es0Var = photoViewer.d) == null || es0Var.I())) {
                                        ?? r122 = photoViewer.g7;
                                        int i24 = photoViewer.P4;
                                        Object obj3 = (i24 < 0 || i24 >= r122.size()) ? null : r122.get(photoViewer.P4);
                                        if (photoViewer.r1) {
                                            xr0 xr0Var = photoViewer.X4;
                                            if (!photoViewer.r) {
                                                if (photoViewer.o8 <= 0.0f) {
                                                    if (photoViewer.p8 >= 1.0f) {
                                                        if (obj3 instanceof org.telegram.messenger.ze) {
                                                            break;
                                                        }
                                                        if (xr0Var != null) {
                                                            org.telegram.messenger.ye yeVar = xr0Var.c;
                                                            if (yeVar != null) {
                                                                break;
                                                            }
                                                            if (xr0Var.d == null) {
                                                                if (xr0Var.a == null) {
                                                                    ArrayList arrayList2 = xr0Var.e;
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
                                        es0 es0Var7 = photoViewer.d;
                                        HashMap v = es0Var7 != null ? es0Var7.v() : null;
                                        if (v != null) {
                                            r122 = v.values();
                                        }
                                        for (Object obj4 : r122) {
                                            if (obj4 == obj3 || !(obj4 instanceof org.telegram.messenger.ze) || !((org.telegram.messenger.ze) obj4).b()) {
                                            }
                                        }
                                        z11 = true;
                                        boolean z15 = z13 && b10 && !z10;
                                        boolean z16 = (z13 || !z14) && !B;
                                        es0 es0Var8 = photoViewer.d;
                                        boolean z17 = es0Var8 == null && es0Var8.H() > 1;
                                        F = org.telegram.ui.Components.z60.F(photoViewer.e0, new th.b(), view);
                                        F.l(R.drawable.msg_sendfile, org.telegram.messenger.cd.L0(z17 ? 2131745652 : 2131745653, null), new qo0(photoViewer, i12), z11);
                                        F.l(R.drawable.msg_send, org.telegram.messenger.cd.L0(2131745651, null), new qo0(photoViewer, i13), z14);
                                        F.l(R.drawable.msg_replace, org.telegram.messenger.cd.L0(2131746284, null), new qo0(photoViewer, 4), z14);
                                        F.l(R.drawable.msg_calendar2, org.telegram.messenger.cd.L0(B ? 2131745531 : 2131745876, null), new qo0(photoViewer, 5), z15);
                                        F.l(R.drawable.input_notify_off, org.telegram.messenger.cd.L0(2131745600, null), new qo0(photoViewer, 6), z16);
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
                                es0 es0Var82 = photoViewer.d;
                                if (es0Var82 == null) {
                                }
                                F = org.telegram.ui.Components.z60.F(photoViewer.e0, new th.b(), view);
                                F.l(R.drawable.msg_sendfile, org.telegram.messenger.cd.L0(z17 ? 2131745652 : 2131745653, null), new qo0(photoViewer, i12), z11);
                                F.l(R.drawable.msg_send, org.telegram.messenger.cd.L0(2131745651, null), new qo0(photoViewer, i13), z14);
                                F.l(R.drawable.msg_replace, org.telegram.messenger.cd.L0(2131746284, null), new qo0(photoViewer, 4), z14);
                                F.l(R.drawable.msg_calendar2, org.telegram.messenger.cd.L0(B ? 2131745531 : 2131745876, null), new qo0(photoViewer, 5), z15);
                                F.l(R.drawable.input_notify_off, org.telegram.messenger.cd.L0(2131745600, null), new qo0(photoViewer, 6), z16);
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
                        es0 es0Var822 = photoViewer.d;
                        if (es0Var822 == null) {
                        }
                        F = org.telegram.ui.Components.z60.F(photoViewer.e0, new th.b(), view);
                        F.l(R.drawable.msg_sendfile, org.telegram.messenger.cd.L0(z17 ? 2131745652 : 2131745653, null), new qo0(photoViewer, i12), z11);
                        F.l(R.drawable.msg_send, org.telegram.messenger.cd.L0(2131745651, null), new qo0(photoViewer, i13), z14);
                        F.l(R.drawable.msg_replace, org.telegram.messenger.cd.L0(2131746284, null), new qo0(photoViewer, 4), z14);
                        F.l(R.drawable.msg_calendar2, org.telegram.messenger.cd.L0(B ? 2131745531 : 2131745876, null), new qo0(photoViewer, 5), z15);
                        F.l(R.drawable.input_notify_off, org.telegram.messenger.cd.L0(2131745600, null), new qo0(photoViewer, 6), z16);
                        if (F.x() != 0) {
                        }
                    }
                }
                return false;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (profileActivity.I2 == null && !profileActivity.p1) {
                    profileActivity.J4(false);
                }
                return false;
            default:
                i31 i31Var = (i31) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, i31Var.getContext(), null);
                String L0 = org.telegram.messenger.cd.L0(2131752070, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                x1Var.R = L0;
                x1Var.T = org.telegram.messenger.cd.L0(2131752071, null);
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131752101, null), new l11(i31Var));
                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                x1Var.R0 = false;
                alertDialog$Builder.j(new q5(i31Var, 14));
                alertDialog$Builder.p();
                i31Var.w(1.0f);
                try {
                    i31Var.performHapticFeedback(0, 1);
                } catch (Exception unused3) {
                }
                return true;
        }
    }
}
