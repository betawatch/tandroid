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
import h2.h;
import hi.y1;
import i2.b0;
import i2.e0;
import i2.f;
import i2.y;
import j$.util.Objects;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import m.g3;
import org.telegram.ui.Cells.r6;
import u2.d1;
import u2.g0;
import z3.i;
import z3.j;
import z3.m;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class e extends f implements Handler.Callback {
    public final ob.a I;
    public final h J;
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
    public final b0 U;
    public final of.b V;
    public boolean W;
    public boolean X;
    public s Y;
    public long Z;
    public long a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b0 b0Var, Looper looper) {
        super(3);
        Handler handler;
        g3 g3Var = d.C;
        this.U = b0Var;
        if (looper == null) {
            handler = null;
        } else {
            String str = d0.a;
            handler = new Handler(looper, this);
        }
        this.T = handler;
        this.L = g3Var;
        this.I = new ob.a(28);
        this.J = new h(1, 0);
        this.V = new of.b(17);
        this.a0 = -9223372036854775807L;
        this.Z = -9223372036854775807L;
    }

    @Override // i2.f
    public final int A(s sVar) {
        boolean equals = Objects.equals(sVar.r, "application/x-media3-cues");
        String str = sVar.r;
        if (!equals) {
            g3 g3Var = (g3) this.L;
            g3Var.getClass();
            if (!((rb.a) g3Var.b).C(sVar) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                return r0.l(str) ? hc.b.c(1, 0, 0, 0) : hc.b.c(0, 0, 0, 0);
            }
        }
        return hc.b.c(sVar.S == 0 ? 4 : 2, 0, 0, 0);
    }

    public final void C() {
        e2.d.f("Legacy decoding is disabled, can't handle " + this.Y.r + " samples (expected application/x-media3-cues).", Objects.equals(this.Y.r, "application/cea-608") || Objects.equals(this.Y.r, "application/x-mp4-cea-608") || Objects.equals(this.Y.r, "application/cea-708"));
    }

    public final long D() {
        if (this.S == -1) {
            return Long.MAX_VALUE;
        }
        this.Q.getClass();
        if (this.S >= this.Q.u()) {
            return Long.MAX_VALUE;
        }
        return this.Q.g(this.S);
    }

    public final long E(long j3) {
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
    public final void F() {
        z3.e bVar;
        char c10 = 1;
        this.M = true;
        s sVar = this.Y;
        sVar.getClass();
        rb.a aVar = (rb.a) ((g3) this.L).b;
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
        if (!aVar.C(sVar)) {
            throw new IllegalArgumentException(r6.i("Attempted to create decoder for unsupported MIME type: ", str));
        }
        m d = aVar.d(sVar);
        bVar = new b(d.getClass().getSimpleName().concat("Decoder"), d);
        this.O = bVar;
        bVar.a(this.w);
    }

    public final void G(d2.c cVar) {
        a1 a1Var = cVar.a;
        b0 b0Var = this.U;
        b0Var.a.m.e(27, new y(0, a1Var));
        e0 e0Var = b0Var.a;
        e0Var.b0 = cVar;
        e0Var.m.e(27, new y1(cVar, 10));
    }

    public final void H() {
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
        G((d2.c) message.obj);
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
                if (aVar.b(this.Z) == Long.MIN_VALUE) {
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
                if (this.X) {
                    return false;
                }
                if (this.W) {
                    j jVar = this.Q;
                    long j3 = this.Z;
                    if (jVar == null || jVar.u() <= 0 || jVar.g(jVar.u() - 1) <= j3) {
                        j jVar2 = this.R;
                        long j10 = this.Z;
                        if ((jVar2 == null || jVar2.u() <= 0 || jVar2.g(jVar2.u() - 1) <= j10) && this.P != null) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // i2.f
    public final void o() {
        this.Y = null;
        this.a0 = -9223372036854775807L;
        d2.c cVar = new d2.c(E(this.Z), a1.e);
        Handler handler = this.T;
        if (handler != null) {
            handler.obtainMessage(1, cVar).sendToTarget();
        } else {
            G(cVar);
        }
        this.Z = -9223372036854775807L;
        if (this.O != null) {
            H();
            z3.e eVar = this.O;
            eVar.getClass();
            eVar.release();
            this.O = null;
            this.N = 0;
        }
    }

    @Override // i2.f
    public final void q(long j3, boolean z10) {
        this.Z = j3;
        a aVar = this.K;
        if (aVar != null) {
            aVar.clear();
        }
        d2.c cVar = new d2.c(E(this.Z), a1.e);
        Handler handler = this.T;
        if (handler != null) {
            handler.obtainMessage(1, cVar).sendToTarget();
        } else {
            G(cVar);
        }
        this.W = false;
        this.X = false;
        this.a0 = -9223372036854775807L;
        s sVar = this.Y;
        if (sVar == null || Objects.equals(sVar.r, "application/x-media3-cues")) {
            return;
        }
        if (this.N == 0) {
            H();
            z3.e eVar = this.O;
            eVar.getClass();
            eVar.flush();
            eVar.a(this.w);
            return;
        }
        H();
        z3.e eVar2 = this.O;
        eVar2.getClass();
        eVar2.release();
        this.O = null;
        this.N = 0;
        F();
    }

    @Override // i2.f
    public final void v(s[] sVarArr, long j3, long j10, g0 g0Var) {
        s sVar = sVarArr[0];
        this.Y = sVar;
        if (Objects.equals(sVar.r, "application/x-media3-cues")) {
            this.K = this.Y.P == 1 ? new c() : new l2.h(25);
            return;
        }
        C();
        if (this.O != null) {
            this.N = 1;
        } else {
            F();
        }
    }

    @Override // i2.f
    public final void x(long j3, long j10) {
        boolean z10;
        long j11;
        if (this.y) {
            long j12 = this.a0;
            if (j12 != -9223372036854775807L && j3 >= j12) {
                H();
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
        of.b bVar = this.V;
        boolean z11 = false;
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
                        z3.a aVar = new z3.a(j13, readBundle.getLong("d"), e2.d.j(new u2.c(23), parcelableArrayList));
                        hVar.clear();
                        z11 = this.K.e(aVar, j3);
                    }
                }
            }
            long b10 = this.K.b(this.Z);
            if (b10 == Long.MIN_VALUE && this.W && !z11) {
                this.X = true;
            }
            if (b10 != Long.MIN_VALUE && b10 <= j3) {
                z11 = true;
            }
            if (z11) {
                i0 c10 = this.K.c(j3);
                long g10 = this.K.g(j3);
                d2.c cVar = new d2.c(E(g10), c10);
                if (handler != null) {
                    handler.obtainMessage(1, cVar).sendToTarget();
                } else {
                    G(cVar);
                }
                this.K.i(g10);
            }
            this.Z = j3;
            return;
        }
        C();
        this.Z = j3;
        if (this.R == null) {
            z3.e eVar = this.O;
            eVar.getClass();
            eVar.b(j3);
            try {
                z3.e eVar2 = this.O;
                eVar2.getClass();
                this.R = (j) eVar2.c();
            } catch (z3.f e) {
                e2.a.f("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.Y, e);
                d2.c cVar2 = new d2.c(E(this.Z), a1.e);
                if (handler != null) {
                    handler.obtainMessage(1, cVar2).sendToTarget();
                } else {
                    G(cVar2);
                }
                H();
                z3.e eVar3 = this.O;
                eVar3.getClass();
                eVar3.release();
                this.O = null;
                this.N = 0;
                F();
                return;
            }
        }
        if (this.n != 2) {
            return;
        }
        if (this.Q != null) {
            long D = D();
            z10 = false;
            while (D <= j3) {
                this.S++;
                D = D();
                z10 = true;
            }
        } else {
            z10 = false;
        }
        j jVar = this.R;
        if (jVar != null) {
            if (jVar.isEndOfStream()) {
                if (!z10 && D() == Long.MAX_VALUE) {
                    if (this.N == 2) {
                        H();
                        z3.e eVar4 = this.O;
                        eVar4.getClass();
                        eVar4.release();
                        this.O = null;
                        this.N = 0;
                        F();
                    } else {
                        H();
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
                z10 = true;
            }
        }
        if (z10) {
            this.Q.getClass();
            int d = this.Q.d(j3);
            if (d == 0 || this.Q.u() == 0) {
                j11 = this.Q.timeUs;
            } else if (d == -1) {
                j jVar3 = this.Q;
                j11 = jVar3.g(jVar3.u() - 1);
            } else {
                j11 = this.Q.g(d - 1);
            }
            d2.c cVar3 = new d2.c(E(j11), this.Q.q(j3));
            if (handler != null) {
                handler.obtainMessage(1, cVar3).sendToTarget();
            } else {
                G(cVar3);
            }
        }
        if (this.N == 2) {
            return;
        }
        while (!this.W) {
            try {
                i iVar = this.P;
                if (iVar == null) {
                    z3.e eVar5 = this.O;
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
                    z3.e eVar6 = this.O;
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
                        s sVar2 = (s) bVar.c;
                        if (sVar2 == null) {
                            return;
                        }
                        iVar.r = sVar2.w;
                        iVar.c();
                        this.M &= !iVar.isKeyFrame();
                    }
                    if (!this.M) {
                        z3.e eVar7 = this.O;
                        eVar7.getClass();
                        eVar7.e(iVar);
                        this.P = null;
                    }
                } else if (w10 == -3) {
                    return;
                }
            } catch (z3.f e7) {
                e2.a.f("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.Y, e7);
                d2.c cVar4 = new d2.c(E(this.Z), a1.e);
                if (handler != null) {
                    handler.obtainMessage(1, cVar4).sendToTarget();
                } else {
                    G(cVar4);
                }
                H();
                z3.e eVar8 = this.O;
                eVar8.getClass();
                eVar8.release();
                this.O = null;
                this.N = 0;
                F();
                return;
            }
        }
    }
}
