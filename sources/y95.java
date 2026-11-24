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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class y95 extends FrameLayout implements tjb {
    public final pb0 E;
    public fc2 F;
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
    public final t95 S;
    public final t95 T;
    public int U;
    public final t95 V;
    public final t95 W;
    public final x95 a;
    public boolean a0;
    public final be0 b;
    public boolean b0;
    public final jia c;
    public boolean c0;
    public final jia[] d;
    public final Drawable d0;
    public final jia e;
    public AnimatorSet e0;
    public final ry8 f;
    public float f0;
    public int g0;
    public final oy8 h;
    public final oy8 n;
    public final tl r;
    public final tl s;
    public f6 w;
    public Drawable x;
    public final u95 y;

    /* JADX WARN: Type inference failed for: r3v1, types: [t95] */
    /* JADX WARN: Type inference failed for: r3v2, types: [t95] */
    /* JADX WARN: Type inference failed for: r3v4, types: [t95] */
    /* JADX WARN: Type inference failed for: r3v5, types: [t95] */
    public y95(Context context) {
        super(context);
        this.d = new jia[5];
        final byte b = 0;
        this.S = new Runnable(this) { // from class: t95
            public final /* synthetic */ y95 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                int i = 0;
                y95 y95Var = this.b;
                switch (b2) {
                    case 0:
                        y95Var.n.N(0, null);
                        oy8 oy8Var = y95Var.h;
                        oy8Var.N(0, null);
                        y95Var.f.setAnimation(oy8Var);
                        break;
                    case 1:
                        ry8 ry8Var = y95Var.f;
                        oy8 oy8Var2 = y95Var.n;
                        int nextInt = Utilities.b.nextInt(100);
                        int i2 = 120;
                        if (nextInt >= 32) {
                            int i3 = kk7.O3;
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
                        oy8Var2.K(i2);
                        oy8Var2.N(i2 - 1, y95Var.S);
                        ry8Var.setAnimation(oy8Var2);
                        oy8Var2.H(i);
                        ry8Var.d();
                        break;
                    case 2:
                        y95Var.a(true, true);
                        break;
                    case 3:
                        y95Var.b0 = false;
                        y95Var.a(true, true);
                        y95Var.a.c(0.0d);
                        y95Var.a0 = false;
                        break;
                    default:
                        y95Var.a(true, true);
                        break;
                }
            }
        };
        final byte b2 = 1;
        this.T = new Runnable(this) { // from class: t95
            public final /* synthetic */ y95 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b2;
                int i = 0;
                y95 y95Var = this.b;
                switch (b22) {
                    case 0:
                        y95Var.n.N(0, null);
                        oy8 oy8Var = y95Var.h;
                        oy8Var.N(0, null);
                        y95Var.f.setAnimation(oy8Var);
                        break;
                    case 1:
                        ry8 ry8Var = y95Var.f;
                        oy8 oy8Var2 = y95Var.n;
                        int nextInt = Utilities.b.nextInt(100);
                        int i2 = 120;
                        if (nextInt >= 32) {
                            int i3 = kk7.O3;
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
                        oy8Var2.K(i2);
                        oy8Var2.N(i2 - 1, y95Var.S);
                        ry8Var.setAnimation(oy8Var2);
                        oy8Var2.H(i);
                        ry8Var.d();
                        break;
                    case 2:
                        y95Var.a(true, true);
                        break;
                    case 3:
                        y95Var.b0 = false;
                        y95Var.a(true, true);
                        y95Var.a.c(0.0d);
                        y95Var.a0 = false;
                        break;
                    default:
                        y95Var.a(true, true);
                        break;
                }
            }
        };
        this.U = bkb.hh;
        final byte b3 = 2;
        this.V = new Runnable(this) { // from class: t95
            public final /* synthetic */ y95 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b3;
                int i = 0;
                y95 y95Var = this.b;
                switch (b22) {
                    case 0:
                        y95Var.n.N(0, null);
                        oy8 oy8Var = y95Var.h;
                        oy8Var.N(0, null);
                        y95Var.f.setAnimation(oy8Var);
                        break;
                    case 1:
                        ry8 ry8Var = y95Var.f;
                        oy8 oy8Var2 = y95Var.n;
                        int nextInt = Utilities.b.nextInt(100);
                        int i2 = 120;
                        if (nextInt >= 32) {
                            int i3 = kk7.O3;
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
                        oy8Var2.K(i2);
                        oy8Var2.N(i2 - 1, y95Var.S);
                        ry8Var.setAnimation(oy8Var2);
                        oy8Var2.H(i);
                        ry8Var.d();
                        break;
                    case 2:
                        y95Var.a(true, true);
                        break;
                    case 3:
                        y95Var.b0 = false;
                        y95Var.a(true, true);
                        y95Var.a.c(0.0d);
                        y95Var.a0 = false;
                        break;
                    default:
                        y95Var.a(true, true);
                        break;
                }
            }
        };
        final byte b4 = 3;
        this.W = new Runnable(this) { // from class: t95
            public final /* synthetic */ y95 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b4;
                int i = 0;
                y95 y95Var = this.b;
                switch (b22) {
                    case 0:
                        y95Var.n.N(0, null);
                        oy8 oy8Var = y95Var.h;
                        oy8Var.N(0, null);
                        y95Var.f.setAnimation(oy8Var);
                        break;
                    case 1:
                        ry8 ry8Var = y95Var.f;
                        oy8 oy8Var2 = y95Var.n;
                        int nextInt = Utilities.b.nextInt(100);
                        int i2 = 120;
                        if (nextInt >= 32) {
                            int i3 = kk7.O3;
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
                        oy8Var2.K(i2);
                        oy8Var2.N(i2 - 1, y95Var.S);
                        ry8Var.setAnimation(oy8Var2);
                        oy8Var2.H(i);
                        ry8Var.d();
                        break;
                    case 2:
                        y95Var.a(true, true);
                        break;
                    case 3:
                        y95Var.b0 = false;
                        y95Var.a(true, true);
                        y95Var.a.c(0.0d);
                        y95Var.a0 = false;
                        break;
                    default:
                        y95Var.a(true, true);
                        break;
                }
            }
        };
        final byte b5 = 4;
        new Runnable(this) { // from class: t95
            public final /* synthetic */ y95 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b5;
                int i = 0;
                y95 y95Var = this.b;
                switch (b22) {
                    case 0:
                        y95Var.n.N(0, null);
                        oy8 oy8Var = y95Var.h;
                        oy8Var.N(0, null);
                        y95Var.f.setAnimation(oy8Var);
                        break;
                    case 1:
                        ry8 ry8Var = y95Var.f;
                        oy8 oy8Var2 = y95Var.n;
                        int nextInt = Utilities.b.nextInt(100);
                        int i2 = 120;
                        if (nextInt >= 32) {
                            int i3 = kk7.O3;
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
                        oy8Var2.K(i2);
                        oy8Var2.N(i2 - 1, y95Var.S);
                        ry8Var.setAnimation(oy8Var2);
                        oy8Var2.H(i);
                        ry8Var.d();
                        break;
                    case 2:
                        y95Var.a(true, true);
                        break;
                    case 3:
                        y95Var.b0 = false;
                        y95Var.a(true, true);
                        y95Var.a.c(0.0d);
                        y95Var.a0 = false;
                        break;
                    default:
                        y95Var.a(true, true);
                        break;
                }
            }
        };
        this.g0 = -1;
        Paint paint = new Paint();
        this.J = paint;
        paint.setColor(bkb.w0(null, bkb.Wg, false));
        this.E = new pb0((wjb) null);
        setClipChildren(false);
        be0 be0Var = new be0(context);
        this.b = be0Var;
        be0Var.setRoundRadius(gl.L(24.0f));
        boolean z = k96.a0;
        addView(be0Var, nme.d(46, 46.0f, (z ? 5 : 3) | 48, z ? 0.0f : 11.0f, 6.0f, z ? 11.0f : 0.0f, 0.0f));
        u95 u95Var = new u95(this, context);
        this.y = u95Var;
        u95Var.setSize(gl.L(26.0f));
        u95Var.setProgressColor(-1);
        u95Var.setNoProgress(false);
        boolean z2 = k96.a0;
        addView(u95Var, nme.d(46, 46.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : 11.0f, 6.0f, z2 ? 11.0f : 0.0f, 0.0f));
        gl.U3(u95Var, false, 1.0f, true, false);
        jia jiaVar = new jia(context);
        this.c = jiaVar;
        zkb.W(jiaVar, bkb.dh, null);
        jiaVar.setTypeface(gl.o());
        jiaVar.setTextSize(16);
        jiaVar.setDrawablePadding(gl.L(6.0f));
        jiaVar.setGravity((k96.a0 ? 5 : 3) | 48);
        boolean z3 = k96.a0;
        addView(jiaVar, nme.d(-1, 20.0f, (z3 ? 5 : 3) | 48, z3 ? 54.0f : 67.0f, 10.0f, z3 ? 67.0f : 54.0f, 0.0f));
        this.r = new tl(gl.L(20.0f), 9, jiaVar, false);
        this.s = new tl(gl.L(20.0f), 9, jiaVar, false);
        Drawable drawable = context.getResources().getDrawable(R.drawable.voice_volume_mini);
        this.d0 = drawable;
        zkb.x(this, drawable, bkb.gh, null, PorterDuff.Mode.MULTIPLY);
        int i = 0;
        while (true) {
            jia[] jiaVarArr = this.d;
            if (i >= jiaVarArr.length) {
                break;
            }
            jiaVarArr[i] = new v95(this, context, i);
            this.d[i].setTextSize(15);
            this.d[i].setGravity((k96.a0 ? 5 : 3) | 48);
            if (i == 4) {
                this.d[i].setBuildFullLayout(true);
                zkb.W(this.d[i], bkb.hh, null);
                View view = this.d[i];
                boolean z4 = k96.a0;
                addView(view, nme.d(-1, -2.0f, (z4 ? 5 : 3) | 48, z4 ? 54.0f : 67.0f, 32.0f, z4 ? 67.0f : 54.0f, 0.0f));
            } else {
                if (i == 0) {
                    zkb.W(this.d[i], bkb.fh, null);
                    this.d[i].k(k96.M0(2131748685, null));
                } else if (i == 1) {
                    zkb.W(this.d[i], bkb.gh, null);
                    this.d[i].k(k96.M0(2131745081, null));
                    this.d[i].setDrawablePadding(gl.L(2.0f));
                } else if (i == 2) {
                    zkb.W(this.d[i], bkb.ih, null);
                    this.d[i].k(k96.M0(2131743115, null));
                } else if (i == 3) {
                    zkb.W(this.d[i], bkb.fh, null);
                    this.d[i].k(k96.M0(2131742687, null));
                }
                View view2 = this.d[i];
                boolean z5 = k96.a0;
                addView(view2, nme.d(-1, 20.0f, (z5 ? 5 : 3) | 48, z5 ? 54.0f : 67.0f, 32.0f, z5 ? 67.0f : 54.0f, 0.0f));
            }
            i++;
        }
        jia jiaVar2 = new jia(context);
        this.e = jiaVar2;
        jiaVar2.setMaxLines(3);
        jiaVar2.setTextSize(15);
        zkb.W(jiaVar2, bkb.hh, null);
        jiaVar2.setVisibility(8);
        addView(jiaVar2, nme.d(-1, 60.0f, (k96.a0 ? 5 : 3) | 48, 14.0f, 32.0f, 14.0f, 0.0f));
        oy8 oy8Var = new oy8(R.raw.voice_outlined2, gl.L(34.0f), gl.L(32.0f), true, null);
        this.h = oy8Var;
        this.n = new oy8(R.raw.hand_1, gl.L(34.0f), gl.L(32.0f), true, null);
        ry8 ry8Var = new ry8(context);
        this.f = ry8Var;
        ry8Var.setScaleType(ImageView.ScaleType.CENTER);
        ry8Var.setAnimation(oy8Var);
        ff0 f0 = bkb.f0(bkb.w0(null, this.U, false) & 620756991, 1, -1);
        try {
            RippleDrawable.class.getDeclaredMethod("setForceSoftware", Boolean.TYPE).invoke(f0, Boolean.TRUE);
        } catch (Throwable unused) {
        }
        ry8Var.setBackground(f0);
        ry8Var.setImportantForAccessibility(2);
        addView(ry8Var, nme.d(48, -1.0f, (k96.a0 ? 3 : 5) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
        ry8Var.setOnClickListener(new b95(this, b3));
        this.a = new x95(gl.L(26.0f), gl.L(29.0f));
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
    /* JADX WARN: Type inference failed for: r19v0, types: [android.view.View, android.widget.FrameLayout, java.lang.Object, y95] */
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
        ry8 ry8Var = this.f;
        ry8Var.setEnabled(z7);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        TLRPC.GroupCallParticipant groupCallParticipant = this.G;
        boolean z8 = elapsedRealtime - groupCallParticipant.lastVoiceUpdateTime < 500 ? groupCallParticipant.hasVoiceDelayed : groupCallParticipant.hasVoice;
        if (!z2) {
            long uptimeMillis = SystemClock.uptimeMillis() - this.G.lastSpeakTime;
            boolean z9 = uptimeMillis < 500;
            if (!this.b0 || !z9 || z8) {
                this.b0 = z9;
                boolean z10 = this.a0;
                t95 t95Var = this.W;
                if (z10) {
                    gl.r(t95Var);
                    this.a0 = false;
                }
                if (this.b0) {
                    gl.e3(t95Var, 500 - uptimeMillis);
                    this.a0 = true;
                }
            }
        }
        TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) this.F.d.f(k27.B1(this.G.peer));
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
        t95 t95Var2 = this.V;
        gl.r(t95Var2);
        TLRPC.GroupCallParticipant groupCallParticipant3 = this.G;
        if ((groupCallParticipant3.muted && !this.b0) || z11) {
            if (groupCallParticipant3.can_self_unmute) {
                if (!z11) {
                    w0 = bkb.w0(null, this.U, false);
                    this.P = true;
                    b = !isEmpty ? (byte) 4 : (byte) 0;
                }
            } else if (groupCallParticipant3.raise_hand_rating != 0) {
                z5 = true;
                if (z5) {
                    w02 = bkb.w0(null, bkb.ih, false);
                    if (!z11) {
                    }
                    b2 = 2;
                } else {
                    w02 = bkb.w0(null, bkb.fh, false);
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j = this.G.lastRaiseHandDate;
                    long j2 = elapsedRealtime2 - j;
                    if (j == 0 || j2 > 5000) {
                        if (!z11) {
                        }
                        b2 = 2;
                    } else {
                        gl.e3(t95Var2, 5000 - j2);
                        b2 = 3;
                    }
                }
                int i3 = w02;
                z3 = z5;
                w0 = i3;
                c = c();
                jia[] jiaVarArr = this.d;
                if (!c) {
                }
                c2 = c();
                jia jiaVar = this.e;
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
            jia[] jiaVarArr2 = this.d;
            if (!c) {
            }
            c2 = c();
            jia jiaVar2 = this.e;
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
                w0 = bkb.w0(null, bkb.gh, false);
                b2 = 1;
                z3 = false;
                c = c();
                jia[] jiaVarArr22 = this.d;
                if (!c) {
                    zkb.W(jiaVarArr22[4], this.U, null);
                }
                c2 = c();
                jia jiaVar22 = this.e;
                if (!c2) {
                    boolean z14 = this.c0;
                    if (isEmpty) {
                        TLRPC.User user = this.H;
                        if (z14) {
                            if (user != null) {
                                jiaVarArr22[4].k(k96.M0(2131744025, null));
                            } else {
                                jiaVarArr22[4].k(k96.M0(2131744024, null));
                            }
                            zkb.W(jiaVarArr22[4], this.U, null);
                        } else {
                            if (user != null) {
                                jiaVarArr22[4].k(k96.M0(2131744022, null));
                            } else {
                                jiaVarArr22[4].k(k96.M0(2131744021, null));
                            }
                            zkb.W(jiaVarArr22[4], this.U, null);
                        }
                    } else if (z14) {
                        jiaVarArr22[4].k(k96.M0(2131743902, null));
                        zkb.W(jiaVarArr22[4], bkb.fh, null);
                    } else {
                        jiaVarArr22[4].k(k96.M0(2131744023, null));
                        zkb.W(jiaVarArr22[4], this.U, null);
                    }
                    if (isEmpty) {
                        jiaVar22.l(jiaVarArr22[b2].getText(), false);
                        this.g0 = b2;
                        jiaVar22.setTag(R.id.theme_bind, null);
                        jiaVar22.setTextColor(jiaVarArr22[b2].getTextColor());
                    } else {
                        jiaVar22.l(gl.K2(this.G.about), false);
                        this.g0 = -1;
                        zkb.W(jiaVar22, bkb.hh, null);
                    }
                } else if (isEmpty) {
                    jiaVarArr22[4].k("");
                    jiaVar22.l("", false);
                } else {
                    jiaVarArr22[4].k(gl.K2(this.G.about));
                    jiaVar22.l("", false);
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
                        ofFloat.addUpdateListener(new bn(this, i4, w0, z6 ? 1 : 0));
                        arrayList.add(ofFloat);
                        if (b2 != 1) {
                            int H = hc2.H(this.G);
                            int i5 = H / 100;
                            if (i5 != 100) {
                                i = 0;
                                jiaVarArr22[1].setLeftDrawable(this.d0);
                                jia jiaVar3 = jiaVarArr22[1];
                                if (H < 100) {
                                    i5 = 1;
                                }
                                jiaVar3.k(k96.a0("SpeakingWithVolume", null, 2131745080, Integer.valueOf(i5)));
                            } else {
                                i = 0;
                                jiaVarArr22[1].setLeftDrawable((Drawable) null);
                                jiaVarArr22[1].k(k96.M0(2131745081, null));
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
                                    while (i6 < jiaVarArr22.length) {
                                        jia jiaVar4 = jiaVarArr22[i6];
                                        float L2 = i6 == b2 ? 0.0f : gl.L(f);
                                        float[] fArr = new float[1];
                                        fArr[i] = L2;
                                        arrayList.add(ObjectAnimator.ofFloat(jiaVar4, (Property<jia, Float>) property2, fArr));
                                        jia jiaVar5 = jiaVarArr22[i6];
                                        float[] fArr2 = new float[1];
                                        fArr2[i] = i6 == b2 ? 1.0f : 0.0f;
                                        arrayList.add(ObjectAnimator.ofFloat(jiaVar5, (Property<jia, Float>) property, fArr2));
                                        i6++;
                                        f = -2.0f;
                                    }
                                } else {
                                    int i7 = i;
                                    while (i7 < jiaVarArr22.length) {
                                        jia jiaVar6 = jiaVarArr22[i7];
                                        if (i7 == b2) {
                                            L = 0.0f;
                                        } else {
                                            L = gl.L(i7 == 0 ? 2.0f : -2.0f);
                                        }
                                        float[] fArr3 = new float[1];
                                        fArr3[i] = L;
                                        arrayList.add(ObjectAnimator.ofFloat(jiaVar6, (Property<jia, Float>) property2, fArr3));
                                        jia jiaVar7 = jiaVarArr22[i7];
                                        float[] fArr4 = new float[1];
                                        fArr4[i] = i7 == b2 ? 1.0f : 0.0f;
                                        arrayList.add(ObjectAnimator.ofFloat(jiaVar7, (Property<jia, Float>) property, fArr4));
                                        i7++;
                                    }
                                }
                            } else {
                                b(b2);
                            }
                            this.Q = b2;
                        }
                        x95 x95Var = this.a;
                        x95Var.i = b2;
                        if (!z) {
                            x95Var.j = b2 != 1 ? 1.0f : 0.0f;
                        }
                        if (arrayList != null) {
                            AnimatorSet animatorSet2 = this.e0;
                            if (animatorSet2 != null) {
                                animatorSet2.cancel();
                                this.e0 = null;
                            }
                            AnimatorSet animatorSet3 = new AnimatorSet();
                            this.e0 = animatorSet3;
                            animatorSet3.addListener(new by1(this, b2, (byte) 2));
                            this.e0.playTogether(arrayList);
                            this.e0.setDuration(180L);
                            this.e0.start();
                        }
                        if (!z && this.K == z12 && this.L == z3) {
                            z4 = i;
                        } else {
                            oy8 oy8Var = this.h;
                            if (z3) {
                                ry8Var.setAnimation(oy8Var);
                                oy8Var.N(i, null);
                                if (!z12) {
                                    i2 = 42;
                                } else if (this.L) {
                                    K = oy8Var.K(21);
                                } else {
                                    i2 = 64;
                                }
                                K = oy8Var.K(i2);
                            } else {
                                K = oy8Var.K(84);
                                if (z) {
                                    oy8Var.N(83, this.T);
                                } else {
                                    oy8Var.N(i, null);
                                }
                            }
                            if (z) {
                                r11 = 0;
                                oy8Var.I(oy8Var.f - 1, false, true);
                                ry8Var.invalidate();
                            } else {
                                if (K) {
                                    if (b2 == 3) {
                                        oy8Var.H(63);
                                    } else if (z12 && this.L && !z3) {
                                        oy8Var.H(0);
                                    } else if (z12) {
                                        oy8Var.H(43);
                                    } else {
                                        oy8Var.H(21);
                                    }
                                }
                                ry8Var.d();
                                r11 = 0;
                            }
                            this.K = z12;
                            this.L = z3;
                            z4 = r11;
                        }
                        if (!this.b0) {
                            x95Var.c(0.0d);
                        }
                        x95Var.e(this, (this.b0 || this.f0 != 0.0f) ? z4 : true);
                        return;
                    }
                    this.M = w0;
                    ry8Var.setColorFilter(new PorterDuffColorFilter(w0, PorterDuff.Mode.SRC_IN));
                    bkb.F1(ry8Var.getDrawable(), w0 & 620756991, true);
                }
                arrayList = null;
                if (b2 != 1) {
                }
                if (!c()) {
                }
                x95 x95Var2 = this.a;
                x95Var2.i = b2;
                if (!z) {
                }
                if (arrayList != null) {
                }
                if (!z) {
                }
                oy8 oy8Var2 = this.h;
                if (z3) {
                }
                if (z) {
                }
                this.K = z12;
                this.L = z3;
                z4 = r11;
                if (!this.b0) {
                }
                x95Var2.e(this, (this.b0 || this.f0 != 0.0f) ? z4 : true);
                return;
            }
            w0 = bkb.w0(null, this.U, false);
            b = !isEmpty ? (byte) 4 : (byte) 0;
            this.P = true;
        }
        b2 = b;
        z3 = false;
        c = c();
        jia[] jiaVarArr222 = this.d;
        if (!c) {
        }
        c2 = c();
        jia jiaVar222 = this.e;
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
        jia[] jiaVarArr;
        float L;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            jiaVarArr = this.d;
            if (i3 >= jiaVarArr.length) {
                break;
            }
            jiaVarArr[i3].setImportantForAccessibility(i3 == i ? 1 : 2);
            i3++;
        }
        if (i == 0) {
            while (i2 < jiaVarArr.length) {
                jiaVarArr[i2].setTranslationY(i2 == i ? 0.0f : gl.L(-2.0f));
                jiaVarArr[i2].setAlpha(i2 == i ? 1.0f : 0.0f);
                i2++;
            }
            return;
        }
        while (i2 < jiaVarArr.length) {
            jia jiaVar = jiaVarArr[i2];
            if (i2 == i) {
                L = 0.0f;
            } else {
                L = gl.L(i2 == 0 ? 2.0f : -2.0f);
            }
            jiaVar.setTranslationY(L);
            jiaVarArr[i2].setAlpha(i2 == i ? 1.0f : 0.0f);
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
            float L = k96.a0 ? 0.0f : gl.L(68.0f);
            canvas2 = canvas;
            canvas2.drawLine(L, getMeasuredHeight() - 1, getMeasuredWidth() - (k96.a0 ? gl.L(68.0f) : 0), getMeasuredHeight() - 1, paint);
            paint.setAlpha(alpha);
        } else {
            canvas2 = canvas;
        }
        be0 be0Var = this.b;
        int measuredWidth = (be0Var.getMeasuredWidth() / 2) + be0Var.getLeft();
        int measuredHeight = (be0Var.getMeasuredHeight() / 2) + be0Var.getTop();
        x95 x95Var = this.a;
        x95Var.f();
        if (this.f0 == 0.0f) {
            x95Var.a(canvas2, measuredWidth, measuredHeight, this);
        }
        be0Var.setScaleX(x95Var.b());
        be0Var.setScaleY(x95Var.b());
        float b = x95Var.b();
        u95 u95Var = this.y;
        u95Var.setScaleX(b);
        u95Var.setScaleY(x95Var.b());
        super.dispatchDraw(canvas2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(j5 j5Var, TLRPC.GroupCallParticipant groupCallParticipant, fc2 fc2Var, long j, TLRPC.FileLocation fileLocation, boolean z) {
        long c;
        this.F = fc2Var;
        this.N = j5Var;
        this.R = j;
        this.G = groupCallParticipant;
        long B1 = k27.B1(groupCallParticipant.peer);
        j5 j5Var2 = this.N;
        jia jiaVar = this.c;
        be0 be0Var = this.b;
        pb0 pb0Var = this.E;
        tl tlVar = this.s;
        if (B1 > 0) {
            TLRPC.User V1 = na7.q1(j5Var2.a).V1(Long.valueOf(B1));
            this.H = V1;
            this.I = null;
            int i = this.N.a;
            pb0Var.q(V1);
            jiaVar.l(l7c.q(this.H), false);
            c = cf3.c(this.H);
            TLRPC.User user = this.H;
            if (user != null) {
                if (user.verified) {
                    f6 f6Var = this.w;
                    if (f6Var == null) {
                        f6Var = new f6(getContext());
                    }
                    this.w = f6Var;
                    tlVar.g(f6Var, z);
                } else if (cf3.f(user.emoji_status) != 0) {
                    tlVar.j(cf3.f(this.H.emoji_status), z);
                }
                tlVar.k(Integer.valueOf(bkb.w0(null, bkb.Bk, false)));
                jiaVar.i(tlVar);
                ImageReceiver imageReceiver = be0Var.getImageReceiver();
                int i2 = j5Var.a;
                imageReceiver.d = i2;
                if (fileLocation == null) {
                    this.c0 = true;
                    be0Var.m(gl5.e(fileLocation), "50_50", pb0Var, null);
                } else {
                    gl5 l = gl5.l(i2, 1, this.H);
                    this.c0 = l != null;
                    be0Var.m(l, "50_50", pb0Var, this.H);
                }
            }
            TLRPC.User user2 = this.H;
            if (user2 == null || !user2.premium) {
                tlVar.g(null, z);
            } else {
                if (this.x == null) {
                    this.x = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                    this.x = new w95(gl.L(14.0f), gl.L(14.0f), this.x);
                }
                tlVar.g(this.x, z);
            }
            tlVar.k(Integer.valueOf(bkb.w0(null, bkb.Bk, false)));
            jiaVar.i(tlVar);
            ImageReceiver imageReceiver2 = be0Var.getImageReceiver();
            int i22 = j5Var.a;
            imageReceiver2.d = i22;
            if (fileLocation == null) {
            }
        } else {
            TLRPC.Chat K0 = na7.q1(j5Var2.a).K0(Long.valueOf(-B1));
            this.I = K0;
            this.H = null;
            int i3 = this.N.a;
            pb0Var.p(K0);
            c = cf3.c(this.I);
            TLRPC.Chat chat = this.I;
            if (chat != null) {
                jiaVar.l(chat.title, false);
                TLRPC.Chat chat2 = this.I;
                if (chat2.verified) {
                    f6 f6Var2 = this.w;
                    if (f6Var2 == null) {
                        f6Var2 = new f6(getContext());
                    }
                    this.w = f6Var2;
                    tlVar.g(f6Var2, z);
                } else if (cf3.f(chat2.emoji_status) != 0) {
                    tlVar.j(cf3.f(this.I.emoji_status), z);
                } else {
                    tlVar.g(null, z);
                }
                be0Var.getImageReceiver().d = j5Var.a;
                if (fileLocation != null) {
                    this.c0 = true;
                    be0Var.m(gl5.e(fileLocation), "50_50", pb0Var, null);
                } else {
                    gl5 a = gl5.a(1, this.I);
                    this.c0 = a != null;
                    be0Var.m(a, "50_50", pb0Var, this.I);
                }
            }
        }
        tl tlVar2 = this.r;
        if (c != 0) {
            tlVar2.j(c, z);
            jiaVar.setLeftDrawable(tlVar2);
            tlVar2.k(Integer.valueOf(bkb.w0(null, bkb.Bk, false)));
        } else {
            tlVar2.g(null, z);
            jiaVar.setLeftDrawable((Drawable) null);
        }
        a(z, false);
    }

    public final void f(int i, int i2) {
        if (this.U != i) {
            if (this.P) {
                this.M = bkb.w0(null, i, false);
            }
            this.U = i;
        }
        if (this.P) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN);
            ry8 ry8Var = this.f;
            ry8Var.setColorFilter(porterDuffColorFilter);
            bkb.F1(ry8Var.getDrawable(), i2 & 620756991, true);
        }
    }

    public be0 getAvatarImageView() {
        return this.b;
    }

    public x95 getAvatarWavesDrawable() {
        return this.a;
    }

    public int getClipHeight() {
        jia jiaVar = this.e;
        if (TextUtils.isEmpty(jiaVar.getText()) || !this.c0) {
            jiaVar = this.d[4];
        }
        if (jiaVar.getLineCount() <= 1) {
            return getMeasuredHeight();
        }
        return gl.L(8.0f) + jiaVar.getTop() + jiaVar.getTextHeight();
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
        return k27.B1(groupCallParticipant.peer);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false, false);
        tl tlVar = this.s;
        if (tlVar != null) {
            tlVar.a();
        }
        tl tlVar2 = this.r;
        if (tlVar2 != null) {
            tlVar2.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.a0) {
            gl.r(this.W);
            this.a0 = false;
        }
        AnimatorSet animatorSet = this.e0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        tl tlVar = this.s;
        if (tlVar != null) {
            tlVar.b();
        }
        tl tlVar2 = this.r;
        if (tlVar2 != null) {
            tlVar2.b();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo.isEnabled()) {
            TLRPC.GroupCallParticipant groupCallParticipant = this.G;
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, k96.M0((!groupCallParticipant.muted || groupCallParticipant.can_self_unmute) ? 2131743051 : 2131742988, null)));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(58.0f), TLObject.FLAG_30));
    }

    public void setAboutVisible(boolean z) {
        jia[] jiaVarArr = this.d;
        if (z) {
            jiaVarArr[4].setTranslationY(0.0f);
        } else {
            jiaVarArr[4].setFullAlpha(0.0f);
        }
        invalidate();
    }

    public void setAmplitude(double d) {
        x95 x95Var = this.a;
        if (d <= 1.5d) {
            x95Var.c(0.0d);
            return;
        }
        boolean z = this.a0;
        t95 t95Var = this.W;
        if (z) {
            gl.r(t95Var);
        }
        if (!this.b0) {
            this.b0 = true;
            a(true, false);
        }
        x95Var.c(d);
        gl.e3(t95Var, 500L);
        this.a0 = true;
    }

    public void setDrawAvatar(boolean z) {
        be0 be0Var = this.b;
        if (be0Var.getImageReceiver().R0 != z) {
            be0Var.getImageReceiver().v0(z, true);
        }
    }

    public void setDrawDivider(boolean z) {
        this.O = z;
        invalidate();
    }

    public void setProgressToAvatarPreview(float f) {
        this.f0 = f;
        this.c.setTranslationX((k96.a0 ? gl.L(53.0f) : -gl.L(53.0f)) * f);
        boolean c = c();
        jia jiaVar = this.e;
        jia[] jiaVarArr = this.d;
        if (!c || f <= 0.0f) {
            jiaVar.setVisibility(8);
            for (int i = 0; i < jiaVarArr.length; i++) {
                if (TextUtils.isEmpty(jiaVarArr[4].getText()) || jiaVarArr[4].getLineCount() <= 1) {
                    jiaVarArr[i].setTranslationX((k96.a0 ? gl.L(53.0f) : -gl.L(53.0f)) * f);
                    jiaVarArr[i].h(0, 0);
                } else {
                    jiaVarArr[i].h(gl.L(92.0f), k96.a0 ? gl.L(48.0f) : gl.L(53.0f));
                    jiaVarArr[i].setFullAlpha(f);
                    jiaVarArr[i].setTranslationX(0.0f);
                    jiaVarArr[i].invalidate();
                }
            }
        } else {
            float f2 = 1.0f - f;
            jiaVar.setTranslationX((k96.a0 ? -gl.L(53.0f) : gl.L(53.0f)) * f2);
            jiaVar.setVisibility(0);
            jiaVar.setAlpha(f);
            jiaVarArr[4].setAlpha(f2);
            jia jiaVar2 = jiaVarArr[4];
            boolean z = k96.a0;
            int L = gl.L(53.0f);
            if (!z) {
                L = -L;
            }
            jiaVar2.setTranslationX(L * f);
        }
        this.b.setAlpha(f == 0.0f ? 1.0f : 0.0f);
        this.a.e(this, this.b0 && f == 0.0f);
        float f3 = 1.0f - f;
        ry8 ry8Var = this.f;
        ry8Var.setAlpha(f3);
        float f4 = (f3 * 0.4f) + 0.6f;
        ry8Var.setScaleX(f4);
        ry8Var.setScaleY(f4);
        invalidate();
    }

    @Override // tjb
    public final void updateColors() {
        jia jiaVar;
        jia[] jiaVarArr;
        jia jiaVar2;
        try {
            this.J.setColor(bkb.w0(null, bkb.Wg, false));
            int i = this.g0;
            if (i >= 0 && (jiaVar = this.e) != null && (jiaVarArr = this.d) != null && i < jiaVarArr.length && (jiaVar2 = jiaVarArr[i]) != null) {
                zkb.a0(jiaVar2);
                jiaVar.setTextColor(jiaVarArr[this.g0].getTextColor());
            }
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }

    public void d(y95 y95Var) {
    }
}
