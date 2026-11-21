package z2;

import a3.l;
import a8.la;
import a8.ma;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import c4.f;
import c4.i;
import c4.j;
import c4.m;
import d4.g;
import e2.s0;
import e2.u;
import h2.l0;
import h9.i0;
import h9.t1;
import j$.util.Objects;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import k2.h;
import kg.x1;
import l2.w;
import l2.z;
import oi.z3;
import v4.f0;
import x2.d1;
import x2.g0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class e extends l2.b implements Handler.Callback {
    public final sa.d J;
    public final h K;
    public a L;
    public final d M;
    public boolean N;
    public int O;
    public c4.e P;
    public i Q;
    public j R;
    public j S;
    public int T;
    public final Handler U;
    public final z V;
    public final k8.a W;
    public boolean X;
    public boolean Y;
    public u Z;
    public long a0;
    public long b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(z zVar, Looper looper) {
        super(3);
        Handler handler;
        f0 f0Var = d.D;
        this.V = zVar;
        if (looper == null) {
            handler = null;
        } else {
            String str = l0.a;
            handler = new Handler(looper, this);
        }
        this.U = handler;
        this.M = f0Var;
        this.J = new sa.d(5);
        this.K = new h(1, 0);
        this.W = new k8.a(1, false);
        this.b0 = -9223372036854775807L;
        this.a0 = -9223372036854775807L;
    }

    @Override // l2.b
    public final int C(u uVar) {
        boolean equals = Objects.equals(uVar.s, "application/x-media3-cues");
        String str = uVar.s;
        if (!equals) {
            f0 f0Var = (f0) this.M;
            f0Var.getClass();
            if (!((nb.a) f0Var.a).H(uVar) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                return s0.l(str) ? i5.c.a(1, 0, 0, 0) : i5.c.a(0, 0, 0, 0);
            }
        }
        return i5.c.a(uVar.T == 0 ? 4 : 2, 0, 0, 0);
    }

    public final void F() {
        boolean z10 = Objects.equals(this.Z.s, "application/cea-608") || Objects.equals(this.Z.s, "application/x-mp4-cea-608") || Objects.equals(this.Z.s, "application/cea-708");
        String str = this.Z.s;
        if (!z10) {
            throw new IllegalStateException(ma.a("Legacy decoding is disabled, can't handle %s samples (expected %s).", str, "application/x-media3-cues"));
        }
    }

    public final long G() {
        if (this.T == -1) {
            return Long.MAX_VALUE;
        }
        this.R.getClass();
        if (this.T >= this.R.p()) {
            return Long.MAX_VALUE;
        }
        return this.R.h(this.T);
    }

    public final long H(long j3) {
        la.p(j3 != -9223372036854775807L);
        return j3 - this.w;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r3.equals("application/cea-608") == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I() {
        c4.e bVar;
        char c10 = 1;
        this.N = true;
        u uVar = this.Z;
        uVar.getClass();
        nb.a aVar = (nb.a) ((f0) this.M).a;
        String str = uVar.s;
        int i7 = uVar.P;
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
                    bVar = new d4.c(str, i7);
                    break;
                case 2:
                    bVar = new g(i7, uVar.v);
                    break;
            }
            this.P = bVar;
            bVar.a(this.x);
        }
        if (!aVar.H(uVar)) {
            throw new IllegalArgumentException(p5.c.k("Attempted to create decoder for unsupported MIME type: ", str));
        }
        m j3 = aVar.j(uVar);
        bVar = new b(j3.getClass().getSimpleName().concat("Decoder"), j3);
        this.P = bVar;
        bVar.a(this.x);
    }

    public final void J(g2.c cVar) {
        t1 t1Var = cVar.a;
        z zVar = this.V;
        zVar.a.m.e(27, new w(0, t1Var));
        l2.f0 f0Var = zVar.a;
        f0Var.e0 = cVar;
        f0Var.m.e(27, new x1(cVar, 7));
    }

    public final void K() {
        this.Q = null;
        this.T = -1;
        j jVar = this.R;
        if (jVar != null) {
            jVar.release();
            this.R = null;
        }
        j jVar2 = this.S;
        if (jVar2 != null) {
            jVar2.release();
            this.S = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        J((g2.c) message.obj);
        return true;
    }

    @Override // l2.b
    public final String i() {
        return "TextRenderer";
    }

    @Override // l2.b
    public final boolean l() {
        return this.Y;
    }

    @Override // l2.b
    public final boolean m() {
        u uVar = this.Z;
        if (uVar != null) {
            if (Objects.equals(uVar.s, "application/x-media3-cues")) {
                a aVar = this.L;
                aVar.getClass();
                if (aVar.a(this.a0) == Long.MIN_VALUE) {
                    try {
                        d1 d1Var = this.r;
                        d1Var.getClass();
                        d1Var.a();
                        return true;
                    } catch (IOException unused) {
                        return false;
                    }
                }
            } else {
                if (this.Y) {
                    return false;
                }
                if (this.X) {
                    j jVar = this.R;
                    long j3 = this.a0;
                    if (jVar == null || jVar.p() <= 0 || jVar.h(jVar.p() - 1) <= j3) {
                        j jVar2 = this.S;
                        long j10 = this.a0;
                        if ((jVar2 == null || jVar2.p() <= 0 || jVar2.h(jVar2.p() - 1) <= j10) && this.Q != null) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // l2.b
    public final void n() {
        this.Z = null;
        this.b0 = -9223372036854775807L;
        g2.c cVar = new g2.c(H(this.a0), t1.e);
        Handler handler = this.U;
        if (handler != null) {
            handler.obtainMessage(1, cVar).sendToTarget();
        } else {
            J(cVar);
        }
        this.a0 = -9223372036854775807L;
        if (this.P != null) {
            K();
            c4.e eVar = this.P;
            eVar.getClass();
            eVar.release();
            this.P = null;
            this.O = 0;
        }
    }

    @Override // l2.b
    public final void p(long j3, boolean z10, boolean z11) {
        this.a0 = j3;
        a aVar = this.L;
        if (aVar != null) {
            aVar.clear();
        }
        g2.c cVar = new g2.c(H(this.a0), t1.e);
        Handler handler = this.U;
        if (handler != null) {
            handler.obtainMessage(1, cVar).sendToTarget();
        } else {
            J(cVar);
        }
        this.X = false;
        this.Y = false;
        this.b0 = -9223372036854775807L;
        u uVar = this.Z;
        if (uVar == null || Objects.equals(uVar.s, "application/x-media3-cues")) {
            return;
        }
        if (this.O == 0) {
            K();
            c4.e eVar = this.P;
            eVar.getClass();
            eVar.flush();
            eVar.a(this.x);
            return;
        }
        K();
        c4.e eVar2 = this.P;
        eVar2.getClass();
        eVar2.release();
        this.P = null;
        this.O = 0;
        I();
    }

    @Override // l2.b
    public final void u(u[] uVarArr, long j3, long j10, g0 g0Var) {
        u uVar = uVarArr[0];
        this.Z = uVar;
        if (Objects.equals(uVar.s, "application/x-media3-cues")) {
            this.L = this.Z.Q == 1 ? new c() : new z3(3);
            return;
        }
        F();
        if (this.P != null) {
            this.O = 1;
        } else {
            I();
        }
    }

    @Override // l2.b
    public final void x(long j3, long j10) {
        boolean z10;
        long j11;
        if (this.E) {
            long j12 = this.b0;
            if (j12 != -9223372036854775807L && j3 >= j12) {
                K();
                this.Y = true;
            }
        }
        if (this.Y) {
            return;
        }
        u uVar = this.Z;
        uVar.getClass();
        boolean equals = Objects.equals(uVar.s, "application/x-media3-cues");
        Handler handler = this.U;
        k8.a aVar = this.W;
        boolean z11 = false;
        if (equals) {
            this.L.getClass();
            if (!this.X) {
                h hVar = this.K;
                if (w(aVar, hVar, 0) == -4) {
                    if (hVar.isEndOfStream()) {
                        this.X = true;
                    } else {
                        hVar.c();
                        ByteBuffer byteBuffer = hVar.c;
                        byteBuffer.getClass();
                        long j13 = hVar.e;
                        byte[] array = byteBuffer.array();
                        int arrayOffset = byteBuffer.arrayOffset();
                        int limit = byteBuffer.limit();
                        this.J.getClass();
                        Parcel obtain = Parcel.obtain();
                        obtain.unmarshall(array, arrayOffset, limit);
                        obtain.setDataPosition(0);
                        Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
                        obtain.recycle();
                        ArrayList parcelableArrayList = readBundle.getParcelableArrayList("c");
                        parcelableArrayList.getClass();
                        c4.a aVar2 = new c4.a(j13, readBundle.getLong("d"), h2.e.b(new l(24), parcelableArrayList));
                        hVar.clear();
                        z11 = this.L.c(aVar2, j3);
                    }
                }
            }
            long a10 = this.L.a(this.a0);
            if (a10 == Long.MIN_VALUE && this.X && !z11) {
                this.Y = true;
            }
            if (a10 != Long.MIN_VALUE && a10 <= j3) {
                z11 = true;
            }
            if (z11) {
                i0 b10 = this.L.b(j3);
                long d = this.L.d(j3);
                g2.c cVar = new g2.c(H(d), b10);
                if (handler != null) {
                    handler.obtainMessage(1, cVar).sendToTarget();
                } else {
                    J(cVar);
                }
                this.L.e(d);
            }
            this.a0 = j3;
            return;
        }
        F();
        this.a0 = j3;
        if (this.S == null) {
            c4.e eVar = this.P;
            eVar.getClass();
            eVar.b(j3);
            try {
                c4.e eVar2 = this.P;
                eVar2.getClass();
                this.S = (j) eVar2.c();
            } catch (f e10) {
                h2.a.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.Z, e10);
                g2.c cVar2 = new g2.c(H(this.a0), t1.e);
                if (handler != null) {
                    handler.obtainMessage(1, cVar2).sendToTarget();
                } else {
                    J(cVar2);
                }
                K();
                c4.e eVar3 = this.P;
                eVar3.getClass();
                eVar3.release();
                this.P = null;
                this.O = 0;
                I();
                return;
            }
        }
        if (this.n != 2) {
            return;
        }
        if (this.R != null) {
            long G = G();
            z10 = false;
            while (G <= j3) {
                this.T++;
                G = G();
                z10 = true;
            }
        } else {
            z10 = false;
        }
        j jVar = this.S;
        if (jVar != null) {
            if (jVar.isEndOfStream()) {
                if (!z10 && G() == Long.MAX_VALUE) {
                    if (this.O == 2) {
                        K();
                        c4.e eVar4 = this.P;
                        eVar4.getClass();
                        eVar4.release();
                        this.P = null;
                        this.O = 0;
                        I();
                    } else {
                        K();
                        this.Y = true;
                    }
                }
            } else if (jVar.timeUs <= j3) {
                j jVar2 = this.R;
                if (jVar2 != null) {
                    jVar2.release();
                }
                this.T = jVar.d(j3);
                this.R = jVar;
                this.S = null;
                z10 = true;
            }
        }
        if (z10) {
            this.R.getClass();
            int d2 = this.R.d(j3);
            if (d2 == 0 || this.R.p() == 0) {
                j11 = this.R.timeUs;
            } else if (d2 == -1) {
                j jVar3 = this.R;
                j11 = jVar3.h(jVar3.p() - 1);
            } else {
                j11 = this.R.h(d2 - 1);
            }
            g2.c cVar3 = new g2.c(H(j11), this.R.m(j3));
            if (handler != null) {
                handler.obtainMessage(1, cVar3).sendToTarget();
            } else {
                J(cVar3);
            }
        }
        if (this.O == 2) {
            return;
        }
        while (!this.X) {
            try {
                i iVar = this.Q;
                if (iVar == null) {
                    c4.e eVar5 = this.P;
                    eVar5.getClass();
                    iVar = (i) eVar5.d();
                    if (iVar == null) {
                        return;
                    } else {
                        this.Q = iVar;
                    }
                }
                if (this.O == 1) {
                    iVar.setFlags(4);
                    c4.e eVar6 = this.P;
                    eVar6.getClass();
                    eVar6.e(iVar);
                    this.Q = null;
                    this.O = 2;
                    return;
                }
                int w10 = w(aVar, iVar, 0);
                if (w10 == -4) {
                    if (iVar.isEndOfStream()) {
                        this.X = true;
                        this.N = false;
                    } else {
                        u uVar2 = (u) aVar.c;
                        if (uVar2 == null) {
                            return;
                        }
                        iVar.r = uVar2.x;
                        iVar.c();
                        this.N &= !iVar.isKeyFrame();
                    }
                    if (!this.N) {
                        c4.e eVar7 = this.P;
                        eVar7.getClass();
                        eVar7.e(iVar);
                        this.Q = null;
                    }
                } else if (w10 == -3) {
                    return;
                }
            } catch (f e11) {
                h2.a.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.Z, e11);
                g2.c cVar4 = new g2.c(H(this.a0), t1.e);
                if (handler != null) {
                    handler.obtainMessage(1, cVar4).sendToTarget();
                } else {
                    J(cVar4);
                }
                K();
                c4.e eVar8 = this.P;
                eVar8.getClass();
                eVar8.release();
                this.P = null;
                this.O = 0;
                I();
                return;
            }
        }
    }
}
