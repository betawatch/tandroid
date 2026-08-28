package r4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.api.internal.v;
import d5.f0;
import d5.q;
import gh.i3;
import h3.c0;
import h3.h0;
import h3.t0;
import h3.u0;
import java.util.List;
import o8.l0;
import o8.z;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class l extends h3.e implements Handler.Callback {
    public long A;
    public long B;
    public long C;
    public final Handler a;
    public final h0 b;
    public final i c;
    public final u0 d;
    public boolean e;
    public boolean f;
    public boolean h;
    public int n;
    public t0 r;
    public g s;
    public j v;
    public k w;
    public k x;
    public int y;

    public l(h0 h0Var, Looper looper) {
        super(3);
        Handler handler;
        this.b = h0Var;
        if (looper == null) {
            handler = null;
        } else {
            int i9 = f0.a;
            handler = new Handler(looper, this);
        }
        this.a = handler;
        this.c = i.a;
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
        if (this.y >= this.w.r()) {
            return Long.MAX_VALUE;
        }
        return this.w.h(this.y);
    }

    public final long b(long j10) {
        d5.a.i(j10 != -9223372036854775807L);
        d5.a.i(this.B != -9223372036854775807L);
        return j10 - this.B;
    }

    public final void c(c cVar) {
        z zVar = cVar.a;
        h0 h0Var = this.b;
        h0Var.a.l.e(27, new c0(zVar));
        h0Var.a.l.e(27, new i3(cVar, 10));
    }

    public final void d() {
        this.v = null;
        this.y = -1;
        k kVar = this.w;
        if (kVar != null) {
            kVar.release();
            this.w = null;
        }
        k kVar2 = this.x;
        if (kVar2 != null) {
            kVar2.release();
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
        c((c) message.obj);
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
        c cVar = new c(b(this.C), l0.e);
        Handler handler = this.a;
        if (handler != null) {
            handler.obtainMessage(0, cVar).sendToTarget();
        } else {
            c(cVar);
        }
        this.B = -9223372036854775807L;
        this.C = -9223372036854775807L;
        d();
        g gVar = this.s;
        gVar.getClass();
        gVar.release();
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
        g aVar;
        this.C = j10;
        c cVar = new c(b(this.C), l0.e);
        char c10 = 0;
        Handler handler = this.a;
        if (handler != null) {
            handler.obtainMessage(0, cVar).sendToTarget();
        } else {
            c(cVar);
        }
        this.e = false;
        this.f = false;
        this.A = -9223372036854775807L;
        if (this.n == 0) {
            d();
            g gVar = this.s;
            gVar.getClass();
            gVar.flush();
            return;
        }
        d();
        g gVar2 = this.s;
        gVar2.getClass();
        gVar2.release();
        this.s = null;
        this.n = 0;
        this.h = true;
        t0 t0Var = this.r;
        t0Var.getClass();
        this.c.getClass();
        String str = t0Var.B;
        int i9 = t0Var.T;
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
                    aVar = new a5.k();
                    break;
                case 4:
                    aVar = new z4.a(list);
                    break;
                case 5:
                    aVar = new w4.a(list);
                    break;
                case 6:
                case '\b':
                    aVar = new s4.c(str, i9);
                    break;
                case 7:
                    aVar = new v();
                    break;
                case '\t':
                    aVar = new s4.f(i9, list);
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
        throw new IllegalArgumentException(ta.b.d("Attempted to create decoder for unsupported MIME type: ", str));
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
        g aVar;
        g bVar;
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
        int i9 = t0Var.T;
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
                    bVar = new a5.k();
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
                    bVar = new s4.c(str, i9);
                    this.s = bVar;
                    return;
                case 7:
                    bVar = new v();
                    this.s = bVar;
                    return;
                case '\t':
                    aVar = new s4.f(i9, list);
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
        throw new IllegalArgumentException(ta.b.d("Attempted to create decoder for unsupported MIME type: ", str));
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
        int i9;
        char c10;
        g aVar;
        g bVar;
        Object obj4;
        long j13;
        long h;
        String str;
        char c11;
        g aVar2;
        int i10;
        char c12;
        g aVar3;
        g bVar2;
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
        k kVar = this.x;
        i iVar = this.c;
        Handler handler2 = this.a;
        if (kVar == null) {
            g gVar = this.s;
            gVar.getClass();
            gVar.a(j10);
            try {
                g gVar2 = this.s;
                gVar2.getClass();
                this.x = (k) gVar2.dequeueOutputBuffer();
            } catch (h e10) {
                d5.a.p("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.r, e10);
                c cVar = new c(b(this.C), l0.e);
                if (handler2 != null) {
                    i10 = 0;
                    handler2.obtainMessage(0, cVar).sendToTarget();
                } else {
                    i10 = 0;
                    c(cVar);
                }
                d();
                g gVar3 = this.s;
                gVar3.getClass();
                gVar3.release();
                this.s = null;
                this.n = i10;
                this.h = true;
                t0 t0Var = this.r;
                t0Var.getClass();
                iVar.getClass();
                String str2 = t0Var.B;
                int i11 = t0Var.T;
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
                            bVar2 = new a5.k();
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
                            bVar2 = new s4.c(str2, i11);
                            this.s = bVar2;
                            return;
                        case 7:
                            bVar2 = new v();
                            this.s = bVar2;
                            return;
                        case '\t':
                            aVar3 = new s4.f(i11, list);
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
                throw new IllegalArgumentException(ta.b.d("Attempted to create decoder for unsupported MIME type: ", str2));
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
        k kVar2 = this.x;
        if (kVar2 != null) {
            if (!kVar2.isEndOfStream()) {
                z11 = z10;
                obj = "application/dvbsubs";
                if (kVar2.timeUs <= j10) {
                    k kVar3 = this.w;
                    if (kVar3 != null) {
                        kVar3.release();
                    }
                    j12 = j10;
                    this.y = kVar2.b(j12);
                    this.w = kVar2;
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
                    g gVar4 = this.s;
                    gVar4.getClass();
                    gVar4.release();
                    this.s = null;
                    this.n = 0;
                    this.h = true;
                    t0 t0Var2 = this.r;
                    t0Var2.getClass();
                    iVar.getClass();
                    String str4 = t0Var2.B;
                    z11 = z10;
                    int i12 = t0Var2.T;
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
                                aVar2 = new a5.k();
                                break;
                            case 4:
                                aVar2 = new z4.a(list2);
                                break;
                            case 5:
                                aVar2 = new w4.a(list2);
                                break;
                            case 6:
                            case '\b':
                                aVar2 = new s4.c(str4, i12);
                                break;
                            case 7:
                                aVar2 = new v();
                                break;
                            case '\t':
                                aVar2 = new s4.f(i12, list2);
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
                    throw new IllegalArgumentException(ta.b.d(str, str4));
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
                    int b10 = this.w.b(j12);
                    if (b10 == 0 || this.w.r() == 0) {
                        obj2 = "application/x-mp4-vtt";
                        obj4 = "application/x-mp4-cea-608";
                        j13 = this.w.timeUs;
                    } else {
                        if (b10 == -1) {
                            h = this.w.h(r0.r() - 1);
                        } else {
                            h = this.w.h(b10 - 1);
                        }
                        obj2 = "application/x-mp4-vtt";
                        obj4 = "application/x-mp4-cea-608";
                        j13 = h;
                    }
                    obj3 = obj4;
                    c cVar2 = new c(b(j13), this.w.m(j12));
                    if (handler2 != null) {
                        handler = handler2;
                        handler.obtainMessage(0, cVar2).sendToTarget();
                    } else {
                        handler = handler2;
                        c(cVar2);
                    }
                }
                if (this.n != 2) {
                    return;
                }
                while (!this.e) {
                    try {
                        j jVar = this.v;
                        if (jVar == null) {
                            g gVar5 = this.s;
                            gVar5.getClass();
                            jVar = (j) gVar5.dequeueInputBuffer();
                            if (jVar == null) {
                                return;
                            } else {
                                this.v = jVar;
                            }
                        }
                        if (this.n == 1) {
                            try {
                                jVar.setFlags(4);
                                g gVar6 = this.s;
                                gVar6.getClass();
                                gVar6.queueInputBuffer(jVar);
                                this.v = null;
                                this.n = 2;
                                return;
                            } catch (h e11) {
                                e = e11;
                                d5.a.p("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.r, e);
                                c cVar3 = new c(b(this.C), l0.e);
                                if (handler != null) {
                                    i9 = 0;
                                    handler.obtainMessage(0, cVar3).sendToTarget();
                                } else {
                                    i9 = 0;
                                    c(cVar3);
                                }
                                d();
                                g gVar7 = this.s;
                                gVar7.getClass();
                                gVar7.release();
                                this.s = null;
                                this.n = i9;
                                this.h = true;
                                t0 t0Var3 = this.r;
                                t0Var3.getClass();
                                iVar.getClass();
                                String str5 = t0Var3.B;
                                int i13 = t0Var3.T;
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
                                            bVar = new a5.k();
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
                                            bVar = new s4.c(str5, i13);
                                            this.s = bVar;
                                            return;
                                        case 7:
                                            bVar = new v();
                                            this.s = bVar;
                                            return;
                                        case '\t':
                                            aVar = new s4.f(i13, list3);
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
                                throw new IllegalArgumentException(ta.b.d(str3, str5));
                            }
                        }
                        u0 u0Var3 = u0Var2;
                        int readSource = readSource(u0Var3, jVar, 0);
                        if (readSource == -4) {
                            if (jVar.isEndOfStream()) {
                                this.e = true;
                                this.h = false;
                            } else {
                                t0 t0Var4 = u0Var3.b;
                                if (t0Var4 == null) {
                                    return;
                                }
                                jVar.n = t0Var4.F;
                                jVar.d();
                                this.h &= !jVar.isKeyFrame();
                            }
                            if (!this.h) {
                                g gVar8 = this.s;
                                gVar8.getClass();
                                gVar8.queueInputBuffer(jVar);
                                this.v = null;
                            }
                        } else if (readSource == -3) {
                            return;
                        }
                        u0Var2 = u0Var3;
                    } catch (h e12) {
                        e = e12;
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
            return e2.c.b(t0Var.W == 0 ? 4 : 2, 0, 0);
        }
        return q.i(t0Var.B) ? e2.c.b(1, 0, 0) : e2.c.b(0, 0, 0);
    }
}
