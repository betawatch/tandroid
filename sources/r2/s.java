package r2;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import e0.f0;
import e2.a0;
import e2.d0;
import i2.j0;
import i2.n1;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import k2.i0;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Cells.c1;
import u2.b1;
import v7.x7;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public abstract class s extends i2.f {
    public static final byte[] V0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public int A0;
    public int B0;
    public int C0;
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public long G0;
    public long H0;
    public final l I;
    public boolean I0;
    public final j J;
    public boolean J0;
    public final float K;
    public boolean K0;
    public final h2.h L;
    public boolean L0;
    public final h2.h M;
    public i2.n M0;
    public final h2.h N;
    public i2.g N0;
    public final g O;
    public r O0;
    public final MediaCodec.BufferInfo P;
    public long P0;
    public final ArrayDeque Q;
    public boolean Q0;
    public final i0 R;
    public boolean R0;
    public b2.s S;
    public boolean S0;
    public b2.s T;
    public long T0;
    public n2.g U;
    public long U0;
    public n2.g V;
    public j0 W;
    public MediaCrypto X;
    public final long Y;
    public float Z;
    public float a0;
    public m b0;
    public b2.s c0;
    public MediaFormat d0;
    public boolean e0;
    public float f0;
    public ArrayDeque g0;
    public q h0;
    public p i0;
    public int j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public long p0;
    public long q0;
    public int r0;
    public int s0;
    public ByteBuffer t0;
    public boolean u0;
    public boolean v0;
    public boolean w0;
    public boolean x0;
    public boolean y0;
    public boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(int i10, l lVar, float f7) {
        super(i10);
        j jVar = j.b;
        this.I = lVar;
        this.J = jVar;
        this.K = f7;
        this.L = new h2.h(0, 0);
        this.M = new h2.h(0, 0);
        this.N = new h2.h(2, 0);
        g gVar = new g(2, 0);
        gVar.v = 32;
        this.O = gVar;
        this.P = new MediaCodec.BufferInfo();
        this.Z = 1.0f;
        this.a0 = 1.0f;
        this.Y = -9223372036854775807L;
        this.Q = new ArrayDeque();
        this.O0 = r.e;
        gVar.b(0);
        gVar.c.order(ByteOrder.nativeOrder());
        i0 i0Var = new i0();
        i0Var.a = c2.h.a;
        i0Var.c = 0;
        i0Var.b = 2;
        this.R = i0Var;
        this.f0 = -1.0f;
        this.j0 = 0;
        this.A0 = 0;
        this.r0 = -1;
        this.s0 = -1;
        this.q0 = -9223372036854775807L;
        this.G0 = -9223372036854775807L;
        this.H0 = -9223372036854775807L;
        this.P0 = -9223372036854775807L;
        this.p0 = -9223372036854775807L;
        this.B0 = 0;
        this.C0 = 0;
        this.N0 = new i2.g();
        this.T0 = -9223372036854775807L;
        this.U0 = -9223372036854775807L;
    }

    @Override // i2.f
    public final int A(b2.s sVar) {
        try {
            return u0(this.J, sVar);
        } catch (u e7) {
            throw d(e7, sVar, false, 4002);
        }
    }

    @Override // i2.f
    public final int B() {
        return 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean, int] */
    public final boolean C(long j3, long j10) {
        g gVar;
        int i10;
        int i11;
        int i12;
        e2.d.g(!this.J0);
        g gVar2 = this.O;
        if (gVar2.f()) {
            ByteBuffer byteBuffer = gVar2.c;
            int i13 = this.s0;
            int i14 = gVar2.s;
            long j11 = gVar2.e;
            boolean S = S(this.w, gVar2.r);
            boolean isEndOfStream = gVar2.isEndOfStream();
            b2.s sVar = this.T;
            sVar.getClass();
            gVar = gVar2;
            if (g0(j3, j10, null, byteBuffer, i13, 0, i14, j11, S, isEndOfStream, sVar)) {
                c0(gVar.r);
                gVar.clear();
            }
        }
        gVar = gVar2;
        if (this.I0) {
            this.J0 = true;
            return false;
        }
        ?? r12 = 0;
        boolean z10 = this.x0;
        h2.h hVar = this.N;
        if (z10) {
            e2.d.g(gVar.d(hVar));
            this.x0 = false;
        }
        if (this.y0) {
            if (gVar.f()) {
                return true;
            }
            this.w0 = false;
            k0();
            this.y0 = false;
            T();
            if (!this.w0) {
                return false;
            }
        }
        e2.d.g(!this.I0);
        n4.x xVar = this.c;
        xVar.u();
        hVar.clear();
        while (true) {
            hVar.clear();
            int w10 = w(xVar, hVar, r12);
            if (w10 == -5) {
                Z(xVar);
                break;
            }
            if (w10 != -4) {
                if (w10 != -3) {
                    throw new IllegalStateException();
                }
                if (k()) {
                    this.H0 = this.G0;
                }
            } else {
                if (hVar.isEndOfStream()) {
                    this.I0 = true;
                    this.H0 = this.G0;
                    break;
                }
                this.G0 = Math.max(this.G0, hVar.e);
                if (k() || this.M.isLastSample()) {
                    this.H0 = this.G0;
                }
                byte[] bArr = null;
                if (this.K0) {
                    b2.s sVar2 = this.S;
                    sVar2.getClass();
                    this.T = sVar2;
                    if (Objects.equals(sVar2.r, "audio/opus") && !this.T.u.isEmpty()) {
                        byte[] bArr2 = (byte[]) this.T.u.get(r12);
                        int i15 = (bArr2[10] & 255) | ((bArr2[11] & 255) << 8);
                        b2.r a2 = this.T.a();
                        a2.L = i15;
                        this.T = new b2.s(a2);
                    }
                    a0(this.T, null);
                    this.K0 = r12;
                }
                hVar.c();
                b2.s sVar3 = this.T;
                if (sVar3 != null && Objects.equals(sVar3.r, "audio/opus")) {
                    if (hVar.hasSupplementalData()) {
                        hVar.a = this.T;
                        Q(hVar);
                    }
                    if (this.w - hVar.e <= 80000) {
                        List list = this.T.u;
                        i0 i0Var = this.R;
                        i0Var.getClass();
                        hVar.c.getClass();
                        if (hVar.c.limit() - hVar.c.position() != 0) {
                            if (i0Var.b == 2 && (list.size() == 1 || list.size() == 3)) {
                                bArr = (byte[]) list.get(r12);
                            }
                            ByteBuffer byteBuffer2 = hVar.c;
                            int position = byteBuffer2.position();
                            int limit = byteBuffer2.limit();
                            int i16 = limit - position;
                            int i17 = (i16 + 255) / 255;
                            int i18 = i17 + 27 + i16;
                            if (i0Var.b == 2) {
                                i10 = bArr != null ? bArr.length + 28 : 47;
                                i18 = i10 + 44 + i18;
                            } else {
                                i10 = r12;
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
                                    byteBuffer3.put(x7.a(bArr.length));
                                    byteBuffer3.put(bArr);
                                    i11 = position;
                                    byteBuffer3.putInt(22, d0.n(byteBuffer3.arrayOffset(), bArr.length + 28, 0, byteBuffer3.array()));
                                    byteBuffer3.position(bArr.length + 28);
                                } else {
                                    i11 = position;
                                    i12 = limit;
                                    byteBuffer3.put(i0.d);
                                }
                                byteBuffer3.put(i0.e);
                            } else {
                                i11 = position;
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
                            for (int i21 = i11; i21 < i20; i21++) {
                                byteBuffer3.put(byteBuffer2.get(i21));
                            }
                            byteBuffer2.position(byteBuffer2.limit());
                            byteBuffer3.flip();
                            if (i0Var.b == 2) {
                                byteBuffer3.putInt(i10 + 66, d0.n(byteBuffer3.arrayOffset() + i10 + 44, byteBuffer3.limit() - byteBuffer3.position(), 0, byteBuffer3.array()));
                            } else {
                                byteBuffer3.putInt(22, d0.n(byteBuffer3.arrayOffset(), byteBuffer3.limit() - byteBuffer3.position(), 0, byteBuffer3.array()));
                            }
                            i0Var.b++;
                            i0Var.a = byteBuffer3;
                            hVar.clear();
                            hVar.b(i0Var.a.remaining());
                            hVar.c.put(i0Var.a);
                            hVar.c();
                        }
                    }
                }
                if (gVar.f()) {
                    long j12 = this.w;
                    if (S(j12, gVar.r) != S(j12, hVar.e)) {
                        break;
                    }
                }
                if (!gVar.d(hVar)) {
                    break;
                }
                r12 = 0;
            }
        }
        this.x0 = true;
        if (gVar.f()) {
            gVar.c();
        }
        return gVar.f() || this.I0 || this.y0;
    }

    public abstract i2.h D(p pVar, b2.s sVar, b2.s sVar2);

    public o E(IllegalStateException illegalStateException, p pVar) {
        return new o(illegalStateException, pVar);
    }

    public final boolean F() {
        if (!this.D0) {
            w0();
            return true;
        }
        this.B0 = 1;
        if (this.l0) {
            this.C0 = 3;
            return false;
        }
        this.C0 = 2;
        return true;
    }

    public final boolean G(long j3, long j10) {
        m mVar = this.b0;
        mVar.getClass();
        int i10 = this.s0;
        MediaCodec.BufferInfo bufferInfo = this.P;
        if (i10 < 0) {
            int h = mVar.h(bufferInfo);
            if (h < 0) {
                if (h == -2) {
                    this.F0 = true;
                    m mVar2 = this.b0;
                    mVar2.getClass();
                    MediaFormat outputFormat = mVar2.getOutputFormat();
                    if (this.j0 != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                        this.n0 = true;
                        return true;
                    }
                    this.d0 = outputFormat;
                    this.e0 = true;
                    return true;
                }
                if (this.o0 && (this.I0 || this.B0 == 2)) {
                    f0();
                }
                long j11 = this.p0;
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
            if (this.n0) {
                this.n0 = false;
                mVar.c(h);
                return true;
            }
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                f0();
                return false;
            }
            this.s0 = h;
            ByteBuffer outputBuffer = mVar.getOutputBuffer(h);
            this.t0 = outputBuffer;
            if (outputBuffer != null) {
                outputBuffer.position(bufferInfo.offset);
                this.t0.limit(bufferInfo.offset + bufferInfo.size);
            }
            x0(bufferInfo.presentationTimeUs);
        }
        long j13 = bufferInfo.presentationTimeUs;
        this.u0 = j13 < this.w;
        long j14 = this.H0;
        this.v0 = j14 != -9223372036854775807L && j14 <= j13;
        if (this.S0) {
            long j15 = this.T0;
            if (j15 == -9223372036854775807L || j13 > j15) {
                this.T0 = j13;
                this.u0 = true;
                this.v0 = false;
            } else {
                this.S0 = false;
                this.T0 = -9223372036854775807L;
            }
        }
        ByteBuffer byteBuffer = this.t0;
        int i11 = this.s0;
        int i12 = bufferInfo.flags;
        boolean z10 = this.u0;
        boolean z11 = this.v0;
        b2.s sVar = this.T;
        sVar.getClass();
        if (!g0(j3, j10, mVar, byteBuffer, i11, i12, 1, j13, z10, z11, sVar)) {
            return false;
        }
        c0(bufferInfo.presentationTimeUs);
        boolean z12 = (bufferInfo.flags & 4) != 0;
        if (!z12 && this.E0 && this.v0) {
            this.h.getClass();
            this.p0 = System.currentTimeMillis();
        }
        this.s0 = -1;
        this.t0 = null;
        if (!z12) {
            return true;
        }
        f0();
        return false;
    }

    public final boolean H() {
        m mVar = this.b0;
        if (mVar != null && this.B0 != 2 && !this.I0) {
            int i10 = this.r0;
            h2.h hVar = this.M;
            if (i10 < 0) {
                int g10 = mVar.g();
                this.r0 = g10;
                if (g10 >= 0) {
                    hVar.c = mVar.getInputBuffer(g10);
                    hVar.clear();
                }
            }
            if (this.B0 == 1) {
                if (!this.o0) {
                    this.E0 = true;
                    mVar.a(0L, this.r0, 0, 4);
                    this.r0 = -1;
                    hVar.c = null;
                }
                this.B0 = 2;
                return false;
            }
            if (this.m0) {
                this.m0 = false;
                ByteBuffer byteBuffer = hVar.c;
                byteBuffer.getClass();
                byteBuffer.put(V0);
                mVar.a(0L, this.r0, 38, 0);
                this.r0 = -1;
                hVar.c = null;
                this.D0 = true;
                return true;
            }
            if (this.A0 == 1) {
                int i11 = 0;
                while (true) {
                    b2.s sVar = this.c0;
                    sVar.getClass();
                    if (i11 >= sVar.u.size()) {
                        break;
                    }
                    byte[] bArr = (byte[]) this.c0.u.get(i11);
                    ByteBuffer byteBuffer2 = hVar.c;
                    byteBuffer2.getClass();
                    byteBuffer2.put(bArr);
                    i11++;
                }
                this.A0 = 2;
            }
            ByteBuffer byteBuffer3 = hVar.c;
            byteBuffer3.getClass();
            int position = byteBuffer3.position();
            n4.x xVar = this.c;
            xVar.u();
            try {
                int w10 = w(xVar, hVar, 0);
                if (w10 == -3) {
                    if (k()) {
                        this.H0 = this.G0;
                        return false;
                    }
                } else {
                    if (w10 == -5) {
                        if (this.A0 == 2) {
                            hVar.clear();
                            this.A0 = 1;
                        }
                        Z(xVar);
                        return true;
                    }
                    if (!hVar.isEndOfStream()) {
                        if (!this.D0 && !hVar.isKeyFrame()) {
                            hVar.clear();
                            if (this.A0 == 2) {
                                this.A0 = 1;
                                return true;
                            }
                        } else if (!p0(hVar)) {
                            boolean flag = hVar.getFlag(TLObject.FLAG_30);
                            if (flag) {
                                h2.d dVar = hVar.b;
                                if (position == 0) {
                                    dVar.getClass();
                                } else {
                                    if (dVar.d == null) {
                                        int[] iArr = new int[1];
                                        dVar.d = iArr;
                                        dVar.i.numBytesOfClearData = iArr;
                                    }
                                    int[] iArr2 = dVar.d;
                                    iArr2[0] = iArr2[0] + position;
                                }
                            }
                            long j3 = hVar.e;
                            if (this.K0) {
                                ArrayDeque arrayDeque = this.Q;
                                if (arrayDeque.isEmpty()) {
                                    a0 a0Var = this.O0.d;
                                    b2.s sVar2 = this.S;
                                    sVar2.getClass();
                                    a0Var.a(sVar2, j3);
                                } else {
                                    a0 a0Var2 = ((r) arrayDeque.peekLast()).d;
                                    b2.s sVar3 = this.S;
                                    sVar3.getClass();
                                    a0Var2.a(sVar3, j3);
                                }
                                this.K0 = false;
                            }
                            this.G0 = Math.max(this.G0, j3);
                            if (k() || hVar.isLastSample()) {
                                this.H0 = this.G0;
                            }
                            hVar.c();
                            if (hVar.hasSupplementalData()) {
                                Q(hVar);
                            }
                            e0(hVar);
                            int L = L(hVar);
                            if (Build.VERSION.SDK_INT < 34 || (L & 32) == 0) {
                                n1 n1Var = this.d;
                                n1Var.getClass();
                                if (!n1Var.b) {
                                    this.U0 = Math.max(this.U0, hVar.e);
                                }
                            }
                            if (flag) {
                                mVar.b(this.r0, hVar.b, j3, L);
                            } else {
                                int i12 = this.r0;
                                ByteBuffer byteBuffer4 = hVar.c;
                                byteBuffer4.getClass();
                                mVar.a(j3, i12, byteBuffer4.limit(), L);
                            }
                            this.r0 = -1;
                            hVar.c = null;
                            this.D0 = true;
                            this.A0 = 0;
                            this.N0.c++;
                            return true;
                        }
                        return true;
                    }
                    this.H0 = this.G0;
                    if (this.A0 == 2) {
                        hVar.clear();
                        this.A0 = 1;
                    }
                    this.I0 = true;
                    if (!this.D0) {
                        f0();
                        return false;
                    }
                    if (!this.o0) {
                        this.E0 = true;
                        mVar.a(0L, this.r0, 0, 4);
                        this.r0 = -1;
                        hVar.c = null;
                        return false;
                    }
                }
            } catch (h2.g e7) {
                W(e7);
                h0(0);
                I();
                return true;
            }
        }
        return false;
    }

    public final void I() {
        try {
            m mVar = this.b0;
            e2.d.h(mVar);
            mVar.flush();
        } finally {
            l0();
        }
    }

    public final boolean J() {
        if (this.b0 != null) {
            if (s0()) {
                i0();
                return true;
            }
            if (q0()) {
                I();
                return false;
            }
            long j3 = this.U0;
            if (j3 != -9223372036854775807L && this.w <= j3 && this.P0 < j3) {
                this.S0 = true;
                this.U0 = -9223372036854775807L;
            }
        }
        return false;
    }

    public final List K(boolean z10) {
        b2.s sVar = this.S;
        sVar.getClass();
        j jVar = this.J;
        ArrayList N = N(jVar, sVar, z10);
        if (!N.isEmpty() || !z10) {
            return N;
        }
        ArrayList N2 = N(jVar, sVar, false);
        if (!N2.isEmpty()) {
            e2.a.n("MediaCodecRenderer", "Drm session requires secure decoder for " + sVar.r + ", but no secure decoder available. Trying to proceed with " + N2 + ".");
        }
        return N2;
    }

    public int L(h2.h hVar) {
        return 0;
    }

    public abstract float M(float f7, b2.s sVar, b2.s[] sVarArr);

    public abstract ArrayList N(j jVar, b2.s sVar, boolean z10);

    public long O(long j3, long j10) {
        return super.g(j3, j10);
    }

    public abstract com.google.firebase.messaging.n P(p pVar, b2.s sVar, MediaCrypto mediaCrypto, float f7);

    public abstract void Q(h2.h hVar);

    /* JADX WARN: Removed duplicated region for block: B:27:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R(p pVar, MediaCrypto mediaCrypto) {
        int i10;
        this.i0 = pVar;
        b2.s sVar = this.S;
        sVar.getClass();
        String str = pVar.a;
        int i11 = Build.VERSION.SDK_INT;
        float f7 = this.a0;
        b2.s[] sVarArr = this.s;
        sVarArr.getClass();
        float M = M(f7, sVar, sVarArr);
        if (M <= this.K) {
            M = -1.0f;
        }
        this.h.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        com.google.firebase.messaging.n P = P(pVar, sVar, mediaCrypto, M);
        if (i11 >= 31) {
            j2.k kVar = this.f;
            kVar.getClass();
            f0.f(P, kVar);
        }
        try {
            Trace.beginSection("createCodec:" + str);
            m b10 = this.I.b(P);
            this.b0 = b10;
            b10.k(new l2.f(this, 20));
            Trace.endSection();
            this.h.getClass();
            float f10 = M;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!pVar.e(sVar)) {
                String c10 = b2.s.c(sVar);
                Locale locale = Locale.US;
                e2.a.n("MediaCodecRenderer", c1.i("Format exceeds selected codec's capabilities [", c10, ", ", str, "]"));
            }
            this.f0 = f10;
            this.c0 = sVar;
            boolean z10 = false;
            if (i11 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
                String str2 = Build.MODEL;
                if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                    i10 = 2;
                    this.j0 = i10;
                    this.k0 = i11 != 29 && "c2.android.aac.decoder".equals(str);
                    this.l0 = i11 > 23 && "OMX.google.vorbis.decoder".equals(str);
                    String str3 = pVar.a;
                    if ((i11 <= 25 && "OMX.rk.video_decoder.avc".equals(str3)) || ((i11 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str3) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str3) || "OMX.bcm.vdec.avc.tunnel".equals(str3) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str3) || "OMX.bcm.vdec.hevc.tunnel".equals(str3) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str3))) || ("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && pVar.f))) {
                        z10 = true;
                    }
                    this.o0 = z10;
                    this.b0.getClass();
                    if (this.n == 2) {
                        this.h.getClass();
                        this.q0 = SystemClock.elapsedRealtime() + 1000;
                    }
                    this.N0.a++;
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
                    String str32 = pVar.a;
                    if (i11 <= 25) {
                        z10 = true;
                        this.o0 = z10;
                        this.b0.getClass();
                        if (this.n == 2) {
                        }
                        this.N0.a++;
                        X(elapsedRealtime2, elapsedRealtime2 - elapsedRealtime, str);
                    }
                    z10 = true;
                    this.o0 = z10;
                    this.b0.getClass();
                    if (this.n == 2) {
                    }
                    this.N0.a++;
                    X(elapsedRealtime2, elapsedRealtime2 - elapsedRealtime, str);
                }
            }
            i10 = 0;
            this.j0 = i10;
            this.k0 = i11 != 29 && "c2.android.aac.decoder".equals(str);
            this.l0 = i11 > 23 && "OMX.google.vorbis.decoder".equals(str);
            String str322 = pVar.a;
            if (i11 <= 25) {
            }
            z10 = true;
            this.o0 = z10;
            this.b0.getClass();
            if (this.n == 2) {
            }
            this.N0.a++;
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
        if (this.b0 != null || this.w0 || (sVar = this.S) == null) {
            return;
        }
        String str = sVar.r;
        boolean z10 = true;
        if (this.V == null && t0(sVar)) {
            this.w0 = false;
            k0();
            boolean equals = MediaController.AUDIO_MIME_TYPE.equals(str);
            g gVar = this.O;
            if (equals || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                gVar.getClass();
                gVar.v = 32;
            } else {
                gVar.getClass();
                gVar.v = 1;
            }
            this.w0 = true;
            return;
        }
        n0(this.V);
        if (this.U != null) {
            e2.d.g(this.X == null);
            n2.g gVar2 = this.U;
            h2.b h = gVar2.h();
            if (n2.r.c && (h instanceof n2.r)) {
                int e7 = gVar2.e();
                if (e7 == 1) {
                    n2.f g10 = gVar2.g();
                    g10.getClass();
                    throw d(g10, this.S, false, g10.a);
                }
            }
            if (h != null) {
                if (h instanceof n2.r) {
                    n2.r rVar = (n2.r) h;
                    try {
                        this.X = new MediaCrypto(rVar.a, rVar.b);
                    } catch (MediaCryptoException e10) {
                        throw d(e10, this.S, false, 6006);
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
        } catch (q e11) {
            throw d(e11, sVar, false, 4001);
        }
    }

    public final void U(MediaCrypto mediaCrypto, boolean z10) {
        b2.s sVar = this.S;
        sVar.getClass();
        if (this.g0 == null) {
            try {
                List K = K(z10);
                this.g0 = new ArrayDeque();
                ArrayList arrayList = (ArrayList) K;
                if (!arrayList.isEmpty()) {
                    this.g0.add((p) arrayList.get(0));
                }
                this.h0 = null;
            } catch (u e7) {
                throw new q(sVar, e7, z10, -49998);
            }
        }
        if (this.g0.isEmpty()) {
            throw new q(sVar, null, z10, -49999);
        }
        ArrayDeque arrayDeque = this.g0;
        arrayDeque.getClass();
        while (this.b0 == null) {
            p pVar = (p) arrayDeque.peekFirst();
            pVar.getClass();
            if (!V(sVar) || !r0(pVar)) {
                return;
            }
            try {
                R(pVar, mediaCrypto);
            } catch (Exception e10) {
                e2.a.o("MediaCodecRenderer", "Failed to initialize decoder: " + pVar, e10);
                arrayDeque.removeFirst();
                q qVar = new q("Decoder init failed: " + pVar.a + ", " + sVar, e10, sVar.r, z10, pVar, e10 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e10).getDiagnosticInfo() : null);
                W(qVar);
                q qVar2 = this.h0;
                if (qVar2 == null) {
                    this.h0 = qVar;
                } else {
                    this.h0 = new q(qVar2.getMessage(), qVar2.getCause(), qVar2.a, qVar2.b, qVar2.c, qVar2.d);
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

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00db, code lost:
    
        if (r4.f(r2) != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0109, code lost:
    
        if (F() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x013d, code lost:
    
        if (F() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x014f, code lost:
    
        if (F() == false) goto L73;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i2.h Z(n4.x xVar) {
        b2.s sVar;
        int i10;
        h2.b h;
        h2.b h10;
        boolean z10 = true;
        this.K0 = true;
        b2.s sVar2 = (b2.s) xVar.c;
        sVar2.getClass();
        String str = sVar2.r;
        if (str == null) {
            throw d(new IllegalArgumentException("Sample MIME type is null."), sVar2, false, 4005);
        }
        if ((str.equals("video/av01") || str.equals("video/x-vnd.on2.vp9")) && !sVar2.u.isEmpty()) {
            b2.r a2 = sVar2.a();
            a2.t = null;
            sVar = new b2.s(a2);
        } else {
            sVar = sVar2;
        }
        n2.g gVar = (n2.g) xVar.b;
        hg.c.A(this.V, gVar);
        this.V = gVar;
        this.S = sVar;
        if (this.w0) {
            this.y0 = true;
            return null;
        }
        m mVar = this.b0;
        if (mVar == null) {
            this.g0 = null;
            T();
            return null;
        }
        p pVar = this.i0;
        pVar.getClass();
        b2.s sVar3 = this.c0;
        sVar3.getClass();
        n2.g gVar2 = this.U;
        n2.g gVar3 = this.V;
        if (gVar2 != gVar3) {
            if (gVar3 != null && gVar2 != null && (h = gVar3.h()) != null && (h10 = gVar2.h()) != null && h.getClass().equals(h10.getClass())) {
                if (h instanceof n2.r) {
                    if (gVar3.c().equals(gVar2.c())) {
                        UUID uuid = b2.i.e;
                        if (!uuid.equals(gVar2.c()) && !uuid.equals(gVar3.c())) {
                            if (!pVar.f) {
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
            if (this.D0) {
                this.B0 = 1;
                this.C0 = 3;
            } else {
                i0();
                T();
            }
            return new i2.h(pVar.a, sVar3, sVar, 0, 128);
        }
        boolean z11 = this.V != this.U;
        i2.h D = D(pVar, sVar3, sVar);
        int i11 = D.d;
        if (i11 != 0) {
            if (i11 == 1) {
                if (v0(sVar)) {
                    this.c0 = sVar;
                    if (!z11) {
                        if (this.D0) {
                            this.B0 = 1;
                            if (this.l0) {
                                this.C0 = 3;
                                i10 = 2;
                            } else {
                                this.C0 = 1;
                            }
                        }
                    }
                }
                i10 = 16;
            } else if (i11 == 2) {
                if (v0(sVar)) {
                    this.z0 = true;
                    this.A0 = 1;
                    int i12 = this.j0;
                    if (i12 != 2 && (i12 != 1 || sVar.y != sVar3.y || sVar.z != sVar3.z)) {
                        z10 = false;
                    }
                    this.m0 = z10;
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
            return (i11 != 0 || (this.b0 == mVar && this.C0 != 3)) ? D : new i2.h(pVar.a, sVar3, sVar, 0, i10);
        }
        if (this.D0) {
            this.B0 = 1;
            this.C0 = 3;
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
        this.P0 = j3;
        while (true) {
            ArrayDeque arrayDeque = this.Q;
            if (arrayDeque.isEmpty() || j3 < ((r) arrayDeque.peek()).a) {
                return;
            }
            r rVar = (r) arrayDeque.poll();
            rVar.getClass();
            o0(rVar);
            d0();
        }
    }

    public abstract void d0();

    public final void f0() {
        int i10 = this.C0;
        if (i10 == 1) {
            I();
            return;
        }
        if (i10 == 2) {
            I();
            w0();
        } else if (i10 != 3) {
            this.J0 = true;
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

    public abstract boolean g0(long j3, long j10, m mVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j11, boolean z10, boolean z11, b2.s sVar);

    public final boolean h0(int i10) {
        n4.x xVar = this.c;
        xVar.u();
        h2.h hVar = this.L;
        hVar.clear();
        int w10 = w(xVar, hVar, i10 | 4);
        if (w10 == -5) {
            Z(xVar);
            return true;
        }
        if (w10 != -4 || !hVar.isEndOfStream()) {
            return false;
        }
        this.I0 = true;
        f0();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i0() {
        try {
            m mVar = this.b0;
            if (mVar != null) {
                mVar.release();
                this.N0.b++;
                p pVar = this.i0;
                pVar.getClass();
                Y(pVar.a);
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
        this.G0 = -9223372036854775807L;
        this.H0 = -9223372036854775807L;
        this.P0 = -9223372036854775807L;
        this.y0 = false;
        this.O.clear();
        this.N.clear();
        this.x0 = false;
        i0 i0Var = this.R;
        i0Var.getClass();
        i0Var.a = c2.h.a;
        i0Var.c = 0;
        i0Var.b = 2;
    }

    public void l0() {
        this.r0 = -1;
        this.M.c = null;
        this.s0 = -1;
        this.t0 = null;
        this.G0 = -9223372036854775807L;
        this.H0 = -9223372036854775807L;
        this.P0 = -9223372036854775807L;
        this.q0 = -9223372036854775807L;
        this.E0 = false;
        this.p0 = -9223372036854775807L;
        this.D0 = false;
        this.m0 = false;
        this.n0 = false;
        this.u0 = false;
        this.v0 = false;
        this.B0 = 0;
        this.C0 = 0;
        this.A0 = this.z0 ? 1 : 0;
        this.S0 = false;
        this.T0 = -9223372036854775807L;
        this.U0 = -9223372036854775807L;
    }

    @Override // i2.f
    public boolean m() {
        if (this.S == null) {
            return false;
        }
        if (n() || this.s0 >= 0) {
            return true;
        }
        if (this.q0 == -9223372036854775807L) {
            return false;
        }
        this.h.getClass();
        return SystemClock.elapsedRealtime() < this.q0;
    }

    public final void m0() {
        l0();
        this.M0 = null;
        this.g0 = null;
        this.i0 = null;
        this.c0 = null;
        this.d0 = null;
        this.e0 = false;
        this.F0 = false;
        this.f0 = -1.0f;
        this.j0 = 0;
        this.k0 = false;
        this.l0 = false;
        this.o0 = false;
        this.z0 = false;
        this.A0 = 0;
    }

    public final void n0(n2.g gVar) {
        hg.c.A(this.U, gVar);
        this.U = gVar;
    }

    @Override // i2.f
    public void o() {
        this.S = null;
        o0(r.e);
        this.Q.clear();
        if (!this.w0) {
            J();
        } else {
            this.w0 = false;
            k0();
        }
    }

    public final void o0(r rVar) {
        this.O0 = rVar;
        if (rVar.c != -9223372036854775807L) {
            this.Q0 = true;
            b0();
        }
    }

    public boolean p0(h2.h hVar) {
        return false;
    }

    @Override // i2.f
    public void q(long j3, boolean z10) {
        this.I0 = false;
        this.J0 = false;
        this.L0 = false;
        if (this.w0) {
            k0();
        } else if (J()) {
            T();
        }
        if (this.O0.d.m() > 0) {
            this.K0 = true;
        }
        this.O0.d.c();
        this.Q.clear();
    }

    public boolean q0() {
        return true;
    }

    public boolean r0(p pVar) {
        return true;
    }

    public boolean s0() {
        int i10 = this.C0;
        if (i10 == 3 || ((this.k0 && !this.F0) || (this.l0 && this.E0))) {
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        try {
            w0();
            return false;
        } catch (i2.n e7) {
            e2.a.o("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e7);
            return true;
        }
    }

    public boolean t0(b2.s sVar) {
        return false;
    }

    public abstract int u0(j jVar, b2.s sVar);

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // i2.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void v(b2.s[] sVarArr, long j3, long j10, u2.f0 f0Var) {
        if (this.O0.c == -9223372036854775807L) {
            o0(new r(-9223372036854775807L, j3, j10));
            if (this.R0) {
                d0();
                return;
            }
            return;
        }
        ArrayDeque arrayDeque = this.Q;
        if (arrayDeque.isEmpty()) {
            long j11 = this.G0;
            if (j11 != -9223372036854775807L) {
                long j12 = this.P0;
                if (j12 != -9223372036854775807L) {
                }
            }
            o0(new r(-9223372036854775807L, j3, j10));
            if (this.O0.c != -9223372036854775807L) {
                d0();
                return;
            }
            return;
        }
        arrayDeque.add(new r(this.G0, j3, j10));
    }

    public final boolean v0(b2.s sVar) {
        if (this.b0 != null && this.C0 != 3 && this.n != 0) {
            float f7 = this.a0;
            sVar.getClass();
            b2.s[] sVarArr = this.s;
            sVarArr.getClass();
            float M = M(f7, sVar, sVarArr);
            float f10 = this.f0;
            if (f10 != M) {
                if (M == -1.0f) {
                    if (this.D0) {
                        this.B0 = 1;
                        this.C0 = 3;
                        return false;
                    }
                    i0();
                    T();
                    return false;
                }
                if (f10 != -1.0f || M > this.K) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", M);
                    m mVar = this.b0;
                    mVar.getClass();
                    mVar.setParameters(bundle);
                    this.f0 = M;
                }
            }
        }
        return true;
    }

    public final void w0() {
        n2.g gVar = this.V;
        gVar.getClass();
        h2.b h = gVar.h();
        if (h instanceof n2.r) {
            try {
                MediaCrypto mediaCrypto = this.X;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(((n2.r) h).b);
            } catch (MediaCryptoException e7) {
                throw d(e7, this.S, false, 6006);
            }
        }
        n0(this.V);
        this.B0 = 0;
        this.C0 = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0078 A[LOOP:1: B:33:0x0053->B:42:0x0078, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0079 A[EDGE_INSN: B:43:0x0079->B:44:? BREAK  A[LOOP:1: B:33:0x0053->B:42:0x0078], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0099 A[LOOP:2: B:45:0x0079->B:54:0x0099, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009a A[EDGE_INSN: B:55:0x009a->B:56:0x009a BREAK  A[LOOP:2: B:45:0x0079->B:54:0x0099], SYNTHETIC] */
    @Override // i2.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void x(long j3, long j10) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (this.L0) {
            this.L0 = false;
            f0();
        }
        i2.n nVar = this.M0;
        if (nVar != null) {
            this.M0 = null;
            throw nVar;
        }
        try {
            if (this.J0) {
                j0();
                return;
            }
            if (this.S != null || h0(2)) {
                T();
                if (this.w0) {
                    Trace.beginSection("bypassRender");
                    while (C(j3, j10)) {
                    }
                    Trace.endSection();
                } else if (this.b0 != null) {
                    this.h.getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    Trace.beginSection("drainAndFeed");
                    while (G(j3, j10)) {
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
                    while (H()) {
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
                    i2.g gVar = this.N0;
                    int i10 = gVar.d;
                    b1 b1Var = this.r;
                    b1Var.getClass();
                    gVar.d = i10 + b1Var.j(j3 - this.v);
                    h0(1);
                }
                synchronized (this.N0) {
                }
            }
        } catch (MediaCodec.CryptoException e7) {
            throw d(e7, this.S, false, d0.w(e7.getErrorCode()));
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
            o E = E(e10, this.i0);
            throw d(E, this.S, z12, E.a == 1101 ? 4006 : 4003);
        }
    }

    public final void x0(long j3) {
        b2.s sVar = (b2.s) this.O0.d.i(j3);
        if (sVar == null && this.Q0 && this.d0 != null) {
            sVar = (b2.s) this.O0.d.h();
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
        this.Q0 = false;
    }

    @Override // i2.f
    public void z(float f7, float f10) {
        this.Z = f7;
        this.a0 = f10;
        v0(this.c0);
    }

    public void b0() {
    }

    public void e0(h2.h hVar) {
    }
}
