package w2;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import b2.r0;
import b2.s;
import e2.d0;
import e9.a1;
import e9.i0;
import h2.g;
import i2.c0;
import i2.f;
import i2.f0;
import i2.z;
import j$.util.Objects;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import n4.y;
import org.telegram.ui.Cells.p6;
import u2.b1;
import z3.i;
import z3.j;
import z3.m;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class e extends f implements Handler.Callback {
    public final ob.a I;
    public final g J;
    public a K;
    public final d L;
    public boolean M;
    public int N;
    public z3.e O;
    public i P;
    public j Q;
    public j R;
    public int S;
    public final Handler T;
    public final c0 U;
    public final y V;
    public boolean W;
    public boolean X;
    public s Y;
    public long Z;
    public long a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c0 c0Var, Looper looper) {
        super(3);
        Handler handler;
        v8.s sVar = d.C;
        this.U = c0Var;
        if (looper == null) {
            handler = null;
        } else {
            String str = d0.a;
            handler = new Handler(looper, this);
        }
        this.T = handler;
        this.L = sVar;
        this.I = new ob.a(28);
        this.J = new g(1, 0);
        this.V = new y(17, false);
        this.a0 = -9223372036854775807L;
        this.Z = -9223372036854775807L;
    }

    public final void B() {
        e2.d.f("Legacy decoding is disabled, can't handle " + this.Y.r + " samples (expected application/x-media3-cues).", Objects.equals(this.Y.r, "application/cea-608") || Objects.equals(this.Y.r, "application/x-mp4-cea-608") || Objects.equals(this.Y.r, "application/cea-708"));
    }

    public final long C() {
        if (this.S == -1) {
            return Long.MAX_VALUE;
        }
        this.Q.getClass();
        if (this.S >= this.Q.k()) {
            return Long.MAX_VALUE;
        }
        return this.Q.e(this.S);
    }

    public final long D(long j3) {
        e2.d.g(j3 != -9223372036854775807L);
        return j3 - this.v;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r3.equals("application/cea-608") == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E() {
        z3.e bVar;
        char c10 = 1;
        this.M = true;
        s sVar = this.Y;
        sVar.getClass();
        rb.a aVar = (rb.a) ((v8.s) this.L).a;
        String str = sVar.r;
        int i10 = sVar.O;
        if (str != null) {
            switch (str.hashCode()) {
                case 930165504:
                    if (str.equals("application/x-mp4-cea-608")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1566015601:
                    break;
                case 1566016562:
                    if (str.equals("application/cea-708")) {
                        c10 = 2;
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
                case 1:
                    bVar = new a4.d(str, i10);
                    break;
                case 2:
                    bVar = new a4.i(i10, sVar.u);
                    break;
            }
            this.O = bVar;
            bVar.a(this.w);
        }
        if (!aVar.i0(sVar)) {
            throw new IllegalArgumentException(p6.i("Attempted to create decoder for unsupported MIME type: ", str));
        }
        m v = aVar.v(sVar);
        bVar = new b(v.getClass().getSimpleName().concat("Decoder"), v);
        this.O = bVar;
        bVar.a(this.w);
    }

    public final void F(d2.c cVar) {
        a1 a1Var = cVar.a;
        c0 c0Var = this.U;
        c0Var.a.m.e(27, new z(0, a1Var));
        f0 f0Var = c0Var.a;
        f0Var.b0 = cVar;
        f0Var.m.e(27, new fi.f(cVar, 7));
    }

    public final void G() {
        this.P = null;
        this.S = -1;
        j jVar = this.Q;
        if (jVar != null) {
            jVar.j();
            this.Q = null;
        }
        j jVar2 = this.R;
        if (jVar2 != null) {
            jVar2.j();
            this.R = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        F((d2.c) message.obj);
        return true;
    }

    @Override // i2.f
    public final String j() {
        return "TextRenderer";
    }

    @Override // i2.f
    public final boolean l() {
        return this.X;
    }

    @Override // i2.f
    public final boolean m() {
        s sVar = this.Y;
        if (sVar != null) {
            if (Objects.equals(sVar.r, "application/x-media3-cues")) {
                a aVar = this.K;
                aVar.getClass();
                if (aVar.a(this.Z) == Long.MIN_VALUE) {
                    try {
                        b1 b1Var = this.r;
                        b1Var.getClass();
                        b1Var.b();
                        return true;
                    } catch (IOException unused) {
                        return false;
                    }
                }
            } else {
                if (this.X) {
                    return false;
                }
                if (this.W) {
                    j jVar = this.Q;
                    long j3 = this.Z;
                    if (jVar == null || jVar.k() <= 0 || jVar.e(jVar.k() - 1) <= j3) {
                        j jVar2 = this.R;
                        long j10 = this.Z;
                        if ((jVar2 == null || jVar2.k() <= 0 || jVar2.e(jVar2.k() - 1) <= j10) && this.P != null) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // i2.f
    public final void n() {
        this.Y = null;
        this.a0 = -9223372036854775807L;
        d2.c cVar = new d2.c(D(this.Z), a1.e);
        Handler handler = this.T;
        if (handler != null) {
            handler.obtainMessage(1, cVar).sendToTarget();
        } else {
            F(cVar);
        }
        this.Z = -9223372036854775807L;
        if (this.O != null) {
            G();
            z3.e eVar = this.O;
            eVar.getClass();
            eVar.release();
            this.O = null;
            this.N = 0;
        }
    }

    @Override // i2.f
    public final void p(long j3, boolean z10) {
        this.Z = j3;
        a aVar = this.K;
        if (aVar != null) {
            aVar.clear();
        }
        d2.c cVar = new d2.c(D(this.Z), a1.e);
        Handler handler = this.T;
        if (handler != null) {
            handler.obtainMessage(1, cVar).sendToTarget();
        } else {
            F(cVar);
        }
        this.W = false;
        this.X = false;
        this.a0 = -9223372036854775807L;
        s sVar = this.Y;
        if (sVar == null || Objects.equals(sVar.r, "application/x-media3-cues")) {
            return;
        }
        if (this.N == 0) {
            G();
            z3.e eVar = this.O;
            eVar.getClass();
            eVar.flush();
            eVar.a(this.w);
            return;
        }
        G();
        z3.e eVar2 = this.O;
        eVar2.getClass();
        eVar2.release();
        this.O = null;
        this.N = 0;
        E();
    }

    @Override // i2.f
    public final void u(s[] sVarArr, long j3, long j10, u2.f0 f0Var) {
        s sVar = sVarArr[0];
        this.Y = sVar;
        if (Objects.equals(sVar.r, "application/x-media3-cues")) {
            this.K = this.Y.P == 1 ? new c() : new c5.m(2);
            return;
        }
        B();
        if (this.O != null) {
            this.N = 1;
        } else {
            E();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0221 A[EXC_TOP_SPLITTER, LOOP:1: B:94:0x0221->B:115:0x0221, LOOP_START, SYNTHETIC] */
    @Override // i2.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(long j3, long j10) {
        boolean z10;
        y yVar;
        long j11;
        if (this.y) {
            long j12 = this.a0;
            if (j12 != -9223372036854775807L && j3 >= j12) {
                G();
                this.X = true;
            }
        }
        if (this.X) {
            return;
        }
        s sVar = this.Y;
        sVar.getClass();
        boolean equals = Objects.equals(sVar.r, "application/x-media3-cues");
        Handler handler = this.T;
        y yVar2 = this.V;
        boolean z11 = false;
        if (equals) {
            this.K.getClass();
            if (!this.W) {
                g gVar = this.J;
                if (v(yVar2, gVar, 0) == -4) {
                    if (gVar.c(4)) {
                        this.W = true;
                    } else {
                        gVar.m();
                        ByteBuffer byteBuffer = gVar.e;
                        byteBuffer.getClass();
                        long j13 = gVar.h;
                        byte[] array = byteBuffer.array();
                        int arrayOffset = byteBuffer.arrayOffset();
                        int limit = byteBuffer.limit();
                        this.I.getClass();
                        Parcel obtain = Parcel.obtain();
                        obtain.unmarshall(array, arrayOffset, limit);
                        obtain.setDataPosition(0);
                        Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
                        obtain.recycle();
                        ArrayList parcelableArrayList = readBundle.getParcelableArrayList("c");
                        parcelableArrayList.getClass();
                        z3.a aVar = new z3.a(j13, readBundle.getLong("d"), e2.d.j(new t0.a(28), parcelableArrayList));
                        gVar.i();
                        z11 = this.K.c(aVar, j3);
                    }
                }
            }
            long a2 = this.K.a(this.Z);
            if (a2 == Long.MIN_VALUE && this.W && !z11) {
                this.X = true;
            }
            if (a2 != Long.MIN_VALUE && a2 <= j3) {
                z11 = true;
            }
            if (z11) {
                i0 b10 = this.K.b(j3);
                long d = this.K.d(j3);
                d2.c cVar = new d2.c(D(d), b10);
                if (handler != null) {
                    handler.obtainMessage(1, cVar).sendToTarget();
                } else {
                    F(cVar);
                }
                this.K.e(d);
            }
            this.Z = j3;
            return;
        }
        B();
        this.Z = j3;
        if (this.R == null) {
            z3.e eVar = this.O;
            eVar.getClass();
            eVar.b(j3);
            try {
                z3.e eVar2 = this.O;
                eVar2.getClass();
                this.R = (j) eVar2.c();
            } catch (z3.f e7) {
                e2.a.f("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.Y, e7);
                d2.c cVar2 = new d2.c(D(this.Z), a1.e);
                if (handler != null) {
                    handler.obtainMessage(1, cVar2).sendToTarget();
                } else {
                    F(cVar2);
                }
                G();
                z3.e eVar3 = this.O;
                eVar3.getClass();
                eVar3.release();
                this.O = null;
                this.N = 0;
                E();
                return;
            }
        }
        if (this.n != 2) {
            return;
        }
        if (this.Q != null) {
            long C = C();
            z10 = false;
            while (C <= j3) {
                this.S++;
                C = C();
                z10 = true;
            }
        } else {
            z10 = false;
        }
        j jVar = this.R;
        if (jVar != null) {
            if (!jVar.c(4)) {
                yVar = yVar2;
                if (jVar.c <= j3) {
                    j jVar2 = this.Q;
                    if (jVar2 != null) {
                        jVar2.j();
                    }
                    this.S = jVar.d(j3);
                    this.Q = jVar;
                    this.R = null;
                    z10 = true;
                }
                if (z10) {
                    this.Q.getClass();
                    int d10 = this.Q.d(j3);
                    if (d10 == 0 || this.Q.k() == 0) {
                        j11 = this.Q.c;
                    } else if (d10 == -1) {
                        j jVar3 = this.Q;
                        j11 = jVar3.e(jVar3.k() - 1);
                    } else {
                        j11 = this.Q.e(d10 - 1);
                    }
                    d2.c cVar3 = new d2.c(D(j11), this.Q.h(j3));
                    if (handler != null) {
                        handler.obtainMessage(1, cVar3).sendToTarget();
                    } else {
                        F(cVar3);
                    }
                }
                if (this.N != 2) {
                    return;
                }
                while (!this.W) {
                    try {
                        i iVar = this.P;
                        if (iVar == null) {
                            z3.e eVar4 = this.O;
                            eVar4.getClass();
                            iVar = (i) eVar4.d();
                            if (iVar == null) {
                                return;
                            } else {
                                this.P = iVar;
                            }
                        }
                        if (this.N == 1) {
                            iVar.b = 4;
                            z3.e eVar5 = this.O;
                            eVar5.getClass();
                            eVar5.e(iVar);
                            this.P = null;
                            this.N = 2;
                            return;
                        }
                        int v = v(yVar, iVar, 0);
                        if (v == -4) {
                            if (iVar.c(4)) {
                                this.W = true;
                                this.M = false;
                            } else {
                                s sVar2 = (s) yVar.c;
                                if (sVar2 == null) {
                                    return;
                                }
                                iVar.v = sVar2.w;
                                iVar.m();
                                this.M &= !iVar.c(1);
                            }
                            if (!this.M) {
                                z3.e eVar6 = this.O;
                                eVar6.getClass();
                                eVar6.e(iVar);
                                this.P = null;
                            }
                        } else if (v == -3) {
                            return;
                        }
                    } catch (z3.f e10) {
                        e2.a.f("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.Y, e10);
                        d2.c cVar4 = new d2.c(D(this.Z), a1.e);
                        if (handler != null) {
                            handler.obtainMessage(1, cVar4).sendToTarget();
                        } else {
                            F(cVar4);
                        }
                        G();
                        z3.e eVar7 = this.O;
                        eVar7.getClass();
                        eVar7.release();
                        this.O = null;
                        this.N = 0;
                        E();
                        return;
                    }
                }
                return;
            }
            if (!z10 && C() == Long.MAX_VALUE) {
                if (this.N == 2) {
                    G();
                    z3.e eVar8 = this.O;
                    eVar8.getClass();
                    eVar8.release();
                    this.O = null;
                    this.N = 0;
                    E();
                } else {
                    G();
                    this.X = true;
                }
            }
        }
        yVar = yVar2;
        if (z10) {
        }
        if (this.N != 2) {
        }
    }

    @Override // i2.f
    public final int z(s sVar) {
        boolean equals = Objects.equals(sVar.r, "application/x-media3-cues");
        String str = sVar.r;
        if (!equals) {
            v8.s sVar2 = (v8.s) this.L;
            sVar2.getClass();
            if (!((rb.a) sVar2.a).i0(sVar) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                return r0.l(str) ? i2.g.b(1, 0, 0, 0) : i2.g.b(0, 0, 0, 0);
            }
        }
        return i2.g.b(sVar.S == 0 ? 4 : 2, 0, 0, 0);
    }
}
