// default package

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class p82 extends a22 implements jm7 {
    public static final int[] R = {1, 2, 16, 8, 256, 4, TLObject.FLAG_14, 32768};
    public boolean E;
    public int F;
    public ne9 G;
    public int H;
    public bu5 I;
    public int J;
    public boolean K;
    public int L;
    public boolean M;
    public int N;
    public boolean O;
    public j67 P;
    public final e82 Q;
    public final int n;
    public final ch9 r;
    public final hh9 s;
    public pr2 w;
    public e34 x;
    public boolean y;

    /* JADX WARN: Multi-variable type inference failed */
    public p82(int i, i22 i22Var, ylb ylbVar, Context context) {
        super(i22Var, ylbVar, context);
        l82 l82Var = new l82(this);
        this.K = true;
        this.Q = new e82(this, (byte) 3);
        this.n = i;
        this.h = true;
        this.f = true;
        Object[] objArr = 0;
        ch9 ch9Var = new ch9(context, i, ylbVar, new lx6(this, ylbVar, false, (byte) 14));
        this.r = ch9Var;
        ch9Var.setAdaptiveLinkDialogs(false);
        ch9Var.setAllowTapAboveContent(false);
        addView(ch9Var, qoe.e(-1, -1, nm7.D1));
        addView(ch9Var.getOverlayView(), qoe.e(-1, -1, nm7.D1));
        ch9Var.B4();
        of9 of9Var = ch9Var.R3;
        if (of9Var != null) {
            of9Var.j();
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
        setBackground(null);
        setForeground(null);
        hh9 hh9Var = new hh9(context, l82Var);
        this.s = hh9Var;
        hh9Var.setBackVisible(false);
        hh9Var.setTopGradientVisible(false);
        d0();
        addView(hh9Var, qoe.e(-1, -1, nm7.D1));
        c0();
        e0();
        Z(false);
        getViewTreeObserver().addOnGlobalFocusChangeListener(new i82(this, objArr == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void X(Context context, final String str, final qac qacVar, ylb ylbVar) {
        my0 h = hg9.h(1, ylbVar, context, true);
        LinearLayout i = hg9.i(context, 1);
        final String[] strArr = {str == null ? "" : str};
        ImageView imageView = new ImageView(context);
        imageView.setPadding(gm.L(4.0f), gm.L(4.0f), gm.L(4.0f), gm.L(4.0f));
        int L = gm.L(8.0f);
        int i2 = cmb.F6;
        ShapeDrawable b0 = cmb.b0(L, cmb.p1(0.05f, cmb.v0(i2, ylbVar)));
        wmb K = anb.K(0.05f, i2);
        imageView.setBackground(b0);
        anb.j(imageView, b0, K, null, ylbVar);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.setVisibility(8);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        i.addView(horizontalScrollView, qoe.t(-1, -2, 49, 12, 2, 12, 0));
        b61 i3 = mlb.i(24, ylbVar, context, true);
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        lo0 lo0Var = new lo0((Object) strArr, (Object) horizontalScrollView, (Object) i3, (Object) zArr2, (Object) new f(strArr, (byte) 29), (Object) imageView, (Object) ylbVar, (Object) new int[]{6}, (byte) 2);
        final su3 su3Var = new su3(context, jb6.M0(2131753973, null), true, false, -1, ylbVar);
        ru3 ru3Var = su3Var.d;
        ru3Var.setImeOptions(6);
        ru3Var.setMaxLines(5);
        int L2 = gm.L(24.0f);
        int i4 = cmb.c6;
        ShapeDrawable b02 = cmb.b0(L2, cmb.v0(i4, ylbVar));
        wmb M = anb.M(i4);
        su3Var.setBackground(b02);
        anb.j(su3Var, b02, M, null, ylbVar);
        su3Var.setText(strArr[0]);
        ru3Var.addTextChangedListener(new qz(strArr, lo0Var, false, (byte) 3));
        i.addView(su3Var, qoe.t(-1, -2, 55, 12, 8, 12, 0));
        i3.setText(jb6.M0(2131751291, null));
        i.addView(i3, qoe.t(-1, 48, 55, 12, 12, 12, 12));
        lo0Var.run();
        h.O = i;
        h.I0 = new DialogInterface.OnDismissListener() { // from class: k82
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ru3 ru3Var2 = su3.this.d;
                ru3Var2.clearFocus();
                gm.t1(ru3Var2);
                boolean[] zArr3 = zArr;
                if (zArr3[0] || zArr2[0]) {
                    return;
                }
                String[] strArr2 = strArr;
                if (TextUtils.equals(str, strArr2[0])) {
                    return;
                }
                zArr3[0] = true;
                qacVar.a(strArr2[0]);
            }
        };
        h.show();
        int i5 = cmb.Z6;
        h.t0(i5);
        h.L(i5);
        i3.setOnClickListener(new oh(i3, zArr, qacVar, strArr, h, (byte) 6));
        gm.d3(new c82(su3Var, 0 == true ? 1 : 0), 200L);
    }

    private int getEmojiPanelHeight() {
        int Q = this.b.o3.Q();
        if (Q <= 0) {
            SharedPreferences c1 = oc7.c1();
            Point point = gm.q;
            Q = c1.getInt(point.x > point.y ? "kbd_height_land3" : "kbd_height", gm.L(200.0f));
        }
        if (Q <= 0) {
            Q = gm.L(200.0f);
        }
        return Q + gm.n;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    @Override // a22
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i, int i2) {
        int L;
        int i3;
        bu5 bu5Var;
        boolean z = this.M;
        i22 i22Var = this.b;
        boolean z2 = i22Var.o3.Q() > gm.L(20.0f);
        this.M = z2;
        if (!z2 && z && (bu5Var = this.I) != null) {
            bu5Var.u();
            this.I = null;
        }
        if (this.M || this.F > gm.L(20.0f)) {
            L = gm.L(52.0f);
            i22Var.r0 = false;
        } else {
            if (!gm.O1()) {
                Point point = gm.q;
                if (point.x > point.y) {
                    i3 = (int) (i2 / 3.5f);
                    L = i3 - gm.L(52.0f);
                    if (L < 0) {
                        L = 0;
                    }
                    i22Var.r0 = true;
                }
            }
            i3 = (i2 / 5) << 1;
            L = i3 - gm.L(52.0f);
            if (L < 0) {
            }
            i22Var.r0 = true;
        }
        int currentActionBarHeight = a.getCurrentActionBarHeight() + gm.m + L;
        ch9 ch9Var = this.r;
        int v = hg9.v(110.0f, (this.M || this.F > 0) ? 0 : gm.n, (ch9Var.g3() || this.y || !i22Var.P2) ? 0 : gm.L(62.0f)) + this.F;
        if (ch9Var.getPaddingTop() != currentActionBarHeight || ch9Var.getPaddingBottom() != v) {
            this.O = true;
            ch9Var.q1(0, currentActionBarHeight, 0, v);
            this.O = false;
        }
        f0();
    }

    @Override // a22
    public final void H(a22 a22Var) {
        this.b.U2.setTitle("");
        this.r.g3.O(false);
        Z(false);
        post(new e82(this, (byte) 4));
    }

    @Override // a22
    public final void J() {
        this.r.z0(0);
    }

    @Override // a22
    public final boolean K(boolean z, int i, int i2, long j, boolean z2) {
        k47 k47Var;
        nv1 nv1Var;
        l3a l3aVar;
        long j2;
        k47 k47Var2;
        ms1 ms1Var;
        uz1 uz1Var;
        ms1 ms1Var2;
        int i3 = this.n;
        boolean x4 = oc7.r1(i3).x4();
        byte b = 0;
        ch9 ch9Var = this.r;
        if (!x4 && !z8c.h(i3).p() && hi9.d(ch9Var.t3, ch9Var.u3)) {
            jf9.r0(this.a, getContext(), new b82(ch9Var, b), new e82(this, (byte) 2));
            return false;
        }
        if (ch9Var.g3() && !ch9Var.i3()) {
            if (ch9Var.I3()) {
                boolean x42 = oc7.r1(i3).x4();
                i22 i22Var = this.b;
                if (x42) {
                    ArrayList V2 = ch9Var.V2();
                    if (!V2.isEmpty()) {
                        ArrayList x2 = ch9Var.x2();
                        ArrayList u2 = ch9Var.u2();
                        ArrayList a = gi9.a(i3, V2);
                        d dVar = i22Var.Z1;
                        if (dVar instanceof yv1) {
                            yv1 yv1Var = (yv1) dVar;
                            k47 k47Var3 = yv1Var.F5;
                            k47 k47Var4 = yv1Var.m4;
                            nv1 nv1Var2 = yv1Var.D5;
                            long k7 = yv1Var.k7();
                            l3aVar = yv1Var.X6();
                            k47Var = k47Var4;
                            nv1Var = nv1Var2;
                            j2 = k7;
                            k47Var2 = k47Var3;
                        } else {
                            k47Var = null;
                            nv1Var = null;
                            l3aVar = null;
                            j2 = 0;
                            k47Var2 = null;
                        }
                        a6a.Q(j5.a(i22Var.G3), V2, x2, u2, a, i22Var.V0(), k47Var2, k47Var, nv1Var, z, i, i2, l3aVar, j, j2, 0L);
                        d dVar2 = i22Var.Z1;
                        if ((dVar2 instanceof yv1) && (ms1Var = ((yv1) dVar2).a0) != null && (uz1Var = ms1Var.P3) != null) {
                            uz1Var.w(null, z, i, i2, 0L);
                        }
                        i22Var.a(true);
                        return true;
                    }
                } else {
                    d dVar3 = i22Var.Z1;
                    if ((dVar3 instanceof yv1) && (ms1Var2 = ((yv1) dVar3).a0) != null) {
                        ms1Var2.v1(hi9.g(ch9Var.t3), z, i, i2);
                        i22Var.a(true);
                        return true;
                    }
                }
            } else {
                hh9 hh9Var = this.s;
                if (hh9Var != null) {
                    hh9Var.setSendEnabled(ch9Var.I3());
                    return false;
                }
            }
        }
        return false;
    }

    @Override // a22
    public final boolean M() {
        return !this.r.g3();
    }

    public final void O(bu5 bu5Var, ll0 ll0Var, TL_iv.PageBlock pageBlock, int i, String str, int i2, bu5 bu5Var2) {
        bu5Var.i(ll0Var != null && ll0Var.b.getClass() == pageBlock.getClass(), i, null, str, new xo1(this, ll0Var, pageBlock, bu5Var2, (byte) 7));
        bu5Var.z().a.setTypeface(gm.n1("fonts/mw_bold.ttf"));
        bu5Var.z().a.setTextSize(1, i2);
    }

    public final boolean P() {
        final byte b = 1;
        ch9 ch9Var = this.r;
        if (ch9Var == null || !ch9Var.g3()) {
            return true;
        }
        final byte b2 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.a, getContext());
        String M0 = jb6.M0(2131753958, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = jb6.M0(2131753959, null);
        alertDialog$Builder.g(jb6.M0(2131751535, null), new ee(this) { // from class: j82
            public final /* synthetic */ p82 b;

            {
                this.b = this;
            }

            @Override // ee
            public final void r(he heVar2, int i) {
                byte b3 = b2;
                p82 p82Var = this.b;
                switch (b3) {
                    case 0:
                        p82Var.b.dismiss();
                        break;
                    default:
                        p82Var.T();
                        p82Var.b.dismiss();
                        break;
                }
            }
        });
        alertDialog$Builder.j(jb6.M0(2131745680, null), new ee(this) { // from class: j82
            public final /* synthetic */ p82 b;

            {
                this.b = this;
            }

            @Override // ee
            public final void r(he heVar2, int i) {
                byte b3 = b;
                p82 p82Var = this.b;
                switch (b3) {
                    case 0:
                        p82Var.b.dismiss();
                        break;
                    default:
                        p82Var.T();
                        p82Var.b.dismiss();
                        break;
                }
            }
        });
        alertDialog$Builder.c(-2);
        alertDialog$Builder.o();
        return false;
    }

    public final void Q(boolean z) {
        if (this.E) {
            this.E = false;
            e34 e34Var = this.x;
            if (e34Var != null) {
                e34Var.r(false);
                if (!z) {
                    this.x.y();
                }
            }
        }
        this.G = null;
        e34 e34Var2 = this.x;
        if (e34Var2 != null) {
            e34Var2.setTranslationY(0.0f);
            this.x.setVisibility(8);
        }
        this.y = false;
        this.F = 0;
        hh9 hh9Var = this.s;
        if (hh9Var != null) {
            hh9Var.setEmojiOpened(false);
        }
        Z(false);
        requestLayout();
    }

    public final void R() {
        float f;
        float f2;
        int L = this.E ? gm.L(245.0f) : this.F;
        e34 e34Var = this.x;
        i22 i22Var = this.b;
        if (e34Var != null) {
            if (this.y) {
                f2 = (this.F - L) + (this.E ? -i22Var.i4 : 0.0f);
            } else {
                f2 = 0.0f;
            }
            e34Var.setTranslationY(f2);
        }
        hh9 hh9Var = this.s;
        if (hh9Var != null) {
            boolean z = this.y;
            if (z) {
                f = L;
            } else {
                f = (this.M || this.F > 0) ? 0 : gm.n;
            }
            if (!z || this.E) {
                f += i22Var.i4;
            }
            hh9Var.getBottomContainer().animate().cancel();
            hh9Var.getBottomContainer().setTranslationY(-f);
            boolean z2 = this.y;
            float f3 = z2 ? L : 0.0f;
            if (!z2 || this.E) {
                f3 += i22Var.i4;
            }
            hh9Var.setBottomGradientTranslationY(-f3);
            if (this.N != this.L) {
                ViewPropertyAnimator animate = hh9Var.getBottomInnerContainer().animate();
                this.N = this.L;
                animate.translationY(-r1).setDuration(320L).setInterpolator(d53.h).start();
            }
        }
    }

    public final void S(int i, int i2) {
        i22 i22Var = this.b;
        if (i22Var.Z1 == null) {
            return;
        }
        i22 i22Var2 = new i22(getContext(), i22Var.Z1, false, false, true, this.a);
        i22Var2.W3 = new m82(this, i22Var2);
        i22Var2.d2.h0();
        i22Var2.t1(1, true);
        i22Var2.P0(i);
        i22Var2.t4 = new f82(this, i22Var2);
        i22Var2.S1 = new f82(this, i22Var2);
        i22Var2.R1 = new n82(this, i22Var2);
        i22Var2.Z0();
        if (i2 != 0) {
            i22Var2.j1(i2);
        }
        i22Var2.v0(true);
        i22Var2.show();
    }

    public final boolean T() {
        d dVar = this.b.Z1;
        if (!(dVar instanceof yv1)) {
            return false;
        }
        yv1 yv1Var = (yv1) dVar;
        ch9 ch9Var = this.r;
        if (!ch9Var.m2()) {
            return false;
        }
        TL_iv.RichMessage e2 = ch9Var.e2();
        hs6.d0(j5.a(this.n).a).T1(yv1Var.a(), yv1Var.O5(yv1Var.F5), "", null, null, null, null, 0L, false, false, e2);
        ms1 ms1Var = yv1Var.a0;
        if (ms1Var == null) {
            return true;
        }
        ms1Var.setRichDraftPreview(e2);
        return true;
    }

    public final ne9 U() {
        ch9 ch9Var = this.r;
        ne9 focusedEditTextOrNull = ch9Var.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull == null) {
            ne9 ne9Var = this.G;
            return ne9Var != null ? ne9Var : ch9Var.L2();
        }
        this.G = focusedEditTextOrNull;
        this.H = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        return focusedEditTextOrNull;
    }

    public final int W(ne9 ne9Var) {
        return (ne9Var != this.G || this.r.getFocusedEditTextOrNull() == ne9Var) ? Math.max(0, ne9Var.getSelectionEnd()) : Math.min(this.H, ne9Var.length());
    }

    public final void Y() {
        boolean z = this.y;
        ch9 ch9Var = this.r;
        if (z) {
            ne9 L2 = ch9Var.L2();
            if (L2 != null) {
                L2.O();
                gm.E3(L2);
            }
            Q(true);
            return;
        }
        if (this.x == null) {
            i22 i22Var = this.b;
            e34 e34Var = new e34(i22Var.Z1, true, false, false, getContext(), true, null, i22Var.o3, true, this.a, false, false);
            this.x = e34Var;
            e34Var.setVisibility(8);
            e34 e34Var2 = this.x;
            e34Var2.x2 = false;
            e34Var2.setBottomInset(gm.n);
            View view = this.x.w;
            if (view != null) {
                view.setVisibility(8);
            }
            this.x.setDelegate(new o82(this));
            addView(this.x, qoe.e(-1, getEmojiPanelHeight(), 87));
        }
        int emojiPanelHeight = getEmojiPanelHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.x.getLayoutParams();
        layoutParams.height = emojiPanelHeight;
        this.x.setLayoutParams(layoutParams);
        this.x.setTranslationY(0.0f);
        this.x.setVisibility(0);
        this.y = true;
        this.F = emojiPanelHeight;
        ne9 L22 = ch9Var.L2();
        if (L22 != null) {
            gm.t1(L22);
        }
        hh9 hh9Var = this.s;
        if (hh9Var != null) {
            hh9Var.setEmojiOpened(true);
        }
        Z(false);
        requestLayout();
    }

    public final void Z(boolean z) {
        int i = 0;
        boolean z2 = this.r.g3() || this.y;
        i22 i22Var = this.b;
        h12 h12Var = i22Var.u3;
        if (i22Var.u4 != z2) {
            i22Var.u4 = z2;
            if (i22Var.P2) {
                h12Var.animate().cancel();
                if (!z2) {
                    h12Var.setVisibility(0);
                }
                if (z) {
                    h12Var.animate().alpha(z2 ? 0.0f : 1.0f).translationY(z2 ? gm.L(48.0f) : 0.0f).setDuration(180L).withEndAction(new c12(i22Var, z2, (byte) 3)).start();
                } else {
                    h12Var.setAlpha(z2 ? 0.0f : 1.0f);
                    h12Var.setTranslationY(z2 ? gm.L(48.0f) : 0.0f);
                    h12Var.setVisibility(z2 ? 4 : 0);
                }
            }
        }
        if (!z2 && !i22Var.L1 && i22Var.P2) {
            i = gm.L(62.0f);
        }
        this.L = i;
        R();
        if (this.K == z2) {
            this.K = !z2;
            requestLayout();
        }
    }

    public final void a0() {
        int i = 0;
        if (!(this.r.g3() || this.y)) {
            i22 i22Var = this.b;
            if (!i22Var.L1 && i22Var.P2) {
                i = gm.L(62.0f);
            }
        }
        if (this.L != i) {
            this.L = i;
            R();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01b9 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b0() {
        int i;
        boolean z;
        boolean z2;
        int max;
        int max2;
        int i2;
        ch9 ch9Var = this.r;
        gkb textSelectionHelper = ch9Var.getTextSelectionHelper();
        hh9 hh9Var = this.s;
        if (hh9Var == null || textSelectionHelper == null || !textSelectionHelper.w()) {
            return;
        }
        int[] D4 = ch9Var.D4();
        hh9Var.setQuoteState(D4 != null && ch9Var.D3(D4[0], D4[1]));
        boolean H3 = ch9Var.H3();
        int[] iArr = R;
        if (H3) {
            gkb textSelectionHelper2 = ch9Var.getTextSelectionHelper();
            int i3 = textSelectionHelper2.p0;
            int i4 = textSelectionHelper2.q0;
            int i5 = textSelectionHelper2.t0;
            int i6 = textSelectionHelper2.r0;
            int i7 = textSelectionHelper2.u0;
            int i8 = 0;
            for (int i9 = 0; i9 < 8; i9++) {
                int i10 = iArr[i9];
                if (this.r.G3(i10, i3, i4, i6, i5, i7)) {
                    i8 |= i10;
                }
            }
            boolean z3 = i4 == i5;
            ne9 Q4 = z3 ? ch9Var.Q4(i3, i4) : null;
            int max3 = Math.max(0, Math.min(i6, i7));
            int max4 = Q4 == null ? 0 : Math.max(0, Math.min(Math.max(i6, i7), Q4.length()));
            this.s.c(i8, Q4 != null && max3 < max4 && zk9.h(Q4.getText(), max3, max4), Q4 != null && max3 < max4 && zk9.g(Q4.getText(), max3, max4), z3, ch9Var.g2(), true);
            return;
        }
        if (ch9Var.s3()) {
            gkb textSelectionHelper3 = ch9Var.getTextSelectionHelper();
            ne9 o2 = ch9Var.o2(textSelectionHelper3.p0);
            int i11 = textSelectionHelper3.r0;
            int i12 = textSelectionHelper3.u0;
            if (o2 == null) {
                max2 = 0;
                max = 0;
            } else {
                max = Math.max(0, Math.min(Math.min(i11, i12), o2.length()));
                max2 = Math.max(0, Math.min(Math.max(i11, i12), o2.length()));
            }
            if (o2 == null || max >= max2) {
                i2 = 0;
            } else {
                int i13 = 0;
                for (int i14 = 0; i14 < 8; i14++) {
                    int i15 = iArr[i14];
                    if ((o2.c(max, max2) & i15) != 0) {
                        i13 |= i15;
                    }
                }
                i2 = i13;
            }
            this.s.c(i2, o2 != null && max < max2 && zk9.h(o2.getText(), max, max2), o2 != null && max < max2 && zk9.g(o2.getText(), max, max2), true, ch9Var.g2(), true);
            return;
        }
        int i16 = textSelectionHelper.p0;
        int i17 = textSelectionHelper.s0;
        int i18 = textSelectionHelper.r0;
        int i19 = textSelectionHelper.u0;
        boolean z4 = i16 >= 0 && i17 >= 0 && i17 >= i16 && i17 < ch9Var.x4.size();
        if (z4) {
            int i20 = 0;
            int i21 = 0;
            while (i20 < 8) {
                int i22 = iArr[i20];
                int i23 = i19;
                if (this.r.F3(i22, i16, i18, i17, i23)) {
                    i21 |= i22;
                }
                i20++;
                i19 = i23;
            }
            i = i21;
        } else {
            i = 0;
        }
        int i24 = i19;
        if (z4) {
            Editable J4 = ch9Var.J4(i16, i18, i17, i24);
            if (J4 == null ? false : zk9.h(J4, Math.max(0, Math.min(i18, i24)), Math.max(i18, i24))) {
                z = true;
                if (z4) {
                    Editable J42 = ch9Var.J4(i16, i18, i17, i24);
                    if (J42 == null ? false : zk9.g(J42, Math.max(0, Math.min(i18, i24)), Math.max(i18, i24))) {
                        z2 = true;
                        this.s.c(i, z, z2, !z4 && i16 == i17, ch9Var.g2(), !ch9Var.E3());
                    }
                }
                z2 = false;
                if (z4) {
                }
                this.s.c(i, z, z2, !z4 && i16 == i17, ch9Var.g2(), !ch9Var.E3());
            }
        }
        z = false;
        if (z4) {
        }
        z2 = false;
        if (z4) {
        }
        this.s.c(i, z, z2, !z4 && i16 == i17, ch9Var.g2(), !ch9Var.E3());
    }

    public final void c0() {
        hh9 hh9Var = this.s;
        if (hh9Var != null) {
            ch9 ch9Var = this.r;
            boolean m2 = ch9Var.m2();
            of9 of9Var = ch9Var.R3;
            boolean z = (of9Var == null || of9Var.c.isEmpty()) ? false : true;
            ImageView imageView = hh9Var.r;
            ImageView imageView2 = hh9Var.n;
            imageView2.setEnabled(m2);
            imageView2.setAlpha(m2 ? 1.0f : 0.35f);
            imageView.setEnabled(z);
            imageView.setAlpha(z ? 1.0f : 0.35f);
        }
    }

    public final void d0() {
        hh9 hh9Var = this.s;
        if (hh9Var != null) {
            int i = this.n;
            boolean z = false;
            boolean z2 = (oc7.r1(i).x4() || z8c.h(i).p()) ? false : true;
            xz1 sendButton = hh9Var.getSendButton();
            if (z2) {
                ch9 ch9Var = this.r;
                if (hi9.d(ch9Var.t3, ch9Var.u3)) {
                    z = true;
                }
            }
            sendButton.setLocked(z);
            hh9Var.setPremiumLocked(z2);
        }
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.j5) {
            d0();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        ch9 ch9Var = this.r;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if ((this.b.Z1 instanceof yv1) && ch9Var.m2() && T()) {
                ts2.u(null, 2131745736, new c41(this.s, this.a), R.raw.contact_check, 36);
                return true;
            }
        } else if (!ch9Var.d3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        e34 e34Var;
        ch9 ch9Var = this.r;
        qg9 qg9Var = ch9Var.v3;
        rkb rkbVar = ch9Var.w3;
        if (qg9Var.w() && rkbVar.onTouchEvent(motionEvent)) {
            return true;
        }
        int height = (((!this.E || (e34Var = this.x) == null) ? getHeight() - this.F : (int) e34Var.getY()) - gm.L(60.0f)) - this.L;
        if (motionEvent.getAction() == 0 && this.y && motionEvent.getY() < height) {
            Q(false);
        }
        if ((motionEvent.getAction() != 0 || (motionEvent.getY() > gm.L(60.0f) && motionEvent.getY() < height)) && rkbVar.b(motionEvent)) {
            motionEvent.setAction(3);
        }
        if (motionEvent.getY() >= height || !ch9Var.e3(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // a22
    public final boolean e() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0068, code lost:
    
        if ((r7 instanceof org.telegram.tgnet.tl.TL_iv.pageBlockPullquote) == false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e0() {
        ll0 M2;
        hh9 hh9Var = this.s;
        if (hh9Var == null) {
            return;
        }
        ch9 ch9Var = this.r;
        gkb textSelectionHelper = ch9Var.getTextSelectionHelper();
        if (textSelectionHelper == null || !textSelectionHelper.w()) {
            M2 = ch9Var.M2();
        } else {
            int i = textSelectionHelper.p0;
            M2 = i == textSelectionHelper.s0 ? ch9Var.A4(i) : null;
        }
        int i2 = 4;
        int i3 = 0;
        if (ch9Var.N2() == null) {
            if (M2 != null) {
                if (!M2.a() && !M2.b() && !M2.c()) {
                    TL_iv.PageBlock pageBlock = M2.b;
                    if (!(pageBlock instanceof TL_iv.pageBlockDetails)) {
                        if (!(pageBlock instanceof TL_iv.pageBlockTable)) {
                            if (pageBlock instanceof TL_iv.pageBlockMath) {
                                i2 = 7;
                            } else {
                                if (!ch9.y3(pageBlock)) {
                                    TL_iv.PageBlock pageBlock2 = M2.b;
                                    if (!(pageBlock2 instanceof TL_iv.pageBlockParagraph)) {
                                        if (!(pageBlock2 instanceof TL_iv.pageBlockPreformatted)) {
                                            if (!(pageBlock2 instanceof TL_iv.pageBlockBlockquote)) {
                                            }
                                        }
                                    }
                                }
                                i2 = 1;
                            }
                        }
                    }
                }
                i2 = 2;
            }
            i2 = 0;
        }
        if (M2 != null) {
            if (i2 == 1) {
                TL_iv.PageBlock pageBlock3 = M2.b;
                if (pageBlock3 instanceof TL_iv.pageBlockHeading1) {
                    i3 = R.drawable.iv_h1;
                } else if (pageBlock3 instanceof TL_iv.pageBlockHeading2) {
                    i3 = R.drawable.iv_h2;
                } else if (pageBlock3 instanceof TL_iv.pageBlockHeading3) {
                    i3 = R.drawable.iv_h3;
                } else if (pageBlock3 instanceof TL_iv.pageBlockHeading4) {
                    i3 = R.drawable.iv_h4;
                } else if (pageBlock3 instanceof TL_iv.pageBlockHeading5) {
                    i3 = R.drawable.iv_h5;
                } else if (pageBlock3 instanceof TL_iv.pageBlockHeading6) {
                    i3 = R.drawable.iv_h6;
                } else if (pageBlock3 instanceof TL_iv.pageBlockPreformatted) {
                    i3 = R.drawable.iv_code;
                } else if (pageBlock3 instanceof TL_iv.pageBlockBlockquote) {
                    i3 = R.drawable.iv_quote;
                } else if (pageBlock3 instanceof TL_iv.pageBlockPullquote) {
                    i3 = R.drawable.iv_pullquote;
                } else if (pageBlock3 instanceof TL_iv.pageBlockFooter) {
                    i3 = R.drawable.iv_footer;
                }
            } else if (i2 == 2) {
                if (M2.a()) {
                    i3 = R.drawable.iv_todo;
                } else if (M2.c()) {
                    i3 = R.drawable.iv_ordered_list;
                }
            }
        }
        hh9Var.d(i2, i3);
    }

    public final void f0() {
        int paddingTop;
        hh9 hh9Var = this.s;
        if (hh9Var == null) {
            return;
        }
        int currentActionBarHeight = (((a.getCurrentActionBarHeight() - gm.L(44.0f)) / 2) + gm.m) - gm.L(8.0f);
        ch9 ch9Var = this.r;
        if (ch9Var.getChildCount() <= 0) {
            paddingTop = ch9Var.getPaddingTop();
        } else {
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < ch9Var.getChildCount(); i2++) {
                View childAt = ch9Var.getChildAt(i2);
                if (RecyclerView.R(childAt) >= 0 && childAt.getTop() < i) {
                    i = childAt.getTop();
                }
            }
            paddingTop = i == Integer.MAX_VALUE ? ch9Var.getPaddingTop() : i;
        }
        hh9Var.setTopButtonsOffset(Math.max(currentActionBarHeight, paddingTop));
    }

    @Override // a22
    public int getCurrentItemTop() {
        ch9 ch9Var = this.r;
        if (ch9Var.getChildCount() <= 0) {
            int paddingTop = ch9Var.getPaddingTop();
            this.J = paddingTop;
            ch9Var.setTopGlowOffset(paddingTop);
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        boolean z = false;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < ch9Var.getChildCount(); i2++) {
            View childAt = ch9Var.getChildAt(i2);
            int R2 = RecyclerView.R(childAt);
            if (R2 == 0) {
                z = true;
            }
            if (R2 >= 0 && childAt.getTop() < i) {
                i = childAt.getTop();
            }
        }
        if (i == Integer.MAX_VALUE) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        ch9Var.setTopGlowOffset(Math.max(0, i));
        int i3 = i - gm.m;
        int L = gm.L(7.0f);
        if (i3 < gm.L(7.0f) || !z) {
            i3 = L;
        }
        this.J = i3;
        return i3;
    }

    @Override // a22
    public int getFirstOffset() {
        return gm.L(56.0f) + getListTopPadding();
    }

    @Override // a22
    public int getListTopPadding() {
        return (this.r.getPaddingTop() - gm.m) - a.getCurrentActionBarHeight();
    }

    public gkb getTextSelectionHelper() {
        return this.r.getTextSelectionHelper();
    }

    @Override // a22
    public final int j() {
        return 0;
    }

    @Override // a22
    public final boolean k() {
        boolean z = this.E;
        if (z) {
            if (z) {
                this.E = false;
                e34 e34Var = this.x;
                if (e34Var != null) {
                    e34Var.r(false);
                    this.x.y();
                }
                R();
                return false;
            }
        } else {
            if (this.y) {
                Q(false);
                return false;
            }
            if (!this.r.B2() && !P()) {
                return true;
            }
        }
        return false;
    }

    @Override // a22
    public final void m(float f) {
        R();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nm7.f(this.n).b(this, nm7.j5);
        d0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.f(this.n).n(this, nm7.j5);
    }

    @Override // a22
    public final void p() {
        j67 j67Var = this.P;
        if (j67Var != null) {
            j67Var.g();
            this.P = null;
        }
        pr2 pr2Var = this.w;
        if (pr2Var != null) {
            pr2Var.m();
        }
        ch9 ch9Var = this.r;
        if (ch9Var != null) {
            ch9Var.r2();
        }
        e34 e34Var = this.x;
        if (e34Var != null) {
            e34Var.z();
        }
    }

    @Override // a22
    public final boolean q() {
        ch9 ch9Var = this.r;
        if (ch9Var == null) {
            return false;
        }
        ch9Var.r2();
        return false;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.O) {
            return;
        }
        super.requestLayout();
    }

    @Override // a22
    public final boolean s() {
        return P();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.b.b.invalidate();
        invalidate();
    }

    @Override // a22
    public final void u() {
        pr2 pr2Var = this.w;
        if (pr2Var != null) {
            pr2Var.m();
        }
        if (this.y) {
            Q(false);
        }
    }

    @Override // a22
    public final void y() {
        this.M = this.b.o3.Q() > gm.L(20.0f);
        R();
        f0();
    }

    @Override // a22
    public final void z(int i, boolean z) {
        this.M = z;
        R();
        if (z && this.y && !this.E) {
            Q(false);
        }
        f0();
    }

    @Override // a22
    public final void t() {
    }
}
