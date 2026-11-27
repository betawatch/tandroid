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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class vt6 implements vj {
    public e64 F;
    public lp G;
    public lp H;
    public lp I;
    public ko4 J;
    public ko4 K;
    public ko4 L;
    public boolean M;
    public byte N;
    public boolean O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public final Context a;
    public final nc3 c;
    public final PlaybackSession d;
    public String s;
    public PlaybackMetrics.Builder w;
    public byte x;
    public final Executor b = rd0.a();
    public final zrb f = new zrb();
    public final xrb h = new xrb();
    public final HashMap r = new HashMap();
    public final HashMap n = new HashMap();
    public final long e = SystemClock.elapsedRealtime();
    public byte y = 0;
    public byte E = 0;

    public vt6(Context context, PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.d = playbackSession;
        nc3 nc3Var = new nc3();
        this.c = nc3Var;
        nc3Var.d = this;
    }

    public static vt6 b(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new vt6(context, mediaMetricsManager.createPlaybackSession());
    }

    public final boolean a(lp lpVar) {
        String str;
        if (lpVar == null) {
            return false;
        }
        String str2 = (String) lpVar.d;
        nc3 nc3Var = this.c;
        synchronized (nc3Var) {
            str = nc3Var.f;
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
            this.b.execute(new Runnable() { // from class: tt6
                @Override // java.lang.Runnable
                public final void run() {
                    vt6.this.e(build);
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

    @Override // vj
    public final void i(jt6 jt6Var) {
        this.N = jt6Var.a;
    }

    @Override // vj
    public final void j(p93 p93Var) {
        this.P += p93Var.g;
        this.Q += p93Var.e;
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
    /* JADX WARN: Type inference failed for: r9v16, types: [lp] */
    /* JADX WARN: Type inference failed for: r9v18 */
    @Override // vj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(s64 s64Var, qx6 qx6Var) {
        boolean z;
        int i;
        byte b;
        byte b2;
        byte b3;
        byte b4;
        byte b5;
        byte b6;
        l09 l09Var;
        l09 l09Var2;
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
        ko4 ko4Var;
        hr3 hr3Var;
        int i4;
        if (((lk4) qx6Var.b).a.size() == 0) {
            return;
        }
        for (int i5 = 0; i5 < ((lk4) qx6Var.b).a.size(); i5++) {
            int a = ((lk4) qx6Var.b).a(i5);
            uj ujVar = (uj) ((SparseArray) qx6Var.c).get(a);
            ujVar.getClass();
            nc3 nc3Var = this.c;
            if (a == 0) {
                synchronized (nc3Var) {
                    nc3Var.d.getClass();
                    asb asbVar = nc3Var.e;
                    nc3Var.e = ujVar.b;
                    Iterator it = nc3Var.c.values().iterator();
                    while (it.hasNext()) {
                        mc3 mc3Var = (mc3) it.next();
                        if (!mc3Var.b(asbVar, nc3Var.e) || mc3Var.a(ujVar)) {
                            it.remove();
                            if (mc3Var.a.equals(nc3Var.f)) {
                                nc3Var.a(mc3Var);
                            }
                            if (mc3Var.e) {
                                nc3Var.d.p(ujVar, mc3Var.a);
                            }
                        }
                    }
                    nc3Var.e(ujVar);
                }
            } else if (a == 11) {
                nc3Var.g(ujVar, this.x);
            } else {
                nc3Var.f(ujVar);
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (qx6Var.n(0)) {
            uj ujVar2 = (uj) ((SparseArray) qx6Var.c).get(0);
            ujVar2.getClass();
            if (this.w != null) {
                m(ujVar2.b, ujVar2.d);
            }
        }
        if (qx6Var.n(2) && this.w != null) {
            no5 listIterator = s64Var.f0().a.listIterator(0);
            loop2: while (true) {
                if (!listIterator.hasNext()) {
                    hr3Var = null;
                    break;
                }
                e2c e2cVar = (e2c) listIterator.next();
                for (int i6 = 0; i6 < e2cVar.a; i6++) {
                    if (e2cVar.e[i6] && (hr3Var = e2cVar.b.d[i6].x) != null) {
                        break loop2;
                    }
                }
            }
            if (hr3Var != null) {
                PlaybackMetrics.Builder builder = this.w;
                String str = gcc.a;
                int i7 = 0;
                while (true) {
                    if (i7 >= hr3Var.d) {
                        i4 = 1;
                        break;
                    }
                    UUID uuid = hr3Var.a[i7].b;
                    if (uuid.equals(o51.e)) {
                        i4 = 3;
                        break;
                    } else if (uuid.equals(o51.f)) {
                        i4 = 2;
                        break;
                    } else {
                        if (uuid.equals(o51.d)) {
                            i4 = 6;
                            break;
                        }
                        i7++;
                    }
                }
                builder.setDrmType(i4);
            }
        }
        if (qx6Var.n(1011)) {
            this.R++;
        }
        e64 e64Var = this.F;
        if (e64Var == null) {
            b2 = 4;
            i3 = 2;
            b6 = 13;
            b = 8;
            b3 = 7;
            b4 = 6;
            b5 = 9;
        } else {
            int i8 = e64Var.a;
            Context context = this.a;
            boolean z2 = this.N == 4;
            if (i8 == 1001) {
                l09Var = new l09(20, 0, (byte) 1);
            } else {
                if (e64Var instanceof e64) {
                    z = e64Var.d == 1;
                    i = e64Var.n;
                } else {
                    z = false;
                    i = 0;
                }
                Throwable cause = e64Var.getCause();
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
                            l09Var = new l09(35, 0, (byte) 1);
                        } else if (i == 3) {
                            l09Var = new l09(15, 0, (byte) 1);
                        } else if (i == 2) {
                            l09Var = new l09(23, 0, (byte) 1);
                        }
                        b6 = 13;
                        final PlaybackErrorEvent build = new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(l09Var.b).setSubErrorCode(l09Var.c).setException(e64Var).build();
                        this.b.execute(new Runnable() { // from class: st6
                            @Override // java.lang.Runnable
                            public final void run() {
                                vt6.this.g(build);
                            }
                        });
                        this.S = true;
                        this.F = null;
                        i3 = 2;
                    }
                    if (cause instanceof om6) {
                        b6 = 13;
                        l09Var2 = new l09(13, gcc.B(((om6) cause).d), (byte) 1);
                    } else {
                        b6 = 13;
                        if (cause instanceof mm6) {
                            l09Var = new l09(14, ((mm6) cause).a, (byte) 1);
                        } else if (cause instanceof OutOfMemoryError) {
                            l09Var = new l09(14, 0, (byte) 1);
                        } else if (cause instanceof u30) {
                            l09Var = new l09(17, 0, (byte) 1);
                        } else if (cause instanceof x30) {
                            l09Var2 = new l09(18, ((x30) cause).a, (byte) 1);
                        } else if (cause instanceof MediaCodec.CryptoException) {
                            int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                            switch (gcc.A(errorCode)) {
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
                            l09Var2 = new l09(i9, errorCode, (byte) 1);
                        } else {
                            l09Var = new l09(22, 0, (byte) 1);
                        }
                        final PlaybackErrorEvent build2 = new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(l09Var.b).setSubErrorCode(l09Var.c).setException(e64Var).build();
                        this.b.execute(new Runnable() { // from class: st6
                            @Override // java.lang.Runnable
                            public final void run() {
                                vt6.this.g(build2);
                            }
                        });
                        this.S = true;
                        this.F = null;
                        i3 = 2;
                    }
                    l09Var = l09Var2;
                    final PlaybackErrorEvent build22 = new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(l09Var.b).setSubErrorCode(l09Var.c).setException(e64Var).build();
                    this.b.execute(new Runnable() { // from class: st6
                        @Override // java.lang.Runnable
                        public final void run() {
                            vt6.this.g(build22);
                        }
                    });
                    this.S = true;
                    this.F = null;
                    i3 = 2;
                } else if (cause instanceof ni5) {
                    l09Var = new l09(5, ((ni5) cause).c, (byte) 1);
                } else {
                    if ((cause instanceof mi5) || (cause instanceof hy7)) {
                        b7 = 9;
                        b8 = 7;
                        b9 = 6;
                        b10 = 4;
                        b11 = 8;
                        l09Var = new l09(z2 ? 10 : 11, 0, (byte) 1);
                    } else {
                        boolean z3 = cause instanceof li5;
                        if (z3 || (cause instanceof j8c)) {
                            b7 = 9;
                            if (yv2.g(context).h() == 1) {
                                l09Var = new l09(3, 0, (byte) 1);
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    l09Var = new l09(6, 0, (byte) 1);
                                    b5 = 9;
                                    b4 = 6;
                                    b6 = 13;
                                    b = 8;
                                    b2 = 4;
                                    b3 = 7;
                                } else {
                                    b9 = 6;
                                    if (cause2 instanceof SocketTimeoutException) {
                                        l09Var = new l09(7, 0, (byte) 1);
                                        b5 = 9;
                                        b3 = 7;
                                        b4 = 6;
                                        b6 = 13;
                                        b = 8;
                                        b2 = 4;
                                    } else {
                                        b8 = 7;
                                        if (z3 && ((li5) cause).b == 1) {
                                            l09Var = new l09(4, 0, (byte) 1);
                                            b5 = 9;
                                            b3 = 7;
                                            b4 = 6;
                                            b2 = 4;
                                            b6 = 13;
                                            b = 8;
                                        } else {
                                            b10 = 4;
                                            b11 = 8;
                                            l09Var = new l09(8, 0, (byte) 1);
                                        }
                                    }
                                }
                                final PlaybackErrorEvent build222 = new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(l09Var.b).setSubErrorCode(l09Var.c).setException(e64Var).build();
                                this.b.execute(new Runnable() { // from class: st6
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        vt6.this.g(build222);
                                    }
                                });
                                this.S = true;
                                this.F = null;
                                i3 = 2;
                            }
                        } else if (i8 == 1002) {
                            l09Var = new l09(21, 0, (byte) 1);
                        } else if (cause instanceof ir3) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                int B = gcc.B(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                switch (gcc.A(B)) {
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
                                l09Var = new l09(i2, B, (byte) 1);
                            } else {
                                l09Var = cause3 instanceof MediaDrmResetException ? new l09(27, 0, (byte) 1) : cause3 instanceof NotProvisionedException ? new l09(24, 0, (byte) 1) : cause3 instanceof DeniedByServerException ? new l09(29, 0, (byte) 1) : cause3 instanceof gac ? new l09(23, 0, (byte) 1) : cause3 instanceof ua3 ? new l09(28, 0, (byte) 1) : new l09(30, 0, (byte) 1);
                            }
                        } else if ((cause instanceof va4) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            l09Var = ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new l09(32, 0, (byte) 1) : new l09(31, 0, (byte) 1);
                        } else {
                            b7 = 9;
                            l09Var = new l09(9, 0, (byte) 1);
                        }
                        b5 = b7;
                        b6 = 13;
                        b = 8;
                        b2 = 4;
                        b3 = 7;
                        b4 = 6;
                        final PlaybackErrorEvent build2222 = new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(l09Var.b).setSubErrorCode(l09Var.c).setException(e64Var).build();
                        this.b.execute(new Runnable() { // from class: st6
                            @Override // java.lang.Runnable
                            public final void run() {
                                vt6.this.g(build2222);
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
                    final PlaybackErrorEvent build22222 = new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(l09Var.b).setSubErrorCode(l09Var.c).setException(e64Var).build();
                    this.b.execute(new Runnable() { // from class: st6
                        @Override // java.lang.Runnable
                        public final void run() {
                            vt6.this.g(build22222);
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
            final PlaybackErrorEvent build222222 = new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(l09Var.b).setSubErrorCode(l09Var.c).setException(e64Var).build();
            this.b.execute(new Runnable() { // from class: st6
                @Override // java.lang.Runnable
                public final void run() {
                    vt6.this.g(build222222);
                }
            });
            this.S = true;
            this.F = null;
            i3 = 2;
        }
        if (qx6Var.n(i3)) {
            f2c f0 = s64Var.f0();
            boolean a2 = f0.a(i3);
            boolean a3 = f0.a(1);
            boolean a4 = f0.a(3);
            if (a2 || a3 || a4) {
                if (a2) {
                    b12 = b2;
                    ko4Var = null;
                } else {
                    ko4Var = null;
                    if (Objects.equals(this.J, null)) {
                        b12 = b2;
                    } else {
                        int i10 = this.J == null ? 1 : 0;
                        this.J = null;
                        b12 = b2;
                        q(1, elapsedRealtime, null, i10);
                    }
                }
                if (!a3 && !Objects.equals(this.K, ko4Var)) {
                    int i11 = this.K == null ? 1 : 0;
                    this.K = ko4Var;
                    q(0, elapsedRealtime, ko4Var, i11);
                }
                if (!a4 && !Objects.equals(this.L, ko4Var)) {
                    int i12 = this.L == null ? 1 : 0;
                    this.L = ko4Var;
                    q(2, elapsedRealtime, ko4Var, i12);
                }
                r9 = ko4Var;
                if (a(this.G)) {
                    lp lpVar = this.G;
                    ko4 ko4Var2 = (ko4) lpVar.c;
                    if (ko4Var2.B != -1) {
                        int i13 = lpVar.b;
                        if (!Objects.equals(this.J, ko4Var2)) {
                            int i14 = (this.J == null && i13 == 0) ? 1 : i13;
                            this.J = ko4Var2;
                            q(1, elapsedRealtime, ko4Var2, i14);
                        }
                        this.G = r9;
                    }
                }
                if (a(this.H)) {
                    lp lpVar2 = this.H;
                    ko4 ko4Var3 = (ko4) lpVar2.c;
                    int i15 = lpVar2.b;
                    if (!Objects.equals(this.K, ko4Var3)) {
                        int i16 = (this.K == null && i15 == 0) ? 1 : i15;
                        this.K = ko4Var3;
                        q(0, elapsedRealtime, ko4Var3, i16);
                    }
                    this.H = r9;
                }
                if (a(this.I)) {
                    lp lpVar3 = this.I;
                    ko4 ko4Var4 = (ko4) lpVar3.c;
                    int i17 = lpVar3.b;
                    if (!Objects.equals(this.L, ko4Var4)) {
                        int i18 = (this.L == null && i17 == 0) ? 1 : i17;
                        this.L = ko4Var4;
                        q(2, elapsedRealtime, ko4Var4, i18);
                    }
                    this.I = r9;
                }
                switch (yv2.g(this.a).h()) {
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
                    this.b.execute(new Runnable() { // from class: rt6
                        @Override // java.lang.Runnable
                        public final void run() {
                            vt6.this.f(build3);
                        }
                    });
                }
                if (s64Var.h() != 2) {
                    this.M = false;
                }
                if (s64Var.U() != null) {
                    this.O = false;
                    b14 = 10;
                } else {
                    b14 = 10;
                    if (qx6Var.n(10)) {
                        this.O = true;
                    }
                }
                int h = s64Var.h();
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
                            } else if (s64Var.s()) {
                                if (s64Var.v0() == 0) {
                                    b6 = b4;
                                }
                                b6 = b14;
                            } else {
                                b6 = b3;
                            }
                        } else {
                            b14 = 3;
                            if (h == 3) {
                                if (s64Var.s()) {
                                    if (s64Var.v0() != 0) {
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
                    this.b.execute(new Runnable() { // from class: ut6
                        @Override // java.lang.Runnable
                        public final void run() {
                            vt6.this.h(build4);
                        }
                    });
                }
                if (qx6Var.n(1028)) {
                    return;
                }
                nc3 nc3Var2 = this.c;
                uj ujVar3 = (uj) ((SparseArray) qx6Var.c).get(1028);
                ujVar3.getClass();
                nc3Var2.b(ujVar3);
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
        switch (yv2.g(this.a).h()) {
        }
        if (b13 != this.E) {
        }
        if (s64Var.h() != 2) {
        }
        if (s64Var.U() != null) {
        }
        int h2 = s64Var.h();
        if (!this.M) {
        }
        if (this.y != b6) {
        }
        if (qx6Var.n(1028)) {
        }
    }

    public final /* synthetic */ void l(TrackChangeEvent trackChangeEvent) {
        this.d.reportTrackChangeEvent(trackChangeEvent);
    }

    public final void m(asb asbVar, vz6 vz6Var) {
        int b;
        PlaybackMetrics.Builder builder = this.w;
        if (vz6Var == null || (b = asbVar.b(vz6Var.a)) == -1) {
            return;
        }
        xrb xrbVar = this.h;
        int i = 0;
        asbVar.f(b, xrbVar, false);
        int i2 = xrbVar.c;
        zrb zrbVar = this.f;
        asbVar.n(i2, zrbVar);
        bt6 bt6Var = zrbVar.b.b;
        if (bt6Var != null) {
            int M = gcc.M(bt6Var.a, bt6Var.b);
            i = M != 0 ? M != 1 ? M != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i);
        if (zrbVar.l != -9223372036854775807L && !zrbVar.j && !zrbVar.h && !zrbVar.a()) {
            builder.setMediaDurationMillis(gcc.i0(zrbVar.l));
        }
        builder.setPlaybackType(zrbVar.a() ? 2 : 1);
        this.S = true;
    }

    @Override // vj
    public final void n(uj ujVar, int i, long j) {
        vz6 vz6Var = ujVar.d;
        if (vz6Var != null) {
            String d = this.c.d(ujVar.b, vz6Var);
            HashMap hashMap = this.r;
            Long l = (Long) hashMap.get(d);
            HashMap hashMap2 = this.n;
            Long l2 = (Long) hashMap2.get(d);
            hashMap.put(d, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            hashMap2.put(d, Long.valueOf((l2 != null ? l2.longValue() : 0L) + i));
        }
    }

    public final void o(uj ujVar, String str) {
        vz6 vz6Var = ujVar.d;
        if (vz6Var == null || !vz6Var.c()) {
            c();
            this.s = str;
            this.w = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.11.1");
            m(ujVar.b, vz6Var);
        }
    }

    public final void p(uj ujVar, String str) {
        vz6 vz6Var = ujVar.d;
        if ((vz6Var == null || !vz6Var.c()) && str.equals(this.s)) {
            c();
        }
        this.n.remove(str);
        this.r.remove(str);
    }

    public final void q(int i, long j, ko4 ko4Var, int i2) {
        int i3;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.e);
        if (ko4Var != null) {
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
            String str = ko4Var.s;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = ko4Var.t;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = ko4Var.l;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i4 = ko4Var.k;
            if (i4 != -1) {
                timeSinceCreatedMillis.setBitrate(i4);
            }
            int i5 = ko4Var.A;
            if (i5 != -1) {
                timeSinceCreatedMillis.setWidth(i5);
            }
            int i6 = ko4Var.B;
            if (i6 != -1) {
                timeSinceCreatedMillis.setHeight(i6);
            }
            int i7 = ko4Var.N;
            if (i7 != -1) {
                timeSinceCreatedMillis.setChannelCount(i7);
            }
            int i8 = ko4Var.P;
            if (i8 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i8);
            }
            String str4 = ko4Var.d;
            if (str4 != null) {
                String str5 = gcc.a;
                String[] split = str4.split("-", -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = ko4Var.F;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.S = true;
        final TrackChangeEvent build = timeSinceCreatedMillis.build();
        this.b.execute(new Runnable() { // from class: qt6
            @Override // java.lang.Runnable
            public final void run() {
                vt6.this.l(build);
            }
        });
    }

    @Override // vj
    public final void s(ggc ggcVar) {
        lp lpVar = this.G;
        if (lpVar != null) {
            ko4 ko4Var = (ko4) lpVar.c;
            if (ko4Var.B == -1) {
                jo4 a = ko4Var.a();
                a.z = ggcVar.a;
                a.A = ggcVar.b;
                this.G = new lp(new ko4(a), lpVar.b, (String) lpVar.d);
            }
        }
    }

    @Override // vj
    public final void u(e64 e64Var) {
        this.F = e64Var;
    }

    @Override // vj
    public final void w(uj ujVar, jt6 jt6Var) {
        vz6 vz6Var = ujVar.d;
        if (vz6Var != null) {
            ko4 ko4Var = jt6Var.c;
            ko4Var.getClass();
            int i = jt6Var.d;
            asb asbVar = ujVar.b;
            vz6Var.getClass();
            lp lpVar = new lp(ko4Var, i, this.c.d(asbVar, vz6Var));
            int i2 = jt6Var.b;
            if (i2 != 0) {
                if (i2 == 1) {
                    this.H = lpVar;
                    return;
                } else if (i2 != 2) {
                    if (i2 != 3) {
                        return;
                    }
                    this.I = lpVar;
                    return;
                }
            }
            this.G = lpVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vj
    public final void y(uj ujVar, int i) {
        if (i == 1) {
            this.M = true;
        }
        this.x = i;
    }

    @Override // vj
    public final void onRenderedFirstFrame(uj ujVar) {
    }

    @Override // vj
    public final void onSeekStarted(uj ujVar) {
    }
}
