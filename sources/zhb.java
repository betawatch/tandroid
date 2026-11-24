// default package

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import j$.util.Objects;
import java.io.IOException;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class zhb extends ug0 implements Handler.Callback {
    public final ize K;
    public final z83 L;
    public w33 M;
    public final u39 N;
    public boolean O;
    public byte P;
    public lab Q;
    public qab R;
    public rab S;
    public rab T;
    public int U;
    public final Handler V;
    public final t54 W;
    public final sk4 X;
    public boolean Y;
    public boolean Z;
    public fm4 a0;
    public long b0;
    public long c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zhb(t54 t54Var, Looper looper) {
        super(3);
        Handler handler;
        u39 u39Var = nab.A;
        this.W = t54Var;
        if (looper == null) {
            handler = null;
        } else {
            String str = g8c.a;
            handler = new Handler(looper, this);
        }
        this.V = handler;
        this.N = u39Var;
        this.K = new ize((byte) 16);
        this.L = new z83(1, 0);
        this.X = new sk4((byte) 1, false);
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
        r10 = new x33(r11, r5.getLong("d"), v21.b(new g31((byte) 1), r6));
        r0.clear();
        r9 = r22.M.b(r10, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
    
        if (r13 >= (r5 - 1000000)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0063, code lost:
    
        if (r8 == (-3)) goto L26;
     */
    @Override // ug0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(long j, long j2) {
        boolean z;
        boolean z2;
        long j3;
        z83 z83Var;
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
        fm4 fm4Var = this.a0;
        fm4Var.getClass();
        boolean equals = Objects.equals(fm4Var.t, "application/x-media3-cues");
        Handler handler = this.V;
        int i = 5;
        boolean z3 = false;
        sk4 sk4Var = this.X;
        if (equals) {
            this.M.getClass();
            if (!this.Y && ((A = A(sk4Var, (z83Var = this.L), 5)) != -3 || z83Var.isEndOfStream())) {
                if (A == -4) {
                    if (!z83Var.isEndOfStream()) {
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
                mm5 c = this.M.c(j);
                long d = this.M.d(j);
                v33 v33Var = new v33(N(d), c);
                if (handler != null) {
                    handler.obtainMessage(1, v33Var).sendToTarget();
                } else {
                    P(v33Var);
                }
                this.M.e(d);
            }
            this.b0 = j;
            return;
        }
        K();
        this.b0 = j;
        if (this.T == null) {
            lab labVar = this.Q;
            labVar.getClass();
            labVar.b(j);
            try {
                lab labVar2 = this.Q;
                labVar2.getClass();
                this.T = (rab) labVar2.c();
            } catch (mab e) {
                lad.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.a0, e);
                L();
                Q();
                lab labVar3 = this.Q;
                labVar3.getClass();
                labVar3.release();
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
            rab rabVar = this.T;
            if (rabVar != null) {
                if (rabVar.isEndOfStream()) {
                    if (!z && M() == Long.MAX_VALUE) {
                        if (this.P == 2) {
                            Q();
                            lab labVar4 = this.Q;
                            labVar4.getClass();
                            labVar4.release();
                            this.Q = null;
                            this.P = (byte) 0;
                            O();
                        } else {
                            Q();
                            this.Z = true;
                        }
                    }
                } else if (rabVar.timeUs <= j) {
                    rab rabVar2 = this.S;
                    if (rabVar2 != null) {
                        rabVar2.release();
                    }
                    this.U = rabVar.b(j);
                    this.S = rabVar;
                    this.T = null;
                    z = true;
                }
            }
            if (z) {
                this.S.getClass();
                int b = this.S.b(j);
                if (b == 0 || this.S.t() == 0) {
                    j3 = this.S.timeUs;
                } else {
                    rab rabVar3 = this.S;
                    j3 = b == -1 ? rabVar3.h(rabVar3.t() - 1) : rabVar3.h(b - 1);
                }
                v33 v33Var2 = new v33(N(j3), this.S.l(j));
                if (handler != null) {
                    handler.obtainMessage(1, v33Var2).sendToTarget();
                } else {
                    P(v33Var2);
                }
            }
            if (this.P != 2) {
                while (!this.Y) {
                    try {
                        qab qabVar = this.R;
                        if (qabVar == null) {
                            lab labVar5 = this.Q;
                            labVar5.getClass();
                            qabVar = (qab) labVar5.d();
                            if (qabVar == null) {
                                return;
                            } else {
                                this.R = qabVar;
                            }
                        }
                        if (this.P == 1) {
                            qabVar.setFlags(4);
                            lab labVar6 = this.Q;
                            labVar6.getClass();
                            labVar6.e(qabVar);
                            this.R = null;
                            this.P = (byte) 2;
                            return;
                        }
                        int A2 = A(sk4Var, qabVar, i);
                        if (A2 == -3 && !qabVar.isEndOfStream()) {
                            return;
                        }
                        if (A2 == -4) {
                            if (!qabVar.isEndOfStream()) {
                                if (j < qabVar.e - 1000000) {
                                    return;
                                }
                            }
                            long j7 = this.I;
                            long j8 = j - this.w;
                            if (j7 == -9223372036854775807L || j8 < j7 - 1000000) {
                                return;
                            }
                        }
                        int A3 = A(sk4Var, qabVar, 0);
                        if (A3 == -4) {
                            if (qabVar.isEndOfStream()) {
                                this.Y = true;
                                this.O = false;
                                z2 = false;
                            } else {
                                fm4 fm4Var2 = (fm4) sk4Var.c;
                                if (fm4Var2 == null) {
                                    return;
                                }
                                qabVar.r = fm4Var2.y;
                                qabVar.d();
                                z2 = this.O & (!qabVar.isKeyFrame());
                                this.O = z2;
                            }
                            if (!z2) {
                                lab labVar7 = this.Q;
                                labVar7.getClass();
                                labVar7.e(qabVar);
                                this.R = null;
                            }
                        } else if (A3 == -3) {
                            return;
                        }
                        i = 5;
                    } catch (mab e2) {
                        lad.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.a0, e2);
                        L();
                        Q();
                        lab labVar8 = this.Q;
                        labVar8.getClass();
                        labVar8.release();
                        this.Q = null;
                        this.P = (byte) 0;
                        O();
                        return;
                    }
                }
            }
        }
    }

    @Override // ug0
    public final int G(fm4 fm4Var) {
        boolean equals = Objects.equals(fm4Var.t, "application/x-media3-cues");
        String str = fm4Var.t;
        if (!equals) {
            u39 u39Var = this.N;
            u39Var.getClass();
            if (!((eef) u39Var.b).h(fm4Var) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                return ud7.l(str) ? ls6.a(1, 0, 0, 0) : ls6.a(0, 0, 0, 0);
            }
        }
        return ls6.a(fm4Var.X == 0 ? 4 : 2, 0, 0, 0);
    }

    public final void K() {
        boolean z = Objects.equals(this.a0.t, "application/cea-608") || Objects.equals(this.a0.t, "application/x-mp4-cea-608") || Objects.equals(this.a0.t, "application/cea-708");
        String str = this.a0.t;
        if (z) {
            return;
        }
        sc8.j(nue.a("Legacy decoding is disabled, can't handle %s samples (expected %s).", str, "application/x-media3-cues"));
    }

    public final void L() {
        km5 km5Var = mm5.b;
        v33 v33Var = new v33(N(this.b0), w59.e);
        Handler handler = this.V;
        if (handler != null) {
            handler.obtainMessage(1, v33Var).sendToTarget();
        } else {
            P(v33Var);
        }
    }

    public final long M() {
        if (this.U == -1) {
            return Long.MAX_VALUE;
        }
        this.S.getClass();
        if (this.U >= this.S.t()) {
            return Long.MAX_VALUE;
        }
        return this.S.h(this.U);
    }

    public final long N(long j) {
        gre.p(j != -9223372036854775807L);
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
        lab ld3Var;
        char c = 1;
        this.O = true;
        fm4 fm4Var = this.a0;
        fm4Var.getClass();
        eef eefVar = (eef) this.N.b;
        String str = fm4Var.t;
        int i = fm4Var.T;
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
                    ld3Var = new nd1(str, i);
                    break;
                case 2:
                    ld3Var = new rd1(i, fm4Var.w);
                    break;
            }
            this.Q = ld3Var;
            ld3Var.a(this.x);
        }
        if (!eefVar.h(fm4Var)) {
            w26.j(b00.h("Attempted to create decoder for unsupported MIME type: ", str));
            return;
        }
        uab r = eefVar.r(fm4Var);
        ld3Var = new ld3(r.getClass().getSimpleName().concat("Decoder"), r);
        this.Q = ld3Var;
        ld3Var.a(this.x);
    }

    public final void P(v33 v33Var) {
        w59 w59Var = v33Var.a;
        t54 t54Var = this.W;
        t54Var.a.m.e(27, new kx3(w59Var, (byte) 11));
        y54 y54Var = t54Var.a;
        y54Var.e0 = v33Var;
        y54Var.m.e(27, new kx3(v33Var, (byte) 8));
    }

    public final void Q() {
        this.R = null;
        this.U = -1;
        rab rabVar = this.S;
        if (rabVar != null) {
            rabVar.release();
            this.S = null;
        }
        rab rabVar2 = this.T;
        if (rabVar2 != null) {
            rabVar2.release();
            this.T = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            P((v33) message.obj);
            return true;
        }
        sdb.a();
        return false;
    }

    @Override // ug0
    public final String l() {
        return "TextRenderer";
    }

    @Override // ug0
    public final boolean n() {
        return this.Z;
    }

    @Override // ug0
    public final boolean o() {
        fm4 fm4Var = this.a0;
        if (fm4Var != null) {
            if (Objects.equals(fm4Var.t, "application/x-media3-cues")) {
                w33 w33Var = this.M;
                w33Var.getClass();
                if (w33Var.a(this.b0) == Long.MIN_VALUE) {
                    try {
                        ip9 ip9Var = this.r;
                        ip9Var.getClass();
                        ip9Var.b();
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
                    rab rabVar = this.S;
                    long j = this.b0;
                    if (rabVar == null || rabVar.t() <= 0 || rabVar.h(rabVar.t() - 1) <= j) {
                        rab rabVar2 = this.T;
                        long j2 = this.b0;
                        if ((rabVar2 == null || rabVar2.t() <= 0 || rabVar2.h(rabVar2.t() - 1) <= j2) && this.R != null) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // ug0
    public final void q() {
        this.a0 = null;
        this.c0 = -9223372036854775807L;
        L();
        this.b0 = -9223372036854775807L;
        if (this.Q != null) {
            Q();
            lab labVar = this.Q;
            labVar.getClass();
            labVar.release();
            this.Q = null;
            this.P = (byte) 0;
        }
    }

    @Override // ug0
    public final void s(long j, boolean z, boolean z2) {
        this.b0 = j;
        w33 w33Var = this.M;
        if (w33Var != null) {
            w33Var.clear();
        }
        L();
        this.Y = false;
        this.Z = false;
        this.c0 = -9223372036854775807L;
        fm4 fm4Var = this.a0;
        if (fm4Var == null || Objects.equals(fm4Var.t, "application/x-media3-cues")) {
            return;
        }
        if (this.P == 0) {
            Q();
            lab labVar = this.Q;
            labVar.getClass();
            labVar.flush();
            labVar.a(this.x);
            return;
        }
        Q();
        lab labVar2 = this.Q;
        labVar2.getClass();
        labVar2.release();
        this.Q = null;
        this.P = (byte) 0;
        O();
    }

    @Override // ug0
    public final void y(fm4[] fm4VarArr, long j, long j2, rx6 rx6Var) {
        fm4 fm4Var = fm4VarArr[0];
        this.a0 = fm4Var;
        if (Objects.equals(fm4Var.t, "application/x-media3-cues")) {
            this.M = this.a0.U == 1 ? new x07() : new yg2((byte) 3);
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
