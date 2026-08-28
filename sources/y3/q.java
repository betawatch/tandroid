package y3;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import d5.d0;
import d5.f0;
import h3.t0;
import h3.u0;
import j3.r0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import m5.c0;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Cells.j2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class q extends h3.e {
    public static final byte[] D0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public t0 A;
    public long A0;
    public l3.e B;
    public long B0;
    public l3.e C;
    public int C0;
    public MediaCrypto D;
    public boolean E;
    public final long F;
    public float G;
    public float H;
    public k I;
    public t0 J;
    public MediaFormat K;
    public boolean L;
    public float M;
    public ArrayDeque N;
    public p O;
    public n P;
    public int Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final j a;
    public boolean a0;
    public final r b;
    public h b0;
    public final float c;
    public long c0;
    public final k3.i d;
    public int d0;
    public final k3.i e;
    public int e0;
    public final k3.i f;
    public ByteBuffer f0;
    public boolean g0;
    public final g h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public int m0;
    public final d0 n;
    public int n0;
    public int o0;
    public boolean p0;
    public boolean q0;
    public final ArrayList r;
    public boolean r0;
    public final MediaCodec.BufferInfo s;
    public long s0;
    public long t0;
    public boolean u0;
    public final long[] v;
    public boolean v0;
    public final long[] w;
    public boolean w0;
    public final long[] x;
    public boolean x0;
    public t0 y;
    public h3.n y0;
    public k3.f z0;

    public q(int i9, j jVar, float f10) {
        super(i9);
        this.a = jVar;
        this.b = r.b;
        this.c = f10;
        this.d = new k3.i(0, 0);
        this.e = new k3.i(0, 0);
        this.f = new k3.i(2, 0);
        g gVar = new g(2, 0);
        gVar.s = 32;
        this.h = gVar;
        d0 d0Var = new d0();
        d0Var.c = new long[10];
        d0Var.d = new Object[10];
        this.n = d0Var;
        this.r = new ArrayList();
        this.s = new MediaCodec.BufferInfo();
        this.G = 1.0f;
        this.H = 1.0f;
        this.F = -9223372036854775807L;
        this.v = new long[10];
        this.w = new long[10];
        this.x = new long[10];
        this.A0 = -9223372036854775807L;
        J(-9223372036854775807L);
        gVar.c(0);
        gVar.b.order(ByteOrder.nativeOrder());
        this.M = -1.0f;
        this.Q = 0;
        this.m0 = 0;
        this.d0 = -1;
        this.e0 = -1;
        this.c0 = -9223372036854775807L;
        this.s0 = -9223372036854775807L;
        this.t0 = -9223372036854775807L;
        this.n0 = 0;
        this.o0 = 0;
    }

    public abstract void A();

    public final void B() {
        int i9 = this.o0;
        if (i9 == 1) {
            h();
            return;
        }
        if (i9 == 2) {
            h();
            O();
        } else if (i9 != 3) {
            this.v0 = true;
            F();
        } else {
            E();
            r();
        }
    }

    public abstract boolean C(long j10, long j11, k kVar, ByteBuffer byteBuffer, int i9, int i10, int i11, long j12, boolean z10, boolean z11, t0 t0Var);

    public final boolean D(int i9) {
        u0 formatHolder = getFormatHolder();
        k3.i iVar = this.d;
        iVar.clear();
        int readSource = readSource(formatHolder, iVar, i9 | 4);
        if (readSource == -5) {
            w(formatHolder);
            return true;
        }
        if (readSource != -4 || !iVar.isEndOfStream()) {
            return false;
        }
        this.u0 = true;
        B();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void E() {
        try {
            k kVar = this.I;
            if (kVar != null) {
                kVar.release();
                this.z0.b++;
                v(this.P.a);
            }
            this.I = null;
            try {
                MediaCrypto mediaCrypto = this.D;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.I = null;
            try {
                MediaCrypto mediaCrypto2 = this.D;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    public void G() {
        this.d0 = -1;
        this.e.b = null;
        this.e0 = -1;
        this.f0 = null;
        this.c0 = -9223372036854775807L;
        this.q0 = false;
        this.p0 = false;
        this.Y = false;
        this.Z = false;
        this.g0 = false;
        this.h0 = false;
        this.r.clear();
        this.s0 = -9223372036854775807L;
        this.t0 = -9223372036854775807L;
        h hVar = this.b0;
        if (hVar != null) {
            hVar.a = 0L;
            hVar.b = 0L;
            hVar.c = false;
        }
        this.n0 = 0;
        this.o0 = 0;
        this.m0 = this.l0 ? 1 : 0;
    }

    public final void H() {
        G();
        this.y0 = null;
        this.b0 = null;
        this.N = null;
        this.P = null;
        this.J = null;
        this.K = null;
        this.L = false;
        this.r0 = false;
        this.M = -1.0f;
        this.Q = 0;
        this.R = false;
        this.S = false;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = false;
        this.a0 = false;
        this.l0 = false;
        this.m0 = 0;
        this.E = false;
    }

    public final void I(l3.e eVar) {
        r0.D(this.B, eVar);
        this.B = eVar;
    }

    public final void J(long j10) {
        this.B0 = j10;
        if (j10 != -9223372036854775807L) {
            y();
        }
    }

    public boolean K(n nVar) {
        return true;
    }

    public boolean L(t0 t0Var) {
        return false;
    }

    public abstract int M(r rVar, t0 t0Var);

    public final boolean N(t0 t0Var) {
        if (f0.a >= 23 && this.I != null && this.o0 != 3 && getState() != 0) {
            float l10 = l(this.H, getStreamFormats());
            float f10 = this.M;
            if (f10 != l10) {
                if (l10 == -1.0f) {
                    if (this.p0) {
                        this.n0 = 1;
                        this.o0 = 3;
                        return false;
                    }
                    E();
                    r();
                    return false;
                }
                if (f10 != -1.0f || l10 > this.c) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", l10);
                    this.I.setParameters(bundle);
                    this.M = l10;
                }
            }
        }
        return true;
    }

    public final void O() {
        try {
            MediaCrypto mediaCrypto = this.D;
            n(this.C).getClass();
            mediaCrypto.setMediaDrmSession(null);
            I(this.C);
            this.n0 = 0;
            this.o0 = 0;
        } catch (MediaCryptoException e10) {
            throw createRendererException(e10, this.y, 6006);
        }
    }

    public final void P(long j10) {
        Object obj;
        d0 d0Var = this.n;
        synchronized (d0Var) {
            obj = null;
            while (d0Var.b > 0 && j10 - ((long[]) d0Var.c)[d0Var.a] >= 0) {
                obj = d0Var.f();
            }
        }
        t0 t0Var = (t0) obj;
        if (t0Var == null && this.L) {
            t0Var = (t0) this.n.e();
        }
        if (t0Var != null) {
            this.A = t0Var;
        } else if (!this.L || this.A == null) {
            return;
        }
        x(this.A, this.K);
        this.L = false;
    }

    public final boolean a(long j10, long j11) {
        g gVar;
        d5.a.i(!this.v0);
        g gVar2 = this.h;
        int i9 = gVar2.r;
        if (i9 > 0) {
            gVar = gVar2;
            if (!C(j10, j11, null, gVar2.b, this.e0, 0, i9, gVar2.d, gVar2.isDecodeOnly(), gVar2.isEndOfStream(), this.A)) {
                return false;
            }
            z(gVar.n);
            gVar.clear();
        } else {
            gVar = gVar2;
        }
        if (this.u0) {
            this.v0 = true;
            return false;
        }
        boolean z10 = this.j0;
        k3.i iVar = this.f;
        if (z10) {
            d5.a.i(gVar.e(iVar));
            this.j0 = false;
        }
        if (this.k0) {
            if (gVar.r > 0) {
                return true;
            }
            d();
            this.k0 = false;
            r();
            if (!this.i0) {
                return false;
            }
        }
        d5.a.i(!this.u0);
        u0 formatHolder = getFormatHolder();
        iVar.clear();
        while (true) {
            iVar.clear();
            int readSource = readSource(formatHolder, iVar, 0);
            if (readSource == -5) {
                w(formatHolder);
                break;
            }
            if (readSource != -4) {
                if (readSource != -3) {
                    throw new IllegalStateException();
                }
            } else {
                if (iVar.isEndOfStream()) {
                    this.u0 = true;
                    break;
                }
                if (this.w0) {
                    t0 t0Var = this.y;
                    t0Var.getClass();
                    this.A = t0Var;
                    x(t0Var, null);
                    this.w0 = false;
                }
                iVar.d();
                if (!gVar.e(iVar)) {
                    this.j0 = true;
                    break;
                }
            }
        }
        if (gVar.r > 0) {
            gVar.d();
        }
        return gVar.r > 0 || this.u0 || this.k0;
    }

    public abstract k3.l b(n nVar, t0 t0Var, t0 t0Var2);

    public l c(IllegalStateException illegalStateException, n nVar) {
        return new l(illegalStateException, nVar);
    }

    public final void d() {
        this.k0 = false;
        this.h.clear();
        this.f.clear();
        this.j0 = false;
        this.i0 = false;
    }

    public final boolean e() {
        if (!this.p0) {
            O();
            return true;
        }
        this.n0 = 1;
        if (this.S || this.U) {
            this.o0 = 3;
            return false;
        }
        this.o0 = 2;
        return true;
    }

    public final boolean f(long j10, long j11) {
        MediaCodec.BufferInfo bufferInfo;
        boolean z10;
        boolean z11;
        boolean C;
        int d;
        boolean z12;
        int i9 = this.e0;
        MediaCodec.BufferInfo bufferInfo2 = this.s;
        if (i9 < 0) {
            if (this.V && this.q0) {
                try {
                    d = this.I.d(bufferInfo2);
                } catch (IllegalStateException unused) {
                    B();
                    if (this.v0) {
                        E();
                    }
                }
            } else {
                d = this.I.d(bufferInfo2);
            }
            if (d < 0) {
                if (d != -2) {
                    if (this.a0 && (this.u0 || this.n0 == 2)) {
                        B();
                        return false;
                    }
                    return false;
                }
                this.r0 = true;
                MediaFormat outputFormat = this.I.getOutputFormat();
                if (this.Q != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                    this.Z = true;
                    return true;
                }
                if (this.X) {
                    outputFormat.setInteger("channel-count", 1);
                }
                this.K = outputFormat;
                this.L = true;
                return true;
            }
            if (this.Z) {
                this.Z = false;
                this.I.releaseOutputBuffer(d, false);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                B();
                return false;
            }
            this.e0 = d;
            ByteBuffer outputBuffer = this.I.getOutputBuffer(d);
            this.f0 = outputBuffer;
            if (outputBuffer != null) {
                outputBuffer.position(bufferInfo2.offset);
                this.f0.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.W && bufferInfo2.presentationTimeUs == 0 && (bufferInfo2.flags & 4) != 0) {
                long j12 = this.s0;
                if (j12 != -9223372036854775807L) {
                    bufferInfo2.presentationTimeUs = j12;
                }
            }
            long j13 = bufferInfo2.presentationTimeUs;
            ArrayList arrayList = this.r;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    z12 = false;
                    break;
                }
                if (((Long) arrayList.get(i10)).longValue() == j13) {
                    arrayList.remove(i10);
                    z12 = true;
                    break;
                }
                i10++;
            }
            this.g0 = z12;
            long j14 = this.t0;
            long j15 = bufferInfo2.presentationTimeUs;
            this.h0 = j14 == j15;
            P(j15);
        }
        if (this.V && this.q0) {
            try {
                bufferInfo = bufferInfo2;
                z10 = false;
                z11 = true;
                try {
                    C = C(j10, j11, this.I, this.f0, this.e0, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.g0, this.h0, this.A);
                } catch (IllegalStateException unused2) {
                    B();
                    if (!this.v0) {
                        return z10;
                    }
                    E();
                    return z10;
                }
            } catch (IllegalStateException unused3) {
                z10 = false;
            }
        } else {
            bufferInfo = bufferInfo2;
            z10 = false;
            z11 = true;
            C = C(j10, j11, this.I, this.f0, this.e0, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, this.g0, this.h0, this.A);
        }
        if (!C) {
            return z10;
        }
        z(bufferInfo.presentationTimeUs);
        boolean z13 = (bufferInfo.flags & 4) != 0;
        this.e0 = -1;
        this.f0 = null;
        if (!z13) {
            return z11;
        }
        B();
        return z10;
    }

    public final boolean g() {
        q qVar;
        boolean z10;
        long j10;
        k kVar = this.I;
        if (kVar != null && this.n0 != 2 && !this.u0) {
            if (this.d0 < 0) {
                int c10 = kVar.c();
                this.d0 = c10;
                if (c10 >= 0) {
                    this.e.b = this.I.getInputBuffer(c10);
                    this.e.clear();
                }
            }
            if (this.n0 == 1) {
                if (!this.a0) {
                    this.q0 = true;
                    this.I.a(0L, this.d0, 0, 4);
                    this.d0 = -1;
                    this.e.b = null;
                }
                this.n0 = 2;
                return false;
            }
            if (this.Y) {
                this.Y = false;
                this.e.b.put(D0);
                this.I.a(0L, this.d0, 38, 0);
                this.d0 = -1;
                this.e.b = null;
                this.p0 = true;
                return true;
            }
            if (this.m0 == 1) {
                for (int i9 = 0; i9 < this.J.D.size(); i9++) {
                    this.e.b.put((byte[]) this.J.D.get(i9));
                }
                this.m0 = 2;
            }
            int position = this.e.b.position();
            u0 formatHolder = getFormatHolder();
            try {
                int readSource = readSource(formatHolder, this.e, 0);
                if (hasReadStreamToEnd()) {
                    this.t0 = this.s0;
                }
                if (readSource != -3) {
                    if (readSource == -5) {
                        if (this.m0 == 2) {
                            this.e.clear();
                            this.m0 = 1;
                        }
                        w(formatHolder);
                        return true;
                    }
                    if (!this.e.isEndOfStream()) {
                        if (this.p0 || this.e.isKeyFrame()) {
                            boolean flag = this.e.getFlag(TLObject.FLAG_30);
                            if (flag) {
                                k3.d dVar = this.e.a;
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
                            if (this.R && !flag) {
                                ByteBuffer byteBuffer = this.e.b;
                                int position2 = byteBuffer.position();
                                int i10 = 0;
                                int i11 = 0;
                                while (true) {
                                    int i12 = i10 + 1;
                                    if (i12 >= position2) {
                                        byteBuffer.clear();
                                        break;
                                    }
                                    int i13 = byteBuffer.get(i10) & 255;
                                    if (i11 == 3) {
                                        if (i13 == 1 && (byteBuffer.get(i12) & 31) == 7) {
                                            ByteBuffer duplicate = byteBuffer.duplicate();
                                            duplicate.position(i10 - 3);
                                            duplicate.limit(position2);
                                            byteBuffer.position(0);
                                            byteBuffer.put(duplicate);
                                            break;
                                        }
                                    } else if (i13 == 0) {
                                        i11++;
                                    }
                                    if (i13 != 0) {
                                        i11 = 0;
                                    }
                                    i10 = i12;
                                }
                                if (this.e.b.position() != 0) {
                                    this.R = false;
                                }
                            }
                            k3.i iVar = this.e;
                            long j11 = iVar.d;
                            h hVar = this.b0;
                            if (hVar != null) {
                                t0 t0Var = this.y;
                                if (hVar.b == 0) {
                                    hVar.a = j11;
                                }
                                if (!hVar.c) {
                                    ByteBuffer byteBuffer2 = iVar.b;
                                    byteBuffer2.getClass();
                                    int i14 = 0;
                                    for (int i15 = 0; i15 < 4; i15++) {
                                        i14 = (i14 << 8) | (byteBuffer2.get(i15) & 255);
                                    }
                                    int i16 = j3.b.i(i14);
                                    if (i16 == -1) {
                                        hVar.c = true;
                                        hVar.b = 0L;
                                        hVar.a = iVar.d;
                                        d5.a.K("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                                        j11 = iVar.d;
                                    } else {
                                        z10 = flag;
                                        long max = hVar.a + Math.max(0L, ((hVar.b - 529) * 1000000) / t0Var.P);
                                        hVar.b += i16;
                                        j11 = max;
                                        long j12 = this.s0;
                                        h hVar2 = this.b0;
                                        t0 t0Var2 = this.y;
                                        hVar2.getClass();
                                        long max2 = Math.max(j12, Math.max(0L, ((hVar2.b - 529) * 1000000) / t0Var2.P) + hVar2.a);
                                        qVar = this;
                                        qVar.s0 = max2;
                                        j10 = j11;
                                    }
                                }
                                z10 = flag;
                                long j122 = this.s0;
                                h hVar22 = this.b0;
                                t0 t0Var22 = this.y;
                                hVar22.getClass();
                                long max22 = Math.max(j122, Math.max(0L, ((hVar22.b - 529) * 1000000) / t0Var22.P) + hVar22.a);
                                qVar = this;
                                qVar.s0 = max22;
                                j10 = j11;
                            } else {
                                qVar = this;
                                z10 = flag;
                                j10 = j11;
                            }
                            if (qVar.e.isDecodeOnly()) {
                                qVar.r.add(Long.valueOf(j10));
                            }
                            if (qVar.w0) {
                                d0 d0Var = qVar.n;
                                t0 t0Var3 = qVar.y;
                                synchronized (d0Var) {
                                    if (d0Var.b > 0) {
                                        if (j10 <= ((long[]) d0Var.c)[((d0Var.a + r4) - 1) % ((Object[]) d0Var.d).length]) {
                                            d0Var.b();
                                        }
                                    }
                                    d0Var.c();
                                    int i17 = d0Var.a;
                                    int i18 = d0Var.b;
                                    Object[] objArr = (Object[]) d0Var.d;
                                    int length = (i17 + i18) % objArr.length;
                                    ((long[]) d0Var.c)[length] = j10;
                                    objArr[length] = t0Var3;
                                    d0Var.b = i18 + 1;
                                }
                                qVar.w0 = false;
                            }
                            qVar.s0 = Math.max(qVar.s0, j10);
                            qVar.e.d();
                            if (qVar.e.hasSupplementalData()) {
                                qVar.p(qVar.e);
                            }
                            qVar.onQueueInputBuffer(qVar.e);
                            try {
                                if (z10) {
                                    qVar.I.e(qVar.d0, qVar.e.a, j10);
                                } else {
                                    qVar.I.a(j10, qVar.d0, qVar.e.b.limit(), 0);
                                }
                                qVar.d0 = -1;
                                qVar.e.b = null;
                                qVar.p0 = true;
                                qVar.m0 = 0;
                                qVar.z0.c++;
                                return true;
                            } catch (MediaCodec.CryptoException e10) {
                                throw qVar.createRendererException(e10, qVar.y, f0.q(e10.getErrorCode()));
                            }
                        }
                        this.e.clear();
                        if (this.m0 == 2) {
                            this.m0 = 1;
                            return true;
                        }
                        return true;
                    }
                    if (this.m0 == 2) {
                        this.e.clear();
                        this.m0 = 1;
                    }
                    this.u0 = true;
                    if (!this.p0) {
                        B();
                        return false;
                    }
                    try {
                        if (!this.a0) {
                            this.q0 = true;
                            this.I.a(0L, this.d0, 0, 4);
                            this.d0 = -1;
                            this.e.b = null;
                            return false;
                        }
                    } catch (MediaCodec.CryptoException e11) {
                        throw createRendererException(e11, this.y, f0.q(e11.getErrorCode()));
                    }
                }
            } catch (k3.h e12) {
                t(e12);
                D(0);
                h();
                return true;
            }
        }
        return false;
    }

    public final void h() {
        try {
            this.I.flush();
        } finally {
            G();
        }
    }

    public final boolean i() {
        if (this.I == null) {
            return false;
        }
        int i9 = this.o0;
        if (i9 == 3 || this.S || ((this.T && !this.r0) || (this.U && this.q0))) {
            E();
            return true;
        }
        if (i9 == 2) {
            int i10 = f0.a;
            d5.a.i(i10 >= 23);
            if (i10 >= 23) {
                try {
                    O();
                } catch (h3.n e10) {
                    d5.a.L("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
                    E();
                    return true;
                }
            }
        }
        h();
        return false;
    }

    @Override // h3.e
    public boolean isEnded() {
        return this.v0;
    }

    @Override // h3.e
    public boolean isReady() {
        if (this.y == null) {
            return false;
        }
        if (isSourceReady() || this.e0 >= 0) {
            return true;
        }
        return this.c0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.c0;
    }

    public final List j(boolean z10) {
        t0 t0Var = this.y;
        r rVar = this.b;
        ArrayList m10 = m(rVar, t0Var, z10);
        if (!m10.isEmpty() || !z10) {
            return m10;
        }
        ArrayList m11 = m(rVar, this.y, false);
        if (!m11.isEmpty()) {
            d5.a.K("MediaCodecRenderer", "Drm session requires secure decoder for " + this.y.B + ", but no secure decoder available. Trying to proceed with " + m11 + ".");
        }
        return m11;
    }

    public boolean k() {
        return false;
    }

    public abstract float l(float f10, t0[] t0VarArr);

    public abstract ArrayList m(r rVar, t0 t0Var, boolean z10);

    public final l3.j n(l3.e eVar) {
        k3.b y10 = eVar.y();
        if (y10 == null || (y10 instanceof l3.j)) {
            return (l3.j) y10;
        }
        throw createRendererException(new IllegalArgumentException("Expecting FrameworkCryptoConfig but found: " + y10), this.y, 6001);
    }

    public abstract i o(n nVar, t0 t0Var, MediaCrypto mediaCrypto, float f10);

    @Override // h3.e
    public void onDisabled() {
        this.y = null;
        this.A0 = -9223372036854775807L;
        J(-9223372036854775807L);
        this.C0 = 0;
        i();
    }

    @Override // h3.e
    public void onPositionReset(long j10, boolean z10) {
        int i9;
        this.u0 = false;
        this.v0 = false;
        this.x0 = false;
        if (this.i0) {
            this.h.clear();
            this.f.clear();
            this.j0 = false;
        } else if (i()) {
            r();
        }
        d0 d0Var = this.n;
        synchronized (d0Var) {
            i9 = d0Var.b;
        }
        if (i9 > 0) {
            this.w0 = true;
        }
        this.n.b();
        int i10 = this.C0;
        if (i10 != 0) {
            J(this.w[i10 - 1]);
            this.A0 = this.v[this.C0 - 1];
            this.C0 = 0;
        }
    }

    public abstract void onQueueInputBuffer(k3.i iVar);

    @Override // h3.e
    public void onReset() {
        try {
            d();
            E();
        } finally {
            r0.D(this.C, null);
            this.C = null;
        }
    }

    @Override // h3.e
    public final void onStreamChanged(t0[] t0VarArr, long j10, long j11) {
        if (this.B0 == -9223372036854775807L) {
            d5.a.i(this.A0 == -9223372036854775807L);
            this.A0 = j10;
            J(j11);
            return;
        }
        int i9 = this.C0;
        long[] jArr = this.w;
        if (i9 == jArr.length) {
            d5.a.K("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + jArr[this.C0 - 1]);
        } else {
            this.C0 = i9 + 1;
        }
        int i10 = this.C0;
        this.v[i10 - 1] = j10;
        jArr[i10 - 1] = j11;
        this.x[i10 - 1] = this.s0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x039d, code lost:
    
        if ("stvm8".equals(r7) == false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x03ad, code lost:
    
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r6) == false) goto L198;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x033b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0426  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(n nVar, MediaCrypto mediaCrypto) {
        long j10;
        float f10;
        long j11;
        int i9;
        boolean z10;
        boolean z11;
        String str;
        char c10;
        String sb2;
        l3.c cVar;
        String str2 = nVar.a;
        int i10 = f0.a;
        float l10 = i10 < 23 ? -1.0f : l(this.H, getStreamFormats());
        if (l10 <= this.c) {
            l10 = -1.0f;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        i o6 = o(nVar, this.y, mediaCrypto, l10);
        if (i10 >= 31) {
            o.a(o6, getPlayerId());
        }
        try {
            d5.a.c("createCodec:" + str2);
            this.I = this.a.G(o6);
            d5.a.q();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (nVar.d(this.y)) {
                j10 = elapsedRealtime2;
                f10 = l10;
                j11 = elapsedRealtime;
            } else {
                t0 t0Var = this.y;
                if (t0Var == null) {
                    sb2 = BuildConfig.BETA_URL;
                    j10 = elapsedRealtime2;
                    f10 = l10;
                    j11 = elapsedRealtime;
                } else {
                    String str3 = t0Var.b;
                    String str4 = t0Var.c;
                    int i11 = t0Var.P;
                    int i12 = t0Var.O;
                    float f11 = t0Var.I;
                    int i13 = t0Var.H;
                    j10 = elapsedRealtime2;
                    int i14 = t0Var.G;
                    l3.c cVar2 = t0Var.E;
                    j11 = elapsedRealtime;
                    String str5 = t0Var.r;
                    int i15 = t0Var.n;
                    f10 = l10;
                    int i16 = t0Var.d;
                    int i17 = t0Var.e;
                    StringBuilder n10 = e2.c.n("id=");
                    n10.append(t0Var.a);
                    n10.append(", mimeType=");
                    n10.append(t0Var.B);
                    int i18 = -1;
                    if (i15 != -1) {
                        n10.append(", bitrate=");
                        n10.append(i15);
                    }
                    if (str5 != null) {
                        n10.append(", codecs=");
                        n10.append(str5);
                    }
                    if (cVar2 != null) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        int i19 = 0;
                        c10 = ',';
                        while (i19 < cVar2.d) {
                            UUID uuid = cVar2.a[i19].b;
                            if (uuid.equals(h3.h.b)) {
                                linkedHashSet.add("cenc");
                            } else if (uuid.equals(h3.h.c)) {
                                linkedHashSet.add("clearkey");
                            } else if (uuid.equals(h3.h.e)) {
                                linkedHashSet.add("playready");
                            } else if (uuid.equals(h3.h.d)) {
                                linkedHashSet.add("widevine");
                            } else if (uuid.equals(h3.h.a)) {
                                linkedHashSet.add("universal");
                            } else {
                                cVar = cVar2;
                                linkedHashSet.add("unknown (" + uuid + ")");
                                i19++;
                                cVar2 = cVar;
                            }
                            cVar = cVar2;
                            i19++;
                            cVar2 = cVar;
                        }
                        n10.append(", drm=[");
                        new c0(String.valueOf(',')).c(n10, linkedHashSet);
                        n10.append(']');
                        i18 = -1;
                    } else {
                        c10 = ',';
                    }
                    if (i14 != i18 && i13 != i18) {
                        n10.append(", res=");
                        n10.append(i14);
                        n10.append("x");
                        n10.append(i13);
                    }
                    if (f11 != -1.0f) {
                        n10.append(", fps=");
                        n10.append(f11);
                    }
                    if (i12 != -1) {
                        n10.append(", channels=");
                        n10.append(i12);
                    }
                    if (i11 != -1) {
                        n10.append(", sample_rate=");
                        n10.append(i11);
                    }
                    if (str4 != null) {
                        n10.append(", language=");
                        n10.append(str4);
                    }
                    if (str3 != null) {
                        n10.append(", label=");
                        n10.append(str3);
                    }
                    if (i16 != 0) {
                        ArrayList arrayList = new ArrayList();
                        if ((i16 & 4) != 0) {
                            arrayList.add("auto");
                        }
                        if ((i16 & 1) != 0) {
                            arrayList.add("default");
                        }
                        if ((i16 & 2) != 0) {
                            arrayList.add("forced");
                        }
                        n10.append(", selectionFlags=[");
                        new c0(String.valueOf(c10)).c(n10, arrayList);
                        n10.append("]");
                    }
                    if (i17 != 0) {
                        ArrayList arrayList2 = new ArrayList();
                        if ((i17 & 1) != 0) {
                            arrayList2.add("main");
                        }
                        if ((i17 & 2) != 0) {
                            arrayList2.add("alt");
                        }
                        if ((i17 & 4) != 0) {
                            arrayList2.add("supplementary");
                        }
                        if ((i17 & 8) != 0) {
                            arrayList2.add("commentary");
                        }
                        if ((i17 & 16) != 0) {
                            arrayList2.add("dub");
                        }
                        if ((i17 & 32) != 0) {
                            arrayList2.add("emergency");
                        }
                        if ((i17 & 64) != 0) {
                            arrayList2.add("caption");
                        }
                        if ((i17 & 128) != 0) {
                            arrayList2.add("subtitle");
                        }
                        if ((i17 & 256) != 0) {
                            arrayList2.add("sign");
                        }
                        if ((i17 & 512) != 0) {
                            arrayList2.add("describes-video");
                        }
                        if ((i17 & 1024) != 0) {
                            arrayList2.add("describes-music");
                        }
                        if ((i17 & 2048) != 0) {
                            arrayList2.add("enhanced-intelligibility");
                        }
                        if ((i17 & 4096) != 0) {
                            arrayList2.add("transcribes-dialog");
                        }
                        if ((i17 & 8192) != 0) {
                            arrayList2.add("easy-read");
                        }
                        if ((i17 & 16384) != 0) {
                            arrayList2.add("trick-play");
                        }
                        n10.append(", roleFlags=[");
                        new c0(String.valueOf(c10)).c(n10, arrayList2);
                        n10.append("]");
                    }
                    sb2 = n10.toString();
                }
                Locale locale = Locale.US;
                d5.a.K("MediaCodecRenderer", j2.h("Format exceeds selected codec's capabilities [", sb2, ", ", str2, "]"));
            }
            this.P = nVar;
            this.M = f10;
            this.J = this.y;
            int i20 = f0.a;
            if (i20 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str2)) {
                String str6 = f0.d;
                if (str6.startsWith("SM-T585") || str6.startsWith("SM-A510") || str6.startsWith("SM-A520") || str6.startsWith("SM-J700")) {
                    i9 = 2;
                    this.Q = i9;
                    this.R = i20 >= 21 && this.J.D.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str2);
                    this.S = i20 >= 18 || (i20 == 18 && ("OMX.SEC.avc.dec".equals(str2) || "OMX.SEC.avc.dec.secure".equals(str2))) || (i20 == 19 && f0.d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str2) || "OMX.Exynos.avc.dec.secure".equals(str2)));
                    this.T = i20 != 29 && "c2.android.aac.decoder".equals(str2);
                    if (i20 <= 23 || !"OMX.google.vorbis.decoder".equals(str2)) {
                        if (i20 <= 19) {
                            String str7 = f0.b;
                            if (!"hb2000".equals(str7)) {
                            }
                            if (!"OMX.amlogic.avc.decoder.awesome".equals(str2)) {
                            }
                        }
                        z10 = false;
                        this.U = z10;
                        this.V = i20 != 21 && "OMX.google.aac.decoder".equals(str2);
                        if (i20 < 21 && "OMX.SEC.mp3.dec".equals(str2) && "samsung".equals(f0.c)) {
                            str = f0.b;
                            if (!str.startsWith("baffin") || str.startsWith("grand") || str.startsWith("fortuna") || str.startsWith("gprimelte") || str.startsWith("j2y18lte") || str.startsWith("ms01")) {
                                z11 = true;
                                this.W = z11;
                                this.X = i20 > 18 && this.J.O == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str2);
                                this.a0 = (i20 > 25 && "OMX.rk.video_decoder.avc".equals(str2)) || (i20 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str2)) || ((i20 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str2) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str2) || "OMX.bcm.vdec.avc.tunnel".equals(str2) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str2) || "OMX.bcm.vdec.hevc.tunnel".equals(str2) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str2))) || (("Amazon".equals(f0.c) && "AFTS".equals(f0.d) && nVar.f) || k()));
                                this.I.getClass();
                                if ("c2.android.mp3.decoder".equals(str2)) {
                                    this.b0 = new h();
                                }
                                if (getState() == 2) {
                                    this.c0 = SystemClock.elapsedRealtime() + 1000;
                                }
                                this.z0.a++;
                                u(j10, j10 - j11, str2);
                            }
                        }
                        z11 = false;
                        this.W = z11;
                        this.X = i20 > 18 && this.J.O == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str2);
                        this.a0 = (i20 > 25 && "OMX.rk.video_decoder.avc".equals(str2)) || (i20 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str2)) || ((i20 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str2) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str2) || "OMX.bcm.vdec.avc.tunnel".equals(str2) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str2) || "OMX.bcm.vdec.hevc.tunnel".equals(str2) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str2))) || (("Amazon".equals(f0.c) && "AFTS".equals(f0.d) && nVar.f) || k()));
                        this.I.getClass();
                        if ("c2.android.mp3.decoder".equals(str2)) {
                        }
                        if (getState() == 2) {
                        }
                        this.z0.a++;
                        u(j10, j10 - j11, str2);
                    }
                    z10 = true;
                    this.U = z10;
                    this.V = i20 != 21 && "OMX.google.aac.decoder".equals(str2);
                    if (i20 < 21) {
                        str = f0.b;
                        if (!str.startsWith("baffin")) {
                        }
                        z11 = true;
                        this.W = z11;
                        this.X = i20 > 18 && this.J.O == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str2);
                        this.a0 = (i20 > 25 && "OMX.rk.video_decoder.avc".equals(str2)) || (i20 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str2)) || ((i20 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str2) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str2) || "OMX.bcm.vdec.avc.tunnel".equals(str2) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str2) || "OMX.bcm.vdec.hevc.tunnel".equals(str2) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str2))) || (("Amazon".equals(f0.c) && "AFTS".equals(f0.d) && nVar.f) || k()));
                        this.I.getClass();
                        if ("c2.android.mp3.decoder".equals(str2)) {
                        }
                        if (getState() == 2) {
                        }
                        this.z0.a++;
                        u(j10, j10 - j11, str2);
                    }
                    z11 = false;
                    this.W = z11;
                    this.X = i20 > 18 && this.J.O == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str2);
                    this.a0 = (i20 > 25 && "OMX.rk.video_decoder.avc".equals(str2)) || (i20 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str2)) || ((i20 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str2) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str2) || "OMX.bcm.vdec.avc.tunnel".equals(str2) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str2) || "OMX.bcm.vdec.hevc.tunnel".equals(str2) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str2))) || (("Amazon".equals(f0.c) && "AFTS".equals(f0.d) && nVar.f) || k()));
                    this.I.getClass();
                    if ("c2.android.mp3.decoder".equals(str2)) {
                    }
                    if (getState() == 2) {
                    }
                    this.z0.a++;
                    u(j10, j10 - j11, str2);
                }
            }
            if (i20 < 24 && ("OMX.Nvidia.h264.decode".equals(str2) || "OMX.Nvidia.h264.decode.secure".equals(str2))) {
                String str8 = f0.b;
                if ("flounder".equals(str8) || "flounder_lte".equals(str8) || "grouper".equals(str8) || "tilapia".equals(str8)) {
                    i9 = 1;
                    this.Q = i9;
                    this.R = i20 >= 21 && this.J.D.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str2);
                    this.S = i20 >= 18 || (i20 == 18 && ("OMX.SEC.avc.dec".equals(str2) || "OMX.SEC.avc.dec.secure".equals(str2))) || (i20 == 19 && f0.d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str2) || "OMX.Exynos.avc.dec.secure".equals(str2)));
                    this.T = i20 != 29 && "c2.android.aac.decoder".equals(str2);
                    if (i20 <= 23) {
                    }
                    if (i20 <= 19) {
                    }
                    z10 = false;
                    this.U = z10;
                    this.V = i20 != 21 && "OMX.google.aac.decoder".equals(str2);
                    if (i20 < 21) {
                    }
                    z11 = false;
                    this.W = z11;
                    this.X = i20 > 18 && this.J.O == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str2);
                    this.a0 = (i20 > 25 && "OMX.rk.video_decoder.avc".equals(str2)) || (i20 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str2)) || ((i20 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str2) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str2) || "OMX.bcm.vdec.avc.tunnel".equals(str2) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str2) || "OMX.bcm.vdec.hevc.tunnel".equals(str2) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str2))) || (("Amazon".equals(f0.c) && "AFTS".equals(f0.d) && nVar.f) || k()));
                    this.I.getClass();
                    if ("c2.android.mp3.decoder".equals(str2)) {
                    }
                    if (getState() == 2) {
                    }
                    this.z0.a++;
                    u(j10, j10 - j11, str2);
                }
            }
            i9 = 0;
            this.Q = i9;
            this.R = i20 >= 21 && this.J.D.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str2);
            this.S = i20 >= 18 || (i20 == 18 && ("OMX.SEC.avc.dec".equals(str2) || "OMX.SEC.avc.dec.secure".equals(str2))) || (i20 == 19 && f0.d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str2) || "OMX.Exynos.avc.dec.secure".equals(str2)));
            this.T = i20 != 29 && "c2.android.aac.decoder".equals(str2);
            if (i20 <= 23) {
            }
            if (i20 <= 19) {
            }
            z10 = false;
            this.U = z10;
            this.V = i20 != 21 && "OMX.google.aac.decoder".equals(str2);
            if (i20 < 21) {
            }
            z11 = false;
            this.W = z11;
            this.X = i20 > 18 && this.J.O == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str2);
            this.a0 = (i20 > 25 && "OMX.rk.video_decoder.avc".equals(str2)) || (i20 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str2)) || ((i20 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str2) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str2) || "OMX.bcm.vdec.avc.tunnel".equals(str2) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str2) || "OMX.bcm.vdec.hevc.tunnel".equals(str2) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str2))) || (("Amazon".equals(f0.c) && "AFTS".equals(f0.d) && nVar.f) || k()));
            this.I.getClass();
            if ("c2.android.mp3.decoder".equals(str2)) {
            }
            if (getState() == 2) {
            }
            this.z0.a++;
            u(j10, j10 - j11, str2);
        } catch (Throwable th) {
            d5.a.q();
            throw th;
        }
    }

    public final void r() {
        t0 t0Var;
        if (this.I != null || this.i0 || (t0Var = this.y) == null) {
            return;
        }
        if (this.C == null && L(t0Var)) {
            t0 t0Var2 = this.y;
            d();
            String str = t0Var2.B;
            boolean equals = MediaController.AUDIO_MIME_TYPE.equals(str);
            g gVar = this.h;
            if (equals || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                gVar.getClass();
                gVar.s = 32;
            } else {
                gVar.getClass();
                gVar.s = 1;
            }
            this.i0 = true;
            return;
        }
        I(this.C);
        String str2 = this.y.B;
        l3.e eVar = this.B;
        if (eVar != null) {
            if (this.D == null) {
                n(eVar);
                if (this.B.x() == null) {
                    return;
                }
            }
            if (l3.j.a) {
                int j10 = this.B.j();
                if (j10 == 1) {
                    l3.d x10 = this.B.x();
                    x10.getClass();
                    throw createRendererException(x10, this.y, x10.a);
                }
                if (j10 != 4) {
                    return;
                }
            }
        }
        try {
            s(this.D, this.E);
        } catch (p e10) {
            throw createRendererException(e10, this.y, 4001);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x006a A[LOOP:1: B:33:0x004a->B:42:0x006a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006b A[EDGE_INSN: B:43:0x006b->B:44:? BREAK  A[LOOP:1: B:33:0x004a->B:42:0x006a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0086 A[LOOP:2: B:45:0x006b->B:54:0x0086, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0087 A[EDGE_INSN: B:55:0x0087->B:56:0x0087 BREAK  A[LOOP:2: B:45:0x006b->B:54:0x0086], SYNTHETIC] */
    @Override // h3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void render(long j10, long j11) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (this.x0) {
            this.x0 = false;
            B();
        }
        h3.n nVar = this.y0;
        if (nVar != null) {
            this.y0 = null;
            throw nVar;
        }
        try {
            if (this.v0) {
                F();
                return;
            }
            if (this.y != null || D(2)) {
                r();
                if (this.i0) {
                    d5.a.c("bypassRender");
                    while (a(j10, j11)) {
                    }
                    d5.a.q();
                } else if (this.I != null) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    d5.a.c("drainAndFeed");
                    while (f(j10, j11)) {
                        long j12 = this.F;
                        if (j12 != -9223372036854775807L && SystemClock.elapsedRealtime() - elapsedRealtime >= j12) {
                            z11 = false;
                            if (z11) {
                                break;
                            }
                        }
                        z11 = true;
                        if (z11) {
                        }
                    }
                    while (g()) {
                        long j13 = this.F;
                        if (j13 != -9223372036854775807L && SystemClock.elapsedRealtime() - elapsedRealtime >= j13) {
                            z10 = false;
                            if (z10) {
                                break;
                            }
                        }
                        z10 = true;
                        if (z10) {
                        }
                    }
                    d5.a.q();
                } else {
                    this.z0.d += skipSource(j10);
                    D(1);
                }
                synchronized (this.z0) {
                }
            }
        } catch (IllegalStateException e10) {
            int i9 = f0.a;
            if (i9 < 21 || !(e10 instanceof MediaCodec.CodecException)) {
                StackTraceElement[] stackTrace = e10.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e10;
                }
            }
            t(e10);
            if (i9 >= 21) {
                if (e10 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e10).isRecoverable() : false) {
                    z12 = true;
                }
            }
            if (z12) {
                E();
            }
            throw createRendererException(c(e10, this.P), this.y, z12, 4003);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(MediaCrypto mediaCrypto, boolean z10) {
        String str;
        p pVar;
        if (this.N == null) {
            try {
                List j10 = j(z10);
                this.N = new ArrayDeque();
                ArrayList arrayList = (ArrayList) j10;
                if (!arrayList.isEmpty()) {
                    this.N.add((n) arrayList.get(0));
                }
                this.O = null;
            } catch (t e10) {
                throw new p(this.y, e10, z10, -49998);
            }
        }
        if (this.N.isEmpty()) {
            throw new p(this.y, null, z10, -49999);
        }
        n nVar = (n) this.N.peekFirst();
        while (this.I == null) {
            n nVar2 = (n) this.N.peekFirst();
            if (!K(nVar2)) {
                return;
            }
            try {
                q(nVar2, mediaCrypto);
            } catch (Exception e11) {
                if (nVar2 != nVar) {
                    throw e11;
                }
                try {
                    d5.a.K("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                    Thread.sleep(50L);
                    q(nVar2, mediaCrypto);
                } catch (Exception e12) {
                    d5.a.L("MediaCodecRenderer", "Failed to initialize decoder: " + nVar2, e12);
                    this.N.removeFirst();
                    t0 t0Var = this.y;
                    String str2 = "Decoder init failed: " + nVar2.a + ", " + t0Var;
                    String str3 = t0Var.B;
                    if (f0.a < 21) {
                        str = e12 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e12).getDiagnosticInfo() : null;
                    } else {
                        str = null;
                    }
                    p pVar2 = new p(str2, e12, str3, z10, nVar2, str);
                    t(pVar2);
                    pVar = this.O;
                    if (pVar != null) {
                        this.O = pVar2;
                    } else {
                        this.O = new p(pVar.getMessage(), pVar.getCause(), pVar.a, pVar.b, pVar.c, pVar.d);
                    }
                    if (!this.N.isEmpty()) {
                        throw this.O;
                    }
                }
                d5.a.L("MediaCodecRenderer", "Failed to initialize decoder: " + nVar2, e12);
                this.N.removeFirst();
                t0 t0Var2 = this.y;
                String str22 = "Decoder init failed: " + nVar2.a + ", " + t0Var2;
                String str32 = t0Var2.B;
                if (f0.a < 21) {
                }
                p pVar22 = new p(str22, e12, str32, z10, nVar2, str);
                t(pVar22);
                pVar = this.O;
                if (pVar != null) {
                }
                if (!this.N.isEmpty()) {
                }
            }
        }
        this.N = null;
    }

    @Override // h3.e
    public void setPlaybackSpeed(float f10, float f11) {
        this.G = f10;
        this.H = f11;
        N(this.J);
    }

    @Override // h3.h2
    public final int supportsFormat(t0 t0Var) {
        try {
            return M(this.b, t0Var);
        } catch (t e10) {
            throw createRendererException(e10, t0Var, 4002);
        }
    }

    @Override // h3.e, h3.h2
    public final int supportsMixedMimeTypeAdaptation() {
        return 8;
    }

    public abstract void t(Exception exc);

    public abstract void u(long j10, long j11, String str);

    public abstract void v(String str);

    /* JADX WARN: Code restructure failed: missing block: B:41:0x006e, code lost:
    
        if (e() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a2, code lost:
    
        if (e() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b4, code lost:
    
        if (e() == false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k3.l w(u0 u0Var) {
        boolean z10 = true;
        this.w0 = true;
        t0 t0Var = u0Var.b;
        t0Var.getClass();
        if (t0Var.B == null) {
            throw createRendererException(new IllegalArgumentException(), t0Var, 4005);
        }
        l3.e eVar = u0Var.a;
        r0.D(this.C, eVar);
        this.C = eVar;
        this.y = t0Var;
        if (this.i0) {
            this.k0 = true;
            return null;
        }
        k kVar = this.I;
        if (kVar == null) {
            this.N = null;
            r();
            return null;
        }
        n nVar = this.P;
        t0 t0Var2 = this.J;
        l3.e eVar2 = this.B;
        if (eVar2 != eVar) {
            if (eVar != null && eVar2 != null && eVar.a().equals(eVar2.a()) && f0.a >= 23) {
                UUID uuid = h3.h.e;
                if (!uuid.equals(eVar2.a()) && !uuid.equals(eVar.a())) {
                    n(eVar);
                }
            }
            if (this.p0) {
                this.n0 = 1;
                this.o0 = 3;
            } else {
                E();
                r();
            }
            return new k3.l(nVar.a, t0Var2, t0Var, 0, 128);
        }
        int i9 = 0;
        boolean z11 = this.C != this.B;
        d5.a.i(!z11 || f0.a >= 23);
        k3.l b10 = b(nVar, t0Var2, t0Var);
        int i10 = b10.d;
        if (i10 != 0) {
            if (i10 == 1) {
                if (N(t0Var)) {
                    this.J = t0Var;
                    if (!z11) {
                        if (this.p0) {
                            this.n0 = 1;
                            if (this.S || this.U) {
                                this.o0 = 3;
                                i9 = 2;
                            } else {
                                this.o0 = 1;
                            }
                        }
                    }
                }
                i9 = 16;
            } else if (i10 == 2) {
                if (N(t0Var)) {
                    this.l0 = true;
                    this.m0 = 1;
                    int i11 = this.Q;
                    if (i11 != 2 && (i11 != 1 || t0Var.G != t0Var2.G || t0Var.H != t0Var2.H)) {
                        z10 = false;
                    }
                    this.Y = z10;
                    this.J = t0Var;
                    if (z11) {
                    }
                }
                i9 = 16;
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException();
                }
                if (N(t0Var)) {
                    this.J = t0Var;
                    if (z11) {
                    }
                }
                i9 = 16;
            }
        } else if (this.p0) {
            this.n0 = 1;
            this.o0 = 3;
        } else {
            E();
            r();
        }
        return (i10 == 0 || (this.I == kVar && this.o0 != 3)) ? b10 : new k3.l(nVar.a, t0Var2, t0Var, 0, i9);
    }

    public abstract void x(t0 t0Var, MediaFormat mediaFormat);

    public void z(long j10) {
        while (this.C0 != 0) {
            long[] jArr = this.x;
            if (j10 < jArr[0]) {
                return;
            }
            long[] jArr2 = this.v;
            this.A0 = jArr2[0];
            long[] jArr3 = this.w;
            J(jArr3[0]);
            int i9 = this.C0 - 1;
            this.C0 = i9;
            System.arraycopy(jArr2, 1, jArr2, 0, i9);
            System.arraycopy(jArr3, 1, jArr3, 0, this.C0);
            System.arraycopy(jArr, 1, jArr, 0, this.C0);
            A();
        }
    }

    public void F() {
    }

    public void y() {
    }

    public void p(k3.i iVar) {
    }
}
