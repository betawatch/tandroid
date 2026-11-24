// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class vz9 extends FrameLayout implements jm7, vlb {
    public static String[] c2;
    public final SparseIntArray A0;
    public boolean A1;
    public final ArrayList B0;
    public String B1;
    public final ArrayList C0;
    public ArrayList C1;
    public boolean D0;
    public ArrayList D1;
    public int E;
    public final ArrayList E0;
    public ArrayList E1;
    public int F;
    public final ArrayList F0;
    public ArrayList F1;
    public int G;
    public final ArrayList G0;
    public ValueAnimator G1;
    public az9 H;
    public final ArrayList H0;
    public boolean H1;
    public tz9 I;
    public final ArrayList I0;
    public boolean I1;
    public boolean J;
    public final ArrayList J0;
    public ValueAnimator J1;
    public HashSet K;
    public ArrayList K0;
    public zx9 K1;
    public final HashSet L;
    public final ArrayList L0;
    public hy6 L1;
    public final Paint M;
    public ArrayList M0;
    public boolean M1;
    public final Paint N;
    public final ArrayList N0;
    public boolean N1;
    public Drawable O;
    public final boolean O0;
    public View O1;
    public fz9 P;
    public boolean P0;
    public int P1;
    public boolean Q;
    public Integer Q0;
    public int Q1;
    public boolean R;
    public boolean R0;
    public long R1;
    public boolean S;
    public List S0;
    public yxa S1;
    public final ArrayList T;
    public fz9 T0;
    public final zx9 T1;
    public boolean U;
    public boolean U0;
    public final zx9 U1;
    public wy9 V;
    public float V0;
    public lz9 V1;
    public final int W;
    public final ImageReceiver W0;
    public ValueAnimator W1;
    public vm X0;
    public ValueAnimator X1;
    public ly9 Y0;
    public final po Y1;
    public final Integer Z0;
    public final Paint Z1;
    public int a;
    public final int a0;
    public final ylb a1;
    public Integer a2;
    public int b;
    public final qy9 b0;
    public float b1;
    public int c;
    public final a91 c0;
    public float c1;
    public int d;
    public final mz3[] d0;
    public final d d1;
    public int e;
    public mz3 e0;
    public final byte e1;
    public int f;
    public final oy9 f0;
    public final uy9 f1;
    public final ny9 g0;
    public int g1;
    public int h;
    public final ct8 h0;
    public boolean h1;
    public final ty9 i0;
    public boolean i1;
    public final jy9 j0;
    public ValueAnimator j1;
    public final FrameLayout k0;
    public Drawable k1;
    public final qw9 l0;
    public PorterDuffColorFilter l1;
    public final bf0 m0;
    public final boolean m1;
    public int n;
    public final View n0;
    public float n1;
    public final o72 o0;
    public int o1;
    public final View p0;
    public tm p1;
    public final vy9 q0;
    public Rect q1;
    public int r;
    public final gz9 r0;
    public View r1;
    public int s;
    public final ky9 s0;
    public float s1;
    public final cw6 t0;
    public fz9 t1;
    public final View u0;
    public Rect u1;
    public int v0;
    public final OvershootInterpolator v1;
    public int w;
    public final ArrayList w0;
    public ValueAnimator w1;
    public int x;
    public final SparseIntArray x0;
    public boolean x1;
    public int y;
    public final SparseIntArray y0;
    public boolean y1;
    public final SparseIntArray z0;
    public boolean z1;
    public static final List b2 = Arrays.asList("😖", "😫", "🫠", "😨", "❓");
    public static final boolean[] d2 = new boolean[4];
    public static final HashMap e2 = new HashMap();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x042a A[EDGE_INSN: B:169:0x042a->B:170:0x042a BREAK  A[LOOP:0: B:118:0x038d->B:153:0x041a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x070f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x074d  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0758  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vz9(d dVar, Context context, boolean z, Integer num, int i, boolean z2, ylb ylbVar, int i2, int i3) {
        super(context);
        int i4;
        float f;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        float f2;
        jy9 jy9Var;
        float f3;
        int i10;
        boolean z3;
        Integer num2;
        boolean z4;
        Integer num3;
        boolean z5;
        int i11 = i;
        int i12 = i3;
        this.K = new HashSet();
        this.L = new HashSet();
        Paint paint = new Paint(1);
        this.M = paint;
        Paint paint2 = new Paint(1);
        this.N = paint2;
        this.T = new ArrayList();
        this.W = z8c.t0;
        this.d0 = new mz3[2];
        this.w0 = new ArrayList();
        this.x0 = new SparseIntArray();
        this.y0 = new SparseIntArray();
        this.z0 = new SparseIntArray();
        this.A0 = new SparseIntArray();
        this.B0 = new ArrayList();
        this.C0 = new ArrayList();
        this.D0 = false;
        this.E0 = new ArrayList();
        this.F0 = new ArrayList();
        this.G0 = new ArrayList();
        this.H0 = new ArrayList();
        this.I0 = new ArrayList();
        this.J0 = new ArrayList();
        this.K0 = new ArrayList();
        this.L0 = new ArrayList();
        this.M0 = new ArrayList();
        this.N0 = new ArrayList();
        this.O0 = false;
        this.P0 = false;
        this.R0 = true;
        this.W0 = new ImageReceiver(null);
        this.i1 = true;
        this.n1 = 1.0f;
        this.s1 = 1.0f;
        this.v1 = new OvershootInterpolator(2.0f);
        this.x1 = false;
        this.y1 = false;
        this.z1 = false;
        this.A1 = false;
        this.H1 = false;
        this.I1 = false;
        this.M1 = false;
        this.N1 = false;
        this.P1 = -1;
        this.Q1 = -1;
        this.R1 = -1L;
        this.T1 = new zx9(this, (byte) 3);
        this.U1 = new zx9(this, (byte) 4);
        this.Y1 = new po(null);
        this.Z1 = new Paint();
        this.a1 = ylbVar;
        this.a0 = i11;
        this.O0 = z;
        this.d1 = dVar;
        SharedPreferences d1 = oc7.d1();
        StringBuilder sb = new StringBuilder("emoji");
        sb.append((i11 == 0 || i11 == 12 || i11 == 9 || i11 == 10) ? "status" : "reaction");
        sb.append("usehint");
        this.P0 = d1.getInt(sb.toString(), 0) < 3;
        this.g1 = i12;
        this.m1 = i12 == cmb.v0(cmb.u6, ylbVar);
        paint.setColor(cmb.v0(cmb.h6, ylbVar));
        paint2.setColor(on2.p(i12, 30));
        this.l1 = new PorterDuffColorFilter(i12, PorterDuff.Mode.SRC_IN);
        this.Z0 = num;
        Integer valueOf = num == null ? null : Integer.valueOf(pqe.b(num.intValue(), gm.L(26.0f), gm.L(292.0f)));
        boolean z6 = valueOf != null && valueOf.intValue() > gm.L(170.0f);
        setFocusableInTouchMode(true);
        byte b = 15;
        if (i11 == 0 || i11 == 12 || i11 == 9 || i11 == 10 || i11 == 2 || i11 == 5 || i11 == 7) {
            this.e1 = i2;
            setPadding(gm.L(4.0f), gm.L(4.0f), gm.L(4.0f), gm.L(4.0f));
            setOnTouchListener(new a7(this, b));
        }
        if (valueOf != null) {
            View view = new View(context);
            this.n0 = view;
            Drawable mutate = getResources().getDrawable(R.drawable.shadowed_bubble1).mutate();
            anb.x(this, mutate, cmb.F8, ylbVar, PorterDuff.Mode.MULTIPLY);
            view.setBackground(mutate);
            addView(view, qoe.d(10, 10.0f, (m() ? 80 : 48) | 3, (valueOf.intValue() / gm.p) + (z6 ? -12 : 4), m() ? (byte) 0 : this.e1, 0.0f, m() ? this.e1 : (byte) 0));
        }
        a91 a91Var = new a91((Object) this, context, (Object) ylbVar, (byte) 18);
        this.c0 = a91Var;
        boolean z7 = i11 == 3 || i11 == 4;
        Integer num4 = valueOf;
        qy9 qy9Var = new qy9(this, context, z7, z7, ylbVar, num4);
        Integer num5 = num4;
        ylb ylbVar2 = ylbVar;
        this.b0 = qy9Var;
        if (!z7) {
            qy9Var.setOutlineProvider(new ry9(this, num5));
            qy9Var.setClipToOutline(true);
            if (z7) {
                qy9Var.setElevation(2.0f);
            }
        }
        if (i11 == 0 || i11 == 12 || i11 == 9 || i11 == 10 || i11 == 2 || i11 == 5 || i11 == 15) {
            qy9Var.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
        }
        qy9Var.addView(a91Var, qoe.c(-1.0f, -1));
        if (i11 == 0 || i11 == 12 || i11 == 9 || i11 == 2) {
            i4 = 7;
        } else {
            i4 = 7;
            if (i11 != 7) {
                f = 0.0f;
                addView(qy9Var, qoe.d(-1, -1.0f, nm7.D1, 0.0f, f, 0.0f, !m() ? this.e1 + 6 : 0.0f));
                if (num5 == null) {
                    i6 = 14;
                    o72 o72Var = new o72(context, (byte) 24);
                    this.o0 = o72Var;
                    Drawable drawable = getResources().getDrawable(R.drawable.shadowed_bubble2_half);
                    anb.x(this, drawable, cmb.F8, ylbVar2, PorterDuff.Mode.MULTIPLY);
                    o72Var.setBackground(drawable);
                    i5 = 3;
                    addView(o72Var, qoe.d(17, 9.0f, (m() ? 80 : 48) | 3, (num5.intValue() / gm.p) + (z6 ? -25 : 10), m() ? 0.0f : this.e1 + 5, 0.0f, m() ? this.e1 + 14 : 0.0f));
                } else {
                    i5 = 3;
                    i6 = 14;
                }
                boolean z8 = (dVar != null || i11 == i5 || i11 == 6 || i11 == 5 || i11 == i4 || i11 == 4 || i11 == 9 || i11 == 10 || !z2) ? false : true;
                i7 = 0;
                while (true) {
                    if (i7 < 2) {
                        break;
                    }
                    Integer num6 = num5;
                    if (i11 != 4) {
                        num2 = num6;
                        z4 = true;
                    } else {
                        num2 = num6;
                        z4 = false;
                    }
                    if (i11 == 0 || i11 == 12 || i11 == 9 || i11 == 10) {
                        num3 = num2;
                        z5 = true;
                    } else {
                        num3 = num2;
                        z5 = false;
                    }
                    Integer num7 = num3;
                    int i13 = i7;
                    ylb ylbVar3 = ylbVar2;
                    int i14 = i11;
                    int i15 = i6;
                    sy9 sy9Var = new sy9(this, context, ylbVar3, z4, z5, i14, z8 ? new il9(this, dVar, (byte) 21) : null, i12, i);
                    jz3 jz3Var = sy9Var.y;
                    if (jz3Var != null) {
                        jz3Var.setOnLongClickListener(new au(this, (byte) 15));
                    }
                    sy9Var.U = false;
                    if (i14 == 4) {
                        sy9Var.setAnimatedEmojiCacheType(13);
                    } else {
                        sy9Var.setAnimatedEmojiCacheType((i14 == 0 || i14 == 12 || i14 == 2) ? 6 : 5);
                    }
                    sy9Var.O = num7 == null;
                    sy9Var.setPaddingLeft(i14 == 6 ? 10.0f : 5.0f);
                    if (i14 != i15 && i14 != 8 && i14 != 13) {
                        this.b0.addView(sy9Var, qoe.c(36.0f, -1));
                    }
                    this.d0[i13] = sy9Var;
                    i12 = i3;
                    i11 = i14;
                    i6 = i15;
                    ylbVar2 = ylbVar3;
                    i7 = i13 + 1;
                    num5 = num7;
                }
                Integer num8 = num5;
                ylb ylbVar4 = ylbVar2;
                i8 = i11;
                i9 = i6;
                mz3[] mz3VarArr = this.d0;
                this.e0 = mz3VarArr[0];
                mz3VarArr[1].setVisibility(8);
                oy9 oy9Var = new oy9(context, num8, (byte) 1);
                this.f0 = oy9Var;
                anb.h(cmb.c7, ylbVar4, oy9Var);
                if (i8 != i9 || i8 == 8 || i8 == 13) {
                    f2 = 1.0f;
                } else {
                    f2 = 1.0f;
                    this.b0.addView(oy9Var, qoe.d(-1, 1.0f / gm.p, 48, 0.0f, 36.0f, 0.0f, 0.0f));
                }
                gm.T3(oy9Var, true, f2, true, false);
                ty9 ty9Var = new ty9(this, context, i8);
                this.i0 = ty9Var;
                uy9 uy9Var = new uy9();
                this.f1 = uy9Var;
                uy9Var.c = (short) 220;
                uy9Var.e = (short) 260;
                uy9Var.f = (short) 160;
                uy9Var.g = (short) 160;
                uy9Var.m = false;
                d53 d53Var = d53.h;
                uy9Var.i = d53Var;
                uy9Var.C = false;
                ty9Var.setItemAnimator(uy9Var);
                ty9Var.setPadding(gm.L(5.0f), gm.L(2.0f), gm.L(5.0f), gm.L(38.0f));
                vy9 vy9Var = new vy9(this);
                this.q0 = vy9Var;
                ty9Var.setAdapter(vy9Var);
                ky9 ky9Var = new ky9(this, (byte) 1);
                this.s0 = ky9Var;
                ty9Var.setLayoutManager(ky9Var);
                ky9Var.O = new iy9(this, (byte) 0);
                ct8 ct8Var = new ct8(context, (byte) 5);
                this.h0 = ct8Var;
                qw9 qw9Var = new qw9(this, context);
                this.l0 = qw9Var;
                qw9Var.addView(ty9Var, qoe.d(-1, -1.0f, nm7.D1, 0.0f, 0.0f, 0.0f, 0.0f));
                ct8Var.addView(qw9Var, qoe.d(-1, -1.0f, nm7.D1, 0.0f, 0.0f, 0.0f, 0.0f));
                jy9Var = new jy9(this, context);
                this.j0 = jy9Var;
                if (jy9Var.getItemAnimator() == null) {
                    f3 = 38.0f;
                    jy9Var.getItemAnimator().n(180L);
                    jy9Var.getItemAnimator().i = d53Var;
                } else {
                    f3 = 38.0f;
                }
                TextView textView = new TextView(context);
                if (i8 != 4) {
                    textView.setText(jb6.M0(2131747946, null));
                } else if (i8 == 0 || i8 == 13 || i8 == 12 || i8 == 11 || i8 == 9 || i8 == 10) {
                    textView.setText(jb6.M0(2131747947, null));
                } else if (i8 == 1 || i8 == 2) {
                    textView.setText(jb6.M0(2131747908, null));
                } else if (i8 == i9) {
                    textView.setText(jb6.M0(2131747948, null));
                } else {
                    textView.setText(jb6.M0(2131747937, null));
                }
                textView.setTextSize(1, 14.0f);
                anb.X(textView, cmb.Cf, ylbVar4);
                bf0 bf0Var = new bf0(context);
                this.m0 = bf0Var;
                FrameLayout frameLayout = new FrameLayout(context);
                this.k0 = frameLayout;
                float f4 = f2;
                frameLayout.addView(bf0Var, qoe.d(36, 36.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
                frameLayout.addView(textView, qoe.d(-2, -2.0f, 49, 0.0f, 60.0f, 0.0f, 0.0f));
                frameLayout.setVisibility(8);
                frameLayout.setAlpha(0.0f);
                ct8Var.addView(frameLayout, qoe.d(-1, -2.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
                jy9Var.setPadding(gm.L(5.0f), gm.L(54.0f), gm.L(5.0f), gm.L(f3));
                gz9 gz9Var = new gz9(this);
                this.r0 = gz9Var;
                jy9Var.setAdapter(gz9Var);
                ky9 ky9Var2 = new ky9(this, (byte) 0);
                jy9Var.setLayoutManager(ky9Var2);
                ky9Var2.O = new iy9(this, (byte) 1);
                jy9Var.setVisibility(8);
                ct8Var.addView(jy9Var, qoe.d(-1, -1.0f, nm7.D1, 0.0f, 0.0f, 0.0f, 0.0f));
                this.b0.addView(ct8Var, qoe.d(-1, -1.0f, 48, 0.0f, (i8 != 8 || i8 == 13 || i8 == i9) ? 0.0f : (f4 / gm.p) + 36.0f, 0.0f, 0.0f));
                cw6 cw6Var = new cw6(ty9Var, ky9Var);
                this.t0 = cw6Var;
                cw6Var.r = new qw3(this, (byte) 2);
                cw6Var.n = new ay9(this);
                my9 my9Var = new my9(this, i8, context, ylbVar4, num);
                ty9Var.X0 = my9Var;
                pu4 pu4Var = (pu4) ty9Var.L1.b;
                pu4Var.t = true;
                pu4Var.u = (long) (ViewConfiguration.getLongPressTimeout() * 0.25f);
                jy9Var.X0 = my9Var;
                pu4 pu4Var2 = (pu4) jy9Var.L1.b;
                pu4Var2.t = true;
                pu4Var2.u = (long) (ViewConfiguration.getLongPressTimeout() * 0.25f);
                eu9 eu9Var = new eu9(this, i8, (byte) 1);
                ty9Var.setOnItemClickListener(eu9Var);
                jy9Var.setOnItemClickListener(eu9Var);
                ny9 ny9Var = new ny9(this, context, z2);
                this.g0 = ny9Var;
                ny9Var.setTranslationY(-gm.L(52.0f));
                ny9Var.setVisibility(4);
                ct8Var.addView(ny9Var, qoe.d(-1, 52.0f, 48, 0.0f, -4.0f, 0.0f, 0.0f));
                oy9 oy9Var2 = new oy9(context, num8, (byte) 0);
                Drawable drawable2 = getResources().getDrawable(R.drawable.gradient_top);
                int i16 = cmb.F8;
                wmb K = anb.K(0.8f, i16);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                anb.k(oy9Var2, drawable2, K.a, -1, 2, K.d, ylbVar, mode);
                oy9Var2.setBackground(drawable2);
                oy9Var2.setAlpha(0.0f);
                this.b0.addView(oy9Var2, qoe.d(-1, 20.0f, 55, 0.0f, (f4 / gm.p) + 36.0f, 0.0f, 0.0f));
                View view2 = new View(context);
                this.p0 = view2;
                Drawable drawable3 = getResources().getDrawable(R.drawable.gradient_bottom);
                anb.x(this, drawable3, i16, ylbVar, mode);
                if (i == i9) {
                    view2.setBackground(drawable3);
                }
                view2.setAlpha(0.0f);
                this.b0.addView(view2, qoe.e(-1, 20, 87));
                View view3 = new View(context);
                this.u0 = view3;
                view3.setAlpha(0.0f);
                view3.setBackgroundColor(-16777216);
                this.b0.addView(view3, qoe.c(-1.0f, -1));
                int i17 = this.W;
                hs6.d0(i17);
                hs6.d0(i17).D(5);
                if (i != i9) {
                    oc7.r1(this.W).D0();
                } else if (i == 1 || i == 11 || i == 2 || i == 6 || i == 13) {
                    hs6.d0(i17).C();
                } else if (i == 9 || i == 10) {
                    if (oc7.r1(i17).X3.getBoolean("resetemojipacks", true)) {
                        hs6.d0(i17).b1(5, false, false);
                        oc7.r1(i17).X3.edit().putBoolean("resetemojipacks", false).commit();
                    }
                    hs6.d0(i17).N(2, false);
                    hs6.d0(i17).Z0();
                    hs6.d0(i17).n0(new TLRPC.TL_inputStickerSetEmojiChannelDefaultStatuses(), false);
                } else if (i == 0 || i == 12) {
                    hs6.d0(i17).N(0, true);
                    hs6.d0(i17).n0(new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
                } else if (i == 3) {
                    hs6.d0(i17).x();
                } else if (i == 4) {
                    hs6.d0(i17).X0(false, true, false, 0);
                    hs6.d0(i17).D(0);
                }
                this.W0.m0(7);
                i10 = this.a0;
                if (i10 != 3 || i10 == 4 || i10 == 6) {
                    z3 = true;
                } else {
                    ix2 ix2Var = fn5.z().p;
                    if (((CountDownLatch) ix2Var.c) == null) {
                        z3 = true;
                        ix2Var.c = new CountDownLatch(1);
                    } else {
                        z3 = true;
                    }
                    oi5.g = z3;
                }
                B(z3, false, z3);
            }
        }
        f = this.e1 + 6;
        addView(qy9Var, qoe.d(-1, -1.0f, nm7.D1, 0.0f, f, 0.0f, !m() ? this.e1 + 6 : 0.0f));
        if (num5 == null) {
        }
        if (dVar != null) {
        }
        i7 = 0;
        while (true) {
            if (i7 < 2) {
            }
            this.d0[i13] = sy9Var;
            i12 = i3;
            i11 = i14;
            i6 = i15;
            ylbVar2 = ylbVar3;
            i7 = i13 + 1;
            num5 = num7;
        }
        Integer num82 = num5;
        ylb ylbVar42 = ylbVar2;
        i8 = i11;
        i9 = i6;
        mz3[] mz3VarArr2 = this.d0;
        this.e0 = mz3VarArr2[0];
        mz3VarArr2[1].setVisibility(8);
        oy9 oy9Var3 = new oy9(context, num82, (byte) 1);
        this.f0 = oy9Var3;
        anb.h(cmb.c7, ylbVar42, oy9Var3);
        if (i8 != i9) {
        }
        f2 = 1.0f;
        gm.T3(oy9Var3, true, f2, true, false);
        ty9 ty9Var2 = new ty9(this, context, i8);
        this.i0 = ty9Var2;
        uy9 uy9Var2 = new uy9();
        this.f1 = uy9Var2;
        uy9Var2.c = (short) 220;
        uy9Var2.e = (short) 260;
        uy9Var2.f = (short) 160;
        uy9Var2.g = (short) 160;
        uy9Var2.m = false;
        d53 d53Var2 = d53.h;
        uy9Var2.i = d53Var2;
        uy9Var2.C = false;
        ty9Var2.setItemAnimator(uy9Var2);
        ty9Var2.setPadding(gm.L(5.0f), gm.L(2.0f), gm.L(5.0f), gm.L(38.0f));
        vy9 vy9Var2 = new vy9(this);
        this.q0 = vy9Var2;
        ty9Var2.setAdapter(vy9Var2);
        ky9 ky9Var3 = new ky9(this, (byte) 1);
        this.s0 = ky9Var3;
        ty9Var2.setLayoutManager(ky9Var3);
        ky9Var3.O = new iy9(this, (byte) 0);
        ct8 ct8Var2 = new ct8(context, (byte) 5);
        this.h0 = ct8Var2;
        qw9 qw9Var2 = new qw9(this, context);
        this.l0 = qw9Var2;
        qw9Var2.addView(ty9Var2, qoe.d(-1, -1.0f, nm7.D1, 0.0f, 0.0f, 0.0f, 0.0f));
        ct8Var2.addView(qw9Var2, qoe.d(-1, -1.0f, nm7.D1, 0.0f, 0.0f, 0.0f, 0.0f));
        jy9Var = new jy9(this, context);
        this.j0 = jy9Var;
        if (jy9Var.getItemAnimator() == null) {
        }
        TextView textView2 = new TextView(context);
        if (i8 != 4) {
        }
        textView2.setTextSize(1, 14.0f);
        anb.X(textView2, cmb.Cf, ylbVar42);
        bf0 bf0Var2 = new bf0(context);
        this.m0 = bf0Var2;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.k0 = frameLayout2;
        float f42 = f2;
        frameLayout2.addView(bf0Var2, qoe.d(36, 36.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
        frameLayout2.addView(textView2, qoe.d(-2, -2.0f, 49, 0.0f, 60.0f, 0.0f, 0.0f));
        frameLayout2.setVisibility(8);
        frameLayout2.setAlpha(0.0f);
        ct8Var2.addView(frameLayout2, qoe.d(-1, -2.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        jy9Var.setPadding(gm.L(5.0f), gm.L(54.0f), gm.L(5.0f), gm.L(f3));
        gz9 gz9Var2 = new gz9(this);
        this.r0 = gz9Var2;
        jy9Var.setAdapter(gz9Var2);
        ky9 ky9Var22 = new ky9(this, (byte) 0);
        jy9Var.setLayoutManager(ky9Var22);
        ky9Var22.O = new iy9(this, (byte) 1);
        jy9Var.setVisibility(8);
        ct8Var2.addView(jy9Var, qoe.d(-1, -1.0f, nm7.D1, 0.0f, 0.0f, 0.0f, 0.0f));
        this.b0.addView(ct8Var2, qoe.d(-1, -1.0f, 48, 0.0f, (i8 != 8 || i8 == 13 || i8 == i9) ? 0.0f : (f42 / gm.p) + 36.0f, 0.0f, 0.0f));
        cw6 cw6Var2 = new cw6(ty9Var2, ky9Var3);
        this.t0 = cw6Var2;
        cw6Var2.r = new qw3(this, (byte) 2);
        cw6Var2.n = new ay9(this);
        my9 my9Var2 = new my9(this, i8, context, ylbVar42, num);
        ty9Var2.X0 = my9Var2;
        pu4 pu4Var3 = (pu4) ty9Var2.L1.b;
        pu4Var3.t = true;
        pu4Var3.u = (long) (ViewConfiguration.getLongPressTimeout() * 0.25f);
        jy9Var.X0 = my9Var2;
        pu4 pu4Var22 = (pu4) jy9Var.L1.b;
        pu4Var22.t = true;
        pu4Var22.u = (long) (ViewConfiguration.getLongPressTimeout() * 0.25f);
        eu9 eu9Var2 = new eu9(this, i8, (byte) 1);
        ty9Var2.setOnItemClickListener(eu9Var2);
        jy9Var.setOnItemClickListener(eu9Var2);
        ny9 ny9Var2 = new ny9(this, context, z2);
        this.g0 = ny9Var2;
        ny9Var2.setTranslationY(-gm.L(52.0f));
        ny9Var2.setVisibility(4);
        ct8Var2.addView(ny9Var2, qoe.d(-1, 52.0f, 48, 0.0f, -4.0f, 0.0f, 0.0f));
        oy9 oy9Var22 = new oy9(context, num82, (byte) 0);
        Drawable drawable22 = getResources().getDrawable(R.drawable.gradient_top);
        int i162 = cmb.F8;
        wmb K2 = anb.K(0.8f, i162);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        anb.k(oy9Var22, drawable22, K2.a, -1, 2, K2.d, ylbVar, mode2);
        oy9Var22.setBackground(drawable22);
        oy9Var22.setAlpha(0.0f);
        this.b0.addView(oy9Var22, qoe.d(-1, 20.0f, 55, 0.0f, (f42 / gm.p) + 36.0f, 0.0f, 0.0f));
        View view22 = new View(context);
        this.p0 = view22;
        Drawable drawable32 = getResources().getDrawable(R.drawable.gradient_bottom);
        anb.x(this, drawable32, i162, ylbVar, mode2);
        if (i == i9) {
        }
        view22.setAlpha(0.0f);
        this.b0.addView(view22, qoe.e(-1, 20, 87));
        View view32 = new View(context);
        this.u0 = view32;
        view32.setAlpha(0.0f);
        view32.setBackgroundColor(-16777216);
        this.b0.addView(view32, qoe.c(-1.0f, -1));
        int i172 = this.W;
        hs6.d0(i172);
        hs6.d0(i172).D(5);
        if (i != i9) {
        }
        this.W0.m0(7);
        i10 = this.a0;
        if (i10 != 3) {
        }
        z3 = true;
        B(z3, false, z3);
    }

    public static void D(int i, bf0 bf0Var) {
        List list;
        gn5 b;
        String str;
        if (bf0Var != null) {
            ArrayList arrayList = new ArrayList(hs6.d0(i).t0[1]);
            Collections.shuffle(arrayList);
            int round = (int) Math.round(Math.random() * 10.0d);
            TLRPC.Document document = null;
            int i2 = 0;
            while (true) {
                int size = arrayList.size();
                list = b2;
                if (i2 >= size) {
                    break;
                }
                if ((arrayList.get(i2) instanceof TLRPC.TL_stickerSetFullCovered) && ((TLRPC.TL_stickerSetFullCovered) arrayList.get(i2)).documents != null) {
                    ArrayList arrayList2 = new ArrayList(((TLRPC.TL_stickerSetFullCovered) arrayList.get(i2)).documents);
                    Collections.shuffle(arrayList2);
                    int i3 = 0;
                    while (true) {
                        if (i3 >= arrayList2.size()) {
                            break;
                        }
                        TLRPC.Document document2 = (TLRPC.Document) arrayList2.get(i3);
                        if (document2 != null && list.contains(k47.V(document2, null, null))) {
                            int i4 = round - 1;
                            if (round <= 0) {
                                round = i4;
                                document = document2;
                                break;
                            } else {
                                round = i4;
                                document = document2;
                            }
                        }
                        i3++;
                    }
                }
                if (document != null && round <= 0) {
                    break;
                } else {
                    i2++;
                }
            }
            if (document == null || round > 0) {
                ArrayList arrayList3 = new ArrayList(hs6.d0(i).t0(5));
                Collections.shuffle(arrayList3);
                for (int i5 = 0; i5 < arrayList3.size(); i5++) {
                    if (arrayList3.get(i5) != null && ((TLRPC.TL_messages_stickerSet) arrayList3.get(i5)).documents != null) {
                        ArrayList arrayList4 = new ArrayList(((TLRPC.TL_messages_stickerSet) arrayList3.get(i5)).documents);
                        Collections.shuffle(arrayList4);
                        int i6 = 0;
                        while (true) {
                            if (i6 >= arrayList4.size()) {
                                break;
                            }
                            TLRPC.Document document3 = (TLRPC.Document) arrayList4.get(i6);
                            if (document3 != null && list.contains(k47.V(document3, null, null))) {
                                int i7 = round - 1;
                                if (round <= 0) {
                                    round = i7;
                                    document = document3;
                                    break;
                                } else {
                                    round = i7;
                                    document = document3;
                                }
                            }
                            i6++;
                        }
                    }
                    if (document != null && round <= 0) {
                        break;
                    }
                }
            }
            if (document != null) {
                meb d = eq3.d(document.thumbs, cmb.l6, 0.2f, false);
                TLRPC.PhotoSize w = bc4.w(document.thumbs, 90, false, null, false);
                if ("video/webm".equals(document.mime_type)) {
                    b = gn5.b(document);
                    if (d != null) {
                        d.e = 512;
                        d.f = 512;
                    }
                    str = "36_36_g";
                } else {
                    if (d != null && k47.K2(document, false)) {
                        d.e = 512;
                        d.f = 512;
                    }
                    b = gn5.b(document);
                    str = "36_36";
                }
                bf0Var.setLayerNum(7);
                bf0Var.setRoundRadius(gm.L(4.0f));
                bf0Var.j(b, str, gn5.c(w, document), "36_36", d, document);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCacheType() {
        int i = 13;
        int i2 = this.a0;
        if (i2 != 5 && i2 != 7) {
            if (i2 == 6) {
                return vm.f();
            }
            if (i2 != 3 && i2 != 4) {
                i = 2;
                if (i2 != 0 && i2 != 12 && i2 != 9 && i2 != 10 && i2 != 2) {
                    return 3;
                }
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Drawable getPremiumStar() {
        Drawable d;
        if (this.k1 == null) {
            int i = this.a0;
            if (i == 5 || i == 9 || i == 10 || i == 7) {
                d = b10.d(a.b, R.drawable.msg_filled_blocked);
                this.k1 = d;
            } else {
                d = b10.d(a.b, R.drawable.msg_settings_premium);
                this.k1 = d;
            }
            d.setColorFilter(this.l1);
        }
        return this.k1;
    }

    public static ArrayList i(ArrayList arrayList, HashSet hashSet) {
        if (hashSet == null) {
            return arrayList;
        }
        int i = 0;
        while (i < arrayList.size()) {
            TLRPC.Document document = (TLRPC.Document) arrayList.get(i);
            if (document == null || hashSet.contains(Long.valueOf(document.id))) {
                arrayList.remove(i);
                i--;
            }
            i++;
        }
        return arrayList;
    }

    public static TLRPC.Document j(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str) {
        long j;
        if (tL_messages_stickerSet == null) {
            return null;
        }
        String c = gw3.c(str);
        int i = 0;
        while (true) {
            if (i >= tL_messages_stickerSet.packs.size()) {
                j = 0;
                break;
            }
            if (!tL_messages_stickerSet.packs.get(i).documents.isEmpty() && TextUtils.equals(gw3.c(tL_messages_stickerSet.packs.get(i).emoticon), c)) {
                j = tL_messages_stickerSet.packs.get(i).documents.get(0).longValue();
                break;
            }
            i++;
        }
        if (j == 0) {
            return null;
        }
        for (int i2 = 0; i2 < tL_messages_stickerSet.documents.size(); i2++) {
            TLRPC.Document document = tL_messages_stickerSet.documents.get(i2);
            if (document.id == j) {
                return document;
            }
        }
        return null;
    }

    public static void s(int i) {
        boolean[] zArr = d2;
        if (zArr[i]) {
            return;
        }
        hs6.d0(i);
        zArr[i] = true;
        hs6.d0(i).D(5);
        hs6.d0(i).N(0, true);
        hs6.d0(i).C();
        hs6.d0(i).n0(new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
        hs6.d0(i).R();
        hs6.d0(i).x();
        u0b.F3.c(i, 1, new yg3(i, (byte) 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBigReactionAnimatedEmoji(vm vmVar) {
        vm vmVar2;
        if (!this.J || (vmVar2 = this.X0) == vmVar) {
            return;
        }
        if (vmVar2 != null) {
            vmVar2.o(this);
        }
        this.X0 = vmVar;
        if (vmVar != null) {
            vmVar.setColorFilter(this.l1);
            this.X0.b(this);
        }
    }

    public final void A(Long l) {
        this.L.remove(l);
        ty9 ty9Var = this.i0;
        if (ty9Var != null) {
            int i = 0;
            boolean z = false;
            for (int i2 = 0; i2 < ty9Var.getChildCount(); i2++) {
                if (ty9Var.getChildAt(i2) instanceof fz9) {
                    fz9 fz9Var = (fz9) ty9Var.getChildAt(i2);
                    gn gnVar = fz9Var.e;
                    if (gnVar == null || gnVar.getDocumentId() != l.longValue()) {
                        TLRPC.Document document = fz9Var.d;
                        if (document != null && document.id == l.longValue()) {
                            fz9Var.f();
                        }
                    } else {
                        fz9Var.f();
                    }
                    z = true;
                }
            }
            ty9Var.invalidate();
            if (z) {
                return;
            }
            while (true) {
                ArrayList arrayList = this.w0;
                if (i >= arrayList.size()) {
                    return;
                }
                long longValue = ((Long) arrayList.get(i)).longValue();
                if (longValue == (l.longValue() * 13) + 62425 || longValue == (l.longValue() * 13) + 3212) {
                    break;
                } else {
                    i++;
                }
            }
            vy9 vy9Var = this.q0;
            if (vy9Var != null) {
                vy9Var.g(i);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00ba, code lost:
    
        if (r12 == 4) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x086f, code lost:
    
        if (r8.set.channel_emoji_status != false) goto L379;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x085c, code lost:
    
        if (r9 == false) goto L393;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0459 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x04e8 A[LOOP:5: B:123:0x04e2->B:125:0x04e8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x07de  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0827  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x09da  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0b4c  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0b5a  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0b73  */
    /* JADX WARN: Removed duplicated region for block: B:303:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0b6b  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0b52  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0772  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x078e  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x07d5  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x02e7 A[LOOP:30: B:536:0x02df->B:538:0x02e7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:543:0x030c A[LOOP:31: B:541:0x0306->B:543:0x030c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03ff A[LOOP:2: B:79:0x03f9->B:81:0x03ff, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0444  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(boolean z, boolean z2, boolean z3) {
        ArrayList arrayList;
        SparseIntArray sparseIntArray;
        SparseIntArray sparseIntArray2;
        boolean z4;
        ArrayList arrayList2;
        int i;
        TLRPC.TL_emojiList tL_emojiList;
        ArrayList<Long> arrayList3;
        int i2;
        int i3;
        int i4;
        TLRPC.TL_emojiList tL_emojiList2;
        HashSet hashSet;
        ArrayList arrayList4;
        ArrayList R;
        int i5;
        int i6;
        int i7;
        int i8;
        ArrayList arrayList5;
        int size;
        int i9;
        long j;
        int i10;
        ArrayList arrayList6;
        int i11;
        ty9 ty9Var;
        int i12;
        int i13;
        ArrayList arrayList7;
        HashSet hashSet2;
        SparseIntArray sparseIntArray3;
        hs6 hs6Var;
        int i14;
        ArrayList arrayList8;
        SparseIntArray sparseIntArray4;
        TLRPC.StickerSet stickerSet;
        ArrayList<TLRPC.Document> arrayList9;
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID;
        boolean z5;
        ArrayList arrayList10;
        SparseIntArray sparseIntArray5;
        SparseIntArray sparseIntArray6;
        int i15;
        SparseIntArray sparseIntArray7;
        SparseIntArray sparseIntArray8;
        TLRPC.StickerSet stickerSet2;
        boolean z6;
        ArrayList arrayList11;
        int i16;
        int i17;
        int i18;
        boolean z7;
        int i19;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        ArrayList<Long> arrayList12;
        boolean z8 = !this.Q ? false : z2;
        int i20 = this.W;
        hs6 d0 = hs6.d0(i20);
        if (z || (arrayList = this.M0) == null) {
            arrayList = new ArrayList(d0.t0(this.R ? 0 : 5));
            this.M0 = arrayList;
        }
        ArrayList arrayList13 = new ArrayList(d0.t0[1]);
        ArrayList arrayList14 = this.w0;
        ArrayList arrayList15 = new ArrayList(arrayList14);
        this.v0 = 0;
        this.f = -1;
        this.b = -1;
        this.r = -1;
        this.s = -1;
        this.c = -1;
        this.h = -1;
        this.n = -1;
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        ArrayList arrayList16 = this.E0;
        arrayList16.clear();
        this.L0.clear();
        ArrayList arrayList17 = this.I0;
        arrayList17.clear();
        ArrayList arrayList18 = this.J0;
        arrayList18.clear();
        ArrayList arrayList19 = this.N0;
        arrayList19.clear();
        SparseIntArray sparseIntArray9 = this.x0;
        sparseIntArray9.clear();
        SparseIntArray sparseIntArray10 = this.y0;
        sparseIntArray10.clear();
        SparseIntArray sparseIntArray11 = this.z0;
        sparseIntArray11.clear();
        arrayList14.clear();
        boolean z9 = z8;
        SparseIntArray sparseIntArray12 = this.A0;
        sparseIntArray12.clear();
        hs6 hs6Var2 = d0;
        this.T.clear();
        ArrayList arrayList20 = this.G0;
        arrayList20.clear();
        ArrayList arrayList21 = this.H0;
        arrayList21.clear();
        SparseIntArray sparseIntArray13 = sparseIntArray12;
        ArrayList arrayList22 = this.F0;
        arrayList22.clear();
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList23 = arrayList13;
        int i21 = this.a0;
        if (isEmpty) {
            sparseIntArray = sparseIntArray10;
        } else {
            sparseIntArray = sparseIntArray10;
        }
        if (i21 != 5 && i21 != 7 && i21 != 8) {
            int i22 = this.v0;
            sparseIntArray2 = sparseIntArray9;
            this.v0 = i22 + 1;
            this.a = i22;
            arrayList14.add(9L);
            z4 = this.O0;
            if (i21 != 5 || i21 == 7) {
                arrayList2 = arrayList;
                i = z4 ? 1 : 0;
                if (i != 0) {
                    this.v0++;
                    arrayList14.add(2L);
                }
                tL_emojiList = hs6.d0(i20).O1;
                if (tL_emojiList != null && (arrayList3 = tL_emojiList.document_id) != null && !arrayList3.isEmpty()) {
                    i2 = 0;
                    while (i2 < tL_emojiList.document_id.size()) {
                        arrayList16.add(new gn(tL_emojiList.document_id.get(i2).longValue(), (Paint.FontMetricsInt) null));
                        i2++;
                        tL_emojiList = tL_emojiList;
                    }
                    for (i3 = 0; i3 < arrayList16.size(); i3++) {
                        arrayList14.add(Long.valueOf((((gn) arrayList16.get(i3)).getDocumentId() * 13) + 43223));
                        this.v0++;
                    }
                }
            } else if (i21 != 4) {
                arrayList2 = arrayList;
                i = z4 ? 1 : 0;
                if (i21 == 6) {
                    if (i != 0) {
                        this.v0++;
                        arrayList14.add(2L);
                    }
                    ArrayList arrayList24 = hs6.d0(i20).n;
                    for (int i23 = 0; i23 < arrayList24.size(); i23++) {
                        arrayList20.add(((TLRPC.TL_availableReaction) arrayList24.get(i23)).activate_animation);
                    }
                    int i24 = 0;
                    while (i24 < arrayList20.size()) {
                        arrayList14.add(Long.valueOf((((TLRPC.Document) arrayList20.get(i24)).id * 13) + 62425));
                        this.v0++;
                        i24++;
                        arrayList20 = arrayList20;
                    }
                } else if (i21 == 3) {
                    int i25 = this.v0;
                    this.v0 = i25 + 1;
                    this.y = i25;
                    arrayList14.add(12L);
                    int i26 = this.v0;
                    this.v0 = i26 + 1;
                    this.x = i26;
                    arrayList14.add(7L);
                    String str = z8c.h(i20).f0;
                    if (str != null) {
                        TLRPC.TL_messages_stickerSet q0 = hs6.d0(i20).q0(str);
                        tL_messages_stickerSet = q0 == null ? hs6.d0(i20).o0(str) : q0;
                    } else {
                        tL_messages_stickerSet = null;
                    }
                    if (tL_messages_stickerSet != null) {
                        if (i != 0) {
                            this.v0++;
                            arrayList14.add(2L);
                        }
                        ArrayList<TLRPC.Document> arrayList25 = tL_messages_stickerSet.documents;
                        if (arrayList25 != null && !arrayList25.isEmpty()) {
                            int i27 = 0;
                            while (i27 < tL_messages_stickerSet.documents.size()) {
                                arrayList16.add(new gn(tL_messages_stickerSet.documents.get(i27), (Paint.FontMetricsInt) null));
                                i27++;
                                tL_messages_stickerSet = tL_messages_stickerSet;
                            }
                        }
                        for (int i28 = 0; i28 < arrayList16.size(); i28++) {
                            arrayList14.add(Long.valueOf((((gn) arrayList16.get(i28)).getDocumentId() * 13) + 43223));
                            this.v0++;
                        }
                    }
                }
            } else if (this.R) {
                arrayList20.addAll(hs6.d0(i20).g0[0]);
                i = z4 ? 1 : 0;
                int i29 = 0;
                while (i29 < arrayList20.size()) {
                    arrayList14.add(Long.valueOf((((TLRPC.Document) arrayList20.get(i29)).id * 13) + 62425));
                    this.v0++;
                    i29++;
                    arrayList = arrayList;
                }
                arrayList2 = arrayList;
            } else {
                arrayList2 = arrayList;
                i = z4 ? 1 : 0;
                TLRPC.TL_emojiList tL_emojiList3 = this.S ? hs6.d0(i20).M1 : hs6.d0(i20).N1;
                if (tL_emojiList3 != null && (arrayList12 = tL_emojiList3.document_id) != null && !arrayList12.isEmpty()) {
                    s14 s14Var = new s14();
                    s14Var.f = true;
                    s14Var.g = false;
                    s14Var.h = true;
                    s14Var.e = true;
                    s14Var.b = new TLRPC.TL_stickerSet();
                    s14Var.a = tL_emojiList3.document_id.get(0);
                    arrayList19.size();
                    arrayList19.add(s14Var);
                    int i30 = 0;
                    while (i30 < tL_emojiList3.document_id.size()) {
                        arrayList16.add(new gn(tL_emojiList3.document_id.get(i30).longValue(), (Paint.FontMetricsInt) null));
                        i30++;
                        tL_emojiList3 = tL_emojiList3;
                    }
                    for (int i31 = 0; i31 < arrayList16.size(); i31++) {
                        arrayList14.add(Long.valueOf((((gn) arrayList16.get(i31)).getDocumentId() * 13) + 43223));
                        this.v0++;
                    }
                }
            }
            if (this.P0 || i21 == 13 || i21 == 2 || i21 == 11 || i21 == 3 || i21 == 6 || i21 == 8 || i21 == 4 || i21 == 5 || i21 == 7) {
                i4 = 2;
            } else {
                int i32 = this.v0;
                i4 = 2;
                this.v0 = i32 + 1;
                this.w = i32;
                arrayList14.add(6L);
            }
            if ((i21 != 9 || i21 == 10) && (tL_emojiList2 = hs6.d0(i20).P1) != null) {
                HashSet hashSet3 = new HashSet();
                hashSet3.addAll(tL_emojiList2.document_id);
                hashSet = hashSet3;
            } else {
                hashSet = null;
            }
            if (this.S0 == null) {
                this.d = this.v0;
                ArrayList arrayList26 = new ArrayList(this.S0);
                if (i21 == 13 && arrayList26.size() > 8) {
                    arrayList26.subList(8, arrayList26.size()).clear();
                } else if (i21 == 14) {
                    arrayList11 = new ArrayList();
                    int i33 = 0;
                    while (i33 < arrayList26.size()) {
                        if (((k39) arrayList26.get(i33)).e) {
                            arrayList11.add((k39) arrayList26.remove(i33));
                            i33--;
                        }
                        i33++;
                    }
                    if (i21 != 8 || i21 == 11 || i21 == 13) {
                        arrayList17.addAll(arrayList26);
                    } else {
                        for (int i34 = 0; i34 < 16; i34++) {
                            if (!arrayList26.isEmpty()) {
                                arrayList17.add((k39) arrayList26.remove(0));
                            }
                        }
                    }
                    i16 = 0;
                    while (i16 < arrayList17.size()) {
                        arrayList14.add(Long.valueOf((((k39) arrayList17.get(i16)).hashCode() * 13) - 5632));
                        i16++;
                        arrayList21 = arrayList21;
                    }
                    arrayList4 = arrayList21;
                    int size2 = arrayList17.size() + this.v0;
                    this.v0 = size2;
                    this.e = size2;
                    if (!arrayList26.isEmpty() && i21 != 8 && i21 != 11 && i21 != 13) {
                        i18 = 0;
                        while (true) {
                            if (i18 < arrayList26.size()) {
                                z7 = true;
                                break;
                            } else {
                                if (((k39) arrayList26.get(i18)).g != 0) {
                                    z7 = false;
                                    break;
                                }
                                i18++;
                            }
                        }
                        if (i21 != 14) {
                            if (!z7) {
                                int i35 = this.v0;
                                this.v0 = i35 + 1;
                                this.f = i35;
                                arrayList14.add(4L);
                            } else if (z8c.h(i20).p()) {
                                int i36 = this.v0;
                                this.v0 = i36 + 1;
                                this.h = i36;
                                arrayList14.add(5L);
                            }
                        }
                        this.b = this.v0;
                        arrayList18.addAll(arrayList26);
                        for (i19 = 0; i19 < arrayList18.size(); i19++) {
                            arrayList14.add(Long.valueOf((((k39) arrayList18.get(i19)).h * 13) + (z7 ? 4235 : -3142)));
                        }
                        int size3 = arrayList18.size() + this.v0;
                        this.v0 = size3;
                        this.c = size3;
                    }
                    if (arrayList11 != null && !arrayList11.isEmpty()) {
                        int i37 = this.v0;
                        this.v0 = i37 + 1;
                        this.E = i37;
                        arrayList14.add(8L);
                        this.F = this.v0;
                        this.K0 = arrayList11;
                        for (i17 = 0; i17 < arrayList11.size(); i17++) {
                            arrayList14.add(Long.valueOf(((k39) arrayList11.get(i17)).c * 19));
                        }
                        int size4 = arrayList11.size() + this.v0;
                        this.v0 = size4;
                        this.G = size4;
                    }
                }
                arrayList11 = null;
                if (i21 != 8) {
                }
                arrayList17.addAll(arrayList26);
                i16 = 0;
                while (i16 < arrayList17.size()) {
                }
                arrayList4 = arrayList21;
                int size22 = arrayList17.size() + this.v0;
                this.v0 = size22;
                this.e = size22;
                if (!arrayList26.isEmpty()) {
                    i18 = 0;
                    while (true) {
                        if (i18 < arrayList26.size()) {
                        }
                        i18++;
                    }
                    if (i21 != 14) {
                    }
                    this.b = this.v0;
                    arrayList18.addAll(arrayList26);
                    while (i19 < arrayList18.size()) {
                    }
                    int size32 = arrayList18.size() + this.v0;
                    this.v0 = size32;
                    this.c = size32;
                }
                if (arrayList11 != null) {
                    int i372 = this.v0;
                    this.v0 = i372 + 1;
                    this.E = i372;
                    arrayList14.add(8L);
                    this.F = this.v0;
                    this.K0 = arrayList11;
                    while (i17 < arrayList11.size()) {
                    }
                    int size42 = arrayList11.size() + this.v0;
                    this.v0 = size42;
                    this.G = size42;
                }
            } else {
                arrayList4 = arrayList21;
                if (i21 == 0 || i21 == 12 || i21 == 9 || i21 == 10) {
                    hs6 d02 = hs6.d0(i20);
                    Long[] lArr = d02.G0;
                    ArrayList[] arrayListArr = d02.F0;
                    if (!d02.H0[0]) {
                        d02.N(0, true);
                    } else if (arrayListArr[0] == null || (lArr[0] != null && (System.currentTimeMillis() / 1000) - lArr[0].longValue() > 1800)) {
                        d02.N(0, false);
                    }
                    ArrayList arrayList27 = arrayListArr[0];
                    TLRPC.TL_messages_stickerSet n0 = hs6.d0(i20).n0((i21 == 0 || i21 == 12) ? new TLRPC.TL_inputStickerSetEmojiDefaultStatuses() : new TLRPC.TL_inputStickerSetEmojiChannelDefaultStatuses(), true);
                    if (n0 != null) {
                        if (i != 0) {
                            this.v0++;
                            arrayList14.add(2L);
                        }
                        if (i21 == 0 || i21 == 12) {
                            R = hs6.d0(i20).R();
                        } else {
                            hs6 d03 = hs6.d0(i20);
                            Long[] lArr2 = d03.G0;
                            ArrayList[] arrayListArr2 = d03.F0;
                            if (d03.H0[i4]) {
                                i8 = i4;
                                if (arrayListArr2[i8] == null || (lArr2[i8] != null && (System.currentTimeMillis() / 1000) - lArr2[i8].longValue() > 1800)) {
                                    d03.N(i8, false);
                                }
                            } else {
                                i8 = i4;
                                d03.N(i8, true);
                            }
                            R = arrayListArr2[i8];
                        }
                        ArrayList<TLRPC.Document> arrayList28 = n0.documents;
                        if (arrayList28 != null && !arrayList28.isEmpty()) {
                            for (int i38 = 0; i38 < Math.min(7, n0.documents.size()); i38++) {
                                arrayList16.add(new gn(n0.documents.get(i38), (Paint.FontMetricsInt) null));
                                if (arrayList16.size() + i >= 104) {
                                    break;
                                }
                            }
                        }
                        if ((i21 == 0 || i21 == 12) && arrayList27 != null && !arrayList27.isEmpty()) {
                            int size5 = arrayList27.size();
                            int i39 = 0;
                            while (i39 < size5) {
                                Object obj = arrayList27.get(i39);
                                i39++;
                                Long h = m9c.h((TLRPC.EmojiStatus) obj);
                                if (h != null) {
                                    while (true) {
                                        if (i5 >= arrayList16.size()) {
                                            ArrayList arrayList29 = arrayList27;
                                            int i40 = size5;
                                            arrayList16.add(new gn(h.longValue(), (Paint.FontMetricsInt) null));
                                            if (arrayList16.size() + i >= 104) {
                                                break;
                                            }
                                            arrayList27 = arrayList29;
                                            size5 = i40;
                                        } else {
                                            i5 = ((gn) arrayList16.get(i5)).getDocumentId() != h.longValue() ? i5 + 1 : 0;
                                        }
                                    }
                                }
                            }
                        }
                        if (R != null && !R.isEmpty()) {
                            int size6 = R.size();
                            int i41 = 0;
                            while (i41 < size6) {
                                Object obj2 = R.get(i41);
                                i41++;
                                Long h2 = m9c.h((TLRPC.EmojiStatus) obj2);
                                if (h2 != null) {
                                    while (true) {
                                        if (i7 >= arrayList16.size()) {
                                            arrayList16.add(new gn(h2.longValue(), (Paint.FontMetricsInt) null));
                                            if (arrayList16.size() + i >= 104) {
                                                break;
                                            }
                                        } else {
                                            i7 = ((gn) arrayList16.get(i7)).getDocumentId() != h2.longValue() ? i7 + 1 : 0;
                                        }
                                    }
                                }
                            }
                        }
                        if (arrayList16.size() <= 40 - i || this.D0) {
                            for (int i42 = 0; i42 < arrayList16.size(); i42++) {
                                arrayList14.add(Long.valueOf((((gn) arrayList16.get(i42)).getDocumentId() * 13) + 43223));
                                this.v0++;
                            }
                        } else {
                            for (int i43 = 0; i43 < 39 - i; i43++) {
                                arrayList14.add(Long.valueOf((((gn) arrayList16.get(i43)).getDocumentId() * 13) + 43223));
                                this.v0++;
                            }
                            arrayList14.add(Long.valueOf(((((arrayList16.size() - 40) + i) + 1) * 13) - 5531));
                            az9 az9Var = this.H;
                            if (az9Var != null) {
                                TextView textView = az9Var.a;
                                StringBuilder sb = new StringBuilder("+");
                                i6 = 1;
                                sb.append((arrayList16.size() - 40) + i + 1);
                                textView.setText(sb.toString());
                            } else {
                                i6 = 1;
                            }
                            sparseIntArray11.put(this.v0, -1);
                            this.v0 += i6;
                        }
                    }
                }
            }
            arrayList22.clear();
            long j2 = 13334;
            if (i21 != 0 || i21 == 12 || i21 == 9 || i21 == 10) {
                ava D = jva.v(i20, false).D(getDialogId(), true);
                D.a();
                arrayList5 = new ArrayList();
                ArrayList arrayList30 = D.l;
                size = arrayList30.size();
                i9 = 0;
                while (i9 < size) {
                    Object obj3 = arrayList30.get(i9);
                    i9++;
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) obj3).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList5.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                j = 322;
                if (arrayList5.isEmpty()) {
                    int i44 = this.v0;
                    this.v0 = i44 + 1;
                    this.n = i44;
                    arrayList14.add(22L);
                    this.r = this.v0;
                    int size7 = arrayList5.size();
                    int i45 = 0;
                    while (i45 < size7) {
                        Object obj4 = arrayList5.get(i45);
                        i45++;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj4;
                        arrayList14.add(Long.valueOf((tL_starGiftUnique.id * 322) + 13334));
                        this.v0++;
                        arrayList22.add(tL_starGiftUnique);
                    }
                    this.s = this.v0;
                    this.e0.l(true);
                } else {
                    this.e0.l(false);
                }
                i10 = 13;
            } else {
                i10 = 13;
                j = 322;
            }
            if (i21 == i10) {
                String[][] strArr = zx3.f;
                for (int i46 = 0; i46 < 8; i46++) {
                    String[] strArr2 = strArr[i46];
                    int length = strArr2.length;
                    int i47 = 0;
                    while (i47 < length) {
                        arrayList4.add(strArr2[i47]);
                        long j3 = j2;
                        arrayList14.add(Long.valueOf((r10.hashCode() * j) + j3));
                        this.v0++;
                        i47++;
                        j2 = j3;
                    }
                }
            }
            ArrayList arrayList31 = this.C0;
            if (i21 != 8 && i21 != 13 && i21 != 14) {
                i15 = 0;
                while (i15 < arrayList2.size()) {
                    ArrayList arrayList32 = arrayList2;
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) arrayList32.get(i15);
                    if (tL_messages_stickerSet2 != null && (stickerSet2 = tL_messages_stickerSet2.set) != null) {
                        if (i21 == 5 || i21 == 7) {
                            if (stickerSet2 != null) {
                                if (stickerSet2.text_color) {
                                    z6 = true;
                                } else {
                                    ArrayList<TLRPC.Document> arrayList33 = tL_messages_stickerSet2.documents;
                                    if (arrayList33 != null && !arrayList33.isEmpty()) {
                                        z6 = k47.B4(tL_messages_stickerSet2.documents.get(0));
                                    }
                                }
                            }
                            z6 = false;
                        }
                        long j4 = (i21 == 10 || i21 == 9) ? 9211L : 9211L;
                        TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet2.set;
                        if ((stickerSet3.emojis || this.R) && !arrayList31.contains(Long.valueOf(stickerSet3.id))) {
                            sparseIntArray8 = sparseIntArray2;
                            sparseIntArray8.put(this.v0, arrayList19.size());
                            sparseIntArray7 = sparseIntArray;
                            sparseIntArray7.put(arrayList19.size(), this.v0);
                            this.v0++;
                            arrayList14.add(Long.valueOf((tL_messages_stickerSet2.set.id * 13) + j4));
                            s14 s14Var2 = new s14();
                            s14Var2.f = true;
                            s14Var2.g = false;
                            s14Var2.h = true;
                            if (i21 == 4) {
                                s14Var2.e = false;
                            } else {
                                s14Var2.e = !k47.U3(tL_messages_stickerSet2);
                            }
                            s14Var2.b = tL_messages_stickerSet2.set;
                            s14Var2.c = i(tL_messages_stickerSet2.documents, hashSet);
                            arrayList19.size();
                            arrayList19.add(s14Var2);
                            this.v0 = s14Var2.c.size() + this.v0;
                            for (int i48 = 0; i48 < s14Var2.c.size(); i48++) {
                                arrayList14.add(Long.valueOf((((TLRPC.Document) s14Var2.c.get(i48)).id * 13) + 3212));
                            }
                            i15++;
                            arrayList2 = arrayList32;
                            sparseIntArray2 = sparseIntArray8;
                            sparseIntArray = sparseIntArray7;
                        }
                    }
                    sparseIntArray7 = sparseIntArray;
                    sparseIntArray8 = sparseIntArray2;
                    i15++;
                    arrayList2 = arrayList32;
                    sparseIntArray2 = sparseIntArray8;
                    sparseIntArray = sparseIntArray7;
                }
            }
            SparseIntArray sparseIntArray14 = sparseIntArray;
            SparseIntArray sparseIntArray15 = sparseIntArray2;
            if (!this.R || i21 == 8 || i21 == 13) {
                arrayList6 = arrayList19;
                i11 = 14;
            } else {
                i11 = 14;
                if (i21 != 14) {
                    int i49 = 0;
                    while (i49 < arrayList23.size()) {
                        ArrayList arrayList34 = arrayList23;
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList34.get(i49);
                        TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                        int i50 = 0;
                        while (true) {
                            if (i50 < arrayList19.size()) {
                                int i51 = i50;
                                i13 = i49;
                                arrayList7 = arrayList34;
                                if (((s14) arrayList19.get(i50)).b.id == stickerSet4.id) {
                                    arrayList10 = arrayList19;
                                    hashSet2 = hashSet;
                                    sparseIntArray6 = sparseIntArray11;
                                    sparseIntArray4 = sparseIntArray14;
                                    hs6Var = hs6Var2;
                                    sparseIntArray5 = sparseIntArray13;
                                    break;
                                }
                                i50 = i51 + 1;
                                i49 = i13;
                                arrayList34 = arrayList7;
                            } else {
                                i13 = i49;
                                arrayList7 = arrayList34;
                                if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                    hashSet2 = hashSet;
                                    hs6Var = hs6Var2;
                                    arrayList8 = arrayList19;
                                    sparseIntArray4 = sparseIntArray14;
                                    stickerSet = stickerSet4;
                                    sparseIntArray3 = sparseIntArray11;
                                    i14 = 10;
                                    TLRPC.TL_messages_stickerSet m0 = hs6Var.m0(hs6.b0(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                                    if (m0 != null) {
                                        arrayList9 = m0.documents;
                                        z5 = k47.U3(m0);
                                        tL_inputStickerSetID = null;
                                        if (arrayList9 != null || (((i21 == 5 || i21 == 7) && (arrayList9.isEmpty() || !k47.B4(arrayList9.get(0)))) || ((i21 == i14 || i21 == 9) && !stickerSet.channel_emoji_status))) {
                                            arrayList10 = arrayList8;
                                            sparseIntArray5 = sparseIntArray13;
                                            sparseIntArray6 = sparseIntArray3;
                                        } else {
                                            sparseIntArray15.put(this.v0, arrayList8.size());
                                            sparseIntArray4.put(arrayList8.size(), this.v0);
                                            this.v0++;
                                            arrayList14.add(Long.valueOf((stickerSet.id * 13) + 9211));
                                            s14 s14Var3 = new s14();
                                            s14Var3.d = tL_inputStickerSetID;
                                            s14Var3.f = arrayList31.contains(Long.valueOf(stickerSet.id));
                                            s14Var3.g = true;
                                            if (i21 == 4) {
                                                s14Var3.e = false;
                                            } else {
                                                s14Var3.e = !z5;
                                            }
                                            s14Var3.b = stickerSet;
                                            s14Var3.c = i(arrayList9, hashSet2);
                                            arrayList8.size();
                                            s14Var3.h = this.B0.contains(Long.valueOf(s14Var3.b.id));
                                            if (s14Var3.c.size() <= 24 || s14Var3.h) {
                                                sparseIntArray6 = sparseIntArray3;
                                                this.v0 = s14Var3.c.size() + this.v0;
                                                for (int i52 = 0; i52 < s14Var3.c.size(); i52++) {
                                                    arrayList14.add(Long.valueOf((((TLRPC.Document) s14Var3.c.get(i52)).id * 13) + 3212));
                                                }
                                            } else {
                                                this.v0 += 24;
                                                for (int i53 = 0; i53 < 23; i53++) {
                                                    arrayList14.add(Long.valueOf((((TLRPC.Document) s14Var3.c.get(i53)).id * 13) + 3212));
                                                }
                                                arrayList14.add(Long.valueOf(((s14Var3.c.size() - 23) * 169) + ((stickerSet.id * 13) - 5531)));
                                                sparseIntArray6 = sparseIntArray3;
                                                sparseIntArray6.put(this.v0 - 1, arrayList8.size());
                                            }
                                            if (s14Var3.f || i21 == 4 || i21 == 5 || i21 == 7 || i21 == 6) {
                                                sparseIntArray5 = sparseIntArray13;
                                            } else {
                                                sparseIntArray5 = sparseIntArray13;
                                                sparseIntArray5.put(this.v0, arrayList8.size());
                                                this.v0++;
                                                arrayList14.add(Long.valueOf((stickerSet.id * 13) + 3321));
                                            }
                                            arrayList10 = arrayList8;
                                            arrayList10.add(s14Var3);
                                        }
                                    } else {
                                        tL_inputStickerSetID = hs6.b0(stickerSetCovered.set);
                                        arrayList9 = new ArrayList<>();
                                        z5 = true;
                                        if (arrayList9 != null) {
                                        }
                                        arrayList10 = arrayList8;
                                        sparseIntArray5 = sparseIntArray13;
                                        sparseIntArray6 = sparseIntArray3;
                                    }
                                } else {
                                    hashSet2 = hashSet;
                                    sparseIntArray3 = sparseIntArray11;
                                    hs6Var = hs6Var2;
                                    i14 = 10;
                                    arrayList8 = arrayList19;
                                    sparseIntArray4 = sparseIntArray14;
                                    stickerSet = stickerSet4;
                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                        ArrayList<TLRPC.Document> arrayList35 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                        z5 = k47.T3(stickerSetCovered);
                                        arrayList9 = arrayList35;
                                        tL_inputStickerSetID = null;
                                        if (arrayList9 != null) {
                                        }
                                        arrayList10 = arrayList8;
                                        sparseIntArray5 = sparseIntArray13;
                                        sparseIntArray6 = sparseIntArray3;
                                    } else {
                                        arrayList9 = null;
                                        tL_inputStickerSetID = null;
                                        z5 = false;
                                        if (arrayList9 != null) {
                                        }
                                        arrayList10 = arrayList8;
                                        sparseIntArray5 = sparseIntArray13;
                                        sparseIntArray6 = sparseIntArray3;
                                    }
                                }
                            }
                        }
                        sparseIntArray14 = sparseIntArray4;
                        hs6Var2 = hs6Var;
                        sparseIntArray13 = sparseIntArray5;
                        sparseIntArray11 = sparseIntArray6;
                        arrayList23 = arrayList7;
                        hashSet = hashSet2;
                        arrayList19 = arrayList10;
                        i49 = i13 + 1;
                        i11 = 14;
                    }
                }
                arrayList6 = arrayList19;
            }
            if (i21 != i11 && i21 != 8 && i21 != 13) {
                this.e0.p(arrayList6);
            }
            ty9Var = this.i0;
            if (z9) {
                ty9Var.setItemAnimator(null);
            } else {
                ty9Var.setItemAnimator(this.f1);
            }
            vy9 vy9Var = this.q0;
            if (z3) {
                i12 = 0;
                vy9Var.f();
            } else {
                i12 = 0;
                ww7.a(new tk3(this, arrayList15, (byte) 4), false).c(vy9Var);
            }
            if (ty9Var.K1) {
                ty9Var.w0(i12);
                return;
            }
            return;
        }
        sparseIntArray2 = sparseIntArray9;
        this.a = -1;
        z4 = this.O0;
        if (i21 != 5) {
        }
        arrayList2 = arrayList;
        i = z4 ? 1 : 0;
        if (i != 0) {
        }
        tL_emojiList = hs6.d0(i20).O1;
        if (tL_emojiList != null) {
            i2 = 0;
            while (i2 < tL_emojiList.document_id.size()) {
            }
            while (i3 < arrayList16.size()) {
            }
        }
        if (this.P0) {
        }
        i4 = 2;
        if (i21 != 9) {
        }
        HashSet hashSet32 = new HashSet();
        hashSet32.addAll(tL_emojiList2.document_id);
        hashSet = hashSet32;
        if (this.S0 == null) {
        }
        arrayList22.clear();
        long j22 = 13334;
        if (i21 != 0) {
        }
        ava D2 = jva.v(i20, false).D(getDialogId(), true);
        D2.a();
        arrayList5 = new ArrayList();
        ArrayList arrayList302 = D2.l;
        size = arrayList302.size();
        i9 = 0;
        while (i9 < size) {
        }
        j = 322;
        if (arrayList5.isEmpty()) {
        }
        i10 = 13;
        if (i21 == i10) {
        }
        ArrayList arrayList312 = this.C0;
        if (i21 != 8) {
            i15 = 0;
            while (i15 < arrayList2.size()) {
            }
        }
        SparseIntArray sparseIntArray142 = sparseIntArray;
        SparseIntArray sparseIntArray152 = sparseIntArray2;
        if (this.R) {
        }
        arrayList6 = arrayList19;
        i11 = 14;
        if (i21 != i11) {
            this.e0.p(arrayList6);
        }
        ty9Var = this.i0;
        if (z9) {
        }
        vy9 vy9Var2 = this.q0;
        if (z3) {
        }
        if (ty9Var.K1) {
        }
    }

    public final void C() {
        ny9 ny9Var = this.g0;
        if (ny9Var == null) {
            return;
        }
        if (this.A1) {
            ny9Var.clearAnimation();
            ny9Var.setVisibility(0);
            ny9Var.animate().translationY(0.0f).start();
            return;
        }
        ty9 ty9Var = this.i0;
        if (ty9Var.getChildCount() <= 0) {
            ny9Var.setTranslationY(-gm.L(52.0f));
            return;
        }
        View childAt = ty9Var.getChildAt(0);
        if (RecyclerView.R(childAt) != this.a || !"searchbox".equals(childAt.getTag())) {
            ny9Var.setTranslationY(-gm.L(52.0f));
        } else {
            ny9Var.setVisibility(0);
            ny9Var.setTranslationY(childAt.getY());
        }
    }

    public final void E(float f) {
        View view = this.n0;
        if (view != null) {
            float interpolation = d53.g.getInterpolation(pqe.a((((f * 800.0f) - 0.0f) / 120.0f) / 1.0f, 0.0f, 1.0f));
            view.setAlpha(interpolation);
            view.setScaleX(interpolation);
            view.setScaleY(interpolation * (m() ? -1 : 1));
        }
        o72 o72Var = this.o0;
        if (o72Var != null) {
            float a = pqe.a((((f * 800.0f) - 30.0f) / 120.0f) / 1.0f, 0.0f, 1.0f);
            o72Var.setAlpha(a);
            o72Var.setScaleX(a);
            o72Var.setScaleY(a * (m() ? -1 : 1));
        }
        float f2 = 800.0f * f;
        float f3 = f2 - 40.0f;
        float a2 = pqe.a(f3 / 700.0f, 0.0f, 1.0f);
        float a3 = pqe.a((f2 - 80.0f) / 700.0f, 0.0f, 1.0f);
        float a4 = pqe.a(f3 / 750.0f, 0.0f, 1.0f);
        float a5 = pqe.a((f2 - 30.0f) / 120.0f, 0.0f, 1.0f);
        d53 d53Var = d53.h;
        float interpolation2 = d53Var.getInterpolation(a2);
        float interpolation3 = d53Var.getInterpolation(a3);
        this.c0.setAlpha(a5);
        this.g0.setAlpha(a5);
        int i = 0;
        for (int i2 = 0; i2 < this.e0.b.getChildCount(); i2++) {
            this.e0.b.getChildAt(i2).setAlpha(a5);
        }
        if (this.p1 != null) {
            invalidate();
        }
        float f4 = 1.0f - a5;
        qy9 qy9Var = this.b0;
        qy9Var.setTranslationY(gm.L(-5.0f) * f4);
        if (o72Var != null) {
            o72Var.setTranslationY(gm.L(-5.0f) * f4);
        }
        this.b1 = (interpolation2 * 0.85f) + 0.15f;
        this.c1 = (interpolation3 * 0.925f) + 0.075f;
        qy9Var.invalidateOutline();
        if (o72Var != null) {
            o72Var.setAlpha(a5);
        }
        oy9 oy9Var = this.f0;
        oy9Var.setAlpha(a5);
        oy9Var.setScaleX(Math.min(this.b1, 1.0f));
        float pivotX = oy9Var.getPivotX();
        float sqrt = (float) Math.sqrt(Math.max(Math.pow(qy9Var.getHeight(), 2.0d) + (pivotX * pivotX), Math.pow(qy9Var.getHeight(), 2.0d) + Math.pow(qy9Var.getWidth() - pivotX, 2.0d)));
        for (int i3 = 0; i3 < this.e0.b.getChildCount(); i3++) {
            View childAt = this.e0.b.getChildAt(i3);
            if (f == 0.0f) {
                childAt.setLayerType(2, null);
            } else if (f == 1.0f) {
                childAt.setLayerType(0, null);
            }
            float width = ((childAt.getWidth() / 2.0f) + childAt.getLeft()) - pivotX;
            float height = (childAt.getHeight() / 2.0f) + childAt.getTop();
            if (m()) {
                height = getMeasuredHeight() - height;
            }
            float s = gm.s(a4, (float) Math.sqrt(b10.w(height, height, 0.4f, width * width)), sqrt, childAt.getHeight() * 1.75f);
            if (Float.isNaN(s)) {
                s = 0.0f;
            }
            childAt.setScaleX(s);
            childAt.setScaleY(s);
        }
        while (true) {
            ty9 ty9Var = this.i0;
            if (i >= ty9Var.getChildCount()) {
                this.l0.invalidate();
                ty9Var.invalidate();
                return;
            }
            View childAt2 = ty9Var.getChildAt(i);
            if (childAt2 instanceof fz9) {
                fz9 fz9Var = (fz9) childAt2;
                float width2 = ((childAt2.getWidth() / 2.0f) + childAt2.getLeft()) - pivotX;
                float height2 = (childAt2.getHeight() / 2.0f) + childAt2.getTop();
                if (m()) {
                    height2 = getMeasuredHeight() - height2;
                }
                float s2 = gm.s(a4, (float) Math.sqrt(b10.w(height2, height2, 0.2f, width2 * width2)), sqrt, childAt2.getHeight() * 1.75f);
                if (Float.isNaN(s2)) {
                    s2 = 0.0f;
                }
                fz9Var.setAnimatedScale(s2);
            }
            i++;
        }
    }

    public boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        return true;
    }

    public final long d() {
        return Math.max(450L, Math.min(55, this.Q1 - this.P1) * 30);
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = nm7.x0;
        zx9 zx9Var = this.U1;
        if (i == i3) {
            if (((Integer) objArr[0]).intValue() == 5 || (((Integer) objArr[0]).intValue() == 0 && this.R)) {
                gm.r(zx9Var);
                gm.c3(zx9Var);
                return;
            }
            return;
        }
        if (i == nm7.A0) {
            gm.r(zx9Var);
            gm.c3(zx9Var);
            return;
        }
        if (i == nm7.C1) {
            gm.r(zx9Var);
            gm.c3(zx9Var);
            return;
        }
        if (i == nm7.B0) {
            gm.r(zx9Var);
            gm.c3(zx9Var);
            return;
        }
        if (i != nm7.m4) {
            if (i == nm7.I3 && ((Long) objArr[0]).longValue() == z8c.h(this.W).e()) {
                gm.r(zx9Var);
                gm.c3(zx9Var);
                return;
            }
            return;
        }
        bn0 bn0Var = new bn0((byte) 12);
        ty9 ty9Var = this.i0;
        gm.d0(ty9Var, bn0Var);
        if (ty9Var != null) {
            ty9Var.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Integer num;
        tm tmVar = this.p1;
        if (tmVar != null && (num = this.Z0) != null) {
            Rect bounds = tmVar.getBounds();
            View view = this.r1;
            float scaleY = view == null ? 1.0f : view.getScaleY();
            int alpha = this.p1.getAlpha();
            View view2 = this.r1;
            if (view2 == null) {
                bounds.height();
            } else {
                view2.getHeight();
            }
            canvas.save();
            canvas.translate(0.0f, -getTranslationY());
            this.p1.w = (int) (Math.pow(this.b0.getAlpha(), 0.25d) * alpha * this.n1);
            if (this.q1 == null) {
                this.q1 = new Rect();
            }
            float f = (scaleY <= 1.0f || scaleY >= 1.5f) ? 0 : 2;
            float intValue = num.intValue() + f;
            float A = td4.A(scaleY, 1.0f, bounds.centerY(), -(scaleY > 1.5f ? (bounds.height() * 0.81f) + 1.0f : 0.0f));
            boolean m = m();
            byte b = this.e1;
            float scrimDrawableTranslationY = getScrimDrawableTranslationY() + A + (!m ? gm.L(b) : getMeasuredHeight() - (gm.L(b) / 2.0f));
            float width = (bounds.width() * scaleY) / 2.0f;
            float height = (bounds.height() * scaleY) / 2.0f;
            this.q1.set((int) (intValue - width), (int) (scrimDrawableTranslationY - height), (int) (intValue + width), (int) (scrimDrawableTranslationY + height));
            tm tmVar2 = this.p1;
            Rect rect = this.q1;
            int i = rect.left;
            Rect rect2 = this.q1;
            tmVar2.setBounds(i, rect.top, (int) ((rect.width() / scaleY) + i), (int) ((rect2.height() / scaleY) + rect2.top));
            Rect rect3 = this.q1;
            canvas.scale(scaleY, scaleY, rect3.left, rect3.top);
            this.p1.draw(canvas);
            tm tmVar3 = this.p1;
            tmVar3.w = alpha;
            tmVar3.setBounds(bounds);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        fz9 fz9Var = this.t1;
        if (fz9Var == null || this.u1 == null || fz9Var.F == null) {
            return;
        }
        canvas.save();
        canvas.translate(0.0f, -getTranslationY());
        this.t1.F.setAlpha((int) (this.s1 * 255.0f));
        this.t1.F.setBounds(this.u1);
        this.t1.F.setColorFilter(new PorterDuffColorFilter(on2.f(1.0f - this.n1, this.g1, this.o1), PorterDuff.Mode.SRC_IN));
        this.t1.F.draw(canvas);
        canvas.restore();
    }

    public final long e() {
        return Math.max(300L, Math.min(45, this.Q1 - this.P1) * 25) + d() + 16;
    }

    public final void f() {
        boolean canScrollVertically = (this.H1 ? this.j0 : this.i0).canScrollVertically(1);
        if (canScrollVertically != this.x1) {
            this.x1 = canScrollVertically;
            wi8.s(this.p0.animate(), canScrollVertically ? 1.0f : 0.0f, 200L);
        }
    }

    public final boolean g() {
        if (this.U) {
            return true;
        }
        ValueAnimator valueAnimator = this.W1;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    public yxa getCollectionParticles() {
        yxa yxaVar = this.S1;
        if (yxaVar != null) {
            return yxaVar;
        }
        yxa yxaVar2 = new yxa(1, 8);
        this.S1 = yxaVar2;
        return yxaVar2;
    }

    public long getDialogId() {
        return z8c.h(this.W).e();
    }

    public float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(int i, View view) {
        boolean z;
        int i2;
        int i3;
        Integer num;
        int i4;
        int i5;
        boolean z2;
        int i6 = this.z0.get(i);
        byte b = 1;
        Integer num2 = null;
        if (i6 >= 0) {
            ArrayList arrayList = this.N0;
            if (i6 < arrayList.size()) {
                s14 s14Var = (s14) arrayList.get(i6);
                if (s14Var.h) {
                    return;
                }
                boolean z3 = i6 + 1 == arrayList.size();
                i4 = this.y0.get(i6);
                this.B0.add(Long.valueOf(s14Var.b.id));
                boolean z4 = s14Var.h;
                ArrayList arrayList2 = s14Var.c;
                i2 = 24;
                i3 = z4 ? arrayList2.size() : Math.min(24, arrayList2.size());
                num = s14Var.c.size() > 24 ? Integer.valueOf(i4 + 1 + i3) : null;
                s14Var.h = true;
                i5 = s14Var.c.size();
                z2 = z3;
                if (i5 > i3) {
                    num = Integer.valueOf(i4 + 1 + i3);
                    num2 = Integer.valueOf(i5 - i3);
                }
                B(false, true, true);
                if (num != null || num2 == null) {
                }
                this.O1 = view;
                this.P1 = num.intValue();
                this.Q1 = num2.intValue() + num.intValue();
                this.R1 = SystemClock.elapsedRealtime();
                if (z2) {
                    post(new n14(this, num2.intValue() > i2 / 2 ? 1.5f : 3.5f, num.intValue(), b));
                    return;
                }
                return;
            }
        }
        if (i6 != -1 || (z = this.D0)) {
            return;
        }
        int i7 = (this.a != -1 ? 1 : 0) + (this.w != -1 ? 1 : 0);
        boolean z5 = this.O0;
        int i8 = i7 + (z5 ? 1 : 0);
        ArrayList arrayList3 = this.E0;
        int size = z ? arrayList3.size() : Math.min(38 - (z5 ? 1 : 0), arrayList3.size());
        int size2 = arrayList3.size();
        this.D0 = true;
        i2 = 40;
        i3 = size;
        num = null;
        i4 = i8;
        i5 = size2;
        z2 = false;
        if (i5 > i3) {
        }
        B(false, true, true);
        if (num != null) {
        }
    }

    public final void k() {
        int i = this.a0;
        if (i != 2) {
            String j = b10.j(new StringBuilder("emoji"), (i == 0 || i == 12 || i == 9 || i == 10) ? "status" : "reaction", "usehint");
            int i2 = oc7.d1().getInt(j, 0);
            if (i2 <= 3) {
                oc7.d1().edit().putInt(j, i2 + 1).apply();
            }
        }
    }

    public final boolean m() {
        int i = this.a0;
        return i == 5 || i == 10 || i == 12 || i == 15;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0022, code lost:
    
        if (r13.L.contains(java.lang.Long.valueOf(r15.documentId)) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(View view, gn gnVar) {
        k();
        if (gnVar != null) {
            int i = this.a0;
            if (i == 0 || i == 12 || i == 9 || i == 10) {
            }
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = gnVar.getDocumentId();
            TLRPC.Document document = gnVar.document;
            int i2 = this.W;
            if (document == null) {
                document = vm.e(i2, gnVar.documentId);
            }
            if (!(view instanceof fz9)) {
                o(view, Long.valueOf(gnVar.documentId), document, null, null);
                return;
            }
            final fz9 fz9Var = (fz9) view;
            if (fz9Var.w == null && (i == 0 || i == 12 || i == 9 || i == 10)) {
                hs6.d0(i2).E1(tL_emojiStatus);
            }
            if (i != 0 && i != 12 && i != 9 && i != 10 && i != 2) {
                o(view, Long.valueOf(gnVar.documentId), document, fz9Var.w, null);
                return;
            }
            TLRPC.Document document2 = document;
            if (!F(fz9Var.w)) {
                o(view, Long.valueOf(gnVar.documentId), document2, fz9Var.w, null);
                return;
            }
            final hz7 hz7Var = new hz7((Object) this, (Object) view, (Object) gnVar, (Object) document2, (Object) fz9Var, (byte) 17);
            if (this.w1 != null || this.p1 == null) {
                hz7Var.run();
                return;
            }
            fz9Var.b = true;
            final Rect rect = new Rect();
            qy9 qy9Var = this.b0;
            int left = qy9Var.getLeft();
            ty9 ty9Var = this.i0;
            rect.set(fz9Var.getLeft() + ty9Var.getLeft() + left, fz9Var.getTop() + ty9Var.getTop() + qy9Var.getTop(), fz9Var.getRight() + ty9Var.getLeft() + qy9Var.getLeft(), fz9Var.getBottom() + ty9Var.getTop() + qy9Var.getTop());
            Drawable drawable = fz9Var.F;
            final vm m = drawable instanceof vm ? vm.m(i2, ((vm) drawable).h(), null, 7) : null;
            this.t1 = fz9Var;
            Rect rect2 = new Rect();
            this.u1 = rect2;
            rect2.set(rect);
            final boolean[] zArr = new boolean[1];
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.w1 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: by9
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    tm tmVar;
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    float v = aq1.v(floatValue, floatValue, floatValue, 1.0f);
                    vz9 vz9Var = vz9.this;
                    vz9Var.n1 = v;
                    vz9Var.s1 = 1.0f - ((float) Math.pow(floatValue, 10.0d));
                    gm.V1(rect, vz9Var.q1, floatValue, vz9Var.u1);
                    float scaleX = fz9Var.getScaleX() * Math.max(1.0f, vz9Var.v1.getInterpolation(pqe.a((3.0f * floatValue) - 2.0f, 0.0f, 1.0f)));
                    vz9Var.u1.set((int) hg9.x(vz9Var.u1.width(), 2.0f, scaleX, r0.centerX()), (int) hg9.x(vz9Var.u1.height(), 2.0f, scaleX, vz9Var.u1.centerY()), (int) b10.A(vz9Var.u1.width(), 2.0f, scaleX, vz9Var.u1.centerX()), (int) b10.A(vz9Var.u1.height(), 2.0f, scaleX, vz9Var.u1.centerY()));
                    vz9Var.invalidate();
                    if (floatValue > 0.85f) {
                        boolean[] zArr2 = zArr;
                        if (zArr2[0]) {
                            return;
                        }
                        zArr2[0] = true;
                        hz7Var.run();
                        if (m == null || (tmVar = vz9Var.p1) == null) {
                            return;
                        }
                        tmVar.f();
                    }
                }
            });
            this.w1.addListener(new i8(this, zArr, hz7Var, (byte) 11));
            this.w1.setInterpolator(d53.h);
            this.w1.setDuration(260L);
            this.w1.start();
            return;
        }
        o(view, null, null, null, null);
    }

    public abstract void o(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num);

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
        int i = this.W;
        nm7.f(i).b(this, nm7.A0);
        nm7.f(i).b(this, nm7.x0);
        nm7.f(i).b(this, nm7.C1);
        nm7.f(i).b(this, nm7.B0);
        nm7.e().b(this, nm7.m4);
        int i2 = this.a0;
        if (i2 == 0 || i2 == 12) {
            nm7.f(i).b(this, nm7.I3);
        }
        tm tmVar = this.p1;
        if (tmVar != null) {
            tmVar.n = this;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setBigReactionAnimatedEmoji(null);
        this.J = false;
        int i = this.W;
        nm7.f(i).n(this, nm7.A0);
        nm7.f(i).n(this, nm7.x0);
        nm7.f(i).n(this, nm7.C1);
        nm7.f(i).n(this, nm7.B0);
        nm7.e().n(this, nm7.m4);
        int i2 = this.a0;
        if (i2 == 0 || i2 == 12) {
            nm7.f(i).n(this, nm7.I3);
        }
        tm tmVar = this.p1;
        if (tmVar != null) {
            tmVar.n = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z && this.a0 == 6) {
            this.s0.x1((getMeasuredWidth() / gm.L(42.0f)) * 5);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z = this.R0;
        int i3 = this.a0;
        if (z && i3 != 3 && i3 != 4) {
            float L = gm.L(324.0f);
            Point point = gm.q;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.min(L, point.x * 0.95f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) Math.min(gm.L(330.0f), point.y * 0.75f), TLObject.FLAG_31));
        } else if (i3 == 6) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (gm.q.y * 0.35f), TLObject.FLAG_31));
        } else {
            super.onMeasure(i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r(lz9 lz9Var) {
        Integer num = this.a2;
        if (num != null) {
        }
        this.V1 = lz9Var;
        boolean z = this.R0;
        ty9 ty9Var = this.i0;
        if (!z) {
            f();
            for (int i = 0; i < ty9Var.getChildCount(); i++) {
                View childAt = ty9Var.getChildAt(i);
                childAt.setScaleX(1.0f);
                childAt.setScaleY(1.0f);
            }
            return;
        }
        ValueAnimator valueAnimator = this.W1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.W1 = null;
        }
        ValueAnimator valueAnimator2 = this.X1;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.X1 = null;
        }
        int i2 = this.a0;
        if (i2 == 3 || i2 == 4 || i2 == 6) {
            f();
            E(1.0f);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.W1 = ofFloat;
        ofFloat.addUpdateListener(new yx9(this, null == true ? 1 : 0));
        this.W1.addListener(new c39((Object) this, (byte) 10));
        zx9 zx9Var = new zx9(this, null == true ? 1 : 0);
        oi5.f = true;
        oi5.e = true;
        oi5.g = false;
        if (oi5.d) {
            oi5.d = false;
        }
        oi5.c = zx9Var;
        nm7.e().k(nm7.j1, 512);
        this.Y1.d();
        this.W1.setDuration(800L);
        ty9Var.setLayerType(2, null);
        this.g0.setLayerType(2, null);
        this.f0.setLayerType(2, null);
        this.c0.setLayerType(2, null);
        o72 o72Var = this.o0;
        if (o72Var != null) {
            o72Var.setLayerType(2, null);
        }
        View view = this.n0;
        if (view != null) {
            view.setLayerType(2, null);
        }
        this.e0.m(true);
        E(0.0f);
    }

    public void setAnimationsEnabled(boolean z) {
        this.Q = z;
    }

    public void setBackgroundDelegate(wy9 wy9Var) {
        this.V = wy9Var;
    }

    public void setDrawBackground(boolean z) {
        this.R0 = z;
        this.b0.setClipToOutline(z);
        a91 a91Var = this.c0;
        if (z) {
            a91Var.setVisibility(0);
        } else {
            a91Var.setVisibility(8);
        }
    }

    public void setEnterAnimationInProgress(boolean z) {
        if (this.U == z) {
            return;
        }
        this.U = z;
        if (z) {
            return;
        }
        gm.d0(this.i0, new bn0((byte) 26));
        int i = 0;
        while (true) {
            int childCount = this.e0.b.getChildCount();
            mz3 mz3Var = this.e0;
            if (i >= childCount) {
                mz3Var.b.invalidate();
                return;
            }
            View childAt = mz3Var.b.getChildAt(i);
            childAt.setScaleX(1.0f);
            childAt.setScaleY(1.0f);
            i++;
        }
    }

    public void setExpireDateHint(int i) {
        if (i <= 0) {
            return;
        }
        this.P0 = true;
        this.Q0 = Integer.valueOf(i);
        B(true, false, true);
    }

    public void setForUser(boolean z) {
        this.S = z;
        B(false, false, true);
    }

    public void setForumIconDrawable(Drawable drawable) {
        this.O = drawable;
        fz9 fz9Var = this.P;
        if (fz9Var != null) {
            fz9Var.h.g0(drawable);
        }
    }

    public void setLongPressEnabled(boolean z) {
        this.i1 = z;
    }

    public void setOnLongPressedListener(tz9 tz9Var) {
        this.I = tz9Var;
    }

    public void setRecentReactions(List<k39> list) {
        this.S0 = list;
        B(false, true, true);
    }

    public void setSaveState(int i) {
        this.a2 = Integer.valueOf(i);
    }

    public void setSelected(Long l) {
        HashSet hashSet = this.L;
        hashSet.clear();
        hashSet.add(l);
        ty9 ty9Var = this.i0;
        if (ty9Var != null) {
            for (int i = 0; i < ty9Var.getChildCount(); i++) {
                if (ty9Var.getChildAt(i) instanceof fz9) {
                    fz9 fz9Var = (fz9) ty9Var.getChildAt(i);
                    gn gnVar = fz9Var.e;
                    if (gnVar != null) {
                        fz9Var.d(hashSet.contains(Long.valueOf(gnVar.getDocumentId())), true);
                    } else {
                        fz9Var.d(hashSet.contains(0L), true);
                    }
                }
            }
            ty9Var.invalidate();
        }
    }

    public void setSelectedReaction(k39 k39Var) {
        this.K.clear();
        this.K.add(k39Var);
        ty9 ty9Var = this.i0;
        if (ty9Var != null) {
            for (int i = 0; i < ty9Var.getChildCount(); i++) {
                if (ty9Var.getChildAt(i) instanceof fz9) {
                    fz9 fz9Var = (fz9) ty9Var.getChildAt(i);
                    fz9Var.d(this.K.contains(fz9Var.y), true);
                }
            }
            ty9Var.invalidate();
        }
        jy9 jy9Var = this.j0;
        if (jy9Var != null) {
            for (int i2 = 0; i2 < jy9Var.getChildCount(); i2++) {
                if (jy9Var.getChildAt(i2) instanceof fz9) {
                    fz9 fz9Var2 = (fz9) jy9Var.getChildAt(i2);
                    fz9Var2.d(this.K.contains(fz9Var2.y), true);
                }
            }
            jy9Var.invalidate();
        }
    }

    public void setSelectedReactions(ArrayList<String> arrayList) {
        this.K.clear();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            String str = arrayList.get(i);
            i++;
            this.K.add(k39.b(str));
        }
        ty9 ty9Var = this.i0;
        if (ty9Var != null) {
            for (int i2 = 0; i2 < ty9Var.getChildCount(); i2++) {
                if (ty9Var.getChildAt(i2) instanceof fz9) {
                    fz9 fz9Var = (fz9) ty9Var.getChildAt(i2);
                    fz9Var.d(this.K.contains(fz9Var.y), true);
                }
            }
            ty9Var.invalidate();
        }
    }

    public boolean t() {
        return false;
    }

    public final void u(int i, int i2) {
        ky9 ky9Var = this.s0;
        View m = ky9Var.m(i);
        int K0 = ky9Var.K0();
        if ((m != null || Math.abs(i - K0) <= 72.0f) && gda.c()) {
            rw3 rw3Var = new rw3((byte) 4, this.i0.getContext(), this);
            rw3Var.a = i;
            rw3Var.p = i2;
            ky9Var.v0(rw3Var);
            return;
        }
        int i3 = ky9Var.K0() < i ? 0 : 1;
        cw6 cw6Var = this.t0;
        cw6Var.b = i3;
        cw6Var.l(i, i2, false, false);
    }

    @Override // vlb
    public final void updateColors() {
        int v0;
        try {
            if (!this.m1 || (v0 = cmb.v0(cmb.u6, this.a1)) == this.g1) {
                return;
            }
            this.g1 = v0;
            this.N.setColor(on2.p(v0, 30));
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.g1, PorterDuff.Mode.SRC_IN);
            this.l1 = porterDuffColorFilter;
            vm vmVar = this.X0;
            if (vmVar != null) {
                vmVar.setColorFilter(porterDuffColorFilter);
            }
            ty9 ty9Var = this.i0;
            if (ty9Var != null) {
                ty9Var.invalidate();
            }
            jy9 jy9Var = this.j0;
            if (jy9Var != null) {
                jy9Var.invalidate();
            }
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void v(String str, boolean z, boolean z2) {
        zx9 zx9Var = this.K1;
        if (zx9Var != null) {
            gm.r(zx9Var);
            this.K1 = null;
        }
        hy6 hy6Var = this.L1;
        if (hy6Var != null) {
            gm.r(hy6Var);
            this.L1 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        gz9 gz9Var = this.r0;
        ny9 ny9Var = this.g0;
        byte b = 1;
        if (isEmpty) {
            this.z1 = false;
            this.A1 = false;
            z(false, z);
            if (ny9Var != null) {
                ny9Var.d(true);
                ny9Var.c(false);
            }
            gz9Var.E(true);
            this.B1 = null;
        } else {
            boolean z3 = this.z1;
            boolean z4 = !z3;
            this.z1 = true;
            this.A1 = false;
            if (ny9Var != null) {
                ny9Var.f.b(2);
            }
            if (!z3) {
                ArrayList arrayList = this.C1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = this.D1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = this.F1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                gz9Var.E(false);
            } else if (!str.equals(this.B1)) {
                zx9 zx9Var2 = new zx9(this, b);
                this.K1 = zx9Var2;
                gm.d3(zx9Var2, 120L);
            }
            this.B1 = str;
            String[] F0 = gm.F0();
            if (!Arrays.equals(F0, c2)) {
                hs6.d0(this.W).O(F0, false);
            }
            c2 = F0;
            hy6 hy6Var2 = new hy6(this, str, z, z4, F0, (byte) 4);
            this.L1 = hy6Var2;
            gm.d3(hy6Var2, z2 ? 425L : 0L);
            if (ny9Var != null) {
                ny9Var.f.b(2);
                ny9Var.c(z);
            }
        }
        C();
    }

    public final void w(float f) {
        ValueAnimator valueAnimator = this.j1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.j1 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.u0.getAlpha(), f * 0.25f);
        this.j1 = ofFloat;
        ofFloat.addUpdateListener(new yx9(this, (byte) 2));
        this.j1.setDuration(200L);
        this.j1.setInterpolator(d53.f);
        this.j1.start();
    }

    public final void x(Long l, boolean z) {
        boolean z2;
        HashSet hashSet = this.L;
        if (hashSet.contains(l)) {
            hashSet.remove(l);
            z2 = false;
        } else {
            hashSet.add(l);
            z2 = true;
        }
        ty9 ty9Var = this.i0;
        if (ty9Var != null) {
            for (int i = 0; i < ty9Var.getChildCount(); i++) {
                if (ty9Var.getChildAt(i) instanceof fz9) {
                    fz9 fz9Var = (fz9) ty9Var.getChildAt(i);
                    gn gnVar = fz9Var.e;
                    if (gnVar == null || gnVar.getDocumentId() != l.longValue()) {
                        TLRPC.Document document = fz9Var.d;
                        if (document != null && document.id == l.longValue()) {
                            fz9Var.e(z2, z);
                        }
                    } else {
                        fz9Var.e(z2, z);
                    }
                }
            }
            ty9Var.invalidate();
        }
    }

    public final void y(tm tmVar, View view) {
        Integer num;
        this.o1 = (tmVar == null || (num = tmVar.G) == null) ? 0 : num.intValue();
        this.p1 = tmVar;
        this.r1 = view;
        if (this.J && tmVar != null) {
            tmVar.n = this;
        }
        invalidate();
    }

    public final void z(boolean z, boolean z2) {
        if (this.H1 == z) {
            return;
        }
        this.H1 = z;
        ty9 ty9Var = this.i0;
        byte b = 0;
        ty9Var.setVisibility(0);
        jy9 jy9Var = this.j0;
        jy9Var.setVisibility(0);
        ValueAnimator valueAnimator = this.G1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.J1;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.J1 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.G1 = ofFloat;
        ofFloat.addUpdateListener(new cy9(this, z, b));
        this.G1.addListener(new py9(this, z, b));
        this.G1.setDuration(320L);
        this.G1.setInterpolator(d53.h);
        this.G1.start();
        wi8.t(((View) ty9Var.getParent()).animate().translationY((this.H1 && z2) ? -gm.L(36.0f) : 0.0f).setUpdateListener(new yx9(this, (byte) 1)), d53.f, 160L);
        if (this.H1 && z2) {
            jy9Var.setPadding(gm.L(5.0f), gm.L(54.0f), gm.L(5.0f), gm.L(38.0f));
        } else {
            jy9Var.setPadding(gm.L(5.0f), gm.L(54.0f), gm.L(5.0f), gm.L(38.0f));
        }
        f();
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }

    public void l() {
    }

    public void p() {
    }

    public void setOnRecentClearedListener(uz9 uz9Var) {
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
    }

    public void q(fz9 fz9Var, k39 k39Var) {
    }

    public void setSelectedReactions(HashSet<k39> hashSet) {
        this.K = hashSet;
        HashSet hashSet2 = this.L;
        hashSet2.clear();
        ArrayList arrayList = new ArrayList(hashSet);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) != null && ((k39) arrayList.get(i)).g != 0) {
                hashSet2.add(Long.valueOf(((k39) arrayList.get(i)).g));
            }
        }
    }

    public vz9(d dVar, Context context, boolean z, Integer num, int i, boolean z2, ylb ylbVar, int i2) {
        this(dVar, context, z, num, i, z2, ylbVar, i2, cmb.v0(cmb.u6, ylbVar));
    }

    public vz9(d dVar, Context context, boolean z, Integer num, int i, ylb ylbVar) {
        this(dVar, context, z, num, i, true, ylbVar, 16);
    }
}
