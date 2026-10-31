package qh;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.SystemClock;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.widget.OverScroller;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.g6;
import org.telegram.messenger.k6;
import org.telegram.messenger.k9;
import org.telegram.messenger.m5;
import org.telegram.messenger.sc;
import org.telegram.messenger.ui;
import org.telegram.messenger.us;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.y6;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.c11;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.s5;
import org.telegram.ui.Components.u41;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.f11;
import org.telegram.ui.web.v1;
import ph.h1;
import rh.v5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x0 extends View {
    public static int[] D9;
    public static int[] E9;
    public static int[] F9;
    public static String J9;
    public static f K9;
    public static volatile byte[] N9;
    public static int O9;
    public static int P9;
    public static int Q9;
    public boolean A0;
    public final Paint A1;
    public int A2;
    public int[] A3;
    public final float A4;
    public final boolean[] A5;
    public boolean A6;
    public final LinearGradient A7;
    public long A8;
    public final Rect[] A9;
    public float B0;
    public final Paint B1;
    public boolean B2;
    public final Paint B3;
    public final Paint B4;
    public int B5;
    public int B6;
    public final Paint B7;
    public float B8;
    public float C0;
    public final TextPaint C1;
    public float C2;
    public final RectF C3;
    public final Paint C4;
    public final LinearGradient C5;
    public final SweepGradient[] C6;
    public final Matrix C7;
    public float C8;
    public final long D;
    public float D0;
    public final TextPaint D1;
    public float D2;
    public boolean D3;
    public final RectF D4;
    public final Paint D5;
    public float D6;
    public final RectF[] D7;
    public float D8;
    public final Matrix E;
    public long E0;
    public final Path E1;
    public float E2;
    public float E3;
    public final float[] E4;
    public final Path E5;
    public float E6;
    public float E7;
    public float E8;
    public u0 F;
    public boolean F0;
    public final RectF F1;
    public long F2;
    public float F3;
    public final float[] F4;
    public final TextPaint F5;
    public float F6;
    public float F7;
    public float F8;
    public u0 G;
    public float G0;
    public Object G1;
    public long G2;
    public float G3;
    public final float[] G4;
    public Drawable G5;
    public float G6;
    public boolean G7;
    public float G8;
    public long H;
    public final TextPaint H0;
    public Object H1;
    public boolean H2;
    public float H3;
    public final float[] H4;
    public StaticLayout H5;
    public float H6;
    public int H7;
    public float H8;
    public final ArrayList I;
    public String I0;
    public int I1;
    public long I2;
    public float I3;
    public final float[] I4;
    public int I5;
    public float I6;
    public final RectF I7;
    public final Path I8;
    public final HashMap J;
    public String J0;
    public final Drawable J1;
    public float J2;
    public float J3;
    public final long[] J4;
    public final RectF J5;
    public float J6;
    public final HashMap J7;
    public final RectF J8;
    public float K;
    public boolean K0;
    public final Drawable K1;
    public float K2;
    public float K3;
    public int K4;
    public final RectF K5;
    public float K6;
    public final HashMap K7;
    public final RectF K8;
    public float L;
    public final e6 L0;
    public final Drawable L1;
    public float L2;
    public final t0 L3;
    public float L4;
    public final Path L5;
    public boolean L6;
    public int L7;
    public final RectF L8;
    public float M;
    public final float[] M0;
    public final Drawable M1;
    public long M2;
    public float M3;
    public float M4;
    public final float[] M5;
    public long M6;
    public int M7;
    public long M8;
    public float N;
    public final float[] N0;
    public final Drawable N1;
    public long N2;
    public float N3;
    public final Paint N4;
    public float N5;
    public SensorManager N6;
    public float N7;
    public boolean N8;
    public float O;
    public final float[] O0;
    public final Drawable O1;
    public String O2;
    public float O3;
    public final Paint O4;
    public final Matrix O5;
    public final s0 O6;
    public float O7;
    public Bitmap O8;
    public float P;
    public final float[] P0;
    public final Drawable P1;
    public float P2;
    public float P3;
    public final RectF P4;
    public final Matrix P5;
    public float P6;
    public int P7;
    public Bitmap P8;
    public float Q;
    public final float[] Q0;
    public final Drawable Q1;
    public long Q2;
    public float Q3;
    public float Q4;
    public final LinearGradient Q5;
    public float Q6;
    public int Q7;
    public final Paint Q8;
    public boolean R;
    public final float[] R0;
    public final Drawable R1;
    public Bitmap R2;
    public final Path R3;
    public float R4;
    public final LongSparseArray R5;
    public float R6;
    public long R7;
    public final Paint R8;
    public boolean S;
    public final float[] S0;
    public final Drawable S1;
    public final Paint S2;
    public Bitmap S3;
    public boolean S4;
    public final Path S5;
    public float S6;
    public long S7;
    public final RectF S8;
    public boolean T;
    public final float[] T0;
    public final org.telegram.ui.o0 T1;
    public boolean T2;
    public Bitmap T3;
    public boolean T4;
    public boolean T5;
    public long T6;
    public long T7;
    public int T8;
    public boolean U;
    public final float[] U0;
    public final Paint U1;
    public int U2;
    public float U3;
    public float U4;
    public final RectF U5;
    public long U6;
    public final float U7;
    public String U8;
    public long V;
    public final float[] V0;
    public final String V1;
    public boolean V2;
    public float V3;
    public boolean V4;
    public final RectF V5;
    public boolean V6;
    public int V7;
    public boolean V8;
    public long W;
    public final float[] W0;
    public final c2 W1;
    public long W2;
    public float W3;
    public Bitmap W4;
    public final RectF W5;
    public final Matrix W6;
    public long W7;
    public int W8;
    public final float[] X0;
    public final bi0 X1;
    public float X2;
    public final Paint X3;
    public int[] X4;
    public final LinearGradient X5;
    public final Path X6;
    public long X7;
    public long X8;
    public final float[] Y0;
    public final Paint Y1;
    public Bitmap Y2;
    public final int[] Y3;
    public int Y4;
    public final LinearGradient Y5;
    public final RectF Y6;
    public float Y7;
    public bi0 Y8;
    public final float[] Z0;
    public boolean Z1;
    public Bitmap Z2;
    public final int[] Z3;
    public final Paint Z4;
    public final Matrix Z5;
    public final Path Z6;
    public final RectF Z7;
    public bi0 Z8;
    public boolean a;
    public float a0;
    public final byte[] a1;
    public int a2;
    public BitmapShader a3;
    public final float[] a4;
    public final Rect a5;
    public final Paint a6;
    public final Path a7;
    public final TextPaint a8;
    public bi0 a9;
    public final int b;
    public float b0;
    public final boolean[] b1;
    public int b2;
    public final Paint b3;
    public final float[] b4;
    public final RectF b5;
    public float b6;
    public int b7;
    public final TextPaint b8;
    public Object b9;
    public final l2.f c;
    public float c0;
    public int c1;
    public final HashMap c2;
    public final Paint c3;
    public final float[] c4;
    public final int[] c5;
    public long c6;
    public final RectF c7;
    public final TextPaint c8;
    public float c9;
    public String d;
    public float d0;
    public boolean d1;
    public Runnable d2;
    public final Matrix d3;
    public final float[] d4;
    public final float[] d5;
    public long d6;
    public final Matrix d7;
    public TextPaint d8;
    public String d9;
    public String e;
    public float e0;
    public final Random e1;
    public boolean e2;
    public final RectF e3;
    public int e4;
    public final float[] e5;
    public boolean e6;
    public final SparseArray e7;
    public final TextPaint e8;
    public long e9;
    public String f;
    public float f0;
    public float f1;
    public boolean f2;
    public float f3;
    public float[] f4;
    public final float[] f5;
    public boolean f6;
    public final Drawable[] f7;
    public StaticLayout f8;
    public float f9;
    public float g0;
    public float g1;
    public Bitmap g2;
    public boolean g3;
    public float[] g4;
    public final float[] g5;
    public int g6;
    public final RectF g7;
    public int g8;
    public boolean g9;
    public boolean h;
    public float h0;
    public int h1;
    public final int[] h2;
    public boolean h3;
    public float[] h4;
    public final float[] h5;
    public int h6;
    public final RectF h7;
    public boolean h8;
    public float h9;
    public float i0;
    public float i1;
    public v5 i2;
    public int i3;
    public int i4;
    public final boolean[] i5;
    public int i6;
    public final RectF i7;
    public final String i8;
    public float i9;
    public float j0;
    public float j1;
    public final p0 j2;
    public final float[] j3;
    public int j4;
    public int j5;
    public float j6;
    public final RectF j7;
    public final String j8;
    public float j9;
    public VelocityTracker k0;
    public float k1;
    public final q0 k2;
    public final float[] k3;
    public PorterDuffColorFilter k4;
    public float k5;
    public float k6;
    public final RectF k7;
    public f5 k8;
    public final OverScroller k9;
    public float l0;
    public float l1;
    public boolean l2;
    public final int[] l3;
    public int l4;
    public float l5;
    public float l6;
    public boolean l7;
    public bi0 l8;
    public final ViewConfiguration l9;
    public float m0;
    public String m1;
    public long m2;
    public final int[] m3;
    public float m4;
    public StaticLayout m5;
    public float m6;
    public boolean m7;
    public long m8;
    public VelocityTracker m9;
    public v0 n;
    public float n0;
    public int n1;
    public long n2;
    public final float[] n3;
    public float n4;
    public boolean n5;
    public final float[] n6;
    public float n7;
    public boolean n8;
    public boolean n9;
    public float o0;
    public String o1;
    public long o2;
    public final float[] o3;
    public float o4;
    public final float[] o5;
    public final Paint o6;
    public float o7;
    public TLRPC.TL_inputStickerSetShortName o8;
    public boolean o9;
    public float p0;
    public String p1;
    public float p2;
    public float p3;
    public float p4;
    public final float[] p5;
    public float p6;
    public long p7;
    public TLRPC.Document p8;
    public final q0 p9;
    public int q0;
    public final RectF q1;
    public long q2;
    public final double[] q3;
    public float q4;
    public final float[] q5;
    public boolean q6;
    public boolean q7;
    public long q8;
    public final RippleDrawable[] q9;
    public v0 r;
    public long r0;
    public boolean r1;
    public final RectF r2;
    public final double[] r3;
    public float r4;
    public final float[] r5;
    public float r6;
    public float r7;
    public LinearGradient[] r8;
    public int r9;
    public float s;
    public final g s0;
    public float s1;
    public boolean s2;
    public final double[] s3;
    public final long[] s4;
    public final float[] s5;
    public boolean s6;
    public float s7;
    public int[] s8;
    public final Paint s9;
    public f t0;
    public float t1;
    public float t2;
    public int t3;
    public final float[] t4;
    public final float[] t5;
    public Object t6;
    public long t7;
    public final k9 t8;
    public final Path t9;
    public f u0;
    public long u1;
    public String u2;
    public int u3;
    public final float[] u4;
    public final float[] u5;
    public float u6;
    public final RectF u7;
    public int u8;
    public final float[] u9;
    public boolean v0;
    public final ArrayList v1;
    public String v2;
    public float v3;
    public final float[] v4;
    public final float[] v5;
    public int v6;
    public long v7;
    public int v8;
    public final float[] v9;
    public long w;
    public boolean w0;
    public long w1;
    public String w2;
    public float w3;
    public final float[] w4;
    public final float[] w5;
    public int w6;
    public float w7;
    public float w8;
    public final long[] w9;
    public float x;
    public boolean x0;
    public boolean x1;
    public String x2;
    public float x3;
    public final long[] x4;
    public final float[] x5;
    public final SparseIntArray x6;
    public float x7;
    public float x8;
    public final long[] x9;
    public float y;
    public boolean y0;
    public final HashMap y1;
    public final TextPaint y2;
    public boolean y3;
    public final boolean[] y4;
    public final float[] y5;
    public int y6;
    public float y7;
    public final RectF[] y8;
    public final float[] y9;
    public long z0;
    public final Paint z1;
    public String z2;
    public Bitmap z3;
    public final Paint z4;
    public final float[] z5;
    public boolean z6;
    public final RectF z7;
    public long z8;
    public final float[] z9;
    public static final String[] B9 = {"❤️", "🔥", "🎉", "😎", "🚀", "💎", "💙", "✨", "⭐", "🍀", "🐸", "🦄", "🌈", "🍕", "👻", "🍒", "🌸", "⚡", "🏆", "🎁", "👀", "😍", "🥳", "🤩", "🐱", "🐶", "🦋", "🌙", "☀️", "🍓", "🍩", "🎈", "🎮", "🎧", "💜", "🌊"};
    public static final float C9 = (float) Math.atan2(-5.5d, -3.5d);
    public static int G9 = a.b("Black");
    public static int H9 = a.b("Neon Blue");
    public static final int I9 = org.telegram.messenger.i0.L(70.0f);
    public static final float L9 = (float) Math.sin(Math.toRadians(18.0d));
    public static final float M9 = (float) Math.cos(Math.toRadians(18.0d));
    public static final gr R9 = new gr(0.16d, 1.0d, 0.3d, 1.0d);

    /* JADX WARN: Type inference failed for: r11v17, types: [qh.p0] */
    /* JADX WARN: Type inference failed for: r11v18, types: [qh.q0] */
    /* JADX WARN: Type inference failed for: r3v26, types: [qh.q0] */
    public x0(Context context, int i10, String str, String str2, boolean z10, l2.f fVar) {
        super(context);
        f fVar2;
        final int i11 = 1;
        this.a = true;
        this.s = 1.0f;
        this.D = AnimationUtils.currentAnimationTimeMillis();
        this.E = new Matrix();
        this.F = new u0();
        this.I = new ArrayList();
        this.J = new HashMap();
        Paint paint = new Paint(3);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        paint.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.M = -1.0f;
        this.s0 = new g();
        this.w0 = true;
        this.x0 = true;
        this.D0 = 0.0f;
        this.G0 = 1.0f;
        this.H0 = new TextPaint(1);
        this.I0 = "";
        this.J0 = "";
        this.M0 = new float[zs.r5];
        this.N0 = new float[zs.r5];
        this.O0 = new float[zs.r5];
        this.P0 = new float[zs.r5];
        this.Q0 = new float[zs.r5];
        this.R0 = new float[zs.r5];
        this.S0 = new float[zs.r5];
        this.T0 = new float[zs.r5];
        this.U0 = new float[zs.r5];
        this.V0 = new float[zs.r5];
        this.W0 = new float[zs.r5];
        this.X0 = new float[zs.r5];
        this.Y0 = new float[zs.r5];
        this.Z0 = new float[zs.r5];
        this.a1 = new byte[zs.r5];
        this.b1 = new boolean[zs.r5];
        this.e1 = new Random();
        final int i12 = 0;
        this.h1 = 0;
        this.q1 = new RectF();
        this.v1 = new ArrayList();
        this.y1 = new HashMap();
        this.z1 = new Paint(1);
        this.A1 = new Paint(1);
        this.B1 = new Paint(1);
        this.C1 = new TextPaint(1);
        this.D1 = new TextPaint(1);
        this.E1 = new Path();
        new Path();
        this.F1 = new RectF();
        this.I1 = -1;
        this.U1 = new Paint(1);
        this.V1 = cd.L0(2131746485, null);
        this.Y1 = new Paint(1);
        this.a2 = 1;
        this.c2 = new HashMap();
        this.h2 = new int[3];
        this.j2 = new us() { // from class: qh.p0
            @Override // org.telegram.messenger.us
            public final void didReceivedNotification(int i13, int i14, Object[] objArr) {
                if (objArr.length > 1) {
                    Object obj = objArr[1];
                    x0 x0Var = x0.this;
                    if (obj == x0Var.i2) {
                        x0Var.y0();
                    }
                }
            }
        };
        this.k2 = new Runnable(this) { // from class: qh.q0
            public final /* synthetic */ x0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TLRPC.Document document;
                int lastIndexOf;
                int L;
                switch (i12) {
                    case 0:
                        x0 x0Var = this.b;
                        ArrayList arrayList = x0Var.v1;
                        for (int i13 = 0; i13 < Math.min(arrayList.size(), 9); i13++) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i13);
                            ArrayList<TL_stars.StarGiftAttribute> arrayList2 = tL_starGiftUnique.attributes;
                            int size = arrayList2.size();
                            int i14 = 0;
                            while (i14 < size) {
                                TL_stars.StarGiftAttribute starGiftAttribute = arrayList2.get(i14);
                                i14++;
                                TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                                if ((starGiftAttribute2 instanceof TL_stars.starGiftAttributeModel) && (document = ((TL_stars.starGiftAttributeModel) starGiftAttribute2).document) != null) {
                                    x0Var.g0(tL_starGiftUnique.id, document);
                                }
                            }
                            x0Var.m1(tL_starGiftUnique);
                        }
                        break;
                    default:
                        x0 x0Var2 = this.b;
                        ArrayList arrayList3 = x0Var2.I;
                        if (x0Var2.f1 >= 0.5f && x0Var2.h1 == 1 && !x0Var2.o9) {
                            float f7 = x0Var2.h9;
                            float f10 = x0Var2.i9;
                            float width = (x0Var2.getWidth() - org.telegram.messenger.i0.L(28.0f)) / 6.0f;
                            float f11 = x0Var2.j1 + f10;
                            RectF rectF = x0Var2.u7;
                            float L2 = f11 - (rectF.top + org.telegram.messenger.i0.L(16.0f));
                            int i15 = -1;
                            if (L2 >= 0.0f && f7 >= org.telegram.messenger.i0.L(14.0f) && f10 >= rectF.top + org.telegram.messenger.i0.L(8.0f) && (L = (((int) (L2 / width)) * 6) + ((int) ((f7 - org.telegram.messenger.i0.L(14.0f)) / width))) >= 0 && L < 36) {
                                i15 = L;
                            }
                            if (i15 >= 0) {
                                String[] strArr = x0.B9;
                                if (arrayList3.contains(strArr[i15]) && (lastIndexOf = arrayList3.lastIndexOf(strArr[i15])) >= 0) {
                                    arrayList3.remove(lastIndexOf);
                                    x0Var2.c();
                                    x0Var2.i0();
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        };
        this.p2 = 1.0f;
        this.r2 = new RectF();
        TextPaint textPaint = new TextPaint(1);
        this.y2 = textPaint;
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        this.A2 = -1;
        this.E2 = -1.0f;
        this.L2 = -1.0f;
        this.N2 = -1L;
        this.O2 = "";
        this.P2 = -1.0f;
        this.S2 = new Paint(3);
        this.X2 = 1.0f;
        this.b3 = new Paint(2);
        this.c3 = new Paint(3);
        this.d3 = new Matrix();
        this.e3 = new RectF();
        this.j3 = new float[14];
        this.k3 = new float[14];
        this.l3 = new int[7];
        this.m3 = new int[7];
        this.n3 = new float[15];
        this.o3 = new float[15];
        this.p3 = -1.0f;
        this.q3 = new double[3];
        this.r3 = new double[3];
        this.s3 = new double[3];
        this.t3 = org.telegram.messenger.i0.m;
        this.u3 = org.telegram.messenger.i0.n;
        this.B3 = new Paint(2);
        this.C3 = new RectF();
        this.G3 = 5.0f;
        this.H3 = -0.7071f;
        this.I3 = 0.7071f;
        this.L3 = new t0();
        this.N3 = 1.0f;
        this.P3 = -1.0f;
        this.R3 = new Path();
        this.U3 = -1.0f;
        this.V3 = -1.0f;
        this.W3 = -1.0f;
        Paint paint2 = new Paint(2);
        this.X3 = paint2;
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode2));
        this.Y3 = new int[1024];
        this.Z3 = new int[1024];
        this.a4 = new float[1024];
        this.b4 = new float[1024];
        this.c4 = new float[1024];
        this.d4 = new float[1024];
        this.j4 = -1;
        this.l4 = -1;
        this.s4 = new long[2048];
        this.t4 = new float[2048];
        this.u4 = new float[2048];
        this.v4 = new float[2048];
        this.w4 = new float[2048];
        this.x4 = new long[2048];
        this.y4 = new boolean[2048];
        Paint paint3 = new Paint(2);
        this.z4 = paint3;
        paint3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.A4 = (float) Math.random();
        this.B4 = new Paint(2);
        this.C4 = new Paint(2);
        this.D4 = new RectF();
        this.E4 = new float[96];
        this.F4 = new float[96];
        this.G4 = new float[96];
        this.H4 = new float[96];
        this.I4 = new float[96];
        this.J4 = new long[96];
        this.N4 = new Paint(2);
        Paint paint4 = new Paint(2);
        this.O4 = paint4;
        paint4.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.P4 = new RectF();
        this.Q4 = 1.0f;
        this.R4 = 1.0f;
        this.T4 = true;
        this.U4 = 1.0f;
        this.Z4 = new Paint(2);
        this.a5 = new Rect();
        this.b5 = new RectF();
        this.c5 = new int[4];
        this.d5 = new float[4];
        this.e5 = new float[4];
        this.f5 = new float[zs.P3];
        this.g5 = new float[zs.P3];
        this.h5 = new float[zs.P3];
        this.i5 = new boolean[zs.P3];
        this.o5 = new float[zs.P3];
        this.p5 = new float[zs.P3];
        this.q5 = new float[zs.P3];
        this.r5 = new float[zs.P3];
        this.s5 = new float[zs.P3];
        this.t5 = new float[zs.P3];
        this.u5 = new float[zs.P3];
        this.v5 = new float[zs.P3];
        this.w5 = new float[zs.P3];
        this.x5 = new float[zs.P3];
        this.y5 = new float[zs.P3];
        this.z5 = new float[zs.P3];
        this.A5 = new boolean[zs.P3];
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -16777216, 0, tileMode);
        this.C5 = linearGradient;
        Paint paint5 = new Paint(1);
        this.D5 = paint5;
        paint5.setShader(linearGradient);
        paint5.setXfermode(new PorterDuffXfermode(mode2));
        this.E5 = new Path();
        this.F5 = new TextPaint(65);
        this.J5 = new RectF();
        this.K5 = new RectF();
        this.L5 = new Path();
        this.M5 = new float[7];
        this.O5 = new Matrix();
        this.P5 = new Matrix();
        this.Q5 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{16777215, -1, 16777215}, new float[]{0.0f, 0.88f, 1.0f}, tileMode);
        this.R5 = new LongSparseArray();
        this.S5 = new Path();
        this.U5 = new RectF();
        this.V5 = new RectF();
        this.W5 = new RectF();
        this.X5 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, 16777215, -1, tileMode);
        this.Y5 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -1, 16777215, tileMode);
        this.Z5 = new Matrix();
        this.a6 = new Paint();
        this.l6 = 0.85f;
        this.n6 = new float[zs.r5];
        Paint paint6 = new Paint();
        this.o6 = paint6;
        PorterDuff.Mode mode3 = PorterDuff.Mode.DST_IN;
        paint6.setXfermode(new PorterDuffXfermode(mode3));
        this.p6 = 1.0f;
        this.q6 = true;
        this.u6 = -1.0f;
        this.v6 = -1;
        this.x6 = new SparseIntArray();
        this.y6 = -1;
        this.B6 = -1;
        this.C6 = new SweepGradient[4];
        this.O6 = new s0(this);
        this.W6 = new Matrix();
        this.X6 = new Path();
        this.Y6 = new RectF();
        this.Z6 = new Path();
        this.a7 = new Path();
        this.b7 = -1;
        this.c7 = new RectF();
        this.d7 = new Matrix();
        this.e7 = new SparseArray();
        this.g7 = new RectF();
        this.h7 = new RectF();
        this.i7 = new RectF();
        this.j7 = new RectF();
        this.k7 = new RectF();
        this.n7 = 1.0f;
        this.o7 = 1.0f;
        this.r7 = 1.0f;
        this.s7 = 1.0f;
        this.u7 = new RectF();
        this.z7 = new RectF();
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{0, 805306368, -1627389952, -285212672, -16777216}, new float[]{0.0f, 0.25f, 0.5f, 0.75f, 1.0f}, tileMode);
        this.A7 = linearGradient2;
        Paint paint7 = new Paint();
        this.B7 = paint7;
        paint7.setXfermode(new PorterDuffXfermode(mode3));
        paint7.setShader(linearGradient2);
        this.C7 = new Matrix();
        this.D7 = new RectF[]{new RectF(), new RectF(), new RectF(), new RectF(), new RectF(), new RectF()};
        this.E7 = -1.0f;
        this.F7 = -1.0f;
        this.I7 = new RectF();
        this.J7 = new HashMap();
        this.K7 = new HashMap();
        this.L7 = -1;
        this.M7 = G9;
        this.P7 = -1;
        this.Q7 = -1;
        this.U7 = org.telegram.messenger.i0.L(20.17f);
        this.V7 = -1;
        this.X7 = -1L;
        this.Y7 = 1.0f;
        this.Z7 = new RectF();
        this.a8 = new TextPaint(1);
        this.b8 = new TextPaint(1);
        this.c8 = new TextPaint(1);
        TextPaint textPaint2 = new TextPaint(zs.N1);
        this.e8 = textPaint2;
        textPaint2.setXfermode(new PorterDuffXfermode(mode2));
        this.i8 = cd.L0(2131746507, null);
        this.j8 = cd.L0(2131746517, null);
        int[] iArr = a.b;
        this.r8 = new LinearGradient[iArr.length];
        this.s8 = new int[iArr.length];
        this.t8 = new k9(3);
        this.u8 = -100;
        this.v8 = -100;
        this.y8 = new RectF[]{new RectF(), new RectF(), new RectF()};
        this.I8 = new Path();
        this.J8 = new RectF();
        this.K8 = new RectF();
        this.L8 = new RectF();
        this.Q8 = new Paint(3);
        this.R8 = new Paint(1);
        this.S8 = new RectF();
        this.c9 = -1.0f;
        this.k9 = new OverScroller(getContext());
        this.l9 = ViewConfiguration.get(getContext());
        this.p9 = new Runnable(this) { // from class: qh.q0
            public final /* synthetic */ x0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TLRPC.Document document;
                int lastIndexOf;
                int L;
                switch (i11) {
                    case 0:
                        x0 x0Var = this.b;
                        ArrayList arrayList = x0Var.v1;
                        for (int i13 = 0; i13 < Math.min(arrayList.size(), 9); i13++) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i13);
                            ArrayList<TL_stars.StarGiftAttribute> arrayList2 = tL_starGiftUnique.attributes;
                            int size = arrayList2.size();
                            int i14 = 0;
                            while (i14 < size) {
                                TL_stars.StarGiftAttribute starGiftAttribute = arrayList2.get(i14);
                                i14++;
                                TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                                if ((starGiftAttribute2 instanceof TL_stars.starGiftAttributeModel) && (document = ((TL_stars.starGiftAttributeModel) starGiftAttribute2).document) != null) {
                                    x0Var.g0(tL_starGiftUnique.id, document);
                                }
                            }
                            x0Var.m1(tL_starGiftUnique);
                        }
                        break;
                    default:
                        x0 x0Var2 = this.b;
                        ArrayList arrayList3 = x0Var2.I;
                        if (x0Var2.f1 >= 0.5f && x0Var2.h1 == 1 && !x0Var2.o9) {
                            float f7 = x0Var2.h9;
                            float f10 = x0Var2.i9;
                            float width = (x0Var2.getWidth() - org.telegram.messenger.i0.L(28.0f)) / 6.0f;
                            float f11 = x0Var2.j1 + f10;
                            RectF rectF = x0Var2.u7;
                            float L2 = f11 - (rectF.top + org.telegram.messenger.i0.L(16.0f));
                            int i15 = -1;
                            if (L2 >= 0.0f && f7 >= org.telegram.messenger.i0.L(14.0f) && f10 >= rectF.top + org.telegram.messenger.i0.L(8.0f) && (L = (((int) (L2 / width)) * 6) + ((int) ((f7 - org.telegram.messenger.i0.L(14.0f)) / width))) >= 0 && L < 36) {
                                i15 = L;
                            }
                            if (i15 >= 0) {
                                String[] strArr = x0.B9;
                                if (arrayList3.contains(strArr[i15]) && (lastIndexOf = arrayList3.lastIndexOf(strArr[i15])) >= 0) {
                                    arrayList3.remove(lastIndexOf);
                                    x0Var2.c();
                                    x0Var2.i0();
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        };
        this.q9 = new RippleDrawable[12];
        ColorStateList.valueOf(738197503);
        ColorStateList.valueOf(335544320);
        this.r9 = -1;
        this.s9 = new Paint(1);
        this.t9 = new Path();
        this.u9 = new float[12];
        this.v9 = new float[12];
        this.w9 = new long[12];
        this.x9 = new long[12];
        this.y9 = new float[12];
        this.z9 = new float[12];
        this.A9 = new Rect[12];
        for (int i13 = 0; i13 < 12; i13++) {
            this.A9[i13] = new Rect();
        }
        this.b = i10;
        this.d = str;
        this.f = str2;
        this.h = z10;
        this.c = fVar;
        this.L1 = w(R.drawable.msg_share);
        this.M1 = w(R.drawable.msg_download);
        this.N1 = w(R.drawable.msg_qr_scan);
        this.U1.setTypeface(org.telegram.messenger.i0.o());
        Drawable w9 = w(R.drawable.msg_colors);
        this.O1 = w9;
        Drawable w10 = w(R.drawable.input_smile);
        this.P1 = w10;
        Drawable w11 = w(R.drawable.menu_gift);
        this.Q1 = w11;
        this.W1 = new c2(true);
        this.R1 = w(R.drawable.msg_retry);
        this.S1 = w(R.drawable.msg_recent);
        this.T1 = new org.telegram.ui.o0();
        this.J1 = w(R.drawable.msg_copy);
        this.K1 = w(R.drawable.menu_premium_main);
        this.f7 = new Drawable[]{w9, w10, w11};
        bi0 bi0Var = new bi0(R.raw.plane_logo_plain, org.telegram.messenger.i0.L(60.0f), org.telegram.messenger.i0.L(60.0f), false, null);
        this.X1 = bi0Var;
        bi0Var.R(this);
        bi0Var.K(1);
        bi0Var.setCallback(this);
        bi0Var.start();
        Paint paint8 = this.Y1;
        Paint.Style style = Paint.Style.STROKE;
        paint8.setStyle(style);
        this.Y1.setStrokeCap(Paint.Cap.ROUND);
        this.Y1.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.C1.setTextSize(org.telegram.messenger.i0.L(11.0f));
        this.D1.setTypeface(org.telegram.messenger.i0.o());
        this.A1.setStyle(style);
        e6 e6Var = new e6(false, true, true);
        this.L0 = e6Var;
        e6Var.w(org.telegram.messenger.i0.L(11.0f));
        e6Var.n(0.35f, 280L, gr.h);
        e6Var.setCallback(this);
        e6Var.b = 3;
        v0 t10 = t(G9);
        this.n = t10;
        this.b7 = W0(t10.c);
        if (str != null) {
            String str3 = this.d;
            if (!str3.equals(J9) || (fVar2 = K9) == null) {
                f c10 = g.c(str3, org.telegram.messenger.i0.L(240.0f), ac.d.c, 0.75f, null);
                this.t0 = c10;
                K9 = c10;
                J9 = str3;
            } else {
                this.t0 = fVar2;
            }
            this.s0.a(this.t0);
        }
        u1(false);
    }

    public static void C0(double d, double d10, double d11, double[] dArr) {
        double d12 = (0.2158037573d * d11) + (0.3963377774d * d10) + d;
        double d13 = (d - (0.1055613458d * d10)) - (0.0638541728d * d11);
        double d14 = (d - (d10 * 0.0894841775d)) - (d11 * 1.291485548d);
        double d15 = d12 * d12 * d12;
        double d16 = d13 * d13 * d13;
        double d17 = d14 * d14 * d14;
        dArr[0] = (0.2309699292d * d17) + ((4.0767416621d * d15) - (3.3077115913d * d16));
        dArr[1] = ((2.6097574011d * d16) + ((-1.2684380046d) * d15)) - (0.3413193965d * d17);
        dArr[2] = (d17 * 1.707614701d) + ((d15 * (-0.0041960863d)) - (d16 * 0.7034186147d));
    }

    public static int D0(float f7, float f10, float f11, int i10) {
        float i12 = i1(Color.red(i10));
        float i13 = i1(Color.green(i10));
        float i14 = i1(Color.blue(i10));
        float cbrt = (float) Math.cbrt((0.051445995f * i14) + (0.53633255f * i13) + (0.41222146f * i12));
        float cbrt2 = (float) Math.cbrt((0.10739696f * i14) + (0.6806995f * i13) + (0.2119035f * i12));
        float cbrt3 = (float) Math.cbrt((i14 * 0.6299787f) + (i13 * 0.28171885f) + (i12 * 0.08830246f));
        float f12 = (0.4505937f * cbrt3) + ((1.9779985f * cbrt) - (2.4285922f * cbrt2));
        float f13 = ((cbrt2 * 0.78277177f) + (cbrt * 0.025904037f)) - (cbrt3 * 0.80867577f);
        float hypot = (float) Math.hypot(f12, f13);
        float min = hypot > 1.0E-5f ? Math.min(f11, f10 * hypot) / hypot : 0.0f;
        float f14 = f12 * min;
        float f15 = f13 * min;
        float f16 = (0.21580376f * f15) + (0.39633778f * f14) + f7;
        float f17 = (f7 - (0.105561346f * f14)) - (0.06385417f * f15);
        float f18 = (f7 - (f14 * 0.08948418f)) - (f15 * 1.2914855f);
        float f19 = f16 * f16 * f16;
        float f20 = f17 * f17 * f17;
        float f21 = f18 * f18 * f18;
        return Color.rgb(w0((0.23096994f * f21) + ((4.0767417f * f19) - (3.3077116f * f20))), w0(((2.6097574f * f20) + ((-1.268438f) * f19)) - (0.34131938f * f21)), w0((f21 * 1.7076147f) + ((f19 * (-0.0041960864f)) - (f20 * 0.7034186f))));
    }

    public static float S(float f7, float f10) {
        float f11 = f7 - 1.0f;
        return c3.i0.u(f10, f11, f11, ((f10 + 1.0f) * f11 * f11 * f11) + 1.0f);
    }

    public static int W0(int i10) {
        double[] dArr = new double[3];
        double[] dArr2 = new double[3];
        o1(i10, dArr);
        double hypot = Math.hypot(dArr[1], dArr[2]);
        if (hypot < 0.03d) {
            return -1;
        }
        b0(0.96d, Math.min(0.06d, hypot * 0.7d), Math.atan2(dArr[2], dArr[1]), dArr2);
        return Color.rgb((int) Math.round(r(d0(r(dArr2[0]))) * 255.0d), (int) Math.round(r(d0(r(dArr2[1]))) * 255.0d), (int) Math.round(r(d0(r(dArr2[2]))) * 255.0d));
    }

    public static int Z0(int i10) {
        double[] dArr = new double[3];
        i0.b.j(i10, dArr);
        return i0.b.o(i0.b.b(Math.min(96.0d, dArr[0] + 24.0d), dArr[1] * 0.75d, dArr[2] * 0.75d), 26);
    }

    public static int a(float f7, int i10) {
        return i0.b.o(i10, (int) (Utilities.l(f7) * Color.alpha(i10)));
    }

    public static void b0(double d, double d10, double d11, double[] dArr) {
        double cos = Math.cos(d11);
        double sin = Math.sin(d11);
        C0(d, d10 * cos, d10 * sin, dArr);
        if (p0(dArr)) {
            return;
        }
        double d12 = 0.0d;
        double d13 = d10;
        for (int i10 = 0; i10 < 14; i10++) {
            double d14 = (d12 + d13) / 2.0d;
            C0(d, d14 * cos, d14 * sin, dArr);
            if (p0(dArr)) {
                d12 = d14;
            } else {
                d13 = d14;
            }
        }
        C0(d, d12 * cos, d12 * sin, dArr);
    }

    public static float c0(double d) {
        return (float) (d - Math.floor(d));
    }

    public static double d0(double d) {
        return d <= 0.0031308d ? d * 12.92d : (Math.pow(d, 0.4166666666666667d) * 1.055d) - 0.055d;
    }

    public static int e1(int i10) {
        if (a.h != null) {
            return i10;
        }
        if (a.g == null) {
            int length = a.a.length;
            int[] iArr = new int[length];
            boolean[] zArr = new boolean[length];
            int i11 = 0;
            for (int i12 = 0; i12 < 80; i12++) {
                int b10 = a.b(a.f[i12]);
                if (b10 >= 0 && !zArr[b10]) {
                    zArr[b10] = true;
                    iArr[i11] = b10;
                    i11++;
                }
            }
            for (int i13 = 0; i13 < length; i13++) {
                if (!zArr[i13]) {
                    iArr[i11] = i13;
                    i11++;
                }
            }
            a.g = iArr;
        }
        return a.g[i10];
    }

    public static float f1(boolean z10, boolean z11, float f7) {
        if (!z10) {
            if (!z11) {
                f7 -= 0.135f;
            }
            if (f7 <= 0.0f) {
                return 0.0f;
            }
            if (f7 < 0.315f) {
                return h(f7 / 0.315f);
            }
        } else if (f7 > 0.0f) {
            return f1.v(f7, 0.18f, 1.0f, 0.0f);
        }
        return 1.0f;
    }

    public static int g(float f7, int i10) {
        return (((int) (Math.max(0.0f, Math.min(1.0f, f7)) * 255.0f)) << 24) | (i10 & 16777215);
    }

    public static float g1(float f7, float f10, float f11) {
        float l4 = Utilities.l((f11 - f7) / (f10 - f7));
        return c3.i0.D(l4, 2.0f, 3.0f, l4 * l4);
    }

    public static float h(float f7) {
        float f10 = f7 - 1.0f;
        return c3.i0.u(f10, 1.70158f, f10, (2.70158f * f10 * f10 * f10) + 1.0f);
    }

    public static double h1(double d, double d10, double d11) {
        if (d <= 0.0d) {
            return 0.0d;
        }
        double d12 = 6.283185307179586d / d11;
        double d13 = 1.0d - (d10 * d10);
        double sqrt = Math.sqrt(d13) * d12;
        double d14 = sqrt * d;
        return 1.0d - (((Math.sin(d14) * (d10 / Math.sqrt(d13))) + Math.cos(d14)) * Math.exp(((-d10) * d12) * d));
    }

    public static boolean i() {
        return u.f() && sc.e(256);
    }

    public static float i1(int i10) {
        float f7 = i10 / 255.0f;
        return f7 <= 0.04045f ? f7 / 12.92f : (float) Math.pow((f7 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static float j(long j10, float f7, float f10) {
        if (j10 == 0) {
            return 1.0f;
        }
        float currentAnimationTimeMillis = (AnimationUtils.currentAnimationTimeMillis() - j10) / 320.0f;
        if (currentAnimationTimeMillis <= 0.0f || currentAnimationTimeMillis >= 1.0f) {
            return 1.0f;
        }
        if (currentAnimationTimeMillis < 0.25f) {
            return (f7 * ((float) Math.sin((currentAnimationTimeMillis * 1.5707963267948966d) / 0.25d))) + 1.0f;
        }
        if (currentAnimationTimeMillis < 0.6f) {
            float f11 = (currentAnimationTimeMillis - 0.25f) / 0.35f;
            return org.telegram.messenger.i0.T1(f7 + 1.0f, 1.0f - f10, c3.i0.D(f11, 2.0f, 3.0f, f11 * f11));
        }
        float f12 = (currentAnimationTimeMillis - 0.6f) / 0.4f;
        return org.telegram.messenger.i0.T1(1.0f - f10, 1.0f, c3.i0.D(f12, 2.0f, 3.0f, f12 * f12));
    }

    public static void k() {
        if (D9 != null) {
            return;
        }
        int length = a.b.length;
        D9 = new int[length];
        E9 = new int[length];
        F9 = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            D9[i10] = x(a.b[i10], false);
            E9[i10] = x(a.c[i10], true);
            F9[i10] = v(D9[i10], E9[i10]);
        }
    }

    public static float k0(int i10, int i11, int i12) {
        int i13 = (i12 * 1442695041) + (i11 * 668265263) + (i10 * 374761393);
        int i14 = ((i13 >>> 13) ^ i13) * 1274126177;
        return ((i14 ^ (i14 >>> 16)) & 65535) / 65535.0f;
    }

    public static int l1(int i10, int i11) {
        int i12 = i10 | (-16777216);
        int i13 = i11 | (-16777216);
        if (i0.b.g(i12, i13) < 1.15d) {
            double[] dArr = new double[3];
            i0.b.j(i12, dArr);
            for (int i14 = 0; i14 < 40 && i0.b.g(i12, i13) < 1.15d; i14++) {
                double max = Math.max(0.0d, dArr[0] - 2.0d);
                dArr[0] = max;
                i12 = i0.b.b(max, dArr[1], dArr[2]);
            }
        }
        return i0.b.o(i12, 95);
    }

    public static boolean m0(RectF rectF, float f7, float f10) {
        float L = org.telegram.messenger.i0.L(8.0f);
        return !rectF.isEmpty() && f7 >= rectF.left - L && f7 <= rectF.right + L && f10 >= rectF.top - L && f10 <= rectF.bottom + L;
    }

    public static void o1(int i10, double[] dArr) {
        double v02 = v0(Color.red(i10) / 255.0d);
        double v03 = v0(Color.green(i10) / 255.0d);
        double v04 = v0(Color.blue(i10) / 255.0d);
        double cbrt = Math.cbrt((0.0514459929d * v04) + (0.5363325363d * v03) + (0.4122214708d * v02));
        double cbrt2 = Math.cbrt((0.1073969566d * v04) + (0.6806995451d * v03) + (0.2119034982d * v02));
        double cbrt3 = Math.cbrt((v04 * 0.6299787005d) + (v03 * 0.2817188376d) + (v02 * 0.0883024619d));
        dArr[0] = ((0.793617785d * cbrt2) + (0.2104542553d * cbrt)) - (0.0040720468d * cbrt3);
        dArr[1] = (0.4505937099d * cbrt3) + ((1.9779984951d * cbrt) - (2.428592205d * cbrt2));
        dArr[2] = ((cbrt2 * 0.7827717662d) + (cbrt * 0.0259040371d)) - (cbrt3 * 0.808675766d);
    }

    public static boolean p0(double[] dArr) {
        double d = dArr[0];
        if (d >= -1.0E-4d && d <= 1.0001d) {
            double d10 = dArr[1];
            if (d10 >= -1.0E-4d && d10 <= 1.0001d) {
                double d11 = dArr[2];
                if (d11 >= -1.0E-4d && d11 <= 1.0001d) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Bitmap q0(Bitmap bitmap, Bitmap bitmap2, int i10) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i11 = width * height;
        int[] iArr = new int[i11];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int i12 = 16777215 & i10;
        int i13 = i10 >>> 24;
        for (int i14 = 0; i14 < i11; i14++) {
            iArr[i14] = ((((iArr[i14] >>> 24) * i13) / zs.e4) << 24) | i12;
        }
        if (bitmap2 == null || !bitmap2.isMutable() || bitmap2.getWidth() != width || bitmap2.getHeight() != height) {
            bitmap2 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        }
        Bitmap bitmap3 = bitmap2;
        bitmap3.setPixels(iArr, 0, width, 0, 0, width, height);
        bitmap3.setHasMipMap(bitmap.hasMipMap());
        return bitmap3;
    }

    public static double r(double d) {
        if (d < 0.0d) {
            return 0.0d;
        }
        if (d > 1.0d) {
            return 1.0d;
        }
        return d;
    }

    public static Bitmap r0(u0 u0Var, Bitmap bitmap, boolean z10) {
        if (z10) {
            Bitmap bitmap2 = u0Var.m;
            if (bitmap2 == null || u0Var.n != bitmap || u0Var.p != u0Var.j) {
                u0Var.m = q0(bitmap, bitmap2, u0Var.j);
                u0Var.n = bitmap;
                u0Var.p = u0Var.j;
            }
            return u0Var.m;
        }
        Bitmap bitmap3 = u0Var.k;
        if (bitmap3 == null || u0Var.l != bitmap || u0Var.o != u0Var.j) {
            u0Var.k = q0(bitmap, bitmap3, u0Var.j);
            u0Var.l = bitmap;
            u0Var.o = u0Var.j;
        }
        return u0Var.k;
    }

    public static void s(int[] iArr, byte[] bArr, int i10) {
        int i11 = 16777215 & i10;
        int i12 = i10 >>> 24;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            iArr[i13] = ((((bArr[i13] & zs.e4) * i12) / zs.e4) << 24) | i11;
        }
    }

    private void setPattern(u0 u0Var) {
        if (!this.f2) {
            u0Var.h = this.s < 1.0f && this.r != null;
            if (u0Var.a == 2) {
                Z(u0Var);
                if (u0Var.e == null) {
                    u0Var.f = this.g2;
                }
            }
            u0 u0Var2 = this.G;
            if (u0Var2 != null && u0Var2 != this.F) {
                P0(u0Var2);
            }
            this.G = this.F;
            this.F = u0Var;
            this.H = AnimationUtils.currentAnimationTimeMillis();
            invalidate();
            return;
        }
        u0 u0Var3 = this.G;
        if (u0Var3 != null && u0Var3 != this.F) {
            P0(u0Var3);
        }
        u0 u0Var4 = this.F;
        if (u0Var4 != u0Var) {
            P0(u0Var4);
        }
        this.G = null;
        this.F = u0Var;
        if (u0Var.a == 2) {
            Z(u0Var);
            if (u0Var.e == null) {
                u0Var.f = this.g2;
            }
        }
        this.H = AnimationUtils.currentAnimationTimeMillis() - 10000;
        invalidate();
    }

    private void setSceneFromCard(v0 v0Var) {
        Y0(v0Var, getWidth() / 2.0f, (l() / 2.0f) + m());
        if (this.f2) {
            return;
        }
        this.p2 = j(this.n2, 0.03f, 0.005f);
        this.n2 = AnimationUtils.currentAnimationTimeMillis();
    }

    public static v0 t(int i10) {
        v0 v0Var = new v0();
        v0Var.a = 0;
        v0Var.f = i10;
        if (i10 == H9) {
            v0Var.b = -12602881;
            v0Var.c = -15308082;
            v0Var.d = a.d[i10];
        } else {
            v0Var.b = x(a.b[i10], false);
            v0Var.c = x(a.c[i10], true);
            v0Var.d = a.d[i10];
        }
        if (i10 == H9) {
            v0Var.e = -16747023;
        } else {
            k();
            v0Var.e = F9[i10];
        }
        v0Var.h = Z0(v0Var.b);
        v0Var.g = g.k(0.5f, v0Var.b, v0Var.c);
        return v0Var;
    }

    public static float t1(float f7, float f10, float f11) {
        float N = (f7 - f11) / org.telegram.messenger.i0.N(1.7f);
        float N2 = f10 / org.telegram.messenger.i0.N(3.2f);
        return org.telegram.messenger.i0.N(3.6f) * (((w1(N * 2.6f, N2 * 1.7f, 91) * 0.32f) + (w1(N, N2, 17) * 0.68f)) - 0.5f);
    }

    public static int u(v0 v0Var) {
        int f7 = v0Var != null ? i0.b.f(0.5f, v0Var.b, v0Var.c) : -16777216;
        double h = v0Var != null ? i0.b.h(v0Var.b) : 0.3d;
        float[] fArr = y0.b;
        float max = (fArr[10] / 100.0f) * ((float) Math.max(0.0d, Math.min(1.0d, (0.85d - h) / 0.45d)));
        float f10 = (fArr[11] / 100.0f) + 1.0f;
        float f11 = ((0.5f - (f10 * 0.5f)) + max) * 255.0f;
        return i0.b.k(v0Var != null ? v0Var.h : TLObject.FLAG_30, i0.b.k(g((fArr[3] + fArr[9]) / 100.0f, 16777215), Color.rgb(Math.max(0, Math.min(zs.e4, Math.round((Color.red(f7) * f10) + f11))), Math.max(0, Math.min(zs.e4, Math.round((Color.green(f7) * f10) + f11))), Math.max(0, Math.min(zs.e4, Math.round((f10 * Color.blue(f7)) + f11))))));
    }

    public static double u0(int i10, int i11) {
        long j10 = (i11 * (-4417276706812531889L)) ^ (i10 * (-7046029254386353131L));
        long j11 = (j10 ^ (j10 >>> 31)) * (-4658895280553007687L);
        long j12 = (j11 ^ (j11 >>> 27)) * (-7723592293110705685L);
        return ((j12 ^ (j12 >>> 31)) >>> 11) / 9.007199254740992E15d;
    }

    public static int v(int i10, int i11) {
        double d;
        double atan2;
        double min;
        double[] dArr = new double[3];
        double[] dArr2 = new double[3];
        double[] dArr3 = new double[3];
        o1(i11, dArr);
        o1(i10, dArr2);
        double d10 = dArr[0];
        double d11 = d10 < 0.45d ? d10 - 0.03d : 2.0d;
        double hypot = Math.hypot(dArr[1], dArr[2]);
        if (hypot < 0.03d) {
            double d12 = (dArr[1] * 0.6d) + (dArr2[1] * 0.4d);
            double d13 = (dArr[2] * 0.6d) + (dArr2[2] * 0.4d);
            atan2 = Math.atan2(d13, d12);
            d = 2.0d;
            min = Math.min(0.012d, Math.hypot(d12, d13));
        } else {
            d = 2.0d;
            atan2 = Math.atan2(dArr[2], dArr[1]);
            min = Math.min((hypot * 1.25d) + 0.02d, 0.2d);
        }
        double d14 = 0.9d;
        double d15 = 0.2d;
        int i12 = 0;
        while (i12 < 12) {
            double d16 = (d15 + d14) / d;
            double d17 = atan2;
            double d18 = min;
            b0(d16, d18, d17, dArr3);
            if (1.05d / (((r(dArr3[2]) * 0.0722d) + ((r(dArr3[1]) * 0.7152d) + (r(dArr3[0]) * 0.2126d))) + 0.05d) > 4.4d) {
                d15 = d16;
            } else {
                d14 = d16;
            }
            i12++;
            min = d18;
            atan2 = d17;
        }
        double d19 = atan2;
        double d20 = min;
        double d21 = (d15 + d14) / d;
        if (d21 > d11) {
            d21 = Math.max(0.05d, d11);
        }
        b0(d21, d20, d19, dArr3);
        return Color.rgb((int) Math.round(r(d0(r(dArr3[0]))) * 255.0d), (int) Math.round(r(d0(r(dArr3[1]))) * 255.0d), (int) Math.round(r(d0(r(dArr3[2]))) * 255.0d));
    }

    public static double v0(double d) {
        return d <= 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
    }

    public static float v1(float f7) {
        int floor = (int) Math.floor(f7);
        float f10 = f7 - floor;
        float D = c3.i0.D(f10, 2.0f, 3.0f, f10 * f10);
        float c02 = c0(Math.sin(floor * 127.1d) * 43758.5453d);
        return ((c0(Math.sin((floor + 1) * 127.1d) * 43758.5453d) - c02) * D) + c02;
    }

    public static int w0(float f7) {
        float max = Math.max(0.0f, Math.min(1.0f, f7));
        return Math.round(Math.max(0.0f, Math.min(1.0f, max <= 0.0031308f ? max * 12.92f : (((float) Math.pow(max, 0.4166666567325592d)) * 1.055f) - 0.055f)) * 255.0f);
    }

    public static float w1(float f7, float f10, int i10) {
        int floor = (int) Math.floor(f7);
        int floor2 = (int) Math.floor(f10);
        float f11 = f7 - floor;
        float f12 = f10 - floor2;
        float D = c3.i0.D(f11, 2.0f, 3.0f, f11 * f11);
        float D2 = c3.i0.D(f12, 2.0f, 3.0f, f12 * f12);
        float k02 = k0(floor, floor2, i10);
        int i11 = floor + 1;
        float k03 = k0(i11, floor2, i10);
        int i12 = floor2 + 1;
        float k04 = k0(floor, i12, i10);
        float k05 = k0(i11, i12, i10);
        float z10 = c3.i0.z(k03, k02, D, k02);
        return (((((k05 - k04) * D) + k04) - z10) * D2) + z10;
    }

    public static int x(int i10, boolean z10) {
        double[] dArr = new double[3];
        i0.b.j(i10, dArr);
        if (!z10) {
            return i10;
        }
        double max = Math.max(0.0d, dArr[0] - 3.0d);
        dArr[0] = max;
        double d = dArr[1] * 1.03d;
        dArr[1] = d;
        double d10 = dArr[2] * 1.03d;
        dArr[2] = d10;
        return i0.b.b(max, d, d10);
    }

    public static PorterDuffColorFilter x0(u0 u0Var) {
        float[] fArr = y0.b;
        int i10 = ((int) (fArr[14] * 10.0f)) ^ u0Var.s;
        if (u0Var.u == null || u0Var.t != i10) {
            u0Var.t = i10;
            u0Var.u = new PorterDuffColorFilter(i0.b.f(fArr[14] / 100.0f, u0Var.s, -1), PorterDuff.Mode.SRC_IN);
        }
        return u0Var.u;
    }

    public static float y1(float f7) {
        return 1.0f - ((float) Math.pow(1.0f - f7, 2.4000000953674316d));
    }

    /* JADX WARN: Code restructure failed: missing block: B:255:0x0250, code lost:
    
        if (r4 > 1500) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0857  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0a51  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0815  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0616  */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15, types: [int] */
    /* JADX WARN: Type inference failed for: r15v37 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(Canvas canvas, int i10) {
        int i11;
        int i12;
        Bitmap bitmap;
        float f7;
        int i13;
        float f10;
        long currentTimeMillis;
        float l4;
        float f11;
        float u10;
        float f12;
        int i14;
        TextPaint textPaint;
        StaticLayout staticLayout;
        String str;
        int i15;
        float f13;
        int i16;
        StaticLayout staticLayout2;
        float f14;
        float f15;
        float f16;
        int i17;
        int i18;
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        float f17;
        int i19;
        float pow;
        float[] fArr4;
        int i20;
        int i21;
        float[] fArr5;
        RectF rectF;
        float f18;
        char c10;
        float f19;
        float f20;
        boolean z10;
        int i22;
        boolean[] zArr;
        int i23;
        int i24;
        int i25;
        Canvas canvas2 = canvas;
        canvas2.save();
        float T1 = this.Q4 >= 1.0f ? 1.0f : this.T4 ? org.telegram.messenger.i0.T1(0.9f, 1.0f, this.U4) : org.telegram.messenger.i0.T1(0.92f, 1.0f, this.U4);
        float l10 = 1.0f - (this.n2 == 0 ? 1.0f : Utilities.l((AnimationUtils.currentAnimationTimeMillis() - this.n2) / 320.0f));
        float j10 = (((this.p2 - 1.0f) * l10 * l10) + j(this.n2, 0.03f, 0.005f)) * T1;
        if (this.r0 != 0) {
            float currentAnimationTimeMillis = (AnimationUtils.currentAnimationTimeMillis() - this.r0) / 360.0f;
            if (currentAnimationTimeMillis >= 1.0f) {
                this.r0 = 0L;
            } else if (currentAnimationTimeMillis > 0.0f) {
                j10 *= 1.0f - ((1.0f - (currentAnimationTimeMillis * 0.3f)) * (((float) Math.sin(currentAnimationTimeMillis * 3.141592653589793d)) * 0.03f));
            }
        }
        float f21 = i10;
        canvas2.scale(j10, j10, f21 / 2.0f, (l() / 2.0f) + m());
        float width = getWidth() * 0.745f;
        float l11 = l();
        float f22 = (f21 - width) / 2.0f;
        float m10 = m();
        float f23 = f22 + width;
        float f24 = l11 + m10;
        this.F1.set(f22, m10, f23, f24);
        this.B1.setColor(-1);
        RectF rectF2 = this.F1;
        int o10 = i0.b.o(i0.b.f(0.4f, N0(), -16777216), 16);
        Bitmap bitmap2 = this.W4;
        int i26 = 3;
        if (bitmap2 == null) {
            K0();
            i11 = 0;
            i12 = 1;
        } else {
            i11 = 0;
            byte[] bArr = N9;
            int i27 = O9;
            i12 = 1;
            if (o10 != this.Y4) {
                this.Y4 = o10;
                s(this.X4, bArr, o10);
                bitmap2.setPixels(this.X4, 0, i27, 0, 0, i27, i27);
                bitmap = bitmap2;
            } else {
                bitmap = bitmap2;
            }
            float f25 = P9 * 4.0f;
            float f26 = Q9 * 4.0f;
            float L = org.telegram.messenger.i0.L(4.0f);
            int[] iArr = this.c5;
            iArr[0] = 0;
            int i28 = Q9;
            iArr[1] = i28;
            iArr[2] = i27 - i28;
            iArr[3] = i27;
            float[] fArr6 = this.d5;
            float f27 = rectF2.left - f25;
            fArr6[0] = f27;
            fArr6[1] = f27 + f26;
            float f28 = rectF2.right + f25;
            fArr6[3] = f28;
            fArr6[2] = f28 - f26;
            float[] fArr7 = this.e5;
            float f29 = (rectF2.top - f25) + L;
            fArr7[0] = f29;
            fArr7[1] = f29 + f26;
            float f30 = rectF2.bottom + f25 + L;
            fArr7[3] = f30;
            fArr7[2] = f30 - f26;
            for (int i29 = 0; i29 < i26; i29++) {
                int i30 = 0;
                while (i30 < i26) {
                    Rect rect = this.a5;
                    int[] iArr2 = this.c5;
                    int i31 = i30 + 1;
                    int i32 = i26;
                    int i33 = i29 + 1;
                    rect.set(iArr2[i30], iArr2[i29], iArr2[i31], iArr2[i33]);
                    RectF rectF3 = this.b5;
                    float[] fArr8 = this.d5;
                    float f31 = fArr8[i30];
                    float[] fArr9 = this.e5;
                    rectF3.set(f31, fArr9[i29], fArr8[i31], fArr9[i33]);
                    canvas2.drawBitmap(bitmap, this.a5, this.b5, this.Z4);
                    i30 = i31;
                    i26 = i32;
                }
            }
        }
        int i34 = i26;
        canvas2.drawRoundRect(this.F1, org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(30.0f), this.B1);
        this.s0.r.set(f22, m10, f23, f24);
        int N0 = N0();
        float f32 = 0.7f * width;
        float f33 = (width - f32) / 2.0f;
        float f34 = f22 + f33;
        float T12 = org.telegram.messenger.i0.T1(width * 0.12f, f33, this.C2) + m10;
        g gVar = this.s0;
        if (gVar.y != N0 || gVar.z == null) {
            gVar.y = N0;
            gVar.z = new PorterDuffColorFilter(N0, PorterDuff.Mode.SRC_IN);
        }
        this.s0.e(canvas2, f34, T12, f32);
        g gVar2 = this.s0;
        float f35 = (gVar2.m == null ? 0.0f : (r13.l * f32) / r13.b) / 2.0f;
        float f36 = f32 / 2.0f;
        float f37 = f34 + f36;
        float f38 = f36 + T12;
        if (gVar2.q == 2) {
            Math.max(0.0f, gVar2.o);
        }
        float T = T(1.0f);
        canvas2.save();
        canvas2.scale(T, T, f37, f38);
        this.z1.setColor(N0);
        canvas2.drawCircle(f37, f38, f35, this.z1);
        g gVar3 = this.s0;
        if (gVar3.q == 2) {
            f7 = 30.0f;
            i13 = 2;
            if (gVar3.p == 0) {
                currentTimeMillis = -1;
                f10 = 0.12f;
            } else {
                f10 = 0.12f;
                currentTimeMillis = System.currentTimeMillis() - gVar3.p;
            }
            l4 = (!this.T2 || currentTimeMillis == Long.MAX_VALUE) ? 1.0f : currentTimeMillis < 0 ? 0.0f : Utilities.l(currentTimeMillis / 500.0f);
            if (l4 < 1.0f) {
                f11 = T12;
                u10 = 1.0f;
            } else {
                f11 = T12;
                u10 = c3.i0.u((float) Math.sin(l4 * 3.141592653589793d), 0.015f, l4, 1.0f - ((float) Math.pow(1.0f - l4, 3.0d)));
            }
            if (u10 <= 0.004f) {
                canvas2.save();
                this.E5.rewind();
                f12 = 0.004f;
                this.E5.addCircle(f37, f38, f35, Path.Direction.CW);
                canvas2.clipPath(this.E5);
                float min = (1.0f - Math.min(1.0f, u10)) * f35 * 0.55f;
                float f39 = (u10 * 0.5f) + 0.5f;
                canvas2.translate(-min, min);
                canvas2.scale(f39, f39, f37, f38);
                if (!this.T2 || this.R2 == null) {
                    this.X1.setAlpha((int) (Utilities.l(l4 * 2.0f) * 255.0f));
                    this.X1.setBounds((int) (f37 - f35), (int) (f38 - f35), (int) (f37 + f35), (int) (f38 + f35));
                    this.X1.draw(canvas2);
                    this.X1.setAlpha(zs.e4);
                } else {
                    this.c7.set(f37 - f35, f38 - f35, f37 + f35, f38 + f35);
                    canvas2.drawBitmap(this.R2, (Rect) null, this.c7, this.S2);
                }
                canvas2.restore();
            } else {
                f12 = 0.004f;
            }
            canvas2.restore();
            i14 = (int) width;
            textPaint = this.F5;
            staticLayout = this.H5;
            if (staticLayout == null && this.I5 == i14) {
                f13 = f32;
            } else {
                this.I5 = i14;
                str = this.f;
                if (str == null) {
                    str = "";
                }
                String upperCase = str.toUpperCase();
                textPaint.setTypeface(org.telegram.messenger.i0.o1("fonts/rcondensedbold.ttf"));
                int L2 = i14 - (org.telegram.messenger.i0.L(20.0f) * i13);
                this.H5 = null;
                i15 = i11;
                while (i15 <= i13) {
                    if (i15 == 0) {
                        this.G5 = w(R.drawable.qr_at_large);
                        textPaint.setTextSize(org.telegram.messenger.i0.L(f7));
                    } else if (i15 == i12) {
                        this.G5 = w(R.drawable.qr_at_medium);
                        textPaint.setTextSize(org.telegram.messenger.i0.L(25.0f));
                    } else {
                        this.G5 = w(R.drawable.qr_at_small);
                        textPaint.setTextSize(org.telegram.messenger.i0.L(19.0f));
                    }
                    Drawable drawable = this.G5;
                    int i35 = i11;
                    drawable.setBounds(i35, i35, drawable.getIntrinsicWidth(), this.G5.getIntrinsicHeight());
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.h ? sc.e.h(" ", upperCase) : upperCase);
                    if (this.h) {
                        f13 = f32;
                        spannableStringBuilder.setSpan(new y6(this.G5), 0, 1, 33);
                    } else {
                        f13 = f32;
                    }
                    float width2 = this.h ? this.G5.getBounds().width() : 0;
                    float measureText = textPaint.measureText(spannableStringBuilder, this.h ? 1 : 0, spannableStringBuilder.length()) + width2;
                    if (i15 > 1 || measureText <= L2) {
                        int i36 = measureText > ((float) L2) ? 2 : 1;
                        int L3 = i36 > 1 ? org.telegram.messenger.i0.L(2.0f) + (((int) (measureText + width2)) / 2) : L2;
                        if (L3 > L2) {
                            L3 = org.telegram.messenger.i0.L(4.0f) + (((int) (measureText + width2)) / 3);
                            i16 = i34;
                        } else {
                            i16 = i36;
                        }
                        int i37 = L3;
                        this.H5 = ov0.c(spannableStringBuilder, textPaint, i37, Layout.Alignment.ALIGN_CENTER, 0.0f, null, Math.min(org.telegram.messenger.i0.L(10.0f) + i37, i14), i16, true);
                        staticLayout = this.H5;
                    } else {
                        i15++;
                        f32 = f13;
                        i13 = 2;
                        i11 = 0;
                        i12 = 1;
                    }
                }
                f13 = f32;
                staticLayout = this.H5;
            }
            staticLayout2 = staticLayout;
            if (staticLayout2 == null) {
                this.F5.setColor(N0);
                this.G5.setColorFilter(n1(N0));
                float descent = (this.F5.descent() - this.F5.ascent()) * staticLayout2.getLineCount();
                float f40 = f11 + f13;
                boolean z11 = this.n5 && !this.T2;
                float f41 = this.C2;
                float f42 = z11 ? f41 < 0.999f ? 1.0f : 0.0f : 1.0f - f41;
                f14 = 3.0f;
                float B = c3.i0.B(width, staticLayout2.getWidth(), 2.0f, f22);
                float L4 = ((((f24 - f40) - descent) / 2.0f) + f40) - org.telegram.messenger.i0.L(4.0f);
                if (z11) {
                    c10 = 26214;
                    if (this.m5 != staticLayout2) {
                        Random random = this.e1;
                        this.m5 = staticLayout2;
                        f19 = 0.82f;
                        this.j5 = 0;
                        f20 = 0.18f;
                        int max = Math.max(1, staticLayout2.getWidth());
                        f15 = 36.0f;
                        int max2 = Math.max(1, staticLayout2.getHeight());
                        Bitmap createBitmap = Bitmap.createBitmap(max, max2, Bitmap.Config.ALPHA_8);
                        staticLayout2.draw(new Canvas(createBitmap));
                        int[] iArr3 = new int[max];
                        f16 = 1.6f;
                        int max3 = Math.max(2, org.telegram.messenger.i0.L(2.0f));
                        int i38 = max3 / 2;
                        f18 = descent;
                        int i39 = max;
                        int i40 = i39;
                        int i41 = i38;
                        int i42 = 0;
                        int i43 = 0;
                        while (i41 < max2) {
                            int i44 = i41;
                            Bitmap bitmap3 = createBitmap;
                            int[] iArr4 = iArr3;
                            bitmap3.getPixels(iArr4, 0, i40, 0, i44, i40, 1);
                            int i45 = i40;
                            int i46 = i43;
                            for (int i47 = i38; i47 < i45; i47 += max3) {
                                int i48 = i42;
                                if ((iArr4[i47] >>> 24) < 96) {
                                    i42 = i48;
                                } else {
                                    i42 = i48 + 1;
                                    if (i47 < i39) {
                                        i39 = i47;
                                    }
                                    if (i47 > i46) {
                                        i46 = i47;
                                    }
                                }
                            }
                            i41 = i44 + max3;
                            i42 = i42;
                            i40 = i45;
                            i43 = i46;
                            createBitmap = bitmap3;
                            iArr3 = iArr4;
                        }
                        Bitmap bitmap4 = createBitmap;
                        int[] iArr5 = iArr3;
                        int i49 = i40;
                        if (i42 == 0) {
                            bitmap4.recycle();
                            this.k5 = 0.0f;
                            this.l5 = i49;
                            z10 = false;
                        } else {
                            this.k5 = i39;
                            this.l5 = Math.max(1, i43 - i39);
                            float min2 = Math.min(1.0f, Math.max(80, Math.min(zs.e3, (int) (r5 / org.telegram.messenger.i0.N(1.3f)))) / i42);
                            int i50 = i38;
                            while (i50 < max2) {
                                bitmap4.getPixels(iArr5, 0, i49, 0, i50, i49, 1);
                                int i51 = i38;
                                while (i51 < i49 && this.j5 < 240) {
                                    if ((iArr5[i51] >>> 24) < 96 || random.nextFloat() > min2) {
                                        i24 = i50;
                                        i25 = i49;
                                    } else {
                                        int i52 = this.j5;
                                        this.j5 = i52 + 1;
                                        i25 = i49;
                                        float f43 = i51;
                                        this.f5[i52] = f43;
                                        this.g5[i52] = i50;
                                        i24 = i50;
                                        this.h5[i52] = (random.nextFloat() * 0.18f) + (((f43 - this.k5) * 0.82f) / this.l5);
                                        this.i5[i52] = false;
                                    }
                                    i51 += max3;
                                    i49 = i25;
                                    i50 = i24;
                                }
                                i50 += max3;
                                i49 = i49;
                            }
                            z10 = false;
                            bitmap4.recycle();
                        }
                        if (f42 <= f12) {
                            canvas2.save();
                            canvas2.translate(B, L4);
                            float T2 = T(f42);
                            canvas2.scale(T2, T2, staticLayout2.getWidth() / 2.0f, f18 / 2.0f);
                            if (z11) {
                                float f44 = -org.telegram.messenger.i0.L(8.0f);
                                float f45 = -org.telegram.messenger.i0.L(4.0f);
                                float L5 = org.telegram.messenger.i0.L(8.0f) + staticLayout2.getWidth();
                                float L6 = org.telegram.messenger.i0.L(4.0f) + staticLayout2.getHeight();
                                float f46 = f19;
                                i22 = zs.P3;
                                canvas2.saveLayer(f44, f45, L5, L6, null);
                                staticLayout2.draw(canvas2);
                                float f47 = this.C2 * 1.12f;
                                float f48 = this.k5;
                                float f49 = this.l5;
                                float f50 = (((f47 - f20) * f49) / f46) + f48;
                                this.E.setScale(Math.max(1.0f, a1.g.A(f49, f47, f46, f48) - f50), 1.0f);
                                this.E.postTranslate(f50, 0.0f);
                                this.C5.setLocalMatrix(this.E);
                                canvas2.drawRect(-org.telegram.messenger.i0.L(8.0f), -org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(8.0f) + staticLayout2.getWidth(), org.telegram.messenger.i0.L(4.0f) + staticLayout2.getHeight(), this.D5);
                                canvas.restore();
                                canvas2 = canvas;
                            } else {
                                i22 = zs.P3;
                                if (f42 < 1.0f) {
                                    canvas2 = canvas;
                                    canvas2.saveLayerAlpha(0.0f, -org.telegram.messenger.i0.L(4.0f), staticLayout2.getWidth(), f18 + org.telegram.messenger.i0.L(4.0f), (int) (f42 * 255.0f));
                                } else {
                                    canvas2 = canvas;
                                }
                                staticLayout2.draw(canvas2);
                                if (f42 < 1.0f) {
                                    canvas2.restore();
                                }
                            }
                            canvas2.restore();
                        } else {
                            i22 = zs.P3;
                        }
                        if (z11) {
                            boolean[] zArr2 = this.i5;
                            Random random2 = this.e1;
                            float f51 = this.C2 * 1.12f;
                            for (?? r15 = z10; r15 < this.j5; r15++) {
                                boolean z12 = this.h5[r15] < f51 ? true : z10;
                                if (!z12 || zArr2[r15] || this.E2 != 1.0f || (i23 = this.B5) >= i22) {
                                    zArr = zArr2;
                                } else {
                                    this.B5 = i23 + 1;
                                    boolean z13 = random2.nextFloat() < f10 ? true : z10;
                                    float[] fArr10 = this.o5;
                                    float[] fArr11 = this.t5;
                                    float nextFloat = ((random2.nextFloat() - 0.5f) * org.telegram.messenger.i0.L(2.0f)) + this.f5[r15] + B;
                                    fArr11[i23] = nextFloat;
                                    fArr10[i23] = nextFloat;
                                    float[] fArr12 = this.p5;
                                    float[] fArr13 = this.u5;
                                    zArr = zArr2;
                                    float nextFloat2 = ((random2.nextFloat() - 0.5f) * org.telegram.messenger.i0.L(2.0f)) + this.g5[r15] + L4;
                                    fArr13[i23] = nextFloat2;
                                    fArr12[i23] = nextFloat2;
                                    this.q5[i23] = ((random2.nextFloat() - 0.5f) * org.telegram.messenger.i0.L(f15)) + org.telegram.messenger.i0.L(6.0f);
                                    this.r5[i23] = -((random2.nextFloat() * org.telegram.messenger.i0.L(f15)) + org.telegram.messenger.i0.L(18.0f));
                                    this.s5[i23] = -((random2.nextFloat() * org.telegram.messenger.i0.L(70.0f)) + org.telegram.messenger.i0.L(60.0f));
                                    this.v5[i23] = z13 ? f1.d(0.8f, random2.nextFloat(), org.telegram.messenger.i0.N(f16)) : f1.d(1.3f, random2.nextFloat(), org.telegram.messenger.i0.N(1.2f));
                                    this.w5[i23] = (random2.nextFloat() * 0.4f) + 0.6f;
                                    this.x5[i23] = 0.0f;
                                    this.y5[i23] = (random2.nextFloat() * 3.0f) + 4.0f;
                                    this.z5[i23] = random2.nextFloat() * 6.2832f;
                                    this.A5[i23] = z13;
                                }
                                zArr[r15] = z12;
                                zArr2 = zArr;
                                i22 = zs.P3;
                            }
                        }
                    } else {
                        f18 = descent;
                    }
                } else {
                    f18 = descent;
                    c10 = 26214;
                }
                f19 = 0.82f;
                f20 = 0.18f;
                f15 = 36.0f;
                z10 = false;
                f16 = 1.6f;
                if (f42 <= f12) {
                }
                if (z11) {
                }
            } else {
                f14 = 3.0f;
                f15 = 36.0f;
                f16 = 1.6f;
            }
            if (!this.T2 && (i17 = this.B5) > 0) {
                RectF rectF4 = this.F1;
                boolean[] zArr3 = this.A5;
                float[] fArr14 = this.z5;
                float[] fArr15 = this.y5;
                float[] fArr16 = this.v5;
                float[] fArr17 = this.u5;
                float[] fArr18 = this.t5;
                float[] fArr19 = this.s5;
                float[] fArr20 = this.w5;
                float[] fArr21 = this.p5;
                float[] fArr22 = this.o5;
                float[] fArr23 = this.x5;
                Paint paint = this.z1;
                float[] fArr24 = this.r5;
                float[] fArr25 = this.q5;
                float f52 = this.X2 * 0.016667f;
                i18 = i17 - 1;
                while (i18 >= 0) {
                    float f53 = fArr23[i18] + f52;
                    fArr23[i18] = f53;
                    if (f53 >= fArr20[i18]) {
                        fArr = fArr14;
                        int i53 = this.B5 - 1;
                        this.B5 = i53;
                        fArr22[i18] = fArr22[i53];
                        fArr21[i18] = fArr21[i53];
                        fArr25[i18] = fArr25[i53];
                        fArr24[i18] = fArr24[i53];
                        fArr19[i18] = fArr19[i53];
                        fArr18[i18] = fArr18[i53];
                        fArr17[i18] = fArr17[i53];
                        fArr16[i18] = fArr16[i53];
                        fArr20[i18] = fArr20[i53];
                        fArr23[i18] = fArr23[i53];
                        fArr15[i18] = fArr15[i53];
                        fArr[i18] = fArr[i53];
                        zArr3[i18] = zArr3[i53];
                        rectF = rectF4;
                        f17 = f52;
                        fArr2 = fArr15;
                        fArr3 = fArr16;
                        fArr4 = fArr17;
                        fArr5 = fArr18;
                        i20 = N0;
                    } else {
                        fArr = fArr14;
                        fArr24[i18] = (fArr19[i18] * f52) + fArr24[i18];
                        fArr2 = fArr15;
                        fArr3 = fArr16;
                        fArr25[i18] = c3.i0.D(f52, f16, 1.0f, fArr25[i18]);
                        fArr24[i18] = c3.i0.D(f52, 0.8f, 1.0f, fArr24[i18]);
                        fArr22[i18] = (fArr25[i18] * f52) + fArr22[i18];
                        float f54 = (fArr24[i18] * f52) + fArr21[i18];
                        fArr21[i18] = f54;
                        float f55 = fArr22[i18] - fArr18[i18];
                        float f56 = f54 - fArr17[i18];
                        float f57 = (f56 * f56) + (f55 * f55);
                        int i54 = N0;
                        float sqrt = (float) Math.sqrt(f57);
                        float f58 = fArr23[i18] / fArr20[i18];
                        if (f58 < 0.08f) {
                            pow = f58 / 0.08f;
                            f17 = f52;
                            i19 = i54;
                        } else {
                            f17 = f52;
                            i19 = i54;
                            pow = (float) Math.pow(m5.y(f58, 0.08f, 0.92f, 1.0f), 0.550000011920929d);
                        }
                        float exp = pow * ((float) Math.exp((-sqrt) / org.telegram.messenger.i0.L(90.0f)));
                        float min3 = (1.0f - (Math.min(1.0f, sqrt / org.telegram.messenger.i0.L(90.0f)) * 0.4f)) * (fArr3[i18] / 2.0f);
                        float hypot = (float) Math.hypot(fArr25[i18], fArr24[i18]);
                        float f59 = fArr22[i18];
                        float f60 = fArr21[i18];
                        if (hypot > 1.0f) {
                            float sin = ((float) Math.sin((fArr23[i18] * fArr2[i18]) + fArr[i18])) * org.telegram.messenger.i0.L(f14);
                            f59 = a1.g.c(-fArr24[i18], hypot, sin, f59);
                            f60 = a1.g.c(fArr25[i18], hypot, sin, f60);
                        }
                        fArr4 = fArr17;
                        float min4 = Math.min(1.0f, Math.max(Math.max(rectF4.left - f59, Math.max(0.0f, f59 - rectF4.right)), Math.max(rectF4.top - f60, Math.max(0.0f, f60 - rectF4.bottom))) / org.telegram.messenger.i0.L(f15));
                        if (min4 > 0.0f) {
                            i20 = i19;
                            i21 = g.k(min4, i20, -1);
                        } else {
                            i20 = i19;
                            i21 = i20;
                        }
                        paint.setColor(i21);
                        paint.setAlpha((int) (exp * 255.0f));
                        float min5 = Math.min(1.8f, (hypot / org.telegram.messenger.i0.L(220.0f)) + 1.0f);
                        canvas2.save();
                        fArr5 = fArr18;
                        rectF = rectF4;
                        canvas2.rotate((float) Math.toDegrees(Math.atan2(fArr24[i18], fArr25[i18])), f59, f60);
                        float f61 = min3 * min5;
                        this.U5.set(f59 - f61, f60 - min3, f61 + f59, f60 + min3);
                        canvas2.drawOval(this.U5, paint);
                        canvas2.restore();
                        if (zArr3[i18]) {
                            paint.setAlpha((int) (exp * f15));
                            canvas2.drawCircle(f59, f60, 2.2f * min3, paint);
                        }
                    }
                    i18--;
                    N0 = i20;
                    fArr17 = fArr4;
                    fArr14 = fArr;
                    fArr15 = fArr2;
                    fArr16 = fArr3;
                    f52 = f17;
                    fArr18 = fArr5;
                    rectF4 = rectF;
                    f16 = 1.6f;
                }
                if (this.B5 > 0) {
                    invalidate();
                }
            }
            canvas2.restore();
        }
        f7 = 30.0f;
        i13 = 2;
        f10 = 0.12f;
        currentTimeMillis = Long.MAX_VALUE;
        if (this.T2) {
        }
        if (l4 < 1.0f) {
        }
        if (u10 <= 0.004f) {
        }
        canvas2.restore();
        i14 = (int) width;
        textPaint = this.F5;
        staticLayout = this.H5;
        if (staticLayout == null) {
        }
        this.I5 = i14;
        str = this.f;
        if (str == null) {
        }
        String upperCase2 = str.toUpperCase();
        textPaint.setTypeface(org.telegram.messenger.i0.o1("fonts/rcondensedbold.ttf"));
        int L22 = i14 - (org.telegram.messenger.i0.L(20.0f) * i13);
        this.H5 = null;
        i15 = i11;
        while (i15 <= i13) {
        }
        f13 = f32;
        staticLayout = this.H5;
        staticLayout2 = staticLayout;
        if (staticLayout2 == null) {
        }
        if (!this.T2) {
            RectF rectF42 = this.F1;
            boolean[] zArr32 = this.A5;
            float[] fArr142 = this.z5;
            float[] fArr152 = this.y5;
            float[] fArr162 = this.v5;
            float[] fArr172 = this.u5;
            float[] fArr182 = this.t5;
            float[] fArr192 = this.s5;
            float[] fArr202 = this.w5;
            float[] fArr212 = this.p5;
            float[] fArr222 = this.o5;
            float[] fArr232 = this.x5;
            Paint paint2 = this.z1;
            float[] fArr242 = this.r5;
            float[] fArr252 = this.q5;
            float f522 = this.X2 * 0.016667f;
            i18 = i17 - 1;
            while (i18 >= 0) {
            }
            if (this.B5 > 0) {
            }
        }
        canvas2.restore();
    }

    public final PorterDuffColorFilter A0(u0 u0Var) {
        float[] fArr = y0.b;
        int i10 = ((int) (fArr[30] * 10.0f)) ^ (u0Var.s * 31);
        if (this.k4 == null || this.l4 != i10) {
            this.l4 = i10;
            this.k4 = new PorterDuffColorFilter(i0.b.f(fArr[30] / 100.0f, u0Var.s, -1), PorterDuff.Mode.SRC_IN);
        }
        return this.k4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0094, code lost:
    
        if (r0.B0 > 0.001f) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x023f, code lost:
    
        if (java.lang.Math.hypot(r66 - r7, r67 - r6) > r4) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r57v1 */
    /* JADX WARN: Type inference failed for: r57v2 */
    /* JADX WARN: Type inference failed for: r57v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(Canvas canvas, int i10) {
        TextPaint textPaint;
        RectF rectF;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        TextPaint textPaint2;
        float[] fArr;
        float f14;
        boolean z10;
        float[] fArr2;
        boolean z11;
        float f15;
        float f16;
        Random random;
        int i11;
        float f17;
        float[] fArr3;
        Paint paint;
        Path path;
        RectF rectF2;
        int i12;
        Path path2;
        RectF rectF3;
        boolean[] zArr;
        float f18;
        TextPaint textPaint3;
        float f19;
        float f20;
        Canvas canvas2;
        float[] fArr4;
        float[] fArr5;
        float[] fArr6;
        float[] fArr7;
        float[] fArr8;
        float[] fArr9;
        float[] fArr10;
        float[] fArr11;
        float[] fArr12;
        float[] fArr13;
        float[] fArr14;
        float[] fArr15;
        Path path3;
        float f21;
        float pow;
        float f22;
        Paint paint2;
        RectF rectF4;
        float f23;
        float f24;
        RectF rectF5;
        float f25;
        TextPaint textPaint4;
        Paint paint3;
        float N;
        float nextFloat;
        float f26;
        int i13;
        int i14;
        int i15;
        float f27;
        float[] fArr16;
        boolean z12;
        x0 x0Var = this;
        Canvas canvas3 = canvas;
        float f28 = x0Var.C2;
        float f29 = x0Var.J2;
        float f30 = (1.0f - f29) * f28;
        RectF rectF6 = x0Var.J5;
        TextPaint textPaint5 = x0Var.H0;
        RectF rectF7 = x0Var.F1;
        if (f29 > 0.001f) {
            boolean z13 = f29 < 0.999f;
            if (z13) {
                canvas3.save();
                float f31 = x0Var.J2;
                f11 = 0.999f;
                f7 = 2.0f;
                canvas3.scale(f31, f31, i10 / 2.0f, x0Var.o());
            } else {
                f11 = 0.999f;
                f7 = 2.0f;
            }
            float o10 = x0Var.o();
            textPaint5.setTextSize(org.telegram.messenger.i0.L(11.0f));
            float measureText = textPaint5.measureText(x0Var.J0) + textPaint5.measureText(x0Var.I0) + org.telegram.messenger.i0.L(11.0f) + org.telegram.messenger.i0.L(12.0f) + org.telegram.messenger.i0.L(1.0f) + org.telegram.messenger.i0.L(11.0f);
            if (!x0Var.v0) {
                f13 = x0Var.t2;
                if (f13 > 0.0f) {
                    f12 = 8.0f;
                }
            }
            f12 = 8.0f;
            f13 = org.telegram.messenger.i0.L(11.0f) + x0Var.L0.c() + org.telegram.messenger.i0.L(f7) + org.telegram.messenger.i0.L(12.0f) + org.telegram.messenger.i0.L(f12);
            boolean z14 = x0Var.v0;
            if (!z14 && x0Var.B0 <= 0.001f) {
                x0Var.t2 = 0.0f;
            }
            float f32 = x0Var.B0;
            if (z14) {
                f32 = Math.max(f32, x0Var.F0 ? 1.0f : 0.0f);
            }
            float T1 = org.telegram.messenger.i0.T1(measureText, f13, f32);
            float L = org.telegram.messenger.i0.L(22.0f);
            float f33 = (i10 - T1) / f7;
            float f34 = L / f7;
            rectF7.set(f33, o10 - f34, T1 + f33, o10 + f34);
            rectF6.set(rectF7);
            if (!x0Var.T5) {
                x0Var.z6 = true;
                x0Var.J(canvas3, rectF7, f34, 1.0f);
                x0Var.z6 = false;
            }
            x0Var.M(canvas3, 9, rectF7, false);
            RectF rectF8 = x0Var.K5;
            rectF8.set(rectF7);
            float min = Math.min(0.0f, org.telegram.messenger.i0.N(y0.a[1][8]));
            rectF8.inset(min, min);
            float f35 = f34 - min;
            f10 = f30;
            boolean z15 = x0Var.q2 > 0 && !x0Var.v0;
            boolean z16 = x0Var.s2;
            float[] fArr17 = x0Var.Z0;
            float[] fArr18 = x0Var.Y0;
            RectF rectF9 = rectF6;
            float[] fArr19 = x0Var.X0;
            float[] fArr20 = x0Var.U0;
            float[] fArr21 = x0Var.T0;
            float[] fArr22 = x0Var.R0;
            float[] fArr23 = x0Var.Q0;
            float[] fArr24 = x0Var.S0;
            float[] fArr25 = x0Var.P0;
            float[] fArr26 = x0Var.O0;
            float[] fArr27 = x0Var.W0;
            float[] fArr28 = x0Var.V0;
            float[] fArr29 = x0Var.N0;
            float[] fArr30 = x0Var.M0;
            boolean[] zArr2 = x0Var.b1;
            byte[] bArr = x0Var.a1;
            float f36 = 0.8f;
            RectF rectF10 = x0Var.r2;
            Random random2 = x0Var.e1;
            if (z16) {
                x0Var.s2 = false;
                float f37 = rectF8.left;
                z11 = 0;
                textPaint2 = textPaint5;
                fArr = fArr18;
                rectF10.set(f37, rectF8.top, (rectF8.width() * x0Var.B0 * x0Var.G0) + f37, rectF8.bottom);
                float L2 = org.telegram.messenger.i0.L(3.0f);
                float centerX = rectF7.centerX();
                float centerY = rectF7.centerY();
                int max = Math.max(1, (int) (rectF10.width() / L2));
                int max2 = Math.max(1, (int) (rectF10.height() / L2));
                float min2 = Math.min(1.0f, 260.0f / (max * max2));
                int i16 = 0;
                while (i16 < max2) {
                    float f38 = min2;
                    int i17 = 0;
                    while (i17 < max) {
                        if (random2.nextFloat() <= f38) {
                            i14 = max2;
                            f27 = L;
                            if (x0Var.c1 >= 320) {
                                i13 = i17;
                                i15 = i16;
                            } else {
                                float nextFloat2 = ((((random2.nextFloat() - 0.5f) * f36) + i17 + 0.5f) * L2) + rectF10.left;
                                float nextFloat3 = ((((random2.nextFloat() - 0.5f) * f36) + i16 + 0.5f) * L2) + rectF10.top;
                                float height = rectF7.height() / f7;
                                if (nextFloat2 < rectF7.left + height) {
                                    i15 = i16;
                                    i13 = i17;
                                    z12 = z15;
                                    fArr16 = fArr17;
                                } else {
                                    i13 = i17;
                                    i15 = i16;
                                    z12 = z15;
                                    fArr16 = fArr17;
                                }
                                float f39 = nextFloat2 - centerX;
                                float f40 = nextFloat3 - centerY;
                                float max3 = Math.max(1.0f, (float) Math.hypot(f39, f40));
                                float f41 = f39 / max3;
                                float f42 = f40 / max3;
                                float nextFloat4 = (random2.nextFloat() * org.telegram.messenger.i0.L(140.0f)) + org.telegram.messenger.i0.L(60.0f);
                                boolean z17 = random2.nextFloat() < 0.15f;
                                int i18 = x0Var.c1;
                                x0Var.c1 = i18 + 1;
                                bArr[i18] = (byte) (z17 ? 4 : 3);
                                zArr2[i18] = false;
                                fArr30[i18] = nextFloat2;
                                fArr29[i18] = nextFloat3;
                                fArr28[i18] = nextFloat2;
                                fArr27[i18] = nextFloat3;
                                fArr26[i18] = ((random2.nextFloat() - 0.5f) * org.telegram.messenger.i0.L(60.0f)) + (f41 * nextFloat4);
                                fArr25[i18] = ((random2.nextFloat() - 0.5f) * org.telegram.messenger.i0.L(60.0f)) + ((f42 * nextFloat4) - ((random2.nextFloat() * org.telegram.messenger.i0.L(80.0f)) + org.telegram.messenger.i0.L(40.0f)));
                                fArr24[i18] = z17 ? f1.d(f36, random2.nextFloat(), org.telegram.messenger.i0.N(1.4f)) : f1.d(1.2f, random2.nextFloat(), org.telegram.messenger.i0.N(1.0f));
                                fArr23[i18] = (random2.nextFloat() * 0.3f) + 0.35f;
                                fArr22[i18] = 0.0f;
                                fArr21[i18] = 1.0f;
                                fArr20[i18] = 0.0f;
                                fArr19[i18] = 0.0f;
                                fArr[i18] = 0.0f;
                                fArr16[i18] = 0.0f;
                                i17 = i13 + 1;
                                max2 = i14;
                                L = f27;
                                i16 = i15;
                                z15 = z12;
                                fArr17 = fArr16;
                                f36 = 0.8f;
                            }
                        } else {
                            i13 = i17;
                            i14 = max2;
                            i15 = i16;
                            f27 = L;
                        }
                        z12 = z15;
                        fArr16 = fArr17;
                        i17 = i13 + 1;
                        max2 = i14;
                        L = f27;
                        i16 = i15;
                        z15 = z12;
                        fArr17 = fArr16;
                        f36 = 0.8f;
                    }
                    i16++;
                    min2 = f38;
                    L = L;
                    f36 = 0.8f;
                }
                f14 = L;
                z10 = z15;
                fArr2 = fArr17;
                x0Var.invalidate();
            } else {
                textPaint2 = textPaint5;
                fArr = fArr18;
                f14 = L;
                z10 = z15;
                fArr2 = fArr17;
                z11 = 0;
            }
            float f43 = z10 ? 0.0f : x0Var.B0 * x0Var.G0;
            float width = (rectF8.width() * f43) + rectF8.left;
            if (z10) {
                f15 = f34;
                f16 = Utilities.l((AnimationUtils.currentAnimationTimeMillis() - x0Var.q2) / 80.0f);
            } else {
                f15 = f34;
                f16 = 1.0f;
            }
            Paint paint4 = x0Var.z1;
            Path path4 = x0Var.E1;
            if (!z10 || f16 >= 1.0f) {
                random = random2;
            } else {
                random = random2;
                float l4 = 1.0f - Utilities.l((AnimationUtils.currentAnimationTimeMillis() - x0Var.q2) / 60.0f);
                canvas3.save();
                path4.rewind();
                path4.addRoundRect(rectF8, f35, f35, Path.Direction.CW);
                canvas3.clipPath(path4);
                canvas3.clipRect(rectF10);
                if (l4 > 0.0f) {
                    paint4.setColor(-134217729);
                    paint4.setAlpha((int) (l4 * 247.0f));
                    canvas3.drawRect(rectF10, paint4);
                }
                x0Var.G(canvas3, rectF7, a(1.0f - f16, x0Var.n != null ? x0Var.N0() : -16777216));
                canvas3.restore();
                x0Var.invalidate();
            }
            boolean z18 = x0Var.v0;
            boolean z19 = (z18 && x0Var.F0 && x0Var.w0 && f43 < f11) ? true : z11;
            RectF rectF11 = rectF7;
            float elapsedRealtime = (SystemClock.elapsedRealtime() % 100000) / 1000.0f;
            float f44 = 6.0f;
            float f45 = f43;
            x0Var.N5 = org.telegram.messenger.i0.N((!z18 || x0Var.F0) ? z11 : true ? 5.0f : 2.2f) * Utilities.l((rectF8.right - width) / org.telegram.messenger.i0.L(6.0f)) * Utilities.l((width - rectF8.left) / org.telegram.messenger.i0.L(6.0f));
            float L3 = rectF11.top - org.telegram.messenger.i0.L(4.0f);
            float L4 = rectF11.bottom + org.telegram.messenger.i0.L(4.0f);
            float f46 = L4 - L3;
            int i19 = z11;
            while (true) {
                i11 = 7;
                f17 = f16;
                fArr3 = x0Var.M5;
                if (i19 >= 7) {
                    break;
                }
                float f47 = 5.1f * elapsedRealtime;
                float f48 = i19;
                fArr3[i19] = (((float) ((Math.sin((f48 * 2.9f) + (8.3f * elapsedRealtime)) * 0.4000000059604645d) + (Math.sin((1.7f * f48) + f47) * 0.6000000238418579d))) * x0Var.N5) + width;
                i19++;
                f16 = f17;
                z19 = z19;
            }
            boolean z20 = z19;
            Path path5 = x0Var.L5;
            path5.rewind();
            path5.moveTo(rectF11.left - org.telegram.messenger.i0.L(f12), L3);
            path5.lineTo(fArr3[z11], L3);
            int i20 = 1;
            while (i20 < i11) {
                int i21 = i20 - 1;
                float f49 = i21;
                float f50 = f44;
                float A = a1.g.A(f46, f49, f50, L3);
                float A2 = a1.g.A(f46, i20, f50, L3);
                float f51 = fArr3[i21];
                path5.quadTo(f51, A, (f51 + fArr3[i20]) / f7, (A2 + A) / f7);
                i20++;
                L3 = L3;
                i11 = 7;
                f44 = 6.0f;
            }
            path5.lineTo(fArr3[6], L4);
            path5.lineTo(rectF11.left - org.telegram.messenger.i0.L(f12), L4);
            path5.close();
            if (x0Var.N5 > 0.01f) {
                x0Var.invalidate();
            }
            int i22 = (f45 > 0.001f ? 1 : (f45 == 0.001f ? 0 : -1));
            Path path6 = x0Var.S5;
            if (i22 > 0) {
                canvas3.save();
                path4.rewind();
                path4.addRoundRect(rectF8, f35, f35, Path.Direction.CW);
                canvas3.clipPath(path4);
                canvas3.clipPath(path5);
                paint4.setColor(-134217729);
                if (z20) {
                    path6.rewind();
                    float L5 = rectF8.top - org.telegram.messenger.i0.L(f7);
                    float L6 = rectF8.bottom + org.telegram.messenger.i0.L(f7);
                    float N2 = org.telegram.messenger.i0.N(0.75f);
                    f19 = 20.0f;
                    path6.moveTo(rectF8.left - org.telegram.messenger.i0.L(4.0f), L5);
                    while (true) {
                        float min3 = Math.min(L5, L6);
                        path6.lineTo(t1(min3, width, rectF8.top) + width, min3);
                        if (min3 >= L6) {
                            break;
                        } else {
                            L5 += N2;
                        }
                    }
                    path6.lineTo(rectF8.left - org.telegram.messenger.i0.L(4.0f), L6);
                    path6.close();
                    canvas3.drawPath(path6, paint4);
                    textPaint4 = textPaint2;
                } else {
                    f19 = 20.0f;
                    textPaint4 = textPaint2;
                    canvas3.drawRect(rectF8.left, rectF8.top, x0Var.N5 + width, rectF8.bottom, paint4);
                }
                if (z20 || (x0Var.v0 && !x0Var.F0)) {
                    float L7 = org.telegram.messenger.i0.L(23.0f);
                    Matrix matrix = x0Var.P5;
                    matrix.setScale(L7, 1.0f);
                    matrix.postTranslate(width - org.telegram.messenger.i0.L(22.0f), 0.0f);
                    LinearGradient linearGradient = x0Var.Q5;
                    linearGradient.setLocalMatrix(matrix);
                    paint4.setShader(linearGradient);
                    canvas.drawRect(width - org.telegram.messenger.i0.L(22.0f), rectF8.top, width + org.telegram.messenger.i0.L(1.0f), rectF8.bottom, paint4);
                    paint3 = paint4;
                    paint3.setShader(null);
                } else {
                    paint3 = paint4;
                }
                canvas.restore();
                float f52 = x0Var.X2 * 0.016667f;
                float currentTimeMillis = z20 ? 1.2f : ((x0Var.o2 + 250) - System.currentTimeMillis()) / 1000.0f;
                if (z20) {
                    int floor = (int) Math.floor(random.nextFloat() + (110.0f * f52));
                    int i23 = z11;
                    while (i23 < floor) {
                        float nextFloat5 = (random.nextFloat() * f14) + rectF11.top;
                        boolean[] zArr3 = zArr2;
                        float[] fArr31 = fArr30;
                        float[] fArr32 = fArr29;
                        float[] fArr33 = fArr28;
                        float[] fArr34 = fArr27;
                        float[] fArr35 = fArr26;
                        float[] fArr36 = fArr25;
                        float[] fArr37 = fArr24;
                        q((random.nextFloat() * org.telegram.messenger.i0.L(3.0f)) + t1(nextFloat5, width, rectF8.top) + width, nextFloat5, (random.nextFloat() * org.telegram.messenger.i0.L(f19)) + org.telegram.messenger.i0.L(10.0f), -((random.nextFloat() * org.telegram.messenger.i0.L(10.0f)) + org.telegram.messenger.i0.L(4.0f)), 0.0f, f1.d(0.7f, random.nextFloat(), org.telegram.messenger.i0.N(0.8f)), (random.nextFloat() * 0.25f) + 0.25f, (random.nextFloat() * 0.1f) + 0.9f, false, false);
                        i23++;
                        rectF11 = rectF11;
                        rectF8 = rectF8;
                        i22 = i22;
                        floor = floor;
                        path6 = path6;
                        fArr19 = fArr19;
                        fArr20 = fArr20;
                        fArr21 = fArr21;
                        fArr22 = fArr22;
                        fArr23 = fArr23;
                        fArr24 = fArr37;
                        fArr25 = fArr36;
                        fArr26 = fArr35;
                        fArr27 = fArr34;
                        fArr28 = fArr33;
                        fArr29 = fArr32;
                        fArr30 = fArr31;
                        zArr2 = zArr3;
                        textPaint4 = textPaint4;
                        path4 = path4;
                        paint3 = paint3;
                        rectF9 = rectF9;
                        f15 = f15;
                        path5 = path5;
                    }
                    paint = paint3;
                    path = path4;
                    rectF2 = rectF11;
                    i12 = i22;
                    path2 = path5;
                    rectF3 = rectF9;
                    zArr = zArr2;
                    f18 = f15;
                    f20 = 0.12f;
                    canvas2 = canvas;
                    textPaint3 = textPaint4;
                    fArr4 = fArr30;
                    RectF rectF12 = rectF8;
                    fArr5 = fArr29;
                    fArr6 = fArr28;
                    fArr7 = fArr27;
                    fArr8 = fArr26;
                    fArr9 = fArr25;
                    fArr10 = fArr24;
                    fArr11 = fArr23;
                    fArr12 = fArr22;
                    fArr13 = fArr21;
                    fArr14 = fArr20;
                    fArr15 = fArr19;
                    path3 = path6;
                    int i24 = z11;
                    for (int floor2 = (int) Math.floor(random.nextFloat() + (f52 * 70.0f)); i24 < floor2; floor2 = floor2) {
                        boolean z21 = random.nextFloat() < 0.12f ? true : z11;
                        float nextFloat6 = rectF2.top + (random.nextFloat() * f14);
                        float nextFloat7 = (random.nextFloat() * org.telegram.messenger.i0.L(10.0f)) + t1(nextFloat6, width, rectF12.top) + width + org.telegram.messenger.i0.L(f7);
                        float L8 = org.telegram.messenger.i0.L(40.0f) + (random.nextFloat() * org.telegram.messenger.i0.L(70.0f));
                        float f53 = -((random.nextFloat() * org.telegram.messenger.i0.L(30.0f)) + org.telegram.messenger.i0.L(10.0f));
                        float f54 = -((random.nextFloat() * org.telegram.messenger.i0.L(34.0f)) + org.telegram.messenger.i0.L(26.0f));
                        if (z21) {
                            N = org.telegram.messenger.i0.N(1.4f);
                            nextFloat = random.nextFloat();
                            f26 = 0.8f;
                        } else {
                            N = org.telegram.messenger.i0.N(0.9f);
                            nextFloat = random.nextFloat();
                            f26 = 1.1f;
                        }
                        q(nextFloat7, nextFloat6, L8, f53, f54, f1.d(f26, nextFloat, N), (random.nextFloat() * 0.7f) + 0.6f, 1.0f, z21, true);
                        i24++;
                    }
                    x0Var = this;
                } else {
                    paint = paint3;
                    path = path4;
                    rectF2 = rectF11;
                    i12 = i22;
                    path2 = path5;
                    rectF3 = rectF9;
                    zArr = zArr2;
                    f18 = f15;
                    f20 = 0.12f;
                    canvas2 = canvas;
                    textPaint3 = textPaint4;
                    fArr4 = fArr30;
                    fArr5 = fArr29;
                    fArr6 = fArr28;
                    fArr7 = fArr27;
                    fArr8 = fArr26;
                    fArr9 = fArr25;
                    fArr10 = fArr24;
                    fArr11 = fArr23;
                    fArr12 = fArr22;
                    fArr13 = fArr21;
                    fArr14 = fArr20;
                    fArr15 = fArr19;
                    path3 = path6;
                    int floor3 = (int) Math.floor(random.nextFloat() + (((!x0Var.v0 || x0Var.F0) ? 0.0f : 260.0f) * f52));
                    for (int i25 = z11; i25 < floor3; i25++) {
                        x0Var.p(width, (random.nextFloat() * f14) + rectF2.top, currentTimeMillis);
                    }
                }
            } else {
                paint = paint4;
                path = path4;
                rectF2 = rectF11;
                i12 = i22;
                path2 = path5;
                rectF3 = rectF9;
                zArr = zArr2;
                f18 = f15;
                textPaint3 = textPaint2;
                f19 = 20.0f;
                f20 = 0.12f;
                canvas2 = canvas3;
                fArr4 = fArr30;
                fArr5 = fArr29;
                fArr6 = fArr28;
                fArr7 = fArr27;
                fArr8 = fArr26;
                fArr9 = fArr25;
                fArr10 = fArr24;
                fArr11 = fArr23;
                fArr12 = fArr22;
                fArr13 = fArr21;
                fArr14 = fArr20;
                fArr15 = fArr19;
                path3 = path6;
            }
            int N0 = x0Var.n != null ? x0Var.N0() : -16777216;
            canvas2.save();
            path.rewind();
            Path path7 = path;
            path7.addRoundRect(rectF2, f18, f18, Path.Direction.CW);
            canvas2.clipPath(path7);
            if (i12 > 0) {
                u.b(canvas2, z20 ? path3 : path2);
            }
            if (x0Var.v0 && x0Var.F0) {
                x0Var.G(canvas2, rectF2, -218103809);
                canvas3 = canvas2;
                textPaint = textPaint3;
            } else {
                int a2 = a(z10 ? f17 : 1.0f - Utilities.l(x0Var.B0 * 1.25f), -218103809);
                float centerY2 = rectF2.centerY();
                float L10 = org.telegram.messenger.i0.L(12.0f);
                float L11 = rectF2.left + org.telegram.messenger.i0.L(11.0f);
                textPaint = textPaint3;
                textPaint.setColor(a2);
                canvas2.drawText(x0Var.I0, L11, org.telegram.messenger.i0.L(4.0f) + centerY2, textPaint);
                float measureText2 = textPaint.measureText(x0Var.I0) + L11;
                canvas3 = canvas2;
                x0Var.O(canvas3, measureText2, centerY2, L10, a2, false);
                textPaint.setColor(a2);
                canvas3.drawText(x0Var.J0, measureText2 + L10 + org.telegram.messenger.i0.L(1.0f), centerY2 + org.telegram.messenger.i0.L(4.0f), textPaint);
            }
            canvas3.restore();
            if (i12 > 0) {
                canvas3.save();
                canvas3.clipPath(z20 ? path3 : path2);
                x0Var.G(canvas3, rectF2, N0);
                canvas3.restore();
            }
            if (x0Var.d1) {
                x0Var.d1 = z11;
                for (int i26 = 0; i26 < 24; i26++) {
                    x0Var.p((rectF2.width() * random.nextFloat() * 0.4f) + rectF2.left, (rectF2.height() * random.nextFloat()) + rectF2.top, 0.5f);
                }
            }
            float f55 = 0.5f;
            float f56 = x0Var.X2 * 0.016667f;
            RectF rectF13 = rectF3;
            float L12 = rectF13.top - org.telegram.messenger.i0.L(40.0f);
            float L13 = rectF13.top - org.telegram.messenger.i0.L(48.0f);
            int i27 = x0Var.c1 - 1;
            while (i27 >= 0) {
                float f57 = fArr12[i27] + f56;
                fArr12[i27] = f57;
                if (f57 >= fArr11[i27]) {
                    int i28 = x0Var.c1 - 1;
                    x0Var.c1 = i28;
                    fArr4[i27] = fArr4[i28];
                    fArr5[i27] = fArr5[i28];
                    fArr8[i27] = fArr8[i28];
                    fArr9[i27] = fArr9[i28];
                    fArr11[i27] = fArr11[i28];
                    fArr12[i27] = fArr12[i28];
                    fArr10[i27] = fArr10[i28];
                    fArr13[i27] = fArr13[i28];
                    fArr14[i27] = fArr14[i28];
                    bArr[i27] = bArr[i28];
                    zArr[i27] = zArr[i28];
                    fArr6[i27] = fArr6[i28];
                    fArr7[i27] = fArr7[i28];
                    fArr15[i27] = fArr15[i28];
                    fArr[i27] = fArr[i28];
                    fArr2[i27] = fArr2[i28];
                    f21 = f55;
                    rectF4 = rectF13;
                    f23 = L12;
                    f24 = L13;
                    rectF5 = rectF2;
                    paint2 = paint;
                } else {
                    if (bArr[i27] >= 3) {
                        float f58 = 1.0f - (2.4f * f56);
                        fArr8[i27] = fArr8[i27] * f58;
                        float f59 = fArr9[i27] * f58;
                        fArr9[i27] = f59;
                        if (fArr12[i27] > f20) {
                            fArr9[i27] = (org.telegram.messenger.i0.L(120.0f) * f56) + f59;
                        }
                        if (fArr5[i27] < rectF13.top - org.telegram.messenger.i0.L(70.0f)) {
                            fArr9[i27] = fArr9[i27] * 0.85f;
                        }
                    } else if (zArr[i27]) {
                        fArr9[i27] = (fArr15[i27] * f56) + fArr9[i27];
                        fArr8[i27] = c3.i0.D(f56, 1.6f, 1.0f, fArr8[i27]);
                        float D = c3.i0.D(f56, 0.8f, 1.0f, fArr9[i27]);
                        fArr9[i27] = D;
                        if (fArr5[i27] < L13) {
                            fArr9[i27] = D * ((float) Math.pow(0.8999999761581421d, x0Var.X2));
                        }
                    } else {
                        fArr9[i27] = fArr9[i27] - (org.telegram.messenger.i0.L(f19) * f56);
                        float f60 = 1.0f - (f56 * 3.0f);
                        fArr8[i27] = fArr8[i27] * f60;
                        float f61 = fArr9[i27] * f60;
                        fArr9[i27] = f61;
                        if (fArr5[i27] < L12) {
                            fArr9[i27] = f61 * 0.85f;
                        }
                    }
                    fArr4[i27] = (fArr8[i27] * f56) + fArr4[i27];
                    fArr5[i27] = (fArr9[i27] * f56) + fArr5[i27];
                    float f62 = fArr12[i27] / fArr11[i27];
                    if (f62 < f20) {
                        pow = f62 / f20;
                        f21 = f55;
                    } else {
                        f21 = f55;
                        pow = (float) Math.pow(m5.y(f62, f20, 0.88f, 1.0f), zArr[i27] ? 0.550000011920929d : 0.699999988079071d);
                    }
                    float f63 = fArr5[i27];
                    if (f63 < L12) {
                        f22 = 1.0f;
                        pow *= Math.max(0.0f, 1.0f - ((L12 - f63) / org.telegram.messenger.i0.L(24.0f)));
                    } else {
                        f22 = 1.0f;
                    }
                    float f64 = ((f22 - (f62 * f21)) * fArr10[i27]) / f7;
                    paint2 = paint;
                    paint2.setColor(-1);
                    paint2.setAlpha((int) (pow * 255.0f));
                    byte b10 = bArr[i27];
                    RectF rectF14 = x0Var.U5;
                    if (b10 >= 3) {
                        f23 = L12;
                        f24 = L13;
                        float f65 = f7;
                        float e = f1.e((float) Math.hypot(fArr8[i27], fArr9[i27]), org.telegram.messenger.i0.L(200.0f), 1.0f, f65);
                        float f66 = ((1.0f - (f62 * 0.4f)) * fArr10[i27]) / f65;
                        if (fArr5[i27] < rectF13.top - org.telegram.messenger.i0.L(70.0f)) {
                            pow *= Math.max(0.0f, 1.0f - (((rectF13.top - org.telegram.messenger.i0.L(70.0f)) - fArr5[i27]) / org.telegram.messenger.i0.L(16.0f)));
                        }
                        paint2.setAlpha((int) (pow * 255.0f));
                        canvas3.save();
                        f7 = f65;
                        rectF5 = rectF2;
                        rectF4 = rectF13;
                        canvas3.rotate((float) Math.toDegrees(Math.atan2(fArr9[i27], fArr8[i27])), fArr4[i27], fArr5[i27]);
                        float f67 = fArr4[i27];
                        float f68 = f66 * e;
                        float f69 = fArr5[i27];
                        rectF14.set(f67 - f68, f69 - f66, f67 + f68, f69 + f66);
                        canvas3.drawOval(rectF14, paint2);
                        canvas3.restore();
                        if (bArr[i27] == 4) {
                            paint2.setAlpha((int) (pow * 36.0f));
                            canvas3.drawCircle(fArr4[i27], fArr5[i27], f66 * 2.2f, paint2);
                        }
                    } else {
                        rectF4 = rectF13;
                        f23 = L12;
                        f24 = L13;
                        rectF5 = rectF2;
                        if (zArr[i27]) {
                            float f70 = fArr4[i27] - fArr6[i27];
                            float f71 = fArr5[i27] - fArr7[i27];
                            float sqrt = (float) Math.sqrt((f71 * f71) + (f70 * f70));
                            float f72 = fArr12[i27] / fArr11[i27];
                            float exp = fArr13[i27] * ((float) Math.exp((-sqrt) / org.telegram.messenger.i0.L(44.0f))) * (f72 < 0.08f ? f72 / 0.08f : (float) Math.pow(m5.y(f72, 0.08f, 0.92f, 1.0f), 0.550000011920929d));
                            float f73 = fArr5[i27];
                            if (f73 < f24) {
                                f25 = 1.0f;
                                exp *= Math.max(0.0f, 1.0f - ((f24 - f73) / org.telegram.messenger.i0.L(16.0f)));
                            } else {
                                f25 = 1.0f;
                            }
                            float min4 = (f25 - (Math.min(f25, sqrt / org.telegram.messenger.i0.L(70.0f)) * 0.4f)) * (fArr10[i27] / f7);
                            float hypot = (float) Math.hypot(fArr8[i27], fArr9[i27]);
                            float f74 = fArr4[i27];
                            float f75 = fArr5[i27];
                            if (fArr[i27] > 0.0f && hypot > 1.0f) {
                                float L14 = org.telegram.messenger.i0.L(3.0f) * ((float) Math.sin((fArr12[i27] * fArr[i27]) + fArr2[i27]));
                                f74 = a1.g.c(-fArr9[i27], hypot, L14, f74);
                                f75 = a1.g.c(fArr8[i27], hypot, L14, f75);
                            }
                            paint2.setAlpha((int) (exp * 255.0f));
                            float min5 = Math.min(1.8f, (hypot / org.telegram.messenger.i0.L(220.0f)) + 1.0f);
                            canvas3.save();
                            canvas3.rotate((float) Math.toDegrees(Math.atan2(fArr9[i27], fArr8[i27])), f74, f75);
                            float f76 = min4 * min5;
                            rectF14.set(f74 - f76, f75 - min4, f76 + f74, f75 + min4);
                            canvas3.drawOval(rectF14, paint2);
                            canvas3.restore();
                            if (bArr[i27] == 1) {
                                paint2.setAlpha((int) (exp * 36.0f));
                                canvas3.drawCircle(f74, f75, min4 * 2.2f, paint2);
                            }
                        } else {
                            canvas3.drawCircle(fArr4[i27], fArr5[i27], b10 == 1 ? f64 * f7 : f64, paint2);
                            if (bArr[i27] == 1) {
                                paint2.setAlpha((int) (pow * 36.0f));
                                canvas3.drawCircle(fArr4[i27], fArr5[i27], f64 * 4.4f, paint2);
                            }
                        }
                        i27--;
                        paint = paint2;
                        L12 = f23;
                        L13 = f24;
                        f55 = f21;
                        rectF2 = rectF5;
                        rectF13 = rectF4;
                        f20 = 0.12f;
                    }
                }
                i27--;
                paint = paint2;
                L12 = f23;
                L13 = f24;
                f55 = f21;
                rectF2 = rectF5;
                rectF13 = rectF4;
                f20 = 0.12f;
            }
            rectF = rectF2;
            if (z13) {
                canvas3.restore();
            }
        } else {
            textPaint = textPaint5;
            rectF = rectF7;
            f7 = 2.0f;
            f10 = f30;
            rectF6.setEmpty();
        }
        if (f10 > 0.001f) {
            long currentTimeMillis2 = System.currentTimeMillis();
            long j10 = x0Var.G2;
            long max4 = j10 > 0 ? Math.max(0L, (j10 - (currentTimeMillis2 / 1000)) - 1) : -1L;
            if (max4 != x0Var.N2) {
                x0Var.N2 = max4;
                x0Var.O2 = max4 >= 0 ? cd.a0(null, null, 2131746506, String.format(Locale.US, "%d:%02d", Long.valueOf(max4 / 60), Long.valueOf(max4 % 60))) : cd.L0(2131746513, null);
            }
            String str = x0Var.O2;
            textPaint.setTextSize(org.telegram.messenger.i0.L(11.0f));
            float measureText3 = textPaint.measureText(str) + org.telegram.messenger.i0.L(11.0f) + org.telegram.messenger.i0.L(11.0f);
            float L15 = org.telegram.messenger.i0.L(22.0f);
            float o11 = x0Var.o();
            float f77 = i10;
            float f78 = L15 / f7;
            RectF rectF15 = rectF;
            rectF15.set((f77 - measureText3) / f7, o11 - f78, (f77 + measureText3) / f7, o11 + f78);
            x0Var.z6 = true;
            float f79 = f10;
            x0Var.J(canvas3, rectF15, f78, f79);
            x0Var.z6 = false;
            textPaint.setColor(a(f79, -218103809));
            canvas3.drawText(str, rectF15.left + org.telegram.messenger.i0.L(11.0f), o11 + org.telegram.messenger.i0.L(4.0f), textPaint);
            if (x0Var.G2 > 0) {
                x0Var.postInvalidateDelayed(1005 - (currentTimeMillis2 % 1000));
            }
        }
    }

    public final void B0() {
        l2.f fVar;
        m0 m0Var;
        if (this.e2 || (fVar = this.c) == null || (m0Var = ((i0) fVar.b).e) == null) {
            return;
        }
        m0Var.j();
    }

    public final void C(Canvas canvas, Path path, RectF rectF, float f7, float f10) {
        int i10;
        RectF rectF2;
        float f11;
        float[][] fArr;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        int i11;
        int i12;
        Path path2 = path;
        int i13 = 1;
        if (path2 == null) {
            if (t.a(canvas, rectF, f7, this.z6 ? 1 : this.A6 ? 2 : 0, f10)) {
                return;
            }
        }
        int i14 = this.B6;
        SweepGradient[] sweepGradientArr = this.C6;
        int i15 = 4;
        float[][] fArr2 = y0.a;
        if (i14 != 1) {
            this.B6 = 1;
            int i16 = 0;
            while (i16 < i15) {
                float[] fArr3 = fArr2[i16];
                int i17 = i15;
                int[] iArr = new int[73];
                int i18 = i13;
                float[] fArr4 = new float[73];
                int i19 = 0;
                for (int i20 = 73; i19 < i20; i20 = 73) {
                    int i21 = i16;
                    double radians = Math.toRadians(i19 * 5);
                    float pow = (float) Math.pow(Math.abs(Math.cos(radians)), fArr3[6]);
                    float f17 = (((float) Math.sin(radians)) < 0.0f ? fArr3[11] : fArr3[12]) / 100.0f;
                    iArr[i19] = g(Math.min(1.0f, (((fArr3[5] / 100.0f) - f17) * pow) + f17), 0);
                    fArr4[i19] = i19 / 72.0f;
                    i19++;
                    i16 = i21;
                }
                int i22 = i16;
                sweepGradientArr[i22] = new SweepGradient(0.0f, 0.0f, iArr, fArr4);
                i16 = i22 + 1;
                i15 = i17;
                i13 = i18;
            }
        }
        int i23 = i13;
        int i24 = i15;
        int i25 = this.z6 ? i23 : this.A6 ? 2 : 0;
        float[] fArr5 = fArr2[i25];
        float f18 = this.D6;
        float[] fArr6 = y0.b;
        float f19 = f18 * fArr6[0];
        float f20 = (this.E6 * fArr6[i23]) / 100.0f;
        float N = org.telegram.messenger.i0.N(fArr5[8]);
        if (N != 0.0f) {
            rectF2 = this.c7;
            rectF2.set(rectF);
            rectF2.inset(N, N);
            if (path2 != null) {
                float width = rectF2.width() / Math.max(1.0f, rectF.width());
                float height = rectF2.height() / Math.max(1.0f, rectF.height());
                float centerX = rectF.centerX();
                float centerY = rectF.centerY();
                i10 = i25;
                Matrix matrix = this.W6;
                matrix.setScale(width, height, centerX, centerY);
                Path path3 = this.X6;
                path2.transform(matrix, path3);
                path2 = path3;
            } else {
                i10 = i25;
            }
            f11 = Math.max(0.0f, f7 - N);
        } else {
            i10 = i25;
            rectF2 = rectF;
            f11 = f7;
        }
        Matrix matrix2 = this.d7;
        matrix2.setRotate(f19);
        matrix2.postScale(rectF2.width() / Math.max(1.0f, rectF2.height()), 1.0f);
        matrix2.postTranslate(rectF2.centerX(), rectF2.centerY());
        float N2 = org.telegram.messenger.i0.N(fArr5[i24]);
        if (N2 > 0.05f) {
            SweepGradient sweepGradient = sweepGradientArr[i10];
            sweepGradient.setLocalMatrix(matrix2);
            Paint paint = this.A1;
            paint.setShader(sweepGradient);
            paint.setColor(-1);
            paint.setAlpha((int) (f10 * 255.0f));
            if (path2 == null) {
                paint.setStrokeWidth(N2);
                RectF rectF3 = this.V5;
                rectF3.set(rectF2);
                float f21 = (-N2) / 2.0f;
                rectF3.inset(f21, f21);
                float f22 = (N2 / 2.0f) + f11;
                canvas.drawRoundRect(rectF3, f22, f22, paint);
            } else {
                canvas.save();
                u.b(canvas, path2);
                paint.setStrokeWidth(N2 * 2.0f);
                canvas.drawPath(path2, paint);
                canvas.restore();
            }
            paint.setShader(null);
            paint.setAlpha(zs.e4);
        }
        double radians2 = Math.toRadians(f19);
        float f23 = (float) (-Math.sin(radians2));
        float cos = (float) Math.cos(radians2);
        float N3 = org.telegram.messenger.i0.N(fArr5[0]);
        float N4 = org.telegram.messenger.i0.N(fArr5[2]);
        float f24 = this.A6 ? 0.0f : this.b6 * ((fArr6[21] * 1.25f) / 100.0f);
        if (f24 <= 0.0f || !this.y3) {
            fArr = fArr2;
            f12 = 0.0f;
        } else {
            fArr = fArr2;
            f12 = c1(rectF2.centerX(), rectF2.top, getWidth(), getHeight());
        }
        float c12 = (f24 <= 0.0f || !this.y3) ? 0.0f : c1(rectF2.centerX(), rectF2.bottom, getWidth(), getHeight());
        float min = Math.min(1.0f, ((f12 * f24) + 1.0f) * (f20 + 1.0f) * (fArr5[i23] / 100.0f));
        float min2 = Math.min(1.0f, ((f24 * c12) + 1.0f) * (1.0f - f20) * (fArr5[3] / 100.0f));
        int i26 = Build.VERSION.SDK_INT >= 29 ? i23 : 0;
        int i27 = 0;
        for (int i28 = 2; i27 < i28; i28 = 2) {
            float f25 = i27 == 0 ? N3 : -N4;
            float f26 = i27 == 0 ? min : min2;
            if (f26 <= 0.004f || Math.abs(f25) < 0.1f) {
                f13 = f11;
                f14 = min;
                f15 = min2;
                f16 = f23;
                i11 = i26;
                i12 = i23;
            } else {
                canvas.save();
                Path path4 = this.Z6;
                f14 = min;
                Path path5 = this.a7;
                if (path2 == null) {
                    f15 = min2;
                    f16 = f23;
                    float min3 = Math.min(f11, Math.min(rectF2.width(), rectF2.height()) / 2.0f);
                    path4.rewind();
                    Path.Direction direction = Path.Direction.CW;
                    path4.addRoundRect(rectF2, min3, min3, direction);
                    f13 = f11;
                    RectF rectF4 = this.Y6;
                    rectF4.set(rectF2);
                    i11 = i26;
                    rectF4.offset(f16 * f25, f25 * cos);
                    path5.rewind();
                    path5.addRoundRect(rectF4, min3, min3, direction);
                } else {
                    f13 = f11;
                    f15 = min2;
                    f16 = f23;
                    i11 = i26;
                    path4.set(path2);
                    path5.set(path2);
                    path5.offset(f16 * f25, f25 * cos);
                }
                u.b(canvas, path5);
                Paint paint2 = this.z1;
                if (i11 == 0) {
                    float f27 = fArr[i10][10];
                    int i29 = this.b7;
                    paint2.setColor(Color.rgb(Math.max(0, Math.min(zs.e4, Math.round(((Color.red(i29) - zs.e4) * f27) + 255.0f))), Math.max(0, Math.min(zs.e4, Math.round(((Color.green(i29) - zs.e4) * f27) + 255.0f))), Math.max(0, Math.min(zs.e4, Math.round(((Color.blue(i29) - zs.e4) * f27) + 255.0f)))));
                    paint2.setAlpha((int) (f26 * 255.0f * f10));
                    i12 = i23;
                } else {
                    int round = Math.round(Math.max(0.0f, Math.min(1.0f, f26)) * 255.0f);
                    paint2.setColor(round | (round << 16) | (-16777216) | (round << 8));
                    paint2.setAlpha((int) (f10 * 255.0f));
                    i12 = i23;
                    u.i(i12, paint2);
                }
                canvas.drawPath(path4, paint2);
                if (i11 != 0) {
                    u.i(0, paint2);
                }
                canvas.restore();
            }
            i27++;
            i23 = i12;
            min = f14;
            min2 = f15;
            f23 = f16;
            f11 = f13;
            i26 = i11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0054, code lost:
    
        if (r8 != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(Canvas canvas, u0 u0Var, int i10, float f7, float f10, float f11, float f12, float f13) {
        float f14;
        Drawable drawable = u0Var.b[i10];
        if (drawable == null || f12 <= 0.01f) {
            return;
        }
        boolean z10 = drawable instanceof f5;
        Bitmap V = z10 ? V((f5) drawable) : null;
        boolean z11 = false;
        if (!z10 ? !(drawable instanceof g6) || ((g6) drawable).a() : V != null) {
            z11 = true;
        }
        long[] jArr = u0Var.y;
        if (!this.T2) {
            if (jArr != null && i10 < jArr.length) {
                if (jArr[i10] != 1) {
                    if (this.S4) {
                        if (z11) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (jArr[i10] == 0) {
                                jArr[i10] = elapsedRealtime;
                            }
                            f14 = Utilities.l(((elapsedRealtime - jArr[i10]) - b(f13)) / 380.0f);
                        }
                    } else if (this.V2 && z11) {
                        jArr[i10] = 1;
                    }
                }
                if (f14 <= 0.0f) {
                    return;
                }
                float C = c3.i0.C((float) Math.sin((this.M3 * 1.3f) + f11), 0.03f, 1.0f, (this.o0 + 1.0f) * (f14 < 1.0f ? h(f14) : 1.0f) * f12 * this.l0);
                int round = Math.round(f7 / 2.0f);
                if (V == null) {
                    canvas.save();
                    canvas.translate(this.J3, this.K3);
                    canvas.rotate(f10 + this.n0);
                    canvas.scale(C, C);
                    int i11 = -round;
                    drawable.setBounds(i11, i11, round, round);
                    drawable.setAlpha((int) (this.m0 * 255.0f));
                    if (r.d(drawable)) {
                        r.b(canvas, drawable);
                    } else {
                        drawable.draw(canvas);
                    }
                    drawable.setAlpha(zs.e4);
                    canvas.restore();
                    return;
                }
                float f15 = round * C;
                canvas.save();
                canvas.translate(this.J3, this.K3);
                canvas.rotate(f10 + this.n0);
                float f16 = -f15;
                RectF rectF = this.P4;
                rectF.set(f16, f16, f15, f15);
                if (r.d(drawable)) {
                    int i12 = (int) (this.m0 * 255.0f);
                    Paint paint = this.O4;
                    paint.setAlpha(i12);
                    canvas.drawBitmap(V, (Rect) null, rectF, paint);
                } else {
                    int i13 = (int) (this.m0 * 255.0f);
                    Paint paint2 = this.N4;
                    paint2.setAlpha(i13);
                    canvas.drawBitmap(V, (Rect) null, rectF, paint2);
                }
                canvas.restore();
                return;
            }
            f14 = 0.0f;
            if (f14 <= 0.0f) {
            }
        }
        f14 = 1.0f;
        if (f14 <= 0.0f) {
        }
    }

    public final void E(Canvas canvas, int i10, int i11, u0 u0Var, u0 u0Var2, float f7, boolean z10, boolean z11) {
        float f10;
        int i12;
        float f11;
        boolean z12;
        float f12;
        float f13;
        int i13;
        int i14;
        x0 x0Var = this;
        u0 u0Var3 = u0Var;
        u0 u0Var4 = u0Var2;
        x0Var.X(u0Var3);
        x0Var.X(u0Var4);
        float L = org.telegram.messenger.i0.L(86.0f);
        float L2 = org.telegram.messenger.i0.L(70.0f);
        float L3 = org.telegram.messenger.i0.L(90.0f) * 1.3f;
        float f14 = x0Var.K + x0Var.N;
        float f15 = x0Var.L + x0Var.O;
        float f16 = -L3;
        boolean z13 = true;
        int floor = ((int) Math.floor((f16 - f15) / L2)) - 1;
        int ceil = ((int) Math.ceil(((i11 + L3) - f15) / L2)) + 1;
        org.telegram.messenger.i0.L(24.0f);
        int i15 = floor;
        while (i15 <= ceil) {
            int i16 = i15 & 1;
            float f17 = i16 == 0 ? 0.0f : L / 2.0f;
            boolean z14 = z13;
            int floor2 = ((int) Math.floor(((f16 - f14) - f17) / L)) - 1;
            int i17 = i10;
            float f18 = L3;
            int ceil2 = ((int) Math.ceil((((i17 + L3) - f14) - f17) / L)) + 1;
            while (floor2 <= ceil2) {
                float f19 = L2;
                int i18 = ceil2;
                double u02 = u0(i15, floor2);
                if (c0(53.1d * u02) < 0.2f) {
                    f10 = f14;
                    i14 = floor2;
                    i12 = ceil;
                    i13 = i15;
                    f12 = f17;
                    f11 = L;
                    z12 = z14;
                    f13 = f16;
                } else {
                    x0Var.G0(u02, 3.0f, 10.0f);
                    float f20 = f16;
                    float f21 = (float) (2.0d * u02 * 3.141592653589793d);
                    f10 = f14;
                    float d = x0Var.L4 + sc.e.d(floor2, L, f17, f14);
                    float sin = (((float) Math.sin((x0Var.M3 * 0.45f) + f21)) * org.telegram.messenger.i0.L(3.0f)) + (i15 * f19) + f15 + x0Var.M4;
                    boolean z15 = i16 == 0 ? z14 : false;
                    i12 = ceil;
                    float f22 = (float) u02;
                    float C = c3.i0.C(f22, 0.16f, 0.92f, org.telegram.messenger.i0.L(38.0f) * (z15 ? 1.3f : 0.9f));
                    f11 = L;
                    z12 = z14;
                    f12 = f17;
                    f13 = f20;
                    int i19 = floor2;
                    i13 = i15;
                    i14 = i19;
                    if (J0(d, sin, C, i17, i11, 0, i15, i19, (Math.max(0.0f, (C / org.telegram.messenger.i0.L(24.0f)) - 1.0f) * 0.8f) + 1.0f)) {
                        if (z15) {
                            C *= 0.9f;
                        }
                        float f23 = C;
                        float sin2 = (((float) Math.sin((this.M3 * 0.3f) + f21)) * 4.0f) + ((f22 - 0.5f) * 26.0f);
                        float c02 = c0(59.3d * u02) * 0.3f;
                        int i20 = (i14 - ((i13 - i16) / 2)) - i13;
                        int length = u0Var4.b.length;
                        int i21 = ((i20 % length) + length) % length;
                        float c03 = c0(71.9d * u02);
                        if (u0Var3 == null) {
                            D(canvas, u0Var4, i21, f23, sin2, f21 * 2.0f, f1(z10, z11, f7 - c02), c03);
                        } else {
                            u0 u0Var5 = u0Var4;
                            Drawable[] drawableArr = u0Var3.b;
                            int length2 = drawableArr.length;
                            int i22 = ((i20 % length2) + length2) % length2;
                            if (drawableArr[i22] == u0Var5.b[i21]) {
                                D(canvas, u0Var5, i21, f23, sin2, f21 * 2.0f, 1.0f, c03);
                            } else {
                                float f24 = f21 * 2.0f;
                                float f25 = f7 - c02;
                                D(canvas, u0Var3, i22, f23, sin2, f24, f1(z12, false, f25), c03);
                                D(canvas, u0Var2, i21, f23, sin2, f24, f1(false, false, f25), c03);
                            }
                        }
                    }
                }
                floor2 = i14 + 1;
                x0Var = this;
                i17 = i10;
                u0Var3 = u0Var;
                u0Var4 = u0Var2;
                i15 = i13;
                f16 = f13;
                ceil2 = i18;
                f17 = f12;
                f14 = f10;
                ceil = i12;
                L = f11;
                z14 = z12;
                L2 = f19;
            }
            i15++;
            x0Var = this;
            u0Var3 = u0Var;
            u0Var4 = u0Var2;
            z13 = z14;
            L2 = L2;
            L3 = f18;
        }
    }

    public final void E0(u0 u0Var, Bitmap bitmap) {
        u0Var.e = bitmap;
        if (bitmap != null) {
            if (y0.b[35] > 0.5f) {
                Y(bitmap);
            }
            x0(u0Var);
        }
        u0Var.g = AnimationUtils.currentAnimationTimeMillis();
        this.g2 = bitmap;
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0802  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x088e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x07e4  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0747  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F(Canvas canvas, int i10, int i11, u0 u0Var, boolean z10, boolean z11, float f7) {
        long[] jArr;
        float[] fArr;
        float f10;
        float[] fArr2;
        float[] fArr3;
        float[] fArr4;
        float[] fArr5;
        float f11;
        float f12;
        char c10;
        float f13;
        float f14;
        float l4;
        long j10;
        boolean z12;
        float f15;
        Rect rect;
        Bitmap bitmap;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float[] fArr6;
        float[] fArr7;
        float[] fArr8;
        float[] fArr9;
        int[] iArr;
        int[] iArr2;
        float f21;
        boolean[] zArr;
        long[] jArr2;
        float f22;
        float f23;
        float f24;
        float f25;
        u0 u0Var2;
        Paint paint;
        float f26;
        Bitmap bitmap2;
        Paint paint2;
        int i12;
        float f27;
        x0 x0Var = this;
        if (u0Var != null) {
            Paint paint3 = u0Var.i;
            Paint paint4 = u0Var.v;
            int i13 = u0Var.a;
            if (i13 == 0) {
                return;
            }
            float f28 = x0Var.v3;
            if (i13 == 1) {
                x0Var.E(canvas, i10, i11, null, u0Var, f7, z10, z11);
                return;
            }
            u0 u0Var3 = u0Var;
            float f29 = x0Var.K + x0Var.N;
            float f30 = x0Var.L + x0Var.O;
            float L = org.telegram.messenger.i0.L(90.0f) * 1.3f;
            float L2 = org.telegram.messenger.i0.L(170.0f);
            float L3 = org.telegram.messenger.i0.L(150.0f);
            x0Var.K4 = 0;
            float f31 = -(org.telegram.messenger.i0.L(60.0f) + L);
            boolean z13 = true;
            Paint paint5 = paint3;
            int floor = ((int) Math.floor((f31 - f30) / L3)) - 1;
            float f32 = i11;
            int ceil = ((int) Math.ceil(((f32 + r8) - f30) / L3)) + 1;
            while (true) {
                jArr = x0Var.J4;
                fArr = x0Var.H4;
                f10 = f32;
                fArr2 = x0Var.G4;
                fArr3 = x0Var.F4;
                fArr4 = x0Var.E4;
                float f33 = f31;
                fArr5 = x0Var.I4;
                f11 = 0.5f;
                f12 = 2.0f;
                c10 = 0;
                if (floor > ceil) {
                    f13 = 0.0f;
                    break;
                }
                f13 = 0.0f;
                if (x0Var.K4 >= 96) {
                    break;
                }
                float f34 = (floor & 1) == 0 ? 0.0f : L2 / 2.0f;
                int i14 = ceil;
                int floor2 = ((int) Math.floor(((f33 - f29) - f34) / L2)) - 1;
                int ceil2 = ((int) Math.ceil((((i10 + r8) - f29) - f34) / L2)) + 1;
                while (floor2 <= ceil2 && x0Var.K4 < 96) {
                    float f35 = L2;
                    double u02 = u0(floor, floor2);
                    x0Var.G0(u02, 5.0f, 12.0f);
                    float f36 = f29;
                    fArr4[x0Var.K4] = (org.telegram.messenger.i0.L(76.0f) * (c0(u02 * 3.7d) - 0.5f)) + sc.e.d(floor2, f35, f34, f29) + x0Var.L4;
                    fArr3[x0Var.K4] = (org.telegram.messenger.i0.L(64.0f) * (c0(u02 * 5.3d) - 0.5f)) + (floor * L3) + f30 + x0Var.M4;
                    fArr2[x0Var.K4] = (c0(u02 * 11.9d) * org.telegram.messenger.i0.L(32.0f)) + org.telegram.messenger.i0.L(62.0f);
                    fArr[x0Var.K4] = (c0(17.3d * u02) - 0.5f) * 22.0f;
                    int i15 = x0Var.K4;
                    fArr5[i15] = (float) u02;
                    jArr[i15] = (floor << 32) ^ (floor2 & 4294967295L);
                    x0Var.K4 = i15 + 1;
                    floor2++;
                    L2 = f35;
                    ceil2 = ceil2;
                    f29 = f36;
                }
                floor++;
                L2 = L2;
                f32 = f10;
                f31 = f33;
                ceil = i14;
                f29 = f29;
            }
            float f37 = f29;
            x0Var.X(u0Var3);
            x0Var.Z(u0Var3);
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            Bitmap bitmap3 = u0Var3.e;
            Bitmap bitmap4 = bitmap3 != null ? bitmap3 : u0Var3.f;
            float l10 = (bitmap3 == null || u0Var3.f == null) ? 1.0f : Utilities.l((currentAnimationTimeMillis - u0Var3.g) / 150.0f);
            if (bitmap4 != null) {
                org.telegram.messenger.i0.L(44.0f);
                org.telegram.messenger.i0.L(38.0f);
                org.telegram.messenger.i0.L(17.0f);
                int i16 = u0Var3.r;
                x0Var.e4 = 0;
                float width = bitmap4.getWidth() / 2.0f;
                float f38 = 7.0f;
                if (x0Var.j4 != i16 || x0Var.f4 == null) {
                    x0Var.j4 = i16;
                    f16 = 0.55f;
                    Random random = new Random((i16 * 7919) + 20973);
                    float L4 = org.telegram.messenger.i0.L(300.0f);
                    int round = Math.round(33.46154f);
                    x0Var.f4 = new float[round];
                    x0Var.g4 = new float[round];
                    x0Var.h4 = new float[round];
                    int i17 = 0;
                    x0Var.i4 = 0;
                    int i18 = 0;
                    f17 = 0.35f;
                    while (i18 < round) {
                        float nextFloat = random.nextFloat();
                        f18 = 1.0f;
                        float L5 = ((((((nextFloat * 0.75f) * nextFloat) + 0.55f) * (org.telegram.messenger.i0.L(21.0f) * 1.1f)) / 2.0f) * 1.25f) + org.telegram.messenger.i0.L(7.0f);
                        int i19 = i18 + 12;
                        float f39 = f13;
                        float f40 = -3.4028235E38f;
                        float f41 = f39;
                        while (i17 < i19) {
                            float nextFloat2 = random.nextFloat() * L4;
                            float nextFloat3 = random.nextFloat() * L4;
                            int i20 = i18;
                            float f42 = Float.MAX_VALUE;
                            int i21 = i19;
                            int i22 = 0;
                            while (i22 < x0Var.i4) {
                                float abs = Math.abs(nextFloat2 - x0Var.f4[i22]);
                                float abs2 = Math.abs(nextFloat3 - x0Var.g4[i22]);
                                float f43 = L4 / 2.0f;
                                if (abs > f43) {
                                    abs = L4 - abs;
                                }
                                float f44 = abs;
                                if (abs2 > f43) {
                                    f19 = L4;
                                    f20 = L4 - abs2;
                                } else {
                                    f19 = L4;
                                    f20 = abs2;
                                }
                                int i23 = round;
                                float f45 = x0Var.h4[i22];
                                int i24 = i17;
                                f42 = Math.min(f42, ((((float) Math.hypot(f44, f20)) - L5) - (((((((f45 * 0.75f) * f45) + 0.55f) * (org.telegram.messenger.i0.L(21.0f) * 1.1f)) / 2.0f) * 1.25f) + org.telegram.messenger.i0.L(7.0f))) - ((nextFloat <= 0.7f || f45 <= 0.7f) ? f13 : org.telegram.messenger.i0.L(10.0f)));
                                i22++;
                                random = random;
                                L4 = f19;
                                round = i23;
                                i17 = i24;
                            }
                            float f46 = L4;
                            int i25 = round;
                            int i26 = i17;
                            Random random2 = random;
                            if (f42 > f40) {
                                f40 = f42;
                                f41 = nextFloat2;
                                f39 = nextFloat3;
                            }
                            i17 = i26 + 1;
                            random = random2;
                            i18 = i20;
                            i19 = i21;
                            L4 = f46;
                            round = i25;
                        }
                        int i27 = i18;
                        float f47 = L4;
                        int i28 = round;
                        Random random3 = random;
                        if (x0Var.i4 > 0 && f40 < org.telegram.messenger.i0.L(3.5f)) {
                            break;
                        }
                        float[] fArr10 = x0Var.f4;
                        int i29 = x0Var.i4;
                        fArr10[i29] = f41;
                        x0Var.g4[i29] = f39;
                        x0Var.h4[i29] = nextFloat;
                        x0Var.i4 = i29 + 1;
                        i18 = i27 + 1;
                        random = random3;
                        L4 = f47;
                        round = i28;
                        i17 = 0;
                    }
                } else {
                    f17 = 0.35f;
                    f16 = 0.55f;
                }
                f18 = 1.0f;
                float L6 = org.telegram.messenger.i0.L(300.0f);
                float f48 = -L;
                int floor3 = ((int) Math.floor((f48 - f30) / L6)) - 1;
                float f49 = f10 + L;
                int ceil3 = (int) Math.ceil((f49 - f30) / L6);
                int floor4 = ((int) Math.floor((f48 - f37) / L6)) - 1;
                float f50 = i10 + L;
                int ceil4 = (int) Math.ceil((f50 - f37) / L6);
                while (true) {
                    fArr6 = x0Var.d4;
                    float f51 = f49;
                    fArr7 = x0Var.c4;
                    fArr8 = x0Var.b4;
                    fArr9 = x0Var.a4;
                    iArr = x0Var.Z3;
                    iArr2 = x0Var.Y3;
                    if (floor3 > ceil3) {
                        break;
                    }
                    int i30 = floor4;
                    while (i30 <= ceil4) {
                        int i31 = ceil4;
                        float f52 = f48;
                        int i32 = 0;
                        while (i32 < x0Var.i4) {
                            int i33 = i32;
                            if (x0Var.e4 < 1024) {
                                float f53 = (i30 * L6) + x0Var.f4[i33];
                                float f54 = (floor3 * L6) + x0Var.g4[i33];
                                float f55 = f53 + f37;
                                float f56 = f54 + f30;
                                if (f55 < f52 - org.telegram.messenger.i0.L(20.0f) || f55 > org.telegram.messenger.i0.L(20.0f) + f50 || f56 < f52 - org.telegram.messenger.i0.L(20.0f) || f56 > f51 + org.telegram.messenger.i0.L(20.0f)) {
                                    i12 = i30;
                                } else {
                                    float f57 = x0Var.h4[i33];
                                    float L7 = ((((((f57 * 0.75f) * f57) + f16) * (org.telegram.messenger.i0.L(21.0f) * 1.1f)) / 2.0f) * 1.25f) + org.telegram.messenger.i0.L(7.0f);
                                    float L8 = org.telegram.messenger.i0.L(170.0f);
                                    float L10 = org.telegram.messenger.i0.L(150.0f);
                                    int round2 = Math.round(f54 / L10);
                                    int i34 = round2 - 1;
                                    while (true) {
                                        i12 = i30;
                                        if (i34 > round2 + 1) {
                                            int i35 = x0Var.e4;
                                            iArr2[i35] = (floor3 * TLObject.FLAG_12) + i33;
                                            iArr[i35] = i12;
                                            fArr9[i35] = f53;
                                            fArr8[i35] = f54;
                                            fArr7[i35] = f18;
                                            fArr6[i35] = f57;
                                            x0Var.e4 = i35 + 1;
                                            break;
                                        }
                                        float f58 = (i34 & 1) == 0 ? f13 : L8 / 2.0f;
                                        int round3 = Math.round((f53 - f58) / L8);
                                        float f59 = f58;
                                        int i36 = round3 - 1;
                                        while (true) {
                                            f27 = f54;
                                            if (i36 <= round3 + 1) {
                                                double u03 = u0(i34, i36);
                                                int i37 = i36;
                                                float c02 = ((c0(u03 * 3.7d) - 0.5f) * org.telegram.messenger.i0.L(76.0f)) + (i36 * L8) + f59;
                                                int i38 = i34;
                                                float c03 = ((c0(u03 * 5.3d) - 0.5f) * org.telegram.messenger.i0.L(64.0f)) + (i34 * L10);
                                                float c04 = (c0(u03 * 11.9d) * org.telegram.messenger.i0.L(32.0f)) + org.telegram.messenger.i0.L(62.0f);
                                                float c05 = L7 < f13 ? c04 * 0.66f : (((c0(u03 * 31.7d) * 7.0f) + 5.0f) * org.telegram.messenger.i0.L(f18)) + (c04 * f17) + L7 + org.telegram.messenger.i0.L(3.5f);
                                                float f60 = c02 - f53;
                                                float f61 = c03 - f27;
                                                if ((f61 * f61) + (f60 * f60) < c05 * c05) {
                                                    break;
                                                }
                                                i36 = i37 + 1;
                                                f54 = f27;
                                                i34 = i38;
                                            }
                                        }
                                        i34++;
                                        i30 = i12;
                                        f54 = f27;
                                    }
                                }
                                i32 = i33 + 1;
                                i30 = i12;
                            }
                        }
                        i30++;
                        ceil4 = i31;
                        f48 = f52;
                    }
                    floor3++;
                    f49 = f51;
                }
                int i39 = 0;
                while (i39 < x0Var.e4) {
                    int i40 = iArr2[i39];
                    int i41 = iArr[i39];
                    double u04 = u0(i40, i41);
                    float f62 = fArr9[i39];
                    float f63 = fArr8[i39];
                    float f64 = fArr7[i39];
                    float f65 = fArr6[i39];
                    int i42 = i39;
                    x0Var.G0(u04, f12, f38);
                    float f66 = f62 + f37 + x0Var.L4;
                    float f67 = f63 + f30 + x0Var.M4;
                    float c06 = c0(7.31d * u04);
                    float L11 = ((f65 * 0.75f * f65) + f16) * org.telegram.messenger.i0.L(21.0f) * 1.1f * f64;
                    int[] iArr3 = iArr2;
                    Bitmap bitmap5 = bitmap4;
                    Paint paint6 = paint4;
                    long[] jArr3 = jArr;
                    f38 = 7.0f;
                    x0Var = this;
                    if (x0Var.J0(f66, f67, L11, i10, i11, 1, i40, i41, (Math.max(f13, (L11 / org.telegram.messenger.i0.L(15.0f)) - f18) * 0.8f) + f18)) {
                        float f110 = f1(z10, z11, f7 - ((u0Var3.h || (z10 && x0Var.F.h)) ? x0Var.x1(x0Var.J3, x0Var.K3, i10, i11) : c0(u04 * 53.1d) * 0.3f));
                        if (f110 > 0.01f) {
                            float L0 = x0Var.L0(1.0f);
                            float f68 = x0Var.p0;
                            long j11 = (i41 & 4294967295L) ^ (i40 << 32);
                            int i43 = ((int) (((-7046029254386353131L) * j11) >>> 53)) & 2047;
                            int i44 = 0;
                            while (true) {
                                f21 = f110;
                                zArr = x0Var.y4;
                                jArr2 = x0Var.s4;
                                if (i44 >= 2048 || !zArr[i43] || jArr2[i43] == j11) {
                                    break;
                                }
                                i44++;
                                i43 = (i43 + 1) & 2047;
                                f110 = f21;
                            }
                            long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                            boolean z14 = zArr[i43];
                            float[] fArr11 = y0.b;
                            float[] fArr12 = x0Var.v4;
                            float[] fArr13 = x0Var.t4;
                            long[] jArr4 = x0Var.x4;
                            float[] fArr14 = x0Var.w4;
                            float[] fArr15 = x0Var.u4;
                            if (z14 && jArr2[i43] == j11) {
                                f22 = L11;
                                if (currentAnimationTimeMillis2 - jArr4[i43] <= 1000) {
                                    float exp = 1.0f - ((float) Math.exp((-Math.min(64.0f, r3)) / Math.max(10.0f, (((Math.abs(L0) > Math.abs(fArr15[i43]) || f68 > fArr14[i43]) ? fArr11[48] : fArr11[49]) / 3.4f) / 2.0f)));
                                    float f69 = fArr13[i43];
                                    float z15 = c3.i0.z(L0, f69, exp, f69);
                                    fArr13[i43] = z15;
                                    float f70 = fArr15[i43];
                                    fArr15[i43] = c3.i0.z(z15, f70, exp, f70);
                                    float f71 = fArr12[i43];
                                    float z16 = c3.i0.z(f68, f71, exp, f71);
                                    fArr12[i43] = z16;
                                    float f72 = fArr14[i43];
                                    fArr14[i43] = c3.i0.z(z16, f72, exp, f72);
                                    jArr4[i43] = currentAnimationTimeMillis2;
                                    f23 = fArr15[i43];
                                    float f73 = fArr14[i43];
                                    if (Math.abs(f23) <= 0.05f || f73 > 0.002f) {
                                        x0Var.invalidate();
                                    }
                                    float f74 = (x0Var.H3 * f23) + x0Var.J3;
                                    float f75 = (x0Var.I3 * f23) + x0Var.K3;
                                    f24 = x0Var.p0;
                                    float f76 = c0(61.37d * u04) * 100.0f >= fArr11[17] ? fArr11[18] / 100.0f : 1.0f;
                                    f25 = 0.35f;
                                    float pow = (float) Math.pow((Math.sin((u04 * 6.283d) + c3.i0.C(c06, 0.55f, 0.35f, f28)) * 0.5d) + 0.5d, 2.0d);
                                    float C = (((((fArr11[43] / 100.0f) * f73) + 1.0f) * c3.i0.C(pow, 0.1f, (0.06f * f24) + 1.0f, (x0Var.o0 + 1.0f) * (x0Var.l0 * f21))) * f22) / bitmap5.getWidth();
                                    float f77 = fArr11[44] * f73;
                                    canvas.save();
                                    canvas.translate(f74, f75);
                                    canvas.rotate(((c06 - 0.5f) * 70.0f) + x0Var.n0 + f77);
                                    canvas.scale(C, C);
                                    int i45 = (int) (((pow * 0.15f) + 0.85f) * x0Var.m0 * 255.0f * f76);
                                    if (l10 >= 1.0f) {
                                        paint = paint5;
                                        paint.setAlpha((int) ((1.0f - l10) * i45));
                                        u0Var2 = u0Var;
                                        f26 = width;
                                        float f78 = -f26;
                                        canvas.drawBitmap(r0(u0Var2, u0Var2.f, z13), f78, f78, paint);
                                    } else {
                                        u0Var2 = u0Var;
                                        paint = paint5;
                                        f26 = width;
                                    }
                                    paint.setAlpha((int) (i45 * l10));
                                    bitmap2 = bitmap5;
                                    float f79 = -f26;
                                    canvas.drawBitmap(r0(u0Var2, bitmap2, false), f79, f79, paint);
                                    if (f24 <= 0.01f) {
                                        ColorFilter colorFilter = paint6.getColorFilter();
                                        paint2 = paint6;
                                        paint2.setColorFilter(x0(u0Var2));
                                        paint2.setAlpha((int) (Math.min(1.0f, (fArr11[13] * f24) / 100.0f) * 255.0f * x0Var.m0 * l10));
                                        canvas.drawBitmap(bitmap2, f79, f79, paint2);
                                        paint2.setColorFilter(colorFilter);
                                        float f80 = fArr11[35];
                                        Paint paint7 = x0Var.z4;
                                        if (f80 > 0.5f && x0Var.Y(bitmap2)) {
                                            paint7.setColorFilter(x0Var.A0(u0Var2));
                                            paint7.setAlpha((int) (Math.min(255.0f, ((f24 * 255.0f) * fArr11[37]) / 100.0f) * x0Var.m0 * l10));
                                            canvas.drawBitmap(x0Var.S3, f79, f79, paint7);
                                        }
                                        float f81 = (x0Var.n4 * fArr11[22]) / 100.0f;
                                        if (f81 > 0.01f) {
                                            paint7.setColorFilter(x0Var.A0(u0Var2));
                                            paint7.setAlpha((int) (Math.min(1.0f, f81) * 255.0f * x0Var.m0 * l10));
                                            canvas.drawBitmap(bitmap2, f79, f79, paint7);
                                        }
                                    } else {
                                        paint2 = paint6;
                                    }
                                    canvas.restore();
                                    i39 = i42 + 1;
                                    bitmap4 = bitmap2;
                                    paint5 = paint;
                                    width = f26;
                                    paint4 = paint2;
                                    u0Var3 = u0Var2;
                                    jArr = jArr3;
                                    iArr2 = iArr3;
                                    f17 = f25;
                                    z13 = true;
                                    f12 = 2.0f;
                                    c10 = 0;
                                    f13 = 0.0f;
                                    f16 = 0.55f;
                                    f18 = 1.0f;
                                }
                            } else {
                                f22 = L11;
                            }
                            zArr[i43] = z13;
                            jArr2[i43] = j11;
                            fArr15[i43] = L0;
                            fArr13[i43] = L0;
                            fArr14[i43] = f68;
                            fArr12[i43] = f68;
                            jArr4[i43] = currentAnimationTimeMillis2;
                            f23 = fArr15[i43];
                            float f732 = fArr14[i43];
                            if (Math.abs(f23) <= 0.05f) {
                            }
                            x0Var.invalidate();
                            float f742 = (x0Var.H3 * f23) + x0Var.J3;
                            float f752 = (x0Var.I3 * f23) + x0Var.K3;
                            f24 = x0Var.p0;
                            if (c0(61.37d * u04) * 100.0f >= fArr11[17]) {
                            }
                            f25 = 0.35f;
                            float pow2 = (float) Math.pow((Math.sin((u04 * 6.283d) + c3.i0.C(c06, 0.55f, 0.35f, f28)) * 0.5d) + 0.5d, 2.0d);
                            float C2 = (((((fArr11[43] / 100.0f) * f732) + 1.0f) * c3.i0.C(pow2, 0.1f, (0.06f * f24) + 1.0f, (x0Var.o0 + 1.0f) * (x0Var.l0 * f21))) * f22) / bitmap5.getWidth();
                            float f772 = fArr11[44] * f732;
                            canvas.save();
                            canvas.translate(f742, f752);
                            canvas.rotate(((c06 - 0.5f) * 70.0f) + x0Var.n0 + f772);
                            canvas.scale(C2, C2);
                            int i452 = (int) (((pow2 * 0.15f) + 0.85f) * x0Var.m0 * 255.0f * f76);
                            if (l10 >= 1.0f) {
                            }
                            paint.setAlpha((int) (i452 * l10));
                            bitmap2 = bitmap5;
                            float f792 = -f26;
                            canvas.drawBitmap(r0(u0Var2, bitmap2, false), f792, f792, paint);
                            if (f24 <= 0.01f) {
                            }
                            canvas.restore();
                            i39 = i42 + 1;
                            bitmap4 = bitmap2;
                            paint5 = paint;
                            width = f26;
                            paint4 = paint2;
                            u0Var3 = u0Var2;
                            jArr = jArr3;
                            iArr2 = iArr3;
                            f17 = f25;
                            z13 = true;
                            f12 = 2.0f;
                            c10 = 0;
                            f13 = 0.0f;
                            f16 = 0.55f;
                            f18 = 1.0f;
                        }
                    }
                    u0Var2 = u0Var3;
                    paint = paint5;
                    paint2 = paint6;
                    bitmap2 = bitmap5;
                    f26 = width;
                    f25 = 0.35f;
                    i39 = i42 + 1;
                    bitmap4 = bitmap2;
                    paint5 = paint;
                    width = f26;
                    paint4 = paint2;
                    u0Var3 = u0Var2;
                    jArr = jArr3;
                    iArr2 = iArr3;
                    f17 = f25;
                    z13 = true;
                    f12 = 2.0f;
                    c10 = 0;
                    f13 = 0.0f;
                    f16 = 0.55f;
                    f18 = 1.0f;
                }
                f14 = f17;
            } else {
                f14 = 0.35f;
            }
            long[] jArr5 = jArr;
            u0 u0Var4 = u0Var3;
            f5 f5Var = u0Var4.d;
            Bitmap V = f5Var != null ? x0Var.V(f5Var) : null;
            Bitmap bitmap6 = (V == null || V.isRecycled()) ? null : V;
            Bitmap bitmap7 = u0Var4.D;
            if (bitmap6 == null && bitmap7 == null) {
                return;
            }
            if (u0Var4.C == 0 && x0Var.V2) {
                u0Var4.C = 1L;
            }
            if (u0Var4.C == 0 && x0Var.S4) {
                u0Var4.C = SystemClock.elapsedRealtime();
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (bitmap6 != null && u0Var4.E == 0) {
                u0Var4.E = (bitmap7 == null || u0Var4.C == 0) ? 1L : elapsedRealtime;
            }
            if (bitmap6 == null) {
                l4 = 0.0f;
            } else {
                l4 = u0Var4.E == 1 ? 1.0f : Utilities.l((elapsedRealtime - r8) / 150.0f);
            }
            if (l4 > 0.0f && l4 < 1.0f) {
                x0Var.invalidate();
            }
            if (x0Var.T2) {
                j10 = Long.MAX_VALUE;
            } else {
                long j12 = u0Var4.C;
                j10 = j12 == 0 ? -1L : elapsedRealtime - j12;
            }
            org.telegram.messenger.i0.L(41.0f);
            int i46 = 0;
            while (i46 < x0Var.K4) {
                long j13 = j10;
                float f82 = fArr2[i46];
                float sin = fArr3[i46] + (((float) Math.sin((fArr5[i46] * 2.0f * 3.141592653589793d) + (x0Var.M3 * f14))) * org.telegram.messenger.i0.L(3.0f));
                Bitmap bitmap8 = bitmap7;
                float f83 = fArr4[i46];
                long j14 = jArr5[i46];
                Bitmap bitmap9 = bitmap6;
                int i47 = i46;
                if (x0Var.J0(f83, sin, f82, i10, i11, 2, (int) (j14 >> 32), (int) j14, (Math.max(0.0f, (f82 / org.telegram.messenger.i0.L(40.0f)) - 1.0f) * 0.8f) + 1.0f)) {
                    z12 = z11;
                    float f111 = f1(z10, z12, f7 - ((u0Var4.h || (z10 && x0Var.F.h)) ? x0Var.x1(x0Var.J3, x0Var.K3, i10, i11) : c0(fArr5[i47] * 53.1d) * 0.3f));
                    if (f111 > 0.01f) {
                        float l11 = Utilities.l((j13 - x0Var.b(fArr5[i47])) / 380.0f);
                        if (l11 <= 0.0f) {
                            bitmap = bitmap9;
                            f15 = f11;
                            bitmap6 = bitmap;
                            j10 = j13;
                            f11 = f15;
                            i46 = i47 + 1;
                            bitmap7 = bitmap8;
                        } else {
                            float C3 = (f82 / 2.0f) * c3.i0.C((float) Math.sin((fArr5[i47] * 12.6f) + (x0Var.M3 * 1.3f)), 0.03f, 1.0f, (x0Var.o0 + 1.0f) * f111 * (l11 < 1.0f ? h(l11) : 1.0f) * x0Var.l0);
                            f15 = f11;
                            float L02 = x0Var.L0(f15);
                            canvas.save();
                            canvas.translate((x0Var.H3 * L02) + x0Var.J3, (x0Var.I3 * L02) + x0Var.K3);
                            canvas.rotate(fArr[i47] + x0Var.n0);
                            float f84 = -C3;
                            RectF rectF = x0Var.D4;
                            rectF.set(f84, f84, C3, C3);
                            if (bitmap8 == null) {
                                rect = null;
                            } else if (l4 < 1.0f) {
                                int i48 = (int) ((1.0f - l4) * x0Var.m0 * 38.25f);
                                Paint paint8 = x0Var.C4;
                                paint8.setAlpha(i48);
                                rect = null;
                                canvas.drawBitmap(bitmap8, (Rect) null, rectF, paint8);
                            } else {
                                rect = null;
                            }
                            if (bitmap9 != null) {
                                int i49 = (int) (x0Var.m0 * 255.0f * l4);
                                Paint paint9 = x0Var.B4;
                                paint9.setAlpha(i49);
                                bitmap = bitmap9;
                                canvas.drawBitmap(bitmap, rect, rectF, paint9);
                            } else {
                                bitmap = bitmap9;
                            }
                            canvas.restore();
                            bitmap6 = bitmap;
                            j10 = j13;
                            f11 = f15;
                            i46 = i47 + 1;
                            bitmap7 = bitmap8;
                        }
                    }
                } else {
                    z12 = z11;
                }
                bitmap = bitmap9;
                f15 = f11;
                bitmap6 = bitmap;
                j10 = j13;
                f11 = f15;
                i46 = i47 + 1;
                bitmap7 = bitmap8;
            }
        }
    }

    public final void F0(int i10) {
        if (this.a) {
            if (i10 == 2 && !d20.i(this.b).q()) {
                d1(0, cd.L0(2131746489, null), cd.L0(2131746488, null));
                i0();
                return;
            }
            if (i10 == 2 && (this.h1 != i10 || this.f1 < 0.5f)) {
                AnimationUtils.currentAnimationTimeMillis();
            }
            this.h1 = i10;
            this.i1 = i10;
            this.j1 = 0.0f;
            this.k9.forceFinished(true);
            if (this.f1 > 0.5f) {
                this.c6 = AnimationUtils.currentAnimationTimeMillis();
            }
            if (this.g1 < 0.5f) {
                this.I2 = AnimationUtils.currentAnimationTimeMillis();
            }
            this.g1 = 1.0f;
            l0();
            if (this.h1 == 2) {
                y0();
            }
            i0();
        }
    }

    public final void G(Canvas canvas, RectF rectF, int i10) {
        float centerY = rectF.centerY();
        float L = org.telegram.messenger.i0.L(12.0f);
        e6 e6Var = this.L0;
        float c10 = e6Var.c() + org.telegram.messenger.i0.L(2.0f) + L;
        float L2 = rectF.left + org.telegram.messenger.i0.L(8.0f);
        O(canvas, L2, centerY, L, i10, true);
        e6Var.u(i10);
        e6Var.setBounds((int) (L2 + L + org.telegram.messenger.i0.L(2.0f)), (int) (centerY - org.telegram.messenger.i0.L(8.0f)), (int) (L2 + c10 + org.telegram.messenger.i0.L(40.0f)), (int) (centerY + org.telegram.messenger.i0.L(8.0f)));
        e6Var.draw(canvas);
    }

    public final void G0(double d, float f7, float f10) {
        float c02 = ((c0(31.7d * d) * (f10 - f7)) + f7) * org.telegram.messenger.i0.L(1.0f);
        double c03 = (d * 6.283d) + (((((c0(43.3d * d) < 0.5f ? -1.0d : 1.0d) * 2.0d) * 3.141592653589793d) * this.M3) / ((c0(37.1d * d) * 11.0f) + 9.0f));
        this.L4 = ((float) Math.cos(c03)) * c02;
        this.M4 = c02 * ((float) Math.sin(c03));
    }

    public final void H(Canvas canvas, RectF rectF, float f7) {
        v0 v0Var = this.n;
        int f10 = v0Var != null ? i0.b.f(0.5f, v0Var.b, v0Var.c) : -12947803;
        Paint paint = this.z1;
        paint.setColor(f10 | (-16777216));
        paint.setAlpha((int) (Utilities.l(f7) * 224.4f));
        canvas.drawRect(rectF, paint);
    }

    public final float H0() {
        return (a1() - b1()) + org.telegram.messenger.i0.L(8.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0171, code lost:
    
        if (r4.e != r3) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I(Canvas canvas, int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique, float f7, float f10, float f11, float f12) {
        float z10;
        int size;
        int i11;
        TLRPC.Document document;
        RadialGradient radialGradient;
        float f13;
        d5 d5Var;
        float f14;
        float f15;
        TLRPC.Document document2;
        long currentAnimationTimeMillis;
        int i12;
        TLRPC.Document document3;
        float f16;
        float f17;
        float f18;
        Bitmap bitmap;
        Canvas canvas2 = canvas;
        long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
        int i13 = this.P7;
        if (i10 == i13) {
            if (this.S7 < this.R7) {
                float l4 = 1.0f - Utilities.l((currentAnimationTimeMillis2 - r14) / 120.0f);
                z10 = 1.0f - ((1.0f - (l4 * l4)) * 0.06f);
                if (z10 != 1.0f) {
                    canvas2.save();
                    canvas2.scale(z10, z10, (f11 / 2.0f) + f7, (f12 / 2.0f) + f10);
                }
                int[] iArr = this.h2;
                e0(iArr, i10);
                int i14 = iArr[0];
                int i15 = iArr[1];
                ArrayList<TL_stars.StarGiftAttribute> arrayList = tL_starGiftUnique.attributes;
                size = arrayList.size();
                i11 = 0;
                document = null;
                while (i11 < size) {
                    TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i11);
                    i11++;
                    TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                    if (starGiftAttribute2 instanceof TL_stars.starGiftAttributeModel) {
                        document = ((TL_stars.starGiftAttributeModel) starGiftAttribute2).document;
                    }
                }
                RectF rectF = this.F1;
                rectF.set(f7, f10, f7 + f11, f10 + f12);
                Paint paint = this.z1;
                paint.setColor(-1);
                long j10 = tL_starGiftUnique.id;
                LongSparseArray longSparseArray = this.R5;
                radialGradient = (RadialGradient) longSparseArray.get(j10);
                if (radialGradient == null) {
                    radialGradient = new RadialGradient(0.0f, 0.0f, 1.0f, new int[]{i14, i15}, (float[]) null, Shader.TileMode.CLAMP);
                    longSparseArray.put(tL_starGiftUnique.id, radialGradient);
                }
                float f19 = f12 * 0.7f;
                float max = Math.max(1.0f, f11 / f12) * f19;
                Matrix matrix = this.O5;
                matrix.setScale(max, f19);
                matrix.postTranslate(rectF.centerX(), rectF.centerY());
                radialGradient.setLocalMatrix(matrix);
                paint.setShader(radialGradient);
                f13 = this.U7;
                canvas2.drawRoundRect(rectF, f13, f13, paint);
                paint.setShader(null);
                canvas2.save();
                Path path = this.E1;
                path.rewind();
                path.addRoundRect(rectF, f13, f13, Path.Direction.CW);
                canvas2.clipPath(path);
                int i16 = iArr[2] | (-16777216);
                w0 m12 = m1(tL_starGiftUnique);
                d5Var = m12.a;
                if (d5Var != null || d5Var.f[0] == null) {
                    f14 = f13;
                    f15 = 0.7f;
                    document2 = document;
                } else {
                    canvas2.save();
                    canvas2.translate(rectF.centerX(), rectF.centerY());
                    int i17 = Build.VERSION.SDK_INT;
                    if (i17 >= 29) {
                        d5 d5Var2 = m12.a;
                        f15 = 0.7f;
                        Drawable drawable = d5Var2.f[0];
                        if (drawable != null && d5Var2.d.c == 1.0f && (drawable instanceof f5)) {
                            f5 f5Var = (f5) drawable;
                            ag.c2 c2Var = f5Var.k;
                            if (c2Var != null) {
                                long h = f5Var.h();
                                document2 = document;
                                if (h == m12.b) {
                                    bitmap = c2Var.n();
                                    if (bitmap == null) {
                                        if (m12.c != bitmap || m12.d == null) {
                                            m12.c = bitmap;
                                            m12.d = g0.a.a(bitmap);
                                        }
                                        m12.e = i16;
                                        m12.d.setColorFilter(i17 >= 29 ? u.l(i16) : new PorterDuffColorFilter(i16, PorterDuff.Mode.SRC_IN));
                                        f14 = f13;
                                        rh.j0.b(canvas2, 2, m12.d, bitmap, rectF.width(), rectF.height(), 1.0f);
                                        canvas2 = canvas;
                                        canvas2.restore();
                                    } else {
                                        f14 = f13;
                                        m12.a.k(Integer.valueOf(i16));
                                        canvas2 = canvas;
                                        rh.j0.a(canvas2, 2, m12.a, rectF.width(), rectF.height(), 1.0f, 1.0f);
                                        canvas2.restore();
                                    }
                                }
                            } else {
                                document2 = document;
                            }
                            bitmap = null;
                            if (bitmap == null) {
                            }
                        } else {
                            f14 = f13;
                        }
                    } else {
                        f14 = f13;
                        f15 = 0.7f;
                    }
                    document2 = document;
                    m12.a.k(Integer.valueOf(i16));
                    canvas2 = canvas;
                    rh.j0.a(canvas2, 2, m12.a, rectF.width(), rectF.height(), 1.0f, 1.0f);
                    canvas2.restore();
                }
                canvas2.restore();
                paint.setColor(318767103);
                canvas2.drawRoundRect(rectF, f14, f14, paint);
                Paint paint2 = this.A1;
                paint2.setColor(1308622847);
                paint2.setStrokeWidth(Math.max(1.0f, org.telegram.messenger.i0.N(0.4f)));
                RectF rectF2 = this.V5;
                rectF2.set(rectF);
                rectF2.inset(0.5f, 0.5f);
                float f20 = f14 - 0.5f;
                canvas2.drawRoundRect(rectF2, f20, f20, paint2);
                currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                i12 = this.L7;
                if (i10 == i12 || this.O7 <= 0.5f) {
                    document3 = document2;
                    if (i10 != this.Q7 || (i10 == i12 && this.O7 < 0.5f)) {
                        float l10 = Utilities.l((currentAnimationTimeMillis - this.T7) / 180.0f);
                        f16 = 1.0f - (l10 * l10);
                    } else {
                        f16 = 0.0f;
                    }
                } else {
                    document3 = document2;
                    float l11 = 1.0f - Utilities.l((currentAnimationTimeMillis - this.S7) / 260.0f);
                    f16 = f1.x(l11, l11, l11, 1.0f);
                }
                if (f16 <= 0.002f) {
                    boolean z11 = i10 == this.L7 && this.O7 > 0.5f;
                    f17 = 3.0f;
                    float T1 = org.telegram.messenger.i0.T1(org.telegram.messenger.i0.N(1.0f), org.telegram.messenger.i0.L(4.0f), f16);
                    float L = org.telegram.messenger.i0.L(2.0f) * f16;
                    float min = Math.min(1.0f, z11 ? f16 * 4.0f : f16 * 3.0f);
                    rectF2.set(rectF);
                    rectF2.inset(T1, T1);
                    paint2.setColor(-1);
                    paint2.setAlpha((int) (min * 255.0f * (i10 == this.L7 ? (f16 * 0.3f) + f15 : 1.0f)));
                    paint2.setStrokeWidth(L);
                    float f21 = f14 - T1;
                    canvas2.drawRoundRect(rectF2, Math.max(0.0f, f21), Math.max(0.0f, f21), paint2);
                } else {
                    f17 = 3.0f;
                }
                if (document3 != null) {
                    f5 g02 = g0(tL_starGiftUnique.id, document3);
                    float f22 = 0.82f * f12;
                    long currentAnimationTimeMillis3 = AnimationUtils.currentAnimationTimeMillis();
                    int i18 = this.L7;
                    if (i10 == i18 && this.O7 > 0.5f) {
                        f18 = 1.0f - (((float) h1((currentAnimationTimeMillis3 - this.S7) / 1000.0f, 0.6d, 0.3d)) * 0.14f);
                    } else if (i10 == this.Q7 || (i10 == i18 && this.O7 < 0.5f)) {
                        float l12 = Utilities.l((currentAnimationTimeMillis3 - this.T7) / 180.0f);
                        f18 = ((f17 - (l12 * 2.0f)) * 0.14f * l12 * l12) + 0.86f;
                    } else {
                        f18 = 1.0f;
                    }
                    float f23 = (f22 * f18) / 2.0f;
                    g02.setBounds((int) (rectF.centerX() - f23), (int) (rectF.centerY() - f23), (int) (rectF.centerX() + f23), (int) (rectF.centerY() + f23));
                    g02.setAlpha(zs.e4);
                    g02.setColorFilter(null);
                    g02.draw(canvas2);
                }
                if (z10 == 1.0f) {
                    canvas2.restore();
                    return;
                }
                return;
            }
        }
        z10 = i10 == i13 ? sc.e.z(1.0f, (float) h1((currentAnimationTimeMillis2 - this.S7) / 1000.0f, 0.6d, 0.3d), 0.06f, 1.0f) : 1.0f;
        if (z10 != 1.0f) {
        }
        int[] iArr2 = this.h2;
        e0(iArr2, i10);
        int i142 = iArr2[0];
        int i152 = iArr2[1];
        ArrayList<TL_stars.StarGiftAttribute> arrayList2 = tL_starGiftUnique.attributes;
        size = arrayList2.size();
        i11 = 0;
        document = null;
        while (i11 < size) {
        }
        RectF rectF3 = this.F1;
        rectF3.set(f7, f10, f7 + f11, f10 + f12);
        Paint paint3 = this.z1;
        paint3.setColor(-1);
        long j102 = tL_starGiftUnique.id;
        LongSparseArray longSparseArray2 = this.R5;
        radialGradient = (RadialGradient) longSparseArray2.get(j102);
        if (radialGradient == null) {
        }
        float f192 = f12 * 0.7f;
        float max2 = Math.max(1.0f, f11 / f12) * f192;
        Matrix matrix2 = this.O5;
        matrix2.setScale(max2, f192);
        matrix2.postTranslate(rectF3.centerX(), rectF3.centerY());
        radialGradient.setLocalMatrix(matrix2);
        paint3.setShader(radialGradient);
        f13 = this.U7;
        canvas2.drawRoundRect(rectF3, f13, f13, paint3);
        paint3.setShader(null);
        canvas2.save();
        Path path2 = this.E1;
        path2.rewind();
        path2.addRoundRect(rectF3, f13, f13, Path.Direction.CW);
        canvas2.clipPath(path2);
        int i162 = iArr2[2] | (-16777216);
        w0 m122 = m1(tL_starGiftUnique);
        d5Var = m122.a;
        if (d5Var != null) {
        }
        f14 = f13;
        f15 = 0.7f;
        document2 = document;
        canvas2.restore();
        paint3.setColor(318767103);
        canvas2.drawRoundRect(rectF3, f14, f14, paint3);
        Paint paint22 = this.A1;
        paint22.setColor(1308622847);
        paint22.setStrokeWidth(Math.max(1.0f, org.telegram.messenger.i0.N(0.4f)));
        RectF rectF22 = this.V5;
        rectF22.set(rectF3);
        rectF22.inset(0.5f, 0.5f);
        float f202 = f14 - 0.5f;
        canvas2.drawRoundRect(rectF22, f202, f202, paint22);
        currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        i12 = this.L7;
        if (i10 == i12) {
        }
        document3 = document2;
        if (i10 != this.Q7) {
        }
        float l102 = Utilities.l((currentAnimationTimeMillis - this.T7) / 180.0f);
        f16 = 1.0f - (l102 * l102);
        if (f16 <= 0.002f) {
        }
        if (document3 != null) {
        }
        if (z10 == 1.0f) {
        }
    }

    public final void I0(float f7, float f10, int i10) {
        Path path;
        int i11;
        int i12;
        TLRPC.Document document;
        TLRPC.Document document2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.v1.get(i10);
        v0 v0Var = new v0();
        v0Var.a = 2;
        v0Var.f = i10;
        final u0 u0Var = new u0();
        u0Var.a = 2;
        u0Var.q = i10;
        long j10 = tL_starGiftUnique.id;
        u0Var.r = (int) (j10 ^ (j10 >>> 32));
        ArrayList<TL_stars.StarGiftAttribute> arrayList = tL_starGiftUnique.attributes;
        int size = arrayList.size();
        int i13 = 0;
        int i14 = 0;
        while (i14 < size) {
            TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i14);
            i14++;
            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
            if ((starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) && (document2 = ((TL_stars.starGiftAttributePattern) starGiftAttribute2).document) != null) {
                u0Var.A = document2;
                u0Var.c = f5.l(this.b, 9, document2);
            } else if ((starGiftAttribute2 instanceof TL_stars.starGiftAttributeModel) && (document = ((TL_stars.starGiftAttributeModel) starGiftAttribute2).document) != null) {
                u0Var.z = document;
                u0Var.d = f5.l(this.b, 24, document);
            }
        }
        e0(this.h2, i10);
        v0Var.b = x(this.h2[0], false);
        int x10 = x(this.h2[1], true);
        v0Var.c = x10;
        v0Var.d = this.h2[2];
        v0Var.e = v(v0Var.b, x10);
        v0Var.h = Z0(v0Var.b);
        v0Var.g = g.k(0.5f, v0Var.b, v0Var.c);
        u0Var.j = l1(v0Var.d, v0Var.b);
        double[] dArr = {r15, 0.0d, 0.0d};
        i0.b.j(l1(v0Var.d, v0Var.b) | (-16777216), dArr);
        double min = Math.min(97.0d, dArr[0] + 20.0d);
        float[] fArr = new float[3];
        Color.colorToHSV(i0.b.b(min, dArr[1], dArr[2]), fArr);
        fArr[1] = Math.min(1.0f, fArr[1] * 1.15f);
        u0Var.s = Color.HSVToColor(fArr) | (-16777216);
        u0Var.v.setColorFilter(new PorterDuffColorFilter(u0Var.s, PorterDuff.Mode.SRC_IN));
        u0Var.t = -1;
        u0Var.B = tL_starGiftUnique;
        f5 f5Var = u0Var.c;
        if (f5Var != null) {
            f5Var.a(this);
        }
        f5 f5Var2 = u0Var.d;
        if (f5Var2 != null) {
            f5Var2.a(this);
        }
        TLRPC.Document document3 = u0Var.z;
        if (document3 != null) {
            int i15 = 0;
            while (true) {
                if (i15 >= document3.thumbs.size()) {
                    path = null;
                    break;
                } else {
                    if (document3.thumbs.get(i15) instanceof TLRPC.TL_photoPathSize) {
                        path = ((TLRPC.TL_photoPathSize) document3.thumbs.get(i15)).svgPath;
                        break;
                    }
                    i15++;
                }
            }
            if (path != null) {
                while (true) {
                    if (i13 >= document3.attributes.size()) {
                        i11 = 512;
                        i12 = 512;
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = document3.attributes.get(i13);
                    if (((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) && (i11 = documentAttribute.w) > 0 && (i12 = documentAttribute.h) > 0) {
                        break;
                    } else {
                        i13++;
                    }
                }
                final Path path2 = new Path(path);
                float f11 = I9;
                final float f12 = f11 / i11;
                final float f13 = f11 / i12;
                final int i16 = u0Var.j;
                Utilities.e.c(new Runnable() { // from class: qh.r0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Bitmap bitmap;
                        float f14 = f12;
                        float f15 = f13;
                        int i17 = i16;
                        Path path3 = path2;
                        try {
                            int i18 = x0.I9;
                            bitmap = Bitmap.createBitmap(i18, i18, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(bitmap);
                            canvas.scale(f14, f15);
                            Paint paint = new Paint(1);
                            paint.setColor(i17);
                            canvas.drawPath(path3, paint);
                            bitmap.prepareToDraw();
                        } catch (Throwable th2) {
                            f8.g(th2, true);
                            bitmap = null;
                        }
                        org.telegram.messenger.i0.g3(new u41(x0.this, u0Var, bitmap, 18));
                    }
                });
            }
        }
        this.I.clear();
        Y0(v0Var, f7, f10);
        if (!this.f2) {
            this.p2 = j(this.n2, 0.03f, 0.005f);
            this.n2 = AnimationUtils.currentAnimationTimeMillis();
        }
        setPattern(u0Var);
    }

    public final void J(Canvas canvas, RectF rectF, float f7, float f10) {
        RectF rectF2;
        float f11;
        RectF rectF3;
        float f12;
        char c10;
        char c11;
        if (f10 <= 0.0f) {
            return;
        }
        if (this.A6) {
            float min = Math.min(0.0f, org.telegram.messenger.i0.N(y0.a[2][8]));
            rectF3 = this.W5;
            rectF2 = rectF;
            rectF3.set(rectF2);
            rectF3.inset(min, min);
            f11 = f7 - min;
        } else {
            rectF2 = rectF;
            f11 = f7;
            rectF3 = rectF2;
        }
        boolean z10 = (j0(canvas) || this.Y2 == null) ? false : true;
        if (z10 && this.Y2 != null && this.a3 != null) {
            float f13 = this.f3;
            Matrix matrix = this.d3;
            matrix.setScale(f13, f13);
            float f14 = (-f13) / 2.0f;
            matrix.postTranslate(f14, f14);
            this.a3.setLocalMatrix(matrix);
            int l4 = (int) (Utilities.l(f10) * 255.0f);
            Paint paint = this.c3;
            paint.setAlpha(l4);
            canvas.drawRoundRect(rectF3, f11, f11, paint);
            paint.setAlpha(zs.e4);
        }
        Path path = this.E1;
        path.rewind();
        path.addRoundRect(rectF3, f11, f11, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        float[] fArr = y0.b;
        if (z10) {
            f12 = 0.0f;
            c10 = '\t';
            c11 = 3;
        } else if (u.f() && j0(canvas)) {
            f12 = 0.0f;
            if (f10 < 1.0f) {
                canvas.saveLayerAlpha(rectF3, (int) (f10 * 255.0f));
            }
            if (!this.s6 || this.r6 <= 0.004f) {
                c10 = '\t';
                c11 = 3;
                Object obj = this.H1;
                canvas.save();
                canvas.scale(9.0f, 9.0f);
                u.c(canvas, obj);
                canvas.restore();
            } else {
                canvas.save();
                canvas.scale(8.0f, 8.0f);
                if (this.t6 == null) {
                    this.t6 = android.support.v4.media.session.w.d("qrSheetLift");
                }
                float round = Math.round(this.r6 * 50.0f) / 50.0f;
                c10 = '\t';
                v0 v0Var = this.n;
                int i10 = v0Var != null ? v0Var.b : 0;
                if (round == this.u6 && this.v6 == 1 && this.w6 == i10) {
                    c11 = 3;
                } else {
                    this.u6 = round;
                    this.v6 = 1;
                    this.w6 = i10;
                    Object obj2 = this.t6;
                    c11 = 3;
                    float max = (fArr[10] / 100.0f) * round * ((float) Math.max(0.0d, Math.min(1.0d, (0.85d - (v0Var != null ? i0.b.h(v0Var.b) : 0.3d)) / 0.45d)));
                    float c12 = a1.g.c(fArr[11], 100.0f, round, 1.0f);
                    float f15 = ((0.5f - (c12 * 0.5f)) + max) * 255.0f;
                    u.k(obj2, Math.max(0.5f, org.telegram.messenger.i0.N(org.telegram.messenger.i0.T1(fArr[2], fArr[12], round)) / 8.0f), new float[]{c12, 0.0f, 0.0f, 0.0f, f15, 0.0f, c12, 0.0f, 0.0f, f15, 0.0f, 0.0f, c12, 0.0f, f15, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                }
                Canvas a2 = u.a((getWidth() + 7) / 8, (getHeight() + 7) / 8, this.t6);
                a2.scale(0.125f, 0.125f);
                u.c(a2, this.G1);
                u.d(this.t6);
                u.c(canvas, this.t6);
                canvas.restore();
            }
            if (f10 < 1.0f) {
                canvas.restore();
            }
        } else {
            f12 = 0.0f;
            c10 = '\t';
            c11 = 3;
            H(canvas, rectF3, f10);
        }
        int i11 = this.T8;
        if (i11 == 0) {
            i11 = g((fArr[c11] + (this.s6 ? fArr[c10] * this.r6 : f12)) / 100.0f, 16777215);
        }
        Paint paint2 = this.z1;
        paint2.setColor(i11);
        paint2.setAlpha((int) (Color.alpha(paint2.getColor()) * f10));
        canvas.drawRect(rectF3, paint2);
        t.b(canvas, rectF3, f10);
        boolean z11 = this.s6;
        if ((((z11 || this.A6) ? f12 : (fArr[21] / 100.0f) * this.b6) > f12 || fArr[39] > f12) && this.y3 && !z11 && !this.A6) {
            int width = getWidth();
            int height = getHeight();
            float c13 = c1(rectF3.left, rectF3.centerY(), width, height);
            float c14 = c1(rectF3.centerX(), rectF3.centerY(), width, height);
            float c15 = c1(rectF3.right, rectF3.centerY(), width, height);
            if (c13 + c14 + c15 > 0.01f) {
                float f16 = ((fArr[39] * 1.25f) / 100.0f) * this.b6 * 0.1f;
                float f17 = c14 * f16 * f10;
                float f18 = f16 * c15 * f10;
                float centerX = rectF3.centerX();
                L(rectF3.left, centerX, c13 * f16 * f10, f17, canvas, rectF3);
                L(centerX, rectF3.right, f17, f18, canvas, rectF3);
            }
        }
        canvas.restore();
        C(canvas, null, rectF2, f7, f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean J0(float f7, float f10, float f11, int i10, int i11, int i12, int i13, int i14, float f12) {
        float f13;
        float f14;
        int i15;
        int i16;
        float f15;
        int i17;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        float exp;
        float f24;
        float f25;
        float g12;
        float f26;
        float f27;
        float L = org.telegram.messenger.i0.L(90.0f);
        float f28 = 1.3f * L;
        float f29 = -f28;
        if (f7 < f29) {
            return false;
        }
        float f30 = i10;
        if (f7 > f30 + f28 || f10 < f29) {
            return false;
        }
        float f31 = i11;
        if (f10 > f28 + f31) {
            return false;
        }
        long j10 = ((i12 << 60) ^ ((i13 & 1073741823) << 30)) ^ (i14 & 1073741823);
        t0 t0Var = this.L3;
        int i18 = t0Var.m;
        float[] fArr = t0Var.j;
        float[] fArr2 = t0Var.i;
        float[] fArr3 = t0Var.h;
        float[] fArr4 = t0Var.g;
        float[] fArr5 = t0Var.f;
        float[] fArr6 = t0Var.e;
        float[] fArr7 = t0Var.d;
        float[] fArr8 = t0Var.c;
        long[] jArr = t0Var.a;
        boolean[] zArr = t0Var.b;
        int[] iArr = t0Var.k;
        int i19 = -1;
        if (i18 == 0) {
            f13 = f31;
            f14 = f30;
        } else {
            long j11 = (j10 ^ (j10 >>> 33)) * (-49064778989728563L);
            f13 = f31;
            f14 = f30;
            i15 = (int) ((j11 ^ (j11 >>> 33)) & 4095);
            while (zArr[i15]) {
                if (jArr[i15] == j10) {
                    break;
                }
                i15 = (i15 + 1) & 4095;
            }
        }
        i15 = -1;
        if (this.s >= 1.0f || this.r == null) {
            i16 = i15;
            f15 = 0.0f;
        } else {
            if (i15 >= 0) {
                f15 = 0.0f;
                if (iArr[i15] == this.q0) {
                    i16 = i15;
                }
            } else {
                f15 = 0.0f;
            }
            float f32 = this.x;
            i16 = i15;
            double max = Math.max(f32, f14 - f32);
            float f33 = this.y;
            float hypot = ((float) Math.hypot(max, Math.max(f33, f13 - f33))) + org.telegram.messenger.i0.L(60.0f);
            float f34 = f7 - this.x;
            float f35 = f10 - this.y;
            float sqrt = (float) Math.sqrt((f35 * f35) + (f34 * f34));
            if (sqrt <= y1(this.s) * hypot) {
                if (i16 < 0) {
                    if (t0Var.m >= 3072) {
                        f26 = f34;
                        f27 = f35;
                    } else {
                        long j12 = (j10 ^ (j10 >>> 33)) * (-49064778989728563L);
                        f27 = f35;
                        int i20 = (int) ((j12 ^ (j12 >>> 33)) & 4095);
                        while (true) {
                            if (!zArr[i20]) {
                                zArr[i20] = true;
                                jArr[i20] = j10;
                                iArr[i20] = -1;
                                fArr[i20] = f15;
                                fArr2[i20] = f15;
                                fArr3[i20] = f15;
                                fArr4[i20] = f15;
                                fArr5[i20] = f15;
                                fArr6[i20] = f15;
                                fArr7[i20] = f15;
                                fArr8[i20] = f15;
                                int[] iArr2 = t0Var.l;
                                f26 = f34;
                                int i21 = t0Var.m;
                                t0Var.m = i21 + 1;
                                iArr2[i21] = i20;
                                break;
                            }
                            if (jArr[i20] == j10) {
                                f26 = f34;
                                break;
                            }
                            i20 = (i20 + 1) & 4095;
                        }
                        i19 = i20;
                    }
                    i17 = i19;
                } else {
                    f26 = f34;
                    f27 = f35;
                    i17 = i16;
                }
                if (i17 >= 0) {
                    iArr[i17] = this.q0;
                    float f36 = 1.0f / f12;
                    float f37 = sqrt > 1.0f ? f26 / sqrt : f15;
                    float f38 = sqrt > 1.0f ? f27 / sqrt : -1.0f;
                    fArr6[i17] = c3.i0.u(f37, org.telegram.messenger.i0.L(360.0f), f36, fArr6[i17]);
                    fArr5[i17] = c3.i0.u(f38, org.telegram.messenger.i0.L(360.0f), f36, fArr5[i17]);
                    fArr3[i17] = c3.i0.u(f37 >= f15 ? 1.0f : -1.0f, 180.0f, f36, fArr3[i17]);
                    fArr[i17] = fArr[i17] + 1.8f;
                }
                if (i17 < 0) {
                    f16 = f7 + fArr8[i17];
                    f17 = f10 + fArr7[i17];
                    this.n0 = fArr4[i17];
                    this.o0 = fArr2[i17];
                } else {
                    float f39 = f15;
                    this.n0 = f39;
                    this.o0 = f39;
                    f16 = f7;
                    f17 = f10;
                }
                float f40 = f14 / 2.0f;
                float l4 = (l() / 2.0f) + m();
                f18 = f16 - f40;
                f19 = f17 - l4;
                if (f18 <= 0.5f) {
                    f21 = 1.0f;
                    f20 = 2.0f;
                    f22 = Math.max(0.0f, f18 / Math.max(1.0f, f14 - f40));
                } else {
                    f20 = 2.0f;
                    f21 = 1.0f;
                    f22 = 0.0f;
                    if (f18 < -0.5f) {
                        f22 = Math.max(0.0f, (-f18) / Math.max(1.0f, f40));
                    }
                }
                if (f19 <= 0.5f) {
                    f22 = Math.max(f22, f19 / Math.max(f21, f13 - l4));
                } else if (f19 < -0.5f) {
                    f22 = Math.max(f22, (-f19) / Math.max(f21, l4));
                }
                float min = Math.min(f21, f22);
                float g13 = f21 - (g1(0.55f, f21, min) * 0.22f);
                float g14 = f21 - (g1(0.8f, f21, min) * 0.2f);
                if (f16 < L || f16 > f14 - f16) {
                    if (f14 - f16 >= L) {
                        exp = (float) Math.exp((r9 / L) - 1.0f);
                        f24 = f14 - (L * exp);
                    } else {
                        f23 = 1.0f;
                        if (f17 < L || f17 > f13 - f17) {
                            if (f13 - f17 < L) {
                                float exp2 = (float) Math.exp((r10 / L) - 1.0f);
                                f25 = f13 - (L * exp2);
                                f23 = Math.min(f23, exp2);
                            }
                            g12 = g1(0.08f, 0.25f, f23) * g14;
                            this.m0 = g12;
                            if (g12 <= 0.004f) {
                                return false;
                            }
                            if (f11 * g13 < org.telegram.messenger.i0.L(10.0f)) {
                                g13 = org.telegram.messenger.i0.L(10.0f) / Math.max(1.0f, f11);
                            }
                            float f41 = f23 * g13;
                            if (i12 != 1) {
                                f41 = Math.max(f41, Math.min(f11, org.telegram.messenger.i0.L(9.0f)) / Math.max(1.0f, f11));
                            }
                            this.l0 = f41;
                            float f42 = (f11 * f41) / f20;
                            float l10 = Utilities.l(Math.min(Math.min(f16 - f42, (f14 - f16) - f42), Math.min(f17 - f42, (f13 - f17) - f42)) / org.telegram.messenger.i0.L(12.0f));
                            float f43 = (3.0f - (l10 * f20)) * l10 * l10 * this.m0;
                            this.m0 = f43;
                            if (f43 <= 0.004f) {
                                return false;
                            }
                            this.J3 = f16;
                            this.K3 = f17;
                            this.p0 = c1(f16, f17, i10, i11);
                            this.n4 = this.m4;
                            this.q4 = this.o4;
                            this.r4 = this.p4;
                            return true;
                        }
                        float exp3 = (float) Math.exp((f17 / L) - 1.0f);
                        f25 = L * exp3;
                        f23 = Math.min(f23, exp3);
                        f17 = f25;
                        g12 = g1(0.08f, 0.25f, f23) * g14;
                        this.m0 = g12;
                        if (g12 <= 0.004f) {
                        }
                    }
                } else {
                    exp = (float) Math.exp((f16 / L) - f21);
                    f24 = L * exp;
                }
                float f44 = f24;
                f23 = exp;
                f16 = f44;
                if (f17 < L) {
                }
                if (f13 - f17 < L) {
                }
                g12 = g1(0.08f, 0.25f, f23) * g14;
                this.m0 = g12;
                if (g12 <= 0.004f) {
                }
            }
        }
        i17 = i16;
        if (i17 < 0) {
        }
        float f402 = f14 / 2.0f;
        float l42 = (l() / 2.0f) + m();
        f18 = f16 - f402;
        f19 = f17 - l42;
        if (f18 <= 0.5f) {
        }
        if (f19 <= 0.5f) {
        }
        float min2 = Math.min(f21, f22);
        float g132 = f21 - (g1(0.55f, f21, min2) * 0.22f);
        float g142 = f21 - (g1(0.8f, f21, min2) * 0.2f);
        if (f16 < L) {
        }
        if (f14 - f16 >= L) {
        }
    }

    public final void K(Canvas canvas) {
        float f7;
        float f10;
        int i10;
        float f11;
        Canvas canvas2 = canvas;
        if (this.k1 <= 0.001f) {
            return;
        }
        float L = org.telegram.messenger.i0.L(222.0f);
        float L2 = org.telegram.messenger.i0.L(46.0f);
        float L3 = org.telegram.messenger.i0.L(54.0f);
        org.telegram.messenger.i0.L(8.0f);
        float f12 = this.y0 ? L2 + L2 : L2 + L3 + L2;
        float f13 = this.f1;
        RectF rectF = this.J5;
        float L4 = f13 > 0.5f ? (rectF.bottom + org.telegram.messenger.i0.L(6.0f)) - f12 : rectF.top - org.telegram.messenger.i0.L(6.0f);
        float width = (getWidth() - L) / 2.0f;
        RectF rectF2 = this.K8;
        rectF2.set(width, L4, L + width, f12 + L4);
        float f14 = this.E8;
        float f15 = this.F8;
        float l4 = Utilities.l(this.k1);
        float T1 = org.telegram.messenger.i0.T1(rectF.left, rectF2.left, f14);
        float T12 = org.telegram.messenger.i0.T1(rectF.top, rectF2.top, f15);
        float T13 = org.telegram.messenger.i0.T1(rectF.right, rectF2.right, f14);
        float T14 = org.telegram.messenger.i0.T1(rectF.bottom, rectF2.bottom, f15);
        RectF rectF3 = this.J8;
        rectF3.set(T1, T12, T13, T14);
        float min = Math.min(rectF3.height() / 2.0f, Math.min(rectF3.width() / 2.0f, org.telegram.messenger.i0.T1(rectF.height() / 2.0f, org.telegram.messenger.i0.L(22.0f), Utilities.l(f15))));
        float max = Math.max(-0.25f, Math.min(1.0f, this.G8 / 9.0f)) * org.telegram.messenger.i0.L(5.0f);
        float f16 = rectF3.left;
        float f17 = rectF3.top;
        float f18 = rectF3.right;
        float f19 = 1.0f;
        float f20 = rectF3.bottom;
        float centerX = rectF3.centerX();
        Path path = this.I8;
        path.rewind();
        float f21 = f16 + min;
        path.moveTo(f21, f17);
        float f22 = f18 - min;
        path.lineTo(f22, f17);
        float f23 = f17 + min;
        path.quadTo(f18, f17, f18, f23);
        float f24 = f20 - min;
        path.lineTo(f18, f24);
        path.quadTo(f18, f20, f22, f20);
        float f25 = f20 + max;
        path.cubicTo(org.telegram.messenger.i0.T1(f22, centerX, 0.55f), f25, org.telegram.messenger.i0.T1(f21, centerX, 0.55f), f25, f21, f20);
        path.quadTo(f16, f20, f16, f24);
        path.lineTo(f16, f23);
        path.quadTo(f16, f17, f21, f17);
        path.close();
        float max2 = Math.max(0.0f, max) + f20;
        RectF rectF4 = this.F1;
        rectF4.set(f16, f17, f18, max2);
        canvas2.save();
        canvas2.clipPath(path);
        float f26 = 255.0f;
        if (u.f() && j0(canvas)) {
            Object obj = this.H1;
            canvas2.save();
            canvas2.scale(9.0f, 9.0f);
            u.c(canvas2, obj);
            canvas2.restore();
        } else if (this.Y2 != null) {
            int l10 = (int) (Utilities.l(1.0f) * 255.0f);
            Paint paint = this.b3;
            paint.setAlpha(l10);
            Bitmap bitmap = this.Y2;
            if (bitmap != null) {
                y(canvas2, bitmap);
            }
            paint.setAlpha(zs.e4);
        } else {
            H(canvas2, rectF4, 1.0f);
        }
        Paint paint2 = this.z1;
        paint2.setColor(352321535);
        paint2.setAlpha((int) (Color.alpha(paint2.getColor()) * 1.0f));
        canvas2.drawRect(rectF4, paint2);
        t.b(canvas2, rectF4, 1.0f);
        canvas2.restore();
        C(canvas2, path, rectF4, 0.0f, 1.0f);
        canvas2.save();
        canvas2.clipPath(path);
        float f27 = l4 / 0.3f;
        float l11 = 1.0f - Utilities.l(f27);
        float f28 = 0.004f;
        float f29 = 0.15f;
        boolean z10 = false;
        int i11 = 1;
        if (l11 > 0.004f) {
            canvas2.saveLayerAlpha(rectF4, (int) (l11 * 255.0f));
            float l12 = 1.0f - (Utilities.l(f27) * 0.15f);
            canvas2.scale(l12, l12, rectF.centerX(), rectF.centerY());
            this.T5 = true;
            int width2 = getWidth();
            System.currentTimeMillis();
            B(canvas2, width2);
            this.T5 = false;
            canvas2.restore();
        }
        float centerX2 = rectF3.centerX() - rectF2.centerX();
        float f30 = rectF3.top - rectF2.top;
        float f31 = 0.6f;
        if (Math.abs(this.G8) < 0.6f) {
            centerX2 = Math.round(centerX2);
            f30 = Math.round(f30);
        }
        canvas2.save();
        canvas2.translate(centerX2, f30);
        TextPaint textPaint = this.C1;
        textPaint.setSubpixelText(true);
        textPaint.setLinearText(false);
        String[] strArr = {cd.L0(2131746500, null), cd.L0(this.x0 ? 2131746504 : 2131746502, null), cd.L0(2131746499, null)};
        String[] strArr2 = {null, cd.L0(this.x0 ? 2131746503 : 2131746501, null), null};
        int i12 = 0;
        float f32 = L4;
        while (i12 < 3) {
            RectF[] rectFArr = this.y8;
            if (i12 == i11 && this.y0) {
                rectFArr[i12].setEmpty();
                i10 = i12;
                f7 = f26;
                f10 = f28;
            } else {
                float f33 = strArr2[i12] != null ? L3 : L2;
                f7 = f26;
                f10 = f28;
                float f34 = f32 + f33;
                rectFArr[i12].set(rectF2.left, f32, rectF2.right, f34);
                float g12 = this.l1 > 0.5f ? g1(f29, f31, l4) : g1(f31, f19, l4);
                if (g12 <= f10) {
                    i10 = i12;
                } else {
                    M(canvas2, i12, rectFArr[i12], z10);
                    canvas2.save();
                    float f35 = (f33 / 2.0f) + f32;
                    if (i12 == 2) {
                        i10 = i12;
                        o0(canvas2, this.K1, rectF2.left + org.telegram.messenger.i0.L(26.0f), f35, org.telegram.messenger.i0.L(20.0f), g12);
                        canvas2 = canvas;
                    } else {
                        i10 = i12;
                        if (i10 == 0) {
                            canvas2 = canvas;
                            o0(canvas2, this.R1, rectF2.left + org.telegram.messenger.i0.L(26.0f), f35, org.telegram.messenger.i0.L(20.0f), g12);
                        } else {
                            canvas2 = canvas;
                            boolean z11 = this.x0;
                            Bitmap bitmap2 = z11 ? this.O8 : this.P8;
                            if (bitmap2 != null) {
                                f11 = 26.0f;
                            } else {
                                int round = Math.round(org.telegram.messenger.i0.L(22.4f));
                                Bitmap createBitmap = Bitmap.createBitmap(round, round, Bitmap.Config.ALPHA_8);
                                f11 = 26.0f;
                                Canvas canvas3 = new Canvas(createBitmap);
                                float f36 = round / 24.0f;
                                canvas3.scale(f36, f36);
                                Paint paint3 = new Paint(1);
                                Paint.Style style = Paint.Style.STROKE;
                                paint3.setStyle(style);
                                paint3.setStrokeWidth(1.66f);
                                Paint.Cap cap = Paint.Cap.ROUND;
                                paint3.setStrokeCap(cap);
                                paint3.setStrokeJoin(Paint.Join.ROUND);
                                paint3.setColor(-16777216);
                                canvas3.drawCircle(11.0f, 11.0f, 8.0f, paint3);
                                canvas3.drawLine(11.0f, 11.0f, 11.0f, 6.6f, paint3);
                                canvas3.drawLine(11.0f, 11.0f, 7.8f, 11.0f, paint3);
                                if (z11) {
                                    Paint paint4 = new Paint(1);
                                    paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                                    canvas3.drawCircle(18.2f, 18.2f, 5.7f, paint4);
                                    Paint paint5 = new Paint(1);
                                    paint5.setColor(-16777216);
                                    canvas3.drawCircle(18.2f, 18.2f, 4.4f, paint5);
                                    paint4.setStyle(style);
                                    paint4.setStrokeWidth(1.4f);
                                    paint4.setStrokeCap(cap);
                                    canvas3.drawLine(16.6f, 16.6f, 19.8f, 19.8f, paint4);
                                    canvas3.drawLine(19.8f, 16.6f, 16.6f, 19.8f, paint4);
                                    this.O8 = createBitmap;
                                } else {
                                    this.P8 = createBitmap;
                                }
                                bitmap2 = createBitmap;
                            }
                            float L5 = rectF2.left + org.telegram.messenger.i0.L(f11);
                            Paint paint6 = this.Q8;
                            paint6.setColor(-1);
                            paint6.setAlpha((int) (Color.alpha(-1) * g12));
                            canvas2.drawBitmap(bitmap2, L5 - (bitmap2.getWidth() / 2.0f), f35 - (bitmap2.getHeight() / 2.0f), paint6);
                        }
                    }
                    textPaint.setTextSize(org.telegram.messenger.i0.L(15.0f));
                    textPaint.setColor(-1);
                    textPaint.setAlpha((int) (g12 * f7));
                    canvas2.drawText(strArr[i10], rectF2.left + org.telegram.messenger.i0.L(52.0f), strArr2[i10] != null ? f35 - org.telegram.messenger.i0.L(2.0f) : org.telegram.messenger.i0.L(5.0f) + f35, textPaint);
                    if (strArr2[i10] != null) {
                        textPaint.setTextSize(org.telegram.messenger.i0.L(12.0f));
                        textPaint.setColor(-1493172225);
                        textPaint.setAlpha((int) (Color.alpha(-1493172225) * g12));
                        canvas2.drawText(strArr2[i10], rectF2.left + org.telegram.messenger.i0.L(52.0f), f35 + org.telegram.messenger.i0.L(14.0f), textPaint);
                    }
                    canvas2.restore();
                }
                f32 = f34;
            }
            i12 = i10 + 1;
            f26 = f7;
            f28 = f10;
            f29 = 0.15f;
            f31 = 0.6f;
            z10 = false;
            i11 = 1;
            f19 = 1.0f;
        }
        canvas2.restore();
        canvas2.restore();
    }

    public final void K0() {
        if (this.W4 != null || this.V4) {
            return;
        }
        this.V4 = true;
        Utilities.e.c(new n0(this, i0.b.o(i0.b.f(0.4f, N0(), -16777216), 16), 0));
    }

    public final void L(float f7, float f10, float f11, float f12, Canvas canvas, RectF rectF) {
        float min = Math.min(f11, f12);
        float max = Math.max(f11, f12);
        Paint paint = this.a6;
        if (min > 0.002f) {
            paint.setShader(null);
            paint.setColor(g(min, 16777215));
            canvas.drawRect(f7, rectF.top, f10, rectF.bottom, paint);
        }
        float f13 = max - min;
        if (f13 > 0.002f) {
            LinearGradient linearGradient = f12 >= f11 ? this.X5 : this.Y5;
            Matrix matrix = this.Z5;
            matrix.setScale(f10 - f7, 1.0f);
            matrix.postTranslate(f7, 0.0f);
            linearGradient.setLocalMatrix(matrix);
            paint.setShader(linearGradient);
            paint.setColor(-1);
            paint.setAlpha((int) (f13 * 255.0f));
            canvas.drawRect(f7, rectF.top, f10, rectF.bottom, paint);
            paint.setShader(null);
        }
    }

    public final float L0(float f7) {
        if (!this.y3 || this.r4 <= 0.001f) {
            return 0.0f;
        }
        float f10 = this.q4;
        float[] fArr = y0.b;
        float max = f10 / Math.max(0.3f, fArr[50]);
        if (max > 4.0f || max < -4.0f) {
            return 0.0f;
        }
        return Math.min(org.telegram.messenger.i0.N(fArr[42]), (org.telegram.messenger.i0.L(3.5f) / 2.0f) / 0.607f) * f7 * max * ((float) Math.exp((-0.5f) * max * max)) * this.r4;
    }

    public final void M(Canvas canvas, int i10, RectF rectF, boolean z10) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        boolean z11 = this.r9 == i10;
        long[] jArr = this.x9;
        if (z11 || jArr[i10] != 0) {
            float X0 = z11 ? X0(i10, currentAnimationTimeMillis) : this.y9[i10] * ((float) Math.exp((-(currentAnimationTimeMillis - jArr[i10])) / 180.0f));
            if (!z11 && X0 < 0.004f) {
                jArr[i10] = 0;
                return;
            }
            float D = c3.i0.D(X0, 2.0f, 3.0f, X0 * X0);
            float min = Math.min(1.0f, (currentAnimationTimeMillis - this.w9[i10]) / 320.0f);
            float f7 = 1.0f - min;
            float x10 = f1.x(f7, f7, f7, 1.0f);
            if (!z11 || X0 < 0.996f || min < 1.0f) {
                invalidate();
            }
            float max = Math.max(rectF.left, Math.min(rectF.right, this.u9[i10]));
            float max2 = Math.max(rectF.top, Math.min(rectF.bottom, this.v9[i10]));
            float max3 = (float) Math.max(Math.hypot(max - rectF.left, max2 - rectF.top), Math.max(Math.hypot(max - rectF.right, max2 - rectF.top), Math.max(Math.hypot(max - rectF.left, max2 - rectF.bottom), Math.hypot(max - rectF.right, max2 - rectF.bottom))));
            int i11 = z10 ? 335544320 : 738197503;
            Paint paint = this.s9;
            paint.setColor((((int) ((i11 >>> 24) * D)) << 24) | (16777215 & i11));
            Path path = this.t9;
            path.rewind();
            if (i10 == 3 || i10 == 4 || i10 == 11) {
                path.addOval(rectF, Path.Direction.CW);
            } else if (i10 >= 6 || i10 == 5) {
                float min2 = Math.min(org.telegram.messenger.i0.L(20.0f), rectF.height() / 2.0f);
                path.addRoundRect(rectF, min2, min2, Path.Direction.CW);
            } else {
                path.addRect(rectF, Path.Direction.CW);
            }
            canvas.save();
            canvas.clipPath(path);
            canvas.drawCircle(max, max2, Math.max(org.telegram.messenger.i0.L(6.0f), max3 * x10), paint);
            canvas.restore();
        }
    }

    public final void M0(int i10, v0 v0Var, int i11, int i12) {
        int i13 = i10 * 7;
        int i14 = v0Var.a;
        float[] fArr = this.j3;
        if (i14 == 0 && v0Var.f == H9) {
            fArr[i13] = 0.0f;
            fArr[i13 + 1] = 0.0f;
            fArr[i13 + 2] = 0.0f;
            float f7 = L9;
            fArr[i13 + 3] = f7;
            float f10 = M9;
            fArr[i13 + 4] = f10;
            fArr[i13 + 5] = 1.0f / ((i12 * f10) + (i11 * f7));
            fArr[i13 + 6] = 0.5f;
        } else {
            fArr[i13] = 1.0f;
            fArr[i13 + 1] = i11 / 2.0f;
            fArr[i13 + 2] = (l() / 2.0f) + m();
            fArr[i13 + 3] = 0.0f;
            fArr[i13 + 4] = 0.0f;
            fArr[i13 + 5] = 1.0f / (((float) Math.hypot(i11, i12)) * 0.62f);
            fArr[i13 + 6] = 0.55f;
        }
        int i15 = i10 * 3;
        int i16 = v0Var.b;
        int[] iArr = this.l3;
        iArr[i15] = i16;
        iArr[i15 + 1] = v0Var.g;
        iArr[i15 + 2] = v0Var.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x03ed, code lost:
    
        if (r6.s8[r7] != ((r49 * 31) + r50)) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0ccd  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0d1b  */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0ac4  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0acd  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0ba9  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0bfc  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0c33  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0c6f  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0c83  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0c88  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0c8b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0c42  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0c29  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0c97 A[EDGE_INSN: B:312:0x0c97->B:313:0x0c97 BREAK  A[LOOP:2: B:259:0x0ac9->B:294:0x0c8b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0c9c A[LOOP:3: B:314:0x0c98->B:316:0x0c9c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0cc5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N(Canvas canvas, int i10, int i11) {
        RectF rectF;
        float f7;
        float f10;
        float f11;
        float f12;
        int i12;
        float f13;
        int i13;
        x0 x0Var;
        Canvas canvas2;
        float f14;
        float f15;
        RectF rectF2;
        int i14;
        int i15;
        float f16;
        float f17;
        float f18;
        RectF rectF3;
        boolean z10;
        ArrayList arrayList;
        float f19;
        boolean z11;
        int i16;
        float[] fArr;
        int i17;
        boolean z12;
        RectF rectF4;
        int i18;
        float f20;
        float x10;
        float f21;
        boolean z13;
        float f22;
        float f23;
        u0 u0Var;
        float f24;
        float f25;
        TLRPC.Document document;
        ArrayList<TLRPC.Document> arrayList2;
        RectF rectF5;
        long j10;
        float f26;
        float f27;
        float f28;
        float T1;
        float f29;
        int i19;
        int i20;
        float f30;
        float f31;
        int i21;
        int i22;
        x0 x0Var2 = this;
        float f32 = x0Var2.f1;
        if (f32 <= 0.001f) {
            return;
        }
        float l4 = Utilities.l(f32);
        float b12 = x0Var2.b1();
        float a12 = x0Var2.a1();
        float f33 = a12 - b12;
        float L = org.telegram.messenger.i0.L(10.0f);
        float L2 = i10 - org.telegram.messenger.i0.L(10.0f);
        RectF rectF6 = x0Var2.u7;
        rectF6.set(L, f33, L2, a12);
        float height = (x0Var2.getHeight() - x0Var2.u3) - org.telegram.messenger.i0.L(40.0f);
        float L3 = org.telegram.messenger.i0.L(10.0f) - org.telegram.messenger.i0.L(3.0f);
        float f34 = i10;
        float f35 = f34 / 2.0f;
        float max = Math.max(L3, org.telegram.messenger.i0.T1(f35 - org.telegram.messenger.i0.L(72.0f), rectF6.left, f32));
        float T12 = org.telegram.messenger.i0.T1(height - org.telegram.messenger.i0.L(20.0f), f33, f32);
        float min = Math.min(f34 - L3, org.telegram.messenger.i0.T1(f35 + org.telegram.messenger.i0.L(72.0f), rectF6.right, f32));
        float T13 = org.telegram.messenger.i0.T1(org.telegram.messenger.i0.L(20.0f) + height, a12, l4);
        RectF rectF7 = x0Var2.z7;
        rectF7.set(max, T12, min, T13);
        float min2 = Math.min(rectF7.height() / 2.0f, org.telegram.messenger.i0.W1(l4, org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(28.17f)));
        float f36 = 0.5f;
        x0Var2.A6 = l4 > 0.5f;
        if (l4 >= 0.35f) {
            f7 = 0.35f;
            if (x0Var2.e6 || x0Var2.g1 <= 0.5f) {
                f10 = 10.0f;
                rectF = rectF6;
            } else {
                x0Var2.e6 = true;
                f10 = 10.0f;
                rectF = rectF6;
                x0Var2.c6 = AnimationUtils.currentAnimationTimeMillis();
            }
        } else {
            rectF = rectF6;
            f7 = 0.35f;
            f10 = 10.0f;
        }
        if (l4 < 0.05f) {
            x0Var2.e6 = false;
        }
        x0Var2.r6 = l4;
        x0Var2.s6 = true;
        x0Var2.J(canvas, rectF7, min2, 1.0f);
        x0Var2.s6 = false;
        x0Var2.A6 = false;
        v0 v0Var = x0Var2.n;
        int i23 = v0Var != null ? v0Var.h : TLObject.FLAG_30;
        float f37 = f10;
        Paint paint = x0Var2.z1;
        paint.setColor(i23);
        paint.setAlpha((int) (Color.alpha(i23) * l4));
        float[][] fArr2 = y0.a;
        int i24 = 2;
        if (l4 > 0.5f) {
            float min3 = Math.min(0.0f, org.telegram.messenger.i0.N(fArr2[2][8]));
            RectF rectF8 = x0Var2.V5;
            rectF8.set(rectF7);
            rectF8.inset(min3, min3);
            float f38 = min2 - min3;
            canvas.drawRoundRect(rectF8, f38, f38, paint);
        } else {
            canvas.drawRoundRect(rectF7, min2, min2, paint);
        }
        float l10 = 1.0f - Utilities.l(l4 / f7);
        int i25 = 3;
        Path path = x0Var2.E1;
        if (l10 > 0.0f) {
            canvas.save();
            path.rewind();
            path.addRoundRect(rectF7, min2, min2, Path.Direction.CW);
            canvas.clipPath(path);
            float L4 = org.telegram.messenger.i0.L(144.0f) / 3.0f;
            int i26 = 0;
            while (i26 < i25) {
                int i27 = i25;
                float b10 = z20.b(i26, f36, L4, f35 - org.telegram.messenger.i0.L(72.0f));
                Drawable drawable = x0Var2.f7[i26];
                float T14 = org.telegram.messenger.i0.T1(height, height - org.telegram.messenger.i0.L(f37), l4);
                float L5 = org.telegram.messenger.i0.L(i26 == 1 ? 24.5f : 22.0f);
                float f39 = min2;
                float f40 = l4 * 0.15f;
                int i28 = i26 == x0Var2.h1 ? 1 : 0;
                int i29 = i26;
                float f41 = l10;
                o0(canvas, drawable, b10, T14, c3.i0.C(f40, i28, 1.0f, L5), f41);
                f36 = 0.5f;
                l10 = f41;
                x0Var2 = this;
                min2 = f39;
                L4 = L4;
                i25 = i27;
                l4 = l4;
                i26 = i29 + 1;
            }
            x0Var = x0Var2;
            f11 = f36;
            f12 = l4;
            i12 = i25;
            i13 = 1;
            f13 = min2;
            canvas.restore();
        } else {
            f11 = 0.5f;
            f12 = l4;
            i12 = 3;
            f13 = min2;
            i13 = 1;
            x0Var = x0Var2;
        }
        float f42 = x0Var.y7;
        if (f42 <= 0.004f) {
            return;
        }
        int i30 = f42 < 0.999f ? i13 : 0;
        if (i30 != 0) {
            RectF rectF9 = rectF;
            int i31 = (int) (f42 * 255.0f);
            canvas2 = canvas;
            rectF2 = rectF9;
            canvas2.saveLayerAlpha(rectF9.left, f33, rectF9.right, a12, i31);
            f14 = f33;
            f15 = a12;
        } else {
            canvas2 = canvas;
            f14 = f33;
            f15 = a12;
            rectF2 = rectF;
        }
        canvas2.save();
        path.rewind();
        path.addRoundRect(rectF7, f13, f13, Path.Direction.CW);
        canvas2.clipPath(path);
        int i32 = x0Var.h1 != i13 ? i13 : 0;
        if (i32 != 0) {
            canvas2.saveLayer(rectF7, null);
        }
        canvas2.save();
        canvas2.translate(0.0f, (1.0f - x0Var.y7) * org.telegram.messenger.i0.L(14.0f));
        canvas2.translate(0.0f, -x0Var.j1);
        float L6 = org.telegram.messenger.i0.L(4.0f) + f14;
        int i33 = x0Var.h1;
        if (i33 == 0) {
            float width = (rectF2.width() - org.telegram.messenger.i0.L(8.0f)) / 6.0f;
            float min4 = Math.min(width - org.telegram.messenger.i0.L(f37), org.telegram.messenger.i0.L(44.0f));
            int i34 = x0Var.g1 > f11 ? i13 : 0;
            float V0 = i34 != 0 ? x0Var.V0() : 1.0f;
            if (i34 != 0) {
                f27 = 1.0f;
                float f43 = 1.0f - V0;
                T1 = org.telegram.messenger.i0.T1(0.8f, 1.0f, f1.x(f43, f43, f43, 1.0f));
                f28 = 0.8f;
            } else {
                f27 = 1.0f;
                f28 = 0.8f;
                T1 = org.telegram.messenger.i0.T1(0.96f, 1.0f, x0Var.y7);
            }
            if (i34 != 0 && V0 < f27) {
                x0Var.invalidate();
            }
            canvas2.save();
            float centerX = rectF2.centerX();
            float f44 = x0Var.j1;
            canvas2.scale(T1, T1, centerX, i34 != 0 ? f44 + f15 : c3.i0.B(f15, f14, 2.0f, f44 + f14));
            int i35 = 0;
            while (i35 < a.b.length) {
                int e12 = e1(i35);
                float f45 = f11;
                float b11 = z20.b(i35 % 6, f45, width, rectF2.left + org.telegram.messenger.i0.L(4.0f));
                float b13 = z20.b(i35 / 6, f45, width, L6);
                float f46 = b13 - x0Var.j1;
                float f47 = f14;
                if (f46 > i11 + width || f46 < f47 - width) {
                    f29 = L6;
                    i19 = i32;
                    i20 = i30;
                    f30 = width;
                    f31 = f47;
                } else {
                    float max2 = Math.max(0.0f, Math.min(f37, (f46 - f47) / width));
                    float l11 = Utilities.l(i34 != 0 ? ((V0 * 420.0f) - (max2 * 12.0f)) / 300.0f : (x0Var.y7 - (max2 * 0.02f)) / f28);
                    float f48 = i34 != 0 ? 0.82f : 0.85f;
                    float f49 = 1.0f - l11;
                    float k12 = (((1.0f - ((f49 * f49) * f49)) * (1.0f - f48)) + f48) * x0Var.k1(i35);
                    if (k12 != 1.0f) {
                        canvas2.save();
                        canvas2.scale(k12, k12, b11, b13);
                    }
                    float f50 = min4 / 2.0f;
                    f29 = L6;
                    if (e12 == H9) {
                        i21 = -12602881;
                    } else {
                        k();
                        i21 = D9[e12];
                    }
                    int i36 = i21;
                    if (e12 == H9) {
                        i22 = -15308082;
                    } else {
                        k();
                        i22 = E9[e12];
                    }
                    int i37 = i22;
                    v0 v0Var2 = x0Var.n;
                    if (v0Var2 != null && v0Var2.a == 0) {
                        int i38 = v0Var2.f;
                    }
                    float f51 = i35 == x0Var.u8 ? x0Var.w8 : i35 == x0Var.v8 ? x0Var.x8 : 0.0f;
                    paint.setColor(-1);
                    int length = x0Var.r8.length;
                    int[] iArr = a.b;
                    float f52 = f51;
                    if (length != iArr.length) {
                        x0Var.r8 = new LinearGradient[iArr.length];
                        x0Var.s8 = new int[iArr.length];
                    }
                    LinearGradient[] linearGradientArr = x0Var.r8;
                    LinearGradient linearGradient = linearGradientArr[i35];
                    LinearGradient[] linearGradientArr2 = linearGradient != null ? linearGradientArr : linearGradientArr;
                    LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 1.0f, 1.0f, i36, i37, Shader.TileMode.CLAMP);
                    linearGradientArr2[i35] = linearGradient2;
                    x0Var.s8[i35] = (i36 * 31) + i37;
                    linearGradient = linearGradient2;
                    float f53 = f50 * 2.0f;
                    Matrix matrix = x0Var.d7;
                    matrix.setScale(f53, f53);
                    float f54 = b11 - f50;
                    i19 = i32;
                    float f55 = b13 - f50;
                    matrix.postTranslate(f54, f55);
                    linearGradient.setLocalMatrix(matrix);
                    paint.setShader(linearGradient);
                    canvas2.drawCircle(b11, b13, f50, paint);
                    paint.setShader(null);
                    float max3 = Math.max(0.0f, -org.telegram.messenger.i0.N(fArr2[i12][8])) + 1.0f;
                    float f56 = (b11 + f50) - max3;
                    float f57 = (b13 + f50) - max3;
                    RectF rectF10 = x0Var.c7;
                    rectF10.set(f54 + max3, f55 + max3, f56, f57);
                    i20 = i30;
                    float f58 = f52;
                    f30 = width;
                    float f59 = f28;
                    f31 = f47;
                    x0Var.t8.a(canvas, rectF10, f50 - max3, 3, 1.0f);
                    canvas2 = canvas;
                    if (f58 > 0.01f) {
                        boolean z14 = i35 == x0Var.u8;
                        float L7 = (f50 - org.telegram.messenger.i0.L(4.0f)) - org.telegram.messenger.i0.L(1.0f);
                        float T15 = z14 ? org.telegram.messenger.i0.T1(f59, 1.0f, f58) * L7 : org.telegram.messenger.i0.T1(f50 - org.telegram.messenger.i0.N(1.0f), L7, f58);
                        float L8 = org.telegram.messenger.i0.L(2.0f);
                        if (!z14) {
                            L8 *= f58;
                        }
                        float min5 = z14 ? f58 : Math.min(1.0f, f58 * 3.0f);
                        double h = i0.b.h(i36);
                        Paint paint2 = x0Var.A1;
                        if (h > 0.62d) {
                            paint2.setColor(a(min5, 939524096));
                            float N = org.telegram.messenger.i0.N(1.2f);
                            if (z14) {
                                f58 = 1.0f;
                            }
                            paint2.setStrokeWidth((N * f58) + L8);
                            canvas2.drawCircle(b11, b13, T15, paint2);
                        }
                        paint2.setColor(a(min5, -1));
                        paint2.setStrokeWidth(L8);
                        canvas2.drawCircle(b11, b13, T15, paint2);
                    }
                    if (k12 != 1.0f) {
                        canvas2.restore();
                        x0Var.invalidate();
                    }
                }
                i35++;
                f14 = f31;
                width = f30;
                i30 = i20;
                L6 = f29;
                i32 = i19;
                f11 = 0.5f;
                f28 = 0.8f;
                f37 = 10.0f;
            }
            i14 = i32;
            i15 = i30;
            canvas2.restore();
        } else {
            float f60 = f14;
            i14 = i32;
            i15 = i30;
            float f61 = 1.2f;
            if (i33 != i13) {
                boolean z15 = x0Var.g1 > 0.5f;
                float V02 = z15 ? x0Var.V0() : 1.0f;
                boolean z16 = z15 && V02 < 1.0f;
                if (z16) {
                    float f62 = 1.0f - V02;
                    float T16 = org.telegram.messenger.i0.T1(0.75f, 1.0f, f1.x(f62, f62, f62, 1.0f));
                    canvas2.save();
                    canvas2.scale(T16, T16, rectF2.centerX(), x0Var.j1 + f15);
                    x0Var.invalidate();
                }
                boolean h02 = x0Var.h0();
                ArrayList arrayList3 = x0Var.v1;
                if (h02) {
                    float centerX2 = rectF2.centerX();
                    float L10 = org.telegram.messenger.i0.L(99.0f);
                    Typeface o10 = org.telegram.messenger.i0.o();
                    f19 = 250.0f;
                    TextPaint textPaint = x0Var.a8;
                    textPaint.setTypeface(o10);
                    textPaint.setTextSize(org.telegram.messenger.i0.L(16.0f));
                    Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
                    int width2 = (int) (rectF2.width() - org.telegram.messenger.i0.L(32.0f));
                    f16 = f15;
                    f17 = V02;
                    boolean z17 = x0Var.w1 > 0;
                    boolean z18 = !z17;
                    StaticLayout staticLayout = x0Var.f8;
                    boolean z19 = z17;
                    TextPaint textPaint2 = x0Var.b8;
                    if (staticLayout == null || x0Var.g8 != width2 || x0Var.h8 != z18) {
                        x0Var.g8 = width2;
                        x0Var.h8 = z18;
                        textPaint2.setTextSize(org.telegram.messenger.i0.L(14.0f));
                        Paint.FontMetrics fontMetrics2 = textPaint2.getFontMetrics();
                        x0Var.f8 = new StaticLayout(cd.L0(!z19 ? 2131746516 : 2131746508, null), textPaint2, width2, Layout.Alignment.ALIGN_CENTER, 1.0f, org.telegram.messenger.i0.L(18.5f) - (fontMetrics2.descent - fontMetrics2.ascent), false);
                    }
                    float B = c3.i0.B(org.telegram.messenger.i0.L(300.0f), ((((fontMetrics.descent - fontMetrics.ascent) + (org.telegram.messenger.i0.L(22.0f) + L10)) + org.telegram.messenger.i0.L(7.0f)) + x0Var.f8.getHeight()) + (x0Var.w1 > 0 ? org.telegram.messenger.i0.L(20.0f) + org.telegram.messenger.i0.L(36.0f) : 0), 2.0f, f60) - org.telegram.messenger.i0.L(8.0f);
                    TLRPC.Document document2 = x0Var.p8;
                    int i39 = x0Var.b;
                    if (document2 != null) {
                        f25 = B;
                        f24 = 36.0f;
                        document = document2;
                    } else {
                        if (x0Var.o8 == null) {
                            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                            x0Var.o8 = tL_inputStickerSetShortName;
                            f24 = 36.0f;
                            tL_inputStickerSetShortName.short_name = "Redo_edc21keMa";
                        } else {
                            f24 = 36.0f;
                        }
                        if (x0Var.n8) {
                            f25 = B;
                            document = null;
                        } else {
                            x0Var.n8 = true;
                            f25 = B;
                            TLRPC.TL_messages_stickerSet l02 = ui.b0(i39).l0(x0Var.o8, null, false, false, new h1(x0Var, 7));
                            if (l02 != null && (arrayList2 = l02.documents) != null && !arrayList2.isEmpty()) {
                                x0Var.p8 = l02.documents.get(0);
                            }
                            document = x0Var.p8;
                        }
                    }
                    if (document != null) {
                        f5 f5Var = x0Var.k8;
                        f18 = f60;
                        rectF5 = rectF7;
                        if (f5Var == null || x0Var.m8 != document.id) {
                            if (f5Var != null) {
                                f5Var.n(x0Var);
                            }
                            f5 l12 = f5.l(i39, 14, document);
                            x0Var.k8 = l12;
                            l12.a(x0Var);
                            x0Var.m8 = document.id;
                            x0Var.q8 = 0L;
                        }
                    } else {
                        f18 = f60;
                        rectF5 = rectF7;
                    }
                    f5 f5Var2 = x0Var.k8;
                    ag.c2 c2Var = f5Var2 != null ? f5Var2.k : null;
                    long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    if (c2Var == null || !c2Var.I()) {
                        z10 = z16;
                        j10 = 0;
                    } else {
                        z10 = z16;
                        j10 = 0;
                        if (x0Var.q8 == 0) {
                            x0Var.q8 = currentAnimationTimeMillis;
                        }
                    }
                    float min6 = x0Var.q8 == j10 ? 0.0f : Math.min(1.0f, (currentAnimationTimeMillis - r12) / 250.0f);
                    float D = c3.i0.D(min6, 2.0f, 3.0f, min6 * min6);
                    float l13 = x0Var.g1 > 0.5f ? Utilities.l(x0Var.V0() / 0.7f) : 1.0f;
                    float f63 = 1.0f - l13;
                    float x11 = f1.x(f63, f63, f63, 1.0f);
                    float T17 = org.telegram.messenger.i0.T1(0.95f, 1.0f, x11);
                    if (l13 < 1.0f) {
                        x0Var.invalidate();
                    }
                    canvas2.save();
                    canvas2.translate(0.0f, (1.0f - x11) * org.telegram.messenger.i0.L(6.0f));
                    float f64 = L10 / 2.0f;
                    canvas2.scale(T17, T17, centerX2, (f25 - org.telegram.messenger.i0.L(2.0f)) + f64);
                    if (D < 1.0f) {
                        if (x0Var.l8 == null) {
                            int i40 = (int) L10;
                            bi0 bi0Var = new bi0(R.raw.qr_resistance_dog, i40, i40, true, null);
                            x0Var.l8 = bi0Var;
                            bi0Var.K(1);
                            x0Var.l8.J(true);
                            x0Var.l8.R(x0Var);
                            x0Var.l8.setCallback(x0Var);
                            x0Var.l8.start();
                        }
                        if (x0Var.l8.u()) {
                            f26 = centerX2;
                            x0Var.l8.setBounds((int) (centerX2 - f64), (int) (f25 - org.telegram.messenger.i0.L(2.0f)), (int) (centerX2 + f64), (int) ((f25 - org.telegram.messenger.i0.L(2.0f)) + L10));
                            x0Var.l8.setAlpha((int) ((1.0f - D) * f12 * 255.0f));
                            x0Var.l8.draw(canvas2);
                        } else {
                            f26 = centerX2;
                        }
                        x0Var.invalidate();
                    } else {
                        f26 = centerX2;
                        bi0 bi0Var2 = x0Var.l8;
                        if (bi0Var2 != null) {
                            bi0Var2.C(false);
                            x0Var.l8 = null;
                        }
                    }
                    f5 f5Var3 = x0Var.k8;
                    if (f5Var3 != null && D > 0.0f) {
                        f5Var3.setBounds((int) (f26 - f64), (int) (f25 - org.telegram.messenger.i0.L(2.0f)), (int) (f26 + f64), (int) ((f25 - org.telegram.messenger.i0.L(2.0f)) + L10));
                        x0Var.k8.setAlpha((int) (f12 * 255.0f * D));
                        x0Var.k8.draw(canvas2);
                    }
                    canvas2.restore();
                    textPaint.setColor(-1);
                    int i41 = (int) (f12 * 255.0f);
                    textPaint.setAlpha(i41);
                    Paint.FontMetrics fontMetrics3 = textPaint.getFontMetrics();
                    float L11 = ((f25 + L10) + org.telegram.messenger.i0.L(18.0f)) - fontMetrics3.ascent;
                    String str = x0Var.i8;
                    canvas2.drawText(str, f26 - (textPaint.measureText(str) / 2.0f), L11, textPaint);
                    textPaint2.setColor(-1);
                    textPaint2.setAlpha((int) (191.0f * f12));
                    float L12 = L11 + fontMetrics3.descent + org.telegram.messenger.i0.L(7.0f);
                    canvas2.save();
                    canvas2.translate(f26 - (x0Var.f8.getWidth() / 2.0f), L12);
                    x0Var.f8.draw(canvas2);
                    canvas2.restore();
                    long j11 = x0Var.w1;
                    RectF rectF11 = x0Var.Z7;
                    if (j11 > 0) {
                        float height2 = L12 + x0Var.f8.getHeight() + org.telegram.messenger.i0.L(20.0f);
                        Typeface o11 = org.telegram.messenger.i0.o();
                        TextPaint textPaint3 = x0Var.c8;
                        textPaint3.setTypeface(o11);
                        textPaint3.setTextSize(org.telegram.messenger.i0.L(14.0f));
                        String str2 = x0Var.j8;
                        float measureText = textPaint3.measureText(str2) + (org.telegram.messenger.i0.L(19.0f) * 2);
                        float L13 = org.telegram.messenger.i0.L(f24);
                        float f65 = measureText / 2.0f;
                        rectF11.set(f26 - f65, height2, f26 + f65, height2 + L13);
                        rectF3 = rectF5;
                        arrayList = arrayList3;
                        int saveLayer = canvas2.saveLayer(rectF11.left - 1.0f, rectF11.top - 1.0f, rectF11.right + 1.0f, rectF11.bottom + 1.0f, null);
                        paint.setColor(-1);
                        paint.setAlpha(i41);
                        float f66 = L13 / 2.0f;
                        canvas2.drawRoundRect(rectF11, f66, f66, paint);
                        x0Var.M(canvas2, 10, rectF11, true);
                        Typeface o12 = org.telegram.messenger.i0.o();
                        TextPaint textPaint4 = x0Var.e8;
                        textPaint4.setTypeface(o12);
                        textPaint4.setTextSize(org.telegram.messenger.i0.L(14.0f));
                        Paint.FontMetrics fontMetrics4 = textPaint4.getFontMetrics();
                        canvas2.drawText(str2, f26 - (textPaint4.measureText(str2) / 2.0f), rectF11.centerY() - ((fontMetrics4.ascent + fontMetrics4.descent) / 2.0f), textPaint4);
                        canvas2.restoreToCount(saveLayer);
                        if (x0Var.d8 == null) {
                            TextPaint textPaint5 = new TextPaint(1);
                            x0Var.d8 = textPaint5;
                            textPaint5.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.MULTIPLY));
                        }
                        x0Var.d8.setTypeface(org.telegram.messenger.i0.o());
                        x0Var.d8.setTextSize(org.telegram.messenger.i0.L(14.0f));
                        v0 v0Var3 = x0Var.n;
                        x0Var.d8.setColor(D0(0.9f, 1.4f, 0.1f, v0Var3 != null ? i0.b.f(0.5f, v0Var3.b, v0Var3.c) : -8355712));
                        x0Var.d8.setAlpha(i41);
                        canvas2.drawText(str2, f26 - (x0Var.d8.measureText(str2) / 2.0f), rectF11.centerY() - ((fontMetrics4.ascent + fontMetrics4.descent) / 2.0f), x0Var.d8);
                    } else {
                        rectF3 = rectF5;
                        arrayList = arrayList3;
                        rectF11.setEmpty();
                    }
                } else {
                    f16 = f15;
                    f17 = V02;
                    f18 = f60;
                    rectF3 = rectF7;
                    z10 = z16;
                    arrayList = arrayList3;
                    f19 = 250.0f;
                    if (arrayList.isEmpty()) {
                        TextPaint textPaint6 = x0Var.C1;
                        textPaint6.setColor(-1275068417);
                        textPaint6.setTextSize(org.telegram.messenger.i0.L(14.0f));
                        String L0 = cd.L0(!x0Var.x1 ? 2131746510 : x0Var.w1 < 0 ? 2131746516 : 2131746509, null);
                        canvas2.drawText(L0, (f34 - textPaint6.measureText(L0)) / 2.0f, L6 + org.telegram.messenger.i0.L(40.0f), textPaint6);
                    }
                }
                int f02 = x0Var.f0();
                int size = arrayList.size();
                float width3 = (rectF2.width() - org.telegram.messenger.i0.L(8.0f)) / 3.0f;
                float f67 = f02;
                float width4 = (rectF2.width() - org.telegram.messenger.i0.L(8.0f)) / f67;
                float f68 = L6 + 0.0f;
                x0Var.q6 = false;
                x0Var.i6 = 0;
                int max4 = (int) Math.max(0.0d, Math.floor(((f18 + x0Var.j1) - f68) / width3));
                x0Var.g6 = max4;
                int max5 = (int) Math.max(max4, Math.floor(((f16 + x0Var.j1) - f68) / width3));
                x0Var.h6 = max5;
                int i42 = (max5 - x0Var.g6) + 1;
                boolean z20 = x0Var.g1 < 0.5f;
                x0Var.f6 = z20;
                if (z20) {
                    x0Var.k6 = AnimationUtils.currentAnimationTimeMillis() - x0Var.d6;
                    x0Var.j6 = Math.min(25.0f, 60.0f / Math.max(1, r1));
                    x0Var.l6 = 0.6f;
                    x0Var.m6 = org.telegram.messenger.i0.L(4.0f);
                    z11 = true;
                } else {
                    float currentAnimationTimeMillis2 = !x0Var.e6 ? 0.0f : AnimationUtils.currentAnimationTimeMillis() - x0Var.c6;
                    x0Var.k6 = currentAnimationTimeMillis2;
                    if (currentAnimationTimeMillis2 > 470.0f) {
                        x0Var.k6 = -1.0f;
                        z11 = true;
                        if (z15) {
                            x0Var.k6 = -1.0f;
                        }
                        i16 = 0;
                        while (true) {
                            fArr = x0Var.n6;
                            if (i16 < size) {
                                break;
                            }
                            float f69 = i16 % f02;
                            float L14 = (width4 * f69) + rectF2.left + org.telegram.messenger.i0.L(4.0f);
                            float f70 = ((i16 / f02) * width3) + f68;
                            float f71 = x0Var.j1;
                            if (f70 - f71 <= f16) {
                                float f72 = f70 + width3;
                                if (f72 - f71 >= f18) {
                                    x0Var.p6 = 1.0f;
                                    if (x0Var.k6 < 0.0f) {
                                        f20 = 1.0f;
                                    } else {
                                        if (x0Var.f6) {
                                            float l14 = Utilities.l((x0Var.k6 - ((f69 * 3.0f) + (Math.max(0, r1 - x0Var.g6) * x0Var.j6))) / 90.0f);
                                            f20 = 1.0f;
                                            x0Var.p6 = org.telegram.messenger.i0.T1(1.0f, x0Var.l6, l14 * l14);
                                            if (l14 >= 0.7f) {
                                                f21 = m5.y(l14, 0.7f, 0.3f, 1.0f);
                                            }
                                        } else {
                                            float l15 = Utilities.l((x0Var.k6 - ((f69 * 4.0f) + (Math.max(0, x0Var.h6 - r1) * x0Var.j6))) / 220.0f);
                                            float f73 = x0Var.l6;
                                            if (x0Var.q6) {
                                                x10 = S(l15, f61);
                                                f20 = 1.0f;
                                            } else {
                                                f20 = 1.0f;
                                                float f74 = 1.0f - l15;
                                                x10 = f1.x(f74, f74, f74, 1.0f);
                                            }
                                            x0Var.p6 = org.telegram.messenger.i0.T1(f73, f20, x10);
                                            float l16 = f20 - Utilities.l(l15 / f7);
                                            f21 = f20 - (l16 * l16);
                                        }
                                        z13 = f21 >= f20 || x0Var.p6 != f20;
                                        if (z13) {
                                            canvas2.save();
                                            float f75 = f20;
                                            float f76 = f21;
                                            canvas2.translate(0.0f, Utilities.l((f75 - x0Var.p6) / (f75 - x0Var.l6)) * x0Var.m6);
                                            float f77 = x0Var.p6;
                                            canvas2.scale(f77, f77, (width4 / 2.0f) + L14, (width3 / 2.0f) + f70);
                                            if (f21 < f20) {
                                                float f78 = L14 + width4;
                                                int i43 = x0Var.i6;
                                                if (i43 < 64) {
                                                    x0Var.i6 = i43 + 1;
                                                    int i44 = i43 * 5;
                                                    fArr[i44] = L14;
                                                    fArr[i44 + 1] = f70;
                                                    fArr[i44 + 2] = f78;
                                                    fArr[i44 + 3] = f72;
                                                    fArr[i44 + 4] = f76;
                                                }
                                            }
                                        }
                                        if (z10) {
                                            f22 = 1.0f;
                                            f23 = 1.0f;
                                        } else {
                                            f22 = 1.0f;
                                            float l17 = 1.0f - Utilities.l(((f17 * 420.0f) - (Math.max(0.0f, Math.min(10.0f, ((f70 - x0Var.j1) - f18) / width3)) * 12.0f)) / 300.0f);
                                            f23 = ((1.0f - ((l17 * l17) * l17)) * 0.18f) + 0.82f;
                                        }
                                        if (f23 == f22) {
                                            canvas2.save();
                                            canvas2.scale(f23, f23, (width4 / 2.0f) + L14, (width3 / 2.0f) + f70);
                                        }
                                        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i16);
                                        float L15 = L14 + org.telegram.messenger.i0.L(4.0f);
                                        float L16 = f70 + org.telegram.messenger.i0.L(4.0f);
                                        float L17 = width4 - org.telegram.messenger.i0.L(8.0f);
                                        float L18 = width3 - org.telegram.messenger.i0.L(8.0f);
                                        u0Var = x0Var.F;
                                        rectF4 = rectF2;
                                        i18 = i24;
                                        if (u0Var.a == i18) {
                                            int i45 = u0Var.q;
                                        }
                                        x0 x0Var3 = x0Var;
                                        z12 = true;
                                        f61 = 1.2f;
                                        x0Var3.I(canvas, i16, tL_starGiftUnique, L15, L16, L17, L18);
                                        x0Var = x0Var3;
                                        if (f23 != f22) {
                                            canvas.restore();
                                        }
                                        if (!z13) {
                                            canvas.restore();
                                        }
                                        i16++;
                                        canvas2 = canvas;
                                        i24 = i18;
                                        z11 = z12;
                                        rectF2 = rectF4;
                                    }
                                    f21 = f20;
                                    if (f21 >= f20) {
                                    }
                                    if (z13) {
                                    }
                                    if (z10) {
                                    }
                                    if (f23 == f22) {
                                    }
                                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i16);
                                    float L152 = L14 + org.telegram.messenger.i0.L(4.0f);
                                    float L162 = f70 + org.telegram.messenger.i0.L(4.0f);
                                    float L172 = width4 - org.telegram.messenger.i0.L(8.0f);
                                    float L182 = width3 - org.telegram.messenger.i0.L(8.0f);
                                    u0Var = x0Var.F;
                                    rectF4 = rectF2;
                                    i18 = i24;
                                    if (u0Var.a == i18) {
                                    }
                                    x0 x0Var32 = x0Var;
                                    z12 = true;
                                    f61 = 1.2f;
                                    x0Var32.I(canvas, i16, tL_starGiftUnique2, L152, L162, L172, L182);
                                    x0Var = x0Var32;
                                    if (f23 != f22) {
                                    }
                                    if (!z13) {
                                    }
                                    i16++;
                                    canvas2 = canvas;
                                    i24 = i18;
                                    z11 = z12;
                                    rectF2 = rectF4;
                                }
                            }
                            z12 = z11;
                            rectF4 = rectF2;
                            i18 = i24;
                            i16++;
                            canvas2 = canvas;
                            i24 = i18;
                            z11 = z12;
                            rectF2 = rectF4;
                        }
                        for (i17 = 0; i17 < x0Var.i6; i17++) {
                            int i46 = i17 * 5;
                            int i47 = (int) (fArr[i46 + 4] * 255.0f);
                            Paint paint3 = x0Var.o6;
                            paint3.setAlpha(i47);
                            canvas.drawRect(fArr[i46], fArr[i46 + 1], fArr[i46 + 2], fArr[i46 + 3], paint3);
                        }
                        x0Var.i6 = 0;
                        if (z10) {
                            canvas.restore();
                        }
                        canvas.restore();
                        if (i14 != 0) {
                            float L19 = org.telegram.messenger.i0.L(12.0f);
                            Matrix matrix2 = x0Var.C7;
                            matrix2.setScale(1.0f, L19);
                            RectF rectF12 = rectF3;
                            matrix2.postTranslate(0.0f, rectF12.top);
                            LinearGradient linearGradient3 = x0Var.A7;
                            linearGradient3.setLocalMatrix(matrix2);
                            float f79 = rectF12.left;
                            float f80 = rectF12.top;
                            canvas.drawRect(f79, f80, rectF12.right, f80 + L19, x0Var.B7);
                            matrix2.setScale(1.0f, -L19);
                            matrix2.postTranslate(0.0f, rectF12.bottom);
                            linearGradient3.setLocalMatrix(matrix2);
                            float f81 = rectF12.left;
                            float f82 = rectF12.bottom;
                            canvas.drawRect(f81, f82 - L19, rectF12.right, f82, x0Var.B7);
                            canvas.restore();
                        }
                        canvas.restore();
                        if (i15 != 0) {
                            canvas.restore();
                            return;
                        }
                        return;
                    }
                    z11 = true;
                    x0Var.j6 = Math.min(45.0f, (f19 - (f67 * 4.0f)) / Math.max(1, i42));
                    x0Var.l6 = 0.7f;
                    x0Var.m6 = org.telegram.messenger.i0.L(7.0f);
                }
                x0Var.invalidate();
                if (z15) {
                }
                i16 = 0;
                while (true) {
                    fArr = x0Var.n6;
                    if (i16 < size) {
                    }
                    i16++;
                    canvas2 = canvas;
                    i24 = i18;
                    z11 = z12;
                    rectF2 = rectF4;
                }
                while (i17 < x0Var.i6) {
                }
                x0Var.i6 = 0;
                if (z10) {
                }
                canvas.restore();
                if (i14 != 0) {
                }
                canvas.restore();
                if (i15 != 0) {
                }
            }
        }
        rectF3 = rectF7;
        canvas.restore();
        if (i14 != 0) {
        }
        canvas.restore();
        if (i15 != 0) {
        }
    }

    public final int N0() {
        v0 v0Var = this.n;
        if (v0Var == null) {
            return -16777216;
        }
        if (this.s >= 1.0f || this.r == null) {
            return v0Var.e;
        }
        float l4 = (l() / 2.0f) + m();
        float l10 = Utilities.l(((((((float) Math.hypot(Math.max(this.x, getWidth() - this.x), Math.max(this.y, getHeight() - this.y))) + org.telegram.messenger.i0.L(60.0f)) * y1(this.s)) - ((float) Math.hypot((getWidth() / 2.0f) - this.x, l4 - this.y))) + org.telegram.messenger.i0.L(80.0f)) / org.telegram.messenger.i0.L(160.0f));
        int i10 = this.r.e;
        int i11 = this.n.e;
        float D = c3.i0.D(l10, 2.0f, 3.0f, l10 * l10);
        double[] dArr = this.q3;
        i0.b.j(i10, dArr);
        double[] dArr2 = this.r3;
        i0.b.j(i11, dArr2);
        double d = D;
        double[] dArr3 = this.s3;
        if (dArr3.length != 3) {
            throw new IllegalArgumentException("outResult must have a length of 3.");
        }
        double d10 = 1.0d - d;
        double d11 = (dArr2[0] * d) + (dArr[0] * d10);
        dArr3[0] = d11;
        double d12 = (dArr2[1] * d) + (dArr[1] * d10);
        dArr3[1] = d12;
        double d13 = (dArr2[2] * d) + (dArr[2] * d10);
        dArr3[2] = d13;
        return i0.b.b(d11, d12, d13);
    }

    public final void O(Canvas canvas, float f7, float f10, float f11, int i10, boolean z10) {
        PorterDuffColorFilter n12 = n1(i10);
        org.telegram.ui.o0 o0Var = this.T1;
        o0Var.setColorFilter(n12);
        o0Var.setAlpha(zs.e4);
        float f12 = f11 / 2.0f;
        float f13 = f10 - f12;
        float f14 = f7 + f11;
        float f15 = f10 + f12;
        o0Var.setBounds((int) f7, (int) f13, (int) f14, (int) f15);
        if (!z10) {
            o0Var.draw(canvas);
            return;
        }
        float f16 = f11 * 0.095f;
        float f17 = (0.28f * f11) + f7;
        float f18 = f10 - (0.21f * f11);
        float f19 = (0.74f * f11) + f7;
        float f20 = (0.25f * f11) + f10;
        RectF rectF = this.V5;
        rectF.set(f7 - org.telegram.messenger.i0.L(2.0f), f13 - org.telegram.messenger.i0.L(2.0f), f14 + org.telegram.messenger.i0.L(2.0f), f15 + org.telegram.messenger.i0.L(2.0f));
        canvas.saveLayer(rectF, null);
        o0Var.draw(canvas);
        Paint paint = this.Y1;
        paint.setStrokeWidth((0.065f * f11 * 2.0f) + f16);
        canvas.drawLine(f17, f18, f19, f20, paint);
        canvas.restore();
        Paint paint2 = this.A1;
        paint2.setColor(i10);
        paint2.setStrokeWidth(f16);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawLine(f17, f18, f19, f20, paint2);
        paint2.setStrokeCap(Paint.Cap.BUTT);
    }

    public final void O0() {
        this.X1.C(false);
        Bitmap bitmap = this.R2;
        if (bitmap != null) {
            bitmap.recycle();
            this.R2 = null;
        }
        bi0 bi0Var = this.a9;
        if (bi0Var != null) {
            bi0Var.C(false);
            this.a9 = null;
        }
        bi0 bi0Var2 = this.l8;
        if (bi0Var2 != null) {
            bi0Var2.C(false);
            this.l8 = null;
        }
        f5 f5Var = this.k8;
        if (f5Var != null) {
            f5Var.n(this);
            this.k8 = null;
            this.m8 = 0L;
        }
        P0(this.F);
        P0(this.G);
        removeCallbacks(this.p9);
        v5 v5Var = this.i2;
        if (v5Var != null) {
            v5Var.f();
        }
        VelocityTracker velocityTracker = this.k0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.k0 = null;
        }
        VelocityTracker velocityTracker2 = this.m9;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.m9 = null;
        }
        HashMap hashMap = this.J7;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((f5) it.next()).n(this);
        }
        for (Drawable drawable : this.J.values()) {
            if (drawable instanceof f5) {
                ((f5) drawable).n(this);
            }
        }
        hashMap.clear();
        HashMap hashMap2 = this.K7;
        Iterator it2 = hashMap2.values().iterator();
        while (it2.hasNext()) {
            d5 d5Var = ((w0) it2.next()).a;
            if (d5Var != null) {
                d5Var.b();
            }
        }
        hashMap2.clear();
    }

    public final void P(Canvas canvas, float f7, float f10, float f11, float f12) {
        if (this.p1 == null || f12 <= 0.004f) {
            return;
        }
        float L = org.telegram.messenger.i0.L(15.0f);
        TextPaint textPaint = this.y2;
        textPaint.setTextSize(L);
        textPaint.setColor(-1);
        textPaint.setAlpha((int) (f12 * 255.0f));
        canvas.drawText(this.p1, ((f7 + f11) - org.telegram.messenger.i0.L(16.0f)) - textPaint.measureText(this.p1), f10 + org.telegram.messenger.i0.L(5.0f), textPaint);
        textPaint.setAlpha(zs.e4);
    }

    public final void P0(u0 u0Var) {
        if (u0Var == null) {
            return;
        }
        f5 f5Var = u0Var.c;
        if (f5Var != null) {
            f5Var.n(this);
        }
        f5 f5Var2 = u0Var.d;
        if (f5Var2 != null && !this.J7.containsValue(f5Var2)) {
            u0Var.d.n(this);
        }
        u0Var.G = true;
        s sVar = u0Var.F;
        if (sVar != null) {
            sVar.e = true;
            zs.f(sVar.a).n(sVar, zs.Y1);
            u0Var.F = null;
        }
    }

    public final void Q(float f7, float f10, float f11, Canvas canvas, boolean z10) {
        Canvas canvas2;
        float f12;
        float f13;
        if (this.W8 == 0) {
            canvas2 = canvas;
            bi0 r12 = r1();
            int L = org.telegram.messenger.i0.L(27.0f);
            float f14 = L / 2.0f;
            int i10 = (int) (f10 - f14);
            r12.setBounds((int) ((org.telegram.messenger.i0.L(26.0f) + f7) - f14), i10, ((int) ((org.telegram.messenger.i0.L(26.0f) + f7) - f14)) + L, L + i10);
            r12.draw(canvas2);
        } else if (z10) {
            float L2 = f10 - org.telegram.messenger.i0.L(10.0f);
            Paint.Style style = Paint.Style.STROKE;
            Paint paint = this.R8;
            paint.setStyle(style);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
            paint.setColor(-1);
            float f15 = 1.0f;
            paint.setAlpha((int) (Color.alpha(-1) * 1.0f));
            float L3 = ((org.telegram.messenger.i0.L(26.0f) + f7) - org.telegram.messenger.i0.L(10.0f)) + org.telegram.messenger.i0.L(10.0f);
            float L4 = L2 + org.telegram.messenger.i0.L(11.0f);
            float L5 = org.telegram.messenger.i0.L(7.25f);
            if (f11 >= 0.0f) {
                float l4 = 1.0f - Utilities.l(f11 / 0.42f);
                float x10 = f1.x(l4, l4, l4, 1.0f);
                if (f11 < 0.6f) {
                    float f16 = 1.0f - (f11 / 0.6f);
                    f13 = (1.0f - ((f16 * f16) * f16)) * 364.0f;
                } else {
                    float l10 = Utilities.l((f11 - 0.6f) / 0.12f);
                    f13 = 364.0f - ((3.0f - (l10 * 2.0f)) * ((4.0f * l10) * l10));
                }
                f12 = f13;
                f15 = x10;
            } else {
                f12 = 0.0f;
            }
            float f17 = L4 - L5;
            RectF rectF = this.S8;
            rectF.set(L3 - L5, f17, L3 + L5, L5 + L4);
            canvas.drawArc(rectF, -82.0f, f15 * 344.0f, false, paint);
            canvas.drawLine(L3, f17, L3, L2 + org.telegram.messenger.i0.L(2.2f), paint);
            double radians = Math.toRadians(f12 - 90.0f);
            canvas2 = canvas;
            canvas2.drawLine(L3, L4, f1.d(3.8f, (float) Math.cos(radians), L3), f1.d(3.8f, (float) Math.sin(radians), L4), paint);
            paint.setStyle(Paint.Style.FILL);
            canvas2.drawCircle(L3, L4, org.telegram.messenger.i0.N(1.2f), paint);
        } else {
            canvas2 = canvas;
            if (n()) {
                bi0 p12 = p1();
                int L6 = org.telegram.messenger.i0.L(28.0f);
                float f18 = L6 / 2.0f;
                int i11 = (int) (f10 - f18);
                p12.setBounds((int) ((org.telegram.messenger.i0.L(26.0f) + f7) - f18), i11, ((int) ((org.telegram.messenger.i0.L(26.0f) + f7) - f18)) + L6, L6 + i11);
                p12.draw(canvas2);
            } else {
                int i12 = this.W8;
                if (i12 == R.drawable.msg_download) {
                    bi0 q12 = q1();
                    int L7 = org.telegram.messenger.i0.L(28.0f);
                    float f19 = L7 / 2.0f;
                    int i13 = (int) (f10 - f19);
                    q12.setBounds((int) ((org.telegram.messenger.i0.L(26.0f) + f7) - f19), i13, ((int) ((org.telegram.messenger.i0.L(26.0f) + f7) - f19)) + L7, L7 + i13);
                    q12.draw(canvas2);
                } else {
                    o0(canvas2, i12 == R.drawable.msg_retry ? this.R1 : i12 == R.drawable.msg_copy ? this.J1 : this.S1, f7 + org.telegram.messenger.i0.L(26.0f), f10, org.telegram.messenger.i0.L(20.0f), 1.0f);
                    canvas2 = canvas2;
                }
            }
        }
        TextPaint textPaint = this.C1;
        textPaint.setColor(-1);
        float f20 = this.s1;
        if (f20 <= 0.0f) {
            f20 = org.telegram.messenger.i0.L(15.0f);
        }
        textPaint.setTextSize(f20);
        String str = this.U8;
        float L8 = f7 + org.telegram.messenger.i0.L(48.0f);
        float L10 = org.telegram.messenger.i0.L(5.0f) + f10;
        int indexOf = str.indexOf(10);
        if (indexOf >= 0) {
            canvas2.drawText(str, 0, indexOf, L8, L10 - org.telegram.messenger.i0.L(9.0f), (Paint) textPaint);
            canvas.drawText(str, indexOf + 1, str.length(), L8, L10 + org.telegram.messenger.i0.L(9.0f), (Paint) textPaint);
            return;
        }
        if (!s0(str)) {
            canvas2.drawText(str, L8, L10, textPaint);
            return;
        }
        float textSize = textPaint.getTextSize();
        TextPaint textPaint2 = this.y2;
        textPaint2.setTextSize(textSize);
        textPaint2.setColor(textPaint.getColor());
        canvas2.drawText(this.v2, L8, L10, textPaint);
        float measureText = textPaint.measureText(this.v2) + L8;
        canvas2.drawText(this.w2, measureText, L10, textPaint2);
        canvas2.drawText(this.x2, textPaint2.measureText(this.w2) + measureText, L10, textPaint);
    }

    public final void Q0() {
        int i10 = this.r9;
        if (i10 >= 0) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.y9[i10] = X0(i10, currentAnimationTimeMillis);
            this.x9[i10] = currentAnimationTimeMillis;
            invalidate();
        }
        this.r9 = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x040a, code lost:
    
        if (r2.a0 < (r2.e[0] - 1)) goto L218;
     */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0265  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R(Canvas canvas, int i10, long j10) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        boolean z10;
        float f14;
        float f15;
        float max;
        float f16;
        float height;
        int L;
        RectF rectF;
        boolean z11;
        float f17;
        float max2;
        boolean z12;
        boolean z13;
        boolean z14;
        bi0 bi0Var;
        String sb2;
        float f18;
        float L2;
        bi0 bi0Var2;
        float f19;
        String str;
        boolean z15 = this.g9 || (this.m1 != null && j10 < this.u1);
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (!this.g9 && z15 && this.N8 && (str = this.U8) != null && !str.equals(this.m1)) {
            this.N8 = false;
            this.M8 = currentAnimationTimeMillis;
        }
        if (!z15 || this.N8) {
            if (!z15 && this.N8) {
                this.N8 = false;
                this.M8 = currentAnimationTimeMillis;
            }
        } else if (this.U8 == null || currentAnimationTimeMillis - this.M8 >= 360) {
            this.N8 = true;
            this.M8 = currentAnimationTimeMillis;
            this.U8 = this.m1;
            int i11 = this.n1;
            this.W8 = i11;
            this.p1 = this.o1;
            this.V8 = false;
            this.X8 = currentAnimationTimeMillis;
            if (i11 == 0) {
                bi0 r12 = r1();
                r12.N(0, false, false);
                r12.start();
            } else if (n()) {
                bi0 p12 = p1();
                p12.N(0, false, false);
                p12.start();
            } else if (this.W8 == R.drawable.msg_download) {
                bi0 q12 = q1();
                q12.N(0, false, false);
                q12.start();
            }
        }
        String str2 = this.U8;
        if (str2 == null) {
            return;
        }
        float f20 = (currentAnimationTimeMillis - this.M8) / 1000.0f;
        float f21 = 2.0f;
        if (this.N8) {
            boolean z16 = str2.indexOf(10) >= 0 || s1(this.U8) + ((float) org.telegram.messenger.i0.L(66.0f)) >= ((float) (i10 - org.telegram.messenger.i0.L(32.0f)));
            if (f20 >= 0.5f) {
                f12 = 1.0f;
                f19 = 1.0f;
            } else {
                f19 = 1.0f;
                f12 = (float) h1(f20, z16 ? 0.75d : 0.6d, 0.42d);
            }
            f7 = f19;
            f10 = 2.0f;
        } else {
            if (!this.V8) {
                if (f20 >= 0.36f) {
                    this.U8 = null;
                    return;
                }
                float f22 = f20 / 0.36f;
                float f23 = f22;
                int i12 = 0;
                float f24 = 1.0f;
                f7 = 1.0f;
                float f25 = 0.0f;
                while (i12 < 12) {
                    float f26 = (f25 + f24) / f21;
                    float f27 = 1.0f - f26;
                    float f28 = f21;
                    float f29 = f27 * 3.0f;
                    if (c3.i0.u(f26, f26, f26, (f29 * f26 * f26 * 0.9f) + c3.i0.E(f29, f27, f26, 0.5f)) < f22) {
                        f25 = f26;
                    } else {
                        f24 = f26;
                    }
                    i12++;
                    f23 = f26;
                    f21 = f28;
                }
                f10 = f21;
                f11 = 3.0f;
                f12 = 1.0f - (((f23 * f23) * f23) + (((((1.0f - f23) * 3.0f) * f23) * f23) * 0.5f));
                if (!this.N8 || f12 > 0.0f) {
                    invalidate();
                }
                boolean z17 = this.U8.indexOf(10) < 0;
                float L3 = org.telegram.messenger.i0.L(!z17 ? 14.0f : 15.0f);
                TextPaint textPaint = this.C1;
                textPaint.setTextSize(L3);
                float s12 = s1(this.U8);
                if (this.p1 == null) {
                    float L4 = org.telegram.messenger.i0.L(15.0f);
                    TextPaint textPaint2 = this.y2;
                    textPaint2.setTextSize(L4);
                    f13 = textPaint2.measureText(this.p1) + org.telegram.messenger.i0.L(16.0f);
                } else {
                    f13 = 0.0f;
                }
                float min = Math.min(i10 - org.telegram.messenger.i0.L(32.0f), org.telegram.messenger.i0.L(66.0f) + s12 + f13);
                float L5 = org.telegram.messenger.i0.L(!z17 ? 56.0f : 44.0f);
                float L6 = (min - org.telegram.messenger.i0.L(66.0f)) - f13;
                this.s1 = textPaint.getTextSize() * ((s12 > L6 || s12 <= 0.0f) ? f7 : Math.max(0.8f, L6 / s12));
                z10 = f12 >= 0.0f;
                float l4 = !z10 ? Utilities.l(f20 / 0.14f) : 0.0f;
                float max3 = Math.max(f12, 0.0f);
                if (z10) {
                    f14 = 0.8f;
                    f15 = f7;
                    max = (Math.max(0.0f, max3 - f15) + Math.min(f15, max3 / 0.55f)) * L5;
                } else {
                    f14 = 0.8f;
                    max = L5;
                    f15 = f7;
                }
                if (z10) {
                    float f30 = min - max;
                    if (max3 <= f15) {
                        max3 = g1(0.15f, f15, max3);
                    }
                    f16 = (f30 * max3) + max;
                } else {
                    f16 = org.telegram.messenger.i0.T1(min, L5, l4 * l4);
                }
                float f31 = f16;
                float x10 = !z10 ? f1.x(l4, l4, l4, f15) : 1.0f;
                if (max >= 0.5f) {
                    return;
                }
                float f32 = i10 / f10;
                if (this.f1 > 0.001f) {
                    height = a1() - (Utilities.l(this.f1) * b1());
                    L = org.telegram.messenger.i0.L(12.0f);
                } else {
                    height = ((getHeight() - this.u3) - org.telegram.messenger.i0.L(40.0f)) - org.telegram.messenger.i0.L(20.0f);
                    L = org.telegram.messenger.i0.L(14.0f);
                }
                float f33 = this.g9 ? this.f9 : (height - L) - (L5 / f10);
                float f34 = f31 / f10;
                float f35 = max / f10;
                boolean z18 = z10;
                RectF rectF2 = this.L8;
                rectF2.set(f32 - f34, f33 - f35, f34 + f32, f33 + f35);
                float min2 = Math.min(f35, org.telegram.messenger.i0.L(24.0f));
                Path path = this.E1;
                path.rewind();
                path.addRoundRect(rectF2, min2, min2, Path.Direction.CW);
                this.T8 = 352321535;
                this.A6 = true;
                J(canvas, rectF2, min2, x10);
                this.T8 = 0;
                this.A6 = false;
                float g12 = z18 ? 1.0f : g1(0.2f, 0.95f, f12);
                float l10 = z18 ? 1.0f - Utilities.l(f20 / 0.05f) : g1(0.08f, 0.5f, f12);
                if (l10 <= 0.004f) {
                    return;
                }
                boolean z19 = this.N8;
                float f36 = z19 ? (currentAnimationTimeMillis - this.X8) / 1000.0f : -1.0f;
                float l11 = z19 ? Utilities.l((f20 - 0.15f) / 0.23f) : 1.0f;
                float D = c3.i0.D(l11, f10, f11, l10 * l11 * l11);
                if (this.N8 && l11 < 1.0f) {
                    invalidate();
                }
                int i13 = this.W8;
                if (i13 == R.drawable.msg_recent || (i13 == R.drawable.msg_retry && s0(this.U8))) {
                    rectF = rectF2;
                    z11 = true;
                } else {
                    rectF = rectF2;
                    z11 = false;
                }
                if (this.N8) {
                    f17 = 1.0f;
                    max2 = c3.i0.z(1.0f, g12, 0.35f, 1.0f);
                } else {
                    f17 = 1.0f;
                    max2 = Math.max(0.05f, Math.min(1.0f, f31 / min));
                }
                canvas.save();
                canvas.clipPath(path);
                canvas.scale(max2, max2, f32, f33);
                if (i() && ((this.S4 || this.Z1) && canvas.isHardwareAccelerated())) {
                    if (this.b9 == null) {
                        this.b9 = android.support.v4.media.session.w.d("toastContent");
                    }
                    if ((this.W8 != 0 || (bi0Var2 = this.Y8) == null || bi0Var2.a0 >= bi0Var2.e[0] - 1) && (!n() || (bi0Var = this.Z8) == null || bi0Var.a0 >= bi0Var.e[0] - 1)) {
                        bi0 bi0Var3 = this.a9;
                        if (bi0Var3 == null || this.W8 != R.drawable.msg_download) {
                            z12 = false;
                            z13 = true;
                        } else {
                            z12 = false;
                            z13 = true;
                        }
                        z14 = z12;
                        if ((z11 && f36 >= 0.0f && f36 < f14) || z14) {
                            z12 = z13;
                        }
                        if (z14) {
                            invalidate();
                        }
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(this.U8);
                        sb3.append(this.W8);
                        int i14 = (int) min;
                        sb3.append(i14);
                        sb3.append((int) this.s1);
                        sb2 = sb3.toString();
                        if (z12 && sb2.equals(this.d9) && u.e(this.b9)) {
                            f18 = f33;
                        } else {
                            this.d9 = sb2;
                            f18 = f33;
                            Q(0.0f, L5 / 2.0f, f36, u.a(i14, (int) L5, this.b9), z11);
                            u.d(this.b9);
                        }
                        L2 = (f17 - g12) * org.telegram.messenger.i0.L(5.0f);
                        if (Math.abs(L2 - this.c9) > 0.25f) {
                            this.c9 = L2;
                            Object obj = this.b9;
                            if (L2 <= 0.3f) {
                                L2 = 0.0f;
                            }
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            u.j(obj, L2);
                        }
                        u.h(this.b9, l10);
                        float f37 = L5 / 2.0f;
                        canvas.translate(f32 - (min / 2.0f), f18 - f37);
                        u.c(canvas, this.b9);
                        P(canvas, 0.0f, f37, min, D);
                    } else {
                        z12 = false;
                        z13 = true;
                    }
                    z14 = z13;
                    if (z11) {
                        z12 = z13;
                        if (z14) {
                        }
                        StringBuilder sb32 = new StringBuilder();
                        sb32.append(this.U8);
                        sb32.append(this.W8);
                        int i142 = (int) min;
                        sb32.append(i142);
                        sb32.append((int) this.s1);
                        sb2 = sb32.toString();
                        if (z12) {
                        }
                        this.d9 = sb2;
                        f18 = f33;
                        Q(0.0f, L5 / 2.0f, f36, u.a(i142, (int) L5, this.b9), z11);
                        u.d(this.b9);
                        L2 = (f17 - g12) * org.telegram.messenger.i0.L(5.0f);
                        if (Math.abs(L2 - this.c9) > 0.25f) {
                        }
                        u.h(this.b9, l10);
                        float f372 = L5 / 2.0f;
                        canvas.translate(f32 - (min / 2.0f), f18 - f372);
                        u.c(canvas, this.b9);
                        P(canvas, 0.0f, f372, min, D);
                    }
                    z12 = z13;
                    if (z14) {
                    }
                    StringBuilder sb322 = new StringBuilder();
                    sb322.append(this.U8);
                    sb322.append(this.W8);
                    int i1422 = (int) min;
                    sb322.append(i1422);
                    sb322.append((int) this.s1);
                    sb2 = sb322.toString();
                    if (z12) {
                    }
                    this.d9 = sb2;
                    f18 = f33;
                    Q(0.0f, L5 / 2.0f, f36, u.a(i1422, (int) L5, this.b9), z11);
                    u.d(this.b9);
                    L2 = (f17 - g12) * org.telegram.messenger.i0.L(5.0f);
                    if (Math.abs(L2 - this.c9) > 0.25f) {
                    }
                    u.h(this.b9, l10);
                    float f3722 = L5 / 2.0f;
                    canvas.translate(f32 - (min / 2.0f), f18 - f3722);
                    u.c(canvas, this.b9);
                    P(canvas, 0.0f, f3722, min, D);
                } else {
                    float f38 = f33;
                    canvas.saveLayerAlpha(rectF, (int) (l10 * 255.0f));
                    float f39 = f32 - (min / 2.0f);
                    Q(f39, f38, f36, canvas, z11);
                    canvas.restore();
                    P(canvas, f39, f38, min, D);
                }
                canvas.restore();
                return;
            }
            if (f20 >= 0.14f) {
                this.U8 = null;
                this.V8 = false;
                return;
            } else {
                f7 = 1.0f;
                f10 = 2.0f;
                f12 = -1.0f;
            }
        }
        f11 = 3.0f;
        if (!this.N8) {
        }
        invalidate();
        if (this.U8.indexOf(10) < 0) {
        }
        float L32 = org.telegram.messenger.i0.L(!z17 ? 14.0f : 15.0f);
        TextPaint textPaint3 = this.C1;
        textPaint3.setTextSize(L32);
        float s122 = s1(this.U8);
        if (this.p1 == null) {
        }
        float min3 = Math.min(i10 - org.telegram.messenger.i0.L(32.0f), org.telegram.messenger.i0.L(66.0f) + s122 + f13);
        float L52 = org.telegram.messenger.i0.L(!z17 ? 56.0f : 44.0f);
        float L62 = (min3 - org.telegram.messenger.i0.L(66.0f)) - f13;
        this.s1 = textPaint3.getTextSize() * ((s122 > L62 || s122 <= 0.0f) ? f7 : Math.max(0.8f, L62 / s122));
        if (f12 >= 0.0f) {
        }
        if (!z10) {
        }
        float max32 = Math.max(f12, 0.0f);
        if (z10) {
        }
        if (z10) {
        }
        float f312 = f16;
        if (!z10) {
        }
        if (max >= 0.5f) {
        }
    }

    public final void R0() {
        float f7 = this.e0;
        if (f7 == 0.0f && this.f0 == 0.0f) {
            return;
        }
        this.i0 = f7;
        this.j0 = this.f0;
        this.W = AnimationUtils.currentAnimationTimeMillis();
        this.U = true;
    }

    public final void S0() {
        int i10 = this.V7;
        if (i10 < 0 || this.X7 >= this.W7) {
            return;
        }
        this.Y7 = k1(i10);
        this.X7 = AnimationUtils.currentAnimationTimeMillis();
        invalidate();
    }

    public final float T(float f7) {
        if (this.Q4 >= 1.0f) {
            return 1.0f;
        }
        return org.telegram.messenger.i0.T1(this.T4 ? 0.85f : 0.92f, 1.0f, f7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:
    
        if (r11 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap T0() {
        RLottieNative rLottieNative;
        int width = getWidth();
        int height = getHeight();
        if (width > 0 && height > 0) {
            float f7 = this.f1;
            this.f1 = 0.0f;
            int min = Math.min(height, (int) (width * 1.92f));
            int max = (int) Math.max(0.0f, Math.min(height - min, ((l() / 2.0f) + m()) - (min / 2.0f)));
            try {
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                Bitmap createBitmap = Bitmap.createBitmap(width, min, config);
                if (this.R2 == null) {
                    bi0 bi0Var = this.X1;
                    if (bi0Var.b > 0) {
                        try {
                            rLottieNative = RLottieNative.b(org.telegram.messenger.i0.y2(null, R.raw.plane_logo_plain), null, null, null);
                            if (rLottieNative != null) {
                                try {
                                    Bitmap createBitmap2 = Bitmap.createBitmap(bi0Var.b, bi0Var.c, config);
                                    rLottieNative.c(Math.min(33, rLottieNative.a[0] - 1), createBitmap2, true);
                                    this.R2 = createBitmap2;
                                } catch (Throwable th2) {
                                    th = th2;
                                    try {
                                        f8.g(th, true);
                                    } finally {
                                        if (rLottieNative != null) {
                                            rLottieNative.d();
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            rLottieNative = null;
                        }
                    }
                }
                Canvas canvas = new Canvas(createBitmap);
                canvas.translate(0.0f, -max);
                System.currentTimeMillis();
                z(canvas, width, height);
                this.T2 = true;
                A(canvas, width);
                this.T2 = false;
                canvas.setBitmap(null);
                this.f1 = f7;
                return createBitmap;
            } catch (OutOfMemoryError unused) {
                this.f1 = f7;
            }
        }
        return null;
    }

    public final Drawable U(String str) {
        HashMap hashMap = this.J;
        Drawable drawable = (Drawable) hashMap.get(str);
        if (drawable == null) {
            drawable = k6.g(str);
            if (drawable == null) {
                drawable = k6.g(str.replace("️", ""));
            }
            if (drawable != null) {
                hashMap.put(str, drawable);
            }
        }
        return drawable;
    }

    public final void U0(String str) {
        if (this.v0) {
            this.t2 = this.L0.c() + org.telegram.messenger.i0.L(2.0f) + org.telegram.messenger.i0.L(12.0f) + org.telegram.messenger.i0.L(8.0f) + org.telegram.messenger.i0.L(11.0f);
            this.v0 = false;
            this.A0 = false;
            this.s2 = this.B0 * this.G0 > 0.001f;
            this.q2 = AnimationUtils.currentAnimationTimeMillis();
            this.C0 = this.B0;
            this.D0 = 0.0f;
            this.E0 = System.currentTimeMillis();
            f fVar = this.t0;
            if (fVar != null) {
                j1(fVar);
            }
            u1(true);
            if (str != null) {
                d1(0, str, null);
            }
            i0();
            this.e = null;
            this.u0 = null;
            l2.f fVar2 = this.c;
            if (fVar2 != null) {
                fVar2.B(0);
            }
        }
    }

    public final Bitmap V(f5 f5Var) {
        Bitmap n10;
        ag.c2 c2Var = f5Var.k;
        if (c2Var != null) {
            bi0 B = c2Var.B();
            if (B != null) {
                if (!this.T2) {
                    B.V(0L);
                }
                if (B.u()) {
                    if (B.Q != null) {
                        return B.Q;
                    }
                    if (B.R != null) {
                        return B.R;
                    }
                    return null;
                }
            } else {
                s5 m10 = c2Var.m();
                if (m10 != null) {
                    if (!this.T2) {
                        m10.D(System.currentTimeMillis());
                    }
                    if (m10.s()) {
                        return m10.m();
                    }
                } else if (c2Var.J() && c2Var.L() && (n10 = c2Var.n()) != null && !n10.isRecycled()) {
                    return n10;
                }
            }
        }
        return null;
    }

    public final float V0() {
        if (this.g1 < 0.5f) {
            return 1.0f;
        }
        return Utilities.l((AnimationUtils.currentAnimationTimeMillis() - this.I2) / 420.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0077 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u0 W() {
        long j10;
        u0 u0Var = new u0();
        ArrayList arrayList = this.I;
        if (!arrayList.isEmpty()) {
            u0Var.a = 1;
            u0Var.b = new Drawable[arrayList.size()];
            u0Var.w = new long[arrayList.size()];
            u0Var.x = new boolean[arrayList.size()];
            long[] jArr = new long[arrayList.size()];
            u0Var.y = jArr;
            if (this.S4) {
                Arrays.fill(jArr, 1L);
            }
            for (int i10 = 0; i10 < u0Var.b.length; i10++) {
                String str = (String) arrayList.get(i10);
                u0Var.b[i10] = U(str);
                if (str.startsWith("c:")) {
                    try {
                        j10 = Long.parseLong(str.substring(2));
                    } catch (NumberFormatException unused) {
                    }
                    long[] jArr2 = u0Var.w;
                    if (j10 > 0) {
                        j10 = (-1) - (str.hashCode() & 4294967295L);
                    }
                    jArr2[i10] = j10;
                    u0Var.x[i10] = r.d(u0Var.b[i10]);
                }
                j10 = 0;
                long[] jArr22 = u0Var.w;
                if (j10 > 0) {
                }
                jArr22[i10] = j10;
                u0Var.x[i10] = r.d(u0Var.b[i10]);
            }
        }
        return u0Var;
    }

    public final void X(u0 u0Var) {
        TLRPC.Document document;
        if (u0Var == null || u0Var.G || u0Var.a != 2 || u0Var.F != null || (document = u0Var.A) == null) {
            return;
        }
        u0Var.F = new s(this.b, document, u0Var.B, org.telegram.messenger.i0.L(48.0f), new f11(25, this, u0Var));
    }

    public final float X0(int i10, long j10) {
        return 1.0f - ((1.0f - this.z9[i10]) * ((float) Math.exp((-(j10 - this.w9[i10])) / 90.0f)));
    }

    public final boolean Y(Bitmap bitmap) {
        float[] fArr = y0.b;
        float f7 = fArr[36];
        float f10 = fArr[38];
        float f11 = fArr[24];
        if (this.S3 != null && this.T3 == bitmap && f7 == this.U3 && f10 == this.V3 && f11 == this.W3) {
            return true;
        }
        if (bitmap == null || bitmap.isRecycled()) {
            return false;
        }
        this.T3 = bitmap;
        this.U3 = f7;
        this.V3 = f10;
        this.W3 = f11;
        Bitmap bitmap2 = this.S3;
        if (bitmap2 == null || bitmap2.getWidth() != bitmap.getWidth() || this.S3.getHeight() != bitmap.getHeight()) {
            this.S3 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        }
        this.S3.eraseColor(0);
        Canvas canvas = new Canvas(this.S3);
        double radians = Math.toRadians(f11);
        float f12 = (float) (-Math.cos(radians));
        float f13 = (float) (-Math.sin(radians));
        float N = org.telegram.messenger.i0.N(f7);
        float N2 = org.telegram.messenger.i0.N(f10);
        float f14 = f12 * N2;
        float f15 = N2 * f13;
        canvas.drawBitmap(bitmap, f14, f15, (Paint) null);
        canvas.drawBitmap(bitmap, f14 - (f12 * N), f15 - (f13 * N), this.X3);
        return true;
    }

    public final void Y0(v0 v0Var, float f7, float f10) {
        if (v0Var != null) {
            this.b7 = W0(v0Var.c);
        }
        if (this.f2) {
            if (this.r != null) {
                this.r = null;
            }
            this.n = v0Var;
            this.s = 1.0f;
            invalidate();
            return;
        }
        this.r = this.n;
        this.n = v0Var;
        this.s = 0.0f;
        this.w = System.currentTimeMillis();
        this.x = f7;
        this.y = f10;
        this.q0++;
        i0();
        invalidate();
    }

    public final void Z(u0 u0Var) {
        f5 f5Var;
        ag.c2 c2Var;
        if (u0Var == null || u0Var.e != null || (f5Var = u0Var.c) == null) {
            return;
        }
        s sVar = u0Var.F;
        if ((sVar == null || sVar.h) && (c2Var = f5Var.k) != null && c2Var.J() && c2Var.L()) {
            int L = org.telegram.messenger.i0.L(48.0f);
            Bitmap createBitmap = Bitmap.createBitmap(L, L, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            u0Var.c.setBounds(0, 0, L, L);
            u0Var.c.setColorFilter(null);
            u0Var.c.setAlpha(zs.e4);
            c2Var.h1 = 1.0f;
            u0Var.c.draw(canvas);
            E0(u0Var, createBitmap);
        }
    }

    public final String a0() {
        String L0 = cd.L0(2131746494, null);
        if (!L0.equals(this.u2)) {
            this.u2 = L0;
            Matcher matcher = Pattern.compile("\\d+").matcher(L0);
            if (matcher.find()) {
                this.v2 = L0.substring(0, matcher.start());
                this.w2 = matcher.group();
                this.x2 = L0.substring(matcher.end());
            } else {
                this.v2 = L0;
                this.x2 = "";
                this.w2 = "";
            }
        }
        return this.u2;
    }

    public final float a1() {
        return (getHeight() - this.u3) - org.telegram.messenger.i0.L(10.0f);
    }

    public final float b(double d) {
        float f7 = this.A4;
        double sin = Math.sin((f7 * 78.233d) + (((f7 * 17.31d) + d) * 12.9898d)) * 43758.5453d;
        return ((float) (sin - Math.floor(sin))) * 300.0f;
    }

    public final float b1() {
        float max = Math.max(org.telegram.messenger.i0.L(160.0f), a1() - ((((l() + (org.telegram.messenger.i0.L(51.0f) + this.t3)) + org.telegram.messenger.i0.L(24.0f)) + org.telegram.messenger.i0.L(11.0f)) + org.telegram.messenger.i0.L(13.0f)));
        if (this.h1 == 2 && this.x1) {
            ArrayList arrayList = this.v1;
            if (arrayList.size() <= 3) {
                max = Math.min(max, arrayList.isEmpty() ? org.telegram.messenger.i0.L(286.0f) : org.telegram.messenger.i0.L(8.0f) + ((z20.A(10.0f, 2, getWidth()) - org.telegram.messenger.i0.L(8.0f)) / 3.0f));
            }
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        float f7 = this.P2;
        if (f7 < 0.0f || this.f1 < 0.01f) {
            this.P2 = max;
        } else if (f7 != max) {
            long min = Math.min(64L, Math.max(0L, currentAnimationTimeMillis - this.Q2));
            float f10 = this.P2;
            float z10 = c3.i0.z(1.0f, (float) Math.exp((-min) / 140.0f), max - f10, f10);
            this.P2 = z10;
            if (Math.abs(max - z10) < 0.5f) {
                this.P2 = max;
            } else {
                invalidate();
            }
        }
        this.Q2 = currentAnimationTimeMillis;
        return this.P2;
    }

    public final void c() {
        v0 v0Var;
        Runnable runnable = this.d2;
        if (runnable != null) {
            runnable.run();
        }
        if (!this.e2 && !this.I.isEmpty() && (v0Var = this.n) != null && (v0Var.a != 0 || this.F.a == 2)) {
            this.T7 = AnimationUtils.currentAnimationTimeMillis();
            this.Q7 = -1;
            this.O7 = 0.0f;
            setSceneFromCard(t(this.M7));
        }
        setPattern(W());
        if (!this.f2) {
            this.r0 = AnimationUtils.currentAnimationTimeMillis();
        }
        B0();
    }

    public final float c1(float f7, float f10, int i10, int i11) {
        float f11;
        float f12;
        float f13;
        float f14;
        int i12;
        float f15;
        if (!this.y3) {
            return 0.0f;
        }
        float f16 = i10;
        float f17 = f7 - (f16 / 2.0f);
        float f18 = this.H3;
        float f19 = i11;
        float f20 = f10 - (f19 / 2.0f);
        float f21 = (this.I3 * f20) + (f17 * f18);
        float abs = ((Math.abs(this.I3) * f19) + (Math.abs(f18) * f16)) / 2.0f;
        float f22 = 1.0f;
        float max = Math.max(1.0f, abs);
        float[] fArr = y0.b;
        float f23 = fArr[19] / 100.0f;
        if (f23 > 0.0f) {
            float f24 = this.I3;
            float max2 = ((f20 * this.H3) + (f17 * (-f24))) / Math.max(1.0f, ((Math.abs(this.H3) * f19) + (Math.abs(f24) * f16)) / 2.0f);
            f21 -= ((f23 * f16) * max2) * max2;
        }
        float f25 = (f21 - this.w3) / this.x3;
        float f26 = fArr[20] / 100.0f;
        if (f26 > 0.0f) {
            f25 += (((((float) Math.asin(Math.max(-1.0f, Math.min(1.0f, f21 / max)))) - Math.max(-2.1991148f, Math.min(2.1991148f, (this.w3 / max) * 1.5707964f))) / ((this.x3 / max) * 1.5707964f)) - f25) * f26;
            f11 = sc.e.z(1.0f, (float) Math.cos(Math.max(-1.5707964f, Math.min(1.5707964f, r4))), (f26 * fArr[31]) / 100.0f, 1.0f);
        } else {
            f11 = 1.0f;
        }
        this.o4 = f25;
        float f27 = this.E3;
        this.p4 = f27 * f11;
        float f28 = fArr[34] / 100.0f;
        int i13 = (f25 > 4.0f ? 1 : (f25 == 4.0f ? 0 : -1));
        if ((i13 > 0 || f25 < -4.0f) && f28 <= 0.0f) {
            this.m4 = 0.0f;
            return 0.0f;
        }
        float f29 = fArr[32];
        float f30 = f25 / fArr[29];
        u0 u0Var = this.F;
        if (u0Var != null && u0Var.a == 1) {
            f22 = 0.7f;
        }
        float f31 = f11 * f22;
        if (f30 > 4.0f || f30 < -4.0f) {
            f12 = 0.0f;
            f13 = f31;
            f14 = 4.0f;
            i12 = i13;
            f15 = 0.0f;
        } else {
            float abs2 = Math.abs(f30);
            f12 = 0.0f;
            f13 = f31;
            f14 = 4.0f;
            i12 = i13;
            f15 = f27 * f31 * ((float) Math.exp(Math.pow(abs2, f29) * (-0.5d)));
        }
        this.m4 = f15;
        float exp = (fArr[28] / 100.0f) * ((i12 > 0 || f25 < -4.0f) ? f12 : (float) Math.exp(Math.pow(Math.abs(f25), f29) * (-0.5d)));
        if (f28 > f12) {
            float f32 = f25 - fArr[33];
            if (f32 < f14 && f32 > -4.0f) {
                exp += f28 * ((float) Math.exp(Math.pow(Math.abs(f32), f29) * (-0.5d)));
            }
        }
        return this.E3 * f13 * exp;
    }

    public final void d(int i10) {
        this.e2 = true;
        boolean z10 = this.F.a != 0;
        this.I.clear();
        this.O7 = 0.0f;
        this.M7 = i10;
        v0 v0Var = this.n;
        if (v0Var == null || v0Var.a != 0 || v0Var.f != i10) {
            setSceneFromCard(t(i10));
        }
        if (z10) {
            setPattern(new u0());
        }
        Runnable runnable = this.d2;
        if (runnable != null) {
            runnable.run();
        }
        this.e2 = false;
    }

    public final void d1(int i10, String str, String str2) {
        long currentTimeMillis = 0 - System.currentTimeMillis();
        if (currentTimeMillis > 0) {
            postDelayed(new c11(this, i10, str, str2, 16), currentTimeMillis);
            return;
        }
        this.n1 = i10;
        this.m1 = str;
        this.o1 = str2;
        this.u1 = System.currentTimeMillis() + (str2 != null ? 4000 : 2800);
        invalidate();
    }

    public final void e(int i10, ArrayList arrayList, boolean z10) {
        int i11 = -1;
        if (z10 && a.h != null) {
            int i12 = 0;
            while (true) {
                int[] iArr = a.h;
                if (i12 >= iArr.length) {
                    break;
                }
                if (iArr[i12] == i10) {
                    i11 = i12;
                    break;
                }
                i12++;
            }
        }
        if (i11 < 0) {
            i11 = G9;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            d(i11);
            return;
        }
        this.e2 = true;
        this.M7 = i11;
        v0 v0Var = this.n;
        if (v0Var == null || v0Var.a != 0 || v0Var.f != i11) {
            setSceneFromCard(t(i11));
        }
        this.O7 = 0.0f;
        ArrayList arrayList2 = this.I;
        arrayList2.clear();
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            TLRPC.Reaction reaction = (TLRPC.Reaction) obj;
            if (arrayList2.size() >= 6) {
                break;
            }
            if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                long j10 = ((TLRPC.TL_reactionCustomEmoji) reaction).document_id;
                String l4 = a1.g.l(j10, "c:");
                HashMap hashMap = this.J;
                if (!hashMap.containsKey(l4)) {
                    f5 m10 = f5.m(this.b, j10, null, 2);
                    m10.a(this);
                    hashMap.put(l4, m10);
                }
                if (!arrayList2.contains(l4)) {
                    arrayList2.add(l4);
                }
            } else if (reaction instanceof TLRPC.TL_reactionEmoji) {
                TLRPC.TL_reactionEmoji tL_reactionEmoji = (TLRPC.TL_reactionEmoji) reaction;
                if (!TextUtils.isEmpty(tL_reactionEmoji.emoticon)) {
                    String str = tL_reactionEmoji.emoticon;
                    String replace = (str == null || str.startsWith("c:")) ? str : str.replace("️", "");
                    this.c2.put(replace, str);
                    if (!arrayList2.contains(replace)) {
                        arrayList2.add(replace);
                    }
                }
            }
        }
        c();
        this.e2 = false;
    }

    public final void e0(int[] iArr, int i10) {
        iArr[0] = -7829368;
        iArr[1] = -11184811;
        iArr[2] = -13421773;
        ArrayList<TL_stars.StarGiftAttribute> arrayList = ((TL_stars.TL_starGiftUnique) this.v1.get(i10)).attributes;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i11);
            i11++;
            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributeBackdrop) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) starGiftAttribute2;
                iArr[0] = stargiftattributebackdrop.center_color | (-16777216);
                iArr[1] = stargiftattributebackdrop.edge_color | (-16777216);
                iArr[2] = stargiftattributebackdrop.pattern_color | (-16777216);
            }
        }
    }

    public final float f(float f7, float f10, float f11) {
        float z10 = c3.i0.z(f10, f7, 1.0f - ((float) Math.pow(1.0f - f11, this.X2)), f7);
        return Math.abs(f10 - z10) < 0.002f ? f10 : z10;
    }

    public final int f0() {
        int size = this.v1.size();
        if (!this.x1 || size <= 0 || size >= 3) {
            return 3;
        }
        return size;
    }

    public final f5 g0(long j10, TLRPC.Document document) {
        Long valueOf = Long.valueOf(j10);
        HashMap hashMap = this.J7;
        f5 f5Var = (f5) hashMap.get(valueOf);
        if (f5Var != null) {
            return f5Var;
        }
        f5 l4 = f5.l(this.b, 24, document);
        l4.a(this);
        hashMap.put(Long.valueOf(j10), l4);
        return l4;
    }

    public String getCurrentLink() {
        String str;
        if (this.v0 && (str = this.e) != null && this.u0 != null) {
            return str;
        }
        if (this.t0 != null) {
            return this.d;
        }
        return null;
    }

    public ArrayList<TLRPC.Reaction> getPickedEmoji() {
        ArrayList<TLRPC.Reaction> arrayList = new ArrayList<>();
        ArrayList arrayList2 = this.I;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            String str = (String) obj;
            if (str.startsWith("c:")) {
                try {
                    TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
                    tL_reactionCustomEmoji.document_id = Long.parseLong(str.substring(2));
                    arrayList.add(tL_reactionCustomEmoji);
                } catch (NumberFormatException unused) {
                }
            } else {
                TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
                String str2 = (String) this.c2.get(str);
                if (str2 != null) {
                    str = str2;
                }
                tL_reactionEmoji.emoticon = str;
                arrayList.add(tL_reactionEmoji);
            }
        }
        return arrayList;
    }

    public int getThemeBackdropIndex() {
        v0 v0Var = this.n;
        if (v0Var == null || v0Var.a != 0) {
            return -1;
        }
        return v0Var.f;
    }

    public TL_stars.TL_starGiftUnique getThemeGift() {
        int i10;
        u0 u0Var = this.F;
        if (u0Var.a != 2 || (i10 = u0Var.q) < 0) {
            return null;
        }
        ArrayList arrayList = this.v1;
        if (i10 < arrayList.size()) {
            return (TL_stars.TL_starGiftUnique) arrayList.get(this.F.q);
        }
        return null;
    }

    public long getThemeGiftSavedId() {
        Long l4;
        TL_stars.TL_starGiftUnique themeGift = getThemeGift();
        if (themeGift != null) {
            l4 = (Long) this.y1.get(Long.valueOf(themeGift.id));
        } else {
            l4 = null;
        }
        if (l4 != null) {
            return l4.longValue();
        }
        return 0L;
    }

    public final boolean h0() {
        return this.x1 && this.v1.isEmpty();
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i0() {
        try {
            performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public final boolean j0(Canvas canvas) {
        if (i()) {
            return (this.S4 || this.Z1) && canvas.isHardwareAccelerated() && u.e(this.H1);
        }
        return false;
    }

    public final void j1(f fVar) {
        g gVar = this.s0;
        if (gVar.q != 2 || gVar.o >= 1.0f) {
            postDelayed(new v1(21, this, fVar), 40L);
        } else {
            gVar.m = fVar;
            invalidate();
        }
    }

    public final float k1(int i10) {
        if (i10 != this.V7) {
            return 1.0f;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (this.X7 < this.W7) {
            float l4 = 1.0f - Utilities.l((currentAnimationTimeMillis - r6) / 110.0f);
            return 1.0f - ((1.0f - (l4 * l4)) * 0.08f);
        }
        double h12 = h1((currentAnimationTimeMillis - r4) / 1000.0f, 0.6d, 0.28d);
        if (currentAnimationTimeMillis - this.X7 > 900) {
            this.V7 = -1;
            return 1.0f;
        }
        float f7 = this.Y7;
        return ((1.0f - f7) * ((float) h12)) + f7;
    }

    public final float l() {
        return org.telegram.messenger.i0.T1(1.07f, 1.0f, this.C2) * getWidth() * 0.745f;
    }

    public final void l0() {
        if (this.U8 == null) {
            this.u1 = 0L;
            return;
        }
        this.u1 = 0L;
        if (this.N8) {
            this.N8 = false;
            this.M8 = AnimationUtils.currentAnimationTimeMillis();
        }
        this.V8 = true;
        invalidate();
    }

    public final float m() {
        float max = ((1.0f - Math.max(this.J2, this.C2)) * org.telegram.messenger.i0.L(16.0f)) + (((getHeight() * 0.468f) - (l() / 2.0f)) - org.telegram.messenger.i0.L(15.0f));
        return org.telegram.messenger.i0.T1(max, Math.max(org.telegram.messenger.i0.L(51.0f) + this.t3, Math.min(max, (((a1() - b1()) - org.telegram.messenger.i0.L(13.0f)) - (org.telegram.messenger.i0.L(35.0f) * Math.max(this.J2, this.C2))) - l())), this.f1);
    }

    public final w0 m1(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        Long valueOf = Long.valueOf(tL_starGiftUnique.id);
        HashMap hashMap = this.K7;
        w0 w0Var = (w0) hashMap.get(valueOf);
        if (w0Var == null) {
            w0Var = new w0();
            ArrayList<TL_stars.StarGiftAttribute> arrayList = tL_starGiftUnique.attributes;
            int size = arrayList.size();
            TLRPC.Document document = null;
            int i10 = 0;
            while (i10 < size) {
                TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i10);
                i10++;
                TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                if (starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) {
                    document = ((TL_stars.starGiftAttributePattern) starGiftAttribute2).document;
                }
            }
            if (document != null) {
                d5 d5Var = new d5(org.telegram.messenger.i0.L(28.0f), this);
                w0Var.a = d5Var;
                d5Var.i(document, false);
                w0Var.a.a();
                w0Var.b = document.id;
            }
            hashMap.put(Long.valueOf(tL_starGiftUnique.id), w0Var);
        }
        return w0Var;
    }

    public final boolean n() {
        String str;
        return (this.W8 != R.drawable.msg_retry || (str = this.U8) == null || s0(str)) ? false : true;
    }

    public final boolean n0(float f7, float f10) {
        if (this.p1 == null || !this.N8) {
            return false;
        }
        RectF rectF = this.L8;
        if (rectF.isEmpty()) {
            return false;
        }
        float f11 = rectF.right;
        float L = org.telegram.messenger.i0.L(15.0f);
        TextPaint textPaint = this.y2;
        textPaint.setTextSize(L);
        float measureText = (f11 - textPaint.measureText(this.p1)) - org.telegram.messenger.i0.L(28.0f);
        float L2 = rectF.top - org.telegram.messenger.i0.L(6.0f);
        float L3 = rectF.right + org.telegram.messenger.i0.L(6.0f);
        float L4 = rectF.bottom + org.telegram.messenger.i0.L(6.0f);
        RectF rectF2 = this.q1;
        rectF2.set(measureText, L2, L3, L4);
        return rectF2.contains(f7, f10);
    }

    public final PorterDuffColorFilter n1(int i10) {
        SparseArray sparseArray = this.e7;
        PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) sparseArray.get(i10);
        if (porterDuffColorFilter != null) {
            return porterDuffColorFilter;
        }
        if (sparseArray.size() > 96) {
            sparseArray.clear();
        }
        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        sparseArray.put(i10, porterDuffColorFilter2);
        return porterDuffColorFilter2;
    }

    public final float o() {
        return l() + m() + org.telegram.messenger.i0.L(24.0f);
    }

    public final void o0(Canvas canvas, Drawable drawable, float f7, float f10, float f11, float f12) {
        drawable.setColorFilter(n1(-1));
        drawable.setAlpha((int) (f12 * 255.0f));
        float f13 = f11 / 2.0f;
        drawable.setBounds((int) (f7 - f13), (int) (f10 - f13), (int) (f7 + f13), (int) (f10 + f13));
        drawable.draw(canvas);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        K0();
        int i10 = this.y6;
        SparseIntArray sparseIntArray = this.x6;
        if (i10 != 1) {
            sparseIntArray.clear();
            this.y6 = 1;
        }
        int i11 = 0;
        while (true) {
            int[] iArr = a.b;
            if (i11 >= iArr.length) {
                break;
            }
            v0 v0Var = new v0();
            int i12 = iArr[i11] | (-16777216);
            v0Var.b = i12;
            v0Var.c = (-16777216) | a.c[i11];
            v0Var.h = Z0(i12);
            if (sparseIntArray.indexOfKey(v0Var.b) < 0) {
                sparseIntArray.put(v0Var.b, u(v0Var));
            }
            i11++;
        }
        zs.f(this.b).c(this.j2, zs.G3);
        y0();
        SensorManager sensorManager = (SensorManager) getContext().getSystemService("sensor");
        this.N6 = sensorManager;
        Sensor defaultSensor = sensorManager != null ? sensorManager.getDefaultSensor(9) : null;
        if (defaultSensor != null) {
            this.N6.registerListener(this.O6, defaultSensor, 1);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zs.f(this.b).n(this.j2, zs.G3);
        removeCallbacks(this.k2);
        SensorManager sensorManager = this.N6;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.O6);
        }
        this.L6 = false;
        this.r9 = -1;
        Arrays.fill(this.x9, 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0954  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0a52  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0a6a  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0abc  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0bd6  */
    /* JADX WARN: Removed duplicated region for block: B:304:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0ab3  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x095b  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x09ae  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0a02  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0a22  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x09b5  */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r29v1 */
    /* JADX WARN: Type inference failed for: r29v2 */
    /* JADX WARN: Type inference failed for: r3v65, types: [android.graphics.RectF, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v70, types: [android.graphics.RectF] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10;
        long j10;
        float f11;
        float f12;
        boolean z10;
        int i10;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        int i11;
        int i12;
        float f23;
        float f24;
        float T1;
        float f25;
        float T12;
        x0 x0Var;
        float sin;
        float f26;
        boolean z11;
        int i13;
        long j11;
        RectF rectF;
        float f27;
        float h12;
        x0 x0Var2 = this;
        x0Var2.H2 = true;
        float f28 = x0Var2.B2 ? 1.0f : 0.0f;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        float f29 = x0Var2.E2;
        if (f28 != f29) {
            if (f28 == 1.0f && f29 == 0.0f && x0Var2.C2 <= 0.001f) {
                x0Var2.n5 = true;
                x0Var2.m5 = null;
            } else if (f28 == 0.0f && x0Var2.C2 >= 0.999f) {
                x0Var2.n5 = false;
            }
            x0Var2.E2 = f28;
            x0Var2.D2 = x0Var2.C2;
            x0Var2.F2 = currentAnimationTimeMillis;
        }
        if (x0Var2.C2 != f28) {
            f7 = 0.0f;
            float l4 = Utilities.l((currentAnimationTimeMillis - x0Var2.F2) / 300.0f);
            float E = l4 < 0.5f ? c3.i0.E(l4, 4.0f, l4, l4) : 1.0f - (((float) Math.pow((l4 * (-2.0f)) + 2.0f, 3.0d)) / 2.0f);
            if (l4 < 1.0f) {
                f28 = org.telegram.messenger.i0.T1(x0Var2.D2, f28, E);
            }
            x0Var2.C2 = f28;
            if (f28 <= 0.0f) {
                x0Var2.n5 = false;
            }
            x0Var2.invalidate();
        } else {
            f7 = 0.0f;
        }
        float f30 = x0Var2.K0 ? 1.0f : f7;
        long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
        float f31 = x0Var2.L2;
        if (f31 < f7) {
            x0Var2.L2 = f30;
            x0Var2.J2 = f30;
        } else {
            if (f30 != f31) {
                x0Var2.L2 = f30;
                x0Var2.K2 = x0Var2.J2;
                x0Var2.M2 = currentAnimationTimeMillis2;
            }
            if (x0Var2.J2 != f30) {
                float l10 = Utilities.l((currentAnimationTimeMillis2 - x0Var2.M2) / 320.0f);
                float E2 = l10 < 0.5f ? c3.i0.E(l10, 4.0f, l10, l10) : 1.0f - (((float) Math.pow((l10 * (-2.0f)) + 2.0f, 3.0d)) / 2.0f);
                if (l10 < 1.0f) {
                    f30 = org.telegram.messenger.i0.T1(x0Var2.K2, f30, E2);
                }
                x0Var2.J2 = f30;
                x0Var2.invalidate();
            }
        }
        x0Var2.V2 = !x0Var2.S4 && x0Var2.U2 == 0 && !x0Var2.T2 && x0Var2.Z1;
        long currentTimeMillis = System.currentTimeMillis();
        int width = x0Var2.getWidth();
        int height = x0Var2.getHeight();
        float min = x0Var2.W2 == 0 ? 1.0f : Math.min(3.0f, (currentTimeMillis - r4) / 16.667f);
        x0Var2.W2 = currentTimeMillis;
        x0Var2.X2 = min;
        float f32 = x0Var2.s;
        l2.f fVar = x0Var2.c;
        if (f32 < 1.0f) {
            f10 = 4.0f;
            j10 = currentTimeMillis;
            float min2 = Math.min(1.0f, (j10 - x0Var2.w) / 600.0f);
            x0Var2.s = min2;
            if (f32 < 0.3f && min2 >= 0.3f && fVar != null) {
                x0Var2.n.getClass();
                ((i0) fVar.b).a0();
            }
            if (x0Var2.s >= 1.0f) {
                x0Var2.r = null;
            }
        } else {
            f10 = 4.0f;
            j10 = currentTimeMillis;
        }
        long currentAnimationTimeMillis3 = AnimationUtils.currentAnimationTimeMillis();
        OverScroller overScroller = x0Var2.k9;
        if (!overScroller.isFinished() && overScroller.computeScrollOffset()) {
            x0Var2.j1 = Math.max(f7, Math.min(x0Var2.z0(), overScroller.getCurrY()));
        }
        float f33 = x0Var2.g1;
        if (f33 != x0Var2.x7) {
            if (f33 < 0.5f) {
                x0Var2.d6 = currentAnimationTimeMillis3;
            } else if (x0Var2.f1 < 0.35f) {
                x0Var2.e6 = false;
            }
            if (f33 > 0.5f) {
                x0Var2.I2 = currentAnimationTimeMillis3;
            }
            x0Var2.x7 = f33;
            x0Var2.w7 = x0Var2.f1;
            x0Var2.v7 = currentAnimationTimeMillis3;
        }
        float f34 = f10;
        float f35 = (currentAnimationTimeMillis3 - x0Var2.v7) / 1000.0f;
        gr grVar = R9;
        if (f33 > 0.5f) {
            float T13 = org.telegram.messenger.i0.T1(x0Var2.w7, 1.0f, grVar.getInterpolation(Utilities.l(f35 / 0.42f)));
            x0Var2.f1 = T13;
            x0Var2.y7 = Utilities.l(Utilities.l(T13) / 0.8f);
            f11 = 1000.0f;
            f12 = 0.5f;
            z10 = 0;
        } else {
            f11 = 1000.0f;
            f12 = 0.5f;
            z10 = 0;
            x0Var2.y7 = Math.min(x0Var2.y7, (float) Math.pow(1.0f - Utilities.l(f35 / 0.17f), 1.7000000476837158d));
            x0Var2.f1 = org.telegram.messenger.i0.T1(x0Var2.w7, 0.0f, grVar.getInterpolation(Utilities.l(f35 / 0.36f)));
        }
        x0Var2.N7 = x0Var2.f(x0Var2.N7, x0Var2.O7, 0.25f);
        v0 v0Var = x0Var2.n;
        if (v0Var != null && v0Var.a == 0) {
            i10 = z10;
            while (i10 < a.b.length) {
                if (e1(i10) == x0Var2.n.f) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        i10 = -100;
        int i14 = x0Var2.u8;
        if (i10 != i14) {
            float f36 = i10 == x0Var2.v8 ? x0Var2.x8 : 0.0f;
            x0Var2.v8 = i14;
            x0Var2.x8 = x0Var2.w8;
            x0Var2.u8 = i10;
            x0Var2.w8 = f36;
        }
        x0Var2.w8 = x0Var2.f(x0Var2.w8, 1.0f, 0.2f);
        x0Var2.x8 = x0Var2.f(x0Var2.x8, 0.0f, 0.2f);
        long currentAnimationTimeMillis4 = AnimationUtils.currentAnimationTimeMillis();
        float f37 = x0Var2.l1;
        if (f37 != x0Var2.C8) {
            x0Var2.C8 = f37;
            x0Var2.B8 = Math.max(x0Var2.E8, x0Var2.F8);
            x0Var2.z8 = currentAnimationTimeMillis4;
        }
        float f38 = (currentAnimationTimeMillis4 - x0Var2.z8) / f11;
        if (x0Var2.l1 > f12) {
            float f39 = x0Var2.B8;
            if (f38 > 0.7f) {
                f13 = f34;
                h12 = 1.0f;
                f14 = 1.0f;
            } else {
                f13 = f34;
                f14 = 1.0f;
                h12 = ((1.0f - f39) * ((float) h1(f38, 0.78d, 0.3d))) + f39;
            }
            x0Var2.E8 = h12;
            x0Var2.F8 = f38 > 0.7f ? f14 : ((f14 - f39) * ((float) h1(f38 - 0.02d, 0.8d, 0.34d))) + f39;
        } else {
            f13 = f34;
            f14 = 1.0f;
            float l11 = Utilities.l(f38 / 0.2f);
            float l12 = Utilities.l(f38 / 0.17f);
            float f40 = x0Var2.B8;
            x0Var2.E8 = (1.0f - ((3.0f - (l12 * 2.0f)) * (l12 * l12))) * f40;
            x0Var2.F8 = (1.0f - ((3.0f - (l11 * 2.0f)) * (l11 * l11))) * f40;
        }
        float max = Math.max(0.004f, x0Var2.X2 * 0.016667f);
        float f41 = x0Var2.F8;
        x0Var2.G8 = (f41 - x0Var2.H8) / max;
        x0Var2.H8 = f41;
        float max2 = Math.max(0.0f, Math.max(x0Var2.E8, f41));
        x0Var2.k1 = max2;
        if (x0Var2.D8 > 0.001f && max2 <= 0.001f) {
            x0Var2.A8 = currentAnimationTimeMillis4;
        }
        x0Var2.D8 = max2;
        x0Var2.i1 = x0Var2.f(x0Var2.i1, x0Var2.h1, 0.25f);
        boolean z12 = (x0Var2.m1 == null || j10 >= x0Var2.u1) ? z10 : true;
        x0Var2.t1 = x0Var2.f(x0Var2.t1, z12 ? f14 : 0.0f, z12 ? 0.2f : x0Var2.l1 > f12 ? 0.4f : 0.16f);
        float T14 = org.telegram.messenger.i0.T1(x0Var2.C0, x0Var2.D0, f14 - ((float) Math.pow(f14 - Math.min(f14, (j10 - x0Var2.E0) / (x0Var2.D0 > x0Var2.C0 ? 340L : 380L)), 3.0d)));
        x0Var2.B0 = T14;
        boolean z13 = x0Var2.v0;
        if (z13 && T14 >= 0.999f) {
            x0Var2.F0 = true;
        }
        if (z13) {
            if (x0Var2.w0) {
                f27 = Utilities.l((x0Var2.A0 ? 60000L : Math.max(0L, x0Var2.z0 - j10)) / 60000.0f);
            } else {
                f27 = 1.0f;
            }
            x0Var2.G0 = f27;
            if (x0Var2.w0 && !x0Var2.A0 && j10 >= x0Var2.z0) {
                x0Var2.U0(cd.L0(2131746495, null));
            }
        }
        x0Var2.u1(true);
        long nanoTime = System.nanoTime();
        float min3 = x0Var2.M6 == 0 ? 0.016f : Math.min(0.1f, (nanoTime - r8) / 1.0E9f);
        x0Var2.M6 = nanoTime;
        if (x0Var2.L6) {
            float exp = 1.0f - ((float) Math.exp((-min3) / f13));
            float f42 = x0Var2.J6;
            float f43 = x0Var2.H6;
            float z14 = c3.i0.z(f43, f42, exp, f42);
            x0Var2.J6 = z14;
            float f44 = x0Var2.K6;
            x0Var2.K6 = c3.i0.z(x0Var2.I6, f44, exp, f44);
            f15 = 1.0f;
            f16 = Math.max(-1.0f, Math.min(1.0f, (-(f43 - z14)) / 4.9f));
            f17 = Math.max(-1.0f, Math.min(1.0f, (x0Var2.I6 - x0Var2.K6) / 4.9f));
        } else {
            f15 = 1.0f;
            f16 = 0.0f;
            f17 = 0.0f;
        }
        float exp2 = f15 - ((float) Math.exp((-min3) / 0.08f));
        float f45 = x0Var2.F6;
        x0Var2.F6 = c3.i0.z(f16, f45, exp2, f45);
        float f46 = x0Var2.G6;
        x0Var2.G6 = c3.i0.z(f17, f46, exp2, f46);
        float[] fArr = y0.b;
        float f47 = fArr[z10];
        x0Var2.D6 = Math.round(r4 / r6) * (f47 > 0.0f ? f12 / f47 : 1.0f);
        float round = Math.round(x0Var2.G6 * 40.0f) / 40.0f;
        x0Var2.E6 = round;
        k9.i = x0Var2.D6 * fArr[z10];
        k9.j = (round * fArr[1]) / 100.0f;
        float f48 = x0Var2.b6;
        u0 u0Var = x0Var2.F;
        x0Var2.b6 = x0Var2.f(f48, (u0Var == null || u0Var.a == 0) ? 0.0f : 1.0f, 0.12f);
        if (u.f()) {
            canvas.isHardwareAccelerated();
        }
        if (i() && ((x0Var2.S4 || x0Var2.Z1) && canvas.isHardwareAccelerated())) {
            if (x0Var2.G1 == null) {
                x0Var2.G1 = android.support.v4.media.session.w.d("qrBg");
                RenderNode d = android.support.v4.media.session.w.d("qrBlur");
                x0Var2.H1 = d;
                float N = org.telegram.messenger.i0.N(17.6f) / 9.0f;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                u.j(d, N);
            }
            x0Var2.z(u.a(width, height, x0Var2.G1), width, height);
            u.d(x0Var2.G1);
            if (x0Var2.I1 != 1) {
                x0Var2.I1 = 1;
                Object obj = x0Var2.H1;
                float max3 = Math.max(f12, org.telegram.messenger.i0.N(fArr[2]) / 9.0f);
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                u.j(obj, max3);
            }
            Canvas a2 = u.a((width + 8) / 9, (height + 8) / 9, x0Var2.H1);
            a2.scale(0.11111111f, 0.11111111f);
            u.c(a2, x0Var2.G1);
            u.d(x0Var2.H1);
            u.c(canvas, x0Var2.G1);
        } else {
            x0Var2.z(canvas, width, height);
        }
        x0Var2.A(canvas, width);
        x0Var2.R4 = x0Var2.Q4 < 1.0f ? Utilities.l(x0Var2.U4) : 1.0f;
        float currentActionBarHeight = x0Var2.t3 + (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f);
        RectF rectF2 = x0Var2.g7;
        rectF2.set(org.telegram.messenger.i0.L(29.0f) - org.telegram.messenger.i0.L(20.0f), currentActionBarHeight - org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(20.0f) + org.telegram.messenger.i0.L(29.0f), org.telegram.messenger.i0.L(20.0f) + currentActionBarHeight);
        float T = x0Var2.T(x0Var2.R4);
        canvas.save();
        canvas.scale(T, T, rectF2.centerX(), rectF2.centerY());
        x0Var2.J(canvas, rectF2, org.telegram.messenger.i0.L(20.0f), 1.0f);
        x0Var2.M(canvas, 3, rectF2, z10);
        c2 c2Var = x0Var2.W1;
        c2Var.a(-1);
        canvas.save();
        canvas.translate(rectF2.centerX() - (org.telegram.messenger.i0.L(24.0f) / 2.0f), currentActionBarHeight - (org.telegram.messenger.i0.L(24.0f) / 2.0f));
        c2Var.draw(canvas);
        canvas.restore();
        canvas.restore();
        if (x0Var2.l7) {
            f18 = 0.08f;
            f19 = 40.0f;
            f20 = 20.0f;
            f21 = 14.0f;
            f22 = 10.0f;
            i11 = width;
            i12 = height;
        } else {
            float L = org.telegram.messenger.i0.L(14.0f);
            f22 = 10.0f;
            Paint paint = x0Var2.U1;
            paint.setTextSize(L);
            float L2 = org.telegram.messenger.i0.L(6.0f) + org.telegram.messenger.i0.L(20.0f) + org.telegram.messenger.i0.L(12.0f);
            f18 = 0.08f;
            String str = x0Var2.V1;
            f19 = 40.0f;
            f20 = 20.0f;
            f21 = 14.0f;
            RectF rectF3 = x0Var2.j7;
            rectF3.set((x0Var2.getWidth() - org.telegram.messenger.i0.L(9.0f)) - ((paint.measureText(str) + L2) + org.telegram.messenger.i0.L(14.0f)), currentActionBarHeight - org.telegram.messenger.i0.L(20.0f), x0Var2.getWidth() - org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(20.0f) + currentActionBarHeight);
            canvas.save();
            canvas.scale(T, T, rectF3.centerX(), rectF3.centerY());
            x0Var2.J(canvas, rectF3, org.telegram.messenger.i0.L(20.0f), 1.0f);
            x0Var2.M(canvas, 5, rectF3, false);
            i12 = height;
            i11 = width;
            x0Var2.o0(canvas, x0Var2.N1, rectF3.left + org.telegram.messenger.i0.L(12.0f) + org.telegram.messenger.i0.L(10.0f), currentActionBarHeight, org.telegram.messenger.i0.L(20.0f), 1.0f);
            paint.setColor(-1);
            Paint.FontMetrics fontMetrics = paint.getFontMetrics();
            canvas.drawText(str, rectF3.left + org.telegram.messenger.i0.L(12.0f) + org.telegram.messenger.i0.L(20.0f) + org.telegram.messenger.i0.L(6.0f), currentActionBarHeight - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f), paint);
            canvas.restore();
        }
        float l13 = 1.0f - Utilities.l(x0Var2.f1 * 2.2f);
        long currentAnimationTimeMillis5 = AnimationUtils.currentAnimationTimeMillis();
        boolean z15 = x0Var2.l1 > 0.5f;
        if (z15 != x0Var2.m7) {
            x0Var2.m7 = z15;
            x0Var2.o7 = x0Var2.n7;
            x0Var2.p7 = currentAnimationTimeMillis5;
        }
        float l14 = Utilities.l((currentAnimationTimeMillis5 - x0Var2.p7) / 220.0f);
        if (z15) {
            f23 = 220.0f;
            T1 = org.telegram.messenger.i0.T1(x0Var2.o7, 0.0f, l14 * l14);
            f24 = 1.0f;
        } else {
            f23 = 220.0f;
            f24 = 1.0f;
            T1 = org.telegram.messenger.i0.T1(x0Var2.o7, 1.0f, Math.min(1.0f, S(l14, 0.6f)));
        }
        x0Var2.n7 = T1;
        if (l14 < f24) {
            x0Var2.invalidate();
        }
        float l15 = Utilities.l(Utilities.l(x0Var2.n7) * 2.0f);
        float T15 = org.telegram.messenger.i0.T1(0.6f, f24, x0Var2.n7);
        boolean z16 = z15 || (x0Var2.v0 && x0Var2.w0);
        if (z16 != x0Var2.q7) {
            x0Var2.q7 = z16;
            x0Var2.s7 = x0Var2.r7;
            x0Var2.t7 = currentAnimationTimeMillis5;
        }
        int i15 = i11;
        float l16 = Utilities.l((currentAnimationTimeMillis5 - x0Var2.t7) / f23);
        if (z16) {
            T12 = org.telegram.messenger.i0.T1(x0Var2.s7, 0.0f, l16 * l16);
            f25 = 1.0f;
        } else {
            f25 = 1.0f;
            T12 = org.telegram.messenger.i0.T1(x0Var2.s7, 1.0f, Math.min(1.0f, S(l16, 0.6f)));
        }
        x0Var2.r7 = T12;
        if (l16 < f25) {
            x0Var2.invalidate();
        }
        float T16 = org.telegram.messenger.i0.T1(0.6f, f25, x0Var2.r7);
        float min4 = Math.min(l13, Utilities.l(Utilities.l(x0Var2.r7) * 2.0f));
        boolean z17 = x0Var2.f1 <= 0.001f;
        if (min4 > 0.0f || l13 > 0.0f || z17) {
            float height2 = (x0Var2.getHeight() - x0Var2.u3) - org.telegram.messenger.i0.L(f19);
            int width2 = x0Var2.getWidth();
            int L3 = org.telegram.messenger.i0.L(f20);
            float L4 = org.telegram.messenger.i0.L(42.0f) - L3;
            float f49 = L3;
            float f50 = height2 - f49;
            float L5 = org.telegram.messenger.i0.L(42.0f) + L3;
            float f51 = f49 + height2;
            boolean z18 = z17;
            RectF rectF4 = x0Var2.h7;
            rectF4.set(L4, f50, L5, f51);
            float z19 = m5.z(42.0f, width2, L3);
            float D = z20.D(42.0f, width2, L3);
            RectF rectF5 = x0Var2.i7;
            rectF5.set(z19, f50, D, f51);
            float f52 = width2 / 2.0f;
            RectF rectF6 = x0Var2.k7;
            rectF6.set(f52 - org.telegram.messenger.i0.L(72.0f), height2 - org.telegram.messenger.i0.L(f20), f52 + org.telegram.messenger.i0.L(72.0f), org.telegram.messenger.i0.L(f20) + height2);
            float T2 = x0Var2.T(x0Var2.R4) * org.telegram.messenger.i0.T1(0.6f, 1.0f, l13);
            if (min4 > 0.0f) {
                canvas.save();
                float f53 = T2 * T16;
                canvas.scale(f53, f53, rectF4.centerX(), height2);
                x0Var2.J(canvas, rectF4, org.telegram.messenger.i0.L(f20), min4);
                x0Var2.M(canvas, 4, rectF4, false);
                x0Var2.o0(canvas, x0Var2.L1, rectF4.centerX(), height2, org.telegram.messenger.i0.L(22.0f), min4);
                canvas.restore();
                canvas.save();
                float f54 = T2 * T15;
                canvas.scale(f54, f54, rectF5.centerX(), height2);
                x0Var2.J(canvas, rectF5, org.telegram.messenger.i0.L(f20), min4);
                x0Var2.M(canvas, 11, rectF5, false);
                x0Var2.o0(canvas, x0Var2.M1, rectF5.centerX(), height2, org.telegram.messenger.i0.L(24.0f), min4);
                canvas.restore();
            }
            if (z18 && l15 > 0.0f && x0Var2.a) {
                float T3 = x0Var2.T(x0Var2.R4) * T15;
                canvas.save();
                canvas.scale(T3, T3, rectF6.centerX(), rectF6.centerY());
                x0Var2.J(canvas, rectF6, org.telegram.messenger.i0.L(f20), l15);
                float width3 = rectF6.width() / 3.0f;
                canvas.save();
                Path path = x0Var2.E1;
                path.rewind();
                path.addRoundRect(rectF6, org.telegram.messenger.i0.L(f20), org.telegram.messenger.i0.L(f20), Path.Direction.CW);
                canvas.clipPath(path);
                int i16 = 0;
                while (i16 < 3) {
                    float f55 = rectF6.left;
                    float f56 = (i16 * width3) + f55;
                    float f57 = rectF6.top;
                    int i17 = i16 + 1;
                    float f58 = (i17 * width3) + f55;
                    float f59 = rectF6.bottom;
                    RectF rectF7 = x0Var2.c7;
                    rectF7.set(f56, f57, f58, f59);
                    x0Var2.M(canvas, i16 + 6, rectF7, false);
                    i16 = i17;
                }
                canvas.restore();
                int i18 = 0;
                while (i18 < 3) {
                    float f60 = l15;
                    x0Var2.o0(canvas, x0Var2.f7[i18], z20.b(i18, 0.5f, width3, rectF6.left), height2, org.telegram.messenger.i0.L(i18 == 1 ? 24.5f : 22.0f), f60);
                    i18++;
                    l15 = f60;
                    x0Var2 = x0Var2;
                }
                x0Var = x0Var2;
                canvas.restore();
                if (x0Var.k1 <= 0.001f) {
                    K(canvas);
                    i13 = i15;
                } else {
                    if (x0Var.A8 != 0) {
                        float currentAnimationTimeMillis6 = (AnimationUtils.currentAnimationTimeMillis() - x0Var.A8) / f11;
                        if (currentAnimationTimeMillis6 <= 0.45f) {
                            sin = ((float) Math.sin((currentAnimationTimeMillis6 * 6.283185307179586d) / 0.17000000178813934d)) * ((float) Math.exp((-currentAnimationTimeMillis6) / 0.11f)) * 0.07f;
                            float T4 = x0Var.T(x0Var.Q4 >= 1.0f ? Utilities.l(x0Var.U4) : 1.0f) * j(x0Var.m2, 0.06f, 0.02f);
                            if (x0Var.q2 > 0 || x0Var.v0) {
                                f26 = 1.0f;
                            } else {
                                float currentAnimationTimeMillis7 = (AnimationUtils.currentAnimationTimeMillis() - x0Var.q2) / 180.0f;
                                f26 = 1.0f;
                                if (currentAnimationTimeMillis7 < 1.0f) {
                                    T4 *= (((float) Math.sin(currentAnimationTimeMillis7 * 3.141592653589793d)) * 0.04f) + 1.0f;
                                    x0Var.invalidate();
                                }
                            }
                            z11 = sin == 0.0f || T4 != f26;
                            if (z11) {
                                canvas.save();
                                float f61 = ((sin * 0.5f) + f26) * T4;
                                float f62 = (f26 - sin) * T4;
                                RectF rectF8 = x0Var.J5;
                                canvas.scale(f61, f62, rectF8.centerX(), rectF8.centerY());
                            }
                            i13 = i15;
                            x0Var.B(canvas, i13);
                            if (z11) {
                                canvas.restore();
                            }
                        }
                    }
                    sin = 0.0f;
                    float T42 = x0Var.T(x0Var.Q4 >= 1.0f ? Utilities.l(x0Var.U4) : 1.0f) * j(x0Var.m2, 0.06f, 0.02f);
                    if (x0Var.q2 > 0) {
                    }
                    f26 = 1.0f;
                    if (sin == 0.0f) {
                    }
                    if (z11) {
                    }
                    i13 = i15;
                    x0Var.B(canvas, i13);
                    if (z11) {
                    }
                }
                x0Var.N(canvas, i13, i12);
                long currentAnimationTimeMillis8 = AnimationUtils.currentAnimationTimeMillis();
                if (x0Var.e9 == 0 && x0Var.N8 && x0Var.U8 != null && x0Var.g1 == 0.0f && x0Var.f1 > 0.001f) {
                    rectF = x0Var.L8;
                    if (!rectF.isEmpty()) {
                        x0Var.e9 = currentAnimationTimeMillis8;
                        x0Var.f9 = rectF.centerY();
                        x0Var.m1 = null;
                        j11 = 0;
                        x0Var.u1 = 0L;
                        if (x0Var.e9 != j11) {
                            float f63 = (currentAnimationTimeMillis8 - r7) / 140.0f;
                            if (f63 >= 1.0f || x0Var.U8 == null) {
                                x0Var.e9 = 0L;
                                x0Var.N8 = false;
                                x0Var.U8 = null;
                            } else {
                                x0Var.invalidate();
                                float f64 = i13;
                                canvas.saveLayerAlpha(0.0f, 0.0f, f64, i12, (int) ((1.0f - f63) * 255.0f));
                                float f65 = 1.0f - (f63 * f18);
                                canvas.scale(f65, f65, f64 / 2.0f, x0Var.f9);
                                x0Var.g9 = true;
                                x0Var.R(canvas, i13, j10);
                                x0Var.g9 = false;
                                canvas.restore();
                            }
                        } else {
                            x0Var.R(canvas, i13, j10);
                        }
                        if (fVar != null) {
                            i0 i0Var = (i0) fVar.b;
                            boolean z20 = x0Var.f1 > 0.01f && x0Var.y7 > 0.004f && x0Var.h1 == 1;
                            float L6 = ((1.0f - x0Var.y7) * org.telegram.messenger.i0.L(f21)) + (x0Var.a1() - x0Var.b1()) + org.telegram.messenger.i0.L(8.0f);
                            float f66 = x0Var.y7;
                            ?? r32 = x0Var.I7;
                            ?? r52 = x0Var.z7;
                            boolean z21 = z20 && !r52.equals(r32);
                            v0 v0Var2 = x0Var.n;
                            int i19 = v0Var2 != null ? v0Var2.b : 0;
                            boolean z22 = z20 && i19 != x0Var.H7;
                            if (z20 != x0Var.G7 || z21 || z22 || (z20 && (Math.abs(L6 - x0Var.E7) > 0.5f || Math.abs(f66 - x0Var.F7) > 0.01f))) {
                                x0Var.H7 = i19;
                                r32.set(r52);
                                x0Var.G7 = z20;
                                x0Var.E7 = L6;
                                x0Var.F7 = f66;
                                i0Var.f0(L6, f66, z20);
                                org.telegram.messenger.i0.L(f22);
                                x0Var.getWidth();
                                org.telegram.messenger.i0.L(f22);
                                x0Var.a1();
                                float f67 = ((RectF) r52).left;
                                float f68 = ((RectF) r52).top;
                                float f69 = ((RectF) r52).right;
                                float f70 = ((RectF) r52).bottom;
                                float min5 = Math.min(r52.height() / 2.0f, org.telegram.messenger.i0.W1(Utilities.l(x0Var.f1), org.telegram.messenger.i0.L(f20), org.telegram.messenger.i0.L(28.17f)));
                                i0Var.n = f67;
                                i0Var.r = f68;
                                i0Var.s = f69;
                                i0Var.w = f70;
                                i0Var.x = min5;
                                if (i0Var.h != null) {
                                    float min6 = Math.min(r1.getHeight(), i0Var.w - (i0Var.h.getTranslationY() + i0Var.h.getTop()));
                                    c cVar = i0Var.y;
                                    if (cVar != null) {
                                        cVar.G = min6;
                                    }
                                    i0Var.K = min6;
                                    if (cVar != null) {
                                        cVar.U = i0Var.s - cVar.getLeft();
                                    }
                                    m mVar = i0Var.Z;
                                    if (mVar != null) {
                                        mVar.invalidate();
                                    }
                                    i0Var.h.invalidateOutline();
                                }
                                c cVar2 = i0Var.y;
                                if (cVar2 != null) {
                                    cVar2.invalidateOutline();
                                }
                            }
                        }
                        x0Var.invalidate();
                        x0Var.V2 = false;
                        if (x0Var.S4) {
                            return;
                        }
                        x0Var.U2++;
                        return;
                    }
                }
                j11 = 0;
                if (x0Var.e9 != j11) {
                }
                if (fVar != null) {
                }
                x0Var.invalidate();
                x0Var.V2 = false;
                if (x0Var.S4) {
                }
            }
        }
        x0Var = x0Var2;
        if (x0Var.k1 <= 0.001f) {
        }
        x0Var.N(canvas, i13, i12);
        long currentAnimationTimeMillis82 = AnimationUtils.currentAnimationTimeMillis();
        if (x0Var.e9 == 0) {
            rectF = x0Var.L8;
            if (!rectF.isEmpty()) {
            }
        }
        j11 = 0;
        if (x0Var.e9 != j11) {
        }
        if (fVar != null) {
        }
        x0Var.invalidate();
        x0Var.V2 = false;
        if (x0Var.S4) {
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int top;
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = org.telegram.messenger.i0.m;
        View view = this;
        int i15 = 0;
        while (true) {
            top = view.getTop() + i15;
            if (!(view.getParent() instanceof View)) {
                break;
            }
            view = (View) view.getParent();
            i15 = top - view.getScrollY();
        }
        this.t3 = Math.max(Math.max(0, i14 - top), (org.telegram.messenger.i0.L(20.0f) + org.telegram.messenger.i0.L(9.0f)) - (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2));
        int height = getRootView().getHeight();
        View view2 = this;
        int i16 = 0;
        while (true) {
            int top2 = view2.getTop() + i16;
            if (!(view2.getParent() instanceof View)) {
                this.u3 = i0.a.d(20.0f, org.telegram.messenger.i0.L(22.0f), Math.max(0, org.telegram.messenger.i0.n - (height - (getHeight() + top2))));
                return;
            }
            view2 = (View) view2.getParent();
            i16 = top2 - view2.getScrollY();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (i10 > 0 && i11 > 0) {
            float L = org.telegram.messenger.i0.L(12.0f);
            int ceil = ((int) Math.ceil(i10 / L)) + 1;
            int ceil2 = ((int) Math.ceil(i11 / L)) + 1;
            Bitmap bitmap = this.z3;
            if (bitmap == null || bitmap.getWidth() != ceil || this.z3.getHeight() != ceil2) {
                this.z3 = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
                this.A3 = new int[ceil * ceil2];
            }
        }
        super.onSizeChanged(i10, i11, i12, i13);
    }

    /* JADX WARN: Removed duplicated region for block: B:380:0x07ca  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x07fa  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0810  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x08b4  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0832  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        float f7;
        int i10;
        int width;
        boolean z11;
        float f10;
        v0 v0Var;
        boolean z12;
        m0 m0Var;
        VelocityTracker velocityTracker;
        RippleDrawable rippleDrawable;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (motionEvent.getActionMasked() == 0) {
            this.r1 = n0(x10, y3);
        }
        boolean z13 = this.r1;
        l2.f fVar = this.c;
        if (z13) {
            if (motionEvent.getActionMasked() == 1) {
                this.r1 = false;
                if (n0(x10, y3)) {
                    this.u1 = 0L;
                    invalidate();
                    if (fVar != null) {
                        ((i0) fVar.b).presentFragment(new PremiumPreviewFragment(0, "qr_emoji"));
                        return true;
                    }
                }
            } else if (motionEvent.getActionMasked() == 3) {
                this.r1 = false;
                return true;
            }
            return true;
        }
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.v1;
        RectF rectF = this.Z7;
        RectF rectF2 = this.i7;
        RectF rectF3 = this.h7;
        RectF rectF4 = this.J5;
        RectF rectF5 = this.g7;
        RectF[] rectFArr = this.y8;
        RectF rectF6 = this.j7;
        RectF rectF7 = this.k7;
        OverScroller overScroller = this.k9;
        q0 q0Var = this.p9;
        RectF rectF8 = this.u7;
        if (actionMasked != 0) {
            ViewConfiguration viewConfiguration = this.l9;
            if (actionMasked == 1) {
                removeCallbacks(q0Var);
                Q0();
                S0();
                if (this.R) {
                    this.R = false;
                    if (this.S) {
                        this.k0.addMovement(motionEvent);
                        this.k0.computeCurrentVelocity(1000);
                        float xVelocity = this.k0.getXVelocity();
                        float yVelocity = this.k0.getYVelocity();
                        float hypot = (float) Math.hypot(xVelocity, yVelocity);
                        float L = org.telegram.messenger.i0.L(1.0f) * 2600.0f;
                        if (hypot > L) {
                            float f11 = L / hypot;
                            xVelocity *= f11;
                            yVelocity *= f11;
                        }
                        this.a0 = this.N;
                        this.b0 = this.O;
                        this.c0 = xVelocity;
                        this.d0 = yVelocity;
                        this.V = AnimationUtils.currentAnimationTimeMillis();
                        this.T = true;
                        R0();
                        return true;
                    }
                    R0();
                }
                if (this.o9 && (velocityTracker = this.m9) != null) {
                    velocityTracker.addMovement(motionEvent);
                    this.m9.computeCurrentVelocity(1000, viewConfiguration.getScaledMaximumFlingVelocity());
                    float yVelocity2 = this.m9.getYVelocity();
                    int z02 = (int) z0();
                    if (Math.abs(yVelocity2) > viewConfiguration.getScaledMinimumFlingVelocity() && z02 > 0) {
                        overScroller.fling(0, Math.round(this.j1), 0, Math.round(-yVelocity2), 0, 0, 0, z02);
                        invalidate();
                    }
                }
                if (!this.o9 && !this.n9 && Math.hypot(x10 - this.h9, y3 - this.i9) < org.telegram.messenger.i0.L(10.0f)) {
                    if (this.l7 || !m0(rectF6, x10, y3)) {
                        if (this.k1 <= 0.5f) {
                            if (m0(rectF5, x10, y3)) {
                                if (this.f1 > 0.5f) {
                                    this.g1 = 0.0f;
                                    return true;
                                }
                                if (fVar != null) {
                                    ((i0) fVar.b).finishFragment();
                                    return true;
                                }
                            } else if (!this.K0 || !m0(rectF4, x10, y3)) {
                                if (this.f1 > 0.5f) {
                                    if (y3 < rectF8.top) {
                                        z11 = true;
                                        f10 = 0.0f;
                                    } else if (y3 > rectF8.bottom) {
                                        f10 = 0.0f;
                                        z11 = true;
                                    } else if (this.h1 == 1) {
                                        int i11 = 0;
                                        while (true) {
                                            ArrayList arrayList2 = this.I;
                                            if (i11 >= arrayList2.size()) {
                                                break;
                                            }
                                            if (this.D7[i11].contains(x10, y3)) {
                                                arrayList2.remove(i11);
                                                c();
                                                i0();
                                                return true;
                                            }
                                            i11++;
                                        }
                                    } else {
                                        getWidth();
                                        float L2 = (this.j1 + y3) - (org.telegram.messenger.i0.L(4.0f) + rectF8.top);
                                        if (L2 >= 0.0f) {
                                            float L3 = x10 - (rectF8.left + org.telegram.messenger.i0.L(4.0f));
                                            float width2 = rectF8.width() - org.telegram.messenger.i0.L(8.0f);
                                            if (L3 >= 0.0f && L3 < width2) {
                                                int i12 = this.h1;
                                                if (i12 == 2) {
                                                    if (!h0()) {
                                                        float f12 = width2 / 3.0f;
                                                        float f02 = width2 / f0();
                                                        if (L2 >= 0.0f) {
                                                            int f03 = (f0() * ((int) ((L2 - 0.0f) / f12))) + ((int) (L3 / f02));
                                                            if (f03 >= 0 && f03 < arrayList.size()) {
                                                                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                                                                this.S7 = currentAnimationTimeMillis;
                                                                u0 u0Var = this.F;
                                                                if (u0Var.a == 2 && u0Var.q == f03) {
                                                                    this.T7 = currentAnimationTimeMillis;
                                                                    this.Q7 = -1;
                                                                    this.O7 = 0.0f;
                                                                    setSceneFromCard(t(this.M7));
                                                                    setPattern(W());
                                                                    B0();
                                                                    return true;
                                                                }
                                                                int i13 = this.L7;
                                                                if (i13 >= 0 && i13 != f03 && this.O7 > 0.5f) {
                                                                    this.Q7 = i13;
                                                                    this.T7 = currentAnimationTimeMillis;
                                                                }
                                                                this.L7 = f03;
                                                                this.N7 = 0.0f;
                                                                this.O7 = 1.0f;
                                                                I0(getWidth() / 2.0f, (l() / 2.0f) + m(), f03);
                                                                B0();
                                                                return true;
                                                            }
                                                        }
                                                    } else if (rectF.contains(x10, y3)) {
                                                        i0();
                                                        if (fVar != null) {
                                                            i0.Z((i0) fVar.b);
                                                            return true;
                                                        }
                                                    }
                                                } else if (i12 == 0) {
                                                    float f13 = width2 / 6.0f;
                                                    int i14 = (((int) (L2 / f13)) * 6) + ((int) (L3 / f13));
                                                    if (i14 >= 0 && i14 < a.b.length) {
                                                        int e12 = e1(i14);
                                                        int i15 = G9;
                                                        if (e12 != i15 || (v0Var = this.n) == null || v0Var.a != 0 || v0Var.f != i15 || this.F.a != 0) {
                                                            int e13 = e1(i14);
                                                            this.M7 = e13;
                                                            boolean z14 = this.F.a == 2;
                                                            if (z14) {
                                                                this.T7 = AnimationUtils.currentAnimationTimeMillis();
                                                                this.Q7 = -1;
                                                                this.O7 = 0.0f;
                                                            }
                                                            setSceneFromCard(t(e13));
                                                            if (z14) {
                                                                setPattern(W());
                                                            }
                                                            B0();
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    this.g1 = f10;
                                    return z11;
                                }
                                if (this.a && m0(rectF7, x10, y3)) {
                                    int max = Math.max(0, Math.min(2, (int) ((x10 - rectF7.left) / (rectF7.width() / 3.0f))));
                                    if (this.l1 <= 0.0f && this.k1 <= 0.05f) {
                                        F0(max);
                                        return true;
                                    }
                                    this.l1 = 0.0f;
                                    i0();
                                    postDelayed(new n0(this, max, 2), 200L);
                                    return true;
                                }
                                if (this.q7 || !m0(rectF3, x10, y3)) {
                                    if (!this.q7 && m0(rectF2, x10, y3) && fVar != null) {
                                        ((i0) fVar.b).g0();
                                        return true;
                                    }
                                } else if (fVar != null) {
                                    ((i0) fVar.b).h0(getCurrentLink());
                                    return true;
                                }
                            } else if (this.K0) {
                                if (this.v0) {
                                    this.x0 = this.w0;
                                    this.l1 = 1.0f;
                                    l0();
                                    i0();
                                    return true;
                                }
                                this.v0 = true;
                                this.q2 = 0L;
                                this.w0 = true;
                                this.A0 = true;
                                this.z0 = System.currentTimeMillis() + 60000;
                                this.C0 = this.B0;
                                this.D0 = 1.0f;
                                this.E0 = System.currentTimeMillis();
                                this.F0 = false;
                                this.d1 = true;
                                this.m2 = AnimationUtils.currentAnimationTimeMillis();
                                this.o2 = System.currentTimeMillis() + 340;
                                this.e = null;
                                this.u0 = null;
                                this.z2 = null;
                                u1(false);
                                d1(R.drawable.msg_recent, a0(), null);
                                i0();
                                if (fVar != null) {
                                    fVar.B(1);
                                    return true;
                                }
                            }
                            return true;
                        }
                        int i16 = 0;
                        while (true) {
                            if (i16 >= 3) {
                                this.l1 = 0.0f;
                                if (rectF7.contains(x10, y3)) {
                                    int max2 = Math.max(0, Math.min(2, (int) ((x10 - rectF7.left) / (rectF7.width() / 3.0f))));
                                    i0();
                                    postDelayed(new n0(this, max2, 1), 200L);
                                    return true;
                                }
                            } else if (rectFArr[i16].contains(x10, y3)) {
                                this.l1 = 0.0f;
                                if (i16 == 0) {
                                    if (this.w0) {
                                        this.A0 = true;
                                        this.z0 = System.currentTimeMillis() + 60000;
                                    }
                                    this.A2 = -1;
                                    if (fVar == null || (m0Var = ((i0) fVar.b).e) == null) {
                                        z12 = true;
                                    } else {
                                        z12 = true;
                                        m0Var.n(true, m0Var.d == 1);
                                    }
                                    u1(z12);
                                    if (this.w0) {
                                        d1(R.drawable.msg_recent, a0(), null);
                                    } else {
                                        d1(R.drawable.msg_retry, cd.L0(2131746492, null), null);
                                    }
                                    i0();
                                    return true;
                                }
                                if (i16 != 1) {
                                    U0(cd.L0(2131746493, null));
                                    return true;
                                }
                                boolean z15 = this.w0;
                                this.w0 = !z15;
                                if (z15) {
                                    this.A0 = false;
                                } else {
                                    this.A0 = true;
                                    this.z0 = System.currentTimeMillis() + 60000;
                                }
                                this.A2 = -1;
                                u1(true);
                                d1(R.drawable.msg_recent, this.w0 ? a0() : cd.L0(2131746491, null), null);
                                if (fVar != null) {
                                    fVar.B(this.w0 ? 1 : 2);
                                    return true;
                                }
                            } else {
                                i16++;
                            }
                        }
                    } else {
                        if (this.f1 > 0.001f) {
                            this.g1 = 0.0f;
                            invalidate();
                            return true;
                        }
                        if (fVar != null) {
                            i0 i0Var = (i0) fVar.b;
                            if (i0Var.getParentActivity() != null) {
                                if (i0Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                    i0Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                    return true;
                                }
                                i0Var.e0();
                                return true;
                            }
                        }
                    }
                }
            } else if (actionMasked != 2) {
                if (actionMasked != 3) {
                    return super.onTouchEvent(motionEvent);
                }
                removeCallbacks(q0Var);
                Q0();
                S0();
                if (this.R) {
                    this.R = false;
                    R0();
                    return true;
                }
            } else if (this.R) {
                this.k0.addMovement(motionEvent);
                float f14 = x10 - this.h9;
                float f15 = y3 - this.i9;
                if (!this.S && Math.hypot(f14, f15) > org.telegram.messenger.i0.L(8.0f)) {
                    this.S = true;
                }
                if (this.S) {
                    this.N = this.P + f14;
                    this.O = this.Q + f15;
                    this.e0 = (getWidth() * 0.32f * ((float) Math.tanh((f14 / Math.max(1.0f, r4)) * 2.5f))) + this.g0;
                    this.f0 = (0.32f * getHeight() * ((float) Math.tanh((f15 / Math.max(1.0f, r2)) * 2.5f))) + this.h0;
                    return true;
                }
            } else {
                int i17 = this.r9;
                if (i17 >= 0 && (rippleDrawable = this.q9[i17]) != null) {
                    rippleDrawable.setHotspot(x10, y3);
                }
                if (this.r9 >= 0 && Math.hypot(x10 - this.h9, y3 - this.i9) > org.telegram.messenger.i0.L(10.0f)) {
                    Q0();
                }
                if (Math.hypot(x10 - this.h9, y3 - this.i9) > org.telegram.messenger.i0.L(10.0f)) {
                    S0();
                }
                VelocityTracker velocityTracker2 = this.m9;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                if (!this.o9 && this.f1 > 0.5f) {
                    float f16 = this.i9;
                    if (f16 > rectF8.top && Math.abs(y3 - f16) > viewConfiguration.getScaledTouchSlop()) {
                        this.o9 = true;
                        removeCallbacks(q0Var);
                        this.i9 = y3;
                        this.j9 = this.j1;
                    }
                }
                if (this.o9) {
                    this.j1 = Math.max(0.0f, Math.min(z0(), this.j9 - (y3 - this.i9)));
                    return true;
                }
            }
        } else {
            boolean isFinished = overScroller.isFinished();
            this.n9 = !isFinished;
            if (!isFinished) {
                overScroller.forceFinished(true);
                invalidate();
            }
            this.h9 = x10;
            this.i9 = y3;
            this.j9 = this.j1;
            this.o9 = false;
            VelocityTracker velocityTracker3 = this.m9;
            if (velocityTracker3 == null) {
                this.m9 = VelocityTracker.obtain();
            } else {
                velocityTracker3.clear();
            }
            this.m9.addMovement(motionEvent);
            if (this.f1 < 0.5f && this.k1 < 0.5f) {
                float width3 = getWidth() * 0.745f;
                float width4 = (getWidth() - width3) / 2.0f;
                float m10 = m();
                if ((x10 <= width4 || x10 >= width4 + width3 || y3 <= m10 || y3 >= l() + m10) && ((!this.K0 || !m0(rectF4, x10, y3)) && !m0(rectF5, x10, y3) && ((this.q7 || (!m0(rectF3, x10, y3) && !m0(rectF2, x10, y3))) && !m0(rectF6, x10, y3) && !m0(rectF7, x10, y3)))) {
                    z10 = true;
                    this.R = z10;
                    if (this.f1 > 0.5f && this.h1 == 2) {
                        int f04 = f0();
                        float L4 = x10 - (rectF8.left + org.telegram.messenger.i0.L(4.0f));
                        float L5 = ((this.j1 + y3) - (org.telegram.messenger.i0.L(4.0f) + rectF8.top)) - 0.0f;
                        width = (L4 >= 0.0f || L5 < 0.0f || h0()) ? -1 : ((int) (L4 / ((rectF8.width() - org.telegram.messenger.i0.L(8.0f)) / f04))) + (((int) (L5 / ((rectF8.width() - org.telegram.messenger.i0.L(8.0f)) / 3.0f))) * f04);
                        if (width >= 0 && width < arrayList.size()) {
                            this.P7 = width;
                            this.R7 = AnimationUtils.currentAnimationTimeMillis();
                        }
                    }
                    if (this.f1 > 0.5f || this.h1 != 0 || y3 <= rectF8.top) {
                        f7 = 0.0f;
                    } else {
                        float L6 = x10 - (rectF8.left + org.telegram.messenger.i0.L(4.0f));
                        float L7 = (this.j1 + y3) - (org.telegram.messenger.i0.L(4.0f) + rectF8.top);
                        float width5 = (rectF8.width() - org.telegram.messenger.i0.L(8.0f)) / 6.0f;
                        f7 = 0.0f;
                        int i18 = (L6 < 0.0f || L7 < 0.0f || L6 >= 6.0f * width5) ? -1 : ((int) (L6 / width5)) + (((int) (L7 / width5)) * 6);
                        if (i18 >= 0 && i18 < a.b.length) {
                            this.V7 = i18;
                            this.W7 = AnimationUtils.currentAnimationTimeMillis();
                            invalidate();
                        }
                    }
                    this.S = false;
                    if (this.R) {
                        this.T = false;
                        this.U = false;
                        this.P = this.N;
                        this.Q = this.O;
                        this.g0 = this.e0;
                        this.h0 = this.f0;
                        VelocityTracker velocityTracker4 = this.k0;
                        if (velocityTracker4 == null) {
                            this.k0 = VelocityTracker.obtain();
                        } else {
                            velocityTracker4.clear();
                        }
                        this.k0.addMovement(motionEvent);
                    }
                    removeCallbacks(q0Var);
                    if (this.k1 > 0.5f) {
                        for (int i19 = 0; i19 < 3; i19++) {
                            rectFArr[i19].contains(x10, y3);
                        }
                    }
                    Q0();
                    if (this.k1 <= 0.5f) {
                        if (this.l7 || !m0(rectF6, x10, y3)) {
                            for (int i20 = 0; i20 < 3; i20++) {
                                if (rectFArr[i20].contains(x10, y3)) {
                                    i10 = i20;
                                    break;
                                }
                            }
                            i10 = -1;
                            if (i10 >= 0) {
                                long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                                long[] jArr = this.x9;
                                this.z9[i10] = jArr[i10] != 0 ? this.y9[i10] * ((float) Math.exp((-(currentAnimationTimeMillis2 - r6)) / 180.0f)) : f7;
                                jArr[i10] = 0;
                                this.u9[i10] = x10;
                                this.v9[i10] = y3;
                                this.w9[i10] = currentAnimationTimeMillis2;
                                this.r9 = i10;
                                invalidate();
                                return true;
                            }
                        }
                        i10 = 5;
                        if (i10 >= 0) {
                        }
                    } else {
                        if (m0(rectF5, x10, y3)) {
                            i10 = 3;
                        } else {
                            if (this.l7 || !m0(rectF6, x10, y3)) {
                                if (this.K0 && m0(rectF4, x10, y3)) {
                                    i10 = 9;
                                } else {
                                    if (this.f1 < 0.5f) {
                                        if (!this.q7 && m0(rectF3, x10, y3)) {
                                            i10 = 4;
                                        } else if (!this.q7 && m0(rectF2, x10, y3)) {
                                            i10 = 11;
                                        } else if (this.a && m0(rectF7, x10, y3)) {
                                            i10 = Math.max(0, Math.min(2, (int) ((x10 - rectF7.left) / (rectF7.width() / 3.0f)))) + 6;
                                        }
                                    }
                                    if (this.f1 > 0.5f && this.h1 == 2 && h0() && m0(rectF, x10, y3)) {
                                        i10 = 10;
                                    }
                                    i10 = -1;
                                }
                            }
                            i10 = 5;
                        }
                        if (i10 >= 0) {
                        }
                    }
                }
            }
            z10 = false;
            this.R = z10;
            if (this.f1 > 0.5f) {
                int f042 = f0();
                float L42 = x10 - (rectF8.left + org.telegram.messenger.i0.L(4.0f));
                float L52 = ((this.j1 + y3) - (org.telegram.messenger.i0.L(4.0f) + rectF8.top)) - 0.0f;
                if (L42 >= 0.0f) {
                }
                if (width >= 0) {
                    this.P7 = width;
                    this.R7 = AnimationUtils.currentAnimationTimeMillis();
                }
            }
            if (this.f1 > 0.5f) {
            }
            f7 = 0.0f;
            this.S = false;
            if (this.R) {
            }
            removeCallbacks(q0Var);
            if (this.k1 > 0.5f) {
            }
            Q0();
            if (this.k1 <= 0.5f) {
            }
        }
        return true;
    }

    public final void p(float f7, float f10, float f11) {
        float L;
        float nextFloat;
        float f12;
        float d;
        int i10 = this.c1;
        if (i10 >= 320) {
            return;
        }
        this.c1 = i10 + 1;
        Random random = this.e1;
        float nextFloat2 = random.nextFloat();
        int i11 = nextFloat2 < 0.65f ? 0 : nextFloat2 < 0.9f ? 1 : 2;
        byte[] bArr = this.a1;
        bArr[i10] = (byte) i11;
        this.b1[i10] = false;
        this.M0[i10] = ((random.nextFloat() - 0.5f) * org.telegram.messenger.i0.L(4.0f)) + f7;
        this.N0[i10] = f10;
        byte b10 = bArr[i10];
        if (b10 == 0) {
            L = org.telegram.messenger.i0.L(1.4f);
            nextFloat = random.nextFloat();
            f12 = 1.6f;
        } else {
            if (b10 == 1) {
                d = f1.d(0.7f, random.nextFloat(), org.telegram.messenger.i0.N(0.7f));
                this.S0[i10] = d;
                this.O0[i10] = (random.nextFloat() * org.telegram.messenger.i0.L(80.0f)) + (-org.telegram.messenger.i0.L(30.0f));
                this.P0[i10] = (-org.telegram.messenger.i0.L(50.0f)) - (random.nextFloat() * org.telegram.messenger.i0.L(100.0f));
                this.Q0[i10] = Math.max(0.05f, Math.min((random.nextFloat() * 0.2f) + 0.3f, f11));
                this.R0[i10] = 0.0f;
                this.T0[i10] = random.nextFloat() * 90.0f;
                this.U0[i10] = (random.nextFloat() - 0.5f) * 1080.0f;
            }
            L = org.telegram.messenger.i0.L(3.0f);
            nextFloat = random.nextFloat();
            f12 = 1.5f;
        }
        d = (nextFloat * org.telegram.messenger.i0.L(f12)) + L;
        this.S0[i10] = d;
        this.O0[i10] = (random.nextFloat() * org.telegram.messenger.i0.L(80.0f)) + (-org.telegram.messenger.i0.L(30.0f));
        this.P0[i10] = (-org.telegram.messenger.i0.L(50.0f)) - (random.nextFloat() * org.telegram.messenger.i0.L(100.0f));
        this.Q0[i10] = Math.max(0.05f, Math.min((random.nextFloat() * 0.2f) + 0.3f, f11));
        this.R0[i10] = 0.0f;
        this.T0[i10] = random.nextFloat() * 90.0f;
        this.U0[i10] = (random.nextFloat() - 0.5f) * 1080.0f;
    }

    public final bi0 p1() {
        if (this.Z8 == null) {
            bi0 bi0Var = new bi0(R.raw.contact_check, org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(28.0f));
            this.Z8 = bi0Var;
            bi0Var.setColorFilter(new ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.2126f, 0.7152f, 0.0722f, 1.0f, -255.0f}));
            this.Z8.K(0);
            this.Z8.R(this);
            this.Z8.J(true);
        }
        return this.Z8;
    }

    public final void q(float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z10, boolean z11) {
        int i10 = this.c1;
        if (i10 >= 320) {
            return;
        }
        this.c1 = i10 + 1;
        this.a1[i10] = z10 ? (byte) 1 : (byte) 0;
        this.b1[i10] = true;
        this.M0[i10] = f7;
        this.N0[i10] = f10;
        this.O0[i10] = f11;
        this.P0[i10] = f12;
        this.V0[i10] = f7;
        this.W0[i10] = f10;
        this.X0[i10] = f13;
        Random random = this.e1;
        this.Y0[i10] = z11 ? (random.nextFloat() * 3.0f) + 4.0f : 0.0f;
        this.Z0[i10] = random.nextFloat() * 6.2832f;
        this.S0[i10] = f14;
        this.Q0[i10] = f15;
        this.R0[i10] = 0.0f;
        this.T0[i10] = f16;
        this.U0[i10] = 0.0f;
    }

    public final bi0 q1() {
        if (this.a9 == null) {
            bi0 bi0Var = new bi0(R.raw.ic_save_to_gallery, org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(28.0f));
            this.a9 = bi0Var;
            bi0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            this.a9.K(0);
            this.a9.R(this);
            this.a9.J(true);
        }
        return this.a9;
    }

    public final bi0 r1() {
        if (this.Y8 == null) {
            bi0 bi0Var = new bi0(R.raw.star_premium_2, org.telegram.messenger.i0.L(27.0f), org.telegram.messenger.i0.L(27.0f));
            this.Y8 = bi0Var;
            bi0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            this.Y8.K(0);
            this.Y8.R(this);
            this.Y8.J(true);
        }
        return this.Y8;
    }

    public final boolean s0(String str) {
        return str != null && str.equals(this.u2);
    }

    public final float s1(String str) {
        int indexOf = str.indexOf(10);
        TextPaint textPaint = this.C1;
        if (indexOf >= 0) {
            return Math.max(textPaint.measureText(str, 0, indexOf), textPaint.measureText(str, indexOf + 1, str.length()));
        }
        if (!s0(str)) {
            return textPaint.measureText(str);
        }
        float textSize = textPaint.getTextSize();
        TextPaint textPaint2 = this.y2;
        textPaint2.setTextSize(textSize);
        return textPaint.measureText(this.x2) + textPaint2.measureText(this.w2) + textPaint.measureText(this.v2);
    }

    public void setFeeStars(long j10) {
        this.K0 = j10 > 0;
        String a02 = j10 > 0 ? cd.a0(null, null, 2131746496, cd.E(j10, ',')) : "";
        int indexOf = a02.indexOf(9733);
        this.I0 = indexOf >= 0 ? a02.substring(0, indexOf) : "";
        if (indexOf >= 0) {
            a02 = a02.substring(indexOf + 1);
        }
        this.J0 = a02;
        if (!this.K0 && this.v0) {
            U0(null);
        }
        invalidate();
    }

    public void setFreeLink(String str) {
        if (TextUtils.equals(this.e, str)) {
            return;
        }
        this.e = str;
        if (str == null) {
            this.u0 = null;
        } else {
            Utilities.e.c(new org.telegram.utils.twidget.h0(str, new o0(this, str, 1)));
        }
    }

    public void setGiftsOwner(long j10) {
        if (this.w1 == j10) {
            return;
        }
        this.w1 = j10;
        v5 v5Var = this.i2;
        if (v5Var != null) {
            v5Var.f();
        }
        v5 v5Var2 = new v5(this.b, j10, false);
        this.i2 = v5Var2;
        v5Var2.g = 776;
        v5Var2.e = true;
        v5Var2.j(true);
        y0();
    }

    public void setImmediateOnOpen(boolean z10) {
        this.Z1 = z10;
    }

    public void setInstantTheme(boolean z10) {
        this.f2 = z10;
    }

    public void setLinkExpires(long j10) {
        long j11 = this.G2;
        if (j11 == j10) {
            return;
        }
        if (j11 != 0 && j10 != 0) {
            i0();
        }
        this.G2 = j10;
        this.N2 = -1L;
        invalidate();
    }

    public void setOnPicksChanged(Runnable runnable) {
        this.d2 = runnable;
    }

    public void setReveal(float f7) {
        float f10;
        float sin;
        this.Q4 = f7;
        if (this.T4) {
            double d = f7 * 0.86d;
            double sqrt = Math.sqrt(0.18999999999999995d) * 10.134169850289656d;
            if (f7 >= 1.0f) {
                sin = 1.0f;
            } else {
                double d10 = sqrt * d;
                sin = (float) (1.0d - (((Math.sin(d10) * (0.9d / Math.sqrt(0.18999999999999995d))) + Math.cos(d10)) * Math.exp((-9.120752865260691d) * d)));
            }
            float l4 = Utilities.l((f7 - 0.85f) / 0.15f);
            f10 = c3.i0.z(1.0f, sin, c3.i0.D(l4, 2.0f, 3.0f, l4 * l4), sin);
        } else {
            float f11 = 1.0f - f7;
            f10 = 1.0f - (f11 * f11);
        }
        this.U4 = f10;
        boolean z10 = f7 < 1.0f;
        if (!z10) {
            this.S4 = true;
        }
        setTranslationY(z10 ? Math.round((1.0f - f10) * org.telegram.messenger.i0.L(64.0f)) : 0.0f);
        setAlpha(z10 ? Utilities.l(f10 / 0.35f) : 1.0f);
        if (getParent() instanceof View) {
            ((View) getParent()).setBackgroundColor(z10 ? a(f10, TLObject.FLAG_30) : 0);
        }
        float f12 = -1.0f;
        if (!z10) {
            this.p3 = -1.0f;
        }
        if (z10 && this.T4) {
            f12 = Utilities.l(f10);
        }
        this.s0.D = f12;
        int i10 = z10 ? 2 : 0;
        if (getLayerType() != i10) {
            setLayerType(i10, null);
        }
        invalidate();
    }

    public void setRevealOpening(boolean z10) {
        this.T4 = z10;
    }

    public void setScanHidden(boolean z10) {
        if (this.l7 != z10) {
            this.l7 = z10;
            invalidate();
        }
    }

    public void setTemporaryLink(boolean z10) {
        if (this.B2 == z10) {
            return;
        }
        this.B2 = z10;
        if (!this.H2) {
            float f7 = z10 ? 1.0f : 0.0f;
            this.E2 = f7;
            this.C2 = f7;
        }
        invalidate();
    }

    public void setThemeEditable(boolean z10) {
        if (this.a != z10) {
            this.a = z10;
            invalidate();
        }
    }

    public void setTimerOnly(boolean z10) {
        this.y0 = z10;
    }

    public final int t0() {
        int i10 = this.y6;
        SparseIntArray sparseIntArray = this.x6;
        if (i10 != 1) {
            sparseIntArray.clear();
            this.y6 = 1;
        }
        v0 v0Var = this.n;
        int i11 = v0Var != null ? v0Var.b : 0;
        int indexOfKey = sparseIntArray.indexOfKey(i11);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        int u10 = u(this.n);
        sparseIntArray.put(i11, u10);
        return u10;
    }

    public final void u1(boolean z10) {
        String sb2;
        if (this.v0) {
            if (this.w0) {
                int ceil = (int) Math.ceil((this.A0 ? 60000L : Math.max(0L, this.z0 - System.currentTimeMillis())) / 1000.0d);
                if (ceil == this.A2 && this.z2 != null) {
                    return;
                }
                this.A2 = ceil;
                StringBuilder sb3 = new StringBuilder();
                z20.q(null, 2131746505, sb3, " · ");
                sb3.append(cd.a0(null, null, 2131746506, String.format(Locale.US, "%d:%02d", Integer.valueOf(ceil / 60), Integer.valueOf(ceil % 60))));
                sb2 = sb3.toString();
            } else {
                StringBuilder sb4 = new StringBuilder();
                z20.q(null, 2131746505, sb4, " · ");
                sb2 = a1.g.m(null, 2131746498, sb4);
                this.A2 = -1;
            }
            if (sb2.equals(this.z2)) {
                return;
            }
            this.z2 = sb2;
            this.L0.t(sb2, z10, true);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        bi0 bi0Var;
        return (drawable instanceof RippleDrawable) || drawable == this.L0 || drawable == this.X1 || ((bi0Var = this.l8) != null && drawable == bi0Var) || super.verifyDrawable(drawable);
    }

    public final Drawable w(int i10) {
        return getContext().getResources().getDrawable(i10).mutate();
    }

    public final float x1(float f7, float f10, int i10, int i11) {
        float f11 = this.x;
        double max = Math.max(f11, i10 - f11);
        float f12 = this.y;
        return (((1.0f - ((float) Math.pow(1.0f - Utilities.l(((float) Math.hypot(f7 - this.x, f10 - this.y)) / (((float) Math.hypot(max, Math.max(f12, i11 - f12))) + org.telegram.messenger.i0.L(60.0f))), 0.4166666567325592d))) * 600.0f) / 1000.0f) - 0.03f;
    }

    public final void y(Canvas canvas, Bitmap bitmap) {
        float f7 = this.f3;
        float f10 = (-f7) / 2.0f;
        float width = (bitmap.getWidth() - 0.5f) * f7;
        float height = (bitmap.getHeight() - 0.5f) * f7;
        RectF rectF = this.e3;
        rectF.set(f10, f10, width, height);
        canvas.drawBitmap(bitmap, (Rect) null, rectF, this.b3);
    }

    public final void y0() {
        int i10;
        v5 v5Var = this.i2;
        if (v5Var == null) {
            return;
        }
        u0 u0Var = this.F;
        int i11 = u0Var.a;
        ArrayList arrayList = this.v1;
        long j10 = (i11 != 2 || (i10 = u0Var.q) < 0 || i10 >= arrayList.size()) ? 0L : ((TL_stars.TL_starGiftUnique) arrayList.get(this.F.q)).id;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = j10 != 0 ? (TL_stars.TL_starGiftUnique) arrayList.get(this.F.q) : null;
        arrayList.clear();
        HashMap hashMap = this.y1;
        hashMap.clear();
        ArrayList arrayList2 = v5Var.l;
        int size = arrayList2.size();
        int i12 = 0;
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList2.get(i13);
            i13++;
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
            TL_stars.StarGift starGift = savedStarGift.gift;
            if ((starGift instanceof TL_stars.TL_starGiftUnique) && !savedStarGift.refunded) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) starGift;
                if (!tL_starGiftUnique2.burned) {
                    arrayList.add(tL_starGiftUnique2);
                    hashMap.put(Long.valueOf(savedStarGift.gift.id), Long.valueOf(savedStarGift.saved_id));
                }
            }
        }
        if (tL_starGiftUnique != null) {
            int i14 = 0;
            while (true) {
                if (i14 >= arrayList.size()) {
                    i14 = -1;
                    break;
                } else if (((TL_stars.TL_starGiftUnique) arrayList.get(i14)).id == j10) {
                    break;
                } else {
                    i14++;
                }
            }
            if (i14 < 0) {
                arrayList.add(0, tL_starGiftUnique);
            } else {
                i12 = i14;
            }
            this.F.q = i12;
            this.L7 = i12;
        }
        boolean z10 = v5Var.j;
        this.x1 = z10;
        if (!z10 && !v5Var.i) {
            v5Var.b();
        }
        if (!arrayList.isEmpty() && !this.l2) {
            this.l2 = true;
            q0 q0Var = this.k2;
            removeCallbacks(q0Var);
            postDelayed(q0Var, 900L);
        }
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x05e9 A[EDGE_INSN: B:158:0x05e9->B:159:0x05e9 BREAK  A[LOOP:3: B:148:0x058c->B:155:0x05b5], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x07a7  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x08ec  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x092c  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x094c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0957  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0a48  */
    /* JADX WARN: Removed duplicated region for block: B:274:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0975  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0a10  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0a2b  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0a37  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0a39  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0970  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0395  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(Canvas canvas, int i10, int i11) {
        Canvas canvas2;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        boolean z10;
        float f19;
        float min;
        long j10;
        float f20;
        float f21;
        float f22;
        float[] fArr;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        float f28;
        float f29;
        float[] fArr2;
        float f30;
        boolean z11;
        u0 u0Var;
        boolean z12;
        boolean z13;
        int i12;
        int i13;
        boolean z14;
        float f31;
        int ceil;
        int ceil2;
        Bitmap bitmap;
        int i14;
        boolean z15;
        float f32;
        float f33;
        int i15;
        int i16;
        int i17;
        boolean z16;
        float[] fArr3;
        int[] iArr;
        float[] fArr4;
        float[] fArr5;
        boolean z17 = (this.s >= 1.0f || this.r == null || this.n == null) ? false : true;
        if (this.n == null || i10 <= 0 || i11 <= 0) {
            canvas2 = canvas;
            f7 = 0.2f;
            f10 = 1.0f;
            f11 = 3.0f;
            f12 = 0.0f;
            f13 = 0.6f;
            f14 = 2.0f;
            f15 = 0.45f;
            canvas2.drawColor(-16777216);
        } else {
            float max = Math.max(i10, i11) / 160.0f;
            float f34 = i10;
            f13 = 0.6f;
            int ceil3 = ((int) Math.ceil(f34 / max)) + 1;
            float f35 = i11;
            int ceil4 = ((int) Math.ceil(f35 / max)) + 1;
            Bitmap bitmap2 = this.Y2;
            Paint paint = this.c3;
            if (bitmap2 != null && bitmap2.getWidth() == ceil3 && this.Y2.getHeight() == ceil4) {
                f14 = 2.0f;
            } else {
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                f14 = 2.0f;
                this.Y2 = Bitmap.createBitmap(ceil3, ceil4, config);
                this.Z2 = Bitmap.createBitmap(ceil3, ceil4, config);
                Bitmap bitmap3 = this.Y2;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                this.a3 = bitmapShader;
                paint.setShader(bitmapShader);
                this.g3 = false;
            }
            this.f3 = max;
            M0(0, z17 ? this.r : this.n, i10, i11);
            this.h3 = false;
            int[] iArr2 = this.l3;
            float[] fArr6 = this.n3;
            if (z17) {
                M0(1, this.n, i10, i11);
                float y12 = y1(this.s);
                float f36 = this.x;
                i16 = 1;
                double max2 = Math.max(f36, f34 - f36);
                i15 = 0;
                float f37 = this.y;
                float hypot = (((float) Math.hypot(max2, Math.max(f37, f35 - f37))) + org.telegram.messenger.i0.L(60.0f)) * y12;
                fArr6[0] = this.x;
                fArr6[1] = this.y;
                fArr6[2] = hypot;
                boolean z18 = hypot > ((float) org.telegram.messenger.i0.L(4.0f));
                this.h3 = z18;
                if (z18) {
                    float W1 = org.telegram.messenger.i0.W1(y12, org.telegram.messenger.i0.L(90.0f), org.telegram.messenger.i0.L(56.0f));
                    float l4 = Utilities.l((1.0f - this.s) * 1.6f) * 0.38f;
                    float max3 = Math.max(0.0f, hypot - W1) / hypot;
                    float L = org.telegram.messenger.i0.L(8.0f) + hypot;
                    fArr6[3] = max3 * hypot;
                    fArr6[4] = org.telegram.messenger.i0.T1(max3, 1.0f, 0.45f) * hypot;
                    fArr6[5] = org.telegram.messenger.i0.T1(max3, 1.0f, 0.82f) * hypot;
                    fArr6[6] = hypot - (0.004f * L);
                    fArr6[7] = hypot + org.telegram.messenger.i0.L(3.0f);
                    fArr6[8] = L;
                    fArr6[9] = 0.0f;
                    fArr6[10] = l4 * 0.2f;
                    fArr6[11] = l4 * 0.6f;
                    fArr6[12] = l4;
                    fArr6[13] = l4 * 0.4f;
                    fArr6[14] = 0.0f;
                    iArr2[6] = g.k(0.55f, this.n.b, -1);
                    i17 = !z17 ? 2 : i16;
                    z16 = this.g3;
                    fArr3 = this.o3;
                    iArr = this.m3;
                    fArr4 = this.k3;
                    fArr5 = this.j3;
                    if (!z16 && i17 == this.i3 && Arrays.equals(fArr5, fArr4) && Arrays.equals(iArr2, iArr) && (!z17 || Arrays.equals(fArr6, fArr3))) {
                        f10 = 1.0f;
                    } else {
                        f10 = 1.0f;
                        Utilities.generateQrBackdrop(this.Y2, !this.h3 ? this.Z2 : null, max, i17, this.j3, this.l3, this.n3);
                        max = max;
                        int i18 = i15;
                        System.arraycopy(fArr5, i18, fArr4, i18, fArr5.length);
                        System.arraycopy(iArr2, i18, iArr, i18, iArr2.length);
                        System.arraycopy(fArr6, i18, fArr3, i18, fArr6.length);
                        this.i3 = i17;
                        this.g3 = i16;
                    }
                    if (this.Q4 >= f10) {
                        if (this.p3 < 0.0f && isAttachedToWindow()) {
                            this.p3 = u.g(this);
                        }
                        if (this.p3 > 0.0f) {
                            Matrix matrix = this.d3;
                            matrix.setScale(max, max);
                            float f38 = (-max) / f14;
                            matrix.postTranslate(f38, f38);
                            this.a3.setLocalMatrix(matrix);
                            float f39 = this.p3;
                            canvas2 = canvas;
                            f7 = 0.2f;
                            f11 = 3.0f;
                            f12 = 0.0f;
                            f15 = 0.45f;
                            canvas2.drawRoundRect(0.0f, 0.0f, f34, f35, f39, f39, paint);
                        } else {
                            f12 = 0.0f;
                        }
                    } else {
                        f12 = 0.0f;
                    }
                    canvas2 = canvas;
                    f7 = 0.2f;
                    f11 = 3.0f;
                    f15 = 0.45f;
                    y(canvas2, this.Y2);
                }
            } else {
                i15 = 0;
                i16 = 1;
            }
            if (!z17) {
            }
            z16 = this.g3;
            fArr3 = this.o3;
            iArr = this.m3;
            fArr4 = this.k3;
            fArr5 = this.j3;
            if (!z16) {
            }
            f10 = 1.0f;
            Utilities.generateQrBackdrop(this.Y2, !this.h3 ? this.Z2 : null, max, i17, this.j3, this.l3, this.n3);
            max = max;
            int i182 = i15;
            System.arraycopy(fArr5, i182, fArr4, i182, fArr5.length);
            System.arraycopy(iArr2, i182, iArr, i182, iArr2.length);
            System.arraycopy(fArr6, i182, fArr3, i182, fArr6.length);
            this.i3 = i17;
            this.g3 = i16;
            if (this.Q4 >= f10) {
            }
            canvas2 = canvas;
            f7 = 0.2f;
            f11 = 3.0f;
            f15 = 0.45f;
            y(canvas2, this.Y2);
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        float f40 = (currentAnimationTimeMillis - this.D) / 1000.0f;
        this.v3 = f40;
        float f41 = this.P3;
        float max4 = f41 < f12 ? f12 : Math.max(f12, Math.min(0.05f, f40 - f41));
        float f42 = this.v3;
        this.P3 = f42;
        boolean z19 = this.R || this.T || this.U;
        if (z19) {
            f16 = 0.05f;
            this.Q3 = f42 + 0.25f;
        } else {
            f16 = 0.05f;
        }
        float f43 = (z19 || f42 < this.Q3) ? f12 : f10;
        float f44 = this.N3;
        if (f43 < f44) {
            f15 = 0.07f;
        }
        if (max4 > f12) {
            f17 = 1000.0f;
            f18 = max4;
            this.N3 = c3.i0.z(f10, (float) Math.exp((-max4) / f15), f43 - f44, f44);
        } else {
            f17 = 1000.0f;
            f18 = max4;
        }
        float f45 = f18 * this.N3;
        this.O3 = f45;
        this.M3 = this.M3 + f45;
        double radians = (float) Math.toRadians((r4 * (-0.763f)) % 360.0f);
        Math.cos(radians);
        Math.sin(radians);
        float f46 = this.v3;
        if (this.M >= f12) {
            float f47 = this.O3;
            if (f47 > f12) {
                float f48 = this.M3 - (f47 / f14);
                f19 = 0.016f;
                double sin = (((float) Math.sin((f48 * 0.016f) + 1.0f)) * f13) + (((float) Math.sin(0.025f * f48)) * 1.2f) + C9;
                z10 = z17;
                this.K = c3.i0.u(((float) Math.cos(sin)) * 6.2f, org.telegram.messenger.i0.L(1.0f), f47, this.K);
                this.L = c3.i0.u(((float) Math.sin(sin)) * 6.2f, org.telegram.messenger.i0.L(1.0f), f47, this.L);
                float f49 = this.M;
                min = f49 < f12 ? Math.min(0.033f, Math.max(f12, f46 - f49)) : f12;
                Math.exp((-min) / 0.09f);
                this.M = f46;
                if (min > f12) {
                    t0 t0Var = this.L3;
                    int i19 = t0Var.m;
                    int[] iArr3 = t0Var.l;
                    if (i19 > 0) {
                        float f50 = min / f14;
                        int i20 = 0;
                        boolean z20 = false;
                        while (i20 < 2) {
                            float[] fArr7 = t0Var.c;
                            float[] fArr8 = t0Var.j;
                            float f51 = f11;
                            float[] fArr9 = t0Var.i;
                            float f52 = f7;
                            float[] fArr10 = t0Var.h;
                            float f53 = f12;
                            float[] fArr11 = t0Var.g;
                            long j11 = currentAnimationTimeMillis;
                            float[] fArr12 = t0Var.f;
                            float[] fArr13 = t0Var.e;
                            float[] fArr14 = t0Var.d;
                            float sqrt = ((float) Math.sqrt(220.0d)) * 1.24f;
                            boolean z21 = false;
                            for (int i21 = 0; i21 < t0Var.m; i21++) {
                                int i22 = iArr3[i21];
                                float f54 = fArr7[i22];
                                if (f54 != f53 || fArr14[i22] != f53 || fArr13[i22] != f53 || fArr12[i22] != f53 || fArr11[i22] != f53 || fArr10[i22] != f53 || fArr9[i22] != f53 || fArr8[i22] != f53) {
                                    float f55 = fArr13[i22];
                                    float f56 = (((f54 * (-220.0f)) - (sqrt * f55)) * f50) + f55;
                                    fArr13[i22] = f56;
                                    fArr7[i22] = (f56 * f50) + fArr7[i22];
                                    float f57 = fArr12[i22];
                                    float f58 = (((fArr14[i22] * (-220.0f)) - (sqrt * f57)) * f50) + f57;
                                    fArr12[i22] = f58;
                                    fArr14[i22] = (f58 * f50) + fArr14[i22];
                                    float f59 = fArr10[i22];
                                    float f60 = (((fArr11[i22] * (-220.0f)) - (sqrt * f59)) * f50) + f59;
                                    fArr10[i22] = f60;
                                    fArr11[i22] = (f60 * f50) + fArr11[i22];
                                    float f61 = fArr8[i22];
                                    float f62 = (((fArr9[i22] * (-220.0f)) - (sqrt * f61)) * f50) + f61;
                                    fArr8[i22] = f62;
                                    fArr9[i22] = (f62 * f50) + fArr9[i22];
                                    if (Math.abs(fArr12[i22]) + Math.abs(fArr13[i22]) + Math.abs(fArr14[i22]) + Math.abs(fArr7[i22]) < f16) {
                                        if (Math.abs(fArr10[i22]) + Math.abs(fArr11[i22]) < 0.02f) {
                                            if (Math.abs(fArr8[i22]) + Math.abs(fArr9[i22]) < 5.0E-4f) {
                                                fArr8[i22] = f53;
                                                fArr9[i22] = f53;
                                                fArr10[i22] = f53;
                                                fArr11[i22] = f53;
                                                fArr12[i22] = f53;
                                                fArr13[i22] = f53;
                                                fArr14[i22] = f53;
                                                fArr7[i22] = f53;
                                            }
                                        }
                                    }
                                    z21 = true;
                                }
                            }
                            z20 |= z21;
                            i20++;
                            f7 = f52;
                            currentAnimationTimeMillis = j11;
                            f11 = f51;
                            f12 = f53;
                        }
                        j10 = currentAnimationTimeMillis;
                        f20 = f11;
                        f21 = f12;
                        f22 = f7;
                        if (!z20 && (this.s >= 1.0f || this.r == null)) {
                            for (int i23 = 0; i23 < t0Var.m; i23++) {
                                t0Var.b[iArr3[i23]] = false;
                            }
                            t0Var.m = 0;
                        }
                        if (this.T) {
                            float f63 = (j10 - this.V) / f17;
                            float exp = (1.0f - ((float) Math.exp((-f63) / 0.35f))) * 0.35f;
                            this.N = (this.c0 * exp) + this.a0;
                            this.O = (this.d0 * exp) + this.b0;
                            if (f63 > 2.8f) {
                                this.T = false;
                            }
                        }
                        if (this.U) {
                            float f64 = (j10 - this.W) / f17;
                            float cos = (float) (Math.cos((f64 * 6.283185307179586d) / 0.8500000238418579d) * Math.exp((-f64) / 0.22f));
                            this.e0 = this.i0 * cos;
                            this.f0 = this.j0 * cos;
                            if (f64 > 1.6f) {
                                this.U = false;
                                float f65 = f21;
                                this.f0 = f65;
                                this.e0 = f65;
                            }
                        }
                        fArr = y0.b;
                        f23 = fArr[27] / 100.0f;
                        while (true) {
                            f24 = this.v3;
                            f25 = this.F3 + this.G3;
                            f26 = 1.5f;
                            if (f24 < f25) {
                                break;
                            }
                            this.F3 = f25;
                            float f66 = fArr[25] + f22;
                            float f67 = fArr[26];
                            u0 u0Var2 = this.F;
                            if (u0Var2 == null || u0Var2.a != 1) {
                                f26 = 1.0f;
                            }
                            this.G3 = Math.max(f66, (this.e1.nextFloat() * 0.8f * f23) + (f67 * f26));
                            double radians2 = Math.toRadians(((r7.nextFloat() - 0.5f) * 12.0f * f23) + fArr[24]);
                            this.H3 = (float) Math.cos(radians2);
                            this.I3 = (float) Math.sin(radians2);
                        }
                        if (!this.D3) {
                            this.D3 = true;
                            this.F3 = (fArr[51] / f17) + f24 + 1.5f;
                            this.G3 = f17;
                        }
                        f27 = this.F3;
                        f28 = fArr[25];
                        if (f24 >= f27 + f28 && this.G3 > 999.0f) {
                            this.G3 = fArr[26];
                        }
                        float f68 = (f24 - f27) / f28;
                        this.y3 = this.Q4 < 1.0f && f68 >= 0.0f && f68 < 1.0f;
                        this.x3 = org.telegram.messenger.i0.N(fArr[23]);
                        if (this.y3) {
                            float cos2 = 0.5f - (((float) Math.cos(f68 * 3.141592653589793d)) * 0.5f);
                            float x10 = (this.x3 * f20) + c3.i0.x(Math.abs(this.I3), i11, Math.abs(this.H3) * i10, f14);
                            this.w3 = org.telegram.messenger.i0.T1(-x10, x10, cos2);
                            this.E3 = 1.0f;
                        }
                        long nanoTime = System.nanoTime();
                        float min2 = this.U6 == 0 ? f19 : Math.min(0.1f, (nanoTime - r12) / 1.0E9f);
                        this.U6 = nanoTime;
                        if (fArr[15] >= 0.5f || this.Q4 < 1.0f) {
                            f29 = 0.35f;
                            fArr2 = fArr;
                            f30 = 0.0f;
                            this.Q6 = 0.0f;
                        } else {
                            float max5 = 30.0f / Math.max(1.0f, fArr[16]);
                            float max6 = Math.max(-1.0f, Math.min(1.0f, this.F6 * max5));
                            float max7 = Math.max(-1.0f, Math.min(1.0f, this.G6 * max5));
                            if (!this.V6) {
                                this.R6 = max6;
                                this.S6 = max7;
                                this.V6 = true;
                            }
                            f29 = 0.35f;
                            fArr2 = fArr;
                            float hypot2 = ((float) Math.hypot(max6 - this.R6, max7 - this.S6)) / min2;
                            this.R6 = max6;
                            this.S6 = max7;
                            long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                            if (hypot2 > 0.15f) {
                                this.T6 = currentAnimationTimeMillis2;
                            }
                            boolean z22 = currentAnimationTimeMillis2 - this.T6 < 1500;
                            float C = c3.i0.C(max7, -this.I3, max6 * (-this.H3), c3.i0.x(Math.abs(this.I3), i11, Math.abs(this.H3) * i10, 2.0f) + this.x3);
                            if (this.Q6 <= 0.001f) {
                                this.P6 = C;
                            }
                            float f69 = this.P6;
                            this.P6 = c3.i0.z(1.0f, (float) Math.exp((-min2) / 0.1f), C - f69, f69);
                            float e = z22 ? f1.e(min2, f22, this.Q6, 1.0f) : f1.v(min2, f13, this.Q6, 0.0f);
                            this.Q6 = e;
                            if (e > 0.001f) {
                                float D = c3.i0.D(e, 2.0f, f20, e * e);
                                if (this.y3) {
                                    this.w3 = org.telegram.messenger.i0.T1(this.w3, this.P6, D);
                                    this.E3 = org.telegram.messenger.i0.T1(this.E3, 1.0f, D);
                                } else {
                                    this.w3 = this.P6;
                                    this.E3 = D;
                                }
                                this.y3 = true;
                                if (this.Q6 >= 0.999f) {
                                    this.F3 = this.v3;
                                }
                            }
                            f30 = 0.0f;
                        }
                        if (this.y3 && this.F.a != 0) {
                            f31 = fArr2[46] / 100.0f;
                            if (f31 > f30 && i10 > 0 && i11 > 0) {
                                float L2 = org.telegram.messenger.i0.L(12.0f);
                                float f70 = i10;
                                ceil = ((int) Math.ceil(f70 / L2)) + 1;
                                float f71 = i11;
                                ceil2 = ((int) Math.ceil(f71 / L2)) + 1;
                                bitmap = this.z3;
                                if (bitmap != null || bitmap.getWidth() != ceil || this.z3.getHeight() != ceil2) {
                                    this.z3 = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
                                    this.A3 = new int[ceil * ceil2];
                                }
                                float max8 = Math.max(1.0f, fArr2[45]);
                                float f72 = fArr2[47] / 100.0f;
                                float f73 = f31 * 0.0275f;
                                float L3 = org.telegram.messenger.i0.L(130.0f);
                                float f74 = this.v3 * 0.12f;
                                i14 = 0;
                                z15 = false;
                                while (i14 < ceil2) {
                                    int i24 = 0;
                                    while (i24 < ceil) {
                                        float f75 = f73;
                                        float f76 = i24 * L2;
                                        float f77 = f74;
                                        float f78 = i14 * L2;
                                        c1(f76, f78, i10, i11);
                                        float f79 = this.o4 / max8;
                                        if (f79 >= 3.5f || f79 <= -3.5f) {
                                            f32 = f70;
                                            f33 = 0.0f;
                                        } else {
                                            f32 = f70;
                                            float exp2 = ((float) Math.exp((-0.5f) * f79 * f79)) * this.p4;
                                            if (f72 > 0.0f) {
                                                float x11 = c3.i0.x(f78 - (f71 / 2.0f), this.H3, (f76 - (f32 / 2.0f)) * (-this.I3), L3);
                                                exp2 = ((((((v1(((x11 * 2.3f) - (1.7f * f77)) + 11.3f) * f29) + (v1(x11 + f77) * 0.65f)) * 2.0f) - 1.0f) * f72) + 1.0f) * exp2;
                                            }
                                            f33 = exp2;
                                        }
                                        int max9 = Math.max(0, Math.min(zs.e4, Math.round(255.0f * f75 * f33)));
                                        if (max9 > 0) {
                                            z15 = true;
                                        }
                                        this.A3[(i14 * ceil) + i24] = (max9 << 24) | 16777215;
                                        i24++;
                                        f73 = f75;
                                        f74 = f77;
                                        f70 = f32;
                                    }
                                    i14++;
                                    f74 = f74;
                                }
                                z11 = false;
                                if (z15) {
                                    this.z3.setPixels(this.A3, 0, ceil, 0, 0, ceil, ceil2);
                                    float f80 = (-L2) / 2.0f;
                                    float f81 = ceil * L2;
                                    float f82 = L2 / 2.0f;
                                    float f83 = (ceil2 * L2) - f82;
                                    RectF rectF = this.C3;
                                    rectF.set(f80, f80, f81 - f82, f83);
                                    canvas2.drawBitmap(this.z3, (Rect) null, rectF, this.B3);
                                }
                                float f84 = (j10 - this.H) / 1000.0f;
                                u0Var = this.G;
                                if (u0Var != null) {
                                    if (f84 < (this.F.h ? 0.6f : 0.3f) + 0.135f + 0.315f) {
                                        z12 = true;
                                        if (!z12 && u0Var != null) {
                                            P0(u0Var);
                                            this.G = null;
                                        }
                                        z13 = z11;
                                        if (z12) {
                                            i12 = i10;
                                            i13 = i11;
                                            z14 = true;
                                        } else {
                                            u0 u0Var3 = this.G;
                                            z14 = true;
                                            if (u0Var3.a == 1) {
                                                u0 u0Var4 = this.F;
                                                if (u0Var4.a == 1) {
                                                    E(canvas2, i10, i11, u0Var3, u0Var4, f84, false, false);
                                                    if (z10 && this.h3) {
                                                        y(canvas2, this.Z2);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            }
                                            i12 = i10;
                                            i13 = i11;
                                        }
                                        if (z12 || !this.F.h) {
                                            if (z12) {
                                                F(canvas, i10, i11, this.G, true, this.F.a == 0 ? z14 : z13, f84);
                                                f84 = f84;
                                            }
                                            canvas2 = canvas;
                                            F(canvas2, i10, i11, this.F, false, (z12 || this.G.a == 0) ? z14 : z13, !z12 ? f84 : 100.0f);
                                        } else if (this.s >= 1.0f || this.r == null) {
                                            P0(this.G);
                                            this.G = null;
                                            canvas2 = canvas;
                                            F(canvas2, i10, i11, this.F, false, true, 100.0f);
                                        } else {
                                            float f85 = this.x;
                                            double max10 = Math.max(f85, i12 - f85);
                                            float f86 = this.y;
                                            float y13 = y1(this.s) * (((float) Math.hypot(max10, Math.max(f86, i13 - f86))) + org.telegram.messenger.i0.L(60.0f));
                                            Path path = this.R3;
                                            path.rewind();
                                            path.addCircle(this.x, this.y, y13, Path.Direction.CW);
                                            canvas2.save();
                                            u.b(canvas2, path);
                                            F(canvas2, i12, i13, this.G, true, this.F.a == 0 ? z14 : z13, -1.0f);
                                            canvas2.restore();
                                            canvas2.save();
                                            canvas2.clipPath(path);
                                            F(canvas2, i10, i11, this.F, false, this.G.a == 0 ? z14 : z13, 100.0f);
                                            canvas.restore();
                                            canvas2 = canvas;
                                        }
                                        if (z10) {
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                z12 = z11;
                                if (!z12) {
                                    P0(u0Var);
                                    this.G = null;
                                }
                                z13 = z11;
                                if (z12) {
                                }
                                if (z12) {
                                }
                                if (z12) {
                                }
                                canvas2 = canvas;
                                F(canvas2, i10, i11, this.F, false, (z12 || this.G.a == 0) ? z14 : z13, !z12 ? f84 : 100.0f);
                                if (z10) {
                                }
                            }
                        }
                        z11 = false;
                        float f842 = (j10 - this.H) / 1000.0f;
                        u0Var = this.G;
                        if (u0Var != null) {
                        }
                        z12 = z11;
                        if (!z12) {
                        }
                        z13 = z11;
                        if (z12) {
                        }
                        if (z12) {
                        }
                        if (z12) {
                        }
                        canvas2 = canvas;
                        F(canvas2, i10, i11, this.F, false, (z12 || this.G.a == 0) ? z14 : z13, !z12 ? f842 : 100.0f);
                        if (z10) {
                        }
                    }
                }
                j10 = currentAnimationTimeMillis;
                f20 = f11;
                f21 = f12;
                f22 = f7;
                if (this.T) {
                }
                if (this.U) {
                }
                fArr = y0.b;
                f23 = fArr[27] / 100.0f;
                while (true) {
                    f24 = this.v3;
                    f25 = this.F3 + this.G3;
                    f26 = 1.5f;
                    if (f24 < f25) {
                    }
                    this.G3 = Math.max(f66, (this.e1.nextFloat() * 0.8f * f23) + (f67 * f26));
                    double radians22 = Math.toRadians(((r7.nextFloat() - 0.5f) * 12.0f * f23) + fArr[24]);
                    this.H3 = (float) Math.cos(radians22);
                    this.I3 = (float) Math.sin(radians22);
                }
                if (!this.D3) {
                }
                f27 = this.F3;
                f28 = fArr[25];
                if (f24 >= f27 + f28) {
                    this.G3 = fArr[26];
                }
                float f682 = (f24 - f27) / f28;
                this.y3 = this.Q4 < 1.0f && f682 >= 0.0f && f682 < 1.0f;
                this.x3 = org.telegram.messenger.i0.N(fArr[23]);
                if (this.y3) {
                }
                long nanoTime2 = System.nanoTime();
                if (this.U6 == 0) {
                }
                this.U6 = nanoTime2;
                if (fArr[15] >= 0.5f) {
                }
                f29 = 0.35f;
                fArr2 = fArr;
                f30 = 0.0f;
                this.Q6 = 0.0f;
                if (this.y3) {
                    f31 = fArr2[46] / 100.0f;
                    if (f31 > f30) {
                        float L22 = org.telegram.messenger.i0.L(12.0f);
                        float f702 = i10;
                        ceil = ((int) Math.ceil(f702 / L22)) + 1;
                        float f712 = i11;
                        ceil2 = ((int) Math.ceil(f712 / L22)) + 1;
                        bitmap = this.z3;
                        if (bitmap != null) {
                        }
                        this.z3 = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
                        this.A3 = new int[ceil * ceil2];
                        float max82 = Math.max(1.0f, fArr2[45]);
                        float f722 = fArr2[47] / 100.0f;
                        float f732 = f31 * 0.0275f;
                        float L32 = org.telegram.messenger.i0.L(130.0f);
                        float f742 = this.v3 * 0.12f;
                        i14 = 0;
                        z15 = false;
                        while (i14 < ceil2) {
                        }
                        z11 = false;
                        if (z15) {
                        }
                        float f8422 = (j10 - this.H) / 1000.0f;
                        u0Var = this.G;
                        if (u0Var != null) {
                        }
                        z12 = z11;
                        if (!z12) {
                        }
                        z13 = z11;
                        if (z12) {
                        }
                        if (z12) {
                        }
                        if (z12) {
                        }
                        canvas2 = canvas;
                        F(canvas2, i10, i11, this.F, false, (z12 || this.G.a == 0) ? z14 : z13, !z12 ? f8422 : 100.0f);
                        if (z10) {
                        }
                    }
                }
                z11 = false;
                float f84222 = (j10 - this.H) / 1000.0f;
                u0Var = this.G;
                if (u0Var != null) {
                }
                z12 = z11;
                if (!z12) {
                }
                z13 = z11;
                if (z12) {
                }
                if (z12) {
                }
                if (z12) {
                }
                canvas2 = canvas;
                F(canvas2, i10, i11, this.F, false, (z12 || this.G.a == 0) ? z14 : z13, !z12 ? f84222 : 100.0f);
                if (z10) {
                }
            }
        }
        z10 = z17;
        f19 = 0.016f;
        float f492 = this.M;
        if (f492 < f12) {
        }
        Math.exp((-min) / 0.09f);
        this.M = f46;
        if (min > f12) {
        }
        j10 = currentAnimationTimeMillis;
        f20 = f11;
        f21 = f12;
        f22 = f7;
        if (this.T) {
        }
        if (this.U) {
        }
        fArr = y0.b;
        f23 = fArr[27] / 100.0f;
        while (true) {
            f24 = this.v3;
            f25 = this.F3 + this.G3;
            f26 = 1.5f;
            if (f24 < f25) {
            }
            this.G3 = Math.max(f66, (this.e1.nextFloat() * 0.8f * f23) + (f67 * f26));
            double radians222 = Math.toRadians(((r7.nextFloat() - 0.5f) * 12.0f * f23) + fArr[24]);
            this.H3 = (float) Math.cos(radians222);
            this.I3 = (float) Math.sin(radians222);
        }
        if (!this.D3) {
        }
        f27 = this.F3;
        f28 = fArr[25];
        if (f24 >= f27 + f28) {
        }
        float f6822 = (f24 - f27) / f28;
        this.y3 = this.Q4 < 1.0f && f6822 >= 0.0f && f6822 < 1.0f;
        this.x3 = org.telegram.messenger.i0.N(fArr[23]);
        if (this.y3) {
        }
        long nanoTime22 = System.nanoTime();
        if (this.U6 == 0) {
        }
        this.U6 = nanoTime22;
        if (fArr[15] >= 0.5f) {
        }
        f29 = 0.35f;
        fArr2 = fArr;
        f30 = 0.0f;
        this.Q6 = 0.0f;
        if (this.y3) {
        }
        z11 = false;
        float f842222 = (j10 - this.H) / 1000.0f;
        u0Var = this.G;
        if (u0Var != null) {
        }
        z12 = z11;
        if (!z12) {
        }
        z13 = z11;
        if (z12) {
        }
        if (z12) {
        }
        if (z12) {
        }
        canvas2 = canvas;
        F(canvas2, i10, i11, this.F, false, (z12 || this.G.a == 0) ? z14 : z13, !z12 ? f842222 : 100.0f);
        if (z10) {
        }
    }

    public final float z0() {
        float f7;
        int f02;
        int L;
        int L2;
        float f10;
        float A = z20.A(10.0f, 2, getWidth()) - org.telegram.messenger.i0.L(8.0f);
        int i10 = this.h1;
        if (i10 != 0) {
            if (i10 == 1) {
                f7 = A / 6.0f;
                f10 = 0.0f;
            } else if (h0()) {
                f7 = 0.0f;
                f10 = 0.0f;
            } else {
                f7 = A / 3.0f;
                f02 = ((f0() + this.v1.size()) - 1) / f0();
                L = org.telegram.messenger.i0.L(4.0f) - org.telegram.messenger.i0.L(32.0f);
                L2 = org.telegram.messenger.i0.L(4.0f);
            }
            f02 = 0;
            return Math.max(0.0f, (((f02 * f7) + f10) + org.telegram.messenger.i0.L(32.0f)) - b1());
        }
        f7 = A / 6.0f;
        f02 = (a.b.length + 5) / 6;
        L = org.telegram.messenger.i0.L(4.0f) - org.telegram.messenger.i0.L(32.0f);
        L2 = org.telegram.messenger.i0.L(4.0f);
        f10 = L2 + L;
        return Math.max(0.0f, (((f02 * f7) + f10) + org.telegram.messenger.i0.L(32.0f)) - b1());
    }
}
