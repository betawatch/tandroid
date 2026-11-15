package u2;

import a8.b8;
import a8.ja;
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
import bg.n0;
import c8.k1;
import h2.j0;
import h2.l0;
import h9.g2;
import h9.t0;
import h9.z1;
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
import l2.i0;
import n2.v0;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Cells.y0;
import org.telegram.ui.Components.cf;
import org.telegram.ui.web.e1;
import x2.f0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public abstract class r extends l2.b {
    public static final byte[] Z0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public int D0;
    public int E0;
    public int F0;
    public boolean G0;
    public boolean H0;
    public boolean I0;
    public final Context J;
    public long J0;
    public final k K;
    public boolean K0;
    public final i L;
    public boolean L0;
    public final float M;
    public boolean M0;
    public final k2.h N;
    public boolean N0;
    public final k2.h O;
    public l2.l O0;
    public final k2.h P;
    public l2.d P0;
    public final g Q;
    public q Q0;
    public final MediaCodec.BufferInfo R;
    public long R0;
    public final ArrayDeque S;
    public boolean S0;
    public final v0 T;
    public boolean T0;
    public final AtomicInteger U;
    public boolean U0;
    public e2.u V;
    public long V0;
    public e2.u W;
    public l2.c W0;
    public q2.h X;
    public l2.c X0;
    public q2.h Y;
    public t0 Y0;
    public i0 Z;
    public MediaCrypto a0;
    public final long b0;
    public float c0;
    public float d0;
    public l e0;
    public e2.u f0;
    public MediaFormat g0;
    public boolean h0;
    public float i0;
    public ArrayDeque j0;
    public p k0;
    public o l0;
    public int m0;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public boolean q0;
    public boolean r0;
    public long s0;
    public boolean t0;
    public long u0;
    public int v0;
    public int w0;
    public ByteBuffer x0;
    public boolean y0;
    public boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, int i7, k kVar, float f10) {
        super(i7);
        i iVar = i.b;
        this.J = context.getApplicationContext();
        this.K = kVar;
        this.L = iVar;
        this.M = f10;
        this.U = new AtomicInteger();
        this.N = new k2.h(0, 0);
        this.O = new k2.h(0, 0);
        this.P = new k2.h(2, 0);
        g gVar = new g(2, 0);
        gVar.w = 32;
        this.Q = gVar;
        this.R = new MediaCodec.BufferInfo();
        this.c0 = 1.0f;
        this.d0 = 1.0f;
        this.b0 = -9223372036854775807L;
        this.S = new ArrayDeque();
        this.Q0 = q.g;
        gVar.b(0);
        gVar.c.order(ByteOrder.nativeOrder());
        v0 v0Var = new v0();
        v0Var.a = f2.m.a;
        v0Var.c = 0;
        v0Var.b = 2;
        this.T = v0Var;
        this.i0 = -1.0f;
        this.m0 = 0;
        this.D0 = 0;
        this.v0 = -1;
        this.w0 = -1;
        this.u0 = -9223372036854775807L;
        this.J0 = -9223372036854775807L;
        this.R0 = -9223372036854775807L;
        this.s0 = -9223372036854775807L;
        this.E0 = 0;
        this.F0 = 0;
        this.P0 = new l2.d();
        this.U0 = false;
        this.V0 = 0L;
        int i10 = t0.c;
        this.Y0 = z1.s;
        l2.c cVar = l2.c.b;
        this.W0 = cVar;
        this.X0 = cVar;
    }

    @Override // l2.b
    public void A(float f10, float f11) {
        this.c0 = f10;
        this.d0 = f11;
        A0(this.f0);
    }

    public final boolean A0(e2.u uVar) {
        if (this.e0 != null && this.F0 != 3 && this.n != 0) {
            float f10 = this.d0;
            uVar.getClass();
            e2.u[] uVarArr = this.s;
            uVarArr.getClass();
            float P = P(f10, uVar, uVarArr);
            float f11 = this.i0;
            if (f11 != P) {
                if (P == -1.0f) {
                    if (this.G0) {
                        this.E0 = 1;
                        this.F0 = 3;
                        return false;
                    }
                    n0();
                    X();
                    return false;
                }
                if (f11 != -1.0f || P > this.M) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", P);
                    l lVar = this.e0;
                    lVar.getClass();
                    lVar.setParameters(bundle);
                    this.i0 = P;
                }
            }
        }
        return true;
    }

    public final void B0() {
        q2.h hVar = this.Y;
        hVar.getClass();
        k2.b h = hVar.h();
        if (h instanceof q2.s) {
            try {
                MediaCrypto mediaCrypto = this.a0;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(((q2.s) h).b);
            } catch (MediaCryptoException e10) {
                throw d(e10, this.V, false, 6006);
            }
        }
        s0(this.Y);
        this.E0 = 0;
        this.F0 = 0;
    }

    @Override // l2.b
    public final int C(e2.u uVar) {
        try {
            return z0(this.L, uVar);
        } catch (t e10) {
            throw d(e10, uVar, false, 4002);
        }
    }

    public final void C0(long j3) {
        e2.u uVar = (e2.u) this.Q0.d.j(j3);
        if (uVar == null && this.S0 && this.g0 != null) {
            uVar = (e2.u) this.Q0.d.i();
        }
        if (uVar != null) {
            this.W = uVar;
        } else if (!this.h0 || this.W == null) {
            return;
        }
        e2.u uVar2 = this.W;
        uVar2.getClass();
        f0(uVar2, this.g0);
        this.h0 = false;
        this.S0 = false;
    }

    @Override // l2.b
    public final int D() {
        return 8;
    }

    public final void F(MediaFormat mediaFormat) {
        if (Build.VERSION.SDK_INT >= 29) {
            for (Map.Entry entry : this.W0.a.entrySet()) {
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
    
        r24.A0 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean G(long j3, long j10) {
        g gVar;
        int i7;
        int i10;
        int i11;
        ja.p(!this.L0);
        g gVar2 = this.Q;
        if (gVar2.f()) {
            ByteBuffer byteBuffer = gVar2.c;
            int i12 = this.w0;
            int i13 = gVar2.s;
            long j11 = gVar2.e;
            boolean W = W(this.x, gVar2.r);
            boolean isEndOfStream = gVar2.isEndOfStream();
            e2.u uVar = this.W;
            uVar.getClass();
            gVar = gVar2;
            if (l0(j3, j10, null, byteBuffer, i12, 0, i13, j11, W, isEndOfStream, uVar)) {
                h0(gVar.r);
                gVar.clear();
            }
        }
        gVar = gVar2;
        if (this.K0) {
            this.L0 = true;
            return false;
        }
        ?? r12 = 0;
        boolean z10 = this.A0;
        k2.h hVar = this.P;
        if (z10) {
            ja.p(gVar.e(hVar));
            this.A0 = false;
        }
        if (this.B0) {
            if (gVar.f()) {
                return true;
            }
            this.z0 = false;
            p0();
            this.B0 = false;
            X();
            if (!this.z0) {
                return false;
            }
        }
        ja.p(!this.K0);
        k8.a aVar = this.c;
        aVar.x0();
        hVar.clear();
        while (true) {
            hVar.clear();
            int w10 = w(aVar, hVar, r12);
            if (w10 == -5) {
                e0(aVar);
                break;
            }
            if (w10 != -4) {
                if (w10 != -3) {
                    throw new IllegalStateException();
                }
                if (k()) {
                    S().f = this.J0;
                }
            } else {
                if (hVar.isEndOfStream()) {
                    this.K0 = true;
                    S().f = this.J0;
                    break;
                }
                this.J0 = Math.max(this.J0, hVar.e);
                if (k() || this.O.isLastSample()) {
                    S().f = this.J0;
                }
                byte[] bArr = null;
                if (this.M0) {
                    e2.u uVar2 = this.V;
                    uVar2.getClass();
                    this.W = uVar2;
                    if (Objects.equals(uVar2.s, "audio/opus") && !this.W.v.isEmpty()) {
                        byte[] bArr2 = (byte[]) this.W.v.get(r12);
                        int i14 = (bArr2[10] & 255) | ((bArr2[11] & 255) << 8);
                        e2.t a10 = this.W.a();
                        a10.M = i14;
                        this.W = new e2.u(a10);
                    }
                    f0(this.W, null);
                    this.M0 = r12;
                }
                hVar.c();
                e2.u uVar3 = this.W;
                if (uVar3 != null && Objects.equals(uVar3.s, "audio/opus")) {
                    if (hVar.hasSupplementalData()) {
                        hVar.a = this.W;
                        U(hVar);
                    }
                    if (this.x - hVar.e <= 80000) {
                        List list = this.W.v;
                        v0 v0Var = this.T;
                        v0Var.getClass();
                        hVar.c.getClass();
                        if (hVar.c.limit() - hVar.c.position() != 0) {
                            if (v0Var.b == 2 && (list.size() == 1 || list.size() == 3)) {
                                bArr = (byte[]) list.get(r12);
                            }
                            ByteBuffer byteBuffer2 = hVar.c;
                            int position = byteBuffer2.position();
                            int limit = byteBuffer2.limit();
                            int i15 = limit - position;
                            int i16 = (i15 + ns.e4) / ns.e4;
                            int i17 = i16 + 27 + i15;
                            if (v0Var.b == 2) {
                                i7 = bArr != null ? bArr.length + 28 : 47;
                                i17 = i7 + 44 + i17;
                            } else {
                                i7 = r12;
                            }
                            if (v0Var.a.capacity() < i17) {
                                v0Var.a = ByteBuffer.allocate(i17).order(ByteOrder.LITTLE_ENDIAN);
                            } else {
                                v0Var.a.clear();
                            }
                            ByteBuffer byteBuffer3 = v0Var.a;
                            if (v0Var.b == 2) {
                                if (bArr != null) {
                                    v0.a(byteBuffer3, 0L, 0, 1, true);
                                    i11 = limit;
                                    byteBuffer3.put(k1.a(bArr.length));
                                    byteBuffer3.put(bArr);
                                    i10 = position;
                                    byteBuffer3.putInt(22, l0.p(byteBuffer3.arrayOffset(), bArr.length + 28, 0, byteBuffer3.array()));
                                    byteBuffer3.position(bArr.length + 28);
                                } else {
                                    i10 = position;
                                    i11 = limit;
                                    byteBuffer3.put(v0.d);
                                }
                                byteBuffer3.put(v0.e);
                            } else {
                                i10 = position;
                                i11 = limit;
                            }
                            int e10 = v0Var.c + ((int) ((i2.o.e(byteBuffer2.get(0), byteBuffer2.limit() > 1 ? byteBuffer2.get(1) : (byte) 0) * 48000) / 1000000));
                            v0Var.c = e10;
                            v0.a(byteBuffer3, e10, v0Var.b, i16, false);
                            for (int i18 = 0; i18 < i16; i18++) {
                                if (i15 >= 255) {
                                    byteBuffer3.put((byte) -1);
                                    i15 -= 255;
                                } else {
                                    byteBuffer3.put((byte) i15);
                                    i15 = 0;
                                }
                            }
                            int i19 = i11;
                            for (int i20 = i10; i20 < i19; i20++) {
                                byteBuffer3.put(byteBuffer2.get(i20));
                            }
                            byteBuffer2.position(byteBuffer2.limit());
                            byteBuffer3.flip();
                            if (v0Var.b == 2) {
                                byteBuffer3.putInt(i7 + 66, l0.p(byteBuffer3.arrayOffset() + i7 + 44, byteBuffer3.limit() - byteBuffer3.position(), 0, byteBuffer3.array()));
                            } else {
                                byteBuffer3.putInt(22, l0.p(byteBuffer3.arrayOffset(), byteBuffer3.limit() - byteBuffer3.position(), 0, byteBuffer3.array()));
                            }
                            v0Var.b++;
                            v0Var.a = byteBuffer3;
                            hVar.clear();
                            hVar.b(v0Var.a.remaining());
                            hVar.c.put(v0Var.a);
                            hVar.c();
                        }
                    }
                }
                if (gVar.f()) {
                    long j12 = this.x;
                    if (W(j12, gVar.r) != W(j12, hVar.e)) {
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
            gVar.c();
        }
        return gVar.f() || this.K0 || this.B0;
    }

    public abstract l2.e H(o oVar, e2.u uVar, e2.u uVar2, boolean z10);

    public n I(IllegalStateException illegalStateException, o oVar) {
        return new n(illegalStateException, oVar);
    }

    public final boolean J() {
        if (!this.G0) {
            B0();
            return true;
        }
        this.E0 = 1;
        if (this.o0) {
            this.F0 = 3;
            return false;
        }
        this.F0 = 2;
        return true;
    }

    public final boolean K(long j3, long j10) {
        l lVar = this.e0;
        lVar.getClass();
        int i7 = this.w0;
        MediaCodec.BufferInfo bufferInfo = this.R;
        if (i7 < 0) {
            int j11 = lVar.j(bufferInfo);
            if (j11 < 0) {
                if (j11 != -2) {
                    if (this.r0 && (this.K0 || this.E0 == 2)) {
                        k0();
                    }
                    long j12 = this.s0;
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
                this.I0 = true;
                l lVar2 = this.e0;
                lVar2.getClass();
                MediaFormat outputFormat = lVar2.getOutputFormat();
                if (this.m0 != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                    this.q0 = true;
                    return true;
                }
                if (Build.VERSION.SDK_INT >= 29 && !this.Y0.isEmpty()) {
                    l2.c cVar = new l2.c((HashMap) l2.c.a(outputFormat, this.Y0).b);
                    if (!cVar.equals(this.X0)) {
                        this.X0 = cVar;
                        c0(cVar);
                    }
                }
                this.g0 = outputFormat;
                this.h0 = true;
                return true;
            }
            bufferInfo.presentationTimeUs -= this.V0;
            if (this.q0) {
                this.q0 = false;
                lVar.f(j11);
                return true;
            }
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                k0();
                return false;
            }
            this.w0 = j11;
            ByteBuffer outputBuffer = lVar.getOutputBuffer(j11);
            this.x0 = outputBuffer;
            if (outputBuffer != null) {
                outputBuffer.position(bufferInfo.offset);
                this.x0.limit(bufferInfo.offset + bufferInfo.size);
            }
            C0(bufferInfo.presentationTimeUs);
        }
        boolean z10 = this.U0 || bufferInfo.presentationTimeUs < this.x;
        long j14 = this.Q0.f;
        boolean z11 = j14 != -9223372036854775807L && j14 <= bufferInfo.presentationTimeUs;
        this.y0 = z11;
        ByteBuffer byteBuffer = this.x0;
        int i10 = this.w0;
        int i11 = bufferInfo.flags;
        long j15 = bufferInfo.presentationTimeUs;
        e2.u uVar = this.W;
        uVar.getClass();
        if (!l0(j3, j10, lVar, byteBuffer, i10, i11, 1, j15, z10, z11, uVar)) {
            return false;
        }
        h0(bufferInfo.presentationTimeUs);
        boolean z12 = (bufferInfo.flags & 4) != 0;
        if (!z12 && this.H0 && this.y0) {
            this.h.getClass();
            this.s0 = System.currentTimeMillis();
        }
        this.w0 = -1;
        this.x0 = null;
        if (!z12) {
            return true;
        }
        k0();
        return false;
    }

    public final boolean L() {
        l lVar = this.e0;
        if (lVar != null && this.E0 != 2 && !this.K0) {
            int i7 = this.v0;
            k2.h hVar = this.O;
            if (i7 < 0) {
                int i10 = lVar.i();
                this.v0 = i10;
                if (i10 >= 0) {
                    hVar.c = lVar.getInputBuffer(i10);
                    hVar.clear();
                }
            }
            if (this.E0 == 1) {
                if (!this.r0) {
                    this.H0 = true;
                    lVar.d(this.v0, 0, 4, 0L);
                    this.v0 = -1;
                    hVar.c = null;
                }
                this.E0 = 2;
                return false;
            }
            if (this.p0) {
                this.p0 = false;
                ByteBuffer byteBuffer = hVar.c;
                byteBuffer.getClass();
                byteBuffer.put(Z0);
                lVar.d(this.v0, 38, 0, 0L);
                this.v0 = -1;
                hVar.c = null;
                this.G0 = true;
                return true;
            }
            if (this.D0 == 1) {
                int i11 = 0;
                while (true) {
                    e2.u uVar = this.f0;
                    uVar.getClass();
                    if (i11 >= uVar.v.size()) {
                        break;
                    }
                    byte[] bArr = (byte[]) this.f0.v.get(i11);
                    ByteBuffer byteBuffer2 = hVar.c;
                    byteBuffer2.getClass();
                    byteBuffer2.put(bArr);
                    i11++;
                }
                this.D0 = 2;
            }
            ByteBuffer byteBuffer3 = hVar.c;
            byteBuffer3.getClass();
            int position = byteBuffer3.position();
            k8.a aVar = this.c;
            aVar.x0();
            try {
                lVar.o(new e1(22, this, aVar));
                int i12 = this.U.get();
                if (i12 == -3) {
                    if (k()) {
                        S().f = this.J0;
                        return false;
                    }
                } else {
                    if (i12 == -5) {
                        if (this.D0 == 2) {
                            hVar.clear();
                            this.D0 = 1;
                        }
                        e0(aVar);
                        return true;
                    }
                    if (!hVar.isEndOfStream()) {
                        if (this.G0 || hVar.isKeyFrame()) {
                            long j3 = hVar.e;
                            if (!u0(hVar)) {
                                boolean flag = hVar.getFlag(TLObject.FLAG_30);
                                if (flag) {
                                    k2.d dVar = hVar.b;
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
                                if (this.M0) {
                                    q S = S();
                                    j0 j0Var = S.d;
                                    e2.u uVar2 = this.V;
                                    uVar2.getClass();
                                    j0Var.a(uVar2, j3);
                                    S.e = true;
                                    this.M0 = false;
                                }
                                this.J0 = Math.max(this.J0, j3);
                                if (k() || hVar.isLastSample()) {
                                    S().f = this.J0;
                                }
                                hVar.c();
                                if (hVar.hasSupplementalData()) {
                                    U(hVar);
                                }
                                if (this.U0) {
                                    long j10 = this.J0;
                                    if (j3 <= j10) {
                                        this.V0 = (j10 - j3) + 1 + this.V0;
                                    }
                                    this.J0 = j3;
                                    this.U0 = false;
                                }
                                j0(hVar);
                                int O = O(hVar);
                                long j11 = j3 + this.V0;
                                if (flag) {
                                    lVar.e(this.v0, hVar.b, j11, O);
                                } else {
                                    int i13 = this.v0;
                                    ByteBuffer byteBuffer4 = hVar.c;
                                    byteBuffer4.getClass();
                                    lVar.d(i13, byteBuffer4.limit(), O, j11);
                                }
                                this.v0 = -1;
                                hVar.c = null;
                                this.G0 = true;
                                this.D0 = 0;
                                this.P0.c++;
                                return true;
                            }
                        } else {
                            hVar.clear();
                            if (this.D0 == 2) {
                                this.D0 = 1;
                                return true;
                            }
                        }
                        return true;
                    }
                    S().f = this.J0;
                    if (this.D0 == 2) {
                        hVar.clear();
                        this.D0 = 1;
                    }
                    this.K0 = true;
                    if (!this.G0) {
                        k0();
                        return false;
                    }
                    if (!this.r0) {
                        this.H0 = true;
                        lVar.d(this.v0, 0, 4, 0L);
                        this.v0 = -1;
                        hVar.c = null;
                        return false;
                    }
                }
            } catch (k2.g e10) {
                a0(e10);
                m0(0);
                M();
                return true;
            }
        }
        return false;
    }

    public final void M() {
        try {
            l lVar = this.e0;
            lVar.getClass();
            lVar.flush();
        } finally {
            q0();
        }
    }

    public final List N(boolean z10) {
        e2.u uVar = this.V;
        uVar.getClass();
        i iVar = this.L;
        ArrayList Q = Q(iVar, uVar, z10);
        if (!Q.isEmpty() || !z10) {
            return Q;
        }
        ArrayList Q2 = Q(iVar, uVar, false);
        if (!Q2.isEmpty()) {
            h2.a.l("MediaCodecRenderer", "Drm session requires secure decoder for " + uVar.s + ", but no secure decoder available. Trying to proceed with " + Q2 + ".");
        }
        return Q2;
    }

    public int O(k2.h hVar) {
        return 0;
    }

    public abstract float P(float f10, e2.u uVar, e2.u[] uVarArr);

    public abstract ArrayList Q(i iVar, e2.u uVar, boolean z10);

    public long R(long j3, long j10, boolean z10) {
        return super.g(j3, j10);
    }

    public final q S() {
        ArrayDeque arrayDeque = this.S;
        return !arrayDeque.isEmpty() ? (q) arrayDeque.getLast() : this.Q0;
    }

    public abstract b8 T(o oVar, e2.u uVar, MediaCrypto mediaCrypto, float f10);

    public abstract void U(k2.h hVar);

    /* JADX WARN: Removed duplicated region for block: B:27:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0194  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V(o oVar, MediaCrypto mediaCrypto) {
        int i7;
        this.l0 = oVar;
        e2.u uVar = this.V;
        uVar.getClass();
        String str = oVar.a;
        float f10 = this.d0;
        e2.u[] uVarArr = this.s;
        uVarArr.getClass();
        float P = P(f10, uVar, uVarArr);
        if (P <= this.M) {
            P = -1.0f;
        }
        this.h.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        b8 T = T(oVar, uVar, mediaCrypto, P);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            m2.j jVar = this.f;
            jVar.getClass();
            n0.i(T, jVar);
        }
        try {
            Trace.beginSection("createCodec:" + str);
            l F = this.K.F(T);
            this.e0 = F;
            this.t0 = F.m(new cf(this));
            Trace.endSection();
            this.h.getClass();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!oVar.e(this.J, uVar)) {
                String c10 = e2.u.c(uVar);
                Locale locale = Locale.US;
                h2.a.l("MediaCodecRenderer", r.b.l("Format exceeds selected codec's capabilities [", c10, ", ", str, "]"));
            }
            this.i0 = P;
            this.f0 = uVar;
            boolean z10 = false;
            if (i10 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
                String str2 = Build.MODEL;
                if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                    i7 = 2;
                    this.m0 = i7;
                    this.n0 = i10 != 29 && "c2.android.aac.decoder".equals(str);
                    this.o0 = i10 != 23 && "OMX.google.vorbis.decoder".equals(str);
                    String str3 = oVar.a;
                    if ((i10 <= 25 && "OMX.rk.video_decoder.avc".equals(str3)) || ((i10 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str3) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str3) || "OMX.bcm.vdec.avc.tunnel".equals(str3) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str3) || "OMX.bcm.vdec.hevc.tunnel".equals(str3) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str3))) || ("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && oVar.f))) {
                        z10 = true;
                    }
                    this.r0 = z10;
                    this.e0.getClass();
                    if (this.n == 2) {
                        this.h.getClass();
                        this.u0 = SystemClock.elapsedRealtime() + 1000;
                    }
                    this.P0.a++;
                    long j3 = elapsedRealtime2 - elapsedRealtime;
                    if (i10 >= 31 && !this.Y0.isEmpty()) {
                        l lVar = this.e0;
                        lVar.getClass();
                        lVar.p(new ArrayList(this.Y0));
                    }
                    b0(elapsedRealtime2, str, j3);
                }
            }
            if (i10 < 24 && ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str))) {
                String str4 = Build.DEVICE;
                if ("flounder".equals(str4) || "flounder_lte".equals(str4) || "grouper".equals(str4) || "tilapia".equals(str4)) {
                    i7 = 1;
                    this.m0 = i7;
                    this.n0 = i10 != 29 && "c2.android.aac.decoder".equals(str);
                    this.o0 = i10 != 23 && "OMX.google.vorbis.decoder".equals(str);
                    String str32 = oVar.a;
                    if (i10 <= 25) {
                        z10 = true;
                        this.r0 = z10;
                        this.e0.getClass();
                        if (this.n == 2) {
                        }
                        this.P0.a++;
                        long j32 = elapsedRealtime2 - elapsedRealtime;
                        if (i10 >= 31) {
                            l lVar2 = this.e0;
                            lVar2.getClass();
                            lVar2.p(new ArrayList(this.Y0));
                        }
                        b0(elapsedRealtime2, str, j32);
                    }
                    z10 = true;
                    this.r0 = z10;
                    this.e0.getClass();
                    if (this.n == 2) {
                    }
                    this.P0.a++;
                    long j322 = elapsedRealtime2 - elapsedRealtime;
                    if (i10 >= 31) {
                    }
                    b0(elapsedRealtime2, str, j322);
                }
            }
            i7 = 0;
            this.m0 = i7;
            this.n0 = i10 != 29 && "c2.android.aac.decoder".equals(str);
            this.o0 = i10 != 23 && "OMX.google.vorbis.decoder".equals(str);
            String str322 = oVar.a;
            if (i10 <= 25) {
            }
            z10 = true;
            this.r0 = z10;
            this.e0.getClass();
            if (this.n == 2) {
            }
            this.P0.a++;
            long j3222 = elapsedRealtime2 - elapsedRealtime;
            if (i10 >= 31) {
            }
            b0(elapsedRealtime2, str, j3222);
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final boolean W(long j3, long j10) {
        if (j10 >= j3) {
            return false;
        }
        e2.u uVar = this.W;
        return uVar == null || !Objects.equals(uVar.s, "audio/opus") || j3 - j10 > 80000;
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
        e2.u uVar;
        MediaCrypto mediaCrypto;
        if (this.e0 != null || this.z0 || (uVar = this.V) == null) {
            return;
        }
        String str = uVar.s;
        boolean z10 = true;
        if (this.Y == null && y0(uVar)) {
            this.z0 = false;
            p0();
            boolean equals = "audio/mp4a-latm".equals(str);
            g gVar = this.Q;
            if (equals || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                gVar.getClass();
                gVar.w = 32;
            } else {
                gVar.getClass();
                gVar.w = 1;
            }
            this.z0 = true;
            return;
        }
        s0(this.Y);
        if (this.X != null) {
            ja.p(this.a0 == null);
            q2.h hVar = this.X;
            k2.b h = hVar.h();
            if (q2.s.c && (h instanceof q2.s)) {
                int e10 = hVar.e();
                if (e10 == 1) {
                    q2.g g10 = hVar.g();
                    g10.getClass();
                    throw d(g10, this.V, false, g10.a);
                }
            }
            if (h != null) {
                if (h instanceof q2.s) {
                    q2.s sVar = (q2.s) h;
                    try {
                        this.a0 = new MediaCrypto(sVar.a, sVar.b);
                    } catch (MediaCryptoException e11) {
                        throw d(e11, this.V, false, 6006);
                    }
                }
            }
        }
        try {
            q2.h hVar2 = this.X;
            if (hVar2 != null) {
                if (hVar2.e() != 3) {
                    if (this.X.e() == 4) {
                    }
                }
                q2.h hVar3 = this.X;
                str.getClass();
                if (hVar3.f(str)) {
                    Y(this.a0, z10);
                    mediaCrypto = this.a0;
                    if (mediaCrypto == null && this.e0 == null) {
                        mediaCrypto.release();
                        this.a0 = null;
                        return;
                    }
                }
            }
            z10 = false;
            Y(this.a0, z10);
            mediaCrypto = this.a0;
            if (mediaCrypto == null) {
            }
        } catch (p e12) {
            throw d(e12, uVar, false, 4001);
        }
    }

    public final void Y(MediaCrypto mediaCrypto, boolean z10) {
        e2.u uVar = this.V;
        uVar.getClass();
        if (this.j0 == null) {
            try {
                List N = N(z10);
                this.j0 = new ArrayDeque();
                ArrayList arrayList = (ArrayList) N;
                if (!arrayList.isEmpty()) {
                    this.j0.add((o) arrayList.get(0));
                }
                this.k0 = null;
            } catch (t e10) {
                throw new p(uVar, e10, z10, -49998);
            }
        }
        if (this.j0.isEmpty()) {
            throw new p(uVar, null, z10, -49999);
        }
        ArrayDeque arrayDeque = this.j0;
        arrayDeque.getClass();
        while (this.e0 == null) {
            o oVar = (o) arrayDeque.peekFirst();
            oVar.getClass();
            if (!Z(uVar) || !w0(oVar)) {
                return;
            }
            try {
                V(oVar, mediaCrypto);
            } catch (Exception e11) {
                h2.a.m("MediaCodecRenderer", "Failed to initialize decoder: " + oVar, e11);
                arrayDeque.removeFirst();
                p pVar = new p("Decoder init failed: " + oVar.a + ", " + uVar, e11, uVar.s, z10, oVar, e11 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e11).getDiagnosticInfo() : null);
                a0(pVar);
                p pVar2 = this.k0;
                if (pVar2 == null) {
                    this.k0 = pVar;
                } else {
                    this.k0 = new p(pVar2.getMessage(), pVar2.getCause(), pVar2.a, pVar2.b, pVar2.c, pVar2.d);
                }
                if (arrayDeque.isEmpty()) {
                    throw this.k0;
                }
            }
        }
        this.j0 = null;
    }

    public boolean Z(e2.u uVar) {
        return true;
    }

    public abstract void a0(Exception exc);

    public abstract void b0(long j3, String str, long j10);

    @Override // l2.b, l2.i1
    public void c(int i7, Object obj) {
        int i10;
        if (i7 == 11) {
            i0 i0Var = (i0) obj;
            i0Var.getClass();
            this.Z = i0Var;
            return;
        }
        if (i7 != 21) {
            if (i7 == 22 && (i10 = Build.VERSION.SDK_INT) >= 29) {
                obj.getClass();
                t0 t0Var = (t0) obj;
                if (this.Y0.equals(t0Var)) {
                    return;
                }
                if (i10 >= 31) {
                    HashSet hashSet = new HashSet(t0Var);
                    HashSet hashSet2 = new HashSet();
                    g2 it = this.Y0.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (!hashSet.remove(str)) {
                            hashSet2.add(str);
                        }
                    }
                    l lVar = this.e0;
                    if (lVar != null) {
                        if (!hashSet2.isEmpty()) {
                            lVar.q(new ArrayList(hashSet2));
                        }
                        if (!hashSet.isEmpty()) {
                            lVar.p(new ArrayList(hashSet));
                        }
                    }
                }
                this.Y0 = t0Var;
                return;
            }
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            obj.getClass();
            l2.c cVar = (l2.c) obj;
            this.W0 = cVar;
            l lVar2 = this.e0;
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

    public abstract void c0(l2.c cVar);

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
    public l2.e e0(k8.a aVar) {
        e2.u uVar;
        int i7;
        k2.b h;
        k2.b h7;
        Pair b10;
        String str;
        boolean z10 = true;
        this.M0 = true;
        e2.u uVar2 = (e2.u) aVar.c;
        uVar2.getClass();
        String str2 = uVar2.s;
        if (str2 == null) {
            throw d(new IllegalArgumentException("Sample MIME type is null."), uVar2, false, 4005);
        }
        if (!str2.equals("video/av01") && !str2.equals("video/x-vnd.on2.vp9")) {
            if (str2.equals("video/dolby-vision")) {
                byte[] bArr = h2.g.a;
                if (str2.equals("video/dolby-vision") && (b10 = h2.g.b(uVar2)) != null) {
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
            uVar = uVar2;
            q2.h hVar = (q2.h) aVar.b;
            y0.C(this.Y, hVar);
            this.Y = hVar;
            this.V = uVar;
            if (this.z0) {
                this.B0 = true;
                return null;
            }
            l lVar = this.e0;
            if (lVar == null) {
                this.j0 = null;
                X();
                return null;
            }
            o oVar = this.l0;
            oVar.getClass();
            e2.u uVar3 = this.f0;
            uVar3.getClass();
            q2.h hVar2 = this.X;
            q2.h hVar3 = this.Y;
            if (hVar2 != hVar3) {
                if (hVar3 != null && hVar2 != null && (h = hVar3.h()) != null && (h7 = hVar2.h()) != null && h.getClass().equals(h7.getClass())) {
                    if (h instanceof q2.s) {
                        if (hVar3.a().equals(hVar2.a())) {
                            UUID uuid = e2.l.f;
                            if (!uuid.equals(hVar2.a()) && !uuid.equals(hVar3.a())) {
                                if (!oVar.f) {
                                    if (hVar3.e() != 2) {
                                        if (hVar3.e() == 3 || hVar3.e() == 4) {
                                            String str3 = uVar.s;
                                            str3.getClass();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (this.G0) {
                    this.E0 = 1;
                    this.F0 = 3;
                } else {
                    n0();
                    X();
                }
                return new l2.e(oVar.a, uVar3, uVar, 0, 128);
            }
            boolean z11 = this.Y != this.X;
            l2.e H = H(oVar, uVar3, uVar, S().e);
            int i10 = H.d;
            if (i10 != 0) {
                if (i10 == 1) {
                    if (A0(uVar)) {
                        this.f0 = uVar;
                        if (!z11) {
                            if (this.G0) {
                                this.E0 = 1;
                                if (this.o0) {
                                    this.F0 = 3;
                                    i7 = 2;
                                } else {
                                    this.F0 = 1;
                                }
                            }
                        }
                    }
                    i7 = 16;
                } else if (i10 == 2) {
                    if (A0(uVar)) {
                        this.C0 = true;
                        this.D0 = 1;
                        int i11 = this.m0;
                        if (i11 != 2 && (i11 != 1 || uVar.z != uVar3.z || uVar.A != uVar3.A)) {
                            z10 = false;
                        }
                        this.p0 = z10;
                        this.f0 = uVar;
                        if (z11) {
                        }
                    }
                    i7 = 16;
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException();
                    }
                    if (A0(uVar)) {
                        this.f0 = uVar;
                        if (z11) {
                        }
                    }
                    i7 = 16;
                }
                return (i10 != 0 || (this.e0 == lVar && this.F0 != 3)) ? H : new l2.e(oVar.a, uVar3, uVar, 0, i7);
            }
            if (this.G0) {
                this.E0 = 1;
                this.F0 = 3;
            } else {
                n0();
                X();
            }
            i7 = 0;
            if (i10 != 0) {
            }
        }
        if (!uVar2.v.isEmpty()) {
            e2.t a10 = uVar2.a();
            a10.u = null;
            uVar = new e2.u(a10);
            q2.h hVar4 = (q2.h) aVar.b;
            y0.C(this.Y, hVar4);
            this.Y = hVar4;
            this.V = uVar;
            if (this.z0) {
            }
        }
        uVar = uVar2;
        q2.h hVar42 = (q2.h) aVar.b;
        y0.C(this.Y, hVar42);
        this.Y = hVar42;
        this.V = uVar;
        if (this.z0) {
        }
    }

    public abstract void f0(e2.u uVar, MediaFormat mediaFormat);

    @Override // l2.b
    public final long g(long j3, long j10) {
        return R(j3, j10, this.t0);
    }

    public void h0(long j3) {
        this.R0 = j3;
        while (true) {
            ArrayDeque arrayDeque = this.S;
            if (arrayDeque.isEmpty() || j3 < ((q) arrayDeque.peek()).a) {
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
        int i7 = this.F0;
        if (i7 == 1) {
            M();
            return;
        }
        if (i7 == 2) {
            M();
            B0();
        } else if (i7 != 3) {
            this.L0 = true;
            o0();
        } else {
            n0();
            X();
        }
    }

    public abstract boolean l0(long j3, long j10, l lVar, ByteBuffer byteBuffer, int i7, int i10, int i11, long j11, boolean z10, boolean z11, e2.u uVar);

    public final boolean m0(int i7) {
        k8.a aVar = this.c;
        aVar.x0();
        k2.h hVar = this.N;
        hVar.clear();
        int w10 = w(aVar, hVar, i7 | 4);
        if (w10 == -5) {
            e0(aVar);
            return true;
        }
        if (w10 != -4 || !hVar.isEndOfStream()) {
            return false;
        }
        this.K0 = true;
        k0();
        return false;
    }

    @Override // l2.b
    public void n() {
        this.V = null;
        t0(q.g);
        this.S.clear();
        if (this.z0) {
            this.z0 = false;
            p0();
        } else {
            if (this.e0 == null) {
                return;
            }
            if (x0()) {
                n0();
            } else if (v0()) {
                M();
            } else {
                this.U0 = true;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n0() {
        try {
            l lVar = this.e0;
            if (lVar != null) {
                lVar.release();
                this.P0.b++;
                o oVar = this.l0;
                oVar.getClass();
                d0(oVar.a);
            }
            this.e0 = null;
            try {
                MediaCrypto mediaCrypto = this.a0;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th2) {
            this.e0 = null;
            try {
                MediaCrypto mediaCrypto2 = this.a0;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
            }
        }
    }

    public abstract void o0();

    @Override // l2.b
    public void p(long j3, boolean z10, boolean z11) {
        ArrayDeque arrayDeque = this.S;
        if (!arrayDeque.isEmpty()) {
            this.Q0 = (q) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (z11) {
            this.K0 = false;
            this.L0 = false;
            this.N0 = false;
            if (this.z0) {
                p0();
            } else if (this.e0 != null) {
                if (x0()) {
                    n0();
                    X();
                } else if (v0()) {
                    M();
                } else {
                    this.U0 = true;
                }
            }
            if (this.Q0.d.p() > 0) {
                this.M0 = true;
            }
            this.Q0.d.c();
            this.Q0.e = false;
        }
    }

    public final void p0() {
        this.J0 = -9223372036854775807L;
        S().f = -9223372036854775807L;
        this.R0 = -9223372036854775807L;
        this.B0 = false;
        this.Q.clear();
        this.P.clear();
        this.A0 = false;
        v0 v0Var = this.T;
        v0Var.getClass();
        v0Var.a = f2.m.a;
        v0Var.c = 0;
        v0Var.b = 2;
    }

    public void q0() {
        this.v0 = -1;
        this.O.c = null;
        this.w0 = -1;
        this.x0 = null;
        this.J0 = -9223372036854775807L;
        S().f = -9223372036854775807L;
        this.R0 = -9223372036854775807L;
        this.u0 = -9223372036854775807L;
        this.H0 = false;
        this.s0 = -9223372036854775807L;
        this.G0 = false;
        this.p0 = false;
        this.q0 = false;
        this.y0 = false;
        this.E0 = 0;
        this.F0 = 0;
        this.D0 = this.C0 ? 1 : 0;
        this.U0 = false;
        this.V0 = 0L;
    }

    public final void r0() {
        q0();
        this.O0 = null;
        this.j0 = null;
        this.l0 = null;
        this.f0 = null;
        this.g0 = null;
        this.h0 = false;
        this.I0 = false;
        this.i0 = -1.0f;
        this.m0 = 0;
        this.n0 = false;
        this.o0 = false;
        this.r0 = false;
        this.t0 = false;
        this.C0 = false;
        this.D0 = 0;
    }

    public final void s0(q2.h hVar) {
        y0.C(this.X, hVar);
        this.X = hVar;
    }

    public final void t0(q qVar) {
        this.Q0 = qVar;
        if (qVar.c != -9223372036854775807L) {
            this.S0 = true;
            g0();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // l2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void u(e2.u[] uVarArr, long j3, long j10, f0 f0Var) {
        if (this.Q0.c == -9223372036854775807L) {
            t0(new q(-9223372036854775807L, j3, j10));
            if (this.T0) {
                i0();
                return;
            }
            return;
        }
        ArrayDeque arrayDeque = this.S;
        if (arrayDeque.isEmpty()) {
            long j11 = this.J0;
            if (j11 != -9223372036854775807L) {
                long j12 = this.R0;
                if (j12 != -9223372036854775807L) {
                }
            }
            t0(new q(-9223372036854775807L, j3, j10));
            if (this.Q0.c != -9223372036854775807L) {
                i0();
                return;
            }
            return;
        }
        arrayDeque.add(new q(this.J0, j3, j10));
    }

    public boolean u0(k2.h hVar) {
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
    @Override // l2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void x(long j3, long j10) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (this.N0) {
            this.N0 = false;
            k0();
        }
        l2.l lVar = this.O0;
        if (lVar != null) {
            this.O0 = null;
            throw lVar;
        }
        try {
            if (this.L0) {
                o0();
                return;
            }
            if (this.V != null || m0(2)) {
                X();
                if (this.z0) {
                    Trace.beginSection("bypassRender");
                    while (G(j3, j10)) {
                    }
                    Trace.endSection();
                } else if (this.e0 != null) {
                    this.h.getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    Trace.beginSection("drainAndFeed");
                    while (K(j3, j10)) {
                        long j11 = this.b0;
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
                    while (L()) {
                        long j12 = this.b0;
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
                    this.P0.d += B(j3);
                    m0(1);
                }
                synchronized (this.P0) {
                }
            }
        } catch (MediaCodec.CryptoException e10) {
            throw d(e10, this.V, false, l0.z(e10.getErrorCode()));
        } catch (IllegalStateException e11) {
            boolean z13 = e11 instanceof MediaCodec.CodecException;
            if (!z13) {
                StackTraceElement[] stackTrace = e11.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e11;
                }
            }
            a0(e11);
            if (z13 && ((MediaCodec.CodecException) e11).isRecoverable()) {
                z12 = true;
            }
            if (z12) {
                n0();
            }
            n I = I(e11, this.l0);
            throw d(I, this.V, z12, I.a == 1101 ? 4006 : 4003);
        }
    }

    public boolean x0() {
        int i7 = this.F0;
        if (i7 == 3 || ((this.n0 && !this.I0) || (this.o0 && this.H0))) {
            return true;
        }
        if (i7 != 2) {
            return false;
        }
        try {
            B0();
            return false;
        } catch (l2.l e10) {
            h2.a.m("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
            return true;
        }
    }

    public boolean y0(e2.u uVar) {
        return false;
    }

    public abstract int z0(i iVar, e2.u uVar);

    public void g0() {
    }

    public void j0(k2.h hVar) {
    }
}
