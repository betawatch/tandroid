package y2;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import b4.i;
import b4.j;
import b4.m;
import b8.ac;
import b8.zb;
import c4.g;
import d2.u0;
import d2.v;
import ei.y8;
import g2.f;
import g2.n0;
import g9.s1;
import j$.util.Objects;
import j2.h;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import k2.c0;
import k2.i0;
import k2.p1;
import k2.z;
import org.telegram.ui.Components.y00;
import v7.s;
import w2.d1;
import w2.g0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e extends k2.b implements Handler.Callback {
    public final s J;
    public final h K;
    public a L;
    public final d M;
    public boolean N;
    public int O;
    public b4.e P;
    public i Q;
    public j R;
    public j S;
    public int T;
    public final Handler U;
    public final c0 V;
    public final tf.b W;
    public boolean X;
    public boolean Y;
    public v Z;
    public long a0;
    public long b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c0 c0Var, Looper looper) {
        super(3);
        Handler handler;
        y00 y00Var = d.C;
        int i3 = 3;
        this.V = c0Var;
        if (looper == null) {
            handler = null;
        } else {
            String str = n0.a;
            handler = new Handler(looper, this);
        }
        this.U = handler;
        this.M = y00Var;
        this.J = new s(i3);
        this.K = new h(1, 0);
        this.W = new tf.b();
        this.b0 = -9223372036854775807L;
        this.a0 = -9223372036854775807L;
    }

    @Override // k2.b
    public final int C(v vVar) {
        boolean equals = Objects.equals(vVar.s, "application/x-media3-cues");
        String str = vVar.s;
        if (!equals) {
            y00 y00Var = (y00) this.M;
            y00Var.getClass();
            if (!((mb.b) y00Var.a).l(vVar) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                return u0.l(str) ? p1.a(1, 0, 0, 0) : p1.a(0, 0, 0, 0);
            }
        }
        return p1.a(vVar.T == 0 ? 4 : 2, 0, 0, 0);
    }

    public final void F() {
        boolean z10 = Objects.equals(this.Z.s, "application/cea-608") || Objects.equals(this.Z.s, "application/x-mp4-cea-608") || Objects.equals(this.Z.s, "application/cea-708");
        String str = this.Z.s;
        if (!z10) {
            throw new IllegalStateException(ac.a("Legacy decoding is disabled, can't handle %s samples (expected %s).", str, "application/x-media3-cues"));
        }
    }

    public final long G() {
        if (this.T == -1) {
            return Long.MAX_VALUE;
        }
        this.R.getClass();
        if (this.T >= this.R.t()) {
            return Long.MAX_VALUE;
        }
        return this.R.h(this.T);
    }

    public final long H(long j10) {
        zb.p(j10 != -9223372036854775807L);
        return j10 - this.w;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r3.equals("application/cea-608") == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I() {
        b4.e bVar;
        char c2 = 1;
        this.N = true;
        v vVar = this.Z;
        vVar.getClass();
        mb.b bVar2 = (mb.b) ((y00) this.M).a;
        String str = vVar.s;
        int i3 = vVar.P;
        if (str != null) {
            switch (str.hashCode()) {
                case 930165504:
                    if (str.equals("application/x-mp4-cea-608")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1566015601:
                    break;
                case 1566016562:
                    if (str.equals("application/cea-708")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                case 1:
                    bVar = new c4.c(str, i3);
                    break;
                case 2:
                    bVar = new g(i3, vVar.v);
                    break;
            }
            this.P = bVar;
            bVar.a(this.x);
        }
        if (!bVar2.l(vVar)) {
            throw new IllegalArgumentException(t4.c.f("Attempted to create decoder for unsupported MIME type: ", str));
        }
        m h = bVar2.h(vVar);
        bVar = new b(h.getClass().getSimpleName().concat("Decoder"), h);
        this.P = bVar;
        bVar.a(this.x);
    }

    public final void J(f2.c cVar) {
        s1 s1Var = cVar.a;
        c0 c0Var = this.V;
        c0Var.a.m.e(27, new z(0, s1Var));
        i0 i0Var = c0Var.a;
        i0Var.e0 = cVar;
        i0Var.m.e(27, new y8(cVar, 20));
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
        J((f2.c) message.obj);
        return true;
    }

    @Override // k2.b
    public final String j() {
        return "TextRenderer";
    }

    @Override // k2.b
    public final boolean l() {
        return this.Y;
    }

    @Override // k2.b
    public final boolean m() {
        v vVar = this.Z;
        if (vVar != null) {
            if (Objects.equals(vVar.s, "application/x-media3-cues")) {
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
                    long j10 = this.a0;
                    if (jVar == null || jVar.t() <= 0 || jVar.h(jVar.t() - 1) <= j10) {
                        j jVar2 = this.S;
                        long j11 = this.a0;
                        if ((jVar2 == null || jVar2.t() <= 0 || jVar2.h(jVar2.t() - 1) <= j11) && this.Q != null) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // k2.b
    public final void n() {
        this.Z = null;
        this.b0 = -9223372036854775807L;
        f2.c cVar = new f2.c(H(this.a0), s1.e);
        Handler handler = this.U;
        if (handler != null) {
            handler.obtainMessage(1, cVar).sendToTarget();
        } else {
            J(cVar);
        }
        this.a0 = -9223372036854775807L;
        if (this.P != null) {
            K();
            b4.e eVar = this.P;
            eVar.getClass();
            eVar.release();
            this.P = null;
            this.O = 0;
        }
    }

    @Override // k2.b
    public final void p(long j10, boolean z10, boolean z11) {
        this.a0 = j10;
        a aVar = this.L;
        if (aVar != null) {
            aVar.clear();
        }
        f2.c cVar = new f2.c(H(this.a0), s1.e);
        Handler handler = this.U;
        if (handler != null) {
            handler.obtainMessage(1, cVar).sendToTarget();
        } else {
            J(cVar);
        }
        this.X = false;
        this.Y = false;
        this.b0 = -9223372036854775807L;
        v vVar = this.Z;
        if (vVar == null || Objects.equals(vVar.s, "application/x-media3-cues")) {
            return;
        }
        if (this.O == 0) {
            K();
            b4.e eVar = this.P;
            eVar.getClass();
            eVar.flush();
            eVar.a(this.x);
            return;
        }
        K();
        b4.e eVar2 = this.P;
        eVar2.getClass();
        eVar2.release();
        this.P = null;
        this.O = 0;
        I();
    }

    @Override // k2.b
    public final void u(v[] vVarArr, long j10, long j11, g0 g0Var) {
        v vVar = vVarArr[0];
        this.Z = vVar;
        if (Objects.equals(vVar.s, "application/x-media3-cues")) {
            this.L = this.Z.Q == 1 ? new c() : new e5.j(4);
            return;
        }
        F();
        if (this.P != null) {
            this.O = 1;
        } else {
            I();
        }
    }

    @Override // k2.b
    public final void x(long j10, long j11) {
        boolean z10;
        long j12;
        if (this.E) {
            long j13 = this.b0;
            if (j13 != -9223372036854775807L && j10 >= j13) {
                K();
                this.Y = true;
            }
        }
        if (this.Y) {
            return;
        }
        v vVar = this.Z;
        vVar.getClass();
        boolean equals = Objects.equals(vVar.s, "application/x-media3-cues");
        Handler handler = this.U;
        tf.b bVar = this.W;
        boolean z11 = false;
        if (equals) {
            this.L.getClass();
            if (!this.X) {
                h hVar = this.K;
                if (w(bVar, hVar, 0) == -4) {
                    if (hVar.isEndOfStream()) {
                        this.X = true;
                    } else {
                        hVar.c();
                        ByteBuffer byteBuffer = hVar.c;
                        byteBuffer.getClass();
                        long j14 = hVar.e;
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
                        b4.a aVar = new b4.a(j14, readBundle.getLong("d"), f.b(new a3.j(8), parcelableArrayList));
                        hVar.clear();
                        z11 = this.L.b(aVar, j10);
                    }
                }
            }
            long a10 = this.L.a(this.a0);
            if (a10 == Long.MIN_VALUE && this.X && !z11) {
                this.Y = true;
            }
            if (a10 != Long.MIN_VALUE && a10 <= j10) {
                z11 = true;
            }
            if (z11) {
                g9.i0 c2 = this.L.c(j10);
                long d = this.L.d(j10);
                f2.c cVar = new f2.c(H(d), c2);
                if (handler != null) {
                    handler.obtainMessage(1, cVar).sendToTarget();
                } else {
                    J(cVar);
                }
                this.L.e(d);
            }
            this.a0 = j10;
            return;
        }
        F();
        this.a0 = j10;
        if (this.S == null) {
            b4.e eVar = this.P;
            eVar.getClass();
            eVar.b(j10);
            try {
                b4.e eVar2 = this.P;
                eVar2.getClass();
                this.S = (j) eVar2.c();
            } catch (b4.f e10) {
                g2.a.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.Z, e10);
                f2.c cVar2 = new f2.c(H(this.a0), s1.e);
                if (handler != null) {
                    handler.obtainMessage(1, cVar2).sendToTarget();
                } else {
                    J(cVar2);
                }
                K();
                b4.e eVar3 = this.P;
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
            while (G <= j10) {
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
                        b4.e eVar4 = this.P;
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
            } else if (jVar.timeUs <= j10) {
                j jVar2 = this.R;
                if (jVar2 != null) {
                    jVar2.release();
                }
                this.T = jVar.d(j10);
                this.R = jVar;
                this.S = null;
                z10 = true;
            }
        }
        if (z10) {
            this.R.getClass();
            int d10 = this.R.d(j10);
            if (d10 == 0 || this.R.t() == 0) {
                j12 = this.R.timeUs;
            } else if (d10 == -1) {
                j jVar3 = this.R;
                j12 = jVar3.h(jVar3.t() - 1);
            } else {
                j12 = this.R.h(d10 - 1);
            }
            f2.c cVar3 = new f2.c(H(j12), this.R.p(j10));
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
                    b4.e eVar5 = this.P;
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
                    b4.e eVar6 = this.P;
                    eVar6.getClass();
                    eVar6.e(iVar);
                    this.Q = null;
                    this.O = 2;
                    return;
                }
                int w10 = w(bVar, iVar, 0);
                if (w10 == -4) {
                    if (iVar.isEndOfStream()) {
                        this.X = true;
                        this.N = false;
                    } else {
                        v vVar2 = (v) bVar.b;
                        if (vVar2 == null) {
                            return;
                        }
                        iVar.r = vVar2.x;
                        iVar.c();
                        this.N &= !iVar.isKeyFrame();
                    }
                    if (!this.N) {
                        b4.e eVar7 = this.P;
                        eVar7.getClass();
                        eVar7.e(iVar);
                        this.Q = null;
                    }
                } else if (w10 == -3) {
                    return;
                }
            } catch (b4.f e11) {
                g2.a.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.Z, e11);
                f2.c cVar4 = new f2.c(H(this.a0), s1.e);
                if (handler != null) {
                    handler.obtainMessage(1, cVar4).sendToTarget();
                } else {
                    J(cVar4);
                }
                K();
                b4.e eVar8 = this.P;
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
