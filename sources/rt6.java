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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class rt6 implements uk {
    public u64 F;
    public kq G;
    public kq H;
    public kq I;
    public go4 J;
    public go4 K;
    public go4 L;
    public boolean M;
    public byte N;
    public boolean O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public final Context a;
    public final gd3 c;
    public final PlaybackSession d;
    public String s;
    public PlaybackMetrics.Builder w;
    public byte x;
    public final Executor b = pe0.a();
    public final aqb f = new aqb();
    public final ypb h = new ypb();
    public final HashMap r = new HashMap();
    public final HashMap n = new HashMap();
    public final long e = SystemClock.elapsedRealtime();
    public byte y = 0;
    public byte E = 0;

    public rt6(Context context, PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.d = playbackSession;
        gd3 gd3Var = new gd3();
        this.c = gd3Var;
        gd3Var.d = this;
    }

    public static rt6 b(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new rt6(context, mediaMetricsManager.createPlaybackSession());
    }

    public final boolean a(kq kqVar) {
        String str;
        if (kqVar == null) {
            return false;
        }
        String str2 = (String) kqVar.d;
        gd3 gd3Var = this.c;
        synchronized (gd3Var) {
            str = gd3Var.f;
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
            this.b.execute(new Runnable() { // from class: pt6
                @Override // java.lang.Runnable
                public final void run() {
                    rt6.this.e(build);
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

    @Override // uk
    public final void i(ft6 ft6Var) {
        this.N = ft6Var.a;
    }

    @Override // uk
    public final void j(ia3 ia3Var) {
        this.P += ia3Var.g;
        this.Q += ia3Var.e;
    }

    @Override // uk
    public final void k(tk tkVar, int i, long j) {
        rz6 rz6Var = tkVar.d;
        if (rz6Var != null) {
            String d = this.c.d(tkVar.b, rz6Var);
            HashMap hashMap = this.r;
            Long l = (Long) hashMap.get(d);
            HashMap hashMap2 = this.n;
            Long l2 = (Long) hashMap2.get(d);
            hashMap.put(d, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            hashMap2.put(d, Long.valueOf((l2 != null ? l2.longValue() : 0L) + i));
        }
    }

    public final /* synthetic */ void l(TrackChangeEvent trackChangeEvent) {
        this.d.reportTrackChangeEvent(trackChangeEvent);
    }

    public final void m(bqb bqbVar, rz6 rz6Var) {
        int b;
        PlaybackMetrics.Builder builder = this.w;
        if (rz6Var == null || (b = bqbVar.b(rz6Var.a)) == -1) {
            return;
        }
        ypb ypbVar = this.h;
        int i = 0;
        bqbVar.f(b, ypbVar, false);
        int i2 = ypbVar.c;
        aqb aqbVar = this.f;
        bqbVar.n(i2, aqbVar);
        xs6 xs6Var = aqbVar.b.b;
        if (xs6Var != null) {
            int M = hac.M(xs6Var.a, xs6Var.b);
            i = M != 0 ? M != 1 ? M != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i);
        if (aqbVar.l != -9223372036854775807L && !aqbVar.j && !aqbVar.h && !aqbVar.a()) {
            builder.setMediaDurationMillis(hac.i0(aqbVar.l));
        }
        builder.setPlaybackType(aqbVar.a() ? 2 : 1);
        this.S = true;
    }

    @Override // uk
    public final void n(jec jecVar) {
        kq kqVar = this.G;
        if (kqVar != null) {
            go4 go4Var = (go4) kqVar.c;
            if (go4Var.B == -1) {
                fo4 a = go4Var.a();
                a.z = jecVar.a;
                a.A = jecVar.b;
                this.G = new kq(new go4(a), kqVar.b, (String) kqVar.d);
            }
        }
    }

    public final void o(tk tkVar, String str) {
        rz6 rz6Var = tkVar.d;
        if (rz6Var == null || !rz6Var.c()) {
            c();
            this.s = str;
            this.w = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.11.1");
            m(tkVar.b, rz6Var);
        }
    }

    public final void p(tk tkVar, String str) {
        rz6 rz6Var = tkVar.d;
        if ((rz6Var == null || !rz6Var.c()) && str.equals(this.s)) {
            c();
        }
        this.n.remove(str);
        this.r.remove(str);
    }

    public final void q(int i, long j, go4 go4Var, int i2) {
        int i3;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.e);
        if (go4Var != null) {
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
            String str = go4Var.s;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = go4Var.t;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = go4Var.l;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i4 = go4Var.k;
            if (i4 != -1) {
                timeSinceCreatedMillis.setBitrate(i4);
            }
            int i5 = go4Var.A;
            if (i5 != -1) {
                timeSinceCreatedMillis.setWidth(i5);
            }
            int i6 = go4Var.B;
            if (i6 != -1) {
                timeSinceCreatedMillis.setHeight(i6);
            }
            int i7 = go4Var.N;
            if (i7 != -1) {
                timeSinceCreatedMillis.setChannelCount(i7);
            }
            int i8 = go4Var.P;
            if (i8 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i8);
            }
            String str4 = go4Var.d;
            if (str4 != null) {
                String str5 = hac.a;
                String[] split = str4.split("-", -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = go4Var.F;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.S = true;
        final TrackChangeEvent build = timeSinceCreatedMillis.build();
        this.b.execute(new Runnable() { // from class: mt6
            @Override // java.lang.Runnable
            public final void run() {
                rt6.this.l(build);
            }
        });
    }

    @Override // uk
    public final void s(u64 u64Var) {
        this.F = u64Var;
    }

    @Override // uk
    public final void u(tk tkVar, ft6 ft6Var) {
        rz6 rz6Var = tkVar.d;
        if (rz6Var != null) {
            go4 go4Var = ft6Var.c;
            go4Var.getClass();
            int i = ft6Var.d;
            bqb bqbVar = tkVar.b;
            rz6Var.getClass();
            kq kqVar = new kq(go4Var, i, this.c.d(bqbVar, rz6Var));
            int i2 = ft6Var.b;
            if (i2 != 0) {
                if (i2 == 1) {
                    this.H = kqVar;
                    return;
                } else if (i2 != 2) {
                    if (i2 != 3) {
                        return;
                    }
                    this.I = kqVar;
                    return;
                }
            }
            this.G = kqVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // uk
    public final void w(tk tkVar, int i) {
        if (i == 1) {
            this.M = true;
        }
        this.x = i;
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
    /* JADX WARN: Type inference failed for: r9v16, types: [kq] */
    /* JADX WARN: Type inference failed for: r9v18 */
    @Override // uk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(h74 h74Var, hi2 hi2Var) {
        boolean z;
        int i;
        byte b;
        byte b2;
        byte b3;
        byte b4;
        byte b5;
        byte b6;
        az8 az8Var;
        az8 az8Var2;
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
        go4 go4Var;
        as3 as3Var;
        int i4;
        if (((lk4) hi2Var.b).a.size() == 0) {
            return;
        }
        for (int i5 = 0; i5 < ((lk4) hi2Var.b).a.size(); i5++) {
            int a = ((lk4) hi2Var.b).a(i5);
            tk tkVar = (tk) ((SparseArray) hi2Var.c).get(a);
            tkVar.getClass();
            gd3 gd3Var = this.c;
            if (a == 0) {
                synchronized (gd3Var) {
                    gd3Var.d.getClass();
                    bqb bqbVar = gd3Var.e;
                    gd3Var.e = tkVar.b;
                    Iterator it = gd3Var.c.values().iterator();
                    while (it.hasNext()) {
                        fd3 fd3Var = (fd3) it.next();
                        if (!fd3Var.b(bqbVar, gd3Var.e) || fd3Var.a(tkVar)) {
                            it.remove();
                            if (fd3Var.a.equals(gd3Var.f)) {
                                gd3Var.a(fd3Var);
                            }
                            if (fd3Var.e) {
                                gd3Var.d.p(tkVar, fd3Var.a);
                            }
                        }
                    }
                    gd3Var.e(tkVar);
                }
            } else if (a == 11) {
                gd3Var.g(tkVar, this.x);
            } else {
                gd3Var.f(tkVar);
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (hi2Var.g(0)) {
            tk tkVar2 = (tk) ((SparseArray) hi2Var.c).get(0);
            tkVar2.getClass();
            if (this.w != null) {
                m(tkVar2.b, tkVar2.d);
            }
        }
        if (hi2Var.g(2) && this.w != null) {
            ko5 listIterator = h74Var.f0().a.listIterator(0);
            loop2: while (true) {
                if (!listIterator.hasNext()) {
                    as3Var = null;
                    break;
                }
                f0c f0cVar = (f0c) listIterator.next();
                for (int i6 = 0; i6 < f0cVar.a; i6++) {
                    if (f0cVar.e[i6] && (as3Var = f0cVar.b.d[i6].x) != null) {
                        break loop2;
                    }
                }
            }
            if (as3Var != null) {
                PlaybackMetrics.Builder builder = this.w;
                String str = hac.a;
                int i7 = 0;
                while (true) {
                    if (i7 >= as3Var.d) {
                        i4 = 1;
                        break;
                    }
                    UUID uuid = as3Var.a[i7].b;
                    if (uuid.equals(n61.e)) {
                        i4 = 3;
                        break;
                    } else if (uuid.equals(n61.f)) {
                        i4 = 2;
                        break;
                    } else {
                        if (uuid.equals(n61.d)) {
                            i4 = 6;
                            break;
                        }
                        i7++;
                    }
                }
                builder.setDrmType(i4);
            }
        }
        if (hi2Var.g(1011)) {
            this.R++;
        }
        u64 u64Var = this.F;
        if (u64Var == null) {
            b2 = 4;
            i3 = 2;
            b6 = 13;
            b = 8;
            b3 = 7;
            b4 = 6;
            b5 = 9;
        } else {
            int i8 = u64Var.a;
            Context context = this.a;
            boolean z2 = this.N == 4;
            if (i8 == 1001) {
                az8Var = new az8(20, 0, (byte) 1);
            } else {
                if (u64Var instanceof u64) {
                    z = u64Var.d == 1;
                    i = u64Var.n;
                } else {
                    z = false;
                    i = 0;
                }
                Throwable cause = u64Var.getCause();
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
                            az8Var = new az8(35, 0, (byte) 1);
                        } else if (i == 3) {
                            az8Var = new az8(15, 0, (byte) 1);
                        } else if (i == 2) {
                            az8Var = new az8(23, 0, (byte) 1);
                        }
                        b6 = 13;
                        final PlaybackErrorEvent build = new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(az8Var.b).setSubErrorCode(az8Var.c).setException(u64Var).build();
                        this.b.execute(new Runnable() { // from class: ot6
                            @Override // java.lang.Runnable
                            public final void run() {
                                rt6.this.g(build);
                            }
                        });
                        this.S = true;
                        this.F = null;
                        i3 = 2;
                    }
                    if (cause instanceof mm6) {
                        b6 = 13;
                        az8Var2 = new az8(13, hac.B(((mm6) cause).d), (byte) 1);
                    } else {
                        b6 = 13;
                        if (cause instanceof km6) {
                            az8Var = new az8(14, ((km6) cause).a, (byte) 1);
                        } else if (cause instanceof OutOfMemoryError) {
                            az8Var = new az8(14, 0, (byte) 1);
                        } else if (cause instanceof t40) {
                            az8Var = new az8(17, 0, (byte) 1);
                        } else if (cause instanceof w40) {
                            az8Var2 = new az8(18, ((w40) cause).a, (byte) 1);
                        } else if (cause instanceof MediaCodec.CryptoException) {
                            int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                            switch (hac.A(errorCode)) {
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
                            az8Var2 = new az8(i9, errorCode, (byte) 1);
                        } else {
                            az8Var = new az8(22, 0, (byte) 1);
                        }
                        final PlaybackErrorEvent build2 = new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(az8Var.b).setSubErrorCode(az8Var.c).setException(u64Var).build();
                        this.b.execute(new Runnable() { // from class: ot6
                            @Override // java.lang.Runnable
                            public final void run() {
                                rt6.this.g(build2);
                            }
                        });
                        this.S = true;
                        this.F = null;
                        i3 = 2;
                    }
                    az8Var = az8Var2;
                    final PlaybackErrorEvent build22 = new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(az8Var.b).setSubErrorCode(az8Var.c).setException(u64Var).build();
                    this.b.execute(new Runnable() { // from class: ot6
                        @Override // java.lang.Runnable
                        public final void run() {
                            rt6.this.g(build22);
                        }
                    });
                    this.S = true;
                    this.F = null;
                    i3 = 2;
                } else if (cause instanceof ki5) {
                    az8Var = new az8(5, ((ki5) cause).c, (byte) 1);
                } else {
                    if ((cause instanceof ji5) || (cause instanceof bx7)) {
                        b7 = 9;
                        b8 = 7;
                        b9 = 6;
                        b10 = 4;
                        b11 = 8;
                        az8Var = new az8(z2 ? 10 : 11, 0, (byte) 1);
                    } else {
                        boolean z3 = cause instanceof ii5;
                        if (z3 || (cause instanceof k6c)) {
                            b7 = 9;
                            if (ow2.g(context).h() == 1) {
                                az8Var = new az8(3, 0, (byte) 1);
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    az8Var = new az8(6, 0, (byte) 1);
                                    b5 = 9;
                                    b4 = 6;
                                    b6 = 13;
                                    b = 8;
                                    b2 = 4;
                                    b3 = 7;
                                } else {
                                    b9 = 6;
                                    if (cause2 instanceof SocketTimeoutException) {
                                        az8Var = new az8(7, 0, (byte) 1);
                                        b5 = 9;
                                        b3 = 7;
                                        b4 = 6;
                                        b6 = 13;
                                        b = 8;
                                        b2 = 4;
                                    } else {
                                        b8 = 7;
                                        if (z3 && ((ii5) cause).b == 1) {
                                            az8Var = new az8(4, 0, (byte) 1);
                                            b5 = 9;
                                            b3 = 7;
                                            b4 = 6;
                                            b2 = 4;
                                            b6 = 13;
                                            b = 8;
                                        } else {
                                            b10 = 4;
                                            b11 = 8;
                                            az8Var = new az8(8, 0, (byte) 1);
                                        }
                                    }
                                }
                                final PlaybackErrorEvent build222 = new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(az8Var.b).setSubErrorCode(az8Var.c).setException(u64Var).build();
                                this.b.execute(new Runnable() { // from class: ot6
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        rt6.this.g(build222);
                                    }
                                });
                                this.S = true;
                                this.F = null;
                                i3 = 2;
                            }
                        } else if (i8 == 1002) {
                            az8Var = new az8(21, 0, (byte) 1);
                        } else if (cause instanceof bs3) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                int B = hac.B(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                switch (hac.A(B)) {
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
                                az8Var = new az8(i2, B, (byte) 1);
                            } else {
                                az8Var = cause3 instanceof MediaDrmResetException ? new az8(27, 0, (byte) 1) : cause3 instanceof NotProvisionedException ? new az8(24, 0, (byte) 1) : cause3 instanceof DeniedByServerException ? new az8(29, 0, (byte) 1) : cause3 instanceof h8c ? new az8(23, 0, (byte) 1) : cause3 instanceof nb3 ? new az8(28, 0, (byte) 1) : new az8(30, 0, (byte) 1);
                            }
                        } else if ((cause instanceof za4) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            az8Var = ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new az8(32, 0, (byte) 1) : new az8(31, 0, (byte) 1);
                        } else {
                            b7 = 9;
                            az8Var = new az8(9, 0, (byte) 1);
                        }
                        b5 = b7;
                        b6 = 13;
                        b = 8;
                        b2 = 4;
                        b3 = 7;
                        b4 = 6;
                        final PlaybackErrorEvent build2222 = new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(az8Var.b).setSubErrorCode(az8Var.c).setException(u64Var).build();
                        this.b.execute(new Runnable() { // from class: ot6
                            @Override // java.lang.Runnable
                            public final void run() {
                                rt6.this.g(build2222);
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
                    final PlaybackErrorEvent build22222 = new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(az8Var.b).setSubErrorCode(az8Var.c).setException(u64Var).build();
                    this.b.execute(new Runnable() { // from class: ot6
                        @Override // java.lang.Runnable
                        public final void run() {
                            rt6.this.g(build22222);
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
            final PlaybackErrorEvent build222222 = new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(az8Var.b).setSubErrorCode(az8Var.c).setException(u64Var).build();
            this.b.execute(new Runnable() { // from class: ot6
                @Override // java.lang.Runnable
                public final void run() {
                    rt6.this.g(build222222);
                }
            });
            this.S = true;
            this.F = null;
            i3 = 2;
        }
        if (hi2Var.g(i3)) {
            g0c f0 = h74Var.f0();
            boolean a2 = f0.a(i3);
            boolean a3 = f0.a(1);
            boolean a4 = f0.a(3);
            if (a2 || a3 || a4) {
                if (a2) {
                    b12 = b2;
                    go4Var = null;
                } else {
                    go4Var = null;
                    if (Objects.equals(this.J, null)) {
                        b12 = b2;
                    } else {
                        int i10 = this.J == null ? 1 : 0;
                        this.J = null;
                        b12 = b2;
                        q(1, elapsedRealtime, null, i10);
                    }
                }
                if (!a3 && !Objects.equals(this.K, go4Var)) {
                    int i11 = this.K == null ? 1 : 0;
                    this.K = go4Var;
                    q(0, elapsedRealtime, go4Var, i11);
                }
                if (!a4 && !Objects.equals(this.L, go4Var)) {
                    int i12 = this.L == null ? 1 : 0;
                    this.L = go4Var;
                    q(2, elapsedRealtime, go4Var, i12);
                }
                r9 = go4Var;
                if (a(this.G)) {
                    kq kqVar = this.G;
                    go4 go4Var2 = (go4) kqVar.c;
                    if (go4Var2.B != -1) {
                        int i13 = kqVar.b;
                        if (!Objects.equals(this.J, go4Var2)) {
                            int i14 = (this.J == null && i13 == 0) ? 1 : i13;
                            this.J = go4Var2;
                            q(1, elapsedRealtime, go4Var2, i14);
                        }
                        this.G = r9;
                    }
                }
                if (a(this.H)) {
                    kq kqVar2 = this.H;
                    go4 go4Var3 = (go4) kqVar2.c;
                    int i15 = kqVar2.b;
                    if (!Objects.equals(this.K, go4Var3)) {
                        int i16 = (this.K == null && i15 == 0) ? 1 : i15;
                        this.K = go4Var3;
                        q(0, elapsedRealtime, go4Var3, i16);
                    }
                    this.H = r9;
                }
                if (a(this.I)) {
                    kq kqVar3 = this.I;
                    go4 go4Var4 = (go4) kqVar3.c;
                    int i17 = kqVar3.b;
                    if (!Objects.equals(this.L, go4Var4)) {
                        int i18 = (this.L == null && i17 == 0) ? 1 : i17;
                        this.L = go4Var4;
                        q(2, elapsedRealtime, go4Var4, i18);
                    }
                    this.I = r9;
                }
                switch (ow2.g(this.a).h()) {
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
                    this.b.execute(new Runnable() { // from class: nt6
                        @Override // java.lang.Runnable
                        public final void run() {
                            rt6.this.f(build3);
                        }
                    });
                }
                if (h74Var.h() != 2) {
                    this.M = false;
                }
                if (h74Var.U() != null) {
                    this.O = false;
                    b14 = 10;
                } else {
                    b14 = 10;
                    if (hi2Var.g(10)) {
                        this.O = true;
                    }
                }
                int h = h74Var.h();
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
                            } else if (h74Var.s()) {
                                if (h74Var.v0() == 0) {
                                    b6 = b4;
                                }
                                b6 = b14;
                            } else {
                                b6 = b3;
                            }
                        } else {
                            b14 = 3;
                            if (h == 3) {
                                if (h74Var.s()) {
                                    if (h74Var.v0() != 0) {
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
                    this.b.execute(new Runnable() { // from class: qt6
                        @Override // java.lang.Runnable
                        public final void run() {
                            rt6.this.h(build4);
                        }
                    });
                }
                if (hi2Var.g(1028)) {
                    return;
                }
                gd3 gd3Var2 = this.c;
                tk tkVar3 = (tk) ((SparseArray) hi2Var.c).get(1028);
                tkVar3.getClass();
                gd3Var2.b(tkVar3);
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
        switch (ow2.g(this.a).h()) {
        }
        if (b13 != this.E) {
        }
        if (h74Var.h() != 2) {
        }
        if (h74Var.U() != null) {
        }
        int h2 = h74Var.h();
        if (!this.M) {
        }
        if (this.y != b6) {
        }
        if (hi2Var.g(1028)) {
        }
    }

    @Override // uk
    public final void onRenderedFirstFrame(tk tkVar) {
    }

    @Override // uk
    public final void onSeekStarted(tk tkVar) {
    }
}
