package t2;

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
import b8.qd;
import b8.zb;
import g2.k0;
import g2.n0;
import g9.g2;
import g9.t0;
import g9.z1;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import k2.l0;
import m2.w0;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.i9;
import org.telegram.ui.hc1;
import w2.g0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class r extends k2.b {
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
    public final j2.h N;
    public boolean N0;
    public final j2.h O;
    public k2.l O0;
    public final j2.h P;
    public k2.d P0;
    public final g Q;
    public q Q0;
    public final MediaCodec.BufferInfo R;
    public long R0;
    public final ArrayDeque S;
    public boolean S0;
    public final w0 T;
    public boolean T0;
    public final AtomicInteger U;
    public boolean U0;
    public d2.v V;
    public long V0;
    public d2.v W;
    public k2.c W0;
    public p2.g X;
    public k2.c X0;
    public p2.g Y;
    public t0 Y0;
    public l0 Z;
    public MediaCrypto a0;
    public final long b0;
    public float c0;
    public float d0;
    public l e0;
    public d2.v f0;
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
    public r(Context context, int i3, k kVar, float f10) {
        super(i3);
        i iVar = i.b;
        this.J = context.getApplicationContext();
        this.K = kVar;
        this.L = iVar;
        this.M = f10;
        this.U = new AtomicInteger();
        this.N = new j2.h(0, 0);
        this.O = new j2.h(0, 0);
        this.P = new j2.h(2, 0);
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
        w0 w0Var = new w0();
        w0Var.a = e2.m.a;
        w0Var.c = 0;
        w0Var.b = 2;
        this.T = w0Var;
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
        this.P0 = new k2.d();
        this.U0 = false;
        this.V0 = 0L;
        int i10 = t0.c;
        this.Y0 = z1.s;
        k2.c cVar = k2.c.b;
        this.W0 = cVar;
        this.X0 = cVar;
    }

    @Override // k2.b
    public void A(float f10, float f11) {
        this.c0 = f10;
        this.d0 = f11;
        A0(this.f0);
    }

    public final boolean A0(d2.v vVar) {
        if (this.e0 != null && this.F0 != 3 && this.n != 0) {
            float f10 = this.d0;
            vVar.getClass();
            d2.v[] vVarArr = this.s;
            vVarArr.getClass();
            float P = P(f10, vVar, vVarArr);
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
        p2.g gVar = this.Y;
        gVar.getClass();
        j2.b h = gVar.h();
        if (h instanceof p2.r) {
            try {
                MediaCrypto mediaCrypto = this.a0;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(((p2.r) h).b);
            } catch (MediaCryptoException e10) {
                throw e(e10, this.V, false, 6006);
            }
        }
        s0(this.Y);
        this.E0 = 0;
        this.F0 = 0;
    }

    @Override // k2.b
    public final int C(d2.v vVar) {
        try {
            return z0(this.L, vVar);
        } catch (t e10) {
            throw e(e10, vVar, false, 4002);
        }
    }

    public final void C0(long j10) {
        d2.v vVar = (d2.v) this.Q0.d.j(j10);
        if (vVar == null && this.S0 && this.g0 != null) {
            vVar = (d2.v) this.Q0.d.i();
        }
        if (vVar != null) {
            this.W = vVar;
        } else if (!this.h0 || this.W == null) {
            return;
        }
        d2.v vVar2 = this.W;
        vVar2.getClass();
        f0(vVar2, this.g0);
        this.h0 = false;
        this.S0 = false;
    }

    @Override // k2.b
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
    public final boolean G(long j10, long j11) {
        g gVar;
        int i3;
        int i10;
        int i11;
        zb.p(!this.L0);
        g gVar2 = this.Q;
        if (gVar2.f()) {
            ByteBuffer byteBuffer = gVar2.c;
            int i12 = this.w0;
            int i13 = gVar2.s;
            long j12 = gVar2.e;
            boolean W = W(this.x, gVar2.r);
            boolean isEndOfStream = gVar2.isEndOfStream();
            d2.v vVar = this.W;
            vVar.getClass();
            gVar = gVar2;
            if (l0(j10, j11, null, byteBuffer, i12, 0, i13, j12, W, isEndOfStream, vVar)) {
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
        j2.h hVar = this.P;
        if (z10) {
            zb.p(gVar.e(hVar));
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
        zb.p(!this.K0);
        tf.b bVar = this.c;
        bVar.q();
        hVar.clear();
        while (true) {
            hVar.clear();
            int w10 = w(bVar, hVar, r12);
            if (w10 == -5) {
                e0(bVar);
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
                    d2.v vVar2 = this.V;
                    vVar2.getClass();
                    this.W = vVar2;
                    if (Objects.equals(vVar2.s, "audio/opus") && !this.W.v.isEmpty()) {
                        byte[] bArr2 = (byte[]) this.W.v.get(r12);
                        int i14 = (bArr2[10] & 255) | ((bArr2[11] & 255) << 8);
                        d2.u a10 = this.W.a();
                        a10.M = i14;
                        this.W = new d2.v(a10);
                    }
                    f0(this.W, null);
                    this.M0 = r12;
                }
                hVar.c();
                d2.v vVar3 = this.W;
                if (vVar3 != null && Objects.equals(vVar3.s, "audio/opus")) {
                    if (hVar.hasSupplementalData()) {
                        hVar.a = this.W;
                        U(hVar);
                    }
                    if (this.x - hVar.e <= 80000) {
                        List list = this.W.v;
                        w0 w0Var = this.T;
                        w0Var.getClass();
                        hVar.c.getClass();
                        if (hVar.c.limit() - hVar.c.position() != 0) {
                            if (w0Var.b == 2 && (list.size() == 1 || list.size() == 3)) {
                                bArr = (byte[]) list.get(r12);
                            }
                            ByteBuffer byteBuffer2 = hVar.c;
                            int position = byteBuffer2.position();
                            int limit = byteBuffer2.limit();
                            int i15 = limit - position;
                            int i16 = (i15 + hs.e4) / hs.e4;
                            int i17 = i16 + 27 + i15;
                            if (w0Var.b == 2) {
                                i3 = bArr != null ? bArr.length + 28 : 47;
                                i17 = i3 + 44 + i17;
                            } else {
                                i3 = r12;
                            }
                            if (w0Var.a.capacity() < i17) {
                                w0Var.a = ByteBuffer.allocate(i17).order(ByteOrder.LITTLE_ENDIAN);
                            } else {
                                w0Var.a.clear();
                            }
                            ByteBuffer byteBuffer3 = w0Var.a;
                            if (w0Var.b == 2) {
                                if (bArr != null) {
                                    w0.a(byteBuffer3, 0L, 0, 1, true);
                                    i11 = limit;
                                    byteBuffer3.put(qd.a(bArr.length));
                                    byteBuffer3.put(bArr);
                                    i10 = position;
                                    byteBuffer3.putInt(22, n0.p(byteBuffer3.arrayOffset(), bArr.length + 28, 0, byteBuffer3.array()));
                                    byteBuffer3.position(bArr.length + 28);
                                } else {
                                    i10 = position;
                                    i11 = limit;
                                    byteBuffer3.put(w0.d);
                                }
                                byteBuffer3.put(w0.e);
                            } else {
                                i10 = position;
                                i11 = limit;
                            }
                            int e10 = w0Var.c + ((int) ((h2.o.e(byteBuffer2.get(0), byteBuffer2.limit() > 1 ? byteBuffer2.get(1) : (byte) 0) * 48000) / 1000000));
                            w0Var.c = e10;
                            w0.a(byteBuffer3, e10, w0Var.b, i16, false);
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
                            if (w0Var.b == 2) {
                                byteBuffer3.putInt(i3 + 66, n0.p(byteBuffer3.arrayOffset() + i3 + 44, byteBuffer3.limit() - byteBuffer3.position(), 0, byteBuffer3.array()));
                            } else {
                                byteBuffer3.putInt(22, n0.p(byteBuffer3.arrayOffset(), byteBuffer3.limit() - byteBuffer3.position(), 0, byteBuffer3.array()));
                            }
                            w0Var.b++;
                            w0Var.a = byteBuffer3;
                            hVar.clear();
                            hVar.b(w0Var.a.remaining());
                            hVar.c.put(w0Var.a);
                            hVar.c();
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
            gVar.c();
        }
        return gVar.f() || this.K0 || this.B0;
    }

    public abstract k2.e H(o oVar, d2.v vVar, d2.v vVar2, boolean z10);

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

    public final boolean K(long j10, long j11) {
        l lVar = this.e0;
        lVar.getClass();
        int i3 = this.w0;
        MediaCodec.BufferInfo bufferInfo = this.R;
        if (i3 < 0) {
            int i10 = lVar.i(bufferInfo);
            if (i10 < 0) {
                if (i10 != -2) {
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
                    k2.c cVar = new k2.c(k2.c.a(outputFormat, this.Y0).a);
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
                lVar.c(i10);
                return true;
            }
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                k0();
                return false;
            }
            this.w0 = i10;
            ByteBuffer outputBuffer = lVar.getOutputBuffer(i10);
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
        int i11 = this.w0;
        int i12 = bufferInfo.flags;
        long j15 = bufferInfo.presentationTimeUs;
        d2.v vVar = this.W;
        vVar.getClass();
        if (!l0(j10, j11, lVar, byteBuffer, i11, i12, 1, j15, z10, z11, vVar)) {
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
            int i3 = this.v0;
            j2.h hVar = this.O;
            if (i3 < 0) {
                int f10 = lVar.f();
                this.v0 = f10;
                if (f10 >= 0) {
                    hVar.c = lVar.getInputBuffer(f10);
                    hVar.clear();
                }
            }
            if (this.E0 == 1) {
                if (!this.r0) {
                    this.H0 = true;
                    lVar.b(this.v0, 0, 4, 0L);
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
                lVar.b(this.v0, 38, 0, 0L);
                this.v0 = -1;
                hVar.c = null;
                this.G0 = true;
                return true;
            }
            if (this.D0 == 1) {
                int i10 = 0;
                while (true) {
                    d2.v vVar = this.f0;
                    vVar.getClass();
                    if (i10 >= vVar.v.size()) {
                        break;
                    }
                    byte[] bArr = (byte[]) this.f0.v.get(i10);
                    ByteBuffer byteBuffer2 = hVar.c;
                    byteBuffer2.getClass();
                    byteBuffer2.put(bArr);
                    i10++;
                }
                this.D0 = 2;
            }
            ByteBuffer byteBuffer3 = hVar.c;
            byteBuffer3.getClass();
            int position = byteBuffer3.position();
            tf.b bVar = this.c;
            bVar.q();
            try {
                lVar.g(new hc1(24, this, bVar));
                int i11 = this.U.get();
                if (i11 == -3) {
                    if (k()) {
                        S().f = this.J0;
                        return false;
                    }
                } else {
                    if (i11 == -5) {
                        if (this.D0 == 2) {
                            hVar.clear();
                            this.D0 = 1;
                        }
                        e0(bVar);
                        return true;
                    }
                    if (!hVar.isEndOfStream()) {
                        if (this.G0 || hVar.isKeyFrame()) {
                            long j10 = hVar.e;
                            if (!u0(hVar)) {
                                boolean flag = hVar.getFlag(TLObject.FLAG_30);
                                if (flag) {
                                    j2.d dVar = hVar.b;
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
                                    k0 k0Var = S.d;
                                    d2.v vVar2 = this.V;
                                    vVar2.getClass();
                                    k0Var.a(vVar2, j10);
                                    S.e = true;
                                    this.M0 = false;
                                }
                                this.J0 = Math.max(this.J0, j10);
                                if (k() || hVar.isLastSample()) {
                                    S().f = this.J0;
                                }
                                hVar.c();
                                if (hVar.hasSupplementalData()) {
                                    U(hVar);
                                }
                                if (this.U0) {
                                    long j11 = this.J0;
                                    if (j10 <= j11) {
                                        this.V0 = (j11 - j10) + 1 + this.V0;
                                    }
                                    this.J0 = j10;
                                    this.U0 = false;
                                }
                                j0(hVar);
                                int O = O(hVar);
                                long j12 = j10 + this.V0;
                                if (flag) {
                                    lVar.a(this.v0, hVar.b, j12, O);
                                } else {
                                    int i12 = this.v0;
                                    ByteBuffer byteBuffer4 = hVar.c;
                                    byteBuffer4.getClass();
                                    lVar.b(i12, byteBuffer4.limit(), O, j12);
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
                        lVar.b(this.v0, 0, 4, 0L);
                        this.v0 = -1;
                        hVar.c = null;
                        return false;
                    }
                }
            } catch (j2.g e10) {
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
        d2.v vVar = this.V;
        vVar.getClass();
        i iVar = this.L;
        ArrayList Q = Q(iVar, vVar, z10);
        if (!Q.isEmpty() || !z10) {
            return Q;
        }
        ArrayList Q2 = Q(iVar, vVar, false);
        if (!Q2.isEmpty()) {
            g2.a.l("MediaCodecRenderer", "Drm session requires secure decoder for " + vVar.s + ", but no secure decoder available. Trying to proceed with " + Q2 + ".");
        }
        return Q2;
    }

    public int O(j2.h hVar) {
        return 0;
    }

    public abstract float P(float f10, d2.v vVar, d2.v[] vVarArr);

    public abstract ArrayList Q(i iVar, d2.v vVar, boolean z10);

    public long R(long j10, long j11, boolean z10) {
        return super.h(j10, j11);
    }

    public final q S() {
        ArrayDeque arrayDeque = this.S;
        return !arrayDeque.isEmpty() ? (q) arrayDeque.getLast() : this.Q0;
    }

    public abstract l2.e T(o oVar, d2.v vVar, MediaCrypto mediaCrypto, float f10);

    public abstract void U(j2.h hVar);

    /* JADX WARN: Removed duplicated region for block: B:27:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V(o oVar, MediaCrypto mediaCrypto) {
        int i3;
        this.l0 = oVar;
        d2.v vVar = this.V;
        vVar.getClass();
        String str = oVar.a;
        float f10 = this.d0;
        d2.v[] vVarArr = this.s;
        vVarArr.getClass();
        float P = P(f10, vVar, vVarArr);
        if (P <= this.M) {
            P = -1.0f;
        }
        this.h.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        l2.e T = T(oVar, vVar, mediaCrypto, P);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            l2.k kVar = this.f;
            kVar.getClass();
            cg.n0.i(T, kVar);
        }
        try {
            Trace.beginSection("createCodec:" + str);
            l L = this.K.L(T);
            this.e0 = L;
            this.t0 = L.k(new i9(this, 18));
            Trace.endSection();
            this.h.getClass();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!oVar.e(this.J, vVar)) {
                String c2 = d2.v.c(vVar);
                Locale locale = Locale.US;
                g2.a.l("MediaCodecRenderer", f1.q("Format exceeds selected codec's capabilities [", c2, ", ", str, "]"));
            }
            this.i0 = P;
            this.f0 = vVar;
            boolean z10 = false;
            if (i10 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
                String str2 = Build.MODEL;
                if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                    i3 = 2;
                    this.m0 = i3;
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
                    long j10 = elapsedRealtime2 - elapsedRealtime;
                    if (i10 >= 31 && !this.Y0.isEmpty()) {
                        l lVar = this.e0;
                        lVar.getClass();
                        lVar.m(new ArrayList(this.Y0));
                    }
                    b0(elapsedRealtime2, str, j10);
                }
            }
            if (i10 < 24 && ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str))) {
                String str4 = Build.DEVICE;
                if ("flounder".equals(str4) || "flounder_lte".equals(str4) || "grouper".equals(str4) || "tilapia".equals(str4)) {
                    i3 = 1;
                    this.m0 = i3;
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
                        long j102 = elapsedRealtime2 - elapsedRealtime;
                        if (i10 >= 31) {
                            l lVar2 = this.e0;
                            lVar2.getClass();
                            lVar2.m(new ArrayList(this.Y0));
                        }
                        b0(elapsedRealtime2, str, j102);
                    }
                    z10 = true;
                    this.r0 = z10;
                    this.e0.getClass();
                    if (this.n == 2) {
                    }
                    this.P0.a++;
                    long j1022 = elapsedRealtime2 - elapsedRealtime;
                    if (i10 >= 31) {
                    }
                    b0(elapsedRealtime2, str, j1022);
                }
            }
            i3 = 0;
            this.m0 = i3;
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
            long j10222 = elapsedRealtime2 - elapsedRealtime;
            if (i10 >= 31) {
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
        d2.v vVar = this.W;
        return vVar == null || !Objects.equals(vVar.s, "audio/opus") || j10 - j11 > 80000;
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
        d2.v vVar;
        MediaCrypto mediaCrypto;
        if (this.e0 != null || this.z0 || (vVar = this.V) == null) {
            return;
        }
        String str = vVar.s;
        boolean z10 = true;
        if (this.Y == null && y0(vVar)) {
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
            zb.p(this.a0 == null);
            p2.g gVar2 = this.X;
            j2.b h = gVar2.h();
            if (p2.r.c && (h instanceof p2.r)) {
                int d = gVar2.d();
                if (d == 1) {
                    p2.f g7 = gVar2.g();
                    g7.getClass();
                    throw e(g7, this.V, false, g7.a);
                }
            }
            if (h != null) {
                if (h instanceof p2.r) {
                    p2.r rVar = (p2.r) h;
                    try {
                        this.a0 = new MediaCrypto(rVar.a, rVar.b);
                    } catch (MediaCryptoException e10) {
                        throw e(e10, this.V, false, 6006);
                    }
                }
            }
        }
        try {
            p2.g gVar3 = this.X;
            if (gVar3 != null) {
                if (gVar3.d() != 3) {
                    if (this.X.d() == 4) {
                    }
                }
                p2.g gVar4 = this.X;
                str.getClass();
                if (gVar4.f(str)) {
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
        } catch (p e11) {
            throw e(e11, vVar, false, 4001);
        }
    }

    public final void Y(MediaCrypto mediaCrypto, boolean z10) {
        d2.v vVar = this.V;
        vVar.getClass();
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
                throw new p(vVar, e10, z10, -49998);
            }
        }
        if (this.j0.isEmpty()) {
            throw new p(vVar, null, z10, -49999);
        }
        ArrayDeque arrayDeque = this.j0;
        arrayDeque.getClass();
        while (this.e0 == null) {
            o oVar = (o) arrayDeque.peekFirst();
            oVar.getClass();
            if (!Z(vVar) || !w0(oVar)) {
                return;
            }
            try {
                V(oVar, mediaCrypto);
            } catch (Exception e11) {
                g2.a.m("MediaCodecRenderer", "Failed to initialize decoder: " + oVar, e11);
                arrayDeque.removeFirst();
                p pVar = new p("Decoder init failed: " + oVar.a + ", " + vVar, e11, vVar.s, z10, oVar, e11 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e11).getDiagnosticInfo() : null);
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

    public boolean Z(d2.v vVar) {
        return true;
    }

    public abstract void a0(Exception exc);

    public abstract void b0(long j10, String str, long j11);

    public abstract void c0(k2.c cVar);

    @Override // k2.b, k2.l1
    public void d(int i3, Object obj) {
        int i10;
        if (i3 == 11) {
            l0 l0Var = (l0) obj;
            l0Var.getClass();
            this.Z = l0Var;
            return;
        }
        if (i3 != 21) {
            if (i3 == 22 && (i10 = Build.VERSION.SDK_INT) >= 29) {
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
                            lVar.n(new ArrayList(hashSet2));
                        }
                        if (!hashSet.isEmpty()) {
                            lVar.m(new ArrayList(hashSet));
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
            k2.c cVar = (k2.c) obj;
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
    public k2.e e0(tf.b bVar) {
        d2.v vVar;
        int i3;
        j2.b h;
        j2.b h7;
        Pair b10;
        String str;
        boolean z10 = true;
        this.M0 = true;
        d2.v vVar2 = (d2.v) bVar.b;
        vVar2.getClass();
        String str2 = vVar2.s;
        if (str2 == null) {
            throw e(new IllegalArgumentException("Sample MIME type is null."), vVar2, false, 4005);
        }
        if (!str2.equals("video/av01") && !str2.equals("video/x-vnd.on2.vp9")) {
            if (str2.equals("video/dolby-vision")) {
                byte[] bArr = g2.h.a;
                if (str2.equals("video/dolby-vision") && (b10 = g2.h.b(vVar2)) != null) {
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
            vVar = vVar2;
            p2.g gVar = (p2.g) bVar.a;
            f1.E(this.Y, gVar);
            this.Y = gVar;
            this.V = vVar;
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
            d2.v vVar3 = this.f0;
            vVar3.getClass();
            p2.g gVar2 = this.X;
            p2.g gVar3 = this.Y;
            if (gVar2 != gVar3) {
                if (gVar3 != null && gVar2 != null && (h = gVar3.h()) != null && (h7 = gVar2.h()) != null && h.getClass().equals(h7.getClass())) {
                    if (h instanceof p2.r) {
                        if (gVar3.a().equals(gVar2.a())) {
                            UUID uuid = d2.m.f;
                            if (!uuid.equals(gVar2.a()) && !uuid.equals(gVar3.a())) {
                                if (!oVar.f) {
                                    if (gVar3.d() != 2) {
                                        if (gVar3.d() == 3 || gVar3.d() == 4) {
                                            String str3 = vVar.s;
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
                return new k2.e(oVar.a, vVar3, vVar, 0, 128);
            }
            boolean z11 = this.Y != this.X;
            k2.e H = H(oVar, vVar3, vVar, S().e);
            int i10 = H.d;
            if (i10 != 0) {
                if (i10 == 1) {
                    if (A0(vVar)) {
                        this.f0 = vVar;
                        if (!z11) {
                            if (this.G0) {
                                this.E0 = 1;
                                if (this.o0) {
                                    this.F0 = 3;
                                    i3 = 2;
                                } else {
                                    this.F0 = 1;
                                }
                            }
                        }
                    }
                    i3 = 16;
                } else if (i10 == 2) {
                    if (A0(vVar)) {
                        this.C0 = true;
                        this.D0 = 1;
                        int i11 = this.m0;
                        if (i11 != 2 && (i11 != 1 || vVar.z != vVar3.z || vVar.A != vVar3.A)) {
                            z10 = false;
                        }
                        this.p0 = z10;
                        this.f0 = vVar;
                        if (z11) {
                        }
                    }
                    i3 = 16;
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException();
                    }
                    if (A0(vVar)) {
                        this.f0 = vVar;
                        if (z11) {
                        }
                    }
                    i3 = 16;
                }
                return (i10 != 0 || (this.e0 == lVar && this.F0 != 3)) ? H : new k2.e(oVar.a, vVar3, vVar, 0, i3);
            }
            if (this.G0) {
                this.E0 = 1;
                this.F0 = 3;
            } else {
                n0();
                X();
            }
            i3 = 0;
            if (i10 != 0) {
            }
        }
        if (!vVar2.v.isEmpty()) {
            d2.u a10 = vVar2.a();
            a10.u = null;
            vVar = new d2.v(a10);
            p2.g gVar4 = (p2.g) bVar.a;
            f1.E(this.Y, gVar4);
            this.Y = gVar4;
            this.V = vVar;
            if (this.z0) {
            }
        }
        vVar = vVar2;
        p2.g gVar42 = (p2.g) bVar.a;
        f1.E(this.Y, gVar42);
        this.Y = gVar42;
        this.V = vVar;
        if (this.z0) {
        }
    }

    public abstract void f0(d2.v vVar, MediaFormat mediaFormat);

    @Override // k2.b
    public final long h(long j10, long j11) {
        return R(j10, j11, this.t0);
    }

    public void h0(long j10) {
        this.R0 = j10;
        while (true) {
            ArrayDeque arrayDeque = this.S;
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
        int i3 = this.F0;
        if (i3 == 1) {
            M();
            return;
        }
        if (i3 == 2) {
            M();
            B0();
        } else if (i3 != 3) {
            this.L0 = true;
            o0();
        } else {
            n0();
            X();
        }
    }

    public abstract boolean l0(long j10, long j11, l lVar, ByteBuffer byteBuffer, int i3, int i10, int i11, long j12, boolean z10, boolean z11, d2.v vVar);

    public final boolean m0(int i3) {
        tf.b bVar = this.c;
        bVar.q();
        j2.h hVar = this.N;
        hVar.clear();
        int w10 = w(bVar, hVar, i3 | 4);
        if (w10 == -5) {
            e0(bVar);
            return true;
        }
        if (w10 != -4 || !hVar.isEndOfStream()) {
            return false;
        }
        this.K0 = true;
        k0();
        return false;
    }

    @Override // k2.b
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

    @Override // k2.b
    public void p(long j10, boolean z10, boolean z11) {
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
        w0 w0Var = this.T;
        w0Var.getClass();
        w0Var.a = e2.m.a;
        w0Var.c = 0;
        w0Var.b = 2;
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

    public final void s0(p2.g gVar) {
        f1.E(this.X, gVar);
        this.X = gVar;
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
    @Override // k2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void u(d2.v[] vVarArr, long j10, long j11, g0 g0Var) {
        if (this.Q0.c == -9223372036854775807L) {
            t0(new q(-9223372036854775807L, j10, j11));
            if (this.T0) {
                i0();
                return;
            }
            return;
        }
        ArrayDeque arrayDeque = this.S;
        if (arrayDeque.isEmpty()) {
            long j12 = this.J0;
            if (j12 != -9223372036854775807L) {
                long j13 = this.R0;
                if (j13 != -9223372036854775807L) {
                }
            }
            t0(new q(-9223372036854775807L, j10, j11));
            if (this.Q0.c != -9223372036854775807L) {
                i0();
                return;
            }
            return;
        }
        arrayDeque.add(new q(this.J0, j10, j11));
    }

    public boolean u0(j2.h hVar) {
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
    @Override // k2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void x(long j10, long j11) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (this.N0) {
            this.N0 = false;
            k0();
        }
        k2.l lVar = this.O0;
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
                    while (G(j10, j11)) {
                    }
                    Trace.endSection();
                } else if (this.e0 != null) {
                    this.h.getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    Trace.beginSection("drainAndFeed");
                    while (K(j10, j11)) {
                        long j12 = this.b0;
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
                        long j13 = this.b0;
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
                    this.P0.d += B(j10);
                    m0(1);
                }
                synchronized (this.P0) {
                }
            }
        } catch (MediaCodec.CryptoException e10) {
            throw e(e10, this.V, false, n0.z(e10.getErrorCode()));
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
            throw e(I, this.V, z12, I.a == 1101 ? 4006 : 4003);
        }
    }

    public boolean x0() {
        int i3 = this.F0;
        if (i3 == 3 || ((this.n0 && !this.I0) || (this.o0 && this.H0))) {
            return true;
        }
        if (i3 != 2) {
            return false;
        }
        try {
            B0();
            return false;
        } catch (k2.l e10) {
            g2.a.m("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
            return true;
        }
    }

    public boolean y0(d2.v vVar) {
        return false;
    }

    public abstract int z0(i iVar, d2.v vVar);

    public void g0() {
    }

    public void j0(j2.h hVar) {
    }
}
