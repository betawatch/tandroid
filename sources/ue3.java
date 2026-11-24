// default package

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.OvershootInterpolator;
import j$.util.Comparator$-CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Stack;
import java.util.regex.Pattern;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class ue3 extends hf0 implements m2b, tjb {
    public boolean A0;
    public boolean A1;
    public StaticLayout A2;
    public boolean A3;
    public boolean A4;
    public boolean B0;
    public boolean B1;
    public boolean B2;
    public boolean B3;
    public ValueAnimator B4;
    public boolean C0;
    public float C1;
    public float C2;
    public boolean C3;
    public long C4;
    public float D0;
    public float D1;
    public boolean D2;
    public int D3;
    public int D4;
    public boolean E;
    public sk0 E0;
    public float E1;
    public boolean E2;
    public int E3;
    public final cj3 E4;
    public boolean F;
    public boolean F0;
    public boolean F1;
    public Paint F2;
    public int F3;
    public StaticLayout F4;
    public boolean G;
    public final int G0;
    public final n41 G1;
    public Paint G2;
    public float G3;
    public int G4;
    public vaa H;
    public pe3 H0;
    public final Paint H1;
    public boolean H2;
    public boolean H3;
    public int H4;
    public byte I;
    public long I0;
    public final RectF I1;
    public int I2;
    public boolean I3;
    public int I4;
    public byte J;
    public String J0;
    public tgb J1;
    public int J2;
    public int J3;
    public final re3 J4;
    public byte K;
    public int K0;
    public boolean K1;
    public int K2;
    public LayerDrawable K3;
    public final wjb K4;
    public byte L;
    public long L0;
    public hj3 L1;
    public int L2;
    public int L3;
    public int L4;
    public final byte M;
    public String M0;
    public boolean M1;
    public int M2;
    public boolean M3;
    public byte M4;
    public final byte N;
    public int N0;
    public int N1;
    public int N2;
    public int N3;
    public int N4;
    public TLRPC.TL_forumTopic O;
    public boolean O0;
    public int O1;
    public StaticLayout O2;
    public int O3;
    public te3 O4;
    public boolean P;
    public boolean P0;
    public String P1;
    public int P2;
    public int P3;
    public GradientDrawable P4;
    public boolean Q;
    public boolean Q0;
    public int Q1;
    public boolean Q2;
    public int Q3;
    public int Q4;
    public boolean R;
    public boolean R0;
    public oy8 R1;
    public boolean R2;
    public int R3;
    public int R4;
    public boolean S;
    public int S0;
    public int S1;
    public boolean S2;
    public boolean S3;
    public Paint S4;
    public Paint T;
    public int T0;
    public boolean T1;
    public boolean T2;
    public final fm0 T3;
    public mh8 T4;
    public Paint U;
    public boolean U0;
    public Paint U1;
    public int U2;
    public ValueAnimator U3;
    public Drawable U4;
    public float V;
    public int V0;
    public final boolean[] V1;
    public int V2;
    public ValueAnimator V3;
    public int V4;
    public boolean W;
    public int W0;
    public final ImageReceiver[] W1;
    public int W2;
    public float W3;
    public Drawable W4;
    public int X0;
    public final boolean[] X1;
    public int X2;
    public float X3;
    public Drawable X4;
    public boolean Y0;
    public final boolean[] Y1;
    public int Y2;
    public StaticLayout Y3;
    public ColorFilter[] Y4;
    public int Z0;
    public final ImageReceiver Z1;
    public int Z2;
    public StaticLayout Z3;
    public int[] Z4;
    public boolean a0;
    public boolean a1;
    public p48 a2;
    public int a3;
    public StaticLayout a4;
    public Runnable a5;
    public TextPaint b0;
    public boolean b1;
    public final pb0 b2;
    public int b3;
    public StaticLayout b4;
    public Paint c0;
    public boolean c1;
    public boolean c2;
    public int c3;
    public boolean c4;
    public ra1 d0;
    public float d1;
    public float d2;
    public int d3;
    public boolean d4;
    public qe3 e0;
    public boolean e1;
    public final oe3 e2;
    public int e3;
    public boolean e4;
    public boolean f;
    public boolean f0;
    public boolean f1;
    public vu8 f2;
    public StaticLayout f3;
    public int f4;
    public boolean g0;
    public k27 g1;
    public TLRPC.User g2;
    public StaticLayout g3;
    public int g4;
    public final boolean h;
    public boolean h0;
    public ArrayList h1;
    public TLRPC.Chat h2;
    public int h3;
    public int h4;
    public Drawable[] i0;
    public boolean i1;
    public TLRPC.EncryptedChat i2;
    public StaticLayout i3;
    public int i4;
    public float j0;
    public CharSequence j1;
    public CharSequence j2;
    public final Stack j3;
    public StaticLayout j4;
    public boolean k0;
    public int k1;
    public int k2;
    public final ArrayList k3;
    public boolean k4;
    public boolean l0;
    public int l1;
    public boolean l2;
    public final Stack l3;
    public boolean l4;
    public int m0;
    public int m1;
    public TLRPC.DraftMessage m2;
    public final ArrayList m3;
    public boolean m4;
    public float n;
    public float n0;
    public boolean n1;
    public final lm n2;
    public cm n3;
    public final sb n4;
    public rob o0;
    public boolean o1;
    public boolean o2;
    public cm o3;
    public final tl o4;
    public Paint p0;
    public float p1;
    public final lm p2;
    public cm p3;
    public final tl p4;
    public Paint q0;
    public float q1;
    public long q2;
    public cm q3;
    public byte q4;
    public boolean r;
    public boolean r0;
    public float r1;
    public ya r2;
    public int r3;
    public boolean r4;
    public oy8 s;
    public boolean s0;
    public float s1;
    public final boolean s2;
    public int s3;
    public final RectF s4;
    public boolean t0;
    public int t1;
    public boolean t2;
    public StaticLayout t3;
    public lj3 t4;
    public wtc u0;
    public float u1;
    public boolean u2;
    public boolean u3;
    public Path u4;
    public final me3 v0;
    public int v1;
    public boolean v2;
    public int v3;
    public RectF v4;
    public int w;
    public Path w0;
    public int w1;
    public boolean w2;
    public int w3;
    public int w4;
    public boolean x;
    public qla x0;
    public float x1;
    public boolean x2;
    public boolean x3;
    public int x4;
    public boolean y;
    public boolean y0;
    public boolean y1;
    public int y2;
    public float y3;
    public int y4;
    public boolean z0;
    public oy8 z1;
    public int z2;
    public boolean z3;
    public float z4;

    /* JADX WARN: Multi-variable type inference failed */
    public ue3(cj3 cj3Var, Context context, boolean z, int i, wjb wjbVar) {
        super(context);
        this.h = true;
        this.y = true;
        int i2 = 0;
        this.E = false;
        this.I = (byte) 11;
        this.J = (byte) 72;
        this.K = (byte) 70;
        this.L = (byte) 76;
        this.M = (byte) 3;
        this.N = (byte) 11;
        this.V = 42.0f;
        me3 me3Var = new me3(this);
        this.v0 = me3Var;
        this.A0 = true;
        this.D0 = 0.0f;
        this.e1 = false;
        this.f1 = false;
        this.G1 = new n41(this);
        this.H1 = new Paint(1);
        this.I1 = new RectF();
        this.M1 = false;
        this.V1 = new boolean[3];
        this.W1 = new ImageReceiver[3];
        this.X1 = new boolean[3];
        this.Y1 = new boolean[3];
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.Z1 = imageReceiver;
        this.b2 = new pb0((wjb) null);
        this.e2 = new oe3(0 == true ? 1 : 0);
        s33 s33Var = s33.h;
        this.n2 = new lm(this, 0L, 350L, s33Var);
        this.p2 = new lm(this, 0L, 350L, s33Var);
        this.j3 = new Stack();
        this.k3 = new ArrayList();
        this.l3 = new Stack();
        this.m3 = new ArrayList();
        this.M3 = true;
        this.T3 = new fm0(320L, this, s33Var);
        this.W3 = 1.0f;
        this.X3 = 1.0f;
        this.s4 = new RectF();
        this.y4 = -1;
        this.I4 = -1;
        this.J4 = new re3(this);
        me3Var.I = true;
        this.K4 = wjbVar;
        this.E4 = cj3Var;
        bkb.S(context);
        this.E = false;
        this.F = false;
        imageReceiver.q0(gl.L(26.0f));
        while (true) {
            ImageReceiver[] imageReceiverArr = this.W1;
            if (i2 >= imageReceiverArr.length) {
                this.s2 = z;
                this.G0 = i;
                sb sbVar = new sb((byte) 10, context, this);
                this.n4 = sbVar;
                addView(sbVar);
                this.o4 = new tl(gl.L(22.0f), sbVar);
                this.p4 = new tl(gl.L(17.0f), this);
                this.Z1.A1 = true;
                return;
            }
            imageReceiverArr[i2] = new ImageReceiver(this);
            ImageReceiver imageReceiver2 = this.W1[i2];
            imageReceiver2.y = true;
            imageReceiver2.q0(gl.L(2.0f));
            this.W1[i2].A1 = true;
            i2++;
        }
    }

    public static SpannableStringBuilder R(int i, CharSequence charSequence, CharSequence charSequence2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (i == 1) {
            spannableStringBuilder.append(charSequence2).append((CharSequence) ": \u2068").append(charSequence).append((CharSequence) "\u2069");
            return spannableStringBuilder;
        }
        if (i == 2) {
            spannableStringBuilder.append((CharSequence) "\u2068").append(charSequence).append((CharSequence) "\u2069");
            return spannableStringBuilder;
        }
        if (i == 3) {
            spannableStringBuilder.append(charSequence2).append((CharSequence) ": ").append(charSequence);
            return spannableStringBuilder;
        }
        if (i != 4) {
            return spannableStringBuilder;
        }
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private k27 getCaptionMessage() {
        CharSequence charSequence;
        if (this.h1 == null) {
            k27 k27Var = this.g1;
            if (k27Var == null || k27Var.z == null) {
                return null;
            }
            return k27Var;
        }
        int i = 0;
        k27 k27Var2 = null;
        for (int i2 = 0; i2 < this.h1.size(); i2++) {
            k27 k27Var3 = (k27) this.h1.get(i2);
            if (k27Var3 != null && (charSequence = k27Var3.z) != null) {
                if (!TextUtils.isEmpty(charSequence)) {
                    i++;
                }
                k27Var2 = k27Var3;
            }
        }
        if (i > 1) {
            return null;
        }
        return k27Var2;
    }

    private int getCollapsedHeight() {
        boolean z = this.s2;
        int L = gl.L((z || gba.l1) ? this.L : this.K) + 1;
        if (this.R) {
            L += gl.L(20.0f);
        }
        if (!V() || ((z || gba.l1) && !Z())) {
            return L;
        }
        return gl.L(Z() ? this.N : this.M) + L;
    }

    private Paint getPaintReorderGradient() {
        int v0 = bkb.v0(bkb.c6, this.K4);
        if (this.R4 != v0 || this.S4 == null) {
            this.R4 = v0;
            if (this.S4 == null) {
                this.S4 = new Paint(1);
            }
            this.S4.setShader(new LinearGradient(0.0f, 0.0f, gl.L(24.0f), 0.0f, new int[]{0, v0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        }
        return this.S4;
    }

    private TextPaint getTimeTextPaint() {
        return this.H3 ? W() ? bkb.I0 : bkb.J0 : bkb.H0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTopicId() {
        TLRPC.TL_forumTopic tL_forumTopic = this.O;
        if (tL_forumTopic == null) {
            return 0;
        }
        return tL_forumTopic.id;
    }

    public final void A() {
        TLRPC.Message message;
        k27 k27Var = this.g1;
        if (k27Var == null || (message = k27Var.k) == null) {
            return;
        }
        TLRPC.MessageAction messageAction = message.action;
        if ((messageAction instanceof TLRPC.TL_messageActionSetChatTheme) && this.Y0) {
            je2 e = je2.e(this.G0);
            long j = this.I0;
            TLRPC.ChatTheme chatTheme = ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme;
            e.q(j, elb.c(chatTheme), chatTheme, false);
        }
    }

    public final void D() {
        TLRPC.Chat chat = this.h2;
        boolean z = chat != null && chat.call_active && chat.call_not_empty;
        this.w2 = z;
        this.r1 = z ? 1.0f : 0.0f;
    }

    public final void G() {
        TLRPC.User V1;
        if (this.g2 != null && (V1 = na7.q1(this.G0).V1(Long.valueOf(this.g2.id))) != null) {
            this.g2 = V1;
        }
        this.q1 = a0() ? 1.0f : 0.0f;
    }

    public final void H() {
        ya yaVar;
        boolean z = this.m0 > 0 && !this.w2 && !a0() && ((yaVar = this.r2) == null || !yaVar.a.q) && !this.v0.w;
        this.x2 = z;
        this.n0 = z ? 1.0f : 0.0f;
    }

    public final int I() {
        if (!Z() || this.k0 || this.f) {
            return getCollapsedHeight();
        }
        int L = gl.L((this.s2 || gba.l1) ? 86.0f : 91.0f);
        if (this.t2) {
            L++;
        }
        return V() ? gl.L(this.N) + L : L;
    }

    public final void J(int i, int i2) {
        this.z4 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.B4 = ofFloat;
        ofFloat.setDuration(220L);
        this.B4.setInterpolator(s33.f);
        this.x4 = i;
        this.w4 = i2;
        this.B4.addUpdateListener(new ke3(this, (byte) 2));
        this.B4.addListener(new ne3(this, (byte) 2));
        this.A4 = true;
        this.B4.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0225, code lost:
    
        if (r3 > 0) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0725  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0730  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0325  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean K(Canvas canvas) {
        boolean z;
        float f;
        float L;
        int i;
        float L2;
        float L3;
        float L4;
        float f2;
        float L5;
        float L6;
        float L7;
        float f3;
        float L8;
        float L9;
        float f4;
        float L10;
        float L11;
        float f5;
        float f6;
        float f7;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        float L12;
        ImageReceiver imageReceiver;
        Drawable drawable;
        Drawable drawable2;
        BitmapShader bitmapShader;
        ya yaVar;
        BitmapShader bitmapShader2;
        mh8 mh8Var;
        TLRPC.Chat chat = this.h2;
        boolean z6 = false;
        if (chat == null || (chat.flags2 & 2048) == 0) {
            z = false;
        } else {
            float x = this.Z1.x();
            float w = this.Z1.w();
            ya yaVar2 = this.r2;
            float progress = (yaVar2 == null || !yaVar2.a.q) ? 1.0f : 1.0f - yaVar2.getProgress();
            if (this.X4 == null) {
                this.X4 = getContext().getResources().getDrawable(R.drawable.star_small_outline).mutate();
            }
            int w0 = bkb.w0(null, bkb.c6, false);
            if (this.V4 != w0) {
                Drawable drawable3 = this.X4;
                this.V4 = w0;
                drawable3.setColorFilter(new PorterDuffColorFilter(w0, PorterDuff.Mode.SRC_IN));
            }
            if (this.W4 == null) {
                this.W4 = getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate();
            }
            int L13 = gl.L(19.33f);
            Rect rect = gl.Q;
            int i2 = (int) w;
            int i3 = (int) x;
            int i4 = i3 - L13;
            rect.set((gl.L(1.66f) + i2) - L13, i4, gl.L(1.66f) + i2, i3);
            rect.inset(-gl.L(1.0f), -gl.L(1.0f));
            this.X4.setBounds(rect);
            int i5 = (int) (progress * 255.0f);
            this.X4.setAlpha(i5);
            this.X4.draw(canvas);
            rect.set((gl.L(1.66f) + i2) - L13, i4, gl.L(1.66f) + i2, i3);
            this.W4.setBounds(rect);
            this.W4.setAlpha(i5);
            this.W4.draw(canvas);
            z = true;
        }
        float d = this.n2.d(this.o2 && !z);
        float f8 = 10.0f;
        if (d > 0.0f) {
            float s = this.Z1.s() + gl.L(18.0f);
            float r = this.Z1.r() + gl.L(18.0f);
            canvas.save();
            bkb.s0.setColor(bkb.v0(bkb.c6, this.K4));
            canvas.drawCircle(r, s, gl.L(11.33f) * d, bkb.s0);
            mh8 mh8Var2 = this.T4;
            if (mh8Var2 == null) {
                mh8 mh8Var3 = new mh8(bkb.Bk, bkb.Ck, -1, -1, this.K4);
                this.T4 = mh8Var3;
                mh8Var = mh8Var3;
            } else {
                mh8Var = mh8Var2;
            }
            mh8Var.d((int) (r - gl.L(10.0f)), 0.0f, (int) (s - gl.L(10.0f)), (int) (gl.L(10.0f) + r), 0.0f, (int) (gl.L(10.0f) + s));
            canvas.drawCircle(r, s, gl.L(10.0f) * d, this.T4.f);
            if (this.U4 == null) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                this.U4 = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            this.U4.setBounds((int) (r - (((r4.getIntrinsicWidth() / 2.0f) * 0.875f) * d)), (int) (s - (((this.U4.getIntrinsicHeight() / 2.0f) * 0.875f) * d)), (int) (((this.U4.getIntrinsicWidth() / 2.0f) * 0.875f * d) + r), (int) (((this.U4.getIntrinsicHeight() / 2.0f) * 0.875f * d) + s));
            this.U4.setAlpha((int) (d * 255.0f));
            this.U4.draw(canvas);
            canvas.restore();
            return false;
        }
        if (!this.O0 || this.K0 != 0 || z) {
            return false;
        }
        boolean z7 = (this.m0 <= 0 || a0() || this.w2 || this.v0.w) ? false : true;
        this.x2 = z7;
        if (this.j0 != 1.0f && (z7 || this.n0 > 0.0f)) {
            rob robVar = this.o0;
            if (robVar != null) {
                int i6 = robVar.f;
                int i7 = this.m0;
                if (i6 != i7) {
                }
                if (this.p0 == null) {
                    this.p0 = new Paint(1);
                    Paint paint = new Paint(1);
                    this.q0 = paint;
                    paint.setColor(838860800);
                }
                int x2 = (int) (this.Z1.x() - gl.L(9.0f));
                boolean z8 = k96.a0;
                me3 me3Var = this.v0;
                int L14 = (int) (!z8 ? me3Var.F.left + gl.L(9.0f) : me3Var.F.right - gl.L(9.0f));
                this.o0.setBounds(0, 0, gl.L(22.0f), gl.L(22.0f));
                this.o0.b(this.m0);
                imageReceiver = this.Z1;
                drawable = imageReceiver.b0;
                if (drawable != null || (bitmapShader2 = imageReceiver.c0) == null) {
                    drawable2 = imageReceiver.n0;
                    if (drawable2 != null || (bitmapShader = imageReceiver.d0) == null) {
                        this.p0.setShader(null);
                        if (this.Z1.n() == null && !this.Z1.n().isRecycled()) {
                            this.p0.setColor(gl.I0(this.Z1.n()));
                        } else if (this.Z1.t() instanceof i9c) {
                            Paint paint2 = this.p0;
                            pb0 pb0Var = this.b2;
                            boolean z9 = pb0Var.g;
                            int i8 = pb0Var.e;
                            if (z9) {
                                zjb i9 = bkb.I.i(false);
                                i8 = bkb.B(bkb.I, i9 != null ? i9.c : 0, i8);
                            }
                            paint2.setColor(i8);
                        } else {
                            this.p0.setColor(((i9c) this.Z1.t()).a.a());
                        }
                        canvas.save();
                        float f9 = (1.0f - this.j0) * this.n0;
                        yaVar = this.r2;
                        if (yaVar != null) {
                            f9 *= 1.0f - yaVar.getProgress();
                        }
                        float f10 = L14;
                        float f11 = x2;
                        canvas.scale(f9, f9, f10, f11);
                        canvas.drawCircle(f10, f11, gl.N(11.0f), this.p0);
                        canvas.drawCircle(f10, f11, gl.N(11.0f), this.q0);
                        canvas.save();
                        canvas.translate(f10 - gl.N(11.0f), f11 - gl.N(11.0f));
                        this.o0.draw(canvas);
                        canvas.restore();
                        canvas.restore();
                    } else {
                        imageReceiver.j(null, drawable2, kk7.d4, bitmapShader, 0, 0, 0, null);
                    }
                } else {
                    imageReceiver.j(null, drawable, kk7.d4, bitmapShader2, 0, 0, 0, null);
                }
                ImageReceiver imageReceiver2 = this.Z1;
                BitmapShader bitmapShader3 = imageReceiver2.c0;
                if (bitmapShader3 != null) {
                    this.p0.setShader(bitmapShader3);
                } else {
                    BitmapShader bitmapShader4 = imageReceiver2.d0;
                    if (bitmapShader4 != null) {
                        this.p0.setShader(bitmapShader4);
                    }
                }
                canvas.save();
                float f92 = (1.0f - this.j0) * this.n0;
                yaVar = this.r2;
                if (yaVar != null) {
                }
                float f102 = L14;
                float f112 = x2;
                canvas.scale(f92, f92, f102, f112);
                canvas.drawCircle(f102, f112, gl.N(11.0f), this.p0);
                canvas.drawCircle(f102, f112, gl.N(11.0f), this.q0);
                canvas.save();
                canvas.translate(f102 - gl.N(11.0f), f112 - gl.N(11.0f));
                this.o0.draw(canvas);
                canvas.restore();
                canvas.restore();
            }
            int i10 = this.m0;
            rob robVar2 = new rob(a.b, null);
            robVar2.m = true;
            robVar2.b(i10);
            this.o0 = robVar2;
            if (this.p0 == null) {
            }
            int x22 = (int) (this.Z1.x() - gl.L(9.0f));
            boolean z82 = k96.a0;
            me3 me3Var2 = this.v0;
            int L142 = (int) (!z82 ? me3Var2.F.left + gl.L(9.0f) : me3Var2.F.right - gl.L(9.0f));
            this.o0.setBounds(0, 0, gl.L(22.0f), gl.L(22.0f));
            this.o0.b(this.m0);
            imageReceiver = this.Z1;
            drawable = imageReceiver.b0;
            if (drawable != null) {
            }
            drawable2 = imageReceiver.n0;
            if (drawable2 != null) {
            }
            this.p0.setShader(null);
            if (this.Z1.n() == null) {
            }
            if (this.Z1.t() instanceof i9c) {
            }
            canvas.save();
            float f922 = (1.0f - this.j0) * this.n0;
            yaVar = this.r2;
            if (yaVar != null) {
            }
            float f1022 = L142;
            float f1122 = x22;
            canvas.scale(f922, f922, f1022, f1122);
            canvas.drawCircle(f1022, f1122, gl.N(11.0f), this.p0);
            canvas.drawCircle(f1022, f1122, gl.N(11.0f), this.q0);
            canvas.save();
            canvas.translate(f1022 - gl.N(11.0f), f1122 - gl.N(11.0f));
            this.o0.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
        TLRPC.User user = this.g2;
        if (user == null || na7.E2(user) || this.g2.bot) {
            TLRPC.Chat chat2 = this.h2;
            if (chat2 != null) {
                boolean z10 = chat2.call_active && chat2.call_not_empty;
                this.w2 = z10;
                if ((z10 || this.r1 != 0.0f) && this.j0 < 1.0f) {
                    ya yaVar3 = this.r2;
                    float progress2 = (yaVar3 == null || !yaVar3.a.q) ? 1.0f : 1.0f - yaVar3.getProgress();
                    int L15 = (int) (this.v0.F.bottom - gl.L((this.s2 || gba.l1) ? 6.0f : 8.0f));
                    boolean z11 = k96.a0;
                    f = 0.10666667f;
                    me3 me3Var3 = this.v0;
                    if (z11) {
                        float f12 = me3Var3.F.left;
                        if (!this.s2 && !gba.l1) {
                            f8 = 6.0f;
                        }
                        L = f12 + gl.L(f8);
                    } else {
                        float f13 = me3Var3.F.right;
                        if (!this.s2 && !gba.l1) {
                            f8 = 6.0f;
                        }
                        L = f13 - gl.L(f8);
                    }
                    int i11 = (int) L;
                    if (this.j0 != 0.0f) {
                        canvas.save();
                        float f14 = 1.0f - this.j0;
                        canvas.scale(f14, f14, i11, L15);
                    }
                    Paint paint3 = bkb.s0;
                    int i12 = bkb.c6;
                    paint3.setColor(bkb.v0(i12, this.K4));
                    float f15 = i11;
                    float f16 = L15;
                    canvas.drawCircle(f15, f16, gl.L(11.0f) * this.r1 * progress2, bkb.s0);
                    bkb.s0.setColor(bkb.v0(bkb.S8, this.K4));
                    canvas.drawCircle(f15, f16, gl.L(9.0f) * this.r1 * progress2, bkb.s0);
                    bkb.s0.setColor(bkb.v0(i12, this.K4));
                    if (!e66.e(360928)) {
                        this.s1 = 0.65f;
                    }
                    int i13 = this.t1;
                    if (i13 != 0) {
                        i = 360928;
                        if (i13 != 1) {
                            if (i13 != 2) {
                                if (i13 == 3) {
                                    L2 = gl.L(3.0f) - (gl.L(2.0f) * this.s1);
                                    L3 = gl.L(1.0f);
                                    L4 = gl.L(2.0f);
                                    f2 = this.s1;
                                } else if (i13 == 4) {
                                    L2 = (gl.L(4.0f) * this.s1) + gl.L(1.0f);
                                    L10 = gl.L(3.0f);
                                    L11 = gl.L(2.0f);
                                    f5 = this.s1;
                                } else if (i13 == 5) {
                                    L5 = gl.L(5.0f) - (gl.L(4.0f) * this.s1);
                                    L8 = gl.L(1.0f);
                                    L9 = gl.L(4.0f);
                                    f4 = this.s1;
                                } else if (i13 == 6) {
                                    L5 = gl.L(1.0f) + (gl.L(4.0f) * this.s1);
                                    L6 = gl.L(5.0f);
                                    L7 = gl.L(4.0f);
                                    f3 = this.s1;
                                } else {
                                    L2 = gl.L(5.0f) - (gl.L(4.0f) * this.s1);
                                    L3 = gl.L(1.0f);
                                    L4 = gl.L(2.0f);
                                    f2 = this.s1;
                                }
                                f6 = L3 + (L4 * f2);
                                if (this.r1 >= 1.0f || progress2 < 1.0f) {
                                    canvas.save();
                                    float f17 = this.r1 * progress2;
                                    canvas.scale(f17, f17, f15, f16);
                                }
                                z2 = true;
                                this.s4.set(i11 - gl.L(1.0f), f16 - L2, gl.L(1.0f) + i11, L2 + f16);
                                canvas.drawRoundRect(this.s4, gl.L(1.0f), gl.L(1.0f), bkb.s0);
                                float f18 = f16 - f6;
                                float f19 = f16 + f6;
                                this.s4.set(i11 - gl.L(5.0f), f18, i11 - gl.L(3.0f), f19);
                                canvas.drawRoundRect(this.s4, gl.L(1.0f), gl.L(1.0f), bkb.s0);
                                this.s4.set(gl.L(3.0f) + i11, f18, gl.L(5.0f) + i11, f19);
                                canvas.drawRoundRect(this.s4, gl.L(1.0f), gl.L(1.0f), bkb.s0);
                                if (this.r1 >= 1.0f || progress2 < 1.0f) {
                                    canvas.restore();
                                }
                                if (e66.e(i)) {
                                    float f20 = this.s1 + 0.04f;
                                    this.s1 = f20;
                                    if (f20 >= 1.0f) {
                                        this.s1 = 0.0f;
                                        int i14 = this.t1 + 1;
                                        this.t1 = i14;
                                        if (i14 >= 8) {
                                            this.t1 = 0;
                                        }
                                    }
                                    z6 = true;
                                }
                                z3 = this.w2;
                                float f21 = this.r1;
                                if (z3) {
                                    if (f21 > 0.0f) {
                                        float f22 = f21 - 0.10666667f;
                                        this.r1 = f22;
                                        if (f22 < 0.0f) {
                                            this.r1 = 0.0f;
                                        }
                                    }
                                } else if (f21 < 1.0f) {
                                    float f23 = f21 + 0.10666667f;
                                    this.r1 = f23;
                                    if (f23 > 1.0f) {
                                        this.r1 = 1.0f;
                                    }
                                }
                                if (this.j0 != 0.0f) {
                                    canvas.restore();
                                }
                                z4 = this.x2;
                                float f24 = this.n0;
                                if (z4) {
                                    if (f24 < 1.0f) {
                                        f24 += f;
                                        this.n0 = f24;
                                        z5 = z2;
                                    }
                                    z5 = z6;
                                } else {
                                    if (f24 > 0.0f) {
                                        f24 -= f;
                                        this.n0 = f24;
                                        z5 = z2;
                                    }
                                    z5 = z6;
                                }
                                this.n0 = Utilities.i(f24, 1.0f, 0.0f);
                                return z5;
                            }
                            L5 = gl.L(1.0f) + (gl.L(2.0f) * this.s1);
                            L6 = gl.L(5.0f);
                            L7 = gl.L(4.0f);
                            f3 = this.s1;
                            f7 = L6 - (L7 * f3);
                            L2 = L5;
                            f6 = f7;
                            if (this.r1 >= 1.0f) {
                            }
                            canvas.save();
                            float f172 = this.r1 * progress2;
                            canvas.scale(f172, f172, f15, f16);
                            z2 = true;
                            this.s4.set(i11 - gl.L(1.0f), f16 - L2, gl.L(1.0f) + i11, L2 + f16);
                            canvas.drawRoundRect(this.s4, gl.L(1.0f), gl.L(1.0f), bkb.s0);
                            float f182 = f16 - f6;
                            float f192 = f16 + f6;
                            this.s4.set(i11 - gl.L(5.0f), f182, i11 - gl.L(3.0f), f192);
                            canvas.drawRoundRect(this.s4, gl.L(1.0f), gl.L(1.0f), bkb.s0);
                            this.s4.set(gl.L(3.0f) + i11, f182, gl.L(5.0f) + i11, f192);
                            canvas.drawRoundRect(this.s4, gl.L(1.0f), gl.L(1.0f), bkb.s0);
                            if (this.r1 >= 1.0f) {
                            }
                            canvas.restore();
                            if (e66.e(i)) {
                            }
                            z3 = this.w2;
                            float f212 = this.r1;
                            if (z3) {
                            }
                            if (this.j0 != 0.0f) {
                            }
                            z4 = this.x2;
                            float f242 = this.n0;
                            if (z4) {
                            }
                            this.n0 = Utilities.i(f242, 1.0f, 0.0f);
                            return z5;
                        }
                        L5 = gl.L(5.0f) - (gl.L(4.0f) * this.s1);
                        L8 = gl.L(1.0f);
                        L9 = gl.L(4.0f);
                        f4 = this.s1;
                        f7 = L8 + (L9 * f4);
                        L2 = L5;
                        f6 = f7;
                        if (this.r1 >= 1.0f) {
                        }
                        canvas.save();
                        float f1722 = this.r1 * progress2;
                        canvas.scale(f1722, f1722, f15, f16);
                        z2 = true;
                        this.s4.set(i11 - gl.L(1.0f), f16 - L2, gl.L(1.0f) + i11, L2 + f16);
                        canvas.drawRoundRect(this.s4, gl.L(1.0f), gl.L(1.0f), bkb.s0);
                        float f1822 = f16 - f6;
                        float f1922 = f16 + f6;
                        this.s4.set(i11 - gl.L(5.0f), f1822, i11 - gl.L(3.0f), f1922);
                        canvas.drawRoundRect(this.s4, gl.L(1.0f), gl.L(1.0f), bkb.s0);
                        this.s4.set(gl.L(3.0f) + i11, f1822, gl.L(5.0f) + i11, f1922);
                        canvas.drawRoundRect(this.s4, gl.L(1.0f), gl.L(1.0f), bkb.s0);
                        if (this.r1 >= 1.0f) {
                        }
                        canvas.restore();
                        if (e66.e(i)) {
                        }
                        z3 = this.w2;
                        float f2122 = this.r1;
                        if (z3) {
                        }
                        if (this.j0 != 0.0f) {
                        }
                        z4 = this.x2;
                        float f2422 = this.n0;
                        if (z4) {
                        }
                        this.n0 = Utilities.i(f2422, 1.0f, 0.0f);
                        return z5;
                    }
                    i = 360928;
                    L2 = (gl.L(4.0f) * this.s1) + gl.L(1.0f);
                    L10 = gl.L(3.0f);
                    L11 = gl.L(2.0f);
                    f5 = this.s1;
                    f6 = L10 - (L11 * f5);
                    if (this.r1 >= 1.0f) {
                    }
                    canvas.save();
                    float f17222 = this.r1 * progress2;
                    canvas.scale(f17222, f17222, f15, f16);
                    z2 = true;
                    this.s4.set(i11 - gl.L(1.0f), f16 - L2, gl.L(1.0f) + i11, L2 + f16);
                    canvas.drawRoundRect(this.s4, gl.L(1.0f), gl.L(1.0f), bkb.s0);
                    float f18222 = f16 - f6;
                    float f19222 = f16 + f6;
                    this.s4.set(i11 - gl.L(5.0f), f18222, i11 - gl.L(3.0f), f19222);
                    canvas.drawRoundRect(this.s4, gl.L(1.0f), gl.L(1.0f), bkb.s0);
                    this.s4.set(gl.L(3.0f) + i11, f18222, gl.L(5.0f) + i11, f19222);
                    canvas.drawRoundRect(this.s4, gl.L(1.0f), gl.L(1.0f), bkb.s0);
                    if (this.r1 >= 1.0f) {
                    }
                    canvas.restore();
                    if (e66.e(i)) {
                    }
                    z3 = this.w2;
                    float f21222 = this.r1;
                    if (z3) {
                    }
                    if (this.j0 != 0.0f) {
                    }
                    z4 = this.x2;
                    float f24222 = this.n0;
                    if (z4) {
                    }
                    this.n0 = Utilities.i(f24222, 1.0f, 0.0f);
                    return z5;
                }
            }
        } else {
            boolean a0 = a0();
            this.C0 = a0;
            if (a0 || this.q1 != 0.0f) {
                int L16 = (int) (this.v0.F.bottom - gl.L((this.s2 || gba.l1) ? 6.0f : 8.0f));
                boolean z12 = k96.a0;
                me3 me3Var4 = this.v0;
                if (z12) {
                    float f25 = me3Var4.F.left;
                    if (!this.s2 && !gba.l1) {
                        f8 = 6.0f;
                    }
                    L12 = f25 + gl.L(f8);
                } else {
                    float f26 = me3Var4.F.right;
                    if (!this.s2 && !gba.l1) {
                        f8 = 6.0f;
                    }
                    L12 = f26 - gl.L(f8);
                }
                int i15 = (int) L12;
                bkb.s0.setColor(bkb.v0(bkb.c6, this.K4));
                float f27 = i15;
                float f28 = L16;
                canvas.drawCircle(f27, f28, gl.L(7.0f) * this.q1, bkb.s0);
                bkb.s0.setColor(bkb.v0(bkb.S8, this.K4));
                canvas.drawCircle(f27, f28, gl.L(5.0f) * this.q1, bkb.s0);
                float f29 = this.q1;
                if (a0) {
                    if (f29 < 1.0f) {
                        float f30 = f29 + 0.10666667f;
                        this.q1 = f30;
                        if (f30 > 1.0f) {
                            this.q1 = 1.0f;
                        }
                        z6 = true;
                    }
                } else if (f29 > 0.0f) {
                    float f31 = f29 - 0.10666667f;
                    this.q1 = f31;
                    if (f31 < 0.0f) {
                        this.q1 = 0.0f;
                    }
                    z6 = true;
                }
            }
        }
        f = 0.10666667f;
        z2 = true;
        z4 = this.x2;
        float f242222 = this.n0;
        if (z4) {
        }
        this.n0 = Utilities.i(f242222, 1.0f, 0.0f);
        return z5;
    }

    public final void L(Canvas canvas, boolean z, boolean z2, boolean z3, boolean z4, float f) {
        if (f != 0.0f || z4) {
            float f2 = (f * 0.5f) + 0.5f;
            if (z) {
                hf0.t(this.W2, this.X2, bkb.W0);
                if (f != 1.0f) {
                    canvas.save();
                    canvas.scale(f2, f2, bkb.W0.getBounds().centerX(), bkb.V0.getBounds().centerY());
                    bkb.W0.setAlpha((int) (f * 255.0f));
                }
                bkb.W0.draw(canvas);
                if (f != 1.0f) {
                    canvas.restore();
                    bkb.W0.setAlpha(kk7.d4);
                }
                invalidate();
                return;
            }
            if (z3) {
                if (!z2) {
                    hf0.t(this.V2, this.X2, bkb.S0);
                    if (f != 1.0f) {
                        canvas.save();
                        canvas.scale(f2, f2, bkb.S0.getBounds().centerX(), bkb.V0.getBounds().centerY());
                        bkb.S0.setAlpha((int) (f * 255.0f));
                    }
                    bkb.S0.draw(canvas);
                    if (f != 1.0f) {
                        canvas.restore();
                        bkb.S0.setAlpha(kk7.d4);
                        return;
                    }
                    return;
                }
                hf0.t(this.Y2, this.X2, bkb.V0);
                if (z4) {
                    canvas.save();
                    canvas.scale(f2, f2, bkb.V0.getBounds().centerX(), bkb.V0.getBounds().centerY());
                    bkb.V0.setAlpha((int) (255.0f * f));
                } else if (f != 0.0f) {
                    canvas.save();
                    canvas.scale(f2, f2, bkb.V0.getBounds().centerX(), bkb.V0.getBounds().centerY());
                    int i = (int) (255.0f * f);
                    bkb.V0.setAlpha(i);
                    bkb.U0.setAlpha(i);
                }
                bkb.V0.draw(canvas);
                if (z4) {
                    canvas.restore();
                    canvas.save();
                    canvas.translate((1.0f - f) * gl.L(4.0f), 0.0f);
                }
                hf0.t(this.U2, this.X2, bkb.U0);
                bkb.U0.draw(canvas);
                if (z4) {
                    canvas.restore();
                    bkb.V0.setAlpha(kk7.d4);
                } else if (f != 0.0f) {
                    canvas.restore();
                    bkb.V0.setAlpha(kk7.d4);
                    bkb.U0.setAlpha(kk7.d4);
                }
            }
        }
    }

    public final void M(Canvas canvas, boolean z, int i, int i2, int i3, float f, boolean z2) {
        float f2;
        Paint paint;
        boolean z3;
        RectF rectF;
        RectF rectF2;
        boolean z4 = Z() || Y();
        if (!(this.H3 && this.M3) && this.W3 == 1.0f) {
            return;
        }
        float f3 = (this.T0 != 0 || this.U0) ? this.W3 : 1.0f - this.W3;
        int i4 = kk7.d4;
        if (z2) {
            if (this.U == null) {
                Paint paint2 = new Paint();
                this.U = paint2;
                paint2.setStyle(Paint.Style.STROKE);
                this.U.setStrokeWidth(gl.L(2.0f));
                this.U.setStrokeJoin(Paint.Join.ROUND);
                this.U.setStrokeCap(Paint.Cap.ROUND);
            }
            f2 = 1.0f;
            this.U.setColor(bm2.f(Color.alpha(r14) / 255.0f, bkb.w0(null, bkb.c6, false), bm2.o(bkb.w0(null, bkb.r9, false), kk7.d4)));
        } else {
            f2 = 1.0f;
        }
        if (this.Q && this.O.read_inbox_max_id == 0) {
            paint = this.T;
            if (paint == null) {
                paint = new Paint();
                this.T = paint;
            }
            int v0 = bkb.v0(z ? bkb.Uk : bkb.Tk, this.K4);
            paint.setColor(v0);
            bkb.L0.setColor(v0);
            i4 = z ? 30 : 40;
            z3 = true;
        } else {
            paint = (z || this.K0 != 0) ? bkb.x0 : bkb.v0;
            z3 = false;
        }
        StaticLayout staticLayout = this.Z3;
        RectF rectF3 = this.s4;
        if (staticLayout == null || this.T0 == 0) {
            if (this.T0 != 0) {
                staticLayout = this.Y3;
            }
            paint.setAlpha((int) ((f2 - this.y3) * i4));
            bkb.L0.setAlpha((int) ((f2 - this.y3) * 255.0f));
            float f4 = i;
            rectF3.set(i2, f4, gl.L(12.666f) + this.P3 + i2, gl.L(20.666f) + i);
            int save = canvas.save();
            if (f != f2) {
                canvas.scale(f, f, rectF3.centerX(), rectF3.centerY());
            }
            if (f3 != f2) {
                canvas.scale(f3, f3, rectF3.centerX(), rectF3.centerY());
            }
            if (z4) {
                if (this.u4 == null || (rectF = this.v4) == null || !rectF.equals(rectF3)) {
                    RectF rectF4 = this.v4;
                    if (rectF4 == null) {
                        this.v4 = new RectF(rectF3);
                    } else {
                        rectF4.set(rectF3);
                    }
                    Path path = this.u4;
                    if (path == null) {
                        path = new Path();
                        this.u4 = path;
                    }
                    dpd.a(path, this.v4, gl.L(10.33f));
                }
                canvas.drawPath(this.u4, paint);
                if (z2) {
                    canvas.drawPath(this.u4, this.U);
                }
            } else {
                canvas.drawRoundRect(rectF3, gl.L(11.5f), gl.L(11.5f), paint);
                if (z2) {
                    canvas.drawRoundRect(rectF3, gl.L(11.5f), gl.L(11.5f), this.U);
                }
            }
            if (staticLayout != null) {
                canvas.save();
                canvas.translate(gl.L(6.333f) + i2, gl.N(3.0f) + f4);
                staticLayout.draw(canvas);
                canvas.restore();
            }
            canvas.restoreToCount(save);
        } else {
            paint.setAlpha((int) ((f2 - this.y3) * i4));
            bkb.L0.setAlpha((int) ((f2 - this.y3) * 255.0f));
            float f5 = f3 * 2.0f;
            float f6 = f5 > f2 ? f2 : f5;
            float f7 = f2 - f6;
            float f8 = (i3 * f7) + (i2 * f6);
            float f9 = i;
            rectF3.set(f8, f9, (this.Q3 * f7) + (this.P3 * f6) + f8 + gl.L(12.666f), gl.L(20.666f) + i);
            float interpolation = ((f3 <= 0.5f ? s33.g.getInterpolation(f5) : s33.i.getInterpolation(f2 - ((f3 - 0.5f) * 2.0f))) * 0.1f) + f2;
            canvas.save();
            float f10 = interpolation * f;
            canvas.scale(f10, f10, rectF3.centerX(), rectF3.centerY());
            if (z4) {
                if (this.u4 == null || (rectF2 = this.v4) == null || !rectF2.equals(rectF3)) {
                    RectF rectF5 = this.v4;
                    if (rectF5 == null) {
                        this.v4 = new RectF(rectF3);
                    } else {
                        rectF5.set(rectF3);
                    }
                    Path path2 = this.u4;
                    if (path2 == null) {
                        path2 = new Path();
                        this.u4 = path2;
                    }
                    dpd.a(path2, this.v4, gl.L(10.33f));
                }
                canvas.drawPath(this.u4, paint);
                if (z2) {
                    canvas.drawPath(this.u4, this.U);
                }
            } else {
                canvas.drawRoundRect(rectF3, gl.L(11.5f), gl.L(11.5f), paint);
                if (z2) {
                    canvas.drawRoundRect(rectF3, gl.L(11.5f), gl.L(11.5f), this.U);
                }
            }
            if (this.a4 != null) {
                canvas.save();
                canvas.translate(gl.N(6.333f) + f8, gl.N(3.0f) + f9);
                this.a4.draw(canvas);
                canvas.restore();
            }
            int alpha = bkb.L0.getAlpha();
            float f11 = alpha;
            bkb.L0.setAlpha((int) (f11 * f6));
            if (this.b4 != null) {
                canvas.save();
                canvas.translate(gl.N(6.333f) + f8, gl.N(3.0f) + ((this.S3 ? gl.L(17.0f) : -gl.L(17.0f)) * f7) + f9);
                this.b4.draw(canvas);
                canvas.restore();
            } else if (this.Y3 != null) {
                canvas.save();
                canvas.translate(gl.N(6.333f) + f8, gl.N(3.0f) + ((this.S3 ? gl.L(17.0f) : -gl.L(17.0f)) * f7) + f9);
                this.Y3.draw(canvas);
                canvas.restore();
            }
            if (this.Z3 != null) {
                bkb.L0.setAlpha((int) (f11 * f7));
                canvas.save();
                canvas.translate(gl.N(6.333f) + f8, gl.N(3.0f) + ((this.S3 ? -gl.L(17.0f) : gl.L(17.0f)) * f6) + f9);
                this.Z3.draw(canvas);
                canvas.restore();
            }
            bkb.L0.setAlpha(alpha);
            canvas.restore();
        }
        if (z3) {
            bkb.L0.setColor(bkb.w0(null, bkb.V8, false));
        }
    }

    public boolean O() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00dd A[EDGE_INSN: B:23:0x00dd->B:24:0x00dd BREAK  A[LOOP:0: B:2:0x001d->B:34:0x00d9], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence P() {
        TLRPC.Chat K0;
        TLRPC.User user;
        TLRPC.User V1;
        String M0;
        int i = this.G0;
        na7 q1 = na7.q1(i);
        ArrayList U0 = q1.U0(this.K0);
        this.N0 = U0.size();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int size = U0.size();
        for (int i2 = 0; i2 < size; i2++) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) U0.get(i2);
            if (!q1.u2(dialog.id)) {
                boolean B = cf3.B(dialog.id);
                long j = dialog.id;
                if (!B) {
                    boolean D = cf3.D(j);
                    long j2 = dialog.id;
                    if (!D) {
                        K0 = q1.K0(Long.valueOf(-j2));
                        user = null;
                        if (K0 == null) {
                            M0 = K0.title.replace('\n', ' ');
                        } else if (user == null) {
                            continue;
                        } else {
                            M0 = l7c.z(user) ? k96.M0(2131749136, null) : gl.U(qu2.m(0, user.first_name, user.last_name).replace('\n', ' '));
                        }
                        if (spannableStringBuilder.length() > 0) {
                            spannableStringBuilder.append(", ");
                        }
                        int length = spannableStringBuilder.length();
                        int length2 = M0.length() + length;
                        spannableStringBuilder.append((CharSequence) M0);
                        if (dialog.unread_count > 0) {
                            spannableStringBuilder.setSpan(new z3c(gl.o(), bkb.v0(bkb.X8, this.K4)), length, length2, 33);
                        }
                        if (spannableStringBuilder.length() <= 150) {
                            break;
                        }
                    } else {
                        V1 = q1.V1(Long.valueOf(j2));
                    }
                } else {
                    TLRPC.EncryptedChat Y0 = q1.Y0(Integer.valueOf((int) (j & 4294967295L)));
                    V1 = Y0 != null ? q1.V1(Long.valueOf(Y0.user_id)) : null;
                }
                user = V1;
                K0 = null;
                if (K0 == null) {
                }
                if (spannableStringBuilder.length() > 0) {
                }
                int length3 = spannableStringBuilder.length();
                int length22 = M0.length() + length3;
                spannableStringBuilder.append((CharSequence) M0);
                if (dialog.unread_count > 0) {
                }
                if (spannableStringBuilder.length() <= 150) {
                }
            }
        }
        if (na7.q1(i).e0.C(true) > 0) {
            int max = Math.max(1, na7.q1(i).e0.C(true));
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append(", ");
            }
            spannableStringBuilder.append(k96.G(max, "Stories", new Object[0]));
        }
        return vu3.m(spannableStringBuilder, bkb.E0[this.F0 ? 1 : 0].getFontMetricsInt(), false, null, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e3 A[EDGE_INSN: B:26:0x00e3->B:27:0x00e3 BREAK  A[LOOP:0: B:5:0x0023->B:31:0x00df], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00df A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence Q() {
        TLRPC.Chat K0;
        TLRPC.User user;
        TLRPC.User V1;
        String M0;
        na7 q1 = na7.q1(this.G0);
        ArrayList arrayList = (ArrayList) q1.x.f(-this.I0);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i);
            if (!q1.u2(dialog.id)) {
                boolean B = cf3.B(dialog.id);
                long j = dialog.id;
                if (!B) {
                    boolean D = cf3.D(j);
                    long j2 = dialog.id;
                    if (!D) {
                        K0 = q1.K0(Long.valueOf(-j2));
                        user = null;
                        if (K0 == null) {
                            M0 = K0.title.replace('\n', ' ');
                        } else if (user == null) {
                            continue;
                        } else {
                            M0 = l7c.z(user) ? k96.M0(2131749136, null) : gl.U(qu2.m(0, user.first_name, user.last_name).replace('\n', ' '));
                        }
                        if (spannableStringBuilder.length() > 0) {
                            spannableStringBuilder.append(", ");
                        }
                        int length = spannableStringBuilder.length();
                        int length2 = M0.length() + length;
                        spannableStringBuilder.append((CharSequence) M0);
                        if (dialog.unread_count > 0) {
                            spannableStringBuilder.setSpan(new z3c(gl.o(), bkb.v0(bkb.X8, this.K4)), length, length2, 33);
                        }
                        if (spannableStringBuilder.length() <= 150) {
                            break;
                        }
                    } else {
                        V1 = q1.V1(Long.valueOf(j2));
                    }
                } else {
                    TLRPC.EncryptedChat Y0 = q1.Y0(Integer.valueOf((int) (j & 4294967295L)));
                    V1 = Y0 != null ? q1.V1(Long.valueOf(Y0.user_id)) : null;
                }
                user = V1;
                K0 = null;
                if (K0 == null) {
                }
                if (spannableStringBuilder.length() > 0) {
                }
                int length3 = spannableStringBuilder.length();
                int length22 = M0.length() + length3;
                spannableStringBuilder.append((CharSequence) M0);
                if (dialog.unread_count > 0) {
                }
                if (spannableStringBuilder.length() <= 150) {
                }
            }
        }
        return vu3.m(spannableStringBuilder, bkb.E0[this.F0 ? 1 : 0].getFontMetricsInt(), false, null, 0);
    }

    public final CharSequence S() {
        te3 te3Var = this.O4;
        if (te3Var == null) {
            te3Var = new te3(this);
            this.O4 = te3Var;
        }
        te3Var.a(this.G0, this.g1, this.h2);
        this.O4.getClass();
        te3 te3Var2 = this.O4;
        this.N4 = te3Var2.c;
        this.g0 = te3Var2.d;
        return te3Var2.g;
    }

    public final ColorFilter T(int i, int i2) {
        ColorFilter[] colorFilterArr = this.Y4;
        if (colorFilterArr == null) {
            this.Z4 = new int[4];
            colorFilterArr = new ColorFilter[4];
            this.Y4 = colorFilterArr;
        }
        if (i2 != this.Z4[i] || colorFilterArr[i] == null) {
            this.Z4[i] = i2;
            colorFilterArr[i] = new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN);
        }
        return this.Y4[i];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [android.view.View, ue3] */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.text.Spannable, android.text.SpannableString, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.CharSequence] */
    public final SpannableStringBuilder U(int i, CharSequence charSequence, String str, boolean z) {
        CharSequence J2;
        TLRPC.Message message;
        CharSequence charSequence2;
        String G;
        CharSequence charSequence3;
        SpannableStringBuilder valueOf;
        k27 captionMessage = getCaptionMessage();
        k27 k27Var = this.g1;
        CharSequence charSequence4 = k27Var != null ? k27Var.v : null;
        this.f0 = true;
        if (!TextUtils.isEmpty(str)) {
            return R(i, str, charSequence);
        }
        k27 k27Var2 = this.g1;
        TLRPC.Message message2 = k27Var2.k;
        if (message2 instanceof TLRPC.TL_messageService) {
            CharSequence charSequence5 = k27Var2.w;
            if (charSequence5 == null || ((message2.action instanceof TLRPC.TL_messageActionTopicCreate) && this.Q)) {
                charSequence5 = k27Var2.v;
            }
            if (k27.D4(k27Var2)) {
                valueOf = R(i, charSequence5, charSequence);
                if (this.g1.i2[0] instanceof jm4) {
                    int i2 = this.G0;
                    TLRPC.TL_forumTopic f = na7.q1(i2).g4.f(-k27.B0(this.g1.k), k27.b2(i2, this.g1.k, true, false));
                    if (f != null) {
                        ((jm4) this.g1.i2[0]).b(f.icon_color);
                    }
                }
            } else {
                this.f0 = false;
                valueOf = SpannableStringBuilder.valueOf(charSequence5);
            }
            if (z) {
                y(valueOf);
            }
            return valueOf;
        }
        if (captionMessage != null && (charSequence3 = captionMessage.z) != null) {
            String charSequence6 = charSequence3.toString();
            String str2 = !this.W ? "" : k27.K4(captionMessage.k) ? "📹 " : k27.Q4(captionMessage.k) ? "🎤 " : captionMessage.I3() ? "🎧 " : k27.R3(captionMessage.k) ? "🖼 " : "📎 ";
            if (captionMessage.r2() && !TextUtils.isEmpty(captionMessage.k.message)) {
                CharSequence charSequence7 = captionMessage.c2;
                int measuredWidth = getMeasuredWidth() - gl.L(this.J + 47);
                if (this.a0) {
                    if (!TextUtils.isEmpty(charSequence)) {
                        measuredWidth = (int) (measuredWidth - this.b0.measureText(charSequence.toString()));
                    }
                    measuredWidth = (int) (measuredWidth - this.b0.measureText(": "));
                }
                if (measuredWidth > 0 && captionMessage.b2) {
                    charSequence7 = gl.Q(charSequence7, (String) captionMessage.a2.get(0), measuredWidth, this.b0);
                }
                return new SpannableStringBuilder(str2).append(charSequence7);
            }
            int length = charSequence6.length();
            CharSequence charSequence8 = charSequence6;
            if (length > 150) {
                charSequence8 = charSequence6.subSequence(0, kk7.f2);
            }
            SpannableString spannableString = new SpannableString(charSequence8);
            captionMessage.T5();
            hq6.h(captionMessage.k.entities, charSequence8, spannableString, kk7.m4);
            TLRPC.Message message3 = captionMessage.k;
            if (message3 != null) {
                ArrayList<TLRPC.MessageEntity> arrayList = message3.entities;
                TextPaint textPaint = this.b0;
                hq6.a(textPaint != null ? textPaint.getFontMetricsInt() : null, spannableString, arrayList);
            }
            CharSequence append = new SpannableStringBuilder(str2).append(gl.J2(spannableString));
            if (z) {
                append = y(append);
            }
            return R(i, append, charSequence);
        }
        TL_iv.RichMessage richMessage = message2.rich_message;
        wjb wjbVar = this.K4;
        if (richMessage != null) {
            boolean O2 = richMessage.blocks.size() == 1 ? k27.O2(this.g1.k.rich_message.blocks.get(0)) : false;
            SpannableStringBuilder R = R(i, this.g1.v, charSequence);
            if (O2 && !Z()) {
                try {
                    R.setSpan(new cm4(bkb.o9, wjbVar), this.a0 ? charSequence.length() + 2 : 0, R.length(), 33);
                    return R;
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            }
            return R;
        }
        if (message2.media == null || k27Var2.F3()) {
            k27 k27Var3 = this.g1;
            String str3 = k27Var3.k.message;
            if (str3 == null) {
                return new SpannableStringBuilder();
            }
            if (k27Var3.r2()) {
                CharSequence charSequence9 = this.g1.c2;
                J2 = str3;
                if (charSequence9 != null) {
                    J2 = charSequence9;
                }
                int measuredWidth2 = getMeasuredWidth() - gl.L(this.J + 33);
                if (this.a0) {
                    if (!TextUtils.isEmpty(charSequence)) {
                        measuredWidth2 = (int) (measuredWidth2 - this.b0.measureText(charSequence.toString()));
                    }
                    measuredWidth2 = (int) (measuredWidth2 - this.b0.measureText(": "));
                }
                if (measuredWidth2 > 0) {
                    J2 = gl.Q(J2, (String) this.g1.a2.get(0), measuredWidth2, this.b0);
                }
            } else {
                int length2 = str3.length();
                CharSequence charSequence10 = str3;
                if (length2 > 150) {
                    charSequence10 = str3.subSequence(0, kk7.f2);
                }
                J2 = gl.J2(charSequence10);
            }
            ?? spannableString2 = new SpannableString(J2);
            k27 k27Var4 = this.g1;
            if (k27Var4 != null) {
                k27Var4.T5();
            }
            k27 k27Var5 = this.g1;
            Pattern pattern = hq6.U1;
            hq6.h(k27Var5.k.entities, k27Var5.v, spannableString2, kk7.m4);
            k27 k27Var6 = this.g1;
            if (k27Var6 != null && (message = k27Var6.k) != null) {
                ArrayList<TLRPC.MessageEntity> arrayList2 = message.entities;
                TextPaint textPaint2 = this.b0;
                hq6.a(textPaint2 != null ? textPaint2.getFontMetricsInt() : null, spannableString2, arrayList2);
            }
            if (z) {
                spannableString2 = y(spannableString2);
            }
            return R(i, spannableString2, charSequence);
        }
        this.b0 = bkb.G0[this.F0 ? 1 : 0];
        int i3 = bkb.n9;
        k27 k27Var7 = this.g1;
        TLRPC.MessageMedia messageMedia = k27Var7.k.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
            TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageMediaPoll.poll.question;
            if (tL_textWithEntities == null || tL_textWithEntities.entities == null) {
                charSequence2 = bf3.a(R.drawable.dialog_media_poll_20, tL_textWithEntities.text, true);
            } else {
                SpannableString spannableString3 = new SpannableString(tL_messageMediaPoll.poll.question.text.replace('\n', ' '));
                TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_messageMediaPoll.poll.question;
                hq6.h(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableString3, -1);
                hq6.a(bkb.E0[this.F0 ? 1 : 0].getFontMetricsInt(), spannableString3, tL_messageMediaPoll.poll.question.entities);
                charSequence2 = bf3.a(R.drawable.dialog_media_poll_20, spannableString3, true);
            }
        } else if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
            TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_messageMediaToDo.todo.title;
            if (tL_textWithEntities3 == null || tL_textWithEntities3.entities == null) {
                charSequence2 = bf3.a(R.drawable.dialog_media_checklist_20, tL_textWithEntities3.text, true);
            } else {
                SpannableString spannableString4 = new SpannableString(tL_messageMediaToDo.todo.title.text.replace('\n', ' '));
                TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_messageMediaToDo.todo.title;
                hq6.h(tL_textWithEntities4.entities, tL_textWithEntities4.text, spannableString4, -1);
                hq6.a(bkb.E0[this.F0 ? 1 : 0].getFontMetricsInt(), spannableString4, tL_messageMediaToDo.todo.title.entities);
                charSequence2 = bf3.a(R.drawable.dialog_media_checklist_20, spannableString4, true);
            }
        } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
            charSequence2 = bf3.a(R.drawable.dialog_media_game_20, messageMedia.game.title, true);
        } else if (messageMedia instanceof TLRPC.TL_messageMediaInvoice) {
            charSequence2 = messageMedia.title;
        } else if (k27Var7.D == 14) {
            charSequence2 = b00.i("🎧 \u2068", k27Var7.w1(true), " - ", this.g1.y1(true), "\u2069");
        } else if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
            int size = ((TLRPC.TL_messageMediaPaidMedia) messageMedia).extended_media.size();
            charSequence2 = jva.S0(k96.a0(null, null, 2131753946, this.T1 ? size > 1 ? k96.G(size, "Media", new Object[0]) : k96.M0(2131753930, null) : size > 1 ? k96.G(size, "Photos", new Object[0]) : k96.M0(2131753945, null)));
            i3 = bkb.o9;
        } else if (this.S1 > 1) {
            boolean z2 = this.T1;
            ArrayList arrayList3 = this.h1;
            if (z2) {
                G = k96.G(arrayList3 == null ? 0 : arrayList3.size(), "Media", new Object[0]);
            } else {
                G = k96.G(arrayList3 == null ? 0 : arrayList3.size(), "Photos", new Object[0]);
            }
            charSequence2 = G;
            i3 = bkb.o9;
        } else {
            charSequence2 = charSequence4.toString();
            i3 = bkb.o9;
        }
        if (charSequence2 instanceof String) {
            charSequence2 = ((String) charSequence2).replace('\n', ' ');
        }
        if (z) {
            charSequence2 = y(charSequence2);
        }
        SpannableStringBuilder R2 = R(i, charSequence2, charSequence);
        if (!Z()) {
            try {
                R2.setSpan(new cm4(i3, wjbVar), this.a0 ? charSequence.length() + 2 : 0, R2.length(), 33);
                return R2;
            } catch (Exception e2) {
                fa4.g(e2, true);
            }
        }
        return R2;
    }

    public final boolean V() {
        wtc wtcVar = this.u0;
        return (wtcVar == null || ((ArrayList) wtcVar.c).isEmpty()) ? false : true;
    }

    public final boolean W() {
        if (hc2.Y(this.h2)) {
            return !this.f1;
        }
        if (this.Q) {
            return this.b1;
        }
        TLRPC.Chat chat = this.h2;
        return (chat != null && chat.forum && this.O == null) ? !this.e1 : this.a1;
    }

    public final boolean X() {
        return this.K0 > 0;
    }

    public final boolean Y() {
        return this.K0 != 0;
    }

    public boolean Z() {
        TLRPC.Chat chat;
        if (X() || this.Q0 || (chat = this.h2) == null) {
            return false;
        }
        if (!chat.forum) {
            if (!hc2.p0(chat)) {
                return false;
            }
            if (!hc2.A(this.G0, this.h2, 24)) {
                return false;
            }
        }
        return !this.Q;
    }

    public final boolean a0() {
        TLRPC.User user;
        if (Z() || this.v0.w || (user = this.g2) == null || user.self) {
            return false;
        }
        TLRPC.UserStatus userStatus = user.status;
        int i = this.G0;
        if (userStatus != null && userStatus.expires <= 0 && na7.q1(i).a0.containsKey(Long.valueOf(this.g2.id))) {
            return true;
        }
        TLRPC.UserStatus userStatus2 = this.g2.status;
        return userStatus2 != null && userStatus2.expires > ConnectionsManager.getInstance(i).getCurrentTime();
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.X8));
        hashSet.add(Integer.valueOf(bkb.h9));
        hashSet.add(Integer.valueOf(bkb.f9));
        hashSet.add(Integer.valueOf(bkb.n9));
        hashSet.add(Integer.valueOf(bkb.W8));
        hashSet.add(Integer.valueOf(bkb.i9));
        hashSet.add(Integer.valueOf(bkb.o9));
        hashSet.add(Integer.valueOf(bkb.j9));
        hashSet.add(Integer.valueOf(bkb.x6));
        hashSet.add(Integer.valueOf(bkb.c6));
        hashSet.add(Integer.valueOf(bkb.j7));
        hashSet.add(Integer.valueOf(bkb.c9));
        hashSet.add(Integer.valueOf(bkb.b9));
        hashSet.add(Integer.valueOf(bkb.X5));
        hashSet.add(Integer.valueOf(bkb.r9));
        hashSet.add(Integer.valueOf(bkb.Y8));
        hashSet.add(Integer.valueOf(bkb.m9));
        hashSet.add(Integer.valueOf(bkb.l9));
        hashSet.add(Integer.valueOf(bkb.k9));
        hashSet.add(Integer.valueOf(bkb.g9));
        hashSet.add(Integer.valueOf(bkb.y9));
        hashSet.add(Integer.valueOf(bkb.Ei));
        hashSet.add(Integer.valueOf(bkb.Ii));
        hashSet.add(Integer.valueOf(bkb.U8));
        hashSet.add(Integer.valueOf(bkb.T8));
        hashSet.add(Integer.valueOf(bkb.Bk));
        hashSet.add(Integer.valueOf(bkb.Ck));
        hashSet.add(Integer.valueOf(bkb.S8));
        hashSet.add(Integer.valueOf(bkb.Uk));
        hashSet.add(Integer.valueOf(bkb.Tk));
        hashSet.add(Integer.valueOf(bkb.V8));
    }

    public final boolean b0(float f) {
        return !k96.a0 ? f >= 0.0f && f < ((float) gl.L(60.0f)) : f >= ((float) (getMeasuredWidth() - gl.L(60.0f))) && f < ((float) getMeasuredWidth());
    }

    public final void c0(boolean z, boolean z2) {
        if ((!getIsPinned() && z) || this.z3 == z) {
            if (getIsPinned()) {
                return;
            }
            this.z3 = false;
        } else {
            this.z3 = z;
            if (z2) {
                this.y3 = z ? 0.0f : 1.0f;
            } else {
                this.y3 = z ? 1.0f : 0.0f;
            }
            invalidate();
        }
    }

    public final void d0() {
        boolean z = gba.m1;
        this.n1 = z;
        float f = z ? 0.0f : 1.0f;
        this.E1 = f;
        this.b2.o = f;
        this.u1 = 0.0f;
        this.y1 = false;
        this.y3 = (getIsPinned() && this.z3) ? 1.0f : 0.0f;
        this.x3 = true;
        this.p1 = 0.0f;
        setTranslationX(0.0f);
        setTranslationY(0.0f);
        tl tlVar = this.o4;
        if (tlVar != null && this.x3) {
            tlVar.a();
        }
        tl tlVar2 = this.p4;
        if (tlVar2 == null || !this.x3) {
            return;
        }
        tlVar2.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if ((!this.Q && !this.G && motionEvent.getAction() == 1) || motionEvent.getAction() == 3) {
            this.v0.a(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e0(boolean z, boolean z2) {
        if (this.r2 == null) {
            if (!z) {
                return;
            }
            ya yaVar = new ya(this, getContext(), this.K4, (byte) 1);
            this.r2 = yaVar;
            yaVar.b(-1, bkb.c6, bkb.j7);
            this.r2.setDrawUnchecked(false);
            this.r2.setDrawBackgroundAsArc(3);
            addView(this.r2);
        }
        this.r2.a(z, z2);
        H();
    }

    public final void f0(long j, k27 k27Var, int i, boolean z, boolean z2) {
        if (this.I0 != j) {
            this.y4 = -1;
        }
        this.I0 = j;
        this.C4 = System.currentTimeMillis();
        this.g1 = k27Var;
        this.v2 = z;
        this.O0 = false;
        this.S0 = i;
        if (k27Var != null) {
            int i2 = k27Var.k.edit_date;
        }
        this.T0 = 0;
        this.U0 = false;
        this.m1 = k27Var != null ? k27Var.e1() : 0;
        this.V0 = 0;
        this.W0 = 0;
        this.X0 = 0;
        this.Y0 = k27Var != null && k27Var.E4();
        k27 k27Var2 = this.g1;
        if (k27Var2 != null) {
            this.Z0 = k27Var2.k.send_state;
        }
        k0(0, z2);
    }

    public final void g0(TLRPC.Dialog dialog, int i, int i2) {
        if (this.I0 != dialog.id) {
            ValueAnimator valueAnimator = this.B4;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.B4.cancel();
            }
            this.A4 = false;
            this.y4 = -1;
        }
        this.I0 = dialog.id;
        this.C4 = System.currentTimeMillis();
        this.O0 = true;
        if (dialog instanceof TLRPC.TL_dialogCommunity) {
            this.L0 = dialog.community_id;
        } else {
            this.L0 = 0L;
        }
        if (dialog instanceof TLRPC.TL_dialogFolder) {
            this.K0 = ((TLRPC.TL_dialogFolder) dialog).folder.id;
            vu8 vu8Var = this.f2;
            if (vu8Var != null) {
                vu8Var.H = this;
                vu8Var.h();
            }
        } else {
            this.K0 = 0;
        }
        this.k1 = i;
        boolean z = i == 3;
        Runnable runnable = this.a5;
        if (z != (runnable != null)) {
            if (z) {
                this.a5 = kk7.f(this.G0).h(this, kk7.j3, new dyc(this, (byte) 1));
            } else if (runnable != null) {
                runnable.run();
                this.a5 = null;
            }
        }
        if (this.u0 == null) {
            wtc wtcVar = new wtc();
            wtcVar.b = new ArrayList();
            wtcVar.c = new ArrayList();
            wtcVar.d = null;
            wtcVar.a = this;
            this.u0 = wtcVar;
        }
        this.l1 = i2;
        this.m1 = 0;
        if (k0(0, false)) {
            requestLayout();
        }
        G();
        D();
        A();
        H();
    }

    public float getClipProgress() {
        return this.u1;
    }

    public int getCurrentDialogFolderId() {
        return this.K0;
    }

    public long getDialogId() {
        return this.I0;
    }

    public boolean getHasUnread() {
        return this.T0 != 0 || this.U0;
    }

    public boolean getIsMuted() {
        return this.a1;
    }

    public boolean getIsPinned() {
        return this.B3 || this.C3;
    }

    public k27 getMessage() {
        return this.g1;
    }

    public int getMessageId() {
        return this.m1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (r2 != r9) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getMessageNameString() {
        TLRPC.Chat K0;
        TLRPC.User user;
        String str;
        TLRPC.Message message;
        TLRPC.MessageFwdHeader messageFwdHeader;
        String str2;
        k27 k27Var;
        TLRPC.Message message2;
        TLRPC.User V1;
        k27 k27Var2;
        TLRPC.Message message3;
        TLRPC.MessageFwdHeader messageFwdHeader2;
        TLRPC.Message message4;
        TLRPC.MessageFwdHeader messageFwdHeader3;
        TLRPC.MessageFwdHeader messageFwdHeader4;
        k27 k27Var3 = this.g1;
        if (k27Var3 != null) {
            long Z0 = k27Var3.Z0();
            int i = this.G0;
            long e = y6c.h(i).e();
            if (!this.s0 && this.I0 == e) {
                long P1 = this.g1.P1();
                if (P1 != e) {
                    if (P1 != 2666000) {
                        TLRPC.Message message5 = this.g1.k;
                        if (message5 != null && (messageFwdHeader4 = message5.fwd_from) != null) {
                            long n = cf3.n(messageFwdHeader4.saved_from_id);
                            if (n == 0) {
                                n = cf3.n(this.g1.k.fwd_from.from_id);
                            }
                            if (n > 0) {
                            }
                        }
                        Z0 = P1;
                    }
                }
            }
            if (this.s0 && (message4 = this.g1.k) != null && (messageFwdHeader3 = message4.fwd_from) != null) {
                Z0 = cf3.n(messageFwdHeader3.saved_from_id);
                if (Z0 == 0) {
                    Z0 = cf3.n(this.g1.k.fwd_from.from_id);
                }
            }
            if (cf3.D(Z0)) {
                user = na7.q1(i).V1(Long.valueOf(Z0));
                K0 = null;
            } else {
                K0 = na7.q1(i).K0(Long.valueOf(-Z0));
                user = null;
            }
            long j = this.I0;
            if (j != e) {
                if (j == 489000 && (k27Var2 = this.g1) != null && (message3 = k27Var2.k) != null && (messageFwdHeader2 = message3.fwd_from) != null) {
                    String str3 = messageFwdHeader2.from_name;
                    if (str3 != null) {
                        return gl.U(str3);
                    }
                    long n2 = cf3.n(messageFwdHeader2.from_id);
                    if (cf3.D(n2)) {
                        return l7c.r(na7.q1(i).V1(Long.valueOf(n2)));
                    }
                    TLRPC.Chat K02 = na7.q1(i).K0(Long.valueOf(-n2));
                    return K02 == null ? "" : K02.title;
                }
                if (this.g1.O3() && user != null) {
                    return k96.M0(2131750487, null);
                }
                if (!this.s0 && (k27Var = this.g1) != null && (message2 = k27Var.k) != null && (message2.from_id instanceof TLRPC.TL_peerUser) && (V1 = na7.q1(i).V1(Long.valueOf(this.g1.k.from_id.user_id))) != null) {
                    return gl.U(l7c.k(V1, true).replace("\n", ""));
                }
                k27 k27Var4 = this.g1;
                return (k27Var4 == null || (message = k27Var4.k) == null || (messageFwdHeader = message.fwd_from) == null || (str2 = messageFwdHeader.from_name) == null) ? user != null ? (this.s2 || gba.l1) ? l7c.z(user) ? k96.M0(2131749136, null) : gl.U(qu2.m(0, user.first_name, user.last_name).replace("\n", "")) : gl.U(l7c.k(user, true).replace("\n", "")) : (K0 == null || (str = K0.title) == null) ? "DELETED" : gl.U(str.replace("\n", "")) : gl.U(str2);
            }
            if (user != null) {
                return gl.U(l7c.k(user, true).replace("\n", ""));
            }
            if (K0 != null) {
                return gl.U(K0.title.replace("\n", ""));
            }
        }
        return null;
    }

    public long getStarsPrice() {
        return this.q2;
    }

    @Override // android.view.View
    public float getTranslationX() {
        return this.x1;
    }

    public final void h0(TLRPC.TL_forumTopic tL_forumTopic, long j, k27 k27Var, boolean z, boolean z2) {
        vu8 vu8Var;
        this.O = tL_forumTopic;
        this.Q = tL_forumTopic != null;
        if (this.I0 != j) {
            this.y4 = -1;
        }
        Drawable drawable = k27Var.i2[0];
        if (drawable instanceof jm4) {
            ((jm4) drawable).b(tL_forumTopic.icon_color);
        }
        this.I0 = j;
        this.C4 = System.currentTimeMillis();
        this.g1 = k27Var;
        this.O0 = false;
        this.h0 = z;
        this.S0 = k27Var.k.date;
        this.U0 = false;
        this.m1 = k27Var.e1();
        this.Y0 = k27Var.E4();
        k27 k27Var2 = this.g1;
        if (k27Var2 != null) {
            this.Z0 = k27Var2.k.send_state;
        }
        if (!z2) {
            this.y4 = -1;
        }
        if (tL_forumTopic != null) {
            this.h1 = tL_forumTopic.groupedMessages;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.O;
        if (tL_forumTopic2 != null && tL_forumTopic2.id == 1 && (vu8Var = this.f2) != null) {
            vu8Var.H = this;
            vu8Var.h();
        }
        k0(0, z2);
    }

    public final void i0(int i, k27 k27Var) {
        TLRPC.MessageMedia messageMedia;
        ArrayList<TLRPC.PhotoSize> arrayList = k27Var.p0;
        TLObject tLObject = k27Var.n0;
        if (k27Var.x4()) {
            TL_stories.StoryItem storyItem = k27Var.k.media.storyItem;
            if (storyItem == null || (messageMedia = storyItem.media) == null) {
                return;
            }
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                arrayList = document.thumbs;
                tLObject = document;
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    arrayList = photo.sizes;
                    tLObject = photo;
                }
            }
        }
        TLRPC.PhotoSize Q = ba4.Q(arrayList);
        if (Q == null) {
            Q = ba4.w(arrayList, 40, false, null, false);
        }
        TLRPC.PhotoSize w = ba4.w(arrayList, gl.Y0(false), false, null, true);
        TLRPC.PhotoSize photoSize = Q != w ? w : null;
        if (photoSize == null || !up3.q(this.G0).d(k27Var)) {
            photoSize = Q;
        }
        if (Q != null) {
            this.T1 = this.T1 || k27.K4(k27Var.k) || k27Var.g4();
            int i2 = this.S1;
            if (i2 < 3) {
                this.S1 = i2 + 1;
                this.X1[i] = (k27.K4(k27Var.k) || k27Var.g4()) && !k27Var.t2();
                this.Y1[i] = k27Var.t2();
                int i3 = (k27Var.D != 1 || photoSize == null) ? 0 : photoSize.size;
                String str = k27Var.t2() ? "5_5_b" : "20_20";
                ImageReceiver[] imageReceiverArr = this.W1;
                imageReceiverArr[i].Z(gl5.f(photoSize, tLObject), str, gl5.f(Q, tLObject), str, null, i3, null, k27Var, 0);
                imageReceiverArr[i].q0(gl.L(k27Var.g4() ? 18.0f : 2.0f));
                this.W = false;
            }
        }
    }

    @Override // hf0, android.view.View, mib
    public final void invalidate() {
        if (m8b.x1) {
            return;
        }
        super.invalidate();
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        if (drawable == this.z1 || drawable == bkb.t1) {
            invalidate(drawable.getBounds());
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public final void j0() {
        vu8 vu8Var = this.f2;
        if (vu8Var != null) {
            if (this.Q) {
                vu8Var.K = gl.L(24.0f);
                this.f2.L = gl.L(24.0f);
                this.f2.M = 0.0f;
            } else {
                me3 me3Var = this.v0;
                RectF rectF = me3Var.F;
                RectF rectF2 = me3Var.F;
                vu8Var.K = rectF.centerY();
                this.f2.L = rectF2.centerX();
                this.f2.M = rectF2.width() / 2.0f;
                if (!na7.q1(this.G0).M1().h.isEmpty()) {
                    this.f2.M -= gl.N(3.5f);
                }
                vu8 vu8Var2 = this.f2;
                this.Z1.q();
                vu8Var2.getClass();
            }
            vu8 vu8Var3 = this.f2;
            if (vu8Var3.E || vu8Var3.I == null) {
                return;
            }
            AnimatorSet animatorSet = vu8Var3.B;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                vu8Var3.B.cancel();
            }
            vu8Var3.E = true;
            vu8Var3.F = true;
            vu8Var3.D = 0.0f;
            vu8Var3.I.getTranslationY();
            Typeface typeface = gl.a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new uu8(vu8Var3, (byte) 5));
            ofFloat.setInterpolator(s33.h);
            ofFloat.setDuration(250L);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new uu8(vu8Var3, (byte) 6));
            s33 s33Var = s33.j;
            ofFloat2.setInterpolator(s33Var);
            ofFloat2.setDuration(150L);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat3.addUpdateListener(new uu8(vu8Var3, (byte) 7));
            ofFloat3.setInterpolator(s33Var);
            ofFloat3.setDuration(135L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            vu8Var3.B = animatorSet2;
            animatorSet2.addListener(new l48(vu8Var3, (byte) 25));
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playSequentially(ofFloat2, ofFloat3);
            animatorSet3.setStartDelay(180L);
            vu8Var3.B.playTogether(ofFloat, animatorSet3);
            vu8Var3.B.start();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:252:0x0526, code lost:
    
        if (hc2.A(r6, r5, 24) != false) goto L276;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x07a3  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0854  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x096d  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0aa4  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0aa6  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0ab2  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0abe  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0b2a  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0b2c  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0ac0  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x0ab4  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0872  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0747  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:634:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:642:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b7  */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k0(int i, boolean z) {
        boolean z2;
        int i2;
        pb0 pb0Var;
        int i3;
        boolean z3;
        boolean z4;
        int i4;
        ImageReceiver imageReceiver;
        boolean z5;
        boolean z6;
        boolean z7;
        int i5;
        boolean z8;
        int i6;
        long j;
        ImageReceiver imageReceiver2;
        int i7;
        k27 k27Var;
        float f;
        boolean z9;
        int L;
        TLRPC.User user;
        TLRPC.Chat chat;
        int i8;
        ValueAnimator valueAnimator;
        int i9;
        String str;
        TLRPC.Chat K0;
        k27 k27Var2;
        ArrayList m3;
        k27 k27Var3;
        boolean z10;
        k27 k27Var4;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        HashMap hashMap;
        k27 k27Var5;
        boolean z11;
        long j2;
        boolean z12;
        int i16;
        t97 t97Var;
        int i17;
        t97 t97Var2;
        ve3 ve3Var;
        t97 t97Var3;
        String str2;
        k27 k27Var6;
        int i18;
        k27 k27Var7;
        ImageReceiver imageReceiver3;
        boolean Z = Z();
        boolean z13 = false;
        this.m0 = 0;
        pe3 pe3Var = this.H0;
        ImageReceiver imageReceiver4 = this.Z1;
        pb0 pb0Var2 = this.b2;
        int i19 = this.G0;
        if (pe3Var != null) {
            this.S0 = pe3Var.h;
            byte b = pe3Var.d;
            this.Y0 = b != 0;
            this.T0 = b;
            this.B3 = pe3Var.e;
            this.a1 = pe3Var.f;
            this.e1 = false;
            this.f1 = false;
            pb0Var2.j(pe3Var.c, pe3Var.a, null, null);
            if (this.G) {
                imageReceiver3 = imageReceiver4;
                imageReceiver3.e0(null, "50_50", this.H, null, 0L);
            } else {
                imageReceiver3 = imageReceiver4;
                imageReceiver3.e0(null, "50_50", pb0Var2, null, 0L);
            }
            int i20 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = this.W1;
                if (i20 >= imageReceiverArr.length) {
                    break;
                }
                imageReceiverArr[i20].g0(null);
                i20++;
            }
            this.E = false;
            this.F = false;
            imageReceiver3.q0(gl.L(26.0f));
            this.c1 = false;
            i5 = i19;
            z3 = Z;
            z7 = false;
            z8 = false;
            f = 0.0f;
        } else {
            ImageReceiver imageReceiver5 = imageReceiver4;
            int i21 = this.T0;
            boolean z14 = this.W0 != 0;
            boolean z15 = this.U0;
            this.e1 = false;
            this.f1 = false;
            this.I4 = -1;
            boolean z16 = this.O0;
            int[] iArr = pub.w;
            if (z16) {
                boolean z17 = true;
                pb0Var = pb0Var2;
                i3 = 2;
                TLRPC.Dialog dialog = (TLRPC.Dialog) na7.q1(i19).R.f(this.I0);
                if (dialog != null) {
                    this.I4 = dialog.read_outbox_max_id;
                    this.m0 = dialog.ttl_period;
                    if (i == 0) {
                        this.i1 = na7.q1(i19).v0.f(dialog.id) != null;
                        ArrayList arrayList = (ArrayList) na7.q1(i19).S.f(dialog.id);
                        this.h1 = arrayList;
                        k27 k27Var8 = (arrayList == null || arrayList.size() <= 0) ? null : (k27) this.h1.get(0);
                        this.g1 = k27Var8;
                        this.Y0 = k27Var8 != null && k27Var8.E4();
                        TLRPC.Chat K02 = na7.q1(i19).K0(Long.valueOf(-dialog.id));
                        if (K02 == null || !(K02.forum || (K02.monoforum && hc2.A(i19, K02, 24)))) {
                            i2 = i19;
                            if (dialog instanceof TLRPC.TL_dialogFolder) {
                                this.T0 = ad7.Y(i2).M;
                                this.V0 = 0;
                                this.W0 = 0;
                                this.X0 = 0;
                            } else {
                                if (dialog instanceof TLRPC.TL_dialogCommunity) {
                                    imageReceiver5 = imageReceiver5;
                                    c86 O0 = na7.q1(i2).O0(-dialog.id);
                                    this.T0 = O0.a;
                                    this.V0 = O0.b;
                                    this.W0 = O0.c;
                                    this.X0 = O0.d;
                                    this.f1 = O0.e;
                                } else {
                                    imageReceiver5 = imageReceiver5;
                                    this.T0 = dialog.unread_count;
                                    this.V0 = dialog.unread_mentions_count;
                                    this.W0 = dialog.unread_reactions_count;
                                    this.X0 = dialog.unread_poll_votes_count;
                                }
                                if (hc2.p0(K02)) {
                                    this.V0 = 0;
                                }
                                this.U0 = dialog.unread_mark;
                                k27Var6 = this.g1;
                                if (k27Var6 != null) {
                                    int i22 = k27Var6.k.edit_date;
                                }
                                this.S0 = dialog.last_message_date;
                                i18 = this.k1;
                                if (i18 != 7 || i18 == 8) {
                                    t97 t97Var4 = na7.q1(i2).N[this.k1 != 8 ? (char) 1 : (char) 0];
                                    this.B3 = t97Var4 == null && t97Var4.j.indexOfKey(dialog.id) >= 0;
                                } else {
                                    this.B3 = this.K0 == 0 && dialog.pinned;
                                }
                                k27Var7 = this.g1;
                                if (k27Var7 != null) {
                                    this.Z0 = k27Var7.k.send_state;
                                }
                            }
                        } else {
                            i2 = i19;
                            na7.q1(i19).g4.h(K02.id);
                            this.T0 = iArr[0];
                            this.V0 = iArr[1];
                            this.W0 = iArr[2];
                            this.e1 = iArr[3] != 0;
                            this.X0 = iArr[4];
                        }
                        imageReceiver5 = imageReceiver5;
                        if (hc2.p0(K02)) {
                        }
                        this.U0 = dialog.unread_mark;
                        k27Var6 = this.g1;
                        if (k27Var6 != null) {
                        }
                        this.S0 = dialog.last_message_date;
                        i18 = this.k1;
                        if (i18 != 7) {
                        }
                        t97 t97Var42 = na7.q1(i2).N[this.k1 != 8 ? (char) 1 : (char) 0];
                        this.B3 = t97Var42 == null && t97Var42.j.indexOfKey(dialog.id) >= 0;
                        k27Var7 = this.g1;
                        if (k27Var7 != null) {
                        }
                    } else {
                        i2 = i19;
                    }
                } else {
                    i2 = i19;
                    this.T0 = 0;
                    this.V0 = 0;
                    this.W0 = 0;
                    this.X0 = 0;
                    this.S0 = 0;
                    this.i1 = false;
                }
                z2 = z17;
                if (this.I0 != 0) {
                    int i23 = dj9.S;
                    z2 = z17;
                }
            } else {
                z2 = 1;
                i2 = i19;
                pb0Var = pb0Var2;
                i3 = 2;
                this.B3 = false;
            }
            TLRPC.TL_forumTopic tL_forumTopic = this.O;
            if (tL_forumTopic != null) {
                this.T0 = tL_forumTopic.unread_count;
                this.V0 = tL_forumTopic.unread_mentions_count;
                this.W0 = tL_forumTopic.unread_reactions_count;
                this.X0 = tL_forumTopic.unread_poll_votes_count;
            }
            if (this.k1 == i3) {
                this.B3 = false;
            }
            wtc wtcVar = this.u0;
            if (wtcVar != null) {
                boolean isEmpty = ((ArrayList) wtcVar.c).isEmpty();
                wtc wtcVar2 = this.u0;
                int i24 = this.k1;
                i4 = i21;
                long j3 = this.I0;
                ue3 ue3Var = (ue3) wtcVar2.a;
                ArrayList arrayList2 = (ArrayList) wtcVar2.b;
                ArrayList arrayList3 = (ArrayList) wtcVar2.c;
                z4 = false;
                j5 a = j5.a(i2);
                na7 q1 = na7.q1(i2);
                imageReceiver = imageReceiver5;
                t97[] t97VarArr = q1.N;
                if (q1.l4 && y6c.h(a.a).p()) {
                    ArrayList arrayList4 = q1.G0;
                    if (i24 == 7) {
                        t97Var = t97VarArr[0];
                        i16 = 8;
                    } else {
                        i16 = 8;
                        t97Var = i24 == 8 ? t97VarArr[z2] : null;
                    }
                    arrayList2.clear();
                    z3 = Z;
                    if (i24 == 0 || i24 == 7 || i24 == i16) {
                        int i25 = 0;
                        while (i25 < arrayList4.size()) {
                            t97 t97Var5 = (t97) arrayList4.get(i25);
                            if (t97Var5 != null) {
                                t97Var2 = t97Var;
                                i17 = i25;
                                if (t97Var5 != t97Var2 && t97Var5.m >= 0 && t97Var5.a(a, j3)) {
                                    arrayList2.add(t97Var5);
                                }
                            } else {
                                i17 = i25;
                                t97Var2 = t97Var;
                            }
                            i25 = i17 + 1;
                            t97Var = t97Var2;
                        }
                    }
                    int i26 = 0;
                    z12 = false;
                    while (i26 < arrayList3.size()) {
                        ve3 ve3Var2 = (ve3) arrayList3.get(i26);
                        int i27 = 0;
                        while (true) {
                            if (i27 >= arrayList2.size()) {
                                t97Var3 = null;
                                break;
                            }
                            if (((t97) arrayList2.get(i27)).a == ve3Var2.a) {
                                t97Var3 = (t97) arrayList2.get(i27);
                                break;
                            }
                            i27++;
                        }
                        if (t97Var3 == null) {
                            arrayList3.remove(i26);
                            i26--;
                        } else {
                            if (t97Var3.m != ve3Var2.b || ((str2 = t97Var3.b) != null && ve3Var2.c != null && str2.length() != ve3Var2.c.i().length())) {
                                arrayList3.set(i26, ve3.b(ue3Var, t97Var3));
                            }
                            i26++;
                        }
                        z12 = z2;
                        i26++;
                    }
                    for (int i28 = 0; i28 < arrayList2.size(); i28++) {
                        t97 t97Var6 = (t97) arrayList2.get(i28);
                        int i29 = 0;
                        while (true) {
                            if (i29 >= arrayList3.size()) {
                                ve3Var = null;
                                break;
                            }
                            if (((ve3) arrayList3.get(i29)).a == t97Var6.a) {
                                ve3Var = (ve3) arrayList3.get(i29);
                                break;
                            }
                            i29++;
                        }
                        if (ve3Var == null) {
                            arrayList3.add(i28, ve3.b(ue3Var, t97Var6));
                            z12 = z2;
                        }
                    }
                    arrayList2.clear();
                } else {
                    z3 = Z;
                    boolean isEmpty2 = arrayList3.isEmpty();
                    arrayList3.clear();
                    z12 = !isEmpty2;
                }
                if (z12) {
                    z5 = isEmpty != ((ArrayList) this.u0.c).isEmpty() ? z2 : false;
                    z7 = z5;
                    z6 = z2;
                    if (i == 0) {
                        TLRPC.User user2 = this.g2;
                        if (user2 != null && !na7.E2(user2) && !this.g2.bot && (i & 4) != 0) {
                            this.g2 = na7.q1(i2).V1(Long.valueOf(this.g2.id));
                            if (this.C0 != a0()) {
                                z6 = z2;
                            }
                        }
                        int i30 = na7.q5;
                        if ((524288 & i) != 0) {
                            TLRPC.User user3 = this.g2;
                            tl tlVar = this.o4;
                            if (user3 != null) {
                                TLRPC.User V1 = na7.q1(i2).V1(Long.valueOf(this.g2.id));
                                this.g2 = V1;
                                if (V1 == null || cf3.f(V1.emoji_status) == 0) {
                                    this.E2 = true;
                                    tlVar.g(nh8.d().e, z);
                                    tlVar.m(z4, z);
                                } else {
                                    this.E2 = z2;
                                    tlVar.j(cf3.f(this.g2.emoji_status), z);
                                    tlVar.m(cf3.A(this.g2.emoji_status), z);
                                }
                                j2 = cf3.c(this.g2);
                                z11 = true;
                            } else {
                                z11 = z6;
                                j2 = 0;
                            }
                            if (this.h2 != null) {
                                TLRPC.Chat K03 = na7.q1(i2).K0(Long.valueOf(this.h2.id));
                                this.h2 = K03;
                                if (K03 == null || cf3.f(K03.emoji_status) == 0) {
                                    this.E2 = true;
                                    tlVar.g(nh8.d().e, z);
                                    tlVar.m(false, z);
                                } else {
                                    this.E2 = true;
                                    tlVar.j(cf3.f(this.h2.emoji_status), z);
                                    tlVar.m(cf3.A(this.h2.emoji_status), z);
                                }
                                j2 = cf3.c(this.h2);
                                z11 = true;
                            }
                            z10 = this.l4;
                            tl tlVar2 = this.p4;
                            if (j2 != 0) {
                                z10 = !z10;
                                tlVar2.j(j2, z);
                            } else {
                                tlVar2.g(null, z);
                            }
                            z6 = z11;
                        } else {
                            z10 = false;
                        }
                        if ((this.O0 || this.Q) && (i & 64) != 0) {
                            CharSequence A1 = na7.q1(i2).A1(this.I0, getTopicId(), true);
                            CharSequence charSequence = this.j2;
                            if (charSequence == null ? A1 != null : !(A1 != null && charSequence.equals(A1))) {
                                z10 = true;
                            }
                        }
                        if (!z10 && (32768 & i) != 0 && (k27Var5 = this.g1) != null && k27Var5.v != this.j1) {
                            z10 = true;
                        }
                        if (!z10 && (i & TLObject.FLAG_13) != 0 && this.h2 != null) {
                            TLRPC.Chat K04 = na7.q1(i2).K0(Long.valueOf(this.h2.id));
                            if ((K04 != null && K04.call_active && K04.call_not_empty) != this.w2) {
                                z10 = true;
                            }
                        }
                        if (!z10 && (i & 2) != 0) {
                            TLRPC.Chat chat2 = this.h2;
                            if (chat2 == null) {
                                i5 = i2;
                            } else if (chat2.monoforum) {
                                i5 = i2;
                            }
                            te3 te3Var = this.O4;
                            if (te3Var != null && (hashMap = te3Var.f) != null && !hashMap.isEmpty()) {
                                for (Map.Entry entry : te3Var.f.entrySet()) {
                                    ((ec0) entry.getValue()).c(((Long) entry.getKey()).longValue());
                                }
                            }
                            z10 = true;
                            if (!z10 && (i & 1) != 0 && this.h2 == null) {
                                z10 = true;
                            }
                            if (!z10 && (i & 8) != 0 && this.g2 == null) {
                                z10 = true;
                            }
                            if (!z10 && (i & 16) != 0 && this.g2 == null) {
                                z10 = true;
                            }
                            if (!z10) {
                                k27 k27Var9 = this.g1;
                                if (k27Var9 != null && this.Y0 != k27Var9.E4()) {
                                    this.Y0 = this.g1.E4();
                                    z10 = true;
                                }
                                if (this.O0) {
                                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) na7.q1(i5).R.f(this.I0);
                                    TLRPC.Chat K05 = dialog2 == null ? null : na7.q1(i5).K0(Long.valueOf(-dialog2.id));
                                    if (K05 == null || !(K05.forum || (K05.monoforum && hc2.A(i5, K05, 24)))) {
                                        if (dialog2 instanceof TLRPC.TL_dialogFolder) {
                                            i12 = ad7.Y(i5).M;
                                            z8 = z5;
                                        } else if (dialog2 instanceof TLRPC.TL_dialogCommunity) {
                                            c86 O02 = na7.q1(i5).O0(-dialog2.id);
                                            int i31 = O02.a;
                                            int i32 = O02.b;
                                            int i33 = O02.c;
                                            z8 = z5;
                                            int i34 = O02.d;
                                            this.f1 = O02.e;
                                            i12 = i31;
                                            i15 = i32;
                                            i14 = i33;
                                            i13 = i34;
                                        } else {
                                            z8 = z5;
                                            if (dialog2 != null) {
                                                int i35 = dialog2.unread_count;
                                                int i36 = dialog2.unread_mentions_count;
                                                int i37 = dialog2.unread_reactions_count;
                                                i13 = dialog2.unread_poll_votes_count;
                                                i14 = i37;
                                                i15 = i36;
                                                i12 = i35;
                                            } else {
                                                i12 = 0;
                                            }
                                        }
                                        i15 = 0;
                                        i14 = 0;
                                        i13 = 0;
                                    } else {
                                        na7.q1(i5).g4.h(K05.id);
                                        i12 = iArr[0];
                                        i15 = iArr[1];
                                        i14 = iArr[2];
                                        this.e1 = iArr[3] != 0;
                                        i13 = iArr[4];
                                        z8 = z5;
                                    }
                                    if (hc2.p0(K05)) {
                                        i15 = 0;
                                    }
                                    if (dialog2 != null && (this.T0 != i12 || this.U0 != dialog2.unread_mark || this.V0 != i15 || this.W0 != i14)) {
                                        this.T0 = i12;
                                        this.V0 = i15;
                                        this.U0 = dialog2.unread_mark;
                                        this.W0 = i14;
                                        this.X0 = i13;
                                        z10 = true;
                                    }
                                    if (!z10 && (i & TLObject.FLAG_12) != 0 && (k27Var4 = this.g1) != null) {
                                        i10 = this.Z0;
                                        i11 = k27Var4.k.send_state;
                                        if (i10 != i11) {
                                            this.Z0 = i11;
                                            z10 = true;
                                        }
                                    }
                                    if (!z10) {
                                        invalidate();
                                        return z7;
                                    }
                                }
                            }
                            z8 = z5;
                            if (!z10) {
                                i10 = this.Z0;
                                i11 = k27Var4.k.send_state;
                                if (i10 != i11) {
                                }
                            }
                            if (!z10) {
                            }
                        }
                        i5 = i2;
                        if (!z10) {
                            z10 = true;
                        }
                        if (!z10) {
                            z10 = true;
                        }
                        if (!z10) {
                            z10 = true;
                        }
                        if (!z10) {
                        }
                        z8 = z5;
                        if (!z10) {
                        }
                        if (!z10) {
                        }
                    } else {
                        i5 = i2;
                        z8 = z5;
                    }
                    this.g2 = null;
                    this.h2 = null;
                    this.i2 = null;
                    if (this.L0 != 0) {
                        na7 q12 = na7.q1(i5);
                        ArrayList arrayList5 = (ArrayList) q12.x.f(this.L0);
                        if (arrayList5 != null) {
                            int size = arrayList5.size();
                            for (int i38 = 0; i38 < size; i38++) {
                                ArrayList arrayList6 = (ArrayList) q12.S.f(((TLRPC.Dialog) arrayList5.get(i38)).id);
                                if (arrayList6 != null && !arrayList6.isEmpty()) {
                                    k27Var3 = (k27) arrayList6.get(0);
                                    break;
                                }
                            }
                        }
                        k27Var3 = null;
                        this.g1 = k27Var3;
                    }
                    i6 = this.K0;
                    if (i6 == 0) {
                        this.a1 = false;
                        this.c1 = false;
                        cj3 cj3Var = this.E4;
                        if (cj3Var == null || (m3 = cj3Var.m3(i5, this.k1, i6, false)) == null || m3.isEmpty()) {
                            k27Var2 = null;
                        } else {
                            int size2 = m3.size();
                            k27Var2 = null;
                            for (int i39 = 0; i39 < size2; i39++) {
                                TLRPC.Dialog dialog3 = (TLRPC.Dialog) m3.get(i39);
                                vf6 vf6Var = na7.q1(i5).S;
                                if (vf6Var != null) {
                                    ArrayList arrayList7 = (ArrayList) vf6Var.f(dialog3.id);
                                    k27 k27Var10 = (arrayList7 == null || arrayList7.isEmpty()) ? null : (k27) arrayList7.get(0);
                                    if (k27Var10 != null && (k27Var2 == null || k27Var10.k.date > k27Var2.k.date)) {
                                        k27Var2 = k27Var10;
                                    }
                                    if (dialog3.pinnedNum == 0 && k27Var2 != null) {
                                        break;
                                    }
                                }
                            }
                        }
                        this.g1 = k27Var2;
                        j = k27Var2 != null ? k27.B0(k27Var2.k) : 0L;
                    } else {
                        this.c1 = false;
                        if (this.O != null) {
                            boolean n2 = na7.q1(i5).n2(this.I0, 0L, null);
                            boolean n22 = na7.q1(i5).n2(this.I0, this.O.id, null);
                            this.b1 = n22;
                            if (n2 == n22) {
                                this.a1 = false;
                                this.c1 = false;
                            } else {
                                this.a1 = n22;
                                this.c1 = !n22;
                            }
                        } else {
                            this.a1 = this.O0 && na7.q1(i5).n2(this.I0, (long) getTopicId(), null);
                        }
                        j = this.I0;
                    }
                    if (j != 0) {
                        if (cf3.B(j)) {
                            TLRPC.EncryptedChat Y0 = na7.q1(i5).Y0(Integer.valueOf((int) (j & 4294967295L)));
                            this.i2 = Y0;
                            if (Y0 != null) {
                                this.g2 = na7.q1(i5).V1(Long.valueOf(this.i2.user_id));
                            }
                        } else if (cf3.D(j)) {
                            this.g2 = na7.q1(i5).V1(Long.valueOf(j));
                        } else {
                            TLRPC.Chat K06 = na7.q1(i5).K0(Long.valueOf(-j));
                            this.h2 = K06;
                            if (!this.O0 && K06 != null && K06.migrated_to != null && (K0 = na7.q1(i5).K0(Long.valueOf(this.h2.migrated_to.channel_id))) != null) {
                                this.h2 = K0;
                            }
                        }
                        if (this.v2 && this.g2 != null && this.g1.O3()) {
                            this.g2 = na7.q1(i5).V1(Long.valueOf(y6c.h(i5).n));
                        }
                    }
                    this.F = this.P0 && hc2.Y(this.h2) && this.O0;
                    if (this.K0 == 0) {
                        bkb.t1.setCallback(this);
                        pb0 pb0Var3 = pb0Var;
                        i7 = 2;
                        pb0Var3.f(2);
                        imageReceiver2 = imageReceiver;
                        imageReceiver2.d0(null, null, pb0Var3, null, this.g2, 0);
                    } else {
                        pb0 pb0Var4 = pb0Var;
                        imageReceiver2 = imageReceiver;
                        i7 = 2;
                        if (!this.P || (k27Var = this.g1) == null) {
                            TLRPC.User user4 = this.g2;
                            if (user4 != null) {
                                pb0Var4.q(user4);
                                if (l7c.B(this.g2)) {
                                    pb0Var4.f(12);
                                    imageReceiver2.d0(null, null, pb0Var4, null, this.g2, 0);
                                } else if (l7c.u(this.g2)) {
                                    pb0Var4.f(21);
                                    imageReceiver2.d0(null, null, pb0Var4, null, this.g2, 0);
                                } else if (l7c.D(this.g2) && this.s0 && !this.r0) {
                                    pb0Var4.f(22);
                                    imageReceiver2.d0(null, null, pb0Var4, null, this.g2, 0);
                                } else if (!l7c.D(this.g2) || this.v2 || this.r0) {
                                    imageReceiver2.V(this.g2, pb0Var4, null, true, 1, false);
                                } else {
                                    pb0Var4.f(1);
                                    imageReceiver2.d0(null, null, pb0Var4, null, this.g2, 0);
                                }
                            } else {
                                TLRPC.Chat chat3 = this.h2;
                                if (chat3 != null) {
                                    if (chat3.monoforum) {
                                        mm4.p(i5, chat3, pb0Var4, imageReceiver2);
                                        pb0Var4.p = 1.0f;
                                    } else {
                                        pb0Var4.p(chat3);
                                        imageReceiver2.U(chat3, pb0Var4, null);
                                    }
                                }
                            }
                        } else {
                            pb0Var4.o(k27Var.b1());
                            imageReceiver2.U(this.g1.b1(), pb0Var4, null);
                        }
                    }
                    boolean z18 = z6;
                    if (z && (((i8 = i4) != this.T0 || z15 != this.U0) && (!this.O0 || System.currentTimeMillis() - this.C4 > 100))) {
                        valueAnimator = this.U3;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        float[] fArr = new float[i7];
                        // fill-array-data instruction
                        fArr[0] = 0.0f;
                        fArr[1] = 1.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                        this.U3 = ofFloat;
                        ofFloat.addUpdateListener(new ke3(this, (byte) 0));
                        this.U3.addListener(new ne3(this, (byte) 0));
                        if ((i8 != 0 || this.U0) && (this.U0 || !z15)) {
                            this.U3.setDuration(220L);
                            this.U3.setInterpolator(new OvershootInterpolator());
                        } else {
                            int i40 = this.T0;
                            ValueAnimator valueAnimator2 = this.U3;
                            if (i40 == 0) {
                                valueAnimator2.setDuration(150L);
                                this.U3.setInterpolator(s33.f);
                            } else {
                                valueAnimator2.setDuration(430L);
                                this.U3.setInterpolator(s33.f);
                            }
                        }
                        if (this.H3 || !this.M3 || this.Y3 == null) {
                            i9 = i8;
                        } else {
                            String format = String.format("%d", Integer.valueOf(i8));
                            String format2 = String.format("%d", Integer.valueOf(this.T0));
                            if (format.length() == format2.length()) {
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(format2);
                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(format2);
                                int i41 = 0;
                                while (i41 < format.length()) {
                                    if (format.charAt(i41) == format2.charAt(i41)) {
                                        int i42 = i41 + 1;
                                        spannableStringBuilder.setSpan(new lx2((byte) 1), i41, i42, 0);
                                        str = format2;
                                        spannableStringBuilder2.setSpan(new lx2((byte) 1), i41, i42, 0);
                                    } else {
                                        str = format2;
                                        spannableStringBuilder3.setSpan(new lx2((byte) 1), i41, i41 + 1, 0);
                                    }
                                    i41++;
                                    format2 = str;
                                }
                                i9 = i8;
                                int max = Math.max(gl.L(8.0f), (int) Math.ceil(bkb.L0.measureText(format)));
                                TextPaint textPaint = bkb.L0;
                                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                                this.Z3 = new StaticLayout(spannableStringBuilder, textPaint, max, alignment, 1.0f, 0.0f, false);
                                this.a4 = new StaticLayout(spannableStringBuilder3, bkb.L0, max, alignment, 1.0f, 0.0f, false);
                                this.b4 = new StaticLayout(spannableStringBuilder2, bkb.L0, max, alignment, 1.0f, 0.0f, false);
                            } else {
                                i9 = i8;
                                this.Z3 = this.Y3;
                            }
                        }
                        this.Q3 = this.P3;
                        this.R3 = this.O3;
                        this.S3 = this.T0 <= i9;
                        this.U3.start();
                    }
                    this.T3.a(this.X0 == 0, z);
                    boolean z19 = this.W0 == 0;
                    if (z || z19 == z14) {
                        f = 0.0f;
                    } else {
                        ValueAnimator valueAnimator3 = this.V3;
                        if (valueAnimator3 != null) {
                            valueAnimator3.cancel();
                        }
                        f = 0.0f;
                        this.X3 = 0.0f;
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.V3 = ofFloat2;
                        ofFloat2.addUpdateListener(new ke3(this, (byte) 1));
                        this.V3.addListener(new ne3(this, (byte) 1));
                        ValueAnimator valueAnimator4 = this.V3;
                        if (z19) {
                            valueAnimator4.setDuration(220L);
                            this.V3.setInterpolator(new OvershootInterpolator());
                        } else {
                            valueAnimator4.setDuration(150L);
                            this.V3.setInterpolator(s33.f);
                        }
                        this.V3.start();
                    }
                    z9 = Y() && (chat = this.h2) != null && chat.monoforum;
                    this.E = z9;
                    if (!z9) {
                        L = 1;
                    } else if (this.F) {
                        L = gl.L(12.0f);
                    } else {
                        TLRPC.Chat chat4 = this.h2;
                        L = ((chat4 == null || !chat4.forum || this.K0 != 0 || this.P) && (this.s0 || (user = this.g2) == null || !user.self || !na7.q1(i5).P3)) ? gl.L(28.0f) : gl.L(16.0f);
                    }
                    imageReceiver2.q0(L);
                    z13 = z18;
                }
            } else {
                z3 = Z;
                z4 = false;
                i4 = i21;
                imageReceiver = imageReceiver5;
            }
            z5 = z4;
            z6 = z5;
            z7 = z6;
            if (i == 0) {
            }
            this.g2 = null;
            this.h2 = null;
            this.i2 = null;
            if (this.L0 != 0) {
            }
            i6 = this.K0;
            if (i6 == 0) {
            }
            if (j != 0) {
            }
            this.F = this.P0 && hc2.Y(this.h2) && this.O0;
            if (this.K0 == 0) {
            }
            boolean z182 = z6;
            if (z) {
                valueAnimator = this.U3;
                if (valueAnimator != null) {
                }
                float[] fArr2 = new float[i7];
                // fill-array-data instruction
                fArr2[0] = 0.0f;
                fArr2[1] = 1.0f;
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(fArr2);
                this.U3 = ofFloat3;
                ofFloat3.addUpdateListener(new ke3(this, (byte) 0));
                this.U3.addListener(new ne3(this, (byte) 0));
                if (i8 != 0) {
                }
                this.U3.setDuration(220L);
                this.U3.setInterpolator(new OvershootInterpolator());
                if (this.H3) {
                }
                i9 = i8;
                this.Q3 = this.P3;
                this.R3 = this.O3;
                this.S3 = this.T0 <= i9;
                this.U3.start();
            }
            this.T3.a(this.X0 == 0, z);
            if (this.W0 == 0) {
            }
            if (z) {
            }
            f = 0.0f;
            if (Y()) {
            }
            this.E = z9;
            if (!z9) {
            }
            imageReceiver2.q0(L);
            z13 = z182;
        }
        if (!this.Q && (getMeasuredWidth() != 0 || getMeasuredHeight() != 0)) {
            z8 = true;
        }
        if (!z13) {
            int i43 = this.v0.y;
            x2b.r(na7.q1(i5).M1(), getDialogId());
        }
        if (!z) {
            this.d1 = (this.a1 || this.c1) ? 1.0f : f;
            ValueAnimator valueAnimator5 = this.U3;
            if (valueAnimator5 != null) {
                valueAnimator5.cancel();
            }
        }
        invalidate();
        if (Z() != z3) {
            z7 = true;
        }
        if (z8) {
            if (this.x3) {
                z();
            } else {
                this.B0 = true;
            }
        }
        m0(z);
        return z7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ed, code lost:
    
        if (up3.q(r33.G0).c(1, r4.size) == false) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f0  */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.util.ArrayList<org.telegram.tgnet.TLRPC$PhotoSize>] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    /* JADX WARN: Type inference failed for: r8v25, types: [org.telegram.tgnet.TLRPC$Document] */
    /* JADX WARN: Type inference failed for: r8v28, types: [org.telegram.tgnet.TLRPC$Photo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l0() {
        TLRPC.Message message;
        int i;
        ?? r14;
        boolean z;
        TLRPC.PhotoSize photoSize;
        TLRPC.PhotoSize Q;
        TLRPC.PhotoSize photoSize2;
        TLRPC.PhotoSize w;
        boolean z2;
        int i2;
        TLRPC.PhotoSize photoSize3;
        k27 k27Var = this.g1;
        if (k27Var != null) {
            String C1 = na7.q1(k27Var.K1).C1(this.g1.k.restriction_reason);
            k27 k27Var2 = this.g1;
            TLRPC.PhotoSize photoSize4 = null;
            int i3 = 3;
            boolean z3 = false;
            if (k27Var2 != null && (message = k27Var2.k) != null) {
                TLRPC.MessageMedia messageMedia = message.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
                    this.S1 = 0;
                    this.T1 = false;
                    TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia;
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < tL_messageMediaPaidMedia.extended_media.size() && this.S1 < i3) {
                        TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i4);
                        boolean z4 = messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview;
                        boolean[] zArr = this.Y1;
                        boolean[] zArr2 = this.X1;
                        ImageReceiver[] imageReceiverArr = this.W1;
                        if (z4) {
                            i = i5 + 1;
                            TLRPC.PhotoSize photoSize5 = ((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia).thumb;
                            if (i5 < i3 && photoSize5 != null) {
                                this.T1 = z3;
                                int i6 = this.S1;
                                if (i6 < i3) {
                                    this.S1 = i6 + 1;
                                    zArr2[i5] = z3;
                                    zArr[i5] = true;
                                    imageReceiverArr[i5].Z(gl5.f(photoSize5, this.g1.k), "2_2_b", null, null, null, 0L, null, this.g1, 0);
                                    imageReceiverArr[i5].q0(gl.L(2.0f));
                                    this.W = z3;
                                }
                            }
                        } else if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                            i = i5 + 1;
                            TLRPC.MessageMedia messageMedia2 = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
                            if (messageMedia2 instanceof TLRPC.TL_messageMediaPhoto) {
                                ?? r8 = messageMedia2.photo;
                                r14 = r8.sizes;
                                photoSize3 = r8;
                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaDocument) {
                                boolean J4 = k27.J4(messageMedia2.document);
                                ?? r82 = messageMedia2.document;
                                z = J4;
                                r14 = r82.thumbs;
                                photoSize = r82;
                                Q = ba4.Q(r14);
                                if (Q == null) {
                                    Q = ba4.w(r14, 40, z3, photoSize4, z3);
                                }
                                photoSize2 = Q;
                                w = ba4.w(r14, gl.Y0(z3), z3, photoSize4, true);
                                if (photoSize2 == w) {
                                    w = photoSize4;
                                }
                                if (w == null) {
                                    z2 = z3;
                                    i2 = i5;
                                } else {
                                    z2 = z3;
                                    i2 = i5;
                                }
                                w = photoSize2;
                                if (photoSize2 != null) {
                                    this.T1 = (this.T1 || z) ? true : z2;
                                    int i7 = this.S1;
                                    if (i7 < 3) {
                                        this.S1 = i7 + 1;
                                        zArr2[i2] = z;
                                        zArr[i2] = z2;
                                        imageReceiverArr[i2].Z(gl5.f(w, photoSize), "20_20", gl5.f(photoSize2, photoSize), "20_20", null, (long) ((z || w == null) ? z2 : w.size), null, this.g1, 0);
                                        imageReceiverArr[i2].q0(gl.L(2.0f));
                                        this.W = z2;
                                    }
                                }
                            } else {
                                TLRPC.PhotoSize photoSize6 = photoSize4;
                                r14 = photoSize6;
                                photoSize3 = photoSize6;
                            }
                            z = z3;
                            photoSize = photoSize3;
                            Q = ba4.Q(r14);
                            if (Q == null) {
                            }
                            photoSize2 = Q;
                            w = ba4.w(r14, gl.Y0(z3), z3, photoSize4, true);
                            if (photoSize2 == w) {
                            }
                            if (w == null) {
                            }
                            w = photoSize2;
                            if (photoSize2 != null) {
                            }
                        } else {
                            i4++;
                            photoSize4 = null;
                            i3 = 3;
                            z3 = false;
                        }
                        i5 = i;
                        i4++;
                        photoSize4 = null;
                        i3 = 3;
                        z3 = false;
                    }
                    return;
                }
            }
            ArrayList arrayList = this.h1;
            if (arrayList != null && arrayList.size() > 1 && TextUtils.isEmpty(C1) && this.K0 == 0 && this.i2 == null) {
                this.S1 = 0;
                this.T1 = false;
                Collections.sort(this.h1, Comparator$-CC.comparingInt(new mm((byte) 3)));
                for (int i8 = 0; i8 < Math.min(3, this.h1.size()); i8++) {
                    k27 k27Var3 = (k27) this.h1.get(i8);
                    if (k27Var3 != null && !k27Var3.l5() && (k27.R3(k27Var3.k) || k27Var3.L3() || k27.K4(k27Var3.k) || k27Var3.g4() || k27Var3.x4())) {
                        String str = k27Var3.Y4() ? k27Var3.k.media.webpage.type : null;
                        if (!"app".equals(str) && !"profile".equals(str) && !"article".equals(str) && (str == null || !str.startsWith("telegram_"))) {
                            i0(i8, k27Var3);
                        }
                    }
                }
                return;
            }
            k27 k27Var4 = this.g1;
            if (k27Var4 == null || this.K0 != 0) {
                return;
            }
            this.S1 = 0;
            this.T1 = false;
            if (k27Var4.l5()) {
                return;
            }
            if (k27.R3(this.g1.k) || this.g1.L3() || k27.K4(this.g1.k) || this.g1.g4() || this.g1.x4()) {
                String str2 = this.g1.Y4() ? this.g1.k.media.webpage.type : null;
                if ("app".equals(str2) || "profile".equals(str2) || "article".equals(str2)) {
                    return;
                }
                if (str2 == null || !str2.startsWith("telegram_")) {
                    i0(0, this.g1);
                }
            }
        }
    }

    public final void m0(boolean z) {
        TL_account.RequirementToContact J2 = (this.a5 == null || this.g2 == null) ? null : na7.q1(this.G0).J2(this.g2.id);
        boolean z2 = J2 instanceof TL_account.requirementToContactPremium;
        if (this.o2 == z2 && this.q2 == cf3.j(J2)) {
            return;
        }
        this.o2 = z2;
        this.q2 = cf3.j(J2);
        if (!z) {
            this.n2.f(this.o2, true);
            this.p2.f(this.q2 > 0, true);
        }
        invalidate();
    }

    public final void n0() {
        if (this.S1 > 0) {
            StaticLayout staticLayout = Z() ? this.i3 : this.f3;
            int i = Z() ? this.d3 : this.c3;
            if (staticLayout != null) {
                try {
                    CharSequence text = staticLayout.getText();
                    if (text instanceof Spanned) {
                        se3[] se3VarArr = (se3[]) ((Spanned) text).getSpans(0, text.length(), se3.class);
                        boolean[] zArr = this.V1;
                        if (se3VarArr == null || se3VarArr.length <= 0) {
                            for (int i2 = 0; i2 < 3; i2++) {
                                zArr[i2] = false;
                            }
                            return;
                        }
                        int spanStart = ((Spanned) text).getSpanStart(se3VarArr[0]);
                        if (spanStart < 0) {
                            spanStart = 0;
                        }
                        int ceil = (int) Math.ceil(Math.min(staticLayout.getPrimaryHorizontal(spanStart), staticLayout.getPrimaryHorizontal(spanStart + 1)));
                        if (ceil != 0 && !this.y0 && !this.z0) {
                            ceil += gl.L(3.0f);
                        }
                        for (int i3 = 0; i3 < this.S1; i3++) {
                            this.W1[i3].L0 = i + ceil + gl.L((this.M4 + 2) * i3);
                            zArr[i3] = true;
                        }
                    }
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Z1.I();
        int i = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.W1;
            if (i >= imageReceiverArr.length) {
                break;
            }
            imageReceiverArr[i].I();
            i++;
        }
        d0();
        this.n3 = gm.update(0, this, this.n3, this.f3);
        this.o3 = gm.update(0, this, this.o3, this.t3);
        this.p3 = gm.update(0, this, this.p3, this.i3);
        this.q3 = gm.update(0, this, this.q3, this.A2);
        tl tlVar = this.o4;
        if (tlVar != null) {
            tlVar.a();
        }
        tl tlVar2 = this.p4;
        if (tlVar2 != null) {
            tlVar2.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.y1 = false;
        this.B1 = false;
        this.C1 = 0.0f;
        this.x3 = false;
        this.y3 = (getIsPinned() && this.z3) ? 1.0f : 0.0f;
        this.Z1.K();
        int i = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.W1;
            if (i >= imageReceiverArr.length) {
                break;
            }
            imageReceiverArr[i].K();
            i++;
        }
        oy8 oy8Var = this.z1;
        if (oy8Var != null) {
            oy8Var.stop();
            this.z1.O(true, 0.0f);
            this.z1.setCallback(null);
            this.z1 = null;
            this.A1 = false;
        }
        lj3 lj3Var = this.t4;
        if (lj3Var != null) {
            lj3Var.d.remove(Long.valueOf(this.I0));
        }
        tl tlVar = this.o4;
        if (tlVar != null) {
            tlVar.b();
        }
        tl tlVar2 = this.p4;
        if (tlVar2 != null) {
            tlVar2.b();
        }
        gm.release(this, this.n3);
        gm.release(this, this.o3);
        gm.release(this, this.p3);
        gm.release(this, this.q3);
        this.v0.g();
        this.d0 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1014:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:1024:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:1041:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:1047:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:1050:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:1053:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:1054:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0caf  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0cbc  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0cd2  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0cd5  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0ce7  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0d1a  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0d51  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0d74  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0d77  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0d82  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0da1  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0da6  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0d57  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0dc4  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0fc5  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x1082  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x10e6  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x10f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:446:0x1238  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x1384  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x13ed  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x162c  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x16a0  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x17dd  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x180e  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x1829  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x1848  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x1865  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x1941  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x18a0  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x197a  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x1981  */
    /* JADX WARN: Removed duplicated region for block: B:598:0x1991  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x19e7  */
    /* JADX WARN: Removed duplicated region for block: B:606:0x19f0  */
    /* JADX WARN: Removed duplicated region for block: B:608:0x19f5  */
    /* JADX WARN: Removed duplicated region for block: B:623:0x1a48  */
    /* JADX WARN: Removed duplicated region for block: B:643:0x1ac5  */
    /* JADX WARN: Removed duplicated region for block: B:648:0x1b13  */
    /* JADX WARN: Removed duplicated region for block: B:657:0x1b73  */
    /* JADX WARN: Removed duplicated region for block: B:662:0x1ba8  */
    /* JADX WARN: Removed duplicated region for block: B:673:0x1bf4  */
    /* JADX WARN: Removed duplicated region for block: B:679:0x1c0d  */
    /* JADX WARN: Removed duplicated region for block: B:690:0x1c4f  */
    /* JADX WARN: Removed duplicated region for block: B:693:0x1c58  */
    /* JADX WARN: Removed duplicated region for block: B:695:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:696:0x1c51  */
    /* JADX WARN: Removed duplicated region for block: B:698:0x1c2f  */
    /* JADX WARN: Removed duplicated region for block: B:706:0x1bca  */
    /* JADX WARN: Removed duplicated region for block: B:716:0x1b7f  */
    /* JADX WARN: Removed duplicated region for block: B:722:0x1b92  */
    /* JADX WARN: Removed duplicated region for block: B:733:0x143b  */
    /* JADX WARN: Removed duplicated region for block: B:796:0x1390  */
    /* JADX WARN: Removed duplicated region for block: B:801:0x1288  */
    /* JADX WARN: Removed duplicated region for block: B:896:0x1075  */
    /* JADX WARN: Removed duplicated region for block: B:908:0x0fc0  */
    /* JADX WARN: Removed duplicated region for block: B:911:0x0cb5  */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v61 */
    /* JADX WARN: Type inference failed for: r12v62 */
    /* JADX WARN: Type inference failed for: r12v7, types: [boolean, int] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(Canvas canvas) {
        float f;
        boolean z;
        int v0;
        int v02;
        int i;
        String L0;
        oy8 oy8Var;
        String str;
        oy8 oy8Var2;
        int i2;
        int i3;
        float f2;
        int i4;
        wjb wjbVar;
        boolean z2;
        sb sbVar;
        oe3 oe3Var;
        String str2;
        float f3;
        int i5;
        String str3;
        float f4;
        oe3 oe3Var2;
        float f5;
        oe3 oe3Var3;
        String str4;
        int ceil;
        int i6;
        StaticLayout staticLayout;
        float f6;
        boolean z3;
        oy8 oy8Var3;
        float f7;
        float f8;
        wjb wjbVar2;
        float f9;
        ue3 ue3Var;
        int i7;
        wjb wjbVar3;
        oe3 oe3Var4;
        sb sbVar2;
        ?? r12;
        float f10;
        int i8;
        boolean z4;
        int i9;
        boolean z5;
        ImageReceiver imageReceiver;
        boolean z6;
        me3 me3Var;
        ue3 ue3Var2;
        float f11;
        int i10;
        Canvas canvas2;
        boolean z7;
        float f12;
        boolean z8;
        boolean z9;
        TLRPC.TL_forumTopic tL_forumTopic;
        TLRPC.Chat chat;
        TLRPC.User user;
        sk0 sk0Var;
        TLRPC.TL_forumTopic tL_forumTopic2;
        vu8 vu8Var;
        re3 re3Var;
        float f13;
        float f14;
        int i11;
        int i12;
        float f15;
        int i13;
        boolean z10;
        re3 re3Var2;
        int i14;
        RectF rectF;
        wjb wjbVar4;
        re3 re3Var3;
        float f16;
        boolean z11;
        ue3 ue3Var3;
        boolean z12;
        float f17;
        wtc wtcVar;
        int i15;
        float L;
        float f18;
        boolean z13;
        boolean z14;
        boolean z15;
        int i16;
        float f19;
        float A;
        StaticLayout staticLayout2;
        int i17;
        bya t0;
        float A2;
        int i18;
        pe3 pe3Var;
        cj3 cj3Var;
        rh3 rh3Var;
        TLRPC.TL_forumTopic tL_forumTopic3;
        vu8 vu8Var2;
        TLRPC.TL_forumTopic tL_forumTopic4;
        Canvas canvas3 = canvas;
        if ((this.I0 == 0 && this.H0 == null) || !this.A0) {
            return;
        }
        boolean z16 = this.h;
        sb sbVar3 = this.n4;
        if (z16 && ((this.K0 != 0 || (this.Q && (tL_forumTopic4 = this.O) != null && tL_forumTopic4.id == 1)) && (vu8Var2 = this.f2) != null && vu8Var2.C == 0.0f && this.x1 == 0.0f)) {
            canvas3.save();
            canvas3.translate(0.0f, (-this.F3) - this.n);
            canvas3.clipRect(0.0f, (1.0f - this.f2.J) * getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
            this.f2.c(canvas3, false);
            canvas3.restore();
            sbVar3.setVisibility(4);
            return;
        }
        boolean z17 = z16 && (this.K0 != 0 || (this.Q && (tL_forumTopic3 = this.O) != null && tL_forumTopic3.id == 1)) && this.f2 != null && this.x1 == 0.0f && (cj3Var = this.E4) != null && cj3Var.w3() && ((rh3Var = cj3Var.H3) == null || !rh3Var.c());
        vu8 vu8Var3 = this.f2;
        float f20 = vu8Var3 != null ? vu8Var3.J : 1.0f;
        if (z17) {
            canvas3.save();
            canvas3.clipRect(0.0f, (1.0f - f20) * getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.u1 != 0.0f && Build.VERSION.SDK_INT != 24) {
            canvas3.save();
            canvas3.clipRect(0.0f, this.v1 * this.u1, getMeasuredWidth(), getMeasuredHeight() - ((int) (this.w1 * this.u1)));
        }
        float f21 = this.x1;
        oe3 oe3Var5 = this.e2;
        wjb wjbVar5 = this.K4;
        if (f21 == 0.0f && this.p1 == 0.0f) {
            oy8 oy8Var4 = this.z1;
            if (oy8Var4 != null) {
                oy8Var4.stop();
                this.z1.O(true, 0.0f);
                this.z1.setCallback(null);
                this.z1 = null;
                this.A1 = false;
            }
            f = 1.0f;
            wjbVar = wjbVar5;
            z2 = z16;
            sbVar = sbVar3;
            f6 = 2.0f;
            oe3Var3 = oe3Var5;
        } else {
            canvas3.save();
            canvas3.translate(0.0f, -this.F3);
            if (this.M1) {
                v0 = bkb.v0(this.N1, wjbVar5);
                v02 = bkb.v0(this.O1, wjbVar5);
                String str5 = this.P1;
                f = 1.0f;
                i = this.Q1;
                L0 = k96.M0(i, str5);
                z = false;
                oy8Var = this.R1;
                this.z1 = oy8Var;
            } else {
                f = 1.0f;
                z = false;
                if (this.K0 != 0) {
                    if (this.n1) {
                        v0 = bkb.v0(bkb.c9, wjbVar5);
                        v02 = bkb.v0(bkb.b9, wjbVar5);
                        i = 2131743644;
                        L0 = k96.L0(2131743644);
                        oy8Var = bkb.x1;
                        this.z1 = oy8Var;
                    } else {
                        v0 = bkb.v0(bkb.b9, wjbVar5);
                        v02 = bkb.v0(bkb.c9, wjbVar5);
                        i = 2131749124;
                        L0 = k96.L0(2131749124);
                        oy8Var = bkb.w1;
                        this.z1 = oy8Var;
                    }
                } else if (this.Q2) {
                    v0 = bkb.v0(bkb.b9, wjbVar5);
                    v02 = bkb.v0(bkb.c9, wjbVar5);
                    i = 2131746406;
                    L0 = k96.L0(2131746406);
                    oy8Var = bkb.y1;
                    this.z1 = oy8Var;
                } else if (this.l1 == 0) {
                    v0 = bkb.v0(bkb.b9, wjbVar5);
                    v02 = bkb.v0(bkb.c9, wjbVar5);
                    if (hc2.Y(this.h2)) {
                        String L02 = k96.L0(2131744063);
                        v0 = bkb.v0(bkb.X5, wjbVar5);
                        oy8 oy8Var5 = bkb.J1;
                        this.z1 = oy8Var5;
                        str = L02;
                        oy8Var2 = oy8Var5;
                        i2 = 2131744063;
                        i3 = v0;
                        if (this.x || (oy8Var3 = this.s) == null) {
                            this.s = oy8Var2;
                            this.w = i2;
                        } else {
                            this.z1 = oy8Var3;
                            i2 = this.w;
                        }
                        if (!this.A1 && Math.abs(this.x1) > gl.L(43.0f)) {
                            this.A1 = true;
                            this.z1.O(true, 0.0f);
                            this.z1.setCallback(this);
                            this.z1.start();
                        }
                        float measuredWidth = getMeasuredWidth() + this.x1;
                        if (this.C1 >= f) {
                            bkb.u0.setColor(v0);
                            i4 = i2;
                            wjbVar = wjbVar5;
                            z2 = z16;
                            sbVar = sbVar3;
                            oe3Var = oe3Var5;
                            f3 = measuredWidth;
                            str2 = "Arrow";
                            f2 = 0.0f;
                            canvas3.drawRect(measuredWidth - gl.L(8.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight(), bkb.u0);
                            if (this.C1 == 0.0f) {
                                if (bkb.z1) {
                                    bkb.u1.L(bkb.F0(bkb.b9), str2);
                                    bkb.z1 = z;
                                }
                                if (bkb.A1) {
                                    oy8 oy8Var6 = bkb.y1;
                                    oy8Var6.a0 = true;
                                    int i19 = bkb.b9;
                                    oy8Var6.L(bkb.F0(i19), "Line 1");
                                    bkb.y1.L(bkb.F0(i19), "Line 2");
                                    bkb.y1.L(bkb.F0(i19), "Line 3");
                                    bkb.y1.j();
                                    bkb.A1 = z;
                                }
                            }
                        } else {
                            f2 = 0.0f;
                            i4 = i2;
                            wjbVar = wjbVar5;
                            z2 = z16;
                            sbVar = sbVar3;
                            oe3Var = oe3Var5;
                            str2 = "Arrow";
                            f3 = measuredWidth;
                        }
                        int measuredWidth2 = (getMeasuredWidth() - gl.L(43.0f)) - (this.z1.getIntrinsicWidth() / 2);
                        int D = ug8.D(52.0f, getMeasuredHeight(), 2);
                        int intrinsicWidth = (this.z1.getIntrinsicWidth() / 2) + measuredWidth2;
                        int intrinsicHeight = (this.z1.getIntrinsicHeight() / 2) + D;
                        if (this.C1 <= f2) {
                            canvas3.save();
                            i5 = i4;
                            str3 = str;
                            f4 = f3;
                            canvas3.clipRect(f3 - gl.L(8.0f), f2, getMeasuredWidth(), getMeasuredHeight());
                            bkb.u0.setColor(i3);
                            oe3Var2 = oe3Var;
                            canvas3.drawCircle(intrinsicWidth, intrinsicHeight, gl.G.getInterpolation(this.C1) * ((float) Math.sqrt(((intrinsicHeight - getMeasuredHeight()) * (intrinsicHeight - getMeasuredHeight())) + (intrinsicWidth * intrinsicWidth))), bkb.u0);
                            canvas3.restore();
                            if (bkb.z1) {
                                z3 = true;
                            } else {
                                bkb.u1.L(bkb.F0(bkb.c9), str2);
                                z3 = true;
                                bkb.z1 = true;
                            }
                            if (!bkb.A1) {
                                oy8 oy8Var7 = bkb.y1;
                                oy8Var7.a0 = z3;
                                int i20 = bkb.c9;
                                oy8Var7.L(bkb.F0(i20), "Line 1");
                                bkb.y1.L(bkb.F0(i20), "Line 2");
                                bkb.y1.L(bkb.F0(i20), "Line 3");
                                bkb.y1.j();
                                bkb.A1 = true;
                            }
                        } else {
                            i5 = i4;
                            str3 = str;
                            f4 = f3;
                            oe3Var2 = oe3Var;
                        }
                        canvas3.save();
                        canvas3.translate(measuredWidth2, D);
                        f5 = this.D1;
                        if (f5 != 0.0f || f5 == f) {
                            oe3Var3 = oe3Var2;
                        } else {
                            oe3Var3 = oe3Var2;
                            float interpolation = oe3Var3.getInterpolation(f5) + f;
                            canvas3.scale(interpolation, interpolation, this.z1.getIntrinsicWidth() / 2, this.z1.getIntrinsicHeight() / 2);
                        }
                        boolean z18 = z;
                        hf0.t(z18 ? 1 : 0, z18 ? 1 : 0, this.z1);
                        this.z1.draw(canvas3);
                        canvas3.restore();
                        canvas3.clipRect(f4, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        str4 = str3;
                        ceil = (int) Math.ceil(bkb.L0.measureText(str4));
                        i6 = i5;
                        if (this.G4 == i6 || this.H4 != getMeasuredWidth()) {
                            this.G4 = i6;
                            this.H4 = getMeasuredWidth();
                            TextPaint textPaint = bkb.M0;
                            int min = Math.min(gl.L(80.0f), ceil);
                            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                            staticLayout = new StaticLayout(str4, textPaint, min, alignment, 1.0f, 0.0f, false);
                            this.F4 = staticLayout;
                            if (staticLayout.getLineCount() > 1) {
                                this.F4 = new StaticLayout(str4, bkb.N0, Math.min(gl.L(82.0f), ceil), alignment, 1.0f, 0.0f, false);
                            }
                        }
                        if (this.F4 == null) {
                            canvas3.save();
                            f6 = 2.0f;
                            canvas3.translate((getMeasuredWidth() - gl.L(43.0f)) - (this.F4.getWidth() / 2.0f), gl.L(36.0f) + D + (this.F4.getLineCount() > 1 ? -gl.L(4.0f) : 0.0f));
                            this.F4.draw(canvas3);
                            canvas3.restore();
                        } else {
                            f6 = 2.0f;
                        }
                        canvas3.restore();
                    } else {
                        int i21 = this.G0;
                        if (gba.m(i21) == 3) {
                            if (this.a1) {
                                i = 2131744062;
                                L0 = k96.L0(2131744062);
                                oy8Var = bkb.H1;
                                this.z1 = oy8Var;
                            } else {
                                i = 2131744080;
                                L0 = k96.L0(2131744080);
                                oy8Var = bkb.G1;
                                this.z1 = oy8Var;
                            }
                        } else if (gba.m(i21) == 4) {
                            i = 2131744083;
                            L0 = k96.L0(2131744083);
                            v0 = bkb.v0(bkb.X5, wjbVar5);
                            oy8Var = bkb.I1;
                            this.z1 = oy8Var;
                        } else if (gba.m(i21) == 1) {
                            if (this.T0 > 0 || this.U0) {
                                i = 2131744082;
                                L0 = k96.L0(2131744082);
                                oy8Var = bkb.K1;
                                this.z1 = oy8Var;
                            } else {
                                i = 2131744081;
                                L0 = k96.L0(2131744081);
                                oy8Var = bkb.L1;
                                this.z1 = oy8Var;
                            }
                        } else if (gba.m(i21) != 0) {
                            i = 2131754169;
                            L0 = k96.L0(2131754169);
                            oy8Var = bkb.u1;
                            this.z1 = oy8Var;
                        } else if (getIsPinned()) {
                            i = 2131744061;
                            L0 = k96.L0(2131744061);
                            oy8Var = bkb.N1;
                            this.z1 = oy8Var;
                        } else {
                            i = 2131744079;
                            L0 = k96.L0(2131744079);
                            oy8Var = bkb.M1;
                            this.z1 = oy8Var;
                        }
                    }
                } else {
                    v0 = bkb.v0(bkb.c9, wjbVar5);
                    v02 = bkb.v0(bkb.b9, wjbVar5);
                    i = 2131743676;
                    L0 = k96.L0(2131743676);
                    oy8Var = bkb.v1;
                    this.z1 = oy8Var;
                }
            }
            int i22 = i;
            i3 = v02;
            i2 = i22;
            oy8 oy8Var8 = oy8Var;
            str = L0;
            oy8Var2 = oy8Var8;
            if (this.x) {
            }
            this.s = oy8Var2;
            this.w = i2;
            if (!this.A1) {
                this.A1 = true;
                this.z1.O(true, 0.0f);
                this.z1.setCallback(this);
                this.z1.start();
            }
            float measuredWidth3 = getMeasuredWidth() + this.x1;
            if (this.C1 >= f) {
            }
            int measuredWidth22 = (getMeasuredWidth() - gl.L(43.0f)) - (this.z1.getIntrinsicWidth() / 2);
            int D2 = ug8.D(52.0f, getMeasuredHeight(), 2);
            int intrinsicWidth2 = (this.z1.getIntrinsicWidth() / 2) + measuredWidth22;
            int intrinsicHeight2 = (this.z1.getIntrinsicHeight() / 2) + D2;
            if (this.C1 <= f2) {
            }
            canvas3.save();
            canvas3.translate(measuredWidth22, D2);
            f5 = this.D1;
            if (f5 != 0.0f) {
            }
            oe3Var3 = oe3Var2;
            boolean z182 = z;
            hf0.t(z182 ? 1 : 0, z182 ? 1 : 0, this.z1);
            this.z1.draw(canvas3);
            canvas3.restore();
            canvas3.clipRect(f4, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            str4 = str3;
            ceil = (int) Math.ceil(bkb.L0.measureText(str4));
            i6 = i5;
            if (this.G4 == i6) {
            }
            this.G4 = i6;
            this.H4 = getMeasuredWidth();
            TextPaint textPaint2 = bkb.M0;
            int min2 = Math.min(gl.L(80.0f), ceil);
            Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
            staticLayout = new StaticLayout(str4, textPaint2, min2, alignment2, 1.0f, 0.0f, false);
            this.F4 = staticLayout;
            if (staticLayout.getLineCount() > 1) {
            }
            if (this.F4 == null) {
            }
            canvas3.restore();
        }
        if (this.x1 != 0.0f) {
            canvas3.save();
            canvas3.translate(this.x1, 0.0f);
            f7 = 0.0f + this.x1;
        } else {
            f7 = 0.0f;
        }
        float L2 = gl.L(8.0f) * this.p1;
        boolean z19 = this.r4;
        RectF rectF2 = this.s4;
        if (z19) {
            f8 = 0.0f;
            rectF2.set(0.0f, 0.0f, getMeasuredWidth(), gl.U1(this.j0, getMeasuredHeight(), getCollapsedHeight()));
            rectF2.offset(0.0f, (-this.F3) + this.D0);
            canvas3.drawRoundRect(rectF2, L2, L2, bkb.t0);
        } else {
            f8 = 0.0f;
        }
        canvas3.save();
        canvas3.translate(f8, (-this.n) * this.j0);
        if (this.K0 == 0 || (gba.m1 && this.E1 == f8)) {
            wjbVar2 = wjbVar;
            if (getIsPinned() || this.A3) {
                bkb.u0.setColor(bkb.v0(bkb.r9, wjbVar2));
                bkb.u0.setAlpha((int) ((1.0f - this.j0) * r3.getAlpha()));
            }
        } else {
            wjbVar2 = wjbVar;
            float f22 = f;
            bkb.u0.setColor(gl.R0(this.E1, f22, 0, bkb.v0(bkb.r9, wjbVar2)));
            bkb.u0.setAlpha((int) ((f22 - this.j0) * r3.getAlpha()));
        }
        canvas3.restore();
        re3 re3Var4 = this.J4;
        re3Var4.b();
        if (this.D0 != 0.0f) {
            canvas3.save();
            canvas3.translate(0.0f, this.D0);
            f9 = this.D0 + 0.0f;
        } else {
            f9 = 0.0f;
        }
        float f23 = this.j0;
        if (f23 != 1.0f) {
            int i23 = -1;
            if (f23 != 0.0f) {
                float i24 = Utilities.i(f23 / 0.4f, 1.0f, 0.0f);
                if (gba.o() >= 2) {
                    re3Var = re3Var4;
                    f14 = 1.0f;
                    f13 = f6;
                    i12 = -1;
                    i23 = canvas3.saveLayerAlpha(ls6.B(1.0f, i24, gl.L(8.0f), gl.L(dj9.getRightPaddingSize() + 1)), 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) ((1.0f - this.j0) * 255.0f), 31);
                    i11 = 1;
                } else {
                    re3Var = re3Var4;
                    f13 = f6;
                    i12 = -1;
                    f14 = 1.0f;
                    int save = canvas3.save();
                    i11 = 1;
                    canvas3.clipRect(ls6.B(1.0f, i24, gl.L(8.0f), gl.L(dj9.getRightPaddingSize() + 1)), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    i23 = save;
                }
                canvas3.translate((-(getMeasuredWidth() - gl.L(74.0f))) * 0.7f * this.j0, 0.0f);
                f7 += (-(getMeasuredWidth() - gl.L(74.0f))) * 0.7f * this.j0;
            } else {
                re3Var = re3Var4;
                f13 = f6;
                f14 = 1.0f;
                i11 = 1;
                i12 = -1;
            }
            float f24 = f7;
            if (this.x1 != 0.0f || this.p1 != 0.0f) {
                canvas3.save();
                bkb.u0.setColor(bkb.v0(bkb.c6, wjbVar2));
                rectF2.set(getMeasuredWidth() - gl.L(64.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                rectF2.offset(0.0f, -this.F3);
                canvas3.drawRoundRect(rectF2, L2, L2, bkb.u0);
                if (this.r4) {
                    canvas3.drawRoundRect(rectF2, L2, L2, bkb.t0);
                }
                if (this.K0 != 0 && (!gba.m1 || this.E1 != 0.0f)) {
                    bkb.u0.setColor(gl.R0(this.E1, f14, 0, bkb.v0(bkb.r9, wjbVar2)));
                    bkb.u0.setAlpha((int) ((f14 - this.j0) * r0.getAlpha()));
                } else if (getIsPinned() || this.A3) {
                    bkb.u0.setColor(bkb.v0(bkb.r9, wjbVar2));
                    bkb.u0.setAlpha((int) ((f14 - this.j0) * r0.getAlpha()));
                }
                canvas3.restore();
            }
            float f25 = this.x1;
            float f26 = this.p1;
            if (f25 != 0.0f) {
                if (f26 < f14) {
                    float f27 = f26 + 0.10666667f;
                    this.p1 = f27;
                    if (f27 > f14) {
                        this.p1 = f14;
                    }
                    i9 = i11;
                }
                i9 = 0;
            } else {
                if (f26 > 0.0f) {
                    float f28 = f26 - 0.10666667f;
                    this.p1 = f28;
                    if (f28 < 0.0f) {
                        this.p1 = 0.0f;
                    }
                    i9 = i11;
                }
                i9 = 0;
            }
            if (this.H2) {
                hf0.t(this.K2, this.L2, bkb.Z0);
                bkb.Z0.draw(canvas3);
            }
            boolean z20 = this.s2;
            int L3 = gl.L((z20 || gba.l1) ? 10.0f : 14.0f);
            if (((!z20 && !gba.l1) || Z()) && V()) {
                L3 -= gl.L(Z() ? 8.0f : 9.0f);
            }
            if (this.A2 != null) {
                if (!this.E2 || this.B2) {
                    f15 = 24.0f;
                    i13 = i23;
                } else {
                    if (this.D2 && this.F2 == null) {
                        Paint paint = new Paint();
                        this.F2 = paint;
                        paint.setShader(new LinearGradient(0.0f, 0.0f, gl.L(24.0f), 0.0f, new int[]{i12, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        this.F2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    } else if (this.G2 == null) {
                        Paint paint2 = new Paint();
                        this.G2 = paint2;
                        paint2.setShader(new LinearGradient(0.0f, 0.0f, gl.L(24.0f), 0.0f, new int[]{0, i12}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        this.G2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    f15 = 24.0f;
                    i13 = i23;
                    canvas3.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), kk7.d4, 31);
                    int i25 = this.y2;
                    canvas3.clipRect(i25, 0, this.z2 + i25, getMeasuredHeight());
                }
                if (this.K0 != 0) {
                    TextPaint textPaint3 = bkb.A0[this.F0 ? 1 : 0];
                    int v03 = bkb.v0(bkb.X8, wjbVar2);
                    textPaint3.linkColor = v03;
                    textPaint3.setColor(v03);
                } else if (this.i2 != null || ((pe3Var = this.H0) != null && pe3Var.g == 2)) {
                    TextPaint textPaint4 = bkb.A0[this.F0 ? 1 : 0];
                    int v04 = bkb.v0(bkb.Y8, wjbVar2);
                    textPaint4.linkColor = v04;
                    textPaint4.setColor(v04);
                } else {
                    TextPaint textPaint5 = bkb.A0[this.F0 ? 1 : 0];
                    int v05 = bkb.v0(bkb.W8, wjbVar2);
                    textPaint5.linkColor = v05;
                    textPaint5.setColor(v05);
                }
                canvas3.save();
                canvas3.translate(this.y2 + this.C2, L3);
                qla.f(canvas3, this.A2);
                StaticLayout staticLayout3 = this.A2;
                z10 = z20;
                re3Var2 = re3Var;
                i14 = i11;
                gm.drawAnimatedEmojis(canvas3, staticLayout3, this.q3, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, T(0, staticLayout3.getPaint().getColor()));
                canvas3.restore();
                if (this.E2 && !this.B2) {
                    canvas3.save();
                    boolean z21 = this.D2;
                    int i26 = this.y2;
                    if (z21) {
                        canvas3.translate(i26, 0.0f);
                        canvas3.drawRect(0.0f, 0.0f, gl.L(f15), getMeasuredHeight(), this.F2);
                    } else {
                        canvas3.translate((i26 + this.z2) - gl.L(f15), 0.0f);
                        canvas3.drawRect(0.0f, 0.0f, gl.L(f15), getMeasuredHeight(), this.G2);
                    }
                    canvas3.restore();
                    canvas3.restore();
                }
            } else {
                f15 = 24.0f;
                i13 = i23;
                z10 = z20;
                re3Var2 = re3Var;
                i14 = i11;
            }
            if (this.O2 != null && this.K0 == 0) {
                canvas3.save();
                canvas3.translate(this.M2, this.N2);
                TextPaint timeTextPaint = getTimeTextPaint();
                if (getIsPinned()) {
                    canvas3.translate(gl.L(20.0f), 0.0f);
                    float height = (this.O2.getHeight() / f13) - gl.L(8.5f);
                    float f29 = -gl.L(20.0f);
                    float L4 = gl.L(6.0f) + this.O2.getWidth();
                    Drawable drawable = (!this.H3 || W()) ? bkb.j1 : bkb.k1;
                    int L5 = (int) (((gl.L(17.0f) - drawable.getIntrinsicHeight()) / f13) + height);
                    int L6 = gl.L(4.0f) + ((int) f29);
                    drawable.setBounds(L6, L5, drawable.getIntrinsicWidth() + L6, drawable.getIntrinsicHeight() + L5);
                    int alpha = timeTextPaint.getAlpha();
                    timeTextPaint.setAlpha(27);
                    canvas3.drawRoundRect(f29, height, L4, height + gl.L(17.0f), gl.L(8.5f), gl.L(8.5f), timeTextPaint);
                    timeTextPaint.setAlpha(alpha);
                    drawable.draw(canvas3);
                }
                int color = this.O2.getPaint().getColor();
                int i27 = color != timeTextPaint.getColor() ? i14 : 0;
                if (i27 != 0) {
                    this.O2.getPaint().setColor(timeTextPaint.getColor());
                }
                qla.f(canvas3, this.O2);
                if (i27 != 0) {
                    this.O2.getPaint().setColor(color);
                }
                canvas3.restore();
            }
            if (O()) {
                bkb.a1.setBounds(this.P2, ((this.O2.getHeight() - bkb.a1.getIntrinsicHeight()) / 2) + this.N2, bkb.a1.getIntrinsicWidth() + this.P2, bkb.a1.getIntrinsicHeight() + ((this.O2.getHeight() - bkb.a1.getIntrinsicHeight()) / 2) + this.N2);
                bkb.a1.draw(canvas3);
            }
            if (this.t3 != null && !Z()) {
                if (this.K0 != 0) {
                    TextPaint textPaint6 = bkb.F0;
                    int v06 = bkb.v0(bkb.m9, wjbVar2);
                    textPaint6.linkColor = v06;
                    textPaint6.setColor(v06);
                } else if (this.m2 != null) {
                    TextPaint textPaint7 = bkb.F0;
                    int v07 = bkb.v0(bkb.i9, wjbVar2);
                    textPaint7.linkColor = v07;
                    textPaint7.setColor(v07);
                } else {
                    TextPaint textPaint8 = bkb.F0;
                    int v08 = bkb.v0(bkb.l9, wjbVar2);
                    textPaint8.linkColor = v08;
                    textPaint8.setColor(v08);
                }
                canvas3.save();
                canvas3.translate(this.s3, this.r3);
                try {
                    qla.f(canvas3, this.t3);
                    StaticLayout staticLayout4 = this.t3;
                    gm.drawAnimatedEmojis(canvas3, staticLayout4, this.o3, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, T(i14, staticLayout4.getPaint().getColor()));
                } catch (Exception e) {
                    fa4.f(e);
                }
                canvas3.restore();
            }
            if (this.f3 != null) {
                if (this.K0 == 0) {
                    TextPaint textPaint9 = bkb.E0[this.F0 ? 1 : 0];
                    int v09 = bkb.v0(bkb.f9, wjbVar2);
                    textPaint9.linkColor = v09;
                    textPaint9.setColor(v09);
                } else if (this.h2 != null) {
                    TextPaint textPaint10 = bkb.E0[this.F0 ? 1 : 0];
                    int v010 = bkb.v0(bkb.k9, wjbVar2);
                    textPaint10.linkColor = v010;
                    textPaint10.setColor(v010);
                } else {
                    TextPaint textPaint11 = bkb.E0[this.F0 ? 1 : 0];
                    int v011 = bkb.v0(bkb.g9, wjbVar2);
                    textPaint11.linkColor = v011;
                    textPaint11.setColor(v011);
                }
                float L7 = gl.L(14.0f);
                re3 re3Var5 = re3Var2;
                boolean z22 = re3Var5.m;
                int i28 = this.b3;
                float f30 = re3Var5.l;
                float f31 = z22 ? i28 - (f30 * L7) : i28 + (f30 * L7);
                if (((!z10 && !gba.l1) || Z()) && V()) {
                    f31 -= gl.L(Z() ? 10.0f : 11.0f);
                }
                if (re3Var5.l != 1.0f) {
                    canvas3.save();
                    canvas3.translate(this.c3, f31);
                    int alpha2 = this.f3.getPaint().getAlpha();
                    this.f3.getPaint().setAlpha((int) ((1.0f - re3Var5.l) * alpha2));
                    ArrayList arrayList = this.k3;
                    if (arrayList.isEmpty()) {
                        f19 = L7;
                        rectF = rectF2;
                        wjbVar4 = wjbVar2;
                        oe3Var4 = oe3Var3;
                        re3Var3 = re3Var5;
                        i18 = alpha2;
                        f16 = 1.0f;
                        qla.f(canvas3, this.f3);
                        StaticLayout staticLayout5 = this.f3;
                        gm.drawAnimatedEmojis(canvas3, staticLayout5, this.n3, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, T(2, staticLayout5.getPaint().getColor()));
                    } else {
                        try {
                            canvas3.save();
                            qla.d(canvas3, arrayList);
                            qla.f(canvas3, this.f3);
                        } catch (Exception e2) {
                            e = e2;
                            f19 = L7;
                        }
                        try {
                            StaticLayout staticLayout6 = this.f3;
                            try {
                                oe3Var4 = oe3Var3;
                                i18 = alpha2;
                                f19 = L7;
                                wjbVar4 = wjbVar2;
                                f16 = 1.0f;
                                rectF = rectF2;
                                re3Var3 = re3Var5;
                            } catch (Exception e3) {
                                e = e3;
                                f19 = L7;
                                rectF = rectF2;
                                wjbVar4 = wjbVar2;
                                oe3Var4 = oe3Var3;
                                re3Var3 = re3Var5;
                                i18 = alpha2;
                                f16 = 1.0f;
                                fa4.f(e);
                                this.f3.getPaint().setAlpha(i18);
                                canvas3.restore();
                                canvas3.save();
                                boolean z23 = re3Var3.m;
                                int i29 = this.b3;
                                float f32 = re3Var3.l;
                                if (!z23) {
                                }
                                if (!z10) {
                                    A -= gl.L(Z() ? 10.0f : 11.0f);
                                    canvas3.translate(this.e3, A);
                                    staticLayout2 = this.g3;
                                    if (staticLayout2 != null) {
                                        int alpha3 = staticLayout2.getPaint().getAlpha();
                                        this.g3.getPaint().setAlpha((int) (alpha3 * re3Var3.l));
                                        this.g3.draw(canvas3);
                                        this.g3.getPaint().setAlpha(alpha3);
                                    }
                                    canvas3.restore();
                                    if (this.g3 != null) {
                                        canvas3.save();
                                        t0.b(bm2.o(bkb.u0(bkb.o9), (int) (Color.alpha(r4) * re3Var3.l)));
                                        boolean z24 = re3Var3.m;
                                        int i30 = this.b3;
                                        float f33 = re3Var3.l;
                                        if (!z24) {
                                        }
                                        if (!z10) {
                                            A2 -= gl.L(Z() ? 10.0f : 11.0f);
                                            if (i17 != 1) {
                                            }
                                            canvas3.translate(this.D4, A2 + (i17 == 1 ? gl.L(f16) : 0));
                                            t0.draw(canvas3);
                                            invalidate();
                                            canvas3.restore();
                                        }
                                        A2 -= gl.L(Z() ? 10.0f : 11.0f);
                                        if (i17 != 1) {
                                        }
                                        canvas3.translate(this.D4, A2 + (i17 == 1 ? gl.L(f16) : 0));
                                        t0.draw(canvas3);
                                        invalidate();
                                        canvas3.restore();
                                    }
                                    if (this.i3 != null) {
                                    }
                                    if (this.K0 == 0) {
                                    }
                                    float f34 = 12.5f;
                                    if (ue3Var3.l4) {
                                    }
                                    wjbVar3 = wjbVar4;
                                    if (ue3Var3.c1) {
                                    }
                                    if (ue3Var3.k1 != 2) {
                                    }
                                    i7 = 17;
                                    if (!ue3Var3.k4) {
                                    }
                                    z4 = z11 ? 1 : 0;
                                    if (!ue3Var3.z3) {
                                    }
                                    if (!k96.a0) {
                                    }
                                    bkb.Y0.setAlpha((int) (ue3Var3.y3 * 255.0f));
                                    hf0.t(ue3Var3.E3, ue3Var3.D3, bkb.Y0);
                                    bkb.Y0.draw(canvas3);
                                    float f35 = ue3Var3.T3.e;
                                    if (ue3Var3.u3) {
                                    }
                                    ue3Var = ue3Var3;
                                    f10 = f16;
                                    if (ue3Var.I3) {
                                    }
                                    if (ue3Var.S1 > 0) {
                                    }
                                    wtcVar = ue3Var.u0;
                                    if (wtcVar != null) {
                                    }
                                    i15 = i13;
                                    r12 = z11;
                                    if (i15 != -1) {
                                    }
                                    z5 = ue3Var.c2;
                                    imageReceiver = ue3Var.Z1;
                                    if (z5) {
                                    }
                                    z6 = ue3Var.y;
                                    me3Var = ue3Var.v0;
                                    if (z6) {
                                        if (!ue3Var.E) {
                                        }
                                        if (!ue3Var.P0) {
                                            float centerX = me3Var.F.centerX() + gl.L(20.33f);
                                            float centerY = me3Var.F.centerY() + gl.L(19.0f);
                                            sk0Var = ue3Var.E0;
                                            if (sk0Var == null) {
                                            }
                                            kq3.d(sk0Var, centerX, centerY, i7);
                                            canvas3.drawCircle(ue3Var.E0.getBounds().exactCenterX(), ue3Var.E0.getBounds().exactCenterY(), gl.L(8.0f), bkb.l0(bkb.v0(bkb.c6, wjbVar3)));
                                            ue3Var.E0.draw(canvas3);
                                        }
                                    }
                                    if (ue3Var.c2) {
                                    }
                                    if (imageReceiver.R0) {
                                        i9 = 1;
                                    }
                                    if (ue3Var.j0 > 0.0f) {
                                    }
                                    ue3Var2 = ue3Var;
                                    if (ue3Var2.D0 != 0.0f) {
                                    }
                                    if (ue3Var2.x1 != 0.0f) {
                                    }
                                    if (z2) {
                                        canvas3.save();
                                        canvas3.translate(0.0f, (-ue3Var2.F3) - (ue3Var2.n * ue3Var2.j0));
                                        canvas3.clipRect(0.0f, (f10 - ue3Var2.f2.J) * ue3Var2.getMeasuredHeight(), ue3Var2.getMeasuredWidth(), ue3Var2.getMeasuredHeight());
                                        ue3Var2.f2.c(canvas3, r12);
                                        canvas3.restore();
                                    }
                                    if (ue3Var2.t2) {
                                    }
                                    f11 = 0.0f;
                                    i10 = 1;
                                    if (ue3Var2.u1 != f11) {
                                    }
                                    canvas2 = canvas;
                                    if (z17) {
                                    }
                                    z7 = ue3Var2.z3;
                                    if (!z7) {
                                    }
                                    float f36 = ue3Var2.y3;
                                    if (!z7) {
                                    }
                                }
                                A -= gl.L(Z() ? 10.0f : 11.0f);
                                canvas3.translate(this.e3, A);
                                staticLayout2 = this.g3;
                                if (staticLayout2 != null) {
                                }
                                canvas3.restore();
                                if (this.g3 != null) {
                                }
                                if (this.i3 != null) {
                                }
                                if (this.K0 == 0) {
                                }
                                float f342 = 12.5f;
                                if (ue3Var3.l4) {
                                }
                                wjbVar3 = wjbVar4;
                                if (ue3Var3.c1) {
                                }
                                if (ue3Var3.k1 != 2) {
                                }
                                i7 = 17;
                                if (!ue3Var3.k4) {
                                }
                                z4 = z11 ? 1 : 0;
                                if (!ue3Var3.z3) {
                                }
                                if (!k96.a0) {
                                }
                                bkb.Y0.setAlpha((int) (ue3Var3.y3 * 255.0f));
                                hf0.t(ue3Var3.E3, ue3Var3.D3, bkb.Y0);
                                bkb.Y0.draw(canvas3);
                                float f352 = ue3Var3.T3.e;
                                if (ue3Var3.u3) {
                                }
                                ue3Var = ue3Var3;
                                f10 = f16;
                                if (ue3Var.I3) {
                                }
                                if (ue3Var.S1 > 0) {
                                }
                                wtcVar = ue3Var.u0;
                                if (wtcVar != null) {
                                }
                                i15 = i13;
                                r12 = z11;
                                if (i15 != -1) {
                                }
                                z5 = ue3Var.c2;
                                imageReceiver = ue3Var.Z1;
                                if (z5) {
                                }
                                z6 = ue3Var.y;
                                me3Var = ue3Var.v0;
                                if (z6) {
                                }
                                if (ue3Var.c2) {
                                }
                                if (imageReceiver.R0) {
                                }
                                if (ue3Var.j0 > 0.0f) {
                                }
                                ue3Var2 = ue3Var;
                                if (ue3Var2.D0 != 0.0f) {
                                }
                                if (ue3Var2.x1 != 0.0f) {
                                }
                                if (z2) {
                                }
                                if (ue3Var2.t2) {
                                }
                                f11 = 0.0f;
                                i10 = 1;
                                if (ue3Var2.u1 != f11) {
                                }
                                canvas2 = canvas;
                                if (z17) {
                                }
                                z7 = ue3Var2.z3;
                                if (!z7) {
                                }
                                float f362 = ue3Var2.y3;
                                if (!z7) {
                                }
                            }
                            try {
                                gm.drawAnimatedEmojis(canvas3, staticLayout6, this.n3, -0.075f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, T(2, staticLayout6.getPaint().getColor()));
                                canvas3.restore();
                                for (int i31 = 0; i31 < arrayList.size(); i31++) {
                                    qla qlaVar = (qla) arrayList.get(i31);
                                    qlaVar.h(this.f3.getPaint().getColor());
                                    qlaVar.draw(canvas3);
                                }
                            } catch (Exception e4) {
                                e = e4;
                                fa4.f(e);
                                this.f3.getPaint().setAlpha(i18);
                                canvas3.restore();
                                canvas3.save();
                                boolean z232 = re3Var3.m;
                                int i292 = this.b3;
                                float f322 = re3Var3.l;
                                if (!z232) {
                                }
                                if (!z10) {
                                }
                                A -= gl.L(Z() ? 10.0f : 11.0f);
                                canvas3.translate(this.e3, A);
                                staticLayout2 = this.g3;
                                if (staticLayout2 != null) {
                                }
                                canvas3.restore();
                                if (this.g3 != null) {
                                }
                                if (this.i3 != null) {
                                }
                                if (this.K0 == 0) {
                                }
                                float f3422 = 12.5f;
                                if (ue3Var3.l4) {
                                }
                                wjbVar3 = wjbVar4;
                                if (ue3Var3.c1) {
                                }
                                if (ue3Var3.k1 != 2) {
                                }
                                i7 = 17;
                                if (!ue3Var3.k4) {
                                }
                                z4 = z11 ? 1 : 0;
                                if (!ue3Var3.z3) {
                                }
                                if (!k96.a0) {
                                }
                                bkb.Y0.setAlpha((int) (ue3Var3.y3 * 255.0f));
                                hf0.t(ue3Var3.E3, ue3Var3.D3, bkb.Y0);
                                bkb.Y0.draw(canvas3);
                                float f3522 = ue3Var3.T3.e;
                                if (ue3Var3.u3) {
                                }
                                ue3Var = ue3Var3;
                                f10 = f16;
                                if (ue3Var.I3) {
                                }
                                if (ue3Var.S1 > 0) {
                                }
                                wtcVar = ue3Var.u0;
                                if (wtcVar != null) {
                                }
                                i15 = i13;
                                r12 = z11;
                                if (i15 != -1) {
                                }
                                z5 = ue3Var.c2;
                                imageReceiver = ue3Var.Z1;
                                if (z5) {
                                }
                                z6 = ue3Var.y;
                                me3Var = ue3Var.v0;
                                if (z6) {
                                }
                                if (ue3Var.c2) {
                                }
                                if (imageReceiver.R0) {
                                }
                                if (ue3Var.j0 > 0.0f) {
                                }
                                ue3Var2 = ue3Var;
                                if (ue3Var2.D0 != 0.0f) {
                                }
                                if (ue3Var2.x1 != 0.0f) {
                                }
                                if (z2) {
                                }
                                if (ue3Var2.t2) {
                                }
                                f11 = 0.0f;
                                i10 = 1;
                                if (ue3Var2.u1 != f11) {
                                }
                                canvas2 = canvas;
                                if (z17) {
                                }
                                z7 = ue3Var2.z3;
                                if (!z7) {
                                }
                                float f3622 = ue3Var2.y3;
                                if (!z7) {
                                }
                            }
                        } catch (Exception e5) {
                            e = e5;
                            f19 = L7;
                            rectF = rectF2;
                            wjbVar4 = wjbVar2;
                            oe3Var4 = oe3Var3;
                            re3Var3 = re3Var5;
                            i18 = alpha2;
                            f16 = 1.0f;
                            fa4.f(e);
                            this.f3.getPaint().setAlpha(i18);
                            canvas3.restore();
                            canvas3.save();
                            boolean z2322 = re3Var3.m;
                            int i2922 = this.b3;
                            float f3222 = re3Var3.l;
                            if (!z2322) {
                            }
                            if (!z10) {
                            }
                            A -= gl.L(Z() ? 10.0f : 11.0f);
                            canvas3.translate(this.e3, A);
                            staticLayout2 = this.g3;
                            if (staticLayout2 != null) {
                            }
                            canvas3.restore();
                            if (this.g3 != null) {
                            }
                            if (this.i3 != null) {
                            }
                            if (this.K0 == 0) {
                            }
                            float f34222 = 12.5f;
                            if (ue3Var3.l4) {
                            }
                            wjbVar3 = wjbVar4;
                            if (ue3Var3.c1) {
                            }
                            if (ue3Var3.k1 != 2) {
                            }
                            i7 = 17;
                            if (!ue3Var3.k4) {
                            }
                            z4 = z11 ? 1 : 0;
                            if (!ue3Var3.z3) {
                            }
                            if (!k96.a0) {
                            }
                            bkb.Y0.setAlpha((int) (ue3Var3.y3 * 255.0f));
                            hf0.t(ue3Var3.E3, ue3Var3.D3, bkb.Y0);
                            bkb.Y0.draw(canvas3);
                            float f35222 = ue3Var3.T3.e;
                            if (ue3Var3.u3) {
                            }
                            ue3Var = ue3Var3;
                            f10 = f16;
                            if (ue3Var.I3) {
                            }
                            if (ue3Var.S1 > 0) {
                            }
                            wtcVar = ue3Var.u0;
                            if (wtcVar != null) {
                            }
                            i15 = i13;
                            r12 = z11;
                            if (i15 != -1) {
                            }
                            z5 = ue3Var.c2;
                            imageReceiver = ue3Var.Z1;
                            if (z5) {
                            }
                            z6 = ue3Var.y;
                            me3Var = ue3Var.v0;
                            if (z6) {
                            }
                            if (ue3Var.c2) {
                            }
                            if (imageReceiver.R0) {
                            }
                            if (ue3Var.j0 > 0.0f) {
                            }
                            ue3Var2 = ue3Var;
                            if (ue3Var2.D0 != 0.0f) {
                            }
                            if (ue3Var2.x1 != 0.0f) {
                            }
                            if (z2) {
                            }
                            if (ue3Var2.t2) {
                            }
                            f11 = 0.0f;
                            i10 = 1;
                            if (ue3Var2.u1 != f11) {
                            }
                            canvas2 = canvas;
                            if (z17) {
                            }
                            z7 = ue3Var2.z3;
                            if (!z7) {
                            }
                            float f36222 = ue3Var2.y3;
                            if (!z7) {
                            }
                        }
                    }
                    this.f3.getPaint().setAlpha(i18);
                    canvas3.restore();
                } else {
                    f19 = L7;
                    rectF = rectF2;
                    wjbVar4 = wjbVar2;
                    oe3Var4 = oe3Var3;
                    re3Var3 = re3Var5;
                    f16 = 1.0f;
                }
                canvas3.save();
                boolean z23222 = re3Var3.m;
                int i29222 = this.b3;
                float f32222 = re3Var3.l;
                A = !z23222 ? tb4.A(f16, f32222, f19, i29222) : ls6.B(f16, f32222, f19, i29222);
                if (((!z10 && !gba.l1) || Z()) && V()) {
                    A -= gl.L(Z() ? 10.0f : 11.0f);
                }
                canvas3.translate(this.e3, A);
                staticLayout2 = this.g3;
                if (staticLayout2 != null && re3Var3.l > 0.0f) {
                    int alpha32 = staticLayout2.getPaint().getAlpha();
                    this.g3.getPaint().setAlpha((int) (alpha32 * re3Var3.l));
                    this.g3.draw(canvas3);
                    this.g3.getPaint().setAlpha(alpha32);
                }
                canvas3.restore();
                if (this.g3 != null && (((i17 = this.k2) >= 0 || (re3Var3.l > 0.0f && (i17 = re3Var3.n) >= 0)) && (t0 = bkb.t0(i17)) != null)) {
                    canvas3.save();
                    t0.b(bm2.o(bkb.u0(bkb.o9), (int) (Color.alpha(r4) * re3Var3.l)));
                    boolean z242 = re3Var3.m;
                    int i302 = this.b3;
                    float f332 = re3Var3.l;
                    A2 = !z242 ? tb4.A(f16, f332, f19, i302) : ls6.B(f16, f332, f19, i302);
                    if (((!z10 && !gba.l1) || Z()) && V()) {
                        A2 -= gl.L(Z() ? 10.0f : 11.0f);
                    }
                    if (i17 != 1 || i17 == 4) {
                        canvas3.translate(this.D4, A2 + (i17 == 1 ? gl.L(f16) : 0));
                    } else {
                        canvas3.translate(this.D4, ((gl.L(18.0f) - t0.getIntrinsicHeight()) / f13) + A2);
                    }
                    t0.draw(canvas3);
                    invalidate();
                    canvas3.restore();
                }
            } else {
                rectF = rectF2;
                wjbVar4 = wjbVar2;
                oe3Var4 = oe3Var3;
                re3Var3 = re3Var2;
                f16 = 1.0f;
            }
            if (this.i3 != null) {
                canvas3.save();
                if (this.c0 == null) {
                    this.c0 = new Paint(1);
                }
                ra1 ra1Var = this.d0;
                if (ra1Var == null) {
                    ra1Var = new ra1(this);
                    this.d0 = ra1Var;
                    z15 = false;
                    final boolean z25 = false ? 1 : 0;
                    ra1Var.h = new Runnable(this) { // from class: le3
                        public final /* synthetic */ ue3 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b = z25;
                            ue3 ue3Var4 = this.b;
                            switch (b) {
                                case 0:
                                    qe3 qe3Var = ue3Var4.e0;
                                    if (qe3Var != null) {
                                        qe3Var.o(ue3Var4);
                                        break;
                                    }
                                    break;
                                default:
                                    qe3 qe3Var2 = ue3Var4.e0;
                                    if (qe3Var2 != null) {
                                        qe3Var2.w(ue3Var4);
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    final byte b = 1;
                    Runnable runnable = new Runnable(this) { // from class: le3
                        public final /* synthetic */ ue3 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b2 = b;
                            ue3 ue3Var4 = this.b;
                            switch (b2) {
                                case 0:
                                    qe3 qe3Var = ue3Var4.e0;
                                    if (qe3Var != null) {
                                        qe3Var.o(ue3Var4);
                                        break;
                                    }
                                    break;
                                default:
                                    qe3 qe3Var2 = ue3Var4.e0;
                                    if (qe3Var2 != null) {
                                        qe3Var2.w(ue3Var4);
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    ra1Var.l = true;
                    ra1Var.j = runnable;
                } else {
                    z15 = false;
                }
                if (this.g0 && this.N4 != 0 && ((i16 = this.k1) == 0 || i16 == 7 || i16 == 8)) {
                    int o = bm2.o(this.b0.getColor(), bkb.h1() ? 36 : 26);
                    ra1Var.g.setColor(o);
                    ff0 ff0Var = ra1Var.e;
                    if (ff0Var != null) {
                        bkb.F1(ff0Var, o, true);
                    }
                    ra1 ra1Var2 = this.d0;
                    ra1Var2.i = z15;
                    ra1Var2.c = z15 ? 1 : 0;
                    int i32 = this.N4;
                    if (i32 != 0 && i32 > 0) {
                        float f37 = this.b3;
                        if (((!z10 && !gba.l1) || Z()) && V()) {
                            f37 -= gl.L(Z() ? 10.0f : 11.0f);
                        }
                        RectF rectF3 = gl.P;
                        float primaryHorizontal = this.f3.getPrimaryHorizontal(z15 ? 1 : 0) + gl.L(f13) + this.c3;
                        float f38 = this.c3;
                        StaticLayout staticLayout7 = this.f3;
                        rectF3.set(primaryHorizontal, f37, (staticLayout7.getPrimaryHorizontal(Math.min(staticLayout7.getText().length(), this.N4)) + f38) - gl.L(3.0f), this.h3 - gl.L(4.0f));
                        rectF3.inset(-gl.L(8.0f), -gl.L(4.0f));
                        if (rectF3.right > rectF3.left) {
                            this.d0.a(rectF3);
                        }
                    }
                    float lineLeft = this.i3.getLineLeft(z15 ? 1 : 0);
                    RectF rectF4 = gl.P;
                    rectF4.set(this.d3 + lineLeft + gl.L(f13), gl.L(f13) + this.h3, this.i3.getLineWidth(z15 ? 1 : 0) + this.d3 + lineLeft + gl.L(12.0f), this.i3.getHeight() + this.h3);
                    rectF4.inset(-gl.L(8.0f), -gl.L(3.0f));
                    this.d0.a(rectF4);
                    ra1 ra1Var3 = this.d0;
                    ra1Var3.c(canvas3, ra1Var3.g);
                    ff0 ff0Var2 = ra1Var3.e;
                    if (ff0Var2 != null) {
                        ff0Var2.draw(canvas3);
                    }
                    bkb.s1.setAlpha(kk7.I1);
                    hf0.u(bkb.s1, rectF4.right - gl.L(18.0f), oo1.z(rectF4.height(), bkb.s1.getIntrinsicHeight(), f13, rectF4.top));
                    bkb.s1.draw(canvas3);
                }
                canvas3.translate(this.d3, this.h3);
                ArrayList arrayList2 = this.m3;
                if (arrayList2.isEmpty()) {
                    qla.f(canvas3, this.i3);
                    StaticLayout staticLayout8 = this.i3;
                    gm.drawAnimatedEmojis(canvas3, staticLayout8, this.p3, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, T(3, staticLayout8.getPaint().getColor()));
                } else {
                    try {
                        canvas3.save();
                        qla.d(canvas3, arrayList2);
                        qla.f(canvas3, this.i3);
                        StaticLayout staticLayout9 = this.i3;
                        gm.drawAnimatedEmojis(canvas3, staticLayout9, this.p3, -0.075f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, T(3, staticLayout9.getPaint().getColor()));
                        canvas3.restore();
                        for (int i33 = z15 ? 1 : 0; i33 < arrayList2.size(); i33++) {
                            qla qlaVar2 = (qla) arrayList2.get(i33);
                            qlaVar2.h(this.i3.getPaint().getColor());
                            qlaVar2.draw(canvas3);
                        }
                    } catch (Exception e6) {
                        fa4.f(e6);
                    }
                }
                canvas.restore();
                z11 = z15;
            } else {
                z11 = false;
            }
            if (this.K0 == 0) {
                int i34 = (this.T2 ? 1 : 0) + (this.R2 ? 2 : z11 ? 1 : 0) + (this.S2 ? 4 : z11 ? 1 : 0);
                int i35 = this.y4;
                if (i35 >= 0 && i35 != i34 && !this.A4) {
                    J(i35, i34);
                }
                boolean z26 = this.A4;
                if (z26) {
                    i34 = this.w4;
                }
                boolean z27 = (i34 & 1) != 0 ? true : z11 ? 1 : 0;
                boolean z28 = (i34 & 2) != 0 ? true : z11 ? 1 : 0;
                boolean z29 = (i34 & 4) != 0 ? true : z11 ? 1 : 0;
                if (z26) {
                    int i36 = this.x4;
                    boolean z30 = (i36 & 1) != 0 ? true : z11 ? 1 : 0;
                    boolean z31 = (i36 & 2) != 0 ? true : z11 ? 1 : 0;
                    i8 = 4;
                    if ((i36 & 4) != 0) {
                        z13 = z29;
                        z14 = true;
                    } else {
                        z13 = z29;
                        z14 = z11 ? 1 : 0;
                    }
                    if (z27 || z30 || !z14 || z31 || !z28 || !z13) {
                        L(canvas, z30, z31, z14, false, f16 - this.z4);
                        L(canvas, z27, z28, z13, false, this.z4);
                    } else {
                        L(canvas, z27, z28, z13, true, this.z4);
                    }
                    ue3Var3 = this;
                    canvas3 = canvas;
                } else {
                    i8 = 4;
                    canvas3 = canvas;
                    L(canvas3, z27, z28, z29, false, 1.0f);
                    ue3Var3 = this;
                }
                ue3Var3.y4 = (ue3Var3.T2 ? 1 : 0) + (ue3Var3.R2 ? 2 : z11 ? 1 : 0) + (ue3Var3.S2 ? i8 : z11 ? 1 : 0);
            } else {
                canvas3 = canvas;
                ue3Var3 = this;
                i8 = 4;
            }
            float f342222 = 12.5f;
            if (ue3Var3.l4) {
                int L8 = gl.L((z10 || gba.l1) ? 12.5f : 15.5f);
                if (((!z10 && !gba.l1) || ue3Var3.Z()) && ue3Var3.V()) {
                    L8 -= gl.L(9.0f);
                }
                tl tlVar = ue3Var3.p4;
                if (tlVar != null) {
                    tlVar.setBounds(ue3Var3.y2 - gl.L(19.0f), gl.L(-1.0f) + L8, ue3Var3.y2 - gl.L(2.0f), gl.L(16.0f) + L8);
                    wjbVar3 = wjbVar4;
                    tlVar.k(Integer.valueOf(bkb.v0(bkb.y9, wjbVar3)));
                    tlVar.draw(canvas3);
                    boolean z32 = (!ue3Var3.c1 || ue3Var3.a1 || ue3Var3.R0) ? true : z11 ? 1 : 0;
                    if (ue3Var3.k1 != 2 || ((!z32 && ue3Var3.d1 <= 0.0f) || ue3Var3.k4 || ue3Var3.q4 != 0)) {
                        i7 = 17;
                    } else {
                        float f39 = ue3Var3.d1;
                        if (z32) {
                            if (f39 != f16) {
                                float f40 = f39 + 0.10666667f;
                                ue3Var3.d1 = f40;
                                if (f40 > f16) {
                                    ue3Var3.d1 = f16;
                                } else {
                                    ue3Var3.invalidate();
                                }
                            }
                        } else if (f39 != 0.0f) {
                            float f41 = f39 - 0.10666667f;
                            ue3Var3.d1 = f41;
                            if (f41 < 0.0f) {
                                ue3Var3.d1 = 0.0f;
                            } else {
                                ue3Var3.invalidate();
                            }
                        }
                        float L9 = (ue3Var3.m4 ? ue3Var3.J2 : ue3Var3.I2) - gl.L((z10 || gba.l1) ? 0.0f : f16);
                        float L10 = gl.L(gba.l1 ? 13.5f : 17.5f);
                        if (((!z10 && !gba.l1) || ue3Var3.Z()) && ue3Var3.V()) {
                            L10 -= gl.L(ue3Var3.Z() ? 8.0f : 9.0f);
                        }
                        hf0.u(bkb.b1, L9, L10);
                        hf0.u(bkb.c1, L9, L10);
                        i7 = 17;
                        kq3.d(bkb.d1, bkb.b1.getBounds().exactCenterX() + gl.L(2.0f), bkb.b1.getBounds().exactCenterY(), 17);
                        if (ue3Var3.d1 != f16) {
                            canvas3.save();
                            float f42 = ue3Var3.d1;
                            canvas3.scale(f42, f42, bkb.b1.getBounds().centerX(), bkb.b1.getBounds().centerY());
                            if (ue3Var3.R0) {
                                bkb.d1.setAlpha((int) (ue3Var3.d1 * 255.0f));
                                bkb.d1.draw(canvas3);
                                bkb.d1.setAlpha(kk7.d4);
                            } else if (ue3Var3.c1) {
                                bkb.c1.setAlpha((int) (ue3Var3.d1 * 255.0f));
                                bkb.c1.draw(canvas3);
                                bkb.c1.setAlpha(kk7.d4);
                            } else {
                                bkb.b1.setAlpha((int) (ue3Var3.d1 * 255.0f));
                                bkb.b1.draw(canvas3);
                                bkb.b1.setAlpha(kk7.d4);
                            }
                            canvas3.restore();
                        } else if (ue3Var3.R0) {
                            bkb.d1.draw(canvas3);
                        } else if (ue3Var3.c1) {
                            bkb.c1.draw(canvas3);
                        } else {
                            bkb.b1.draw(canvas3);
                        }
                    }
                    if (!ue3Var3.k4) {
                        float L11 = gl.L((z10 || gba.l1) ? 13.5f : 16.5f);
                        if (((!z10 && !gba.l1) || ue3Var3.Z()) && ue3Var3.V()) {
                            L11 -= gl.L(9.0f);
                        }
                        hf0.u(bkb.e1, ue3Var3.I2 - gl.L(f16), L11);
                        hf0.u(bkb.h1, ue3Var3.I2 - gl.L(f16), L11);
                        bkb.e1.draw(canvas3);
                        bkb.h1.draw(canvas3);
                        sbVar2 = sbVar;
                    } else if (ue3Var3.m4) {
                        int L12 = gl.L((z10 || gba.l1) ? 12.5f : 15.5f);
                        if (((!z10 && !gba.l1) || ue3Var3.Z()) && ue3Var3.V()) {
                            L12 -= gl.L(9.0f);
                        }
                        tl tlVar2 = ue3Var3.o4;
                        if (tlVar2 != null) {
                            sbVar2 = sbVar;
                            sbVar2.setTranslationX((f24 + ue3Var3.I2) - gl.L(2.0f));
                            sbVar2.setTranslationY((f9 + L12) - gl.L(4.0f));
                            if (ue3Var3.j0 > 0.0f) {
                                tlVar2.setBounds(ue3Var3.I2 - gl.L(2.0f), L12 - gl.L(4.0f), gl.L(20.0f) + ue3Var3.I2, gl.L(22.0f) + (L12 - gl.L(4.0f)));
                                tlVar2.draw(canvas3);
                                z12 = z11 ? 1 : 0;
                            } else {
                                z12 = true;
                            }
                            tlVar2.k(Integer.valueOf(bkb.v0(bkb.y9, wjbVar3)));
                        } else {
                            sbVar2 = sbVar;
                            Drawable drawable2 = nh8.d().e;
                            int L13 = ue3Var3.I2 - gl.L(f16);
                            if (!z10 && !gba.l1) {
                                f342222 = 15.5f;
                            }
                            hf0.t(L13, gl.L(f342222), drawable2);
                            drawable2.draw(canvas3);
                            z12 = z11 ? 1 : 0;
                        }
                        z4 = z12;
                        if (!ue3Var3.z3 || ue3Var3.y3 != 0.0f) {
                            if (!k96.a0) {
                                Paint paintReorderGradient = ue3Var3.getPaintReorderGradient();
                                paintReorderGradient.setAlpha((int) (ue3Var3.y3 * 255.0f));
                                canvas3.save();
                                canvas3.translate(ue3Var3.E3 - gl.L(f15), ue3Var3.D3);
                                float f43 = f15;
                                canvas.drawRect(0.0f, 0.0f, de9.f(f43, ue3Var3.E3, ue3Var3.getMeasuredWidth()), gl.L(f43), paintReorderGradient);
                                canvas3 = canvas;
                                canvas3.restore();
                            }
                            bkb.Y0.setAlpha((int) (ue3Var3.y3 * 255.0f));
                            hf0.t(ue3Var3.E3, ue3Var3.D3, bkb.Y0);
                            bkb.Y0.draw(canvas3);
                        }
                        float f352222 = ue3Var3.T3.e;
                        if (ue3Var3.u3) {
                            bkb.X0.setAlpha((int) ((f16 - ue3Var3.y3) * 255.0f));
                            RectF rectF5 = rectF;
                            rectF5.set(ue3Var3.w3, ue3Var3.v3, gl.L(20.666f) + r0, gl.L(20.666f) + ue3Var3.v3);
                            float f44 = gl.p * 10.5f;
                            canvas3.drawRoundRect(rectF5, f44, f44, bkb.w0);
                            hf0.t(gl.L(4.5f) + ue3Var3.w3, gl.L(5.0f) + ue3Var3.v3, bkb.X0);
                            bkb.X0.draw(canvas3);
                        } else {
                            RectF rectF6 = rectF;
                            if (((ue3Var3.H3 || ue3Var3.c4) && ue3Var3.M3) || ue3Var3.W3 != f16 || ue3Var3.d4 || ue3Var3.X3 != f16 || ue3Var3.e4 || f352222 > 0.0f) {
                                boolean W = ue3Var3.W();
                                canvas3 = canvas;
                                f10 = f16;
                                M(canvas3, W, ue3Var3.N3, ue3Var3.O3, ue3Var3.R3, 1.0f, false);
                                ue3Var = this;
                                if (ue3Var.c4) {
                                    bkb.v0.setAlpha((int) ((f10 - ue3Var.y3) * 255.0f));
                                    if (ue3Var.j4 != null) {
                                        rectF6.set(ue3Var.f4, ue3Var.N3, gl.L(12.666f) + r1 + ue3Var.i4, gl.L(20.666f) + ue3Var.N3);
                                        canvas3.drawRoundRect(rectF6, rectF6.height() / 2.0f, rectF6.height() / 2.0f, (!W || ue3Var.l1 == 0) ? bkb.v0 : bkb.x0);
                                        bkb.L0.setAlpha((int) ((f10 - ue3Var.y3) * 255.0f));
                                        canvas3.save();
                                        canvas3.translate(gl.L(6.333f) + ue3Var.f4, gl.L(4.0f) + ue3Var.N3);
                                        ue3Var.j4.draw(canvas3);
                                        canvas3.restore();
                                    } else {
                                        Drawable drawable3 = bkb.l1;
                                        drawable3.setAlpha((int) ((f10 - ue3Var.y3) * 255.0f));
                                        kq3.d(drawable3, gl.L(10.333f) + ue3Var.f4, gl.L(10.333f) + ue3Var.N3, i7);
                                        drawable3.draw(canvas3);
                                    }
                                }
                                if (ue3Var.d4 || ue3Var.X3 != f10) {
                                    f17 = 10.333f;
                                    rectF6.set(ue3Var.g4, ue3Var.N3, gl.L(20.666f) + r1, gl.L(20.666f) + ue3Var.N3);
                                    float f45 = ue3Var.X3;
                                    if (f45 == f10) {
                                        f45 = f10;
                                    } else if (!ue3Var.d4) {
                                        f45 = f10 - f45;
                                    }
                                    Drawable drawable4 = W ? bkb.p1 : bkb.m1;
                                    drawable4.setAlpha((int) ((f10 - ue3Var.y3) * 255.0f));
                                    kq3.d(drawable4, gl.L(10.333f) + r1, gl.L(10.333f) + ue3Var.N3, i7);
                                    kq3.b(canvas3, drawable4, f45);
                                } else {
                                    f17 = 10.333f;
                                }
                                if ((ue3Var.e4 || f352222 > 0.0f) && f352222 != 0.0f) {
                                    rectF6.set(ue3Var.h4, ue3Var.N3, gl.L(20.666f) + r1, gl.L(20.666f) + ue3Var.N3);
                                    Drawable drawable5 = W ? bkb.q1 : bkb.n1;
                                    drawable5.setAlpha((int) ((f10 - ue3Var.y3) * 255.0f));
                                    kq3.d(drawable5, gl.L(f17) + r1, gl.L(f17) + ue3Var.N3, i7);
                                    kq3.b(canvas3, drawable5, f352222);
                                }
                                if (ue3Var.I3) {
                                    if (ue3Var.K3 == null) {
                                        ue3Var.K3 = (LayerDrawable) ue3Var.getContext().getDrawable(R.drawable.dialog_gram_transfer).mutate();
                                    }
                                    int v012 = bkb.v0(ue3Var.W() ? bkb.U8 : bkb.T8, wjbVar3);
                                    if (ue3Var.L3 != v012) {
                                        Drawable drawable6 = ue3Var.K3.getDrawable(z11 ? 1 : 0);
                                        ue3Var.L3 = v012;
                                        drawable6.setColorFilter(new PorterDuffColorFilter(v012, PorterDuff.Mode.SRC_IN));
                                    }
                                    int L14 = ((gl.L(20.666f) - gl.L(28.0f)) / 2) + ue3Var.N3;
                                    LayerDrawable layerDrawable = ue3Var.K3;
                                    int i37 = ue3Var.J3;
                                    layerDrawable.setBounds(i37, L14, gl.L(28.0f) + i37, gl.L(28.0f) + L14);
                                    ue3Var.K3.setAlpha((int) ((f10 - ue3Var.y3) * 255.0f));
                                    ue3Var.K3.draw(canvas3);
                                }
                                if (ue3Var.S1 > 0) {
                                    float f46 = re3Var3.l;
                                    if (f46 != f10) {
                                        if (f46 > 0.0f) {
                                            canvas.saveLayerAlpha(0.0f, 0.0f, ue3Var.getWidth(), ue3Var.getHeight(), (int) ((f10 - f46) * 255.0f), 31);
                                            canvas3 = canvas;
                                            if (re3Var3.m) {
                                                L = -gl.L(14.0f);
                                                f18 = re3Var3.l;
                                            } else {
                                                L = gl.L(14.0f);
                                                f18 = re3Var3.l;
                                            }
                                            canvas3.translate(0.0f, L * f18);
                                        }
                                        for (int i38 = z11 ? 1 : 0; i38 < ue3Var.S1; i38++) {
                                            if (ue3Var.V1[i38]) {
                                                if (ue3Var.U1 == null) {
                                                    Paint paint3 = new Paint(1);
                                                    ue3Var.U1 = paint3;
                                                    paint3.setShadowLayer(gl.L(1.34f), 0.0f, gl.L(0.34f), 402653184);
                                                    ue3Var.U1.setColor(z11 ? 1 : 0);
                                                }
                                                RectF rectF7 = gl.P;
                                                ImageReceiver[] imageReceiverArr = ue3Var.W1;
                                                ImageReceiver imageReceiver2 = imageReceiverArr[i38];
                                                rectF7.set(imageReceiver2.L0, imageReceiver2.M0, imageReceiver2.w(), imageReceiverArr[i38].x());
                                                imageReceiverArr[i38].g(canvas3);
                                                if (ue3Var.Y1[i38]) {
                                                    Path path = ue3Var.w0;
                                                    if (path == null) {
                                                        ue3Var.w0 = new Path();
                                                    } else {
                                                        path.rewind();
                                                    }
                                                    Path path2 = ue3Var.w0;
                                                    int[] iArr = imageReceiverArr[i38].X0;
                                                    path2.addRoundRect(rectF7, iArr[z11 ? 1 : 0], iArr[1], Path.Direction.CW);
                                                    canvas3.save();
                                                    canvas3.clipPath(ue3Var.w0);
                                                    qla qlaVar3 = ue3Var.x0;
                                                    if (qlaVar3 == null) {
                                                        qlaVar3 = new qla();
                                                        ue3Var.x0 = qlaVar3;
                                                    }
                                                    qlaVar3.h(bm2.o(-1, 82));
                                                    qla qlaVar4 = ue3Var.x0;
                                                    ImageReceiver imageReceiver3 = imageReceiverArr[i38];
                                                    qlaVar4.setBounds((int) imageReceiver3.L0, (int) imageReceiver3.M0, (int) imageReceiver3.w(), (int) imageReceiverArr[i38].x());
                                                    ue3Var.x0.draw(canvas3);
                                                    ue3Var.invalidate();
                                                    canvas3.restore();
                                                }
                                                if (ue3Var.X1[i38]) {
                                                    hf0.t((int) (imageReceiverArr[i38].r() - (bkb.T0.getIntrinsicWidth() / 2)), (int) (imageReceiverArr[i38].s() - (bkb.T0.getIntrinsicHeight() / 2)), bkb.T0);
                                                    bkb.T0.draw(canvas3);
                                                }
                                            }
                                        }
                                        if (re3Var3.l > 0.0f) {
                                            canvas3.restore();
                                        }
                                    }
                                }
                                wtcVar = ue3Var.u0;
                                if (wtcVar != null && !wtcVar.t()) {
                                    canvas3.save();
                                    canvas3.translate(ue3Var.Z2, (ue3Var.getMeasuredHeight() - gl.L(21.66f)) - (ue3Var.t2 ? 1 : 0));
                                    ue3Var.u0.h(canvas3, ue3Var.a3 - ue3Var.Z2);
                                    canvas3.restore();
                                }
                                i15 = i13;
                                r12 = z11;
                                if (i15 != -1) {
                                    canvas3.restoreToCount(i15);
                                    r12 = z11;
                                }
                            } else {
                                if (ue3Var3.F1) {
                                    canvas3.save();
                                    float a = ue3Var3.G1.a(0.05f);
                                    RectF rectF8 = ue3Var3.I1;
                                    canvas3.scale(a, a, rectF8.centerX(), rectF8.centerY());
                                    ue3Var3.H1.setColor(bkb.v0(bkb.Ei, wjbVar3));
                                    canvas3.drawRoundRect(rectF8, rectF8.height() / 2.0f, rectF8.height() / 2.0f, ue3Var3.H1);
                                    tgb tgbVar = ue3Var3.J1;
                                    if (tgbVar != null) {
                                        tgbVar.c(rectF8.left + gl.L(13.0f), rectF8.centerY(), 1.0f, bkb.v0(bkb.Ii, wjbVar3), canvas);
                                    }
                                    canvas.restore();
                                }
                                canvas3 = canvas;
                            }
                        }
                        ue3Var = ue3Var3;
                        f10 = f16;
                        if (ue3Var.I3) {
                        }
                        if (ue3Var.S1 > 0) {
                        }
                        wtcVar = ue3Var.u0;
                        if (wtcVar != null) {
                            canvas3.save();
                            canvas3.translate(ue3Var.Z2, (ue3Var.getMeasuredHeight() - gl.L(21.66f)) - (ue3Var.t2 ? 1 : 0));
                            ue3Var.u0.h(canvas3, ue3Var.a3 - ue3Var.Z2);
                            canvas3.restore();
                        }
                        i15 = i13;
                        r12 = z11;
                        if (i15 != -1) {
                        }
                    } else {
                        sbVar2 = sbVar;
                        if (ue3Var3.q4 != 0) {
                            int L15 = gl.L((z10 || gba.l1) ? 12.0f : 15.0f);
                            if (((!z10 && !gba.l1) || ue3Var3.Z()) && ue3Var3.V()) {
                                L15 -= gl.L(9.0f);
                            }
                            hf0.t(ue3Var3.I2, L15, ue3Var3.q4 == 1 ? bkb.f1 : bkb.g1);
                            (ue3Var3.q4 == 1 ? bkb.f1 : bkb.g1).draw(canvas3);
                        }
                    }
                    z4 = z11 ? 1 : 0;
                    if (!ue3Var3.z3) {
                    }
                    if (!k96.a0) {
                    }
                    bkb.Y0.setAlpha((int) (ue3Var3.y3 * 255.0f));
                    hf0.t(ue3Var3.E3, ue3Var3.D3, bkb.Y0);
                    bkb.Y0.draw(canvas3);
                    float f3522222 = ue3Var3.T3.e;
                    if (ue3Var3.u3) {
                    }
                    ue3Var = ue3Var3;
                    f10 = f16;
                    if (ue3Var.I3) {
                    }
                    if (ue3Var.S1 > 0) {
                    }
                    wtcVar = ue3Var.u0;
                    if (wtcVar != null) {
                    }
                    i15 = i13;
                    r12 = z11;
                    if (i15 != -1) {
                    }
                }
            }
            wjbVar3 = wjbVar4;
            if (ue3Var3.c1) {
            }
            if (ue3Var3.k1 != 2) {
            }
            i7 = 17;
            if (!ue3Var3.k4) {
            }
            z4 = z11 ? 1 : 0;
            if (!ue3Var3.z3) {
            }
            if (!k96.a0) {
            }
            bkb.Y0.setAlpha((int) (ue3Var3.y3 * 255.0f));
            hf0.t(ue3Var3.E3, ue3Var3.D3, bkb.Y0);
            bkb.Y0.draw(canvas3);
            float f35222222 = ue3Var3.T3.e;
            if (ue3Var3.u3) {
            }
            ue3Var = ue3Var3;
            f10 = f16;
            if (ue3Var.I3) {
            }
            if (ue3Var.S1 > 0) {
            }
            wtcVar = ue3Var.u0;
            if (wtcVar != null) {
            }
            i15 = i13;
            r12 = z11;
            if (i15 != -1) {
            }
        } else {
            ue3Var = this;
            i7 = 17;
            wjbVar3 = wjbVar2;
            oe3Var4 = oe3Var3;
            sbVar2 = sbVar;
            r12 = 0;
            f10 = 1.0f;
            i8 = 4;
            z4 = false;
            i9 = 0;
        }
        z5 = ue3Var.c2;
        imageReceiver = ue3Var.Z1;
        if (z5) {
            canvas3.save();
            float interpolation2 = oe3Var4.getInterpolation(ue3Var.d2 / 170.0f) + f10;
            canvas3.scale(interpolation2, interpolation2, imageReceiver.r(), imageReceiver.s());
        }
        z6 = ue3Var.y;
        me3Var = ue3Var.v0;
        if (z6 && (!ue3Var.Q || (tL_forumTopic2 = ue3Var.O) == null || tL_forumTopic2.id != 1 || (vu8Var = ue3Var.f2) == null || !vu8Var.X || vu8Var.Y)) {
            if (!ue3Var.E) {
                p48 p48Var = ue3Var.a2;
                if (p48Var == null) {
                    p48Var = new p48();
                    ue3Var.a2 = p48Var;
                }
                p48Var.a((int) me3Var.F.centerX(), (int) me3Var.F.centerY(), (int) (me3Var.F.width() / 2.0f));
                canvas3.save();
                canvas3.clipPath(ue3Var.a2);
                imageReceiver.k0(me3Var.F);
                imageReceiver.g(canvas3);
                canvas3.restore();
            } else if (ue3Var.F) {
                kq3.f(imageReceiver, gl.N(f10) + me3Var.F.centerX(), me3Var.F.centerY(), gl.L(48.0f), gl.L(48.0f));
                kq3.a(canvas3, bkb.R0, imageReceiver.r(), imageReceiver.s(), gl.L(48.0f));
                imageReceiver.g(canvas3);
            } else {
                boolean z33 = ue3Var.G;
                me3Var.r = (z33 || ue3Var.K0 != 0) ? true : r12;
                int i39 = me3Var.z;
                if (z33) {
                    me3Var.z = 1;
                }
                x2b.h(ue3Var.I0, canvas3, imageReceiver, me3Var);
                if (me3Var.w) {
                    ue3Var.H();
                }
                me3Var.z = i39;
            }
            if (!ue3Var.P0 && ((((chat = ue3Var.h2) != null && chat.linked_community_id != 0) || ((user = ue3Var.g2) != null && user.linked_community_id != 0)) && !ue3Var.F && ue3Var.O0 && !ue3Var.X())) {
                float centerX2 = me3Var.F.centerX() + gl.L(20.33f);
                float centerY2 = me3Var.F.centerY() + gl.L(19.0f);
                sk0Var = ue3Var.E0;
                if (sk0Var == null) {
                    sk0Var = new sk0();
                    ue3Var.E0 = sk0Var;
                }
                kq3.d(sk0Var, centerX2, centerY2, i7);
                canvas3.drawCircle(ue3Var.E0.getBounds().exactCenterX(), ue3Var.E0.getBounds().exactCenterY(), gl.L(8.0f), bkb.l0(bkb.v0(bkb.c6, wjbVar3)));
                ue3Var.E0.draw(canvas3);
            }
        }
        if (ue3Var.c2) {
            canvas3.restore();
        }
        if (imageReceiver.R0 && K(canvas)) {
            i9 = 1;
        }
        if (ue3Var.j0 > 0.0f || ue3Var.K0 != 0) {
            ue3Var2 = ue3Var;
        } else {
            boolean W2 = ue3Var.W();
            RectF rectF9 = me3Var.F;
            int width = (int) (((rectF9.width() + rectF9.left) - ue3Var.P3) - gl.L(5.0f));
            RectF rectF10 = me3Var.F;
            M(canvas3, W2, (int) ((me3Var.F.height() + imageReceiver.M0) - gl.L(22.0f)), width, (int) (((rectF10.width() + rectF10.left) - ue3Var.Q3) - gl.L(5.0f)), ue3Var.j0, true);
            ue3Var2 = this;
        }
        if (ue3Var2.D0 != 0.0f) {
            canvas3.restore();
        }
        if (ue3Var2.x1 != 0.0f) {
            canvas3.restore();
        }
        if (z2 && ((ue3Var2.K0 != 0 || (ue3Var2.Q && (tL_forumTopic = ue3Var2.O) != null && tL_forumTopic.id == 1)) && ue3Var2.x1 == 0.0f && ue3Var2.f2 != null)) {
            canvas3.save();
            canvas3.translate(0.0f, (-ue3Var2.F3) - (ue3Var2.n * ue3Var2.j0));
            canvas3.clipRect(0.0f, (f10 - ue3Var2.f2.J) * ue3Var2.getMeasuredHeight(), ue3Var2.getMeasuredWidth(), ue3Var2.getMeasuredHeight());
            ue3Var2.f2.c(canvas3, r12);
            canvas3.restore();
        }
        if (ue3Var2.t2) {
            int L16 = (ue3Var2.u2 || (ue3Var2.K0 != 0 && ue3Var2.n1)) ? r12 : gl.L(ue3Var2.J);
            if (ue3Var2.j0 != f10) {
                int alpha4 = bkb.j0.getAlpha();
                float f47 = ue3Var2.j0;
                if (f47 != 0.0f) {
                    bkb.j0.setAlpha((int) ((f10 - f47) * alpha4));
                }
                i10 = 1;
                float measuredHeight = (ue3Var2.getMeasuredHeight() - 1) - (ue3Var2.n * ue3Var2.j0);
                if (k96.a0) {
                    canvas.drawLine(0.0f, measuredHeight, ue3Var2.getMeasuredWidth() - L16, measuredHeight, bkb.j0);
                } else {
                    canvas.drawLine(L16, measuredHeight, ue3Var2.getMeasuredWidth(), measuredHeight, bkb.j0);
                }
                f11 = 0.0f;
                if (ue3Var2.j0 != 0.0f) {
                    bkb.j0.setAlpha(alpha4);
                }
                if (ue3Var2.u1 != f11) {
                    if (Build.VERSION.SDK_INT != 24) {
                        canvas.restore();
                    } else {
                        bkb.u0.setColor(bkb.v0(bkb.c6, wjbVar3));
                        canvas.drawRect(0.0f, 0.0f, ue3Var2.getMeasuredWidth(), ue3Var2.v1 * ue3Var2.u1, bkb.u0);
                        canvas.drawRect(0.0f, ue3Var2.getMeasuredHeight() - ((int) (ue3Var2.w1 * ue3Var2.u1)), ue3Var2.getMeasuredWidth(), ue3Var2.getMeasuredHeight(), bkb.u0);
                        canvas2 = canvas;
                        if (z17) {
                            float f48 = f10 - f20;
                            int measuredHeight2 = (int) (ue3Var2.getMeasuredHeight() * f48);
                            int u0 = bkb.u0(bkb.c6);
                            GradientDrawable gradientDrawable = ue3Var2.P4;
                            if (gradientDrawable == null) {
                                gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, null);
                                ue3Var2.P4 = gradientDrawable;
                            }
                            if (ue3Var2.Q4 != u0) {
                                ue3Var2.Q4 = u0;
                                gradientDrawable.setColors(new int[]{u0, 16777215 & u0});
                            }
                            float a2 = moe.a((f48 - 0.05f) * 10.0f, 0.0f, f10);
                            ue3Var2.P4.setBounds(r12, measuredHeight2, ue3Var2.getMeasuredWidth(), gl.L(6.0f) + measuredHeight2);
                            ue3Var2.P4.setAlpha((int) (a2 * 255.0f));
                            ue3Var2.P4.draw(canvas2);
                            canvas2.restore();
                        }
                        z7 = ue3Var2.z3;
                        if (!z7 || ue3Var2.y3 != 0.0f) {
                            float f362222 = ue3Var2.y3;
                            if (!z7) {
                                f12 = 0.0f;
                                if (f362222 > 0.0f) {
                                    float f49 = f362222 - 0.09411765f;
                                    ue3Var2.y3 = f49;
                                    if (f49 < 0.0f) {
                                        ue3Var2.y3 = 0.0f;
                                    }
                                    i9 = i10;
                                }
                                z8 = ue3Var2.n1;
                                float f50 = ue3Var2.E1;
                                if (!z8) {
                                    if (f50 > f12) {
                                        float f51 = f50 - 0.069565214f;
                                        ue3Var2.E1 = f51;
                                        if (f51 < f12) {
                                            ue3Var2.E1 = f12;
                                            f51 = 0.0f;
                                        }
                                        pb0 pb0Var = ue3Var2.b2;
                                        if (pb0Var.n == 2) {
                                            pb0Var.o = s33.h.getInterpolation(f51);
                                        }
                                        i9 = i10;
                                    }
                                    if (ue3Var2.c2) {
                                        float f52 = ue3Var2.d2 + 16.0f;
                                        ue3Var2.d2 = f52;
                                        if (f52 >= 170.0f) {
                                            ue3Var2.d2 = 170.0f;
                                            ue3Var2.c2 = r12;
                                        }
                                        i9 = i10;
                                    }
                                    z9 = ue3Var2.B1;
                                    float f53 = ue3Var2.D1;
                                    if (z9) {
                                        if (f53 == 1.0f) {
                                            ue3Var2.D1 = 0.0f;
                                            i9 = i10;
                                        }
                                        float f54 = ue3Var2.C1;
                                        if (f54 > 0.0f) {
                                            float f55 = f54 - 0.053333335f;
                                            ue3Var2.C1 = f55;
                                            if (f55 < 0.0f) {
                                                ue3Var2.C1 = 0.0f;
                                            }
                                        }
                                        i10 = i9;
                                    } else {
                                        if (f53 < 1.0f) {
                                            float f56 = f53 + 0.09411765f;
                                            ue3Var2.D1 = f56;
                                            if (f56 > 1.0f) {
                                                ue3Var2.D1 = 1.0f;
                                                i9 = i10;
                                            }
                                        }
                                        float f57 = ue3Var2.C1;
                                        if (f57 < 1.0f) {
                                            float f58 = f57 + 0.053333335f;
                                            ue3Var2.C1 = f58;
                                            if (f58 > 1.0f) {
                                                ue3Var2.C1 = 1.0f;
                                            }
                                        }
                                        i10 = i9;
                                    }
                                    sbVar2.setVisibility(!z4 ? r12 : i8);
                                    if (i10 == 0) {
                                        ue3Var2.invalidate();
                                        return;
                                    }
                                    return;
                                }
                                if (f50 < 1.0f) {
                                    float f59 = f50 + 0.069565214f;
                                    ue3Var2.E1 = f59;
                                    if (f59 > 1.0f) {
                                        ue3Var2.E1 = 1.0f;
                                        f59 = 1.0f;
                                    }
                                    pb0 pb0Var2 = ue3Var2.b2;
                                    if (pb0Var2.n == 2) {
                                        pb0Var2.o = s33.h.getInterpolation(f59);
                                    }
                                    i9 = i10;
                                }
                                if (ue3Var2.c2) {
                                }
                                z9 = ue3Var2.B1;
                                float f532 = ue3Var2.D1;
                                if (z9) {
                                }
                                sbVar2.setVisibility(!z4 ? r12 : i8);
                                if (i10 == 0) {
                                }
                            } else if (f362222 < 1.0f) {
                                float f60 = f362222 + 0.09411765f;
                                ue3Var2.y3 = f60;
                                if (f60 > 1.0f) {
                                    ue3Var2.y3 = 1.0f;
                                }
                                i9 = i10;
                            }
                        }
                        f12 = 0.0f;
                        z8 = ue3Var2.n1;
                        float f502 = ue3Var2.E1;
                        if (!z8) {
                        }
                    }
                }
                canvas2 = canvas;
                if (z17) {
                }
                z7 = ue3Var2.z3;
                if (!z7) {
                }
                float f3622222 = ue3Var2.y3;
                if (!z7) {
                }
            }
        }
        f11 = 0.0f;
        i10 = 1;
        if (ue3Var2.u1 != f11) {
        }
        canvas2 = canvas;
        if (z17) {
        }
        z7 = ue3Var2.z3;
        if (!z7) {
        }
        float f36222222 = ue3Var2.y3;
        if (!z7) {
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        vu8 vu8Var;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (Y() && (vu8Var = this.f2) != null && gba.m1 && vu8Var.J == 0.0f) {
            accessibilityNodeInfo.setVisibleToUser(false);
        } else {
            accessibilityNodeInfo.addAction(16);
            accessibilityNodeInfo.addAction(32);
            if (!Y() && this.E4 != null) {
                accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_chat_preview, k96.M0(2131754940, null)));
            }
        }
        ya yaVar = this.r2;
        if (yaVar == null || !yaVar.a.q) {
            return;
        }
        accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(true);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.j0 != 0.0f || this.Q || this.G || !this.v0.a(this, motionEvent)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int L;
        int i5;
        if (this.I0 == 0 && this.H0 == null) {
            return;
        }
        sb sbVar = this.n4;
        if (sbVar != null) {
            sbVar.layout(0, 0, gl.L(22.0f), gl.L(22.0f));
        }
        if (this.r2 != null) {
            byte b = this.J;
            boolean z2 = this.s2;
            int L2 = gl.L(b - ((z2 || gba.l1) ? (byte) 29 : (byte) 27));
            if (this.l0) {
                i5 = gl.L(8.0f);
                L = (getMeasuredHeight() - this.r2.getMeasuredHeight()) >> 1;
            } else {
                if (k96.a0) {
                    L2 = (i3 - i) - L2;
                }
                int i6 = L2;
                L = gl.L(this.V + ((z2 || gba.l1) ? 6 : 0));
                i5 = i6;
            }
            ya yaVar = this.r2;
            yaVar.layout(i5, L, yaVar.getMeasuredWidth() + i5, this.r2.getMeasuredHeight() + L);
        }
        int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
        if (measuredWidth != this.L4 || this.B0) {
            this.B0 = false;
            this.L4 = measuredWidth;
            try {
                z();
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        sb sbVar = this.n4;
        if (sbVar != null) {
            sbVar.measure(View.MeasureSpec.makeMeasureSpec(gl.L(22.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(22.0f), TLObject.FLAG_30));
        }
        ya yaVar = this.r2;
        if (yaVar != null) {
            yaVar.measure(View.MeasureSpec.makeMeasureSpec(gl.L(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(24.0f), TLObject.FLAG_30));
        }
        if (this.Q) {
            int size = View.MeasureSpec.getSize(i);
            boolean z = this.s2;
            setMeasuredDimension(size, gl.L(((z || gba.l1) ? this.L : this.K) + ((!V() || ((z || gba.l1) && !Z())) ? (byte) 0 : Z() ? this.N : this.M)) + (this.t2 ? 1 : 0));
            this.R = false;
            if (this.Q && !V()) {
                z();
                if (this.S) {
                    this.R = true;
                    z();
                }
            }
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), I());
        this.v1 = 0;
        this.w1 = getMeasuredHeight();
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        k27 captionMessage;
        TLRPC.User V1;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        StringBuilder sb = new StringBuilder();
        String str = this.M0;
        if (str != null) {
            sb.append(str);
            sb.append(". ");
        } else if (this.K0 == 1) {
            sb.append(k96.M0(2131754133, null));
            sb.append(". ");
        } else {
            if (this.i2 != null) {
                sb.append(k96.M0(2131754776, null));
                sb.append(". ");
            }
            if (!this.Q || this.O == null) {
                TLRPC.User user = this.g2;
                if (user != null) {
                    if (l7c.B(user)) {
                        sb.append(k96.M0(2131746073, null));
                    } else if (l7c.u(this.g2)) {
                        sb.append(k96.M0(2131754249, null));
                    } else {
                        if (this.g2.bot) {
                            sb.append(k96.M0(2131753153, null));
                            sb.append(". ");
                        }
                        TLRPC.User user2 = this.g2;
                        if (user2.self) {
                            sb.append(k96.M0(2131745709, null));
                        } else {
                            sb.append(qu2.m(0, user2.first_name, user2.last_name));
                        }
                    }
                    sb.append(". ");
                } else {
                    TLRPC.Chat chat = this.h2;
                    if (chat != null) {
                        if (chat.broadcast) {
                            sb.append(k96.M0(2131754904, null));
                        } else {
                            sb.append(k96.M0(2131754876, null));
                        }
                        sb.append(". ");
                        sb.append(this.h2.title);
                        sb.append(". ");
                    }
                }
            } else {
                sb.append(k96.M0(2131754745, null));
                sb.append(". ");
                sb.append(this.O.title);
                sb.append(". ");
            }
        }
        if (this.k4) {
            sb.append(k96.M0(2131754738, null));
            sb.append(". ");
        }
        if (this.a1) {
            sb.append(k96.M0(2131754828, null));
            sb.append(". ");
        }
        if (a0()) {
            sb.append(k96.M0(2131754740, null));
            sb.append(". ");
        }
        int i = this.T0;
        if (i > 0) {
            sb.append(k96.G(i, "NewMessages", new Object[0]));
            sb.append(". ");
        }
        int i2 = this.V0;
        if (i2 > 0) {
            sb.append(k96.G(i2, "AccDescrMentionCount", new Object[0]));
            sb.append(". ");
        }
        if (this.W0 > 0) {
            sb.append(k96.M0(2131754840, null));
            sb.append(". ");
        }
        k27 k27Var = this.g1;
        if (k27Var == null || this.K0 != 0) {
            accessibilityEvent.setContentDescription(sb);
            setContentDescription(sb);
            return;
        }
        int i3 = this.S0;
        if (i3 == 0) {
            i3 = k27Var.k.date;
        }
        String s = k96.s(i3, true);
        if (this.g1.N3()) {
            sb.append(k96.a0("AccDescrSentDate", null, 2131754764, s));
        } else {
            sb.append(k96.a0("AccDescrReceivedDate", null, 2131754788, s));
        }
        sb.append(". ");
        if (this.h2 != null && !this.g1.N3() && this.g1.p3() && this.g1.k.action == null && (V1 = na7.q1(this.G0).V1(Long.valueOf(this.g1.k.from_id.user_id))) != null) {
            sb.append(qu2.m(0, V1.first_name, V1.last_name));
            sb.append(". ");
        }
        if (this.i2 == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.g1.v);
            if (!this.g1.F3() && (captionMessage = getCaptionMessage()) != null && !TextUtils.isEmpty(captionMessage.z)) {
                if (sb2.length() > 0) {
                    sb2.append(". ");
                }
                sb2.append(captionMessage.z);
            }
            StaticLayout staticLayout = this.f3;
            int length = staticLayout == null ? -1 : staticLayout.getText().length();
            if (length > 0) {
                int length2 = sb2.length();
                int indexOf = sb2.indexOf("\n", length);
                if (indexOf < length2 && indexOf >= 0) {
                    length2 = indexOf;
                }
                int indexOf2 = sb2.indexOf("\t", length);
                if (indexOf2 < length2 && indexOf2 >= 0) {
                    length2 = indexOf2;
                }
                int indexOf3 = sb2.indexOf(" ", length);
                if (indexOf3 < length2 && indexOf3 >= 0) {
                    length2 = indexOf3;
                }
                sb.append(sb2.substring(0, length2));
            } else {
                sb.append((CharSequence) sb2);
            }
        }
        accessibilityEvent.setContentDescription(sb);
        setContentDescription(sb);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x006d, code lost:
    
        if (r0 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0084, code lost:
    
        if (r2 == 8) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x008a, code lost:
    
        if (r0.b(r7) != false) goto L51;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.j0 != 0.0f || this.Q || this.G || !this.v0.a(this, motionEvent)) {
            qe3 qe3Var = this.e0;
            if (qe3Var == null || qe3Var.m()) {
                if (this.F1) {
                    boolean contains = this.I1.contains(motionEvent.getX(), motionEvent.getY());
                    int action = motionEvent.getAction();
                    n41 n41Var = this.G1;
                    if (action == 0 || motionEvent.getAction() == 2) {
                        n41Var.c(contains);
                    } else {
                        if (n41Var.i && motionEvent.getAction() == 1) {
                            hj3 hj3Var = this.L1;
                            if (hj3Var != null) {
                                hj3Var.a(this.g2);
                            }
                            n41Var.c(false);
                            return true;
                        }
                        if (n41Var.i && motionEvent.getAction() == 3) {
                            n41Var.c(false);
                            return true;
                        }
                    }
                }
                if (this.g0) {
                    ra1 ra1Var = this.d0;
                    if (ra1Var != null) {
                        if (this.i3 != null) {
                            int i = this.k1;
                            if (i != 0) {
                                if (i != 7) {
                                }
                            }
                        }
                    }
                }
            }
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        cj3 cj3Var;
        if (i != R.id.acc_action_chat_preview || (cj3Var = this.E4) == null) {
            return super.performAccessibilityAction(i, bundle);
        }
        cj3Var.Y4(this);
        return true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (getParent() != null && getParent().isLayoutRequested()) {
            getParent().requestLayout();
        }
        super.requestLayout();
    }

    public void setArchivedPullAnimation(vu8 vu8Var) {
        this.f2 = vu8Var;
    }

    public void setBottomClip(int i) {
        this.w1 = i;
    }

    public void setClipProgress(float f) {
        this.u1 = f;
        invalidate();
    }

    public void setCurrentDialogId(long j) {
        this.I0 = j;
    }

    public void setCustomMessage(String str) {
        if (TextUtils.equals(this.J0, str)) {
            return;
        }
        this.J0 = str;
        z();
        requestLayout();
    }

    public void setCustomMessageWithoutRebuild(String str) {
        this.J0 = str;
    }

    public void setDialog(pe3 pe3Var) {
        this.H0 = pe3Var;
        this.m1 = 0;
        k0(0, true);
        G();
        D();
        A();
        H();
    }

    public void setDialogCellDelegate(qe3 qe3Var) {
        this.e0 = qe3Var;
    }

    public void setDialogSelected(boolean z) {
        if (this.r4 != z) {
            invalidate();
        }
        this.r4 = z;
    }

    public void setIsTransitionSupport(boolean z) {
        this.k0 = z;
    }

    public void setMoving(boolean z) {
        this.r = z;
    }

    public void setOpenBotButton(boolean z) {
        if (this.F1 == z) {
            return;
        }
        if (this.J1 == null) {
            this.J1 = new tgb(k96.M0(2131753008, null), 14.0f, gl.o());
        }
        this.F1 = z;
        this.G1.c(false);
    }

    public void setPinForced(boolean z) {
        this.C3 = z;
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
            z();
        }
        invalidate();
    }

    public void setPreloader(lj3 lj3Var) {
        this.t4 = lj3Var;
    }

    public void setRightFragmentOpenedProgress(float f) {
        if (this.j0 != f) {
            this.j0 = f;
            invalidate();
        }
    }

    public void setSliding(boolean z) {
        this.y1 = z;
    }

    public void setTitleOverride(String str) {
        this.M0 = str;
    }

    public void setTopClip(int i) {
        this.v1 = i;
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        if (f == this.x1) {
            return;
        }
        this.x1 = f;
        oy8 oy8Var = this.z1;
        if (oy8Var != null && f == 0.0f) {
            oy8Var.O(true, 0.0f);
            this.A1 = false;
            this.n1 = gba.m1;
            this.C1 = 0.0f;
            this.y1 = false;
        }
        float f2 = this.x1;
        if (f2 != 0.0f) {
            this.y1 = true;
        } else {
            this.D1 = 0.0f;
            this.C1 = 0.0f;
            this.B1 = false;
        }
        if (this.y1 && !this.x) {
            boolean z = this.B1;
            boolean z2 = Math.abs(f2) >= ((float) getMeasuredWidth()) * 0.45f;
            this.B1 = z2;
            if (z != z2 && this.n1 == gba.m1) {
                try {
                    performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
            }
        }
        invalidate();
    }

    public void setVisible(boolean z) {
        if (this.A0 != z) {
            this.A0 = z;
            if (z) {
                invalidate();
            }
        }
    }

    public void updateColors() {
        try {
            if (isAttachedToWindow()) {
                if (this.I0 == 0 && this.H0 == null) {
                    return;
                }
                k0(0, true);
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final CharSequence y(CharSequence charSequence) {
        if (this.S1 <= 0) {
            return charSequence;
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        valueOf.insert(0, (CharSequence) " ");
        valueOf.setSpan(new se3(gl.L(((this.M4 + 2) * this.S1) + 3)), 0, 1, 33);
        return valueOf;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:(2:666|667)|(2:671|(8:673|674|675|676|(1:687)(1:680)|681|(2:682|(1:684)(1:685))|686))|693|674|675|676|(1:678)|687|681|(3:682|(0)(0)|684)|686) */
    /* JADX WARN: Code restructure failed: missing block: B:1026:0x05f2, code lost:
    
        if (r3.reply_to_msg_id == 0) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1132:0x1544, code lost:
    
        if (r5 == null) goto L1131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1553:0x0af2, code lost:
    
        if (r14.id != r11) goto L563;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1557:0x0b00, code lost:
    
        if (hc2.n0(r53.h2) != false) goto L567;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1559:0x0b08, code lost:
    
        if (mm4.l(r53.g1) == false) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1693:0x0f1b, code lost:
    
        if (k27.O2(r53.g1.k.rich_message.blocks.get(0)) != false) goto L767;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1865:0x0618, code lost:
    
        if (r2.post_messages == false) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1871:0x0624, code lost:
    
        if (r2.kicked != false) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1875:0x062e, code lost:
    
        if (r53.Q == false) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1881:0x05fe, code lost:
    
        if (r53.T0 != 0) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:626:0x2394, code lost:
    
        if (hc2.g(r53.G0, r53.h2) != false) goto L1747;
     */
    /* JADX WARN: Code restructure failed: missing block: B:689:0x2198, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:690:0x2199, code lost:
    
        r2 = r42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:691:0x219d, code lost:
    
        fa4.f(r0);
        r42 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1003:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:1016:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x1738  */
    /* JADX WARN: Removed duplicated region for block: B:1030:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:1057:0x128d  */
    /* JADX WARN: Removed duplicated region for block: B:1079:0x1308  */
    /* JADX WARN: Removed duplicated region for block: B:1084:0x1332  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x1755  */
    /* JADX WARN: Removed duplicated region for block: B:1106:0x14b9  */
    /* JADX WARN: Removed duplicated region for block: B:1121:0x1508  */
    /* JADX WARN: Removed duplicated region for block: B:1239:0x13a8  */
    /* JADX WARN: Removed duplicated region for block: B:1242:0x13b4  */
    /* JADX WARN: Removed duplicated region for block: B:1245:0x13bd  */
    /* JADX WARN: Removed duplicated region for block: B:1247:0x13bf  */
    /* JADX WARN: Removed duplicated region for block: B:1248:0x13b6  */
    /* JADX WARN: Removed duplicated region for block: B:1249:0x13ad  */
    /* JADX WARN: Removed duplicated region for block: B:1259:0x1485  */
    /* JADX WARN: Removed duplicated region for block: B:1277:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x18ca  */
    /* JADX WARN: Removed duplicated region for block: B:1364:0x093c  */
    /* JADX WARN: Removed duplicated region for block: B:1369:0x1170  */
    /* JADX WARN: Removed duplicated region for block: B:1372:0x117f  */
    /* JADX WARN: Removed duplicated region for block: B:1376:0x0942  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x18df  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x18e4 A[Catch: Exception -> 0x19db, TRY_LEAVE, TryCatch #9 {Exception -> 0x19db, blocks: (B:135:0x18d5, B:138:0x18e0, B:140:0x18e4), top: B:134:0x18d5 }] */
    /* JADX WARN: Removed duplicated region for block: B:1446:0x0a88  */
    /* JADX WARN: Removed duplicated region for block: B:1447:0x0a91  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x18fb A[Catch: Exception -> 0x19d7, TRY_LEAVE, TryCatch #2 {Exception -> 0x19d7, blocks: (B:143:0x18ee, B:144:0x18f7, B:146:0x18fb), top: B:142:0x18ee }] */
    /* JADX WARN: Removed duplicated region for block: B:1514:0x10fb  */
    /* JADX WARN: Removed duplicated region for block: B:1519:0x110c  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x1938  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x1941 A[Catch: Exception -> 0x19d5, TryCatch #4 {Exception -> 0x19d5, blocks: (B:149:0x1908, B:152:0x1917, B:154:0x1925, B:157:0x193b, B:159:0x1941, B:160:0x194d, B:162:0x1960, B:164:0x1966, B:167:0x1977, B:169:0x197b, B:170:0x19b5, B:172:0x19b9, B:174:0x19c0, B:175:0x19c9, B:869:0x1994), top: B:148:0x1908 }] */
    /* JADX WARN: Removed duplicated region for block: B:1680:0x0d3e  */
    /* JADX WARN: Removed duplicated region for block: B:1694:0x0d42  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x197b A[Catch: Exception -> 0x19d5, TryCatch #4 {Exception -> 0x19d5, blocks: (B:149:0x1908, B:152:0x1917, B:154:0x1925, B:157:0x193b, B:159:0x1941, B:160:0x194d, B:162:0x1960, B:164:0x1966, B:167:0x1977, B:169:0x197b, B:170:0x19b5, B:172:0x19b9, B:174:0x19c0, B:175:0x19c9, B:869:0x1994), top: B:148:0x1908 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x1a04  */
    /* JADX WARN: Removed duplicated region for block: B:1858:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:1868:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:1874:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:1878:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:1884:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:1939:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:1946:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:1951:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x1c2d  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x1c59  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x1c66  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x1c92  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x1cbc  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x1fdc  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x2015  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x209f  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x20f3  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x2106  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x211e  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x2121  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x2132  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x2211  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x2230 A[Catch: Exception -> 0x227f, TryCatch #5 {Exception -> 0x227f, blocks: (B:340:0x222a, B:342:0x2230, B:637:0x227c), top: B:339:0x222a }] */
    /* JADX WARN: Removed duplicated region for block: B:348:0x2295 A[Catch: Exception -> 0x22fa, TryCatch #10 {Exception -> 0x22fa, blocks: (B:346:0x228f, B:348:0x2295, B:350:0x2299, B:352:0x22c7, B:357:0x22f3, B:362:0x229d, B:364:0x22a3, B:368:0x22c0), top: B:345:0x228f }] */
    /* JADX WARN: Removed duplicated region for block: B:375:0x2302 A[Catch: Exception -> 0x248a, TryCatch #0 {Exception -> 0x248a, blocks: (B:373:0x22fe, B:375:0x2302, B:377:0x2314, B:379:0x231a, B:381:0x231e, B:383:0x2326, B:385:0x232c, B:387:0x2330, B:389:0x2334, B:391:0x2338, B:393:0x233c, B:395:0x2340, B:398:0x234d, B:400:0x234a, B:403:0x2350, B:405:0x2354, B:407:0x2374, B:409:0x2378, B:411:0x2396, B:413:0x239c, B:415:0x23a0, B:417:0x23b3, B:419:0x23e0, B:421:0x23e6, B:423:0x2426, B:425:0x242a, B:427:0x243c, B:429:0x2442, B:434:0x246c, B:601:0x23ea, B:603:0x23f0, B:606:0x23f6, B:619:0x23cd, B:620:0x237c, B:623:0x2384, B:625:0x238c, B:627:0x2358, B:629:0x235e, B:631:0x2362, B:633:0x2367), top: B:372:0x22fe }] */
    /* JADX WARN: Removed duplicated region for block: B:405:0x2354 A[Catch: Exception -> 0x248a, TryCatch #0 {Exception -> 0x248a, blocks: (B:373:0x22fe, B:375:0x2302, B:377:0x2314, B:379:0x231a, B:381:0x231e, B:383:0x2326, B:385:0x232c, B:387:0x2330, B:389:0x2334, B:391:0x2338, B:393:0x233c, B:395:0x2340, B:398:0x234d, B:400:0x234a, B:403:0x2350, B:405:0x2354, B:407:0x2374, B:409:0x2378, B:411:0x2396, B:413:0x239c, B:415:0x23a0, B:417:0x23b3, B:419:0x23e0, B:421:0x23e6, B:423:0x2426, B:425:0x242a, B:427:0x243c, B:429:0x2442, B:434:0x246c, B:601:0x23ea, B:603:0x23f0, B:606:0x23f6, B:619:0x23cd, B:620:0x237c, B:623:0x2384, B:625:0x238c, B:627:0x2358, B:629:0x235e, B:631:0x2362, B:633:0x2367), top: B:372:0x22fe }] */
    /* JADX WARN: Removed duplicated region for block: B:421:0x23e6 A[Catch: Exception -> 0x248a, TryCatch #0 {Exception -> 0x248a, blocks: (B:373:0x22fe, B:375:0x2302, B:377:0x2314, B:379:0x231a, B:381:0x231e, B:383:0x2326, B:385:0x232c, B:387:0x2330, B:389:0x2334, B:391:0x2338, B:393:0x233c, B:395:0x2340, B:398:0x234d, B:400:0x234a, B:403:0x2350, B:405:0x2354, B:407:0x2374, B:409:0x2378, B:411:0x2396, B:413:0x239c, B:415:0x23a0, B:417:0x23b3, B:419:0x23e0, B:421:0x23e6, B:423:0x2426, B:425:0x242a, B:427:0x243c, B:429:0x2442, B:434:0x246c, B:601:0x23ea, B:603:0x23f0, B:606:0x23f6, B:619:0x23cd, B:620:0x237c, B:623:0x2384, B:625:0x238c, B:627:0x2358, B:629:0x235e, B:631:0x2362, B:633:0x2367), top: B:372:0x22fe }] */
    /* JADX WARN: Removed duplicated region for block: B:438:0x24a8  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x277c  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x27bb  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x27c1  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x268b  */
    /* JADX WARN: Removed duplicated region for block: B:605:0x23f4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:612:0x240b  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x240e  */
    /* JADX WARN: Removed duplicated region for block: B:637:0x227c A[Catch: Exception -> 0x227f, TRY_LEAVE, TryCatch #5 {Exception -> 0x227f, blocks: (B:340:0x222a, B:342:0x2230, B:637:0x227c), top: B:339:0x222a }] */
    /* JADX WARN: Removed duplicated region for block: B:640:0x2153  */
    /* JADX WARN: Removed duplicated region for block: B:678:0x21ae  */
    /* JADX WARN: Removed duplicated region for block: B:684:0x21be A[LOOP:12: B:682:0x21b9->B:684:0x21be, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:685:0x21cf A[EDGE_INSN: B:685:0x21cf->B:686:0x21cf BREAK  A[LOOP:12: B:682:0x21b9->B:684:0x21be], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:700:0x1cf3  */
    /* JADX WARN: Removed duplicated region for block: B:836:0x1c44  */
    /* JADX WARN: Removed duplicated region for block: B:842:0x1b78  */
    /* JADX WARN: Removed duplicated region for block: B:847:0x1bdd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x1675  */
    /* JADX WARN: Removed duplicated region for block: B:864:0x1c26 A[EDGE_INSN: B:864:0x1c26->B:865:0x1c26 BREAK  A[LOOP:13: B:845:0x1bd8->B:860:0x1c10], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:866:0x1b9a  */
    /* JADX WARN: Removed duplicated region for block: B:869:0x1994 A[Catch: Exception -> 0x19d5, TryCatch #4 {Exception -> 0x19d5, blocks: (B:149:0x1908, B:152:0x1917, B:154:0x1925, B:157:0x193b, B:159:0x1941, B:160:0x194d, B:162:0x1960, B:164:0x1966, B:167:0x1977, B:169:0x197b, B:170:0x19b5, B:172:0x19b9, B:174:0x19c0, B:175:0x19c9, B:869:0x1994), top: B:148:0x1908 }] */
    /* JADX WARN: Removed duplicated region for block: B:871:0x193a  */
    /* JADX WARN: Removed duplicated region for block: B:876:0x1922  */
    /* JADX WARN: Removed duplicated region for block: B:880:0x18f3  */
    /* JADX WARN: Removed duplicated region for block: B:884:0x1847  */
    /* JADX WARN: Removed duplicated region for block: B:890:0x186a  */
    /* JADX WARN: Removed duplicated region for block: B:915:0x1785  */
    /* JADX WARN: Removed duplicated region for block: B:927:0x171b  */
    /* JADX WARN: Removed duplicated region for block: B:929:0x1706  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x16dc  */
    /* JADX WARN: Removed duplicated region for block: B:932:0x16c9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x170b  */
    /* JADX WARN: Type inference failed for: r3v185, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v188, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r53v0, types: [android.view.View, ue3] */
    /* JADX WARN: Type inference failed for: r7v68, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r8v57, types: [android.text.SpannableStringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void z() {
        int i;
        float f;
        float f2;
        boolean z;
        char c;
        int i2;
        CharSequence charSequence;
        long j;
        boolean z2;
        boolean z3;
        int i3;
        TLRPC.DraftMessage draftMessage;
        TLRPC.Chat chat;
        boolean z4;
        CharSequence charSequence2;
        boolean z5;
        CharSequence charSequence3;
        int i4;
        String L0;
        CharSequence charSequence4;
        boolean z6;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TL_iv.RichMessage richMessage;
        int i5;
        CharSequence charSequence5;
        CharSequence charSequence6;
        CharSequence charSequence7;
        CharSequence charSequence8;
        TLRPC.Chat K0;
        CharSequence charSequence9;
        boolean z7;
        String str;
        boolean z8;
        CharSequence charSequence10;
        k27 k27Var;
        CharSequence charSequence11;
        CharSequence J2;
        CharSequence charSequence12;
        char c2;
        String str2;
        CharSequence charSequence13;
        boolean V;
        SpannableStringBuilder append;
        k27 k27Var2;
        TLRPC.Message message;
        String str3;
        int i6;
        CharSequence l;
        CharSequence charSequence14;
        CharSequence v1;
        cm4 cm4Var;
        TLRPC.User user;
        k27 k27Var3;
        TLRPC.User user2;
        CharSequence charSequence15;
        CharSequence charSequence16;
        CharSequence P;
        CharSequence charSequence17;
        String str4;
        String str5;
        CharSequence charSequence18;
        CharSequence charSequence19;
        String str6;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.MessagePeerReaction> arrayList2;
        CharSequence L02;
        CharSequence charSequence20;
        CharSequence charSequence21;
        CharSequence charSequence22;
        CharSequence charSequence23;
        String str7;
        k27 k27Var4;
        boolean z9;
        String str8;
        String str9;
        CharSequence charSequence24;
        CharSequence charSequence25;
        boolean z10;
        int i7;
        CharSequence charSequence26;
        CharSequence U;
        boolean z11;
        String str10;
        String str11;
        boolean z12;
        CharSequence charSequence27;
        int i8;
        k27 k27Var5;
        CharSequence charSequence28;
        CharSequence charSequence29;
        CharSequence charSequence30;
        float f3;
        float f4;
        int i9;
        int i10;
        int x;
        float f5;
        boolean z13;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        int L;
        int L2;
        int L3;
        int i11;
        int i12;
        ImageReceiver[] imageReceiverArr;
        int i13;
        int i14;
        wtc wtcVar;
        boolean z14;
        int max;
        boolean Z;
        CharSequence charSequence31;
        int L4;
        int i15;
        ImageReceiver[] imageReceiverArr2;
        k27 k27Var6;
        boolean z15;
        int lineCount;
        int lineCount2;
        int lineCount3;
        StaticLayout staticLayout;
        float primaryHorizontal;
        float primaryHorizontal2;
        int i16;
        int lineCount4;
        int lineCount5;
        int lineCount6;
        CharSequence charSequence32;
        CharSequence charSequence33;
        int i17;
        CharSequence charSequence34;
        CharSequence v12;
        k27 k27Var7;
        wtc wtcVar2;
        float f11;
        int L5;
        int L6;
        wtc wtcVar3;
        int L7;
        CharSequence charSequence35;
        StaticLayout staticLayout2;
        CharSequence v13;
        CharSequence charSequence36;
        SpannableStringBuilder R;
        if (this.k0) {
            return;
        }
        if (this.O0 && !this.J4.a() && this.K0 == 0 && this.L0 == 0 && this.i2 == null) {
            return;
        }
        if (!this.s2) {
            boolean z16 = gba.a;
        }
        bkb.A0[0].setTextSize(gl.L(17.0f));
        bkb.B0[0].setTextSize(gl.L(17.0f));
        bkb.E0[0].setTextSize(gl.L(16.0f));
        bkb.G0[0].setTextSize(gl.L(16.0f));
        boolean z17 = true;
        bkb.A0[1].setTextSize(gl.L(16.0f));
        bkb.B0[1].setTextSize(gl.L(16.0f));
        bkb.E0[1].setTextSize(gl.L(15.0f));
        bkb.G0[1].setTextSize(gl.L(15.0f));
        TextPaint textPaint = bkb.E0[1];
        int v0 = bkb.v0(bkb.h9, this.K4);
        textPaint.linkColor = v0;
        textPaint.setColor(v0);
        this.F0 = true;
        this.M4 = (byte) 18;
        this.N0 = 0;
        String str12 = null;
        CharSequence A1 = (Z() || !(this.O0 || this.Q)) ? null : na7.q1(this.G0).A1(this.I0, getTopicId(), true);
        this.b0 = bkb.E0[this.F0 ? 1 : 0];
        this.H2 = false;
        this.k4 = false;
        this.l4 = false;
        this.m4 = false;
        this.y0 = false;
        this.z0 = false;
        this.q4 = (byte) 0;
        this.A3 = false;
        this.S1 = 0;
        this.T1 = false;
        this.E2 = false;
        boolean z18 = (l7c.D(this.g2) || this.v2) ? false : true;
        this.k2 = -1;
        if (!Z()) {
            this.i3 = null;
        }
        setOpenBotButton(false);
        if ((this.s2 || gba.l1) && this.K0 == 0 && !Z() && !V()) {
            this.a0 = false;
            i = 2;
        } else {
            this.a0 = true;
            i = 1;
        }
        k27 k27Var8 = this.g1;
        if (k27Var8 != null) {
            k27Var8.f6(false);
        }
        k27 k27Var9 = this.g1;
        CharSequence charSequence37 = k27Var9 != null ? k27Var9.v : null;
        if (charSequence37 instanceof Spannable) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence37);
            f2 = 16.0f;
            f = 17.0f;
            for (h4c h4cVar : (h4c[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), h4c.class)) {
                spannableStringBuilder.removeSpan(h4cVar);
            }
            for (g4c g4cVar : (g4c[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), g4c.class)) {
                spannableStringBuilder.removeSpan(g4cVar);
            }
            charSequence37 = spannableStringBuilder;
        } else {
            f = 17.0f;
            f2 = 16.0f;
        }
        this.j1 = charSequence37;
        if (this.G) {
            this.A3 = true;
            z = false;
            z18 = false;
        } else {
            z = true;
        }
        pe3 pe3Var = this.H0;
        if (pe3Var != null) {
            if (pe3Var.g == 2) {
                this.H2 = true;
                if (this.s2 || gba.l1) {
                    this.L2 = gl.L(12.5f);
                    if (k96.a0) {
                        this.K2 = (getMeasuredWidth() - gl.L(this.J + 6)) - bkb.Z0.getIntrinsicWidth();
                        this.y2 = gl.L(22.0f);
                    } else {
                        this.K2 = gl.L(this.J + 6);
                        this.y2 = bkb.Z0.getIntrinsicWidth() + gl.L(this.J + 10);
                    }
                } else {
                    this.L2 = gl.L(16.5f);
                    if (k96.a0) {
                        this.K2 = (getMeasuredWidth() - gl.L(this.J + 4)) - bkb.Z0.getIntrinsicWidth();
                        this.y2 = gl.L(18.0f);
                    } else {
                        this.K2 = gl.L(this.J + 4);
                        this.y2 = bkb.Z0.getIntrinsicWidth() + gl.L(this.J + 8);
                    }
                }
            } else {
                this.k4 = !this.o1 && pe3Var.i;
                if (this.s2 || gba.l1) {
                    if (k96.a0) {
                        this.y2 = gl.L(22.0f);
                    } else {
                        this.y2 = gl.L(this.J + 6);
                    }
                } else if (k96.a0) {
                    this.y2 = gl.L(18.0f);
                } else {
                    this.y2 = gl.L(this.J + 4);
                }
            }
            pe3 pe3Var2 = this.H0;
            if (pe3Var2.g == 1) {
                L0 = k96.L0(2131750487);
                pe3 pe3Var3 = this.H0;
                if (pe3Var3.j) {
                    this.b0 = bkb.G0[this.F0 ? 1 : 0];
                    R = R(i, this.g1.v, null);
                    R.setSpan(new cm4(bkb.n9, this.K4), 0, R.length(), 33);
                } else {
                    String str13 = pe3Var3.b;
                    if (str13.length() > 150) {
                        str13 = str13.substring(0, kk7.f2);
                    }
                    R = (this.s2 || gba.l1) ? R(i, str13, L0) : R(i, str13.replace('\n', ' '), L0);
                }
                CharSequence l2 = vu3.l(R, bkb.E0[this.F0 ? 1 : 0].getFontMetricsInt(), false);
                z10 = false;
                charSequence36 = l2;
            } else {
                String str14 = pe3Var2.b;
                if (pe3Var2.j) {
                    this.b0 = bkb.G0[this.F0 ? 1 : 0];
                }
                z10 = true;
                L0 = null;
                charSequence36 = str14;
            }
            c = '\n';
            str9 = k96.e1(this.H0.h);
            byte b = this.H0.d;
            if (b != 0) {
                this.H3 = true;
                str8 = String.format("%d", Integer.valueOf(b));
            } else {
                this.H3 = false;
                str8 = null;
            }
            pe3 pe3Var4 = this.H0;
            int i18 = pe3Var4.k;
            if (i18 == 2) {
                this.R2 = true;
                this.S2 = true;
                this.T2 = false;
            } else if (i18 == 1) {
                this.R2 = false;
                this.S2 = true;
                this.T2 = false;
            } else {
                this.T2 = false;
                this.R2 = false;
                this.S2 = false;
            }
            this.u3 = false;
            charSequence29 = charSequence36;
            charSequence26 = null;
            charSequence25 = "";
            i7 = -1;
            charSequence28 = pe3Var4.a;
        } else {
            c = '\n';
            if (this.s2 || gba.l1) {
                if (k96.a0) {
                    this.y2 = gl.L(22.0f);
                } else {
                    this.y2 = gl.L(this.J + 6);
                }
            } else if (k96.a0) {
                this.y2 = gl.L(18.0f);
            } else {
                this.y2 = gl.L(this.J + 4);
            }
            TLRPC.EncryptedChat encryptedChat = this.i2;
            int i19 = this.K0;
            if (encryptedChat != null) {
                if (i19 == 0) {
                    this.H2 = true;
                    if (this.s2 || gba.l1) {
                        this.L2 = gl.L(12.5f);
                        if (k96.a0) {
                            this.K2 = (getMeasuredWidth() - gl.L(this.J + 6)) - bkb.Z0.getIntrinsicWidth();
                            this.y2 = gl.L(22.0f);
                        } else {
                            this.K2 = gl.L(this.J + 6);
                            this.y2 = bkb.Z0.getIntrinsicWidth() + gl.L(this.J + 10);
                        }
                    } else {
                        this.L2 = gl.L(16.5f);
                        if (k96.a0) {
                            this.K2 = (getMeasuredWidth() - gl.L(this.J + 4)) - bkb.Z0.getIntrinsicWidth();
                            this.y2 = gl.L(18.0f);
                        } else {
                            this.K2 = gl.L(this.J + 4);
                            this.y2 = bkb.Z0.getIntrinsicWidth() + gl.L(this.J + 8);
                        }
                    }
                }
            } else if (i19 == 0 && !this.Q) {
                TLRPC.Chat chat2 = this.h2;
                if (chat2 != null) {
                    long c3 = cf3.c(chat2);
                    TLRPC.Chat chat3 = this.h2;
                    if (chat3.scam) {
                        this.q4 = (byte) 1;
                        bkb.f1.a();
                    } else if (chat3.fake) {
                        this.q4 = (byte) 2;
                        bkb.g1.a();
                    } else if (cf3.f(chat3.emoji_status) != 0) {
                        this.m4 = true;
                        this.E2 = true;
                        tl tlVar = this.o4;
                        tlVar.a = k96.a0;
                        tlVar.j(cf3.f(this.h2.emoji_status), false);
                        this.o4.m(cf3.A(this.h2.emoji_status), false);
                    } else {
                        boolean z19 = this.o1;
                        this.k4 = !z19 && this.h2.verified;
                        this.l4 = (z19 || this.h2.bot_verification_icon == 0) ? false : true;
                    }
                    charSequence = charSequence37;
                    j = c3;
                    i2 = i;
                } else {
                    TLRPC.User user3 = this.g2;
                    if (user3 != null) {
                        j = cf3.c(user3);
                        TLRPC.User user4 = this.g2;
                        if (user4.scam) {
                            this.q4 = (byte) 1;
                            bkb.f1.a();
                        } else if (user4.fake) {
                            this.q4 = (byte) 2;
                            bkb.g1.a();
                        } else {
                            boolean z20 = this.o1;
                            this.k4 = !z20 && user4.verified;
                            if (z20 || l7c.D(user4)) {
                                charSequence = charSequence37;
                            } else {
                                charSequence = charSequence37;
                                if (this.g2.bot_verification_icon != 0) {
                                    z2 = true;
                                    this.l4 = z2;
                                    na7.q1(this.G0);
                                    if (na7.A2(this.g2)) {
                                        long j2 = y6c.h(this.G0).n;
                                        i2 = i;
                                        long j3 = this.g2.id;
                                        if (j2 != j3 && j3 != 0) {
                                            z3 = true;
                                            this.m4 = z3;
                                            if (z3) {
                                                Long i20 = l7c.i(this.g2);
                                                tl tlVar2 = this.o4;
                                                tlVar2.a = k96.a0;
                                                if (i20 != null) {
                                                    this.E2 = true;
                                                    tlVar2.j(i20.longValue(), false);
                                                    this.o4.m(cf3.A(this.g2.emoji_status), false);
                                                } else {
                                                    this.E2 = true;
                                                    tlVar2.g(nh8.d().e, false);
                                                    this.o4.m(false, false);
                                                }
                                            }
                                        }
                                    } else {
                                        i2 = i;
                                    }
                                    z3 = false;
                                    this.m4 = z3;
                                    if (z3) {
                                    }
                                }
                            }
                            z2 = false;
                            this.l4 = z2;
                            na7.q1(this.G0);
                            if (na7.A2(this.g2)) {
                            }
                            z3 = false;
                            this.m4 = z3;
                            if (z3) {
                            }
                        }
                        charSequence = charSequence37;
                        na7.q1(this.G0);
                        if (na7.A2(this.g2)) {
                        }
                        z3 = false;
                        this.m4 = z3;
                        if (z3) {
                        }
                    } else {
                        i2 = i;
                        charSequence = charSequence37;
                        j = 0;
                    }
                }
                if (j != 0 && this.l4) {
                    this.p4.j(j, false);
                }
                i3 = this.S0;
                if (i3 == 0 && (k27Var5 = this.g1) != null) {
                    i3 = k27Var5.k.date;
                }
                if (!this.Q) {
                    boolean z21 = hq6.d0(this.G0).U(this.I0, (long) getTopicId()) != null;
                    this.l2 = z21;
                    TLRPC.DraftMessage T = !z21 ? hq6.d0(this.G0).T(this.I0, getTopicId()) : null;
                    this.m2 = T;
                    if (T != null && TextUtils.isEmpty(T.message)) {
                        this.m2 = null;
                    }
                } else if (this.O0 || this.t0) {
                    boolean z22 = hq6.d0(this.G0).U(this.I0, (long) getTopicId()) != null;
                    this.l2 = z22;
                    this.m2 = !z22 ? hq6.d0(this.G0).T(this.I0, 0L) : null;
                } else {
                    this.l2 = false;
                    this.m2 = null;
                }
                if (!this.l2) {
                    TLRPC.DraftMessage draftMessage2 = this.m2;
                    if (draftMessage2 != null) {
                        if (draftMessage2 != null && TextUtils.isEmpty(draftMessage2.message)) {
                            TLRPC.DraftMessage draftMessage3 = this.m2;
                            if (draftMessage3.rich_message == null) {
                                TLRPC.InputReplyTo inputReplyTo = draftMessage3.reply_to;
                                if (inputReplyTo != null) {
                                }
                                this.m2 = null;
                                this.l2 = false;
                                if (Z()) {
                                    int i21 = i2;
                                    if (TextUtils.isEmpty(this.J0)) {
                                        if (A1 != null) {
                                            this.j2 = A1;
                                            z4 = z18;
                                            charSequence2 = charSequence;
                                            int intValue = na7.q1(this.G0).B1(this.I0, getTopicId()).intValue();
                                            this.k2 = intValue;
                                            bya t0 = bkb.t0(intValue);
                                            int L8 = t0 != null ? gl.L(3.0f) + t0.getIntrinsicWidth() : 0;
                                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                            CharSequence replace = TextUtils.replace(A1, new String[]{"..."}, new String[]{""});
                                            i4 = this.k2 == 5 ? replace.toString().indexOf("**oo**") : -1;
                                            if (i4 >= 0) {
                                                spannableStringBuilder2.append(replace).setSpan(new se3(bkb.t0(this.k2).getIntrinsicWidth()), i4, i4 + 6, 0);
                                            } else {
                                                spannableStringBuilder2.append((CharSequence) " ").append(replace).setSpan(new se3(L8), 0, 1, 0);
                                            }
                                            z5 = false;
                                            charSequence3 = spannableStringBuilder2;
                                        } else {
                                            z4 = z18;
                                            charSequence2 = charSequence;
                                            this.j2 = null;
                                            this.k2 = -1;
                                            z5 = true;
                                            charSequence3 = "";
                                            i4 = -1;
                                        }
                                        if (this.l2 || this.m2 != null) {
                                            CharSequence charSequence38 = charSequence3;
                                            boolean z23 = z;
                                            L0 = k96.L0(2131751330);
                                            TLRPC.DraftMessage draftMessage4 = this.m2;
                                            if (draftMessage4 == null || !TextUtils.isEmpty(draftMessage4.message) || this.m2.rich_message != null) {
                                                TLRPC.DraftMessage draftMessage5 = this.m2;
                                                if (draftMessage5 != null && (richMessage = draftMessage5.rich_message) != null) {
                                                    charSequence4 = k27.e0(richMessage, kk7.f2);
                                                } else if (this.l2) {
                                                    charSequence4 = k96.L0(2131753979);
                                                } else if (draftMessage5 != null) {
                                                    String str15 = draftMessage5.message;
                                                    int length = str15.length();
                                                    charSequence4 = str15;
                                                    if (length > 150) {
                                                        charSequence4 = str15.subSequence(0, kk7.f2);
                                                    }
                                                } else {
                                                    charSequence4 = "";
                                                }
                                                SpannableString spannableString = new SpannableString(charSequence4);
                                                TLRPC.DraftMessage draftMessage6 = this.m2;
                                                if (draftMessage6 != null) {
                                                    hq6.i(draftMessage6, spannableString);
                                                    TLRPC.DraftMessage draftMessage7 = this.m2;
                                                    if (draftMessage7 != null && (arrayList = draftMessage7.entities) != null) {
                                                        TextPaint textPaint2 = this.b0;
                                                        hq6.a(textPaint2 == null ? null : textPaint2.getFontMetricsInt(), spannableString, arrayList);
                                                    }
                                                } else if (this.l2) {
                                                    spannableString.setSpan(new cm4(bkb.o9, this.K4), 0, spannableString.length(), 33);
                                                }
                                                SpannableStringBuilder R2 = R(i21, gl.J2(spannableString), L0);
                                                if ((this.s2 || gba.l1) && !V()) {
                                                    z6 = false;
                                                } else {
                                                    z6 = false;
                                                    R2.setSpan(new cm4(bkb.i9, this.K4), 0, L0.length() + 1, 33);
                                                }
                                                charSequence8 = vu3.l(R2, bkb.E0[this.F0 ? 1 : 0].getFontMetricsInt(), z6);
                                            } else if ((this.s2 || gba.l1) && !V()) {
                                                i5 = i4;
                                                charSequence5 = "";
                                                z18 = z4;
                                                charSequence6 = charSequence38;
                                                z = z23;
                                                charSequence7 = null;
                                                z17 = false;
                                                L02 = charSequence5;
                                            } else {
                                                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(L0);
                                                valueOf.setSpan(new cm4(bkb.i9, this.K4), 0, L0.length(), 33);
                                                charSequence8 = valueOf;
                                            }
                                            charSequence5 = charSequence8;
                                            i5 = i4;
                                            z18 = z4;
                                            charSequence6 = charSequence38;
                                            z = z23;
                                            charSequence7 = null;
                                            z17 = false;
                                            L02 = charSequence5;
                                        } else {
                                            if (this.i1) {
                                                this.b0 = bkb.G0[this.F0 ? 1 : 0];
                                                charSequence22 = k96.L0(2131749102);
                                            } else {
                                                k27 k27Var10 = this.g1;
                                                if (k27Var10 != null) {
                                                    String C1 = na7.q1(k27Var10.K1).C1(this.g1.k.restriction_reason);
                                                    long Z0 = this.g1.Z0();
                                                    boolean D = cf3.D(Z0);
                                                    int i22 = this.G0;
                                                    if (D) {
                                                        na7.q1(i22).V1(Long.valueOf(Z0));
                                                        K0 = null;
                                                    } else {
                                                        K0 = na7.q1(i22).K0(Long.valueOf(-Z0));
                                                    }
                                                    this.M3 = true;
                                                    if (this.k1 == 0 && this.I0 > 0 && this.g1.O3() && (tL_messageReactions = this.g1.k.reactions) != null && (arrayList2 = tL_messageReactions.recent_reactions) != null && !arrayList2.isEmpty() && this.W0 > 0) {
                                                        TLRPC.MessagePeerReaction messagePeerReaction = this.g1.k.reactions.recent_reactions.get(0);
                                                        if (messagePeerReaction.unread) {
                                                            long j4 = messagePeerReaction.peer_id.user_id;
                                                            if (j4 != 0) {
                                                                CharSequence charSequence39 = charSequence3;
                                                                z7 = z;
                                                                charSequence9 = charSequence39;
                                                                if (j4 != y6c.h(this.G0).n) {
                                                                    h19 d = h19.d(messagePeerReaction.reaction);
                                                                    this.b0 = bkb.G0[this.F0 ? 1 : 0];
                                                                    String str16 = d.f;
                                                                    z8 = true;
                                                                    if (str16 != null) {
                                                                        str = k96.Z(2131746210, str16);
                                                                        charSequence10 = charSequence39;
                                                                    } else {
                                                                        String Z2 = k96.Z(2131746210, "**reaction**");
                                                                        int indexOf = Z2.indexOf("**reaction**");
                                                                        ?? spannableStringBuilder3 = new SpannableStringBuilder(Z2.replace("**reaction**", "d"));
                                                                        long j5 = d.g;
                                                                        TextPaint textPaint3 = this.b0;
                                                                        spannableStringBuilder3.setSpan(new gm(j5, textPaint3 == null ? null : textPaint3.getFontMetricsInt()), indexOf, indexOf + 1, 0);
                                                                        str = spannableStringBuilder3;
                                                                        z8 = true;
                                                                        charSequence10 = charSequence39;
                                                                    }
                                                                    if (z8) {
                                                                        charSequence11 = str;
                                                                    } else {
                                                                        int i23 = this.k1;
                                                                        if (i23 == 2) {
                                                                            TLRPC.Chat chat4 = this.h2;
                                                                            if (chat4 != null) {
                                                                                if (hc2.T(chat4)) {
                                                                                    TLRPC.Chat chat5 = this.h2;
                                                                                    if (!chat5.megagroup) {
                                                                                        int i24 = chat5.participants_count;
                                                                                        str5 = i24 != 0 ? k96.I(i24, "Subscribers") : !hc2.t0(chat5) ? k96.L0(2131752317).toLowerCase() : k96.L0(2131752306).toLowerCase();
                                                                                    }
                                                                                }
                                                                                TLRPC.Chat chat6 = this.h2;
                                                                                int i25 = chat6.participants_count;
                                                                                str5 = i25 != 0 ? k96.I(i25, "Members") : chat6.has_geo ? k96.L0(2131748450) : !hc2.t0(chat6) ? k96.L0(2131748449).toLowerCase() : k96.L0(2131748446).toLowerCase();
                                                                            } else {
                                                                                str5 = "";
                                                                            }
                                                                            this.M3 = false;
                                                                            str4 = str5;
                                                                        } else if (i23 == 3 && l7c.D(this.g2)) {
                                                                            cj3 cj3Var = this.E4;
                                                                            str4 = k96.L0((cj3Var == null || !cj3Var.P0) ? 2131745704 : 2131745703);
                                                                        } else {
                                                                            boolean z24 = this.s2;
                                                                            if (!z24 && !gba.l1 && this.L0 != 0) {
                                                                                P = Q();
                                                                            } else if (z24 || gba.l1 || this.K0 == 0) {
                                                                                k27 k27Var11 = this.g1;
                                                                                if (!(k27Var11.k instanceof TLRPC.TL_messageService) || (k27.D4(k27Var11) && !(this.g1.k.action instanceof TLRPC.TL_messageActionTopicCreate))) {
                                                                                    CharSequence charSequence40 = charSequence2;
                                                                                    this.W = true;
                                                                                    l0();
                                                                                    String U2 = (this.s0 || (user2 = this.g2) == null || !user2.self || this.g1.O3()) ? null : gl.U(getMessageNameString());
                                                                                    if ((!this.s0 || (user = this.g2) == null || user.self || (k27Var3 = this.g1) == null || !k27Var3.O3()) && U2 == null && ((k27Var = this.g1) == null || (message = k27Var.k) == null || message.guestchat_via_from == null)) {
                                                                                        TLRPC.Chat chat7 = this.h2;
                                                                                        if (chat7 != null) {
                                                                                            long j6 = chat7.id;
                                                                                            if (j6 > 0) {
                                                                                                if (K0 != null) {
                                                                                                }
                                                                                                if (hc2.T(chat7)) {
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        TLRPC.User user5 = this.g2;
                                                                                        if (user5 == null || user5.id != 489000 || (k27Var2 = this.g1) == null || k27Var2.W0() == null) {
                                                                                            boolean isEmpty = TextUtils.isEmpty(C1);
                                                                                            CharSequence charSequence41 = C1;
                                                                                            if (isEmpty) {
                                                                                                boolean D4 = k27.D4(this.g1);
                                                                                                k27 k27Var12 = this.g1;
                                                                                                if (D4) {
                                                                                                    CharSequence charSequence42 = k27Var12.w;
                                                                                                    if (charSequence42 == null || ((k27Var12.k.action instanceof TLRPC.TL_messageActionTopicCreate) && this.Q)) {
                                                                                                        charSequence42 = k27Var12.v;
                                                                                                    }
                                                                                                    CharSequence charSequence43 = charSequence42;
                                                                                                    charSequence41 = charSequence43;
                                                                                                    if (k27Var12.i2[0] instanceof jm4) {
                                                                                                        TLRPC.TL_forumTopic f12 = na7.q1(this.G0).g4.f(-this.g1.A0(), k27.a2(this.G0, this.g1.k, true));
                                                                                                        charSequence41 = charSequence43;
                                                                                                        if (f12 != null) {
                                                                                                            ((jm4) this.g1.i2[0]).b(f12.icon_color);
                                                                                                            charSequence41 = charSequence43;
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    TLRPC.MessageMedia messageMedia = k27Var12.k.media;
                                                                                                    if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && (messageMedia.photo instanceof TLRPC.TL_photoEmpty) && messageMedia.ttl_seconds != 0) {
                                                                                                        charSequence41 = k96.L0(2131753944);
                                                                                                    } else {
                                                                                                        if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                                                                                                            TLRPC.Document document = messageMedia.document;
                                                                                                            if (((document instanceof TLRPC.TL_documentEmpty) || document == null) && messageMedia.ttl_seconds != 0) {
                                                                                                                charSequence41 = messageMedia.voice ? k96.L0(2131753926) : messageMedia.round ? k96.L0(2131753937) : k96.L0(2131753929);
                                                                                                            }
                                                                                                        }
                                                                                                        String str17 = "🎧 ";
                                                                                                        if (getCaptionMessage() == null || (this.g1.k.media instanceof TLRPC.TL_messageMediaPoll)) {
                                                                                                            k27 k27Var13 = this.g1;
                                                                                                            TLRPC.Message message2 = k27Var13.k;
                                                                                                            TLRPC.MessageMedia messageMedia2 = message2.media;
                                                                                                            if (messageMedia2 instanceof TLRPC.TL_messageMediaPaidMedia) {
                                                                                                                int size = ((TLRPC.TL_messageMediaPaidMedia) messageMedia2).extended_media.size();
                                                                                                                SpannableStringBuilder S0 = jva.S0(k96.Z(2131753946, this.T1 ? size > 1 ? k96.G(size, "Media", new Object[0]) : k96.L0(2131753930) : size > 1 ? k96.G(size, "Photos", new Object[0]) : k96.L0(2131753945)));
                                                                                                                this.b0 = bkb.G0[this.F0 ? 1 : 0];
                                                                                                                charSequence41 = S0;
                                                                                                            } else if (this.S1 > 1) {
                                                                                                                boolean z25 = this.T1;
                                                                                                                ArrayList arrayList3 = this.h1;
                                                                                                                String G = z25 ? k96.G(arrayList3 == null ? 0 : arrayList3.size(), "Media", new Object[0]) : k96.G(arrayList3 == null ? 0 : arrayList3.size(), "Photos", new Object[0]);
                                                                                                                this.b0 = bkb.G0[this.F0 ? 1 : 0];
                                                                                                                charSequence41 = G;
                                                                                                            } else {
                                                                                                                if (messageMedia2 instanceof TLRPC.TL_messageMediaGiveaway) {
                                                                                                                    TLRPC.MessageFwdHeader messageFwdHeader = message2.fwd_from;
                                                                                                                    if (messageFwdHeader != null) {
                                                                                                                        TLRPC.Peer peer = messageFwdHeader.from_id;
                                                                                                                        if (peer instanceof TLRPC.TL_peerChannel) {
                                                                                                                            V = hc2.U(this.G0, peer.channel_id);
                                                                                                                            charSequence13 = k96.L0(!V ? 2131753479 : 2131753473);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    V = hc2.V(this.h2);
                                                                                                                    charSequence13 = k96.L0(!V ? 2131753479 : 2131753473);
                                                                                                                } else if (messageMedia2 instanceof TLRPC.TL_messageMediaGiveawayResults) {
                                                                                                                    charSequence13 = k96.L0(2131753389);
                                                                                                                } else if (messageMedia2 instanceof TLRPC.TL_messageMediaPoll) {
                                                                                                                    TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia2;
                                                                                                                    TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageMediaPoll.poll.question;
                                                                                                                    if (tL_textWithEntities == null || tL_textWithEntities.entities == null) {
                                                                                                                        charSequence13 = bf3.a(R.drawable.dialog_media_poll_20, tL_textWithEntities.text, false);
                                                                                                                    } else {
                                                                                                                        SpannableString spannableString2 = new SpannableString(tL_messageMediaPoll.poll.question.text);
                                                                                                                        TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_messageMediaPoll.poll.question;
                                                                                                                        hq6.h(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableString2, -1);
                                                                                                                        hq6.a(bkb.E0[this.F0 ? 1 : 0].getFontMetricsInt(), spannableString2, tL_messageMediaPoll.poll.question.entities);
                                                                                                                        charSequence13 = bf3.a(R.drawable.dialog_media_poll_20, spannableString2, false);
                                                                                                                    }
                                                                                                                } else if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                                                                                                                    TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia2;
                                                                                                                    TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_messageMediaToDo.todo.title;
                                                                                                                    if (tL_textWithEntities3 == null || tL_textWithEntities3.entities == null) {
                                                                                                                        charSequence13 = bf3.a(R.drawable.dialog_media_checklist_20, tL_textWithEntities3.text, false);
                                                                                                                    } else {
                                                                                                                        SpannableString spannableString3 = new SpannableString(tL_messageMediaToDo.todo.title.text);
                                                                                                                        TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_messageMediaToDo.todo.title;
                                                                                                                        hq6.h(tL_textWithEntities4.entities, tL_textWithEntities4.text, spannableString3, -1);
                                                                                                                        hq6.a(bkb.E0[this.F0 ? 1 : 0].getFontMetricsInt(), spannableString3, tL_messageMediaToDo.todo.title.entities);
                                                                                                                        charSequence13 = bf3.a(R.drawable.dialog_media_checklist_20, spannableString3, false);
                                                                                                                    }
                                                                                                                } else if (messageMedia2 instanceof TLRPC.TL_messageMediaGame) {
                                                                                                                    charSequence13 = bf3.a(R.drawable.dialog_media_game_20, messageMedia2.game.title, false);
                                                                                                                } else if (messageMedia2 instanceof TLRPC.TL_messageMediaInvoice) {
                                                                                                                    charSequence13 = messageMedia2.title;
                                                                                                                } else if (k27Var13.D == 14) {
                                                                                                                    charSequence13 = tb4.q("🎧 ", k27Var13.w1(true), " - ", this.g1.y1(true));
                                                                                                                } else if (!(messageMedia2 instanceof TLRPC.TL_messageMediaStory) || !messageMedia2.via_mention) {
                                                                                                                    if (!k27Var13.r2() || TextUtils.isEmpty(this.g1.k.message)) {
                                                                                                                        SpannableString spannableString4 = new SpannableString(charSequence40);
                                                                                                                        k27 k27Var14 = this.g1;
                                                                                                                        if (k27Var14 != null) {
                                                                                                                            k27Var14.T5();
                                                                                                                        }
                                                                                                                        k27 k27Var15 = this.g1;
                                                                                                                        Pattern pattern = hq6.U1;
                                                                                                                        hq6.h(k27Var15.k.entities, k27Var15.v, spannableString4, kk7.m4);
                                                                                                                        k27 k27Var16 = this.g1;
                                                                                                                        charSequence12 = spannableString4;
                                                                                                                        if (k27Var16 != null) {
                                                                                                                            TLRPC.Message message3 = k27Var16.k;
                                                                                                                            charSequence12 = spannableString4;
                                                                                                                            if (message3 != null) {
                                                                                                                                ArrayList<TLRPC.MessageEntity> arrayList4 = message3.entities;
                                                                                                                                TextPaint textPaint4 = this.b0;
                                                                                                                                hq6.a(textPaint4 == null ? null : textPaint4.getFontMetricsInt(), spannableString4, arrayList4);
                                                                                                                                charSequence12 = spannableString4;
                                                                                                                            }
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        CharSequence charSequence44 = this.g1.c2;
                                                                                                                        int measuredWidth = getMeasuredWidth() - gl.L(this.J + 23);
                                                                                                                        k27 k27Var17 = this.g1;
                                                                                                                        charSequence12 = charSequence44;
                                                                                                                        if (k27Var17.b2) {
                                                                                                                            charSequence12 = gl.Q(charSequence44, (String) k27Var17.a2.get(0), measuredWidth, this.b0);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    gl.v1(charSequence12, this.g1.a2, this.K4);
                                                                                                                    charSequence13 = charSequence12;
                                                                                                                } else if (k27Var13.N3()) {
                                                                                                                    TLRPC.User V1 = na7.q1(this.G0).V1(Long.valueOf(this.g1.A0()));
                                                                                                                    if (V1 != null) {
                                                                                                                        str2 = l7c.j(V1);
                                                                                                                        int indexOf2 = str2.indexOf(32);
                                                                                                                        c2 = 0;
                                                                                                                        if (indexOf2 >= 0) {
                                                                                                                            str2 = str2.substring(0, indexOf2);
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        c2 = 0;
                                                                                                                        str2 = "";
                                                                                                                    }
                                                                                                                    Object[] objArr = new Object[1];
                                                                                                                    objArr[c2] = str2;
                                                                                                                    charSequence13 = k96.Z(2131744199, objArr);
                                                                                                                } else {
                                                                                                                    charSequence13 = k96.L0(2131744376);
                                                                                                                }
                                                                                                                CharSequence charSequence45 = charSequence13;
                                                                                                                k27 k27Var18 = this.g1;
                                                                                                                if (k27Var18.k.media == null || k27Var18.F3()) {
                                                                                                                    TL_iv.RichMessage richMessage2 = this.g1.k.rich_message;
                                                                                                                    charSequence41 = charSequence45;
                                                                                                                    if (richMessage2 != null) {
                                                                                                                        charSequence41 = charSequence45;
                                                                                                                        if (richMessage2.blocks.size() == 1) {
                                                                                                                            charSequence41 = charSequence45;
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                this.b0 = bkb.G0[this.F0 ? 1 : 0];
                                                                                                                charSequence41 = charSequence45;
                                                                                                            }
                                                                                                        } else {
                                                                                                            k27 captionMessage = getCaptionMessage();
                                                                                                            if (!this.W) {
                                                                                                                str17 = "";
                                                                                                            } else if (captionMessage.G4()) {
                                                                                                                str17 = "📹 ";
                                                                                                            } else if (captionMessage.O4()) {
                                                                                                                str17 = "🎤 ";
                                                                                                            } else if (!captionMessage.I3()) {
                                                                                                                str17 = captionMessage.Q3() ? "🖼 " : "📎 ";
                                                                                                            }
                                                                                                            if (!captionMessage.r2() || TextUtils.isEmpty(captionMessage.k.message)) {
                                                                                                                SpannableString spannableString5 = new SpannableString(captionMessage.z);
                                                                                                                if (captionMessage.k != null) {
                                                                                                                    captionMessage.T5();
                                                                                                                    hq6.h(captionMessage.k.entities, captionMessage.z, spannableString5, kk7.m4);
                                                                                                                    ArrayList<TLRPC.MessageEntity> arrayList5 = captionMessage.k.entities;
                                                                                                                    TextPaint textPaint5 = this.b0;
                                                                                                                    hq6.a(textPaint5 == null ? null : textPaint5.getFontMetricsInt(), spannableString5, arrayList5);
                                                                                                                }
                                                                                                                append = new SpannableStringBuilder(str17).append((CharSequence) spannableString5);
                                                                                                            } else {
                                                                                                                CharSequence charSequence46 = captionMessage.c2;
                                                                                                                int measuredWidth2 = getMeasuredWidth() - gl.L(this.J + 47);
                                                                                                                if (this.a0) {
                                                                                                                    measuredWidth2 = (int) (measuredWidth2 - this.b0.measureText(": "));
                                                                                                                }
                                                                                                                if (measuredWidth2 > 0 && captionMessage.b2) {
                                                                                                                    charSequence46 = gl.Q(charSequence46, (String) captionMessage.a2.get(0), measuredWidth2, this.b0);
                                                                                                                }
                                                                                                                append = new SpannableStringBuilder(str17).append(charSequence46);
                                                                                                            }
                                                                                                            charSequence41 = append;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            CharSequence charSequence47 = charSequence41;
                                                                                            if (this.g1.e4()) {
                                                                                                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(charSequence41);
                                                                                                spannableStringBuilder4.insert(0, (CharSequence) "d ");
                                                                                                spannableStringBuilder4.setSpan(new cm2(getContext().getDrawable(R.drawable.msg_mini_replystory).mutate()), 0, 1, 0);
                                                                                                charSequence47 = spannableStringBuilder4;
                                                                                            }
                                                                                            CharSequence charSequence48 = charSequence47;
                                                                                            if (this.S1 > 0) {
                                                                                                if (!this.g1.r2() || TextUtils.isEmpty(this.g1.k.message)) {
                                                                                                    int length2 = charSequence47.length();
                                                                                                    CharSequence charSequence49 = charSequence47;
                                                                                                    if (length2 > 150) {
                                                                                                        charSequence49 = charSequence47.subSequence(0, kk7.f2);
                                                                                                    }
                                                                                                    J2 = gl.J2(charSequence49);
                                                                                                } else {
                                                                                                    J2 = this.g1.c2;
                                                                                                    int measuredWidth3 = getMeasuredWidth() - gl.L((((this.M4 + 2) * this.S1) + (this.J + 23)) + 3);
                                                                                                    k27 k27Var19 = this.g1;
                                                                                                    if (k27Var19.b2) {
                                                                                                        J2 = gl.Q(J2, (String) k27Var19.a2.get(0), measuredWidth3, this.b0);
                                                                                                    }
                                                                                                }
                                                                                                CharSequence spannableStringBuilder5 = !(J2 instanceof SpannableStringBuilder) ? new SpannableStringBuilder(J2) : J2;
                                                                                                SpannableStringBuilder spannableStringBuilder6 = (SpannableStringBuilder) spannableStringBuilder5;
                                                                                                spannableStringBuilder6.insert(0, (CharSequence) " ");
                                                                                                spannableStringBuilder6.setSpan(new se3(gl.L(((this.M4 + 2) * this.S1) + 3)), 0, 1, 33);
                                                                                                vu3.l(spannableStringBuilder6, bkb.E0[this.F0 ? 1 : 0].getFontMetricsInt(), false);
                                                                                                CharSequence charSequence50 = spannableStringBuilder5;
                                                                                                if (this.g1.r2()) {
                                                                                                    CharSequence v14 = gl.v1(spannableStringBuilder6, this.g1.a2, this.K4);
                                                                                                    charSequence50 = spannableStringBuilder5;
                                                                                                    if (v14 != null) {
                                                                                                        charSequence50 = v14;
                                                                                                    }
                                                                                                }
                                                                                                z5 = false;
                                                                                                charSequence48 = charSequence50;
                                                                                            }
                                                                                            if (this.g1.j3() && this.g1.m5()) {
                                                                                                this.y0 = true;
                                                                                                SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(charSequence48);
                                                                                                spannableStringBuilder7.insert(0, (CharSequence) "d ");
                                                                                                cm2 cm2Var = new cm2(getContext().getDrawable(R.drawable.mini_forwarded).mutate());
                                                                                                cm2Var.x = 0.9f;
                                                                                                spannableStringBuilder7.setSpan(cm2Var, 0, 1, 0);
                                                                                                charSequence11 = spannableStringBuilder7;
                                                                                            } else {
                                                                                                charSequence11 = charSequence48;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    int i26 = -1;
                                                                                    if (U2 == null) {
                                                                                        U2 = getMessageNameString();
                                                                                    }
                                                                                    String U3 = gl.U(U2);
                                                                                    TLRPC.Chat chat8 = this.h2;
                                                                                    if (chat8 != null && chat8.forum && !this.Q && !this.P) {
                                                                                        CharSequence i27 = na7.q1(this.G0).g4.i(this.h2, this.g1, this.b0);
                                                                                        if (!TextUtils.isEmpty(i27)) {
                                                                                            SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder("-");
                                                                                            cm2 cm2Var2 = new cm2(a.b.getDrawable(R.drawable.msg_mini_forumarrow).mutate());
                                                                                            if (!this.s2 && !gba.l1) {
                                                                                                i26 = bkb.j9;
                                                                                            }
                                                                                            cm2Var2.a(i26);
                                                                                            spannableStringBuilder8.setSpan(cm2Var2, 0, 1, 0);
                                                                                            ?? spannableStringBuilder9 = new SpannableStringBuilder();
                                                                                            spannableStringBuilder9.append(U3).append((CharSequence) spannableStringBuilder8).append(i27);
                                                                                            str3 = spannableStringBuilder9;
                                                                                            SpannableStringBuilder U4 = U(i21, str3, C1, false);
                                                                                            if (!this.P || ((this.s2 || gba.l1) && (this.K0 == 0 || U4.length() <= 0))) {
                                                                                                i6 = 0;
                                                                                            } else {
                                                                                                try {
                                                                                                    cm4Var = new cm4(bkb.j9, this.K4);
                                                                                                    i6 = str3.length() + 1;
                                                                                                } catch (Exception e) {
                                                                                                    e = e;
                                                                                                    i6 = 0;
                                                                                                }
                                                                                                try {
                                                                                                    U4.setSpan(cm4Var, 0, i6, 33);
                                                                                                } catch (Exception e2) {
                                                                                                    e = e2;
                                                                                                    fa4.f(e);
                                                                                                    l = vu3.l(U4, bkb.E0[this.F0 ? 1 : 0].getFontMetricsInt(), false);
                                                                                                    if (this.g1.r2()) {
                                                                                                    }
                                                                                                    if (this.S1 > 0) {
                                                                                                    }
                                                                                                    charSequence14 = l;
                                                                                                    z = z7;
                                                                                                    z5 = false;
                                                                                                    if (this.L0 == 0) {
                                                                                                    }
                                                                                                    z17 = z5;
                                                                                                    charSequence18 = charSequence14;
                                                                                                    L0 = str6;
                                                                                                    i5 = i4;
                                                                                                    z18 = z4;
                                                                                                    charSequence19 = charSequence10;
                                                                                                    charSequence21 = charSequence18;
                                                                                                    charSequence7 = null;
                                                                                                    charSequence6 = charSequence19;
                                                                                                    L02 = charSequence21;
                                                                                                    CharSequence charSequence51 = L02;
                                                                                                    if (!this.y0) {
                                                                                                    }
                                                                                                    if (TextUtils.isEmpty(this.J0)) {
                                                                                                    }
                                                                                                    str7 = "";
                                                                                                    k27Var4 = this.g1;
                                                                                                    if (k27Var4 != null) {
                                                                                                    }
                                                                                                    this.R2 = false;
                                                                                                    this.S2 = false;
                                                                                                    this.T2 = k27Var4 == null && k27Var4.n4() && this.I0 == y6c.h(this.G0).e();
                                                                                                    z9 = false;
                                                                                                    this.H3 = false;
                                                                                                    this.c4 = false;
                                                                                                    this.d4 = false;
                                                                                                    this.e4 = false;
                                                                                                    this.u3 = false;
                                                                                                    str8 = null;
                                                                                                    str12 = null;
                                                                                                    this.Q2 = z9;
                                                                                                    na7 q1 = na7.q1(this.G0);
                                                                                                    CharSequence charSequence52 = charSequence51;
                                                                                                    if (this.k1 == 0) {
                                                                                                    }
                                                                                                    str9 = str7;
                                                                                                    charSequence24 = this.M0;
                                                                                                    if (charSequence24 == null) {
                                                                                                    }
                                                                                                    charSequence25 = charSequence6;
                                                                                                    z10 = z17;
                                                                                                    i7 = i5;
                                                                                                    charSequence26 = charSequence7;
                                                                                                    charSequence29 = charSequence52;
                                                                                                    charSequence28 = charSequence24;
                                                                                                    charSequence30 = L0;
                                                                                                    if (z) {
                                                                                                    }
                                                                                                    if (O()) {
                                                                                                    }
                                                                                                    if (k96.a0) {
                                                                                                    }
                                                                                                    if (this.H2) {
                                                                                                    }
                                                                                                    if (this.T2) {
                                                                                                    }
                                                                                                    if (this.a1) {
                                                                                                    }
                                                                                                    if (!this.m4) {
                                                                                                    }
                                                                                                    if (!z13) {
                                                                                                    }
                                                                                                    if (this.l4) {
                                                                                                    }
                                                                                                    L7 = this.z2 - gl.L(12.0f);
                                                                                                    if (L7 < 0) {
                                                                                                    }
                                                                                                    if (charSequence28 instanceof String) {
                                                                                                    }
                                                                                                    if (this.E2) {
                                                                                                    }
                                                                                                    int i28 = L7;
                                                                                                    float f13 = i28;
                                                                                                    this.S = bkb.A0[this.F0 ? 1 : 0].measureText(charSequence35.toString()) <= f13;
                                                                                                    CharSequence charSequence53 = charSequence35;
                                                                                                    if (!this.R) {
                                                                                                    }
                                                                                                    CharSequence l3 = vu3.l(charSequence53, bkb.A0[this.F0 ? 1 : 0].getFontMetricsInt(), false);
                                                                                                    k27 k27Var20 = this.g1;
                                                                                                    if (k27Var20 == null) {
                                                                                                    }
                                                                                                    if (this.R) {
                                                                                                    }
                                                                                                    this.C2 = (this.E2 || !staticLayout2.isRtlCharAt(0)) ? f4 : -gl.L(f6);
                                                                                                    this.D2 = this.A2.isRtlCharAt(0);
                                                                                                    this.q3 = gm.update(0, (View) this, this.q3, this.A2);
                                                                                                    if (this.s2) {
                                                                                                    }
                                                                                                    f9 = 39.0f;
                                                                                                    f10 = 8.0f;
                                                                                                    L = gl.L(11.0f);
                                                                                                    this.r3 = gl.L(32.0f);
                                                                                                    this.N2 = gl.L(13.0f);
                                                                                                    this.v3 = gl.L(42.33f);
                                                                                                    this.D3 = gl.L(43.0f);
                                                                                                    this.N3 = gl.L(42.33f);
                                                                                                    this.X2 = gl.L(13.0f);
                                                                                                    int measuredWidth4 = getMeasuredWidth() - gl.L(this.J + 21);
                                                                                                    if (k96.a0) {
                                                                                                    }
                                                                                                    i11 = L3;
                                                                                                    this.v0.F.set(L2, L, gl.L(56.0f) + L2, gl.L(56.0f) + L);
                                                                                                    i12 = 0;
                                                                                                    while (true) {
                                                                                                        imageReceiverArr = this.W1;
                                                                                                        if (i12 < imageReceiverArr.length) {
                                                                                                        }
                                                                                                        imageReceiverArr[i12].i0(((this.M4 + 2) * i12) + i11, ((gl.L(31.0f) + L) + (this.R ? gl.L(20.0f) : 0)) - ((this.s2 || gba.l1 || (wtcVar = this.u0) == null || wtcVar.t()) ? 0 : gl.L(9.0f)), gl.L(18.0f), gl.L(18.0f));
                                                                                                        i12++;
                                                                                                        L = L;
                                                                                                    }
                                                                                                    i13 = L;
                                                                                                    i14 = measuredWidth4;
                                                                                                    if (k96.a0) {
                                                                                                    }
                                                                                                    if (this.R) {
                                                                                                    }
                                                                                                    if (!this.s2) {
                                                                                                    }
                                                                                                    this.N2 -= gl.L(f7);
                                                                                                    this.X2 -= gl.L(f7);
                                                                                                    if (getIsPinned()) {
                                                                                                    }
                                                                                                    if (this.u3) {
                                                                                                    }
                                                                                                    if (this.u3) {
                                                                                                    }
                                                                                                    this.I3 = z14;
                                                                                                    if (z14) {
                                                                                                    }
                                                                                                    if (z10) {
                                                                                                    }
                                                                                                    max = Math.max(gl.L(12.0f), i14);
                                                                                                    this.h3 = gl.L((!this.s2 || gba.l1) ? 58.0f : 62.0f);
                                                                                                    if (!this.s2) {
                                                                                                    }
                                                                                                    this.h3 -= gl.L(!Z() ? 10.0f : 12.0f);
                                                                                                    Z = Z();
                                                                                                    boolean z26 = this.s2;
                                                                                                    if (!Z) {
                                                                                                    }
                                                                                                    if (this.R) {
                                                                                                    }
                                                                                                    this.o3 = gm.update(0, (View) this, this.o3, this.t3);
                                                                                                    if (TextUtils.isEmpty(charSequence26)) {
                                                                                                    }
                                                                                                    this.p3 = gm.update(0, (View) this, this.p3, this.i3);
                                                                                                    if (!TextUtils.isEmpty(charSequence25)) {
                                                                                                    }
                                                                                                    if (charSequence29 instanceof Spannable) {
                                                                                                    }
                                                                                                    if (this.s2) {
                                                                                                    }
                                                                                                    this.b0 = bkb.E0[this.F0 ? 1 : 0];
                                                                                                    charSequence32 = charSequence30;
                                                                                                    charSequence33 = null;
                                                                                                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                                                                                                    if (this.s2) {
                                                                                                    }
                                                                                                    if (this.S1 > 0) {
                                                                                                    }
                                                                                                    i17 = max;
                                                                                                    try {
                                                                                                        TextPaint textPaint6 = this.b0;
                                                                                                        float L9 = gl.L(1.0f);
                                                                                                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                                                                                                        this.f3 = lwa.b(charSequence32, textPaint6, i17, L9, i17, charSequence33 != null ? 1 : 2);
                                                                                                        max = i17;
                                                                                                        this.j3.addAll(this.k3);
                                                                                                        this.k3.clear();
                                                                                                        qla.b(this, this.f3, -2, -2, this.j3, this.k3);
                                                                                                    } catch (Exception e3) {
                                                                                                        e = e3;
                                                                                                        max = i17;
                                                                                                        this.f3 = null;
                                                                                                        fa4.f(e);
                                                                                                        int i29 = max;
                                                                                                        this.n3 = gm.update(0, (View) this, this.n3, this.f3);
                                                                                                        z15 = k96.a0;
                                                                                                        StaticLayout staticLayout3 = this.A2;
                                                                                                        if (z15) {
                                                                                                        }
                                                                                                        staticLayout = this.g3;
                                                                                                        if (staticLayout != null) {
                                                                                                        }
                                                                                                        n0();
                                                                                                    }
                                                                                                    int i292 = max;
                                                                                                    this.n3 = gm.update(0, (View) this, this.n3, this.f3);
                                                                                                    z15 = k96.a0;
                                                                                                    StaticLayout staticLayout32 = this.A2;
                                                                                                    if (z15) {
                                                                                                    }
                                                                                                    staticLayout = this.g3;
                                                                                                    if (staticLayout != null) {
                                                                                                    }
                                                                                                    n0();
                                                                                                }
                                                                                            }
                                                                                            l = vu3.l(U4, bkb.E0[this.F0 ? 1 : 0].getFontMetricsInt(), false);
                                                                                            if (this.g1.r2() && (v1 = gl.v1(l, this.g1.a2, this.K4)) != null) {
                                                                                                l = v1;
                                                                                            }
                                                                                            if (this.S1 > 0) {
                                                                                                if (!(l instanceof SpannableStringBuilder)) {
                                                                                                    l = new SpannableStringBuilder(l);
                                                                                                }
                                                                                                SpannableStringBuilder spannableStringBuilder10 = (SpannableStringBuilder) l;
                                                                                                if (i6 >= spannableStringBuilder10.length()) {
                                                                                                    spannableStringBuilder10.append((CharSequence) " ");
                                                                                                    spannableStringBuilder10.setSpan(new se3(gl.L(((this.M4 + 2) * this.S1) + 3)), spannableStringBuilder10.length() - 1, spannableStringBuilder10.length(), 33);
                                                                                                } else {
                                                                                                    spannableStringBuilder10.insert(i6, (CharSequence) " ");
                                                                                                    spannableStringBuilder10.setSpan(new se3(gl.L(((this.M4 + 2) * this.S1) + 3)), i6, i6 + 1, 33);
                                                                                                }
                                                                                            }
                                                                                            charSequence14 = l;
                                                                                            z = z7;
                                                                                            z5 = false;
                                                                                            if (this.L0 == 0) {
                                                                                                str6 = Q();
                                                                                            } else if (this.K0 != 0) {
                                                                                                str6 = P();
                                                                                            } else {
                                                                                                z17 = z5;
                                                                                                charSequence18 = charSequence14;
                                                                                                i5 = i4;
                                                                                                L0 = str3;
                                                                                                z18 = z4;
                                                                                                charSequence19 = charSequence10;
                                                                                                charSequence21 = charSequence18;
                                                                                                charSequence7 = null;
                                                                                                charSequence6 = charSequence19;
                                                                                                L02 = charSequence21;
                                                                                            }
                                                                                            z17 = z5;
                                                                                            charSequence18 = charSequence14;
                                                                                            L0 = str6;
                                                                                            i5 = i4;
                                                                                            z18 = z4;
                                                                                            charSequence19 = charSequence10;
                                                                                            charSequence21 = charSequence18;
                                                                                            charSequence7 = null;
                                                                                            charSequence6 = charSequence19;
                                                                                            L02 = charSequence21;
                                                                                        }
                                                                                    }
                                                                                    str3 = U3;
                                                                                    SpannableStringBuilder U42 = U(i21, str3, C1, false);
                                                                                    if (this.P) {
                                                                                    }
                                                                                    i6 = 0;
                                                                                    l = vu3.l(U42, bkb.E0[this.F0 ? 1 : 0].getFontMetricsInt(), false);
                                                                                    if (this.g1.r2()) {
                                                                                        l = v1;
                                                                                    }
                                                                                    if (this.S1 > 0) {
                                                                                    }
                                                                                    charSequence14 = l;
                                                                                    z = z7;
                                                                                    z5 = false;
                                                                                    if (this.L0 == 0) {
                                                                                    }
                                                                                    z17 = z5;
                                                                                    charSequence18 = charSequence14;
                                                                                    L0 = str6;
                                                                                    i5 = i4;
                                                                                    z18 = z4;
                                                                                    charSequence19 = charSequence10;
                                                                                    charSequence21 = charSequence18;
                                                                                    charSequence7 = null;
                                                                                    charSequence6 = charSequence19;
                                                                                    L02 = charSequence21;
                                                                                } else {
                                                                                    k27 k27Var21 = this.g1;
                                                                                    TLRPC.MessageAction messageAction = k27Var21.k.action;
                                                                                    if (messageAction instanceof TLRPC.TL_messageActionPhoneCall) {
                                                                                        boolean O3 = k27Var21.O3();
                                                                                        boolean z27 = ((TLRPC.TL_messageActionPhoneCall) messageAction).video;
                                                                                        charSequence15 = O3 ? bf3.a(z27 ? R.drawable.dialog_media_outgoing_video_call_20 : R.drawable.dialog_media_outgoing_call_20, charSequence2, false) : bf3.a(z27 ? R.drawable.dialog_media_incoming_video_call_20 : R.drawable.dialog_media_incoming_call_20, charSequence2, false);
                                                                                    } else {
                                                                                        CharSequence charSequence54 = charSequence2;
                                                                                        if (hc2.V(this.h2) && (this.g1.k.action instanceof TLRPC.TL_messageActionChannelMigrateFrom)) {
                                                                                            charSequence16 = "";
                                                                                            z4 = false;
                                                                                        } else {
                                                                                            charSequence15 = this.g1.w;
                                                                                            if (charSequence15 == null) {
                                                                                                charSequence16 = charSequence54;
                                                                                            }
                                                                                        }
                                                                                        this.b0 = bkb.G0[this.F0 ? 1 : 0];
                                                                                        if (this.g1.D != 21) {
                                                                                            l0();
                                                                                            charSequence11 = y(charSequence16);
                                                                                        } else {
                                                                                            charSequence11 = charSequence16;
                                                                                        }
                                                                                    }
                                                                                    charSequence16 = charSequence15;
                                                                                    this.b0 = bkb.G0[this.F0 ? 1 : 0];
                                                                                    if (this.g1.D != 21) {
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                P = P();
                                                                            }
                                                                            charSequence17 = P;
                                                                            z = z7;
                                                                            z5 = false;
                                                                            str3 = null;
                                                                            charSequence14 = charSequence17;
                                                                            if (this.L0 == 0) {
                                                                            }
                                                                            z17 = z5;
                                                                            charSequence18 = charSequence14;
                                                                            L0 = str6;
                                                                            i5 = i4;
                                                                            z18 = z4;
                                                                            charSequence19 = charSequence10;
                                                                            charSequence21 = charSequence18;
                                                                            charSequence7 = null;
                                                                            charSequence6 = charSequence19;
                                                                            L02 = charSequence21;
                                                                        }
                                                                        z = false;
                                                                        str3 = null;
                                                                        z4 = false;
                                                                        charSequence14 = str4;
                                                                        if (this.L0 == 0) {
                                                                        }
                                                                        z17 = z5;
                                                                        charSequence18 = charSequence14;
                                                                        L0 = str6;
                                                                        i5 = i4;
                                                                        z18 = z4;
                                                                        charSequence19 = charSequence10;
                                                                        charSequence21 = charSequence18;
                                                                        charSequence7 = null;
                                                                        charSequence6 = charSequence19;
                                                                        L02 = charSequence21;
                                                                    }
                                                                    z = z7;
                                                                    charSequence17 = charSequence11;
                                                                    str3 = null;
                                                                    charSequence14 = charSequence17;
                                                                    if (this.L0 == 0) {
                                                                    }
                                                                    z17 = z5;
                                                                    charSequence18 = charSequence14;
                                                                    L0 = str6;
                                                                    i5 = i4;
                                                                    z18 = z4;
                                                                    charSequence19 = charSequence10;
                                                                    charSequence21 = charSequence18;
                                                                    charSequence7 = null;
                                                                    charSequence6 = charSequence19;
                                                                    L02 = charSequence21;
                                                                }
                                                                str = "";
                                                                z8 = false;
                                                                charSequence10 = charSequence9;
                                                                if (z8) {
                                                                }
                                                                z = z7;
                                                                charSequence17 = charSequence11;
                                                                str3 = null;
                                                                charSequence14 = charSequence17;
                                                                if (this.L0 == 0) {
                                                                }
                                                                z17 = z5;
                                                                charSequence18 = charSequence14;
                                                                L0 = str6;
                                                                i5 = i4;
                                                                z18 = z4;
                                                                charSequence19 = charSequence10;
                                                                charSequence21 = charSequence18;
                                                                charSequence7 = null;
                                                                charSequence6 = charSequence19;
                                                                L02 = charSequence21;
                                                            }
                                                        }
                                                    }
                                                    charSequence9 = charSequence3;
                                                    z7 = z;
                                                    str = "";
                                                    z8 = false;
                                                    charSequence10 = charSequence9;
                                                    if (z8) {
                                                    }
                                                    z = z7;
                                                    charSequence17 = charSequence11;
                                                    str3 = null;
                                                    charSequence14 = charSequence17;
                                                    if (this.L0 == 0) {
                                                    }
                                                    z17 = z5;
                                                    charSequence18 = charSequence14;
                                                    L0 = str6;
                                                    i5 = i4;
                                                    z18 = z4;
                                                    charSequence19 = charSequence10;
                                                    charSequence21 = charSequence18;
                                                    charSequence7 = null;
                                                    charSequence6 = charSequence19;
                                                    L02 = charSequence21;
                                                } else if (this.L0 != 0) {
                                                    charSequence22 = Q();
                                                } else if (this.K0 != 0) {
                                                    charSequence22 = P();
                                                } else {
                                                    TLRPC.EncryptedChat encryptedChat2 = this.i2;
                                                    if (encryptedChat2 != null) {
                                                        this.b0 = bkb.G0[this.F0 ? 1 : 0];
                                                        if (encryptedChat2 instanceof TLRPC.TL_encryptedChatRequested) {
                                                            charSequence22 = k96.L0(2131751117);
                                                        } else if (encryptedChat2 instanceof TLRPC.TL_encryptedChatWaiting) {
                                                            charSequence22 = k96.Z(2131753754, l7c.j(this.g2));
                                                        } else if (encryptedChat2 instanceof TLRPC.TL_encryptedChatDiscarded) {
                                                            charSequence22 = k96.L0(2131751116);
                                                        } else if (encryptedChat2 instanceof TLRPC.TL_encryptedChat) {
                                                            charSequence22 = encryptedChat2.admin_id == y6c.h(this.G0).e() ? k96.Z(2131751128, l7c.j(this.g2)) : k96.L0(2131751129);
                                                        }
                                                    } else if (this.k1 == 3 && l7c.D(this.g2)) {
                                                        cj3 cj3Var2 = this.E4;
                                                        int i30 = (cj3Var2 == null || !cj3Var2.P0) ? 2131745704 : 2131745703;
                                                        z17 = z5;
                                                        z = false;
                                                        i5 = i4;
                                                        L0 = null;
                                                        charSequence7 = null;
                                                        z18 = false;
                                                        L02 = k96.L0(i30);
                                                        charSequence6 = charSequence3;
                                                    }
                                                    z17 = z5;
                                                    i5 = i4;
                                                    charSequence20 = "";
                                                    z18 = z4;
                                                    L0 = null;
                                                    charSequence19 = charSequence3;
                                                    charSequence21 = charSequence20;
                                                    charSequence7 = null;
                                                    charSequence6 = charSequence19;
                                                    L02 = charSequence21;
                                                }
                                            }
                                            z17 = z5;
                                            i5 = i4;
                                            charSequence20 = charSequence22;
                                            z18 = z4;
                                            L0 = null;
                                            charSequence19 = charSequence3;
                                            charSequence21 = charSequence20;
                                            charSequence7 = null;
                                            charSequence6 = charSequence19;
                                            L02 = charSequence21;
                                        }
                                        CharSequence charSequence512 = L02;
                                        if (!this.y0) {
                                            charSequence512 = L02;
                                            if (!Y()) {
                                                charSequence512 = L02;
                                                if (!Z()) {
                                                    charSequence512 = L02;
                                                    if (!X()) {
                                                        charSequence512 = L02;
                                                        if (this.m2 == null) {
                                                            k27 k27Var22 = this.g1;
                                                            charSequence512 = L02;
                                                            if (k27Var22 != null) {
                                                                TLRPC.Message message4 = k27Var22.k;
                                                                charSequence512 = L02;
                                                                if (message4 != null) {
                                                                    charSequence512 = L02;
                                                                    if (message4.action instanceof TLRPC.TL_messageActionStarGift) {
                                                                        this.z0 = true;
                                                                        SpannableStringBuilder spannableStringBuilder11 = new SpannableStringBuilder(L02);
                                                                        spannableStringBuilder11.insert(0, (CharSequence) "d ");
                                                                        cm2 cm2Var3 = new cm2(getContext().getDrawable(R.drawable.mini_gift).mutate());
                                                                        cm2Var3.I = 1.25f;
                                                                        cm2Var3.J = 1.25f;
                                                                        cm2Var3.H = 0.9f;
                                                                        cm2Var3.x = 0.9f;
                                                                        spannableStringBuilder11.setSpan(cm2Var3, 0, 1, 0);
                                                                        TLRPC.TL_textWithEntities tL_textWithEntities5 = ((TLRPC.TL_messageActionStarGift) this.g1.k.action).message;
                                                                        if (tL_textWithEntities5 != null && !TextUtils.isEmpty(tL_textWithEntities5.text)) {
                                                                            this.b0 = bkb.E0[this.F0 ? 1 : 0];
                                                                        }
                                                                        charSequence512 = spannableStringBuilder11;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if (TextUtils.isEmpty(this.J0)) {
                                            if (this.m2 != null) {
                                                str7 = k96.e1(r5.date);
                                            } else {
                                                int i31 = this.S0;
                                                if (i31 != 0) {
                                                    str7 = k96.e1(i31);
                                                } else {
                                                    if (this.g1 != null) {
                                                        str7 = k96.e1(r5.k.date);
                                                    }
                                                }
                                            }
                                            k27Var4 = this.g1;
                                            if (k27Var4 != null || this.s0) {
                                                this.R2 = false;
                                                this.S2 = false;
                                                this.T2 = k27Var4 == null && k27Var4.n4() && this.I0 == y6c.h(this.G0).e();
                                                z9 = false;
                                                this.H3 = false;
                                                this.c4 = false;
                                                this.d4 = false;
                                                this.e4 = false;
                                                this.u3 = false;
                                                str8 = null;
                                                str12 = null;
                                            } else {
                                                if (this.K0 != 0) {
                                                    int i32 = this.T0;
                                                    int i33 = this.V0;
                                                    int i34 = i32 + i33;
                                                    if (i34 <= 0) {
                                                        z12 = false;
                                                        this.H3 = false;
                                                        this.c4 = false;
                                                        str11 = null;
                                                    } else if (i32 > i33) {
                                                        this.H3 = true;
                                                        z12 = false;
                                                        this.c4 = false;
                                                        str10 = String.format("%d", Integer.valueOf(i34));
                                                        str11 = null;
                                                        this.d4 = z12;
                                                        this.e4 = z12;
                                                    } else {
                                                        z12 = false;
                                                        this.H3 = false;
                                                        this.c4 = true;
                                                        str11 = String.format("%d", Integer.valueOf(i34));
                                                    }
                                                    str10 = null;
                                                    this.d4 = z12;
                                                    this.e4 = z12;
                                                } else {
                                                    if (this.i1) {
                                                        this.H3 = false;
                                                        z18 = false;
                                                        z11 = true;
                                                    } else {
                                                        int i35 = this.T0;
                                                        z11 = true;
                                                        if (i35 != 0) {
                                                            this.H3 = true;
                                                            str10 = String.format("%d", Integer.valueOf(i35));
                                                        } else if (this.U0) {
                                                            this.H3 = true;
                                                            str10 = "";
                                                        } else {
                                                            this.H3 = false;
                                                        }
                                                        if (this.V0 == 0) {
                                                            this.c4 = z11;
                                                            str11 = "@";
                                                        } else {
                                                            this.c4 = false;
                                                            str11 = null;
                                                        }
                                                        this.d4 = this.W0 <= 0;
                                                        this.e4 = this.X0 <= 0;
                                                    }
                                                    str10 = null;
                                                    if (this.V0 == 0) {
                                                    }
                                                    this.d4 = this.W0 <= 0;
                                                    this.e4 = this.X0 <= 0;
                                                }
                                                if (this.g1.N3() && this.m2 == null && z18) {
                                                    k27 k27Var23 = this.g1;
                                                    if (!(k27Var23.k.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                                                        if (k27Var23.n4()) {
                                                            z9 = false;
                                                            this.R2 = false;
                                                            this.S2 = false;
                                                            this.T2 = true;
                                                            this.u3 = false;
                                                        } else {
                                                            if (this.g1.m4()) {
                                                                this.R2 = false;
                                                                this.S2 = false;
                                                                this.T2 = false;
                                                                this.u3 = true;
                                                                this.H3 = false;
                                                                this.c4 = false;
                                                            } else if (this.g1.p4()) {
                                                                TLRPC.TL_forumTopic tL_forumTopic = this.O;
                                                                if (tL_forumTopic != null) {
                                                                    this.R2 = tL_forumTopic.read_outbox_max_id >= this.g1.e1();
                                                                } else if (this.O0) {
                                                                    int i36 = this.I4;
                                                                    this.R2 = (i36 > 0 && i36 >= this.g1.e1()) || !this.g1.E4() || (hc2.T(this.h2) && !this.h2.megagroup);
                                                                } else {
                                                                    this.R2 = !this.g1.E4() || (hc2.T(this.h2) && !this.h2.megagroup);
                                                                }
                                                                this.S2 = true;
                                                                z9 = false;
                                                                this.T2 = false;
                                                                this.u3 = false;
                                                            }
                                                            z9 = false;
                                                        }
                                                        str12 = str11;
                                                        str8 = str10;
                                                    }
                                                }
                                                z9 = false;
                                                this.R2 = false;
                                                this.S2 = false;
                                                this.T2 = false;
                                                this.u3 = false;
                                                str12 = str11;
                                                str8 = str10;
                                            }
                                            this.Q2 = z9;
                                            na7 q12 = na7.q1(this.G0);
                                            CharSequence charSequence522 = charSequence512;
                                            if (this.k1 == 0) {
                                                charSequence522 = charSequence512;
                                                if (q12.B2(this.I0, true)) {
                                                    this.A3 = true;
                                                    this.Q2 = true;
                                                    int i37 = q12.t2;
                                                    charSequence522 = charSequence512;
                                                    if (i37 == 0) {
                                                        str7 = k96.L0(2131743542);
                                                        charSequence522 = charSequence512;
                                                    } else if (i37 == 1) {
                                                        str7 = k96.N0("PsaType_" + q12.v2);
                                                        if (TextUtils.isEmpty(str7)) {
                                                            str7 = k96.L0(2131746400);
                                                        }
                                                        charSequence522 = charSequence512;
                                                        if (!TextUtils.isEmpty(q12.u2)) {
                                                            String str18 = q12.u2;
                                                            this.S1 = 0;
                                                            charSequence522 = str18;
                                                        }
                                                    }
                                                }
                                            }
                                            str9 = str7;
                                            charSequence24 = this.M0;
                                            if (charSequence24 == null) {
                                                if (this.K0 != 0) {
                                                    charSequence24 = k96.L0(2131754133);
                                                } else {
                                                    TLRPC.Chat chat9 = this.h2;
                                                    if (chat9 != null) {
                                                        if (this.P) {
                                                            Drawable[] drawableArr = this.i0;
                                                            if (drawableArr == null) {
                                                                drawableArr = new Drawable[1];
                                                                this.i0 = drawableArr;
                                                            }
                                                            drawableArr[0] = null;
                                                            U = na7.q1(this.G0).g4.j(this.h2, this.g1, this.b0, this.i0);
                                                        } else if (this.Q) {
                                                            Drawable[] drawableArr2 = this.i0;
                                                            if (drawableArr2 == null) {
                                                                drawableArr2 = new Drawable[1];
                                                                this.i0 = drawableArr2;
                                                            }
                                                            drawableArr2[0] = null;
                                                            boolean z28 = this.h0;
                                                            TLRPC.TL_forumTopic tL_forumTopic2 = this.O;
                                                            U = z28 ? mm4.k(tL_forumTopic2, bkb.A0[this.F0 ? 1 : 0], drawableArr2) : gl.U(tL_forumTopic2.title);
                                                        } else if (!chat9.monoforum || chat9.linked_monoforum_id == 0) {
                                                            U = gl.U(chat9.title);
                                                        } else {
                                                            TLRPC.Chat K02 = na7.q1(this.G0).K0(Long.valueOf(this.h2.linked_monoforum_id));
                                                            if (K02 != null) {
                                                                SpannableStringBuilder spannableStringBuilder12 = new SpannableStringBuilder(gl.U(K02.title));
                                                                spannableStringBuilder12.append((CharSequence) " ");
                                                                int length3 = spannableStringBuilder12.length();
                                                                spannableStringBuilder12.append((CharSequence) k96.L0(2131748155));
                                                                spannableStringBuilder12.setSpan(new od4(k96.L0(2131748155), bkb.x6, this.K4), length3, spannableStringBuilder12.length(), 33);
                                                                charSequence24 = spannableStringBuilder12;
                                                            } else {
                                                                charSequence24 = gl.U(this.h2.title);
                                                            }
                                                        }
                                                        charSequence24 = U;
                                                    } else {
                                                        TLRPC.User user6 = this.g2;
                                                        if (user6 != null) {
                                                            if (l7c.B(user6)) {
                                                                U = k96.L0(2131746073);
                                                            } else if (l7c.u(this.g2)) {
                                                                U = k96.L0(2131754249);
                                                            } else if (!l7c.D(this.g2) || this.r0) {
                                                                if (this.Q) {
                                                                    Drawable[] drawableArr3 = this.i0;
                                                                    if (drawableArr3 == null) {
                                                                        drawableArr3 = new Drawable[1];
                                                                        this.i0 = drawableArr3;
                                                                    }
                                                                    drawableArr3[0] = null;
                                                                    boolean z29 = this.h0;
                                                                    TLRPC.TL_forumTopic tL_forumTopic3 = this.O;
                                                                    U = z29 ? mm4.k(tL_forumTopic3, bkb.A0[this.F0 ? 1 : 0], drawableArr3) : gl.U(tL_forumTopic3.title);
                                                                } else {
                                                                    U = gl.U(l7c.r(this.g2));
                                                                }
                                                            } else if (this.s0) {
                                                                U = k96.L0(2131748111);
                                                            } else if (this.v2) {
                                                                U = k96.L0(2131750487);
                                                            } else {
                                                                if (this.k1 == 3) {
                                                                    this.A3 = true;
                                                                }
                                                                U = k96.L0(2131745709);
                                                            }
                                                            charSequence24 = U;
                                                        }
                                                        charSequence24 = "";
                                                    }
                                                    if (charSequence24 != null && charSequence24.length() == 0) {
                                                        charSequence24 = k96.L0(2131749136);
                                                    }
                                                }
                                            }
                                            charSequence25 = charSequence6;
                                            z10 = z17;
                                            i7 = i5;
                                            charSequence26 = charSequence7;
                                            charSequence29 = charSequence522;
                                            charSequence28 = charSequence24;
                                        }
                                        str7 = "";
                                        k27Var4 = this.g1;
                                        if (k27Var4 != null) {
                                        }
                                        this.R2 = false;
                                        this.S2 = false;
                                        this.T2 = k27Var4 == null && k27Var4.n4() && this.I0 == y6c.h(this.G0).e();
                                        z9 = false;
                                        this.H3 = false;
                                        this.c4 = false;
                                        this.d4 = false;
                                        this.e4 = false;
                                        this.u3 = false;
                                        str8 = null;
                                        str12 = null;
                                        this.Q2 = z9;
                                        na7 q122 = na7.q1(this.G0);
                                        CharSequence charSequence5222 = charSequence512;
                                        if (this.k1 == 0) {
                                        }
                                        str9 = str7;
                                        charSequence24 = this.M0;
                                        if (charSequence24 == null) {
                                        }
                                        charSequence25 = charSequence6;
                                        z10 = z17;
                                        i7 = i5;
                                        charSequence26 = charSequence7;
                                        charSequence29 = charSequence5222;
                                        charSequence28 = charSequence24;
                                    } else {
                                        this.m2 = null;
                                        this.l2 = false;
                                        String str19 = this.J0;
                                        this.b0 = bkb.E0[this.F0 ? 1 : 0];
                                        L0 = null;
                                        charSequence23 = null;
                                        charSequence27 = str19;
                                    }
                                } else {
                                    this.m2 = null;
                                    this.l2 = false;
                                    this.W = true;
                                    l0();
                                    L0 = hc2.p0(this.h2) ? null : gl.U(getMessageNameString());
                                    if (hc2.p0(this.h2)) {
                                        i8 = i2;
                                        if (i8 == 1) {
                                            i8 = 2;
                                        }
                                        L0 = null;
                                        if (i8 == 3) {
                                            i8 = 4;
                                        }
                                    } else {
                                        i8 = i2;
                                    }
                                    CharSequence S = S();
                                    k27 k27Var24 = this.g1;
                                    String U5 = this.g1 != null ? U(i8, L0, k27Var24 != null ? na7.q1(k27Var24.K1).C1(this.g1.k.restriction_reason) : null, true) : "";
                                    CharSequence charSequence55 = U5;
                                    if (this.f0) {
                                        int length4 = U5.length();
                                        charSequence55 = U5;
                                        charSequence55 = U5;
                                        if (length4 >= 0 && L0 != null) {
                                            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(U5);
                                            valueOf2.setSpan(new cm4(bkb.W8, this.K4), 0, Math.min(valueOf2.length(), L0.length() + 1), 0);
                                            charSequence55 = valueOf2;
                                        }
                                    }
                                    this.b0 = bkb.E0[this.F0 ? 1 : 0];
                                    charSequence23 = charSequence55;
                                    charSequence27 = S;
                                }
                                L02 = charSequence27;
                                charSequence6 = "";
                                i5 = -1;
                                charSequence7 = charSequence23;
                                CharSequence charSequence5122 = L02;
                                if (!this.y0) {
                                }
                                if (TextUtils.isEmpty(this.J0)) {
                                }
                                str7 = "";
                                k27Var4 = this.g1;
                                if (k27Var4 != null) {
                                }
                                this.R2 = false;
                                this.S2 = false;
                                this.T2 = k27Var4 == null && k27Var4.n4() && this.I0 == y6c.h(this.G0).e();
                                z9 = false;
                                this.H3 = false;
                                this.c4 = false;
                                this.d4 = false;
                                this.e4 = false;
                                this.u3 = false;
                                str8 = null;
                                str12 = null;
                                this.Q2 = z9;
                                na7 q1222 = na7.q1(this.G0);
                                CharSequence charSequence52222 = charSequence5122;
                                if (this.k1 == 0) {
                                }
                                str9 = str7;
                                charSequence24 = this.M0;
                                if (charSequence24 == null) {
                                }
                                charSequence25 = charSequence6;
                                z10 = z17;
                                i7 = i5;
                                charSequence26 = charSequence7;
                                charSequence29 = charSequence52222;
                                charSequence28 = charSequence24;
                            }
                        }
                    }
                    if (hc2.T(this.h2)) {
                        TLRPC.Chat chat10 = this.h2;
                        if (!chat10.megagroup) {
                            if (!chat10.creator) {
                                TLRPC.TL_chatAdminRights tL_chatAdminRights = chat10.admin_rights;
                                if (tL_chatAdminRights != null) {
                                }
                                this.m2 = null;
                                this.l2 = false;
                                if (Z()) {
                                }
                                L02 = charSequence27;
                                charSequence6 = "";
                                i5 = -1;
                                charSequence7 = charSequence23;
                                CharSequence charSequence51222 = L02;
                                if (!this.y0) {
                                }
                                if (TextUtils.isEmpty(this.J0)) {
                                }
                                str7 = "";
                                k27Var4 = this.g1;
                                if (k27Var4 != null) {
                                }
                                this.R2 = false;
                                this.S2 = false;
                                this.T2 = k27Var4 == null && k27Var4.n4() && this.I0 == y6c.h(this.G0).e();
                                z9 = false;
                                this.H3 = false;
                                this.c4 = false;
                                this.d4 = false;
                                this.e4 = false;
                                this.u3 = false;
                                str8 = null;
                                str12 = null;
                                this.Q2 = z9;
                                na7 q12222 = na7.q1(this.G0);
                                CharSequence charSequence522222 = charSequence51222;
                                if (this.k1 == 0) {
                                }
                                str9 = str7;
                                charSequence24 = this.M0;
                                if (charSequence24 == null) {
                                }
                                charSequence25 = charSequence6;
                                z10 = z17;
                                i7 = i5;
                                charSequence26 = charSequence7;
                                charSequence29 = charSequence522222;
                                charSequence28 = charSequence24;
                            }
                        }
                    }
                    chat = this.h2;
                    if (chat != null) {
                        if (chat.left) {
                        }
                        this.m2 = null;
                        this.l2 = false;
                        if (Z()) {
                        }
                        L02 = charSequence27;
                        charSequence6 = "";
                        i5 = -1;
                        charSequence7 = charSequence23;
                        CharSequence charSequence512222 = L02;
                        if (!this.y0) {
                        }
                        if (TextUtils.isEmpty(this.J0)) {
                        }
                        str7 = "";
                        k27Var4 = this.g1;
                        if (k27Var4 != null) {
                        }
                        this.R2 = false;
                        this.S2 = false;
                        this.T2 = k27Var4 == null && k27Var4.n4() && this.I0 == y6c.h(this.G0).e();
                        z9 = false;
                        this.H3 = false;
                        this.c4 = false;
                        this.d4 = false;
                        this.e4 = false;
                        this.u3 = false;
                        str8 = null;
                        str12 = null;
                        this.Q2 = z9;
                        na7 q122222 = na7.q1(this.G0);
                        CharSequence charSequence5222222 = charSequence512222;
                        if (this.k1 == 0) {
                        }
                        str9 = str7;
                        charSequence24 = this.M0;
                        if (charSequence24 == null) {
                        }
                        charSequence25 = charSequence6;
                        z10 = z17;
                        i7 = i5;
                        charSequence26 = charSequence7;
                        charSequence29 = charSequence5222222;
                        charSequence28 = charSequence24;
                    }
                    if (hc2.c0(chat)) {
                    }
                    if (Z()) {
                    }
                    L02 = charSequence27;
                    charSequence6 = "";
                    i5 = -1;
                    charSequence7 = charSequence23;
                    CharSequence charSequence5122222 = L02;
                    if (!this.y0) {
                    }
                    if (TextUtils.isEmpty(this.J0)) {
                    }
                    str7 = "";
                    k27Var4 = this.g1;
                    if (k27Var4 != null) {
                    }
                    this.R2 = false;
                    this.S2 = false;
                    this.T2 = k27Var4 == null && k27Var4.n4() && this.I0 == y6c.h(this.G0).e();
                    z9 = false;
                    this.H3 = false;
                    this.c4 = false;
                    this.d4 = false;
                    this.e4 = false;
                    this.u3 = false;
                    str8 = null;
                    str12 = null;
                    this.Q2 = z9;
                    na7 q1222222 = na7.q1(this.G0);
                    CharSequence charSequence52222222 = charSequence5122222;
                    if (this.k1 == 0) {
                    }
                    str9 = str7;
                    charSequence24 = this.M0;
                    if (charSequence24 == null) {
                    }
                    charSequence25 = charSequence6;
                    z10 = z17;
                    i7 = i5;
                    charSequence26 = charSequence7;
                    charSequence29 = charSequence52222222;
                    charSequence28 = charSequence24;
                }
                draftMessage = this.m2;
                if (draftMessage != null) {
                    if (i3 > draftMessage.date) {
                    }
                }
                if (hc2.T(this.h2)) {
                }
                chat = this.h2;
                if (chat != null) {
                }
                if (hc2.c0(chat)) {
                }
                if (Z()) {
                }
                L02 = charSequence27;
                charSequence6 = "";
                i5 = -1;
                charSequence7 = charSequence23;
                CharSequence charSequence51222222 = L02;
                if (!this.y0) {
                }
                if (TextUtils.isEmpty(this.J0)) {
                }
                str7 = "";
                k27Var4 = this.g1;
                if (k27Var4 != null) {
                }
                this.R2 = false;
                this.S2 = false;
                this.T2 = k27Var4 == null && k27Var4.n4() && this.I0 == y6c.h(this.G0).e();
                z9 = false;
                this.H3 = false;
                this.c4 = false;
                this.d4 = false;
                this.e4 = false;
                this.u3 = false;
                str8 = null;
                str12 = null;
                this.Q2 = z9;
                na7 q12222222 = na7.q1(this.G0);
                CharSequence charSequence522222222 = charSequence51222222;
                if (this.k1 == 0) {
                }
                str9 = str7;
                charSequence24 = this.M0;
                if (charSequence24 == null) {
                }
                charSequence25 = charSequence6;
                z10 = z17;
                i7 = i5;
                charSequence26 = charSequence7;
                charSequence29 = charSequence522222222;
                charSequence28 = charSequence24;
            }
            i2 = i;
            charSequence = charSequence37;
            i3 = this.S0;
            if (i3 == 0) {
                i3 = k27Var5.k.date;
            }
            if (!this.Q) {
            }
            if (!this.l2) {
            }
            draftMessage = this.m2;
            if (draftMessage != null) {
            }
            if (hc2.T(this.h2)) {
            }
            chat = this.h2;
            if (chat != null) {
            }
            if (hc2.c0(chat)) {
            }
            if (Z()) {
            }
            L02 = charSequence27;
            charSequence6 = "";
            i5 = -1;
            charSequence7 = charSequence23;
            CharSequence charSequence512222222 = L02;
            if (!this.y0) {
            }
            if (TextUtils.isEmpty(this.J0)) {
            }
            str7 = "";
            k27Var4 = this.g1;
            if (k27Var4 != null) {
            }
            this.R2 = false;
            this.S2 = false;
            this.T2 = k27Var4 == null && k27Var4.n4() && this.I0 == y6c.h(this.G0).e();
            z9 = false;
            this.H3 = false;
            this.c4 = false;
            this.d4 = false;
            this.e4 = false;
            this.u3 = false;
            str8 = null;
            str12 = null;
            this.Q2 = z9;
            na7 q122222222 = na7.q1(this.G0);
            CharSequence charSequence5222222222 = charSequence512222222;
            if (this.k1 == 0) {
            }
            str9 = str7;
            charSequence24 = this.M0;
            if (charSequence24 == null) {
            }
            charSequence25 = charSequence6;
            z10 = z17;
            i7 = i5;
            charSequence26 = charSequence7;
            charSequence29 = charSequence5222222222;
            charSequence28 = charSequence24;
        }
        charSequence30 = L0;
        if (z) {
            f3 = 24.0f;
            f4 = 0.0f;
            this.O2 = null;
            this.M2 = 0;
            i9 = 0;
        } else {
            TextPaint timeTextPaint = getTimeTextPaint();
            f3 = 24.0f;
            f4 = 0.0f;
            int ceil = (int) Math.ceil(timeTextPaint.measureText(str9));
            this.O2 = new StaticLayout(str9, timeTextPaint, ceil, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            i9 = gl.L(getIsPinned() ? 24.0f : 0.0f) + ceil;
            if (k96.a0) {
                this.M2 = gl.L(15.0f);
            } else {
                this.M2 = ls6.x(15.0f, getMeasuredWidth(), i9);
            }
        }
        if (O()) {
            i10 = 0;
        } else {
            boolean z30 = k96.a0;
            int i38 = this.M2;
            if (z30) {
                this.P2 = gl.L(4.0f) + i38 + i9;
            } else {
                this.P2 = (i38 - bkb.a1.getIntrinsicWidth()) - gl.L(4.0f);
            }
            i10 = bkb.a1.getIntrinsicWidth() + gl.L(4.0f);
            i9 += i10;
        }
        if (k96.a0) {
            x = ls6.x(22.0f, getMeasuredWidth() - this.y2, i9);
            this.z2 = x;
        } else {
            x = ls6.x(this.J + 13, getMeasuredWidth() - this.y2, i9);
            this.z2 = x;
            this.y2 += i9;
        }
        if (this.H2) {
            this.z2 = x - (bkb.Z0.getIntrinsicWidth() + gl.L(k96.a0 ? 8.0f : 4.0f));
        }
        if (this.T2) {
            f5 = 5.0f;
            if (this.S2) {
                int L10 = gl.L(5.0f) + bkb.S0.getIntrinsicWidth();
                int i39 = this.z2 - L10;
                this.z2 = i39;
                if (this.R2) {
                    this.z2 = de9.f(8.0f, bkb.V0.getIntrinsicWidth(), i39);
                    boolean z31 = k96.a0;
                    int i40 = this.M2;
                    if (z31) {
                        int L11 = gl.L(5.0f) + i40 + i9;
                        this.U2 = L11;
                        this.Y2 = gl.L(5.5f) + L11;
                        this.y2 = b00.z(8.0f, bkb.V0.getIntrinsicWidth() + L10, this.y2);
                    } else {
                        int i41 = (i40 - i10) - L10;
                        this.Y2 = i41;
                        this.U2 = i41 - gl.L(5.5f);
                    }
                } else {
                    boolean z32 = k96.a0;
                    int i42 = this.M2;
                    if (z32) {
                        this.V2 = gl.L(5.0f) + i42 + i9;
                        this.y2 += L10;
                    } else {
                        this.V2 = (i42 - i10) - L10;
                    }
                }
            }
        } else {
            int L12 = gl.L(5.0f) + bkb.W0.getIntrinsicWidth();
            this.z2 -= L12;
            boolean z33 = k96.a0;
            f5 = 5.0f;
            int i43 = this.M2;
            if (z33) {
                this.W2 = gl.L(5.0f) + i43 + i9;
                this.y2 += L12;
            } else {
                this.W2 = (i43 - i10) - L12;
            }
        }
        z13 = (!this.a1 || this.R0 || this.c1 || this.d1 > f4) && !this.k4 && this.q4 == 0;
        if (!this.m4 && this.o4.c() != null) {
            int L13 = gl.L(36.0f);
            if (z13) {
                L13 += bkb.b1.getIntrinsicWidth() + gl.L(6.0f);
            }
            this.z2 -= L13;
            if (k96.a0) {
                this.y2 += L13;
            }
        } else if (!z13) {
            int intrinsicWidth = bkb.b1.getIntrinsicWidth() + gl.L(6.0f);
            if (this.m4) {
                intrinsicWidth += gl.L(36.0f);
            }
            this.z2 -= intrinsicWidth;
            if (k96.a0) {
                this.y2 += intrinsicWidth;
            }
        } else if (this.k4) {
            int intrinsicWidth2 = bkb.e1.getIntrinsicWidth() + gl.L(6.0f);
            this.z2 -= intrinsicWidth2;
            if (k96.a0) {
                this.y2 += intrinsicWidth2;
            }
        } else if (this.m4) {
            int L14 = gl.L(36.0f);
            this.z2 -= L14;
            if (k96.a0) {
                this.y2 += L14;
            }
        } else if (this.q4 != 0) {
            int intrinsicWidth3 = (this.q4 == 1 ? bkb.f1 : bkb.g1).getIntrinsicWidth() + gl.L(6.0f);
            this.z2 -= intrinsicWidth3;
            if (k96.a0) {
                this.y2 += intrinsicWidth3;
            }
        }
        if (this.l4) {
            this.z2 -= gl.L(21.0f);
        }
        try {
            L7 = this.z2 - gl.L(12.0f);
            if (L7 < 0) {
                L7 = 0;
            }
            if (charSequence28 instanceof String) {
                f6 = 36.0f;
                f7 = 6.0f;
                charSequence35 = charSequence28;
            } else {
                f6 = 36.0f;
                f7 = 6.0f;
                try {
                    charSequence35 = ((String) charSequence28).replace(c, ' ');
                } catch (Exception e4) {
                    e = e4;
                    f8 = 21.0f;
                    fa4.f(e);
                    this.q3 = gm.update(0, (View) this, this.q3, this.A2);
                    if (this.s2) {
                    }
                    f9 = 39.0f;
                    f10 = 8.0f;
                    L = gl.L(11.0f);
                    this.r3 = gl.L(32.0f);
                    this.N2 = gl.L(13.0f);
                    this.v3 = gl.L(42.33f);
                    this.D3 = gl.L(43.0f);
                    this.N3 = gl.L(42.33f);
                    this.X2 = gl.L(13.0f);
                    int measuredWidth42 = getMeasuredWidth() - gl.L(this.J + 21);
                    if (k96.a0) {
                    }
                    i11 = L3;
                    this.v0.F.set(L2, L, gl.L(56.0f) + L2, gl.L(56.0f) + L);
                    i12 = 0;
                    while (true) {
                        imageReceiverArr = this.W1;
                        if (i12 < imageReceiverArr.length) {
                        }
                        imageReceiverArr[i12].i0(((this.M4 + 2) * i12) + i11, ((gl.L(31.0f) + L) + (this.R ? gl.L(20.0f) : 0)) - ((this.s2 || gba.l1 || (wtcVar = this.u0) == null || wtcVar.t()) ? 0 : gl.L(9.0f)), gl.L(18.0f), gl.L(18.0f));
                        i12++;
                        L = L;
                    }
                    i13 = L;
                    i14 = measuredWidth42;
                    if (k96.a0) {
                    }
                    if (this.R) {
                    }
                    if (!this.s2) {
                        this.N2 -= gl.L(f7);
                        this.X2 -= gl.L(f7);
                        if (getIsPinned()) {
                        }
                        if (this.u3) {
                        }
                        if (this.u3) {
                        }
                        this.I3 = z14;
                        if (z14) {
                        }
                        if (z10) {
                        }
                        max = Math.max(gl.L(12.0f), i14);
                        this.h3 = gl.L((!this.s2 || gba.l1) ? 58.0f : 62.0f);
                        if (!this.s2) {
                            this.h3 -= gl.L(!Z() ? 10.0f : 12.0f);
                            Z = Z();
                            boolean z262 = this.s2;
                            if (!Z) {
                            }
                            if (this.R) {
                            }
                            this.o3 = gm.update(0, (View) this, this.o3, this.t3);
                            if (TextUtils.isEmpty(charSequence26)) {
                            }
                            this.p3 = gm.update(0, (View) this, this.p3, this.i3);
                            if (!TextUtils.isEmpty(charSequence25)) {
                            }
                            if (charSequence29 instanceof Spannable) {
                            }
                            if (this.s2) {
                            }
                            this.b0 = bkb.E0[this.F0 ? 1 : 0];
                            charSequence32 = charSequence30;
                            charSequence33 = null;
                            Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                            if (this.s2) {
                            }
                            if (this.S1 > 0) {
                            }
                            i17 = max;
                            TextPaint textPaint62 = this.b0;
                            float L92 = gl.L(1.0f);
                            TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
                            this.f3 = lwa.b(charSequence32, textPaint62, i17, L92, i17, charSequence33 != null ? 1 : 2);
                            max = i17;
                            this.j3.addAll(this.k3);
                            this.k3.clear();
                            qla.b(this, this.f3, -2, -2, this.j3, this.k3);
                            int i2922 = max;
                            this.n3 = gm.update(0, (View) this, this.n3, this.f3);
                            z15 = k96.a0;
                            StaticLayout staticLayout322 = this.A2;
                            if (z15) {
                            }
                            staticLayout = this.g3;
                            if (staticLayout != null) {
                            }
                            n0();
                        }
                        this.h3 -= gl.L(!Z() ? 10.0f : 12.0f);
                        Z = Z();
                        boolean z2622 = this.s2;
                        if (!Z) {
                        }
                        if (this.R) {
                        }
                        this.o3 = gm.update(0, (View) this, this.o3, this.t3);
                        if (TextUtils.isEmpty(charSequence26)) {
                        }
                        this.p3 = gm.update(0, (View) this, this.p3, this.i3);
                        if (!TextUtils.isEmpty(charSequence25)) {
                        }
                        if (charSequence29 instanceof Spannable) {
                        }
                        if (this.s2) {
                        }
                        this.b0 = bkb.E0[this.F0 ? 1 : 0];
                        charSequence32 = charSequence30;
                        charSequence33 = null;
                        Layout.Alignment alignment22 = Layout.Alignment.ALIGN_NORMAL;
                        if (this.s2) {
                        }
                        if (this.S1 > 0) {
                        }
                        i17 = max;
                        TextPaint textPaint622 = this.b0;
                        float L922 = gl.L(1.0f);
                        TextUtils.TruncateAt truncateAt22 = TextUtils.TruncateAt.END;
                        this.f3 = lwa.b(charSequence32, textPaint622, i17, L922, i17, charSequence33 != null ? 1 : 2);
                        max = i17;
                        this.j3.addAll(this.k3);
                        this.k3.clear();
                        qla.b(this, this.f3, -2, -2, this.j3, this.k3);
                        int i29222 = max;
                        this.n3 = gm.update(0, (View) this, this.n3, this.f3);
                        z15 = k96.a0;
                        StaticLayout staticLayout3222 = this.A2;
                        if (z15) {
                        }
                        staticLayout = this.g3;
                        if (staticLayout != null) {
                        }
                        n0();
                    }
                    this.N2 -= gl.L(f7);
                    this.X2 -= gl.L(f7);
                    if (getIsPinned()) {
                    }
                    if (this.u3) {
                    }
                    if (this.u3) {
                    }
                    this.I3 = z14;
                    if (z14) {
                    }
                    if (z10) {
                    }
                    max = Math.max(gl.L(12.0f), i14);
                    this.h3 = gl.L((!this.s2 || gba.l1) ? 58.0f : 62.0f);
                    if (!this.s2) {
                    }
                    this.h3 -= gl.L(!Z() ? 10.0f : 12.0f);
                    Z = Z();
                    boolean z26222 = this.s2;
                    if (!Z) {
                    }
                    if (this.R) {
                    }
                    this.o3 = gm.update(0, (View) this, this.o3, this.t3);
                    if (TextUtils.isEmpty(charSequence26)) {
                    }
                    this.p3 = gm.update(0, (View) this, this.p3, this.i3);
                    if (!TextUtils.isEmpty(charSequence25)) {
                    }
                    if (charSequence29 instanceof Spannable) {
                    }
                    if (this.s2) {
                    }
                    this.b0 = bkb.E0[this.F0 ? 1 : 0];
                    charSequence32 = charSequence30;
                    charSequence33 = null;
                    Layout.Alignment alignment222 = Layout.Alignment.ALIGN_NORMAL;
                    if (this.s2) {
                    }
                    if (this.S1 > 0) {
                    }
                    i17 = max;
                    TextPaint textPaint6222 = this.b0;
                    float L9222 = gl.L(1.0f);
                    TextUtils.TruncateAt truncateAt222 = TextUtils.TruncateAt.END;
                    this.f3 = lwa.b(charSequence32, textPaint6222, i17, L9222, i17, charSequence33 != null ? 1 : 2);
                    max = i17;
                    this.j3.addAll(this.k3);
                    this.k3.clear();
                    qla.b(this, this.f3, -2, -2, this.j3, this.k3);
                    int i292222 = max;
                    this.n3 = gm.update(0, (View) this, this.n3, this.f3);
                    z15 = k96.a0;
                    StaticLayout staticLayout32222 = this.A2;
                    if (z15) {
                    }
                    staticLayout = this.g3;
                    if (staticLayout != null) {
                    }
                    n0();
                }
            }
            if (this.E2) {
                f8 = 21.0f;
            } else {
                f8 = 21.0f;
                try {
                    this.B2 = charSequence35.length() == TextUtils.ellipsize(charSequence35, bkb.A0[this.F0 ? 1 : 0], (float) L7, TextUtils.TruncateAt.END).length();
                    L7 += gl.L(48.0f);
                } catch (Exception e5) {
                    e = e5;
                    fa4.f(e);
                    this.q3 = gm.update(0, (View) this, this.q3, this.A2);
                    if (this.s2) {
                    }
                    f9 = 39.0f;
                    f10 = 8.0f;
                    L = gl.L(11.0f);
                    this.r3 = gl.L(32.0f);
                    this.N2 = gl.L(13.0f);
                    this.v3 = gl.L(42.33f);
                    this.D3 = gl.L(43.0f);
                    this.N3 = gl.L(42.33f);
                    this.X2 = gl.L(13.0f);
                    int measuredWidth422 = getMeasuredWidth() - gl.L(this.J + 21);
                    if (k96.a0) {
                    }
                    i11 = L3;
                    this.v0.F.set(L2, L, gl.L(56.0f) + L2, gl.L(56.0f) + L);
                    i12 = 0;
                    while (true) {
                        imageReceiverArr = this.W1;
                        if (i12 < imageReceiverArr.length) {
                        }
                        imageReceiverArr[i12].i0(((this.M4 + 2) * i12) + i11, ((gl.L(31.0f) + L) + (this.R ? gl.L(20.0f) : 0)) - ((this.s2 || gba.l1 || (wtcVar = this.u0) == null || wtcVar.t()) ? 0 : gl.L(9.0f)), gl.L(18.0f), gl.L(18.0f));
                        i12++;
                        L = L;
                    }
                    i13 = L;
                    i14 = measuredWidth422;
                    if (k96.a0) {
                    }
                    if (this.R) {
                    }
                    if (!this.s2) {
                    }
                    this.N2 -= gl.L(f7);
                    this.X2 -= gl.L(f7);
                    if (getIsPinned()) {
                    }
                    if (this.u3) {
                    }
                    if (this.u3) {
                    }
                    this.I3 = z14;
                    if (z14) {
                    }
                    if (z10) {
                    }
                    max = Math.max(gl.L(12.0f), i14);
                    this.h3 = gl.L((!this.s2 || gba.l1) ? 58.0f : 62.0f);
                    if (!this.s2) {
                    }
                    this.h3 -= gl.L(!Z() ? 10.0f : 12.0f);
                    Z = Z();
                    boolean z262222 = this.s2;
                    if (!Z) {
                    }
                    if (this.R) {
                    }
                    this.o3 = gm.update(0, (View) this, this.o3, this.t3);
                    if (TextUtils.isEmpty(charSequence26)) {
                    }
                    this.p3 = gm.update(0, (View) this, this.p3, this.i3);
                    if (!TextUtils.isEmpty(charSequence25)) {
                    }
                    if (charSequence29 instanceof Spannable) {
                    }
                    if (this.s2) {
                    }
                    this.b0 = bkb.E0[this.F0 ? 1 : 0];
                    charSequence32 = charSequence30;
                    charSequence33 = null;
                    Layout.Alignment alignment2222 = Layout.Alignment.ALIGN_NORMAL;
                    if (this.s2) {
                    }
                    if (this.S1 > 0) {
                    }
                    i17 = max;
                    TextPaint textPaint62222 = this.b0;
                    float L92222 = gl.L(1.0f);
                    TextUtils.TruncateAt truncateAt2222 = TextUtils.TruncateAt.END;
                    this.f3 = lwa.b(charSequence32, textPaint62222, i17, L92222, i17, charSequence33 != null ? 1 : 2);
                    max = i17;
                    this.j3.addAll(this.k3);
                    this.k3.clear();
                    qla.b(this, this.f3, -2, -2, this.j3, this.k3);
                    int i2922222 = max;
                    this.n3 = gm.update(0, (View) this, this.n3, this.f3);
                    z15 = k96.a0;
                    StaticLayout staticLayout322222 = this.A2;
                    if (z15) {
                    }
                    staticLayout = this.g3;
                    if (staticLayout != null) {
                    }
                    n0();
                }
            }
            int i282 = L7;
            float f132 = i282;
            this.S = bkb.A0[this.F0 ? 1 : 0].measureText(charSequence35.toString()) <= f132;
            CharSequence charSequence532 = charSequence35;
            if (!this.R) {
                charSequence532 = TextUtils.ellipsize(charSequence35, bkb.A0[this.F0 ? 1 : 0], f132, TextUtils.TruncateAt.END);
            }
            CharSequence l32 = vu3.l(charSequence532, bkb.A0[this.F0 ? 1 : 0].getFontMetricsInt(), false);
            k27 k27Var202 = this.g1;
            CharSequence charSequence56 = (k27Var202 == null && k27Var202.r2() && (v13 = gl.v1(l32, this.g1.a2, this.K4)) != null) ? v13 : l32;
            if (this.R) {
                staticLayout2 = new StaticLayout(charSequence56, bkb.A0[this.F0 ? 1 : 0], Math.max(i282, this.z2), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.A2 = staticLayout2;
            } else {
                TextPaint textPaint7 = bkb.A0[this.F0 ? 1 : 0];
                Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                TextUtils.TruncateAt truncateAt3 = TextUtils.TruncateAt.END;
                staticLayout2 = lwa.b(charSequence56, textPaint7, i282, 0.0f, i282, 2);
                this.A2 = staticLayout2;
            }
            this.C2 = (this.E2 || !staticLayout2.isRtlCharAt(0)) ? f4 : -gl.L(f6);
            this.D2 = this.A2.isRtlCharAt(0);
        } catch (Exception e6) {
            e = e6;
            f6 = 36.0f;
            f7 = 6.0f;
        }
        this.q3 = gm.update(0, (View) this, this.q3, this.A2);
        if (!this.s2 || gba.l1) {
            f9 = 39.0f;
            f10 = 8.0f;
            L = gl.L(11.0f);
            this.r3 = gl.L(32.0f);
            this.N2 = gl.L(13.0f);
            this.v3 = gl.L(42.33f);
            this.D3 = gl.L(43.0f);
            this.N3 = gl.L(42.33f);
            this.X2 = gl.L(13.0f);
            int measuredWidth4222 = getMeasuredWidth() - gl.L(this.J + 21);
            if (k96.a0) {
                int L15 = gl.L(this.J + 6);
                this.s3 = L15;
                this.c3 = L15;
                this.e3 = L15;
                this.d3 = L15;
                L2 = gl.L(this.I);
                L3 = gl.L(69.0f) + L2;
            } else {
                int L16 = gl.L(f2);
                this.s3 = L16;
                this.c3 = L16;
                this.e3 = L16;
                this.d3 = L16;
                L2 = getMeasuredWidth() - gl.L(this.I + 56);
                L3 = L2 - gl.L(31.0f);
            }
            i11 = L3;
            this.v0.F.set(L2, L, gl.L(56.0f) + L2, gl.L(56.0f) + L);
            i12 = 0;
            while (true) {
                imageReceiverArr = this.W1;
                if (i12 < imageReceiverArr.length) {
                    break;
                }
                imageReceiverArr[i12].i0(((this.M4 + 2) * i12) + i11, ((gl.L(31.0f) + L) + (this.R ? gl.L(20.0f) : 0)) - ((this.s2 || gba.l1 || (wtcVar = this.u0) == null || wtcVar.t()) ? 0 : gl.L(9.0f)), gl.L(18.0f), gl.L(18.0f));
                i12++;
                L = L;
            }
            i13 = L;
            i14 = measuredWidth4222;
        } else {
            int L17 = gl.L(9.0f);
            this.r3 = gl.L(31.0f);
            this.N2 = gl.L(f2);
            this.v3 = gl.L(38.0f);
            this.D3 = gl.L(39.0f);
            this.N3 = gl.L(this.Q ? 35.0f : 38.0f);
            this.X2 = gl.L(f);
            i14 = getMeasuredWidth() - gl.L((this.J + 20) - (k96.a0 ? 0 : 12));
            if (k96.a0) {
                int L18 = gl.L(22.0f);
                this.s3 = L18;
                this.c3 = L18;
                this.e3 = L18;
                this.d3 = L18;
                f9 = 39.0f;
                L5 = getMeasuredWidth() - gl.L(this.I + 52);
                f11 = 9.0f;
                L6 = L5 - gl.L(((this.M4 + 2) * this.S1) + 9);
            } else {
                f9 = 39.0f;
                f11 = 9.0f;
                int L19 = gl.L(this.J + 4);
                this.s3 = L19;
                this.c3 = L19;
                this.e3 = L19;
                this.d3 = L19;
                L5 = gl.L(this.I);
                L6 = gl.L(67.0f) + L5;
            }
            f10 = 8.0f;
            this.v0.F.set(L5, L17, gl.L(52.0f) + L5, gl.L(52.0f) + L17);
            int i44 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr3 = this.W1;
                if (i44 >= imageReceiverArr3.length) {
                    break;
                }
                imageReceiverArr3[i44].i0(((this.M4 + 2) * i44) + L6, ((gl.L(30.0f) + L17) + (this.R ? gl.L(20.0f) : 0)) - ((this.s2 || gba.l1 || (wtcVar3 = this.u0) == null || wtcVar3.t()) ? 0 : gl.L(f11)), gl.L(this.M4), gl.L(this.M4));
                i44++;
                L17 = L17;
            }
            i13 = L17;
        }
        if (k96.a0) {
            this.Z2 = this.c3;
            this.a3 = getMeasuredWidth() - gl.L(64.0f);
        } else {
            this.a3 = getMeasuredWidth() - gl.L(this.J);
            this.Z2 = gl.L(64.0f);
        }
        if (this.R) {
            this.r3 = gl.L(20.0f) + this.r3;
        }
        if (((!this.s2 && !gba.l1) || Z()) && (wtcVar2 = this.u0) != null && !wtcVar2.t()) {
            this.N2 -= gl.L(f7);
            this.X2 -= gl.L(f7);
        }
        if (getIsPinned()) {
            if (k96.a0) {
                this.E3 = gl.L(14.0f);
            } else {
                this.E3 = (getMeasuredWidth() - bkb.i1.getIntrinsicWidth()) - gl.L(14.0f);
            }
        }
        if (this.u3) {
            int L20 = gl.L(29.0f);
            i14 -= L20;
            if (k96.a0) {
                this.w3 = gl.L(15.666f);
                this.c3 += L20;
                this.e3 += L20;
                this.d3 += L20;
                this.s3 += L20;
            } else {
                this.w3 = getMeasuredWidth() - gl.L(36.3333f);
            }
        } else if (str8 != null || str12 != null || this.d4 || this.e4) {
            if (str8 != null) {
                this.P3 = Math.max(gl.L(f10), (int) Math.ceil(bkb.L0.measureText(str8)));
                this.Y3 = new StaticLayout(str8, bkb.L0, this.P3, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                int L21 = gl.L(f) + this.P3;
                i14 -= L21;
                if (k96.a0) {
                    this.O3 = gl.L(15.666f);
                    this.c3 += L21;
                    this.e3 += L21;
                    this.d3 += L21;
                    this.s3 += L21;
                } else {
                    this.O3 = ug8.B(12.666f, this.P3, getMeasuredWidth() - gl.L(15.666f));
                }
                this.H3 = true;
            } else {
                this.P3 = 0;
            }
            if (str12 != null) {
                if (this.K0 != 0) {
                    this.i4 = Math.max(gl.L(f10), (int) Math.ceil(bkb.L0.measureText(str12)));
                    this.j4 = new StaticLayout(str12, bkb.L0, this.i4, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                } else {
                    this.i4 = gl.L(f10);
                }
                int L22 = gl.L(f) + this.i4;
                i14 -= L22;
                if (k96.a0) {
                    int L23 = gl.L(15.666f);
                    int i45 = this.P3;
                    this.f4 = L23 + (i45 != 0 ? i45 + gl.L(f) : 0);
                    this.c3 += L22;
                    this.e3 += L22;
                    this.d3 += L22;
                    this.s3 += L22;
                } else {
                    int B = ug8.B(12.666f, this.i4, getMeasuredWidth()) - gl.L(15.666f);
                    int i46 = this.P3;
                    this.f4 = B - (i46 != 0 ? i46 + gl.L(f) : 0);
                }
                this.c4 = true;
            } else {
                this.i4 = 0;
            }
            if (this.d4) {
                int L24 = gl.L(25.0f);
                i14 -= L24;
                if (k96.a0) {
                    int L25 = gl.L(15.666f);
                    this.g4 = L25;
                    if (this.c4) {
                        int i47 = this.i4;
                        L25 += i47 != 0 ? i47 + gl.L(f) : 0;
                        this.g4 = L25;
                    }
                    if (this.H3) {
                        int i48 = this.P3;
                        this.g4 = L25 + (i48 != 0 ? i48 + gl.L(f) : 0);
                    }
                    this.c3 += L24;
                    this.e3 += L24;
                    this.d3 += L24;
                    this.s3 += L24;
                } else {
                    int measuredWidth5 = getMeasuredWidth() - gl.L(36.332f);
                    this.g4 = measuredWidth5;
                    if (this.c4) {
                        int i49 = this.i4;
                        measuredWidth5 -= i49 != 0 ? i49 + gl.L(f) : 0;
                        this.g4 = measuredWidth5;
                    }
                    if (this.H3) {
                        int i50 = this.P3;
                        this.g4 = measuredWidth5 - (i50 != 0 ? i50 + gl.L(f) : 0);
                    }
                }
            }
            if (this.e4) {
                int L26 = gl.L(25.0f);
                i14 -= L26;
                if (k96.a0) {
                    int L27 = gl.L(15.666f);
                    this.h4 = L27;
                    if (this.d4) {
                        L27 += gl.L(25.0f);
                        this.h4 = L27;
                    }
                    if (this.c4) {
                        int i51 = this.i4;
                        L27 += i51 != 0 ? i51 + gl.L(f) : 0;
                        this.h4 = L27;
                    }
                    if (this.H3) {
                        int i52 = this.P3;
                        this.h4 = L27 + (i52 != 0 ? i52 + gl.L(f) : 0);
                    }
                    this.c3 += L26;
                    this.e3 += L26;
                    this.d3 += L26;
                    this.s3 += L26;
                } else {
                    int measuredWidth6 = getMeasuredWidth() - gl.L(36.332f);
                    this.h4 = measuredWidth6;
                    if (this.d4) {
                        measuredWidth6 -= gl.L(25.0f);
                        this.h4 = measuredWidth6;
                    }
                    if (this.c4) {
                        int i53 = this.i4;
                        measuredWidth6 -= i53 != 0 ? i53 + gl.L(f) : 0;
                        this.h4 = measuredWidth6;
                    }
                    if (this.H3) {
                        int i54 = this.P3;
                        this.h4 = measuredWidth6 - (i54 != 0 ? i54 + gl.L(f) : 0);
                    }
                }
            }
        } else if (!this.K1 || Y() || Z() || X() || !l7c.v(this.g2) || !this.g2.bot_has_main_app) {
            this.H3 = false;
            this.c4 = false;
        } else {
            setOpenBotButton(true);
            int L28 = (int) (gl.L(26.0f) + this.J1.c);
            int L29 = gl.L(13.0f);
            i14 -= L28;
            int L30 = (this.s2 || gba.l1) ? gl.L(40.0f) : this.Q ? gl.L(33.0f) : gl.L(f6);
            boolean z34 = k96.a0;
            RectF rectF = this.I1;
            if (z34) {
                rectF.set(gl.L(13.0f), L30, gl.L(13.0f) + L28, gl.L(28.0f) + L30);
                int i55 = L28 + L29;
                this.c3 += i55;
                this.e3 += i55;
                this.d3 += i55;
                this.s3 += i55;
            } else {
                rectF.set((getMeasuredWidth() - L28) - gl.L(13.0f), L30, getMeasuredWidth() - gl.L(13.0f), gl.L(28.0f) + L30);
            }
            this.H3 = false;
            this.c4 = false;
        }
        z14 = this.u3 && this.H0 == null && !Y() && !Z() && !X() && (this.T0 > 0 || this.U0) && (k27Var7 = this.g1) != null && !k27Var7.O3() && (this.g1.k.action instanceof TLRPC.TL_messageActionGramTransfer);
        this.I3 = z14;
        if (z14) {
            int L31 = (this.H3 && this.M3) ? this.P3 + gl.L(f) : 0;
            if (this.c4 && this.M3) {
                L31 = de9.w(f, this.i4, L31);
            }
            if (this.d4) {
                L31 += gl.L(25.0f);
            }
            if (this.e4) {
                L31 += gl.L(25.0f);
            }
            if (this.F1) {
                L31 = de9.w(4.0f, (int) this.I1.width(), L31);
            }
            this.J3 = k96.a0 ? gl.L(15.666f) + L31 : ls6.x(43.666f, getMeasuredWidth(), L31);
            i14 -= gl.L(32.0f);
            if (k96.a0) {
                this.c3 = gl.L(32.0f) + this.c3;
                this.e3 = gl.L(32.0f) + this.e3;
                this.d3 = gl.L(32.0f) + this.d3;
                this.s3 = gl.L(32.0f) + this.s3;
            }
        }
        if (z10) {
            if (charSequence29 == null) {
                charSequence29 = "";
            }
            int length5 = charSequence29.length();
            CharSequence charSequence57 = charSequence29;
            if (length5 > 150) {
                charSequence57 = charSequence29.subSequence(0, kk7.f2);
            }
            charSequence29 = vu3.l(((this.s2 || gba.l1) && !V() && charSequence30 == null) ? gl.T2(charSequence57) : gl.J2(charSequence57), bkb.E0[this.F0 ? 1 : 0].getFontMetricsInt(), false);
            k27 k27Var25 = this.g1;
            if (k27Var25 != null && (v12 = gl.v1(charSequence29, k27Var25.a2, this.K4)) != null) {
                charSequence29 = v12;
            }
        }
        max = Math.max(gl.L(12.0f), i14);
        this.h3 = gl.L((!this.s2 || gba.l1) ? 58.0f : 62.0f);
        if (((!this.s2 && !gba.l1) || Z()) && V()) {
            this.h3 -= gl.L(!Z() ? 10.0f : 12.0f);
        }
        Z = Z();
        boolean z2622222 = this.s2;
        if (!Z) {
            this.b3 = gl.L((z2622222 || gba.l1) ? 34.0f : f9);
            int i56 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr4 = this.W1;
                if (i56 >= imageReceiverArr4.length) {
                    break;
                }
                imageReceiverArr4[i56].M0 = this.h3;
                i56++;
            }
        } else if ((z2622222 || gba.l1) && !V() && charSequence30 != null && (this.K0 == 0 || this.N0 == 1)) {
            try {
                k27Var6 = this.g1;
            } catch (Exception e7) {
                e = e7;
            }
            if (k27Var6 != null && k27Var6.r2()) {
                CharSequence v15 = gl.v1(charSequence30, this.g1.a2, this.K4);
                if (v15 != null) {
                    charSequence31 = v15;
                    TextPaint textPaint8 = bkb.F0;
                    Layout.Alignment alignment4 = Layout.Alignment.ALIGN_NORMAL;
                    TextUtils.TruncateAt truncateAt4 = TextUtils.TruncateAt.END;
                    this.t3 = lwa.b(charSequence31, textPaint8, max, 0.0f, max, 1);
                    this.b3 = gl.L(51.0f);
                    L4 = (this.S || !this.Q) ? 0 : gl.L(20.0f);
                    i15 = 0;
                    while (true) {
                        imageReceiverArr2 = this.W1;
                        if (i15 >= imageReceiverArr2.length) {
                            break;
                        }
                        imageReceiverArr2[i15].M0 = gl.L(40.0f) + i13 + L4;
                        i15++;
                    }
                    charSequence30 = charSequence31;
                }
            }
            charSequence31 = charSequence30;
            TextPaint textPaint82 = bkb.F0;
            Layout.Alignment alignment42 = Layout.Alignment.ALIGN_NORMAL;
            TextUtils.TruncateAt truncateAt42 = TextUtils.TruncateAt.END;
            this.t3 = lwa.b(charSequence31, textPaint82, max, 0.0f, max, 1);
            this.b3 = gl.L(51.0f);
            if (this.S) {
            }
            i15 = 0;
            while (true) {
                imageReceiverArr2 = this.W1;
                if (i15 >= imageReceiverArr2.length) {
                }
                imageReceiverArr2[i15].M0 = gl.L(40.0f) + i13 + L4;
                i15++;
            }
            charSequence30 = charSequence31;
        } else {
            this.t3 = null;
            if (this.s2 || gba.l1) {
                this.b3 = gl.L(32.0f);
                int L32 = (this.S && this.Q) ? gl.L(20.0f) : 0;
                int i57 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr5 = this.W1;
                    if (i57 >= imageReceiverArr5.length) {
                        break;
                    }
                    imageReceiverArr5[i57].M0 = gl.L(f8) + i13 + L32;
                    i57++;
                }
            } else {
                this.b3 = gl.L(f9);
            }
        }
        if (this.R) {
            this.b3 = gl.L(20.0f) + this.b3;
        }
        this.o3 = gm.update(0, (View) this, this.o3, this.t3);
        try {
            if (TextUtils.isEmpty(charSequence26)) {
                this.i3 = null;
            } else {
                this.i3 = new StaticLayout(TextUtils.ellipsize(vu3.l(charSequence26, this.b0.getFontMetricsInt(), false), this.b0, max - gl.L(26.0f), TextUtils.TruncateAt.END), this.b0, max - gl.L(20.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.l3.addAll(this.m3);
                this.m3.clear();
                qla.c(this, this.i3, this.l3, this.m3);
            }
        } catch (Exception unused) {
        }
        this.p3 = gm.update(0, (View) this, this.p3, this.i3);
        try {
            if (!TextUtils.isEmpty(charSequence25)) {
                if ((this.s2 || gba.l1) && !V()) {
                    TextPaint textPaint9 = bkb.G0[this.F0 ? 1 : 0];
                    Layout.Alignment alignment5 = Layout.Alignment.ALIGN_NORMAL;
                    float L33 = gl.L(1.0f);
                    TextUtils.TruncateAt truncateAt5 = TextUtils.TruncateAt.END;
                    try {
                        this.g3 = lwa.b(charSequence25, textPaint9, max, L33, max, 1);
                    } catch (Exception e8) {
                        e = e8;
                        max = max;
                        fa4.f(e);
                        if (charSequence29 instanceof Spannable) {
                        }
                        if (this.s2) {
                        }
                        this.b0 = bkb.E0[this.F0 ? 1 : 0];
                        charSequence32 = charSequence30;
                        charSequence33 = null;
                        Layout.Alignment alignment22222 = Layout.Alignment.ALIGN_NORMAL;
                        if (this.s2) {
                        }
                        if (this.S1 > 0) {
                        }
                        i17 = max;
                        TextPaint textPaint622222 = this.b0;
                        float L922222 = gl.L(1.0f);
                        TextUtils.TruncateAt truncateAt22222 = TextUtils.TruncateAt.END;
                        this.f3 = lwa.b(charSequence32, textPaint622222, i17, L922222, i17, charSequence33 != null ? 1 : 2);
                        max = i17;
                        this.j3.addAll(this.k3);
                        this.k3.clear();
                        qla.b(this, this.f3, -2, -2, this.j3, this.k3);
                        int i29222222 = max;
                        this.n3 = gm.update(0, (View) this, this.n3, this.f3);
                        z15 = k96.a0;
                        StaticLayout staticLayout3222222 = this.A2;
                        if (z15) {
                        }
                        staticLayout = this.g3;
                        if (staticLayout != null) {
                        }
                        n0();
                    }
                } else {
                    try {
                        StaticLayout staticLayout4 = new StaticLayout(TextUtils.ellipsize(charSequence25, this.b0, max - gl.L(12.0f), TextUtils.TruncateAt.END), bkb.G0[this.F0 ? 1 : 0], max, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        max = max;
                        this.g3 = staticLayout4;
                    } catch (Exception e9) {
                        e = e9;
                        max = max;
                        fa4.f(e);
                        if (charSequence29 instanceof Spannable) {
                        }
                        if (this.s2) {
                        }
                        this.b0 = bkb.E0[this.F0 ? 1 : 0];
                        charSequence32 = charSequence30;
                        charSequence33 = null;
                        Layout.Alignment alignment222222 = Layout.Alignment.ALIGN_NORMAL;
                        if (this.s2) {
                        }
                        if (this.S1 > 0) {
                        }
                        i17 = max;
                        TextPaint textPaint6222222 = this.b0;
                        float L9222222 = gl.L(1.0f);
                        TextUtils.TruncateAt truncateAt222222 = TextUtils.TruncateAt.END;
                        this.f3 = lwa.b(charSequence32, textPaint6222222, i17, L9222222, i17, charSequence33 != null ? 1 : 2);
                        max = i17;
                        this.j3.addAll(this.k3);
                        this.k3.clear();
                        qla.b(this, this.f3, -2, -2, this.j3, this.k3);
                        int i292222222 = max;
                        this.n3 = gm.update(0, (View) this, this.n3, this.f3);
                        z15 = k96.a0;
                        StaticLayout staticLayout32222222 = this.A2;
                        if (z15) {
                        }
                        staticLayout = this.g3;
                        if (staticLayout != null) {
                        }
                        n0();
                    }
                }
            }
        } catch (Exception e10) {
            e = e10;
        }
        try {
            if (charSequence29 instanceof Spannable) {
                Spannable spannable = (Spannable) charSequence29;
                for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                    if ((obj instanceof ClickableSpan) || (obj instanceof nj2) || ((this.L0 == 0 && !Y() && (obj instanceof z3c)) || (obj instanceof jj2) || (obj instanceof ey8) || (obj instanceof dy8) || ((obj instanceof StyleSpan) && ((StyleSpan) obj).getStyle() == 1))) {
                        spannable.removeSpan(obj);
                    }
                }
            }
            if ((!this.s2 || gba.l1) && !V() && this.K0 != 0 && this.N0 > 1) {
                this.b0 = bkb.E0[this.F0 ? 1 : 0];
                charSequence32 = charSequence30;
                charSequence33 = null;
            } else {
                if ((this.s2 || gba.l1) && !V() && charSequence30 == null) {
                    charSequence34 = charSequence29;
                    if (hc2.p0(this.h2)) {
                        charSequence34 = charSequence29;
                    }
                    charSequence33 = charSequence30;
                    charSequence32 = charSequence34;
                }
                charSequence34 = (Z() || !(charSequence29 instanceof Spanned) || ((se3[]) ((Spanned) charSequence29).getSpans(0, charSequence29.length(), se3.class)).length > 0) ? TextUtils.ellipsize(charSequence29, this.b0, max - gl.L(12.0f), TextUtils.TruncateAt.END) : TextUtils.ellipsize(charSequence29, this.b0, max - gl.L(((this.M4 + 2) * this.S1) + 15), TextUtils.TruncateAt.END);
                charSequence33 = charSequence30;
                charSequence32 = charSequence34;
            }
            Layout.Alignment alignment2222222 = Layout.Alignment.ALIGN_NORMAL;
            if ((!this.s2 || gba.l1) && !V()) {
                if (this.S1 > 0 && charSequence33 != null) {
                    max += gl.L(f5);
                }
                i17 = max;
                TextPaint textPaint62222222 = this.b0;
                float L92222222 = gl.L(1.0f);
                TextUtils.TruncateAt truncateAt2222222 = TextUtils.TruncateAt.END;
                this.f3 = lwa.b(charSequence32, textPaint62222222, i17, L92222222, i17, charSequence33 != null ? 1 : 2);
                max = i17;
            } else {
                if (this.S1 > 0) {
                    max += gl.L(((this.M4 + 2) * r0) + 3);
                    if (k96.a0 && !Z()) {
                        this.c3 -= gl.L(((this.M4 + 2) * this.S1) + 3);
                    }
                }
                int i58 = max;
                try {
                    this.f3 = new StaticLayout(charSequence32, this.b0, i58, alignment2222222, 1.0f, 0.0f, false);
                    max = i58;
                } catch (Exception e11) {
                    e = e11;
                    max = i58;
                    this.f3 = null;
                    fa4.f(e);
                    int i2922222222 = max;
                    this.n3 = gm.update(0, (View) this, this.n3, this.f3);
                    z15 = k96.a0;
                    StaticLayout staticLayout322222222 = this.A2;
                    if (z15) {
                    }
                    staticLayout = this.g3;
                    if (staticLayout != null) {
                    }
                    n0();
                }
            }
            this.j3.addAll(this.k3);
            this.k3.clear();
            qla.b(this, this.f3, -2, -2, this.j3, this.k3);
        } catch (Exception e12) {
            e = e12;
        }
        int i29222222222 = max;
        this.n3 = gm.update(0, (View) this, this.n3, this.f3);
        z15 = k96.a0;
        StaticLayout staticLayout3222222222 = this.A2;
        if (z15) {
            if (staticLayout3222222222 != null && staticLayout3222222222.getLineCount() > 0) {
                float lineLeft = this.A2.getLineLeft(0);
                double ceil2 = Math.ceil(this.A2.getLineWidth(0));
                int L34 = gl.L(12.0f) + this.y2;
                this.y2 = L34;
                if (this.l4) {
                    this.y2 = gl.L(f8) + L34;
                }
                if (this.E2) {
                    ceil2 = Math.min(this.z2, ceil2);
                }
                if ((this.a1 || this.c1 || this.d1 > f4) && !this.k4 && this.q4 == 0) {
                    boolean z35 = this.m4;
                    int i59 = this.y2;
                    int i60 = this.z2;
                    if (z35) {
                        int L35 = (int) ((((i60 - ceil2) - lineLeft) + i59) - gl.L(f3));
                        this.I2 = L35;
                        this.J2 = (L35 - gl.L(f7)) - bkb.b1.getIntrinsicWidth();
                    } else {
                        this.I2 = (int) ((((i60 - ceil2) + i59) - gl.L(f7)) - bkb.b1.getIntrinsicWidth());
                    }
                } else if (this.k4) {
                    this.I2 = (int) ((((this.z2 - ceil2) + this.y2) - gl.L(f7)) - bkb.e1.getIntrinsicWidth());
                } else if (this.m4) {
                    int L36 = (int) ((((this.z2 - ceil2) - lineLeft) + this.y2) - gl.L(f3));
                    this.I2 = L36;
                    this.J2 = (L36 - gl.L(f7)) - bkb.b1.getIntrinsicWidth();
                } else {
                    byte b2 = this.q4;
                    int i61 = this.y2;
                    int i62 = this.z2;
                    if (b2 != 0) {
                        this.I2 = (int) ((((i62 - ceil2) + i61) - gl.L(f7)) - (this.q4 == 1 ? bkb.f1 : bkb.g1).getIntrinsicWidth());
                    } else {
                        this.I2 = (int) ((((i62 - ceil2) + i61) - gl.L(f7)) - bkb.b1.getIntrinsicWidth());
                    }
                }
                if (lineLeft == f4) {
                    double d2 = this.z2;
                    if (ceil2 < d2) {
                        this.y2 = (int) ((d2 - ceil2) + this.y2);
                    }
                }
            }
            StaticLayout staticLayout5 = this.f3;
            int i63 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            if (staticLayout5 != null && (lineCount6 = staticLayout5.getLineCount()) > 0) {
                int i64 = Integer.MAX_VALUE;
                int i65 = 0;
                while (true) {
                    if (i65 >= lineCount6) {
                        break;
                    }
                    if (this.f3.getLineLeft(i65) != f4) {
                        i64 = 0;
                        break;
                    } else {
                        i64 = Math.min(i64, (int) (i29222222222 - Math.ceil(this.f3.getLineWidth(i65))));
                        i65++;
                    }
                }
                if (i64 != Integer.MAX_VALUE) {
                    this.c3 += i64;
                }
            }
            StaticLayout staticLayout6 = this.g3;
            if (staticLayout6 != null && (lineCount5 = staticLayout6.getLineCount()) > 0) {
                int i66 = Integer.MAX_VALUE;
                int i67 = 0;
                while (true) {
                    if (i67 >= lineCount5) {
                        break;
                    }
                    if (this.g3.getLineLeft(i67) != f4) {
                        i66 = 0;
                        break;
                    } else {
                        i66 = Math.min(i66, (int) (i29222222222 - Math.ceil(this.g3.getLineWidth(i67))));
                        i67++;
                    }
                }
                if (i66 != Integer.MAX_VALUE) {
                    this.e3 += i66;
                }
            }
            StaticLayout staticLayout7 = this.t3;
            if (staticLayout7 != null && staticLayout7.getLineCount() > 0 && this.t3.getLineLeft(0) == f4) {
                double ceil3 = Math.ceil(this.t3.getLineWidth(0));
                double d3 = i29222222222;
                if (ceil3 < d3) {
                    this.s3 = (int) ((d3 - ceil3) + this.s3);
                }
            }
            StaticLayout staticLayout8 = this.i3;
            if (staticLayout8 != null && (lineCount4 = staticLayout8.getLineCount()) > 0) {
                for (int i68 = 0; i68 < lineCount4; i68++) {
                    i63 = (int) Math.min(i63, this.i3.getWidth() - this.i3.getLineRight(i68));
                }
                this.d3 += i63;
            }
        } else {
            if (staticLayout3222222222 != null && staticLayout3222222222.getLineCount() > 0) {
                float lineRight = this.A2.getLineRight(0);
                if (this.E2) {
                    lineRight = Math.min(this.z2, lineRight);
                }
                if (lineRight == this.z2) {
                    double ceil4 = Math.ceil(this.A2.getLineWidth(0));
                    if (this.E2) {
                        ceil4 = Math.min(this.z2, ceil4);
                    }
                    double d4 = this.z2;
                    if (ceil4 < d4) {
                        this.y2 = (int) (this.y2 - (d4 - ceil4));
                    }
                }
                if (this.l4) {
                    this.y2 = gl.L(f8) + this.y2;
                }
                int L37 = (int) (this.y2 + lineRight + gl.L(f7));
                this.I2 = L37;
                if (this.m4) {
                    this.J2 = gl.L(30.0f) + L37;
                }
            }
            StaticLayout staticLayout9 = this.f3;
            float f14 = 2.1474836E9f;
            if (staticLayout9 != null && (lineCount3 = staticLayout9.getLineCount()) > 0) {
                float f15 = 2.1474836E9f;
                for (int i69 = 0; i69 < lineCount3; i69++) {
                    f15 = Math.min(f15, this.f3.getLineLeft(i69));
                }
                this.c3 = (int) (this.c3 - f15);
            }
            StaticLayout staticLayout10 = this.i3;
            if (staticLayout10 != null && (lineCount2 = staticLayout10.getLineCount()) > 0) {
                float f16 = 2.1474836E9f;
                for (int i70 = 0; i70 < lineCount2; i70++) {
                    f16 = Math.min(f16, this.i3.getLineLeft(i70));
                }
                this.d3 = (int) (this.d3 - f16);
            }
            StaticLayout staticLayout11 = this.g3;
            if (staticLayout11 != null && (lineCount = staticLayout11.getLineCount()) > 0) {
                for (int i71 = 0; i71 < lineCount; i71++) {
                    f14 = Math.min(f14, this.g3.getLineLeft(i71));
                }
                this.e3 = (int) (this.e3 - f14);
            }
            StaticLayout staticLayout12 = this.t3;
            if (staticLayout12 != null && staticLayout12.getLineCount() > 0) {
                this.s3 = (int) (this.s3 - this.t3.getLineLeft(0));
            }
        }
        staticLayout = this.g3;
        if (staticLayout != null && this.k2 >= 0 && staticLayout.getText().length() > 0) {
            if (i7 >= 0 || (i16 = i7 + 1) >= this.g3.getText().length()) {
                primaryHorizontal = this.g3.getPrimaryHorizontal(0);
                primaryHorizontal2 = this.g3.getPrimaryHorizontal(1);
            } else {
                primaryHorizontal = this.g3.getPrimaryHorizontal(i7);
                primaryHorizontal2 = this.g3.getPrimaryHorizontal(i16);
            }
            int i72 = this.e3;
            if (primaryHorizontal >= primaryHorizontal2) {
                this.D4 = (int) (i72 + primaryHorizontal);
            } else {
                this.D4 = (int) (i72 + primaryHorizontal2 + gl.L(3.0f));
            }
        }
        n0();
    }

    @Override // android.view.View
    public final void invalidate(int i, int i2, int i3, int i4) {
        if (m8b.x1) {
            return;
        }
        super.invalidate(i, i2, i3, i4);
    }

    public ue3(Context context, boolean z) {
        this(null, context, z, y6c.t0, null);
    }
}
