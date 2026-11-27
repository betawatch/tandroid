// default package

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
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class qm6 extends vg0 {
    public static final byte[] Z0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public boolean A0;
    public byte B0;
    public byte C0;
    public byte D0;
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public long H0;
    public long I0;
    public boolean J0;
    public final Context K;
    public boolean K0;
    public final im6 L;
    public boolean L0;
    public final s93 M;
    public boolean M0;
    public final s93 N;
    public e64 N0;
    public final s93 O;
    public p93 O0;
    public final ah0 P;
    public pm6 P0;
    public final MediaCodec.BufferInfo Q;
    public long Q0;
    public final ArrayDeque R;
    public boolean R0;
    public final ir7 S;
    public boolean S0;
    public final AtomicInteger T;
    public boolean T0;
    public ko4 U;
    public long U0;
    public ko4 V;
    public long V0;
    public jr3 W;
    public pk2 W0;
    public jr3 X;
    public pk2 X0;
    public w64 Y;
    public bp5 Y0;
    public MediaCrypto Z;
    public float a0;
    public float b0;
    public jm6 c0;
    public ko4 d0;
    public MediaFormat e0;
    public boolean f0;
    public float g0;
    public ArrayDeque h0;
    public om6 i0;
    public nm6 j0;
    public byte k0;
    public boolean l0;
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public long q0;
    public boolean r0;
    public long s0;
    public int t0;
    public int u0;
    public ByteBuffer v0;
    public boolean w0;
    public boolean x0;
    public boolean y0;
    public boolean z0;

    public qm6(Context context, int i, im6 im6Var) {
        super(i);
        this.K = context.getApplicationContext();
        this.L = im6Var;
        this.T = new AtomicInteger();
        this.M = new s93(0, 0);
        this.N = new s93(0, 0);
        this.O = new s93(2, 0);
        ah0 ah0Var = new ah0(2, 0);
        ah0Var.w = (byte) 32;
        this.P = ah0Var;
        this.Q = new MediaCodec.BufferInfo();
        this.a0 = 1.0f;
        this.b0 = 1.0f;
        this.R = new ArrayDeque();
        this.P0 = pm6.i;
        ah0Var.c(0);
        ah0Var.c.order(ByteOrder.nativeOrder());
        ir7 ir7Var = new ir7();
        ir7Var.a = q20.a;
        ir7Var.c = 0;
        ir7Var.b = 2;
        this.S = ir7Var;
        this.g0 = -1.0f;
        this.k0 = (byte) 0;
        this.B0 = (byte) 0;
        this.t0 = -1;
        this.u0 = -1;
        this.s0 = -9223372036854775807L;
        this.H0 = -9223372036854775807L;
        this.I0 = -9223372036854775807L;
        this.Q0 = -9223372036854775807L;
        this.q0 = -9223372036854775807L;
        this.C0 = (byte) 0;
        this.D0 = (byte) 0;
        this.O0 = new p93();
        this.T0 = false;
        this.U0 = 0L;
        this.V0 = -9223372036854775807L;
        int i2 = bp5.c;
        this.Y0 = q99.s;
        pk2 pk2Var = pk2.b;
        this.W0 = pk2Var;
        this.X0 = pk2Var;
    }

    public boolean A0(s93 s93Var) {
        return false;
    }

    @Override // vg0
    public void B(long j, long j2) {
        boolean z = false;
        if (this.M0) {
            this.M0 = false;
            q0();
        }
        e64 e64Var = this.N0;
        if (e64Var != null) {
            this.N0 = null;
            throw e64Var;
        }
        try {
            if (this.K0) {
                u0();
                return;
            }
            if (this.U != null || s0(2)) {
                d0();
                if (this.x0) {
                    Trace.beginSection("bypassRender");
                    while (L(j, j2)) {
                    }
                    Trace.endSection();
                } else if (this.c0 != null) {
                    this.h.getClass();
                    SystemClock.elapsedRealtime();
                    Trace.beginSection("drainAndFeed");
                    while (P(j, j2)) {
                    }
                    while (Q()) {
                    }
                    Trace.endSection();
                } else {
                    this.O0.d += F(j);
                    s0(1);
                }
                synchronized (this.O0) {
                }
            }
        } catch (MediaCodec.CryptoException e) {
            throw e(e, this.U, false, gcc.A(e.getErrorCode()));
        } catch (IllegalStateException e2) {
            boolean z2 = e2 instanceof MediaCodec.CodecException;
            if (!z2) {
                StackTraceElement[] stackTrace = e2.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e2;
                }
            }
            g0(e2);
            if (z2 && ((MediaCodec.CodecException) e2).isRecoverable()) {
                z = true;
            }
            if (z) {
                t0();
            }
            mm6 N = N(e2, this.j0);
            throw e(N, this.U, z, N.a == 1101 ? 4006 : 4003);
        }
    }

    public boolean B0() {
        return this.E0;
    }

    public boolean C0(nm6 nm6Var) {
        return true;
    }

    public boolean D0() {
        byte b = this.D0;
        if (b == 3 || ((this.l0 && !this.G0) || (this.m0 && (this.F0 || this.C0 == 1)))) {
            return true;
        }
        if (b != 2) {
            return false;
        }
        try {
            H0();
            return false;
        } catch (e64 e) {
            efd.g("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
            return true;
        }
    }

    @Override // vg0
    public void E(float f, float f2) {
        this.a0 = f;
        this.b0 = f2;
        G0(this.d0);
    }

    public boolean E0(ko4 ko4Var) {
        return false;
    }

    public abstract int F0(ko4 ko4Var);

    @Override // vg0
    public final int G(ko4 ko4Var) {
        try {
            return F0(ko4Var);
        } catch (tm6 e) {
            throw this.e(e, ko4Var, false, 4002);
        }
    }

    public final void G0(ko4 ko4Var) {
        if (this.c0 == null || this.D0 == 3 || this.n == 0) {
            return;
        }
        float f = this.b0;
        ko4Var.getClass();
        ko4[] ko4VarArr = this.s;
        ko4VarArr.getClass();
        float V = V(f, ko4Var, ko4VarArr);
        float f2 = this.g0;
        if (f2 == V || V == -1.0f) {
            return;
        }
        if (f2 != -1.0f || V > 0.0f) {
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", V);
            jm6 jm6Var = this.c0;
            jm6Var.getClass();
            jm6Var.setParameters(bundle);
            this.g0 = V;
        }
    }

    @Override // vg0
    public final int H() {
        return 8;
    }

    public final void H0() {
        jr3 jr3Var = this.X;
        jr3Var.getClass();
        or4 h = jr3Var.h();
        if (h != null) {
            try {
                MediaCrypto mediaCrypto = this.Z;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(h.b);
            } catch (MediaCryptoException e) {
                throw e(e, this.U, false, 6006);
            }
        }
        y0(this.X);
        this.C0 = (byte) 0;
        this.D0 = (byte) 0;
    }

    public final void I0(long j) {
        ko4 ko4Var = (ko4) this.P0.d.j(j);
        if (ko4Var == null && this.R0 && this.e0 != null) {
            ko4Var = (ko4) this.P0.d.i();
        }
        if (ko4Var != null) {
            this.V = ko4Var;
        } else if (!this.f0 || (ko4Var = this.V) == null) {
            return;
        }
        l0(ko4Var, this.e0);
        this.f0 = false;
        this.R0 = false;
    }

    public final void K(MediaFormat mediaFormat) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean, int] */
    public final boolean L(long j, long j2) {
        ah0 ah0Var;
        int i;
        int i2;
        int i3;
        yve.p(!this.K0);
        ah0 ah0Var2 = this.P;
        if (ah0Var2.f()) {
            ByteBuffer byteBuffer = ah0Var2.c;
            int i4 = this.u0;
            int i5 = ah0Var2.s;
            long j3 = ah0Var2.e;
            boolean c0 = c0(this.x, ah0Var2.r);
            boolean isEndOfStream = ah0Var2.isEndOfStream();
            ko4 ko4Var = this.V;
            ko4Var.getClass();
            ah0Var = ah0Var2;
            if (r0(j, j2, null, byteBuffer, i4, 0, i5, j3, c0, isEndOfStream, ko4Var)) {
                n0(ah0Var.r);
                ah0Var.clear();
            }
        }
        ah0Var = ah0Var2;
        if (this.J0) {
            this.K0 = true;
            return false;
        }
        ?? r1 = 0;
        boolean z = this.y0;
        s93 s93Var = this.O;
        if (z) {
            yve.p(ah0Var.e(s93Var));
            this.y0 = false;
        }
        if (this.z0) {
            if (ah0Var.f()) {
                return true;
            }
            this.x0 = false;
            v0();
            this.z0 = false;
            d0();
            if (!this.x0) {
                return false;
            }
        }
        yve.p(!this.J0);
        ym4 ym4Var = this.c;
        ym4Var.t();
        s93Var.clear();
        while (true) {
            s93Var.clear();
            int A = A(ym4Var, s93Var, r1);
            if (A == -5) {
                k0(ym4Var);
                break;
            }
            if (A != -4) {
                if (A != -3) {
                    grb.g();
                    return r1;
                }
                if (m()) {
                    Y().h = this.H0;
                }
            } else {
                if (s93Var.isEndOfStream()) {
                    this.J0 = true;
                    Y().h = this.H0;
                    break;
                }
                this.H0 = Math.max(this.H0, s93Var.e);
                if (m() || this.N.isLastSample()) {
                    Y().h = this.H0;
                }
                byte[] bArr = null;
                if (this.L0) {
                    ko4 ko4Var2 = this.U;
                    ko4Var2.getClass();
                    this.V = ko4Var2;
                    if (Objects.equals(ko4Var2.t, "audio/opus") && !this.V.w.isEmpty()) {
                        byte[] bArr2 = (byte[]) this.V.w.get(r1);
                        int i6 = ((bArr2[11] & 255) << 8) | (bArr2[10] & 255);
                        jo4 a = this.V.a();
                        a.Q = i6;
                        this.V = new ko4(a);
                    }
                    l0(this.V, null);
                    this.L0 = r1;
                }
                s93Var.d();
                ko4 ko4Var3 = this.V;
                if (ko4Var3 != null && Objects.equals(ko4Var3.t, "audio/opus")) {
                    if (s93Var.hasSupplementalData()) {
                        s93Var.a = this.V;
                        a0(s93Var);
                    }
                    if (this.x - s93Var.e <= 80000) {
                        List list = this.V.w;
                        s93Var.c.getClass();
                        if (s93Var.c.limit() - s93Var.c.position() != 0) {
                            ir7 ir7Var = this.S;
                            if (ir7Var.b == 2 && (list.size() == 1 || list.size() == 3)) {
                                bArr = (byte[]) list.get(r1);
                            }
                            ByteBuffer byteBuffer2 = s93Var.c;
                            int position = byteBuffer2.position();
                            int limit = byteBuffer2.limit();
                            int i7 = limit - position;
                            int i8 = (i7 + jn7.d4) / jn7.d4;
                            int i9 = i8 + 27 + i7;
                            if (ir7Var.b == 2) {
                                i = bArr != null ? bArr.length + 28 : 47;
                                i9 = i + 44 + i9;
                            } else {
                                i = r1;
                            }
                            if (ir7Var.a.capacity() < i9) {
                                ir7Var.a = ByteBuffer.allocate(i9).order(ByteOrder.LITTLE_ENDIAN);
                            } else {
                                ir7Var.a.clear();
                            }
                            ByteBuffer byteBuffer3 = ir7Var.a;
                            if (ir7Var.b == 2) {
                                if (bArr != null) {
                                    ir7.d(byteBuffer3, 0L, 0, 1, true);
                                    i3 = limit;
                                    byteBuffer3.put(a2f.a(bArr.length));
                                    byteBuffer3.put(bArr);
                                    i2 = position;
                                    byteBuffer3.putInt(22, gcc.p(byteBuffer3.arrayOffset(), bArr.length + 28, 0, byteBuffer3.array()));
                                    byteBuffer3.position(bArr.length + 28);
                                } else {
                                    i2 = position;
                                    i3 = limit;
                                    byteBuffer3.put(ir7.d);
                                }
                                byteBuffer3.put(ir7.e);
                            } else {
                                i2 = position;
                                i3 = limit;
                            }
                            int b = ir7Var.c + ((int) ((zue.b(byteBuffer2.get(0), byteBuffer2.limit() > 1 ? byteBuffer2.get(1) : (byte) 0) * 48000) / 1000000));
                            ir7Var.c = b;
                            ir7.d(byteBuffer3, b, ir7Var.b, i8, false);
                            for (int i10 = 0; i10 < i8; i10++) {
                                if (i7 >= 255) {
                                    byteBuffer3.put((byte) -1);
                                    i7 -= 255;
                                } else {
                                    byteBuffer3.put((byte) i7);
                                    i7 = 0;
                                }
                            }
                            int i11 = i3;
                            for (int i12 = i2; i12 < i11; i12++) {
                                byteBuffer3.put(byteBuffer2.get(i12));
                            }
                            byteBuffer2.position(byteBuffer2.limit());
                            byteBuffer3.flip();
                            if (ir7Var.b == 2) {
                                byteBuffer3.putInt(i + 66, gcc.p(byteBuffer3.arrayOffset() + i + 44, byteBuffer3.limit() - byteBuffer3.position(), 0, byteBuffer3.array()));
                            } else {
                                byteBuffer3.putInt(22, gcc.p(byteBuffer3.arrayOffset(), byteBuffer3.limit() - byteBuffer3.position(), 0, byteBuffer3.array()));
                            }
                            ir7Var.b++;
                            ir7Var.a = byteBuffer3;
                            s93Var.clear();
                            s93Var.c(ir7Var.a.remaining());
                            s93Var.c.put(ir7Var.a);
                            s93Var.d();
                        }
                    }
                }
                if (ah0Var.f()) {
                    long j4 = this.x;
                    if (c0(j4, ah0Var.r) != c0(j4, s93Var.e)) {
                        break;
                    }
                }
                if (!ah0Var.e(s93Var)) {
                    break;
                }
                r1 = 0;
            }
        }
        this.y0 = true;
        if (ah0Var.f()) {
            ah0Var.d();
        }
        return ah0Var.f() || this.J0 || this.z0;
    }

    public abstract w93 M(nm6 nm6Var, ko4 ko4Var, ko4 ko4Var2, boolean z);

    public mm6 N(IllegalStateException illegalStateException, nm6 nm6Var) {
        return new mm6(illegalStateException, nm6Var);
    }

    public final boolean O() {
        if (!this.E0) {
            H0();
            return true;
        }
        this.C0 = (byte) 1;
        if (D0()) {
            this.D0 = (byte) 3;
            return false;
        }
        this.D0 = (byte) 2;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean P(long j, long j2) {
        boolean z;
        boolean z2;
        boolean z3;
        ByteBuffer byteBuffer;
        int i;
        int i2;
        long j3;
        ko4 ko4Var;
        jm6 jm6Var = this.c0;
        jm6Var.getClass();
        int i3 = this.u0;
        MediaCodec.BufferInfo bufferInfo = this.Q;
        if (i3 < 0) {
            int h = jm6Var.h(bufferInfo);
            if (h < 0) {
                if (h != -2) {
                    if (this.p0 && (this.J0 || this.C0 == 2)) {
                        q0();
                    }
                    long j4 = this.q0;
                    if (j4 != -9223372036854775807L) {
                        long j5 = j4 + 100;
                        this.h.getClass();
                        if (j5 < System.currentTimeMillis()) {
                            q0();
                            return false;
                        }
                    }
                    return false;
                }
                this.G0 = true;
                jm6 jm6Var2 = this.c0;
                jm6Var2.getClass();
                MediaFormat outputFormat = jm6Var2.getOutputFormat();
                if (this.k0 != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                    this.o0 = true;
                    return true;
                }
                if (Build.VERSION.SDK_INT >= 29 && !this.Y0.isEmpty()) {
                    pk2 pk2Var = new pk2(pk2.a(outputFormat, this.Y0).a);
                    if (!pk2Var.equals(this.X0)) {
                        this.X0 = pk2Var;
                        i0(pk2Var);
                    }
                }
                this.e0 = outputFormat;
                this.f0 = true;
                return true;
            }
            long j6 = this.V0;
            this.w0 = j6 != -9223372036854775807L && bufferInfo.presentationTimeUs <= j6;
            bufferInfo.presentationTimeUs -= this.U0;
            if (this.o0) {
                this.o0 = false;
                jm6Var.c(h);
                return true;
            }
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                q0();
                return false;
            }
            this.u0 = h;
            ByteBuffer outputBuffer = jm6Var.getOutputBuffer(h);
            this.v0 = outputBuffer;
            if (outputBuffer != null) {
                outputBuffer.position(bufferInfo.offset);
                this.v0.limit(bufferInfo.offset + bufferInfo.size);
            }
            I0(bufferInfo.presentationTimeUs);
        }
        pm6 pm6Var = this.P0;
        pm6 pm6Var2 = pm6.i;
        if ((pm6Var.f & 1) != 0) {
            long j7 = pm6Var.e;
            if (j7 != -9223372036854775807L && bufferInfo.presentationTimeUs - pm6Var.c >= j7) {
                z = true;
                z2 = !this.w0 || this.T0 || bufferInfo.presentationTimeUs < this.x || z;
                long j8 = pm6Var.h;
                z3 = j8 == -9223372036854775807L && j8 <= bufferInfo.presentationTimeUs && !z;
                byteBuffer = this.v0;
                i = this.u0;
                i2 = bufferInfo.flags;
                j3 = bufferInfo.presentationTimeUs;
                ko4Var = this.V;
                ko4Var.getClass();
                if (r0(j, j2, jm6Var, byteBuffer, i, i2, 1, j3, z2, z3, ko4Var)) {
                    return false;
                }
                n0(bufferInfo.presentationTimeUs);
                boolean z4 = (bufferInfo.flags & 4) != 0;
                if (!z4 && this.F0 && z3) {
                    this.h.getClass();
                    this.q0 = System.currentTimeMillis();
                }
                this.u0 = -1;
                this.v0 = null;
                if (!z4) {
                    return true;
                }
                q0();
                return false;
            }
        }
        z = false;
        if (this.w0) {
        }
        long j82 = pm6Var.h;
        if (j82 == -9223372036854775807L) {
        }
        byteBuffer = this.v0;
        i = this.u0;
        i2 = bufferInfo.flags;
        j3 = bufferInfo.presentationTimeUs;
        ko4Var = this.V;
        ko4Var.getClass();
        if (r0(j, j2, jm6Var, byteBuffer, i, i2, 1, j3, z2, z3, ko4Var)) {
        }
    }

    public final boolean Q() {
        pm6 Y = Y();
        at9 at9Var = this.r;
        at9Var.getClass();
        Y.f = at9Var.a();
        jm6 jm6Var = this.c0;
        if (jm6Var != null && this.C0 != 2 && !this.J0) {
            int i = this.t0;
            s93 s93Var = this.N;
            if (i < 0) {
                int g = jm6Var.g();
                this.t0 = g;
                if (g >= 0) {
                    s93Var.c = jm6Var.getInputBuffer(g);
                    s93Var.clear();
                }
            }
            if (this.C0 == 1) {
                if (!this.p0) {
                    this.F0 = true;
                    jm6Var.b(this.t0, 0, 4, 0L);
                    this.t0 = -1;
                    s93Var.c = null;
                }
                this.C0 = (byte) 2;
                return false;
            }
            if (this.n0) {
                this.n0 = false;
                ByteBuffer byteBuffer = s93Var.c;
                byteBuffer.getClass();
                byteBuffer.put(Z0);
                jm6Var.b(this.t0, 38, 0, 0L);
                this.t0 = -1;
                s93Var.c = null;
                this.E0 = true;
                return true;
            }
            if (this.B0 == 1) {
                int i2 = 0;
                while (true) {
                    ko4 ko4Var = this.d0;
                    ko4Var.getClass();
                    if (i2 >= ko4Var.w.size()) {
                        break;
                    }
                    byte[] bArr = (byte[]) this.d0.w.get(i2);
                    ByteBuffer byteBuffer2 = s93Var.c;
                    byteBuffer2.getClass();
                    byteBuffer2.put(bArr);
                    i2++;
                }
                this.B0 = (byte) 2;
            }
            ByteBuffer byteBuffer3 = s93Var.c;
            byteBuffer3.getClass();
            int position = byteBuffer3.position();
            ym4 ym4Var = this.c;
            ym4Var.t();
            try {
                jm6Var.i(new u34(this, ym4Var, (byte) 29));
                int i3 = this.T.get();
                if (i3 == -3) {
                    if (m()) {
                        pm6 Y2 = Y();
                        pm6 Y3 = Y();
                        pm6 pm6Var = pm6.i;
                        Y2.h = (Y3.f & 1) != 0 ? this.I0 : this.H0;
                        return false;
                    }
                } else {
                    if (i3 == -5) {
                        if (this.B0 == 2) {
                            s93Var.clear();
                            this.B0 = (byte) 1;
                        }
                        k0(ym4Var);
                        return true;
                    }
                    if (!s93Var.isEndOfStream()) {
                        if (this.E0 || s93Var.isKeyFrame()) {
                            long j = s93Var.e;
                            if (!A0(s93Var)) {
                                boolean flag = s93Var.getFlag(TLObject.FLAG_30);
                                if (flag) {
                                    g43 g43Var = s93Var.b;
                                    if (position == 0) {
                                        g43Var.getClass();
                                    } else {
                                        int[] iArr = g43Var.d;
                                        if (iArr == null) {
                                            iArr = new int[1];
                                            g43Var.d = iArr;
                                            g43Var.i.numBytesOfClearData = iArr;
                                        }
                                        iArr[0] = iArr[0] + position;
                                    }
                                }
                                if (this.L0) {
                                    pm6 Y4 = Y();
                                    jq jqVar = Y4.d;
                                    ko4 ko4Var2 = this.U;
                                    ko4Var2.getClass();
                                    jqVar.a(j, ko4Var2);
                                    Y4.g = true;
                                    this.L0 = false;
                                }
                                if (this.T0) {
                                    long j2 = this.H0;
                                    long j3 = this.U0;
                                    this.V0 = j2 + j3;
                                    if (j <= j2) {
                                        this.U0 = (j2 - j) + 1 + j3;
                                    }
                                    this.H0 = j;
                                    this.I0 = j;
                                    this.T0 = false;
                                }
                                this.H0 = Math.max(this.H0, j);
                                long j4 = this.I;
                                if (j4 == -9223372036854775807L || j - Y().c < j4) {
                                    this.I0 = Math.max(this.I0, j);
                                }
                                if (m() || s93Var.isLastSample()) {
                                    pm6 Y5 = Y();
                                    pm6 Y6 = Y();
                                    pm6 pm6Var2 = pm6.i;
                                    Y5.h = (Y6.f & 1) != 0 ? this.I0 : this.H0;
                                }
                                s93Var.d();
                                if (s93Var.hasSupplementalData()) {
                                    a0(s93Var);
                                }
                                p0(s93Var);
                                int U = U(s93Var);
                                long j5 = j + this.U0;
                                int i4 = this.t0;
                                if (flag) {
                                    jm6Var.a(i4, s93Var.b, j5, U);
                                } else {
                                    ByteBuffer byteBuffer4 = s93Var.c;
                                    byteBuffer4.getClass();
                                    jm6Var.b(i4, byteBuffer4.limit(), U, j5);
                                }
                                this.t0 = -1;
                                s93Var.c = null;
                                this.E0 = true;
                                this.B0 = (byte) 0;
                                this.O0.c++;
                                return true;
                            }
                        } else {
                            s93Var.clear();
                            this.O0.d++;
                            if (this.B0 == 2) {
                                this.B0 = (byte) 1;
                                return true;
                            }
                        }
                        return true;
                    }
                    pm6 Y7 = Y();
                    pm6 Y8 = Y();
                    pm6 pm6Var3 = pm6.i;
                    Y7.h = (Y8.f & 1) != 0 ? this.I0 : this.H0;
                    if (this.B0 == 2) {
                        s93Var.clear();
                        this.B0 = (byte) 1;
                    }
                    this.J0 = true;
                    if (!this.E0) {
                        q0();
                        return false;
                    }
                    if (!this.p0) {
                        this.F0 = true;
                        jm6Var.b(this.t0, 0, 4, 0L);
                        this.t0 = -1;
                        s93Var.c = null;
                        return false;
                    }
                }
            } catch (r93 e) {
                g0(e);
                s0(0);
                R();
                return true;
            }
        }
        return false;
    }

    public final void R() {
        try {
            jm6 jm6Var = this.c0;
            jm6Var.getClass();
            jm6Var.flush();
        } finally {
            w0();
        }
    }

    public final boolean S() {
        if (this.c0 != null) {
            if (D0()) {
                t0();
                return true;
            }
            if (B0()) {
                R();
                return false;
            }
            if (this.E0) {
                this.T0 = true;
            }
        }
        return false;
    }

    public final List T(boolean z) {
        ko4 ko4Var = this.U;
        ko4Var.getClass();
        ArrayList W = W(ko4Var, z);
        if (!W.isEmpty() || !z) {
            return W;
        }
        ArrayList W2 = W(ko4Var, false);
        if (!W2.isEmpty()) {
            efd.f("MediaCodecRenderer", "Drm session requires secure decoder for " + ko4Var.t + ", but no secure decoder available. Trying to proceed with " + W2 + ".");
        }
        return W2;
    }

    public int U(s93 s93Var) {
        return 0;
    }

    public float V(float f, ko4 ko4Var, ko4[] ko4VarArr) {
        MediaFormat mediaFormat;
        int i = -1;
        for (ko4 ko4Var2 : ko4VarArr) {
            int i2 = ko4Var2.P;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1 && (mediaFormat = this.e0) != null && mediaFormat.containsKey("sample-rate")) {
            i = mediaFormat.getInteger("sample-rate");
        }
        if (i == -1) {
            return -1.0f;
        }
        return i * f;
    }

    public abstract ArrayList W(ko4 ko4Var, boolean z);

    public long X(long j, long j2, boolean z) {
        return super.j(j, j2);
    }

    public final pm6 Y() {
        ArrayDeque arrayDeque = this.R;
        return !arrayDeque.isEmpty() ? (pm6) arrayDeque.getLast() : this.P0;
    }

    public abstract fp Z(nm6 nm6Var, ko4 ko4Var, MediaCrypto mediaCrypto, float f);

    public abstract void a0(s93 s93Var);

    /* JADX WARN: Removed duplicated region for block: B:27:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b0(nm6 nm6Var, MediaCrypto mediaCrypto) {
        byte b;
        this.j0 = nm6Var;
        ko4 ko4Var = this.U;
        ko4Var.getClass();
        String str = nm6Var.a;
        float f = this.b0;
        ko4[] ko4VarArr = this.s;
        ko4VarArr.getClass();
        float V = V(f, ko4Var, ko4VarArr);
        if (V <= 0.0f) {
            V = -1.0f;
        }
        this.h.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        fp Z = Z(nm6Var, ko4Var, mediaCrypto, V);
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            ig8 ig8Var = this.f;
            ig8Var.getClass();
            zz.y(Z, ig8Var);
        }
        try {
            Trace.beginSection("createCodec:" + str);
            jm6 a = this.L.a(Z);
            this.c0 = a;
            this.r0 = a.d(new aj3((Object) this, (byte) 20));
            Trace.endSection();
            this.h.getClass();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!nm6Var.e(this.K, ko4Var)) {
                String c = ko4.c(ko4Var);
                Locale locale = Locale.US;
                efd.f("MediaCodecRenderer", c00.j("Format exceeds selected codec's capabilities [", c, ", ", str, "]"));
            }
            this.g0 = V;
            this.d0 = ko4Var;
            HashSet hashSet = gt6.a;
            boolean z = false;
            if (i <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
                String str2 = Build.MODEL;
                if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                    b = 2;
                    this.k0 = b;
                    this.l0 = i != 29 && "c2.android.aac.decoder".equals(str);
                    this.m0 = i != 23 && "OMX.google.vorbis.decoder".equals(str);
                    String str3 = nm6Var.a;
                    if ((i <= 25 && "OMX.rk.video_decoder.avc".equals(str3)) || ((i <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str3) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str3) || "OMX.bcm.vdec.avc.tunnel".equals(str3) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str3) || "OMX.bcm.vdec.hevc.tunnel".equals(str3) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str3))) || ("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && nm6Var.f))) {
                        z = true;
                    }
                    this.p0 = z;
                    this.c0.getClass();
                    if (this.n == 2) {
                        this.h.getClass();
                        this.s0 = SystemClock.elapsedRealtime() + 1000;
                    }
                    this.O0.a++;
                    long j = elapsedRealtime2 - elapsedRealtime;
                    if (i >= 31 && !this.Y0.isEmpty()) {
                        jm6 jm6Var = this.c0;
                        jm6Var.getClass();
                        jm6Var.l(new ArrayList(this.Y0));
                    }
                    h0(elapsedRealtime2, j, str);
                }
            }
            if (i < 24 && ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str))) {
                String str4 = Build.DEVICE;
                if ("flounder".equals(str4) || "flounder_lte".equals(str4) || "grouper".equals(str4) || "tilapia".equals(str4)) {
                    b = 1;
                    this.k0 = b;
                    this.l0 = i != 29 && "c2.android.aac.decoder".equals(str);
                    this.m0 = i != 23 && "OMX.google.vorbis.decoder".equals(str);
                    String str32 = nm6Var.a;
                    if (i <= 25) {
                        z = true;
                        this.p0 = z;
                        this.c0.getClass();
                        if (this.n == 2) {
                        }
                        this.O0.a++;
                        long j2 = elapsedRealtime2 - elapsedRealtime;
                        if (i >= 31) {
                            jm6 jm6Var2 = this.c0;
                            jm6Var2.getClass();
                            jm6Var2.l(new ArrayList(this.Y0));
                        }
                        h0(elapsedRealtime2, j2, str);
                    }
                    z = true;
                    this.p0 = z;
                    this.c0.getClass();
                    if (this.n == 2) {
                    }
                    this.O0.a++;
                    long j22 = elapsedRealtime2 - elapsedRealtime;
                    if (i >= 31) {
                    }
                    h0(elapsedRealtime2, j22, str);
                }
            }
            b = 0;
            this.k0 = b;
            this.l0 = i != 29 && "c2.android.aac.decoder".equals(str);
            this.m0 = i != 23 && "OMX.google.vorbis.decoder".equals(str);
            String str322 = nm6Var.a;
            if (i <= 25) {
            }
            z = true;
            this.p0 = z;
            this.c0.getClass();
            if (this.n == 2) {
            }
            this.O0.a++;
            long j222 = elapsedRealtime2 - elapsedRealtime;
            if (i >= 31) {
            }
            h0(elapsedRealtime2, j222, str);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final boolean c0(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        ko4 ko4Var = this.V;
        return ko4Var == null || !Objects.equals(ko4Var.t, "audio/opus") || j - j2 > 80000;
    }

    @Override // vg0, lg8
    public void d(int i, Object obj) {
        int i2;
        if (i == 11) {
            w64 w64Var = (w64) obj;
            w64Var.getClass();
            this.Y = w64Var;
            return;
        }
        if (i != 21) {
            if (i != 22 || (i2 = Build.VERSION.SDK_INT) < 29) {
                return;
            }
            obj.getClass();
            bp5 bp5Var = (bp5) obj;
            if (this.Y0.equals(bp5Var)) {
                return;
            }
            if (i2 >= 31) {
                HashSet hashSet = new HashSet(bp5Var);
                HashSet hashSet2 = new HashSet();
                v9c it = this.Y0.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (!hashSet.remove(str)) {
                        hashSet2.add(str);
                    }
                }
                jm6 jm6Var = this.c0;
                if (jm6Var != null) {
                    if (!hashSet2.isEmpty()) {
                        jm6Var.n(new ArrayList(hashSet2));
                    }
                    if (!hashSet.isEmpty()) {
                        jm6Var.l(new ArrayList(hashSet));
                    }
                }
            }
            this.Y0 = bp5Var;
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            obj.getClass();
            pk2 pk2Var = (pk2) obj;
            this.W0 = pk2Var;
            jm6 jm6Var2 = this.c0;
            if (jm6Var2 != null) {
                Bundle bundle = new Bundle();
                for (Map.Entry entry : pk2Var.a.entrySet()) {
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
                jm6Var2.setParameters(bundle);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006b, code lost:
    
        if (r7 != 4) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0084, code lost:
    
        if (r2.g() != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b9, code lost:
    
        if (r2.f(r1) == false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d0() {
        ko4 ko4Var;
        if (this.c0 != null || this.x0 || (ko4Var = this.U) == null) {
            return;
        }
        String str = ko4Var.t;
        boolean z = true;
        if (this.X == null && E0(ko4Var)) {
            this.x0 = false;
            v0();
            boolean equals = "audio/mp4a-latm".equals(str);
            ah0 ah0Var = this.P;
            if (equals || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                ah0Var.w = (byte) 32;
            } else {
                ah0Var.w = (byte) 1;
            }
            this.x0 = true;
            return;
        }
        y0(this.X);
        if (this.W != null) {
            yve.p(this.Z == null);
            jr3 jr3Var = this.W;
            or4 h = jr3Var.h();
            HashSet hashSet = gt6.a;
            if (or4.c && h != null) {
                int e = jr3Var.e();
                if (e == 1) {
                    ir3 g = jr3Var.g();
                    g.getClass();
                    throw e(g, this.U, false, g.a);
                }
            }
            if (h != null) {
                try {
                    this.Z = new MediaCrypto(h.a, h.b);
                } catch (MediaCryptoException e2) {
                    throw e(e2, this.U, false, 6006);
                }
            }
        }
        try {
            jr3 jr3Var2 = this.W;
            if (jr3Var2 != null && (jr3Var2.e() == 3 || this.W.e() == 4)) {
                jr3 jr3Var3 = this.W;
                str.getClass();
            }
            z = false;
            e0(this.Z, z);
            MediaCrypto mediaCrypto = this.Z;
            if (mediaCrypto == null || this.c0 != null) {
                return;
            }
            mediaCrypto.release();
            this.Z = null;
        } catch (om6 e3) {
            throw e(e3, ko4Var, false, 4001);
        }
    }

    public final void e0(MediaCrypto mediaCrypto, boolean z) {
        ko4 ko4Var = this.U;
        ko4Var.getClass();
        if (this.h0 == null) {
            try {
                List T = T(z);
                this.h0 = new ArrayDeque();
                ArrayList arrayList = (ArrayList) T;
                if (!arrayList.isEmpty()) {
                    this.h0.add((nm6) arrayList.get(0));
                }
                this.i0 = null;
            } catch (tm6 e) {
                throw new om6(ko4Var, e, z, -49998);
            }
        }
        if (this.h0.isEmpty()) {
            throw new om6(ko4Var, null, z, -49999);
        }
        ArrayDeque arrayDeque = this.h0;
        arrayDeque.getClass();
        while (this.c0 == null) {
            nm6 nm6Var = (nm6) arrayDeque.peekFirst();
            nm6Var.getClass();
            if (!f0(ko4Var) || !C0(nm6Var)) {
                return;
            }
            try {
                b0(nm6Var, mediaCrypto);
            } catch (Exception e2) {
                efd.g("MediaCodecRenderer", "Failed to initialize decoder: " + nm6Var, e2);
                arrayDeque.removeFirst();
                om6 om6Var = new om6("Decoder init failed: " + nm6Var.a + ", " + ko4Var, e2, ko4Var.t, z, nm6Var, e2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e2).getDiagnosticInfo() : null);
                g0(om6Var);
                om6 om6Var2 = this.i0;
                if (om6Var2 == null) {
                    this.i0 = om6Var;
                } else {
                    this.i0 = new om6(om6Var2.getMessage(), om6Var2.getCause(), om6Var2.a, om6Var2.b, om6Var2.c, om6Var2.d);
                }
                if (arrayDeque.isEmpty()) {
                    throw this.i0;
                }
            }
        }
        this.h0 = null;
    }

    public boolean f0(ko4 ko4Var) {
        return true;
    }

    public abstract void g0(Exception exc);

    public abstract void h0(long j, long j2, String str);

    public abstract void i0(pk2 pk2Var);

    @Override // vg0
    public final long j(long j, long j2) {
        return X(j, j2, this.r0);
    }

    public abstract void j0(String str);

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0158, code lost:
    
        if (O() == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0166, code lost:
    
        if (O() == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        if (j$.util.Objects.equals(r2, "video/av01") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0103, code lost:
    
        if (r4.f(r2) == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x012d, code lost:
    
        if (O() == false) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w93 k0(ym4 ym4Var) {
        ko4 ko4Var;
        int i;
        String str;
        Pair b;
        boolean z = true;
        this.L0 = true;
        ko4 ko4Var2 = (ko4) ym4Var.c;
        ko4Var2.getClass();
        String str2 = ko4Var2.t;
        if (str2 == null) {
            throw e(new IllegalArgumentException("Sample MIME type is null."), ko4Var2, false, 4005);
        }
        if (!str2.equals("video/av01") && !str2.equals("video/x-vnd.on2.vp9")) {
            if (str2.equals("video/dolby-vision")) {
                byte[] bArr = rk2.a;
                if (str2.equals("video/dolby-vision") && (b = rk2.b(ko4Var2)) != null) {
                    int intValue = ((Integer) b.first).intValue();
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
            ko4Var = ko4Var2;
            jr3 jr3Var = (jr3) ym4Var.b;
            bs2.C(this.X, jr3Var);
            this.X = jr3Var;
            this.U = ko4Var;
            if (this.x0) {
                this.z0 = true;
                return null;
            }
            jm6 jm6Var = this.c0;
            if (jm6Var == null) {
                this.h0 = null;
                d0();
                return null;
            }
            nm6 nm6Var = this.j0;
            nm6Var.getClass();
            ko4 ko4Var3 = this.d0;
            ko4Var3.getClass();
            jr3 jr3Var2 = this.W;
            jr3 jr3Var3 = this.X;
            if (jr3Var2 != jr3Var3) {
                if (jr3Var3 != null && jr3Var2 != null && jr3Var3.h() != null && jr3Var2.h() != null && or4.class.equals(or4.class) && jr3Var3.a().equals(jr3Var2.a())) {
                    UUID uuid = o51.f;
                    if (!uuid.equals(jr3Var2.a()) && !uuid.equals(jr3Var3.a())) {
                        if (!nm6Var.f) {
                            if (jr3Var3.e() != 2) {
                                if (jr3Var3.e() == 3 || jr3Var3.e() == 4) {
                                    String str3 = ko4Var.t;
                                    str3.getClass();
                                }
                            }
                        }
                    }
                }
                if (this.E0) {
                    this.C0 = (byte) 1;
                    this.D0 = (byte) 3;
                } else {
                    t0();
                    d0();
                }
                return new w93(nm6Var.a, ko4Var3, ko4Var, 0, 128);
            }
            boolean z2 = this.X != this.W;
            w93 M = M(nm6Var, ko4Var3, ko4Var, Y().g);
            byte b2 = M.d;
            if (b2 != 0) {
                if (b2 == 1) {
                    G0(ko4Var);
                    this.d0 = ko4Var;
                    if (!z2) {
                        if (this.E0) {
                            this.C0 = (byte) 1;
                            if (D0()) {
                                this.D0 = (byte) 3;
                                i = 2;
                            } else {
                                this.D0 = (byte) 1;
                            }
                        }
                    }
                } else if (b2 == 2) {
                    G0(ko4Var);
                    this.A0 = true;
                    this.B0 = (byte) 1;
                    byte b3 = this.k0;
                    if (b3 != 2 && (b3 != 1 || ko4Var.A != ko4Var3.A || ko4Var.B != ko4Var3.B)) {
                        z = false;
                    }
                    this.n0 = z;
                    this.d0 = ko4Var;
                    if (z2) {
                    }
                } else {
                    if (b2 != 3) {
                        grb.g();
                        return null;
                    }
                    G0(ko4Var);
                    this.d0 = ko4Var;
                    if (z2) {
                    }
                }
                return (b2 != 0 || (this.c0 == jm6Var && this.D0 != 3)) ? M : new w93(nm6Var.a, ko4Var3, ko4Var, 0, i);
            }
            if (this.E0) {
                this.C0 = (byte) 1;
                this.D0 = (byte) 3;
            } else {
                t0();
                d0();
            }
            i = 0;
            if (b2 != 0) {
            }
        }
        if (!ko4Var2.w.isEmpty()) {
            jo4 a = ko4Var2.a();
            a.v = null;
            ko4Var = new ko4(a);
            jr3 jr3Var4 = (jr3) ym4Var.b;
            bs2.C(this.X, jr3Var4);
            this.X = jr3Var4;
            this.U = ko4Var;
            if (this.x0) {
            }
        }
        ko4Var = ko4Var2;
        jr3 jr3Var42 = (jr3) ym4Var.b;
        bs2.C(this.X, jr3Var42);
        this.X = jr3Var42;
        this.U = ko4Var;
        if (this.x0) {
        }
    }

    public abstract void l0(ko4 ko4Var, MediaFormat mediaFormat);

    public void n0(long j) {
        this.Q0 = Math.max(j, this.Q0);
        while (true) {
            ArrayDeque arrayDeque = this.R;
            if (arrayDeque.isEmpty() || j < ((pm6) arrayDeque.peek()).a) {
                return;
            }
            pm6 pm6Var = (pm6) arrayDeque.poll();
            pm6Var.getClass();
            z0(pm6Var);
            o0();
        }
    }

    public abstract void o0();

    @Override // vg0
    public void q() {
        this.U = null;
        z0(pm6.i);
        this.R.clear();
        if (!this.x0) {
            S();
        } else {
            this.x0 = false;
            v0();
        }
    }

    public final void q0() {
        byte b = this.D0;
        if (b == 1) {
            R();
            return;
        }
        if (b == 2) {
            R();
            H0();
        } else if (b != 3) {
            this.K0 = true;
            u0();
        } else {
            t0();
            d0();
        }
    }

    public abstract boolean r0(long j, long j2, jm6 jm6Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, ko4 ko4Var);

    @Override // vg0
    public void s(long j, boolean z, boolean z2) {
        ArrayDeque arrayDeque = this.R;
        if (!arrayDeque.isEmpty()) {
            this.P0 = (pm6) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (z2) {
            this.J0 = false;
            this.K0 = false;
            this.M0 = false;
            if (this.x0) {
                v0();
            } else if (S()) {
                d0();
            }
            if (this.P0.d.p() > 0) {
                this.L0 = true;
            }
            this.P0.d.c();
            this.P0.g = false;
        }
    }

    public final boolean s0(int i) {
        ym4 ym4Var = this.c;
        ym4Var.t();
        s93 s93Var = this.M;
        s93Var.clear();
        int A = A(ym4Var, s93Var, i | 4);
        if (A == -5) {
            k0(ym4Var);
            return true;
        }
        if (A != -4 || !s93Var.isEndOfStream()) {
            return false;
        }
        this.J0 = true;
        q0();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
    
        r3.Z = null;
        y0(null);
        x0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        throw r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t0() {
        try {
            jm6 jm6Var = this.c0;
            if (jm6Var != null) {
                jm6Var.release();
                this.O0.b++;
                nm6 nm6Var = this.j0;
                nm6Var.getClass();
                j0(nm6Var.a);
            }
        } finally {
            this.c0 = null;
            MediaCrypto mediaCrypto = this.Z;
            if (mediaCrypto != null) {
                mediaCrypto.release();
            }
        }
    }

    public abstract void u0();

    public final void v0() {
        this.H0 = -9223372036854775807L;
        this.I0 = -9223372036854775807L;
        Y().h = -9223372036854775807L;
        this.Q0 = -9223372036854775807L;
        this.z0 = false;
        this.P.clear();
        this.O.clear();
        this.y0 = false;
        ByteBuffer byteBuffer = q20.a;
        ir7 ir7Var = this.S;
        ir7Var.a = byteBuffer;
        ir7Var.c = 0;
        ir7Var.b = 2;
    }

    public void w0() {
        this.t0 = -1;
        this.N.c = null;
        this.u0 = -1;
        this.v0 = null;
        this.H0 = -9223372036854775807L;
        this.I0 = -9223372036854775807L;
        Y().h = -9223372036854775807L;
        this.Q0 = -9223372036854775807L;
        this.s0 = -9223372036854775807L;
        this.F0 = false;
        this.q0 = -9223372036854775807L;
        this.E0 = false;
        this.n0 = false;
        this.o0 = false;
        this.w0 = false;
        this.C0 = (byte) 0;
        this.D0 = (byte) 0;
        this.B0 = this.A0 ? (byte) 1 : (byte) 0;
        this.T0 = false;
        this.U0 = 0L;
        this.V0 = -9223372036854775807L;
    }

    public final void x0() {
        w0();
        this.N0 = null;
        this.h0 = null;
        this.j0 = null;
        this.d0 = null;
        this.e0 = null;
        this.f0 = false;
        this.G0 = false;
        this.g0 = -1.0f;
        this.k0 = (byte) 0;
        this.l0 = false;
        this.m0 = false;
        this.p0 = false;
        this.r0 = false;
        this.A0 = false;
        this.B0 = (byte) 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (r2 >= r0) goto L16;
     */
    @Override // vg0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void y(ko4[] ko4VarArr, long j, long j2, vz6 vz6Var) {
        long j3 = this.I;
        at9 at9Var = this.r;
        at9Var.getClass();
        int a = at9Var.a();
        if (this.P0.c == -9223372036854775807L) {
            z0(new pm6(-9223372036854775807L, j, j2, j3, a));
            if (this.S0) {
                o0();
                return;
            }
            return;
        }
        ArrayDeque arrayDeque = this.R;
        if (arrayDeque.isEmpty()) {
            long j4 = this.H0;
            if (j4 != -9223372036854775807L) {
                long j5 = this.Q0;
                if (j5 != -9223372036854775807L) {
                }
            }
            z0(new pm6(-9223372036854775807L, j, j2, j3, a));
            if (this.P0.c != -9223372036854775807L) {
                o0();
                return;
            }
            return;
        }
        arrayDeque.add(new pm6(this.H0, j, j2, j3, a));
    }

    public final void y0(jr3 jr3Var) {
        bs2.C(this.W, jr3Var);
        this.W = jr3Var;
    }

    @Override // vg0
    public final void z() {
        Y().e = this.I;
    }

    public final void z0(pm6 pm6Var) {
        this.P0 = pm6Var;
        long j = pm6Var.c;
        if (j != -9223372036854775807L) {
            this.R0 = true;
            m0(j);
        }
    }

    public void m0(long j) {
    }

    public void p0(s93 s93Var) {
    }
}
