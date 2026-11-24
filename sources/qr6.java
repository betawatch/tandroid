// default package

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import android.util.SparseArray;
import j$.util.Objects;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class qr6 implements uj {
    public j54 F;
    public kp G;
    public kp H;
    public kp I;
    public fm4 J;
    public fm4 K;
    public fm4 L;
    public boolean M;
    public byte N;
    public boolean O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public final Context a;
    public final ub3 c;
    public final PlaybackSession d;
    public String s;
    public PlaybackMetrics.Builder w;
    public byte x;
    public final Executor b = pd0.a();
    public final znb f = new znb();
    public final xnb h = new xnb();
    public final HashMap r = new HashMap();
    public final HashMap n = new HashMap();
    public final long e = SystemClock.elapsedRealtime();
    public byte y = 0;
    public byte E = 0;

    public qr6(Context context, PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.d = playbackSession;
        ub3 ub3Var = new ub3();
        this.c = ub3Var;
        ub3Var.d = this;
    }

    public static qr6 b(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new qr6(context, mediaMetricsManager.createPlaybackSession());
    }

    public final boolean a(kp kpVar) {
        String str;
        if (kpVar == null) {
            return false;
        }
        String str2 = (String) kpVar.d;
        ub3 ub3Var = this.c;
        synchronized (ub3Var) {
            str = ub3Var.f;
        }
        return str2.equals(str);
    }

    public final void c() {
        PlaybackMetrics.Builder builder = this.w;
        if (builder != null && this.S) {
            builder.setAudioUnderrunCount(this.R);
            this.w.setVideoFramesDropped(this.P);
            this.w.setVideoFramesPlayed(this.Q);
            Long l = (Long) this.n.get(this.s);
            this.w.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.r.get(this.s);
            this.w.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.w.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            final PlaybackMetrics build = this.w.build();
            this.b.execute(new Runnable() { // from class: or6
                @Override // java.lang.Runnable
                public final void run() {
                    qr6.this.e(build);
                }
            });
        }
        this.w = null;
        this.s = null;
        this.R = 0;
        this.P = 0;
        this.Q = 0;
        this.J = null;
        this.K = null;
        this.L = null;
        this.S = false;
    }

    public final LogSessionId d() {
        return this.d.getSessionId();
    }

    public final /* synthetic */ void e(PlaybackMetrics playbackMetrics) {
        this.d.reportPlaybackMetrics(playbackMetrics);
    }

    public final /* synthetic */ void f(NetworkEvent networkEvent) {
        this.d.reportNetworkEvent(networkEvent);
    }

    public final /* synthetic */ void g(PlaybackErrorEvent playbackErrorEvent) {
        this.d.reportPlaybackErrorEvent(playbackErrorEvent);
    }

    public final /* synthetic */ void h(PlaybackStateEvent playbackStateEvent) {
        this.d.reportPlaybackStateEvent(playbackStateEvent);
    }

    @Override // uj
    public final void i(fr6 fr6Var) {
        this.N = fr6Var.a;
    }

    @Override // uj
    public final void j(w83 w83Var) {
        this.P += w83Var.g;
        this.Q += w83Var.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0506  */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [kp] */
    /* JADX WARN: Type inference failed for: r9v18 */
    @Override // uj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(y54 y54Var, lv6 lv6Var) {
        boolean z;
        int i;
        byte b;
        byte b2;
        byte b3;
        byte b4;
        byte b5;
        byte b6;
        zw8 zw8Var;
        zw8 zw8Var2;
        byte b7;
        byte b8;
        byte b9;
        byte b10;
        byte b11;
        int i2;
        int i3;
        byte b12;
        ?? r9;
        byte b13;
        byte b14;
        fm4 fm4Var;
        qq3 qq3Var;
        int i4;
        if (((gi4) lv6Var.b).a.size() == 0) {
            return;
        }
        for (int i5 = 0; i5 < ((gi4) lv6Var.b).a.size(); i5++) {
            int a = ((gi4) lv6Var.b).a(i5);
            tj tjVar = (tj) ((SparseArray) lv6Var.c).get(a);
            tjVar.getClass();
            ub3 ub3Var = this.c;
            if (a == 0) {
                synchronized (ub3Var) {
                    ub3Var.d.getClass();
                    aob aobVar = ub3Var.e;
                    ub3Var.e = tjVar.b;
                    Iterator it = ub3Var.c.values().iterator();
                    while (it.hasNext()) {
                        tb3 tb3Var = (tb3) it.next();
                        if (!tb3Var.b(aobVar, ub3Var.e) || tb3Var.a(tjVar)) {
                            it.remove();
                            if (tb3Var.a.equals(ub3Var.f)) {
                                ub3Var.a(tb3Var);
                            }
                            if (tb3Var.e) {
                                ub3Var.d.p(tjVar, tb3Var.a);
                            }
                        }
                    }
                    ub3Var.e(tjVar);
                }
            } else if (a == 11) {
                ub3Var.g(tjVar, this.x);
            } else {
                ub3Var.f(tjVar);
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (lv6Var.m(0)) {
            tj tjVar2 = (tj) ((SparseArray) lv6Var.c).get(0);
            tjVar2.getClass();
            if (this.w != null) {
                m(tjVar2.b, tjVar2.d);
            }
        }
        if (lv6Var.m(2) && this.w != null) {
            km5 listIterator = y54Var.f0().a.listIterator(0);
            loop2: while (true) {
                if (!listIterator.hasNext()) {
                    qq3Var = null;
                    break;
                }
                dyb dybVar = (dyb) listIterator.next();
                for (int i6 = 0; i6 < dybVar.a; i6++) {
                    if (dybVar.e[i6] && (qq3Var = dybVar.b.d[i6].x) != null) {
                        break loop2;
                    }
                }
            }
            if (qq3Var != null) {
                PlaybackMetrics.Builder builder = this.w;
                String str = g8c.a;
                int i7 = 0;
                while (true) {
                    if (i7 >= qq3Var.d) {
                        i4 = 1;
                        break;
                    }
                    UUID uuid = qq3Var.a[i7].b;
                    if (uuid.equals(g51.e)) {
                        i4 = 3;
                        break;
                    } else if (uuid.equals(g51.f)) {
                        i4 = 2;
                        break;
                    } else {
                        if (uuid.equals(g51.d)) {
                            i4 = 6;
                            break;
                        }
                        i7++;
                    }
                }
                builder.setDrmType(i4);
            }
        }
        if (lv6Var.m(1011)) {
            this.R++;
        }
        j54 j54Var = this.F;
        if (j54Var == null) {
            b2 = 4;
            i3 = 2;
            b6 = 13;
            b = 8;
            b3 = 7;
            b4 = 6;
            b5 = 9;
        } else {
            int i8 = j54Var.a;
            Context context = this.a;
            boolean z2 = this.N == 4;
            if (i8 == 1001) {
                zw8Var = new zw8(20, 0, (byte) 1);
            } else {
                if (j54Var instanceof j54) {
                    z = j54Var.d == 1;
                    i = j54Var.n;
                } else {
                    z = false;
                    i = 0;
                }
                Throwable cause = j54Var.getCause();
                cause.getClass();
                if (!(cause instanceof IOException)) {
                    int i9 = 28;
                    b = 8;
                    b2 = 4;
                    b3 = 7;
                    b4 = 6;
                    b5 = 9;
                    if (z) {
                        if (i == 0 || i == 1) {
                            zw8Var = new zw8(35, 0, (byte) 1);
                        } else if (i == 3) {
                            zw8Var = new zw8(15, 0, (byte) 1);
                        } else if (i == 2) {
                            zw8Var = new zw8(23, 0, (byte) 1);
                        }
                        b6 = 13;
                        final PlaybackErrorEvent build = new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(zw8Var.b).setSubErrorCode(zw8Var.c).setException(j54Var).build();
                        this.b.execute(new Runnable() { // from class: nr6
                            @Override // java.lang.Runnable
                            public final void run() {
                                qr6.this.g(build);
                            }
                        });
                        this.S = true;
                        this.F = null;
                        i3 = 2;
                    }
                    if (cause instanceof jk6) {
                        b6 = 13;
                        zw8Var2 = new zw8(13, g8c.B(((jk6) cause).d), (byte) 1);
                    } else {
                        b6 = 13;
                        if (cause instanceof hk6) {
                            zw8Var = new zw8(14, ((hk6) cause).a, (byte) 1);
                        } else if (cause instanceof OutOfMemoryError) {
                            zw8Var = new zw8(14, 0, (byte) 1);
                        } else if (cause instanceof t30) {
                            zw8Var = new zw8(17, 0, (byte) 1);
                        } else if (cause instanceof w30) {
                            zw8Var2 = new zw8(18, ((w30) cause).a, (byte) 1);
                        } else if (cause instanceof MediaCodec.CryptoException) {
                            int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                            switch (g8c.A(errorCode)) {
                                case 6002:
                                    i9 = 24;
                                    break;
                                case 6003:
                                    break;
                                case 6004:
                                    i9 = 25;
                                    break;
                                case 6005:
                                    i9 = 26;
                                    break;
                                default:
                                    i9 = 27;
                                    break;
                            }
                            zw8Var2 = new zw8(i9, errorCode, (byte) 1);
                        } else {
                            zw8Var = new zw8(22, 0, (byte) 1);
                        }
                        final PlaybackErrorEvent build2 = new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(zw8Var.b).setSubErrorCode(zw8Var.c).setException(j54Var).build();
                        this.b.execute(new Runnable() { // from class: nr6
                            @Override // java.lang.Runnable
                            public final void run() {
                                qr6.this.g(build2);
                            }
                        });
                        this.S = true;
                        this.F = null;
                        i3 = 2;
                    }
                    zw8Var = zw8Var2;
                    final PlaybackErrorEvent build22 = new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(zw8Var.b).setSubErrorCode(zw8Var.c).setException(j54Var).build();
                    this.b.execute(new Runnable() { // from class: nr6
                        @Override // java.lang.Runnable
                        public final void run() {
                            qr6.this.g(build22);
                        }
                    });
                    this.S = true;
                    this.F = null;
                    i3 = 2;
                } else if (cause instanceof lg5) {
                    zw8Var = new zw8(5, ((lg5) cause).c, (byte) 1);
                } else {
                    if ((cause instanceof kg5) || (cause instanceof av7)) {
                        b7 = 9;
                        b8 = 7;
                        b9 = 6;
                        b10 = 4;
                        b11 = 8;
                        zw8Var = new zw8(z2 ? 10 : 11, 0, (byte) 1);
                    } else {
                        boolean z3 = cause instanceof jg5;
                        if (z3 || (cause instanceof k4c)) {
                            b7 = 9;
                            if (ev2.g(context).h() == 1) {
                                zw8Var = new zw8(3, 0, (byte) 1);
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    zw8Var = new zw8(6, 0, (byte) 1);
                                    b5 = 9;
                                    b4 = 6;
                                    b6 = 13;
                                    b = 8;
                                    b2 = 4;
                                    b3 = 7;
                                } else {
                                    b9 = 6;
                                    if (cause2 instanceof SocketTimeoutException) {
                                        zw8Var = new zw8(7, 0, (byte) 1);
                                        b5 = 9;
                                        b3 = 7;
                                        b4 = 6;
                                        b6 = 13;
                                        b = 8;
                                        b2 = 4;
                                    } else {
                                        b8 = 7;
                                        if (z3 && ((jg5) cause).b == 1) {
                                            zw8Var = new zw8(4, 0, (byte) 1);
                                            b5 = 9;
                                            b3 = 7;
                                            b4 = 6;
                                            b2 = 4;
                                            b6 = 13;
                                            b = 8;
                                        } else {
                                            b10 = 4;
                                            b11 = 8;
                                            zw8Var = new zw8(8, 0, (byte) 1);
                                        }
                                    }
                                }
                                final PlaybackErrorEvent build222 = new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(zw8Var.b).setSubErrorCode(zw8Var.c).setException(j54Var).build();
                                this.b.execute(new Runnable() { // from class: nr6
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        qr6.this.g(build222);
                                    }
                                });
                                this.S = true;
                                this.F = null;
                                i3 = 2;
                            }
                        } else if (i8 == 1002) {
                            zw8Var = new zw8(21, 0, (byte) 1);
                        } else if (cause instanceof rq3) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                int B = g8c.B(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                switch (g8c.A(B)) {
                                    case 6002:
                                        i2 = 24;
                                        break;
                                    case 6003:
                                        i2 = 28;
                                        break;
                                    case 6004:
                                        i2 = 25;
                                        break;
                                    case 6005:
                                        i2 = 26;
                                        break;
                                    default:
                                        i2 = 27;
                                        break;
                                }
                                zw8Var = new zw8(i2, B, (byte) 1);
                            } else {
                                zw8Var = cause3 instanceof MediaDrmResetException ? new zw8(27, 0, (byte) 1) : cause3 instanceof NotProvisionedException ? new zw8(24, 0, (byte) 1) : cause3 instanceof DeniedByServerException ? new zw8(29, 0, (byte) 1) : cause3 instanceof g6c ? new zw8(23, 0, (byte) 1) : cause3 instanceof ba3 ? new zw8(28, 0, (byte) 1) : new zw8(30, 0, (byte) 1);
                            }
                        } else if ((cause instanceof z84) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            zw8Var = ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new zw8(32, 0, (byte) 1) : new zw8(31, 0, (byte) 1);
                        } else {
                            b7 = 9;
                            zw8Var = new zw8(9, 0, (byte) 1);
                        }
                        b5 = b7;
                        b6 = 13;
                        b = 8;
                        b2 = 4;
                        b3 = 7;
                        b4 = 6;
                        final PlaybackErrorEvent build2222 = new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(zw8Var.b).setSubErrorCode(zw8Var.c).setException(j54Var).build();
                        this.b.execute(new Runnable() { // from class: nr6
                            @Override // java.lang.Runnable
                            public final void run() {
                                qr6.this.g(build2222);
                            }
                        });
                        this.S = true;
                        this.F = null;
                        i3 = 2;
                    }
                    b5 = b7;
                    b3 = b8;
                    b4 = b9;
                    b2 = b10;
                    b = b11;
                    b6 = 13;
                    final PlaybackErrorEvent build22222 = new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(zw8Var.b).setSubErrorCode(zw8Var.c).setException(j54Var).build();
                    this.b.execute(new Runnable() { // from class: nr6
                        @Override // java.lang.Runnable
                        public final void run() {
                            qr6.this.g(build22222);
                        }
                    });
                    this.S = true;
                    this.F = null;
                    i3 = 2;
                }
            }
            b6 = 13;
            b = 8;
            b2 = 4;
            b3 = 7;
            b4 = 6;
            b5 = 9;
            final PlaybackErrorEvent build222222 = new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(zw8Var.b).setSubErrorCode(zw8Var.c).setException(j54Var).build();
            this.b.execute(new Runnable() { // from class: nr6
                @Override // java.lang.Runnable
                public final void run() {
                    qr6.this.g(build222222);
                }
            });
            this.S = true;
            this.F = null;
            i3 = 2;
        }
        if (lv6Var.m(i3)) {
            eyb f0 = y54Var.f0();
            boolean a2 = f0.a(i3);
            boolean a3 = f0.a(1);
            boolean a4 = f0.a(3);
            if (a2 || a3 || a4) {
                if (a2) {
                    b12 = b2;
                    fm4Var = null;
                } else {
                    fm4Var = null;
                    if (Objects.equals(this.J, null)) {
                        b12 = b2;
                    } else {
                        int i10 = this.J == null ? 1 : 0;
                        this.J = null;
                        b12 = b2;
                        q(1, elapsedRealtime, null, i10);
                    }
                }
                if (!a3 && !Objects.equals(this.K, fm4Var)) {
                    int i11 = this.K == null ? 1 : 0;
                    this.K = fm4Var;
                    q(0, elapsedRealtime, fm4Var, i11);
                }
                if (!a4 && !Objects.equals(this.L, fm4Var)) {
                    int i12 = this.L == null ? 1 : 0;
                    this.L = fm4Var;
                    q(2, elapsedRealtime, fm4Var, i12);
                }
                r9 = fm4Var;
                if (a(this.G)) {
                    kp kpVar = this.G;
                    fm4 fm4Var2 = (fm4) kpVar.c;
                    if (fm4Var2.B != -1) {
                        int i13 = kpVar.b;
                        if (!Objects.equals(this.J, fm4Var2)) {
                            int i14 = (this.J == null && i13 == 0) ? 1 : i13;
                            this.J = fm4Var2;
                            q(1, elapsedRealtime, fm4Var2, i14);
                        }
                        this.G = r9;
                    }
                }
                if (a(this.H)) {
                    kp kpVar2 = this.H;
                    fm4 fm4Var3 = (fm4) kpVar2.c;
                    int i15 = kpVar2.b;
                    if (!Objects.equals(this.K, fm4Var3)) {
                        int i16 = (this.K == null && i15 == 0) ? 1 : i15;
                        this.K = fm4Var3;
                        q(0, elapsedRealtime, fm4Var3, i16);
                    }
                    this.H = r9;
                }
                if (a(this.I)) {
                    kp kpVar3 = this.I;
                    fm4 fm4Var4 = (fm4) kpVar3.c;
                    int i17 = kpVar3.b;
                    if (!Objects.equals(this.L, fm4Var4)) {
                        int i18 = (this.L == null && i17 == 0) ? 1 : i17;
                        this.L = fm4Var4;
                        q(2, elapsedRealtime, fm4Var4, i18);
                    }
                    this.I = r9;
                }
                switch (ev2.g(this.a).h()) {
                    case 0:
                        b13 = 0;
                        break;
                    case 1:
                        b13 = b5;
                        break;
                    case 2:
                        b13 = 2;
                        break;
                    case 3:
                        b13 = b12;
                        break;
                    case 4:
                        b13 = 5;
                        break;
                    case 5:
                        b13 = b4;
                        break;
                    case 6:
                    case 8:
                    default:
                        b13 = 1;
                        break;
                    case 7:
                        b13 = 3;
                        break;
                    case 9:
                        b13 = b;
                        break;
                    case 10:
                        b13 = b3;
                        break;
                }
                if (b13 != this.E) {
                    this.E = b13;
                    final NetworkEvent build3 = new NetworkEvent.Builder().setNetworkType(b13).setTimeSinceCreatedMillis(elapsedRealtime - this.e).build();
                    this.b.execute(new Runnable() { // from class: mr6
                        @Override // java.lang.Runnable
                        public final void run() {
                            qr6.this.f(build3);
                        }
                    });
                }
                if (y54Var.h() != 2) {
                    this.M = false;
                }
                if (y54Var.U() != null) {
                    this.O = false;
                    b14 = 10;
                } else {
                    b14 = 10;
                    if (lv6Var.m(10)) {
                        this.O = true;
                    }
                }
                int h = y54Var.h();
                if (!this.M) {
                    b6 = 5;
                } else if (!this.O) {
                    if (h == b12) {
                        b6 = 11;
                    } else {
                        b6 = 12;
                        if (h == 2) {
                            byte b15 = this.y;
                            if (b15 == 0 || b15 == 2 || b15 == 12) {
                                b6 = 2;
                            } else if (y54Var.s()) {
                                if (y54Var.v0() == 0) {
                                    b6 = b4;
                                }
                                b6 = b14;
                            } else {
                                b6 = b3;
                            }
                        } else {
                            b14 = 3;
                            if (h == 3) {
                                if (y54Var.s()) {
                                    if (y54Var.v0() != 0) {
                                        b6 = b5;
                                    }
                                    b6 = b14;
                                } else {
                                    b6 = b12;
                                }
                            } else if (h != 1 || this.y == 0) {
                                b6 = this.y;
                            }
                        }
                    }
                }
                if (this.y != b6) {
                    this.y = b6;
                    this.S = true;
                    final PlaybackStateEvent build4 = new PlaybackStateEvent.Builder().setState(this.y).setTimeSinceCreatedMillis(elapsedRealtime - this.e).build();
                    this.b.execute(new Runnable() { // from class: pr6
                        @Override // java.lang.Runnable
                        public final void run() {
                            qr6.this.h(build4);
                        }
                    });
                }
                if (lv6Var.m(1028)) {
                    return;
                }
                ub3 ub3Var2 = this.c;
                tj tjVar3 = (tj) ((SparseArray) lv6Var.c).get(1028);
                tjVar3.getClass();
                ub3Var2.b(tjVar3);
                return;
            }
        }
        b12 = b2;
        r9 = 0;
        if (a(this.G)) {
        }
        if (a(this.H)) {
        }
        if (a(this.I)) {
        }
        switch (ev2.g(this.a).h()) {
        }
        if (b13 != this.E) {
        }
        if (y54Var.h() != 2) {
        }
        if (y54Var.U() != null) {
        }
        int h2 = y54Var.h();
        if (!this.M) {
        }
        if (this.y != b6) {
        }
        if (lv6Var.m(1028)) {
        }
    }

    public final /* synthetic */ void l(TrackChangeEvent trackChangeEvent) {
        this.d.reportTrackChangeEvent(trackChangeEvent);
    }

    public final void m(aob aobVar, rx6 rx6Var) {
        int b;
        PlaybackMetrics.Builder builder = this.w;
        if (rx6Var == null || (b = aobVar.b(rx6Var.a)) == -1) {
            return;
        }
        xnb xnbVar = this.h;
        int i = 0;
        aobVar.f(b, xnbVar, false);
        int i2 = xnbVar.c;
        znb znbVar = this.f;
        aobVar.n(i2, znbVar);
        xq6 xq6Var = znbVar.b.b;
        if (xq6Var != null) {
            int M = g8c.M(xq6Var.a, xq6Var.b);
            i = M != 0 ? M != 1 ? M != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i);
        if (znbVar.l != -9223372036854775807L && !znbVar.j && !znbVar.h && !znbVar.a()) {
            builder.setMediaDurationMillis(g8c.i0(znbVar.l));
        }
        builder.setPlaybackType(znbVar.a() ? 2 : 1);
        this.S = true;
    }

    @Override // uj
    public final void n(tj tjVar, int i, long j) {
        rx6 rx6Var = tjVar.d;
        if (rx6Var != null) {
            String d = this.c.d(tjVar.b, rx6Var);
            HashMap hashMap = this.r;
            Long l = (Long) hashMap.get(d);
            HashMap hashMap2 = this.n;
            Long l2 = (Long) hashMap2.get(d);
            hashMap.put(d, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            hashMap2.put(d, Long.valueOf((l2 != null ? l2.longValue() : 0L) + i));
        }
    }

    public final void o(tj tjVar, String str) {
        rx6 rx6Var = tjVar.d;
        if (rx6Var == null || !rx6Var.c()) {
            c();
            this.s = str;
            this.w = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.11.1");
            m(tjVar.b, rx6Var);
        }
    }

    public final void p(tj tjVar, String str) {
        rx6 rx6Var = tjVar.d;
        if ((rx6Var == null || !rx6Var.c()) && str.equals(this.s)) {
            c();
        }
        this.n.remove(str);
        this.r.remove(str);
    }

    public final void q(int i, long j, fm4 fm4Var, int i2) {
        int i3;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.e);
        if (fm4Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i2 != 1) {
                i3 = 3;
                if (i2 != 2) {
                    i3 = i2 != 3 ? 1 : 4;
                }
            } else {
                i3 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i3);
            String str = fm4Var.s;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = fm4Var.t;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = fm4Var.l;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i4 = fm4Var.k;
            if (i4 != -1) {
                timeSinceCreatedMillis.setBitrate(i4);
            }
            int i5 = fm4Var.A;
            if (i5 != -1) {
                timeSinceCreatedMillis.setWidth(i5);
            }
            int i6 = fm4Var.B;
            if (i6 != -1) {
                timeSinceCreatedMillis.setHeight(i6);
            }
            int i7 = fm4Var.N;
            if (i7 != -1) {
                timeSinceCreatedMillis.setChannelCount(i7);
            }
            int i8 = fm4Var.P;
            if (i8 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i8);
            }
            String str4 = fm4Var.d;
            if (str4 != null) {
                String str5 = g8c.a;
                String[] split = str4.split("-", -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = fm4Var.F;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.S = true;
        final TrackChangeEvent build = timeSinceCreatedMillis.build();
        this.b.execute(new Runnable() { // from class: lr6
            @Override // java.lang.Runnable
            public final void run() {
                qr6.this.l(build);
            }
        });
    }

    @Override // uj
    public final void s(icc iccVar) {
        kp kpVar = this.G;
        if (kpVar != null) {
            fm4 fm4Var = (fm4) kpVar.c;
            if (fm4Var.B == -1) {
                em4 a = fm4Var.a();
                a.z = iccVar.a;
                a.A = iccVar.b;
                this.G = new kp(new fm4(a), kpVar.b, (String) kpVar.d);
            }
        }
    }

    @Override // uj
    public final void u(j54 j54Var) {
        this.F = j54Var;
    }

    @Override // uj
    public final void w(tj tjVar, fr6 fr6Var) {
        rx6 rx6Var = tjVar.d;
        if (rx6Var != null) {
            fm4 fm4Var = fr6Var.c;
            fm4Var.getClass();
            int i = fr6Var.d;
            aob aobVar = tjVar.b;
            rx6Var.getClass();
            kp kpVar = new kp(fm4Var, i, this.c.d(aobVar, rx6Var));
            int i2 = fr6Var.b;
            if (i2 != 0) {
                if (i2 == 1) {
                    this.H = kpVar;
                    return;
                } else if (i2 != 2) {
                    if (i2 != 3) {
                        return;
                    }
                    this.I = kpVar;
                    return;
                }
            }
            this.G = kpVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // uj
    public final void y(tj tjVar, int i) {
        if (i == 1) {
            this.M = true;
        }
        this.x = i;
    }

    @Override // uj
    public final void onRenderedFirstFrame(tj tjVar) {
    }

    @Override // uj
    public final void onSeekStarted(tj tjVar) {
    }
}
