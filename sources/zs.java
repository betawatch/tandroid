// default package

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.o;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zs implements View.OnLongClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zs(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final boolean a(View view) {
        mu1 mu1Var;
        final taa taaVar = (taa) this.b;
        jh3 jh3Var = taaVar.o1;
        boolean z = taaVar.c2;
        Activity activity = taaVar.b2;
        final byte b = 0;
        if (activity == null) {
            return false;
        }
        LinearLayout linearLayout = new LinearLayout(taaVar.getContext());
        final byte b2 = 1;
        linearLayout.setOrientation(1);
        byte b3 = 2;
        if (taaVar.I1 != null) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, taaVar.J0);
            if (z) {
                zkb.h(bkb.Vg, taaVar.J0, actionBarPopupWindow$ActionBarPopupWindowLayout);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new daa(taaVar, (byte) 0));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new p9a(taaVar, b3));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
            final a8 a8Var = new a8(1, taaVar.J0, taaVar.getContext(), true, false);
            if (z) {
                a8Var.setTextColor(bkb.v0(bkb.dh, taaVar.J0));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(a8Var, nme.o(-1, 48));
            a8Var.j(k96.M0(2131745139, null), 0, null);
            taaVar.D2 = true;
            a8Var.setChecked(true);
            final a8 a8Var2 = new a8(1, taaVar.J0, taaVar.getContext(), false, true);
            if (z) {
                a8Var2.setTextColor(bkb.v0(bkb.dh, taaVar.J0));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(a8Var2, nme.o(-1, 48));
            a8Var2.j(k96.M0(2131749116, null), 0, null);
            a8Var2.setChecked(!taaVar.D2);
            a8Var.setOnClickListener(new View.OnClickListener() { // from class: s9a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    byte b4 = b;
                    a8 a8Var3 = a8Var2;
                    a8 a8Var4 = a8Var;
                    taa taaVar2 = taaVar;
                    switch (b4) {
                        case 0:
                            taaVar2.D2 = true;
                            a8Var4.setChecked(true);
                            a8Var3.setChecked(!taaVar2.D2);
                            break;
                        default:
                            taaVar2.D2 = false;
                            a8Var4.setChecked(false);
                            a8Var3.setChecked(!taaVar2.D2);
                            break;
                    }
                }
            });
            a8Var2.setOnClickListener(new View.OnClickListener() { // from class: s9a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    byte b4 = b2;
                    a8 a8Var3 = a8Var2;
                    a8 a8Var4 = a8Var;
                    taa taaVar2 = taaVar;
                    switch (b4) {
                        case 0:
                            taaVar2.D2 = true;
                            a8Var4.setChecked(true);
                            a8Var3.setChecked(!taaVar2.D2);
                            break;
                        default:
                            taaVar2.D2 = false;
                            a8Var4.setChecked(false);
                            a8Var3.setChecked(!taaVar2.D2);
                            break;
                    }
                }
            });
            taa.Q0(actionBarPopupWindow$ActionBarPopupWindowLayout, bkb.H5, taaVar.J0);
            linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, nme.k(0.0f, 0.0f, 0.0f, -8.0f, -1, -2));
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, taaVar.J0);
        if (z) {
            zkb.h(bkb.Vg, null, actionBarPopupWindow$ActionBarPopupWindowLayout2);
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setOnTouchListener(new daa(taaVar, (byte) 1));
        byte b4 = 3;
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new p9a(taaVar, b4));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setShownFromBottom(false);
        a8 a8Var3 = new a8(0, taaVar.J0, taaVar.getContext(), true, true);
        if (z) {
            a8Var3.setTextColor(bkb.v0(bkb.dh, taaVar.J0));
            a8Var3.setIconColor(bkb.v0(bkb.G6, taaVar.J0));
        }
        a8Var3.j(k96.M0(2131745391, null), R.drawable.input_notify_off, null);
        a8Var3.setMinimumWidth(gl.L(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(a8Var3, nme.o(-1, 48));
        a8Var3.setOnClickListener(new o9a(taaVar, b3));
        a8 a8Var4 = new a8(0, taaVar.J0, taaVar.getContext(), true, true);
        if (z) {
            a8Var4.setTextColor(bkb.v0(bkb.dh, taaVar.J0));
            a8Var4.setIconColor(bkb.v0(bkb.G6, taaVar.J0));
        }
        a8Var4.j(k96.M0(2131745409, null), R.drawable.msg_send, null);
        a8Var4.setMinimumWidth(gl.L(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(a8Var4, nme.o(-1, 48));
        a8Var4.setOnClickListener(new o9a(taaVar, b4));
        taa.Q0(actionBarPopupWindow$ActionBarPopupWindowLayout2, bkb.H5, taaVar.J0);
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, nme.o(-1, -2));
        m8 m8Var = new m8(linearLayout, -2, -2);
        taaVar.E2 = m8Var;
        m8Var.b = false;
        m8Var.setAnimationStyle(R.style.PopupContextAnimation2);
        taaVar.E2.setOutsideTouchable(true);
        taaVar.E2.setClippingEnabled(true);
        taaVar.E2.setInputMethodMode(2);
        taaVar.E2.setSoftInputMode(0);
        taaVar.E2.getContentView().setFocusableInTouchMode(true);
        boolean z2 = gba.a;
        SharedPreferences.Editor edit = na7.c1().edit();
        edit.putInt("scheduledOrNoSoundHintShows", 3);
        edit.apply();
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), TLObject.FLAG_31));
        taaVar.E2.setFocusable(true);
        int[] iArr = new int[2];
        jh3Var.getLocationInWindow(iArr);
        taaVar.E2.showAtLocation(jh3Var, 51, gl.L(8.0f) + ((jh3Var.getMeasuredWidth() + iArr[0]) - linearLayout.getMeasuredWidth()), (!taaVar.d || (mu1Var = taaVar.a2) == null || mu1Var.m1.getMeasuredHeight() <= gl.L(58.0f)) ? (iArr[1] - linearLayout.getMeasuredHeight()) - gl.L(2.0f) : jh3Var.getMeasuredHeight() + iArr[1]);
        taaVar.E2.b();
        try {
            jh3Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:193:0x0439, code lost:
    
        if (((bm6) r10).g == null) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0445, code lost:
    
        if (r12.b() != false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0457, code lost:
    
        if (r11.isEmpty() != false) goto L205;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x048b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0494 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x04b9  */
    /* JADX WARN: Type inference failed for: r1v66, types: [cs5] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v38, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v39, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v42, types: [java.util.Collection] */
    @Override // android.view.View.OnLongClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onLongClick(View view) {
        ?? r8;
        int backgroundColor;
        WebBackForwardList webBackForwardList;
        TLRPC.User V1;
        boolean b;
        boolean z;
        boolean z2;
        cs5 G;
        o98 o98Var;
        boolean z3;
        boolean lambda$show$8;
        byte b2 = this.a;
        Object obj = this.b;
        byte b3 = 0;
        byte b4 = 1;
        switch (b2) {
            case 0:
                final o oVar = (o) obj;
                ArrayList arrayList = oVar.e0;
                if (oVar.v0[0] != null) {
                    float f = oVar.i0.N.d;
                    sw swVar = oVar.L;
                    cs5 G2 = cs5.G(swVar != null ? swVar.c : oVar.g0, null, view);
                    if (gba.s0) {
                        r8 = 0;
                        backgroundColor = bkb.w0(null, bkb.Fl, false);
                    } else {
                        r8 = 0;
                        backgroundColor = oVar.v0[0].getBackgroundColor();
                    }
                    int w0 = gba.s0 ? bkb.w0(null, bkb.F6, r8) : gl.B(oVar.v0[r8].getBackgroundColor()) >= 0.721f ? -16777216 : -1;
                    int p1 = bkb.p1(0.65f, w0);
                    cv0 webView = oVar.v0[r8].getWebView();
                    if (webView != null) {
                        WebBackForwardList copyBackForwardList = webView.copyBackForwardList();
                        int currentIndex = copyBackForwardList.getCurrentIndex();
                        if (copyBackForwardList.getCurrentIndex() > 0) {
                            int i = 0;
                            while (i < currentIndex) {
                                WebHistoryItem itemAtIndex = copyBackForwardList.getItemAtIndex(i);
                                G2.b(0, itemAtIndex.getTitle(), new bt(currentIndex, i, (Object) webView, (byte) 0), false);
                                a8 z4 = G2.z();
                                if (z4 != null) {
                                    z4.setSubtext(itemAtIndex.getUrl());
                                    Bitmap bitmap = (Bitmap) webView.Q.get(itemAtIndex.getUrl());
                                    if (bitmap == null) {
                                        bitmap = itemAtIndex.getFavicon();
                                    }
                                    webBackForwardList = copyBackForwardList;
                                    z4.j(itemAtIndex.getTitle(), 0, new xt(bitmap, new Paint(3), (byte) 0));
                                    z4.setTextColor(w0);
                                    z4.setSubtextColor(p1);
                                } else {
                                    webBackForwardList = copyBackForwardList;
                                }
                                i++;
                                copyBackForwardList = webBackForwardList;
                            }
                        }
                    }
                    for (final int size = arrayList.size() - 2; size >= 0; size--) {
                        Object obj2 = arrayList.get(size);
                        if (obj2 instanceof zv) {
                            zv zvVar = (zv) obj2;
                            final byte b5 = 0;
                            G2.b(0, zvVar.b(), new Runnable() { // from class: ct
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b6 = b5;
                                    int i2 = size;
                                    o oVar2 = oVar;
                                    switch (b6) {
                                        case 0:
                                            oVar2.E(i2);
                                            break;
                                        default:
                                            oVar2.E(i2);
                                            break;
                                    }
                                }
                            }, false);
                            a8 z5 = G2.z();
                            if (z5 != null) {
                                z5.setSubtext(zvVar.x);
                                Bitmap bitmap2 = webView != null ? (Bitmap) webView.Q.get(zvVar.x) : null;
                                if (bitmap2 == null) {
                                    bitmap2 = zvVar.F;
                                }
                                z5.j(zvVar.b(), 0, new xt(bitmap2, new Paint(3), (byte) 1));
                                z5.setTextColor(w0);
                                z5.setSubtextColor(p1);
                                z5.d(w0, w0);
                            }
                        } else if (obj2 instanceof TLRPC.WebPage) {
                            TLRPC.WebPage webPage = (TLRPC.WebPage) obj2;
                            final byte b6 = 1;
                            G2.b(0, webPage.title, new Runnable() { // from class: ct
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b62 = b6;
                                    int i2 = size;
                                    o oVar2 = oVar;
                                    switch (b62) {
                                        case 0:
                                            oVar2.E(i2);
                                            break;
                                        default:
                                            oVar2.E(i2);
                                            break;
                                    }
                                }
                            }, false);
                            a8 z6 = G2.z();
                            if (z6 != null) {
                                ry8 ry8Var = z6.c;
                                z6.j(webPage.title, R.drawable.msg_instant, null);
                                z6.setTextColor(w0);
                                if (!TextUtils.isEmpty(webPage.site_name)) {
                                    z6.setSubtext(webPage.site_name);
                                }
                                z6.setSubtextColor(p1);
                                ry8Var.getLayoutParams().width = gl.L(24.0f);
                                ry8Var.setScaleX(1.45f);
                                ry8Var.setScaleY(1.45f);
                                z6.d(w0, w0);
                            }
                        }
                    }
                    G2.X(bkb.K(gl.L(40.0f), oVar.i0.getBackgroundColor()));
                    G2.Q(backgroundColor);
                    if (G2.y() > 0) {
                        oVar.j(new dt(oVar, G2, f, (byte) 0));
                        return true;
                    }
                }
                return false;
            case 1:
                y71 y71Var = (y71) obj;
                b81 b81Var = y71Var.y;
                if (y71Var.n == null) {
                    return false;
                }
                int i2 = -1;
                int i3 = -1;
                for (int i4 = 0; i4 < y71Var.d; i4++) {
                    z71 z71Var = (z71) y71Var.n.get(i4, null);
                    if (z71Var != null) {
                        if (i3 == -1) {
                            i3 = z71Var.h;
                        }
                        i2 = z71Var.h;
                    }
                }
                if (i3 < 0 || i2 < 0) {
                    return false;
                }
                b81Var.H = true;
                b81Var.Q = i3;
                b81Var.R = i2;
                b81Var.A0();
                b81Var.r0();
                return false;
            case 2:
                yr1 yr1Var = (yr1) obj;
                mu1 mu1Var = yr1Var.c;
                if (gl.O1() || (mu1Var.Y7() && !l7c.u(mu1Var.f))) {
                    return false;
                }
                yr1Var.b = yr1Var.a;
                mu1Var.la(true);
                return true;
            case 3:
                ((b33) obj).c.callOnClick();
                return true;
            case 4:
                final FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.W0;
                final float x = MediaController.w().x(fragmentContextView.W);
                fragmentContextView.I.e(false, x);
                v7 v7Var = fragmentContextView.I;
                int i5 = bkb.F8;
                zkb.h(i5, fragmentContextView.q0, v7Var);
                v7 v7Var2 = fragmentContextView.I;
                v7Var2.O = fragmentContextView.h instanceof mu1;
                v7Var2.G.setShader(null);
                v7Var2.h = null;
                Bitmap bitmap3 = v7Var2.f;
                if (bitmap3 != null) {
                    bitmap3.recycle();
                    v7Var2.f = null;
                }
                fragmentContextView.G.I(bkb.w0(null, i5, false));
                fragmentContextView.G.V();
                fragmentContextView.q(false);
                fragmentContextView.G.setDimMenu(0.3f);
                fragmentContextView.G.U(fragmentContextView.I, null);
                fragmentContextView.G.setOnMenuDismiss(new p8c() { // from class: in4
                    @Override // p8c
                    public final void a(Object obj3) {
                        float[] fArr2 = FragmentContextView.W0;
                        if (((Boolean) obj3).booleanValue()) {
                            return;
                        }
                        MediaController w = MediaController.w();
                        FragmentContextView fragmentContextView2 = FragmentContextView.this;
                        fragmentContextView2.l(x, w.x(fragmentContextView2.W), false);
                    }
                });
                na7.d1().edit().putInt("speedhint", -15).apply();
                return true;
            case 5:
                rw5 rw5Var = (rw5) obj;
                int i6 = rw5Var.F1;
                if (rw5Var.I1 != null) {
                    k38 e = k38.e(i6);
                    e.k = !e.k;
                    e.a.edit().putBoolean("fill_shapes", e.k).apply();
                    boolean z7 = k38.e(i6).k;
                    for (int i7 = 0; i7 < rw5Var.I1.getItemsCount(); i7++) {
                        View childAt = rw5Var.I1.M.getChildAt(i7);
                        if (childAt instanceof pw5) {
                            l01 l01Var = (l01) l01.c.get(i7);
                            ((pw5) childAt).a(z7 ? l01Var.l() : l01Var.d(), z7, true);
                        }
                    }
                }
                return true;
            case 6:
                wt7 wt7Var = (wt7) obj;
                int i8 = wt7Var.v1;
                if (wt7Var.y1 != null) {
                    k38 e2 = k38.e(i8);
                    e2.k = !e2.k;
                    e2.a.edit().putBoolean("fill_shapes", e2.k).apply();
                    boolean z8 = k38.e(i8).k;
                    for (int i9 = 0; i9 < wt7Var.y1.getItemsCount(); i9++) {
                        View childAt2 = wt7Var.y1.M.getChildAt(i9);
                        if (childAt2 instanceof ut7) {
                            l01 l01Var2 = (l01) l01.c.get(i9);
                            ((ut7) childAt2).a(z8 ? l01Var2.l() : l01Var2.d(), z8, true);
                        }
                    }
                }
                return true;
            case 7:
                yv7 yv7Var = (yv7) obj;
                yv7Var.r.setText("");
                yv7Var.s.b(true);
                Drawable drawable = yv7Var.a;
                if (drawable instanceof ye7) {
                    ((ye7) drawable).w();
                }
                return true;
            case 8:
                g48 g48Var = (g48) obj;
                mu1 mu1Var2 = g48Var.G;
                if (mu1Var2 == null || g48Var.H == 1) {
                    return false;
                }
                TLRPC.User h = mu1Var2.h();
                if (g48Var.K == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(g48Var.getParentActivity(), null);
                    g48Var.K = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
                    g48Var.K.setOnTouchListener(new yw1(g48Var));
                    g48Var.K.setDispatchKeyEventListener(new c48(g48Var, b4));
                    g48Var.K.setShownFromBottom(false);
                    g48Var.L = new a8[2];
                    int i10 = 0;
                    for (int i11 = 2; i10 < i11; i11 = 2) {
                        if ((i10 != 0 || mu1Var2.G4()) && (i10 != 1 || !l7c.C(h))) {
                            g48Var.L[i10] = new a8(g48Var.getParentActivity(), i10 == 0, i10 == 1);
                            a8[] a8VarArr = g48Var.L;
                            if (i10 != 0) {
                                a8VarArr[i10].j(k96.M0(2131745391, null), R.drawable.input_notify_off, null);
                            } else if (l7c.C(h)) {
                                a8VarArr[i10].j(k96.M0(2131745322, null), R.drawable.msg_calendar2, null);
                            } else {
                                a8VarArr[i10].j(k96.M0(2131745667, null), R.drawable.msg_calendar2, null);
                            }
                            g48Var.L[i10].setMinimumWidth(gl.L(196.0f));
                            g48Var.K.a(g48Var.L[i10], nme.o(-1, 48));
                            g48Var.L[i10].setOnClickListener(new v0(g48Var, i10, (byte) 13));
                        }
                        i10++;
                    }
                    g48Var.K.setupRadialSelectors(bkb.w0(null, bkb.H5, false));
                    m8 m8Var = new m8(g48Var.K, -2, -2);
                    g48Var.J = m8Var;
                    m8Var.b = false;
                    m8Var.setAnimationStyle(R.style.PopupContextAnimation2);
                    g48Var.J.setOutsideTouchable(true);
                    g48Var.J.setClippingEnabled(true);
                    g48Var.J.setInputMethodMode(2);
                    g48Var.J.setSoftInputMode(0);
                    g48Var.J.getContentView().setFocusableInTouchMode(true);
                }
                g48Var.K.measure(View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), TLObject.FLAG_31));
                g48Var.J.setFocusable(true);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                g48Var.J.showAtLocation(view, 51, gl.L(8.0f) + ((view.getMeasuredWidth() + iArr[0]) - g48Var.K.getMeasuredWidth()), (iArr[1] - g48Var.K.getMeasuredHeight()) - gl.L(2.0f));
                g48Var.J.b();
                try {
                    view.performHapticFeedback(3, 2);
                    return false;
                } catch (Exception unused) {
                    return false;
                }
            case 9:
                u58 u58Var = (u58) obj;
                mu1 mu1Var3 = u58Var.V;
                if (mu1Var3 == null || u58Var.I == 1) {
                    return false;
                }
                TLRPC.User h2 = mu1Var3.h();
                if (u58Var.o0 == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(u58Var.getParentActivity(), null);
                    u58Var.o0 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
                    u58Var.o0.setOnTouchListener(new yw1(u58Var));
                    u58Var.o0.setDispatchKeyEventListener(new m58(u58Var, (byte) 4));
                    u58Var.o0.setShownFromBottom(false);
                    u58Var.p0 = new a8[2];
                    int i12 = 0;
                    for (int i13 = 2; i12 < i13; i13 = 2) {
                        if ((i12 != 0 || mu1Var3.G4()) && (i12 != 1 || !l7c.C(h2))) {
                            u58Var.p0[i12] = new a8(u58Var.getParentActivity(), i12 == 0, i12 == 1);
                            a8[] a8VarArr2 = u58Var.p0;
                            if (i12 != 0) {
                                a8VarArr2[i12].j(k96.M0(2131745391, null), R.drawable.input_notify_off, null);
                            } else if (l7c.C(h2)) {
                                a8VarArr2[i12].j(k96.M0(2131745322, null), R.drawable.msg_calendar2, null);
                            } else {
                                a8VarArr2[i12].j(k96.M0(2131745667, null), R.drawable.msg_calendar2, null);
                            }
                            u58Var.p0[i12].setMinimumWidth(gl.L(196.0f));
                            u58Var.o0.a(u58Var.p0[i12], nme.o(-1, 48));
                            u58Var.p0[i12].setOnClickListener(new v0(u58Var, i12, (byte) 14));
                        }
                        i12++;
                    }
                    u58Var.o0.setupRadialSelectors(bkb.w0(null, u58Var.x0, false));
                    m8 m8Var2 = new m8(u58Var.o0, -2, -2);
                    u58Var.n0 = m8Var2;
                    m8Var2.b = false;
                    m8Var2.setAnimationStyle(R.style.PopupContextAnimation2);
                    u58Var.n0.setOutsideTouchable(true);
                    u58Var.n0.setClippingEnabled(true);
                    u58Var.n0.setInputMethodMode(2);
                    u58Var.n0.setSoftInputMode(0);
                    u58Var.n0.getContentView().setFocusableInTouchMode(true);
                }
                u58Var.o0.measure(View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), TLObject.FLAG_31));
                u58Var.n0.setFocusable(true);
                int[] iArr2 = new int[2];
                view.getLocationInWindow(iArr2);
                u58Var.n0.showAtLocation(view, 51, gl.L(8.0f) + ((view.getMeasuredWidth() + iArr2[0]) - u58Var.o0.getMeasuredWidth()), (iArr2[1] - u58Var.o0.getMeasuredHeight()) - gl.L(2.0f));
                u58Var.n0.b();
                try {
                    view.performHapticFeedback(3, 2);
                    return false;
                } catch (Exception unused2) {
                    return false;
                }
            case 10:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.f9;
                o98 o98Var2 = photoViewer.d;
                if ((o98Var2 == null || o98Var2.U()) && photoViewer.d2 != 11) {
                    d dVar = photoViewer.m4;
                    boolean z9 = (dVar == null || dVar.getLastStoryViewer() == null) ? false : true;
                    mu1 mu1Var4 = photoViewer.l4;
                    if ((mu1Var4 == null || !mu1Var4.N7()) && ((photoViewer.l4 != null || z9 || photoViewer.d != null) && !photoViewer.V1.o())) {
                        mu1 mu1Var5 = photoViewer.l4;
                        if (mu1Var5 != null) {
                            V1 = mu1Var5.h();
                            b = photoViewer.l4.G4();
                        } else {
                            o98 o98Var3 = photoViewer.d;
                            if (o98Var3 != null) {
                                long a = o98Var3.a();
                                V1 = a != 0 ? na7.q1(photoViewer.U).V1(Long.valueOf(a)) : null;
                                b = photoViewer.d.b();
                            }
                        }
                        o98 o98Var4 = photoViewer.d;
                        boolean z10 = o98Var4 != null && o98Var4.o();
                        o98 o98Var5 = photoViewer.d;
                        boolean z11 = o98Var5 != null && o98Var5.q();
                        boolean C = l7c.C(V1);
                        o98 o98Var6 = photoViewer.d;
                        if (o98Var6 != null && o98Var6.u() != null) {
                            Iterator it = photoViewer.d.u().entrySet().iterator();
                            while (it.hasNext()) {
                                Object value = ((Map.Entry) it.next()).getValue();
                                if (!(value instanceof jm6)) {
                                    z = (value instanceof nm6) && ((nm6) value).x != 0;
                                } else if (((jm6) value).x != 0) {
                                }
                                if (!z10) {
                                    y78 y78Var = photoViewer.V1;
                                    if ((!y78Var.U0 || y78Var.b1 <= 0) && ((o98Var = photoViewer.d) == null || o98Var.H())) {
                                        ?? r82 = photoViewer.g7;
                                        int i14 = photoViewer.P4;
                                        Object obj3 = (i14 < 0 || i14 >= r82.size()) ? null : r82.get(photoViewer.P4);
                                        if (photoViewer.s1) {
                                            h98 h98Var = photoViewer.X4;
                                            if (!photoViewer.r) {
                                                if (photoViewer.u8 <= 0.0f) {
                                                    if (photoViewer.v8 >= 1.0f) {
                                                        if (obj3 instanceof bm6) {
                                                            break;
                                                        }
                                                        if (h98Var != null) {
                                                            zl6 zl6Var = h98Var.c;
                                                            if (zl6Var != null) {
                                                                break;
                                                            }
                                                            if (h98Var.d == null) {
                                                                if (h98Var.a == null) {
                                                                    ArrayList arrayList2 = h98Var.e;
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
                                        o98 o98Var7 = photoViewer.d;
                                        HashMap u = o98Var7 != null ? o98Var7.u() : null;
                                        if (u != null) {
                                            r82 = u.values();
                                        }
                                        for (Object obj4 : r82) {
                                            if (obj4 == obj3 || !(obj4 instanceof bm6) || !((bm6) obj4).b()) {
                                            }
                                        }
                                        z2 = true;
                                        boolean z12 = z10 && b && !z;
                                        boolean z13 = (z10 || !z11) && !C;
                                        o98 o98Var8 = photoViewer.d;
                                        boolean z14 = o98Var8 == null && o98Var8.G() > 1;
                                        G = cs5.G(photoViewer.f0, new f53(), view);
                                        G.k(R.drawable.msg_sendfile, k96.M0(z14 ? 2131745443 : 2131745444, null), new l68(photoViewer, (byte) 28), z2);
                                        G.k(R.drawable.msg_send, k96.M0(2131745442, null), new l68(photoViewer, (byte) 29), z11);
                                        G.k(R.drawable.msg_replace, k96.M0(2131746076, null), new y68(photoViewer, (byte) 0), z11);
                                        G.k(R.drawable.msg_calendar2, k96.M0(C ? 2131745322 : 2131745667, null), new y68(photoViewer, b4), z12);
                                        G.k(R.drawable.input_notify_off, k96.M0(2131745391, null), new y68(photoViewer, (byte) 2), z13);
                                        if (G.y() != 0) {
                                            G.W(5);
                                            G.a0();
                                            return true;
                                        }
                                    }
                                }
                                z2 = false;
                                if (z10) {
                                }
                                if (z10) {
                                }
                                o98 o98Var82 = photoViewer.d;
                                if (o98Var82 == null) {
                                }
                                G = cs5.G(photoViewer.f0, new f53(), view);
                                G.k(R.drawable.msg_sendfile, k96.M0(z14 ? 2131745443 : 2131745444, null), new l68(photoViewer, (byte) 28), z2);
                                G.k(R.drawable.msg_send, k96.M0(2131745442, null), new l68(photoViewer, (byte) 29), z11);
                                G.k(R.drawable.msg_replace, k96.M0(2131746076, null), new y68(photoViewer, (byte) 0), z11);
                                G.k(R.drawable.msg_calendar2, k96.M0(C ? 2131745322 : 2131745667, null), new y68(photoViewer, b4), z12);
                                G.k(R.drawable.input_notify_off, k96.M0(2131745391, null), new y68(photoViewer, (byte) 2), z13);
                                if (G.y() != 0) {
                                }
                            }
                        }
                        if (!z10) {
                        }
                        z2 = false;
                        if (z10) {
                        }
                        if (z10) {
                        }
                        o98 o98Var822 = photoViewer.d;
                        if (o98Var822 == null) {
                        }
                        G = cs5.G(photoViewer.f0, new f53(), view);
                        G.k(R.drawable.msg_sendfile, k96.M0(z14 ? 2131745443 : 2131745444, null), new l68(photoViewer, (byte) 28), z2);
                        G.k(R.drawable.msg_send, k96.M0(2131745442, null), new l68(photoViewer, (byte) 29), z11);
                        G.k(R.drawable.msg_replace, k96.M0(2131746076, null), new y68(photoViewer, (byte) 0), z11);
                        G.k(R.drawable.msg_calendar2, k96.M0(C ? 2131745322 : 2131745667, null), new y68(photoViewer, b4), z12);
                        G.k(R.drawable.input_notify_off, k96.M0(2131745391, null), new y68(photoViewer, (byte) 2), z13);
                        if (G.y() != 0) {
                        }
                    }
                }
                return false;
            case 11:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.Z6;
                if (profileActivity.K2 != null || profileActivity.q1) {
                    return false;
                }
                profileActivity.Z2(false);
                return false;
            case 12:
                return ((mc9) obj).length() != 0;
            case 13:
                return ((hd9) obj).o0(view);
            case 14:
                e72 e72Var = ((a72) obj).a;
                df9 df9Var = e72Var.s;
                wjb wjbVar = e72Var.a;
                x02 x02Var = e72Var.b;
                ye9 ye9Var = e72Var.r;
                int i15 = e72Var.n;
                if (!y6c.h(i15).p()) {
                    new jh8(x02Var.Z1, e72Var.getContext(), e72Var.n, 43, true).show();
                } else {
                    if (!ye9Var.g3() || ye9Var.i3()) {
                        return false;
                    }
                    if (!ye9Var.I3()) {
                        if (df9Var == null) {
                            return false;
                        }
                        df9Var.setSendEnabled(ye9Var.I3());
                        return false;
                    }
                    ArrayList<TL_iv.PageBlock> V2 = ye9Var.V2();
                    if (V2.isEmpty()) {
                        return false;
                    }
                    d dVar2 = x02Var.Z1;
                    mu1 mu1Var6 = dVar2 instanceof mu1 ? (mu1) dVar2 : null;
                    j47 j47Var = e72Var.P;
                    if (j47Var != null) {
                        j47Var.f(false);
                        e72Var.P = null;
                    }
                    j47 j47Var2 = new j47(e72Var.getContext(), wjbVar);
                    e72Var.P = j47Var2;
                    j47Var2.setOnDismissListener(new n1(e72Var, (byte) 16));
                    long V0 = x02Var.V0();
                    k27 k27Var = mu1Var6 != null ? mu1Var6.F5 : null;
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.id = 0;
                    tL_message.out = true;
                    tL_message.peer_id = na7.q1(i15).w1(V0);
                    mu1 mu1Var7 = mu1Var6;
                    tL_message.from_id = na7.q1(i15).w1(y6c.h(i15).e());
                    tL_message.flags2 |= TLObject.FLAG_13;
                    TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                    tL_message.rich_message = richMessage;
                    richMessage.blocks = V2;
                    richMessage.photos = ye9Var.x2();
                    tL_message.rich_message.documents = ye9Var.u2();
                    if (k27Var != null && !k27Var.p) {
                        TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                        tL_messageReplyHeader.flags |= 16;
                        tL_messageReplyHeader.reply_to_msg_id = k27Var.e1();
                        tL_message.reply_to = tL_messageReplyHeader;
                    }
                    k27 k27Var2 = new k27(i15, tL_message, false, false);
                    if (k27Var != null && !k27Var.p) {
                        k27Var2.C = k27Var;
                    }
                    k27Var2.B0 = true;
                    k27Var2.W2 = Boolean.TRUE;
                    k27Var2.n0(null);
                    k27Var2.w1 = true;
                    e72Var.P.r(tb4.t(k27Var2));
                    ky1 sendButton = df9Var.getSendButton();
                    sendButton.setScaleX(1.0f);
                    sendButton.setScaleY(1.0f);
                    ky1 s = e72Var.P.s(sendButton, true, new x91(e72Var, (byte) 10));
                    if (s != null) {
                        s.setBackground(new gd9(bkb.b0(gl.L(22.0f), bkb.v0(bkb.Ei, wjbVar))));
                        j47 j47Var3 = e72Var.P;
                        int L = gl.L(44.0f);
                        j47Var3.p0 = true;
                        j47Var3.Y = L;
                    }
                    cs5 G3 = cs5.G(e72Var, wjbVar, sendButton);
                    boolean z15 = mu1Var7 != null && l7c.C(mu1Var7.h());
                    if (mu1Var7 == null || !mu1Var7.G4()) {
                        z3 = false;
                    } else {
                        z3 = false;
                        z3 = false;
                        z3 = false;
                        G3.b(R.drawable.msg_calendar2, k96.M0(z15 ? 2131745322 : 2131745667, null), new et((Object) e72Var, V0, (byte) 8), false);
                        if (!z15 && V0 > 0) {
                            G3.b(R.drawable.msg_online, k96.M0(2131745394, null), new t62(e72Var, z3 ? (byte) 1 : (byte) 0), false);
                        }
                    }
                    if (!z15) {
                        G3.b(R.drawable.input_notify_off, k96.M0(2131745391, null), new t62(e72Var, b4), z3);
                    }
                    G3.Z();
                    e72Var.P.q(G3);
                    e72Var.P.show();
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused3) {
                    }
                }
                return true;
            case 15:
                tx9 tx9Var = (tx9) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, null, tx9Var.getContext());
                String M0 = k96.M0(2131752058, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M0;
                hdVar.U = k96.M0(2131752059, null);
                alertDialog$Builder.j(k96.M0(2131752089, null), new xv9(tx9Var));
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                hdVar.Q0 = false;
                alertDialog$Builder.i(new ph8(tx9Var, (byte) 6));
                alertDialog$Builder.o();
                tx9Var.w(1.0f);
                try {
                    tx9Var.performHapticFeedback(0, 1);
                } catch (Exception unused4) {
                }
                return true;
            case 16:
                return a(view);
            case 17:
                rfa rfaVar = (rfa) obj;
                if (rfaVar.d == null) {
                    return false;
                }
                int intValue = ((Integer) view.getTag()).intValue();
                pfa pfaVar = rfaVar.d;
                int i16 = rfaVar.c[intValue];
                k27 k27Var3 = rfaVar.b[intValue];
                gi3 gi3Var = (gi3) pfaVar;
                af4 af4Var = ((ye4) gi3Var.a).d;
                if (af4Var.p0.t()) {
                    af4 af4Var2 = ((ye4) gi3Var.a).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = af4.t0;
                    af4Var2.e(i16, rfaVar, k27Var3, intValue);
                } else {
                    af4Var.f(k27Var3, rfaVar, intValue);
                }
                return true;
            case 18:
                t7b t7bVar = (t7b) obj;
                Activity activity = t7bVar.b;
                y6b y6bVar = t7bVar.C0;
                if (y6bVar == null || !y6bVar.isFrontface()) {
                    return false;
                }
                t7bVar.m();
                t7bVar.F0.setSelected(true);
                t7bVar.s.e(0.85f, 240L, null);
                ?? G4 = cs5.G(t7bVar.r, t7bVar.a, t7bVar.F0);
                lja ljaVar = new lja(activity, 1);
                ljaVar.c(t7bVar.s.o);
                ljaVar.h = new e6b(t7bVar, b3);
                G4.p(ljaVar);
                G4.n(true);
                lja ljaVar2 = new lja(activity, 2);
                ljaVar2.b = 0.65f;
                ljaVar2.c = 1.0f;
                ljaVar2.c(t7bVar.s.p);
                ljaVar2.h = new e6b(t7bVar, b4);
                G4.p(ljaVar2);
                G4.p = new d6b(t7bVar, b4);
                G4.s = (short) 0;
                G4.W(5);
                G4.b0(gl.L(46.0f), -gl.L(4.0f));
                G4.Q(-1155851493);
                G4.a0();
                return true;
            default:
                lambda$show$8 = VideoAds.lambda$show$8((TLRPC.TL_sponsoredMessage) obj, view);
                return lambda$show$8;
        }
    }
}
