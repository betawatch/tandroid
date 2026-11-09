package u2;

import a8.b8;
import a8.ia;
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
import bg.o0;
import c8.g1;
import h2.j0;
import h2.m0;
import h9.a2;
import h9.h2;
import h9.t0;
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
import l2.l0;
import n2.u0;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.rt;
import x2.g0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public abstract class r extends l2.b {
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
    public final k2.h M;
    public boolean M0;
    public final k2.h N;
    public l2.l N0;
    public final k2.h O;
    public l2.d O0;
    public final g P;
    public q P0;
    public final MediaCodec.BufferInfo Q;
    public long Q0;
    public final ArrayDeque R;
    public boolean R0;
    public final u0 S;
    public boolean S0;
    public final AtomicInteger T;
    public boolean T0;
    public e2.u U;
    public long U0;
    public e2.u V;
    public l2.c V0;
    public q2.g W;
    public l2.c W0;
    public q2.g X;
    public t0 X0;
    public l0 Y;
    public MediaCrypto Z;
    public final long a0;
    public float b0;
    public float c0;
    public l d0;
    public e2.u e0;
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
    public r(Context context, int i7, k kVar, float f10) {
        super(i7);
        i iVar = i.b;
        this.I = context.getApplicationContext();
        this.J = kVar;
        this.K = iVar;
        this.L = f10;
        this.T = new AtomicInteger();
        this.M = new k2.h(0, 0);
        this.N = new k2.h(0, 0);
        this.O = new k2.h(2, 0);
        g gVar = new g(2, 0);
        gVar.w = 32;
        this.P = gVar;
        this.Q = new MediaCodec.BufferInfo();
        this.b0 = 1.0f;
        this.c0 = 1.0f;
        this.a0 = -9223372036854775807L;
        this.R = new ArrayDeque();
        this.P0 = q.g;
        gVar.b(0);
        gVar.c.order(ByteOrder.nativeOrder());
        u0 u0Var = new u0();
        u0Var.a = f2.n.a;
        u0Var.c = 0;
        u0Var.b = 2;
        this.S = u0Var;
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
        this.O0 = new l2.d();
        this.T0 = false;
        this.U0 = 0L;
        int i10 = t0.c;
        this.X0 = a2.s;
        l2.c cVar = l2.c.b;
        this.V0 = cVar;
        this.W0 = cVar;
    }

    @Override // l2.b
    public void A(float f10, float f11) {
        this.b0 = f10;
        this.c0 = f11;
        A0(this.e0);
    }

    public final boolean A0(e2.u uVar) {
        if (this.d0 != null && this.E0 != 3 && this.n != 0) {
            float f10 = this.c0;
            uVar.getClass();
            e2.u[] uVarArr = this.s;
            uVarArr.getClass();
            float P = P(f10, uVar, uVarArr);
            float f11 = this.h0;
            if (f11 != P) {
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
                if (f11 != -1.0f || P > this.L) {
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
        q2.g gVar = this.X;
        gVar.getClass();
        k2.b h = gVar.h();
        if (h instanceof q2.r) {
            try {
                MediaCrypto mediaCrypto = this.Z;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(((q2.r) h).b);
            } catch (MediaCryptoException e10) {
                throw d(e10, this.U, false, 6006);
            }
        }
        s0(this.X);
        this.D0 = 0;
        this.E0 = 0;
    }

    @Override // l2.b
    public final int C(e2.u uVar) {
        try {
            return z0(this.K, uVar);
        } catch (t e10) {
            throw d(e10, uVar, false, 4002);
        }
    }

    public final void C0(long j3) {
        e2.u uVar = (e2.u) this.P0.d.j(j3);
        if (uVar == null && this.R0 && this.f0 != null) {
            uVar = (e2.u) this.P0.d.i();
        }
        if (uVar != null) {
            this.V = uVar;
        } else if (!this.g0 || this.V == null) {
            return;
        }
        e2.u uVar2 = this.V;
        uVar2.getClass();
        f0(uVar2, this.f0);
        this.g0 = false;
        this.R0 = false;
    }

    @Override // l2.b
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
    public final boolean G(long j3, long j10) {
        g gVar;
        int i7;
        int i10;
        int i11;
        ia.p(!this.K0);
        g gVar2 = this.P;
        if (gVar2.f()) {
            ByteBuffer byteBuffer = gVar2.c;
            int i12 = this.v0;
            int i13 = gVar2.s;
            long j11 = gVar2.e;
            boolean W = W(this.x, gVar2.r);
            boolean isEndOfStream = gVar2.isEndOfStream();
            e2.u uVar = this.V;
            uVar.getClass();
            gVar = gVar2;
            if (l0(j3, j10, null, byteBuffer, i12, 0, i13, j11, W, isEndOfStream, uVar)) {
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
        boolean z9 = this.z0;
        k2.h hVar = this.O;
        if (z9) {
            ia.p(gVar.e(hVar));
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
        ia.p(!this.J0);
        wf.b bVar = this.c;
        bVar.A();
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
                    e2.u uVar2 = this.U;
                    uVar2.getClass();
                    this.V = uVar2;
                    if (Objects.equals(uVar2.s, "audio/opus") && !this.V.v.isEmpty()) {
                        byte[] bArr2 = (byte[]) this.V.v.get(r12);
                        int i14 = (bArr2[10] & 255) | ((bArr2[11] & 255) << 8);
                        e2.t a10 = this.V.a();
                        a10.M = i14;
                        this.V = new e2.u(a10);
                    }
                    f0(this.V, null);
                    this.L0 = r12;
                }
                hVar.c();
                e2.u uVar3 = this.V;
                if (uVar3 != null && Objects.equals(uVar3.s, "audio/opus")) {
                    if (hVar.hasSupplementalData()) {
                        hVar.a = this.V;
                        U(hVar);
                    }
                    if (this.x - hVar.e <= 80000) {
                        List list = this.V.v;
                        u0 u0Var = this.S;
                        u0Var.getClass();
                        hVar.c.getClass();
                        if (hVar.c.limit() - hVar.c.position() != 0) {
                            if (u0Var.b == 2 && (list.size() == 1 || list.size() == 3)) {
                                bArr = (byte[]) list.get(r12);
                            }
                            ByteBuffer byteBuffer2 = hVar.c;
                            int position = byteBuffer2.position();
                            int limit = byteBuffer2.limit();
                            int i15 = limit - position;
                            int i16 = (i15 + qs.e4) / qs.e4;
                            int i17 = i16 + 27 + i15;
                            if (u0Var.b == 2) {
                                i7 = bArr != null ? bArr.length + 28 : 47;
                                i17 = i7 + 44 + i17;
                            } else {
                                i7 = r12;
                            }
                            if (u0Var.a.capacity() < i17) {
                                u0Var.a = ByteBuffer.allocate(i17).order(ByteOrder.LITTLE_ENDIAN);
                            } else {
                                u0Var.a.clear();
                            }
                            ByteBuffer byteBuffer3 = u0Var.a;
                            if (u0Var.b == 2) {
                                if (bArr != null) {
                                    u0.a(byteBuffer3, 0L, 0, 1, true);
                                    i11 = limit;
                                    byteBuffer3.put(g1.a(bArr.length));
                                    byteBuffer3.put(bArr);
                                    i10 = position;
                                    byteBuffer3.putInt(22, m0.p(byteBuffer3.arrayOffset(), bArr.length + 28, 0, byteBuffer3.array()));
                                    byteBuffer3.position(bArr.length + 28);
                                } else {
                                    i10 = position;
                                    i11 = limit;
                                    byteBuffer3.put(u0.d);
                                }
                                byteBuffer3.put(u0.e);
                            } else {
                                i10 = position;
                                i11 = limit;
                            }
                            int e10 = u0Var.c + ((int) ((i2.o.e(byteBuffer2.get(0), byteBuffer2.limit() > 1 ? byteBuffer2.get(1) : (byte) 0) * 48000) / 1000000));
                            u0Var.c = e10;
                            u0.a(byteBuffer3, e10, u0Var.b, i16, false);
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
                            if (u0Var.b == 2) {
                                byteBuffer3.putInt(i7 + 66, m0.p(byteBuffer3.arrayOffset() + i7 + 44, byteBuffer3.limit() - byteBuffer3.position(), 0, byteBuffer3.array()));
                            } else {
                                byteBuffer3.putInt(22, m0.p(byteBuffer3.arrayOffset(), byteBuffer3.limit() - byteBuffer3.position(), 0, byteBuffer3.array()));
                            }
                            u0Var.b++;
                            u0Var.a = byteBuffer3;
                            hVar.clear();
                            hVar.b(u0Var.a.remaining());
                            hVar.c.put(u0Var.a);
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
        return gVar.f() || this.J0 || this.A0;
    }

    public abstract l2.e H(o oVar, e2.u uVar, e2.u uVar2, boolean z9);

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

    public final boolean K(long j3, long j10) {
        l lVar = this.d0;
        lVar.getClass();
        int i7 = this.v0;
        MediaCodec.BufferInfo bufferInfo = this.Q;
        if (i7 < 0) {
            int g10 = lVar.g(bufferInfo);
            if (g10 < 0) {
                if (g10 != -2) {
                    if (this.q0 && (this.J0 || this.D0 == 2)) {
                        k0();
                    }
                    long j11 = this.r0;
                    if (j11 != -9223372036854775807L) {
                        long j12 = j11 + 100;
                        this.h.getClass();
                        if (j12 < System.currentTimeMillis()) {
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
                    l2.c cVar = new l2.c((HashMap) l2.c.a(outputFormat, this.X0).b);
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
                lVar.c(g10);
                return true;
            }
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                k0();
                return false;
            }
            this.v0 = g10;
            ByteBuffer outputBuffer = lVar.getOutputBuffer(g10);
            this.w0 = outputBuffer;
            if (outputBuffer != null) {
                outputBuffer.position(bufferInfo.offset);
                this.w0.limit(bufferInfo.offset + bufferInfo.size);
            }
            C0(bufferInfo.presentationTimeUs);
        }
        boolean z9 = this.T0 || bufferInfo.presentationTimeUs < this.x;
        long j13 = this.P0.f;
        boolean z10 = j13 != -9223372036854775807L && j13 <= bufferInfo.presentationTimeUs;
        this.x0 = z10;
        ByteBuffer byteBuffer = this.w0;
        int i10 = this.v0;
        int i11 = bufferInfo.flags;
        long j14 = bufferInfo.presentationTimeUs;
        e2.u uVar = this.V;
        uVar.getClass();
        if (!l0(j3, j10, lVar, byteBuffer, i10, i11, 1, j14, z9, z10, uVar)) {
            return false;
        }
        h0(bufferInfo.presentationTimeUs);
        boolean z11 = (bufferInfo.flags & 4) != 0;
        if (!z11 && this.G0 && this.x0) {
            this.h.getClass();
            this.r0 = System.currentTimeMillis();
        }
        this.v0 = -1;
        this.w0 = null;
        if (!z11) {
            return true;
        }
        k0();
        return false;
    }

    public final boolean L() {
        l lVar = this.d0;
        if (lVar != null && this.D0 != 2 && !this.J0) {
            int i7 = this.u0;
            k2.h hVar = this.N;
            if (i7 < 0) {
                int f10 = lVar.f();
                this.u0 = f10;
                if (f10 >= 0) {
                    hVar.c = lVar.getInputBuffer(f10);
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
                int i10 = 0;
                while (true) {
                    e2.u uVar = this.e0;
                    uVar.getClass();
                    if (i10 >= uVar.v.size()) {
                        break;
                    }
                    byte[] bArr = (byte[]) this.e0.v.get(i10);
                    ByteBuffer byteBuffer2 = hVar.c;
                    byteBuffer2.getClass();
                    byteBuffer2.put(bArr);
                    i10++;
                }
                this.C0 = 2;
            }
            ByteBuffer byteBuffer3 = hVar.c;
            byteBuffer3.getClass();
            int position = byteBuffer3.position();
            wf.b bVar = this.c;
            bVar.A();
            try {
                lVar.j(new org.telegram.ui.web.s(28, this, bVar));
                int i11 = this.T.get();
                if (i11 == -3) {
                    if (k()) {
                        S().f = this.I0;
                        return false;
                    }
                } else {
                    if (i11 == -5) {
                        if (this.C0 == 2) {
                            hVar.clear();
                            this.C0 = 1;
                        }
                        e0(bVar);
                        return true;
                    }
                    if (!hVar.isEndOfStream()) {
                        if (this.F0 || hVar.isKeyFrame()) {
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
                                if (this.L0) {
                                    q S = S();
                                    j0 j0Var = S.d;
                                    e2.u uVar2 = this.U;
                                    uVar2.getClass();
                                    j0Var.a(uVar2, j3);
                                    S.e = true;
                                    this.L0 = false;
                                }
                                this.I0 = Math.max(this.I0, j3);
                                if (k() || hVar.isLastSample()) {
                                    S().f = this.I0;
                                }
                                hVar.c();
                                if (hVar.hasSupplementalData()) {
                                    U(hVar);
                                }
                                if (this.T0) {
                                    long j10 = this.I0;
                                    if (j3 <= j10) {
                                        this.U0 = (j10 - j3) + 1 + this.U0;
                                    }
                                    this.I0 = j3;
                                    this.T0 = false;
                                }
                                j0(hVar);
                                int O = O(hVar);
                                long j11 = j3 + this.U0;
                                if (flag) {
                                    lVar.b(this.u0, hVar.b, j11, O);
                                } else {
                                    int i12 = this.u0;
                                    ByteBuffer byteBuffer4 = hVar.c;
                                    byteBuffer4.getClass();
                                    lVar.a(i12, byteBuffer4.limit(), O, j11);
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
            l lVar = this.d0;
            lVar.getClass();
            lVar.flush();
        } finally {
            q0();
        }
    }

    public final List N(boolean z9) {
        e2.u uVar = this.U;
        uVar.getClass();
        i iVar = this.K;
        ArrayList Q = Q(iVar, uVar, z9);
        if (!Q.isEmpty() || !z9) {
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

    public abstract ArrayList Q(i iVar, e2.u uVar, boolean z9);

    public long R(long j3, long j10, boolean z9) {
        return super.g(j3, j10);
    }

    public final q S() {
        ArrayDeque arrayDeque = this.R;
        return !arrayDeque.isEmpty() ? (q) arrayDeque.getLast() : this.P0;
    }

    public abstract b8 T(o oVar, e2.u uVar, MediaCrypto mediaCrypto, float f10);

    public abstract void U(k2.h hVar);

    /* JADX WARN: Removed duplicated region for block: B:27:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V(o oVar, MediaCrypto mediaCrypto) {
        int i7;
        this.k0 = oVar;
        e2.u uVar = this.U;
        uVar.getClass();
        String str = oVar.a;
        float f10 = this.c0;
        e2.u[] uVarArr = this.s;
        uVarArr.getClass();
        float P = P(f10, uVar, uVarArr);
        if (P <= this.L) {
            P = -1.0f;
        }
        this.h.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        b8 T = T(oVar, uVar, mediaCrypto, P);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            m2.j jVar = this.f;
            jVar.getClass();
            o0.i(T, jVar);
        }
        try {
            Trace.beginSection("createCodec:" + str);
            l Y = this.J.Y(T);
            this.d0 = Y;
            this.s0 = Y.l(new rt(this, 18));
            Trace.endSection();
            this.h.getClass();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!oVar.e(this.I, uVar)) {
                String c10 = e2.u.c(uVar);
                Locale locale = Locale.US;
                h2.a.l("MediaCodecRenderer", f1.m("Format exceeds selected codec's capabilities [", c10, ", ", str, "]"));
            }
            this.h0 = P;
            this.e0 = uVar;
            boolean z9 = false;
            if (i10 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
                String str2 = Build.MODEL;
                if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                    i7 = 2;
                    this.l0 = i7;
                    this.m0 = i10 != 29 && "c2.android.aac.decoder".equals(str);
                    this.n0 = i10 != 23 && "OMX.google.vorbis.decoder".equals(str);
                    String str3 = oVar.a;
                    if ((i10 <= 25 && "OMX.rk.video_decoder.avc".equals(str3)) || ((i10 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str3) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str3) || "OMX.bcm.vdec.avc.tunnel".equals(str3) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str3) || "OMX.bcm.vdec.hevc.tunnel".equals(str3) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str3))) || ("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && oVar.f))) {
                        z9 = true;
                    }
                    this.q0 = z9;
                    this.d0.getClass();
                    if (this.n == 2) {
                        this.h.getClass();
                        this.t0 = SystemClock.elapsedRealtime() + 1000;
                    }
                    this.O0.a++;
                    long j3 = elapsedRealtime2 - elapsedRealtime;
                    if (i10 >= 31 && !this.X0.isEmpty()) {
                        l lVar = this.d0;
                        lVar.getClass();
                        lVar.m(new ArrayList(this.X0));
                    }
                    b0(elapsedRealtime2, str, j3);
                }
            }
            if (i10 < 24 && ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str))) {
                String str4 = Build.DEVICE;
                if ("flounder".equals(str4) || "flounder_lte".equals(str4) || "grouper".equals(str4) || "tilapia".equals(str4)) {
                    i7 = 1;
                    this.l0 = i7;
                    this.m0 = i10 != 29 && "c2.android.aac.decoder".equals(str);
                    this.n0 = i10 != 23 && "OMX.google.vorbis.decoder".equals(str);
                    String str32 = oVar.a;
                    if (i10 <= 25) {
                        z9 = true;
                        this.q0 = z9;
                        this.d0.getClass();
                        if (this.n == 2) {
                        }
                        this.O0.a++;
                        long j32 = elapsedRealtime2 - elapsedRealtime;
                        if (i10 >= 31) {
                            l lVar2 = this.d0;
                            lVar2.getClass();
                            lVar2.m(new ArrayList(this.X0));
                        }
                        b0(elapsedRealtime2, str, j32);
                    }
                    z9 = true;
                    this.q0 = z9;
                    this.d0.getClass();
                    if (this.n == 2) {
                    }
                    this.O0.a++;
                    long j322 = elapsedRealtime2 - elapsedRealtime;
                    if (i10 >= 31) {
                    }
                    b0(elapsedRealtime2, str, j322);
                }
            }
            i7 = 0;
            this.l0 = i7;
            this.m0 = i10 != 29 && "c2.android.aac.decoder".equals(str);
            this.n0 = i10 != 23 && "OMX.google.vorbis.decoder".equals(str);
            String str322 = oVar.a;
            if (i10 <= 25) {
            }
            z9 = true;
            this.q0 = z9;
            this.d0.getClass();
            if (this.n == 2) {
            }
            this.O0.a++;
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
        e2.u uVar = this.V;
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
        if (this.d0 != null || this.y0 || (uVar = this.U) == null) {
            return;
        }
        String str = uVar.s;
        boolean z9 = true;
        if (this.X == null && y0(uVar)) {
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
            ia.p(this.Z == null);
            q2.g gVar2 = this.W;
            k2.b h = gVar2.h();
            if (q2.r.c && (h instanceof q2.r)) {
                int e10 = gVar2.e();
                if (e10 == 1) {
                    q2.f g10 = gVar2.g();
                    g10.getClass();
                    throw d(g10, this.U, false, g10.a);
                }
            }
            if (h != null) {
                if (h instanceof q2.r) {
                    q2.r rVar = (q2.r) h;
                    try {
                        this.Z = new MediaCrypto(rVar.a, rVar.b);
                    } catch (MediaCryptoException e11) {
                        throw d(e11, this.U, false, 6006);
                    }
                }
            }
        }
        try {
            q2.g gVar3 = this.W;
            if (gVar3 != null) {
                if (gVar3.e() != 3) {
                    if (this.W.e() == 4) {
                    }
                }
                q2.g gVar4 = this.W;
                str.getClass();
                if (gVar4.f(str)) {
                    Y(this.Z, z9);
                    mediaCrypto = this.Z;
                    if (mediaCrypto == null && this.d0 == null) {
                        mediaCrypto.release();
                        this.Z = null;
                        return;
                    }
                }
            }
            z9 = false;
            Y(this.Z, z9);
            mediaCrypto = this.Z;
            if (mediaCrypto == null) {
            }
        } catch (p e12) {
            throw d(e12, uVar, false, 4001);
        }
    }

    public final void Y(MediaCrypto mediaCrypto, boolean z9) {
        e2.u uVar = this.U;
        uVar.getClass();
        if (this.i0 == null) {
            try {
                List N = N(z9);
                this.i0 = new ArrayDeque();
                ArrayList arrayList = (ArrayList) N;
                if (!arrayList.isEmpty()) {
                    this.i0.add((o) arrayList.get(0));
                }
                this.j0 = null;
            } catch (t e10) {
                throw new p(uVar, e10, z9, -49998);
            }
        }
        if (this.i0.isEmpty()) {
            throw new p(uVar, null, z9, -49999);
        }
        ArrayDeque arrayDeque = this.i0;
        arrayDeque.getClass();
        while (this.d0 == null) {
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
                p pVar = new p("Decoder init failed: " + oVar.a + ", " + uVar, e11, uVar.s, z9, oVar, e11 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e11).getDiagnosticInfo() : null);
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

    public boolean Z(e2.u uVar) {
        return true;
    }

    public abstract void a0(Exception exc);

    public abstract void b0(long j3, String str, long j10);

    @Override // l2.b, l2.m1
    public void c(int i7, Object obj) {
        int i10;
        if (i7 == 11) {
            l0 l0Var = (l0) obj;
            l0Var.getClass();
            this.Y = l0Var;
            return;
        }
        if (i7 != 21) {
            if (i7 == 22 && (i10 = Build.VERSION.SDK_INT) >= 29) {
                obj.getClass();
                t0 t0Var = (t0) obj;
                if (this.X0.equals(t0Var)) {
                    return;
                }
                if (i10 >= 31) {
                    HashSet hashSet = new HashSet(t0Var);
                    HashSet hashSet2 = new HashSet();
                    h2 it = this.X0.iterator();
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
                this.X0 = t0Var;
                return;
            }
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            obj.getClass();
            l2.c cVar = (l2.c) obj;
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
    public l2.e e0(wf.b bVar) {
        e2.u uVar;
        int i7;
        k2.b h;
        k2.b h7;
        Pair b10;
        String str;
        boolean z9 = true;
        this.L0 = true;
        e2.u uVar2 = (e2.u) bVar.c;
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
            q2.g gVar = (q2.g) bVar.b;
            f1.B(this.X, gVar);
            this.X = gVar;
            this.U = uVar;
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
            e2.u uVar3 = this.e0;
            uVar3.getClass();
            q2.g gVar2 = this.W;
            q2.g gVar3 = this.X;
            if (gVar2 != gVar3) {
                if (gVar3 != null && gVar2 != null && (h = gVar3.h()) != null && (h7 = gVar2.h()) != null && h.getClass().equals(h7.getClass())) {
                    if (h instanceof q2.r) {
                        if (gVar3.a().equals(gVar2.a())) {
                            UUID uuid = e2.l.f;
                            if (!uuid.equals(gVar2.a()) && !uuid.equals(gVar3.a())) {
                                if (!oVar.f) {
                                    if (gVar3.e() != 2) {
                                        if (gVar3.e() == 3 || gVar3.e() == 4) {
                                            String str3 = uVar.s;
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
                return new l2.e(oVar.a, uVar3, uVar, 0, 128);
            }
            boolean z10 = this.X != this.W;
            l2.e H = H(oVar, uVar3, uVar, S().e);
            int i10 = H.d;
            if (i10 != 0) {
                if (i10 == 1) {
                    if (A0(uVar)) {
                        this.e0 = uVar;
                        if (!z10) {
                            if (this.F0) {
                                this.D0 = 1;
                                if (this.n0) {
                                    this.E0 = 3;
                                    i7 = 2;
                                } else {
                                    this.E0 = 1;
                                }
                            }
                        }
                    }
                    i7 = 16;
                } else if (i10 == 2) {
                    if (A0(uVar)) {
                        this.B0 = true;
                        this.C0 = 1;
                        int i11 = this.l0;
                        if (i11 != 2 && (i11 != 1 || uVar.z != uVar3.z || uVar.A != uVar3.A)) {
                            z9 = false;
                        }
                        this.o0 = z9;
                        this.e0 = uVar;
                        if (z10) {
                        }
                    }
                    i7 = 16;
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException();
                    }
                    if (A0(uVar)) {
                        this.e0 = uVar;
                        if (z10) {
                        }
                    }
                    i7 = 16;
                }
                return (i10 != 0 || (this.d0 == lVar && this.E0 != 3)) ? H : new l2.e(oVar.a, uVar3, uVar, 0, i7);
            }
            if (this.F0) {
                this.D0 = 1;
                this.E0 = 3;
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
            q2.g gVar4 = (q2.g) bVar.b;
            f1.B(this.X, gVar4);
            this.X = gVar4;
            this.U = uVar;
            if (this.y0) {
            }
        }
        uVar = uVar2;
        q2.g gVar42 = (q2.g) bVar.b;
        f1.B(this.X, gVar42);
        this.X = gVar42;
        this.U = uVar;
        if (this.y0) {
        }
    }

    public abstract void f0(e2.u uVar, MediaFormat mediaFormat);

    @Override // l2.b
    public final long g(long j3, long j10) {
        return R(j3, j10, this.s0);
    }

    public void h0(long j3) {
        this.Q0 = j3;
        while (true) {
            ArrayDeque arrayDeque = this.R;
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
        int i7 = this.E0;
        if (i7 == 1) {
            M();
            return;
        }
        if (i7 == 2) {
            M();
            B0();
        } else if (i7 != 3) {
            this.K0 = true;
            o0();
        } else {
            n0();
            X();
        }
    }

    public abstract boolean l0(long j3, long j10, l lVar, ByteBuffer byteBuffer, int i7, int i10, int i11, long j11, boolean z9, boolean z10, e2.u uVar);

    public final boolean m0(int i7) {
        wf.b bVar = this.c;
        bVar.A();
        k2.h hVar = this.M;
        hVar.clear();
        int w10 = w(bVar, hVar, i7 | 4);
        if (w10 == -5) {
            e0(bVar);
            return true;
        }
        if (w10 != -4 || !hVar.isEndOfStream()) {
            return false;
        }
        this.J0 = true;
        k0();
        return false;
    }

    @Override // l2.b
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

    @Override // l2.b
    public void p(long j3, boolean z9, boolean z10) {
        ArrayDeque arrayDeque = this.R;
        if (!arrayDeque.isEmpty()) {
            this.P0 = (q) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (z10) {
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
        u0 u0Var = this.S;
        u0Var.getClass();
        u0Var.a = f2.n.a;
        u0Var.c = 0;
        u0Var.b = 2;
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

    public final void s0(q2.g gVar) {
        f1.B(this.W, gVar);
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
    @Override // l2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void u(e2.u[] uVarArr, long j3, long j10, g0 g0Var) {
        if (this.P0.c == -9223372036854775807L) {
            t0(new q(-9223372036854775807L, j3, j10));
            if (this.S0) {
                i0();
                return;
            }
            return;
        }
        ArrayDeque arrayDeque = this.R;
        if (arrayDeque.isEmpty()) {
            long j11 = this.I0;
            if (j11 != -9223372036854775807L) {
                long j12 = this.Q0;
                if (j12 != -9223372036854775807L) {
                }
            }
            t0(new q(-9223372036854775807L, j3, j10));
            if (this.P0.c != -9223372036854775807L) {
                i0();
                return;
            }
            return;
        }
        arrayDeque.add(new q(this.I0, j3, j10));
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
        boolean z9;
        boolean z10;
        boolean z11 = false;
        if (this.M0) {
            this.M0 = false;
            k0();
        }
        l2.l lVar = this.N0;
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
                    while (G(j3, j10)) {
                    }
                    Trace.endSection();
                } else if (this.d0 != null) {
                    this.h.getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    Trace.beginSection("drainAndFeed");
                    while (K(j3, j10)) {
                        long j11 = this.a0;
                        if (j11 != -9223372036854775807L) {
                            this.h.getClass();
                            if (SystemClock.elapsedRealtime() - elapsedRealtime >= j11) {
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
                    while (L()) {
                        long j12 = this.a0;
                        if (j12 != -9223372036854775807L) {
                            this.h.getClass();
                            if (SystemClock.elapsedRealtime() - elapsedRealtime >= j12) {
                                z9 = false;
                                if (z9) {
                                    break;
                                }
                            }
                        }
                        z9 = true;
                        if (z9) {
                        }
                    }
                    Trace.endSection();
                } else {
                    this.O0.d += B(j3);
                    m0(1);
                }
                synchronized (this.O0) {
                }
            }
        } catch (MediaCodec.CryptoException e10) {
            throw d(e10, this.U, false, m0.z(e10.getErrorCode()));
        } catch (IllegalStateException e11) {
            boolean z12 = e11 instanceof MediaCodec.CodecException;
            if (!z12) {
                StackTraceElement[] stackTrace = e11.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e11;
                }
            }
            a0(e11);
            if (z12 && ((MediaCodec.CodecException) e11).isRecoverable()) {
                z11 = true;
            }
            if (z11) {
                n0();
            }
            n I = I(e11, this.k0);
            throw d(I, this.U, z11, I.a == 1101 ? 4006 : 4003);
        }
    }

    public boolean x0() {
        int i7 = this.E0;
        if (i7 == 3 || ((this.m0 && !this.H0) || (this.n0 && this.G0))) {
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
