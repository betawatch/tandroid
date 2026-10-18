package zh;

import ai.m1;
import ai.y9;
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
import ci.g3;
import com.google.android.gms.internal.play_billing.k3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.kk;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Cells.v6;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.az0;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.dx0;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.q10;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class t0 extends View {
    public static int[] E9;
    public static int[] F9;
    public static int[] G9;
    public static String J9;
    public static e K9;
    public static volatile byte[] O9;
    public static int P9;
    public static int Q9;
    public static int R9;
    public static final bs S9;
    public boolean A0;
    public final Paint A1;
    public boolean A2;
    public int[] A3;
    public final float A4;
    public final float[] A5;
    public boolean A6;
    public final RectF A7;
    public long A8;
    public final float[] A9;
    public float B0;
    public final Paint B1;
    public float B2;
    public final Paint B3;
    public final Paint B4;
    public final boolean[] B5;
    public boolean B6;
    public final LinearGradient B7;
    public long B8;
    public final Rect[] B9;
    public float C0;
    public final TextPaint C1;
    public float C2;
    public final RectF C3;
    public final Paint C4;
    public int C5;
    public int C6;
    public final Paint C7;
    public float C8;
    public float D0;
    public final TextPaint D1;
    public float D2;
    public boolean D3;
    public final RectF D4;
    public final LinearGradient D5;
    public final SweepGradient[] D6;
    public final Matrix D7;
    public float D8;
    public final Matrix E;
    public long E0;
    public final Path E1;
    public long E2;
    public float E3;
    public final float[] E4;
    public final Paint E5;
    public float E6;
    public final RectF[] E7;
    public float E8;
    public q0 F;
    public boolean F0;
    public final RectF F1;
    public long F2;
    public float F3;
    public final float[] F4;
    public final Path F5;
    public float F6;
    public float F7;
    public float F8;
    public q0 G;
    public float G0;
    public Object G1;
    public boolean G2;
    public float G3;
    public final float[] G4;
    public final TextPaint G5;
    public float G6;
    public float G7;
    public float G8;
    public long H;
    public final TextPaint H0;
    public Object H1;
    public long H2;
    public float H3;
    public final float[] H4;
    public Drawable H5;
    public float H6;
    public boolean H7;
    public float H8;
    public final ArrayList I;
    public String I0;
    public int I1;
    public float I2;
    public float I3;
    public final float[] I4;
    public StaticLayout I5;
    public float I6;
    public int I7;
    public float I8;
    public final HashMap J;
    public String J0;
    public final Drawable J1;
    public float J2;
    public float J3;
    public final long[] J4;
    public int J5;
    public float J6;
    public final RectF J7;
    public final Path J8;
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
    public final p6 L0;
    public final Drawable L1;
    public long L2;
    public final p0 L3;
    public float L4;
    public final RectF L5;
    public float L6;
    public final HashMap L7;
    public final RectF L8;
    public float M;
    public final float[] M0;
    public final Drawable M1;
    public long M2;
    public float M3;
    public float M4;
    public final Path M5;
    public boolean M6;
    public int M7;
    public final RectF M8;
    public float N;
    public final float[] N0;
    public final Drawable N1;
    public String N2;
    public float N3;
    public final Paint N4;
    public final float[] N5;
    public long N6;
    public int N7;
    public long N8;
    public float O;
    public final float[] O0;
    public final Drawable O1;
    public float O2;
    public float O3;
    public final Paint O4;
    public float O5;
    public SensorManager O6;
    public float O7;
    public boolean O8;
    public float P;
    public final float[] P0;
    public final Drawable P1;
    public long P2;
    public float P3;
    public final Paint P4;
    public final Matrix P5;
    public final o0 P6;
    public float P7;
    public Bitmap P8;
    public float Q;
    public final float[] Q0;
    public final Drawable Q1;
    public Bitmap Q2;
    public float Q3;
    public final RectF Q4;
    public final Matrix Q5;
    public float Q6;
    public int Q7;
    public Bitmap Q8;
    public boolean R;
    public final float[] R0;
    public final Drawable R1;
    public final Paint R2;
    public final Path R3;
    public float R4;
    public final LinearGradient R5;
    public float R6;
    public int R7;
    public final Paint R8;
    public boolean S;
    public final float[] S0;
    public final Drawable S1;
    public boolean S2;
    public Bitmap S3;
    public float S4;
    public final LongSparseArray S5;
    public float S6;
    public long S7;
    public final Paint S8;
    public boolean T;
    public final float[] T0;
    public final org.telegram.ui.p0 T1;
    public int T2;
    public Bitmap T3;
    public boolean T4;
    public final Path T5;
    public float T6;
    public long T7;
    public final RectF T8;
    public boolean U;
    public final float[] U0;
    public final Paint U1;
    public boolean U2;
    public float U3;
    public boolean U4;
    public boolean U5;
    public long U6;
    public long U7;
    public int U8;
    public long V;
    public final float[] V0;
    public final String V1;
    public long V2;
    public float V3;
    public float V4;
    public final RectF V5;
    public long V6;
    public final float V7;
    public String V8;
    public long W;
    public final float[] W0;
    public final g2 W1;
    public float W2;
    public float W3;
    public boolean W4;
    public final RectF W5;
    public boolean W6;
    public int W7;
    public boolean W8;
    public final float[] X0;
    public final uj0 X1;
    public Bitmap X2;
    public final Paint X3;
    public Bitmap X4;
    public final RectF X5;
    public final Matrix X6;
    public long X7;
    public int X8;
    public final float[] Y0;
    public final Paint Y1;
    public Bitmap Y2;
    public final int[] Y3;
    public int[] Y4;
    public final LinearGradient Y5;
    public final Path Y6;
    public long Y7;
    public long Y8;
    public final float[] Z0;
    public int Z1;
    public BitmapShader Z2;
    public final int[] Z3;
    public int Z4;
    public final LinearGradient Z5;
    public final RectF Z6;
    public float Z7;
    public uj0 Z8;
    public boolean a;
    public float a0;
    public final byte[] a1;
    public int a2;
    public final Paint a3;
    public final float[] a4;
    public final Paint a5;
    public final Matrix a6;
    public final Path a7;
    public final RectF a8;
    public uj0 a9;
    public final int b;
    public float b0;
    public final boolean[] b1;
    public final HashMap b2;
    public final Paint b3;
    public final float[] b4;
    public final Rect b5;
    public final Paint b6;
    public final Path b7;
    public final TextPaint b8;
    public uj0 b9;
    public final u3.c c;
    public float c0;
    public int c1;
    public Runnable c2;
    public final Matrix c3;
    public final float[] c4;
    public final RectF c5;
    public float c6;
    public int c7;
    public final TextPaint c8;
    public Object c9;
    public String d;
    public float d0;
    public boolean d1;
    public boolean d2;
    public final RectF d3;
    public final float[] d4;
    public final int[] d5;
    public long d6;
    public final RectF d7;
    public final TextPaint d8;
    public float d9;
    public String e;
    public float e0;
    public final Random e1;
    public boolean e2;
    public float e3;
    public int e4;
    public final float[] e5;
    public long e6;
    public final Matrix e7;
    public TextPaint e8;
    public String e9;
    public String f;
    public float f0;
    public float f1;
    public Bitmap f2;
    public boolean f3;
    public float[] f4;
    public final float[] f5;
    public boolean f6;
    public final SparseArray f7;
    public final TextPaint f8;
    public long f9;
    public float g0;
    public float g1;
    public final int[] g2;
    public boolean g3;
    public float[] g4;
    public final float[] g5;
    public boolean g6;
    public final Drawable[] g7;
    public StaticLayout g8;
    public float g9;
    public boolean h;
    public float h0;
    public int h1;
    public y9 h2;
    public int h3;
    public float[] h4;
    public final float[] h5;
    public int h6;
    public final RectF h7;
    public int h8;
    public boolean h9;
    public float i0;
    public float i1;
    public final l0 i2;
    public final float[] i3;
    public int i4;
    public final float[] i5;
    public int i6;
    public final RectF i7;
    public boolean i8;
    public float i9;
    public float j0;
    public float j1;
    public final m0 j2;
    public final float[] j3;
    public int j4;
    public final boolean[] j5;
    public int j6;
    public final RectF j7;
    public final String j8;
    public float j9;
    public VelocityTracker k0;
    public float k1;
    public boolean k2;
    public final int[] k3;
    public PorterDuffColorFilter k4;
    public int k5;
    public float k6;
    public final RectF k7;
    public final String k8;
    public float k9;
    public float l0;
    public float l1;
    public long l2;
    public final int[] l3;
    public int l4;
    public float l5;
    public float l6;
    public final RectF l7;
    public r5 l8;
    public final OverScroller l9;
    public float m0;
    public String m1;
    public long m2;
    public final float[] m3;
    public float m4;
    public float m5;
    public float m6;
    public boolean m7;
    public uj0 m8;
    public final ViewConfiguration m9;
    public r0 n;
    public float n0;
    public int n1;
    public long n2;
    public final float[] n3;
    public float n4;
    public StaticLayout n5;
    public float n6;
    public boolean n7;
    public long n8;
    public VelocityTracker n9;
    public float o0;
    public String o1;
    public float o2;
    public float o3;
    public float o4;
    public boolean o5;
    public final float[] o6;
    public float o7;
    public boolean o8;
    public boolean o9;
    public float p0;
    public String p1;
    public long p2;
    public final double[] p3;
    public float p4;
    public final float[] p5;
    public final Paint p6;
    public float p7;
    public TLRPC.TL_inputStickerSetShortName p8;
    public boolean p9;
    public int q0;
    public final RectF q1;
    public final RectF q2;
    public final double[] q3;
    public float q4;
    public final float[] q5;
    public float q6;
    public long q7;
    public TLRPC.Document q8;
    public final m0 q9;
    public r0 r;
    public long r0;
    public boolean r1;
    public boolean r2;
    public final double[] r3;
    public float r4;
    public final float[] r5;
    public boolean r6;
    public boolean r7;
    public long r8;
    public final RippleDrawable[] r9;
    public float s;
    public final f s0;
    public float s1;
    public float s2;
    public final ArrayList s3;
    public final long[] s4;
    public final float[] s5;
    public float s6;
    public float s7;
    public LinearGradient[] s8;
    public int s9;
    public e t0;
    public float t1;
    public String t2;
    public int t3;
    public final float[] t4;
    public final float[] t5;
    public boolean t6;
    public float t7;
    public int[] t8;
    public final Paint t9;
    public e u0;
    public long u1;
    public String u2;
    public int u3;
    public final float[] u4;
    public final float[] u5;
    public Object u6;
    public long u7;
    public final q10 u8;
    public final Path u9;
    public long v;
    public boolean v0;
    public final ArrayList v1;
    public String v2;
    public float v3;
    public final float[] v4;
    public final float[] v5;
    public float v6;
    public final RectF v7;
    public int v8;
    public final float[] v9;
    public float w;
    public boolean w0;
    public long w1;
    public String w2;
    public float w3;
    public final float[] w4;
    public final float[] w5;
    public int w6;
    public long w7;
    public int w8;
    public final float[] w9;
    public float x;
    public boolean x0;
    public boolean x1;
    public final TextPaint x2;
    public float x3;
    public final long[] x4;
    public final float[] x5;
    public int x6;
    public float x7;
    public float x8;
    public final long[] x9;
    public final long y;
    public boolean y0;
    public final HashMap y1;
    public String y2;
    public boolean y3;
    public final boolean[] y4;
    public final float[] y5;
    public final SparseIntArray y6;
    public float y7;
    public float y8;
    public final long[] y9;
    public long z0;
    public final Paint z1;
    public int z2;
    public Bitmap z3;
    public final Paint z4;
    public final float[] z5;
    public int z6;
    public float z7;
    public final RectF[] z8;
    public final float[] z9;
    public static final String[] C9 = {"❤️", "🔥", "🎉", "😎", "🚀", "💎", "💙", "✨", "⭐", "🍀", "🐸", "🦄", "🌈", "🍕", "👻", "🍒", "🌸", "⚡", "🏆", "🎁", "👀", "😍", "🥳", "🤩", "🐱", "🐶", "🦋", "🌙", "☀️", "🍓", "🍩", "🎈", "🎮", "🎧", "💜", "🌊"};
    public static final float D9 = (float) Math.atan2(-5.5d, -3.5d);
    public static int H9 = a.b("Black");
    public static int I9 = a.b("Neon Blue");
    public static final float L9 = (float) Math.sin(Math.toRadians(18.0d));
    public static final float M9 = (float) Math.cos(Math.toRadians(18.0d));
    public static final PorterDuffColorFilter[] N9 = new PorterDuffColorFilter[9];

    static {
        for (int i10 = 0; i10 <= 8; i10++) {
            N9[i10] = new PorterDuffColorFilter((((int) ((i10 * 140.25f) / 8.0f)) << 24) | 16777215, PorterDuff.Mode.SRC_ATOP);
        }
        S9 = new bs(0.16d, 1.0d, 0.3d, 1.0d);
    }

    /* JADX WARN: Type inference failed for: r12v17, types: [zh.l0] */
    /* JADX WARN: Type inference failed for: r12v18, types: [zh.m0] */
    /* JADX WARN: Type inference failed for: r3v26, types: [zh.m0] */
    public t0(Context context, int i10, String str, String str2, boolean z10, u3.c cVar) {
        super(context);
        boolean z11;
        e eVar;
        final int i11 = 1;
        this.a = true;
        this.s = 1.0f;
        this.y = AnimationUtils.currentAnimationTimeMillis();
        this.E = new Matrix();
        this.F = new q0();
        this.I = new ArrayList();
        this.J = new HashMap();
        Paint paint = new Paint(3);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        paint.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.M = -1.0f;
        this.s0 = new f();
        this.w0 = true;
        this.x0 = true;
        this.D0 = 0.0f;
        this.G0 = 1.0f;
        this.H0 = new TextPaint(1);
        this.I0 = "";
        this.J0 = "";
        this.M0 = new float[320];
        this.N0 = new float[320];
        this.O0 = new float[320];
        this.P0 = new float[320];
        this.Q0 = new float[320];
        this.R0 = new float[320];
        this.S0 = new float[320];
        this.T0 = new float[320];
        this.U0 = new float[320];
        this.V0 = new float[320];
        this.W0 = new float[320];
        this.X0 = new float[320];
        this.Y0 = new float[320];
        this.Z0 = new float[320];
        this.a1 = new byte[320];
        this.b1 = new boolean[320];
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
        this.V1 = LocaleController.getString(R.string.QrScanQr);
        this.Y1 = new Paint(1);
        this.Z1 = 1;
        this.b2 = new HashMap();
        this.g2 = new int[3];
        this.i2 = new NotificationCenter.NotificationCenterDelegate() { // from class: zh.l0
            @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
            public final void didReceivedNotification(int i13, int i14, Object[] objArr) {
                t0 t0Var = t0.this;
                t0Var.getClass();
                if (objArr.length <= 1 || objArr[1] != t0Var.h2) {
                    return;
                }
                t0Var.y0();
            }
        };
        this.j2 = new Runnable(this) { // from class: zh.m0
            public final /* synthetic */ t0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TLRPC.Document document;
                int lastIndexOf;
                int dp;
                switch (i12) {
                    case 0:
                        t0 t0Var = this.b;
                        ArrayList arrayList = t0Var.v1;
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
                                    t0Var.g0(tL_starGiftUnique.id, document);
                                }
                            }
                            t0Var.l1(tL_starGiftUnique);
                        }
                        break;
                    default:
                        t0 t0Var2 = this.b;
                        ArrayList arrayList3 = t0Var2.I;
                        if (t0Var2.f1 >= 0.5f && t0Var2.h1 == 1 && !t0Var2.p9) {
                            float f7 = t0Var2.i9;
                            float f10 = t0Var2.j9;
                            float width = (t0Var2.getWidth() - AndroidUtilities.dp(28.0f)) / 6.0f;
                            float f11 = t0Var2.j1 + f10;
                            RectF rectF = t0Var2.v7;
                            float dp2 = f11 - (rectF.top + AndroidUtilities.dp(16.0f));
                            int i15 = -1;
                            if (dp2 >= 0.0f && f7 >= AndroidUtilities.dp(14.0f) && f10 >= rectF.top + AndroidUtilities.dp(8.0f) && (dp = (((int) (dp2 / width)) * 6) + ((int) ((f7 - AndroidUtilities.dp(14.0f)) / width))) >= 0 && dp < 36) {
                                i15 = dp;
                            }
                            if (i15 >= 0) {
                                String[] strArr = t0.C9;
                                if (arrayList3.contains(strArr[i15]) && (lastIndexOf = arrayList3.lastIndexOf(strArr[i15])) >= 0) {
                                    arrayList3.remove(lastIndexOf);
                                    t0Var2.c();
                                    t0Var2.i0();
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        };
        this.o2 = 1.0f;
        this.q2 = new RectF();
        TextPaint textPaint = new TextPaint(1);
        this.x2 = textPaint;
        textPaint.setTypeface(AndroidUtilities.bold());
        this.z2 = -1;
        this.D2 = -1.0f;
        this.K2 = -1.0f;
        this.M2 = -1L;
        this.N2 = "";
        this.O2 = -1.0f;
        this.R2 = new Paint(3);
        this.W2 = 1.0f;
        this.a3 = new Paint(2);
        this.b3 = new Paint(3);
        this.c3 = new Matrix();
        this.d3 = new RectF();
        this.i3 = new float[14];
        this.j3 = new float[14];
        this.k3 = new int[7];
        this.l3 = new int[7];
        this.m3 = new float[15];
        this.n3 = new float[15];
        this.p3 = new double[3];
        this.q3 = new double[3];
        this.r3 = new double[3];
        this.s3 = new ArrayList();
        this.t3 = AndroidUtilities.statusBarHeight;
        this.u3 = AndroidUtilities.navigationBarHeight;
        this.B3 = new Paint(2);
        this.C3 = new RectF();
        this.G3 = 5.0f;
        this.H3 = -0.7071f;
        this.I3 = 0.7071f;
        this.L3 = new p0();
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
        this.O4 = new Paint(2);
        Paint paint4 = new Paint(2);
        this.P4 = paint4;
        paint4.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.Q4 = new RectF();
        this.R4 = 1.0f;
        this.S4 = 1.0f;
        this.U4 = true;
        this.V4 = 1.0f;
        this.a5 = new Paint(2);
        this.b5 = new Rect();
        this.c5 = new RectF();
        this.d5 = new int[4];
        this.e5 = new float[4];
        this.f5 = new float[4];
        this.g5 = new float[240];
        this.h5 = new float[240];
        this.i5 = new float[240];
        this.j5 = new boolean[240];
        this.p5 = new float[240];
        this.q5 = new float[240];
        this.r5 = new float[240];
        this.s5 = new float[240];
        this.t5 = new float[240];
        this.u5 = new float[240];
        this.v5 = new float[240];
        this.w5 = new float[240];
        this.x5 = new float[240];
        this.y5 = new float[240];
        this.z5 = new float[240];
        this.A5 = new float[240];
        this.B5 = new boolean[240];
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -16777216, 0, tileMode);
        this.D5 = linearGradient;
        Paint paint5 = new Paint(1);
        this.E5 = paint5;
        paint5.setShader(linearGradient);
        paint5.setXfermode(new PorterDuffXfermode(mode2));
        this.F5 = new Path();
        this.G5 = new TextPaint(65);
        this.K5 = new RectF();
        this.L5 = new RectF();
        this.M5 = new Path();
        this.N5 = new float[7];
        this.P5 = new Matrix();
        this.Q5 = new Matrix();
        this.R5 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{16777215, -1, 16777215}, new float[]{0.0f, 0.88f, 1.0f}, tileMode);
        this.S5 = new LongSparseArray();
        this.T5 = new Path();
        this.V5 = new RectF();
        this.W5 = new RectF();
        this.X5 = new RectF();
        this.Y5 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, 16777215, -1, tileMode);
        this.Z5 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -1, 16777215, tileMode);
        this.a6 = new Matrix();
        this.b6 = new Paint();
        this.m6 = 0.85f;
        this.o6 = new float[320];
        Paint paint6 = new Paint();
        this.p6 = paint6;
        PorterDuff.Mode mode3 = PorterDuff.Mode.DST_IN;
        paint6.setXfermode(new PorterDuffXfermode(mode3));
        this.q6 = 1.0f;
        this.r6 = true;
        this.v6 = -1.0f;
        this.w6 = -1;
        this.y6 = new SparseIntArray();
        this.z6 = -1;
        this.C6 = -1;
        this.D6 = new SweepGradient[4];
        this.P6 = new o0(this);
        this.X6 = new Matrix();
        this.Y6 = new Path();
        this.Z6 = new RectF();
        this.a7 = new Path();
        this.b7 = new Path();
        this.c7 = -1;
        this.d7 = new RectF();
        this.e7 = new Matrix();
        this.f7 = new SparseArray();
        this.h7 = new RectF();
        this.i7 = new RectF();
        this.j7 = new RectF();
        this.k7 = new RectF();
        this.l7 = new RectF();
        this.o7 = 1.0f;
        this.p7 = 1.0f;
        this.s7 = 1.0f;
        this.t7 = 1.0f;
        this.v7 = new RectF();
        this.A7 = new RectF();
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{0, 805306368, -1627389952, -285212672, -16777216}, new float[]{0.0f, 0.25f, 0.5f, 0.75f, 1.0f}, tileMode);
        this.B7 = linearGradient2;
        Paint paint7 = new Paint();
        this.C7 = paint7;
        paint7.setXfermode(new PorterDuffXfermode(mode3));
        paint7.setShader(linearGradient2);
        this.D7 = new Matrix();
        this.E7 = new RectF[]{new RectF(), new RectF(), new RectF(), new RectF(), new RectF(), new RectF()};
        this.F7 = -1.0f;
        this.G7 = -1.0f;
        this.J7 = new RectF();
        this.K7 = new HashMap();
        this.L7 = new HashMap();
        this.M7 = -1;
        this.N7 = H9;
        this.Q7 = -1;
        this.R7 = -1;
        this.V7 = AndroidUtilities.dp(20.17f);
        this.W7 = -1;
        this.Y7 = -1L;
        this.Z7 = 1.0f;
        this.a8 = new RectF();
        this.b8 = new TextPaint(1);
        this.c8 = new TextPaint(1);
        this.d8 = new TextPaint(1);
        TextPaint textPaint2 = new TextPaint(129);
        this.f8 = textPaint2;
        textPaint2.setXfermode(new PorterDuffXfermode(mode2));
        this.j8 = LocaleController.getString(R.string.QrNoGiftsTitle);
        this.k8 = LocaleController.getString(R.string.QrBrowseGifts);
        int[] iArr = a.b;
        this.s8 = new LinearGradient[iArr.length];
        this.t8 = new int[iArr.length];
        this.u8 = new q10(2);
        this.v8 = -100;
        this.w8 = -100;
        this.z8 = new RectF[]{new RectF(), new RectF(), new RectF()};
        this.J8 = new Path();
        this.K8 = new RectF();
        this.L8 = new RectF();
        this.M8 = new RectF();
        this.R8 = new Paint(3);
        this.S8 = new Paint(1);
        this.T8 = new RectF();
        this.d9 = -1.0f;
        this.l9 = new OverScroller(getContext());
        this.m9 = ViewConfiguration.get(getContext());
        this.q9 = new Runnable(this) { // from class: zh.m0
            public final /* synthetic */ t0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TLRPC.Document document;
                int lastIndexOf;
                int dp;
                switch (i11) {
                    case 0:
                        t0 t0Var = this.b;
                        ArrayList arrayList = t0Var.v1;
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
                                    t0Var.g0(tL_starGiftUnique.id, document);
                                }
                            }
                            t0Var.l1(tL_starGiftUnique);
                        }
                        break;
                    default:
                        t0 t0Var2 = this.b;
                        ArrayList arrayList3 = t0Var2.I;
                        if (t0Var2.f1 >= 0.5f && t0Var2.h1 == 1 && !t0Var2.p9) {
                            float f7 = t0Var2.i9;
                            float f10 = t0Var2.j9;
                            float width = (t0Var2.getWidth() - AndroidUtilities.dp(28.0f)) / 6.0f;
                            float f11 = t0Var2.j1 + f10;
                            RectF rectF = t0Var2.v7;
                            float dp2 = f11 - (rectF.top + AndroidUtilities.dp(16.0f));
                            int i15 = -1;
                            if (dp2 >= 0.0f && f7 >= AndroidUtilities.dp(14.0f) && f10 >= rectF.top + AndroidUtilities.dp(8.0f) && (dp = (((int) (dp2 / width)) * 6) + ((int) ((f7 - AndroidUtilities.dp(14.0f)) / width))) >= 0 && dp < 36) {
                                i15 = dp;
                            }
                            if (i15 >= 0) {
                                String[] strArr = t0.C9;
                                if (arrayList3.contains(strArr[i15]) && (lastIndexOf = arrayList3.lastIndexOf(strArr[i15])) >= 0) {
                                    arrayList3.remove(lastIndexOf);
                                    t0Var2.c();
                                    t0Var2.i0();
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        };
        this.r9 = new RippleDrawable[12];
        ColorStateList.valueOf(738197503);
        ColorStateList.valueOf(335544320);
        this.s9 = -1;
        this.t9 = new Paint(1);
        this.u9 = new Path();
        this.v9 = new float[12];
        this.w9 = new float[12];
        this.x9 = new long[12];
        this.y9 = new long[12];
        this.z9 = new float[12];
        this.A9 = new float[12];
        this.B9 = new Rect[12];
        for (int i13 = 0; i13 < 12; i13++) {
            this.B9[i13] = new Rect();
        }
        this.b = i10;
        this.d = str;
        this.f = str2;
        this.h = z10;
        this.c = cVar;
        this.L1 = w(R.drawable.msg_share);
        this.M1 = w(R.drawable.msg_download);
        this.N1 = w(R.drawable.msg_qr_scan);
        this.U1.setTypeface(AndroidUtilities.bold());
        Drawable w9 = w(R.drawable.msg_colors);
        this.O1 = w9;
        Drawable w10 = w(R.drawable.input_smile);
        this.P1 = w10;
        Drawable w11 = w(R.drawable.menu_gift);
        this.Q1 = w11;
        this.W1 = new g2(true);
        this.R1 = w(R.drawable.msg_retry);
        this.S1 = w(R.drawable.msg_recent);
        this.T1 = new org.telegram.ui.p0();
        this.J1 = w(R.drawable.msg_copy);
        this.K1 = w(R.drawable.menu_premium_main);
        this.g7 = new Drawable[]{w9, w10, w11};
        uj0 uj0Var = new uj0(R.raw.plane_logo_plain, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null);
        this.X1 = uj0Var;
        uj0Var.R(this);
        uj0Var.K(1);
        uj0Var.setCallback(this);
        uj0Var.start();
        Paint paint8 = this.Y1;
        Paint.Style style = Paint.Style.STROKE;
        paint8.setStyle(style);
        this.Y1.setStrokeCap(Paint.Cap.ROUND);
        this.Y1.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.C1.setTextSize(AndroidUtilities.dp(11.0f));
        this.D1.setTypeface(AndroidUtilities.bold());
        this.A1.setStyle(style);
        p6 p6Var = new p6(false, true, true);
        this.L0 = p6Var;
        p6Var.w(AndroidUtilities.dp(11.0f));
        p6Var.n(0.35f, 280L, bs.h);
        p6Var.setCallback(this);
        p6Var.b = 3;
        r0 t10 = t(H9);
        this.n = t10;
        this.c7 = V0(t10.c);
        if (str != null) {
            String str3 = this.d;
            if (!str3.equals(J9) || (eVar = K9) == null) {
                e b10 = f.b(AndroidUtilities.dp(240.0f), str3);
                this.t0 = b10;
                K9 = b10;
                J9 = str3;
            } else {
                this.t0 = eVar;
            }
            f fVar = this.s0;
            fVar.m = this.t0;
            fVar.n = null;
            fVar.q = 2;
            fVar.o = 0.0f;
            fVar.p = 0L;
            fVar.E = 0L;
            z11 = false;
            fVar.F = false;
        } else {
            z11 = false;
        }
        t1(z11);
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
        float h12 = h1(Color.red(i10));
        float h13 = h1(Color.green(i10));
        float h14 = h1(Color.blue(i10));
        float cbrt = (float) Math.cbrt((0.051445995f * h14) + (0.53633255f * h13) + (0.41222146f * h12));
        float cbrt2 = (float) Math.cbrt((0.10739696f * h14) + (0.6806995f * h13) + (0.2119035f * h12));
        float cbrt3 = (float) Math.cbrt((h14 * 0.6299787f) + (h13 * 0.28171885f) + (h12 * 0.08830246f));
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
        return k3.t(f10, f11, f11, ((f10 + 1.0f) * f11 * f11 * f11) + 1.0f);
    }

    public static int V0(int i10) {
        double[] dArr = new double[3];
        double[] dArr2 = new double[3];
        n1(i10, dArr);
        double hypot = Math.hypot(dArr[1], dArr[2]);
        if (hypot < 0.03d) {
            return -1;
        }
        b0(0.96d, Math.min(0.06d, hypot * 0.7d), Math.atan2(dArr[2], dArr[1]), dArr2);
        return Color.rgb((int) Math.round(r(d0(r(dArr2[0]))) * 255.0d), (int) Math.round(r(d0(r(dArr2[1]))) * 255.0d), (int) Math.round(r(d0(r(dArr2[2]))) * 255.0d));
    }

    public static int Y0(int i10) {
        double[] dArr = new double[3];
        i0.a.j(i10, dArr);
        return i0.a.o(i0.a.b(Math.min(96.0d, dArr[0] + 24.0d), dArr[1] * 0.75d, dArr[2] * 0.75d), 26);
    }

    public static int a(float f7, int i10) {
        return i0.a.o(i10, (int) (Utilities.clamp01(f7) * Color.alpha(i10)));
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

    public static int d1(int i10) {
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

    public static float e1(boolean z10, boolean z11, float f7) {
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
            return c1.v(f7, 0.18f, 1.0f, 0.0f);
        }
        return 1.0f;
    }

    public static float f1(float f7, float f10, float f11) {
        float clamp01 = Utilities.clamp01((f11 - f7) / (f10 - f7));
        return k3.B(clamp01, 2.0f, 3.0f, clamp01 * clamp01);
    }

    public static int g(float f7, int i10) {
        return (((int) (Math.max(0.0f, Math.min(1.0f, f7)) * 255.0f)) << 24) | (i10 & 16777215);
    }

    public static double g1(double d, double d10, double d11) {
        if (d <= 0.0d) {
            return 0.0d;
        }
        double d12 = 6.283185307179586d / d11;
        double d13 = 1.0d - (d10 * d10);
        double sqrt = Math.sqrt(d13) * d12;
        double d14 = sqrt * d;
        return 1.0d - (((Math.sin(d14) * (d10 / Math.sqrt(d13))) + Math.cos(d14)) * Math.exp(((-d10) * d12) * d));
    }

    public static float h(float f7) {
        float f10 = f7 - 1.0f;
        return k3.t(f10, 1.70158f, f10, (2.70158f * f10 * f10 * f10) + 1.0f);
    }

    public static float h1(int i10) {
        float f7 = i10 / 255.0f;
        return f7 <= 0.04045f ? f7 / 12.92f : (float) Math.pow((f7 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static boolean i() {
        return u.f() && LiteMode.isEnabled(256);
    }

    public static float j(float f7, float f10, long j10) {
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
            return AndroidUtilities.lerp(f7 + 1.0f, 1.0f - f10, k3.B(f11, 2.0f, 3.0f, f11 * f11));
        }
        float f12 = (currentAnimationTimeMillis - 0.6f) / 0.4f;
        return AndroidUtilities.lerp(1.0f - f10, 1.0f, k3.B(f12, 2.0f, 3.0f, f12 * f12));
    }

    public static void k() {
        if (E9 != null) {
            return;
        }
        int length = a.b.length;
        E9 = new int[length];
        F9 = new int[length];
        G9 = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            E9[i10] = x(a.b[i10], false);
            F9[i10] = x(a.c[i10], true);
            G9[i10] = v(E9[i10], F9[i10]);
        }
    }

    public static float k0(int i10, int i11, int i12) {
        int i13 = (i12 * 1442695041) + (i11 * 668265263) + (i10 * 374761393);
        int i14 = ((i13 >>> 13) ^ i13) * 1274126177;
        return ((i14 ^ (i14 >>> 16)) & 65535) / 65535.0f;
    }

    public static int k1(int i10, int i11) {
        int i12 = i10 | (-16777216);
        int i13 = i11 | (-16777216);
        if (i0.a.g(i12, i13) < 1.15d) {
            double[] dArr = new double[3];
            i0.a.j(i12, dArr);
            for (int i14 = 0; i14 < 40 && i0.a.g(i12, i13) < 1.15d; i14++) {
                double max = Math.max(0.0d, dArr[0] - 2.0d);
                dArr[0] = max;
                i12 = i0.a.b(max, dArr[1], dArr[2]);
            }
        }
        return i0.a.o(i12, 95);
    }

    public static boolean m0(RectF rectF, float f7, float f10) {
        float dp = AndroidUtilities.dp(8.0f);
        return !rectF.isEmpty() && f7 >= rectF.left - dp && f7 <= rectF.right + dp && f10 >= rectF.top - dp && f10 <= rectF.bottom + dp;
    }

    public static void n1(int i10, double[] dArr) {
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
            iArr[i14] = ((((iArr[i14] >>> 24) * i13) / 255) << 24) | i12;
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

    public static Bitmap r0(q0 q0Var, Bitmap bitmap, boolean z10) {
        if (z10) {
            Bitmap bitmap2 = q0Var.m;
            if (bitmap2 == null || q0Var.n != bitmap || q0Var.p != q0Var.j) {
                q0Var.m = q0(bitmap, bitmap2, q0Var.j);
                q0Var.n = bitmap;
                q0Var.p = q0Var.j;
            }
            return q0Var.m;
        }
        Bitmap bitmap3 = q0Var.k;
        if (bitmap3 == null || q0Var.l != bitmap || q0Var.o != q0Var.j) {
            q0Var.k = q0(bitmap, bitmap3, q0Var.j);
            q0Var.l = bitmap;
            q0Var.o = q0Var.j;
        }
        return q0Var.k;
    }

    public static void s(int[] iArr, byte[] bArr, int i10) {
        int i11 = 16777215 & i10;
        int i12 = i10 >>> 24;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            iArr[i13] = ((((bArr[i13] & 255) * i12) / 255) << 24) | i11;
        }
    }

    public static float s1(float f7, float f10, float f11) {
        float dpf2 = (f7 - f11) / AndroidUtilities.dpf2(1.7f);
        float dpf22 = f10 / AndroidUtilities.dpf2(3.2f);
        return AndroidUtilities.dpf2(3.6f) * (((v1(dpf2 * 2.6f, dpf22 * 1.7f, 91) * 0.32f) + (v1(dpf2, dpf22, 17) * 0.68f)) - 0.5f);
    }

    private void setPattern(q0 q0Var) {
        if (!this.e2) {
            q0Var.h = this.s < 1.0f && this.r != null;
            if (q0Var.a == 2) {
                Z(q0Var);
                if (q0Var.e == null) {
                    q0Var.f = this.f2;
                }
            }
            q0 q0Var2 = this.G;
            if (q0Var2 != null && q0Var2 != this.F) {
                O0(q0Var2);
            }
            this.G = this.F;
            this.F = q0Var;
            this.H = AnimationUtils.currentAnimationTimeMillis();
            invalidate();
            return;
        }
        q0 q0Var3 = this.G;
        if (q0Var3 != null && q0Var3 != this.F) {
            O0(q0Var3);
        }
        q0 q0Var4 = this.F;
        if (q0Var4 != q0Var) {
            O0(q0Var4);
        }
        this.G = null;
        this.F = q0Var;
        if (q0Var.a == 2) {
            Z(q0Var);
            if (q0Var.e == null) {
                q0Var.f = this.f2;
            }
        }
        this.H = AnimationUtils.currentAnimationTimeMillis() - 10000;
        invalidate();
    }

    private void setSceneFromCard(r0 r0Var) {
        X0(r0Var, getWidth() / 2.0f, (l() / 2.0f) + m());
        if (this.e2) {
            return;
        }
        this.o2 = j(0.03f, 0.005f, this.m2);
        this.m2 = AnimationUtils.currentAnimationTimeMillis();
    }

    public static r0 t(int i10) {
        r0 r0Var = new r0();
        r0Var.a = 0;
        r0Var.f = i10;
        if (i10 == I9) {
            r0Var.b = -12602881;
            r0Var.c = -15308082;
            r0Var.d = a.d[i10];
        } else {
            r0Var.b = x(a.b[i10], false);
            r0Var.c = x(a.c[i10], true);
            r0Var.d = a.d[i10];
        }
        if (i10 == I9) {
            r0Var.e = -16747023;
        } else {
            k();
            r0Var.e = G9[i10];
        }
        r0Var.h = Y0(r0Var.b);
        r0Var.g = f.j(0.5f, r0Var.b, r0Var.c);
        return r0Var;
    }

    public static int u(r0 r0Var) {
        int f7 = r0Var != null ? i0.a.f(0.5f, r0Var.b, r0Var.c) : -16777216;
        double h = r0Var != null ? i0.a.h(r0Var.b) : 0.3d;
        float[] fArr = v0.b;
        float max = (fArr[10] / 100.0f) * ((float) Math.max(0.0d, Math.min(1.0d, (0.85d - h) / 0.45d)));
        float f10 = (fArr[11] / 100.0f) + 1.0f;
        float f11 = ((0.5f - (f10 * 0.5f)) + max) * 255.0f;
        return i0.a.k(r0Var != null ? r0Var.h : TLObject.FLAG_30, i0.a.k(g((fArr[3] + fArr[9]) / 100.0f, 16777215), Color.rgb(Math.max(0, Math.min(255, Math.round((Color.red(f7) * f10) + f11))), Math.max(0, Math.min(255, Math.round((Color.green(f7) * f10) + f11))), Math.max(0, Math.min(255, Math.round((f10 * Color.blue(f7)) + f11))))));
    }

    public static double u0(int i10, int i11) {
        long j10 = (i11 * (-4417276706812531889L)) ^ (i10 * (-7046029254386353131L));
        long j11 = (j10 ^ (j10 >>> 31)) * (-4658895280553007687L);
        long j12 = (j11 ^ (j11 >>> 27)) * (-7723592293110705685L);
        return ((j12 ^ (j12 >>> 31)) >>> 11) / 9.007199254740992E15d;
    }

    public static float u1(float f7) {
        int floor = (int) Math.floor(f7);
        float f10 = f7 - floor;
        float B = k3.B(f10, 2.0f, 3.0f, f10 * f10);
        float c02 = c0(Math.sin(floor * 127.1d) * 43758.5453d);
        return ((c0(Math.sin((floor + 1) * 127.1d) * 43758.5453d) - c02) * B) + c02;
    }

    public static int v(int i10, int i11) {
        double d;
        double atan2;
        double min;
        double[] dArr = new double[3];
        double[] dArr2 = new double[3];
        double[] dArr3 = new double[3];
        n1(i11, dArr);
        n1(i10, dArr2);
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

    public static float v1(float f7, float f10, int i10) {
        int floor = (int) Math.floor(f7);
        int floor2 = (int) Math.floor(f10);
        float f11 = f7 - floor;
        float f12 = f10 - floor2;
        float B = k3.B(f11, 2.0f, 3.0f, f11 * f11);
        float B2 = k3.B(f12, 2.0f, 3.0f, f12 * f12);
        float k02 = k0(floor, floor2, i10);
        int i11 = floor + 1;
        float k03 = k0(i11, floor2, i10);
        int i12 = floor2 + 1;
        float k04 = k0(floor, i12, i10);
        float k05 = k0(i11, i12, i10);
        float y3 = k3.y(k03, k02, B, k02);
        return (((((k05 - k04) * B) + k04) - y3) * B2) + y3;
    }

    public static int w0(float f7) {
        float max = Math.max(0.0f, Math.min(1.0f, f7));
        return Math.round(Math.max(0.0f, Math.min(1.0f, max <= 0.0031308f ? max * 12.92f : (((float) Math.pow(max, 0.4166666567325592d)) * 1.055f) - 0.055f)) * 255.0f);
    }

    public static int x(int i10, boolean z10) {
        double[] dArr = new double[3];
        i0.a.j(i10, dArr);
        if (!z10) {
            return i10;
        }
        double max = Math.max(0.0d, dArr[0] - 3.0d);
        dArr[0] = max;
        double d = dArr[1] * 1.03d;
        dArr[1] = d;
        double d10 = dArr[2] * 1.03d;
        dArr[2] = d10;
        return i0.a.b(max, d, d10);
    }

    public static PorterDuffColorFilter x0(q0 q0Var) {
        float[] fArr = v0.b;
        int i10 = ((int) (fArr[14] * 10.0f)) ^ q0Var.s;
        if (q0Var.u == null || q0Var.t != i10) {
            q0Var.t = i10;
            q0Var.u = new PorterDuffColorFilter(i0.a.f(fArr[14] / 100.0f, q0Var.s, -1), PorterDuff.Mode.SRC_IN);
        }
        return q0Var.u;
    }

    public static float x1(float f7) {
        return 1.0f - ((float) Math.pow(1.0f - f7, 2.4000000953674316d));
    }

    /* JADX WARN: Code restructure failed: missing block: B:255:0x024e, code lost:
    
        if (r4 > 1500) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0848  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0a4c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0600  */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41, types: [int] */
    /* JADX WARN: Type inference failed for: r5v71 */
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
        float clamp01;
        float f11;
        float t10;
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
        int i17;
        int i18;
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        float f16;
        int i19;
        float pow;
        float[] fArr4;
        int i20;
        int i21;
        float[] fArr5;
        RectF rectF;
        float f17;
        char c10;
        float f18;
        boolean z10;
        char c11;
        int i22;
        boolean[] zArr;
        char c12;
        float f19;
        int i23;
        float b10;
        float f20;
        Canvas canvas2 = canvas;
        canvas2.save();
        float lerp = this.R4 >= 1.0f ? 1.0f : this.U4 ? AndroidUtilities.lerp(0.9f, 1.0f, this.V4) : AndroidUtilities.lerp(0.92f, 1.0f, this.V4);
        float clamp012 = 1.0f - (this.m2 == 0 ? 1.0f : Utilities.clamp01((AnimationUtils.currentAnimationTimeMillis() - this.m2) / 320.0f));
        float j10 = (((this.o2 - 1.0f) * clamp012 * clamp012) + j(0.03f, 0.005f, this.m2)) * lerp;
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
        float l4 = l();
        float f22 = (f21 - width) / 2.0f;
        float m10 = m();
        float f23 = f22 + width;
        float f24 = l4 + m10;
        this.F1.set(f22, m10, f23, f24);
        this.B1.setColor(-1);
        RectF rectF2 = this.F1;
        int o10 = i0.a.o(i0.a.f(0.4f, N0(), -16777216), 16);
        Bitmap bitmap2 = this.X4;
        float f25 = 4.0f;
        int i24 = 3;
        if (bitmap2 == null) {
            K0();
            i11 = 0;
            i12 = 1;
        } else {
            i11 = 0;
            byte[] bArr = O9;
            int i25 = P9;
            i12 = 1;
            if (o10 != this.Z4) {
                this.Z4 = o10;
                s(this.Y4, bArr, o10);
                bitmap2.setPixels(this.Y4, 0, i25, 0, 0, i25, i25);
                bitmap = bitmap2;
            } else {
                bitmap = bitmap2;
            }
            float f26 = Q9 * 4.0f;
            float f27 = R9 * 4.0f;
            float dp = AndroidUtilities.dp(4.0f);
            int[] iArr = this.d5;
            iArr[0] = 0;
            int i26 = R9;
            iArr[1] = i26;
            iArr[2] = i25 - i26;
            iArr[3] = i25;
            float[] fArr6 = this.e5;
            float f28 = rectF2.left - f26;
            fArr6[0] = f28;
            fArr6[1] = f28 + f27;
            float f29 = rectF2.right + f26;
            fArr6[3] = f29;
            fArr6[2] = f29 - f27;
            float[] fArr7 = this.f5;
            float f30 = (rectF2.top - f26) + dp;
            fArr7[0] = f30;
            fArr7[1] = f30 + f27;
            float f31 = rectF2.bottom + f26 + dp;
            fArr7[3] = f31;
            fArr7[2] = f31 - f27;
            for (int i27 = 0; i27 < i24; i27++) {
                int i28 = 0;
                while (i28 < i24) {
                    Rect rect = this.b5;
                    int[] iArr2 = this.d5;
                    int i29 = i28 + 1;
                    int i30 = i24;
                    int i31 = i27 + 1;
                    rect.set(iArr2[i28], iArr2[i27], iArr2[i29], iArr2[i31]);
                    RectF rectF3 = this.c5;
                    float[] fArr8 = this.e5;
                    float f32 = fArr8[i28];
                    float[] fArr9 = this.f5;
                    rectF3.set(f32, fArr9[i27], fArr8[i29], fArr9[i31]);
                    canvas2.drawBitmap(bitmap, this.b5, this.c5, this.a5);
                    i28 = i29;
                    i24 = i30;
                }
            }
        }
        int i32 = i24;
        canvas2.drawRoundRect(this.F1, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), this.B1);
        this.s0.r.set(f22, m10, f23, f24);
        int N0 = N0();
        float f33 = 0.7f * width;
        float f34 = (width - f33) / 2.0f;
        float f35 = f22 + f34;
        float lerp2 = AndroidUtilities.lerp(width * 0.12f, f34, this.B2) + m10;
        f fVar = this.s0;
        if (fVar.y != N0 || fVar.z == null) {
            fVar.y = N0;
            fVar.z = new PorterDuffColorFilter(N0, PorterDuff.Mode.SRC_IN);
        }
        this.s0.d(canvas2, f35, lerp2, f33);
        f fVar2 = this.s0;
        float f36 = (fVar2.m == null ? 0.0f : (r13.l * f33) / r13.b) / 2.0f;
        float f37 = f33 / 2.0f;
        float f38 = f35 + f37;
        float f39 = f37 + lerp2;
        if (fVar2.q == 2) {
            Math.max(0.0f, fVar2.o);
        }
        float T = T(1.0f);
        canvas2.save();
        canvas2.scale(T, T, f38, f39);
        this.z1.setColor(N0);
        canvas2.drawCircle(f38, f39, f36, this.z1);
        f fVar3 = this.s0;
        if (fVar3.q == 2) {
            f7 = 30.0f;
            i13 = 2;
            if (fVar3.p == 0) {
                currentTimeMillis = -1;
                f10 = 0.12f;
            } else {
                f10 = 0.12f;
                currentTimeMillis = System.currentTimeMillis() - fVar3.p;
            }
            clamp01 = (!this.S2 || currentTimeMillis == Long.MAX_VALUE) ? 1.0f : currentTimeMillis < 0 ? 0.0f : Utilities.clamp01(currentTimeMillis / 500.0f);
            if (clamp01 < 1.0f) {
                f11 = lerp2;
                t10 = 1.0f;
            } else {
                f11 = lerp2;
                t10 = k3.t((float) Math.sin(clamp01 * 3.141592653589793d), 0.015f, clamp01, 1.0f - ((float) Math.pow(1.0f - clamp01, 3.0d)));
            }
            if (t10 <= 0.004f) {
                canvas2.save();
                this.F5.rewind();
                f12 = 0.004f;
                this.F5.addCircle(f38, f39, f36, Path.Direction.CW);
                canvas2.clipPath(this.F5);
                float min = (1.0f - Math.min(1.0f, t10)) * f36 * 0.55f;
                float f40 = (t10 * 0.5f) + 0.5f;
                canvas2.translate(-min, min);
                canvas2.scale(f40, f40, f38, f39);
                if (!this.S2 || this.Q2 == null) {
                    this.X1.setAlpha((int) (Utilities.clamp01(clamp01 * 2.0f) * 255.0f));
                    this.X1.setBounds((int) (f38 - f36), (int) (f39 - f36), (int) (f38 + f36), (int) (f39 + f36));
                    this.X1.draw(canvas2);
                    this.X1.setAlpha(255);
                } else {
                    this.d7.set(f38 - f36, f39 - f36, f38 + f36, f39 + f36);
                    canvas2.drawBitmap(this.Q2, (Rect) null, this.d7, this.R2);
                }
                canvas2.restore();
            } else {
                f12 = 0.004f;
            }
            canvas2.restore();
            i14 = (int) width;
            textPaint = this.G5;
            staticLayout = this.I5;
            if (staticLayout == null && this.J5 == i14) {
                f13 = f33;
            } else {
                this.J5 = i14;
                str = this.f;
                if (str == null) {
                    str = "";
                }
                String upperCase = str.toUpperCase();
                textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
                int dp2 = i14 - (AndroidUtilities.dp(20.0f) * i13);
                this.I5 = null;
                i15 = i11;
                while (i15 <= i13) {
                    if (i15 == 0) {
                        this.H5 = w(R.drawable.qr_at_large);
                        textPaint.setTextSize(AndroidUtilities.dp(f7));
                    } else if (i15 == i12) {
                        this.H5 = w(R.drawable.qr_at_medium);
                        textPaint.setTextSize(AndroidUtilities.dp(25.0f));
                    } else {
                        this.H5 = w(R.drawable.qr_at_small);
                        textPaint.setTextSize(AndroidUtilities.dp(19.0f));
                    }
                    Drawable drawable = this.H5;
                    int i33 = i11;
                    drawable.setBounds(i33, i33, drawable.getIntrinsicWidth(), this.H5.getIntrinsicHeight());
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.h ? r4.c.h(" ", upperCase) : upperCase);
                    if (this.h) {
                        f13 = f33;
                        spannableStringBuilder.setSpan(new v6(this.H5), 0, 1, 33);
                    } else {
                        f13 = f33;
                    }
                    float width2 = this.h ? this.H5.getBounds().width() : 0;
                    float measureText = textPaint.measureText(spannableStringBuilder, this.h ? 1 : 0, spannableStringBuilder.length()) + width2;
                    if (i15 > 1 || measureText <= dp2) {
                        int i34 = measureText > ((float) dp2) ? 2 : 1;
                        int dp3 = i34 > 1 ? AndroidUtilities.dp(2.0f) + (((int) (measureText + width2)) / 2) : dp2;
                        if (dp3 > dp2) {
                            dp3 = AndroidUtilities.dp(4.0f) + (((int) (measureText + width2)) / 3);
                            i16 = i32;
                        } else {
                            i16 = i34;
                        }
                        int i35 = dp3;
                        this.I5 = dx0.c(spannableStringBuilder, textPaint, i35, Layout.Alignment.ALIGN_CENTER, 0.0f, null, Math.min(AndroidUtilities.dp(10.0f) + i35, i14), i16, true);
                        staticLayout = this.I5;
                    } else {
                        i15++;
                        f33 = f13;
                        i13 = 2;
                        i11 = 0;
                        i12 = 1;
                    }
                }
                f13 = f33;
                staticLayout = this.I5;
            }
            staticLayout2 = staticLayout;
            if (staticLayout2 == null) {
                this.G5.setColor(N0);
                this.H5.setColorFilter(m1(N0));
                float descent = (this.G5.descent() - this.G5.ascent()) * staticLayout2.getLineCount();
                float f41 = f11 + f13;
                boolean z11 = this.o5 && !this.S2;
                float f42 = this.B2;
                float f43 = z11 ? f42 < 0.999f ? 1.0f : 0.0f : 1.0f - f42;
                f14 = 36.0f;
                float z12 = k3.z(width, staticLayout2.getWidth(), 2.0f, f22);
                float dp4 = ((((f24 - f41) - descent) / 2.0f) + f41) - AndroidUtilities.dp(4.0f);
                if (z11) {
                    c10 = 26214;
                    if (this.n5 != staticLayout2) {
                        Random random = this.e1;
                        this.n5 = staticLayout2;
                        f18 = 0.82f;
                        this.k5 = 0;
                        int max = Math.max(1, staticLayout2.getWidth());
                        f15 = 1.6f;
                        int max2 = Math.max(1, staticLayout2.getHeight());
                        Bitmap createBitmap = Bitmap.createBitmap(max, max2, Bitmap.Config.ALPHA_8);
                        staticLayout2.draw(new Canvas(createBitmap));
                        int[] iArr3 = new int[max];
                        int max3 = Math.max(2, AndroidUtilities.dp(2.0f));
                        int i36 = max3 / 2;
                        f17 = descent;
                        int i37 = max;
                        int i38 = i36;
                        int i39 = 0;
                        int i40 = 0;
                        while (i38 < max2) {
                            int i41 = i38;
                            Bitmap bitmap3 = createBitmap;
                            bitmap3.getPixels(iArr3, 0, i37, 0, i41, i37, 1);
                            int i42 = i37;
                            int i43 = i36;
                            int i44 = i40;
                            while (i43 < i42) {
                                int i45 = i39;
                                int i46 = max3;
                                if ((iArr3[i43] >>> 24) < 96) {
                                    i39 = i45;
                                } else {
                                    i39 = i45 + 1;
                                    if (i43 < max) {
                                        max = i43;
                                    }
                                    if (i43 > i44) {
                                        i44 = i43;
                                    }
                                }
                                i43 += i46;
                                max3 = i46;
                            }
                            int i47 = max3;
                            i38 = i41 + i47;
                            i39 = i39;
                            i37 = i42;
                            i40 = i44;
                            createBitmap = bitmap3;
                            max3 = i47;
                        }
                        int i48 = max3;
                        Bitmap bitmap4 = createBitmap;
                        int i49 = i37;
                        if (i39 == 0) {
                            bitmap4.recycle();
                            this.l5 = 0.0f;
                            this.m5 = i49;
                            z10 = false;
                            if (f43 > f12) {
                                canvas2.save();
                                canvas2.translate(z12, dp4);
                                float T2 = T(f43);
                                canvas2.scale(T2, T2, staticLayout2.getWidth() / 2.0f, f17 / 2.0f);
                                if (z11) {
                                    c11 = c10;
                                    float f44 = f18;
                                    i22 = 240;
                                    canvas2.saveLayer(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f) + staticLayout2.getWidth(), AndroidUtilities.dp(4.0f) + staticLayout2.getHeight(), null);
                                    staticLayout2.draw(canvas2);
                                    float f45 = this.B2 * 1.12f;
                                    float f46 = this.l5;
                                    float f47 = this.m5;
                                    float f48 = (((f45 - 0.18f) * f47) / f44) + f46;
                                    this.E.setScale(Math.max(1.0f, a1.g.B(f47, f45, f44, f46) - f48), 1.0f);
                                    this.E.postTranslate(f48, 0.0f);
                                    this.D5.setLocalMatrix(this.E);
                                    canvas2.drawRect(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f) + staticLayout2.getWidth(), AndroidUtilities.dp(4.0f) + staticLayout2.getHeight(), this.E5);
                                    canvas.restore();
                                    canvas2 = canvas;
                                } else {
                                    c11 = c10;
                                    i22 = 240;
                                    if (f43 < 1.0f) {
                                        canvas2 = canvas;
                                        canvas2.saveLayerAlpha(0.0f, -AndroidUtilities.dp(4.0f), staticLayout2.getWidth(), f17 + AndroidUtilities.dp(4.0f), (int) (f43 * 255.0f));
                                    } else {
                                        canvas2 = canvas;
                                    }
                                    staticLayout2.draw(canvas2);
                                    if (f43 < 1.0f) {
                                        canvas2.restore();
                                    }
                                }
                                canvas2.restore();
                            } else {
                                c11 = c10;
                                i22 = 240;
                            }
                            if (z11) {
                                boolean[] zArr2 = this.j5;
                                Random random2 = this.e1;
                                float f49 = this.B2 * 1.12f;
                                for (?? r52 = z10; r52 < this.k5; r52++) {
                                    boolean z13 = this.i5[r52] < f49 ? true : z10;
                                    if (!z13 || zArr2[r52] || this.D2 != 1.0f || (i23 = this.C5) >= i22) {
                                        zArr = zArr2;
                                        c12 = c11;
                                        f19 = f25;
                                    } else {
                                        this.C5 = i23 + 1;
                                        boolean z14 = random2.nextFloat() < f10 ? true : z10;
                                        float[] fArr10 = this.p5;
                                        float[] fArr11 = this.u5;
                                        float nextFloat = ((random2.nextFloat() - 0.5f) * AndroidUtilities.dp(2.0f)) + this.g5[r52] + z12;
                                        fArr11[i23] = nextFloat;
                                        fArr10[i23] = nextFloat;
                                        float[] fArr12 = this.q5;
                                        float[] fArr13 = this.v5;
                                        zArr = zArr2;
                                        float nextFloat2 = ((random2.nextFloat() - 0.5f) * AndroidUtilities.dp(2.0f)) + this.h5[r52] + dp4;
                                        fArr13[i23] = nextFloat2;
                                        fArr12[i23] = nextFloat2;
                                        this.r5[i23] = ((random2.nextFloat() - 0.5f) * AndroidUtilities.dp(36.0f)) + AndroidUtilities.dp(6.0f);
                                        this.s5[i23] = -((random2.nextFloat() * AndroidUtilities.dp(36.0f)) + AndroidUtilities.dp(18.0f));
                                        this.t5[i23] = -((random2.nextFloat() * AndroidUtilities.dp(70.0f)) + AndroidUtilities.dp(60.0f));
                                        float[] fArr14 = this.w5;
                                        if (z14) {
                                            b10 = c1.b(0.8f, random2.nextFloat(), AndroidUtilities.dpf2(f15));
                                            c12 = 26214;
                                        } else {
                                            c12 = 26214;
                                            b10 = c1.b(1.3f, random2.nextFloat(), AndroidUtilities.dpf2(1.2f));
                                        }
                                        fArr14[i23] = b10;
                                        this.x5[i23] = c1.d(random2, 0.4f, 0.6f);
                                        this.y5[i23] = 0.0f;
                                        f19 = f25;
                                        this.z5[i23] = c1.d(random2, 3.0f, f19);
                                        this.A5[i23] = random2.nextFloat() * 6.2832f;
                                        this.B5[i23] = z14;
                                    }
                                    zArr[r52] = z13;
                                    f25 = f19;
                                    c11 = c12;
                                    zArr2 = zArr;
                                    i22 = 240;
                                }
                            }
                        } else {
                            this.l5 = max;
                            this.m5 = Math.max(1, i40 - max);
                            float min2 = Math.min(1.0f, Math.max(80, Math.min(200, (int) (r6 / AndroidUtilities.dpf2(1.3f)))) / i39);
                            int i50 = i36;
                            while (i50 < max2) {
                                bitmap4.getPixels(iArr3, 0, i49, 0, i50, i49, 1);
                                int i51 = i36;
                                while (i51 < i49 && this.k5 < 240) {
                                    if ((iArr3[i51] >>> 24) < 96 || random.nextFloat() > min2) {
                                        f20 = min2;
                                    } else {
                                        int i52 = this.k5;
                                        this.k5 = i52 + 1;
                                        f20 = min2;
                                        float f50 = i51;
                                        this.g5[i52] = f50;
                                        this.h5[i52] = i50;
                                        this.i5[i52] = c1.d(random, 0.18f, ((f50 - this.l5) * 0.82f) / this.m5);
                                        this.j5[i52] = false;
                                    }
                                    i51 += i48;
                                    min2 = f20;
                                }
                                i50 += i48;
                                min2 = min2;
                            }
                            z10 = false;
                            bitmap4.recycle();
                            if (f43 > f12) {
                            }
                            if (z11) {
                            }
                        }
                    } else {
                        f17 = descent;
                    }
                } else {
                    f17 = descent;
                    c10 = 26214;
                }
                f18 = 0.82f;
                f15 = 1.6f;
                z10 = false;
                if (f43 > f12) {
                }
                if (z11) {
                }
            } else {
                f14 = 36.0f;
                f15 = 1.6f;
            }
            if (!this.S2 && (i17 = this.C5) > 0) {
                RectF rectF4 = this.F1;
                boolean[] zArr3 = this.B5;
                float[] fArr15 = this.A5;
                float[] fArr16 = this.z5;
                float[] fArr17 = this.w5;
                float[] fArr18 = this.v5;
                float[] fArr19 = this.u5;
                float[] fArr20 = this.t5;
                float[] fArr21 = this.x5;
                float[] fArr22 = this.q5;
                float[] fArr23 = this.p5;
                float[] fArr24 = this.y5;
                Paint paint = this.z1;
                float[] fArr25 = this.s5;
                float[] fArr26 = this.r5;
                float f51 = this.W2 * 0.016667f;
                i18 = i17 - 1;
                while (i18 >= 0) {
                    float f52 = fArr24[i18] + f51;
                    fArr24[i18] = f52;
                    if (f52 >= fArr21[i18]) {
                        fArr = fArr15;
                        int i53 = this.C5 - 1;
                        this.C5 = i53;
                        fArr23[i18] = fArr23[i53];
                        fArr22[i18] = fArr22[i53];
                        fArr26[i18] = fArr26[i53];
                        fArr25[i18] = fArr25[i53];
                        fArr20[i18] = fArr20[i53];
                        fArr19[i18] = fArr19[i53];
                        fArr18[i18] = fArr18[i53];
                        fArr17[i18] = fArr17[i53];
                        fArr21[i18] = fArr21[i53];
                        fArr24[i18] = fArr24[i53];
                        fArr16[i18] = fArr16[i53];
                        fArr[i18] = fArr[i53];
                        zArr3[i18] = zArr3[i53];
                        rectF = rectF4;
                        f16 = f51;
                        fArr2 = fArr16;
                        fArr3 = fArr17;
                        fArr4 = fArr18;
                        fArr5 = fArr19;
                        i20 = N0;
                    } else {
                        fArr = fArr15;
                        fArr25[i18] = (fArr20[i18] * f51) + fArr25[i18];
                        fArr2 = fArr16;
                        fArr3 = fArr17;
                        fArr26[i18] = k3.B(f51, f15, 1.0f, fArr26[i18]);
                        fArr25[i18] = k3.B(f51, 0.8f, 1.0f, fArr25[i18]);
                        fArr23[i18] = (fArr26[i18] * f51) + fArr23[i18];
                        float f53 = (fArr25[i18] * f51) + fArr22[i18];
                        fArr22[i18] = f53;
                        float f54 = fArr23[i18] - fArr19[i18];
                        float f55 = f53 - fArr18[i18];
                        float f56 = (f55 * f55) + (f54 * f54);
                        int i54 = N0;
                        float sqrt = (float) Math.sqrt(f56);
                        float f57 = fArr24[i18] / fArr21[i18];
                        if (f57 < 0.08f) {
                            pow = f57 / 0.08f;
                            f16 = f51;
                            i19 = i54;
                        } else {
                            f16 = f51;
                            i19 = i54;
                            pow = (float) Math.pow(org.telegram.messenger.g0.x(f57, 0.08f, 0.92f, 1.0f), 0.550000011920929d);
                        }
                        float exp = pow * ((float) Math.exp((-sqrt) / AndroidUtilities.dp(90.0f)));
                        float min3 = (1.0f - (Math.min(1.0f, sqrt / AndroidUtilities.dp(90.0f)) * 0.4f)) * (fArr3[i18] / 2.0f);
                        float hypot = (float) Math.hypot(fArr26[i18], fArr25[i18]);
                        float f58 = fArr23[i18];
                        float f59 = fArr22[i18];
                        if (hypot > 1.0f) {
                            float sin = ((float) Math.sin((fArr24[i18] * fArr2[i18]) + fArr[i18])) * AndroidUtilities.dp(3.0f);
                            f58 = a1.g.d(-fArr25[i18], hypot, sin, f58);
                            f59 = a1.g.d(fArr26[i18], hypot, sin, f59);
                        }
                        fArr4 = fArr18;
                        float min4 = Math.min(1.0f, Math.max(Math.max(rectF4.left - f58, Math.max(0.0f, f58 - rectF4.right)), Math.max(rectF4.top - f59, Math.max(0.0f, f59 - rectF4.bottom))) / AndroidUtilities.dp(f14));
                        if (min4 > 0.0f) {
                            i20 = i19;
                            i21 = f.j(min4, i20, -1);
                        } else {
                            i20 = i19;
                            i21 = i20;
                        }
                        paint.setColor(i21);
                        paint.setAlpha((int) (exp * 255.0f));
                        float min5 = Math.min(1.8f, (hypot / AndroidUtilities.dp(220.0f)) + 1.0f);
                        canvas2.save();
                        fArr5 = fArr19;
                        rectF = rectF4;
                        canvas2.rotate((float) Math.toDegrees(Math.atan2(fArr25[i18], fArr26[i18])), f58, f59);
                        float f60 = min3 * min5;
                        this.V5.set(f58 - f60, f59 - min3, f60 + f58, f59 + min3);
                        canvas2.drawOval(this.V5, paint);
                        canvas2.restore();
                        if (zArr3[i18]) {
                            paint.setAlpha((int) (exp * f14));
                            canvas2.drawCircle(f58, f59, 2.2f * min3, paint);
                        }
                    }
                    i18--;
                    N0 = i20;
                    fArr18 = fArr4;
                    fArr15 = fArr;
                    fArr16 = fArr2;
                    fArr17 = fArr3;
                    f51 = f16;
                    fArr19 = fArr5;
                    rectF4 = rectF;
                    f15 = 1.6f;
                }
                if (this.C5 > 0) {
                    invalidate();
                }
            }
            canvas2.restore();
        }
        f7 = 30.0f;
        i13 = 2;
        f10 = 0.12f;
        currentTimeMillis = Long.MAX_VALUE;
        if (this.S2) {
        }
        if (clamp01 < 1.0f) {
        }
        if (t10 <= 0.004f) {
        }
        canvas2.restore();
        i14 = (int) width;
        textPaint = this.G5;
        staticLayout = this.I5;
        if (staticLayout == null) {
        }
        this.J5 = i14;
        str = this.f;
        if (str == null) {
        }
        String upperCase2 = str.toUpperCase();
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        int dp22 = i14 - (AndroidUtilities.dp(20.0f) * i13);
        this.I5 = null;
        i15 = i11;
        while (i15 <= i13) {
        }
        f13 = f33;
        staticLayout = this.I5;
        staticLayout2 = staticLayout;
        if (staticLayout2 == null) {
        }
        if (!this.S2) {
            RectF rectF42 = this.F1;
            boolean[] zArr32 = this.B5;
            float[] fArr152 = this.A5;
            float[] fArr162 = this.z5;
            float[] fArr172 = this.w5;
            float[] fArr182 = this.v5;
            float[] fArr192 = this.u5;
            float[] fArr202 = this.t5;
            float[] fArr212 = this.x5;
            float[] fArr222 = this.q5;
            float[] fArr232 = this.p5;
            float[] fArr242 = this.y5;
            Paint paint2 = this.z1;
            float[] fArr252 = this.s5;
            float[] fArr262 = this.r5;
            float f512 = this.W2 * 0.016667f;
            i18 = i17 - 1;
            while (i18 >= 0) {
            }
            if (this.C5 > 0) {
            }
        }
        canvas2.restore();
    }

    public final PorterDuffColorFilter A0(q0 q0Var) {
        float[] fArr = v0.b;
        int i10 = ((int) (fArr[30] * 10.0f)) ^ (q0Var.s * 31);
        if (this.k4 == null || this.l4 != i10) {
            this.l4 = i10;
            this.k4 = new PorterDuffColorFilter(i0.a.f(fArr[30] / 100.0f, q0Var.s, -1), PorterDuff.Mode.SRC_IN);
        }
        return this.k4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0094, code lost:
    
        if (r0.B0 > 0.001f) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0a49  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0a78  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0ab2  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0b57  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0a8d  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0a4e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(Canvas canvas, int i10) {
        RectF rectF;
        float f7;
        TextPaint textPaint;
        float f10;
        float f11;
        long j10;
        float f12;
        float[] fArr;
        int i11;
        float f13;
        float f14;
        boolean z10;
        float[] fArr2;
        int i12;
        float f15;
        float[] fArr3;
        Paint paint;
        Path path;
        Path path2;
        int i13;
        RectF rectF2;
        TextPaint textPaint2;
        float f16;
        float f17;
        float f18;
        RectF rectF3;
        Path path3;
        Random random;
        float f19;
        float f20;
        float f21;
        RectF rectF4;
        float pow;
        float f22;
        float f23;
        Paint paint2;
        byte b10;
        float f24;
        RectF rectF5;
        float pow2;
        float f25;
        float f26;
        float f27;
        RectF rectF6;
        int i14;
        Paint paint3;
        int i15;
        char c10;
        float b11;
        int i16;
        int i17;
        int i18;
        float f28;
        float f29;
        float[] fArr4;
        boolean z11;
        float f30;
        float b12;
        t0 t0Var = this;
        Canvas canvas2 = canvas;
        float f31 = t0Var.B2;
        float f32 = t0Var.I2;
        float f33 = (1.0f - f32) * f31;
        RectF rectF7 = t0Var.K5;
        TextPaint textPaint3 = t0Var.H0;
        RectF rectF8 = t0Var.F1;
        if (f32 > 0.001f) {
            boolean z12 = f32 < 0.999f;
            if (z12) {
                canvas2.save();
                float f34 = t0Var.I2;
                f11 = 0.999f;
                f7 = 2.0f;
                canvas2.scale(f34, f34, i10 / 2.0f, t0Var.o());
            } else {
                f11 = 0.999f;
                f7 = 2.0f;
            }
            float o10 = t0Var.o();
            textPaint3.setTextSize(AndroidUtilities.dp(11.0f));
            float measureText = textPaint3.measureText(t0Var.J0) + textPaint3.measureText(t0Var.I0) + AndroidUtilities.dp(11.0f) + AndroidUtilities.dp(12.0f) + AndroidUtilities.dp(1.0f) + AndroidUtilities.dp(11.0f);
            if (!t0Var.v0) {
                f12 = t0Var.s2;
                if (f12 > 0.0f) {
                    j10 = 0;
                }
            }
            j10 = 0;
            f12 = AndroidUtilities.dp(11.0f) + t0Var.L0.c() + AndroidUtilities.dp(f7) + AndroidUtilities.dp(12.0f) + AndroidUtilities.dp(8.0f);
            boolean z13 = t0Var.v0;
            if (!z13 && t0Var.B0 <= 0.001f) {
                t0Var.s2 = 0.0f;
            }
            float f35 = t0Var.B0;
            if (z13) {
                f35 = Math.max(f35, t0Var.F0 ? 1.0f : 0.0f);
            }
            float lerp = AndroidUtilities.lerp(measureText, f12, f35);
            float dp = AndroidUtilities.dp(22.0f);
            float f36 = (i10 - lerp) / f7;
            float f37 = dp / f7;
            rectF8.set(f36, o10 - f37, lerp + f36, o10 + f37);
            rectF7.set(rectF8);
            if (!t0Var.U5) {
                t0Var.A6 = true;
                t0Var.J(canvas2, rectF8, f37, 1.0f);
                t0Var.A6 = false;
            }
            t0Var.M(canvas2, 9, rectF8, false);
            RectF rectF9 = t0Var.L5;
            rectF9.set(rectF8);
            float min = Math.min(0.0f, AndroidUtilities.dpf2(v0.a[1][8]));
            rectF9.inset(min, min);
            float f38 = f37 - min;
            f10 = f33;
            boolean z14 = t0Var.p2 > j10 && !t0Var.v0;
            boolean z15 = t0Var.r2;
            float[] fArr5 = t0Var.Z0;
            float[] fArr6 = t0Var.Y0;
            RectF rectF10 = rectF7;
            float[] fArr7 = t0Var.X0;
            float[] fArr8 = t0Var.U0;
            float[] fArr9 = t0Var.T0;
            float[] fArr10 = t0Var.R0;
            float[] fArr11 = t0Var.Q0;
            float[] fArr12 = t0Var.S0;
            float[] fArr13 = t0Var.P0;
            float[] fArr14 = t0Var.O0;
            float[] fArr15 = t0Var.W0;
            float[] fArr16 = t0Var.V0;
            float[] fArr17 = t0Var.N0;
            float[] fArr18 = t0Var.M0;
            boolean[] zArr = t0Var.b1;
            byte[] bArr = t0Var.a1;
            float f39 = 0.8f;
            RectF rectF11 = t0Var.q2;
            Random random2 = t0Var.e1;
            if (z15) {
                t0Var.r2 = false;
                float f40 = rectF9.left;
                i11 = 0;
                fArr = fArr6;
                rectF11.set(f40, rectF9.top, (rectF9.width() * t0Var.B0 * t0Var.G0) + f40, rectF9.bottom);
                float dp2 = AndroidUtilities.dp(3.0f);
                float centerX = rectF8.centerX();
                float centerY = rectF8.centerY();
                int max = Math.max(1, (int) (rectF11.width() / dp2));
                int max2 = Math.max(1, (int) (rectF11.height() / dp2));
                float min2 = Math.min(1.0f, 260.0f / (max * max2));
                int i19 = 0;
                while (i19 < max2) {
                    float f41 = min2;
                    int i20 = 0;
                    while (i20 < max) {
                        if (random2.nextFloat() <= f41) {
                            i17 = max2;
                            f29 = f37;
                            if (t0Var.c1 >= 320) {
                                i16 = i20;
                                i18 = i19;
                                f28 = dp;
                            } else {
                                float nextFloat = ((((random2.nextFloat() - 0.5f) * f39) + i20 + 0.5f) * dp2) + rectF11.left;
                                float nextFloat2 = ((((random2.nextFloat() - 0.5f) * f39) + i19 + 0.5f) * dp2) + rectF11.top;
                                float height = rectF8.height() / f7;
                                if (nextFloat < rectF8.left + height) {
                                    z11 = z14;
                                    fArr4 = fArr5;
                                    i18 = i19;
                                    f28 = dp;
                                    if (Math.hypot(nextFloat - r8, nextFloat2 - centerY) > height) {
                                        i16 = i20;
                                        i20 = i16 + 1;
                                        max2 = i17;
                                        f37 = f29;
                                        z14 = z11;
                                        fArr5 = fArr4;
                                        dp = f28;
                                        i19 = i18;
                                        f39 = 0.8f;
                                    }
                                } else {
                                    i18 = i19;
                                    f28 = dp;
                                    z11 = z14;
                                    fArr4 = fArr5;
                                }
                                float f42 = nextFloat - centerX;
                                float f43 = nextFloat2 - centerY;
                                float max3 = Math.max(1.0f, (float) Math.hypot(f42, f43));
                                float f44 = f42 / max3;
                                float f45 = f43 / max3;
                                float nextFloat3 = (random2.nextFloat() * AndroidUtilities.dp(140.0f)) + AndroidUtilities.dp(60.0f);
                                boolean z16 = random2.nextFloat() < 0.15f;
                                int i21 = t0Var.c1;
                                t0Var.c1 = i21 + 1;
                                bArr[i21] = (byte) (z16 ? 4 : 3);
                                zArr[i21] = false;
                                fArr18[i21] = nextFloat;
                                fArr17[i21] = nextFloat2;
                                fArr16[i21] = nextFloat;
                                fArr15[i21] = nextFloat2;
                                i16 = i20;
                                fArr14[i21] = ((random2.nextFloat() - 0.5f) * AndroidUtilities.dp(60.0f)) + (f44 * nextFloat3);
                                fArr13[i21] = ((random2.nextFloat() - 0.5f) * AndroidUtilities.dp(60.0f)) + ((f45 * nextFloat3) - ((random2.nextFloat() * AndroidUtilities.dp(80.0f)) + AndroidUtilities.dp(40.0f)));
                                if (z16) {
                                    b12 = c1.b(f39, random2.nextFloat(), AndroidUtilities.dpf2(1.4f));
                                    f30 = 1.0f;
                                } else {
                                    f30 = 1.0f;
                                    b12 = c1.b(1.2f, random2.nextFloat(), AndroidUtilities.dpf2(1.0f));
                                }
                                fArr12[i21] = b12;
                                fArr11[i21] = c1.d(random2, 0.3f, 0.35f);
                                fArr10[i21] = 0.0f;
                                fArr9[i21] = f30;
                                fArr8[i21] = 0.0f;
                                fArr7[i21] = 0.0f;
                                fArr[i21] = 0.0f;
                                fArr4[i21] = 0.0f;
                                i20 = i16 + 1;
                                max2 = i17;
                                f37 = f29;
                                z14 = z11;
                                fArr5 = fArr4;
                                dp = f28;
                                i19 = i18;
                                f39 = 0.8f;
                            }
                        } else {
                            i16 = i20;
                            i17 = max2;
                            i18 = i19;
                            f28 = dp;
                            f29 = f37;
                        }
                        z11 = z14;
                        fArr4 = fArr5;
                        i20 = i16 + 1;
                        max2 = i17;
                        f37 = f29;
                        z14 = z11;
                        fArr5 = fArr4;
                        dp = f28;
                        i19 = i18;
                        f39 = 0.8f;
                    }
                    i19++;
                    min2 = f41;
                    dp = dp;
                    f39 = 0.8f;
                }
                f13 = dp;
                f14 = f37;
                z10 = z14;
                fArr2 = fArr5;
                t0Var.invalidate();
            } else {
                fArr = fArr6;
                i11 = 0;
                f13 = dp;
                f14 = f37;
                z10 = z14;
                fArr2 = fArr5;
            }
            float f46 = z10 ? 0.0f : t0Var.B0 * t0Var.G0;
            float width = (rectF9.width() * f46) + rectF9.left;
            float clamp01 = z10 ? Utilities.clamp01((AnimationUtils.currentAnimationTimeMillis() - t0Var.p2) / 80.0f) : 1.0f;
            Paint paint4 = t0Var.z1;
            Path path4 = t0Var.E1;
            if (z10 && clamp01 < 1.0f) {
                float clamp012 = 1.0f - Utilities.clamp01((AnimationUtils.currentAnimationTimeMillis() - t0Var.p2) / 60.0f);
                canvas2.save();
                path4.rewind();
                path4.addRoundRect(rectF9, f38, f38, Path.Direction.CW);
                canvas2.clipPath(path4);
                canvas2.clipRect(rectF11);
                if (clamp012 > 0.0f) {
                    paint4 = paint4;
                    paint4.setColor(-134217729);
                    paint4.setAlpha((int) (clamp012 * 247.0f));
                    canvas2.drawRect(rectF11, paint4);
                } else {
                    paint4 = paint4;
                }
                t0Var.G(canvas2, rectF8, a(1.0f - clamp01, t0Var.n != null ? t0Var.N0() : -16777216));
                canvas2.restore();
                t0Var.invalidate();
            }
            boolean z17 = t0Var.v0;
            int i22 = (z17 && t0Var.F0 && t0Var.w0 && f46 < f11) ? 1 : i11;
            float elapsedRealtime = (SystemClock.elapsedRealtime() % 100000) / 1000.0f;
            float f47 = 6.0f;
            float f48 = f46;
            t0Var.O5 = AndroidUtilities.dpf2(((!z17 || t0Var.F0) ? i11 : 1) != 0 ? 5.0f : 2.2f) * Utilities.clamp01((rectF9.right - width) / AndroidUtilities.dp(6.0f)) * Utilities.clamp01((width - rectF9.left) / AndroidUtilities.dp(6.0f));
            float dp3 = rectF8.top - AndroidUtilities.dp(4.0f);
            float dp4 = rectF8.bottom + AndroidUtilities.dp(4.0f);
            float f49 = dp4 - dp3;
            int i23 = i11;
            while (true) {
                i12 = 7;
                f15 = clamp01;
                fArr3 = t0Var.N5;
                if (i23 >= 7) {
                    break;
                }
                float f50 = 5.1f * elapsedRealtime;
                float f51 = i23;
                float f52 = width;
                fArr3[i23] = (((float) ((Math.sin((2.9f * f51) + (8.3f * elapsedRealtime)) * 0.4000000059604645d) + (Math.sin((1.7f * f51) + f50) * 0.6000000238418579d))) * t0Var.O5) + f52;
                i23++;
                clamp01 = f15;
                width = f52;
            }
            float f53 = width;
            Path path5 = t0Var.M5;
            path5.rewind();
            path5.moveTo(rectF8.left - AndroidUtilities.dp(8.0f), dp3);
            path5.lineTo(fArr3[i11], dp3);
            int i24 = 1;
            while (i24 < i12) {
                int i25 = i24 - 1;
                float[] fArr19 = fArr3;
                float f54 = f47;
                float B = a1.g.B(f49, i25, f54, dp3);
                float B2 = a1.g.B(f49, i24, f54, dp3);
                float f55 = fArr19[i25];
                path5.quadTo(f55, B, (f55 + fArr19[i24]) / f7, (B2 + B) / f7);
                i24++;
                fArr3 = fArr19;
                dp3 = dp3;
                i12 = 7;
                f47 = 6.0f;
            }
            path5.lineTo(fArr3[6], dp4);
            path5.lineTo(rectF8.left - AndroidUtilities.dp(8.0f), dp4);
            path5.close();
            if (t0Var.O5 > 0.01f) {
                t0Var.invalidate();
            }
            int i26 = (f48 > 0.001f ? 1 : (f48 == 0.001f ? 0 : -1));
            Path path6 = t0Var.T5;
            if (i26 > 0) {
                canvas2.save();
                path4.rewind();
                path4.addRoundRect(rectF9, f38, f38, Path.Direction.CW);
                canvas2.clipPath(path4);
                canvas2.clipPath(path5);
                paint4.setColor(-134217729);
                if (i22 != 0) {
                    path6.rewind();
                    float dp5 = rectF9.top - AndroidUtilities.dp(f7);
                    float dp6 = rectF9.bottom + AndroidUtilities.dp(f7);
                    float dpf2 = AndroidUtilities.dpf2(0.75f);
                    f17 = 20.0f;
                    path6.moveTo(rectF9.left - AndroidUtilities.dp(4.0f), dp5);
                    while (true) {
                        float min3 = Math.min(dp5, dp6);
                        f27 = f53;
                        f18 = 0.12f;
                        path6.lineTo(s1(min3, f27, rectF9.top) + f27, min3);
                        if (min3 >= dp6) {
                            break;
                        }
                        dp5 += dpf2;
                        f53 = f27;
                    }
                    path6.lineTo(rectF9.left - AndroidUtilities.dp(4.0f), dp6);
                    path6.close();
                    canvas2.drawPath(path6, paint4);
                    rectF6 = rectF8;
                    i14 = i11;
                } else {
                    f27 = f53;
                    f17 = 20.0f;
                    f18 = 0.12f;
                    float f56 = rectF9.left;
                    float f57 = rectF9.top;
                    float f58 = t0Var.O5 + f27;
                    rectF6 = rectF8;
                    float f59 = rectF9.bottom;
                    i14 = i11;
                    canvas2.drawRect(f56, f57, f58, f59, paint4);
                }
                if (i22 != 0 || (t0Var.v0 && !t0Var.F0)) {
                    float dp7 = AndroidUtilities.dp(23.0f);
                    Matrix matrix = t0Var.Q5;
                    matrix.setScale(dp7, 1.0f);
                    matrix.postTranslate(f27 - AndroidUtilities.dp(22.0f), 0.0f);
                    LinearGradient linearGradient = t0Var.R5;
                    linearGradient.setLocalMatrix(matrix);
                    paint4.setShader(linearGradient);
                    canvas.drawRect(f27 - AndroidUtilities.dp(22.0f), rectF9.top, f27 + AndroidUtilities.dp(1.0f), rectF9.bottom, paint4);
                    paint3 = paint4;
                    paint3.setShader(null);
                } else {
                    paint3 = paint4;
                }
                canvas.restore();
                float f60 = t0Var.W2 * 0.016667f;
                float currentTimeMillis = i22 != 0 ? 1.2f : ((t0Var.n2 + 250) - System.currentTimeMillis()) / 1000.0f;
                if (i22 != 0) {
                    int floor = (int) Math.floor(random2.nextFloat() + (110.0f * f60));
                    int i27 = i14;
                    while (i27 < floor) {
                        float f61 = f13;
                        float d = c1.d(random2, f61, rectF6.top);
                        q((random2.nextFloat() * AndroidUtilities.dp(3.0f)) + s1(d, f27, rectF9.top) + f27, d, (random2.nextFloat() * AndroidUtilities.dp(f17)) + AndroidUtilities.dp(10.0f), -((random2.nextFloat() * AndroidUtilities.dp(10.0f)) + AndroidUtilities.dp(4.0f)), 0.0f, c1.b(0.7f, random2.nextFloat(), AndroidUtilities.dpf2(0.8f)), c1.d(random2, 0.25f, 0.25f), c1.d(random2, 0.1f, 0.9f), false, false);
                        i27++;
                        rectF6 = rectF6;
                        f13 = f61;
                        path5 = path5;
                        i26 = i26;
                        path6 = path6;
                        path4 = path4;
                        random2 = random2;
                        floor = floor;
                        paint3 = paint3;
                        rectF10 = rectF10;
                    }
                    paint = paint3;
                    path = path4;
                    Random random3 = random2;
                    path2 = path5;
                    i13 = i26;
                    rectF2 = rectF10;
                    textPaint2 = textPaint3;
                    f16 = f14;
                    float f62 = f13;
                    path3 = path6;
                    rectF3 = rectF6;
                    int floor2 = (int) Math.floor(random3.nextFloat() + (f60 * 70.0f));
                    int i28 = 0;
                    while (i28 < floor2) {
                        boolean z18 = random3.nextFloat() < f18;
                        Random random4 = random3;
                        float d10 = c1.d(random4, f62, rectF3.top);
                        float nextFloat4 = (random4.nextFloat() * AndroidUtilities.dp(10.0f)) + s1(d10, f27, rectF9.top) + f27 + AndroidUtilities.dp(f7);
                        float nextFloat5 = (random4.nextFloat() * AndroidUtilities.dp(70.0f)) + AndroidUtilities.dp(40.0f);
                        float f63 = -((random4.nextFloat() * AndroidUtilities.dp(30.0f)) + AndroidUtilities.dp(10.0f));
                        float f64 = -((random4.nextFloat() * AndroidUtilities.dp(34.0f)) + AndroidUtilities.dp(26.0f));
                        if (z18) {
                            i15 = floor2;
                            b11 = c1.b(0.8f, random4.nextFloat(), AndroidUtilities.dpf2(1.4f));
                            c10 = 26214;
                        } else {
                            i15 = floor2;
                            c10 = 26214;
                            b11 = c1.b(1.1f, random4.nextFloat(), AndroidUtilities.dpf2(0.9f));
                        }
                        q(nextFloat4, d10, nextFloat5, f63, f64, b11, c1.d(random4, 0.7f, 0.6f), 1.0f, z18, true);
                        i28++;
                        floor2 = i15;
                        random3 = random4;
                    }
                    t0Var = this;
                    random = random3;
                } else {
                    paint = paint3;
                    path = path4;
                    path2 = path5;
                    i13 = i26;
                    rectF2 = rectF10;
                    textPaint2 = textPaint3;
                    f16 = f14;
                    float f65 = f13;
                    path3 = path6;
                    rectF3 = rectF6;
                    int floor3 = (int) Math.floor(random2.nextFloat() + (((!t0Var.v0 || t0Var.F0) ? 0.0f : 260.0f) * f60));
                    for (int i29 = 0; i29 < floor3; i29++) {
                        t0Var.p(f27, c1.d(random2, f65, rectF3.top), currentTimeMillis);
                    }
                    random = random2;
                }
            } else {
                paint = paint4;
                path = path4;
                path2 = path5;
                i13 = i26;
                rectF2 = rectF10;
                textPaint2 = textPaint3;
                f16 = f14;
                f17 = 20.0f;
                f18 = 0.12f;
                rectF3 = rectF8;
                path3 = path6;
                random = random2;
            }
            int N0 = t0Var.n != null ? t0Var.N0() : -16777216;
            canvas.save();
            path.rewind();
            Path path7 = path;
            path7.addRoundRect(rectF3, f16, f16, Path.Direction.CW);
            canvas2 = canvas;
            canvas2.clipPath(path7);
            if (i13 > 0) {
                u.b(canvas2, i22 != 0 ? path3 : path2);
            }
            if (t0Var.v0 && t0Var.F0) {
                t0Var.G(canvas2, rectF3, -218103809);
                textPaint = textPaint2;
            } else {
                int a2 = a(z10 ? f15 : 1.0f - Utilities.clamp01(t0Var.B0 * 1.25f), -218103809);
                float centerY2 = rectF3.centerY();
                float dp8 = AndroidUtilities.dp(12.0f);
                float dp9 = rectF3.left + AndroidUtilities.dp(11.0f);
                textPaint = textPaint2;
                textPaint.setColor(a2);
                canvas2.drawText(t0Var.I0, dp9, AndroidUtilities.dp(4.0f) + centerY2, textPaint);
                float measureText2 = dp9 + textPaint.measureText(t0Var.I0);
                t0Var.O(canvas2, measureText2, centerY2, dp8, a2, false);
                textPaint.setColor(a2);
                canvas2.drawText(t0Var.J0, measureText2 + dp8 + AndroidUtilities.dp(1.0f), centerY2 + AndroidUtilities.dp(4.0f), textPaint);
            }
            canvas2.restore();
            if (i13 > 0) {
                canvas2.save();
                canvas2.clipPath(i22 != 0 ? path3 : path2);
                t0Var.G(canvas2, rectF3, N0);
                canvas2.restore();
            }
            float f66 = 0.4f;
            if (t0Var.d1) {
                t0Var.d1 = false;
                for (int i30 = 0; i30 < 24; i30++) {
                    t0Var.p((rectF3.width() * random.nextFloat() * 0.4f) + rectF3.left, (rectF3.height() * random.nextFloat()) + rectF3.top, 0.5f);
                }
            }
            float f67 = 0.5f;
            float f68 = t0Var.W2 * 0.016667f;
            RectF rectF12 = rectF2;
            float dp10 = rectF12.top - AndroidUtilities.dp(40.0f);
            float dp11 = rectF12.top - AndroidUtilities.dp(48.0f);
            int i31 = t0Var.c1 - 1;
            while (i31 >= 0) {
                float f69 = fArr10[i31] + f68;
                fArr10[i31] = f69;
                if (f69 >= fArr11[i31]) {
                    int i32 = t0Var.c1 - 1;
                    t0Var.c1 = i32;
                    fArr18[i31] = fArr18[i32];
                    fArr17[i31] = fArr17[i32];
                    fArr14[i31] = fArr14[i32];
                    fArr13[i31] = fArr13[i32];
                    fArr11[i31] = fArr11[i32];
                    fArr10[i31] = fArr10[i32];
                    fArr12[i31] = fArr12[i32];
                    fArr9[i31] = fArr9[i32];
                    fArr8[i31] = fArr8[i32];
                    bArr[i31] = bArr[i32];
                    zArr[i31] = zArr[i32];
                    fArr16[i31] = fArr16[i32];
                    fArr15[i31] = fArr15[i32];
                    fArr7[i31] = fArr7[i32];
                    fArr[i31] = fArr[i32];
                    fArr2[i31] = fArr2[i32];
                    f19 = f67;
                    f20 = f66;
                    f24 = f68;
                    rectF5 = rectF12;
                    rectF4 = rectF3;
                    paint2 = paint;
                } else {
                    if (bArr[i31] >= 3) {
                        float f70 = 1.0f - (2.4f * f68);
                        fArr14[i31] = fArr14[i31] * f70;
                        float f71 = fArr13[i31] * f70;
                        fArr13[i31] = f71;
                        if (fArr10[i31] > f18) {
                            fArr13[i31] = (AndroidUtilities.dp(120.0f) * f68) + f71;
                        }
                        if (fArr17[i31] < rectF12.top - AndroidUtilities.dp(70.0f)) {
                            fArr13[i31] = fArr13[i31] * 0.85f;
                        }
                    } else {
                        if (zArr[i31]) {
                            fArr13[i31] = (fArr7[i31] * f68) + fArr13[i31];
                            fArr14[i31] = k3.B(f68, 1.6f, 1.0f, fArr14[i31]);
                            float B3 = k3.B(f68, 0.8f, 1.0f, fArr13[i31]);
                            fArr13[i31] = B3;
                            if (fArr17[i31] < dp11) {
                                f19 = f67;
                                f20 = f66;
                                fArr13[i31] = B3 * ((float) Math.pow(0.8999999761581421d, t0Var.W2));
                            }
                        } else {
                            f19 = f67;
                            f20 = f66;
                            fArr13[i31] = fArr13[i31] - (AndroidUtilities.dp(f17) * f68);
                            float f72 = 1.0f - (f68 * 3.0f);
                            fArr14[i31] = fArr14[i31] * f72;
                            float f73 = fArr13[i31] * f72;
                            fArr13[i31] = f73;
                            if (fArr17[i31] < dp10) {
                                fArr13[i31] = f73 * 0.85f;
                            }
                        }
                        fArr18[i31] = (fArr14[i31] * f68) + fArr18[i31];
                        fArr17[i31] = (fArr13[i31] * f68) + fArr17[i31];
                        f21 = fArr10[i31] / fArr11[i31];
                        if (f21 >= f18) {
                            pow = f21 / f18;
                            rectF4 = rectF3;
                        } else {
                            rectF4 = rectF3;
                            pow = (float) Math.pow(org.telegram.messenger.g0.x(f21, f18, 0.88f, 1.0f), zArr[i31] ? 0.550000011920929d : 0.699999988079071d);
                        }
                        f22 = fArr17[i31];
                        if (f22 >= dp10) {
                            f23 = 1.0f;
                            pow *= Math.max(0.0f, 1.0f - ((dp10 - f22) / AndroidUtilities.dp(24.0f)));
                        } else {
                            f23 = 1.0f;
                        }
                        float f74 = ((f23 - (f21 * f19)) * fArr12[i31]) / f7;
                        paint2 = paint;
                        paint2.setColor(-1);
                        paint2.setAlpha((int) (pow * 255.0f));
                        b10 = bArr[i31];
                        RectF rectF13 = t0Var.V5;
                        if (b10 < 3) {
                            float f75 = pow;
                            float f76 = f7;
                            float c11 = c1.c((float) Math.hypot(fArr14[i31], fArr13[i31]), AndroidUtilities.dp(200.0f), 1.0f, f76);
                            float f77 = ((1.0f - (f21 * f20)) * fArr12[i31]) / f76;
                            float max4 = fArr17[i31] < rectF12.top - ((float) AndroidUtilities.dp(70.0f)) ? Math.max(0.0f, 1.0f - (((rectF12.top - AndroidUtilities.dp(70.0f)) - fArr17[i31]) / AndroidUtilities.dp(16.0f))) * f75 : f75;
                            paint2.setAlpha((int) (max4 * 255.0f));
                            canvas2.save();
                            float f78 = max4;
                            canvas2.rotate((float) Math.toDegrees(Math.atan2(fArr13[i31], fArr14[i31])), fArr18[i31], fArr17[i31]);
                            float f79 = fArr18[i31];
                            float f80 = f77 * c11;
                            float f81 = fArr17[i31];
                            rectF13.set(f79 - f80, f81 - f77, f79 + f80, f81 + f77);
                            canvas2.drawOval(rectF13, paint2);
                            canvas2.restore();
                            if (bArr[i31] == 4) {
                                paint2.setAlpha((int) (f78 * 36.0f));
                                canvas2.drawCircle(fArr18[i31], fArr17[i31], f77 * 2.2f, paint2);
                            }
                            f24 = f68;
                            rectF5 = rectF12;
                        } else {
                            float f82 = pow;
                            if (zArr[i31]) {
                                float f83 = fArr18[i31] - fArr16[i31];
                                float f84 = fArr17[i31] - fArr15[i31];
                                float sqrt = (float) Math.sqrt((f84 * f84) + (f83 * f83));
                                float f85 = fArr10[i31] / fArr11[i31];
                                if (f85 < 0.08f) {
                                    pow2 = f85 / 0.08f;
                                    f24 = f68;
                                } else {
                                    f24 = f68;
                                    pow2 = (float) Math.pow(org.telegram.messenger.g0.x(f85, 0.08f, 0.92f, 1.0f), 0.550000011920929d);
                                }
                                float exp = fArr9[i31] * ((float) Math.exp((-sqrt) / AndroidUtilities.dp(44.0f))) * pow2;
                                float f86 = fArr17[i31];
                                if (f86 < dp11) {
                                    f25 = 1.0f;
                                    exp *= Math.max(0.0f, 1.0f - ((dp11 - f86) / AndroidUtilities.dp(16.0f)));
                                } else {
                                    f25 = 1.0f;
                                }
                                float min4 = (f25 - (Math.min(f25, sqrt / AndroidUtilities.dp(70.0f)) * f20)) * (fArr12[i31] / f7);
                                float f87 = exp;
                                float hypot = (float) Math.hypot(fArr14[i31], fArr13[i31]);
                                float f88 = fArr18[i31];
                                float f89 = fArr17[i31];
                                if (fArr[i31] <= 0.0f || hypot <= 1.0f) {
                                    f26 = f87;
                                    rectF5 = rectF12;
                                } else {
                                    f26 = f87;
                                    rectF5 = rectF12;
                                    float dp12 = AndroidUtilities.dp(3.0f) * ((float) Math.sin((fArr10[i31] * fArr[i31]) + fArr2[i31]));
                                    f88 = a1.g.d(-fArr13[i31], hypot, dp12, f88);
                                    f89 = a1.g.d(fArr14[i31], hypot, dp12, f89);
                                }
                                paint2.setAlpha((int) (f26 * 255.0f));
                                float min5 = Math.min(1.8f, (hypot / AndroidUtilities.dp(220.0f)) + 1.0f);
                                canvas2.save();
                                canvas2.rotate((float) Math.toDegrees(Math.atan2(fArr13[i31], fArr14[i31])), f88, f89);
                                float f90 = min5 * min4;
                                rectF13.set(f88 - f90, f89 - min4, f90 + f88, f89 + min4);
                                canvas2.drawOval(rectF13, paint2);
                                canvas2.restore();
                                if (bArr[i31] == 1) {
                                    paint2.setAlpha((int) (f26 * 36.0f));
                                    canvas2.drawCircle(f88, f89, min4 * 2.2f, paint2);
                                }
                            } else {
                                f24 = f68;
                                rectF5 = rectF12;
                                canvas2.drawCircle(fArr18[i31], fArr17[i31], b10 == 1 ? f74 * f7 : f74, paint2);
                                if (bArr[i31] == 1) {
                                    paint2.setAlpha((int) (f82 * 36.0f));
                                    canvas2.drawCircle(fArr18[i31], fArr17[i31], f74 * 4.4f, paint2);
                                }
                            }
                            i31--;
                            paint = paint2;
                            f66 = f20;
                            f68 = f24;
                            rectF12 = rectF5;
                            rectF3 = rectF4;
                            f67 = f19;
                            f18 = 0.12f;
                        }
                    }
                    f19 = f67;
                    f20 = f66;
                    fArr18[i31] = (fArr14[i31] * f68) + fArr18[i31];
                    fArr17[i31] = (fArr13[i31] * f68) + fArr17[i31];
                    f21 = fArr10[i31] / fArr11[i31];
                    if (f21 >= f18) {
                    }
                    f22 = fArr17[i31];
                    if (f22 >= dp10) {
                    }
                    float f742 = ((f23 - (f21 * f19)) * fArr12[i31]) / f7;
                    paint2 = paint;
                    paint2.setColor(-1);
                    paint2.setAlpha((int) (pow * 255.0f));
                    b10 = bArr[i31];
                    RectF rectF132 = t0Var.V5;
                    if (b10 < 3) {
                    }
                }
                i31--;
                paint = paint2;
                f66 = f20;
                f68 = f24;
                rectF12 = rectF5;
                rectF3 = rectF4;
                f67 = f19;
                f18 = 0.12f;
            }
            rectF = rectF3;
            if (z12) {
                canvas2.restore();
            }
        } else {
            rectF = rectF8;
            f7 = 2.0f;
            textPaint = textPaint3;
            f10 = f33;
            rectF7.setEmpty();
        }
        if (f10 > 0.001f) {
            long currentTimeMillis2 = System.currentTimeMillis();
            long j11 = t0Var.F2;
            long max5 = j11 > 0 ? Math.max(0L, (j11 - (currentTimeMillis2 / 1000)) - 1) : -1L;
            if (max5 != t0Var.M2) {
                t0Var.M2 = max5;
                t0Var.N2 = max5 >= 0 ? LocaleController.formatString(R.string.QrNoPaidExpiresIn, String.format(Locale.US, "%d:%02d", Long.valueOf(max5 / 60), Long.valueOf(max5 % 60))) : LocaleController.getString(R.string.QrCreatingLink);
            }
            String str = t0Var.N2;
            textPaint.setTextSize(AndroidUtilities.dp(11.0f));
            float measureText3 = textPaint.measureText(str) + AndroidUtilities.dp(11.0f) + AndroidUtilities.dp(11.0f);
            float dp13 = AndroidUtilities.dp(22.0f);
            float o11 = t0Var.o();
            float f91 = i10;
            float f92 = dp13 / f7;
            RectF rectF14 = rectF;
            rectF14.set((f91 - measureText3) / f7, o11 - f92, (f91 + measureText3) / f7, o11 + f92);
            t0Var.A6 = true;
            float f93 = f10;
            t0Var.J(canvas2, rectF14, f92, f93);
            t0Var.A6 = false;
            textPaint.setColor(a(f93, -218103809));
            canvas2.drawText(str, rectF14.left + AndroidUtilities.dp(11.0f), o11 + AndroidUtilities.dp(4.0f), textPaint);
            if (t0Var.F2 > 0) {
                t0Var.postInvalidateDelayed(1005 - (currentTimeMillis2 % 1000));
            }
        }
    }

    public final void B0() {
        u3.c cVar;
        i0 i0Var;
        if (this.d2 || (cVar = this.c) == null || (i0Var = ((f0) cVar.a).e) == null) {
            return;
        }
        i0Var.f();
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
            if (t.a(canvas, rectF, f7, this.A6 ? 1 : this.B6 ? 2 : 0, f10)) {
                return;
            }
        }
        int i14 = this.C6;
        SweepGradient[] sweepGradientArr = this.D6;
        int i15 = 4;
        float[][] fArr2 = v0.a;
        if (i14 != 1) {
            this.C6 = 1;
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
        int i25 = this.A6 ? i23 : this.B6 ? 2 : 0;
        float[] fArr5 = fArr2[i25];
        float f18 = this.E6;
        float[] fArr6 = v0.b;
        float f19 = f18 * fArr6[0];
        float f20 = (this.F6 * fArr6[i23]) / 100.0f;
        float dpf2 = AndroidUtilities.dpf2(fArr5[8]);
        if (dpf2 != 0.0f) {
            rectF2 = this.d7;
            rectF2.set(rectF);
            rectF2.inset(dpf2, dpf2);
            if (path2 != null) {
                float width = rectF2.width() / Math.max(1.0f, rectF.width());
                float height = rectF2.height() / Math.max(1.0f, rectF.height());
                float centerX = rectF.centerX();
                float centerY = rectF.centerY();
                i10 = i25;
                Matrix matrix = this.X6;
                matrix.setScale(width, height, centerX, centerY);
                Path path3 = this.Y6;
                path2.transform(matrix, path3);
                path2 = path3;
            } else {
                i10 = i25;
            }
            f11 = Math.max(0.0f, f7 - dpf2);
        } else {
            i10 = i25;
            rectF2 = rectF;
            f11 = f7;
        }
        Matrix matrix2 = this.e7;
        matrix2.setRotate(f19);
        matrix2.postScale(rectF2.width() / Math.max(1.0f, rectF2.height()), 1.0f);
        matrix2.postTranslate(rectF2.centerX(), rectF2.centerY());
        float dpf22 = AndroidUtilities.dpf2(fArr5[i24]);
        if (dpf22 > 0.05f) {
            SweepGradient sweepGradient = sweepGradientArr[i10];
            sweepGradient.setLocalMatrix(matrix2);
            Paint paint = this.A1;
            paint.setShader(sweepGradient);
            paint.setColor(-1);
            paint.setAlpha((int) (f10 * 255.0f));
            if (path2 == null) {
                paint.setStrokeWidth(dpf22);
                RectF rectF3 = this.W5;
                rectF3.set(rectF2);
                float f21 = (-dpf22) / 2.0f;
                rectF3.inset(f21, f21);
                float f22 = (dpf22 / 2.0f) + f11;
                canvas.drawRoundRect(rectF3, f22, f22, paint);
            } else {
                canvas.save();
                u.b(canvas, path2);
                paint.setStrokeWidth(dpf22 * 2.0f);
                canvas.drawPath(path2, paint);
                canvas.restore();
            }
            paint.setShader(null);
            paint.setAlpha(255);
        }
        double radians2 = Math.toRadians(f19);
        float f23 = (float) (-Math.sin(radians2));
        float cos = (float) Math.cos(radians2);
        float dpf23 = AndroidUtilities.dpf2(fArr5[0]);
        float dpf24 = AndroidUtilities.dpf2(fArr5[2]);
        float f24 = this.B6 ? 0.0f : this.c6 * ((fArr6[21] * 1.25f) / 100.0f);
        if (f24 <= 0.0f || !this.y3) {
            fArr = fArr2;
            f12 = 0.0f;
        } else {
            fArr = fArr2;
            f12 = b1(rectF2.centerX(), rectF2.top, getWidth(), getHeight());
        }
        float b12 = (f24 <= 0.0f || !this.y3) ? 0.0f : b1(rectF2.centerX(), rectF2.bottom, getWidth(), getHeight());
        float min = Math.min(1.0f, ((f12 * f24) + 1.0f) * (f20 + 1.0f) * (fArr5[i23] / 100.0f));
        float min2 = Math.min(1.0f, ((f24 * b12) + 1.0f) * (1.0f - f20) * (fArr5[3] / 100.0f));
        int i26 = Build.VERSION.SDK_INT >= 29 ? i23 : 0;
        int i27 = 0;
        for (int i28 = 2; i27 < i28; i28 = 2) {
            float f25 = i27 == 0 ? dpf23 : -dpf24;
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
                Path path4 = this.a7;
                f14 = min;
                Path path5 = this.b7;
                if (path2 == null) {
                    f15 = min2;
                    f16 = f23;
                    float min3 = Math.min(f11, Math.min(rectF2.width(), rectF2.height()) / 2.0f);
                    path4.rewind();
                    Path.Direction direction = Path.Direction.CW;
                    path4.addRoundRect(rectF2, min3, min3, direction);
                    f13 = f11;
                    RectF rectF4 = this.Z6;
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
                    int i29 = this.c7;
                    paint2.setColor(Color.rgb(Math.max(0, Math.min(255, Math.round(((Color.red(i29) - 255) * f27) + 255.0f))), Math.max(0, Math.min(255, Math.round(((Color.green(i29) - 255) * f27) + 255.0f))), Math.max(0, Math.min(255, Math.round(((Color.blue(i29) - 255) * f27) + 255.0f)))));
                    paint2.setAlpha((int) (f26 * 255.0f * f10));
                    i12 = i23;
                } else {
                    int round = Math.round(Math.max(0.0f, Math.min(1.0f, f26)) * 255.0f);
                    paint2.setColor(round | (round << 16) | (-16777216) | (round << 8));
                    paint2.setAlpha((int) (f10 * 255.0f));
                    i12 = i23;
                    u.i(paint2, i12);
                }
                canvas.drawPath(path4, paint2);
                if (i11 != 0) {
                    u.i(paint2, 0);
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

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0054, code lost:
    
        if (r8 != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(Canvas canvas, q0 q0Var, int i10, float f7, float f10, float f11, float f12, float f13) {
        float f14;
        Drawable drawable = q0Var.b[i10];
        if (drawable == null || f12 <= 0.01f) {
            return;
        }
        boolean z10 = drawable instanceof r5;
        Bitmap V = z10 ? V((r5) drawable) : null;
        boolean z11 = false;
        if (!z10 ? !(drawable instanceof Emoji.EmojiDrawable) || ((Emoji.EmojiDrawable) drawable).isLoaded() : V != null) {
            z11 = true;
        }
        long[] jArr = q0Var.y;
        if (!this.S2) {
            if (jArr != null && i10 < jArr.length) {
                if (jArr[i10] != 1) {
                    if (this.T4) {
                        if (z11) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (jArr[i10] == 0) {
                                jArr[i10] = elapsedRealtime;
                            }
                            f14 = Utilities.clamp01(((elapsedRealtime - jArr[i10]) - b(f13)) / 380.0f);
                        }
                    } else if (this.U2 && z11) {
                        jArr[i10] = 1;
                    }
                }
                if (f14 <= 0.0f) {
                    return;
                }
                float A = k3.A((float) Math.sin((this.M3 * 1.3f) + f11), 0.03f, 1.0f, k3.A(this.p0, 0.08f, 1.0f, (this.o0 + 1.0f) * (f14 < 1.0f ? h(f14) : 1.0f) * f12 * this.l0));
                int round = Math.round(f7 / 2.0f);
                PorterDuffColorFilter[] porterDuffColorFilterArr = N9;
                if (V == null) {
                    canvas.save();
                    canvas.translate(this.J3, this.K3);
                    canvas.rotate(f10 + this.n0);
                    canvas.scale(A, A);
                    int i11 = -round;
                    drawable.setBounds(i11, i11, round, round);
                    drawable.setAlpha((int) (this.m0 * 255.0f));
                    float f15 = this.p0;
                    if (r.d(drawable)) {
                        r.b(canvas, drawable);
                    } else {
                        if (f15 > 0.02f) {
                            drawable.setColorFilter(porterDuffColorFilterArr[Math.min(8, Math.round(f15 * 8.0f))]);
                        }
                        drawable.draw(canvas);
                        if (f15 > 0.02f) {
                            drawable.setColorFilter(null);
                        }
                    }
                    drawable.setAlpha(255);
                    canvas.restore();
                    return;
                }
                float f16 = round * A;
                canvas.save();
                canvas.translate(this.J3, this.K3);
                canvas.rotate(f10 + this.n0);
                float f17 = -f16;
                RectF rectF = this.Q4;
                rectF.set(f17, f17, f16, f16);
                if (r.d(drawable)) {
                    int i12 = (int) (this.m0 * 255.0f);
                    Paint paint = this.P4;
                    paint.setAlpha(i12);
                    canvas.drawBitmap(V, (Rect) null, rectF, paint);
                } else {
                    int i13 = (int) (this.m0 * 255.0f);
                    Paint paint2 = this.N4;
                    paint2.setAlpha(i13);
                    canvas.drawBitmap(V, (Rect) null, rectF, paint2);
                    float f18 = this.p0;
                    if (f18 > 0.02f) {
                        PorterDuffColorFilter porterDuffColorFilter = porterDuffColorFilterArr[Math.min(8, Math.round(f18 * 8.0f))];
                        Paint paint3 = this.O4;
                        paint3.setColorFilter(porterDuffColorFilter);
                        paint3.setAlpha((int) (this.m0 * 255.0f));
                        canvas.drawBitmap(V, (Rect) null, rectF, paint3);
                    }
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

    public final void E(Canvas canvas, int i10, int i11, q0 q0Var, q0 q0Var2, float f7, boolean z10, boolean z11) {
        float f10;
        int i12;
        float f11;
        boolean z12;
        float f12;
        float f13;
        int i13;
        int i14;
        t0 t0Var = this;
        q0 q0Var3 = q0Var;
        q0 q0Var4 = q0Var2;
        t0Var.X(q0Var3);
        t0Var.X(q0Var4);
        float dp = AndroidUtilities.dp(86.0f);
        float dp2 = AndroidUtilities.dp(70.0f);
        float dp3 = AndroidUtilities.dp(90.0f) * 1.3f;
        float f14 = t0Var.K + t0Var.N;
        float f15 = t0Var.L + t0Var.O;
        float f16 = -dp3;
        boolean z13 = true;
        int floor = ((int) Math.floor((f16 - f15) / dp2)) - 1;
        int ceil = ((int) Math.ceil(((i11 + dp3) - f15) / dp2)) + 1;
        AndroidUtilities.dp(24.0f);
        int i15 = floor;
        while (i15 <= ceil) {
            int i16 = i15 & 1;
            float f17 = i16 == 0 ? 0.0f : dp / 2.0f;
            boolean z14 = z13;
            int floor2 = ((int) Math.floor(((f16 - f14) - f17) / dp)) - 1;
            int i17 = i10;
            float f18 = dp3;
            int ceil2 = ((int) Math.ceil((((i17 + dp3) - f14) - f17) / dp)) + 1;
            while (floor2 <= ceil2) {
                float f19 = dp2;
                int i18 = ceil2;
                double u02 = u0(i15, floor2);
                if (c0(53.1d * u02) < 0.2f) {
                    f10 = f14;
                    i14 = floor2;
                    i12 = ceil;
                    i13 = i15;
                    f12 = f17;
                    f11 = dp;
                    z12 = z14;
                    f13 = f16;
                } else {
                    t0Var.G0(u02, 3.0f, 10.0f);
                    float f20 = f16;
                    float f21 = (float) (2.0d * u02 * 3.141592653589793d);
                    f10 = f14;
                    float c10 = t0Var.L4 + r4.c.c(floor2, dp, f17, f14);
                    float sin = (((float) Math.sin((t0Var.M3 * 0.45f) + f21)) * AndroidUtilities.dp(3.0f)) + (i15 * f19) + f15 + t0Var.M4;
                    boolean z15 = i16 == 0 ? z14 : false;
                    i12 = ceil;
                    float f22 = (float) u02;
                    float A = k3.A(f22, 0.16f, 0.92f, AndroidUtilities.dp(38.0f) * (z15 ? 1.3f : 0.9f));
                    f11 = dp;
                    z12 = z14;
                    f12 = f17;
                    f13 = f20;
                    int i19 = floor2;
                    i13 = i15;
                    i14 = i19;
                    if (J0(c10, sin, A, i17, i11, 0, i15, i19, (Math.max(0.0f, (A / AndroidUtilities.dp(24.0f)) - 1.0f) * 0.8f) + 1.0f)) {
                        if (z15) {
                            A *= 0.9f;
                        }
                        float f23 = A;
                        float sin2 = (((float) Math.sin((this.M3 * 0.3f) + f21)) * 4.0f) + ((f22 - 0.5f) * 26.0f);
                        float c02 = c0(59.3d * u02) * 0.3f;
                        int i20 = (i14 - ((i13 - i16) / 2)) - i13;
                        int length = q0Var4.b.length;
                        int i21 = ((i20 % length) + length) % length;
                        float c03 = c0(71.9d * u02);
                        if (q0Var3 == null) {
                            D(canvas, q0Var4, i21, f23, sin2, f21 * 2.0f, e1(z10, z11, f7 - c02), c03);
                        } else {
                            q0 q0Var5 = q0Var4;
                            Drawable[] drawableArr = q0Var3.b;
                            int length2 = drawableArr.length;
                            int i22 = ((i20 % length2) + length2) % length2;
                            if (drawableArr[i22] == q0Var5.b[i21]) {
                                D(canvas, q0Var5, i21, f23, sin2, f21 * 2.0f, 1.0f, c03);
                            } else {
                                float f24 = f21 * 2.0f;
                                float f25 = f7 - c02;
                                D(canvas, q0Var3, i22, f23, sin2, f24, e1(z12, false, f25), c03);
                                D(canvas, q0Var2, i21, f23, sin2, f24, e1(false, false, f25), c03);
                            }
                        }
                    }
                }
                floor2 = i14 + 1;
                t0Var = this;
                i17 = i10;
                q0Var3 = q0Var;
                q0Var4 = q0Var2;
                i15 = i13;
                f16 = f13;
                ceil2 = i18;
                f17 = f12;
                f14 = f10;
                ceil = i12;
                dp = f11;
                z14 = z12;
                dp2 = f19;
            }
            i15++;
            t0Var = this;
            q0Var3 = q0Var;
            q0Var4 = q0Var2;
            z13 = z14;
            dp2 = dp2;
            dp3 = f18;
        }
    }

    public final void E0(q0 q0Var, Bitmap bitmap) {
        q0Var.e = bitmap;
        if (bitmap != null) {
            if (v0.b[35] > 0.5f) {
                Y(bitmap);
            }
            x0(q0Var);
        }
        q0Var.g = AnimationUtils.currentAnimationTimeMillis();
        this.f2 = bitmap;
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x075e  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x07e9  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x081e  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x08a3  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0802  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x076a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F(Canvas canvas, int i10, int i11, q0 q0Var, boolean z10, boolean z11, float f7) {
        long[] jArr;
        float f10;
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        float[] fArr4;
        float[] fArr5;
        float f11;
        float f12;
        char c10;
        float f13;
        float f14;
        float f15;
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
        float f22;
        boolean[] zArr;
        long[] jArr2;
        long[] jArr3;
        float f23;
        float f24;
        Paint paint;
        float f25;
        Bitmap bitmap;
        Paint paint2;
        int i12;
        float f26;
        int i13;
        float f27;
        float f28;
        Paint paint3;
        float f29;
        t0 t0Var = this;
        if (q0Var != null) {
            Paint paint4 = q0Var.i;
            Paint paint5 = q0Var.v;
            int i14 = q0Var.a;
            if (i14 == 0) {
                return;
            }
            float f30 = t0Var.v3;
            if (i14 == 1) {
                t0Var.E(canvas, i10, i11, null, q0Var, f7, z10, z11);
                return;
            }
            int i15 = i10;
            float f31 = t0Var.K + t0Var.N;
            float f32 = t0Var.L + t0Var.O;
            float dp = AndroidUtilities.dp(90.0f) * 1.3f;
            float dp2 = AndroidUtilities.dp(170.0f);
            float dp3 = AndroidUtilities.dp(150.0f);
            float dp4 = AndroidUtilities.dp(60.0f) + dp;
            boolean z12 = true;
            t0Var.K4 = 0;
            float f33 = -dp4;
            int floor = ((int) Math.floor((f33 - f32) / dp3)) - 1;
            float f34 = i11;
            int ceil = ((int) Math.ceil(((f34 + dp4) - f32) / dp3)) + 1;
            int i16 = floor;
            while (true) {
                jArr = t0Var.J4;
                f10 = f34;
                fArr = t0Var.H4;
                fArr2 = t0Var.G4;
                fArr3 = t0Var.F4;
                fArr4 = t0Var.E4;
                float f35 = f33;
                fArr5 = t0Var.I4;
                f11 = 0.0f;
                f12 = 0.5f;
                c10 = 0;
                if (i16 > ceil) {
                    f13 = 2.0f;
                    break;
                }
                f13 = 2.0f;
                if (t0Var.K4 >= 96) {
                    break;
                }
                float f36 = (i16 & 1) == 0 ? 0.0f : dp2 / 2.0f;
                int floor2 = ((int) Math.floor(((f35 - f31) - f36) / dp2)) - 1;
                int ceil2 = ((int) Math.ceil((((i15 + dp4) - f31) - f36) / dp2)) + 1;
                int i17 = floor2;
                while (true) {
                    if (i17 > ceil2) {
                        i13 = ceil;
                        f27 = f31;
                        f28 = dp4;
                        paint3 = paint4;
                        f29 = dp2;
                        break;
                    }
                    i13 = ceil;
                    if (t0Var.K4 >= 96) {
                        f27 = f31;
                        f29 = dp2;
                        f28 = dp4;
                        paint3 = paint4;
                        break;
                    }
                    float f37 = dp4;
                    double u02 = u0(i16, i17);
                    t0Var.G0(u02, 5.0f, 12.0f);
                    float f38 = f31;
                    fArr4[t0Var.K4] = (AndroidUtilities.dp(76.0f) * (c0(u02 * 3.7d) - 0.5f)) + r4.c.c(i17, dp2, f36, f31) + t0Var.L4;
                    fArr3[t0Var.K4] = ((c0(u02 * 5.3d) - 0.5f) * AndroidUtilities.dp(64.0f)) + (i16 * dp3) + f32 + t0Var.M4;
                    fArr2[t0Var.K4] = (c0(u02 * 11.9d) * AndroidUtilities.dp(32.0f)) + AndroidUtilities.dp(62.0f);
                    fArr[t0Var.K4] = (c0(17.3d * u02) - 0.5f) * 22.0f;
                    int i18 = t0Var.K4;
                    fArr5[i18] = (float) u02;
                    jArr[i18] = (i17 & 4294967295L) ^ (i16 << 32);
                    t0Var.K4 = i18 + 1;
                    i17++;
                    dp2 = dp2;
                    paint4 = paint4;
                    ceil = i13;
                    dp4 = f37;
                    f31 = f38;
                }
                i16++;
                dp2 = f29;
                f34 = f10;
                f33 = f35;
                paint4 = paint3;
                ceil = i13;
                dp4 = f28;
                f31 = f27;
            }
            float f39 = f31;
            Paint paint6 = paint4;
            t0Var.X(q0Var);
            t0Var.Z(q0Var);
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            Bitmap bitmap2 = q0Var.e;
            Bitmap bitmap3 = bitmap2 != null ? bitmap2 : q0Var.f;
            float clamp01 = (bitmap2 == null || q0Var.f == null) ? 1.0f : Utilities.clamp01((currentAnimationTimeMillis - q0Var.g) / 150.0f);
            if (bitmap3 != null) {
                float width = bitmap3.getWidth() / f13;
                AndroidUtilities.dp(44.0f);
                AndroidUtilities.dp(38.0f);
                AndroidUtilities.dp(17.0f);
                int i19 = q0Var.r;
                t0Var.e4 = 0;
                float f40 = 1.0f;
                float f41 = 7.0f;
                if (t0Var.j4 != i19 || t0Var.f4 == null) {
                    t0Var.j4 = i19;
                    f14 = 0.55f;
                    Random random = new Random((i19 * 7919) + 20973);
                    float dp5 = AndroidUtilities.dp(300.0f);
                    int round = Math.round(33.46154f);
                    t0Var.f4 = new float[round];
                    t0Var.g4 = new float[round];
                    t0Var.h4 = new float[round];
                    t0Var.i4 = 0;
                    int i20 = 0;
                    while (i20 < round) {
                        float nextFloat = random.nextFloat();
                        float dp6 = ((((((nextFloat * 0.75f) * nextFloat) + 0.55f) * (AndroidUtilities.dp(21.0f) * 1.1f)) / f13) * 1.25f) + AndroidUtilities.dp(f41);
                        int i21 = i20 + 12;
                        float f42 = 0.0f;
                        float f43 = -3.4028235E38f;
                        int i22 = 0;
                        f18 = 0.35f;
                        float f44 = 0.0f;
                        while (i22 < i21) {
                            float nextFloat2 = random.nextFloat() * dp5;
                            float nextFloat3 = random.nextFloat() * dp5;
                            int i23 = i21;
                            float f45 = Float.MAX_VALUE;
                            int i24 = i22;
                            float f46 = f41;
                            int i25 = 0;
                            while (i25 < t0Var.i4) {
                                float abs = Math.abs(nextFloat2 - t0Var.f4[i25]);
                                float abs2 = Math.abs(nextFloat3 - t0Var.g4[i25]);
                                float f47 = dp5 / f13;
                                if (abs > f47) {
                                    abs = dp5 - abs;
                                }
                                float f48 = abs;
                                if (abs2 > f47) {
                                    f19 = dp5;
                                    f20 = dp5 - abs2;
                                } else {
                                    f19 = dp5;
                                    f20 = abs2;
                                }
                                int i26 = round;
                                float f49 = t0Var.h4[i25];
                                float f50 = width;
                                f45 = Math.min(f45, ((((float) Math.hypot(f48, f20)) - dp6) - (((((((f49 * 0.75f) * f49) + 0.55f) * (AndroidUtilities.dp(21.0f) * 1.1f)) / f13) * 1.25f) + AndroidUtilities.dp(f46))) - ((nextFloat <= 0.7f || f49 <= 0.7f) ? 0.0f : AndroidUtilities.dp(10.0f)));
                                i25++;
                                random = random;
                                dp5 = f19;
                                round = i26;
                                width = f50;
                                i20 = i20;
                            }
                            float f51 = dp5;
                            int i27 = round;
                            float f52 = width;
                            int i28 = i20;
                            Random random2 = random;
                            if (f45 > f43) {
                                f43 = f45;
                                f44 = nextFloat2;
                                f42 = nextFloat3;
                            }
                            random = random2;
                            f41 = f46;
                            dp5 = f51;
                            round = i27;
                            width = f52;
                            i20 = i28;
                            i22 = i24 + 1;
                            i21 = i23;
                        }
                        float f53 = dp5;
                        int i29 = round;
                        f16 = width;
                        int i30 = i20;
                        Random random3 = random;
                        f17 = f41;
                        if (t0Var.i4 > 0 && f43 < AndroidUtilities.dp(3.5f)) {
                            break;
                        }
                        float[] fArr10 = t0Var.f4;
                        int i31 = t0Var.i4;
                        fArr10[i31] = f44;
                        t0Var.g4[i31] = f42;
                        t0Var.h4[i31] = nextFloat;
                        t0Var.i4 = i31 + 1;
                        i20 = i30 + 1;
                        random = random3;
                        f41 = f17;
                        dp5 = f53;
                        round = i29;
                        width = f16;
                    }
                    f16 = width;
                    f17 = f41;
                } else {
                    f16 = width;
                    f17 = 7.0f;
                    f14 = 0.55f;
                }
                f18 = 0.35f;
                float dp7 = AndroidUtilities.dp(300.0f);
                float f54 = -dp;
                int floor3 = ((int) Math.floor((f54 - f32) / dp7)) - 1;
                float f55 = f10 + dp;
                int ceil3 = (int) Math.ceil((f55 - f32) / dp7);
                int floor4 = ((int) Math.floor((f54 - f39) / dp7)) - 1;
                float f56 = i15 + dp;
                int ceil4 = (int) Math.ceil((f56 - f39) / dp7);
                while (true) {
                    fArr6 = t0Var.d4;
                    float f57 = f55;
                    fArr7 = t0Var.c4;
                    fArr8 = t0Var.b4;
                    fArr9 = t0Var.a4;
                    iArr = t0Var.Z3;
                    iArr2 = t0Var.Y3;
                    if (floor3 > ceil3) {
                        break;
                    }
                    int i32 = floor4;
                    while (i32 <= ceil4) {
                        int i33 = ceil4;
                        float f58 = f54;
                        int i34 = 0;
                        while (i34 < t0Var.i4) {
                            int i35 = i34;
                            if (t0Var.e4 < 1024) {
                                float f59 = (i32 * dp7) + t0Var.f4[i35];
                                float f60 = (floor3 * dp7) + t0Var.g4[i35];
                                float f61 = f59 + f39;
                                float f62 = f60 + f32;
                                if (f61 < f58 - AndroidUtilities.dp(20.0f) || f61 > AndroidUtilities.dp(20.0f) + f56 || f62 < f58 - AndroidUtilities.dp(20.0f) || f62 > f57 + AndroidUtilities.dp(20.0f)) {
                                    i12 = i32;
                                } else {
                                    float f63 = t0Var.h4[i35];
                                    float dp8 = ((((((f63 * 0.75f) * f63) + f14) * (AndroidUtilities.dp(21.0f) * 1.1f)) / f13) * 1.25f) + AndroidUtilities.dp(f17);
                                    float dp9 = AndroidUtilities.dp(170.0f);
                                    float dp10 = AndroidUtilities.dp(150.0f);
                                    int round2 = Math.round(f60 / dp10);
                                    int i36 = round2 - 1;
                                    while (true) {
                                        i12 = i32;
                                        if (i36 > round2 + 1) {
                                            int i37 = t0Var.e4;
                                            iArr2[i37] = (floor3 * 4096) + i35;
                                            iArr[i37] = i12;
                                            fArr9[i37] = f59;
                                            fArr8[i37] = f60;
                                            fArr7[i37] = 1.0f;
                                            fArr6[i37] = f63;
                                            t0Var.e4 = i37 + 1;
                                            break;
                                        }
                                        float f64 = (i36 & 1) == 0 ? 0.0f : dp9 / f13;
                                        int round3 = Math.round((f59 - f64) / dp9);
                                        float f65 = f64;
                                        int i38 = round3 - 1;
                                        while (true) {
                                            f26 = f60;
                                            if (i38 <= round3 + 1) {
                                                double u03 = u0(i36, i38);
                                                int i39 = i38;
                                                float c02 = ((c0(u03 * 3.7d) - 0.5f) * AndroidUtilities.dp(76.0f)) + (i38 * dp9) + f65;
                                                int i40 = i36;
                                                float c03 = ((c0(u03 * 5.3d) - 0.5f) * AndroidUtilities.dp(64.0f)) + (i36 * dp10);
                                                float c04 = (c0(u03 * 11.9d) * AndroidUtilities.dp(32.0f)) + AndroidUtilities.dp(62.0f);
                                                float c05 = dp8 < 0.0f ? c04 * 0.66f : (((c0(u03 * 31.7d) * f17) + 5.0f) * AndroidUtilities.dp(1.0f)) + (c04 * f18) + dp8 + AndroidUtilities.dp(3.5f);
                                                float f66 = c02 - f59;
                                                float f67 = c03 - f26;
                                                if ((f67 * f67) + (f66 * f66) < c05 * c05) {
                                                    break;
                                                }
                                                i38 = i39 + 1;
                                                f60 = f26;
                                                i36 = i40;
                                            }
                                        }
                                        i36++;
                                        i32 = i12;
                                        f60 = f26;
                                    }
                                }
                                i34 = i35 + 1;
                                i32 = i12;
                            }
                        }
                        i32++;
                        ceil4 = i33;
                        f54 = f58;
                    }
                    floor3++;
                    f55 = f57;
                }
                int i41 = 0;
                while (i41 < t0Var.e4) {
                    int i42 = iArr2[i41];
                    int i43 = iArr[i41];
                    double u04 = u0(i42, i43);
                    float f68 = fArr9[i41];
                    float f69 = fArr8[i41];
                    float f70 = fArr7[i41];
                    float f71 = fArr6[i41];
                    int i44 = i41;
                    t0Var.G0(u04, f13, f17);
                    float f72 = t0Var.L4 + f68 + f39;
                    float f73 = f69 + f32 + t0Var.M4;
                    float c06 = c0(7.31d * u04);
                    float dp11 = ((f71 * 0.75f * f71) + f14) * AndroidUtilities.dp(21.0f) * 1.1f * f70;
                    float max = (Math.max(f11, (dp11 / AndroidUtilities.dp(15.0f)) - f40) * 0.8f) + f40;
                    Bitmap bitmap4 = bitmap3;
                    int[] iArr3 = iArr2;
                    float f74 = dp11;
                    f17 = 7.0f;
                    Paint paint7 = paint5;
                    float f75 = clamp01;
                    t0Var = this;
                    if (t0Var.J0(f72, f73, f74, i15, i11, 1, i42, i43, max)) {
                        float e12 = e1(z10, z11, f7 - ((q0Var.h || (z10 && t0Var.F.h)) ? t0Var.w1(t0Var.J3, t0Var.K3, i15, i11) : c0(u04 * 53.1d) * 0.3f));
                        if (e12 > 0.01f) {
                            float L0 = t0Var.L0(f40);
                            float f76 = t0Var.p0;
                            f21 = f30;
                            long j10 = (i43 & 4294967295L) ^ (i42 << 32);
                            int i45 = ((int) (((-7046029254386353131L) * j10) >>> 53)) & 2047;
                            int i46 = 0;
                            while (true) {
                                f22 = f74;
                                zArr = t0Var.y4;
                                jArr2 = t0Var.s4;
                                if (i46 >= 2048 || !zArr[i45] || jArr2[i45] == j10) {
                                    break;
                                }
                                i46++;
                                i45 = (i45 + 1) & 2047;
                                f74 = f22;
                            }
                            long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                            boolean z13 = zArr[i45];
                            float[] fArr11 = v0.b;
                            float[] fArr12 = t0Var.v4;
                            float[] fArr13 = t0Var.t4;
                            long[] jArr4 = t0Var.x4;
                            float[] fArr14 = t0Var.w4;
                            float[] fArr15 = t0Var.u4;
                            if (z13 && jArr2[i45] == j10) {
                                jArr3 = jArr2;
                                if (currentAnimationTimeMillis2 - jArr4[i45] <= 1000) {
                                    float exp = 1.0f - ((float) Math.exp((-Math.min(64.0f, r3)) / Math.max(10.0f, (((Math.abs(L0) > Math.abs(fArr15[i45]) || f76 > fArr14[i45]) ? fArr11[48] : fArr11[49]) / 3.4f) / 2.0f)));
                                    float f77 = fArr13[i45];
                                    float y3 = k3.y(L0, f77, exp, f77);
                                    fArr13[i45] = y3;
                                    float f78 = fArr15[i45];
                                    fArr15[i45] = k3.y(y3, f78, exp, f78);
                                    float f79 = fArr12[i45];
                                    float y10 = k3.y(f76, f79, exp, f79);
                                    fArr12[i45] = y10;
                                    float f80 = fArr14[i45];
                                    fArr14[i45] = k3.y(y10, f80, exp, f80);
                                    jArr4[i45] = currentAnimationTimeMillis2;
                                    f23 = fArr15[i45];
                                    float f81 = fArr14[i45];
                                    if (Math.abs(f23) <= 0.05f || f81 > 0.002f) {
                                        t0Var.invalidate();
                                    }
                                    float f82 = (t0Var.H3 * f23) + t0Var.J3;
                                    float f83 = (t0Var.I3 * f23) + t0Var.K3;
                                    f24 = t0Var.p0;
                                    float f84 = c0(61.37d * u04) * 100.0f >= fArr11[17] ? fArr11[18] / 100.0f : 1.0f;
                                    f14 = 0.55f;
                                    float pow = (float) Math.pow((Math.sin((u04 * 6.283d) + k3.A(c06, 0.55f, 0.35f, f21)) * 0.5d) + 0.5d, 2.0d);
                                    float A = (((((fArr11[43] / 100.0f) * f81) + 1.0f) * k3.A(pow, 0.1f, (0.06f * f24) + 1.0f, (t0Var.o0 + 1.0f) * (t0Var.l0 * e12))) * f22) / bitmap4.getWidth();
                                    float f85 = fArr11[44] * f81;
                                    canvas.save();
                                    canvas.translate(f82, f83);
                                    canvas.rotate(((c06 - 0.5f) * 70.0f) + t0Var.n0 + f85);
                                    canvas.scale(A, A);
                                    int i47 = (int) (((pow * 0.15f) + 0.85f) * t0Var.m0 * 255.0f * f84);
                                    if (f75 >= 1.0f) {
                                        paint = paint6;
                                        paint.setAlpha((int) ((1.0f - f75) * i47));
                                        f25 = f16;
                                        float f86 = -f25;
                                        canvas.drawBitmap(r0(q0Var, q0Var.f, z12), f86, f86, paint);
                                    } else {
                                        paint = paint6;
                                        f25 = f16;
                                    }
                                    paint.setAlpha((int) (i47 * f75));
                                    bitmap = bitmap4;
                                    float f87 = -f25;
                                    canvas.drawBitmap(r0(q0Var, bitmap, false), f87, f87, paint);
                                    if (f24 <= 0.01f) {
                                        ColorFilter colorFilter = paint7.getColorFilter();
                                        paint2 = paint7;
                                        paint2.setColorFilter(x0(q0Var));
                                        paint2.setAlpha((int) (Math.min(1.0f, (fArr11[13] * f24) / 100.0f) * 255.0f * t0Var.m0 * f75));
                                        canvas.drawBitmap(bitmap, f87, f87, paint2);
                                        paint2.setColorFilter(colorFilter);
                                        float f88 = fArr11[35];
                                        Paint paint8 = t0Var.z4;
                                        if (f88 > 0.5f && t0Var.Y(bitmap)) {
                                            paint8.setColorFilter(t0Var.A0(q0Var));
                                            paint8.setAlpha((int) (Math.min(255.0f, ((f24 * 255.0f) * fArr11[37]) / 100.0f) * t0Var.m0 * f75));
                                            canvas.drawBitmap(t0Var.S3, f87, f87, paint8);
                                        }
                                        float f89 = (t0Var.n4 * fArr11[22]) / 100.0f;
                                        if (f89 > 0.01f) {
                                            paint8.setColorFilter(t0Var.A0(q0Var));
                                            paint8.setAlpha((int) (Math.min(1.0f, f89) * 255.0f * t0Var.m0 * f75));
                                            canvas.drawBitmap(bitmap, f87, f87, paint8);
                                        }
                                    } else {
                                        paint2 = paint7;
                                    }
                                    canvas.restore();
                                    i41 = i44 + 1;
                                    bitmap3 = bitmap;
                                    paint6 = paint;
                                    paint5 = paint2;
                                    f16 = f25;
                                    f30 = f21;
                                    iArr2 = iArr3;
                                    clamp01 = f75;
                                    z12 = true;
                                    f11 = 0.0f;
                                    c10 = 0;
                                    f13 = 2.0f;
                                    f40 = 1.0f;
                                    i15 = i10;
                                }
                            } else {
                                jArr3 = jArr2;
                            }
                            zArr[i45] = z12;
                            jArr3[i45] = j10;
                            fArr15[i45] = L0;
                            fArr13[i45] = L0;
                            fArr14[i45] = f76;
                            fArr12[i45] = f76;
                            jArr4[i45] = currentAnimationTimeMillis2;
                            f23 = fArr15[i45];
                            float f812 = fArr14[i45];
                            if (Math.abs(f23) <= 0.05f) {
                            }
                            t0Var.invalidate();
                            float f822 = (t0Var.H3 * f23) + t0Var.J3;
                            float f832 = (t0Var.I3 * f23) + t0Var.K3;
                            f24 = t0Var.p0;
                            if (c0(61.37d * u04) * 100.0f >= fArr11[17]) {
                            }
                            f14 = 0.55f;
                            float pow2 = (float) Math.pow((Math.sin((u04 * 6.283d) + k3.A(c06, 0.55f, 0.35f, f21)) * 0.5d) + 0.5d, 2.0d);
                            float A2 = (((((fArr11[43] / 100.0f) * f812) + 1.0f) * k3.A(pow2, 0.1f, (0.06f * f24) + 1.0f, (t0Var.o0 + 1.0f) * (t0Var.l0 * e12))) * f22) / bitmap4.getWidth();
                            float f852 = fArr11[44] * f812;
                            canvas.save();
                            canvas.translate(f822, f832);
                            canvas.rotate(((c06 - 0.5f) * 70.0f) + t0Var.n0 + f852);
                            canvas.scale(A2, A2);
                            int i472 = (int) (((pow2 * 0.15f) + 0.85f) * t0Var.m0 * 255.0f * f84);
                            if (f75 >= 1.0f) {
                            }
                            paint.setAlpha((int) (i472 * f75));
                            bitmap = bitmap4;
                            float f872 = -f25;
                            canvas.drawBitmap(r0(q0Var, bitmap, false), f872, f872, paint);
                            if (f24 <= 0.01f) {
                            }
                            canvas.restore();
                            i41 = i44 + 1;
                            bitmap3 = bitmap;
                            paint6 = paint;
                            paint5 = paint2;
                            f16 = f25;
                            f30 = f21;
                            iArr2 = iArr3;
                            clamp01 = f75;
                            z12 = true;
                            f11 = 0.0f;
                            c10 = 0;
                            f13 = 2.0f;
                            f40 = 1.0f;
                            i15 = i10;
                        }
                    }
                    f21 = f30;
                    paint2 = paint7;
                    bitmap = bitmap4;
                    paint = paint6;
                    f25 = f16;
                    f14 = 0.55f;
                    i41 = i44 + 1;
                    bitmap3 = bitmap;
                    paint6 = paint;
                    paint5 = paint2;
                    f16 = f25;
                    f30 = f21;
                    iArr2 = iArr3;
                    clamp01 = f75;
                    z12 = true;
                    f11 = 0.0f;
                    c10 = 0;
                    f13 = 2.0f;
                    f40 = 1.0f;
                    i15 = i10;
                }
            } else {
                f14 = 0.55f;
            }
            float f90 = 255.0f;
            float f91 = 0.05f;
            r5 r5Var = q0Var.d;
            Bitmap V = r5Var != null ? t0Var.V(r5Var) : null;
            if (V == null || V.isRecycled()) {
                return;
            }
            if (q0Var.B == 0 && t0Var.U2) {
                q0Var.B = 1L;
            }
            if (q0Var.B == 0 && t0Var.T4) {
                q0Var.B = SystemClock.elapsedRealtime();
            }
            long elapsedRealtime = t0Var.S2 ? Long.MAX_VALUE : q0Var.B == 0 ? -1L : SystemClock.elapsedRealtime() - q0Var.B;
            AndroidUtilities.dp(41.0f);
            int i48 = 0;
            while (i48 < t0Var.K4) {
                int i49 = i48;
                float f92 = fArr2[i49];
                float sin = (((float) Math.sin((fArr5[i49] * 2.0f * 3.141592653589793d) + (t0Var.M3 * 0.35f))) * AndroidUtilities.dp(3.0f)) + fArr3[i49];
                long j11 = elapsedRealtime;
                float f93 = fArr4[i49];
                long j12 = jArr[i49];
                float f94 = f90;
                if (t0Var.J0(f93, sin, f92, i10, i11, 2, (int) (j12 >> 32), (int) j12, (Math.max(0.0f, (f92 / AndroidUtilities.dp(40.0f)) - 1.0f) * 0.8f) + 1.0f)) {
                    float e13 = e1(z10, z11, f7 - ((q0Var.h || (z10 && t0Var.F.h)) ? t0Var.w1(t0Var.J3, t0Var.K3, i10, i11) : c0(fArr5[i49] * 53.1d) * 0.3f));
                    if (e13 > 0.01f) {
                        float clamp012 = Utilities.clamp01((j11 - t0Var.b(fArr5[i49])) / 380.0f);
                        if (clamp012 <= 0.0f) {
                            f15 = f12;
                            i48 = i49 + 1;
                            f12 = f15;
                            elapsedRealtime = j11;
                            f90 = f94;
                            f91 = 0.05f;
                        } else {
                            float A3 = (f92 / 2.0f) * k3.A((float) Math.sin((fArr5[i49] * 12.6f) + (t0Var.M3 * 1.3f)), 0.03f, 1.0f, k3.A(t0Var.p0, f91, 1.0f, (t0Var.o0 + 1.0f) * e13 * (clamp012 < 1.0f ? h(clamp012) : 1.0f) * t0Var.l0));
                            f15 = f12;
                            float L02 = t0Var.L0(f15);
                            canvas.save();
                            canvas.translate((t0Var.H3 * L02) + t0Var.J3, (t0Var.I3 * L02) + t0Var.K3);
                            canvas.rotate(fArr[i49] + t0Var.n0);
                            float f95 = -A3;
                            RectF rectF = t0Var.D4;
                            rectF.set(f95, f95, A3, A3);
                            int i50 = (int) (t0Var.m0 * f94);
                            Paint paint9 = t0Var.B4;
                            paint9.setAlpha(i50);
                            canvas.drawBitmap(V, (Rect) null, rectF, paint9);
                            float f96 = t0Var.p0;
                            if (f96 > 0.02f) {
                                PorterDuffColorFilter porterDuffColorFilter = N9[Math.min(8, Math.round(((f96 * 8.0f) * 0.45f) / f14))];
                                Paint paint10 = t0Var.C4;
                                paint10.setColorFilter(porterDuffColorFilter);
                                paint10.setAlpha((int) (t0Var.m0 * f94));
                                canvas.drawBitmap(V, (Rect) null, rectF, paint10);
                            }
                            canvas.restore();
                            i48 = i49 + 1;
                            f12 = f15;
                            elapsedRealtime = j11;
                            f90 = f94;
                            f91 = 0.05f;
                        }
                    }
                }
                f15 = f12;
                i48 = i49 + 1;
                f12 = f15;
                elapsedRealtime = j11;
                f90 = f94;
                f91 = 0.05f;
            }
        }
    }

    public final void F0(int i10) {
        if (this.a) {
            if (i10 == 2 && !UserConfig.getInstance(this.b).isPremium()) {
                c1(0, LocaleController.getString(R.string.QrPremiumGiftsToast), LocaleController.getString(R.string.QrPremiumSubscribe));
                i0();
                return;
            }
            if (i10 == 2 && (this.h1 != i10 || this.f1 < 0.5f)) {
                AnimationUtils.currentAnimationTimeMillis();
            }
            this.h1 = i10;
            this.i1 = i10;
            this.j1 = 0.0f;
            this.l9.forceFinished(true);
            if (this.f1 > 0.5f) {
                this.d6 = AnimationUtils.currentAnimationTimeMillis();
            }
            if (this.g1 < 0.5f) {
                this.H2 = AnimationUtils.currentAnimationTimeMillis();
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
        float dp = AndroidUtilities.dp(12.0f);
        p6 p6Var = this.L0;
        float c10 = p6Var.c() + AndroidUtilities.dp(2.0f) + dp;
        float dp2 = rectF.left + AndroidUtilities.dp(8.0f);
        O(canvas, dp2, centerY, dp, i10, true);
        p6Var.u(i10);
        p6Var.setBounds((int) (dp2 + dp + AndroidUtilities.dp(2.0f)), (int) (centerY - AndroidUtilities.dp(8.0f)), (int) (dp2 + c10 + AndroidUtilities.dp(40.0f)), (int) (centerY + AndroidUtilities.dp(8.0f)));
        p6Var.draw(canvas);
    }

    public final void G0(double d, float f7, float f10) {
        float c02 = ((c0(31.7d * d) * (f10 - f7)) + f7) * AndroidUtilities.dp(1.0f);
        double c03 = (d * 6.283d) + (((((c0(43.3d * d) < 0.5f ? -1.0d : 1.0d) * 2.0d) * 3.141592653589793d) * this.M3) / ((c0(37.1d * d) * 11.0f) + 9.0f));
        this.L4 = ((float) Math.cos(c03)) * c02;
        this.M4 = c02 * ((float) Math.sin(c03));
    }

    public final void H(Canvas canvas, RectF rectF, float f7) {
        r0 r0Var = this.n;
        int f10 = r0Var != null ? i0.a.f(0.5f, r0Var.b, r0Var.c) : -12947803;
        Paint paint = this.z1;
        paint.setColor(f10 | (-16777216));
        paint.setAlpha((int) (Utilities.clamp01(f7) * 224.4f));
        canvas.drawRect(rectF, paint);
    }

    public final float H0() {
        return (Z0() - a1()) + AndroidUtilities.dp(8.0f);
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
        float D;
        int size;
        int i11;
        TLRPC.Document document;
        RadialGradient radialGradient;
        float f13;
        p5 p5Var;
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
        int i13 = this.Q7;
        if (i10 == i13) {
            if (this.T7 < this.S7) {
                float clamp01 = 1.0f - Utilities.clamp01((currentAnimationTimeMillis2 - r14) / 120.0f);
                D = 1.0f - ((1.0f - (clamp01 * clamp01)) * 0.06f);
                if (D != 1.0f) {
                    canvas2.save();
                    canvas2.scale(D, D, (f11 / 2.0f) + f7, (f12 / 2.0f) + f10);
                }
                int[] iArr = this.g2;
                e0(i10, iArr);
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
                LongSparseArray longSparseArray = this.S5;
                radialGradient = (RadialGradient) longSparseArray.get(j10);
                if (radialGradient == null) {
                    radialGradient = new RadialGradient(0.0f, 0.0f, 1.0f, new int[]{i14, i15}, (float[]) null, Shader.TileMode.CLAMP);
                    longSparseArray.put(tL_starGiftUnique.id, radialGradient);
                }
                float f19 = f12 * 0.7f;
                float max = Math.max(1.0f, f11 / f12) * f19;
                Matrix matrix = this.P5;
                matrix.setScale(max, f19);
                matrix.postTranslate(rectF.centerX(), rectF.centerY());
                radialGradient.setLocalMatrix(matrix);
                paint.setShader(radialGradient);
                f13 = this.V7;
                canvas2.drawRoundRect(rectF, f13, f13, paint);
                paint.setShader(null);
                canvas2.save();
                Path path = this.E1;
                path.rewind();
                path.addRoundRect(rectF, f13, f13, Path.Direction.CW);
                canvas2.clipPath(path);
                int i16 = iArr[2] | (-16777216);
                s0 l1 = l1(tL_starGiftUnique);
                p5Var = l1.a;
                if (p5Var != null || p5Var.f[0] == null) {
                    f14 = f13;
                    f15 = 0.7f;
                    document2 = document;
                } else {
                    canvas2.save();
                    canvas2.translate(rectF.centerX(), rectF.centerY());
                    int i17 = Build.VERSION.SDK_INT;
                    if (i17 >= 29) {
                        p5 p5Var2 = l1.a;
                        f15 = 0.7f;
                        Drawable drawable = p5Var2.f[0];
                        if (drawable != null && p5Var2.d.c == 1.0f && (drawable instanceof r5)) {
                            r5 r5Var = (r5) drawable;
                            g3 g3Var = r5Var.k;
                            if (g3Var != null) {
                                long i18 = r5Var.i();
                                document2 = document;
                                if (i18 == l1.b) {
                                    bitmap = g3Var.getBitmap();
                                    if (bitmap == null) {
                                        if (l1.c != bitmap || l1.d == null) {
                                            l1.c = bitmap;
                                            l1.d = g0.a.a(bitmap);
                                        }
                                        l1.e = i16;
                                        l1.d.setColorFilter(i17 >= 29 ? u.l(i16) : new PorterDuffColorFilter(i16, PorterDuff.Mode.SRC_IN));
                                        f14 = f13;
                                        m1.b(canvas2, 2, l1.d, bitmap, rectF.width(), rectF.height(), 1.0f);
                                        canvas2 = canvas;
                                        canvas2.restore();
                                    } else {
                                        f14 = f13;
                                        l1.a.k(Integer.valueOf(i16));
                                        canvas2 = canvas;
                                        m1.a(canvas2, 2, l1.a, rectF.width(), rectF.height(), 1.0f, 1.0f);
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
                    l1.a.k(Integer.valueOf(i16));
                    canvas2 = canvas;
                    m1.a(canvas2, 2, l1.a, rectF.width(), rectF.height(), 1.0f, 1.0f);
                    canvas2.restore();
                }
                canvas2.restore();
                paint.setColor(318767103);
                canvas2.drawRoundRect(rectF, f14, f14, paint);
                Paint paint2 = this.A1;
                paint2.setColor(1308622847);
                paint2.setStrokeWidth(Math.max(1.0f, AndroidUtilities.dpf2(0.4f)));
                RectF rectF2 = this.W5;
                rectF2.set(rectF);
                rectF2.inset(0.5f, 0.5f);
                float f20 = f14 - 0.5f;
                canvas2.drawRoundRect(rectF2, f20, f20, paint2);
                currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                i12 = this.M7;
                if (i10 == i12 || this.P7 <= 0.5f) {
                    document3 = document2;
                    if (i10 != this.R7 || (i10 == i12 && this.P7 < 0.5f)) {
                        float clamp012 = Utilities.clamp01((currentAnimationTimeMillis - this.U7) / 180.0f);
                        f16 = 1.0f - (clamp012 * clamp012);
                    } else {
                        f16 = 0.0f;
                    }
                } else {
                    document3 = document2;
                    float clamp013 = 1.0f - Utilities.clamp01((currentAnimationTimeMillis - this.T7) / 260.0f);
                    f16 = c1.z(clamp013, clamp013, clamp013, 1.0f);
                }
                if (f16 <= 0.002f) {
                    boolean z10 = i10 == this.M7 && this.P7 > 0.5f;
                    f17 = 3.0f;
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.dpf2(1.0f), AndroidUtilities.dp(4.0f), f16);
                    float dp = AndroidUtilities.dp(2.0f) * f16;
                    float min = Math.min(1.0f, z10 ? f16 * 4.0f : f16 * 3.0f);
                    rectF2.set(rectF);
                    rectF2.inset(lerp, lerp);
                    paint2.setColor(-1);
                    paint2.setAlpha((int) (min * 255.0f * (i10 == this.M7 ? (f16 * 0.3f) + f15 : 1.0f)));
                    paint2.setStrokeWidth(dp);
                    float f21 = f14 - lerp;
                    canvas2.drawRoundRect(rectF2, Math.max(0.0f, f21), Math.max(0.0f, f21), paint2);
                } else {
                    f17 = 3.0f;
                }
                if (document3 != null) {
                    r5 g02 = g0(tL_starGiftUnique.id, document3);
                    float f22 = 0.82f * f12;
                    long currentAnimationTimeMillis3 = AnimationUtils.currentAnimationTimeMillis();
                    int i19 = this.M7;
                    if (i10 == i19 && this.P7 > 0.5f) {
                        f18 = 1.0f - (((float) g1((currentAnimationTimeMillis3 - this.T7) / 1000.0f, 0.6d, 0.3d)) * 0.14f);
                    } else if (i10 == this.R7 || (i10 == i19 && this.P7 < 0.5f)) {
                        float clamp014 = Utilities.clamp01((currentAnimationTimeMillis3 - this.U7) / 180.0f);
                        f18 = ((f17 - (clamp014 * 2.0f)) * 0.14f * clamp014 * clamp014) + 0.86f;
                    } else {
                        f18 = 1.0f;
                    }
                    float f23 = (f22 * f18) / 2.0f;
                    g02.setBounds((int) (rectF.centerX() - f23), (int) (rectF.centerY() - f23), (int) (rectF.centerX() + f23), (int) (rectF.centerY() + f23));
                    g02.setAlpha(255);
                    g02.setColorFilter(null);
                    g02.draw(canvas2);
                }
                if (D == 1.0f) {
                    canvas2.restore();
                    return;
                }
                return;
            }
        }
        D = i10 == i13 ? k3.D(1.0f, (float) g1((currentAnimationTimeMillis2 - this.T7) / 1000.0f, 0.6d, 0.3d), 0.06f, 1.0f) : 1.0f;
        if (D != 1.0f) {
        }
        int[] iArr2 = this.g2;
        e0(i10, iArr2);
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
        LongSparseArray longSparseArray2 = this.S5;
        radialGradient = (RadialGradient) longSparseArray2.get(j102);
        if (radialGradient == null) {
        }
        float f192 = f12 * 0.7f;
        float max2 = Math.max(1.0f, f11 / f12) * f192;
        Matrix matrix2 = this.P5;
        matrix2.setScale(max2, f192);
        matrix2.postTranslate(rectF3.centerX(), rectF3.centerY());
        radialGradient.setLocalMatrix(matrix2);
        paint3.setShader(radialGradient);
        f13 = this.V7;
        canvas2.drawRoundRect(rectF3, f13, f13, paint3);
        paint3.setShader(null);
        canvas2.save();
        Path path2 = this.E1;
        path2.rewind();
        path2.addRoundRect(rectF3, f13, f13, Path.Direction.CW);
        canvas2.clipPath(path2);
        int i162 = iArr2[2] | (-16777216);
        s0 l12 = l1(tL_starGiftUnique);
        p5Var = l12.a;
        if (p5Var != null) {
        }
        f14 = f13;
        f15 = 0.7f;
        document2 = document;
        canvas2.restore();
        paint3.setColor(318767103);
        canvas2.drawRoundRect(rectF3, f14, f14, paint3);
        Paint paint22 = this.A1;
        paint22.setColor(1308622847);
        paint22.setStrokeWidth(Math.max(1.0f, AndroidUtilities.dpf2(0.4f)));
        RectF rectF22 = this.W5;
        rectF22.set(rectF3);
        rectF22.inset(0.5f, 0.5f);
        float f202 = f14 - 0.5f;
        canvas2.drawRoundRect(rectF22, f202, f202, paint22);
        currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        i12 = this.M7;
        if (i10 == i12) {
        }
        document3 = document2;
        if (i10 != this.R7) {
        }
        float clamp0122 = Utilities.clamp01((currentAnimationTimeMillis - this.U7) / 180.0f);
        f16 = 1.0f - (clamp0122 * clamp0122);
        if (f16 <= 0.002f) {
        }
        if (document3 != null) {
        }
        if (D == 1.0f) {
        }
    }

    public final void I0(float f7, float f10, int i10) {
        TLRPC.Document document;
        TLRPC.Document document2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.v1.get(i10);
        r0 r0Var = new r0();
        r0Var.a = 2;
        r0Var.f = i10;
        q0 q0Var = new q0();
        q0Var.a = 2;
        q0Var.q = i10;
        long j10 = tL_starGiftUnique.id;
        q0Var.r = (int) (j10 ^ (j10 >>> 32));
        ArrayList<TL_stars.StarGiftAttribute> arrayList = tL_starGiftUnique.attributes;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i11);
            i11++;
            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
            boolean z10 = starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern;
            int i12 = this.b;
            if (z10 && (document2 = ((TL_stars.starGiftAttributePattern) starGiftAttribute2).document) != null) {
                q0Var.z = document2;
                q0Var.c = r5.m(i12, 9, document2);
            } else if ((starGiftAttribute2 instanceof TL_stars.starGiftAttributeModel) && (document = ((TL_stars.starGiftAttributeModel) starGiftAttribute2).document) != null) {
                q0Var.d = r5.m(i12, 24, document);
            }
        }
        int[] iArr = this.g2;
        e0(i10, iArr);
        r0Var.b = x(iArr[0], false);
        int x10 = x(iArr[1], true);
        r0Var.c = x10;
        r0Var.d = iArr[2];
        r0Var.e = v(r0Var.b, x10);
        r0Var.h = Y0(r0Var.b);
        r0Var.g = f.j(0.5f, r0Var.b, r0Var.c);
        q0Var.j = k1(r0Var.d, r0Var.b);
        double[] dArr = {r15, 0.0d, 0.0d};
        i0.a.j(k1(r0Var.d, r0Var.b) | (-16777216), dArr);
        double min = Math.min(97.0d, dArr[0] + 20.0d);
        float[] fArr = new float[3];
        Color.colorToHSV(i0.a.b(min, dArr[1], dArr[2]), fArr);
        fArr[1] = Math.min(1.0f, fArr[1] * 1.15f);
        q0Var.s = Color.HSVToColor(fArr) | (-16777216);
        q0Var.v.setColorFilter(new PorterDuffColorFilter(q0Var.s, PorterDuff.Mode.SRC_IN));
        q0Var.t = -1;
        q0Var.A = tL_starGiftUnique;
        r5 r5Var = q0Var.c;
        if (r5Var != null) {
            r5Var.a(this);
        }
        r5 r5Var2 = q0Var.d;
        if (r5Var2 != null) {
            r5Var2.a(this);
        }
        this.I.clear();
        X0(r0Var, f7, f10);
        if (!this.e2) {
            this.o2 = j(0.03f, 0.005f, this.m2);
            this.m2 = AnimationUtils.currentAnimationTimeMillis();
        }
        setPattern(q0Var);
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
        if (this.B6) {
            float min = Math.min(0.0f, AndroidUtilities.dpf2(v0.a[2][8]));
            rectF3 = this.X5;
            rectF2 = rectF;
            rectF3.set(rectF2);
            rectF3.inset(min, min);
            f11 = f7 - min;
        } else {
            rectF2 = rectF;
            f11 = f7;
            rectF3 = rectF2;
        }
        boolean z10 = (j0(canvas) || this.X2 == null) ? false : true;
        if (z10 && this.X2 != null && this.Z2 != null) {
            float f13 = this.e3;
            Matrix matrix = this.c3;
            matrix.setScale(f13, f13);
            float f14 = (-f13) / 2.0f;
            matrix.postTranslate(f14, f14);
            this.Z2.setLocalMatrix(matrix);
            int clamp01 = (int) (Utilities.clamp01(f10) * 255.0f);
            Paint paint = this.b3;
            paint.setAlpha(clamp01);
            canvas.drawRoundRect(rectF3, f11, f11, paint);
            paint.setAlpha(255);
        }
        Path path = this.E1;
        path.rewind();
        path.addRoundRect(rectF3, f11, f11, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        float[] fArr = v0.b;
        if (z10) {
            f12 = 0.0f;
            c10 = '\t';
            c11 = 3;
        } else if (u.f() && j0(canvas)) {
            f12 = 0.0f;
            if (f10 < 1.0f) {
                canvas.saveLayerAlpha(rectF3, (int) (f10 * 255.0f));
            }
            if (!this.t6 || this.s6 <= 0.004f) {
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
                if (this.u6 == null) {
                    this.u6 = android.support.v4.media.session.x.d("qrSheetLift");
                }
                float round = Math.round(this.s6 * 50.0f) / 50.0f;
                c10 = '\t';
                r0 r0Var = this.n;
                int i10 = r0Var != null ? r0Var.b : 0;
                if (round == this.v6 && this.w6 == 1 && this.x6 == i10) {
                    c11 = 3;
                } else {
                    this.v6 = round;
                    this.w6 = 1;
                    this.x6 = i10;
                    Object obj2 = this.u6;
                    c11 = 3;
                    float max = (fArr[10] / 100.0f) * round * ((float) Math.max(0.0d, Math.min(1.0d, (0.85d - (r0Var != null ? i0.a.h(r0Var.b) : 0.3d)) / 0.45d)));
                    float d = a1.g.d(fArr[11], 100.0f, round, 1.0f);
                    float f15 = ((0.5f - (d * 0.5f)) + max) * 255.0f;
                    u.k(obj2, Math.max(0.5f, AndroidUtilities.dpf2(AndroidUtilities.lerp(fArr[2], fArr[12], round)) / 8.0f), new float[]{d, 0.0f, 0.0f, 0.0f, f15, 0.0f, d, 0.0f, 0.0f, f15, 0.0f, 0.0f, d, 0.0f, f15, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                }
                Canvas a2 = u.a((getWidth() + 7) / 8, (getHeight() + 7) / 8, this.u6);
                a2.scale(0.125f, 0.125f);
                u.c(a2, this.G1);
                u.d(this.u6);
                u.c(canvas, this.u6);
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
        int i11 = this.U8;
        if (i11 == 0) {
            i11 = g((fArr[c11] + (this.t6 ? fArr[c10] * this.s6 : f12)) / 100.0f, 16777215);
        }
        Paint paint2 = this.z1;
        paint2.setColor(i11);
        paint2.setAlpha((int) (Color.alpha(paint2.getColor()) * f10));
        canvas.drawRect(rectF3, paint2);
        t.b(canvas, rectF3, f10);
        boolean z11 = this.t6;
        if ((((z11 || this.B6) ? f12 : (fArr[21] / 100.0f) * this.c6) > f12 || fArr[39] > f12) && this.y3 && !z11 && !this.B6) {
            int width = getWidth();
            int height = getHeight();
            float b12 = b1(rectF3.left, rectF3.centerY(), width, height);
            float b13 = b1(rectF3.centerX(), rectF3.centerY(), width, height);
            float b14 = b1(rectF3.right, rectF3.centerY(), width, height);
            if (b12 + b13 + b14 > 0.01f) {
                float f16 = ((fArr[39] * 1.25f) / 100.0f) * this.c6 * 0.1f;
                float f17 = b13 * f16 * f10;
                float f18 = f16 * b14 * f10;
                float centerX = rectF3.centerX();
                L(rectF3.left, centerX, b12 * f16 * f10, f17, canvas, rectF3);
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
        float f110;
        float f26;
        float f27;
        float dp = AndroidUtilities.dp(90.0f);
        float f28 = 1.3f * dp;
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
        p0 p0Var = this.L3;
        int i18 = p0Var.m;
        float[] fArr = p0Var.j;
        float[] fArr2 = p0Var.i;
        float[] fArr3 = p0Var.h;
        float[] fArr4 = p0Var.g;
        float[] fArr5 = p0Var.f;
        float[] fArr6 = p0Var.e;
        float[] fArr7 = p0Var.d;
        float[] fArr8 = p0Var.c;
        long[] jArr = p0Var.a;
        boolean[] zArr = p0Var.b;
        int[] iArr = p0Var.k;
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
            float f32 = this.w;
            i16 = i15;
            double max = Math.max(f32, f14 - f32);
            float f33 = this.x;
            float hypot = ((float) Math.hypot(max, Math.max(f33, f13 - f33))) + AndroidUtilities.dp(60.0f);
            float f34 = f7 - this.w;
            float f35 = f10 - this.x;
            float sqrt = (float) Math.sqrt((f35 * f35) + (f34 * f34));
            if (sqrt <= x1(this.s) * hypot) {
                if (i16 < 0) {
                    if (p0Var.m >= 3072) {
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
                                int[] iArr2 = p0Var.l;
                                f26 = f34;
                                int i21 = p0Var.m;
                                p0Var.m = i21 + 1;
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
                    fArr6[i17] = k3.t(f37, AndroidUtilities.dp(360.0f), f36, fArr6[i17]);
                    fArr5[i17] = k3.t(f38, AndroidUtilities.dp(360.0f), f36, fArr5[i17]);
                    fArr3[i17] = k3.t(f37 >= f15 ? 1.0f : -1.0f, 180.0f, f36, fArr3[i17]);
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
                float f111 = f21 - (f1(0.55f, f21, min) * 0.22f);
                float f112 = f21 - (f1(0.8f, f21, min) * 0.2f);
                if (f16 < dp || f16 > f14 - f16) {
                    if (f14 - f16 >= dp) {
                        exp = (float) Math.exp((r9 / dp) - 1.0f);
                        f24 = f14 - (dp * exp);
                    } else {
                        f23 = 1.0f;
                        if (f17 < dp || f17 > f13 - f17) {
                            if (f13 - f17 < dp) {
                                float exp2 = (float) Math.exp((r10 / dp) - 1.0f);
                                f25 = f13 - (dp * exp2);
                                f23 = Math.min(f23, exp2);
                            }
                            f110 = f1(0.08f, 0.25f, f23) * f112;
                            this.m0 = f110;
                            if (f110 <= 0.004f) {
                                return false;
                            }
                            if (f11 * f111 < AndroidUtilities.dp(10.0f)) {
                                f111 = AndroidUtilities.dp(10.0f) / Math.max(1.0f, f11);
                            }
                            float f41 = f23 * f111;
                            if (i12 != 1) {
                                f41 = Math.max(f41, Math.min(f11, AndroidUtilities.dp(9.0f)) / Math.max(1.0f, f11));
                            }
                            this.l0 = f41;
                            float f42 = (f11 * f41) / f20;
                            float clamp01 = Utilities.clamp01(Math.min(Math.min(f16 - f42, (f14 - f16) - f42), Math.min(f17 - f42, (f13 - f17) - f42)) / AndroidUtilities.dp(12.0f));
                            float f43 = (3.0f - (clamp01 * f20)) * clamp01 * clamp01 * this.m0;
                            this.m0 = f43;
                            if (f43 <= 0.004f) {
                                return false;
                            }
                            this.J3 = f16;
                            this.K3 = f17;
                            this.p0 = b1(f16, f17, i10, i11);
                            this.n4 = this.m4;
                            this.q4 = this.o4;
                            this.r4 = this.p4;
                            return true;
                        }
                        float exp3 = (float) Math.exp((f17 / dp) - 1.0f);
                        f25 = dp * exp3;
                        f23 = Math.min(f23, exp3);
                        f17 = f25;
                        f110 = f1(0.08f, 0.25f, f23) * f112;
                        this.m0 = f110;
                        if (f110 <= 0.004f) {
                        }
                    }
                } else {
                    exp = (float) Math.exp((f16 / dp) - f21);
                    f24 = dp * exp;
                }
                float f44 = f24;
                f23 = exp;
                f16 = f44;
                if (f17 < dp) {
                }
                if (f13 - f17 < dp) {
                }
                f110 = f1(0.08f, 0.25f, f23) * f112;
                this.m0 = f110;
                if (f110 <= 0.004f) {
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
        float f1112 = f21 - (f1(0.55f, f21, min2) * 0.22f);
        float f1122 = f21 - (f1(0.8f, f21, min2) * 0.2f);
        if (f16 < dp) {
        }
        if (f14 - f16 >= dp) {
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
        float dp = AndroidUtilities.dp(222.0f);
        float dp2 = AndroidUtilities.dp(46.0f);
        float dp3 = AndroidUtilities.dp(54.0f);
        AndroidUtilities.dp(8.0f);
        float f12 = this.y0 ? dp2 + dp2 : dp2 + dp3 + dp2;
        float f13 = this.f1;
        RectF rectF = this.K5;
        float dp4 = f13 > 0.5f ? (rectF.bottom + AndroidUtilities.dp(6.0f)) - f12 : rectF.top - AndroidUtilities.dp(6.0f);
        float width = (getWidth() - dp) / 2.0f;
        RectF rectF2 = this.L8;
        rectF2.set(width, dp4, dp + width, f12 + dp4);
        float f14 = this.F8;
        float f15 = this.G8;
        float clamp01 = Utilities.clamp01(this.k1);
        float lerp = AndroidUtilities.lerp(rectF.left, rectF2.left, f14);
        float lerp2 = AndroidUtilities.lerp(rectF.top, rectF2.top, f15);
        float lerp3 = AndroidUtilities.lerp(rectF.right, rectF2.right, f14);
        float lerp4 = AndroidUtilities.lerp(rectF.bottom, rectF2.bottom, f15);
        RectF rectF3 = this.K8;
        rectF3.set(lerp, lerp2, lerp3, lerp4);
        float min = Math.min(rectF3.height() / 2.0f, Math.min(rectF3.width() / 2.0f, AndroidUtilities.lerp(rectF.height() / 2.0f, AndroidUtilities.dp(22.0f), Utilities.clamp01(f15))));
        float max = Math.max(-0.25f, Math.min(1.0f, this.H8 / 9.0f)) * AndroidUtilities.dp(5.0f);
        float f16 = rectF3.left;
        float f17 = rectF3.top;
        float f18 = rectF3.right;
        float f19 = 1.0f;
        float f20 = rectF3.bottom;
        float centerX = rectF3.centerX();
        Path path = this.J8;
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
        path.cubicTo(AndroidUtilities.lerp(f22, centerX, 0.55f), f25, AndroidUtilities.lerp(f21, centerX, 0.55f), f25, f21, f20);
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
        } else if (this.X2 != null) {
            int clamp012 = (int) (Utilities.clamp01(1.0f) * 255.0f);
            Paint paint = this.a3;
            paint.setAlpha(clamp012);
            Bitmap bitmap = this.X2;
            if (bitmap != null) {
                y(canvas2, bitmap);
            }
            paint.setAlpha(255);
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
        float f27 = clamp01 / 0.3f;
        float clamp013 = 1.0f - Utilities.clamp01(f27);
        float f28 = 0.004f;
        float f29 = 0.15f;
        boolean z10 = false;
        int i11 = 1;
        if (clamp013 > 0.004f) {
            canvas2.saveLayerAlpha(rectF4, (int) (clamp013 * 255.0f));
            float clamp014 = 1.0f - (Utilities.clamp01(f27) * 0.15f);
            canvas2.scale(clamp014, clamp014, rectF.centerX(), rectF.centerY());
            this.U5 = true;
            int width2 = getWidth();
            System.currentTimeMillis();
            B(canvas2, width2);
            this.U5 = false;
            canvas2.restore();
        }
        float centerX2 = rectF3.centerX() - rectF2.centerX();
        float f30 = rectF3.top - rectF2.top;
        float f31 = 0.6f;
        if (Math.abs(this.H8) < 0.6f) {
            centerX2 = Math.round(centerX2);
            f30 = Math.round(f30);
        }
        canvas2.save();
        canvas2.translate(centerX2, f30);
        TextPaint textPaint = this.C1;
        textPaint.setSubpixelText(true);
        textPaint.setLinearText(false);
        String[] strArr = {LocaleController.getString(R.string.QrNoPaidMenuReset), LocaleController.getString(this.x0 ? R.string.QrNoPaidMenuDisableTimer : R.string.QrNoPaidMenuEnableTimer), LocaleController.getString(R.string.QrNoPaidMenuRestoreFee)};
        String[] strArr2 = {null, LocaleController.getString(this.x0 ? R.string.QrNoPaidMenuDisableTimerInfo : R.string.QrNoPaidMenuEnableTimerInfo), null};
        int i12 = 0;
        float f32 = dp4;
        while (i12 < 3) {
            RectF[] rectFArr = this.z8;
            if (i12 == i11 && this.y0) {
                rectFArr[i12].setEmpty();
                i10 = i12;
                f7 = f26;
                f10 = f28;
            } else {
                float f33 = strArr2[i12] != null ? dp3 : dp2;
                f7 = f26;
                f10 = f28;
                float f34 = f32 + f33;
                rectFArr[i12].set(rectF2.left, f32, rectF2.right, f34);
                float f110 = this.l1 > 0.5f ? f1(f29, f31, clamp01) : f1(f31, f19, clamp01);
                if (f110 <= f10) {
                    i10 = i12;
                } else {
                    M(canvas2, i12, rectFArr[i12], z10);
                    canvas2.save();
                    float f35 = (f33 / 2.0f) + f32;
                    if (i12 == 2) {
                        i10 = i12;
                        o0(canvas2, this.K1, rectF2.left + AndroidUtilities.dp(26.0f), f35, AndroidUtilities.dp(20.0f), f110);
                        canvas2 = canvas;
                    } else {
                        i10 = i12;
                        if (i10 == 0) {
                            canvas2 = canvas;
                            o0(canvas2, this.R1, rectF2.left + AndroidUtilities.dp(26.0f), f35, AndroidUtilities.dp(20.0f), f110);
                        } else {
                            canvas2 = canvas;
                            boolean z11 = this.x0;
                            Bitmap bitmap2 = z11 ? this.P8 : this.Q8;
                            if (bitmap2 != null) {
                                f11 = 26.0f;
                            } else {
                                int round = Math.round(AndroidUtilities.dp(22.4f));
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
                                    this.P8 = createBitmap;
                                } else {
                                    this.Q8 = createBitmap;
                                }
                                bitmap2 = createBitmap;
                            }
                            float dp5 = rectF2.left + AndroidUtilities.dp(f11);
                            Paint paint6 = this.R8;
                            paint6.setColor(-1);
                            paint6.setAlpha((int) (Color.alpha(-1) * f110));
                            canvas2.drawBitmap(bitmap2, dp5 - (bitmap2.getWidth() / 2.0f), f35 - (bitmap2.getHeight() / 2.0f), paint6);
                        }
                    }
                    textPaint.setTextSize(AndroidUtilities.dp(15.0f));
                    textPaint.setColor(-1);
                    textPaint.setAlpha((int) (f110 * f7));
                    canvas2.drawText(strArr[i10], rectF2.left + AndroidUtilities.dp(52.0f), strArr2[i10] != null ? f35 - AndroidUtilities.dp(2.0f) : AndroidUtilities.dp(5.0f) + f35, textPaint);
                    if (strArr2[i10] != null) {
                        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
                        textPaint.setColor(-1493172225);
                        textPaint.setAlpha((int) (Color.alpha(-1493172225) * f110));
                        canvas2.drawText(strArr2[i10], rectF2.left + AndroidUtilities.dp(52.0f), f35 + AndroidUtilities.dp(14.0f), textPaint);
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
        if (this.X4 != null || this.W4) {
            return;
        }
        this.W4 = true;
        Utilities.globalQueue.postRunnable(new n0(this, i0.a.o(i0.a.f(0.4f, N0(), -16777216), 16), 2));
    }

    public final void L(float f7, float f10, float f11, float f12, Canvas canvas, RectF rectF) {
        float min = Math.min(f11, f12);
        float max = Math.max(f11, f12);
        Paint paint = this.b6;
        if (min > 0.002f) {
            paint.setShader(null);
            paint.setColor(g(min, 16777215));
            canvas.drawRect(f7, rectF.top, f10, rectF.bottom, paint);
        }
        float f13 = max - min;
        if (f13 > 0.002f) {
            LinearGradient linearGradient = f12 >= f11 ? this.Y5 : this.Z5;
            Matrix matrix = this.a6;
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
        float[] fArr = v0.b;
        float max = f10 / Math.max(0.3f, fArr[50]);
        if (max > 4.0f || max < -4.0f) {
            return 0.0f;
        }
        return Math.min(AndroidUtilities.dpf2(fArr[42]), (AndroidUtilities.dp(3.5f) / 2.0f) / 0.607f) * f7 * max * ((float) Math.exp((-0.5f) * max * max)) * this.r4;
    }

    public final void M(Canvas canvas, int i10, RectF rectF, boolean z10) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        boolean z11 = this.s9 == i10;
        long[] jArr = this.y9;
        if (z11 || jArr[i10] != 0) {
            float W0 = z11 ? W0(i10, currentAnimationTimeMillis) : this.z9[i10] * ((float) Math.exp((-(currentAnimationTimeMillis - jArr[i10])) / 180.0f));
            if (!z11 && W0 < 0.004f) {
                jArr[i10] = 0;
                return;
            }
            float B = k3.B(W0, 2.0f, 3.0f, W0 * W0);
            float min = Math.min(1.0f, (currentAnimationTimeMillis - this.x9[i10]) / 320.0f);
            float f7 = 1.0f - min;
            float z12 = c1.z(f7, f7, f7, 1.0f);
            if (!z11 || W0 < 0.996f || min < 1.0f) {
                invalidate();
            }
            float max = Math.max(rectF.left, Math.min(rectF.right, this.v9[i10]));
            float max2 = Math.max(rectF.top, Math.min(rectF.bottom, this.w9[i10]));
            float max3 = (float) Math.max(Math.hypot(max - rectF.left, max2 - rectF.top), Math.max(Math.hypot(max - rectF.right, max2 - rectF.top), Math.max(Math.hypot(max - rectF.left, max2 - rectF.bottom), Math.hypot(max - rectF.right, max2 - rectF.bottom))));
            int i11 = z10 ? 335544320 : 738197503;
            Paint paint = this.t9;
            paint.setColor((((int) ((i11 >>> 24) * B)) << 24) | (16777215 & i11));
            Path path = this.u9;
            path.rewind();
            if (i10 == 3 || i10 == 4 || i10 == 11) {
                path.addOval(rectF, Path.Direction.CW);
            } else if (i10 >= 6 || i10 == 5) {
                float min2 = Math.min(AndroidUtilities.dp(20.0f), rectF.height() / 2.0f);
                path.addRoundRect(rectF, min2, min2, Path.Direction.CW);
            } else {
                path.addRect(rectF, Path.Direction.CW);
            }
            canvas.save();
            canvas.clipPath(path);
            canvas.drawCircle(max, max2, Math.max(AndroidUtilities.dp(6.0f), max3 * z12), paint);
            canvas.restore();
        }
    }

    public final void M0(int i10, r0 r0Var, int i11, int i12) {
        int i13 = i10 * 7;
        int i14 = r0Var.a;
        float[] fArr = this.i3;
        if (i14 == 0 && r0Var.f == I9) {
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
        int i16 = r0Var.b;
        int[] iArr = this.k3;
        iArr[i15] = i16;
        iArr[i15 + 1] = r0Var.g;
        iArr[i15 + 2] = r0Var.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x03e8, code lost:
    
        if (r6.t8[r7] != ((r43 * 31) + r44)) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0cbf  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0d0f  */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0ab1  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0ab8  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0b91  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0be6  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0c21  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0c61  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0c70  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0c75  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0c78 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0c32  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0c17  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0c89 A[LOOP:3: B:313:0x0c85->B:315:0x0c89, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0cb7  */
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
        t0 t0Var;
        Canvas canvas2;
        float f14;
        float f15;
        RectF rectF2;
        int i14;
        int i15;
        ArrayList arrayList;
        boolean z10;
        float f16;
        float f17;
        float f18;
        RectF rectF3;
        boolean z11;
        int i16;
        int i17;
        boolean z12;
        RectF rectF4;
        int i18;
        float f19;
        float z13;
        float f20;
        boolean z14;
        float f21;
        float f22;
        q0 q0Var;
        float f23;
        float f24;
        ArrayList<TLRPC.Document> arrayList2;
        float f25;
        long j10;
        float f26;
        float f27;
        float f28;
        float lerp;
        float f29;
        int i19;
        float f30;
        float f31;
        int i20;
        int i21;
        int i22;
        float f32;
        float f33;
        int length;
        int[] iArr;
        t0 t0Var2 = this;
        float f34 = t0Var2.f1;
        if (f34 <= 0.001f) {
            return;
        }
        float clamp01 = Utilities.clamp01(f34);
        float a12 = t0Var2.a1();
        float Z0 = t0Var2.Z0();
        float f35 = Z0 - a12;
        float dp = AndroidUtilities.dp(10.0f);
        float dp2 = i10 - AndroidUtilities.dp(10.0f);
        RectF rectF5 = t0Var2.v7;
        rectF5.set(dp, f35, dp2, Z0);
        float height = (t0Var2.getHeight() - t0Var2.u3) - AndroidUtilities.dp(40.0f);
        float dp3 = AndroidUtilities.dp(10.0f) - AndroidUtilities.dp(3.0f);
        float f36 = i10;
        float f37 = f36 / 2.0f;
        float max = Math.max(dp3, AndroidUtilities.lerp(f37 - AndroidUtilities.dp(72.0f), rectF5.left, f34));
        float lerp2 = AndroidUtilities.lerp(height - AndroidUtilities.dp(20.0f), f35, f34);
        float min = Math.min(f36 - dp3, AndroidUtilities.lerp(f37 + AndroidUtilities.dp(72.0f), rectF5.right, f34));
        float lerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(20.0f) + height, Z0, clamp01);
        RectF rectF6 = t0Var2.A7;
        rectF6.set(max, lerp2, min, lerp3);
        float min2 = Math.min(rectF6.height() / 2.0f, AndroidUtilities.lerp(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(28.17f), clamp01));
        float f38 = 0.5f;
        t0Var2.B6 = clamp01 > 0.5f;
        if (clamp01 >= 0.35f) {
            f7 = 0.35f;
            if (t0Var2.f6 || t0Var2.g1 <= 0.5f) {
                f10 = 10.0f;
                rectF = rectF5;
            } else {
                t0Var2.f6 = true;
                f10 = 10.0f;
                rectF = rectF5;
                t0Var2.d6 = AnimationUtils.currentAnimationTimeMillis();
            }
        } else {
            rectF = rectF5;
            f7 = 0.35f;
            f10 = 10.0f;
        }
        if (clamp01 < 0.05f) {
            t0Var2.f6 = false;
        }
        t0Var2.s6 = clamp01;
        t0Var2.t6 = true;
        t0Var2.J(canvas, rectF6, min2, 1.0f);
        t0Var2.t6 = false;
        t0Var2.B6 = false;
        r0 r0Var = t0Var2.n;
        int i23 = r0Var != null ? r0Var.h : TLObject.FLAG_30;
        float f39 = f10;
        Paint paint = t0Var2.z1;
        paint.setColor(i23);
        paint.setAlpha((int) (Color.alpha(i23) * clamp01));
        float[][] fArr = v0.a;
        int i24 = 2;
        if (clamp01 > 0.5f) {
            float min3 = Math.min(0.0f, AndroidUtilities.dpf2(fArr[2][8]));
            RectF rectF7 = t0Var2.W5;
            rectF7.set(rectF6);
            rectF7.inset(min3, min3);
            float f40 = min2 - min3;
            canvas.drawRoundRect(rectF7, f40, f40, paint);
        } else {
            canvas.drawRoundRect(rectF6, min2, min2, paint);
        }
        float clamp012 = 1.0f - Utilities.clamp01(clamp01 / f7);
        int i25 = 3;
        Path path = t0Var2.E1;
        if (clamp012 > 0.0f) {
            canvas.save();
            path.rewind();
            path.addRoundRect(rectF6, min2, min2, Path.Direction.CW);
            canvas.clipPath(path);
            float dp4 = AndroidUtilities.dp(144.0f) / 3.0f;
            int i26 = 0;
            while (i26 < i25) {
                int i27 = i25;
                float b10 = kk.b(i26, f38, dp4, f37 - AndroidUtilities.dp(72.0f));
                Drawable drawable = t0Var2.g7[i26];
                float lerp4 = AndroidUtilities.lerp(height, height - AndroidUtilities.dp(f39), clamp01);
                float dp5 = AndroidUtilities.dp(i26 == 1 ? 24.5f : 22.0f);
                float f41 = min2;
                float f42 = clamp01 * 0.15f;
                int i28 = i26 == t0Var2.h1 ? 1 : 0;
                int i29 = i26;
                float f43 = clamp012;
                o0(canvas, drawable, b10, lerp4, k3.A(f42, i28, 1.0f, dp5), f43);
                f38 = 0.5f;
                clamp012 = f43;
                t0Var2 = this;
                min2 = f41;
                dp4 = dp4;
                i25 = i27;
                clamp01 = clamp01;
                i26 = i29 + 1;
            }
            t0Var = t0Var2;
            f11 = f38;
            f12 = clamp01;
            i12 = i25;
            i13 = 1;
            f13 = min2;
            canvas.restore();
        } else {
            f11 = 0.5f;
            f12 = clamp01;
            i12 = 3;
            f13 = min2;
            i13 = 1;
            t0Var = t0Var2;
        }
        float f44 = t0Var.z7;
        if (f44 <= 0.004f) {
            return;
        }
        int i30 = f44 < 0.999f ? i13 : 0;
        if (i30 != 0) {
            RectF rectF8 = rectF;
            int i31 = (int) (f44 * 255.0f);
            canvas2 = canvas;
            rectF2 = rectF8;
            canvas2.saveLayerAlpha(rectF8.left, f35, rectF8.right, Z0, i31);
            f14 = f35;
            f15 = Z0;
        } else {
            canvas2 = canvas;
            f14 = f35;
            f15 = Z0;
            rectF2 = rectF;
        }
        canvas2.save();
        path.rewind();
        path.addRoundRect(rectF6, f13, f13, Path.Direction.CW);
        canvas2.clipPath(path);
        int i32 = t0Var.h1 != i13 ? i13 : 0;
        if (i32 != 0) {
            canvas2.saveLayer(rectF6, null);
        }
        canvas2.save();
        canvas2.translate(0.0f, (1.0f - t0Var.z7) * AndroidUtilities.dp(14.0f));
        canvas2.translate(0.0f, -t0Var.j1);
        float dp6 = AndroidUtilities.dp(4.0f) + f14;
        int i33 = t0Var.h1;
        if (i33 == 0) {
            float width = (rectF2.width() - AndroidUtilities.dp(8.0f)) / 6.0f;
            float min4 = Math.min(width - AndroidUtilities.dp(f39), AndroidUtilities.dp(44.0f));
            int i34 = t0Var.g1 > f11 ? i13 : 0;
            float U0 = i34 != 0 ? t0Var.U0() : 1.0f;
            if (i34 != 0) {
                f27 = 1.0f;
                float f45 = 1.0f - U0;
                lerp = AndroidUtilities.lerp(0.8f, 1.0f, c1.z(f45, f45, f45, 1.0f));
                f28 = 0.8f;
            } else {
                f27 = 1.0f;
                f28 = 0.8f;
                lerp = AndroidUtilities.lerp(0.96f, 1.0f, t0Var.z7);
            }
            if (i34 != 0 && U0 < f27) {
                t0Var.invalidate();
            }
            canvas2.save();
            float centerX = rectF2.centerX();
            float f46 = t0Var.j1;
            canvas2.scale(lerp, lerp, centerX, i34 != 0 ? f46 + f15 : k3.z(f15, f14, 2.0f, f46 + f14));
            int i35 = 0;
            while (i35 < a.b.length) {
                int d12 = d1(i35);
                float f47 = f11;
                float b11 = kk.b(i35 % 6, f47, width, rectF2.left + AndroidUtilities.dp(4.0f));
                float b12 = kk.b(i35 / 6, f47, width, dp6);
                float f48 = b12 - t0Var.j1;
                float f49 = f14;
                if (f48 > i11 + width || f48 < f49 - width) {
                    f29 = dp6;
                    i19 = i32;
                    f30 = width;
                    f31 = f49;
                    i20 = i30;
                } else {
                    float max2 = Math.max(0.0f, Math.min(f39, (f48 - f49) / width));
                    float clamp013 = Utilities.clamp01(i34 != 0 ? ((420.0f * U0) - (max2 * 12.0f)) / 300.0f : (t0Var.z7 - (max2 * 0.02f)) / f28);
                    float f50 = i34 != 0 ? 0.82f : 0.85f;
                    float f51 = 1.0f - clamp013;
                    float j12 = (((1.0f - ((f51 * f51) * f51)) * (1.0f - f50)) + f50) * t0Var.j1(i35);
                    if (j12 != 1.0f) {
                        canvas2.save();
                        canvas2.scale(j12, j12, b11, b12);
                    }
                    float f52 = min4 / 2.0f;
                    f29 = dp6;
                    if (d12 == I9) {
                        i21 = -12602881;
                    } else {
                        k();
                        i21 = E9[d12];
                    }
                    int i36 = i21;
                    if (d12 == I9) {
                        i22 = -15308082;
                    } else {
                        k();
                        i22 = F9[d12];
                    }
                    int i37 = i22;
                    r0 r0Var2 = t0Var.n;
                    if (r0Var2 != null && r0Var2.a == 0) {
                        int i38 = r0Var2.f;
                    }
                    if (i35 == t0Var.v8) {
                        f33 = t0Var.x8;
                    } else if (i35 == t0Var.w8) {
                        f33 = t0Var.y8;
                    } else {
                        f32 = 0.0f;
                        paint.setColor(-1);
                        length = t0Var.s8.length;
                        iArr = a.b;
                        i19 = i32;
                        if (length != iArr.length) {
                            t0Var.s8 = new LinearGradient[iArr.length];
                            t0Var.t8 = new int[iArr.length];
                        }
                        LinearGradient[] linearGradientArr = t0Var.s8;
                        LinearGradient linearGradient = linearGradientArr[i35];
                        LinearGradient[] linearGradientArr2 = linearGradient == null ? linearGradientArr : linearGradientArr;
                        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 1.0f, 1.0f, i36, i37, Shader.TileMode.CLAMP);
                        linearGradientArr2[i35] = linearGradient2;
                        t0Var.t8[i35] = (i36 * 31) + i37;
                        linearGradient = linearGradient2;
                        float f53 = f52 * 2.0f;
                        Matrix matrix = t0Var.e7;
                        matrix.setScale(f53, f53);
                        float f54 = b11 - f52;
                        float f55 = b12 - f52;
                        matrix.postTranslate(f54, f55);
                        linearGradient.setLocalMatrix(matrix);
                        paint.setShader(linearGradient);
                        canvas2.drawCircle(b11, b12, f52, paint);
                        paint.setShader(null);
                        float max3 = Math.max(0.0f, -AndroidUtilities.dpf2(fArr[i12][8])) + 1.0f;
                        float f56 = (b11 + f52) - max3;
                        float f57 = (b12 + f52) - max3;
                        RectF rectF9 = t0Var.d7;
                        rectF9.set(f54 + max3, f55 + max3, f56, f57);
                        float f58 = f28;
                        f30 = width;
                        f31 = f49;
                        i20 = i30;
                        t0Var.u8.a(canvas, rectF9, f52 - max3, 3, 1.0f);
                        canvas2 = canvas;
                        if (f32 > 0.01f) {
                            boolean z15 = i35 == t0Var.v8;
                            float dp7 = (f52 - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(1.0f);
                            float lerp5 = z15 ? AndroidUtilities.lerp(f58, 1.0f, f32) * dp7 : AndroidUtilities.lerp(f52 - AndroidUtilities.dpf2(1.0f), dp7, f32);
                            float dp8 = AndroidUtilities.dp(2.0f);
                            if (!z15) {
                                dp8 *= f32;
                            }
                            float min5 = z15 ? f32 : Math.min(1.0f, f32 * 3.0f);
                            double h = i0.a.h(i36);
                            Paint paint2 = t0Var.A1;
                            if (h > 0.62d) {
                                paint2.setColor(a(min5, 939524096));
                                float dpf2 = AndroidUtilities.dpf2(1.2f);
                                if (z15) {
                                    f32 = 1.0f;
                                }
                                paint2.setStrokeWidth((dpf2 * f32) + dp8);
                                canvas2.drawCircle(b11, b12, lerp5, paint2);
                            }
                            paint2.setColor(a(min5, -1));
                            paint2.setStrokeWidth(dp8);
                            canvas2.drawCircle(b11, b12, lerp5, paint2);
                        }
                        if (j12 == 1.0f) {
                            canvas2.restore();
                            t0Var.invalidate();
                        }
                    }
                    f32 = f33;
                    paint.setColor(-1);
                    length = t0Var.s8.length;
                    iArr = a.b;
                    i19 = i32;
                    if (length != iArr.length) {
                    }
                    LinearGradient[] linearGradientArr3 = t0Var.s8;
                    LinearGradient linearGradient3 = linearGradientArr3[i35];
                    if (linearGradient3 == null) {
                    }
                    LinearGradient linearGradient22 = new LinearGradient(0.0f, 0.0f, 1.0f, 1.0f, i36, i37, Shader.TileMode.CLAMP);
                    linearGradientArr2[i35] = linearGradient22;
                    t0Var.t8[i35] = (i36 * 31) + i37;
                    linearGradient3 = linearGradient22;
                    float f532 = f52 * 2.0f;
                    Matrix matrix2 = t0Var.e7;
                    matrix2.setScale(f532, f532);
                    float f542 = b11 - f52;
                    float f552 = b12 - f52;
                    matrix2.postTranslate(f542, f552);
                    linearGradient3.setLocalMatrix(matrix2);
                    paint.setShader(linearGradient3);
                    canvas2.drawCircle(b11, b12, f52, paint);
                    paint.setShader(null);
                    float max32 = Math.max(0.0f, -AndroidUtilities.dpf2(fArr[i12][8])) + 1.0f;
                    float f562 = (b11 + f52) - max32;
                    float f572 = (b12 + f52) - max32;
                    RectF rectF92 = t0Var.d7;
                    rectF92.set(f542 + max32, f552 + max32, f562, f572);
                    float f582 = f28;
                    f30 = width;
                    f31 = f49;
                    i20 = i30;
                    t0Var.u8.a(canvas, rectF92, f52 - max32, 3, 1.0f);
                    canvas2 = canvas;
                    if (f32 > 0.01f) {
                    }
                    if (j12 == 1.0f) {
                    }
                }
                i35++;
                f14 = f31;
                width = f30;
                i30 = i20;
                dp6 = f29;
                i32 = i19;
                f11 = 0.5f;
                f28 = 0.8f;
                f39 = 10.0f;
            }
            i14 = i32;
            i15 = i30;
            canvas2.restore();
        } else {
            i14 = i32;
            i15 = i30;
            float f59 = f14;
            if (i33 != i13) {
                boolean z16 = t0Var.g1 > 0.5f;
                float U02 = z16 ? t0Var.U0() : 1.0f;
                boolean z17 = z16 && U02 < 1.0f;
                if (z17) {
                    float f60 = 1.0f - U02;
                    float lerp6 = AndroidUtilities.lerp(0.75f, 1.0f, c1.z(f60, f60, f60, 1.0f));
                    canvas2.save();
                    canvas2.scale(lerp6, lerp6, rectF2.centerX(), t0Var.j1 + f15);
                    t0Var.invalidate();
                }
                boolean h02 = t0Var.h0();
                ArrayList arrayList3 = t0Var.v1;
                if (h02) {
                    float centerX2 = rectF2.centerX();
                    float dp9 = AndroidUtilities.dp(99.0f);
                    Typeface bold = AndroidUtilities.bold();
                    TextPaint textPaint = t0Var.b8;
                    textPaint.setTypeface(bold);
                    textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                    Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
                    arrayList = arrayList3;
                    int width2 = (int) (rectF2.width() - AndroidUtilities.dp(32.0f));
                    f18 = U02;
                    rectF3 = rectF6;
                    boolean z18 = t0Var.w1 > 0;
                    boolean z19 = !z18;
                    StaticLayout staticLayout = t0Var.g8;
                    boolean z20 = z18;
                    TextPaint textPaint2 = t0Var.c8;
                    if (staticLayout == null || t0Var.h8 != width2 || t0Var.i8 != z19) {
                        t0Var.h8 = width2;
                        t0Var.i8 = z19;
                        textPaint2.setTextSize(AndroidUtilities.dp(14.0f));
                        Paint.FontMetrics fontMetrics2 = textPaint2.getFontMetrics();
                        t0Var.g8 = new StaticLayout(LocaleController.getString(!z20 ? R.string.QrChatNoCollectibles : R.string.QrNoGiftsInfo), textPaint2, width2, Layout.Alignment.ALIGN_CENTER, 1.0f, AndroidUtilities.dp(18.5f) - (fontMetrics2.descent - fontMetrics2.ascent), false);
                    }
                    float z21 = k3.z(AndroidUtilities.dp(300.0f), ((((fontMetrics.descent - fontMetrics.ascent) + (AndroidUtilities.dp(22.0f) + dp9)) + AndroidUtilities.dp(7.0f)) + t0Var.g8.getHeight()) + (t0Var.w1 > 0 ? AndroidUtilities.dp(36.0f) + AndroidUtilities.dp(20.0f) : 0), 2.0f, f59) - AndroidUtilities.dp(8.0f);
                    TLRPC.Document document = t0Var.q8;
                    int i39 = t0Var.b;
                    if (document != null) {
                        f24 = z21;
                        z10 = z16;
                        f16 = f15;
                        f23 = 7.0f;
                    } else {
                        if (t0Var.p8 == null) {
                            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                            t0Var.p8 = tL_inputStickerSetShortName;
                            f23 = 7.0f;
                            tL_inputStickerSetShortName.short_name = "Redo_edc21keMa";
                        } else {
                            f23 = 7.0f;
                        }
                        if (t0Var.o8) {
                            f24 = z21;
                            z10 = z16;
                            f16 = f15;
                            document = null;
                        } else {
                            t0Var.o8 = true;
                            f24 = z21;
                            z10 = z16;
                            f16 = f15;
                            TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i39).getStickerSet(t0Var.p8, null, false, new g(t0Var, 4));
                            if (stickerSet != null && (arrayList2 = stickerSet.documents) != null && !arrayList2.isEmpty()) {
                                t0Var.q8 = stickerSet.documents.get(0);
                            }
                            document = t0Var.q8;
                        }
                    }
                    if (document != null) {
                        r5 r5Var = t0Var.l8;
                        f25 = f59;
                        if (r5Var == null || t0Var.n8 != document.id) {
                            if (r5Var != null) {
                                r5Var.o(t0Var);
                            }
                            r5 m10 = r5.m(i39, 14, document);
                            t0Var.l8 = m10;
                            m10.a(t0Var);
                            t0Var.n8 = document.id;
                            t0Var.r8 = 0L;
                        }
                    } else {
                        f25 = f59;
                    }
                    r5 r5Var2 = t0Var.l8;
                    g3 g3Var = r5Var2 != null ? r5Var2.k : null;
                    long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    if (g3Var == null || !g3Var.hasBitmapImage()) {
                        j10 = 0;
                    } else {
                        j10 = 0;
                        if (t0Var.r8 == 0) {
                            t0Var.r8 = currentAnimationTimeMillis;
                        }
                    }
                    float min6 = t0Var.r8 == j10 ? 0.0f : Math.min(1.0f, (currentAnimationTimeMillis - r2) / 250.0f);
                    float B = k3.B(min6, 2.0f, 3.0f, min6 * min6);
                    float clamp014 = t0Var.g1 > 0.5f ? Utilities.clamp01(t0Var.U0() / 0.7f) : 1.0f;
                    float f61 = 1.0f - clamp014;
                    float z22 = c1.z(f61, f61, f61, 1.0f);
                    float lerp7 = AndroidUtilities.lerp(0.95f, 1.0f, z22);
                    if (clamp014 < 1.0f) {
                        t0Var.invalidate();
                    }
                    canvas2.save();
                    canvas2.translate(0.0f, (1.0f - z22) * AndroidUtilities.dp(6.0f));
                    float f62 = dp9 / 2.0f;
                    canvas2.scale(lerp7, lerp7, centerX2, (f24 - AndroidUtilities.dp(2.0f)) + f62);
                    if (B < 1.0f) {
                        if (t0Var.m8 == null) {
                            int i40 = (int) dp9;
                            uj0 uj0Var = new uj0(R.raw.qr_resistance_dog, i40, i40, true, null);
                            t0Var.m8 = uj0Var;
                            uj0Var.K(1);
                            t0Var.m8.J(true);
                            t0Var.m8.R(t0Var);
                            t0Var.m8.setCallback(t0Var);
                            t0Var.m8.start();
                        }
                        if (t0Var.m8.u()) {
                            f26 = dp9;
                            t0Var.m8.setBounds((int) (centerX2 - f62), (int) (f24 - AndroidUtilities.dp(2.0f)), (int) (centerX2 + f62), (int) ((f24 - AndroidUtilities.dp(2.0f)) + f26));
                            t0Var.m8.setAlpha((int) ((1.0f - B) * f12 * 255.0f));
                            t0Var.m8.draw(canvas2);
                        } else {
                            f26 = dp9;
                        }
                        t0Var.invalidate();
                    } else {
                        f26 = dp9;
                        uj0 uj0Var2 = t0Var.m8;
                        if (uj0Var2 != null) {
                            uj0Var2.C(false);
                            t0Var.m8 = null;
                        }
                    }
                    r5 r5Var3 = t0Var.l8;
                    if (r5Var3 != null && B > 0.0f) {
                        r5Var3.setBounds((int) (centerX2 - f62), (int) (f24 - AndroidUtilities.dp(2.0f)), (int) (f62 + centerX2), (int) ((f24 - AndroidUtilities.dp(2.0f)) + f26));
                        t0Var.l8.setAlpha((int) (f12 * 255.0f * B));
                        t0Var.l8.draw(canvas2);
                    }
                    canvas2.restore();
                    textPaint.setColor(-1);
                    int i41 = (int) (f12 * 255.0f);
                    textPaint.setAlpha(i41);
                    Paint.FontMetrics fontMetrics3 = textPaint.getFontMetrics();
                    float dp10 = ((f24 + f26) + AndroidUtilities.dp(18.0f)) - fontMetrics3.ascent;
                    String str = t0Var.j8;
                    canvas2.drawText(str, centerX2 - (textPaint.measureText(str) / 2.0f), dp10, textPaint);
                    textPaint2.setColor(-1);
                    textPaint2.setAlpha((int) (191.0f * f12));
                    float dp11 = dp10 + fontMetrics3.descent + AndroidUtilities.dp(f23);
                    canvas2.save();
                    canvas2.translate(centerX2 - (t0Var.g8.getWidth() / 2.0f), dp11);
                    t0Var.g8.draw(canvas2);
                    canvas2.restore();
                    long j11 = t0Var.w1;
                    RectF rectF10 = t0Var.a8;
                    if (j11 > 0) {
                        float height2 = dp11 + t0Var.g8.getHeight() + AndroidUtilities.dp(20.0f);
                        Typeface bold2 = AndroidUtilities.bold();
                        TextPaint textPaint3 = t0Var.d8;
                        textPaint3.setTypeface(bold2);
                        textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
                        String str2 = t0Var.k8;
                        float measureText = textPaint3.measureText(str2) + (AndroidUtilities.dp(19.0f) * 2);
                        float dp12 = AndroidUtilities.dp(36.0f);
                        float f63 = measureText / 2.0f;
                        rectF10.set(centerX2 - f63, height2, f63 + centerX2, height2 + dp12);
                        f17 = f25;
                        int saveLayer = canvas2.saveLayer(rectF10.left - 1.0f, rectF10.top - 1.0f, rectF10.right + 1.0f, rectF10.bottom + 1.0f, null);
                        paint.setColor(-1);
                        paint.setAlpha(i41);
                        float f64 = dp12 / 2.0f;
                        canvas2.drawRoundRect(rectF10, f64, f64, paint);
                        t0Var.M(canvas2, 10, rectF10, true);
                        Typeface bold3 = AndroidUtilities.bold();
                        TextPaint textPaint4 = t0Var.f8;
                        textPaint4.setTypeface(bold3);
                        textPaint4.setTextSize(AndroidUtilities.dp(14.0f));
                        Paint.FontMetrics fontMetrics4 = textPaint4.getFontMetrics();
                        canvas2.drawText(str2, centerX2 - (textPaint4.measureText(str2) / 2.0f), rectF10.centerY() - ((fontMetrics4.ascent + fontMetrics4.descent) / 2.0f), textPaint4);
                        canvas2.restoreToCount(saveLayer);
                        if (t0Var.e8 == null) {
                            TextPaint textPaint5 = new TextPaint(1);
                            t0Var.e8 = textPaint5;
                            textPaint5.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.MULTIPLY));
                        }
                        t0Var.e8.setTypeface(AndroidUtilities.bold());
                        t0Var.e8.setTextSize(AndroidUtilities.dp(14.0f));
                        r0 r0Var3 = t0Var.n;
                        t0Var.e8.setColor(D0(0.9f, 1.4f, 0.1f, r0Var3 != null ? i0.a.f(0.5f, r0Var3.b, r0Var3.c) : -8355712));
                        t0Var.e8.setAlpha(i41);
                        canvas2.drawText(str2, centerX2 - (t0Var.e8.measureText(str2) / 2.0f), rectF10.centerY() - ((fontMetrics4.ascent + fontMetrics4.descent) / 2.0f), t0Var.e8);
                    } else {
                        f17 = f25;
                        rectF10.setEmpty();
                    }
                } else {
                    arrayList = arrayList3;
                    z10 = z16;
                    f16 = f15;
                    f17 = f59;
                    f18 = U02;
                    rectF3 = rectF6;
                    if (arrayList.isEmpty()) {
                        TextPaint textPaint6 = t0Var.C1;
                        textPaint6.setColor(-1275068417);
                        textPaint6.setTextSize(AndroidUtilities.dp(14.0f));
                        String string = LocaleController.getString(!t0Var.x1 ? R.string.QrLoadingGifts : t0Var.w1 < 0 ? R.string.QrChatNoCollectibles : R.string.QrNoCollectibles);
                        canvas2.drawText(string, (f36 - textPaint6.measureText(string)) / 2.0f, dp6 + AndroidUtilities.dp(40.0f), textPaint6);
                    }
                }
                int f02 = t0Var.f0();
                int size = arrayList.size();
                float width3 = (rectF2.width() - AndroidUtilities.dp(8.0f)) / 3.0f;
                float f65 = f02;
                float width4 = (rectF2.width() - AndroidUtilities.dp(8.0f)) / f65;
                float f66 = dp6 + 0.0f;
                t0Var.r6 = false;
                t0Var.j6 = 0;
                boolean z23 = z17;
                int max4 = (int) Math.max(0.0d, Math.floor(((f17 + t0Var.j1) - f66) / width3));
                t0Var.h6 = max4;
                int max5 = (int) Math.max(max4, Math.floor(((f16 + t0Var.j1) - f66) / width3));
                t0Var.i6 = max5;
                int i42 = (max5 - t0Var.h6) + 1;
                boolean z24 = t0Var.g1 < 0.5f;
                t0Var.g6 = z24;
                if (z24) {
                    t0Var.l6 = AnimationUtils.currentAnimationTimeMillis() - t0Var.e6;
                    t0Var.k6 = Math.min(25.0f, 60.0f / Math.max(1, r1));
                    t0Var.m6 = 0.6f;
                    t0Var.n6 = AndroidUtilities.dp(4.0f);
                    z11 = true;
                } else {
                    float currentAnimationTimeMillis2 = !t0Var.f6 ? 0.0f : AnimationUtils.currentAnimationTimeMillis() - t0Var.d6;
                    t0Var.l6 = currentAnimationTimeMillis2;
                    if (currentAnimationTimeMillis2 > 470.0f) {
                        t0Var.l6 = -1.0f;
                        z11 = true;
                        if (z10) {
                            t0Var.l6 = -1.0f;
                        }
                        i16 = 0;
                        while (i16 < size) {
                            float f67 = i16 % f02;
                            float dp13 = (width4 * f67) + rectF2.left + AndroidUtilities.dp(4.0f);
                            float f68 = ((i16 / f02) * width3) + f66;
                            float f69 = t0Var.j1;
                            if (f68 - f69 <= f16) {
                                float f70 = f68 + width3;
                                if (f70 - f69 >= f17) {
                                    t0Var.q6 = 1.0f;
                                    if (t0Var.l6 < 0.0f) {
                                        f19 = 1.0f;
                                    } else {
                                        if (t0Var.g6) {
                                            float clamp015 = Utilities.clamp01((t0Var.l6 - ((f67 * 3.0f) + (Math.max(0, r1 - t0Var.h6) * t0Var.k6))) / 90.0f);
                                            f19 = 1.0f;
                                            t0Var.q6 = AndroidUtilities.lerp(1.0f, t0Var.m6, clamp015 * clamp015);
                                            if (clamp015 >= 0.7f) {
                                                f20 = org.telegram.messenger.g0.x(clamp015, 0.7f, 0.3f, 1.0f);
                                            }
                                        } else {
                                            float clamp016 = Utilities.clamp01((t0Var.l6 - ((f67 * 4.0f) + (Math.max(0, t0Var.i6 - r1) * t0Var.k6))) / 220.0f);
                                            float f71 = t0Var.m6;
                                            if (t0Var.r6) {
                                                z13 = S(clamp016, 1.2f);
                                                f19 = 1.0f;
                                            } else {
                                                f19 = 1.0f;
                                                float f72 = 1.0f - clamp016;
                                                z13 = c1.z(f72, f72, f72, 1.0f);
                                            }
                                            t0Var.q6 = AndroidUtilities.lerp(f71, f19, z13);
                                            float clamp017 = f19 - Utilities.clamp01(clamp016 / f7);
                                            f20 = f19 - (clamp017 * clamp017);
                                        }
                                        z14 = f20 >= f19 || t0Var.q6 != f19;
                                        if (z14) {
                                            canvas2.save();
                                            float f73 = f19;
                                            float f74 = f20;
                                            canvas2.translate(0.0f, Utilities.clamp01((f73 - t0Var.q6) / (f73 - t0Var.m6)) * t0Var.n6);
                                            float f75 = t0Var.q6;
                                            canvas2.scale(f75, f75, (width4 / 2.0f) + dp13, (width3 / 2.0f) + f68);
                                            if (f20 < f19) {
                                                float f76 = dp13 + width4;
                                                int i43 = t0Var.j6;
                                                if (i43 < 64) {
                                                    t0Var.j6 = i43 + 1;
                                                    int i44 = i43 * 5;
                                                    float[] fArr2 = t0Var.o6;
                                                    fArr2[i44] = dp13;
                                                    fArr2[i44 + 1] = f68;
                                                    fArr2[i44 + 2] = f76;
                                                    fArr2[i44 + 3] = f70;
                                                    fArr2[i44 + 4] = f74;
                                                }
                                            }
                                        }
                                        if (z23) {
                                            f21 = 1.0f;
                                            f22 = 1.0f;
                                        } else {
                                            f21 = 1.0f;
                                            float clamp018 = 1.0f - Utilities.clamp01(((420.0f * f18) - (Math.max(0.0f, Math.min(10.0f, ((f68 - t0Var.j1) - f17) / width3)) * 12.0f)) / 300.0f);
                                            f22 = ((1.0f - ((clamp018 * clamp018) * clamp018)) * 0.18f) + 0.82f;
                                        }
                                        if (f22 == f21) {
                                            canvas2.save();
                                            canvas2.scale(f22, f22, (width4 / 2.0f) + dp13, (width3 / 2.0f) + f68);
                                        }
                                        ArrayList arrayList4 = arrayList;
                                        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList4.get(i16);
                                        float dp14 = dp13 + AndroidUtilities.dp(4.0f);
                                        float dp15 = f68 + AndroidUtilities.dp(4.0f);
                                        float dp16 = width4 - AndroidUtilities.dp(8.0f);
                                        float dp17 = width3 - AndroidUtilities.dp(8.0f);
                                        q0Var = t0Var.F;
                                        arrayList = arrayList4;
                                        rectF4 = rectF2;
                                        i18 = i24;
                                        if (q0Var.a == i18) {
                                            int i45 = q0Var.q;
                                        }
                                        t0 t0Var3 = t0Var;
                                        z12 = true;
                                        t0Var3.I(canvas, i16, tL_starGiftUnique, dp14, dp15, dp16, dp17);
                                        t0Var = t0Var3;
                                        if (f22 != f21) {
                                            canvas.restore();
                                        }
                                        if (!z14) {
                                            canvas.restore();
                                        }
                                        i16++;
                                        canvas2 = canvas;
                                        i24 = i18;
                                        z11 = z12;
                                        rectF2 = rectF4;
                                    }
                                    f20 = f19;
                                    if (f20 >= f19) {
                                    }
                                    if (z14) {
                                    }
                                    if (z23) {
                                    }
                                    if (f22 == f21) {
                                    }
                                    ArrayList arrayList42 = arrayList;
                                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList42.get(i16);
                                    float dp142 = dp13 + AndroidUtilities.dp(4.0f);
                                    float dp152 = f68 + AndroidUtilities.dp(4.0f);
                                    float dp162 = width4 - AndroidUtilities.dp(8.0f);
                                    float dp172 = width3 - AndroidUtilities.dp(8.0f);
                                    q0Var = t0Var.F;
                                    arrayList = arrayList42;
                                    rectF4 = rectF2;
                                    i18 = i24;
                                    if (q0Var.a == i18) {
                                    }
                                    t0 t0Var32 = t0Var;
                                    z12 = true;
                                    t0Var32.I(canvas, i16, tL_starGiftUnique2, dp142, dp152, dp162, dp172);
                                    t0Var = t0Var32;
                                    if (f22 != f21) {
                                    }
                                    if (!z14) {
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
                        for (i17 = 0; i17 < t0Var.j6; i17++) {
                            int i46 = i17 * 5;
                            float[] fArr3 = t0Var.o6;
                            int i47 = (int) (fArr3[i46 + 4] * 255.0f);
                            Paint paint3 = t0Var.p6;
                            paint3.setAlpha(i47);
                            canvas.drawRect(fArr3[i46], fArr3[i46 + 1], fArr3[i46 + 2], fArr3[i46 + 3], paint3);
                        }
                        t0Var.j6 = 0;
                        if (z23) {
                            canvas.restore();
                        }
                        canvas.restore();
                        if (i14 != 0) {
                            float dp18 = AndroidUtilities.dp(12.0f);
                            Matrix matrix3 = t0Var.D7;
                            matrix3.setScale(1.0f, dp18);
                            RectF rectF11 = rectF3;
                            matrix3.postTranslate(0.0f, rectF11.top);
                            t0Var.B7.setLocalMatrix(matrix3);
                            float f77 = rectF11.left;
                            float f78 = rectF11.top;
                            canvas.drawRect(f77, f78, rectF11.right, f78 + dp18, t0Var.C7);
                            matrix3.setScale(1.0f, -dp18);
                            matrix3.postTranslate(0.0f, rectF11.bottom);
                            t0Var.B7.setLocalMatrix(matrix3);
                            float f79 = rectF11.left;
                            float f80 = rectF11.bottom;
                            canvas.drawRect(f79, f80 - dp18, rectF11.right, f80, t0Var.C7);
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
                    t0Var.k6 = Math.min(45.0f, (250.0f - (f65 * 4.0f)) / Math.max(1, i42));
                    t0Var.m6 = 0.7f;
                    t0Var.n6 = AndroidUtilities.dp(7.0f);
                }
                t0Var.invalidate();
                if (z10) {
                }
                i16 = 0;
                while (i16 < size) {
                }
                while (i17 < t0Var.j6) {
                }
                t0Var.j6 = 0;
                if (z23) {
                }
                canvas.restore();
                if (i14 != 0) {
                }
                canvas.restore();
                if (i15 != 0) {
                }
            }
        }
        rectF3 = rectF6;
        canvas.restore();
        if (i14 != 0) {
        }
        canvas.restore();
        if (i15 != 0) {
        }
    }

    public final int N0() {
        r0 r0Var = this.n;
        if (r0Var == null) {
            return -16777216;
        }
        if (this.s >= 1.0f || this.r == null) {
            return r0Var.e;
        }
        float l4 = (l() / 2.0f) + m();
        float clamp01 = Utilities.clamp01(((((((float) Math.hypot(Math.max(this.w, getWidth() - this.w), Math.max(this.x, getHeight() - this.x))) + AndroidUtilities.dp(60.0f)) * x1(this.s)) - ((float) Math.hypot((getWidth() / 2.0f) - this.w, l4 - this.x))) + AndroidUtilities.dp(80.0f)) / AndroidUtilities.dp(160.0f));
        int i10 = this.r.e;
        int i11 = this.n.e;
        float B = k3.B(clamp01, 2.0f, 3.0f, clamp01 * clamp01);
        double[] dArr = this.p3;
        i0.a.j(i10, dArr);
        double[] dArr2 = this.q3;
        i0.a.j(i11, dArr2);
        double d = B;
        double[] dArr3 = this.r3;
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
        return i0.a.b(d11, d12, d13);
    }

    public final void O(Canvas canvas, float f7, float f10, float f11, int i10, boolean z10) {
        PorterDuffColorFilter m12 = m1(i10);
        org.telegram.ui.p0 p0Var = this.T1;
        p0Var.setColorFilter(m12);
        p0Var.setAlpha(255);
        float f12 = f11 / 2.0f;
        float f13 = f10 - f12;
        float f14 = f7 + f11;
        float f15 = f10 + f12;
        p0Var.setBounds((int) f7, (int) f13, (int) f14, (int) f15);
        if (!z10) {
            p0Var.draw(canvas);
            return;
        }
        float f16 = f11 * 0.095f;
        float f17 = (0.28f * f11) + f7;
        float f18 = f10 - (0.21f * f11);
        float f19 = (0.74f * f11) + f7;
        float f20 = (0.25f * f11) + f10;
        RectF rectF = this.W5;
        rectF.set(f7 - AndroidUtilities.dp(2.0f), f13 - AndroidUtilities.dp(2.0f), f14 + AndroidUtilities.dp(2.0f), f15 + AndroidUtilities.dp(2.0f));
        canvas.saveLayer(rectF, null);
        p0Var.draw(canvas);
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

    public final void O0(q0 q0Var) {
        if (q0Var == null) {
            return;
        }
        r5 r5Var = q0Var.c;
        if (r5Var != null) {
            r5Var.o(this);
        }
        r5 r5Var2 = q0Var.d;
        if (r5Var2 != null && !this.K7.containsValue(r5Var2)) {
            q0Var.d.o(this);
        }
        q0Var.D = true;
        s sVar = q0Var.C;
        if (sVar != null) {
            sVar.e = true;
            NotificationCenter.getInstance(sVar.a).removeObserver(sVar, NotificationCenter.fileLoaded);
            q0Var.C = null;
        }
    }

    public final void P(Canvas canvas, float f7, float f10, float f11, float f12) {
        if (this.p1 == null || f12 <= 0.004f) {
            return;
        }
        float dp = AndroidUtilities.dp(15.0f);
        TextPaint textPaint = this.x2;
        textPaint.setTextSize(dp);
        textPaint.setColor(-1);
        textPaint.setAlpha((int) (f12 * 255.0f));
        canvas.drawText(this.p1, ((f7 + f11) - AndroidUtilities.dp(16.0f)) - textPaint.measureText(this.p1), f10 + AndroidUtilities.dp(5.0f), textPaint);
        textPaint.setAlpha(255);
    }

    public final void P0() {
        int i10 = this.s9;
        if (i10 >= 0) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.z9[i10] = W0(i10, currentAnimationTimeMillis);
            this.y9[i10] = currentAnimationTimeMillis;
            invalidate();
        }
        this.s9 = -1;
    }

    public final void Q(float f7, float f10, float f11, Canvas canvas, boolean z10) {
        Canvas canvas2;
        float f12;
        float f13;
        if (this.X8 == 0) {
            canvas2 = canvas;
            uj0 q12 = q1();
            int dp = AndroidUtilities.dp(27.0f);
            float f14 = dp / 2.0f;
            int i10 = (int) (f10 - f14);
            q12.setBounds((int) ((AndroidUtilities.dp(26.0f) + f7) - f14), i10, ((int) ((AndroidUtilities.dp(26.0f) + f7) - f14)) + dp, dp + i10);
            q12.draw(canvas2);
        } else if (z10) {
            float dp2 = f10 - AndroidUtilities.dp(10.0f);
            Paint.Style style = Paint.Style.STROKE;
            Paint paint = this.S8;
            paint.setStyle(style);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            paint.setColor(-1);
            float f15 = 1.0f;
            paint.setAlpha((int) (Color.alpha(-1) * 1.0f));
            float dp3 = ((AndroidUtilities.dp(26.0f) + f7) - AndroidUtilities.dp(10.0f)) + AndroidUtilities.dp(10.0f);
            float dp4 = dp2 + AndroidUtilities.dp(11.0f);
            float dp5 = AndroidUtilities.dp(7.25f);
            if (f11 >= 0.0f) {
                float clamp01 = 1.0f - Utilities.clamp01(f11 / 0.42f);
                float z11 = c1.z(clamp01, clamp01, clamp01, 1.0f);
                if (f11 < 0.6f) {
                    float f16 = 1.0f - (f11 / 0.6f);
                    f13 = (1.0f - ((f16 * f16) * f16)) * 364.0f;
                } else {
                    float clamp012 = Utilities.clamp01((f11 - 0.6f) / 0.12f);
                    f13 = 364.0f - ((3.0f - (clamp012 * 2.0f)) * ((4.0f * clamp012) * clamp012));
                }
                f12 = f13;
                f15 = z11;
            } else {
                f12 = 0.0f;
            }
            float f17 = dp4 - dp5;
            RectF rectF = this.T8;
            rectF.set(dp3 - dp5, f17, dp3 + dp5, dp5 + dp4);
            canvas.drawArc(rectF, -82.0f, f15 * 344.0f, false, paint);
            canvas.drawLine(dp3, f17, dp3, dp2 + AndroidUtilities.dp(2.2f), paint);
            double radians = Math.toRadians(f12 - 90.0f);
            canvas2 = canvas;
            canvas2.drawLine(dp3, dp4, c1.b(3.8f, (float) Math.cos(radians), dp3), c1.b(3.8f, (float) Math.sin(radians), dp4), paint);
            paint.setStyle(Paint.Style.FILL);
            canvas2.drawCircle(dp3, dp4, AndroidUtilities.dpf2(1.2f), paint);
        } else {
            canvas2 = canvas;
            if (n()) {
                uj0 o12 = o1();
                int dp6 = AndroidUtilities.dp(28.0f);
                float f18 = dp6 / 2.0f;
                int i11 = (int) (f10 - f18);
                o12.setBounds((int) ((AndroidUtilities.dp(26.0f) + f7) - f18), i11, ((int) ((AndroidUtilities.dp(26.0f) + f7) - f18)) + dp6, dp6 + i11);
                o12.draw(canvas2);
            } else {
                int i12 = this.X8;
                if (i12 == R.drawable.msg_download) {
                    uj0 p12 = p1();
                    int dp7 = AndroidUtilities.dp(28.0f);
                    float f19 = dp7 / 2.0f;
                    int i13 = (int) (f10 - f19);
                    p12.setBounds((int) ((AndroidUtilities.dp(26.0f) + f7) - f19), i13, ((int) ((AndroidUtilities.dp(26.0f) + f7) - f19)) + dp7, dp7 + i13);
                    p12.draw(canvas2);
                } else {
                    o0(canvas2, i12 == R.drawable.msg_retry ? this.R1 : i12 == R.drawable.msg_copy ? this.J1 : this.S1, f7 + AndroidUtilities.dp(26.0f), f10, AndroidUtilities.dp(20.0f), 1.0f);
                    canvas2 = canvas2;
                }
            }
        }
        TextPaint textPaint = this.C1;
        textPaint.setColor(-1);
        float f20 = this.s1;
        if (f20 <= 0.0f) {
            f20 = AndroidUtilities.dp(15.0f);
        }
        textPaint.setTextSize(f20);
        String str = this.V8;
        float dp8 = f7 + AndroidUtilities.dp(48.0f);
        float dp9 = AndroidUtilities.dp(5.0f) + f10;
        int indexOf = str.indexOf(10);
        if (indexOf >= 0) {
            canvas2.drawText(str, 0, indexOf, dp8, dp9 - AndroidUtilities.dp(9.0f), (Paint) textPaint);
            canvas.drawText(str, indexOf + 1, str.length(), dp8, dp9 + AndroidUtilities.dp(9.0f), (Paint) textPaint);
            return;
        }
        if (!s0(str)) {
            canvas2.drawText(str, dp8, dp9, textPaint);
            return;
        }
        float textSize = textPaint.getTextSize();
        TextPaint textPaint2 = this.x2;
        textPaint2.setTextSize(textSize);
        textPaint2.setColor(textPaint.getColor());
        canvas2.drawText(this.u2, dp8, dp9, textPaint);
        float measureText = textPaint.measureText(this.u2) + dp8;
        canvas2.drawText(this.v2, measureText, dp9, textPaint2);
        canvas2.drawText(this.w2, textPaint2.measureText(this.v2) + measureText, dp9, textPaint);
    }

    public final void Q0() {
        float f7 = this.e0;
        if (f7 == 0.0f && this.f0 == 0.0f) {
            return;
        }
        this.i0 = f7;
        this.j0 = this.f0;
        this.W = AnimationUtils.currentAnimationTimeMillis();
        this.U = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:166:0x03f5, code lost:
    
        if (r2.a0 < (r2.e[0] - 1)) goto L213;
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0479  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R(Canvas canvas, int i10, long j10) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float max;
        float f15;
        float f16;
        float height;
        int dp;
        Path path;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        uj0 uj0Var;
        String sb2;
        float f17;
        float dp2;
        uj0 uj0Var2;
        float f18;
        String str;
        boolean z14 = this.h9 || (this.m1 != null && j10 < this.u1);
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (!this.h9 && z14 && this.O8 && (str = this.V8) != null && !str.equals(this.m1)) {
            this.O8 = false;
            this.N8 = currentAnimationTimeMillis;
        }
        if (!z14 || this.O8) {
            if (!z14 && this.O8) {
                this.O8 = false;
                this.N8 = currentAnimationTimeMillis;
            }
        } else if (this.V8 == null || currentAnimationTimeMillis - this.N8 >= 360) {
            this.O8 = true;
            this.N8 = currentAnimationTimeMillis;
            this.V8 = this.m1;
            int i11 = this.n1;
            this.X8 = i11;
            this.p1 = this.o1;
            this.W8 = false;
            this.Y8 = currentAnimationTimeMillis;
            if (i11 == 0) {
                uj0 q12 = q1();
                q12.N(0, false, false);
                q12.start();
            } else if (n()) {
                uj0 o12 = o1();
                o12.N(0, false, false);
                o12.start();
            } else if (this.X8 == R.drawable.msg_download) {
                uj0 p12 = p1();
                p12.N(0, false, false);
                p12.start();
            }
        }
        String str2 = this.V8;
        if (str2 == null) {
            return;
        }
        float f19 = (currentAnimationTimeMillis - this.N8) / 1000.0f;
        if (this.O8) {
            boolean z15 = str2.indexOf(10) >= 0 || r1(this.V8) + ((float) AndroidUtilities.dp(66.0f)) >= ((float) (i10 - AndroidUtilities.dp(32.0f)));
            if (f19 >= 0.5f) {
                f11 = 1.0f;
                f18 = 3.0f;
                f7 = 2.0f;
            } else {
                f18 = 3.0f;
                f7 = 2.0f;
                f11 = (float) g1(f19, z15 ? 0.75d : 0.6d, 0.42d);
            }
            f10 = f18;
        } else {
            f7 = 2.0f;
            if (!this.W8) {
                if (f19 >= 0.36f) {
                    this.V8 = null;
                    return;
                }
                float f20 = f19 / 0.36f;
                float f21 = f20;
                f10 = 3.0f;
                float f22 = 0.0f;
                float f23 = 1.0f;
                for (int i12 = 0; i12 < 12; i12++) {
                    f21 = (f22 + f23) / 2.0f;
                    float f24 = 1.0f - f21;
                    float f25 = f24 * 3.0f;
                    if (k3.t(f21, f21, f21, (f25 * f21 * f21 * 0.9f) + k3.C(f25, f24, f21, 0.5f)) < f20) {
                        f22 = f21;
                    } else {
                        f23 = f21;
                    }
                }
                f11 = 1.0f - (((f21 * f21) * f21) + (((((1.0f - f21) * 3.0f) * f21) * f21) * 0.5f));
            } else if (f19 >= 0.14f) {
                this.V8 = null;
                this.W8 = false;
                return;
            } else {
                f10 = 3.0f;
                f11 = -1.0f;
            }
        }
        if (this.O8 || f11 > 0.0f) {
            invalidate();
        }
        boolean z16 = this.V8.indexOf(10) >= 0;
        float dp3 = AndroidUtilities.dp(z16 ? 14.0f : 15.0f);
        TextPaint textPaint = this.C1;
        textPaint.setTextSize(dp3);
        float r12 = r1(this.V8);
        if (this.p1 != null) {
            float dp4 = AndroidUtilities.dp(15.0f);
            f12 = 14.0f;
            TextPaint textPaint2 = this.x2;
            textPaint2.setTextSize(dp4);
            f13 = textPaint2.measureText(this.p1) + AndroidUtilities.dp(16.0f);
        } else {
            f12 = 14.0f;
            f13 = 0.0f;
        }
        float min = Math.min(i10 - AndroidUtilities.dp(32.0f), AndroidUtilities.dp(66.0f) + r12 + f13);
        float dp5 = AndroidUtilities.dp(z16 ? 56.0f : 44.0f);
        float dp6 = (min - AndroidUtilities.dp(66.0f)) - f13;
        this.s1 = textPaint.getTextSize() * ((r12 <= dp6 || r12 <= 0.0f) ? 1.0f : Math.max(0.8f, dp6 / r12));
        boolean z17 = f11 < 0.0f;
        float clamp01 = z17 ? Utilities.clamp01(f19 / 0.14f) : 0.0f;
        float max2 = Math.max(f11, 0.0f);
        if (z17) {
            f14 = 0.8f;
            max = dp5;
        } else {
            f14 = 0.8f;
            max = (Math.max(0.0f, max2 - 1.0f) + Math.min(1.0f, max2 / 0.55f)) * dp5;
        }
        if (z17) {
            f15 = AndroidUtilities.lerp(min, dp5, clamp01 * clamp01);
        } else {
            float f26 = min - max;
            if (max2 <= 1.0f) {
                max2 = f1(0.15f, 1.0f, max2);
            }
            f15 = (f26 * max2) + max;
        }
        float z18 = z17 ? c1.z(clamp01, clamp01, clamp01, 1.0f) : 1.0f;
        if (max < 0.5f) {
            return;
        }
        float f27 = i10 / f7;
        if (this.f1 > 0.001f) {
            f16 = 0.15f;
            height = Z0() - (Utilities.clamp01(this.f1) * a1());
            dp = AndroidUtilities.dp(12.0f);
        } else {
            f16 = 0.15f;
            height = ((getHeight() - this.u3) - AndroidUtilities.dp(40.0f)) - AndroidUtilities.dp(20.0f);
            dp = AndroidUtilities.dp(f12);
        }
        float f28 = this.h9 ? this.g9 : (height - dp) - (dp5 / f7);
        float f29 = f15 / f7;
        float f30 = max / f7;
        boolean z19 = z17;
        RectF rectF = this.M8;
        rectF.set(f27 - f29, f28 - f30, f29 + f27, f28 + f30);
        float min2 = Math.min(f30, AndroidUtilities.dp(24.0f));
        Path path2 = this.E1;
        path2.rewind();
        path2.addRoundRect(rectF, min2, min2, Path.Direction.CW);
        this.U8 = 352321535;
        this.B6 = true;
        J(canvas, rectF, min2, z18);
        this.U8 = 0;
        this.B6 = false;
        float f110 = z19 ? 1.0f : f1(0.2f, 0.95f, f11);
        float clamp012 = z19 ? 1.0f - Utilities.clamp01(f19 / 0.05f) : f1(0.08f, 0.5f, f11);
        if (clamp012 <= 0.004f) {
            return;
        }
        boolean z20 = this.O8;
        float f31 = z20 ? (currentAnimationTimeMillis - this.Y8) / 1000.0f : -1.0f;
        float clamp013 = z20 ? Utilities.clamp01((f19 - f16) / 0.23f) : 1.0f;
        float B = k3.B(clamp013, f7, f10, clamp012 * clamp013 * clamp013);
        if (this.O8 && clamp013 < 1.0f) {
            invalidate();
        }
        int i13 = this.X8;
        if (i13 == R.drawable.msg_recent || (i13 == R.drawable.msg_retry && s0(this.V8))) {
            path = path2;
            z10 = true;
        } else {
            path = path2;
            z10 = false;
        }
        float y3 = this.O8 ? k3.y(1.0f, f110, 0.35f, 1.0f) : Math.max(0.05f, Math.min(1.0f, f15 / min));
        canvas.save();
        canvas.clipPath(path);
        canvas.scale(y3, y3, f27, f28);
        if (i() && ((this.T4 || SharedConfig.getDevicePerformanceClass() == 2) && canvas.isHardwareAccelerated())) {
            if (this.c9 == null) {
                this.c9 = android.support.v4.media.session.x.d("toastContent");
            }
            if ((this.X8 != 0 || (uj0Var2 = this.Z8) == null || uj0Var2.a0 >= uj0Var2.e[0] - 1) && (!n() || (uj0Var = this.a9) == null || uj0Var.a0 >= uj0Var.e[0] - 1)) {
                uj0 uj0Var3 = this.b9;
                if (uj0Var3 == null || this.X8 != R.drawable.msg_download) {
                    z11 = true;
                    z12 = false;
                } else {
                    z12 = false;
                    z11 = true;
                }
                z13 = z12;
                if ((z10 || f31 < 0.0f || f31 >= f14) && !z13) {
                    z11 = z12;
                }
                if (z13) {
                    invalidate();
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.V8);
                sb3.append(this.X8);
                int i14 = (int) min;
                sb3.append(i14);
                sb3.append((int) this.s1);
                sb2 = sb3.toString();
                if (z11 && sb2.equals(this.e9) && u.e(this.c9)) {
                    f17 = f27;
                } else {
                    this.e9 = sb2;
                    f17 = f27;
                    Q(0.0f, dp5 / 2.0f, f31, u.a(i14, (int) dp5, this.c9), z10);
                    u.d(this.c9);
                }
                dp2 = (1.0f - f110) * AndroidUtilities.dp(5.0f);
                if (Math.abs(dp2 - this.d9) > 0.25f) {
                    this.d9 = dp2;
                    Object obj = this.c9;
                    if (dp2 <= 0.3f) {
                        dp2 = 0.0f;
                    }
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    u.j(obj, dp2);
                }
                u.h(this.c9, clamp012);
                float f32 = dp5 / 2.0f;
                canvas.translate(f17 - (min / 2.0f), f28 - f32);
                u.c(canvas, this.c9);
                P(canvas, 0.0f, f32, min, B);
            } else {
                z11 = true;
                z12 = false;
            }
            z13 = z11;
            if (z10) {
            }
            z11 = z12;
            if (z13) {
            }
            StringBuilder sb32 = new StringBuilder();
            sb32.append(this.V8);
            sb32.append(this.X8);
            int i142 = (int) min;
            sb32.append(i142);
            sb32.append((int) this.s1);
            sb2 = sb32.toString();
            if (z11) {
            }
            this.e9 = sb2;
            f17 = f27;
            Q(0.0f, dp5 / 2.0f, f31, u.a(i142, (int) dp5, this.c9), z10);
            u.d(this.c9);
            dp2 = (1.0f - f110) * AndroidUtilities.dp(5.0f);
            if (Math.abs(dp2 - this.d9) > 0.25f) {
            }
            u.h(this.c9, clamp012);
            float f322 = dp5 / 2.0f;
            canvas.translate(f17 - (min / 2.0f), f28 - f322);
            u.c(canvas, this.c9);
            P(canvas, 0.0f, f322, min, B);
        } else {
            canvas.saveLayerAlpha(rectF, (int) (clamp012 * 255.0f));
            float f33 = f27 - (min / 2.0f);
            float f34 = f28;
            Q(f33, f34, f31, canvas, z10);
            canvas.restore();
            P(canvas, f33, f34, min, B);
        }
        canvas.restore();
    }

    public final void R0() {
        int i10 = this.W7;
        if (i10 < 0 || this.Y7 >= this.X7) {
            return;
        }
        this.Z7 = j1(i10);
        this.Y7 = AnimationUtils.currentAnimationTimeMillis();
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        if (r11 == null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap S0() {
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
                if (this.Q2 == null) {
                    uj0 uj0Var = this.X1;
                    if (uj0Var.b > 0) {
                        try {
                            rLottieNative = RLottieNative.b(AndroidUtilities.readRes(R.raw.plane_logo_plain), null, null, null);
                            if (rLottieNative != null) {
                                try {
                                    Bitmap createBitmap2 = Bitmap.createBitmap(uj0Var.b, uj0Var.c, config);
                                    rLottieNative.c(Math.min(33, rLottieNative.a[0] - 1), createBitmap2, true);
                                    this.Q2 = createBitmap2;
                                } catch (Throwable th2) {
                                    th = th2;
                                    try {
                                        FileLog.e(th);
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
                this.S2 = true;
                A(canvas, width);
                this.S2 = false;
                canvas.setBitmap(null);
                this.f1 = f7;
                return createBitmap;
            } catch (OutOfMemoryError unused) {
                this.f1 = f7;
            }
        }
        return null;
    }

    public final float T(float f7) {
        if (this.R4 >= 1.0f) {
            return 1.0f;
        }
        return AndroidUtilities.lerp(this.U4 ? 0.85f : 0.92f, 1.0f, f7);
    }

    public final void T0(String str) {
        if (this.v0) {
            this.s2 = this.L0.c() + AndroidUtilities.dp(2.0f) + AndroidUtilities.dp(12.0f) + AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(11.0f);
            this.v0 = false;
            this.A0 = false;
            this.r2 = this.B0 * this.G0 > 0.001f;
            this.p2 = AnimationUtils.currentAnimationTimeMillis();
            this.C0 = this.B0;
            this.D0 = 0.0f;
            this.E0 = System.currentTimeMillis();
            e eVar = this.t0;
            if (eVar != null) {
                i1(eVar);
            }
            t1(true);
            if (str != null) {
                c1(0, str, null);
            }
            i0();
            this.e = null;
            this.u0 = null;
            u3.c cVar = this.c;
            if (cVar != null) {
                cVar.i(0);
            }
        }
    }

    public final Drawable U(String str) {
        HashMap hashMap = this.J;
        Drawable drawable = (Drawable) hashMap.get(str);
        if (drawable == null) {
            drawable = Emoji.getEmojiDrawable(str);
            if (drawable == null) {
                drawable = Emoji.getEmojiDrawable(str.replace("️", ""));
            }
            if (drawable != null) {
                hashMap.put(str, drawable);
            }
        }
        return drawable;
    }

    public final float U0() {
        if (this.g1 < 0.5f) {
            return 1.0f;
        }
        return Utilities.clamp01((AnimationUtils.currentAnimationTimeMillis() - this.H2) / 420.0f);
    }

    public final Bitmap V(r5 r5Var) {
        Bitmap bitmap;
        g3 g3Var = r5Var.k;
        if (g3Var != null) {
            uj0 lottieAnimation = g3Var.getLottieAnimation();
            if (lottieAnimation != null) {
                if (!this.S2) {
                    lottieAnimation.V(0L);
                }
                if (lottieAnimation.u()) {
                    if (lottieAnimation.Q != null) {
                        return lottieAnimation.Q;
                    }
                    if (lottieAnimation.R != null) {
                        return lottieAnimation.R;
                    }
                    return null;
                }
            } else {
                e6 animation = g3Var.getAnimation();
                if (animation != null) {
                    if (!this.S2) {
                        animation.D(System.currentTimeMillis());
                    }
                    if (animation.s()) {
                        return animation.m();
                    }
                } else if (g3Var.hasImageLoaded() && g3Var.hasNotThumb() && (bitmap = g3Var.getBitmap()) != null && !bitmap.isRecycled()) {
                    return bitmap;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0077 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final q0 W() {
        long j10;
        q0 q0Var = new q0();
        ArrayList arrayList = this.I;
        if (!arrayList.isEmpty()) {
            q0Var.a = 1;
            q0Var.b = new Drawable[arrayList.size()];
            q0Var.w = new long[arrayList.size()];
            q0Var.x = new boolean[arrayList.size()];
            long[] jArr = new long[arrayList.size()];
            q0Var.y = jArr;
            if (this.T4) {
                Arrays.fill(jArr, 1L);
            }
            for (int i10 = 0; i10 < q0Var.b.length; i10++) {
                String str = (String) arrayList.get(i10);
                q0Var.b[i10] = U(str);
                if (str.startsWith("c:")) {
                    try {
                        j10 = Long.parseLong(str.substring(2));
                    } catch (NumberFormatException unused) {
                    }
                    long[] jArr2 = q0Var.w;
                    if (j10 > 0) {
                        j10 = (-1) - (str.hashCode() & 4294967295L);
                    }
                    jArr2[i10] = j10;
                    q0Var.x[i10] = r.d(q0Var.b[i10]);
                }
                j10 = 0;
                long[] jArr22 = q0Var.w;
                if (j10 > 0) {
                }
                jArr22[i10] = j10;
                q0Var.x[i10] = r.d(q0Var.b[i10]);
            }
        }
        return q0Var;
    }

    public final float W0(int i10, long j10) {
        return 1.0f - ((1.0f - this.A9[i10]) * ((float) Math.exp((-(j10 - this.x9[i10])) / 90.0f)));
    }

    public final void X(q0 q0Var) {
        TLRPC.Document document;
        if (q0Var == null || q0Var.D || q0Var.a != 2 || q0Var.C != null || (document = q0Var.z) == null) {
            return;
        }
        q0Var.C = new s(this.b, document, q0Var.A, AndroidUtilities.dp(48.0f), new org.telegram.ui.Wallet.x(19, this, q0Var));
    }

    public final void X0(r0 r0Var, float f7, float f10) {
        if (r0Var != null) {
            this.c7 = V0(r0Var.c);
        }
        if (this.e2) {
            if (this.r != null) {
                this.r = null;
            }
            this.n = r0Var;
            this.s = 1.0f;
            invalidate();
            return;
        }
        this.r = this.n;
        this.n = r0Var;
        this.s = 0.0f;
        this.v = System.currentTimeMillis();
        this.w = f7;
        this.x = f10;
        this.q0++;
        i0();
        invalidate();
    }

    public final boolean Y(Bitmap bitmap) {
        float[] fArr = v0.b;
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
        float dpf2 = AndroidUtilities.dpf2(f7);
        float dpf22 = AndroidUtilities.dpf2(f10);
        float f14 = f12 * dpf22;
        float f15 = dpf22 * f13;
        canvas.drawBitmap(bitmap, f14, f15, (Paint) null);
        canvas.drawBitmap(bitmap, f14 - (f12 * dpf2), f15 - (f13 * dpf2), this.X3);
        return true;
    }

    public final void Z(q0 q0Var) {
        r5 r5Var;
        g3 g3Var;
        if (q0Var == null || q0Var.e != null || (r5Var = q0Var.c) == null) {
            return;
        }
        s sVar = q0Var.C;
        if ((sVar == null || sVar.h) && (g3Var = r5Var.k) != null && g3Var.hasImageLoaded() && g3Var.hasNotThumb()) {
            int dp = AndroidUtilities.dp(48.0f);
            Bitmap createBitmap = Bitmap.createBitmap(dp, dp, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            q0Var.c.setBounds(0, 0, dp, dp);
            q0Var.c.setColorFilter(null);
            q0Var.c.setAlpha(255);
            g3Var.setCurrentAlpha(1.0f);
            q0Var.c.draw(canvas);
            E0(q0Var, createBitmap);
        }
    }

    public final float Z0() {
        return (getHeight() - this.u3) - AndroidUtilities.dp(10.0f);
    }

    public final String a0() {
        String string = LocaleController.getString(R.string.QrNoPaidToastExpires);
        if (!string.equals(this.t2)) {
            this.t2 = string;
            Matcher matcher = Pattern.compile("\\d+").matcher(string);
            if (matcher.find()) {
                this.u2 = string.substring(0, matcher.start());
                this.v2 = matcher.group();
                this.w2 = string.substring(matcher.end());
            } else {
                this.u2 = string;
                this.w2 = "";
                this.v2 = "";
            }
        }
        return this.t2;
    }

    public final float a1() {
        float max = Math.max(AndroidUtilities.dp(160.0f), Z0() - ((((l() + (AndroidUtilities.dp(51.0f) + this.t3)) + AndroidUtilities.dp(24.0f)) + AndroidUtilities.dp(11.0f)) + AndroidUtilities.dp(13.0f)));
        if (this.h1 == 2 && this.x1) {
            ArrayList arrayList = this.v1;
            if (arrayList.size() <= 3) {
                max = Math.min(max, arrayList.isEmpty() ? AndroidUtilities.dp(286.0f) : AndroidUtilities.dp(8.0f) + ((kk.B(10.0f, 2, getWidth()) - AndroidUtilities.dp(8.0f)) / 3.0f));
            }
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        float f7 = this.O2;
        if (f7 < 0.0f || this.f1 < 0.01f) {
            this.O2 = max;
        } else if (f7 != max) {
            long min = Math.min(64L, Math.max(0L, currentAnimationTimeMillis - this.P2));
            float f10 = this.O2;
            float y3 = k3.y(1.0f, (float) Math.exp((-min) / 140.0f), max - f10, f10);
            this.O2 = y3;
            if (Math.abs(max - y3) < 0.5f) {
                this.O2 = max;
            } else {
                invalidate();
            }
        }
        this.P2 = currentAnimationTimeMillis;
        return this.O2;
    }

    public final float b(double d) {
        float f7 = this.A4;
        double sin = Math.sin((f7 * 78.233d) + (((f7 * 17.31d) + d) * 12.9898d)) * 43758.5453d;
        return ((float) (sin - Math.floor(sin))) * 300.0f;
    }

    public final float b1(float f7, float f10, int i10, int i11) {
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
        float[] fArr = v0.b;
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
            f11 = k3.D(1.0f, (float) Math.cos(Math.max(-1.5707964f, Math.min(1.5707964f, r4))), (f26 * fArr[31]) / 100.0f, 1.0f);
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
        q0 q0Var = this.F;
        if (q0Var != null && q0Var.a == 1) {
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

    public final void c() {
        r0 r0Var;
        Runnable runnable = this.c2;
        if (runnable != null) {
            runnable.run();
        }
        if (!this.d2 && !this.I.isEmpty() && (r0Var = this.n) != null && (r0Var.a != 0 || this.F.a == 2)) {
            this.U7 = AnimationUtils.currentAnimationTimeMillis();
            this.R7 = -1;
            this.P7 = 0.0f;
            setSceneFromCard(t(this.N7));
        }
        setPattern(W());
        if (!this.e2) {
            this.r0 = AnimationUtils.currentAnimationTimeMillis();
        }
        B0();
    }

    public final void c1(int i10, String str, String str2) {
        long currentTimeMillis = 0 - System.currentTimeMillis();
        if (currentTimeMillis > 0) {
            postDelayed(new az0(i10, 22, this, str, str2), currentTimeMillis);
            return;
        }
        this.n1 = i10;
        this.m1 = str;
        this.o1 = str2;
        this.u1 = System.currentTimeMillis() + (str2 != null ? 4000 : 2800);
        invalidate();
    }

    public final void d(int i10) {
        this.d2 = true;
        boolean z10 = this.F.a != 0;
        this.I.clear();
        this.P7 = 0.0f;
        this.N7 = i10;
        r0 r0Var = this.n;
        if (r0Var == null || r0Var.a != 0 || r0Var.f != i10) {
            setSceneFromCard(t(i10));
        }
        if (z10) {
            setPattern(new q0());
        }
        Runnable runnable = this.c2;
        if (runnable != null) {
            runnable.run();
        }
        this.d2 = false;
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
            i11 = H9;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            d(i11);
            return;
        }
        this.d2 = true;
        this.N7 = i11;
        r0 r0Var = this.n;
        if (r0Var == null || r0Var.a != 0 || r0Var.f != i11) {
            setSceneFromCard(t(i11));
        }
        this.P7 = 0.0f;
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
                String o10 = a1.g.o(j10, "c:");
                HashMap hashMap = this.J;
                if (!hashMap.containsKey(o10)) {
                    r5 n10 = r5.n(this.b, j10, null, 2);
                    n10.a(this);
                    hashMap.put(o10, n10);
                }
                if (!arrayList2.contains(o10)) {
                    arrayList2.add(o10);
                }
            } else if (reaction instanceof TLRPC.TL_reactionEmoji) {
                TLRPC.TL_reactionEmoji tL_reactionEmoji = (TLRPC.TL_reactionEmoji) reaction;
                if (!TextUtils.isEmpty(tL_reactionEmoji.emoticon)) {
                    String str = tL_reactionEmoji.emoticon;
                    String replace = (str == null || str.startsWith("c:")) ? str : str.replace("️", "");
                    this.b2.put(replace, str);
                    if (!arrayList2.contains(replace)) {
                        arrayList2.add(replace);
                    }
                }
            }
        }
        c();
        this.d2 = false;
    }

    public final void e0(int i10, int[] iArr) {
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
        float y3 = k3.y(f10, f7, 1.0f - ((float) Math.pow(1.0f - f11, this.W2)), f7);
        return Math.abs(f10 - y3) < 0.002f ? f10 : y3;
    }

    public final int f0() {
        int size = this.v1.size();
        if (!this.x1 || size <= 0 || size >= 3) {
            return 3;
        }
        return size;
    }

    public final r5 g0(long j10, TLRPC.Document document) {
        Long valueOf = Long.valueOf(j10);
        HashMap hashMap = this.K7;
        r5 r5Var = (r5) hashMap.get(valueOf);
        if (r5Var != null) {
            return r5Var;
        }
        r5 m10 = r5.m(this.b, 24, document);
        m10.a(this);
        hashMap.put(Long.valueOf(j10), m10);
        return m10;
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
                String str2 = (String) this.b2.get(str);
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
        r0 r0Var = this.n;
        if (r0Var == null || r0Var.a != 0) {
            return -1;
        }
        return r0Var.f;
    }

    public TL_stars.TL_starGiftUnique getThemeGift() {
        int i10;
        q0 q0Var = this.F;
        if (q0Var.a != 2 || (i10 = q0Var.q) < 0) {
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

    public final void i1(e eVar) {
        f fVar = this.s0;
        if (fVar.q != 2 || fVar.o >= 1.0f) {
            postDelayed(new uf.c(28, this, eVar), 40L);
        } else {
            fVar.m = eVar;
            invalidate();
        }
    }

    public final boolean j0(Canvas canvas) {
        if (i()) {
            return (this.T4 || SharedConfig.getDevicePerformanceClass() == 2) && canvas.isHardwareAccelerated() && u.e(this.H1);
        }
        return false;
    }

    public final float j1(int i10) {
        if (i10 != this.W7) {
            return 1.0f;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (this.Y7 < this.X7) {
            float clamp01 = 1.0f - Utilities.clamp01((currentAnimationTimeMillis - r6) / 110.0f);
            return 1.0f - ((1.0f - (clamp01 * clamp01)) * 0.08f);
        }
        double g12 = g1((currentAnimationTimeMillis - r4) / 1000.0f, 0.6d, 0.28d);
        if (currentAnimationTimeMillis - this.Y7 > 900) {
            this.W7 = -1;
            return 1.0f;
        }
        float f7 = this.Z7;
        return ((1.0f - f7) * ((float) g12)) + f7;
    }

    public final float l() {
        return AndroidUtilities.lerp(1.07f, 1.0f, this.B2) * getWidth() * 0.745f;
    }

    public final void l0() {
        if (this.V8 == null) {
            this.u1 = 0L;
            return;
        }
        this.u1 = 0L;
        if (this.O8) {
            this.O8 = false;
            this.N8 = AnimationUtils.currentAnimationTimeMillis();
        }
        this.W8 = true;
        invalidate();
    }

    public final s0 l1(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        Long valueOf = Long.valueOf(tL_starGiftUnique.id);
        HashMap hashMap = this.L7;
        s0 s0Var = (s0) hashMap.get(valueOf);
        if (s0Var == null) {
            s0Var = new s0();
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
                p5 p5Var = new p5(AndroidUtilities.dp(28.0f), this);
                s0Var.a = p5Var;
                p5Var.i(document, false);
                s0Var.a.a();
                s0Var.b = document.id;
            }
            hashMap.put(Long.valueOf(tL_starGiftUnique.id), s0Var);
        }
        return s0Var;
    }

    public final float m() {
        float max = ((1.0f - Math.max(this.I2, this.B2)) * AndroidUtilities.dp(16.0f)) + (((getHeight() * 0.468f) - (l() / 2.0f)) - AndroidUtilities.dp(15.0f));
        return AndroidUtilities.lerp(max, Math.max(AndroidUtilities.dp(51.0f) + this.t3, Math.min(max, (((Z0() - a1()) - AndroidUtilities.dp(13.0f)) - (AndroidUtilities.dp(35.0f) * Math.max(this.I2, this.B2))) - l())), this.f1);
    }

    public final PorterDuffColorFilter m1(int i10) {
        SparseArray sparseArray = this.f7;
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

    public final boolean n() {
        String str;
        return (this.X8 != R.drawable.msg_retry || (str = this.V8) == null || s0(str)) ? false : true;
    }

    public final boolean n0(float f7, float f10) {
        if (this.p1 == null || !this.O8) {
            return false;
        }
        RectF rectF = this.M8;
        if (rectF.isEmpty()) {
            return false;
        }
        float f11 = rectF.right;
        float dp = AndroidUtilities.dp(15.0f);
        TextPaint textPaint = this.x2;
        textPaint.setTextSize(dp);
        float measureText = (f11 - textPaint.measureText(this.p1)) - AndroidUtilities.dp(28.0f);
        float dp2 = rectF.top - AndroidUtilities.dp(6.0f);
        float dp3 = rectF.right + AndroidUtilities.dp(6.0f);
        float dp4 = rectF.bottom + AndroidUtilities.dp(6.0f);
        RectF rectF2 = this.q1;
        rectF2.set(measureText, dp2, dp3, dp4);
        return rectF2.contains(f7, f10);
    }

    public final float o() {
        return l() + m() + AndroidUtilities.dp(24.0f);
    }

    public final void o0(Canvas canvas, Drawable drawable, float f7, float f10, float f11, float f12) {
        drawable.setColorFilter(m1(-1));
        drawable.setAlpha((int) (f12 * 255.0f));
        float f13 = f11 / 2.0f;
        drawable.setBounds((int) (f7 - f13), (int) (f10 - f13), (int) (f7 + f13), (int) (f10 + f13));
        drawable.draw(canvas);
    }

    public final uj0 o1() {
        if (this.a9 == null) {
            uj0 uj0Var = new uj0(R.raw.contact_check, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f));
            this.a9 = uj0Var;
            uj0Var.setColorFilter(new ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.2126f, 0.7152f, 0.0722f, 1.0f, -255.0f}));
            this.a9.K(0);
            this.a9.R(this);
            this.a9.J(true);
        }
        return this.a9;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        K0();
        int i10 = this.z6;
        SparseIntArray sparseIntArray = this.y6;
        if (i10 != 1) {
            sparseIntArray.clear();
            this.z6 = 1;
        }
        int i11 = 0;
        while (true) {
            int[] iArr = a.b;
            if (i11 >= iArr.length) {
                break;
            }
            r0 r0Var = new r0();
            int i12 = iArr[i11] | (-16777216);
            r0Var.b = i12;
            r0Var.c = (-16777216) | a.c[i11];
            r0Var.h = Y0(i12);
            if (sparseIntArray.indexOfKey(r0Var.b) < 0) {
                sparseIntArray.put(r0Var.b, u(r0Var));
            }
            i11++;
        }
        NotificationCenter.getInstance(this.b).addObserver(this.i2, NotificationCenter.starUserGiftsLoaded);
        y0();
        SensorManager sensorManager = (SensorManager) getContext().getSystemService("sensor");
        this.O6 = sensorManager;
        Sensor defaultSensor = sensorManager != null ? sensorManager.getDefaultSensor(9) : null;
        if (defaultSensor != null) {
            this.O6.registerListener(this.P6, defaultSensor, 1);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.b).removeObserver(this.i2, NotificationCenter.starUserGiftsLoaded);
        removeCallbacks(this.j2);
        SensorManager sensorManager = this.O6;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.P6);
        }
        this.M6 = false;
        this.s9 = -1;
        Arrays.fill(this.y9, 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:230:0x093e  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0a3b  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0a53  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0aa4  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0bc0  */
    /* JADX WARN: Removed duplicated region for block: B:305:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0a9d  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0943  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0996  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x09e3  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x09ed  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0a0b  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x099d  */
    /* JADX WARN: Type inference failed for: r31v0 */
    /* JADX WARN: Type inference failed for: r31v1 */
    /* JADX WARN: Type inference failed for: r31v2 */
    /* JADX WARN: Type inference failed for: r4v65, types: [android.graphics.RectF, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v95, types: [android.graphics.RectF] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        boolean z10;
        int i10;
        float f14;
        float f15;
        int i11;
        float f16;
        float f17;
        float f18;
        float f19;
        int i12;
        float f20;
        float lerp;
        float f21;
        float lerp2;
        t0 t0Var;
        float sin;
        float T;
        float f22;
        float f23;
        float f24;
        boolean z11;
        long j10;
        boolean z12;
        long j11;
        RectF rectF;
        float f25;
        this.G2 = true;
        float f26 = this.A2 ? 1.0f : 0.0f;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        float f27 = this.D2;
        if (f26 != f27) {
            if (f26 == 1.0f && f27 == 0.0f && this.B2 <= 0.001f) {
                this.o5 = true;
                this.n5 = null;
            } else if (f26 == 0.0f && this.B2 >= 0.999f) {
                this.o5 = false;
            }
            this.D2 = f26;
            this.C2 = this.B2;
            this.E2 = currentAnimationTimeMillis;
        }
        if (this.B2 != f26) {
            f7 = 0.0f;
            float clamp01 = Utilities.clamp01((currentAnimationTimeMillis - this.E2) / 300.0f);
            float C = clamp01 < 0.5f ? k3.C(clamp01, 4.0f, clamp01, clamp01) : 1.0f - (((float) Math.pow((clamp01 * (-2.0f)) + 2.0f, 3.0d)) / 2.0f);
            if (clamp01 < 1.0f) {
                f26 = AndroidUtilities.lerp(this.C2, f26, C);
            }
            this.B2 = f26;
            if (f26 <= 0.0f) {
                this.o5 = false;
            }
            invalidate();
        } else {
            f7 = 0.0f;
        }
        float f28 = this.K0 ? 1.0f : f7;
        long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
        float f29 = this.K2;
        if (f29 < f7) {
            this.K2 = f28;
            this.I2 = f28;
        } else {
            if (f28 != f29) {
                this.K2 = f28;
                this.J2 = this.I2;
                this.L2 = currentAnimationTimeMillis2;
            }
            if (this.I2 != f28) {
                float clamp012 = Utilities.clamp01((currentAnimationTimeMillis2 - this.L2) / 320.0f);
                float C2 = clamp012 < 0.5f ? k3.C(clamp012, 4.0f, clamp012, clamp012) : 1.0f - (((float) Math.pow((clamp012 * (-2.0f)) + 2.0f, 3.0d)) / 2.0f);
                if (clamp012 < 1.0f) {
                    f28 = AndroidUtilities.lerp(this.J2, f28, C2);
                }
                this.I2 = f28;
                invalidate();
            }
        }
        this.U2 = !this.T4 && this.T2 == 0 && !this.S2 && SharedConfig.getDevicePerformanceClass() == 2;
        long currentTimeMillis = System.currentTimeMillis();
        int width = getWidth();
        int height = getHeight();
        float min = this.V2 == 0 ? 1.0f : Math.min(3.0f, (currentTimeMillis - r3) / 16.667f);
        this.V2 = currentTimeMillis;
        this.W2 = min;
        float f30 = this.s;
        u3.c cVar = this.c;
        if (f30 < 1.0f) {
            f10 = 4.0f;
            float min2 = Math.min(1.0f, (currentTimeMillis - this.v) / 600.0f);
            this.s = min2;
            if (f30 < 0.3f && min2 >= 0.3f && cVar != null) {
                this.n.getClass();
                ((f0) cVar.a).W();
            }
            if (this.s >= 1.0f) {
                this.r = null;
            }
        } else {
            f10 = 4.0f;
        }
        long currentAnimationTimeMillis3 = AnimationUtils.currentAnimationTimeMillis();
        OverScroller overScroller = this.l9;
        if (overScroller.isFinished() || !overScroller.computeScrollOffset()) {
            f11 = f10;
        } else {
            f11 = f10;
            this.j1 = Math.max(f7, Math.min(z0(), overScroller.getCurrY()));
        }
        float f31 = this.g1;
        if (f31 != this.y7) {
            if (f31 < 0.5f) {
                this.e6 = currentAnimationTimeMillis3;
            } else if (this.f1 < 0.35f) {
                this.f6 = false;
            }
            if (f31 > 0.5f) {
                this.H2 = currentAnimationTimeMillis3;
            }
            this.y7 = f31;
            this.x7 = this.f1;
            this.w7 = currentAnimationTimeMillis3;
        }
        float f32 = (currentAnimationTimeMillis3 - this.w7) / 1000.0f;
        bs bsVar = S9;
        if (f31 > 0.5f) {
            float lerp3 = AndroidUtilities.lerp(this.x7, 1.0f, bsVar.getInterpolation(Utilities.clamp01(f32 / 0.42f)));
            this.f1 = lerp3;
            this.z7 = Utilities.clamp01(Utilities.clamp01(lerp3) / 0.8f);
            f12 = 0.5f;
            f13 = 1000.0f;
            z10 = 0;
        } else {
            f12 = 0.5f;
            f13 = 1000.0f;
            z10 = 0;
            this.z7 = Math.min(this.z7, (float) Math.pow(1.0f - Utilities.clamp01(f32 / 0.17f), 1.7000000476837158d));
            this.f1 = AndroidUtilities.lerp(this.x7, 0.0f, bsVar.getInterpolation(Utilities.clamp01(f32 / 0.36f)));
        }
        this.O7 = f(this.O7, this.P7, 0.25f);
        r0 r0Var = this.n;
        if (r0Var != null && r0Var.a == 0) {
            i10 = z10;
            while (i10 < a.b.length) {
                if (d1(i10) == this.n.f) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        i10 = -100;
        int i13 = this.v8;
        if (i10 != i13) {
            float f33 = i10 == this.w8 ? this.y8 : 0.0f;
            this.w8 = i13;
            this.y8 = this.x8;
            this.v8 = i10;
            this.x8 = f33;
        }
        this.x8 = f(this.x8, 1.0f, 0.2f);
        this.y8 = f(this.y8, 0.0f, 0.2f);
        long currentAnimationTimeMillis4 = AnimationUtils.currentAnimationTimeMillis();
        float f34 = this.l1;
        if (f34 != this.D8) {
            this.D8 = f34;
            this.C8 = Math.max(this.F8, this.G8);
            this.A8 = currentAnimationTimeMillis4;
        }
        float f35 = (currentAnimationTimeMillis4 - this.A8) / f13;
        if (this.l1 > f12) {
            float f36 = this.C8;
            this.F8 = f35 > 0.7f ? 1.0f : ((1.0f - f36) * ((float) g1(f35, 0.78d, 0.3d))) + f36;
            this.G8 = f35 > 0.7f ? 1.0f : ((1.0f - f36) * ((float) g1(f35 - 0.02d, 0.8d, 0.34d))) + f36;
        } else {
            float clamp013 = Utilities.clamp01(f35 / 0.2f);
            float clamp014 = Utilities.clamp01(f35 / 0.17f);
            float f37 = this.C8;
            this.F8 = (1.0f - ((3.0f - (clamp014 * 2.0f)) * (clamp014 * clamp014))) * f37;
            this.G8 = (1.0f - ((3.0f - (clamp013 * 2.0f)) * (clamp013 * clamp013))) * f37;
        }
        float max = Math.max(0.004f, this.W2 * 0.016667f);
        float f38 = this.G8;
        this.H8 = (f38 - this.I8) / max;
        this.I8 = f38;
        float max2 = Math.max(0.0f, Math.max(this.F8, f38));
        this.k1 = max2;
        if (this.E8 > 0.001f && max2 <= 0.001f) {
            this.B8 = currentAnimationTimeMillis4;
        }
        this.E8 = max2;
        this.i1 = f(this.i1, this.h1, 0.25f);
        boolean z13 = (this.m1 == null || currentTimeMillis >= this.u1) ? z10 : true;
        this.t1 = f(this.t1, z13 ? 1.0f : 0.0f, z13 ? 0.2f : this.l1 > f12 ? 0.4f : 0.16f);
        float lerp4 = AndroidUtilities.lerp(this.C0, this.D0, 1.0f - ((float) Math.pow(1.0f - Math.min(1.0f, (currentTimeMillis - this.E0) / (this.D0 > this.C0 ? 340L : 380L)), 3.0d)));
        this.B0 = lerp4;
        boolean z14 = this.v0;
        if (z14 && lerp4 >= 0.999f) {
            this.F0 = true;
        }
        if (z14) {
            if (this.w0) {
                f25 = Utilities.clamp01((this.A0 ? 60000L : Math.max(0L, this.z0 - currentTimeMillis)) / 60000.0f);
            } else {
                f25 = 1.0f;
            }
            this.G0 = f25;
            if (this.w0 && !this.A0 && currentTimeMillis >= this.z0) {
                T0(LocaleController.getString(R.string.QrNoPaidToastExpired));
            }
        }
        t1(true);
        long nanoTime = System.nanoTime();
        float min3 = this.N6 == 0 ? 0.016f : Math.min(0.1f, (nanoTime - r5) / 1.0E9f);
        this.N6 = nanoTime;
        if (this.M6) {
            float exp = 1.0f - ((float) Math.exp((-min3) / f11));
            float f39 = this.K6;
            float f40 = this.I6;
            float y3 = k3.y(f40, f39, exp, f39);
            this.K6 = y3;
            float f41 = this.L6;
            this.L6 = k3.y(this.J6, f41, exp, f41);
            f14 = Math.max(-1.0f, Math.min(1.0f, (-(f40 - y3)) / 4.9f));
            f15 = Math.max(-1.0f, Math.min(1.0f, (this.J6 - this.L6) / 4.9f));
        } else {
            f14 = 0.0f;
            f15 = 0.0f;
        }
        float exp2 = 1.0f - ((float) Math.exp((-min3) / 0.08f));
        float f42 = this.G6;
        this.G6 = k3.y(f14, f42, exp2, f42);
        float f43 = this.H6;
        this.H6 = k3.y(f15, f43, exp2, f43);
        float[] fArr = v0.b;
        float f44 = fArr[z10];
        this.E6 = Math.round(r3 / r5) * (f44 > 0.0f ? f12 / f44 : 1.0f);
        float round = Math.round(this.H6 * 40.0f) / 40.0f;
        this.F6 = round;
        q10.i = this.E6 * fArr[z10];
        q10.j = (round * fArr[1]) / 100.0f;
        float f45 = this.c6;
        q0 q0Var = this.F;
        this.c6 = f(f45, (q0Var == null || q0Var.a == 0) ? 0.0f : 1.0f, 0.12f);
        if (u.f()) {
            canvas.isHardwareAccelerated();
        }
        if (i() && ((this.T4 || SharedConfig.getDevicePerformanceClass() == 2) && canvas.isHardwareAccelerated())) {
            if (this.G1 == null) {
                this.G1 = android.support.v4.media.session.x.d("qrBg");
                RenderNode d = android.support.v4.media.session.x.d("qrBlur");
                this.H1 = d;
                float dpf2 = AndroidUtilities.dpf2(17.6f) / 9.0f;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                u.j(d, dpf2);
            }
            i11 = height;
            z(u.a(width, i11, this.G1), width, i11);
            u.d(this.G1);
            if (this.I1 != 1) {
                this.I1 = 1;
                Object obj = this.H1;
                float max3 = Math.max(f12, AndroidUtilities.dpf2(fArr[2]) / 9.0f);
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                u.j(obj, max3);
            }
            Canvas a2 = u.a((width + 8) / 9, (i11 + 8) / 9, this.H1);
            a2.scale(0.11111111f, 0.11111111f);
            u.c(a2, this.G1);
            u.d(this.H1);
            u.c(canvas, this.G1);
        } else {
            i11 = height;
            z(canvas, width, i11);
        }
        A(canvas, width);
        this.S4 = this.R4 < 1.0f ? Utilities.clamp01(this.V4) : 1.0f;
        float currentActionBarHeight = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + this.t3;
        RectF rectF2 = this.h7;
        rectF2.set(AndroidUtilities.dp(29.0f) - AndroidUtilities.dp(20.0f), currentActionBarHeight - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(29.0f), AndroidUtilities.dp(20.0f) + currentActionBarHeight);
        float T2 = T(this.S4);
        canvas.save();
        canvas.scale(T2, T2, rectF2.centerX(), rectF2.centerY());
        J(canvas, rectF2, AndroidUtilities.dp(20.0f), 1.0f);
        M(canvas, 3, rectF2, z10);
        g2 g2Var = this.W1;
        g2Var.a(-1);
        canvas.save();
        canvas.translate(rectF2.centerX() - (AndroidUtilities.dp(24.0f) / 2.0f), currentActionBarHeight - (AndroidUtilities.dp(24.0f) / 2.0f));
        g2Var.draw(canvas);
        canvas.restore();
        canvas.restore();
        if (this.m7) {
            f16 = 40.0f;
            f17 = 0.004f;
            f18 = 20.0f;
            f19 = 10.0f;
            i12 = width;
        } else {
            float dp = AndroidUtilities.dp(14.0f);
            Paint paint = this.U1;
            paint.setTextSize(dp);
            float dp2 = AndroidUtilities.dp(6.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(12.0f);
            f19 = 10.0f;
            String str = this.V1;
            f16 = 40.0f;
            f17 = 0.004f;
            f18 = 20.0f;
            RectF rectF3 = this.k7;
            rectF3.set((getWidth() - AndroidUtilities.dp(9.0f)) - ((paint.measureText(str) + dp2) + AndroidUtilities.dp(14.0f)), currentActionBarHeight - AndroidUtilities.dp(20.0f), getWidth() - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(20.0f) + currentActionBarHeight);
            canvas.save();
            canvas.scale(T2, T2, rectF3.centerX(), rectF3.centerY());
            J(canvas, rectF3, AndroidUtilities.dp(20.0f), 1.0f);
            M(canvas, 5, rectF3, false);
            i12 = width;
            o0(canvas, this.N1, rectF3.left + AndroidUtilities.dp(12.0f) + AndroidUtilities.dp(10.0f), currentActionBarHeight, AndroidUtilities.dp(20.0f), 1.0f);
            paint.setColor(-1);
            Paint.FontMetrics fontMetrics = paint.getFontMetrics();
            canvas.drawText(str, rectF3.left + AndroidUtilities.dp(12.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(6.0f), currentActionBarHeight - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f), paint);
            canvas.restore();
        }
        float clamp015 = 1.0f - Utilities.clamp01(this.f1 * 2.2f);
        long currentAnimationTimeMillis5 = AnimationUtils.currentAnimationTimeMillis();
        boolean z15 = this.l1 > 0.5f;
        if (z15 != this.n7) {
            this.n7 = z15;
            this.p7 = this.o7;
            this.q7 = currentAnimationTimeMillis5;
        }
        float clamp016 = Utilities.clamp01((currentAnimationTimeMillis5 - this.q7) / 220.0f);
        if (z15) {
            f20 = 220.0f;
            lerp = AndroidUtilities.lerp(this.p7, 0.0f, clamp016 * clamp016);
        } else {
            f20 = 220.0f;
            lerp = AndroidUtilities.lerp(this.p7, 1.0f, Math.min(1.0f, S(clamp016, 0.6f)));
        }
        this.o7 = lerp;
        if (clamp016 < 1.0f) {
            invalidate();
        }
        float clamp017 = Utilities.clamp01(Utilities.clamp01(this.o7) * 2.0f);
        float lerp5 = AndroidUtilities.lerp(0.6f, 1.0f, this.o7);
        boolean z16 = z15 || (this.v0 && this.w0);
        if (z16 != this.r7) {
            this.r7 = z16;
            this.t7 = this.s7;
            this.u7 = currentAnimationTimeMillis5;
        }
        float clamp018 = Utilities.clamp01((currentAnimationTimeMillis5 - this.u7) / f20);
        if (z16) {
            lerp2 = AndroidUtilities.lerp(this.t7, 0.0f, clamp018 * clamp018);
            f21 = 1.0f;
        } else {
            f21 = 1.0f;
            lerp2 = AndroidUtilities.lerp(this.t7, 1.0f, Math.min(1.0f, S(clamp018, 0.6f)));
        }
        this.s7 = lerp2;
        if (clamp018 < f21) {
            invalidate();
        }
        float lerp6 = AndroidUtilities.lerp(0.6f, f21, this.s7);
        float min4 = Math.min(clamp015, Utilities.clamp01(Utilities.clamp01(this.s7) * 2.0f));
        boolean z17 = this.f1 <= 0.001f;
        if (min4 > 0.0f || clamp015 > 0.0f || z17) {
            float height2 = (getHeight() - this.u3) - AndroidUtilities.dp(f16);
            int width2 = getWidth();
            int dp3 = AndroidUtilities.dp(f18);
            float dp4 = AndroidUtilities.dp(42.0f) - dp3;
            float f46 = dp3;
            float f47 = height2 - f46;
            boolean z18 = z17;
            float dp5 = AndroidUtilities.dp(42.0f) + dp3;
            float f48 = f46 + height2;
            RectF rectF4 = this.i7;
            rectF4.set(dp4, f47, dp5, f48);
            float B = org.telegram.messenger.g0.B(42.0f, width2, dp3);
            float D = kk.D(42.0f, width2, dp3);
            RectF rectF5 = this.j7;
            rectF5.set(B, f47, D, f48);
            float f49 = width2 / 2.0f;
            RectF rectF6 = this.l7;
            rectF6.set(f49 - AndroidUtilities.dp(72.0f), height2 - AndroidUtilities.dp(f18), f49 + AndroidUtilities.dp(72.0f), AndroidUtilities.dp(f18) + height2);
            float T3 = T(this.S4) * AndroidUtilities.lerp(0.6f, 1.0f, clamp015);
            if (min4 > 0.0f) {
                canvas.save();
                float f50 = T3 * lerp6;
                canvas.scale(f50, f50, rectF4.centerX(), height2);
                J(canvas, rectF4, AndroidUtilities.dp(f18), min4);
                M(canvas, 4, rectF4, false);
                o0(canvas, this.L1, rectF4.centerX(), height2, AndroidUtilities.dp(22.0f), min4);
                canvas.restore();
                canvas.save();
                float f51 = T3 * lerp5;
                canvas.scale(f51, f51, rectF5.centerX(), height2);
                J(canvas, rectF5, AndroidUtilities.dp(f18), min4);
                M(canvas, 11, rectF5, false);
                o0(canvas, this.M1, rectF5.centerX(), height2, AndroidUtilities.dp(24.0f), min4);
                canvas.restore();
            }
            if (z18 && clamp017 > 0.0f && this.a) {
                float T4 = T(this.S4) * lerp5;
                canvas.save();
                canvas.scale(T4, T4, rectF6.centerX(), rectF6.centerY());
                float f52 = clamp017;
                J(canvas, rectF6, AndroidUtilities.dp(f18), f52);
                float width3 = rectF6.width() / 3.0f;
                canvas.save();
                Path path = this.E1;
                path.rewind();
                path.addRoundRect(rectF6, AndroidUtilities.dp(f18), AndroidUtilities.dp(f18), Path.Direction.CW);
                canvas.clipPath(path);
                int i14 = 0;
                while (i14 < 3) {
                    float f53 = rectF6.left;
                    float f54 = (i14 * width3) + f53;
                    float f55 = rectF6.top;
                    int i15 = i14 + 1;
                    float f56 = (i15 * width3) + f53;
                    float f57 = rectF6.bottom;
                    int i16 = i14;
                    RectF rectF7 = this.d7;
                    rectF7.set(f54, f55, f56, f57);
                    M(canvas, i16 + 6, rectF7, false);
                    i14 = i15;
                }
                canvas.restore();
                int i17 = 0;
                while (i17 < 3) {
                    o0(canvas, this.g7[i17], kk.b(i17, 0.5f, width3, rectF6.left), height2, AndroidUtilities.dp(i17 == 1 ? 24.5f : 22.0f), f52);
                    i17++;
                    f52 = f52;
                }
                t0Var = this;
                canvas.restore();
                if (t0Var.k1 <= 0.001f) {
                    K(canvas);
                } else {
                    if (t0Var.B8 != 0) {
                        float currentAnimationTimeMillis6 = (AnimationUtils.currentAnimationTimeMillis() - t0Var.B8) / f13;
                        if (currentAnimationTimeMillis6 <= 0.45f) {
                            sin = ((float) Math.sin((currentAnimationTimeMillis6 * 6.283185307179586d) / 0.17000000178813934d)) * ((float) Math.exp((-currentAnimationTimeMillis6) / 0.11f)) * 0.07f;
                            T = t0Var.T(t0Var.R4 >= 1.0f ? Utilities.clamp01(t0Var.V4) : 1.0f) * j(0.06f, 0.02f, t0Var.l2);
                            if (t0Var.p2 > 0 || t0Var.v0) {
                                f22 = T;
                                f23 = 1.0f;
                            } else {
                                f22 = T;
                                float currentAnimationTimeMillis7 = (AnimationUtils.currentAnimationTimeMillis() - t0Var.p2) / 180.0f;
                                f23 = 1.0f;
                                if (currentAnimationTimeMillis7 < 1.0f) {
                                    f24 = ((((float) Math.sin(currentAnimationTimeMillis7 * 3.141592653589793d)) * 0.04f) + 1.0f) * f22;
                                    t0Var.invalidate();
                                    z11 = sin == 0.0f || f24 != f23;
                                    if (z11) {
                                        canvas.save();
                                        float f58 = ((sin * 0.5f) + f23) * f24;
                                        float f59 = (f23 - sin) * f24;
                                        RectF rectF8 = t0Var.K5;
                                        canvas.scale(f58, f59, rectF8.centerX(), rectF8.centerY());
                                    }
                                    t0Var.B(canvas, i12);
                                    if (z11) {
                                        canvas.restore();
                                    }
                                }
                            }
                            f24 = f22;
                            if (sin == 0.0f) {
                            }
                            if (z11) {
                            }
                            t0Var.B(canvas, i12);
                            if (z11) {
                            }
                        }
                    }
                    sin = 0.0f;
                    T = t0Var.T(t0Var.R4 >= 1.0f ? Utilities.clamp01(t0Var.V4) : 1.0f) * j(0.06f, 0.02f, t0Var.l2);
                    if (t0Var.p2 > 0) {
                    }
                    f22 = T;
                    f23 = 1.0f;
                    f24 = f22;
                    if (sin == 0.0f) {
                    }
                    if (z11) {
                    }
                    t0Var.B(canvas, i12);
                    if (z11) {
                    }
                }
                t0Var.N(canvas, i12, i11);
                long currentAnimationTimeMillis8 = AnimationUtils.currentAnimationTimeMillis();
                if (t0Var.f9 == 0 && t0Var.O8 && t0Var.V8 != null && t0Var.g1 == 0.0f && t0Var.f1 > 0.001f) {
                    rectF = t0Var.M8;
                    if (!rectF.isEmpty()) {
                        t0Var.f9 = currentAnimationTimeMillis8;
                        t0Var.g9 = rectF.centerY();
                        t0Var.m1 = null;
                        j10 = 0;
                        t0Var.u1 = 0L;
                        if (t0Var.f9 != j10) {
                            float f60 = (currentAnimationTimeMillis8 - r9) / 140.0f;
                            if (f60 >= 1.0f) {
                                z12 = false;
                                j11 = 0;
                            } else if (t0Var.V8 == null) {
                                j11 = 0;
                                z12 = false;
                            } else {
                                t0Var.invalidate();
                                float f61 = i12;
                                canvas.saveLayerAlpha(0.0f, 0.0f, f61, i11, (int) ((1.0f - f60) * 255.0f));
                                float f62 = 1.0f - (f60 * 0.08f);
                                canvas.scale(f62, f62, f61 / 2.0f, t0Var.g9);
                                t0Var.h9 = true;
                                t0Var.R(canvas, i12, currentTimeMillis);
                                t0Var.h9 = false;
                                canvas.restore();
                            }
                            t0Var.f9 = j11;
                            t0Var.O8 = z12;
                            t0Var.V8 = null;
                        } else {
                            t0Var.R(canvas, i12, currentTimeMillis);
                        }
                        if (cVar != null) {
                            f0 f0Var = (f0) cVar.a;
                            boolean z19 = t0Var.f1 > 0.01f && t0Var.z7 > f17 && t0Var.h1 == 1;
                            float dp6 = ((1.0f - t0Var.z7) * AndroidUtilities.dp(14.0f)) + (t0Var.Z0() - t0Var.a1()) + AndroidUtilities.dp(8.0f);
                            float f63 = t0Var.z7;
                            ?? r42 = t0Var.J7;
                            ?? r52 = t0Var.A7;
                            boolean z20 = z19 && !r52.equals(r42);
                            r0 r0Var2 = t0Var.n;
                            int i18 = r0Var2 != null ? r0Var2.b : 0;
                            boolean z21 = z19 && i18 != t0Var.I7;
                            if (z19 != t0Var.H7 || z20 || z21 || (z19 && (Math.abs(dp6 - t0Var.F7) > 0.5f || Math.abs(f63 - t0Var.G7) > 0.01f))) {
                                t0Var.I7 = i18;
                                r42.set(r52);
                                t0Var.H7 = z19;
                                t0Var.F7 = dp6;
                                t0Var.G7 = f63;
                                f0Var.b0(dp6, f63, z19);
                                AndroidUtilities.dp(f19);
                                t0Var.getWidth();
                                AndroidUtilities.dp(f19);
                                t0Var.Z0();
                                float f64 = ((RectF) r52).left;
                                float f65 = ((RectF) r52).top;
                                float f66 = ((RectF) r52).right;
                                float f67 = ((RectF) r52).bottom;
                                float min5 = Math.min(r52.height() / 2.0f, AndroidUtilities.lerp(AndroidUtilities.dp(f18), AndroidUtilities.dp(28.17f), Utilities.clamp01(t0Var.f1)));
                                f0Var.n = f64;
                                f0Var.r = f65;
                                f0Var.s = f66;
                                f0Var.v = f67;
                                f0Var.w = min5;
                                if (f0Var.h != null) {
                                    float min6 = Math.min(r1.getHeight(), f0Var.v - (f0Var.h.getTranslationY() + f0Var.h.getTop()));
                                    c cVar2 = f0Var.x;
                                    if (cVar2 != null) {
                                        cVar2.G = min6;
                                    }
                                    f0Var.I = min6;
                                    if (cVar2 != null) {
                                        cVar2.U = f0Var.s - cVar2.getLeft();
                                    }
                                    m mVar = f0Var.X;
                                    if (mVar != null) {
                                        mVar.invalidate();
                                    }
                                    f0Var.h.invalidateOutline();
                                }
                                c cVar3 = f0Var.x;
                                if (cVar3 != null) {
                                    cVar3.invalidateOutline();
                                }
                            }
                        }
                        t0Var.invalidate();
                        t0Var.U2 = false;
                        if (t0Var.T4) {
                            return;
                        }
                        t0Var.T2++;
                        return;
                    }
                }
                j10 = 0;
                if (t0Var.f9 != j10) {
                }
                if (cVar != null) {
                }
                t0Var.invalidate();
                t0Var.U2 = false;
                if (t0Var.T4) {
                }
            }
        }
        t0Var = this;
        if (t0Var.k1 <= 0.001f) {
        }
        t0Var.N(canvas, i12, i11);
        long currentAnimationTimeMillis82 = AnimationUtils.currentAnimationTimeMillis();
        if (t0Var.f9 == 0) {
            rectF = t0Var.M8;
            if (!rectF.isEmpty()) {
            }
        }
        j10 = 0;
        if (t0Var.f9 != j10) {
        }
        if (cVar != null) {
        }
        t0Var.invalidate();
        t0Var.U2 = false;
        if (t0Var.T4) {
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int top;
        int top2;
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = AndroidUtilities.statusBarHeight;
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
        this.t3 = Math.max(Math.max(0, i14 - top), (AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(9.0f)) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2));
        int height = getRootView().getHeight();
        View view2 = this;
        int i16 = 0;
        while (true) {
            top2 = view2.getTop() + i16;
            if (!(view2.getParent() instanceof View)) {
                break;
            }
            view2 = (View) view2.getParent();
            i16 = top2 - view2.getScrollY();
        }
        this.u3 = org.telegram.messenger.g0.b(20.0f, AndroidUtilities.dp(22.0f), Math.max(0, AndroidUtilities.navigationBarHeight - (height - (getHeight() + top2))));
        if (Build.VERSION.SDK_INT < 29 || !z10) {
            return;
        }
        int i17 = i12 - i10;
        int l4 = (int) ((l() / 2.0f) + m());
        int dp = AndroidUtilities.dp(100.0f);
        int dp2 = AndroidUtilities.dp(24.0f);
        ArrayList arrayList = this.s3;
        arrayList.clear();
        int i18 = l4 - dp;
        int i19 = l4 + dp;
        arrayList.add(new Rect(0, i18, dp2, i19));
        arrayList.add(new Rect(i17 - dp2, i18, i17, i19));
        setSystemGestureExclusionRects(arrayList);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (i10 > 0 && i11 > 0) {
            float dp = AndroidUtilities.dp(12.0f);
            int ceil = ((int) Math.ceil(i10 / dp)) + 1;
            int ceil2 = ((int) Math.ceil(i11 / dp)) + 1;
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
        r0 r0Var;
        boolean z12;
        i0 i0Var;
        VelocityTracker velocityTracker;
        RippleDrawable rippleDrawable;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (motionEvent.getActionMasked() == 0) {
            this.r1 = n0(x10, y3);
        }
        boolean z13 = this.r1;
        u3.c cVar = this.c;
        if (z13) {
            if (motionEvent.getActionMasked() == 1) {
                this.r1 = false;
                if (n0(x10, y3)) {
                    this.u1 = 0L;
                    invalidate();
                    if (cVar != null) {
                        ((f0) cVar.a).presentFragment(new PremiumPreviewFragment(0, "qr_emoji"));
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
        RectF rectF = this.a8;
        RectF rectF2 = this.j7;
        RectF rectF3 = this.i7;
        RectF rectF4 = this.K5;
        RectF rectF5 = this.h7;
        RectF[] rectFArr = this.z8;
        RectF rectF6 = this.k7;
        RectF rectF7 = this.l7;
        OverScroller overScroller = this.l9;
        m0 m0Var = this.q9;
        RectF rectF8 = this.v7;
        if (actionMasked != 0) {
            ViewConfiguration viewConfiguration = this.m9;
            if (actionMasked == 1) {
                removeCallbacks(m0Var);
                P0();
                R0();
                if (this.R) {
                    this.R = false;
                    if (this.S) {
                        this.k0.addMovement(motionEvent);
                        this.k0.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
                        float xVelocity = this.k0.getXVelocity();
                        float yVelocity = this.k0.getYVelocity();
                        float hypot = (float) Math.hypot(xVelocity, yVelocity);
                        float dp = AndroidUtilities.dp(1.0f) * 2600.0f;
                        if (hypot > dp) {
                            float f11 = dp / hypot;
                            xVelocity *= f11;
                            yVelocity *= f11;
                        }
                        this.a0 = this.N;
                        this.b0 = this.O;
                        this.c0 = xVelocity;
                        this.d0 = yVelocity;
                        this.V = AnimationUtils.currentAnimationTimeMillis();
                        this.T = true;
                        Q0();
                        return true;
                    }
                    Q0();
                }
                if (this.p9 && (velocityTracker = this.n9) != null) {
                    velocityTracker.addMovement(motionEvent);
                    this.n9.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, viewConfiguration.getScaledMaximumFlingVelocity());
                    float yVelocity2 = this.n9.getYVelocity();
                    int z02 = (int) z0();
                    if (Math.abs(yVelocity2) > viewConfiguration.getScaledMinimumFlingVelocity() && z02 > 0) {
                        overScroller.fling(0, Math.round(this.j1), 0, Math.round(-yVelocity2), 0, 0, 0, z02);
                        invalidate();
                    }
                }
                if (!this.p9 && !this.o9 && Math.hypot(x10 - this.i9, y3 - this.j9) < AndroidUtilities.dp(10.0f)) {
                    if (this.m7 || !m0(rectF6, x10, y3)) {
                        if (this.k1 <= 0.5f) {
                            if (m0(rectF5, x10, y3)) {
                                if (this.f1 > 0.5f) {
                                    this.g1 = 0.0f;
                                    return true;
                                }
                                if (cVar != null) {
                                    ((f0) cVar.a).finishFragment();
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
                                            if (this.E7[i11].contains(x10, y3)) {
                                                arrayList2.remove(i11);
                                                c();
                                                i0();
                                                return true;
                                            }
                                            i11++;
                                        }
                                    } else {
                                        getWidth();
                                        float dp2 = (this.j1 + y3) - (AndroidUtilities.dp(4.0f) + rectF8.top);
                                        if (dp2 >= 0.0f) {
                                            float dp3 = x10 - (rectF8.left + AndroidUtilities.dp(4.0f));
                                            float width2 = rectF8.width() - AndroidUtilities.dp(8.0f);
                                            if (dp3 >= 0.0f && dp3 < width2) {
                                                int i12 = this.h1;
                                                if (i12 == 2) {
                                                    if (!h0()) {
                                                        float f12 = width2 / 3.0f;
                                                        float f02 = width2 / f0();
                                                        if (dp2 >= 0.0f) {
                                                            int f03 = (f0() * ((int) ((dp2 - 0.0f) / f12))) + ((int) (dp3 / f02));
                                                            if (f03 >= 0 && f03 < arrayList.size()) {
                                                                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                                                                this.T7 = currentAnimationTimeMillis;
                                                                q0 q0Var = this.F;
                                                                if (q0Var.a == 2 && q0Var.q == f03) {
                                                                    this.U7 = currentAnimationTimeMillis;
                                                                    this.R7 = -1;
                                                                    this.P7 = 0.0f;
                                                                    setSceneFromCard(t(this.N7));
                                                                    setPattern(W());
                                                                    B0();
                                                                    return true;
                                                                }
                                                                int i13 = this.M7;
                                                                if (i13 >= 0 && i13 != f03 && this.P7 > 0.5f) {
                                                                    this.R7 = i13;
                                                                    this.U7 = currentAnimationTimeMillis;
                                                                }
                                                                this.M7 = f03;
                                                                this.O7 = 0.0f;
                                                                this.P7 = 1.0f;
                                                                I0(getWidth() / 2.0f, (l() / 2.0f) + m(), f03);
                                                                B0();
                                                                return true;
                                                            }
                                                        }
                                                    } else if (rectF.contains(x10, y3)) {
                                                        i0();
                                                        if (cVar != null) {
                                                            f0.V((f0) cVar.a);
                                                            return true;
                                                        }
                                                    }
                                                } else if (i12 == 0) {
                                                    float f13 = width2 / 6.0f;
                                                    int i14 = (((int) (dp2 / f13)) * 6) + ((int) (dp3 / f13));
                                                    if (i14 >= 0 && i14 < a.b.length) {
                                                        int d12 = d1(i14);
                                                        int i15 = H9;
                                                        if (d12 != i15 || (r0Var = this.n) == null || r0Var.a != 0 || r0Var.f != i15 || this.F.a != 0) {
                                                            int d13 = d1(i14);
                                                            this.N7 = d13;
                                                            boolean z14 = this.F.a == 2;
                                                            if (z14) {
                                                                this.U7 = AnimationUtils.currentAnimationTimeMillis();
                                                                this.R7 = -1;
                                                                this.P7 = 0.0f;
                                                            }
                                                            setSceneFromCard(t(d13));
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
                                    postDelayed(new n0(this, max, 1), 200L);
                                    return true;
                                }
                                if (this.r7 || !m0(rectF3, x10, y3)) {
                                    if (!this.r7 && m0(rectF2, x10, y3) && cVar != null) {
                                        ((f0) cVar.a).c0();
                                        return true;
                                    }
                                } else if (cVar != null) {
                                    ((f0) cVar.a).d0(getCurrentLink());
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
                                this.p2 = 0L;
                                this.w0 = true;
                                this.A0 = true;
                                this.z0 = System.currentTimeMillis() + 60000;
                                this.C0 = this.B0;
                                this.D0 = 1.0f;
                                this.E0 = System.currentTimeMillis();
                                this.F0 = false;
                                this.d1 = true;
                                this.l2 = AnimationUtils.currentAnimationTimeMillis();
                                this.n2 = System.currentTimeMillis() + 340;
                                this.e = null;
                                this.u0 = null;
                                this.y2 = null;
                                t1(false);
                                c1(R.drawable.msg_recent, a0(), null);
                                i0();
                                if (cVar != null) {
                                    cVar.i(1);
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
                                    postDelayed(new n0(this, max2, 0), 200L);
                                    return true;
                                }
                            } else if (rectFArr[i16].contains(x10, y3)) {
                                this.l1 = 0.0f;
                                if (i16 == 0) {
                                    if (this.w0) {
                                        this.A0 = true;
                                        this.z0 = System.currentTimeMillis() + 60000;
                                    }
                                    this.z2 = -1;
                                    if (cVar == null || (i0Var = ((f0) cVar.a).e) == null) {
                                        z12 = true;
                                    } else {
                                        z12 = true;
                                        i0Var.h(true, i0Var.d == 1);
                                    }
                                    t1(z12);
                                    if (this.w0) {
                                        c1(R.drawable.msg_recent, a0(), null);
                                    } else {
                                        c1(R.drawable.msg_retry, LocaleController.getString(R.string.QrNoPaidToastNewCode), null);
                                    }
                                    i0();
                                    return true;
                                }
                                if (i16 != 1) {
                                    T0(LocaleController.getString(R.string.QrNoPaidToastFeeRestored));
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
                                this.z2 = -1;
                                t1(true);
                                c1(R.drawable.msg_recent, this.w0 ? a0() : LocaleController.getString(R.string.QrNoPaidToastNoTimeLimit), null);
                                if (cVar != null) {
                                    cVar.i(this.w0 ? 1 : 2);
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
                        if (cVar != null) {
                            f0 f0Var = (f0) cVar.a;
                            if (f0Var.getParentActivity() != null) {
                                if (f0Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                    f0Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                    return true;
                                }
                                f0Var.a0();
                                return true;
                            }
                        }
                    }
                }
            } else if (actionMasked != 2) {
                if (actionMasked != 3) {
                    return super.onTouchEvent(motionEvent);
                }
                removeCallbacks(m0Var);
                P0();
                R0();
                if (this.R) {
                    this.R = false;
                    Q0();
                    return true;
                }
            } else if (this.R) {
                this.k0.addMovement(motionEvent);
                float f14 = x10 - this.i9;
                float f15 = y3 - this.j9;
                if (!this.S && Math.hypot(f14, f15) > AndroidUtilities.dp(8.0f)) {
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
                int i17 = this.s9;
                if (i17 >= 0 && (rippleDrawable = this.r9[i17]) != null) {
                    rippleDrawable.setHotspot(x10, y3);
                }
                if (this.s9 >= 0 && Math.hypot(x10 - this.i9, y3 - this.j9) > AndroidUtilities.dp(10.0f)) {
                    P0();
                }
                if (Math.hypot(x10 - this.i9, y3 - this.j9) > AndroidUtilities.dp(10.0f)) {
                    R0();
                }
                VelocityTracker velocityTracker2 = this.n9;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                if (!this.p9 && this.f1 > 0.5f) {
                    float f16 = this.j9;
                    if (f16 > rectF8.top && Math.abs(y3 - f16) > viewConfiguration.getScaledTouchSlop()) {
                        this.p9 = true;
                        removeCallbacks(m0Var);
                        this.j9 = y3;
                        this.k9 = this.j1;
                    }
                }
                if (this.p9) {
                    this.j1 = Math.max(0.0f, Math.min(z0(), this.k9 - (y3 - this.j9)));
                    return true;
                }
            }
        } else {
            boolean isFinished = overScroller.isFinished();
            this.o9 = !isFinished;
            if (!isFinished) {
                overScroller.forceFinished(true);
                invalidate();
            }
            this.i9 = x10;
            this.j9 = y3;
            this.k9 = this.j1;
            this.p9 = false;
            VelocityTracker velocityTracker3 = this.n9;
            if (velocityTracker3 == null) {
                this.n9 = VelocityTracker.obtain();
            } else {
                velocityTracker3.clear();
            }
            this.n9.addMovement(motionEvent);
            if (this.f1 < 0.5f && this.k1 < 0.5f) {
                float width3 = getWidth() * 0.745f;
                float width4 = (getWidth() - width3) / 2.0f;
                float m10 = m();
                if ((x10 <= width4 || x10 >= width4 + width3 || y3 <= m10 || y3 >= l() + m10) && ((!this.K0 || !m0(rectF4, x10, y3)) && !m0(rectF5, x10, y3) && ((this.r7 || (!m0(rectF3, x10, y3) && !m0(rectF2, x10, y3))) && !m0(rectF6, x10, y3) && !m0(rectF7, x10, y3)))) {
                    z10 = true;
                    this.R = z10;
                    if (this.f1 > 0.5f && this.h1 == 2) {
                        int f04 = f0();
                        float dp4 = x10 - (rectF8.left + AndroidUtilities.dp(4.0f));
                        float dp5 = ((this.j1 + y3) - (AndroidUtilities.dp(4.0f) + rectF8.top)) - 0.0f;
                        width = (dp4 >= 0.0f || dp5 < 0.0f || h0()) ? -1 : ((int) (dp4 / ((rectF8.width() - AndroidUtilities.dp(8.0f)) / f04))) + (((int) (dp5 / ((rectF8.width() - AndroidUtilities.dp(8.0f)) / 3.0f))) * f04);
                        if (width >= 0 && width < arrayList.size()) {
                            this.Q7 = width;
                            this.S7 = AnimationUtils.currentAnimationTimeMillis();
                        }
                    }
                    if (this.f1 > 0.5f || this.h1 != 0 || y3 <= rectF8.top) {
                        f7 = 0.0f;
                    } else {
                        float dp6 = x10 - (rectF8.left + AndroidUtilities.dp(4.0f));
                        float dp7 = (this.j1 + y3) - (AndroidUtilities.dp(4.0f) + rectF8.top);
                        float width5 = (rectF8.width() - AndroidUtilities.dp(8.0f)) / 6.0f;
                        f7 = 0.0f;
                        int i18 = (dp6 < 0.0f || dp7 < 0.0f || dp6 >= 6.0f * width5) ? -1 : ((int) (dp6 / width5)) + (((int) (dp7 / width5)) * 6);
                        if (i18 >= 0 && i18 < a.b.length) {
                            this.W7 = i18;
                            this.X7 = AnimationUtils.currentAnimationTimeMillis();
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
                    removeCallbacks(m0Var);
                    if (this.k1 > 0.5f) {
                        for (int i19 = 0; i19 < 3; i19++) {
                            rectFArr[i19].contains(x10, y3);
                        }
                    }
                    P0();
                    if (this.k1 <= 0.5f) {
                        if (this.m7 || !m0(rectF6, x10, y3)) {
                            for (int i20 = 0; i20 < 3; i20++) {
                                if (rectFArr[i20].contains(x10, y3)) {
                                    i10 = i20;
                                    break;
                                }
                            }
                            i10 = -1;
                            if (i10 >= 0) {
                                long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                                long[] jArr = this.y9;
                                this.A9[i10] = jArr[i10] != 0 ? this.z9[i10] * ((float) Math.exp((-(currentAnimationTimeMillis2 - r6)) / 180.0f)) : f7;
                                jArr[i10] = 0;
                                this.v9[i10] = x10;
                                this.w9[i10] = y3;
                                this.x9[i10] = currentAnimationTimeMillis2;
                                this.s9 = i10;
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
                            if (this.m7 || !m0(rectF6, x10, y3)) {
                                if (this.K0 && m0(rectF4, x10, y3)) {
                                    i10 = 9;
                                } else {
                                    if (this.f1 < 0.5f) {
                                        if (!this.r7 && m0(rectF3, x10, y3)) {
                                            i10 = 4;
                                        } else if (!this.r7 && m0(rectF2, x10, y3)) {
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
                float dp42 = x10 - (rectF8.left + AndroidUtilities.dp(4.0f));
                float dp52 = ((this.j1 + y3) - (AndroidUtilities.dp(4.0f) + rectF8.top)) - 0.0f;
                if (dp42 >= 0.0f) {
                }
                if (width >= 0) {
                    this.Q7 = width;
                    this.S7 = AnimationUtils.currentAnimationTimeMillis();
                }
            }
            if (this.f1 > 0.5f) {
            }
            f7 = 0.0f;
            this.S = false;
            if (this.R) {
            }
            removeCallbacks(m0Var);
            if (this.k1 > 0.5f) {
            }
            P0();
            if (this.k1 <= 0.5f) {
            }
        }
        return true;
    }

    public final void p(float f7, float f10, float f11) {
        float dp;
        float nextFloat;
        float f12;
        float b10;
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
        this.M0[i10] = ((random.nextFloat() - 0.5f) * AndroidUtilities.dp(4.0f)) + f7;
        this.N0[i10] = f10;
        byte b11 = bArr[i10];
        if (b11 == 0) {
            dp = AndroidUtilities.dp(1.4f);
            nextFloat = random.nextFloat();
            f12 = 1.6f;
        } else {
            if (b11 == 1) {
                b10 = c1.b(0.7f, random.nextFloat(), AndroidUtilities.dpf2(0.7f));
                this.S0[i10] = b10;
                this.O0[i10] = (random.nextFloat() * AndroidUtilities.dp(80.0f)) + (-AndroidUtilities.dp(30.0f));
                this.P0[i10] = (-AndroidUtilities.dp(50.0f)) - (random.nextFloat() * AndroidUtilities.dp(100.0f));
                this.Q0[i10] = Math.max(0.05f, Math.min((random.nextFloat() * 0.2f) + 0.3f, f11));
                this.R0[i10] = 0.0f;
                this.T0[i10] = random.nextFloat() * 90.0f;
                this.U0[i10] = (random.nextFloat() - 0.5f) * 1080.0f;
            }
            dp = AndroidUtilities.dp(3.0f);
            nextFloat = random.nextFloat();
            f12 = 1.5f;
        }
        b10 = (nextFloat * AndroidUtilities.dp(f12)) + dp;
        this.S0[i10] = b10;
        this.O0[i10] = (random.nextFloat() * AndroidUtilities.dp(80.0f)) + (-AndroidUtilities.dp(30.0f));
        this.P0[i10] = (-AndroidUtilities.dp(50.0f)) - (random.nextFloat() * AndroidUtilities.dp(100.0f));
        this.Q0[i10] = Math.max(0.05f, Math.min((random.nextFloat() * 0.2f) + 0.3f, f11));
        this.R0[i10] = 0.0f;
        this.T0[i10] = random.nextFloat() * 90.0f;
        this.U0[i10] = (random.nextFloat() - 0.5f) * 1080.0f;
    }

    public final uj0 p1() {
        if (this.b9 == null) {
            uj0 uj0Var = new uj0(R.raw.ic_save_to_gallery, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f));
            this.b9 = uj0Var;
            uj0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            this.b9.K(0);
            this.b9.R(this);
            this.b9.J(true);
        }
        return this.b9;
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
        this.Y0[i10] = z11 ? c1.d(random, 3.0f, 4.0f) : 0.0f;
        this.Z0[i10] = random.nextFloat() * 6.2832f;
        this.S0[i10] = f14;
        this.Q0[i10] = f15;
        this.R0[i10] = 0.0f;
        this.T0[i10] = f16;
        this.U0[i10] = 0.0f;
    }

    public final uj0 q1() {
        if (this.Z8 == null) {
            uj0 uj0Var = new uj0(R.raw.star_premium_2, AndroidUtilities.dp(27.0f), AndroidUtilities.dp(27.0f));
            this.Z8 = uj0Var;
            uj0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            this.Z8.K(0);
            this.Z8.R(this);
            this.Z8.J(true);
        }
        return this.Z8;
    }

    public final float r1(String str) {
        int indexOf = str.indexOf(10);
        TextPaint textPaint = this.C1;
        if (indexOf >= 0) {
            return Math.max(textPaint.measureText(str, 0, indexOf), textPaint.measureText(str, indexOf + 1, str.length()));
        }
        if (!s0(str)) {
            return textPaint.measureText(str);
        }
        float textSize = textPaint.getTextSize();
        TextPaint textPaint2 = this.x2;
        textPaint2.setTextSize(textSize);
        return textPaint.measureText(this.w2) + textPaint2.measureText(this.v2) + textPaint.measureText(this.u2);
    }

    public final boolean s0(String str) {
        return str != null && str.equals(this.t2);
    }

    public void setFeeStars(long j10) {
        this.K0 = j10 > 0;
        String formatString = j10 > 0 ? LocaleController.formatString(R.string.QrNoPaidRemoveStarsFee, LocaleController.formatNumber(j10, ',')) : "";
        int indexOf = formatString.indexOf(9733);
        this.I0 = indexOf >= 0 ? formatString.substring(0, indexOf) : "";
        if (indexOf >= 0) {
            formatString = formatString.substring(indexOf + 1);
        }
        this.J0 = formatString;
        if (!this.K0 && this.v0) {
            T0(null);
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
            Utilities.globalQueue.postRunnable(new uf.c(29, str, new j0(this, str, 1)));
        }
    }

    public void setGiftsOwner(long j10) {
        if (this.w1 == j10) {
            return;
        }
        this.w1 = j10;
        y9 y9Var = this.h2;
        if (y9Var != null) {
            y9Var.f();
        }
        y9 y9Var2 = new y9(this.b, j10, false);
        this.h2 = y9Var2;
        y9Var2.g = 776;
        y9Var2.e = true;
        y9Var2.j(true);
        y0();
    }

    public void setInstantTheme(boolean z10) {
        this.e2 = z10;
    }

    public void setLinkExpires(long j10) {
        long j11 = this.F2;
        if (j11 == j10) {
            return;
        }
        if (j11 != 0 && j10 != 0) {
            i0();
        }
        this.F2 = j10;
        this.M2 = -1L;
        invalidate();
    }

    public void setOnPicksChanged(Runnable runnable) {
        this.c2 = runnable;
    }

    public void setReveal(float f7) {
        float f10;
        float sin;
        this.R4 = f7;
        if (this.U4) {
            double d = f7 * 0.86d;
            double sqrt = Math.sqrt(0.18999999999999995d) * 10.134169850289656d;
            if (f7 >= 1.0f) {
                sin = 1.0f;
            } else {
                double d10 = sqrt * d;
                sin = (float) (1.0d - (((Math.sin(d10) * (0.9d / Math.sqrt(0.18999999999999995d))) + Math.cos(d10)) * Math.exp((-9.120752865260691d) * d)));
            }
            float clamp01 = Utilities.clamp01((f7 - 0.85f) / 0.15f);
            f10 = k3.y(1.0f, sin, k3.B(clamp01, 2.0f, 3.0f, clamp01 * clamp01), sin);
        } else {
            float f11 = 1.0f - f7;
            f10 = 1.0f - (f11 * f11);
        }
        this.V4 = f10;
        boolean z10 = f7 < 1.0f;
        if (!z10) {
            this.T4 = true;
        }
        setTranslationY(z10 ? Math.round((1.0f - f10) * AndroidUtilities.dp(64.0f)) : 0.0f);
        setAlpha(z10 ? Utilities.clamp01(f10 / 0.35f) : 1.0f);
        if (getParent() instanceof View) {
            ((View) getParent()).setBackgroundColor(z10 ? a(f10, TLObject.FLAG_30) : 0);
        }
        if (!z10) {
            this.o3 = 0.0f;
        } else if (this.o3 <= 0.0f) {
            this.o3 = Build.VERSION.SDK_INT >= 31 ? u.g(this, AndroidUtilities.dp(32.0f)) : AndroidUtilities.dp(32.0f);
        }
        this.s0.D = (z10 && this.U4) ? Utilities.clamp01(f10) : -1.0f;
        int i10 = z10 ? 2 : 0;
        if (getLayerType() != i10) {
            setLayerType(i10, null);
        }
        invalidate();
    }

    public void setRevealOpening(boolean z10) {
        this.U4 = z10;
    }

    public void setScanHidden(boolean z10) {
        if (this.m7 != z10) {
            this.m7 = z10;
            invalidate();
        }
    }

    public void setTemporaryLink(boolean z10) {
        if (this.A2 == z10) {
            return;
        }
        this.A2 = z10;
        if (!this.G2) {
            float f7 = z10 ? 1.0f : 0.0f;
            this.D2 = f7;
            this.B2 = f7;
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
        int i10 = this.z6;
        SparseIntArray sparseIntArray = this.y6;
        if (i10 != 1) {
            sparseIntArray.clear();
            this.z6 = 1;
        }
        r0 r0Var = this.n;
        int i11 = r0Var != null ? r0Var.b : 0;
        int indexOfKey = sparseIntArray.indexOfKey(i11);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        int u10 = u(this.n);
        sparseIntArray.put(i11, u10);
        return u10;
    }

    public final void t1(boolean z10) {
        String sb2;
        if (this.v0) {
            if (this.w0) {
                int ceil = (int) Math.ceil((this.A0 ? 60000L : Math.max(0L, this.z0 - System.currentTimeMillis())) / 1000.0d);
                if (ceil == this.z2 && this.y2 != null) {
                    return;
                }
                this.z2 = ceil;
                StringBuilder sb3 = new StringBuilder();
                c1.n(R.string.QrNoPaidFree, " · ", sb3);
                sb3.append(LocaleController.formatString(R.string.QrNoPaidExpiresIn, String.format(Locale.US, "%d:%02d", Integer.valueOf(ceil / 60), Integer.valueOf(ceil % 60))));
                sb2 = sb3.toString();
            } else {
                StringBuilder sb4 = new StringBuilder();
                c1.n(R.string.QrNoPaidFree, " · ", sb4);
                sb2 = org.telegram.messenger.g0.g(R.string.QrNoPaidNoTimeLimit, sb4);
                this.z2 = -1;
            }
            if (sb2.equals(this.y2)) {
                return;
            }
            this.y2 = sb2;
            this.L0.t(sb2, z10, true);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        uj0 uj0Var;
        return (drawable instanceof RippleDrawable) || drawable == this.L0 || drawable == this.X1 || ((uj0Var = this.m8) != null && drawable == uj0Var) || super.verifyDrawable(drawable);
    }

    public final Drawable w(int i10) {
        return getContext().getResources().getDrawable(i10).mutate();
    }

    public final float w1(float f7, float f10, int i10, int i11) {
        float f11 = this.w;
        double max = Math.max(f11, i10 - f11);
        float f12 = this.x;
        return (((1.0f - ((float) Math.pow(1.0f - Utilities.clamp01(((float) Math.hypot(f7 - this.w, f10 - this.x)) / (((float) Math.hypot(max, Math.max(f12, i11 - f12))) + AndroidUtilities.dp(60.0f))), 0.4166666567325592d))) * 600.0f) / 1000.0f) - 0.03f;
    }

    public final void y(Canvas canvas, Bitmap bitmap) {
        float f7 = this.e3;
        float f10 = (-f7) / 2.0f;
        float width = (bitmap.getWidth() - 0.5f) * f7;
        float height = (bitmap.getHeight() - 0.5f) * f7;
        RectF rectF = this.d3;
        rectF.set(f10, f10, width, height);
        canvas.drawBitmap(bitmap, (Rect) null, rectF, this.a3);
    }

    public final void y0() {
        int i10;
        y9 y9Var = this.h2;
        if (y9Var == null) {
            return;
        }
        q0 q0Var = this.F;
        int i11 = q0Var.a;
        ArrayList arrayList = this.v1;
        long j10 = (i11 != 2 || (i10 = q0Var.q) < 0 || i10 >= arrayList.size()) ? 0L : ((TL_stars.TL_starGiftUnique) arrayList.get(this.F.q)).id;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = j10 != 0 ? (TL_stars.TL_starGiftUnique) arrayList.get(this.F.q) : null;
        arrayList.clear();
        HashMap hashMap = this.y1;
        hashMap.clear();
        ArrayList arrayList2 = y9Var.l;
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
            this.M7 = i12;
        }
        boolean z10 = y9Var.j;
        this.x1 = z10;
        if (!z10 && !y9Var.i) {
            y9Var.a();
        }
        if (!arrayList.isEmpty() && !this.k2) {
            this.k2 = true;
            m0 m0Var = this.j2;
            removeCallbacks(m0Var);
            postDelayed(m0Var, 900L);
        }
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x05c6 A[EDGE_INSN: B:150:0x05c6->B:151:0x05c6 BREAK  A[LOOP:3: B:140:0x0569->B:147:0x0592], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0784  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x07fc  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x08c9  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0909  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0929 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0934  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0a25  */
    /* JADX WARN: Removed duplicated region for block: B:266:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0952  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x09ed  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0a08  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0a14  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0a16  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x094d  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0372  */
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
        boolean z10;
        float f18;
        float min;
        long j10;
        float f19;
        float f20;
        float f21;
        float[] fArr;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        float f28;
        float[] fArr2;
        float f29;
        boolean z11;
        q0 q0Var;
        boolean z12;
        boolean z13;
        int i12;
        int i13;
        boolean z14;
        float f30;
        int ceil;
        int ceil2;
        Bitmap bitmap;
        int i14;
        boolean z15;
        float f31;
        float f32;
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
            f10 = 3.0f;
            f11 = 0.0f;
            f12 = 0.6f;
            f13 = 2.0f;
            f14 = 0.45f;
            canvas2.drawColor(-16777216);
        } else {
            float max = Math.max(i10, i11) / 160.0f;
            float f33 = i10;
            f12 = 0.6f;
            int ceil3 = ((int) Math.ceil(f33 / max)) + 1;
            float f34 = i11;
            int ceil4 = ((int) Math.ceil(f34 / max)) + 1;
            Bitmap bitmap2 = this.X2;
            Paint paint = this.b3;
            if (bitmap2 != null && bitmap2.getWidth() == ceil3 && this.X2.getHeight() == ceil4) {
                f13 = 2.0f;
            } else {
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                f13 = 2.0f;
                this.X2 = Bitmap.createBitmap(ceil3, ceil4, config);
                this.Y2 = Bitmap.createBitmap(ceil3, ceil4, config);
                Bitmap bitmap3 = this.X2;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                this.Z2 = bitmapShader;
                paint.setShader(bitmapShader);
                this.f3 = false;
            }
            this.e3 = max;
            M0(0, z17 ? this.r : this.n, i10, i11);
            this.g3 = false;
            int[] iArr2 = this.k3;
            float[] fArr6 = this.m3;
            if (z17) {
                M0(1, this.n, i10, i11);
                float x12 = x1(this.s);
                float f35 = this.w;
                i16 = 1;
                double max2 = Math.max(f35, f33 - f35);
                i15 = 0;
                float f36 = this.x;
                float hypot = (((float) Math.hypot(max2, Math.max(f36, f34 - f36))) + AndroidUtilities.dp(60.0f)) * x12;
                fArr6[0] = this.w;
                fArr6[1] = this.x;
                fArr6[2] = hypot;
                boolean z18 = hypot > ((float) AndroidUtilities.dp(4.0f));
                this.g3 = z18;
                if (z18) {
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(90.0f), AndroidUtilities.dp(56.0f), x12);
                    float clamp01 = Utilities.clamp01((1.0f - this.s) * 1.6f) * 0.38f;
                    float max3 = Math.max(0.0f, hypot - lerp) / hypot;
                    float dp = AndroidUtilities.dp(8.0f) + hypot;
                    fArr6[3] = max3 * hypot;
                    fArr6[4] = AndroidUtilities.lerp(max3, 1.0f, 0.45f) * hypot;
                    fArr6[5] = AndroidUtilities.lerp(max3, 1.0f, 0.82f) * hypot;
                    fArr6[6] = hypot - (0.004f * dp);
                    fArr6[7] = hypot + AndroidUtilities.dp(3.0f);
                    fArr6[8] = dp;
                    fArr6[9] = 0.0f;
                    fArr6[10] = clamp01 * 0.2f;
                    fArr6[11] = clamp01 * 0.6f;
                    fArr6[12] = clamp01;
                    fArr6[13] = clamp01 * 0.4f;
                    fArr6[14] = 0.0f;
                    iArr2[6] = f.j(0.55f, this.n.b, -1);
                    i17 = !z17 ? 2 : i16;
                    z16 = this.f3;
                    fArr3 = this.n3;
                    iArr = this.l3;
                    fArr4 = this.j3;
                    fArr5 = this.i3;
                    if (z16 || i17 != this.h3 || !Arrays.equals(fArr5, fArr4) || !Arrays.equals(iArr2, iArr) || (z17 && !Arrays.equals(fArr6, fArr3))) {
                        Utilities.generateQrBackdrop(this.X2, !this.g3 ? this.Y2 : null, max, i17, this.i3, this.k3, this.m3);
                        max = max;
                        int i18 = i15;
                        System.arraycopy(fArr5, i18, fArr4, i18, fArr5.length);
                        System.arraycopy(iArr2, i18, iArr, i18, iArr2.length);
                        System.arraycopy(fArr6, i18, fArr3, i18, fArr6.length);
                        this.h3 = i17;
                        this.f3 = i16;
                    }
                    if (this.o3 <= 0.0f) {
                        Matrix matrix = this.c3;
                        matrix.setScale(max, max);
                        float f37 = (-max) / f13;
                        matrix.postTranslate(f37, f37);
                        this.Z2.setLocalMatrix(matrix);
                        float f38 = this.o3;
                        canvas2 = canvas;
                        f7 = 0.2f;
                        f10 = 3.0f;
                        f11 = 0.0f;
                        f14 = 0.45f;
                        canvas2.drawRoundRect(0.0f, 0.0f, f33, f34, f38, f38, paint);
                    } else {
                        canvas2 = canvas;
                        f7 = 0.2f;
                        f10 = 3.0f;
                        f11 = 0.0f;
                        f14 = 0.45f;
                        y(canvas2, this.X2);
                    }
                }
            } else {
                i15 = 0;
                i16 = 1;
            }
            if (!z17) {
            }
            z16 = this.f3;
            fArr3 = this.n3;
            iArr = this.l3;
            fArr4 = this.j3;
            fArr5 = this.i3;
            if (z16) {
            }
            Utilities.generateQrBackdrop(this.X2, !this.g3 ? this.Y2 : null, max, i17, this.i3, this.k3, this.m3);
            max = max;
            int i182 = i15;
            System.arraycopy(fArr5, i182, fArr4, i182, fArr5.length);
            System.arraycopy(iArr2, i182, iArr, i182, iArr2.length);
            System.arraycopy(fArr6, i182, fArr3, i182, fArr6.length);
            this.h3 = i17;
            this.f3 = i16;
            if (this.o3 <= 0.0f) {
            }
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        float f39 = (currentAnimationTimeMillis - this.y) / 1000.0f;
        this.v3 = f39;
        float f40 = this.P3;
        float max4 = f40 < f11 ? f11 : Math.max(f11, Math.min(0.05f, f39 - f40));
        float f41 = this.v3;
        this.P3 = f41;
        boolean z19 = this.R || this.T || this.U;
        if (z19) {
            f15 = 0.05f;
            this.Q3 = f41 + 0.25f;
        } else {
            f15 = 0.05f;
        }
        float f42 = (z19 || f41 < this.Q3) ? f11 : 1.0f;
        float f43 = this.N3;
        if (f42 < f43) {
            f14 = 0.07f;
        }
        if (max4 > f11) {
            f16 = 1000.0f;
            f17 = max4;
            this.N3 = k3.y(1.0f, (float) Math.exp((-max4) / f14), f42 - f43, f43);
        } else {
            f16 = 1000.0f;
            f17 = max4;
        }
        float f44 = f17 * this.N3;
        this.O3 = f44;
        this.M3 = this.M3 + f44;
        double radians = (float) Math.toRadians((r4 * (-0.763f)) % 360.0f);
        Math.cos(radians);
        Math.sin(radians);
        float f45 = this.v3;
        if (this.M >= f11) {
            float f46 = this.O3;
            if (f46 > f11) {
                float f47 = this.M3 - (f46 / f13);
                f18 = 0.016f;
                double sin = (((float) Math.sin((f47 * 0.016f) + 1.0f)) * f12) + (((float) Math.sin(0.025f * f47)) * 1.2f) + D9;
                z10 = z17;
                this.K = k3.t(((float) Math.cos(sin)) * 6.2f, AndroidUtilities.dp(1.0f), f46, this.K);
                this.L = k3.t(((float) Math.sin(sin)) * 6.2f, AndroidUtilities.dp(1.0f), f46, this.L);
                float f48 = this.M;
                min = f48 < f11 ? Math.min(0.033f, Math.max(f11, f45 - f48)) : f11;
                Math.exp((-min) / 0.09f);
                this.M = f45;
                if (min > f11) {
                    p0 p0Var = this.L3;
                    int i19 = p0Var.m;
                    int[] iArr3 = p0Var.l;
                    if (i19 > 0) {
                        float f49 = min / f13;
                        int i20 = 0;
                        boolean z20 = false;
                        while (i20 < 2) {
                            float[] fArr7 = p0Var.c;
                            float[] fArr8 = p0Var.j;
                            float f50 = f10;
                            float[] fArr9 = p0Var.i;
                            float f51 = f7;
                            float[] fArr10 = p0Var.h;
                            float f52 = f11;
                            float[] fArr11 = p0Var.g;
                            long j11 = currentAnimationTimeMillis;
                            float[] fArr12 = p0Var.f;
                            float[] fArr13 = p0Var.e;
                            float[] fArr14 = p0Var.d;
                            float sqrt = ((float) Math.sqrt(220.0d)) * 1.24f;
                            boolean z21 = false;
                            for (int i21 = 0; i21 < p0Var.m; i21++) {
                                int i22 = iArr3[i21];
                                float f53 = fArr7[i22];
                                if (f53 != f52 || fArr14[i22] != f52 || fArr13[i22] != f52 || fArr12[i22] != f52 || fArr11[i22] != f52 || fArr10[i22] != f52 || fArr9[i22] != f52 || fArr8[i22] != f52) {
                                    float f54 = fArr13[i22];
                                    float f55 = (((f53 * (-220.0f)) - (sqrt * f54)) * f49) + f54;
                                    fArr13[i22] = f55;
                                    fArr7[i22] = (f55 * f49) + fArr7[i22];
                                    float f56 = fArr12[i22];
                                    float f57 = (((fArr14[i22] * (-220.0f)) - (sqrt * f56)) * f49) + f56;
                                    fArr12[i22] = f57;
                                    fArr14[i22] = (f57 * f49) + fArr14[i22];
                                    float f58 = fArr10[i22];
                                    float f59 = (((fArr11[i22] * (-220.0f)) - (sqrt * f58)) * f49) + f58;
                                    fArr10[i22] = f59;
                                    fArr11[i22] = (f59 * f49) + fArr11[i22];
                                    float f60 = fArr8[i22];
                                    float f61 = (((fArr9[i22] * (-220.0f)) - (sqrt * f60)) * f49) + f60;
                                    fArr8[i22] = f61;
                                    fArr9[i22] = (f61 * f49) + fArr9[i22];
                                    if (Math.abs(fArr12[i22]) + Math.abs(fArr13[i22]) + Math.abs(fArr14[i22]) + Math.abs(fArr7[i22]) < f15) {
                                        if (Math.abs(fArr10[i22]) + Math.abs(fArr11[i22]) < 0.02f) {
                                            if (Math.abs(fArr8[i22]) + Math.abs(fArr9[i22]) < 5.0E-4f) {
                                                fArr8[i22] = f52;
                                                fArr9[i22] = f52;
                                                fArr10[i22] = f52;
                                                fArr11[i22] = f52;
                                                fArr12[i22] = f52;
                                                fArr13[i22] = f52;
                                                fArr14[i22] = f52;
                                                fArr7[i22] = f52;
                                            }
                                        }
                                    }
                                    z21 = true;
                                }
                            }
                            z20 |= z21;
                            i20++;
                            f7 = f51;
                            currentAnimationTimeMillis = j11;
                            f10 = f50;
                            f11 = f52;
                        }
                        j10 = currentAnimationTimeMillis;
                        f19 = f10;
                        f20 = f11;
                        f21 = f7;
                        if (!z20 && (this.s >= 1.0f || this.r == null)) {
                            for (int i23 = 0; i23 < p0Var.m; i23++) {
                                p0Var.b[iArr3[i23]] = false;
                            }
                            p0Var.m = 0;
                        }
                        if (this.T) {
                            float f62 = (j10 - this.V) / f16;
                            float exp = (1.0f - ((float) Math.exp((-f62) / 0.35f))) * 0.35f;
                            this.N = (this.c0 * exp) + this.a0;
                            this.O = (this.d0 * exp) + this.b0;
                            if (f62 > 2.8f) {
                                this.T = false;
                            }
                        }
                        if (this.U) {
                            float f63 = (j10 - this.W) / f16;
                            float cos = (float) (Math.cos((f63 * 6.283185307179586d) / 0.8500000238418579d) * Math.exp((-f63) / 0.22f));
                            this.e0 = this.i0 * cos;
                            this.f0 = this.j0 * cos;
                            if (f63 > 1.6f) {
                                this.U = false;
                                float f64 = f20;
                                this.f0 = f64;
                                this.e0 = f64;
                            }
                        }
                        fArr = v0.b;
                        f22 = fArr[27] / 100.0f;
                        while (true) {
                            f23 = this.v3;
                            f24 = this.F3 + this.G3;
                            f25 = 1.5f;
                            if (f23 < f24) {
                                break;
                            }
                            this.F3 = f24;
                            float f65 = fArr[25] + f21;
                            float f66 = fArr[26];
                            q0 q0Var2 = this.F;
                            if (q0Var2 == null || q0Var2.a != 1) {
                                f25 = 1.0f;
                            }
                            this.G3 = Math.max(f65, (this.e1.nextFloat() * 0.8f * f22) + (f66 * f25));
                            double radians2 = Math.toRadians(((r7.nextFloat() - 0.5f) * 12.0f * f22) + fArr[24]);
                            this.H3 = (float) Math.cos(radians2);
                            this.I3 = (float) Math.sin(radians2);
                        }
                        if (!this.D3) {
                            this.D3 = true;
                            this.F3 = (fArr[51] / f16) + f23 + 1.5f;
                            this.G3 = f16;
                        }
                        f26 = this.F3;
                        f27 = fArr[25];
                        if (f23 >= f26 + f27 && this.G3 > 999.0f) {
                            this.G3 = fArr[26];
                        }
                        float f67 = (f23 - f26) / f27;
                        this.y3 = this.R4 < 1.0f && f67 >= 0.0f && f67 < 1.0f;
                        this.x3 = AndroidUtilities.dpf2(fArr[23]);
                        if (this.y3) {
                            float cos2 = 0.5f - (((float) Math.cos(f67 * 3.141592653589793d)) * 0.5f);
                            float w9 = (this.x3 * f19) + k3.w(Math.abs(this.I3), i11, Math.abs(this.H3) * i10, f13);
                            this.w3 = AndroidUtilities.lerp(-w9, w9, cos2);
                            this.E3 = 1.0f;
                        }
                        long nanoTime = System.nanoTime();
                        float min2 = this.V6 == 0 ? f18 : Math.min(0.1f, (nanoTime - r12) / 1.0E9f);
                        this.V6 = nanoTime;
                        if (fArr[15] >= 0.5f || this.R4 < 1.0f) {
                            f28 = 0.35f;
                            fArr2 = fArr;
                            f29 = 0.0f;
                            this.R6 = 0.0f;
                        } else {
                            float max5 = 30.0f / Math.max(1.0f, fArr[16]);
                            float max6 = Math.max(-1.0f, Math.min(1.0f, this.G6 * max5));
                            float max7 = Math.max(-1.0f, Math.min(1.0f, this.H6 * max5));
                            if (!this.W6) {
                                this.S6 = max6;
                                this.T6 = max7;
                                this.W6 = true;
                            }
                            f28 = 0.35f;
                            fArr2 = fArr;
                            float hypot2 = ((float) Math.hypot(max6 - this.S6, max7 - this.T6)) / min2;
                            this.S6 = max6;
                            this.T6 = max7;
                            long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                            if (hypot2 > 0.15f) {
                                this.U6 = currentAnimationTimeMillis2;
                            }
                            boolean z22 = currentAnimationTimeMillis2 - this.U6 < 1500;
                            float A = k3.A(max7, -this.I3, max6 * (-this.H3), k3.w(Math.abs(this.I3), i11, Math.abs(this.H3) * i10, 2.0f) + this.x3);
                            if (this.R6 <= 0.001f) {
                                this.Q6 = A;
                            }
                            float f68 = this.Q6;
                            this.Q6 = k3.y(1.0f, (float) Math.exp((-min2) / 0.1f), A - f68, f68);
                            float c10 = z22 ? c1.c(min2, f21, this.R6, 1.0f) : c1.v(min2, f12, this.R6, 0.0f);
                            this.R6 = c10;
                            if (c10 > 0.001f) {
                                float B = k3.B(c10, 2.0f, f19, c10 * c10);
                                if (this.y3) {
                                    this.w3 = AndroidUtilities.lerp(this.w3, this.Q6, B);
                                    this.E3 = AndroidUtilities.lerp(this.E3, 1.0f, B);
                                } else {
                                    this.w3 = this.Q6;
                                    this.E3 = B;
                                }
                                this.y3 = true;
                                if (this.R6 >= 0.999f) {
                                    this.F3 = this.v3;
                                }
                            }
                            f29 = 0.0f;
                        }
                        if (this.y3 && this.F.a != 0) {
                            f30 = fArr2[46] / 100.0f;
                            if (f30 > f29 && i10 > 0 && i11 > 0) {
                                float dp2 = AndroidUtilities.dp(12.0f);
                                float f69 = i10;
                                ceil = ((int) Math.ceil(f69 / dp2)) + 1;
                                float f70 = i11;
                                ceil2 = ((int) Math.ceil(f70 / dp2)) + 1;
                                bitmap = this.z3;
                                if (bitmap != null || bitmap.getWidth() != ceil || this.z3.getHeight() != ceil2) {
                                    this.z3 = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
                                    this.A3 = new int[ceil * ceil2];
                                }
                                float max8 = Math.max(1.0f, fArr2[45]);
                                float f71 = fArr2[47] / 100.0f;
                                float f72 = f30 * 0.0275f;
                                float dp3 = AndroidUtilities.dp(130.0f);
                                float f73 = this.v3 * 0.12f;
                                i14 = 0;
                                z15 = false;
                                while (i14 < ceil2) {
                                    int i24 = 0;
                                    while (i24 < ceil) {
                                        float f74 = f72;
                                        float f75 = i24 * dp2;
                                        float f76 = f73;
                                        float f77 = i14 * dp2;
                                        b1(f75, f77, i10, i11);
                                        float f78 = this.o4 / max8;
                                        if (f78 >= 3.5f || f78 <= -3.5f) {
                                            f31 = f69;
                                            f32 = 0.0f;
                                        } else {
                                            f31 = f69;
                                            float exp2 = ((float) Math.exp((-0.5f) * f78 * f78)) * this.p4;
                                            if (f71 > 0.0f) {
                                                float w10 = k3.w(f77 - (f70 / 2.0f), this.H3, (f75 - (f31 / 2.0f)) * (-this.I3), dp3);
                                                exp2 = ((((((u1(((w10 * 2.3f) - (1.7f * f76)) + 11.3f) * f28) + (u1(w10 + f76) * 0.65f)) * 2.0f) - 1.0f) * f71) + 1.0f) * exp2;
                                            }
                                            f32 = exp2;
                                        }
                                        int max9 = Math.max(0, Math.min(255, Math.round(255.0f * f74 * f32)));
                                        if (max9 > 0) {
                                            z15 = true;
                                        }
                                        this.A3[(i14 * ceil) + i24] = (max9 << 24) | 16777215;
                                        i24++;
                                        f72 = f74;
                                        f73 = f76;
                                        f69 = f31;
                                    }
                                    i14++;
                                    f73 = f73;
                                }
                                z11 = false;
                                if (z15) {
                                    this.z3.setPixels(this.A3, 0, ceil, 0, 0, ceil, ceil2);
                                    float f79 = (-dp2) / 2.0f;
                                    float f80 = ceil * dp2;
                                    float f81 = dp2 / 2.0f;
                                    float f82 = (ceil2 * dp2) - f81;
                                    RectF rectF = this.C3;
                                    rectF.set(f79, f79, f80 - f81, f82);
                                    canvas2.drawBitmap(this.z3, (Rect) null, rectF, this.B3);
                                }
                                float f83 = (j10 - this.H) / 1000.0f;
                                q0Var = this.G;
                                if (q0Var != null) {
                                    if (f83 < (this.F.h ? 0.6f : 0.3f) + 0.135f + 0.315f) {
                                        z12 = true;
                                        if (!z12 && q0Var != null) {
                                            O0(q0Var);
                                            this.G = null;
                                        }
                                        z13 = z11;
                                        if (z12) {
                                            i12 = i10;
                                            i13 = i11;
                                            z14 = true;
                                        } else {
                                            q0 q0Var3 = this.G;
                                            z14 = true;
                                            if (q0Var3.a == 1) {
                                                q0 q0Var4 = this.F;
                                                if (q0Var4.a == 1) {
                                                    E(canvas2, i10, i11, q0Var3, q0Var4, f83, false, false);
                                                    if (z10 && this.g3) {
                                                        y(canvas2, this.Y2);
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
                                                F(canvas, i10, i11, this.G, true, this.F.a == 0 ? z14 : z13, f83);
                                                f83 = f83;
                                            }
                                            canvas2 = canvas;
                                            F(canvas2, i10, i11, this.F, false, (z12 || this.G.a == 0) ? z14 : z13, !z12 ? f83 : 100.0f);
                                        } else if (this.s >= 1.0f || this.r == null) {
                                            O0(this.G);
                                            this.G = null;
                                            canvas2 = canvas;
                                            F(canvas2, i10, i11, this.F, false, true, 100.0f);
                                        } else {
                                            float f84 = this.w;
                                            double max10 = Math.max(f84, i12 - f84);
                                            float f85 = this.x;
                                            float x13 = x1(this.s) * (((float) Math.hypot(max10, Math.max(f85, i13 - f85))) + AndroidUtilities.dp(60.0f));
                                            Path path = this.R3;
                                            path.rewind();
                                            path.addCircle(this.w, this.x, x13, Path.Direction.CW);
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
                                    O0(q0Var);
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
                                F(canvas2, i10, i11, this.F, false, (z12 || this.G.a == 0) ? z14 : z13, !z12 ? f83 : 100.0f);
                                if (z10) {
                                }
                            }
                        }
                        z11 = false;
                        float f832 = (j10 - this.H) / 1000.0f;
                        q0Var = this.G;
                        if (q0Var != null) {
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
                        F(canvas2, i10, i11, this.F, false, (z12 || this.G.a == 0) ? z14 : z13, !z12 ? f832 : 100.0f);
                        if (z10) {
                        }
                    }
                }
                j10 = currentAnimationTimeMillis;
                f19 = f10;
                f20 = f11;
                f21 = f7;
                if (this.T) {
                }
                if (this.U) {
                }
                fArr = v0.b;
                f22 = fArr[27] / 100.0f;
                while (true) {
                    f23 = this.v3;
                    f24 = this.F3 + this.G3;
                    f25 = 1.5f;
                    if (f23 < f24) {
                    }
                    this.G3 = Math.max(f65, (this.e1.nextFloat() * 0.8f * f22) + (f66 * f25));
                    double radians22 = Math.toRadians(((r7.nextFloat() - 0.5f) * 12.0f * f22) + fArr[24]);
                    this.H3 = (float) Math.cos(radians22);
                    this.I3 = (float) Math.sin(radians22);
                }
                if (!this.D3) {
                }
                f26 = this.F3;
                f27 = fArr[25];
                if (f23 >= f26 + f27) {
                    this.G3 = fArr[26];
                }
                float f672 = (f23 - f26) / f27;
                this.y3 = this.R4 < 1.0f && f672 >= 0.0f && f672 < 1.0f;
                this.x3 = AndroidUtilities.dpf2(fArr[23]);
                if (this.y3) {
                }
                long nanoTime2 = System.nanoTime();
                if (this.V6 == 0) {
                }
                this.V6 = nanoTime2;
                if (fArr[15] >= 0.5f) {
                }
                f28 = 0.35f;
                fArr2 = fArr;
                f29 = 0.0f;
                this.R6 = 0.0f;
                if (this.y3) {
                    f30 = fArr2[46] / 100.0f;
                    if (f30 > f29) {
                        float dp22 = AndroidUtilities.dp(12.0f);
                        float f692 = i10;
                        ceil = ((int) Math.ceil(f692 / dp22)) + 1;
                        float f702 = i11;
                        ceil2 = ((int) Math.ceil(f702 / dp22)) + 1;
                        bitmap = this.z3;
                        if (bitmap != null) {
                        }
                        this.z3 = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
                        this.A3 = new int[ceil * ceil2];
                        float max82 = Math.max(1.0f, fArr2[45]);
                        float f712 = fArr2[47] / 100.0f;
                        float f722 = f30 * 0.0275f;
                        float dp32 = AndroidUtilities.dp(130.0f);
                        float f732 = this.v3 * 0.12f;
                        i14 = 0;
                        z15 = false;
                        while (i14 < ceil2) {
                        }
                        z11 = false;
                        if (z15) {
                        }
                        float f8322 = (j10 - this.H) / 1000.0f;
                        q0Var = this.G;
                        if (q0Var != null) {
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
                        F(canvas2, i10, i11, this.F, false, (z12 || this.G.a == 0) ? z14 : z13, !z12 ? f8322 : 100.0f);
                        if (z10) {
                        }
                    }
                }
                z11 = false;
                float f83222 = (j10 - this.H) / 1000.0f;
                q0Var = this.G;
                if (q0Var != null) {
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
                F(canvas2, i10, i11, this.F, false, (z12 || this.G.a == 0) ? z14 : z13, !z12 ? f83222 : 100.0f);
                if (z10) {
                }
            }
        }
        z10 = z17;
        f18 = 0.016f;
        float f482 = this.M;
        if (f482 < f11) {
        }
        Math.exp((-min) / 0.09f);
        this.M = f45;
        if (min > f11) {
        }
        j10 = currentAnimationTimeMillis;
        f19 = f10;
        f20 = f11;
        f21 = f7;
        if (this.T) {
        }
        if (this.U) {
        }
        fArr = v0.b;
        f22 = fArr[27] / 100.0f;
        while (true) {
            f23 = this.v3;
            f24 = this.F3 + this.G3;
            f25 = 1.5f;
            if (f23 < f24) {
            }
            this.G3 = Math.max(f65, (this.e1.nextFloat() * 0.8f * f22) + (f66 * f25));
            double radians222 = Math.toRadians(((r7.nextFloat() - 0.5f) * 12.0f * f22) + fArr[24]);
            this.H3 = (float) Math.cos(radians222);
            this.I3 = (float) Math.sin(radians222);
        }
        if (!this.D3) {
        }
        f26 = this.F3;
        f27 = fArr[25];
        if (f23 >= f26 + f27) {
        }
        float f6722 = (f23 - f26) / f27;
        this.y3 = this.R4 < 1.0f && f6722 >= 0.0f && f6722 < 1.0f;
        this.x3 = AndroidUtilities.dpf2(fArr[23]);
        if (this.y3) {
        }
        long nanoTime22 = System.nanoTime();
        if (this.V6 == 0) {
        }
        this.V6 = nanoTime22;
        if (fArr[15] >= 0.5f) {
        }
        f28 = 0.35f;
        fArr2 = fArr;
        f29 = 0.0f;
        this.R6 = 0.0f;
        if (this.y3) {
        }
        z11 = false;
        float f832222 = (j10 - this.H) / 1000.0f;
        q0Var = this.G;
        if (q0Var != null) {
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
        F(canvas2, i10, i11, this.F, false, (z12 || this.G.a == 0) ? z14 : z13, !z12 ? f832222 : 100.0f);
        if (z10) {
        }
    }

    public final float z0() {
        float f7;
        int f02;
        int dp;
        int dp2;
        float f10;
        float B = kk.B(10.0f, 2, getWidth()) - AndroidUtilities.dp(8.0f);
        int i10 = this.h1;
        if (i10 != 0) {
            if (i10 == 1) {
                f7 = B / 6.0f;
                f10 = 0.0f;
            } else if (h0()) {
                f7 = 0.0f;
                f10 = 0.0f;
            } else {
                f7 = B / 3.0f;
                f02 = ((f0() + this.v1.size()) - 1) / f0();
                dp = AndroidUtilities.dp(4.0f) - AndroidUtilities.dp(32.0f);
                dp2 = AndroidUtilities.dp(4.0f);
            }
            f02 = 0;
            return Math.max(0.0f, (((f02 * f7) + f10) + AndroidUtilities.dp(32.0f)) - a1());
        }
        f7 = B / 6.0f;
        f02 = (a.b.length + 5) / 6;
        dp = AndroidUtilities.dp(4.0f) - AndroidUtilities.dp(32.0f);
        dp2 = AndroidUtilities.dp(4.0f);
        f10 = dp2 + dp;
        return Math.max(0.0f, (((f02 * f7) + f10) + AndroidUtilities.dp(32.0f)) - a1());
    }
}
