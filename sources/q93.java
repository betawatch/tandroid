// default package

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class q93 implements x30 {
    public long A;
    public long B;
    public long C;
    public int D;
    public int E;
    public long F;
    public boolean G;
    public boolean H;
    public long I;
    public long J;
    public float K;
    public ByteBuffer L;
    public int M;
    public ByteBuffer N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public int T;
    public boolean U;
    public ta0 V;
    public AudioDeviceInfo W;
    public int X;
    public boolean Y;
    public long Z;
    public final Context a;
    public boolean a0;
    public final mv6 b;
    public boolean b0;
    public final ci1 c;
    public long c0;
    public final e2c d;
    public long d0;
    public final bpb e;
    public Handler e0;
    public final bpb f;
    public final w59 g;
    public final ArrayDeque h;
    public byte i;
    public o93 j;
    public final ly0 k;
    public final ly0 l;
    public uc8 m;
    public u30 n;
    public wg2 o;
    public wg2 p;
    public k20 q;
    public s00 r;
    public n93 s;
    public j40 t;
    public nz u;
    public p93 v;
    public p93 w;
    public zb8 x;
    public boolean y;
    public long z;

    public q93(c30 c30Var) {
        int deviceId;
        Context context = (Context) c30Var.b;
        this.a = context == null ? null : context.getApplicationContext();
        this.u = nz.i;
        this.b = (mv6) c30Var.d;
        this.i = (byte) 0;
        this.r = (l40) c30Var.f;
        ci1 ci1Var = new ci1();
        this.c = ci1Var;
        e2c e2cVar = new e2c();
        e2cVar.m = g8c.b;
        this.d = e2cVar;
        this.e = new bpb((byte) 1);
        this.f = new bpb((byte) 0);
        this.g = mm5.v(e2cVar, ci1Var);
        this.K = 1.0f;
        this.T = 0;
        this.V = new ta0();
        zb8 zb8Var = zb8.d;
        this.w = new p93(zb8Var, 0L, 0L);
        this.x = zb8Var;
        this.y = false;
        this.h = new ArrayDeque();
        this.k = new ly0(this);
        this.l = new ly0(this);
        int i = -1;
        if (Build.VERSION.SDK_INT >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i = deviceId;
        }
        this.X = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int k(int i, ByteBuffer byteBuffer) {
        int i2;
        int i3;
        byte b;
        int i4;
        byte b2;
        int i5;
        int i6;
        int i7;
        int i8;
        if (i == 20) {
            if ((byteBuffer.get(5) & 2) == 0) {
                i2 = 0;
            } else {
                byte b3 = byteBuffer.get(26);
                int i9 = 28;
                int i10 = 28;
                for (int i11 = 0; i11 < b3; i11++) {
                    i10 += byteBuffer.get(i11 + 27);
                }
                byte b4 = byteBuffer.get(i10 + 26);
                for (int i12 = 0; i12 < b4; i12++) {
                    i9 += byteBuffer.get(i10 + 27 + i12);
                }
                i2 = i10 + i9;
            }
            int i13 = byteBuffer.get(i2 + 26) + 27 + i2;
            return (int) ((gqe.b(byteBuffer.get(i13), byteBuffer.limit() - i13 > 1 ? byteBuffer.get(i13 + 1) : (byte) 0) * 48000) / 1000000);
        }
        if (i != 30) {
            switch (i) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int position = byteBuffer.position();
                    String str = g8c.a;
                    int i14 = byteBuffer.getInt(position);
                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                        i14 = Integer.reverseBytes(i14);
                    }
                    if ((i14 & (-2097152)) == -2097152 && (i6 = (i14 >>> 19) & 3) != 1 && (i7 = (i14 >>> 17) & 3) != 0) {
                        int i15 = (i14 >>> 12) & 15;
                        int i16 = (i14 >>> 10) & 3;
                        if (i15 != 0 && i15 != 15 && i16 != 3) {
                            i5 = 1152;
                            if (i7 != 1) {
                                if (i7 != 2) {
                                    if (i7 != 3) {
                                        sc8.e();
                                        return 0;
                                    }
                                    i5 = 384;
                                }
                            } else if (i6 != 3) {
                                i5 = 576;
                            }
                            if (i5 == -1) {
                                return i5;
                            }
                            sc8.e();
                            return 0;
                        }
                    }
                    i5 = -1;
                    if (i5 == -1) {
                    }
                    break;
                case 10:
                    return 1024;
                case 11:
                case 12:
                    return 2048;
                default:
                    switch (i) {
                        case 14:
                            int position2 = byteBuffer.position();
                            int limit = byteBuffer.limit() - 10;
                            int i17 = position2;
                            while (true) {
                                if (i17 <= limit) {
                                    String str2 = g8c.a;
                                    int i18 = byteBuffer.getInt(i17 + 4);
                                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                        i18 = Integer.reverseBytes(i18);
                                    }
                                    if ((i18 & (-2)) == -126718022) {
                                        i8 = i17 - position2;
                                    } else {
                                        i17++;
                                    }
                                } else {
                                    i8 = -1;
                                }
                            }
                            if (i8 == -1) {
                                return 0;
                            }
                            return (40 << ((byteBuffer.get((byteBuffer.position() + i8) + (((byteBuffer.get((byteBuffer.position() + i8) + 7) & 255) == 187 ? (byte) 1 : (byte) 0) != 0 ? 9 : 8)) >> 4) & 7)) << 4;
                        case 15:
                            return 512;
                        case 16:
                            return 1024;
                        case 17:
                            byte[] bArr = new byte[16];
                            int position3 = byteBuffer.position();
                            byteBuffer.get(bArr);
                            byteBuffer.position(position3);
                            return gi7.e(new qd1(16, bArr)).c;
                        case 18:
                            break;
                        default:
                            sc8.j(de9.k(i, "Unexpected audio encoding: "));
                            return 0;
                    }
            }
            if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                return cd3.b[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] << 8;
            }
            return 1536;
        }
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return TLObject.FLAG_12;
        }
        int position4 = byteBuffer.position();
        byte b5 = byteBuffer.get(position4);
        if (b5 != -2) {
            if (b5 == -1) {
                i3 = (byteBuffer.get(position4 + 4) & 7) << 4;
                b2 = byteBuffer.get(position4 + 7);
            } else if (b5 != 31) {
                i3 = (byteBuffer.get(position4 + 4) & 1) << 6;
                b = byteBuffer.get(position4 + 5);
            } else {
                i3 = (byteBuffer.get(position4 + 5) & 7) << 4;
                b2 = byteBuffer.get(position4 + 6);
            }
            i4 = b2 & 60;
            return ((i3 | (i4 >> 2)) + 1) << 5;
        }
        i3 = (byteBuffer.get(position4 + 5) & 1) << 6;
        b = byteBuffer.get(position4 + 4);
        i4 = b & 252;
        return ((i3 | (i4 >> 2)) + 1) << 5;
    }

    public final void A(ta0 ta0Var) {
        if (this.V.equals(ta0Var)) {
            return;
        }
        ta0Var.getClass();
        if (this.t != null) {
            this.V.getClass();
        }
        this.V = ta0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00e9, code lost:
    
        if (r9 < 0.0d) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0183, code lost:
    
        if (r9 < 0.0f) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00be, code lost:
    
        if (r9 < 0.0d) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f1, code lost:
    
        r9 = r9 * 2.147483647E9d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00eb, code lost:
    
        r9 = (-r9) * (-2.147483648E9d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00d7, code lost:
    
        if (r9 < 0.0f) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x018a, code lost:
    
        r9 = r9 * 2.1474836E9f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0185, code lost:
    
        r9 = (-r9) * (-2.1474836E9f);
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0294  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int i;
        byte b;
        int i2;
        int i3;
        float h;
        float f;
        double max;
        double d;
        gre.p(this.N == null);
        if (byteBuffer.hasRemaining()) {
            if (this.p.d()) {
                int b0 = (int) g8c.b0(g8c.T(20L), ((r00) this.p.e).b, 1000000L, RoundingMode.UP);
                long l = l();
                long j = b0;
                if (l < j) {
                    wg2 wg2Var = this.p;
                    int i4 = ((r00) wg2Var.e).a;
                    int i5 = wg2Var.b;
                    int i6 = (int) l;
                    byteBuffer2 = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int position = byteBuffer.position();
                    while (byteBuffer.hasRemaining() && i6 < b0) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 == 4) {
                                    h = g8c.h(byteBuffer.getFloat(), -1.0f, 1.0f);
                                } else if (i4 == 21) {
                                    i = ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                    b = byteBuffer.get();
                                } else if (i4 != 22) {
                                    if (i4 == 268435456) {
                                        i = (byteBuffer.get() & 255) << 24;
                                        i2 = (byteBuffer.get() & 255) << 16;
                                    } else if (i4 == 1342177280) {
                                        i = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16);
                                        i2 = (byteBuffer.get() & 255) << 8;
                                    } else if (i4 != 1610612736) {
                                        if (i4 == 1879048192) {
                                            max = Math.max(-1.0d, Math.min(byteBuffer.getDouble(), 1.0d));
                                        } else if (i4 == 1895825408) {
                                            h = g8c.h(Float.intBitsToFloat(Integer.reverseBytes(byteBuffer.getInt())), -1.0f, 1.0f);
                                        } else {
                                            if (i4 != 1912602624) {
                                                sdb.a();
                                                return;
                                            }
                                            max = Math.max(-1.0d, Math.min(Double.longBitsToDouble(Long.reverseBytes(byteBuffer.getLong())), 1.0d));
                                        }
                                        i3 = (int) d;
                                    } else {
                                        i = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8);
                                        i2 = byteBuffer.get() & 255;
                                    }
                                    i3 = i | i2;
                                } else {
                                    i = (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                    b = byteBuffer.get();
                                }
                                i3 = (int) f;
                            } else {
                                i3 = ((byteBuffer.get() & 255) - 128) << 24;
                            }
                            int i7 = (int) ((i3 * i6) / j);
                            if (i4 != 2) {
                                byteBuffer2.put((byte) (i7 >> 16));
                                byteBuffer2.put((byte) (i7 >> 24));
                            } else if (i4 == 3) {
                                byteBuffer2.put((byte) ((i7 >> 24) + 128));
                            } else if (i4 != 4) {
                                if (i4 == 21) {
                                    byteBuffer2.put((byte) (i7 >> 8));
                                    byteBuffer2.put((byte) (i7 >> 16));
                                    byteBuffer2.put((byte) (i7 >> 24));
                                } else if (i4 == 22) {
                                    byteBuffer2.put((byte) i7);
                                    byteBuffer2.put((byte) (i7 >> 8));
                                    byteBuffer2.put((byte) (i7 >> 16));
                                    byteBuffer2.put((byte) (i7 >> 24));
                                } else if (i4 == 268435456) {
                                    byteBuffer2.put((byte) (i7 >> 24));
                                    byteBuffer2.put((byte) (i7 >> 16));
                                } else if (i4 == 1342177280) {
                                    byteBuffer2.put((byte) (i7 >> 24));
                                    byteBuffer2.put((byte) (i7 >> 16));
                                    byteBuffer2.put((byte) (i7 >> 8));
                                } else if (i4 == 1610612736) {
                                    byteBuffer2.put((byte) (i7 >> 24));
                                    byteBuffer2.put((byte) (i7 >> 16));
                                    byteBuffer2.put((byte) (i7 >> 8));
                                    byteBuffer2.put((byte) i7);
                                } else if (i4 != 1879048192) {
                                    if (i4 == 1895825408) {
                                        byteBuffer2.putInt(Integer.reverseBytes(Float.floatToIntBits(i7 < 0 ? (-i7) / (-2.1474836E9f) : i7 / 2.1474836E9f)));
                                    } else {
                                        if (i4 != 1912602624) {
                                            sdb.a();
                                            return;
                                        }
                                        byteBuffer2.putLong(Long.reverseBytes(Double.doubleToLongBits(i7 < 0 ? (-i7) / (-2.147483648E9d) : i7 / 2.147483647E9d)));
                                    }
                                } else if (i7 < 0) {
                                    byteBuffer2.putDouble((-i7) / (-2.147483648E9d));
                                } else {
                                    byteBuffer2.putDouble(i7 / 2.147483647E9d);
                                }
                            } else if (i7 < 0) {
                                byteBuffer2.putFloat((-i7) / (-2.1474836E9f));
                            } else {
                                byteBuffer2.putFloat(i7 / 2.1474836E9f);
                            }
                            if (byteBuffer.position() != position + i5) {
                                i6++;
                                position = byteBuffer.position();
                            }
                        } else {
                            i = (byteBuffer.get() & 255) << 16;
                            b = byteBuffer.get();
                        }
                        i2 = (b & 255) << 24;
                        i3 = i | i2;
                        int i72 = (int) ((i3 * i6) / j);
                        if (i4 != 2) {
                        }
                        if (byteBuffer.position() != position + i5) {
                        }
                    }
                    byteBuffer2.put(byteBuffer);
                    byteBuffer2.flip();
                    this.N = byteBuffer2;
                }
            }
            byteBuffer2 = byteBuffer;
            this.N = byteBuffer2;
        }
    }

    public final void C(zb8 zb8Var) {
        if (E()) {
            this.x = zb8Var;
            x();
            return;
        }
        zb8 zb8Var2 = new zb8(g8c.h(zb8Var.a, 0.1f, 8.0f), g8c.h(zb8Var.b, 0.1f, 8.0f));
        this.x = zb8Var2;
        p93 p93Var = new p93(zb8Var2, -9223372036854775807L, -9223372036854775807L);
        if (p()) {
            this.v = p93Var;
        } else {
            this.w = p93Var;
        }
    }

    public final void D(long j) {
        long j2;
        wg2 wg2Var = this.p;
        this.q = (k20) wg2Var.f;
        if (j == -9223372036854775807L) {
            j2 = 0;
        } else {
            j2 = j - this.J;
            if (((aob) wg2Var.g) != aob.a && wg2Var.h != null) {
                xnb xnbVar = new xnb();
                wg2 wg2Var2 = this.p;
                ((aob) wg2Var2.g).g(wg2Var2.h, xnbVar);
                j2 += xnbVar.e;
            }
        }
        k20 k20Var = this.q;
        m20 m20Var = new m20();
        wg2 wg2Var3 = this.p;
        m20Var.b = (aob) wg2Var3.g;
        m20Var.c = wg2Var3.h;
        m20Var.a = j2;
        n20 a = m20Var.a();
        w59 w59Var = k20Var.a;
        ArrayList arrayList = k20Var.b;
        arrayList.clear();
        k20Var.d = false;
        for (int i = 0; i < w59Var.d; i++) {
            p20 p20Var = (p20) w59Var.get(i);
            p20Var.c(a);
            if (p20Var.isActive()) {
                m20 m20Var2 = new m20();
                long j3 = a.a;
                m20Var2.a = j3;
                m20Var2.b = a.b;
                m20Var2.c = a.c;
                m20Var2.a = p20Var.g(j3);
                a = m20Var2.a();
                arrayList.add(p20Var);
            }
        }
        k20Var.c = new ByteBuffer[arrayList.size()];
        for (int i2 = 0; i2 <= k20Var.a(); i2++) {
            k20Var.c[i2] = ((p20) arrayList.get(i2)).b();
        }
    }

    public final boolean E() {
        wg2 wg2Var = this.p;
        return wg2Var != null && ((r00) wg2Var.e).j;
    }

    public final void a(long j) {
        zb8 zb8Var;
        boolean E = E();
        boolean z = false;
        mv6 mv6Var = this.b;
        if (E) {
            zb8Var = zb8.d;
        } else {
            if (this.Y || !this.p.d()) {
                zb8Var = zb8.d;
            } else {
                int i = ((fm4) this.p.c).Q;
                zb8Var = this.x;
                mka mkaVar = (mka) mv6Var.d;
                float f = zb8Var.a;
                gre.f(f > 0.0f);
                if (mkaVar.b != f) {
                    mkaVar.b = f;
                    mkaVar.h = true;
                }
                float f2 = zb8Var.b;
                gre.f(f2 > 0.0f);
                if (mkaVar.c != f2) {
                    mkaVar.c = f2;
                    mkaVar.h = true;
                }
            }
            this.x = zb8Var;
        }
        zb8 zb8Var2 = zb8Var;
        if (!this.Y && this.p.d()) {
            int i2 = ((fm4) this.p.c).Q;
            z = this.y;
            ((lha) mv6Var.c).j = z;
        }
        this.y = z;
        this.h.add(new p93(zb8Var2, Math.max(0L, j), g8c.Z(((r00) this.p.e).b, l())));
        D(j);
        u30 u30Var = this.n;
        if (u30Var != null) {
            u30Var.h(this.y);
        }
    }

    public final j40 b(r00 r00Var) {
        try {
            return ((l40) this.r).a(r00Var);
        } catch (p00 e) {
            t30 t30Var = new t30(r00Var.b, r00Var.c, r00Var.a, r00Var.f, (fm4) this.p.c, r00Var.e, e);
            u30 u30Var = this.n;
            if (u30Var == null) {
                throw t30Var;
            }
            u30Var.w1(t30Var);
            throw t30Var;
        }
    }

    public final void c(r30 r30Var) {
        int i;
        k20 k20Var;
        fm4 fm4Var;
        int i2;
        if (this.s == null && this.a != null) {
            n93 n93Var = new n93(this);
            this.s = n93Var;
            l40 l40Var = (l40) this.r;
            l40Var.f();
            a66 a66Var = l40Var.e;
            if (a66Var == null) {
                a66Var = new a66(Thread.currentThread());
                l40Var.e = a66Var;
            }
            a66Var.a(n93Var);
        }
        fm4 fm4Var2 = r30Var.a;
        String str = fm4Var2.t;
        int i3 = fm4Var2.N;
        int i4 = fm4Var2.Q;
        if ("audio/raw".equals(str)) {
            gre.f(g8c.N(i4));
            int u = g8c.u(i4) * i3;
            jm5 jm5Var = new jm5(4);
            jm5Var.d(this.g);
            jm5Var.c(this.e);
            p20[] p20VarArr = (p20[]) this.b.b;
            int length = p20VarArr.length;
            xpe.a(length, p20VarArr);
            jm5Var.e(length);
            System.arraycopy(p20VarArr, 0, jm5Var.a, jm5Var.b, length);
            jm5Var.b += length;
            k20 k20Var2 = new k20(jm5Var.f());
            if (k20Var2.equals(this.q)) {
                k20Var2 = this.q;
            }
            int i5 = fm4Var2.R;
            int i6 = fm4Var2.S;
            e2c e2cVar = this.d;
            e2cVar.i = i5;
            e2cVar.j = i6;
            this.c.i = r30Var.b;
            l20 l20Var = new l20(fm4Var2.P, i3, i4);
            try {
                w59 w59Var = k20Var2.a;
                if (l20Var.equals(l20.e)) {
                    throw new o20(l20Var);
                }
                for (int i7 = 0; i7 < w59Var.d; i7++) {
                    p20 p20Var = (p20) w59Var.get(i7);
                    l20 e = p20Var.e(l20Var);
                    if (p20Var.isActive()) {
                        gre.p(!e.equals(l20.e));
                        l20Var = e;
                    }
                }
                int i8 = l20Var.b;
                int i9 = l20Var.c;
                em4 a = fm4Var2.a();
                a.P = i9;
                a.O = l20Var.a;
                a.M = i8;
                a.N = i8 == i3 ? fm4Var2.O : -1;
                fm4 fm4Var3 = new fm4(a);
                i = u;
                k20Var = k20Var2;
                i2 = g8c.u(i9) * i8;
                fm4Var = fm4Var3;
            } catch (o20 e2) {
                throw new s30(e2, fm4Var2);
            }
        } else {
            km5 km5Var = mm5.b;
            i = -1;
            k20Var = new k20(w59.e);
            fm4Var = fm4Var2;
            i2 = -1;
        }
        n00 i10 = i(fm4Var);
        fm4 fm4Var4 = (fm4) i10.a;
        try {
            r00 c = ((l40) this.r).c(i10);
            boolean z = c.e;
            if (c.a == 0) {
                throw new s30("Invalid output encoding (isOffload=" + z + ")", fm4Var4);
            }
            if (c.c == 0) {
                throw new s30("Invalid output channel config (isOffload=" + z + ")", fm4Var4);
            }
            this.a0 = false;
            aob aobVar = r30Var.c;
            rx6 rx6Var = r30Var.d;
            wg2 wg2Var = new wg2(fm4Var2, fm4Var, i, i2, c, k20Var, aobVar, rx6Var != null ? rx6Var.a : null);
            if (p()) {
                this.o = wg2Var;
            } else {
                this.p = wg2Var;
            }
        } catch (m00 e3) {
            throw new s30(e3, fm4Var2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(long j) {
        u30 u30Var;
        u30 u30Var2;
        boolean z;
        ly0 ly0Var = this.l;
        if (this.N == null) {
            return;
        }
        if (((Exception) ly0Var.c) != null) {
            ((l40) ((q93) ly0Var.d).r).getClass();
            synchronized (j40.s) {
                z = j40.u > 0;
            }
            if (z || SystemClock.elapsedRealtime() < ly0Var.b) {
                return;
            }
        }
        int remaining = this.N.remaining();
        try {
            boolean g = this.t.g(j, this.M, this.N);
            this.Z = SystemClock.elapsedRealtime();
            ly0Var.c = null;
            ly0Var.a = -9223372036854775807L;
            ly0Var.b = -9223372036854775807L;
            if (this.t.c()) {
                if (this.C > 0) {
                    this.b0 = false;
                }
                if (this.R && (u30Var2 = this.n) != null && !g && !this.b0) {
                    u30Var2.R();
                }
            }
            int remaining2 = remaining - this.N.remaining();
            if (this.p.d()) {
                this.B += remaining2;
            }
            wg2 wg2Var = this.p;
            if (g) {
                if (!wg2Var.d()) {
                    gre.p(this.N == this.L);
                    this.C = ((this.D * this.M) - this.F) + this.C;
                    this.F = 0L;
                }
                this.N = null;
                return;
            }
            if (wg2Var.d() || remaining2 <= 0) {
                return;
            }
            gre.p(this.E > 0);
            long b0 = g8c.b0(this.E - this.N.remaining(), this.M * this.D, this.E, RoundingMode.CEILING);
            this.C += b0 - this.F;
            this.F = b0;
        } catch (l00 e) {
            boolean z2 = e.b;
            if (z2) {
                if (l() <= 0) {
                    if (this.t.c()) {
                        if (((r00) this.p.e).e) {
                            this.a0 = true;
                        }
                    }
                }
                w30 w30Var = new w30(e.a, (fm4) this.p.c, r2);
                u30Var = this.n;
                if (u30Var != null) {
                    u30Var.w1(w30Var);
                }
                if (!z2) {
                    throw w30Var;
                }
                ly0Var.a(w30Var);
                return;
            }
            r2 = false;
            w30 w30Var2 = new w30(e.a, (fm4) this.p.c, r2);
            u30Var = this.n;
            if (u30Var != null) {
            }
            if (!z2) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0042 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e() {
        ByteBuffer byteBuffer;
        if (!this.q.c()) {
            d(Long.MIN_VALUE);
            return this.N == null;
        }
        k20 k20Var = this.q;
        if (k20Var.c() && !k20Var.d) {
            k20Var.d = true;
            ((p20) k20Var.b.get(0)).f();
        }
        u(Long.MIN_VALUE);
        if (!this.q.b() || ((byteBuffer = this.N) != null && byteBuffer.hasRemaining())) {
        }
    }

    public final void f() {
        e40 e40Var;
        if (p()) {
            this.z = 0L;
            this.A = 0L;
            this.B = 0L;
            this.C = 0L;
            this.b0 = false;
            this.D = 0;
            this.E = 0;
            this.F = 0L;
            this.w = new p93(this.x, 0L, 0L);
            this.I = 0L;
            this.v = null;
            this.h.clear();
            this.L = null;
            this.M = 0;
            this.N = null;
            this.P = false;
            this.O = false;
            this.Q = false;
            this.d.o = 0L;
            D(-9223372036854775807L);
            this.j = null;
            wg2 wg2Var = this.o;
            if (wg2Var != null) {
                this.p = wg2Var;
                this.o = null;
            }
            j40 j40Var = this.t;
            if (j40Var.e.d.getPlayState() == 3) {
                j40Var.a.pause();
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 29 && j40Var.c()) {
                i40 i40Var = j40Var.h;
                i40Var.getClass();
                i40Var.a();
            }
            if (i >= 24 && (e40Var = j40Var.d) != null) {
                e40Var.b();
                j40Var.d = null;
            }
            AudioTrack audioTrack = j40Var.a;
            a66 a66Var = j40Var.i;
            Handler q = g8c.q(null);
            synchronized (j40.s) {
                ScheduledExecutorService scheduledExecutorService = j40.t;
                if (scheduledExecutorService == null) {
                    scheduledExecutorService = Executors.newSingleThreadScheduledExecutor(new x20((byte) 9));
                    j40.t = scheduledExecutorService;
                }
                j40.u++;
                scheduledExecutorService.schedule(new nn6((Object) audioTrack, (Object) q, (Object) a66Var, (byte) 14), 20L, TimeUnit.MILLISECONDS);
            }
            this.t = null;
        }
        ly0 ly0Var = this.l;
        ly0Var.c = null;
        ly0Var.a = -9223372036854775807L;
        ly0Var.b = -9223372036854775807L;
        ly0 ly0Var2 = this.k;
        ly0Var2.c = null;
        ly0Var2.a = -9223372036854775807L;
        ly0Var2.b = -9223372036854775807L;
        this.c0 = 0L;
        this.d0 = 0L;
        Handler handler = this.e0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final long g() {
        if (!p()) {
            return -9223372036854775807L;
        }
        if (this.p.d()) {
            return g8c.Z(((r00) this.p.e).b, this.t.a.getBufferSizeInFrames());
        }
        long bufferSizeInFrames = this.t.a.getBufferSizeInFrames();
        int b = yfe.b(((r00) this.p.e).a);
        gre.p(b != -2147483647);
        return g8c.b0(bufferSizeInFrames, 1000000L, b, RoundingMode.DOWN);
    }

    public final long h() {
        ArrayDeque arrayDeque;
        long j;
        if (!p() || this.H) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.t.a(), g8c.Z(((r00) this.p.e).b, l()));
        while (true) {
            arrayDeque = this.h;
            if (arrayDeque.isEmpty() || min < ((p93) arrayDeque.getFirst()).c) {
                break;
            }
            this.w = (p93) arrayDeque.remove();
        }
        p93 p93Var = this.w;
        long j2 = min - p93Var.c;
        long D = g8c.D(j2, p93Var.a.a);
        boolean isEmpty = arrayDeque.isEmpty();
        mv6 mv6Var = this.b;
        if (isEmpty) {
            mka mkaVar = (mka) mv6Var.d;
            if (mkaVar.isActive()) {
                if (mkaVar.m >= 1024) {
                    long j3 = mkaVar.l;
                    mkaVar.i.getClass();
                    long o = j3 - (r8.i.o() * (r8.j * r8.b));
                    int i = mkaVar.g.a;
                    int i2 = mkaVar.f.a;
                    long j4 = mkaVar.m;
                    j2 = i == i2 ? g8c.b0(j2, o, j4, RoundingMode.DOWN) : g8c.b0(j2, o * i, j4 * i2, RoundingMode.DOWN);
                } else {
                    j2 = (long) (mkaVar.b * j2);
                }
            }
            p93 p93Var2 = this.w;
            j = p93Var2.b + j2;
            p93Var2.d = j2 - D;
        } else {
            p93 p93Var3 = this.w;
            j = p93Var3.b + D + p93Var3.d;
        }
        long j5 = ((lha) mv6Var.c).l;
        long Z = g8c.Z(((r00) this.p.e).b, j5) + j;
        long j6 = this.c0;
        if (j5 > j6) {
            long Z2 = g8c.Z(((r00) this.p.e).b, j5 - j6);
            this.c0 = j5;
            this.d0 += Z2;
            Handler handler = this.e0;
            if (handler == null) {
                handler = new Handler(Looper.myLooper());
                this.e0 = handler;
            }
            handler.removeCallbacksAndMessages(null);
            this.e0.postDelayed(new mk2(this, (byte) 19), 100L);
        }
        return Z;
    }

    public final n00 i(fm4 fm4Var) {
        n00 n00Var = new n00();
        n00Var.a = fm4Var;
        n00Var.b = nz.i;
        n00Var.e = 0;
        n00Var.f = -1;
        n00Var.b = this.u;
        n00Var.d = this.i != 0;
        n00Var.c = this.W;
        n00Var.e = this.T;
        n00Var.g = this.Y;
        n00Var.f = this.X;
        n00 n00Var2 = new n00();
        n00Var2.a = (fm4) n00Var.a;
        n00Var2.b = (nz) n00Var.b;
        n00Var2.c = (AudioDeviceInfo) n00Var.c;
        n00Var2.d = n00Var.d;
        n00Var2.e = n00Var.e;
        n00Var2.f = n00Var.f;
        n00Var2.g = n00Var.g;
        return n00Var2;
    }

    public final int j(fm4 fm4Var) {
        boolean z;
        if (!g8c.N(fm4Var.Q) || fm4Var.Q == 2) {
            z = false;
        } else {
            em4 a = fm4Var.a();
            a.P = 2;
            fm4Var = new fm4(a);
            z = true;
        }
        byte b = ((l40) this.r).b(i(fm4Var)).d;
        if (b != 1) {
            if (b != 2) {
                return 0;
            }
            if (!z) {
                return 2;
            }
        }
        return 1;
    }

    public final long l() {
        if (!this.p.d()) {
            return this.C;
        }
        long j = this.B;
        long j2 = this.p.b;
        return ((j + j2) - 1) / j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fa, code lost:
    
        if (r5 == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x008c, code lost:
    
        if (o() == false) goto L104;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(long j, int i, ByteBuffer byteBuffer) {
        long j2;
        ByteBuffer byteBuffer2 = this.L;
        gre.f(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.o != null) {
            if (e()) {
                if (this.t != null) {
                    r00 r00Var = (r00) this.p.e;
                    i((fm4) this.o.d);
                    if (!((r00) this.o.e).equals(r00Var)) {
                        s();
                        if (!n()) {
                            f();
                            a(j);
                        }
                    }
                }
                this.p = this.o;
                this.o = null;
                j40 j40Var = this.t;
                if (j40Var != null && j40Var.c() && ((r00) this.p.e).k) {
                    this.t.e();
                    j40 j40Var2 = this.t;
                    fm4 fm4Var = (fm4) this.p.c;
                    j40Var2.d(fm4Var.R, fm4Var.S);
                    this.b0 = true;
                }
                a(j);
            }
            return false;
        }
        boolean p = p();
        ly0 ly0Var = this.k;
        if (!p) {
            try {
            } catch (t30 e) {
                if (e.a) {
                    throw e;
                }
                ly0Var.a(e);
                return false;
            }
        }
        ly0Var.c = null;
        ly0Var.a = -9223372036854775807L;
        ly0Var.b = -9223372036854775807L;
        if (this.H) {
            this.I = Math.max(0L, j);
            this.G = false;
            this.H = false;
            if (E()) {
                x();
            }
            a(j);
            if (this.R) {
                r();
            }
        }
        if (this.L == null) {
            gre.f(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.hasRemaining()) {
                if (!this.p.d() && this.D == 0) {
                    int k = k(((r00) this.p.e).a, byteBuffer);
                    this.D = k;
                }
                if (this.v != null) {
                    if (e()) {
                        a(j);
                        this.v = null;
                    }
                    return false;
                }
                long j3 = this.I;
                wg2 wg2Var = this.p;
                j2 = -9223372036854775807L;
                long Z = g8c.Z(((fm4) wg2Var.c).P, (wg2Var.d() ? this.z / this.p.a : this.A) - this.d.o) + j3;
                if (!this.G && Math.abs(Z - j) > 200000) {
                    u30 u30Var = this.n;
                    if (u30Var != null) {
                        StringBuilder o = ug8.o(Z, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                        o.append(j);
                        u30Var.w1(new v30(o.toString()));
                    }
                    this.G = true;
                }
                if (this.G) {
                    if (e()) {
                        long j4 = j - Z;
                        this.I += j4;
                        this.G = false;
                        a(j);
                        u30 u30Var2 = this.n;
                        if (u30Var2 != null && j4 != 0) {
                            u30Var2.E1();
                        }
                    }
                    return false;
                }
                if (this.p.d()) {
                    this.z += byteBuffer.remaining();
                } else {
                    this.A = (this.D * i) + this.A;
                }
                this.L = byteBuffer;
                this.M = i;
                this.E = byteBuffer.remaining();
                this.F = 0L;
            }
            return true;
        }
        j2 = -9223372036854775807L;
        u(j);
        if (!this.L.hasRemaining()) {
            this.L = null;
            this.M = 0;
            return true;
        }
        j40 j40Var3 = this.t;
        m40 m40Var = j40Var3.e;
        long b = j40Var3.b();
        if (m40Var.v != j2 && b > 0) {
            m40Var.b.getClass();
            if (SystemClock.elapsedRealtime() - m40Var.v >= 200) {
                lad.f("DefaultAudioSink", "Resetting stalled audio output");
                f();
                return true;
            }
        }
        return false;
    }

    public final boolean n() {
        if (!p()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && this.t.c() && this.Q) {
            return false;
        }
        long l = l();
        long a = this.t.a();
        j40 j40Var = this.t;
        j40Var.getClass();
        return l > g8c.b0(a, (long) j40Var.a.getSampleRate(), 1000000L, RoundingMode.UP);
    }

    public final boolean o() {
        int b;
        j40 j40Var;
        boolean z;
        ly0 ly0Var = this.k;
        if (((Exception) ly0Var.c) != null) {
            ((l40) ((q93) ly0Var.d).r).getClass();
            synchronized (j40.s) {
                z = j40.u > 0;
            }
            if (z || SystemClock.elapsedRealtime() < ly0Var.b) {
                return false;
            }
        }
        try {
            j40Var = b((r00) this.p.e);
        } catch (t30 e) {
            r00 r00Var = (r00) this.p.e;
            int i = r00Var.f;
            boolean N = g8c.N(r00Var.a);
            wg2 wg2Var = this.p;
            if (N) {
                b = ((r00) wg2Var.e).b * wg2Var.b;
            } else {
                int i2 = ((fm4) wg2Var.c).k;
                if (i2 != -1) {
                    b = i2 / 8;
                } else {
                    b = yfe.b(((r00) wg2Var.e).a);
                    if (b == -2147483647) {
                        b = 1000000;
                    }
                }
            }
            r00 r00Var2 = (r00) this.p.e;
            int max = Math.max(b, AudioTrack.getMinBufferSize(r00Var2.b, r00Var2.c, r00Var2.a));
            int i3 = this.p.b;
            if (i3 == -1) {
                i3 = 1;
            }
            while (i > max) {
                i = Math.max(max, i / 2);
                int i4 = i % i3;
                if (i4 != 0) {
                    i = (i3 - i4) + i;
                }
                q00 a = ((r00) this.p.e).a();
                a.f = i;
                r00 r00Var3 = new r00(a);
                try {
                    j40 b2 = b(r00Var3);
                    this.p = this.p.c(r00Var3);
                    j40Var = b2;
                } catch (t30 e2) {
                    e.addSuppressed(e2);
                }
            }
            if (!((r00) this.p.e).e) {
                throw e;
            }
            this.a0 = true;
            throw e;
        }
        this.t = j40Var;
        o93 o93Var = new o93(this, (r00) this.p.e);
        this.j = o93Var;
        j40Var.i.a(o93Var);
        if (this.t.c()) {
            wg2 wg2Var2 = this.p;
            if (((r00) wg2Var2.e).k) {
                j40 j40Var2 = this.t;
                fm4 fm4Var = (fm4) wg2Var2.c;
                j40Var2.d(fm4Var.R, fm4Var.S);
            }
        }
        uc8 uc8Var = this.m;
        if (uc8Var != null) {
            this.t.f(uc8Var);
        }
        if (p()) {
            this.t.a.setVolume(this.K);
        }
        this.V.getClass();
        AudioDeviceInfo audioDeviceInfo = this.W;
        if (audioDeviceInfo != null) {
            this.t.a.setPreferredDevice(audioDeviceInfo);
        }
        this.H = true;
        int audioSessionId = this.t.a.getAudioSessionId();
        boolean z2 = audioSessionId != this.T;
        this.T = audioSessionId;
        u30 u30Var = this.n;
        if (u30Var != null) {
            Object obj = this.p.e;
            u30Var.s0(new pd5((byte) 14));
            if (z2) {
                this.U = true;
                wg2 wg2Var3 = this.p;
                q00 a2 = ((r00) wg2Var3.e).a();
                a2.h = this.T;
                this.p = wg2Var3.c(new r00(a2));
                wg2 wg2Var4 = this.o;
                if (wg2Var4 != null) {
                    q00 a3 = ((r00) wg2Var4.e).a();
                    a3.h = this.T;
                    this.o = wg2Var4.c(new r00(a3));
                }
                this.n.d(this.T);
            }
        }
        return true;
    }

    public final boolean p() {
        return this.t != null;
    }

    public final void q() {
        this.R = false;
        if (p()) {
            j40 j40Var = this.t;
            m40 m40Var = j40Var.e;
            m40Var.e();
            if (m40Var.u == -9223372036854775807L) {
                m40Var.h.a(0);
            }
            m40Var.w = m40Var.a();
            if (!j40Var.j || j40Var.c()) {
                j40Var.a.pause();
            }
        }
    }

    public final void r() {
        this.R = true;
        if (p()) {
            j40 j40Var = this.t;
            m40 m40Var = j40Var.e;
            if (m40Var.u != -9223372036854775807L) {
                m40Var.b.getClass();
                m40Var.u = g8c.T(SystemClock.elapsedRealtime());
            }
            m40Var.j = g8c.Z(m40Var.e, m40Var.a());
            m40Var.h.a(0);
            if (!j40Var.j || j40Var.c()) {
                j40Var.a.play();
            }
        }
    }

    public final void s() {
        if (this.P) {
            return;
        }
        this.P = true;
        if (this.t.c()) {
            this.Q = false;
        }
        j40 j40Var = this.t;
        if (j40Var.j) {
            return;
        }
        j40Var.j = true;
        m40 m40Var = j40Var.e;
        long b = j40Var.b();
        m40Var.w = m40Var.a();
        m40Var.b.getClass();
        m40Var.u = g8c.T(SystemClock.elapsedRealtime());
        m40Var.x = b;
        j40Var.a.stop();
        j40Var.o = 0;
    }

    public final void t() {
        if (!this.O && p() && e()) {
            s();
            this.O = true;
        }
    }

    public final void u(long j) {
        ByteBuffer byteBuffer;
        d(j);
        if (this.N == null) {
            if (!this.q.c()) {
                ByteBuffer byteBuffer2 = this.L;
                if (byteBuffer2 != null) {
                    B(byteBuffer2);
                    d(j);
                    return;
                }
                return;
            }
            while (!this.q.b()) {
                do {
                    k20 k20Var = this.q;
                    if (k20Var.c()) {
                        ByteBuffer byteBuffer3 = k20Var.c[k20Var.a()];
                        if (byteBuffer3.hasRemaining()) {
                            byteBuffer = byteBuffer3;
                        } else {
                            k20Var.d(p20.a);
                            byteBuffer = k20Var.c[k20Var.a()];
                        }
                    } else {
                        byteBuffer = p20.a;
                    }
                    if (byteBuffer.hasRemaining()) {
                        B(byteBuffer);
                        d(j);
                    } else {
                        ByteBuffer byteBuffer4 = this.L;
                        if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                            return;
                        }
                        k20 k20Var2 = this.q;
                        ByteBuffer byteBuffer5 = this.L;
                        if (k20Var2.c() && !k20Var2.d) {
                            k20Var2.d(byteBuffer5);
                        }
                    }
                } while (this.N == null);
                return;
            }
        }
    }

    public final void v() {
        wg2 wg2Var = this.p;
        if (wg2Var != null) {
            wg2 wg2Var2 = this.o;
            if (wg2Var2 != null) {
                this.p = wg2Var2;
                this.o = null;
                wg2Var = wg2Var2;
            }
            try {
                this.p = this.p.c(((l40) this.r).c(i((fm4) wg2Var.d)));
            } catch (m00 e) {
                ho9.n(new s30(e, (fm4) this.p.c));
                return;
            }
        }
        f();
    }

    public final void w() {
        f();
        km5 listIterator = this.g.listIterator(0);
        while (listIterator.hasNext()) {
            ((p20) listIterator.next()).reset();
        }
        this.e.reset();
        this.f.reset();
        k20 k20Var = this.q;
        if (k20Var != null) {
            w59 w59Var = k20Var.a;
            for (int i = 0; i < w59Var.d; i++) {
                p20 p20Var = (p20) w59Var.get(i);
                p20Var.c(n20.d);
                p20Var.reset();
            }
            k20Var.b.clear();
            k20Var.c = new ByteBuffer[0];
            l20 l20Var = l20.e;
            k20Var.d = false;
        }
        this.R = false;
        this.a0 = false;
    }

    public final void x() {
        if (p()) {
            j40 j40Var = this.t;
            zb8 zb8Var = this.x;
            AudioTrack audioTrack = j40Var.a;
            try {
                audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(g8c.h(zb8Var.a, 0.1f, 8.0f)).setPitch(g8c.h(zb8Var.b, 0.1f, 8.0f)).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                lad.g("AudioTrackAudioOutput", "Failed to set playback params", e);
            }
            m40 m40Var = j40Var.e;
            m40Var.i = audioTrack.getPlaybackParams().getSpeed();
            m40Var.h.a(0);
            m40Var.e();
            PlaybackParams playbackParams = this.t.a.getPlaybackParams();
            this.x = new zb8(playbackParams.getSpeed(), playbackParams.getPitch());
        }
    }

    public final void y(s00 s00Var) {
        if (s00Var.equals(this.r)) {
            return;
        }
        ((l40) this.r).d();
        this.r = s00Var;
        n93 n93Var = this.s;
        if (n93Var != null) {
            l40 l40Var = (l40) s00Var;
            l40Var.f();
            a66 a66Var = l40Var.e;
            if (a66Var == null) {
                a66Var = new a66(Thread.currentThread());
                l40Var.e = a66Var;
            }
            a66Var.a(n93Var);
        }
        v();
    }

    public final void z(int i) {
        if (this.U) {
            if (this.T != i) {
                return;
            } else {
                this.U = false;
            }
        }
        if (this.T != i) {
            this.T = i;
            this.S = i != 0;
            v();
        }
    }
}
