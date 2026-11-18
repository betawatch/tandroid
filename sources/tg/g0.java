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
import bi.i8;
import c8.ma;
import fi.q7;
import fi.z2;
import hi.a4;
import hi.g4;
import hi.j4;
import hi.k5;
import hi.l4;
import hi.p3;
import hi.u4;
import hi.x4;
import hi.y4;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.b20;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bz;
import org.telegram.messenger.c20;
import org.telegram.messenger.f3;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.g6;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.j6;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
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
import org.telegram.ui.Cells.b5;
import org.telegram.ui.Components.bu0;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mz0;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.of;
import org.telegram.ui.Components.qt;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.vt0;
import org.telegram.ui.Components.w01;
import org.telegram.ui.Components.wg;
import org.telegram.ui.Components.x5;
import org.telegram.ui.Components.yg;
import org.telegram.ui.Components.zt0;
import org.telegram.ui.hh0;
import org.telegram.ui.hn0;
import org.telegram.ui.jw0;
import org.telegram.ui.md0;
import org.telegram.ui.uv;
import org.telegram.ui.vp0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public abstract class g0 extends bu0 implements g1, h, c1, zt0, fs {
    public float A0;
    public final u A1;
    public vt0 B0;
    public org.telegram.ui.ActionBar.h1 B1;
    public j C0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout C1;
    public boolean D0;
    public Rect D1;
    public int E0;
    public Runnable E1;
    public final boolean F0;
    public final sg.k0 F1;
    public final b0 G0;
    public boolean G1;
    public final uv H0;
    public float H1;
    public final hh0 I0;
    public boolean I1;
    public final c0 J0;
    public final c6 J1;
    public mz0 K0;
    public final Paint K1;
    public final FrameLayout L0;
    public final Paint L1;
    public final e0 M0;
    public fh.g M1;
    public final w01 N0;
    public final float[] N1;
    public final FrameLayout O0;
    public final int[] O1;
    public x4 P0;
    public ry P1;
    public int Q0;
    public boolean Q1;
    public int R0;
    public boolean R1;
    public float S0;
    public boolean S1;
    public ValueAnimator T0;
    public int T1;
    public boolean U0;
    public int U1;
    public final m1 V0;
    public int V1;
    public final of W0;
    public int W1;
    public ArrayList X0;
    public boolean X1;
    public final int Y0;
    public BigInteger Z0;
    public TextView a1;
    public TextView b1;
    public TextView c1;
    public final h1 d1;
    public final e1 e1;
    public final j1 f1;
    public final ImageView g1;
    public final LinearLayout h1;
    public final TextView i1;
    public final TextView j1;
    public final v0 k0;
    public final TextView k1;
    public final z0 l0;
    public final Paint l1;
    public float m0;
    public final Paint m1;
    public final Bitmap n0;
    public float n1;
    public final Bitmap o0;
    public boolean o1;
    public final sg.k1 p0;
    public r1.g p1;
    public final r5 q0;
    public final d0 q1;
    public final we r0;
    public final Paint r1;
    public float s0;
    public final Paint s1;
    public float t0;
    public final Paint t1;
    public float u0;
    public final sg.h1 u1;
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
    /* JADX WARN: Type inference failed for: r13v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v22, types: [tg.m2] */
    /* JADX WARN: Type inference failed for: r1v25, types: [android.view.View, tg.f2, tg.y] */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r27v0, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout, org.telegram.ui.Components.au0, org.telegram.ui.Components.zt0, tg.c1, tg.g0, tg.g1] */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v43, types: [int] */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r5v9, types: [tg.u] */
    public g0(Context context, Activity activity, int i7, Bitmap bitmap, Bitmap bitmap2, int i10, ArrayList arrayList, we weVar, hn0 hn0Var, final i6 i6Var) {
        super(context, activity);
        g6[] g6VarArr;
        n1 n1Var;
        ArrayList arrayList2 = arrayList;
        boolean z10 = false;
        this.Q0 = 0;
        this.R0 = -1;
        final vp0 vp0Var = (vp0) this;
        this.W0 = new of(vp0Var, 19);
        this.l1 = new Paint(1);
        this.m1 = new Paint(1);
        this.r1 = new Paint(1);
        this.s1 = new Paint(1);
        this.t1 = new Paint(1);
        sg.h1 h1Var = new sg.h1(1.0f, 0.016773745f, -1);
        this.u1 = h1Var;
        this.y1 = new Paint(1);
        this.I1 = false;
        this.J1 = new c6((View) this, 350L, lr.h);
        this.K1 = new Paint(1);
        Paint paint = new Paint(1);
        this.L1 = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        new Matrix();
        this.N1 = new float[2];
        this.O1 = new int[2];
        int i11 = 3;
        new s4.s0(vp0Var, i11);
        setDelegate(this);
        this.z1 = i7;
        this.A1 = new i6() { // from class: tg.u
            @Override // org.telegram.ui.ActionBar.i6
            public final boolean d() {
                return n6.I.q();
            }

            @Override // org.telegram.ui.ActionBar.i6
            public final void e(float f10, float f11, int i12, int i13) {
                n6.r(f10, f11, i12, i13);
            }

            @Override // org.telegram.ui.ActionBar.i6
            public final ColorFilter f() {
                return n6.v3;
            }

            @Override // org.telegram.ui.ActionBar.i6
            public final Paint g(String str) {
                return n6.V0(str);
            }

            @Override // org.telegram.ui.ActionBar.i6
            public final /* synthetic */ Drawable getDrawable(String str) {
                return null;
            }

            @Override // org.telegram.ui.ActionBar.i6
            public final boolean h() {
                return bz.H0;
            }

            @Override // org.telegram.ui.ActionBar.i6
            public final int i(int i12) {
                return k(i12);
            }

            @Override // org.telegram.ui.ActionBar.i6
            public final /* synthetic */ boolean j() {
                return false;
            }

            @Override // org.telegram.ui.ActionBar.i6
            public final int k(int i12) {
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
                return i6Var2 != null ? i6Var2.k(i12) : n6.v0(i12);
            }

            @Override // org.telegram.ui.ActionBar.i6
            public final int m(int i12) {
                return k(i12);
            }

            @Override // org.telegram.ui.ActionBar.i6
            public final /* synthetic */ void l(int i12, int i13) {
            }
        };
        this.r0 = weVar;
        this.F0 = context instanceof BubbleActivity;
        sg.k0 e10 = sg.k0.e(i7);
        this.F1 = e10;
        e10.i(0, true);
        h1Var.a = e10.c();
        h1Var.c = e10.i;
        r5 r5Var = new r5("Paint", true);
        this.q0 = r5Var;
        this.n0 = bitmap;
        this.o0 = bitmap2;
        this.Y0 = i10;
        sg.k1 k1Var = new sg.k1();
        this.p0 = k1Var;
        k1Var.a = new org.telegram.ui.ActionBar.p(vp0Var, 26);
        byte b10 = 2;
        b0 b0Var = new b0(vp0Var, context, new sg.i0(getPaintingSize(), bitmap2, i10, null), bitmap, bitmap2);
        this.G0 = b0Var;
        b0Var.setDelegate(new sg.h0(vp0Var, hn0Var, z10, i11));
        b0Var.setUndoStore(k1Var);
        b0Var.setQueue(r5Var);
        b0Var.setVisibility(4);
        addView(b0Var, ma.e(-1, -1, 51));
        uv uvVar = new uv(13, context, vp0Var);
        this.H0 = uvVar;
        uvVar.setVisibility(4);
        addView(uvVar, ma.e(-1, -1, 51));
        c0 c0Var = new c0(vp0Var, context, new b5(vp0Var));
        this.J0 = c0Var;
        addView(c0Var);
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i12 = 0;
            while (i12 < size) {
                c20 c20Var = (c20) arrayList2.get(i12);
                byte b11 = c20Var.a;
                if (b11 == 0) {
                    ?? g02 = g0(c20Var.C, c20Var.B, z10);
                    if ((c20Var.b & 2) != 0) {
                        g02.r(z10);
                    }
                    ViewGroup.LayoutParams layoutParams = g02.getLayoutParams();
                    layoutParams.width = c20Var.q;
                    layoutParams.height = c20Var.r;
                    n1Var = g02;
                } else if (b11 == 1) {
                    ?? h02 = h0(z10);
                    h02.setType(c20Var.b);
                    h02.setTypeface(c20Var.n);
                    h02.setBaseFontSize(c20Var.m);
                    SpannableString spannableString = new SpannableString(c20Var.j);
                    ?? r13 = c20Var.k;
                    int size2 = r13.size();
                    ?? r42 = z10;
                    while (r42 < size2) {
                        Object obj = r13.get(r42);
                        int i13 = r42 + 1;
                        b20 b20Var = (b20) obj;
                        x5 x5Var = new x5(b20Var.document_id, h02.getFontMetricsInt());
                        int i14 = b20Var.offset;
                        spannableString.setSpan(x5Var, i14, b20Var.length + i14, 33);
                        size2 = size2;
                        r42 = i13;
                    }
                    CharSequence m10 = j6.m(spannableString, h02.getFontMetricsInt(), false, null, 0);
                    if ((m10 instanceof Spanned) && (g6VarArr = (g6[]) ((Spanned) m10).getSpans(0, m10.length(), g6.class)) != null) {
                        for (g6 g6Var : g6VarArr) {
                            g6Var.b = 0.85f;
                        }
                    }
                    h02.setText(m10);
                    u0(h02, c20Var.p);
                    sg.h1 swatch = h02.getSwatch();
                    swatch.a = c20Var.l;
                    h02.setSwatch(swatch);
                    n1Var = h02;
                } else {
                    byte b12 = b10;
                    if (b11 == b12) {
                        n1 f02 = f0(c20Var.j, false);
                        f02.C0 = false;
                        if ((c20Var.b & b12) != 0) {
                            f02.r(false);
                        }
                        if ((c20Var.b & 16) != 0) {
                            f02.t(false);
                        }
                        ViewGroup.LayoutParams layoutParams2 = f02.getLayoutParams();
                        layoutParams2.width = c20Var.q;
                        layoutParams2.height = c20Var.r;
                        n1Var = f02;
                    } else {
                        i12++;
                        arrayList2 = arrayList;
                        z10 = false;
                        b10 = 2;
                    }
                }
                n1Var.setX((c20Var.c * this.B0.a) - (((1.0f - c20Var.v) * c20Var.q) / 2.0f));
                n1Var.setY((c20Var.d * this.B0.b) - (((1.0f - c20Var.v) * c20Var.r) / 2.0f));
                n1Var.setPosition(new PointF((c20Var.q / 2.0f) + n1Var.getX(), (c20Var.r / 2.0f) + n1Var.getY()));
                n1Var.setScale(c20Var.v);
                n1Var.setRotation((float) (((-c20Var.e) / 3.141592653589793d) * 180.0d));
                i12++;
                arrayList2 = arrayList;
                z10 = false;
                b10 = 2;
            }
        }
        this.J0.setVisibility(4);
        hh0 hh0Var = new hh0(context, 19);
        this.I0 = hh0Var;
        addView(hh0Var);
        ?? frameLayout = new FrameLayout(context);
        this.L0 = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout.setBackground(new GradientDrawable(orientation, new int[]{-16777216, 0}));
        addView(frameLayout, ma.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.g1 = imageView;
        imageView.setImageResource(R.drawable.photo_undo2);
        imageView.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        imageView.setBackground(n6.h0(1090519039, 1, -1));
        final int i15 = 0;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: tg.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        vp0 vp0Var2 = vp0Var;
                        b0 b0Var2 = vp0Var2.G0;
                        if (b0Var2 != null && (b0Var2.getCurrentBrush() instanceof sg.g)) {
                            b0Var2.b();
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
                        b0 b0Var3 = vp0Var3.G0;
                        sg.k1 k1Var2 = vp0Var3.p0;
                        if (k1Var2.a()) {
                            if (b0Var3 != null && (b0Var3.getCurrentBrush() instanceof sg.g)) {
                                b0Var3.b();
                                vp0Var3.d1.setSelectedIndex(1);
                                vp0Var3.w((sg.h) sg.h.a.get(0));
                            }
                            b0Var3.a();
                            k1Var2.c.clear();
                            k1Var2.b.clear();
                            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(k1Var2, 14));
                            vp0Var3.J0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        vp0 vp0Var4 = vp0Var;
                        j jVar = vp0Var4.C0;
                        if (jVar instanceof m2) {
                            org.telegram.messenger.g0.v1(((m2) jVar).getFocusedView());
                        }
                        if (vp0Var4.Q1) {
                            vp0Var4.k0(false);
                        }
                        vp0Var4.q0(vp0Var4.C0);
                        vp0Var4.r0(null, true);
                        break;
                    default:
                        vp0Var.r0(null, true);
                        break;
                }
            }
        });
        imageView.setAlpha(0.6f);
        imageView.setClickable(false);
        frameLayout.addView(imageView, ma.d(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(n6.h0(822083583, 7, -1));
        linearLayout.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 16.0f);
        textView.setText(gd.M0(2131747074, null));
        linearLayout.addView(n10.e(context, R.drawable.photo_zoomout), ma.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, ma.r(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new bi.o(27));
        frameLayout.addView(linearLayout, ma.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.i1 = textView2;
        textView2.setBackground(n6.h0(822083583, 7, -1));
        textView2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        textView2.setText(gd.M0(2131747086, null));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        final int i16 = 1;
        textView2.setTextSize(1, 16.0f);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: tg.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        vp0 vp0Var2 = vp0Var;
                        b0 b0Var2 = vp0Var2.G0;
                        if (b0Var2 != null && (b0Var2.getCurrentBrush() instanceof sg.g)) {
                            b0Var2.b();
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
                        b0 b0Var3 = vp0Var3.G0;
                        sg.k1 k1Var2 = vp0Var3.p0;
                        if (k1Var2.a()) {
                            if (b0Var3 != null && (b0Var3.getCurrentBrush() instanceof sg.g)) {
                                b0Var3.b();
                                vp0Var3.d1.setSelectedIndex(1);
                                vp0Var3.w((sg.h) sg.h.a.get(0));
                            }
                            b0Var3.a();
                            k1Var2.c.clear();
                            k1Var2.b.clear();
                            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(k1Var2, 14));
                            vp0Var3.J0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        vp0 vp0Var4 = vp0Var;
                        j jVar = vp0Var4.C0;
                        if (jVar instanceof m2) {
                            org.telegram.messenger.g0.v1(((m2) jVar).getFocusedView());
                        }
                        if (vp0Var4.Q1) {
                            vp0Var4.k0(false);
                        }
                        vp0Var4.q0(vp0Var4.C0);
                        vp0Var4.r0(null, true);
                        break;
                    default:
                        vp0Var.r0(null, true);
                        break;
                }
            }
        });
        textView2.setAlpha(0.6f);
        TextView m11 = org.telegram.ui.Cells.c0.m(frameLayout, textView2, ma.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.j1 = m11;
        m11.setBackground(n6.h0(822083583, 7, -1));
        m11.setText(gd.M0(2131752090, null));
        m11.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        m11.setGravity(16);
        m11.setTextColor(-1);
        m11.setTypeface(org.telegram.messenger.g0.o());
        m11.setTextSize(1, 16.0f);
        final int i17 = 2;
        m11.setOnClickListener(new View.OnClickListener() { // from class: tg.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i17) {
                    case 0:
                        vp0 vp0Var2 = vp0Var;
                        b0 b0Var2 = vp0Var2.G0;
                        if (b0Var2 != null && (b0Var2.getCurrentBrush() instanceof sg.g)) {
                            b0Var2.b();
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
                        b0 b0Var3 = vp0Var3.G0;
                        sg.k1 k1Var2 = vp0Var3.p0;
                        if (k1Var2.a()) {
                            if (b0Var3 != null && (b0Var3.getCurrentBrush() instanceof sg.g)) {
                                b0Var3.b();
                                vp0Var3.d1.setSelectedIndex(1);
                                vp0Var3.w((sg.h) sg.h.a.get(0));
                            }
                            b0Var3.a();
                            k1Var2.c.clear();
                            k1Var2.b.clear();
                            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(k1Var2, 14));
                            vp0Var3.J0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        vp0 vp0Var4 = vp0Var;
                        j jVar = vp0Var4.C0;
                        if (jVar instanceof m2) {
                            org.telegram.messenger.g0.v1(((m2) jVar).getFocusedView());
                        }
                        if (vp0Var4.Q1) {
                            vp0Var4.k0(false);
                        }
                        vp0Var4.q0(vp0Var4.C0);
                        vp0Var4.r0(null, true);
                        break;
                    default:
                        vp0Var.r0(null, true);
                        break;
                }
            }
        });
        m11.setAlpha(0.0f);
        int i18 = 8;
        m11.setVisibility(8);
        TextView m12 = org.telegram.ui.Cells.c0.m(frameLayout, m11, ma.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.k1 = m12;
        m12.setBackground(n6.h0(822083583, 7, -1));
        m12.setText(gd.M0(2131751343, null));
        m12.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        m12.setGravity(16);
        m12.setTextColor(-1);
        m12.setTypeface(org.telegram.messenger.g0.o());
        m12.setTextSize(1, 16.0f);
        final int i19 = 3;
        m12.setOnClickListener(new View.OnClickListener() { // from class: tg.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i19) {
                    case 0:
                        vp0 vp0Var2 = vp0Var;
                        b0 b0Var2 = vp0Var2.G0;
                        if (b0Var2 != null && (b0Var2.getCurrentBrush() instanceof sg.g)) {
                            b0Var2.b();
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
                        b0 b0Var3 = vp0Var3.G0;
                        sg.k1 k1Var2 = vp0Var3.p0;
                        if (k1Var2.a()) {
                            if (b0Var3 != null && (b0Var3.getCurrentBrush() instanceof sg.g)) {
                                b0Var3.b();
                                vp0Var3.d1.setSelectedIndex(1);
                                vp0Var3.w((sg.h) sg.h.a.get(0));
                            }
                            b0Var3.a();
                            k1Var2.c.clear();
                            k1Var2.b.clear();
                            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(k1Var2, 14));
                            vp0Var3.J0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        vp0 vp0Var4 = vp0Var;
                        j jVar = vp0Var4.C0;
                        if (jVar instanceof m2) {
                            org.telegram.messenger.g0.v1(((m2) jVar).getFocusedView());
                        }
                        if (vp0Var4.Q1) {
                            vp0Var4.k0(false);
                        }
                        vp0Var4.q0(vp0Var4.C0);
                        vp0Var4.r0(null, true);
                        break;
                    default:
                        vp0Var.r0(null, true);
                        break;
                }
            }
        });
        m12.setAlpha(0.0f);
        m12.setVisibility(8);
        frameLayout.addView(m12, ma.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        e0 e0Var = new e0(vp0Var, context);
        this.M0 = e0Var;
        e0Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), 0);
        e0Var.setBackground(new GradientDrawable(orientation, new int[]{0, TLObject.FLAG_31}));
        addView(e0Var, ma.e(-1, ks.p1, 80));
        h1 h1Var2 = new h1(context, bitmap2 != null);
        this.d1 = h1Var2;
        h1Var2.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        h1Var2.setDelegate(this);
        h1Var2.setSelectedIndex(1);
        e0Var.addView(h1Var2, ma.c(48.0f, -1));
        e1 e1Var = new e1(context);
        this.e1 = e1Var;
        e1Var.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        e1Var.setVisibility(8);
        e1Var.setDelegate(this);
        e1Var.setAlignment(sg.k0.e(i7).g);
        e0Var.addView(e1Var, ma.c(48.0f, -1));
        w01 w01Var = new w01(vp0Var, context);
        this.N0 = w01Var;
        addView(w01Var, ma.c(-1.0f, -1));
        j1 j1Var = new j1(context);
        this.f1 = j1Var;
        j1Var.setVisibility(8);
        j1Var.setOnItemClickListener(new i8(vp0Var, 20));
        e1Var.setTypefaceListView(j1Var);
        w01Var.addView(j1Var, ma.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        Paint paint2 = this.l1;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.l1.setColor(1728053247);
        this.l1.setStrokeWidth(Math.max(2, org.telegram.messenger.g0.L(1.0f)));
        this.m1.setColor(n6.w0(n6.G8, this.A1));
        d0 d0Var = new d0(vp0Var, context);
        this.q1 = d0Var;
        d0Var.setVisibility(8);
        d0Var.setColorPalette(sg.k0.e(i7));
        d0Var.setColorListener(new m(vp0Var, 0));
        e0Var.addView(d0Var, ma.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        v0 v0Var = new v0(context);
        this.k0 = v0Var;
        v0Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        v0Var.setBackground(n6.h0(1090519039, 1, -1));
        e0Var.addView(v0Var, ma.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        z0 z0Var = new z0(context);
        this.l0 = z0Var;
        z0Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        z0Var.setBackground(n6.h0(1090519039, 1, -1));
        z0Var.setOnClickListener(new qt(vp0Var, context, bitmap2, i18));
        e0Var.addView(z0Var, ma.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        m1 m1Var = new m1(context);
        this.V0 = m1Var;
        m1Var.setColorSwatch(this.u1);
        m1Var.setRenderView(this.G0);
        m1Var.setValueOverride(this.W0);
        this.u1.c = this.W0.get();
        m1Var.setOnUpdate(new jw0(vp0Var, i7, 13));
        addView(m1Var, ma.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.O0 = frameLayout2;
        addView(frameLayout2, ma.c(-1.0f, -1));
        this.t1.setStyle(style);
        this.t1.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        s0(this.u1, null);
        w((sg.h) sg.h.a.get(0));
        updateColors();
        if (Build.VERSION.SDK_INT >= 29) {
            Point point = org.telegram.messenger.g0.q;
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (point.y * 0.35f), org.telegram.messenger.g0.L(100.0f), (int) (point.y * 0.65d))));
        }
    }

    public static /* synthetic */ void X(vp0 vp0Var, Integer num) {
        vp0Var.setNewColor(num.intValue());
        vp0Var.w0(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8 A[Catch: all -> 0x002c, Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:4:0x0004, B:6:0x0022, B:8:0x0026, B:12:0x0036, B:14:0x005b, B:17:0x0062, B:18:0x0069, B:21:0x006e, B:22:0x0078, B:24:0x007e, B:26:0x0092, B:30:0x009c, B:34:0x00a8, B:36:0x00ab, B:41:0x00ae, B:46:0x00b5), top: B:3:0x0004, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void Y(g0 g0Var) {
        sg.l0 l0Var;
        boolean z10;
        Bitmap bitmap = g0Var.o0;
        w8.b bVar = null;
        try {
            try {
                gf.c cVar = new gf.c(g0Var.getContext());
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
                md0 md0Var = new md0(18);
                b7.d dVar = (b7.d) md0Var.b;
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                md0Var.d = bitmap;
                dVar.a = width;
                dVar.b = height;
                dVar.c = g0Var.getFrameRotation();
                if (((ByteBuffer) md0Var.c) == null && ((Bitmap) md0Var.d) == null) {
                    throw new IllegalStateException("Missing image data.  Call either setBitmap or setImageData to specify the image");
                }
                try {
                    SparseArray e12 = bVar.e1(md0Var);
                    ArrayList arrayList = new ArrayList();
                    vt0 paintingSize = g0Var.getPaintingSize();
                    for (int i7 = 0; i7 < e12.size(); i7++) {
                        w8.a aVar = (w8.a) e12.get(e12.keyAt(i7));
                        int i10 = g0Var.Y0;
                        if (i10 % 360 != 90 && i10 % 360 != 270) {
                            z10 = false;
                            l0Var = new sg.l0(aVar, bitmap, paintingSize, z10);
                            if (!(l0Var.d == null)) {
                                arrayList.add(l0Var);
                            }
                        }
                        z10 = true;
                        l0Var = new sg.l0(aVar, bitmap, paintingSize, z10);
                        if (!(l0Var.d == null)) {
                        }
                    }
                    g0Var.X0 = arrayList;
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

    public static void Z(g0 g0Var) {
        j jVar;
        c0 c0Var = g0Var.J0;
        j jVar2 = g0Var.C0;
        if (jVar2 != null) {
            PointF A0 = g0Var.A0(jVar2);
            j jVar3 = g0Var.C0;
            if (jVar3 instanceof f2) {
                f2 f2Var = new f2(g0Var.getContext(), (f2) g0Var.C0, A0);
                f2Var.setDelegate(g0Var);
                c0Var.addView(f2Var);
                jVar = f2Var;
            } else if (jVar3 instanceof m2) {
                m2 m2Var = new m2(g0Var.getContext(), (m2) g0Var.C0, A0);
                m2Var.setDelegate(g0Var);
                m2Var.setMaxWidth((int) (g0Var.getPaintingSize().a - 20.0f));
                c0Var.addView(m2Var, ma.c(-2.0f, -2));
                jVar = m2Var;
            } else {
                jVar = null;
            }
            g0Var.p0(jVar);
            g0Var.r0(jVar, true);
        }
        org.telegram.ui.ActionBar.h1 h1Var = g0Var.B1;
        if (h1Var == null || !h1Var.isShowing()) {
            return;
        }
        g0Var.B1.d(true);
    }

    public static void a0(vp0 vp0Var, Integer num) {
        sg.k0 k0Var = vp0Var.F1;
        k0Var.h(num.intValue(), true);
        k0Var.g();
        vp0Var.setNewColor(num.intValue());
        d0 d0Var = vp0Var.q1;
        d0Var.setSelectedColorIndex(k0Var.d());
        d0Var.getAdapter().f();
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

    private vt0 getPaintingSize() {
        vt0 vt0Var = this.B0;
        if (vt0Var != null) {
            return vt0Var;
        }
        Bitmap bitmap = this.n0;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        int o4 = bz.o();
        int i7 = o4 != 0 ? o4 != 2 ? 2560 : 3840 : 1280;
        vt0 vt0Var2 = new vt0(width, height);
        float f10 = i7;
        vt0Var2.a = f10;
        float floor = (float) Math.floor((f10 * height) / width);
        vt0Var2.b = floor;
        if (floor > f10) {
            vt0Var2.b = f10;
            vt0Var2.a = (float) Math.floor((f10 * width) / height);
        }
        this.B0 = vt0Var2;
        return vt0Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewColor(int i7) {
        sg.h1 h1Var = this.u1;
        int i10 = h1Var.a;
        h1Var.a = i7;
        s0(h1Var, null);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new g4(this, i10, i7, 5));
        duration.start();
    }

    private void setTextType(int i7) {
        this.E0 = i7;
        j jVar = this.C0;
        if (jVar instanceof m2) {
            ((m2) jVar).setType(i7);
        }
        sg.k0 e10 = sg.k0.e(this.z1);
        e10.h = i7;
        e10.a.edit().putInt("text_type", i7).apply();
        this.e1.setOutlineType(i7);
    }

    private void setupTabsLayout(Context context) {
        x4 x4Var = new x4(this, context);
        this.P0 = x4Var;
        x4Var.setClipToPadding(false);
        this.P0.setOrientation(0);
        this.M0.addView(this.P0, ma.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.a1 = textView;
        textView.setText(gd.M0(2131747084, null).toUpperCase());
        TextView textView2 = this.a1;
        int i7 = n6.i6;
        u uVar = this.A1;
        u6.Q(textView2, n6.h0(n6.w0(i7, uVar), 7, -1), null, u6.M(i7), uVar);
        this.a1.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        this.a1.setTextColor(-1);
        this.a1.setTextSize(1, 14.0f);
        this.a1.setGravity(1);
        this.a1.setTypeface(org.telegram.messenger.g0.o());
        this.a1.setSingleLine();
        this.a1.setOnClickListener(new k(this, 0));
        this.P0.addView(this.a1, ma.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.b1 = textView3;
        textView3.setText(gd.M0(2131747083, null).toUpperCase());
        u6.Q(this.b1, n6.h0(n6.w0(i7, uVar), 7, -1), null, u6.M(i7), uVar);
        this.b1.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        this.b1.setOnClickListener(new k(this, 1));
        this.b1.setTextColor(-1);
        this.b1.setTextSize(1, 14.0f);
        this.b1.setGravity(1);
        this.b1.setTypeface(org.telegram.messenger.g0.o());
        this.b1.setAlpha(0.6f);
        this.b1.setSingleLine();
        this.P0.addView(this.b1, ma.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.c1 = textView4;
        textView4.setText(gd.M0(2131747082, null).toUpperCase());
        u6.Q(this.c1, n6.h0(n6.w0(i7, uVar), 7, -1), null, u6.M(i7), uVar);
        this.c1.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        this.c1.setTextColor(-1);
        this.c1.setTextSize(1, 14.0f);
        this.c1.setGravity(1);
        this.c1.setTypeface(org.telegram.messenger.g0.o());
        this.c1.setAlpha(0.6f);
        this.c1.setSingleLine();
        this.c1.setOnClickListener(new k(this, 4));
        this.P0.addView(this.c1, ma.l(1.0f, 0, -2));
    }

    public static void u0(m2 m2Var, int i7) {
        m2Var.setAlign(i7);
        int i10 = 2;
        m2Var.getEditText().setGravity(i7 != 1 ? i7 != 2 ? 19 : 21 : 17);
        if (i7 == 1) {
            i10 = 4;
        } else if (i7 == 2 ? !gd.a0 : gd.a0) {
            i10 = 3;
        }
        m2Var.getEditText().setTextAlignment(i10);
    }

    @Override // tg.g1
    public final void A() {
        y0(new n(this, 4), this, 53, 0, getHeight());
    }

    public final PointF A0(j jVar) {
        we weVar = this.r0;
        float f10 = weVar != null ? 200.0f / weVar.c : 200.0f;
        if (jVar != null) {
            PointF position = jVar.getPosition();
            return new PointF(position.x + f10, position.y + f10);
        }
        float f11 = weVar != null ? 100.0f / weVar.c : 100.0f;
        PointF e02 = e0();
        while (true) {
            int i7 = 0;
            boolean z10 = false;
            while (true) {
                c0 c0Var = this.J0;
                if (i7 >= c0Var.getChildCount()) {
                    break;
                }
                View childAt = c0Var.getChildAt(i7);
                if (childAt instanceof j) {
                    PointF position2 = ((j) childAt).getPosition();
                    if (((float) Math.sqrt(Math.pow(position2.y - e02.y, 2.0d) + Math.pow(position2.x - e02.x, 2.0d))) < f11) {
                        z10 = true;
                    }
                }
                i7++;
            }
            if (!z10) {
                return e02;
            }
            e02 = new PointF(e02.x + f10, e02.y + f10);
        }
    }

    public final void B0(int i7) {
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
        sg.k0 e10 = sg.k0.e(i11);
        boolean z10 = i7 == 2;
        if (e10.l != z10) {
            e10.l = z10;
            if (z10) {
                e10.i(-1, false);
            } else {
                e10.i(e10.a.getInt("brush", 0), false);
            }
        }
        int c10 = sg.k0.e(i11).c();
        sg.h1 h1Var = this.u1;
        h1Var.a = c10;
        s0(h1Var, null);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        this.T0 = duration;
        duration.setInterpolator(lr.f);
        this.T0.addUpdateListener(new z2(this, viewGroup3, viewGroup4, 4));
        this.T0.addListener(new y4(this, viewGroup3, viewGroup4, i7, 3));
        this.T0.start();
    }

    public final void C0() {
        int i7 = 0;
        while (true) {
            c0 c0Var = this.J0;
            if (i7 >= c0Var.getChildCount()) {
                return;
            }
            View childAt = c0Var.getChildAt(i7);
            if (childAt != this.C0) {
                if (childAt instanceof j) {
                    j jVar = (j) childAt;
                    if (!jVar.m0 && jVar.k0 <= 0.0f) {
                    }
                }
                i7++;
            }
            ((j) childAt).m();
            i7++;
        }
    }

    @Override // tg.c1
    public final void D() {
        z0(true);
    }

    @Override // org.telegram.ui.Components.zt0
    public final void L(int i7, boolean z10) {
        boolean z11;
        if (i7 > org.telegram.messenger.g0.L(50.0f) && this.R1 && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
            if (z10) {
                this.V1 = i7;
                mp.f1().edit().putInt("kbd_height_land3", this.V1).commit();
            } else {
                this.U1 = i7;
                mp.f1().edit().putInt("kbd_height", this.U1).commit();
            }
        }
        if (this.Q1) {
            int i10 = z10 ? this.V1 : this.U1;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.P1.getLayoutParams();
            int i11 = layoutParams.width;
            int i12 = org.telegram.messenger.g0.q.x;
            if (i11 != i12 || layoutParams.height != i10) {
                layoutParams.width = i12;
                layoutParams.height = i10;
                this.P1.setLayoutParams(layoutParams);
                this.T1 = layoutParams.height;
                requestLayout();
                p3 p3Var = ((vp0) this).Y1.L1;
                if (p3Var != null) {
                    p3Var.a();
                }
                getHeight();
            }
        }
        if (this.W1 == i7 && this.X1 == z10) {
            getHeight();
            return;
        }
        this.W1 = i7;
        this.X1 = z10;
        boolean z12 = this.R1;
        j jVar = this.C0;
        if (jVar instanceof m2) {
            this.R1 = ((m2) jVar).getEditText().isFocused() && i7 > 0;
        } else {
            this.R1 = false;
        }
        if (this.R1 && this.Q1) {
            x0(0);
        }
        if (this.T1 != 0 && !(z11 = this.R1) && z11 != z12 && !this.Q1) {
            this.T1 = 0;
            requestLayout();
            p3 p3Var2 = ((vp0) this).Y1.L1;
            if (p3Var2 != null) {
                p3Var2.a();
            }
        }
        getHeight();
    }

    @Override // tg.g1, tg.c1
    public final void a() {
        w0(true);
    }

    @Override // org.telegram.ui.Components.au0, org.telegram.ui.ActionBar.c6
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

    @Override // tg.c1
    public final void b() {
        setTextType((this.E0 + 1) % 4);
    }

    @Override // tg.c1
    public final void c(int i7) {
        j jVar = this.C0;
        if (jVar instanceof m2) {
            u0((m2) jVar, i7);
            sg.k0 e10 = sg.k0.e(this.z1);
            e10.g = i7;
            e10.a.edit().putInt("text_alignment", i7).apply();
        }
    }

    public final void d0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new p4.o0(10, this, (n1) view)).start();
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        c0 c0Var;
        m2 m2Var;
        String str;
        if (i7 != ks.E5 || (c0Var = this.J0) == null) {
            return;
        }
        for (int i11 = 0; i11 < c0Var.getChildCount(); i11++) {
            View childAt = c0Var.getChildAt(i11);
            if ((childAt instanceof m2) && (str = (m2Var = (m2) childAt).B0) != null) {
                m2Var.setTypeface(str);
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
        hh0 hh0Var;
        c0 c0Var = this.J0;
        if (view == c0Var) {
            float d = this.J1.d(this.G1);
            if (d > 0.0f) {
                float L = org.telegram.messenger.g0.L(24.0f * d);
                int r12 = n6.r1(d, 1090519039);
                Paint paint = this.K1;
                paint.setShadowLayer(L, 0.0f, 0.0f, r12);
                paint.setColor(0);
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), ks.e4, 31);
                canvas.translate(c0Var.getX(), c0Var.getY());
                canvas.scale(c0Var.getScaleX(), c0Var.getScaleY(), c0Var.getWidth() / 2.0f, c0Var.getHeight() / 2.0f);
                canvas.drawRect(0.0f, 0.0f, c0Var.getWidth(), c0Var.getHeight(), paint);
                canvas.drawRect(0.0f, 0.0f, c0Var.getWidth(), c0Var.getHeight(), this.L1);
                canvas.restore();
                if ((view != this.G0 || view == this.H0 || ((view == c0Var && c0Var.getClipChildren()) || (view == (hh0Var = this.I0) && hh0Var.getClipChildren()))) && (weVar = this.r0) != null) {
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
                    float additionalBottom = (((getAdditionalBottom() + (((getMeasuredHeight() - this.T1) - currentActionBarHeight) - org.telegram.messenger.g0.L(48.0f))) - scaleY) / 2.0f) + org.telegram.messenger.g0.L(8.0f) + r10 + this.w0;
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
        float additionalBottom2 = (((getAdditionalBottom() + (((getMeasuredHeight() - this.T1) - currentActionBarHeight2) - org.telegram.messenger.g0.L(48.0f))) - scaleY2) / 2.0f) + org.telegram.messenger.g0.L(8.0f) + r10 + this.w0;
        canvas.clipRect(Math.max(0.0f, ceil2), Math.max(0.0f, additionalBottom2), Math.min(ceil2 + scaleX2, getMeasuredWidth()), Math.min(getMeasuredHeight(), additionalBottom2 + scaleY2));
        r10 = 1;
        boolean drawChild2 = super.drawChild(canvas, view, j3);
        if (r10 != 0) {
        }
        return drawChild2;
    }

    public final PointF e0() {
        vt0 paintingSize = getPaintingSize();
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

    @Override // tg.h
    public final void f(j jVar) {
        int[] i02 = i0(jVar);
        y0(new s(this, jVar, 1), this, 51, i02[0], i02[1] - org.telegram.messenger.g0.L(32.0f));
    }

    public final n1 f0(String str, boolean z10) {
        float f10;
        vt0 vt0Var;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f10 = options.outWidth / options.outHeight;
        } catch (Exception e10) {
            a8.g(e10, true);
            f10 = 1.0f;
        }
        c0 c0Var = this.J0;
        if (f10 > 1.0f) {
            float floor = (float) Math.floor(c0Var.getMeasuredWidth() * 0.5d);
            vt0Var = new vt0(floor, floor / f10);
        } else {
            float floor2 = (float) Math.floor(c0Var.getMeasuredHeight() * 0.5d);
            vt0Var = new vt0(f10 * floor2, floor2);
        }
        vt0 vt0Var2 = vt0Var;
        Pair N0 = org.telegram.messenger.g0.N0(str);
        if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
            float f11 = vt0Var2.a;
            vt0Var2.a = vt0Var2.b;
            vt0Var2.b = f11;
        }
        Context context = getContext();
        PointF e02 = e0();
        int intValue = ((Integer) N0.first).intValue();
        ((Integer) N0.second).getClass();
        n1 n1Var = new n1(context, e02, vt0Var2, str, intValue);
        n1Var.setDelegate(this);
        c0Var.addView(n1Var);
        if (z10) {
            p0(n1Var);
            r0(n1Var, true);
        }
        return n1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final y g0(Object obj, TLRPC.Document document, boolean z10) {
        TLRPC.TL_maskCoords tL_maskCoords;
        float f10;
        k5 k5Var;
        double d;
        k5 k5Var2;
        PointF pointF;
        boolean C4;
        ArrayList arrayList;
        sg.l0 l0Var;
        k5 k5Var3;
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
        k5 k5Var4 = new k5(e0(), f12, f10);
        c0 c0Var = this.J0;
        if (tL_maskCoords == null || (arrayList = this.X0) == null || arrayList.size() == 0) {
            k5Var = k5Var4;
            d = 0.5d;
        } else {
            int i11 = tL_maskCoords.n;
            long j3 = document.id;
            if (i11 >= 0 && i11 <= 3 && !this.X0.isEmpty()) {
                int size = this.X0.size();
                int nextInt = Utilities.b.nextInt(size);
                int i12 = size;
                loop1: while (i12 > 0) {
                    sg.l0 l0Var2 = (sg.l0) this.X0.get(nextInt);
                    if (l0Var2.a(i11) != null) {
                        d = 0.5d;
                        float f13 = l0Var2.a * 1.1f;
                        int i13 = 0;
                        while (i13 < c0Var.getChildCount()) {
                            View childAt = c0Var.getChildAt(i13);
                            sg.l0 l0Var3 = l0Var2;
                            if (childAt instanceof f2) {
                                f2 f2Var = (f2) childAt;
                                if (f2Var.getAnchor() == i11) {
                                    PointF position = f2Var.getPosition();
                                    k5Var3 = k5Var4;
                                    i7 = size;
                                    f11 = f13;
                                    float hypot = (float) Math.hypot(position.x - r4.x, position.y - r4.y);
                                    if ((j3 == f2Var.getSticker().id || this.X0.size() > 1) && hypot < f11) {
                                        break;
                                    }
                                    i13++;
                                    l0Var2 = l0Var3;
                                    k5Var4 = k5Var3;
                                    size = i7;
                                    f13 = f11;
                                }
                            }
                            k5Var3 = k5Var4;
                            i7 = size;
                            f11 = f13;
                            i13++;
                            l0Var2 = l0Var3;
                            k5Var4 = k5Var3;
                            size = i7;
                            f13 = f11;
                        }
                        k5Var = k5Var4;
                        l0Var = l0Var2;
                        break loop1;
                    }
                    k5Var3 = k5Var4;
                    i7 = size;
                    nextInt = (nextInt + 1) % i7;
                    i12--;
                    k5Var4 = k5Var3;
                    size = i7;
                }
            }
            k5Var = k5Var4;
            d = 0.5d;
            l0Var = null;
            if (l0Var != null) {
                PointF a10 = l0Var.a(i11);
                float f14 = i11 == 1 ? l0Var.e : l0Var.a;
                float f15 = l0Var.b;
                float floor = (float) ((f14 / ((float) Math.floor(getPaintingSize().a * d))) * tL_maskCoords.zoom);
                double radians = (float) Math.toRadians(f15);
                double d2 = 1.5707963267948966d - radians;
                double d10 = f14;
                float sin = (float) (Math.sin(d2) * d10 * tL_maskCoords.x);
                float cos = (float) (Math.cos(d2) * d10 * tL_maskCoords.x);
                double d11 = radians + 1.5707963267948966d;
                k5Var2 = new k5(new PointF(a10.x + sin + ((float) (Math.cos(d11) * d10 * tL_maskCoords.y)), a10.y + cos + ((float) (Math.sin(d11) * d10 * tL_maskCoords.y))), floor, f15);
                Context context = getContext();
                float floor2 = (float) Math.floor(getPaintingSize().a * d);
                vt0 vt0Var = new vt0(floor2, floor2);
                pointF = k5Var2.a;
                y yVar = new y(this, context, pointF, k5Var2.c, k5Var2.b, vt0Var, document, obj);
                C4 = fj.C4(document);
                ImageReceiver imageReceiver = yVar.y0;
                if (C4) {
                    imageReceiver.p1 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
                }
                imageReceiver.E0(12);
                if (pointF.x == c0Var.getMeasuredWidth() / 2.0f) {
                    yVar.setStickyX(2);
                }
                if (pointF.y == c0Var.getMeasuredHeight() / 2.0f) {
                    yVar.setStickyY(2);
                }
                yVar.setDelegate(this);
                c0Var.addView(yVar);
                if (z10) {
                    p0(yVar);
                    r0(yVar, true);
                }
                return yVar;
            }
        }
        k5Var2 = k5Var;
        Context context2 = getContext();
        float floor22 = (float) Math.floor(getPaintingSize().a * d);
        vt0 vt0Var2 = new vt0(floor22, floor22);
        pointF = k5Var2.a;
        y yVar2 = new y(this, context2, pointF, k5Var2.c, k5Var2.b, vt0Var2, document, obj);
        C4 = fj.C4(document);
        ImageReceiver imageReceiver2 = yVar2.y0;
        if (C4) {
        }
        imageReceiver2.E0(12);
        if (pointF.x == c0Var.getMeasuredWidth() / 2.0f) {
        }
        if (pointF.y == c0Var.getMeasuredHeight() / 2.0f) {
        }
        yVar2.setDelegate(this);
        c0Var.addView(yVar2);
        if (z10) {
        }
        return yVar2;
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
        c0 c0Var = this.J0;
        int childCount = c0Var.getChildCount();
        ArrayList arrayList = null;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = c0Var.getChildAt(i7);
            if (childAt instanceof f2) {
                TLRPC.Document sticker = ((f2) childAt).getSticker();
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
            } else if (childAt instanceof m2) {
                CharSequence text = ((m2) childAt).getText();
                if ((text instanceof Spanned) && (x5VarArr = (x5[]) ((Spanned) text).getSpans(0, text.length(), x5.class)) != null) {
                    for (x5 x5Var : x5VarArr) {
                        if (x5Var != null) {
                            TLRPC.Document document = x5Var.document;
                            if (document == null) {
                                document = o5.e(this.z1, x5Var.getDocumentId());
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

    public sg.u0 getRenderView() {
        return this.G0;
    }

    public float getSelectedEntityBottom() {
        j jVar = this.C0;
        c0 c0Var = this.J0;
        if (jVar == null) {
            return getY() + c0Var.getMeasuredHeight();
        }
        jVar.getLocationInWindow(new int[2]);
        return (c0Var.getScaleY() * this.C0.getHeight()) + r2[1];
    }

    public mz0 getThanosEffect() {
        if (!mz0.c()) {
            return null;
        }
        if (this.K0 == null) {
            mz0 mz0Var = new mz0(getContext(), new n(this, 0));
            this.K0 = mz0Var;
            addView(mz0Var);
        }
        return this.K0;
    }

    public final m2 h0(boolean z10) {
        ((vp0) this).Y1.h0.isFocusable();
        vt0 paintingSize = getPaintingSize();
        PointF A0 = A0(null);
        m2 m2Var = new m2(getContext(), A0, (int) (paintingSize.a / 9.0f), "", this.u1, this.E0);
        float f10 = paintingSize.a / 9.0f;
        n nVar = new n(this, 2);
        m2Var.x0 = (int) (0.5f * f10);
        m2Var.y0 = (int) (f10 * 2.0f);
        m2Var.z0 = nVar;
        float f11 = A0.x;
        c0 c0Var = this.J0;
        if (f11 == c0Var.getMeasuredWidth() / 2.0f) {
            m2Var.setStickyX(2);
        }
        if (A0.y == c0Var.getMeasuredHeight() / 2.0f) {
            m2Var.setStickyY(2);
        }
        m2Var.setDelegate(this);
        m2Var.setMaxWidth((int) (paintingSize.a - 20.0f));
        int i7 = this.z1;
        m2Var.setTypeface(sg.k0.e(i7).j);
        m2Var.setType(sg.k0.e(i7).h);
        c0Var.addView(m2Var, ma.c(-2.0f, -2));
        we weVar = this.r0;
        if (weVar != null) {
            m2Var.j(1.0f / weVar.c);
            m2Var.f(-(weVar.k + weVar.d));
        }
        if (z10) {
            p0(m2Var);
            m2Var.q();
            r0(m2Var, false);
            m2Var.getFocusedView().requestFocus();
            org.telegram.messenger.g0.I3(m2Var.getFocusedView());
            this.D0 = true;
            int i10 = sg.k0.e(i7).g;
            e1 e1Var = this.e1;
            e1Var.d(i10, true);
            e1Var.setOutlineType(sg.k0.e(i7).h);
        }
        return m2Var;
    }

    public final boolean i(MotionEvent motionEvent) {
        if (this.C0 != null) {
            r0(null, true);
        }
        float x10 = motionEvent.getX();
        b0 b0Var = this.G0;
        float translationX = ((x10 - b0Var.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / b0Var.getScaleX();
        float y10 = ((((motionEvent.getY() - b0Var.getTranslationY()) - (getMeasuredHeight() / 2.0f)) + org.telegram.messenger.g0.L(32.0f)) - ((getAdditionalTop() - getAdditionalBottom()) / 2.0f)) / b0Var.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-b0Var.getRotation());
        double d2 = y10;
        float measuredWidth = (b0Var.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d2)));
        float measuredHeight = (b0Var.getMeasuredHeight() / 2.0f) + ((float) i5.c.c(radians, d2, Math.sin(radians) * d));
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(measuredWidth, measuredHeight);
        b0Var.e(obtain);
        obtain.recycle();
        return true;
    }

    public final int[] i0(j jVar) {
        float[] fArr = this.N1;
        fArr[0] = jVar.getWidth() / 2.0f;
        fArr[1] = jVar.getHeight() / 2.0f;
        jVar.getMatrix().mapPoints(fArr);
        fArr[0] = fArr[0] + jVar.getLeft();
        fArr[1] = fArr[1] + jVar.getTop();
        Object parent = jVar.getParent();
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
        int[] iArr = this.O1;
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

    public final int j0(boolean z10) {
        return this.T1;
    }

    public final void k0(boolean z10) {
        int i7 = 0;
        if (this.Q1) {
            x0(0);
        }
        if (z10) {
            ry ryVar = this.P1;
            if (ryVar == null || ryVar.getVisibility() != 0) {
                l0();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.P1.getMeasuredHeight());
            ofFloat.addUpdateListener(new o(this, i7));
            this.S1 = true;
            ofFloat.addListener(new z(this, 1));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.j1.w);
            ofFloat.start();
        }
    }

    public final void l0() {
        ry ryVar;
        p3 p3Var;
        if (this.T1 > 0 && (p3Var = ((vp0) this).Y1.L1) != null) {
            p3Var.a();
        }
        if (!this.Q1 && (ryVar = this.P1) != null && ryVar.getVisibility() != 8) {
            this.P1.setVisibility(8);
        }
        this.T1 = 0;
    }

    public final void m0(boolean z10) {
        if (this.Q0 == 0) {
            this.V0.setLayerType(z10 ? 2 : 0, null);
            this.M0.setLayerType(z10 ? 2 : 0, null);
            this.L0.setLayerType(z10 ? 2 : 0, null);
        }
    }

    @Override // tg.h
    public final int[] n(j jVar) {
        return i0(jVar);
    }

    public final boolean n0() {
        if (this.v1) {
            w0(false);
            return true;
        }
        if (this.Q1) {
            k0(true);
            return true;
        }
        if (!this.D0) {
            return false;
        }
        r0(null, true);
        return true;
    }

    public abstract void o0(boolean z10);

    @Override // org.telegram.ui.Components.au0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ks.e().c(this, ks.E5);
    }

    @Override // org.telegram.ui.Components.au0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks.e().n(this, ks.E5);
    }

    @Override // org.telegram.ui.Components.bu0, org.telegram.ui.Components.au0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        int i13 = i11 - i7;
        int i14 = i12 - i10;
        if (this.P1 != null) {
            int measuredHeight = org.telegram.messenger.g0.Q1() ? i14 - this.P1.getMeasuredHeight() : (Q() + i14) - this.P1.getMeasuredHeight();
            ry ryVar = this.P1;
            ryVar.layout(0, measuredHeight, ryVar.getMeasuredWidth(), this.P1.getMeasuredHeight() + measuredHeight);
        }
        int i15 = this.F0 ? 0 : org.telegram.messenger.g0.m;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i15;
        b0 b0Var = this.G0;
        int ceil = (int) Math.ceil((i13 - b0Var.getMeasuredWidth()) / 2.0f);
        int additionalTop = ((getAdditionalTop() - getAdditionalBottom()) / 2) + f3.C(8.0f, (((i14 - currentActionBarHeight) - org.telegram.messenger.g0.L(48.0f)) - b0Var.getMeasuredHeight()) / 2, i15);
        b0Var.layout(ceil, additionalTop, b0Var.getMeasuredWidth() + ceil, b0Var.getMeasuredHeight() + additionalTop);
        uv uvVar = this.H0;
        uvVar.layout(ceil, additionalTop, uvVar.getMeasuredWidth() + ceil, uvVar.getMeasuredHeight() + additionalTop);
        int measuredWidth = b0Var.getMeasuredWidth();
        c0 c0Var = this.J0;
        int measuredWidth2 = ((measuredWidth - c0Var.getMeasuredWidth()) / 2) + ceil;
        int measuredHeight2 = ((b0Var.getMeasuredHeight() - c0Var.getMeasuredHeight()) / 2) + additionalTop;
        c0Var.layout(measuredWidth2, measuredHeight2, c0Var.getMeasuredWidth() + measuredWidth2, c0Var.getMeasuredHeight() + measuredHeight2);
        mz0 mz0Var = this.K0;
        if (mz0Var != null) {
            mz0Var.layout(measuredWidth2, measuredHeight2, c0Var.getMeasuredWidth() + measuredWidth2, c0Var.getMeasuredHeight() + measuredHeight2);
        }
        hh0 hh0Var = this.I0;
        hh0Var.layout(ceil, additionalTop, hh0Var.getMeasuredWidth() + ceil, hh0Var.getMeasuredHeight() + additionalTop);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        float currentActionBarHeight;
        float f10;
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
        c0 c0Var = this.J0;
        c0Var.setScaleX(f13);
        c0Var.setScaleY(this.A0);
        c0Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.B0.a, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) this.B0.b, TLObject.FLAG_30));
        mz0 mz0Var = this.K0;
        if (mz0Var != null) {
            mz0Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.B0.a, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) this.B0.b, TLObject.FLAG_30));
            this.K0.setScaleX(this.A0);
            this.K0.setScaleY(this.A0);
        }
        C0();
        this.I0.measure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30));
        measureChild(this.M0, i7, i10);
        measureChild(this.V0, i7, i10);
        measureChild(this.O0, i7, i10);
        measureChild(this.N0, i7, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(getPKeyboardHeight(), this.T1), TLObject.FLAG_30));
        FrameLayout frameLayout = this.L0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.m, frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i7, i10);
        this.z0 = false;
        if (org.telegram.messenger.g0.L(20.0f) >= 0 && !this.Q1 && !this.S1) {
            this.z0 = true;
            l0();
            this.z0 = false;
        }
        if (org.telegram.messenger.g0.L(20.0f) < 0) {
            l0();
        }
        ry ryVar = this.P1;
        if (ryVar != null) {
            measureChild(ryVar, i7, i10);
        }
    }

    @Override // tg.h
    public final /* synthetic */ boolean p() {
        return true;
    }

    public final void p0(j jVar) {
        if (jVar == null) {
            return;
        }
        this.p0.b(jVar.getUUID(), new s(this, jVar, 0));
    }

    @Override // tg.h
    public final boolean q() {
        return !this.D0;
    }

    public final void q0(j jVar) {
        j jVar2 = this.C0;
        if (jVar == jVar2 && jVar2 != null) {
            jVar2.l(jVar2.n0, false);
            this.C0 = null;
            if (jVar instanceof m2) {
                ValueAnimator valueAnimator = this.T0;
                if (valueAnimator != null && this.R0 != 0) {
                    valueAnimator.cancel();
                }
                B0(0);
            }
        }
        this.J0.removeView(jVar);
        if (jVar != null) {
            UUID uuid = jVar.getUUID();
            sg.k1 k1Var = this.p0;
            k1Var.b.remove(uuid);
            k1Var.c.remove(uuid);
            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(k1Var, 14));
        }
        m1 m1Var = this.V0;
        of ofVar = this.W0;
        m1Var.setValueOverride(ofVar);
        m1Var.setShowPreview(true);
        float f10 = ofVar.get();
        sg.h1 h1Var = this.u1;
        h1Var.c = f10;
        s0(h1Var, null);
    }

    public final boolean r0(j jVar, boolean z10) {
        g0 g0Var;
        boolean z11;
        int i7;
        boolean z12 = jVar instanceof m2;
        int i10 = 2;
        if (z12 && (((i7 = this.R0) == -1 && this.Q0 != 2) || (i7 != -1 && i7 != 2))) {
            ValueAnimator valueAnimator = this.T0;
            if (valueAnimator != null && i7 != 2) {
                valueAnimator.cancel();
            }
            if (this.v1) {
                w0(false);
            }
            B0(2);
        }
        if (z12 && z10) {
            m2 m2Var = (m2) jVar;
            int gravity = m2Var.getEditText().getGravity();
            if (gravity == 17) {
                i10 = 1;
            } else if (gravity != 21) {
                i10 = 0;
            }
            e1 e1Var = this.e1;
            e1Var.setAlignment(i10);
            e1Var.setTypeface(m2Var.getTypeface().a);
            e1Var.e(m2Var.getType(), true);
            this.N0.invalidate();
        }
        j jVar2 = this.C0;
        if (jVar2 == null) {
            g0Var = this;
            z11 = false;
        } else {
            if (jVar2 == jVar) {
                if (!this.D0) {
                    int[] i02 = i0(jVar2);
                    y0(new s(this, jVar2, 1), this, 51, i02[0], i02[1] - org.telegram.messenger.g0.L(32.0f));
                    return true;
                }
                if (jVar2 instanceof m2) {
                    org.telegram.messenger.g0.I3(((m2) jVar2).getFocusedView());
                    k0(false);
                }
                return true;
            }
            g0Var = this;
            jVar2.l(jVar2.n0, false);
            j jVar3 = g0Var.C0;
            if (jVar3 instanceof m2) {
                m2 m2Var2 = (m2) jVar3;
                l2 l2Var = m2Var2.r0;
                l2Var.clearFocus();
                l2Var.setEnabled(false);
                l2Var.setClickable(false);
                m2Var2.m();
                if (!z12) {
                    g0Var.D0 = false;
                    org.telegram.messenger.g0.v1(((m2) g0Var.C0).getFocusedView());
                    k0(false);
                }
            }
            z11 = true;
        }
        j jVar4 = g0Var.C0;
        g0Var.C0 = jVar;
        if ((jVar4 instanceof m2) && TextUtils.isEmpty(((m2) jVar4).getText())) {
            q0(jVar4);
        }
        j jVar5 = g0Var.C0;
        of ofVar = g0Var.W0;
        sg.h1 h1Var = g0Var.u1;
        m1 m1Var = g0Var.V0;
        if (jVar5 == null) {
            ValueAnimator valueAnimator2 = g0Var.T0;
            if (valueAnimator2 != null && g0Var.R0 != 0) {
                valueAnimator2.cancel();
            }
            if (g0Var.v1) {
                w0(false);
            }
            B0(0);
            m1Var.setValueOverride(ofVar);
            m1Var.setShowPreview(true);
            h1Var.c = ofVar.get();
            s0(h1Var, null);
            return z11;
        }
        hh0 hh0Var = g0Var.I0;
        jVar5.n0 = hh0Var;
        jVar5.l(hh0Var, true);
        g0Var.J0.bringChildToFront(g0Var.C0);
        j jVar6 = g0Var.C0;
        if (!(jVar6 instanceof m2)) {
            m1Var.setValueOverride(ofVar);
            m1Var.setShowPreview(true);
            h1Var.c = ofVar.get();
            s0(h1Var, null);
            return true;
        }
        m2 m2Var3 = (m2) jVar6;
        m2Var3.A0 = false;
        m2Var3.getSwatch().c = h1Var.c;
        s0(m2Var3.getSwatch(), null);
        m1Var.setValueOverride(new u4(m2Var3, (int) (g0Var.B0.a / 9.0f), 1));
        m1Var.setShowPreview(false);
        return true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.z0) {
            return;
        }
        super.requestLayout();
    }

    public final void s0(sg.h1 h1Var, Integer num) {
        sg.h1 h1Var2 = this.u1;
        if (h1Var2 != h1Var) {
            h1Var2.a = h1Var.a;
            h1Var2.b = h1Var.b;
            h1Var2.c = h1Var.c;
            int i7 = this.z1;
            sg.k0.e(i7).h(h1Var.a, true);
            sg.k0.e(i7).j(h1Var.c);
        }
        int i10 = h1Var.a;
        b0 b0Var = this.G0;
        b0Var.setColor(i10);
        b0Var.setBrushSize(h1Var.c);
        int i11 = h1Var2.a;
        if (num == null || num.intValue() == i11) {
            e0 e0Var = this.M0;
            if (e0Var != null) {
                e0Var.invalidate();
            }
        } else {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new a4(this, num, i11, 3));
            duration.start();
        }
        j jVar = this.C0;
        if (jVar instanceof m2) {
            ((m2) jVar).setSwatch(new sg.h1(h1Var.b, h1Var.c, h1Var.a));
        }
    }

    public void setBlurredBackgroundDrawableForTools(fh.g gVar) {
        gVar.q(org.telegram.messenger.g0.L(4.0f));
        this.M1 = gVar;
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

    @Override // tg.c1
    public final void t() {
        p3 p3Var;
        if (!this.R1 && !this.Q1) {
            h0(true);
            return;
        }
        boolean z10 = this.Q1;
        if (z10 && (p3Var = ((vp0) this).Y1.L1) != null) {
            p3Var.e = true;
        }
        x0(!z10 ? 1 : 0);
        if (z10) {
            j jVar = this.C0;
            if (jVar instanceof m2) {
                org.telegram.messenger.g0.I3(((m2) jVar).getEditText());
            }
        }
    }

    public final void t0(float f10) {
        this.m0 = f10;
        this.L0.setTranslationY(-f10);
        this.M0.setTranslationY(f10);
    }

    @Override // tg.h
    public final boolean u(j jVar) {
        return r0(jVar, true);
    }

    @Override // org.telegram.ui.Components.au0, org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        this.y1.setColor(-15132391);
    }

    @Override // tg.h
    public final void v(float f10, float f11, float[] fArr) {
        Point point = org.telegram.messenger.g0.q;
        double d = f10 - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.J0.getRotation());
        double d2 = f11 - (point.y / 2.0f);
        fArr[0] = (point.x / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d2)));
        fArr[1] = (point.y / 2.0f) + ((float) i5.c.c(radians, d2, Math.sin(radians) * d));
    }

    public final void v0(float f10, float f11, float f12, float f13, float f14) {
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
            float f23 = ((-this.T1) / 2.0f) + f18;
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
        C0();
        invalidate();
    }

    @Override // tg.g1
    public final void w(sg.h hVar) {
        boolean z10 = hVar instanceof sg.b;
        m1 m1Var = this.V0;
        if (z10 || (hVar instanceof sg.d)) {
            m1Var.b(0.4f, 1.75f);
        } else {
            m1Var.b(0.05f, 1.0f);
        }
        m1Var.setDrawCenter(!(hVar instanceof sg.g));
        b0 b0Var = this.G0;
        if (b0Var.getCurrentBrush() instanceof sg.g) {
            this.U0 = true;
        }
        b0Var.setBrush(hVar);
        sg.h1 h1Var = this.u1;
        int i7 = h1Var.a;
        h1Var.a = sg.k0.e(this.z1).c();
        h1Var.c = this.W0.get();
        s0(h1Var, Integer.valueOf(i7));
        this.H0.invalidate();
    }

    public final void w0(final boolean z10) {
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
            final boolean[] zArr = {this.R1 || this.Q1};
            final float translationY = this.M0.getTranslationY();
            final ViewGroup barView = getBarView();
            this.w1.b(new r1.d() { // from class: tg.t
                @Override // r1.d
                public final void a(r1.g gVar3, float f10, float f11) {
                    g0 g0Var = g0.this;
                    e0 e0Var = g0Var.M0;
                    float f12 = f10 / 1000.0f;
                    g0Var.x1 = f12;
                    float f13 = ((1.0f - f12) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f13);
                    view.setScaleY(f13);
                    view.setTranslationY((Math.min(g0Var.x1, 0.25f) * org.telegram.messenger.g0.L(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(g0Var.x1, 0.25f) / 0.25f));
                    d0 d0Var = g0Var.q1;
                    float f14 = g0Var.x1;
                    boolean z11 = z10;
                    d0Var.B1(z11, f14);
                    g0Var.l0.setProgress(g0Var.x1);
                    g0Var.k0.setProgress(g0Var.x1);
                    g0Var.P0.setTranslationY(org.telegram.messenger.g0.L(32.0f) * g0Var.x1);
                    if (zArr[0]) {
                        float f15 = g0Var.x1;
                        if (!z11) {
                            f15 = 1.0f - f15;
                        }
                        e0Var.setTranslationY(translationY - ((org.telegram.messenger.g0.L(40.0f) * f15) * (z11 ? 1 : -1)));
                    }
                    e0Var.invalidate();
                    if (view == g0Var.e1) {
                        g0Var.N0.invalidate();
                    }
                }
            });
            this.w1.a(new r(this, z10, i7));
            this.w1.h();
            if (z10) {
                d0 d0Var = this.q1;
                d0Var.setVisibility(0);
                d0Var.setSelectedColorIndex(sg.k0.e(this.z1).d());
            }
        }
    }

    @Override // tg.g1
    public final sg.k0 x() {
        return sg.k0.e(this.z1);
    }

    public final void x0(int i7) {
        e1 e1Var = this.e1;
        int i10 = 0;
        int i11 = 1;
        if (i7 != 1) {
            yg emojiButton = e1Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(wg.e, true);
            }
            ry ryVar = this.P1;
            if (ryVar != null) {
                this.Q1 = false;
                if (org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                    ryVar.setVisibility(8);
                }
            }
            if (i7 == 0) {
                this.T1 = 0;
            }
            p3 p3Var = ((vp0) this).Y1.L1;
            if (p3Var != null) {
                p3Var.a();
            }
            requestLayout();
            getHeight();
            return;
        }
        ry ryVar2 = this.P1;
        boolean z10 = ryVar2 != null && ryVar2.getVisibility() == 0;
        ry ryVar3 = this.P1;
        if (ryVar3 != null && ryVar3.d1 != j10.t0) {
            removeView(ryVar3);
            this.P1 = null;
        }
        if (this.P1 == null) {
            ry ryVar4 = new ry(null, true, false, false, getContext(), false, null, null, true, this.A1, false, false);
            this.P1 = ryVar4;
            ryVar4.V0 = true;
            ryVar4.setVisibility(8);
            if (org.telegram.messenger.g0.Q1()) {
                this.P1.setForseMultiwindowLayout(true);
            }
            this.P1.setDelegate(new a0(this));
            addView(this.P1);
        }
        this.P1.setVisibility(0);
        this.Q1 = true;
        ry ryVar5 = this.P1;
        if (this.U1 <= 0) {
            if (org.telegram.messenger.g0.Q1()) {
                this.U1 = org.telegram.messenger.g0.L(150.0f);
            } else {
                this.U1 = mp.f1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
            }
        }
        if (this.V1 <= 0) {
            if (org.telegram.messenger.g0.Q1()) {
                this.V1 = org.telegram.messenger.g0.L(150.0f);
            } else {
                this.V1 = mp.f1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
            }
        }
        Point point = org.telegram.messenger.g0.q;
        int i12 = point.x > point.y ? this.V1 : this.U1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ryVar5.getLayoutParams();
        layoutParams.height = i12;
        ryVar5.setLayoutParams(layoutParams);
        if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
            j jVar = this.C0;
            if (jVar instanceof m2) {
                org.telegram.messenger.g0.v1(((m2) jVar).getEditText());
            }
        }
        this.T1 = i12;
        requestLayout();
        p3 p3Var2 = ((vp0) this).Y1.L1;
        if (p3Var2 != null) {
            p3Var2.a();
        }
        yg emojiButton2 = e1Var.getEmojiButton();
        if (emojiButton2 != null) {
            emojiButton2.j(wg.d, true);
        }
        getHeight();
        if (z10 || this.R1) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.T1, 0.0f);
        ofFloat.addUpdateListener(new o(this, i11));
        ofFloat.addListener(new z(this, i10));
        ofFloat.start();
    }

    public final void y0(Runnable runnable, g0 g0Var, int i7, int i10, int i11) {
        org.telegram.ui.ActionBar.h1 h1Var = this.B1;
        if (h1Var != null && h1Var.isShowing()) {
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
            this.C1.setOnTouchListener(new j4(i12, this));
            this.C1.setDispatchKeyEventListener(new q(this));
            this.C1.setShownFromBottom(true);
        }
        this.C1.d();
        runnable.run();
        if (this.B1 == null) {
            org.telegram.ui.ActionBar.h1 h1Var2 = new org.telegram.ui.ActionBar.h1(this.C1, -2, -2);
            this.B1 = h1Var2;
            h1Var2.b = true;
            h1Var2.setAnimationStyle(R.style.PopupAnimation);
            this.B1.setOutsideTouchable(true);
            this.B1.setClippingEnabled(true);
            this.B1.setInputMethodMode(2);
            this.B1.setSoftInputMode(0);
            this.B1.getContentView().setFocusableInTouchMode(true);
            this.B1.setOnDismissListener(new l4(i12, this));
        }
        this.C1.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
        this.B1.setFocusable(true);
        this.B1.showAtLocation(g0Var, i7, i10 - (this.C1.getMeasuredWidth() / 2), i11 - this.C1.getMeasuredHeight());
        org.telegram.ui.ActionBar.h1.i(this.C1);
    }

    public final void z0(boolean z10) {
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
                j1 j1Var = this.f1;
                j1Var.setAlpha(0.0f);
                j1Var.setVisibility(0);
            }
            this.p1.b(new q7(3, this));
            this.p1.a(new r(this, z10, 0));
            this.p1.h();
        }
    }

    @Override // tg.h
    public final /* synthetic */ void B(boolean z10) {
    }

    @Override // tg.h
    public final /* synthetic */ void d(boolean z10) {
    }

    @Override // tg.h
    public final /* synthetic */ void e(boolean z10) {
    }

    @Override // tg.h
    public final /* synthetic */ void j(boolean z10) {
    }

    @Override // tg.h
    public final /* synthetic */ void C() {
    }

    @Override // tg.h
    public final /* synthetic */ void g() {
    }

    public View getView() {
        return this;
    }

    @Override // tg.h
    public final /* synthetic */ void h() {
    }

    @Override // tg.h
    public final /* synthetic */ void y() {
    }
}
