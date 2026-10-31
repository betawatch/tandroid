package r2;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import e0.f0;
import e2.j0;
import e2.l0;
import e9.e2;
import e9.m2;
import e9.y0;
import i2.m0;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import k2.a1;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.web.v1;
import u2.g0;
import v7.e8;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class r extends i2.b {
    public static final byte[] Y0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public boolean A0;
    public boolean B0;
    public int C0;
    public int D0;
    public int E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    public final Context I;
    public long I0;
    public final k J;
    public boolean J0;
    public final i K;
    public boolean K0;
    public final float L;
    public boolean L0;
    public final h2.h M;
    public boolean M0;
    public final h2.h N;
    public i2.l N0;
    public final h2.h O;
    public i2.d O0;
    public final g P;
    public q P0;
    public final MediaCodec.BufferInfo Q;
    public long Q0;
    public final ArrayDeque R;
    public boolean R0;
    public final a1 S;
    public boolean S0;
    public final AtomicInteger T;
    public boolean T0;
    public b2.x U;
    public long U0;
    public b2.x V;
    public i2.c V0;
    public n2.g W;
    public i2.c W0;
    public n2.g X;
    public y0 X0;
    public m0 Y;
    public MediaCrypto Z;
    public final long a0;
    public float b0;
    public float c0;
    public l d0;
    public b2.x e0;
    public MediaFormat f0;
    public boolean g0;
    public float h0;
    public ArrayDeque i0;
    public p j0;
    public o k0;
    public int l0;
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public boolean q0;
    public long r0;
    public boolean s0;
    public long t0;
    public int u0;
    public int v0;
    public ByteBuffer w0;
    public boolean x0;
    public boolean y0;
    public boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, int i10, k kVar, float f7) {
        super(i10);
        i iVar = i.b;
        this.I = context.getApplicationContext();
        this.J = kVar;
        this.K = iVar;
        this.L = f7;
        this.T = new AtomicInteger();
        this.M = new h2.h(0, 0);
        this.N = new h2.h(0, 0);
        this.O = new h2.h(2, 0);
        g gVar = new g(2, 0);
        gVar.w = 32;
        this.P = gVar;
        this.Q = new MediaCodec.BufferInfo();
        this.b0 = 1.0f;
        this.c0 = 1.0f;
        this.a0 = -9223372036854775807L;
        this.R = new ArrayDeque();
        this.P0 = q.g;
        gVar.c(0);
        gVar.c.order(ByteOrder.nativeOrder());
        a1 a1Var = new a1();
        a1Var.a = c2.m.a;
        a1Var.c = 0;
        a1Var.b = 2;
        this.S = a1Var;
        this.h0 = -1.0f;
        this.l0 = 0;
        this.C0 = 0;
        this.u0 = -1;
        this.v0 = -1;
        this.t0 = -9223372036854775807L;
        this.I0 = -9223372036854775807L;
        this.Q0 = -9223372036854775807L;
        this.r0 = -9223372036854775807L;
        this.D0 = 0;
        this.E0 = 0;
        this.O0 = new i2.d();
        this.T0 = false;
        this.U0 = 0L;
        int i11 = y0.c;
        this.X0 = e2.s;
        i2.c cVar = i2.c.b;
        this.V0 = cVar;
        this.W0 = cVar;
    }

    @Override // i2.b
    public void A(float f7, float f10) {
        this.b0 = f7;
        this.c0 = f10;
        A0(this.e0);
    }

    public final boolean A0(b2.x xVar) {
        if (this.d0 != null && this.E0 != 3 && this.n != 0) {
            float f7 = this.c0;
            xVar.getClass();
            b2.x[] xVarArr = this.s;
            xVarArr.getClass();
            float P = P(f7, xVar, xVarArr);
            float f10 = this.h0;
            if (f10 != P) {
                if (P == -1.0f) {
                    if (this.F0) {
                        this.D0 = 1;
                        this.E0 = 3;
                        return false;
                    }
                    n0();
                    X();
                    return false;
                }
                if (f10 != -1.0f || P > this.L) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", P);
                    l lVar = this.d0;
                    lVar.getClass();
                    lVar.setParameters(bundle);
                    this.h0 = P;
                }
            }
        }
        return true;
    }

    public final void B0() {
        n2.g gVar = this.X;
        gVar.getClass();
        h2.b h = gVar.h();
        if (h instanceof n2.r) {
            try {
                MediaCrypto mediaCrypto = this.Z;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(((n2.r) h).b);
            } catch (MediaCryptoException e) {
                throw e(e, this.U, false, 6006);
            }
        }
        s0(this.X);
        this.D0 = 0;
        this.E0 = 0;
    }

    @Override // i2.b
    public final int C(b2.x xVar) {
        try {
            return z0(this.K, xVar);
        } catch (t e) {
            throw e(e, xVar, false, 4002);
        }
    }

    public final void C0(long j10) {
        b2.x xVar = (b2.x) this.P0.d.j(j10);
        if (xVar == null && this.R0 && this.f0 != null) {
            xVar = (b2.x) this.P0.d.i();
        }
        if (xVar != null) {
            this.V = xVar;
        } else if (!this.g0 || this.V == null) {
            return;
        }
        b2.x xVar2 = this.V;
        xVar2.getClass();
        f0(xVar2, this.f0);
        this.g0 = false;
        this.R0 = false;
    }

    @Override // i2.b
    public final int D() {
        return 8;
    }

    public final void F(MediaFormat mediaFormat) {
        if (Build.VERSION.SDK_INT >= 29) {
            for (Map.Entry entry : this.V0.a.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    mediaFormat.setString(str, null);
                } else if (value instanceof Integer) {
                    mediaFormat.setInteger(str, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    mediaFormat.setLong(str, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    mediaFormat.setFloat(str, ((Float) value).floatValue());
                } else if (value instanceof String) {
                    mediaFormat.setString(str, (String) value);
                } else if (value instanceof ByteBuffer) {
                    mediaFormat.setByteBuffer(str, (ByteBuffer) value);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0312, code lost:
    
        r24.z0 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean G(long j10, long j11) {
        g gVar;
        int i10;
        int i11;
        int i12;
        t6.p(!this.K0);
        g gVar2 = this.P;
        if (gVar2.f()) {
            ByteBuffer byteBuffer = gVar2.c;
            int i13 = this.v0;
            int i14 = gVar2.s;
            long j12 = gVar2.e;
            boolean W = W(this.x, gVar2.r);
            boolean isEndOfStream = gVar2.isEndOfStream();
            b2.x xVar = this.V;
            xVar.getClass();
            gVar = gVar2;
            if (l0(j10, j11, null, byteBuffer, i13, 0, i14, j12, W, isEndOfStream, xVar)) {
                h0(gVar.r);
                gVar.clear();
            }
        }
        gVar = gVar2;
        if (this.J0) {
            this.K0 = true;
            return false;
        }
        ?? r12 = 0;
        boolean z10 = this.z0;
        h2.h hVar = this.O;
        if (z10) {
            t6.p(gVar.e(hVar));
            this.z0 = false;
        }
        if (this.A0) {
            if (gVar.f()) {
                return true;
            }
            this.y0 = false;
            p0();
            this.A0 = false;
            X();
            if (!this.y0) {
                return false;
            }
        }
        t6.p(!this.J0);
        hf.b bVar = this.c;
        bVar.L();
        hVar.clear();
        while (true) {
            hVar.clear();
            int w9 = w(bVar, hVar, r12);
            if (w9 == -5) {
                e0(bVar);
                break;
            }
            if (w9 != -4) {
                if (w9 != -3) {
                    throw new IllegalStateException();
                }
                if (k()) {
                    S().f = this.I0;
                }
            } else {
                if (hVar.isEndOfStream()) {
                    this.J0 = true;
                    S().f = this.I0;
                    break;
                }
                this.I0 = Math.max(this.I0, hVar.e);
                if (k() || this.N.isLastSample()) {
                    S().f = this.I0;
                }
                byte[] bArr = null;
                if (this.L0) {
                    b2.x xVar2 = this.U;
                    xVar2.getClass();
                    this.V = xVar2;
                    if (Objects.equals(xVar2.s, "audio/opus") && !this.V.v.isEmpty()) {
                        byte[] bArr2 = (byte[]) this.V.v.get(r12);
                        int i15 = (bArr2[10] & 255) | ((bArr2[11] & 255) << 8);
                        b2.w a2 = this.V.a();
                        a2.M = i15;
                        this.V = new b2.x(a2);
                    }
                    f0(this.V, null);
                    this.L0 = r12;
                }
                hVar.d();
                b2.x xVar3 = this.V;
                if (xVar3 != null && Objects.equals(xVar3.s, "audio/opus")) {
                    if (hVar.hasSupplementalData()) {
                        hVar.a = this.V;
                        U(hVar);
                    }
                    if (this.x - hVar.e <= 80000) {
                        List list = this.V.v;
                        a1 a1Var = this.S;
                        a1Var.getClass();
                        hVar.c.getClass();
                        if (hVar.c.limit() - hVar.c.position() != 0) {
                            if (a1Var.b == 2 && (list.size() == 1 || list.size() == 3)) {
                                bArr = (byte[]) list.get(r12);
                            }
                            ByteBuffer byteBuffer2 = hVar.c;
                            int position = byteBuffer2.position();
                            int limit = byteBuffer2.limit();
                            int i16 = limit - position;
                            int i17 = (i16 + zs.e4) / zs.e4;
                            int i18 = i17 + 27 + i16;
                            if (a1Var.b == 2) {
                                i10 = bArr != null ? bArr.length + 28 : 47;
                                i18 = i10 + 44 + i18;
                            } else {
                                i10 = r12;
                            }
                            if (a1Var.a.capacity() < i18) {
                                a1Var.a = ByteBuffer.allocate(i18).order(ByteOrder.LITTLE_ENDIAN);
                            } else {
                                a1Var.a.clear();
                            }
                            ByteBuffer byteBuffer3 = a1Var.a;
                            if (a1Var.b == 2) {
                                if (bArr != null) {
                                    a1.a(byteBuffer3, 0L, 0, 1, true);
                                    i12 = limit;
                                    byteBuffer3.put(e8.a(bArr.length));
                                    byteBuffer3.put(bArr);
                                    i11 = position;
                                    byteBuffer3.putInt(22, l0.p(byteBuffer3.arrayOffset(), bArr.length + 28, 0, byteBuffer3.array()));
                                    byteBuffer3.position(bArr.length + 28);
                                } else {
                                    i11 = position;
                                    i12 = limit;
                                    byteBuffer3.put(a1.d);
                                }
                                byteBuffer3.put(a1.e);
                            } else {
                                i11 = position;
                                i12 = limit;
                            }
                            int e = a1Var.c + ((int) ((f2.q.e(byteBuffer2.get(0), byteBuffer2.limit() > 1 ? byteBuffer2.get(1) : (byte) 0) * 48000) / 1000000));
                            a1Var.c = e;
                            a1.a(byteBuffer3, e, a1Var.b, i17, false);
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
                            if (a1Var.b == 2) {
                                byteBuffer3.putInt(i10 + 66, l0.p(byteBuffer3.arrayOffset() + i10 + 44, byteBuffer3.limit() - byteBuffer3.position(), 0, byteBuffer3.array()));
                            } else {
                                byteBuffer3.putInt(22, l0.p(byteBuffer3.arrayOffset(), byteBuffer3.limit() - byteBuffer3.position(), 0, byteBuffer3.array()));
                            }
                            a1Var.b++;
                            a1Var.a = byteBuffer3;
                            hVar.clear();
                            hVar.c(a1Var.a.remaining());
                            hVar.c.put(a1Var.a);
                            hVar.d();
                        }
                    }
                }
                if (gVar.f()) {
                    long j13 = this.x;
                    if (W(j13, gVar.r) != W(j13, hVar.e)) {
                        break;
                    }
                }
                if (!gVar.e(hVar)) {
                    break;
                }
                r12 = 0;
            }
        }
        if (gVar.f()) {
            gVar.d();
        }
        return gVar.f() || this.J0 || this.A0;
    }

    public abstract i2.e H(o oVar, b2.x xVar, b2.x xVar2, boolean z10);

    public n I(IllegalStateException illegalStateException, o oVar) {
        return new n(illegalStateException, oVar);
    }

    public final boolean J() {
        if (!this.F0) {
            B0();
            return true;
        }
        this.D0 = 1;
        if (this.n0) {
            this.E0 = 3;
            return false;
        }
        this.E0 = 2;
        return true;
    }

    public final boolean K(long j10, long j11) {
        l lVar = this.d0;
        lVar.getClass();
        int i10 = this.v0;
        MediaCodec.BufferInfo bufferInfo = this.Q;
        if (i10 < 0) {
            int i11 = lVar.i(bufferInfo);
            if (i11 < 0) {
                if (i11 != -2) {
                    if (this.q0 && (this.J0 || this.D0 == 2)) {
                        k0();
                    }
                    long j12 = this.r0;
                    if (j12 != -9223372036854775807L) {
                        long j13 = j12 + 100;
                        this.h.getClass();
                        if (j13 < System.currentTimeMillis()) {
                            k0();
                            return false;
                        }
                    }
                    return false;
                }
                this.H0 = true;
                l lVar2 = this.d0;
                lVar2.getClass();
                MediaFormat outputFormat = lVar2.getOutputFormat();
                if (this.l0 != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                    this.p0 = true;
                    return true;
                }
                if (Build.VERSION.SDK_INT >= 29 && !this.X0.isEmpty()) {
                    i2.c cVar = new i2.c((HashMap) i2.c.a(outputFormat, this.X0).b);
                    if (!cVar.equals(this.W0)) {
                        this.W0 = cVar;
                        c0(cVar);
                    }
                }
                this.f0 = outputFormat;
                this.g0 = true;
                return true;
            }
            bufferInfo.presentationTimeUs -= this.U0;
            if (this.p0) {
                this.p0 = false;
                lVar.c(i11);
                return true;
            }
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                k0();
                return false;
            }
            this.v0 = i11;
            ByteBuffer outputBuffer = lVar.getOutputBuffer(i11);
            this.w0 = outputBuffer;
            if (outputBuffer != null) {
                outputBuffer.position(bufferInfo.offset);
                this.w0.limit(bufferInfo.offset + bufferInfo.size);
            }
            C0(bufferInfo.presentationTimeUs);
        }
        boolean z10 = this.T0 || bufferInfo.presentationTimeUs < this.x;
        long j14 = this.P0.f;
        boolean z11 = j14 != -9223372036854775807L && j14 <= bufferInfo.presentationTimeUs;
        this.x0 = z11;
        ByteBuffer byteBuffer = this.w0;
        int i12 = this.v0;
        int i13 = bufferInfo.flags;
        long j15 = bufferInfo.presentationTimeUs;
        b2.x xVar = this.V;
        xVar.getClass();
        if (!l0(j10, j11, lVar, byteBuffer, i12, i13, 1, j15, z10, z11, xVar)) {
            return false;
        }
        h0(bufferInfo.presentationTimeUs);
        boolean z12 = (bufferInfo.flags & 4) != 0;
        if (!z12 && this.G0 && this.x0) {
            this.h.getClass();
            this.r0 = System.currentTimeMillis();
        }
        this.v0 = -1;
        this.w0 = null;
        if (!z12) {
            return true;
        }
        k0();
        return false;
    }

    public final boolean L() {
        l lVar = this.d0;
        if (lVar != null && this.D0 != 2 && !this.J0) {
            int i10 = this.u0;
            h2.h hVar = this.N;
            if (i10 < 0) {
                int h = lVar.h();
                this.u0 = h;
                if (h >= 0) {
                    hVar.c = lVar.getInputBuffer(h);
                    hVar.clear();
                }
            }
            if (this.D0 == 1) {
                if (!this.q0) {
                    this.G0 = true;
                    lVar.a(this.u0, 0, 4, 0L);
                    this.u0 = -1;
                    hVar.c = null;
                }
                this.D0 = 2;
                return false;
            }
            if (this.o0) {
                this.o0 = false;
                ByteBuffer byteBuffer = hVar.c;
                byteBuffer.getClass();
                byteBuffer.put(Y0);
                lVar.a(this.u0, 38, 0, 0L);
                this.u0 = -1;
                hVar.c = null;
                this.F0 = true;
                return true;
            }
            if (this.C0 == 1) {
                int i11 = 0;
                while (true) {
                    b2.x xVar = this.e0;
                    xVar.getClass();
                    if (i11 >= xVar.v.size()) {
                        break;
                    }
                    byte[] bArr = (byte[]) this.e0.v.get(i11);
                    ByteBuffer byteBuffer2 = hVar.c;
                    byteBuffer2.getClass();
                    byteBuffer2.put(bArr);
                    i11++;
                }
                this.C0 = 2;
            }
            ByteBuffer byteBuffer3 = hVar.c;
            byteBuffer3.getClass();
            int position = byteBuffer3.position();
            hf.b bVar = this.c;
            bVar.L();
            try {
                lVar.f(new v1(25, this, bVar));
                int i12 = this.T.get();
                if (i12 == -3) {
                    if (k()) {
                        S().f = this.I0;
                        return false;
                    }
                } else {
                    if (i12 == -5) {
                        if (this.C0 == 2) {
                            hVar.clear();
                            this.C0 = 1;
                        }
                        e0(bVar);
                        return true;
                    }
                    if (!hVar.isEndOfStream()) {
                        if (this.F0 || hVar.isKeyFrame()) {
                            long j10 = hVar.e;
                            if (!u0(hVar)) {
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
                                if (this.L0) {
                                    q S = S();
                                    j0 j0Var = S.d;
                                    b2.x xVar2 = this.U;
                                    xVar2.getClass();
                                    j0Var.a(xVar2, j10);
                                    S.e = true;
                                    this.L0 = false;
                                }
                                this.I0 = Math.max(this.I0, j10);
                                if (k() || hVar.isLastSample()) {
                                    S().f = this.I0;
                                }
                                hVar.d();
                                if (hVar.hasSupplementalData()) {
                                    U(hVar);
                                }
                                if (this.T0) {
                                    long j11 = this.I0;
                                    if (j10 <= j11) {
                                        this.U0 = (j11 - j10) + 1 + this.U0;
                                    }
                                    this.I0 = j10;
                                    this.T0 = false;
                                }
                                j0(hVar);
                                int O = O(hVar);
                                long j12 = j10 + this.U0;
                                if (flag) {
                                    lVar.b(this.u0, hVar.b, j12, O);
                                } else {
                                    int i13 = this.u0;
                                    ByteBuffer byteBuffer4 = hVar.c;
                                    byteBuffer4.getClass();
                                    lVar.a(i13, byteBuffer4.limit(), O, j12);
                                }
                                this.u0 = -1;
                                hVar.c = null;
                                this.F0 = true;
                                this.C0 = 0;
                                this.O0.c++;
                                return true;
                            }
                        } else {
                            hVar.clear();
                            if (this.C0 == 2) {
                                this.C0 = 1;
                                return true;
                            }
                        }
                        return true;
                    }
                    S().f = this.I0;
                    if (this.C0 == 2) {
                        hVar.clear();
                        this.C0 = 1;
                    }
                    this.J0 = true;
                    if (!this.F0) {
                        k0();
                        return false;
                    }
                    if (!this.q0) {
                        this.G0 = true;
                        lVar.a(this.u0, 0, 4, 0L);
                        this.u0 = -1;
                        hVar.c = null;
                        return false;
                    }
                }
            } catch (h2.g e) {
                a0(e);
                m0(0);
                M();
                return true;
            }
        }
        return false;
    }

    public final void M() {
        try {
            l lVar = this.d0;
            lVar.getClass();
            lVar.flush();
        } finally {
            q0();
        }
    }

    public final List N(boolean z10) {
        b2.x xVar = this.U;
        xVar.getClass();
        i iVar = this.K;
        ArrayList Q = Q(iVar, xVar, z10);
        if (!Q.isEmpty() || !z10) {
            return Q;
        }
        ArrayList Q2 = Q(iVar, xVar, false);
        if (!Q2.isEmpty()) {
            e2.a.l("MediaCodecRenderer", "Drm session requires secure decoder for " + xVar.s + ", but no secure decoder available. Trying to proceed with " + Q2 + ".");
        }
        return Q2;
    }

    public int O(h2.h hVar) {
        return 0;
    }

    public abstract float P(float f7, b2.x xVar, b2.x[] xVarArr);

    public abstract ArrayList Q(i iVar, b2.x xVar, boolean z10);

    public long R(long j10, long j11, boolean z10) {
        return super.h(j10, j11);
    }

    public final q S() {
        ArrayDeque arrayDeque = this.R;
        return !arrayDeque.isEmpty() ? (q) arrayDeque.getLast() : this.P0;
    }

    public abstract j2.f T(o oVar, b2.x xVar, MediaCrypto mediaCrypto, float f7);

    public abstract void U(h2.h hVar);

    /* JADX WARN: Removed duplicated region for block: B:27:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V(o oVar, MediaCrypto mediaCrypto) {
        int i10;
        this.k0 = oVar;
        b2.x xVar = this.U;
        xVar.getClass();
        String str = oVar.a;
        float f7 = this.c0;
        b2.x[] xVarArr = this.s;
        xVarArr.getClass();
        float P = P(f7, xVar, xVarArr);
        if (P <= this.L) {
            P = -1.0f;
        }
        this.h.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        j2.f T = T(oVar, xVar, mediaCrypto, P);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            j2.l lVar = this.f;
            lVar.getClass();
            f0.i(T, lVar);
        }
        try {
            Trace.beginSection("createCodec:" + str);
            l d = this.J.d(T);
            this.d0 = d;
            this.s0 = d.j(new n2.u(this, 19));
            Trace.endSection();
            this.h.getClass();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!oVar.e(this.I, xVar)) {
                String c10 = b2.x.c(xVar);
                Locale locale = Locale.US;
                e2.a.l("MediaCodecRenderer", f1.o("Format exceeds selected codec's capabilities [", c10, ", ", str, "]"));
            }
            this.h0 = P;
            this.e0 = xVar;
            boolean z10 = false;
            if (i11 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
                String str2 = Build.MODEL;
                if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                    i10 = 2;
                    this.l0 = i10;
                    this.m0 = i11 != 29 && "c2.android.aac.decoder".equals(str);
                    this.n0 = i11 != 23 && "OMX.google.vorbis.decoder".equals(str);
                    String str3 = oVar.a;
                    if ((i11 <= 25 && "OMX.rk.video_decoder.avc".equals(str3)) || ((i11 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str3) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str3) || "OMX.bcm.vdec.avc.tunnel".equals(str3) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str3) || "OMX.bcm.vdec.hevc.tunnel".equals(str3) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str3))) || ("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && oVar.f))) {
                        z10 = true;
                    }
                    this.q0 = z10;
                    this.d0.getClass();
                    if (this.n == 2) {
                        this.h.getClass();
                        this.t0 = SystemClock.elapsedRealtime() + 1000;
                    }
                    this.O0.a++;
                    long j10 = elapsedRealtime2 - elapsedRealtime;
                    if (i11 >= 31 && !this.X0.isEmpty()) {
                        l lVar2 = this.d0;
                        lVar2.getClass();
                        lVar2.m(new ArrayList(this.X0));
                    }
                    b0(elapsedRealtime2, str, j10);
                }
            }
            if (i11 < 24 && ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str))) {
                String str4 = Build.DEVICE;
                if ("flounder".equals(str4) || "flounder_lte".equals(str4) || "grouper".equals(str4) || "tilapia".equals(str4)) {
                    i10 = 1;
                    this.l0 = i10;
                    this.m0 = i11 != 29 && "c2.android.aac.decoder".equals(str);
                    this.n0 = i11 != 23 && "OMX.google.vorbis.decoder".equals(str);
                    String str32 = oVar.a;
                    if (i11 <= 25) {
                        z10 = true;
                        this.q0 = z10;
                        this.d0.getClass();
                        if (this.n == 2) {
                        }
                        this.O0.a++;
                        long j102 = elapsedRealtime2 - elapsedRealtime;
                        if (i11 >= 31) {
                            l lVar22 = this.d0;
                            lVar22.getClass();
                            lVar22.m(new ArrayList(this.X0));
                        }
                        b0(elapsedRealtime2, str, j102);
                    }
                    z10 = true;
                    this.q0 = z10;
                    this.d0.getClass();
                    if (this.n == 2) {
                    }
                    this.O0.a++;
                    long j1022 = elapsedRealtime2 - elapsedRealtime;
                    if (i11 >= 31) {
                    }
                    b0(elapsedRealtime2, str, j1022);
                }
            }
            i10 = 0;
            this.l0 = i10;
            this.m0 = i11 != 29 && "c2.android.aac.decoder".equals(str);
            this.n0 = i11 != 23 && "OMX.google.vorbis.decoder".equals(str);
            String str322 = oVar.a;
            if (i11 <= 25) {
            }
            z10 = true;
            this.q0 = z10;
            this.d0.getClass();
            if (this.n == 2) {
            }
            this.O0.a++;
            long j10222 = elapsedRealtime2 - elapsedRealtime;
            if (i11 >= 31) {
            }
            b0(elapsedRealtime2, str, j10222);
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final boolean W(long j10, long j11) {
        if (j11 >= j10) {
            return false;
        }
        b2.x xVar = this.V;
        return xVar == null || !Objects.equals(xVar.s, "audio/opus") || j10 - j11 > 80000;
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
    public final void X() {
        b2.x xVar;
        MediaCrypto mediaCrypto;
        if (this.d0 != null || this.y0 || (xVar = this.U) == null) {
            return;
        }
        String str = xVar.s;
        boolean z10 = true;
        if (this.X == null && y0(xVar)) {
            this.y0 = false;
            p0();
            boolean equals = "audio/mp4a-latm".equals(str);
            g gVar = this.P;
            if (equals || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                gVar.getClass();
                gVar.w = 32;
            } else {
                gVar.getClass();
                gVar.w = 1;
            }
            this.y0 = true;
            return;
        }
        s0(this.X);
        if (this.W != null) {
            t6.p(this.Z == null);
            n2.g gVar2 = this.W;
            h2.b h = gVar2.h();
            if (n2.r.c && (h instanceof n2.r)) {
                int e = gVar2.e();
                if (e == 1) {
                    n2.f g10 = gVar2.g();
                    g10.getClass();
                    throw e(g10, this.U, false, g10.a);
                }
            }
            if (h != null) {
                if (h instanceof n2.r) {
                    n2.r rVar = (n2.r) h;
                    try {
                        this.Z = new MediaCrypto(rVar.a, rVar.b);
                    } catch (MediaCryptoException e7) {
                        throw e(e7, this.U, false, 6006);
                    }
                }
            }
        }
        try {
            n2.g gVar3 = this.W;
            if (gVar3 != null) {
                if (gVar3.e() != 3) {
                    if (this.W.e() == 4) {
                    }
                }
                n2.g gVar4 = this.W;
                str.getClass();
                if (gVar4.f(str)) {
                    Y(this.Z, z10);
                    mediaCrypto = this.Z;
                    if (mediaCrypto == null && this.d0 == null) {
                        mediaCrypto.release();
                        this.Z = null;
                        return;
                    }
                }
            }
            z10 = false;
            Y(this.Z, z10);
            mediaCrypto = this.Z;
            if (mediaCrypto == null) {
            }
        } catch (p e10) {
            throw e(e10, xVar, false, 4001);
        }
    }

    public final void Y(MediaCrypto mediaCrypto, boolean z10) {
        b2.x xVar = this.U;
        xVar.getClass();
        if (this.i0 == null) {
            try {
                List N = N(z10);
                this.i0 = new ArrayDeque();
                ArrayList arrayList = (ArrayList) N;
                if (!arrayList.isEmpty()) {
                    this.i0.add((o) arrayList.get(0));
                }
                this.j0 = null;
            } catch (t e) {
                throw new p(xVar, e, z10, -49998);
            }
        }
        if (this.i0.isEmpty()) {
            throw new p(xVar, null, z10, -49999);
        }
        ArrayDeque arrayDeque = this.i0;
        arrayDeque.getClass();
        while (this.d0 == null) {
            o oVar = (o) arrayDeque.peekFirst();
            oVar.getClass();
            if (!Z(xVar) || !w0(oVar)) {
                return;
            }
            try {
                V(oVar, mediaCrypto);
            } catch (Exception e7) {
                e2.a.m("MediaCodecRenderer", "Failed to initialize decoder: " + oVar, e7);
                arrayDeque.removeFirst();
                p pVar = new p("Decoder init failed: " + oVar.a + ", " + xVar, e7, xVar.s, z10, oVar, e7 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e7).getDiagnosticInfo() : null);
                a0(pVar);
                p pVar2 = this.j0;
                if (pVar2 == null) {
                    this.j0 = pVar;
                } else {
                    this.j0 = new p(pVar2.getMessage(), pVar2.getCause(), pVar2.a, pVar2.b, pVar2.c, pVar2.d);
                }
                if (arrayDeque.isEmpty()) {
                    throw this.j0;
                }
            }
        }
        this.i0 = null;
    }

    public boolean Z(b2.x xVar) {
        return true;
    }

    public abstract void a0(Exception exc);

    public abstract void b0(long j10, String str, long j11);

    public abstract void c0(i2.c cVar);

    @Override // i2.b, i2.o1
    public void d(int i10, Object obj) {
        int i11;
        if (i10 == 11) {
            m0 m0Var = (m0) obj;
            m0Var.getClass();
            this.Y = m0Var;
            return;
        }
        if (i10 != 21) {
            if (i10 == 22 && (i11 = Build.VERSION.SDK_INT) >= 29) {
                obj.getClass();
                y0 y0Var = (y0) obj;
                if (this.X0.equals(y0Var)) {
                    return;
                }
                if (i11 >= 31) {
                    HashSet hashSet = new HashSet(y0Var);
                    HashSet hashSet2 = new HashSet();
                    m2 it = this.X0.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (!hashSet.remove(str)) {
                            hashSet2.add(str);
                        }
                    }
                    l lVar = this.d0;
                    if (lVar != null) {
                        if (!hashSet2.isEmpty()) {
                            lVar.n(new ArrayList(hashSet2));
                        }
                        if (!hashSet.isEmpty()) {
                            lVar.m(new ArrayList(hashSet));
                        }
                    }
                }
                this.X0 = y0Var;
                return;
            }
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            obj.getClass();
            i2.c cVar = (i2.c) obj;
            this.V0 = cVar;
            l lVar2 = this.d0;
            if (lVar2 != null) {
                Bundle bundle = new Bundle();
                for (Map.Entry entry : cVar.a.entrySet()) {
                    String str2 = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value != null) {
                        if (value instanceof Integer) {
                            bundle.putInt(str2, ((Integer) value).intValue());
                        } else if (value instanceof Long) {
                            bundle.putLong(str2, ((Long) value).longValue());
                        } else if (value instanceof Float) {
                            bundle.putFloat(str2, ((Float) value).floatValue());
                        } else if (value instanceof String) {
                            bundle.putString(str2, (String) value);
                        } else if (value instanceof ByteBuffer) {
                            ByteBuffer byteBuffer = (ByteBuffer) value;
                            byte[] bArr = new byte[byteBuffer.remaining()];
                            byteBuffer.duplicate().get(bArr);
                            bundle.putByteArray(str2, bArr);
                        }
                    }
                }
                lVar2.setParameters(bundle);
            }
        }
    }

    public abstract void d0(String str);

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0182, code lost:
    
        if (J() == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0194, code lost:
    
        if (J() == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0061, code lost:
    
        if (j$.util.Objects.equals(r2, "video/av01") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x011c, code lost:
    
        if (r4.f(r2) != false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x014e, code lost:
    
        if (J() == false) goto L96;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i2.e e0(hf.b bVar) {
        b2.x xVar;
        int i10;
        h2.b h;
        h2.b h10;
        Pair b10;
        String str;
        boolean z10 = true;
        this.L0 = true;
        b2.x xVar2 = (b2.x) bVar.c;
        xVar2.getClass();
        String str2 = xVar2.s;
        if (str2 == null) {
            throw e(new IllegalArgumentException("Sample MIME type is null."), xVar2, false, 4005);
        }
        if (!str2.equals("video/av01") && !str2.equals("video/x-vnd.on2.vp9")) {
            if (str2.equals("video/dolby-vision")) {
                byte[] bArr = e2.g.a;
                if (str2.equals("video/dolby-vision") && (b10 = e2.g.b(xVar2)) != null) {
                    int intValue = ((Integer) b10.first).intValue();
                    if (intValue == 16 || intValue == 32 || intValue == 256) {
                        str = "video/hevc";
                    } else if (intValue == 512) {
                        str = "video/avc";
                    } else if (intValue == 1024) {
                        str = "video/av01";
                    }
                }
                str = null;
            }
            xVar = xVar2;
            n2.g gVar = (n2.g) bVar.b;
            i0.a.x(this.X, gVar);
            this.X = gVar;
            this.U = xVar;
            if (this.y0) {
                this.A0 = true;
                return null;
            }
            l lVar = this.d0;
            if (lVar == null) {
                this.i0 = null;
                X();
                return null;
            }
            o oVar = this.k0;
            oVar.getClass();
            b2.x xVar3 = this.e0;
            xVar3.getClass();
            n2.g gVar2 = this.W;
            n2.g gVar3 = this.X;
            if (gVar2 != gVar3) {
                if (gVar3 != null && gVar2 != null && (h = gVar3.h()) != null && (h10 = gVar2.h()) != null && h.getClass().equals(h10.getClass())) {
                    if (h instanceof n2.r) {
                        if (gVar3.c().equals(gVar2.c())) {
                            UUID uuid = b2.n.f;
                            if (!uuid.equals(gVar2.c()) && !uuid.equals(gVar3.c())) {
                                if (!oVar.f) {
                                    if (gVar3.e() != 2) {
                                        if (gVar3.e() == 3 || gVar3.e() == 4) {
                                            String str3 = xVar.s;
                                            str3.getClass();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (this.F0) {
                    this.D0 = 1;
                    this.E0 = 3;
                } else {
                    n0();
                    X();
                }
                return new i2.e(oVar.a, xVar3, xVar, 0, 128);
            }
            boolean z11 = this.X != this.W;
            i2.e H = H(oVar, xVar3, xVar, S().e);
            int i11 = H.d;
            if (i11 != 0) {
                if (i11 == 1) {
                    if (A0(xVar)) {
                        this.e0 = xVar;
                        if (!z11) {
                            if (this.F0) {
                                this.D0 = 1;
                                if (this.n0) {
                                    this.E0 = 3;
                                    i10 = 2;
                                } else {
                                    this.E0 = 1;
                                }
                            }
                        }
                    }
                    i10 = 16;
                } else if (i11 == 2) {
                    if (A0(xVar)) {
                        this.B0 = true;
                        this.C0 = 1;
                        int i12 = this.l0;
                        if (i12 != 2 && (i12 != 1 || xVar.z != xVar3.z || xVar.A != xVar3.A)) {
                            z10 = false;
                        }
                        this.o0 = z10;
                        this.e0 = xVar;
                        if (z11) {
                        }
                    }
                    i10 = 16;
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException();
                    }
                    if (A0(xVar)) {
                        this.e0 = xVar;
                        if (z11) {
                        }
                    }
                    i10 = 16;
                }
                return (i11 != 0 || (this.d0 == lVar && this.E0 != 3)) ? H : new i2.e(oVar.a, xVar3, xVar, 0, i10);
            }
            if (this.F0) {
                this.D0 = 1;
                this.E0 = 3;
            } else {
                n0();
                X();
            }
            i10 = 0;
            if (i11 != 0) {
            }
        }
        if (!xVar2.v.isEmpty()) {
            b2.w a2 = xVar2.a();
            a2.u = null;
            xVar = new b2.x(a2);
            n2.g gVar4 = (n2.g) bVar.b;
            i0.a.x(this.X, gVar4);
            this.X = gVar4;
            this.U = xVar;
            if (this.y0) {
            }
        }
        xVar = xVar2;
        n2.g gVar42 = (n2.g) bVar.b;
        i0.a.x(this.X, gVar42);
        this.X = gVar42;
        this.U = xVar;
        if (this.y0) {
        }
    }

    public abstract void f0(b2.x xVar, MediaFormat mediaFormat);

    @Override // i2.b
    public final long h(long j10, long j11) {
        return R(j10, j11, this.s0);
    }

    public void h0(long j10) {
        this.Q0 = j10;
        while (true) {
            ArrayDeque arrayDeque = this.R;
            if (arrayDeque.isEmpty() || j10 < ((q) arrayDeque.peek()).a) {
                return;
            }
            q qVar = (q) arrayDeque.poll();
            qVar.getClass();
            t0(qVar);
            i0();
        }
    }

    public abstract void i0();

    public final void k0() {
        int i10 = this.E0;
        if (i10 == 1) {
            M();
            return;
        }
        if (i10 == 2) {
            M();
            B0();
        } else if (i10 != 3) {
            this.K0 = true;
            o0();
        } else {
            n0();
            X();
        }
    }

    public abstract boolean l0(long j10, long j11, l lVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, b2.x xVar);

    public final boolean m0(int i10) {
        hf.b bVar = this.c;
        bVar.L();
        h2.h hVar = this.M;
        hVar.clear();
        int w9 = w(bVar, hVar, i10 | 4);
        if (w9 == -5) {
            e0(bVar);
            return true;
        }
        if (w9 != -4 || !hVar.isEndOfStream()) {
            return false;
        }
        this.J0 = true;
        k0();
        return false;
    }

    @Override // i2.b
    public void n() {
        this.U = null;
        t0(q.g);
        this.R.clear();
        if (this.y0) {
            this.y0 = false;
            p0();
        } else {
            if (this.d0 == null) {
                return;
            }
            if (x0()) {
                n0();
            } else if (v0()) {
                M();
            } else {
                this.T0 = true;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n0() {
        try {
            l lVar = this.d0;
            if (lVar != null) {
                lVar.release();
                this.O0.b++;
                o oVar = this.k0;
                oVar.getClass();
                d0(oVar.a);
            }
            this.d0 = null;
            try {
                MediaCrypto mediaCrypto = this.Z;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th2) {
            this.d0 = null;
            try {
                MediaCrypto mediaCrypto2 = this.Z;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
            }
        }
    }

    public abstract void o0();

    @Override // i2.b
    public void p(long j10, boolean z10, boolean z11) {
        ArrayDeque arrayDeque = this.R;
        if (!arrayDeque.isEmpty()) {
            this.P0 = (q) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (z11) {
            this.J0 = false;
            this.K0 = false;
            this.M0 = false;
            if (this.y0) {
                p0();
            } else if (this.d0 != null) {
                if (x0()) {
                    n0();
                    X();
                } else if (v0()) {
                    M();
                } else {
                    this.T0 = true;
                }
            }
            if (this.P0.d.p() > 0) {
                this.L0 = true;
            }
            this.P0.d.c();
            this.P0.e = false;
        }
    }

    public final void p0() {
        this.I0 = -9223372036854775807L;
        S().f = -9223372036854775807L;
        this.Q0 = -9223372036854775807L;
        this.A0 = false;
        this.P.clear();
        this.O.clear();
        this.z0 = false;
        a1 a1Var = this.S;
        a1Var.getClass();
        a1Var.a = c2.m.a;
        a1Var.c = 0;
        a1Var.b = 2;
    }

    public void q0() {
        this.u0 = -1;
        this.N.c = null;
        this.v0 = -1;
        this.w0 = null;
        this.I0 = -9223372036854775807L;
        S().f = -9223372036854775807L;
        this.Q0 = -9223372036854775807L;
        this.t0 = -9223372036854775807L;
        this.G0 = false;
        this.r0 = -9223372036854775807L;
        this.F0 = false;
        this.o0 = false;
        this.p0 = false;
        this.x0 = false;
        this.D0 = 0;
        this.E0 = 0;
        this.C0 = this.B0 ? 1 : 0;
        this.T0 = false;
        this.U0 = 0L;
    }

    public final void r0() {
        q0();
        this.N0 = null;
        this.i0 = null;
        this.k0 = null;
        this.e0 = null;
        this.f0 = null;
        this.g0 = false;
        this.H0 = false;
        this.h0 = -1.0f;
        this.l0 = 0;
        this.m0 = false;
        this.n0 = false;
        this.q0 = false;
        this.s0 = false;
        this.B0 = false;
        this.C0 = 0;
    }

    public final void s0(n2.g gVar) {
        i0.a.x(this.W, gVar);
        this.W = gVar;
    }

    public final void t0(q qVar) {
        this.P0 = qVar;
        if (qVar.c != -9223372036854775807L) {
            this.R0 = true;
            g0();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // i2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void u(b2.x[] xVarArr, long j10, long j11, g0 g0Var) {
        if (this.P0.c == -9223372036854775807L) {
            t0(new q(-9223372036854775807L, j10, j11));
            if (this.S0) {
                i0();
                return;
            }
            return;
        }
        ArrayDeque arrayDeque = this.R;
        if (arrayDeque.isEmpty()) {
            long j12 = this.I0;
            if (j12 != -9223372036854775807L) {
                long j13 = this.Q0;
                if (j13 != -9223372036854775807L) {
                }
            }
            t0(new q(-9223372036854775807L, j10, j11));
            if (this.P0.c != -9223372036854775807L) {
                i0();
                return;
            }
            return;
        }
        arrayDeque.add(new q(this.I0, j10, j11));
    }

    public boolean u0(h2.h hVar) {
        return false;
    }

    public boolean v0() {
        return true;
    }

    public boolean w0(o oVar) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0078 A[LOOP:1: B:33:0x0053->B:42:0x0078, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0079 A[EDGE_INSN: B:43:0x0079->B:44:? BREAK  A[LOOP:1: B:33:0x0053->B:42:0x0078], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0099 A[LOOP:2: B:45:0x0079->B:54:0x0099, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009a A[EDGE_INSN: B:55:0x009a->B:56:0x009a BREAK  A[LOOP:2: B:45:0x0079->B:54:0x0099], SYNTHETIC] */
    @Override // i2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void x(long j10, long j11) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (this.M0) {
            this.M0 = false;
            k0();
        }
        i2.l lVar = this.N0;
        if (lVar != null) {
            this.N0 = null;
            throw lVar;
        }
        try {
            if (this.K0) {
                o0();
                return;
            }
            if (this.U != null || m0(2)) {
                X();
                if (this.y0) {
                    Trace.beginSection("bypassRender");
                    while (G(j10, j11)) {
                    }
                    Trace.endSection();
                } else if (this.d0 != null) {
                    this.h.getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    Trace.beginSection("drainAndFeed");
                    while (K(j10, j11)) {
                        long j12 = this.a0;
                        if (j12 != -9223372036854775807L) {
                            this.h.getClass();
                            if (SystemClock.elapsedRealtime() - elapsedRealtime >= j12) {
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
                    while (L()) {
                        long j13 = this.a0;
                        if (j13 != -9223372036854775807L) {
                            this.h.getClass();
                            if (SystemClock.elapsedRealtime() - elapsedRealtime >= j13) {
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
                    this.O0.d += B(j10);
                    m0(1);
                }
                synchronized (this.O0) {
                }
            }
        } catch (MediaCodec.CryptoException e) {
            throw e(e, this.U, false, l0.z(e.getErrorCode()));
        } catch (IllegalStateException e7) {
            boolean z13 = e7 instanceof MediaCodec.CodecException;
            if (!z13) {
                StackTraceElement[] stackTrace = e7.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e7;
                }
            }
            a0(e7);
            if (z13 && ((MediaCodec.CodecException) e7).isRecoverable()) {
                z12 = true;
            }
            if (z12) {
                n0();
            }
            n I = I(e7, this.k0);
            throw e(I, this.U, z12, I.a == 1101 ? 4006 : 4003);
        }
    }

    public boolean x0() {
        int i10 = this.E0;
        if (i10 == 3 || ((this.m0 && !this.H0) || (this.n0 && this.G0))) {
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        try {
            B0();
            return false;
        } catch (i2.l e) {
            e2.a.m("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
            return true;
        }
    }

    public boolean y0(b2.x xVar) {
        return false;
    }

    public abstract int z0(i iVar, b2.x xVar);

    public void g0() {
    }

    public void j0(h2.h hVar) {
    }
}
