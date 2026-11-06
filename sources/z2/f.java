package z2;

import a3.l;
import a8.ia;
import a8.ja;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import c4.i;
import c4.j;
import c4.m;
import e2.s0;
import e2.u;
import h2.m0;
import h9.t1;
import j$.util.Objects;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import jg.g;
import k2.h;
import l2.c0;
import l2.i0;
import l2.y;
import l2.z;
import w7.s;
import x2.c1;
import x2.g0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class f extends l2.b implements Handler.Callback {
    public final qb.a I;
    public final h J;
    public a K;
    public final e L;
    public boolean M;
    public int N;
    public c4.e O;
    public i P;
    public j Q;
    public j R;
    public int S;
    public final Handler T;
    public final c0 U;
    public final wf.b V;
    public boolean W;
    public boolean X;
    public u Y;
    public long Z;
    public long a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(c0 c0Var, Looper looper) {
        super(3);
        Handler handler;
        d dVar = e.a;
        this.U = c0Var;
        if (looper == null) {
            handler = null;
        } else {
            String str = m0.a;
            handler = new Handler(looper, this);
        }
        this.T = handler;
        this.L = dVar;
        this.I = new qb.a(5);
        this.J = new h(1, 0);
        this.V = new wf.b(27, false);
        this.a0 = -9223372036854775807L;
        this.Z = -9223372036854775807L;
    }

    @Override // l2.b
    public final int C(u uVar) {
        boolean equals = Objects.equals(uVar.s, "application/x-media3-cues");
        String str = uVar.s;
        if (!equals) {
            d dVar = (d) this.L;
            dVar.getClass();
            if (!((s) dVar.b).w(uVar) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                return s0.l(str) ? g.b(1, 0, 0, 0) : g.b(0, 0, 0, 0);
            }
        }
        return g.b(uVar.T == 0 ? 4 : 2, 0, 0, 0);
    }

    public final void F() {
        boolean z9 = Objects.equals(this.Y.s, "application/cea-608") || Objects.equals(this.Y.s, "application/x-mp4-cea-608") || Objects.equals(this.Y.s, "application/cea-708");
        String str = this.Y.s;
        if (!z9) {
            throw new IllegalStateException(ja.a("Legacy decoding is disabled, can't handle %s samples (expected %s).", str, "application/x-media3-cues"));
        }
    }

    public final long G() {
        if (this.S == -1) {
            return Long.MAX_VALUE;
        }
        this.Q.getClass();
        if (this.S >= this.Q.y()) {
            return Long.MAX_VALUE;
        }
        return this.Q.k(this.S);
    }

    public final long H(long j3) {
        ia.p(j3 != -9223372036854775807L);
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
        this.M = true;
        u uVar = this.Y;
        uVar.getClass();
        s sVar = (s) ((d) this.L).b;
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
                    bVar = new d4.g(i7, uVar.v);
                    break;
            }
            this.O = bVar;
            bVar.a(this.x);
        }
        if (!sVar.w(uVar)) {
            throw new IllegalArgumentException(rf.b.i("Attempted to create decoder for unsupported MIME type: ", str));
        }
        m l10 = sVar.l(uVar);
        bVar = new b(l10.getClass().getSimpleName().concat("Decoder"), l10);
        this.O = bVar;
        bVar.a(this.x);
    }

    public final void J(g2.d dVar) {
        t1 t1Var = dVar.a;
        c0 c0Var = this.U;
        c0Var.a.m.e(27, new z(0, t1Var));
        i0 i0Var = c0Var.a;
        i0Var.e0 = dVar;
        i0Var.m.e(27, new y(dVar, 0));
    }

    public final void K() {
        this.P = null;
        this.S = -1;
        j jVar = this.Q;
        if (jVar != null) {
            jVar.release();
            this.Q = null;
        }
        j jVar2 = this.R;
        if (jVar2 != null) {
            jVar2.release();
            this.R = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        J((g2.d) message.obj);
        return true;
    }

    @Override // l2.b
    public final String i() {
        return "TextRenderer";
    }

    @Override // l2.b
    public final boolean l() {
        return this.X;
    }

    @Override // l2.b
    public final boolean m() {
        u uVar = this.Y;
        if (uVar != null) {
            if (Objects.equals(uVar.s, "application/x-media3-cues")) {
                a aVar = this.K;
                aVar.getClass();
                if (aVar.a(this.Z) == Long.MIN_VALUE) {
                    try {
                        c1 c1Var = this.r;
                        c1Var.getClass();
                        c1Var.a();
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
                    if (jVar == null || jVar.y() <= 0 || jVar.k(jVar.y() - 1) <= j3) {
                        j jVar2 = this.R;
                        long j10 = this.Z;
                        if ((jVar2 == null || jVar2.y() <= 0 || jVar2.k(jVar2.y() - 1) <= j10) && this.P != null) {
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
        this.Y = null;
        this.a0 = -9223372036854775807L;
        g2.d dVar = new g2.d(H(this.Z), t1.e);
        Handler handler = this.T;
        if (handler != null) {
            handler.obtainMessage(1, dVar).sendToTarget();
        } else {
            J(dVar);
        }
        this.Z = -9223372036854775807L;
        if (this.O != null) {
            K();
            c4.e eVar = this.O;
            eVar.getClass();
            eVar.release();
            this.O = null;
            this.N = 0;
        }
    }

    @Override // l2.b
    public final void p(long j3, boolean z9, boolean z10) {
        this.Z = j3;
        a aVar = this.K;
        if (aVar != null) {
            aVar.clear();
        }
        g2.d dVar = new g2.d(H(this.Z), t1.e);
        Handler handler = this.T;
        if (handler != null) {
            handler.obtainMessage(1, dVar).sendToTarget();
        } else {
            J(dVar);
        }
        this.W = false;
        this.X = false;
        this.a0 = -9223372036854775807L;
        u uVar = this.Y;
        if (uVar == null || Objects.equals(uVar.s, "application/x-media3-cues")) {
            return;
        }
        if (this.N == 0) {
            K();
            c4.e eVar = this.O;
            eVar.getClass();
            eVar.flush();
            eVar.a(this.x);
            return;
        }
        K();
        c4.e eVar2 = this.O;
        eVar2.getClass();
        eVar2.release();
        this.O = null;
        this.N = 0;
        I();
    }

    @Override // l2.b
    public final void u(u[] uVarArr, long j3, long j10, g0 g0Var) {
        u uVar = uVarArr[0];
        this.Y = uVar;
        if (Objects.equals(uVar.s, "application/x-media3-cues")) {
            this.K = this.Y.Q == 1 ? new c() : new f5.j();
            return;
        }
        F();
        if (this.O != null) {
            this.N = 1;
        } else {
            I();
        }
    }

    @Override // l2.b
    public final void x(long j3, long j10) {
        boolean z9;
        long j11;
        if (this.D) {
            long j12 = this.a0;
            if (j12 != -9223372036854775807L && j3 >= j12) {
                K();
                this.X = true;
            }
        }
        if (this.X) {
            return;
        }
        u uVar = this.Y;
        uVar.getClass();
        boolean equals = Objects.equals(uVar.s, "application/x-media3-cues");
        Handler handler = this.T;
        wf.b bVar = this.V;
        boolean z10 = false;
        if (equals) {
            this.K.getClass();
            if (!this.W) {
                h hVar = this.J;
                if (w(bVar, hVar, 0) == -4) {
                    if (hVar.isEndOfStream()) {
                        this.W = true;
                    } else {
                        hVar.c();
                        ByteBuffer byteBuffer = hVar.c;
                        byteBuffer.getClass();
                        long j13 = hVar.e;
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
                        c4.a aVar = new c4.a(j13, readBundle.getLong("d"), h2.e.b(new l(27), parcelableArrayList));
                        hVar.clear();
                        z10 = this.K.c(aVar, j3);
                    }
                }
            }
            long a10 = this.K.a(this.Z);
            if (a10 == Long.MIN_VALUE && this.W && !z10) {
                this.X = true;
            }
            if (a10 != Long.MIN_VALUE && a10 <= j3) {
                z10 = true;
            }
            if (z10) {
                h9.i0 b10 = this.K.b(j3);
                long d = this.K.d(j3);
                g2.d dVar = new g2.d(H(d), b10);
                if (handler != null) {
                    handler.obtainMessage(1, dVar).sendToTarget();
                } else {
                    J(dVar);
                }
                this.K.e(d);
            }
            this.Z = j3;
            return;
        }
        F();
        this.Z = j3;
        if (this.R == null) {
            c4.e eVar = this.O;
            eVar.getClass();
            eVar.b(j3);
            try {
                c4.e eVar2 = this.O;
                eVar2.getClass();
                this.R = (j) eVar2.c();
            } catch (c4.f e10) {
                h2.a.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.Y, e10);
                g2.d dVar2 = new g2.d(H(this.Z), t1.e);
                if (handler != null) {
                    handler.obtainMessage(1, dVar2).sendToTarget();
                } else {
                    J(dVar2);
                }
                K();
                c4.e eVar3 = this.O;
                eVar3.getClass();
                eVar3.release();
                this.O = null;
                this.N = 0;
                I();
                return;
            }
        }
        if (this.n != 2) {
            return;
        }
        if (this.Q != null) {
            long G = G();
            z9 = false;
            while (G <= j3) {
                this.S++;
                G = G();
                z9 = true;
            }
        } else {
            z9 = false;
        }
        j jVar = this.R;
        if (jVar != null) {
            if (jVar.isEndOfStream()) {
                if (!z9 && G() == Long.MAX_VALUE) {
                    if (this.N == 2) {
                        K();
                        c4.e eVar4 = this.O;
                        eVar4.getClass();
                        eVar4.release();
                        this.O = null;
                        this.N = 0;
                        I();
                    } else {
                        K();
                        this.X = true;
                    }
                }
            } else if (jVar.timeUs <= j3) {
                j jVar2 = this.Q;
                if (jVar2 != null) {
                    jVar2.release();
                }
                this.S = jVar.d(j3);
                this.Q = jVar;
                this.R = null;
                z9 = true;
            }
        }
        if (z9) {
            this.Q.getClass();
            int d2 = this.Q.d(j3);
            if (d2 == 0 || this.Q.y() == 0) {
                j11 = this.Q.timeUs;
            } else if (d2 == -1) {
                j jVar3 = this.Q;
                j11 = jVar3.k(jVar3.y() - 1);
            } else {
                j11 = this.Q.k(d2 - 1);
            }
            g2.d dVar3 = new g2.d(H(j11), this.Q.s(j3));
            if (handler != null) {
                handler.obtainMessage(1, dVar3).sendToTarget();
            } else {
                J(dVar3);
            }
        }
        if (this.N == 2) {
            return;
        }
        while (!this.W) {
            try {
                i iVar = this.P;
                if (iVar == null) {
                    c4.e eVar5 = this.O;
                    eVar5.getClass();
                    iVar = (i) eVar5.d();
                    if (iVar == null) {
                        return;
                    } else {
                        this.P = iVar;
                    }
                }
                if (this.N == 1) {
                    iVar.setFlags(4);
                    c4.e eVar6 = this.O;
                    eVar6.getClass();
                    eVar6.e(iVar);
                    this.P = null;
                    this.N = 2;
                    return;
                }
                int w10 = w(bVar, iVar, 0);
                if (w10 == -4) {
                    if (iVar.isEndOfStream()) {
                        this.W = true;
                        this.M = false;
                    } else {
                        u uVar2 = (u) bVar.c;
                        if (uVar2 == null) {
                            return;
                        }
                        iVar.r = uVar2.x;
                        iVar.c();
                        this.M &= !iVar.isKeyFrame();
                    }
                    if (!this.M) {
                        c4.e eVar7 = this.O;
                        eVar7.getClass();
                        eVar7.e(iVar);
                        this.P = null;
                    }
                } else if (w10 == -3) {
                    return;
                }
            } catch (c4.f e11) {
                h2.a.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.Y, e11);
                g2.d dVar4 = new g2.d(H(this.Z), t1.e);
                if (handler != null) {
                    handler.obtainMessage(1, dVar4).sendToTarget();
                } else {
                    J(dVar4);
                }
                K();
                c4.e eVar8 = this.O;
                eVar8.getClass();
                eVar8.release();
                this.O = null;
                this.N = 0;
                I();
                return;
            }
        }
    }
}
