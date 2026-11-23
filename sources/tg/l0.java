package tg;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.n8;
import c8.na;
import fi.q7;
import fi.z2;
import hi.g5;
import hi.i5;
import hi.j4;
import hi.q4;
import hi.t4;
import hi.u5;
import hi.v4;
import hi.x3;
import j$.util.Objects;
import java.io.File;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import m.o3;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a20;
import org.telegram.messenger.a8;
import org.telegram.messenger.b20;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bz;
import org.telegram.messenger.f3;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.g6;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.j6;
import org.telegram.messenger.ks;
import org.telegram.messenger.m10;
import org.telegram.messenger.mp;
import org.telegram.messenger.r5;
import org.telegram.messenger.s2;
import org.telegram.messenger.we;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Cells.aa;
import org.telegram.ui.Components.bu0;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.Components.qt;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.w01;
import org.telegram.ui.Components.x5;
import org.telegram.ui.Components.xg;
import org.telegram.ui.Components.xt0;
import org.telegram.ui.Components.zg;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Wallet.o5;
import org.telegram.ui.ao0;
import org.telegram.ui.cd0;
import org.telegram.ui.gh0;
import org.telegram.ui.kn0;
import org.telegram.ui.tv;
import org.telegram.ui.vp0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public abstract class l0 extends du0 implements l1, l, h1, bu0, fs {
    public float A0;
    public final p A1;
    public xt0 B0;
    public org.telegram.ui.ActionBar.g1 B1;
    public n C0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout C1;
    public boolean D0;
    public Rect D1;
    public int E0;
    public Runnable E1;
    public final boolean F0;
    public final sg.j0 F1;
    public final g0 G0;
    public boolean G1;
    public final tv H0;
    public float H1;
    public final gh0 I0;
    public boolean I1;
    public final h0 J0;
    public final hi.a0 J1;
    public nz0 K0;
    public b0 K1;
    public final FrameLayout L0;
    public final aa L1;
    public final j0 M0;
    public boolean M1;
    public final w01 N0;
    public final c6 N1;
    public final FrameLayout O0;
    public final Paint O1;
    public i5 P0;
    public final Paint P1;
    public int Q0;
    public fh.g Q1;
    public int R0;
    public final float[] R1;
    public float S0;
    public final int[] S1;
    public ValueAnimator T0;
    public qy T1;
    public boolean U0;
    public boolean U1;
    public final r1 V0;
    public boolean V1;
    public final org.telegram.ui.ActionBar.i5 W0;
    public boolean W1;
    public ArrayList X0;
    public int X1;
    public final int Y0;
    public int Y1;
    public BigInteger Z0;
    public int Z1;
    public TextView a1;
    public int a2;
    public TextView b1;
    public boolean b2;
    public TextView c1;
    public final m1 d1;
    public final j1 e1;
    public final o1 f1;
    public final ImageView g1;
    public final LinearLayout h1;
    public final TextView i1;
    public final TextView j1;
    public final a1 k0;
    public final TextView k1;
    public final e1 l0;
    public final Paint l1;
    public float m0;
    public final Paint m1;
    public final Bitmap n0;
    public float n1;
    public final Bitmap o0;
    public boolean o1;
    public final sg.j1 p0;
    public r1.g p1;
    public final r5 q0;
    public final i0 q1;
    public final we r0;
    public final Paint r1;
    public float s0;
    public final Paint s1;
    public float t0;
    public final Paint t1;
    public float u0;
    public final sg.g1 u1;
    public float v0;
    public boolean v1;
    public float w0;
    public r1.g w1;
    public float x0;
    public float x1;
    public float y0;
    public final Paint y1;
    public boolean z0;
    public final int z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r34v0, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout, org.telegram.ui.Components.bu0, org.telegram.ui.Components.cu0, tg.h1, tg.l0, tg.l1] */
    /* JADX WARN: Type inference failed for: r4v39, types: [android.view.View, tg.d0, tg.j2] */
    /* JADX WARN: Type inference failed for: r5v3, types: [tg.p] */
    /* JADX WARN: Type inference failed for: r5v49, types: [tg.q2] */
    /* JADX WARN: Type inference failed for: r6v15, types: [android.view.View, tg.s1] */
    public l0(Context context, Activity activity, int i7, Bitmap bitmap, Bitmap bitmap2, int i10, ArrayList arrayList, we weVar, kn0 kn0Var, final i6 i6Var) {
        super(context, activity);
        d dVar;
        g6[] g6VarArr;
        ArrayList arrayList2 = arrayList;
        boolean z10 = false;
        this.Q0 = 0;
        this.R0 = -1;
        final vp0 vp0Var = (vp0) this;
        this.W0 = new org.telegram.ui.ActionBar.i5(vp0Var);
        byte b10 = 1;
        this.l1 = new Paint(1);
        this.m1 = new Paint(1);
        this.r1 = new Paint(1);
        this.s1 = new Paint(1);
        this.t1 = new Paint(1);
        sg.g1 g1Var = new sg.g1(1.0f, 0.016773745f, -1);
        this.u1 = g1Var;
        this.y1 = new Paint(1);
        aa aaVar = new aa(vp0Var, 20);
        this.L1 = aaVar;
        this.M1 = false;
        this.N1 = new c6((View) this, 350L, kr.h);
        this.O1 = new Paint(1);
        Paint paint = new Paint(1);
        this.P1 = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        new Matrix();
        this.R1 = new float[2];
        this.S1 = new int[2];
        new o5(vp0Var, 7);
        setDelegate(this);
        this.z1 = i7;
        File captionsVideoFile = getCaptionsVideoFile();
        hi.a0 a0Var = (captionsVideoFile != null && captionsVideoFile.exists() && DictationAsr.E(i7)) ? new hi.a0(captionsVideoFile, aaVar) : null;
        this.J1 = a0Var;
        int i11 = 19;
        if (a0Var != null) {
            a0Var.d = new org.telegram.ui.web.z0(vp0Var, i11);
        }
        this.A1 = new i6() { // from class: tg.p
            @Override // org.telegram.ui.ActionBar.i6
            public final boolean b() {
                return n6.I.q();
            }

            @Override // org.telegram.ui.ActionBar.i6
            public final void c(float f10, float f11, int i12, int i13) {
                n6.r(f10, f11, i12, i13);
            }

            @Override // org.telegram.ui.ActionBar.i6
            public final ColorFilter d() {
                return n6.v3;
            }

            @Override // org.telegram.ui.ActionBar.i6
            public final Paint e(String str) {
                return n6.V0(str);
            }

            @Override // org.telegram.ui.ActionBar.i6
            public final boolean f() {
                return bz.H0;
            }

            @Override // org.telegram.ui.ActionBar.i6
            public final int g(int i12) {
                return i(i12);
            }

            @Override // org.telegram.ui.ActionBar.i6
            public final /* synthetic */ Drawable getDrawable(String str) {
                return null;
            }

            @Override // org.telegram.ui.ActionBar.i6
            public final /* synthetic */ boolean h() {
                return false;
            }

            @Override // org.telegram.ui.ActionBar.i6
            public final int i(int i12) {
                if (i12 == n6.G8) {
                    return -14145495;
                }
                if (i12 == n6.E8) {
                    return -1;
                }
                if (i12 == n6.h5) {
                    return -14737633;
                }
                if (i12 == n6.j5) {
                    return -592138;
                }
                if (i12 == n6.r5) {
                    return -8553091;
                }
                if (i12 == n6.zf) {
                    return -16777216;
                }
                if (i12 == n6.Cf) {
                    return -1610612736;
                }
                if (i12 == n6.Ff || i12 == n6.Jf || i12 == n6.Ef) {
                    return -9539985;
                }
                if (i12 == n6.G6) {
                    return -1;
                }
                int i13 = n6.Di;
                if (i12 == i13) {
                    return -11754001;
                }
                if (i12 == n6.i6) {
                    return 536870911;
                }
                if (i12 == n6.wi || i12 == n6.vi || i12 == n6.xi) {
                    return -1;
                }
                if (i12 == n6.yi) {
                    return 352321535;
                }
                if (i12 == n6.Bf || i12 == i13) {
                    return -7895161;
                }
                if (i12 == n6.Af) {
                    return 780633991;
                }
                if (i12 == n6.a7) {
                    return -15921907;
                }
                if (i12 == n6.m7) {
                    return -12500671;
                }
                if (i12 == n6.l7) {
                    return -13133079;
                }
                if (i12 == n6.n7) {
                    return -1;
                }
                if (i12 == n6.d6) {
                    return -15198183;
                }
                if (i12 == n6.d7) {
                    return -16777216;
                }
                i6 i6Var2 = i6.this;
                return i6Var2 != null ? i6Var2.i(i12) : n6.v0(i12);
            }

            @Override // org.telegram.ui.ActionBar.i6
            public final int k(int i12) {
                return i(i12);
            }

            @Override // org.telegram.ui.ActionBar.i6
            public final /* synthetic */ void j(int i12, int i13) {
            }
        };
        this.r0 = weVar;
        this.F0 = context instanceof BubbleActivity;
        sg.j0 e10 = sg.j0.e(i7);
        this.F1 = e10;
        e10.i(0, true);
        g1Var.a = e10.c();
        g1Var.c = e10.i;
        r5 r5Var = new r5("Paint", true);
        this.q0 = r5Var;
        this.n0 = bitmap;
        this.o0 = bitmap2;
        this.Y0 = i10;
        sg.j1 j1Var = new sg.j1();
        this.p0 = j1Var;
        byte b11 = 2;
        j1Var.a = new org.telegram.tgnet.g(vp0Var, 29);
        g0 g0Var = new g0(vp0Var, context, new sg.h0(getPaintingSize(), bitmap2, i10, null), bitmap, bitmap2);
        this.G0 = g0Var;
        g0Var.setDelegate(new s2.e(vp0Var, kn0Var, z10, 4));
        g0Var.setUndoStore(j1Var);
        g0Var.setQueue(r5Var);
        g0Var.setVisibility(4);
        addView(g0Var, na.e(-1, -1, 51));
        tv tvVar = new tv(13, context, vp0Var);
        this.H0 = tvVar;
        tvVar.setVisibility(4);
        addView(tvVar, na.e(-1, -1, 51));
        h0 h0Var = new h0(vp0Var, context, new nd0(vp0Var, 17));
        this.J0 = h0Var;
        addView(h0Var);
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i12 = 0;
            d dVar2 = null;
            while (i12 < size) {
                b20 b20Var = (b20) arrayList2.get(i12);
                byte b12 = b20Var.a;
                if (b12 == 0) {
                    ?? i02 = i0(b20Var.C, b20Var.B, z10);
                    if ((b20Var.b & 2) != 0) {
                        i02.r(z10);
                    }
                    ViewGroup.LayoutParams layoutParams = i02.getLayoutParams();
                    layoutParams.width = b20Var.q;
                    layoutParams.height = b20Var.r;
                    dVar = i02;
                } else if (b12 == 11) {
                    if (dVar2 != null) {
                        dVar2.u(b20Var.V, b20Var.W, b20Var.j, b20Var.X);
                        i12++;
                        arrayList2 = arrayList;
                        z10 = false;
                        b10 = 1;
                        b11 = 2;
                    } else {
                        d g02 = g0();
                        g02.setType(b20Var.b);
                        g02.setTypeface(b20Var.n);
                        g02.setBaseFontSize(b20Var.m);
                        x0(g02, b20Var.p);
                        sg.g1 swatch = g02.getSwatch();
                        swatch.a = b20Var.l;
                        g02.setSwatch(swatch);
                        g02.u(b20Var.V, b20Var.W, b20Var.j, b20Var.X);
                        d dVar3 = g02;
                        dVar2 = dVar3;
                        dVar = dVar3;
                    }
                } else if (b12 == b10) {
                    ?? j02 = j0(false);
                    j02.setType(b20Var.b);
                    j02.setTypeface(b20Var.n);
                    j02.setBaseFontSize(b20Var.m);
                    SpannableString spannableString = new SpannableString(b20Var.j);
                    ArrayList arrayList3 = b20Var.k;
                    int size2 = arrayList3.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        Object obj = arrayList3.get(i13);
                        i13++;
                        a20 a20Var = (a20) obj;
                        x5 x5Var = new x5(a20Var.document_id, j02.getFontMetricsInt());
                        int i14 = a20Var.offset;
                        spannableString.setSpan(x5Var, i14, a20Var.length + i14, 33);
                        arrayList3 = arrayList3;
                    }
                    CharSequence m10 = j6.m(spannableString, j02.getFontMetricsInt(), false, null, 0);
                    if ((m10 instanceof Spanned) && (g6VarArr = (g6[]) ((Spanned) m10).getSpans(0, m10.length(), g6.class)) != null) {
                        for (g6 g6Var : g6VarArr) {
                            g6Var.b = 0.85f;
                        }
                    }
                    j02.setText(m10);
                    x0(j02, b20Var.p);
                    sg.g1 swatch2 = j02.getSwatch();
                    swatch2.a = b20Var.l;
                    j02.setSwatch(swatch2);
                    dVar = j02;
                } else {
                    byte b13 = b11;
                    if (b12 == b13) {
                        ?? h02 = h0(b20Var.j, false);
                        h02.D0 = false;
                        if ((b20Var.b & b13) != 0) {
                            h02.r(false);
                        }
                        if ((b20Var.b & 16) != 0) {
                            h02.t(false);
                        }
                        ViewGroup.LayoutParams layoutParams2 = h02.getLayoutParams();
                        layoutParams2.width = b20Var.q;
                        layoutParams2.height = b20Var.r;
                        dVar = h02;
                    } else {
                        i12++;
                        arrayList2 = arrayList;
                        z10 = false;
                        b10 = 1;
                        b11 = 2;
                    }
                }
                dVar.setX((b20Var.c * this.B0.a) - (((1.0f - b20Var.v) * b20Var.q) / 2.0f));
                dVar.setY((b20Var.d * this.B0.b) - (((1.0f - b20Var.v) * b20Var.r) / 2.0f));
                dVar.setPosition(new PointF((b20Var.q / 2.0f) + dVar.getX(), (b20Var.r / 2.0f) + dVar.getY()));
                dVar.setScale(b20Var.v);
                dVar.setRotation((float) (((-b20Var.e) / 3.141592653589793d) * 180.0d));
                i12++;
                arrayList2 = arrayList;
                z10 = false;
                b10 = 1;
                b11 = 2;
            }
        }
        this.J0.setVisibility(4);
        gh0 gh0Var = new gh0(context, 19);
        this.I0 = gh0Var;
        addView(gh0Var);
        ?? frameLayout = new FrameLayout(context);
        this.L0 = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout.setBackground(new GradientDrawable(orientation, new int[]{-16777216, 0}));
        addView(frameLayout, na.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.g1 = imageView;
        imageView.setImageResource(R.drawable.photo_undo2);
        imageView.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        imageView.setBackground(n6.h0(1090519039, 1, -1));
        final int i15 = 0;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: tg.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        vp0 vp0Var2 = vp0Var;
                        g0 g0Var2 = vp0Var2.G0;
                        if (g0Var2 != null && (g0Var2.getCurrentBrush() instanceof sg.g)) {
                            g0Var2.b();
                            vp0Var2.d1.setSelectedIndex(1);
                            vp0Var2.w((sg.h) sg.h.a.get(0));
                            break;
                        } else {
                            vp0Var2.p0.c();
                            break;
                        }
                        break;
                    case 1:
                        vp0 vp0Var3 = vp0Var;
                        g0 g0Var3 = vp0Var3.G0;
                        sg.j1 j1Var2 = vp0Var3.p0;
                        if (j1Var2.a()) {
                            if (g0Var3 != null && (g0Var3.getCurrentBrush() instanceof sg.g)) {
                                g0Var3.b();
                                vp0Var3.d1.setSelectedIndex(1);
                                vp0Var3.w((sg.h) sg.h.a.get(0));
                            }
                            g0Var3.a();
                            j1Var2.c.clear();
                            j1Var2.b.clear();
                            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(j1Var2, 14));
                            vp0Var3.J0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        vp0 vp0Var4 = vp0Var;
                        n nVar = vp0Var4.C0;
                        if (nVar instanceof q2) {
                            org.telegram.messenger.g0.v1(((q2) nVar).getFocusedView());
                        }
                        if (vp0Var4.U1) {
                            vp0Var4.n0(false);
                        }
                        vp0Var4.t0(vp0Var4.C0);
                        vp0Var4.u0(null, true);
                        break;
                    default:
                        vp0Var.u0(null, true);
                        break;
                }
            }
        });
        imageView.setAlpha(0.6f);
        imageView.setClickable(false);
        frameLayout.addView(imageView, na.d(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(n6.h0(822083583, 7, -1));
        linearLayout.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 16.0f);
        textView.setText(gd.N0(2131747073, null));
        linearLayout.addView(m10.e(context, R.drawable.photo_zoomout), na.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, na.r(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new bi.o(27));
        frameLayout.addView(linearLayout, na.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.i1 = textView2;
        textView2.setBackground(n6.h0(822083583, 7, -1));
        textView2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        textView2.setText(gd.N0(2131747085, null));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        final int i16 = 1;
        textView2.setTextSize(1, 16.0f);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: tg.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        vp0 vp0Var2 = vp0Var;
                        g0 g0Var2 = vp0Var2.G0;
                        if (g0Var2 != null && (g0Var2.getCurrentBrush() instanceof sg.g)) {
                            g0Var2.b();
                            vp0Var2.d1.setSelectedIndex(1);
                            vp0Var2.w((sg.h) sg.h.a.get(0));
                            break;
                        } else {
                            vp0Var2.p0.c();
                            break;
                        }
                        break;
                    case 1:
                        vp0 vp0Var3 = vp0Var;
                        g0 g0Var3 = vp0Var3.G0;
                        sg.j1 j1Var2 = vp0Var3.p0;
                        if (j1Var2.a()) {
                            if (g0Var3 != null && (g0Var3.getCurrentBrush() instanceof sg.g)) {
                                g0Var3.b();
                                vp0Var3.d1.setSelectedIndex(1);
                                vp0Var3.w((sg.h) sg.h.a.get(0));
                            }
                            g0Var3.a();
                            j1Var2.c.clear();
                            j1Var2.b.clear();
                            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(j1Var2, 14));
                            vp0Var3.J0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        vp0 vp0Var4 = vp0Var;
                        n nVar = vp0Var4.C0;
                        if (nVar instanceof q2) {
                            org.telegram.messenger.g0.v1(((q2) nVar).getFocusedView());
                        }
                        if (vp0Var4.U1) {
                            vp0Var4.n0(false);
                        }
                        vp0Var4.t0(vp0Var4.C0);
                        vp0Var4.u0(null, true);
                        break;
                    default:
                        vp0Var.u0(null, true);
                        break;
                }
            }
        });
        textView2.setAlpha(0.6f);
        TextView m11 = org.telegram.ui.Cells.c0.m(frameLayout, textView2, na.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.j1 = m11;
        m11.setBackground(n6.h0(822083583, 7, -1));
        m11.setText(gd.N0(2131752089, null));
        m11.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        m11.setGravity(16);
        m11.setTextColor(-1);
        m11.setTypeface(org.telegram.messenger.g0.o());
        m11.setTextSize(1, 16.0f);
        final int i17 = 2;
        m11.setOnClickListener(new View.OnClickListener() { // from class: tg.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i17) {
                    case 0:
                        vp0 vp0Var2 = vp0Var;
                        g0 g0Var2 = vp0Var2.G0;
                        if (g0Var2 != null && (g0Var2.getCurrentBrush() instanceof sg.g)) {
                            g0Var2.b();
                            vp0Var2.d1.setSelectedIndex(1);
                            vp0Var2.w((sg.h) sg.h.a.get(0));
                            break;
                        } else {
                            vp0Var2.p0.c();
                            break;
                        }
                        break;
                    case 1:
                        vp0 vp0Var3 = vp0Var;
                        g0 g0Var3 = vp0Var3.G0;
                        sg.j1 j1Var2 = vp0Var3.p0;
                        if (j1Var2.a()) {
                            if (g0Var3 != null && (g0Var3.getCurrentBrush() instanceof sg.g)) {
                                g0Var3.b();
                                vp0Var3.d1.setSelectedIndex(1);
                                vp0Var3.w((sg.h) sg.h.a.get(0));
                            }
                            g0Var3.a();
                            j1Var2.c.clear();
                            j1Var2.b.clear();
                            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(j1Var2, 14));
                            vp0Var3.J0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        vp0 vp0Var4 = vp0Var;
                        n nVar = vp0Var4.C0;
                        if (nVar instanceof q2) {
                            org.telegram.messenger.g0.v1(((q2) nVar).getFocusedView());
                        }
                        if (vp0Var4.U1) {
                            vp0Var4.n0(false);
                        }
                        vp0Var4.t0(vp0Var4.C0);
                        vp0Var4.u0(null, true);
                        break;
                    default:
                        vp0Var.u0(null, true);
                        break;
                }
            }
        });
        m11.setAlpha(0.0f);
        int i18 = 8;
        m11.setVisibility(8);
        TextView m12 = org.telegram.ui.Cells.c0.m(frameLayout, m11, na.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.k1 = m12;
        m12.setBackground(n6.h0(822083583, 7, -1));
        m12.setText(gd.N0(2131751342, null));
        m12.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        m12.setGravity(16);
        m12.setTextColor(-1);
        m12.setTypeface(org.telegram.messenger.g0.o());
        m12.setTextSize(1, 16.0f);
        final int i19 = 3;
        m12.setOnClickListener(new View.OnClickListener() { // from class: tg.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i19) {
                    case 0:
                        vp0 vp0Var2 = vp0Var;
                        g0 g0Var2 = vp0Var2.G0;
                        if (g0Var2 != null && (g0Var2.getCurrentBrush() instanceof sg.g)) {
                            g0Var2.b();
                            vp0Var2.d1.setSelectedIndex(1);
                            vp0Var2.w((sg.h) sg.h.a.get(0));
                            break;
                        } else {
                            vp0Var2.p0.c();
                            break;
                        }
                        break;
                    case 1:
                        vp0 vp0Var3 = vp0Var;
                        g0 g0Var3 = vp0Var3.G0;
                        sg.j1 j1Var2 = vp0Var3.p0;
                        if (j1Var2.a()) {
                            if (g0Var3 != null && (g0Var3.getCurrentBrush() instanceof sg.g)) {
                                g0Var3.b();
                                vp0Var3.d1.setSelectedIndex(1);
                                vp0Var3.w((sg.h) sg.h.a.get(0));
                            }
                            g0Var3.a();
                            j1Var2.c.clear();
                            j1Var2.b.clear();
                            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(j1Var2, 14));
                            vp0Var3.J0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        vp0 vp0Var4 = vp0Var;
                        n nVar = vp0Var4.C0;
                        if (nVar instanceof q2) {
                            org.telegram.messenger.g0.v1(((q2) nVar).getFocusedView());
                        }
                        if (vp0Var4.U1) {
                            vp0Var4.n0(false);
                        }
                        vp0Var4.t0(vp0Var4.C0);
                        vp0Var4.u0(null, true);
                        break;
                    default:
                        vp0Var.u0(null, true);
                        break;
                }
            }
        });
        m12.setAlpha(0.0f);
        m12.setVisibility(8);
        frameLayout.addView(m12, na.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        j0 j0Var = new j0(vp0Var, context);
        this.M0 = j0Var;
        j0Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), 0);
        j0Var.setBackground(new GradientDrawable(orientation, new int[]{0, TLObject.FLAG_31}));
        addView(j0Var, na.e(-1, ks.p1, 80));
        m1 m1Var = new m1(context, bitmap2 != null);
        this.d1 = m1Var;
        m1Var.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        m1Var.setDelegate(this);
        m1Var.setSelectedIndex(1);
        j0Var.addView(m1Var, na.c(48.0f, -1));
        j1 j1Var2 = new j1(context);
        this.e1 = j1Var2;
        j1Var2.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        j1Var2.setVisibility(8);
        j1Var2.setDelegate(this);
        j1Var2.setAlignment(sg.j0.e(i7).g);
        j0Var.addView(j1Var2, na.c(48.0f, -1));
        w01 w01Var = new w01(vp0Var, context);
        this.N0 = w01Var;
        addView(w01Var, na.c(-1.0f, -1));
        o1 o1Var = new o1(context);
        this.f1 = o1Var;
        o1Var.setVisibility(8);
        o1Var.setOnItemClickListener(new n8(vp0Var, 20));
        j1Var2.setTypefaceListView(o1Var);
        w01Var.addView(o1Var, na.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        Paint paint2 = this.l1;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.l1.setColor(1728053247);
        this.l1.setStrokeWidth(Math.max(2, org.telegram.messenger.g0.L(1.0f)));
        this.m1.setColor(n6.w0(n6.G8, this.A1));
        i0 i0Var = new i0(vp0Var, context);
        this.q1 = i0Var;
        i0Var.setVisibility(8);
        i0Var.setColorPalette(sg.j0.e(i7));
        i0Var.setColorListener(new r(vp0Var, 0));
        j0Var.addView(i0Var, na.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        a1 a1Var = new a1(context);
        this.k0 = a1Var;
        a1Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        a1Var.setBackground(n6.h0(1090519039, 1, -1));
        j0Var.addView(a1Var, na.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        e1 e1Var = new e1(context);
        this.l0 = e1Var;
        e1Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        e1Var.setBackground(n6.h0(1090519039, 1, -1));
        e1Var.setOnClickListener(new qt(vp0Var, context, bitmap2, i18));
        j0Var.addView(e1Var, na.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        r1 r1Var = new r1(context);
        this.V0 = r1Var;
        r1Var.setColorSwatch(this.u1);
        r1Var.setRenderView(this.G0);
        r1Var.setValueOverride(this.W0);
        this.u1.c = this.W0.get();
        r1Var.setOnUpdate(new ao0(vp0Var, i7, 15));
        addView(r1Var, na.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.O0 = frameLayout2;
        addView(frameLayout2, na.c(-1.0f, -1));
        this.t1.setStyle(style);
        this.t1.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        v0(this.u1, null);
        w((sg.h) sg.h.a.get(0));
        updateColors();
        if (Build.VERSION.SDK_INT >= 29) {
            Point point = org.telegram.messenger.g0.q;
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (point.y * 0.35f), org.telegram.messenger.g0.L(100.0f), (int) (point.y * 0.65d))));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8 A[Catch: all -> 0x002c, Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:4:0x0004, B:6:0x0022, B:8:0x0026, B:12:0x0036, B:14:0x005b, B:17:0x0062, B:18:0x0069, B:21:0x006e, B:22:0x0078, B:24:0x007e, B:26:0x0092, B:30:0x009c, B:34:0x00a8, B:36:0x00ab, B:41:0x00ae, B:46:0x00b5), top: B:3:0x0004, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void X(l0 l0Var) {
        sg.k0 k0Var;
        boolean z10;
        Bitmap bitmap = l0Var.o0;
        w8.b bVar = null;
        try {
            try {
                gf.c cVar = new gf.c(l0Var.getContext());
                cVar.c(1);
                cVar.b(1);
                cVar.b = false;
                bVar = cVar.a();
                if (!bVar.c.k()) {
                    if (s2.a) {
                        a8.d("face detection is not operational");
                    }
                    bVar.X0();
                    return;
                }
                i61 i61Var = new i61(20);
                b7.d dVar = (b7.d) i61Var.b;
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                i61Var.d = bitmap;
                dVar.a = width;
                dVar.b = height;
                dVar.c = l0Var.getFrameRotation();
                if (((ByteBuffer) i61Var.c) == null && ((Bitmap) i61Var.d) == null) {
                    throw new IllegalStateException("Missing image data.  Call either setBitmap or setImageData to specify the image");
                }
                try {
                    SparseArray e12 = bVar.e1(i61Var);
                    ArrayList arrayList = new ArrayList();
                    xt0 paintingSize = l0Var.getPaintingSize();
                    for (int i7 = 0; i7 < e12.size(); i7++) {
                        w8.a aVar = (w8.a) e12.get(e12.keyAt(i7));
                        int i10 = l0Var.Y0;
                        if (i10 % 360 != 90 && i10 % 360 != 270) {
                            z10 = false;
                            k0Var = new sg.k0(aVar, bitmap, paintingSize, z10);
                            if (!(k0Var.d == null)) {
                                arrayList.add(k0Var);
                            }
                        }
                        z10 = true;
                        k0Var = new sg.k0(aVar, bitmap, paintingSize, z10);
                        if (!(k0Var.d == null)) {
                        }
                    }
                    l0Var.X0 = arrayList;
                    bVar.X0();
                } catch (Throwable th2) {
                    a8.g(th2, true);
                    bVar.X0();
                }
            } catch (Exception e10) {
                a8.g(e10, true);
                if (0 == 0) {
                }
            }
        } catch (Throwable th3) {
            if (0 != 0) {
                bVar.X0();
            }
            throw th3;
        }
    }

    public static void Y(l0 l0Var) {
        n nVar;
        h0 h0Var = l0Var.J0;
        n nVar2 = l0Var.C0;
        if (nVar2 != null) {
            PointF E0 = l0Var.E0(nVar2);
            n nVar3 = l0Var.C0;
            if (nVar3 instanceof j2) {
                j2 j2Var = new j2(l0Var.getContext(), (j2) l0Var.C0, E0);
                j2Var.setDelegate(l0Var);
                h0Var.addView(j2Var);
                nVar = j2Var;
            } else if (nVar3 instanceof q2) {
                q2 q2Var = new q2(l0Var.getContext(), (q2) l0Var.C0, E0);
                q2Var.setDelegate(l0Var);
                q2Var.setMaxWidth((int) (l0Var.getPaintingSize().a - 20.0f));
                h0Var.addView(q2Var, na.c(-2.0f, -2));
                nVar = q2Var;
            } else {
                nVar = null;
            }
            l0Var.s0(nVar);
            l0Var.u0(nVar, true);
        }
        org.telegram.ui.ActionBar.g1 g1Var = l0Var.B1;
        if (g1Var == null || !g1Var.isShowing()) {
            return;
        }
        l0Var.B1.d(true);
    }

    public static /* synthetic */ void Z(vp0 vp0Var, Integer num) {
        vp0Var.setNewColor(num.intValue());
        vp0Var.z0(false);
    }

    public static void a0(vp0 vp0Var, Integer num) {
        sg.j0 j0Var = vp0Var.F1;
        j0Var.h(num.intValue(), true);
        j0Var.g();
        vp0Var.setNewColor(num.intValue());
        i0 i0Var = vp0Var.q1;
        i0Var.setSelectedColorIndex(j0Var.d());
        i0Var.getAdapter().f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ViewGroup getBarView() {
        return this.Q0 == 2 ? this.e1 : this.d1;
    }

    private int getFrameRotation() {
        int i7 = this.Y0;
        if (i7 == 90) {
            return 1;
        }
        if (i7 != 180) {
            return i7 != 270 ? 0 : 3;
        }
        return 2;
    }

    private xt0 getPaintingSize() {
        xt0 xt0Var = this.B0;
        if (xt0Var != null) {
            return xt0Var;
        }
        Bitmap bitmap = this.n0;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        int o4 = bz.o();
        int i7 = o4 != 0 ? o4 != 2 ? 2560 : 3840 : 1280;
        xt0 xt0Var2 = new xt0(width, height);
        float f10 = i7;
        xt0Var2.a = f10;
        float floor = (float) Math.floor((f10 * height) / width);
        xt0Var2.b = floor;
        if (floor > f10) {
            xt0Var2.b = f10;
            xt0Var2.a = (float) Math.floor((f10 * width) / height);
        }
        this.B0 = xt0Var2;
        return xt0Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewColor(int i7) {
        sg.g1 g1Var = this.u1;
        int i10 = g1Var.a;
        g1Var.a = i7;
        v0(g1Var, null);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new q4(this, i10, i7, 5));
        duration.start();
    }

    private void setTextType(int i7) {
        this.E0 = i7;
        n nVar = this.C0;
        if (nVar instanceof q2) {
            ((q2) nVar).setType(i7);
        }
        sg.j0 e10 = sg.j0.e(this.z1);
        e10.h = i7;
        e10.a.edit().putInt("text_type", i7).apply();
        this.e1.setOutlineType(i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextWeightRange(n nVar) {
        boolean z10 = nVar instanceof d;
        r1 r1Var = this.V0;
        if (z10) {
            r1Var.b(0.3f, 1.1f);
        } else {
            r1Var.b(0.5f, 2.0f);
        }
    }

    private void setupTabsLayout(Context context) {
        i5 i5Var = new i5(this, context);
        this.P0 = i5Var;
        i5Var.setClipToPadding(false);
        this.P0.setOrientation(0);
        this.M0.addView(this.P0, na.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.a1 = textView;
        textView.setText(gd.N0(2131747083, null).toUpperCase());
        TextView textView2 = this.a1;
        int i7 = n6.i6;
        p pVar = this.A1;
        u6.Q(textView2, n6.h0(n6.w0(i7, pVar), 7, -1), null, u6.M(i7), pVar);
        this.a1.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        this.a1.setTextColor(-1);
        this.a1.setTextSize(1, 14.0f);
        this.a1.setGravity(1);
        this.a1.setTypeface(org.telegram.messenger.g0.o());
        this.a1.setSingleLine();
        this.a1.setOnClickListener(new o(this, 0));
        this.P0.addView(this.a1, na.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.b1 = textView3;
        textView3.setText(gd.N0(2131747082, null).toUpperCase());
        u6.Q(this.b1, n6.h0(n6.w0(i7, pVar), 7, -1), null, u6.M(i7), pVar);
        this.b1.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        this.b1.setOnClickListener(new o(this, 1));
        this.b1.setTextColor(-1);
        this.b1.setTextSize(1, 14.0f);
        this.b1.setGravity(1);
        this.b1.setTypeface(org.telegram.messenger.g0.o());
        this.b1.setAlpha(0.6f);
        this.b1.setSingleLine();
        this.P0.addView(this.b1, na.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.c1 = textView4;
        textView4.setText(gd.N0(2131747081, null).toUpperCase());
        u6.Q(this.c1, n6.h0(n6.w0(i7, pVar), 7, -1), null, u6.M(i7), pVar);
        this.c1.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        this.c1.setTextColor(-1);
        this.c1.setTextSize(1, 14.0f);
        this.c1.setGravity(1);
        this.c1.setTypeface(org.telegram.messenger.g0.o());
        this.c1.setAlpha(0.6f);
        this.c1.setSingleLine();
        this.c1.setOnClickListener(new o(this, 4));
        this.P0.addView(this.c1, na.l(1.0f, 0, -2));
    }

    public static void x0(q2 q2Var, int i7) {
        q2Var.setAlign(i7);
        int i10 = 2;
        q2Var.getEditText().setGravity(i7 != 1 ? i7 != 2 ? 19 : 21 : 17);
        if (i7 == 1) {
            i10 = 4;
        } else if (i7 == 2 ? !gd.a0 : gd.a0) {
            i10 = 3;
        }
        q2Var.getEditText().setTextAlignment(i10);
    }

    @Override // tg.l1
    public final void A() {
        B0(new t(this, 5), this, 53, 0, getHeight());
    }

    public final void A0(int i7) {
        j1 j1Var = this.e1;
        int i10 = 0;
        int i11 = 1;
        if (i7 != 1) {
            zg emojiButton = j1Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(xg.e, true);
            }
            qy qyVar = this.T1;
            if (qyVar != null) {
                this.U1 = false;
                if (org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                    qyVar.setVisibility(8);
                }
            }
            if (i7 == 0) {
                this.X1 = 0;
            }
            x3 x3Var = ((vp0) this).d2.L1;
            if (x3Var != null) {
                x3Var.a();
            }
            requestLayout();
            getHeight();
            return;
        }
        qy qyVar2 = this.T1;
        boolean z10 = qyVar2 != null && qyVar2.getVisibility() == 0;
        qy qyVar3 = this.T1;
        if (qyVar3 != null && qyVar3.d1 != i10.t0) {
            removeView(qyVar3);
            this.T1 = null;
        }
        if (this.T1 == null) {
            qy qyVar4 = new qy(null, true, false, false, getContext(), false, null, null, true, this.A1, false, false);
            this.T1 = qyVar4;
            qyVar4.V0 = true;
            qyVar4.setVisibility(8);
            if (org.telegram.messenger.g0.Q1()) {
                this.T1.setForseMultiwindowLayout(true);
            }
            this.T1.setDelegate(new f0(this));
            addView(this.T1);
        }
        this.T1.setVisibility(0);
        this.U1 = true;
        qy qyVar5 = this.T1;
        if (this.Y1 <= 0) {
            if (org.telegram.messenger.g0.Q1()) {
                this.Y1 = org.telegram.messenger.g0.L(150.0f);
            } else {
                this.Y1 = mp.f1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
            }
        }
        if (this.Z1 <= 0) {
            if (org.telegram.messenger.g0.Q1()) {
                this.Z1 = org.telegram.messenger.g0.L(150.0f);
            } else {
                this.Z1 = mp.f1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
            }
        }
        Point point = org.telegram.messenger.g0.q;
        int i12 = point.x > point.y ? this.Z1 : this.Y1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) qyVar5.getLayoutParams();
        layoutParams.height = i12;
        qyVar5.setLayoutParams(layoutParams);
        if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
            n nVar = this.C0;
            if (nVar instanceof q2) {
                org.telegram.messenger.g0.v1(((q2) nVar).getEditText());
            }
        }
        this.X1 = i12;
        requestLayout();
        x3 x3Var2 = ((vp0) this).d2.L1;
        if (x3Var2 != null) {
            x3Var2.a();
        }
        zg emojiButton2 = j1Var.getEmojiButton();
        if (emojiButton2 != null) {
            emojiButton2.j(xg.d, true);
        }
        getHeight();
        if (z10 || this.V1) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.X1, 0.0f);
        ofFloat.addUpdateListener(new u(this, i11));
        ofFloat.addListener(new e0(this, i10));
        ofFloat.start();
    }

    public final void B0(Runnable runnable, l0 l0Var, int i7, int i10, int i11) {
        org.telegram.ui.ActionBar.g1 g1Var = this.B1;
        if (g1Var != null && g1Var.isShowing()) {
            this.B1.d(true);
            return;
        }
        int i12 = 2;
        if (this.C1 == null) {
            this.D1 = new Rect();
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(getContext(), this.A1);
            this.C1 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(true);
            this.C1.setBackgroundColor(-14145495);
            this.C1.setOnTouchListener(new t4(i12, this));
            this.C1.setDispatchKeyEventListener(new w(this));
            this.C1.setShownFromBottom(true);
        }
        this.C1.d();
        runnable.run();
        if (this.B1 == null) {
            org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(this.C1, -2, -2);
            this.B1 = g1Var2;
            g1Var2.b = true;
            g1Var2.setAnimationStyle(R.style.PopupAnimation);
            this.B1.setOutsideTouchable(true);
            this.B1.setClippingEnabled(true);
            this.B1.setInputMethodMode(2);
            this.B1.setSoftInputMode(0);
            this.B1.getContentView().setFocusableInTouchMode(true);
            this.B1.setOnDismissListener(new v4(i12, this));
        }
        this.C1.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
        this.B1.setFocusable(true);
        this.B1.showAtLocation(l0Var, i7, i10 - (this.C1.getMeasuredWidth() / 2), i11 - this.C1.getMeasuredHeight());
        org.telegram.ui.ActionBar.g1.i(this.C1);
    }

    public final void C0(boolean z10) {
        if (this.o1 != z10) {
            this.o1 = z10;
            r1.g gVar = this.p1;
            if (gVar != null) {
                gVar.d();
            }
            r1.g gVar2 = new r1.g(new r1.f(z10 ? 0.0f : 1000.0f));
            this.p1 = gVar2;
            r1.h hVar = new r1.h();
            hVar.i = z10 ? 1000.0f : 0.0f;
            hVar.b(1250.0f);
            hVar.a(1.0f);
            gVar2.m = hVar;
            if (z10) {
                o1 o1Var = this.f1;
                o1Var.setAlpha(0.0f);
                o1Var.setVisibility(0);
            }
            this.p1.b(new q7(3, this));
            this.p1.a(new x(this, z10, 0));
            this.p1.h();
        }
    }

    @Override // tg.h1
    public final void D() {
        C0(true);
    }

    public final void D0() {
        hi.a0 a0Var = this.J1;
        if (a0Var != null) {
            a0Var.b.c();
            o3 o3Var = a0Var.c;
            if (o3Var != null) {
                o3Var.f = null;
                fc fcVar = (fc) o3Var.h;
                if (fcVar != null) {
                    fcVar.b();
                    o3Var.h = null;
                }
                a0Var.c = null;
            }
        }
        this.G0.h();
        this.J0.setVisibility(8);
        this.I0.setVisibility(8);
        this.q0.postRunnable(new cd0(23));
    }

    public final PointF E0(n nVar) {
        we weVar = this.r0;
        float f10 = weVar != null ? 200.0f / weVar.c : 200.0f;
        if (nVar != null) {
            PointF position = nVar.getPosition();
            return new PointF(position.x + f10, position.y + f10);
        }
        float f11 = weVar != null ? 100.0f / weVar.c : 100.0f;
        PointF f02 = f0();
        while (true) {
            int i7 = 0;
            boolean z10 = false;
            while (true) {
                h0 h0Var = this.J0;
                if (i7 >= h0Var.getChildCount()) {
                    break;
                }
                View childAt = h0Var.getChildAt(i7);
                if (childAt instanceof n) {
                    PointF position2 = ((n) childAt).getPosition();
                    if (((float) Math.sqrt(Math.pow(position2.y - f02.y, 2.0d) + Math.pow(position2.x - f02.x, 2.0d))) < f11) {
                        z10 = true;
                    }
                }
                i7++;
            }
            if (!z10) {
                return f02;
            }
            f02 = new PointF(f02.x + f10, f02.y + f10);
        }
    }

    public final void F0(int i7) {
        if (this.Q0 == i7 || this.R0 == i7) {
            return;
        }
        ValueAnimator valueAnimator = this.T0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = this.Q0;
        ViewGroup viewGroup = this.e1;
        ViewGroup viewGroup2 = this.d1;
        ViewGroup viewGroup3 = i10 == 0 ? viewGroup2 : i10 == 2 ? viewGroup : null;
        this.R0 = i7;
        ViewGroup viewGroup4 = i7 == 0 ? viewGroup2 : i7 == 2 ? viewGroup : null;
        int i11 = this.z1;
        sg.j0 e10 = sg.j0.e(i11);
        boolean z10 = i7 == 2;
        if (e10.l != z10) {
            e10.l = z10;
            if (z10) {
                e10.i(-1, false);
            } else {
                e10.i(e10.a.getInt("brush", 0), false);
            }
        }
        int c10 = sg.j0.e(i11).c();
        sg.g1 g1Var = this.u1;
        g1Var.a = c10;
        this.I1 = i7 != 2;
        v0(g1Var, null);
        this.I1 = false;
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        this.T0 = duration;
        duration.setInterpolator(kr.f);
        this.T0.addUpdateListener(new z2(this, viewGroup3, viewGroup4, 4));
        this.T0.addListener(new bi.z0(this, viewGroup3, viewGroup4, i7, 4));
        this.T0.start();
    }

    public final void G0() {
        int i7 = 0;
        while (true) {
            h0 h0Var = this.J0;
            if (i7 >= h0Var.getChildCount()) {
                return;
            }
            View childAt = h0Var.getChildAt(i7);
            if (childAt != this.C0) {
                if (childAt instanceof n) {
                    n nVar = (n) childAt;
                    if (!nVar.n0 && nVar.l0 <= 0.0f) {
                    }
                }
                i7++;
            }
            ((n) childAt).m();
            i7++;
        }
    }

    @Override // org.telegram.ui.Components.bu0
    public final void L(int i7, boolean z10) {
        boolean z11;
        if (i7 > org.telegram.messenger.g0.L(50.0f) && this.V1 && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
            if (z10) {
                this.Z1 = i7;
                mp.f1().edit().putInt("kbd_height_land3", this.Z1).commit();
            } else {
                this.Y1 = i7;
                mp.f1().edit().putInt("kbd_height", this.Y1).commit();
            }
        }
        if (this.U1) {
            int i10 = z10 ? this.Z1 : this.Y1;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.T1.getLayoutParams();
            int i11 = layoutParams.width;
            int i12 = org.telegram.messenger.g0.q.x;
            if (i11 != i12 || layoutParams.height != i10) {
                layoutParams.width = i12;
                layoutParams.height = i10;
                this.T1.setLayoutParams(layoutParams);
                this.X1 = layoutParams.height;
                requestLayout();
                x3 x3Var = ((vp0) this).d2.L1;
                if (x3Var != null) {
                    x3Var.a();
                }
                getHeight();
            }
        }
        if (this.a2 == i7 && this.b2 == z10) {
            getHeight();
            return;
        }
        this.a2 = i7;
        this.b2 = z10;
        boolean z12 = this.V1;
        n nVar = this.C0;
        if (nVar instanceof q2) {
            this.V1 = ((q2) nVar).getEditText().isFocused() && i7 > 0;
        } else {
            this.V1 = false;
        }
        if (this.V1 && this.U1) {
            A0(0);
        }
        if (this.X1 != 0 && !(z11 = this.V1) && z11 != z12 && !this.U1) {
            this.X1 = 0;
            requestLayout();
            x3 x3Var2 = ((vp0) this).d2.L1;
            if (x3Var2 != null) {
                x3Var2.a();
            }
        }
        getHeight();
    }

    @Override // tg.l1, tg.h1
    public final void a() {
        z0(true);
    }

    @Override // org.telegram.ui.Components.cu0, org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(n6.G8));
        hashSet.add(Integer.valueOf(n6.h5));
        hashSet.add(Integer.valueOf(n6.j5));
        hashSet.add(Integer.valueOf(n6.r5));
        hashSet.add(Integer.valueOf(n6.zf));
        hashSet.add(Integer.valueOf(n6.Cf));
        hashSet.add(Integer.valueOf(n6.Ff));
        hashSet.add(Integer.valueOf(n6.Jf));
        hashSet.add(Integer.valueOf(n6.Ef));
        hashSet.add(Integer.valueOf(n6.G6));
        hashSet.add(Integer.valueOf(n6.Di));
        hashSet.add(Integer.valueOf(n6.wi));
        hashSet.add(Integer.valueOf(n6.vi));
        hashSet.add(Integer.valueOf(n6.xi));
        hashSet.add(Integer.valueOf(n6.yi));
        hashSet.add(Integer.valueOf(n6.Bf));
        hashSet.add(Integer.valueOf(n6.Af));
        hashSet.add(Integer.valueOf(n6.a7));
        hashSet.add(Integer.valueOf(n6.m7));
        hashSet.add(Integer.valueOf(n6.l7));
        hashSet.add(Integer.valueOf(n6.n7));
        hashSet.add(Integer.valueOf(n6.d6));
        hashSet.add(Integer.valueOf(n6.d7));
    }

    @Override // tg.h1
    public final void b() {
        setTextType((this.E0 + 1) % 4);
    }

    @Override // tg.h1
    public final void c(int i7) {
        n nVar = this.C0;
        if (nVar instanceof q2) {
            x0((q2) nVar, i7);
            sg.j0 e10 = sg.j0.e(this.z1);
            e10.g = i7;
            e10.a.edit().putInt("text_alignment", i7).apply();
        }
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        h0 h0Var;
        q2 q2Var;
        String str;
        if (i7 != ks.F5 || (h0Var = this.J0) == null) {
            return;
        }
        for (int i11 = 0; i11 < h0Var.getChildCount(); i11++) {
            View childAt = h0Var.getChildAt(i11);
            if ((childAt instanceof q2) && (str = (q2Var = (q2) childAt).C0) != null) {
                q2Var.setTypeface(str);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ad  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        we weVar;
        int i7;
        gh0 gh0Var;
        h0 h0Var = this.J0;
        if (view == h0Var) {
            float d = this.N1.d(this.G1);
            if (d > 0.0f) {
                float L = org.telegram.messenger.g0.L(24.0f * d);
                int r12 = n6.r1(d, 1090519039);
                Paint paint = this.O1;
                paint.setShadowLayer(L, 0.0f, 0.0f, r12);
                paint.setColor(0);
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), ks.e4, 31);
                canvas.translate(h0Var.getX(), h0Var.getY());
                canvas.scale(h0Var.getScaleX(), h0Var.getScaleY(), h0Var.getWidth() / 2.0f, h0Var.getHeight() / 2.0f);
                canvas.drawRect(0.0f, 0.0f, h0Var.getWidth(), h0Var.getHeight(), paint);
                canvas.drawRect(0.0f, 0.0f, h0Var.getWidth(), h0Var.getHeight(), this.P1);
                canvas.restore();
                if ((view != this.G0 || view == this.H0 || ((view == h0Var && h0Var.getClipChildren()) || (view == (gh0Var = this.I0) && gh0Var.getClipChildren()))) && (weVar = this.r0) != null) {
                    canvas.save();
                    r10 = this.F0 ? 0 : org.telegram.messenger.g0.m;
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + r10;
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    i7 = weVar.k;
                    if (i7 != 90 || i7 == 270) {
                        measuredHeight = measuredWidth;
                        measuredWidth = measuredHeight;
                    }
                    int scaleX = (int) ((view.getScaleX() * (measuredWidth * weVar.e)) / weVar.c);
                    int scaleY = (int) ((view.getScaleY() * (measuredHeight * weVar.f)) / weVar.c);
                    float ceil = ((float) Math.ceil((getMeasuredWidth() - scaleX) / 2.0f)) + this.v0;
                    float additionalBottom = (((getAdditionalBottom() + (((getMeasuredHeight() - this.X1) - currentActionBarHeight) - org.telegram.messenger.g0.L(48.0f))) - scaleY) / 2.0f) + org.telegram.messenger.g0.L(8.0f) + r10 + this.w0;
                    canvas.clipRect(Math.max(0.0f, ceil), Math.max(0.0f, additionalBottom), Math.min(ceil + scaleX, getMeasuredWidth()), Math.min(getMeasuredHeight(), additionalBottom + scaleY));
                    r10 = 1;
                }
                boolean drawChild = super.drawChild(canvas, view, j3);
                if (r10 != 0) {
                    canvas.restore();
                }
                return drawChild;
            }
        }
        if (view != this.G0) {
        }
        canvas.save();
        if (this.F0) {
        }
        int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + r10;
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        i7 = weVar.k;
        if (i7 != 90) {
        }
        measuredHeight2 = measuredWidth2;
        measuredWidth2 = measuredHeight2;
        int scaleX2 = (int) ((view.getScaleX() * (measuredWidth2 * weVar.e)) / weVar.c);
        int scaleY2 = (int) ((view.getScaleY() * (measuredHeight2 * weVar.f)) / weVar.c);
        float ceil2 = ((float) Math.ceil((getMeasuredWidth() - scaleX2) / 2.0f)) + this.v0;
        float additionalBottom2 = (((getAdditionalBottom() + (((getMeasuredHeight() - this.X1) - currentActionBarHeight2) - org.telegram.messenger.g0.L(48.0f))) - scaleY2) / 2.0f) + org.telegram.messenger.g0.L(8.0f) + r10 + this.w0;
        canvas.clipRect(Math.max(0.0f, ceil2), Math.max(0.0f, additionalBottom2), Math.min(ceil2 + scaleX2, getMeasuredWidth()), Math.min(getMeasuredHeight(), additionalBottom2 + scaleY2));
        r10 = 1;
        boolean drawChild2 = super.drawChild(canvas, view, j3);
        if (r10 != 0) {
        }
        return drawChild2;
    }

    public final void e0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new org.telegram.ui.web.t1(16, this, view)).start();
    }

    @Override // tg.l
    public final void f(n nVar) {
        int[] l02 = l0(nVar);
        B0(new z(this, nVar, 1), this, 51, l02[0], l02[1] - org.telegram.messenger.g0.L(32.0f));
    }

    public final PointF f0() {
        xt0 paintingSize = getPaintingSize();
        float f10 = paintingSize.a / 2.0f;
        float f11 = paintingSize.b / 2.0f;
        if (this.r0 != null) {
            double radians = (float) Math.toRadians(-(r2.k + r2.d));
            float cos = (float) ((Math.cos(radians) * r2.a) - (Math.sin(radians) * r2.b));
            float c10 = (float) i5.c.c(radians, r2.b, Math.sin(radians) * r2.a);
            f10 -= cos * paintingSize.a;
            f11 -= c10 * paintingSize.b;
        }
        return new PointF(f10, f11);
    }

    public final d g0() {
        ((vp0) this).d2.h0.isFocusable();
        xt0 paintingSize = getPaintingSize();
        PointF f02 = f0();
        f02.y *= 1.5f;
        d dVar = new d(getContext(), f02, (int) ((paintingSize.a / 9.0f) * 0.5f), new sg.g1(1.0f, this.u1.c, -1));
        float f10 = paintingSize.a / 9.0f;
        t tVar = new t(this, 2);
        dVar.y0 = (int) (0.5f * f10);
        dVar.z0 = (int) (f10 * 2.0f);
        dVar.A0 = tVar;
        dVar.B0 = true;
        dVar.setStickyX(2);
        dVar.setDelegate(this);
        dVar.setMaxWidth((int) (paintingSize.a - 20.0f));
        dVar.setTypeface(sg.j0.e(this.z1).j);
        dVar.setType(3);
        hi.a0 a0Var = this.J1;
        if (a0Var != null) {
            a0Var.b(dVar);
        } else {
            aa aaVar = this.L1;
            Objects.requireNonNull(aaVar);
            int i7 = 3;
            dVar.setPositionProvider(new hi.x(aaVar, i7));
            dVar.setOnEditing(new hi.y(aaVar, i7));
            dVar.setOnSeek(new hi.y(aaVar, 4));
        }
        this.J0.addView(dVar, na.c(-2.0f, -2));
        x0(dVar, 1);
        we weVar = this.r0;
        if (weVar != null) {
            dVar.j(1.0f / weVar.c);
            dVar.f(-(weVar.k + weVar.d));
        }
        return dVar;
    }

    public int getAdditionalBottom() {
        return org.telegram.messenger.g0.L(24.0f);
    }

    public int getAdditionalTop() {
        return org.telegram.messenger.g0.L(48.0f);
    }

    public View getCancelView() {
        return this.k0;
    }

    public long getCaptionsTrimEnd() {
        return 0L;
    }

    public long getCaptionsTrimStart() {
        return 0L;
    }

    public File getCaptionsVideoFile() {
        return null;
    }

    public long getCaptionsVideoPosition() {
        return 0L;
    }

    public float getCropRotation() {
        we weVar = this.r0;
        if (weVar != null) {
            return weVar.d + weVar.k;
        }
        return 0.0f;
    }

    public View getDoneView() {
        return this.l0;
    }

    public long getLcm() {
        return this.Z0.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        x5[] x5VarArr;
        h0 h0Var = this.J0;
        int childCount = h0Var.getChildCount();
        ArrayList arrayList = null;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = h0Var.getChildAt(i7);
            if (childAt instanceof j2) {
                TLRPC.Document sticker = ((j2) childAt).getSticker();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.id = sticker.id;
                tL_inputDocument.access_hash = sticker.access_hash;
                byte[] bArr = sticker.file_reference;
                tL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                arrayList.add(tL_inputDocument);
            } else if (childAt instanceof q2) {
                CharSequence text = ((q2) childAt).getText();
                if ((text instanceof Spanned) && (x5VarArr = (x5[]) ((Spanned) text).getSpans(0, text.length(), x5.class)) != null) {
                    for (x5 x5Var : x5VarArr) {
                        if (x5Var != null) {
                            TLRPC.Document document = x5Var.document;
                            if (document == null) {
                                document = org.telegram.ui.Components.o5.e(this.z1, x5Var.getDocumentId());
                            }
                            if (document != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                                tL_inputDocument2.id = document.id;
                                tL_inputDocument2.access_hash = document.access_hash;
                                byte[] bArr2 = document.file_reference;
                                tL_inputDocument2.file_reference = bArr2;
                                if (bArr2 == null) {
                                    tL_inputDocument2.file_reference = new byte[0];
                                }
                                arrayList.add(tL_inputDocument2);
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public float getOffsetTranslationY() {
        return this.m0;
    }

    public int getPKeyboardHeight() {
        return 0;
    }

    public sg.t0 getRenderView() {
        return this.G0;
    }

    public float getSelectedEntityBottom() {
        n nVar = this.C0;
        h0 h0Var = this.J0;
        if (nVar == null) {
            return getY() + h0Var.getMeasuredHeight();
        }
        nVar.getLocationInWindow(new int[2]);
        return (h0Var.getScaleY() * this.C0.getHeight()) + r2[1];
    }

    public nz0 getThanosEffect() {
        if (!nz0.c()) {
            return null;
        }
        if (this.K0 == null) {
            nz0 nz0Var = new nz0(getContext(), new t(this, 0));
            this.K0 = nz0Var;
            addView(nz0Var);
        }
        return this.K0;
    }

    public final s1 h0(String str, boolean z10) {
        float f10;
        xt0 xt0Var;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f10 = options.outWidth / options.outHeight;
        } catch (Exception e10) {
            a8.g(e10, true);
            f10 = 1.0f;
        }
        h0 h0Var = this.J0;
        if (f10 > 1.0f) {
            float floor = (float) Math.floor(h0Var.getMeasuredWidth() * 0.5d);
            xt0Var = new xt0(floor, floor / f10);
        } else {
            float floor2 = (float) Math.floor(h0Var.getMeasuredHeight() * 0.5d);
            xt0Var = new xt0(f10 * floor2, floor2);
        }
        xt0 xt0Var2 = xt0Var;
        Pair N0 = org.telegram.messenger.g0.N0(str);
        if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
            float f11 = xt0Var2.a;
            xt0Var2.a = xt0Var2.b;
            xt0Var2.b = f11;
        }
        Context context = getContext();
        PointF f02 = f0();
        int intValue = ((Integer) N0.first).intValue();
        ((Integer) N0.second).getClass();
        s1 s1Var = new s1(context, f02, xt0Var2, str, intValue);
        s1Var.setDelegate(this);
        h0Var.addView(s1Var);
        if (z10) {
            s0(s1Var);
            u0(s1Var, true);
        }
        return s1Var;
    }

    public final boolean i(MotionEvent motionEvent) {
        if (this.C0 != null) {
            u0(null, true);
        }
        float x10 = motionEvent.getX();
        g0 g0Var = this.G0;
        float translationX = ((x10 - g0Var.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / g0Var.getScaleX();
        float y10 = ((((motionEvent.getY() - g0Var.getTranslationY()) - (getMeasuredHeight() / 2.0f)) + org.telegram.messenger.g0.L(32.0f)) - ((getAdditionalTop() - getAdditionalBottom()) / 2.0f)) / g0Var.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-g0Var.getRotation());
        double d2 = y10;
        float measuredWidth = (g0Var.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d2)));
        float measuredHeight = (g0Var.getMeasuredHeight() / 2.0f) + ((float) i5.c.c(radians, d2, Math.sin(radians) * d));
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(measuredWidth, measuredHeight);
        g0Var.e(obtain);
        obtain.recycle();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d0 i0(Object obj, TLRPC.Document document, boolean z10) {
        TLRPC.TL_maskCoords tL_maskCoords;
        float f10;
        u5 u5Var;
        double d;
        u5 u5Var2;
        PointF pointF;
        boolean C4;
        ArrayList arrayList;
        sg.k0 k0Var;
        u5 u5Var3;
        int i7;
        float f11;
        int i10 = 0;
        while (true) {
            if (i10 >= document.attributes.size()) {
                tL_maskCoords = null;
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                tL_maskCoords = documentAttribute.mask_coords;
                break;
            }
            i10++;
        }
        float f12 = 0.75f;
        we weVar = this.r0;
        if (weVar != null) {
            f10 = -(weVar.k + weVar.d);
            f12 = 0.75f / weVar.c;
        } else {
            f10 = 0.0f;
        }
        u5 u5Var4 = new u5(f0(), f12, f10);
        h0 h0Var = this.J0;
        if (tL_maskCoords == null || (arrayList = this.X0) == null || arrayList.size() == 0) {
            u5Var = u5Var4;
            d = 0.5d;
        } else {
            int i11 = tL_maskCoords.n;
            long j3 = document.id;
            if (i11 >= 0 && i11 <= 3 && !this.X0.isEmpty()) {
                int size = this.X0.size();
                int nextInt = Utilities.b.nextInt(size);
                int i12 = size;
                loop1: while (i12 > 0) {
                    sg.k0 k0Var2 = (sg.k0) this.X0.get(nextInt);
                    if (k0Var2.a(i11) != null) {
                        d = 0.5d;
                        float f13 = k0Var2.a * 1.1f;
                        int i13 = 0;
                        while (i13 < h0Var.getChildCount()) {
                            View childAt = h0Var.getChildAt(i13);
                            sg.k0 k0Var3 = k0Var2;
                            if (childAt instanceof j2) {
                                j2 j2Var = (j2) childAt;
                                if (j2Var.getAnchor() == i11) {
                                    PointF position = j2Var.getPosition();
                                    u5Var3 = u5Var4;
                                    i7 = size;
                                    f11 = f13;
                                    float hypot = (float) Math.hypot(position.x - r4.x, position.y - r4.y);
                                    if ((j3 == j2Var.getSticker().id || this.X0.size() > 1) && hypot < f11) {
                                        break;
                                    }
                                    i13++;
                                    k0Var2 = k0Var3;
                                    u5Var4 = u5Var3;
                                    size = i7;
                                    f13 = f11;
                                }
                            }
                            u5Var3 = u5Var4;
                            i7 = size;
                            f11 = f13;
                            i13++;
                            k0Var2 = k0Var3;
                            u5Var4 = u5Var3;
                            size = i7;
                            f13 = f11;
                        }
                        u5Var = u5Var4;
                        k0Var = k0Var2;
                        break loop1;
                    }
                    u5Var3 = u5Var4;
                    i7 = size;
                    nextInt = (nextInt + 1) % i7;
                    i12--;
                    u5Var4 = u5Var3;
                    size = i7;
                }
            }
            u5Var = u5Var4;
            d = 0.5d;
            k0Var = null;
            if (k0Var != null) {
                PointF a10 = k0Var.a(i11);
                float f14 = i11 == 1 ? k0Var.e : k0Var.a;
                float f15 = k0Var.b;
                float floor = (float) ((f14 / ((float) Math.floor(getPaintingSize().a * d))) * tL_maskCoords.zoom);
                double radians = (float) Math.toRadians(f15);
                double d2 = 1.5707963267948966d - radians;
                double d10 = f14;
                float sin = (float) (Math.sin(d2) * d10 * tL_maskCoords.x);
                float cos = (float) (Math.cos(d2) * d10 * tL_maskCoords.x);
                double d11 = radians + 1.5707963267948966d;
                u5Var2 = new u5(new PointF(a10.x + sin + ((float) (Math.cos(d11) * d10 * tL_maskCoords.y)), a10.y + cos + ((float) (Math.sin(d11) * d10 * tL_maskCoords.y))), floor, f15);
                Context context = getContext();
                float floor2 = (float) Math.floor(getPaintingSize().a * d);
                xt0 xt0Var = new xt0(floor2, floor2);
                pointF = u5Var2.a;
                d0 d0Var = new d0(this, context, pointF, u5Var2.c, u5Var2.b, xt0Var, document, obj);
                C4 = fj.C4(document);
                ImageReceiver imageReceiver = d0Var.z0;
                if (C4) {
                    imageReceiver.p1 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
                }
                imageReceiver.F0(12);
                if (pointF.x == h0Var.getMeasuredWidth() / 2.0f) {
                    d0Var.setStickyX(2);
                }
                if (pointF.y == h0Var.getMeasuredHeight() / 2.0f) {
                    d0Var.setStickyY(2);
                }
                d0Var.setDelegate(this);
                h0Var.addView(d0Var);
                if (z10) {
                    s0(d0Var);
                    u0(d0Var, true);
                }
                return d0Var;
            }
        }
        u5Var2 = u5Var;
        Context context2 = getContext();
        float floor22 = (float) Math.floor(getPaintingSize().a * d);
        xt0 xt0Var2 = new xt0(floor22, floor22);
        pointF = u5Var2.a;
        d0 d0Var2 = new d0(this, context2, pointF, u5Var2.c, u5Var2.b, xt0Var2, document, obj);
        C4 = fj.C4(document);
        ImageReceiver imageReceiver2 = d0Var2.z0;
        if (C4) {
        }
        imageReceiver2.F0(12);
        if (pointF.x == h0Var.getMeasuredWidth() / 2.0f) {
        }
        if (pointF.y == h0Var.getMeasuredHeight() / 2.0f) {
        }
        d0Var2.setDelegate(this);
        h0Var.addView(d0Var2);
        if (z10) {
        }
        return d0Var2;
    }

    public final q2 j0(boolean z10) {
        ((vp0) this).d2.h0.isFocusable();
        xt0 paintingSize = getPaintingSize();
        PointF E0 = E0(null);
        q2 q2Var = new q2(getContext(), E0, (int) (paintingSize.a / 9.0f), "", this.u1, this.E0);
        float f10 = paintingSize.a / 9.0f;
        t tVar = new t(this, 3);
        q2Var.y0 = (int) (0.5f * f10);
        q2Var.z0 = (int) (f10 * 2.0f);
        q2Var.A0 = tVar;
        float f11 = E0.x;
        h0 h0Var = this.J0;
        if (f11 == h0Var.getMeasuredWidth() / 2.0f) {
            q2Var.setStickyX(2);
        }
        if (E0.y == h0Var.getMeasuredHeight() / 2.0f) {
            q2Var.setStickyY(2);
        }
        q2Var.setDelegate(this);
        q2Var.setMaxWidth((int) (paintingSize.a - 20.0f));
        int i7 = this.z1;
        q2Var.setTypeface(sg.j0.e(i7).j);
        q2Var.setType(sg.j0.e(i7).h);
        h0Var.addView(q2Var, na.c(-2.0f, -2));
        we weVar = this.r0;
        if (weVar != null) {
            q2Var.j(1.0f / weVar.c);
            q2Var.f(-(weVar.k + weVar.d));
        }
        if (z10) {
            s0(q2Var);
            q2Var.q();
            u0(q2Var, false);
            q2Var.getFocusedView().requestFocus();
            org.telegram.messenger.g0.I3(q2Var.getFocusedView());
            this.D0 = true;
            int i10 = sg.j0.e(i7).g;
            j1 j1Var = this.e1;
            j1Var.d(i10, true);
            j1Var.setOutlineType(sg.j0.e(i7).h);
        }
        return q2Var;
    }

    public final void k0() {
        n nVar = this.C0;
        if (!(nVar instanceof q2) || this.D0) {
            return;
        }
        q2 q2Var = (q2) nVar;
        if (q2Var instanceof d) {
            d dVar = (d) q2Var;
            dVar.z();
            if (dVar.E0 == null) {
                return;
            }
        }
        this.D0 = true;
        q2Var.q();
        View focusedView = q2Var.getFocusedView();
        focusedView.requestFocus();
        org.telegram.messenger.g0.I3(focusedView);
    }

    public final int[] l0(n nVar) {
        float[] fArr = this.R1;
        fArr[0] = nVar.getWidth() / 2.0f;
        fArr[1] = nVar.getHeight() / 2.0f;
        nVar.getMatrix().mapPoints(fArr);
        fArr[0] = fArr[0] + nVar.getLeft();
        fArr[1] = fArr[1] + nVar.getTop();
        Object parent = nVar.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            fArr[0] = fArr[0] - view.getScrollX();
            fArr[1] = fArr[1] - view.getScrollY();
            view.getMatrix().mapPoints(fArr);
            fArr[0] = fArr[0] + view.getLeft();
            fArr[1] = fArr[1] + view.getTop();
            parent = view.getParent();
        }
        int round = Math.round(fArr[0]);
        int[] iArr = this.S1;
        iArr[0] = round;
        int round2 = Math.round(fArr[1]);
        iArr[1] = round2;
        float f10 = iArr[0];
        Point point = org.telegram.messenger.g0.q;
        double d = f10 - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.J0.getRotation());
        double d2 = round2 - (point.y / 2.0f);
        iArr[0] = (point.x / 2) + ((int) ((Math.cos(radians) * d) - (Math.sin(radians) * d2)));
        iArr[1] = (point.y / 2) + ((int) i5.c.c(radians, d2, Math.sin(radians) * d));
        return iArr;
    }

    public final int m0(boolean z10) {
        return this.X1;
    }

    @Override // tg.l
    public final int[] n(n nVar) {
        return l0(nVar);
    }

    public final void n0(boolean z10) {
        int i7 = 0;
        if (this.U1) {
            A0(0);
        }
        if (z10) {
            qy qyVar = this.T1;
            if (qyVar == null || qyVar.getVisibility() != 0) {
                o0();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.T1.getMeasuredHeight());
            ofFloat.addUpdateListener(new u(this, i7));
            this.W1 = true;
            ofFloat.addListener(new e0(this, 1));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.w);
            ofFloat.start();
        }
    }

    public final void o0() {
        qy qyVar;
        x3 x3Var;
        if (this.X1 > 0 && (x3Var = ((vp0) this).d2.L1) != null) {
            x3Var.a();
        }
        if (!this.U1 && (qyVar = this.T1) != null && qyVar.getVisibility() != 8) {
            this.T1.setVisibility(8);
        }
        this.X1 = 0;
    }

    @Override // org.telegram.ui.Components.cu0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ks.e().c(this, ks.F5);
    }

    @Override // org.telegram.ui.Components.cu0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        hi.a0 a0Var = this.J1;
        if (a0Var != null) {
            a0Var.f(null);
            o3 o3Var = a0Var.c;
            if (o3Var != null) {
                o3Var.f = null;
                fc fcVar = (fc) o3Var.h;
                if (fcVar != null) {
                    fcVar.b();
                    o3Var.h = null;
                }
                a0Var.c = null;
            }
            a0Var.a.w(false);
        }
        super.onDetachedFromWindow();
        ks.e().n(this, ks.F5);
    }

    @Override // org.telegram.ui.Components.du0, org.telegram.ui.Components.cu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        int i13 = i11 - i7;
        int i14 = i12 - i10;
        if (this.T1 != null) {
            int measuredHeight = org.telegram.messenger.g0.Q1() ? i14 - this.T1.getMeasuredHeight() : (Q() + i14) - this.T1.getMeasuredHeight();
            qy qyVar = this.T1;
            qyVar.layout(0, measuredHeight, qyVar.getMeasuredWidth(), this.T1.getMeasuredHeight() + measuredHeight);
        }
        int i15 = this.F0 ? 0 : org.telegram.messenger.g0.m;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i15;
        g0 g0Var = this.G0;
        int ceil = (int) Math.ceil((i13 - g0Var.getMeasuredWidth()) / 2.0f);
        int additionalTop = ((getAdditionalTop() - getAdditionalBottom()) / 2) + f3.C(8.0f, (((i14 - currentActionBarHeight) - org.telegram.messenger.g0.L(48.0f)) - g0Var.getMeasuredHeight()) / 2, i15);
        g0Var.layout(ceil, additionalTop, g0Var.getMeasuredWidth() + ceil, g0Var.getMeasuredHeight() + additionalTop);
        tv tvVar = this.H0;
        tvVar.layout(ceil, additionalTop, tvVar.getMeasuredWidth() + ceil, tvVar.getMeasuredHeight() + additionalTop);
        int measuredWidth = g0Var.getMeasuredWidth();
        h0 h0Var = this.J0;
        int measuredWidth2 = ((measuredWidth - h0Var.getMeasuredWidth()) / 2) + ceil;
        int measuredHeight2 = ((g0Var.getMeasuredHeight() - h0Var.getMeasuredHeight()) / 2) + additionalTop;
        h0Var.layout(measuredWidth2, measuredHeight2, h0Var.getMeasuredWidth() + measuredWidth2, h0Var.getMeasuredHeight() + measuredHeight2);
        nz0 nz0Var = this.K0;
        if (nz0Var != null) {
            nz0Var.layout(measuredWidth2, measuredHeight2, h0Var.getMeasuredWidth() + measuredWidth2, h0Var.getMeasuredHeight() + measuredHeight2);
        }
        gh0 gh0Var = this.I0;
        gh0Var.layout(ceil, additionalTop, gh0Var.getMeasuredWidth() + ceil, gh0Var.getMeasuredHeight() + additionalTop);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        float currentActionBarHeight;
        float f10;
        hi.u uVar;
        this.z0 = true;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        int currentActionBarHeight2 = (((org.telegram.messenger.g0.q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getAdditionalTop()) - getAdditionalBottom()) - org.telegram.messenger.g0.L(48.0f);
        Bitmap bitmap = this.n0;
        if (bitmap != null) {
            f10 = bitmap.getWidth();
            currentActionBarHeight = bitmap.getHeight();
        } else {
            currentActionBarHeight = (size2 - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.L(48.0f);
            f10 = size;
        }
        float f11 = size;
        float floor = (float) Math.floor((f11 * currentActionBarHeight) / f10);
        float f12 = currentActionBarHeight2;
        if (floor > f12) {
            f11 = (float) Math.floor((f10 * f12) / currentActionBarHeight);
            floor = f12;
        }
        int i11 = (int) f11;
        int i12 = (int) floor;
        this.G0.measure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30));
        this.H0.measure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30));
        float f13 = f11 / this.B0.a;
        this.A0 = f13;
        h0 h0Var = this.J0;
        h0Var.setScaleX(f13);
        h0Var.setScaleY(this.A0);
        h0Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.B0.a, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) this.B0.b, TLObject.FLAG_30));
        nz0 nz0Var = this.K0;
        if (nz0Var != null) {
            nz0Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.B0.a, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) this.B0.b, TLObject.FLAG_30));
            this.K0.setScaleX(this.A0);
            this.K0.setScaleY(this.A0);
        }
        G0();
        this.I0.measure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30));
        measureChild(this.M0, i7, i10);
        measureChild(this.V0, i7, i10);
        hi.a0 a0Var = this.J1;
        if (a0Var != null && (uVar = a0Var.e) != null) {
            uVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        measureChild(this.O0, i7, i10);
        measureChild(this.N0, i7, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(getPKeyboardHeight(), this.X1), TLObject.FLAG_30));
        FrameLayout frameLayout = this.L0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.m, frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i7, i10);
        this.z0 = false;
        if (org.telegram.messenger.g0.L(20.0f) >= 0 && !this.U1 && !this.W1) {
            this.z0 = true;
            o0();
            this.z0 = false;
        }
        if (org.telegram.messenger.g0.L(20.0f) < 0) {
            o0();
        }
        qy qyVar = this.T1;
        if (qyVar != null) {
            measureChild(qyVar, i7, i10);
        }
    }

    @Override // tg.l
    public final /* synthetic */ boolean p() {
        return true;
    }

    public final void p0(boolean z10) {
        if (this.Q0 == 0) {
            this.V0.setLayerType(z10 ? 2 : 0, null);
            this.M0.setLayerType(z10 ? 2 : 0, null);
            this.L0.setLayerType(z10 ? 2 : 0, null);
        }
    }

    @Override // tg.l
    public final boolean q() {
        return !this.D0;
    }

    public final boolean q0() {
        if (this.v1) {
            z0(false);
            return true;
        }
        if (this.U1) {
            n0(true);
            return true;
        }
        if (!this.D0) {
            return false;
        }
        u0(null, true);
        return true;
    }

    public abstract void r0(boolean z10);

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.z0) {
            return;
        }
        super.requestLayout();
    }

    public final void s0(n nVar) {
        if (nVar == null) {
            return;
        }
        this.p0.b(nVar.getUUID(), new z(this, nVar, 0));
    }

    public void setBlurredBackgroundDrawableForTools(fh.g gVar) {
        gVar.q(org.telegram.messenger.g0.L(4.0f));
        this.Q1 = gVar;
    }

    public void setDrawShadow(boolean z10) {
        this.G1 = z10;
        invalidate();
        setClipChildren(!z10);
    }

    public void setOffsetTranslationX(float f10) {
        if (this.Q0 == 0) {
            this.V0.setTranslationX(f10);
        }
    }

    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.E1 = runnable;
    }

    @Override // tg.h1
    public final void t() {
        x3 x3Var;
        if (!this.V1 && !this.U1) {
            j0(true);
            return;
        }
        boolean z10 = this.U1;
        if (z10 && (x3Var = ((vp0) this).d2.L1) != null) {
            x3Var.e = true;
        }
        A0(!z10 ? 1 : 0);
        if (z10) {
            n nVar = this.C0;
            if (nVar instanceof q2) {
                org.telegram.messenger.g0.I3(((q2) nVar).getEditText());
            }
        }
    }

    public final void t0(n nVar) {
        n nVar2 = this.C0;
        if (nVar == nVar2 && nVar2 != null) {
            nVar2.l(nVar2.o0, false);
            this.C0 = null;
            if (nVar instanceof q2) {
                ValueAnimator valueAnimator = this.T0;
                if (valueAnimator != null && this.R0 != 0) {
                    valueAnimator.cancel();
                }
                F0(0);
            }
        }
        this.J0.removeView(nVar);
        if (nVar != null) {
            UUID uuid = nVar.getUUID();
            sg.j1 j1Var = this.p0;
            j1Var.b.remove(uuid);
            j1Var.c.remove(uuid);
            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(j1Var, 14));
        }
        r1 r1Var = this.V0;
        org.telegram.ui.ActionBar.i5 i5Var = this.W0;
        r1Var.setValueOverride(i5Var);
        r1Var.setShowPreview(true);
        float f10 = i5Var.get();
        sg.g1 g1Var = this.u1;
        g1Var.c = f10;
        v0(g1Var, null);
    }

    @Override // tg.l
    public final boolean u(n nVar) {
        return u0(nVar, true);
    }

    public final boolean u0(n nVar, boolean z10) {
        l0 l0Var;
        boolean z11;
        int i7;
        boolean z12 = nVar instanceof q2;
        int i10 = 2;
        if (z12 && (((i7 = this.R0) == -1 && this.Q0 != 2) || (i7 != -1 && i7 != 2))) {
            ValueAnimator valueAnimator = this.T0;
            if (valueAnimator != null && i7 != 2) {
                valueAnimator.cancel();
            }
            if (this.v1) {
                z0(false);
            }
            F0(2);
        }
        if (z12 && z10) {
            q2 q2Var = (q2) nVar;
            int gravity = q2Var.getEditText().getGravity();
            if (gravity == 17) {
                i10 = 1;
            } else if (gravity != 21) {
                i10 = 0;
            }
            j1 j1Var = this.e1;
            j1Var.setAlignment(i10);
            j1Var.setTypeface(q2Var.getTypeface().a);
            j1Var.e(q2Var.getType(), true);
            this.N0.invalidate();
        }
        n nVar2 = this.C0;
        if (nVar2 == null) {
            l0Var = this;
            z11 = false;
        } else {
            if (nVar2 == nVar) {
                boolean z13 = this.D0;
                if (!z13 && (nVar2 instanceof d) && !nVar.f0) {
                    k0();
                    return true;
                }
                if (!z13) {
                    int[] l02 = l0(nVar2);
                    B0(new z(this, nVar2, 1), this, 51, l02[0], l02[1] - org.telegram.messenger.g0.L(32.0f));
                    return true;
                }
                if (nVar2 instanceof q2) {
                    org.telegram.messenger.g0.I3(((q2) nVar2).getFocusedView());
                    n0(false);
                }
                return true;
            }
            l0Var = this;
            nVar2.l(nVar2.o0, false);
            n nVar3 = l0Var.C0;
            if (nVar3 instanceof q2) {
                ((q2) nVar3).r();
                if (!z12) {
                    l0Var.D0 = false;
                    org.telegram.messenger.g0.v1(((q2) l0Var.C0).getFocusedView());
                    n0(false);
                }
            }
            z11 = true;
        }
        n nVar4 = l0Var.C0;
        l0Var.C0 = nVar;
        if ((nVar4 instanceof q2) && TextUtils.isEmpty(((q2) nVar4).getText()) && !(nVar4 instanceof d)) {
            t0(nVar4);
        }
        n nVar5 = l0Var.C0;
        org.telegram.ui.ActionBar.i5 i5Var = l0Var.W0;
        sg.g1 g1Var = l0Var.u1;
        r1 r1Var = l0Var.V0;
        if (nVar5 == null) {
            ValueAnimator valueAnimator2 = l0Var.T0;
            if (valueAnimator2 != null && l0Var.R0 != 0) {
                valueAnimator2.cancel();
            }
            if (l0Var.v1) {
                z0(false);
            }
            F0(0);
            r1Var.setValueOverride(i5Var);
            r1Var.setShowPreview(true);
            g1Var.c = i5Var.get();
            v0(g1Var, null);
            return z11;
        }
        gh0 gh0Var = l0Var.I0;
        nVar5.o0 = gh0Var;
        nVar5.l(gh0Var, true);
        l0Var.J0.bringChildToFront(l0Var.C0);
        n nVar6 = l0Var.C0;
        if (!(nVar6 instanceof q2)) {
            r1Var.setValueOverride(i5Var);
            r1Var.setShowPreview(true);
            g1Var.c = i5Var.get();
            v0(g1Var, null);
            return true;
        }
        q2 q2Var2 = (q2) nVar6;
        q2Var2.B0 = false;
        q2Var2.getSwatch().c = g1Var.c;
        v0(q2Var2.getSwatch(), null);
        float f10 = (int) (l0Var.B0.a / 9.0f);
        setTextWeightRange(q2Var2);
        r1Var.setValueOverride(new g5(q2Var2, f10, 1));
        r1Var.setShowPreview(false);
        return true;
    }

    @Override // org.telegram.ui.Components.cu0, org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        this.y1.setColor(-15132391);
    }

    @Override // tg.l
    public final void v(float f10, float f11, float[] fArr) {
        Point point = org.telegram.messenger.g0.q;
        double d = f10 - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.J0.getRotation());
        double d2 = f11 - (point.y / 2.0f);
        fArr[0] = (point.x / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d2)));
        fArr[1] = (point.y / 2.0f) + ((float) i5.c.c(radians, d2, Math.sin(radians) * d));
    }

    public final void v0(sg.g1 g1Var, Integer num) {
        sg.g1 g1Var2 = this.u1;
        if (g1Var2 != g1Var) {
            g1Var2.a = g1Var.a;
            g1Var2.b = g1Var.b;
            g1Var2.c = g1Var.c;
            int i7 = this.z1;
            sg.j0.e(i7).h(g1Var.a, true);
            sg.j0.e(i7).j(g1Var.c);
        }
        int i10 = g1Var.a;
        g0 g0Var = this.G0;
        g0Var.setColor(i10);
        g0Var.setBrushSize(g1Var.c);
        int i11 = g1Var2.a;
        if (num == null || num.intValue() == i11) {
            j0 j0Var = this.M0;
            if (j0Var != null) {
                j0Var.invalidate();
            }
        } else {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new j4(this, num, i11, 3));
            duration.start();
        }
        n nVar = this.C0;
        if (!(nVar instanceof q2) || this.I1) {
            return;
        }
        ((q2) nVar).setSwatch(new sg.g1(g1Var.b, g1Var.c, g1Var.a));
    }

    @Override // tg.l1
    public final void w(sg.h hVar) {
        boolean z10 = hVar instanceof sg.b;
        r1 r1Var = this.V0;
        if (z10 || (hVar instanceof sg.d)) {
            r1Var.b(0.4f, 1.75f);
        } else {
            r1Var.b(0.05f, 1.0f);
        }
        r1Var.setDrawCenter(!(hVar instanceof sg.g));
        g0 g0Var = this.G0;
        if (g0Var.getCurrentBrush() instanceof sg.g) {
            this.U0 = true;
        }
        g0Var.setBrush(hVar);
        sg.g1 g1Var = this.u1;
        int i7 = g1Var.a;
        g1Var.a = sg.j0.e(this.z1).c();
        g1Var.c = this.W0.get();
        v0(g1Var, Integer.valueOf(i7));
        this.H0.invalidate();
    }

    public final void w0(float f10) {
        this.m0 = f10;
        this.L0.setTranslationY(-f10);
        this.M0.setTranslationY(f10);
    }

    @Override // tg.l1
    public final sg.j0 x() {
        return sg.j0.e(this.z1);
    }

    public final void y0(float f10, float f11, float f12, float f13, float f14) {
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        this.s0 = f10;
        this.x0 = f13;
        this.y0 = f14;
        this.t0 = f11;
        this.u0 = f12;
        this.v0 = f11;
        float f20 = f12 + 0.0f;
        this.w0 = f20;
        int i7 = 0;
        while (i7 < 4) {
            View view = i7 == 0 ? this.J0 : i7 == 1 ? this.I0 : i7 == 2 ? this.G0 : this.H0;
            we weVar = this.r0;
            if (weVar != null) {
                float f21 = weVar.c * 1.0f;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                if (measuredWidth == 0 || measuredHeight == 0) {
                    return;
                }
                int i10 = weVar.k;
                if (i10 == 90 || i10 == 270) {
                    measuredHeight = measuredWidth;
                    measuredWidth = measuredHeight;
                }
                float max = Math.max(f13 / ((int) (weVar.e * r12)), f14 / ((int) (weVar.f * r13)));
                f16 = f21 * max;
                float D = com.google.android.gms.internal.vision.e2.D(weVar.a, measuredWidth, f10, max);
                float f22 = weVar.c;
                f17 = (D * f22) + f11;
                f15 = 1.0f;
                f18 = (weVar.b * measuredHeight * f10 * max * f22) + f20;
                f19 = weVar.d + i10;
            } else {
                f15 = 1.0f;
                f16 = i7 == 0 ? this.A0 * 1.0f : 1.0f;
                f17 = f11;
                f18 = f20;
                f19 = 0.0f;
            }
            float f23 = ((-this.X1) / 2.0f) + f18;
            float f24 = f10 * f16;
            if (Float.isNaN(f24)) {
                f24 = f15;
            }
            view.setScaleX(f24);
            view.setScaleY(f24);
            view.setTranslationX(f17);
            view.setTranslationY(f23);
            view.setRotation(f19);
            view.invalidate();
            i7++;
        }
        G0();
        invalidate();
    }

    public final void z0(final boolean z10) {
        if (this.v1 != z10) {
            this.v1 = z10;
            r1.g gVar = this.w1;
            if (gVar != null) {
                gVar.d();
            }
            r1.g gVar2 = new r1.g(new r1.f(z10 ? 0.0f : 1000.0f));
            this.w1 = gVar2;
            r1.h hVar = new r1.h();
            hVar.i = z10 ? 1000.0f : 0.0f;
            hVar.b(1250.0f);
            hVar.a(1.0f);
            gVar2.m = hVar;
            int i7 = 1;
            final boolean[] zArr = {this.V1 || this.U1};
            final float translationY = this.M0.getTranslationY();
            final ViewGroup barView = getBarView();
            this.w1.b(new r1.d() { // from class: tg.y
                @Override // r1.d
                public final void a(r1.g gVar3, float f10, float f11) {
                    l0 l0Var = l0.this;
                    j0 j0Var = l0Var.M0;
                    float f12 = f10 / 1000.0f;
                    l0Var.x1 = f12;
                    float f13 = ((1.0f - f12) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f13);
                    view.setScaleY(f13);
                    view.setTranslationY((Math.min(l0Var.x1, 0.25f) * org.telegram.messenger.g0.L(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(l0Var.x1, 0.25f) / 0.25f));
                    i0 i0Var = l0Var.q1;
                    float f14 = l0Var.x1;
                    boolean z11 = z10;
                    i0Var.B1(z11, f14);
                    l0Var.l0.setProgress(l0Var.x1);
                    l0Var.k0.setProgress(l0Var.x1);
                    l0Var.P0.setTranslationY(org.telegram.messenger.g0.L(32.0f) * l0Var.x1);
                    if (zArr[0]) {
                        float f15 = l0Var.x1;
                        if (!z11) {
                            f15 = 1.0f - f15;
                        }
                        j0Var.setTranslationY(translationY - ((org.telegram.messenger.g0.L(40.0f) * f15) * (z11 ? 1 : -1)));
                    }
                    j0Var.invalidate();
                    if (view == l0Var.e1) {
                        l0Var.N0.invalidate();
                    }
                }
            });
            this.w1.a(new x(this, z10, i7));
            this.w1.h();
            if (z10) {
                i0 i0Var = this.q1;
                i0Var.setVisibility(0);
                i0Var.setSelectedColorIndex(sg.j0.e(this.z1).d());
            }
        }
    }

    @Override // tg.l
    public final /* synthetic */ void B(boolean z10) {
    }

    @Override // tg.l
    public final /* synthetic */ void d(boolean z10) {
    }

    @Override // tg.l
    public final /* synthetic */ void e(boolean z10) {
    }

    @Override // tg.l
    public final /* synthetic */ void j(boolean z10) {
    }

    @Override // tg.l
    public final /* synthetic */ void C() {
    }

    @Override // tg.l
    public final /* synthetic */ void g() {
    }

    public FrameLayout getCaptionsBulletinContainer() {
        return this;
    }

    public View getView() {
        return this;
    }

    @Override // tg.l
    public final /* synthetic */ void h() {
    }

    @Override // tg.l
    public final /* synthetic */ void y() {
    }
}
