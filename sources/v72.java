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
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class v72 extends f12 implements fn7 {
    public static final int[] R = {1, 2, 16, 8, 256, 4, TLObject.FLAG_14, 32768};
    public boolean E;
    public int F;
    public dg9 G;
    public int H;
    public fu5 I;
    public int J;
    public boolean K;
    public int L;
    public boolean M;
    public int N;
    public boolean O;
    public q67 P;
    public final k72 Q;
    public final int n;
    public final pi9 r;
    public final ui9 s;
    public xq2 w;
    public o24 x;
    public boolean y;

    /* JADX WARN: Multi-variable type inference failed */
    public v72(int i, n12 n12Var, vnb vnbVar, Context context) {
        super(n12Var, vnbVar, context);
        r72 r72Var = new r72(this);
        this.K = true;
        this.Q = new k72(this, (byte) 3);
        this.n = i;
        this.h = true;
        this.f = true;
        Object[] objArr = 0;
        pi9 pi9Var = new pi9(context, i, vnbVar, new lh2(this, vnbVar, false, (byte) 15));
        this.r = pi9Var;
        pi9Var.setAdaptiveLinkDialogs(false);
        pi9Var.setAllowTapAboveContent(false);
        addView(pi9Var, tre.e(-1, -1, jn7.D1));
        addView(pi9Var.getOverlayView(), tre.e(-1, -1, jn7.D1));
        pi9Var.C4();
        ch9 ch9Var = pi9Var.R3;
        if (ch9Var != null) {
            ch9Var.j();
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
        setBackground(null);
        setForeground(null);
        ui9 ui9Var = new ui9(context, r72Var);
        this.s = ui9Var;
        ui9Var.setBackVisible(false);
        ui9Var.setTopGradientVisible(false);
        c0();
        addView(ui9Var, tre.e(-1, -1, jn7.D1));
        b0();
        d0();
        Y(false);
        getViewTreeObserver().addOnGlobalFocusChangeListener(new o72(this, objArr == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void W(Context context, final String str, final pcc pccVar, vnb vnbVar) {
        nx0 h = uh9.h(1, vnbVar, context, true);
        LinearLayout j = uh9.j(context, 1);
        final String[] strArr = {str == null ? "" : str};
        ImageView imageView = new ImageView(context);
        imageView.setPadding(hl.L(4.0f), hl.L(4.0f), hl.L(4.0f), hl.L(4.0f));
        int L = hl.L(8.0f);
        int i = aob.G6;
        ShapeDrawable b0 = aob.b0(L, aob.p1(0.05f, aob.v0(i, vnbVar)));
        uob K = yob.K(0.05f, i);
        imageView.setBackground(b0);
        yob.j(imageView, b0, K, null, vnbVar);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.setVisibility(8);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        j.addView(horizontalScrollView, tre.t(-1, -2, 49, 12, 2, 12, 0));
        c51 i2 = xnb.i(24, vnbVar, context, true);
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        nn0 nn0Var = new nn0((Object) strArr, (Object) horizontalScrollView, (Object) i2, (Object) zArr2, (Object) new c(strArr, (byte) 29), (Object) imageView, (Object) vnbVar, (Object) new int[]{6}, (byte) 2);
        final zt3 zt3Var = new zt3(context, ob6.M0(2131754001, null), true, false, -1, vnbVar);
        yt3 yt3Var = zt3Var.d;
        yt3Var.setImeOptions(6);
        yt3Var.setMaxLines(5);
        int L2 = hl.L(24.0f);
        int i3 = aob.d6;
        ShapeDrawable b02 = aob.b0(L2, aob.v0(i3, vnbVar));
        uob M = yob.M(i3);
        zt3Var.setBackground(b02);
        yob.j(zt3Var, b02, M, null, vnbVar);
        zt3Var.setText(strArr[0]);
        yt3Var.addTextChangedListener(new ry(strArr, nn0Var, false, (byte) 3));
        j.addView(zt3Var, tre.t(-1, -2, 55, 12, 8, 12, 0));
        i2.setText(ob6.M0(2131751319, null));
        j.addView(i2, tre.t(-1, 48, 55, 12, 12, 12, 12));
        nn0Var.run();
        h.O = j;
        h.I0 = new DialogInterface.OnDismissListener() { // from class: h72
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                yt3 yt3Var2 = zt3.this.d;
                yt3Var2.clearFocus();
                hl.t1(yt3Var2);
                boolean[] zArr3 = zArr;
                if (zArr3[0] || zArr2[0]) {
                    return;
                }
                String[] strArr2 = strArr;
                if (TextUtils.equals(str, strArr2[0])) {
                    return;
                }
                zArr3[0] = true;
                pccVar.a(strArr2[0]);
            }
        };
        h.show();
        int i4 = aob.a7;
        h.t0(i4);
        h.L(i4);
        i2.setOnClickListener(new nh(i2, zArr, pccVar, strArr, h, (byte) 6));
        hl.d3(new i72(zt3Var, 0 == true ? 1 : 0), 200L);
    }

    private int getEmojiPanelHeight() {
        int Q = this.b.o3.Q();
        if (Q <= 0) {
            SharedPreferences d1 = uc7.d1();
            Point point = hl.q;
            Q = d1.getInt(point.x > point.y ? "kbd_height_land3" : "kbd_height", hl.L(200.0f));
        }
        if (Q <= 0) {
            Q = hl.L(200.0f);
        }
        return Q + hl.n;
    }

    @Override // f12
    public final void A(int i, boolean z) {
        this.M = z;
        R();
        if (z && this.y && !this.E) {
            Q(false);
        }
        e0();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    @Override // f12
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(int i, int i2) {
        int L;
        int i3;
        fu5 fu5Var;
        boolean z = this.M;
        n12 n12Var = this.b;
        boolean z2 = n12Var.o3.Q() > hl.L(20.0f);
        this.M = z2;
        if (!z2 && z && (fu5Var = this.I) != null) {
            fu5Var.u();
            this.I = null;
        }
        if (this.M || this.F > hl.L(20.0f)) {
            L = hl.L(52.0f);
            n12Var.r0 = false;
        } else {
            if (!hl.O1()) {
                Point point = hl.q;
                if (point.x > point.y) {
                    i3 = (int) (i2 / 3.5f);
                    L = i3 - hl.L(52.0f);
                    if (L < 0) {
                        L = 0;
                    }
                    n12Var.r0 = true;
                }
            }
            i3 = (i2 / 5) << 1;
            L = i3 - hl.L(52.0f);
            if (L < 0) {
            }
            n12Var.r0 = true;
        }
        int currentActionBarHeight = a.getCurrentActionBarHeight() + hl.m + L;
        pi9 pi9Var = this.r;
        int w = uh9.w(110.0f, (this.M || this.F > 0) ? 0 : hl.n, (pi9Var.h3() || this.y || !n12Var.P2) ? 0 : hl.L(62.0f)) + this.F;
        if (pi9Var.getPaddingTop() != currentActionBarHeight || pi9Var.getPaddingBottom() != w) {
            this.O = true;
            pi9Var.r1(0, currentActionBarHeight, 0, w);
            this.O = false;
        }
        e0();
    }

    @Override // f12
    public final void H(f12 f12Var) {
        this.b.U2.setTitle("");
        this.r.g3.O(false);
        Y(false);
        post(new k72(this, (byte) 4));
    }

    @Override // f12
    public final void J() {
        this.r.A0(0);
    }

    @Override // f12
    public final boolean K(boolean z, int i, int i2, long j, boolean z2) {
        r47 r47Var;
        ou1 ou1Var;
        c5a c5aVar;
        long j2;
        r47 r47Var2;
        nr1 nr1Var;
        xy1 xy1Var;
        nr1 nr1Var2;
        int i3 = this.n;
        boolean D4 = uc7.s1(i3).D4();
        byte b = 0;
        pi9 pi9Var = this.r;
        if (!D4 && !yac.h(i3).p() && uj9.d(pi9Var.t3, pi9Var.u3)) {
            yg9.q0(this.a, getContext(), new m72(pi9Var, b), new k72(this, (byte) 2));
            return false;
        }
        if (pi9Var.h3() && !pi9Var.j3()) {
            if (pi9Var.J3()) {
                boolean D42 = uc7.s1(i3).D4();
                n12 n12Var = this.b;
                if (D42) {
                    ArrayList W2 = pi9Var.W2();
                    if (!W2.isEmpty()) {
                        ArrayList y2 = pi9Var.y2();
                        ArrayList v2 = pi9Var.v2();
                        ArrayList a = tj9.a(i3, W2);
                        e eVar = n12Var.Z1;
                        if (eVar instanceof zu1) {
                            zu1 zu1Var = (zu1) eVar;
                            r47 r47Var3 = zu1Var.F5;
                            r47 r47Var4 = zu1Var.m4;
                            ou1 ou1Var2 = zu1Var.D5;
                            long k7 = zu1Var.k7();
                            c5aVar = zu1Var.X6();
                            r47Var = r47Var4;
                            ou1Var = ou1Var2;
                            j2 = k7;
                            r47Var2 = r47Var3;
                        } else {
                            r47Var = null;
                            ou1Var = null;
                            c5aVar = null;
                            j2 = 0;
                            r47Var2 = null;
                        }
                        r7a.Q(k5.a(n12Var.G3), W2, y2, v2, a, n12Var.W0(), r47Var2, r47Var, ou1Var, z, i, i2, c5aVar, j, j2, 0L);
                        e eVar2 = n12Var.Z1;
                        if ((eVar2 instanceof zu1) && (nr1Var = ((zu1) eVar2).a0) != null && (xy1Var = nr1Var.O3) != null) {
                            xy1Var.x(null, z, i, i2, 0L);
                        }
                        n12Var.a(true);
                        return true;
                    }
                } else {
                    e eVar3 = n12Var.Z1;
                    if ((eVar3 instanceof zu1) && (nr1Var2 = ((zu1) eVar3).a0) != null) {
                        nr1Var2.D1(uj9.g(pi9Var.t3), z, i, i2);
                        n12Var.a(true);
                        return true;
                    }
                }
            } else {
                ui9 ui9Var = this.s;
                if (ui9Var != null) {
                    ui9Var.setSendEnabled(pi9Var.J3());
                    return false;
                }
            }
        }
        return false;
    }

    @Override // f12
    public final boolean M() {
        return !this.r.h3();
    }

    public final void O(fu5 fu5Var, mk0 mk0Var, TL_iv.PageBlock pageBlock, int i, String str, int i2, fu5 fu5Var2) {
        fu5Var.i(mk0Var != null && mk0Var.b.getClass() == pageBlock.getClass(), i, null, str, new ao1(this, mk0Var, pageBlock, fu5Var2, (byte) 7));
        fu5Var.z().a.setTypeface(hl.n1("fonts/mw_bold.ttf"));
        fu5Var.z().a.setTextSize(1, i2);
    }

    public final boolean P() {
        final byte b = 1;
        pi9 pi9Var = this.r;
        if (pi9Var == null || !pi9Var.h3()) {
            return true;
        }
        final byte b2 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.a, getContext());
        String M0 = ob6.M0(2131753986, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = ob6.M0(2131753987, null);
        alertDialog$Builder.g(ob6.M0(2131751563, null), new fd(this) { // from class: p72
            public final /* synthetic */ v72 b;

            {
                this.b = this;
            }

            @Override // fd
            public final void w(id idVar2, int i) {
                byte b3 = b2;
                v72 v72Var = this.b;
                switch (b3) {
                    case 0:
                        v72Var.b.dismiss();
                        break;
                    default:
                        v72Var.T();
                        v72Var.b.dismiss();
                        break;
                }
            }
        });
        alertDialog$Builder.j(ob6.M0(2131745674, null), new fd(this) { // from class: p72
            public final /* synthetic */ v72 b;

            {
                this.b = this;
            }

            @Override // fd
            public final void w(id idVar2, int i) {
                byte b3 = b;
                v72 v72Var = this.b;
                switch (b3) {
                    case 0:
                        v72Var.b.dismiss();
                        break;
                    default:
                        v72Var.T();
                        v72Var.b.dismiss();
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
            o24 o24Var = this.x;
            if (o24Var != null) {
                o24Var.r(false);
                if (!z) {
                    this.x.z();
                }
            }
        }
        this.G = null;
        o24 o24Var2 = this.x;
        if (o24Var2 != null) {
            o24Var2.setTranslationY(0.0f);
            this.x.setVisibility(8);
        }
        this.y = false;
        this.F = 0;
        ui9 ui9Var = this.s;
        if (ui9Var != null) {
            ui9Var.setEmojiOpened(false);
        }
        Y(false);
        requestLayout();
    }

    public final void R() {
        float f;
        float f2;
        int L = this.E ? hl.L(245.0f) : this.F;
        o24 o24Var = this.x;
        n12 n12Var = this.b;
        if (o24Var != null) {
            if (this.y) {
                f2 = (this.F - L) + (this.E ? -n12Var.i4 : 0.0f);
            } else {
                f2 = 0.0f;
            }
            o24Var.setTranslationY(f2);
        }
        ui9 ui9Var = this.s;
        if (ui9Var != null) {
            boolean z = this.y;
            if (z) {
                f = L;
            } else {
                f = (this.M || this.F > 0) ? 0 : hl.n;
            }
            if (!z || this.E) {
                f += n12Var.i4;
            }
            ui9Var.getBottomContainer().animate().cancel();
            ui9Var.getBottomContainer().setTranslationY(-f);
            boolean z2 = this.y;
            float f3 = z2 ? L : 0.0f;
            if (!z2 || this.E) {
                f3 += n12Var.i4;
            }
            ui9Var.setBottomGradientTranslationY(-f3);
            if (this.N != this.L) {
                ViewPropertyAnimator animate = ui9Var.getBottomInnerContainer().animate();
                this.N = this.L;
                animate.translationY(-r1).setDuration(320L).setInterpolator(k43.h).start();
            }
        }
    }

    public final void S(int i, int i2) {
        n12 n12Var = this.b;
        if (n12Var.Z1 == null) {
            return;
        }
        n12 n12Var2 = new n12(getContext(), n12Var.Z1, false, false, true, this.a);
        n12Var2.W3 = new s72(this, n12Var2);
        n12Var2.d2.g0();
        n12Var2.u1(1, true);
        n12Var2.Q0(i);
        n12Var2.t4 = new l72(this, n12Var2);
        n12Var2.S1 = new l72(this, n12Var2);
        n12Var2.R1 = new t72(this, n12Var2);
        n12Var2.a1();
        if (i2 != 0) {
            n12Var2.k1(i2);
        }
        n12Var2.w0(true);
        n12Var2.show();
    }

    public final boolean T() {
        e eVar = this.b.Z1;
        if (!(eVar instanceof zu1)) {
            return false;
        }
        zu1 zu1Var = (zu1) eVar;
        pi9 pi9Var = this.r;
        if (!pi9Var.n2()) {
            return false;
        }
        TL_iv.RichMessage f2 = pi9Var.f2();
        ls6.d0(k5.a(this.n).a).T1(zu1Var.a(), zu1Var.N5(zu1Var.F5), "", null, null, null, null, 0L, false, false, f2);
        nr1 nr1Var = zu1Var.a0;
        if (nr1Var == null) {
            return true;
        }
        nr1Var.setRichDraftPreview(f2);
        return true;
    }

    public final dg9 U() {
        pi9 pi9Var = this.r;
        dg9 focusedEditTextOrNull = pi9Var.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull == null) {
            dg9 dg9Var = this.G;
            return dg9Var != null ? dg9Var : pi9Var.M2();
        }
        this.G = focusedEditTextOrNull;
        this.H = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        return focusedEditTextOrNull;
    }

    public final int V(dg9 dg9Var) {
        return (dg9Var != this.G || this.r.getFocusedEditTextOrNull() == dg9Var) ? Math.max(0, dg9Var.getSelectionEnd()) : Math.min(this.H, dg9Var.length());
    }

    public final void X() {
        boolean z = this.y;
        pi9 pi9Var = this.r;
        if (z) {
            dg9 M2 = pi9Var.M2();
            if (M2 != null) {
                M2.O();
                hl.E3(M2);
            }
            Q(true);
            return;
        }
        if (this.x == null) {
            n12 n12Var = this.b;
            o24 o24Var = new o24(n12Var.Z1, true, false, false, getContext(), true, null, n12Var.o3, true, this.a, false, false);
            this.x = o24Var;
            o24Var.setVisibility(8);
            o24 o24Var2 = this.x;
            o24Var2.x2 = false;
            o24Var2.setBottomInset(hl.n);
            View view = this.x.w;
            if (view != null) {
                view.setVisibility(8);
            }
            this.x.setDelegate(new u72(this));
            addView(this.x, tre.e(-1, getEmojiPanelHeight(), 87));
        }
        int emojiPanelHeight = getEmojiPanelHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.x.getLayoutParams();
        layoutParams.height = emojiPanelHeight;
        this.x.setLayoutParams(layoutParams);
        this.x.setTranslationY(0.0f);
        this.x.setVisibility(0);
        this.y = true;
        this.F = emojiPanelHeight;
        dg9 M22 = pi9Var.M2();
        if (M22 != null) {
            hl.t1(M22);
        }
        ui9 ui9Var = this.s;
        if (ui9Var != null) {
            ui9Var.setEmojiOpened(true);
        }
        Y(false);
        requestLayout();
    }

    public final void Y(boolean z) {
        int i = 0;
        boolean z2 = this.r.h3() || this.y;
        n12 n12Var = this.b;
        m02 m02Var = n12Var.u3;
        if (n12Var.u4 != z2) {
            n12Var.u4 = z2;
            if (n12Var.P2) {
                m02Var.animate().cancel();
                if (!z2) {
                    m02Var.setVisibility(0);
                }
                if (z) {
                    m02Var.animate().alpha(z2 ? 0.0f : 1.0f).translationY(z2 ? hl.L(48.0f) : 0.0f).setDuration(180L).withEndAction(new h02(n12Var, z2, (byte) 3)).start();
                } else {
                    m02Var.setAlpha(z2 ? 0.0f : 1.0f);
                    m02Var.setTranslationY(z2 ? hl.L(48.0f) : 0.0f);
                    m02Var.setVisibility(z2 ? 4 : 0);
                }
            }
        }
        if (!z2 && !n12Var.L1 && n12Var.P2) {
            i = hl.L(62.0f);
        }
        this.L = i;
        R();
        if (this.K == z2) {
            this.K = !z2;
            requestLayout();
        }
    }

    public final void Z() {
        int i = 0;
        if (!(this.r.h3() || this.y)) {
            n12 n12Var = this.b;
            if (!n12Var.L1 && n12Var.P2) {
                i = hl.L(62.0f);
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
    public final void a0() {
        int i;
        boolean z;
        boolean z2;
        int max;
        int max2;
        int i2;
        pi9 pi9Var = this.r;
        amb textSelectionHelper = pi9Var.getTextSelectionHelper();
        ui9 ui9Var = this.s;
        if (ui9Var == null || textSelectionHelper == null || !textSelectionHelper.w()) {
            return;
        }
        int[] E4 = pi9Var.E4();
        ui9Var.setQuoteState(E4 != null && pi9Var.E3(E4[0], E4[1]));
        boolean I3 = pi9Var.I3();
        int[] iArr = R;
        if (I3) {
            amb textSelectionHelper2 = pi9Var.getTextSelectionHelper();
            int i3 = textSelectionHelper2.p0;
            int i4 = textSelectionHelper2.q0;
            int i5 = textSelectionHelper2.t0;
            int i6 = textSelectionHelper2.r0;
            int i7 = textSelectionHelper2.u0;
            int i8 = 0;
            for (int i9 = 0; i9 < 8; i9++) {
                int i10 = iArr[i9];
                if (this.r.H3(i10, i3, i4, i6, i5, i7)) {
                    i8 |= i10;
                }
            }
            boolean z3 = i4 == i5;
            dg9 R4 = z3 ? pi9Var.R4(i3, i4) : null;
            int max3 = Math.max(0, Math.min(i6, i7));
            int max4 = R4 == null ? 0 : Math.max(0, Math.min(Math.max(i6, i7), R4.length()));
            this.s.c(i8, R4 != null && max3 < max4 && mm9.h(R4.getText(), max3, max4), R4 != null && max3 < max4 && mm9.g(R4.getText(), max3, max4), z3, pi9Var.h2(), true);
            return;
        }
        if (pi9Var.t3()) {
            amb textSelectionHelper3 = pi9Var.getTextSelectionHelper();
            dg9 p2 = pi9Var.p2(textSelectionHelper3.p0);
            int i11 = textSelectionHelper3.r0;
            int i12 = textSelectionHelper3.u0;
            if (p2 == null) {
                max2 = 0;
                max = 0;
            } else {
                max = Math.max(0, Math.min(Math.min(i11, i12), p2.length()));
                max2 = Math.max(0, Math.min(Math.max(i11, i12), p2.length()));
            }
            if (p2 == null || max >= max2) {
                i2 = 0;
            } else {
                int i13 = 0;
                for (int i14 = 0; i14 < 8; i14++) {
                    int i15 = iArr[i14];
                    if ((p2.c(max, max2) & i15) != 0) {
                        i13 |= i15;
                    }
                }
                i2 = i13;
            }
            this.s.c(i2, p2 != null && max < max2 && mm9.h(p2.getText(), max, max2), p2 != null && max < max2 && mm9.g(p2.getText(), max, max2), true, pi9Var.h2(), true);
            return;
        }
        int i16 = textSelectionHelper.p0;
        int i17 = textSelectionHelper.s0;
        int i18 = textSelectionHelper.r0;
        int i19 = textSelectionHelper.u0;
        boolean z4 = i16 >= 0 && i17 >= 0 && i17 >= i16 && i17 < pi9Var.x4.size();
        if (z4) {
            int i20 = 0;
            int i21 = 0;
            while (i20 < 8) {
                int i22 = iArr[i20];
                int i23 = i19;
                if (this.r.G3(i22, i16, i18, i17, i23)) {
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
            Editable K4 = pi9Var.K4(i16, i18, i17, i24);
            if (K4 == null ? false : mm9.h(K4, Math.max(0, Math.min(i18, i24)), Math.max(i18, i24))) {
                z = true;
                if (z4) {
                    Editable K42 = pi9Var.K4(i16, i18, i17, i24);
                    if (K42 == null ? false : mm9.g(K42, Math.max(0, Math.min(i18, i24)), Math.max(i18, i24))) {
                        z2 = true;
                        this.s.c(i, z, z2, !z4 && i16 == i17, pi9Var.h2(), !pi9Var.F3());
                    }
                }
                z2 = false;
                if (z4) {
                }
                this.s.c(i, z, z2, !z4 && i16 == i17, pi9Var.h2(), !pi9Var.F3());
            }
        }
        z = false;
        if (z4) {
        }
        z2 = false;
        if (z4) {
        }
        this.s.c(i, z, z2, !z4 && i16 == i17, pi9Var.h2(), !pi9Var.F3());
    }

    public final void b0() {
        ui9 ui9Var = this.s;
        if (ui9Var != null) {
            pi9 pi9Var = this.r;
            boolean n2 = pi9Var.n2();
            ch9 ch9Var = pi9Var.R3;
            boolean z = (ch9Var == null || ch9Var.c.isEmpty()) ? false : true;
            ImageView imageView = ui9Var.r;
            ImageView imageView2 = ui9Var.n;
            imageView2.setEnabled(n2);
            imageView2.setAlpha(n2 ? 1.0f : 0.35f);
            imageView.setEnabled(z);
            imageView.setAlpha(z ? 1.0f : 0.35f);
        }
    }

    public final void c0() {
        ui9 ui9Var = this.s;
        if (ui9Var != null) {
            int i = this.n;
            boolean z = false;
            boolean z2 = (uc7.s1(i).D4() || yac.h(i).p()) ? false : true;
            bz1 sendButton = ui9Var.getSendButton();
            if (z2) {
                pi9 pi9Var = this.r;
                if (uj9.d(pi9Var.t3, pi9Var.u3)) {
                    z = true;
                }
            }
            sendButton.setLocked(z);
            ui9Var.setPremiumLocked(z2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0068, code lost:
    
        if ((r7 instanceof org.telegram.tgnet.tl.TL_iv.pageBlockPullquote) == false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d0() {
        mk0 N2;
        ui9 ui9Var = this.s;
        if (ui9Var == null) {
            return;
        }
        pi9 pi9Var = this.r;
        amb textSelectionHelper = pi9Var.getTextSelectionHelper();
        if (textSelectionHelper == null || !textSelectionHelper.w()) {
            N2 = pi9Var.N2();
        } else {
            int i = textSelectionHelper.p0;
            N2 = i == textSelectionHelper.s0 ? pi9Var.B4(i) : null;
        }
        int i2 = 4;
        int i3 = 0;
        if (pi9Var.O2() == null) {
            if (N2 != null) {
                if (!N2.a() && !N2.b() && !N2.c()) {
                    TL_iv.PageBlock pageBlock = N2.b;
                    if (!(pageBlock instanceof TL_iv.pageBlockDetails)) {
                        if (!(pageBlock instanceof TL_iv.pageBlockTable)) {
                            if (pageBlock instanceof TL_iv.pageBlockMath) {
                                i2 = 7;
                            } else {
                                if (!pi9.z3(pageBlock)) {
                                    TL_iv.PageBlock pageBlock2 = N2.b;
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
        if (N2 != null) {
            if (i2 == 1) {
                TL_iv.PageBlock pageBlock3 = N2.b;
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
                if (N2.a()) {
                    i3 = R.drawable.iv_todo;
                } else if (N2.c()) {
                    i3 = R.drawable.iv_ordered_list;
                }
            }
        }
        ui9Var.d(i2, i3);
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.i5) {
            c0();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        pi9 pi9Var = this.r;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if ((this.b.Z1 instanceof zu1) && pi9Var.n2() && T()) {
                bs2.v(null, 2131745730, new d31(this.s, this.a), R.raw.contact_check, 36);
                return true;
            }
        } else if (!pi9Var.e3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        o24 o24Var;
        pi9 pi9Var = this.r;
        di9 di9Var = pi9Var.v3;
        lmb lmbVar = pi9Var.w3;
        if (di9Var.w() && lmbVar.onTouchEvent(motionEvent)) {
            return true;
        }
        int height = (((!this.E || (o24Var = this.x) == null) ? getHeight() - this.F : (int) o24Var.getY()) - hl.L(60.0f)) - this.L;
        if (motionEvent.getAction() == 0 && this.y && motionEvent.getY() < height) {
            Q(false);
        }
        if ((motionEvent.getAction() != 0 || (motionEvent.getY() > hl.L(60.0f) && motionEvent.getY() < height)) && lmbVar.b(motionEvent)) {
            motionEvent.setAction(3);
        }
        if (motionEvent.getY() >= height || !pi9Var.f3(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // f12
    public final boolean e() {
        return true;
    }

    public final void e0() {
        int paddingTop;
        ui9 ui9Var = this.s;
        if (ui9Var == null) {
            return;
        }
        int currentActionBarHeight = (((a.getCurrentActionBarHeight() - hl.L(44.0f)) / 2) + hl.m) - hl.L(8.0f);
        pi9 pi9Var = this.r;
        if (pi9Var.getChildCount() <= 0) {
            paddingTop = pi9Var.getPaddingTop();
        } else {
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < pi9Var.getChildCount(); i2++) {
                View childAt = pi9Var.getChildAt(i2);
                if (RecyclerView.S(childAt) >= 0 && childAt.getTop() < i) {
                    i = childAt.getTop();
                }
            }
            paddingTop = i == Integer.MAX_VALUE ? pi9Var.getPaddingTop() : i;
        }
        ui9Var.setTopButtonsOffset(Math.max(currentActionBarHeight, paddingTop));
    }

    @Override // f12
    public int getCurrentItemTop() {
        pi9 pi9Var = this.r;
        if (pi9Var.getChildCount() <= 0) {
            int paddingTop = pi9Var.getPaddingTop();
            this.J = paddingTop;
            pi9Var.setTopGlowOffset(paddingTop);
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        boolean z = false;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < pi9Var.getChildCount(); i2++) {
            View childAt = pi9Var.getChildAt(i2);
            int S = RecyclerView.S(childAt);
            if (S == 0) {
                z = true;
            }
            if (S >= 0 && childAt.getTop() < i) {
                i = childAt.getTop();
            }
        }
        if (i == Integer.MAX_VALUE) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        pi9Var.setTopGlowOffset(Math.max(0, i));
        int i3 = i - hl.m;
        int L = hl.L(7.0f);
        if (i3 < hl.L(7.0f) || !z) {
            i3 = L;
        }
        this.J = i3;
        return i3;
    }

    @Override // f12
    public int getFirstOffset() {
        return hl.L(56.0f) + getListTopPadding();
    }

    @Override // f12
    public int getListTopPadding() {
        return (this.r.getPaddingTop() - hl.m) - a.getCurrentActionBarHeight();
    }

    public amb getTextSelectionHelper() {
        return this.r.getTextSelectionHelper();
    }

    @Override // f12
    public final int j() {
        return 0;
    }

    @Override // f12
    public final boolean k() {
        boolean z = this.E;
        if (z) {
            if (z) {
                this.E = false;
                o24 o24Var = this.x;
                if (o24Var != null) {
                    o24Var.r(false);
                    this.x.z();
                }
                R();
                return false;
            }
        } else {
            if (this.y) {
                Q(false);
                return false;
            }
            if (!this.r.C2() && !P()) {
                return true;
            }
        }
        return false;
    }

    @Override // f12
    public final void m(float f) {
        R();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jn7.f(this.n).b(this, jn7.i5);
        c0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.f(this.n).n(this, jn7.i5);
    }

    @Override // f12
    public final void p() {
        q67 q67Var = this.P;
        if (q67Var != null) {
            q67Var.g();
            this.P = null;
        }
        xq2 xq2Var = this.w;
        if (xq2Var != null) {
            xq2Var.n();
        }
        pi9 pi9Var = this.r;
        if (pi9Var != null) {
            pi9Var.s2();
        }
        o24 o24Var = this.x;
        if (o24Var != null) {
            o24Var.A();
        }
    }

    @Override // f12
    public final boolean q() {
        pi9 pi9Var = this.r;
        if (pi9Var == null) {
            return false;
        }
        pi9Var.s2();
        return false;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.O) {
            return;
        }
        super.requestLayout();
    }

    @Override // f12
    public final boolean s() {
        return P();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.b.b.invalidate();
        invalidate();
    }

    @Override // f12
    public final void v() {
        xq2 xq2Var = this.w;
        if (xq2Var != null) {
            xq2Var.n();
        }
        if (this.y) {
            Q(false);
        }
    }

    @Override // f12
    public final void z() {
        this.M = this.b.o3.Q() > hl.L(20.0f);
        R();
        e0();
    }

    @Override // f12
    public final void u() {
    }
}
