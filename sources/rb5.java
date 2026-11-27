// default package

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.SystemClock;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class rb5 {
    public final b29 a = new b29(R.raw.voice_mini, hl.L(24.0f), hl.L(24.0f), true, null);
    public final b29 b = new b29(R.raw.hand_2, hl.L(15.0f), hl.L(15.0f), true, null);
    public e29 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public qb5 g;
    public TLRPC.GroupCallParticipant h;
    public final pb5 i;
    public final pb5 j;
    public boolean k;
    public final pb5 l;
    public final pb5 m;

    /* JADX WARN: Type inference failed for: r0v0, types: [pb5] */
    /* JADX WARN: Type inference failed for: r0v1, types: [pb5] */
    /* JADX WARN: Type inference failed for: r0v2, types: [pb5] */
    /* JADX WARN: Type inference failed for: r0v3, types: [pb5] */
    public rb5() {
        final byte b = 0;
        this.i = new Runnable(this) { // from class: pb5
            public final /* synthetic */ rb5 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                int i = 0;
                rb5 rb5Var = this.b;
                switch (b2) {
                    case 0:
                        rb5Var.b.N(0, null);
                        b29 b29Var = rb5Var.a;
                        b29Var.N(0, null);
                        e29 e29Var = rb5Var.c;
                        if (e29Var != null) {
                            e29Var.setAnimation(b29Var);
                            break;
                        }
                        break;
                    case 1:
                        b29 b29Var2 = rb5Var.b;
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
                        b29Var2.N(i2 - 1, rb5Var.i);
                        b29Var2.H(i);
                        e29 e29Var2 = rb5Var.c;
                        if (e29Var2 != null) {
                            e29Var2.setAnimation(b29Var2);
                            rb5Var.c.d();
                            break;
                        }
                        break;
                    case 2:
                        rb5Var.e = false;
                        qb5 qb5Var = rb5Var.g;
                        if (qb5Var != null) {
                            qb5Var.a();
                        }
                        rb5Var.d = false;
                        break;
                    default:
                        rb5Var.c(true);
                        break;
                }
            }
        };
        final byte b2 = 1;
        this.j = new Runnable(this) { // from class: pb5
            public final /* synthetic */ rb5 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b2;
                int i = 0;
                rb5 rb5Var = this.b;
                switch (b22) {
                    case 0:
                        rb5Var.b.N(0, null);
                        b29 b29Var = rb5Var.a;
                        b29Var.N(0, null);
                        e29 e29Var = rb5Var.c;
                        if (e29Var != null) {
                            e29Var.setAnimation(b29Var);
                            break;
                        }
                        break;
                    case 1:
                        b29 b29Var2 = rb5Var.b;
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
                        b29Var2.N(i2 - 1, rb5Var.i);
                        b29Var2.H(i);
                        e29 e29Var2 = rb5Var.c;
                        if (e29Var2 != null) {
                            e29Var2.setAnimation(b29Var2);
                            rb5Var.c.d();
                            break;
                        }
                        break;
                    case 2:
                        rb5Var.e = false;
                        qb5 qb5Var = rb5Var.g;
                        if (qb5Var != null) {
                            qb5Var.a();
                        }
                        rb5Var.d = false;
                        break;
                    default:
                        rb5Var.c(true);
                        break;
                }
            }
        };
        final byte b3 = 2;
        this.l = new Runnable(this) { // from class: pb5
            public final /* synthetic */ rb5 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b3;
                int i = 0;
                rb5 rb5Var = this.b;
                switch (b22) {
                    case 0:
                        rb5Var.b.N(0, null);
                        b29 b29Var = rb5Var.a;
                        b29Var.N(0, null);
                        e29 e29Var = rb5Var.c;
                        if (e29Var != null) {
                            e29Var.setAnimation(b29Var);
                            break;
                        }
                        break;
                    case 1:
                        b29 b29Var2 = rb5Var.b;
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
                        b29Var2.N(i2 - 1, rb5Var.i);
                        b29Var2.H(i);
                        e29 e29Var2 = rb5Var.c;
                        if (e29Var2 != null) {
                            e29Var2.setAnimation(b29Var2);
                            rb5Var.c.d();
                            break;
                        }
                        break;
                    case 2:
                        rb5Var.e = false;
                        qb5 qb5Var = rb5Var.g;
                        if (qb5Var != null) {
                            qb5Var.a();
                        }
                        rb5Var.d = false;
                        break;
                    default:
                        rb5Var.c(true);
                        break;
                }
            }
        };
        final byte b4 = 3;
        this.m = new Runnable(this) { // from class: pb5
            public final /* synthetic */ rb5 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b4;
                int i = 0;
                rb5 rb5Var = this.b;
                switch (b22) {
                    case 0:
                        rb5Var.b.N(0, null);
                        b29 b29Var = rb5Var.a;
                        b29Var.N(0, null);
                        e29 e29Var = rb5Var.c;
                        if (e29Var != null) {
                            e29Var.setAnimation(b29Var);
                            break;
                        }
                        break;
                    case 1:
                        b29 b29Var2 = rb5Var.b;
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
                        b29Var2.N(i2 - 1, rb5Var.i);
                        b29Var2.H(i);
                        e29 e29Var2 = rb5Var.c;
                        if (e29Var2 != null) {
                            e29Var2.setAnimation(b29Var2);
                            rb5Var.c.d();
                            break;
                        }
                        break;
                    case 2:
                        rb5Var.e = false;
                        qb5 qb5Var = rb5Var.g;
                        if (qb5Var != null) {
                            qb5Var.a();
                        }
                        rb5Var.d = false;
                        break;
                    default:
                        rb5Var.c(true);
                        break;
                }
            }
        };
    }

    public final void a(double d) {
        if (d > 1.5d) {
            boolean z = this.d;
            pb5 pb5Var = this.l;
            if (z) {
                hl.r(pb5Var);
            }
            if (!this.e) {
                this.e = true;
                qb5 qb5Var = this.g;
                if (qb5Var != null) {
                    qb5Var.a();
                }
            }
            hl.d3(pb5Var, 500L);
            this.d = true;
        }
    }

    public final void b() {
        this.g = null;
        this.e = false;
        hl.r(this.l);
        hl.r(this.j);
        hl.r(this.m);
        this.a.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
    }

    public final void c(boolean z) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        b29 b29Var;
        int i;
        boolean K;
        if (this.c == null || (groupCallParticipant = this.h) == null || (b29Var = this.a) == null) {
            return;
        }
        boolean z2 = groupCallParticipant.muted_by_you && !groupCallParticipant.self;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        TLRPC.GroupCallParticipant groupCallParticipant2 = this.h;
        boolean z3 = elapsedRealtime - groupCallParticipant2.lastVoiceUpdateTime < 500 ? groupCallParticipant2.hasVoiceDelayed : groupCallParticipant2.hasVoice;
        boolean z4 = !groupCallParticipant2.self ? (!groupCallParticipant2.muted || (this.e && z3)) && !z2 : VoIPService.getSharedInstance() == null || !VoIPService.getSharedInstance().isMicMute() || (this.e && z3);
        TLRPC.GroupCallParticipant groupCallParticipant3 = this.h;
        boolean z5 = (((!groupCallParticipant3.muted || this.e) && !z2) || groupCallParticipant3.can_self_unmute || groupCallParticipant3.raise_hand_rating == 0) ? false : true;
        if (z5) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            long j = this.h.lastRaiseHandDate;
            long j2 = elapsedRealtime2 - j;
            if (j != 0 && j2 <= 5000) {
                hl.d3(this.m, 5000 - j2);
            }
            K = b29Var.K(jn7.R1);
        } else {
            this.c.setAnimation(b29Var);
            b29Var.N(0, null);
            if (!z4) {
                i = 69;
            } else if (this.f) {
                K = b29Var.K(36);
            } else {
                i = 99;
            }
            K = b29Var.K(i);
        }
        if (!z) {
            b29Var.I(b29Var.f - 1, false, true);
            this.c.invalidate();
        } else if (K) {
            if (z5) {
                b29Var.H(99);
                b29Var.K(jn7.R1);
            } else if (z4 && this.f && !z5) {
                b29Var.H(0);
                b29Var.K(36);
            } else if (z4) {
                b29Var.H(69);
                b29Var.K(99);
            } else {
                b29Var.H(36);
                b29Var.K(69);
            }
            this.c.d();
            this.c.invalidate();
        }
        this.c.setAnimation(b29Var);
        this.f = z5;
        if (this.k != z2) {
            this.k = z2;
            qb5 qb5Var = this.g;
            if (qb5Var != null) {
                qb5Var.a();
            }
        }
    }
}
