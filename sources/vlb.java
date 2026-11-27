// default package

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import j$.util.Objects;
import java.io.IOException;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class vlb extends vg0 implements Handler.Callback {
    public final z3f K;
    public final s93 L;
    public o43 M;
    public final ve9 N;
    public boolean O;
    public byte P;
    public ieb Q;
    public neb R;
    public oeb S;
    public oeb T;
    public int U;
    public final Handler V;
    public final n64 W;
    public final ym4 X;
    public boolean Y;
    public boolean Z;
    public ko4 a0;
    public long b0;
    public long c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vlb(n64 n64Var, Looper looper) {
        super(3);
        Handler handler;
        ve9 ve9Var = keb.A;
        this.W = n64Var;
        if (looper == null) {
            handler = null;
        } else {
            String str = gcc.a;
            handler = new Handler(looper, this);
        }
        this.V = handler;
        this.N = ve9Var;
        this.K = new z3f((byte) 16);
        this.L = new s93(1, 0);
        this.X = new ym4((byte) 1, false);
        this.c0 = -9223372036854775807L;
        this.b0 = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:159:0x0282, code lost:
    
        if (r7 == (-3)) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        if (r23 < (r0.e - 1000000)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
    
        if (A(r11, r0, 0) != (-4)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0081, code lost:
    
        if (r0.isEndOfStream() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0083, code lost:
    
        r22.Y = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0086, code lost:
    
        r0.d();
        r5 = r0.c;
        r5.getClass();
        r11 = r0.e;
        r6 = r5.array();
        r8 = r5.arrayOffset();
        r5 = r5.limit();
        r22.K.getClass();
        r10 = android.os.Parcel.obtain();
        r10.unmarshall(r6, r8, r5);
        r10.setDataPosition(0);
        r5 = r10.readBundle(android.os.Bundle.class.getClassLoader());
        r10.recycle();
        r6 = r5.getParcelableArrayList("c");
        r6.getClass();
        r10 = new p43(r11, r5.getLong("d"), e31.b(new p31((byte) 1), r6));
        r0.clear();
        r9 = r22.M.b(r10, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
    
        if (r13 >= (r5 - 1000000)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0063, code lost:
    
        if (r8 == (-3)) goto L26;
     */
    @Override // vg0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(long j, long j2) {
        boolean z;
        boolean z2;
        long j3;
        s93 s93Var;
        int A;
        if (this.E) {
            long j4 = this.c0;
            if (j4 != -9223372036854775807L && j >= j4) {
                Q();
                this.Z = true;
            }
        }
        if (this.Z) {
            return;
        }
        ko4 ko4Var = this.a0;
        ko4Var.getClass();
        boolean equals = Objects.equals(ko4Var.t, "application/x-media3-cues");
        Handler handler = this.V;
        int i = 5;
        boolean z3 = false;
        ym4 ym4Var = this.X;
        if (equals) {
            this.M.getClass();
            if (!this.Y && ((A = A(ym4Var, (s93Var = this.L), 5)) != -3 || s93Var.isEndOfStream())) {
                if (A == -4) {
                    if (!s93Var.isEndOfStream()) {
                    }
                    long j5 = this.I;
                    long j6 = j - this.w;
                    if (j5 != -9223372036854775807L) {
                    }
                }
            }
            long a = this.M.a(this.b0);
            if (a == Long.MIN_VALUE && this.Y && !z3) {
                this.Z = true;
            }
            if (a != Long.MIN_VALUE && a <= j) {
                z3 = true;
            }
            if (z3) {
                po5 c = this.M.c(j);
                long d = this.M.d(j);
                n43 n43Var = new n43(N(d), c);
                if (handler != null) {
                    handler.obtainMessage(1, n43Var).sendToTarget();
                } else {
                    P(n43Var);
                }
                this.M.e(d);
            }
            this.b0 = j;
            return;
        }
        K();
        this.b0 = j;
        if (this.T == null) {
            ieb iebVar = this.Q;
            iebVar.getClass();
            iebVar.b(j);
            try {
                ieb iebVar2 = this.Q;
                iebVar2.getClass();
                this.T = (oeb) iebVar2.c();
            } catch (jeb e) {
                efd.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.a0, e);
                L();
                Q();
                ieb iebVar3 = this.Q;
                iebVar3.getClass();
                iebVar3.release();
                this.Q = null;
                this.P = (byte) 0;
                O();
                return;
            }
        }
        if (this.n == 2) {
            if (this.S != null) {
                long M = M();
                z = false;
                while (M <= j) {
                    this.U++;
                    M = M();
                    z = true;
                }
            } else {
                z = false;
            }
            oeb oebVar = this.T;
            if (oebVar != null) {
                if (oebVar.isEndOfStream()) {
                    if (!z && M() == Long.MAX_VALUE) {
                        if (this.P == 2) {
                            Q();
                            ieb iebVar4 = this.Q;
                            iebVar4.getClass();
                            iebVar4.release();
                            this.Q = null;
                            this.P = (byte) 0;
                            O();
                        } else {
                            Q();
                            this.Z = true;
                        }
                    }
                } else if (oebVar.timeUs <= j) {
                    oeb oebVar2 = this.S;
                    if (oebVar2 != null) {
                        oebVar2.release();
                    }
                    this.U = oebVar.b(j);
                    this.S = oebVar;
                    this.T = null;
                    z = true;
                }
            }
            if (z) {
                this.S.getClass();
                int b = this.S.b(j);
                if (b == 0 || this.S.q() == 0) {
                    j3 = this.S.timeUs;
                } else {
                    oeb oebVar3 = this.S;
                    j3 = b == -1 ? oebVar3.i(oebVar3.q() - 1) : oebVar3.i(b - 1);
                }
                n43 n43Var2 = new n43(N(j3), this.S.l(j));
                if (handler != null) {
                    handler.obtainMessage(1, n43Var2).sendToTarget();
                } else {
                    P(n43Var2);
                }
            }
            if (this.P != 2) {
                while (!this.Y) {
                    try {
                        neb nebVar = this.R;
                        if (nebVar == null) {
                            ieb iebVar5 = this.Q;
                            iebVar5.getClass();
                            nebVar = (neb) iebVar5.d();
                            if (nebVar == null) {
                                return;
                            } else {
                                this.R = nebVar;
                            }
                        }
                        if (this.P == 1) {
                            nebVar.setFlags(4);
                            ieb iebVar6 = this.Q;
                            iebVar6.getClass();
                            iebVar6.e(nebVar);
                            this.R = null;
                            this.P = (byte) 2;
                            return;
                        }
                        int A2 = A(ym4Var, nebVar, i);
                        if (A2 == -3 && !nebVar.isEndOfStream()) {
                            return;
                        }
                        if (A2 == -4) {
                            if (!nebVar.isEndOfStream()) {
                                if (j < nebVar.e - 1000000) {
                                    return;
                                }
                            }
                            long j7 = this.I;
                            long j8 = j - this.w;
                            if (j7 == -9223372036854775807L || j8 < j7 - 1000000) {
                                return;
                            }
                        }
                        int A3 = A(ym4Var, nebVar, 0);
                        if (A3 == -4) {
                            if (nebVar.isEndOfStream()) {
                                this.Y = true;
                                this.O = false;
                                z2 = false;
                            } else {
                                ko4 ko4Var2 = (ko4) ym4Var.c;
                                if (ko4Var2 == null) {
                                    return;
                                }
                                nebVar.r = ko4Var2.y;
                                nebVar.d();
                                z2 = this.O & (!nebVar.isKeyFrame());
                                this.O = z2;
                            }
                            if (!z2) {
                                ieb iebVar7 = this.Q;
                                iebVar7.getClass();
                                iebVar7.e(nebVar);
                                this.R = null;
                            }
                        } else if (A3 == -3) {
                            return;
                        }
                        i = 5;
                    } catch (jeb e2) {
                        efd.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.a0, e2);
                        L();
                        Q();
                        ieb iebVar8 = this.Q;
                        iebVar8.getClass();
                        iebVar8.release();
                        this.Q = null;
                        this.P = (byte) 0;
                        O();
                        return;
                    }
                }
            }
        }
    }

    @Override // vg0
    public final int G(ko4 ko4Var) {
        boolean equals = Objects.equals(ko4Var.t, "application/x-media3-cues");
        String str = ko4Var.t;
        if (!equals) {
            ve9 ve9Var = this.N;
            ve9Var.getClass();
            if (!((uif) ve9Var.b).j(ko4Var) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                return eg7.l(str) ? qu6.a(1, 0, 0, 0) : qu6.a(0, 0, 0, 0);
            }
        }
        return qu6.a(ko4Var.X == 0 ? 4 : 2, 0, 0, 0);
    }

    public final void K() {
        boolean z = Objects.equals(this.a0.t, "application/cea-608") || Objects.equals(this.a0.t, "application/x-mp4-cea-608") || Objects.equals(this.a0.t, "application/cea-708");
        String str = this.a0.t;
        if (z) {
            return;
        }
        grb.i(fze.a("Legacy decoding is disabled, can't handle %s samples (expected %s).", str, "application/x-media3-cues"));
    }

    public final void L() {
        no5 no5Var = po5.b;
        n43 n43Var = new n43(N(this.b0), j99.e);
        Handler handler = this.V;
        if (handler != null) {
            handler.obtainMessage(1, n43Var).sendToTarget();
        } else {
            P(n43Var);
        }
    }

    public final long M() {
        if (this.U == -1) {
            return Long.MAX_VALUE;
        }
        this.S.getClass();
        if (this.U >= this.S.q()) {
            return Long.MAX_VALUE;
        }
        return this.S.i(this.U);
    }

    public final long N(long j) {
        yve.p(j != -9223372036854775807L);
        return j - this.w;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (r3.equals("application/cea-608") == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O() {
        ieb ee3Var;
        char c = 1;
        this.O = true;
        ko4 ko4Var = this.a0;
        ko4Var.getClass();
        uif uifVar = (uif) this.N.b;
        String str = ko4Var.t;
        int i = ko4Var.T;
        if (str != null) {
            switch (str.hashCode()) {
                case 930165504:
                    if (str.equals("application/x-mp4-cea-608")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1566015601:
                    break;
                case 1566016562:
                    if (str.equals("application/cea-708")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                    ee3Var = new wd1(str, i);
                    break;
                case 2:
                    ee3Var = new ae1(i, ko4Var.w);
                    break;
            }
            this.Q = ee3Var;
            ee3Var.a(this.x);
        }
        if (!uifVar.j(ko4Var)) {
            lq5.j(c00.i("Attempted to create decoder for unsupported MIME type: ", str));
            return;
        }
        reb s = uifVar.s(ko4Var);
        ee3Var = new ee3(s.getClass().getSimpleName().concat("Decoder"), s);
        this.Q = ee3Var;
        ee3Var.a(this.x);
    }

    public final void P(n43 n43Var) {
        j99 j99Var = n43Var.a;
        n64 n64Var = this.W;
        n64Var.a.m.e(27, new lu3(j99Var, (byte) 13));
        s64 s64Var = n64Var.a;
        s64Var.e0 = n43Var;
        s64Var.m.e(27, new lu3(n43Var, (byte) 10));
    }

    public final void Q() {
        this.R = null;
        this.U = -1;
        oeb oebVar = this.S;
        if (oebVar != null) {
            oebVar.release();
            this.S = null;
        }
        oeb oebVar2 = this.T;
        if (oebVar2 != null) {
            oebVar2.release();
            this.T = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            P((n43) message.obj);
            return true;
        }
        grb.g();
        return false;
    }

    @Override // vg0
    public final String l() {
        return "TextRenderer";
    }

    @Override // vg0
    public final boolean n() {
        return this.Z;
    }

    @Override // vg0
    public final boolean o() {
        ko4 ko4Var = this.a0;
        if (ko4Var != null) {
            if (Objects.equals(ko4Var.t, "application/x-media3-cues")) {
                o43 o43Var = this.M;
                o43Var.getClass();
                if (o43Var.a(this.b0) == Long.MIN_VALUE) {
                    try {
                        at9 at9Var = this.r;
                        at9Var.getClass();
                        at9Var.g();
                        return true;
                    } catch (IOException unused) {
                        return false;
                    }
                }
            } else {
                if (this.Z) {
                    return false;
                }
                if (this.Y) {
                    oeb oebVar = this.S;
                    long j = this.b0;
                    if (oebVar == null || oebVar.q() <= 0 || oebVar.i(oebVar.q() - 1) <= j) {
                        oeb oebVar2 = this.T;
                        long j2 = this.b0;
                        if ((oebVar2 == null || oebVar2.q() <= 0 || oebVar2.i(oebVar2.q() - 1) <= j2) && this.R != null) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // vg0
    public final void q() {
        this.a0 = null;
        this.c0 = -9223372036854775807L;
        L();
        this.b0 = -9223372036854775807L;
        if (this.Q != null) {
            Q();
            ieb iebVar = this.Q;
            iebVar.getClass();
            iebVar.release();
            this.Q = null;
            this.P = (byte) 0;
        }
    }

    @Override // vg0
    public final void s(long j, boolean z, boolean z2) {
        this.b0 = j;
        o43 o43Var = this.M;
        if (o43Var != null) {
            o43Var.clear();
        }
        L();
        this.Y = false;
        this.Z = false;
        this.c0 = -9223372036854775807L;
        ko4 ko4Var = this.a0;
        if (ko4Var == null || Objects.equals(ko4Var.t, "application/x-media3-cues")) {
            return;
        }
        if (this.P == 0) {
            Q();
            ieb iebVar = this.Q;
            iebVar.getClass();
            iebVar.flush();
            iebVar.a(this.x);
            return;
        }
        Q();
        ieb iebVar2 = this.Q;
        iebVar2.getClass();
        iebVar2.release();
        this.Q = null;
        this.P = (byte) 0;
        O();
    }

    @Override // vg0
    public final void y(ko4[] ko4VarArr, long j, long j2, vz6 vz6Var) {
        ko4 ko4Var = ko4VarArr[0];
        this.a0 = ko4Var;
        if (Objects.equals(ko4Var.t, "application/x-media3-cues")) {
            this.M = this.a0.U == 1 ? new e37() : new qh2((byte) 2);
            return;
        }
        K();
        if (this.Q != null) {
            this.P = (byte) 1;
        } else {
            O();
        }
    }
}
