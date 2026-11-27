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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class zb5 extends FrameLayout implements snb {
    public final rb0 E;
    public vc2 F;
    public TLRPC.GroupCallParticipant G;
    public TLRPC.User H;
    public TLRPC.Chat I;
    public final Paint J;
    public boolean K;
    public boolean L;
    public int M;
    public k5 N;
    public boolean O;
    public boolean P;
    public byte Q;
    public long R;
    public final ub5 S;
    public final ub5 T;
    public int U;
    public final ub5 V;
    public final ub5 W;
    public final yb5 a;
    public boolean a0;
    public final de0 b;
    public boolean b0;
    public final ema c;
    public boolean c0;
    public final ema[] d;
    public final Drawable d0;
    public final ema e;
    public AnimatorSet e0;
    public final e29 f;
    public float f0;
    public int g0;
    public final b29 h;
    public final b29 n;
    public final ul r;
    public final ul s;
    public g6 w;
    public Drawable x;
    public final vb5 y;

    /* JADX WARN: Type inference failed for: r3v1, types: [ub5] */
    /* JADX WARN: Type inference failed for: r3v2, types: [ub5] */
    /* JADX WARN: Type inference failed for: r3v4, types: [ub5] */
    /* JADX WARN: Type inference failed for: r3v5, types: [ub5] */
    public zb5(Context context) {
        super(context);
        this.d = new ema[5];
        final byte b = 0;
        this.S = new Runnable(this) { // from class: ub5
            public final /* synthetic */ zb5 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                int i = 0;
                zb5 zb5Var = this.b;
                switch (b2) {
                    case 0:
                        zb5Var.n.N(0, null);
                        b29 b29Var = zb5Var.h;
                        b29Var.N(0, null);
                        zb5Var.f.setAnimation(b29Var);
                        break;
                    case 1:
                        e29 e29Var = zb5Var.f;
                        b29 b29Var2 = zb5Var.n;
                        int nextInt = Utilities.b.nextInt(100);
                        int i2 = jn7.E1;
                        if (nextInt >= 32) {
                            int i3 = jn7.O3;
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
                        b29Var2.K(i2);
                        b29Var2.N(i2 - 1, zb5Var.S);
                        e29Var.setAnimation(b29Var2);
                        b29Var2.H(i);
                        e29Var.d();
                        break;
                    case 2:
                        zb5Var.a(true, true);
                        break;
                    case 3:
                        zb5Var.b0 = false;
                        zb5Var.a(true, true);
                        zb5Var.a.c(0.0d);
                        zb5Var.a0 = false;
                        break;
                    default:
                        zb5Var.a(true, true);
                        break;
                }
            }
        };
        final byte b2 = 1;
        this.T = new Runnable(this) { // from class: ub5
            public final /* synthetic */ zb5 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b2;
                int i = 0;
                zb5 zb5Var = this.b;
                switch (b22) {
                    case 0:
                        zb5Var.n.N(0, null);
                        b29 b29Var = zb5Var.h;
                        b29Var.N(0, null);
                        zb5Var.f.setAnimation(b29Var);
                        break;
                    case 1:
                        e29 e29Var = zb5Var.f;
                        b29 b29Var2 = zb5Var.n;
                        int nextInt = Utilities.b.nextInt(100);
                        int i2 = jn7.E1;
                        if (nextInt >= 32) {
                            int i3 = jn7.O3;
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
                        b29Var2.K(i2);
                        b29Var2.N(i2 - 1, zb5Var.S);
                        e29Var.setAnimation(b29Var2);
                        b29Var2.H(i);
                        e29Var.d();
                        break;
                    case 2:
                        zb5Var.a(true, true);
                        break;
                    case 3:
                        zb5Var.b0 = false;
                        zb5Var.a(true, true);
                        zb5Var.a.c(0.0d);
                        zb5Var.a0 = false;
                        break;
                    default:
                        zb5Var.a(true, true);
                        break;
                }
            }
        };
        this.U = aob.ih;
        final byte b3 = 2;
        this.V = new Runnable(this) { // from class: ub5
            public final /* synthetic */ zb5 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b3;
                int i = 0;
                zb5 zb5Var = this.b;
                switch (b22) {
                    case 0:
                        zb5Var.n.N(0, null);
                        b29 b29Var = zb5Var.h;
                        b29Var.N(0, null);
                        zb5Var.f.setAnimation(b29Var);
                        break;
                    case 1:
                        e29 e29Var = zb5Var.f;
                        b29 b29Var2 = zb5Var.n;
                        int nextInt = Utilities.b.nextInt(100);
                        int i2 = jn7.E1;
                        if (nextInt >= 32) {
                            int i3 = jn7.O3;
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
                        b29Var2.K(i2);
                        b29Var2.N(i2 - 1, zb5Var.S);
                        e29Var.setAnimation(b29Var2);
                        b29Var2.H(i);
                        e29Var.d();
                        break;
                    case 2:
                        zb5Var.a(true, true);
                        break;
                    case 3:
                        zb5Var.b0 = false;
                        zb5Var.a(true, true);
                        zb5Var.a.c(0.0d);
                        zb5Var.a0 = false;
                        break;
                    default:
                        zb5Var.a(true, true);
                        break;
                }
            }
        };
        final byte b4 = 3;
        this.W = new Runnable(this) { // from class: ub5
            public final /* synthetic */ zb5 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b4;
                int i = 0;
                zb5 zb5Var = this.b;
                switch (b22) {
                    case 0:
                        zb5Var.n.N(0, null);
                        b29 b29Var = zb5Var.h;
                        b29Var.N(0, null);
                        zb5Var.f.setAnimation(b29Var);
                        break;
                    case 1:
                        e29 e29Var = zb5Var.f;
                        b29 b29Var2 = zb5Var.n;
                        int nextInt = Utilities.b.nextInt(100);
                        int i2 = jn7.E1;
                        if (nextInt >= 32) {
                            int i3 = jn7.O3;
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
                        b29Var2.K(i2);
                        b29Var2.N(i2 - 1, zb5Var.S);
                        e29Var.setAnimation(b29Var2);
                        b29Var2.H(i);
                        e29Var.d();
                        break;
                    case 2:
                        zb5Var.a(true, true);
                        break;
                    case 3:
                        zb5Var.b0 = false;
                        zb5Var.a(true, true);
                        zb5Var.a.c(0.0d);
                        zb5Var.a0 = false;
                        break;
                    default:
                        zb5Var.a(true, true);
                        break;
                }
            }
        };
        final byte b5 = 4;
        new Runnable(this) { // from class: ub5
            public final /* synthetic */ zb5 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b5;
                int i = 0;
                zb5 zb5Var = this.b;
                switch (b22) {
                    case 0:
                        zb5Var.n.N(0, null);
                        b29 b29Var = zb5Var.h;
                        b29Var.N(0, null);
                        zb5Var.f.setAnimation(b29Var);
                        break;
                    case 1:
                        e29 e29Var = zb5Var.f;
                        b29 b29Var2 = zb5Var.n;
                        int nextInt = Utilities.b.nextInt(100);
                        int i2 = jn7.E1;
                        if (nextInt >= 32) {
                            int i3 = jn7.O3;
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
                        b29Var2.K(i2);
                        b29Var2.N(i2 - 1, zb5Var.S);
                        e29Var.setAnimation(b29Var2);
                        b29Var2.H(i);
                        e29Var.d();
                        break;
                    case 2:
                        zb5Var.a(true, true);
                        break;
                    case 3:
                        zb5Var.b0 = false;
                        zb5Var.a(true, true);
                        zb5Var.a.c(0.0d);
                        zb5Var.a0 = false;
                        break;
                    default:
                        zb5Var.a(true, true);
                        break;
                }
            }
        };
        this.g0 = -1;
        Paint paint = new Paint();
        this.J = paint;
        paint.setColor(aob.w0(null, aob.Xg, false));
        this.E = new rb0((vnb) null);
        setClipChildren(false);
        de0 de0Var = new de0(context);
        this.b = de0Var;
        de0Var.setRoundRadius(hl.L(24.0f));
        boolean z = ob6.a0;
        addView(de0Var, tre.d(46, 46.0f, (z ? 5 : 3) | 48, z ? 0.0f : 11.0f, 6.0f, z ? 11.0f : 0.0f, 0.0f));
        vb5 vb5Var = new vb5(this, context);
        this.y = vb5Var;
        vb5Var.setSize(hl.L(26.0f));
        vb5Var.setProgressColor(-1);
        vb5Var.setNoProgress(false);
        boolean z2 = ob6.a0;
        addView(vb5Var, tre.d(46, 46.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : 11.0f, 6.0f, z2 ? 11.0f : 0.0f, 0.0f));
        hl.T3(vb5Var, false, 1.0f, true, false);
        ema emaVar = new ema(context);
        this.c = emaVar;
        yob.W(emaVar, aob.eh, null);
        emaVar.setTypeface(hl.o());
        emaVar.setTextSize(16);
        emaVar.setDrawablePadding(hl.L(6.0f));
        emaVar.setGravity((ob6.a0 ? 5 : 3) | 48);
        boolean z3 = ob6.a0;
        addView(emaVar, tre.d(-1, 20.0f, (z3 ? 5 : 3) | 48, z3 ? 54.0f : 67.0f, 10.0f, z3 ? 67.0f : 54.0f, 0.0f));
        this.r = new ul(hl.L(20.0f), 9, emaVar, false);
        this.s = new ul(hl.L(20.0f), 9, emaVar, false);
        Drawable drawable = context.getResources().getDrawable(R.drawable.voice_volume_mini);
        this.d0 = drawable;
        yob.x(this, drawable, aob.hh, null, PorterDuff.Mode.MULTIPLY);
        int i = 0;
        while (true) {
            ema[] emaVarArr = this.d;
            if (i >= emaVarArr.length) {
                break;
            }
            emaVarArr[i] = new wb5(this, context, i);
            this.d[i].setTextSize(15);
            this.d[i].setGravity((ob6.a0 ? 5 : 3) | 48);
            if (i == 4) {
                this.d[i].setBuildFullLayout(true);
                yob.W(this.d[i], aob.ih, null);
                View view = this.d[i];
                boolean z4 = ob6.a0;
                addView(view, tre.d(-1, -2.0f, (z4 ? 5 : 3) | 48, z4 ? 54.0f : 67.0f, 32.0f, z4 ? 67.0f : 54.0f, 0.0f));
            } else {
                if (i == 0) {
                    yob.W(this.d[i], aob.gh, null);
                    this.d[i].k(ob6.M0(2131748631, null));
                } else if (i == 1) {
                    yob.W(this.d[i], aob.hh, null);
                    this.d[i].k(ob6.M0(2131744999, null));
                    this.d[i].setDrawablePadding(hl.L(2.0f));
                } else if (i == 2) {
                    yob.W(this.d[i], aob.jh, null);
                    this.d[i].k(ob6.M0(2131743009, null));
                } else if (i == 3) {
                    yob.W(this.d[i], aob.gh, null);
                    this.d[i].k(ob6.M0(2131742581, null));
                }
                View view2 = this.d[i];
                boolean z5 = ob6.a0;
                addView(view2, tre.d(-1, 20.0f, (z5 ? 5 : 3) | 48, z5 ? 54.0f : 67.0f, 32.0f, z5 ? 67.0f : 54.0f, 0.0f));
            }
            i++;
        }
        ema emaVar2 = new ema(context);
        this.e = emaVar2;
        emaVar2.setMaxLines(3);
        emaVar2.setTextSize(15);
        yob.W(emaVar2, aob.ih, null);
        emaVar2.setVisibility(8);
        addView(emaVar2, tre.d(-1, 60.0f, (ob6.a0 ? 5 : 3) | 48, 14.0f, 32.0f, 14.0f, 0.0f));
        b29 b29Var = new b29(R.raw.voice_outlined2, hl.L(34.0f), hl.L(32.0f), true, null);
        this.h = b29Var;
        this.n = new b29(R.raw.hand_1, hl.L(34.0f), hl.L(32.0f), true, null);
        e29 e29Var = new e29(context);
        this.f = e29Var;
        e29Var.setScaleType(ImageView.ScaleType.CENTER);
        e29Var.setAnimation(b29Var);
        hf0 f0 = aob.f0(aob.w0(null, this.U, false) & 620756991, 1, -1);
        try {
            RippleDrawable.class.getDeclaredMethod("setForceSoftware", Boolean.TYPE).invoke(f0, Boolean.TRUE);
        } catch (Throwable unused) {
        }
        e29Var.setBackground(f0);
        e29Var.setImportantForAccessibility(2);
        addView(e29Var, tre.d(48, -1.0f, (ob6.a0 ? 3 : 5) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
        e29Var.setOnClickListener(new sa5(this, b4));
        this.a = new yb5(hl.L(26.0f), hl.L(29.0f));
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
    /* JADX WARN: Type inference failed for: r19v0, types: [android.view.View, android.widget.FrameLayout, java.lang.Object, zb5] */
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
        e29 e29Var = this.f;
        e29Var.setEnabled(z7);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        TLRPC.GroupCallParticipant groupCallParticipant = this.G;
        boolean z8 = elapsedRealtime - groupCallParticipant.lastVoiceUpdateTime < 500 ? groupCallParticipant.hasVoiceDelayed : groupCallParticipant.hasVoice;
        if (!z2) {
            long uptimeMillis = SystemClock.uptimeMillis() - this.G.lastSpeakTime;
            boolean z9 = uptimeMillis < 500;
            if (!this.b0 || !z9 || z8) {
                this.b0 = z9;
                boolean z10 = this.a0;
                ub5 ub5Var = this.W;
                if (z10) {
                    hl.r(ub5Var);
                    this.a0 = false;
                }
                if (this.b0) {
                    hl.d3(ub5Var, 500 - uptimeMillis);
                    this.a0 = true;
                }
            }
        }
        TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) this.F.d.f(r47.B1(this.G.peer));
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
        ub5 ub5Var2 = this.V;
        hl.r(ub5Var2);
        TLRPC.GroupCallParticipant groupCallParticipant3 = this.G;
        if ((groupCallParticipant3.muted && !this.b0) || z11) {
            if (groupCallParticipant3.can_self_unmute) {
                if (!z11) {
                    w0 = aob.w0(null, this.U, false);
                    this.P = true;
                    b = !isEmpty ? (byte) 4 : (byte) 0;
                }
            } else if (groupCallParticipant3.raise_hand_rating != 0) {
                z5 = true;
                if (z5) {
                    w02 = aob.w0(null, aob.jh, false);
                    if (!z11) {
                    }
                    b2 = 2;
                } else {
                    w02 = aob.w0(null, aob.gh, false);
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j = this.G.lastRaiseHandDate;
                    long j2 = elapsedRealtime2 - j;
                    if (j == 0 || j2 > 5000) {
                        if (!z11) {
                        }
                        b2 = 2;
                    } else {
                        hl.d3(ub5Var2, 5000 - j2);
                        b2 = 3;
                    }
                }
                int i3 = w02;
                z3 = z5;
                w0 = i3;
                c = c();
                ema[] emaVarArr = this.d;
                if (!c) {
                }
                c2 = c();
                ema emaVar = this.e;
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
            ema[] emaVarArr2 = this.d;
            if (!c) {
            }
            c2 = c();
            ema emaVar2 = this.e;
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
                w0 = aob.w0(null, aob.hh, false);
                b2 = 1;
                z3 = false;
                c = c();
                ema[] emaVarArr22 = this.d;
                if (!c) {
                    yob.W(emaVarArr22[4], this.U, null);
                }
                c2 = c();
                ema emaVar22 = this.e;
                if (!c2) {
                    boolean z14 = this.c0;
                    if (isEmpty) {
                        TLRPC.User user = this.H;
                        if (z14) {
                            if (user != null) {
                                emaVarArr22[4].k(ob6.M0(2131743919, null));
                            } else {
                                emaVarArr22[4].k(ob6.M0(2131743918, null));
                            }
                            yob.W(emaVarArr22[4], this.U, null);
                        } else {
                            if (user != null) {
                                emaVarArr22[4].k(ob6.M0(2131743916, null));
                            } else {
                                emaVarArr22[4].k(ob6.M0(2131743915, null));
                            }
                            yob.W(emaVarArr22[4], this.U, null);
                        }
                    } else if (z14) {
                        emaVarArr22[4].k(ob6.M0(2131743796, null));
                        yob.W(emaVarArr22[4], aob.gh, null);
                    } else {
                        emaVarArr22[4].k(ob6.M0(2131743917, null));
                        yob.W(emaVarArr22[4], this.U, null);
                    }
                    if (isEmpty) {
                        emaVar22.l(emaVarArr22[b2].getText(), false);
                        this.g0 = b2;
                        emaVar22.setTag(R.id.theme_bind, null);
                        emaVar22.setTextColor(emaVarArr22[b2].getTextColor());
                    } else {
                        emaVar22.l(hl.J2(this.G.about), false);
                        this.g0 = -1;
                        yob.W(emaVar22, aob.ih, null);
                    }
                } else if (isEmpty) {
                    emaVarArr22[4].k("");
                    emaVar22.l("", false);
                } else {
                    emaVarArr22[4].k(hl.J2(this.G.about));
                    emaVar22.l("", false);
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
                        ofFloat.addUpdateListener(new cn(this, i4, w0, z6 ? 1 : 0));
                        arrayList.add(ofFloat);
                        if (b2 != 1) {
                            int H = xc2.H(this.G);
                            int i5 = H / 100;
                            if (i5 != 100) {
                                i = 0;
                                emaVarArr22[1].setLeftDrawable(this.d0);
                                ema emaVar3 = emaVarArr22[1];
                                if (H < 100) {
                                    i5 = 1;
                                }
                                emaVar3.k(ob6.a0("SpeakingWithVolume", null, 2131744998, Integer.valueOf(i5)));
                            } else {
                                i = 0;
                                emaVarArr22[1].setLeftDrawable((Drawable) null);
                                emaVarArr22[1].k(ob6.M0(2131744999, null));
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
                                    while (i6 < emaVarArr22.length) {
                                        ema emaVar4 = emaVarArr22[i6];
                                        float L2 = i6 == b2 ? 0.0f : hl.L(f);
                                        float[] fArr = new float[1];
                                        fArr[i] = L2;
                                        arrayList.add(ObjectAnimator.ofFloat(emaVar4, (Property<ema, Float>) property2, fArr));
                                        ema emaVar5 = emaVarArr22[i6];
                                        float[] fArr2 = new float[1];
                                        fArr2[i] = i6 == b2 ? 1.0f : 0.0f;
                                        arrayList.add(ObjectAnimator.ofFloat(emaVar5, (Property<ema, Float>) property, fArr2));
                                        i6++;
                                        f = -2.0f;
                                    }
                                } else {
                                    int i7 = i;
                                    while (i7 < emaVarArr22.length) {
                                        ema emaVar6 = emaVarArr22[i7];
                                        if (i7 == b2) {
                                            L = 0.0f;
                                        } else {
                                            L = hl.L(i7 == 0 ? 2.0f : -2.0f);
                                        }
                                        float[] fArr3 = new float[1];
                                        fArr3[i] = L;
                                        arrayList.add(ObjectAnimator.ofFloat(emaVar6, (Property<ema, Float>) property2, fArr3));
                                        ema emaVar7 = emaVarArr22[i7];
                                        float[] fArr4 = new float[1];
                                        fArr4[i] = i7 == b2 ? 1.0f : 0.0f;
                                        arrayList.add(ObjectAnimator.ofFloat(emaVar7, (Property<ema, Float>) property, fArr4));
                                        i7++;
                                    }
                                }
                            } else {
                                b(b2);
                            }
                            this.Q = b2;
                        }
                        yb5 yb5Var = this.a;
                        yb5Var.i = b2;
                        if (!z) {
                            yb5Var.j = b2 != 1 ? 1.0f : 0.0f;
                        }
                        if (arrayList != null) {
                            AnimatorSet animatorSet2 = this.e0;
                            if (animatorSet2 != null) {
                                animatorSet2.cancel();
                                this.e0 = null;
                            }
                            AnimatorSet animatorSet3 = new AnimatorSet();
                            this.e0 = animatorSet3;
                            animatorSet3.addListener(new ry1(this, b2, (byte) 2));
                            this.e0.playTogether(arrayList);
                            this.e0.setDuration(180L);
                            this.e0.start();
                        }
                        if (!z && this.K == z12 && this.L == z3) {
                            z4 = i;
                        } else {
                            b29 b29Var = this.h;
                            if (z3) {
                                e29Var.setAnimation(b29Var);
                                b29Var.N(i, null);
                                if (!z12) {
                                    i2 = 42;
                                } else if (this.L) {
                                    K = b29Var.K(21);
                                } else {
                                    i2 = 64;
                                }
                                K = b29Var.K(i2);
                            } else {
                                K = b29Var.K(84);
                                if (z) {
                                    b29Var.N(83, this.T);
                                } else {
                                    b29Var.N(i, null);
                                }
                            }
                            if (z) {
                                r11 = 0;
                                b29Var.I(b29Var.f - 1, false, true);
                                e29Var.invalidate();
                            } else {
                                if (K) {
                                    if (b2 == 3) {
                                        b29Var.H(63);
                                    } else if (z12 && this.L && !z3) {
                                        b29Var.H(0);
                                    } else if (z12) {
                                        b29Var.H(43);
                                    } else {
                                        b29Var.H(21);
                                    }
                                }
                                e29Var.d();
                                r11 = 0;
                            }
                            this.K = z12;
                            this.L = z3;
                            z4 = r11;
                        }
                        if (!this.b0) {
                            yb5Var.c(0.0d);
                        }
                        yb5Var.e(this, (this.b0 || this.f0 != 0.0f) ? z4 : true);
                        return;
                    }
                    this.M = w0;
                    e29Var.setColorFilter(new PorterDuffColorFilter(w0, PorterDuff.Mode.SRC_IN));
                    aob.F1(e29Var.getDrawable(), w0 & 620756991, true);
                }
                arrayList = null;
                if (b2 != 1) {
                }
                if (!c()) {
                }
                yb5 yb5Var2 = this.a;
                yb5Var2.i = b2;
                if (!z) {
                }
                if (arrayList != null) {
                }
                if (!z) {
                }
                b29 b29Var2 = this.h;
                if (z3) {
                }
                if (z) {
                }
                this.K = z12;
                this.L = z3;
                z4 = r11;
                if (!this.b0) {
                }
                yb5Var2.e(this, (this.b0 || this.f0 != 0.0f) ? z4 : true);
                return;
            }
            w0 = aob.w0(null, this.U, false);
            b = !isEmpty ? (byte) 4 : (byte) 0;
            this.P = true;
        }
        b2 = b;
        z3 = false;
        c = c();
        ema[] emaVarArr222 = this.d;
        if (!c) {
        }
        c2 = c();
        ema emaVar222 = this.e;
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
        ema[] emaVarArr;
        float L;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            emaVarArr = this.d;
            if (i3 >= emaVarArr.length) {
                break;
            }
            emaVarArr[i3].setImportantForAccessibility(i3 == i ? 1 : 2);
            i3++;
        }
        if (i == 0) {
            while (i2 < emaVarArr.length) {
                emaVarArr[i2].setTranslationY(i2 == i ? 0.0f : hl.L(-2.0f));
                emaVarArr[i2].setAlpha(i2 == i ? 1.0f : 0.0f);
                i2++;
            }
            return;
        }
        while (i2 < emaVarArr.length) {
            ema emaVar = emaVarArr[i2];
            if (i2 == i) {
                L = 0.0f;
            } else {
                L = hl.L(i2 == 0 ? 2.0f : -2.0f);
            }
            emaVar.setTranslationY(L);
            emaVarArr[i2].setAlpha(i2 == i ? 1.0f : 0.0f);
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
            float L = ob6.a0 ? 0.0f : hl.L(68.0f);
            canvas2 = canvas;
            canvas2.drawLine(L, getMeasuredHeight() - 1, getMeasuredWidth() - (ob6.a0 ? hl.L(68.0f) : 0), getMeasuredHeight() - 1, paint);
            paint.setAlpha(alpha);
        } else {
            canvas2 = canvas;
        }
        de0 de0Var = this.b;
        int measuredWidth = (de0Var.getMeasuredWidth() / 2) + de0Var.getLeft();
        int measuredHeight = (de0Var.getMeasuredHeight() / 2) + de0Var.getTop();
        yb5 yb5Var = this.a;
        yb5Var.f();
        if (this.f0 == 0.0f) {
            yb5Var.a(canvas2, measuredWidth, measuredHeight, this);
        }
        de0Var.setScaleX(yb5Var.b());
        de0Var.setScaleY(yb5Var.b());
        float b = yb5Var.b();
        vb5 vb5Var = this.y;
        vb5Var.setScaleX(b);
        vb5Var.setScaleY(yb5Var.b());
        super.dispatchDraw(canvas2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(k5 k5Var, TLRPC.GroupCallParticipant groupCallParticipant, vc2 vc2Var, long j, TLRPC.FileLocation fileLocation, boolean z) {
        long c;
        this.F = vc2Var;
        this.N = k5Var;
        this.R = j;
        this.G = groupCallParticipant;
        long B1 = r47.B1(groupCallParticipant.peer);
        k5 k5Var2 = this.N;
        ema emaVar = this.c;
        de0 de0Var = this.b;
        rb0 rb0Var = this.E;
        ul ulVar = this.s;
        if (B1 > 0) {
            TLRPC.User X1 = uc7.s1(k5Var2.a).X1(Long.valueOf(B1));
            this.H = X1;
            this.I = null;
            int i = this.N.a;
            rb0Var.q(X1);
            emaVar.l(lbc.r(this.H), false);
            c = wf3.c(this.H);
            TLRPC.User user = this.H;
            if (user != null) {
                if (user.verified) {
                    g6 g6Var = this.w;
                    if (g6Var == null) {
                        g6Var = new g6(getContext());
                    }
                    this.w = g6Var;
                    ulVar.g(g6Var, z);
                } else if (wf3.f(user.emoji_status) != 0) {
                    ulVar.j(wf3.f(this.H.emoji_status), z);
                }
                ulVar.k(Integer.valueOf(aob.w0(null, aob.Ck, false)));
                emaVar.i(ulVar);
                ImageReceiver imageReceiver = de0Var.getImageReceiver();
                int i2 = k5Var.a;
                imageReceiver.d = i2;
                if (fileLocation == null) {
                    this.c0 = true;
                    de0Var.m(jn5.e(fileLocation), "50_50", rb0Var, null);
                } else {
                    jn5 l = jn5.l(i2, 1, this.H);
                    this.c0 = l != null;
                    de0Var.m(l, "50_50", rb0Var, this.H);
                }
            }
            TLRPC.User user2 = this.H;
            if (user2 == null || !user2.premium) {
                ulVar.g(null, z);
            } else {
                if (this.x == null) {
                    this.x = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                    this.x = new xb5(hl.L(14.0f), hl.L(14.0f), this.x);
                }
                ulVar.g(this.x, z);
            }
            ulVar.k(Integer.valueOf(aob.w0(null, aob.Ck, false)));
            emaVar.i(ulVar);
            ImageReceiver imageReceiver2 = de0Var.getImageReceiver();
            int i22 = k5Var.a;
            imageReceiver2.d = i22;
            if (fileLocation == null) {
            }
        } else {
            TLRPC.Chat M0 = uc7.s1(k5Var2.a).M0(Long.valueOf(-B1));
            this.I = M0;
            this.H = null;
            int i3 = this.N.a;
            rb0Var.p(M0);
            c = wf3.c(this.I);
            TLRPC.Chat chat = this.I;
            if (chat != null) {
                emaVar.l(chat.title, false);
                TLRPC.Chat chat2 = this.I;
                if (chat2.verified) {
                    g6 g6Var2 = this.w;
                    if (g6Var2 == null) {
                        g6Var2 = new g6(getContext());
                    }
                    this.w = g6Var2;
                    ulVar.g(g6Var2, z);
                } else if (wf3.f(chat2.emoji_status) != 0) {
                    ulVar.j(wf3.f(this.I.emoji_status), z);
                } else {
                    ulVar.g(null, z);
                }
                de0Var.getImageReceiver().d = k5Var.a;
                if (fileLocation != null) {
                    this.c0 = true;
                    de0Var.m(jn5.e(fileLocation), "50_50", rb0Var, null);
                } else {
                    jn5 a = jn5.a(1, this.I);
                    this.c0 = a != null;
                    de0Var.m(a, "50_50", rb0Var, this.I);
                }
            }
        }
        ul ulVar2 = this.r;
        if (c != 0) {
            ulVar2.j(c, z);
            emaVar.setLeftDrawable(ulVar2);
            ulVar2.k(Integer.valueOf(aob.w0(null, aob.Ck, false)));
        } else {
            ulVar2.g(null, z);
            emaVar.setLeftDrawable((Drawable) null);
        }
        a(z, false);
    }

    public final void f(int i, int i2) {
        if (this.U != i) {
            if (this.P) {
                this.M = aob.w0(null, i, false);
            }
            this.U = i;
        }
        if (this.P) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN);
            e29 e29Var = this.f;
            e29Var.setColorFilter(porterDuffColorFilter);
            aob.F1(e29Var.getDrawable(), i2 & 620756991, true);
        }
    }

    public de0 getAvatarImageView() {
        return this.b;
    }

    public yb5 getAvatarWavesDrawable() {
        return this.a;
    }

    public int getClipHeight() {
        ema emaVar = this.e;
        if (TextUtils.isEmpty(emaVar.getText()) || !this.c0) {
            emaVar = this.d[4];
        }
        if (emaVar.getLineCount() <= 1) {
            return getMeasuredHeight();
        }
        return hl.L(8.0f) + emaVar.getTop() + emaVar.getTextHeight();
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
        return r47.B1(groupCallParticipant.peer);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false, false);
        ul ulVar = this.s;
        if (ulVar != null) {
            ulVar.a();
        }
        ul ulVar2 = this.r;
        if (ulVar2 != null) {
            ulVar2.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.a0) {
            hl.r(this.W);
            this.a0 = false;
        }
        AnimatorSet animatorSet = this.e0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ul ulVar = this.s;
        if (ulVar != null) {
            ulVar.b();
        }
        ul ulVar2 = this.r;
        if (ulVar2 != null) {
            ulVar2.b();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo.isEnabled()) {
            TLRPC.GroupCallParticipant groupCallParticipant = this.G;
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, ob6.M0((!groupCallParticipant.muted || groupCallParticipant.can_self_unmute) ? 2131742945 : 2131742882, null)));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(58.0f), TLObject.FLAG_30));
    }

    public void setAboutVisible(boolean z) {
        ema[] emaVarArr = this.d;
        if (z) {
            emaVarArr[4].setTranslationY(0.0f);
        } else {
            emaVarArr[4].setFullAlpha(0.0f);
        }
        invalidate();
    }

    public void setAmplitude(double d) {
        yb5 yb5Var = this.a;
        if (d <= 1.5d) {
            yb5Var.c(0.0d);
            return;
        }
        boolean z = this.a0;
        ub5 ub5Var = this.W;
        if (z) {
            hl.r(ub5Var);
        }
        if (!this.b0) {
            this.b0 = true;
            a(true, false);
        }
        yb5Var.c(d);
        hl.d3(ub5Var, 500L);
        this.a0 = true;
    }

    public void setDrawAvatar(boolean z) {
        de0 de0Var = this.b;
        if (de0Var.getImageReceiver().R0 != z) {
            de0Var.getImageReceiver().v0(z, true);
        }
    }

    public void setDrawDivider(boolean z) {
        this.O = z;
        invalidate();
    }

    public void setProgressToAvatarPreview(float f) {
        this.f0 = f;
        this.c.setTranslationX((ob6.a0 ? hl.L(53.0f) : -hl.L(53.0f)) * f);
        boolean c = c();
        ema emaVar = this.e;
        ema[] emaVarArr = this.d;
        if (!c || f <= 0.0f) {
            emaVar.setVisibility(8);
            for (int i = 0; i < emaVarArr.length; i++) {
                if (TextUtils.isEmpty(emaVarArr[4].getText()) || emaVarArr[4].getLineCount() <= 1) {
                    emaVarArr[i].setTranslationX((ob6.a0 ? hl.L(53.0f) : -hl.L(53.0f)) * f);
                    emaVarArr[i].h(0, 0);
                } else {
                    emaVarArr[i].h(hl.L(92.0f), ob6.a0 ? hl.L(48.0f) : hl.L(53.0f));
                    emaVarArr[i].setFullAlpha(f);
                    emaVarArr[i].setTranslationX(0.0f);
                    emaVarArr[i].invalidate();
                }
            }
        } else {
            float f2 = 1.0f - f;
            emaVar.setTranslationX((ob6.a0 ? -hl.L(53.0f) : hl.L(53.0f)) * f2);
            emaVar.setVisibility(0);
            emaVar.setAlpha(f);
            emaVarArr[4].setAlpha(f2);
            ema emaVar2 = emaVarArr[4];
            boolean z = ob6.a0;
            int L = hl.L(53.0f);
            if (!z) {
                L = -L;
            }
            emaVar2.setTranslationX(L * f);
        }
        this.b.setAlpha(f == 0.0f ? 1.0f : 0.0f);
        this.a.e(this, this.b0 && f == 0.0f);
        float f3 = 1.0f - f;
        e29 e29Var = this.f;
        e29Var.setAlpha(f3);
        float f4 = (f3 * 0.4f) + 0.6f;
        e29Var.setScaleX(f4);
        e29Var.setScaleY(f4);
        invalidate();
    }

    @Override // snb
    public final void updateColors() {
        ema emaVar;
        ema[] emaVarArr;
        ema emaVar2;
        try {
            this.J.setColor(aob.w0(null, aob.Xg, false));
            int i = this.g0;
            if (i >= 0 && (emaVar = this.e) != null && (emaVarArr = this.d) != null && i < emaVarArr.length && (emaVar2 = emaVarArr[i]) != null) {
                yob.a0(emaVar2);
                emaVar.setTextColor(emaVarArr[this.g0].getTextColor());
            }
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }

    public void d(zb5 zb5Var) {
    }
}
