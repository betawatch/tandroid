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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.o;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zs implements View.OnLongClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zs(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final boolean a(View view) {
        zu1 zu1Var;
        final kea keaVar = (kea) this.b;
        di3 di3Var = keaVar.o1;
        boolean z = keaVar.c2;
        Activity activity = keaVar.b2;
        final byte b = 0;
        if (activity == null) {
            return false;
        }
        LinearLayout linearLayout = new LinearLayout(keaVar.getContext());
        final byte b2 = 1;
        linearLayout.setOrientation(1);
        byte b3 = 2;
        if (keaVar.I1 != null) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, keaVar.J0);
            if (z) {
                yob.h(aob.Wg, keaVar.J0, actionBarPopupWindow$ActionBarPopupWindowLayout);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new uda(keaVar, (byte) 0));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new gda(keaVar, b3));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
            final b8 b8Var = new b8(1, keaVar.J0, keaVar.getContext(), true, false);
            if (z) {
                b8Var.setTextColor(aob.v0(aob.eh, keaVar.J0));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(b8Var, tre.o(-1, 48));
            b8Var.j(ob6.M0(2131745059, null), 0, null);
            keaVar.D2 = true;
            b8Var.setChecked(true);
            final b8 b8Var2 = new b8(1, keaVar.J0, keaVar.getContext(), false, true);
            if (z) {
                b8Var2.setTextColor(aob.v0(aob.eh, keaVar.J0));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(b8Var2, tre.o(-1, 48));
            b8Var2.j(ob6.M0(2131749062, null), 0, null);
            b8Var2.setChecked(!keaVar.D2);
            b8Var.setOnClickListener(new View.OnClickListener() { // from class: jda
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    byte b4 = b;
                    b8 b8Var3 = b8Var2;
                    b8 b8Var4 = b8Var;
                    kea keaVar2 = keaVar;
                    switch (b4) {
                        case 0:
                            keaVar2.D2 = true;
                            b8Var4.setChecked(true);
                            b8Var3.setChecked(!keaVar2.D2);
                            break;
                        default:
                            keaVar2.D2 = false;
                            b8Var4.setChecked(false);
                            b8Var3.setChecked(!keaVar2.D2);
                            break;
                    }
                }
            });
            b8Var2.setOnClickListener(new View.OnClickListener() { // from class: jda
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    byte b4 = b2;
                    b8 b8Var3 = b8Var2;
                    b8 b8Var4 = b8Var;
                    kea keaVar2 = keaVar;
                    switch (b4) {
                        case 0:
                            keaVar2.D2 = true;
                            b8Var4.setChecked(true);
                            b8Var3.setChecked(!keaVar2.D2);
                            break;
                        default:
                            keaVar2.D2 = false;
                            b8Var4.setChecked(false);
                            b8Var3.setChecked(!keaVar2.D2);
                            break;
                    }
                }
            });
            kea.R0(actionBarPopupWindow$ActionBarPopupWindowLayout, aob.I5, keaVar.J0);
            linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, tre.k(0.0f, 0.0f, 0.0f, -8.0f, -1, -2));
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, keaVar.J0);
        if (z) {
            yob.h(aob.Wg, null, actionBarPopupWindow$ActionBarPopupWindowLayout2);
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setOnTouchListener(new uda(keaVar, (byte) 1));
        byte b4 = 3;
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new gda(keaVar, b4));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setShownFromBottom(false);
        b8 b8Var3 = new b8(0, keaVar.J0, keaVar.getContext(), true, true);
        if (z) {
            b8Var3.setTextColor(aob.v0(aob.eh, keaVar.J0));
            b8Var3.setIconColor(aob.v0(aob.H6, keaVar.J0));
        }
        b8Var3.j(ob6.M0(2131745311, null), R.drawable.input_notify_off, null);
        b8Var3.setMinimumWidth(hl.L(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(b8Var3, tre.o(-1, 48));
        b8Var3.setOnClickListener(new fda(keaVar, b3));
        b8 b8Var4 = new b8(0, keaVar.J0, keaVar.getContext(), true, true);
        if (z) {
            b8Var4.setTextColor(aob.v0(aob.eh, keaVar.J0));
            b8Var4.setIconColor(aob.v0(aob.H6, keaVar.J0));
        }
        b8Var4.j(ob6.M0(2131745329, null), R.drawable.msg_send, null);
        b8Var4.setMinimumWidth(hl.L(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(b8Var4, tre.o(-1, 48));
        b8Var4.setOnClickListener(new fda(keaVar, b4));
        kea.R0(actionBarPopupWindow$ActionBarPopupWindowLayout2, aob.I5, keaVar.J0);
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, tre.o(-1, -2));
        n8 n8Var = new n8(linearLayout, -2, -2);
        keaVar.E2 = n8Var;
        n8Var.b = false;
        n8Var.setAnimationStyle(R.style.PopupContextAnimation2);
        keaVar.E2.setOutsideTouchable(true);
        keaVar.E2.setClippingEnabled(true);
        keaVar.E2.setInputMethodMode(2);
        keaVar.E2.setSoftInputMode(0);
        keaVar.E2.getContentView().setFocusableInTouchMode(true);
        boolean z2 = xea.a;
        SharedPreferences.Editor edit = uc7.e1().edit();
        edit.putInt("scheduledOrNoSoundHintShows", 3);
        edit.apply();
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), TLObject.FLAG_31));
        keaVar.E2.setFocusable(true);
        int[] iArr = new int[2];
        di3Var.getLocationInWindow(iArr);
        keaVar.E2.showAtLocation(di3Var, 51, hl.L(8.0f) + ((di3Var.getMeasuredWidth() + iArr[0]) - linearLayout.getMeasuredWidth()), (!keaVar.d || (zu1Var = keaVar.a2) == null || zu1Var.m1.getMeasuredHeight() <= hl.L(58.0f)) ? (iArr[1] - linearLayout.getMeasuredHeight()) - hl.L(2.0f) : di3Var.getMeasuredHeight() + iArr[1]);
        keaVar.E2.b();
        try {
            di3Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:192:0x043e, code lost:
    
        if (((go6) r7).g == null) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x044a, code lost:
    
        if (r12.b() != false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x045c, code lost:
    
        if (r10.isEmpty() != false) goto L206;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0490 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0499 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x04bf  */
    /* JADX WARN: Type inference failed for: r1v66, types: [fu5] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v21, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v24, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean] */
    @Override // android.view.View.OnLongClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onLongClick(View view) {
        ?? r8;
        int backgroundColor;
        WebBackForwardList webBackForwardList;
        TLRPC.User X1;
        boolean b;
        boolean z;
        boolean z2;
        fu5 G;
        ed8 ed8Var;
        boolean z3;
        boolean lambda$show$8;
        byte b2 = this.a;
        byte b3 = 29;
        Object obj = this.b;
        byte b4 = 1;
        switch (b2) {
            case 0:
                final o oVar = (o) obj;
                ArrayList arrayList = oVar.e0;
                if (oVar.v0[0] != null) {
                    float f = oVar.i0.N.d;
                    tw twVar = oVar.L;
                    fu5 G2 = fu5.G(twVar != null ? twVar.c : oVar.g0, null, view);
                    if (xea.s0) {
                        r8 = 0;
                        backgroundColor = aob.w0(null, aob.Gl, false);
                    } else {
                        r8 = 0;
                        backgroundColor = oVar.v0[0].getBackgroundColor();
                    }
                    int w0 = xea.s0 ? aob.w0(null, aob.G6, r8) : hl.B(oVar.v0[r8].getBackgroundColor()) >= 0.721f ? -16777216 : -1;
                    int p1 = aob.p1(0.65f, w0);
                    nv0 webView = oVar.v0[r8].getWebView();
                    if (webView != null) {
                        WebBackForwardList copyBackForwardList = webView.copyBackForwardList();
                        int currentIndex = copyBackForwardList.getCurrentIndex();
                        if (copyBackForwardList.getCurrentIndex() > 0) {
                            int i = 0;
                            while (i < currentIndex) {
                                WebHistoryItem itemAtIndex = copyBackForwardList.getItemAtIndex(i);
                                G2.b(0, itemAtIndex.getTitle(), new bt(currentIndex, i, (Object) webView, (byte) 0), false);
                                b8 z4 = G2.z();
                                if (z4 != null) {
                                    z4.setSubtext(itemAtIndex.getUrl());
                                    Bitmap bitmap = (Bitmap) webView.Q.get(itemAtIndex.getUrl());
                                    if (bitmap == null) {
                                        bitmap = itemAtIndex.getFavicon();
                                    }
                                    webBackForwardList = copyBackForwardList;
                                    z4.j(itemAtIndex.getTitle(), 0, new yt(bitmap, new Paint(3), (byte) 0));
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
                        if (obj2 instanceof aw) {
                            aw awVar = (aw) obj2;
                            final byte b5 = 0;
                            G2.b(0, awVar.b(), new Runnable() { // from class: ct
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
                            b8 z5 = G2.z();
                            if (z5 != null) {
                                z5.setSubtext(awVar.x);
                                Bitmap bitmap2 = webView != null ? (Bitmap) webView.Q.get(awVar.x) : null;
                                if (bitmap2 == null) {
                                    bitmap2 = awVar.F;
                                }
                                z5.j(awVar.b(), 0, new yt(bitmap2, new Paint(3), (byte) 1));
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
                            b8 z6 = G2.z();
                            if (z6 != null) {
                                e29 e29Var = z6.c;
                                z6.j(webPage.title, R.drawable.msg_instant, null);
                                z6.setTextColor(w0);
                                if (!TextUtils.isEmpty(webPage.site_name)) {
                                    z6.setSubtext(webPage.site_name);
                                }
                                z6.setSubtextColor(p1);
                                e29Var.getLayoutParams().width = hl.L(24.0f);
                                e29Var.setScaleX(1.45f);
                                e29Var.setScaleY(1.45f);
                                z6.d(w0, w0);
                            }
                        }
                    }
                    G2.X(aob.K(hl.L(40.0f), oVar.i0.getBackgroundColor()));
                    G2.Q(backgroundColor);
                    if (G2.y() > 0) {
                        oVar.j(new dt(oVar, G2, f, (byte) 0));
                        return true;
                    }
                }
                return false;
            case 1:
                g81 g81Var = (g81) obj;
                j81 j81Var = g81Var.y;
                if (g81Var.n == null) {
                    return false;
                }
                int i2 = -1;
                int i3 = -1;
                for (int i4 = 0; i4 < g81Var.d; i4++) {
                    h81 h81Var = (h81) g81Var.n.get(i4, null);
                    if (h81Var != null) {
                        if (i3 == -1) {
                            i3 = h81Var.h;
                        }
                        i2 = h81Var.h;
                    }
                }
                if (i3 < 0 || i2 < 0) {
                    return false;
                }
                j81Var.H = true;
                j81Var.Q = i3;
                j81Var.R = i2;
                j81Var.B0();
                j81Var.r0();
                return false;
            case 2:
                ms1 ms1Var = (ms1) obj;
                zu1 zu1Var = ms1Var.c;
                if (hl.O1() || (zu1Var.k8() && !lbc.v(zu1Var.f))) {
                    return false;
                }
                ms1Var.b = ms1Var.a;
                zu1Var.ya(true);
                return true;
            case 3:
                ((t33) obj).c.callOnClick();
                return true;
            case 4:
                final FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.W0;
                final float A = MediaController.z().A(fragmentContextView.W);
                fragmentContextView.I.e(false, A);
                w7 w7Var = fragmentContextView.I;
                int i5 = aob.G8;
                yob.h(i5, fragmentContextView.q0, w7Var);
                w7 w7Var2 = fragmentContextView.I;
                w7Var2.O = fragmentContextView.h instanceof zu1;
                w7Var2.G.setShader(null);
                w7Var2.h = null;
                Bitmap bitmap3 = w7Var2.f;
                if (bitmap3 != null) {
                    bitmap3.recycle();
                    w7Var2.f = null;
                }
                fragmentContextView.G.I(aob.w0(null, i5, false));
                fragmentContextView.G.V();
                fragmentContextView.q(false);
                fragmentContextView.G.setDimMenu(0.3f);
                fragmentContextView.G.U(fragmentContextView.I, null);
                fragmentContextView.G.setOnMenuDismiss(new pcc() { // from class: np4
                    @Override // pcc
                    public final void a(Object obj3) {
                        float[] fArr2 = FragmentContextView.W0;
                        if (((Boolean) obj3).booleanValue()) {
                            return;
                        }
                        MediaController z7 = MediaController.z();
                        FragmentContextView fragmentContextView2 = FragmentContextView.this;
                        fragmentContextView2.l(A, z7.A(fragmentContextView2.W), false);
                    }
                });
                uc7.f1().edit().putInt("speedhint", -15).apply();
                return true;
            case 5:
                wy5 wy5Var = (wy5) obj;
                int i6 = wy5Var.z1;
                if (wy5Var.C1 != null) {
                    a78 e = a78.e(i6);
                    e.k = !e.k;
                    e.a.edit().putBoolean("fill_shapes", e.k).apply();
                    boolean z7 = a78.e(i6).k;
                    for (int i7 = 0; i7 < wy5Var.C1.getItemsCount(); i7++) {
                        View childAt = wy5Var.C1.M.getChildAt(i7);
                        if (childAt instanceof uy5) {
                            u01 u01Var = (u01) u01.c.get(i7);
                            ((uy5) childAt).a(z7 ? u01Var.l() : u01Var.d(), z7, true);
                        }
                    }
                }
                return true;
            case 6:
                dx7 dx7Var = (dx7) obj;
                int i8 = dx7Var.p1;
                if (dx7Var.s1 != null) {
                    a78 e2 = a78.e(i8);
                    e2.k = !e2.k;
                    e2.a.edit().putBoolean("fill_shapes", e2.k).apply();
                    boolean z8 = a78.e(i8).k;
                    for (int i9 = 0; i9 < dx7Var.s1.getItemsCount(); i9++) {
                        View childAt2 = dx7Var.s1.M.getChildAt(i9);
                        if (childAt2 instanceof bx7) {
                            u01 u01Var2 = (u01) u01.c.get(i9);
                            ((bx7) childAt2).a(z8 ? u01Var2.l() : u01Var2.d(), z8, true);
                        }
                    }
                }
                return true;
            case 7:
                fz7 fz7Var = (fz7) obj;
                fz7Var.r.setText("");
                fz7Var.s.b(true);
                Drawable drawable = fz7Var.a;
                if (drawable instanceof ih7) {
                    ((ih7) drawable).w();
                }
                return true;
            case 8:
                w78 w78Var = (w78) obj;
                zu1 zu1Var2 = w78Var.G;
                if (zu1Var2 == null || w78Var.H == 1) {
                    return false;
                }
                TLRPC.User h = zu1Var2.h();
                if (w78Var.K == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(w78Var.getParentActivity(), null);
                    w78Var.K = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
                    w78Var.K.setOnTouchListener(new mx1(w78Var));
                    w78Var.K.setDispatchKeyEventListener(new s78(w78Var, b4));
                    w78Var.K.setShownFromBottom(false);
                    w78Var.L = new b8[2];
                    int i10 = 0;
                    for (int i11 = 2; i10 < i11; i11 = 2) {
                        if ((i10 != 0 || zu1Var2.M4()) && (i10 != 1 || !lbc.D(h))) {
                            w78Var.L[i10] = new b8(w78Var.getParentActivity(), i10 == 0, i10 == 1);
                            b8[] b8VarArr = w78Var.L;
                            if (i10 != 0) {
                                b8VarArr[i10].j(ob6.M0(2131745311, null), R.drawable.input_notify_off, null);
                            } else if (lbc.D(h)) {
                                b8VarArr[i10].j(ob6.M0(2131745242, null), R.drawable.msg_calendar2, null);
                            } else {
                                b8VarArr[i10].j(ob6.M0(2131745587, null), R.drawable.msg_calendar2, null);
                            }
                            w78Var.L[i10].setMinimumWidth(hl.L(196.0f));
                            w78Var.K.a(w78Var.L[i10], tre.o(-1, 48));
                            w78Var.L[i10].setOnClickListener(new w0(w78Var, i10, (byte) 14));
                        }
                        i10++;
                    }
                    w78Var.K.setupRadialSelectors(aob.w0(null, aob.I5, false));
                    n8 n8Var = new n8(w78Var.K, -2, -2);
                    w78Var.J = n8Var;
                    n8Var.b = false;
                    n8Var.setAnimationStyle(R.style.PopupContextAnimation2);
                    w78Var.J.setOutsideTouchable(true);
                    w78Var.J.setClippingEnabled(true);
                    w78Var.J.setInputMethodMode(2);
                    w78Var.J.setSoftInputMode(0);
                    w78Var.J.getContentView().setFocusableInTouchMode(true);
                }
                w78Var.K.measure(View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), TLObject.FLAG_31));
                w78Var.J.setFocusable(true);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                w78Var.J.showAtLocation(view, 51, hl.L(8.0f) + ((view.getMeasuredWidth() + iArr[0]) - w78Var.K.getMeasuredWidth()), (iArr[1] - w78Var.K.getMeasuredHeight()) - hl.L(2.0f));
                w78Var.J.b();
                try {
                    view.performHapticFeedback(3, 2);
                    return false;
                } catch (Exception unused) {
                    return false;
                }
            case 9:
                l98 l98Var = (l98) obj;
                zu1 zu1Var3 = l98Var.V;
                if (zu1Var3 == null || l98Var.I == 1) {
                    return false;
                }
                TLRPC.User h2 = zu1Var3.h();
                if (l98Var.o0 == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(l98Var.getParentActivity(), null);
                    l98Var.o0 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
                    l98Var.o0.setOnTouchListener(new mx1(l98Var));
                    l98Var.o0.setDispatchKeyEventListener(new d98(l98Var, (byte) 4));
                    l98Var.o0.setShownFromBottom(false);
                    l98Var.p0 = new b8[2];
                    int i12 = 0;
                    for (int i13 = 2; i12 < i13; i13 = 2) {
                        if ((i12 != 0 || zu1Var3.M4()) && (i12 != 1 || !lbc.D(h2))) {
                            l98Var.p0[i12] = new b8(l98Var.getParentActivity(), i12 == 0, i12 == 1);
                            b8[] b8VarArr2 = l98Var.p0;
                            if (i12 != 0) {
                                b8VarArr2[i12].j(ob6.M0(2131745311, null), R.drawable.input_notify_off, null);
                            } else if (lbc.D(h2)) {
                                b8VarArr2[i12].j(ob6.M0(2131745242, null), R.drawable.msg_calendar2, null);
                            } else {
                                b8VarArr2[i12].j(ob6.M0(2131745587, null), R.drawable.msg_calendar2, null);
                            }
                            l98Var.p0[i12].setMinimumWidth(hl.L(196.0f));
                            l98Var.o0.a(l98Var.p0[i12], tre.o(-1, 48));
                            l98Var.p0[i12].setOnClickListener(new w0(l98Var, i12, (byte) 15));
                        }
                        i12++;
                    }
                    l98Var.o0.setupRadialSelectors(aob.w0(null, l98Var.x0, false));
                    n8 n8Var2 = new n8(l98Var.o0, -2, -2);
                    l98Var.n0 = n8Var2;
                    n8Var2.b = false;
                    n8Var2.setAnimationStyle(R.style.PopupContextAnimation2);
                    l98Var.n0.setOutsideTouchable(true);
                    l98Var.n0.setClippingEnabled(true);
                    l98Var.n0.setInputMethodMode(2);
                    l98Var.n0.setSoftInputMode(0);
                    l98Var.n0.getContentView().setFocusableInTouchMode(true);
                }
                l98Var.o0.measure(View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), TLObject.FLAG_31));
                l98Var.n0.setFocusable(true);
                int[] iArr2 = new int[2];
                view.getLocationInWindow(iArr2);
                l98Var.n0.showAtLocation(view, 51, hl.L(8.0f) + ((view.getMeasuredWidth() + iArr2[0]) - l98Var.o0.getMeasuredWidth()), (iArr2[1] - l98Var.o0.getMeasuredHeight()) - hl.L(2.0f));
                l98Var.n0.b();
                try {
                    view.performHapticFeedback(3, 2);
                    return false;
                } catch (Exception unused2) {
                    return false;
                }
            case 10:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.d9;
                ed8 ed8Var2 = photoViewer.d;
                if ((ed8Var2 == null || ed8Var2.U()) && photoViewer.d2 != 11) {
                    e eVar = photoViewer.l4;
                    boolean z9 = (eVar == null || eVar.getLastStoryViewer() == null) ? false : true;
                    zu1 zu1Var4 = photoViewer.k4;
                    if ((zu1Var4 == null || !zu1Var4.X7()) && ((photoViewer.k4 != null || z9 || photoViewer.d != null) && !photoViewer.V1.o())) {
                        zu1 zu1Var5 = photoViewer.k4;
                        if (zu1Var5 != null) {
                            X1 = zu1Var5.h();
                            b = photoViewer.k4.M4();
                        } else {
                            ed8 ed8Var3 = photoViewer.d;
                            if (ed8Var3 != null) {
                                long a = ed8Var3.a();
                                X1 = a != 0 ? uc7.s1(photoViewer.U).X1(Long.valueOf(a)) : null;
                                b = photoViewer.d.b();
                            }
                        }
                        ed8 ed8Var4 = photoViewer.d;
                        boolean z10 = ed8Var4 != null && ed8Var4.o();
                        ed8 ed8Var5 = photoViewer.d;
                        boolean z11 = ed8Var5 != null && ed8Var5.q();
                        boolean D = lbc.D(X1);
                        ed8 ed8Var6 = photoViewer.d;
                        if (ed8Var6 != null && ed8Var6.u() != null) {
                            Iterator it = photoViewer.d.u().entrySet().iterator();
                            while (it.hasNext()) {
                                Object value = ((Map.Entry) it.next()).getValue();
                                if (!(value instanceof no6)) {
                                    z = (value instanceof ro6) && ((ro6) value).x != 0;
                                } else if (((no6) value).x != 0) {
                                }
                                if (!z10) {
                                    pb8 pb8Var = photoViewer.V1;
                                    if ((!pb8Var.U0 || pb8Var.b1 <= 0) && ((ed8Var = photoViewer.d) == null || ed8Var.H())) {
                                        ?? r6 = photoViewer.f7;
                                        int i14 = photoViewer.O4;
                                        Object obj3 = (i14 < 0 || i14 >= r6.size()) ? null : r6.get(photoViewer.O4);
                                        if (photoViewer.s1) {
                                            xc8 xc8Var = photoViewer.W4;
                                            if (!photoViewer.r) {
                                                if (photoViewer.t8 <= 0.0f) {
                                                    if (photoViewer.u8 >= 1.0f) {
                                                        if (obj3 instanceof go6) {
                                                            break;
                                                        }
                                                        if (xc8Var != null) {
                                                            fo6 fo6Var = xc8Var.c;
                                                            if (fo6Var != null) {
                                                                break;
                                                            }
                                                            if (xc8Var.d == null) {
                                                                if (xc8Var.a == null) {
                                                                    ArrayList arrayList2 = xc8Var.e;
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
                                        ed8 ed8Var7 = photoViewer.d;
                                        HashMap u = ed8Var7 != null ? ed8Var7.u() : null;
                                        if (u != null) {
                                            r6 = u.values();
                                        }
                                        for (Object obj4 : r6) {
                                            if (obj4 == obj3 || !(obj4 instanceof go6) || !((go6) obj4).b()) {
                                            }
                                        }
                                        z2 = true;
                                        boolean z12 = z10 && b && !z;
                                        boolean z13 = (z10 || !z11) && !D;
                                        ed8 ed8Var8 = photoViewer.d;
                                        boolean z14 = ed8Var8 == null && ed8Var8.G() > 1;
                                        G = fu5.G(photoViewer.f0, new x53(), view);
                                        G.k(R.drawable.msg_sendfile, ob6.M0(z14 ? 2131745363 : 2131745364, null), new y98(photoViewer, (byte) 28), z2);
                                        G.k(R.drawable.msg_send, ob6.M0(2131745362, null), new y98(photoViewer, b3), z11);
                                        G.k(R.drawable.msg_replace, ob6.M0(2131745996, null), new na8(photoViewer, (byte) 0), z11);
                                        G.k(R.drawable.msg_calendar2, ob6.M0(D ? 2131745242 : 2131745587, null), new na8(photoViewer, b4), z12);
                                        G.k(R.drawable.input_notify_off, ob6.M0(2131745311, null), new na8(photoViewer, (byte) 2), z13);
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
                                ed8 ed8Var82 = photoViewer.d;
                                if (ed8Var82 == null) {
                                }
                                G = fu5.G(photoViewer.f0, new x53(), view);
                                G.k(R.drawable.msg_sendfile, ob6.M0(z14 ? 2131745363 : 2131745364, null), new y98(photoViewer, (byte) 28), z2);
                                G.k(R.drawable.msg_send, ob6.M0(2131745362, null), new y98(photoViewer, b3), z11);
                                G.k(R.drawable.msg_replace, ob6.M0(2131745996, null), new na8(photoViewer, (byte) 0), z11);
                                G.k(R.drawable.msg_calendar2, ob6.M0(D ? 2131745242 : 2131745587, null), new na8(photoViewer, b4), z12);
                                G.k(R.drawable.input_notify_off, ob6.M0(2131745311, null), new na8(photoViewer, (byte) 2), z13);
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
                        ed8 ed8Var822 = photoViewer.d;
                        if (ed8Var822 == null) {
                        }
                        G = fu5.G(photoViewer.f0, new x53(), view);
                        G.k(R.drawable.msg_sendfile, ob6.M0(z14 ? 2131745363 : 2131745364, null), new y98(photoViewer, (byte) 28), z2);
                        G.k(R.drawable.msg_send, ob6.M0(2131745362, null), new y98(photoViewer, b3), z11);
                        G.k(R.drawable.msg_replace, ob6.M0(2131745996, null), new na8(photoViewer, (byte) 0), z11);
                        G.k(R.drawable.msg_calendar2, ob6.M0(D ? 2131745242 : 2131745587, null), new na8(photoViewer, b4), z12);
                        G.k(R.drawable.input_notify_off, ob6.M0(2131745311, null), new na8(photoViewer, (byte) 2), z13);
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
                profileActivity.a3(false);
                return false;
            case 12:
                return ((dg9) obj).length() != 0;
            case 13:
                return ((yg9) obj).o0(view);
            case 14:
                v72 v72Var = ((r72) obj).a;
                ui9 ui9Var = v72Var.s;
                vnb vnbVar = v72Var.a;
                n12 n12Var = v72Var.b;
                pi9 pi9Var = v72Var.r;
                int i15 = v72Var.n;
                if (!yac.h(i15).p()) {
                    new xk8(n12Var.Z1, v72Var.getContext(), v72Var.n, 43, true).show();
                    return true;
                }
                if (pi9Var.h3() && !pi9Var.j3()) {
                    if (pi9Var.J3()) {
                        ArrayList<TL_iv.PageBlock> W2 = pi9Var.W2();
                        if (!W2.isEmpty()) {
                            e eVar2 = n12Var.Z1;
                            zu1 zu1Var6 = eVar2 instanceof zu1 ? (zu1) eVar2 : null;
                            q67 q67Var = v72Var.P;
                            if (q67Var != null) {
                                q67Var.f(false);
                                v72Var.P = null;
                            }
                            q67 q67Var2 = new q67(v72Var.getContext(), vnbVar);
                            v72Var.P = q67Var2;
                            q67Var2.setOnDismissListener(new o1(v72Var, (byte) 16));
                            long W0 = n12Var.W0();
                            r47 r47Var = zu1Var6 != null ? zu1Var6.F5 : null;
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            tL_message.id = 0;
                            tL_message.out = true;
                            tL_message.peer_id = uc7.s1(i15).y1(W0);
                            tL_message.from_id = uc7.s1(i15).y1(yac.h(i15).e());
                            tL_message.flags2 |= TLObject.FLAG_13;
                            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                            tL_message.rich_message = richMessage;
                            richMessage.blocks = W2;
                            richMessage.photos = pi9Var.y2();
                            tL_message.rich_message.documents = pi9Var.v2();
                            if (r47Var != null && !r47Var.p) {
                                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                tL_messageReplyHeader.flags |= 16;
                                tL_messageReplyHeader.reply_to_msg_id = r47Var.e1();
                                tL_message.reply_to = tL_messageReplyHeader;
                            }
                            r47 r47Var2 = new r47(i15, tL_message, false, false);
                            if (r47Var != null && !r47Var.p) {
                                r47Var2.C = r47Var;
                            }
                            r47Var2.B0 = true;
                            r47Var2.W2 = Boolean.TRUE;
                            r47Var2.n0(null);
                            r47Var2.w1 = true;
                            v72Var.P.r(qd4.t(r47Var2));
                            bz1 sendButton = ui9Var.getSendButton();
                            sendButton.setScaleX(1.0f);
                            sendButton.setScaleY(1.0f);
                            bz1 s = v72Var.P.s(sendButton, true, new r81(v72Var, (byte) 12));
                            if (s != null) {
                                s.setBackground(new xg9(aob.b0(hl.L(22.0f), aob.v0(aob.Fi, vnbVar))));
                                q67 q67Var3 = v72Var.P;
                                int L = hl.L(44.0f);
                                q67Var3.p0 = true;
                                q67Var3.Y = L;
                            }
                            fu5 G3 = fu5.G(v72Var, vnbVar, sendButton);
                            boolean z15 = zu1Var6 != null && lbc.D(zu1Var6.h());
                            if (zu1Var6 == null || !zu1Var6.M4()) {
                                z3 = false;
                            } else {
                                z3 = false;
                                z3 = false;
                                z3 = false;
                                G3.b(R.drawable.msg_calendar2, ob6.M0(z15 ? 2131745242 : 2131745587, null), new kt((Object) v72Var, W0, (byte) 8), false);
                                if (!z15 && W0 > 0) {
                                    G3.b(R.drawable.msg_online, ob6.M0(2131745314, null), new k72(v72Var, z3 ? (byte) 1 : (byte) 0), false);
                                }
                            }
                            if (!z15) {
                                G3.b(R.drawable.input_notify_off, ob6.M0(2131745311, null), new k72(v72Var, b4), z3);
                            }
                            G3.Z();
                            v72Var.P.q(G3);
                            v72Var.P.show();
                            try {
                                view.performHapticFeedback(3, 2);
                                return true;
                            } catch (Exception unused3) {
                                return true;
                            }
                        }
                    } else if (ui9Var != null) {
                        ui9Var.setSendEnabled(pi9Var.J3());
                    }
                }
                return false;
            case 15:
                n1a n1aVar = (n1a) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, null, n1aVar.getContext());
                String M0 = ob6.M0(2131752035, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                idVar.U = ob6.M0(2131752036, null);
                alertDialog$Builder.j(ob6.M0(2131752066, null), new rz9(n1aVar));
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                idVar.Q0 = false;
                alertDialog$Builder.i(new dl8(n1aVar, (byte) 6));
                alertDialog$Builder.o();
                n1aVar.w(1.0f);
                try {
                    n1aVar.performHapticFeedback(0, 1);
                } catch (Exception unused4) {
                }
                return true;
            case 16:
                return a(view);
            case 17:
                kja kjaVar = (kja) obj;
                if (kjaVar.d == null) {
                    return false;
                }
                int intValue = ((Integer) view.getTag()).intValue();
                gja gjaVar = kjaVar.d;
                int i16 = kjaVar.c[intValue];
                r47 r47Var3 = kjaVar.b[intValue];
                wz4 wz4Var = (wz4) gjaVar;
                yg4 yg4Var = ((wg4) wz4Var.a).d;
                if (!yg4Var.p0.u()) {
                    yg4Var.f(r47Var3, kjaVar, intValue);
                    return true;
                }
                yg4 yg4Var2 = ((wg4) wz4Var.a).d;
                SpannableStringBuilder[] spannableStringBuilderArr = yg4.t0;
                yg4Var2.e(i16, kjaVar, r47Var3, intValue);
                return true;
            case 18:
                sbb sbbVar = (sbb) obj;
                Activity activity = sbbVar.b;
                xab xabVar = sbbVar.C0;
                if (xabVar == null || !xabVar.isFrontface()) {
                    return false;
                }
                sbbVar.m();
                sbbVar.F0.setSelected(true);
                sbbVar.s.e(0.85f, 240L, null);
                ?? G4 = fu5.G(sbbVar.r, sbbVar.a, sbbVar.F0);
                ena enaVar = new ena(activity, 1);
                enaVar.c(sbbVar.s.o);
                enaVar.h = new dab(sbbVar, (byte) 20);
                G4.p(enaVar);
                G4.n(true);
                ena enaVar2 = new ena(activity, 2);
                enaVar2.b = 0.65f;
                enaVar2.c = 1.0f;
                enaVar2.c(sbbVar.s.p);
                enaVar2.h = new dab(sbbVar, (byte) 21);
                G4.p(enaVar2);
                G4.p = new bab(sbbVar, b3);
                G4.s = (short) 0;
                G4.W(5);
                G4.b0(hl.L(46.0f), -hl.L(4.0f));
                G4.Q(-1155851493);
                G4.a0();
                return true;
            default:
                lambda$show$8 = VideoAds.lambda$show$8((TLRPC.TL_sponsoredMessage) obj, view);
                return lambda$show$8;
        }
    }
}
