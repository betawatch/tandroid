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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
    
        if (((org.telegram.messenger.ye) r11).g == null) goto L114;
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
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.m60 F;
        sq0 sq0Var;
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
                    org.telegram.ui.Components.m60 F2 = org.telegram.ui.Components.m60.F(t3Var != null ? t3Var.c : g4Var.g0, null, view);
                    if (org.telegram.messenger.gz.v0) {
                        r11 = 0;
                        backgroundColor = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Gl, false);
                    } else {
                        r11 = 0;
                        backgroundColor = g4Var.v0[0].getBackgroundColor();
                    }
                    if (org.telegram.messenger.gz.v0) {
                        i11 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.G6, r11);
                    } else if (org.telegram.messenger.g0.B(g4Var.v0[r11].getBackgroundColor()) >= 0.721f) {
                        i11 = -16777216;
                    }
                    int r12 = org.telegram.ui.ActionBar.j6.r1(0.65f, i11);
                    org.telegram.ui.web.s0 webView = g4Var.v0[0].getWebView();
                    if (webView != null) {
                        WebBackForwardList copyBackForwardList = webView.copyBackForwardList();
                        int currentIndex = copyBackForwardList.getCurrentIndex();
                        if (copyBackForwardList.getCurrentIndex() > 0) {
                            int i15 = 0;
                            while (i15 < currentIndex) {
                                WebHistoryItem itemAtIndex = copyBackForwardList.getItemAtIndex(i15);
                                int i16 = i13;
                                F2.c(0, itemAtIndex.getTitle(), new jg.q(currentIndex, i15, webView, 9), false);
                                org.telegram.ui.ActionBar.z0 y10 = F2.y();
                                if (y10 != null) {
                                    y10.setSubtext(itemAtIndex.getUrl());
                                    Bitmap bitmap = (Bitmap) webView.Q.get(itemAtIndex.getUrl());
                                    if (bitmap == null) {
                                        bitmap = itemAtIndex.getFavicon();
                                    }
                                    webBackForwardList = copyBackForwardList;
                                    y10.j(itemAtIndex.getTitle(), 0, new ci.a1(bitmap, new Paint(i12), 1));
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
                                Bitmap bitmap2 = webView != null ? (Bitmap) webView.Q.get(x2Var.x) : null;
                                if (bitmap2 == null) {
                                    bitmap2 = x2Var.F;
                                }
                                i7 = i17;
                                y11.j(x2Var.b(), 0, new ci.a1(bitmap2, new Paint(3), i7));
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
                                    org.telegram.ui.Components.fh0 fh0Var = y12.c;
                                    y12.j(webPage.title, R.drawable.msg_instant, null);
                                    y12.setTextColor(i11);
                                    if (!TextUtils.isEmpty(webPage.site_name)) {
                                        y12.setSubtext(webPage.site_name);
                                    }
                                    y12.setSubtextColor(r12);
                                    fh0Var.getLayoutParams().width = org.telegram.messenger.g0.L(24.0f);
                                    fh0Var.setScaleX(1.45f);
                                    fh0Var.setScaleY(1.45f);
                                    y12.d(i11, i11);
                                    size--;
                                    i17 = i7;
                                }
                            }
                        }
                        size--;
                        i17 = i7;
                    }
                    F2.W(org.telegram.ui.ActionBar.j6.L(org.telegram.messenger.g0.L(40.0f), g4Var.i0.getBackgroundColor()));
                    F2.P(backgroundColor);
                    if (F2.x() > 0) {
                        g4Var.k(new org.telegram.messenger.fe(g4Var, F2, f10, 1));
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
                nk nkVar = (nk) obj;
                an anVar = nkVar.c;
                if (org.telegram.messenger.g0.Q1() || (anVar.fa() && !org.telegram.messenger.q10.t(anVar.f))) {
                    return false;
                }
                nkVar.b = nkVar.a;
                anVar.La(true);
                return true;
            case 3:
                om0 om0Var = (om0) obj;
                an anVar2 = om0Var.G;
                if (anVar2 == null || om0Var.H == 1) {
                    return false;
                }
                TLRPC.User j3 = anVar2.j();
                if (om0Var.K == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(om0Var.getParentActivity(), null);
                    om0Var.K = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
                    om0Var.K.setOnTouchListener(new org.telegram.ui.Components.se(om0Var));
                    om0Var.K.setDispatchKeyEventListener(new km0(om0Var, i14));
                    om0Var.K.setShownFromBottom(false);
                    om0Var.L = new org.telegram.ui.ActionBar.z0[2];
                    int i23 = 0;
                    while (i23 < 2) {
                        if ((i23 != 0 || anVar2.S6()) && (i23 != 1 || !org.telegram.messenger.q10.B(j3))) {
                            om0Var.L[i23] = new org.telegram.ui.ActionBar.z0(om0Var.getParentActivity(), i23 == 0, i23 == 1);
                            if (i23 != 0) {
                                om0Var.L[i23].j(org.telegram.messenger.hd.M0(2131745583, null), R.drawable.input_notify_off, null);
                            } else if (org.telegram.messenger.q10.B(j3)) {
                                om0Var.L[i23].j(org.telegram.messenger.hd.M0(2131745514, null), R.drawable.msg_calendar2, null);
                            } else {
                                om0Var.L[i23].j(org.telegram.messenger.hd.M0(2131745859, null), R.drawable.msg_calendar2, null);
                            }
                            om0Var.L[i23].setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                            om0Var.K.a(om0Var.L[i23], c8.ja.o(-1, 48));
                            om0Var.L[i23].setOnClickListener(new ci.q(om0Var, i23, 27));
                        }
                        i23++;
                    }
                    om0Var.K.setupRadialSelectors(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.I5, false));
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
                    return false;
                } catch (Exception unused) {
                    return false;
                }
            case 4:
                zm0 zm0Var = (zm0) obj;
                an anVar3 = zm0Var.V;
                if (anVar3 == null || zm0Var.I == 1) {
                    return false;
                }
                TLRPC.User j10 = anVar3.j();
                if (zm0Var.o0 == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(zm0Var.getParentActivity(), null);
                    zm0Var.o0 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
                    zm0Var.o0.setOnTouchListener(new org.telegram.ui.Components.se(zm0Var));
                    zm0Var.o0.setDispatchKeyEventListener(new sm0(zm0Var, i12));
                    zm0Var.o0.setShownFromBottom(false);
                    zm0Var.p0 = new org.telegram.ui.ActionBar.z0[2];
                    int i24 = 0;
                    while (i24 < 2) {
                        if ((i24 != 0 || anVar3.S6()) && (i24 != 1 || !org.telegram.messenger.q10.B(j10))) {
                            zm0Var.p0[i24] = new org.telegram.ui.ActionBar.z0(zm0Var.getParentActivity(), i24 == 0, i24 == 1);
                            if (i24 != 0) {
                                zm0Var.p0[i24].j(org.telegram.messenger.hd.M0(2131745583, null), R.drawable.input_notify_off, null);
                            } else if (org.telegram.messenger.q10.B(j10)) {
                                zm0Var.p0[i24].j(org.telegram.messenger.hd.M0(2131745514, null), R.drawable.msg_calendar2, null);
                            } else {
                                zm0Var.p0[i24].j(org.telegram.messenger.hd.M0(2131745859, null), R.drawable.msg_calendar2, null);
                            }
                            zm0Var.p0[i24].setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                            zm0Var.o0.a(zm0Var.p0[i24], c8.ja.o(-1, 48));
                            zm0Var.p0[i24].setOnClickListener(new ci.q(zm0Var, i24, 28));
                        }
                        i24++;
                    }
                    zm0Var.o0.setupRadialSelectors(org.telegram.ui.ActionBar.j6.x0(null, zm0Var.x0, false));
                    org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(zm0Var.o0, -2, -2);
                    zm0Var.n0 = g1Var2;
                    g1Var2.b = false;
                    g1Var2.setAnimationStyle(R.style.PopupContextAnimation2);
                    zm0Var.n0.setOutsideTouchable(true);
                    zm0Var.n0.setClippingEnabled(true);
                    zm0Var.n0.setInputMethodMode(2);
                    zm0Var.n0.setSoftInputMode(0);
                    zm0Var.n0.getContentView().setFocusableInTouchMode(true);
                }
                zm0Var.o0.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                zm0Var.n0.setFocusable(true);
                int[] iArr2 = new int[2];
                view.getLocationInWindow(iArr2);
                zm0Var.n0.showAtLocation(view, 51, org.telegram.messenger.g0.L(8.0f) + ((view.getMeasuredWidth() + iArr2[0]) - zm0Var.o0.getMeasuredWidth()), (iArr2[1] - zm0Var.o0.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f));
                zm0Var.n0.b();
                try {
                    view.performHapticFeedback(3, 2);
                    return false;
                } catch (Exception unused2) {
                    return false;
                }
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                sq0 sq0Var2 = photoViewer.d;
                if ((sq0Var2 == null || sq0Var2.U()) && photoViewer.d2 != 11) {
                    org.telegram.ui.ActionBar.e2 e2Var = photoViewer.m4;
                    boolean z12 = (e2Var == null || e2Var.getLastStoryViewer() == null) ? false : true;
                    an anVar4 = photoViewer.l4;
                    if ((anVar4 == null || !anVar4.c()) && ((photoViewer.l4 != null || z12 || photoViewer.d != null) && !photoViewer.V1.o())) {
                        an anVar5 = photoViewer.l4;
                        if (anVar5 != null) {
                            a22 = anVar5.j();
                            b10 = photoViewer.l4.S6();
                        } else {
                            sq0 sq0Var3 = photoViewer.d;
                            if (sq0Var3 != null) {
                                long a10 = sq0Var3.a();
                                a22 = a10 != 0 ? org.telegram.messenger.np.s1(photoViewer.U).a2(Long.valueOf(a10)) : null;
                                b10 = photoViewer.d.b();
                            }
                        }
                        sq0 sq0Var4 = photoViewer.d;
                        boolean z13 = sq0Var4 != null && sq0Var4.p();
                        sq0 sq0Var5 = photoViewer.d;
                        boolean z14 = sq0Var5 != null && sq0Var5.r();
                        boolean B = org.telegram.messenger.q10.B(a22);
                        sq0 sq0Var6 = photoViewer.d;
                        if (sq0Var6 != null && sq0Var6.v() != null) {
                            Iterator it = photoViewer.d.v().entrySet().iterator();
                            while (it.hasNext()) {
                                Object value = ((Map.Entry) it.next()).getValue();
                                if (!(value instanceof org.telegram.messenger.ff)) {
                                    z10 = (value instanceof org.telegram.messenger.jf) && ((org.telegram.messenger.jf) value).x != 0;
                                } else if (((org.telegram.messenger.ff) value).x != 0) {
                                }
                                if (!z13) {
                                    xo0 xo0Var = photoViewer.V1;
                                    if ((!xo0Var.U0 || xo0Var.b1 <= 0) && ((sq0Var = photoViewer.d) == null || sq0Var.I())) {
                                        ?? r122 = photoViewer.g7;
                                        int i25 = photoViewer.P4;
                                        Object obj3 = (i25 < 0 || i25 >= r122.size()) ? null : r122.get(photoViewer.P4);
                                        if (photoViewer.s1) {
                                            lq0 lq0Var = photoViewer.X4;
                                            if (!photoViewer.r) {
                                                if (photoViewer.o8 <= 0.0f) {
                                                    if (photoViewer.p8 >= 1.0f) {
                                                        if (obj3 instanceof org.telegram.messenger.ye) {
                                                            break;
                                                        }
                                                        if (lq0Var != null) {
                                                            org.telegram.messenger.xe xeVar = lq0Var.c;
                                                            if (xeVar != null) {
                                                                break;
                                                            }
                                                            if (lq0Var.d == null) {
                                                                if (lq0Var.a == null) {
                                                                    ArrayList arrayList2 = lq0Var.e;
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
                                        sq0 sq0Var7 = photoViewer.d;
                                        HashMap v = sq0Var7 != null ? sq0Var7.v() : null;
                                        if (v != null) {
                                            r122 = v.values();
                                        }
                                        for (Object obj4 : r122) {
                                            if (obj4 == obj3 || !(obj4 instanceof org.telegram.messenger.ye) || !((org.telegram.messenger.ye) obj4).b()) {
                                            }
                                        }
                                        z11 = true;
                                        boolean z15 = z13 && b10 && !z10;
                                        boolean z16 = (z13 || !z14) && !B;
                                        sq0 sq0Var8 = photoViewer.d;
                                        boolean z17 = sq0Var8 == null && sq0Var8.H() > 1;
                                        F = org.telegram.ui.Components.m60.F(photoViewer.f0, new fi.b(), view);
                                        F.l(R.drawable.msg_sendfile, org.telegram.messenger.hd.M0(z17 ? 2131745635 : 2131745636, null), new en0(photoViewer, i13), z11);
                                        F.l(R.drawable.msg_send, org.telegram.messenger.hd.M0(2131745634, null), new en0(photoViewer, i12), z14);
                                        F.l(R.drawable.msg_replace, org.telegram.messenger.hd.M0(2131746269, null), new en0(photoViewer, 4), z14);
                                        F.l(R.drawable.msg_calendar2, org.telegram.messenger.hd.M0(B ? 2131745514 : 2131745859, null), new en0(photoViewer, 5), z15);
                                        F.l(R.drawable.input_notify_off, org.telegram.messenger.hd.M0(2131745583, null), new en0(photoViewer, 6), z16);
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
                                sq0 sq0Var82 = photoViewer.d;
                                if (sq0Var82 == null) {
                                }
                                F = org.telegram.ui.Components.m60.F(photoViewer.f0, new fi.b(), view);
                                F.l(R.drawable.msg_sendfile, org.telegram.messenger.hd.M0(z17 ? 2131745635 : 2131745636, null), new en0(photoViewer, i13), z11);
                                F.l(R.drawable.msg_send, org.telegram.messenger.hd.M0(2131745634, null), new en0(photoViewer, i12), z14);
                                F.l(R.drawable.msg_replace, org.telegram.messenger.hd.M0(2131746269, null), new en0(photoViewer, 4), z14);
                                F.l(R.drawable.msg_calendar2, org.telegram.messenger.hd.M0(B ? 2131745514 : 2131745859, null), new en0(photoViewer, 5), z15);
                                F.l(R.drawable.input_notify_off, org.telegram.messenger.hd.M0(2131745583, null), new en0(photoViewer, 6), z16);
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
                        sq0 sq0Var822 = photoViewer.d;
                        if (sq0Var822 == null) {
                        }
                        F = org.telegram.ui.Components.m60.F(photoViewer.f0, new fi.b(), view);
                        F.l(R.drawable.msg_sendfile, org.telegram.messenger.hd.M0(z17 ? 2131745635 : 2131745636, null), new en0(photoViewer, i13), z11);
                        F.l(R.drawable.msg_send, org.telegram.messenger.hd.M0(2131745634, null), new en0(photoViewer, i12), z14);
                        F.l(R.drawable.msg_replace, org.telegram.messenger.hd.M0(2131746269, null), new en0(photoViewer, 4), z14);
                        F.l(R.drawable.msg_calendar2, org.telegram.messenger.hd.M0(B ? 2131745514 : 2131745859, null), new en0(photoViewer, 5), z15);
                        F.l(R.drawable.input_notify_off, org.telegram.messenger.hd.M0(2131745583, null), new en0(photoViewer, 6), z16);
                        if (F.x() != 0) {
                        }
                    }
                }
                return false;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (profileActivity.K2 == null && !profileActivity.q1) {
                    profileActivity.M4(false);
                }
                return false;
            default:
                n11 n11Var = (n11) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, n11Var.getContext(), null);
                String M0 = org.telegram.messenger.hd.M0(2131752070, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = M0;
                t1Var.U = org.telegram.messenger.hd.M0(2131752071, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752101, null), new sz0(n11Var));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                t1Var.Q0 = false;
                alertDialog$Builder.j(new q5(n11Var, 14));
                alertDialog$Builder.p();
                n11Var.w(1.0f);
                try {
                    n11Var.performHapticFeedback(0, 1);
                } catch (Exception unused3) {
                }
                return true;
        }
    }
}
