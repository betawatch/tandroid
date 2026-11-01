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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
    
        if (((org.telegram.messenger.af) r11).g == null) goto L114;
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
        ds0 ds0Var;
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
                    if (org.telegram.messenger.uz.v0) {
                        r11 = 0;
                        backgroundColor = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Dl, false);
                    } else {
                        r11 = 0;
                        backgroundColor = h4Var.u0[0].getBackgroundColor();
                    }
                    if (org.telegram.messenger.uz.v0) {
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
                                org.telegram.ui.Components.fi0 fi0Var = y11.c;
                                y11.j(webPage.title, R.drawable.msg_instant, null);
                                y11.setTextColor(i11);
                                if (!TextUtils.isEmpty(webPage.site_name)) {
                                    y11.setSubtext(webPage.site_name);
                                }
                                y11.setSubtextColor(r12);
                                fi0Var.getLayoutParams().width = org.telegram.messenger.i0.L(24.0f);
                                fi0Var.setScaleX(1.45f);
                                fi0Var.setScaleY(1.45f);
                                y11.d(i11, i11);
                            }
                        }
                    }
                    F2.W(org.telegram.ui.ActionBar.t6.L(org.telegram.messenger.i0.L(40.0f), h4Var.h0.getBackgroundColor()));
                    F2.P(backgroundColor);
                    if (F2.x() > 0) {
                        h4Var.k(new org.telegram.messenger.je(h4Var, F2, f7, 1));
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
                h8Var.B0();
                h8Var.u0();
                return false;
            case 2:
                jl jlVar = (jl) obj;
                un unVar = jlVar.c;
                if (org.telegram.messenger.i0.Q1() || (unVar.Y9() && !org.telegram.messenger.i20.t(unVar.f))) {
                    return false;
                }
                jlVar.b = jlVar.a;
                unVar.Da(true);
                return true;
            case 3:
                wn0 wn0Var = (wn0) obj;
                un unVar2 = wn0Var.F;
                if (unVar2 == null || wn0Var.G == 1) {
                    return false;
                }
                TLRPC.User j10 = unVar2.j();
                if (wn0Var.J == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(wn0Var.getParentActivity(), null);
                    wn0Var.J = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
                    wn0Var.J.setOnTouchListener(new org.telegram.ui.Components.ne(wn0Var));
                    wn0Var.J.setDispatchKeyEventListener(new sn0(wn0Var, i14));
                    wn0Var.J.setShownFromBottom(false);
                    wn0Var.K = new org.telegram.ui.ActionBar.b1[2];
                    int i22 = 0;
                    while (i22 < 2) {
                        if ((i22 != 0 || unVar2.P6()) && (i22 != 1 || !org.telegram.messenger.i20.B(j10))) {
                            wn0Var.K[i22] = new org.telegram.ui.ActionBar.b1(wn0Var.getParentActivity(), i22 == 0, i22 == 1);
                            if (i22 != 0) {
                                wn0Var.K[i22].j(org.telegram.messenger.dd.L0(2131745600, null), R.drawable.input_notify_off, null);
                            } else if (org.telegram.messenger.i20.B(j10)) {
                                wn0Var.K[i22].j(org.telegram.messenger.dd.L0(2131745531, null), R.drawable.msg_calendar2, null);
                            } else {
                                wn0Var.K[i22].j(org.telegram.messenger.dd.L0(2131745876, null), R.drawable.msg_calendar2, null);
                            }
                            wn0Var.K[i22].setMinimumWidth(org.telegram.messenger.i0.L(196.0f));
                            wn0Var.J.a(wn0Var.K[i22], w7.b6.o(-1, 48));
                            wn0Var.K[i22].setOnClickListener(new bh.f(wn0Var, i22, 22));
                        }
                        i22++;
                    }
                    wn0Var.J.setupRadialSelectors(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.I5, false));
                    org.telegram.ui.ActionBar.k1 k1Var = new org.telegram.ui.ActionBar.k1(wn0Var.J, -2, -2);
                    wn0Var.I = k1Var;
                    k1Var.b = false;
                    k1Var.setAnimationStyle(R.style.PopupContextAnimation2);
                    wn0Var.I.setOutsideTouchable(true);
                    wn0Var.I.setClippingEnabled(true);
                    wn0Var.I.setInputMethodMode(2);
                    wn0Var.I.setSoftInputMode(0);
                    wn0Var.I.getContentView().setFocusableInTouchMode(true);
                }
                wn0Var.J.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31));
                wn0Var.I.setFocusable(true);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                wn0Var.I.showAtLocation(view, 51, org.telegram.messenger.i0.L(8.0f) + ((view.getMeasuredWidth() + iArr[0]) - wn0Var.J.getMeasuredWidth()), (iArr[1] - wn0Var.J.getMeasuredHeight()) - org.telegram.messenger.i0.L(2.0f));
                wn0Var.I.b();
                try {
                    view.performHapticFeedback(3, 2);
                    return false;
                } catch (Exception unused) {
                    return false;
                }
            case 4:
                jo0 jo0Var = (jo0) obj;
                un unVar3 = jo0Var.U;
                if (unVar3 == null || jo0Var.H == 1) {
                    return false;
                }
                TLRPC.User j11 = unVar3.j();
                if (jo0Var.n0 == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(jo0Var.getParentActivity(), null);
                    jo0Var.n0 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
                    jo0Var.n0.setOnTouchListener(new org.telegram.ui.Components.ne(jo0Var));
                    jo0Var.n0.setDispatchKeyEventListener(new ao0(jo0Var, i13));
                    jo0Var.n0.setShownFromBottom(false);
                    jo0Var.o0 = new org.telegram.ui.ActionBar.b1[2];
                    int i23 = 0;
                    while (i23 < 2) {
                        if ((i23 != 0 || unVar3.P6()) && (i23 != 1 || !org.telegram.messenger.i20.B(j11))) {
                            jo0Var.o0[i23] = new org.telegram.ui.ActionBar.b1(jo0Var.getParentActivity(), i23 == 0, i23 == 1);
                            if (i23 != 0) {
                                jo0Var.o0[i23].j(org.telegram.messenger.dd.L0(2131745600, null), R.drawable.input_notify_off, null);
                            } else if (org.telegram.messenger.i20.B(j11)) {
                                jo0Var.o0[i23].j(org.telegram.messenger.dd.L0(2131745531, null), R.drawable.msg_calendar2, null);
                            } else {
                                jo0Var.o0[i23].j(org.telegram.messenger.dd.L0(2131745876, null), R.drawable.msg_calendar2, null);
                            }
                            jo0Var.o0[i23].setMinimumWidth(org.telegram.messenger.i0.L(196.0f));
                            jo0Var.n0.a(jo0Var.o0[i23], w7.b6.o(-1, 48));
                            jo0Var.o0[i23].setOnClickListener(new bh.f(jo0Var, i23, 23));
                        }
                        i23++;
                    }
                    jo0Var.n0.setupRadialSelectors(org.telegram.ui.ActionBar.t6.x0(null, jo0Var.w0, false));
                    org.telegram.ui.ActionBar.k1 k1Var2 = new org.telegram.ui.ActionBar.k1(jo0Var.n0, -2, -2);
                    jo0Var.m0 = k1Var2;
                    k1Var2.b = false;
                    k1Var2.setAnimationStyle(R.style.PopupContextAnimation2);
                    jo0Var.m0.setOutsideTouchable(true);
                    jo0Var.m0.setClippingEnabled(true);
                    jo0Var.m0.setInputMethodMode(2);
                    jo0Var.m0.setSoftInputMode(0);
                    jo0Var.m0.getContentView().setFocusableInTouchMode(true);
                }
                jo0Var.n0.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31));
                jo0Var.m0.setFocusable(true);
                int[] iArr2 = new int[2];
                view.getLocationInWindow(iArr2);
                jo0Var.m0.showAtLocation(view, 51, org.telegram.messenger.i0.L(8.0f) + ((view.getMeasuredWidth() + iArr2[0]) - jo0Var.n0.getMeasuredWidth()), (iArr2[1] - jo0Var.n0.getMeasuredHeight()) - org.telegram.messenger.i0.L(2.0f));
                jo0Var.m0.b();
                try {
                    view.performHapticFeedback(3, 2);
                    return false;
                } catch (Exception unused2) {
                    return false;
                }
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                ds0 ds0Var2 = photoViewer.d;
                if ((ds0Var2 == null || ds0Var2.U()) && photoViewer.c2 != 11) {
                    org.telegram.ui.ActionBar.k2 k2Var = photoViewer.m4;
                    boolean z12 = (k2Var == null || k2Var.getLastStoryViewer() == null) ? false : true;
                    un unVar4 = photoViewer.l4;
                    if ((unVar4 == null || !unVar4.c()) && ((photoViewer.l4 != null || z12 || photoViewer.d != null) && !photoViewer.U1.o())) {
                        un unVar5 = photoViewer.l4;
                        if (unVar5 != null) {
                            Z1 = unVar5.j();
                            b10 = photoViewer.l4.P6();
                        } else {
                            ds0 ds0Var3 = photoViewer.d;
                            if (ds0Var3 != null) {
                                long a2 = ds0Var3.a();
                                Z1 = a2 != 0 ? org.telegram.messenger.wp.r1(photoViewer.T).Z1(Long.valueOf(a2)) : null;
                                b10 = photoViewer.d.b();
                            }
                        }
                        ds0 ds0Var4 = photoViewer.d;
                        boolean z13 = ds0Var4 != null && ds0Var4.p();
                        ds0 ds0Var5 = photoViewer.d;
                        boolean z14 = ds0Var5 != null && ds0Var5.r();
                        boolean B = org.telegram.messenger.i20.B(Z1);
                        ds0 ds0Var6 = photoViewer.d;
                        if (ds0Var6 != null && ds0Var6.v() != null) {
                            Iterator it = photoViewer.d.v().entrySet().iterator();
                            while (it.hasNext()) {
                                Object value = ((Map.Entry) it.next()).getValue();
                                if (!(value instanceof org.telegram.messenger.ff)) {
                                    z10 = (value instanceof org.telegram.messenger.jf) && ((org.telegram.messenger.jf) value).x != 0;
                                } else if (((org.telegram.messenger.ff) value).x != 0) {
                                }
                                if (!z13) {
                                    hq0 hq0Var = photoViewer.U1;
                                    if ((!hq0Var.T0 || hq0Var.a1 <= 0) && ((ds0Var = photoViewer.d) == null || ds0Var.I())) {
                                        ?? r122 = photoViewer.g7;
                                        int i24 = photoViewer.P4;
                                        Object obj3 = (i24 < 0 || i24 >= r122.size()) ? null : r122.get(photoViewer.P4);
                                        if (photoViewer.r1) {
                                            wr0 wr0Var = photoViewer.X4;
                                            if (!photoViewer.r) {
                                                if (photoViewer.o8 <= 0.0f) {
                                                    if (photoViewer.p8 >= 1.0f) {
                                                        if (obj3 instanceof org.telegram.messenger.af) {
                                                            break;
                                                        }
                                                        if (wr0Var != null) {
                                                            org.telegram.messenger.ze zeVar = wr0Var.c;
                                                            if (zeVar != null) {
                                                                break;
                                                            }
                                                            if (wr0Var.d == null) {
                                                                if (wr0Var.a == null) {
                                                                    ArrayList arrayList2 = wr0Var.e;
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
                                        ds0 ds0Var7 = photoViewer.d;
                                        HashMap v = ds0Var7 != null ? ds0Var7.v() : null;
                                        if (v != null) {
                                            r122 = v.values();
                                        }
                                        for (Object obj4 : r122) {
                                            if (obj4 == obj3 || !(obj4 instanceof org.telegram.messenger.af) || !((org.telegram.messenger.af) obj4).b()) {
                                            }
                                        }
                                        z11 = true;
                                        boolean z15 = z13 && b10 && !z10;
                                        boolean z16 = (z13 || !z14) && !B;
                                        ds0 ds0Var8 = photoViewer.d;
                                        boolean z17 = ds0Var8 == null && ds0Var8.H() > 1;
                                        F = org.telegram.ui.Components.z60.F(photoViewer.e0, new th.b(), view);
                                        F.l(R.drawable.msg_sendfile, org.telegram.messenger.dd.L0(z17 ? 2131745652 : 2131745653, null), new oo0(photoViewer, i12), z11);
                                        F.l(R.drawable.msg_send, org.telegram.messenger.dd.L0(2131745651, null), new oo0(photoViewer, i13), z14);
                                        F.l(R.drawable.msg_replace, org.telegram.messenger.dd.L0(2131746284, null), new oo0(photoViewer, 4), z14);
                                        F.l(R.drawable.msg_calendar2, org.telegram.messenger.dd.L0(B ? 2131745531 : 2131745876, null), new oo0(photoViewer, 5), z15);
                                        F.l(R.drawable.input_notify_off, org.telegram.messenger.dd.L0(2131745600, null), new oo0(photoViewer, 6), z16);
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
                                ds0 ds0Var82 = photoViewer.d;
                                if (ds0Var82 == null) {
                                }
                                F = org.telegram.ui.Components.z60.F(photoViewer.e0, new th.b(), view);
                                F.l(R.drawable.msg_sendfile, org.telegram.messenger.dd.L0(z17 ? 2131745652 : 2131745653, null), new oo0(photoViewer, i12), z11);
                                F.l(R.drawable.msg_send, org.telegram.messenger.dd.L0(2131745651, null), new oo0(photoViewer, i13), z14);
                                F.l(R.drawable.msg_replace, org.telegram.messenger.dd.L0(2131746284, null), new oo0(photoViewer, 4), z14);
                                F.l(R.drawable.msg_calendar2, org.telegram.messenger.dd.L0(B ? 2131745531 : 2131745876, null), new oo0(photoViewer, 5), z15);
                                F.l(R.drawable.input_notify_off, org.telegram.messenger.dd.L0(2131745600, null), new oo0(photoViewer, 6), z16);
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
                        ds0 ds0Var822 = photoViewer.d;
                        if (ds0Var822 == null) {
                        }
                        F = org.telegram.ui.Components.z60.F(photoViewer.e0, new th.b(), view);
                        F.l(R.drawable.msg_sendfile, org.telegram.messenger.dd.L0(z17 ? 2131745652 : 2131745653, null), new oo0(photoViewer, i12), z11);
                        F.l(R.drawable.msg_send, org.telegram.messenger.dd.L0(2131745651, null), new oo0(photoViewer, i13), z14);
                        F.l(R.drawable.msg_replace, org.telegram.messenger.dd.L0(2131746284, null), new oo0(photoViewer, 4), z14);
                        F.l(R.drawable.msg_calendar2, org.telegram.messenger.dd.L0(B ? 2131745531 : 2131745876, null), new oo0(photoViewer, 5), z15);
                        F.l(R.drawable.input_notify_off, org.telegram.messenger.dd.L0(2131745600, null), new oo0(photoViewer, 6), z16);
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
                g31 g31Var = (g31) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, g31Var.getContext(), null);
                String L0 = org.telegram.messenger.dd.L0(2131752070, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                x1Var.R = L0;
                x1Var.T = org.telegram.messenger.dd.L0(2131752071, null);
                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131752101, null), new k11(g31Var));
                alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                x1Var.R0 = false;
                alertDialog$Builder.j(new q5(g31Var, 14));
                alertDialog$Builder.p();
                g31Var.w(1.0f);
                try {
                    g31Var.performHapticFeedback(0, 1);
                } catch (Exception unused3) {
                }
                return true;
        }
    }
}
