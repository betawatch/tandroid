package zh;

import ai.m1;
import ai.x9;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
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
import com.google.android.gms.internal.cast.a6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Cells.v6;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.az0;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.dx0;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.q10;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Wallet.k5;
import v7.x7;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class b1 extends View {
    public static int[] n9;
    public static int[] o9;
    public static int[] p9;
    public static String s9;
    public static g t9;
    public static final bs v9;
    public boolean A0;
    public final Paint A1;
    public int A2;
    public float A3;
    public int A4;
    public final RectF A5;
    public long A6;
    public int A7;
    public final Paint A8;
    public float B0;
    public final Paint B1;
    public boolean B2;
    public float B3;
    public float B4;
    public final RectF B5;
    public long B6;
    public long B7;
    public final Paint B8;
    public float C0;
    public final Paint C1;
    public float C2;
    public float C3;
    public float C4;
    public final RectF C5;
    public boolean C6;
    public long C7;
    public final RectF C8;
    public float D0;
    public final Paint D1;
    public float D2;
    public final Paint D3;
    public final float[] D4;
    public final LinearGradient D5;
    public boolean D6;
    public long D7;
    public int D8;
    public final Matrix E;
    public long E0;
    public final TextPaint E1;
    public float E2;
    public final int[] E3;
    public final float[] E4;
    public final LinearGradient E5;
    public final Matrix E6;
    public final float E7;
    public String E8;
    public y0 F;
    public boolean F0;
    public final TextPaint F1;
    public long F2;
    public final int[] F3;
    public final int[] F4;
    public final Matrix F5;
    public final Matrix F6;
    public int F7;
    public boolean F8;
    public y0 G;
    public float G0;
    public final Path G1;
    public long G2;
    public final float[] G3;
    public float G4;
    public final Paint G5;
    public final Path G6;
    public long G7;
    public int G8;
    public long H;
    public final TextPaint H0;
    public final RectF H1;
    public boolean H2;
    public final float[] H3;
    public float H4;
    public float H5;
    public final Path H6;
    public long H7;
    public long H8;
    public final ArrayList I;
    public String I0;
    public Object I1;
    public long I2;
    public final float[] I3;
    public boolean I4;
    public long I5;
    public final RectF I6;
    public float I7;
    public uj0 I8;
    public final HashMap J;
    public String J0;
    public Object J1;
    public float J2;
    public final float[] J3;
    public float J4;
    public long J5;
    public final Path J6;
    public final RectF J7;
    public uj0 J8;
    public float K;
    public boolean K0;
    public int K1;
    public float K2;
    public int K3;
    public final float[] K4;
    public boolean K5;
    public final Path K6;
    public final TextPaint K7;
    public uj0 K8;
    public float L;
    public final p6 L0;
    public final Drawable L1;
    public float L2;
    public float[] L3;
    public final float[] L4;
    public boolean L5;
    public int L6;
    public final TextPaint L7;
    public Object L8;
    public float M;
    public final float[] M0;
    public final Drawable M1;
    public long M2;
    public float[] M3;
    public final float[] M4;
    public int M5;
    public final RectF M6;
    public final TextPaint M7;
    public float M8;
    public float N;
    public final float[] N0;
    public final Drawable N1;
    public long N2;
    public float[] N3;
    public final boolean[] N4;
    public int N5;
    public final Matrix N6;
    public TextPaint N7;
    public String N8;
    public float O;
    public final float[] O0;
    public final Drawable O1;
    public String O2;
    public int O3;
    public int O4;
    public int O5;
    public final SparseArray O6;
    public final TextPaint O7;
    public long O8;
    public float P;
    public final float[] P0;
    public final Drawable P1;
    public float P2;
    public int P3;
    public float P4;
    public float P5;
    public final Drawable[] P6;
    public StaticLayout P7;
    public float P8;
    public float Q;
    public final float[] Q0;
    public final Drawable Q1;
    public long Q2;
    public PorterDuffColorFilter Q3;
    public float Q4;
    public float Q5;
    public final RectF Q6;
    public int Q7;
    public boolean Q8;
    public boolean R;
    public final float[] R0;
    public final Drawable R1;
    public Bitmap R2;
    public int R3;
    public StaticLayout R4;
    public float R5;
    public final RectF R6;
    public boolean R7;
    public float R8;
    public boolean S;
    public final float[] S0;
    public final Drawable S1;
    public final Paint S2;
    public float S3;
    public boolean S4;
    public float S5;
    public final RectF S6;
    public final String S7;
    public float S8;
    public boolean T;
    public final float[] T0;
    public final Drawable T1;
    public boolean T2;
    public float T3;
    public final float[] T4;
    public final float[] T5;
    public final RectF T6;
    public final String T7;
    public float T8;
    public boolean U;
    public final float[] U0;
    public final Drawable U1;
    public long U2;
    public float U3;
    public final float[] U4;
    public final Paint U5;
    public final RectF U6;
    public r5 U7;
    public final OverScroller U8;
    public long V;
    public final float[] V0;
    public final k5 V1;
    public float V2;
    public float V3;
    public final float[] V4;
    public float V5;
    public boolean V6;
    public uj0 V7;
    public final ViewConfiguration V8;
    public long W;
    public final float[] W0;
    public final Paint W1;
    public final double[] W2;
    public float W3;
    public final float[] W4;
    public boolean W5;
    public boolean W6;
    public long W7;
    public VelocityTracker W8;
    public final float[] X0;
    public final String X1;
    public final double[] X2;
    public float X3;
    public final float[] X4;
    public float X5;
    public float X6;
    public boolean X7;
    public boolean X8;
    public final float[] Y0;
    public final g2 Y1;
    public final double[] Y2;
    public final long[] Y3;
    public final float[] Y4;
    public boolean Y5;
    public float Y6;
    public TLRPC.TL_inputStickerSetShortName Y7;
    public boolean Y8;
    public final float[] Z0;
    public final uj0 Z1;
    public final ArrayList Z2;
    public final float[] Z3;
    public final float[] Z4;
    public Object Z5;
    public long Z6;
    public TLRPC.Document Z7;
    public final t0 Z8;
    public boolean a;
    public float a0;
    public final byte[] a1;
    public final Paint a2;
    public float a3;
    public final float[] a4;
    public final float[] a5;
    public float a6;
    public boolean a7;
    public long a8;
    public final RippleDrawable[] a9;
    public final int b;
    public float b0;
    public final boolean[] b1;
    public int b2;
    public float b3;
    public final float[] b4;
    public final float[] b5;
    public int b6;
    public float b7;
    public LinearGradient[] b8;
    public int b9;
    public final u3.c c;
    public float c0;
    public int c1;
    public int c2;
    public float c3;
    public final float[] c4;
    public final float[] c5;
    public int c6;
    public float c7;
    public int[] c8;
    public final Paint c9;
    public String d;
    public float d0;
    public boolean d1;
    public Runnable d2;
    public boolean d3;
    public final long[] d4;
    public final float[] d5;
    public final SparseIntArray d6;
    public long d7;
    public final q10 d8;
    public final Path d9;
    public String e;
    public float e0;
    public final Random e1;
    public boolean e2;
    public Bitmap e3;
    public final boolean[] e4;
    public final float[] e5;
    public int e6;
    public final RectF e7;
    public int e8;
    public final float[] e9;
    public String f;
    public float f0;
    public float f1;
    public boolean f2;
    public int[] f3;
    public final Paint f4;
    public final boolean[] f5;
    public final LinearGradient f6;
    public long f7;
    public int f8;
    public final float[] f9;
    public float g0;
    public float g1;
    public Bitmap g2;
    public final Paint g3;
    public Paint g4;
    public int g5;
    public boolean g6;
    public float g7;
    public float g8;
    public final long[] g9;
    public boolean h;
    public float h0;
    public int h1;
    public final int[] h2;
    public final RectF h3;
    public Bitmap h4;
    public final LinearGradient h5;
    public boolean h6;
    public float h7;
    public float h8;
    public final long[] h9;
    public float i0;
    public float i1;
    public x9 i2;
    public boolean i3;
    public final float[] i4;
    public final Paint i5;
    public int i6;
    public float i7;
    public final RectF[] i8;
    public final float[] i9;
    public float j0;
    public float j1;
    public final s0 j2;
    public float j3;
    public final float[] j4;
    public final Path j5;
    public final SweepGradient[] j6;
    public final RectF j7;
    public long j8;
    public final float[] j9;
    public VelocityTracker k0;
    public float k1;
    public final t0 k2;
    public float k3;
    public final int[] k4;
    public final TextPaint k5;
    public float k6;
    public final LinearGradient k7;
    public long k8;
    public final Rect[] k9;
    public float l0;
    public float l1;
    public boolean l2;
    public float l3;
    public int l4;
    public Drawable l5;
    public float l6;
    public final Paint l7;
    public float l8;
    public float m0;
    public String m1;
    public long m2;
    public float m3;
    public final float[] m4;
    public StaticLayout m5;
    public float m6;
    public final Matrix m7;
    public float m8;
    public z0 n;
    public float n0;
    public int n1;
    public long n2;
    public float n3;
    public final float[] n4;
    public int n5;
    public float n6;
    public final RectF[] n7;
    public float n8;
    public float o0;
    public String o1;
    public long o2;
    public float o3;
    public final float[] o4;
    public final RectF o5;
    public float o6;
    public float o7;
    public float o8;
    public float p0;
    public String p1;
    public float p2;
    public float p3;
    public final float[] p4;
    public final RectF p5;
    public float p6;
    public float p7;
    public float p8;
    public int q0;
    public final RectF q1;
    public long q2;
    public final x0 q3;
    public final float[] q4;
    public final Path q5;
    public float q6;
    public boolean q7;
    public float q8;
    public z0 r;
    public long r0;
    public boolean r1;
    public final RectF r2;
    public float r3;
    public final long[] r4;
    public final float[] r5;
    public float r6;
    public int r7;
    public float r8;
    public float s;
    public final h s0;
    public float s1;
    public boolean s2;
    public float s3;
    public int s4;
    public float s5;
    public boolean s6;
    public final RectF s7;
    public final Path s8;
    public g t0;
    public float t1;
    public float t2;
    public float t3;
    public float t4;
    public final Matrix t5;
    public long t6;
    public final HashMap t7;
    public final RectF t8;
    public g u0;
    public long u1;
    public String u2;
    public float u3;
    public float u4;
    public final Matrix u5;
    public SensorManager u6;
    public final HashMap u7;
    public final RectF u8;
    public long v;
    public boolean v0;
    public final ArrayList v1;
    public String v2;
    public float v3;
    public final float[] v4;
    public final LinearGradient v5;
    public final w0 v6;
    public int v7;
    public final RectF v8;
    public float w;
    public boolean w0;
    public long w1;
    public String w2;
    public final Path w3;
    public final float[] w4;
    public final LongSparseArray w5;
    public float w6;
    public int w7;
    public long w8;
    public float x;
    public boolean x0;
    public boolean x1;
    public String x2;
    public Bitmap x3;
    public final int[] x4;
    public final Path x5;
    public float x6;
    public float x7;
    public boolean x8;
    public final long y;
    public boolean y0;
    public final HashMap y1;
    public final TextPaint y2;
    public Bitmap y3;
    public final short[] y4;
    public boolean y5;
    public float y6;
    public float y7;
    public Bitmap y8;
    public long z0;
    public final Paint z1;
    public String z2;
    public Paint z3;
    public int z4;
    public float z5;
    public float z6;
    public int z7;
    public Bitmap z8;
    public static final String[] l9 = {"❤️", "🔥", "🎉", "😎", "🚀", "💎", "💙", "✨", "⭐", "🍀", "🐸", "🦄", "🌈", "🍕", "👻", "🍒", "🌸", "⚡", "🏆", "🎁", "👀", "😍", "🥳", "🤩", "🐱", "🐶", "🦋", "🌙", "☀️", "🍓", "🍩", "🎈", "🎮", "🎧", "💜", "🌊"};
    public static final float m9 = (float) Math.atan2(-5.5d, -3.5d);
    public static int q9 = a.b("Black");
    public static int r9 = a.b("Neon Blue");
    public static final PorterDuffColorFilter[] u9 = new PorterDuffColorFilter[9];

    static {
        for (int i10 = 0; i10 <= 8; i10++) {
            u9[i10] = new PorterDuffColorFilter((((int) ((i10 * 140.25f) / 8.0f)) << 24) | 16777215, PorterDuff.Mode.SRC_ATOP);
        }
        v9 = new bs(0.16d, 1.0d, 0.3d, 1.0d);
        x7.d("M9.78283 3.01277C10.6236 1.07141 13.3768 1.07128 14.2174 3.01277L16.0651 7.2823L20.8209 7.63875C22.9981 7.80179 23.8599 10.5397 22.1686 11.92L18.6207 14.8136L19.7203 19.1817C20.243 21.2594 18.0032 22.939 16.1549 21.8555L11.9996 19.42L7.8463 21.8546C5.99747 22.9384 3.75791 21.2578 4.28185 19.1798L4.96056 16.4854C5.14523 15.7532 5.50091 15.088 5.98595 14.5372C5.19936 14.3783 4.45349 14.0318 3.81603 13.5157L1.85119 11.9249C0.150805 10.5482 1.00932 7.80116 3.19103 7.63777L7.93322 7.28132L9.78283 3.01277ZM12.8404 3.60847C12.5215 2.87274 11.4776 2.87264 11.1588 3.60847L9.17052 8.20222C9.03522 8.51476 8.73767 8.72659 8.39806 8.75203L3.30333 9.13386C2.47619 9.19581 2.15024 10.2367 2.79455 10.7589L4.75939 12.3497C5.54417 12.9851 6.564 13.2549 7.56017 13.0899L8.87951 12.8712L9.27111 14.3106L8.35705 14.6622C7.39226 15.0332 6.66837 15.8503 6.41564 16.8526L5.73595 19.546C5.53727 20.3339 6.38647 20.9714 7.08751 20.5606L11.5367 17.9532L11.6471 17.8975C11.8728 17.8034 12.1275 17.8032 12.3531 17.8975L12.4635 17.9532L16.9137 20.5616C17.6145 20.9721 18.4633 20.3356 18.2652 19.5479L17.0758 14.8194C16.9893 14.4748 17.1101 14.1115 17.3854 13.8868L21.2203 10.7579C21.8614 10.2345 21.5348 9.19698 20.7096 9.13484L15.6012 8.75203C15.2617 8.72649 14.964 8.51467 14.8287 8.20222L12.8404 3.60847Z");
    }

    /* JADX WARN: Type inference failed for: r12v18, types: [zh.s0] */
    /* JADX WARN: Type inference failed for: r12v19, types: [zh.t0] */
    /* JADX WARN: Type inference failed for: r3v27, types: [zh.t0] */
    public b1(Context context, int i10, String str, String str2, boolean z10, u3.c cVar) {
        super(context);
        boolean z11;
        g gVar;
        final int i11 = 1;
        this.a = true;
        this.s = 1.0f;
        this.y = AnimationUtils.currentAnimationTimeMillis();
        this.E = new Matrix();
        this.F = new y0();
        this.I = new ArrayList();
        this.J = new HashMap();
        Paint paint = new Paint(3);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        paint.setColorFilter(new PorterDuffColorFilter(-1, mode));
        AndroidUtilities.dp(55.0f);
        this.M = -1.0f;
        this.s0 = new h();
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
        this.C1 = new Paint(1);
        this.D1 = new Paint(1);
        this.E1 = new TextPaint(1);
        this.F1 = new TextPaint(1);
        this.G1 = new Path();
        new Path();
        this.H1 = new RectF();
        this.K1 = -1;
        this.W1 = new Paint(1);
        this.X1 = LocaleController.getString(R.string.QrScanQr);
        this.a2 = new Paint(1);
        this.b2 = 1;
        this.h2 = new int[3];
        this.j2 = new NotificationCenter.NotificationCenterDelegate() { // from class: zh.s0
            @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
            public final void didReceivedNotification(int i13, int i14, Object[] objArr) {
                b1 b1Var = b1.this;
                b1Var.getClass();
                if (objArr.length <= 1 || objArr[1] != b1Var.i2) {
                    return;
                }
                b1Var.u0();
            }
        };
        this.k2 = new Runnable(this) { // from class: zh.t0
            public final /* synthetic */ b1 b;

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
                        b1 b1Var = this.b;
                        ArrayList arrayList = b1Var.v1;
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
                                    b1Var.e0(tL_starGiftUnique.id, document);
                                }
                            }
                            b1Var.f1(tL_starGiftUnique);
                        }
                        break;
                    default:
                        b1 b1Var2 = this.b;
                        ArrayList arrayList3 = b1Var2.I;
                        if (b1Var2.f1 >= 0.5f && b1Var2.h1 == 1 && !b1Var2.Y8) {
                            float f7 = b1Var2.R8;
                            float f10 = b1Var2.S8;
                            float width = (b1Var2.getWidth() - AndroidUtilities.dp(28.0f)) / 6.0f;
                            float f11 = b1Var2.j1 + f10;
                            RectF rectF = b1Var2.e7;
                            float dp2 = f11 - (rectF.top + AndroidUtilities.dp(16.0f));
                            int i15 = -1;
                            if (dp2 >= 0.0f && f7 >= AndroidUtilities.dp(14.0f) && f10 >= rectF.top + AndroidUtilities.dp(8.0f) && (dp = (((int) (dp2 / width)) * 6) + ((int) ((f7 - AndroidUtilities.dp(14.0f)) / width))) >= 0 && dp < 36) {
                                i15 = dp;
                            }
                            if (i15 >= 0) {
                                String[] strArr = b1.l9;
                                if (arrayList3.contains(strArr[i15]) && (lastIndexOf = arrayList3.lastIndexOf(strArr[i15])) >= 0) {
                                    arrayList3.remove(lastIndexOf);
                                    b1Var2.b();
                                    b1Var2.g0();
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
        textPaint.setTypeface(AndroidUtilities.bold());
        this.A2 = -1;
        this.E2 = -1.0f;
        this.L2 = -1.0f;
        this.N2 = -1L;
        this.O2 = "";
        this.P2 = -1.0f;
        this.S2 = new Paint(3);
        this.V2 = 1.0f;
        this.W2 = new double[3];
        this.X2 = new double[3];
        this.Y2 = new double[3];
        this.Z2 = new ArrayList();
        int i13 = 2;
        this.g3 = new Paint(2);
        this.h3 = new RectF();
        new LinearGradient(-3.0f, 0.0f, 3.0f, 0.0f, new int[]{16777215, 33554431, 83886079, 134217727, 83886079, 33554431, 16777215}, new float[]{0.0f, 0.17f, 0.33f, 0.5f, 0.67f, 0.83f, 1.0f}, Shader.TileMode.CLAMP);
        this.l3 = 5.0f;
        this.m3 = -0.7071f;
        this.n3 = 0.7071f;
        this.q3 = new x0();
        this.s3 = 1.0f;
        this.u3 = -1.0f;
        this.w3 = new Path();
        this.A3 = -1.0f;
        this.B3 = -1.0f;
        this.C3 = -1.0f;
        Paint paint2 = new Paint(2);
        this.D3 = paint2;
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.E3 = new int[1024];
        this.F3 = new int[1024];
        this.G3 = new float[1024];
        this.H3 = new float[1024];
        this.I3 = new float[1024];
        this.J3 = new float[1024];
        this.P3 = -1;
        this.R3 = -1;
        this.Y3 = new long[2048];
        this.Z3 = new float[2048];
        this.a4 = new float[2048];
        this.b4 = new float[2048];
        this.c4 = new float[2048];
        this.d4 = new long[2048];
        this.e4 = new boolean[2048];
        Paint paint3 = new Paint(3);
        this.f4 = paint3;
        paint3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.i4 = new float[4096];
        this.j4 = new float[4096];
        this.k4 = new int[2048];
        this.m4 = new float[96];
        this.n4 = new float[96];
        this.o4 = new float[96];
        this.p4 = new float[96];
        this.q4 = new float[96];
        this.r4 = new long[96];
        this.v4 = new float[16384];
        this.w4 = new float[16384];
        this.x4 = new int[8192];
        this.y4 = new short[12288];
        int i14 = 0;
        while (i14 < 2048) {
            int i15 = i14 * 6;
            int i16 = i13;
            int i17 = i14 * 4;
            short[] sArr = this.y4;
            short s10 = (short) i17;
            sArr[i15] = s10;
            sArr[i15 + 1] = (short) (i17 + 1);
            short s11 = (short) (i17 + 2);
            sArr[i15 + 2] = s11;
            sArr[i15 + 3] = s11;
            sArr[i15 + 4] = (short) (i17 + 3);
            sArr[i15 + 5] = s10;
            i14++;
            i13 = i16;
        }
        int i18 = i13;
        this.D4 = new float[4096];
        this.E4 = new float[4096];
        this.F4 = new int[2048];
        this.G4 = 1.0f;
        this.H4 = 1.0f;
        this.I4 = true;
        this.J4 = 1.0f;
        setOutlineProvider(new dh.b(this, 8));
        this.K4 = new float[240];
        this.L4 = new float[240];
        this.M4 = new float[240];
        this.N4 = new boolean[240];
        this.T4 = new float[240];
        this.U4 = new float[240];
        this.V4 = new float[240];
        this.W4 = new float[240];
        this.X4 = new float[240];
        this.Y4 = new float[240];
        this.Z4 = new float[240];
        this.a5 = new float[240];
        this.b5 = new float[240];
        this.c5 = new float[240];
        this.d5 = new float[240];
        this.e5 = new float[240];
        this.f5 = new boolean[240];
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -16777216, 0, tileMode);
        this.h5 = linearGradient;
        Paint paint4 = new Paint(1);
        this.i5 = paint4;
        paint4.setShader(linearGradient);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        paint4.setXfermode(new PorterDuffXfermode(mode2));
        this.j5 = new Path();
        this.k5 = new TextPaint(65);
        this.o5 = new RectF();
        this.p5 = new RectF();
        this.q5 = new Path();
        this.r5 = new float[7];
        this.t5 = new Matrix();
        this.u5 = new Matrix();
        this.v5 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{16777215, -1, 16777215}, new float[]{0.0f, 0.88f, 1.0f}, tileMode);
        this.w5 = new LongSparseArray();
        this.x5 = new Path();
        this.z5 = 1.0f;
        this.A5 = new RectF();
        this.B5 = new RectF();
        this.C5 = new RectF();
        this.D5 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, 16777215, -1, tileMode);
        this.E5 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -1, 16777215, tileMode);
        this.F5 = new Matrix();
        this.G5 = new Paint();
        this.R5 = 0.85f;
        this.T5 = new float[320];
        Paint paint5 = new Paint();
        this.U5 = paint5;
        PorterDuff.Mode mode3 = PorterDuff.Mode.DST_IN;
        paint5.setXfermode(new PorterDuffXfermode(mode3));
        this.V5 = 1.0f;
        this.W5 = true;
        this.a6 = -1.0f;
        this.b6 = -1;
        this.d6 = new SparseIntArray();
        this.e6 = -1;
        new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, 1090519039, 16777215, tileMode);
        this.f6 = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, 352321535, 16777215, tileMode);
        this.i6 = -1;
        this.j6 = new SweepGradient[4];
        this.v6 = new w0(this);
        this.E6 = new Matrix();
        this.F6 = new Matrix();
        this.G6 = new Path();
        this.H6 = new Path();
        this.I6 = new RectF();
        this.J6 = new Path();
        this.K6 = new Path();
        this.L6 = -1;
        this.M6 = new RectF();
        new RectF();
        new LinearGradient(0.0f, 0.0f, 1.0f, 1.0f, new int[]{637534208, 218103808, 436207616}, (float[]) null, tileMode);
        new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{1811939327, 788529151, 956301311}, new float[]{0.0f, 0.45f, 1.0f}, tileMode);
        this.N6 = new Matrix();
        this.O6 = new SparseArray();
        this.Q6 = new RectF();
        this.R6 = new RectF();
        this.S6 = new RectF();
        this.T6 = new RectF();
        this.U6 = new RectF();
        this.X6 = 1.0f;
        this.Y6 = 1.0f;
        this.b7 = 1.0f;
        this.c7 = 1.0f;
        this.e7 = new RectF();
        new RectF();
        this.j7 = new RectF();
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{0, 805306368, -1627389952, -285212672, -16777216}, new float[]{0.0f, 0.25f, 0.5f, 0.75f, 1.0f}, tileMode);
        this.k7 = linearGradient2;
        Paint paint6 = new Paint();
        this.l7 = paint6;
        paint6.setXfermode(new PorterDuffXfermode(mode3));
        paint6.setShader(linearGradient2);
        this.m7 = new Matrix();
        RectF rectF = new RectF();
        RectF rectF2 = new RectF();
        RectF rectF3 = new RectF();
        RectF rectF4 = new RectF();
        RectF rectF5 = new RectF();
        RectF rectF6 = new RectF();
        RectF[] rectFArr = new RectF[6];
        rectFArr[0] = rectF;
        rectFArr[1] = rectF2;
        rectFArr[i18] = rectF3;
        rectFArr[3] = rectF4;
        rectFArr[4] = rectF5;
        rectFArr[5] = rectF6;
        this.n7 = rectFArr;
        this.o7 = -1.0f;
        this.p7 = -1.0f;
        this.s7 = new RectF();
        this.t7 = new HashMap();
        this.u7 = new HashMap();
        this.v7 = -1;
        this.w7 = q9;
        this.z7 = -1;
        this.A7 = -1;
        new Path();
        new Path();
        new PathMeasure();
        this.E7 = AndroidUtilities.dp(20.17f);
        new RectF();
        this.F7 = -1;
        this.H7 = -1L;
        this.I7 = 1.0f;
        this.J7 = new RectF();
        this.K7 = new TextPaint(1);
        this.L7 = new TextPaint(1);
        this.M7 = new TextPaint(1);
        TextPaint textPaint2 = new TextPaint(129);
        this.O7 = textPaint2;
        textPaint2.setXfermode(new PorterDuffXfermode(mode2));
        this.S7 = LocaleController.getString(R.string.QrNoGiftsTitle);
        this.T7 = LocaleController.getString(R.string.QrBrowseGifts);
        int[] iArr = a.b;
        this.b8 = new LinearGradient[iArr.length];
        this.c8 = new int[iArr.length];
        this.d8 = new q10(i18);
        this.e8 = -100;
        this.f8 = -100;
        new RectF();
        this.i8 = new RectF[]{new RectF(), new RectF(), new RectF()};
        this.s8 = new Path();
        this.t8 = new RectF();
        this.u8 = new RectF();
        this.v8 = new RectF();
        this.A8 = new Paint(3);
        this.B8 = new Paint(1);
        this.C8 = new RectF();
        this.M8 = -1.0f;
        this.U8 = new OverScroller(getContext());
        this.V8 = ViewConfiguration.get(getContext());
        this.Z8 = new Runnable(this) { // from class: zh.t0
            public final /* synthetic */ b1 b;

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
                        b1 b1Var = this.b;
                        ArrayList arrayList = b1Var.v1;
                        for (int i132 = 0; i132 < Math.min(arrayList.size(), 9); i132++) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i132);
                            ArrayList<TL_stars.StarGiftAttribute> arrayList2 = tL_starGiftUnique.attributes;
                            int size = arrayList2.size();
                            int i142 = 0;
                            while (i142 < size) {
                                TL_stars.StarGiftAttribute starGiftAttribute = arrayList2.get(i142);
                                i142++;
                                TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                                if ((starGiftAttribute2 instanceof TL_stars.starGiftAttributeModel) && (document = ((TL_stars.starGiftAttributeModel) starGiftAttribute2).document) != null) {
                                    b1Var.e0(tL_starGiftUnique.id, document);
                                }
                            }
                            b1Var.f1(tL_starGiftUnique);
                        }
                        break;
                    default:
                        b1 b1Var2 = this.b;
                        ArrayList arrayList3 = b1Var2.I;
                        if (b1Var2.f1 >= 0.5f && b1Var2.h1 == 1 && !b1Var2.Y8) {
                            float f7 = b1Var2.R8;
                            float f10 = b1Var2.S8;
                            float width = (b1Var2.getWidth() - AndroidUtilities.dp(28.0f)) / 6.0f;
                            float f11 = b1Var2.j1 + f10;
                            RectF rectF7 = b1Var2.e7;
                            float dp2 = f11 - (rectF7.top + AndroidUtilities.dp(16.0f));
                            int i152 = -1;
                            if (dp2 >= 0.0f && f7 >= AndroidUtilities.dp(14.0f) && f10 >= rectF7.top + AndroidUtilities.dp(8.0f) && (dp = (((int) (dp2 / width)) * 6) + ((int) ((f7 - AndroidUtilities.dp(14.0f)) / width))) >= 0 && dp < 36) {
                                i152 = dp;
                            }
                            if (i152 >= 0) {
                                String[] strArr = b1.l9;
                                if (arrayList3.contains(strArr[i152]) && (lastIndexOf = arrayList3.lastIndexOf(strArr[i152])) >= 0) {
                                    arrayList3.remove(lastIndexOf);
                                    b1Var2.b();
                                    b1Var2.g0();
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        };
        this.a9 = new RippleDrawable[12];
        ColorStateList.valueOf(738197503);
        ColorStateList.valueOf(335544320);
        this.b9 = -1;
        this.c9 = new Paint(1);
        this.d9 = new Path();
        this.e9 = new float[12];
        this.f9 = new float[12];
        this.g9 = new long[12];
        this.h9 = new long[12];
        this.i9 = new float[12];
        this.j9 = new float[12];
        this.k9 = new Rect[12];
        for (int i19 = 0; i19 < 12; i19++) {
            this.k9[i19] = new Rect();
        }
        this.b = i10;
        this.d = str;
        this.f = str2;
        this.h = z10;
        this.c = cVar;
        this.N1 = v(R.drawable.msg_share);
        this.O1 = v(R.drawable.msg_download);
        this.P1 = v(R.drawable.msg_qr_scan);
        this.W1.setTypeface(AndroidUtilities.bold());
        Drawable v = v(R.drawable.msg_colors);
        this.Q1 = v;
        Drawable v10 = v(R.drawable.input_smile);
        this.R1 = v10;
        Drawable v11 = v(R.drawable.menu_gift);
        this.S1 = v11;
        this.Y1 = new g2(true);
        this.T1 = v(R.drawable.msg_retry);
        this.U1 = v(R.drawable.msg_recent);
        this.V1 = new k5(1);
        this.L1 = v(R.drawable.msg_copy);
        this.M1 = v(R.drawable.menu_premium_main);
        this.P6 = new Drawable[]{v, v10, v11};
        uj0 uj0Var = new uj0(R.raw.plane_logo_plain, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null);
        this.Z1 = uj0Var;
        uj0Var.R(this);
        uj0Var.K(1);
        uj0Var.setCallback(this);
        uj0Var.start();
        Paint paint7 = this.a2;
        Paint.Style style = Paint.Style.STROKE;
        paint7.setStyle(style);
        this.a2.setStrokeCap(Paint.Cap.ROUND);
        this.a2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.E1.setTextSize(AndroidUtilities.dp(11.0f));
        this.F1.setTypeface(AndroidUtilities.bold());
        this.C1.setStyle(style);
        this.A1.setStyle(style);
        p6 p6Var = new p6(false, true, true);
        this.L0 = p6Var;
        p6Var.w(AndroidUtilities.dp(11.0f));
        p6Var.n(0.35f, 280L, bs.h);
        p6Var.setCallback(this);
        p6Var.b = 3;
        z0 s12 = s(q9);
        this.n = s12;
        this.L6 = P0(s12.c);
        if (str != null) {
            String str3 = this.d;
            if (!str3.equals(s9) || (gVar = t9) == null) {
                g a2 = h.a(AndroidUtilities.dp(240.0f), str3);
                this.t0 = a2;
                t9 = a2;
                s9 = str3;
            } else {
                this.t0 = gVar;
            }
            h hVar = this.s0;
            hVar.m = this.t0;
            hVar.n = null;
            hVar.q = 2;
            hVar.o = 0.0f;
            hVar.p = 0L;
            hVar.E = 0L;
            z11 = false;
            hVar.F = false;
        } else {
            z11 = false;
        }
        n1(z11);
    }

    public static int P0(int i10) {
        double[] dArr = new double[3];
        double[] dArr2 = new double[3];
        h1(i10, dArr);
        double hypot = Math.hypot(dArr[1], dArr[2]);
        if (hypot < 0.03d) {
            return -1;
        }
        Z(0.96d, Math.min(0.06d, hypot * 0.7d), Math.atan2(dArr[2], dArr[1]), dArr2);
        return Color.rgb((int) Math.round(q(b0(q(dArr2[0]))) * 255.0d), (int) Math.round(q(b0(q(dArr2[1]))) * 255.0d), (int) Math.round(q(b0(q(dArr2[2]))) * 255.0d));
    }

    public static float R(float f7, float f10) {
        float f11 = f7 - 1.0f;
        return a6.t(f10, f11, f11, ((f10 + 1.0f) * f11 * f11 * f11) + 1.0f);
    }

    public static int S0(int i10) {
        double[] dArr = new double[3];
        i0.b.j(i10, dArr);
        return i0.b.o(i0.b.b(Math.min(96.0d, dArr[0] + 24.0d), dArr[1] * 0.75d, dArr[2] * 0.75d), 26);
    }

    public static int X0(int i10) {
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

    public static float Y0(boolean z10, boolean z11, float f7) {
        if (!z10) {
            if (!z11) {
                f7 -= 0.135f;
            }
            if (f7 <= 0.0f) {
                return 0.0f;
            }
            if (f7 < 0.315f) {
                float f10 = (f7 / 0.315f) - 1.0f;
                return a6.t(f10, 1.70158f, f10, (2.70158f * f10 * f10 * f10) + 1.0f);
            }
        } else if (f7 > 0.0f) {
            return org.telegram.ui.Cells.t0.v(f7, 0.18f, 1.0f, 0.0f);
        }
        return 1.0f;
    }

    public static void Z(double d, double d10, double d11, double[] dArr) {
        double cos = Math.cos(d11);
        double sin = Math.sin(d11);
        y0(d, d10 * cos, d10 * sin, dArr);
        if (n0(dArr)) {
            return;
        }
        double d12 = 0.0d;
        double d13 = d10;
        for (int i10 = 0; i10 < 14; i10++) {
            double d14 = (d12 + d13) / 2.0d;
            y0(d, d14 * cos, d14 * sin, dArr);
            if (n0(dArr)) {
                d12 = d14;
            } else {
                d13 = d14;
            }
        }
        y0(d, d12 * cos, d12 * sin, dArr);
    }

    public static float Z0(float f7, float f10, float f11) {
        float clamp01 = Utilities.clamp01((f11 - f7) / (f10 - f7));
        return a6.B(clamp01, 2.0f, 3.0f, clamp01 * clamp01);
    }

    public static int a(float f7, int i10) {
        return i0.b.o(i10, (int) (Utilities.clamp01(f7) * Color.alpha(i10)));
    }

    public static float a0(double d) {
        return (float) (d - Math.floor(d));
    }

    public static double a1(double d, double d10, double d11) {
        if (d <= 0.0d) {
            return 0.0d;
        }
        double d12 = 6.283185307179586d / d11;
        double d13 = 1.0d - (d10 * d10);
        double sqrt = Math.sqrt(d13) * d12;
        double d14 = sqrt * d;
        return 1.0d - (((Math.sin(d14) * (d10 / Math.sqrt(d13))) + Math.cos(d14)) * Math.exp(((-d10) * d12) * d));
    }

    public static double b0(double d) {
        return d <= 0.0031308d ? d * 12.92d : (Math.pow(d, 0.4166666666666667d) * 1.055d) - 0.055d;
    }

    public static float b1(int i10) {
        float f7 = i10 / 255.0f;
        return f7 <= 0.04045f ? f7 / 12.92f : (float) Math.pow((f7 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static int e1(int i10, int i11) {
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

    public static int f(float f7, int i10) {
        return (((int) (Math.max(0.0f, Math.min(1.0f, f7)) * 255.0f)) << 24) | (i10 & 16777215);
    }

    public static void h1(int i10, double[] dArr) {
        double r02 = r0(Color.red(i10) / 255.0d);
        double r03 = r0(Color.green(i10) / 255.0d);
        double r04 = r0(Color.blue(i10) / 255.0d);
        double cbrt = Math.cbrt((0.0514459929d * r04) + (0.5363325363d * r03) + (0.4122214708d * r02));
        double cbrt2 = Math.cbrt((0.1073969566d * r04) + (0.6806995451d * r03) + (0.2119034982d * r02));
        double cbrt3 = Math.cbrt((r04 * 0.6299787005d) + (r03 * 0.2817188376d) + (r02 * 0.0883024619d));
        dArr[0] = ((0.793617785d * cbrt2) + (0.2104542553d * cbrt)) - (0.0040720468d * cbrt3);
        dArr[1] = (0.4505937099d * cbrt3) + ((1.9779984951d * cbrt) - (2.428592205d * cbrt2));
        dArr[2] = ((cbrt2 * 0.7827717662d) + (cbrt * 0.0259040371d)) - (cbrt3 * 0.808675766d);
    }

    public static float i(float f7, float f10, long j10) {
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
            return AndroidUtilities.lerp(f7 + 1.0f, 1.0f - f10, a6.B(f11, 2.0f, 3.0f, f11 * f11));
        }
        float f12 = (currentAnimationTimeMillis - 0.6f) / 0.4f;
        return AndroidUtilities.lerp(1.0f - f10, 1.0f, a6.B(f12, 2.0f, 3.0f, f12 * f12));
    }

    public static float i0(int i10, int i11, int i12) {
        int i13 = (i12 * 1442695041) + (i11 * 668265263) + (i10 * 374761393);
        int i14 = ((i13 >>> 13) ^ i13) * 1274126177;
        return ((i14 ^ (i14 >>> 16)) & 65535) / 65535.0f;
    }

    public static void j() {
        if (n9 != null) {
            return;
        }
        int length = a.b.length;
        n9 = new int[length];
        o9 = new int[length];
        p9 = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            n9[i10] = w(a.b[i10], false);
            o9[i10] = w(a.c[i10], true);
            p9[i10] = u(n9[i10], o9[i10]);
        }
    }

    public static void k(z0 z0Var) {
        z0Var.i = S0(z0Var.b);
        h.i(0.55f, z0Var.c, z0Var.b);
        int i10 = z0Var.b;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        z0Var.g = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i10, h.i(0.5f, i10, z0Var.c), z0Var.c}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
        int i11 = z0Var.b;
        z0Var.h = new RadialGradient(0.0f, 0.0f, 1.0f, new int[]{i11, h.i(0.5f, i11, z0Var.c), z0Var.c}, new float[]{0.0f, 0.55f, 1.0f}, tileMode);
        int f7 = i0.b.f(0.22f, z0Var.b, -1);
        new RadialGradient(0.0f, 0.0f, 1.0f, new int[]{i0.b.o(f7, ImageReceiver.DEFAULT_CROSSFADE_DURATION), i0.b.o(f7, 50), 0}, new float[]{0.0f, 0.45f, 1.0f}, tileMode);
        float[] fArr = new float[3];
        Color.colorToHSV(z0Var.b, fArr);
        fArr[0] = (fArr[0] + 28.0f) % 360.0f;
        fArr[1] = Math.min(1.0f, fArr[1] * 1.1f);
        int HSVToColor = Color.HSVToColor(fArr);
        new RadialGradient(0.0f, 0.0f, 1.0f, new int[]{i0.b.o(HSVToColor, ImageReceiver.DEFAULT_CROSSFADE_DURATION), i0.b.o(HSVToColor, 0)}, (float[]) null, tileMode);
    }

    public static boolean k0(RectF rectF, float f7, float f10) {
        float dp = AndroidUtilities.dp(8.0f);
        return !rectF.isEmpty() && f7 >= rectF.left - dp && f7 <= rectF.right + dp && f10 >= rectF.top - dp && f10 <= rectF.bottom + dp;
    }

    public static float m1(float f7, float f10, float f11) {
        float dpf2 = (f7 - f11) / AndroidUtilities.dpf2(1.7f);
        float dpf22 = f10 / AndroidUtilities.dpf2(3.2f);
        return AndroidUtilities.dpf2(3.6f) * (((p1(dpf2 * 2.6f, dpf22 * 1.7f, 91) * 0.32f) + (p1(dpf2, dpf22, 17) * 0.68f)) - 0.5f);
    }

    public static boolean n0(double[] dArr) {
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

    public static float o1(float f7) {
        int floor = (int) Math.floor(f7);
        float f10 = f7 - floor;
        float B = a6.B(f10, 2.0f, 3.0f, f10 * f10);
        float a02 = a0(Math.sin(floor * 127.1d) * 43758.5453d);
        return ((a0(Math.sin((floor + 1) * 127.1d) * 43758.5453d) - a02) * B) + a02;
    }

    public static float p1(float f7, float f10, int i10) {
        int floor = (int) Math.floor(f7);
        int floor2 = (int) Math.floor(f10);
        float f11 = f7 - floor;
        float f12 = f10 - floor2;
        float B = a6.B(f11, 2.0f, 3.0f, f11 * f11);
        float B2 = a6.B(f12, 2.0f, 3.0f, f12 * f12);
        float i02 = i0(floor, floor2, i10);
        int i11 = floor + 1;
        float i03 = i0(i11, floor2, i10);
        int i12 = floor2 + 1;
        float i04 = i0(floor, i12, i10);
        float i05 = i0(i11, i12, i10);
        float x10 = a6.x(i03, i02, B, i02);
        return (((((i05 - i04) * B) + i04) - x10) * B2) + x10;
    }

    public static double q(double d) {
        if (d < 0.0d) {
            return 0.0d;
        }
        if (d > 1.0d) {
            return 1.0d;
        }
        return d;
    }

    public static double q0(int i10, int i11) {
        long j10 = (i11 * (-4417276706812531889L)) ^ (i10 * (-7046029254386353131L));
        long j11 = (j10 ^ (j10 >>> 31)) * (-4658895280553007687L);
        long j12 = (j11 ^ (j11 >>> 27)) * (-7723592293110705685L);
        return ((j12 ^ (j12 >>> 31)) >>> 11) / 9.007199254740992E15d;
    }

    public static double r0(double d) {
        return d <= 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
    }

    public static float r1(float f7) {
        return 1.0f - ((float) Math.pow(1.0f - f7, 2.4000000953674316d));
    }

    public static z0 s(int i10) {
        z0 z0Var = new z0();
        z0Var.a = 0;
        z0Var.f = i10;
        if (i10 == r9) {
            z0Var.b = -12602881;
            z0Var.c = -15308082;
            z0Var.d = a.d[i10];
        } else {
            z0Var.b = w(a.b[i10], false);
            z0Var.c = w(a.c[i10], true);
            z0Var.d = a.d[i10];
        }
        if (i10 == r9) {
            z0Var.e = -16747023;
        } else {
            j();
            z0Var.e = p9[i10];
        }
        k(z0Var);
        return z0Var;
    }

    public static int s0(float f7) {
        float max = Math.max(0.0f, Math.min(1.0f, f7));
        return Math.round(Math.max(0.0f, Math.min(1.0f, max <= 0.0031308f ? max * 12.92f : (((float) Math.pow(max, 0.4166666567325592d)) * 1.055f) - 0.055f)) * 255.0f);
    }

    private void setPattern(y0 y0Var) {
        if (!this.f2) {
            y0Var.h = this.s < 1.0f && this.r != null;
            if (y0Var.a == 2) {
                X(y0Var);
                if (y0Var.e == null) {
                    y0Var.f = this.g2;
                }
            }
            y0 y0Var2 = this.G;
            if (y0Var2 != null && y0Var2 != this.F) {
                I0(y0Var2);
            }
            this.G = this.F;
            this.F = y0Var;
            this.H = AnimationUtils.currentAnimationTimeMillis();
            invalidate();
            return;
        }
        y0 y0Var3 = this.G;
        if (y0Var3 != null && y0Var3 != this.F) {
            I0(y0Var3);
        }
        y0 y0Var4 = this.F;
        if (y0Var4 != y0Var) {
            I0(y0Var4);
        }
        this.G = null;
        this.F = y0Var;
        if (y0Var.a == 2) {
            X(y0Var);
            if (y0Var.e == null) {
                y0Var.f = this.g2;
            }
        }
        this.H = AnimationUtils.currentAnimationTimeMillis() - 10000;
        invalidate();
    }

    private void setSceneFromCard(z0 z0Var) {
        R0(z0Var, getWidth() / 2.0f, (l() / 2.0f) + m());
        if (this.f2) {
            return;
        }
        this.p2 = i(0.03f, 0.005f, this.n2);
        this.n2 = AnimationUtils.currentAnimationTimeMillis();
    }

    public static int t(z0 z0Var) {
        int f7 = z0Var != null ? i0.b.f(0.5f, z0Var.b, z0Var.c) : -16777216;
        double h = z0Var != null ? i0.b.h(z0Var.b) : 0.3d;
        float[] fArr = e1.b;
        float max = (fArr[10] / 100.0f) * ((float) Math.max(0.0d, Math.min(1.0d, (0.85d - h) / 0.45d)));
        float f10 = (fArr[11] / 100.0f) + 1.0f;
        float f11 = ((0.5f - (f10 * 0.5f)) + max) * 255.0f;
        return i0.b.k(z0Var != null ? z0Var.i : TLObject.FLAG_30, i0.b.k(f((fArr[3] + fArr[9]) / 100.0f, 16777215), Color.rgb(Math.max(0, Math.min(255, Math.round((Color.red(f7) * f10) + f11))), Math.max(0, Math.min(255, Math.round((Color.green(f7) * f10) + f11))), Math.max(0, Math.min(255, Math.round((f10 * Color.blue(f7)) + f11))))));
    }

    public static PorterDuffColorFilter t0(y0 y0Var) {
        float[] fArr = e1.b;
        int i10 = ((int) (fArr[14] * 10.0f)) ^ y0Var.l;
        if (y0Var.q == null || y0Var.p != i10) {
            y0Var.p = i10;
            y0Var.q = new PorterDuffColorFilter(i0.b.f(fArr[14] / 100.0f, y0Var.l, -1), PorterDuff.Mode.SRC_IN);
        }
        return y0Var.q;
    }

    public static int u(int i10, int i11) {
        double d;
        double atan2;
        double min;
        double[] dArr = new double[3];
        double[] dArr2 = new double[3];
        double[] dArr3 = new double[3];
        h1(i11, dArr);
        h1(i10, dArr2);
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
            Z(d16, d18, d17, dArr3);
            if (1.05d / (((q(dArr3[2]) * 0.0722d) + ((q(dArr3[1]) * 0.7152d) + (q(dArr3[0]) * 0.2126d))) + 0.05d) > 4.4d) {
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
        Z(d21, d20, d19, dArr3);
        return Color.rgb((int) Math.round(q(b0(q(dArr3[0]))) * 255.0d), (int) Math.round(q(b0(q(dArr3[1]))) * 255.0d), (int) Math.round(q(b0(q(dArr3[2]))) * 255.0d));
    }

    public static int w(int i10, boolean z10) {
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

    public static void y0(double d, double d10, double d11, double[] dArr) {
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

    public static int z0(float f7, float f10, float f11, int i10) {
        float b12 = b1(Color.red(i10));
        float b13 = b1(Color.green(i10));
        float b14 = b1(Color.blue(i10));
        float cbrt = (float) Math.cbrt((0.051445995f * b14) + (0.53633255f * b13) + (0.41222146f * b12));
        float cbrt2 = (float) Math.cbrt((0.10739696f * b14) + (0.6806995f * b13) + (0.2119035f * b12));
        float cbrt3 = (float) Math.cbrt((b14 * 0.6299787f) + (b13 * 0.28171885f) + (b12 * 0.08830246f));
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
        return Color.rgb(s0((0.23096994f * f21) + ((4.0767417f * f19) - (3.3077116f * f20))), s0(((2.6097574f * f20) + ((-1.268438f) * f19)) - (0.34131938f * f21)), s0((f21 * 1.7076147f) + ((f19 * (-0.0041960864f)) - (f20 * 0.7034186f))));
    }

    public final void A(Canvas canvas, Path path, RectF rectF, float f7, float f10) {
        int i10;
        int i11;
        float f11;
        RectF rectF2;
        float f12;
        float[] fArr;
        float f13;
        float f14;
        float f15;
        float f16;
        float[][] fArr2;
        float f17;
        int i12;
        Path path2 = path;
        int i13 = this.i6;
        SweepGradient[] sweepGradientArr = this.j6;
        int i14 = 4;
        float[][] fArr3 = e1.a;
        int i15 = 1;
        if (i13 != 1) {
            this.i6 = 1;
            int i16 = 0;
            while (i16 < i14) {
                float[] fArr4 = fArr3[i16];
                int[] iArr = new int[73];
                float[] fArr5 = new float[73];
                int i17 = i14;
                int i18 = 0;
                for (int i19 = 73; i18 < i19; i19 = 73) {
                    int i20 = i15;
                    float[] fArr6 = fArr4;
                    double radians = Math.toRadians(i18 * 5);
                    int[] iArr2 = iArr;
                    float pow = (float) Math.pow(Math.abs(Math.cos(radians)), fArr6[6]);
                    float f18 = (((float) Math.sin(radians)) < 0.0f ? fArr6[11] : fArr6[12]) / 100.0f;
                    iArr2[i18] = f(Math.min(1.0f, (((fArr6[5] / 100.0f) - f18) * pow) + f18), 0);
                    fArr5[i18] = i18 / 72.0f;
                    i18++;
                    i15 = i20;
                    fArr4 = fArr6;
                    iArr = iArr2;
                }
                sweepGradientArr[i16] = new SweepGradient(0.0f, 0.0f, iArr, fArr5);
                i16++;
                i14 = i17;
            }
        }
        int i21 = i14;
        int i22 = i15;
        int i23 = this.g6 ? i22 : this.h6 ? 2 : 0;
        float[] fArr7 = fArr3[i23];
        float f19 = this.k6;
        float[] fArr8 = e1.b;
        float f20 = f19 * fArr8[0];
        float f21 = (this.l6 * fArr8[i22]) / 100.0f;
        float dpf2 = AndroidUtilities.dpf2(fArr7[8]);
        if (dpf2 != 0.0f) {
            rectF2 = this.M6;
            rectF2.set(rectF);
            rectF2.inset(dpf2, dpf2);
            if (path2 != null) {
                i11 = 2;
                float width = rectF2.width() / Math.max(1.0f, rectF.width());
                i10 = i23;
                float height = rectF2.height() / Math.max(1.0f, rectF.height());
                float centerX = rectF.centerX();
                float centerY = rectF.centerY();
                Matrix matrix = this.F6;
                matrix.setScale(width, height, centerX, centerY);
                Path path3 = this.H6;
                path2.transform(matrix, path3);
                path2 = path3;
            } else {
                i10 = i23;
                i11 = 2;
            }
            f11 = Math.max(0.0f, f7 - dpf2);
        } else {
            i10 = i23;
            i11 = 2;
            f11 = f7;
            rectF2 = rectF;
        }
        Matrix matrix2 = this.N6;
        matrix2.setRotate(f20);
        matrix2.postScale(rectF2.width() / Math.max(1.0f, rectF2.height()), 1.0f);
        matrix2.postTranslate(rectF2.centerX(), rectF2.centerY());
        float dpf22 = AndroidUtilities.dpf2(fArr7[i21]);
        if (dpf22 > 0.05f) {
            SweepGradient sweepGradient = sweepGradientArr[i10];
            sweepGradient.setLocalMatrix(matrix2);
            Paint paint = this.C1;
            paint.setShader(sweepGradient);
            paint.setColor(-1);
            paint.setAlpha((int) (f10 * 255.0f));
            if (path2 == null) {
                paint.setStrokeWidth(dpf22);
                RectF rectF3 = this.B5;
                rectF3.set(rectF2);
                float f22 = (-dpf22) / 2.0f;
                rectF3.inset(f22, f22);
                float f23 = (dpf22 / 2.0f) + f11;
                canvas.drawRoundRect(rectF3, f23, f23, paint);
            } else {
                canvas.save();
                b0.b(canvas, path2);
                paint.setStrokeWidth(dpf22 * 2.0f);
                canvas.drawPath(path2, paint);
                canvas.restore();
            }
            paint.setShader(null);
            paint.setAlpha(255);
        }
        double radians2 = Math.toRadians(f20);
        float f24 = (float) (-Math.sin(radians2));
        float cos = (float) Math.cos(radians2);
        float dpf23 = AndroidUtilities.dpf2(fArr7[0]);
        float dpf24 = AndroidUtilities.dpf2(fArr7[i11]);
        float f25 = this.h6 ? 0.0f : ((fArr8[21] * 1.25f) / 100.0f) * this.H5;
        if (f25 <= 0.0f || !this.d3) {
            f12 = f24;
            fArr = fArr7;
            f13 = 0.0f;
        } else {
            f12 = f24;
            fArr = fArr7;
            f13 = V0(rectF2.centerX(), rectF2.top, getWidth(), getHeight());
        }
        float V0 = (f25 <= 0.0f || !this.d3) ? 0.0f : V0(rectF2.centerX(), rectF2.bottom, getWidth(), getHeight());
        float min = Math.min(1.0f, ((f13 * f25) + 1.0f) * (f21 + 1.0f) * (fArr[i22] / 100.0f));
        float min2 = Math.min(1.0f, ((f25 * V0) + 1.0f) * (1.0f - f21) * (fArr[3] / 100.0f));
        int i24 = Build.VERSION.SDK_INT >= 29 ? i22 : 0;
        int i25 = 0;
        for (int i26 = i11; i25 < i26; i26 = 2) {
            float f26 = i25 == 0 ? dpf23 : -dpf24;
            float f27 = i25 == 0 ? min : min2;
            if (f27 <= 0.004f || Math.abs(f26) < 0.1f) {
                f14 = f11;
                f15 = min;
                f16 = min2;
                fArr2 = fArr3;
                f17 = cos;
                i12 = i22;
            } else {
                canvas.save();
                Path path4 = this.J6;
                f15 = min;
                Path path5 = this.K6;
                if (path2 == null) {
                    f16 = min2;
                    fArr2 = fArr3;
                    float min3 = Math.min(f11, Math.min(rectF2.width(), rectF2.height()) / 2.0f);
                    path4.rewind();
                    Path.Direction direction = Path.Direction.CW;
                    path4.addRoundRect(rectF2, min3, min3, direction);
                    f14 = f11;
                    RectF rectF4 = this.I6;
                    rectF4.set(rectF2);
                    f17 = cos;
                    rectF4.offset(f12 * f26, f26 * f17);
                    path5.rewind();
                    path5.addRoundRect(rectF4, min3, min3, direction);
                } else {
                    f14 = f11;
                    f16 = min2;
                    fArr2 = fArr3;
                    f17 = cos;
                    path4.set(path2);
                    path5.set(path2);
                    path5.offset(f12 * f26, f17 * f26);
                }
                b0.b(canvas, path5);
                Paint paint2 = this.B1;
                if (i24 == 0) {
                    float f28 = fArr2[i10][10];
                    int i27 = this.L6;
                    paint2.setColor(Color.rgb(Math.max(0, Math.min(255, Math.round(((Color.red(i27) - 255) * f28) + 255.0f))), Math.max(0, Math.min(255, Math.round(((Color.green(i27) - 255) * f28) + 255.0f))), Math.max(0, Math.min(255, Math.round(((Color.blue(i27) - 255) * f28) + 255.0f)))));
                    paint2.setAlpha((int) (f27 * 255.0f * f10));
                    i12 = i22;
                } else {
                    int round = Math.round(Math.max(0.0f, Math.min(1.0f, f27)) * 255.0f);
                    paint2.setColor(round | (round << 16) | (-16777216) | (round << 8));
                    paint2.setAlpha((int) (f10 * 255.0f));
                    i12 = i22;
                    b0.i(paint2, i12);
                }
                canvas.drawPath(path4, paint2);
                if (i24 != 0) {
                    b0.i(paint2, 0);
                }
                canvas.restore();
            }
            i25++;
            i22 = i12;
            min = f15;
            min2 = f16;
            fArr3 = fArr2;
            f11 = f14;
            cos = f17;
        }
    }

    public final void A0(y0 y0Var, Bitmap bitmap) {
        y0Var.e = bitmap;
        if (bitmap != null && g0.a.g()) {
            y0Var.m = bitmap;
            y0Var.n = g0.a.a(bitmap);
            y0Var.o = g0.a.a(bitmap);
            this.h4 = bitmap;
            this.g4 = g0.a.a(bitmap);
            if (e1.b[35] > 0.5f) {
                W(bitmap);
            }
            t0(y0Var);
        }
        y0Var.g = AnimationUtils.currentAnimationTimeMillis();
        this.g2 = bitmap;
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(Canvas canvas, y0 y0Var, int i10, float f7, float f10, float f11, float f12, float f13) {
        i iVar;
        float f14;
        float f15;
        Drawable drawable = y0Var.b[i10];
        if (drawable == null || f12 <= 0.01f) {
            return;
        }
        float A = a6.A((float) Math.sin((this.r3 * 1.3f) + f11), 0.03f, 1.0f, a6.A(this.p0, 0.08f, 1.0f, (this.o0 + 1.0f) * this.l0 * f12));
        int round = Math.round(f7 / 2.0f);
        l lVar = y0Var.u;
        if (lVar != null) {
            iVar = (i) lVar.e.get(Long.valueOf(y0Var.s[i10]));
        } else {
            iVar = null;
        }
        if (iVar == null) {
            canvas.save();
            canvas.translate(this.o3, this.p3);
            canvas.rotate(f10 + this.n0);
            canvas.scale(A, A);
            int i11 = -round;
            drawable.setBounds(i11, i11, round, round);
            drawable.setAlpha((int) (this.m0 * 255.0f));
            float f16 = this.p0;
            if (x.d(drawable)) {
                x.b(canvas, drawable);
            } else {
                if (f16 > 0.02f) {
                    drawable.setColorFilter(u9[Math.min(8, Math.round(f16 * 8.0f))]);
                }
                drawable.draw(canvas);
                if (f16 > 0.02f) {
                    drawable.setColorFilter(null);
                }
            }
            drawable.setAlpha(255);
            canvas.restore();
            return;
        }
        int i12 = iVar.b;
        int i13 = iVar.a;
        if (!this.T2) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i14 = (int) (i12 * f13);
            lVar.getClass();
            if (i12 > 1) {
                f14 = 0.02f;
                f15 = 8.0f;
                i13 += (int) ((((elapsedRealtime * iVar.c) / 1000) + i14) % i12);
                int i15 = lVar.d;
                int i16 = lVar.b;
                int i17 = lVar.c;
                float f17 = ((i13 % i15) * i17) + 2;
                float C = a1.g.C(i13, i15, i17, 2);
                float f18 = round * 2.0f * A;
                float f19 = f10 + this.n0;
                if (!y0Var.t[i10]) {
                    y0Var.I.c(this.o3, this.p3, f18, f19, f17, C, i16, this.m0);
                    return;
                }
                float f20 = i16;
                y0Var.H.c(this.o3, this.p3, f18, f19, f17, C, f20, this.m0);
                if (this.p0 > f14) {
                    y0Var.I.c(this.o3, this.p3, f18, f19, f17, C, f20, ((Math.min(8, Math.round(r1 * f15)) * 0.55f) / f15) * this.m0);
                    return;
                }
                return;
            }
        }
        f14 = 0.02f;
        f15 = 8.0f;
        int i152 = lVar.d;
        int i162 = lVar.b;
        int i172 = lVar.c;
        float f172 = ((i13 % i152) * i172) + 2;
        float C2 = a1.g.C(i13, i152, i172, 2);
        float f182 = round * 2.0f * A;
        float f192 = f10 + this.n0;
        if (!y0Var.t[i10]) {
        }
    }

    public final void B0(int i10) {
        if (this.a) {
            if (i10 == 2 && !UserConfig.getInstance(this.b).isPremium()) {
                W0(0, LocaleController.getString(R.string.QrPremiumGiftsToast), LocaleController.getString(R.string.QrPremiumSubscribe));
                g0();
                return;
            }
            if (i10 == 2 && (this.h1 != i10 || this.f1 < 0.5f)) {
                AnimationUtils.currentAnimationTimeMillis();
            }
            this.h1 = i10;
            this.i1 = i10;
            this.j1 = 0.0f;
            this.U8.forceFinished(true);
            if (this.f1 > 0.5f) {
                this.I5 = AnimationUtils.currentAnimationTimeMillis();
            }
            if (this.g1 < 0.5f) {
                this.I2 = AnimationUtils.currentAnimationTimeMillis();
            }
            this.g1 = 1.0f;
            j0();
            if (this.h1 == 2) {
                u0();
            }
            g0();
        }
    }

    public final void C(Canvas canvas, int i10, int i11, y0 y0Var, y0 y0Var2, float f7, boolean z10, boolean z11) {
        float f10;
        float f11;
        int i12;
        boolean z12;
        float f12;
        float f13;
        int i13;
        int i14;
        int i15;
        y0 y0Var3;
        Canvas canvas2;
        y0 y0Var4;
        b1 b1Var = this;
        Canvas canvas3 = canvas;
        y0 y0Var5 = y0Var;
        y0 y0Var6 = y0Var2;
        b1Var.V(y0Var5);
        b1Var.V(y0Var6);
        if (y0Var5 != null) {
            y0Var5.H.a(canvas3);
            y0Var5.I.a(canvas3);
        }
        d1 d1Var = y0Var6.H;
        d1 d1Var2 = y0Var6.I;
        d1Var.a(canvas3);
        d1Var2.a(canvas3);
        float dp = AndroidUtilities.dp(86.0f);
        float dp2 = AndroidUtilities.dp(70.0f);
        float dp3 = AndroidUtilities.dp(90.0f) * 1.3f;
        float f14 = b1Var.K + b1Var.N;
        float f15 = b1Var.L + b1Var.O;
        float f16 = -dp3;
        boolean z13 = true;
        int floor = ((int) Math.floor((f16 - f15) / dp2)) - 1;
        int ceil = ((int) Math.ceil(((i11 + dp3) - f15) / dp2)) + 1;
        AndroidUtilities.dp(24.0f);
        while (floor <= ceil) {
            int i16 = floor & 1;
            boolean z14 = z13;
            float f17 = i16 == 0 ? 0.0f : dp / 2.0f;
            int floor2 = ((int) Math.floor(((f16 - f14) - r9) / dp)) - 1;
            int i17 = i10;
            int ceil2 = ((int) Math.ceil((((i17 + dp3) - f14) - f17) / dp)) + 1;
            int i18 = floor2;
            while (i18 <= ceil2) {
                double q02 = q0(floor, i18);
                if (a0(53.1d * q02) < 0.2f) {
                    f10 = dp3;
                    f13 = f14;
                    i14 = floor;
                    i13 = ceil2;
                    i15 = i18;
                    y0Var4 = y0Var6;
                    z12 = z14;
                    f11 = f17;
                    canvas2 = canvas;
                    y0Var3 = y0Var;
                    f12 = f16;
                    i12 = ceil;
                } else {
                    f10 = dp3;
                    b1Var.C0(q02, 3.0f, 10.0f);
                    float f18 = f14;
                    float f19 = (float) (2.0d * q02 * 3.141592653589793d);
                    float f20 = f17;
                    f11 = f20;
                    float c10 = b1Var.t4 + r.c.c(i18, dp, f20, f18);
                    float sin = (floor * dp2) + f15 + b1Var.u4 + (((float) Math.sin((b1Var.r3 * 0.45f) + f19)) * AndroidUtilities.dp(3.0f));
                    boolean z15 = i16 == 0 ? z14 : false;
                    int i19 = i18;
                    float f21 = (float) q02;
                    float A = a6.A(f21, 0.16f, 0.92f, AndroidUtilities.dp(38.0f) * (z15 ? 1.3f : 0.9f));
                    int i20 = ceil;
                    int i21 = floor;
                    i12 = i20;
                    z12 = z14;
                    f12 = f16;
                    f13 = f18;
                    i13 = ceil2;
                    i14 = i21;
                    i15 = i19;
                    if (F0(c10, sin, A, i17, i11, 0, i21, i19, (Math.max(0.0f, (A / AndroidUtilities.dp(24.0f)) - 1.0f) * 0.8f) + 1.0f)) {
                        float f22 = z15 ? A * 0.9f : A;
                        float sin2 = (((float) Math.sin((this.r3 * 0.3f) + f19)) * 4.0f) + ((f21 - 0.5f) * 26.0f);
                        float a02 = a0(59.3d * q02) * 0.3f;
                        int i22 = (i15 - ((i14 - i16) / 2)) - i14;
                        int length = y0Var6.b.length;
                        int i23 = ((i22 % length) + length) % length;
                        float a03 = a0(71.9d * q02);
                        if (y0Var == null) {
                            float f23 = f19 * 2.0f;
                            float Y0 = Y0(z10, z11, f7 - a02);
                            canvas2 = canvas;
                            y0Var4 = y0Var6;
                            B(canvas2, y0Var4, i23, f22, sin2, f23, Y0, a03);
                        } else {
                            y0 y0Var7 = y0Var6;
                            y0Var3 = y0Var;
                            Drawable[] drawableArr = y0Var3.b;
                            int length2 = drawableArr.length;
                            int i24 = ((i22 % length2) + length2) % length2;
                            if (drawableArr[i24] == y0Var7.b[i23]) {
                                float f24 = f19 * 2.0f;
                                canvas2 = canvas;
                                B(canvas2, y0Var7, i23, f22, sin2, f24, 1.0f, a03);
                                y0Var4 = y0Var2;
                            } else {
                                float f25 = f19 * 2.0f;
                                float f26 = f7 - a02;
                                float Y02 = Y0(z12, false, f26);
                                canvas2 = canvas;
                                B(canvas2, y0Var3, i24, f22, sin2, f25, Y02, a03);
                                y0Var3 = y0Var;
                                y0Var4 = y0Var2;
                                B(canvas2, y0Var4, i23, f22, sin2, f25, Y0(false, false, f26), a03);
                            }
                        }
                    } else {
                        canvas2 = canvas;
                        y0Var4 = y0Var6;
                    }
                    y0Var3 = y0Var;
                }
                i18 = i15 + 1;
                b1Var = this;
                i17 = i10;
                canvas3 = canvas2;
                floor = i14;
                f16 = f12;
                ceil = i12;
                dp3 = f10;
                f17 = f11;
                ceil2 = i13;
                z14 = z12;
                y0Var5 = y0Var3;
                y0Var6 = y0Var4;
                f14 = f13;
            }
            floor++;
            b1Var = this;
            z13 = z14;
            y0Var5 = y0Var5;
            dp3 = dp3;
            y0Var6 = y0Var6;
            f14 = f14;
        }
        Canvas canvas4 = canvas3;
        y0 y0Var8 = y0Var6;
        y0 y0Var9 = y0Var5;
        if (y0Var9 != null) {
            y0Var9.H.b(canvas4);
            y0Var9.I.b(canvas4);
        }
        y0Var8.H.b(canvas4);
        d1Var2.b(canvas4);
    }

    public final void C0(double d, float f7, float f10) {
        float a02 = ((a0(31.7d * d) * (f10 - f7)) + f7) * AndroidUtilities.dp(1.0f);
        double a03 = (d * 6.283d) + (((((a0(43.3d * d) < 0.5f ? -1.0d : 1.0d) * 2.0d) * 3.141592653589793d) * this.r3) / ((a0(37.1d * d) * 11.0f) + 9.0f));
        this.t4 = ((float) Math.cos(a03)) * a02;
        this.u4 = a02 * ((float) Math.sin(a03));
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x089f  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0a99  */
    /* JADX WARN: Removed duplicated region for block: B:240:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x04d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(Canvas canvas, int i10, int i11, y0 y0Var, boolean z10, boolean z11, float f7) {
        long[] jArr;
        float[] fArr;
        float f10;
        float[] fArr2;
        float[] fArr3;
        float[] fArr4;
        float[] fArr5;
        float f11;
        float f12;
        float f13;
        d1 d1Var;
        d1 d1Var2;
        float f14;
        Canvas canvas2;
        Bitmap bitmap;
        long[] jArr2;
        y0 y0Var2;
        b1 b1Var;
        float f15;
        Canvas canvas3;
        int i12;
        float f16;
        d1 d1Var3;
        float f17;
        float f18;
        int i13;
        int i14;
        int i15;
        Paint paint;
        Paint paint2;
        float f19;
        boolean[] zArr;
        long[] jArr3;
        float[] fArr6;
        long[] jArr4;
        float f20;
        Paint paint3;
        Bitmap bitmap2;
        Paint paint4;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        if (y0Var == null) {
            return;
        }
        d1 d1Var4 = y0Var.K;
        d1 d1Var5 = y0Var.J;
        Paint paint5 = y0Var.r;
        Paint paint6 = y0Var.i;
        int i21 = y0Var.a;
        if (i21 == 0) {
            return;
        }
        float f21 = this.a3;
        if (i21 == 1) {
            C(canvas, i10, i11, null, y0Var, f7, z10, z11);
            return;
        }
        int i22 = i10;
        y0 y0Var3 = y0Var;
        float f22 = this.N + this.K;
        float f23 = this.L + this.O;
        float dp = AndroidUtilities.dp(90.0f) * 1.3f;
        float dp2 = AndroidUtilities.dp(170.0f);
        float dp3 = AndroidUtilities.dp(150.0f);
        this.s4 = 0;
        float f24 = -(AndroidUtilities.dp(60.0f) + dp);
        int floor = ((int) Math.floor((f24 - f23) / dp3)) - 1;
        int ceil = ((int) Math.ceil(((i11 + r8) - f23) / dp3)) + 1;
        while (true) {
            jArr = this.r4;
            float f25 = f24;
            fArr = this.o4;
            f10 = 64.0f;
            fArr2 = this.n4;
            fArr3 = this.m4;
            fArr4 = this.p4;
            fArr5 = this.q4;
            f11 = 0.5f;
            f12 = 2.0f;
            if (floor > ceil || this.s4 >= 96) {
                break;
            }
            float f26 = (floor & 1) == 0 ? 0.0f : dp2 / 2.0f;
            float f27 = dp;
            int floor2 = ((int) Math.floor(((f25 - f22) - f26) / dp2)) - 1;
            int ceil2 = ((int) Math.ceil((((i22 + r8) - f22) - f26) / dp2)) + 1;
            int i23 = floor2;
            while (i23 <= ceil2) {
                int i24 = ceil2;
                if (this.s4 < 96) {
                    int i25 = ceil;
                    long[] jArr5 = jArr;
                    double q02 = q0(floor, i23);
                    C0(q02, 5.0f, 12.0f);
                    float f28 = f22;
                    fArr3[this.s4] = (AndroidUtilities.dp(76.0f) * (a0(3.7d * q02) - 0.5f)) + r.c.c(i23, dp2, f26, f22) + this.t4;
                    fArr2[this.s4] = ((a0(5.3d * q02) - 0.5f) * AndroidUtilities.dp(64.0f)) + (floor * dp3) + f23 + this.u4;
                    fArr[this.s4] = (a0(11.9d * q02) * AndroidUtilities.dp(32.0f)) + AndroidUtilities.dp(62.0f);
                    fArr4[this.s4] = (a0(17.3d * q02) - 0.5f) * 22.0f;
                    int i26 = this.s4;
                    fArr5[i26] = (float) q02;
                    jArr5[i26] = (i23 & 4294967295L) ^ (floor << 32);
                    this.s4 = i26 + 1;
                    i23++;
                    floor = floor;
                    ceil2 = i24;
                    jArr = jArr5;
                    ceil = i25;
                    f22 = f28;
                }
            }
            floor++;
            i22 = i10;
            f24 = f25;
            dp = f27;
            ceil = ceil;
            f22 = f22;
        }
        float f29 = f22;
        float f30 = dp;
        long[] jArr6 = jArr;
        V(y0Var3);
        X(y0Var3);
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Bitmap bitmap3 = y0Var3.e;
        Bitmap bitmap4 = bitmap3 != null ? bitmap3 : y0Var3.f;
        float f31 = 1.0f;
        float clamp01 = (bitmap3 == null || y0Var3.f == null) ? 1.0f : Utilities.clamp01((currentAnimationTimeMillis - y0Var3.g) / 150.0f);
        float[] fArr7 = e1.b;
        char c10 = '\b';
        if (bitmap4 != null) {
            float width = bitmap4.getWidth() / 2.0f;
            AndroidUtilities.dp(44.0f);
            AndroidUtilities.dp(38.0f);
            boolean z12 = g0.a.g() && clamp01 >= 1.0f && canvas.isHardwareAccelerated();
            if (z12) {
                if (y0Var3.m != bitmap4 || y0Var3.n == null || y0Var3.o == null) {
                    y0Var3.m = bitmap4;
                    y0Var3.n = g0.a.a(bitmap4);
                    y0Var3.o = g0.a.a(bitmap4);
                }
                y0Var3.n.setColorFilter(paint6.getColorFilter());
                y0Var3.o.setColorFilter(t0(y0Var3));
                this.B4 = bitmap4.getWidth();
                this.C4 = bitmap4.getHeight();
                this.z4 = 0;
                this.A4 = 0;
            }
            AndroidUtilities.dp(17.0f);
            d1Var = d1Var4;
            f14 = 0.05f;
            float f32 = width;
            d1Var2 = d1Var5;
            float f33 = 0.55f;
            r(y0Var3.k, f29, i10, f23, i11, f30);
            int i27 = 0;
            while (i27 < this.K3) {
                int i28 = this.E3[i27];
                int i29 = this.F3[i27];
                double q03 = q0(i28, i29);
                float f34 = this.G3[i27];
                float f35 = f31;
                float f36 = this.H3[i27];
                float f37 = this.I3[i27];
                float f38 = f33;
                float f39 = this.J3[i27];
                int i30 = i27;
                C0(q03, f12, 7.0f);
                float f40 = this.t4 + f34 + f29;
                float f41 = this.u4 + f36 + f23;
                float a02 = a0(7.31d * q03);
                float dp4 = ((0.75f * f39 * f39) + f38) * AndroidUtilities.dp(21.0f) * 1.1f * f37;
                y0 y0Var4 = y0Var3;
                Paint paint7 = paint6;
                float f42 = f32;
                Bitmap bitmap5 = bitmap4;
                long[] jArr7 = jArr6;
                Paint paint8 = paint5;
                if (F0(f40, f41, dp4, i10, i11, 1, i28, i29, (Math.max(0.0f, (dp4 / AndroidUtilities.dp(15.0f)) - f35) * 0.8f) + f35)) {
                    float Y0 = Y0(z10, z11, f7 - ((y0Var4.h || (z10 && this.F.h)) ? q1(this.o3, this.p3, i10, i11) : a0(q03 * 53.1d) * 0.3f));
                    if (Y0 > 0.01f) {
                        float G0 = G0(1.0f);
                        float f43 = this.p0;
                        f19 = f21;
                        long j10 = (i29 & 4294967295L) ^ (i28 << 32);
                        int i31 = ((int) (((-7046029254386353131L) * j10) >>> 53)) & 2047;
                        int i32 = 0;
                        while (true) {
                            zArr = this.e4;
                            jArr3 = this.Y3;
                            if (i32 >= 2048 || !zArr[i31] || jArr3[i31] == j10) {
                                break;
                            }
                            i32++;
                            i31 = (i31 + 1) & 2047;
                        }
                        long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                        boolean z13 = zArr[i31];
                        float[] fArr8 = this.b4;
                        float[] fArr9 = this.Z3;
                        long[] jArr8 = this.d4;
                        float[] fArr10 = this.c4;
                        float[] fArr11 = this.a4;
                        if (z13 && jArr3[i31] == j10) {
                            fArr6 = fArr11;
                            jArr4 = jArr3;
                            if (currentAnimationTimeMillis2 - jArr8[i31] <= 1000) {
                                float exp = 1.0f - ((float) Math.exp((-Math.min(f10, r1)) / Math.max(10.0f, (((Math.abs(G0) > Math.abs(fArr6[i31]) || f43 > fArr10[i31]) ? fArr7[48] : fArr7[49]) / 3.4f) / 2.0f)));
                                float f44 = fArr9[i31];
                                float x10 = a6.x(G0, f44, exp, f44);
                                fArr9[i31] = x10;
                                float f45 = fArr6[i31];
                                fArr6[i31] = a6.x(x10, f45, exp, f45);
                                float f46 = fArr8[i31];
                                float x11 = a6.x(f43, f46, exp, f46);
                                fArr8[i31] = x11;
                                float f47 = fArr10[i31];
                                fArr10[i31] = a6.x(x11, f47, exp, f47);
                                jArr8[i31] = currentAnimationTimeMillis2;
                                f20 = fArr6[i31];
                                float f48 = fArr10[i31];
                                if (Math.abs(f20) <= 0.05f || f48 > 0.002f) {
                                    invalidate();
                                }
                                float f49 = (this.m3 * f20) + this.o3;
                                float f50 = (this.n3 * f20) + this.p3;
                                float f51 = this.p0;
                                float f52 = a0(61.37d * q03) * 100.0f >= fArr7[17] ? fArr7[18] / 100.0f : 1.0f;
                                float pow = (float) Math.pow((Math.sin((q03 * 6.283d) + a6.A(a02, f38, 0.35f, f19)) * 0.5d) + 0.5d, 2.0d);
                                float A = (((((fArr7[43] / 100.0f) * f48) + 1.0f) * a6.A(pow, 0.1f, (0.06f * f51) + 1.0f, (this.o0 + 1.0f) * (this.l0 * Y0))) * dp4) / bitmap5.getWidth();
                                float f53 = fArr7[44] * f48;
                                if (z12) {
                                    canvas.save();
                                    canvas.translate(f49, f50);
                                    canvas.rotate(((a02 - 0.5f) * 70.0f) + this.n0 + f53);
                                    canvas.scale(A, A);
                                    int i33 = (int) (((pow * 0.15f) + 0.85f) * this.m0 * 255.0f * f52);
                                    if (clamp01 < 1.0f) {
                                        paint3 = paint7;
                                        paint3.setAlpha((int) ((1.0f - clamp01) * i33));
                                        f32 = f42;
                                        float f54 = -f32;
                                        canvas.drawBitmap(y0Var4.f, f54, f54, paint3);
                                    } else {
                                        f32 = f42;
                                        paint3 = paint7;
                                    }
                                    paint3.setAlpha((int) (i33 * clamp01));
                                    float f55 = -f32;
                                    bitmap2 = bitmap5;
                                    canvas.drawBitmap(bitmap2, f55, f55, paint3);
                                    if (f51 > 0.01f) {
                                        ColorFilter colorFilter = paint8.getColorFilter();
                                        paint4 = paint8;
                                        paint4.setColorFilter(t0(y0Var4));
                                        paint4.setAlpha((int) (Math.min(1.0f, (fArr7[13] * f51) / 100.0f) * 255.0f * this.m0 * clamp01));
                                        canvas.drawBitmap(bitmap2, f55, f55, paint4);
                                        paint4.setColorFilter(colorFilter);
                                        float f56 = fArr7[35];
                                        Paint paint9 = this.f4;
                                        if (f56 > 0.5f && W(bitmap2)) {
                                            paint9.setColorFilter(w0(y0Var4));
                                            paint9.setAlpha((int) (Math.min(255.0f, ((f51 * 255.0f) * fArr7[37]) / 100.0f) * this.m0 * clamp01));
                                            canvas.drawBitmap(this.x3, f55, f55, paint9);
                                        }
                                        float f57 = (this.T3 * fArr7[22]) / 100.0f;
                                        if (f57 > 0.01f) {
                                            paint9.setColorFilter(w0(y0Var4));
                                            paint9.setAlpha((int) (Math.min(1.0f, f57) * 255.0f * this.m0 * clamp01));
                                            canvas.drawBitmap(bitmap2, f55, f55, paint9);
                                        }
                                    } else {
                                        paint4 = paint8;
                                    }
                                    canvas.restore();
                                } else {
                                    float f58 = f52;
                                    float radians = (float) Math.toRadians(((a02 - 0.5f) * 70.0f) + this.n0 + f53);
                                    int i34 = this.z4;
                                    float f59 = f42 * A;
                                    int i35 = (int) (((pow * 0.15f) + 0.85f) * this.m0 * 255.0f * f58);
                                    float[] fArr12 = this.w4;
                                    float[] fArr13 = this.v4;
                                    if (i34 >= 2048 || i35 <= 0) {
                                        i16 = i34;
                                        i17 = 8;
                                        i18 = 16777215;
                                    } else {
                                        i16 = i34;
                                        i18 = 16777215;
                                        double d = radians;
                                        float cos = ((float) Math.cos(d)) * f59;
                                        float sin = ((float) Math.sin(d)) * f59;
                                        i17 = 8;
                                        int i36 = this.z4 * 8;
                                        float f60 = f49 - cos;
                                        fArr13[i36] = f60 + sin;
                                        int i37 = i36 + 1;
                                        float f61 = f50 - sin;
                                        fArr13[i37] = f61 - cos;
                                        int i38 = i36 + 2;
                                        float f62 = f49 + cos;
                                        fArr13[i38] = f62 + sin;
                                        int i39 = i36 + 3;
                                        float f63 = f50 + sin;
                                        fArr13[i39] = f63 - cos;
                                        int i40 = i36 + 4;
                                        fArr13[i40] = f62 - sin;
                                        int i41 = i36 + 5;
                                        fArr13[i41] = f63 + cos;
                                        int i42 = i36 + 6;
                                        fArr13[i42] = f60 - sin;
                                        int i43 = i36 + 7;
                                        fArr13[i43] = f61 + cos;
                                        fArr12[i36] = 0.0f;
                                        fArr12[i37] = 0.0f;
                                        float f64 = this.B4;
                                        fArr12[i38] = f64;
                                        fArr12[i39] = 0.0f;
                                        fArr12[i40] = f64;
                                        float f65 = this.C4;
                                        fArr12[i41] = f65;
                                        fArr12[i42] = 0.0f;
                                        fArr12[i43] = f65;
                                        int min = (Math.min(255, i35) << 24) | 16777215;
                                        int i44 = this.z4;
                                        int i45 = i44 * 4;
                                        int[] iArr = this.x4;
                                        iArr[i45] = min;
                                        iArr[i45 + 1] = min;
                                        iArr[i45 + 2] = min;
                                        iArr[i45 + 3] = min;
                                        this.z4 = i44 + 1;
                                    }
                                    if (f51 > 0.01f && this.z4 > i16 && (i19 = this.A4) < 512) {
                                        int i46 = i16 * 8;
                                        System.arraycopy(fArr13, i46, this.D4, i19 * 8, i17);
                                        System.arraycopy(fArr12, i46, this.E4, this.A4 * i17, i17);
                                        int min2 = (Math.min(255, (int) ((Math.min(1.0f, (fArr7[13] * f51) / 100.0f) * 255.0f) * this.m0)) << 24) | i18;
                                        int i47 = this.A4;
                                        int i48 = i47 * 4;
                                        int[] iArr2 = this.F4;
                                        iArr2[i48] = min2;
                                        iArr2[i48 + 1] = min2;
                                        iArr2[i48 + 2] = min2;
                                        iArr2[i48 + 3] = min2;
                                        this.A4 = i47 + 1;
                                        float f66 = (this.T3 * fArr7[22]) / 100.0f;
                                        if (f66 > 0.01f && (i20 = this.l4) < 512) {
                                            System.arraycopy(fArr13, i46, this.i4, i20 * 8, i17);
                                            System.arraycopy(fArr12, i46, this.j4, this.l4 * i17, i17);
                                            int min3 = (Math.min(255, (int) ((f66 * 255.0f) * this.m0)) << 24) | i18;
                                            int i49 = this.l4;
                                            int i50 = i49 * 4;
                                            int[] iArr3 = this.k4;
                                            iArr3[i50] = min3;
                                            iArr3[i50 + 1] = min3;
                                            iArr3[i50 + 2] = min3;
                                            iArr3[i50 + 3] = min3;
                                            this.l4 = i49 + 1;
                                        }
                                    }
                                    paint4 = paint8;
                                    bitmap2 = bitmap5;
                                    f32 = f42;
                                    paint3 = paint7;
                                }
                                i27 = i30 + 1;
                                bitmap4 = bitmap2;
                                f21 = f19;
                                paint5 = paint4;
                                y0Var3 = y0Var4;
                                jArr6 = jArr7;
                                f31 = 1.0f;
                                f33 = 0.55f;
                                f10 = 64.0f;
                                f12 = 2.0f;
                                paint6 = paint3;
                            }
                        } else {
                            fArr6 = fArr11;
                            jArr4 = jArr3;
                        }
                        zArr[i31] = true;
                        jArr4[i31] = j10;
                        fArr6[i31] = G0;
                        fArr9[i31] = G0;
                        fArr10[i31] = f43;
                        fArr8[i31] = f43;
                        jArr8[i31] = currentAnimationTimeMillis2;
                        f20 = fArr6[i31];
                        float f482 = fArr10[i31];
                        if (Math.abs(f20) <= 0.05f) {
                        }
                        invalidate();
                        float f492 = (this.m3 * f20) + this.o3;
                        float f502 = (this.n3 * f20) + this.p3;
                        float f512 = this.p0;
                        if (a0(61.37d * q03) * 100.0f >= fArr7[17]) {
                        }
                        float pow2 = (float) Math.pow((Math.sin((q03 * 6.283d) + a6.A(a02, f38, 0.35f, f19)) * 0.5d) + 0.5d, 2.0d);
                        float A2 = (((((fArr7[43] / 100.0f) * f482) + 1.0f) * a6.A(pow2, 0.1f, (0.06f * f512) + 1.0f, (this.o0 + 1.0f) * (this.l0 * Y0))) * dp4) / bitmap5.getWidth();
                        float f532 = fArr7[44] * f482;
                        if (z12) {
                        }
                        i27 = i30 + 1;
                        bitmap4 = bitmap2;
                        f21 = f19;
                        paint5 = paint4;
                        y0Var3 = y0Var4;
                        jArr6 = jArr7;
                        f31 = 1.0f;
                        f33 = 0.55f;
                        f10 = 64.0f;
                        f12 = 2.0f;
                        paint6 = paint3;
                    }
                }
                f19 = f21;
                paint4 = paint8;
                bitmap2 = bitmap5;
                f32 = f42;
                paint3 = paint7;
                i27 = i30 + 1;
                bitmap4 = bitmap2;
                f21 = f19;
                paint5 = paint4;
                y0Var3 = y0Var4;
                jArr6 = jArr7;
                f31 = 1.0f;
                f33 = 0.55f;
                f10 = 64.0f;
                f12 = 2.0f;
                paint6 = paint3;
            }
            f13 = 255.0f;
            c10 = '\b';
            canvas2 = canvas;
            y0Var2 = y0Var3;
            bitmap = bitmap4;
            jArr2 = jArr6;
        } else {
            f13 = 255.0f;
            d1Var = d1Var4;
            d1Var2 = d1Var5;
            f14 = 0.05f;
            canvas2 = canvas;
            bitmap = bitmap4;
            jArr2 = jArr6;
            y0Var2 = y0Var3;
        }
        if (bitmap == null || (i15 = this.z4) <= 0 || (paint = y0Var2.n) == null) {
            b1Var = this;
            f15 = f13;
            canvas3 = canvas2;
            i12 = 0;
            f16 = 0.35f;
        } else {
            Canvas.VertexMode vertexMode = Canvas.VertexMode.TRIANGLES;
            Bitmap bitmap6 = bitmap;
            f15 = f13;
            b1Var = this;
            f16 = 0.35f;
            canvas.drawVertices(vertexMode, i15 * 8, this.v4, 0, this.w4, 0, this.x4, 0, this.y4, 0, i15 * 6, paint);
            b1Var.z4 = 0;
            int i51 = b1Var.A4;
            if (i51 > 0 && (paint2 = y0Var2.o) != null) {
                canvas.drawVertices(vertexMode, i51 * 8, b1Var.D4, 0, b1Var.E4, 0, b1Var.F4, 0, b1Var.y4, 0, i51 * 6, paint2);
            }
            if (b1Var.A4 > 0 && fArr7[35] > 0.5f && b1Var.W(bitmap6)) {
                b1Var.z3.setColorFilter(b1Var.w0(y0Var2));
                b1Var.z3.setAlpha(Math.min(255, (int) ((fArr7[37] * f15) / 100.0f)));
                int i52 = b1Var.A4;
                canvas.drawVertices(vertexMode, i52 * 8, b1Var.D4, 0, b1Var.E4, 0, b1Var.F4, 0, b1Var.y4, 0, i52 * 6, b1Var.z3);
                if (fArr7[37] > 100.0f) {
                    int i53 = b1Var.A4;
                    canvas.drawVertices(vertexMode, i53 * 8, b1Var.D4, 0, b1Var.E4, 0, b1Var.F4, 0, b1Var.y4, 0, i53 * 6, b1Var.z3);
                }
            }
            if (b1Var.l4 > 0) {
                if (b1Var.g4 == null || b1Var.h4 != bitmap6) {
                    b1Var.h4 = bitmap6;
                    b1Var.g4 = g0.a.a(bitmap6);
                }
                b1Var.g4.setColorFilter(b1Var.w0(y0Var2));
                int i54 = b1Var.l4;
                canvas.drawVertices(vertexMode, i54 * 8, b1Var.i4, 0, b1Var.j4, 0, b1Var.k4, 0, b1Var.y4, 0, i54 * 6, b1Var.g4);
                canvas3 = canvas;
            } else {
                canvas3 = canvas;
            }
            i12 = 0;
            b1Var.l4 = 0;
            b1Var.A4 = 0;
        }
        if (y0Var2.d == null) {
            return;
        }
        AndroidUtilities.dp(41.0f);
        a0 a0Var = y0Var2.A;
        float f67 = 3.0f;
        d1 d1Var6 = d1Var2;
        if (a0Var != null) {
            d1Var6.a(canvas3);
            d1Var3 = d1Var;
            d1Var3.a(canvas3);
            if (a0Var.e > 1 && !b1Var.T2) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - y0Var2.C;
                float f68 = ((a0Var.f * elapsedRealtime) / 1000.0f) + y0Var2.B;
                if (y0Var2.D) {
                    f18 = f68;
                    f17 = 1.0f;
                } else {
                    float clamp012 = Utilities.clamp01(elapsedRealtime / 6000.0f);
                    float B = a6.B(clamp012, 2.0f, 3.0f, clamp012 * clamp012);
                    if (clamp012 >= 1.0f) {
                        y0Var2.D = true;
                    }
                    f17 = B;
                    f18 = f68;
                }
                i13 = i12;
                while (i13 < b1Var.s4) {
                    float f69 = fArr[i13];
                    float sin2 = (((float) Math.sin((fArr5[i13] * 2.0f * 3.141592653589793d) + (b1Var.r3 * f16))) * AndroidUtilities.dp(f67)) + fArr2[i13];
                    d1 d1Var7 = d1Var3;
                    float f70 = fArr3[i13];
                    long j11 = jArr2[i13];
                    d1 d1Var8 = d1Var6;
                    int i55 = i13;
                    b1 b1Var2 = b1Var;
                    if (b1Var2.F0(f70, sin2, f69, i10, i11, 2, (int) (j11 >> 32), (int) j11, (Math.max(0.0f, (f69 / AndroidUtilities.dp(40.0f)) - 1.0f) * 0.8f) + 1.0f)) {
                        float Y02 = Y0(z10, z11, f7 - ((y0Var2.h || (z10 && b1Var2.F.h)) ? b1Var2.q1(b1Var2.o3, b1Var2.p3, i10, i11) : a0(fArr5[i55] * 53.1d) * 0.3f));
                        if (Y02 > 0.01f) {
                            float A3 = a6.A((float) Math.sin((fArr5[i55] * 12.6f) + (b1Var2.r3 * 1.3f)), 0.03f, 1.0f, a6.A(b1Var2.p0, f14, 1.0f, (b1Var2.o0 + 1.0f) * Y02 * b1Var2.l0));
                            int round = Math.round(f69 / 2.0f);
                            float G02 = b1Var2.G0(f11);
                            if (a0Var != null) {
                                int i56 = a0Var.b;
                                int i57 = a0Var.e;
                                if (i57 <= 1 || b1Var2.T2) {
                                    i14 = 0;
                                } else {
                                    float f71 = i57;
                                    float a03 = a0(fArr5[i55] * 71.9d) * f71;
                                    if (a03 > f71 / 2.0f) {
                                        a03 -= f71;
                                    }
                                    i14 = ((int) Math.floor((a03 * f17) + f18)) % i57;
                                    if (i14 < 0) {
                                        i14 += i57;
                                    }
                                }
                                int i58 = a0Var.d;
                                int i59 = a0Var.c;
                                float f72 = ((i14 % i58) * i59) + 2;
                                float C = a1.g.C(i14, i58, i59, 2);
                                float f73 = round * 2.0f * A3;
                                float f74 = fArr4[i55] + b1Var2.n0;
                                float f75 = (b1Var2.m3 * G02) + b1Var2.o3;
                                float f76 = (b1Var2.n3 * G02) + b1Var2.p3;
                                y0Var2.J.c(f75, f76, f73, f74, f72, C, i56, b1Var2.m0);
                                if (b1Var2.p0 > 0.02f) {
                                    y0Var2.K.c(f75, f76, f73, f74, f72, C, i56, ((Math.min(8, Math.round(((r1 * 8.0f) * 0.45f) / 0.55f)) * 0.55f) / 8.0f) * b1Var2.m0);
                                }
                                canvas3 = canvas;
                                i13 = i55 + 1;
                                d1Var3 = d1Var7;
                                f67 = 3.0f;
                                f11 = 0.5f;
                                f14 = 0.05f;
                                b1Var = b1Var2;
                                d1Var6 = d1Var8;
                            } else {
                                canvas.save();
                                canvas3 = canvas;
                                canvas3.translate((b1Var2.m3 * G02) + b1Var2.o3, (b1Var2.n3 * G02) + b1Var2.p3);
                                canvas3.rotate(fArr4[i55] + b1Var2.n0);
                                canvas3.scale(A3, A3);
                                int i60 = -round;
                                y0Var2.d.setBounds(i60, i60, round, round);
                                y0Var2.d.setAlpha((int) (b1Var2.m0 * f15));
                                float f77 = b1Var2.p0;
                                if (f77 > 0.02f) {
                                    y0Var2.d.setColorFilter(u9[Math.min(8, Math.round(((f77 * 8.0f) * 0.45f) / 0.55f))]);
                                }
                                y0Var2.d.draw(canvas3);
                                if (f77 > 0.02f) {
                                    y0Var2.d.setColorFilter(null);
                                }
                                canvas3.restore();
                                i13 = i55 + 1;
                                d1Var3 = d1Var7;
                                f67 = 3.0f;
                                f11 = 0.5f;
                                f14 = 0.05f;
                                b1Var = b1Var2;
                                d1Var6 = d1Var8;
                            }
                        }
                    }
                    i13 = i55 + 1;
                    d1Var3 = d1Var7;
                    f67 = 3.0f;
                    f11 = 0.5f;
                    f14 = 0.05f;
                    b1Var = b1Var2;
                    d1Var6 = d1Var8;
                }
                d1 d1Var9 = d1Var6;
                d1 d1Var10 = d1Var3;
                if (a0Var == null) {
                    d1Var9.b(canvas3);
                    d1Var10.b(canvas3);
                    return;
                }
                return;
            }
        } else {
            d1Var3 = d1Var;
        }
        f17 = 1.0f;
        f18 = 0.0f;
        i13 = i12;
        while (i13 < b1Var.s4) {
        }
        d1 d1Var92 = d1Var6;
        d1 d1Var102 = d1Var3;
        if (a0Var == null) {
        }
    }

    public final float D0() {
        return (T0() - U0()) + AndroidUtilities.dp(8.0f);
    }

    public final void E(Canvas canvas, RectF rectF, int i10) {
        float centerY = rectF.centerY();
        float dp = AndroidUtilities.dp(12.0f);
        p6 p6Var = this.L0;
        float c10 = p6Var.c() + AndroidUtilities.dp(2.0f) + dp;
        float dp2 = rectF.left + AndroidUtilities.dp(8.0f);
        N(canvas, dp2, centerY, dp, i10, true);
        p6Var.u(i10);
        p6Var.setBounds((int) (dp2 + dp + AndroidUtilities.dp(2.0f)), (int) (centerY - AndroidUtilities.dp(8.0f)), (int) (dp2 + c10 + AndroidUtilities.dp(40.0f)), (int) (centerY + AndroidUtilities.dp(8.0f)));
        p6Var.draw(canvas);
    }

    public final void E0(float f7, float f10, int i10) {
        TLRPC.Document document;
        TLRPC.Document document2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.v1.get(i10);
        z0 z0Var = new z0();
        z0Var.a = 2;
        z0Var.f = i10;
        y0 y0Var = new y0();
        y0Var.a = 2;
        y0Var.j = i10;
        long j10 = tL_starGiftUnique.id;
        y0Var.k = (int) (j10 ^ (j10 >>> 32));
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
                y0Var.y = document2;
                y0Var.c = r5.m(i12, 9, document2);
            } else if ((starGiftAttribute2 instanceof TL_stars.starGiftAttributeModel) && (document = ((TL_stars.starGiftAttributeModel) starGiftAttribute2).document) != null) {
                y0Var.x = document;
                y0Var.d = r5.m(i12, 24, document);
            }
        }
        int[] iArr = this.h2;
        c0(i10, iArr);
        z0Var.b = w(iArr[0], false);
        int w9 = w(iArr[1], true);
        z0Var.c = w9;
        z0Var.d = iArr[2];
        z0Var.e = u(z0Var.b, w9);
        k(z0Var);
        int e12 = e1(z0Var.d, z0Var.b);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        y0Var.i.setColorFilter(new PorterDuffColorFilter(e12, mode));
        double[] dArr = {r16, 0.0d, 0.0d};
        i0.b.j(e1(z0Var.d, z0Var.b) | (-16777216), dArr);
        double min = Math.min(97.0d, dArr[0] + 20.0d);
        float[] fArr = new float[3];
        Color.colorToHSV(i0.b.b(min, dArr[1], dArr[2]), fArr);
        fArr[1] = Math.min(1.0f, fArr[1] * 1.15f);
        y0Var.l = Color.HSVToColor(fArr) | (-16777216);
        y0Var.r.setColorFilter(new PorterDuffColorFilter(y0Var.l, mode));
        y0Var.p = -1;
        y0Var.z = tL_starGiftUnique;
        r5 r5Var = y0Var.c;
        if (r5Var != null) {
            r5Var.a(this);
        }
        r5 r5Var2 = y0Var.d;
        if (r5Var2 != null) {
            r5Var2.a(this);
        }
        this.I.clear();
        R0(z0Var, f7, f10);
        if (!this.f2) {
            this.p2 = i(0.03f, 0.005f, this.n2);
            this.n2 = AnimationUtils.currentAnimationTimeMillis();
        }
        setPattern(y0Var);
    }

    public final void F(Canvas canvas, RectF rectF, float f7) {
        z0 z0Var = this.n;
        int f10 = z0Var != null ? i0.b.f(0.5f, z0Var.b, z0Var.c) : -12947803;
        Paint paint = this.B1;
        paint.setColor(f10 | (-16777216));
        paint.setAlpha((int) (Utilities.clamp01(f7) * 224.4f));
        canvas.drawRect(rectF, paint);
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
    public final boolean F0(float f7, float f10, float f11, int i10, int i11, int i12, int i13, int i14, float f12) {
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
        float Z0;
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
        x0 x0Var = this.q3;
        int i18 = x0Var.m;
        float[] fArr = x0Var.j;
        float[] fArr2 = x0Var.i;
        float[] fArr3 = x0Var.h;
        float[] fArr4 = x0Var.g;
        float[] fArr5 = x0Var.f;
        float[] fArr6 = x0Var.e;
        float[] fArr7 = x0Var.d;
        float[] fArr8 = x0Var.c;
        long[] jArr = x0Var.a;
        boolean[] zArr = x0Var.b;
        int[] iArr = x0Var.k;
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
            if (sqrt <= r1(this.s) * hypot) {
                if (i16 < 0) {
                    if (x0Var.m >= 3072) {
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
                                int[] iArr2 = x0Var.l;
                                f26 = f34;
                                int i21 = x0Var.m;
                                x0Var.m = i21 + 1;
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
                    fArr6[i17] = a6.t(f37, AndroidUtilities.dp(360.0f), f36, fArr6[i17]);
                    fArr5[i17] = a6.t(f38, AndroidUtilities.dp(360.0f), f36, fArr5[i17]);
                    fArr3[i17] = a6.t(f37 >= f15 ? 1.0f : -1.0f, 180.0f, f36, fArr3[i17]);
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
                float Z02 = f21 - (Z0(0.55f, f21, min) * 0.22f);
                float Z03 = f21 - (Z0(0.8f, f21, min) * 0.2f);
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
                            Z0 = Z0(0.08f, 0.25f, f23) * Z03;
                            this.m0 = Z0;
                            if (Z0 <= 0.004f) {
                                return false;
                            }
                            if (f11 * Z02 < AndroidUtilities.dp(10.0f)) {
                                Z02 = AndroidUtilities.dp(10.0f) / Math.max(1.0f, f11);
                            }
                            float f41 = f23 * Z02;
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
                            this.o3 = f16;
                            this.p3 = f17;
                            this.p0 = V0(f16, f17, i10, i11);
                            this.T3 = this.S3;
                            this.W3 = this.U3;
                            this.X3 = this.V3;
                            return true;
                        }
                        float exp3 = (float) Math.exp((f17 / dp) - 1.0f);
                        f25 = dp * exp3;
                        f23 = Math.min(f23, exp3);
                        f17 = f25;
                        Z0 = Z0(0.08f, 0.25f, f23) * Z03;
                        this.m0 = Z0;
                        if (Z0 <= 0.004f) {
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
                Z0 = Z0(0.08f, 0.25f, f23) * Z03;
                this.m0 = Z0;
                if (Z0 <= 0.004f) {
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
        float Z022 = f21 - (Z0(0.55f, f21, min2) * 0.22f);
        float Z032 = f21 - (Z0(0.8f, f21, min2) * 0.2f);
        if (f16 < dp) {
        }
        if (f14 - f16 >= dp) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0170, code lost:
    
        if (r4.e != r3) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(Canvas canvas, int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique, float f7, float f10, float f11, float f12) {
        float D;
        int size;
        int i11;
        TLRPC.Document document;
        RadialGradient radialGradient;
        float f13;
        p5 p5Var;
        float f14;
        TLRPC.Document document2;
        long currentAnimationTimeMillis;
        int i12;
        float f15;
        float f16;
        float f17;
        Bitmap bitmap;
        Canvas canvas2 = canvas;
        long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
        int i13 = this.z7;
        if (i10 == i13) {
            if (this.C7 < this.B7) {
                float clamp01 = 1.0f - Utilities.clamp01((currentAnimationTimeMillis2 - r14) / 120.0f);
                D = 1.0f - ((1.0f - (clamp01 * clamp01)) * 0.06f);
                if (D != 1.0f) {
                    canvas2.save();
                    canvas2.scale(D, D, (f11 / 2.0f) + f7, (f12 / 2.0f) + f10);
                }
                int[] iArr = this.h2;
                c0(i10, iArr);
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
                RectF rectF = this.H1;
                rectF.set(f7, f10, f7 + f11, f10 + f12);
                Paint paint = this.B1;
                paint.setColor(-1);
                long j10 = tL_starGiftUnique.id;
                LongSparseArray longSparseArray = this.w5;
                radialGradient = (RadialGradient) longSparseArray.get(j10);
                if (radialGradient == null) {
                    radialGradient = new RadialGradient(0.0f, 0.0f, 1.0f, new int[]{i14, i15}, (float[]) null, Shader.TileMode.CLAMP);
                    longSparseArray.put(tL_starGiftUnique.id, radialGradient);
                }
                float f18 = f12 * 0.7f;
                float max = Math.max(1.0f, f11 / f12) * f18;
                Matrix matrix = this.t5;
                matrix.setScale(max, f18);
                matrix.postTranslate(rectF.centerX(), rectF.centerY());
                radialGradient.setLocalMatrix(matrix);
                paint.setShader(radialGradient);
                f13 = this.E7;
                canvas2.drawRoundRect(rectF, f13, f13, paint);
                paint.setShader(null);
                canvas2.save();
                Path path = this.G1;
                path.rewind();
                path.addRoundRect(rectF, f13, f13, Path.Direction.CW);
                canvas2.clipPath(path);
                int i16 = iArr[2] | (-16777216);
                a1 f19 = f1(tL_starGiftUnique);
                p5Var = f19.a;
                if (p5Var != null || p5Var.f[0] == null) {
                    f14 = f13;
                    document2 = document;
                } else {
                    canvas2.save();
                    canvas2.translate(rectF.centerX(), rectF.centerY());
                    if (g0.a.g()) {
                        p5 p5Var2 = f19.a;
                        Drawable drawable = p5Var2.f[0];
                        if (drawable != null && p5Var2.d.c == 1.0f && (drawable instanceof r5)) {
                            r5 r5Var = (r5) drawable;
                            g3 g3Var = r5Var.k;
                            if (g3Var != null) {
                                document2 = document;
                                if (r5Var.i() == f19.b) {
                                    bitmap = g3Var.getBitmap();
                                    if (bitmap == null) {
                                        if (f19.c != bitmap || f19.d == null) {
                                            f19.c = bitmap;
                                            f19.d = g0.a.a(bitmap);
                                        }
                                        f19.e = i16;
                                        f19.d.setColorFilter(Build.VERSION.SDK_INT >= 29 ? b0.l(i16) : new PorterDuffColorFilter(i16, PorterDuff.Mode.SRC_IN));
                                        f14 = f13;
                                        m1.b(canvas2, 2, f19.d, bitmap, rectF.width(), rectF.height(), 1.0f);
                                        canvas2 = canvas;
                                        canvas2.restore();
                                    } else {
                                        f14 = f13;
                                        f19.a.k(Integer.valueOf(i16));
                                        canvas2 = canvas;
                                        m1.a(canvas2, 2, f19.a, rectF.width(), rectF.height(), 1.0f, 1.0f);
                                        canvas2.restore();
                                    }
                                }
                            } else {
                                document2 = document;
                            }
                            bitmap = null;
                            if (bitmap == null) {
                            }
                        }
                    }
                    f14 = f13;
                    document2 = document;
                    f19.a.k(Integer.valueOf(i16));
                    canvas2 = canvas;
                    m1.a(canvas2, 2, f19.a, rectF.width(), rectF.height(), 1.0f, 1.0f);
                    canvas2.restore();
                }
                canvas2.restore();
                paint.setColor(318767103);
                canvas2.drawRoundRect(rectF, f14, f14, paint);
                Paint paint2 = this.C1;
                paint2.setColor(1308622847);
                paint2.setStrokeWidth(Math.max(1.0f, AndroidUtilities.dpf2(0.4f)));
                RectF rectF2 = this.B5;
                rectF2.set(rectF);
                rectF2.inset(0.5f, 0.5f);
                float f20 = f14 - 0.5f;
                canvas2.drawRoundRect(rectF2, f20, f20, paint2);
                currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                i12 = this.v7;
                if (i10 == i12 || this.y7 <= 0.5f) {
                    f15 = 0.7f;
                    if (i10 != this.A7 || (i10 == i12 && this.y7 < 0.5f)) {
                        float clamp012 = Utilities.clamp01((currentAnimationTimeMillis - this.D7) / 180.0f);
                        f16 = 1.0f - (clamp012 * clamp012);
                    } else {
                        f16 = 0.0f;
                    }
                } else {
                    f15 = 0.7f;
                    float clamp013 = 1.0f - Utilities.clamp01((currentAnimationTimeMillis - this.C7) / 260.0f);
                    f16 = org.telegram.ui.Cells.t0.z(clamp013, clamp013, clamp013, 1.0f);
                }
                if (f16 > 0.002f) {
                    boolean z10 = i10 == this.v7 && this.y7 > 0.5f;
                    float f21 = f15;
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.dpf2(1.0f), AndroidUtilities.dp(4.0f), f16);
                    float dp = AndroidUtilities.dp(2.0f) * f16;
                    float min = Math.min(1.0f, z10 ? f16 * 4.0f : f16 * 3.0f);
                    rectF2.set(rectF);
                    rectF2.inset(lerp, lerp);
                    paint2.setColor(-1);
                    paint2.setAlpha((int) (min * 255.0f * (i10 == this.v7 ? (f16 * 0.3f) + f21 : 1.0f)));
                    paint2.setStrokeWidth(dp);
                    float f22 = f14 - lerp;
                    canvas2.drawRoundRect(rectF2, Math.max(0.0f, f22), Math.max(0.0f, f22), paint2);
                }
                if (document2 != null) {
                    r5 e02 = e0(tL_starGiftUnique.id, document2);
                    float f23 = 0.82f * f12;
                    long currentAnimationTimeMillis3 = AnimationUtils.currentAnimationTimeMillis();
                    int i17 = this.v7;
                    if (i10 == i17 && this.y7 > 0.5f) {
                        f17 = 1.0f - (((float) a1((currentAnimationTimeMillis3 - this.C7) / 1000.0f, 0.6d, 0.3d)) * 0.14f);
                    } else if (i10 == this.A7 || (i10 == i17 && this.y7 < 0.5f)) {
                        float clamp014 = Utilities.clamp01((currentAnimationTimeMillis3 - this.D7) / 180.0f);
                        f17 = 0.86f + ((3.0f - (clamp014 * 2.0f)) * 0.14f * clamp014 * clamp014);
                    } else {
                        f17 = 1.0f;
                    }
                    float f24 = (f23 * f17) / 2.0f;
                    e02.setBounds((int) (rectF.centerX() - f24), (int) (rectF.centerY() - f24), (int) (rectF.centerX() + f24), (int) (rectF.centerY() + f24));
                    e02.setAlpha(255);
                    e02.setColorFilter(null);
                    e02.draw(canvas2);
                }
                if (D == 1.0f) {
                    canvas2.restore();
                    return;
                }
                return;
            }
        }
        D = i10 == i13 ? a6.D(1.0f, (float) a1((currentAnimationTimeMillis2 - this.C7) / 1000.0f, 0.6d, 0.3d), 0.06f, 1.0f) : 1.0f;
        if (D != 1.0f) {
        }
        int[] iArr2 = this.h2;
        c0(i10, iArr2);
        int i142 = iArr2[0];
        int i152 = iArr2[1];
        ArrayList<TL_stars.StarGiftAttribute> arrayList2 = tL_starGiftUnique.attributes;
        size = arrayList2.size();
        i11 = 0;
        document = null;
        while (i11 < size) {
        }
        RectF rectF3 = this.H1;
        rectF3.set(f7, f10, f7 + f11, f10 + f12);
        Paint paint3 = this.B1;
        paint3.setColor(-1);
        long j102 = tL_starGiftUnique.id;
        LongSparseArray longSparseArray2 = this.w5;
        radialGradient = (RadialGradient) longSparseArray2.get(j102);
        if (radialGradient == null) {
        }
        float f182 = f12 * 0.7f;
        float max2 = Math.max(1.0f, f11 / f12) * f182;
        Matrix matrix2 = this.t5;
        matrix2.setScale(max2, f182);
        matrix2.postTranslate(rectF3.centerX(), rectF3.centerY());
        radialGradient.setLocalMatrix(matrix2);
        paint3.setShader(radialGradient);
        f13 = this.E7;
        canvas2.drawRoundRect(rectF3, f13, f13, paint3);
        paint3.setShader(null);
        canvas2.save();
        Path path2 = this.G1;
        path2.rewind();
        path2.addRoundRect(rectF3, f13, f13, Path.Direction.CW);
        canvas2.clipPath(path2);
        int i162 = iArr2[2] | (-16777216);
        a1 f192 = f1(tL_starGiftUnique);
        p5Var = f192.a;
        if (p5Var != null) {
        }
        f14 = f13;
        document2 = document;
        canvas2.restore();
        paint3.setColor(318767103);
        canvas2.drawRoundRect(rectF3, f14, f14, paint3);
        Paint paint22 = this.C1;
        paint22.setColor(1308622847);
        paint22.setStrokeWidth(Math.max(1.0f, AndroidUtilities.dpf2(0.4f)));
        RectF rectF22 = this.B5;
        rectF22.set(rectF3);
        rectF22.inset(0.5f, 0.5f);
        float f202 = f14 - 0.5f;
        canvas2.drawRoundRect(rectF22, f202, f202, paint22);
        currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        i12 = this.v7;
        if (i10 == i12) {
        }
        f15 = 0.7f;
        if (i10 != this.A7) {
        }
        float clamp0122 = Utilities.clamp01((currentAnimationTimeMillis - this.D7) / 180.0f);
        f16 = 1.0f - (clamp0122 * clamp0122);
        if (f16 > 0.002f) {
        }
        if (document2 != null) {
        }
        if (D == 1.0f) {
        }
    }

    public final float G0(float f7) {
        if (!this.d3 || this.X3 <= 0.001f) {
            return 0.0f;
        }
        float f10 = this.W3;
        float[] fArr = e1.b;
        float max = f10 / Math.max(0.3f, fArr[50]);
        if (max > 4.0f || max < -4.0f) {
            return 0.0f;
        }
        return Math.min(AndroidUtilities.dpf2(fArr[42]), (AndroidUtilities.dp(3.5f) / 2.0f) / 0.607f) * f7 * max * ((float) Math.exp((-0.5f) * max * max)) * this.X3;
    }

    public final void H(Canvas canvas, RectF rectF, float f7, float f10) {
        RectF rectF2;
        float f11;
        RectF rectF3;
        float f12;
        float f13;
        char c10;
        char c11;
        int i10;
        if (f10 <= 0.0f) {
            return;
        }
        if (this.D6) {
            g(canvas, rectF, f7);
        }
        if (this.h6) {
            float min = Math.min(0.0f, AndroidUtilities.dpf2(e1.a[2][8]));
            rectF3 = this.C5;
            rectF2 = rectF;
            rectF3.set(rectF2);
            rectF3.inset(min, min);
            f11 = f7 - min;
        } else {
            rectF2 = rectF;
            f11 = f7;
            rectF3 = rectF2;
        }
        Path path = this.G1;
        path.rewind();
        path.addRoundRect(rectF3, f11, f11, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        boolean f14 = b0.f();
        float[] fArr = e1.b;
        if (f14 && h0(canvas)) {
            int i11 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
            if (i11 < 0) {
                canvas.saveLayerAlpha(rectF3, (int) (f10 * 255.0f));
            }
            canvas.save();
            canvas.scale(4.0f, 4.0f);
            if (!this.Y5 || this.X5 <= 0.004f) {
                f12 = 0.0f;
                i10 = i11;
                f13 = 255.0f;
                c10 = '\t';
                c11 = 3;
                b0.c(canvas, this.J1);
            } else {
                canvas.scale(2.0f, 2.0f);
                if (this.Z5 == null) {
                    this.Z5 = android.support.v4.media.session.x.d("qrSheetLift");
                }
                float round = Math.round(this.X5 * 50.0f) / 50.0f;
                z0 z0Var = this.n;
                int i12 = z0Var != null ? z0Var.b : 0;
                c10 = '\t';
                c11 = 3;
                if (round == this.a6 && this.b6 == 1 && this.c6 == i12) {
                    f12 = 0.0f;
                    i10 = i11;
                    f13 = 255.0f;
                } else {
                    this.a6 = round;
                    this.b6 = 1;
                    this.c6 = i12;
                    Object obj = this.Z5;
                    f13 = 255.0f;
                    f12 = 0.0f;
                    i10 = i11;
                    float max = (fArr[10] / 100.0f) * round * ((float) Math.max(0.0d, Math.min(1.0d, (0.85d - (z0Var != null ? i0.b.h(z0Var.b) : 0.3d)) / 0.45d)));
                    float d = a1.g.d(fArr[11], 100.0f, round, 1.0f);
                    float f15 = ((0.5f - (d * 0.5f)) + max) * 255.0f;
                    b0.k(obj, Math.max(0.5f, AndroidUtilities.dpf2(AndroidUtilities.lerp(fArr[2], fArr[12], round)) / 8.0f), new float[]{d, 0.0f, 0.0f, 0.0f, f15, 0.0f, d, 0.0f, 0.0f, f15, 0.0f, 0.0f, d, 0.0f, f15, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                }
                Canvas a2 = b0.a((getWidth() + 7) / 8, (getHeight() + 7) / 8, this.Z5);
                a2.scale(0.125f, 0.125f);
                b0.c(a2, this.I1);
                b0.d(this.Z5);
                b0.c(canvas, this.Z5);
            }
            canvas.restore();
            if (i10 < 0) {
                canvas.restore();
            }
        } else {
            f12 = 0.0f;
            f13 = 255.0f;
            c10 = '\t';
            c11 = 3;
            F(canvas, rectF3, f10);
        }
        int i13 = this.D8;
        if (i13 == 0) {
            i13 = f((fArr[c11] + (this.Y5 ? fArr[c10] * this.X5 : f12)) / 100.0f, 16777215);
        }
        Paint paint = this.B1;
        paint.setColor(i13);
        paint.setAlpha((int) (Color.alpha(paint.getColor()) * f10));
        canvas.drawRect(rectF3, paint);
        float min2 = Math.min(rectF3.height(), AndroidUtilities.dp(40.0f));
        Matrix matrix = this.N6;
        matrix.setScale(1.0f, min2);
        matrix.postTranslate(f12, rectF3.top);
        LinearGradient linearGradient = this.f6;
        linearGradient.setLocalMatrix(matrix);
        paint.setShader(linearGradient);
        paint.setAlpha((int) (f10 * f13));
        canvas.drawRect(rectF3, paint);
        paint.setShader(null);
        boolean z10 = this.Y5;
        if ((((z10 || this.h6) ? 0.0f : (fArr[21] / 100.0f) * this.H5) > 0.0f || fArr[39] > 0.0f) && this.d3 && !z10 && !this.h6) {
            int width = getWidth();
            int height = getHeight();
            float V0 = V0(rectF3.left, rectF3.centerY(), width, height);
            float V02 = V0(rectF3.centerX(), rectF3.centerY(), width, height);
            float V03 = V0(rectF3.right, rectF3.centerY(), width, height);
            if (V0 + V02 + V03 > 0.01f) {
                float f16 = ((fArr[39] * 1.25f) / 100.0f) * this.H5 * 0.1f;
                float f17 = V02 * f16 * f10;
                float f18 = f16 * V03 * f10;
                float centerX = rectF3.centerX();
                J(rectF3.left, centerX, V0 * f16 * f10, f17, canvas, rectF3);
                J(centerX, rectF3.right, f17, f18, canvas, rectF3);
            }
        }
        canvas.restore();
        A(canvas, null, rectF2, f7, f10);
    }

    public final int H0() {
        z0 z0Var = this.n;
        if (z0Var == null) {
            return -16777216;
        }
        if (this.s >= 1.0f || this.r == null) {
            return z0Var.e;
        }
        float l4 = (l() / 2.0f) + m();
        float clamp01 = Utilities.clamp01(((((((float) Math.hypot(Math.max(this.w, getWidth() - this.w), Math.max(this.x, getHeight() - this.x))) + AndroidUtilities.dp(60.0f)) * r1(this.s)) - ((float) Math.hypot((getWidth() / 2.0f) - this.w, l4 - this.x))) + AndroidUtilities.dp(80.0f)) / AndroidUtilities.dp(160.0f));
        int i10 = this.r.e;
        int i11 = this.n.e;
        float B = a6.B(clamp01, 2.0f, 3.0f, clamp01 * clamp01);
        double[] dArr = this.W2;
        i0.b.j(i10, dArr);
        double[] dArr2 = this.X2;
        i0.b.j(i11, dArr2);
        double d = B;
        double[] dArr3 = this.Y2;
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

    public final void I(Canvas canvas) {
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
        RectF rectF = this.o5;
        float dp4 = f13 > 0.5f ? (rectF.bottom + AndroidUtilities.dp(6.0f)) - f12 : rectF.top - AndroidUtilities.dp(6.0f);
        float width = (getWidth() - dp) / 2.0f;
        RectF rectF2 = this.u8;
        rectF2.set(width, dp4, dp + width, f12 + dp4);
        float f14 = this.o8;
        float f15 = this.p8;
        float clamp01 = Utilities.clamp01(this.k1);
        float lerp = AndroidUtilities.lerp(rectF.left, rectF2.left, f14);
        float lerp2 = AndroidUtilities.lerp(rectF.top, rectF2.top, f15);
        float lerp3 = AndroidUtilities.lerp(rectF.right, rectF2.right, f14);
        float lerp4 = AndroidUtilities.lerp(rectF.bottom, rectF2.bottom, f15);
        RectF rectF3 = this.t8;
        rectF3.set(lerp, lerp2, lerp3, lerp4);
        float min = Math.min(rectF3.height() / 2.0f, Math.min(rectF3.width() / 2.0f, AndroidUtilities.lerp(rectF.height() / 2.0f, AndroidUtilities.dp(22.0f), Utilities.clamp01(f15))));
        float max = Math.max(-0.25f, Math.min(1.0f, this.q8 / 9.0f)) * AndroidUtilities.dp(5.0f);
        float f16 = rectF3.left;
        float f17 = rectF3.top;
        float f18 = rectF3.right;
        float f19 = rectF3.bottom;
        float centerX = rectF3.centerX();
        Path path = this.s8;
        path.rewind();
        float f20 = f16 + min;
        path.moveTo(f20, f17);
        float f21 = f18 - min;
        path.lineTo(f21, f17);
        float f22 = f17 + min;
        path.quadTo(f18, f17, f18, f22);
        float f23 = f19 - min;
        path.lineTo(f18, f23);
        path.quadTo(f18, f19, f21, f19);
        float f24 = f19 + max;
        path.cubicTo(AndroidUtilities.lerp(f21, centerX, 0.55f), f24, AndroidUtilities.lerp(f20, centerX, 0.55f), f24, f20, f19);
        path.quadTo(f16, f19, f16, f23);
        path.lineTo(f16, f22);
        path.quadTo(f16, f17, f20, f17);
        path.close();
        float max2 = Math.max(0.0f, max) + f19;
        RectF rectF4 = this.H1;
        rectF4.set(f16, f17, f18, max2);
        if (this.D6) {
            g(canvas2, rectF4, Math.min(rectF4.height(), rectF4.width()) / 2.0f);
        }
        canvas2.save();
        canvas2.clipPath(path);
        if (b0.f() && h0(canvas)) {
            canvas2.save();
            canvas2.scale(4.0f, 4.0f);
            b0.c(canvas2, this.J1);
            canvas2.restore();
        } else {
            F(canvas2, rectF4, 1.0f);
        }
        Paint paint = this.B1;
        paint.setColor(352321535);
        paint.setAlpha((int) (Color.alpha(paint.getColor()) * 1.0f));
        canvas2.drawRect(rectF4, paint);
        float min2 = Math.min(rectF4.height(), AndroidUtilities.dp(40.0f));
        Matrix matrix = this.N6;
        matrix.setScale(1.0f, min2);
        matrix.postTranslate(0.0f, rectF4.top);
        LinearGradient linearGradient = this.f6;
        linearGradient.setLocalMatrix(matrix);
        paint.setShader(linearGradient);
        float f25 = 255.0f;
        paint.setAlpha((int) 255.0f);
        canvas2.drawRect(rectF4, paint);
        paint.setShader(null);
        canvas2.restore();
        A(canvas2, path, rectF4, 0.0f, 1.0f);
        canvas2.save();
        canvas2.clipPath(path);
        float f26 = clamp01 / 0.3f;
        float clamp012 = 1.0f - Utilities.clamp01(f26);
        float f27 = 0.004f;
        float f28 = 0.15f;
        boolean z10 = false;
        int i11 = 1;
        if (clamp012 > 0.004f) {
            canvas2.saveLayerAlpha(rectF4, (int) (clamp012 * 255.0f));
            float clamp013 = 1.0f - (Utilities.clamp01(f26) * 0.15f);
            canvas2.scale(clamp013, clamp013, rectF.centerX(), rectF.centerY());
            this.y5 = true;
            int width2 = getWidth();
            System.currentTimeMillis();
            z(canvas2, width2);
            this.y5 = false;
            canvas2.restore();
        }
        float centerX2 = rectF3.centerX() - rectF2.centerX();
        float f29 = rectF3.top - rectF2.top;
        float f30 = 0.6f;
        if (Math.abs(this.q8) < 0.6f) {
            centerX2 = Math.round(centerX2);
            f29 = Math.round(f29);
        }
        canvas2.save();
        canvas2.translate(centerX2, f29);
        TextPaint textPaint = this.E1;
        textPaint.setSubpixelText(true);
        textPaint.setLinearText(false);
        String[] strArr = {LocaleController.getString(R.string.QrNoPaidMenuReset), LocaleController.getString(this.x0 ? R.string.QrNoPaidMenuDisableTimer : R.string.QrNoPaidMenuEnableTimer), LocaleController.getString(R.string.QrNoPaidMenuRestoreFee)};
        String[] strArr2 = {null, LocaleController.getString(this.x0 ? R.string.QrNoPaidMenuDisableTimerInfo : R.string.QrNoPaidMenuEnableTimerInfo), null};
        int i12 = 0;
        float f31 = dp4;
        while (i12 < 3) {
            RectF[] rectFArr = this.i8;
            if (i12 == i11 && this.y0) {
                rectFArr[i12].setEmpty();
                i10 = i12;
                f7 = f27;
                f10 = f25;
            } else {
                float f32 = strArr2[i12] != null ? dp3 : dp2;
                f7 = f27;
                f10 = f25;
                float f33 = f31 + f32;
                rectFArr[i12].set(rectF2.left, f31, rectF2.right, f33);
                float Z0 = this.l1 > 0.5f ? Z0(f28, f30, clamp01) : Z0(f30, 1.0f, clamp01);
                if (Z0 <= f7) {
                    i10 = i12;
                } else {
                    K(canvas2, i12, rectFArr[i12], z10);
                    canvas2.save();
                    float f34 = (f32 / 2.0f) + f31;
                    if (i12 == 2) {
                        i10 = i12;
                        m0(canvas2, this.M1, rectF2.left + AndroidUtilities.dp(26.0f), f34, AndroidUtilities.dp(20.0f), Z0);
                        canvas2 = canvas;
                    } else {
                        i10 = i12;
                        if (i10 == 0) {
                            canvas2 = canvas;
                            m0(canvas2, this.T1, rectF2.left + AndroidUtilities.dp(26.0f), f34, AndroidUtilities.dp(20.0f), Z0);
                        } else {
                            canvas2 = canvas;
                            boolean z11 = this.x0;
                            Bitmap bitmap = z11 ? this.y8 : this.z8;
                            if (bitmap != null) {
                                f11 = 26.0f;
                            } else {
                                int round = Math.round(AndroidUtilities.dp(22.4f));
                                Bitmap createBitmap = Bitmap.createBitmap(round, round, Bitmap.Config.ALPHA_8);
                                f11 = 26.0f;
                                Canvas canvas3 = new Canvas(createBitmap);
                                float f35 = round / 24.0f;
                                canvas3.scale(f35, f35);
                                Paint paint2 = new Paint(1);
                                Paint.Style style = Paint.Style.STROKE;
                                paint2.setStyle(style);
                                paint2.setStrokeWidth(1.66f);
                                Paint.Cap cap = Paint.Cap.ROUND;
                                paint2.setStrokeCap(cap);
                                paint2.setStrokeJoin(Paint.Join.ROUND);
                                paint2.setColor(-16777216);
                                canvas3.drawCircle(11.0f, 11.0f, 8.0f, paint2);
                                canvas3.drawLine(11.0f, 11.0f, 11.0f, 6.6f, paint2);
                                canvas3.drawLine(11.0f, 11.0f, 7.8f, 11.0f, paint2);
                                if (z11) {
                                    Paint paint3 = new Paint(1);
                                    paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                                    canvas3.drawCircle(18.2f, 18.2f, 5.7f, paint3);
                                    Paint paint4 = new Paint(1);
                                    paint4.setColor(-16777216);
                                    canvas3.drawCircle(18.2f, 18.2f, 4.4f, paint4);
                                    paint3.setStyle(style);
                                    paint3.setStrokeWidth(1.4f);
                                    paint3.setStrokeCap(cap);
                                    canvas3.drawLine(16.6f, 16.6f, 19.8f, 19.8f, paint3);
                                    canvas3.drawLine(19.8f, 16.6f, 16.6f, 19.8f, paint3);
                                    this.y8 = createBitmap;
                                } else {
                                    this.z8 = createBitmap;
                                }
                                bitmap = createBitmap;
                            }
                            float dp5 = rectF2.left + AndroidUtilities.dp(f11);
                            Paint paint5 = this.A8;
                            paint5.setColor(-1);
                            paint5.setAlpha((int) (Color.alpha(-1) * Z0));
                            canvas2.drawBitmap(bitmap, dp5 - (bitmap.getWidth() / 2.0f), f34 - (bitmap.getHeight() / 2.0f), paint5);
                        }
                    }
                    textPaint.setTextSize(AndroidUtilities.dp(15.0f));
                    textPaint.setColor(-1);
                    textPaint.setAlpha((int) (Z0 * f10));
                    canvas2.drawText(strArr[i10], rectF2.left + AndroidUtilities.dp(52.0f), strArr2[i10] != null ? f34 - AndroidUtilities.dp(2.0f) : AndroidUtilities.dp(5.0f) + f34, textPaint);
                    if (strArr2[i10] != null) {
                        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
                        textPaint.setColor(-1493172225);
                        textPaint.setAlpha((int) (Color.alpha(-1493172225) * Z0));
                        canvas2.drawText(strArr2[i10], rectF2.left + AndroidUtilities.dp(52.0f), f34 + AndroidUtilities.dp(14.0f), textPaint);
                    }
                    canvas2.restore();
                }
                f31 = f33;
            }
            i12 = i10 + 1;
            f27 = f7;
            f25 = f10;
            f28 = 0.15f;
            f30 = 0.6f;
            z10 = false;
            i11 = 1;
        }
        canvas2.restore();
        canvas2.restore();
    }

    public final void I0(y0 y0Var) {
        if (y0Var == null) {
            return;
        }
        r5 r5Var = y0Var.c;
        if (r5Var != null) {
            r5Var.o(this);
        }
        r5 r5Var2 = y0Var.d;
        if (r5Var2 != null && !y0Var.F && !this.t7.containsValue(r5Var2)) {
            y0Var.d.o(this);
        }
        y0Var.G = true;
        j jVar = y0Var.v;
        if (jVar != null) {
            jVar.n = true;
            int i10 = jVar.a;
            NotificationCenter.getInstance(i10).removeObserver(jVar, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(i10).removeObserver(jVar, NotificationCenter.fileLoadFailed);
            if (!jVar.r) {
                Iterator it = jVar.c.values().iterator();
                while (it.hasNext()) {
                    ((Bitmap) it.next()).recycle();
                }
            }
            y0Var.v = null;
        }
        z zVar = y0Var.E;
        if (zVar != null) {
            zVar.n = true;
            NotificationCenter.getInstance(zVar.a).removeObserver(zVar, NotificationCenter.fileLoaded);
            y0Var.E = null;
        }
        l lVar = y0Var.u;
        if (lVar != null) {
            e.c(lVar.a);
            y0Var.u = null;
        }
        a0 a0Var = y0Var.A;
        if (a0Var != null) {
            e.c(a0Var.a);
            y0Var.A = null;
        }
        y0Var.H.d(null);
        y0Var.I.d(null);
        y0Var.J.d(null);
        y0Var.K.d(null);
    }

    public final void J(float f7, float f10, float f11, float f12, Canvas canvas, RectF rectF) {
        float min = Math.min(f11, f12);
        float max = Math.max(f11, f12);
        Paint paint = this.G5;
        if (min > 0.002f) {
            paint.setShader(null);
            paint.setColor(f(min, 16777215));
            canvas.drawRect(f7, rectF.top, f10, rectF.bottom, paint);
        }
        float f13 = max - min;
        if (f13 > 0.002f) {
            LinearGradient linearGradient = f12 >= f11 ? this.D5 : this.E5;
            Matrix matrix = this.F5;
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

    public final void J0() {
        int i10 = this.b9;
        if (i10 >= 0) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.i9[i10] = Q0(i10, currentAnimationTimeMillis);
            this.h9[i10] = currentAnimationTimeMillis;
            invalidate();
        }
        this.b9 = -1;
    }

    public final void K(Canvas canvas, int i10, RectF rectF, boolean z10) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        boolean z11 = this.b9 == i10;
        long[] jArr = this.h9;
        if (z11 || jArr[i10] != 0) {
            float Q0 = z11 ? Q0(i10, currentAnimationTimeMillis) : this.i9[i10] * ((float) Math.exp((-(currentAnimationTimeMillis - jArr[i10])) / 180.0f));
            if (!z11 && Q0 < 0.004f) {
                jArr[i10] = 0;
                return;
            }
            float B = a6.B(Q0, 2.0f, 3.0f, Q0 * Q0);
            float min = Math.min(1.0f, (currentAnimationTimeMillis - this.g9[i10]) / 320.0f);
            float f7 = 1.0f - min;
            float z12 = org.telegram.ui.Cells.t0.z(f7, f7, f7, 1.0f);
            if (!z11 || Q0 < 0.996f || min < 1.0f) {
                invalidate();
            }
            float max = Math.max(rectF.left, Math.min(rectF.right, this.e9[i10]));
            float max2 = Math.max(rectF.top, Math.min(rectF.bottom, this.f9[i10]));
            float max3 = (float) Math.max(Math.hypot(max - rectF.left, max2 - rectF.top), Math.max(Math.hypot(max - rectF.right, max2 - rectF.top), Math.max(Math.hypot(max - rectF.left, max2 - rectF.bottom), Math.hypot(max - rectF.right, max2 - rectF.bottom))));
            int i11 = z10 ? 335544320 : 738197503;
            Paint paint = this.c9;
            paint.setColor((((int) ((i11 >>> 24) * B)) << 24) | (16777215 & i11));
            Path path = this.d9;
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

    public final void K0() {
        float f7 = this.e0;
        if (f7 == 0.0f && this.f0 == 0.0f) {
            return;
        }
        this.i0 = f7;
        this.j0 = this.f0;
        this.W = AnimationUtils.currentAnimationTimeMillis();
        this.U = true;
    }

    public final void L(Canvas canvas, z0 z0Var, int i10, int i11) {
        if (z0Var == null) {
            canvas.drawColor(-16777216);
            return;
        }
        int i12 = z0Var.a;
        Paint paint = this.z1;
        Matrix matrix = this.E;
        if (i12 == 0 && z0Var.f == r9) {
            float f7 = i10;
            double radians = (float) Math.toRadians(18.0d);
            float f10 = i11;
            matrix.setScale(1.0f, (((float) Math.cos(radians)) * f10) + (((float) Math.sin(radians)) * f7));
            matrix.postRotate(-18.0f);
            z0Var.g.setLocalMatrix(matrix);
            paint.setShader(z0Var.g);
            canvas.drawRect(0.0f, 0.0f, f7, f10, paint);
            paint.setShader(null);
            return;
        }
        float f11 = i10;
        float l4 = (l() / 2.0f) + m();
        float hypot = ((float) Math.hypot(i10, i11)) * 0.62f;
        matrix.setScale(hypot, hypot);
        matrix.postTranslate(f11 / 2.0f, l4);
        z0Var.h.setLocalMatrix(matrix);
        paint.setShader(z0Var.h);
        canvas.drawRect(0.0f, 0.0f, f11, i11, paint);
        paint.setShader(null);
    }

    public final void L0() {
        int i10 = this.F7;
        if (i10 < 0 || this.H7 >= this.G7) {
            return;
        }
        this.I7 = d1(i10);
        this.H7 = AnimationUtils.currentAnimationTimeMillis();
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x03df, code lost:
    
        if (r6.c8[r8] != ((r43 * 31) + r44)) goto L135;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04e0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0cb0  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0d00  */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0720  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0749  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0862  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0aa6  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0aad  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0b88  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0bd7  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0c12  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0c52  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0c62  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0c67  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0c6a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0c23  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0c08  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0c7a A[LOOP:3: B:313:0x0c76->B:315:0x0c7a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0ca8  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0976  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x07bb  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x06e2  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x06b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M(Canvas canvas, int i10, int i11) {
        int i12;
        float f7;
        Path path;
        float f10;
        int i13;
        float f11;
        int i14;
        float f12;
        float f13;
        int i15;
        b1 b1Var;
        Canvas canvas2;
        float f14;
        float f15;
        int i16;
        ArrayList arrayList;
        float f16;
        float f17;
        boolean z10;
        RectF rectF;
        int i17;
        int i18;
        int i19;
        int i20;
        float f18;
        float z11;
        float f19;
        boolean z12;
        float f20;
        float f21;
        y0 y0Var;
        float f22;
        float f23;
        float f24;
        TLRPC.Document document;
        ArrayList<TLRPC.Document> arrayList2;
        float f25;
        g3 g3Var;
        long j10;
        float B;
        float clamp01;
        float f26;
        float f27;
        r5 r5Var;
        long j11;
        float f28;
        float f29;
        float lerp;
        float f30;
        int i21;
        float f31;
        int i22;
        int i23;
        float f32;
        float f33;
        int length;
        int[] iArr;
        b1 b1Var2 = this;
        float f34 = b1Var2.f1;
        if (f34 <= 0.001f) {
            return;
        }
        float clamp012 = Utilities.clamp01(f34);
        float U0 = b1Var2.U0();
        float T0 = b1Var2.T0();
        float f35 = T0 - U0;
        float dp = AndroidUtilities.dp(10.0f);
        float dp2 = i10 - AndroidUtilities.dp(10.0f);
        RectF rectF2 = b1Var2.e7;
        rectF2.set(dp, f35, dp2, T0);
        float h = b1Var2.h();
        float dp3 = AndroidUtilities.dp(10.0f) - AndroidUtilities.dp(3.0f);
        float f36 = i10;
        float f37 = f36 / 2.0f;
        float max = Math.max(dp3, AndroidUtilities.lerp(f37 - AndroidUtilities.dp(72.0f), rectF2.left, f34));
        float lerp2 = AndroidUtilities.lerp(h - AndroidUtilities.dp(20.0f), f35, f34);
        float min = Math.min(f36 - dp3, AndroidUtilities.lerp(f37 + AndroidUtilities.dp(72.0f), rectF2.right, f34));
        float lerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(20.0f) + h, T0, clamp012);
        RectF rectF3 = b1Var2.j7;
        rectF3.set(max, lerp2, min, lerp3);
        float min2 = Math.min(rectF3.height() / 2.0f, AndroidUtilities.lerp(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(28.17f), clamp012));
        int i24 = (clamp012 > 0.5f ? 1 : (clamp012 == 0.5f ? 0 : -1));
        float f38 = 10.0f;
        b1Var2.h6 = i24 > 0;
        if (clamp012 >= 0.35f) {
            f7 = 0.35f;
            if (b1Var2.K5 || b1Var2.g1 <= 0.5f) {
                i12 = i24;
            } else {
                b1Var2.K5 = true;
                i12 = i24;
                b1Var2.I5 = AnimationUtils.currentAnimationTimeMillis();
            }
        } else {
            i12 = i24;
            f7 = 0.35f;
        }
        if (clamp012 < 0.05f) {
            b1Var2.K5 = false;
        }
        b1Var2.X5 = clamp012;
        b1Var2.Y5 = true;
        b1Var2.H(canvas, rectF3, min2, 1.0f);
        b1Var2.Y5 = false;
        b1Var2.h6 = false;
        z0 z0Var = b1Var2.n;
        int i25 = z0Var != null ? z0Var.i : TLObject.FLAG_30;
        Paint paint = b1Var2.B1;
        paint.setColor(i25);
        paint.setAlpha((int) (Color.alpha(i25) * clamp012));
        float[][] fArr = e1.a;
        if (i12 > 0) {
            float min3 = Math.min(0.0f, AndroidUtilities.dpf2(fArr[2][8]));
            RectF rectF4 = b1Var2.B5;
            rectF4.set(rectF3);
            rectF4.inset(min3, min3);
            float f39 = min2 - min3;
            canvas.drawRoundRect(rectF4, f39, f39, paint);
        } else {
            canvas.drawRoundRect(rectF3, min2, min2, paint);
        }
        float clamp013 = 1.0f - Utilities.clamp01(clamp012 / f7);
        int i26 = 3;
        Path path2 = b1Var2.G1;
        if (clamp013 > 0.0f) {
            canvas.save();
            path2.rewind();
            path2.addRoundRect(rectF3, min2, min2, Path.Direction.CW);
            canvas.clipPath(path2);
            float dp4 = AndroidUtilities.dp(144.0f) / 3.0f;
            int i27 = 0;
            while (i27 < i26) {
                int i28 = i26;
                float f40 = min2;
                float b10 = wh.b(i27, 0.5f, dp4, f37 - AndroidUtilities.dp(72.0f));
                Drawable drawable = b1Var2.P6[i27];
                float lerp4 = AndroidUtilities.lerp(h, h - AndroidUtilities.dp(10.0f), clamp012);
                float dp5 = AndroidUtilities.dp(i27 == 1 ? 24.5f : 22.0f);
                float f41 = clamp012 * 0.15f;
                Path path3 = path2;
                int i29 = i27 == b1Var2.h1 ? 1 : 0;
                int i30 = i27;
                float f42 = clamp013;
                m0(canvas, drawable, b10, lerp4, a6.A(f41, i29, 1.0f, dp5), f42);
                i27 = i30 + 1;
                b1Var2 = this;
                clamp013 = f42;
                min2 = f40;
                dp4 = dp4;
                T0 = T0;
                path2 = path3;
                i26 = i28;
            }
            b1Var = b1Var2;
            path = path2;
            f10 = T0;
            i13 = i26;
            i15 = 1;
            f11 = 1.0f;
            i14 = 2;
            f12 = 0.5f;
            f13 = min2;
            canvas.restore();
        } else {
            path = path2;
            f10 = T0;
            i13 = 3;
            f11 = 1.0f;
            i14 = 2;
            f12 = 0.5f;
            f13 = min2;
            i15 = 1;
            b1Var = b1Var2;
        }
        float f43 = b1Var.i7;
        if (f43 <= 0.004f) {
            return;
        }
        int i31 = f43 < 0.999f ? i15 : 0;
        if (i31 != 0) {
            int i32 = (int) (f43 * 255.0f);
            canvas2 = canvas;
            float f44 = f10;
            canvas2.saveLayerAlpha(rectF2.left, f35, rectF2.right, f44, i32);
            f14 = f35;
            f15 = f44;
        } else {
            canvas2 = canvas;
            f14 = f35;
            f15 = f10;
        }
        canvas2.save();
        path.rewind();
        Path path4 = path;
        path4.addRoundRect(rectF3, f13, f13, Path.Direction.CW);
        canvas2.clipPath(path4);
        int i33 = b1Var.h1 != i15 ? i15 : 0;
        if (i33 != 0) {
            canvas2.saveLayer(rectF3, null);
        }
        canvas2.save();
        canvas2.translate(0.0f, (f11 - b1Var.i7) * AndroidUtilities.dp(14.0f));
        canvas2.translate(0.0f, -b1Var.j1);
        float dp6 = AndroidUtilities.dp(4.0f) + f14;
        int i34 = b1Var.h1;
        if (i34 == 0) {
            float width = (rectF2.width() - AndroidUtilities.dp(8.0f)) / 6.0f;
            float min4 = Math.min(width - AndroidUtilities.dp(10.0f), AndroidUtilities.dp(44.0f));
            int i35 = b1Var.g1 > f12 ? i15 : 0;
            float O0 = i35 != 0 ? b1Var.O0() : f11;
            if (i35 != 0) {
                float f45 = f11 - O0;
                f28 = f11;
                lerp = AndroidUtilities.lerp(0.8f, f28, org.telegram.ui.Cells.t0.z(f45, f45, f45, f28));
                f29 = 0.8f;
            } else {
                f28 = f11;
                f29 = 0.8f;
                lerp = AndroidUtilities.lerp(0.96f, f28, b1Var.i7);
            }
            if (i35 != 0 && O0 < f28) {
                b1Var.invalidate();
            }
            canvas2.save();
            float centerX = rectF2.centerX();
            float f46 = b1Var.j1;
            canvas2.scale(lerp, lerp, centerX, i35 != 0 ? f46 + f15 : a6.z(f15, f14, 2.0f, f46 + f14));
            int i36 = 0;
            while (i36 < a.b.length) {
                int X0 = X0(i36);
                float f47 = f12;
                float b11 = wh.b(i36 % 6, f47, width, rectF2.left + AndroidUtilities.dp(4.0f));
                float b12 = wh.b(i36 / 6, f47, width, dp6);
                float f48 = b12 - b1Var.j1;
                float f49 = f14;
                float f50 = width;
                if (f48 > i11 + f50 || f48 < f49 - f50) {
                    f30 = dp6;
                    i21 = i31;
                    f31 = min4;
                } else {
                    float max2 = Math.max(0.0f, Math.min(f38, (f48 - f49) / f50));
                    float clamp014 = Utilities.clamp01(i35 != 0 ? ((420.0f * O0) - (max2 * 12.0f)) / 300.0f : (b1Var.i7 - (max2 * 0.02f)) / f29);
                    float f51 = i35 != 0 ? 0.82f : 0.85f;
                    float f52 = 1.0f - clamp014;
                    float d12 = (((1.0f - ((f52 * f52) * f52)) * (1.0f - f51)) + f51) * b1Var.d1(i36);
                    if (d12 != 1.0f) {
                        canvas2.save();
                        canvas2.scale(d12, d12, b11, b12);
                    }
                    float f53 = min4 / 2.0f;
                    f30 = dp6;
                    if (X0 == r9) {
                        i22 = -12602881;
                    } else {
                        j();
                        i22 = n9[X0];
                    }
                    int i37 = i22;
                    if (X0 == r9) {
                        i23 = -15308082;
                    } else {
                        j();
                        i23 = o9[X0];
                    }
                    int i38 = i23;
                    z0 z0Var2 = b1Var.n;
                    if (z0Var2 != null && z0Var2.a == 0) {
                        int i39 = z0Var2.f;
                    }
                    if (i36 == b1Var.e8) {
                        f33 = b1Var.g8;
                    } else if (i36 == b1Var.f8) {
                        f33 = b1Var.h8;
                    } else {
                        f32 = 0.0f;
                        paint.setColor(-1);
                        length = b1Var.b8.length;
                        iArr = a.b;
                        if (length != iArr.length) {
                            b1Var.b8 = new LinearGradient[iArr.length];
                            b1Var.c8 = new int[iArr.length];
                        }
                        LinearGradient[] linearGradientArr = b1Var.b8;
                        LinearGradient linearGradient = linearGradientArr[i36];
                        LinearGradient[] linearGradientArr2 = linearGradient == null ? linearGradientArr : linearGradientArr;
                        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 1.0f, 1.0f, i37, i38, Shader.TileMode.CLAMP);
                        linearGradientArr2[i36] = linearGradient2;
                        b1Var.c8[i36] = (i37 * 31) + i38;
                        linearGradient = linearGradient2;
                        float f54 = f53 * 2.0f;
                        Matrix matrix = b1Var.N6;
                        matrix.setScale(f54, f54);
                        float f55 = b11 - f53;
                        i21 = i31;
                        float f56 = b12 - f53;
                        matrix.postTranslate(f55, f56);
                        linearGradient.setLocalMatrix(matrix);
                        paint.setShader(linearGradient);
                        canvas2.drawCircle(b11, b12, f53, paint);
                        paint.setShader(null);
                        float max3 = Math.max(0.0f, -AndroidUtilities.dpf2(fArr[i13][8])) + 1.0f;
                        float f57 = (b11 + f53) - max3;
                        float f58 = (b12 + f53) - max3;
                        RectF rectF5 = b1Var.M6;
                        rectF5.set(f55 + max3, f56 + max3, f57, f58);
                        float f59 = min4;
                        float f60 = f29;
                        f31 = f59;
                        b1Var.d8.a(canvas, rectF5, f53 - max3, 3, 1.0f);
                        canvas2 = canvas;
                        if (f32 > 0.01f) {
                            boolean z13 = i36 == b1Var.e8;
                            float dp7 = (f53 - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(1.0f);
                            float lerp5 = z13 ? AndroidUtilities.lerp(f60, 1.0f, f32) * dp7 : AndroidUtilities.lerp(f53 - AndroidUtilities.dpf2(1.0f), dp7, f32);
                            float dp8 = AndroidUtilities.dp(2.0f);
                            if (!z13) {
                                dp8 *= f32;
                            }
                            float min5 = z13 ? f32 : Math.min(1.0f, f32 * 3.0f);
                            double h10 = i0.b.h(i37);
                            Paint paint2 = b1Var.C1;
                            if (h10 > 0.62d) {
                                paint2.setColor(a(min5, 939524096));
                                float dpf2 = AndroidUtilities.dpf2(1.2f);
                                if (z13) {
                                    f32 = 1.0f;
                                }
                                paint2.setStrokeWidth((dpf2 * f32) + dp8);
                                canvas2.drawCircle(b11, b12, lerp5, paint2);
                            }
                            paint2.setColor(a(min5, -1));
                            paint2.setStrokeWidth(dp8);
                            canvas2.drawCircle(b11, b12, lerp5, paint2);
                        }
                        if (d12 == 1.0f) {
                            canvas2.restore();
                            b1Var.invalidate();
                        }
                    }
                    f32 = f33;
                    paint.setColor(-1);
                    length = b1Var.b8.length;
                    iArr = a.b;
                    if (length != iArr.length) {
                    }
                    LinearGradient[] linearGradientArr3 = b1Var.b8;
                    LinearGradient linearGradient3 = linearGradientArr3[i36];
                    if (linearGradient3 == null) {
                    }
                    LinearGradient linearGradient22 = new LinearGradient(0.0f, 0.0f, 1.0f, 1.0f, i37, i38, Shader.TileMode.CLAMP);
                    linearGradientArr2[i36] = linearGradient22;
                    b1Var.c8[i36] = (i37 * 31) + i38;
                    linearGradient3 = linearGradient22;
                    float f542 = f53 * 2.0f;
                    Matrix matrix2 = b1Var.N6;
                    matrix2.setScale(f542, f542);
                    float f552 = b11 - f53;
                    i21 = i31;
                    float f562 = b12 - f53;
                    matrix2.postTranslate(f552, f562);
                    linearGradient3.setLocalMatrix(matrix2);
                    paint.setShader(linearGradient3);
                    canvas2.drawCircle(b11, b12, f53, paint);
                    paint.setShader(null);
                    float max32 = Math.max(0.0f, -AndroidUtilities.dpf2(fArr[i13][8])) + 1.0f;
                    float f572 = (b11 + f53) - max32;
                    float f582 = (b12 + f53) - max32;
                    RectF rectF52 = b1Var.M6;
                    rectF52.set(f552 + max32, f562 + max32, f572, f582);
                    float f592 = min4;
                    float f602 = f29;
                    f31 = f592;
                    b1Var.d8.a(canvas, rectF52, f53 - max32, 3, 1.0f);
                    canvas2 = canvas;
                    if (f32 > 0.01f) {
                    }
                    if (d12 == 1.0f) {
                    }
                }
                i36++;
                min4 = f31;
                width = f50;
                f14 = f49;
                dp6 = f30;
                i31 = i21;
                f29 = 0.8f;
                f38 = 10.0f;
                f12 = 0.5f;
            }
            i16 = i31;
            canvas2.restore();
        } else {
            int i40 = i15;
            float f61 = f14;
            i16 = i31;
            if (i34 != i40) {
                boolean z14 = b1Var.g1 > 0.5f;
                float O02 = z14 ? b1Var.O0() : 1.0f;
                boolean z15 = z14 && O02 < 1.0f;
                if (z15) {
                    float f62 = 1.0f - O02;
                    float lerp6 = AndroidUtilities.lerp(0.75f, 1.0f, org.telegram.ui.Cells.t0.z(f62, f62, f62, 1.0f));
                    canvas2.save();
                    canvas2.scale(lerp6, lerp6, rectF2.centerX(), b1Var.j1 + f15);
                    b1Var.invalidate();
                }
                boolean f02 = b1Var.f0();
                ArrayList arrayList3 = b1Var.v1;
                if (f02) {
                    float centerX2 = rectF2.centerX();
                    float dp9 = AndroidUtilities.dp(99.0f);
                    Typeface bold = AndroidUtilities.bold();
                    TextPaint textPaint = b1Var.K7;
                    textPaint.setTypeface(bold);
                    textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                    Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
                    arrayList = arrayList3;
                    int width2 = (int) (rectF2.width() - AndroidUtilities.dp(32.0f));
                    z10 = z14;
                    rectF = rectF3;
                    boolean z16 = b1Var.w1 > 0;
                    boolean z17 = !z16;
                    StaticLayout staticLayout = b1Var.P7;
                    boolean z18 = z16;
                    TextPaint textPaint2 = b1Var.L7;
                    if (staticLayout == null || b1Var.Q7 != width2 || b1Var.R7 != z17) {
                        b1Var.Q7 = width2;
                        b1Var.R7 = z17;
                        textPaint2.setTextSize(AndroidUtilities.dp(14.0f));
                        Paint.FontMetrics fontMetrics2 = textPaint2.getFontMetrics();
                        b1Var.P7 = new StaticLayout(LocaleController.getString(!z18 ? R.string.QrChatNoCollectibles : R.string.QrNoGiftsInfo), textPaint2, width2, Layout.Alignment.ALIGN_CENTER, 1.0f, AndroidUtilities.dp(18.5f) - (fontMetrics2.descent - fontMetrics2.ascent), false);
                    }
                    float z19 = a6.z(AndroidUtilities.dp(300.0f), ((((fontMetrics.descent - fontMetrics.ascent) + (AndroidUtilities.dp(22.0f) + dp9)) + AndroidUtilities.dp(7.0f)) + b1Var.P7.getHeight()) + (b1Var.w1 > 0 ? AndroidUtilities.dp(36.0f) + AndroidUtilities.dp(20.0f) : 0), 2.0f, f61) - AndroidUtilities.dp(8.0f);
                    TLRPC.Document document2 = b1Var.Z7;
                    int i41 = b1Var.b;
                    if (document2 != null) {
                        f23 = z19;
                        document = document2;
                        f24 = clamp012;
                        f16 = f61;
                        f22 = 7.0f;
                    } else {
                        if (b1Var.Y7 == null) {
                            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                            b1Var.Y7 = tL_inputStickerSetShortName;
                            f22 = 7.0f;
                            tL_inputStickerSetShortName.short_name = "Redo_edc21keMa";
                        } else {
                            f22 = 7.0f;
                        }
                        if (b1Var.X7) {
                            f23 = z19;
                            f24 = clamp012;
                            f16 = f61;
                            document = null;
                        } else {
                            b1Var.X7 = true;
                            f23 = z19;
                            f24 = clamp012;
                            f16 = f61;
                            TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i41).getStickerSet(b1Var.Y7, null, false, new m(b1Var, 4));
                            if (stickerSet != null && (arrayList2 = stickerSet.documents) != null && !arrayList2.isEmpty()) {
                                b1Var.Z7 = stickerSet.documents.get(0);
                            }
                            document = b1Var.Z7;
                            if (document == null) {
                                r5 r5Var2 = b1Var.U7;
                                f25 = f15;
                                if (r5Var2 == null || b1Var.W7 != document.id) {
                                    if (r5Var2 != null) {
                                        r5Var2.o(b1Var);
                                    }
                                    r5 m10 = r5.m(i41, 14, document);
                                    b1Var.U7 = m10;
                                    m10.a(b1Var);
                                    b1Var.W7 = document.id;
                                    b1Var.a8 = 0L;
                                }
                            } else {
                                f25 = f15;
                            }
                            r5 r5Var3 = b1Var.U7;
                            g3Var = r5Var3 == null ? r5Var3.k : null;
                            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                            if (g3Var == null && g3Var.hasBitmapImage()) {
                                j10 = 0;
                                if (b1Var.a8 == 0) {
                                    b1Var.a8 = currentAnimationTimeMillis;
                                }
                            } else {
                                j10 = 0;
                            }
                            float min6 = b1Var.a8 != j10 ? 0.0f : Math.min(1.0f, (currentAnimationTimeMillis - r2) / 250.0f);
                            B = a6.B(min6, 2.0f, 3.0f, min6 * min6);
                            clamp01 = b1Var.g1 <= 0.5f ? Utilities.clamp01(b1Var.O0() / 0.7f) : 1.0f;
                            float f63 = 1.0f - clamp01;
                            float z20 = org.telegram.ui.Cells.t0.z(f63, f63, f63, 1.0f);
                            float lerp7 = AndroidUtilities.lerp(0.95f, 1.0f, z20);
                            if (clamp01 < 1.0f) {
                                b1Var.invalidate();
                            }
                            canvas2.save();
                            canvas2.translate(0.0f, (1.0f - z20) * AndroidUtilities.dp(6.0f));
                            f26 = dp9 / 2.0f;
                            canvas2.scale(lerp7, lerp7, centerX2, (f23 - AndroidUtilities.dp(2.0f)) + f26);
                            if (B >= 1.0f) {
                                if (b1Var.V7 == null) {
                                    int i42 = (int) dp9;
                                    uj0 uj0Var = new uj0(R.raw.qr_resistance_dog, i42, i42, true, null);
                                    b1Var.V7 = uj0Var;
                                    uj0Var.K(1);
                                    b1Var.V7.J(true);
                                    b1Var.V7.R(b1Var);
                                    b1Var.V7.setCallback(b1Var);
                                    b1Var.V7.start();
                                }
                                if (b1Var.V7.u()) {
                                    f27 = dp9;
                                    b1Var.V7.setBounds((int) (centerX2 - f26), (int) (f23 - AndroidUtilities.dp(2.0f)), (int) (centerX2 + f26), (int) ((f23 - AndroidUtilities.dp(2.0f)) + f27));
                                    b1Var.V7.setAlpha((int) ((1.0f - B) * f24 * 255.0f));
                                    b1Var.V7.draw(canvas2);
                                } else {
                                    f27 = dp9;
                                }
                                b1Var.invalidate();
                            } else {
                                f27 = dp9;
                                uj0 uj0Var2 = b1Var.V7;
                                if (uj0Var2 != null) {
                                    uj0Var2.C(false);
                                    b1Var.V7 = null;
                                }
                            }
                            r5Var = b1Var.U7;
                            if (r5Var != null && B > 0.0f) {
                                r5Var.setBounds((int) (centerX2 - f26), (int) (f23 - AndroidUtilities.dp(2.0f)), (int) (f26 + centerX2), (int) ((f23 - AndroidUtilities.dp(2.0f)) + f27));
                                b1Var.U7.setAlpha((int) (f24 * 255.0f * B));
                                b1Var.U7.draw(canvas2);
                            }
                            canvas2.restore();
                            textPaint.setColor(-1);
                            int i43 = (int) (f24 * 255.0f);
                            textPaint.setAlpha(i43);
                            Paint.FontMetrics fontMetrics3 = textPaint.getFontMetrics();
                            float dp10 = ((f23 + f27) + AndroidUtilities.dp(18.0f)) - fontMetrics3.ascent;
                            String str = b1Var.S7;
                            canvas2.drawText(str, centerX2 - (textPaint.measureText(str) / 2.0f), dp10, textPaint);
                            textPaint2.setColor(-1);
                            textPaint2.setAlpha((int) (191.0f * f24));
                            float dp11 = dp10 + fontMetrics3.descent + AndroidUtilities.dp(f22);
                            canvas2.save();
                            canvas2.translate(centerX2 - (b1Var.P7.getWidth() / 2.0f), dp11);
                            b1Var.P7.draw(canvas2);
                            canvas2.restore();
                            j11 = b1Var.w1;
                            RectF rectF6 = b1Var.J7;
                            if (j11 <= 0) {
                                float height = dp11 + b1Var.P7.getHeight() + AndroidUtilities.dp(20.0f);
                                Typeface bold2 = AndroidUtilities.bold();
                                TextPaint textPaint3 = b1Var.M7;
                                textPaint3.setTypeface(bold2);
                                textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
                                String str2 = b1Var.T7;
                                float measureText = textPaint3.measureText(str2) + (AndroidUtilities.dp(19.0f) * 2);
                                float dp12 = AndroidUtilities.dp(36.0f);
                                float f64 = measureText / 2.0f;
                                rectF6.set(centerX2 - f64, height, f64 + centerX2, height + dp12);
                                f17 = f25;
                                int saveLayer = canvas2.saveLayer(rectF6.left - 1.0f, rectF6.top - 1.0f, rectF6.right + 1.0f, rectF6.bottom + 1.0f, null);
                                paint.setColor(-1);
                                paint.setAlpha(i43);
                                float f65 = dp12 / 2.0f;
                                canvas2.drawRoundRect(rectF6, f65, f65, paint);
                                b1Var.K(canvas2, 10, rectF6, true);
                                Typeface bold3 = AndroidUtilities.bold();
                                TextPaint textPaint4 = b1Var.O7;
                                textPaint4.setTypeface(bold3);
                                textPaint4.setTextSize(AndroidUtilities.dp(14.0f));
                                Paint.FontMetrics fontMetrics4 = textPaint4.getFontMetrics();
                                canvas2.drawText(str2, centerX2 - (textPaint4.measureText(str2) / 2.0f), rectF6.centerY() - ((fontMetrics4.ascent + fontMetrics4.descent) / 2.0f), textPaint4);
                                canvas2.restoreToCount(saveLayer);
                                if (b1Var.N7 == null) {
                                    TextPaint textPaint5 = new TextPaint(1);
                                    b1Var.N7 = textPaint5;
                                    textPaint5.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.MULTIPLY));
                                }
                                b1Var.N7.setTypeface(AndroidUtilities.bold());
                                b1Var.N7.setTextSize(AndroidUtilities.dp(14.0f));
                                z0 z0Var3 = b1Var.n;
                                b1Var.N7.setColor(z0(0.9f, 1.4f, 0.1f, z0Var3 != null ? i0.b.f(0.5f, z0Var3.b, z0Var3.c) : -8355712));
                                b1Var.N7.setAlpha(i43);
                                canvas2.drawText(str2, centerX2 - (b1Var.N7.measureText(str2) / 2.0f), rectF6.centerY() - ((fontMetrics4.ascent + fontMetrics4.descent) / 2.0f), b1Var.N7);
                            } else {
                                f17 = f25;
                                rectF6.setEmpty();
                            }
                        }
                    }
                    if (document == null) {
                    }
                    r5 r5Var32 = b1Var.U7;
                    if (r5Var32 == null) {
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    if (g3Var == null) {
                    }
                    j10 = 0;
                    if (b1Var.a8 != j10) {
                    }
                    B = a6.B(min6, 2.0f, 3.0f, min6 * min6);
                    if (b1Var.g1 <= 0.5f) {
                    }
                    float f632 = 1.0f - clamp01;
                    float z202 = org.telegram.ui.Cells.t0.z(f632, f632, f632, 1.0f);
                    float lerp72 = AndroidUtilities.lerp(0.95f, 1.0f, z202);
                    if (clamp01 < 1.0f) {
                    }
                    canvas2.save();
                    canvas2.translate(0.0f, (1.0f - z202) * AndroidUtilities.dp(6.0f));
                    f26 = dp9 / 2.0f;
                    canvas2.scale(lerp72, lerp72, centerX2, (f23 - AndroidUtilities.dp(2.0f)) + f26);
                    if (B >= 1.0f) {
                    }
                    r5Var = b1Var.U7;
                    if (r5Var != null) {
                        r5Var.setBounds((int) (centerX2 - f26), (int) (f23 - AndroidUtilities.dp(2.0f)), (int) (f26 + centerX2), (int) ((f23 - AndroidUtilities.dp(2.0f)) + f27));
                        b1Var.U7.setAlpha((int) (f24 * 255.0f * B));
                        b1Var.U7.draw(canvas2);
                    }
                    canvas2.restore();
                    textPaint.setColor(-1);
                    int i432 = (int) (f24 * 255.0f);
                    textPaint.setAlpha(i432);
                    Paint.FontMetrics fontMetrics32 = textPaint.getFontMetrics();
                    float dp102 = ((f23 + f27) + AndroidUtilities.dp(18.0f)) - fontMetrics32.ascent;
                    String str3 = b1Var.S7;
                    canvas2.drawText(str3, centerX2 - (textPaint.measureText(str3) / 2.0f), dp102, textPaint);
                    textPaint2.setColor(-1);
                    textPaint2.setAlpha((int) (191.0f * f24));
                    float dp112 = dp102 + fontMetrics32.descent + AndroidUtilities.dp(f22);
                    canvas2.save();
                    canvas2.translate(centerX2 - (b1Var.P7.getWidth() / 2.0f), dp112);
                    b1Var.P7.draw(canvas2);
                    canvas2.restore();
                    j11 = b1Var.w1;
                    RectF rectF62 = b1Var.J7;
                    if (j11 <= 0) {
                    }
                } else {
                    arrayList = arrayList3;
                    f16 = f61;
                    f17 = f15;
                    z10 = z14;
                    rectF = rectF3;
                    if (arrayList.isEmpty()) {
                        TextPaint textPaint6 = b1Var.E1;
                        textPaint6.setColor(-1275068417);
                        textPaint6.setTextSize(AndroidUtilities.dp(14.0f));
                        String string = LocaleController.getString(!b1Var.x1 ? R.string.QrLoadingGifts : b1Var.w1 < 0 ? R.string.QrChatNoCollectibles : R.string.QrNoCollectibles);
                        canvas2.drawText(string, (f36 - textPaint6.measureText(string)) / 2.0f, dp6 + AndroidUtilities.dp(40.0f), textPaint6);
                    }
                }
                int d02 = b1Var.d0();
                int size = arrayList.size();
                float width3 = (rectF2.width() - AndroidUtilities.dp(8.0f)) / 3.0f;
                float f66 = d02;
                float width4 = (rectF2.width() - AndroidUtilities.dp(8.0f)) / f66;
                float f67 = dp6 + 0.0f;
                b1Var.W5 = false;
                b1Var.O5 = 0;
                int max4 = (int) Math.max(0.0d, Math.floor(((f16 + b1Var.j1) - f67) / width3));
                b1Var.M5 = max4;
                int max5 = (int) Math.max(max4, Math.floor(((f17 + b1Var.j1) - f67) / width3));
                b1Var.N5 = max5;
                int i44 = (max5 - b1Var.M5) + 1;
                boolean z21 = b1Var.g1 < 0.5f;
                b1Var.L5 = z21;
                if (z21) {
                    b1Var.Q5 = AnimationUtils.currentAnimationTimeMillis() - b1Var.J5;
                    b1Var.P5 = Math.min(25.0f, 60.0f / Math.max(1, r1));
                    b1Var.R5 = 0.6f;
                    b1Var.S5 = AndroidUtilities.dp(4.0f);
                } else {
                    float currentAnimationTimeMillis3 = !b1Var.K5 ? 0.0f : AnimationUtils.currentAnimationTimeMillis() - b1Var.I5;
                    b1Var.Q5 = currentAnimationTimeMillis3;
                    if (currentAnimationTimeMillis3 > 470.0f) {
                        b1Var.Q5 = -1.0f;
                        if (z10) {
                            b1Var.Q5 = -1.0f;
                        }
                        i17 = 0;
                        while (i17 < size) {
                            float f68 = i17 % d02;
                            float dp13 = (width4 * f68) + rectF2.left + AndroidUtilities.dp(4.0f);
                            float f69 = ((i17 / d02) * width3) + f67;
                            float f70 = b1Var.j1;
                            if (f69 - f70 <= f17) {
                                float f71 = f69 + width3;
                                if (f71 - f70 >= f16) {
                                    b1Var.V5 = 1.0f;
                                    if (b1Var.Q5 < 0.0f) {
                                        f18 = 1.0f;
                                    } else {
                                        if (b1Var.L5) {
                                            float clamp015 = Utilities.clamp01((b1Var.Q5 - ((f68 * 3.0f) + (Math.max(0, r1 - b1Var.M5) * b1Var.P5))) / 90.0f);
                                            f18 = 1.0f;
                                            b1Var.V5 = AndroidUtilities.lerp(1.0f, b1Var.R5, clamp015 * clamp015);
                                            if (clamp015 >= 0.7f) {
                                                f19 = org.telegram.messenger.q.x(clamp015, 0.7f, 0.3f, 1.0f);
                                            }
                                        } else {
                                            float clamp016 = Utilities.clamp01((b1Var.Q5 - ((f68 * 4.0f) + (Math.max(0, b1Var.N5 - r1) * b1Var.P5))) / 220.0f);
                                            float f72 = b1Var.R5;
                                            if (b1Var.W5) {
                                                z11 = R(clamp016, 1.2f);
                                                f18 = 1.0f;
                                            } else {
                                                f18 = 1.0f;
                                                float f73 = 1.0f - clamp016;
                                                z11 = org.telegram.ui.Cells.t0.z(f73, f73, f73, 1.0f);
                                            }
                                            b1Var.V5 = AndroidUtilities.lerp(f72, f18, z11);
                                            float clamp017 = f18 - Utilities.clamp01(clamp016 / f7);
                                            f19 = f18 - (clamp017 * clamp017);
                                        }
                                        z12 = f19 >= f18 || b1Var.V5 != f18;
                                        if (z12) {
                                            canvas2.save();
                                            float f74 = f18;
                                            canvas2.translate(0.0f, Utilities.clamp01((f74 - b1Var.V5) / (f74 - b1Var.R5)) * b1Var.S5);
                                            float f75 = b1Var.V5;
                                            canvas2.scale(f75, f75, (width4 / 2.0f) + dp13, (width3 / 2.0f) + f69);
                                            if (f19 < f18) {
                                                float f76 = dp13 + width4;
                                                int i45 = b1Var.O5;
                                                if (i45 < 64) {
                                                    b1Var.O5 = i45 + 1;
                                                    int i46 = i45 * 5;
                                                    float[] fArr2 = b1Var.T5;
                                                    fArr2[i46] = dp13;
                                                    fArr2[i46 + 1] = f69;
                                                    fArr2[i46 + 2] = f76;
                                                    fArr2[i46 + 3] = f71;
                                                    fArr2[i46 + 4] = f19;
                                                }
                                            }
                                        }
                                        if (z15) {
                                            f20 = 1.0f;
                                            f21 = 1.0f;
                                        } else {
                                            f20 = 1.0f;
                                            float clamp018 = 1.0f - Utilities.clamp01(((420.0f * O02) - (Math.max(0.0f, Math.min(10.0f, ((f69 - b1Var.j1) - f16) / width3)) * 12.0f)) / 300.0f);
                                            f21 = ((1.0f - ((clamp018 * clamp018) * clamp018)) * 0.18f) + 0.82f;
                                        }
                                        if (f21 == f20) {
                                            canvas2.save();
                                            canvas2.scale(f21, f21, (width4 / 2.0f) + dp13, (width3 / 2.0f) + f69);
                                        }
                                        ArrayList arrayList4 = arrayList;
                                        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList4.get(i17);
                                        float dp14 = dp13 + AndroidUtilities.dp(4.0f);
                                        float dp15 = f69 + AndroidUtilities.dp(4.0f);
                                        float dp16 = width4 - AndroidUtilities.dp(8.0f);
                                        float dp17 = width3 - AndroidUtilities.dp(8.0f);
                                        y0Var = b1Var.F;
                                        arrayList = arrayList4;
                                        i19 = d02;
                                        i20 = i14;
                                        if (y0Var.a == i20) {
                                            int i47 = y0Var.j;
                                        }
                                        b1 b1Var3 = b1Var;
                                        b1Var3.G(canvas, i17, tL_starGiftUnique, dp14, dp15, dp16, dp17);
                                        b1Var = b1Var3;
                                        if (f21 != f20) {
                                            canvas.restore();
                                        }
                                        if (!z12) {
                                            canvas.restore();
                                        }
                                        i17++;
                                        canvas2 = canvas;
                                        i14 = i20;
                                        d02 = i19;
                                    }
                                    f19 = f18;
                                    if (f19 >= f18) {
                                    }
                                    if (z12) {
                                    }
                                    if (z15) {
                                    }
                                    if (f21 == f20) {
                                    }
                                    ArrayList arrayList42 = arrayList;
                                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList42.get(i17);
                                    float dp142 = dp13 + AndroidUtilities.dp(4.0f);
                                    float dp152 = f69 + AndroidUtilities.dp(4.0f);
                                    float dp162 = width4 - AndroidUtilities.dp(8.0f);
                                    float dp172 = width3 - AndroidUtilities.dp(8.0f);
                                    y0Var = b1Var.F;
                                    arrayList = arrayList42;
                                    i19 = d02;
                                    i20 = i14;
                                    if (y0Var.a == i20) {
                                    }
                                    b1 b1Var32 = b1Var;
                                    b1Var32.G(canvas, i17, tL_starGiftUnique2, dp142, dp152, dp162, dp172);
                                    b1Var = b1Var32;
                                    if (f21 != f20) {
                                    }
                                    if (!z12) {
                                    }
                                    i17++;
                                    canvas2 = canvas;
                                    i14 = i20;
                                    d02 = i19;
                                }
                            }
                            i19 = d02;
                            i20 = i14;
                            i17++;
                            canvas2 = canvas;
                            i14 = i20;
                            d02 = i19;
                        }
                        for (i18 = 0; i18 < b1Var.O5; i18++) {
                            int i48 = i18 * 5;
                            float[] fArr3 = b1Var.T5;
                            int i49 = (int) (fArr3[i48 + 4] * 255.0f);
                            Paint paint3 = b1Var.U5;
                            paint3.setAlpha(i49);
                            canvas.drawRect(fArr3[i48], fArr3[i48 + 1], fArr3[i48 + 2], fArr3[i48 + 3], paint3);
                        }
                        b1Var.O5 = 0;
                        if (z15) {
                            canvas.restore();
                        }
                        canvas.restore();
                        if (i33 != 0) {
                            float dp18 = AndroidUtilities.dp(12.0f);
                            Matrix matrix3 = b1Var.m7;
                            matrix3.setScale(1.0f, dp18);
                            RectF rectF7 = rectF;
                            matrix3.postTranslate(0.0f, rectF7.top);
                            b1Var.k7.setLocalMatrix(matrix3);
                            float f77 = rectF7.left;
                            float f78 = rectF7.top;
                            canvas.drawRect(f77, f78, rectF7.right, f78 + dp18, b1Var.l7);
                            matrix3.setScale(1.0f, -dp18);
                            matrix3.postTranslate(0.0f, rectF7.bottom);
                            b1Var.k7.setLocalMatrix(matrix3);
                            float f79 = rectF7.left;
                            float f80 = rectF7.bottom;
                            canvas.drawRect(f79, f80 - dp18, rectF7.right, f80, b1Var.l7);
                            canvas.restore();
                        }
                        canvas.restore();
                        if (i16 != 0) {
                            canvas.restore();
                            return;
                        }
                        return;
                    }
                    b1Var.P5 = Math.min(45.0f, (250.0f - (f66 * 4.0f)) / Math.max(1, i44));
                    b1Var.R5 = 0.7f;
                    b1Var.S5 = AndroidUtilities.dp(7.0f);
                }
                b1Var.invalidate();
                if (z10) {
                }
                i17 = 0;
                while (i17 < size) {
                }
                while (i18 < b1Var.O5) {
                }
                b1Var.O5 = 0;
                if (z15) {
                }
                canvas.restore();
                if (i33 != 0) {
                }
                canvas.restore();
                if (i16 != 0) {
                }
            }
        }
        rectF = rectF3;
        canvas.restore();
        if (i33 != 0) {
        }
        canvas.restore();
        if (i16 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        if (r11 == null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap M0() {
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
                    uj0 uj0Var = this.Z1;
                    if (uj0Var.b > 0) {
                        try {
                            rLottieNative = RLottieNative.b(AndroidUtilities.readRes(R.raw.plane_logo_plain), null, null, null);
                            if (rLottieNative != null) {
                                try {
                                    Bitmap createBitmap2 = Bitmap.createBitmap(uj0Var.b, uj0Var.c, config);
                                    rLottieNative.c(Math.min(33, rLottieNative.a[0] - 1), createBitmap2, true);
                                    this.R2 = createBitmap2;
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
                x(canvas, width, height);
                this.T2 = true;
                y(canvas, width);
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

    public final void N(Canvas canvas, float f7, float f10, float f11, int i10, boolean z10) {
        PorterDuffColorFilter g12 = g1(i10);
        k5 k5Var = this.V1;
        k5Var.setColorFilter(g12);
        k5Var.setAlpha(255);
        float f12 = f11 / 2.0f;
        float f13 = f10 - f12;
        float f14 = f7 + f11;
        float f15 = f10 + f12;
        k5Var.setBounds((int) f7, (int) f13, (int) f14, (int) f15);
        if (!z10) {
            k5Var.draw(canvas);
            return;
        }
        float f16 = f11 * 0.095f;
        float f17 = (0.28f * f11) + f7;
        float f18 = f10 - (0.21f * f11);
        float f19 = (0.74f * f11) + f7;
        float f20 = (0.25f * f11) + f10;
        RectF rectF = this.B5;
        rectF.set(f7 - AndroidUtilities.dp(2.0f), f13 - AndroidUtilities.dp(2.0f), f14 + AndroidUtilities.dp(2.0f), f15 + AndroidUtilities.dp(2.0f));
        canvas.saveLayer(rectF, null);
        k5Var.draw(canvas);
        Paint paint = this.a2;
        paint.setStrokeWidth((0.065f * f11 * 2.0f) + f16);
        canvas.drawLine(f17, f18, f19, f20, paint);
        canvas.restore();
        Paint paint2 = this.C1;
        paint2.setColor(i10);
        paint2.setStrokeWidth(f16);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawLine(f17, f18, f19, f20, paint2);
        paint2.setStrokeCap(Paint.Cap.BUTT);
    }

    public final void N0(String str) {
        if (this.v0) {
            this.t2 = this.L0.c() + AndroidUtilities.dp(2.0f) + AndroidUtilities.dp(12.0f) + AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(11.0f);
            this.v0 = false;
            this.A0 = false;
            this.s2 = this.B0 * this.G0 > 0.001f;
            this.q2 = AnimationUtils.currentAnimationTimeMillis();
            this.C0 = this.B0;
            this.D0 = 0.0f;
            this.E0 = System.currentTimeMillis();
            g gVar = this.t0;
            if (gVar != null) {
                c1(gVar);
            }
            n1(true);
            if (str != null) {
                W0(0, str, null);
            }
            g0();
            this.e = null;
            this.u0 = null;
            u3.c cVar = this.c;
            if (cVar != null) {
                cVar.i(0);
            }
        }
    }

    public final void O(Canvas canvas, float f7, float f10, float f11, float f12) {
        if (this.p1 == null || f12 <= 0.004f) {
            return;
        }
        float dp = AndroidUtilities.dp(15.0f);
        TextPaint textPaint = this.y2;
        textPaint.setTextSize(dp);
        textPaint.setColor(-1);
        textPaint.setAlpha((int) (f12 * 255.0f));
        canvas.drawText(this.p1, ((f7 + f11) - AndroidUtilities.dp(16.0f)) - textPaint.measureText(this.p1), f10 + AndroidUtilities.dp(5.0f), textPaint);
        textPaint.setAlpha(255);
    }

    public final float O0() {
        if (this.g1 < 0.5f) {
            return 1.0f;
        }
        return Utilities.clamp01((AnimationUtils.currentAnimationTimeMillis() - this.I2) / 420.0f);
    }

    public final void P(float f7, float f10, float f11, Canvas canvas, boolean z10) {
        Canvas canvas2;
        float f12;
        float f13;
        if (this.G8 == 0) {
            canvas2 = canvas;
            uj0 k12 = k1();
            int dp = AndroidUtilities.dp(27.0f);
            float f14 = dp / 2.0f;
            int i10 = (int) (f10 - f14);
            k12.setBounds((int) ((AndroidUtilities.dp(26.0f) + f7) - f14), i10, ((int) ((AndroidUtilities.dp(26.0f) + f7) - f14)) + dp, dp + i10);
            k12.draw(canvas2);
        } else if (z10) {
            float dp2 = f10 - AndroidUtilities.dp(10.0f);
            Paint.Style style = Paint.Style.STROKE;
            Paint paint = this.B8;
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
                float z11 = org.telegram.ui.Cells.t0.z(clamp01, clamp01, clamp01, 1.0f);
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
            RectF rectF = this.C8;
            rectF.set(dp3 - dp5, f17, dp3 + dp5, dp5 + dp4);
            canvas.drawArc(rectF, -82.0f, f15 * 344.0f, false, paint);
            canvas.drawLine(dp3, f17, dp3, dp2 + AndroidUtilities.dp(2.2f), paint);
            double radians = Math.toRadians(f12 - 90.0f);
            canvas2 = canvas;
            canvas2.drawLine(dp3, dp4, org.telegram.ui.Cells.t0.b(3.8f, (float) Math.cos(radians), dp3), org.telegram.ui.Cells.t0.b(3.8f, (float) Math.sin(radians), dp4), paint);
            paint.setStyle(Paint.Style.FILL);
            canvas2.drawCircle(dp3, dp4, AndroidUtilities.dpf2(1.2f), paint);
        } else {
            canvas2 = canvas;
            if (n()) {
                uj0 i12 = i1();
                int dp6 = AndroidUtilities.dp(28.0f);
                float f18 = dp6 / 2.0f;
                int i11 = (int) (f10 - f18);
                i12.setBounds((int) ((AndroidUtilities.dp(26.0f) + f7) - f18), i11, ((int) ((AndroidUtilities.dp(26.0f) + f7) - f18)) + dp6, dp6 + i11);
                i12.draw(canvas2);
            } else {
                int i13 = this.G8;
                if (i13 == R.drawable.msg_download) {
                    uj0 j12 = j1();
                    int dp7 = AndroidUtilities.dp(28.0f);
                    float f19 = dp7 / 2.0f;
                    int i14 = (int) (f10 - f19);
                    j12.setBounds((int) ((AndroidUtilities.dp(26.0f) + f7) - f19), i14, ((int) ((AndroidUtilities.dp(26.0f) + f7) - f19)) + dp7, dp7 + i14);
                    j12.draw(canvas2);
                } else {
                    m0(canvas2, i13 == R.drawable.msg_retry ? this.T1 : i13 == R.drawable.msg_copy ? this.L1 : this.U1, f7 + AndroidUtilities.dp(26.0f), f10, AndroidUtilities.dp(20.0f), 1.0f);
                    canvas2 = canvas2;
                }
            }
        }
        TextPaint textPaint = this.E1;
        textPaint.setColor(-1);
        float f20 = this.s1;
        if (f20 <= 0.0f) {
            f20 = AndroidUtilities.dp(15.0f);
        }
        textPaint.setTextSize(f20);
        String str = this.E8;
        float dp8 = f7 + AndroidUtilities.dp(48.0f);
        float dp9 = AndroidUtilities.dp(5.0f) + f10;
        int indexOf = str.indexOf(10);
        if (indexOf >= 0) {
            canvas2.drawText(str, 0, indexOf, dp8, dp9 - AndroidUtilities.dp(9.0f), (Paint) textPaint);
            canvas.drawText(str, indexOf + 1, str.length(), dp8, dp9 + AndroidUtilities.dp(9.0f), (Paint) textPaint);
            return;
        }
        if (!o0(str)) {
            canvas2.drawText(str, dp8, dp9, textPaint);
            return;
        }
        float textSize = textPaint.getTextSize();
        TextPaint textPaint2 = this.y2;
        textPaint2.setTextSize(textSize);
        textPaint2.setColor(textPaint.getColor());
        canvas2.drawText(this.v2, dp8, dp9, textPaint);
        float measureText = textPaint.measureText(this.v2) + dp8;
        canvas2.drawText(this.w2, measureText, dp9, textPaint2);
        canvas2.drawText(this.x2, textPaint2.measureText(this.w2) + measureText, dp9, textPaint);
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x03d8, code lost:
    
        if (r2.a0 < (r2.e[0] - 1)) goto L207;
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x045c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q(Canvas canvas, int i10, long j10) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float max;
        float f15;
        float f16;
        float h;
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
        boolean z14 = this.Q8 || (this.m1 != null && j10 < this.u1);
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (!this.Q8 && z14 && this.x8 && (str = this.E8) != null && !str.equals(this.m1)) {
            this.x8 = false;
            this.w8 = currentAnimationTimeMillis;
        }
        if (!z14 || this.x8) {
            if (!z14 && this.x8) {
                this.x8 = false;
                this.w8 = currentAnimationTimeMillis;
            }
        } else if (this.E8 == null || currentAnimationTimeMillis - this.w8 >= 360) {
            this.x8 = true;
            this.w8 = currentAnimationTimeMillis;
            this.E8 = this.m1;
            int i11 = this.n1;
            this.G8 = i11;
            this.p1 = this.o1;
            this.F8 = false;
            this.H8 = currentAnimationTimeMillis;
            if (i11 == 0) {
                uj0 k12 = k1();
                k12.N(0, false, false);
                k12.start();
            } else if (n()) {
                uj0 i12 = i1();
                i12.N(0, false, false);
                i12.start();
            } else if (this.G8 == R.drawable.msg_download) {
                uj0 j12 = j1();
                j12.N(0, false, false);
                j12.start();
            }
        }
        String str2 = this.E8;
        if (str2 == null) {
            return;
        }
        float f19 = (currentAnimationTimeMillis - this.w8) / 1000.0f;
        if (this.x8) {
            boolean z15 = str2.indexOf(10) >= 0 || l1(this.E8) + ((float) AndroidUtilities.dp(66.0f)) >= ((float) (i10 - AndroidUtilities.dp(32.0f)));
            if (f19 >= 0.5f) {
                f11 = 1.0f;
                f18 = 3.0f;
                f7 = 2.0f;
            } else {
                f18 = 3.0f;
                f7 = 2.0f;
                f11 = (float) a1(f19, z15 ? 0.75d : 0.6d, 0.42d);
            }
            f10 = f18;
        } else {
            f7 = 2.0f;
            if (!this.F8) {
                if (f19 >= 0.36f) {
                    this.E8 = null;
                    return;
                }
                float f20 = f19 / 0.36f;
                float f21 = f20;
                f10 = 3.0f;
                float f22 = 0.0f;
                float f23 = 1.0f;
                for (int i13 = 0; i13 < 12; i13++) {
                    f21 = (f22 + f23) / 2.0f;
                    float f24 = 1.0f - f21;
                    float f25 = f24 * 3.0f;
                    if (a6.t(f21, f21, f21, (f25 * f21 * f21 * 0.9f) + a6.C(f25, f24, f21, 0.5f)) < f20) {
                        f22 = f21;
                    } else {
                        f23 = f21;
                    }
                }
                f11 = 1.0f - (((f21 * f21) * f21) + (((((1.0f - f21) * 3.0f) * f21) * f21) * 0.5f));
            } else if (f19 >= 0.14f) {
                this.E8 = null;
                this.F8 = false;
                return;
            } else {
                f10 = 3.0f;
                f11 = -1.0f;
            }
        }
        if (this.x8 || f11 > 0.0f) {
            invalidate();
        }
        boolean z16 = this.E8.indexOf(10) >= 0;
        float dp3 = AndroidUtilities.dp(z16 ? 14.0f : 15.0f);
        TextPaint textPaint = this.E1;
        textPaint.setTextSize(dp3);
        float l1 = l1(this.E8);
        if (this.p1 != null) {
            float dp4 = AndroidUtilities.dp(15.0f);
            f12 = 14.0f;
            TextPaint textPaint2 = this.y2;
            textPaint2.setTextSize(dp4);
            f13 = textPaint2.measureText(this.p1) + AndroidUtilities.dp(16.0f);
        } else {
            f12 = 14.0f;
            f13 = 0.0f;
        }
        float min = Math.min(i10 - AndroidUtilities.dp(32.0f), AndroidUtilities.dp(66.0f) + l1 + f13);
        float dp5 = AndroidUtilities.dp(z16 ? 56.0f : 44.0f);
        float dp6 = (min - AndroidUtilities.dp(66.0f)) - f13;
        this.s1 = textPaint.getTextSize() * ((l1 <= dp6 || l1 <= 0.0f) ? 1.0f : Math.max(0.8f, dp6 / l1));
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
                max2 = Z0(0.15f, 1.0f, max2);
            }
            f15 = (f26 * max2) + max;
        }
        float z18 = z17 ? org.telegram.ui.Cells.t0.z(clamp01, clamp01, clamp01, 1.0f) : 1.0f;
        if (max < 0.5f) {
            return;
        }
        float f27 = i10 / f7;
        if (this.f1 > 0.001f) {
            f16 = 0.15f;
            h = T0() - (Utilities.clamp01(this.f1) * U0());
            dp = AndroidUtilities.dp(12.0f);
        } else {
            f16 = 0.15f;
            h = h() - AndroidUtilities.dp(20.0f);
            dp = AndroidUtilities.dp(f12);
        }
        float f28 = this.Q8 ? this.P8 : (h - dp) - (dp5 / f7);
        float f29 = f15 / f7;
        float f30 = max / f7;
        boolean z19 = z17;
        RectF rectF = this.v8;
        rectF.set(f27 - f29, f28 - f30, f29 + f27, f28 + f30);
        float min2 = Math.min(f30, AndroidUtilities.dp(24.0f));
        Path path2 = this.G1;
        path2.rewind();
        path2.addRoundRect(rectF, min2, min2, Path.Direction.CW);
        this.D8 = 352321535;
        this.h6 = true;
        H(canvas, rectF, min2, z18);
        this.D8 = 0;
        this.h6 = false;
        float Z0 = z19 ? 1.0f : Z0(0.2f, 0.95f, f11);
        float clamp012 = z19 ? 1.0f - Utilities.clamp01(f19 / 0.05f) : Z0(0.08f, 0.5f, f11);
        if (clamp012 <= 0.004f) {
            return;
        }
        boolean z20 = this.x8;
        float f31 = z20 ? (currentAnimationTimeMillis - this.H8) / 1000.0f : -1.0f;
        float clamp013 = z20 ? Utilities.clamp01((f19 - f16) / 0.23f) : 1.0f;
        float B = a6.B(clamp013, f7, f10, clamp012 * clamp013 * clamp013);
        if (this.x8 && clamp013 < 1.0f) {
            invalidate();
        }
        int i14 = this.G8;
        if (i14 == R.drawable.msg_recent || (i14 == R.drawable.msg_retry && o0(this.E8))) {
            path = path2;
            z10 = true;
        } else {
            path = path2;
            z10 = false;
        }
        float x10 = this.x8 ? a6.x(1.0f, Z0, 0.35f, 1.0f) : Math.max(0.05f, Math.min(1.0f, f15 / min));
        canvas.save();
        canvas.clipPath(path);
        canvas.scale(x10, x10, f27, f28);
        if (b0.f() && canvas.isHardwareAccelerated()) {
            if (this.L8 == null) {
                this.L8 = android.support.v4.media.session.x.d("toastContent");
            }
            if ((this.G8 != 0 || (uj0Var2 = this.I8) == null || uj0Var2.a0 >= uj0Var2.e[0] - 1) && (!n() || (uj0Var = this.J8) == null || uj0Var.a0 >= uj0Var.e[0] - 1)) {
                uj0 uj0Var3 = this.K8;
                if (uj0Var3 == null || this.G8 != R.drawable.msg_download) {
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
                sb3.append(this.E8);
                sb3.append(this.G8);
                int i15 = (int) min;
                sb3.append(i15);
                sb3.append((int) this.s1);
                sb2 = sb3.toString();
                if (z11 && sb2.equals(this.N8) && b0.e(this.L8)) {
                    f17 = f27;
                } else {
                    this.N8 = sb2;
                    f17 = f27;
                    P(0.0f, dp5 / 2.0f, f31, b0.a(i15, (int) dp5, this.L8), z10);
                    b0.d(this.L8);
                }
                dp2 = (1.0f - Z0) * AndroidUtilities.dp(5.0f);
                if (Math.abs(dp2 - this.M8) > 0.25f) {
                    this.M8 = dp2;
                    Object obj = this.L8;
                    if (dp2 <= 0.3f) {
                        dp2 = 0.0f;
                    }
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    b0.j(obj, dp2);
                }
                b0.h(this.L8, clamp012);
                float f32 = dp5 / 2.0f;
                canvas.translate(f17 - (min / 2.0f), f28 - f32);
                b0.c(canvas, this.L8);
                O(canvas, 0.0f, f32, min, B);
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
            sb32.append(this.E8);
            sb32.append(this.G8);
            int i152 = (int) min;
            sb32.append(i152);
            sb32.append((int) this.s1);
            sb2 = sb32.toString();
            if (z11) {
            }
            this.N8 = sb2;
            f17 = f27;
            P(0.0f, dp5 / 2.0f, f31, b0.a(i152, (int) dp5, this.L8), z10);
            b0.d(this.L8);
            dp2 = (1.0f - Z0) * AndroidUtilities.dp(5.0f);
            if (Math.abs(dp2 - this.M8) > 0.25f) {
            }
            b0.h(this.L8, clamp012);
            float f322 = dp5 / 2.0f;
            canvas.translate(f17 - (min / 2.0f), f28 - f322);
            b0.c(canvas, this.L8);
            O(canvas, 0.0f, f322, min, B);
        } else {
            canvas.saveLayerAlpha(rectF, (int) (clamp012 * 255.0f));
            float f33 = f27 - (min / 2.0f);
            float f34 = f28;
            P(f33, f34, f31, canvas, z10);
            canvas.restore();
            O(canvas, f33, f34, min, B);
        }
        canvas.restore();
    }

    public final float Q0(int i10, long j10) {
        return 1.0f - ((1.0f - this.j9[i10]) * ((float) Math.exp((-(j10 - this.g9[i10])) / 90.0f)));
    }

    public final void R0(z0 z0Var, float f7, float f10) {
        if (z0Var != null) {
            this.L6 = P0(z0Var.c);
        }
        if (this.f2) {
            if (this.r != null) {
                this.r = null;
            }
            this.n = z0Var;
            this.s = 1.0f;
            invalidate();
            return;
        }
        this.r = this.n;
        this.n = z0Var;
        this.s = 0.0f;
        this.v = System.currentTimeMillis();
        this.w = f7;
        this.x = f10;
        this.q0++;
        g0();
        invalidate();
    }

    public final float S(float f7) {
        if (this.G4 >= 1.0f) {
            return 1.0f;
        }
        return AndroidUtilities.lerp(this.I4 ? 0.85f : 0.92f, 1.0f, f7);
    }

    public final Drawable T(String str) {
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

    public final float T0() {
        return (getHeight() - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(10.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final y0 U() {
        long j10;
        y0 y0Var = new y0();
        ArrayList arrayList = this.I;
        if (!arrayList.isEmpty()) {
            y0Var.a = 1;
            y0Var.b = new Drawable[arrayList.size()];
            y0Var.s = new long[arrayList.size()];
            y0Var.t = new boolean[arrayList.size()];
            for (int i10 = 0; i10 < y0Var.b.length; i10++) {
                String str = (String) arrayList.get(i10);
                y0Var.b[i10] = T(str);
                if (str.startsWith("c:")) {
                    try {
                        j10 = Long.parseLong(str.substring(2));
                    } catch (NumberFormatException unused) {
                    }
                    long[] jArr = y0Var.s;
                    if (j10 > 0) {
                        j10 = (-1) - (str.hashCode() & 4294967295L);
                    }
                    jArr[i10] = j10;
                    y0Var.t[i10] = x.d(y0Var.b[i10]);
                }
                j10 = 0;
                long[] jArr2 = y0Var.s;
                if (j10 > 0) {
                }
                jArr2[i10] = j10;
                y0Var.t[i10] = x.d(y0Var.b[i10]);
            }
        }
        return y0Var;
    }

    public final float U0() {
        float max = Math.max(AndroidUtilities.dp(160.0f), T0() - ((((l() + (AndroidUtilities.dp(51.0f) + AndroidUtilities.statusBarHeight)) + AndroidUtilities.dp(24.0f)) + AndroidUtilities.dp(11.0f)) + AndroidUtilities.dp(13.0f)));
        if (this.h1 == 2 && this.x1) {
            ArrayList arrayList = this.v1;
            if (arrayList.size() <= 3) {
                max = Math.min(max, arrayList.isEmpty() ? AndroidUtilities.dp(286.0f) : AndroidUtilities.dp(8.0f) + ((wh.C(10.0f, 2, getWidth()) - AndroidUtilities.dp(8.0f)) / 3.0f));
            }
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        float f7 = this.P2;
        if (f7 < 0.0f || this.f1 < 0.01f) {
            this.P2 = max;
        } else if (f7 != max) {
            long min = Math.min(64L, Math.max(0L, currentAnimationTimeMillis - this.Q2));
            float f10 = this.P2;
            float x10 = a6.x(1.0f, (float) Math.exp((-min) / 140.0f), max - f10, f10);
            this.P2 = x10;
            if (Math.abs(max - x10) < 0.5f) {
                this.P2 = max;
            } else {
                invalidate();
            }
        }
        this.Q2 = currentAnimationTimeMillis;
        return this.P2;
    }

    public final void V(y0 y0Var) {
        TLRPC.Document document;
        g3 g3Var;
        if (y0Var == null || y0Var.G) {
            return;
        }
        if (y0Var.a == 1 && !y0Var.w && y0Var.b != null) {
            ArrayList arrayList = new ArrayList();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            int i10 = 0;
            while (true) {
                if (i10 < y0Var.b.length) {
                    long j10 = y0Var.s[i10];
                    if (!arrayList.contains(Long.valueOf(j10))) {
                        Drawable drawable = y0Var.b[i10];
                        boolean z10 = drawable instanceof r5;
                        TLRPC.Document document2 = z10 ? ((r5) drawable).e : null;
                        if (z10 && document2 == null) {
                            return;
                        }
                        arrayList.add(Long.valueOf(j10));
                        if (document2 != null) {
                            hashMap.put(Long.valueOf(j10), document2);
                        }
                        if (document2 == null || (!"application/x-tgsticker".equals(document2.mime_type) && !"video/webm".equals(document2.mime_type))) {
                            if (z10) {
                                g3 g3Var2 = ((r5) drawable).k;
                                if (g3Var2 == null || !g3Var2.hasImageLoaded() || !g3Var2.hasNotThumb()) {
                                    return;
                                }
                            } else if ((drawable instanceof Emoji.EmojiDrawable) && !((Emoji.EmojiDrawable) drawable).isLoaded()) {
                                return;
                            }
                            hashMap2.put(Long.valueOf(j10), drawable);
                        }
                    }
                    i10++;
                } else {
                    y0Var.w = true;
                    int dp = AndroidUtilities.dp(52.0f);
                    HashMap hashMap3 = new HashMap();
                    for (Map.Entry entry : hashMap2.entrySet()) {
                        Long l4 = (Long) entry.getKey();
                        Drawable drawable2 = (Drawable) entry.getValue();
                        Bitmap createBitmap = Bitmap.createBitmap(dp, dp, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        if ((drawable2 instanceof r5) && (g3Var = ((r5) drawable2).k) != null) {
                            g3Var.setCurrentAlpha(1.0f);
                        }
                        Rect rect = new Rect(drawable2.getBounds());
                        drawable2.setBounds(0, 0, dp, dp);
                        drawable2.setAlpha(255);
                        drawable2.setColorFilter(null);
                        drawable2.draw(canvas);
                        drawable2.setBounds(rect);
                        hashMap3.put(l4, createBitmap);
                    }
                    y0Var.v = new j(this.b, arrayList, hashMap, hashMap3, dp, LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD), new v0(this, y0Var, 0));
                }
            }
        }
        if (y0Var.a == 2 && y0Var.E == null && y0Var.A == null && (document = y0Var.x) != null) {
            y0Var.E = new z(this.b, document, y0Var.y, y0Var.z, AndroidUtilities.dp(48.0f), LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD), new v0(this, y0Var, 1), new v0(this, y0Var, 2));
        }
    }

    public final float V0(float f7, float f10, int i10, int i11) {
        float f11;
        float f12;
        float f13;
        float f14;
        int i12;
        float f15;
        if (!this.d3) {
            return 0.0f;
        }
        float f16 = i10;
        float f17 = f7 - (f16 / 2.0f);
        float f18 = this.m3;
        float f19 = i11;
        float f20 = f10 - (f19 / 2.0f);
        float f21 = (this.n3 * f20) + (f17 * f18);
        float abs = ((Math.abs(this.n3) * f19) + (Math.abs(f18) * f16)) / 2.0f;
        float f22 = 1.0f;
        float max = Math.max(1.0f, abs);
        float[] fArr = e1.b;
        float f23 = fArr[19] / 100.0f;
        if (f23 > 0.0f) {
            float f24 = this.n3;
            float max2 = ((f20 * this.m3) + (f17 * (-f24))) / Math.max(1.0f, ((Math.abs(this.m3) * f19) + (Math.abs(f24) * f16)) / 2.0f);
            f21 -= ((f23 * f16) * max2) * max2;
        }
        float f25 = (f21 - this.b3) / this.c3;
        float f26 = fArr[20] / 100.0f;
        if (f26 > 0.0f) {
            f25 += (((((float) Math.asin(Math.max(-1.0f, Math.min(1.0f, f21 / max)))) - Math.max(-2.1991148f, Math.min(2.1991148f, (this.b3 / max) * 1.5707964f))) / ((this.c3 / max) * 1.5707964f)) - f25) * f26;
            f11 = a6.D(1.0f, (float) Math.cos(Math.max(-1.5707964f, Math.min(1.5707964f, r4))), (f26 * fArr[31]) / 100.0f, 1.0f);
        } else {
            f11 = 1.0f;
        }
        this.U3 = f25;
        float f27 = this.j3;
        this.V3 = f27 * f11;
        float f28 = fArr[34] / 100.0f;
        int i13 = (f25 > 4.0f ? 1 : (f25 == 4.0f ? 0 : -1));
        if ((i13 > 0 || f25 < -4.0f) && f28 <= 0.0f) {
            this.S3 = 0.0f;
            return 0.0f;
        }
        float f29 = fArr[32];
        float f30 = f25 / fArr[29];
        y0 y0Var = this.F;
        if (y0Var != null && y0Var.a == 1) {
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
        this.S3 = f15;
        float exp = (fArr[28] / 100.0f) * ((i12 > 0 || f25 < -4.0f) ? f12 : (float) Math.exp(Math.pow(Math.abs(f25), f29) * (-0.5d)));
        if (f28 > f12) {
            float f32 = f25 - fArr[33];
            if (f32 < f14 && f32 > -4.0f) {
                exp += f28 * ((float) Math.exp(Math.pow(Math.abs(f32), f29) * (-0.5d)));
            }
        }
        return this.j3 * f13 * exp;
    }

    public final boolean W(Bitmap bitmap) {
        float[] fArr = e1.b;
        float f7 = fArr[36];
        float f10 = fArr[38];
        float f11 = fArr[24];
        if (this.x3 != null && this.y3 == bitmap && f7 == this.A3 && f10 == this.B3 && f11 == this.C3) {
            return true;
        }
        if (bitmap == null || bitmap.isRecycled()) {
            return false;
        }
        this.y3 = bitmap;
        this.A3 = f7;
        this.B3 = f10;
        this.C3 = f11;
        Bitmap bitmap2 = this.x3;
        if (bitmap2 == null || bitmap2.getWidth() != bitmap.getWidth() || this.x3.getHeight() != bitmap.getHeight()) {
            this.x3 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        }
        this.x3.eraseColor(0);
        Canvas canvas = new Canvas(this.x3);
        double radians = Math.toRadians(f11);
        float f12 = (float) (-Math.cos(radians));
        float f13 = (float) (-Math.sin(radians));
        float dpf2 = AndroidUtilities.dpf2(f7);
        float dpf22 = AndroidUtilities.dpf2(f10);
        float f14 = f12 * dpf22;
        float f15 = dpf22 * f13;
        canvas.drawBitmap(bitmap, f14, f15, (Paint) null);
        canvas.drawBitmap(bitmap, f14 - (f12 * dpf2), f15 - (f13 * dpf2), this.D3);
        this.z3 = g0.a.a(this.x3);
        return true;
    }

    public final void W0(int i10, String str, String str2) {
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

    public final void X(y0 y0Var) {
        r5 r5Var;
        g3 g3Var;
        if (y0Var == null || y0Var.e != null || (r5Var = y0Var.c) == null) {
            return;
        }
        z zVar = y0Var.E;
        if ((zVar == null || (zVar.v && zVar.w)) && (g3Var = r5Var.k) != null && g3Var.hasImageLoaded() && g3Var.hasNotThumb()) {
            int dp = AndroidUtilities.dp(48.0f);
            Bitmap createBitmap = Bitmap.createBitmap(dp, dp, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            y0Var.c.setBounds(0, 0, dp, dp);
            y0Var.c.setColorFilter(null);
            y0Var.c.setAlpha(255);
            g3Var.setCurrentAlpha(1.0f);
            y0Var.c.draw(canvas);
            A0(y0Var, createBitmap);
        }
    }

    public final String Y() {
        String string = LocaleController.getString(R.string.QrNoPaidToastExpires);
        if (!string.equals(this.u2)) {
            this.u2 = string;
            Matcher matcher = Pattern.compile("\\d+").matcher(string);
            if (matcher.find()) {
                this.v2 = string.substring(0, matcher.start());
                this.w2 = matcher.group();
                this.x2 = string.substring(matcher.end());
            } else {
                this.v2 = string;
                this.x2 = "";
                this.w2 = "";
            }
        }
        return this.u2;
    }

    public final void b() {
        z0 z0Var;
        int i10;
        Runnable runnable = this.d2;
        if (runnable != null) {
            runnable.run();
        }
        int i11 = q9;
        if (!this.e2 && !this.I.isEmpty() && (z0Var = this.n) != null && ((i10 = z0Var.a) != 0 || z0Var.f != i11)) {
            if (this.F.a == 2 || i10 == 2) {
                this.D7 = AnimationUtils.currentAnimationTimeMillis();
                this.A7 = -1;
                this.y7 = 0.0f;
            }
            this.w7 = i11;
            setSceneFromCard(s(i11));
        }
        setPattern(U());
        if (!this.f2) {
            this.r0 = AnimationUtils.currentAnimationTimeMillis();
        }
        x0();
    }

    public final void c(int i10) {
        this.e2 = true;
        boolean z10 = this.F.a != 0;
        this.I.clear();
        this.y7 = 0.0f;
        this.w7 = i10;
        z0 z0Var = this.n;
        if (z0Var == null || z0Var.a != 0 || z0Var.f != i10) {
            setSceneFromCard(s(i10));
        }
        if (z10) {
            setPattern(new y0());
        }
        Runnable runnable = this.d2;
        if (runnable != null) {
            runnable.run();
        }
        this.e2 = false;
    }

    public final void c0(int i10, int[] iArr) {
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

    public final void c1(g gVar) {
        h hVar = this.s0;
        if (hVar.q != 2 || hVar.o >= 1.0f) {
            postDelayed(new uf.c(29, this, gVar), 40L);
        } else {
            hVar.m = gVar;
            invalidate();
        }
    }

    public final void d(ArrayList arrayList) {
        this.e2 = true;
        int i10 = q9;
        z0 z0Var = this.n;
        if (z0Var == null || z0Var.a != 0 || z0Var.f != i10) {
            this.w7 = i10;
            setSceneFromCard(s(i10));
        }
        this.y7 = 0.0f;
        ArrayList arrayList2 = this.I;
        arrayList2.clear();
        for (int i11 = 0; i11 < arrayList.size() && i11 < 6; i11++) {
            String str = "c:" + arrayList.get(i11);
            HashMap hashMap = this.J;
            if (!hashMap.containsKey(str)) {
                r5 n10 = r5.n(this.b, ((Long) arrayList.get(i11)).longValue(), null, 7);
                n10.a(this);
                hashMap.put(str, n10);
            }
            arrayList2.add(str);
        }
        b();
        this.e2 = false;
    }

    public final int d0() {
        int size = this.v1.size();
        if (!this.x1 || size <= 0 || size >= 3) {
            return 3;
        }
        return size;
    }

    public final float d1(int i10) {
        if (i10 != this.F7) {
            return 1.0f;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (this.H7 < this.G7) {
            float clamp01 = 1.0f - Utilities.clamp01((currentAnimationTimeMillis - r6) / 110.0f);
            return 1.0f - ((1.0f - (clamp01 * clamp01)) * 0.08f);
        }
        double a12 = a1((currentAnimationTimeMillis - r4) / 1000.0f, 0.6d, 0.28d);
        if (currentAnimationTimeMillis - this.H7 > 900) {
            this.F7 = -1;
            return 1.0f;
        }
        float f7 = this.I7;
        return ((1.0f - f7) * ((float) a12)) + f7;
    }

    public final float e(float f7, float f10, float f11) {
        float x10 = a6.x(f10, f7, 1.0f - ((float) Math.pow(1.0f - f11, this.V2)), f7);
        return Math.abs(f10 - x10) < 0.002f ? f10 : x10;
    }

    public final r5 e0(long j10, TLRPC.Document document) {
        Long valueOf = Long.valueOf(j10);
        HashMap hashMap = this.t7;
        r5 r5Var = (r5) hashMap.get(valueOf);
        if (r5Var != null) {
            return r5Var;
        }
        r5 m10 = r5.m(this.b, 24, document);
        m10.a(this);
        hashMap.put(Long.valueOf(j10), m10);
        return m10;
    }

    public final boolean f0() {
        return this.x1 && this.v1.isEmpty();
    }

    public final a1 f1(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        Long valueOf = Long.valueOf(tL_starGiftUnique.id);
        HashMap hashMap = this.u7;
        a1 a1Var = (a1) hashMap.get(valueOf);
        if (a1Var == null) {
            a1Var = new a1();
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
                a1Var.a = p5Var;
                p5Var.i(document, false);
                a1Var.a.a();
                a1Var.b = document.id;
            }
            hashMap.put(Long.valueOf(tL_starGiftUnique.id), a1Var);
        }
        return a1Var;
    }

    public final void g(Canvas canvas, RectF rectF, float f7) {
        if (b0.f() && canvas.isHardwareAccelerated() && b0.e(this.I1)) {
            float[] fArr = e1.a[this.g6 ? (char) 1 : this.h6 ? (char) 2 : (char) 0];
            float dpf2 = AndroidUtilities.dpf2(1.0f) + AndroidUtilities.dpf2(fArr[4]) + Math.max(0.0f, -AndroidUtilities.dpf2(fArr[8]));
            RectF rectF2 = this.I6;
            rectF2.set(rectF);
            float f10 = -dpf2;
            rectF2.inset(f10, f10);
            Path path = this.G6;
            path.rewind();
            float f11 = f7 + dpf2;
            path.addRoundRect(rectF2, f11, f11, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            Matrix matrix = this.F6;
            canvas.getMatrix(matrix);
            if (matrix.invert(matrix)) {
                matrix.preConcat(this.E6);
                canvas.concat(matrix);
            }
            b0.c(canvas, this.I1);
            canvas.restore();
        }
    }

    public final void g0() {
        try {
            performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public final PorterDuffColorFilter g1(int i10) {
        SparseArray sparseArray = this.O6;
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

    public ArrayList<Long> getPickedCustomEmoji() {
        ArrayList<Long> arrayList = new ArrayList<>();
        ArrayList arrayList2 = this.I;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            String str = (String) obj;
            if (str.startsWith("c:")) {
                try {
                    arrayList.add(Long.valueOf(Long.parseLong(str.substring(2))));
                } catch (NumberFormatException unused) {
                }
            }
        }
        return arrayList;
    }

    public int getThemeBackdropIndex() {
        z0 z0Var = this.n;
        if (z0Var == null || z0Var.a != 0) {
            return -1;
        }
        return z0Var.f;
    }

    public TL_stars.TL_starGiftUnique getThemeGift() {
        int i10;
        y0 y0Var = this.F;
        if (y0Var.a != 2 || (i10 = y0Var.j) < 0) {
            return null;
        }
        ArrayList arrayList = this.v1;
        if (i10 < arrayList.size()) {
            return (TL_stars.TL_starGiftUnique) arrayList.get(this.F.j);
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

    public final float h() {
        return (getHeight() - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(40.0f);
    }

    public final boolean h0(Canvas canvas) {
        return b0.f() && canvas.isHardwareAccelerated() && b0.e(this.J1);
    }

    public final uj0 i1() {
        if (this.J8 == null) {
            uj0 uj0Var = new uj0(R.raw.contact_check, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f));
            this.J8 = uj0Var;
            uj0Var.setColorFilter(new ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.2126f, 0.7152f, 0.0722f, 1.0f, -255.0f}));
            this.J8.K(0);
            this.J8.R(this);
            this.J8.J(true);
        }
        return this.J8;
    }

    public final void j0() {
        if (this.E8 == null) {
            this.u1 = 0L;
            return;
        }
        this.u1 = 0L;
        if (this.x8) {
            this.x8 = false;
            this.w8 = AnimationUtils.currentAnimationTimeMillis();
        }
        this.F8 = true;
        invalidate();
    }

    public final uj0 j1() {
        if (this.K8 == null) {
            uj0 uj0Var = new uj0(R.raw.ic_save_to_gallery, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f));
            this.K8 = uj0Var;
            uj0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            this.K8.K(0);
            this.K8.R(this);
            this.K8.J(true);
        }
        return this.K8;
    }

    public final uj0 k1() {
        if (this.I8 == null) {
            uj0 uj0Var = new uj0(R.raw.star_premium_2, AndroidUtilities.dp(27.0f), AndroidUtilities.dp(27.0f));
            this.I8 = uj0Var;
            uj0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            this.I8.K(0);
            this.I8.R(this);
            this.I8.J(true);
        }
        return this.I8;
    }

    public final float l() {
        return AndroidUtilities.lerp(1.07f, 1.0f, this.C2) * getWidth() * 0.745f;
    }

    public final boolean l0(float f7, float f10) {
        if (this.p1 == null || !this.x8) {
            return false;
        }
        RectF rectF = this.v8;
        if (rectF.isEmpty()) {
            return false;
        }
        float f11 = rectF.right;
        float dp = AndroidUtilities.dp(15.0f);
        TextPaint textPaint = this.y2;
        textPaint.setTextSize(dp);
        float measureText = (f11 - textPaint.measureText(this.p1)) - AndroidUtilities.dp(28.0f);
        float dp2 = rectF.top - AndroidUtilities.dp(6.0f);
        float dp3 = rectF.right + AndroidUtilities.dp(6.0f);
        float dp4 = rectF.bottom + AndroidUtilities.dp(6.0f);
        RectF rectF2 = this.q1;
        rectF2.set(measureText, dp2, dp3, dp4);
        return rectF2.contains(f7, f10);
    }

    public final float l1(String str) {
        int indexOf = str.indexOf(10);
        TextPaint textPaint = this.E1;
        if (indexOf >= 0) {
            return Math.max(textPaint.measureText(str, 0, indexOf), textPaint.measureText(str, indexOf + 1, str.length()));
        }
        if (!o0(str)) {
            return textPaint.measureText(str);
        }
        float textSize = textPaint.getTextSize();
        TextPaint textPaint2 = this.y2;
        textPaint2.setTextSize(textSize);
        return textPaint.measureText(this.x2) + textPaint2.measureText(this.w2) + textPaint.measureText(this.v2);
    }

    public final float m() {
        float max = ((1.0f - Math.max(this.J2, this.C2)) * AndroidUtilities.dp(16.0f)) + (((getHeight() * 0.468f) - (l() / 2.0f)) - AndroidUtilities.dp(15.0f));
        return AndroidUtilities.lerp(max, Math.max(AndroidUtilities.dp(51.0f) + AndroidUtilities.statusBarHeight, Math.min(max, (((T0() - U0()) - AndroidUtilities.dp(13.0f)) - (AndroidUtilities.dp(35.0f) * Math.max(this.J2, this.C2))) - l())), this.f1);
    }

    public final void m0(Canvas canvas, Drawable drawable, float f7, float f10, float f11, float f12) {
        drawable.setColorFilter(g1(-1));
        drawable.setAlpha((int) (f12 * 255.0f));
        float f13 = f11 / 2.0f;
        drawable.setBounds((int) (f7 - f13), (int) (f10 - f13), (int) (f7 + f13), (int) (f10 + f13));
        drawable.draw(canvas);
    }

    public final boolean n() {
        String str;
        return (this.G8 != R.drawable.msg_retry || (str = this.E8) == null || o0(str)) ? false : true;
    }

    public final void n1(boolean z10) {
        String sb2;
        if (this.v0) {
            if (this.w0) {
                int ceil = (int) Math.ceil((this.A0 ? 60000L : Math.max(0L, this.z0 - System.currentTimeMillis())) / 1000.0d);
                if (ceil == this.A2 && this.z2 != null) {
                    return;
                }
                this.A2 = ceil;
                StringBuilder sb3 = new StringBuilder();
                org.telegram.ui.Cells.t0.n(R.string.QrNoPaidFree, " · ", sb3);
                sb3.append(LocaleController.formatString(R.string.QrNoPaidExpiresIn, String.format(Locale.US, "%d:%02d", Integer.valueOf(ceil / 60), Integer.valueOf(ceil % 60))));
                sb2 = sb3.toString();
            } else {
                StringBuilder sb4 = new StringBuilder();
                org.telegram.ui.Cells.t0.n(R.string.QrNoPaidFree, " · ", sb4);
                sb2 = org.telegram.messenger.q.g(R.string.QrNoPaidNoTimeLimit, sb4);
                this.A2 = -1;
            }
            if (sb2.equals(this.z2)) {
                return;
            }
            this.z2 = sb2;
            this.L0.t(sb2, z10, true);
        }
    }

    public final void o(float f7, float f10, float f11) {
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
                b10 = org.telegram.ui.Cells.t0.b(0.7f, random.nextFloat(), AndroidUtilities.dpf2(0.7f));
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

    public final boolean o0(String str) {
        return str != null && str.equals(this.u2);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.e6;
        SparseIntArray sparseIntArray = this.d6;
        if (i10 != 1) {
            sparseIntArray.clear();
            this.e6 = 1;
        }
        int i11 = 0;
        while (true) {
            int[] iArr = a.b;
            if (i11 >= iArr.length) {
                break;
            }
            z0 z0Var = new z0();
            int i12 = iArr[i11] | (-16777216);
            z0Var.b = i12;
            z0Var.c = (-16777216) | a.c[i11];
            z0Var.i = S0(i12);
            if (sparseIntArray.indexOfKey(z0Var.b) < 0) {
                sparseIntArray.put(z0Var.b, t(z0Var));
            }
            i11++;
        }
        NotificationCenter.getInstance(this.b).addObserver(this.j2, NotificationCenter.starUserGiftsLoaded);
        u0();
        SensorManager sensorManager = (SensorManager) getContext().getSystemService("sensor");
        this.u6 = sensorManager;
        Sensor defaultSensor = sensorManager != null ? sensorManager.getDefaultSensor(9) : null;
        if (defaultSensor != null) {
            this.u6.registerListener(this.v6, defaultSensor, 1);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.b).removeObserver(this.j2, NotificationCenter.starUserGiftsLoaded);
        removeCallbacks(this.k2);
        SensorManager sensorManager = this.u6;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.v6);
        }
        this.s6 = false;
        this.b9 = -1;
        Arrays.fill(this.h9, 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0acf  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0b21  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0b70  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0bf0  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0c2e  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0b73  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0b17  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0a0d  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0a61  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0a7d  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0a14  */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21, types: [int] */
    /* JADX WARN: Type inference failed for: r11v37 */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r29v1 */
    /* JADX WARN: Type inference failed for: r29v2 */
    /* JADX WARN: Type inference failed for: r7v26, types: [android.graphics.RectF, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v49, types: [android.graphics.RectF] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10;
        long j10;
        float f11;
        u3.c cVar;
        boolean z10;
        int i10;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        int i11;
        int i12;
        b1 b1Var;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        float lerp;
        float f24;
        float lerp2;
        float f25;
        b1 b1Var2;
        Canvas canvas2;
        float sin;
        float f26;
        boolean z11;
        long j11;
        boolean z12;
        boolean z13;
        boolean z14;
        float dp;
        float f27;
        ?? r72;
        ?? r82;
        ?? r11;
        c cVar2;
        float f28;
        float a12;
        Canvas canvas3 = canvas;
        this.H2 = true;
        float f29 = this.B2 ? 1.0f : 0.0f;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        float f30 = this.E2;
        if (f29 != f30) {
            if (f29 == 1.0f && f30 == 0.0f && this.C2 <= 0.001f) {
                this.S4 = true;
                this.R4 = null;
            } else if (f29 == 0.0f && this.C2 >= 0.999f) {
                this.S4 = false;
            }
            this.E2 = f29;
            this.D2 = this.C2;
            this.F2 = currentAnimationTimeMillis;
        }
        if (this.C2 != f29) {
            f7 = 0.0f;
            float clamp01 = Utilities.clamp01((currentAnimationTimeMillis - this.F2) / 300.0f);
            float C = clamp01 < 0.5f ? a6.C(clamp01, 4.0f, clamp01, clamp01) : 1.0f - (((float) Math.pow((clamp01 * (-2.0f)) + 2.0f, 3.0d)) / 2.0f);
            if (clamp01 < 1.0f) {
                f29 = AndroidUtilities.lerp(this.D2, f29, C);
            }
            this.C2 = f29;
            if (f29 <= 0.0f) {
                this.S4 = false;
            }
            invalidate();
        } else {
            f7 = 0.0f;
        }
        float f31 = this.K0 ? 1.0f : f7;
        long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
        float f32 = this.L2;
        if (f32 < f7) {
            this.L2 = f31;
            this.J2 = f31;
        } else {
            if (f31 != f32) {
                this.L2 = f31;
                this.K2 = this.J2;
                this.M2 = currentAnimationTimeMillis2;
            }
            if (this.J2 != f31) {
                float clamp012 = Utilities.clamp01((currentAnimationTimeMillis2 - this.M2) / 320.0f);
                float C2 = clamp012 < 0.5f ? a6.C(clamp012, 4.0f, clamp012, clamp012) : 1.0f - (((float) Math.pow((clamp012 * (-2.0f)) + 2.0f, 3.0d)) / 2.0f);
                if (clamp012 < 1.0f) {
                    f31 = AndroidUtilities.lerp(this.K2, f31, C2);
                }
                this.J2 = f31;
                invalidate();
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        int width = getWidth();
        int height = getHeight();
        float min = this.U2 == 0 ? 1.0f : Math.min(3.0f, (currentTimeMillis - r4) / 16.667f);
        this.U2 = currentTimeMillis;
        this.V2 = min;
        float f33 = this.s;
        u3.c cVar3 = this.c;
        if (f33 < 1.0f) {
            f10 = 4.0f;
            j10 = currentTimeMillis;
            float min2 = Math.min(1.0f, (j10 - this.v) / 600.0f);
            this.s = min2;
            if (f33 < 0.3f && min2 >= 0.3f && cVar3 != null) {
                this.n.getClass();
                ((m0) cVar3.a).V();
            }
            if (this.s >= 1.0f) {
                this.r = null;
            }
        } else {
            f10 = 4.0f;
            j10 = currentTimeMillis;
        }
        long currentAnimationTimeMillis3 = AnimationUtils.currentAnimationTimeMillis();
        OverScroller overScroller = this.U8;
        if (!overScroller.isFinished() && overScroller.computeScrollOffset()) {
            this.j1 = Math.max(f7, Math.min(v0(), overScroller.getCurrY()));
        }
        float f34 = this.g1;
        if (f34 != this.h7) {
            if (f34 < 0.5f) {
                this.J5 = currentAnimationTimeMillis3;
            } else if (this.f1 < 0.35f) {
                this.K5 = false;
            }
            if (f34 > 0.5f) {
                this.I2 = currentAnimationTimeMillis3;
            }
            this.h7 = f34;
            this.g7 = this.f1;
            this.f7 = currentAnimationTimeMillis3;
        }
        float f35 = f10;
        float f36 = (currentAnimationTimeMillis3 - this.f7) / 1000.0f;
        bs bsVar = v9;
        if (f34 > 0.5f) {
            float lerp3 = AndroidUtilities.lerp(this.g7, 1.0f, bsVar.getInterpolation(Utilities.clamp01(f36 / 0.42f)));
            this.f1 = lerp3;
            this.i7 = Utilities.clamp01(Utilities.clamp01(lerp3) / 0.8f);
            f11 = 1000.0f;
            cVar = cVar3;
            z10 = 0;
        } else {
            f11 = 1000.0f;
            cVar = cVar3;
            z10 = 0;
            this.i7 = Math.min(this.i7, (float) Math.pow(1.0f - Utilities.clamp01(f36 / 0.17f), 1.7000000476837158d));
            this.f1 = AndroidUtilities.lerp(this.g7, 0.0f, bsVar.getInterpolation(Utilities.clamp01(f36 / 0.36f)));
        }
        this.x7 = e(this.x7, this.y7, 0.25f);
        z0 z0Var = this.n;
        if (z0Var != null && z0Var.a == 0) {
            i10 = z10;
            while (i10 < a.b.length) {
                if (X0(i10) == this.n.f) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        i10 = -100;
        int i13 = this.e8;
        if (i10 != i13) {
            float f37 = i10 == this.f8 ? this.h8 : 0.0f;
            this.f8 = i13;
            this.h8 = this.g8;
            this.e8 = i10;
            this.g8 = f37;
        }
        this.g8 = e(this.g8, 1.0f, 0.2f);
        this.h8 = e(this.h8, 0.0f, 0.2f);
        long currentAnimationTimeMillis4 = AnimationUtils.currentAnimationTimeMillis();
        float f38 = this.l1;
        if (f38 != this.m8) {
            this.m8 = f38;
            this.l8 = Math.max(this.o8, this.p8);
            this.j8 = currentAnimationTimeMillis4;
        }
        float f39 = (currentAnimationTimeMillis4 - this.j8) / f11;
        if (this.l1 > 0.5f) {
            float f40 = this.l8;
            if (f39 > 0.7f) {
                f12 = f35;
                a12 = 1.0f;
                f13 = 1.0f;
            } else {
                f12 = f35;
                f13 = 1.0f;
                a12 = ((1.0f - f40) * ((float) a1(f39, 0.78d, 0.3d))) + f40;
            }
            this.o8 = a12;
            this.p8 = f39 > 0.7f ? f13 : ((f13 - f40) * ((float) a1(f39 - 0.02d, 0.8d, 0.34d))) + f40;
        } else {
            f12 = f35;
            f13 = 1.0f;
            float clamp013 = Utilities.clamp01(f39 / 0.2f);
            float clamp014 = Utilities.clamp01(f39 / 0.17f);
            float f41 = this.l8;
            this.o8 = (1.0f - ((3.0f - (clamp014 * 2.0f)) * (clamp014 * clamp014))) * f41;
            this.p8 = (1.0f - ((3.0f - (clamp013 * 2.0f)) * (clamp013 * clamp013))) * f41;
        }
        float max = Math.max(0.004f, this.V2 * 0.016667f);
        float f42 = this.p8;
        this.q8 = (f42 - this.r8) / max;
        this.r8 = f42;
        float max2 = Math.max(0.0f, Math.max(this.o8, f42));
        this.k1 = max2;
        if (this.n8 > 0.001f && max2 <= 0.001f) {
            this.k8 = currentAnimationTimeMillis4;
        }
        this.n8 = max2;
        this.i1 = e(this.i1, this.h1, 0.25f);
        boolean z15 = (this.m1 == null || j10 >= this.u1) ? z10 : true;
        this.t1 = e(this.t1, z15 ? f13 : 0.0f, z15 ? 0.2f : this.l1 > 0.5f ? 0.4f : 0.16f);
        float lerp4 = AndroidUtilities.lerp(this.C0, this.D0, f13 - ((float) Math.pow(f13 - Math.min(f13, (j10 - this.E0) / (this.D0 > this.C0 ? 340L : 380L)), 3.0d)));
        this.B0 = lerp4;
        boolean z16 = this.v0;
        if (z16 && lerp4 >= 0.999f) {
            this.F0 = true;
        }
        if (z16) {
            if (this.w0) {
                f28 = Utilities.clamp01((this.A0 ? 60000L : Math.max(0L, this.z0 - j10)) / 60000.0f);
            } else {
                f28 = 1.0f;
            }
            this.G0 = f28;
            if (this.w0 && !this.A0 && j10 >= this.z0) {
                N0(LocaleController.getString(R.string.QrNoPaidToastExpired));
            }
        }
        n1(true);
        long nanoTime = System.nanoTime();
        float min3 = this.t6 == 0 ? 0.016f : Math.min(0.1f, (nanoTime - r8) / 1.0E9f);
        this.t6 = nanoTime;
        if (this.s6) {
            float exp = 1.0f - ((float) Math.exp((-min3) / f12));
            float f43 = this.q6;
            float f44 = this.o6;
            float x10 = a6.x(f44, f43, exp, f43);
            this.q6 = x10;
            float f45 = this.r6;
            this.r6 = a6.x(this.p6, f45, exp, f45);
            f14 = 1.0f;
            f15 = Math.max(-1.0f, Math.min(1.0f, (-(f44 - x10)) / 4.9f));
            f16 = Math.max(-1.0f, Math.min(1.0f, (this.p6 - this.r6) / 4.9f));
        } else {
            f14 = 1.0f;
            f15 = 0.0f;
            f16 = 0.0f;
        }
        float exp2 = f14 - ((float) Math.exp((-min3) / 0.08f));
        float f46 = this.m6;
        this.m6 = a6.x(f15, f46, exp2, f46);
        float f47 = this.n6;
        this.n6 = a6.x(f16, f47, exp2, f47);
        float[] fArr = e1.b;
        float f48 = fArr[z10];
        this.k6 = Math.round(r4 / r8) * (f48 > 0.0f ? 0.5f / f48 : 1.0f);
        float round = Math.round(this.n6 * 40.0f) / 40.0f;
        this.l6 = round;
        q10.i = this.k6 * fArr[z10];
        q10.j = (round * fArr[1]) / 100.0f;
        float f49 = this.H5;
        y0 y0Var = this.F;
        this.H5 = e(f49, (y0Var == null || y0Var.a == 0) ? 0.0f : 1.0f, 0.12f);
        if (b0.f()) {
            canvas3.isHardwareAccelerated();
        }
        if (b0.f() && canvas3.isHardwareAccelerated()) {
            if (this.I1 == null) {
                this.I1 = android.support.v4.media.session.x.d("qrBg");
                RenderNode d = android.support.v4.media.session.x.d("qrBlur");
                this.J1 = d;
                float dpf2 = AndroidUtilities.dpf2(17.6f) / f12;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                b0.j(d, dpf2);
            }
            x(b0.a(width, height, this.I1), width, height);
            b0.d(this.I1);
            if (this.K1 != 1) {
                this.K1 = 1;
                Object obj = this.J1;
                float max3 = Math.max(0.5f, AndroidUtilities.dpf2(fArr[2]) / f12);
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                b0.j(obj, max3);
            }
            Canvas a2 = b0.a((width + 3) / 4, (height + 3) / 4, this.J1);
            a2.scale(0.25f, 0.25f);
            b0.c(a2, this.I1);
            b0.d(this.J1);
            b0.c(canvas3, this.I1);
        } else {
            x(canvas3, width, height);
        }
        y(canvas3, width);
        float clamp015 = this.G4 < 1.0f ? Utilities.clamp01(this.J4) : 1.0f;
        this.H4 = clamp015;
        boolean z17 = clamp015 < 0.999f ? true : z10;
        float dp2 = AndroidUtilities.dp(8.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        this.D6 = z17;
        if (z17) {
            canvas3.getMatrix(this.E6);
        }
        if (z17) {
            f17 = 0.004f;
            i11 = width;
            f18 = 0.08f;
            i12 = height;
            canvas3.saveLayerAlpha(0.0f, 0.0f, width, dp2, (int) (clamp015 * 255.0f));
        } else {
            f17 = 0.004f;
            f18 = 0.08f;
            i11 = width;
            i12 = height;
        }
        float currentActionBarHeight = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + AndroidUtilities.statusBarHeight;
        RectF rectF = this.Q6;
        rectF.set(AndroidUtilities.dp(29.0f) - AndroidUtilities.dp(20.0f), currentActionBarHeight - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(29.0f), AndroidUtilities.dp(20.0f) + currentActionBarHeight);
        float S = S(this.H4);
        canvas3.save();
        canvas3.scale(S, S, rectF.centerX(), rectF.centerY());
        H(canvas3, rectF, AndroidUtilities.dp(20.0f), 1.0f);
        K(canvas3, 3, rectF, z10);
        g2 g2Var = this.Y1;
        g2Var.a(-1);
        canvas3.save();
        canvas3.translate(rectF.centerX() - (AndroidUtilities.dp(24.0f) / 2.0f), currentActionBarHeight - (AndroidUtilities.dp(24.0f) / 2.0f));
        g2Var.draw(canvas3);
        canvas3.restore();
        canvas3.restore();
        if (this.V6) {
            b1Var = this;
            f19 = 0.5f;
            f20 = 255.0f;
            f21 = 10.0f;
        } else {
            float dp3 = AndroidUtilities.dp(14.0f);
            Paint paint = this.W1;
            paint.setTextSize(dp3);
            float dp4 = AndroidUtilities.dp(6.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(12.0f);
            f21 = 10.0f;
            String str = this.X1;
            f20 = 255.0f;
            f19 = 0.5f;
            RectF rectF2 = this.T6;
            rectF2.set((getWidth() - AndroidUtilities.dp(9.0f)) - ((paint.measureText(str) + dp4) + AndroidUtilities.dp(14.0f)), currentActionBarHeight - AndroidUtilities.dp(20.0f), getWidth() - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(20.0f) + currentActionBarHeight);
            canvas3.save();
            canvas3.scale(S, S, rectF2.centerX(), rectF2.centerY());
            H(canvas3, rectF2, AndroidUtilities.dp(20.0f), 1.0f);
            K(canvas3, 5, rectF2, false);
            m0(canvas3, this.P1, AndroidUtilities.dp(10.0f) + rectF2.left + AndroidUtilities.dp(12.0f), currentActionBarHeight, AndroidUtilities.dp(20.0f), 1.0f);
            b1Var = this;
            paint.setColor(-1);
            Paint.FontMetrics fontMetrics = paint.getFontMetrics();
            canvas3.drawText(str, rectF2.left + AndroidUtilities.dp(12.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(6.0f), currentActionBarHeight - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f), paint);
            canvas3.restore();
        }
        if (z17) {
            canvas3.restore();
        }
        float h = b1Var.h() - AndroidUtilities.dp(28.0f);
        if (z17) {
            canvas.saveLayerAlpha(0.0f, h, i11, i12, (int) (clamp015 * f20));
            canvas3 = canvas;
        }
        float clamp016 = 1.0f - Utilities.clamp01(b1Var.f1 * 2.2f);
        long currentAnimationTimeMillis5 = AnimationUtils.currentAnimationTimeMillis();
        boolean z18 = b1Var.l1 > f19;
        if (z18 != b1Var.W6) {
            b1Var.W6 = z18;
            b1Var.Y6 = b1Var.X6;
            b1Var.Z6 = currentAnimationTimeMillis5;
        }
        float clamp017 = Utilities.clamp01((currentAnimationTimeMillis5 - b1Var.Z6) / 220.0f);
        if (z18) {
            f22 = 220.0f;
            lerp = AndroidUtilities.lerp(b1Var.Y6, 0.0f, clamp017 * clamp017);
            f23 = 1.0f;
        } else {
            f22 = 220.0f;
            f23 = 1.0f;
            lerp = AndroidUtilities.lerp(b1Var.Y6, 1.0f, Math.min(1.0f, R(clamp017, 0.6f)));
        }
        b1Var.X6 = lerp;
        if (clamp017 < f23) {
            b1Var.invalidate();
        }
        float clamp018 = Utilities.clamp01(Utilities.clamp01(b1Var.X6) * 2.0f);
        float lerp5 = AndroidUtilities.lerp(0.6f, f23, b1Var.X6);
        boolean z19 = z18 || (b1Var.v0 && b1Var.w0);
        if (z19 != b1Var.a7) {
            b1Var.a7 = z19;
            b1Var.c7 = b1Var.b7;
            b1Var.d7 = currentAnimationTimeMillis5;
        }
        int i14 = i12;
        float clamp019 = Utilities.clamp01((currentAnimationTimeMillis5 - b1Var.d7) / f22);
        if (z19) {
            lerp2 = AndroidUtilities.lerp(b1Var.c7, 0.0f, clamp019 * clamp019);
            f24 = 1.0f;
        } else {
            f24 = 1.0f;
            lerp2 = AndroidUtilities.lerp(b1Var.c7, 1.0f, Math.min(1.0f, R(clamp019, 0.6f)));
        }
        b1Var.b7 = lerp2;
        if (clamp019 < f24) {
            b1Var.invalidate();
        }
        float lerp6 = AndroidUtilities.lerp(0.6f, f24, b1Var.b7);
        float min4 = Math.min(clamp016, Utilities.clamp01(Utilities.clamp01(b1Var.b7) * 2.0f));
        boolean z20 = b1Var.f1 <= 0.001f;
        if (min4 > 0.0f || clamp016 > 0.0f || z20) {
            float h10 = b1Var.h();
            int width2 = b1Var.getWidth();
            int dp5 = AndroidUtilities.dp(20.0f);
            float dp6 = AndroidUtilities.dp(42.0f) - dp5;
            float f50 = dp5;
            float f51 = h10 - f50;
            boolean z21 = z20;
            float dp7 = AndroidUtilities.dp(42.0f) + dp5;
            float f52 = f50 + h10;
            f25 = clamp015;
            RectF rectF3 = b1Var.R6;
            rectF3.set(dp6, f51, dp7, f52);
            float B = org.telegram.messenger.q.B(42.0f, width2, dp5);
            float e = org.telegram.ui.Cells.t0.e(42.0f, width2, dp5);
            RectF rectF4 = b1Var.S6;
            rectF4.set(B, f51, e, f52);
            float f53 = width2 / 2.0f;
            RectF rectF5 = b1Var.U6;
            rectF5.set(f53 - AndroidUtilities.dp(72.0f), h10 - AndroidUtilities.dp(20.0f), f53 + AndroidUtilities.dp(72.0f), AndroidUtilities.dp(20.0f) + h10);
            float S2 = b1Var.S(b1Var.H4) * AndroidUtilities.lerp(0.6f, 1.0f, clamp016);
            if (min4 > 0.0f) {
                canvas3.save();
                float f54 = S2 * lerp6;
                canvas3.scale(f54, f54, rectF3.centerX(), h10);
                b1Var.H(canvas3, rectF3, AndroidUtilities.dp(20.0f), min4);
                b1Var.K(canvas3, 4, rectF3, false);
                b1Var2 = b1Var;
                b1Var2.m0(canvas3, b1Var.N1, rectF3.centerX(), h10, AndroidUtilities.dp(22.0f), min4);
                canvas3.restore();
                canvas3.save();
                float f55 = S2 * lerp5;
                canvas3.scale(f55, f55, rectF4.centerX(), h10);
                b1Var2.H(canvas3, rectF4, AndroidUtilities.dp(20.0f), min4);
                b1Var2.K(canvas3, 11, rectF4, false);
                b1Var2.m0(canvas3, b1Var2.O1, rectF4.centerX(), h10, AndroidUtilities.dp(24.0f), min4);
                canvas3.restore();
            } else {
                b1Var2 = b1Var;
            }
            if (z21 && clamp018 > 0.0f && b1Var2.a) {
                float S3 = b1Var2.S(b1Var2.H4) * lerp5;
                canvas3.save();
                canvas3.scale(S3, S3, rectF5.centerX(), rectF5.centerY());
                b1Var2.H(canvas3, rectF5, AndroidUtilities.dp(20.0f), clamp018);
                float width3 = rectF5.width() / 3.0f;
                canvas3.save();
                Path path = b1Var2.G1;
                path.rewind();
                path.addRoundRect(rectF5, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), Path.Direction.CW);
                canvas3.clipPath(path);
                int i15 = 0;
                while (i15 < 3) {
                    float f56 = rectF5.left;
                    float f57 = (i15 * width3) + f56;
                    float f58 = rectF5.top;
                    int i16 = i15 + 1;
                    float f59 = (i16 * width3) + f56;
                    float f60 = rectF5.bottom;
                    RectF rectF6 = b1Var2.M6;
                    rectF6.set(f57, f58, f59, f60);
                    b1Var2.K(canvas3, i15 + 6, rectF6, false);
                    i15 = i16;
                }
                canvas3.restore();
                int i17 = 0;
                while (i17 < 3) {
                    float f61 = clamp018;
                    b1Var2.m0(canvas3, b1Var2.P6[i17], wh.b(i17, f19, width3, rectF5.left), h10, AndroidUtilities.dp(i17 == 1 ? 24.5f : 22.0f), f61);
                    i17++;
                    canvas3 = canvas;
                    clamp018 = f61;
                    b1Var2 = b1Var2;
                    f19 = 0.5f;
                }
                b1Var = b1Var2;
                canvas.restore();
            } else {
                b1Var = b1Var2;
            }
        } else {
            f25 = clamp015;
        }
        if (z17) {
            canvas.restore();
        }
        RectF rectF7 = b1Var.o5;
        if (z17) {
            canvas.saveLayerAlpha(0.0f, rectF7.top - AndroidUtilities.dp(12.0f), i11, rectF7.bottom + AndroidUtilities.dp(12.0f), (int) (f25 * f20));
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
        }
        if (b1Var.k1 > 0.001f) {
            I(canvas);
        } else {
            if (b1Var.k8 != 0) {
                float currentAnimationTimeMillis6 = (AnimationUtils.currentAnimationTimeMillis() - b1Var.k8) / f11;
                if (currentAnimationTimeMillis6 <= 0.45f) {
                    sin = ((float) Math.sin((currentAnimationTimeMillis6 * 6.283185307179586d) / 0.17000000178813934d)) * ((float) Math.exp((-currentAnimationTimeMillis6) / 0.11f)) * 0.07f;
                    float S4 = b1Var.S(b1Var.G4 >= 1.0f ? Utilities.clamp01(b1Var.J4) : 1.0f) * i(0.06f, 0.02f, b1Var.m2);
                    if (b1Var.q2 > 0 || b1Var.v0) {
                        f26 = 1.0f;
                    } else {
                        float currentAnimationTimeMillis7 = (AnimationUtils.currentAnimationTimeMillis() - b1Var.q2) / 180.0f;
                        f26 = 1.0f;
                        if (currentAnimationTimeMillis7 < 1.0f) {
                            S4 *= (((float) Math.sin(currentAnimationTimeMillis7 * 3.141592653589793d)) * 0.04f) + 1.0f;
                            b1Var.invalidate();
                        }
                    }
                    z11 = sin == 0.0f || S4 != f26;
                    if (z11) {
                        canvas2.save();
                        canvas2.scale(((sin * 0.5f) + f26) * S4, (f26 - sin) * S4, rectF7.centerX(), rectF7.centerY());
                    }
                    b1Var.z(canvas2, i11);
                    if (z11) {
                        canvas2.restore();
                    }
                }
            }
            sin = 0.0f;
            float S42 = b1Var.S(b1Var.G4 >= 1.0f ? Utilities.clamp01(b1Var.J4) : 1.0f) * i(0.06f, 0.02f, b1Var.m2);
            if (b1Var.q2 > 0) {
            }
            f26 = 1.0f;
            if (sin == 0.0f) {
            }
            if (z11) {
            }
            b1Var.z(canvas2, i11);
            if (z11) {
            }
        }
        if (z17) {
            canvas2.restore();
        }
        b1Var.D6 = false;
        b1Var.M(canvas2, i11, i14);
        long currentAnimationTimeMillis8 = AnimationUtils.currentAnimationTimeMillis();
        if (b1Var.O8 == 0 && b1Var.x8 && b1Var.E8 != null && b1Var.g1 == 0.0f && b1Var.f1 > 0.001f) {
            RectF rectF8 = b1Var.v8;
            if (!rectF8.isEmpty()) {
                b1Var.O8 = currentAnimationTimeMillis8;
                b1Var.P8 = rectF8.centerY();
                b1Var.m1 = null;
                j11 = 0;
                b1Var.u1 = 0L;
                if (b1Var.O8 == j11) {
                    float f62 = (currentAnimationTimeMillis8 - r10) / 140.0f;
                    if (f62 >= 1.0f || b1Var.E8 == null) {
                        z12 = false;
                        b1Var.O8 = 0L;
                        b1Var.x8 = false;
                        b1Var.E8 = null;
                    } else {
                        b1Var.invalidate();
                        float f63 = i11;
                        canvas.saveLayerAlpha(0.0f, 0.0f, f63, i14, (int) ((1.0f - f62) * f20));
                        float f64 = 1.0f - (f62 * f18);
                        canvas.scale(f64, f64, f63 / 2.0f, b1Var.P8);
                        b1Var.Q8 = true;
                        b1Var.Q(canvas, i11, j10);
                        z12 = false;
                        b1Var.Q8 = false;
                        canvas.restore();
                    }
                } else {
                    z12 = false;
                    b1Var.Q(canvas2, i11, j10);
                }
                if (cVar != null) {
                    m0 m0Var = (m0) cVar.a;
                    if (b1Var.f1 <= 0.01f || b1Var.i7 <= f17) {
                        z13 = true;
                    } else {
                        z13 = true;
                        if (b1Var.h1 == 1) {
                            z14 = true;
                            dp = ((1.0f - b1Var.i7) * AndroidUtilities.dp(14.0f)) + (b1Var.T0() - b1Var.U0()) + AndroidUtilities.dp(8.0f);
                            f27 = b1Var.i7;
                            r72 = b1Var.s7;
                            r82 = b1Var.j7;
                            boolean z22 = (z14 || r82.equals(r72)) ? z12 : z13;
                            z0 z0Var2 = b1Var.n;
                            r11 = z0Var2 == null ? z0Var2.b : z12;
                            if (z14 || r11 == b1Var.r7) {
                                z13 = z12;
                            }
                            if (z14 == b1Var.q7 || z22 || z13 || (z14 && (Math.abs(dp - b1Var.o7) > 0.5f || Math.abs(f27 - b1Var.p7) > 0.01f))) {
                                b1Var.r7 = r11;
                                r72.set(r82);
                                b1Var.q7 = z14;
                                b1Var.o7 = dp;
                                b1Var.p7 = f27;
                                m0Var.a0(dp, f27, z14);
                                AndroidUtilities.dp(f21);
                                b1Var.getWidth();
                                AndroidUtilities.dp(f21);
                                b1Var.T0();
                                float f65 = ((RectF) r82).left;
                                float f66 = ((RectF) r82).top;
                                float f67 = ((RectF) r82).right;
                                float f68 = ((RectF) r82).bottom;
                                float min5 = Math.min(r82.height() / 2.0f, AndroidUtilities.lerp(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(28.17f), Utilities.clamp01(b1Var.f1)));
                                m0Var.n = f65;
                                m0Var.r = f66;
                                m0Var.s = f67;
                                m0Var.v = f68;
                                m0Var.w = min5;
                                if (m0Var.h != null) {
                                    float min6 = Math.min(r1.getHeight(), m0Var.v - (m0Var.h.getTranslationY() + m0Var.h.getTop()));
                                    c cVar4 = m0Var.x;
                                    if (cVar4 != null) {
                                        cVar4.G = min6;
                                    }
                                    m0Var.I = min6;
                                    if (cVar4 != null) {
                                        cVar4.U = m0Var.s - cVar4.getLeft();
                                    }
                                    s sVar = m0Var.S;
                                    if (sVar != null) {
                                        sVar.invalidate();
                                    }
                                    m0Var.h.invalidateOutline();
                                }
                                cVar2 = m0Var.x;
                                if (cVar2 != null) {
                                    cVar2.invalidateOutline();
                                }
                            }
                        }
                    }
                    z14 = z12;
                    dp = ((1.0f - b1Var.i7) * AndroidUtilities.dp(14.0f)) + (b1Var.T0() - b1Var.U0()) + AndroidUtilities.dp(8.0f);
                    f27 = b1Var.i7;
                    r72 = b1Var.s7;
                    r82 = b1Var.j7;
                    if (z14) {
                    }
                    z0 z0Var22 = b1Var.n;
                    if (z0Var22 == null) {
                    }
                    if (z14) {
                    }
                    z13 = z12;
                    if (z14 == b1Var.q7) {
                    }
                    b1Var.r7 = r11;
                    r72.set(r82);
                    b1Var.q7 = z14;
                    b1Var.o7 = dp;
                    b1Var.p7 = f27;
                    m0Var.a0(dp, f27, z14);
                    AndroidUtilities.dp(f21);
                    b1Var.getWidth();
                    AndroidUtilities.dp(f21);
                    b1Var.T0();
                    float f652 = ((RectF) r82).left;
                    float f662 = ((RectF) r82).top;
                    float f672 = ((RectF) r82).right;
                    float f682 = ((RectF) r82).bottom;
                    float min52 = Math.min(r82.height() / 2.0f, AndroidUtilities.lerp(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(28.17f), Utilities.clamp01(b1Var.f1)));
                    m0Var.n = f652;
                    m0Var.r = f662;
                    m0Var.s = f672;
                    m0Var.v = f682;
                    m0Var.w = min52;
                    if (m0Var.h != null) {
                    }
                    cVar2 = m0Var.x;
                    if (cVar2 != null) {
                    }
                }
                b1Var.invalidate();
            }
        }
        j11 = 0;
        if (b1Var.O8 == j11) {
        }
        if (cVar != null) {
        }
        b1Var.invalidate();
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (Build.VERSION.SDK_INT < 29 || !z10) {
            return;
        }
        int i14 = i12 - i10;
        int l4 = (int) ((l() / 2.0f) + m());
        int dp = AndroidUtilities.dp(100.0f);
        int dp2 = AndroidUtilities.dp(24.0f);
        ArrayList arrayList = this.Z2;
        arrayList.clear();
        int i15 = l4 - dp;
        int i16 = l4 + dp;
        arrayList.add(new Rect(0, i15, dp2, i16));
        arrayList.add(new Rect(i14 - dp2, i15, i14, i16));
        setSystemGestureExclusionRects(arrayList);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (i10 > 0 && i11 > 0) {
            float dp = AndroidUtilities.dp(12.0f);
            int ceil = ((int) Math.ceil(i10 / dp)) + 1;
            int ceil2 = ((int) Math.ceil(i11 / dp)) + 1;
            Bitmap bitmap = this.e3;
            if (bitmap == null || bitmap.getWidth() != ceil || this.e3.getHeight() != ceil2) {
                this.e3 = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
                this.f3 = new int[ceil * ceil2];
            }
        }
        super.onSizeChanged(i10, i11, i12, i13);
    }

    /* JADX WARN: Removed duplicated region for block: B:383:0x07d3  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0819  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x083d  */
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
        Runnable runnable;
        z0 z0Var;
        boolean z12;
        int i11;
        String string;
        p0 p0Var;
        VelocityTracker velocityTracker;
        RippleDrawable rippleDrawable;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (motionEvent.getActionMasked() == 0) {
            this.r1 = l0(x10, y3);
        }
        boolean z13 = this.r1;
        u3.c cVar = this.c;
        if (z13) {
            if (motionEvent.getActionMasked() == 1) {
                this.r1 = false;
                if (l0(x10, y3)) {
                    this.u1 = 0L;
                    invalidate();
                    if (cVar != null) {
                        ((m0) cVar.a).presentFragment(new PremiumPreviewFragment(0, "qr_emoji"));
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
        RectF rectF = this.J7;
        RectF rectF2 = this.S6;
        RectF rectF3 = this.R6;
        RectF rectF4 = this.o5;
        RectF rectF5 = this.Q6;
        RectF[] rectFArr = this.i8;
        RectF rectF6 = this.T6;
        RectF rectF7 = this.U6;
        OverScroller overScroller = this.U8;
        t0 t0Var = this.Z8;
        RectF rectF8 = this.e7;
        if (actionMasked != 0) {
            ViewConfiguration viewConfiguration = this.V8;
            if (actionMasked == 1) {
                removeCallbacks(t0Var);
                J0();
                L0();
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
                        K0();
                        return true;
                    }
                    K0();
                }
                if (this.Y8 && (velocityTracker = this.W8) != null) {
                    velocityTracker.addMovement(motionEvent);
                    this.W8.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, viewConfiguration.getScaledMaximumFlingVelocity());
                    float yVelocity2 = this.W8.getYVelocity();
                    int v02 = (int) v0();
                    if (Math.abs(yVelocity2) > viewConfiguration.getScaledMinimumFlingVelocity() && v02 > 0) {
                        overScroller.fling(0, Math.round(this.j1), 0, Math.round(-yVelocity2), 0, 0, 0, v02);
                        invalidate();
                    }
                }
                if (!this.Y8 && !this.X8 && Math.hypot(x10 - this.R8, y3 - this.S8) < AndroidUtilities.dp(10.0f)) {
                    if (this.V6 || !k0(rectF6, x10, y3)) {
                        if (this.k1 <= 0.5f) {
                            if (k0(rectF5, x10, y3)) {
                                if (this.f1 > 0.5f) {
                                    this.g1 = 0.0f;
                                    return true;
                                }
                                if (cVar != null) {
                                    ((m0) cVar.a).finishFragment();
                                    return true;
                                }
                            } else if (!this.K0 || !k0(rectF4, x10, y3)) {
                                if (this.f1 > 0.5f) {
                                    if (y3 < rectF8.top) {
                                        z11 = true;
                                        f10 = 0.0f;
                                    } else if (y3 > rectF8.bottom) {
                                        f10 = 0.0f;
                                        z11 = true;
                                    } else {
                                        int i12 = this.h1;
                                        ArrayList arrayList2 = this.I;
                                        boolean z14 = true;
                                        if (i12 == 1) {
                                            int i13 = 0;
                                            while (i13 < arrayList2.size()) {
                                                if (this.n7[i13].contains(x10, y3)) {
                                                    arrayList2.remove(i13);
                                                    b();
                                                    g0();
                                                    return z14;
                                                }
                                                i13++;
                                                z14 = true;
                                            }
                                            return z14;
                                        }
                                        getWidth();
                                        float dp2 = (this.j1 + y3) - (AndroidUtilities.dp(4.0f) + rectF8.top);
                                        if (dp2 >= 0.0f) {
                                            float dp3 = x10 - (rectF8.left + AndroidUtilities.dp(4.0f));
                                            float width2 = rectF8.width() - AndroidUtilities.dp(8.0f);
                                            if (dp3 >= 0.0f && dp3 < width2) {
                                                int i14 = this.h1;
                                                if (i14 == 2) {
                                                    if (!f0()) {
                                                        float f12 = width2 / 3.0f;
                                                        float d02 = width2 / d0();
                                                        if (dp2 >= 0.0f) {
                                                            int d03 = (d0() * ((int) ((dp2 - 0.0f) / f12))) + ((int) (dp3 / d02));
                                                            if (d03 >= 0 && d03 < arrayList.size()) {
                                                                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                                                                this.C7 = currentAnimationTimeMillis;
                                                                y0 y0Var = this.F;
                                                                if (y0Var.a == 2 && y0Var.j == d03) {
                                                                    this.D7 = currentAnimationTimeMillis;
                                                                    this.A7 = -1;
                                                                    this.y7 = 0.0f;
                                                                    setSceneFromCard(s(this.w7));
                                                                    setPattern(U());
                                                                    x0();
                                                                    return true;
                                                                }
                                                                int i15 = this.v7;
                                                                if (i15 >= 0 && i15 != d03 && this.y7 > 0.5f) {
                                                                    this.A7 = i15;
                                                                    this.D7 = currentAnimationTimeMillis;
                                                                }
                                                                this.v7 = d03;
                                                                this.x7 = 0.0f;
                                                                this.y7 = 1.0f;
                                                                E0(getWidth() / 2.0f, (l() / 2.0f) + m(), d03);
                                                                x0();
                                                                return true;
                                                            }
                                                        }
                                                    } else if (rectF.contains(x10, y3)) {
                                                        g0();
                                                        if (cVar != null) {
                                                            m0.U((m0) cVar.a);
                                                            return true;
                                                        }
                                                    }
                                                } else if (i14 == 0) {
                                                    float f13 = width2 / 6.0f;
                                                    int i16 = (((int) (dp2 / f13)) * 6) + ((int) (dp3 / f13));
                                                    if (i16 >= 0 && i16 < a.b.length) {
                                                        int X0 = X0(i16);
                                                        int i17 = q9;
                                                        if (X0 != i17 || (z0Var = this.n) == null || z0Var.a != 0 || z0Var.f != i17 || this.F.a != 0) {
                                                            int X02 = X0(i16);
                                                            this.w7 = X02;
                                                            if (this.F.a == 2) {
                                                                this.D7 = AnimationUtils.currentAnimationTimeMillis();
                                                                this.A7 = -1;
                                                                this.y7 = 0.0f;
                                                            }
                                                            setSceneFromCard(s(X02));
                                                            boolean isEmpty = arrayList2.isEmpty();
                                                            arrayList2.clear();
                                                            if (!isEmpty && (runnable = this.d2) != null) {
                                                                runnable.run();
                                                            }
                                                            if (this.F.a != 0) {
                                                                setPattern(new y0());
                                                            }
                                                            x0();
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
                                if (this.a && k0(rectF7, x10, y3)) {
                                    final int max = Math.max(0, Math.min(2, (int) ((x10 - rectF7.left) / (rectF7.width() / 3.0f))));
                                    if (this.l1 <= 0.0f && this.k1 <= 0.05f) {
                                        B0(max);
                                        return true;
                                    }
                                    this.l1 = 0.0f;
                                    g0();
                                    final int i18 = 1;
                                    postDelayed(new Runnable(this) { // from class: zh.u0
                                        public final /* synthetic */ b1 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i18) {
                                                case 0:
                                                    this.b.B0(max);
                                                    break;
                                                default:
                                                    this.b.B0(max);
                                                    break;
                                            }
                                        }
                                    }, 200L);
                                    return true;
                                }
                                if (this.a7 || !k0(rectF3, x10, y3)) {
                                    if (!this.a7 && k0(rectF2, x10, y3) && cVar != null) {
                                        ((m0) cVar.a).b0();
                                        return true;
                                    }
                                } else if (cVar != null) {
                                    ((m0) cVar.a).c0(getCurrentLink());
                                    return true;
                                }
                            } else if (this.K0) {
                                if (this.v0) {
                                    this.x0 = this.w0;
                                    this.l1 = 1.0f;
                                    j0();
                                    g0();
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
                                n1(false);
                                W0(R.drawable.msg_recent, Y(), null);
                                g0();
                                if (cVar != null) {
                                    cVar.i(1);
                                    return true;
                                }
                            }
                            return true;
                        }
                        int i19 = 0;
                        while (true) {
                            if (i19 >= 3) {
                                this.l1 = 0.0f;
                                if (rectF7.contains(x10, y3)) {
                                    final int max2 = Math.max(0, Math.min(2, (int) ((x10 - rectF7.left) / (rectF7.width() / 3.0f))));
                                    g0();
                                    final int i20 = 0;
                                    postDelayed(new Runnable(this) { // from class: zh.u0
                                        public final /* synthetic */ b1 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i20) {
                                                case 0:
                                                    this.b.B0(max2);
                                                    break;
                                                default:
                                                    this.b.B0(max2);
                                                    break;
                                            }
                                        }
                                    }, 200L);
                                    return true;
                                }
                            } else if (rectFArr[i19].contains(x10, y3)) {
                                this.l1 = 0.0f;
                                if (i19 == 0) {
                                    if (this.w0) {
                                        this.A0 = true;
                                        this.z0 = System.currentTimeMillis() + 60000;
                                    }
                                    this.A2 = -1;
                                    if (cVar == null || (p0Var = ((m0) cVar.a).e) == null) {
                                        z12 = true;
                                    } else {
                                        z12 = true;
                                        p0Var.h(true, p0Var.d == 1);
                                    }
                                    n1(z12);
                                    if (this.w0) {
                                        i11 = R.drawable.msg_recent;
                                        string = Y();
                                    } else {
                                        i11 = R.drawable.msg_retry;
                                        string = LocaleController.getString(R.string.QrNoPaidToastNewCode);
                                    }
                                    W0(i11, string, null);
                                    g0();
                                    return true;
                                }
                                if (i19 != 1) {
                                    N0(LocaleController.getString(R.string.QrNoPaidToastFeeRestored));
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
                                n1(true);
                                W0(R.drawable.msg_recent, this.w0 ? Y() : LocaleController.getString(R.string.QrNoPaidToastNoTimeLimit), null);
                                if (cVar != null) {
                                    cVar.i(this.w0 ? 1 : 2);
                                    return true;
                                }
                            } else {
                                i19++;
                            }
                        }
                    } else if (this.f1 <= 0.001f && cVar != null) {
                        m0 m0Var = (m0) cVar.a;
                        if (m0Var.getParentActivity() != null) {
                            if (m0Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                m0Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                return true;
                            }
                            m0Var.Z();
                            return true;
                        }
                    }
                }
            } else if (actionMasked != 2) {
                if (actionMasked != 3) {
                    return super.onTouchEvent(motionEvent);
                }
                removeCallbacks(t0Var);
                J0();
                L0();
                if (this.R) {
                    this.R = false;
                    K0();
                    return true;
                }
            } else if (this.R) {
                this.k0.addMovement(motionEvent);
                float f14 = x10 - this.R8;
                float f15 = y3 - this.S8;
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
                int i21 = this.b9;
                if (i21 >= 0 && (rippleDrawable = this.a9[i21]) != null) {
                    rippleDrawable.setHotspot(x10, y3);
                }
                if (this.b9 >= 0 && Math.hypot(x10 - this.R8, y3 - this.S8) > AndroidUtilities.dp(10.0f)) {
                    J0();
                }
                if (Math.hypot(x10 - this.R8, y3 - this.S8) > AndroidUtilities.dp(10.0f)) {
                    L0();
                }
                VelocityTracker velocityTracker2 = this.W8;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                if (!this.Y8 && this.f1 > 0.5f) {
                    float f16 = this.S8;
                    if (f16 > rectF8.top && Math.abs(y3 - f16) > viewConfiguration.getScaledTouchSlop()) {
                        this.Y8 = true;
                        removeCallbacks(t0Var);
                        this.S8 = y3;
                        this.T8 = this.j1;
                    }
                }
                if (this.Y8) {
                    this.j1 = Math.max(0.0f, Math.min(v0(), this.T8 - (y3 - this.S8)));
                    return true;
                }
            }
        } else {
            boolean isFinished = overScroller.isFinished();
            this.X8 = !isFinished;
            if (!isFinished) {
                overScroller.forceFinished(true);
                invalidate();
            }
            this.R8 = x10;
            this.S8 = y3;
            this.T8 = this.j1;
            this.Y8 = false;
            VelocityTracker velocityTracker3 = this.W8;
            if (velocityTracker3 == null) {
                this.W8 = VelocityTracker.obtain();
            } else {
                velocityTracker3.clear();
            }
            this.W8.addMovement(motionEvent);
            if (this.f1 < 0.5f && this.k1 < 0.5f) {
                float width3 = getWidth() * 0.745f;
                float width4 = (getWidth() - width3) / 2.0f;
                float m10 = m();
                if ((x10 <= width4 || x10 >= width4 + width3 || y3 <= m10 || y3 >= l() + m10) && ((!this.K0 || !k0(rectF4, x10, y3)) && !k0(rectF5, x10, y3) && ((this.a7 || (!k0(rectF3, x10, y3) && !k0(rectF2, x10, y3))) && !k0(rectF6, x10, y3) && !k0(rectF7, x10, y3)))) {
                    z10 = true;
                    this.R = z10;
                    if (this.f1 > 0.5f && this.h1 == 2) {
                        int d04 = d0();
                        float dp4 = x10 - (rectF8.left + AndroidUtilities.dp(4.0f));
                        float dp5 = ((this.j1 + y3) - (AndroidUtilities.dp(4.0f) + rectF8.top)) - 0.0f;
                        width = (dp4 >= 0.0f || dp5 < 0.0f || f0()) ? -1 : ((int) (dp4 / ((rectF8.width() - AndroidUtilities.dp(8.0f)) / d04))) + (((int) (dp5 / ((rectF8.width() - AndroidUtilities.dp(8.0f)) / 3.0f))) * d04);
                        if (width >= 0 && width < arrayList.size()) {
                            this.z7 = width;
                            this.B7 = AnimationUtils.currentAnimationTimeMillis();
                        }
                    }
                    if (this.f1 > 0.5f || this.h1 != 0 || y3 <= rectF8.top) {
                        f7 = 0.0f;
                    } else {
                        float dp6 = x10 - (rectF8.left + AndroidUtilities.dp(4.0f));
                        float dp7 = (this.j1 + y3) - (AndroidUtilities.dp(4.0f) + rectF8.top);
                        float width5 = (rectF8.width() - AndroidUtilities.dp(8.0f)) / 6.0f;
                        f7 = 0.0f;
                        int i22 = (dp6 < 0.0f || dp7 < 0.0f || dp6 >= 6.0f * width5) ? -1 : ((int) (dp6 / width5)) + (((int) (dp7 / width5)) * 6);
                        if (i22 >= 0 && i22 < a.b.length) {
                            this.F7 = i22;
                            this.G7 = AnimationUtils.currentAnimationTimeMillis();
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
                    removeCallbacks(t0Var);
                    if (this.k1 > 0.5f) {
                        for (int i23 = 0; i23 < 3; i23++) {
                            rectFArr[i23].contains(x10, y3);
                        }
                    }
                    J0();
                    if (this.k1 <= 0.5f) {
                        if (!k0(rectF6, x10, y3) || this.f1 > 0.001f) {
                            for (int i24 = 0; i24 < 3; i24++) {
                                if (rectFArr[i24].contains(x10, y3)) {
                                    i10 = i24;
                                    break;
                                }
                            }
                            i10 = -1;
                            if (i10 >= 0) {
                                long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                                long[] jArr = this.h9;
                                this.j9[i10] = jArr[i10] != 0 ? this.i9[i10] * ((float) Math.exp((-(currentAnimationTimeMillis2 - r6)) / 180.0f)) : f7;
                                jArr[i10] = 0;
                                this.e9[i10] = x10;
                                this.f9[i10] = y3;
                                this.g9[i10] = currentAnimationTimeMillis2;
                                this.b9 = i10;
                                invalidate();
                                return true;
                            }
                        }
                        i10 = 5;
                        if (i10 >= 0) {
                        }
                    } else {
                        if (k0(rectF5, x10, y3)) {
                            i10 = 3;
                        } else if (this.K0 && k0(rectF4, x10, y3)) {
                            i10 = 9;
                        } else {
                            if (this.f1 < 0.5f) {
                                if (!this.a7 && k0(rectF3, x10, y3)) {
                                    i10 = 4;
                                } else if (this.a7 || !k0(rectF2, x10, y3)) {
                                    if (this.V6 || !k0(rectF6, x10, y3)) {
                                        if (this.a && k0(rectF7, x10, y3)) {
                                            i10 = Math.max(0, Math.min(2, (int) ((x10 - rectF7.left) / (rectF7.width() / 3.0f)))) + 6;
                                        }
                                    }
                                    i10 = 5;
                                } else {
                                    i10 = 11;
                                }
                            }
                            if (this.f1 > 0.5f && this.h1 == 2 && f0() && k0(rectF, x10, y3)) {
                                i10 = 10;
                            }
                            i10 = -1;
                        }
                        if (i10 >= 0) {
                        }
                    }
                }
            }
            z10 = false;
            this.R = z10;
            if (this.f1 > 0.5f) {
                int d042 = d0();
                float dp42 = x10 - (rectF8.left + AndroidUtilities.dp(4.0f));
                float dp52 = ((this.j1 + y3) - (AndroidUtilities.dp(4.0f) + rectF8.top)) - 0.0f;
                if (dp42 >= 0.0f) {
                }
                if (width >= 0) {
                    this.z7 = width;
                    this.B7 = AnimationUtils.currentAnimationTimeMillis();
                }
            }
            if (this.f1 > 0.5f) {
            }
            f7 = 0.0f;
            this.S = false;
            if (this.R) {
            }
            removeCallbacks(t0Var);
            if (this.k1 > 0.5f) {
            }
            J0();
            if (this.k1 <= 0.5f) {
            }
        }
        return true;
    }

    public final void p(float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z10, boolean z11) {
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
        this.Y0[i10] = z11 ? org.telegram.ui.Cells.t0.d(random, 3.0f, 4.0f) : 0.0f;
        this.Z0[i10] = random.nextFloat() * 6.2832f;
        this.S0[i10] = f14;
        this.Q0[i10] = f15;
        this.R0[i10] = 0.0f;
        this.T0[i10] = f16;
        this.U0[i10] = 0.0f;
    }

    public final int p0() {
        int i10 = this.e6;
        SparseIntArray sparseIntArray = this.d6;
        if (i10 != 1) {
            sparseIntArray.clear();
            this.e6 = 1;
        }
        z0 z0Var = this.n;
        int i11 = z0Var != null ? z0Var.b : 0;
        int indexOfKey = sparseIntArray.indexOfKey(i11);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        int t10 = t(this.n);
        sparseIntArray.put(i11, t10);
        return t10;
    }

    public final float q1(float f7, float f10, int i10, int i11) {
        float f11 = this.w;
        double max = Math.max(f11, i10 - f11);
        float f12 = this.x;
        return (((1.0f - ((float) Math.pow(1.0f - Utilities.clamp01(((float) Math.hypot(f7 - this.w, f10 - this.x)) / (((float) Math.hypot(max, Math.max(f12, i11 - f12))) + AndroidUtilities.dp(60.0f))), 0.4166666567325592d))) * 600.0f) / 1000.0f) - 0.03f;
    }

    public final void r(int i10, float f7, int i11, float f10, int i12, float f11) {
        float f12;
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
        int i13;
        float f23;
        this.K3 = 0;
        float f24 = 7.0f;
        float f25 = 1.25f;
        float f26 = 0.75f;
        float f27 = 0.55f;
        float f28 = 1.1f;
        float f29 = 21.0f;
        float f30 = 2.0f;
        if (this.P3 != i10 || this.L3 == null) {
            this.P3 = i10;
            float f31 = 3.5f;
            f12 = 300.0f;
            Random random = new Random((i10 * 7919) + 20973);
            float dp = AndroidUtilities.dp(300.0f);
            int round = Math.round(33.46154f);
            this.L3 = new float[round];
            this.M3 = new float[round];
            this.N3 = new float[round];
            this.O3 = 0;
            int i14 = 0;
            while (true) {
                if (i14 >= round) {
                    f13 = f24;
                    f14 = f25;
                    f15 = f26;
                    f16 = f27;
                    f17 = f28;
                    f18 = f29;
                    f19 = f30;
                    f20 = f31;
                    f21 = 0.0f;
                    break;
                }
                float nextFloat = random.nextFloat();
                float dp2 = ((((((nextFloat * f26) * nextFloat) + f27) * (AndroidUtilities.dp(f29) * f28)) / f30) * f25) + AndroidUtilities.dp(f24);
                int i15 = i14 + 12;
                float f32 = -3.4028235E38f;
                f13 = f24;
                int i16 = 0;
                float f33 = 0.0f;
                float f34 = 0.0f;
                while (i16 < i15) {
                    float nextFloat2 = random.nextFloat() * dp;
                    float nextFloat3 = random.nextFloat() * dp;
                    float f35 = f25;
                    float f36 = f27;
                    float f37 = Float.MAX_VALUE;
                    float f38 = f26;
                    int i17 = 0;
                    while (i17 < this.O3) {
                        float abs = Math.abs(nextFloat2 - this.L3[i17]);
                        float f39 = f28;
                        float abs2 = Math.abs(nextFloat3 - this.M3[i17]);
                        float f40 = dp / f30;
                        if (abs > f40) {
                            abs = dp - abs;
                        }
                        if (abs2 > f40) {
                            abs2 = dp - abs2;
                        }
                        float f41 = f29;
                        float f42 = this.N3[i17];
                        float f43 = f30;
                        float f44 = f31;
                        f37 = Math.min(f37, ((((float) Math.hypot(abs, abs2)) - dp2) - (((((((f42 * f38) * f42) + f36) * (AndroidUtilities.dp(f41) * f39)) / f30) * f35) + AndroidUtilities.dp(f13))) - ((nextFloat <= 0.7f || f42 <= 0.7f) ? 0.0f : AndroidUtilities.dp(10.0f)));
                        i17++;
                        f30 = f43;
                        f28 = f39;
                        f29 = f41;
                        f31 = f44;
                    }
                    float f45 = f28;
                    float f46 = f29;
                    float f47 = f30;
                    float f48 = f31;
                    if (f37 > f32) {
                        f32 = f37;
                        f33 = nextFloat2;
                        f34 = nextFloat3;
                    }
                    i16++;
                    f30 = f47;
                    f26 = f38;
                    f25 = f35;
                    f27 = f36;
                    f28 = f45;
                    f29 = f46;
                    f31 = f48;
                }
                f14 = f25;
                f15 = f26;
                f16 = f27;
                f17 = f28;
                f18 = f29;
                f19 = f30;
                f20 = f31;
                f21 = 0.0f;
                if (this.O3 > 0 && f32 < AndroidUtilities.dp(f20)) {
                    break;
                }
                float[] fArr = this.L3;
                int i18 = this.O3;
                fArr[i18] = f33;
                this.M3[i18] = f34;
                this.N3[i18] = nextFloat;
                this.O3 = i18 + 1;
                i14++;
                f30 = f19;
                f24 = f13;
                f26 = f15;
                f25 = f14;
                f27 = f16;
                f28 = f17;
                f29 = f18;
                f31 = f20;
            }
        } else {
            f13 = 7.0f;
            f14 = 1.25f;
            f15 = 0.75f;
            f16 = 0.55f;
            f17 = 1.1f;
            f18 = 21.0f;
            f19 = 2.0f;
            f12 = 300.0f;
            f21 = 0.0f;
            f20 = 3.5f;
        }
        float dp3 = AndroidUtilities.dp(f12);
        float f49 = -f11;
        float f50 = i12 + f11;
        int ceil = (int) Math.ceil((f50 - f10) / dp3);
        int floor = ((int) Math.floor((f49 - f7) / dp3)) - 1;
        float f51 = i11 + f11;
        int ceil2 = (int) Math.ceil((f51 - f7) / dp3);
        for (int floor2 = ((int) Math.floor((f49 - f10) / dp3)) - 1; floor2 <= ceil; floor2++) {
            int i19 = floor;
            while (i19 <= ceil2) {
                int i20 = 0;
                while (i20 < this.O3 && this.K3 < 1024) {
                    float f52 = (i19 * dp3) + this.L3[i20];
                    float f53 = (floor2 * dp3) + this.M3[i20];
                    float f54 = f52 + f7;
                    float f55 = f53 + f10;
                    float f56 = f19;
                    if (f54 < f49 - AndroidUtilities.dp(20.0f) || f54 > AndroidUtilities.dp(20.0f) + f51 || f55 < f49 - AndroidUtilities.dp(20.0f) || f55 > AndroidUtilities.dp(20.0f) + f50) {
                        f22 = dp3;
                        i13 = ceil2;
                        f23 = f49;
                    } else {
                        float f57 = this.N3[i20];
                        float dp4 = ((((((f57 * f15) * f57) + f16) * (AndroidUtilities.dp(f18) * f17)) / f56) * f14) + AndroidUtilities.dp(f13);
                        float dp5 = AndroidUtilities.dp(170.0f);
                        f22 = dp3;
                        float dp6 = AndroidUtilities.dp(150.0f);
                        int round2 = Math.round(f53 / dp6);
                        int i21 = round2 - 1;
                        while (true) {
                            i13 = ceil2;
                            if (i21 > round2 + 1) {
                                f23 = f49;
                                int i22 = this.K3;
                                this.E3[i22] = (floor2 * 4096) + i20;
                                this.F3[i22] = i19;
                                this.G3[i22] = f52;
                                this.H3[i22] = f53;
                                this.I3[i22] = 1.0f;
                                this.J3[i22] = f57;
                                this.K3 = i22 + 1;
                                break;
                            }
                            float f58 = (i21 & 1) == 0 ? f21 : dp5 / f56;
                            int round3 = Math.round((f52 - f58) / dp5);
                            float f59 = f58;
                            int i23 = round3 - 1;
                            while (true) {
                                f23 = f49;
                                if (i23 <= round3 + 1) {
                                    double q02 = q0(i21, i23);
                                    int i24 = i23;
                                    float a02 = ((a0(3.7d * q02) - 0.5f) * AndroidUtilities.dp(76.0f)) + (i23 * dp5) + f59;
                                    int i25 = i21;
                                    float a03 = ((a0(5.3d * q02) - 0.5f) * AndroidUtilities.dp(64.0f)) + (i21 * dp6);
                                    float a04 = (a0(11.9d * q02) * AndroidUtilities.dp(32.0f)) + AndroidUtilities.dp(62.0f);
                                    float a05 = dp4 < f21 ? a04 * 0.66f : (((a0(q02 * 31.7d) * f13) + 5.0f) * AndroidUtilities.dp(1.0f)) + (a04 * 0.35f) + dp4 + AndroidUtilities.dp(f20);
                                    float f60 = a02 - f52;
                                    float f61 = a03 - f53;
                                    if ((f61 * f61) + (f60 * f60) < a05 * a05) {
                                        break;
                                    }
                                    i23 = i24 + 1;
                                    f49 = f23;
                                    i21 = i25;
                                }
                            }
                            i21++;
                            ceil2 = i13;
                            f49 = f23;
                        }
                    }
                    i20++;
                    f19 = f56;
                    dp3 = f22;
                    ceil2 = i13;
                    f49 = f23;
                }
                i19++;
                f19 = f19;
                dp3 = dp3;
                ceil2 = ceil2;
                f49 = f49;
            }
        }
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
            N0(null);
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
            Utilities.globalQueue.postRunnable(new r0(str, new q0(this, str, 1)));
        }
    }

    public void setGiftsOwner(long j10) {
        if (this.w1 == j10) {
            return;
        }
        this.w1 = j10;
        x9 x9Var = this.i2;
        if (x9Var != null) {
            x9Var.f();
        }
        x9 x9Var2 = new x9(this.b, j10, false);
        this.i2 = x9Var2;
        x9Var2.g = 776;
        x9Var2.e = true;
        x9Var2.j(true);
        u0();
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
            g0();
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
        this.G4 = f7;
        float f11 = 1.0f;
        if (this.I4) {
            double d = f7 * 0.86d;
            double sqrt = Math.sqrt(0.18999999999999995d) * 10.134169850289656d;
            if (f7 >= 1.0f) {
                sin = 1.0f;
            } else {
                double d10 = sqrt * d;
                sin = (float) (1.0d - (((Math.sin(d10) * (0.9d / Math.sqrt(0.18999999999999995d))) + Math.cos(d10)) * Math.exp((-9.120752865260691d) * d)));
            }
            float clamp01 = Utilities.clamp01((f7 - 0.85f) / 0.15f);
            f10 = a6.x(1.0f, sin, a6.B(clamp01, 2.0f, 3.0f, clamp01 * clamp01), sin);
        } else {
            float f12 = 1.0f - f7;
            f10 = 1.0f - (f12 * f12);
        }
        this.J4 = f10;
        int i10 = 0;
        boolean z10 = f7 < 1.0f;
        setTranslationY(z10 ? (1.0f - f10) * AndroidUtilities.dp(64.0f) : 0.0f);
        setScaleX(1.0f);
        setScaleY(1.0f);
        if (z10) {
            f11 = Utilities.clamp01(f10 / (this.I4 ? 0.15f : 0.35f));
        }
        setAlpha(f11);
        if (getParent() instanceof View) {
            ((View) getParent()).setBackgroundColor(z10 ? a(f10, TLObject.FLAG_30) : 0);
        }
        if (z10 != getClipToOutline()) {
            setClipToOutline(z10);
            invalidateOutline();
        }
        this.s0.D = (z10 && this.I4) ? Utilities.clamp01(f10) : -1.0f;
        if (z10 && f7 > 0.0f) {
            i10 = 2;
        }
        if (getLayerType() != i10) {
            setLayerType(i10, null);
        }
        invalidate();
    }

    public void setRevealOpening(boolean z10) {
        this.I4 = z10;
    }

    public void setScanHidden(boolean z10) {
        if (this.V6 != z10) {
            this.V6 = z10;
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

    public final void u0() {
        int i10;
        x9 x9Var = this.i2;
        if (x9Var == null) {
            return;
        }
        y0 y0Var = this.F;
        int i11 = y0Var.a;
        ArrayList arrayList = this.v1;
        long j10 = (i11 != 2 || (i10 = y0Var.j) < 0 || i10 >= arrayList.size()) ? 0L : ((TL_stars.TL_starGiftUnique) arrayList.get(this.F.j)).id;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = j10 != 0 ? (TL_stars.TL_starGiftUnique) arrayList.get(this.F.j) : null;
        arrayList.clear();
        HashMap hashMap = this.y1;
        hashMap.clear();
        ArrayList arrayList2 = x9Var.l;
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
            this.F.j = i12;
            this.v7 = i12;
        }
        boolean z10 = x9Var.j;
        this.x1 = z10;
        if (!z10 && !x9Var.i) {
            x9Var.a();
        }
        if (!arrayList.isEmpty() && !this.l2) {
            this.l2 = true;
            t0 t0Var = this.k2;
            removeCallbacks(t0Var);
            postDelayed(t0Var, 900L);
        }
        invalidate();
    }

    public final Drawable v(int i10) {
        return getContext().getResources().getDrawable(i10).mutate();
    }

    public final float v0() {
        float f7;
        int d02;
        int dp;
        int dp2;
        float f10;
        float C = wh.C(10.0f, 2, getWidth()) - AndroidUtilities.dp(8.0f);
        int i10 = this.h1;
        if (i10 != 0) {
            if (i10 == 1) {
                f7 = C / 6.0f;
                f10 = 0.0f;
            } else if (f0()) {
                f7 = 0.0f;
                f10 = 0.0f;
            } else {
                f7 = C / 3.0f;
                d02 = ((d0() + this.v1.size()) - 1) / d0();
                dp = AndroidUtilities.dp(4.0f) - AndroidUtilities.dp(32.0f);
                dp2 = AndroidUtilities.dp(4.0f);
            }
            d02 = 0;
            return Math.max(0.0f, (((d02 * f7) + f10) + AndroidUtilities.dp(32.0f)) - U0());
        }
        f7 = C / 6.0f;
        d02 = (a.b.length + 5) / 6;
        dp = AndroidUtilities.dp(4.0f) - AndroidUtilities.dp(32.0f);
        dp2 = AndroidUtilities.dp(4.0f);
        f10 = dp2 + dp;
        return Math.max(0.0f, (((d02 * f7) + f10) + AndroidUtilities.dp(32.0f)) - U0());
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        uj0 uj0Var;
        return (drawable instanceof RippleDrawable) || drawable == this.L0 || drawable == this.Z1 || ((uj0Var = this.V7) != null && drawable == uj0Var) || super.verifyDrawable(drawable);
    }

    public final PorterDuffColorFilter w0(y0 y0Var) {
        float[] fArr = e1.b;
        int i10 = ((int) (fArr[30] * 10.0f)) ^ (y0Var.l * 31);
        if (this.Q3 == null || this.R3 != i10) {
            this.R3 = i10;
            this.Q3 = new PorterDuffColorFilter(i0.b.f(fArr[30] / 100.0f, y0Var.l, -1), PorterDuff.Mode.SRC_IN);
        }
        return this.Q3;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03f3 A[EDGE_INSN: B:112:0x03f3->B:113:0x03f3 BREAK  A[LOOP:3: B:102:0x0390->B:109:0x03bd], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0737 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x083d  */
    /* JADX WARN: Removed duplicated region for block: B:201:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0765  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x07ff  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x081a  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0829  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x034d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(Canvas canvas, int i10, int i11) {
        z0 z0Var;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float min;
        long j10;
        float f15;
        int i12;
        float f16;
        float[] fArr;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        int i13;
        y0 y0Var;
        boolean z10;
        float f26;
        float f27;
        boolean z11;
        int i14;
        int i15;
        float f28;
        float f29;
        int ceil;
        int ceil2;
        Bitmap bitmap;
        int i16;
        boolean z12;
        float f30;
        Canvas canvas2 = canvas;
        int i17 = i10;
        int i18 = i11;
        z0 z0Var2 = this.n;
        if (z0Var2 == null) {
            z0Var2 = null;
        } else if (this.s < 1.0f && (z0Var = this.r) != null) {
            z0Var2 = z0Var;
        }
        L(canvas2, z0Var2, i17, i18);
        float f31 = this.s;
        if (f31 < 1.0f && this.r != null) {
            float r12 = r1(f31);
            float f32 = this.w;
            double max = Math.max(f32, i17 - f32);
            float f33 = this.x;
            float hypot = (((float) Math.hypot(max, Math.max(f33, i18 - f33))) + AndroidUtilities.dp(60.0f)) * r12;
            canvas2.save();
            Path path = this.G1;
            path.rewind();
            path.addCircle(this.w, this.x, hypot, Path.Direction.CW);
            canvas2.clipPath(path);
            L(canvas2, this.n, i17, i18);
            canvas2.restore();
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        float f34 = 1000.0f;
        float f35 = (currentAnimationTimeMillis - this.y) / 1000.0f;
        this.a3 = f35;
        float f36 = this.u3;
        float max2 = f36 < 0.0f ? 0.0f : Math.max(0.0f, Math.min(0.05f, f35 - f36));
        float f37 = this.a3;
        this.u3 = f37;
        boolean z13 = this.R || this.T || this.U;
        if (z13) {
            f7 = 0.05f;
            this.v3 = f37 + 0.25f;
        } else {
            f7 = 0.05f;
        }
        float f38 = (z13 || f37 < this.v3) ? 0.0f : 1.0f;
        float f39 = this.s3;
        float f40 = f38;
        float f41 = f38 < f39 ? 0.07f : 0.45f;
        if (max2 > 0.0f) {
            float f42 = (-max2) / f41;
            f10 = 0.0f;
            this.s3 = a6.x(1.0f, (float) Math.exp(f42), f40 - f39, f39);
        } else {
            f10 = 0.0f;
        }
        float f43 = max2 * this.s3;
        this.t3 = f43;
        this.r3 = this.r3 + f43;
        double radians = (float) Math.toRadians((r8 * (-0.763f)) % 360.0f);
        Math.cos(radians);
        Math.sin(radians);
        float f44 = this.a3;
        if (this.M >= f10) {
            float f45 = this.t3;
            if (f45 > f10) {
                float f46 = this.r3 - (f45 / 2.0f);
                f13 = 0.016f;
                f11 = 1.0f;
                f14 = 0.6f;
                double sin = (((float) Math.sin((f46 * 0.016f) + 1.0f)) * 0.6f) + (((float) Math.sin(f46 * 0.025f)) * 1.2f) + m9;
                f12 = 2.0f;
                this.K = a6.t(((float) Math.cos(sin)) * 6.2f, AndroidUtilities.dp(1.0f), f45, this.K);
                this.L = a6.t(((float) Math.sin(sin)) * 6.2f, AndroidUtilities.dp(1.0f), f45, this.L);
                float f47 = this.M;
                min = f47 < f10 ? Math.min(0.033f, Math.max(f10, f44 - f47)) : f10;
                Math.exp((-min) / 0.09f);
                this.M = f44;
                int i19 = 2;
                if (min > f10) {
                    x0 x0Var = this.q3;
                    int i20 = x0Var.m;
                    int[] iArr = x0Var.l;
                    if (i20 > 0) {
                        float f48 = min / f12;
                        int i21 = 0;
                        boolean z14 = false;
                        while (i21 < i19) {
                            float[] fArr2 = x0Var.c;
                            int i22 = i19;
                            float[] fArr3 = x0Var.j;
                            float[] fArr4 = x0Var.i;
                            float f49 = f34;
                            float[] fArr5 = x0Var.h;
                            float[] fArr6 = x0Var.g;
                            long j11 = currentAnimationTimeMillis;
                            float[] fArr7 = x0Var.f;
                            float[] fArr8 = x0Var.e;
                            float[] fArr9 = x0Var.d;
                            float sqrt = ((float) Math.sqrt(220.0d)) * 1.24f;
                            boolean z15 = false;
                            for (int i23 = 0; i23 < x0Var.m; i23++) {
                                int i24 = iArr[i23];
                                float f50 = fArr2[i24];
                                if (f50 != 0.0f || fArr9[i24] != 0.0f || fArr8[i24] != 0.0f || fArr7[i24] != 0.0f || fArr6[i24] != 0.0f || fArr5[i24] != 0.0f || fArr4[i24] != 0.0f || fArr3[i24] != 0.0f) {
                                    float f51 = fArr8[i24];
                                    float f52 = (((f50 * (-220.0f)) - (sqrt * f51)) * f48) + f51;
                                    fArr8[i24] = f52;
                                    fArr2[i24] = (f52 * f48) + fArr2[i24];
                                    float f53 = fArr7[i24];
                                    float f54 = (((fArr9[i24] * (-220.0f)) - (sqrt * f53)) * f48) + f53;
                                    fArr7[i24] = f54;
                                    fArr9[i24] = (f54 * f48) + fArr9[i24];
                                    float f55 = fArr5[i24];
                                    float f56 = (((fArr6[i24] * (-220.0f)) - (sqrt * f55)) * f48) + f55;
                                    fArr5[i24] = f56;
                                    fArr6[i24] = (f56 * f48) + fArr6[i24];
                                    float f57 = fArr3[i24];
                                    float f58 = (((fArr4[i24] * (-220.0f)) - (sqrt * f57)) * f48) + f57;
                                    fArr3[i24] = f58;
                                    fArr4[i24] = (f58 * f48) + fArr4[i24];
                                    if (Math.abs(fArr7[i24]) + Math.abs(fArr8[i24]) + Math.abs(fArr9[i24]) + Math.abs(fArr2[i24]) < f7) {
                                        if (Math.abs(fArr5[i24]) + Math.abs(fArr6[i24]) < 0.02f) {
                                            if (Math.abs(fArr3[i24]) + Math.abs(fArr4[i24]) < 5.0E-4f) {
                                                fArr3[i24] = 0.0f;
                                                fArr4[i24] = 0.0f;
                                                fArr5[i24] = 0.0f;
                                                fArr6[i24] = 0.0f;
                                                fArr7[i24] = 0.0f;
                                                fArr8[i24] = 0.0f;
                                                fArr9[i24] = 0.0f;
                                                fArr2[i24] = 0.0f;
                                            }
                                        }
                                    }
                                    z15 = true;
                                }
                            }
                            z14 |= z15;
                            i21++;
                            i19 = i22;
                            f34 = f49;
                            currentAnimationTimeMillis = j11;
                        }
                        j10 = currentAnimationTimeMillis;
                        f15 = f34;
                        i12 = i19;
                        if (!z14 && (this.s >= f11 || this.r == null)) {
                            for (int i25 = 0; i25 < x0Var.m; i25++) {
                                x0Var.b[iArr[i25]] = false;
                            }
                            x0Var.m = 0;
                        }
                        f16 = 0.35f;
                        if (this.T) {
                            float f59 = (j10 - this.V) / f15;
                            float exp = (f11 - ((float) Math.exp((-f59) / 0.35f))) * 0.35f;
                            this.N = (this.c0 * exp) + this.a0;
                            this.O = (this.d0 * exp) + this.b0;
                            if (f59 > 2.8f) {
                                this.T = false;
                            }
                        }
                        if (this.U) {
                            float f60 = (j10 - this.W) / f15;
                            float cos = (float) (Math.cos((f60 * 6.283185307179586d) / 0.8500000238418579d) * Math.exp((-f60) / 0.22f));
                            this.e0 = this.i0 * cos;
                            this.f0 = this.j0 * cos;
                            if (f60 > 1.6f) {
                                this.U = false;
                                this.f0 = 0.0f;
                                this.e0 = 0.0f;
                            }
                        }
                        fArr = e1.b;
                        f17 = fArr[27] / 100.0f;
                        while (true) {
                            f18 = this.a3;
                            f19 = this.k3 + this.l3;
                            f20 = 1.5f;
                            f21 = f16;
                            if (f18 < f19) {
                                break;
                            }
                            this.k3 = f19;
                            float f61 = fArr[25] + 0.2f;
                            float f62 = fArr[26];
                            y0 y0Var2 = this.F;
                            if (y0Var2 == null || y0Var2.a != 1) {
                                f20 = f11;
                            }
                            this.l3 = Math.max(f61, (this.e1.nextFloat() * 0.8f * f17) + (f62 * f20));
                            double radians2 = Math.toRadians(((r10.nextFloat() - 0.5f) * 12.0f * f17) + fArr[24]);
                            this.m3 = (float) Math.cos(radians2);
                            this.n3 = (float) Math.sin(radians2);
                            f16 = f21;
                        }
                        if (!this.i3) {
                            this.i3 = true;
                            this.k3 = (fArr[51] / f15) + f18 + 1.5f;
                            this.l3 = f15;
                        }
                        f22 = this.k3;
                        f23 = fArr[25];
                        if (f18 >= f22 + f23 && this.l3 > 999.0f) {
                            this.l3 = fArr[26];
                        }
                        float f63 = (f18 - f22) / f23;
                        this.d3 = f63 < 0.0f && f63 < f11;
                        this.c3 = AndroidUtilities.dpf2(fArr[23]);
                        if (this.d3) {
                            float cos2 = 0.5f - (((float) Math.cos(f63 * 3.141592653589793d)) * 0.5f);
                            float v = (this.c3 * 3.0f) + a6.v(Math.abs(this.n3), i18, Math.abs(this.m3) * i17, f12);
                            this.b3 = AndroidUtilities.lerp(-v, v, cos2);
                            this.j3 = f11;
                        }
                        long nanoTime = System.nanoTime();
                        float min2 = this.B6 == 0 ? f13 : Math.min(0.1f, (nanoTime - r11) / 1.0E9f);
                        this.B6 = nanoTime;
                        if (fArr[15] < 0.5f) {
                            this.x6 = 0.0f;
                            f25 = 1.6f;
                            f24 = 100.0f;
                        } else {
                            float max3 = 30.0f / Math.max(1.0f, fArr[16]);
                            float max4 = Math.max(-1.0f, Math.min(1.0f, this.m6 * max3));
                            float max5 = Math.max(-1.0f, Math.min(1.0f, this.n6 * max3));
                            if (!this.C6) {
                                this.y6 = max4;
                                this.z6 = max5;
                                this.C6 = true;
                            }
                            f24 = 100.0f;
                            f25 = 1.6f;
                            float hypot2 = ((float) Math.hypot(max4 - this.y6, max5 - this.z6)) / min2;
                            this.y6 = max4;
                            this.z6 = max5;
                            long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                            if (hypot2 > 0.15f) {
                                this.A6 = currentAnimationTimeMillis2;
                            }
                            boolean z16 = currentAnimationTimeMillis2 - this.A6 < 1500;
                            float A = a6.A(max5, -this.n3, max4 * (-this.m3), a6.v(Math.abs(this.n3), i18, Math.abs(this.m3) * i17, 2.0f) + this.c3);
                            if (this.x6 <= 0.001f) {
                                this.w6 = A;
                            }
                            float f64 = this.w6;
                            this.w6 = a6.x(1.0f, (float) Math.exp((-min2) / 0.1f), A - f64, f64);
                            float f65 = this.x6;
                            float c10 = z16 ? org.telegram.ui.Cells.t0.c(min2, 0.2f, f65, 1.0f) : org.telegram.ui.Cells.t0.v(min2, f14, f65, 0.0f);
                            this.x6 = c10;
                            if (c10 > 0.001f) {
                                float B = a6.B(c10, 2.0f, 3.0f, c10 * c10);
                                if (this.d3) {
                                    this.b3 = AndroidUtilities.lerp(this.b3, this.w6, B);
                                    this.j3 = AndroidUtilities.lerp(this.j3, 1.0f, B);
                                } else {
                                    this.b3 = this.w6;
                                    this.j3 = B;
                                }
                                this.d3 = true;
                                if (this.x6 >= 0.999f) {
                                    this.k3 = this.a3;
                                }
                            }
                        }
                        if (this.d3 && this.F.a != 0) {
                            f29 = fArr[46] / f24;
                            if (f29 > 0.0f && i17 > 0 && i18 > 0) {
                                float dp = AndroidUtilities.dp(12.0f);
                                float f66 = i17;
                                ceil = ((int) Math.ceil(f66 / dp)) + 1;
                                float f67 = i18;
                                ceil2 = ((int) Math.ceil(f67 / dp)) + 1;
                                bitmap = this.e3;
                                if (bitmap != null || bitmap.getWidth() != ceil || this.e3.getHeight() != ceil2) {
                                    this.e3 = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
                                    this.f3 = new int[ceil * ceil2];
                                }
                                float max6 = Math.max(1.0f, fArr[45]);
                                float f68 = fArr[47] / f24;
                                float f69 = f29 * 0.0275f;
                                float dp2 = AndroidUtilities.dp(130.0f);
                                i13 = 16777215;
                                float f70 = this.a3 * 0.12f;
                                i16 = 0;
                                z12 = false;
                                while (i16 < ceil2) {
                                    int i26 = 0;
                                    while (i26 < ceil) {
                                        float f71 = f69;
                                        float f72 = i26 * dp;
                                        int i27 = ceil2;
                                        float f73 = i16 * dp;
                                        V0(f72, f73, i17, i18);
                                        float f74 = this.U3 / max6;
                                        if (f74 >= 3.5f || f74 <= -3.5f) {
                                            f30 = 0.0f;
                                        } else {
                                            f30 = ((float) Math.exp((-0.5f) * f74 * f74)) * this.V3;
                                            if (f68 > 0.0f) {
                                                float v10 = a6.v(f73 - (f67 / 2.0f), this.m3, (f72 - (f66 / 2.0f)) * (-this.n3), dp2);
                                                f30 *= (((((o1(((v10 * 2.3f) - (1.7f * f70)) + 11.3f) * f21) + (o1(v10 + f70) * 0.65f)) * 2.0f) - 1.0f) * f68) + 1.0f;
                                            }
                                        }
                                        int max7 = Math.max(0, Math.min(255, Math.round(f71 * 255.0f * f30)));
                                        if (max7 > 0) {
                                            z12 = true;
                                        }
                                        this.f3[(i16 * ceil) + i26] = (max7 << 24) | 16777215;
                                        i26++;
                                        i17 = i10;
                                        i18 = i11;
                                        f69 = f71;
                                        ceil2 = i27;
                                    }
                                    i16++;
                                    i17 = i10;
                                    i18 = i11;
                                }
                                int i28 = ceil2;
                                if (z12) {
                                    this.e3.setPixels(this.f3, 0, ceil, 0, 0, ceil, i28);
                                    float f75 = (-dp) / 2.0f;
                                    float f76 = dp / 2.0f;
                                    float f77 = (ceil * dp) - f76;
                                    float f78 = (i28 * dp) - f76;
                                    RectF rectF = this.h3;
                                    rectF.set(f75, f75, f77, f78);
                                    canvas2.drawBitmap(this.e3, (Rect) null, rectF, this.g3);
                                }
                                float f79 = (j10 - this.H) / 1000.0f;
                                y0Var = this.G;
                                if (y0Var != null) {
                                    if (f79 < (this.F.h ? 0.6f : 0.3f) + 0.135f + 0.315f) {
                                        z10 = true;
                                        if (!z10 && y0Var != null) {
                                            I0(y0Var);
                                            this.G = null;
                                        }
                                        if (z10) {
                                            y0 y0Var3 = this.G;
                                            if (y0Var3.a == 1) {
                                                y0 y0Var4 = this.F;
                                                if (y0Var4.a == 1) {
                                                    i14 = i10;
                                                    i15 = i11;
                                                    f26 = 0.45f;
                                                    C(canvas2, i14, i15, y0Var3, y0Var4, f79, false, false);
                                                    f28 = this.s;
                                                    if (f28 >= 1.0f || this.r == null) {
                                                        return;
                                                    }
                                                    float r13 = r1(f28);
                                                    float f80 = this.w;
                                                    double max8 = Math.max(f80, i14 - f80);
                                                    float f81 = this.x;
                                                    float hypot3 = (((float) Math.hypot(max8, Math.max(f81, i15 - f81))) + AndroidUtilities.dp(60.0f)) * r13;
                                                    float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(90.0f), AndroidUtilities.dp(56.0f), r13);
                                                    float clamp01 = Utilities.clamp01((1.0f - this.s) * f25) * 0.38f;
                                                    if (hypot3 > AndroidUtilities.dp(4.0f)) {
                                                        float max9 = Math.max(0.0f, hypot3 - lerp) / hypot3;
                                                        int i29 = h.i(0.55f, this.n.b, -1) & i13;
                                                        float dp3 = hypot3 + AndroidUtilities.dp(8.0f);
                                                        float f82 = this.w;
                                                        float f83 = this.x;
                                                        int[] iArr2 = {i29, a(clamp01, 855638016 | i29), a(clamp01, (-1728053248) | i29), a(clamp01, (-16777216) | i29), a(clamp01, 1711276032 | i29), i29};
                                                        float f84 = (max9 * hypot3) / dp3;
                                                        float lerp2 = (AndroidUtilities.lerp(max9, 1.0f, f26) * hypot3) / dp3;
                                                        float lerp3 = (AndroidUtilities.lerp(max9, 1.0f, 0.82f) * hypot3) / dp3;
                                                        float[] fArr10 = new float[6];
                                                        fArr10[0] = f84;
                                                        fArr10[1] = lerp2;
                                                        fArr10[i12] = lerp3;
                                                        fArr10[3] = (hypot3 / dp3) - 0.004f;
                                                        fArr10[4] = (AndroidUtilities.dp(3.0f) + hypot3) / dp3;
                                                        fArr10[5] = 1.0f;
                                                        RadialGradient radialGradient = new RadialGradient(f82, f83, dp3, iArr2, fArr10, Shader.TileMode.CLAMP);
                                                        Paint paint = this.A1;
                                                        paint.setShader(radialGradient);
                                                        paint.setStyle(Paint.Style.FILL);
                                                        canvas2.drawCircle(this.w, this.x, hypot3 + AndroidUtilities.dp(8.0f), paint);
                                                        paint.setShader(null);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            }
                                        }
                                        f26 = 0.45f;
                                        if (z10 || !this.F.h) {
                                            if (z10) {
                                                D(canvas, i10, i11, this.G, true, this.F.a == 0, f79);
                                                f79 = f79;
                                            }
                                            y0 y0Var5 = this.F;
                                            if (z10 || this.G.a == 0) {
                                                f27 = f79;
                                                z11 = true;
                                            } else {
                                                f27 = f79;
                                                z11 = false;
                                            }
                                            if (!z10) {
                                                f27 = 100.0f;
                                            }
                                            canvas2 = canvas;
                                            i14 = i10;
                                            i15 = i11;
                                            D(canvas2, i14, i15, y0Var5, false, z11, f27);
                                        } else if (this.s >= 1.0f || this.r == null) {
                                            I0(this.G);
                                            this.G = null;
                                            canvas2 = canvas;
                                            i14 = i10;
                                            i15 = i11;
                                            D(canvas2, i14, i15, this.F, false, true, 100.0f);
                                        } else {
                                            float f85 = this.w;
                                            double max10 = Math.max(f85, i10 - f85);
                                            float f86 = this.x;
                                            float r14 = r1(this.s) * (((float) Math.hypot(max10, Math.max(f86, i11 - f86))) + AndroidUtilities.dp(60.0f));
                                            Path path2 = this.w3;
                                            path2.rewind();
                                            path2.addCircle(this.w, this.x, r14, Path.Direction.CW);
                                            canvas2.save();
                                            b0.b(canvas2, path2);
                                            D(canvas2, i10, i11, this.G, true, this.F.a == 0, -1.0f);
                                            canvas2.restore();
                                            canvas2.save();
                                            canvas2.clipPath(path2);
                                            i14 = i10;
                                            i15 = i11;
                                            D(canvas2, i14, i15, this.F, false, this.G.a == 0, 100.0f);
                                            canvas.restore();
                                            canvas2 = canvas;
                                        }
                                        f28 = this.s;
                                        if (f28 >= 1.0f) {
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                z10 = false;
                                if (!z10) {
                                    I0(y0Var);
                                    this.G = null;
                                }
                                if (z10) {
                                }
                                f26 = 0.45f;
                                if (z10) {
                                }
                                if (z10) {
                                }
                                y0 y0Var52 = this.F;
                                if (z10) {
                                }
                                f27 = f79;
                                z11 = true;
                                if (!z10) {
                                }
                                canvas2 = canvas;
                                i14 = i10;
                                i15 = i11;
                                D(canvas2, i14, i15, y0Var52, false, z11, f27);
                                f28 = this.s;
                                if (f28 >= 1.0f) {
                                }
                            }
                        }
                        i13 = 16777215;
                        float f792 = (j10 - this.H) / 1000.0f;
                        y0Var = this.G;
                        if (y0Var != null) {
                        }
                        z10 = false;
                        if (!z10) {
                        }
                        if (z10) {
                        }
                        f26 = 0.45f;
                        if (z10) {
                        }
                        if (z10) {
                        }
                        y0 y0Var522 = this.F;
                        if (z10) {
                        }
                        f27 = f792;
                        z11 = true;
                        if (!z10) {
                        }
                        canvas2 = canvas;
                        i14 = i10;
                        i15 = i11;
                        D(canvas2, i14, i15, y0Var522, false, z11, f27);
                        f28 = this.s;
                        if (f28 >= 1.0f) {
                        }
                    }
                }
                j10 = currentAnimationTimeMillis;
                f15 = 1000.0f;
                i12 = 2;
                f16 = 0.35f;
                if (this.T) {
                }
                if (this.U) {
                }
                fArr = e1.b;
                f17 = fArr[27] / 100.0f;
                while (true) {
                    f18 = this.a3;
                    f19 = this.k3 + this.l3;
                    f20 = 1.5f;
                    f21 = f16;
                    if (f18 < f19) {
                    }
                    this.l3 = Math.max(f61, (this.e1.nextFloat() * 0.8f * f17) + (f62 * f20));
                    double radians22 = Math.toRadians(((r10.nextFloat() - 0.5f) * 12.0f * f17) + fArr[24]);
                    this.m3 = (float) Math.cos(radians22);
                    this.n3 = (float) Math.sin(radians22);
                    f16 = f21;
                }
                if (!this.i3) {
                }
                f22 = this.k3;
                f23 = fArr[25];
                if (f18 >= f22 + f23) {
                    this.l3 = fArr[26];
                }
                float f632 = (f18 - f22) / f23;
                this.d3 = f632 < 0.0f && f632 < f11;
                this.c3 = AndroidUtilities.dpf2(fArr[23]);
                if (this.d3) {
                }
                long nanoTime2 = System.nanoTime();
                if (this.B6 == 0) {
                }
                this.B6 = nanoTime2;
                if (fArr[15] < 0.5f) {
                }
                if (this.d3) {
                    f29 = fArr[46] / f24;
                    if (f29 > 0.0f) {
                        float dp4 = AndroidUtilities.dp(12.0f);
                        float f662 = i17;
                        ceil = ((int) Math.ceil(f662 / dp4)) + 1;
                        float f672 = i18;
                        ceil2 = ((int) Math.ceil(f672 / dp4)) + 1;
                        bitmap = this.e3;
                        if (bitmap != null) {
                        }
                        this.e3 = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
                        this.f3 = new int[ceil * ceil2];
                        float max62 = Math.max(1.0f, fArr[45]);
                        float f682 = fArr[47] / f24;
                        float f692 = f29 * 0.0275f;
                        float dp22 = AndroidUtilities.dp(130.0f);
                        i13 = 16777215;
                        float f702 = this.a3 * 0.12f;
                        i16 = 0;
                        z12 = false;
                        while (i16 < ceil2) {
                        }
                        int i282 = ceil2;
                        if (z12) {
                        }
                        float f7922 = (j10 - this.H) / 1000.0f;
                        y0Var = this.G;
                        if (y0Var != null) {
                        }
                        z10 = false;
                        if (!z10) {
                        }
                        if (z10) {
                        }
                        f26 = 0.45f;
                        if (z10) {
                        }
                        if (z10) {
                        }
                        y0 y0Var5222 = this.F;
                        if (z10) {
                        }
                        f27 = f7922;
                        z11 = true;
                        if (!z10) {
                        }
                        canvas2 = canvas;
                        i14 = i10;
                        i15 = i11;
                        D(canvas2, i14, i15, y0Var5222, false, z11, f27);
                        f28 = this.s;
                        if (f28 >= 1.0f) {
                        }
                    }
                }
                i13 = 16777215;
                float f79222 = (j10 - this.H) / 1000.0f;
                y0Var = this.G;
                if (y0Var != null) {
                }
                z10 = false;
                if (!z10) {
                }
                if (z10) {
                }
                f26 = 0.45f;
                if (z10) {
                }
                if (z10) {
                }
                y0 y0Var52222 = this.F;
                if (z10) {
                }
                f27 = f79222;
                z11 = true;
                if (!z10) {
                }
                canvas2 = canvas;
                i14 = i10;
                i15 = i11;
                D(canvas2, i14, i15, y0Var52222, false, z11, f27);
                f28 = this.s;
                if (f28 >= 1.0f) {
                }
            }
        }
        f11 = 1.0f;
        f12 = 2.0f;
        f13 = 0.016f;
        f14 = 0.6f;
        float f472 = this.M;
        if (f472 < f10) {
        }
        Math.exp((-min) / 0.09f);
        this.M = f44;
        int i192 = 2;
        if (min > f10) {
        }
        j10 = currentAnimationTimeMillis;
        f15 = 1000.0f;
        i12 = 2;
        f16 = 0.35f;
        if (this.T) {
        }
        if (this.U) {
        }
        fArr = e1.b;
        f17 = fArr[27] / 100.0f;
        while (true) {
            f18 = this.a3;
            f19 = this.k3 + this.l3;
            f20 = 1.5f;
            f21 = f16;
            if (f18 < f19) {
            }
            this.l3 = Math.max(f61, (this.e1.nextFloat() * 0.8f * f17) + (f62 * f20));
            double radians222 = Math.toRadians(((r10.nextFloat() - 0.5f) * 12.0f * f17) + fArr[24]);
            this.m3 = (float) Math.cos(radians222);
            this.n3 = (float) Math.sin(radians222);
            f16 = f21;
        }
        if (!this.i3) {
        }
        f22 = this.k3;
        f23 = fArr[25];
        if (f18 >= f22 + f23) {
        }
        float f6322 = (f18 - f22) / f23;
        this.d3 = f6322 < 0.0f && f6322 < f11;
        this.c3 = AndroidUtilities.dpf2(fArr[23]);
        if (this.d3) {
        }
        long nanoTime22 = System.nanoTime();
        if (this.B6 == 0) {
        }
        this.B6 = nanoTime22;
        if (fArr[15] < 0.5f) {
        }
        if (this.d3) {
        }
        i13 = 16777215;
        float f792222 = (j10 - this.H) / 1000.0f;
        y0Var = this.G;
        if (y0Var != null) {
        }
        z10 = false;
        if (!z10) {
        }
        if (z10) {
        }
        f26 = 0.45f;
        if (z10) {
        }
        if (z10) {
        }
        y0 y0Var522222 = this.F;
        if (z10) {
        }
        f27 = f792222;
        z11 = true;
        if (!z10) {
        }
        canvas2 = canvas;
        i14 = i10;
        i15 = i11;
        D(canvas2, i14, i15, y0Var522222, false, z11, f27);
        f28 = this.s;
        if (f28 >= 1.0f) {
        }
    }

    public final void x0() {
        u3.c cVar;
        p0 p0Var;
        if (this.e2 || (cVar = this.c) == null || (p0Var = ((m0) cVar.a).e) == null) {
            return;
        }
        p0Var.f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:251:0x019f, code lost:
    
        if (r7 > 1500) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x07da  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x098f  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x07b5  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03b9  */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v54, types: [int] */
    /* JADX WARN: Type inference failed for: r3v87 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(Canvas canvas, int i10) {
        int i11;
        float f7;
        float f10;
        float f11;
        long currentTimeMillis;
        float t10;
        float f12;
        int i12;
        StaticLayout staticLayout;
        TextPaint textPaint;
        String str;
        int i13;
        int i14;
        TextPaint textPaint2;
        float f13;
        StaticLayout staticLayout2;
        String str2;
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        boolean[] zArr;
        float[] fArr4;
        float[] fArr5;
        float[] fArr6;
        float f14;
        int i15;
        int i16;
        Paint paint;
        float f15;
        float f16;
        boolean[] zArr2;
        float f17;
        boolean z10;
        char c10;
        float f18;
        Random random;
        float f19;
        int i17;
        float f20;
        Random random2;
        int i18;
        float f21;
        int i19;
        Canvas canvas2 = canvas;
        canvas2.save();
        float lerp = this.G4 >= 1.0f ? 1.0f : this.I4 ? AndroidUtilities.lerp(0.9f, 1.0f, this.J4) : AndroidUtilities.lerp(0.92f, 1.0f, this.J4);
        float clamp01 = 1.0f - (this.n2 == 0 ? 1.0f : Utilities.clamp01((AnimationUtils.currentAnimationTimeMillis() - this.n2) / 320.0f));
        float i20 = (((this.p2 - 1.0f) * clamp01 * clamp01) + i(0.03f, 0.005f, this.n2)) * lerp;
        if (this.r0 != 0) {
            float currentAnimationTimeMillis = (AnimationUtils.currentAnimationTimeMillis() - this.r0) / 360.0f;
            if (currentAnimationTimeMillis >= 1.0f) {
                this.r0 = 0L;
            } else if (currentAnimationTimeMillis > 0.0f) {
                i20 *= 1.0f - ((1.0f - (currentAnimationTimeMillis * 0.3f)) * (((float) Math.sin(currentAnimationTimeMillis * 3.141592653589793d)) * 0.03f));
            }
        }
        float f22 = i10;
        canvas2.scale(i20, i20, f22 / 2.0f, (l() / 2.0f) + m());
        float width = getWidth() * 0.745f;
        float l4 = l();
        float f23 = (f22 - width) / 2.0f;
        float m10 = m();
        float f24 = f23 + width;
        float f25 = l4 + m10;
        RectF rectF = this.H1;
        rectF.set(f23, m10, f24, f25);
        Paint paint2 = this.D1;
        paint2.setColor(-1);
        float f26 = 4.0f;
        paint2.setShadowLayer(AndroidUtilities.dp(24.0f), 0.0f, AndroidUtilities.dp(4.0f), i0.b.o(i0.b.f(0.4f, H0(), -16777216), 16));
        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), paint2);
        paint2.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        h hVar = this.s0;
        hVar.r.set(f23, m10, f24, f25);
        int H0 = H0();
        float f27 = 0.7f * width;
        float f28 = (width - f27) / 2.0f;
        float f29 = f23 + f28;
        float lerp2 = AndroidUtilities.lerp(width * 0.12f, f28, this.C2) + m10;
        if (hVar.y != H0 || hVar.z == null) {
            hVar.y = H0;
            hVar.z = new PorterDuffColorFilter(H0, PorterDuff.Mode.SRC_IN);
        }
        hVar.c(canvas2, f29, lerp2, f27);
        float width2 = (hVar.m == null ? 0.0f : (r8.h * f27) / r8.a.getWidth()) / 2.0f;
        float f30 = f27 / 2.0f;
        float f31 = f29 + f30;
        float f32 = f30 + lerp2;
        if (hVar.q == 2) {
            Math.max(0.0f, hVar.o);
        }
        float S = S(1.0f);
        canvas2.save();
        canvas2.scale(S, S, f31, f32);
        Paint paint3 = this.B1;
        paint3.setColor(H0);
        canvas2.drawCircle(f31, f32, width2, paint3);
        if (hVar.q == 2) {
            i11 = 2;
            f7 = f32;
            if (hVar.p == 0) {
                currentTimeMillis = -1;
                f10 = f27;
                f11 = lerp2;
            } else {
                f10 = f27;
                f11 = lerp2;
                currentTimeMillis = System.currentTimeMillis() - hVar.p;
            }
            float clamp012 = (!this.T2 || currentTimeMillis == Long.MAX_VALUE) ? 1.0f : currentTimeMillis < 0 ? 0.0f : Utilities.clamp01(currentTimeMillis / 500.0f);
            t10 = clamp012 < 1.0f ? 1.0f : a6.t((float) Math.sin(clamp012 * 3.141592653589793d), 0.015f, clamp012, 1.0f - ((float) Math.pow(1.0f - clamp012, 3.0d)));
            if (t10 <= 0.004f) {
                canvas2.save();
                Path path = this.j5;
                path.rewind();
                f12 = 0.004f;
                path.addCircle(f31, f7, width2, Path.Direction.CW);
                canvas2.clipPath(path);
                float min = (1.0f - Math.min(1.0f, t10)) * width2 * 0.55f;
                float f33 = (t10 * 0.5f) + 0.5f;
                canvas2.translate(-min, min);
                canvas2.scale(f33, f33, f31, f7);
                if (!this.T2 || this.R2 == null) {
                    int clamp013 = (int) (Utilities.clamp01(clamp012 * 2.0f) * 255.0f);
                    uj0 uj0Var = this.Z1;
                    uj0Var.setAlpha(clamp013);
                    uj0Var.setBounds((int) (f31 - width2), (int) (f7 - width2), (int) (f31 + width2), (int) (f7 + width2));
                    uj0Var.draw(canvas2);
                    uj0Var.setAlpha(255);
                } else {
                    RectF rectF2 = this.M6;
                    rectF2.set(f31 - width2, f7 - width2, f31 + width2, f7 + width2);
                    canvas2.drawBitmap(this.R2, (Rect) null, rectF2, this.S2);
                }
                canvas2.restore();
            } else {
                f12 = 0.004f;
            }
            canvas2.restore();
            i12 = (int) width;
            staticLayout = this.m5;
            textPaint = this.k5;
            int i21 = 1;
            if (staticLayout == null && this.n5 == i12) {
                staticLayout2 = staticLayout;
                textPaint2 = textPaint;
                f13 = f25;
            } else {
                this.n5 = i12;
                str = this.f;
                if (str == null) {
                    str = "";
                }
                String upperCase = str.toUpperCase();
                textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
                int dp = i12 - (AndroidUtilities.dp(20.0f) * 2);
                this.m5 = null;
                i14 = 0;
                for (i13 = i11; i14 <= i13; i13 = 2) {
                    if (i14 == 0) {
                        this.l5 = v(R.drawable.qr_at_large);
                        textPaint.setTextSize(AndroidUtilities.dp(30.0f));
                    } else if (i14 == i21) {
                        this.l5 = v(R.drawable.qr_at_medium);
                        textPaint.setTextSize(AndroidUtilities.dp(25.0f));
                    } else {
                        this.l5 = v(R.drawable.qr_at_small);
                        textPaint.setTextSize(AndroidUtilities.dp(19.0f));
                    }
                    Drawable drawable = this.l5;
                    f13 = f25;
                    drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.l5.getIntrinsicHeight());
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.h ? r.c.g(" ", upperCase) : upperCase);
                    if (this.h) {
                        str2 = upperCase;
                        spannableStringBuilder.setSpan(new v6(this.l5), 0, 1, 33);
                    } else {
                        str2 = upperCase;
                    }
                    float width3 = this.h ? this.l5.getBounds().width() : 0;
                    float measureText = textPaint.measureText(spannableStringBuilder, this.h ? 1 : 0, spannableStringBuilder.length()) + width3;
                    if (i14 > 1 || measureText <= dp) {
                        int i22 = measureText > ((float) dp) ? 2 : 1;
                        int dp2 = i22 > 1 ? AndroidUtilities.dp(2.0f) + (((int) (measureText + width3)) / 2) : dp;
                        if (dp2 > dp) {
                            i22 = 3;
                            dp2 = AndroidUtilities.dp(4.0f) + (((int) (measureText + width3)) / 3);
                        }
                        int i23 = dp2;
                        textPaint2 = textPaint;
                        this.m5 = dx0.c(spannableStringBuilder, textPaint, i23, Layout.Alignment.ALIGN_CENTER, 0.0f, null, Math.min(AndroidUtilities.dp(10.0f) + i23, i12), i22, true);
                        staticLayout2 = this.m5;
                    } else {
                        i14++;
                        f25 = f13;
                        upperCase = str2;
                        i21 = 1;
                    }
                }
                textPaint2 = textPaint;
                f13 = f25;
                staticLayout2 = this.m5;
            }
            boolean[] zArr3 = this.f5;
            float[] fArr7 = this.e5;
            float[] fArr8 = this.d5;
            float[] fArr9 = this.c5;
            float[] fArr10 = this.b5;
            float f34 = 1.6f;
            float[] fArr11 = this.a5;
            float[] fArr12 = this.X4;
            float[] fArr13 = this.W4;
            float[] fArr14 = this.V4;
            float[] fArr15 = this.Z4;
            float[] fArr16 = this.U4;
            float[] fArr17 = this.Y4;
            float[] fArr18 = this.T4;
            if (staticLayout2 == null) {
                textPaint2.setColor(H0);
                fArr = fArr9;
                TextPaint textPaint3 = textPaint2;
                this.l5.setColorFilter(g1(H0));
                float descent = (textPaint3.descent() - textPaint3.ascent()) * staticLayout2.getLineCount();
                float f35 = f11 + f10;
                boolean z11 = this.S4 && !this.T2;
                float f36 = this.C2;
                if (z11) {
                    f16 = f35;
                    f15 = f36 < 0.999f ? 1.0f : 0.0f;
                } else {
                    f15 = 1.0f - f36;
                    f16 = f35;
                }
                fArr2 = fArr10;
                float z12 = a6.z(width, staticLayout2.getWidth(), 2.0f, f23);
                float dp3 = ((((f13 - f16) - descent) / 2.0f) + f16) - AndroidUtilities.dp(4.0f);
                boolean[] zArr4 = this.N4;
                fArr3 = fArr18;
                float[] fArr19 = this.M4;
                float[] fArr20 = this.L4;
                float[] fArr21 = this.K4;
                Random random3 = this.e1;
                if (z11) {
                    c10 = 26214;
                    if (this.R4 != staticLayout2) {
                        this.R4 = staticLayout2;
                        this.O4 = 0;
                        zArr2 = zArr4;
                        int max = Math.max(1, staticLayout2.getWidth());
                        zArr = zArr3;
                        int max2 = Math.max(1, staticLayout2.getHeight());
                        Bitmap createBitmap = Bitmap.createBitmap(max, max2, Bitmap.Config.ALPHA_8);
                        fArr4 = fArr7;
                        staticLayout2.draw(new Canvas(createBitmap));
                        int[] iArr = new int[max];
                        int i24 = max;
                        int max3 = Math.max(2, AndroidUtilities.dp(2.0f));
                        int i25 = max3 / 2;
                        fArr5 = fArr11;
                        int i26 = i24;
                        int i27 = 0;
                        int i28 = 0;
                        while (i25 < max2) {
                            int i29 = i25;
                            createBitmap.getPixels(iArr, 0, i24, 0, i29, i24, 1);
                            int i30 = i24;
                            int i31 = i28;
                            int i32 = i25;
                            while (i32 < i30) {
                                int i33 = i27;
                                float[] fArr22 = fArr8;
                                if ((iArr[i32] >>> 24) < 96) {
                                    i27 = i33;
                                } else {
                                    i27 = i33 + 1;
                                    if (i32 < i26) {
                                        i26 = i32;
                                    }
                                    int i34 = i31;
                                    i31 = i32 > i34 ? i32 : i34;
                                }
                                i32 += max3;
                                fArr8 = fArr22;
                            }
                            i25 = i29 + max3;
                            i27 = i27;
                            i24 = i30;
                            i28 = i31;
                            fArr8 = fArr8;
                        }
                        fArr6 = fArr8;
                        int i35 = i24;
                        if (i27 == 0) {
                            createBitmap.recycle();
                            this.P4 = 0.0f;
                            this.Q4 = i35;
                        } else {
                            this.P4 = i26;
                            this.Q4 = Math.max(1, i28 - i26);
                            float min2 = Math.min(1.0f, Math.max(80, Math.min(200, (int) (r11 / AndroidUtilities.dpf2(1.3f)))) / i27);
                            int i36 = i25;
                            while (i36 < max2) {
                                createBitmap.getPixels(iArr, 0, i35, 0, i36, i35, 1);
                                int i37 = i25;
                                while (true) {
                                    if (i37 >= i35) {
                                        f21 = min2;
                                        break;
                                    }
                                    f21 = min2;
                                    if (this.O4 >= 240) {
                                        break;
                                    }
                                    if ((iArr[i37] >>> 24) < 96 || random3.nextFloat() > f21) {
                                        i19 = i35;
                                    } else {
                                        int i38 = this.O4;
                                        this.O4 = i38 + 1;
                                        float f37 = i37;
                                        fArr21[i38] = f37;
                                        fArr20[i38] = i36;
                                        i19 = i35;
                                        fArr19[i38] = org.telegram.ui.Cells.t0.d(random3, 0.18f, ((f37 - this.P4) * 0.82f) / this.Q4);
                                        zArr2[i38] = false;
                                    }
                                    i37 += max3;
                                    min2 = f21;
                                    i35 = i19;
                                }
                                i36 += max3;
                                min2 = f21;
                                i35 = i35;
                            }
                            f17 = 0.18f;
                            z10 = false;
                            createBitmap.recycle();
                        }
                    } else {
                        zArr2 = zArr4;
                        zArr = zArr3;
                        fArr4 = fArr7;
                        fArr5 = fArr11;
                        fArr6 = fArr8;
                    }
                    f17 = 0.18f;
                    z10 = false;
                } else {
                    zArr2 = zArr4;
                    zArr = zArr3;
                    fArr4 = fArr7;
                    fArr5 = fArr11;
                    fArr6 = fArr8;
                    f17 = 0.18f;
                    z10 = false;
                    c10 = 26214;
                }
                if (f15 > f12) {
                    canvas2.save();
                    canvas2.translate(z12, dp3);
                    float S2 = S(f15);
                    canvas2.scale(S2, S2, staticLayout2.getWidth() / 2.0f, descent / 2.0f);
                    if (z11) {
                        f18 = dp3;
                        random = random3;
                        f19 = 1.12f;
                        i17 = 240;
                        f14 = 0.8f;
                        canvas2.saveLayer(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f) + staticLayout2.getWidth(), AndroidUtilities.dp(4.0f) + staticLayout2.getHeight(), null);
                        staticLayout2.draw(canvas2);
                        float f38 = this.C2 * 1.12f;
                        float f39 = this.P4;
                        float f40 = this.Q4;
                        float f41 = (((f38 - f17) * f40) / 0.82f) + f39;
                        float max4 = Math.max(1.0f, (((f40 * f38) / 0.82f) + f39) - f41);
                        Matrix matrix = this.E;
                        matrix.setScale(max4, 1.0f);
                        matrix.postTranslate(f41, 0.0f);
                        this.h5.setLocalMatrix(matrix);
                        canvas2.drawRect(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f) + staticLayout2.getWidth(), AndroidUtilities.dp(4.0f) + staticLayout2.getHeight(), this.i5);
                        canvas.restore();
                        canvas2 = canvas;
                    } else {
                        f18 = dp3;
                        random = random3;
                        f19 = 1.12f;
                        i17 = 240;
                        f14 = 0.8f;
                        if (f15 < 1.0f) {
                            canvas2 = canvas;
                            canvas2.saveLayerAlpha(0.0f, -AndroidUtilities.dp(4.0f), staticLayout2.getWidth(), descent + AndroidUtilities.dp(4.0f), (int) (f15 * 255.0f));
                        } else {
                            canvas2 = canvas;
                        }
                        staticLayout2.draw(canvas2);
                        if (f15 < 1.0f) {
                            canvas2.restore();
                        }
                    }
                    canvas2.restore();
                } else {
                    f18 = dp3;
                    random = random3;
                    f19 = 1.12f;
                    i17 = 240;
                    f14 = 0.8f;
                }
                if (z11) {
                    float f42 = this.C2 * f19;
                    for (?? r32 = z10; r32 < this.O4; r32++) {
                        boolean z13 = fArr19[r32] < f42 ? true : z10;
                        if (!z13 || zArr2[r32] || this.E2 != 1.0f || (i18 = this.g5) >= i17) {
                            f20 = f26;
                            random2 = random;
                        } else {
                            this.g5 = i18 + 1;
                            boolean z14 = random.nextFloat() < 0.12f ? true : z10;
                            float nextFloat = ((random.nextFloat() - 0.5f) * AndroidUtilities.dp(2.0f)) + fArr21[r32] + z12;
                            fArr17[i18] = nextFloat;
                            fArr3[i18] = nextFloat;
                            float nextFloat2 = ((random.nextFloat() - 0.5f) * AndroidUtilities.dp(2.0f)) + fArr20[r32] + f18;
                            fArr15[i18] = nextFloat2;
                            fArr16[i18] = nextFloat2;
                            fArr14[i18] = ((random.nextFloat() - 0.5f) * AndroidUtilities.dp(36.0f)) + AndroidUtilities.dp(6.0f);
                            fArr13[i18] = -((random.nextFloat() * AndroidUtilities.dp(36.0f)) + AndroidUtilities.dp(18.0f));
                            fArr12[i18] = -((random.nextFloat() * AndroidUtilities.dp(70.0f)) + AndroidUtilities.dp(60.0f));
                            fArr5[i18] = z14 ? org.telegram.ui.Cells.t0.b(f14, random.nextFloat(), AndroidUtilities.dpf2(1.6f)) : org.telegram.ui.Cells.t0.b(1.3f, random.nextFloat(), AndroidUtilities.dpf2(1.2f));
                            random2 = random;
                            fArr2[i18] = org.telegram.ui.Cells.t0.d(random2, 0.4f, 0.6f);
                            fArr[i18] = 0.0f;
                            f20 = f26;
                            fArr6[i18] = org.telegram.ui.Cells.t0.d(random2, 3.0f, f20);
                            fArr4[i18] = random2.nextFloat() * 6.2832f;
                            zArr[i18] = z14;
                        }
                        zArr2[r32] = z13;
                        random = random2;
                        f26 = f20;
                        i17 = 240;
                    }
                }
            } else {
                fArr = fArr9;
                fArr2 = fArr10;
                fArr3 = fArr18;
                zArr = zArr3;
                fArr4 = fArr7;
                fArr5 = fArr11;
                fArr6 = fArr8;
                f14 = 0.8f;
            }
            if (!this.T2 && (i15 = this.g5) > 0) {
                float f43 = this.V2 * 0.016667f;
                i16 = i15 - 1;
                while (i16 >= 0) {
                    float f44 = fArr[i16] + f43;
                    fArr[i16] = f44;
                    if (f44 >= fArr2[i16]) {
                        int i39 = this.g5 - 1;
                        this.g5 = i39;
                        fArr3[i16] = fArr3[i39];
                        fArr16[i16] = fArr16[i39];
                        fArr14[i16] = fArr14[i39];
                        fArr13[i16] = fArr13[i39];
                        fArr12[i16] = fArr12[i39];
                        fArr17[i16] = fArr17[i39];
                        fArr15[i16] = fArr15[i39];
                        fArr5[i16] = fArr5[i39];
                        fArr2[i16] = fArr2[i39];
                        fArr[i16] = fArr[i39];
                        fArr6[i16] = fArr6[i39];
                        fArr4[i16] = fArr4[i39];
                        zArr[i16] = zArr[i39];
                        paint = paint3;
                    } else {
                        fArr13[i16] = (fArr12[i16] * f43) + fArr13[i16];
                        fArr14[i16] = a6.B(f43, f34, 1.0f, fArr14[i16]);
                        fArr13[i16] = a6.B(f43, f14, 1.0f, fArr13[i16]);
                        fArr3[i16] = (fArr14[i16] * f43) + fArr3[i16];
                        float f45 = (fArr13[i16] * f43) + fArr16[i16];
                        fArr16[i16] = f45;
                        float f46 = fArr3[i16] - fArr17[i16];
                        float f47 = f45 - fArr15[i16];
                        float sqrt = (float) Math.sqrt((f47 * f47) + (f46 * f46));
                        float f48 = fArr[i16] / fArr2[i16];
                        float pow = (f48 < 0.08f ? f48 / 0.08f : (float) Math.pow(org.telegram.messenger.q.x(f48, 0.08f, 0.92f, 1.0f), 0.550000011920929d)) * ((float) Math.exp((-sqrt) / AndroidUtilities.dp(90.0f)));
                        float min3 = (1.0f - (Math.min(1.0f, sqrt / AndroidUtilities.dp(90.0f)) * 0.4f)) * (fArr5[i16] / 2.0f);
                        float hypot = (float) Math.hypot(fArr14[i16], fArr13[i16]);
                        float f49 = fArr3[i16];
                        float f50 = fArr16[i16];
                        if (hypot > 1.0f) {
                            float dp4 = AndroidUtilities.dp(3.0f) * ((float) Math.sin((fArr[i16] * fArr6[i16]) + fArr4[i16]));
                            f49 = a1.g.d(-fArr13[i16], hypot, dp4, f49);
                            f50 = a1.g.d(fArr14[i16], hypot, dp4, f50);
                        }
                        float min4 = Math.min(1.0f, Math.max(Math.max(rectF.left - f49, Math.max(0.0f, f49 - rectF.right)), Math.max(rectF.top - f50, Math.max(0.0f, f50 - rectF.bottom))) / AndroidUtilities.dp(36.0f));
                        paint3.setColor(min4 > 0.0f ? h.i(min4, H0, -1) : H0);
                        paint3.setAlpha((int) (pow * 255.0f));
                        float min5 = Math.min(1.8f, (hypot / AndroidUtilities.dp(220.0f)) + 1.0f);
                        canvas2.save();
                        paint = paint3;
                        canvas2.rotate((float) Math.toDegrees(Math.atan2(fArr13[i16], fArr14[i16])), f49, f50);
                        float f51 = min5 * min3;
                        RectF rectF3 = this.A5;
                        rectF3.set(f49 - f51, f50 - min3, f51 + f49, f50 + min3);
                        canvas2.drawOval(rectF3, paint);
                        canvas2.restore();
                        if (zArr[i16]) {
                            paint.setAlpha((int) (pow * 36.0f));
                            canvas2.drawCircle(f49, f50, min3 * 2.2f, paint);
                        }
                    }
                    i16--;
                    paint3 = paint;
                    f14 = 0.8f;
                    f34 = 1.6f;
                }
                if (this.g5 > 0) {
                    invalidate();
                }
            }
            canvas2.restore();
        }
        f10 = f27;
        f11 = lerp2;
        i11 = 2;
        f7 = f32;
        currentTimeMillis = Long.MAX_VALUE;
        if (this.T2) {
        }
        if (clamp012 < 1.0f) {
        }
        if (t10 <= 0.004f) {
        }
        canvas2.restore();
        i12 = (int) width;
        staticLayout = this.m5;
        textPaint = this.k5;
        int i212 = 1;
        if (staticLayout == null) {
        }
        this.n5 = i12;
        str = this.f;
        if (str == null) {
        }
        String upperCase2 = str.toUpperCase();
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        int dp5 = i12 - (AndroidUtilities.dp(20.0f) * 2);
        this.m5 = null;
        i14 = 0;
        while (i14 <= i13) {
        }
        textPaint2 = textPaint;
        f13 = f25;
        staticLayout2 = this.m5;
        boolean[] zArr32 = this.f5;
        float[] fArr72 = this.e5;
        float[] fArr82 = this.d5;
        float[] fArr92 = this.c5;
        float[] fArr102 = this.b5;
        float f342 = 1.6f;
        float[] fArr112 = this.a5;
        float[] fArr122 = this.X4;
        float[] fArr132 = this.W4;
        float[] fArr142 = this.V4;
        float[] fArr152 = this.Z4;
        float[] fArr162 = this.U4;
        float[] fArr172 = this.Y4;
        float[] fArr182 = this.T4;
        if (staticLayout2 == null) {
        }
        if (!this.T2) {
            float f432 = this.V2 * 0.016667f;
            i16 = i15 - 1;
            while (i16 >= 0) {
            }
            if (this.g5 > 0) {
            }
        }
        canvas2.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0279, code lost:
    
        if (java.lang.Math.hypot(r68 - r7, r69 - r67) > r5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0080, code lost:
    
        if (r0.B0 > 0.001f) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0a84  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0aad  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0ae5  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0b8e  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0ac0  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0a87  */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v52 */
    /* JADX WARN: Type inference failed for: r59v0 */
    /* JADX WARN: Type inference failed for: r59v1 */
    /* JADX WARN: Type inference failed for: r59v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(Canvas canvas, int i10) {
        TextPaint textPaint;
        float f7;
        float f10;
        RectF rectF;
        float f11;
        ?? r12;
        float f12;
        RectF rectF2;
        RectF rectF3;
        boolean z10;
        int i11;
        int i12;
        float[] fArr;
        ?? r59;
        RectF rectF4;
        float f13;
        float f14;
        float[] fArr2;
        Canvas canvas2;
        Paint paint;
        Path path;
        int i13;
        RectF rectF5;
        TextPaint textPaint2;
        float f15;
        float f16;
        Path path2;
        Path path3;
        Random random;
        float f17;
        float f18;
        float f19;
        float f20;
        Paint paint2;
        byte b10;
        float f21;
        float f22;
        RectF rectF6;
        int i14;
        float pow;
        float f23;
        RectF rectF7;
        int i15;
        Paint paint3;
        int i16;
        float b11;
        int i17;
        int i18;
        int i19;
        float f24;
        int i20;
        float f25;
        float f26;
        float b12;
        b1 b1Var = this;
        Canvas canvas3 = canvas;
        float f27 = b1Var.C2;
        float f28 = b1Var.J2;
        float f29 = (1.0f - f28) * f27;
        RectF rectF8 = b1Var.o5;
        TextPaint textPaint3 = b1Var.H0;
        RectF rectF9 = b1Var.H1;
        if (f28 > 0.001f) {
            b1Var.z5 = f28;
            float l4 = b1Var.l() + b1Var.m() + AndroidUtilities.dp(24.0f);
            textPaint3.setTextSize(AndroidUtilities.dp(11.0f));
            float measureText = textPaint3.measureText(b1Var.J0) + textPaint3.measureText(b1Var.I0) + AndroidUtilities.dp(11.0f) + AndroidUtilities.dp(12.0f) + AndroidUtilities.dp(1.0f) + AndroidUtilities.dp(11.0f);
            if (!b1Var.v0) {
                f11 = b1Var.t2;
                if (f11 > 0.0f) {
                    f10 = 24.0f;
                }
            }
            f10 = 24.0f;
            f11 = AndroidUtilities.dp(11.0f) + b1Var.L0.c() + AndroidUtilities.dp(2.0f) + AndroidUtilities.dp(12.0f) + AndroidUtilities.dp(8.0f);
            boolean z11 = b1Var.v0;
            float f30 = 2.0f;
            if (!z11 && b1Var.B0 <= 0.001f) {
                b1Var.t2 = 0.0f;
            }
            float f31 = b1Var.B0;
            if (z11) {
                f31 = Math.max(f31, b1Var.F0 ? 1.0f : 0.0f);
            }
            float lerp = AndroidUtilities.lerp(measureText, f11, f31);
            float dp = AndroidUtilities.dp(22.0f);
            float f32 = (i10 - lerp) / 2.0f;
            float f33 = dp / 2.0f;
            rectF9.set(f32, l4 - f33, lerp + f32, l4 + f33);
            rectF8.set(rectF9);
            if (!b1Var.y5) {
                b1Var.g6 = true;
                b1Var.H(canvas3, rectF9, f33, b1Var.z5);
                b1Var.g6 = false;
            }
            if (b1Var.z5 < 0.999f) {
                f12 = 0.999f;
                rectF2 = rectF8;
                r12 = 1;
                rectF3 = rectF9;
                z10 = false;
                i11 = canvas3.saveLayerAlpha(rectF9.left - AndroidUtilities.dp(40.0f), rectF9.top - AndroidUtilities.dp(80.0f), rectF9.right + AndroidUtilities.dp(40.0f), rectF9.bottom + AndroidUtilities.dp(20.0f), (int) (b1Var.z5 * 255.0f));
            } else {
                r12 = 1;
                f12 = 0.999f;
                rectF2 = rectF8;
                rectF3 = rectF9;
                z10 = false;
                i11 = -1;
            }
            b1Var.K(canvas3, 9, rectF3, z10);
            RectF rectF10 = b1Var.p5;
            rectF10.set(rectF3);
            float min = Math.min(0.0f, AndroidUtilities.dpf2(e1.a[r12][8]));
            rectF10.inset(min, min);
            float f34 = f33 - min;
            boolean z12 = (b1Var.q2 <= 0 || b1Var.v0) ? z10 : r12;
            boolean z13 = b1Var.s2;
            float[] fArr3 = b1Var.Z0;
            TextPaint textPaint4 = textPaint3;
            float[] fArr4 = b1Var.Y0;
            float[] fArr5 = b1Var.X0;
            float[] fArr6 = b1Var.U0;
            float[] fArr7 = b1Var.T0;
            float[] fArr8 = b1Var.R0;
            float[] fArr9 = b1Var.Q0;
            float[] fArr10 = b1Var.S0;
            float[] fArr11 = b1Var.P0;
            float[] fArr12 = b1Var.O0;
            float[] fArr13 = b1Var.W0;
            float[] fArr14 = b1Var.V0;
            float[] fArr15 = b1Var.N0;
            float[] fArr16 = b1Var.M0;
            boolean[] zArr = b1Var.b1;
            byte[] bArr = b1Var.a1;
            RectF rectF11 = b1Var.r2;
            float f35 = 0.8f;
            Random random2 = b1Var.e1;
            if (z13) {
                b1Var.s2 = z10;
                float f36 = rectF10.left;
                boolean z14 = z10;
                i12 = i11;
                rectF11.set(f36, rectF10.top, (rectF10.width() * b1Var.B0 * b1Var.G0) + f36, rectF10.bottom);
                float dp2 = AndroidUtilities.dp(3.0f);
                float centerX = rectF3.centerX();
                float centerY = rectF3.centerY();
                int max = Math.max(1, (int) (rectF11.width() / dp2));
                int max2 = Math.max(1, (int) (rectF11.height() / dp2));
                fArr = fArr3;
                float min2 = Math.min(1.0f, 260.0f / (max * max2));
                int i21 = z14 ? 1 : 0;
                while (i21 < max2) {
                    float f37 = min2;
                    int i22 = z14 ? 1 : 0;
                    while (i22 < max) {
                        if (random2.nextFloat() <= f37) {
                            i18 = max2;
                            f24 = centerY;
                            if (b1Var.c1 >= 320) {
                                i17 = i22;
                                i19 = i21;
                            } else {
                                float nextFloat = ((((random2.nextFloat() - 0.5f) * f35) + i22 + 0.5f) * dp2) + rectF11.left;
                                float nextFloat2 = ((((random2.nextFloat() - 0.5f) * f35) + i21 + 0.5f) * dp2) + rectF11.top;
                                float height = rectF3.height() / 2.0f;
                                if (nextFloat < rectF3.left + height) {
                                    i19 = i21;
                                    i17 = i22;
                                    i20 = max;
                                    f25 = f29;
                                } else {
                                    i17 = i22;
                                    i19 = i21;
                                    i20 = max;
                                    f25 = f29;
                                }
                                float f38 = nextFloat - centerX;
                                float f39 = nextFloat2 - f24;
                                float max3 = Math.max(1.0f, (float) Math.hypot(f38, f39));
                                float f40 = f38 / max3;
                                float f41 = f39 / max3;
                                float nextFloat3 = (random2.nextFloat() * AndroidUtilities.dp(140.0f)) + AndroidUtilities.dp(60.0f);
                                boolean z15 = random2.nextFloat() < 0.15f ? true : z14 ? 1 : 0;
                                int i23 = b1Var.c1;
                                b1Var.c1 = i23 + 1;
                                bArr[i23] = (byte) (z15 ? 4 : 3);
                                zArr[i23] = z14;
                                fArr16[i23] = nextFloat;
                                fArr15[i23] = nextFloat2;
                                fArr14[i23] = nextFloat;
                                fArr13[i23] = nextFloat2;
                                fArr12[i23] = ((random2.nextFloat() - 0.5f) * AndroidUtilities.dp(60.0f)) + (f40 * nextFloat3);
                                fArr11[i23] = ((random2.nextFloat() - 0.5f) * AndroidUtilities.dp(60.0f)) + ((f41 * nextFloat3) - ((random2.nextFloat() * AndroidUtilities.dp(80.0f)) + AndroidUtilities.dp(40.0f)));
                                if (z15) {
                                    b12 = org.telegram.ui.Cells.t0.b(f35, random2.nextFloat(), AndroidUtilities.dpf2(1.4f));
                                    f26 = 1.0f;
                                } else {
                                    f26 = 1.0f;
                                    b12 = org.telegram.ui.Cells.t0.b(1.2f, random2.nextFloat(), AndroidUtilities.dpf2(1.0f));
                                }
                                fArr10[i23] = b12;
                                fArr9[i23] = org.telegram.ui.Cells.t0.d(random2, 0.3f, 0.35f);
                                fArr8[i23] = 0.0f;
                                fArr7[i23] = f26;
                                fArr6[i23] = 0.0f;
                                fArr5[i23] = 0.0f;
                                fArr4[i23] = 0.0f;
                                fArr[i23] = 0.0f;
                                i22 = i17 + 1;
                                max2 = i18;
                                centerY = f24;
                                i21 = i19;
                                f29 = f25;
                                max = i20;
                                f35 = 0.8f;
                            }
                        } else {
                            i17 = i22;
                            i18 = max2;
                            i19 = i21;
                            f24 = centerY;
                        }
                        i20 = max;
                        f25 = f29;
                        i22 = i17 + 1;
                        max2 = i18;
                        centerY = f24;
                        i21 = i19;
                        f29 = f25;
                        max = i20;
                        f35 = 0.8f;
                    }
                    i21++;
                    min2 = f37;
                    centerY = centerY;
                    f35 = 0.8f;
                }
                f7 = f29;
                b1Var.invalidate();
                r59 = z14;
            } else {
                i12 = i11;
                fArr = fArr3;
                r59 = z10;
                f7 = f29;
            }
            float f42 = z12 ? 0.0f : b1Var.B0 * b1Var.G0;
            float width = (rectF10.width() * f42) + rectF10.left;
            if (z12) {
                rectF4 = rectF11;
                f13 = Utilities.clamp01((AnimationUtils.currentAnimationTimeMillis() - b1Var.q2) / 80.0f);
            } else {
                rectF4 = rectF11;
                f13 = 1.0f;
            }
            Paint paint4 = b1Var.B1;
            Path path4 = b1Var.G1;
            if (z12 && f13 < 1.0f) {
                float clamp01 = 1.0f - Utilities.clamp01((AnimationUtils.currentAnimationTimeMillis() - b1Var.q2) / 60.0f);
                canvas3.save();
                path4.rewind();
                path4.addRoundRect(rectF10, f34, f34, Path.Direction.CW);
                canvas3.clipPath(path4);
                canvas3.clipRect(rectF4);
                if (clamp01 > 0.0f) {
                    paint4 = paint4;
                    paint4.setColor(-134217729);
                    paint4.setAlpha((int) (clamp01 * 247.0f));
                    canvas3.drawRect(rectF4, paint4);
                } else {
                    paint4 = paint4;
                }
                b1Var.E(canvas3, rectF3, a(1.0f - f13, b1Var.n != null ? b1Var.H0() : -16777216));
                canvas3.restore();
                b1Var.invalidate();
            }
            boolean z16 = b1Var.v0;
            boolean z17 = (z16 && b1Var.F0 && b1Var.w0 && f42 < f12) ? true : r59;
            RectF rectF12 = rectF3;
            float elapsedRealtime = (SystemClock.elapsedRealtime() % 100000) / 1000.0f;
            float f43 = f42;
            float f44 = 6.0f;
            b1Var.s5 = AndroidUtilities.dpf2((!z16 || b1Var.F0) ? r59 : true ? 5.0f : 2.2f) * Utilities.clamp01((rectF10.right - width) / AndroidUtilities.dp(6.0f)) * Utilities.clamp01((width - rectF10.left) / AndroidUtilities.dp(6.0f));
            RectF rectF13 = rectF12;
            float dp3 = rectF13.top - AndroidUtilities.dp(4.0f);
            float dp4 = rectF13.bottom + AndroidUtilities.dp(4.0f);
            float f45 = dp4 - dp3;
            boolean z18 = z17;
            int i24 = r59;
            while (true) {
                f14 = f33;
                fArr2 = b1Var.r5;
                if (i24 >= 7) {
                    break;
                }
                float f46 = i24;
                fArr2[i24] = (((float) ((Math.sin((f46 * 2.9f) + (8.3f * elapsedRealtime)) * 0.4000000059604645d) + (Math.sin((1.7f * f46) + (5.1f * elapsedRealtime)) * 0.6000000238418579d))) * b1Var.s5) + width;
                i24++;
                f33 = f14;
                random2 = random2;
            }
            Random random3 = random2;
            Path path5 = b1Var.q5;
            path5.rewind();
            path5.moveTo(rectF13.left - AndroidUtilities.dp(8.0f), dp3);
            path5.lineTo(fArr2[r59], dp3);
            int i25 = 1;
            while (i25 < 7) {
                int i26 = i25 - 1;
                float[] fArr17 = fArr2;
                float f47 = i26;
                float f48 = f44;
                float B = a1.g.B(f45, f47, f48, dp3);
                float f49 = dp;
                float B2 = a1.g.B(f45, i25, f48, dp3);
                float f50 = fArr17[i26];
                path5.quadTo(f50, B, (f50 + fArr17[i25]) / 2.0f, (B2 + B) / 2.0f);
                i25++;
                dp = f49;
                fArr2 = fArr17;
                dp3 = dp3;
                f44 = 6.0f;
            }
            float f51 = dp;
            path5.lineTo(fArr2[6], dp4);
            path5.lineTo(rectF13.left - AndroidUtilities.dp(8.0f), dp4);
            path5.close();
            if (b1Var.s5 > 0.01f) {
                b1Var.invalidate();
            }
            int i27 = (f43 > 0.001f ? 1 : (f43 == 0.001f ? 0 : -1));
            Path path6 = b1Var.x5;
            if (i27 > 0) {
                canvas3.save();
                path4.rewind();
                path4.addRoundRect(rectF10, f34, f34, Path.Direction.CW);
                canvas3.clipPath(path4);
                canvas3.clipPath(path5);
                paint4.setColor(-134217729);
                if (z18) {
                    path6.rewind();
                    float dp5 = rectF10.top - AndroidUtilities.dp(2.0f);
                    float dp6 = rectF10.bottom + AndroidUtilities.dp(2.0f);
                    float dpf2 = AndroidUtilities.dpf2(0.75f);
                    f15 = 0.016667f;
                    path6.moveTo(rectF10.left - AndroidUtilities.dp(4.0f), dp5);
                    while (true) {
                        float min3 = Math.min(dp5, dp6);
                        path6.lineTo(m1(min3, width, rectF10.top) + width, min3);
                        if (min3 >= dp6) {
                            break;
                        } else {
                            dp5 += dpf2;
                        }
                    }
                    path6.lineTo(rectF10.left - AndroidUtilities.dp(4.0f), dp6);
                    path6.close();
                    canvas3.drawPath(path6, paint4);
                    rectF7 = rectF10;
                    i15 = i12;
                } else {
                    f15 = 0.016667f;
                    rectF7 = rectF10;
                    i15 = i12;
                    canvas3.drawRect(rectF10.left, rectF10.top, b1Var.s5 + width, rectF10.bottom, paint4);
                }
                if (z18 || (b1Var.v0 && !b1Var.F0)) {
                    float dp7 = AndroidUtilities.dp(23.0f);
                    Matrix matrix = b1Var.u5;
                    matrix.setScale(dp7, 1.0f);
                    matrix.postTranslate(width - AndroidUtilities.dp(22.0f), 0.0f);
                    LinearGradient linearGradient = b1Var.v5;
                    linearGradient.setLocalMatrix(matrix);
                    paint4.setShader(linearGradient);
                    canvas.drawRect(width - AndroidUtilities.dp(22.0f), rectF7.top, width + AndroidUtilities.dp(1.0f), rectF7.bottom, paint4);
                    paint3 = paint4;
                    paint3.setShader(null);
                } else {
                    paint3 = paint4;
                }
                canvas.restore();
                float f52 = b1Var.V2 * f15;
                float currentTimeMillis = z18 ? 1.2f : ((b1Var.o2 + 250) - System.currentTimeMillis()) / 1000.0f;
                if (z18) {
                    int floor = (int) Math.floor(random3.nextFloat() + (110.0f * f52));
                    int i28 = r59;
                    while (i28 < floor) {
                        float f53 = f51;
                        Random random4 = random3;
                        float d = org.telegram.ui.Cells.t0.d(random4, f53, rectF13.top);
                        random3 = random4;
                        p((random4.nextFloat() * AndroidUtilities.dp(3.0f)) + m1(d, width, rectF7.top) + width, d, (random4.nextFloat() * AndroidUtilities.dp(20.0f)) + AndroidUtilities.dp(10.0f), -((random4.nextFloat() * AndroidUtilities.dp(10.0f)) + AndroidUtilities.dp(4.0f)), 0.0f, org.telegram.ui.Cells.t0.b(0.7f, random4.nextFloat(), AndroidUtilities.dpf2(0.8f)), org.telegram.ui.Cells.t0.d(random4, 0.25f, 0.25f), org.telegram.ui.Cells.t0.d(random4, 0.1f, 0.9f), false, false);
                        i28++;
                        f51 = f53;
                        rectF13 = rectF13;
                        rectF7 = rectF7;
                        path6 = path6;
                        i27 = i27;
                        path5 = path5;
                        path4 = path4;
                        i15 = i15;
                        floor = floor;
                        paint3 = paint3;
                        rectF2 = rectF2;
                        textPaint4 = textPaint4;
                    }
                    canvas2 = canvas;
                    paint = paint3;
                    path = path6;
                    i13 = i27;
                    i12 = i15;
                    rectF5 = rectF2;
                    textPaint2 = textPaint4;
                    float f54 = f51;
                    f16 = 70.0f;
                    path2 = path4;
                    RectF rectF14 = rectF7;
                    path3 = path5;
                    rectF = rectF13;
                    int floor2 = (int) Math.floor(random3.nextFloat() + (f52 * 70.0f));
                    int i29 = 0;
                    while (i29 < floor2) {
                        boolean z19 = random3.nextFloat() < 0.12f;
                        Random random5 = random3;
                        float d10 = org.telegram.ui.Cells.t0.d(random5, f54, rectF.top);
                        float nextFloat4 = (random5.nextFloat() * AndroidUtilities.dp(10.0f)) + m1(d10, width, rectF14.top) + width + AndroidUtilities.dp(2.0f);
                        float nextFloat5 = (random5.nextFloat() * AndroidUtilities.dp(70.0f)) + AndroidUtilities.dp(40.0f);
                        float f55 = -((random5.nextFloat() * AndroidUtilities.dp(30.0f)) + AndroidUtilities.dp(10.0f));
                        float f56 = -((random5.nextFloat() * AndroidUtilities.dp(34.0f)) + AndroidUtilities.dp(26.0f));
                        if (z19) {
                            i16 = floor2;
                            b11 = org.telegram.ui.Cells.t0.b(0.8f, random5.nextFloat(), AndroidUtilities.dpf2(1.4f));
                        } else {
                            i16 = floor2;
                            b11 = org.telegram.ui.Cells.t0.b(1.1f, random5.nextFloat(), AndroidUtilities.dpf2(0.9f));
                        }
                        random3 = random5;
                        p(nextFloat4, d10, nextFloat5, f55, f56, b11, org.telegram.ui.Cells.t0.d(random5, 0.7f, 0.6f), 1.0f, z19, true);
                        i29++;
                        floor2 = i16;
                    }
                    b1Var = this;
                } else {
                    canvas2 = canvas;
                    paint = paint3;
                    path = path6;
                    i13 = i27;
                    i12 = i15;
                    rectF5 = rectF2;
                    textPaint2 = textPaint4;
                    f16 = 70.0f;
                    path2 = path4;
                    path3 = path5;
                    rectF = rectF13;
                    int floor3 = (int) Math.floor(random3.nextFloat() + (((!b1Var.v0 || b1Var.F0) ? 0.0f : 260.0f) * f52));
                    for (int i30 = 0; i30 < floor3; i30++) {
                        b1Var.o(width, org.telegram.ui.Cells.t0.d(random3, f51, rectF.top), currentTimeMillis);
                    }
                }
                random = random3;
            } else {
                canvas2 = canvas3;
                paint = paint4;
                path = path6;
                i13 = i27;
                rectF5 = rectF2;
                textPaint2 = textPaint4;
                f15 = 0.016667f;
                f16 = 70.0f;
                path2 = path4;
                path3 = path5;
                random = random3;
                rectF = rectF13;
            }
            int H0 = b1Var.n != null ? b1Var.H0() : -16777216;
            canvas2.save();
            path2.rewind();
            Path path7 = path2;
            path7.addRoundRect(rectF, f14, f14, Path.Direction.CW);
            canvas2.clipPath(path7);
            if (i13 > 0) {
                b0.b(canvas2, z18 ? path : path3);
            }
            if (b1Var.v0 && b1Var.F0) {
                b1Var.E(canvas2, rectF, -218103809);
                canvas3 = canvas2;
                textPaint = textPaint2;
            } else {
                if (!z12) {
                    f13 = 1.0f - Utilities.clamp01(b1Var.B0 * 1.25f);
                }
                int a2 = a(f13, -218103809);
                float centerY2 = rectF.centerY();
                float dp8 = AndroidUtilities.dp(12.0f);
                float dp9 = rectF.left + AndroidUtilities.dp(11.0f);
                textPaint = textPaint2;
                textPaint.setColor(a2);
                canvas2.drawText(b1Var.I0, dp9, AndroidUtilities.dp(4.0f) + centerY2, textPaint);
                float measureText2 = textPaint.measureText(b1Var.I0) + dp9;
                canvas3 = canvas2;
                b1Var.N(canvas3, measureText2, centerY2, dp8, a2, false);
                textPaint.setColor(a2);
                canvas3.drawText(b1Var.J0, measureText2 + dp8 + AndroidUtilities.dp(1.0f), centerY2 + AndroidUtilities.dp(4.0f), textPaint);
            }
            canvas3.restore();
            if (i13 > 0) {
                canvas3.save();
                canvas3.clipPath(z18 ? path : path3);
                b1Var.E(canvas3, rectF, H0);
                canvas3.restore();
            }
            if (b1Var.d1) {
                b1Var.d1 = false;
                for (int i31 = 0; i31 < 24; i31++) {
                    b1Var.o((rectF.width() * random.nextFloat() * 0.4f) + rectF.left, (rectF.height() * random.nextFloat()) + rectF.top, 0.5f);
                }
            }
            float f57 = 0.5f;
            float f58 = b1Var.V2 * f15;
            RectF rectF15 = rectF5;
            float dp10 = rectF15.top - AndroidUtilities.dp(40.0f);
            float dp11 = rectF15.top - AndroidUtilities.dp(48.0f);
            int i32 = b1Var.c1 - 1;
            while (i32 >= 0) {
                float f59 = fArr8[i32] + f58;
                fArr8[i32] = f59;
                if (f59 >= fArr9[i32]) {
                    int i33 = b1Var.c1 - 1;
                    b1Var.c1 = i33;
                    fArr16[i32] = fArr16[i33];
                    fArr15[i32] = fArr15[i33];
                    fArr12[i32] = fArr12[i33];
                    fArr11[i32] = fArr11[i33];
                    fArr9[i32] = fArr9[i33];
                    fArr8[i32] = fArr8[i33];
                    fArr10[i32] = fArr10[i33];
                    fArr7[i32] = fArr7[i33];
                    fArr6[i32] = fArr6[i33];
                    bArr[i32] = bArr[i33];
                    zArr[i32] = zArr[i33];
                    fArr14[i32] = fArr14[i33];
                    fArr13[i32] = fArr13[i33];
                    fArr5[i32] = fArr5[i33];
                    fArr4[i32] = fArr4[i33];
                    fArr[i32] = fArr[i33];
                    f17 = f57;
                    f18 = f58;
                    rectF6 = rectF15;
                    f21 = dp10;
                    f22 = dp11;
                    i14 = i32;
                    paint2 = paint;
                } else {
                    if (bArr[i32] >= 3) {
                        float f60 = 1.0f - (2.4f * f58);
                        fArr12[i32] = fArr12[i32] * f60;
                        float f61 = fArr11[i32] * f60;
                        fArr11[i32] = f61;
                        if (fArr8[i32] > 0.12f) {
                            fArr11[i32] = (AndroidUtilities.dp(120.0f) * f58) + f61;
                        }
                        if (fArr15[i32] < rectF15.top - AndroidUtilities.dp(f16)) {
                            fArr11[i32] = fArr11[i32] * 0.85f;
                        }
                    } else {
                        if (zArr[i32]) {
                            fArr11[i32] = (fArr5[i32] * f58) + fArr11[i32];
                            fArr12[i32] = a6.B(f58, 1.6f, 1.0f, fArr12[i32]);
                            float B3 = a6.B(f58, 0.8f, 1.0f, fArr11[i32]);
                            fArr11[i32] = B3;
                            if (fArr15[i32] < dp11) {
                                f17 = f57;
                                f18 = f58;
                                fArr11[i32] = B3 * ((float) Math.pow(0.8999999761581421d, b1Var.V2));
                            }
                        } else {
                            f17 = f57;
                            f18 = f58;
                            fArr11[i32] = fArr11[i32] - (AndroidUtilities.dp(20.0f) * f18);
                            float f62 = 1.0f - (f18 * 3.0f);
                            fArr12[i32] = fArr12[i32] * f62;
                            float f63 = fArr11[i32] * f62;
                            fArr11[i32] = f63;
                            if (fArr15[i32] < dp10) {
                                fArr11[i32] = f63 * 0.85f;
                            }
                        }
                        fArr16[i32] = (fArr12[i32] * f18) + fArr16[i32];
                        fArr15[i32] = (fArr11[i32] * f18) + fArr15[i32];
                        float f64 = fArr8[i32] / fArr9[i32];
                        float pow2 = f64 >= 0.12f ? f64 / 0.12f : (float) Math.pow(org.telegram.messenger.q.x(f64, 0.12f, 0.88f, 1.0f), zArr[i32] ? 0.550000011920929d : 0.699999988079071d);
                        f19 = fArr15[i32];
                        if (f19 >= dp10) {
                            f20 = 1.0f;
                            pow2 *= Math.max(0.0f, 1.0f - ((dp10 - f19) / AndroidUtilities.dp(f10)));
                        } else {
                            f20 = 1.0f;
                        }
                        float f65 = ((f20 - (f64 * f17)) * fArr10[i32]) / f30;
                        paint2 = paint;
                        paint2.setColor(-1);
                        paint2.setAlpha((int) (pow2 * 255.0f));
                        b10 = bArr[i32];
                        RectF rectF16 = b1Var.A5;
                        if (b10 < 3) {
                            float f66 = pow2;
                            f21 = dp10;
                            f22 = dp11;
                            float f67 = f30;
                            float c10 = org.telegram.ui.Cells.t0.c((float) Math.hypot(fArr12[i32], fArr11[i32]), AndroidUtilities.dp(200.0f), 1.0f, f67);
                            float f68 = ((1.0f - (f64 * 0.4f)) * fArr10[i32]) / f67;
                            float max4 = fArr15[i32] < rectF15.top - ((float) AndroidUtilities.dp(f16)) ? Math.max(0.0f, 1.0f - (((rectF15.top - AndroidUtilities.dp(f16)) - fArr15[i32]) / AndroidUtilities.dp(16.0f))) * f66 : f66;
                            paint2.setAlpha((int) (max4 * 255.0f));
                            canvas3.save();
                            float f69 = max4;
                            canvas3.rotate((float) Math.toDegrees(Math.atan2(fArr11[i32], fArr12[i32])), fArr16[i32], fArr15[i32]);
                            float f70 = fArr16[i32];
                            float f71 = f68 * c10;
                            float f72 = fArr15[i32];
                            rectF16.set(f70 - f71, f72 - f68, f70 + f71, f72 + f68);
                            canvas3.drawOval(rectF16, paint2);
                            canvas3.restore();
                            if (bArr[i32] == 4) {
                                paint2.setAlpha((int) (f69 * 36.0f));
                                canvas3.drawCircle(fArr16[i32], fArr15[i32], f68 * 2.2f, paint2);
                            }
                            rectF6 = rectF15;
                            i14 = i32;
                        } else {
                            float f73 = pow2;
                            f21 = dp10;
                            f22 = dp11;
                            if (zArr[i32]) {
                                float f74 = fArr16[i32] - fArr14[i32];
                                float f75 = fArr15[i32] - fArr13[i32];
                                float sqrt = (float) Math.sqrt((f75 * f75) + (f74 * f74));
                                float f76 = fArr8[i32] / fArr9[i32];
                                if (f76 < 0.08f) {
                                    pow = f76 / 0.08f;
                                    rectF6 = rectF15;
                                } else {
                                    rectF6 = rectF15;
                                    pow = (float) Math.pow(org.telegram.messenger.q.x(f76, 0.08f, 0.92f, 1.0f), 0.550000011920929d);
                                }
                                float exp = fArr7[i32] * ((float) Math.exp((-sqrt) / AndroidUtilities.dp(44.0f))) * pow;
                                float f77 = fArr15[i32];
                                if (f77 < f22) {
                                    f23 = 1.0f;
                                    exp *= Math.max(0.0f, 1.0f - ((f22 - f77) / AndroidUtilities.dp(16.0f)));
                                } else {
                                    f23 = 1.0f;
                                }
                                float min4 = (f23 - (Math.min(f23, sqrt / AndroidUtilities.dp(f16)) * 0.4f)) * (fArr10[i32] / 2.0f);
                                double d11 = fArr12[i32];
                                float f78 = fArr11[i32];
                                float f79 = exp;
                                float hypot = (float) Math.hypot(d11, f78);
                                float f80 = fArr16[i32];
                                float f81 = fArr15[i32];
                                if (fArr4[i32] <= 0.0f || hypot <= 1.0f) {
                                    i14 = i32;
                                } else {
                                    i14 = i32;
                                    float sin = ((float) Math.sin((fArr8[i32] * fArr4[i32]) + fArr[i32])) * AndroidUtilities.dp(3.0f);
                                    f80 = a1.g.d(-fArr11[i14], hypot, sin, f80);
                                    f81 = a1.g.d(fArr12[i14], hypot, sin, f81);
                                }
                                paint2.setAlpha((int) (f79 * 255.0f));
                                float min5 = Math.min(1.8f, (hypot / AndroidUtilities.dp(220.0f)) + 1.0f);
                                canvas3.save();
                                canvas3.rotate((float) Math.toDegrees(Math.atan2(fArr11[i14], fArr12[i14])), f80, f81);
                                float f82 = min5 * min4;
                                rectF16.set(f80 - f82, f81 - min4, f82 + f80, f81 + min4);
                                canvas3.drawOval(rectF16, paint2);
                                canvas3.restore();
                                if (bArr[i14] == 1) {
                                    paint2.setAlpha((int) (f79 * 36.0f));
                                    canvas3.drawCircle(f80, f81, min4 * 2.2f, paint2);
                                }
                            } else {
                                rectF6 = rectF15;
                                i14 = i32;
                                canvas3.drawCircle(fArr16[i14], fArr15[i14], b10 == 1 ? f65 * 2.0f : f65, paint2);
                                if (bArr[i14] == 1) {
                                    paint2.setAlpha((int) (f73 * 36.0f));
                                    canvas3.drawCircle(fArr16[i14], fArr15[i14], f65 * 4.4f, paint2);
                                }
                            }
                            i32 = i14 - 1;
                            paint = paint2;
                            f58 = f18;
                            dp10 = f21;
                            dp11 = f22;
                            f57 = f17;
                            rectF15 = rectF6;
                            f30 = 2.0f;
                        }
                    }
                    f17 = f57;
                    f18 = f58;
                    fArr16[i32] = (fArr12[i32] * f18) + fArr16[i32];
                    fArr15[i32] = (fArr11[i32] * f18) + fArr15[i32];
                    float f642 = fArr8[i32] / fArr9[i32];
                    if (f642 >= 0.12f) {
                    }
                    f19 = fArr15[i32];
                    if (f19 >= dp10) {
                    }
                    float f652 = ((f20 - (f642 * f17)) * fArr10[i32]) / f30;
                    paint2 = paint;
                    paint2.setColor(-1);
                    paint2.setAlpha((int) (pow2 * 255.0f));
                    b10 = bArr[i32];
                    RectF rectF162 = b1Var.A5;
                    if (b10 < 3) {
                    }
                }
                i32 = i14 - 1;
                paint = paint2;
                f58 = f18;
                dp10 = f21;
                dp11 = f22;
                f57 = f17;
                rectF15 = rectF6;
                f30 = 2.0f;
            }
            if (i12 >= 0) {
                canvas3.restoreToCount(i12);
            }
            b1Var.z5 = 1.0f;
        } else {
            textPaint = textPaint3;
            f7 = f29;
            f10 = 24.0f;
            rectF = rectF9;
            rectF8.setEmpty();
        }
        if (f7 > 0.001f) {
            long currentTimeMillis2 = System.currentTimeMillis();
            long j10 = b1Var.G2;
            long max5 = j10 > 0 ? Math.max(0L, (j10 - (currentTimeMillis2 / 1000)) - 1) : -1L;
            if (max5 != b1Var.N2) {
                b1Var.N2 = max5;
                b1Var.O2 = max5 >= 0 ? LocaleController.formatString(R.string.QrNoPaidExpiresIn, String.format(Locale.US, "%d:%02d", Long.valueOf(max5 / 60), Long.valueOf(max5 % 60))) : LocaleController.getString(R.string.QrCreatingLink);
            }
            String str = b1Var.O2;
            textPaint.setTextSize(AndroidUtilities.dp(11.0f));
            float measureText3 = textPaint.measureText(str) + AndroidUtilities.dp(11.0f) + AndroidUtilities.dp(11.0f);
            float dp12 = AndroidUtilities.dp(22.0f);
            float l10 = b1Var.l() + b1Var.m() + AndroidUtilities.dp(f10);
            float f83 = i10;
            float f84 = dp12 / 2.0f;
            rectF.set((f83 - measureText3) / 2.0f, l10 - f84, (f83 + measureText3) / 2.0f, l10 + f84);
            b1Var.g6 = true;
            float f85 = f7;
            b1Var.H(canvas3, rectF, f84, f85);
            b1Var.g6 = false;
            textPaint.setColor(a(f85, -218103809));
            canvas3.drawText(str, rectF.left + AndroidUtilities.dp(11.0f), l10 + AndroidUtilities.dp(4.0f), textPaint);
            if (b1Var.G2 > 0) {
                b1Var.postInvalidateDelayed(1005 - (currentTimeMillis2 % 1000));
            }
        }
    }
}
