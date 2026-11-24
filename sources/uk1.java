// default package

import android.R;
import android.animation.ValueAnimator;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AlignmentSpan;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class uk1 extends hf0 implements sp3, gk7, ni5 {
    public static final HashMap y2;
    public float A0;
    public TextPaint A1;
    public float B0;
    public StaticLayout B1;
    public float C0;
    public float C1;
    public boolean D0;
    public StaticLayout D1;
    public qla E;
    public boolean E0;
    public float E1;
    public boolean F;
    public final i19 F0;
    public final TextPaint F1;
    public boolean G;
    public float G0;
    public final TextPaint G1;
    public boolean H;
    public float H0;
    public final TextPaint H1;
    public final int I;
    public xqa I0;
    public TLRPC.Document I1;
    public final ImageReceiver J;
    public nkc J0;
    public TLRPC.VideoSize J1;
    public Drawable K;
    public boolean K0;
    public final RadialProgress2 K1;
    public Path L;
    public float L0;
    public int L1;
    public final pb0 M;
    public float M0;
    public boolean M1;
    public StaticLayout N;
    public float N0;
    public RectF N1;
    public int O;
    public final RectF O0;
    public final rh1 O1;
    public int P;
    public xab P0;
    public boolean P1;
    public StaticLayout Q;
    public k27 Q0;
    public ColorMatrixColorFilter Q1;
    public int R;
    public int R0;
    public CornerPathEffect R1;
    public int S;
    public CharSequence S0;
    public Path S1;
    public int T;
    public kv4 T0;
    public tgb T1;
    public int U;
    public int U0;
    public final View U1;
    public int V;
    public int V0;
    public final Path V1;
    public int W;
    public Paint W0;
    public final bra W1;
    public TextPaint X0;
    public int X1;
    public final ArrayList Y0;
    public final ArrayList Y1;
    public final ArrayList Z0;
    public dd Z1;
    public boolean a0;
    public final Path a1;
    public boolean a2;
    public boolean b0;
    public int b1;
    public int b2;
    public RadialProgressView c0;
    public int c1;
    public TLRPC.TL_messageActionStarGiftOnchainOffer c2;
    public float d0;
    public final RectF d1;
    public boolean d2;
    public final u2b e0;
    public boolean e1;
    public int e2;
    public int f;
    public boolean f0;
    public boolean f1;
    public boolean f2;
    public boolean g0;
    public rk1 g1;
    public qv4 g2;
    public int h;
    public boolean h0;
    public final wjb h1;
    public float h2;
    public boolean i0;
    public int i1;
    public final Paint i2;
    public boolean j0;
    public int j1;
    public boolean j2;
    public int k0;
    public StaticLayout k1;
    public View.OnClickListener k2;
    public boolean l0;
    public Paint l1;
    public int l2;
    public int m0;
    public tgb m1;
    public final Path m2;
    public final n41 n;
    public boolean n0;
    public StaticLayout n1;
    public final float[] n2;
    public aub o0;
    public boolean o1;
    public final float[] o2;
    public final RectF p0;
    public boolean p1;
    public final Path p2;
    public final ArrayList q0;
    public int q1;
    public final int[] q2;
    public r86 r;
    public final Stack r0;
    public final lm r1;
    public int r2;
    public final boolean s;
    public cm s0;
    public xl3 s1;
    public SpannableStringBuilder s2;
    public TextPaint t0;
    public sk1 t1;
    public boolean t2;
    public float u0;
    public int u1;
    public Runnable u2;
    public float v0;
    public int v1;
    public PorterDuffColorFilter v2;
    public View w;
    public int w0;
    public int w1;
    public int w2;
    public final int x;
    public boolean x0;
    public tgb x1;
    public final tk1 x2;
    public URLSpan y;
    public gl5 y0;
    public StaticLayout y1;
    public float z0;
    public boolean z1;

    static {
        HashMap hashMap = new HashMap();
        y2 = hashMap;
        b00.q(1, hashMap, "1⃣", 3, "2⃣");
        b00.q(6, hashMap, "3⃣", 12, "4⃣");
        hashMap.put(24, "5⃣");
    }

    public uk1(wjb wjbVar, Context context, boolean z) {
        super(context);
        this.n = new n41(this);
        int i = y6c.t0;
        this.I = i;
        u2b u2bVar = new u2b(null, false);
        this.e0 = u2bVar;
        this.n0 = true;
        this.p0 = new RectF();
        this.q0 = new ArrayList();
        this.r0 = new Stack();
        this.F0 = new i19(this);
        this.O0 = new RectF();
        this.U0 = -1;
        this.V0 = -1;
        this.Y0 = new ArrayList();
        this.Z0 = new ArrayList();
        this.a1 = new Path();
        this.d1 = new RectF();
        this.e1 = true;
        this.f1 = false;
        this.o1 = false;
        this.p1 = false;
        this.r1 = new lm(this, 0L, 320L, s33.h);
        this.z1 = true;
        TextPaint textPaint = new TextPaint(1);
        this.F1 = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.G1 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.H1 = textPaint3;
        this.K1 = new RadialProgress2(this, null);
        this.O1 = new rh1((Object) this, (byte) 2);
        this.V1 = new Path();
        this.Y1 = new ArrayList();
        this.b2 = -1;
        this.e2 = -1;
        this.i2 = new Paint(1);
        this.m2 = new Path();
        this.n2 = new float[8];
        this.o2 = new float[8];
        this.p2 = new Path();
        this.q2 = new int[]{R.attr.state_enabled, R.attr.state_pressed};
        this.x2 = new tk1(this);
        u2bVar.a = false;
        this.s = z;
        this.h1 = wjbVar;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.J = imageReceiver;
        imageReceiver.q0(gl.u / 2);
        this.M = new pb0((wjb) null);
        this.x = up3.q(i).k();
        textPaint.setTextSize(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        textPaint3.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        textPaint2.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        View view = new View(context);
        this.U1 = view;
        view.setBackground(bkb.f0(bkb.p1(0.1f, -16777216), 7, gl.L(16.0f)));
        view.setVisibility(8);
        addView(view);
        bra braVar = new bra(10);
        this.W1 = braVar;
        braVar.N = 100;
        braVar.I = false;
        braVar.L = true;
        braVar.G = false;
        braVar.J = true;
        braVar.H = true;
        braVar.r = (byte) 1;
        braVar.w = 0.98f;
        braVar.v = 0.98f;
        braVar.u = 0.98f;
        braVar.g = false;
        braVar.o = 0.0f;
        braVar.x = (short) 750;
        braVar.y = (short) 750;
        braVar.c();
    }

    public static SpannableStringBuilder I(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gl.F2(str, false, gl.L(6.0f), -gl.L(1.3f), 0.8f, org.telegram.messenger.beta.R.drawable.floating_check));
        spannableStringBuilder.insert(0, (CharSequence) "*");
        spannableStringBuilder.setSpan(new se3(gl.L(18.0f)), 0, 1, 33);
        if (Build.VERSION.SDK_INT >= 29) {
            mk1.j();
            spannableStringBuilder.setSpan(mk1.g(gl.L(12.0f)), 0, spannableStringBuilder.length(), 33);
        }
        spannableStringBuilder.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_NORMAL), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static float b0(StaticLayout staticLayout) {
        float f = 0.0f;
        for (int i = 0; i < staticLayout.getLineCount(); i++) {
            float ceil = (int) Math.ceil(staticLayout.getLineWidth(i));
            if (ceil > f) {
                f = ceil;
            }
        }
        return f;
    }

    private float getWalletActionTop() {
        return gl.L(11.0f) + this.T + this.P;
    }

    private void setStarsPaused(boolean z) {
        bra braVar = this.W1;
        boolean z2 = braVar.g;
        ArrayList arrayList = braVar.n;
        if (z == z2) {
            return;
        }
        braVar.g = z;
        if (z) {
            braVar.Q = System.currentTimeMillis();
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            ara araVar = (ara) arrayList.get(i);
            araVar.a = (System.currentTimeMillis() - braVar.Q) + araVar.a;
        }
        invalidate();
    }

    public final boolean A(float f, int i) {
        i19 i19Var = this.F0;
        if (!i19Var.H) {
            return false;
        }
        float y = getY() + i19Var.c;
        return y > f && (y + ((float) i19Var.m)) - ((float) gl.L(16.0f)) < ((float) i);
    }

    public final void D() {
        SpannableStringBuilder spannableStringBuilder;
        int L = this.j1 - gl.L(16.0f);
        float L2 = gl.L(14.0f);
        TextPaint textPaint = this.F1;
        textPaint.setTextSize(L2);
        float L3 = gl.L(13.0f);
        TextPaint textPaint2 = this.G1;
        textPaint2.setTextSize(L3);
        TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = (TLRPC.TL_messageActionGiftCode) this.Q0.k.action;
        int i = tL_messageActionGiftCode.months;
        TLRPC.Chat K0 = na7.q1(this.I).K0(Long.valueOf(-cf3.n(tL_messageActionGiftCode.boost_peer)));
        String str = K0 == null ? null : K0.title;
        boolean z = tL_messageActionGiftCode.via_giveaway;
        String M0 = tL_messageActionGiftCode.unclaimed ? k96.M0(2131753173, "BoostingUnclaimedPrize") : k96.M0(2131753539, "BoostingCongratulations");
        String G = i == 12 ? k96.G(1, "BoldYears", new Object[0]) : k96.G(i, "BoldMonths", new Object[0]);
        if (!z) {
            spannableStringBuilder = new SpannableStringBuilder(gl.S2(str == null ? k96.M0(2131753307, null) : k96.a0("BoostingReceivedGiftFrom", null, 2131753308, str)));
            spannableStringBuilder.append((CharSequence) "\n\n");
            ls6.s(null, null, 2131753309, new Object[]{G}, spannableStringBuilder);
        } else if (tL_messageActionGiftCode.unclaimed) {
            spannableStringBuilder = new SpannableStringBuilder(gl.S2(k96.a0(null, null, 2131753163, str)));
            spannableStringBuilder.append((CharSequence) "\n\n");
            ls6.s(null, null, 2131753172, new Object[]{G}, spannableStringBuilder);
        } else {
            spannableStringBuilder = new SpannableStringBuilder(gl.S2(k96.a0(null, null, 2131753304, str)));
            spannableStringBuilder.append((CharSequence) "\n\n");
            ls6.s(null, null, 2131753305, new Object[]{G}, spannableStringBuilder);
        }
        String M02 = k96.M0(2131753306, "BoostingReceivedGiftOpenBtn");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(M0);
        valueOf.setSpan(new z3c(gl.o()), 0, valueOf.length(), 33);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        this.k1 = new StaticLayout(valueOf, textPaint, L, alignment, 1.1f, 0.0f, false);
        this.n1 = null;
        this.m1 = null;
        sk1 sk1Var = this.t1;
        if (sk1Var != null) {
            gm.release(sk1Var.i, sk1Var.h);
        }
        sk1 sk1Var2 = new sk1(this);
        this.t1 = sk1Var2;
        sk1Var2.a(L, textPaint2, spannableStringBuilder);
        SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(M02);
        valueOf2.setSpan(new z3c(gl.o()), 0, valueOf2.length(), 33);
        this.p1 = false;
        this.q1 = 0;
        this.x1 = null;
        StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) R("paintChatActionText"), L, alignment, 1.0f, 0.0f, false);
        this.y1 = staticLayout;
        this.z1 = true;
        this.E1 = b0(staticLayout);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    public final void G(CharSequence charSequence, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence2, boolean z, CharSequence charSequence3, int i, String str, int i2, boolean z2) {
        ?? r4;
        int i3;
        int a;
        CharSequence charSequence4 = charSequence2;
        int L = i2 - gl.L(16.0f);
        k27 k27Var = this.Q0;
        if (k27Var != null && k27Var.D == 30) {
            L -= gl.L(16.0f);
        }
        int i4 = L;
        if (charSequence != null) {
            k27 k27Var2 = this.Q0;
            TextPaint textPaint = this.F1;
            if (k27Var2 == null || k27Var2.D != 30) {
                textPaint.setTextSize(gl.L(16.0f));
            } else {
                textPaint.setTextSize(gl.L(14.0f));
            }
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
            valueOf.setSpan(new z3c(gl.o()), 0, valueOf.length(), 33);
            r4 = 0;
            this.k1 = new StaticLayout(valueOf, textPaint, i4, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        } else {
            r4 = 0;
            this.k1 = null;
        }
        this.n1 = null;
        if (spannableStringBuilder != null) {
            tgb tgbVar = new tgb(spannableStringBuilder, 10.0f, null);
            this.m1 = tgbVar;
            tgbVar.a.linkColor = -1;
        } else {
            this.m1 = null;
        }
        TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = this.c2;
        TextPaint textPaint2 = this.G1;
        if (tL_messageActionStarGiftOnchainOffer != null) {
            textPaint2.setTextSize(R("paintChatActionText").getTextSize());
        } else {
            k27 k27Var3 = this.Q0;
            if (k27Var3 != null) {
                if (k27Var3.D == 35) {
                    textPaint2.setTextSize(gl.L(14.3f));
                } else if (Z() || (i3 = this.Q0.D) == 30 || i3 == 18 || i3 == 31 || i3 == 37 || i3 == 33) {
                    textPaint2.setTextSize(gl.L(13.0f));
                }
            }
            textPaint2.setTextSize(gl.L(15.0f));
        }
        int L2 = i4 - gl.L(12.0f);
        k27 k27Var4 = this.Q0;
        if (k27Var4 != null && k27Var4.D == 22 && k27.B0(k27Var4.k) >= 0 && (a = je5.a(charSequence4, textPaint2)) < L2 && a > L2 / 5.0f) {
            L2 = a;
        }
        sk1 sk1Var = this.t1;
        if (charSequence4 == 0) {
            if (sk1Var != null) {
                gm.release(sk1Var.i, sk1Var.h);
                this.t1 = null;
            }
            this.p1 = r4;
        } else {
            if (sk1Var == null) {
                this.t1 = new sk1(this);
            }
            try {
                charSequence4 = vu3.m(charSequence4, textPaint2.getFontMetricsInt(), r4, null, r4);
            } catch (Exception unused) {
            }
            this.t1.a(L2, textPaint2, charSequence4);
            if (!z || this.t1.d.getLineCount() <= 3) {
                this.p1 = r4;
                this.r1.f(true, true);
                this.q1 = r4;
            } else {
                this.p1 = !this.o1;
                this.q1 = this.t1.d.getLineBottom(2);
                this.x1 = new tgb(k96.M0(2131750249, null), textPaint2.getTextSize() / gl.p, gl.o());
                int lineBottom = this.t1.d.getLineBottom(2);
                this.v1 = lineBottom;
                this.w1 = lineBottom - this.t1.d.getLineTop(2);
                this.u1 = (int) this.t1.d.getLineRight(2);
            }
            if (this.p1) {
                int lineEnd = this.t1.d.getLineEnd(2) - 1;
                sk1 sk1Var2 = this.t1;
                CharSequence charSequence5 = charSequence4;
                if (lineEnd >= 0) {
                    charSequence5 = charSequence4.subSequence(r4, lineEnd);
                }
                sk1Var2.a(L2, textPaint2, charSequence5);
            }
        }
        if (charSequence3 != null) {
            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(charSequence3);
            valueOf2.setSpan(new z3c(gl.o()), r4, valueOf2.length(), 33);
            boolean z3 = true;
            StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) R("paintChatActionText"), i4, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.y1 = staticLayout;
            if (!z2 || this.p1) {
                z3 = r4;
            }
            this.z1 = z3;
            this.E1 = b0(staticLayout);
        } else {
            this.y1 = null;
            this.z1 = r4;
            this.E1 = 0.0f;
        }
        if (str == null) {
            this.S1 = null;
            this.T1 = null;
            return;
        }
        if (this.R1 == null) {
            this.R1 = new CornerPathEffect(gl.L(5.0f));
        }
        if (this.S1 == null) {
            Path path = new Path();
            this.S1 = path;
            qv4.d(path, 1.35f, r4);
        }
        tgb tgbVar2 = new tgb(str, i, gl.o());
        this.T1 = tgbVar2;
        tgbVar2.p = gl.L(62.0f);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(30:12|(1:14)|15|(28:17|(2:19|(2:23|(21:25|26|(3:28|(3:30|(1:32)|33)|34)(1:97)|35|(1:37)(1:96)|38|39|(2:43|(2:45|(1:49)))|50|(1:95)(1:56)|57|(1:59)|60|(4:78|79|(5:81|82|(1:84)|85|86)|92)|64|(1:66)|67|(1:69)(1:77)|70|71|(2:73|74)(1:76))))|98|26|(0)(0)|35|(0)(0)|38|39|(3:41|43|(0))|50|(1:52)|95|57|(0)|60|(1:62)|78|79|(0)|92|64|(0)|67|(0)(0)|70|71|(0)(0))|99|26|(0)(0)|35|(0)(0)|38|39|(0)|50|(0)|95|57|(0)|60|(0)|78|79|(0)|92|64|(0)|67|(0)(0)|70|71|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0193, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0194, code lost:
    
        fa4.g(r0, true);
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(int i, CharSequence charSequence) {
        TextPaint textPaint;
        int i2;
        CharSequence charSequence2;
        CharSequence charSequence3;
        k27 k27Var;
        StaticLayout staticLayout;
        k27 k27Var2;
        int lineCount;
        rk1 rk1Var;
        TLRPC.Message message;
        TLRPC.MessageAction messageAction;
        int L = i - gl.L(30.0f);
        if (this.j0) {
            L -= gl.L(64.0f);
        }
        if (Y()) {
            L = Math.min(L - gl.L(this.j0 ? 28.0f : 82.0f), gl.L(272.0f));
        }
        if (L < 0) {
            return;
        }
        int i3 = this.l2;
        if (i3 > 0) {
            L = Math.min(i3, L);
        }
        int i4 = L;
        this.e1 = true;
        if (!Y()) {
            k27 k27Var3 = this.Q0;
            if (k27Var3 != null) {
                int i5 = k27Var3.D;
                if (i5 != 34 && i5 != 35) {
                    if (k27Var3.s2) {
                        textPaint = (TextPaint) R("paintChatActionText2");
                        textPaint.linkColor = textPaint.getColor();
                        if (Y()) {
                            if (charSequence instanceof Spannable) {
                                Spannable spannable = (Spannable) charSequence;
                                for (su3 su3Var : (su3[]) spannable.getSpans(0, spannable.length(), su3.class)) {
                                    spannable.removeSpan(su3Var);
                                }
                            }
                            charSequence2 = vu3.n(charSequence, textPaint.getFontMetricsInt(), false, null, 0, 0.85f, 0);
                        } else {
                            charSequence2 = charSequence;
                        }
                        TextPaint textPaint2 = textPaint;
                        charSequence3 = charSequence2;
                        this.N = new StaticLayout(charSequence2, textPaint2, i4, Y() ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                        this.Q = null;
                        k27Var = this.Q0;
                        if (k27Var != null && (message = k27Var.k) != null) {
                            messageAction = message.action;
                            if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                                TLRPC.TL_messageActionSuggestedPostApproval tL_messageActionSuggestedPostApproval = (TLRPC.TL_messageActionSuggestedPostApproval) messageAction;
                                if (!tL_messageActionSuggestedPostApproval.rejected && !tL_messageActionSuggestedPostApproval.balance_too_low) {
                                    this.Q = new StaticLayout(vu3.n(gl.S2(k96.M0(2131744125, null)), textPaint2.getFontMetricsInt(), false, null, 0, 1.0f, 0), textPaint2, i4, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                                }
                            }
                        }
                        this.s0 = gm.update(0, this, (this.s || (rk1Var = this.g1) == null || rk1Var.l()) ? false : true, this.s0, this.N);
                        this.P = 0;
                        this.O = 0;
                        this.R = 0;
                        staticLayout = this.Q;
                        if (staticLayout != null) {
                            int height = staticLayout.getHeight();
                            this.R = height;
                            this.R = gl.L(12.0f) + height;
                        }
                        k27Var2 = this.Q0;
                        if (k27Var2 != null || !k27Var2.j2) {
                            lineCount = this.N.getLineCount();
                            for (i2 = 0; i2 < lineCount; i2++) {
                                try {
                                    float lineWidth = this.N.getLineWidth(i2);
                                    float f = i4;
                                    if (lineWidth > f) {
                                        lineWidth = f;
                                    }
                                    this.P = (int) Math.max(this.P, Math.ceil(this.N.getLineBottom(i2)));
                                    this.O = (int) Math.max(this.O, Math.ceil(lineWidth));
                                } catch (Exception e) {
                                    fa4.g(e, true);
                                    return;
                                }
                            }
                        }
                        this.S = (i - this.O) / 2;
                        int L2 = gl.L(7.0f);
                        this.T = L2;
                        if (this.Q != null) {
                            this.T = de9.w(11.0f, this.R, L2);
                        }
                        this.U = (i - (Y() ? this.O : this.N.getWidth())) / 2;
                        this.V = (i - i4) / 2;
                        Stack stack = this.r0;
                        ArrayList arrayList = this.q0;
                        stack.addAll(arrayList);
                        arrayList.clear();
                        if (charSequence3 instanceof Spannable) {
                            StaticLayout staticLayout2 = this.N;
                            int i6 = this.S;
                            qla.a(this, staticLayout2, i6, i6 + this.O, (Spannable) charSequence3, stack, arrayList, null);
                            return;
                        }
                        return;
                    }
                }
            }
            textPaint = (TextPaint) R("paintChatActionText");
            textPaint.linkColor = textPaint.getColor();
            if (Y()) {
            }
            TextPaint textPaint22 = textPaint;
            charSequence3 = charSequence2;
            this.N = new StaticLayout(charSequence2, textPaint22, i4, Y() ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.Q = null;
            k27Var = this.Q0;
            if (k27Var != null) {
                messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                }
            }
            this.s0 = gm.update(0, this, (this.s || (rk1Var = this.g1) == null || rk1Var.l()) ? false : true, this.s0, this.N);
            this.P = 0;
            this.O = 0;
            this.R = 0;
            staticLayout = this.Q;
            if (staticLayout != null) {
            }
            k27Var2 = this.Q0;
            if (k27Var2 != null) {
            }
            lineCount = this.N.getLineCount();
            while (i2 < lineCount) {
            }
            this.S = (i - this.O) / 2;
            int L22 = gl.L(7.0f);
            this.T = L22;
            if (this.Q != null) {
            }
            this.U = (i - (Y() ? this.O : this.N.getWidth())) / 2;
            this.V = (i - i4) / 2;
            Stack stack2 = this.r0;
            ArrayList arrayList2 = this.q0;
            stack2.addAll(arrayList2);
            arrayList2.clear();
            if (charSequence3 instanceof Spannable) {
            }
        }
        textPaint = (TextPaint) R("paintChatActionText3");
        textPaint.linkColor = textPaint.getColor();
        if (Y()) {
        }
        TextPaint textPaint222 = textPaint;
        charSequence3 = charSequence2;
        this.N = new StaticLayout(charSequence2, textPaint222, i4, Y() ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.Q = null;
        k27Var = this.Q0;
        if (k27Var != null) {
        }
        this.s0 = gm.update(0, this, (this.s || (rk1Var = this.g1) == null || rk1Var.l()) ? false : true, this.s0, this.N);
        this.P = 0;
        this.O = 0;
        this.R = 0;
        staticLayout = this.Q;
        if (staticLayout != null) {
        }
        k27Var2 = this.Q0;
        if (k27Var2 != null) {
        }
        lineCount = this.N.getLineCount();
        while (i2 < lineCount) {
        }
        this.S = (i - this.O) / 2;
        int L222 = gl.L(7.0f);
        this.T = L222;
        if (this.Q != null) {
        }
        this.U = (i - (Y() ? this.O : this.N.getWidth())) / 2;
        this.V = (i - i4) / 2;
        Stack stack22 = this.r0;
        ArrayList arrayList22 = this.q0;
        stack22.addAll(arrayList22);
        arrayList22.clear();
        if (charSequence3 instanceof Spannable) {
        }
    }

    public final void J(Canvas canvas, boolean z) {
        uk1 uk1Var;
        Paint paint;
        Paint paint2;
        wjb wjbVar;
        float f;
        float f2;
        float f3;
        float f4;
        wjb wjbVar2;
        Paint paint3;
        Paint paint4;
        int i;
        int i2;
        Canvas canvas2;
        float f5;
        float f6;
        float f7;
        RectF rectF;
        int i3;
        sk1 sk1Var;
        int L;
        RectF rectF2;
        ArrayList arrayList;
        int i4;
        int i5;
        Paint paint5;
        int i6;
        float f8;
        StaticLayout staticLayout;
        ArrayList arrayList2;
        int i7;
        int i8;
        int i9;
        int i10;
        uk1 uk1Var2 = this;
        if (uk1Var2.s) {
            if (uk1Var2.T() && !z) {
                return;
            }
            if (!uk1Var2.T() && z) {
                return;
            }
        }
        Paint R = uk1Var2.R("paintChatActionBackground");
        Paint R2 = uk1Var2.R("paintChatActionBackgroundDarken");
        uk1Var2.t0 = (TextPaint) uk1Var2.R("paintChatActionText");
        int i11 = uk1Var2.U0;
        wjb wjbVar3 = uk1Var2.h1;
        if (i11 >= 0) {
            int v0 = bkb.v0(i11, wjbVar3);
            if (uk1Var2.W0 == null) {
                Paint paint6 = new Paint(1);
                uk1Var2.W0 = paint6;
                paint6.setColor(v0);
                TextPaint textPaint = new TextPaint(1);
                uk1Var2.X0 = textPaint;
                textPaint.setTypeface(gl.o());
                uk1Var2.X0.setTextSize(gl.L(Math.max(16, gba.S0) - 2));
                uk1Var2.X0.setColor(bkb.v0(uk1Var2.V0, wjbVar3));
            }
            R = uk1Var2.W0;
            uk1Var2.t0 = uk1Var2.X0;
        }
        boolean z2 = uk1Var2.e1;
        Path path = uk1Var2.a1;
        if (z2) {
            uk1Var2.e1 = false;
            uk1Var2.b1 = uk1Var2.getWidth();
            uk1Var2.c1 = 0;
            StaticLayout staticLayout2 = uk1Var2.N;
            int measuredWidth = uk1Var2.getMeasuredWidth() / 2;
            int L2 = gl.L(4.0f);
            f2 = 6.0f;
            ArrayList arrayList3 = uk1Var2.Y0;
            arrayList3.clear();
            int lineCount = staticLayout2 == null ? 0 : staticLayout2.getLineCount();
            f3 = 8.0f;
            int L3 = gl.L(11.0f);
            f = 4.0f;
            int L4 = gl.L(8.0f);
            int i12 = 0;
            f4 = 2.0f;
            int i13 = 0;
            while (i12 < lineCount) {
                wjb wjbVar4 = wjbVar3;
                int ceil = (int) Math.ceil(staticLayout2.getLineWidth(i12));
                if (i12 == 0 || (i10 = i13 - ceil) <= 0) {
                    i8 = ceil;
                } else {
                    i8 = ceil;
                    if (i10 <= (L3 * 1.5f) + L4) {
                        i9 = i13;
                        i12 = tb4.g(i9, i12, 1, arrayList3);
                        i13 = i9;
                        wjbVar3 = wjbVar4;
                    }
                }
                i9 = i8;
                i12 = tb4.g(i9, i12, 1, arrayList3);
                i13 = i9;
                wjbVar3 = wjbVar4;
            }
            wjbVar = wjbVar3;
            for (int i14 = lineCount - 2; i14 >= 0; i14--) {
                int intValue = ((Integer) arrayList3.get(i14)).intValue();
                int i15 = i13 - intValue;
                if (i15 > 0) {
                    i7 = intValue;
                    if (i15 <= (L3 * 1.5f) + L4) {
                        arrayList3.set(i14, Integer.valueOf(i13));
                    }
                } else {
                    i7 = intValue;
                }
                i13 = i7;
                arrayList3.set(i14, Integer.valueOf(i13));
            }
            int L5 = gl.L(3.0f);
            int L6 = gl.L(6.0f);
            int i16 = L3 - L5;
            ArrayList arrayList4 = uk1Var2.Z0;
            arrayList4.clear();
            path.reset();
            float f9 = measuredWidth;
            path.moveTo(f9, L2);
            int i17 = i13;
            int i18 = 0;
            int i19 = 0;
            while (true) {
                rectF2 = uk1Var2.d1;
                if (i19 >= lineCount) {
                    break;
                }
                int intValue2 = ((Integer) arrayList3.get(i19)).intValue();
                int lineBottom = staticLayout2.getLineBottom(i19);
                int i20 = lineCount;
                int i21 = i20 - 1;
                if (i19 < i21) {
                    paint5 = R2;
                    i6 = ((Integer) arrayList3.get(i19 + 1)).intValue();
                } else {
                    paint5 = R2;
                    i6 = 0;
                }
                int i22 = lineBottom - i18;
                if (i19 == 0 || intValue2 > i17) {
                    i22 = gl.L(3.0f) + i22;
                }
                if (i19 == i21 || intValue2 > i6) {
                    i22 = gl.L(3.0f) + i22;
                }
                Paint paint7 = R;
                float f10 = (intValue2 / 2.0f) + f9;
                int i23 = (i19 == i21 || intValue2 >= i6 || i19 == 0 || intValue2 >= i17) ? L4 : L6;
                if (i19 == 0 || intValue2 > i17) {
                    f8 = f10;
                    staticLayout = staticLayout2;
                    arrayList2 = arrayList3;
                    rectF2.set((f8 - L5) - L3, L2, f8 + i16, (L3 << 1) + L2);
                    z();
                    path.arcTo(rectF2, -90.0f, 90.0f);
                } else {
                    f8 = f10;
                    if (intValue2 < i17) {
                        float f11 = f8 + i16;
                        staticLayout = staticLayout2;
                        arrayList2 = arrayList3;
                        rectF2.set(f11, L2, (i23 << 1) + f11, r4 + L2);
                        z();
                        path.arcTo(rectF2, -90.0f, -90.0f);
                    } else {
                        staticLayout = staticLayout2;
                        arrayList2 = arrayList3;
                    }
                }
                L2 += i22;
                if (i19 != i21 && intValue2 < i6) {
                    L2 -= gl.L(3.0f);
                    i22 -= gl.L(3.0f);
                }
                if (i19 != 0 && intValue2 < i17) {
                    L2 -= gl.L(3.0f);
                    i22 -= gl.L(3.0f);
                }
                arrayList4.add(Integer.valueOf(i22));
                if (i19 == i21 || intValue2 > i6) {
                    rectF2.set((f8 - L5) - L3, L2 - (L3 << 1), f8 + i16, L2);
                    z();
                    path.arcTo(rectF2, 0.0f, 90.0f);
                } else if (intValue2 < i6) {
                    float f12 = f8 + i16;
                    rectF2.set(f12, L2 - r0, (i23 << 1) + f12, L2);
                    z();
                    path.arcTo(rectF2, 180.0f, -90.0f);
                }
                i19++;
                uk1Var2 = this;
                i17 = intValue2;
                i18 = lineBottom;
                lineCount = i20;
                R2 = paint5;
                R = paint7;
                staticLayout2 = staticLayout;
                arrayList3 = arrayList2;
            }
            paint = R;
            paint2 = R2;
            StaticLayout staticLayout3 = staticLayout2;
            ArrayList arrayList5 = arrayList3;
            int i24 = lineCount - 1;
            int i25 = i24;
            while (i25 >= 0) {
                if (i25 != 0) {
                    arrayList = arrayList5;
                    i4 = ((Integer) arrayList.get(i25 - 1)).intValue();
                } else {
                    arrayList = arrayList5;
                    i4 = 0;
                }
                int intValue3 = ((Integer) arrayList.get(i25)).intValue();
                int intValue4 = i25 != i24 ? ((Integer) arrayList.get(i25 + 1)).intValue() : 0;
                StaticLayout staticLayout4 = staticLayout3;
                staticLayout4.getLineBottom(i25);
                float f13 = measuredWidth - (intValue3 / 2);
                int i26 = (i25 == i24 || intValue3 >= intValue4 || i25 == 0 || intValue3 >= i4) ? L4 : L6;
                if (i25 == i24 || intValue3 > intValue4) {
                    arrayList5 = arrayList;
                    staticLayout3 = staticLayout4;
                    i5 = i24;
                    rectF2.set(f13 - i16, L2 - (L3 << 1), L5 + f13 + L3, L2);
                    z();
                    path.arcTo(rectF2, 90.0f, 90.0f);
                } else if (intValue3 < intValue4) {
                    float f14 = f13 - i16;
                    arrayList5 = arrayList;
                    staticLayout3 = staticLayout4;
                    i5 = i24;
                    rectF2.set(f14 - (i26 << 1), L2 - r2, f14, L2);
                    z();
                    path.arcTo(rectF2, 90.0f, -90.0f);
                } else {
                    arrayList5 = arrayList;
                    staticLayout3 = staticLayout4;
                    i5 = i24;
                }
                L2 -= ((Integer) arrayList4.get(i25)).intValue();
                if (i25 == 0 || intValue3 > i4) {
                    rectF2.set(f13 - i16, L2, f13 + L5 + L3, (L3 << 1) + L2);
                    z();
                    path.arcTo(rectF2, 180.0f, 90.0f);
                } else if (intValue3 < i4) {
                    float f15 = f13 - i16;
                    rectF2.set(f15 - (i26 << 1), L2, f15, r11 + L2);
                    z();
                    path.arcTo(rectF2, 0.0f, -90.0f);
                }
                i25--;
                i24 = i5;
            }
            path.close();
            int measuredWidth2 = getMeasuredWidth() / 2;
            if (!Y() || Z()) {
                uk1Var = this;
            } else {
                float f16 = measuredWidth2;
                uk1Var = this;
                rectF2.left = (f16 - (uk1Var.O / 2.0f)) - gl.L(17.0f);
                rectF2.top = L2;
                rectF2.right = (uk1Var.O / 2.0f) + f16 + gl.L(17.0f);
                rectF2.bottom = gl.L(28.0f) + L2 + uk1Var.P + uk1Var.R;
                path.reset();
                path.addRoundRect(rectF2, gl.L(15.0f), gl.L(15.0f), Path.Direction.CW);
                path.close();
            }
        } else {
            uk1Var = uk1Var2;
            paint = R;
            paint2 = R2;
            wjbVar = wjbVar3;
            f = 4.0f;
            f2 = 6.0f;
            f3 = 8.0f;
            f4 = 2.0f;
        }
        if (!uk1Var.x0) {
            uk1Var.w0 = ((ViewGroup) uk1Var.getParent()).getMeasuredHeight();
        }
        if (wjbVar != null) {
            wjbVar2 = wjbVar;
            wjbVar2.b(uk1Var.v0, uk1Var.u0 + gl.L(f), uk1Var.getMeasuredWidth(), uk1Var.w0);
        } else {
            wjbVar2 = wjbVar;
            bkb.q(uk1Var.v0, uk1Var.u0 + gl.L(f), uk1Var.getMeasuredWidth(), uk1Var.w0);
        }
        boolean z3 = uk1Var instanceof rq1;
        float f17 = (!z3 || bkb.g1(wjbVar2)) ? 1.0f : 0.75f;
        if (!z || (uk1Var.getAlpha() == 1.0f && !z3)) {
            paint3 = paint2;
            paint4 = paint;
            if (z3) {
                i = paint4.getAlpha();
                i2 = paint3.getAlpha();
                paint4.setAlpha((int) (i * f17));
                paint3.setAlpha((int) (i2 * f17));
            } else {
                i = -1;
                i2 = -1;
            }
        } else {
            i = paint.getAlpha();
            i2 = paint2.getAlpha();
            paint4 = paint;
            paint4.setAlpha((int) (uk1Var.getAlpha() * i * f17));
            paint3 = paint2;
            paint3.setAlpha((int) (uk1Var.getAlpha() * i2 * f17));
        }
        k27 k27Var = uk1Var.Q0;
        Paint paint8 = uk1Var.i2;
        if (k27Var == null || !k27Var.j2) {
            canvas2 = canvas;
            canvas2.drawPath(path, paint4);
            if (uk1Var.T() && paint3.getAlpha() > 0) {
                canvas2.drawPath(path, paint3);
            }
            if (uk1Var.h2 > 0.0f) {
                int alpha = paint8.getAlpha();
                if (z) {
                    paint8.setAlpha((int) (uk1Var.getAlpha() * alpha));
                }
                canvas2.drawPath(path, paint8);
                paint8.setAlpha(alpha);
            }
        } else {
            canvas2 = canvas;
        }
        if (uk1Var.V()) {
            int width = uk1Var.getWidth();
            uk1Var.J0.getClass();
            float L7 = (width - gl.L(206.0f)) / f4;
            float walletActionTop = uk1Var.getWalletActionTop();
            uk1Var.J0.getClass();
            float L8 = gl.L(206.0f) + L7;
            if (uk1Var.J0.q0 == null) {
                L = gl.L(140.0f);
                f5 = 140.0f;
                f6 = 20.0f;
            } else {
                f5 = 140.0f;
                f6 = 20.0f;
                L = gl.L(150.0f) + ((int) Math.ceil(r13.q0.h()));
            }
            RectF rectF3 = uk1Var.O0;
            rectF3.set(L7, walletActionTop, L8, L + walletActionTop);
            canvas2.save();
            uk1Var.J0.c(canvas2, L7, walletActionTop);
            canvas2.drawRoundRect(rectF3, gl.L(f6), gl.L(f6), paint4);
            if (uk1Var.T() && paint3.getAlpha() > 0) {
                canvas2.drawRoundRect(rectF3, gl.L(f6), gl.L(f6), paint3);
            }
            f7 = 0.0f;
            if (uk1Var.h2 > 0.0f) {
                int alpha2 = paint8.getAlpha();
                if (z) {
                    paint8.setAlpha((int) (uk1Var.getAlpha() * alpha2));
                }
                canvas2.drawRoundRect(rectF3, gl.L(f6), gl.L(f6), paint8);
                paint8.setAlpha(alpha2);
            }
            canvas2.restore();
        } else {
            f5 = 140.0f;
            f6 = 20.0f;
            f7 = 0.0f;
        }
        k27 k27Var2 = uk1Var.Q0;
        if (uk1Var.U()) {
            float L9 = uk1Var.I0.T.f + gl.L(f3);
            float width2 = (uk1Var.getWidth() - L9) / f4;
            float L10 = uk1Var.I0.p ? f7 : gl.L(12.0f) + uk1Var.T + uk1Var.P;
            RectF rectF4 = gl.P;
            rectF4.set(width2, L10, L9 + width2, uk1Var.I0.P + L10 + gl.L(f3));
            RectF rectF5 = uk1Var.N1;
            if (rectF5 == null) {
                rectF5 = new RectF();
                uk1Var.N1 = rectF5;
            }
            rectF5.set(rectF4);
            canvas2.drawRoundRect(uk1Var.N1, gl.L(16.0f), gl.L(16.0f), paint4);
            if (uk1Var.T()) {
                canvas2.drawRoundRect(uk1Var.N1, gl.L(16.0f), gl.L(16.0f), paint3);
            }
        } else if (uk1Var.P0 != null) {
            float L11 = gl.L(174.0f);
            xab xabVar = uk1Var.P0;
            xabVar.getClass();
            float L12 = gl.L(f5) + ((int) xabVar.f.h()) + (xabVar.i ? gl.L(40.0f) : 0);
            float width3 = (uk1Var.getWidth() - L11) / f4;
            RectF rectF6 = uk1Var.N1;
            if (rectF6 == null) {
                rectF6 = new RectF();
                uk1Var.N1 = rectF6;
            }
            rectF6.set(width3, gl.L(f), L11 + width3, gl.L(f) + L12);
            canvas2.drawRoundRect(uk1Var.N1, gl.L(16.0f), gl.L(16.0f), paint4);
            if (uk1Var.T()) {
                canvas2.drawRoundRect(uk1Var.N1, gl.L(16.0f), gl.L(16.0f), paint3);
            }
        } else if (uk1Var.X(k27Var2)) {
            float width4 = (uk1Var.getWidth() - uk1Var.j1) / f4;
            float f18 = uk1Var.T + uk1Var.P;
            if (uk1Var.Z()) {
                float L13 = f18 + gl.L(f);
                rectF = gl.P;
                rectF.set(width4, L13, uk1Var.j1 + width4, uk1Var.f + L13);
            } else {
                float L14 = f18 + gl.L(12.0f);
                rectF = gl.P;
                float f19 = uk1Var.j1;
                rectF.set(width4, L14, width4 + f19, f19 + L14 + uk1Var.L1);
            }
            if (k27Var2 != null && k27Var2.D == 18 && !uk1Var.p1 && (sk1Var = uk1Var.t1) != null && uk1Var.q1 > 0) {
                rectF.bottom = ls6.B(1.0f, uk1Var.r1.c, sk1Var.d.getHeight() - uk1Var.q1, rectF.bottom);
            }
            RectF rectF7 = uk1Var.N1;
            if (rectF7 == null) {
                rectF7 = new RectF();
                uk1Var.N1 = rectF7;
            }
            rectF7.set(rectF);
            if (k27Var2 == null || (!((i3 = k27Var2.D) == 33 || i3 == 35) || uk1Var.Z1 == null)) {
                canvas2.drawRoundRect(uk1Var.N1, gl.L(f6), gl.L(f6), paint4);
                if (uk1Var.T()) {
                    canvas2.drawRoundRect(uk1Var.N1, gl.L(f6), gl.L(f6), paint3);
                }
            } else {
                float L15 = gl.L(16.0f);
                float[] fArr = uk1Var.n2;
                Arrays.fill(fArr, L15);
                float L16 = gl.L(f2);
                fArr[7] = L16;
                fArr[6] = L16;
                fArr[5] = L16;
                fArr[4] = L16;
                Path path2 = uk1Var.m2;
                path2.rewind();
                path2.addRoundRect(uk1Var.N1, fArr, Path.Direction.CW);
                canvas2.drawPath(path2, paint4);
                if (uk1Var.T()) {
                    canvas2.drawPath(path2, paint3);
                }
            }
        }
        if (i >= 0) {
            paint4.setAlpha(i);
            paint3.setAlpha(i2);
        }
    }

    public final void K(Canvas canvas) {
        TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = this.c2;
        if (tL_messageActionStarGiftOnchainOffer == null || this.g2 == null || !(tL_messageActionStarGiftOnchainOffer.gift instanceof TL_stars.TL_starGiftUnique)) {
            return;
        }
        ImageReceiver imageReceiver = this.J;
        float L = imageReceiver.L0 + imageReceiver.N0 + gl.L(10.0f) + gl.L(1.9805f);
        int L2 = (int) ((L + gl.L(48.0f)) - gl.L(40.800003f));
        int L3 = (int) ((imageReceiver.M0 - gl.L(10.0f)) - gl.L(1.7f));
        this.g2.setBounds(L2 - gl.L(39.0f), L3, L2, gl.L(42.6f) + L3);
        this.g2.draw(canvas);
    }

    public final void L(Canvas canvas) {
        float f;
        float f2;
        Canvas canvas2 = canvas;
        canvas2.save();
        float f3 = 2.0f;
        canvas2.translate(this.k0 / 2.0f, getPaddingTop());
        canvas2.save();
        canvas2.translate(this.U, this.T);
        StaticLayout staticLayout = this.N;
        gm.drawAnimatedEmojis(canvas2, staticLayout, this.s0, 0.0f, this.q0, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout != null ? P(staticLayout.getPaint().getColor()) : null);
        canvas2.restore();
        float f4 = 4.0f;
        if (U()) {
            canvas2.save();
            float width = getWidth();
            xqa xqaVar = this.I0;
            canvas2.translate((width - xqaVar.T.f) / 2.0f, xqaVar.p ? gl.L(4.0f) : gl.L(16.0f) + this.T + this.P);
            this.I0.c(canvas2);
            canvas2.restore();
        }
        canvas2.restore();
        aub aubVar = this.o0;
        wjb wjbVar = this.h1;
        if (aubVar != null) {
            float alpha = getAlpha();
            if (wjbVar != null) {
                wjbVar.b(this.v0, this.u0 + 0.0f, getMeasuredWidth(), this.w0);
            } else {
                bkb.q(this.v0, this.u0 + 0.0f, getMeasuredWidth(), this.w0);
            }
            this.o0.c(canvas, getWidth(), this.k0, 0.0f, 1.0f, alpha, this.n0);
            canvas2 = canvas;
        }
        ArrayList arrayList = this.Y1;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (wjbVar != null) {
            wjbVar.b(this.v0, this.u0 + gl.L(4.0f), getMeasuredWidth(), this.w0);
        } else {
            bkb.q(this.v0, this.u0 + gl.L(4.0f), getMeasuredWidth(), this.w0);
        }
        float width2 = (getWidth() - this.j1) / 2.0f;
        float L = gl.L(4.0f) + gl.L(4.0f) + this.T + this.P + this.f;
        float L2 = (this.j1 - gl.L(4.0f)) / 2.0f;
        int i = 0;
        while (i < arrayList.size()) {
            wo0 wo0Var = (wo0) arrayList.get(i);
            float a = wo0Var.a();
            float L3 = ((gl.L(f4) + L2) * i) + width2;
            float f5 = L3 + L2;
            RectF rectF = this.d1;
            rectF.set(L3, L, f5, wo0Var.f + L);
            canvas2.save();
            if (a != 1.0f) {
                f = f4;
                canvas2.scale(a, a, rectF.centerX(), rectF.centerY());
            } else {
                f = f4;
            }
            float L4 = gl.L(Math.min(6.75f, gba.U0));
            float[] fArr = this.o2;
            Arrays.fill(fArr, L4);
            if ((wo0Var.g & 9) == 9) {
                float L5 = gl.L(gba.U0);
                fArr[7] = L5;
                fArr[6] = L5;
            }
            if ((wo0Var.g & 10) == 10) {
                float L6 = gl.L(gba.U0);
                fArr[5] = L6;
                fArr[4] = L6;
            }
            Path path = this.p2;
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas2.drawPath(path, R("paintChatActionBackground"));
            if (T()) {
                canvas2.drawPath(path, bkb.g2);
            }
            canvas2.save();
            canvas2.clipPath(path);
            ff0 ff0Var = wo0Var.s;
            if (ff0Var != null) {
                int i2 = (int) L;
                ff0Var.setBounds((int) L3, i2, (int) f5, wo0Var.f + i2);
                wo0Var.s.setAlpha(kk7.d4);
                wo0Var.s.draw(canvas2);
            }
            canvas2.restore();
            canvas2.save();
            float L7 = wo0Var.t != null ? gl.L(26.0f) : 0;
            float z = oo1.z(L2 - (wo0Var.h.j() + (wo0Var.t != null ? gl.L(f) : 0)), L7, f3, L3);
            Drawable drawable = wo0Var.t;
            if (drawable != null) {
                int i3 = (int) z;
                f2 = f3;
                drawable.setBounds(i3, (int) (((wo0Var.f - gl.L(24.0f)) / f3) + L), gl.L(24.0f) + i3, gl.L(24.0f) + ((int) (((wo0Var.f - gl.L(24.0f)) / f2) + L)));
                wo0Var.t.setAlpha(wo0Var.m ? 128 : kk7.d4);
                wo0Var.t.draw(canvas2);
                z += L7;
            } else {
                f2 = f3;
            }
            wo0Var.h.p = Math.max(1, (((int) L2) - gl.L(15.0f)) - r6);
            wo0Var.h.f(canvas2, z, (gl.L(40.0f) / f2) + L, wo0Var.m ? 0.5f : 1.0f);
            canvas2.restore();
            canvas2.restore();
            i++;
            f4 = f;
            f3 = f2;
        }
    }

    public final void M(Canvas canvas, boolean z) {
        if (this.s) {
            if (T() && !z) {
                return;
            }
            if (!T() && z) {
                return;
            }
        }
        O(canvas, z, null);
    }

    @Override // sp3
    public final void N(String str) {
        TLRPC.PhotoSize photoSize;
        k27 k27Var = this.Q0;
        if (k27Var == null || k27Var.D != 11) {
            return;
        }
        int size = k27Var.p0.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                photoSize = null;
                break;
            }
            photoSize = (TLRPC.PhotoSize) k27Var.p0.get(i);
            if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                break;
            } else {
                i++;
            }
        }
        this.J.Z(this.y0, "g", gl5.f(photoSize, k27Var.n0), "50_50_b", this.M, 0L, null, k27Var, 1);
        up3.q(this.I).v(this);
    }

    public final void O(Canvas canvas, boolean z, Integer num) {
        Canvas canvas2;
        float alpha = z ? getAlpha() : 1.0f;
        if (alpha > 0.0f) {
            wjb wjbVar = this.h1;
            if (wjbVar != null) {
                wjbVar.b(this.v0, this.u0 + gl.L(4.0f), getMeasuredWidth(), this.w0);
            } else {
                bkb.q(this.v0, this.u0 + gl.L(4.0f), getMeasuredWidth(), this.w0);
            }
            k27 k27Var = this.Q0;
            if (k27Var == null || !k27Var.N5()) {
                return;
            }
            i19 i19Var = this.F0;
            i19Var.getClass();
            i19Var.a = 1.0f;
            if (alpha < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (alpha * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            tk1 tk1Var = this.x2;
            i19Var.d(canvas2, tk1Var.b ? tk1Var.c : 1.0f, num);
            if (alpha < 1.0f) {
                canvas2.restore();
            }
        }
    }

    public final ColorFilter P(int i) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (i == this.w2 && (porterDuffColorFilter = this.v2) != null) {
            return porterDuffColorFilter;
        }
        this.w2 = i;
        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
        this.v2 = porterDuffColorFilter2;
        return porterDuffColorFilter2;
    }

    public final int Q(k27 k27Var) {
        int i;
        int i2 = this.i1;
        int i3 = k27Var.D;
        if (i3 == 37) {
            i2 = gl.L(52.0f);
        } else if (i3 == 21 || Z()) {
            i2 = gl.L(78.0f);
        }
        if (Y() || (i = k27Var.D) == 34 || i == 35) {
            return 0;
        }
        return i2;
    }

    public Paint R(String str) {
        wjb wjbVar = this.h1;
        Paint d = wjbVar != null ? wjbVar.d(str) : null;
        return d != null ? d : bkb.T0(str);
    }

    public final float S(k27 k27Var) {
        na7 q1;
        String str;
        if (k27Var == null) {
            return 1.0f;
        }
        try {
            if (k27Var.D == 22 && (str = (q1 = na7.q1(this.I)).J2) != null && TextUtils.equals(k27Var.k.action.wallpaper.uploadingImage, str)) {
                return q1.K2.r;
            }
            return 1.0f;
        } catch (Exception e) {
            fa4.g(e, true);
            return 1.0f;
        }
    }

    public final boolean T() {
        if (this.W0 != null) {
            return false;
        }
        wjb wjbVar = this.h1;
        return wjbVar != null ? wjbVar.g() : bkb.b1();
    }

    public final boolean U() {
        xqa xqaVar = this.I0;
        return (xqaVar == null || xqaVar.Q == null) ? false : true;
    }

    public final boolean V() {
        TLRPC.Message message;
        k27 k27Var = this.Q0;
        return (k27Var == null || (message = k27Var.k) == null || !(message.action instanceof TLRPC.TL_messageActionGramTransfer)) ? false : true;
    }

    public final void W() {
        rk1 rk1Var = this.g1;
        if (rk1Var != null && rk1Var.l()) {
            super.invalidate();
        } else if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public final boolean X(k27 k27Var) {
        if (k27Var == null) {
            return false;
        }
        int i = k27Var.D;
        return i == 30 || i == 18 || i == 25 || Z();
    }

    public final boolean Y() {
        TLRPC.Message message;
        k27 k27Var = this.Q0;
        return (k27Var == null || (message = k27Var.k) == null || !(message.action instanceof TLRPC.TL_messageActionSuggestedPostApproval)) ? false : true;
    }

    public final boolean Z() {
        k27 k27Var;
        int i;
        if (U() || this.P0 != null || (i = (k27Var = this.Q0).D) == 31 || i == 37 || i == 33 || i == 35 || i == 34 || i == 21 || i == 22 || k27Var.y4()) {
            return true;
        }
        TLRPC.Message message = this.Q0.k;
        if (message == null) {
            return false;
        }
        TLRPC.MessageAction messageAction = message.action;
        if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
            return ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction).balance_too_low || ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction).rejected;
        }
        return false;
    }

    @Override // ni5
    public final boolean a() {
        return false;
    }

    public final boolean a0() {
        k27 k27Var = this.Q0;
        if (k27Var == null) {
            return false;
        }
        TLRPC.Message message = k27Var.k;
        TLRPC.MessageAction messageAction = message.action;
        if (((messageAction instanceof TLRPC.TL_messageActionGiftCode) || (messageAction instanceof TLRPC.TL_messageActionGiftStars)) && (message.from_id instanceof TLRPC.TL_peerUser)) {
            return l7c.D(na7.q1(this.I).V1(Long.valueOf(this.Q0.k.from_id.user_id)));
        }
        return false;
    }

    @Override // ni5
    public final void c(TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
        rk1 rk1Var = this.g1;
        if (rk1Var != null) {
            rk1Var.y(this, reactionCount, z, f, f2);
        }
    }

    public final boolean c0() {
        TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = this.c2;
        if (tL_messageActionStarGiftOnchainOffer == null || !this.d2) {
            return false;
        }
        long j = tL_messageActionStarGiftOnchainOffer.offer_id;
        Long l = (Long) vp7.a.get(Long.valueOf(j));
        if (l != null && l.longValue() > SystemClock.elapsedRealtime() && vp7.b.contains(Long.valueOf(j))) {
            return true;
        }
        int i = this.I;
        return vp7.k(i, j) || vp7.m(i, j);
    }

    public final CharSequence d0(SpannableStringBuilder spannableStringBuilder, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer) {
        HashMap hashMap = vp7.a;
        CharSequence charSequence = null;
        if (tL_messageActionStarGiftOnchainOffer.settled && !tL_messageActionStarGiftOnchainOffer.accepted) {
            charSequence = k96.M0(2131749559, null);
        } else if (!tL_messageActionStarGiftOnchainOffer.accepted && !tL_messageActionStarGiftOnchainOffer.declined) {
            if (tL_messageActionStarGiftOnchainOffer.cancelled) {
                charSequence = k96.M0(2131749558, null);
            } else if (tL_messageActionStarGiftOnchainOffer.cancelling) {
                charSequence = k96.M0(2131749563, null);
            } else {
                int max = Math.max(0, tL_messageActionStarGiftOnchainOffer.expires_at - ConnectionsManager.getInstance(this.I).getCurrentTime());
                charSequence = tL_messageActionStarGiftOnchainOffer.expired ? k96.M0(2131749561, null) : max == 0 ? k96.M0(2131749560, null) : gl.S2(k96.a0(null, null, 2131749597, String.format(Locale.US, "%02d:%02d:%02d", Integer.valueOf(max / 3600), Integer.valueOf((max / 60) % 60), Integer.valueOf(max % 60))));
            }
        }
        if (charSequence == null) {
            return spannableStringBuilder;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        spannableStringBuilder2.append((CharSequence) "\n\n");
        spannableStringBuilder2.append(charSequence);
        return spannableStringBuilder2;
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        k27 k27Var;
        if (i == kk7.l1) {
            setSpoilersSuppressed(false);
            return;
        }
        if (i == kk7.k4 || i == kk7.K3) {
            invalidate();
            return;
        }
        if (i == kk7.k1) {
            setSpoilersSuppressed(true);
            return;
        }
        if (i == kk7.X2 || i == kk7.G3 || i == kk7.Y2) {
            k27 k27Var2 = this.Q0;
            if (k27Var2 != null) {
                j0(k27Var2, true);
                return;
            }
            return;
        }
        if (i == kk7.x0) {
            if (!Objects.equals(objArr[0], y6c.h(this.I).c0) || (k27Var = this.Q0) == null) {
                return;
            }
            j0(k27Var, true);
            return;
        }
        if (i == kk7.c4 && V()) {
            this.s2 = null;
            this.W = 0;
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view != this.U1) {
            return super.drawChild(canvas, view, j);
        }
        float a = this.n.a(0.02f);
        canvas.save();
        canvas.scale(a, a, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    public final void e0(CharacterStyle characterStyle) {
        if (this.g1 == null || !(characterStyle instanceof URLSpan)) {
            return;
        }
        String url = ((URLSpan) characterStyle).getURL();
        if (url.startsWith("task")) {
            this.g1.o(this, this.Q0.N1(), Integer.parseInt(url.substring(5)));
            return;
        }
        if (url.startsWith("topic")) {
            URLSpan uRLSpan = this.y;
            if (uRLSpan instanceof g4c) {
                TLObject tLObject = ((g4c) uRLSpan).c;
                if (tLObject instanceof TLRPC.TL_forumTopic) {
                    mm4.n(this.g1.v(), -this.g1.a(), (TLRPC.TL_forumTopic) tLObject, 0);
                    return;
                }
                return;
            }
        }
        if (url.startsWith("invite")) {
            URLSpan uRLSpan2 = this.y;
            if (uRLSpan2 instanceof g4c) {
                TLObject tLObject2 = ((g4c) uRLSpan2).c;
                if (tLObject2 instanceof TLRPC.TL_chatInviteExported) {
                    this.g1.w((TLRPC.TL_chatInviteExported) tLObject2);
                    return;
                }
                return;
            }
        }
        if (url.startsWith("game")) {
            this.g1.B(this, this.Q0.N1());
        } else if (url.startsWith("http")) {
            d01.t(getContext(), url);
        } else {
            this.g1.C(Long.parseLong(url));
        }
    }

    public final void f0() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
        k27 k27Var = this.Q0;
        TLRPC.MessageAction messageAction = k27Var.k.action;
        tL_premiumGiftOption.amount = messageAction.amount;
        tL_premiumGiftOption.months = messageAction.months;
        tL_premiumGiftOption.currency = messageAction.currency;
        String str = null;
        if (k27Var != null && (messageAction instanceof TLRPC.TL_messageActionGiftCode) && !a0()) {
            str = ((TLRPC.TL_messageActionGiftCode) this.Q0.k.action).slug;
        }
        if (this.g1 != null) {
            gl.c3(new fv0((gk7) this, (Object) tL_premiumGiftOption, str, (byte) 23));
        }
    }

    public final void g0() {
        TLRPC.Message message;
        k27 k27Var = this.Q0;
        if (k27Var == null || (message = k27Var.k) == null) {
            return;
        }
        TLRPC.MessageAction messageAction = message.action;
        boolean z = messageAction instanceof TLRPC.TL_messageActionGiftStars;
        u2b u2bVar = this.e0;
        if (z) {
            Context context = getContext();
            TLRPC.Message message2 = this.Q0.k;
            int i = message2.date;
            TLRPC.Peer peer = message2.from_id;
            TLRPC.Peer peer2 = message2.peer_id;
            TLRPC.TL_messageActionGiftStars tL_messageActionGiftStars = (TLRPC.TL_messageActionGiftStars) message2.action;
            wjb wjbVar = u2bVar.J;
            TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
            starsTransaction.title = null;
            starsTransaction.description = null;
            starsTransaction.photo = null;
            TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
            starsTransaction.peer = tL_starsTransactionPeer;
            tL_starsTransactionPeer.peer = peer;
            starsTransaction.date = i;
            starsTransaction.amount = TL_stars.StarsAmount.ofStars(tL_messageActionGiftStars.stars);
            starsTransaction.id = tL_messageActionGiftStars.transaction_id;
            starsTransaction.gift = true;
            starsTransaction.sent_by = peer;
            starsTransaction.received_by = peer2;
            jva.k1(context, false, 0L, this.I, starsTransaction, wjbVar);
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionPrizeStars) {
            Context context2 = getContext();
            TLRPC.Message message3 = this.Q0.k;
            int i2 = message3.date;
            TLRPC.Peer peer3 = message3.from_id;
            TLRPC.Peer peer4 = message3.peer_id;
            TLRPC.TL_messageActionPrizeStars tL_messageActionPrizeStars = (TLRPC.TL_messageActionPrizeStars) message3.action;
            wjb wjbVar2 = u2bVar.J;
            TL_stars.StarsTransaction starsTransaction2 = new TL_stars.StarsTransaction();
            starsTransaction2.title = null;
            starsTransaction2.description = null;
            starsTransaction2.photo = null;
            TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer2 = new TL_stars.TL_starsTransactionPeer();
            starsTransaction2.peer = tL_starsTransactionPeer2;
            tL_starsTransactionPeer2.peer = tL_messageActionPrizeStars.boost_peer;
            starsTransaction2.date = i2;
            starsTransaction2.amount = TL_stars.StarsAmount.ofStars(tL_messageActionPrizeStars.stars);
            starsTransaction2.id = tL_messageActionPrizeStars.transaction_id;
            starsTransaction2.gift = true;
            starsTransaction2.flags |= TLObject.FLAG_13;
            starsTransaction2.giveaway_post_id = tL_messageActionPrizeStars.giveaway_msg_id;
            starsTransaction2.sent_by = peer3;
            starsTransaction2.received_by = peer4;
            jva.k1(context2, false, 0L, this.I, starsTransaction2, wjbVar2);
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionGiftTon) {
            Context context3 = getContext();
            TLRPC.Message message4 = this.Q0.k;
            int i3 = message4.date;
            TLRPC.Peer peer5 = message4.from_id;
            TLRPC.Peer peer6 = message4.peer_id;
            TLRPC.TL_messageActionGiftTon tL_messageActionGiftTon = (TLRPC.TL_messageActionGiftTon) message4.action;
            wjb wjbVar3 = u2bVar.J;
            TL_stars.StarsTransaction starsTransaction3 = new TL_stars.StarsTransaction();
            starsTransaction3.title = null;
            starsTransaction3.description = null;
            starsTransaction3.photo = null;
            TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer3 = new TL_stars.TL_starsTransactionPeer();
            starsTransaction3.peer = tL_starsTransactionPeer3;
            tL_starsTransactionPeer3.peer = peer5;
            starsTransaction3.date = i3;
            TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
            starsTransaction3.amount = tL_starsTonAmount;
            tL_starsTonAmount.amount = tL_messageActionGiftTon.cryptoAmount;
            starsTransaction3.id = tL_messageActionGiftTon.transaction_id;
            starsTransaction3.gift = true;
            starsTransaction3.sent_by = peer5;
            starsTransaction3.received_by = peer6;
            jva.k1(context3, false, 0L, this.I, starsTransaction3, wjbVar3);
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            if (((TLRPC.TL_messageActionStarGift) messageAction).forceIn) {
                return;
            }
            vqa vqaVar = new vqa(getContext(), this.I, k27.B0(this.Q0.k), this.h1, null);
            vqaVar.l2(this.Q0, null);
            vqaVar.show();
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
            if (!((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift.burned) {
                vqa vqaVar2 = new vqa(getContext(), this.I, k27.B0(this.Q0.k), this.h1, null);
                vqaVar2.l2(this.Q0, null);
                vqaVar2.show();
                return;
            } else {
                d S = LaunchActivity.S();
                if (S != null) {
                    ir2.v(null, 2131743641, u21.b0(S), org.telegram.messenger.beta.R.raw.fire_on, 36);
                    return;
                }
                return;
            }
        }
        if (messageAction instanceof TLRPC.TL_messageActionSetChatTheme) {
            TLRPC.ChatTheme chatTheme = ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme;
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    vqa vqaVar3 = new vqa(getContext(), this.I, 0L, this.h1, null);
                    vqaVar3.m2(starGift.slug, (TL_stars.TL_starGiftUnique) starGift, null);
                    vqaVar3.show();
                }
            }
        }
    }

    public ImageReceiver getAvatarImage() {
        return null;
    }

    @Override // hf0
    public int getBoundsLeft() {
        if (U()) {
            int width = ((int) (getWidth() - (this.I0.T.f + gl.L(8.0f)))) / 2;
            return this.I0.p ? width : Math.min(this.b1, width);
        }
        if (X(this.Q0)) {
            return ug8.g(getWidth(), this.j1, 2, this.k0 / 2);
        }
        int i = this.b1;
        ImageReceiver imageReceiver = this.J;
        if (imageReceiver != null && imageReceiver.R0) {
            i = Math.min((int) imageReceiver.L0, i);
        }
        return (this.k0 / 2) + i;
    }

    @Override // hf0
    public int getBoundsRight() {
        if (U()) {
            int L = ((int) ((this.I0.T.f + gl.L(8.0f)) + getWidth())) / 2;
            return this.I0.p ? L : Math.max(this.c1, L);
        }
        if (X(this.Q0)) {
            return ((getWidth() + this.j1) / 2) + (this.k0 / 2);
        }
        int i = this.c1;
        ImageReceiver imageReceiver = this.J;
        if (imageReceiver != null && imageReceiver.R0) {
            i = Math.max((int) imageReceiver.w(), i);
        }
        return (this.k0 / 2) + i;
    }

    @Override // ni5
    public float getCheckBoxTranslation() {
        return 0.0f;
    }

    public c27 getCurrentPosition() {
        return null;
    }

    public int getCustomDate() {
        return this.R0;
    }

    public rk1 getDelegate() {
        return this.g1;
    }

    @Override // ni5
    public float getDeltaBottom() {
        return 0.0f;
    }

    public float getDeltaLeft() {
        return 0.0f;
    }

    public float getDeltaRight() {
        return 0.0f;
    }

    public float getDeltaTop() {
        return 0.0f;
    }

    public int getLayoutHeight() {
        return getMeasuredHeight();
    }

    @Override // ni5
    public k27 getMessageObject() {
        return this.Q0;
    }

    @Override // sp3
    public int getObserverTag() {
        return this.x;
    }

    public ImageReceiver getPhotoImage() {
        return this.J;
    }

    public i19 getReactionsLayout() {
        return this.F0;
    }

    @Override // ni5
    public float getSlidingOffsetX() {
        return 0.0f;
    }

    public tk1 getTransitionParams() {
        return this.x2;
    }

    public float getWalletSlidingOffset() {
        return this.N0;
    }

    public final boolean h0(float f, float f2, vm1 vm1Var) {
        if (V() && !this.Q0.O3() && !this.Q0.k.premiumEffectWasPlayed) {
            float y = getY() + getPaddingTop() + getWalletActionTop();
            if (y >= f && y + gl.L(140.0f) <= f2) {
                nkc nkcVar = this.J0;
                oy8 oy8Var = nkcVar.l;
                if (nkcVar.i0 && nkcVar.j0 == null) {
                    nkcVar.i0 = false;
                    nkcVar.k0 = vm1Var;
                    nkcVar.K.e(true, 0.0f);
                    nkcVar.M = false;
                    nkcVar.N = 0L;
                    nkcVar.b();
                    nkcVar.g();
                    nkcVar.t = 18.0f;
                    nkcVar.u.z();
                    oy8Var.O(true, 0.0f);
                    oy8Var.start();
                    nkcVar.H = true;
                    float f3 = nkcVar.R;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    nkcVar.j0 = ofFloat;
                    ofFloat.setDuration(2400L);
                    nkcVar.j0.setInterpolator(s33.h);
                    nkcVar.j0.addUpdateListener(new rm1(nkcVar, f3, (byte) 7));
                    nkcVar.j0.addListener(new iab(nkcVar, (byte) 25));
                    nkcVar.j0.start();
                    nkcVar.a.invalidate();
                    this.Q0.k.premiumEffectWasPlayed = true;
                    ad7.Y(this.I).U1(k27.B0(this.Q0.k), this.Q0.k);
                    return true;
                }
            }
        }
        return false;
    }

    public final void i0(int i, boolean z, boolean z2) {
        int i2 = this.R0;
        if (i2 == i || i2 / 3600 == i / 3600) {
            return;
        }
        String M0 = z ? i == 2147483646 ? k96.M0(2131748300, "MessageScheduledUntilOnline") : k96.a0("MessageScheduledOn", null, 2131748336, k96.u(i, false)) : k96.u(i, false);
        this.R0 = i;
        CharSequence charSequence = this.S0;
        if (charSequence == null || !TextUtils.equals(M0, charSequence)) {
            this.S0 = M0;
            this.s2 = null;
            m0(z2);
        }
    }

    @Override // hf0, android.view.View, mib
    public final void invalidate() {
        super.invalidate();
        View view = this.w;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.u2;
        if (runnable != null) {
            runnable.run();
        }
        if (!this.t2 || getParent() == null) {
            return;
        }
        View view2 = (View) getParent();
        if (view2.getParent() != null) {
            view2.invalidate();
            ((View) view2.getParent()).invalidate();
        }
    }

    @Override // ni5
    public final boolean j() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0b37  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0b9b  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0ba4  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0b8a  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0a09  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0ab3  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0b23  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0900  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0943 A[EDGE_INSN: B:486:0x0943->B:482:0x0943 BREAK  A[LOOP:6: B:457:0x08f8->B:484:0x0940], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v104 */
    /* JADX WARN: Type inference failed for: r4v105 */
    /* JADX WARN: Type inference failed for: r4v6, types: [org.telegram.tgnet.TLRPC$messages_StickerSet] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j0(k27 k27Var, boolean z) {
        StaticLayout staticLayout;
        TLRPC.TL_messageReactions tL_messageReactions;
        int i;
        wjb wjbVar;
        ImageReceiver imageReceiver;
        int i2;
        wjb wjbVar2;
        String str;
        k27 k27Var2;
        String str2;
        TLRPC.Document document;
        String str3;
        TLRPC.Document document2;
        String str4;
        ArrayList<TLRPC.TL_stickerPack> arrayList;
        k27 k27Var3;
        int i3;
        TLRPC.Document document3;
        TLRPC.Document document4;
        TLRPC.Document document5;
        dd ddVar;
        int i4;
        int i5;
        boolean z2;
        int i6;
        ImageReceiver imageReceiver2;
        TLRPC.PhotoSize photoSize;
        ImageReceiver imageReceiver3;
        TLRPC.VideoSize videoSize;
        TLRPC.PhotoSize photoSize2;
        boolean z3;
        float f;
        RadialProgress2 radialProgress2;
        ImageReceiver imageReceiver4;
        TLRPC.WallPaper wallPaper;
        TLRPC.MessageAction messageAction;
        wjb wjbVar3;
        ImageReceiver imageReceiver5;
        aub aubVar;
        int i7;
        int paddingTop;
        int i8;
        TLRPC.Message message;
        String l;
        String str5;
        ActivityManager activityManager;
        k27 k27Var4 = k27Var;
        if (k27Var4 != null) {
            if (this.Q0 != k27Var4 && this.N0 != 0.0f) {
                setWalletSlidingOffset(0.0f);
            }
            k27 k27Var5 = this.Q0;
            if (k27Var5 != k27Var4) {
                this.r = null;
            }
            TLRPC.Message message2 = k27Var4.k;
            if ((message2 == null || !(message2.action instanceof TLRPC.TL_messageActionGramTransfer) || this.b2 == message2.send_state) && k27Var5 == k27Var4 && (((staticLayout = this.N) == null || TextUtils.equals(staticLayout.getText(), k27Var4.v)) && !((!this.E0 && k27Var4.C != null) || z || k27Var4.D == 21 || k27Var4.M1))) {
                return;
            }
            boolean z4 = w01.a;
            ArrayList arrayList2 = this.Y1;
            arrayList2.clear();
            this.Z1 = null;
            this.c2 = null;
            this.s2 = null;
            k27 k27Var6 = this.Q0;
            boolean z5 = k27Var6 == null || k27Var6.m1 != k27Var4.m1;
            if (k27Var6 != null) {
                k27Var4.o1 = k27Var6.o1;
            }
            if (!z5 && k27Var6 != null && V()) {
                k27Var4.k.premiumEffectWasPlayed |= this.Q0.k.premiumEffectWasPlayed;
            }
            this.Q0 = k27Var4;
            boolean V = V();
            byte b = 3;
            wjb wjbVar4 = this.h1;
            if (V && this.J0 == null) {
                nkc nkcVar = new nkc(this, wjbVar4);
                this.J0 = nkcVar;
                nkcVar.s0 = new nk1(this, b);
                nkcVar.n(this.K0);
            }
            nkc nkcVar2 = this.J0;
            if (nkcVar2 != null) {
                boolean V2 = V();
                uk1 uk1Var = nkcVar2.a;
                nkcVar2.n = V2;
                if (V2 && nkcVar2.m == null && !nkcVar2.o && ug8.A(uk1Var) && gba.o() != 0 && (activityManager = (ActivityManager) uk1Var.getContext().getSystemService("activity")) != null && activityManager.getDeviceConfigurationInfo().reqGlEsVersion >= 196608) {
                    mkc mkcVar = new mkc(nkcVar2, uk1Var.getContext(), new jkc(nkcVar2, (byte) 1));
                    nkcVar2.m = mkcVar;
                    uk1Var.addView(mkcVar, new ViewGroup.LayoutParams(gl.L(42.0f), gl.L(42.0f)));
                }
                mkc mkcVar2 = nkcVar2.m;
                if (mkcVar2 != null) {
                    mkcVar2.setVisibility((!V2 || nkcVar2.o) ? 8 : 0);
                    nkcVar2.m.setPaused(!V2 || nkcVar2.o);
                }
                if (!V2) {
                    nkcVar2.f();
                    nkcVar2.k();
                }
            }
            TLRPC.Message message3 = k27Var4.k;
            int i9 = this.I;
            if (message3 != null && (message3.action instanceof TLRPC.TL_messageActionGramTransfer)) {
                na7 q1 = na7.q1(i9);
                long n = cf3.n(k27Var4.k.peer_id);
                if (l7c.C(n)) {
                    l = k96.M0(2131742708, null);
                } else if (k27Var4.k.peer_id == null) {
                    str5 = null;
                    nkc nkcVar3 = this.J0;
                    boolean O3 = k27Var4.O3();
                    TLRPC.Message message4 = k27Var4.k;
                    nkcVar3.m(O3, (TLRPC.TL_messageActionGramTransfer) message4.action, str5, message4.send_state, z5, !message4.premiumEffectWasPlayed);
                    this.b2 = k27Var4.k.send_state;
                } else {
                    l = cf3.l(q1.Z1(n));
                }
                str5 = l;
                nkc nkcVar32 = this.J0;
                boolean O32 = k27Var4.O3();
                TLRPC.Message message42 = k27Var4.k;
                nkcVar32.m(O32, (TLRPC.TL_messageActionGramTransfer) message42.action, str5, message42.send_state, z5, !message42.premiumEffectWasPlayed);
                this.b2 = k27Var4.k.send_state;
            }
            k27Var4.M1 = false;
            this.E0 = k27Var4.C != null;
            up3.q(i9).v(this);
            this.W = 0;
            this.H = false;
            sk1 sk1Var = this.t1;
            if (sk1Var != null && z5) {
                gm.release(sk1Var.i, sk1Var.h);
                this.t1 = null;
                this.o1 = false;
            }
            if (z5 || k27Var4.H) {
                k27Var4.H = false;
                TLRPC.Message message5 = k27Var4.k;
                boolean z6 = (message5 == null || (tL_messageReactions = message5.reactions) == null || !tL_messageReactions.reactions_as_tags) ? false : true;
                boolean N5 = k27Var4.N5();
                i19 i19Var = this.F0;
                if (N5) {
                    i19Var.r(k27Var4, z6, wjbVar4);
                } else {
                    i19Var.r(null, false, wjbVar4);
                }
            }
            int i10 = k27Var4.D;
            xab xabVar = this.P0;
            if (i10 == 32) {
                if (xabVar == null) {
                    xab xabVar2 = new xab(i9, this, wjbVar4);
                    this.P0 = xabVar2;
                    if (this.j2) {
                        xabVar2.d.M(xabVar2.b);
                    }
                }
                this.P0.c(k27Var4);
            } else if (xabVar != null) {
                xabVar.d.M(null);
                this.P0 = null;
            }
            if (this.I0 == null && (message = k27Var4.k) != null && (message.action instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                xqa xqaVar = new xqa(i9, wjbVar4, this);
                this.I0 = xqaVar;
                if (this.j2) {
                    xqaVar.a();
                }
            }
            xqa xqaVar2 = this.I0;
            if (xqaVar2 != null) {
                xqaVar2.f(k27Var4, !z5);
            }
            ImageReceiver imageReceiver6 = this.J;
            imageReceiver6.N(0);
            imageReceiver6.e();
            if (k27Var4.D != 22) {
                this.K = null;
            }
            if (k27Var4.J0 != -1) {
                ote.b(this, 0.02f, 1.2f);
                this.l2 = Math.max(gl.L(250.0f), je5.a(k27Var4.v, (TextPaint) R("paintChatActionText")));
                uo8 O0 = nf1.O0(k27Var4.v);
                if (O0 != null) {
                    O0.g = this;
                }
            } else {
                setStateListAnimator(null);
                this.l2 = 0;
            }
            boolean y4 = k27Var4.y4();
            pb0 pb0Var = this.M;
            if (y4) {
                TLRPC.User V1 = na7.q1(i9).V1(Long.valueOf(k27Var4.k.media.user_id));
                pb0Var.q(V1);
                TL_stories.StoryItem storyItem = k27Var4.k.media.storyItem;
                if (storyItem == null || !storyItem.noforwards) {
                    x2b.x(imageReceiver6, storyItem);
                } else {
                    imageReceiver6.V(V1, pb0Var, null, true, 0, true);
                }
                imageReceiver6.q0((int) (this.i1 / 2.0f));
                wjbVar2 = wjbVar4;
            } else {
                int i11 = k27Var4.D;
                RadialProgress2 radialProgress22 = this.K1;
                if (i11 == 22) {
                    if (k27Var4.I1 == null) {
                        int size = k27Var4.p0.size();
                        for (int i12 = 0; i12 < size && !(((TLRPC.PhotoSize) k27Var4.p0.get(i12)) instanceof TLRPC.TL_photoStrippedSize); i12++) {
                        }
                    }
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = k27Var4.L1;
                    if (tL_channelAdminLogEvent != null) {
                        TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                        if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeWallpaper) {
                            wallPaper = ((TLRPC.TL_channelAdminLogEventActionChangeWallpaper) channelAdminLogEventAction).new_value;
                            if (TextUtils.isEmpty(je2.h(wallPaper))) {
                                boolean a = wjbVar4 != null ? wjbVar4.a() : bkb.I.o();
                                imageReceiver6.f();
                                String h = je2.h(wallPaper);
                                int i13 = zi8.C0;
                                jy3 g = je2.e(i9).g(elb.d(h));
                                Drawable r0 = g == null ? bkb.r0() : zi8.f(i9, g, a);
                                this.K = r0;
                                if (r0 != null) {
                                    r0.setCallback(this);
                                }
                                wjbVar3 = wjbVar4;
                                imageReceiver5 = imageReceiver6;
                            } else if (wallPaper != null) {
                                String str6 = wallPaper.uploadingImage;
                                if (str6 != null) {
                                    imageReceiver6.Z(gl5.g(str6), "150_150_wallpaper" + wallPaper.id + p72.e(wallPaper.settings), null, null, p72.b(wallPaper), 0L, null, wallPaper, 1);
                                    this.K = null;
                                    imageReceiver5 = imageReceiver6;
                                    wjbVar3 = wjbVar4;
                                } else {
                                    TLRPC.WallPaper wallPaper2 = wallPaper;
                                    TLObject tLObject = k27Var4.n0;
                                    gl5 b2 = gl5.b(tLObject instanceof TLRPC.Document ? (TLRPC.Document) tLObject : wallPaper2.document);
                                    StringBuilder sb = new StringBuilder("150_150_wallpaper");
                                    wjbVar3 = wjbVar4;
                                    sb.append(wallPaper2.id);
                                    sb.append(p72.e(wallPaper2.settings));
                                    imageReceiver6.Z(b2, sb.toString(), null, null, p72.b(wallPaper2), 0L, null, wallPaper2, 1);
                                    imageReceiver5 = imageReceiver6;
                                    this.K = null;
                                }
                            } else {
                                wjbVar3 = wjbVar4;
                                imageReceiver5 = imageReceiver6;
                                this.K = null;
                            }
                            imageReceiver5.q0((int) (this.i1 / 2.0f));
                            if (S(k27Var) != 1.0f) {
                                boolean z7 = !z5;
                                radialProgress22.o(z7, 1.0f);
                                radialProgress22.setIcon(4, z7, z7);
                            } else {
                                boolean z8 = !z5;
                                radialProgress22.setIcon(3, z8, z8);
                            }
                            wjbVar2 = wjbVar3;
                        }
                    }
                    TLRPC.Message message6 = k27Var4.k;
                    wallPaper = (message6 == null || (messageAction = message6.action) == null) ? null : messageAction.wallpaper;
                    if (TextUtils.isEmpty(je2.h(wallPaper))) {
                    }
                    imageReceiver5.q0((int) (this.i1 / 2.0f));
                    if (S(k27Var) != 1.0f) {
                    }
                    wjbVar2 = wjbVar3;
                } else {
                    if (i11 == 21) {
                        imageReceiver6.q0((int) (this.i1 / 2.0f));
                        imageReceiver6.v0 = true;
                        imageReceiver6.h1 = null;
                        TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) k27Var4.k.action;
                        TLRPC.VideoSize x = ba4.x(1000, tL_messageActionSuggestProfilePhoto.photo.video_sizes);
                        ArrayList<TLRPC.VideoSize> arrayList3 = tL_messageActionSuggestProfilePhoto.photo.video_sizes;
                        gl5 j = (arrayList3 == null || arrayList3.isEmpty()) ? null : gl5.j(x, tL_messageActionSuggestProfilePhoto.photo);
                        TLRPC.Photo photo = k27Var4.k.action.photo;
                        if (k27Var4.I1 == null) {
                            int size2 = k27Var4.p0.size();
                            for (int i14 = 0; i14 < size2; i14++) {
                                photoSize2 = (TLRPC.PhotoSize) k27Var4.p0.get(i14);
                                if (photoSize2 instanceof TLRPC.TL_photoStrippedSize) {
                                    break;
                                }
                            }
                        }
                        photoSize2 = null;
                        TLRPC.PhotoSize w = ba4.w(k27Var4.p0, 1000, false, null, false);
                        if (w == null) {
                            i = i9;
                            z3 = false;
                            wjbVar = wjbVar4;
                            f = 1.0f;
                            radialProgress2 = radialProgress22;
                            imageReceiver4 = imageReceiver6;
                        } else if (x != null) {
                            i = i9;
                            wjbVar = wjbVar4;
                            f = 1.0f;
                            radialProgress2 = radialProgress22;
                            z3 = false;
                            imageReceiver6.Y(j, "g", gl5.i(w, photo), "150_150", gl5.f(photoSize2, k27Var4.n0), "50_50_b", k27Var4.I1, 0L, null, k27Var, 0);
                            imageReceiver4 = imageReceiver6;
                            k27Var4 = k27Var;
                        } else {
                            i = i9;
                            z3 = false;
                            wjbVar = wjbVar4;
                            f = 1.0f;
                            radialProgress2 = radialProgress22;
                            imageReceiver6.Z(gl5.i(w, photo), "150_150", gl5.f(photoSize2, k27Var4.n0), "50_50_b", k27Var4.I1, 0L, null, k27Var4, 0);
                            imageReceiver4 = imageReceiver6;
                        }
                        imageReceiver4.v0 = z3;
                        wl5 wl5Var = (wl5) na7.q1(i).m4.get(k27Var4.k.local_id);
                        if (wl5Var == null || wl5Var.X == f) {
                            boolean z9 = !z5;
                            radialProgress2.o(z9, f);
                            radialProgress2.setIcon(4, z9, z9);
                        } else {
                            boolean z10 = !z5;
                            radialProgress2.setIcon(3, z10, z10);
                        }
                    } else {
                        i = i9;
                        wjbVar = wjbVar4;
                        int i15 = 0;
                        byte b3 = 2;
                        if (i11 == 31 || i11 == 33 || i11 == 30 || i11 == 18 || i11 == 25 || i11 == 35) {
                            imageReceiver6.q0(0);
                            TLRPC.MessageAction messageAction2 = k27Var4.k.action;
                            if (messageAction2 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                                TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) messageAction2;
                                long g2 = na7.q1(i).k4.H.g(TimeUnit.SECONDS);
                                if (tL_messageActionNoForwardsRequest.expired) {
                                    imageReceiver = imageReceiver6;
                                } else {
                                    imageReceiver = imageReceiver6;
                                    if (k27Var4.k.date + g2 >= ConnectionsManager.getInstance(i).getCurrentTime()) {
                                        z2 = false;
                                        this.a2 = z2;
                                        if (!k27Var4.N3() || tL_messageActionNoForwardsRequest.expired || this.a2) {
                                            i6 = 8;
                                        } else {
                                            ArrayList arrayList4 = new ArrayList();
                                            i6 = 8;
                                            arrayList4.add(new gq0[]{new iq0(7, 2131751402, org.telegram.messenger.beta.R.drawable.filled_bot_decline_24), new iq0(8, 2131751403, org.telegram.messenger.beta.R.drawable.filled_bot_approve_24)});
                                            this.Z1 = new dd((gq0[][]) arrayList4.toArray(new gq0[arrayList4.size()][]), i15, b3);
                                        }
                                        i2 = i6;
                                        i9 = i;
                                        wjbVar2 = wjbVar;
                                        document = null;
                                    }
                                }
                                z2 = true;
                                this.a2 = z2;
                                if (k27Var4.N3()) {
                                }
                                i6 = 8;
                                i2 = i6;
                                i9 = i;
                                wjbVar2 = wjbVar;
                                document = null;
                            } else {
                                imageReceiver = imageReceiver6;
                                if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer) {
                                    TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) messageAction2;
                                    TL_stars.StarGift starGift = tL_messageActionStarGiftPurchaseOffer.gift;
                                    if (starGift != null) {
                                        document5 = apb.e(starGift);
                                        i2 = 8;
                                        kv4 kv4Var = this.T0;
                                        if (kv4Var == null) {
                                            wjbVar2 = wjbVar;
                                            kv4Var = new kv4(this, wjbVar2, false);
                                            this.T0 = kv4Var;
                                        } else {
                                            wjbVar2 = wjbVar;
                                        }
                                        kv4Var.d((TL_stars.starGiftAttributeBackdrop) gta.i(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                        this.T0.e((TL_stars.starGiftAttributePattern) gta.i(starGift.attributes, TL_stars.starGiftAttributePattern.class));
                                    } else {
                                        i2 = 8;
                                        wjbVar2 = wjbVar;
                                        document5 = null;
                                    }
                                    this.a2 = tL_messageActionStarGiftPurchaseOffer.expires_at < ConnectionsManager.getInstance(i).getCurrentTime();
                                    if (!k27Var4.N3() && !tL_messageActionStarGiftPurchaseOffer.accepted && !tL_messageActionStarGiftPurchaseOffer.declined && !this.a2) {
                                        ArrayList arrayList5 = new ArrayList();
                                        arrayList5.add(new gq0[]{new iq0(5, 2131749714, org.telegram.messenger.beta.R.drawable.filled_bot_decline_24), new iq0(6, 2131749724, org.telegram.messenger.beta.R.drawable.filled_bot_approve_24)});
                                        this.Z1 = new dd((gq0[][]) arrayList5.toArray(new gq0[arrayList5.size()][]), i15, b3);
                                    }
                                    document = document5;
                                    i9 = i;
                                } else {
                                    i2 = 8;
                                    wjbVar2 = wjbVar;
                                    if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftOnchainOffer) {
                                        TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = (TLRPC.TL_messageActionStarGiftOnchainOffer) messageAction2;
                                        TL_stars.StarGift starGift2 = tL_messageActionStarGiftOnchainOffer.gift;
                                        if (starGift2 != null) {
                                            document4 = apb.e(starGift2);
                                            kv4 kv4Var2 = this.T0;
                                            if (kv4Var2 == null) {
                                                kv4Var2 = new kv4(this, wjbVar2, false);
                                                this.T0 = kv4Var2;
                                            }
                                            kv4Var2.d((TL_stars.starGiftAttributeBackdrop) gta.i(starGift2.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                            this.T0.e((TL_stars.starGiftAttributePattern) gta.i(starGift2.attributes, TL_stars.starGiftAttributePattern.class));
                                        } else {
                                            document4 = null;
                                        }
                                        this.c2 = tL_messageActionStarGiftOnchainOffer;
                                        i9 = i;
                                        boolean i16 = vp7.i(i9, tL_messageActionStarGiftOnchainOffer);
                                        this.d2 = i16;
                                        this.e2 = -1;
                                        this.a2 = !i16;
                                        if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                                            qv4 qv4Var = this.g2;
                                            if (qv4Var == null) {
                                                qv4Var = new qv4(this, 0.85f);
                                                this.g2 = qv4Var;
                                            }
                                            if (!tL_messageActionStarGiftOnchainOffer.buyer && (tL_messageActionStarGiftOnchainOffer.accepted || tL_messageActionStarGiftOnchainOffer.settled)) {
                                                qv4Var.f(-698031);
                                                this.g2.g(10, k96.M0(2131749577, null), false);
                                            } else {
                                                qv4Var.e((TL_stars.starGiftAttributeBackdrop) gta.i(starGift2.attributes, TL_stars.starGiftAttributeBackdrop.class), false, false);
                                                this.g2.g(9, "#".concat(k96.E(((TL_stars.TL_starGiftUnique) starGift2).num, ',')), true);
                                            }
                                        }
                                    } else {
                                        i9 = i;
                                        if (!(messageAction2 instanceof TLRPC.TL_messageActionSetChatTheme)) {
                                            if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                                                TL_stars.StarGift starGift3 = ((TLRPC.TL_messageActionStarGift) messageAction2).gift;
                                                if (starGift3 != null) {
                                                    document = starGift3.sticker;
                                                    k27Var3 = k27Var4;
                                                    str2 = null;
                                                    k27Var2 = null;
                                                    ddVar = this.Z1;
                                                    if (ddVar != null) {
                                                        int length = ((gq0[][]) ddVar.c).length;
                                                        int i17 = 0;
                                                        while (i17 < length) {
                                                            int length2 = ((gq0[][]) this.Z1.c)[i17].length;
                                                            int i18 = 0;
                                                            while (i18 < length2) {
                                                                gq0 gq0Var = ((gq0[][]) this.Z1.c)[i17][i18];
                                                                int i19 = length;
                                                                wo0 wo0Var = new wo0(new nk1(this, (byte) 4));
                                                                wo0Var.j = (iq0) gq0Var;
                                                                int c = gq0Var.c();
                                                                if (c != 0) {
                                                                    Drawable drawable = getResources().getDrawable(c);
                                                                    wo0Var.t = drawable;
                                                                    i4 = i17;
                                                                    i5 = length2;
                                                                    drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                                                                } else {
                                                                    i4 = i17;
                                                                    i5 = length2;
                                                                }
                                                                wo0Var.f = gl.L(40.0f);
                                                                int i20 = wo0Var.g | 8;
                                                                wo0Var.g = i20;
                                                                int b4 = fod.b(i20, 1, i18 == 0);
                                                                wo0Var.g = b4;
                                                                wo0Var.g = fod.b(b4, 2, i18 == 1);
                                                                wo0Var.h = new tgb(gq0Var.d(), (TextPaint) R("paintChatBotButton"));
                                                                arrayList2.add(wo0Var);
                                                                i18++;
                                                                length = i19;
                                                                i17 = i4;
                                                                length2 = i5;
                                                            }
                                                            i17++;
                                                        }
                                                    }
                                                    this.M1 = k27Var4.n1;
                                                    this.I1 = document;
                                                    if (document == null) {
                                                        ImageReceiver imageReceiver7 = imageReceiver;
                                                        imageReceiver7.v0 = true;
                                                        int i21 = k27Var4.D;
                                                        if (i21 != 31 && i21 != 37 && i21 != 33) {
                                                            imageReceiver7.h1 = this.O1;
                                                        }
                                                        this.J1 = null;
                                                        int i22 = 0;
                                                        while (true) {
                                                            if (i22 >= document.video_thumbs.size()) {
                                                                break;
                                                            }
                                                            if ("f".equals(document.video_thumbs.get(i22).type)) {
                                                                this.J1 = document.video_thumbs.get(i22);
                                                                break;
                                                            }
                                                            i22++;
                                                        }
                                                        if (z5 || k27Var4.D != 18) {
                                                            kcb f2 = uo3.f(document, bkb.Z6, 0.3f, null);
                                                            imageReceiver7.M(0);
                                                            gl5 b5 = gl5.b(document);
                                                            Locale locale = Locale.US;
                                                            imageReceiver7.d0(b5, de9.k(k27Var4.m1, "160_160_nr_messageId="), f2, "tgs", k27Var3, 1);
                                                        }
                                                    } else if (str2 != null) {
                                                        hq6.d0(i9).d1(str2, false, k27Var2 == null);
                                                    }
                                                }
                                                document = null;
                                                k27Var3 = k27Var4;
                                                str2 = null;
                                                k27Var2 = null;
                                                ddVar = this.Z1;
                                                if (ddVar != null) {
                                                }
                                                this.M1 = k27Var4.n1;
                                                this.I1 = document;
                                                if (document == null) {
                                                }
                                            } else {
                                                if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction2;
                                                    if (tL_messageActionStarGiftUnique.refunded) {
                                                        TL_stars.StarGift starGift4 = tL_messageActionStarGiftUnique.gift;
                                                        if (starGift4 != null) {
                                                            document = starGift4.getDocument();
                                                            k27Var3 = k27Var4;
                                                            str2 = null;
                                                            k27Var2 = null;
                                                            ddVar = this.Z1;
                                                            if (ddVar != null) {
                                                            }
                                                            this.M1 = k27Var4.n1;
                                                            this.I1 = document;
                                                            if (document == null) {
                                                            }
                                                        }
                                                        document = null;
                                                        k27Var3 = k27Var4;
                                                        str2 = null;
                                                        k27Var2 = null;
                                                        ddVar = this.Z1;
                                                        if (ddVar != null) {
                                                        }
                                                        this.M1 = k27Var4.n1;
                                                        this.I1 = document;
                                                        if (document == null) {
                                                        }
                                                    }
                                                }
                                                if (messageAction2 instanceof TLRPC.TL_messageActionGiftTon) {
                                                    str = y6c.h(i9).d0;
                                                    if (str == null) {
                                                        hq6.d0(i9).E();
                                                        return;
                                                    }
                                                } else {
                                                    str = y6c.h(i9).c0;
                                                    if (str == null) {
                                                        hq6.d0(i9).B();
                                                        return;
                                                    }
                                                }
                                                TLRPC.TL_messages_stickerSet q0 = hq6.d0(i9).q0(str);
                                                ?? r4 = q0;
                                                if (q0 == null) {
                                                    r4 = hq6.d0(i9).o0(str);
                                                }
                                                if (r4 != 0) {
                                                    TLRPC.MessageAction messageAction3 = k27Var4.k.action;
                                                    int i23 = messageAction3.months;
                                                    if (k27Var4.D == 30) {
                                                        String str7 = "3⃣";
                                                        if (messageAction3 instanceof TLRPC.TL_messageActionGiftTon) {
                                                            long j2 = messageAction3.cryptoAmount;
                                                            if (j2 > 10000000000L) {
                                                                if (j2 <= 50000000000L) {
                                                                    str7 = "1⃣";
                                                                }
                                                                i3 = 0;
                                                                while (true) {
                                                                    if (i3 < r4.packs.size()) {
                                                                        break;
                                                                    }
                                                                    TLRPC.TL_stickerPack tL_stickerPack = r4.packs.get(i3);
                                                                    if (TextUtils.equals(tL_stickerPack.emoticon, str7) && !tL_stickerPack.documents.isEmpty()) {
                                                                        long longValue = tL_stickerPack.documents.get(0).longValue();
                                                                        for (int i24 = 0; i24 < r4.documents.size(); i24++) {
                                                                            document3 = r4.documents.get(i24);
                                                                            if (document3 != null && document3.id == longValue) {
                                                                                break;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        i3++;
                                                                    }
                                                                }
                                                                document3 = null;
                                                                str3 = str;
                                                                document2 = document3;
                                                            }
                                                            str7 = "2⃣";
                                                            i3 = 0;
                                                            while (true) {
                                                                if (i3 < r4.packs.size()) {
                                                                }
                                                                i3++;
                                                            }
                                                            document3 = null;
                                                            str3 = str;
                                                            document2 = document3;
                                                        } else {
                                                            long j3 = messageAction3 instanceof TLRPC.TL_messageActionGiftStars ? ((TLRPC.TL_messageActionGiftStars) messageAction3).stars : ((TLRPC.TL_messageActionPrizeStars) messageAction3).stars;
                                                            if (j3 > 1000) {
                                                                if (j3 >= 2500) {
                                                                    str7 = "4⃣";
                                                                }
                                                                i3 = 0;
                                                                while (true) {
                                                                    if (i3 < r4.packs.size()) {
                                                                    }
                                                                    i3++;
                                                                }
                                                                document3 = null;
                                                                str3 = str;
                                                                document2 = document3;
                                                            }
                                                            str7 = "2⃣";
                                                            i3 = 0;
                                                            while (true) {
                                                                if (i3 < r4.packs.size()) {
                                                                }
                                                                i3++;
                                                            }
                                                            document3 = null;
                                                            str3 = str;
                                                            document2 = document3;
                                                        }
                                                        ddVar = this.Z1;
                                                        if (ddVar != null) {
                                                        }
                                                        this.M1 = k27Var4.n1;
                                                        this.I1 = document;
                                                        if (document == null) {
                                                        }
                                                    } else {
                                                        String str8 = (String) y2.get(Integer.valueOf(i23));
                                                        ArrayList<TLRPC.TL_stickerPack> arrayList6 = r4.packs;
                                                        int size3 = arrayList6.size();
                                                        int i25 = 0;
                                                        TLRPC.Document document6 = null;
                                                        while (true) {
                                                            if (i25 >= size3) {
                                                                str3 = str;
                                                                break;
                                                            }
                                                            TLRPC.TL_stickerPack tL_stickerPack2 = arrayList6.get(i25);
                                                            i25++;
                                                            TLRPC.TL_stickerPack tL_stickerPack3 = tL_stickerPack2;
                                                            if (Objects.equals(tL_stickerPack3.emoticon, str8)) {
                                                                ArrayList<Long> arrayList7 = tL_stickerPack3.documents;
                                                                int size4 = arrayList7.size();
                                                                TLRPC.Document document7 = document6;
                                                                int i26 = i15;
                                                                while (true) {
                                                                    if (i26 >= size4) {
                                                                        str3 = str;
                                                                        str4 = str8;
                                                                        arrayList = arrayList6;
                                                                        break;
                                                                    }
                                                                    Long l2 = arrayList7.get(i26);
                                                                    i26++;
                                                                    long longValue2 = l2.longValue();
                                                                    ArrayList<TLRPC.Document> arrayList8 = r4.documents;
                                                                    str3 = str;
                                                                    int size5 = arrayList8.size();
                                                                    ArrayList<Long> arrayList9 = arrayList7;
                                                                    int i27 = 0;
                                                                    while (true) {
                                                                        if (i27 >= size5) {
                                                                            str4 = str8;
                                                                            arrayList = arrayList6;
                                                                            break;
                                                                        }
                                                                        TLRPC.Document document8 = arrayList8.get(i27);
                                                                        i27++;
                                                                        int i28 = size5;
                                                                        TLRPC.Document document9 = document8;
                                                                        str4 = str8;
                                                                        arrayList = arrayList6;
                                                                        if (document9.id == longValue2) {
                                                                            document7 = document9;
                                                                            break;
                                                                        } else {
                                                                            str8 = str4;
                                                                            size5 = i28;
                                                                            arrayList6 = arrayList;
                                                                        }
                                                                    }
                                                                    if (document7 != null) {
                                                                        break;
                                                                    }
                                                                    str = str3;
                                                                    arrayList7 = arrayList9;
                                                                    str8 = str4;
                                                                    arrayList6 = arrayList;
                                                                }
                                                                document6 = document7;
                                                            } else {
                                                                str3 = str;
                                                                str4 = str8;
                                                                arrayList = arrayList6;
                                                            }
                                                            if (document6 != null) {
                                                                break;
                                                            }
                                                            str = str3;
                                                            str8 = str4;
                                                            arrayList6 = arrayList;
                                                            i15 = 0;
                                                        }
                                                        document2 = document6;
                                                    }
                                                    if (document2 == null && !r4.documents.isEmpty()) {
                                                        document2 = r4.documents.get(0);
                                                    }
                                                    k27Var3 = r4;
                                                    document = document2;
                                                    str2 = str3;
                                                    k27Var2 = k27Var3;
                                                    ddVar = this.Z1;
                                                    if (ddVar != null) {
                                                    }
                                                    this.M1 = k27Var4.n1;
                                                    this.I1 = document;
                                                    if (document == null) {
                                                    }
                                                } else {
                                                    k27Var2 = r4;
                                                    str2 = str;
                                                    document = null;
                                                    k27Var3 = null;
                                                    ddVar = this.Z1;
                                                    if (ddVar != null) {
                                                    }
                                                    this.M1 = k27Var4.n1;
                                                    this.I1 = document;
                                                    if (document == null) {
                                                    }
                                                }
                                            }
                                            if (!this.l0 && this.f0 && this.j0 && (this.g0 || this.h0 || this.i0)) {
                                                this.m0 = gl.L(33.0f);
                                                aub aubVar2 = this.o0;
                                                if (aubVar2 == null) {
                                                    aubVar2 = new aub(i9, this, wjbVar2, true);
                                                    this.o0 = aubVar2;
                                                    aubVar2.s = new nk1(this, (byte) 5);
                                                }
                                                if (aubVar2.e(this.Q0)) {
                                                    if (this.j2) {
                                                        this.o0.a();
                                                    }
                                                    i7 = 0;
                                                } else {
                                                    this.o0.b();
                                                    this.o0 = null;
                                                    i7 = 0;
                                                    this.m0 = 0;
                                                }
                                            } else {
                                                aubVar = this.o0;
                                                if (aubVar != null) {
                                                    aubVar.b();
                                                    this.o0 = null;
                                                }
                                                i7 = 0;
                                                this.m0 = 0;
                                            }
                                            paddingTop = getPaddingTop();
                                            i8 = this.m0;
                                            if (paddingTop != i8) {
                                                setPadding(i7, i8, i7, i7);
                                            }
                                            this.U1.setVisibility((X(k27Var) || U()) ? i2 : i7);
                                            mm4.b(k27Var4);
                                            requestLayout();
                                        }
                                        TL_stars.StarGift starGift5 = ((TLRPC.TL_chatThemeUniqueGift) ((TLRPC.TL_messageActionSetChatTheme) messageAction2).theme).gift;
                                        if (starGift5 != null) {
                                            document4 = apb.e(starGift5);
                                            kv4 kv4Var3 = this.T0;
                                            if (kv4Var3 == null) {
                                                kv4Var3 = new kv4(this, wjbVar2, false);
                                                this.T0 = kv4Var3;
                                            }
                                            kv4Var3.d((TL_stars.starGiftAttributeBackdrop) gta.i(starGift5.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                            this.T0.e((TL_stars.starGiftAttributePattern) gta.i(starGift5.attributes, TL_stars.starGiftAttributePattern.class));
                                        } else {
                                            document4 = null;
                                        }
                                    }
                                    document = document4;
                                }
                            }
                            str2 = null;
                            k27Var2 = null;
                            k27Var3 = null;
                            ddVar = this.Z1;
                            if (ddVar != null) {
                            }
                            this.M1 = k27Var4.n1;
                            this.I1 = document;
                            if (document == null) {
                            }
                            if (!this.l0) {
                            }
                            aubVar = this.o0;
                            if (aubVar != null) {
                            }
                            i7 = 0;
                            this.m0 = 0;
                            paddingTop = getPaddingTop();
                            i8 = this.m0;
                            if (paddingTop != i8) {
                            }
                            this.U1.setVisibility((X(k27Var) || U()) ? i2 : i7);
                            mm4.b(k27Var4);
                            requestLayout();
                        }
                        if (i11 == 37) {
                            TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(((TLRPC.TL_messageActionChangeCommunity) k27Var4.k.action).community_id));
                            imageReceiver6.v0 = true;
                            imageReceiver6.h1 = null;
                            imageReceiver6.q0(gl.L(14.0f));
                            imageReceiver6.N(1);
                            pb0Var.p(K0);
                            imageReceiver6.U(K0, new vd1(getContext(), gl.L(14.0f)), K0);
                        } else if (i11 == 11) {
                            imageReceiver6.v0 = true;
                            imageReceiver6.h1 = null;
                            imageReceiver6.q0(gl.u / 2);
                            imageReceiver6.N(1);
                            pb0Var.j(k27.B0(k27Var4.k), null, null, null);
                            if (k27Var4.k.action instanceof TLRPC.TL_messageActionUserUpdatedPhoto) {
                                imageReceiver2 = imageReceiver6;
                                imageReceiver2.d0(null, null, pb0Var, null, k27Var4, 0);
                            } else {
                                imageReceiver2 = imageReceiver6;
                                if (k27Var4.I1 == null) {
                                    int size6 = k27Var4.p0.size();
                                    for (int i29 = 0; i29 < size6; i29++) {
                                        photoSize = (TLRPC.PhotoSize) k27Var4.p0.get(i29);
                                        if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                            break;
                                        }
                                    }
                                }
                                photoSize = null;
                                TLRPC.PhotoSize w2 = ba4.w(k27Var4.p0, 640, false, null, false);
                                if (w2 != null) {
                                    TLRPC.Photo photo2 = k27Var4.k.action.photo;
                                    if (!photo2.video_sizes.isEmpty()) {
                                        boolean z11 = gba.a;
                                        if (e66.e(2048)) {
                                            videoSize = ba4.x(1000, photo2.video_sizes);
                                            if (!k27Var4.z0 && !up3.q(i).c(4, videoSize.size)) {
                                                this.y0 = gl5.j(videoSize, photo2);
                                                up3.q(i).a(ba4.r(null, videoSize), k27Var4, this);
                                            }
                                            if (videoSize == null) {
                                                imageReceiver2.Z(gl5.j(videoSize, photo2), "g", gl5.f(photoSize, k27Var4.n0), "50_50_b", k27Var4.I1, 0L, null, k27Var4, 1);
                                            } else {
                                                imageReceiver2.Z(gl5.f(w2, k27Var4.n0), "150_150", gl5.f(photoSize, k27Var4.n0), "50_50_b", k27Var4.I1, 0L, null, k27Var4, 1);
                                            }
                                        }
                                    }
                                    videoSize = null;
                                    if (videoSize == null) {
                                    }
                                } else {
                                    imageReceiver3 = imageReceiver2;
                                    imageReceiver3.g0(pb0Var);
                                    imageReceiver3.v0(!PhotoViewer.P0(k27Var4), false);
                                }
                            }
                            imageReceiver3 = imageReceiver2;
                            imageReceiver3.v0(!PhotoViewer.P0(k27Var4), false);
                        } else {
                            imageReceiver6.v0 = true;
                            imageReceiver6.h1 = null;
                            imageReceiver6.g0(null);
                        }
                    }
                    i9 = i;
                    wjbVar2 = wjbVar;
                }
            }
            i2 = 8;
            if (!this.l0) {
            }
            aubVar = this.o0;
            if (aubVar != null) {
            }
            i7 = 0;
            this.m0 = 0;
            paddingTop = getPaddingTop();
            i8 = this.m0;
            if (paddingTop != i8) {
            }
            this.U1.setVisibility((X(k27Var) || U()) ? i2 : i7);
            mm4.b(k27Var4);
            requestLayout();
        }
    }

    public final void k0(float f, int i) {
        this.x0 = true;
        this.w0 = i;
        this.u0 = f;
        this.v0 = 0.0f;
    }

    public final void l0() {
        final byte b = 1;
        final byte b2 = 0;
        if (this.c2 != null && this.d2 && this.Q0 != null) {
            boolean c0 = c0();
            boolean z = this.f2;
            if (c0 != z) {
                this.f2 = !z;
                final k27 k27Var = this.Q0;
                post(new Runnable(this) { // from class: qk1
                    public final /* synthetic */ uk1 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        k27 k27Var2 = k27Var;
                        uk1 uk1Var = this.b;
                        switch (b3) {
                            case 0:
                                if (uk1Var.Q0 == k27Var2) {
                                    uk1Var.j0(k27Var2, true);
                                    uk1Var.requestLayout();
                                    break;
                                }
                                break;
                            default:
                                if (uk1Var.Q0 == k27Var2) {
                                    uk1Var.j0(k27Var2, true);
                                    uk1Var.requestLayout();
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
        }
        TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = this.c2;
        if (tL_messageActionStarGiftOnchainOffer == null || !this.d2 || this.Q0 == null || this.t1 == null) {
            return;
        }
        HashMap hashMap = vp7.a;
        int i = tL_messageActionStarGiftOnchainOffer.expires_at;
        int i2 = this.I;
        int max = Math.max(0, i - ConnectionsManager.getInstance(i2).getCurrentTime());
        int i3 = this.e2;
        if (max <= 0) {
            if (i3 != 0) {
                this.e2 = 0;
                this.d2 = vp7.i(i2, this.c2);
                final k27 k27Var2 = this.Q0;
                post(new Runnable(this) { // from class: qk1
                    public final /* synthetic */ uk1 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b;
                        k27 k27Var22 = k27Var2;
                        uk1 uk1Var = this.b;
                        switch (b3) {
                            case 0:
                                if (uk1Var.Q0 == k27Var22) {
                                    uk1Var.j0(k27Var22, true);
                                    uk1Var.requestLayout();
                                    break;
                                }
                                break;
                            default:
                                if (uk1Var.Q0 == k27Var22) {
                                    uk1Var.j0(k27Var22, true);
                                    uk1Var.requestLayout();
                                    break;
                                }
                                break;
                        }
                    }
                });
                return;
            }
            return;
        }
        if (max != i3) {
            this.e2 = max;
            this.t1.a(this.t1.c, this.G1, d0(vp7.d(this.c2), this.c2));
        }
        postInvalidateDelayed(1016 - (System.currentTimeMillis() % 1000));
    }

    @Override // ni5
    public final boolean m() {
        return false;
    }

    public final void m0(boolean z) {
        if (getMeasuredWidth() != 0) {
            H(getMeasuredWidth(), this.S0);
            invalidate();
        }
        if (this.D0) {
            x();
        } else if (z) {
            gl.c3(new nk1(this, (byte) 0));
        } else {
            requestLayout();
        }
    }

    @Override // ni5
    public final boolean n() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        rk1 rk1Var;
        super.onAttachedToWindow();
        this.j2 = true;
        this.J.I();
        setStarsPaused(false);
        this.s0 = gm.update(0, this, (!this.s || (rk1Var = this.g1) == null || rk1Var.l()) ? false : true, this.s0, this.N);
        sk1 sk1Var = this.t1;
        if (sk1Var != null) {
            sk1Var.h = gm.update(0, (View) sk1Var.i, false, sk1Var.h, sk1Var.d);
        }
        int i = this.I;
        kk7.f(i).b(this, kk7.X2);
        kk7.f(i).b(this, kk7.Y2);
        kk7.f(i).b(this, kk7.G3);
        kk7.f(i).b(this, kk7.x0);
        kk7.f(i).b(this, kk7.c4);
        kk7.e().b(this, kk7.k4);
        kk7.e().b(this, kk7.K3);
        k27 k27Var = this.Q0;
        if (k27Var != null && k27Var.D == 21) {
            j0(k27Var, true);
        }
        xqa xqaVar = this.I0;
        if (xqaVar != null) {
            xqaVar.a();
        }
        i19 i19Var = this.F0;
        ArrayList arrayList = i19Var.s;
        i19Var.D = true;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((f19) arrayList.get(i2)).a();
        }
        aub aubVar = this.o0;
        if (aubVar != null) {
            aubVar.a();
        }
        xab xabVar = this.P0;
        if (xabVar != null) {
            xabVar.d.M(xabVar.b);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.j2 = false;
        int i = this.I;
        up3.q(i).v(this);
        this.J.K();
        setStarsPaused(true);
        this.D0 = false;
        gm.release(this, this.s0);
        sk1 sk1Var = this.t1;
        if (sk1Var != null) {
            gm.release(sk1Var.i, sk1Var.h);
        }
        kk7.f(i).n(this, kk7.X2);
        kk7.f(i).n(this, kk7.Y2);
        kk7.f(i).n(this, kk7.G3);
        kk7.f(i).n(this, kk7.x0);
        kk7.f(i).n(this, kk7.c4);
        kk7.e().n(this, kk7.k4);
        kk7.e().n(this, kk7.K3);
        this.e0.g();
        this.x2.a = false;
        xqa xqaVar = this.I0;
        if (xqaVar != null) {
            xqaVar.S = false;
            xqaVar.d.K();
            xqaVar.e.b();
            eu4 eu4Var = xqaVar.y;
            eu4Var.d.K();
            gm.release((View) null, eu4Var.q);
            eu4Var.q = null;
        }
        this.F0.p();
        aub aubVar = this.o0;
        if (aubVar != null) {
            aubVar.b();
        }
        xab xabVar = this.P0;
        if (xabVar != null) {
            xabVar.d.M(null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x0602, code lost:
    
        if (r3 == 33) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0de3, code lost:
    
        if (vp7.l(r37, r1.offer_id) == false) goto L395;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0549 A[LOOP:1: B:109:0x0547->B:110:0x0549, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x074f  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0bca  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0bd3  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0bdd  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0c23  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0d25  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0d41  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0dd3  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0e66  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0e98  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0ed3  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0f38  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0f05  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0f0f  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0f07  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0ed8  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0eae  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0e0e  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0d2f  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0bf1  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0a34  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x068f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        TextPaint textPaint;
        int i3;
        ArrayList arrayList;
        int i4;
        RadialProgress2 radialProgress2;
        int i5;
        uk1 uk1Var;
        float f;
        int L;
        int i6;
        int i7;
        float L2;
        StaticLayout staticLayout;
        int i8;
        Canvas canvas2;
        float f2;
        float f3;
        float f4;
        tgb tgbVar;
        sk1 sk1Var;
        StaticLayout staticLayout2;
        wjb wjbVar;
        RectF rectF;
        boolean z;
        float i9;
        Paint R;
        boolean a;
        ColorMatrixColorFilter colorMatrixColorFilter;
        ColorMatrix colorMatrix;
        int i10;
        float f5;
        float f6;
        uk1 uk1Var2;
        int i11;
        tgb tgbVar2;
        rk1 rk1Var;
        int size;
        int i12;
        Canvas canvas3 = canvas;
        canvas3.save();
        canvas3.translate(this.k0 / 2.0f, getPaddingTop());
        k27 k27Var = this.Q0;
        float d = this.r1.d(!this.p1);
        int i13 = this.i1;
        boolean U = U();
        u2b u2bVar = this.e0;
        TextPaint textPaint2 = this.G1;
        ImageReceiver imageReceiver = this.J;
        if (!U && this.P0 == null && X(k27Var)) {
            this.i1 = this.j1 - gl.L(106.0f);
            if (Z()) {
                i13 = Q(k27Var);
                float f7 = (this.W - i13) / 2.0f;
                float L3 = gl.L(16.0f) + gl.L(4.0f) + this.T + this.P;
                if (k27Var.y4()) {
                    u2bVar.d = k27Var.k.media.storyItem;
                }
                float f8 = i13;
                u2bVar.F.set(f7, L3, f7 + f8, f8 + L3);
                int i14 = k27Var.D;
                if (i14 == 31 || i14 == 33 || i14 == 34 || i14 == 35) {
                    f7 += gl.L(10.0f);
                    L3 += gl.L(10.0f);
                    i13 -= gl.L(20.0f);
                }
                if (k27Var.D == 37) {
                    f7 += gl.L(2.0f);
                }
                imageReceiver.i0(f7, L3, Math.max(0, i13), Math.max(0, i13));
                int i15 = k27Var.D;
                if (i15 == 31 || i15 == 33 || i15 == 34 || i15 == 35) {
                    i13 = gl.L(20.0f) + i13;
                }
            } else {
                int i16 = k27Var.D;
                if (i16 == 11) {
                    int i17 = this.W;
                    float f9 = this.i1;
                    imageReceiver.i0((i17 - r3) / 2.0f, (this.j1 * 0.075f) + this.T + this.P, f9, f9);
                } else if (i16 == 25) {
                    i13 = (int) (this.i1 * (gl.O1() ? 1.0f : 1.2f));
                    float f10 = i13;
                    imageReceiver.i0((this.W - i13) / 2.0f, ((this.j1 * 0.075f) + (this.T + this.P)) - gl.L(22.0f), f10, f10);
                } else if (k27Var.r4()) {
                    float f11 = i13;
                    imageReceiver.i0((this.W - i13) / 2.0f, (this.j1 * 0.075f) + this.T + this.P + gl.L(2.0f), f11, f11);
                } else {
                    int i18 = k27Var.D;
                    int i19 = this.i1;
                    if (i18 == 30) {
                        i13 = (int) (i19 * 1.1f);
                        TLRPC.Message message = k27Var.k;
                        if (message == null || (message.action instanceof TLRPC.TL_messageActionStarGift)) {
                            float f12 = i13;
                            imageReceiver.i0((this.W - i13) / 2.0f, ((this.j1 * 0.075f) + (this.T + this.P)) - gl.L(12.0f), f12, f12);
                        } else {
                            float f13 = i13;
                            imageReceiver.i0((this.W - i13) / 2.0f, ((this.j1 * 0.075f) + (this.T + this.P)) - gl.L(22.0f), f13, f13);
                        }
                    } else {
                        i13 = (int) (i19 * 1.0f);
                        float f14 = i13;
                        imageReceiver.i0((this.W - i13) / 2.0f, ((this.j1 * 0.075f) + (this.T + this.P)) - gl.L(4.0f), f14, f14);
                    }
                }
            }
            TextPaint textPaint3 = (TextPaint) R("paintChatActionText");
            this.t0 = textPaint3;
            if (textPaint3 != null) {
                TextPaint textPaint4 = this.F1;
                if (textPaint4 != null && textPaint4.getColor() != this.t0.getColor()) {
                    textPaint4.setColor(this.t0.getColor());
                }
                TextPaint textPaint5 = this.H1;
                if (textPaint5 != null && textPaint5.getColor() != this.t0.getColor()) {
                    textPaint5.setColor(this.t0.getColor());
                    textPaint5.linkColor = this.t0.getColor();
                }
                if (textPaint2 != null && textPaint2.getColor() != this.t0.getColor()) {
                    textPaint2.setColor(this.t0.getColor());
                    textPaint2.linkColor = this.t0.getColor();
                }
            }
        }
        int i20 = i13;
        J(canvas3, false);
        if (V()) {
            canvas3.save();
            int width = getWidth();
            this.J0.getClass();
            float h = (width - nkc.h()) / 2.0f;
            this.L0 = h;
            float walletActionTop = getWalletActionTop();
            this.M0 = walletActionTop;
            canvas3.translate(h, walletActionTop);
            this.J0.o((this.k0 / 2.0f) + this.L0, this.M0 + getPaddingTop());
            this.J0.d(canvas3);
            canvas3.restore();
        }
        boolean U2 = U();
        int i21 = this.I;
        RadialProgress2 radialProgress22 = this.K1;
        if (U2) {
            canvas3.save();
            float width2 = (getWidth() - this.I0.d()) / 2.0f;
            this.G0 = width2;
            float L4 = this.I0.p ? gl.L(4.0f) : gl.L(16.0f) + this.T + this.P;
            this.H0 = L4;
            canvas3.translate(width2, L4);
            this.I0.b(canvas3);
            rk1 rk1Var2 = this.g1;
            if (rk1Var2 == null || rk1Var2.l()) {
                this.I0.c(canvas3);
            }
            canvas3.restore();
        } else if (this.P0 != null) {
            canvas3.save();
            this.P0.a(canvas3);
            canvas3.restore();
        } else if (X(k27Var) || (k27Var != null && k27Var.D == 11)) {
            kv4 kv4Var = this.T0;
            if (kv4Var != null && ((i2 = k27Var.D) == 31 || i2 == 37 || i2 == 33)) {
                kv4Var.setBounds((int) (imageReceiver.L0 - gl.L(13.33f)), (int) (imageReceiver.M0 - gl.L(14.0f)), (int) (imageReceiver.L0 + imageReceiver.N0 + gl.L(13.33f)), (int) (imageReceiver.M0 + imageReceiver.O0 + gl.L(14.0f)));
                this.T0.draw(canvas3);
            }
            if (this.K != null) {
                canvas3.save();
                canvas3.translate(imageReceiver.L0, imageReceiver.M0);
                Path path = this.L;
                if (path == null) {
                    this.L = new Path();
                } else {
                    path.rewind();
                }
                Path path2 = this.L;
                float f15 = imageReceiver.N0 / 2.0f;
                path2.addCircle(f15, imageReceiver.O0 / 2.0f, f15, Path.Direction.CW);
                canvas3.clipPath(this.L);
                this.K.setBounds(0, 0, (int) imageReceiver.N0, (int) imageReceiver.O0);
                this.K.draw(canvas3);
                canvas3.restore();
            } else if (k27Var.y4()) {
                TLRPC.MessageMedia messageMedia = k27Var.k.media;
                long j = messageMedia.user_id;
                u2bVar.c = messageMedia.id;
                x2b.h(j, canvas3, imageReceiver, u2bVar);
            } else {
                imageReceiver.g(canvas3);
            }
            K(canvas);
            l0();
            if (k27Var.D == 37) {
                kq3.a(canvas3, bkb.R0, imageReceiver.L0 + gl.L(26.0f), imageReceiver.M0 + gl.L(26.0f), gl.L(52.0f));
            }
            float f16 = imageReceiver.L0;
            float f17 = imageReceiver.M0;
            radialProgress22.a.set(f16, f17, imageReceiver.N0 + f16, imageReceiver.O0 + f17);
            int i22 = k27Var.D;
            if (i22 != 21) {
                i = 22;
                if (i22 == 22) {
                    float S = S(k27Var);
                    radialProgress22.o(true, S);
                    radialProgress22.setCircleRadius(gl.L(26.0f));
                    radialProgress22.G = gl.L(24.0f);
                    radialProgress22.g(bkb.bf, bkb.cf, bkb.df, bkb.ef);
                    if (S == 1.0f) {
                        radialProgress22.setIcon(4, true, true);
                    } else {
                        radialProgress22.setIcon(3, true, true);
                    }
                    radialProgress22.draw(canvas3);
                }
                textPaint = this.t0;
                i3 = i;
                arrayList = this.q0;
                if (textPaint != null || this.N == null) {
                    i4 = i21;
                    radialProgress2 = radialProgress22;
                    i5 = i3;
                } else {
                    canvas3.save();
                    canvas3.translate(this.U, this.T);
                    if (this.N.getPaint() != this.t0) {
                        x();
                    }
                    canvas3.save();
                    qla.d(canvas3, arrayList);
                    qla.f(canvas3, this.N);
                    rk1 rk1Var3 = this.g1;
                    if (rk1Var3 == null || rk1Var3.l()) {
                        StaticLayout staticLayout3 = this.N;
                        radialProgress2 = radialProgress22;
                        i4 = i21;
                        i5 = i3;
                        gm.drawAnimatedEmojis(canvas, staticLayout3, this.s0, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout3 == null ? null : P(staticLayout3.getPaint().getColor()));
                        canvas3 = canvas;
                    } else {
                        i4 = i21;
                        radialProgress2 = radialProgress22;
                        i5 = i3;
                    }
                    canvas3.restore();
                    int size2 = arrayList.size();
                    int i23 = 0;
                    while (i23 < size2) {
                        Object obj = arrayList.get(i23);
                        i23++;
                        qla qlaVar = (qla) obj;
                        qlaVar.h(this.N.getPaint().getColor());
                        qlaVar.draw(canvas3);
                    }
                    canvas3.restore();
                }
                if (this.t0 != null && this.Q != null) {
                    canvas3.save();
                    canvas3.translate(this.V, this.T - this.R);
                    if (this.Q.getPaint() != this.t0) {
                        x();
                    }
                    canvas3.save();
                    qla.d(canvas3, arrayList);
                    qla.f(canvas3, this.Q);
                    rk1Var = this.g1;
                    if (rk1Var != null || rk1Var.l()) {
                        StaticLayout staticLayout4 = this.Q;
                        cm cmVar = this.s0;
                        StaticLayout staticLayout5 = this.N;
                        gm.drawAnimatedEmojis(canvas, staticLayout4, cmVar, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout5 != null ? null : P(staticLayout5.getPaint().getColor()));
                        canvas3 = canvas;
                    }
                    canvas3.restore();
                    size = arrayList.size();
                    i12 = 0;
                    while (i12 < size) {
                        Object obj2 = arrayList.get(i12);
                        i12++;
                        qla qlaVar2 = (qla) obj2;
                        qlaVar2.h(this.Q.getPaint().getColor());
                        qlaVar2.draw(canvas3);
                    }
                    canvas3.restore();
                }
                if (U() && X(k27Var)) {
                    canvas3.save();
                    float f18 = (this.W - this.j1) / 2.0f;
                    if (k27Var.D != i5) {
                        f18 += gl.L(8.0f);
                    }
                    float f19 = f18;
                    if (Z()) {
                        RectF rectF2 = this.N1;
                        f = rectF2 != null ? rectF2.top : gl.L(4.0f) + this.T + this.P;
                        L = gl.L(16.0f);
                        if (i20 > 0) {
                            L = (L << 1) + i20;
                        }
                    } else {
                        float f20 = (this.j1 * 0.075f) + this.T + this.P;
                        if (k27Var.D != 21) {
                            i20 = this.i1;
                        }
                        float L5 = f20 + i20 + gl.L(4.0f);
                        if (k27Var.D == 21) {
                            L5 += gl.L(16.0f);
                        }
                        f = L5;
                        if (k27Var.r4()) {
                            L = gl.L(12.0f);
                        } else {
                            if (k27Var.D == 30 && !k27Var.r4()) {
                                f -= gl.L(3.66f);
                            }
                            i6 = k27Var.D;
                            if (i6 != 31 || i6 == 37) {
                                i7 = 33;
                            } else {
                                i7 = 33;
                            }
                            f -= gl.L(3.66f);
                            canvas3.translate(f19, f);
                            if (this.k1 == null) {
                                canvas3.save();
                                canvas3.translate(((this.j1 - gl.L(16.0f)) - this.k1.getWidth()) / 2.0f, 0.0f);
                                this.k1.draw(canvas3);
                                canvas3.restore();
                                float height = this.k1.getHeight() + f;
                                if (this.n1 != null) {
                                    canvas3.save();
                                    canvas3.translate(((this.j1 - gl.L(16.0f)) - this.n1.getWidth()) / 2.0f, gl.L(4.0f) + this.k1.getHeight());
                                    this.n1.draw(canvas3);
                                    canvas3.restore();
                                    height += gl.L(10.0f) + this.n1.getHeight();
                                }
                                L2 = height + gl.L(k27Var.D == 25 ? 6.0f : 0.0f);
                            } else {
                                L2 = f - gl.L(4.0f);
                            }
                            float f21 = L2;
                            canvas3.restore();
                            staticLayout = this.k1;
                            int i24 = TLObject.FLAG_28;
                            if (staticLayout != null || (tgbVar2 = this.m1) == null) {
                                i8 = i7;
                                canvas2 = canvas3;
                                f2 = 0.0f;
                            } else {
                                float j2 = tgbVar2.j() + gl.L(12.0f);
                                float z2 = oo1.z(this.j1 - gl.L(16.0f), j2, 2.0f, f19);
                                float height2 = f + this.k1.getHeight() + gl.L(14.0f);
                                Paint paint = this.l1;
                                if (paint == null) {
                                    paint = new Paint(1);
                                    this.l1 = paint;
                                }
                                paint.setColor(bkb.h1() ? 285212671 : 268435456);
                                RectF rectF3 = gl.P;
                                rectF3.set(z2, height2 - gl.L(8.0f), j2 + z2, gl.L(8.0f) + height2);
                                canvas3.drawRoundRect(rectF3, gl.L(8.0f), gl.L(8.0f), this.l1);
                                Canvas canvas4 = canvas3;
                                f2 = 0.0f;
                                i8 = 33;
                                this.m1.c(z2 + gl.L(6.0f), height2, 1.0f, -855638017, canvas4);
                                canvas2 = canvas4;
                                f21 += gl.L(24.0f);
                            }
                            float L6 = f21 + gl.L(4.0f);
                            if (k27Var.D == 18) {
                                L6 += gl.L(2.0f);
                            }
                            float f22 = L6;
                            canvas2.save();
                            canvas2.translate(f19, f22);
                            if (k27Var.D != i5) {
                                RadialProgress2 radialProgress23 = radialProgress2;
                                if ((radialProgress23.c ? radialProgress23.j : radialProgress23.i).b() == 1.0f) {
                                    i10 = 4;
                                    if (radialProgress23.a() == 4) {
                                        if (this.t1 != null) {
                                            canvas2.save();
                                            canvas2.translate((this.j1 - this.t1.d.getWidth()) / 2.0f, f2);
                                            this.t1.a = ((this.j1 - r3.d.getWidth()) / 2.0f) + f19;
                                            this.t1.b = f22;
                                            int color = textPaint2.getColor();
                                            sk1 sk1Var2 = this.t1;
                                            f5 = f19;
                                            f3 = f2;
                                            qla.g(this, false, color, 0, sk1Var2.g, 1, sk1Var2.d, sk1Var2.f, canvas, false);
                                            sk1 sk1Var3 = this.t1;
                                            gm.drawAnimatedEmojis(canvas, sk1Var3.d, sk1Var3.h, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, P(textPaint2.getColor()));
                                            canvas3 = canvas;
                                            canvas3.restore();
                                            uk1Var = this;
                                            f4 = f5;
                                        } else {
                                            f3 = f2;
                                            uk1Var = this;
                                            canvas3 = canvas2;
                                            f4 = f19;
                                        }
                                    }
                                } else {
                                    i10 = 4;
                                }
                                f5 = f19;
                                f3 = f2;
                                int i25 = i8;
                                canvas3 = canvas2;
                                if (this.B1 == null) {
                                    TextPaint textPaint6 = new TextPaint();
                                    this.A1 = textPaint6;
                                    textPaint6.setTextSize(gl.L(13.0f));
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k96.L0(2131754555));
                                    int indexOf = spannableStringBuilder.toString().indexOf("...");
                                    if (indexOf < 0) {
                                        indexOf = spannableStringBuilder.toString().indexOf("…");
                                        i11 = 1;
                                    } else {
                                        i11 = 3;
                                    }
                                    if (indexOf >= 0) {
                                        SpannableString spannableString = new SpannableString("…");
                                        q6c q6cVar = new q6c();
                                        q6cVar.r = true;
                                        q6cVar.b(this);
                                        f6 = 0.2f;
                                        spannableString.setSpan(q6cVar, 0, spannableString.length(), i25);
                                        spannableStringBuilder.replace(indexOf, indexOf + i11, (CharSequence) spannableString);
                                    } else {
                                        f6 = 0.2f;
                                    }
                                    TextPaint textPaint7 = this.A1;
                                    sk1 sk1Var4 = this.t1;
                                    this.B1 = new StaticLayout(spannableStringBuilder, textPaint7, sk1Var4 == null ? 1 : sk1Var4.c, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                                } else {
                                    f6 = 0.2f;
                                }
                                float S2 = S(k27Var);
                                if (this.D1 == null || this.C1 != S2) {
                                    this.C1 = S2;
                                    String l = de9.l(new StringBuilder(), (int) (S2 * 100.0f), "%");
                                    sk1 sk1Var5 = this.t1;
                                    this.D1 = new StaticLayout(l, textPaint2, sk1Var5 == null ? 1 : sk1Var5.c, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                                }
                                this.A1.setColor(textPaint2.getColor());
                                if (radialProgress23.a() == i10) {
                                    float b = (radialProgress23.c ? radialProgress23.j : radialProgress23.i).b();
                                    int color2 = textPaint2.getColor();
                                    float f23 = 1.0f - b;
                                    this.A1.setAlpha((int) (Color.alpha(color2) * f23));
                                    textPaint2.setAlpha((int) (Color.alpha(color2) * b));
                                    textPaint2.linkColor = textPaint2.getColor();
                                    if (this.t1 != null) {
                                        float f24 = (b * f6) + 0.8f;
                                        canvas3.save();
                                        canvas3.scale(f24, f24, this.j1 / 2.0f, this.t1.d.getHeight() / 2.0f);
                                        canvas3.translate((this.j1 - this.t1.d.getWidth()) / 2.0f, f3);
                                        this.t1.a = ((this.j1 - r1.d.getWidth()) / 2.0f) + f5;
                                        this.t1.b = f22;
                                        int color3 = textPaint2.getColor();
                                        sk1 sk1Var6 = this.t1;
                                        qla.g(this, false, color3, 0, sk1Var6.g, 1, sk1Var6.d, sk1Var6.f, canvas3, false);
                                        sk1 sk1Var7 = this.t1;
                                        uk1Var2 = this;
                                        gm.drawAnimatedEmojis(canvas, sk1Var7.d, sk1Var7.h, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, P(textPaint2.getColor()));
                                        canvas3 = canvas;
                                        canvas3.restore();
                                    } else {
                                        uk1Var2 = this;
                                    }
                                    textPaint2.setAlpha((int) (Color.alpha(color2) * f23));
                                    textPaint2.linkColor = textPaint2.getColor();
                                    float f25 = (f23 * f6) + 0.8f;
                                    canvas3.save();
                                    canvas3.scale(f25, f25, uk1Var2.j1 / 2.0f, uk1Var2.B1.getHeight() / 2.0f);
                                    canvas3.translate((uk1Var2.j1 - uk1Var2.B1.getWidth()) / 2.0f, f3);
                                    qla.f(canvas3, uk1Var2.B1);
                                    canvas3.restore();
                                    canvas3.save();
                                    canvas3.translate(f3, gl.L(4.0f) + uk1Var2.B1.getHeight());
                                    canvas3.scale(f25, f25, uk1Var2.j1 / 2.0f, uk1Var2.D1.getHeight() / 2.0f);
                                    canvas3.translate((uk1Var2.j1 - uk1Var2.D1.getWidth()) / 2.0f, f3);
                                    qla.f(canvas3, uk1Var2.D1);
                                    canvas3.restore();
                                    textPaint2.setColor(color2);
                                    textPaint2.linkColor = color2;
                                } else {
                                    uk1Var2 = this;
                                    canvas3.save();
                                    canvas3.translate((uk1Var2.j1 - uk1Var2.B1.getWidth()) / 2.0f, f3);
                                    uk1Var2.B1.draw(canvas3);
                                    canvas3.restore();
                                    canvas3.save();
                                    canvas3.translate((uk1Var2.j1 - uk1Var2.D1.getWidth()) / 2.0f, gl.L(4.0f) + uk1Var2.B1.getHeight());
                                    qla.f(canvas3, uk1Var2.D1);
                                    canvas3.restore();
                                }
                                uk1Var = uk1Var2;
                                f4 = f5;
                            } else {
                                f3 = f2;
                                canvas3 = canvas2;
                                sk1 sk1Var8 = this.t1;
                                if (sk1Var8 != null) {
                                    float height3 = sk1Var8.d.getHeight();
                                    if (d < 1.0f) {
                                        height3 = gl.R1(this.q1, height3, d);
                                        RectF rectF4 = gl.P;
                                        rectF4.set(f3, -gl.L(20.0f), getWidth(), height3);
                                        canvas3.saveLayerAlpha(rectF4, kk7.d4, 31);
                                    } else {
                                        canvas3.save();
                                    }
                                    canvas3.translate(((this.j1 - gl.L(16.0f)) - this.t1.d.getWidth()) / 2.0f, f3);
                                    this.t1.a = (((this.j1 - gl.L(16.0f)) - this.t1.d.getWidth()) / 2.0f) + f19;
                                    sk1 sk1Var9 = this.t1;
                                    sk1Var9.b = f22;
                                    int color4 = sk1Var9.e.getColor();
                                    sk1 sk1Var10 = this.t1;
                                    float f26 = height3;
                                    f4 = f19;
                                    qla.g(this, false, color4, 0, sk1Var10.g, 1, sk1Var10.d, sk1Var10.f, canvas3, false);
                                    sk1 sk1Var11 = this.t1;
                                    StaticLayout staticLayout6 = sk1Var11.d;
                                    cm cmVar2 = sk1Var11.h;
                                    ColorFilter P = P(textPaint2.getColor());
                                    uk1Var = this;
                                    gm.drawAnimatedEmojis(canvas, staticLayout6, cmVar2, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, P);
                                    canvas3 = canvas;
                                    if (d < 1.0f && uk1Var.x1 != null) {
                                        canvas3.save();
                                        if (uk1Var.s1 == null) {
                                            uk1Var.s1 = new xl3((byte) 7);
                                        }
                                        canvas3.translate((-((uk1Var.j1 - gl.L(16.0f)) - uk1Var.t1.d.getWidth())) / 2.0f, f3);
                                        RectF rectF5 = gl.P;
                                        rectF5.set((uk1Var.u1 - uk1Var.x1.c) + gl.L(8.0f), (uk1Var.v1 - uk1Var.w1) - gl.L(6.0f), gl.L(6.0f) + uk1Var.u1, uk1Var.v1);
                                        float f27 = 1.0f - d;
                                        uk1Var.s1.p(canvas3, rectF5, f27);
                                        rectF5.set((uk1Var.u1 - uk1Var.x1.c) - gl.L(16.0f), (uk1Var.v1 - uk1Var.w1) - gl.L(6.0f), (uk1Var.u1 - uk1Var.x1.c) + gl.L(8.0f), uk1Var.v1);
                                        uk1Var.s1.s(canvas3, rectF5, 2, f27);
                                        rectF5.set(f3, f26 - gl.L(12.0f), uk1Var.getWidth(), f26);
                                        uk1Var.s1.s(canvas3, rectF5, 3, (1.0f - f27) * f27 * 4.0f);
                                        canvas3.restore();
                                    }
                                    canvas3.restore();
                                    if (d < 1.0f && (tgbVar = uk1Var.x1) != null) {
                                        tgbVar.c((uk1Var.u1 - tgbVar.c) + gl.L(5.0f), (uk1Var.v1 - (uk1Var.w1 / 2.0f)) - gl.L(1.0f), 1.0f - d, uk1Var.t1.e.getColor(), canvas3);
                                    }
                                } else {
                                    uk1Var = this;
                                    f4 = f19;
                                }
                            }
                            canvas3.restore();
                            sk1Var = uk1Var.t1;
                            if (sk1Var != null) {
                                sk1Var.d.getHeight();
                            }
                            staticLayout2 = uk1Var.y1;
                            if (staticLayout2 != null) {
                                staticLayout2.getHeight();
                            }
                            uk1Var.getHeight();
                            wjbVar = uk1Var.h1;
                            if (wjbVar == null) {
                                wjbVar.b(uk1Var.v0, uk1Var.u0 + gl.L(4.0f), uk1Var.getMeasuredWidth(), uk1Var.w0);
                            } else {
                                bkb.q(uk1Var.v0, uk1Var.u0 + gl.L(4.0f), uk1Var.getMeasuredWidth(), uk1Var.w0);
                            }
                            float a2 = uk1Var.n.a(0.02f);
                            canvas3.save();
                            rectF = uk1Var.p0;
                            canvas3.scale(a2, a2, rectF.centerX(), rectF.centerY());
                            if (uk1Var.y1 != null) {
                                canvas3.drawRoundRect(rectF, gl.L(15.0f), gl.L(15.0f), uk1Var.R("paintChatActionBackgroundSelected"));
                                if (uk1Var.T()) {
                                    canvas3.drawRoundRect(rectF, gl.L(15.0f), gl.L(15.0f), uk1Var.R("paintChatActionBackgroundDarken"));
                                }
                                float f28 = uk1Var.h2;
                                Paint paint2 = uk1Var.i2;
                                if (f28 > f3) {
                                    canvas3.drawRoundRect(rectF, gl.L(15.0f), gl.L(15.0f), paint2);
                                }
                                if (uk1Var.getMessageObject().D == 31 || uk1Var.getMessageObject().D == 37 || uk1Var.getMessageObject().D == 33) {
                                    boolean a3 = wjbVar != null ? wjbVar.a() : bkb.h1();
                                    int color5 = paint2.getColor();
                                    if (a3) {
                                        i24 = 620756991;
                                    }
                                    paint2.setColor(i24);
                                    canvas3.drawRoundRect(rectF, gl.L(15.0f), gl.L(15.0f), paint2);
                                    paint2.setColor(color5);
                                }
                                TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = uk1Var.c2;
                                if ((tL_messageActionStarGiftOnchainOffer == null || tL_messageActionStarGiftOnchainOffer.buyer) && (uk1Var.getMessageObject().D == 31 || uk1Var.getMessageObject().D == 37 || uk1Var.getMessageObject().D == 33 || uk1Var.getMessageObject().D == 21 || uk1Var.getMessageObject().D == 22 || uk1Var.getMessageObject().D == 24)) {
                                    uk1Var.invalidate();
                                } else {
                                    Path path3 = uk1Var.V1;
                                    path3.rewind();
                                    path3.addRoundRect(rectF, gl.L(16.0f), gl.L(16.0f), Path.Direction.CW);
                                    canvas3.save();
                                    canvas3.clipPath(path3);
                                    bra braVar = uk1Var.W1;
                                    braVar.d(canvas3);
                                    if (!braVar.g) {
                                        uk1Var.invalidate();
                                    }
                                    canvas3.restore();
                                }
                            }
                            z = k27Var.q;
                            float f29 = uk1Var.d0;
                            if (z) {
                                if (f29 != f3) {
                                    f29 -= 0.10666667f;
                                    uk1Var.d0 = f29;
                                }
                            } else if (f29 != 1.0f) {
                                f29 += 0.10666667f;
                                uk1Var.d0 = f29;
                            }
                            i9 = Utilities.i(f29, 1.0f, f3);
                            uk1Var.d0 = i9;
                            if (i9 != f3) {
                                if (uk1Var.c0 == null) {
                                    uk1Var.c0 = new RadialProgressView(uk1Var.getContext());
                                }
                                int L7 = gl.L(16.0f);
                                canvas3.save();
                                float f30 = uk1Var.d0;
                                canvas3.scale(f30, f30, rectF.centerX(), rectF.centerY());
                                uk1Var.c0.setSize(L7);
                                uk1Var.c0.setProgressColor(bkb.u0(bkb.Yc));
                                uk1Var.c0.a(canvas3, rectF.centerX(), rectF.centerY());
                                canvas3.restore();
                            }
                            if (uk1Var.d0 != 1.0f && uk1Var.y1 != null) {
                                canvas3.save();
                                float f31 = 1.0f - uk1Var.d0;
                                canvas3.scale(f31, f31, rectF.centerX(), rectF.centerY());
                                canvas3.translate(f4, rectF.top + gl.L(7.0f));
                                canvas3.translate(((uk1Var.j1 - gl.L(16.0f)) - uk1Var.y1.getWidth()) / 2.0f, f3);
                                uk1Var.y1.draw(canvas3);
                                canvas3.restore();
                            }
                            if (!k27Var.r) {
                                TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer2 = uk1Var.c2;
                                if (tL_messageActionStarGiftOnchainOffer2 != null && uk1Var.d2) {
                                }
                                r86 r86Var = uk1Var.r;
                                if (r86Var != null) {
                                    r86Var.e(rectF);
                                    uk1Var.r.j(16.0f);
                                    uk1Var.r.a();
                                    uk1Var.r.draw(canvas3);
                                    if (uk1Var.r.c()) {
                                        uk1Var.r.b = -1L;
                                    }
                                }
                                canvas3.restore();
                                if (uk1Var.N1 != null && uk1Var.S1 != null && uk1Var.T1 != null) {
                                    R = uk1Var.R("paintChatActionBackground");
                                    Paint R2 = uk1Var.R("paintChatActionBackgroundDarken");
                                    float L8 = (uk1Var.N1.right - gl.L(65.0f)) + gl.L(2.0f);
                                    float L9 = uk1Var.N1.top - gl.L(2.0f);
                                    if (wjbVar == null) {
                                        wjbVar.b(uk1Var.v0 + L8, uk1Var.u0 + gl.L(4.0f) + L9, uk1Var.getMeasuredWidth(), uk1Var.w0);
                                    } else {
                                        bkb.q(uk1Var.v0 + L8, uk1Var.u0 + gl.L(4.0f) + L9, uk1Var.getMeasuredWidth(), uk1Var.w0);
                                    }
                                    canvas3.save();
                                    canvas3.translate(L8, L9);
                                    ColorFilter colorFilter = R.getColorFilter();
                                    PathEffect pathEffect = R.getPathEffect();
                                    a = wjbVar == null ? wjbVar.a() : bkb.h1();
                                    colorMatrixColorFilter = uk1Var.Q1;
                                    if (colorMatrixColorFilter != null || uk1Var.P1 != a) {
                                        colorMatrix = new ColorMatrix();
                                        if ((R.getColorFilter() instanceof ColorMatrixColorFilter) && Build.VERSION.SDK_INT >= 26) {
                                            ((ColorMatrixColorFilter) R.getColorFilter()).getColorMatrix(colorMatrix);
                                        }
                                        gl.h(colorMatrix, !a ? 0.1f : -0.08f);
                                        gl.i(colorMatrix, a ? 0.15f : 0.1f);
                                        ColorMatrixColorFilter colorMatrixColorFilter2 = new ColorMatrixColorFilter(colorMatrix);
                                        uk1Var.Q1 = colorMatrixColorFilter2;
                                        uk1Var.P1 = a;
                                        colorMatrixColorFilter = colorMatrixColorFilter2;
                                    }
                                    R.setColorFilter(colorMatrixColorFilter);
                                    R.setPathEffect(uk1Var.R1);
                                    canvas3.drawPath(uk1Var.S1, R);
                                    R.setColorFilter(colorFilter);
                                    R.setPathEffect(pathEffect);
                                    if (uk1Var.T()) {
                                        PathEffect pathEffect2 = R2.getPathEffect();
                                        R2.setPathEffect(uk1Var.R1);
                                        canvas3.drawPath(uk1Var.S1, R2);
                                        R2.setPathEffect(pathEffect2);
                                    }
                                    canvas3.rotate(45.0f, gl.L(40.43f), gl.L(24.56f));
                                    uk1Var.T1.c(gl.L(40.43f) - (uk1Var.T1.c / 2.0f), gl.L(26.0f), 1.0f, -1, canvas3);
                                    canvas3.restore();
                                }
                            }
                            if (uk1Var.r == null) {
                                r86 r86Var2 = new r86(wjbVar);
                                uk1Var.r = r86Var2;
                                r86Var2.setCallback(uk1Var);
                                r86 r86Var3 = uk1Var.r;
                                r86Var3.t = 2.0f;
                                r86Var3.D = true;
                                r86Var3.g(bkb.p1(0.08f, -1), bkb.p1(0.2f, -1), bkb.p1(0.2f, -1), bkb.p1(0.7f, -1));
                                uk1Var.r.x.setStrokeWidth(gl.L(1.0f));
                            }
                            r86 r86Var4 = uk1Var.r;
                            r86Var4.c = -1L;
                            r86Var4.e(rectF);
                            uk1Var.r.j(16.0f);
                            uk1Var.r.draw(canvas3);
                            canvas3.restore();
                            if (uk1Var.N1 != null) {
                                R = uk1Var.R("paintChatActionBackground");
                                Paint R22 = uk1Var.R("paintChatActionBackgroundDarken");
                                float L82 = (uk1Var.N1.right - gl.L(65.0f)) + gl.L(2.0f);
                                float L92 = uk1Var.N1.top - gl.L(2.0f);
                                if (wjbVar == null) {
                                }
                                canvas3.save();
                                canvas3.translate(L82, L92);
                                ColorFilter colorFilter2 = R.getColorFilter();
                                PathEffect pathEffect3 = R.getPathEffect();
                                if (wjbVar == null) {
                                }
                                colorMatrixColorFilter = uk1Var.Q1;
                                if (colorMatrixColorFilter != null) {
                                }
                                colorMatrix = new ColorMatrix();
                                if (R.getColorFilter() instanceof ColorMatrixColorFilter) {
                                    ((ColorMatrixColorFilter) R.getColorFilter()).getColorMatrix(colorMatrix);
                                }
                                gl.h(colorMatrix, !a ? 0.1f : -0.08f);
                                gl.i(colorMatrix, a ? 0.15f : 0.1f);
                                ColorMatrixColorFilter colorMatrixColorFilter22 = new ColorMatrixColorFilter(colorMatrix);
                                uk1Var.Q1 = colorMatrixColorFilter22;
                                uk1Var.P1 = a;
                                colorMatrixColorFilter = colorMatrixColorFilter22;
                                R.setColorFilter(colorMatrixColorFilter);
                                R.setPathEffect(uk1Var.R1);
                                canvas3.drawPath(uk1Var.S1, R);
                                R.setColorFilter(colorFilter2);
                                R.setPathEffect(pathEffect3);
                                if (uk1Var.T()) {
                                }
                                canvas3.rotate(45.0f, gl.L(40.43f), gl.L(24.56f));
                                uk1Var.T1.c(gl.L(40.43f) - (uk1Var.T1.c / 2.0f), gl.L(26.0f), 1.0f, -1, canvas3);
                                canvas3.restore();
                            }
                        }
                    }
                    f += L;
                    i6 = k27Var.D;
                    if (i6 != 31) {
                    }
                    i7 = 33;
                    f -= gl.L(3.66f);
                    canvas3.translate(f19, f);
                    if (this.k1 == null) {
                    }
                    float f212 = L2;
                    canvas3.restore();
                    staticLayout = this.k1;
                    int i242 = TLObject.FLAG_28;
                    if (staticLayout != null) {
                    }
                    i8 = i7;
                    canvas2 = canvas3;
                    f2 = 0.0f;
                    float L62 = f212 + gl.L(4.0f);
                    if (k27Var.D == 18) {
                    }
                    float f222 = L62;
                    canvas2.save();
                    canvas2.translate(f19, f222);
                    if (k27Var.D != i5) {
                    }
                    canvas3.restore();
                    sk1Var = uk1Var.t1;
                    if (sk1Var != null) {
                    }
                    staticLayout2 = uk1Var.y1;
                    if (staticLayout2 != null) {
                    }
                    uk1Var.getHeight();
                    wjbVar = uk1Var.h1;
                    if (wjbVar == null) {
                    }
                    float a22 = uk1Var.n.a(0.02f);
                    canvas3.save();
                    rectF = uk1Var.p0;
                    canvas3.scale(a22, a22, rectF.centerX(), rectF.centerY());
                    if (uk1Var.y1 != null) {
                    }
                    z = k27Var.q;
                    float f292 = uk1Var.d0;
                    if (z) {
                    }
                    i9 = Utilities.i(f292, 1.0f, f3);
                    uk1Var.d0 = i9;
                    if (i9 != f3) {
                    }
                    if (uk1Var.d0 != 1.0f) {
                        canvas3.save();
                        float f312 = 1.0f - uk1Var.d0;
                        canvas3.scale(f312, f312, rectF.centerX(), rectF.centerY());
                        canvas3.translate(f4, rectF.top + gl.L(7.0f));
                        canvas3.translate(((uk1Var.j1 - gl.L(16.0f)) - uk1Var.y1.getWidth()) / 2.0f, f3);
                        uk1Var.y1.draw(canvas3);
                        canvas3.restore();
                    }
                    if (!k27Var.r) {
                    }
                    if (uk1Var.r == null) {
                    }
                    r86 r86Var42 = uk1Var.r;
                    r86Var42.c = -1L;
                    r86Var42.e(rectF);
                    uk1Var.r.j(16.0f);
                    uk1Var.r.draw(canvas3);
                    canvas3.restore();
                    if (uk1Var.N1 != null) {
                    }
                } else {
                    uk1Var = this;
                }
                uk1Var.M(canvas3, false);
                uk1Var.x2.a();
                canvas3.restore();
            }
            wl5 wl5Var = (wl5) na7.q1(i21).m4.get(k27Var.k.local_id);
            if (wl5Var != null) {
                radialProgress22.o(true, wl5Var.X);
                radialProgress22.setCircleRadius(((int) (imageReceiver.N0 * 0.5f)) + 1);
                radialProgress22.G = gl.L(24.0f);
                radialProgress22.g(bkb.bf, bkb.cf, bkb.df, bkb.ef);
                if (wl5Var.X == 1.0f) {
                    radialProgress22.setIcon(4, true, true);
                } else {
                    radialProgress22.setIcon(3, true, true);
                }
            }
            radialProgress22.draw(canvas3);
        }
        i = 22;
        textPaint = this.t0;
        i3 = i;
        arrayList = this.q0;
        if (textPaint != null) {
        }
        i4 = i21;
        radialProgress2 = radialProgress22;
        i5 = i3;
        if (this.t0 != null) {
            canvas3.save();
            canvas3.translate(this.V, this.T - this.R);
            if (this.Q.getPaint() != this.t0) {
            }
            canvas3.save();
            qla.d(canvas3, arrayList);
            qla.f(canvas3, this.Q);
            rk1Var = this.g1;
            if (rk1Var != null) {
            }
            StaticLayout staticLayout42 = this.Q;
            cm cmVar3 = this.s0;
            StaticLayout staticLayout52 = this.N;
            gm.drawAnimatedEmojis(canvas, staticLayout42, cmVar3, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout52 != null ? null : P(staticLayout52.getPaint().getColor()));
            canvas3 = canvas;
            canvas3.restore();
            size = arrayList.size();
            i12 = 0;
            while (i12 < size) {
            }
            canvas3.restore();
        }
        if (U()) {
        }
        uk1Var = this;
        uk1Var.M(canvas3, false);
        uk1Var.x2.a();
        canvas3.restore();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        k27 k27Var = this.Q0;
        if (TextUtils.isEmpty(this.S0) && k27Var == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = this.s2;
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder(!TextUtils.isEmpty(this.S0) ? this.S0 : k27Var.v);
            for (CharacterStyle characterStyle : (CharacterStyle[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ClickableSpan.class)) {
                int spanStart = spannableStringBuilder.getSpanStart(characterStyle);
                int spanEnd = spannableStringBuilder.getSpanEnd(characterStyle);
                spannableStringBuilder.removeSpan(characterStyle);
                spannableStringBuilder.setSpan(new q1((Object) this, (Object) characterStyle, (byte) 3), spanStart, spanEnd, 33);
            }
            this.s2 = spannableStringBuilder;
        }
        if (Build.VERSION.SDK_INT < 24) {
            accessibilityNodeInfo.setContentDescription(spannableStringBuilder.toString());
        } else {
            accessibilityNodeInfo.setText(spannableStringBuilder);
        }
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        RectF rectF = this.p0;
        this.U1.layout((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        nkc nkcVar = this.J0;
        mkc mkcVar = nkcVar == null ? null : nkcVar.m;
        if (mkcVar != null) {
            mkcVar.layout(0, 0, gl.L(42.0f), gl.L(42.0f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x020c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        float f;
        float f2;
        int i3;
        boolean U;
        i19 i19Var;
        float f3;
        boolean z;
        boolean Z;
        float f4;
        float L;
        float f5;
        float L2;
        StaticLayout staticLayout;
        float f6;
        float f7;
        TLRPC.Message message;
        int measuredWidth;
        int i4;
        int L3;
        int i5;
        int L4;
        int i6;
        nkc nkcVar = this.J0;
        mkc mkcVar = nkcVar == null ? null : nkcVar.m;
        if (mkcVar != null) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(gl.L(42.0f), TLObject.FLAG_30);
            mkcVar.measure(makeMeasureSpec, makeMeasureSpec);
        }
        k27 k27Var = this.Q0;
        if (k27Var == null && this.S0 == null) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), gl.L(14.0f) + this.m0 + this.P);
            return;
        }
        if (X(k27Var)) {
            this.j1 = b00.x(64.0f, (gl.q.y - a.getCurrentActionBarHeight()) - gl.m, (int) (gl.O1() ? gl.P0() * 0.6f : (gl.q.x * 0.62f) - gl.L(34.0f)));
            if ((!gl.O1() && ((i6 = k27Var.D) == 18 || i6 == 30 || Y())) || k27Var.D == 35) {
                this.j1 = (int) (this.j1 * 1.2f);
            }
            this.i1 = this.j1 - gl.L(106.0f);
            if (k27Var.D == 31) {
                this.j1 = Math.min(this.j1, gl.L(192.0f));
                this.i1 = gl.L(78.0f);
            }
            if (k27Var.D == 33) {
                this.j1 = Math.min(this.j1, gl.L(220.0f));
                this.i1 = gl.L(78.0f);
            }
            int i7 = k27Var.D;
            ImageReceiver imageReceiver = this.J;
            if (i7 == 37) {
                this.i1 = gl.L(52.0f);
                imageReceiver.q0(gl.L(14.0f));
            } else if (Z()) {
                imageReceiver.q0(this.i1 / 2);
            } else {
                imageReceiver.q0(0);
            }
        }
        int max = Math.max(gl.L(30.0f), View.MeasureSpec.getSize(i));
        if (this.W != max) {
            this.D0 = true;
            this.W = max;
            x();
        }
        if (k27Var != null) {
            f = 30.0f;
            if (k27Var.D == 11) {
                i5 = gl.u;
                L4 = gl.L(10.0f);
            } else if (X(k27Var)) {
                i5 = this.j1;
                L4 = gl.L(12.0f);
            } else if (V()) {
                f2 = 140.0f;
                i3 = (this.J0.q0 == null ? gl.L(140.0f) : ((int) Math.ceil(r3.q0.h())) + gl.L(150.0f)) + gl.L(8.0f);
                U = U();
                i19Var = this.F0;
                if (U) {
                    r9 = de9.w(8.0f, this.I0.P, this.I0.p ? 0 : gl.L(16.0f) + this.T + this.P);
                    if (!i19Var.p) {
                        L3 = gl.L(8.0f) + i19Var.m;
                        i19Var.n = L3;
                        r9 += L3;
                    }
                    f4 = 8.0f;
                    f5 = 24.0f;
                } else {
                    xab xabVar = this.P0;
                    if (xabVar != null) {
                        r9 = gl.L(12.0f) + gl.L(f2) + ((int) xabVar.f.h()) + (xabVar.i ? gl.L(40.0f) : 0);
                        if (!i19Var.p) {
                            L3 = gl.L(8.0f) + i19Var.m;
                            i19Var.n = L3;
                            r9 += L3;
                        }
                    } else if (X(k27Var)) {
                        if (k27Var != null) {
                            f3 = 16.0f;
                            if (k27Var.D == 25) {
                                z = true;
                                int Q = Q(k27Var);
                                Z = Z();
                                f4 = 8.0f;
                                int i8 = this.T + this.P;
                                if (Z) {
                                    L = (this.t1 == null ? 0 : gl.L(4.0f) + r13.d.getHeight()) + (this.j1 * 0.075f) + i8 + Q + gl.L(4.0f);
                                } else {
                                    int L5 = gl.L(4.0f) + i8;
                                    int L6 = gl.L(f3);
                                    if (Q > 0) {
                                        L6 = (L6 << 1) + Q;
                                    }
                                    int i9 = L5 + L6;
                                    sk1 sk1Var = this.t1;
                                    L = i9 + (sk1Var == null ? 0 : gl.L(4.0f) + sk1Var.d.getHeight());
                                }
                                this.L1 = 0;
                                if (this.k1 == null) {
                                    float height = L + r15.getHeight();
                                    if (this.k1.getLineCount() > 1) {
                                        f5 = 24.0f;
                                        this.L1 = (this.k1.getHeight() - this.k1.getLineTop(1)) + this.L1;
                                    } else {
                                        f5 = 24.0f;
                                    }
                                    L2 = height + gl.L(z ? 6.0f : 0.0f);
                                    if (this.n1 != null) {
                                        L2 += gl.L(9.0f) + r4.getHeight();
                                    }
                                    if (this.m1 != null) {
                                        L2 += gl.L(f5);
                                    }
                                } else {
                                    f5 = 24.0f;
                                    L2 = L - gl.L(12.0f);
                                    this.L1 -= gl.L(f);
                                }
                                sk1 sk1Var2 = this.t1;
                                int height2 = sk1Var2 != null ? 0 : sk1Var2.d.getHeight();
                                if (this.t1 != null) {
                                    this.L1 = 0;
                                } else if (this.n1 != null) {
                                    this.L1 = de9.w(10.0f, height2, this.L1);
                                } else {
                                    k27 k27Var2 = this.Q0;
                                    if (k27Var2.D == 18 || k27Var2.r4()) {
                                        this.L1 = b00.z(this.y1 == null ? 0.0f : 10.0f, height2, this.L1);
                                    } else if (this.Q0.D == 30) {
                                        this.L1 = b00.z(20.0f, height2, this.L1);
                                    } else if (this.p1) {
                                        this.L1 += height2;
                                    } else if (this.t1.d.getLineCount() > 2) {
                                        this.L1 = ((this.t1.d.getLineCount() * (this.t1.d.getLineBottom(0) - this.t1.d.getLineTop(0))) - 2) + this.L1;
                                    }
                                }
                                if (this.m1 != null) {
                                    this.L1 = gl.L(f5) + this.L1;
                                }
                                int L7 = this.L1 - gl.L(z ? 14.0f : 0.0f);
                                this.L1 = L7;
                                i3 += L7;
                                int L8 = gl.L(14.0f) + this.P + i3;
                                staticLayout = this.y1;
                                RectF rectF = this.p0;
                                if (staticLayout == null) {
                                    float z2 = oo1.z((L8 - L2) - staticLayout.getHeight(), gl.L(8.0f), 2.0f, L2);
                                    if (this.Q0.r4()) {
                                        z2 += gl.L(4.0f);
                                    }
                                    float f8 = (this.W - this.E1) / 2.0f;
                                    f6 = 2.0f;
                                    f7 = 18.0f;
                                    rectF.set(f8 - gl.L(18.0f), z2 - gl.L(8.0f), f8 + this.E1 + gl.L(18.0f), z2 + (this.y1 != null ? r8.getHeight() : 0) + gl.L(8.0f));
                                } else {
                                    f6 = 2.0f;
                                    f7 = 18.0f;
                                    i3 -= gl.L(40.0f);
                                    this.L1 -= gl.L(40.0f);
                                    k27 k27Var3 = this.Q0;
                                    if (k27Var3 != null && (message = k27Var3.k) != null && (message.action instanceof TLRPC.TL_messageActionStarGift)) {
                                        i3 -= gl.L(8.0f);
                                        this.L1 -= gl.L(8.0f);
                                    }
                                }
                                measuredWidth = getMeasuredWidth() << (getMeasuredHeight() + 16);
                                bra braVar = this.W1;
                                braVar.a.set(rectF);
                                braVar.b.set(rectF);
                                if (this.X1 != measuredWidth) {
                                    this.X1 = measuredWidth;
                                    braVar.f();
                                }
                                if (Z()) {
                                    int L9 = gl.L(4.0f) + this.T + this.P;
                                    this.f = 0;
                                    int L10 = gl.L(f3);
                                    if (Q > 0) {
                                        L10 = (L10 << 1) + Q;
                                    }
                                    this.f = L10;
                                    StaticLayout staticLayout2 = this.n1;
                                    if (staticLayout2 != null) {
                                        L10 = de9.w(10.0f, staticLayout2.getHeight(), L10);
                                        this.f = L10;
                                    }
                                    if (this.m1 != null) {
                                        L10 += gl.L(15.0f);
                                        this.f = L10;
                                    }
                                    int i10 = L10 + height2;
                                    this.f = i10;
                                    float f9 = (this.W - this.E1) / f6;
                                    if (this.y1 != null) {
                                        this.h = gl.L(7.0f) + i10 + L9;
                                        rectF.set(f9 - gl.L(f7), this.h, f9 + this.E1 + gl.L(f7), this.y1.getHeight() + this.h + (gl.L(8.0f) << 1));
                                        this.f = (int) (rectF.height() + gl.L(4.0f) + this.f);
                                    } else if (!Y() && (i4 = k27Var.D) != 34 && i4 != 33 && i4 != 35) {
                                        rectF.set(f9 - gl.L(f7), this.h, f9 + this.E1 + gl.L(f7), gl.L(17.0f) + this.h + (gl.L(8.0f) << 1));
                                        this.f = gl.L(17.0f) + this.f;
                                    }
                                    int L11 = gl.L(15.0f) + this.f;
                                    this.f = L11;
                                    int L12 = gl.L(6.0f) + L9 + L11;
                                    if (!i19Var.p) {
                                        int L13 = gl.L(8.0f) + i19Var.m;
                                        i19Var.n = L13;
                                        L12 += L13;
                                    }
                                    r9 = L12;
                                    if (this.Z1 != null) {
                                        r9 += gl.L(44.0f);
                                    }
                                }
                                rectF.inset(gl.L(5.0f), gl.L(1.0f));
                            }
                        } else {
                            f3 = 16.0f;
                        }
                        z = false;
                        int Q2 = Q(k27Var);
                        Z = Z();
                        f4 = 8.0f;
                        int i82 = this.T + this.P;
                        if (Z) {
                        }
                        this.L1 = 0;
                        if (this.k1 == null) {
                        }
                        sk1 sk1Var22 = this.t1;
                        if (sk1Var22 != null) {
                        }
                        if (this.t1 != null) {
                        }
                        if (this.m1 != null) {
                        }
                        int L72 = this.L1 - gl.L(z ? 14.0f : 0.0f);
                        this.L1 = L72;
                        i3 += L72;
                        int L82 = gl.L(14.0f) + this.P + i3;
                        staticLayout = this.y1;
                        RectF rectF2 = this.p0;
                        if (staticLayout == null) {
                        }
                        measuredWidth = getMeasuredWidth() << (getMeasuredHeight() + 16);
                        bra braVar2 = this.W1;
                        braVar2.a.set(rectF2);
                        braVar2.b.set(rectF2);
                        if (this.X1 != measuredWidth) {
                        }
                        if (Z()) {
                        }
                        rectF2.inset(gl.L(5.0f), gl.L(1.0f));
                    }
                    f4 = 8.0f;
                    f5 = 24.0f;
                }
                if (this.Q0 != null && !i19Var.p) {
                    int L14 = gl.L(f4) + i19Var.m;
                    i19Var.n = L14;
                    i3 += L14;
                }
                if (Y()) {
                    i3 = de9.w(f5, this.R, i3);
                }
                if (k27Var == null && Z()) {
                    setMeasuredDimension(max, this.m0 + r9);
                } else {
                    setMeasuredDimension(max, gl.L(14.0f) + this.m0 + this.P + i3);
                }
                i19Var.c = (getMeasuredHeight() - getPaddingTop()) - i19Var.n;
            }
            i3 = L4 + i5;
            f2 = 140.0f;
            U = U();
            i19Var = this.F0;
            if (U) {
            }
            if (this.Q0 != null) {
                int L142 = gl.L(f4) + i19Var.m;
                i19Var.n = L142;
                i3 += L142;
            }
            if (Y()) {
            }
            if (k27Var == null) {
            }
            setMeasuredDimension(max, gl.L(14.0f) + this.m0 + this.P + i3);
            i19Var.c = (getMeasuredHeight() - getPaddingTop()) - i19Var.n;
        }
        f = 30.0f;
        f2 = 140.0f;
        i3 = 0;
        U = U();
        i19Var = this.F0;
        if (U) {
        }
        if (this.Q0 != null) {
        }
        if (Y()) {
        }
        if (k27Var == null) {
        }
        setMeasuredDimension(max, gl.L(14.0f) + this.m0 + this.P + i3);
        i19Var.c = (getMeasuredHeight() - getPaddingTop()) - i19Var.n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a9, code lost:
    
        if (r11.i == false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x094c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        wl5 wl5Var;
        TLRPC.Message message;
        TL_stars.StarGift starGift;
        sk1 sk1Var;
        u47 u47Var;
        nj njVar;
        sk1 sk1Var2;
        TLRPC.Message message2;
        boolean z;
        boolean z2;
        boolean z3;
        StaticLayout staticLayout;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        TLRPC.Message message3;
        TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer;
        int i;
        boolean z8;
        boolean z9;
        nk1 nk1Var;
        k27 k27Var = this.Q0;
        float x = motionEvent.getX() - (this.k0 / 2.0f);
        this.z0 = x;
        float y = motionEvent.getY() + getPaddingTop();
        this.A0 = y;
        if (k27Var == null) {
            if (this.k2 != null) {
                if (motionEvent.getAction() == 0) {
                    if (x >= this.b1 && x <= this.c1) {
                        this.G = true;
                        return true;
                    }
                } else if (this.G) {
                    if (motionEvent.getAction() == 1) {
                        this.k2.onClick(this);
                        this.G = false;
                    } else if (motionEvent.getAction() == 3) {
                        this.G = false;
                    }
                }
            }
            return super.onTouchEvent(motionEvent);
        }
        aub aubVar = this.o0;
        if (aubVar == null || !aubVar.d(motionEvent, false)) {
            xab xabVar = this.P0;
            if (xabVar != null) {
                n41 n41Var = xabVar.m;
                boolean contains = xabVar.k.contains(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0) {
                    n41Var.c(contains);
                } else if (motionEvent.getAction() != 2) {
                    if (motionEvent.getAction() == 1) {
                        if (n41Var.i) {
                            xabVar.b();
                        }
                        n41Var.c(false);
                    } else if (motionEvent.getAction() == 3) {
                        n41Var.c(false);
                    }
                }
            }
            if (!U() || !this.I0.e(this.G0, this.H0, motionEvent)) {
                if (V()) {
                    nkc nkcVar = this.J0;
                    float f = (this.k0 / 2.0f) + this.L0;
                    float paddingTop = this.M0 + getPaddingTop();
                    ArrayList arrayList = nkcVar.c;
                    n41 n41Var2 = nkcVar.Y;
                    float x2 = motionEvent.getX() - f;
                    float y3 = motionEvent.getY() - paddingTop;
                    uk1 uk1Var = nkcVar.a;
                    if (motionEvent.getActionMasked() == 0) {
                        float x3 = motionEvent.getX() - f;
                        float y4 = motionEvent.getY() - paddingTop;
                        mkc mkcVar = nkcVar.m;
                        if (mkcVar != null && mkcVar.n && nkcVar.w.contains((int) x3, (int) y4)) {
                            if (!nkcVar.D && nkcVar.C <= 1.001f) {
                                nkcVar.A = nkcVar.g();
                                nkcVar.B = nkcVar.k.F * 0.14f;
                            }
                            ValueAnimator valueAnimator = nkcVar.G;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                nkcVar.G = null;
                            }
                            nkcVar.D = false;
                            nkcVar.x = motionEvent.getPointerId(0);
                            nkcVar.y = motionEvent.getX();
                            nkcVar.z = motionEvent.getY();
                            nkcVar.r0 = false;
                            n41Var2.c(false);
                            if (uk1Var.getParent() != null) {
                                uk1Var.getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            nkcVar.a(3.0f);
                            z9 = true;
                        }
                        float L = gl.L(4.0f);
                        boolean z10 = x2 < L && x2 <= ((float) gl.L(206.0f)) - L && y3 >= L && y3 <= ((float) gl.L(140.0f)) - L;
                        if (nkcVar.q0 != null) {
                            TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = nkcVar.l0;
                            if ((tL_messageActionGramTransfer.comment_encrypted || tL_messageActionGramTransfer.comment_encrypted_preparing) && !nkcVar.m0) {
                                float L2 = x2 - ((gl.L(206.0f) - nkcVar.q0.j()) / 2.0f);
                                float L3 = y3 - gl.L(143.0f);
                                int size = arrayList.size();
                                int i2 = 0;
                                while (i2 < size) {
                                    Object obj = arrayList.get(i2);
                                    i2++;
                                    int i3 = size;
                                    if (((qla) obj).getBounds().contains((int) L2, (int) L3)) {
                                        z8 = true;
                                        break;
                                    }
                                    size = i3;
                                }
                            }
                        }
                        z8 = false;
                        boolean z11 = !z10 || z8;
                        if (motionEvent.getAction() != 0) {
                            nkcVar.r0 = z11;
                            n41Var2.c(z11);
                        } else if (motionEvent.getAction() == 2) {
                            if (nkcVar.r0) {
                                n41Var2.c(z11);
                            }
                        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                            z9 = nkcVar.r0;
                            boolean z12 = motionEvent.getAction() == 1 && z9 && z11;
                            nkcVar.r0 = false;
                            n41Var2.c(false);
                            if (z12 && z8) {
                                TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer2 = nkcVar.l0;
                                if (tL_messageActionGramTransfer2.comment_encrypted_preparing) {
                                    nkcVar.m0 = true;
                                    tgb tgbVar = nkcVar.q0;
                                    tgbVar.p(vu3.m(tL_messageActionGramTransfer2.comment, tgbVar.a.getFontMetricsInt(), false, null, 0));
                                    nkcVar.d.addAll(arrayList);
                                    arrayList.clear();
                                    uk1Var.requestLayout();
                                    uk1Var.invalidate();
                                }
                            }
                            if (z12 && (nk1Var = nkcVar.s0) != null) {
                                nk1Var.run();
                            }
                        }
                        z9 = nkcVar.r0;
                    } else {
                        if (nkcVar.x != -1) {
                            int actionMasked = motionEvent.getActionMasked();
                            if (actionMasked != 1) {
                                if (actionMasked == 2) {
                                    int findPointerIndex = motionEvent.findPointerIndex(nkcVar.x);
                                    if (findPointerIndex < 0) {
                                        nkcVar.j();
                                    } else {
                                        float f2 = 0.013962634f / gl.p;
                                        nkcVar.A = tb4.A(motionEvent.getX(findPointerIndex), nkcVar.y, f2, nkcVar.A);
                                        nkcVar.B = tb4.A(motionEvent.getY(findPointerIndex), nkcVar.z, f2, nkcVar.B);
                                        nkcVar.y = motionEvent.getX(findPointerIndex);
                                        nkcVar.z = motionEvent.getY(findPointerIndex);
                                        uk1Var.invalidate();
                                    }
                                } else if (actionMasked != 3) {
                                    if (actionMasked == 6 && motionEvent.getPointerId(motionEvent.getActionIndex()) == nkcVar.x) {
                                        int i4 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                                        nkcVar.x = motionEvent.getPointerId(i4);
                                        nkcVar.y = motionEvent.getX(i4);
                                        nkcVar.z = motionEvent.getY(i4);
                                    }
                                }
                                z9 = true;
                            }
                            nkcVar.j();
                            z9 = true;
                        }
                        float L4 = gl.L(4.0f);
                        if (x2 < L4) {
                        }
                        if (nkcVar.q0 != null) {
                        }
                        z8 = false;
                        if (z10) {
                        }
                        if (motionEvent.getAction() != 0) {
                        }
                        z9 = nkcVar.r0;
                    }
                    if (z9) {
                        if (this.J0.x != -1) {
                            o();
                            return true;
                        }
                        if (motionEvent.getAction() == 0) {
                            this.B0 = motionEvent.getX();
                            this.C0 = motionEvent.getY();
                            w();
                            return true;
                        }
                        if (motionEvent.getAction() != 2) {
                            o();
                            return true;
                        }
                        float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                        if (Math.abs(motionEvent.getX() - this.B0) > scaledTouchSlop || Math.abs(motionEvent.getY() - this.C0) > scaledTouchSlop) {
                            o();
                            return true;
                        }
                        return true;
                    }
                }
                if (!this.F0.c(motionEvent)) {
                    int action = motionEvent.getAction();
                    ImageReceiver imageReceiver = this.J;
                    int i5 = this.I;
                    RectF rectF = this.p0;
                    View view = this.U1;
                    n41 n41Var3 = this.n;
                    if (action == 0) {
                        if (this.g1 != null) {
                            if ((k27Var.D == 11 || X(k27Var)) && imageReceiver.H(x, y)) {
                                this.a0 = true;
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (k27Var.D == 33 && this.N1.contains(x, y) && (this.y1 == null || !rectF.contains(x, y))) {
                                this.a0 = true;
                                z5 = true;
                            }
                            if (this.K1.i.q == 4 && (((i = k27Var.D) == 21 || i == 22) && this.N1.contains(x, y))) {
                                this.a0 = true;
                                z5 = true;
                            }
                            sk1 sk1Var3 = this.t1;
                            if (sk1Var3 == null || !this.p1) {
                                z6 = z5;
                            } else {
                                RectF rectF2 = gl.P;
                                float f3 = sk1Var3.a;
                                z6 = z5;
                                rectF2.set(f3, sk1Var3.b, sk1Var3.d.getWidth() + f3, this.t1.b + r1.d.getHeight());
                                if (rectF2.contains(x, y)) {
                                    this.F = true;
                                    z6 = true;
                                }
                            }
                            if (!X(k27Var) || this.y1 == null || (((tL_messageActionStarGiftOnchainOffer = this.c2) != null && this.d2 && vp7.l(i5, tL_messageActionStarGiftOnchainOffer.offer_id)) || !(rectF.contains(x, y) || (this.z1 && this.N1.contains(x, y))))) {
                                z7 = true;
                            } else {
                                z7 = true;
                                this.b0 = true;
                                view.setPressed(true);
                                n41Var3.c(true);
                                z6 = true;
                            }
                            if (!z6 && Y()) {
                                this.F = z7;
                                z6 = true;
                            }
                            if (!z6) {
                                k27 k27Var2 = this.Q0;
                                if (apb.g((k27Var2 == null || (message3 = k27Var2.k) == null) ? null : message3.action, TLRPC.TL_messageActionSuggestedPostRefund.class, TLRPC.TL_messageActionSuggestedPostSuccess.class)) {
                                    this.F = true;
                                    z6 = true;
                                }
                            }
                            if (z6) {
                                w();
                            }
                            z2 = z6;
                        }
                        z2 = false;
                    } else {
                        if (motionEvent.getAction() != 2) {
                            o();
                        }
                        if (this.G) {
                            if (motionEvent.getAction() == 2) {
                                if (x < this.b1 || x > this.c1) {
                                    z = false;
                                    this.G = false;
                                    z2 = z;
                                }
                            } else if (motionEvent.getAction() == 1) {
                                View.OnClickListener onClickListener = this.k2;
                                if (onClickListener != null) {
                                    onClickListener.onClick(this);
                                }
                                this.G = false;
                            } else if (motionEvent.getAction() == 3) {
                                this.G = false;
                            }
                            z2 = false;
                        } else if (this.F) {
                            int action2 = motionEvent.getAction();
                            if (action2 == 1) {
                                this.F = false;
                                view.setPressed(false);
                                n41Var3.c(false);
                                if (this.g1 != null && k27Var.C != null && (message2 = k27Var.k) != null && apb.g(message2.action, TLRPC.TL_messageActionTodoAppendTasks.class, TLRPC.TL_messageActionTodoCompletions.class, TLRPC.TL_messageActionSuggestedPostApproval.class, TLRPC.TL_messageActionSuggestedPostRefund.class, TLRPC.TL_messageActionSuggestedPostSuccess.class)) {
                                    this.g1.B(this, this.Q0.N1());
                                } else if (this.p1 && !this.o1 && (sk1Var2 = this.t1) != null) {
                                    int height = sk1Var2.d.getHeight() - this.q1;
                                    this.o1 = true;
                                    rk1 rk1Var = this.g1;
                                    if (rk1Var != null) {
                                        rk1Var.m(this);
                                        if (getParent() instanceof o39) {
                                            ((o39) getParent()).x0(0, gl.L(24.0f) + height, null);
                                            return true;
                                        }
                                    }
                                } else if (this.P0 != null && this.N1.contains(motionEvent.getX(), motionEvent.getY())) {
                                    this.P0.b();
                                    return true;
                                }
                            } else if (action2 == 2) {
                                sk1 sk1Var4 = this.t1;
                                if (sk1Var4 == null || !this.p1) {
                                    this.F = false;
                                } else {
                                    RectF rectF3 = gl.P;
                                    float f4 = sk1Var4.a;
                                    rectF3.set(f4, sk1Var4.b, sk1Var4.d.getWidth() + f4, this.t1.b + r8.d.getHeight());
                                    if (!rectF3.contains(x, y)) {
                                        this.F = false;
                                    }
                                }
                                z = true;
                                z2 = z;
                            } else if (action2 == 3) {
                                this.F = false;
                                n41Var3.c(false);
                            }
                            z = false;
                            z2 = z;
                        } else {
                            if (this.b0) {
                                int action3 = motionEvent.getAction();
                                if (action3 == 1) {
                                    this.a0 = false;
                                    this.b0 = false;
                                    view.setPressed(false);
                                    n41Var3.c(false);
                                    if (this.c2 != null) {
                                        playSoundEffect(0);
                                        rk1 rk1Var2 = this.g1;
                                        d v = rk1Var2 != null ? rk1Var2.v() : LaunchActivity.S();
                                        if (v != null && this.c2 != null && this.Q0 != null) {
                                            final u21 b0 = u21.b0(v);
                                            if (this.c2.buyer) {
                                                final Context context = getContext();
                                                int e1 = this.Q0.e1();
                                                final TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer2 = this.c2;
                                                HashMap hashMap = vp7.a;
                                                final long j = tL_messageActionStarGiftOnchainOffer2.offer_id;
                                                if (vp7.b(j)) {
                                                    TL_stars.cancelStarGiftOnchainOffer cancelstargiftonchainoffer = new TL_stars.cancelStarGiftOnchainOffer();
                                                    cancelstargiftonchainoffer.offer_msg_id = e1;
                                                    final int i6 = this.I;
                                                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i6);
                                                    hc hcVar = new hc((byte) 0);
                                                    final wjb wjbVar = this.h1;
                                                    connectionsManager.sendRequestTyped(cancelstargiftonchainoffer, hcVar, new i8c() { // from class: tp7
                                                        @Override // i8c
                                                        public final void a(Object obj2, Object obj3) {
                                                            TL_stars.TL_payments_starGiftOnchainOfferTx tL_payments_starGiftOnchainOfferTx = (TL_stars.TL_payments_starGiftOnchainOfferTx) obj2;
                                                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                                                            long j2 = j;
                                                            Context context2 = context;
                                                            int i7 = i6;
                                                            wjb wjbVar2 = wjbVar;
                                                            u21 u21Var = b0;
                                                            if (tL_payments_starGiftOnchainOfferTx == null || tL_payments_starGiftOnchainOfferTx.message == null) {
                                                                vp7.g(j2);
                                                                cq7.r(context2, i7, wjbVar2, u21Var, tL_error, null);
                                                                return;
                                                            }
                                                            w05 p = vp7.p(context2, wjbVar2, u21Var, i7, tL_payments_starGiftOnchainOfferTx);
                                                            if (p == null) {
                                                                vp7.g(j2);
                                                                return;
                                                            }
                                                            qn7 qn7Var = new qn7(context2, i7, tL_messageActionStarGiftOnchainOffer2, tL_payments_starGiftOnchainOfferTx, p, wjbVar2, u21Var);
                                                            int i8 = mp7.w2;
                                                            boolean[] zArr = new boolean[1];
                                                            pc7 pc7Var = new pc7((Object) zArr, (Object) new Runnable[]{c.C(i7).k(p, new p((Object) zArr, (Object) pc7Var, (Object) qn7Var, (byte) 22))}, (Object) qn7Var, (byte) 6);
                                                            gl.d3(pc7Var, 5000L);
                                                        }
                                                    });
                                                }
                                            } else {
                                                final Context context2 = getContext();
                                                final int e12 = this.Q0.e1();
                                                final TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer3 = this.c2;
                                                HashMap hashMap2 = vp7.a;
                                                final long j2 = tL_messageActionStarGiftOnchainOffer3.offer_id;
                                                final int i7 = this.I;
                                                if (vp7.k(i7, j2)) {
                                                    vp7.r(b0);
                                                } else if (vp7.b(j2)) {
                                                    TL_stars.acceptStarGiftOnchainOffer acceptstargiftonchainoffer = new TL_stars.acceptStarGiftOnchainOffer();
                                                    acceptstargiftonchainoffer.offer_msg_id = e12;
                                                    ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(i7);
                                                    hc hcVar2 = new hc((byte) 0);
                                                    final wjb wjbVar2 = this.h1;
                                                    connectionsManager2.sendRequestTyped(acceptstargiftonchainoffer, hcVar2, new i8c() { // from class: sp7
                                                        @Override // i8c
                                                        public final void a(Object obj2, Object obj3) {
                                                            TL_stars.TL_payments_starGiftOnchainOfferTx tL_payments_starGiftOnchainOfferTx = (TL_stars.TL_payments_starGiftOnchainOfferTx) obj2;
                                                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                                                            long j3 = j2;
                                                            Context context3 = context2;
                                                            wjb wjbVar3 = wjbVar2;
                                                            int i8 = i7;
                                                            u21 u21Var = b0;
                                                            if (tL_payments_starGiftOnchainOfferTx == null || tL_payments_starGiftOnchainOfferTx.message == null) {
                                                                vp7.g(j3);
                                                                if (tL_error == null || !"STARGIFT_ONCHAIN_SALE_ACTIVE".equals(tL_error.text)) {
                                                                    cq7.r(context3, i8, wjbVar3, u21Var, tL_error, null);
                                                                    return;
                                                                } else {
                                                                    cq7.p(context3, wjbVar3, k96.M0(2131749553, null), null);
                                                                    return;
                                                                }
                                                            }
                                                            w05 p = vp7.p(context3, wjbVar3, u21Var, i8, tL_payments_starGiftOnchainOfferTx);
                                                            if (p == null) {
                                                                vp7.g(j3);
                                                                return;
                                                            }
                                                            TL_stars.TL_payments_starGiftOnchainOfferTxMessage tL_payments_starGiftOnchainOfferTxMessage = tL_payments_starGiftOnchainOfferTx.gasless_message;
                                                            if (tL_payments_starGiftOnchainOfferTxMessage != null) {
                                                                try {
                                                                    w05 b = w05.b(tL_payments_starGiftOnchainOfferTxMessage);
                                                                    List list = b.g;
                                                                    if (list == null) {
                                                                        list = Collections.singletonList(b);
                                                                    }
                                                                    Iterator it = list.iterator();
                                                                    while (true) {
                                                                        if (!it.hasNext()) {
                                                                            break;
                                                                        } else if (((w05) it.next()).e != 3) {
                                                                            b = null;
                                                                            break;
                                                                        }
                                                                    }
                                                                    p.f = b;
                                                                } catch (Exception e) {
                                                                    fa4.g(e, true);
                                                                }
                                                            }
                                                            TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer4 = tL_messageActionStarGiftOnchainOffer3;
                                                            TL_stars.StarGift starGift2 = tL_messageActionStarGiftOnchainOffer4.gift;
                                                            String h = starGift2 != null ? cq7.h(starGift2) : "";
                                                            mp7 mp7Var = new mp7(context3, i8, tL_messageActionStarGiftOnchainOffer4.gift, wjbVar3);
                                                            mp7Var.e1(gl.S2(k96.a0(null, null, 2131749569, h, cq7.k(tL_messageActionStarGiftOnchainOffer4.amount))), k96.M0(2131749568, null));
                                                            String M0 = k96.M0(2131749535, null);
                                                            SpannableStringBuilder l = cq7.l(tL_messageActionStarGiftOnchainOffer4.amount);
                                                            mfb mfbVar = mp7Var.Y1;
                                                            mfbVar.f(M0, l, null, null);
                                                            cq7.c(mp7Var, tL_messageActionStarGiftOnchainOffer4.amount, tL_messageActionStarGiftOnchainOffer4.fee_bps, wjbVar3);
                                                            TL_stars.StarGift starGift3 = tL_messageActionStarGiftOnchainOffer4.gift;
                                                            if (starGift3 != null) {
                                                                cq7.b(mp7Var, starGift3);
                                                                if (tL_messageActionStarGiftOnchainOffer4.gift.availability_total > 0) {
                                                                    mfbVar.f(k96.M0(2131750284, null), k96.H(',', "Gift2QuantityIssued1", tL_messageActionStarGiftOnchainOffer4.gift.availability_issued).concat(k96.H(',', "Gift2QuantityIssued2", tL_messageActionStarGiftOnchainOffer4.gift.availability_total)), null, null);
                                                                }
                                                            }
                                                            TL_wallet.walletOnchainGiftActionOfferAccept walletonchaingiftactionofferaccept = new TL_wallet.walletOnchainGiftActionOfferAccept();
                                                            walletonchaingiftactionofferaccept.offer_address = tL_messageActionStarGiftOnchainOffer4.offer_address;
                                                            walletonchaingiftactionofferaccept.price = tL_messageActionStarGiftOnchainOffer4.amount;
                                                            TL_stars.StarGift starGift4 = tL_messageActionStarGiftOnchainOffer4.gift;
                                                            p.h = walletonchaingiftactionofferaccept;
                                                            p.i = starGift4;
                                                            long j4 = tL_messageActionStarGiftOnchainOffer4.offer_id;
                                                            boolean[] zArr = new boolean[1];
                                                            vp7.j(j4, Long.MAX_VALUE);
                                                            mp7Var.setOnDismissListener(new pp7(zArr, j4, (byte) 1));
                                                            mp7Var.u2.setVisibility(0);
                                                            String M02 = k96.M0(2131749605, null);
                                                            az0 az0Var = new az0(context3, i8, e12, tL_messageActionStarGiftOnchainOffer4, wjbVar3, mp7Var);
                                                            u41 u41Var = mp7Var.b2;
                                                            u41Var.i(M02, false, true);
                                                            u41Var.setOnClickListener(new v16(mp7Var, az0Var, (byte) 9));
                                                            int i9 = tL_messageActionStarGiftOnchainOffer4.expires_at - 10;
                                                            am6 am6Var = new am6((byte) 7);
                                                            mp7Var.m2 = i9;
                                                            mp7Var.n2 = am6Var;
                                                            mp7Var.b1();
                                                            mp7Var.c2.i(k96.M0(2131749572, null), false, true);
                                                            mp7Var.p2 = 2131749615;
                                                            mp7Var.d1(p);
                                                            String str = h;
                                                            mp7Var.c1(new o57((Object) zArr, j4, i8, (Object) str, (byte) 15), new it0(str, j4, i8, tL_messageActionStarGiftOnchainOffer4), new np7(context3, i8, wjbVar3, mp7Var, (byte) 0));
                                                            mp7Var.show();
                                                        }
                                                    });
                                                }
                                            }
                                        }
                                        invalidate();
                                    } else if (this.g1 != null) {
                                        int i8 = k27Var.D;
                                        if (i8 == 37) {
                                            playSoundEffect(0);
                                            d S = LaunchActivity.S();
                                            if (S != null) {
                                                new eo2(S, ((TLRPC.TL_messageActionChangeCommunity) k27Var.k.action).community_id, null, null).show();
                                            }
                                        } else if (i8 == 31) {
                                            playSoundEffect(0);
                                            g0();
                                        } else if (i8 == 25) {
                                            playSoundEffect(0);
                                            if (this.g1 != null) {
                                                gl.c3(new aj1(this, (TLRPC.TL_messageActionGiftCode) this.Q0.k.action, (byte) 1));
                                            }
                                        } else if (i8 == 18) {
                                            playSoundEffect(0);
                                            f0();
                                        } else if (i8 == 30) {
                                            playSoundEffect(0);
                                            g0();
                                        } else {
                                            TLRPC.Message message4 = k27Var.k;
                                            if (message4 != null) {
                                                TLRPC.MessageAction messageAction = message4.action;
                                                if ((messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) && ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction).balance_too_low) {
                                                    playSoundEffect(0);
                                                    TLRPC.Message message5 = this.Q0.k;
                                                    if (message5 != null) {
                                                        TLRPC.SuggestedPost suggestedPost = message5.suggested_post;
                                                        if (suggestedPost != null) {
                                                            u47Var = u47.b(suggestedPost);
                                                        } else {
                                                            TLRPC.MessageAction messageAction2 = message5.action;
                                                            if (messageAction2 instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                                                                u47Var = new u47(nj.m(((TLRPC.TL_messageActionSuggestedPostApproval) messageAction2).price), r1.schedule_date);
                                                            }
                                                        }
                                                        njVar = u47Var.a;
                                                        if (njVar != null && njVar.a == oj.a) {
                                                            new zua(getContext(), this.h1, u47Var.a.a(), 13, mm4.i(i5, k27.B0(this.Q0.k)), null, k27.B0(this.Q0.k)).show();
                                                        }
                                                    }
                                                    u47Var = null;
                                                    njVar = u47Var.a;
                                                    if (njVar != null) {
                                                        new zua(getContext(), this.h1, u47Var.a.a(), 13, mm4.i(i5, k27.B0(this.Q0.k)), null, k27.B0(this.Q0.k)).show();
                                                    }
                                                }
                                            }
                                            if (((wl5) na7.q1(i5).m4.get(k27Var.k.local_id)) == null) {
                                                boolean z13 = this.z1;
                                                rk1 rk1Var3 = this.g1;
                                                if (z13) {
                                                    rk1Var3.r(this);
                                                } else {
                                                    rk1Var3.D(this);
                                                }
                                            }
                                        }
                                    }
                                } else if (action3 != 2) {
                                    if (action3 == 3) {
                                        this.a0 = false;
                                        this.b0 = false;
                                        view.setPressed(false);
                                        n41Var3.c(false);
                                    }
                                } else if (!X(k27Var) || (!rectF.contains(x, y) && !this.N1.contains(x, y))) {
                                    this.b0 = false;
                                    view.setPressed(false);
                                    n41Var3.c(false);
                                }
                            } else if (this.a0) {
                                int action4 = motionEvent.getAction();
                                if (action4 == 1) {
                                    this.a0 = false;
                                    if (!this.p1 || this.o1 || (sk1Var = this.t1) == null) {
                                        int i9 = k27Var.D;
                                        if (i9 == 31) {
                                            g0();
                                        } else if (i9 == 25) {
                                            if (this.g1 != null) {
                                                gl.c3(new aj1(this, (TLRPC.TL_messageActionGiftCode) this.Q0.k.action, (byte) 1));
                                            }
                                        } else if (i9 == 18) {
                                            f0();
                                        } else if (i9 == 30) {
                                            g0();
                                        } else if (i9 == 33) {
                                            k27 k27Var3 = this.Q0;
                                            if (k27Var3 != null && (message = k27Var3.k) != null) {
                                                TLRPC.MessageAction messageAction3 = message.action;
                                                if (messageAction3 instanceof TLRPC.TL_messageActionStarGiftOnchainOffer) {
                                                    starGift = ((TLRPC.TL_messageActionStarGiftOnchainOffer) messageAction3).gift;
                                                } else if (messageAction3 instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer) {
                                                    starGift = ((TLRPC.TL_messageActionStarGiftPurchaseOffer) messageAction3).gift;
                                                }
                                                if ((starGift instanceof TL_stars.TL_starGiftUnique) && !TextUtils.isEmpty(starGift.slug)) {
                                                    playSoundEffect(0);
                                                    vqa vqaVar = new vqa(getContext(), this.I, 0L, this.h1, null);
                                                    vqaVar.m2(starGift.slug, (TL_stars.TL_starGiftUnique) starGift, null);
                                                    vqaVar.show();
                                                }
                                            }
                                        } else if (this.g1 != null) {
                                            if (i9 != 21 || (wl5Var = (wl5) na7.q1(i5).m4.get(k27Var.k.local_id)) == null) {
                                                this.g1.r(this);
                                                playSoundEffect(0);
                                            } else {
                                                wl5Var.a();
                                            }
                                        }
                                    } else {
                                        int height2 = sk1Var.d.getHeight() - this.q1;
                                        this.o1 = true;
                                        rk1 rk1Var4 = this.g1;
                                        if (rk1Var4 != null) {
                                            rk1Var4.m(this);
                                            if (getParent() instanceof o39) {
                                                ((o39) getParent()).x0(0, gl.L(16.0f) + height2, null);
                                                return true;
                                            }
                                        }
                                    }
                                } else if (action4 != 2) {
                                    if (action4 == 3) {
                                        this.a0 = false;
                                    }
                                } else if (Z()) {
                                    if (!this.N1.contains(x, y)) {
                                        this.a0 = false;
                                    }
                                } else if (!imageReceiver.H(x, y)) {
                                    this.a0 = false;
                                }
                            }
                            z2 = false;
                        }
                    }
                    if (!z2 && (motionEvent.getAction() == 0 || ((this.y != null || this.E != null) && motionEvent.getAction() == 1))) {
                        sk1 sk1Var5 = this.t1;
                        if (sk1Var5 != null && !sk1Var5.f.isEmpty() && !this.H) {
                            ArrayList arrayList2 = this.t1.f;
                            int size2 = arrayList2.size();
                            int i10 = 0;
                            while (i10 < size2) {
                                Object obj2 = arrayList2.get(i10);
                                i10++;
                                qla qlaVar = (qla) obj2;
                                Rect bounds = qlaVar.getBounds();
                                sk1 sk1Var6 = this.t1;
                                if (bounds.contains((int) (x - sk1Var6.a), (int) (y - sk1Var6.b))) {
                                    this.y = null;
                                    if (motionEvent.getAction() == 0) {
                                        this.E = qlaVar;
                                        z3 = true;
                                        z2 = true;
                                    } else {
                                        qla qlaVar2 = this.E;
                                        z3 = true;
                                        if (qlaVar == qlaVar2) {
                                            this.H = true;
                                            qlaVar2.q = new nk1(this, (byte) 6);
                                            float sqrt = (float) Math.sqrt(Math.pow(this.t1.d.getHeight(), 2.0d) + Math.pow(this.t1.d.getWidth(), 2.0d));
                                            qla qlaVar3 = this.E;
                                            sk1 sk1Var7 = this.t1;
                                            qlaVar3.j((int) (x - sk1Var7.a), (int) (y - sk1Var7.b), sqrt, false);
                                            invalidate();
                                        }
                                        z2 = true;
                                    }
                                    if (!z2 && (staticLayout = this.N) != null) {
                                        if (x >= this.S) {
                                            float f5 = this.T;
                                            if (y >= f5 && x <= r5 + this.O && y <= r6 + this.P) {
                                                float f6 = y - f5;
                                                float f7 = x - this.U;
                                                if (!z2) {
                                                    int lineForVertical = staticLayout.getLineForVertical((int) f6);
                                                    int offsetForHorizontal = this.N.getOffsetForHorizontal(lineForVertical, f7);
                                                    float lineLeft = this.N.getLineLeft(lineForVertical);
                                                    if (lineLeft <= f7 && this.N.getLineWidth(lineForVertical) + lineLeft >= f7) {
                                                        CharSequence charSequence = k27Var.v;
                                                        if (charSequence instanceof Spannable) {
                                                            URLSpan[] uRLSpanArr = (URLSpan[]) ((Spannable) charSequence).getSpans(offsetForHorizontal, offsetForHorizontal, URLSpan.class);
                                                            if (uRLSpanArr.length != 0) {
                                                                if (motionEvent.getAction() == 0) {
                                                                    this.y = uRLSpanArr[0];
                                                                } else {
                                                                    URLSpan uRLSpan = uRLSpanArr[0];
                                                                    URLSpan uRLSpan2 = this.y;
                                                                    if (uRLSpan == uRLSpan2) {
                                                                        e0(uRLSpan2);
                                                                    }
                                                                }
                                                                z4 = z3;
                                                                z2 = z4;
                                                            } else {
                                                                this.y = null;
                                                            }
                                                            z4 = z2;
                                                            z2 = z4;
                                                        }
                                                    }
                                                    this.y = null;
                                                }
                                            }
                                        }
                                    }
                                    this.y = null;
                                }
                            }
                        }
                        z3 = true;
                        if (!z2) {
                            if (x >= this.S) {
                            }
                        }
                        this.y = null;
                    }
                    if (!z2) {
                        z2 = y(motionEvent);
                    }
                    return !z2 ? super.onTouchEvent(motionEvent) : z2;
                }
                return true;
            }
        }
        return true;
    }

    @Override // hf0
    public final boolean r() {
        rk1 rk1Var = this.g1;
        if (rk1Var != null) {
            return rk1Var.a0(this, this.z0, this.A0);
        }
        return false;
    }

    public void setCustomText(CharSequence charSequence) {
        this.S0 = charSequence;
        if (charSequence != null) {
            m0(false);
        }
    }

    public void setDelegate(rk1 rk1Var) {
        this.g1 = rk1Var;
    }

    public void setInvalidateColors(boolean z) {
        if (this.f1 == z) {
            return;
        }
        this.f1 = z;
        invalidate();
    }

    public void setInvalidateListener(Runnable runnable) {
        this.u2 = runnable;
    }

    public void setInvalidateWithParent(View view) {
        this.w = view;
    }

    public void setInvalidatesParent(boolean z) {
        this.t2 = z;
    }

    public void setMessageObject(k27 k27Var) {
        j0(k27Var, false);
    }

    public void setOnActionClickListener(View.OnClickListener onClickListener) {
        this.k2 = onClickListener;
    }

    public void setOverrideTextMaxWidth(int i) {
        this.l2 = i;
    }

    public void setScrimReaction(Integer num) {
        this.F0.z = num;
    }

    public void setShowTopic(boolean z) {
        if (this.n0 != z) {
            this.n0 = z;
            W();
            invalidate();
        }
    }

    public void setSpoilersSuppressed(boolean z) {
        this.K0 = z;
        nkc nkcVar = this.J0;
        if (nkcVar != null) {
            nkcVar.n(z);
        }
        ArrayList arrayList = this.q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((qla) obj).invalidateSelf();
        }
    }

    public void setWalletSlidingOffset(float f) {
        setTranslationX((getTranslationX() - this.N0) + f);
        this.N0 = f;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.K || drawable == this.r || super.verifyDrawable(drawable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x067e, code lost:
    
        if (r11 == false) goto L290;
     */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x() {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence L0;
        CharSequence charSequence3;
        boolean z;
        CharSequence Z;
        ArrayList<TLRPC.VideoSize> arrayList;
        TLRPC.Photo photo;
        ArrayList<TLRPC.VideoSize> arrayList2;
        CharSequence charSequence4;
        int i;
        String G;
        CharSequence L02;
        CharSequence charSequence5;
        boolean z2;
        long j;
        boolean z3;
        SpannableStringBuilder spannableStringBuilder;
        long j2;
        TL_stars.StarGift starGift;
        String str;
        CharSequence S2;
        TL_stars.StarGift starGift2;
        String str2;
        CharSequence charSequence6;
        String q;
        TLRPC.Peer peer;
        TLRPC.Message message;
        TLRPC.MessageAction messageAction;
        int i2;
        TLRPC.MessageMedia messageMedia;
        k27 k27Var = this.Q0;
        int i3 = this.I;
        if (k27Var == null) {
            charSequence = this.S0;
        } else if (V()) {
            CharSequence q2 = c.C(i3).q(((TLRPC.TL_messageActionGramTransfer) k27Var.k.action).amount, false);
            if (!TextUtils.isEmpty(q2)) {
                charSequence = k96.V(null, null, 2131742711, gm.cloneSpans(k27Var.v), q2);
                if (charSequence == null) {
                    TLRPC.Message message2 = k27Var.k;
                    if (message2 == null || (messageMedia = message2.media) == null || messageMedia.ttl_seconds == 0) {
                        charSequence = gm.cloneSpans(k27Var.v);
                    } else if (messageMedia.photo != null) {
                        charSequence = k96.M0(2131753944, null);
                    } else {
                        TLRPC.Document document = messageMedia.document;
                        charSequence = ((document instanceof TLRPC.TL_documentEmpty) || ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && document == null)) ? messageMedia.voice ? k96.M0(2131753926, null) : messageMedia.round ? k96.M0(2131753937, null) : k96.M0(2131753929, null) : gm.cloneSpans(k27Var.v);
                    }
                }
            }
            charSequence = null;
            if (charSequence == null) {
            }
        } else {
            if (k27Var.g3()) {
                charSequence = k27Var.k.media.user_id != y6c.h(i3).e() ? x2b.e(new Object[0], 2131750861, true) : x2b.e(new Object[]{na7.q1(i3).V1(Long.valueOf(k27.B0(k27Var.k))).first_name}, 2131750860, true);
            } else {
                rk1 rk1Var = this.g1;
                if (rk1Var != null && rk1Var.d() == 0 && k27.D4(k27Var)) {
                    charSequence = mm4.c(na7.q1(i3).g4.f(-k27.B0(k27Var.k), k27.b2(i3, k27Var.k, true, false)), k27Var);
                }
                charSequence = null;
            }
            if (charSequence == null) {
            }
        }
        k27 k27Var2 = this.Q0;
        if (k27Var2 != null && k27Var2.j2) {
            charSequence = "";
        }
        if (k27Var2 != null && (message = k27Var2.k) != null && (messageAction = message.action) != null) {
            if (messageAction instanceof TLRPC.TL_messageActionTodoAppendTasks) {
                i2 = org.telegram.messenger.beta.R.drawable.mini_checklist_add;
            } else if (messageAction instanceof TLRPC.TL_messageActionTodoCompletions) {
                TLRPC.TL_messageActionTodoCompletions tL_messageActionTodoCompletions = (TLRPC.TL_messageActionTodoCompletions) messageAction;
                i2 = tL_messageActionTodoCompletions.incompleted.size() > tL_messageActionTodoCompletions.completed.size() ? org.telegram.messenger.beta.R.drawable.mini_checklist_undone : org.telegram.messenger.beta.R.drawable.mini_checklist_done;
            } else {
                i2 = 0;
            }
            if (i2 != 0) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence);
                spannableStringBuilder2.insert(0, (CharSequence) "i ");
                spannableStringBuilder2.setSpan(new cm2(i2, 0), 0, 1, 33);
                charSequence = spannableStringBuilder2;
            }
        }
        H(this.W, charSequence);
        if (this.P0 != null) {
            this.N = null;
            this.P = 0;
            this.Q = null;
            this.R = 0;
            this.T = 0;
        }
        if (k27Var != null) {
            TLRPC.Message message3 = k27Var.k;
            if (message3 != null) {
                TLRPC.MessageAction messageAction2 = message3.action;
                if ((messageAction2 instanceof TLRPC.TL_messageActionSuggestedPostApproval) && ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction2).balance_too_low) {
                    G(null, null, charSequence, false, !hc2.z(i3, 24, k27.B0(message3)) ? k96.M0(2131744914, null) : null, 11, null, this.j1, false);
                    this.N = null;
                    this.P = 0;
                    this.Q = null;
                    this.R = 0;
                    this.T = 0;
                }
            }
            CharSequence charSequence7 = charSequence;
            if (message3 != null) {
                TLRPC.MessageAction messageAction3 = message3.action;
                if ((messageAction3 instanceof TLRPC.TL_messageActionSuggestedPostApproval) && ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction3).rejected) {
                    G(null, null, charSequence7, false, null, 11, null, this.j1, false);
                    this.N = null;
                    this.P = 0;
                    this.Q = null;
                    this.R = 0;
                    this.T = 0;
                }
            }
            int i4 = k27Var.D;
            if (i4 == 11) {
                float L = gl.L(19.0f) + this.P;
                float f = gl.u;
                this.J.i0((this.W - gl.u) / 2.0f, L, f, f);
            } else if (i4 == 25) {
                D();
            } else {
                long j3 = 0;
                TextPaint textPaint = this.G1;
                if (i4 == 30) {
                    TLRPC.User V1 = na7.q1(i3).V1(Long.valueOf(k27.B0(this.Q0.k)));
                    TLRPC.MessageAction messageAction4 = k27Var.k.action;
                    if (messageAction4 instanceof TLRPC.TL_messageActionGiftStars) {
                        G(k96.H(',', "ActionGiftStarsTitle", (int) ((TLRPC.TL_messageActionGiftStars) messageAction4).stars), null, gl.S2(this.Q0.O3() ? k96.a0(null, null, 2131754628, l7c.l(V1)) : k96.M0(2131754627, null)), false, k96.M0(2131754623, null), 11, null, this.j1, true);
                    } else if ((messageAction4 instanceof TLRPC.TL_messageActionStarGiftUnique) && ((TLRPC.TL_messageActionStarGiftUnique) messageAction4).refunded) {
                        long e = y6c.h(i3).e();
                        TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) k27Var.k.action;
                        if (k27Var.O3() != (!tL_messageActionStarGiftUnique.upgrade)) {
                            e = k27.B0(k27Var.k);
                        }
                        TLRPC.User V12 = na7.q1(i3).V1(Long.valueOf(e));
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                        spannableStringBuilder3.append((CharSequence) k96.M0(tL_messageActionStarGiftUnique.prepaid_upgrade ? 2131750412 : 2131750421, null)).append((CharSequence) " ");
                        if (V12 != null && V12.photo != null) {
                            spannableStringBuilder3.append((CharSequence) "a ");
                            ec0 ec0Var = new ec0(18.0f, i3, this);
                            ec0Var.e(V12);
                            spannableStringBuilder3.setSpan(ec0Var, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                        }
                        spannableStringBuilder3.append((CharSequence) l7c.l(V12));
                        G(spannableStringBuilder3, null, k96.M0(2131750413, null), false, k96.M0(2131754623, null), 12, k96.M0(2131749878, null), this.j1, true);
                    } else if (messageAction4 instanceof TLRPC.TL_messageActionStarGift) {
                        TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction4;
                        long j4 = tL_messageActionStarGift.convert_stars;
                        long e2 = y6c.h(i3).e();
                        TLRPC.Peer peer2 = tL_messageActionStarGift.peer;
                        boolean z4 = peer2 != null && (!tL_messageActionStarGift.prepaid_upgrade || (peer2 instanceof TLRPC.TL_peerChannel));
                        boolean z5 = k27.B0(k27Var.k) == e2 && !z4;
                        long Z0 = k27Var.Z0();
                        if (!tL_messageActionStarGift.prepaid_upgrade && (peer = tL_messageActionStarGift.from_id) != null) {
                            Z0 = cf3.n(peer);
                        }
                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                        TLObject Z1 = na7.q1(i3).Z1(Z0);
                        long n = cf3.n(tL_messageActionStarGift.to_id);
                        TLObject Z12 = na7.q1(i3).Z1(n);
                        if (!tL_messageActionStarGift.can_upgrade || tL_messageActionStarGift.converted) {
                            z2 = z4;
                            j = n;
                        } else {
                            z2 = z4;
                            j = n;
                            if (tL_messageActionStarGift.upgrade_stars > 0 && !tL_messageActionStarGift.upgraded) {
                                z3 = true;
                                if (j == 0 && tL_messageActionStarGift.auction_acquired && Z12 != null) {
                                    spannableStringBuilder4.append((CharSequence) k96.M0(2131750418, null)).append((CharSequence) " ");
                                    if (!(Z12 instanceof TLRPC.User) ? !(!(Z12 instanceof TLRPC.Chat) || ((TLRPC.Chat) Z12).photo == null) : ((TLRPC.User) Z12).photo != null) {
                                        spannableStringBuilder4.append((CharSequence) "a ");
                                        ec0 ec0Var2 = new ec0(18.0f, i3, this);
                                        pb0 pb0Var = ec0Var2.c;
                                        pb0Var.o(Z12);
                                        ec0Var2.b.U(Z12, pb0Var, null);
                                        spannableStringBuilder4.setSpan(ec0Var2, spannableStringBuilder4.length() - 2, spannableStringBuilder4.length() - 1, 33);
                                    }
                                    spannableStringBuilder = spannableStringBuilder4;
                                    spannableStringBuilder.append((CharSequence) cf3.t(Z12));
                                    j2 = j4;
                                } else {
                                    spannableStringBuilder = spannableStringBuilder4;
                                    if (z5) {
                                        j2 = j4;
                                        spannableStringBuilder.append((CharSequence) k96.M0(tL_messageActionStarGift.prepaid_upgrade ? 2131750412 : 2131750421, null)).append((CharSequence) " ");
                                        if (!(Z1 instanceof TLRPC.User) ? !(!(Z1 instanceof TLRPC.Chat) || ((TLRPC.Chat) Z1).photo == null) : ((TLRPC.User) Z1).photo != null) {
                                            spannableStringBuilder.append((CharSequence) "a ");
                                            ec0 ec0Var3 = new ec0(18.0f, i3, this);
                                            pb0 pb0Var2 = ec0Var3.c;
                                            pb0Var2.o(Z1);
                                            ec0Var3.b.U(Z1, pb0Var2, null);
                                            spannableStringBuilder.setSpan(ec0Var3, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 33);
                                        }
                                        spannableStringBuilder.append((CharSequence) cf3.t(Z1));
                                    } else if (tL_messageActionStarGift.gift_num <= 0 || (starGift = tL_messageActionStarGift.gift) == null || (str = starGift.title) == null) {
                                        j2 = j4;
                                        spannableStringBuilder.append((CharSequence) k96.M0(2131750423, null));
                                    } else {
                                        j2 = j4;
                                        spannableStringBuilder.append((CharSequence) str).append((CharSequence) " #").append((CharSequence) k96.E(tL_messageActionStarGift.gift_num, ','));
                                    }
                                }
                                boolean z6 = !((k27Var.O3() || z5) && tL_messageActionStarGift.converted) && tL_messageActionStarGift.convert_stars > 0 && ((int) na7.q1(i3).k4.v3.g(TimeUnit.SECONDS)) - (ConnectionsManager.getInstance(i3).getCurrentTime() - k27Var.k.date) > 0 && !tL_messageActionStarGift.refunded;
                                if (tL_messageActionStarGift.refunded) {
                                    TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGift.message;
                                    if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                                        SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(tL_messageActionStarGift.message.text);
                                        textPaint.setTextSize(gl.L(13.0f));
                                        k27.a(spannableStringBuilder5, tL_messageActionStarGift.message.entities, false, true, true);
                                        S2 = k27.y5(textPaint.getFontMetricsInt(), vu3.m(spannableStringBuilder5, textPaint.getFontMetricsInt(), false, null, 0), tL_messageActionStarGift.message.entities);
                                    } else if (tL_messageActionStarGift.auction_acquired) {
                                        S2 = k96.Z(2131750404, k96.E(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                    } else if (!z2) {
                                        long j5 = j2;
                                        if (z5) {
                                            S2 = (!tL_messageActionStarGift.converted || j5 <= 0) ? tL_messageActionStarGift.can_upgrade ? gl.S2(k96.L0(2131750426)) : gl.S2(k96.L0(2131750427)) : k96.I((int) j5, "Gift2ActionConvertedInfo");
                                        } else if (z3) {
                                            S2 = gl.S2(k27Var.O3() ? k96.Z(2131750414, l7c.l(V1)) : k96.L0(2131750415));
                                        } else {
                                            S2 = k27Var.O3() ? (!z6 || j5 <= 0) ? tL_messageActionStarGift.can_upgrade ? gl.S2(k96.Z(2131750435, l7c.l(V1))) : gl.S2(k96.Z(2131750436, l7c.l(V1))) : gl.S2(k96.J((int) j5, "Gift2ActionOutInfo", l7c.l(V1))) : tL_messageActionStarGift.converted ? k96.I((int) j5, "Gift2ActionConvertedInfo") : tL_messageActionStarGift.saved ? !z6 ? k96.L0(2131750450) : k96.L0(2131750429) : !z6 ? k96.L0(2131750451) : gl.S2(k96.I((int) j5, "Gift2ActionInfo"));
                                        }
                                    } else if (tL_messageActionStarGift.converted) {
                                        S2 = k96.I((int) j2, "Gift2ActionConvertedInfo");
                                    } else {
                                        long j6 = j2;
                                        S2 = (!z6 || j6 <= 0) ? gl.S2(k96.L0(2131750442)) : gl.S2(k96.I((int) j6, "Gift2ActionInfoChannel"));
                                    }
                                } else {
                                    S2 = k96.L0(2131750449);
                                }
                                CharSequence charSequence8 = S2;
                                starGift2 = tL_messageActionStarGift.gift;
                                if (starGift2 == null && starGift2.limited) {
                                    int i5 = starGift2.availability_total;
                                    str2 = k96.Z(2131750119, i5 > 1500 ? gl.o0(i5, 0) : Integer.valueOf(i5));
                                } else {
                                    str2 = null;
                                }
                                CharSequence L03 = k96.L0(2131754623);
                                if (k27Var.O3()) {
                                    charSequence6 = L03;
                                    if (!tL_messageActionStarGift.forceIn) {
                                    }
                                }
                                charSequence6 = L03;
                                charSequence6 = L03;
                                if (!k27Var.O3() && z3) {
                                    SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
                                    spannableStringBuilder6.append("^  ");
                                    cm2 cm2Var = new cm2(org.telegram.messenger.beta.R.drawable.gift_unpack);
                                    cm2Var.I = 0.8f;
                                    cm2Var.J = 0.8f;
                                    spannableStringBuilder6.setSpan(cm2Var, 0, 1, 33);
                                    spannableStringBuilder6.append(k96.L0(2131749869));
                                    charSequence6 = spannableStringBuilder6;
                                }
                                TL_stars.StarGift starGift3 = tL_messageActionStarGift.gift;
                                G(spannableStringBuilder, (starGift3 != null || starGift3.released_by == null || (q = cf3.q(na7.q1(i3).Z1(cf3.n(tL_messageActionStarGift.gift.released_by)))) == null) ? null : vqa.j2(k96.Z(2131750431, "@".concat(q))), charSequence8, false, charSequence6, 11, str2, this.j1, true);
                            }
                        }
                        z3 = false;
                        if (j == 0) {
                        }
                        spannableStringBuilder = spannableStringBuilder4;
                        if (z5) {
                        }
                        if (k27Var.O3()) {
                        }
                        if (tL_messageActionStarGift.refunded) {
                        }
                        CharSequence charSequence82 = S2;
                        starGift2 = tL_messageActionStarGift.gift;
                        if (starGift2 == null) {
                        }
                        str2 = null;
                        CharSequence L032 = k96.L0(2131754623);
                        if (k27Var.O3()) {
                        }
                        charSequence6 = L032;
                        charSequence6 = L032;
                        if (!k27Var.O3()) {
                            SpannableStringBuilder spannableStringBuilder62 = new SpannableStringBuilder();
                            spannableStringBuilder62.append("^  ");
                            cm2 cm2Var2 = new cm2(org.telegram.messenger.beta.R.drawable.gift_unpack);
                            cm2Var2.I = 0.8f;
                            cm2Var2.J = 0.8f;
                            spannableStringBuilder62.setSpan(cm2Var2, 0, 1, 33);
                            spannableStringBuilder62.append(k96.L0(2131749869));
                            charSequence6 = spannableStringBuilder62;
                        }
                        TL_stars.StarGift starGift32 = tL_messageActionStarGift.gift;
                        G(spannableStringBuilder, (starGift32 != null || starGift32.released_by == null || (q = cf3.q(na7.q1(i3).Z1(cf3.n(tL_messageActionStarGift.gift.released_by)))) == null) ? null : vqa.j2(k96.Z(2131750431, "@".concat(q))), charSequence82, false, charSequence6, 11, str2, this.j1, true);
                    } else if (messageAction4 instanceof TLRPC.TL_messageActionGiftTon) {
                        G(k96.L0(2131754621), null, this.Q0.v, false, k96.L0(2131754623), 11, null, this.j1, true);
                        this.N = null;
                        this.P = 0;
                        this.Q = null;
                        this.R = 0;
                        this.T = 0;
                    } else {
                        G(k96.L0(2131754550), null, this.Q0.v, false, k96.L0(2131754623), 11, null, this.j1, true);
                        this.N = null;
                        this.P = 0;
                        this.Q = null;
                        this.R = 0;
                        this.T = 0;
                    }
                } else if (i4 == 33) {
                    TLRPC.MessageAction messageAction5 = message3.action;
                    if (messageAction5 instanceof TLRPC.TL_messageActionStarGiftOnchainOffer) {
                        TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = (TLRPC.TL_messageActionStarGiftOnchainOffer) messageAction5;
                        HashMap hashMap = vp7.a;
                        this.e2 = Math.max(0, tL_messageActionStarGiftOnchainOffer.expires_at - ConnectionsManager.getInstance(i3).getCurrentTime());
                        boolean c0 = c0();
                        this.f2 = c0;
                        if (this.d2) {
                            if (c0) {
                                L02 = k96.L0(2131748587);
                            } else {
                                L02 = k96.L0(tL_messageActionStarGiftOnchainOffer.buyer ? 2131749552 : 2131749578);
                            }
                            charSequence5 = L02;
                        } else {
                            charSequence5 = null;
                        }
                        G(null, null, d0(vp7.d(tL_messageActionStarGiftOnchainOffer), tL_messageActionStarGiftOnchainOffer), false, charSequence5, 11, null, this.j1, this.d2 && !tL_messageActionStarGiftOnchainOffer.buyer);
                        this.N = null;
                        this.P = 0;
                        this.Q = null;
                        this.R = 0;
                        this.T = 0;
                    } else {
                        TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) messageAction5;
                        SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(charSequence7);
                        spannableStringBuilder7.append((CharSequence) "\n\n");
                        if (tL_messageActionStarGiftPurchaseOffer.accepted) {
                            spannableStringBuilder7.append((CharSequence) gl.S2(k96.L0(2131749678)));
                        } else if (tL_messageActionStarGiftPurchaseOffer.declined) {
                            spannableStringBuilder7.append((CharSequence) gl.S2(k96.L0(2131749675)));
                        } else {
                            int max = Math.max(0, tL_messageActionStarGiftPurchaseOffer.expires_at - ConnectionsManager.getInstance(i3).getCurrentTime());
                            if (max == 0) {
                                spannableStringBuilder7.append((CharSequence) gl.S2(k96.L0(2131749677)));
                            } else {
                                int i6 = max / 60;
                                int i7 = max / 3600;
                                if (i7 > 0) {
                                    i = 0;
                                    G = k96.G(i7, "ShortHoursAgo", new Object[0]) + " " + k96.G(i6 % 60, "ShortMinutesAgo", new Object[0]);
                                } else {
                                    i = 0;
                                    G = k96.G(i6, "ShortMinutesAgo", new Object[0]);
                                }
                                if (G.endsWith(".")) {
                                    G = ir2.n(1, i, G);
                                }
                                Object[] objArr = new Object[1];
                                objArr[i] = G;
                                spannableStringBuilder7.append((CharSequence) gl.S2(k96.Z(2131749676, objArr)));
                            }
                        }
                        G(null, null, spannableStringBuilder7, false, null, 11, null, this.j1, false);
                        this.N = null;
                        this.P = 0;
                        this.Q = null;
                        this.R = 0;
                        this.T = 0;
                    }
                } else if (i4 == 34) {
                    G(null, null, charSequence7, false, null, 11, null, this.j1, false);
                    this.N = null;
                    this.P = 0;
                    this.Q = null;
                    this.R = 0;
                    this.T = 0;
                } else if (i4 == 35) {
                    TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) message3.action;
                    SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder();
                    String t = cf3.t(na7.q1(i3).V1(Long.valueOf(k27Var.A0())));
                    if (tL_messageActionNoForwardsRequest.new_value) {
                        spannableStringBuilder8.append(k27Var.N3() ? k96.L0(2131745188) : gl.S2(k96.Z(2131745191, t)));
                    } else {
                        spannableStringBuilder8.append(k27Var.N3() ? k96.L0(2131745177) : gl.S2(k96.Z(2131745180, t)));
                    }
                    if (tL_messageActionNoForwardsRequest.new_value) {
                        spannableStringBuilder8.append((CharSequence) "\n\n");
                        spannableStringBuilder8.append((CharSequence) I(k96.L0(2131745198)));
                        spannableStringBuilder8.append((CharSequence) "\n\n");
                        spannableStringBuilder8.append((CharSequence) I(k96.L0(2131745197)));
                        spannableStringBuilder8.append((CharSequence) "\n\n");
                        spannableStringBuilder8.append((CharSequence) I(k96.L0(2131745196)));
                        spannableStringBuilder8.append((CharSequence) "\n\n");
                        spannableStringBuilder8.append((CharSequence) I(k96.L0(2131745195)));
                    } else {
                        spannableStringBuilder8.append((CharSequence) "\n\n");
                        spannableStringBuilder8.append((CharSequence) I(k96.L0(2131745187)));
                        spannableStringBuilder8.append((CharSequence) "\n\n");
                        spannableStringBuilder8.append((CharSequence) I(k96.L0(2131745186)));
                        spannableStringBuilder8.append((CharSequence) "\n\n");
                        spannableStringBuilder8.append((CharSequence) I(k96.L0(2131745185)));
                        spannableStringBuilder8.append((CharSequence) "\n\n");
                        spannableStringBuilder8.append((CharSequence) I(k96.L0(2131745184)));
                    }
                    G(null, null, spannableStringBuilder8, false, null, 11, null, this.j1, false);
                    this.N = null;
                    this.P = 0;
                    this.Q = null;
                    this.R = 0;
                    this.T = 0;
                } else if (i4 == 31) {
                    TL_stars.StarGift starGift4 = ((TLRPC.TL_chatThemeUniqueGift) ((TLRPC.TL_messageActionSetChatTheme) message3.action).theme).gift;
                    StringBuilder sb = new StringBuilder();
                    sb.append(starGift4.title);
                    sb.append(" #");
                    String m = ls6.m(starGift4.num, ',', sb);
                    long Z02 = k27Var.Z0();
                    G(null, null, gl.S2(y6c.h(i3).e() == Z02 ? k96.Z(2131749422, m) : k96.Z(2131749423, cf3.r(i3, Z02), m)), false, k96.L0(2131749424), 11, null, this.j1, true);
                    this.N = null;
                    this.P = 0;
                    this.Q = null;
                    this.R = 0;
                    this.T = 0;
                } else if (i4 == 37) {
                    TLRPC.TL_messageActionChangeCommunity tL_messageActionChangeCommunity = (TLRPC.TL_messageActionChangeCommunity) message3.action;
                    long n2 = cf3.n(message3.peer_id);
                    boolean U = hc2.U(i3, -n2);
                    boolean z7 = n2 > 0;
                    String r = cf3.r(i3, cf3.n(k27Var.k.from_id));
                    String r2 = cf3.r(i3, -tL_messageActionChangeCommunity.community_id);
                    SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder();
                    spannableStringBuilder9.append((CharSequence) no2.a(k27Var, r2, r, U, z7));
                    G(null, null, spannableStringBuilder9, false, k96.L0(2131749424), 11, null, this.j1, true);
                    this.N = null;
                    this.P = 0;
                    this.Q = null;
                    this.R = 0;
                    this.T = 0;
                } else if (i4 == 18) {
                    TLRPC.MessageAction messageAction6 = message3.action;
                    TLRPC.TL_textWithEntities tL_textWithEntities2 = messageAction6 instanceof TLRPC.TL_messageActionGiftPremium ? ((TLRPC.TL_messageActionGiftPremium) messageAction6).message : messageAction6 instanceof TLRPC.TL_messageActionGiftCode ? ((TLRPC.TL_messageActionGiftCode) messageAction6).message : null;
                    if (tL_textWithEntities2 == null || TextUtils.isEmpty(tL_textWithEntities2.text)) {
                        charSequence4 = null;
                    } else {
                        SpannableStringBuilder spannableStringBuilder10 = new SpannableStringBuilder(tL_textWithEntities2.text);
                        textPaint.setTextSize(gl.L(13.0f));
                        k27.a(spannableStringBuilder10, tL_textWithEntities2.entities, false, true, true);
                        charSequence4 = k27.y5(textPaint.getFontMetricsInt(), vu3.m(spannableStringBuilder10, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities2.entities);
                    }
                    if (charSequence4 == null) {
                        charSequence4 = k96.L0(2131754638);
                    }
                    CharSequence charSequence9 = charSequence4;
                    k27 k27Var3 = this.Q0;
                    CharSequence L04 = k96.L0((k27Var3 == null || !(k27Var3.k.action instanceof TLRPC.TL_messageActionGiftCode) || a0()) ? 2131754631 : 2131749488);
                    TLRPC.MessageAction messageAction7 = k27Var.k.action;
                    int i8 = messageAction7.months;
                    if (i8 >= 1) {
                        G(k96.I(i8, "ActionGiftPremiumTitle2"), null, charSequence9, true, L04, 11, null, this.j1, false);
                    } else {
                        G(k96.I(messageAction7.days, "ActionGiftPremiumTitle2Days"), null, charSequence9, true, L04, 11, null, this.j1, false);
                    }
                } else if (i4 == 21) {
                    TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) message3.action;
                    na7 q1 = na7.q1(i3);
                    if (!k27Var.O3()) {
                        j3 = k27Var.A0();
                    }
                    TLRPC.User V13 = q1.V1(Long.valueOf(j3));
                    boolean z8 = tL_messageActionSuggestProfilePhoto.video || !((photo = tL_messageActionSuggestProfilePhoto.photo) == null || (arrayList2 = photo.video_sizes) == null || arrayList2.isEmpty());
                    if (V13.id == y6c.h(i3).n) {
                        TLRPC.User V14 = na7.q1(i3).V1(Long.valueOf(k27Var.A0()));
                        Z = z8 ? k96.Z(2131754541, V14.first_name) : k96.Z(2131754545, V14.first_name);
                    } else {
                        String str3 = V13.first_name;
                        Z = z8 ? k96.Z(2131754539, str3) : k96.Z(2131754543, str3);
                    }
                    G(null, null, Z, false, (tL_messageActionSuggestProfilePhoto.video || !((arrayList = tL_messageActionSuggestProfilePhoto.photo.video_sizes) == null || arrayList.isEmpty())) ? k96.L0(2131743297) : k96.L0(2131743305), 11, null, this.j1, true);
                    this.N = null;
                    this.P = 0;
                    this.Q = null;
                    this.R = 0;
                    this.T = 0;
                } else if (i4 == 22) {
                    TLRPC.User V15 = na7.q1(i3).V1(Long.valueOf(k27Var.O3() ? 0L : k27Var.A0()));
                    if (k27Var.A0() < 0) {
                        charSequence3 = k27Var.v;
                    } else if (!k27Var.O3() && k27Var.X4() && k27Var.S2()) {
                        charSequence2 = k27Var.v;
                        L0 = k96.L0(2131746093);
                        z = false;
                        G(null, null, charSequence2, false, L0, 11, null, this.j1, z);
                        this.N = null;
                        this.P = 0;
                        this.Q = null;
                        this.R = 0;
                        this.T = 0;
                    } else if (V15 == null || V15.id != y6c.h(i3).n) {
                        charSequence2 = k27Var.v;
                        L0 = k96.L0(2131743296);
                        z = true;
                        G(null, null, charSequence2, false, L0, 11, null, this.j1, z);
                        this.N = null;
                        this.P = 0;
                        this.Q = null;
                        this.R = 0;
                        this.T = 0;
                    } else {
                        charSequence3 = k27Var.v;
                    }
                    charSequence2 = charSequence3;
                    L0 = null;
                    z = true;
                    G(null, null, charSequence2, false, L0, 11, null, this.j1, z);
                    this.N = null;
                    this.P = 0;
                    this.Q = null;
                    this.R = 0;
                    this.T = 0;
                } else if (k27Var.y4()) {
                    TLRPC.User V16 = na7.q1(i3).V1(Long.valueOf(k27Var.k.media.user_id));
                    G(null, null, V16.self ? gl.S2(k96.Z(2131744198, na7.q1(i3).V1(Long.valueOf(k27Var.A0())).first_name)) : gl.S2(k96.Z(2131744374, V16.first_name)), false, k96.L0(2131744375), 11, null, this.j1, true);
                    this.N = null;
                    this.P = 0;
                    this.Q = null;
                    this.R = 0;
                    this.T = 0;
                }
            }
        }
        int L2 = gl.L(12.0f);
        i19 i19Var = this.F0;
        i19Var.b = L2;
        i19Var.o(this.W - gl.L(24.0f), 1);
    }

    public final boolean y(MotionEvent motionEvent) {
        int i;
        int i2;
        iq0 iq0Var;
        k27 k27Var;
        TLRPC.Message message;
        k27 k27Var2;
        TLRPC.Message message2;
        TLRPC.Message message3;
        long j;
        TLObject K0;
        String str;
        Context context;
        boolean z;
        int i3;
        SpannableStringBuilder S2;
        boolean z2;
        ArrayList arrayList = this.Y1;
        if (arrayList.isEmpty()) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        float width = (getWidth() - this.j1) / 2.0f;
        float f = 4.0f;
        float L = gl.L(4.0f) + gl.L(4.0f) + this.T + this.P + this.f;
        float L2 = (this.j1 - gl.L(4.0f)) / 2.0f;
        int action = motionEvent.getAction();
        wjb wjbVar = this.h1;
        if (action == 0) {
            this.r2 = -1;
            int i4 = 0;
            while (i4 < arrayList.size()) {
                wo0 wo0Var = (wo0) arrayList.get(i4);
                float L3 = ((gl.L(f) + L2) * i4) + width;
                RectF rectF = gl.P;
                rectF.set(L3, L, L3 + L2, wo0Var.f + L);
                float f2 = x;
                float f3 = y;
                if (rectF.contains(f2, f3)) {
                    this.r2 = i4;
                    W();
                    if (wo0Var.s == null) {
                        ff0 Y = bkb.Y(bkb.v0(bkb.dd, wjbVar), 6, 6);
                        wo0Var.s = Y;
                        Y.setCallback(this);
                    }
                    wo0Var.s.setHotspot(f2, f3);
                    wo0Var.s.setState(this.q2);
                    wo0Var.b(!wo0Var.m);
                    return true;
                }
                i4++;
                f = 4.0f;
            }
            return false;
        }
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() != 3 || (i = this.r2) == -1) {
                return false;
            }
            wo0 wo0Var2 = (wo0) arrayList.get(i);
            ff0 ff0Var = wo0Var2.s;
            if (ff0Var != null) {
                ff0Var.setState(StateSet.NOTHING);
            }
            wo0Var2.b(false);
            this.r2 = -1;
            W();
            return false;
        }
        if (this.r2 == -1) {
            return false;
        }
        playSoundEffect(0);
        wo0 wo0Var3 = (wo0) arrayList.get(this.r2);
        ff0 ff0Var2 = wo0Var3.s;
        if (ff0Var2 != null) {
            ff0Var2.setState(StateSet.NOTHING);
        }
        wo0Var3.b(false);
        if (this.g1 == null || wo0Var3.m || (iq0Var = wo0Var3.j) == null) {
            i2 = -1;
        } else {
            if (getMessageObject() != null) {
                byte b = iq0Var.a;
                byte b2 = 2;
                if (b == 5) {
                    rk1 rk1Var = this.g1;
                    d v = rk1Var != null ? rk1Var.v() : null;
                    if (v != null && this.Q0 != null) {
                        ij.s0(v, k96.M0(2131749690, null), gl.S2(k96.a0(null, null, 2131749691, cf3.s(k27.B0(this.Q0.k)))), k96.M0(2131749692, null), true, new aj1(this, v, b2));
                    }
                } else if (b == 6) {
                    k27 k27Var3 = this.Q0;
                    if (k27Var3 != null && (message3 = k27Var3.k) != null) {
                        TLRPC.MessageAction messageAction = message3.action;
                        if (messageAction instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer) {
                            TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) messageAction;
                            d Q = LaunchActivity.Q();
                            Context context2 = getContext();
                            long B0 = k27.B0(this.Q0.k);
                            int e1 = this.Q0.e1();
                            int[] iArr = lu4.G1;
                            nj n = nj.n(tL_messageActionStarGiftPurchaseOffer.price);
                            oj ojVar = n.a;
                            int i5 = this.I;
                            oj ojVar2 = oj.a;
                            nj j2 = nj.j((n.b * (ojVar == ojVar2 ? na7.q1(i5).k4.m.f() : na7.q1(i5).k4.n.f())) / 1000, ojVar);
                            TL_stars.StarGift starGift = tL_messageActionStarGiftPurchaseOffer.gift;
                            StringBuilder sb = new StringBuilder();
                            sb.append(starGift.title);
                            sb.append(" #");
                            String m = ls6.m(starGift.num, ',', sb);
                            if (B0 >= 0) {
                                j = 0;
                                K0 = na7.q1(i5).V1(Long.valueOf(B0));
                            } else {
                                j = 0;
                                K0 = na7.q1(i5).K0(Long.valueOf(-B0));
                            }
                            String d = n.d();
                            String d2 = j2.d();
                            if (ojVar == oj.b) {
                                str = m;
                                context = context2;
                                z = true;
                            } else {
                                str = m;
                                context = context2;
                                z = false;
                            }
                            LinearLayout j3 = de9.j(context, 1);
                            j3.addView(new wpa(context, starGift, K0), nme.t(-1, -2, 48, 0, -4, 0, 0));
                            TextView textView = new TextView(context);
                            zkb.X(textView, bkb.i5, wjbVar);
                            textView.setTextSize(1, 16.0f);
                            textView.setText(gl.S2(ojVar == ojVar2 ? k96.a0(null, null, 2131749668, d, cf3.s(B0), str, d2) : k96.a0(null, null, 2131749667, d, cf3.s(B0), str, d2)));
                            j3.addView(textView, nme.t(-1, -2, 48, 24, 4, 24, 4));
                            FrameLayout frameLayout = new FrameLayout(context);
                            frameLayout.setClipChildren(false);
                            frameLayout.setClipToPadding(false);
                            mfb mfbVar = new mfb(context, wjbVar);
                            frameLayout.addView(mfbVar, nme.e(-1, -1, kk7.D1));
                            vqa.Z0(mfbVar, gta.i(starGift.attributes, TL_stars.starGiftAttributeModel.class));
                            vqa.Z0(mfbVar, gta.i(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                            vqa.Z0(mfbVar, gta.i(starGift.attributes, TL_stars.starGiftAttributePattern.class));
                            j3.addView(frameLayout, nme.t(-1, -2, 48, 23, 16, 23, 4));
                            nj k = nj.k(starGift.value_usd_amount / Math.pow(10.0d, ci0.h().g("USD")), ojVar);
                            if (k.c() > 0.0d && starGift.value_usd_amount > j) {
                                if (k.b >= j2.b) {
                                    int round = (int) Math.round((1.0d - (j2.c() / k.c())) * 100.0d);
                                    S2 = gl.S2(k96.a0(null, null, 2131749717, oo1.n(round, "%"), starGift.title));
                                    z2 = round > 10;
                                    i3 = 1;
                                } else {
                                    i3 = 1;
                                    S2 = gl.S2(k96.a0(null, null, 2131749720, oo1.n((int) Math.round(((j2.c() / k.c()) - 1.0d) * 100.0d), "%"), starGift.title));
                                    z2 = false;
                                }
                                TextView textView2 = new TextView(context);
                                textView2.setTextSize(i3, 13.0f);
                                textView2.setGravity(17);
                                textView2.setText(S2);
                                zkb.X(textView2, z2 ? bkb.o7 : bkb.x6, wjbVar);
                                j3.addView(textView2, nme.t(-1, -2, 49, 40, 12, 40, 9));
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
                            alertDialog$Builder.n(j3);
                            alertDialog$Builder.j(jva.U0(k96.a0(null, null, 2131749685, d2), z), new bt3(e1, i5, Q));
                            alertDialog$Builder.g(k96.M0(2131752577, null), null);
                            alertDialog$Builder.a.show();
                        }
                    }
                } else {
                    if (b == 7) {
                        rk1 rk1Var2 = this.g1;
                        d v2 = rk1Var2 != null ? rk1Var2.v() : null;
                        if (v2 != null && (k27Var2 = this.Q0) != null && (message2 = k27Var2.k) != null) {
                            TLRPC.MessageAction messageAction2 = message2.action;
                            if (messageAction2 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                                final TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) messageAction2;
                                final byte b3 = 0;
                                ij.s0(v2, k96.M0(tL_messageActionNoForwardsRequest.prev_value ? 2131745193 : 2131745182, null), k96.M0(tL_messageActionNoForwardsRequest.prev_value ? 2131745194 : 2131745183, null), k96.M0(2131745199, null), false, new Runnable(this) { // from class: ok1
                                    public final /* synthetic */ uk1 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b4 = b3;
                                        TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest2 = tL_messageActionNoForwardsRequest;
                                        uk1 uk1Var = this.b;
                                        switch (b4) {
                                            case 0:
                                                na7.q1(uk1Var.I).j5(k27.B0(uk1Var.Q0.k), uk1Var.Q0.e1(), tL_messageActionNoForwardsRequest2.prev_value, null);
                                                break;
                                            default:
                                                na7.q1(uk1Var.I).j5(k27.B0(uk1Var.Q0.k), uk1Var.Q0.e1(), tL_messageActionNoForwardsRequest2.new_value, null);
                                                break;
                                        }
                                    }
                                });
                            }
                        }
                    } else if (b == 8) {
                        rk1 rk1Var3 = this.g1;
                        d v3 = rk1Var3 != null ? rk1Var3.v() : null;
                        if (v3 != null && (k27Var = this.Q0) != null && (message = k27Var.k) != null) {
                            TLRPC.MessageAction messageAction3 = message.action;
                            if (messageAction3 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                                final TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest2 = (TLRPC.TL_messageActionNoForwardsRequest) messageAction3;
                                final byte b4 = 1;
                                ij.s0(v3, k96.M0(tL_messageActionNoForwardsRequest2.new_value ? 2131745193 : 2131745182, null), k96.M0(tL_messageActionNoForwardsRequest2.new_value ? 2131745192 : 2131745181, null), k96.M0(2131745199, null), false, new Runnable(this) { // from class: ok1
                                    public final /* synthetic */ uk1 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b42 = b4;
                                        TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest22 = tL_messageActionNoForwardsRequest2;
                                        uk1 uk1Var = this.b;
                                        switch (b42) {
                                            case 0:
                                                na7.q1(uk1Var.I).j5(k27.B0(uk1Var.Q0.k), uk1Var.Q0.e1(), tL_messageActionNoForwardsRequest22.prev_value, null);
                                                break;
                                            default:
                                                na7.q1(uk1Var.I).j5(k27.B0(uk1Var.Q0.k), uk1Var.Q0.e1(), tL_messageActionNoForwardsRequest22.new_value, null);
                                                break;
                                        }
                                    }
                                });
                            }
                        }
                    }
                }
            }
            i2 = -1;
        }
        this.r2 = i2;
        W();
        return false;
    }

    public final void z() {
        float f = this.b1;
        RectF rectF = this.d1;
        this.b1 = (int) Math.min(f, rectF.left);
        this.c1 = (int) Math.max(this.c1, rectF.right);
    }

    @Override // sp3
    public final void B(boolean z) {
    }

    @Override // ni5
    public final void b(boolean z, boolean z2) {
    }

    @Override // sp3
    public final void i(long j, long j2) {
    }

    @Override // sp3
    public final void l(long j, long j2) {
    }

    @Override // android.view.View
    public final void invalidate(Rect rect) {
        super.invalidate(rect);
        View view = this.w;
        if (view != null) {
            view.invalidate();
        }
        if (!this.t2 || getParent() == null) {
            return;
        }
        View view2 = (View) getParent();
        if (view2.getParent() != null) {
            view2.invalidate();
            ((View) view2.getParent()).invalidate();
        }
    }

    @Override // android.view.View
    public final void invalidate(int i, int i2, int i3, int i4) {
        super.invalidate(i, i2, i3, i4);
        View view = this.w;
        if (view != null) {
            view.invalidate();
        }
        if (!this.t2 || getParent() == null) {
            return;
        }
        View view2 = (View) getParent();
        if (view2.getParent() != null) {
            view2.invalidate();
            ((View) view2.getParent()).invalidate();
        }
    }

    public uk1(Context context) {
        this(null, context, false);
    }
}
