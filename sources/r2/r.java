package r2;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import e0.h0;
import e2.a0;
import e2.d0;
import i2.m1;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import k2.g0;
import k2.i0;
import n4.y;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Cells.p6;
import u2.b1;
import u2.f0;
import v7.z7;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public abstract class r extends i2.f {
    public static final byte[] W0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public boolean A0;
    public int B0;
    public int C0;
    public int D0;
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public long H0;
    public final k I;
    public long I0;
    public final i J;
    public boolean J0;
    public final float K;
    public boolean K0;
    public final h2.g L;
    public boolean L0;
    public final h2.g M;
    public boolean M0;
    public final h2.g N;
    public i2.o N0;
    public final g O;
    public i2.h O0;
    public final MediaCodec.BufferInfo P;
    public q P0;
    public final ArrayDeque Q;
    public long Q0;
    public final i0 R;
    public boolean R0;
    public b2.s S;
    public boolean S0;
    public b2.s T;
    public boolean T0;
    public n2.g U;
    public long U0;
    public n2.g V;
    public long V0;
    public i2.i0 W;
    public MediaCrypto X;
    public final long Y;
    public float Z;
    public float a0;
    public l b0;
    public b2.s c0;
    public MediaFormat d0;
    public boolean e0;
    public float f0;
    public ArrayDeque g0;
    public p h0;
    public o i0;
    public int j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public long q0;
    public long r0;
    public int s0;
    public int t0;
    public ByteBuffer u0;
    public boolean v0;
    public boolean w0;
    public boolean x0;
    public boolean y0;
    public boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(int i10, k kVar, float f7) {
        super(i10);
        i iVar = i.b;
        this.I = kVar;
        this.J = iVar;
        this.K = f7;
        this.L = new h2.g(0, 0);
        this.M = new h2.g(0, 0);
        this.N = new h2.g(2, 0);
        g gVar = new g(2, 0);
        gVar.x = 32;
        this.O = gVar;
        this.P = new MediaCodec.BufferInfo();
        this.Z = 1.0f;
        this.a0 = 1.0f;
        this.Y = -9223372036854775807L;
        this.Q = new ArrayDeque();
        this.P0 = q.e;
        gVar.l(0);
        gVar.e.order(ByteOrder.nativeOrder());
        i0 i0Var = new i0();
        i0Var.a = c2.h.a;
        i0Var.c = 0;
        i0Var.b = 2;
        this.R = i0Var;
        this.f0 = -1.0f;
        this.j0 = 0;
        this.B0 = 0;
        this.s0 = -1;
        this.t0 = -1;
        this.r0 = -9223372036854775807L;
        this.H0 = -9223372036854775807L;
        this.I0 = -9223372036854775807L;
        this.Q0 = -9223372036854775807L;
        this.q0 = -9223372036854775807L;
        this.C0 = 0;
        this.D0 = 0;
        this.O0 = new i2.h();
        this.U0 = -9223372036854775807L;
        this.V0 = -9223372036854775807L;
    }

    @Override // i2.f
    public final int A() {
        return 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    public final boolean B(long j3, long j10) {
        g gVar;
        int i10;
        int i11;
        int i12;
        e2.d.g(!this.K0);
        g gVar2 = this.O;
        if (gVar2.o()) {
            ByteBuffer byteBuffer = gVar2.e;
            int i13 = this.t0;
            int i14 = gVar2.w;
            long j11 = gVar2.h;
            boolean S = S(this.w, gVar2.v);
            boolean c10 = gVar2.c(4);
            b2.s sVar = this.T;
            sVar.getClass();
            gVar = gVar2;
            if (!g0(j3, j10, null, byteBuffer, i13, 0, i14, j11, S, c10, sVar)) {
                return false;
            }
            c0(gVar.v);
            gVar.i();
        } else {
            gVar = gVar2;
        }
        if (this.J0) {
            this.K0 = true;
            return false;
        }
        ?? r22 = 0;
        boolean z10 = this.y0;
        h2.g gVar3 = this.N;
        if (z10) {
            e2.d.g(gVar.n(gVar3));
            this.y0 = false;
        }
        if (this.z0) {
            if (gVar.o()) {
                return true;
            }
            this.x0 = false;
            k0();
            this.z0 = false;
            T();
            if (!this.x0) {
                return false;
            }
        }
        e2.d.g(!this.J0);
        y yVar = this.c;
        yVar.A();
        gVar3.i();
        while (true) {
            gVar3.i();
            int v = v(yVar, gVar3, r22);
            if (v == -5) {
                Z(yVar);
                break;
            }
            if (v != -4) {
                if (v != -3) {
                    throw new IllegalStateException();
                }
                if (k()) {
                    this.I0 = this.H0;
                }
            } else {
                if (gVar3.c(4)) {
                    this.J0 = true;
                    this.I0 = this.H0;
                    break;
                }
                this.H0 = Math.max(this.H0, gVar3.h);
                if (k() || this.M.c(TLObject.FLAG_29)) {
                    this.I0 = this.H0;
                }
                byte[] bArr = null;
                if (this.L0) {
                    b2.s sVar2 = this.S;
                    sVar2.getClass();
                    this.T = sVar2;
                    if (Objects.equals(sVar2.r, "audio/opus") && !this.T.u.isEmpty()) {
                        byte[] bArr2 = (byte[]) this.T.u.get(r22);
                        int i15 = (bArr2[10] & 255) | ((bArr2[11] & 255) << 8);
                        b2.r a2 = this.T.a();
                        a2.L = i15;
                        this.T = new b2.s(a2);
                    }
                    a0(this.T, null);
                    this.L0 = r22;
                }
                gVar3.m();
                b2.s sVar3 = this.T;
                if (sVar3 != null && Objects.equals(sVar3.r, "audio/opus")) {
                    if (gVar3.c(TLObject.FLAG_28)) {
                        gVar3.c = this.T;
                        Q(gVar3);
                    }
                    if (this.w - gVar3.h <= 80000) {
                        List list = this.T.u;
                        i0 i0Var = this.R;
                        i0Var.getClass();
                        gVar3.e.getClass();
                        if (gVar3.e.limit() - gVar3.e.position() != 0) {
                            if (i0Var.b == 2 && (list.size() == 1 || list.size() == 3)) {
                                bArr = (byte[]) list.get(r22);
                            }
                            ByteBuffer byteBuffer2 = gVar3.e;
                            int position = byteBuffer2.position();
                            int limit = byteBuffer2.limit();
                            int i16 = limit - position;
                            int i17 = (i16 + 255) / 255;
                            int i18 = i17 + 27 + i16;
                            if (i0Var.b == 2) {
                                i10 = bArr != null ? bArr.length + 28 : 47;
                                i18 = i10 + 44 + i18;
                            } else {
                                i10 = 0;
                            }
                            if (i0Var.a.capacity() < i18) {
                                i0Var.a = ByteBuffer.allocate(i18).order(ByteOrder.LITTLE_ENDIAN);
                            } else {
                                i0Var.a.clear();
                            }
                            ByteBuffer byteBuffer3 = i0Var.a;
                            if (i0Var.b == 2) {
                                if (bArr != null) {
                                    i0.a(byteBuffer3, 0L, 0, 1, true);
                                    i12 = limit;
                                    byteBuffer3.put(z7.a(bArr.length));
                                    byteBuffer3.put(bArr);
                                    i11 = i10;
                                    byteBuffer3.putInt(22, d0.n(byteBuffer3.arrayOffset(), bArr.length + 28, 0, byteBuffer3.array()));
                                    byteBuffer3.position(bArr.length + 28);
                                } else {
                                    i11 = i10;
                                    i12 = limit;
                                    byteBuffer3.put(i0.d);
                                }
                                byteBuffer3.put(i0.e);
                            } else {
                                i11 = i10;
                                i12 = limit;
                            }
                            int k10 = i0Var.c + ((int) ((c3.b.k(byteBuffer2.get(0), byteBuffer2.limit() > 1 ? byteBuffer2.get(1) : (byte) 0) * 48000) / 1000000));
                            i0Var.c = k10;
                            i0.a(byteBuffer3, k10, i0Var.b, i17, false);
                            for (int i19 = 0; i19 < i17; i19++) {
                                if (i16 >= 255) {
                                    byteBuffer3.put((byte) -1);
                                    i16 -= 255;
                                } else {
                                    byteBuffer3.put((byte) i16);
                                    i16 = 0;
                                }
                            }
                            int i20 = i12;
                            while (position < i20) {
                                byteBuffer3.put(byteBuffer2.get(position));
                                position++;
                            }
                            byteBuffer2.position(byteBuffer2.limit());
                            byteBuffer3.flip();
                            if (i0Var.b == 2) {
                                byteBuffer3.putInt(i11 + 66, d0.n(byteBuffer3.arrayOffset() + i11 + 44, byteBuffer3.limit() - byteBuffer3.position(), 0, byteBuffer3.array()));
                            } else {
                                byteBuffer3.putInt(22, d0.n(byteBuffer3.arrayOffset(), byteBuffer3.limit() - byteBuffer3.position(), 0, byteBuffer3.array()));
                            }
                            i0Var.b++;
                            i0Var.a = byteBuffer3;
                            gVar3.i();
                            gVar3.l(i0Var.a.remaining());
                            gVar3.e.put(i0Var.a);
                            gVar3.m();
                        }
                    }
                }
                if (gVar.o()) {
                    long j12 = this.w;
                    if (S(j12, gVar.v) != S(j12, gVar3.h)) {
                        break;
                    }
                }
                if (!gVar.n(gVar3)) {
                    break;
                }
                r22 = 0;
            }
        }
        this.y0 = true;
        if (gVar.o()) {
            gVar.m();
        }
        return gVar.o() || this.J0 || this.z0;
    }

    public abstract i2.i C(o oVar, b2.s sVar, b2.s sVar2);

    public n D(IllegalStateException illegalStateException, o oVar) {
        return new n(illegalStateException, oVar);
    }

    public final boolean E() {
        if (!this.E0) {
            w0();
            return true;
        }
        this.C0 = 1;
        if (this.l0) {
            this.D0 = 3;
            return false;
        }
        this.D0 = 2;
        return true;
    }

    public final boolean F(long j3, long j10) {
        MediaCodec.BufferInfo bufferInfo;
        boolean z10;
        boolean z11;
        boolean g02;
        int h;
        l lVar = this.b0;
        lVar.getClass();
        int i10 = this.t0;
        MediaCodec.BufferInfo bufferInfo2 = this.P;
        if (i10 < 0) {
            if (this.m0 && this.F0) {
                try {
                    h = lVar.h(bufferInfo2);
                } catch (IllegalStateException unused) {
                    f0();
                    if (this.K0) {
                        i0();
                    }
                }
            } else {
                h = lVar.h(bufferInfo2);
            }
            if (h < 0) {
                if (h == -2) {
                    this.G0 = true;
                    l lVar2 = this.b0;
                    lVar2.getClass();
                    MediaFormat outputFormat = lVar2.getOutputFormat();
                    if (this.j0 != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                        this.o0 = true;
                        return true;
                    }
                    this.d0 = outputFormat;
                    this.e0 = true;
                    return true;
                }
                if (this.p0 && (this.J0 || this.C0 == 2)) {
                    f0();
                }
                long j11 = this.q0;
                if (j11 != -9223372036854775807L) {
                    long j12 = j11 + 100;
                    this.h.getClass();
                    if (j12 < System.currentTimeMillis()) {
                        f0();
                        return false;
                    }
                }
                return false;
            }
            if (this.o0) {
                this.o0 = false;
                lVar.c(h);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                f0();
                return false;
            }
            this.t0 = h;
            ByteBuffer outputBuffer = lVar.getOutputBuffer(h);
            this.u0 = outputBuffer;
            if (outputBuffer != null) {
                outputBuffer.position(bufferInfo2.offset);
                this.u0.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            x0(bufferInfo2.presentationTimeUs);
        }
        long j13 = bufferInfo2.presentationTimeUs;
        this.v0 = j13 < this.w;
        long j14 = this.I0;
        this.w0 = j14 != -9223372036854775807L && j14 <= j13;
        if (this.T0) {
            long j15 = this.U0;
            if (j15 == -9223372036854775807L || j13 > j15) {
                this.U0 = j13;
                this.v0 = true;
                this.w0 = false;
            } else {
                this.T0 = false;
                this.U0 = -9223372036854775807L;
            }
        }
        if (this.m0 && this.F0) {
            try {
                ByteBuffer byteBuffer = this.u0;
                int i11 = this.t0;
                int i12 = bufferInfo2.flags;
                boolean z12 = this.v0;
                boolean z13 = this.w0;
                b2.s sVar = this.T;
                sVar.getClass();
                bufferInfo = bufferInfo2;
                z10 = false;
                z11 = true;
                try {
                    g02 = g0(j3, j10, lVar, byteBuffer, i11, i12, 1, j13, z12, z13, sVar);
                } catch (IllegalStateException unused2) {
                    f0();
                    if (!this.K0) {
                        return z10;
                    }
                    i0();
                    return z10;
                }
            } catch (IllegalStateException unused3) {
                z10 = false;
            }
        } else {
            bufferInfo = bufferInfo2;
            z10 = false;
            z11 = true;
            ByteBuffer byteBuffer2 = this.u0;
            int i13 = this.t0;
            int i14 = bufferInfo.flags;
            boolean z14 = this.v0;
            boolean z15 = this.w0;
            b2.s sVar2 = this.T;
            sVar2.getClass();
            g02 = g0(j3, j10, lVar, byteBuffer2, i13, i14, 1, j13, z14, z15, sVar2);
        }
        if (!g02) {
            return z10;
        }
        c0(bufferInfo.presentationTimeUs);
        boolean z16 = (bufferInfo.flags & 4) != 0;
        if (!z16 && this.F0 && this.w0) {
            this.h.getClass();
            this.q0 = System.currentTimeMillis();
        }
        this.t0 = -1;
        this.u0 = null;
        if (!z16) {
            return z11;
        }
        f0();
        return z10;
    }

    public final boolean G() {
        l lVar = this.b0;
        if (lVar == null || this.C0 == 2 || this.J0) {
            return false;
        }
        int i10 = this.s0;
        h2.g gVar = this.M;
        if (i10 < 0) {
            int g10 = lVar.g();
            this.s0 = g10;
            if (g10 < 0) {
                return false;
            }
            gVar.e = lVar.getInputBuffer(g10);
            gVar.i();
        }
        if (this.C0 == 1) {
            if (!this.p0) {
                this.F0 = true;
                lVar.a(0L, this.s0, 0, 4);
                this.s0 = -1;
                gVar.e = null;
            }
            this.C0 = 2;
            return false;
        }
        if (this.n0) {
            this.n0 = false;
            ByteBuffer byteBuffer = gVar.e;
            byteBuffer.getClass();
            byteBuffer.put(W0);
            lVar.a(0L, this.s0, 38, 0);
            this.s0 = -1;
            gVar.e = null;
            this.E0 = true;
            return true;
        }
        if (this.B0 == 1) {
            int i11 = 0;
            while (true) {
                b2.s sVar = this.c0;
                sVar.getClass();
                if (i11 >= sVar.u.size()) {
                    break;
                }
                byte[] bArr = (byte[]) this.c0.u.get(i11);
                ByteBuffer byteBuffer2 = gVar.e;
                byteBuffer2.getClass();
                byteBuffer2.put(bArr);
                i11++;
            }
            this.B0 = 2;
        }
        ByteBuffer byteBuffer3 = gVar.e;
        byteBuffer3.getClass();
        int position = byteBuffer3.position();
        y yVar = this.c;
        yVar.A();
        try {
            int v = v(yVar, gVar, 0);
            if (v == -3) {
                if (!k()) {
                    return false;
                }
                this.I0 = this.H0;
                return false;
            }
            if (v == -5) {
                if (this.B0 == 2) {
                    gVar.i();
                    this.B0 = 1;
                }
                Z(yVar);
                return true;
            }
            if (gVar.c(4)) {
                this.I0 = this.H0;
                if (this.B0 == 2) {
                    gVar.i();
                    this.B0 = 1;
                }
                this.J0 = true;
                if (!this.E0) {
                    f0();
                    return false;
                }
                if (this.p0) {
                    return false;
                }
                this.F0 = true;
                lVar.a(0L, this.s0, 0, 4);
                this.s0 = -1;
                gVar.e = null;
                return false;
            }
            if (!this.E0 && !gVar.c(1)) {
                gVar.i();
                if (this.B0 == 2) {
                    this.B0 = 1;
                    return true;
                }
            } else if (!p0(gVar)) {
                boolean c10 = gVar.c(TLObject.FLAG_30);
                if (c10) {
                    h2.c cVar = gVar.d;
                    if (position == 0) {
                        cVar.getClass();
                    } else {
                        if (cVar.d == null) {
                            int[] iArr = new int[1];
                            cVar.d = iArr;
                            cVar.i.numBytesOfClearData = iArr;
                        }
                        int[] iArr2 = cVar.d;
                        iArr2[0] = iArr2[0] + position;
                    }
                }
                long j3 = gVar.h;
                if (this.L0) {
                    ArrayDeque arrayDeque = this.Q;
                    if (arrayDeque.isEmpty()) {
                        a0 a0Var = this.P0.d;
                        b2.s sVar2 = this.S;
                        sVar2.getClass();
                        a0Var.a(sVar2, j3);
                    } else {
                        a0 a0Var2 = ((q) arrayDeque.peekLast()).d;
                        b2.s sVar3 = this.S;
                        sVar3.getClass();
                        a0Var2.a(sVar3, j3);
                    }
                    this.L0 = false;
                }
                this.H0 = Math.max(this.H0, j3);
                if (k() || gVar.c(TLObject.FLAG_29)) {
                    this.I0 = this.H0;
                }
                gVar.m();
                if (gVar.c(TLObject.FLAG_28)) {
                    Q(gVar);
                }
                e0(gVar);
                int K = K(gVar);
                if (Build.VERSION.SDK_INT < 34 || (K & 32) == 0) {
                    m1 m1Var = this.d;
                    m1Var.getClass();
                    if (!m1Var.b) {
                        this.V0 = Math.max(this.V0, gVar.h);
                    }
                }
                if (c10) {
                    lVar.b(this.s0, gVar.d, j3, K);
                } else {
                    int i12 = this.s0;
                    ByteBuffer byteBuffer4 = gVar.e;
                    byteBuffer4.getClass();
                    lVar.a(j3, i12, byteBuffer4.limit(), K);
                }
                this.s0 = -1;
                gVar.e = null;
                this.E0 = true;
                this.B0 = 0;
                this.O0.c++;
                return true;
            }
            return true;
        } catch (h2.f e7) {
            W(e7);
            h0(0);
            H();
            return true;
        }
    }

    public final void H() {
        try {
            l lVar = this.b0;
            e2.d.h(lVar);
            lVar.flush();
        } finally {
            l0();
        }
    }

    public final boolean I() {
        if (this.b0 != null) {
            if (s0()) {
                i0();
                return true;
            }
            if (q0()) {
                H();
                return false;
            }
            long j3 = this.V0;
            if (j3 != -9223372036854775807L && this.w <= j3 && this.Q0 < j3) {
                this.T0 = true;
                this.V0 = -9223372036854775807L;
            }
        }
        return false;
    }

    public final List J(boolean z10) {
        b2.s sVar = this.S;
        sVar.getClass();
        i iVar = this.J;
        ArrayList N = N(iVar, sVar, z10);
        if (!N.isEmpty() || !z10) {
            return N;
        }
        ArrayList N2 = N(iVar, sVar, false);
        if (!N2.isEmpty()) {
            e2.a.n("MediaCodecRenderer", "Drm session requires secure decoder for " + sVar.r + ", but no secure decoder available. Trying to proceed with " + N2 + ".");
        }
        return N2;
    }

    public int K(h2.g gVar) {
        return 0;
    }

    public boolean L() {
        return false;
    }

    public abstract float M(float f7, b2.s sVar, b2.s[] sVarArr);

    public abstract ArrayList N(i iVar, b2.s sVar, boolean z10);

    public long O(long j3, long j10) {
        return super.g(j3, j10);
    }

    public abstract com.google.firebase.messaging.n P(o oVar, b2.s sVar, MediaCrypto mediaCrypto, float f7);

    public abstract void Q(h2.g gVar);

    /* JADX WARN: Removed duplicated region for block: B:30:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R(o oVar, MediaCrypto mediaCrypto) {
        float M;
        int i10;
        this.i0 = oVar;
        b2.s sVar = this.S;
        sVar.getClass();
        String str = oVar.a;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 23) {
            M = -1.0f;
        } else {
            float f7 = this.a0;
            b2.s[] sVarArr = this.s;
            sVarArr.getClass();
            M = M(f7, sVar, sVarArr);
        }
        float f10 = M > this.K ? M : -1.0f;
        this.h.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        com.google.firebase.messaging.n P = P(oVar, sVar, mediaCrypto, f10);
        if (i11 >= 31) {
            j2.k kVar = this.f;
            kVar.getClass();
            h0.f(P, kVar);
        }
        try {
            Trace.beginSection("createCodec:" + str);
            l p5 = this.I.p(P);
            this.b0 = p5;
            p5.j(new g0(this, 17));
            Trace.endSection();
            this.h.getClass();
            float f11 = f10;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!oVar.e(sVar)) {
                String c10 = b2.s.c(sVar);
                Locale locale = Locale.US;
                e2.a.n("MediaCodecRenderer", p6.j("Format exceeds selected codec's capabilities [", c10, ", ", str, "]"));
            }
            this.f0 = f11;
            this.c0 = sVar;
            if (i11 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
                String str2 = Build.MODEL;
                if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                    i10 = 2;
                    this.j0 = i10;
                    this.k0 = i11 != 29 && "c2.android.aac.decoder".equals(str);
                    this.l0 = i11 > 23 && "OMX.google.vorbis.decoder".equals(str);
                    this.m0 = i11 != 21 && "OMX.google.aac.decoder".equals(str);
                    String str3 = oVar.a;
                    this.p0 = (i11 <= 25 && "OMX.rk.video_decoder.avc".equals(str3)) || (i11 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str3) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str3) || "OMX.bcm.vdec.avc.tunnel".equals(str3) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str3) || "OMX.bcm.vdec.hevc.tunnel".equals(str3) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str3))) || (("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && oVar.f) || L());
                    this.b0.getClass();
                    if (this.n == 2) {
                        this.h.getClass();
                        this.r0 = SystemClock.elapsedRealtime() + 1000;
                    }
                    this.O0.a++;
                    X(elapsedRealtime2, elapsedRealtime2 - elapsedRealtime, str);
                }
            }
            if (i11 < 24 && ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str))) {
                String str4 = Build.DEVICE;
                if ("flounder".equals(str4) || "flounder_lte".equals(str4) || "grouper".equals(str4) || "tilapia".equals(str4)) {
                    i10 = 1;
                    this.j0 = i10;
                    this.k0 = i11 != 29 && "c2.android.aac.decoder".equals(str);
                    this.l0 = i11 > 23 && "OMX.google.vorbis.decoder".equals(str);
                    this.m0 = i11 != 21 && "OMX.google.aac.decoder".equals(str);
                    String str32 = oVar.a;
                    if (i11 <= 25) {
                        this.p0 = (i11 <= 25 && "OMX.rk.video_decoder.avc".equals(str32)) || (i11 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str32) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str32) || "OMX.bcm.vdec.avc.tunnel".equals(str32) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str32) || "OMX.bcm.vdec.hevc.tunnel".equals(str32) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str32))) || (("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && oVar.f) || L());
                        this.b0.getClass();
                        if (this.n == 2) {
                        }
                        this.O0.a++;
                        X(elapsedRealtime2, elapsedRealtime2 - elapsedRealtime, str);
                    }
                    this.p0 = (i11 <= 25 && "OMX.rk.video_decoder.avc".equals(str32)) || (i11 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str32) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str32) || "OMX.bcm.vdec.avc.tunnel".equals(str32) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str32) || "OMX.bcm.vdec.hevc.tunnel".equals(str32) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str32))) || (("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && oVar.f) || L());
                    this.b0.getClass();
                    if (this.n == 2) {
                    }
                    this.O0.a++;
                    X(elapsedRealtime2, elapsedRealtime2 - elapsedRealtime, str);
                }
            }
            i10 = 0;
            this.j0 = i10;
            this.k0 = i11 != 29 && "c2.android.aac.decoder".equals(str);
            this.l0 = i11 > 23 && "OMX.google.vorbis.decoder".equals(str);
            this.m0 = i11 != 21 && "OMX.google.aac.decoder".equals(str);
            String str322 = oVar.a;
            this.p0 = (i11 <= 25 && "OMX.rk.video_decoder.avc".equals(str322)) || (i11 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str322) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str322) || "OMX.bcm.vdec.avc.tunnel".equals(str322) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str322) || "OMX.bcm.vdec.hevc.tunnel".equals(str322) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str322))) || (("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && oVar.f) || L());
            this.b0.getClass();
            if (this.n == 2) {
            }
            this.O0.a++;
            X(elapsedRealtime2, elapsedRealtime2 - elapsedRealtime, str);
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final boolean S(long j3, long j10) {
        if (j10 >= j3) {
            return false;
        }
        b2.s sVar = this.T;
        return sVar == null || !Objects.equals(sVar.r, "audio/opus") || j3 - j10 > 80000;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0073, code lost:
    
        if (r7 != 4) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008c, code lost:
    
        if (r2.g() != null) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T() {
        b2.s sVar;
        MediaCrypto mediaCrypto;
        if (this.b0 != null || this.x0 || (sVar = this.S) == null) {
            return;
        }
        String str = sVar.r;
        boolean z10 = true;
        if (this.V == null && t0(sVar)) {
            this.x0 = false;
            k0();
            boolean equals = MediaController.AUDIO_MIME_TYPE.equals(str);
            g gVar = this.O;
            if (equals || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                gVar.getClass();
                gVar.x = 32;
            } else {
                gVar.getClass();
                gVar.x = 1;
            }
            this.x0 = true;
            return;
        }
        n0(this.V);
        if (this.U != null) {
            e2.d.g(this.X == null);
            n2.g gVar2 = this.U;
            h2.a h = gVar2.h();
            if (n2.r.c && (h instanceof n2.r)) {
                int e7 = gVar2.e();
                if (e7 == 1) {
                    n2.f g10 = gVar2.g();
                    g10.getClass();
                    throw c(g10, this.S, false, g10.a);
                }
            }
            if (h != null) {
                if (h instanceof n2.r) {
                    n2.r rVar = (n2.r) h;
                    try {
                        this.X = new MediaCrypto(rVar.a, rVar.b);
                    } catch (MediaCryptoException e10) {
                        throw c(e10, this.S, false, 6006);
                    }
                }
            }
        }
        try {
            n2.g gVar3 = this.U;
            if (gVar3 != null) {
                if (gVar3.e() != 3) {
                    if (this.U.e() == 4) {
                    }
                }
                n2.g gVar4 = this.U;
                e2.d.h(str);
                if (gVar4.f(str)) {
                    U(this.X, z10);
                    mediaCrypto = this.X;
                    if (mediaCrypto == null && this.b0 == null) {
                        mediaCrypto.release();
                        this.X = null;
                        return;
                    }
                }
            }
            z10 = false;
            U(this.X, z10);
            mediaCrypto = this.X;
            if (mediaCrypto == null) {
            }
        } catch (p e11) {
            throw c(e11, sVar, false, 4001);
        }
    }

    public final void U(MediaCrypto mediaCrypto, boolean z10) {
        b2.s sVar = this.S;
        sVar.getClass();
        if (this.g0 == null) {
            try {
                List J = J(z10);
                this.g0 = new ArrayDeque();
                ArrayList arrayList = (ArrayList) J;
                if (!arrayList.isEmpty()) {
                    this.g0.add((o) arrayList.get(0));
                }
                this.h0 = null;
            } catch (t e7) {
                throw new p(sVar, e7, z10, -49998);
            }
        }
        if (this.g0.isEmpty()) {
            throw new p(sVar, null, z10, -49999);
        }
        ArrayDeque arrayDeque = this.g0;
        arrayDeque.getClass();
        while (this.b0 == null) {
            o oVar = (o) arrayDeque.peekFirst();
            oVar.getClass();
            if (!V(sVar) || !r0(oVar)) {
                return;
            }
            try {
                R(oVar, mediaCrypto);
            } catch (Exception e10) {
                e2.a.o("MediaCodecRenderer", "Failed to initialize decoder: " + oVar, e10);
                arrayDeque.removeFirst();
                p pVar = new p("Decoder init failed: " + oVar.a + ", " + sVar, e10, sVar.r, z10, oVar, e10 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e10).getDiagnosticInfo() : null);
                W(pVar);
                p pVar2 = this.h0;
                if (pVar2 == null) {
                    this.h0 = pVar;
                } else {
                    this.h0 = new p(pVar2.getMessage(), pVar2.getCause(), pVar2.a, pVar2.b, pVar2.c, pVar2.d);
                }
                if (arrayDeque.isEmpty()) {
                    throw this.h0;
                }
            }
        }
        this.g0 = null;
    }

    public boolean V(b2.s sVar) {
        return true;
    }

    public abstract void W(Exception exc);

    public abstract void X(long j3, long j10, String str);

    public abstract void Y(String str);

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0165, code lost:
    
        if (E() == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e3, code lost:
    
        if (r4.f(r2) != false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x011f, code lost:
    
        if (E() == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0153, code lost:
    
        if (E() == false) goto L82;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i2.i Z(y yVar) {
        b2.s sVar;
        int i10;
        h2.a h;
        h2.a h10;
        boolean z10 = true;
        this.L0 = true;
        b2.s sVar2 = (b2.s) yVar.c;
        sVar2.getClass();
        String str = sVar2.r;
        if (str == null) {
            throw c(new IllegalArgumentException("Sample MIME type is null."), sVar2, false, 4005);
        }
        if ((str.equals("video/av01") || str.equals("video/x-vnd.on2.vp9")) && !sVar2.u.isEmpty()) {
            b2.r a2 = sVar2.a();
            a2.t = null;
            sVar = new b2.s(a2);
        } else {
            sVar = sVar2;
        }
        n2.g gVar = (n2.g) yVar.b;
        i2.g.D(this.V, gVar);
        this.V = gVar;
        this.S = sVar;
        if (this.x0) {
            this.z0 = true;
            return null;
        }
        l lVar = this.b0;
        if (lVar == null) {
            this.g0 = null;
            T();
            return null;
        }
        o oVar = this.i0;
        oVar.getClass();
        b2.s sVar3 = this.c0;
        sVar3.getClass();
        n2.g gVar2 = this.U;
        n2.g gVar3 = this.V;
        if (gVar2 != gVar3) {
            if (gVar3 != null && gVar2 != null && (h = gVar3.h()) != null && (h10 = gVar2.h()) != null && h.getClass().equals(h10.getClass())) {
                if (h instanceof n2.r) {
                    if (gVar3.c().equals(gVar2.c()) && Build.VERSION.SDK_INT >= 23) {
                        UUID uuid = b2.i.e;
                        if (!uuid.equals(gVar2.c()) && !uuid.equals(gVar3.c())) {
                            if (!oVar.f) {
                                if (gVar3.e() != 2) {
                                    if (gVar3.e() == 3 || gVar3.e() == 4) {
                                        String str2 = sVar.r;
                                        str2.getClass();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (this.E0) {
                this.C0 = 1;
                this.D0 = 3;
            } else {
                i0();
                T();
            }
            return new i2.i(oVar.a, sVar3, sVar, 0, 128);
        }
        boolean z11 = this.V != this.U;
        e2.d.g(!z11 || Build.VERSION.SDK_INT >= 23);
        i2.i C = C(oVar, sVar3, sVar);
        int i11 = C.d;
        if (i11 != 0) {
            if (i11 == 1) {
                if (v0(sVar)) {
                    this.c0 = sVar;
                    if (!z11) {
                        if (this.E0) {
                            this.C0 = 1;
                            if (this.l0) {
                                this.D0 = 3;
                                i10 = 2;
                            } else {
                                this.D0 = 1;
                            }
                        }
                    }
                }
                i10 = 16;
            } else if (i11 == 2) {
                if (v0(sVar)) {
                    this.A0 = true;
                    this.B0 = 1;
                    int i12 = this.j0;
                    if (i12 != 2 && (i12 != 1 || sVar.y != sVar3.y || sVar.z != sVar3.z)) {
                        z10 = false;
                    }
                    this.n0 = z10;
                    this.c0 = sVar;
                    if (z11) {
                    }
                }
                i10 = 16;
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException();
                }
                if (v0(sVar)) {
                    this.c0 = sVar;
                    if (z11) {
                    }
                }
                i10 = 16;
            }
            return (i11 != 0 || (this.b0 == lVar && this.D0 != 3)) ? C : new i2.i(oVar.a, sVar3, sVar, 0, i10);
        }
        if (this.E0) {
            this.C0 = 1;
            this.D0 = 3;
        } else {
            i0();
            T();
        }
        i10 = 0;
        if (i11 != 0) {
        }
    }

    public abstract void a0(b2.s sVar, MediaFormat mediaFormat);

    public void c0(long j3) {
        this.Q0 = j3;
        while (true) {
            ArrayDeque arrayDeque = this.Q;
            if (arrayDeque.isEmpty() || j3 < ((q) arrayDeque.peek()).a) {
                return;
            }
            q qVar = (q) arrayDeque.poll();
            qVar.getClass();
            o0(qVar);
            d0();
        }
    }

    public abstract void d0();

    public final void f0() {
        int i10 = this.D0;
        if (i10 == 1) {
            H();
            return;
        }
        if (i10 == 2) {
            H();
            w0();
        } else if (i10 != 3) {
            this.K0 = true;
            j0();
        } else {
            i0();
            T();
        }
    }

    @Override // i2.f
    public final long g(long j3, long j10) {
        return O(j3, j10);
    }

    public abstract boolean g0(long j3, long j10, l lVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j11, boolean z10, boolean z11, b2.s sVar);

    public final boolean h0(int i10) {
        y yVar = this.c;
        yVar.A();
        h2.g gVar = this.L;
        gVar.i();
        int v = v(yVar, gVar, i10 | 4);
        if (v == -5) {
            Z(yVar);
            return true;
        }
        if (v != -4 || !gVar.c(4)) {
            return false;
        }
        this.J0 = true;
        f0();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i0() {
        try {
            l lVar = this.b0;
            if (lVar != null) {
                lVar.release();
                this.O0.b++;
                o oVar = this.i0;
                oVar.getClass();
                Y(oVar.a);
            }
            this.b0 = null;
            try {
                MediaCrypto mediaCrypto = this.X;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th2) {
            this.b0 = null;
            try {
                MediaCrypto mediaCrypto2 = this.X;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
            }
        }
    }

    public abstract void j0();

    public final void k0() {
        this.H0 = -9223372036854775807L;
        this.I0 = -9223372036854775807L;
        this.Q0 = -9223372036854775807L;
        this.z0 = false;
        this.O.i();
        this.N.i();
        this.y0 = false;
        i0 i0Var = this.R;
        i0Var.getClass();
        i0Var.a = c2.h.a;
        i0Var.c = 0;
        i0Var.b = 2;
    }

    public void l0() {
        this.s0 = -1;
        this.M.e = null;
        this.t0 = -1;
        this.u0 = null;
        this.H0 = -9223372036854775807L;
        this.I0 = -9223372036854775807L;
        this.Q0 = -9223372036854775807L;
        this.r0 = -9223372036854775807L;
        this.F0 = false;
        this.q0 = -9223372036854775807L;
        this.E0 = false;
        this.n0 = false;
        this.o0 = false;
        this.v0 = false;
        this.w0 = false;
        this.C0 = 0;
        this.D0 = 0;
        this.B0 = this.A0 ? 1 : 0;
        this.T0 = false;
        this.U0 = -9223372036854775807L;
        this.V0 = -9223372036854775807L;
    }

    @Override // i2.f
    public boolean m() {
        boolean e7;
        if (this.S != null) {
            if (k()) {
                e7 = this.y;
            } else {
                b1 b1Var = this.r;
                b1Var.getClass();
                e7 = b1Var.e();
            }
            if (!e7) {
                if (!(this.t0 >= 0)) {
                    if (this.r0 != -9223372036854775807L) {
                        this.h.getClass();
                        if (SystemClock.elapsedRealtime() < this.r0) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void m0() {
        l0();
        this.N0 = null;
        this.g0 = null;
        this.i0 = null;
        this.c0 = null;
        this.d0 = null;
        this.e0 = false;
        this.G0 = false;
        this.f0 = -1.0f;
        this.j0 = 0;
        this.k0 = false;
        this.l0 = false;
        this.m0 = false;
        this.p0 = false;
        this.A0 = false;
        this.B0 = 0;
    }

    @Override // i2.f
    public void n() {
        this.S = null;
        o0(q.e);
        this.Q.clear();
        if (!this.x0) {
            I();
        } else {
            this.x0 = false;
            k0();
        }
    }

    public final void n0(n2.g gVar) {
        i2.g.D(this.U, gVar);
        this.U = gVar;
    }

    public final void o0(q qVar) {
        this.P0 = qVar;
        if (qVar.c != -9223372036854775807L) {
            this.R0 = true;
            b0();
        }
    }

    @Override // i2.f
    public void p(long j3, boolean z10) {
        this.J0 = false;
        this.K0 = false;
        this.M0 = false;
        if (this.x0) {
            k0();
        } else if (I()) {
            T();
        }
        if (this.P0.d.i() > 0) {
            this.L0 = true;
        }
        this.P0.d.c();
        this.Q.clear();
    }

    public boolean p0(h2.g gVar) {
        return false;
    }

    public boolean q0() {
        return true;
    }

    public boolean r0(o oVar) {
        return true;
    }

    public boolean s0() {
        int i10 = this.D0;
        if (i10 == 3 || ((this.k0 && !this.G0) || (this.l0 && this.F0))) {
            return true;
        }
        if (i10 == 2) {
            int i11 = Build.VERSION.SDK_INT;
            e2.d.g(i11 >= 23);
            if (i11 >= 23) {
                try {
                    w0();
                    return false;
                } catch (i2.o e7) {
                    e2.a.o("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e7);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean t0(b2.s sVar) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // i2.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void u(b2.s[] sVarArr, long j3, long j10, f0 f0Var) {
        if (this.P0.c == -9223372036854775807L) {
            o0(new q(-9223372036854775807L, j3, j10));
            if (this.S0) {
                d0();
                return;
            }
            return;
        }
        ArrayDeque arrayDeque = this.Q;
        if (arrayDeque.isEmpty()) {
            long j11 = this.H0;
            if (j11 != -9223372036854775807L) {
                long j12 = this.Q0;
                if (j12 != -9223372036854775807L) {
                }
            }
            o0(new q(-9223372036854775807L, j3, j10));
            if (this.P0.c != -9223372036854775807L) {
                d0();
                return;
            }
            return;
        }
        arrayDeque.add(new q(this.H0, j3, j10));
    }

    public abstract int u0(i iVar, b2.s sVar);

    public final boolean v0(b2.s sVar) {
        if (Build.VERSION.SDK_INT >= 23 && this.b0 != null && this.D0 != 3 && this.n != 0) {
            float f7 = this.a0;
            sVar.getClass();
            b2.s[] sVarArr = this.s;
            sVarArr.getClass();
            float M = M(f7, sVar, sVarArr);
            float f10 = this.f0;
            if (f10 != M) {
                if (M == -1.0f) {
                    if (this.E0) {
                        this.C0 = 1;
                        this.D0 = 3;
                        return false;
                    }
                    i0();
                    T();
                    return false;
                }
                if (f10 != -1.0f || M > this.K) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", M);
                    l lVar = this.b0;
                    lVar.getClass();
                    lVar.setParameters(bundle);
                    this.f0 = M;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0078 A[LOOP:1: B:33:0x0053->B:42:0x0078, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0079 A[EDGE_INSN: B:43:0x0079->B:44:? BREAK  A[LOOP:1: B:33:0x0053->B:42:0x0078], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0099 A[LOOP:2: B:45:0x0079->B:54:0x0099, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009a A[EDGE_INSN: B:55:0x009a->B:56:0x009a BREAK  A[LOOP:2: B:45:0x0079->B:54:0x0099], SYNTHETIC] */
    @Override // i2.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void w(long j3, long j10) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (this.M0) {
            this.M0 = false;
            f0();
        }
        i2.o oVar = this.N0;
        if (oVar != null) {
            this.N0 = null;
            throw oVar;
        }
        try {
            if (this.K0) {
                j0();
                return;
            }
            if (this.S != null || h0(2)) {
                T();
                if (this.x0) {
                    Trace.beginSection("bypassRender");
                    while (B(j3, j10)) {
                    }
                    Trace.endSection();
                } else if (this.b0 != null) {
                    this.h.getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    Trace.beginSection("drainAndFeed");
                    while (F(j3, j10)) {
                        long j11 = this.Y;
                        if (j11 != -9223372036854775807L) {
                            this.h.getClass();
                            if (SystemClock.elapsedRealtime() - elapsedRealtime >= j11) {
                                z11 = false;
                                if (z11) {
                                    break;
                                }
                            }
                        }
                        z11 = true;
                        if (z11) {
                        }
                    }
                    while (G()) {
                        long j12 = this.Y;
                        if (j12 != -9223372036854775807L) {
                            this.h.getClass();
                            if (SystemClock.elapsedRealtime() - elapsedRealtime >= j12) {
                                z10 = false;
                                if (z10) {
                                    break;
                                }
                            }
                        }
                        z10 = true;
                        if (z10) {
                        }
                    }
                    Trace.endSection();
                } else {
                    i2.h hVar = this.O0;
                    int i10 = hVar.d;
                    b1 b1Var = this.r;
                    b1Var.getClass();
                    hVar.d = i10 + b1Var.m(j3 - this.v);
                    h0(1);
                }
                synchronized (this.O0) {
                }
            }
        } catch (MediaCodec.CryptoException e7) {
            throw c(e7, this.S, false, d0.x(e7.getErrorCode()));
        } catch (IllegalStateException e10) {
            boolean z13 = e10 instanceof MediaCodec.CodecException;
            if (!z13) {
                StackTraceElement[] stackTrace = e10.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e10;
                }
            }
            W(e10);
            if (z13 && ((MediaCodec.CodecException) e10).isRecoverable()) {
                z12 = true;
            }
            if (z12) {
                i0();
            }
            n D = D(e10, this.i0);
            throw c(D, this.S, z12, D.a == 1101 ? 4006 : 4003);
        }
    }

    public final void w0() {
        n2.g gVar = this.V;
        gVar.getClass();
        h2.a h = gVar.h();
        if (h instanceof n2.r) {
            try {
                MediaCrypto mediaCrypto = this.X;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(((n2.r) h).b);
            } catch (MediaCryptoException e7) {
                throw c(e7, this.S, false, 6006);
            }
        }
        n0(this.V);
        this.C0 = 0;
        this.D0 = 0;
    }

    public final void x0(long j3) {
        b2.s sVar = (b2.s) this.P0.d.g(j3);
        if (sVar == null && this.R0 && this.d0 != null) {
            sVar = (b2.s) this.P0.d.f();
        }
        if (sVar != null) {
            this.T = sVar;
        } else if (!this.e0 || this.T == null) {
            return;
        }
        b2.s sVar2 = this.T;
        sVar2.getClass();
        a0(sVar2, this.d0);
        this.e0 = false;
        this.R0 = false;
    }

    @Override // i2.f
    public void y(float f7, float f10) {
        this.Z = f7;
        this.a0 = f10;
        v0(this.c0);
    }

    @Override // i2.f
    public final int z(b2.s sVar) {
        try {
            return u0(this.J, sVar);
        } catch (t e7) {
            throw c(e7, sVar, false, 4002);
        }
    }

    public void b0() {
    }

    public void e0(h2.g gVar) {
    }
}
