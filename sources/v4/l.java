package v4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import h5.d0;
import h5.o;
import j3.c0;
import j3.n0;
import j3.z;
import java.util.List;
import s8.i0;
import s8.v;
import vh.w2;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class l extends j3.e implements Handler.Callback {
    public final Handler B;
    public final c0 C;
    public final i D;
    public final f7.b E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public n0 J;
    public g K;
    public j L;
    public k M;
    public k N;
    public int O;
    public long P;
    public long Q;
    public long R;

    public l(c0 c0Var, Looper looper) {
        super(3);
        Handler handler;
        this.C = c0Var;
        if (looper == null) {
            handler = null;
        } else {
            int i10 = d0.a;
            handler = new Handler(looper, this);
        }
        this.B = handler;
        this.D = i.a;
        this.E = new f7.b((char) 0, 17);
        this.P = -9223372036854775807L;
        this.Q = -9223372036854775807L;
        this.R = -9223372036854775807L;
    }

    public final long A(long j10) {
        h5.a.i(j10 != -9223372036854775807L);
        h5.a.i(this.Q != -9223372036854775807L);
        return j10 - this.Q;
    }

    public final void B(c cVar) {
        v vVar = cVar.a;
        c0 c0Var = this.C;
        c0Var.a.l.e(27, new z(vVar));
        c0Var.a.l.e(27, new gg.f(cVar, 11));
    }

    public final void C() {
        this.L = null;
        this.O = -1;
        k kVar = this.M;
        if (kVar != null) {
            kVar.j();
            this.M = null;
        }
        k kVar2 = this.N;
        if (kVar2 != null) {
            kVar2.j();
            this.N = null;
        }
    }

    @Override // j3.e
    public final String g() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        B((c) message.obj);
        return true;
    }

    @Override // j3.e
    public final boolean i() {
        return this.G;
    }

    @Override // j3.e
    public final boolean j() {
        return true;
    }

    @Override // j3.e
    public final void k() {
        this.J = null;
        this.P = -9223372036854775807L;
        c cVar = new c(A(this.R), i0.e);
        Handler handler = this.B;
        if (handler != null) {
            handler.obtainMessage(0, cVar).sendToTarget();
        } else {
            B(cVar);
        }
        this.Q = -9223372036854775807L;
        this.R = -9223372036854775807L;
        C();
        g gVar = this.K;
        gVar.getClass();
        gVar.release();
        this.K = null;
        this.I = 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e8, code lost:
    
        if (r0.equals("application/dvbsubs") == false) goto L12;
     */
    @Override // j3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(long j10, boolean z4) {
        g aVar;
        this.R = j10;
        c cVar = new c(A(this.R), i0.e);
        char c3 = 0;
        Handler handler = this.B;
        if (handler != null) {
            handler.obtainMessage(0, cVar).sendToTarget();
        } else {
            B(cVar);
        }
        this.F = false;
        this.G = false;
        this.P = -9223372036854775807L;
        if (this.I == 0) {
            C();
            g gVar = this.K;
            gVar.getClass();
            gVar.flush();
            return;
        }
        C();
        g gVar2 = this.K;
        gVar2.getClass();
        gVar2.release();
        this.K = null;
        this.I = 0;
        this.H = true;
        n0 n0Var = this.J;
        n0Var.getClass();
        this.D.getClass();
        String str = n0Var.C;
        int i10 = n0Var.U;
        List list = n0Var.E;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c3 = 3;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c3 = 4;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c3 = 5;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 930165504:
                    if (str.equals("application/x-mp4-cea-608")) {
                        c3 = 6;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1201784583:
                    if (str.equals("text/x-exoplayer-cues")) {
                        c3 = 7;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1566015601:
                    if (str.equals("application/cea-608")) {
                        c3 = '\b';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1566016562:
                    if (str.equals("application/cea-708")) {
                        c3 = '\t';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c3 = '\n';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c3 = 11;
                        break;
                    }
                    c3 = 65535;
                    break;
                default:
                    c3 = 65535;
                    break;
            }
            switch (c3) {
                case 0:
                    aVar = new e5.a(list);
                    break;
                case 1:
                    aVar = new y4.b();
                    break;
                case 2:
                    aVar = new e5.a();
                    break;
                case 3:
                    aVar = new e5.k();
                    break;
                case 4:
                    aVar = new d5.a(list);
                    break;
                case 5:
                    aVar = new a5.a(list);
                    break;
                case 6:
                case '\b':
                    aVar = new w4.c(str, i10);
                    break;
                case 7:
                    aVar = new com.google.android.gms.common.api.internal.v();
                    break;
                case '\t':
                    aVar = new w4.f(i10, list);
                    break;
                case '\n':
                    aVar = new b5.a();
                    break;
                case 11:
                    aVar = new c5.f();
                    break;
            }
            this.K = aVar;
            return;
        }
        throw new IllegalArgumentException(w2.e("Attempted to create decoder for unsupported MIME type: ", str));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b6, code lost:
    
        if (r5.equals("application/dvbsubs") == false) goto L10;
     */
    @Override // j3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(n0[] n0VarArr, long j10, long j11) {
        g aVar;
        g bVar;
        this.Q = j11;
        char c3 = 0;
        n0 n0Var = n0VarArr[0];
        this.J = n0Var;
        if (this.K != null) {
            this.I = 1;
            return;
        }
        this.H = true;
        n0Var.getClass();
        this.D.getClass();
        String str = n0Var.C;
        int i10 = n0Var.U;
        List list = n0Var.E;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c3 = 3;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c3 = 4;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c3 = 5;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 930165504:
                    if (str.equals("application/x-mp4-cea-608")) {
                        c3 = 6;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1201784583:
                    if (str.equals("text/x-exoplayer-cues")) {
                        c3 = 7;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1566015601:
                    if (str.equals("application/cea-608")) {
                        c3 = '\b';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1566016562:
                    if (str.equals("application/cea-708")) {
                        c3 = '\t';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c3 = '\n';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c3 = 11;
                        break;
                    }
                    c3 = 65535;
                    break;
                default:
                    c3 = 65535;
                    break;
            }
            switch (c3) {
                case 0:
                    aVar = new e5.a(list);
                    bVar = aVar;
                    this.K = bVar;
                    return;
                case 1:
                    bVar = new y4.b();
                    this.K = bVar;
                    return;
                case 2:
                    bVar = new e5.a();
                    this.K = bVar;
                    return;
                case 3:
                    bVar = new e5.k();
                    this.K = bVar;
                    return;
                case 4:
                    aVar = new d5.a(list);
                    bVar = aVar;
                    this.K = bVar;
                    return;
                case 5:
                    aVar = new a5.a(list);
                    bVar = aVar;
                    this.K = bVar;
                    return;
                case 6:
                case '\b':
                    bVar = new w4.c(str, i10);
                    this.K = bVar;
                    return;
                case 7:
                    bVar = new com.google.android.gms.common.api.internal.v();
                    this.K = bVar;
                    return;
                case '\t':
                    aVar = new w4.f(i10, list);
                    bVar = aVar;
                    this.K = bVar;
                    return;
                case '\n':
                    bVar = new b5.a();
                    this.K = bVar;
                    return;
                case 11:
                    bVar = new c5.f();
                    this.K = bVar;
                    return;
            }
        }
        throw new IllegalArgumentException(w2.e("Attempted to create decoder for unsupported MIME type: ", str));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03b2 A[EXC_TOP_SPLITTER, LOOP:1: B:124:0x03b2->B:150:0x0434, LOOP_START, PHI: r24
      0x03b2: PHI (r24v2 f7.b) = (r24v1 f7.b), (r24v3 f7.b) binds: [B:123:0x03ae, B:150:0x0434] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:243:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03a5  */
    @Override // j3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(long j10, long j11) {
        boolean z4;
        boolean z10;
        Object obj;
        long j12;
        Object obj2;
        Object obj3;
        Handler handler;
        int i10;
        String str;
        char c3;
        g aVar;
        g bVar;
        Object obj4;
        long j13;
        long h;
        String str2;
        char c10;
        g aVar2;
        int i11;
        char c11;
        g aVar3;
        g bVar2;
        f7.b bVar3 = this.E;
        this.R = j10;
        if (this.w) {
            long j14 = this.P;
            if (j14 != -9223372036854775807L && j10 >= j14) {
                C();
                this.G = true;
            }
        }
        if (this.G) {
            return;
        }
        k kVar = this.N;
        i iVar = this.D;
        Handler handler2 = this.B;
        if (kVar == null) {
            g gVar = this.K;
            gVar.getClass();
            gVar.a(j10);
            try {
                g gVar2 = this.K;
                gVar2.getClass();
                this.N = (k) gVar2.b();
            } catch (h e) {
                h5.a.p("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.J, e);
                c cVar = new c(A(this.R), i0.e);
                if (handler2 != null) {
                    i11 = 0;
                    handler2.obtainMessage(0, cVar).sendToTarget();
                } else {
                    i11 = 0;
                    B(cVar);
                }
                C();
                g gVar3 = this.K;
                gVar3.getClass();
                gVar3.release();
                this.K = null;
                this.I = i11;
                this.H = true;
                n0 n0Var = this.J;
                n0Var.getClass();
                iVar.getClass();
                String str3 = n0Var.C;
                int i12 = n0Var.U;
                List list = n0Var.E;
                if (str3 != null) {
                    switch (str3.hashCode()) {
                        case -1351681404:
                            if (str3.equals("application/dvbsubs")) {
                                c11 = 0;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case -1248334819:
                            if (str3.equals("application/pgs")) {
                                c11 = 1;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case -1026075066:
                            if (str3.equals("application/x-mp4-vtt")) {
                                c11 = 2;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case -1004728940:
                            if (str3.equals("text/vtt")) {
                                c11 = 3;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 691401887:
                            if (str3.equals("application/x-quicktime-tx3g")) {
                                c11 = 4;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 822864842:
                            if (str3.equals("text/x-ssa")) {
                                c11 = 5;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 930165504:
                            if (str3.equals("application/x-mp4-cea-608")) {
                                c11 = 6;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 1201784583:
                            if (str3.equals("text/x-exoplayer-cues")) {
                                c11 = 7;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 1566015601:
                            if (str3.equals("application/cea-608")) {
                                c11 = '\b';
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 1566016562:
                            if (str3.equals("application/cea-708")) {
                                c11 = '\t';
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 1668750253:
                            if (str3.equals("application/x-subrip")) {
                                c11 = '\n';
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 1693976202:
                            if (str3.equals("application/ttml+xml")) {
                                c11 = 11;
                                break;
                            }
                            c11 = 65535;
                            break;
                        default:
                            c11 = 65535;
                            break;
                    }
                    switch (c11) {
                        case 0:
                            aVar3 = new e5.a(list);
                            break;
                        case 1:
                            bVar2 = new y4.b();
                            this.K = bVar2;
                            return;
                        case 2:
                            bVar2 = new e5.a();
                            this.K = bVar2;
                            return;
                        case 3:
                            bVar2 = new e5.k();
                            this.K = bVar2;
                            return;
                        case 4:
                            aVar3 = new d5.a(list);
                            break;
                        case 5:
                            aVar3 = new a5.a(list);
                            break;
                        case 6:
                        case '\b':
                            bVar2 = new w4.c(str3, i12);
                            this.K = bVar2;
                            return;
                        case 7:
                            bVar2 = new com.google.android.gms.common.api.internal.v();
                            this.K = bVar2;
                            return;
                        case '\t':
                            aVar3 = new w4.f(i12, list);
                            break;
                        case '\n':
                            bVar2 = new b5.a();
                            this.K = bVar2;
                            return;
                        case 11:
                            bVar2 = new c5.f();
                            this.K = bVar2;
                            return;
                    }
                    bVar2 = aVar3;
                    this.K = bVar2;
                    return;
                }
                throw new IllegalArgumentException(w2.e("Attempted to create decoder for unsupported MIME type: ", str3));
            }
        }
        String str4 = "Attempted to create decoder for unsupported MIME type: ";
        f7.b bVar4 = bVar3;
        if (this.h != 2) {
            return;
        }
        if (this.M != null) {
            long z11 = z();
            z4 = false;
            while (z11 <= j10) {
                this.O++;
                z11 = z();
                z4 = true;
            }
        } else {
            z4 = false;
        }
        k kVar2 = this.N;
        if (kVar2 != null) {
            if (!kVar2.d(4)) {
                z10 = z4;
                obj = "application/dvbsubs";
                if (kVar2.c <= j10) {
                    k kVar3 = this.M;
                    if (kVar3 != null) {
                        kVar3.j();
                    }
                    j12 = j10;
                    this.O = kVar2.e(j12);
                    this.M = kVar2;
                    this.N = null;
                    z10 = true;
                    if (z10) {
                    }
                    if (this.I != 2) {
                    }
                }
                j12 = j10;
                if (z10) {
                }
                if (this.I != 2) {
                }
            } else if (!z4 && z() == Long.MAX_VALUE) {
                if (this.I == 2) {
                    C();
                    g gVar4 = this.K;
                    gVar4.getClass();
                    gVar4.release();
                    this.K = null;
                    this.I = 0;
                    this.H = true;
                    n0 n0Var2 = this.J;
                    n0Var2.getClass();
                    iVar.getClass();
                    String str5 = n0Var2.C;
                    z10 = z4;
                    int i13 = n0Var2.U;
                    List list2 = n0Var2.E;
                    if (str5 != null) {
                        switch (str5.hashCode()) {
                            case -1351681404:
                                str2 = str4;
                                if (str5.equals("application/dvbsubs")) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1248334819:
                                str2 = str4;
                                if (str5.equals("application/pgs")) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1026075066:
                                str2 = str4;
                                if (str5.equals("application/x-mp4-vtt")) {
                                    c10 = 2;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1004728940:
                                str2 = str4;
                                if (str5.equals("text/vtt")) {
                                    c10 = 3;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 691401887:
                                str2 = str4;
                                if (str5.equals("application/x-quicktime-tx3g")) {
                                    c10 = 4;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 822864842:
                                str2 = str4;
                                if (str5.equals("text/x-ssa")) {
                                    c10 = 5;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 930165504:
                                str2 = str4;
                                if (str5.equals("application/x-mp4-cea-608")) {
                                    c10 = 6;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1201784583:
                                str2 = str4;
                                if (str5.equals("text/x-exoplayer-cues")) {
                                    c10 = 7;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1566015601:
                                str2 = str4;
                                if (str5.equals("application/cea-608")) {
                                    c10 = '\b';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1566016562:
                                str2 = str4;
                                if (str5.equals("application/cea-708")) {
                                    c10 = '\t';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1668750253:
                                str2 = str4;
                                if (str5.equals("application/x-subrip")) {
                                    c10 = '\n';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1693976202:
                                str2 = str4;
                                if (str5.equals("application/ttml+xml")) {
                                    c10 = 11;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            default:
                                str2 = str4;
                                c10 = 65535;
                                break;
                        }
                        switch (c10) {
                            case 0:
                                aVar2 = new e5.a(list2);
                                break;
                            case 1:
                                aVar2 = new y4.b();
                                break;
                            case 2:
                                aVar2 = new e5.a();
                                break;
                            case 3:
                                aVar2 = new e5.k();
                                break;
                            case 4:
                                aVar2 = new d5.a(list2);
                                break;
                            case 5:
                                aVar2 = new a5.a(list2);
                                break;
                            case 6:
                            case '\b':
                                aVar2 = new w4.c(str5, i13);
                                break;
                            case 7:
                                aVar2 = new com.google.android.gms.common.api.internal.v();
                                break;
                            case '\t':
                                aVar2 = new w4.f(i13, list2);
                                break;
                            case '\n':
                                aVar2 = new b5.a();
                                break;
                            case 11:
                                aVar2 = new c5.f();
                                break;
                        }
                        this.K = aVar2;
                        str4 = str2;
                    } else {
                        str2 = str4;
                    }
                    throw new IllegalArgumentException(w2.e(str2, str5));
                }
                z10 = z4;
                C();
                this.G = true;
                obj = "application/dvbsubs";
                j12 = j10;
                if (z10) {
                    obj2 = "application/x-mp4-vtt";
                    obj3 = "application/x-mp4-cea-608";
                    handler = handler2;
                } else {
                    this.M.getClass();
                    int e6 = this.M.e(j12);
                    if (e6 == 0 || this.M.r() == 0) {
                        obj2 = "application/x-mp4-vtt";
                        obj4 = "application/x-mp4-cea-608";
                        j13 = this.M.c;
                    } else {
                        if (e6 == -1) {
                            h = this.M.h(r0.r() - 1);
                        } else {
                            h = this.M.h(e6 - 1);
                        }
                        obj2 = "application/x-mp4-vtt";
                        obj4 = "application/x-mp4-cea-608";
                        j13 = h;
                    }
                    obj3 = obj4;
                    c cVar2 = new c(A(j13), this.M.q(j12));
                    if (handler2 != null) {
                        handler = handler2;
                        handler.obtainMessage(0, cVar2).sendToTarget();
                    } else {
                        handler = handler2;
                        B(cVar2);
                    }
                }
                if (this.I != 2) {
                    return;
                }
                while (!this.F) {
                    try {
                        j jVar = this.L;
                        if (jVar == null) {
                            g gVar5 = this.K;
                            gVar5.getClass();
                            jVar = (j) gVar5.c();
                            if (jVar == null) {
                                return;
                            } else {
                                this.L = jVar;
                            }
                        }
                        if (this.I == 1) {
                            try {
                                jVar.b = 4;
                                g gVar6 = this.K;
                                gVar6.getClass();
                                gVar6.d(jVar);
                                this.L = null;
                                this.I = 2;
                                return;
                            } catch (h e10) {
                                e = e10;
                                h5.a.p("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.J, e);
                                c cVar3 = new c(A(this.R), i0.e);
                                if (handler == null) {
                                    i10 = 0;
                                    handler.obtainMessage(0, cVar3).sendToTarget();
                                } else {
                                    i10 = 0;
                                    B(cVar3);
                                }
                                C();
                                g gVar7 = this.K;
                                gVar7.getClass();
                                gVar7.release();
                                this.K = null;
                                this.I = i10;
                                this.H = true;
                                n0 n0Var3 = this.J;
                                n0Var3.getClass();
                                iVar.getClass();
                                str = n0Var3.C;
                                int i14 = n0Var3.U;
                                List list3 = n0Var3.E;
                                if (str != null) {
                                    switch (str.hashCode()) {
                                        case -1351681404:
                                            if (str.equals(obj)) {
                                                c3 = 0;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case -1248334819:
                                            if (str.equals("application/pgs")) {
                                                c3 = 1;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case -1026075066:
                                            if (str.equals(obj2)) {
                                                c3 = 2;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case -1004728940:
                                            if (str.equals("text/vtt")) {
                                                c3 = 3;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 691401887:
                                            if (str.equals("application/x-quicktime-tx3g")) {
                                                c3 = 4;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 822864842:
                                            if (str.equals("text/x-ssa")) {
                                                c3 = 5;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 930165504:
                                            if (str.equals(obj3)) {
                                                c3 = 6;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 1201784583:
                                            if (str.equals("text/x-exoplayer-cues")) {
                                                c3 = 7;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 1566015601:
                                            if (str.equals("application/cea-608")) {
                                                c3 = '\b';
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 1566016562:
                                            if (str.equals("application/cea-708")) {
                                                c3 = '\t';
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 1668750253:
                                            if (str.equals("application/x-subrip")) {
                                                c3 = '\n';
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 1693976202:
                                            if (str.equals("application/ttml+xml")) {
                                                c3 = 11;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        default:
                                            c3 = 65535;
                                            break;
                                    }
                                    switch (c3) {
                                        case 0:
                                            aVar = new e5.a(list3);
                                            bVar = aVar;
                                            this.K = bVar;
                                            return;
                                        case 1:
                                            bVar = new y4.b();
                                            this.K = bVar;
                                            return;
                                        case 2:
                                            bVar = new e5.a();
                                            this.K = bVar;
                                            return;
                                        case 3:
                                            bVar = new e5.k();
                                            this.K = bVar;
                                            return;
                                        case 4:
                                            aVar = new d5.a(list3);
                                            bVar = aVar;
                                            this.K = bVar;
                                            return;
                                        case 5:
                                            aVar = new a5.a(list3);
                                            bVar = aVar;
                                            this.K = bVar;
                                            return;
                                        case 6:
                                        case '\b':
                                            bVar = new w4.c(str, i14);
                                            this.K = bVar;
                                            return;
                                        case 7:
                                            bVar = new com.google.android.gms.common.api.internal.v();
                                            this.K = bVar;
                                            return;
                                        case '\t':
                                            aVar = new w4.f(i14, list3);
                                            bVar = aVar;
                                            this.K = bVar;
                                            return;
                                        case '\n':
                                            bVar = new b5.a();
                                            this.K = bVar;
                                            return;
                                        case 11:
                                            bVar = new c5.f();
                                            this.K = bVar;
                                            return;
                                    }
                                }
                                throw new IllegalArgumentException(w2.e(str4, str));
                            }
                        }
                        f7.b bVar5 = bVar4;
                        int s6 = s(bVar5, jVar, 0);
                        if (s6 == -4) {
                            try {
                                if (jVar.d(4)) {
                                    this.F = true;
                                    this.H = false;
                                } else {
                                    n0 n0Var4 = (n0) bVar5.c;
                                    if (n0Var4 == null) {
                                        return;
                                    }
                                    jVar.s = n0Var4.G;
                                    jVar.l();
                                    this.H &= !jVar.d(1);
                                }
                                if (!this.H) {
                                    g gVar8 = this.K;
                                    gVar8.getClass();
                                    gVar8.d(jVar);
                                    this.L = null;
                                }
                            } catch (h e11) {
                                e = e11;
                                h5.a.p("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.J, e);
                                c cVar32 = new c(A(this.R), i0.e);
                                if (handler == null) {
                                }
                                C();
                                g gVar72 = this.K;
                                gVar72.getClass();
                                gVar72.release();
                                this.K = null;
                                this.I = i10;
                                this.H = true;
                                n0 n0Var32 = this.J;
                                n0Var32.getClass();
                                iVar.getClass();
                                str = n0Var32.C;
                                int i142 = n0Var32.U;
                                List list32 = n0Var32.E;
                                if (str != null) {
                                }
                                throw new IllegalArgumentException(w2.e(str4, str));
                            }
                        } else if (s6 == -3) {
                            return;
                        }
                        bVar4 = bVar5;
                    } catch (h e12) {
                        e = e12;
                    }
                }
                return;
            }
        }
        z10 = z4;
        obj = "application/dvbsubs";
        j12 = j10;
        if (z10) {
        }
        if (this.I != 2) {
        }
    }

    @Override // j3.e
    public final int x(n0 n0Var) {
        this.D.getClass();
        String str = n0Var.C;
        if ("text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || "text/x-exoplayer-cues".equals(str)) {
            return e2.c.b(n0Var.X == 0 ? 4 : 2, 0, 0);
        }
        return o.i(n0Var.C) ? e2.c.b(1, 0, 0) : e2.c.b(0, 0, 0);
    }

    public final long z() {
        if (this.O == -1) {
            return Long.MAX_VALUE;
        }
        this.M.getClass();
        if (this.O >= this.M.r()) {
            return Long.MAX_VALUE;
        }
        return this.M.h(this.O);
    }
}
