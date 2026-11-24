// default package

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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class vw8 extends View {
    public static int[] C9;
    public static int[] D9;
    public static int[] E9;
    public static String I9;
    public static gv8 J9;
    public static volatile byte[] M9;
    public static int N9;
    public static int O9;
    public static int P9;
    public long A0;
    public final Paint A1;
    public String A2;
    public Bitmap A3;
    public final float A4;
    public final boolean[] A5;
    public boolean A6;
    public final LinearGradient A7;
    public long A8;
    public final Rect[] A9;
    public boolean B0;
    public final Paint B1;
    public int B2;
    public int[] B3;
    public final Paint B4;
    public int B5;
    public int B6;
    public final Paint B7;
    public float B8;
    public float C0;
    public final Paint C1;
    public boolean C2;
    public final Paint C3;
    public final Paint C4;
    public final LinearGradient C5;
    public final SweepGradient[] C6;
    public final Matrix C7;
    public float C8;
    public float D0;
    public final TextPaint D1;
    public float D2;
    public final RectF D3;
    public final RectF D4;
    public final Paint D5;
    public float D6;
    public final RectF[] D7;
    public float D8;
    public final long E;
    public float E0;
    public final TextPaint E1;
    public float E2;
    public boolean E3;
    public final float[] E4;
    public final Path E5;
    public float E6;
    public float E7;
    public float E8;
    public final Matrix F;
    public long F0;
    public final Path F1;
    public float F2;
    public float F3;
    public final float[] F4;
    public final TextPaint F5;
    public float F6;
    public float F7;
    public float F8;
    public sw8 G;
    public boolean G0;
    public final RectF G1;
    public long G2;
    public float G3;
    public final float[] G4;
    public Drawable G5;
    public float G6;
    public boolean G7;
    public float G8;
    public sw8 H;
    public float H0;
    public Object H1;
    public long H2;
    public float H3;
    public final float[] H4;
    public StaticLayout H5;
    public float H6;
    public int H7;
    public float H8;
    public long I;
    public final TextPaint I0;
    public Object I1;
    public boolean I2;
    public float I3;
    public final float[] I4;
    public int I5;
    public float I6;
    public final RectF I7;
    public final Path I8;
    public final ArrayList J;
    public String J0;
    public int J1;
    public long J2;
    public float J3;
    public final long[] J4;
    public final RectF J5;
    public float J6;
    public final HashMap J7;
    public final RectF J8;
    public final HashMap K;
    public String K0;
    public final Drawable K1;
    public float K2;
    public float K3;
    public int K4;
    public final RectF K5;
    public float K6;
    public final HashMap K7;
    public final RectF K8;
    public float L;
    public boolean L0;
    public final Drawable L1;
    public float L2;
    public float L3;
    public float L4;
    public final Path L5;
    public boolean L6;
    public int L7;
    public final RectF L8;
    public float M;
    public final gn M0;
    public final Drawable M1;
    public float M2;
    public final rw8 M3;
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
    public long O2;
    public float O3;
    public final Paint O4;
    public final Matrix O5;
    public final qw8 O6;
    public float O7;
    public Bitmap O8;
    public float P;
    public final float[] P0;
    public final Drawable P1;
    public String P2;
    public float P3;
    public final RectF P4;
    public final Matrix P5;
    public float P6;
    public int P7;
    public Bitmap P8;
    public float Q;
    public final float[] Q0;
    public final Drawable Q1;
    public float Q2;
    public float Q3;
    public float Q4;
    public final LinearGradient Q5;
    public float Q6;
    public int Q7;
    public final Paint Q8;
    public float R;
    public final float[] R0;
    public final Drawable R1;
    public long R2;
    public final Path R3;
    public float R4;
    public final LongSparseArray R5;
    public float R6;
    public long R7;
    public final Paint R8;
    public boolean S;
    public final float[] S0;
    public final Drawable S1;
    public Bitmap S2;
    public Bitmap S3;
    public boolean S4;
    public final Path S5;
    public float S6;
    public long S7;
    public final RectF S8;
    public boolean T;
    public final float[] T0;
    public final Drawable T1;
    public final Paint T2;
    public Bitmap T3;
    public boolean T4;
    public boolean T5;
    public long T6;
    public long T7;
    public int T8;
    public boolean U;
    public final float[] U0;
    public final xt U1;
    public boolean U2;
    public float U3;
    public float U4;
    public final RectF U5;
    public long U6;
    public final float U7;
    public String U8;
    public boolean V;
    public final float[] V0;
    public final Paint V1;
    public int V2;
    public float V3;
    public boolean V4;
    public final RectF V5;
    public boolean V6;
    public int V7;
    public boolean V8;
    public long W;
    public final float[] W0;
    public final String W1;
    public boolean W2;
    public float W3;
    public Bitmap W4;
    public final RectF W5;
    public final Matrix W6;
    public long W7;
    public int W8;
    public final float[] X0;
    public final ed0 X1;
    public long X2;
    public final Paint X3;
    public int[] X4;
    public final LinearGradient X5;
    public final Path X6;
    public long X7;
    public long X8;
    public final float[] Y0;
    public final oy8 Y1;
    public float Y2;
    public final int[] Y3;
    public int Y4;
    public final LinearGradient Y5;
    public final RectF Y6;
    public float Y7;
    public oy8 Y8;
    public final float[] Z0;
    public final Paint Z1;
    public Bitmap Z2;
    public final int[] Z3;
    public final Paint Z4;
    public final Matrix Z5;
    public final Path Z6;
    public final RectF Z7;
    public oy8 Z8;
    public boolean a;
    public long a0;
    public final float[] a1;
    public boolean a2;
    public Bitmap a3;
    public final float[] a4;
    public final Rect a5;
    public final Paint a6;
    public final Path a7;
    public final TextPaint a8;
    public oy8 a9;
    public final int b;
    public float b0;
    public final byte[] b1;
    public int b2;
    public BitmapShader b3;
    public final float[] b4;
    public final RectF b5;
    public float b6;
    public int b7;
    public final TextPaint b8;
    public Object b9;
    public final z24 c;
    public float c0;
    public final boolean[] c1;
    public int c2;
    public final Paint c3;
    public final float[] c4;
    public final int[] c5;
    public long c6;
    public final RectF c7;
    public final TextPaint c8;
    public float c9;
    public String d;
    public float d0;
    public int d1;
    public final HashMap d2;
    public final Paint d3;
    public final float[] d4;
    public final float[] d5;
    public long d6;
    public final Matrix d7;
    public TextPaint d8;
    public String d9;
    public String e;
    public float e0;
    public boolean e1;
    public Runnable e2;
    public final Matrix e3;
    public int e4;
    public final float[] e5;
    public boolean e6;
    public final SparseArray e7;
    public final TextPaint e8;
    public long e9;
    public String f;
    public float f0;
    public final Random f1;
    public boolean f2;
    public final RectF f3;
    public float[] f4;
    public final float[] f5;
    public boolean f6;
    public final Drawable[] f7;
    public StaticLayout f8;
    public float f9;
    public float g0;
    public float g1;
    public boolean g2;
    public float g3;
    public float[] g4;
    public final float[] g5;
    public int g6;
    public final RectF g7;
    public int g8;
    public boolean g9;
    public boolean h;
    public float h0;
    public float h1;
    public Bitmap h2;
    public boolean h3;
    public float[] h4;
    public final float[] h5;
    public int h6;
    public final RectF h7;
    public boolean h8;
    public float h9;
    public float i0;
    public int i1;
    public final int[] i2;
    public boolean i3;
    public int i4;
    public final boolean[] i5;
    public int i6;
    public final RectF i7;
    public final String i8;
    public float i9;
    public float j0;
    public float j1;
    public xsa j2;
    public byte j3;
    public int j4;
    public int j5;
    public float j6;
    public final RectF j7;
    public final String j8;
    public float j9;
    public float k0;
    public float k1;
    public final su2 k2;
    public final float[] k3;
    public PorterDuffColorFilter k4;
    public float k5;
    public float k6;
    public final RectF k7;
    public vl k8;
    public final OverScroller k9;
    public VelocityTracker l0;
    public float l1;
    public final ow8 l2;
    public final float[] l3;
    public int l4;
    public float l5;
    public float l6;
    public boolean l7;
    public oy8 l8;
    public final ViewConfiguration l9;
    public float m0;
    public float m1;
    public boolean m2;
    public final int[] m3;
    public float m4;
    public StaticLayout m5;
    public float m6;
    public boolean m7;
    public long m8;
    public VelocityTracker m9;
    public tw8 n;
    public float n0;
    public String n1;
    public long n2;
    public final int[] n3;
    public float n4;
    public boolean n5;
    public final float[] n6;
    public float n7;
    public boolean n8;
    public boolean n9;
    public float o0;
    public int o1;
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
    public long p2;
    public final float[] p3;
    public float p4;
    public final float[] p5;
    public float p6;
    public long p7;
    public TLRPC.Document p8;
    public final ow8 p9;
    public float q0;
    public String q1;
    public float q2;
    public float q3;
    public float q4;
    public final float[] q5;
    public boolean q6;
    public boolean q7;
    public long q8;
    public final RippleDrawable[] q9;
    public tw8 r;
    public int r0;
    public final RectF r1;
    public long r2;
    public final double[] r3;
    public float r4;
    public final float[] r5;
    public float r6;
    public float r7;
    public LinearGradient[] r8;
    public int r9;
    public float s;
    public long s0;
    public boolean s1;
    public final RectF s2;
    public final double[] s3;
    public final long[] s4;
    public final float[] s5;
    public boolean s6;
    public float s7;
    public int[] s8;
    public final Paint s9;
    public final hv8 t0;
    public float t1;
    public boolean t2;
    public final double[] t3;
    public final float[] t4;
    public final float[] t5;
    public Object t6;
    public long t7;
    public final nm4 t8;
    public final Path t9;
    public gv8 u0;
    public float u1;
    public float u2;
    public int u3;
    public final float[] u4;
    public final float[] u5;
    public float u6;
    public final RectF u7;
    public int u8;
    public final float[] u9;
    public gv8 v0;
    public long v1;
    public String v2;
    public int v3;
    public final float[] v4;
    public final float[] v5;
    public int v6;
    public long v7;
    public int v8;
    public final float[] v9;
    public long w;
    public boolean w0;
    public final ArrayList w1;
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
    public long x1;
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
    public boolean y1;
    public String y2;
    public float y3;
    public final boolean[] y4;
    public final float[] y5;
    public int y6;
    public float y7;
    public final RectF[] y8;
    public final float[] y9;
    public boolean z0;
    public final HashMap z1;
    public final TextPaint z2;
    public boolean z3;
    public final Paint z4;
    public final float[] z5;
    public boolean z6;
    public final RectF z7;
    public long z8;
    public final float[] z9;
    public static final String[] B9 = {"❤️", "🔥", "🎉", "😎", "🚀", "💎", "💙", "✨", "⭐", "🍀", "🐸", "🦄", "🌈", "🍕", "👻", "🍒", "🌸", "⚡", "🏆", "🎁", "👀", "😍", "🥳", "🤩", "🐱", "🐶", "🦋", "🌙", "☀️", "🍓", "🍩", "🎈", "🎮", "🎧", "💜", "🌊"};
    public static int F9 = ld0.b("Black");
    public static int G9 = ld0.b("Neon Blue");
    public static final int H9 = gl.L(70.0f);
    public static final float K9 = 0.309017f;
    public static final float L9 = 0.95105654f;
    public static final s33 Q9 = new s33(0.16d, 1.0d, 0.3d, 1.0d);

    /* JADX WARN: Type inference failed for: r11v18, types: [ow8] */
    /* JADX WARN: Type inference failed for: r3v26, types: [ow8] */
    public vw8(Context context, int i, String str, String str2, boolean z, z24 z24Var) {
        super(context);
        gv8 c;
        final byte b = 1;
        this.a = true;
        this.s = 1.0f;
        this.E = AnimationUtils.currentAnimationTimeMillis();
        this.F = new Matrix();
        this.G = new sw8();
        this.J = new ArrayList();
        this.K = new HashMap();
        Paint paint = new Paint(3);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        paint.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.N = -1.0f;
        this.t0 = new hv8();
        this.x0 = true;
        this.y0 = true;
        this.E0 = 0.0f;
        this.H0 = 1.0f;
        this.I0 = new TextPaint(1);
        this.J0 = "";
        this.K0 = "";
        this.N0 = new float[kk7.q5];
        this.O0 = new float[kk7.q5];
        this.P0 = new float[kk7.q5];
        this.Q0 = new float[kk7.q5];
        this.R0 = new float[kk7.q5];
        this.S0 = new float[kk7.q5];
        this.T0 = new float[kk7.q5];
        this.U0 = new float[kk7.q5];
        this.V0 = new float[kk7.q5];
        this.W0 = new float[kk7.q5];
        this.X0 = new float[kk7.q5];
        this.Y0 = new float[kk7.q5];
        this.Z0 = new float[kk7.q5];
        this.a1 = new float[kk7.q5];
        this.b1 = new byte[kk7.q5];
        this.c1 = new boolean[kk7.q5];
        this.f1 = new Random();
        final byte b2 = 0;
        this.i1 = 0;
        this.r1 = new RectF();
        this.w1 = new ArrayList();
        this.z1 = new HashMap();
        this.A1 = new Paint(1);
        this.B1 = new Paint(1);
        this.C1 = new Paint(1);
        this.D1 = new TextPaint(1);
        this.E1 = new TextPaint(1);
        this.F1 = new Path();
        this.G1 = new RectF();
        this.J1 = -1;
        this.V1 = new Paint(1);
        this.W1 = k96.M0(2131746277, null);
        this.Z1 = new Paint(1);
        this.b2 = 1;
        this.d2 = new HashMap();
        this.i2 = new int[3];
        this.k2 = new su2(this, (byte) 3);
        this.l2 = new Runnable(this) { // from class: ow8
            public final /* synthetic */ vw8 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TLRPC.Document document;
                int lastIndexOf;
                int L;
                byte b3 = b2;
                vw8 vw8Var = this.b;
                switch (b3) {
                    case 0:
                        ArrayList arrayList = vw8Var.w1;
                        for (int i2 = 0; i2 < Math.min(arrayList.size(), 9); i2++) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i2);
                            ArrayList<TL_stars.StarGiftAttribute> arrayList2 = tL_starGiftUnique.attributes;
                            int size = arrayList2.size();
                            int i3 = 0;
                            while (i3 < size) {
                                TL_stars.StarGiftAttribute starGiftAttribute = arrayList2.get(i3);
                                i3++;
                                TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                                if ((starGiftAttribute2 instanceof TL_stars.starGiftAttributeModel) && (document = ((TL_stars.starGiftAttributeModel) starGiftAttribute2).document) != null) {
                                    vw8Var.g0(tL_starGiftUnique.id, document);
                                }
                            }
                            vw8Var.l1(tL_starGiftUnique);
                        }
                        break;
                    default:
                        ArrayList arrayList3 = vw8Var.J;
                        if (vw8Var.g1 >= 0.5f && vw8Var.i1 == 1 && !vw8Var.o9) {
                            float f = vw8Var.h9;
                            float f2 = vw8Var.i9;
                            float width = (vw8Var.getWidth() - gl.L(28.0f)) / 6.0f;
                            float f3 = vw8Var.k1 + f2;
                            RectF rectF = vw8Var.u7;
                            float L2 = f3 - (rectF.top + gl.L(16.0f));
                            int i4 = -1;
                            if (L2 >= 0.0f && f >= gl.L(14.0f) && f2 >= rectF.top + gl.L(8.0f) && (L = (((int) (L2 / width)) * 6) + ((int) ((f - gl.L(14.0f)) / width))) >= 0 && L < 36) {
                                i4 = L;
                            }
                            if (i4 >= 0) {
                                String[] strArr = vw8.B9;
                                if (arrayList3.contains(strArr[i4]) && (lastIndexOf = arrayList3.lastIndexOf(strArr[i4])) >= 0) {
                                    arrayList3.remove(lastIndexOf);
                                    vw8Var.c();
                                    vw8Var.i0();
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        };
        this.q2 = 1.0f;
        this.s2 = new RectF();
        TextPaint textPaint = new TextPaint(1);
        this.z2 = textPaint;
        textPaint.setTypeface(gl.o());
        this.B2 = -1;
        this.F2 = -1.0f;
        this.M2 = -1.0f;
        this.O2 = -1L;
        this.P2 = "";
        this.Q2 = -1.0f;
        this.T2 = new Paint(3);
        this.Y2 = 1.0f;
        this.c3 = new Paint(2);
        this.d3 = new Paint(3);
        this.e3 = new Matrix();
        this.f3 = new RectF();
        this.k3 = new float[14];
        this.l3 = new float[14];
        this.m3 = new int[7];
        this.n3 = new int[7];
        this.o3 = new float[15];
        this.p3 = new float[15];
        this.q3 = -1.0f;
        this.r3 = new double[3];
        this.s3 = new double[3];
        this.t3 = new double[3];
        this.u3 = gl.m;
        this.v3 = gl.n;
        this.C3 = new Paint(2);
        this.D3 = new RectF();
        this.H3 = 5.0f;
        this.I3 = -0.7071f;
        this.J3 = 0.7071f;
        this.M3 = new rw8();
        this.O3 = 1.0f;
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
        this.f5 = new float[kk7.O3];
        this.g5 = new float[kk7.O3];
        this.h5 = new float[kk7.O3];
        this.i5 = new boolean[kk7.O3];
        this.o5 = new float[kk7.O3];
        this.p5 = new float[kk7.O3];
        this.q5 = new float[kk7.O3];
        this.r5 = new float[kk7.O3];
        this.s5 = new float[kk7.O3];
        this.t5 = new float[kk7.O3];
        this.u5 = new float[kk7.O3];
        this.v5 = new float[kk7.O3];
        this.w5 = new float[kk7.O3];
        this.x5 = new float[kk7.O3];
        this.y5 = new float[kk7.O3];
        this.z5 = new float[kk7.O3];
        this.A5 = new boolean[kk7.O3];
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
        this.n6 = new float[kk7.q5];
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
        this.O6 = new qw8(this);
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
        this.M7 = F9;
        this.P7 = -1;
        this.Q7 = -1;
        this.U7 = gl.L(20.17f);
        this.V7 = -1;
        this.X7 = -1L;
        this.Y7 = 1.0f;
        this.Z7 = new RectF();
        this.a8 = new TextPaint(1);
        this.b8 = new TextPaint(1);
        this.c8 = new TextPaint(1);
        TextPaint textPaint2 = new TextPaint(kk7.M1);
        this.e8 = textPaint2;
        textPaint2.setXfermode(new PorterDuffXfermode(mode2));
        this.i8 = k96.M0(2131746299, null);
        this.j8 = k96.M0(2131746309, null);
        int[] iArr = ld0.b;
        this.r8 = new LinearGradient[iArr.length];
        this.s8 = new int[iArr.length];
        this.t8 = new nm4();
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
        this.p9 = new Runnable(this) { // from class: ow8
            public final /* synthetic */ vw8 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TLRPC.Document document;
                int lastIndexOf;
                int L;
                byte b3 = b;
                vw8 vw8Var = this.b;
                switch (b3) {
                    case 0:
                        ArrayList arrayList = vw8Var.w1;
                        for (int i2 = 0; i2 < Math.min(arrayList.size(), 9); i2++) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i2);
                            ArrayList<TL_stars.StarGiftAttribute> arrayList2 = tL_starGiftUnique.attributes;
                            int size = arrayList2.size();
                            int i3 = 0;
                            while (i3 < size) {
                                TL_stars.StarGiftAttribute starGiftAttribute = arrayList2.get(i3);
                                i3++;
                                TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                                if ((starGiftAttribute2 instanceof TL_stars.starGiftAttributeModel) && (document = ((TL_stars.starGiftAttributeModel) starGiftAttribute2).document) != null) {
                                    vw8Var.g0(tL_starGiftUnique.id, document);
                                }
                            }
                            vw8Var.l1(tL_starGiftUnique);
                        }
                        break;
                    default:
                        ArrayList arrayList3 = vw8Var.J;
                        if (vw8Var.g1 >= 0.5f && vw8Var.i1 == 1 && !vw8Var.o9) {
                            float f = vw8Var.h9;
                            float f2 = vw8Var.i9;
                            float width = (vw8Var.getWidth() - gl.L(28.0f)) / 6.0f;
                            float f3 = vw8Var.k1 + f2;
                            RectF rectF = vw8Var.u7;
                            float L2 = f3 - (rectF.top + gl.L(16.0f));
                            int i4 = -1;
                            if (L2 >= 0.0f && f >= gl.L(14.0f) && f2 >= rectF.top + gl.L(8.0f) && (L = (((int) (L2 / width)) * 6) + ((int) ((f - gl.L(14.0f)) / width))) >= 0 && L < 36) {
                                i4 = L;
                            }
                            if (i4 >= 0) {
                                String[] strArr = vw8.B9;
                                if (arrayList3.contains(strArr[i4]) && (lastIndexOf = arrayList3.lastIndexOf(strArr[i4])) >= 0) {
                                    arrayList3.remove(lastIndexOf);
                                    vw8Var.c();
                                    vw8Var.i0();
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
        for (int i2 = 0; i2 < 12; i2++) {
            this.A9[i2] = new Rect();
        }
        this.b = i;
        this.d = str;
        this.f = str2;
        this.h = z;
        this.c = z24Var;
        this.M1 = w(R.drawable.msg_share);
        this.N1 = w(R.drawable.msg_download);
        this.O1 = w(R.drawable.msg_qr_scan);
        this.V1.setTypeface(gl.o());
        Drawable w = w(R.drawable.msg_colors);
        this.P1 = w;
        Drawable w2 = w(R.drawable.input_smile);
        this.Q1 = w2;
        Drawable w3 = w(R.drawable.menu_gift);
        this.R1 = w3;
        this.X1 = new ed0(true);
        this.S1 = w(R.drawable.msg_retry);
        this.T1 = w(R.drawable.msg_recent);
        this.U1 = new xt();
        this.K1 = w(R.drawable.msg_copy);
        this.L1 = w(R.drawable.menu_premium_main);
        this.f7 = new Drawable[]{w, w2, w3};
        oy8 oy8Var = new oy8(R.raw.plane_logo_plain, gl.L(60.0f), gl.L(60.0f), false, null);
        this.Y1 = oy8Var;
        oy8Var.M(this);
        oy8Var.F(1);
        oy8Var.setCallback(this);
        oy8Var.start();
        Paint paint8 = this.Z1;
        Paint.Style style = Paint.Style.STROKE;
        paint8.setStyle(style);
        this.Z1.setStrokeCap(Paint.Cap.ROUND);
        this.Z1.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.D1.setTextSize(gl.L(11.0f));
        this.E1.setTypeface(gl.o());
        this.B1.setStyle(style);
        gn gnVar = new gn(false, true, true);
        this.M0 = gnVar;
        gnVar.w(gl.L(11.0f));
        gnVar.n(0.35f, 280L, s33.h);
        gnVar.setCallback(this);
        gnVar.b = 3;
        tw8 t = t(F9);
        this.n = t;
        this.b7 = W0(t.c);
        if (str != null) {
            String str3 = this.d;
            if (!str3.equals(I9) || (c = J9) == null) {
                c = hv8.c(str3, gl.L(240.0f), w34.c, 0.75f, null);
                this.u0 = c;
                J9 = c;
                I9 = str3;
            } else {
                this.u0 = c;
            }
            this.t0.a(c);
        }
        t1(false);
    }

    public static void C0(double d, double d2, double d3, double[] dArr) {
        double d4 = (0.2158037573d * d3) + (0.3963377774d * d2) + d;
        double d5 = (d - (0.1055613458d * d2)) - (0.0638541728d * d3);
        double d6 = (d - (d2 * 0.0894841775d)) - (d3 * 1.291485548d);
        double d7 = d4 * d4 * d4;
        double d8 = d5 * d5 * d5;
        double d9 = d6 * d6 * d6;
        dArr[0] = (0.2309699292d * d9) + ((4.0767416621d * d7) - (3.3077115913d * d8));
        dArr[1] = ((2.6097574011d * d8) + ((-1.2684380046d) * d7)) - (0.3413193965d * d9);
        dArr[2] = (d9 * 1.707614701d) + ((d7 * (-0.0041960863d)) - (d8 * 0.7034186147d));
    }

    public static int D0(float f, float f2, float f3, int i) {
        float h1 = h1(Color.red(i));
        float h12 = h1(Color.green(i));
        float h13 = h1(Color.blue(i));
        float cbrt = (float) Math.cbrt((0.051445995f * h13) + (0.53633255f * h12) + (0.41222146f * h1));
        float cbrt2 = (float) Math.cbrt((0.10739696f * h13) + (0.6806995f * h12) + (0.2119035f * h1));
        float cbrt3 = (float) Math.cbrt((h13 * 0.6299787f) + (h12 * 0.28171885f) + (h1 * 0.08830246f));
        float f4 = (0.4505937f * cbrt3) + ((1.9779985f * cbrt) - (2.4285922f * cbrt2));
        float f5 = ((cbrt2 * 0.78277177f) + (cbrt * 0.025904037f)) - (cbrt3 * 0.80867577f);
        float hypot = (float) Math.hypot(f4, f5);
        float min = hypot > 1.0E-5f ? Math.min(f3, f2 * hypot) / hypot : 0.0f;
        float f6 = f4 * min;
        float f7 = f5 * min;
        float f8 = (0.21580376f * f7) + (0.39633778f * f6) + f;
        float f9 = (f - (0.105561346f * f6)) - (0.06385417f * f7);
        float f10 = (f - (f6 * 0.08948418f)) - (f7 * 1.2914855f);
        float f11 = f8 * f8 * f8;
        float f12 = f9 * f9 * f9;
        float f13 = f10 * f10 * f10;
        return Color.rgb(w0((0.23096994f * f13) + ((4.0767417f * f11) - (3.3077116f * f12))), w0(((2.6097574f * f12) + ((-1.268438f) * f11)) - (0.34131938f * f13)), w0((f13 * 1.7076147f) + ((f11 * (-0.0041960864f)) - (f12 * 0.7034186f))));
    }

    public static float S(float f, float f2) {
        float f3 = f - 1.0f;
        return b00.w(f2, f3, f3, ((f2 + 1.0f) * f3 * f3 * f3) + 1.0f);
    }

    public static int W0(int i) {
        double[] dArr = new double[3];
        double[] dArr2 = new double[3];
        n1(i, dArr);
        double hypot = Math.hypot(dArr[1], dArr[2]);
        if (hypot < 0.03d) {
            return -1;
        }
        b0(0.96d, Math.min(0.06d, hypot * 0.7d), Math.atan2(dArr[2], dArr[1]), dArr2);
        return Color.rgb((int) Math.round(r(d0(r(dArr2[0]))) * 255.0d), (int) Math.round(r(d0(r(dArr2[1]))) * 255.0d), (int) Math.round(r(d0(r(dArr2[2]))) * 255.0d));
    }

    public static int Z0(int i) {
        double[] dArr = new double[3];
        bm2.j(i, dArr);
        return bm2.o(bm2.b(Math.min(96.0d, dArr[0] + 24.0d), dArr[1] * 0.75d, dArr[2] * 0.75d), 26);
    }

    public static int a(float f, int i) {
        return bm2.o(i, (int) (Utilities.l(f) * Color.alpha(i)));
    }

    public static void b0(double d, double d2, double d3, double[] dArr) {
        double cos = Math.cos(d3);
        double sin = Math.sin(d3);
        C0(d, d2 * cos, d2 * sin, dArr);
        if (p0(dArr)) {
            return;
        }
        double d4 = 0.0d;
        double d5 = d2;
        for (int i = 0; i < 14; i++) {
            double d6 = (d4 + d5) / 2.0d;
            C0(d, d6 * cos, d6 * sin, dArr);
            if (p0(dArr)) {
                d4 = d6;
            } else {
                d5 = d6;
            }
        }
        C0(d, d4 * cos, d4 * sin, dArr);
    }

    public static float c0(double d) {
        return (float) (d - Math.floor(d));
    }

    public static double d0(double d) {
        return d <= 0.0031308d ? d * 12.92d : (Math.pow(d, 0.4166666666666667d) * 1.055d) - 0.055d;
    }

    public static float e1(boolean z, boolean z2, float f) {
        if (!z) {
            if (!z2) {
                f -= 0.135f;
            }
            if (f <= 0.0f) {
                return 0.0f;
            }
            if (f < 0.315f) {
                return h(f / 0.315f);
            }
        } else if (f > 0.0f) {
            return oo1.x(f, 0.18f, 1.0f, 0.0f);
        }
        return 1.0f;
    }

    public static float f1(float f, float f2, float f3) {
        float l = Utilities.l((f3 - f) / (f2 - f));
        return yjb.B(l, 2.0f, 3.0f, l * l);
    }

    public static int g(float f, int i) {
        return (((int) (Math.max(0.0f, Math.min(1.0f, f)) * 255.0f)) << 24) | (i & 16777215);
    }

    public static double g1(double d, double d2, double d3) {
        if (d <= 0.0d) {
            return 0.0d;
        }
        double d4 = 6.283185307179586d / d3;
        double d5 = 1.0d - (d2 * d2);
        double sqrt = Math.sqrt(d5) * d4;
        double d6 = sqrt * d;
        return 1.0d - (((Math.sin(d6) * (d2 / Math.sqrt(d5))) + Math.cos(d6)) * Math.exp(((-d2) * d4) * d));
    }

    public static float h(float f) {
        float f2 = f - 1.0f;
        return b00.w(f2, 1.70158f, f2, (2.70158f * f2 * f2 * f2) + 1.0f);
    }

    public static float h1(int i) {
        float f = i / 255.0f;
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static boolean i() {
        return yz.o() && e66.e(256);
    }

    public static float j(long j, float f, float f2) {
        if (j == 0) {
            return 1.0f;
        }
        float currentAnimationTimeMillis = (AnimationUtils.currentAnimationTimeMillis() - j) / 320.0f;
        if (currentAnimationTimeMillis <= 0.0f || currentAnimationTimeMillis >= 1.0f) {
            return 1.0f;
        }
        if (currentAnimationTimeMillis < 0.25f) {
            return (f * ((float) Math.sin((currentAnimationTimeMillis * 1.5707963267948966d) / 0.25d))) + 1.0f;
        }
        if (currentAnimationTimeMillis < 0.6f) {
            float f3 = (currentAnimationTimeMillis - 0.25f) / 0.35f;
            return gl.R1(f + 1.0f, 1.0f - f2, yjb.B(f3, 2.0f, 3.0f, f3 * f3));
        }
        float f4 = (currentAnimationTimeMillis - 0.6f) / 0.4f;
        return gl.R1(1.0f - f2, 1.0f, yjb.B(f4, 2.0f, 3.0f, f4 * f4));
    }

    public static void k() {
        if (C9 == null) {
            int length = ld0.b.length;
            C9 = new int[length];
            D9 = new int[length];
            E9 = new int[length];
            for (int i = 0; i < length; i++) {
                C9[i] = x(ld0.b[i], false);
                D9[i] = x(ld0.c[i], true);
                E9[i] = v(C9[i], D9[i]);
            }
        }
    }

    public static float k0(int i, int i2, int i3) {
        int i4 = (i3 * 1442695041) + (i2 * 668265263) + (i * 374761393);
        int i5 = (i4 ^ (i4 >>> 13)) * 1274126177;
        return ((i5 ^ (i5 >>> 16)) & 65535) / 65535.0f;
    }

    public static int k1(int i, int i2) {
        int i3 = i | (-16777216);
        int i4 = i2 | (-16777216);
        if (bm2.g(i3, i4) < 1.15d) {
            double[] dArr = new double[3];
            bm2.j(i3, dArr);
            for (int i5 = 0; i5 < 40 && bm2.g(i3, i4) < 1.15d; i5++) {
                double max = Math.max(0.0d, dArr[0] - 2.0d);
                dArr[0] = max;
                i3 = bm2.b(max, dArr[1], dArr[2]);
            }
        }
        return bm2.o(i3, 95);
    }

    public static boolean m0(float f, float f2, RectF rectF) {
        float L = gl.L(8.0f);
        return !rectF.isEmpty() && f >= rectF.left - L && f <= rectF.right + L && f2 >= rectF.top - L && f2 <= rectF.bottom + L;
    }

    public static void n1(int i, double[] dArr) {
        double v0 = v0(Color.red(i) / 255.0d);
        double v02 = v0(Color.green(i) / 255.0d);
        double v03 = v0(Color.blue(i) / 255.0d);
        double cbrt = Math.cbrt((0.0514459929d * v03) + (0.5363325363d * v02) + (0.4122214708d * v0));
        double cbrt2 = Math.cbrt((0.1073969566d * v03) + (0.6806995451d * v02) + (0.2119034982d * v0));
        double cbrt3 = Math.cbrt((v03 * 0.6299787005d) + (v02 * 0.2817188376d) + (v0 * 0.0883024619d));
        dArr[0] = ((0.793617785d * cbrt2) + (0.2104542553d * cbrt)) - (0.0040720468d * cbrt3);
        dArr[1] = (0.4505937099d * cbrt3) + ((1.9779984951d * cbrt) - (2.428592205d * cbrt2));
        dArr[2] = ((cbrt2 * 0.7827717662d) + (cbrt * 0.0259040371d)) - (cbrt3 * 0.808675766d);
    }

    public static boolean p0(double[] dArr) {
        double d = dArr[0];
        if (d >= -1.0E-4d && d <= 1.0001d) {
            double d2 = dArr[1];
            if (d2 >= -1.0E-4d && d2 <= 1.0001d) {
                double d3 = dArr[2];
                if (d3 >= -1.0E-4d && d3 <= 1.0001d) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Bitmap q0(Bitmap bitmap, Bitmap bitmap2, int i) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i2 = width * height;
        int[] iArr = new int[i2];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int i3 = 16777215 & i;
        int i4 = i >>> 24;
        for (int i5 = 0; i5 < i2; i5++) {
            iArr[i5] = ((((iArr[i5] >>> 24) * i4) / kk7.d4) << 24) | i3;
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

    public static Bitmap r0(sw8 sw8Var, Bitmap bitmap, boolean z) {
        if (z) {
            Bitmap bitmap2 = sw8Var.m;
            if (bitmap2 != null && sw8Var.n == bitmap && sw8Var.p == sw8Var.j) {
                return bitmap2;
            }
            Bitmap q0 = q0(bitmap, bitmap2, sw8Var.j);
            sw8Var.m = q0;
            sw8Var.n = bitmap;
            sw8Var.p = sw8Var.j;
            return q0;
        }
        Bitmap bitmap3 = sw8Var.k;
        if (bitmap3 != null && sw8Var.l == bitmap && sw8Var.o == sw8Var.j) {
            return bitmap3;
        }
        Bitmap q02 = q0(bitmap, bitmap3, sw8Var.j);
        sw8Var.k = q02;
        sw8Var.l = bitmap;
        sw8Var.o = sw8Var.j;
        return q02;
    }

    public static void s(int[] iArr, byte[] bArr, int i) {
        int i2 = 16777215 & i;
        int i3 = i >>> 24;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            iArr[i4] = ((((bArr[i4] & kk7.d4) * i3) / kk7.d4) << 24) | i2;
        }
    }

    public static float s1(float f, float f2, float f3) {
        float N = (f - f3) / gl.N(1.7f);
        float N2 = f2 / gl.N(3.2f);
        return gl.N(3.6f) * (((v1(N * 2.6f, N2 * 1.7f, 91) * 0.32f) + (v1(N, N2, 17) * 0.68f)) - 0.5f);
    }

    private void setPattern(sw8 sw8Var) {
        if (!this.g2) {
            sw8Var.h = this.s < 1.0f && this.r != null;
            if (sw8Var.a == 2) {
                Z(sw8Var);
                if (sw8Var.e == null) {
                    sw8Var.f = this.h2;
                }
            }
            sw8 sw8Var2 = this.H;
            if (sw8Var2 != null && sw8Var2 != this.G) {
                P0(sw8Var2);
            }
            this.H = this.G;
            this.G = sw8Var;
            this.I = AnimationUtils.currentAnimationTimeMillis();
            invalidate();
            return;
        }
        sw8 sw8Var3 = this.H;
        if (sw8Var3 != null && sw8Var3 != this.G) {
            P0(sw8Var3);
        }
        sw8 sw8Var4 = this.G;
        if (sw8Var4 != sw8Var) {
            P0(sw8Var4);
        }
        this.H = null;
        this.G = sw8Var;
        if (sw8Var.a == 2) {
            Z(sw8Var);
            if (sw8Var.e == null) {
                sw8Var.f = this.h2;
            }
        }
        this.I = AnimationUtils.currentAnimationTimeMillis() - 10000;
        invalidate();
    }

    private void setSceneFromCard(tw8 tw8Var) {
        Y0(tw8Var, getWidth() / 2.0f, (l() / 2.0f) + m());
        if (this.g2) {
            return;
        }
        this.q2 = j(this.o2, 0.03f, 0.005f);
        this.o2 = AnimationUtils.currentAnimationTimeMillis();
    }

    public static tw8 t(int i) {
        tw8 tw8Var = new tw8();
        tw8Var.a = (byte) 0;
        tw8Var.f = i;
        if (i == G9) {
            tw8Var.b = -12602881;
            tw8Var.c = -15308082;
            tw8Var.d = ld0.d[i];
        } else {
            tw8Var.b = x(ld0.b[i], false);
            tw8Var.c = x(ld0.c[i], true);
            tw8Var.d = ld0.d[i];
        }
        if (i == G9) {
            tw8Var.e = -16747023;
        } else {
            k();
            tw8Var.e = E9[i];
        }
        tw8Var.h = Z0(tw8Var.b);
        tw8Var.g = hv8.k(0.5f, tw8Var.b, tw8Var.c);
        return tw8Var;
    }

    public static int u(tw8 tw8Var) {
        int i;
        double d;
        if (tw8Var != null) {
            i = bm2.f(0.5f, tw8Var.b, tw8Var.c);
            d = bm2.h(tw8Var.b);
        } else {
            i = -16777216;
            d = 0.3d;
        }
        float[] fArr = lcd.b;
        float max = (fArr[10] / 100.0f) * ((float) Math.max(0.0d, Math.min(1.0d, (0.85d - d) / 0.45d)));
        float f = (fArr[11] / 100.0f) + 1.0f;
        float f2 = ((0.5f - (f * 0.5f)) + max) * 255.0f;
        return bm2.k(tw8Var != null ? tw8Var.h : TLObject.FLAG_30, bm2.k(g((fArr[3] + fArr[9]) / 100.0f, 16777215), Color.rgb(Math.max(0, Math.min(kk7.d4, Math.round((Color.red(i) * f) + f2))), Math.max(0, Math.min(kk7.d4, Math.round((Color.green(i) * f) + f2))), Math.max(0, Math.min(kk7.d4, Math.round((f * Color.blue(i)) + f2))))));
    }

    public static double u0(int i, int i2) {
        long j = (i * (-7046029254386353131L)) ^ (i2 * (-4417276706812531889L));
        long j2 = (j ^ (j >>> 31)) * (-4658895280553007687L);
        long j3 = (j2 ^ (j2 >>> 27)) * (-7723592293110705685L);
        return ((j3 ^ (j3 >>> 31)) >>> 11) / 9.007199254740992E15d;
    }

    public static float u1(float f) {
        int floor = (int) Math.floor(f);
        float f2 = f - floor;
        float B = yjb.B(f2, 2.0f, 3.0f, f2 * f2);
        float c0 = c0(Math.sin(floor * 127.1d) * 43758.5453d);
        return ((c0(Math.sin((floor + 1) * 127.1d) * 43758.5453d) - c0) * B) + c0;
    }

    public static int v(int i, int i2) {
        double d;
        double atan2;
        double min;
        double[] dArr = new double[3];
        double[] dArr2 = new double[3];
        double[] dArr3 = new double[3];
        n1(i2, dArr);
        n1(i, dArr2);
        double d2 = dArr[0];
        double d3 = d2 < 0.45d ? d2 - 0.03d : 2.0d;
        double hypot = Math.hypot(dArr[1], dArr[2]);
        if (hypot < 0.03d) {
            double d4 = (dArr[1] * 0.6d) + (dArr2[1] * 0.4d);
            double d5 = (dArr[2] * 0.6d) + (dArr2[2] * 0.4d);
            atan2 = Math.atan2(d5, d4);
            d = 2.0d;
            min = Math.min(0.012d, Math.hypot(d4, d5));
        } else {
            d = 2.0d;
            atan2 = Math.atan2(dArr[2], dArr[1]);
            min = Math.min((hypot * 1.25d) + 0.02d, 0.2d);
        }
        double d6 = 0.9d;
        double d7 = 0.2d;
        int i3 = 0;
        while (i3 < 12) {
            double d8 = (d7 + d6) / d;
            double d9 = atan2;
            double d10 = min;
            b0(d8, d10, d9, dArr3);
            if (1.05d / (((r(dArr3[2]) * 0.0722d) + ((r(dArr3[1]) * 0.7152d) + (r(dArr3[0]) * 0.2126d))) + 0.05d) > 4.4d) {
                d7 = d8;
            } else {
                d6 = d8;
            }
            i3++;
            min = d10;
            atan2 = d9;
        }
        double d11 = atan2;
        double d12 = min;
        double d13 = (d7 + d6) / d;
        if (d13 > d3) {
            d13 = Math.max(0.05d, d3);
        }
        b0(d13, d12, d11, dArr3);
        return Color.rgb((int) Math.round(r(d0(r(dArr3[0]))) * 255.0d), (int) Math.round(r(d0(r(dArr3[1]))) * 255.0d), (int) Math.round(r(d0(r(dArr3[2]))) * 255.0d));
    }

    public static double v0(double d) {
        return d <= 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
    }

    public static float v1(float f, float f2, int i) {
        int floor = (int) Math.floor(f);
        int floor2 = (int) Math.floor(f2);
        float f3 = f - floor;
        float f4 = f2 - floor2;
        float B = yjb.B(f3, 2.0f, 3.0f, f3 * f3);
        float B2 = yjb.B(f4, 2.0f, 3.0f, f4 * f4);
        float k0 = k0(floor, floor2, i);
        int i2 = floor + 1;
        float k02 = k0(i2, floor2, i);
        int i3 = floor2 + 1;
        float k03 = k0(floor, i3, i);
        float k04 = k0(i2, i3, i);
        float A = tb4.A(k02, k0, B, k0);
        return (((((k04 - k03) * B) + k03) - A) * B2) + A;
    }

    public static int w0(float f) {
        float max = Math.max(0.0f, Math.min(1.0f, f));
        return Math.round(Math.max(0.0f, Math.min(1.0f, max <= 0.0031308f ? max * 12.92f : (((float) Math.pow(max, 0.4166666567325592d)) * 1.055f) - 0.055f)) * 255.0f);
    }

    public static int x(int i, boolean z) {
        double[] dArr = new double[3];
        bm2.j(i, dArr);
        if (!z) {
            return i;
        }
        double max = Math.max(0.0d, dArr[0] - 3.0d);
        dArr[0] = max;
        double d = dArr[1] * 1.03d;
        dArr[1] = d;
        double d2 = dArr[2] * 1.03d;
        dArr[2] = d2;
        return bm2.b(max, d, d2);
    }

    public static PorterDuffColorFilter x0(sw8 sw8Var) {
        float[] fArr = lcd.b;
        int i = ((int) (fArr[14] * 10.0f)) ^ sw8Var.s;
        PorterDuffColorFilter porterDuffColorFilter = sw8Var.u;
        if (porterDuffColorFilter != null && sw8Var.t == i) {
            return porterDuffColorFilter;
        }
        sw8Var.t = i;
        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(bm2.f(fArr[14] / 100.0f, sw8Var.s, -1), PorterDuff.Mode.SRC_IN);
        sw8Var.u = porterDuffColorFilter2;
        return porterDuffColorFilter2;
    }

    public static float x1(float f) {
        return 1.0f - ((float) Math.pow(1.0f - f, 2.4000000953674316d));
    }

    /* JADX WARN: Code restructure failed: missing block: B:255:0x024b, code lost:
    
        if (r7 <= 1500) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0834  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0a32  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x05f4  */
    /* JADX WARN: Type inference failed for: r5v70 */
    /* JADX WARN: Type inference failed for: r5v71, types: [int] */
    /* JADX WARN: Type inference failed for: r5v88 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(Canvas canvas, int i) {
        float R1;
        float f;
        int i2;
        Bitmap bitmap;
        int i3;
        int i4;
        float f2;
        int i5;
        float f3;
        float f4;
        long currentTimeMillis;
        float l;
        float f5;
        float f6;
        float w;
        float f7;
        int i6;
        TextPaint textPaint;
        StaticLayout staticLayout;
        String str;
        int i7;
        float f8;
        int i8;
        StaticLayout staticLayout2;
        int i9;
        float f9;
        float f10;
        int i10;
        int i11;
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        float[] fArr4;
        float f11;
        float pow;
        float f12;
        float[] fArr5;
        float[] fArr6;
        RectF rectF;
        float f13;
        int i12;
        boolean z;
        float f14;
        boolean z2;
        int i13;
        boolean[] zArr;
        int i14;
        float N;
        float nextFloat;
        float f15;
        int i15;
        float f16;
        float f17;
        Canvas canvas2 = canvas;
        canvas2.save();
        if (this.Q4 >= 1.0f) {
            R1 = 1.0f;
        } else {
            boolean z3 = this.T4;
            float f18 = this.U4;
            R1 = z3 ? gl.R1(0.9f, 1.0f, f18) : gl.R1(0.92f, 1.0f, f18);
        }
        float l2 = 1.0f - (this.o2 == 0 ? 1.0f : Utilities.l((AnimationUtils.currentAnimationTimeMillis() - this.o2) / 320.0f));
        float j = (((this.q2 - 1.0f) * l2 * l2) + j(this.o2, 0.03f, 0.005f)) * R1;
        if (this.s0 != 0) {
            float currentAnimationTimeMillis = (AnimationUtils.currentAnimationTimeMillis() - this.s0) / 360.0f;
            if (currentAnimationTimeMillis >= 1.0f) {
                this.s0 = 0L;
            } else if (currentAnimationTimeMillis > 0.0f) {
                j *= 1.0f - ((1.0f - (currentAnimationTimeMillis * 0.3f)) * (((float) Math.sin(currentAnimationTimeMillis * 3.141592653589793d)) * 0.03f));
            }
        }
        float f19 = i;
        canvas2.scale(j, j, f19 / 2.0f, (l() / 2.0f) + m());
        float width = getWidth() * 0.745f;
        float l3 = l();
        float f20 = (f19 - width) / 2.0f;
        float m = m();
        float f21 = f20 + width;
        float f22 = l3 + m;
        this.G1.set(f20, m, f21, f22);
        this.C1.setColor(-1);
        RectF rectF2 = this.G1;
        int o = bm2.o(bm2.f(0.4f, N0(), -16777216), 16);
        Bitmap bitmap2 = this.W4;
        int i16 = 3;
        if (bitmap2 == null) {
            K0();
            i4 = 2;
            f = 2.0f;
            i3 = 1;
            i2 = 0;
        } else {
            f = 2.0f;
            byte[] bArr = M9;
            int i17 = N9;
            i2 = 0;
            if (o != this.Y4) {
                this.Y4 = o;
                s(this.X4, bArr, o);
                bitmap2.setPixels(this.X4, 0, i17, 0, 0, i17, i17);
                bitmap = bitmap2;
            } else {
                bitmap = bitmap2;
            }
            float f23 = O9 * 4.0f;
            float f24 = P9 * 4.0f;
            float L = gl.L(4.0f);
            i3 = 1;
            int[] iArr = this.c5;
            iArr[0] = 0;
            int i18 = P9;
            iArr[1] = i18;
            iArr[2] = i17 - i18;
            iArr[3] = i17;
            float[] fArr7 = this.d5;
            i4 = 2;
            float f25 = rectF2.left - f23;
            fArr7[0] = f25;
            fArr7[1] = f25 + f24;
            float f26 = rectF2.right + f23;
            fArr7[3] = f26;
            fArr7[2] = f26 - f24;
            float[] fArr8 = this.e5;
            float f27 = (rectF2.top - f23) + L;
            fArr8[0] = f27;
            fArr8[1] = f27 + f24;
            float f28 = rectF2.bottom + f23 + L;
            fArr8[3] = f28;
            fArr8[2] = f28 - f24;
            for (int i19 = 0; i19 < i16; i19++) {
                int i20 = 0;
                while (i20 < i16) {
                    Rect rect = this.a5;
                    int[] iArr2 = this.c5;
                    int i21 = i20 + 1;
                    int i22 = i16;
                    int i23 = i19 + 1;
                    rect.set(iArr2[i20], iArr2[i19], iArr2[i21], iArr2[i23]);
                    RectF rectF3 = this.b5;
                    float[] fArr9 = this.d5;
                    float f29 = fArr9[i20];
                    float[] fArr10 = this.e5;
                    rectF3.set(f29, fArr10[i19], fArr9[i21], fArr10[i23]);
                    canvas2.drawBitmap(bitmap, this.a5, this.b5, this.Z4);
                    i20 = i21;
                    i16 = i22;
                }
            }
        }
        int i24 = i16;
        canvas2.drawRoundRect(this.G1, gl.L(30.0f), gl.L(30.0f), this.C1);
        this.t0.r.set(f20, m, f21, f22);
        int N0 = N0();
        float f30 = 0.7f * width;
        float f31 = (width - f30) / f;
        float f32 = f20 + f31;
        float R12 = gl.R1(width * 0.12f, f31, this.D2) + m;
        hv8 hv8Var = this.t0;
        if (hv8Var.y != N0 || hv8Var.z == null) {
            hv8Var.y = N0;
            hv8Var.z = new PorterDuffColorFilter(N0, PorterDuff.Mode.SRC_IN);
        }
        this.t0.e(canvas2, f32, R12, f30);
        float f33 = (this.t0.m == null ? 0.0f : (r11.k * f30) / r11.b) / f;
        float f34 = f30 / f;
        float f35 = f32 + f34;
        float f36 = f34 + R12;
        float T = T(1.0f);
        canvas2.save();
        canvas2.scale(T, T, f35, f36);
        this.A1.setColor(N0);
        canvas2.drawCircle(f35, f36, f33, this.A1);
        hv8 hv8Var2 = this.t0;
        if (hv8Var2.q == i4) {
            f2 = 1.0f;
            i5 = N0;
            if (hv8Var2.p == 0) {
                currentTimeMillis = -1;
                f3 = 0.12f;
                f4 = f33;
            } else {
                f3 = 0.12f;
                f4 = f33;
                currentTimeMillis = System.currentTimeMillis() - hv8Var2.p;
            }
            l = (!this.U2 || currentTimeMillis == Long.MAX_VALUE) ? f2 : currentTimeMillis < 0 ? 0.0f : Utilities.l(currentTimeMillis / 500.0f);
            if (l < f2) {
                f5 = f30;
                f6 = f4;
                w = f2;
            } else {
                f5 = f30;
                f6 = f4;
                w = b00.w((float) Math.sin(l * 3.141592653589793d), 0.015f, l, f2 - ((float) Math.pow(f2 - l, 3.0d)));
            }
            if (w <= 0.004f) {
                canvas2.save();
                this.E5.rewind();
                f7 = 0.004f;
                this.E5.addCircle(f35, f36, f6, Path.Direction.CW);
                canvas2.clipPath(this.E5);
                float min = (f2 - Math.min(f2, w)) * f6 * 0.55f;
                float f37 = (w * 0.5f) + 0.5f;
                canvas2.translate(-min, min);
                canvas2.scale(f37, f37, f35, f36);
                if (!this.U2 || this.S2 == null) {
                    this.Y1.setAlpha((int) (Utilities.l(l * f) * 255.0f));
                    this.Y1.setBounds((int) (f35 - f6), (int) (f36 - f6), (int) (f35 + f6), (int) (f36 + f6));
                    this.Y1.draw(canvas2);
                    this.Y1.setAlpha(kk7.d4);
                } else {
                    this.c7.set(f35 - f6, f36 - f6, f35 + f6, f36 + f6);
                    canvas2.drawBitmap(this.S2, (Rect) null, this.c7, this.T2);
                }
                canvas2.restore();
            } else {
                f7 = 0.004f;
            }
            canvas2.restore();
            i6 = (int) width;
            textPaint = this.F5;
            staticLayout = this.H5;
            if (staticLayout == null && this.I5 == i6) {
                f8 = R12;
            } else {
                this.I5 = i6;
                str = this.f;
                if (str == null) {
                    str = "";
                }
                String upperCase = str.toUpperCase();
                textPaint.setTypeface(gl.n1("fonts/rcondensedbold.ttf"));
                int L2 = i6 - (gl.L(20.0f) << 1);
                this.H5 = null;
                i7 = i2;
                while (i7 <= 2) {
                    if (i7 == 0) {
                        this.G5 = w(R.drawable.qr_at_large);
                        textPaint.setTextSize(gl.L(30.0f));
                    } else if (i7 == i3) {
                        this.G5 = w(R.drawable.qr_at_medium);
                        textPaint.setTextSize(gl.L(25.0f));
                    } else {
                        this.G5 = w(R.drawable.qr_at_small);
                        textPaint.setTextSize(gl.L(19.0f));
                    }
                    Drawable drawable = this.G5;
                    int i25 = i2;
                    drawable.setBounds(i25, i25, drawable.getIntrinsicWidth(), this.G5.getIntrinsicHeight());
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.h ? b00.h(" ", upperCase) : upperCase);
                    if (this.h) {
                        f8 = R12;
                        spannableStringBuilder.setSpan(new n8a(this.G5), 0, 1, 33);
                    } else {
                        f8 = R12;
                    }
                    float width2 = this.h ? this.G5.getBounds().width() : 0;
                    float measureText = textPaint.measureText(spannableStringBuilder, this.h ? 1 : 0, spannableStringBuilder.length()) + width2;
                    if (i7 > 1 || measureText <= L2) {
                        int i26 = measureText > ((float) L2) ? 2 : 1;
                        int L3 = i26 > 1 ? gl.L(f) + (((int) (measureText + width2)) / 2) : L2;
                        if (L3 > L2) {
                            L3 = gl.L(4.0f) + (((int) (measureText + width2)) / 3);
                            i8 = i24;
                        } else {
                            i8 = i26;
                        }
                        int i27 = L3;
                        this.H5 = lwa.c(spannableStringBuilder, textPaint, i27, Layout.Alignment.ALIGN_CENTER, 0.0f, null, Math.min(gl.L(10.0f) + i27, i6), i8, true);
                        staticLayout = this.H5;
                    } else {
                        i7++;
                        R12 = f8;
                        i3 = 1;
                        i2 = 0;
                    }
                }
                f8 = R12;
                staticLayout = this.H5;
            }
            staticLayout2 = staticLayout;
            if (staticLayout2 == null) {
                int i28 = i5;
                this.F5.setColor(i28);
                this.G5.setColorFilter(m1(i28));
                float descent = (this.F5.descent() - this.F5.ascent()) * staticLayout2.getLineCount();
                float f38 = f8 + f5;
                boolean z4 = this.n5 && !this.U2;
                float f39 = this.D2;
                float f40 = z4 ? f39 < 0.999f ? 1.0f : 0.0f : 1.0f - f39;
                f9 = 36.0f;
                float f41 = f;
                float z5 = oo1.z(width, staticLayout2.getWidth(), f41, f20);
                float L4 = ((((f22 - f38) - descent) / f41) + f38) - gl.L(4.0f);
                if (!z4 || this.m5 == staticLayout2) {
                    f13 = descent;
                    i12 = i28;
                    z = z4;
                    f14 = 0.82f;
                    f10 = 1.6f;
                } else {
                    Random random = this.f1;
                    this.m5 = staticLayout2;
                    this.j5 = 0;
                    f10 = 1.6f;
                    int max = Math.max(1, staticLayout2.getWidth());
                    int max2 = Math.max(1, staticLayout2.getHeight());
                    Bitmap createBitmap = Bitmap.createBitmap(max, max2, Bitmap.Config.ALPHA_8);
                    staticLayout2.draw(new Canvas(createBitmap));
                    int[] iArr3 = new int[max];
                    int max3 = Math.max(2, gl.L(2.0f));
                    int i29 = max3 / 2;
                    f13 = descent;
                    i12 = i28;
                    z = z4;
                    int i30 = i29;
                    int i31 = max;
                    int i32 = 0;
                    int i33 = 0;
                    while (true) {
                        i15 = 96;
                        if (i30 >= max2) {
                            break;
                        }
                        int i34 = i30;
                        int[] iArr4 = iArr3;
                        Bitmap bitmap3 = createBitmap;
                        int i35 = max;
                        bitmap3.getPixels(iArr4, 0, i35, 0, i34, max, 1);
                        int i36 = i33;
                        for (int i37 = i29; i37 < i35; i37 += max3) {
                            if ((iArr4[i37] >>> 24) >= 96) {
                                i32++;
                                if (i37 < i31) {
                                    i31 = i37;
                                }
                                if (i37 > i36) {
                                    i36 = i37;
                                }
                            }
                        }
                        max = i35;
                        i30 = i34 + max3;
                        i33 = i36;
                        createBitmap = bitmap3;
                        iArr3 = iArr4;
                    }
                    int[] iArr5 = iArr3;
                    Bitmap bitmap4 = createBitmap;
                    int i38 = max;
                    if (i32 == 0) {
                        bitmap4.recycle();
                        this.k5 = 0.0f;
                        this.l5 = i38;
                        f14 = 0.82f;
                    } else {
                        this.k5 = i31;
                        this.l5 = Math.max(1, i33 - i31);
                        float min2 = Math.min(1.0f, Math.max(80, Math.min(kk7.d3, (int) (r4 / gl.N(1.3f)))) / i32);
                        float f42 = 0.82f;
                        int i39 = i29;
                        while (i39 < max2) {
                            bitmap4.getPixels(iArr5, 0, i38, 0, i39, i38, 1);
                            int i40 = i29;
                            while (true) {
                                if (i40 >= i38) {
                                    f16 = f42;
                                    break;
                                }
                                f16 = f42;
                                if (this.j5 >= 240) {
                                    break;
                                }
                                if ((iArr5[i40] >>> 24) < i15 || random.nextFloat() > min2) {
                                    f17 = min2;
                                } else {
                                    int i41 = this.j5;
                                    this.j5 = i41 + 1;
                                    float f43 = i40;
                                    this.f5[i41] = f43;
                                    f17 = min2;
                                    this.g5[i41] = i39;
                                    this.h5[i41] = ug8.e(random, 0.18f, ((f43 - this.k5) * f16) / this.l5);
                                    this.i5[i41] = false;
                                }
                                i40 += max3;
                                f42 = f16;
                                min2 = f17;
                                i15 = 96;
                            }
                            i39 += max3;
                            f42 = f16;
                            min2 = min2;
                            i15 = 96;
                        }
                        f14 = f42;
                        z2 = false;
                        bitmap4.recycle();
                        if (f40 <= f7) {
                            canvas2.save();
                            canvas2.translate(z5, L4);
                            float T2 = T(f40);
                            canvas2.scale(T2, T2, staticLayout2.getWidth() / 2.0f, f13 / 2.0f);
                            if (z) {
                                float f44 = -gl.L(8.0f);
                                float f45 = -gl.L(4.0f);
                                float L5 = gl.L(8.0f) + staticLayout2.getWidth();
                                float L6 = gl.L(4.0f) + staticLayout2.getHeight();
                                i9 = i12;
                                i13 = kk7.O3;
                                canvas2.saveLayer(f44, f45, L5, L6, null);
                                staticLayout2.draw(canvas2);
                                float f46 = this.D2 * 1.12f;
                                float f47 = this.k5;
                                float f48 = this.l5;
                                float f49 = (((f46 - 0.18f) * f48) / f14) + f47;
                                this.F.setScale(Math.max(1.0f, ls6.d(f48, f46, f14, f47) - f49), 1.0f);
                                this.F.postTranslate(f49, 0.0f);
                                this.C5.setLocalMatrix(this.F);
                                canvas2.drawRect(-gl.L(8.0f), -gl.L(4.0f), gl.L(8.0f) + staticLayout2.getWidth(), gl.L(4.0f) + staticLayout2.getHeight(), this.D5);
                                canvas.restore();
                                canvas2 = canvas;
                            } else {
                                i9 = i12;
                                i13 = kk7.O3;
                                if (f40 < 1.0f) {
                                    canvas2 = canvas;
                                    canvas2.saveLayerAlpha(0.0f, -gl.L(4.0f), staticLayout2.getWidth(), f13 + gl.L(4.0f), (int) (f40 * 255.0f));
                                } else {
                                    canvas2 = canvas;
                                }
                                staticLayout2.draw(canvas2);
                                if (f40 < 1.0f) {
                                    canvas2.restore();
                                }
                            }
                            canvas2.restore();
                        } else {
                            i9 = i12;
                            i13 = kk7.O3;
                        }
                        if (z) {
                            boolean[] zArr2 = this.i5;
                            Random random2 = this.f1;
                            float f50 = this.D2 * 1.12f;
                            for (?? r5 = z2; r5 < this.j5; r5++) {
                                boolean z6 = this.h5[r5] < f50 ? true : z2;
                                if (!z6 || zArr2[r5] || this.F2 != 1.0f || (i14 = this.B5) >= i13) {
                                    zArr = zArr2;
                                } else {
                                    this.B5 = i14 + 1;
                                    boolean z7 = random2.nextFloat() < f3 ? true : z2;
                                    float[] fArr11 = this.o5;
                                    float[] fArr12 = this.t5;
                                    float nextFloat2 = ((random2.nextFloat() - 0.5f) * gl.L(2.0f)) + this.f5[r5] + z5;
                                    fArr12[i14] = nextFloat2;
                                    fArr11[i14] = nextFloat2;
                                    float[] fArr13 = this.p5;
                                    float[] fArr14 = this.u5;
                                    zArr = zArr2;
                                    float nextFloat3 = ((random2.nextFloat() - 0.5f) * gl.L(2.0f)) + this.g5[r5] + L4;
                                    fArr14[i14] = nextFloat3;
                                    fArr13[i14] = nextFloat3;
                                    this.q5[i14] = ((random2.nextFloat() - 0.5f) * gl.L(36.0f)) + gl.L(6.0f);
                                    this.r5[i14] = -((random2.nextFloat() * gl.L(36.0f)) + gl.L(18.0f));
                                    this.s5[i14] = -((random2.nextFloat() * gl.L(70.0f)) + gl.L(60.0f));
                                    float[] fArr15 = this.v5;
                                    if (z7) {
                                        N = gl.N(f10);
                                        nextFloat = random2.nextFloat();
                                        f15 = 0.8f;
                                    } else {
                                        N = gl.N(1.2f);
                                        nextFloat = random2.nextFloat();
                                        f15 = 1.3f;
                                    }
                                    fArr15[i14] = oo1.e(f15, nextFloat, N);
                                    this.w5[i14] = ug8.e(random2, 0.4f, 0.6f);
                                    this.x5[i14] = 0.0f;
                                    this.y5[i14] = ug8.e(random2, 3.0f, 4.0f);
                                    this.z5[i14] = random2.nextFloat() * 6.2832f;
                                    this.A5[i14] = z7;
                                }
                                zArr[r5] = z6;
                                zArr2 = zArr;
                                i13 = kk7.O3;
                            }
                        }
                    }
                }
                z2 = false;
                if (f40 <= f7) {
                }
                if (z) {
                }
            } else {
                i9 = i5;
                f9 = 36.0f;
                f10 = 1.6f;
            }
            if (!this.U2 && (i10 = this.B5) > 0) {
                RectF rectF4 = this.G1;
                boolean[] zArr3 = this.A5;
                float[] fArr16 = this.z5;
                float[] fArr17 = this.y5;
                float[] fArr18 = this.v5;
                float[] fArr19 = this.u5;
                float[] fArr20 = this.t5;
                float[] fArr21 = this.s5;
                float[] fArr22 = this.w5;
                float[] fArr23 = this.p5;
                float[] fArr24 = this.o5;
                float[] fArr25 = this.x5;
                Paint paint = this.A1;
                float[] fArr26 = this.r5;
                float[] fArr27 = this.q5;
                float f51 = this.Y2 * 0.016667f;
                i11 = i10 - 1;
                while (i11 >= 0) {
                    float f52 = fArr25[i11] + f51;
                    fArr25[i11] = f52;
                    if (f52 >= fArr22[i11]) {
                        fArr = fArr16;
                        int i42 = this.B5 - 1;
                        this.B5 = i42;
                        fArr24[i11] = fArr24[i42];
                        fArr23[i11] = fArr23[i42];
                        fArr27[i11] = fArr27[i42];
                        fArr26[i11] = fArr26[i42];
                        fArr21[i11] = fArr21[i42];
                        fArr20[i11] = fArr20[i42];
                        fArr19[i11] = fArr19[i42];
                        fArr18[i11] = fArr18[i42];
                        fArr22[i11] = fArr22[i42];
                        fArr25[i11] = fArr25[i42];
                        fArr17[i11] = fArr17[i42];
                        fArr[i11] = fArr[i42];
                        zArr3[i11] = zArr3[i42];
                        rectF = rectF4;
                        f11 = f51;
                        fArr2 = fArr17;
                        fArr4 = fArr18;
                        fArr5 = fArr19;
                        fArr6 = fArr20;
                        fArr3 = fArr25;
                    } else {
                        fArr = fArr16;
                        fArr26[i11] = (fArr21[i11] * f51) + fArr26[i11];
                        fArr2 = fArr17;
                        fArr3 = fArr25;
                        fArr27[i11] = yjb.B(f51, f10, 1.0f, fArr27[i11]);
                        fArr26[i11] = yjb.B(f51, 0.8f, 1.0f, fArr26[i11]);
                        fArr24[i11] = (fArr27[i11] * f51) + fArr24[i11];
                        float f53 = (fArr26[i11] * f51) + fArr23[i11];
                        fArr23[i11] = f53;
                        float f54 = fArr24[i11] - fArr20[i11];
                        float f55 = f53 - fArr19[i11];
                        float f56 = (f55 * f55) + (f54 * f54);
                        fArr4 = fArr18;
                        float sqrt = (float) Math.sqrt(f56);
                        float f57 = fArr3[i11] / fArr22[i11];
                        if (f57 < 0.08f) {
                            pow = f57 / 0.08f;
                            f11 = f51;
                            f12 = sqrt;
                        } else {
                            f11 = f51;
                            pow = (float) Math.pow(tb4.x(f57, 0.08f, 0.92f, 1.0f), 0.550000011920929d);
                            f12 = sqrt;
                        }
                        float exp = pow * ((float) Math.exp((-f12) / gl.L(90.0f)));
                        float min3 = (1.0f - (Math.min(1.0f, f12 / gl.L(90.0f)) * 0.4f)) * (fArr4[i11] / 2.0f);
                        float hypot = (float) Math.hypot(fArr27[i11], fArr26[i11]);
                        float f58 = fArr24[i11];
                        float f59 = fArr23[i11];
                        if (hypot > 1.0f) {
                            fArr5 = fArr19;
                            float sin = ((float) Math.sin((fArr3[i11] * fArr2[i11]) + fArr[i11])) * gl.L(3.0f);
                            f58 = b00.A(-fArr26[i11], hypot, sin, f58);
                            f59 = b00.A(fArr27[i11], hypot, sin, f59);
                        } else {
                            fArr5 = fArr19;
                        }
                        float min4 = Math.min(1.0f, Math.max(Math.max(rectF4.left - f58, Math.max(0.0f, f58 - rectF4.right)), Math.max(rectF4.top - f59, Math.max(0.0f, f59 - rectF4.bottom))) / gl.L(f9));
                        paint.setColor(min4 > 0.0f ? hv8.k(min4, i9, -1) : i9);
                        paint.setAlpha((int) (exp * 255.0f));
                        float min5 = Math.min(1.8f, (hypot / gl.L(220.0f)) + 1.0f);
                        canvas2.save();
                        fArr6 = fArr20;
                        rectF = rectF4;
                        canvas2.rotate((float) Math.toDegrees(Math.atan2(fArr26[i11], fArr27[i11])), f58, f59);
                        float f60 = min3 * min5;
                        this.U5.set(f58 - f60, f59 - min3, f60 + f58, f59 + min3);
                        canvas2.drawOval(this.U5, paint);
                        canvas2.restore();
                        if (zArr3[i11]) {
                            paint.setAlpha((int) (exp * f9));
                            canvas2.drawCircle(f58, f59, min3 * 2.2f, paint);
                        }
                    }
                    i11--;
                    f51 = f11;
                    fArr16 = fArr;
                    fArr25 = fArr3;
                    fArr17 = fArr2;
                    fArr18 = fArr4;
                    fArr19 = fArr5;
                    fArr20 = fArr6;
                    rectF4 = rectF;
                    f10 = 1.6f;
                }
                if (this.B5 > 0) {
                    invalidate();
                }
            }
            canvas2.restore();
        }
        f2 = 1.0f;
        i5 = N0;
        f3 = 0.12f;
        f4 = f33;
        currentTimeMillis = Long.MAX_VALUE;
        if (this.U2) {
        }
        if (l < f2) {
        }
        if (w <= 0.004f) {
        }
        canvas2.restore();
        i6 = (int) width;
        textPaint = this.F5;
        staticLayout = this.H5;
        if (staticLayout == null) {
        }
        this.I5 = i6;
        str = this.f;
        if (str == null) {
        }
        String upperCase2 = str.toUpperCase();
        textPaint.setTypeface(gl.n1("fonts/rcondensedbold.ttf"));
        int L22 = i6 - (gl.L(20.0f) << 1);
        this.H5 = null;
        i7 = i2;
        while (i7 <= 2) {
        }
        f8 = R12;
        staticLayout = this.H5;
        staticLayout2 = staticLayout;
        if (staticLayout2 == null) {
        }
        if (!this.U2) {
            RectF rectF42 = this.G1;
            boolean[] zArr32 = this.A5;
            float[] fArr162 = this.z5;
            float[] fArr172 = this.y5;
            float[] fArr182 = this.v5;
            float[] fArr192 = this.u5;
            float[] fArr202 = this.t5;
            float[] fArr212 = this.s5;
            float[] fArr222 = this.w5;
            float[] fArr232 = this.p5;
            float[] fArr242 = this.o5;
            float[] fArr252 = this.x5;
            Paint paint2 = this.A1;
            float[] fArr262 = this.r5;
            float[] fArr272 = this.q5;
            float f512 = this.Y2 * 0.016667f;
            i11 = i10 - 1;
            while (i11 >= 0) {
            }
            if (this.B5 > 0) {
            }
        }
        canvas2.restore();
    }

    public final PorterDuffColorFilter A0(sw8 sw8Var) {
        float[] fArr = lcd.b;
        int i = ((int) (fArr[30] * 10.0f)) ^ (sw8Var.s * 31);
        PorterDuffColorFilter porterDuffColorFilter = this.k4;
        if (porterDuffColorFilter != null && this.l4 == i) {
            return porterDuffColorFilter;
        }
        this.l4 = i;
        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(bm2.f(fArr[30] / 100.0f, sw8Var.s, -1), PorterDuff.Mode.SRC_IN);
        this.k4 = porterDuffColorFilter2;
        return porterDuffColorFilter2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0094, code lost:
    
        if (r0.C0 > 0.001f) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0ab1  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0adc  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0b19  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0bbb  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0af1  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0ab4  */
    /* JADX WARN: Type inference failed for: r58v1 */
    /* JADX WARN: Type inference failed for: r58v2 */
    /* JADX WARN: Type inference failed for: r58v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(Canvas canvas, int i) {
        TextPaint textPaint;
        RectF rectF;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        TextPaint textPaint2;
        float[] fArr;
        float f6;
        float f7;
        boolean z;
        float[] fArr2;
        boolean z2;
        Random random;
        int i2;
        float f8;
        float[] fArr3;
        Paint paint;
        int i3;
        Path path;
        RectF rectF2;
        boolean[] zArr;
        Random random2;
        TextPaint textPaint3;
        float f9;
        float f10;
        float f11;
        Path path2;
        Path path3;
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
        float f12;
        RectF rectF3;
        float f13;
        float f14;
        Paint paint2;
        byte b;
        float f15;
        RectF rectF4;
        float f16;
        float f17;
        float f18;
        float f19;
        TextPaint textPaint4;
        Paint paint3;
        Random random3;
        int i4;
        float e;
        int i5;
        int i6;
        int i7;
        float f20;
        float f21;
        float[] fArr16;
        boolean z3;
        float f22;
        float e2;
        vw8 vw8Var = this;
        Canvas canvas2 = canvas;
        float f23 = vw8Var.D2;
        float f24 = vw8Var.K2;
        float f25 = (1.0f - f24) * f23;
        RectF rectF5 = vw8Var.J5;
        TextPaint textPaint5 = vw8Var.I0;
        RectF rectF6 = vw8Var.G1;
        if (f24 > 0.001f) {
            boolean z4 = f24 < 0.999f;
            if (z4) {
                canvas2.save();
                float f26 = vw8Var.K2;
                f3 = 0.999f;
                f = 2.0f;
                canvas2.scale(f26, f26, i / 2.0f, vw8Var.o());
            } else {
                f3 = 0.999f;
                f = 2.0f;
            }
            float o = vw8Var.o();
            textPaint5.setTextSize(gl.L(11.0f));
            float measureText = textPaint5.measureText(vw8Var.K0) + textPaint5.measureText(vw8Var.J0) + gl.L(11.0f) + gl.L(12.0f) + gl.L(1.0f) + gl.L(11.0f);
            if (!vw8Var.w0) {
                f5 = vw8Var.u2;
                if (f5 > 0.0f) {
                    f4 = 8.0f;
                }
            }
            f4 = 8.0f;
            f5 = gl.L(11.0f) + vw8Var.M0.c() + gl.L(f) + gl.L(12.0f) + gl.L(f4);
            boolean z5 = vw8Var.w0;
            if (!z5 && vw8Var.C0 <= 0.001f) {
                vw8Var.u2 = 0.0f;
            }
            float f27 = vw8Var.C0;
            if (z5) {
                f27 = Math.max(f27, vw8Var.G0 ? 1.0f : 0.0f);
            }
            float R1 = gl.R1(measureText, f5, f27);
            float L = gl.L(22.0f);
            float f28 = (i - R1) / f;
            float f29 = L / f;
            rectF6.set(f28, o - f29, R1 + f28, o + f29);
            rectF5.set(rectF6);
            if (!vw8Var.T5) {
                vw8Var.z6 = true;
                vw8Var.J(canvas2, rectF6, f29, 1.0f);
                vw8Var.z6 = false;
            }
            vw8Var.M(canvas2, 9, rectF6, false);
            RectF rectF7 = vw8Var.K5;
            rectF7.set(rectF6);
            float min = Math.min(0.0f, gl.N(lcd.a[1][8]));
            rectF7.inset(min, min);
            float f30 = f29 - min;
            f2 = f25;
            boolean z6 = vw8Var.r2 > 0 && !vw8Var.w0;
            boolean z7 = vw8Var.t2;
            float[] fArr17 = vw8Var.a1;
            float[] fArr18 = vw8Var.Z0;
            RectF rectF8 = rectF5;
            float[] fArr19 = vw8Var.Y0;
            float[] fArr20 = vw8Var.V0;
            float[] fArr21 = vw8Var.U0;
            float[] fArr22 = vw8Var.S0;
            float[] fArr23 = vw8Var.R0;
            float[] fArr24 = vw8Var.T0;
            float[] fArr25 = vw8Var.Q0;
            float[] fArr26 = vw8Var.P0;
            float[] fArr27 = vw8Var.X0;
            float[] fArr28 = vw8Var.W0;
            float[] fArr29 = vw8Var.O0;
            float[] fArr30 = vw8Var.N0;
            boolean[] zArr2 = vw8Var.c1;
            byte[] bArr = vw8Var.b1;
            float f31 = 0.8f;
            RectF rectF9 = vw8Var.s2;
            Random random4 = vw8Var.f1;
            if (z7) {
                vw8Var.t2 = false;
                float f32 = rectF7.left;
                z2 = 0;
                textPaint2 = textPaint5;
                fArr = fArr18;
                rectF9.set(f32, rectF7.top, (rectF7.width() * vw8Var.C0 * vw8Var.H0) + f32, rectF7.bottom);
                float L2 = gl.L(3.0f);
                float centerX = rectF6.centerX();
                float centerY = rectF6.centerY();
                int max = Math.max(1, (int) (rectF9.width() / L2));
                int max2 = Math.max(1, (int) (rectF9.height() / L2));
                float min2 = Math.min(1.0f, 260.0f / (max * max2));
                int i8 = 0;
                while (i8 < max2) {
                    float f33 = min2;
                    int i9 = 0;
                    while (i9 < max) {
                        if (random4.nextFloat() <= f33) {
                            i6 = max2;
                            f21 = f29;
                            if (vw8Var.d1 >= 320) {
                                i5 = i9;
                                i7 = i8;
                                f20 = L;
                            } else {
                                float nextFloat = ((((random4.nextFloat() - 0.5f) * f31) + i9 + 0.5f) * L2) + rectF9.left;
                                float nextFloat2 = ((((random4.nextFloat() - 0.5f) * f31) + i8 + 0.5f) * L2) + rectF9.top;
                                float height = rectF6.height() / f;
                                if (nextFloat < rectF6.left + height) {
                                    z3 = z6;
                                    fArr16 = fArr17;
                                    i7 = i8;
                                    f20 = L;
                                    if (Math.hypot(nextFloat - r8, nextFloat2 - centerY) > height) {
                                        i5 = i9;
                                        i9 = i5 + 1;
                                        max2 = i6;
                                        f29 = f21;
                                        z6 = z3;
                                        fArr17 = fArr16;
                                        L = f20;
                                        i8 = i7;
                                        f31 = 0.8f;
                                    }
                                } else {
                                    i7 = i8;
                                    f20 = L;
                                    z3 = z6;
                                    fArr16 = fArr17;
                                }
                                float f34 = nextFloat - centerX;
                                float f35 = nextFloat2 - centerY;
                                float max3 = Math.max(1.0f, (float) Math.hypot(f34, f35));
                                float f36 = f34 / max3;
                                float f37 = f35 / max3;
                                float nextFloat3 = (random4.nextFloat() * gl.L(140.0f)) + gl.L(60.0f);
                                boolean z8 = random4.nextFloat() < 0.15f;
                                int i10 = vw8Var.d1;
                                vw8Var.d1 = i10 + 1;
                                bArr[i10] = (byte) (z8 ? 4 : 3);
                                zArr2[i10] = false;
                                fArr30[i10] = nextFloat;
                                fArr29[i10] = nextFloat2;
                                fArr28[i10] = nextFloat;
                                fArr27[i10] = nextFloat2;
                                i5 = i9;
                                fArr26[i10] = ((random4.nextFloat() - 0.5f) * gl.L(60.0f)) + (f36 * nextFloat3);
                                fArr25[i10] = ((random4.nextFloat() - 0.5f) * gl.L(60.0f)) + ((f37 * nextFloat3) - ((random4.nextFloat() * gl.L(80.0f)) + gl.L(40.0f)));
                                if (z8) {
                                    e2 = oo1.e(f31, random4.nextFloat(), gl.N(1.4f));
                                    f22 = 1.0f;
                                } else {
                                    f22 = 1.0f;
                                    e2 = oo1.e(1.2f, random4.nextFloat(), gl.N(1.0f));
                                }
                                fArr24[i10] = e2;
                                fArr23[i10] = ug8.e(random4, 0.3f, 0.35f);
                                fArr22[i10] = 0.0f;
                                fArr21[i10] = f22;
                                fArr20[i10] = 0.0f;
                                fArr19[i10] = 0.0f;
                                fArr[i10] = 0.0f;
                                fArr16[i10] = 0.0f;
                                i9 = i5 + 1;
                                max2 = i6;
                                f29 = f21;
                                z6 = z3;
                                fArr17 = fArr16;
                                L = f20;
                                i8 = i7;
                                f31 = 0.8f;
                            }
                        } else {
                            i5 = i9;
                            i6 = max2;
                            i7 = i8;
                            f20 = L;
                            f21 = f29;
                        }
                        z3 = z6;
                        fArr16 = fArr17;
                        i9 = i5 + 1;
                        max2 = i6;
                        f29 = f21;
                        z6 = z3;
                        fArr17 = fArr16;
                        L = f20;
                        i8 = i7;
                        f31 = 0.8f;
                    }
                    i8++;
                    min2 = f33;
                    L = L;
                    f31 = 0.8f;
                }
                f6 = L;
                f7 = f29;
                z = z6;
                fArr2 = fArr17;
                vw8Var.invalidate();
            } else {
                textPaint2 = textPaint5;
                fArr = fArr18;
                f6 = L;
                f7 = f29;
                z = z6;
                fArr2 = fArr17;
                z2 = 0;
            }
            float f38 = z ? 0.0f : vw8Var.C0 * vw8Var.H0;
            float width = (rectF7.width() * f38) + rectF7.left;
            float l = z ? Utilities.l((AnimationUtils.currentAnimationTimeMillis() - vw8Var.r2) / 80.0f) : 1.0f;
            Paint paint4 = vw8Var.A1;
            Path path4 = vw8Var.F1;
            if (!z || l >= 1.0f) {
                random = random4;
            } else {
                random = random4;
                float l2 = 1.0f - Utilities.l((AnimationUtils.currentAnimationTimeMillis() - vw8Var.r2) / 60.0f);
                canvas2.save();
                path4.rewind();
                path4.addRoundRect(rectF7, f30, f30, Path.Direction.CW);
                canvas2.clipPath(path4);
                canvas2.clipRect(rectF9);
                if (l2 > 0.0f) {
                    paint4.setColor(-134217729);
                    paint4.setAlpha((int) (l2 * 247.0f));
                    canvas2.drawRect(rectF9, paint4);
                }
                vw8Var.G(canvas2, rectF6, a(1.0f - l, vw8Var.n != null ? vw8Var.N0() : -16777216));
                canvas2.restore();
                vw8Var.invalidate();
            }
            boolean z9 = vw8Var.w0;
            boolean z10 = (z9 && vw8Var.G0 && vw8Var.x0 && f38 < f3) ? true : z2;
            RectF rectF10 = rectF6;
            float elapsedRealtime = (SystemClock.elapsedRealtime() % 100000) / 1000.0f;
            float f39 = 6.0f;
            float f40 = f38;
            vw8Var.N5 = gl.N((!z9 || vw8Var.G0) ? z2 : true ? 5.0f : 2.2f) * Utilities.l((rectF7.right - width) / gl.L(6.0f)) * Utilities.l((width - rectF7.left) / gl.L(6.0f));
            float L3 = rectF10.top - gl.L(4.0f);
            float L4 = rectF10.bottom + gl.L(4.0f);
            float f41 = L4 - L3;
            int i11 = z2;
            while (true) {
                i2 = 7;
                f8 = l;
                fArr3 = vw8Var.M5;
                if (i11 >= 7) {
                    break;
                }
                float f42 = 5.1f * elapsedRealtime;
                float f43 = i11;
                fArr3[i11] = (((float) ((Math.sin((f43 * 2.9f) + (8.3f * elapsedRealtime)) * 0.4000000059604645d) + (Math.sin((1.7f * f43) + f42) * 0.6000000238418579d))) * vw8Var.N5) + width;
                i11++;
                l = f8;
                z10 = z10;
            }
            boolean z11 = z10;
            Path path5 = vw8Var.L5;
            path5.rewind();
            path5.moveTo(rectF10.left - gl.L(f4), L3);
            path5.lineTo(fArr3[z2], L3);
            int i12 = 1;
            while (i12 < i2) {
                int i13 = i12 - 1;
                float f44 = i13;
                float f45 = f39;
                float d = ls6.d(f41, f44, f45, L3);
                float d2 = ls6.d(f41, i12, f45, L3);
                float f46 = fArr3[i13];
                path5.quadTo(f46, d, (f46 + fArr3[i12]) / f, (d2 + d) / f);
                i12++;
                L3 = L3;
                i2 = 7;
                f39 = 6.0f;
            }
            path5.lineTo(fArr3[6], L4);
            path5.lineTo(rectF10.left - gl.L(f4), L4);
            path5.close();
            if (vw8Var.N5 > 0.01f) {
                vw8Var.invalidate();
            }
            int i14 = (f40 > 0.001f ? 1 : (f40 == 0.001f ? 0 : -1));
            Path path6 = vw8Var.S5;
            if (i14 > 0) {
                canvas2.save();
                path4.rewind();
                path4.addRoundRect(rectF7, f30, f30, Path.Direction.CW);
                canvas2.clipPath(path4);
                canvas2.clipPath(path5);
                paint4.setColor(-134217729);
                if (z11) {
                    path6.rewind();
                    float L5 = rectF7.top - gl.L(f);
                    float L6 = rectF7.bottom + gl.L(f);
                    float N = gl.N(0.75f);
                    f10 = 20.0f;
                    path6.moveTo(rectF7.left - gl.L(4.0f), L5);
                    while (true) {
                        float min3 = Math.min(L5, L6);
                        path6.lineTo(s1(min3, width, rectF7.top) + width, min3);
                        if (min3 >= L6) {
                            break;
                        } else {
                            L5 += N;
                        }
                    }
                    path6.lineTo(rectF7.left - gl.L(4.0f), L6);
                    path6.close();
                    canvas2.drawPath(path6, paint4);
                    textPaint4 = textPaint2;
                } else {
                    f10 = 20.0f;
                    textPaint4 = textPaint2;
                    canvas2.drawRect(rectF7.left, rectF7.top, vw8Var.N5 + width, rectF7.bottom, paint4);
                }
                if (z11 || (vw8Var.w0 && !vw8Var.G0)) {
                    float L7 = gl.L(23.0f);
                    Matrix matrix = vw8Var.P5;
                    matrix.setScale(L7, 1.0f);
                    matrix.postTranslate(width - gl.L(22.0f), 0.0f);
                    LinearGradient linearGradient = vw8Var.Q5;
                    linearGradient.setLocalMatrix(matrix);
                    paint4.setShader(linearGradient);
                    canvas.drawRect(width - gl.L(22.0f), rectF7.top, width + gl.L(1.0f), rectF7.bottom, paint4);
                    paint3 = paint4;
                    paint3.setShader(null);
                } else {
                    paint3 = paint4;
                }
                canvas.restore();
                float f47 = vw8Var.Y2 * 0.016667f;
                float currentTimeMillis = z11 ? 1.2f : ((vw8Var.p2 + 250) - System.currentTimeMillis()) / 1000.0f;
                if (z11) {
                    int floor = (int) Math.floor(random.nextFloat() + (110.0f * f47));
                    int i15 = z2;
                    while (i15 < floor) {
                        Random random5 = random;
                        float f48 = f6;
                        float e3 = ug8.e(random5, f48, rectF10.top);
                        boolean[] zArr3 = zArr2;
                        float[] fArr31 = fArr30;
                        float[] fArr32 = fArr29;
                        float[] fArr33 = fArr28;
                        float[] fArr34 = fArr27;
                        float[] fArr35 = fArr26;
                        float[] fArr36 = fArr25;
                        float[] fArr37 = fArr24;
                        q((random5.nextFloat() * gl.L(3.0f)) + s1(e3, width, rectF7.top) + width, e3, (random5.nextFloat() * gl.L(f10)) + gl.L(10.0f), -((random5.nextFloat() * gl.L(10.0f)) + gl.L(4.0f)), 0.0f, oo1.e(0.7f, random5.nextFloat(), gl.N(0.8f)), ug8.e(random5, 0.25f, 0.25f), ug8.e(random5, 0.1f, 0.9f), false, false);
                        i15++;
                        rectF7 = rectF7;
                        f6 = f48;
                        rectF10 = rectF10;
                        i14 = i14;
                        path5 = path5;
                        path6 = path6;
                        floor = floor;
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
                        random = random5;
                        paint3 = paint3;
                        rectF8 = rectF8;
                    }
                    paint = paint3;
                    i3 = i14;
                    path = path5;
                    textPaint3 = textPaint4;
                    rectF2 = rectF8;
                    zArr = zArr2;
                    random3 = random;
                    f9 = f7;
                    float f49 = f6;
                    f11 = 0.12f;
                    path2 = path4;
                    path3 = path6;
                    RectF rectF11 = rectF7;
                    rectF = rectF10;
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
                    int floor2 = (int) Math.floor(random3.nextFloat() + (f47 * 70.0f));
                    int i16 = z2;
                    while (i16 < floor2) {
                        boolean z12 = random3.nextFloat() < 0.12f ? true : z2;
                        Random random6 = random3;
                        float e4 = ug8.e(random6, f49, rectF.top);
                        float nextFloat4 = (random6.nextFloat() * gl.L(10.0f)) + s1(e4, width, rectF11.top) + width + gl.L(f);
                        float nextFloat5 = (random6.nextFloat() * gl.L(70.0f)) + gl.L(40.0f);
                        float f50 = -((random6.nextFloat() * gl.L(30.0f)) + gl.L(10.0f));
                        float f51 = -((random6.nextFloat() * gl.L(34.0f)) + gl.L(26.0f));
                        if (z12) {
                            i4 = floor2;
                            e = oo1.e(0.8f, random6.nextFloat(), gl.N(1.4f));
                        } else {
                            i4 = floor2;
                            e = oo1.e(1.1f, random6.nextFloat(), gl.N(0.9f));
                        }
                        random3 = random6;
                        q(nextFloat4, e4, nextFloat5, f50, f51, e, ug8.e(random6, 0.7f, 0.6f), 1.0f, z12, true);
                        i16++;
                        floor2 = i4;
                    }
                    vw8Var = this;
                } else {
                    paint = paint3;
                    i3 = i14;
                    path = path5;
                    textPaint3 = textPaint4;
                    rectF2 = rectF8;
                    zArr = zArr2;
                    random3 = random;
                    f9 = f7;
                    float f52 = f6;
                    f11 = 0.12f;
                    path2 = path4;
                    path3 = path6;
                    rectF = rectF10;
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
                    int floor3 = (int) Math.floor(random3.nextFloat() + (((!vw8Var.w0 || vw8Var.G0) ? 0.0f : 260.0f) * f47));
                    for (int i17 = z2; i17 < floor3; i17++) {
                        vw8Var.p(width, ug8.e(random3, f52, rectF.top), currentTimeMillis);
                    }
                }
                random2 = random3;
            } else {
                paint = paint4;
                rectF = rectF10;
                i3 = i14;
                path = path5;
                rectF2 = rectF8;
                zArr = zArr2;
                random2 = random;
                textPaint3 = textPaint2;
                f9 = f7;
                f10 = 20.0f;
                f11 = 0.12f;
                path2 = path4;
                path3 = path6;
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
            }
            int N0 = vw8Var.n != null ? vw8Var.N0() : -16777216;
            canvas.save();
            path2.rewind();
            Path path7 = path2;
            path7.addRoundRect(rectF, f9, f9, Path.Direction.CW);
            canvas2 = canvas;
            canvas2.clipPath(path7);
            if (i3 > 0) {
                yz.d(canvas2, z11 ? path3 : path);
            }
            if (vw8Var.w0 && vw8Var.G0) {
                vw8Var.G(canvas2, rectF, -218103809);
                textPaint = textPaint3;
            } else {
                int a = a(z ? f8 : 1.0f - Utilities.l(vw8Var.C0 * 1.25f), -218103809);
                float centerY2 = rectF.centerY();
                float L8 = gl.L(12.0f);
                float L10 = rectF.left + gl.L(11.0f);
                textPaint = textPaint3;
                textPaint.setColor(a);
                canvas2.drawText(vw8Var.J0, L10, gl.L(4.0f) + centerY2, textPaint);
                float measureText2 = textPaint.measureText(vw8Var.J0) + L10;
                vw8Var.O(measureText2, centerY2, L8, a, canvas, false);
                canvas2 = canvas;
                textPaint.setColor(a);
                canvas2.drawText(vw8Var.K0, measureText2 + L8 + gl.L(1.0f), centerY2 + gl.L(4.0f), textPaint);
            }
            canvas2.restore();
            if (i3 > 0) {
                canvas2.save();
                canvas2.clipPath(z11 ? path3 : path);
                vw8Var.G(canvas2, rectF, N0);
                canvas2.restore();
            }
            if (vw8Var.e1) {
                vw8Var.e1 = z2;
                for (int i18 = 0; i18 < 24; i18++) {
                    vw8Var.p((rectF.width() * random2.nextFloat() * 0.4f) + rectF.left, (rectF.height() * random2.nextFloat()) + rectF.top, 0.5f);
                }
            }
            float f53 = 0.5f;
            float f54 = vw8Var.Y2 * 0.016667f;
            RectF rectF12 = rectF2;
            float L11 = rectF12.top - gl.L(40.0f);
            float L12 = rectF12.top - gl.L(48.0f);
            int i19 = vw8Var.d1 - 1;
            while (i19 >= 0) {
                float f55 = fArr12[i19] + f54;
                fArr12[i19] = f55;
                if (f55 >= fArr11[i19]) {
                    int i20 = vw8Var.d1 - 1;
                    vw8Var.d1 = i20;
                    fArr4[i19] = fArr4[i20];
                    fArr5[i19] = fArr5[i20];
                    fArr8[i19] = fArr8[i20];
                    fArr9[i19] = fArr9[i20];
                    fArr11[i19] = fArr11[i20];
                    fArr12[i19] = fArr12[i20];
                    fArr10[i19] = fArr10[i20];
                    fArr13[i19] = fArr13[i20];
                    fArr14[i19] = fArr14[i20];
                    bArr[i19] = bArr[i20];
                    zArr[i19] = zArr[i20];
                    fArr6[i19] = fArr6[i20];
                    fArr7[i19] = fArr7[i20];
                    fArr15[i19] = fArr15[i20];
                    fArr[i19] = fArr[i20];
                    fArr2[i19] = fArr2[i20];
                    f15 = f54;
                    f12 = f53;
                    rectF4 = rectF12;
                    f16 = L11;
                    f17 = L12;
                    paint2 = paint;
                } else {
                    if (bArr[i19] >= 3) {
                        float f56 = 1.0f - (2.4f * f54);
                        fArr8[i19] = fArr8[i19] * f56;
                        float f57 = fArr9[i19] * f56;
                        fArr9[i19] = f57;
                        if (fArr12[i19] > f11) {
                            fArr9[i19] = (gl.L(120.0f) * f54) + f57;
                        }
                        if (fArr5[i19] < rectF12.top - gl.L(70.0f)) {
                            fArr9[i19] = fArr9[i19] * 0.85f;
                        }
                    } else {
                        if (zArr[i19]) {
                            fArr9[i19] = (fArr15[i19] * f54) + fArr9[i19];
                            fArr8[i19] = yjb.B(f54, 1.6f, 1.0f, fArr8[i19]);
                            float B = yjb.B(f54, 0.8f, 1.0f, fArr9[i19]);
                            fArr9[i19] = B;
                            if (fArr5[i19] < L12) {
                                f12 = f53;
                                rectF3 = rectF12;
                                fArr9[i19] = B * ((float) Math.pow(0.8999999761581421d, vw8Var.Y2));
                            }
                        } else {
                            f12 = f53;
                            rectF3 = rectF12;
                            fArr9[i19] = fArr9[i19] - (gl.L(f10) * f54);
                            float f58 = 1.0f - (f54 * 3.0f);
                            fArr8[i19] = fArr8[i19] * f58;
                            float f59 = fArr9[i19] * f58;
                            fArr9[i19] = f59;
                            if (fArr5[i19] < L11) {
                                fArr9[i19] = f59 * 0.85f;
                            }
                        }
                        fArr4[i19] = (fArr8[i19] * f54) + fArr4[i19];
                        fArr5[i19] = (fArr9[i19] * f54) + fArr5[i19];
                        float f60 = fArr12[i19] / fArr11[i19];
                        float pow = f60 >= f11 ? f60 / f11 : (float) Math.pow(tb4.x(f60, f11, 0.88f, 1.0f), zArr[i19] ? 0.550000011920929d : 0.699999988079071d);
                        f13 = fArr5[i19];
                        if (f13 >= L11) {
                            f14 = 1.0f;
                            pow *= Math.max(0.0f, 1.0f - ((L11 - f13) / gl.L(24.0f)));
                        } else {
                            f14 = 1.0f;
                        }
                        float f61 = ((f14 - (f60 * f12)) * fArr10[i19]) / f;
                        paint2 = paint;
                        paint2.setColor(-1);
                        paint2.setAlpha((int) (pow * 255.0f));
                        b = bArr[i19];
                        RectF rectF13 = vw8Var.U5;
                        if (b < 3) {
                            f15 = f54;
                            float f62 = f;
                            float z13 = ls6.z((float) Math.hypot(fArr8[i19], fArr9[i19]), gl.L(200.0f), 1.0f, f62);
                            float f63 = ((1.0f - (f60 * 0.4f)) * fArr10[i19]) / f62;
                            rectF4 = rectF3;
                            if (fArr5[i19] < rectF4.top - gl.L(70.0f)) {
                                pow *= Math.max(0.0f, 1.0f - (((rectF4.top - gl.L(70.0f)) - fArr5[i19]) / gl.L(16.0f)));
                            }
                            paint2.setAlpha((int) (pow * 255.0f));
                            canvas2.save();
                            float f64 = pow;
                            f16 = L11;
                            canvas2.rotate((float) Math.toDegrees(Math.atan2(fArr9[i19], fArr8[i19])), fArr4[i19], fArr5[i19]);
                            float f65 = fArr4[i19];
                            float f66 = f63 * z13;
                            float f67 = fArr5[i19];
                            rectF13.set(f65 - f66, f67 - f63, f65 + f66, f67 + f63);
                            canvas2.drawOval(rectF13, paint2);
                            canvas2.restore();
                            if (bArr[i19] == 4) {
                                paint2.setAlpha((int) (f64 * 36.0f));
                                canvas2.drawCircle(fArr4[i19], fArr5[i19], f63 * 2.2f, paint2);
                            }
                            f17 = L12;
                        } else {
                            f15 = f54;
                            rectF4 = rectF3;
                            f16 = L11;
                            if (zArr[i19]) {
                                float f68 = fArr4[i19] - fArr6[i19];
                                float f69 = fArr5[i19] - fArr7[i19];
                                float sqrt = (float) Math.sqrt((f69 * f69) + (f68 * f68));
                                float f70 = fArr12[i19] / fArr11[i19];
                                float exp = fArr13[i19] * ((float) Math.exp((-sqrt) / gl.L(44.0f))) * (f70 < 0.08f ? f70 / 0.08f : (float) Math.pow(tb4.x(f70, 0.08f, 0.92f, 1.0f), 0.550000011920929d));
                                float f71 = fArr5[i19];
                                if (f71 < L12) {
                                    f18 = 1.0f;
                                    exp *= Math.max(0.0f, 1.0f - ((L12 - f71) / gl.L(16.0f)));
                                } else {
                                    f18 = 1.0f;
                                }
                                float min4 = (f18 - (Math.min(f18, sqrt / gl.L(70.0f)) * 0.4f)) * (fArr10[i19] / f);
                                float hypot = (float) Math.hypot(fArr8[i19], fArr9[i19]);
                                float f72 = fArr4[i19];
                                float f73 = fArr5[i19];
                                if (fArr[i19] <= 0.0f || hypot <= 1.0f) {
                                    f19 = exp;
                                    f17 = L12;
                                } else {
                                    f19 = exp;
                                    f17 = L12;
                                    float L13 = gl.L(3.0f) * ((float) Math.sin((fArr12[i19] * fArr[i19]) + fArr2[i19]));
                                    f72 = b00.A(-fArr9[i19], hypot, L13, f72);
                                    f73 = b00.A(fArr8[i19], hypot, L13, f73);
                                }
                                paint2.setAlpha((int) (f19 * 255.0f));
                                float min5 = Math.min(1.8f, (hypot / gl.L(220.0f)) + 1.0f);
                                canvas2.save();
                                canvas2.rotate((float) Math.toDegrees(Math.atan2(fArr9[i19], fArr8[i19])), f72, f73);
                                float f74 = min4 * min5;
                                rectF13.set(f72 - f74, f73 - min4, f74 + f72, f73 + min4);
                                canvas2.drawOval(rectF13, paint2);
                                canvas2.restore();
                                if (bArr[i19] == 1) {
                                    paint2.setAlpha((int) (f19 * 36.0f));
                                    canvas2.drawCircle(f72, f73, min4 * 2.2f, paint2);
                                }
                            } else {
                                f17 = L12;
                                canvas2.drawCircle(fArr4[i19], fArr5[i19], b == 1 ? f61 * f : f61, paint2);
                                if (bArr[i19] == 1) {
                                    paint2.setAlpha((int) (pow * 36.0f));
                                    canvas2.drawCircle(fArr4[i19], fArr5[i19], f61 * 4.4f, paint2);
                                }
                            }
                        }
                    }
                    f12 = f53;
                    rectF3 = rectF12;
                    fArr4[i19] = (fArr8[i19] * f54) + fArr4[i19];
                    fArr5[i19] = (fArr9[i19] * f54) + fArr5[i19];
                    float f602 = fArr12[i19] / fArr11[i19];
                    if (f602 >= f11) {
                    }
                    f13 = fArr5[i19];
                    if (f13 >= L11) {
                    }
                    float f612 = ((f14 - (f602 * f12)) * fArr10[i19]) / f;
                    paint2 = paint;
                    paint2.setColor(-1);
                    paint2.setAlpha((int) (pow * 255.0f));
                    b = bArr[i19];
                    RectF rectF132 = vw8Var.U5;
                    if (b < 3) {
                    }
                }
                i19--;
                rectF12 = rectF4;
                paint = paint2;
                L12 = f17;
                L11 = f16;
                f54 = f15;
                f53 = f12;
                f11 = 0.12f;
            }
            if (z4) {
                canvas2.restore();
            }
        } else {
            textPaint = textPaint5;
            rectF = rectF6;
            f = 2.0f;
            f2 = f25;
            rectF5.setEmpty();
        }
        if (f2 > 0.001f) {
            long currentTimeMillis2 = System.currentTimeMillis();
            long j = vw8Var.H2;
            long max4 = j > 0 ? Math.max(0L, (j - (currentTimeMillis2 / 1000)) - 1) : -1L;
            if (max4 != vw8Var.O2) {
                vw8Var.O2 = max4;
                vw8Var.P2 = max4 >= 0 ? k96.a0(null, null, 2131746298, String.format(Locale.US, "%d:%02d", Long.valueOf(max4 / 60), Long.valueOf(max4 % 60))) : k96.M0(2131746305, null);
            }
            String str = vw8Var.P2;
            textPaint.setTextSize(gl.L(11.0f));
            float measureText3 = textPaint.measureText(str) + gl.L(11.0f) + gl.L(11.0f);
            float L14 = gl.L(22.0f);
            float o2 = vw8Var.o();
            float f75 = i;
            float f76 = L14 / f;
            rectF.set((f75 - measureText3) / f, o2 - f76, (f75 + measureText3) / f, o2 + f76);
            vw8Var.z6 = true;
            float f77 = f2;
            vw8Var.J(canvas2, rectF, f76, f77);
            vw8Var.z6 = false;
            textPaint.setColor(a(f77, -218103809));
            canvas2.drawText(str, rectF.left + gl.L(11.0f), o2 + gl.L(4.0f), textPaint);
            if (vw8Var.H2 > 0) {
                vw8Var.postInvalidateDelayed(1005 - (currentTimeMillis2 % 1000));
            }
        }
    }

    public final void B0() {
        z24 z24Var;
        kw8 kw8Var;
        if (this.f2 || (z24Var = this.c) == null || (kw8Var = ((gw8) z24Var.b).e) == null) {
            return;
        }
        kw8Var.j();
    }

    public final void C(Canvas canvas, Path path, RectF rectF, float f, float f2) {
        int i;
        RectF rectF2;
        float f3;
        float[][] fArr;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        int i2;
        int i3;
        Path path2 = path;
        int i4 = 1;
        if (path2 == null) {
            if (uv8.a(f, f2, this.z6 ? 1 : this.A6 ? 2 : 0, canvas, rectF)) {
                return;
            }
        }
        int i5 = this.B6;
        SweepGradient[] sweepGradientArr = this.C6;
        int i6 = 4;
        float[][] fArr2 = lcd.a;
        if (i5 != 1) {
            this.B6 = 1;
            int i7 = 0;
            while (i7 < i6) {
                float[] fArr3 = fArr2[i7];
                int i8 = i6;
                int[] iArr = new int[73];
                int i9 = i4;
                float[] fArr4 = new float[73];
                int i10 = 0;
                for (int i11 = 73; i10 < i11; i11 = 73) {
                    int i12 = i7;
                    double radians = Math.toRadians(i10 * 5);
                    float pow = (float) Math.pow(Math.abs(Math.cos(radians)), fArr3[6]);
                    float f11 = (((float) Math.sin(radians)) < 0.0f ? fArr3[11] : fArr3[12]) / 100.0f;
                    iArr[i10] = g(Math.min(1.0f, (((fArr3[5] / 100.0f) - f11) * pow) + f11), 0);
                    fArr4[i10] = i10 / 72.0f;
                    i10++;
                    i7 = i12;
                }
                int i13 = i7;
                sweepGradientArr[i13] = new SweepGradient(0.0f, 0.0f, iArr, fArr4);
                i7 = i13 + 1;
                i6 = i8;
                i4 = i9;
            }
        }
        int i14 = i4;
        int i15 = i6;
        int i16 = this.z6 ? i14 : this.A6 ? 2 : 0;
        float[] fArr5 = fArr2[i16];
        float f12 = this.D6;
        float[] fArr6 = lcd.b;
        float f13 = f12 * fArr6[0];
        float f14 = (this.E6 * fArr6[i14]) / 100.0f;
        float N = gl.N(fArr5[8]);
        if (N != 0.0f) {
            rectF2 = this.c7;
            rectF2.set(rectF);
            rectF2.inset(N, N);
            if (path2 != null) {
                float width = rectF2.width() / Math.max(1.0f, rectF.width());
                float height = rectF2.height() / Math.max(1.0f, rectF.height());
                float centerX = rectF.centerX();
                float centerY = rectF.centerY();
                i = i16;
                Matrix matrix = this.W6;
                matrix.setScale(width, height, centerX, centerY);
                Path path3 = this.X6;
                path2.transform(matrix, path3);
                path2 = path3;
            } else {
                i = i16;
            }
            f3 = Math.max(0.0f, f - N);
        } else {
            i = i16;
            rectF2 = rectF;
            f3 = f;
        }
        Matrix matrix2 = this.d7;
        matrix2.setRotate(f13);
        matrix2.postScale(rectF2.width() / Math.max(1.0f, rectF2.height()), 1.0f);
        matrix2.postTranslate(rectF2.centerX(), rectF2.centerY());
        float N2 = gl.N(fArr5[i15]);
        if (N2 > 0.05f) {
            SweepGradient sweepGradient = sweepGradientArr[i];
            sweepGradient.setLocalMatrix(matrix2);
            Paint paint = this.B1;
            paint.setShader(sweepGradient);
            paint.setColor(-1);
            paint.setAlpha((int) (f2 * 255.0f));
            if (path2 == null) {
                paint.setStrokeWidth(N2);
                RectF rectF3 = this.V5;
                rectF3.set(rectF2);
                float f15 = (-N2) / 2.0f;
                rectF3.inset(f15, f15);
                float f16 = (N2 / 2.0f) + f3;
                canvas.drawRoundRect(rectF3, f16, f16, paint);
            } else {
                canvas.save();
                yz.d(canvas, path2);
                paint.setStrokeWidth(N2 * 2.0f);
                canvas.drawPath(path2, paint);
                canvas.restore();
            }
            paint.setShader(null);
            paint.setAlpha(kk7.d4);
        }
        double radians2 = Math.toRadians(f13);
        float f17 = (float) (-Math.sin(radians2));
        float cos = (float) Math.cos(radians2);
        float N3 = gl.N(fArr5[0]);
        float N4 = gl.N(fArr5[2]);
        float f18 = this.A6 ? 0.0f : this.b6 * ((fArr6[21] * 1.25f) / 100.0f);
        if (f18 <= 0.0f || !this.z3) {
            fArr = fArr2;
            f4 = 0.0f;
        } else {
            fArr = fArr2;
            f4 = c1(rectF2.centerX(), rectF2.top, getWidth(), getHeight());
        }
        float c1 = (f18 <= 0.0f || !this.z3) ? 0.0f : c1(rectF2.centerX(), rectF2.bottom, getWidth(), getHeight());
        float min = Math.min(1.0f, ((f4 * f18) + 1.0f) * (f14 + 1.0f) * (fArr5[i14] / 100.0f));
        float min2 = Math.min(1.0f, ((f18 * c1) + 1.0f) * (1.0f - f14) * (fArr5[3] / 100.0f));
        int i17 = Build.VERSION.SDK_INT >= 29 ? i14 : 0;
        int i18 = 0;
        for (int i19 = 2; i18 < i19; i19 = 2) {
            if (i18 == 0) {
                f6 = min;
                f5 = N3;
            } else {
                f5 = -N4;
                f6 = min2;
            }
            if (f6 <= 0.004f || Math.abs(f5) < 0.1f) {
                f7 = f3;
                f8 = min;
                f9 = min2;
                f10 = f17;
                i2 = i17;
                i3 = i14;
            } else {
                canvas.save();
                Path path4 = this.Z6;
                f8 = min;
                Path path5 = this.a7;
                if (path2 == null) {
                    f9 = min2;
                    f10 = f17;
                    float min3 = Math.min(f3, Math.min(rectF2.width(), rectF2.height()) / 2.0f);
                    path4.rewind();
                    Path.Direction direction = Path.Direction.CW;
                    path4.addRoundRect(rectF2, min3, min3, direction);
                    f7 = f3;
                    RectF rectF4 = this.Y6;
                    rectF4.set(rectF2);
                    i2 = i17;
                    rectF4.offset(f10 * f5, f5 * cos);
                    path5.rewind();
                    path5.addRoundRect(rectF4, min3, min3, direction);
                } else {
                    f7 = f3;
                    f9 = min2;
                    f10 = f17;
                    i2 = i17;
                    path4.set(path2);
                    path5.set(path2);
                    path5.offset(f10 * f5, f5 * cos);
                }
                yz.d(canvas, path5);
                Paint paint2 = this.A1;
                if (i2 == 0) {
                    float f19 = fArr[i][10];
                    int i20 = this.b7;
                    paint2.setColor(Color.rgb(Math.max(0, Math.min(kk7.d4, Math.round(((Color.red(i20) - kk7.d4) * f19) + 255.0f))), Math.max(0, Math.min(kk7.d4, Math.round(((Color.green(i20) - kk7.d4) * f19) + 255.0f))), Math.max(0, Math.min(kk7.d4, Math.round(((Color.blue(i20) - kk7.d4) * f19) + 255.0f)))));
                    paint2.setAlpha((int) (f6 * 255.0f * f2));
                    i3 = i14;
                } else {
                    int round = Math.round(Math.max(0.0f, Math.min(1.0f, f6)) * 255.0f);
                    paint2.setColor((round << 16) | (-16777216) | (round << 8) | round);
                    paint2.setAlpha((int) (f2 * 255.0f));
                    i3 = i14;
                    yz.u(i3, paint2);
                }
                canvas.drawPath(path4, paint2);
                if (i2 != 0) {
                    yz.u(0, paint2);
                }
                canvas.restore();
            }
            i18++;
            i14 = i3;
            min = f8;
            min2 = f9;
            f17 = f10;
            f3 = f7;
            i17 = i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        if (r8 != false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(Canvas canvas, sw8 sw8Var, int i, float f, float f2, float f3, float f4, float f5) {
        float f6;
        Drawable drawable = sw8Var.b[i];
        if (drawable == null || f4 <= 0.01f) {
            return;
        }
        boolean z = drawable instanceof vl;
        Bitmap V = z ? V((vl) drawable) : null;
        boolean z2 = false;
        if (!z ? !(drawable instanceof ru3) || ((ru3) drawable).a() : V != null) {
            z2 = true;
        }
        long[] jArr = sw8Var.y;
        if (!this.U2) {
            if (jArr != null && i < jArr.length) {
                if (jArr[i] != 1) {
                    if (this.S4) {
                        if (z2) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (jArr[i] == 0) {
                                jArr[i] = elapsedRealtime;
                            }
                            f6 = Utilities.l(((elapsedRealtime - jArr[i]) - b(f5)) / 380.0f);
                        }
                    } else if (this.W2 && z2) {
                        jArr[i] = 1;
                    }
                }
                if (f6 > 0.0f) {
                    float z3 = yjb.z((float) Math.sin((this.N3 * 1.3f) + f3), 0.03f, 1.0f, (this.p0 + 1.0f) * (f6 < 1.0f ? h(f6) : 1.0f) * f4 * this.m0);
                    int round = Math.round(f / 2.0f);
                    if (V == null) {
                        canvas.save();
                        canvas.translate(this.K3, this.L3);
                        canvas.rotate(f2 + this.o0);
                        canvas.scale(z3, z3);
                        int i2 = -round;
                        drawable.setBounds(i2, i2, round, round);
                        drawable.setAlpha((int) (this.n0 * 255.0f));
                        if (sv8.d(drawable)) {
                            sv8.b(canvas, drawable);
                        } else {
                            drawable.draw(canvas);
                        }
                        drawable.setAlpha(kk7.d4);
                        canvas.restore();
                        return;
                    }
                    float f7 = round * z3;
                    canvas.save();
                    canvas.translate(this.K3, this.L3);
                    canvas.rotate(f2 + this.o0);
                    float f8 = -f7;
                    RectF rectF = this.P4;
                    rectF.set(f8, f8, f7, f7);
                    boolean d = sv8.d(drawable);
                    float f9 = this.n0 * 255.0f;
                    if (d) {
                        Paint paint = this.O4;
                        paint.setAlpha((int) f9);
                        canvas.drawBitmap(V, (Rect) null, rectF, paint);
                    } else {
                        Paint paint2 = this.N4;
                        paint2.setAlpha((int) f9);
                        canvas.drawBitmap(V, (Rect) null, rectF, paint2);
                    }
                    canvas.restore();
                    return;
                }
                return;
            }
            f6 = 0.0f;
            if (f6 > 0.0f) {
            }
        }
        f6 = 1.0f;
        if (f6 > 0.0f) {
        }
    }

    public final void E(Canvas canvas, int i, int i2, sw8 sw8Var, sw8 sw8Var2, float f, boolean z, boolean z2) {
        float f2;
        int i3;
        float f3;
        boolean z3;
        float f4;
        float f5;
        int i4;
        int i5;
        vw8 vw8Var = this;
        sw8 sw8Var3 = sw8Var;
        sw8 sw8Var4 = sw8Var2;
        vw8Var.X(sw8Var3);
        vw8Var.X(sw8Var4);
        float L = gl.L(86.0f);
        float L2 = gl.L(70.0f);
        float L3 = gl.L(90.0f) * 1.3f;
        float f6 = vw8Var.L + vw8Var.O;
        float f7 = vw8Var.M + vw8Var.P;
        float f8 = -L3;
        boolean z4 = true;
        int floor = ((int) Math.floor((f8 - f7) / L2)) - 1;
        int ceil = ((int) Math.ceil(((i2 + L3) - f7) / L2)) + 1;
        int i6 = floor;
        while (i6 <= ceil) {
            int i7 = i6 & 1;
            float f9 = i7 == 0 ? 0.0f : L / 2.0f;
            boolean z5 = z4;
            int floor2 = ((int) Math.floor(((f8 - f6) - f9) / L)) - 1;
            int i8 = i;
            float f10 = L3;
            int ceil2 = ((int) Math.ceil((((i8 + L3) - f6) - f9) / L)) + 1;
            while (floor2 <= ceil2) {
                float f11 = L2;
                int i9 = ceil2;
                double u0 = u0(i6, floor2);
                if (c0(53.1d * u0) < 0.2f) {
                    f2 = f6;
                    i5 = floor2;
                    i3 = ceil;
                    i4 = i6;
                    f4 = f9;
                    f3 = L;
                    z3 = z5;
                    f5 = f8;
                } else {
                    vw8Var.G0(u0, 3.0f, 10.0f);
                    float f12 = f8;
                    float f13 = (float) (2.0d * u0 * 3.141592653589793d);
                    f2 = f6;
                    float i10 = vw8Var.L4 + ir2.i(floor2, L, f9, f6);
                    float sin = (((float) Math.sin((vw8Var.N3 * 0.45f) + f13)) * gl.L(3.0f)) + (i6 * f11) + f7 + vw8Var.M4;
                    boolean z6 = i7 == 0 ? z5 : false;
                    i3 = ceil;
                    float f14 = (float) u0;
                    float z7 = yjb.z(f14, 0.16f, 0.92f, gl.L(38.0f) * (z6 ? 1.3f : 0.9f));
                    f3 = L;
                    z3 = z5;
                    f4 = f9;
                    f5 = f12;
                    int i11 = floor2;
                    i4 = i6;
                    i5 = i11;
                    if (J0(i10, sin, z7, i8, i2, 0, i6, i11, (Math.max(0.0f, (z7 / gl.L(24.0f)) - 1.0f) * 0.8f) + 1.0f)) {
                        if (z6) {
                            z7 *= 0.9f;
                        }
                        float f15 = z7;
                        float sin2 = (((float) Math.sin((this.N3 * 0.3f) + f13)) * 4.0f) + ((f14 - 0.5f) * 26.0f);
                        float c0 = c0(59.3d * u0) * 0.3f;
                        int i12 = (i5 - ((i4 - i7) / 2)) - i4;
                        int length = sw8Var4.b.length;
                        int i13 = ((i12 % length) + length) % length;
                        float c02 = c0(71.9d * u0);
                        if (sw8Var3 == null) {
                            D(canvas, sw8Var4, i13, f15, sin2, f13 * 2.0f, e1(z, z2, f - c0), c02);
                        } else {
                            sw8 sw8Var5 = sw8Var4;
                            Drawable[] drawableArr = sw8Var3.b;
                            int length2 = drawableArr.length;
                            int i14 = ((i12 % length2) + length2) % length2;
                            if (drawableArr[i14] == sw8Var5.b[i13]) {
                                D(canvas, sw8Var5, i13, f15, sin2, f13 * 2.0f, 1.0f, c02);
                            } else {
                                float f16 = f13 * 2.0f;
                                float f17 = f - c0;
                                D(canvas, sw8Var3, i14, f15, sin2, f16, e1(z3, false, f17), c02);
                                D(canvas, sw8Var2, i13, f15, sin2, f16, e1(false, false, f17), c02);
                            }
                        }
                    }
                }
                floor2 = i5 + 1;
                vw8Var = this;
                i8 = i;
                sw8Var3 = sw8Var;
                sw8Var4 = sw8Var2;
                i6 = i4;
                f8 = f5;
                ceil2 = i9;
                f9 = f4;
                f6 = f2;
                ceil = i3;
                L = f3;
                z5 = z3;
                L2 = f11;
            }
            i6++;
            vw8Var = this;
            sw8Var3 = sw8Var;
            sw8Var4 = sw8Var2;
            z4 = z5;
            L2 = L2;
            L3 = f10;
        }
    }

    public final void E0(sw8 sw8Var, Bitmap bitmap) {
        sw8Var.e = bitmap;
        if (bitmap != null) {
            if (lcd.b[35] > 0.5f) {
                Y(bitmap);
            }
            x0(sw8Var);
        }
        sw8Var.g = AnimationUtils.currentAnimationTimeMillis();
        this.h2 = bitmap;
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x078c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x07c3  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0849  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x07a7  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x070e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F(Canvas canvas, int i, int i2, sw8 sw8Var, boolean z, boolean z2, float f) {
        long[] jArr;
        float[] fArr;
        float f2;
        float[] fArr2;
        float[] fArr3;
        float[] fArr4;
        float[] fArr5;
        float f3;
        float f4;
        float f5;
        float f6;
        float l;
        long j;
        Bitmap bitmap;
        float f7;
        Rect rect;
        float f8;
        float f9;
        float f10;
        int i3;
        float f11;
        float[] fArr6;
        float[] fArr7;
        float[] fArr8;
        float[] fArr9;
        int[] iArr;
        int[] iArr2;
        sw8 sw8Var2;
        Paint paint;
        Paint paint2;
        Bitmap bitmap2;
        float f12;
        float f13;
        float f14;
        boolean[] zArr;
        long[] jArr2;
        float f15;
        float f16;
        float f17;
        int i4;
        float f18;
        vw8 vw8Var = this;
        if (sw8Var != null) {
            Paint paint3 = sw8Var.i;
            Paint paint4 = sw8Var.v;
            byte b = sw8Var.a;
            if (b != 0) {
                float f19 = vw8Var.w3;
                if (b == 1) {
                    vw8Var.E(canvas, i, i2, null, sw8Var, f, z, z2);
                    return;
                }
                sw8 sw8Var3 = sw8Var;
                float f20 = vw8Var.L + vw8Var.O;
                float f21 = vw8Var.M + vw8Var.P;
                float L = gl.L(90.0f) * 1.3f;
                float L2 = gl.L(170.0f);
                float L3 = gl.L(150.0f);
                vw8Var.K4 = 0;
                float f22 = -(gl.L(60.0f) + L);
                boolean z3 = true;
                Paint paint5 = paint3;
                int floor = ((int) Math.floor((f22 - f21) / L3)) - 1;
                float f23 = i2;
                int ceil = ((int) Math.ceil(((f23 + r8) - f21) / L3)) + 1;
                while (true) {
                    jArr = vw8Var.J4;
                    fArr = vw8Var.H4;
                    f2 = f23;
                    fArr2 = vw8Var.G4;
                    fArr3 = vw8Var.F4;
                    fArr4 = vw8Var.E4;
                    float f24 = f22;
                    fArr5 = vw8Var.I4;
                    f3 = 0.5f;
                    f4 = 2.0f;
                    if (floor > ceil) {
                        f5 = 0.0f;
                        break;
                    }
                    f5 = 0.0f;
                    if (vw8Var.K4 >= 96) {
                        break;
                    }
                    float f25 = (floor & 1) == 0 ? 0.0f : L2 / 2.0f;
                    int i5 = ceil;
                    int floor2 = ((int) Math.floor(((f24 - f20) - f25) / L2)) - 1;
                    int ceil2 = ((int) Math.ceil((((i + r8) - f20) - f25) / L2)) + 1;
                    while (floor2 <= ceil2 && vw8Var.K4 < 96) {
                        float f26 = L2;
                        double u0 = u0(floor, floor2);
                        vw8Var.G0(u0, 5.0f, 12.0f);
                        float f27 = f20;
                        fArr4[vw8Var.K4] = (gl.L(76.0f) * (c0(u0 * 3.7d) - 0.5f)) + ir2.i(floor2, f26, f25, f20) + vw8Var.L4;
                        fArr3[vw8Var.K4] = (gl.L(64.0f) * (c0(u0 * 5.3d) - 0.5f)) + (floor * L3) + f21 + vw8Var.M4;
                        fArr2[vw8Var.K4] = (c0(u0 * 11.9d) * gl.L(32.0f)) + gl.L(62.0f);
                        fArr[vw8Var.K4] = (c0(17.3d * u0) - 0.5f) * 22.0f;
                        int i6 = vw8Var.K4;
                        fArr5[i6] = (float) u0;
                        jArr[i6] = (floor << 32) ^ (floor2 & 4294967295L);
                        vw8Var.K4 = i6 + 1;
                        floor2++;
                        L2 = f26;
                        ceil2 = ceil2;
                        f20 = f27;
                    }
                    floor++;
                    L2 = L2;
                    f23 = f2;
                    f22 = f24;
                    ceil = i5;
                    f20 = f20;
                }
                float f28 = f20;
                vw8Var.X(sw8Var3);
                vw8Var.Z(sw8Var3);
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                Bitmap bitmap3 = sw8Var3.e;
                Bitmap bitmap4 = bitmap3 != null ? bitmap3 : sw8Var3.f;
                float l2 = (bitmap3 == null || sw8Var3.f == null) ? 1.0f : Utilities.l((currentAnimationTimeMillis - sw8Var3.g) / 150.0f);
                if (bitmap4 != null) {
                    Typeface typeface = gl.a;
                    int i7 = sw8Var3.r;
                    vw8Var.e4 = 0;
                    float width = bitmap4.getWidth() / 2.0f;
                    float f29 = 7.0f;
                    if (vw8Var.j4 != i7 || vw8Var.f4 == null) {
                        vw8Var.j4 = i7;
                        f8 = 0.55f;
                        Random random = new Random((i7 * 7919) + 20973);
                        float L4 = gl.L(300.0f);
                        int i8 = 33;
                        vw8Var.f4 = new float[33];
                        vw8Var.g4 = new float[33];
                        vw8Var.h4 = new float[33];
                        int i9 = 0;
                        vw8Var.i4 = 0;
                        int i10 = 0;
                        f9 = 0.35f;
                        while (i10 < i8) {
                            float nextFloat = random.nextFloat();
                            f10 = 1.0f;
                            float L5 = ((((((nextFloat * 0.75f) * nextFloat) + 0.55f) * (gl.L(21.0f) * 1.1f)) / 2.0f) * 1.25f) + gl.L(7.0f);
                            int i11 = i10 + 12;
                            int i12 = i9;
                            float f30 = f5;
                            float f31 = -3.4028235E38f;
                            float f32 = f30;
                            while (i12 < i11) {
                                float nextFloat2 = random.nextFloat() * L4;
                                float nextFloat3 = random.nextFloat() * L4;
                                int i13 = i10;
                                float f33 = Float.MAX_VALUE;
                                while (i9 < vw8Var.i4) {
                                    float abs = Math.abs(nextFloat2 - vw8Var.f4[i9]);
                                    float abs2 = Math.abs(nextFloat3 - vw8Var.g4[i9]);
                                    float f34 = L4 / 2.0f;
                                    if (abs > f34) {
                                        abs = L4 - abs;
                                    }
                                    float f35 = abs;
                                    if (abs2 > f34) {
                                        i3 = i11;
                                        f11 = L4 - abs2;
                                    } else {
                                        i3 = i11;
                                        f11 = abs2;
                                    }
                                    float f36 = L4;
                                    float f37 = vw8Var.h4[i9];
                                    int i14 = i12;
                                    f33 = Math.min(f33, ((((float) Math.hypot(f35, f11)) - L5) - (((((((f37 * 0.75f) * f37) + 0.55f) * (gl.L(21.0f) * 1.1f)) / 2.0f) * 1.25f) + gl.L(7.0f))) - ((nextFloat <= 0.7f || f37 <= 0.7f) ? f5 : gl.L(10.0f)));
                                    i9++;
                                    random = random;
                                    i11 = i3;
                                    L4 = f36;
                                    i12 = i14;
                                }
                                int i15 = i11;
                                float f38 = L4;
                                int i16 = i12;
                                Random random2 = random;
                                if (f33 > f31) {
                                    f31 = f33;
                                    f32 = nextFloat2;
                                    f30 = nextFloat3;
                                }
                                i12 = i16 + 1;
                                random = random2;
                                i10 = i13;
                                i11 = i15;
                                L4 = f38;
                                i9 = 0;
                            }
                            int i17 = i10;
                            float f39 = L4;
                            Random random3 = random;
                            if (vw8Var.i4 > 0 && f31 < gl.L(3.5f)) {
                                break;
                            }
                            float[] fArr10 = vw8Var.f4;
                            int i18 = vw8Var.i4;
                            fArr10[i18] = f32;
                            vw8Var.g4[i18] = f30;
                            vw8Var.h4[i18] = nextFloat;
                            vw8Var.i4 = i18 + 1;
                            random = random3;
                            i10 = i17 + 1;
                            L4 = f39;
                            i8 = 33;
                            i9 = 0;
                        }
                    } else {
                        f9 = 0.35f;
                        f8 = 0.55f;
                    }
                    f10 = 1.0f;
                    float L6 = gl.L(300.0f);
                    float f40 = -L;
                    int floor3 = ((int) Math.floor((f40 - f21) / L6)) - 1;
                    float f41 = f2 + L;
                    int ceil3 = (int) Math.ceil((f41 - f21) / L6);
                    int floor4 = ((int) Math.floor((f40 - f28) / L6)) - 1;
                    float f42 = i + L;
                    int ceil4 = (int) Math.ceil((f42 - f28) / L6);
                    while (true) {
                        fArr6 = vw8Var.d4;
                        float f43 = f41;
                        fArr7 = vw8Var.c4;
                        fArr8 = vw8Var.b4;
                        fArr9 = vw8Var.a4;
                        iArr = vw8Var.Z3;
                        iArr2 = vw8Var.Y3;
                        if (floor3 > ceil3) {
                            break;
                        }
                        int i19 = floor4;
                        while (true) {
                            int i20 = ceil4;
                            float f44 = f40;
                            if (i19 <= ceil4) {
                                int i21 = 0;
                                while (i21 < vw8Var.i4) {
                                    int i22 = i21;
                                    if (vw8Var.e4 < 1024) {
                                        float f45 = (i19 * L6) + vw8Var.f4[i22];
                                        float f46 = (floor3 * L6) + vw8Var.g4[i22];
                                        float f47 = f45 + f28;
                                        float f48 = f46 + f21;
                                        if (f47 < f44 - gl.L(20.0f) || f47 > gl.L(20.0f) + f42 || f48 < f44 - gl.L(20.0f) || f48 > f43 + gl.L(20.0f)) {
                                            i4 = i19;
                                        } else {
                                            float f49 = vw8Var.h4[i22];
                                            float L7 = ((((((f49 * 0.75f) * f49) + f8) * (gl.L(21.0f) * 1.1f)) / 2.0f) * 1.25f) + gl.L(7.0f);
                                            float L8 = gl.L(170.0f);
                                            float L10 = gl.L(150.0f);
                                            int round = Math.round(f46 / L10);
                                            int i23 = round - 1;
                                            while (true) {
                                                i4 = i19;
                                                if (i23 > round + 1) {
                                                    int i24 = vw8Var.e4;
                                                    iArr2[i24] = (floor3 << 12) + i22;
                                                    iArr[i24] = i4;
                                                    fArr9[i24] = f45;
                                                    fArr8[i24] = f46;
                                                    fArr7[i24] = f10;
                                                    fArr6[i24] = f49;
                                                    vw8Var.e4 = i24 + 1;
                                                    break;
                                                }
                                                float f50 = (i23 & 1) == 0 ? f5 : L8 / 2.0f;
                                                int round2 = Math.round((f45 - f50) / L8);
                                                float f51 = f50;
                                                int i25 = round2 - 1;
                                                while (true) {
                                                    f18 = f46;
                                                    if (i25 <= round2 + 1) {
                                                        double u02 = u0(i23, i25);
                                                        int i26 = i25;
                                                        float c0 = ((c0(u02 * 3.7d) - 0.5f) * gl.L(76.0f)) + (i25 * L8) + f51;
                                                        int i27 = i23;
                                                        float c02 = ((c0(u02 * 5.3d) - 0.5f) * gl.L(64.0f)) + (i23 * L10);
                                                        float c03 = (c0(u02 * 11.9d) * gl.L(32.0f)) + gl.L(62.0f);
                                                        float c04 = L7 < f5 ? c03 * 0.66f : (((c0(u02 * 31.7d) * 7.0f) + 5.0f) * gl.L(f10)) + (c03 * f9) + L7 + gl.L(3.5f);
                                                        float f52 = c0 - f45;
                                                        float f53 = c02 - f18;
                                                        if ((f53 * f53) + (f52 * f52) >= c04 * c04) {
                                                            i25 = i26 + 1;
                                                            f46 = f18;
                                                            i23 = i27;
                                                        }
                                                    }
                                                }
                                                i23++;
                                                i19 = i4;
                                                f46 = f18;
                                            }
                                        }
                                        i21 = i22 + 1;
                                        i19 = i4;
                                    }
                                }
                                i19++;
                                ceil4 = i20;
                                f40 = f44;
                            }
                        }
                        floor3++;
                        f41 = f43;
                    }
                    int i28 = 0;
                    while (i28 < vw8Var.e4) {
                        int i29 = iArr2[i28];
                        int i30 = iArr[i28];
                        double u03 = u0(i29, i30);
                        float f54 = fArr9[i28];
                        float f55 = fArr8[i28];
                        float f56 = fArr7[i28];
                        float f57 = fArr6[i28];
                        int i31 = i28;
                        vw8Var.G0(u03, f4, f29);
                        float f58 = f54 + f28 + vw8Var.L4;
                        float f59 = f55 + f21 + vw8Var.M4;
                        float c05 = c0(7.31d * u03);
                        float L11 = ((f57 * 0.75f * f57) + f8) * gl.L(21.0f) * 1.1f * f56;
                        int[] iArr3 = iArr2;
                        Bitmap bitmap5 = bitmap4;
                        Paint paint6 = paint4;
                        long[] jArr3 = jArr;
                        f29 = 7.0f;
                        vw8Var = this;
                        if (vw8Var.J0(f58, f59, L11, i, i2, 1, i29, i30, (Math.max(f5, (L11 / gl.L(15.0f)) - f10) * 0.8f) + f10)) {
                            float e1 = e1(z, z2, f - ((sw8Var3.h || (z && vw8Var.G.h)) ? vw8Var.w1(vw8Var.K3, vw8Var.L3, i, i2) : c0(u03 * 53.1d) * 0.3f));
                            if (e1 > 0.01f) {
                                float L0 = vw8Var.L0(1.0f);
                                float f60 = vw8Var.q0;
                                long j2 = (i29 << 32) ^ (i30 & 4294967295L);
                                int i32 = ((int) (((-7046029254386353131L) * j2) >>> 53)) & 2047;
                                int i33 = 0;
                                while (true) {
                                    f14 = e1;
                                    zArr = vw8Var.y4;
                                    jArr2 = vw8Var.s4;
                                    if (i33 >= 2048 || !zArr[i32] || jArr2[i32] == j2) {
                                        break;
                                    }
                                    i33++;
                                    i32 = (i32 + 1) & 2047;
                                    e1 = f14;
                                }
                                long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                                boolean z4 = zArr[i32];
                                float[] fArr11 = lcd.b;
                                float[] fArr12 = vw8Var.v4;
                                float[] fArr13 = vw8Var.t4;
                                long[] jArr4 = vw8Var.x4;
                                float[] fArr14 = vw8Var.w4;
                                float[] fArr15 = vw8Var.u4;
                                if (z4 && jArr2[i32] == j2) {
                                    f15 = L11;
                                    if (currentAnimationTimeMillis2 - jArr4[i32] <= 1000) {
                                        float exp = 1.0f - ((float) Math.exp((-Math.min(64.0f, r3)) / Math.max(10.0f, (((Math.abs(L0) > Math.abs(fArr15[i32]) || f60 > fArr14[i32]) ? fArr11[48] : fArr11[49]) / 3.4f) / 2.0f)));
                                        float f61 = fArr13[i32];
                                        float A = tb4.A(L0, f61, exp, f61);
                                        fArr13[i32] = A;
                                        float f62 = fArr15[i32];
                                        fArr15[i32] = tb4.A(A, f62, exp, f62);
                                        float f63 = fArr12[i32];
                                        float A2 = tb4.A(f60, f63, exp, f63);
                                        fArr12[i32] = A2;
                                        float f64 = fArr14[i32];
                                        fArr14[i32] = tb4.A(A2, f64, exp, f64);
                                        jArr4[i32] = currentAnimationTimeMillis2;
                                        f16 = fArr15[i32];
                                        float f65 = fArr14[i32];
                                        if (Math.abs(f16) <= 0.05f || f65 > 0.002f) {
                                            vw8Var.invalidate();
                                        }
                                        float f66 = (vw8Var.I3 * f16) + vw8Var.K3;
                                        float f67 = (vw8Var.J3 * f16) + vw8Var.L3;
                                        f17 = vw8Var.q0;
                                        float f68 = c0(61.37d * u03) * 100.0f >= fArr11[17] ? fArr11[18] / 100.0f : 1.0f;
                                        float pow = (float) Math.pow((Math.sin((u03 * 6.283d) + yjb.z(c05, 0.55f, 0.35f, f19)) * 0.5d) + 0.5d, 2.0d);
                                        float z5 = (((((fArr11[43] / 100.0f) * f65) + 1.0f) * yjb.z(pow, 0.1f, (0.06f * f17) + 1.0f, (vw8Var.p0 + 1.0f) * (vw8Var.m0 * f14))) * f15) / bitmap5.getWidth();
                                        float f69 = fArr11[44] * f65;
                                        canvas.save();
                                        canvas.translate(f66, f67);
                                        canvas.rotate(((c05 - 0.5f) * 70.0f) + vw8Var.o0 + f69);
                                        canvas.scale(z5, z5);
                                        int i34 = (int) (((pow * 0.15f) + 0.85f) * vw8Var.n0 * 255.0f * f68);
                                        if (l2 >= 1.0f) {
                                            paint = paint5;
                                            paint.setAlpha((int) ((1.0f - l2) * i34));
                                            sw8Var2 = sw8Var;
                                            f12 = width;
                                            float f70 = -f12;
                                            canvas.drawBitmap(r0(sw8Var2, sw8Var2.f, z3), f70, f70, paint);
                                        } else {
                                            sw8Var2 = sw8Var;
                                            paint = paint5;
                                            f12 = width;
                                        }
                                        paint.setAlpha((int) (i34 * l2));
                                        bitmap2 = bitmap5;
                                        float f71 = -f12;
                                        canvas.drawBitmap(r0(sw8Var2, bitmap2, false), f71, f71, paint);
                                        if (f17 <= 0.01f) {
                                            ColorFilter colorFilter = paint6.getColorFilter();
                                            f13 = 0.35f;
                                            paint2 = paint6;
                                            paint2.setColorFilter(x0(sw8Var2));
                                            paint2.setAlpha((int) (Math.min(1.0f, (fArr11[13] * f17) / 100.0f) * 255.0f * vw8Var.n0 * l2));
                                            canvas.drawBitmap(bitmap2, f71, f71, paint2);
                                            paint2.setColorFilter(colorFilter);
                                            float f72 = fArr11[35];
                                            Paint paint7 = vw8Var.z4;
                                            if (f72 > 0.5f && vw8Var.Y(bitmap2)) {
                                                paint7.setColorFilter(vw8Var.A0(sw8Var2));
                                                paint7.setAlpha((int) (Math.min(255.0f, ((f17 * 255.0f) * fArr11[37]) / 100.0f) * vw8Var.n0 * l2));
                                                canvas.drawBitmap(vw8Var.S3, f71, f71, paint7);
                                            }
                                            float f73 = (vw8Var.n4 * fArr11[22]) / 100.0f;
                                            if (f73 > 0.01f) {
                                                paint7.setColorFilter(vw8Var.A0(sw8Var2));
                                                paint7.setAlpha((int) (Math.min(1.0f, f73) * 255.0f * vw8Var.n0 * l2));
                                                canvas.drawBitmap(bitmap2, f71, f71, paint7);
                                            }
                                        } else {
                                            f13 = 0.35f;
                                            paint2 = paint6;
                                        }
                                        canvas.restore();
                                        i28 = i31 + 1;
                                        bitmap4 = bitmap2;
                                        sw8Var3 = sw8Var2;
                                        paint5 = paint;
                                        width = f12;
                                        paint4 = paint2;
                                        jArr = jArr3;
                                        iArr2 = iArr3;
                                        f9 = f13;
                                        z3 = true;
                                        f4 = 2.0f;
                                        f5 = 0.0f;
                                        f8 = 0.55f;
                                        f10 = 1.0f;
                                    }
                                } else {
                                    f15 = L11;
                                }
                                zArr[i32] = z3;
                                jArr2[i32] = j2;
                                fArr15[i32] = L0;
                                fArr13[i32] = L0;
                                fArr14[i32] = f60;
                                fArr12[i32] = f60;
                                jArr4[i32] = currentAnimationTimeMillis2;
                                f16 = fArr15[i32];
                                float f652 = fArr14[i32];
                                if (Math.abs(f16) <= 0.05f) {
                                }
                                vw8Var.invalidate();
                                float f662 = (vw8Var.I3 * f16) + vw8Var.K3;
                                float f672 = (vw8Var.J3 * f16) + vw8Var.L3;
                                f17 = vw8Var.q0;
                                if (c0(61.37d * u03) * 100.0f >= fArr11[17]) {
                                }
                                float pow2 = (float) Math.pow((Math.sin((u03 * 6.283d) + yjb.z(c05, 0.55f, 0.35f, f19)) * 0.5d) + 0.5d, 2.0d);
                                float z52 = (((((fArr11[43] / 100.0f) * f652) + 1.0f) * yjb.z(pow2, 0.1f, (0.06f * f17) + 1.0f, (vw8Var.p0 + 1.0f) * (vw8Var.m0 * f14))) * f15) / bitmap5.getWidth();
                                float f692 = fArr11[44] * f652;
                                canvas.save();
                                canvas.translate(f662, f672);
                                canvas.rotate(((c05 - 0.5f) * 70.0f) + vw8Var.o0 + f692);
                                canvas.scale(z52, z52);
                                int i342 = (int) (((pow2 * 0.15f) + 0.85f) * vw8Var.n0 * 255.0f * f68);
                                if (l2 >= 1.0f) {
                                }
                                paint.setAlpha((int) (i342 * l2));
                                bitmap2 = bitmap5;
                                float f712 = -f12;
                                canvas.drawBitmap(r0(sw8Var2, bitmap2, false), f712, f712, paint);
                                if (f17 <= 0.01f) {
                                }
                                canvas.restore();
                                i28 = i31 + 1;
                                bitmap4 = bitmap2;
                                sw8Var3 = sw8Var2;
                                paint5 = paint;
                                width = f12;
                                paint4 = paint2;
                                jArr = jArr3;
                                iArr2 = iArr3;
                                f9 = f13;
                                z3 = true;
                                f4 = 2.0f;
                                f5 = 0.0f;
                                f8 = 0.55f;
                                f10 = 1.0f;
                            }
                        }
                        sw8Var2 = sw8Var3;
                        paint = paint5;
                        paint2 = paint6;
                        bitmap2 = bitmap5;
                        f12 = width;
                        f13 = 0.35f;
                        i28 = i31 + 1;
                        bitmap4 = bitmap2;
                        sw8Var3 = sw8Var2;
                        paint5 = paint;
                        width = f12;
                        paint4 = paint2;
                        jArr = jArr3;
                        iArr2 = iArr3;
                        f9 = f13;
                        z3 = true;
                        f4 = 2.0f;
                        f5 = 0.0f;
                        f8 = 0.55f;
                        f10 = 1.0f;
                    }
                    f6 = f9;
                } else {
                    f6 = 0.35f;
                }
                Canvas canvas2 = canvas;
                long[] jArr5 = jArr;
                sw8 sw8Var4 = sw8Var3;
                float f74 = 255.0f;
                vl vlVar = sw8Var4.d;
                Bitmap V = vlVar != null ? vw8Var.V(vlVar) : null;
                Bitmap bitmap6 = (V == null || V.isRecycled()) ? null : V;
                Bitmap bitmap7 = sw8Var4.D;
                if (bitmap6 == null && bitmap7 == null) {
                    return;
                }
                long j3 = sw8Var4.C;
                if (j3 == 0 && vw8Var.W2) {
                    sw8Var4.C = 1L;
                    j3 = 1;
                }
                if (j3 == 0 && vw8Var.S4) {
                    sw8Var4.C = SystemClock.elapsedRealtime();
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (bitmap6 != null && sw8Var4.E == 0) {
                    sw8Var4.E = (bitmap7 == null || sw8Var4.C == 0) ? 1L : elapsedRealtime;
                }
                if (bitmap6 == null) {
                    l = 0.0f;
                } else {
                    l = sw8Var4.E == 1 ? 1.0f : Utilities.l((elapsedRealtime - r7) / 150.0f);
                }
                if (l > 0.0f && l < 1.0f) {
                    vw8Var.invalidate();
                }
                if (vw8Var.U2) {
                    j = Long.MAX_VALUE;
                } else {
                    long j4 = sw8Var4.C;
                    j = j4 == 0 ? -1L : elapsedRealtime - j4;
                }
                Typeface typeface2 = gl.a;
                int i35 = 0;
                while (i35 < vw8Var.K4) {
                    float f75 = fArr2[i35];
                    float f76 = f74;
                    float sin = (((float) Math.sin((fArr5[i35] * 2.0f * 3.141592653589793d) + (vw8Var.N3 * f6))) * gl.L(3.0f)) + fArr3[i35];
                    int i36 = i35;
                    float f77 = fArr4[i36];
                    long j5 = jArr5[i36];
                    long j6 = j;
                    Canvas canvas3 = canvas2;
                    Bitmap bitmap8 = bitmap6;
                    sw8 sw8Var5 = sw8Var4;
                    if (vw8Var.J0(f77, sin, f75, i, i2, 2, (int) (j5 >> 32), (int) j5, (Math.max(0.0f, (f75 / gl.L(40.0f)) - 1.0f) * 0.8f) + 1.0f)) {
                        float e12 = e1(z, z2, f - ((sw8Var5.h || (z && vw8Var.G.h)) ? vw8Var.w1(vw8Var.K3, vw8Var.L3, i, i2) : c0(fArr5[i36] * 53.1d) * 0.3f));
                        if (e12 > 0.01f) {
                            float l3 = Utilities.l((j6 - vw8Var.b(fArr5[i36])) / 380.0f);
                            if (l3 > 0.0f) {
                                float z6 = (f75 / 2.0f) * yjb.z((float) Math.sin((fArr5[i36] * 12.6f) + (vw8Var.N3 * 1.3f)), 0.03f, 1.0f, (vw8Var.p0 + 1.0f) * e12 * (l3 < 1.0f ? h(l3) : 1.0f) * vw8Var.m0);
                                f7 = f3;
                                float L02 = vw8Var.L0(f7);
                                canvas3.save();
                                canvas3.translate((vw8Var.I3 * L02) + vw8Var.K3, (vw8Var.J3 * L02) + vw8Var.L3);
                                canvas3.rotate(fArr[i36] + vw8Var.o0);
                                float f78 = -z6;
                                RectF rectF = vw8Var.D4;
                                rectF.set(f78, f78, z6, z6);
                                if (bitmap7 == null) {
                                    rect = null;
                                } else if (l < 1.0f) {
                                    int i37 = (int) ((1.0f - l) * vw8Var.n0 * 38.25f);
                                    Paint paint8 = vw8Var.C4;
                                    paint8.setAlpha(i37);
                                    rect = null;
                                    canvas3.drawBitmap(bitmap7, (Rect) null, rectF, paint8);
                                } else {
                                    rect = null;
                                }
                                if (bitmap8 != null) {
                                    int i38 = (int) (vw8Var.n0 * f76 * l);
                                    Paint paint9 = vw8Var.B4;
                                    paint9.setAlpha(i38);
                                    bitmap = bitmap8;
                                    canvas3.drawBitmap(bitmap, rect, rectF, paint9);
                                } else {
                                    bitmap = bitmap8;
                                }
                                canvas3.restore();
                                f3 = f7;
                                i35 = i36 + 1;
                                canvas2 = canvas3;
                                sw8Var4 = sw8Var5;
                                j = j6;
                                f74 = f76;
                                bitmap6 = bitmap;
                            }
                        }
                    }
                    bitmap = bitmap8;
                    f7 = f3;
                    f3 = f7;
                    i35 = i36 + 1;
                    canvas2 = canvas3;
                    sw8Var4 = sw8Var5;
                    j = j6;
                    f74 = f76;
                    bitmap6 = bitmap;
                }
            }
        }
    }

    public final void F0(int i) {
        if (this.a) {
            if (i == 2) {
                if (!y6c.h(this.b).p()) {
                    d1(0, k96.M0(2131746281, null), k96.M0(2131746280, null));
                    i0();
                    return;
                } else if (this.i1 != i || this.g1 < 0.5f) {
                    AnimationUtils.currentAnimationTimeMillis();
                }
            }
            this.i1 = i;
            this.j1 = i;
            this.k1 = 0.0f;
            this.k9.forceFinished(true);
            if (this.g1 > 0.5f) {
                this.c6 = AnimationUtils.currentAnimationTimeMillis();
            }
            if (this.h1 < 0.5f) {
                this.J2 = AnimationUtils.currentAnimationTimeMillis();
            }
            this.h1 = 1.0f;
            l0();
            if (this.i1 == 2) {
                y0();
            }
            i0();
        }
    }

    public final void G(Canvas canvas, RectF rectF, int i) {
        float centerY = rectF.centerY();
        float L = gl.L(12.0f);
        gn gnVar = this.M0;
        float c = gnVar.c() + gl.L(2.0f) + L;
        float L2 = rectF.left + gl.L(8.0f);
        O(L2, centerY, L, i, canvas, true);
        gnVar.u(i);
        gnVar.setBounds((int) (L2 + L + gl.L(2.0f)), (int) (centerY - gl.L(8.0f)), (int) (L2 + c + gl.L(40.0f)), (int) (centerY + gl.L(8.0f)));
        gnVar.draw(canvas);
    }

    public final void G0(double d, float f, float f2) {
        float c0 = ((c0(31.7d * d) * (f2 - f)) + f) * gl.L(1.0f);
        double c02 = (d * 6.283d) + (((((c0(43.3d * d) < 0.5f ? -1.0d : 1.0d) * 2.0d) * 3.141592653589793d) * this.N3) / ((c0(37.1d * d) * 11.0f) + 9.0f));
        this.L4 = ((float) Math.cos(c02)) * c0;
        this.M4 = c0 * ((float) Math.sin(c02));
    }

    public final void H(Canvas canvas, RectF rectF, float f) {
        tw8 tw8Var = this.n;
        int f2 = tw8Var != null ? bm2.f(0.5f, tw8Var.b, tw8Var.c) : -12947803;
        Paint paint = this.A1;
        paint.setColor(f2 | (-16777216));
        paint.setAlpha((int) (Utilities.l(f) * 224.4f));
        canvas.drawRect(rectF, paint);
    }

    public final float H0() {
        return (a1() - b1()) + gl.L(8.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0166, code lost:
    
        if (r4.e != r3) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I(Canvas canvas, int i, TL_stars.TL_starGiftUnique tL_starGiftUnique, float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        float f7;
        TLRPC.Document document;
        TLRPC.Document document2;
        float f8;
        float f9;
        float f10;
        Bitmap bitmap;
        Paint a;
        Canvas canvas2 = canvas;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (i == this.P7) {
            if (this.S7 < this.R7) {
                float l = 1.0f - Utilities.l((currentAnimationTimeMillis - r12) / 120.0f);
                f5 = 1.0f - ((1.0f - (l * l)) * 0.06f);
            } else {
                f5 = ls6.B(1.0f, (float) g1((currentAnimationTimeMillis - r6) / 1000.0f, 0.6d, 0.3d), 0.06f, 1.0f);
            }
        } else {
            f5 = 1.0f;
        }
        if (f5 != 1.0f) {
            canvas2.save();
            canvas2.scale(f5, f5, (f3 / 2.0f) + f, (f4 / 2.0f) + f2);
        }
        int[] iArr = this.i2;
        e0(iArr, i);
        int i2 = iArr[0];
        int i3 = iArr[1];
        ArrayList<TL_stars.StarGiftAttribute> arrayList = tL_starGiftUnique.attributes;
        int size = arrayList.size();
        int i4 = 0;
        TLRPC.Document document3 = null;
        while (i4 < size) {
            TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i4);
            i4++;
            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributeModel) {
                document3 = ((TL_stars.starGiftAttributeModel) starGiftAttribute2).document;
            }
        }
        RectF rectF = this.G1;
        rectF.set(f, f2, f + f3, f2 + f4);
        Paint paint = this.A1;
        paint.setColor(-1);
        long j = tL_starGiftUnique.id;
        LongSparseArray longSparseArray = this.R5;
        RadialGradient radialGradient = (RadialGradient) longSparseArray.get(j);
        if (radialGradient == null) {
            radialGradient = new RadialGradient(0.0f, 0.0f, 1.0f, new int[]{i2, i3}, (float[]) null, Shader.TileMode.CLAMP);
            longSparseArray.put(tL_starGiftUnique.id, radialGradient);
        }
        float f11 = f4 * 0.7f;
        float max = Math.max(1.0f, f3 / f4) * f11;
        Matrix matrix = this.O5;
        matrix.setScale(max, f11);
        matrix.postTranslate(rectF.centerX(), rectF.centerY());
        radialGradient.setLocalMatrix(matrix);
        paint.setShader(radialGradient);
        float f12 = this.U7;
        canvas2.drawRoundRect(rectF, f12, f12, paint);
        paint.setShader(null);
        canvas2.save();
        Path path = this.F1;
        path.rewind();
        path.addRoundRect(rectF, f12, f12, Path.Direction.CW);
        canvas2.clipPath(path);
        int i5 = iArr[2] | (-16777216);
        uw8 l1 = l1(tL_starGiftUnique);
        tl tlVar = l1.a;
        if (tlVar == null || tlVar.f[0] == null) {
            f6 = f12;
            f7 = 0.7f;
            document = document3;
        } else {
            canvas2.save();
            canvas2.translate(rectF.centerX(), rectF.centerY());
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 29) {
                tl tlVar2 = l1.a;
                f7 = 0.7f;
                Drawable drawable = tlVar2.f[0];
                if (drawable != null && tlVar2.d.c == 1.0f && (drawable instanceof vl)) {
                    vl vlVar = (vl) drawable;
                    ml mlVar = vlVar.k;
                    if (mlVar != null) {
                        long h = vlVar.h();
                        document = document3;
                        if (h == l1.b) {
                            bitmap = mlVar.n();
                            if (bitmap == null) {
                                if (l1.c != bitmap || (a = l1.d) == null) {
                                    l1.c = bitmap;
                                    a = s4.a(bitmap);
                                    l1.d = a;
                                }
                                l1.e = i5;
                                a.setColorFilter(i6 >= 29 ? yz.A(i5) : new PorterDuffColorFilter(i5, PorterDuff.Mode.SRC_IN));
                                f6 = f12;
                                ana.b(canvas2, 2, l1.d, bitmap, rectF.width(), rectF.height(), 1.0f);
                                canvas2 = canvas;
                                canvas2.restore();
                            } else {
                                f6 = f12;
                                l1.a.k(Integer.valueOf(i5));
                                canvas2 = canvas;
                                ana.a(canvas2, 2, l1.a, rectF.width(), rectF.height(), 1.0f, 1.0f);
                                canvas2.restore();
                            }
                        }
                    } else {
                        document = document3;
                    }
                    bitmap = null;
                    if (bitmap == null) {
                    }
                } else {
                    f6 = f12;
                }
            } else {
                f6 = f12;
                f7 = 0.7f;
            }
            document = document3;
            l1.a.k(Integer.valueOf(i5));
            canvas2 = canvas;
            ana.a(canvas2, 2, l1.a, rectF.width(), rectF.height(), 1.0f, 1.0f);
            canvas2.restore();
        }
        canvas2.restore();
        paint.setColor(318767103);
        canvas2.drawRoundRect(rectF, f6, f6, paint);
        Paint paint2 = this.B1;
        paint2.setColor(1308622847);
        paint2.setStrokeWidth(Math.max(1.0f, gl.N(0.4f)));
        RectF rectF2 = this.V5;
        rectF2.set(rectF);
        rectF2.inset(0.5f, 0.5f);
        float f13 = f6 - 0.5f;
        canvas2.drawRoundRect(rectF2, f13, f13, paint2);
        long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
        int i7 = this.L7;
        if (i != i7 || this.O7 <= 0.5f) {
            document2 = document;
            if (i == this.Q7 || (i == i7 && this.O7 < 0.5f)) {
                float l2 = Utilities.l((currentAnimationTimeMillis2 - this.T7) / 180.0f);
                f8 = 1.0f - (l2 * l2);
            } else {
                f8 = 0.0f;
            }
        } else {
            document2 = document;
            float l3 = 1.0f - Utilities.l((currentAnimationTimeMillis2 - this.S7) / 260.0f);
            f8 = oo1.v(l3, l3, l3, 1.0f);
        }
        if (f8 > 0.002f) {
            boolean z = i == this.L7 && this.O7 > 0.5f;
            f9 = 3.0f;
            float R1 = gl.R1(gl.N(1.0f), gl.L(4.0f), f8);
            float L = gl.L(2.0f) * f8;
            float min = Math.min(1.0f, z ? f8 * 4.0f : f8 * 3.0f);
            rectF2.set(rectF);
            rectF2.inset(R1, R1);
            paint2.setColor(-1);
            paint2.setAlpha((int) (min * 255.0f * (i == this.L7 ? (f8 * 0.3f) + f7 : 1.0f)));
            paint2.setStrokeWidth(L);
            float f14 = f6 - R1;
            canvas2.drawRoundRect(rectF2, Math.max(0.0f, f14), Math.max(0.0f, f14), paint2);
        } else {
            f9 = 3.0f;
        }
        if (document2 != null) {
            vl g0 = g0(tL_starGiftUnique.id, document2);
            float f15 = 0.82f * f4;
            long currentAnimationTimeMillis3 = AnimationUtils.currentAnimationTimeMillis();
            int i8 = this.L7;
            if (i == i8 && this.O7 > 0.5f) {
                f10 = 1.0f - (((float) g1((currentAnimationTimeMillis3 - this.S7) / 1000.0f, 0.6d, 0.3d)) * 0.14f);
            } else if (i == this.Q7 || (i == i8 && this.O7 < 0.5f)) {
                float l4 = Utilities.l((currentAnimationTimeMillis3 - this.T7) / 180.0f);
                f10 = ((f9 - (l4 * 2.0f)) * 0.14f * l4 * l4) + 0.86f;
            } else {
                f10 = 1.0f;
            }
            float f16 = (f15 * f10) / 2.0f;
            g0.setBounds((int) (rectF.centerX() - f16), (int) (rectF.centerY() - f16), (int) (rectF.centerX() + f16), (int) (rectF.centerY() + f16));
            g0.setAlpha(kk7.d4);
            g0.setColorFilter(null);
            g0.draw(canvas2);
        }
        if (f5 != 1.0f) {
            canvas2.restore();
        }
    }

    public final void I0(float f, float f2, int i) {
        Path path;
        int i2;
        int i3;
        TLRPC.Document document;
        TLRPC.Document document2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.w1.get(i);
        tw8 tw8Var = new tw8();
        tw8Var.a = (byte) 2;
        tw8Var.f = i;
        final sw8 sw8Var = new sw8();
        sw8Var.a = (byte) 2;
        sw8Var.q = i;
        long j = tL_starGiftUnique.id;
        sw8Var.r = (int) (j ^ (j >>> 32));
        ArrayList<TL_stars.StarGiftAttribute> arrayList = tL_starGiftUnique.attributes;
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i5);
            i5++;
            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
            if ((starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) && (document2 = ((TL_stars.starGiftAttributePattern) starGiftAttribute2).document) != null) {
                sw8Var.A = document2;
                sw8Var.c = vl.l(this.b, 9, document2);
            } else if ((starGiftAttribute2 instanceof TL_stars.starGiftAttributeModel) && (document = ((TL_stars.starGiftAttributeModel) starGiftAttribute2).document) != null) {
                sw8Var.z = document;
                sw8Var.d = vl.l(this.b, 24, document);
            }
        }
        e0(this.i2, i);
        tw8Var.b = x(this.i2[0], false);
        int x = x(this.i2[1], true);
        tw8Var.c = x;
        tw8Var.d = this.i2[2];
        tw8Var.e = v(tw8Var.b, x);
        tw8Var.h = Z0(tw8Var.b);
        tw8Var.g = hv8.k(0.5f, tw8Var.b, tw8Var.c);
        sw8Var.j = k1(tw8Var.d, tw8Var.b);
        double[] dArr = {r15, 0.0d, 0.0d};
        bm2.j(k1(tw8Var.d, tw8Var.b) | (-16777216), dArr);
        double min = Math.min(97.0d, dArr[0] + 20.0d);
        float[] fArr = new float[3];
        Color.colorToHSV(bm2.b(min, dArr[1], dArr[2]), fArr);
        fArr[1] = Math.min(1.0f, fArr[1] * 1.15f);
        sw8Var.s = Color.HSVToColor(fArr) | (-16777216);
        sw8Var.v.setColorFilter(new PorterDuffColorFilter(sw8Var.s, PorterDuff.Mode.SRC_IN));
        sw8Var.t = -1;
        sw8Var.B = tL_starGiftUnique;
        vl vlVar = sw8Var.c;
        if (vlVar != null) {
            vlVar.b(this);
        }
        vl vlVar2 = sw8Var.d;
        if (vlVar2 != null) {
            vlVar2.b(this);
        }
        TLRPC.Document document3 = sw8Var.z;
        if (document3 != null) {
            int i6 = 0;
            while (true) {
                if (i6 >= document3.thumbs.size()) {
                    path = null;
                    break;
                } else {
                    if (document3.thumbs.get(i6) instanceof TLRPC.TL_photoPathSize) {
                        path = ((TLRPC.TL_photoPathSize) document3.thumbs.get(i6)).svgPath;
                        break;
                    }
                    i6++;
                }
            }
            if (path != null) {
                while (true) {
                    if (i4 >= document3.attributes.size()) {
                        i2 = 512;
                        i3 = 512;
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = document3.attributes.get(i4);
                    if (((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) && (i2 = documentAttribute.w) > 0 && (i3 = documentAttribute.h) > 0) {
                        break;
                    } else {
                        i4++;
                    }
                }
                final Path path2 = new Path(path);
                float f3 = H9;
                final float f4 = f3 / i2;
                final float f5 = f3 / i3;
                final int i7 = sw8Var.j;
                Utilities.e.c(new Runnable() { // from class: pw8
                    @Override // java.lang.Runnable
                    public final void run() {
                        Bitmap bitmap;
                        float f6 = f4;
                        float f7 = f5;
                        int i8 = i7;
                        Path path3 = path2;
                        try {
                            int i9 = vw8.H9;
                            bitmap = Bitmap.createBitmap(i9, i9, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(bitmap);
                            canvas.scale(f6, f7);
                            Paint paint = new Paint(1);
                            paint.setColor(i8);
                            canvas.drawPath(path3, paint);
                            bitmap.prepareToDraw();
                        } catch (Throwable th) {
                            fa4.g(th, true);
                            bitmap = null;
                        }
                        gl.c3(new gm8(vw8.this, sw8Var, bitmap, (byte) 7));
                    }
                });
            }
        }
        this.J.clear();
        Y0(tw8Var, f, f2);
        if (!this.g2) {
            this.q2 = j(this.o2, 0.03f, 0.005f);
            this.o2 = AnimationUtils.currentAnimationTimeMillis();
        }
        setPattern(sw8Var);
    }

    public final void J(Canvas canvas, RectF rectF, float f, float f2) {
        RectF rectF2;
        float f3;
        RectF rectF3;
        float f4;
        char c;
        char c2;
        if (f2 <= 0.0f) {
            return;
        }
        if (this.A6) {
            float min = Math.min(0.0f, gl.N(lcd.a[2][8]));
            rectF3 = this.W5;
            rectF2 = rectF;
            rectF3.set(rectF2);
            rectF3.inset(min, min);
            f3 = f - min;
        } else {
            rectF2 = rectF;
            f3 = f;
            rectF3 = rectF2;
        }
        boolean z = (j0(canvas) || this.Z2 == null) ? false : true;
        if (z && this.Z2 != null && this.b3 != null) {
            float f5 = this.g3;
            Matrix matrix = this.e3;
            matrix.setScale(f5, f5);
            float f6 = (-f5) / 2.0f;
            matrix.postTranslate(f6, f6);
            this.b3.setLocalMatrix(matrix);
            int l = (int) (Utilities.l(f2) * 255.0f);
            Paint paint = this.d3;
            paint.setAlpha(l);
            canvas.drawRoundRect(rectF3, f3, f3, paint);
            paint.setAlpha(kk7.d4);
        }
        Path path = this.F1;
        path.rewind();
        path.addRoundRect(rectF3, f3, f3, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        float[] fArr = lcd.b;
        if (z) {
            f4 = 0.0f;
            c = '\t';
            c2 = 3;
        } else if (yz.o() && j0(canvas)) {
            f4 = 0.0f;
            if (f2 < 1.0f) {
                canvas.saveLayerAlpha(rectF3, (int) (f2 * 255.0f));
            }
            if (!this.s6 || this.r6 <= 0.004f) {
                c = '\t';
                c2 = 3;
                Object obj = this.I1;
                canvas.save();
                canvas.scale(9.0f, 9.0f);
                yz.h(canvas, obj);
                canvas.restore();
            } else {
                canvas.save();
                canvas.scale(8.0f, 8.0f);
                if (this.t6 == null) {
                    this.t6 = mk1.d("qrSheetLift");
                }
                float round = Math.round(this.r6 * 50.0f) / 50.0f;
                c = '\t';
                tw8 tw8Var = this.n;
                int i = tw8Var != null ? tw8Var.b : 0;
                if (round == this.u6 && this.v6 == 1 && this.w6 == i) {
                    c2 = 3;
                } else {
                    this.u6 = round;
                    this.v6 = 1;
                    this.w6 = i;
                    Object obj2 = this.t6;
                    c2 = 3;
                    float max = (fArr[10] / 100.0f) * round * ((float) Math.max(0.0d, Math.min(1.0d, (0.85d - (tw8Var != null ? bm2.h(tw8Var.b) : 0.3d)) / 0.45d)));
                    float A = b00.A(fArr[11], 100.0f, round, 1.0f);
                    float f7 = ((0.5f - (A * 0.5f)) + max) * 255.0f;
                    yz.w(obj2, Math.max(0.5f, gl.N(gl.R1(fArr[2], fArr[12], round)) / 8.0f), new float[]{A, 0.0f, 0.0f, 0.0f, f7, 0.0f, A, 0.0f, 0.0f, f7, 0.0f, 0.0f, A, 0.0f, f7, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                }
                Canvas c3 = yz.c((getWidth() + 7) / 8, (getHeight() + 7) / 8, this.t6);
                c3.scale(0.125f, 0.125f);
                yz.h(c3, this.H1);
                yz.k(this.t6);
                yz.h(canvas, this.t6);
                canvas.restore();
            }
            if (f2 < 1.0f) {
                canvas.restore();
            }
        } else {
            f4 = 0.0f;
            c = '\t';
            c2 = 3;
            H(canvas, rectF3, f2);
        }
        int i2 = this.T8;
        if (i2 == 0) {
            i2 = g((fArr[c2] + (this.s6 ? fArr[c] * this.r6 : f4)) / 100.0f, 16777215);
        }
        Paint paint2 = this.A1;
        paint2.setColor(i2);
        paint2.setAlpha((int) (Color.alpha(paint2.getColor()) * f2));
        canvas.drawRect(rectF3, paint2);
        uv8.b(canvas, rectF3, f2);
        boolean z2 = this.s6;
        if ((((z2 || this.A6) ? f4 : (fArr[21] / 100.0f) * this.b6) > f4 || fArr[39] > f4) && this.z3 && !z2 && !this.A6) {
            int width = getWidth();
            int height = getHeight();
            float c1 = c1(rectF3.left, rectF3.centerY(), width, height);
            float c12 = c1(rectF3.centerX(), rectF3.centerY(), width, height);
            float c13 = c1(rectF3.right, rectF3.centerY(), width, height);
            if (c1 + c12 + c13 > 0.01f) {
                float f8 = ((fArr[39] * 1.25f) / 100.0f) * this.b6 * 0.1f;
                float f9 = c12 * f8 * f2;
                float f10 = f8 * c13 * f2;
                float centerX = rectF3.centerX();
                L(rectF3.left, centerX, c1 * f8 * f2, f9, canvas, rectF3);
                L(centerX, rectF3.right, f9, f10, canvas, rectF3);
            }
        }
        canvas.restore();
        C(canvas, null, rectF2, f, f2);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean J0(float f, float f2, float f3, int i, int i2, int i3, int i4, int i5, float f4) {
        float f5;
        float f6;
        int i6;
        int i7;
        float f7;
        int i8;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float exp;
        float f16;
        float f17;
        float f1;
        float f18;
        float f19;
        float f20;
        float f21;
        float L = gl.L(90.0f);
        float f22 = 1.3f * L;
        float f23 = -f22;
        if (f < f23) {
            return false;
        }
        float f24 = i;
        if (f > f24 + f22 || f2 < f23) {
            return false;
        }
        float f25 = i2;
        if (f2 > f22 + f25) {
            return false;
        }
        long j = ((i3 << 60) ^ ((i4 & 1073741823) << 30)) ^ (i5 & 1073741823);
        rw8 rw8Var = this.M3;
        int i9 = rw8Var.m;
        float[] fArr = rw8Var.j;
        float[] fArr2 = rw8Var.i;
        float[] fArr3 = rw8Var.h;
        float[] fArr4 = rw8Var.g;
        float[] fArr5 = rw8Var.f;
        float[] fArr6 = rw8Var.e;
        float[] fArr7 = rw8Var.d;
        float[] fArr8 = rw8Var.c;
        long[] jArr = rw8Var.a;
        boolean[] zArr = rw8Var.b;
        int[] iArr = rw8Var.k;
        int i10 = -1;
        if (i9 != 0) {
            long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
            f5 = f25;
            f6 = f24;
            i6 = (int) ((j2 ^ (j2 >>> 33)) & 4095);
            while (zArr[i6]) {
                if (jArr[i6] == j) {
                    break;
                }
                i6 = (i6 + 1) & 4095;
            }
        } else {
            f5 = f25;
            f6 = f24;
        }
        i6 = -1;
        if (this.s >= 1.0f || this.r == null) {
            i7 = i6;
            f7 = 0.0f;
        } else {
            if (i6 >= 0) {
                f7 = 0.0f;
                if (iArr[i6] == this.r0) {
                    i7 = i6;
                }
            } else {
                f7 = 0.0f;
            }
            float f26 = this.x;
            i7 = i6;
            double max = Math.max(f26, f6 - f26);
            float f27 = this.y;
            float hypot = ((float) Math.hypot(max, Math.max(f27, f5 - f27))) + gl.L(60.0f);
            float f28 = f - this.x;
            float f29 = f2 - this.y;
            float sqrt = (float) Math.sqrt((f29 * f29) + (f28 * f28));
            if (sqrt <= x1(this.s) * hypot) {
                if (i7 < 0) {
                    if (rw8Var.m >= 3072) {
                        f18 = f28;
                        f19 = f29;
                    } else {
                        long j3 = (j ^ (j >>> 33)) * (-49064778989728563L);
                        f19 = f29;
                        int i11 = (int) ((j3 ^ (j3 >>> 33)) & 4095);
                        while (true) {
                            if (!zArr[i11]) {
                                zArr[i11] = true;
                                jArr[i11] = j;
                                iArr[i11] = -1;
                                fArr[i11] = f7;
                                fArr2[i11] = f7;
                                fArr3[i11] = f7;
                                fArr4[i11] = f7;
                                fArr5[i11] = f7;
                                fArr6[i11] = f7;
                                fArr7[i11] = f7;
                                fArr8[i11] = f7;
                                int[] iArr2 = rw8Var.l;
                                f18 = f28;
                                int i12 = rw8Var.m;
                                rw8Var.m = i12 + 1;
                                iArr2[i12] = i11;
                                break;
                            }
                            if (jArr[i11] == j) {
                                f18 = f28;
                                break;
                            }
                            i11 = (i11 + 1) & 4095;
                        }
                        i10 = i11;
                    }
                    i8 = i10;
                } else {
                    f18 = f28;
                    f19 = f29;
                    i8 = i7;
                }
                if (i8 >= 0) {
                    iArr[i8] = this.r0;
                    float f30 = 1.0f / f4;
                    if (sqrt > 1.0f) {
                        f20 = f18 / sqrt;
                        f21 = f19 / sqrt;
                    } else {
                        f20 = f7;
                        f21 = -1.0f;
                    }
                    fArr6[i8] = b00.w(f20, gl.L(360.0f), f30, fArr6[i8]);
                    fArr5[i8] = b00.w(f21, gl.L(360.0f), f30, fArr5[i8]);
                    fArr3[i8] = b00.w(f20 >= f7 ? 1.0f : -1.0f, 180.0f, f30, fArr3[i8]);
                    fArr[i8] = fArr[i8] + 1.8f;
                }
                if (i8 < 0) {
                    f8 = f + fArr8[i8];
                    f9 = f2 + fArr7[i8];
                    this.o0 = fArr4[i8];
                    this.p0 = fArr2[i8];
                } else {
                    float f31 = f7;
                    this.o0 = f31;
                    this.p0 = f31;
                    f8 = f;
                    f9 = f2;
                }
                float f32 = f6 / 2.0f;
                float l = (l() / 2.0f) + m();
                f10 = f8 - f32;
                f11 = f9 - l;
                if (f10 <= 0.5f) {
                    f13 = 1.0f;
                    f12 = 2.0f;
                    f14 = Math.max(0.0f, f10 / Math.max(1.0f, f6 - f32));
                } else {
                    f12 = 2.0f;
                    f13 = 1.0f;
                    f14 = 0.0f;
                    if (f10 < -0.5f) {
                        f14 = Math.max(0.0f, (-f10) / Math.max(1.0f, f32));
                    }
                }
                if (f11 <= 0.5f) {
                    f14 = Math.max(f14, f11 / Math.max(f13, f5 - l));
                } else if (f11 < -0.5f) {
                    f14 = Math.max(f14, (-f11) / Math.max(f13, l));
                }
                float min = Math.min(f13, f14);
                float f110 = f13 - (f1(0.55f, f13, min) * 0.22f);
                float f111 = f13 - (f1(0.8f, f13, min) * 0.2f);
                if (f8 < L || f8 > f6 - f8) {
                    if (f6 - f8 >= L) {
                        exp = (float) Math.exp((r9 / L) - 1.0f);
                        f16 = f6 - (L * exp);
                    } else {
                        f15 = 1.0f;
                        if (f9 < L || f9 > f5 - f9) {
                            if (f5 - f9 < L) {
                                float exp2 = (float) Math.exp((r10 / L) - 1.0f);
                                f17 = f5 - (L * exp2);
                                f15 = Math.min(f15, exp2);
                            }
                            f1 = f1(0.08f, 0.25f, f15) * f111;
                            this.n0 = f1;
                            if (f1 <= 0.004f) {
                                return false;
                            }
                            if (f3 * f110 < gl.L(10.0f)) {
                                f110 = gl.L(10.0f) / Math.max(1.0f, f3);
                            }
                            float f33 = f15 * f110;
                            if (i3 != 1) {
                                f33 = Math.max(f33, Math.min(f3, gl.L(9.0f)) / Math.max(1.0f, f3));
                            }
                            this.m0 = f33;
                            float f34 = (f3 * f33) / f12;
                            float l2 = Utilities.l(Math.min(Math.min(f8 - f34, (f6 - f8) - f34), Math.min(f9 - f34, (f5 - f9) - f34)) / gl.L(12.0f));
                            float f35 = (3.0f - (l2 * f12)) * l2 * l2 * this.n0;
                            this.n0 = f35;
                            if (f35 <= 0.004f) {
                                return false;
                            }
                            this.K3 = f8;
                            this.L3 = f9;
                            this.q0 = c1(f8, f9, i, i2);
                            this.n4 = this.m4;
                            this.q4 = this.o4;
                            this.r4 = this.p4;
                            return true;
                        }
                        float exp3 = (float) Math.exp((f9 / L) - 1.0f);
                        f17 = L * exp3;
                        f15 = Math.min(f15, exp3);
                        f9 = f17;
                        f1 = f1(0.08f, 0.25f, f15) * f111;
                        this.n0 = f1;
                        if (f1 <= 0.004f) {
                        }
                    }
                } else {
                    exp = (float) Math.exp((f8 / L) - f13);
                    f16 = L * exp;
                }
                float f36 = f16;
                f15 = exp;
                f8 = f36;
                if (f9 < L) {
                }
                if (f5 - f9 < L) {
                }
                f1 = f1(0.08f, 0.25f, f15) * f111;
                this.n0 = f1;
                if (f1 <= 0.004f) {
                }
            }
        }
        i8 = i7;
        if (i8 < 0) {
        }
        float f322 = f6 / 2.0f;
        float l3 = (l() / 2.0f) + m();
        f10 = f8 - f322;
        f11 = f9 - l3;
        if (f10 <= 0.5f) {
        }
        if (f11 <= 0.5f) {
        }
        float min2 = Math.min(f13, f14);
        float f1102 = f13 - (f1(0.55f, f13, min2) * 0.22f);
        float f1112 = f13 - (f1(0.8f, f13, min2) * 0.2f);
        if (f8 < L) {
        }
        if (f6 - f8 >= L) {
        }
    }

    public final void K(Canvas canvas) {
        float f;
        float f2;
        int i;
        float f3;
        Canvas canvas2 = canvas;
        if (this.l1 <= 0.001f) {
            return;
        }
        float L = gl.L(222.0f);
        float L2 = gl.L(46.0f);
        float L3 = gl.L(54.0f);
        float f4 = this.z0 ? L2 + L2 : L2 + L3 + L2;
        float f5 = this.g1;
        RectF rectF = this.J5;
        float L4 = f5 > 0.5f ? (rectF.bottom + gl.L(6.0f)) - f4 : rectF.top - gl.L(6.0f);
        float width = (getWidth() - L) / 2.0f;
        RectF rectF2 = this.K8;
        rectF2.set(width, L4, L + width, f4 + L4);
        float f6 = this.E8;
        float f7 = this.F8;
        float l = Utilities.l(this.l1);
        float R1 = gl.R1(rectF.left, rectF2.left, f6);
        float R12 = gl.R1(rectF.top, rectF2.top, f7);
        float R13 = gl.R1(rectF.right, rectF2.right, f6);
        float R14 = gl.R1(rectF.bottom, rectF2.bottom, f7);
        RectF rectF3 = this.J8;
        rectF3.set(R1, R12, R13, R14);
        float min = Math.min(rectF3.height() / 2.0f, Math.min(rectF3.width() / 2.0f, gl.R1(rectF.height() / 2.0f, gl.L(22.0f), Utilities.l(f7))));
        float w = ls6.w(this.G8, 9.0f, 1.0f, -0.25f) * gl.L(5.0f);
        float f8 = rectF3.left;
        float f9 = rectF3.top;
        float f10 = rectF3.right;
        float f11 = 1.0f;
        float f12 = rectF3.bottom;
        float centerX = rectF3.centerX();
        Path path = this.I8;
        path.rewind();
        float f13 = f8 + min;
        path.moveTo(f13, f9);
        float f14 = f10 - min;
        path.lineTo(f14, f9);
        float f15 = f9 + min;
        path.quadTo(f10, f9, f10, f15);
        float f16 = f12 - min;
        path.lineTo(f10, f16);
        path.quadTo(f10, f12, f14, f12);
        float f17 = f12 + w;
        path.cubicTo(gl.R1(f14, centerX, 0.55f), f17, gl.R1(f13, centerX, 0.55f), f17, f13, f12);
        path.quadTo(f8, f12, f8, f16);
        path.lineTo(f8, f15);
        path.quadTo(f8, f9, f13, f9);
        path.close();
        float max = Math.max(0.0f, w) + f12;
        RectF rectF4 = this.G1;
        rectF4.set(f8, f9, f10, max);
        canvas2.save();
        canvas2.clipPath(path);
        float f18 = 255.0f;
        if (yz.o() && j0(canvas)) {
            Object obj = this.I1;
            canvas2.save();
            canvas2.scale(9.0f, 9.0f);
            yz.h(canvas2, obj);
            canvas2.restore();
        } else if (this.Z2 != null) {
            int l2 = (int) (Utilities.l(1.0f) * 255.0f);
            Paint paint = this.c3;
            paint.setAlpha(l2);
            Bitmap bitmap = this.Z2;
            if (bitmap != null) {
                y(canvas2, bitmap);
            }
            paint.setAlpha(kk7.d4);
        } else {
            H(canvas2, rectF4, 1.0f);
        }
        Paint paint2 = this.A1;
        paint2.setColor(352321535);
        paint2.setAlpha((int) (Color.alpha(paint2.getColor()) * 1.0f));
        canvas2.drawRect(rectF4, paint2);
        uv8.b(canvas2, rectF4, 1.0f);
        canvas2.restore();
        C(canvas2, path, rectF4, 0.0f, 1.0f);
        canvas2.save();
        canvas2.clipPath(path);
        float f19 = l / 0.3f;
        float l3 = 1.0f - Utilities.l(f19);
        float f20 = 0.004f;
        float f21 = 0.15f;
        boolean z = false;
        int i2 = 1;
        if (l3 > 0.004f) {
            canvas2.saveLayerAlpha(rectF4, (int) (l3 * 255.0f));
            float l4 = 1.0f - (Utilities.l(f19) * 0.15f);
            canvas2.scale(l4, l4, rectF.centerX(), rectF.centerY());
            this.T5 = true;
            int width2 = getWidth();
            System.currentTimeMillis();
            B(canvas2, width2);
            this.T5 = false;
            canvas2.restore();
        }
        float centerX2 = rectF3.centerX() - rectF2.centerX();
        float f22 = rectF3.top - rectF2.top;
        float f23 = 0.6f;
        if (Math.abs(this.G8) < 0.6f) {
            centerX2 = Math.round(centerX2);
            f22 = Math.round(f22);
        }
        canvas2.save();
        canvas2.translate(centerX2, f22);
        TextPaint textPaint = this.D1;
        textPaint.setSubpixelText(true);
        textPaint.setLinearText(false);
        String[] strArr = {k96.M0(2131746292, null), k96.M0(this.y0 ? 2131746296 : 2131746294, null), k96.M0(2131746291, null)};
        String[] strArr2 = {null, k96.M0(this.y0 ? 2131746295 : 2131746293, null), null};
        int i3 = 0;
        float f24 = L4;
        while (i3 < 3) {
            RectF[] rectFArr = this.y8;
            if (i3 == i2 && this.z0) {
                rectFArr[i3].setEmpty();
                i = i3;
                f = f18;
                f2 = f20;
            } else {
                float f25 = strArr2[i3] != null ? L3 : L2;
                f = f18;
                f2 = f20;
                float f26 = f24 + f25;
                rectFArr[i3].set(rectF2.left, f24, rectF2.right, f26);
                float f1 = this.m1 > 0.5f ? f1(f21, f23, l) : f1(f23, f11, l);
                if (f1 <= f2) {
                    i = i3;
                } else {
                    M(canvas2, i3, rectFArr[i3], z);
                    canvas2.save();
                    float f27 = (f25 / 2.0f) + f24;
                    if (i3 == 2) {
                        i = i3;
                        o0(canvas2, this.L1, rectF2.left + gl.L(26.0f), f27, gl.L(20.0f), f1);
                        canvas2 = canvas;
                    } else {
                        i = i3;
                        if (i == 0) {
                            canvas2 = canvas;
                            o0(canvas2, this.S1, rectF2.left + gl.L(26.0f), f27, gl.L(20.0f), f1);
                        } else {
                            canvas2 = canvas;
                            boolean z2 = this.y0;
                            Bitmap bitmap2 = z2 ? this.O8 : this.P8;
                            if (bitmap2 != null) {
                                f3 = 26.0f;
                            } else {
                                int round = Math.round(gl.L(22.4f));
                                Bitmap createBitmap = Bitmap.createBitmap(round, round, Bitmap.Config.ALPHA_8);
                                f3 = 26.0f;
                                Canvas canvas3 = new Canvas(createBitmap);
                                float f28 = round / 24.0f;
                                canvas3.scale(f28, f28);
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
                                if (z2) {
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
                            float L5 = rectF2.left + gl.L(f3);
                            Paint paint6 = this.Q8;
                            paint6.setColor(-1);
                            paint6.setAlpha((int) (f * f1));
                            canvas2.drawBitmap(bitmap2, L5 - (bitmap2.getWidth() / 2.0f), f27 - (bitmap2.getHeight() / 2.0f), paint6);
                        }
                    }
                    textPaint.setTextSize(gl.L(15.0f));
                    textPaint.setColor(-1);
                    textPaint.setAlpha((int) (f1 * f));
                    canvas2.drawText(strArr[i], rectF2.left + gl.L(52.0f), strArr2[i] != null ? f27 - gl.L(2.0f) : gl.L(5.0f) + f27, textPaint);
                    if (strArr2[i] != null) {
                        textPaint.setTextSize(gl.L(12.0f));
                        textPaint.setColor(-1493172225);
                        textPaint.setAlpha((int) (166.0f * f1));
                        canvas2.drawText(strArr2[i], rectF2.left + gl.L(52.0f), f27 + gl.L(14.0f), textPaint);
                    }
                    canvas2.restore();
                }
                f24 = f26;
            }
            i3 = i + 1;
            f18 = f;
            f20 = f2;
            f21 = 0.15f;
            z = false;
            i2 = 1;
            f23 = 0.6f;
            f11 = 1.0f;
        }
        canvas2.restore();
        canvas2.restore();
    }

    public final void K0() {
        if (this.W4 != null || this.V4) {
            return;
        }
        this.V4 = true;
        Utilities.e.c(new mw8(this, bm2.o(bm2.f(0.4f, N0(), -16777216), 16), (byte) 0));
    }

    public final void L(float f, float f2, float f3, float f4, Canvas canvas, RectF rectF) {
        float min = Math.min(f3, f4);
        float max = Math.max(f3, f4);
        Paint paint = this.a6;
        if (min > 0.002f) {
            paint.setShader(null);
            paint.setColor(g(min, 16777215));
            canvas.drawRect(f, rectF.top, f2, rectF.bottom, paint);
        }
        float f5 = max - min;
        if (f5 > 0.002f) {
            LinearGradient linearGradient = f4 >= f3 ? this.X5 : this.Y5;
            Matrix matrix = this.Z5;
            matrix.setScale(f2 - f, 1.0f);
            matrix.postTranslate(f, 0.0f);
            linearGradient.setLocalMatrix(matrix);
            paint.setShader(linearGradient);
            paint.setColor(-1);
            paint.setAlpha((int) (f5 * 255.0f));
            canvas.drawRect(f, rectF.top, f2, rectF.bottom, paint);
            paint.setShader(null);
        }
    }

    public final float L0(float f) {
        if (!this.z3 || this.r4 <= 0.001f) {
            return 0.0f;
        }
        float f2 = this.q4;
        float[] fArr = lcd.b;
        float max = f2 / Math.max(0.3f, fArr[50]);
        if (max > 4.0f || max < -4.0f) {
            return 0.0f;
        }
        return Math.min(gl.N(fArr[42]), (gl.L(3.5f) / 2.0f) / 0.607f) * f * max * ((float) Math.exp((-0.5f) * max * max)) * this.r4;
    }

    public final void M(Canvas canvas, int i, RectF rectF, boolean z) {
        float X0;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        boolean z2 = this.r9 == i;
        long[] jArr = this.x9;
        if (z2) {
            X0 = X0(i, currentAnimationTimeMillis);
        } else {
            if (jArr[i] == 0) {
                return;
            } else {
                X0 = this.y9[i] * ((float) Math.exp((-(currentAnimationTimeMillis - r10)) / 180.0f));
            }
        }
        if (!z2 && X0 < 0.004f) {
            jArr[i] = 0;
            return;
        }
        float B = yjb.B(X0, 2.0f, 3.0f, X0 * X0);
        float min = Math.min(1.0f, (currentAnimationTimeMillis - this.w9[i]) / 320.0f);
        float f = 1.0f - min;
        float v = oo1.v(f, f, f, 1.0f);
        if (!z2 || X0 < 0.996f || min < 1.0f) {
            invalidate();
        }
        float max = Math.max(rectF.left, Math.min(rectF.right, this.u9[i]));
        float max2 = Math.max(rectF.top, Math.min(rectF.bottom, this.v9[i]));
        float max3 = (float) Math.max(Math.hypot(max - rectF.left, max2 - rectF.top), Math.max(Math.hypot(max - rectF.right, max2 - rectF.top), Math.max(Math.hypot(max - rectF.left, max2 - rectF.bottom), Math.hypot(max - rectF.right, max2 - rectF.bottom))));
        int i2 = (16777215 & (z ? 335544320 : 738197503)) | (((int) ((r7 >>> 24) * B)) << 24);
        Paint paint = this.s9;
        paint.setColor(i2);
        Path path = this.t9;
        path.rewind();
        if (i == 3 || i == 4 || i == 11) {
            path.addOval(rectF, Path.Direction.CW);
        } else if (i >= 6 || i == 5) {
            float min2 = Math.min(gl.L(20.0f), rectF.height() / 2.0f);
            path.addRoundRect(rectF, min2, min2, Path.Direction.CW);
        } else {
            path.addRect(rectF, Path.Direction.CW);
        }
        canvas.save();
        canvas.clipPath(path);
        canvas.drawCircle(max, max2, Math.max(gl.L(6.0f), max3 * v), paint);
        canvas.restore();
    }

    public final void M0(int i, tw8 tw8Var, int i2, int i3) {
        int i4 = i * 7;
        byte b = tw8Var.a;
        float[] fArr = this.k3;
        if (b == 0 && tw8Var.f == G9) {
            fArr[i4] = 0.0f;
            fArr[i4 + 1] = 0.0f;
            fArr[i4 + 2] = 0.0f;
            float f = K9;
            fArr[i4 + 3] = f;
            float f2 = L9;
            fArr[i4 + 4] = f2;
            fArr[i4 + 5] = 1.0f / ((i3 * f2) + (i2 * f));
            fArr[i4 + 6] = 0.5f;
        } else {
            fArr[i4] = 1.0f;
            fArr[i4 + 1] = i2 / 2.0f;
            fArr[i4 + 2] = (l() / 2.0f) + m();
            fArr[i4 + 3] = 0.0f;
            fArr[i4 + 4] = 0.0f;
            fArr[i4 + 5] = 1.0f / (((float) Math.hypot(i2, i3)) * 0.62f);
            fArr[i4 + 6] = 0.55f;
        }
        int i5 = i * 3;
        int i6 = tw8Var.b;
        int[] iArr = this.m3;
        iArr[i5] = i6;
        iArr[i5 + 1] = tw8Var.g;
        iArr[i5 + 2] = tw8Var.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x0c7c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0cca  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0aa4  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0aad  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0b70  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0bc2  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0bf7  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0c38  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0c3d  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0c40 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0bef  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0c46 A[EDGE_INSN: B:294:0x0c46->B:295:0x0c46 BREAK  A[LOOP:2: B:245:0x0aa9->B:277:0x0c40], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0c4b A[LOOP:3: B:296:0x0c47->B:298:0x0c4b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0c74  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N(Canvas canvas, int i, int i2) {
        RectF rectF;
        float f;
        float f2;
        float f3;
        float f4;
        int i3;
        float f5;
        int i4;
        vw8 vw8Var;
        Canvas canvas2;
        float f6;
        float f7;
        RectF rectF2;
        int i5;
        int i6;
        float f8;
        float f9;
        float f10;
        RectF rectF3;
        boolean z;
        ArrayList arrayList;
        float f11;
        int i7;
        float[] fArr;
        int i8;
        float f12;
        float v;
        float f13;
        boolean z2;
        float f14;
        float f15;
        float f16;
        float f17;
        TLRPC.Document document;
        ArrayList<TLRPC.Document> arrayList2;
        RectF rectF4;
        long j;
        float f18;
        float f19;
        float R1;
        float f20;
        float f21;
        float z3;
        float f22;
        int i9;
        int i10;
        float f23;
        float l;
        float f24;
        int i11;
        int i12;
        LinearGradient[] linearGradientArr;
        LinearGradient linearGradient;
        float R12;
        float L;
        float min;
        vw8 vw8Var2 = this;
        float f25 = vw8Var2.g1;
        if (f25 <= 0.001f) {
            return;
        }
        float l2 = Utilities.l(f25);
        float b1 = vw8Var2.b1();
        float a1 = vw8Var2.a1();
        float f26 = a1 - b1;
        float L2 = gl.L(10.0f);
        float L3 = i - gl.L(10.0f);
        RectF rectF5 = vw8Var2.u7;
        rectF5.set(L2, f26, L3, a1);
        float height = (vw8Var2.getHeight() - vw8Var2.v3) - gl.L(40.0f);
        float L4 = gl.L(10.0f) - gl.L(3.0f);
        float f27 = i;
        float f28 = f27 / 2.0f;
        float max = Math.max(L4, gl.R1(f28 - gl.L(72.0f), rectF5.left, f25));
        float R13 = gl.R1(height - gl.L(20.0f), f26, f25);
        float min2 = Math.min(f27 - L4, gl.R1(f28 + gl.L(72.0f), rectF5.right, f25));
        float R14 = gl.R1(gl.L(20.0f) + height, a1, l2);
        RectF rectF6 = vw8Var2.z7;
        rectF6.set(max, R13, min2, R14);
        float min3 = Math.min(rectF6.height() / 2.0f, gl.U1(l2, gl.L(20.0f), gl.L(28.17f)));
        float f29 = 0.5f;
        vw8Var2.A6 = l2 > 0.5f;
        if (l2 >= 0.35f) {
            f = 0.35f;
            if (vw8Var2.e6 || vw8Var2.h1 <= 0.5f) {
                f2 = 10.0f;
                rectF = rectF5;
            } else {
                vw8Var2.e6 = true;
                f2 = 10.0f;
                rectF = rectF5;
                vw8Var2.c6 = AnimationUtils.currentAnimationTimeMillis();
            }
        } else {
            rectF = rectF5;
            f = 0.35f;
            f2 = 10.0f;
        }
        if (l2 < 0.05f) {
            vw8Var2.e6 = false;
        }
        vw8Var2.r6 = l2;
        vw8Var2.s6 = true;
        vw8Var2.J(canvas, rectF6, min3, 1.0f);
        vw8Var2.s6 = false;
        vw8Var2.A6 = false;
        tw8 tw8Var = vw8Var2.n;
        int i13 = tw8Var != null ? tw8Var.h : TLObject.FLAG_30;
        float f30 = f2;
        Paint paint = vw8Var2.A1;
        paint.setColor(i13);
        paint.setAlpha((int) (Color.alpha(i13) * l2));
        float[][] fArr2 = lcd.a;
        if (l2 > 0.5f) {
            float min4 = Math.min(0.0f, gl.N(fArr2[2][8]));
            RectF rectF7 = vw8Var2.V5;
            rectF7.set(rectF6);
            rectF7.inset(min4, min4);
            float f31 = min3 - min4;
            canvas.drawRoundRect(rectF7, f31, f31, paint);
        } else {
            canvas.drawRoundRect(rectF6, min3, min3, paint);
        }
        float l3 = 1.0f - Utilities.l(l2 / f);
        int i14 = 3;
        Path path = vw8Var2.F1;
        if (l3 > 0.0f) {
            canvas.save();
            path.rewind();
            path.addRoundRect(rectF6, min3, min3, Path.Direction.CW);
            canvas.clipPath(path);
            float L5 = gl.L(144.0f) / 3.0f;
            int i15 = 0;
            while (i15 < i14) {
                int i16 = i14;
                float v2 = de9.v(i15, f29, L5, f28 - gl.L(72.0f));
                Drawable drawable = vw8Var2.f7[i15];
                float R15 = gl.R1(height, height - gl.L(f30), l2);
                float L6 = gl.L(i15 == 1 ? 24.5f : 22.0f);
                float f32 = min3;
                float f33 = l2 * 0.15f;
                int i17 = i15 == vw8Var2.i1 ? 1 : 0;
                int i18 = i15;
                float f34 = l3;
                o0(canvas, drawable, v2, R15, yjb.z(f33, i17, 1.0f, L6), f34);
                f29 = 0.5f;
                l3 = f34;
                vw8Var2 = this;
                min3 = f32;
                L5 = L5;
                i14 = i16;
                l2 = l2;
                i15 = i18 + 1;
            }
            vw8Var = vw8Var2;
            f3 = f29;
            f4 = l2;
            i3 = i14;
            i4 = 1;
            f5 = min3;
            canvas.restore();
        } else {
            f3 = 0.5f;
            f4 = l2;
            i3 = 3;
            f5 = min3;
            i4 = 1;
            vw8Var = vw8Var2;
        }
        float f35 = vw8Var.y7;
        if (f35 <= 0.004f) {
            return;
        }
        int i19 = f35 < 0.999f ? i4 : 0;
        if (i19 != 0) {
            RectF rectF8 = rectF;
            int i20 = (int) (f35 * 255.0f);
            canvas2 = canvas;
            rectF2 = rectF8;
            canvas2.saveLayerAlpha(rectF8.left, f26, rectF8.right, a1, i20);
            f6 = f26;
            f7 = a1;
        } else {
            canvas2 = canvas;
            f6 = f26;
            f7 = a1;
            rectF2 = rectF;
        }
        canvas2.save();
        path.rewind();
        path.addRoundRect(rectF6, f5, f5, Path.Direction.CW);
        canvas2.clipPath(path);
        int i21 = vw8Var.i1 != i4 ? i4 : 0;
        if (i21 != 0) {
            canvas2.saveLayer(rectF6, null);
        }
        canvas2.save();
        canvas2.translate(0.0f, (1.0f - vw8Var.y7) * gl.L(14.0f));
        canvas2.translate(0.0f, -vw8Var.k1);
        float L7 = gl.L(4.0f) + f6;
        int i22 = vw8Var.i1;
        if (i22 == 0) {
            float width = (rectF2.width() - gl.L(8.0f)) / 6.0f;
            float min5 = Math.min(width - gl.L(f30), gl.L(44.0f));
            int i23 = vw8Var.h1 > f3 ? i4 : 0;
            if (i23 != 0) {
                float V0 = vw8Var.V0();
                f19 = 1.0f;
                float f36 = 1.0f - V0;
                R1 = gl.R1(0.8f, 1.0f, oo1.v(f36, f36, f36, 1.0f));
                f20 = V0;
            } else {
                f19 = 1.0f;
                R1 = gl.R1(0.96f, 1.0f, vw8Var.y7);
                f20 = 1.0f;
            }
            if (i23 != 0 && f20 < f19) {
                vw8Var.invalidate();
            }
            canvas2.save();
            float centerX = rectF2.centerX();
            float f37 = vw8Var.k1;
            if (i23 != 0) {
                z3 = f37 + f7;
                f21 = 0.8f;
            } else {
                f21 = 0.8f;
                z3 = oo1.z(f7, f6, 2.0f, f37 + f6);
            }
            canvas2.scale(R1, R1, centerX, z3);
            int i24 = 0;
            while (i24 < ld0.b.length) {
                int c = ld0.c(i24);
                float f38 = f3;
                float v3 = de9.v(i24 % 6, f38, width, rectF2.left + gl.L(4.0f));
                float v4 = de9.v(i24 / 6, f38, width, L7);
                float f39 = v4 - vw8Var.k1;
                float f40 = L7;
                if (f39 > i2 + width || f39 < f6 - width) {
                    f22 = f6;
                    i9 = i21;
                    i10 = i19;
                    f23 = width;
                } else {
                    float max2 = Math.max(0.0f, Math.min(f30, (f39 - f6) / width));
                    if (i23 != 0) {
                        l = Utilities.l(((f20 * 420.0f) - (max2 * 12.0f)) / 300.0f);
                        f24 = 0.82f;
                    } else {
                        l = Utilities.l((vw8Var.y7 - (max2 * 0.02f)) / f21);
                        f24 = 0.85f;
                    }
                    float f41 = 1.0f - l;
                    float j1 = (((1.0f - ((f41 * f41) * f41)) * (1.0f - f24)) + f24) * vw8Var.j1(i24);
                    if (j1 != 1.0f) {
                        canvas2.save();
                        canvas2.scale(j1, j1, v3, v4);
                    }
                    float f42 = min5 / 2.0f;
                    float f43 = f6;
                    if (c == G9) {
                        i11 = -12602881;
                    } else {
                        k();
                        i11 = C9[c];
                    }
                    int i25 = i11;
                    if (c == G9) {
                        i12 = -15308082;
                    } else {
                        k();
                        i12 = D9[c];
                    }
                    int i26 = i12;
                    tw8 tw8Var2 = vw8Var.n;
                    if (tw8Var2 != null && tw8Var2.a == 0) {
                        int i27 = tw8Var2.f;
                    }
                    float f44 = i24 == vw8Var.u8 ? vw8Var.w8 : i24 == vw8Var.v8 ? vw8Var.x8 : 0.0f;
                    paint.setColor(-1);
                    LinearGradient[] linearGradientArr2 = vw8Var.r8;
                    float f45 = f44;
                    int length = linearGradientArr2.length;
                    int[] iArr = ld0.b;
                    if (length != iArr.length) {
                        linearGradientArr = new LinearGradient[iArr.length];
                        vw8Var.r8 = linearGradientArr;
                        vw8Var.s8 = new int[iArr.length];
                    } else {
                        linearGradientArr = linearGradientArr2;
                    }
                    LinearGradient linearGradient2 = linearGradientArr[i24];
                    if (linearGradient2 == null || vw8Var.s8[i24] != (i25 * 31) + i26) {
                        LinearGradient linearGradient3 = new LinearGradient(0.0f, 0.0f, 1.0f, 1.0f, i25, i26, Shader.TileMode.CLAMP);
                        linearGradientArr[i24] = linearGradient3;
                        vw8Var.s8[i24] = (i25 * 31) + i26;
                        linearGradient = linearGradient3;
                    } else {
                        linearGradient = linearGradient2;
                    }
                    float f46 = f42 * 2.0f;
                    Matrix matrix = vw8Var.d7;
                    matrix.setScale(f46, f46);
                    float f47 = v3 - f42;
                    i9 = i21;
                    float f48 = v4 - f42;
                    matrix.postTranslate(f47, f48);
                    linearGradient.setLocalMatrix(matrix);
                    paint.setShader(linearGradient);
                    canvas2.drawCircle(v3, v4, f42, paint);
                    paint.setShader(null);
                    float max3 = Math.max(0.0f, -gl.N(fArr2[i3][8])) + 1.0f;
                    float f49 = (v3 + f42) - max3;
                    float f50 = (v4 + f42) - max3;
                    RectF rectF9 = vw8Var.c7;
                    rectF9.set(f47 + max3, f48 + max3, f49, f50);
                    i10 = i19;
                    float f51 = f45;
                    f23 = width;
                    float f52 = f21;
                    f22 = f43;
                    vw8Var.t8.a(f42 - max3, 1.0f, 3, canvas, rectF9);
                    canvas2 = canvas;
                    if (f51 > 0.01f) {
                        boolean z4 = i24 == vw8Var.u8;
                        float L8 = (f42 - gl.L(4.0f)) - gl.L(1.0f);
                        if (z4) {
                            R12 = gl.R1(f52, 1.0f, f51) * L8;
                            L = gl.L(2.0f);
                            min = f51;
                        } else {
                            R12 = gl.R1(f42 - gl.N(1.0f), L8, f51);
                            L = gl.L(2.0f) * f51;
                            min = Math.min(1.0f, f51 * 3.0f);
                        }
                        double h = bm2.h(i25);
                        Paint paint2 = vw8Var.B1;
                        if (h > 0.62d) {
                            paint2.setColor(a(min, 939524096));
                            float N = gl.N(1.2f);
                            if (z4) {
                                f51 = 1.0f;
                            }
                            paint2.setStrokeWidth((N * f51) + L);
                            canvas2.drawCircle(v3, v4, R12, paint2);
                        }
                        paint2.setColor(a(min, -1));
                        paint2.setStrokeWidth(L);
                        canvas2.drawCircle(v3, v4, R12, paint2);
                    }
                    if (j1 != 1.0f) {
                        canvas2.restore();
                        vw8Var.invalidate();
                    }
                }
                i24++;
                f6 = f22;
                width = f23;
                i19 = i10;
                L7 = f40;
                i21 = i9;
                f3 = 0.5f;
                f21 = 0.8f;
                f30 = 10.0f;
            }
            i5 = i21;
            i6 = i19;
            canvas2.restore();
        } else {
            float f53 = f6;
            i5 = i21;
            i6 = i19;
            float f54 = 1.2f;
            if (i22 != i4) {
                boolean z5 = vw8Var.h1 > 0.5f;
                float V02 = z5 ? vw8Var.V0() : 1.0f;
                boolean z6 = z5 && V02 < 1.0f;
                if (z6) {
                    float f55 = 1.0f - V02;
                    float R16 = gl.R1(0.75f, 1.0f, oo1.v(f55, f55, f55, 1.0f));
                    canvas2.save();
                    canvas2.scale(R16, R16, rectF2.centerX(), vw8Var.k1 + f7);
                    vw8Var.invalidate();
                }
                boolean h0 = vw8Var.h0();
                ArrayList arrayList3 = vw8Var.w1;
                if (h0) {
                    float centerX2 = rectF2.centerX();
                    float L10 = gl.L(99.0f);
                    Typeface o = gl.o();
                    f11 = 250.0f;
                    TextPaint textPaint = vw8Var.a8;
                    textPaint.setTypeface(o);
                    textPaint.setTextSize(gl.L(16.0f));
                    Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
                    int width2 = (int) (rectF2.width() - gl.L(32.0f));
                    f8 = f7;
                    f9 = V02;
                    boolean z7 = vw8Var.x1 > 0;
                    boolean z8 = !z7;
                    StaticLayout staticLayout = vw8Var.f8;
                    boolean z9 = z7;
                    TextPaint textPaint2 = vw8Var.b8;
                    if (staticLayout == null || vw8Var.g8 != width2 || vw8Var.h8 != z8) {
                        vw8Var.g8 = width2;
                        vw8Var.h8 = z8;
                        textPaint2.setTextSize(gl.L(14.0f));
                        Paint.FontMetrics fontMetrics2 = textPaint2.getFontMetrics();
                        vw8Var.f8 = new StaticLayout(k96.M0(!z9 ? 2131746308 : 2131746300, null), textPaint2, width2, Layout.Alignment.ALIGN_CENTER, 1.0f, gl.L(18.5f) - (fontMetrics2.descent - fontMetrics2.ascent), false);
                    }
                    float z10 = oo1.z(gl.L(300.0f), ((((fontMetrics.descent - fontMetrics.ascent) + (gl.L(22.0f) + L10)) + gl.L(7.0f)) + vw8Var.f8.getHeight()) + (vw8Var.x1 > 0 ? gl.L(20.0f) + gl.L(36.0f) : 0), 2.0f, f53) - gl.L(8.0f);
                    TLRPC.Document document2 = vw8Var.p8;
                    int i28 = vw8Var.b;
                    if (document2 != null) {
                        f17 = z10;
                        f16 = 36.0f;
                        document = document2;
                    } else {
                        if (vw8Var.o8 == null) {
                            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                            vw8Var.o8 = tL_inputStickerSetShortName;
                            f16 = 36.0f;
                            tL_inputStickerSetShortName.short_name = "Redo_edc21keMa";
                        } else {
                            f16 = 36.0f;
                        }
                        if (vw8Var.n8) {
                            f17 = z10;
                            document = null;
                        } else {
                            vw8Var.n8 = true;
                            f17 = z10;
                            TLRPC.TL_messages_stickerSet m0 = hq6.d0(i28).m0(vw8Var.o8, null, false, false, new zf7(vw8Var, (byte) 23));
                            if (m0 != null && (arrayList2 = m0.documents) != null && !arrayList2.isEmpty()) {
                                vw8Var.p8 = m0.documents.get(0);
                            }
                            document = vw8Var.p8;
                        }
                    }
                    if (document != null) {
                        vl vlVar = vw8Var.k8;
                        f10 = f53;
                        rectF4 = rectF6;
                        if (vlVar != null) {
                            if (vw8Var.m8 != document.id) {
                                vlVar.o(vw8Var);
                            }
                        }
                        vl l4 = vl.l(i28, 14, document);
                        vw8Var.k8 = l4;
                        l4.b(vw8Var);
                        vw8Var.m8 = document.id;
                        vw8Var.q8 = 0L;
                    } else {
                        f10 = f53;
                        rectF4 = rectF6;
                    }
                    vl vlVar2 = vw8Var.k8;
                    ml mlVar = vlVar2 != null ? vlVar2.k : null;
                    long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    if (mlVar == null || !mlVar.B()) {
                        z = z6;
                        j = 0;
                    } else {
                        z = z6;
                        j = 0;
                        if (vw8Var.q8 == 0) {
                            vw8Var.q8 = currentAnimationTimeMillis;
                        }
                    }
                    float min6 = vw8Var.q8 == j ? 0.0f : Math.min(1.0f, (currentAnimationTimeMillis - r12) / 250.0f);
                    float B = yjb.B(min6, 2.0f, 3.0f, min6 * min6);
                    float l5 = vw8Var.h1 > 0.5f ? Utilities.l(vw8Var.V0() / 0.7f) : 1.0f;
                    float f56 = 1.0f - l5;
                    float v5 = oo1.v(f56, f56, f56, 1.0f);
                    float R17 = gl.R1(0.95f, 1.0f, v5);
                    if (l5 < 1.0f) {
                        vw8Var.invalidate();
                    }
                    canvas2.save();
                    canvas2.translate(0.0f, (1.0f - v5) * gl.L(6.0f));
                    float f57 = L10 / 2.0f;
                    canvas2.scale(R17, R17, centerX2, (f17 - gl.L(2.0f)) + f57);
                    oy8 oy8Var = vw8Var.l8;
                    if (B < 1.0f) {
                        if (oy8Var == null) {
                            int i29 = (int) L10;
                            oy8 oy8Var2 = new oy8(R.raw.qr_resistance_dog, i29, i29, true, null);
                            vw8Var.l8 = oy8Var2;
                            oy8Var2.F(1);
                            vw8Var.l8.E(true);
                            vw8Var.l8.M(vw8Var);
                            vw8Var.l8.setCallback(vw8Var);
                            vw8Var.l8.start();
                        }
                        if (vw8Var.l8.p()) {
                            f18 = centerX2;
                            vw8Var.l8.setBounds((int) (centerX2 - f57), (int) (f17 - gl.L(2.0f)), (int) (centerX2 + f57), (int) ((f17 - gl.L(2.0f)) + L10));
                            vw8Var.l8.setAlpha((int) ((1.0f - B) * f4 * 255.0f));
                            vw8Var.l8.draw(canvas2);
                        } else {
                            f18 = centerX2;
                        }
                        vw8Var.invalidate();
                    } else {
                        f18 = centerX2;
                        if (oy8Var != null) {
                            oy8Var.x(false);
                            vw8Var.l8 = null;
                        }
                    }
                    vl vlVar3 = vw8Var.k8;
                    if (vlVar3 != null && B > 0.0f) {
                        vlVar3.setBounds((int) (f18 - f57), (int) (f17 - gl.L(2.0f)), (int) (f18 + f57), (int) ((f17 - gl.L(2.0f)) + L10));
                        vw8Var.k8.setAlpha((int) (f4 * 255.0f * B));
                        vw8Var.k8.draw(canvas2);
                    }
                    canvas2.restore();
                    textPaint.setColor(-1);
                    int i30 = (int) (f4 * 255.0f);
                    textPaint.setAlpha(i30);
                    Paint.FontMetrics fontMetrics3 = textPaint.getFontMetrics();
                    float L11 = ((f17 + L10) + gl.L(18.0f)) - fontMetrics3.ascent;
                    String str = vw8Var.i8;
                    canvas2.drawText(str, f18 - (textPaint.measureText(str) / 2.0f), L11, textPaint);
                    textPaint2.setColor(-1);
                    textPaint2.setAlpha((int) (191.0f * f4));
                    float L12 = L11 + fontMetrics3.descent + gl.L(7.0f);
                    canvas2.save();
                    canvas2.translate(f18 - (vw8Var.f8.getWidth() / 2.0f), L12);
                    vw8Var.f8.draw(canvas2);
                    canvas2.restore();
                    long j2 = vw8Var.x1;
                    RectF rectF10 = vw8Var.Z7;
                    if (j2 > 0) {
                        float height2 = L12 + vw8Var.f8.getHeight() + gl.L(20.0f);
                        Typeface o2 = gl.o();
                        TextPaint textPaint3 = vw8Var.c8;
                        textPaint3.setTypeface(o2);
                        textPaint3.setTextSize(gl.L(14.0f));
                        String str2 = vw8Var.j8;
                        float measureText = textPaint3.measureText(str2) + (gl.L(19.0f) << 1);
                        float L13 = gl.L(f16);
                        float f58 = measureText / 2.0f;
                        rectF10.set(f18 - f58, height2, f18 + f58, height2 + L13);
                        rectF3 = rectF4;
                        arrayList = arrayList3;
                        int saveLayer = canvas2.saveLayer(rectF10.left - 1.0f, rectF10.top - 1.0f, rectF10.right + 1.0f, rectF10.bottom + 1.0f, null);
                        paint.setColor(-1);
                        paint.setAlpha(i30);
                        float f59 = L13 / 2.0f;
                        canvas2.drawRoundRect(rectF10, f59, f59, paint);
                        vw8Var.M(canvas2, 10, rectF10, true);
                        Typeface o3 = gl.o();
                        TextPaint textPaint4 = vw8Var.e8;
                        textPaint4.setTypeface(o3);
                        textPaint4.setTextSize(gl.L(14.0f));
                        Paint.FontMetrics fontMetrics4 = textPaint4.getFontMetrics();
                        canvas2.drawText(str2, f18 - (textPaint4.measureText(str2) / 2.0f), rectF10.centerY() - ((fontMetrics4.ascent + fontMetrics4.descent) / 2.0f), textPaint4);
                        canvas2.restoreToCount(saveLayer);
                        if (vw8Var.d8 == null) {
                            TextPaint textPaint5 = new TextPaint(1);
                            vw8Var.d8 = textPaint5;
                            textPaint5.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.MULTIPLY));
                        }
                        vw8Var.d8.setTypeface(gl.o());
                        vw8Var.d8.setTextSize(gl.L(14.0f));
                        tw8 tw8Var3 = vw8Var.n;
                        vw8Var.d8.setColor(D0(0.9f, 1.4f, 0.1f, tw8Var3 != null ? bm2.f(0.5f, tw8Var3.b, tw8Var3.c) : -8355712));
                        vw8Var.d8.setAlpha(i30);
                        canvas2.drawText(str2, f18 - (vw8Var.d8.measureText(str2) / 2.0f), rectF10.centerY() - ((fontMetrics4.ascent + fontMetrics4.descent) / 2.0f), vw8Var.d8);
                    } else {
                        rectF3 = rectF4;
                        arrayList = arrayList3;
                        rectF10.setEmpty();
                    }
                } else {
                    f8 = f7;
                    f9 = V02;
                    f10 = f53;
                    rectF3 = rectF6;
                    z = z6;
                    arrayList = arrayList3;
                    f11 = 250.0f;
                    if (arrayList.isEmpty()) {
                        TextPaint textPaint6 = vw8Var.D1;
                        textPaint6.setColor(-1275068417);
                        textPaint6.setTextSize(gl.L(14.0f));
                        String M0 = k96.M0(!vw8Var.y1 ? 2131746302 : vw8Var.x1 < 0 ? 2131746308 : 2131746301, null);
                        canvas2.drawText(M0, (f27 - textPaint6.measureText(M0)) / 2.0f, L7 + gl.L(40.0f), textPaint6);
                    }
                }
                int f0 = vw8Var.f0();
                int size = arrayList.size();
                float width3 = (rectF2.width() - gl.L(8.0f)) / 3.0f;
                float f60 = f0;
                float width4 = (rectF2.width() - gl.L(8.0f)) / f60;
                float f61 = L7 + 0.0f;
                vw8Var.q6 = false;
                vw8Var.i6 = 0;
                int max4 = (int) Math.max(0.0d, Math.floor(((f10 + vw8Var.k1) - f61) / width3));
                vw8Var.g6 = max4;
                int max5 = (int) Math.max(max4, Math.floor(((f8 + vw8Var.k1) - f61) / width3));
                vw8Var.h6 = max5;
                int i31 = (max5 - vw8Var.g6) + 1;
                boolean z11 = vw8Var.h1 < 0.5f;
                vw8Var.f6 = z11;
                if (z11) {
                    vw8Var.k6 = AnimationUtils.currentAnimationTimeMillis() - vw8Var.d6;
                    vw8Var.j6 = Math.min(25.0f, 60.0f / Math.max(1, r1));
                    vw8Var.l6 = 0.6f;
                    vw8Var.m6 = gl.L(4.0f);
                } else {
                    float currentAnimationTimeMillis2 = !vw8Var.e6 ? 0.0f : AnimationUtils.currentAnimationTimeMillis() - vw8Var.c6;
                    vw8Var.k6 = currentAnimationTimeMillis2;
                    if (currentAnimationTimeMillis2 > 470.0f) {
                        vw8Var.k6 = -1.0f;
                        if (z5) {
                            vw8Var.k6 = -1.0f;
                        }
                        i7 = 0;
                        while (true) {
                            fArr = vw8Var.n6;
                            if (i7 < size) {
                                break;
                            }
                            float f62 = i7 % f0;
                            float L14 = (width4 * f62) + rectF2.left + gl.L(4.0f);
                            float f63 = ((i7 / f0) * width3) + f61;
                            float f64 = vw8Var.k1;
                            if (f63 - f64 <= f8) {
                                float f65 = f63 + width3;
                                if (f65 - f64 >= f10) {
                                    vw8Var.p6 = 1.0f;
                                    if (vw8Var.k6 < 0.0f) {
                                        f12 = 1.0f;
                                    } else {
                                        if (vw8Var.f6) {
                                            float l6 = Utilities.l((vw8Var.k6 - ((f62 * 3.0f) + (Math.max(0, r1 - vw8Var.g6) * vw8Var.j6))) / 90.0f);
                                            f12 = 1.0f;
                                            vw8Var.p6 = gl.R1(1.0f, vw8Var.l6, l6 * l6);
                                            if (l6 >= 0.7f) {
                                                f13 = tb4.x(l6, 0.7f, 0.3f, 1.0f);
                                            }
                                        } else {
                                            float l7 = Utilities.l((vw8Var.k6 - ((f62 * 4.0f) + (Math.max(0, vw8Var.h6 - r1) * vw8Var.j6))) / 220.0f);
                                            float f66 = vw8Var.l6;
                                            if (vw8Var.q6) {
                                                v = S(l7, f54);
                                                f12 = 1.0f;
                                            } else {
                                                f12 = 1.0f;
                                                float f67 = 1.0f - l7;
                                                v = oo1.v(f67, f67, f67, 1.0f);
                                            }
                                            vw8Var.p6 = gl.R1(f66, f12, v);
                                            float l8 = f12 - Utilities.l(l7 / f);
                                            f13 = f12 - (l8 * l8);
                                        }
                                        z2 = f13 >= f12 || vw8Var.p6 != f12;
                                        if (z2) {
                                            canvas2.save();
                                            float f68 = f12;
                                            float f69 = f13;
                                            canvas2.translate(0.0f, Utilities.l((f68 - vw8Var.p6) / (f68 - vw8Var.l6)) * vw8Var.m6);
                                            float f70 = vw8Var.p6;
                                            canvas2.scale(f70, f70, (width4 / 2.0f) + L14, (width3 / 2.0f) + f63);
                                            if (f13 < f12) {
                                                float f71 = L14 + width4;
                                                int i32 = vw8Var.i6;
                                                if (i32 < 64) {
                                                    vw8Var.i6 = i32 + 1;
                                                    int i33 = i32 * 5;
                                                    fArr[i33] = L14;
                                                    fArr[i33 + 1] = f63;
                                                    fArr[i33 + 2] = f71;
                                                    fArr[i33 + 3] = f65;
                                                    fArr[i33 + 4] = f69;
                                                }
                                            }
                                        }
                                        if (z) {
                                            f14 = 1.0f;
                                            f15 = 1.0f;
                                        } else {
                                            f14 = 1.0f;
                                            float l9 = 1.0f - Utilities.l(((f9 * 420.0f) - (Math.max(0.0f, Math.min(10.0f, ((f63 - vw8Var.k1) - f10) / width3)) * 12.0f)) / 300.0f);
                                            f15 = ((1.0f - ((l9 * l9) * l9)) * 0.18f) + 0.82f;
                                        }
                                        if (f15 != f14) {
                                            canvas2.save();
                                            canvas2.scale(f15, f15, (width4 / 2.0f) + L14, (width3 / 2.0f) + f63);
                                        }
                                        byte b = vw8Var.G.a;
                                        Canvas canvas3 = canvas2;
                                        vw8 vw8Var3 = vw8Var;
                                        f54 = 1.2f;
                                        vw8Var3.I(canvas3, i7, (TL_stars.TL_starGiftUnique) arrayList.get(i7), L14 + gl.L(4.0f), f63 + gl.L(4.0f), width4 - gl.L(8.0f), width3 - gl.L(8.0f));
                                        vw8Var = vw8Var3;
                                        if (f15 != f14) {
                                            canvas.restore();
                                        }
                                        if (!z2) {
                                            canvas.restore();
                                        }
                                    }
                                    f13 = f12;
                                    if (f13 >= f12) {
                                    }
                                    if (z2) {
                                    }
                                    if (z) {
                                    }
                                    if (f15 != f14) {
                                    }
                                    byte b2 = vw8Var.G.a;
                                    Canvas canvas32 = canvas2;
                                    vw8 vw8Var32 = vw8Var;
                                    f54 = 1.2f;
                                    vw8Var32.I(canvas32, i7, (TL_stars.TL_starGiftUnique) arrayList.get(i7), L14 + gl.L(4.0f), f63 + gl.L(4.0f), width4 - gl.L(8.0f), width3 - gl.L(8.0f));
                                    vw8Var = vw8Var32;
                                    if (f15 != f14) {
                                    }
                                    if (!z2) {
                                    }
                                }
                            }
                            i7++;
                            canvas2 = canvas;
                        }
                        for (i8 = 0; i8 < vw8Var.i6; i8++) {
                            int i34 = i8 * 5;
                            int i35 = (int) (fArr[i34 + 4] * 255.0f);
                            Paint paint3 = vw8Var.o6;
                            paint3.setAlpha(i35);
                            canvas.drawRect(fArr[i34], fArr[i34 + 1], fArr[i34 + 2], fArr[i34 + 3], paint3);
                        }
                        vw8Var.i6 = 0;
                        if (z) {
                            canvas.restore();
                        }
                        canvas.restore();
                        if (i5 != 0) {
                            float L15 = gl.L(12.0f);
                            Matrix matrix2 = vw8Var.C7;
                            matrix2.setScale(1.0f, L15);
                            RectF rectF11 = rectF3;
                            matrix2.postTranslate(0.0f, rectF11.top);
                            LinearGradient linearGradient4 = vw8Var.A7;
                            linearGradient4.setLocalMatrix(matrix2);
                            float f72 = rectF11.left;
                            float f73 = rectF11.top;
                            canvas.drawRect(f72, f73, rectF11.right, f73 + L15, vw8Var.B7);
                            matrix2.setScale(1.0f, -L15);
                            matrix2.postTranslate(0.0f, rectF11.bottom);
                            linearGradient4.setLocalMatrix(matrix2);
                            float f74 = rectF11.left;
                            float f75 = rectF11.bottom;
                            canvas.drawRect(f74, f75 - L15, rectF11.right, f75, vw8Var.B7);
                            canvas.restore();
                        }
                        canvas.restore();
                        if (i6 != 0) {
                            canvas.restore();
                            return;
                        }
                        return;
                    }
                    vw8Var.j6 = Math.min(45.0f, (f11 - (f60 * 4.0f)) / Math.max(1, i31));
                    vw8Var.l6 = 0.7f;
                    vw8Var.m6 = gl.L(7.0f);
                }
                vw8Var.invalidate();
                if (z5) {
                }
                i7 = 0;
                while (true) {
                    fArr = vw8Var.n6;
                    if (i7 < size) {
                    }
                    i7++;
                    canvas2 = canvas;
                }
                while (i8 < vw8Var.i6) {
                }
                vw8Var.i6 = 0;
                if (z) {
                }
                canvas.restore();
                if (i5 != 0) {
                }
                canvas.restore();
                if (i6 != 0) {
                }
            }
        }
        rectF3 = rectF6;
        canvas.restore();
        if (i5 != 0) {
        }
        canvas.restore();
        if (i6 != 0) {
        }
    }

    public final int N0() {
        tw8 tw8Var = this.n;
        if (tw8Var == null) {
            return -16777216;
        }
        if (this.s >= 1.0f || this.r == null) {
            return tw8Var.e;
        }
        float l = (l() / 2.0f) + m();
        float l2 = Utilities.l(((((((float) Math.hypot(Math.max(this.x, getWidth() - this.x), Math.max(this.y, getHeight() - this.y))) + gl.L(60.0f)) * x1(this.s)) - ((float) Math.hypot((getWidth() / 2.0f) - this.x, l - this.y))) + gl.L(80.0f)) / gl.L(160.0f));
        int i = this.r.e;
        int i2 = this.n.e;
        float B = yjb.B(l2, 2.0f, 3.0f, l2 * l2);
        double[] dArr = this.r3;
        bm2.j(i, dArr);
        double[] dArr2 = this.s3;
        bm2.j(i2, dArr2);
        double d = B;
        double[] dArr3 = this.t3;
        if (dArr3.length != 3) {
            w26.j("outResult must have a length of 3.");
            return 0;
        }
        double d2 = 1.0d - d;
        double d3 = (dArr2[0] * d) + (dArr[0] * d2);
        dArr3[0] = d3;
        double d4 = (dArr2[1] * d) + (dArr[1] * d2);
        dArr3[1] = d4;
        double d5 = (dArr2[2] * d) + (dArr[2] * d2);
        dArr3[2] = d5;
        return bm2.b(d3, d4, d5);
    }

    public final void O(float f, float f2, float f3, int i, Canvas canvas, boolean z) {
        PorterDuffColorFilter m1 = m1(i);
        xt xtVar = this.U1;
        xtVar.setColorFilter(m1);
        xtVar.setAlpha(kk7.d4);
        float f4 = f3 / 2.0f;
        float f5 = f2 - f4;
        float f6 = f + f3;
        float f7 = f2 + f4;
        xtVar.setBounds((int) f, (int) f5, (int) f6, (int) f7);
        if (!z) {
            xtVar.draw(canvas);
            return;
        }
        float f8 = f3 * 0.095f;
        float f9 = (0.28f * f3) + f;
        float f10 = f2 - (0.21f * f3);
        float f11 = (0.74f * f3) + f;
        float f12 = (0.25f * f3) + f2;
        RectF rectF = this.V5;
        rectF.set(f - gl.L(2.0f), f5 - gl.L(2.0f), f6 + gl.L(2.0f), f7 + gl.L(2.0f));
        canvas.saveLayer(rectF, null);
        xtVar.draw(canvas);
        Paint paint = this.Z1;
        paint.setStrokeWidth((0.065f * f3 * 2.0f) + f8);
        canvas.drawLine(f9, f10, f11, f12, paint);
        canvas.restore();
        Paint paint2 = this.B1;
        paint2.setColor(i);
        paint2.setStrokeWidth(f8);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawLine(f9, f10, f11, f12, paint2);
        paint2.setStrokeCap(Paint.Cap.BUTT);
    }

    public final void O0() {
        this.Y1.x(false);
        Bitmap bitmap = this.S2;
        if (bitmap != null) {
            bitmap.recycle();
            this.S2 = null;
        }
        oy8 oy8Var = this.a9;
        if (oy8Var != null) {
            oy8Var.x(false);
            this.a9 = null;
        }
        oy8 oy8Var2 = this.l8;
        if (oy8Var2 != null) {
            oy8Var2.x(false);
            this.l8 = null;
        }
        vl vlVar = this.k8;
        if (vlVar != null) {
            vlVar.o(this);
            this.k8 = null;
            this.m8 = 0L;
        }
        P0(this.G);
        P0(this.H);
        removeCallbacks(this.p9);
        xsa xsaVar = this.j2;
        if (xsaVar != null) {
            xsaVar.f();
        }
        VelocityTracker velocityTracker = this.l0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.l0 = null;
        }
        VelocityTracker velocityTracker2 = this.m9;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.m9 = null;
        }
        HashMap hashMap = this.J7;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((vl) it.next()).o(this);
        }
        for (Drawable drawable : this.K.values()) {
            if (drawable instanceof vl) {
                ((vl) drawable).o(this);
            }
        }
        hashMap.clear();
        HashMap hashMap2 = this.K7;
        Iterator it2 = hashMap2.values().iterator();
        while (it2.hasNext()) {
            tl tlVar = ((uw8) it2.next()).a;
            if (tlVar != null) {
                tlVar.b();
            }
        }
        hashMap2.clear();
    }

    public final void P(float f, float f2, float f3, float f4, Canvas canvas) {
        if (this.q1 == null || f4 <= 0.004f) {
            return;
        }
        float L = gl.L(15.0f);
        TextPaint textPaint = this.z2;
        textPaint.setTextSize(L);
        textPaint.setColor(-1);
        textPaint.setAlpha((int) (f4 * 255.0f));
        canvas.drawText(this.q1, ((f + f3) - gl.L(16.0f)) - textPaint.measureText(this.q1), f2 + gl.L(5.0f), textPaint);
        textPaint.setAlpha(kk7.d4);
    }

    public final void P0(sw8 sw8Var) {
        if (sw8Var != null) {
            vl vlVar = sw8Var.c;
            if (vlVar != null) {
                vlVar.o(this);
            }
            vl vlVar2 = sw8Var.d;
            if (vlVar2 != null && !this.J7.containsValue(vlVar2)) {
                sw8Var.d.o(this);
            }
            sw8Var.G = true;
            tv8 tv8Var = sw8Var.F;
            if (tv8Var != null) {
                tv8Var.e = true;
                kk7.f(tv8Var.a).n(tv8Var, kk7.X1);
                sw8Var.F = null;
            }
        }
    }

    public final void Q(float f, float f2, float f3, Canvas canvas, boolean z) {
        Canvas canvas2;
        Canvas canvas3;
        float f4;
        float f5;
        if (this.W8 != 0) {
            if (z) {
                float L = f2 - gl.L(10.0f);
                Paint.Style style = Paint.Style.STROKE;
                Paint paint = this.R8;
                paint.setStyle(style);
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeWidth(gl.L(2.0f));
                paint.setColor(-1);
                paint.setAlpha(kk7.d4);
                float L2 = ((gl.L(26.0f) + f) - gl.L(10.0f)) + gl.L(10.0f);
                float L3 = L + gl.L(11.0f);
                float L4 = gl.L(7.25f);
                float f6 = 1.0f;
                if (f3 >= 0.0f) {
                    float l = 1.0f - Utilities.l(f3 / 0.42f);
                    float v = oo1.v(l, l, l, 1.0f);
                    if (f3 < 0.6f) {
                        float f7 = 1.0f - (f3 / 0.6f);
                        f5 = (1.0f - ((f7 * f7) * f7)) * 364.0f;
                    } else {
                        float l2 = Utilities.l((f3 - 0.6f) / 0.12f);
                        f5 = 364.0f - ((3.0f - (l2 * 2.0f)) * ((4.0f * l2) * l2));
                    }
                    f4 = f5;
                    f6 = v;
                } else {
                    f4 = 0.0f;
                }
                float f8 = L3 - L4;
                RectF rectF = this.S8;
                rectF.set(L2 - L4, f8, L2 + L4, L4 + L3);
                canvas.drawArc(rectF, -82.0f, f6 * 344.0f, false, paint);
                canvas.drawLine(L2, f8, L2, L + gl.L(2.2f), paint);
                double radians = Math.toRadians(f4 - 90.0f);
                canvas3 = canvas;
                canvas3.drawLine(L2, L3, oo1.e(3.8f, (float) Math.cos(radians), L2), oo1.e(3.8f, (float) Math.sin(radians), L3), paint);
                paint.setStyle(Paint.Style.FILL);
                canvas3.drawCircle(L2, L3, gl.N(1.2f), paint);
            } else {
                canvas3 = canvas;
                if (n()) {
                    oy8 o1 = o1();
                    int L5 = gl.L(28.0f);
                    float f9 = L5 / 2.0f;
                    int i = (int) (f2 - f9);
                    o1.setBounds((int) ((gl.L(26.0f) + f) - f9), i, ((int) ((gl.L(26.0f) + f) - f9)) + L5, L5 + i);
                    o1.draw(canvas3);
                } else {
                    int i2 = this.W8;
                    if (i2 == R.drawable.msg_download) {
                        oy8 p1 = p1();
                        int L6 = gl.L(28.0f);
                        float f10 = L6 / 2.0f;
                        int i3 = (int) (f2 - f10);
                        p1.setBounds((int) ((gl.L(26.0f) + f) - f10), i3, ((int) ((gl.L(26.0f) + f) - f10)) + L6, L6 + i3);
                        p1.draw(canvas3);
                    } else {
                        o0(canvas3, i2 == R.drawable.msg_retry ? this.S1 : i2 == R.drawable.msg_copy ? this.K1 : this.T1, f + gl.L(26.0f), f2, gl.L(20.0f), 1.0f);
                        canvas2 = canvas3;
                    }
                }
            }
            canvas2 = canvas3;
        } else {
            canvas2 = canvas;
            oy8 q1 = q1();
            int L7 = gl.L(27.0f);
            float f11 = L7 / 2.0f;
            int i4 = (int) (f2 - f11);
            q1.setBounds((int) ((gl.L(26.0f) + f) - f11), i4, ((int) ((gl.L(26.0f) + f) - f11)) + L7, L7 + i4);
            q1.draw(canvas2);
        }
        TextPaint textPaint = this.D1;
        textPaint.setColor(-1);
        float f12 = this.t1;
        if (f12 <= 0.0f) {
            f12 = gl.L(15.0f);
        }
        textPaint.setTextSize(f12);
        String str = this.U8;
        float L8 = f + gl.L(48.0f);
        float L10 = gl.L(5.0f) + f2;
        int indexOf = str.indexOf(10);
        if (indexOf >= 0) {
            canvas.drawText(str, 0, indexOf, L8, L10 - gl.L(9.0f), (Paint) textPaint);
            canvas.drawText(str, indexOf + 1, str.length(), L8, L10 + gl.L(9.0f), (Paint) textPaint);
            return;
        }
        Canvas canvas4 = canvas2;
        if (!s0(str)) {
            canvas4.drawText(str, L8, L10, textPaint);
            return;
        }
        float textSize = textPaint.getTextSize();
        TextPaint textPaint2 = this.z2;
        textPaint2.setTextSize(textSize);
        textPaint2.setColor(textPaint.getColor());
        canvas4.drawText(this.w2, L8, L10, textPaint);
        float measureText = textPaint.measureText(this.w2) + L8;
        canvas4.drawText(this.x2, measureText, L10, textPaint2);
        canvas4.drawText(this.y2, textPaint2.measureText(this.x2) + measureText, L10, textPaint);
    }

    public final void Q0() {
        int i = this.r9;
        if (i >= 0) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.y9[i] = X0(i, currentAnimationTimeMillis);
            this.x9[i] = currentAnimationTimeMillis;
            invalidate();
        }
        this.r9 = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x03de, code lost:
    
        if (r1.b0 < (r1.e[0] - 1)) goto L197;
     */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0251  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R(Canvas canvas, int i, long j) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        boolean z;
        float f6;
        float f7;
        float f8;
        float max;
        float f9;
        float f10;
        float height;
        int L;
        float f1;
        float f11;
        float f12;
        float f13;
        boolean z2;
        boolean z3;
        boolean z4;
        oy8 oy8Var;
        boolean z5;
        String sb;
        float f14;
        float L2;
        oy8 oy8Var2;
        float f15;
        String str;
        boolean z6 = this.g9 || (this.n1 != null && j < this.v1);
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (!this.g9 && z6 && this.N8 && (str = this.U8) != null && !str.equals(this.n1)) {
            this.N8 = false;
            this.M8 = currentAnimationTimeMillis;
        }
        boolean z7 = this.N8;
        if (z6) {
            if (!z7 && (this.U8 == null || currentAnimationTimeMillis - this.M8 >= 360)) {
                this.N8 = true;
                this.M8 = currentAnimationTimeMillis;
                this.U8 = this.n1;
                int i2 = this.o1;
                this.W8 = i2;
                this.q1 = this.p1;
                this.V8 = false;
                this.X8 = currentAnimationTimeMillis;
                if (i2 == 0) {
                    oy8 q1 = q1();
                    q1.I(0, false, false);
                    q1.start();
                } else if (n()) {
                    oy8 o1 = o1();
                    o1.I(0, false, false);
                    o1.start();
                } else if (this.W8 == R.drawable.msg_download) {
                    oy8 p1 = p1();
                    p1.I(0, false, false);
                    p1.start();
                }
            }
        } else if (z7) {
            this.N8 = false;
            this.M8 = currentAnimationTimeMillis;
        }
        String str2 = this.U8;
        if (str2 == null) {
            return;
        }
        float f16 = (currentAnimationTimeMillis - this.M8) / 1000.0f;
        if (this.N8) {
            boolean z8 = str2.indexOf(10) >= 0 || r1(this.U8) + ((float) gl.L(66.0f)) >= ((float) (i - gl.L(32.0f)));
            if (f16 >= 0.5f) {
                f4 = 1.0f;
                f15 = 2.0f;
                f = 0.0f;
            } else {
                f15 = 2.0f;
                f = 0.0f;
                f4 = (float) g1(f16, z8 ? 0.75d : 0.6d, 0.42d);
            }
            f2 = f15;
        } else {
            f = 0.0f;
            if (!this.V8) {
                if (f16 >= 0.36f) {
                    this.U8 = null;
                    return;
                }
                float f17 = f16 / 0.36f;
                float f18 = f17;
                int i3 = 0;
                float f19 = 1.0f;
                f2 = 2.0f;
                float f20 = 0.0f;
                while (i3 < 12) {
                    float f21 = (f20 + f19) / 2.0f;
                    float f22 = 1.0f - f21;
                    float f23 = f22 * 3.0f;
                    if (b00.w(f21, f21, f21, (f23 * f21 * f21 * 0.9f) + yjb.C(f23, f22, f21, 0.5f)) < f17) {
                        f20 = f21;
                    } else {
                        f19 = f21;
                    }
                    i3++;
                    f18 = f21;
                }
                f3 = 3.0f;
                f4 = 1.0f - (((f18 * f18) * f18) + (((((1.0f - f18) * 3.0f) * f18) * f18) * 0.5f));
                if (!this.N8 || f4 > f) {
                    invalidate();
                }
                boolean z9 = this.U8.indexOf(10) < 0;
                float L3 = gl.L(!z9 ? 14.0f : 15.0f);
                TextPaint textPaint = this.D1;
                textPaint.setTextSize(L3);
                float r1 = r1(this.U8);
                if (this.q1 == null) {
                    float L4 = gl.L(15.0f);
                    TextPaint textPaint2 = this.z2;
                    textPaint2.setTextSize(L4);
                    f5 = textPaint2.measureText(this.q1) + gl.L(16.0f);
                } else {
                    f5 = f;
                }
                float min = Math.min(i - gl.L(32.0f), gl.L(66.0f) + r1 + f5);
                float L5 = gl.L(!z9 ? 56.0f : 44.0f);
                float L6 = (min - gl.L(66.0f)) - f5;
                this.t1 = textPaint.getTextSize() * ((r1 > L6 || r1 <= f) ? 1.0f : Math.max(0.8f, L6 / r1));
                z = f4 >= f;
                if (z) {
                    f6 = f;
                    f7 = f6;
                } else {
                    f6 = Utilities.l(f16 / 0.14f);
                    f7 = f;
                }
                float max2 = Math.max(f4, f7);
                if (z) {
                    f8 = 0.8f;
                    max = (Math.max(f7, max2 - 1.0f) + Math.min(1.0f, max2 / 0.55f)) * L5;
                } else {
                    max = L5;
                    f8 = 0.8f;
                }
                if (z) {
                    float f24 = min - max;
                    if (max2 <= 1.0f) {
                        max2 = f1(0.15f, 1.0f, max2);
                    }
                    f9 = (f24 * max2) + max;
                } else {
                    f9 = gl.R1(min, L5, f6 * f6);
                }
                float v = !z ? oo1.v(f6, f6, f6, 1.0f) : 1.0f;
                if (max < 0.5f) {
                    float f25 = i / f2;
                    if (this.g1 > 0.001f) {
                        f10 = 0.15f;
                        height = a1() - (Utilities.l(this.g1) * b1());
                        L = gl.L(12.0f);
                    } else {
                        f10 = 0.15f;
                        height = ((getHeight() - this.v3) - gl.L(40.0f)) - gl.L(20.0f);
                        L = gl.L(14.0f);
                    }
                    float f26 = this.g9 ? this.f9 : (height - L) - (L5 / f2);
                    float f27 = f9 / f2;
                    float f28 = max / f2;
                    RectF rectF = this.L8;
                    rectF.set(f25 - f27, f26 - f28, f25 + f27, f26 + f28);
                    float min2 = Math.min(f28, gl.L(24.0f));
                    Path path = this.F1;
                    path.rewind();
                    path.addRoundRect(rectF, min2, min2, Path.Direction.CW);
                    this.T8 = 352321535;
                    this.A6 = true;
                    J(canvas, rectF, min2, v);
                    this.T8 = 0;
                    this.A6 = false;
                    if (z) {
                        f1 = 1.0f - Utilities.l(f16 / 0.05f);
                        f11 = 1.0f;
                    } else {
                        float f110 = f1(0.2f, 0.95f, f4);
                        f1 = f1(0.08f, 0.5f, f4);
                        f11 = f110;
                    }
                    if (f1 <= 0.004f) {
                        return;
                    }
                    if (this.N8) {
                        f13 = (currentAnimationTimeMillis - this.X8) / 1000.0f;
                        f12 = Utilities.l((f16 - f10) / 0.23f);
                    } else {
                        f12 = 1.0f;
                        f13 = -1.0f;
                    }
                    float B = yjb.B(f12, f2, f3, f1 * f12 * f12);
                    if (this.N8 && f12 < 1.0f) {
                        invalidate();
                    }
                    int i4 = this.W8;
                    boolean z10 = i4 == R.drawable.msg_recent || (i4 == R.drawable.msg_retry && s0(this.U8));
                    float A = this.N8 ? tb4.A(1.0f, f11, 0.35f, 1.0f) : ls6.w(f9, min, 1.0f, 0.05f);
                    canvas.save();
                    canvas.clipPath(path);
                    canvas.scale(A, A, f25, f26);
                    if (i() && ((this.S4 || this.a2) && canvas.isHardwareAccelerated())) {
                        if (this.b9 == null) {
                            this.b9 = mk1.d("toastContent");
                        }
                        if ((this.W8 != 0 || (oy8Var2 = this.Y8) == null || oy8Var2.b0 >= oy8Var2.e[0] - 1) && (!n() || (oy8Var = this.Z8) == null || oy8Var.b0 >= oy8Var.e[0] - 1)) {
                            oy8 oy8Var3 = this.a9;
                            if (oy8Var3 == null || this.W8 != R.drawable.msg_download) {
                                z2 = true;
                                z3 = false;
                            } else {
                                z3 = false;
                                z2 = true;
                            }
                            z4 = z3;
                            z5 = ((z10 || f13 < 0.0f || f13 >= f8) && !z4) ? z3 : z2;
                            if (z4) {
                                invalidate();
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.U8);
                            sb2.append(this.W8);
                            int i5 = (int) min;
                            sb2.append(i5);
                            sb2.append((int) this.t1);
                            sb = sb2.toString();
                            if (z5 && sb.equals(this.d9) && yz.n(this.b9)) {
                                f14 = L5;
                            } else {
                                this.d9 = sb;
                                Canvas c = yz.c(i5, (int) L5, this.b9);
                                f14 = L5;
                                Q(0.0f, f14 / 2.0f, f13, c, z10);
                                yz.k(this.b9);
                            }
                            L2 = (1.0f - f11) * gl.L(5.0f);
                            if (Math.abs(L2 - this.c9) > 0.25f) {
                                this.c9 = L2;
                                Object obj = this.b9;
                                if (L2 <= 0.3f) {
                                    L2 = 0.0f;
                                }
                                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                                yz.v(obj, L2);
                            }
                            yz.s(this.b9, f1);
                            float f29 = f14 / 2.0f;
                            canvas.translate(f25 - (min / 2.0f), f26 - f29);
                            yz.h(canvas, this.b9);
                            P(0.0f, f29, min, B, canvas);
                        } else {
                            z2 = true;
                            z3 = false;
                        }
                        z4 = z2;
                        if (z10) {
                        }
                        if (z4) {
                        }
                        StringBuilder sb22 = new StringBuilder();
                        sb22.append(this.U8);
                        sb22.append(this.W8);
                        int i52 = (int) min;
                        sb22.append(i52);
                        sb22.append((int) this.t1);
                        sb = sb22.toString();
                        if (z5) {
                        }
                        this.d9 = sb;
                        Canvas c2 = yz.c(i52, (int) L5, this.b9);
                        f14 = L5;
                        Q(0.0f, f14 / 2.0f, f13, c2, z10);
                        yz.k(this.b9);
                        L2 = (1.0f - f11) * gl.L(5.0f);
                        if (Math.abs(L2 - this.c9) > 0.25f) {
                        }
                        yz.s(this.b9, f1);
                        float f292 = f14 / 2.0f;
                        canvas.translate(f25 - (min / 2.0f), f26 - f292);
                        yz.h(canvas, this.b9);
                        P(0.0f, f292, min, B, canvas);
                    } else {
                        canvas.saveLayerAlpha(rectF, (int) (f1 * 255.0f));
                        float f30 = f25 - (min / 2.0f);
                        Q(f30, f26, f13, canvas, z10);
                        canvas.restore();
                        P(f30, f26, min, B, canvas);
                    }
                    canvas.restore();
                    return;
                }
                return;
            }
            if (f16 >= 0.14f) {
                this.U8 = null;
                this.V8 = false;
                return;
            } else {
                f2 = 2.0f;
                f4 = -1.0f;
            }
        }
        f3 = 3.0f;
        if (!this.N8) {
        }
        invalidate();
        if (this.U8.indexOf(10) < 0) {
        }
        float L32 = gl.L(!z9 ? 14.0f : 15.0f);
        TextPaint textPaint3 = this.D1;
        textPaint3.setTextSize(L32);
        float r12 = r1(this.U8);
        if (this.q1 == null) {
        }
        float min3 = Math.min(i - gl.L(32.0f), gl.L(66.0f) + r12 + f5);
        float L52 = gl.L(!z9 ? 56.0f : 44.0f);
        float L62 = (min3 - gl.L(66.0f)) - f5;
        this.t1 = textPaint3.getTextSize() * ((r12 > L62 || r12 <= f) ? 1.0f : Math.max(0.8f, L62 / r12));
        if (f4 >= f) {
        }
        if (z) {
        }
        float max22 = Math.max(f4, f7);
        if (z) {
        }
        if (z) {
        }
        if (!z) {
        }
        if (max < 0.5f) {
        }
    }

    public final void R0() {
        float f = this.f0;
        if (f == 0.0f && this.g0 == 0.0f) {
            return;
        }
        this.j0 = f;
        this.k0 = this.g0;
        this.a0 = AnimationUtils.currentAnimationTimeMillis();
        this.V = true;
    }

    public final void S0() {
        int i = this.V7;
        if (i < 0 || this.X7 >= this.W7) {
            return;
        }
        this.Y7 = j1(i);
        this.X7 = AnimationUtils.currentAnimationTimeMillis();
        invalidate();
    }

    public final float T(float f) {
        if (this.Q4 >= 1.0f) {
            return 1.0f;
        }
        return gl.R1(this.T4 ? 0.85f : 0.92f, 1.0f, f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        if (r11 != null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap T0() {
        RLottieNative rLottieNative;
        int width = getWidth();
        int height = getHeight();
        if (width > 0 && height > 0) {
            float f = this.g1;
            this.g1 = 0.0f;
            int min = Math.min(height, (int) (width * 1.92f));
            int max = (int) Math.max(0.0f, Math.min(height - min, ((l() / 2.0f) + m()) - (min / 2.0f)));
            try {
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                Bitmap createBitmap = Bitmap.createBitmap(width, min, config);
                if (this.S2 == null) {
                    oy8 oy8Var = this.Y1;
                    if (oy8Var.b > 0) {
                        try {
                            rLottieNative = RLottieNative.b(gl.v2(null, R.raw.plane_logo_plain), null, null, null);
                            if (rLottieNative != null) {
                                try {
                                    Bitmap createBitmap2 = Bitmap.createBitmap(oy8Var.b, oy8Var.c, config);
                                    rLottieNative.c(Math.min(33, rLottieNative.a[0] - 1), createBitmap2, true);
                                    this.S2 = createBitmap2;
                                } catch (Throwable th) {
                                    th = th;
                                    try {
                                        fa4.g(th, true);
                                    } finally {
                                        if (rLottieNative != null) {
                                            rLottieNative.d();
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            rLottieNative = null;
                        }
                    }
                }
                Canvas canvas = new Canvas(createBitmap);
                canvas.translate(0.0f, -max);
                System.currentTimeMillis();
                z(canvas, width, height);
                this.U2 = true;
                A(canvas, width);
                this.U2 = false;
                canvas.setBitmap(null);
                this.g1 = f;
                return createBitmap;
            } catch (OutOfMemoryError unused) {
                this.g1 = f;
            }
        }
        return null;
    }

    public final Drawable U(String str) {
        HashMap hashMap = this.K;
        Drawable drawable = (Drawable) hashMap.get(str);
        if (drawable == null) {
            drawable = vu3.g(str);
            if (drawable == null) {
                drawable = vu3.g(str.replace("️", ""));
            }
            if (drawable != null) {
                hashMap.put(str, drawable);
            }
        }
        return drawable;
    }

    public final void U0(String str) {
        if (this.w0) {
            this.u2 = this.M0.c() + gl.L(2.0f) + gl.L(12.0f) + gl.L(8.0f) + gl.L(11.0f);
            this.w0 = false;
            this.B0 = false;
            this.t2 = this.C0 * this.H0 > 0.001f;
            this.r2 = AnimationUtils.currentAnimationTimeMillis();
            this.D0 = this.C0;
            this.E0 = 0.0f;
            this.F0 = System.currentTimeMillis();
            gv8 gv8Var = this.u0;
            if (gv8Var != null) {
                i1(gv8Var);
            }
            t1(true);
            if (str != null) {
                d1(0, str, null);
            }
            i0();
            this.e = null;
            this.v0 = null;
            z24 z24Var = this.c;
            if (z24Var != null) {
                z24Var.W(0);
            }
        }
    }

    public final Bitmap V(vl vlVar) {
        Bitmap n;
        ml mlVar = vlVar.k;
        if (mlVar != null) {
            oy8 y = mlVar.y();
            if (y != null) {
                if (!this.U2) {
                    y.Q(0L);
                }
                if (y.p()) {
                    if (y.R != null) {
                        return y.R;
                    }
                    if (y.S != null) {
                        return y.S;
                    }
                    return null;
                }
            } else {
                km m = mlVar.m();
                if (m != null) {
                    if (!this.U2) {
                        m.D(System.currentTimeMillis());
                    }
                    if (m.s()) {
                        return m.m();
                    }
                } else if (mlVar.C() && mlVar.E() && (n = mlVar.n()) != null && !n.isRecycled()) {
                    return n;
                }
            }
        }
        return null;
    }

    public final float V0() {
        if (this.h1 < 0.5f) {
            return 1.0f;
        }
        return Utilities.l((AnimationUtils.currentAnimationTimeMillis() - this.J2) / 420.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final sw8 W() {
        long j;
        sw8 sw8Var = new sw8();
        ArrayList arrayList = this.J;
        if (!arrayList.isEmpty()) {
            sw8Var.a = (byte) 1;
            sw8Var.b = new Drawable[arrayList.size()];
            sw8Var.w = new long[arrayList.size()];
            sw8Var.x = new boolean[arrayList.size()];
            long[] jArr = new long[arrayList.size()];
            sw8Var.y = jArr;
            if (this.S4) {
                Arrays.fill(jArr, 1L);
            }
            for (int i = 0; i < sw8Var.b.length; i++) {
                String str = (String) arrayList.get(i);
                sw8Var.b[i] = U(str);
                if (str.startsWith("c:")) {
                    try {
                        j = Long.parseLong(str.substring(2));
                    } catch (NumberFormatException unused) {
                    }
                    long[] jArr2 = sw8Var.w;
                    if (j > 0) {
                        j = (-1) - (str.hashCode() & 4294967295L);
                    }
                    jArr2[i] = j;
                    sw8Var.x[i] = sv8.d(sw8Var.b[i]);
                }
                j = 0;
                long[] jArr22 = sw8Var.w;
                if (j > 0) {
                }
                jArr22[i] = j;
                sw8Var.x[i] = sv8.d(sw8Var.b[i]);
            }
        }
        return sw8Var;
    }

    public final void X(sw8 sw8Var) {
        TLRPC.Document document;
        if (sw8Var == null || sw8Var.G || sw8Var.a != 2 || sw8Var.F != null || (document = sw8Var.A) == null) {
            return;
        }
        sw8Var.F = new tv8(this.b, document, sw8Var.B, gl.L(48.0f), new x15(this, sw8Var, (byte) 23));
    }

    public final float X0(int i, long j) {
        return 1.0f - ((1.0f - this.z9[i]) * ((float) Math.exp((-(j - this.w9[i])) / 90.0f)));
    }

    public final boolean Y(Bitmap bitmap) {
        float[] fArr = lcd.b;
        float f = fArr[36];
        float f2 = fArr[38];
        float f3 = fArr[24];
        if (this.S3 != null && this.T3 == bitmap && f == this.U3 && f2 == this.V3 && f3 == this.W3) {
            return true;
        }
        if (bitmap == null || bitmap.isRecycled()) {
            return false;
        }
        this.T3 = bitmap;
        this.U3 = f;
        this.V3 = f2;
        this.W3 = f3;
        Bitmap bitmap2 = this.S3;
        if (bitmap2 == null || bitmap2.getWidth() != bitmap.getWidth() || this.S3.getHeight() != bitmap.getHeight()) {
            this.S3 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        }
        this.S3.eraseColor(0);
        Canvas canvas = new Canvas(this.S3);
        double radians = Math.toRadians(f3);
        float f4 = (float) (-Math.cos(radians));
        float f5 = (float) (-Math.sin(radians));
        float N = gl.N(f);
        float N2 = gl.N(f2);
        float f6 = f4 * N2;
        float f7 = N2 * f5;
        canvas.drawBitmap(bitmap, f6, f7, (Paint) null);
        canvas.drawBitmap(bitmap, f6 - (f4 * N), f7 - (f5 * N), this.X3);
        return true;
    }

    public final void Y0(tw8 tw8Var, float f, float f2) {
        if (tw8Var != null) {
            this.b7 = W0(tw8Var.c);
        }
        if (this.g2) {
            if (this.r != null) {
                this.r = null;
            }
            this.n = tw8Var;
            this.s = 1.0f;
            invalidate();
            return;
        }
        this.r = this.n;
        this.n = tw8Var;
        this.s = 0.0f;
        this.w = System.currentTimeMillis();
        this.x = f;
        this.y = f2;
        this.r0++;
        i0();
        invalidate();
    }

    public final void Z(sw8 sw8Var) {
        vl vlVar;
        ml mlVar;
        if (sw8Var == null || sw8Var.e != null || (vlVar = sw8Var.c) == null) {
            return;
        }
        tv8 tv8Var = sw8Var.F;
        if ((tv8Var == null || tv8Var.h) && (mlVar = vlVar.k) != null && mlVar.C() && mlVar.E()) {
            int L = gl.L(48.0f);
            Bitmap createBitmap = Bitmap.createBitmap(L, L, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            sw8Var.c.setBounds(0, 0, L, L);
            sw8Var.c.setColorFilter(null);
            sw8Var.c.setAlpha(kk7.d4);
            mlVar.i1 = 1.0f;
            sw8Var.c.draw(canvas);
            E0(sw8Var, createBitmap);
        }
    }

    public final String a0() {
        String M0 = k96.M0(2131746286, null);
        if (!M0.equals(this.v2)) {
            this.v2 = M0;
            Matcher matcher = Pattern.compile("\\d+").matcher(M0);
            if (matcher.find()) {
                this.w2 = M0.substring(0, matcher.start());
                this.x2 = matcher.group();
                this.y2 = M0.substring(matcher.end());
            } else {
                this.w2 = M0;
                this.y2 = "";
                this.x2 = "";
            }
        }
        return this.v2;
    }

    public final float a1() {
        return (getHeight() - this.v3) - gl.L(10.0f);
    }

    public final float b(double d) {
        float f = this.A4;
        double sin = Math.sin((f * 78.233d) + (((f * 17.31d) + d) * 12.9898d)) * 43758.5453d;
        return ((float) (sin - Math.floor(sin))) * 300.0f;
    }

    public final float b1() {
        float max = Math.max(gl.L(160.0f), a1() - ((((l() + (gl.L(51.0f) + this.u3)) + gl.L(24.0f)) + gl.L(11.0f)) + gl.L(13.0f)));
        if (this.i1 == 2 && this.y1) {
            ArrayList arrayList = this.w1;
            if (arrayList.size() <= 3) {
                max = Math.min(max, arrayList.isEmpty() ? gl.L(286.0f) : gl.L(8.0f) + (((getWidth() - (gl.L(10.0f) << 1)) - gl.L(8.0f)) / 3.0f));
            }
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        float f = this.Q2;
        if (f < 0.0f || this.g1 < 0.01f) {
            this.Q2 = max;
        } else if (f != max) {
            long min = Math.min(64L, Math.max(0L, currentAnimationTimeMillis - this.R2));
            float f2 = this.Q2;
            float A = tb4.A(1.0f, (float) Math.exp((-min) / 140.0f), max - f2, f2);
            this.Q2 = A;
            if (Math.abs(max - A) < 0.5f) {
                this.Q2 = max;
            } else {
                invalidate();
            }
        }
        this.R2 = currentAnimationTimeMillis;
        return this.Q2;
    }

    public final void c() {
        tw8 tw8Var;
        Runnable runnable = this.e2;
        if (runnable != null) {
            runnable.run();
        }
        if (!this.f2 && !this.J.isEmpty() && (tw8Var = this.n) != null && (tw8Var.a != 0 || this.G.a == 2)) {
            this.T7 = AnimationUtils.currentAnimationTimeMillis();
            this.Q7 = -1;
            this.O7 = 0.0f;
            setSceneFromCard(t(this.M7));
        }
        setPattern(W());
        if (!this.g2) {
            this.s0 = AnimationUtils.currentAnimationTimeMillis();
        }
        B0();
    }

    public final float c1(float f, float f2, int i, int i2) {
        float f3;
        float f4;
        float f5;
        float f6;
        int i3;
        float f7;
        if (!this.z3) {
            return 0.0f;
        }
        float f8 = i;
        float f9 = f - (f8 / 2.0f);
        float f10 = this.I3;
        float f11 = i2;
        float f12 = f2 - (f11 / 2.0f);
        float f13 = (this.J3 * f12) + (f9 * f10);
        float abs = ((Math.abs(this.J3) * f11) + (Math.abs(f10) * f8)) / 2.0f;
        float f14 = 1.0f;
        float max = Math.max(1.0f, abs);
        float[] fArr = lcd.b;
        float f15 = fArr[19] / 100.0f;
        if (f15 > 0.0f) {
            float f16 = this.J3;
            float max2 = ((f12 * this.I3) + (f9 * (-f16))) / Math.max(1.0f, ((Math.abs(this.I3) * f11) + (Math.abs(f16) * f8)) / 2.0f);
            f13 -= ((f15 * f8) * max2) * max2;
        }
        float f17 = (f13 - this.x3) / this.y3;
        float f18 = fArr[20] / 100.0f;
        if (f18 > 0.0f) {
            f17 += (((((float) Math.asin(ls6.w(f13, max, 1.0f, -1.0f))) - Math.max(-2.1991148f, Math.min(2.1991148f, (this.x3 / max) * 1.5707964f))) / ((this.y3 / max) * 1.5707964f)) - f17) * f18;
            f3 = ls6.B(1.0f, (float) Math.cos(Math.max(-1.5707964f, Math.min(1.5707964f, r4))), (f18 * fArr[31]) / 100.0f, 1.0f);
        } else {
            f3 = 1.0f;
        }
        this.o4 = f17;
        float f19 = this.F3;
        this.p4 = f19 * f3;
        float f20 = fArr[34] / 100.0f;
        int i4 = (f17 > 4.0f ? 1 : (f17 == 4.0f ? 0 : -1));
        if ((i4 > 0 || f17 < -4.0f) && f20 <= 0.0f) {
            this.m4 = 0.0f;
            return 0.0f;
        }
        float f21 = fArr[32];
        float f22 = f17 / fArr[29];
        sw8 sw8Var = this.G;
        if (sw8Var != null && sw8Var.a == 1) {
            f14 = 0.7f;
        }
        float f23 = f3 * f14;
        if (f22 > 4.0f || f22 < -4.0f) {
            f4 = 0.0f;
            f5 = f23;
            f6 = 4.0f;
            i3 = i4;
            f7 = 0.0f;
        } else {
            float abs2 = Math.abs(f22);
            f4 = 0.0f;
            f5 = f23;
            f6 = 4.0f;
            i3 = i4;
            f7 = f19 * f23 * ((float) Math.exp(Math.pow(abs2, f21) * (-0.5d)));
        }
        this.m4 = f7;
        float exp = (fArr[28] / 100.0f) * ((i3 > 0 || f17 < -4.0f) ? f4 : (float) Math.exp(Math.pow(Math.abs(f17), f21) * (-0.5d)));
        if (f20 > f4) {
            float f24 = f17 - fArr[33];
            if (f24 < f6 && f24 > -4.0f) {
                exp += f20 * ((float) Math.exp(Math.pow(Math.abs(f24), f21) * (-0.5d)));
            }
        }
        return this.F3 * f5 * exp;
    }

    public final void d(int i) {
        this.f2 = true;
        boolean z = this.G.a != 0;
        this.J.clear();
        this.O7 = 0.0f;
        this.M7 = i;
        tw8 tw8Var = this.n;
        if (tw8Var == null || tw8Var.a != 0 || tw8Var.f != i) {
            setSceneFromCard(t(i));
        }
        if (z) {
            setPattern(new sw8());
        }
        Runnable runnable = this.e2;
        if (runnable != null) {
            runnable.run();
        }
        this.f2 = false;
    }

    public final void d1(int i, String str, String str2) {
        long currentTimeMillis = 0 - System.currentTimeMillis();
        if (currentTimeMillis > 0) {
            postDelayed(new q76((Object) this, i, (Object) str, (Object) str2, (byte) 20), currentTimeMillis);
            return;
        }
        this.o1 = i;
        this.n1 = str;
        this.p1 = str2;
        this.v1 = System.currentTimeMillis() + (str2 != null ? 4000 : 2800);
        invalidate();
    }

    public final void e(int i, ArrayList arrayList, boolean z) {
        int i2 = -1;
        if (z && ld0.h != null) {
            int i3 = 0;
            while (true) {
                int[] iArr = ld0.h;
                if (i3 >= iArr.length) {
                    break;
                }
                if (iArr[i3] == i) {
                    i2 = i3;
                    break;
                }
                i3++;
            }
        }
        if (i2 < 0) {
            i2 = F9;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            d(i2);
            return;
        }
        this.f2 = true;
        this.M7 = i2;
        tw8 tw8Var = this.n;
        if (tw8Var == null || tw8Var.a != 0 || tw8Var.f != i2) {
            setSceneFromCard(t(i2));
        }
        this.O7 = 0.0f;
        ArrayList arrayList2 = this.J;
        arrayList2.clear();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            TLRPC.Reaction reaction = (TLRPC.Reaction) obj;
            if (arrayList2.size() >= 6) {
                break;
            }
            if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                long j = ((TLRPC.TL_reactionCustomEmoji) reaction).document_id;
                String n = ls6.n(j, "c:");
                HashMap hashMap = this.K;
                if (!hashMap.containsKey(n)) {
                    vl m = vl.m(this.b, j, null, 2);
                    m.b(this);
                    hashMap.put(n, m);
                }
                if (!arrayList2.contains(n)) {
                    arrayList2.add(n);
                }
            } else if (reaction instanceof TLRPC.TL_reactionEmoji) {
                TLRPC.TL_reactionEmoji tL_reactionEmoji = (TLRPC.TL_reactionEmoji) reaction;
                if (!TextUtils.isEmpty(tL_reactionEmoji.emoticon)) {
                    String str = tL_reactionEmoji.emoticon;
                    String replace = (str == null || str.startsWith("c:")) ? str : str.replace("️", "");
                    this.d2.put(replace, str);
                    if (!arrayList2.contains(replace)) {
                        arrayList2.add(replace);
                    }
                }
            }
        }
        c();
        this.f2 = false;
    }

    public final void e0(int[] iArr, int i) {
        iArr[0] = -7829368;
        iArr[1] = -11184811;
        iArr[2] = -13421773;
        ArrayList<TL_stars.StarGiftAttribute> arrayList = ((TL_stars.TL_starGiftUnique) this.w1.get(i)).attributes;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i2);
            i2++;
            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributeBackdrop) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) starGiftAttribute2;
                iArr[0] = stargiftattributebackdrop.center_color | (-16777216);
                iArr[1] = stargiftattributebackdrop.edge_color | (-16777216);
                iArr[2] = stargiftattributebackdrop.pattern_color | (-16777216);
            }
        }
    }

    public final float f(float f, float f2, float f3) {
        float A = tb4.A(f2, f, 1.0f - ((float) Math.pow(1.0f - f3, this.Y2)), f);
        return Math.abs(f2 - A) < 0.002f ? f2 : A;
    }

    public final int f0() {
        int size = this.w1.size();
        if (!this.y1 || size <= 0 || size >= 3) {
            return 3;
        }
        return size;
    }

    public final vl g0(long j, TLRPC.Document document) {
        Long valueOf = Long.valueOf(j);
        HashMap hashMap = this.J7;
        vl vlVar = (vl) hashMap.get(valueOf);
        if (vlVar != null) {
            return vlVar;
        }
        vl l = vl.l(this.b, 24, document);
        l.b(this);
        hashMap.put(Long.valueOf(j), l);
        return l;
    }

    public String getCurrentLink() {
        String str;
        if (this.w0 && (str = this.e) != null && this.v0 != null) {
            return str;
        }
        if (this.u0 != null) {
            return this.d;
        }
        return null;
    }

    public ArrayList<TLRPC.Reaction> getPickedEmoji() {
        ArrayList<TLRPC.Reaction> arrayList = new ArrayList<>();
        ArrayList arrayList2 = this.J;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
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
                String str2 = (String) this.d2.get(str);
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
        tw8 tw8Var = this.n;
        if (tw8Var == null || tw8Var.a != 0) {
            return -1;
        }
        return tw8Var.f;
    }

    public TL_stars.TL_starGiftUnique getThemeGift() {
        int i;
        sw8 sw8Var = this.G;
        if (sw8Var.a != 2 || (i = sw8Var.q) < 0) {
            return null;
        }
        ArrayList arrayList = this.w1;
        if (i < arrayList.size()) {
            return (TL_stars.TL_starGiftUnique) arrayList.get(this.G.q);
        }
        return null;
    }

    public long getThemeGiftSavedId() {
        Long l;
        TL_stars.TL_starGiftUnique themeGift = getThemeGift();
        if (themeGift != null) {
            l = (Long) this.z1.get(Long.valueOf(themeGift.id));
        } else {
            l = null;
        }
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final boolean h0() {
        return this.y1 && this.w1.isEmpty();
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

    public final void i1(gv8 gv8Var) {
        hv8 hv8Var = this.t0;
        if (hv8Var.q != 2 || hv8Var.o >= 1.0f) {
            postDelayed(new lw8(this, gv8Var, (byte) 0), 40L);
        } else {
            hv8Var.m = gv8Var;
            invalidate();
        }
    }

    public final boolean j0(Canvas canvas) {
        if (i()) {
            return (this.S4 || this.a2) && canvas.isHardwareAccelerated() && yz.n(this.I1);
        }
        return false;
    }

    public final float j1(int i) {
        if (i != this.V7) {
            return 1.0f;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (this.X7 < this.W7) {
            float l = 1.0f - Utilities.l((currentAnimationTimeMillis - r6) / 110.0f);
            return 1.0f - ((1.0f - (l * l)) * 0.08f);
        }
        double g1 = g1((currentAnimationTimeMillis - r4) / 1000.0f, 0.6d, 0.28d);
        if (currentAnimationTimeMillis - this.X7 > 900) {
            this.V7 = -1;
            return 1.0f;
        }
        float f = this.Y7;
        return ((1.0f - f) * ((float) g1)) + f;
    }

    public final float l() {
        return gl.R1(1.07f, 1.0f, this.D2) * getWidth() * 0.745f;
    }

    public final void l0() {
        if (this.U8 == null) {
            this.v1 = 0L;
            return;
        }
        this.v1 = 0L;
        if (this.N8) {
            this.N8 = false;
            this.M8 = AnimationUtils.currentAnimationTimeMillis();
        }
        this.V8 = true;
        invalidate();
    }

    public final uw8 l1(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        Long valueOf = Long.valueOf(tL_starGiftUnique.id);
        HashMap hashMap = this.K7;
        uw8 uw8Var = (uw8) hashMap.get(valueOf);
        if (uw8Var == null) {
            uw8Var = new uw8();
            ArrayList<TL_stars.StarGiftAttribute> arrayList = tL_starGiftUnique.attributes;
            int size = arrayList.size();
            TLRPC.Document document = null;
            int i = 0;
            while (i < size) {
                TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i);
                i++;
                TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                if (starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) {
                    document = ((TL_stars.starGiftAttributePattern) starGiftAttribute2).document;
                }
            }
            if (document != null) {
                tl tlVar = new tl(gl.L(28.0f), this);
                uw8Var.a = tlVar;
                tlVar.i(document, false);
                uw8Var.a.a();
                uw8Var.b = document.id;
            }
            hashMap.put(Long.valueOf(tL_starGiftUnique.id), uw8Var);
        }
        return uw8Var;
    }

    public final float m() {
        float max = ((1.0f - Math.max(this.K2, this.D2)) * gl.L(16.0f)) + (((getHeight() * 0.468f) - (l() / 2.0f)) - gl.L(15.0f));
        return gl.R1(max, Math.max(gl.L(51.0f) + this.u3, Math.min(max, (((a1() - b1()) - gl.L(13.0f)) - (gl.L(35.0f) * Math.max(this.K2, this.D2))) - l())), this.g1);
    }

    public final PorterDuffColorFilter m1(int i) {
        SparseArray sparseArray = this.e7;
        PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) sparseArray.get(i);
        if (porterDuffColorFilter != null) {
            return porterDuffColorFilter;
        }
        if (sparseArray.size() > 96) {
            sparseArray.clear();
        }
        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
        sparseArray.put(i, porterDuffColorFilter2);
        return porterDuffColorFilter2;
    }

    public final boolean n() {
        String str;
        return (this.W8 != R.drawable.msg_retry || (str = this.U8) == null || s0(str)) ? false : true;
    }

    public final boolean n0(float f, float f2) {
        if (this.q1 == null || !this.N8) {
            return false;
        }
        RectF rectF = this.L8;
        if (rectF.isEmpty()) {
            return false;
        }
        float f3 = rectF.right;
        float L = gl.L(15.0f);
        TextPaint textPaint = this.z2;
        textPaint.setTextSize(L);
        float measureText = (f3 - textPaint.measureText(this.q1)) - gl.L(28.0f);
        float L2 = rectF.top - gl.L(6.0f);
        float L3 = rectF.right + gl.L(6.0f);
        float L4 = rectF.bottom + gl.L(6.0f);
        RectF rectF2 = this.r1;
        rectF2.set(measureText, L2, L3, L4);
        return rectF2.contains(f, f2);
    }

    public final float o() {
        return l() + m() + gl.L(24.0f);
    }

    public final void o0(Canvas canvas, Drawable drawable, float f, float f2, float f3, float f4) {
        drawable.setColorFilter(m1(-1));
        drawable.setAlpha((int) (f4 * 255.0f));
        float f5 = f3 / 2.0f;
        drawable.setBounds((int) (f - f5), (int) (f2 - f5), (int) (f + f5), (int) (f2 + f5));
        drawable.draw(canvas);
    }

    public final oy8 o1() {
        if (this.Z8 == null) {
            oy8 oy8Var = new oy8(R.raw.contact_check, gl.L(28.0f), gl.L(28.0f));
            this.Z8 = oy8Var;
            oy8Var.setColorFilter(new ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.2126f, 0.7152f, 0.0722f, 1.0f, -255.0f}));
            this.Z8.F(0);
            this.Z8.M(this);
            this.Z8.E(true);
        }
        return this.Z8;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        K0();
        int i = this.y6;
        SparseIntArray sparseIntArray = this.x6;
        if (i != 1) {
            sparseIntArray.clear();
            this.y6 = 1;
        }
        int i2 = 0;
        while (true) {
            int[] iArr = ld0.b;
            if (i2 >= iArr.length) {
                break;
            }
            tw8 tw8Var = new tw8();
            int i3 = iArr[i2] | (-16777216);
            tw8Var.b = i3;
            tw8Var.c = ld0.c[i2] | (-16777216);
            tw8Var.h = Z0(i3);
            if (sparseIntArray.indexOfKey(tw8Var.b) < 0) {
                sparseIntArray.put(tw8Var.b, u(tw8Var));
            }
            i2++;
        }
        kk7.f(this.b).b(this.k2, kk7.H3);
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
        kk7.f(this.b).n(this.k2, kk7.H3);
        removeCallbacks(this.l2);
        SensorManager sensorManager = this.N6;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.O6);
        }
        this.L6 = false;
        this.r9 = -1;
        Arrays.fill(this.x9, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:244:0x0a85  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0ad6  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0bee  */
    /* JADX WARN: Removed duplicated region for block: B:303:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0ad1  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x09c8  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0a1c  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0a3d  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x09cf  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        int i;
        float f4;
        float f5;
        long j;
        float f6;
        float f7;
        float f8;
        int i2;
        int i3;
        z24 z24Var;
        float f9;
        float f10;
        float R1;
        float f11;
        float f12;
        float R12;
        z24 z24Var2;
        float f13;
        vw8 vw8Var;
        float f14;
        float f15;
        boolean z;
        int i4;
        long j2;
        boolean z2;
        long j3;
        float f16;
        float g1;
        vw8 vw8Var2 = this;
        vw8Var2.I2 = true;
        float f17 = 1.0f;
        float f18 = vw8Var2.C2 ? 1.0f : 0.0f;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        float f19 = vw8Var2.F2;
        if (f18 != f19) {
            if (f18 == 1.0f && f19 == 0.0f && vw8Var2.D2 <= 0.001f) {
                vw8Var2.n5 = true;
                vw8Var2.m5 = null;
            } else if (f18 == 0.0f && vw8Var2.D2 >= 0.999f) {
                vw8Var2.n5 = false;
            }
            vw8Var2.F2 = f18;
            vw8Var2.E2 = vw8Var2.D2;
            vw8Var2.G2 = currentAnimationTimeMillis;
        }
        if (vw8Var2.D2 != f18) {
            float l = Utilities.l((currentAnimationTimeMillis - vw8Var2.G2) / 300.0f);
            float C = l < 0.5f ? yjb.C(l, 4.0f, l, l) : 1.0f - (((float) Math.pow((l * (-2.0f)) + 2.0f, 3.0d)) / 2.0f);
            if (l < 1.0f) {
                f18 = gl.R1(vw8Var2.E2, f18, C);
            }
            vw8Var2.D2 = f18;
            if (f18 <= 0.0f) {
                vw8Var2.n5 = false;
            }
            vw8Var2.invalidate();
        }
        float f20 = vw8Var2.L0 ? 1.0f : 0.0f;
        long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
        float f21 = vw8Var2.M2;
        if (f21 < 0.0f) {
            vw8Var2.M2 = f20;
            vw8Var2.K2 = f20;
        } else {
            if (f20 != f21) {
                vw8Var2.M2 = f20;
                vw8Var2.L2 = vw8Var2.K2;
                vw8Var2.N2 = currentAnimationTimeMillis2;
            }
            if (vw8Var2.K2 != f20) {
                float l2 = Utilities.l((currentAnimationTimeMillis2 - vw8Var2.N2) / 320.0f);
                float C2 = l2 < 0.5f ? yjb.C(l2, 4.0f, l2, l2) : 1.0f - (((float) Math.pow((l2 * (-2.0f)) + 2.0f, 3.0d)) / 2.0f);
                if (l2 < 1.0f) {
                    f20 = gl.R1(vw8Var2.L2, f20, C2);
                }
                vw8Var2.K2 = f20;
                vw8Var2.invalidate();
            }
        }
        vw8Var2.W2 = !vw8Var2.S4 && vw8Var2.V2 == 0 && !vw8Var2.U2 && vw8Var2.a2;
        long currentTimeMillis = System.currentTimeMillis();
        int width = vw8Var2.getWidth();
        int height = vw8Var2.getHeight();
        float min = vw8Var2.X2 == 0 ? 1.0f : Math.min(3.0f, (currentTimeMillis - r4) / 16.667f);
        vw8Var2.X2 = currentTimeMillis;
        vw8Var2.Y2 = min;
        float f22 = vw8Var2.s;
        z24 z24Var3 = vw8Var2.c;
        if (f22 < 1.0f) {
            float min2 = Math.min(1.0f, (currentTimeMillis - vw8Var2.w) / 600.0f);
            vw8Var2.s = min2;
            if (f22 < 0.3f && min2 >= 0.3f && z24Var3 != null) {
                vw8Var2.n.getClass();
                ((gw8) z24Var3.b).Y();
            }
            if (vw8Var2.s >= 1.0f) {
                vw8Var2.r = null;
            }
        }
        long currentAnimationTimeMillis3 = AnimationUtils.currentAnimationTimeMillis();
        OverScroller overScroller = vw8Var2.k9;
        if (!overScroller.isFinished() && overScroller.computeScrollOffset()) {
            vw8Var2.k1 = Math.max(0.0f, Math.min(vw8Var2.z0(), overScroller.getCurrY()));
        }
        float f23 = vw8Var2.h1;
        if (f23 != vw8Var2.x7) {
            if (f23 < 0.5f) {
                vw8Var2.d6 = currentAnimationTimeMillis3;
            } else if (vw8Var2.g1 < 0.35f) {
                vw8Var2.e6 = false;
            }
            if (f23 > 0.5f) {
                vw8Var2.J2 = currentAnimationTimeMillis3;
            }
            vw8Var2.x7 = f23;
            vw8Var2.w7 = vw8Var2.g1;
            vw8Var2.v7 = currentAnimationTimeMillis3;
        }
        float f24 = (currentAnimationTimeMillis3 - vw8Var2.v7) / 1000.0f;
        s33 s33Var = Q9;
        if (f23 > 0.5f) {
            float R13 = gl.R1(vw8Var2.w7, 1.0f, s33Var.getInterpolation(Utilities.l(f24 / 0.42f)));
            vw8Var2.g1 = R13;
            vw8Var2.y7 = Utilities.l(Utilities.l(R13) / 0.8f);
            f2 = 0.5f;
            f = 1000.0f;
            f3 = 0.17f;
        } else {
            f = 1000.0f;
            f2 = 0.5f;
            f3 = 0.17f;
            vw8Var2.y7 = Math.min(vw8Var2.y7, (float) Math.pow(1.0f - Utilities.l(f24 / 0.17f), 1.7000000476837158d));
            vw8Var2.g1 = gl.R1(vw8Var2.w7, 0.0f, s33Var.getInterpolation(Utilities.l(f24 / 0.36f)));
        }
        vw8Var2.N7 = vw8Var2.f(vw8Var2.N7, vw8Var2.O7, 0.25f);
        tw8 tw8Var = vw8Var2.n;
        if (tw8Var != null && tw8Var.a == 0) {
            i = 0;
            while (i < ld0.b.length) {
                if (ld0.c(i) == vw8Var2.n.f) {
                    break;
                } else {
                    i++;
                }
            }
        }
        i = -100;
        int i5 = vw8Var2.u8;
        if (i != i5) {
            float f25 = i == vw8Var2.v8 ? vw8Var2.x8 : 0.0f;
            vw8Var2.v8 = i5;
            vw8Var2.x8 = vw8Var2.w8;
            vw8Var2.u8 = i;
            vw8Var2.w8 = f25;
        }
        vw8Var2.w8 = vw8Var2.f(vw8Var2.w8, 1.0f, 0.2f);
        vw8Var2.x8 = vw8Var2.f(vw8Var2.x8, 0.0f, 0.2f);
        long currentAnimationTimeMillis4 = AnimationUtils.currentAnimationTimeMillis();
        float f26 = vw8Var2.m1;
        if (f26 != vw8Var2.C8) {
            vw8Var2.C8 = f26;
            vw8Var2.B8 = Math.max(vw8Var2.E8, vw8Var2.F8);
            vw8Var2.z8 = currentAnimationTimeMillis4;
        }
        float f27 = f3;
        float f28 = (currentAnimationTimeMillis4 - vw8Var2.z8) / f;
        if (vw8Var2.m1 > f2) {
            float f29 = vw8Var2.B8;
            if (f28 > 0.7f) {
                f4 = 1.0f;
                f5 = 0.2f;
            } else {
                f4 = 1.0f;
                f5 = 0.2f;
                f17 = ((1.0f - f29) * ((float) g1(f28, 0.78d, 0.3d))) + f29;
            }
            vw8Var2.E8 = f17;
            if (f28 > 0.7f) {
                j = currentAnimationTimeMillis4;
                g1 = f4;
            } else {
                j = currentAnimationTimeMillis4;
                g1 = ((f4 - f29) * ((float) g1(f28 - 0.02d, 0.8d, 0.34d))) + f29;
            }
            vw8Var2.F8 = g1;
        } else {
            f4 = 1.0f;
            f5 = 0.2f;
            j = currentAnimationTimeMillis4;
            float l3 = Utilities.l(f28 / 0.2f);
            float l4 = Utilities.l(f28 / f27);
            float f30 = vw8Var2.B8;
            vw8Var2.E8 = (1.0f - ((3.0f - (l4 * 2.0f)) * (l4 * l4))) * f30;
            vw8Var2.F8 = (1.0f - ((3.0f - (l3 * 2.0f)) * (l3 * l3))) * f30;
        }
        float max = Math.max(0.004f, vw8Var2.Y2 * 0.016667f);
        float f31 = vw8Var2.F8;
        vw8Var2.G8 = (f31 - vw8Var2.H8) / max;
        vw8Var2.H8 = f31;
        float max2 = Math.max(0.0f, Math.max(vw8Var2.E8, f31));
        vw8Var2.l1 = max2;
        if (vw8Var2.D8 > 0.001f && max2 <= 0.001f) {
            vw8Var2.A8 = j;
        }
        vw8Var2.D8 = max2;
        vw8Var2.j1 = vw8Var2.f(vw8Var2.j1, vw8Var2.i1, 0.25f);
        boolean z3 = vw8Var2.n1 != null && currentTimeMillis < vw8Var2.v1;
        vw8Var2.u1 = vw8Var2.f(vw8Var2.u1, z3 ? f4 : 0.0f, z3 ? f5 : vw8Var2.m1 > f2 ? 0.4f : 0.16f);
        float R14 = gl.R1(vw8Var2.D0, vw8Var2.E0, f4 - ((float) Math.pow(r5 - Math.min(r5, (currentTimeMillis - vw8Var2.F0) / (vw8Var2.E0 > vw8Var2.D0 ? 340L : 380L)), 3.0d)));
        vw8Var2.C0 = R14;
        boolean z4 = vw8Var2.w0;
        if (z4 && R14 >= 0.999f) {
            vw8Var2.G0 = true;
        }
        if (z4) {
            if (vw8Var2.x0) {
                f16 = Utilities.l((vw8Var2.B0 ? 60000L : Math.max(0L, vw8Var2.A0 - currentTimeMillis)) / 60000.0f);
            } else {
                f16 = 1.0f;
            }
            vw8Var2.H0 = f16;
            if (vw8Var2.x0 && !vw8Var2.B0 && currentTimeMillis >= vw8Var2.A0) {
                vw8Var2.U0(k96.M0(2131746287, null));
            }
        }
        vw8Var2.t1(true);
        long nanoTime = System.nanoTime();
        float min3 = vw8Var2.M6 == 0 ? 0.016f : Math.min(0.1f, (nanoTime - r10) / 1.0E9f);
        vw8Var2.M6 = nanoTime;
        if (vw8Var2.L6) {
            float exp = 1.0f - ((float) Math.exp((-min3) / 4.0f));
            float f32 = vw8Var2.J6;
            float f33 = vw8Var2.H6;
            float A = tb4.A(f33, f32, exp, f32);
            vw8Var2.J6 = A;
            float f34 = vw8Var2.K6;
            vw8Var2.K6 = tb4.A(vw8Var2.I6, f34, exp, f34);
            f6 = 1.0f;
            f7 = ls6.w(-(f33 - A), 4.9f, 1.0f, -1.0f);
            f8 = Math.max(-1.0f, Math.min(1.0f, (vw8Var2.I6 - vw8Var2.K6) / 4.9f));
        } else {
            f6 = 1.0f;
            f7 = 0.0f;
            f8 = 0.0f;
        }
        float exp2 = f6 - ((float) Math.exp((-min3) / 0.08f));
        float f35 = vw8Var2.F6;
        vw8Var2.F6 = tb4.A(f7, f35, exp2, f35);
        float f36 = vw8Var2.G6;
        vw8Var2.G6 = tb4.A(f8, f36, exp2, f36);
        float[] fArr = lcd.b;
        float f37 = fArr[0];
        vw8Var2.D6 = Math.round(r5 / r10) * (f37 > 0.0f ? f2 / f37 : 1.0f);
        float round = Math.round(vw8Var2.G6 * 40.0f) / 40.0f;
        vw8Var2.E6 = round;
        nm4.i = vw8Var2.D6 * fArr[0];
        nm4.j = (round * fArr[1]) / 100.0f;
        float f38 = vw8Var2.b6;
        sw8 sw8Var = vw8Var2.G;
        vw8Var2.b6 = vw8Var2.f(f38, (sw8Var == null || sw8Var.a == 0) ? 0.0f : 1.0f, 0.12f);
        if (yz.o()) {
            canvas.isHardwareAccelerated();
        }
        if (i() && ((vw8Var2.S4 || vw8Var2.a2) && canvas.isHardwareAccelerated())) {
            if (vw8Var2.H1 == null) {
                vw8Var2.H1 = mk1.d("qrBg");
                RenderNode d = mk1.d("qrBlur");
                vw8Var2.I1 = d;
                float N = gl.N(17.6f) / 9.0f;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                yz.v(d, N);
            }
            vw8Var2.z(yz.c(width, height, vw8Var2.H1), width, height);
            yz.k(vw8Var2.H1);
            if (vw8Var2.J1 != 1) {
                vw8Var2.J1 = 1;
                Object obj = vw8Var2.I1;
                float max3 = Math.max(f2, gl.N(fArr[2]) / 9.0f);
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                yz.v(obj, max3);
            }
            Canvas c = yz.c((width + 8) / 9, (height + 8) / 9, vw8Var2.I1);
            c.scale(0.11111111f, 0.11111111f);
            yz.h(c, vw8Var2.H1);
            yz.k(vw8Var2.I1);
            yz.h(canvas, vw8Var2.H1);
        } else {
            vw8Var2.z(canvas, width, height);
        }
        vw8Var2.A(canvas, width);
        vw8Var2.R4 = vw8Var2.Q4 < 1.0f ? Utilities.l(vw8Var2.U4) : 1.0f;
        float currentActionBarHeight = (a.getCurrentActionBarHeight() / 2.0f) + vw8Var2.u3;
        RectF rectF = vw8Var2.g7;
        rectF.set(gl.L(29.0f) - gl.L(20.0f), currentActionBarHeight - gl.L(20.0f), gl.L(20.0f) + gl.L(29.0f), gl.L(20.0f) + currentActionBarHeight);
        float T = vw8Var2.T(vw8Var2.R4);
        canvas.save();
        canvas.scale(T, T, rectF.centerX(), rectF.centerY());
        vw8Var2.J(canvas, rectF, gl.L(20.0f), 1.0f);
        vw8Var2.M(canvas, 3, rectF, false);
        ed0 ed0Var = vw8Var2.X1;
        ed0Var.a(-1);
        canvas.save();
        de9.n(gl.L(24.0f), 2.0f, currentActionBarHeight, rectF.centerX() - (gl.L(24.0f) / 2.0f), canvas);
        ed0Var.draw(canvas);
        canvas.restore();
        canvas.restore();
        if (vw8Var2.l7) {
            i2 = width;
            i3 = height;
            z24Var = z24Var3;
            f9 = 14.0f;
        } else {
            float L = gl.L(14.0f);
            Paint paint = vw8Var2.V1;
            paint.setTextSize(L);
            float L2 = gl.L(6.0f) + gl.L(20.0f) + gl.L(12.0f);
            f9 = 14.0f;
            String str = vw8Var2.W1;
            RectF rectF2 = vw8Var2.j7;
            rectF2.set((vw8Var2.getWidth() - gl.L(9.0f)) - ((paint.measureText(str) + L2) + gl.L(14.0f)), currentActionBarHeight - gl.L(20.0f), vw8Var2.getWidth() - gl.L(9.0f), gl.L(20.0f) + currentActionBarHeight);
            canvas.save();
            canvas.scale(T, T, rectF2.centerX(), rectF2.centerY());
            vw8Var2.J(canvas, rectF2, gl.L(20.0f), 1.0f);
            vw8Var2.M(canvas, 5, rectF2, false);
            z24Var = z24Var3;
            i2 = width;
            i3 = height;
            vw8Var2.o0(canvas, vw8Var2.O1, rectF2.left + gl.L(12.0f) + gl.L(10.0f), currentActionBarHeight, gl.L(20.0f), 1.0f);
            paint.setColor(-1);
            Paint.FontMetrics fontMetrics = paint.getFontMetrics();
            canvas.drawText(str, rectF2.left + gl.L(12.0f) + gl.L(20.0f) + gl.L(6.0f), currentActionBarHeight - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f), paint);
            canvas.restore();
        }
        float l5 = 1.0f - Utilities.l(vw8Var2.g1 * 2.2f);
        long currentAnimationTimeMillis5 = AnimationUtils.currentAnimationTimeMillis();
        boolean z5 = vw8Var2.m1 > 0.5f;
        if (z5 != vw8Var2.m7) {
            vw8Var2.m7 = z5;
            vw8Var2.o7 = vw8Var2.n7;
            vw8Var2.p7 = currentAnimationTimeMillis5;
        }
        float l6 = Utilities.l((currentAnimationTimeMillis5 - vw8Var2.p7) / 220.0f);
        float f39 = vw8Var2.o7;
        if (z5) {
            R1 = gl.R1(f39, 0.0f, l6 * l6);
            f10 = 1.0f;
        } else {
            f10 = 1.0f;
            R1 = gl.R1(f39, 1.0f, Math.min(1.0f, S(l6, 0.6f)));
        }
        vw8Var2.n7 = R1;
        if (l6 < f10) {
            vw8Var2.invalidate();
        }
        float l7 = Utilities.l(Utilities.l(vw8Var2.n7) * 2.0f);
        float R15 = gl.R1(0.6f, f10, vw8Var2.n7);
        boolean z6 = z5 || (vw8Var2.w0 && vw8Var2.x0);
        if (z6 != vw8Var2.q7) {
            vw8Var2.q7 = z6;
            vw8Var2.s7 = vw8Var2.r7;
            vw8Var2.t7 = currentAnimationTimeMillis5;
        }
        int i6 = i2;
        float l8 = Utilities.l((currentAnimationTimeMillis5 - vw8Var2.t7) / 220.0f);
        float f40 = vw8Var2.s7;
        if (z6) {
            R12 = gl.R1(f40, 0.0f, l8 * l8);
            f11 = 0.6f;
            f12 = 1.0f;
        } else {
            f11 = 0.6f;
            f12 = 1.0f;
            R12 = gl.R1(f40, 1.0f, Math.min(1.0f, S(l8, 0.6f)));
        }
        vw8Var2.r7 = R12;
        if (l8 < f12) {
            vw8Var2.invalidate();
        }
        float R16 = gl.R1(f11, f12, vw8Var2.r7);
        float min4 = Math.min(l5, Utilities.l(Utilities.l(vw8Var2.r7) * 2.0f));
        boolean z7 = vw8Var2.g1 <= 0.001f;
        if (min4 > 0.0f || l5 > 0.0f || z7) {
            float height2 = (vw8Var2.getHeight() - vw8Var2.v3) - gl.L(40.0f);
            int width2 = vw8Var2.getWidth();
            int L3 = gl.L(20.0f);
            float L4 = gl.L(42.0f) - L3;
            float f41 = L3;
            float f42 = height2 - f41;
            float L5 = gl.L(42.0f) + L3;
            boolean z8 = z7;
            float f43 = height2 + f41;
            z24Var2 = z24Var;
            RectF rectF3 = vw8Var2.h7;
            rectF3.set(L4, f42, L5, f43);
            float x = ls6.x(42.0f, width2, L3);
            float z9 = b00.z(42.0f, width2, L3);
            RectF rectF4 = vw8Var2.i7;
            rectF4.set(x, f42, z9, f43);
            float f44 = width2 / 2.0f;
            RectF rectF5 = vw8Var2.k7;
            rectF5.set(f44 - gl.L(72.0f), height2 - gl.L(20.0f), f44 + gl.L(72.0f), gl.L(20.0f) + height2);
            float T2 = vw8Var2.T(vw8Var2.R4) * gl.R1(0.6f, 1.0f, l5);
            if (min4 > 0.0f) {
                canvas.save();
                float f45 = T2 * R16;
                canvas.scale(f45, f45, rectF3.centerX(), height2);
                vw8Var2.J(canvas, rectF3, gl.L(20.0f), min4);
                vw8Var2.M(canvas, 4, rectF3, false);
                f13 = height2;
                vw8Var2.o0(canvas, vw8Var2.M1, rectF3.centerX(), f13, gl.L(22.0f), min4);
                canvas.restore();
                canvas.save();
                float f46 = T2 * R15;
                canvas.scale(f46, f46, rectF4.centerX(), f13);
                vw8Var2.J(canvas, rectF4, gl.L(20.0f), min4);
                vw8Var2.M(canvas, 11, rectF4, false);
                vw8Var2.o0(canvas, vw8Var2.N1, rectF4.centerX(), f13, gl.L(24.0f), min4);
                canvas.restore();
            } else {
                f13 = height2;
            }
            if (z8 && l7 > 0.0f && vw8Var2.a) {
                float T3 = vw8Var2.T(vw8Var2.R4) * R15;
                canvas.save();
                canvas.scale(T3, T3, rectF5.centerX(), rectF5.centerY());
                vw8Var2.J(canvas, rectF5, gl.L(20.0f), l7);
                float width3 = rectF5.width() / 3.0f;
                canvas.save();
                Path path = vw8Var2.F1;
                path.rewind();
                path.addRoundRect(rectF5, gl.L(20.0f), gl.L(20.0f), Path.Direction.CW);
                canvas.clipPath(path);
                int i7 = 0;
                while (i7 < 3) {
                    float f47 = rectF5.left;
                    float f48 = (i7 * width3) + f47;
                    float f49 = rectF5.top;
                    int i8 = i7 + 1;
                    float f50 = (i8 * width3) + f47;
                    float f51 = rectF5.bottom;
                    RectF rectF6 = vw8Var2.c7;
                    rectF6.set(f48, f49, f50, f51);
                    vw8Var2.M(canvas, i7 + 6, rectF6, false);
                    i7 = i8;
                }
                canvas.restore();
                int i9 = 0;
                while (i9 < 3) {
                    float f52 = l7;
                    vw8Var2.o0(canvas, vw8Var2.f7[i9], de9.v(i9, 0.5f, width3, rectF5.left), f13, gl.L(i9 == 1 ? 24.5f : 22.0f), f52);
                    i9++;
                    l7 = f52;
                    vw8Var2 = vw8Var2;
                }
                vw8Var = vw8Var2;
                canvas.restore();
            } else {
                vw8Var = vw8Var2;
            }
        } else {
            vw8Var = vw8Var2;
            z24Var2 = z24Var;
        }
        if (vw8Var.l1 > 0.001f) {
            K(canvas);
            i4 = i6;
        } else {
            if (vw8Var.A8 != 0) {
                float currentAnimationTimeMillis6 = (AnimationUtils.currentAnimationTimeMillis() - vw8Var.A8) / f;
                if (currentAnimationTimeMillis6 <= 0.45f) {
                    f14 = ((float) Math.sin((currentAnimationTimeMillis6 * 6.283185307179586d) / 0.17000000178813934d)) * ((float) Math.exp((-currentAnimationTimeMillis6) / 0.11f)) * 0.07f;
                    float T4 = vw8Var.T(vw8Var.Q4 >= 1.0f ? Utilities.l(vw8Var.U4) : 1.0f) * j(vw8Var.n2, 0.06f, 0.02f);
                    if (vw8Var.r2 > 0 || vw8Var.w0) {
                        f15 = 1.0f;
                    } else {
                        float currentAnimationTimeMillis7 = (AnimationUtils.currentAnimationTimeMillis() - vw8Var.r2) / 180.0f;
                        f15 = 1.0f;
                        if (currentAnimationTimeMillis7 < 1.0f) {
                            T4 *= (((float) Math.sin(currentAnimationTimeMillis7 * 3.141592653589793d)) * 0.04f) + 1.0f;
                            vw8Var.invalidate();
                        }
                    }
                    z = f14 == 0.0f || T4 != f15;
                    if (z) {
                        canvas.save();
                        float f53 = ((f14 * 0.5f) + f15) * T4;
                        float f54 = (f15 - f14) * T4;
                        RectF rectF7 = vw8Var.J5;
                        canvas.scale(f53, f54, rectF7.centerX(), rectF7.centerY());
                    }
                    i4 = i6;
                    vw8Var.B(canvas, i4);
                    if (z) {
                        canvas.restore();
                    }
                }
            }
            f14 = 0.0f;
            float T42 = vw8Var.T(vw8Var.Q4 >= 1.0f ? Utilities.l(vw8Var.U4) : 1.0f) * j(vw8Var.n2, 0.06f, 0.02f);
            if (vw8Var.r2 > 0) {
            }
            f15 = 1.0f;
            if (f14 == 0.0f) {
            }
            if (z) {
            }
            i4 = i6;
            vw8Var.B(canvas, i4);
            if (z) {
            }
        }
        vw8Var.N(canvas, i4, i3);
        long currentAnimationTimeMillis8 = AnimationUtils.currentAnimationTimeMillis();
        if (vw8Var.e9 == 0 && vw8Var.N8 && vw8Var.U8 != null && vw8Var.h1 == 0.0f && vw8Var.g1 > 0.001f) {
            RectF rectF8 = vw8Var.L8;
            if (!rectF8.isEmpty()) {
                vw8Var.e9 = currentAnimationTimeMillis8;
                vw8Var.f9 = rectF8.centerY();
                vw8Var.n1 = null;
                j2 = 0;
                vw8Var.v1 = 0L;
                if (vw8Var.e9 == j2) {
                    float f55 = (currentAnimationTimeMillis8 - r4) / 140.0f;
                    if (f55 >= 1.0f) {
                        z2 = false;
                        j3 = 0;
                    } else if (vw8Var.U8 == null) {
                        j3 = 0;
                        z2 = false;
                    } else {
                        vw8Var.invalidate();
                        float f56 = i4;
                        canvas.saveLayerAlpha(0.0f, 0.0f, f56, i3, (int) ((1.0f - f55) * 255.0f));
                        float f57 = 1.0f - (f55 * 0.08f);
                        canvas.scale(f57, f57, f56 / 2.0f, vw8Var.f9);
                        vw8Var.g9 = true;
                        vw8Var.R(canvas, i4, currentTimeMillis);
                        vw8Var.g9 = false;
                        canvas.restore();
                    }
                    vw8Var.e9 = j3;
                    vw8Var.N8 = z2;
                    vw8Var.U8 = null;
                } else {
                    vw8Var.R(canvas, i4, currentTimeMillis);
                }
                if (z24Var2 != null) {
                    gw8 gw8Var = (gw8) z24Var2.b;
                    boolean z10 = vw8Var.g1 > 0.01f && vw8Var.y7 > 0.004f && vw8Var.i1 == 1;
                    float L6 = ((1.0f - vw8Var.y7) * gl.L(f9)) + (vw8Var.a1() - vw8Var.b1()) + gl.L(8.0f);
                    float f58 = vw8Var.y7;
                    RectF rectF9 = vw8Var.I7;
                    RectF rectF10 = vw8Var.z7;
                    boolean z11 = z10 && !rectF10.equals(rectF9);
                    tw8 tw8Var2 = vw8Var.n;
                    int i10 = tw8Var2 != null ? tw8Var2.b : 0;
                    boolean z12 = z10 && i10 != vw8Var.H7;
                    if (z10 != vw8Var.G7 || z11 || z12 || (z10 && (Math.abs(L6 - vw8Var.E7) > 0.5f || Math.abs(f58 - vw8Var.F7) > 0.01f))) {
                        vw8Var.H7 = i10;
                        rectF9.set(rectF10);
                        vw8Var.G7 = z10;
                        vw8Var.E7 = L6;
                        vw8Var.F7 = f58;
                        gw8Var.f0(L6, f58, z10);
                        vw8Var.getWidth();
                        vw8Var.a1();
                        float f59 = rectF10.left;
                        float f60 = rectF10.top;
                        float f61 = rectF10.right;
                        float f62 = rectF10.bottom;
                        float min5 = Math.min(rectF10.height() / 2.0f, gl.U1(Utilities.l(vw8Var.g1), gl.L(20.0f), gl.L(28.17f)));
                        gw8Var.n = f59;
                        gw8Var.r = f60;
                        gw8Var.s = f61;
                        gw8Var.w = f62;
                        gw8Var.x = min5;
                        if (gw8Var.h != null) {
                            float min6 = Math.min(r1.getHeight(), gw8Var.w - (gw8Var.h.getTranslationY() + gw8Var.h.getTop()));
                            sx3 sx3Var = gw8Var.y;
                            if (sx3Var != null) {
                                sx3Var.H = min6;
                            }
                            gw8Var.L = min6;
                            if (sx3Var != null) {
                                sx3Var.V = gw8Var.s - sx3Var.getLeft();
                            }
                            nv8 nv8Var = gw8Var.a0;
                            if (nv8Var != null) {
                                nv8Var.invalidate();
                            }
                            gw8Var.h.invalidateOutline();
                        }
                        sx3 sx3Var2 = gw8Var.y;
                        if (sx3Var2 != null) {
                            sx3Var2.invalidateOutline();
                        }
                    }
                }
                vw8Var.invalidate();
                vw8Var.W2 = false;
                if (vw8Var.S4) {
                    vw8Var.V2++;
                    return;
                }
                return;
            }
        }
        j2 = 0;
        if (vw8Var.e9 == j2) {
        }
        if (z24Var2 != null) {
        }
        vw8Var.invalidate();
        vw8Var.W2 = false;
        if (vw8Var.S4) {
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int top;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = gl.m;
        View view = this;
        int i6 = 0;
        while (true) {
            top = view.getTop() + i6;
            if (!(view.getParent() instanceof View)) {
                break;
            }
            view = (View) view.getParent();
            i6 = top - view.getScrollY();
        }
        this.u3 = Math.max(Math.max(0, i5 - top), (gl.L(20.0f) + gl.L(9.0f)) - (a.getCurrentActionBarHeight() / 2));
        int height = getRootView().getHeight();
        View view2 = this;
        int i7 = 0;
        while (true) {
            int top2 = view2.getTop() + i7;
            if (!(view2.getParent() instanceof View)) {
                this.v3 = b00.c(20.0f, gl.L(22.0f), Math.max(0, gl.n - (height - (getHeight() + top2))));
                return;
            }
            view2 = (View) view2.getParent();
            i7 = top2 - view2.getScrollY();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (i > 0 && i2 > 0) {
            float L = gl.L(12.0f);
            int ceil = ((int) Math.ceil(i / L)) + 1;
            int ceil2 = ((int) Math.ceil(i2 / L)) + 1;
            Bitmap bitmap = this.A3;
            if (bitmap == null || bitmap.getWidth() != ceil || this.A3.getHeight() != ceil2) {
                this.A3 = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
                this.B3 = new int[ceil * ceil2];
            }
        }
        super.onSizeChanged(i, i2, i3, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:379:0x07b4  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x07e4  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x07fa  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x089c  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0816  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        float f;
        int i;
        int width;
        boolean z2;
        float f2;
        tw8 tw8Var;
        boolean z3;
        kw8 kw8Var;
        VelocityTracker velocityTracker;
        RippleDrawable rippleDrawable;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (motionEvent.getActionMasked() == 0) {
            this.s1 = n0(x, y);
        }
        boolean z4 = this.s1;
        z24 z24Var = this.c;
        if (z4) {
            if (motionEvent.getActionMasked() == 1) {
                this.s1 = false;
                if (n0(x, y)) {
                    this.v1 = 0L;
                    invalidate();
                    if (z24Var != null) {
                        ((gw8) z24Var.b).presentFragment(new PremiumPreviewFragment(0, "qr_emoji"));
                        return true;
                    }
                }
            } else if (motionEvent.getActionMasked() == 3) {
                this.s1 = false;
                return true;
            }
            return true;
        }
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.w1;
        RectF rectF = this.Z7;
        RectF rectF2 = this.i7;
        RectF rectF3 = this.h7;
        RectF rectF4 = this.J5;
        RectF rectF5 = this.g7;
        RectF[] rectFArr = this.y8;
        RectF rectF6 = this.j7;
        RectF rectF7 = this.k7;
        OverScroller overScroller = this.k9;
        ow8 ow8Var = this.p9;
        RectF rectF8 = this.u7;
        if (actionMasked != 0) {
            ViewConfiguration viewConfiguration = this.l9;
            if (actionMasked == 1) {
                removeCallbacks(ow8Var);
                Q0();
                S0();
                if (this.S) {
                    this.S = false;
                    if (this.T) {
                        this.l0.addMovement(motionEvent);
                        this.l0.computeCurrentVelocity(1000);
                        float xVelocity = this.l0.getXVelocity();
                        float yVelocity = this.l0.getYVelocity();
                        float hypot = (float) Math.hypot(xVelocity, yVelocity);
                        float L = gl.L(1.0f) * 2600.0f;
                        if (hypot > L) {
                            float f3 = L / hypot;
                            xVelocity *= f3;
                            yVelocity *= f3;
                        }
                        this.b0 = this.O;
                        this.c0 = this.P;
                        this.d0 = xVelocity;
                        this.e0 = yVelocity;
                        this.W = AnimationUtils.currentAnimationTimeMillis();
                        this.U = true;
                        R0();
                        return true;
                    }
                    R0();
                }
                if (this.o9 && (velocityTracker = this.m9) != null) {
                    velocityTracker.addMovement(motionEvent);
                    this.m9.computeCurrentVelocity(1000, viewConfiguration.getScaledMaximumFlingVelocity());
                    float yVelocity2 = this.m9.getYVelocity();
                    int z0 = (int) z0();
                    if (Math.abs(yVelocity2) > viewConfiguration.getScaledMinimumFlingVelocity() && z0 > 0) {
                        overScroller.fling(0, Math.round(this.k1), 0, Math.round(-yVelocity2), 0, 0, 0, z0);
                        invalidate();
                    }
                }
                if (!this.o9 && !this.n9 && Math.hypot(x - this.h9, y - this.i9) < gl.L(10.0f)) {
                    if (this.l7 || !m0(x, y, rectF6)) {
                        if (this.l1 <= 0.5f) {
                            if (m0(x, y, rectF5)) {
                                if (this.g1 > 0.5f) {
                                    this.h1 = 0.0f;
                                    return true;
                                }
                                if (z24Var != null) {
                                    ((gw8) z24Var.b).finishFragment();
                                    return true;
                                }
                            } else if (!this.L0 || !m0(x, y, rectF4)) {
                                if (this.g1 > 0.5f) {
                                    if (y < rectF8.top) {
                                        z2 = true;
                                        f2 = 0.0f;
                                    } else if (y > rectF8.bottom) {
                                        f2 = 0.0f;
                                        z2 = true;
                                    } else if (this.i1 == 1) {
                                        int i2 = 0;
                                        while (true) {
                                            ArrayList arrayList2 = this.J;
                                            if (i2 >= arrayList2.size()) {
                                                break;
                                            }
                                            if (this.D7[i2].contains(x, y)) {
                                                arrayList2.remove(i2);
                                                c();
                                                i0();
                                                return true;
                                            }
                                            i2++;
                                        }
                                    } else {
                                        getWidth();
                                        float L2 = (this.k1 + y) - (gl.L(4.0f) + rectF8.top);
                                        if (L2 >= 0.0f) {
                                            float L3 = x - (rectF8.left + gl.L(4.0f));
                                            float width2 = rectF8.width() - gl.L(8.0f);
                                            if (L3 >= 0.0f && L3 < width2) {
                                                int i3 = this.i1;
                                                if (i3 == 2) {
                                                    if (!h0()) {
                                                        float f4 = width2 / 3.0f;
                                                        float f0 = width2 / f0();
                                                        if (L2 >= 0.0f) {
                                                            int f02 = (f0() * ((int) ((L2 - 0.0f) / f4))) + ((int) (L3 / f0));
                                                            if (f02 >= 0 && f02 < arrayList.size()) {
                                                                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                                                                this.S7 = currentAnimationTimeMillis;
                                                                sw8 sw8Var = this.G;
                                                                if (sw8Var.a == 2 && sw8Var.q == f02) {
                                                                    this.T7 = currentAnimationTimeMillis;
                                                                    this.Q7 = -1;
                                                                    this.O7 = 0.0f;
                                                                    setSceneFromCard(t(this.M7));
                                                                    setPattern(W());
                                                                    B0();
                                                                    return true;
                                                                }
                                                                int i4 = this.L7;
                                                                if (i4 >= 0 && i4 != f02 && this.O7 > 0.5f) {
                                                                    this.Q7 = i4;
                                                                    this.T7 = currentAnimationTimeMillis;
                                                                }
                                                                this.L7 = f02;
                                                                this.N7 = 0.0f;
                                                                this.O7 = 1.0f;
                                                                I0(getWidth() / 2.0f, (l() / 2.0f) + m(), f02);
                                                                B0();
                                                                return true;
                                                            }
                                                        }
                                                    } else if (rectF.contains(x, y)) {
                                                        i0();
                                                        if (z24Var != null) {
                                                            ((gw8) z24Var.b).d0();
                                                            return true;
                                                        }
                                                    }
                                                } else if (i3 == 0) {
                                                    float f5 = width2 / 6.0f;
                                                    int i5 = (((int) (L2 / f5)) * 6) + ((int) (L3 / f5));
                                                    if (i5 >= 0 && i5 < ld0.b.length) {
                                                        int c = ld0.c(i5);
                                                        int i6 = F9;
                                                        if (c != i6 || (tw8Var = this.n) == null || tw8Var.a != 0 || tw8Var.f != i6 || this.G.a != 0) {
                                                            int c2 = ld0.c(i5);
                                                            this.M7 = c2;
                                                            boolean z5 = this.G.a == 2;
                                                            if (z5) {
                                                                this.T7 = AnimationUtils.currentAnimationTimeMillis();
                                                                this.Q7 = -1;
                                                                this.O7 = 0.0f;
                                                            }
                                                            setSceneFromCard(t(c2));
                                                            if (z5) {
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
                                    this.h1 = f2;
                                    return z2;
                                }
                                if (this.a && m0(x, y, rectF7)) {
                                    int max = Math.max(0, Math.min(2, (int) ((x - rectF7.left) / (rectF7.width() / 3.0f))));
                                    if (this.m1 <= 0.0f && this.l1 <= 0.05f) {
                                        F0(max);
                                        return true;
                                    }
                                    this.m1 = 0.0f;
                                    i0();
                                    postDelayed(new mw8(this, max, (byte) 2), 200L);
                                    return true;
                                }
                                if (this.q7 || !m0(x, y, rectF3)) {
                                    if (!this.q7 && m0(x, y, rectF2) && z24Var != null) {
                                        ((gw8) z24Var.b).g0();
                                        return true;
                                    }
                                } else if (z24Var != null) {
                                    ((gw8) z24Var.b).h0(getCurrentLink());
                                    return true;
                                }
                            } else if (this.L0) {
                                if (this.w0) {
                                    this.y0 = this.x0;
                                    this.m1 = 1.0f;
                                    l0();
                                    i0();
                                    return true;
                                }
                                this.w0 = true;
                                this.r2 = 0L;
                                this.x0 = true;
                                this.B0 = true;
                                this.A0 = System.currentTimeMillis() + 60000;
                                this.D0 = this.C0;
                                this.E0 = 1.0f;
                                this.F0 = System.currentTimeMillis();
                                this.G0 = false;
                                this.e1 = true;
                                this.n2 = AnimationUtils.currentAnimationTimeMillis();
                                this.p2 = System.currentTimeMillis() + 340;
                                this.e = null;
                                this.v0 = null;
                                this.A2 = null;
                                t1(false);
                                d1(R.drawable.msg_recent, a0(), null);
                                i0();
                                if (z24Var != null) {
                                    z24Var.W(1);
                                    return true;
                                }
                            }
                            return true;
                        }
                        int i7 = 0;
                        while (true) {
                            if (i7 >= 3) {
                                this.m1 = 0.0f;
                                if (rectF7.contains(x, y)) {
                                    int max2 = Math.max(0, Math.min(2, (int) ((x - rectF7.left) / (rectF7.width() / 3.0f))));
                                    i0();
                                    postDelayed(new mw8(this, max2, (byte) 1), 200L);
                                    return true;
                                }
                            } else if (rectFArr[i7].contains(x, y)) {
                                this.m1 = 0.0f;
                                if (i7 == 0) {
                                    if (this.x0) {
                                        this.B0 = true;
                                        this.A0 = System.currentTimeMillis() + 60000;
                                    }
                                    this.B2 = -1;
                                    if (z24Var == null || (kw8Var = ((gw8) z24Var.b).e) == null) {
                                        z3 = true;
                                    } else {
                                        z3 = true;
                                        kw8Var.n(true, kw8Var.d == 1);
                                    }
                                    t1(z3);
                                    if (this.x0) {
                                        d1(R.drawable.msg_recent, a0(), null);
                                    } else {
                                        d1(R.drawable.msg_retry, k96.M0(2131746284, null), null);
                                    }
                                    i0();
                                    return true;
                                }
                                if (i7 != 1) {
                                    U0(k96.M0(2131746285, null));
                                    return true;
                                }
                                boolean z6 = this.x0;
                                this.x0 = !z6;
                                if (z6) {
                                    this.B0 = false;
                                } else {
                                    this.B0 = true;
                                    this.A0 = System.currentTimeMillis() + 60000;
                                }
                                this.B2 = -1;
                                t1(true);
                                d1(R.drawable.msg_recent, this.x0 ? a0() : k96.M0(2131746283, null), null);
                                if (z24Var != null) {
                                    z24Var.W(this.x0 ? 1 : 2);
                                    return true;
                                }
                            } else {
                                i7++;
                            }
                        }
                    } else {
                        if (this.g1 > 0.001f) {
                            this.h1 = 0.0f;
                            invalidate();
                            return true;
                        }
                        if (z24Var != null) {
                            gw8 gw8Var = (gw8) z24Var.b;
                            if (gw8Var.getParentActivity() != null) {
                                if (gw8Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                    gw8Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                    return true;
                                }
                                gw8Var.e0();
                                return true;
                            }
                        }
                    }
                }
            } else if (actionMasked != 2) {
                if (actionMasked != 3) {
                    return super.onTouchEvent(motionEvent);
                }
                removeCallbacks(ow8Var);
                Q0();
                S0();
                if (this.S) {
                    this.S = false;
                    R0();
                    return true;
                }
            } else if (this.S) {
                this.l0.addMovement(motionEvent);
                float f6 = x - this.h9;
                float f7 = y - this.i9;
                if (!this.T && Math.hypot(f6, f7) > gl.L(8.0f)) {
                    this.T = true;
                }
                if (this.T) {
                    this.O = this.Q + f6;
                    this.P = this.R + f7;
                    this.f0 = (getWidth() * 0.32f * ((float) Math.tanh((f6 / Math.max(1.0f, r4)) * 2.5f))) + this.h0;
                    this.g0 = (0.32f * getHeight() * ((float) Math.tanh((f7 / Math.max(1.0f, r2)) * 2.5f))) + this.i0;
                    return true;
                }
            } else {
                int i8 = this.r9;
                if (i8 >= 0 && (rippleDrawable = this.q9[i8]) != null) {
                    rippleDrawable.setHotspot(x, y);
                }
                if (this.r9 >= 0 && Math.hypot(x - this.h9, y - this.i9) > gl.L(10.0f)) {
                    Q0();
                }
                if (Math.hypot(x - this.h9, y - this.i9) > gl.L(10.0f)) {
                    S0();
                }
                VelocityTracker velocityTracker2 = this.m9;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                if (!this.o9 && this.g1 > 0.5f) {
                    float f8 = this.i9;
                    if (f8 > rectF8.top && Math.abs(y - f8) > viewConfiguration.getScaledTouchSlop()) {
                        this.o9 = true;
                        removeCallbacks(ow8Var);
                        this.i9 = y;
                        this.j9 = this.k1;
                    }
                }
                if (this.o9) {
                    this.k1 = Math.max(0.0f, Math.min(z0(), this.j9 - (y - this.i9)));
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
            this.h9 = x;
            this.i9 = y;
            this.j9 = this.k1;
            this.o9 = false;
            VelocityTracker velocityTracker3 = this.m9;
            if (velocityTracker3 == null) {
                this.m9 = VelocityTracker.obtain();
            } else {
                velocityTracker3.clear();
            }
            this.m9.addMovement(motionEvent);
            if (this.g1 < 0.5f && this.l1 < 0.5f) {
                float width3 = getWidth() * 0.745f;
                float width4 = (getWidth() - width3) / 2.0f;
                float m = m();
                if ((x <= width4 || x >= width4 + width3 || y <= m || y >= l() + m) && ((!this.L0 || !m0(x, y, rectF4)) && !m0(x, y, rectF5) && ((this.q7 || (!m0(x, y, rectF3) && !m0(x, y, rectF2))) && !m0(x, y, rectF6) && !m0(x, y, rectF7)))) {
                    z = true;
                    this.S = z;
                    if (this.g1 > 0.5f && this.i1 == 2) {
                        int f03 = f0();
                        float L4 = x - (rectF8.left + gl.L(4.0f));
                        float L5 = ((this.k1 + y) - (gl.L(4.0f) + rectF8.top)) - 0.0f;
                        width = (L4 >= 0.0f || L5 < 0.0f || h0()) ? -1 : ((int) (L4 / ((rectF8.width() - gl.L(8.0f)) / f03))) + (((int) (L5 / ((rectF8.width() - gl.L(8.0f)) / 3.0f))) * f03);
                        if (width >= 0 && width < arrayList.size()) {
                            this.P7 = width;
                            this.R7 = AnimationUtils.currentAnimationTimeMillis();
                        }
                    }
                    if (this.g1 > 0.5f || this.i1 != 0 || y <= rectF8.top) {
                        f = 0.0f;
                    } else {
                        float L6 = x - (rectF8.left + gl.L(4.0f));
                        float L7 = (this.k1 + y) - (gl.L(4.0f) + rectF8.top);
                        float width5 = (rectF8.width() - gl.L(8.0f)) / 6.0f;
                        f = 0.0f;
                        int i9 = (L6 < 0.0f || L7 < 0.0f || L6 >= 6.0f * width5) ? -1 : ((int) (L6 / width5)) + (((int) (L7 / width5)) * 6);
                        if (i9 >= 0 && i9 < ld0.b.length) {
                            this.V7 = i9;
                            this.W7 = AnimationUtils.currentAnimationTimeMillis();
                            invalidate();
                        }
                    }
                    this.T = false;
                    if (this.S) {
                        this.U = false;
                        this.V = false;
                        this.Q = this.O;
                        this.R = this.P;
                        this.h0 = this.f0;
                        this.i0 = this.g0;
                        VelocityTracker velocityTracker4 = this.l0;
                        if (velocityTracker4 == null) {
                            this.l0 = VelocityTracker.obtain();
                        } else {
                            velocityTracker4.clear();
                        }
                        this.l0.addMovement(motionEvent);
                    }
                    removeCallbacks(ow8Var);
                    if (this.l1 > 0.5f) {
                        for (int i10 = 0; i10 < 3; i10++) {
                            rectFArr[i10].contains(x, y);
                        }
                    }
                    Q0();
                    if (this.l1 <= 0.5f) {
                        if (this.l7 || !m0(x, y, rectF6)) {
                            for (int i11 = 0; i11 < 3; i11++) {
                                if (rectFArr[i11].contains(x, y)) {
                                    i = i11;
                                    break;
                                }
                            }
                            i = -1;
                            if (i >= 0) {
                                long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                                long[] jArr = this.x9;
                                this.z9[i] = jArr[i] != 0 ? this.y9[i] * ((float) Math.exp((-(currentAnimationTimeMillis2 - r6)) / 180.0f)) : f;
                                jArr[i] = 0;
                                this.u9[i] = x;
                                this.v9[i] = y;
                                this.w9[i] = currentAnimationTimeMillis2;
                                this.r9 = i;
                                invalidate();
                                return true;
                            }
                        }
                        i = 5;
                        if (i >= 0) {
                        }
                    } else {
                        if (m0(x, y, rectF5)) {
                            i = 3;
                        } else {
                            if (this.l7 || !m0(x, y, rectF6)) {
                                if (this.L0 && m0(x, y, rectF4)) {
                                    i = 9;
                                } else {
                                    if (this.g1 < 0.5f) {
                                        if (!this.q7 && m0(x, y, rectF3)) {
                                            i = 4;
                                        } else if (!this.q7 && m0(x, y, rectF2)) {
                                            i = 11;
                                        } else if (this.a && m0(x, y, rectF7)) {
                                            i = Math.max(0, Math.min(2, (int) ((x - rectF7.left) / (rectF7.width() / 3.0f)))) + 6;
                                        }
                                    }
                                    if (this.g1 > 0.5f && this.i1 == 2 && h0() && m0(x, y, rectF)) {
                                        i = 10;
                                    }
                                    i = -1;
                                }
                            }
                            i = 5;
                        }
                        if (i >= 0) {
                        }
                    }
                }
            }
            z = false;
            this.S = z;
            if (this.g1 > 0.5f) {
                int f032 = f0();
                float L42 = x - (rectF8.left + gl.L(4.0f));
                float L52 = ((this.k1 + y) - (gl.L(4.0f) + rectF8.top)) - 0.0f;
                if (L42 >= 0.0f) {
                }
                if (width >= 0) {
                    this.P7 = width;
                    this.R7 = AnimationUtils.currentAnimationTimeMillis();
                }
            }
            if (this.g1 > 0.5f) {
            }
            f = 0.0f;
            this.T = false;
            if (this.S) {
            }
            removeCallbacks(ow8Var);
            if (this.l1 > 0.5f) {
            }
            Q0();
            if (this.l1 <= 0.5f) {
            }
        }
        return true;
    }

    public final void p(float f, float f2, float f3) {
        float L;
        float nextFloat;
        float f4;
        float e;
        int i = this.d1;
        if (i >= 320) {
            return;
        }
        this.d1 = i + 1;
        Random random = this.f1;
        float nextFloat2 = random.nextFloat();
        int i2 = nextFloat2 < 0.65f ? 0 : nextFloat2 < 0.9f ? 1 : 2;
        byte[] bArr = this.b1;
        bArr[i] = (byte) i2;
        this.c1[i] = false;
        this.N0[i] = ((random.nextFloat() - 0.5f) * gl.L(4.0f)) + f;
        this.O0[i] = f2;
        byte b = bArr[i];
        if (b == 0) {
            L = gl.L(1.4f);
            nextFloat = random.nextFloat();
            f4 = 1.6f;
        } else {
            if (b == 1) {
                e = oo1.e(0.7f, random.nextFloat(), gl.N(0.7f));
                this.T0[i] = e;
                this.P0[i] = (random.nextFloat() * gl.L(80.0f)) + (-gl.L(30.0f));
                this.Q0[i] = (-gl.L(50.0f)) - (random.nextFloat() * gl.L(100.0f));
                this.R0[i] = Math.max(0.05f, Math.min((random.nextFloat() * 0.2f) + 0.3f, f3));
                this.S0[i] = 0.0f;
                this.U0[i] = random.nextFloat() * 90.0f;
                this.V0[i] = (random.nextFloat() - 0.5f) * 1080.0f;
            }
            L = gl.L(3.0f);
            nextFloat = random.nextFloat();
            f4 = 1.5f;
        }
        e = (nextFloat * gl.L(f4)) + L;
        this.T0[i] = e;
        this.P0[i] = (random.nextFloat() * gl.L(80.0f)) + (-gl.L(30.0f));
        this.Q0[i] = (-gl.L(50.0f)) - (random.nextFloat() * gl.L(100.0f));
        this.R0[i] = Math.max(0.05f, Math.min((random.nextFloat() * 0.2f) + 0.3f, f3));
        this.S0[i] = 0.0f;
        this.U0[i] = random.nextFloat() * 90.0f;
        this.V0[i] = (random.nextFloat() - 0.5f) * 1080.0f;
    }

    public final oy8 p1() {
        if (this.a9 == null) {
            oy8 oy8Var = new oy8(R.raw.ic_save_to_gallery, gl.L(28.0f), gl.L(28.0f));
            this.a9 = oy8Var;
            oy8Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            this.a9.F(0);
            this.a9.M(this);
            this.a9.E(true);
        }
        return this.a9;
    }

    public final void q(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean z, boolean z2) {
        int i = this.d1;
        if (i >= 320) {
            return;
        }
        this.d1 = i + 1;
        this.b1[i] = z ? (byte) 1 : (byte) 0;
        this.c1[i] = true;
        this.N0[i] = f;
        this.O0[i] = f2;
        this.P0[i] = f3;
        this.Q0[i] = f4;
        this.W0[i] = f;
        this.X0[i] = f2;
        this.Y0[i] = f5;
        Random random = this.f1;
        this.Z0[i] = z2 ? ug8.e(random, 3.0f, 4.0f) : 0.0f;
        this.a1[i] = random.nextFloat() * 6.2832f;
        this.T0[i] = f6;
        this.R0[i] = f7;
        this.S0[i] = 0.0f;
        this.U0[i] = f8;
        this.V0[i] = 0.0f;
    }

    public final oy8 q1() {
        if (this.Y8 == null) {
            oy8 oy8Var = new oy8(R.raw.star_premium_2, gl.L(27.0f), gl.L(27.0f));
            this.Y8 = oy8Var;
            oy8Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            this.Y8.F(0);
            this.Y8.M(this);
            this.Y8.E(true);
        }
        return this.Y8;
    }

    public final float r1(String str) {
        int indexOf = str.indexOf(10);
        TextPaint textPaint = this.D1;
        if (indexOf >= 0) {
            return Math.max(textPaint.measureText(str, 0, indexOf), textPaint.measureText(str, indexOf + 1, str.length()));
        }
        if (!s0(str)) {
            return textPaint.measureText(str);
        }
        float textSize = textPaint.getTextSize();
        TextPaint textPaint2 = this.z2;
        textPaint2.setTextSize(textSize);
        return textPaint.measureText(this.y2) + textPaint2.measureText(this.x2) + textPaint.measureText(this.w2);
    }

    public final boolean s0(String str) {
        return str != null && str.equals(this.v2);
    }

    public void setFeeStars(long j) {
        this.L0 = j > 0;
        String a0 = j > 0 ? k96.a0(null, null, 2131746288, k96.E(j, ',')) : "";
        int indexOf = a0.indexOf(9733);
        this.J0 = indexOf >= 0 ? a0.substring(0, indexOf) : "";
        if (indexOf >= 0) {
            a0 = a0.substring(indexOf + 1);
        }
        this.K0 = a0;
        if (!this.L0 && this.w0) {
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
            this.v0 = null;
        } else {
            Utilities.e.c(new gm3(str, new nw8(this, str, (byte) 1)));
        }
    }

    public void setGiftsOwner(long j) {
        if (this.x1 == j) {
            return;
        }
        this.x1 = j;
        xsa xsaVar = this.j2;
        if (xsaVar != null) {
            xsaVar.f();
        }
        xsa xsaVar2 = new xsa(this.b, j, false);
        this.j2 = xsaVar2;
        xsaVar2.g = 776;
        xsaVar2.e = true;
        xsaVar2.k(true);
        y0();
    }

    public void setImmediateOnOpen(boolean z) {
        this.a2 = z;
    }

    public void setInstantTheme(boolean z) {
        this.g2 = z;
    }

    public void setLinkExpires(long j) {
        long j2 = this.H2;
        if (j2 == j) {
            return;
        }
        if (j2 != 0 && j != 0) {
            i0();
        }
        this.H2 = j;
        this.O2 = -1L;
        invalidate();
    }

    public void setOnPicksChanged(Runnable runnable) {
        this.e2 = runnable;
    }

    public void setReveal(float f) {
        float f2;
        float round;
        float sin;
        this.Q4 = f;
        if (this.T4) {
            double d = f * 0.86d;
            if (f >= 1.0f) {
                sin = 1.0f;
            } else {
                double d2 = 4.417382225408931d * d;
                sin = (float) (1.0d - (((Math.sin(d2) * 2.0647416048350564d) + Math.cos(d2)) * Math.exp((-9.120752865260691d) * d)));
            }
            float l = Utilities.l((f - 0.85f) / 0.15f);
            f2 = tb4.A(1.0f, sin, yjb.B(l, 2.0f, 3.0f, l * l), sin);
        } else {
            float f3 = 1.0f - f;
            f2 = 1.0f - (f3 * f3);
        }
        this.U4 = f2;
        boolean z = f < 1.0f;
        if (z) {
            round = Math.round((1.0f - f2) * gl.L(64.0f));
        } else {
            this.S4 = true;
            round = 0.0f;
        }
        setTranslationY(round);
        setAlpha(z ? Utilities.l(f2 / 0.35f) : 1.0f);
        if (getParent() instanceof View) {
            ((View) getParent()).setBackgroundColor(z ? a(f2, TLObject.FLAG_30) : 0);
        }
        float f4 = -1.0f;
        if (!z) {
            this.q3 = -1.0f;
        }
        if (z && this.T4) {
            f4 = Utilities.l(f2);
        }
        this.t0.D = f4;
        int i = z ? 2 : 0;
        if (getLayerType() != i) {
            setLayerType(i, null);
        }
        invalidate();
    }

    public void setRevealOpening(boolean z) {
        this.T4 = z;
    }

    public void setScanHidden(boolean z) {
        if (this.l7 != z) {
            this.l7 = z;
            invalidate();
        }
    }

    public void setTemporaryLink(boolean z) {
        if (this.C2 == z) {
            return;
        }
        this.C2 = z;
        if (!this.I2) {
            float f = z ? 1.0f : 0.0f;
            this.F2 = f;
            this.D2 = f;
        }
        invalidate();
    }

    public void setThemeEditable(boolean z) {
        if (this.a != z) {
            this.a = z;
            invalidate();
        }
    }

    public void setTimerOnly(boolean z) {
        this.z0 = z;
    }

    public final int t0() {
        int i = this.y6;
        SparseIntArray sparseIntArray = this.x6;
        if (i != 1) {
            sparseIntArray.clear();
            this.y6 = 1;
        }
        tw8 tw8Var = this.n;
        int i2 = tw8Var != null ? tw8Var.b : 0;
        int indexOfKey = sparseIntArray.indexOfKey(i2);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        int u = u(this.n);
        sparseIntArray.put(i2, u);
        return u;
    }

    public final void t1(boolean z) {
        String str;
        if (this.w0) {
            if (this.x0) {
                int ceil = (int) Math.ceil((this.B0 ? 60000L : Math.max(0L, this.A0 - System.currentTimeMillis())) / 1000.0d);
                if (ceil == this.B2 && this.A2 != null) {
                    return;
                }
                this.B2 = ceil;
                str = k96.M0(2131746297, null) + " · " + k96.a0(null, null, 2131746298, String.format(Locale.US, "%d:%02d", Integer.valueOf(ceil / 60), Integer.valueOf(ceil % 60)));
            } else {
                str = k96.M0(2131746297, null) + " · " + k96.M0(2131746290, null);
                this.B2 = -1;
            }
            if (str.equals(this.A2)) {
                return;
            }
            this.A2 = str;
            this.M0.t(str, z, true);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        oy8 oy8Var;
        return (drawable instanceof RippleDrawable) || drawable == this.M0 || drawable == this.Y1 || ((oy8Var = this.l8) != null && drawable == oy8Var) || super.verifyDrawable(drawable);
    }

    public final Drawable w(int i) {
        return getContext().getResources().getDrawable(i).mutate();
    }

    public final float w1(float f, float f2, int i, int i2) {
        float f3 = this.x;
        double max = Math.max(f3, i - f3);
        float f4 = this.y;
        return (((1.0f - ((float) Math.pow(1.0f - Utilities.l(((float) Math.hypot(f - this.x, f2 - this.y)) / (((float) Math.hypot(max, Math.max(f4, i2 - f4))) + gl.L(60.0f))), 0.4166666567325592d))) * 600.0f) / 1000.0f) - 0.03f;
    }

    public final void y(Canvas canvas, Bitmap bitmap) {
        float f = this.g3;
        float f2 = (-f) / 2.0f;
        float width = (bitmap.getWidth() - 0.5f) * f;
        float height = (bitmap.getHeight() - 0.5f) * f;
        RectF rectF = this.f3;
        rectF.set(f2, f2, width, height);
        canvas.drawBitmap(bitmap, (Rect) null, rectF, this.c3);
    }

    public final void y0() {
        int i;
        xsa xsaVar = this.j2;
        if (xsaVar == null) {
            return;
        }
        sw8 sw8Var = this.G;
        byte b = sw8Var.a;
        ArrayList arrayList = this.w1;
        long j = (b != 2 || (i = sw8Var.q) < 0 || i >= arrayList.size()) ? 0L : ((TL_stars.TL_starGiftUnique) arrayList.get(this.G.q)).id;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = j != 0 ? (TL_stars.TL_starGiftUnique) arrayList.get(this.G.q) : null;
        arrayList.clear();
        HashMap hashMap = this.z1;
        hashMap.clear();
        ArrayList arrayList2 = xsaVar.l;
        int size = arrayList2.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
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
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    i4 = -1;
                    break;
                } else if (((TL_stars.TL_starGiftUnique) arrayList.get(i4)).id == j) {
                    break;
                } else {
                    i4++;
                }
            }
            if (i4 < 0) {
                arrayList.add(0, tL_starGiftUnique);
            } else {
                i2 = i4;
            }
            this.G.q = i2;
            this.L7 = i2;
        }
        boolean z = xsaVar.j;
        this.y1 = z;
        if (!z && !xsaVar.i) {
            xsaVar.a();
        }
        if (!arrayList.isEmpty() && !this.m2) {
            this.m2 = true;
            ow8 ow8Var = this.l2;
            removeCallbacks(ow8Var);
            postDelayed(ow8Var, 900L);
        }
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0591 A[EDGE_INSN: B:154:0x0591->B:155:0x0591 BREAK  A[LOOP:3: B:144:0x0534->B:151:0x055d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x07ce  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0891  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x08d1  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x08f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x08fe  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x09ec  */
    /* JADX WARN: Removed duplicated region for block: B:270:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x091b  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x09d0  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x09db  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x09dd  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x09cb  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0916  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0354  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(Canvas canvas, int i, int i2) {
        Canvas canvas2;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float min;
        long j;
        float f14;
        float f15;
        float[] fArr;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        int i3;
        float f23;
        float[] fArr2;
        float f24;
        float f25;
        float[] fArr3;
        float f26;
        float f27;
        boolean z;
        sw8 sw8Var;
        boolean z2;
        sw8 sw8Var2;
        int i4;
        boolean z3;
        boolean z4;
        float f28;
        int ceil;
        int ceil2;
        Bitmap bitmap;
        int i5;
        boolean z5;
        float f29;
        float f30;
        int i6;
        byte b;
        vw8 vw8Var = this;
        boolean z6 = (vw8Var.s >= 1.0f || vw8Var.r == null || vw8Var.n == null) ? false : true;
        if (vw8Var.n == null || i <= 0 || i2 <= 0) {
            canvas2 = canvas;
            f = 0.2f;
            f2 = 1.0f;
            f3 = 3.0f;
            f4 = 0.0f;
            f5 = 0.6f;
            f6 = 2.0f;
            f7 = 0.45f;
            canvas2.drawColor(-16777216);
        } else {
            float max = Math.max(i, i2) / 160.0f;
            float f31 = i;
            f5 = 0.6f;
            int ceil3 = ((int) Math.ceil(f31 / max)) + 1;
            float f32 = i2;
            int ceil4 = ((int) Math.ceil(f32 / max)) + 1;
            Bitmap bitmap2 = vw8Var.Z2;
            Paint paint = vw8Var.d3;
            if (bitmap2 != null && bitmap2.getWidth() == ceil3 && vw8Var.Z2.getHeight() == ceil4) {
                f6 = 2.0f;
            } else {
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                f6 = 2.0f;
                vw8Var.Z2 = Bitmap.createBitmap(ceil3, ceil4, config);
                vw8Var.a3 = Bitmap.createBitmap(ceil3, ceil4, config);
                Bitmap bitmap3 = vw8Var.Z2;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                vw8Var.b3 = bitmapShader;
                paint.setShader(bitmapShader);
                vw8Var.h3 = false;
            }
            vw8Var.g3 = max;
            vw8Var.M0(0, z6 ? vw8Var.r : vw8Var.n, i, i2);
            vw8Var.i3 = false;
            int[] iArr = vw8Var.m3;
            float[] fArr4 = vw8Var.o3;
            if (z6) {
                vw8Var.M0(1, vw8Var.n, i, i2);
                float x1 = x1(vw8Var.s);
                float f33 = vw8Var.x;
                b = 1;
                double max2 = Math.max(f33, f31 - f33);
                i6 = 0;
                float f34 = vw8Var.y;
                float hypot = (((float) Math.hypot(max2, Math.max(f34, f32 - f34))) + gl.L(60.0f)) * x1;
                fArr4[0] = vw8Var.x;
                fArr4[1] = vw8Var.y;
                fArr4[2] = hypot;
                boolean z7 = hypot > ((float) gl.L(4.0f));
                vw8Var.i3 = z7;
                if (z7) {
                    float U1 = gl.U1(x1, gl.L(90.0f), gl.L(56.0f));
                    float l = Utilities.l((1.0f - vw8Var.s) * 1.6f) * 0.38f;
                    float max3 = Math.max(0.0f, hypot - U1) / hypot;
                    float L = gl.L(8.0f) + hypot;
                    fArr4[3] = max3 * hypot;
                    fArr4[4] = gl.R1(max3, 1.0f, 0.45f) * hypot;
                    fArr4[5] = gl.R1(max3, 1.0f, 0.82f) * hypot;
                    fArr4[6] = hypot - (0.004f * L);
                    fArr4[7] = hypot + gl.L(3.0f);
                    fArr4[8] = L;
                    fArr4[9] = 0.0f;
                    fArr4[10] = l * 0.2f;
                    fArr4[11] = l * 0.6f;
                    fArr4[12] = l;
                    fArr4[13] = l * 0.4f;
                    fArr4[14] = 0.0f;
                    iArr[6] = hv8.k(0.55f, vw8Var.n.b, -1);
                }
            } else {
                i6 = 0;
                b = 1;
            }
            byte b2 = z6 ? (byte) 2 : b;
            boolean z8 = vw8Var.h3;
            float[] fArr5 = vw8Var.p3;
            int[] iArr2 = vw8Var.n3;
            float[] fArr6 = vw8Var.l3;
            float[] fArr7 = vw8Var.k3;
            if (z8 && b2 == vw8Var.j3 && Arrays.equals(fArr7, fArr6) && Arrays.equals(iArr, iArr2) && (!z6 || Arrays.equals(fArr4, fArr5))) {
                f2 = 1.0f;
            } else {
                f2 = 1.0f;
                Utilities.generateQrBackdrop(vw8Var.Z2, vw8Var.i3 ? vw8Var.a3 : null, max, b2, vw8Var.k3, vw8Var.m3, vw8Var.o3);
                max = max;
                int i7 = i6;
                System.arraycopy(fArr7, i7, fArr6, i7, fArr7.length);
                System.arraycopy(iArr, i7, iArr2, i7, iArr.length);
                System.arraycopy(fArr4, i7, fArr5, i7, fArr4.length);
                vw8Var.j3 = b2;
                vw8Var.h3 = b;
            }
            if (vw8Var.Q4 < f2) {
                if (vw8Var.q3 < 0.0f && vw8Var.isAttachedToWindow()) {
                    vw8Var.q3 = yz.r(vw8Var);
                }
                if (vw8Var.q3 > 0.0f) {
                    Matrix matrix = vw8Var.e3;
                    matrix.setScale(max, max);
                    float f35 = (-max) / f6;
                    matrix.postTranslate(f35, f35);
                    vw8Var.b3.setLocalMatrix(matrix);
                    float f36 = vw8Var.q3;
                    canvas2 = canvas;
                    f = 0.2f;
                    f3 = 3.0f;
                    f4 = 0.0f;
                    f7 = 0.45f;
                    canvas2.drawRoundRect(0.0f, 0.0f, f31, f32, f36, f36, paint);
                } else {
                    f4 = 0.0f;
                }
            } else {
                f4 = 0.0f;
            }
            canvas2 = canvas;
            f = 0.2f;
            f3 = 3.0f;
            f7 = 0.45f;
            vw8Var.y(canvas2, vw8Var.Z2);
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        float f37 = (currentAnimationTimeMillis - vw8Var.E) / 1000.0f;
        vw8Var.w3 = f37;
        float f38 = vw8Var.P3;
        float max4 = f38 < f4 ? f4 : Math.max(f4, Math.min(0.05f, f37 - f38));
        float f39 = vw8Var.w3;
        vw8Var.P3 = f39;
        if (vw8Var.S || vw8Var.U || vw8Var.V) {
            vw8Var.Q3 = f39 + 0.25f;
        } else if (f39 >= vw8Var.Q3) {
            f8 = f2;
            float f40 = vw8Var.O3;
            float f41 = f8 >= f40 ? 0.07f : f7;
            if (max4 <= f4) {
                f11 = 0.05f;
                float f42 = (-max4) / f41;
                f9 = 1000.0f;
                f10 = max4;
                f40 = tb4.A(f2, (float) Math.exp(f42), f8 - f40, f40);
                vw8Var.O3 = f40;
            } else {
                f9 = 1000.0f;
                f10 = max4;
                f11 = 0.05f;
            }
            float f43 = f10 * f40;
            float f44 = vw8Var.N3 + f43;
            vw8Var.N3 = f44;
            float f45 = vw8Var.w3;
            if (vw8Var.N >= f4 || f43 <= f4) {
                f12 = f3;
                f13 = 0.016f;
            } else {
                float f46 = f44 - (f43 / f6);
                f13 = 0.016f;
                double sin = (((float) Math.sin((f46 * 0.016f) + 1.0f)) * f5) + ((((float) Math.sin(0.025f * f46)) * 1.2f) - 2.1375256f);
                f12 = f3;
                vw8Var.L = b00.w(((float) Math.cos(sin)) * 6.2f, gl.L(1.0f), f43, vw8Var.L);
                vw8Var.M = b00.w(((float) Math.sin(sin)) * 6.2f, gl.L(1.0f), f43, vw8Var.M);
            }
            float f47 = vw8Var.N;
            min = f47 < f4 ? Math.min(0.033f, Math.max(f4, f45 - f47)) : f4;
            vw8Var.N = f45;
            if (min > f4) {
                rw8 rw8Var = vw8Var.M3;
                int i8 = rw8Var.m;
                int[] iArr3 = rw8Var.l;
                if (i8 > 0) {
                    float f48 = min / f6;
                    int i9 = 0;
                    boolean z9 = false;
                    while (i9 < 2) {
                        float[] fArr8 = rw8Var.c;
                        float[] fArr9 = rw8Var.j;
                        float[] fArr10 = rw8Var.i;
                        float f49 = f;
                        float[] fArr11 = rw8Var.h;
                        float f50 = f4;
                        float[] fArr12 = rw8Var.g;
                        long j2 = currentAnimationTimeMillis;
                        float[] fArr13 = rw8Var.f;
                        float[] fArr14 = rw8Var.e;
                        float[] fArr15 = rw8Var.d;
                        boolean z10 = false;
                        for (int i10 = 0; i10 < rw8Var.m; i10++) {
                            int i11 = iArr3[i10];
                            float f51 = fArr8[i11];
                            if (f51 != f50 || fArr15[i11] != f50 || fArr14[i11] != f50 || fArr13[i11] != f50 || fArr12[i11] != f50 || fArr11[i11] != f50 || fArr10[i11] != f50 || fArr9[i11] != f50) {
                                float f52 = fArr14[i11];
                                float f53 = (((f51 * (-220.0f)) - (18.392172f * f52)) * f48) + f52;
                                fArr14[i11] = f53;
                                fArr8[i11] = (f53 * f48) + fArr8[i11];
                                float f54 = fArr13[i11];
                                float f55 = (((fArr15[i11] * (-220.0f)) - (18.392172f * f54)) * f48) + f54;
                                fArr13[i11] = f55;
                                fArr15[i11] = (f55 * f48) + fArr15[i11];
                                float f56 = fArr11[i11];
                                float f57 = (((fArr12[i11] * (-220.0f)) - (18.392172f * f56)) * f48) + f56;
                                fArr11[i11] = f57;
                                fArr12[i11] = (f57 * f48) + fArr12[i11];
                                float f58 = fArr9[i11];
                                float f59 = (((fArr10[i11] * (-220.0f)) - (18.392172f * f58)) * f48) + f58;
                                fArr9[i11] = f59;
                                fArr10[i11] = (f59 * f48) + fArr10[i11];
                                if (Math.abs(fArr13[i11]) + Math.abs(fArr14[i11]) + Math.abs(fArr15[i11]) + Math.abs(fArr8[i11]) < f11) {
                                    if (Math.abs(fArr11[i11]) + Math.abs(fArr12[i11]) < 0.02f) {
                                        if (Math.abs(fArr9[i11]) + Math.abs(fArr10[i11]) < 5.0E-4f) {
                                            fArr9[i11] = f50;
                                            fArr10[i11] = f50;
                                            fArr11[i11] = f50;
                                            fArr12[i11] = f50;
                                            fArr13[i11] = f50;
                                            fArr14[i11] = f50;
                                            fArr15[i11] = f50;
                                            fArr8[i11] = f50;
                                        }
                                    }
                                }
                                z10 = true;
                            }
                        }
                        z9 |= z10;
                        i9++;
                        f = f49;
                        currentAnimationTimeMillis = j2;
                        f4 = f50;
                    }
                    j = currentAnimationTimeMillis;
                    f14 = f4;
                    f15 = f;
                    if (!z9 && (vw8Var.s >= 1.0f || vw8Var.r == null)) {
                        for (int i12 = 0; i12 < rw8Var.m; i12++) {
                            rw8Var.b[iArr3[i12]] = false;
                        }
                        rw8Var.m = 0;
                    }
                    if (vw8Var.U) {
                        float f60 = (j - vw8Var.W) / f9;
                        float exp = (1.0f - ((float) Math.exp((-f60) / 0.35f))) * 0.35f;
                        vw8Var.O = (vw8Var.d0 * exp) + vw8Var.b0;
                        vw8Var.P = (vw8Var.e0 * exp) + vw8Var.c0;
                        if (f60 > 2.8f) {
                            vw8Var.U = false;
                        }
                    }
                    if (vw8Var.V) {
                        float f61 = (j - vw8Var.a0) / f9;
                        float cos = (float) (Math.cos((f61 * 6.283185307179586d) / 0.8500000238418579d) * Math.exp((-f61) / 0.22f));
                        vw8Var.f0 = vw8Var.j0 * cos;
                        vw8Var.g0 = vw8Var.k0 * cos;
                        if (f61 > 1.6f) {
                            vw8Var.V = false;
                            float f62 = f14;
                            vw8Var.g0 = f62;
                            vw8Var.f0 = f62;
                        }
                    }
                    fArr = lcd.b;
                    f16 = fArr[27] / 100.0f;
                    while (true) {
                        f17 = vw8Var.w3;
                        f18 = vw8Var.G3;
                        f19 = vw8Var.H3;
                        f20 = f18 + f19;
                        f21 = 1.5f;
                        if (f17 < f20) {
                            break;
                        }
                        vw8Var.G3 = f20;
                        float f63 = fArr[25] + f15;
                        float f64 = fArr[26];
                        sw8 sw8Var3 = vw8Var.G;
                        if (sw8Var3 == null || sw8Var3.a != 1) {
                            f21 = 1.0f;
                        }
                        vw8Var.H3 = Math.max(f63, (vw8Var.f1.nextFloat() * 0.8f * f16) + (f64 * f21));
                        double radians = Math.toRadians(((r7.nextFloat() - 0.5f) * 12.0f * f16) + fArr[24]);
                        vw8Var.I3 = (float) Math.cos(radians);
                        vw8Var.J3 = (float) Math.sin(radians);
                    }
                    if (!vw8Var.E3) {
                        vw8Var.E3 = true;
                        f18 = (fArr[51] / f9) + f17 + 1.5f;
                        vw8Var.G3 = f18;
                        vw8Var.H3 = f9;
                        f19 = 1000.0f;
                    }
                    f22 = fArr[25];
                    if (f17 >= f18 + f22 && f19 > 999.0f) {
                        vw8Var.H3 = fArr[26];
                    }
                    float f65 = (f17 - f18) / f22;
                    vw8Var.z3 = vw8Var.Q4 < 1.0f && f65 >= 0.0f && f65 < 1.0f;
                    vw8Var.y3 = gl.N(fArr[23]);
                    if (vw8Var.z3) {
                        f23 = 0.35f;
                        fArr2 = fArr;
                        float cos2 = 0.5f - (((float) Math.cos(f65 * 3.141592653589793d)) * 0.5f);
                        i3 = i;
                        float y = (vw8Var.y3 * f12) + b00.y(Math.abs(vw8Var.J3), i2, Math.abs(vw8Var.I3) * i3, f6);
                        vw8Var.x3 = gl.R1(-y, y, cos2);
                        vw8Var.F3 = 1.0f;
                    } else {
                        i3 = i;
                        f23 = 0.35f;
                        fArr2 = fArr;
                    }
                    long nanoTime = System.nanoTime();
                    float min2 = vw8Var.U6 == 0 ? f13 : Math.min(0.1f, (nanoTime - r6) / 1.0E9f);
                    vw8Var.U6 = nanoTime;
                    if (fArr2[15] >= 0.5f || vw8Var.Q4 < 1.0f) {
                        f24 = f23;
                        f25 = 100.0f;
                        fArr3 = fArr2;
                        f26 = 12.0f;
                        f27 = 0.0f;
                        vw8Var.Q6 = 0.0f;
                    } else {
                        float max5 = 30.0f / Math.max(1.0f, fArr2[16]);
                        float max6 = Math.max(-1.0f, Math.min(1.0f, vw8Var.F6 * max5));
                        f24 = f23;
                        float max7 = Math.max(-1.0f, Math.min(1.0f, vw8Var.G6 * max5));
                        if (!vw8Var.V6) {
                            vw8Var.R6 = max6;
                            vw8Var.S6 = max7;
                            vw8Var.V6 = true;
                        }
                        fArr3 = fArr2;
                        f25 = 100.0f;
                        f26 = 12.0f;
                        float hypot2 = ((float) Math.hypot(max6 - vw8Var.R6, max7 - vw8Var.S6)) / min2;
                        vw8Var.R6 = max6;
                        vw8Var.S6 = max7;
                        long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                        if (hypot2 > 0.15f) {
                            vw8Var.T6 = currentAnimationTimeMillis2;
                        }
                        boolean z11 = currentAnimationTimeMillis2 - vw8Var.T6 < 1500;
                        float z12 = yjb.z(max7, -vw8Var.J3, max6 * (-vw8Var.I3), b00.y(Math.abs(vw8Var.J3), i2, Math.abs(vw8Var.I3) * i3, 2.0f) + vw8Var.y3);
                        if (vw8Var.Q6 <= 0.001f) {
                            vw8Var.P6 = z12;
                        }
                        float f66 = vw8Var.P6;
                        vw8Var.P6 = tb4.A(1.0f, (float) Math.exp((-min2) / 0.1f), z12 - f66, f66);
                        float f67 = vw8Var.Q6;
                        float z13 = z11 ? ls6.z(min2, f15, f67, 1.0f) : oo1.x(min2, f5, f67, 0.0f);
                        vw8Var.Q6 = z13;
                        if (z13 > 0.001f) {
                            float B = yjb.B(z13, 2.0f, f12, z13 * z13);
                            if (vw8Var.z3) {
                                vw8Var.x3 = gl.R1(vw8Var.x3, vw8Var.P6, B);
                                vw8Var.F3 = gl.R1(vw8Var.F3, 1.0f, B);
                            } else {
                                vw8Var.x3 = vw8Var.P6;
                                vw8Var.F3 = B;
                            }
                            vw8Var.z3 = true;
                            if (vw8Var.Q6 >= 0.999f) {
                                vw8Var.G3 = vw8Var.w3;
                            }
                        }
                        f27 = 0.0f;
                    }
                    if (vw8Var.z3 && vw8Var.G.a != 0) {
                        f28 = fArr3[46] / f25;
                        if (f28 > f27 && i3 > 0 && i2 > 0) {
                            float L2 = gl.L(f26);
                            float f68 = i3;
                            ceil = ((int) Math.ceil(f68 / L2)) + 1;
                            float f69 = i2;
                            ceil2 = ((int) Math.ceil(f69 / L2)) + 1;
                            bitmap = vw8Var.A3;
                            if (bitmap != null || bitmap.getWidth() != ceil || vw8Var.A3.getHeight() != ceil2) {
                                vw8Var.A3 = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
                                vw8Var.B3 = new int[ceil * ceil2];
                            }
                            float max8 = Math.max(1.0f, fArr3[45]);
                            float f70 = fArr3[47] / f25;
                            float f71 = f28 * 0.0275f;
                            float L3 = gl.L(130.0f);
                            float f72 = vw8Var.w3 * 0.12f;
                            i5 = 0;
                            z5 = false;
                            while (i5 < ceil2) {
                                float f73 = f71;
                                int i13 = 0;
                                while (true) {
                                    f29 = f72;
                                    if (i13 < ceil) {
                                        float f74 = i13 * L2;
                                        int i14 = i13;
                                        float f75 = i5 * L2;
                                        vw8Var.c1(f74, f75, i3, i2);
                                        float f76 = vw8Var.o4 / max8;
                                        if (f76 >= 3.5f || f76 <= -3.5f) {
                                            f30 = 0.0f;
                                        } else {
                                            float exp2 = ((float) Math.exp((-0.5f) * f76 * f76)) * vw8Var.p4;
                                            if (f70 > 0.0f) {
                                                float y2 = b00.y(f75 - (f69 / 2.0f), vw8Var.I3, (f74 - (f68 / 2.0f)) * (-vw8Var.J3), L3);
                                                exp2 = ((((((u1(((y2 * 2.3f) - (1.7f * f29)) + 11.3f) * f24) + (u1(y2 + f29) * 0.65f)) * 2.0f) - 1.0f) * f70) + 1.0f) * exp2;
                                            }
                                            f30 = exp2;
                                        }
                                        int max9 = Math.max(0, Math.min(kk7.d4, Math.round(255.0f * f73 * f30)));
                                        if (max9 > 0) {
                                            z5 = true;
                                        }
                                        vw8Var.B3[(i5 * ceil) + i14] = (max9 << 24) | 16777215;
                                        i13 = i14 + 1;
                                        i3 = i;
                                        f72 = f29;
                                    }
                                }
                                i5++;
                                i3 = i;
                                f71 = f73;
                                f72 = f29;
                            }
                            z = false;
                            if (z5) {
                                vw8Var.A3.setPixels(vw8Var.B3, 0, ceil, 0, 0, ceil, ceil2);
                                float f77 = (-L2) / 2.0f;
                                float f78 = L2 / 2.0f;
                                float f79 = (ceil * L2) - f78;
                                float f80 = (ceil2 * L2) - f78;
                                RectF rectF = vw8Var.D3;
                                rectF.set(f77, f77, f79, f80);
                                canvas2.drawBitmap(vw8Var.A3, (Rect) null, rectF, vw8Var.C3);
                            }
                            float f81 = (j - vw8Var.I) / 1000.0f;
                            sw8Var = vw8Var.H;
                            if (sw8Var != null) {
                                if (f81 < (vw8Var.G.h ? 0.6f : 0.3f) + 0.135f + 0.315f) {
                                    z2 = true;
                                    if (!z2 || sw8Var == null) {
                                        sw8Var2 = sw8Var;
                                    } else {
                                        vw8Var.P0(sw8Var);
                                        vw8Var.H = null;
                                        sw8Var2 = null;
                                    }
                                    if (z2) {
                                        i4 = i;
                                        z3 = true;
                                    } else {
                                        z3 = true;
                                        if (sw8Var2.a == 1) {
                                            sw8 sw8Var4 = vw8Var.G;
                                            if (sw8Var4.a == 1) {
                                                vw8Var.E(canvas2, i, i2, sw8Var2, sw8Var4, f81, false, false);
                                                if (z6 || !vw8Var.i3) {
                                                    return;
                                                }
                                                vw8Var.y(canvas2, vw8Var.a3);
                                                return;
                                            }
                                        }
                                        i4 = i;
                                    }
                                    if (z2) {
                                        z4 = z;
                                    } else {
                                        sw8 sw8Var5 = vw8Var.G;
                                        if (sw8Var5.h) {
                                            if (vw8Var.s >= 1.0f || vw8Var.r == null) {
                                                vw8Var.P0(sw8Var2);
                                                vw8Var.H = null;
                                                canvas2 = canvas;
                                                vw8Var.F(canvas2, i, i2, vw8Var.G, false, true, 100.0f);
                                                vw8Var = this;
                                            } else {
                                                float f82 = vw8Var.x;
                                                double max10 = Math.max(f82, i4 - f82);
                                                float f83 = vw8Var.y;
                                                float x12 = x1(vw8Var.s) * (((float) Math.hypot(max10, Math.max(f83, i2 - f83))) + gl.L(60.0f));
                                                Path path = vw8Var.R3;
                                                path.rewind();
                                                path.addCircle(vw8Var.x, vw8Var.y, x12, Path.Direction.CW);
                                                canvas2.save();
                                                yz.d(canvas2, path);
                                                boolean z14 = z;
                                                vw8Var.F(canvas2, i4, i2, vw8Var.H, true, vw8Var.G.a == 0 ? z3 : z, -1.0f);
                                                canvas2.restore();
                                                canvas2.save();
                                                canvas2.clipPath(path);
                                                vw8Var.F(canvas2, i, i2, vw8Var.G, false, vw8Var.H.a == 0 ? z3 : z14, 100.0f);
                                                canvas.restore();
                                                canvas2 = canvas;
                                            }
                                            if (z6) {
                                                return;
                                            } else {
                                                return;
                                            }
                                        }
                                        z4 = z;
                                        vw8Var = this;
                                        vw8Var.F(canvas, i, i2, sw8Var2, true, sw8Var5.a == 0 ? z3 : z4, f81);
                                        f81 = f81;
                                    }
                                    canvas2 = canvas;
                                    vw8Var.F(canvas2, i, i2, vw8Var.G, false, (z2 || vw8Var.H.a == 0) ? z3 : z4, !z2 ? f81 : f25);
                                    if (z6) {
                                    }
                                }
                            }
                            z2 = z;
                            if (z2) {
                            }
                            sw8Var2 = sw8Var;
                            if (z2) {
                            }
                            if (z2) {
                            }
                            canvas2 = canvas;
                            vw8Var.F(canvas2, i, i2, vw8Var.G, false, (z2 || vw8Var.H.a == 0) ? z3 : z4, !z2 ? f81 : f25);
                            if (z6) {
                            }
                        }
                    }
                    z = false;
                    float f812 = (j - vw8Var.I) / 1000.0f;
                    sw8Var = vw8Var.H;
                    if (sw8Var != null) {
                    }
                    z2 = z;
                    if (z2) {
                    }
                    sw8Var2 = sw8Var;
                    if (z2) {
                    }
                    if (z2) {
                    }
                    canvas2 = canvas;
                    vw8Var.F(canvas2, i, i2, vw8Var.G, false, (z2 || vw8Var.H.a == 0) ? z3 : z4, !z2 ? f812 : f25);
                    if (z6) {
                    }
                }
            }
            j = currentAnimationTimeMillis;
            f14 = f4;
            f15 = f;
            if (vw8Var.U) {
            }
            if (vw8Var.V) {
            }
            fArr = lcd.b;
            f16 = fArr[27] / 100.0f;
            while (true) {
                f17 = vw8Var.w3;
                f18 = vw8Var.G3;
                f19 = vw8Var.H3;
                f20 = f18 + f19;
                f21 = 1.5f;
                if (f17 < f20) {
                }
                vw8Var.H3 = Math.max(f63, (vw8Var.f1.nextFloat() * 0.8f * f16) + (f64 * f21));
                double radians2 = Math.toRadians(((r7.nextFloat() - 0.5f) * 12.0f * f16) + fArr[24]);
                vw8Var.I3 = (float) Math.cos(radians2);
                vw8Var.J3 = (float) Math.sin(radians2);
            }
            if (!vw8Var.E3) {
            }
            f22 = fArr[25];
            if (f17 >= f18 + f22) {
                vw8Var.H3 = fArr[26];
            }
            float f652 = (f17 - f18) / f22;
            vw8Var.z3 = vw8Var.Q4 < 1.0f && f652 >= 0.0f && f652 < 1.0f;
            vw8Var.y3 = gl.N(fArr[23]);
            if (vw8Var.z3) {
            }
            long nanoTime2 = System.nanoTime();
            if (vw8Var.U6 == 0) {
            }
            vw8Var.U6 = nanoTime2;
            if (fArr2[15] >= 0.5f) {
            }
            f24 = f23;
            f25 = 100.0f;
            fArr3 = fArr2;
            f26 = 12.0f;
            f27 = 0.0f;
            vw8Var.Q6 = 0.0f;
            if (vw8Var.z3) {
                f28 = fArr3[46] / f25;
                if (f28 > f27) {
                    float L22 = gl.L(f26);
                    float f682 = i3;
                    ceil = ((int) Math.ceil(f682 / L22)) + 1;
                    float f692 = i2;
                    ceil2 = ((int) Math.ceil(f692 / L22)) + 1;
                    bitmap = vw8Var.A3;
                    if (bitmap != null) {
                    }
                    vw8Var.A3 = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
                    vw8Var.B3 = new int[ceil * ceil2];
                    float max82 = Math.max(1.0f, fArr3[45]);
                    float f702 = fArr3[47] / f25;
                    float f712 = f28 * 0.0275f;
                    float L32 = gl.L(130.0f);
                    float f722 = vw8Var.w3 * 0.12f;
                    i5 = 0;
                    z5 = false;
                    while (i5 < ceil2) {
                    }
                    z = false;
                    if (z5) {
                    }
                    float f8122 = (j - vw8Var.I) / 1000.0f;
                    sw8Var = vw8Var.H;
                    if (sw8Var != null) {
                    }
                    z2 = z;
                    if (z2) {
                    }
                    sw8Var2 = sw8Var;
                    if (z2) {
                    }
                    if (z2) {
                    }
                    canvas2 = canvas;
                    vw8Var.F(canvas2, i, i2, vw8Var.G, false, (z2 || vw8Var.H.a == 0) ? z3 : z4, !z2 ? f8122 : f25);
                    if (z6) {
                    }
                }
            }
            z = false;
            float f81222 = (j - vw8Var.I) / 1000.0f;
            sw8Var = vw8Var.H;
            if (sw8Var != null) {
            }
            z2 = z;
            if (z2) {
            }
            sw8Var2 = sw8Var;
            if (z2) {
            }
            if (z2) {
            }
            canvas2 = canvas;
            vw8Var.F(canvas2, i, i2, vw8Var.G, false, (z2 || vw8Var.H.a == 0) ? z3 : z4, !z2 ? f81222 : f25);
            if (z6) {
            }
        }
        f8 = f4;
        float f402 = vw8Var.O3;
        if (f8 >= f402) {
        }
        if (max4 <= f4) {
        }
        float f432 = f10 * f402;
        float f442 = vw8Var.N3 + f432;
        vw8Var.N3 = f442;
        float f452 = vw8Var.w3;
        if (vw8Var.N >= f4) {
        }
        f12 = f3;
        f13 = 0.016f;
        float f472 = vw8Var.N;
        if (f472 < f4) {
        }
        vw8Var.N = f452;
        if (min > f4) {
        }
        j = currentAnimationTimeMillis;
        f14 = f4;
        f15 = f;
        if (vw8Var.U) {
        }
        if (vw8Var.V) {
        }
        fArr = lcd.b;
        f16 = fArr[27] / 100.0f;
        while (true) {
            f17 = vw8Var.w3;
            f18 = vw8Var.G3;
            f19 = vw8Var.H3;
            f20 = f18 + f19;
            f21 = 1.5f;
            if (f17 < f20) {
            }
            vw8Var.H3 = Math.max(f63, (vw8Var.f1.nextFloat() * 0.8f * f16) + (f64 * f21));
            double radians22 = Math.toRadians(((r7.nextFloat() - 0.5f) * 12.0f * f16) + fArr[24]);
            vw8Var.I3 = (float) Math.cos(radians22);
            vw8Var.J3 = (float) Math.sin(radians22);
        }
        if (!vw8Var.E3) {
        }
        f22 = fArr[25];
        if (f17 >= f18 + f22) {
        }
        float f6522 = (f17 - f18) / f22;
        vw8Var.z3 = vw8Var.Q4 < 1.0f && f6522 >= 0.0f && f6522 < 1.0f;
        vw8Var.y3 = gl.N(fArr[23]);
        if (vw8Var.z3) {
        }
        long nanoTime22 = System.nanoTime();
        if (vw8Var.U6 == 0) {
        }
        vw8Var.U6 = nanoTime22;
        if (fArr2[15] >= 0.5f) {
        }
        f24 = f23;
        f25 = 100.0f;
        fArr3 = fArr2;
        f26 = 12.0f;
        f27 = 0.0f;
        vw8Var.Q6 = 0.0f;
        if (vw8Var.z3) {
        }
        z = false;
        float f812222 = (j - vw8Var.I) / 1000.0f;
        sw8Var = vw8Var.H;
        if (sw8Var != null) {
        }
        z2 = z;
        if (z2) {
        }
        sw8Var2 = sw8Var;
        if (z2) {
        }
        if (z2) {
        }
        canvas2 = canvas;
        vw8Var.F(canvas2, i, i2, vw8Var.G, false, (z2 || vw8Var.H.a == 0) ? z3 : z4, !z2 ? f812222 : f25);
        if (z6) {
        }
    }

    public final float z0() {
        float f;
        int f0;
        int L;
        int L2;
        float f2;
        float width = (getWidth() - (gl.L(10.0f) << 1)) - gl.L(8.0f);
        int i = this.i1;
        if (i != 0) {
            if (i == 1) {
                f = width / 6.0f;
                f2 = 0.0f;
            } else if (h0()) {
                f = 0.0f;
                f2 = 0.0f;
            } else {
                f = width / 3.0f;
                f0 = ((f0() + this.w1.size()) - 1) / f0();
                L = gl.L(4.0f) - gl.L(32.0f);
                L2 = gl.L(4.0f);
            }
            f0 = 0;
            return Math.max(0.0f, (((f0 * f) + f2) + gl.L(32.0f)) - b1());
        }
        f = width / 6.0f;
        f0 = (ld0.b.length + 5) / 6;
        L = gl.L(4.0f) - gl.L(32.0f);
        L2 = gl.L(4.0f);
        f2 = L2 + L;
        return Math.max(0.0f, (((f0 * f) + f2) + gl.L(32.0f)) - b1());
    }
}
