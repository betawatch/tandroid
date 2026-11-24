// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class wb5 extends FrameLayout implements vlb {
    public final pc0 E;
    public qd2 F;
    public TLRPC.GroupCallParticipant G;
    public TLRPC.User H;
    public TLRPC.Chat I;
    public final Paint J;
    public boolean K;
    public boolean L;
    public int M;
    public j5 N;
    public boolean O;
    public boolean P;
    public byte Q;
    public long R;
    public final rb5 S;
    public final rb5 T;
    public int U;
    public final rb5 V;
    public final rb5 W;
    public final vb5 a;
    public boolean a0;
    public final bf0 b;
    public boolean b0;
    public final lka c;
    public boolean c0;
    public final lka[] d;
    public final Drawable d0;
    public final lka e;
    public AnimatorSet e0;
    public final s09 f;
    public float f0;
    public int g0;
    public final p09 h;
    public final p09 n;
    public final tm r;
    public final tm s;
    public f6 w;
    public Drawable x;
    public final sb5 y;

    /* JADX WARN: Type inference failed for: r3v1, types: [rb5] */
    /* JADX WARN: Type inference failed for: r3v2, types: [rb5] */
    /* JADX WARN: Type inference failed for: r3v4, types: [rb5] */
    /* JADX WARN: Type inference failed for: r3v5, types: [rb5] */
    public wb5(Context context) {
        super(context);
        byte b = 5;
        this.d = new lka[5];
        final byte b2 = 0;
        this.S = new Runnable(this) { // from class: rb5
            public final /* synthetic */ wb5 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b3 = b2;
                int i = 0;
                wb5 wb5Var = this.b;
                switch (b3) {
                    case 0:
                        wb5Var.n.N(0, null);
                        p09 p09Var = wb5Var.h;
                        p09Var.N(0, null);
                        wb5Var.f.setAnimation(p09Var);
                        break;
                    case 1:
                        s09 s09Var = wb5Var.f;
                        p09 p09Var2 = wb5Var.n;
                        int nextInt = Utilities.b.nextInt(100);
                        int i2 = nm7.E1;
                        if (nextInt >= 32) {
                            int i3 = nm7.O3;
                            if (nextInt >= 64) {
                                if (nextInt >= 97) {
                                    i3 = 540;
                                    i2 = nextInt != 98 ? 720 : 420;
                                }
                                i = i3;
                            }
                            i = i2;
                            i2 = i3;
                        }
                        p09Var2.K(i2);
                        p09Var2.N(i2 - 1, wb5Var.S);
                        s09Var.setAnimation(p09Var2);
                        p09Var2.H(i);
                        s09Var.d();
                        break;
                    case 2:
                        wb5Var.a(true, true);
                        break;
                    case 3:
                        wb5Var.b0 = false;
                        wb5Var.a(true, true);
                        wb5Var.a.c(0.0d);
                        wb5Var.a0 = false;
                        break;
                    default:
                        wb5Var.a(true, true);
                        break;
                }
            }
        };
        final byte b3 = 1;
        this.T = new Runnable(this) { // from class: rb5
            public final /* synthetic */ wb5 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b32 = b3;
                int i = 0;
                wb5 wb5Var = this.b;
                switch (b32) {
                    case 0:
                        wb5Var.n.N(0, null);
                        p09 p09Var = wb5Var.h;
                        p09Var.N(0, null);
                        wb5Var.f.setAnimation(p09Var);
                        break;
                    case 1:
                        s09 s09Var = wb5Var.f;
                        p09 p09Var2 = wb5Var.n;
                        int nextInt = Utilities.b.nextInt(100);
                        int i2 = nm7.E1;
                        if (nextInt >= 32) {
                            int i3 = nm7.O3;
                            if (nextInt >= 64) {
                                if (nextInt >= 97) {
                                    i3 = 540;
                                    i2 = nextInt != 98 ? 720 : 420;
                                }
                                i = i3;
                            }
                            i = i2;
                            i2 = i3;
                        }
                        p09Var2.K(i2);
                        p09Var2.N(i2 - 1, wb5Var.S);
                        s09Var.setAnimation(p09Var2);
                        p09Var2.H(i);
                        s09Var.d();
                        break;
                    case 2:
                        wb5Var.a(true, true);
                        break;
                    case 3:
                        wb5Var.b0 = false;
                        wb5Var.a(true, true);
                        wb5Var.a.c(0.0d);
                        wb5Var.a0 = false;
                        break;
                    default:
                        wb5Var.a(true, true);
                        break;
                }
            }
        };
        this.U = cmb.hh;
        final byte b4 = 2;
        this.V = new Runnable(this) { // from class: rb5
            public final /* synthetic */ wb5 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b32 = b4;
                int i = 0;
                wb5 wb5Var = this.b;
                switch (b32) {
                    case 0:
                        wb5Var.n.N(0, null);
                        p09 p09Var = wb5Var.h;
                        p09Var.N(0, null);
                        wb5Var.f.setAnimation(p09Var);
                        break;
                    case 1:
                        s09 s09Var = wb5Var.f;
                        p09 p09Var2 = wb5Var.n;
                        int nextInt = Utilities.b.nextInt(100);
                        int i2 = nm7.E1;
                        if (nextInt >= 32) {
                            int i3 = nm7.O3;
                            if (nextInt >= 64) {
                                if (nextInt >= 97) {
                                    i3 = 540;
                                    i2 = nextInt != 98 ? 720 : 420;
                                }
                                i = i3;
                            }
                            i = i2;
                            i2 = i3;
                        }
                        p09Var2.K(i2);
                        p09Var2.N(i2 - 1, wb5Var.S);
                        s09Var.setAnimation(p09Var2);
                        p09Var2.H(i);
                        s09Var.d();
                        break;
                    case 2:
                        wb5Var.a(true, true);
                        break;
                    case 3:
                        wb5Var.b0 = false;
                        wb5Var.a(true, true);
                        wb5Var.a.c(0.0d);
                        wb5Var.a0 = false;
                        break;
                    default:
                        wb5Var.a(true, true);
                        break;
                }
            }
        };
        this.W = new Runnable(this) { // from class: rb5
            public final /* synthetic */ wb5 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b32 = r2;
                int i = 0;
                wb5 wb5Var = this.b;
                switch (b32) {
                    case 0:
                        wb5Var.n.N(0, null);
                        p09 p09Var = wb5Var.h;
                        p09Var.N(0, null);
                        wb5Var.f.setAnimation(p09Var);
                        break;
                    case 1:
                        s09 s09Var = wb5Var.f;
                        p09 p09Var2 = wb5Var.n;
                        int nextInt = Utilities.b.nextInt(100);
                        int i2 = nm7.E1;
                        if (nextInt >= 32) {
                            int i3 = nm7.O3;
                            if (nextInt >= 64) {
                                if (nextInt >= 97) {
                                    i3 = 540;
                                    i2 = nextInt != 98 ? 720 : 420;
                                }
                                i = i3;
                            }
                            i = i2;
                            i2 = i3;
                        }
                        p09Var2.K(i2);
                        p09Var2.N(i2 - 1, wb5Var.S);
                        s09Var.setAnimation(p09Var2);
                        p09Var2.H(i);
                        s09Var.d();
                        break;
                    case 2:
                        wb5Var.a(true, true);
                        break;
                    case 3:
                        wb5Var.b0 = false;
                        wb5Var.a(true, true);
                        wb5Var.a.c(0.0d);
                        wb5Var.a0 = false;
                        break;
                    default:
                        wb5Var.a(true, true);
                        break;
                }
            }
        };
        final byte b5 = 4;
        new Runnable(this) { // from class: rb5
            public final /* synthetic */ wb5 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b32 = b5;
                int i = 0;
                wb5 wb5Var = this.b;
                switch (b32) {
                    case 0:
                        wb5Var.n.N(0, null);
                        p09 p09Var = wb5Var.h;
                        p09Var.N(0, null);
                        wb5Var.f.setAnimation(p09Var);
                        break;
                    case 1:
                        s09 s09Var = wb5Var.f;
                        p09 p09Var2 = wb5Var.n;
                        int nextInt = Utilities.b.nextInt(100);
                        int i2 = nm7.E1;
                        if (nextInt >= 32) {
                            int i3 = nm7.O3;
                            if (nextInt >= 64) {
                                if (nextInt >= 97) {
                                    i3 = 540;
                                    i2 = nextInt != 98 ? 720 : 420;
                                }
                                i = i3;
                            }
                            i = i2;
                            i2 = i3;
                        }
                        p09Var2.K(i2);
                        p09Var2.N(i2 - 1, wb5Var.S);
                        s09Var.setAnimation(p09Var2);
                        p09Var2.H(i);
                        s09Var.d();
                        break;
                    case 2:
                        wb5Var.a(true, true);
                        break;
                    case 3:
                        wb5Var.b0 = false;
                        wb5Var.a(true, true);
                        wb5Var.a.c(0.0d);
                        wb5Var.a0 = false;
                        break;
                    default:
                        wb5Var.a(true, true);
                        break;
                }
            }
        };
        this.g0 = -1;
        Paint paint = new Paint();
        this.J = paint;
        paint.setColor(cmb.w0(null, cmb.Wg, false));
        this.E = new pc0((ylb) null);
        setClipChildren(false);
        bf0 bf0Var = new bf0(context);
        this.b = bf0Var;
        bf0Var.setRoundRadius(gm.L(24.0f));
        boolean z = jb6.a0;
        addView(bf0Var, qoe.d(46, 46.0f, (z ? 5 : 3) | 48, z ? 0.0f : 11.0f, 6.0f, z ? 11.0f : 0.0f, 0.0f));
        sb5 sb5Var = new sb5(this, context);
        this.y = sb5Var;
        sb5Var.setSize(gm.L(26.0f));
        sb5Var.setProgressColor(-1);
        sb5Var.setNoProgress(false);
        boolean z2 = jb6.a0;
        addView(sb5Var, qoe.d(46, 46.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : 11.0f, 6.0f, z2 ? 11.0f : 0.0f, 0.0f));
        gm.T3(sb5Var, false, 1.0f, true, false);
        lka lkaVar = new lka(context);
        this.c = lkaVar;
        anb.W(lkaVar, cmb.dh, null);
        lkaVar.setTypeface(gm.o());
        lkaVar.setTextSize(16);
        lkaVar.setDrawablePadding(gm.L(6.0f));
        lkaVar.setGravity((jb6.a0 ? 5 : 3) | 48);
        boolean z3 = jb6.a0;
        addView(lkaVar, qoe.d(-1, 20.0f, (z3 ? 5 : 3) | 48, z3 ? 54.0f : 67.0f, 10.0f, z3 ? 67.0f : 54.0f, 0.0f));
        this.r = new tm(gm.L(20.0f), 9, lkaVar, false);
        this.s = new tm(gm.L(20.0f), 9, lkaVar, false);
        Drawable drawable = context.getResources().getDrawable(R.drawable.voice_volume_mini);
        this.d0 = drawable;
        anb.x(this, drawable, cmb.gh, null, PorterDuff.Mode.MULTIPLY);
        int i = 0;
        while (true) {
            lka[] lkaVarArr = this.d;
            if (i >= lkaVarArr.length) {
                break;
            }
            lkaVarArr[i] = new tb5(this, context, i);
            this.d[i].setTextSize(15);
            this.d[i].setGravity((jb6.a0 ? 5 : 3) | 48);
            if (i == 4) {
                this.d[i].setBuildFullLayout(true);
                anb.W(this.d[i], cmb.hh, null);
                View view = this.d[i];
                boolean z4 = jb6.a0;
                addView(view, qoe.d(-1, -2.0f, (z4 ? 5 : 3) | 48, z4 ? 54.0f : 67.0f, 32.0f, z4 ? 67.0f : 54.0f, 0.0f));
            } else {
                if (i == 0) {
                    anb.W(this.d[i], cmb.fh, null);
                    this.d[i].k(jb6.M0(2131748634, null));
                } else if (i == 1) {
                    anb.W(this.d[i], cmb.gh, null);
                    this.d[i].k(jb6.M0(2131745007, null));
                    this.d[i].setDrawablePadding(gm.L(2.0f));
                } else if (i == 2) {
                    anb.W(this.d[i], cmb.ih, null);
                    this.d[i].k(jb6.M0(2131743041, null));
                } else if (i == 3) {
                    anb.W(this.d[i], cmb.fh, null);
                    this.d[i].k(jb6.M0(2131742613, null));
                }
                View view2 = this.d[i];
                boolean z5 = jb6.a0;
                addView(view2, qoe.d(-1, 20.0f, (z5 ? 5 : 3) | 48, z5 ? 54.0f : 67.0f, 32.0f, z5 ? 67.0f : 54.0f, 0.0f));
            }
            i++;
        }
        lka lkaVar2 = new lka(context);
        this.e = lkaVar2;
        lkaVar2.setMaxLines(3);
        lkaVar2.setTextSize(15);
        anb.W(lkaVar2, cmb.hh, null);
        lkaVar2.setVisibility(8);
        addView(lkaVar2, qoe.d(-1, 60.0f, (jb6.a0 ? 5 : 3) | 48, 14.0f, 32.0f, 14.0f, 0.0f));
        p09 p09Var = new p09(R.raw.voice_outlined2, gm.L(34.0f), gm.L(32.0f), true, null);
        this.h = p09Var;
        this.n = new p09(R.raw.hand_1, gm.L(34.0f), gm.L(32.0f), true, null);
        s09 s09Var = new s09(context);
        this.f = s09Var;
        s09Var.setScaleType(ImageView.ScaleType.CENTER);
        s09Var.setAnimation(p09Var);
        fg0 f0 = cmb.f0(cmb.w0(null, this.U, false) & 620756991, 1, -1);
        try {
            RippleDrawable.class.getDeclaredMethod("setForceSoftware", Boolean.TYPE).invoke(f0, Boolean.TRUE);
        } catch (Throwable unused) {
        }
        s09Var.setBackground(f0);
        s09Var.setImportantForAccessibility(2);
        addView(s09Var, qoe.d(48, -1.0f, (jb6.a0 ? (byte) 3 : (byte) 5) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
        s09Var.setOnClickListener(new ca5(this, b));
        this.a = new vb5(gm.L(26.0f), gm.L(29.0f));
        setWillNotDraw(false);
        setFocusable(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:230:0x0121, code lost:
    
        if (r9 == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0132, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0130, code lost:
    
        r7 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x012e, code lost:
    
        if (r9 == false) goto L90;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0242 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02da  */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r19v0, types: [android.view.View, android.widget.FrameLayout, java.lang.Object, wb5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z, boolean z2) {
        int w0;
        byte b;
        byte b2;
        boolean z3;
        boolean c;
        boolean c2;
        AnimatorSet animatorSet;
        ArrayList arrayList;
        int i;
        float L;
        int i2;
        boolean K;
        ?? r11;
        boolean z4;
        boolean z5;
        int w02;
        if (this.F == null) {
            return;
        }
        boolean z6 = true;
        boolean z7 = (c() && this.G.raise_hand_rating == 0) ? false : true;
        s09 s09Var = this.f;
        s09Var.setEnabled(z7);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        TLRPC.GroupCallParticipant groupCallParticipant = this.G;
        boolean z8 = elapsedRealtime - groupCallParticipant.lastVoiceUpdateTime < 500 ? groupCallParticipant.hasVoiceDelayed : groupCallParticipant.hasVoice;
        if (!z2) {
            long uptimeMillis = SystemClock.uptimeMillis() - this.G.lastSpeakTime;
            boolean z9 = uptimeMillis < 500;
            if (!this.b0 || !z9 || z8) {
                this.b0 = z9;
                boolean z10 = this.a0;
                rb5 rb5Var = this.W;
                if (z10) {
                    gm.r(rb5Var);
                    this.a0 = false;
                }
                if (this.b0) {
                    gm.d3(rb5Var, 500 - uptimeMillis);
                    this.a0 = true;
                }
            }
        }
        TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) this.F.d.f(k47.B1(this.G.peer));
        if (groupCallParticipant2 != null) {
            this.G = groupCallParticipant2;
        }
        boolean z11 = this.G.muted_by_you && !c();
        boolean z12 = !c() ? (!this.G.muted || (this.b0 && z8)) && !z11 : VoIPService.getSharedInstance() == null || !VoIPService.getSharedInstance().isMicMute() || (this.b0 && z8);
        if (z12) {
            boolean z13 = this.G.can_self_unmute;
        }
        boolean isEmpty = TextUtils.isEmpty(this.G.about);
        this.P = false;
        rb5 rb5Var2 = this.V;
        gm.r(rb5Var2);
        TLRPC.GroupCallParticipant groupCallParticipant3 = this.G;
        if ((groupCallParticipant3.muted && !this.b0) || z11) {
            if (groupCallParticipant3.can_self_unmute) {
                if (!z11) {
                    w0 = cmb.w0(null, this.U, false);
                    this.P = true;
                    b = !isEmpty ? (byte) 4 : (byte) 0;
                }
            } else if (groupCallParticipant3.raise_hand_rating != 0) {
                z5 = true;
                if (z5) {
                    w02 = cmb.w0(null, cmb.ih, false);
                    if (!z11) {
                    }
                    b2 = 2;
                } else {
                    w02 = cmb.w0(null, cmb.fh, false);
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j = this.G.lastRaiseHandDate;
                    long j2 = elapsedRealtime2 - j;
                    if (j == 0 || j2 > 5000) {
                        if (!z11) {
                        }
                        b2 = 2;
                    } else {
                        gm.d3(rb5Var2, 5000 - j2);
                        b2 = 3;
                    }
                }
                int i3 = w02;
                z3 = z5;
                w0 = i3;
                c = c();
                lka[] lkaVarArr = this.d;
                if (!c) {
                }
                c2 = c();
                lka lkaVar = this.e;
                if (!c2) {
                }
                animatorSet = this.e0;
                if (animatorSet == null) {
                }
                if (z) {
                }
                animatorSet.cancel();
                this.e0 = null;
                if (z) {
                }
                if (!z) {
                }
            }
            z5 = false;
            if (z5) {
            }
            int i32 = w02;
            z3 = z5;
            w0 = i32;
            c = c();
            lka[] lkaVarArr2 = this.d;
            if (!c) {
            }
            c2 = c();
            lka lkaVar2 = this.e;
            if (!c2) {
            }
            animatorSet = this.e0;
            if (animatorSet == null) {
            }
            if (z) {
            }
            animatorSet.cancel();
            this.e0 = null;
            if (z) {
            }
            if (!z) {
            }
        } else {
            if (this.b0 && z8) {
                w0 = cmb.w0(null, cmb.gh, false);
                b2 = 1;
                z3 = false;
                c = c();
                lka[] lkaVarArr22 = this.d;
                if (!c) {
                    anb.W(lkaVarArr22[4], this.U, null);
                }
                c2 = c();
                lka lkaVar22 = this.e;
                if (!c2) {
                    boolean z14 = this.c0;
                    if (isEmpty) {
                        TLRPC.User user = this.H;
                        if (z14) {
                            if (user != null) {
                                lkaVarArr22[4].k(jb6.M0(2131743951, null));
                            } else {
                                lkaVarArr22[4].k(jb6.M0(2131743950, null));
                            }
                            anb.W(lkaVarArr22[4], this.U, null);
                        } else {
                            if (user != null) {
                                lkaVarArr22[4].k(jb6.M0(2131743948, null));
                            } else {
                                lkaVarArr22[4].k(jb6.M0(2131743947, null));
                            }
                            anb.W(lkaVarArr22[4], this.U, null);
                        }
                    } else if (z14) {
                        lkaVarArr22[4].k(jb6.M0(2131743828, null));
                        anb.W(lkaVarArr22[4], cmb.fh, null);
                    } else {
                        lkaVarArr22[4].k(jb6.M0(2131743949, null));
                        anb.W(lkaVarArr22[4], this.U, null);
                    }
                    if (isEmpty) {
                        lkaVar22.l(lkaVarArr22[b2].getText(), false);
                        this.g0 = b2;
                        lkaVar22.setTag(R.id.theme_bind, null);
                        lkaVar22.setTextColor(lkaVarArr22[b2].getTextColor());
                    } else {
                        lkaVar22.l(gm.J2(this.G.about), false);
                        this.g0 = -1;
                        anb.W(lkaVar22, cmb.hh, null);
                    }
                } else if (isEmpty) {
                    lkaVarArr22[4].k("");
                    lkaVar22.l("", false);
                } else {
                    lkaVarArr22[4].k(gm.J2(this.G.about));
                    lkaVar22.l("", false);
                }
                animatorSet = this.e0;
                boolean z15 = animatorSet == null && !(b2 == this.Q && this.M == w0);
                if ((z || z15) && animatorSet != null) {
                    animatorSet.cancel();
                    this.e0 = null;
                }
                if (z || this.M != w0 || z15) {
                    if (!z) {
                        arrayList = new ArrayList();
                        int i4 = this.M;
                        this.M = w0;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new bo(this, i4, w0, z6 ? 1 : 0));
                        arrayList.add(ofFloat);
                        if (b2 != 1) {
                            int H = sd2.H(this.G);
                            int i5 = H / 100;
                            if (i5 != 100) {
                                i = 0;
                                lkaVarArr22[1].setLeftDrawable(this.d0);
                                lka lkaVar3 = lkaVarArr22[1];
                                if (H < 100) {
                                    i5 = 1;
                                }
                                lkaVar3.k(jb6.a0("SpeakingWithVolume", null, 2131745006, Integer.valueOf(i5)));
                            } else {
                                i = 0;
                                lkaVarArr22[1].setLeftDrawable((Drawable) null);
                                lkaVarArr22[1].k(jb6.M0(2131745007, null));
                            }
                        } else {
                            i = 0;
                        }
                        if (!c()) {
                            b(4);
                        } else if (!z || b2 != this.Q || z15) {
                            if (z) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Property property = View.ALPHA;
                                float f = -2.0f;
                                Property property2 = View.TRANSLATION_Y;
                                if (b2 == 0) {
                                    int i6 = i;
                                    while (i6 < lkaVarArr22.length) {
                                        lka lkaVar4 = lkaVarArr22[i6];
                                        float L2 = i6 == b2 ? 0.0f : gm.L(f);
                                        float[] fArr = new float[1];
                                        fArr[i] = L2;
                                        arrayList.add(ObjectAnimator.ofFloat(lkaVar4, (Property<lka, Float>) property2, fArr));
                                        lka lkaVar5 = lkaVarArr22[i6];
                                        float[] fArr2 = new float[1];
                                        fArr2[i] = i6 == b2 ? 1.0f : 0.0f;
                                        arrayList.add(ObjectAnimator.ofFloat(lkaVar5, (Property<lka, Float>) property, fArr2));
                                        i6++;
                                        f = -2.0f;
                                    }
                                } else {
                                    int i7 = i;
                                    while (i7 < lkaVarArr22.length) {
                                        lka lkaVar6 = lkaVarArr22[i7];
                                        if (i7 == b2) {
                                            L = 0.0f;
                                        } else {
                                            L = gm.L(i7 == 0 ? 2.0f : -2.0f);
                                        }
                                        float[] fArr3 = new float[1];
                                        fArr3[i] = L;
                                        arrayList.add(ObjectAnimator.ofFloat(lkaVar6, (Property<lka, Float>) property2, fArr3));
                                        lka lkaVar7 = lkaVarArr22[i7];
                                        float[] fArr4 = new float[1];
                                        fArr4[i] = i7 == b2 ? 1.0f : 0.0f;
                                        arrayList.add(ObjectAnimator.ofFloat(lkaVar7, (Property<lka, Float>) property, fArr4));
                                        i7++;
                                    }
                                }
                            } else {
                                b(b2);
                            }
                            this.Q = b2;
                        }
                        vb5 vb5Var = this.a;
                        vb5Var.i = b2;
                        if (!z) {
                            vb5Var.j = b2 != 1 ? 1.0f : 0.0f;
                        }
                        if (arrayList != null) {
                            AnimatorSet animatorSet2 = this.e0;
                            if (animatorSet2 != null) {
                                animatorSet2.cancel();
                                this.e0 = null;
                            }
                            AnimatorSet animatorSet3 = new AnimatorSet();
                            this.e0 = animatorSet3;
                            animatorSet3.addListener(new oz1(this, b2, (byte) 2));
                            this.e0.playTogether(arrayList);
                            this.e0.setDuration(180L);
                            this.e0.start();
                        }
                        if (!z && this.K == z12 && this.L == z3) {
                            z4 = i;
                        } else {
                            p09 p09Var = this.h;
                            if (z3) {
                                s09Var.setAnimation(p09Var);
                                p09Var.N(i, null);
                                if (!z12) {
                                    i2 = 42;
                                } else if (this.L) {
                                    K = p09Var.K(21);
                                } else {
                                    i2 = 64;
                                }
                                K = p09Var.K(i2);
                            } else {
                                K = p09Var.K(84);
                                if (z) {
                                    p09Var.N(83, this.T);
                                } else {
                                    p09Var.N(i, null);
                                }
                            }
                            if (z) {
                                r11 = 0;
                                p09Var.I(p09Var.f - 1, false, true);
                                s09Var.invalidate();
                            } else {
                                if (K) {
                                    if (b2 == 3) {
                                        p09Var.H(63);
                                    } else if (z12 && this.L && !z3) {
                                        p09Var.H(0);
                                    } else if (z12) {
                                        p09Var.H(43);
                                    } else {
                                        p09Var.H(21);
                                    }
                                }
                                s09Var.d();
                                r11 = 0;
                            }
                            this.K = z12;
                            this.L = z3;
                            z4 = r11;
                        }
                        if (!this.b0) {
                            vb5Var.c(0.0d);
                        }
                        vb5Var.e(this, (this.b0 || this.f0 != 0.0f) ? z4 : true);
                        return;
                    }
                    this.M = w0;
                    s09Var.setColorFilter(new PorterDuffColorFilter(w0, PorterDuff.Mode.SRC_IN));
                    cmb.F1(s09Var.getDrawable(), w0 & 620756991, true);
                }
                arrayList = null;
                if (b2 != 1) {
                }
                if (!c()) {
                }
                vb5 vb5Var2 = this.a;
                vb5Var2.i = b2;
                if (!z) {
                }
                if (arrayList != null) {
                }
                if (!z) {
                }
                p09 p09Var2 = this.h;
                if (z3) {
                }
                if (z) {
                }
                this.K = z12;
                this.L = z3;
                z4 = r11;
                if (!this.b0) {
                }
                vb5Var2.e(this, (this.b0 || this.f0 != 0.0f) ? z4 : true);
                return;
            }
            w0 = cmb.w0(null, this.U, false);
            b = !isEmpty ? (byte) 4 : (byte) 0;
            this.P = true;
        }
        b2 = b;
        z3 = false;
        c = c();
        lka[] lkaVarArr222 = this.d;
        if (!c) {
        }
        c2 = c();
        lka lkaVar222 = this.e;
        if (!c2) {
        }
        animatorSet = this.e0;
        if (animatorSet == null) {
        }
        if (z) {
        }
        animatorSet.cancel();
        this.e0 = null;
        if (z) {
        }
        if (!z) {
        }
    }

    public final void b(int i) {
        lka[] lkaVarArr;
        float L;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            lkaVarArr = this.d;
            if (i3 >= lkaVarArr.length) {
                break;
            }
            lkaVarArr[i3].setImportantForAccessibility(i3 == i ? 1 : 2);
            i3++;
        }
        if (i == 0) {
            while (i2 < lkaVarArr.length) {
                lkaVarArr[i2].setTranslationY(i2 == i ? 0.0f : gm.L(-2.0f));
                lkaVarArr[i2].setAlpha(i2 == i ? 1.0f : 0.0f);
                i2++;
            }
            return;
        }
        while (i2 < lkaVarArr.length) {
            lka lkaVar = lkaVarArr[i2];
            if (i2 == i) {
                L = 0.0f;
            } else {
                L = gm.L(i2 == 0 ? 2.0f : -2.0f);
            }
            lkaVar.setTranslationY(L);
            lkaVarArr[i2].setAlpha(i2 == i ? 1.0f : 0.0f);
            i2++;
        }
    }

    public final boolean c() {
        long j = this.R;
        if (j > 0) {
            TLRPC.User user = this.H;
            return user != null && user.id == j;
        }
        TLRPC.Chat chat = this.I;
        return chat != null && chat.id == (-j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.O) {
            Paint paint = this.J;
            int alpha = paint.getAlpha();
            float f = this.f0;
            if (f != 0.0f) {
                paint.setAlpha((int) ((1.0f - f) * alpha));
            } else {
                paint.setAlpha((int) ((1.0f - this.d[4].getFullAlpha()) * alpha));
            }
            float L = jb6.a0 ? 0.0f : gm.L(68.0f);
            canvas2 = canvas;
            canvas2.drawLine(L, getMeasuredHeight() - 1, getMeasuredWidth() - (jb6.a0 ? gm.L(68.0f) : 0), getMeasuredHeight() - 1, paint);
            paint.setAlpha(alpha);
        } else {
            canvas2 = canvas;
        }
        bf0 bf0Var = this.b;
        int measuredWidth = (bf0Var.getMeasuredWidth() / 2) + bf0Var.getLeft();
        int measuredHeight = (bf0Var.getMeasuredHeight() / 2) + bf0Var.getTop();
        vb5 vb5Var = this.a;
        vb5Var.f();
        if (this.f0 == 0.0f) {
            vb5Var.a(canvas2, measuredWidth, measuredHeight, this);
        }
        bf0Var.setScaleX(vb5Var.b());
        bf0Var.setScaleY(vb5Var.b());
        float b = vb5Var.b();
        sb5 sb5Var = this.y;
        sb5Var.setScaleX(b);
        sb5Var.setScaleY(vb5Var.b());
        super.dispatchDraw(canvas2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(j5 j5Var, TLRPC.GroupCallParticipant groupCallParticipant, qd2 qd2Var, long j, TLRPC.FileLocation fileLocation, boolean z) {
        long c;
        this.F = qd2Var;
        this.N = j5Var;
        this.R = j;
        this.G = groupCallParticipant;
        long B1 = k47.B1(groupCallParticipant.peer);
        j5 j5Var2 = this.N;
        lka lkaVar = this.c;
        bf0 bf0Var = this.b;
        pc0 pc0Var = this.E;
        tm tmVar = this.s;
        if (B1 > 0) {
            TLRPC.User W1 = oc7.r1(j5Var2.a).W1(Long.valueOf(B1));
            this.H = W1;
            this.I = null;
            int i = this.N.a;
            pc0Var.q(W1);
            lkaVar.l(m9c.r(this.H), false);
            c = pg3.c(this.H);
            TLRPC.User user = this.H;
            if (user != null) {
                if (user.verified) {
                    f6 f6Var = this.w;
                    if (f6Var == null) {
                        f6Var = new f6(getContext());
                    }
                    this.w = f6Var;
                    tmVar.g(f6Var, z);
                } else if (pg3.f(user.emoji_status) != 0) {
                    tmVar.j(pg3.f(this.H.emoji_status), z);
                }
                tmVar.k(Integer.valueOf(cmb.w0(null, cmb.Bk, false)));
                lkaVar.i(tmVar);
                ImageReceiver imageReceiver = bf0Var.getImageReceiver();
                int i2 = j5Var.a;
                imageReceiver.d = i2;
                if (fileLocation == null) {
                    this.c0 = true;
                    bf0Var.m(gn5.e(fileLocation), "50_50", pc0Var, null);
                } else {
                    gn5 l = gn5.l(i2, 1, this.H);
                    this.c0 = l != null;
                    bf0Var.m(l, "50_50", pc0Var, this.H);
                }
            }
            TLRPC.User user2 = this.H;
            if (user2 == null || !user2.premium) {
                tmVar.g(null, z);
            } else {
                if (this.x == null) {
                    this.x = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                    this.x = new ub5(gm.L(14.0f), gm.L(14.0f), this.x);
                }
                tmVar.g(this.x, z);
            }
            tmVar.k(Integer.valueOf(cmb.w0(null, cmb.Bk, false)));
            lkaVar.i(tmVar);
            ImageReceiver imageReceiver2 = bf0Var.getImageReceiver();
            int i22 = j5Var.a;
            imageReceiver2.d = i22;
            if (fileLocation == null) {
            }
        } else {
            TLRPC.Chat L0 = oc7.r1(j5Var2.a).L0(Long.valueOf(-B1));
            this.I = L0;
            this.H = null;
            int i3 = this.N.a;
            pc0Var.p(L0);
            c = pg3.c(this.I);
            TLRPC.Chat chat = this.I;
            if (chat != null) {
                lkaVar.l(chat.title, false);
                TLRPC.Chat chat2 = this.I;
                if (chat2.verified) {
                    f6 f6Var2 = this.w;
                    if (f6Var2 == null) {
                        f6Var2 = new f6(getContext());
                    }
                    this.w = f6Var2;
                    tmVar.g(f6Var2, z);
                } else if (pg3.f(chat2.emoji_status) != 0) {
                    tmVar.j(pg3.f(this.I.emoji_status), z);
                } else {
                    tmVar.g(null, z);
                }
                bf0Var.getImageReceiver().d = j5Var.a;
                if (fileLocation != null) {
                    this.c0 = true;
                    bf0Var.m(gn5.e(fileLocation), "50_50", pc0Var, null);
                } else {
                    gn5 a = gn5.a(1, this.I);
                    this.c0 = a != null;
                    bf0Var.m(a, "50_50", pc0Var, this.I);
                }
            }
        }
        tm tmVar2 = this.r;
        if (c != 0) {
            tmVar2.j(c, z);
            lkaVar.setLeftDrawable(tmVar2);
            tmVar2.k(Integer.valueOf(cmb.w0(null, cmb.Bk, false)));
        } else {
            tmVar2.g(null, z);
            lkaVar.setLeftDrawable((Drawable) null);
        }
        a(z, false);
    }

    public final void f(int i, int i2) {
        if (this.U != i) {
            if (this.P) {
                this.M = cmb.w0(null, i, false);
            }
            this.U = i;
        }
        if (this.P) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN);
            s09 s09Var = this.f;
            s09Var.setColorFilter(porterDuffColorFilter);
            cmb.F1(s09Var.getDrawable(), i2 & 620756991, true);
        }
    }

    public bf0 getAvatarImageView() {
        return this.b;
    }

    public vb5 getAvatarWavesDrawable() {
        return this.a;
    }

    public int getClipHeight() {
        lka lkaVar = this.e;
        if (TextUtils.isEmpty(lkaVar.getText()) || !this.c0) {
            lkaVar = this.d[4];
        }
        if (lkaVar.getLineCount() <= 1) {
            return getMeasuredHeight();
        }
        return gm.L(8.0f) + lkaVar.getTop() + lkaVar.getTextHeight();
    }

    public CharSequence getName() {
        return this.c.getText();
    }

    public TLRPC.GroupCallParticipant getParticipant() {
        return this.G;
    }

    public long getPeerId() {
        TLRPC.GroupCallParticipant groupCallParticipant = this.G;
        if (groupCallParticipant == null) {
            return 0L;
        }
        return k47.B1(groupCallParticipant.peer);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false, false);
        tm tmVar = this.s;
        if (tmVar != null) {
            tmVar.a();
        }
        tm tmVar2 = this.r;
        if (tmVar2 != null) {
            tmVar2.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.a0) {
            gm.r(this.W);
            this.a0 = false;
        }
        AnimatorSet animatorSet = this.e0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        tm tmVar = this.s;
        if (tmVar != null) {
            tmVar.b();
        }
        tm tmVar2 = this.r;
        if (tmVar2 != null) {
            tmVar2.b();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo.isEnabled()) {
            TLRPC.GroupCallParticipant groupCallParticipant = this.G;
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, jb6.M0((!groupCallParticipant.muted || groupCallParticipant.can_self_unmute) ? 2131742977 : 2131742914, null)));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(58.0f), TLObject.FLAG_30));
    }

    public void setAboutVisible(boolean z) {
        lka[] lkaVarArr = this.d;
        if (z) {
            lkaVarArr[4].setTranslationY(0.0f);
        } else {
            lkaVarArr[4].setFullAlpha(0.0f);
        }
        invalidate();
    }

    public void setAmplitude(double d) {
        vb5 vb5Var = this.a;
        if (d <= 1.5d) {
            vb5Var.c(0.0d);
            return;
        }
        boolean z = this.a0;
        rb5 rb5Var = this.W;
        if (z) {
            gm.r(rb5Var);
        }
        if (!this.b0) {
            this.b0 = true;
            a(true, false);
        }
        vb5Var.c(d);
        gm.d3(rb5Var, 500L);
        this.a0 = true;
    }

    public void setDrawAvatar(boolean z) {
        bf0 bf0Var = this.b;
        if (bf0Var.getImageReceiver().R0 != z) {
            bf0Var.getImageReceiver().v0(z, true);
        }
    }

    public void setDrawDivider(boolean z) {
        this.O = z;
        invalidate();
    }

    public void setProgressToAvatarPreview(float f) {
        this.f0 = f;
        this.c.setTranslationX((jb6.a0 ? gm.L(53.0f) : -gm.L(53.0f)) * f);
        boolean c = c();
        lka lkaVar = this.e;
        lka[] lkaVarArr = this.d;
        if (!c || f <= 0.0f) {
            lkaVar.setVisibility(8);
            for (int i = 0; i < lkaVarArr.length; i++) {
                if (TextUtils.isEmpty(lkaVarArr[4].getText()) || lkaVarArr[4].getLineCount() <= 1) {
                    lkaVarArr[i].setTranslationX((jb6.a0 ? gm.L(53.0f) : -gm.L(53.0f)) * f);
                    lkaVarArr[i].h(0, 0);
                } else {
                    lkaVarArr[i].h(gm.L(92.0f), jb6.a0 ? gm.L(48.0f) : gm.L(53.0f));
                    lkaVarArr[i].setFullAlpha(f);
                    lkaVarArr[i].setTranslationX(0.0f);
                    lkaVarArr[i].invalidate();
                }
            }
        } else {
            float f2 = 1.0f - f;
            lkaVar.setTranslationX((jb6.a0 ? -gm.L(53.0f) : gm.L(53.0f)) * f2);
            lkaVar.setVisibility(0);
            lkaVar.setAlpha(f);
            lkaVarArr[4].setAlpha(f2);
            lka lkaVar2 = lkaVarArr[4];
            boolean z = jb6.a0;
            int L = gm.L(53.0f);
            if (!z) {
                L = -L;
            }
            lkaVar2.setTranslationX(L * f);
        }
        this.b.setAlpha(f == 0.0f ? 1.0f : 0.0f);
        this.a.e(this, this.b0 && f == 0.0f);
        float f3 = 1.0f - f;
        s09 s09Var = this.f;
        s09Var.setAlpha(f3);
        float f4 = (f3 * 0.4f) + 0.6f;
        s09Var.setScaleX(f4);
        s09Var.setScaleY(f4);
        invalidate();
    }

    @Override // vlb
    public final void updateColors() {
        lka lkaVar;
        lka[] lkaVarArr;
        lka lkaVar2;
        try {
            this.J.setColor(cmb.w0(null, cmb.Wg, false));
            int i = this.g0;
            if (i >= 0 && (lkaVar = this.e) != null && (lkaVarArr = this.d) != null && i < lkaVarArr.length && (lkaVar2 = lkaVarArr[i]) != null) {
                anb.a0(lkaVar2);
                lkaVar.setTextColor(lkaVarArr[this.g0].getTextColor());
            }
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }

    public void d(wb5 wb5Var) {
    }
}
