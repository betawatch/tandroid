package r4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.api.internal.v;
import d5.g0;
import d5.q;
import h3.d0;
import h3.h0;
import h3.t0;
import h3.u0;
import h3.x;
import java.util.List;
import p8.l0;
import p8.z;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class m extends h3.e implements Handler.Callback {
    public long A;
    public long B;
    public long C;
    public final Handler a;
    public final h0 b;
    public final j c;
    public final u0 d;
    public boolean e;
    public boolean f;
    public boolean h;
    public int n;
    public t0 r;
    public h s;
    public k v;
    public l w;
    public l x;
    public int y;

    public m(h0 h0Var, Looper looper) {
        super(3);
        Handler handler;
        this.b = h0Var;
        if (looper == null) {
            handler = null;
        } else {
            int i10 = g0.a;
            handler = new Handler(looper, this);
        }
        this.a = handler;
        this.c = j.a;
        this.d = new u0();
        this.A = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.C = -9223372036854775807L;
    }

    public final long a() {
        if (this.y == -1) {
            return Long.MAX_VALUE;
        }
        this.w.getClass();
        if (this.y >= this.w.p()) {
            return Long.MAX_VALUE;
        }
        return this.w.f(this.y);
    }

    public final long b(long j10) {
        d5.a.i(j10 != -9223372036854775807L);
        d5.a.i(this.B != -9223372036854775807L);
        return j10 - this.B;
    }

    public final void c(d dVar) {
        z zVar = dVar.a;
        h0 h0Var = this.b;
        h0Var.a.l.e(27, new d0(zVar));
        h0Var.a.l.e(27, new x(dVar, 1));
    }

    public final void d() {
        this.v = null;
        this.y = -1;
        l lVar = this.w;
        if (lVar != null) {
            lVar.release();
            this.w = null;
        }
        l lVar2 = this.x;
        if (lVar2 != null) {
            lVar2.release();
            this.x = null;
        }
    }

    @Override // h3.e, h3.h2
    public final String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        c((d) message.obj);
        return true;
    }

    @Override // h3.e
    public final boolean isEnded() {
        return this.f;
    }

    @Override // h3.e
    public final boolean isReady() {
        return true;
    }

    @Override // h3.e
    public final void onDisabled() {
        this.r = null;
        this.A = -9223372036854775807L;
        d dVar = new d(b(this.C), l0.e);
        Handler handler = this.a;
        if (handler != null) {
            handler.obtainMessage(0, dVar).sendToTarget();
        } else {
            c(dVar);
        }
        this.B = -9223372036854775807L;
        this.C = -9223372036854775807L;
        d();
        h hVar = this.s;
        hVar.getClass();
        hVar.release();
        this.s = null;
        this.n = 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e8, code lost:
    
        if (r0.equals("application/dvbsubs") == false) goto L12;
     */
    @Override // h3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onPositionReset(long j10, boolean z10) {
        h aVar;
        this.C = j10;
        d dVar = new d(b(this.C), l0.e);
        char c10 = 0;
        Handler handler = this.a;
        if (handler != null) {
            handler.obtainMessage(0, dVar).sendToTarget();
        } else {
            c(dVar);
        }
        this.e = false;
        this.f = false;
        this.A = -9223372036854775807L;
        if (this.n == 0) {
            d();
            h hVar = this.s;
            hVar.getClass();
            hVar.flush();
            return;
        }
        d();
        h hVar2 = this.s;
        hVar2.getClass();
        hVar2.release();
        this.s = null;
        this.n = 0;
        this.h = true;
        t0 t0Var = this.r;
        t0Var.getClass();
        this.c.getClass();
        String str = t0Var.B;
        int i10 = t0Var.T;
        List list = t0Var.D;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 930165504:
                    if (str.equals("application/x-mp4-cea-608")) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1201784583:
                    if (str.equals("text/x-exoplayer-cues")) {
                        c10 = 7;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1566015601:
                    if (str.equals("application/cea-608")) {
                        c10 = '\b';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1566016562:
                    if (str.equals("application/cea-708")) {
                        c10 = '\t';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c10 = '\n';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c10 = 11;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                    aVar = new a5.a(list);
                    break;
                case 1:
                    aVar = new u4.b();
                    break;
                case 2:
                    aVar = new a5.a();
                    break;
                case 3:
                    aVar = new a5.l();
                    break;
                case 4:
                    aVar = new z4.a(list);
                    break;
                case 5:
                    aVar = new w4.a(list);
                    break;
                case 6:
                case '\b':
                    aVar = new s4.c(str, i10);
                    break;
                case 7:
                    aVar = new v();
                    break;
                case '\t':
                    aVar = new s4.f(i10, list);
                    break;
                case '\n':
                    aVar = new x4.a();
                    break;
                case 11:
                    aVar = new y4.c();
                    break;
            }
            this.s = aVar;
            return;
        }
        throw new IllegalArgumentException(s3.c.e("Attempted to create decoder for unsupported MIME type: ", str));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b6, code lost:
    
        if (r5.equals("application/dvbsubs") == false) goto L10;
     */
    @Override // h3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onStreamChanged(t0[] t0VarArr, long j10, long j11) {
        h aVar;
        h bVar;
        this.B = j11;
        char c10 = 0;
        t0 t0Var = t0VarArr[0];
        this.r = t0Var;
        if (this.s != null) {
            this.n = 1;
            return;
        }
        this.h = true;
        t0Var.getClass();
        this.c.getClass();
        String str = t0Var.B;
        int i10 = t0Var.T;
        List list = t0Var.D;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 930165504:
                    if (str.equals("application/x-mp4-cea-608")) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1201784583:
                    if (str.equals("text/x-exoplayer-cues")) {
                        c10 = 7;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1566015601:
                    if (str.equals("application/cea-608")) {
                        c10 = '\b';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1566016562:
                    if (str.equals("application/cea-708")) {
                        c10 = '\t';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c10 = '\n';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c10 = 11;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                    aVar = new a5.a(list);
                    bVar = aVar;
                    this.s = bVar;
                    return;
                case 1:
                    bVar = new u4.b();
                    this.s = bVar;
                    return;
                case 2:
                    bVar = new a5.a();
                    this.s = bVar;
                    return;
                case 3:
                    bVar = new a5.l();
                    this.s = bVar;
                    return;
                case 4:
                    aVar = new z4.a(list);
                    bVar = aVar;
                    this.s = bVar;
                    return;
                case 5:
                    aVar = new w4.a(list);
                    bVar = aVar;
                    this.s = bVar;
                    return;
                case 6:
                case '\b':
                    bVar = new s4.c(str, i10);
                    this.s = bVar;
                    return;
                case 7:
                    bVar = new v();
                    this.s = bVar;
                    return;
                case '\t':
                    aVar = new s4.f(i10, list);
                    bVar = aVar;
                    this.s = bVar;
                    return;
                case '\n':
                    bVar = new x4.a();
                    this.s = bVar;
                    return;
                case 11:
                    bVar = new y4.c();
                    this.s = bVar;
                    return;
            }
        }
        throw new IllegalArgumentException(s3.c.e("Attempted to create decoder for unsupported MIME type: ", str));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03b5 A[EXC_TOP_SPLITTER, LOOP:1: B:124:0x03b5->B:147:0x0430, LOOP_START, PHI: r24
      0x03b5: PHI (r24v2 h3.u0) = (r24v1 h3.u0), (r24v3 h3.u0) binds: [B:123:0x03b1, B:147:0x0430] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:237:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03a8  */
    @Override // h3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void render(long j10, long j11) {
        boolean z10;
        boolean z11;
        Object obj;
        long j12;
        Object obj2;
        Object obj3;
        Handler handler;
        int i10;
        char c10;
        h aVar;
        h bVar;
        Object obj4;
        long j13;
        long f10;
        String str;
        char c11;
        h aVar2;
        int i11;
        char c12;
        h aVar3;
        h bVar2;
        u0 u0Var = this.d;
        this.C = j10;
        if (isCurrentStreamFinal()) {
            long j14 = this.A;
            if (j14 != -9223372036854775807L && j10 >= j14) {
                d();
                this.f = true;
            }
        }
        if (this.f) {
            return;
        }
        l lVar = this.x;
        j jVar = this.c;
        Handler handler2 = this.a;
        if (lVar == null) {
            h hVar = this.s;
            hVar.getClass();
            hVar.a(j10);
            try {
                h hVar2 = this.s;
                hVar2.getClass();
                this.x = (l) hVar2.dequeueOutputBuffer();
            } catch (i e9) {
                d5.a.p("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.r, e9);
                d dVar = new d(b(this.C), l0.e);
                if (handler2 != null) {
                    i11 = 0;
                    handler2.obtainMessage(0, dVar).sendToTarget();
                } else {
                    i11 = 0;
                    c(dVar);
                }
                d();
                h hVar3 = this.s;
                hVar3.getClass();
                hVar3.release();
                this.s = null;
                this.n = i11;
                this.h = true;
                t0 t0Var = this.r;
                t0Var.getClass();
                jVar.getClass();
                String str2 = t0Var.B;
                int i12 = t0Var.T;
                List list = t0Var.D;
                if (str2 != null) {
                    switch (str2.hashCode()) {
                        case -1351681404:
                            if (str2.equals("application/dvbsubs")) {
                                c12 = 0;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case -1248334819:
                            if (str2.equals("application/pgs")) {
                                c12 = 1;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case -1026075066:
                            if (str2.equals("application/x-mp4-vtt")) {
                                c12 = 2;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case -1004728940:
                            if (str2.equals("text/vtt")) {
                                c12 = 3;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case 691401887:
                            if (str2.equals("application/x-quicktime-tx3g")) {
                                c12 = 4;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case 822864842:
                            if (str2.equals("text/x-ssa")) {
                                c12 = 5;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case 930165504:
                            if (str2.equals("application/x-mp4-cea-608")) {
                                c12 = 6;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case 1201784583:
                            if (str2.equals("text/x-exoplayer-cues")) {
                                c12 = 7;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case 1566015601:
                            if (str2.equals("application/cea-608")) {
                                c12 = '\b';
                                break;
                            }
                            c12 = 65535;
                            break;
                        case 1566016562:
                            if (str2.equals("application/cea-708")) {
                                c12 = '\t';
                                break;
                            }
                            c12 = 65535;
                            break;
                        case 1668750253:
                            if (str2.equals("application/x-subrip")) {
                                c12 = '\n';
                                break;
                            }
                            c12 = 65535;
                            break;
                        case 1693976202:
                            if (str2.equals("application/ttml+xml")) {
                                c12 = 11;
                                break;
                            }
                            c12 = 65535;
                            break;
                        default:
                            c12 = 65535;
                            break;
                    }
                    switch (c12) {
                        case 0:
                            aVar3 = new a5.a(list);
                            break;
                        case 1:
                            bVar2 = new u4.b();
                            this.s = bVar2;
                            return;
                        case 2:
                            bVar2 = new a5.a();
                            this.s = bVar2;
                            return;
                        case 3:
                            bVar2 = new a5.l();
                            this.s = bVar2;
                            return;
                        case 4:
                            aVar3 = new z4.a(list);
                            break;
                        case 5:
                            aVar3 = new w4.a(list);
                            break;
                        case 6:
                        case '\b':
                            bVar2 = new s4.c(str2, i12);
                            this.s = bVar2;
                            return;
                        case 7:
                            bVar2 = new v();
                            this.s = bVar2;
                            return;
                        case '\t':
                            aVar3 = new s4.f(i12, list);
                            break;
                        case '\n':
                            bVar2 = new x4.a();
                            this.s = bVar2;
                            return;
                        case 11:
                            bVar2 = new y4.c();
                            this.s = bVar2;
                            return;
                    }
                    bVar2 = aVar3;
                    this.s = bVar2;
                    return;
                }
                throw new IllegalArgumentException(s3.c.e("Attempted to create decoder for unsupported MIME type: ", str2));
            }
        }
        String str3 = "Attempted to create decoder for unsupported MIME type: ";
        u0 u0Var2 = u0Var;
        if (getState() != 2) {
            return;
        }
        if (this.w != null) {
            long a2 = a();
            z10 = false;
            while (a2 <= j10) {
                this.y++;
                a2 = a();
                z10 = true;
            }
        } else {
            z10 = false;
        }
        l lVar2 = this.x;
        if (lVar2 != null) {
            if (!lVar2.isEndOfStream()) {
                z11 = z10;
                obj = "application/dvbsubs";
                if (lVar2.timeUs <= j10) {
                    l lVar3 = this.w;
                    if (lVar3 != null) {
                        lVar3.release();
                    }
                    j12 = j10;
                    this.y = lVar2.c(j12);
                    this.w = lVar2;
                    this.x = null;
                    z11 = true;
                    if (z11) {
                    }
                    if (this.n != 2) {
                    }
                }
                j12 = j10;
                if (z11) {
                }
                if (this.n != 2) {
                }
            } else if (!z10 && a() == Long.MAX_VALUE) {
                if (this.n == 2) {
                    d();
                    h hVar4 = this.s;
                    hVar4.getClass();
                    hVar4.release();
                    this.s = null;
                    this.n = 0;
                    this.h = true;
                    t0 t0Var2 = this.r;
                    t0Var2.getClass();
                    jVar.getClass();
                    String str4 = t0Var2.B;
                    z11 = z10;
                    int i13 = t0Var2.T;
                    List list2 = t0Var2.D;
                    if (str4 != null) {
                        switch (str4.hashCode()) {
                            case -1351681404:
                                str = str3;
                                if (str4.equals("application/dvbsubs")) {
                                    c11 = 0;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1248334819:
                                str = str3;
                                if (str4.equals("application/pgs")) {
                                    c11 = 1;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1026075066:
                                str = str3;
                                if (str4.equals("application/x-mp4-vtt")) {
                                    c11 = 2;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1004728940:
                                str = str3;
                                if (str4.equals("text/vtt")) {
                                    c11 = 3;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 691401887:
                                str = str3;
                                if (str4.equals("application/x-quicktime-tx3g")) {
                                    c11 = 4;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 822864842:
                                str = str3;
                                if (str4.equals("text/x-ssa")) {
                                    c11 = 5;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 930165504:
                                str = str3;
                                if (str4.equals("application/x-mp4-cea-608")) {
                                    c11 = 6;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1201784583:
                                str = str3;
                                if (str4.equals("text/x-exoplayer-cues")) {
                                    c11 = 7;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1566015601:
                                str = str3;
                                if (str4.equals("application/cea-608")) {
                                    c11 = '\b';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1566016562:
                                str = str3;
                                if (str4.equals("application/cea-708")) {
                                    c11 = '\t';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1668750253:
                                str = str3;
                                if (str4.equals("application/x-subrip")) {
                                    c11 = '\n';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1693976202:
                                str = str3;
                                if (str4.equals("application/ttml+xml")) {
                                    c11 = 11;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            default:
                                str = str3;
                                c11 = 65535;
                                break;
                        }
                        switch (c11) {
                            case 0:
                                aVar2 = new a5.a(list2);
                                break;
                            case 1:
                                aVar2 = new u4.b();
                                break;
                            case 2:
                                aVar2 = new a5.a();
                                break;
                            case 3:
                                aVar2 = new a5.l();
                                break;
                            case 4:
                                aVar2 = new z4.a(list2);
                                break;
                            case 5:
                                aVar2 = new w4.a(list2);
                                break;
                            case 6:
                            case '\b':
                                aVar2 = new s4.c(str4, i13);
                                break;
                            case 7:
                                aVar2 = new v();
                                break;
                            case '\t':
                                aVar2 = new s4.f(i13, list2);
                                break;
                            case '\n':
                                aVar2 = new x4.a();
                                break;
                            case 11:
                                aVar2 = new y4.c();
                                break;
                        }
                        this.s = aVar2;
                        str3 = str;
                    } else {
                        str = str3;
                    }
                    throw new IllegalArgumentException(s3.c.e(str, str4));
                }
                z11 = z10;
                d();
                this.f = true;
                obj = "application/dvbsubs";
                j12 = j10;
                if (z11) {
                    obj2 = "application/x-mp4-vtt";
                    obj3 = "application/x-mp4-cea-608";
                    handler = handler2;
                } else {
                    this.w.getClass();
                    int c13 = this.w.c(j12);
                    if (c13 == 0 || this.w.p() == 0) {
                        obj2 = "application/x-mp4-vtt";
                        obj4 = "application/x-mp4-cea-608";
                        j13 = this.w.timeUs;
                    } else {
                        if (c13 == -1) {
                            f10 = this.w.f(r0.p() - 1);
                        } else {
                            f10 = this.w.f(c13 - 1);
                        }
                        obj2 = "application/x-mp4-vtt";
                        obj4 = "application/x-mp4-cea-608";
                        j13 = f10;
                    }
                    obj3 = obj4;
                    d dVar2 = new d(b(j13), this.w.h(j12));
                    if (handler2 != null) {
                        handler = handler2;
                        handler.obtainMessage(0, dVar2).sendToTarget();
                    } else {
                        handler = handler2;
                        c(dVar2);
                    }
                }
                if (this.n != 2) {
                    return;
                }
                while (!this.e) {
                    try {
                        k kVar = this.v;
                        if (kVar == null) {
                            h hVar5 = this.s;
                            hVar5.getClass();
                            kVar = (k) hVar5.dequeueInputBuffer();
                            if (kVar == null) {
                                return;
                            } else {
                                this.v = kVar;
                            }
                        }
                        if (this.n == 1) {
                            try {
                                kVar.setFlags(4);
                                h hVar6 = this.s;
                                hVar6.getClass();
                                hVar6.queueInputBuffer(kVar);
                                this.v = null;
                                this.n = 2;
                                return;
                            } catch (i e10) {
                                e = e10;
                                d5.a.p("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.r, e);
                                d dVar3 = new d(b(this.C), l0.e);
                                if (handler != null) {
                                    i10 = 0;
                                    handler.obtainMessage(0, dVar3).sendToTarget();
                                } else {
                                    i10 = 0;
                                    c(dVar3);
                                }
                                d();
                                h hVar7 = this.s;
                                hVar7.getClass();
                                hVar7.release();
                                this.s = null;
                                this.n = i10;
                                this.h = true;
                                t0 t0Var3 = this.r;
                                t0Var3.getClass();
                                jVar.getClass();
                                String str5 = t0Var3.B;
                                int i14 = t0Var3.T;
                                List list3 = t0Var3.D;
                                if (str5 != null) {
                                    switch (str5.hashCode()) {
                                        case -1351681404:
                                            if (str5.equals(obj)) {
                                                c10 = 0;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -1248334819:
                                            if (str5.equals("application/pgs")) {
                                                c10 = 1;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -1026075066:
                                            if (str5.equals(obj2)) {
                                                c10 = 2;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -1004728940:
                                            if (str5.equals("text/vtt")) {
                                                c10 = 3;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 691401887:
                                            if (str5.equals("application/x-quicktime-tx3g")) {
                                                c10 = 4;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 822864842:
                                            if (str5.equals("text/x-ssa")) {
                                                c10 = 5;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 930165504:
                                            if (str5.equals(obj3)) {
                                                c10 = 6;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1201784583:
                                            if (str5.equals("text/x-exoplayer-cues")) {
                                                c10 = 7;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1566015601:
                                            if (str5.equals("application/cea-608")) {
                                                c10 = '\b';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1566016562:
                                            if (str5.equals("application/cea-708")) {
                                                c10 = '\t';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1668750253:
                                            if (str5.equals("application/x-subrip")) {
                                                c10 = '\n';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1693976202:
                                            if (str5.equals("application/ttml+xml")) {
                                                c10 = 11;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        default:
                                            c10 = 65535;
                                            break;
                                    }
                                    switch (c10) {
                                        case 0:
                                            aVar = new a5.a(list3);
                                            bVar = aVar;
                                            this.s = bVar;
                                            return;
                                        case 1:
                                            bVar = new u4.b();
                                            this.s = bVar;
                                            return;
                                        case 2:
                                            bVar = new a5.a();
                                            this.s = bVar;
                                            return;
                                        case 3:
                                            bVar = new a5.l();
                                            this.s = bVar;
                                            return;
                                        case 4:
                                            aVar = new z4.a(list3);
                                            bVar = aVar;
                                            this.s = bVar;
                                            return;
                                        case 5:
                                            aVar = new w4.a(list3);
                                            bVar = aVar;
                                            this.s = bVar;
                                            return;
                                        case 6:
                                        case '\b':
                                            bVar = new s4.c(str5, i14);
                                            this.s = bVar;
                                            return;
                                        case 7:
                                            bVar = new v();
                                            this.s = bVar;
                                            return;
                                        case '\t':
                                            aVar = new s4.f(i14, list3);
                                            bVar = aVar;
                                            this.s = bVar;
                                            return;
                                        case '\n':
                                            bVar = new x4.a();
                                            this.s = bVar;
                                            return;
                                        case 11:
                                            bVar = new y4.c();
                                            this.s = bVar;
                                            return;
                                    }
                                }
                                throw new IllegalArgumentException(s3.c.e(str3, str5));
                            }
                        }
                        u0 u0Var3 = u0Var2;
                        int readSource = readSource(u0Var3, kVar, 0);
                        if (readSource == -4) {
                            if (kVar.isEndOfStream()) {
                                this.e = true;
                                this.h = false;
                            } else {
                                t0 t0Var4 = u0Var3.b;
                                if (t0Var4 == null) {
                                    return;
                                }
                                kVar.n = t0Var4.F;
                                kVar.d();
                                this.h &= !kVar.isKeyFrame();
                            }
                            if (!this.h) {
                                h hVar8 = this.s;
                                hVar8.getClass();
                                hVar8.queueInputBuffer(kVar);
                                this.v = null;
                            }
                        } else if (readSource == -3) {
                            return;
                        }
                        u0Var2 = u0Var3;
                    } catch (i e11) {
                        e = e11;
                    }
                }
                return;
            }
        }
        z11 = z10;
        obj = "application/dvbsubs";
        j12 = j10;
        if (z11) {
        }
        if (this.n != 2) {
        }
    }

    @Override // h3.h2
    public final int supportsFormat(t0 t0Var) {
        this.c.getClass();
        String str = t0Var.B;
        if ("text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || "text/x-exoplayer-cues".equals(str)) {
            return com.google.android.recaptcha.internal.a.b(t0Var.W == 0 ? 4 : 2, 0, 0);
        }
        return q.i(t0Var.B) ? com.google.android.recaptcha.internal.a.b(1, 0, 0) : com.google.android.recaptcha.internal.a.b(0, 0, 0);
    }
}
