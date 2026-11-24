// default package

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.SystemClock;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class q95 {
    public final oy8 a = new oy8(R.raw.voice_mini, gl.L(24.0f), gl.L(24.0f), true, null);
    public final oy8 b = new oy8(R.raw.hand_2, gl.L(15.0f), gl.L(15.0f), true, null);
    public ry8 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public p95 g;
    public TLRPC.GroupCallParticipant h;
    public final o95 i;
    public final o95 j;
    public boolean k;
    public final o95 l;
    public final o95 m;

    /* JADX WARN: Type inference failed for: r0v0, types: [o95] */
    /* JADX WARN: Type inference failed for: r0v1, types: [o95] */
    /* JADX WARN: Type inference failed for: r0v2, types: [o95] */
    /* JADX WARN: Type inference failed for: r0v3, types: [o95] */
    public q95() {
        final byte b = 0;
        this.i = new Runnable(this) { // from class: o95
            public final /* synthetic */ q95 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                int i = 0;
                q95 q95Var = this.b;
                switch (b2) {
                    case 0:
                        q95Var.b.N(0, null);
                        oy8 oy8Var = q95Var.a;
                        oy8Var.N(0, null);
                        ry8 ry8Var = q95Var.c;
                        if (ry8Var != null) {
                            ry8Var.setAnimation(oy8Var);
                            break;
                        }
                        break;
                    case 1:
                        oy8 oy8Var2 = q95Var.b;
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
                        oy8Var2.N(i2 - 1, q95Var.i);
                        oy8Var2.H(i);
                        ry8 ry8Var2 = q95Var.c;
                        if (ry8Var2 != null) {
                            ry8Var2.setAnimation(oy8Var2);
                            q95Var.c.d();
                            break;
                        }
                        break;
                    case 2:
                        q95Var.e = false;
                        p95 p95Var = q95Var.g;
                        if (p95Var != null) {
                            p95Var.a();
                        }
                        q95Var.d = false;
                        break;
                    default:
                        q95Var.c(true);
                        break;
                }
            }
        };
        final byte b2 = 1;
        this.j = new Runnable(this) { // from class: o95
            public final /* synthetic */ q95 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b2;
                int i = 0;
                q95 q95Var = this.b;
                switch (b22) {
                    case 0:
                        q95Var.b.N(0, null);
                        oy8 oy8Var = q95Var.a;
                        oy8Var.N(0, null);
                        ry8 ry8Var = q95Var.c;
                        if (ry8Var != null) {
                            ry8Var.setAnimation(oy8Var);
                            break;
                        }
                        break;
                    case 1:
                        oy8 oy8Var2 = q95Var.b;
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
                        oy8Var2.N(i2 - 1, q95Var.i);
                        oy8Var2.H(i);
                        ry8 ry8Var2 = q95Var.c;
                        if (ry8Var2 != null) {
                            ry8Var2.setAnimation(oy8Var2);
                            q95Var.c.d();
                            break;
                        }
                        break;
                    case 2:
                        q95Var.e = false;
                        p95 p95Var = q95Var.g;
                        if (p95Var != null) {
                            p95Var.a();
                        }
                        q95Var.d = false;
                        break;
                    default:
                        q95Var.c(true);
                        break;
                }
            }
        };
        final byte b3 = 2;
        this.l = new Runnable(this) { // from class: o95
            public final /* synthetic */ q95 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b3;
                int i = 0;
                q95 q95Var = this.b;
                switch (b22) {
                    case 0:
                        q95Var.b.N(0, null);
                        oy8 oy8Var = q95Var.a;
                        oy8Var.N(0, null);
                        ry8 ry8Var = q95Var.c;
                        if (ry8Var != null) {
                            ry8Var.setAnimation(oy8Var);
                            break;
                        }
                        break;
                    case 1:
                        oy8 oy8Var2 = q95Var.b;
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
                        oy8Var2.N(i2 - 1, q95Var.i);
                        oy8Var2.H(i);
                        ry8 ry8Var2 = q95Var.c;
                        if (ry8Var2 != null) {
                            ry8Var2.setAnimation(oy8Var2);
                            q95Var.c.d();
                            break;
                        }
                        break;
                    case 2:
                        q95Var.e = false;
                        p95 p95Var = q95Var.g;
                        if (p95Var != null) {
                            p95Var.a();
                        }
                        q95Var.d = false;
                        break;
                    default:
                        q95Var.c(true);
                        break;
                }
            }
        };
        final byte b4 = 3;
        this.m = new Runnable(this) { // from class: o95
            public final /* synthetic */ q95 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b4;
                int i = 0;
                q95 q95Var = this.b;
                switch (b22) {
                    case 0:
                        q95Var.b.N(0, null);
                        oy8 oy8Var = q95Var.a;
                        oy8Var.N(0, null);
                        ry8 ry8Var = q95Var.c;
                        if (ry8Var != null) {
                            ry8Var.setAnimation(oy8Var);
                            break;
                        }
                        break;
                    case 1:
                        oy8 oy8Var2 = q95Var.b;
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
                        oy8Var2.N(i2 - 1, q95Var.i);
                        oy8Var2.H(i);
                        ry8 ry8Var2 = q95Var.c;
                        if (ry8Var2 != null) {
                            ry8Var2.setAnimation(oy8Var2);
                            q95Var.c.d();
                            break;
                        }
                        break;
                    case 2:
                        q95Var.e = false;
                        p95 p95Var = q95Var.g;
                        if (p95Var != null) {
                            p95Var.a();
                        }
                        q95Var.d = false;
                        break;
                    default:
                        q95Var.c(true);
                        break;
                }
            }
        };
    }

    public final void a(double d) {
        if (d > 1.5d) {
            boolean z = this.d;
            o95 o95Var = this.l;
            if (z) {
                gl.r(o95Var);
            }
            if (!this.e) {
                this.e = true;
                p95 p95Var = this.g;
                if (p95Var != null) {
                    p95Var.a();
                }
            }
            gl.e3(o95Var, 500L);
            this.d = true;
        }
    }

    public final void b() {
        this.g = null;
        this.e = false;
        gl.r(this.l);
        gl.r(this.j);
        gl.r(this.m);
        this.a.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
    }

    public final void c(boolean z) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        oy8 oy8Var;
        int i;
        boolean K;
        if (this.c == null || (groupCallParticipant = this.h) == null || (oy8Var = this.a) == null) {
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
                gl.e3(this.m, 5000 - j2);
            }
            K = oy8Var.K(kk7.R1);
        } else {
            this.c.setAnimation(oy8Var);
            oy8Var.N(0, null);
            if (!z4) {
                i = 69;
            } else if (this.f) {
                K = oy8Var.K(36);
            } else {
                i = 99;
            }
            K = oy8Var.K(i);
        }
        if (!z) {
            oy8Var.I(oy8Var.f - 1, false, true);
            this.c.invalidate();
        } else if (K) {
            if (z5) {
                oy8Var.H(99);
                oy8Var.K(kk7.R1);
            } else if (z4 && this.f && !z5) {
                oy8Var.H(0);
                oy8Var.K(36);
            } else if (z4) {
                oy8Var.H(69);
                oy8Var.K(99);
            } else {
                oy8Var.H(36);
                oy8Var.K(69);
            }
            this.c.d();
            this.c.invalidate();
        }
        this.c.setAnimation(oy8Var);
        this.f = z5;
        if (this.k != z2) {
            this.k = z2;
            p95 p95Var = this.g;
            if (p95Var != null) {
                p95Var.a();
            }
        }
    }
}
