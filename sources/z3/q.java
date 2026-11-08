package z3;

import di.s6;
import e2.p0;
import e2.q0;
import e2.s0;
import h2.x;
import h9.f0;
import h9.g0;
import h9.i0;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.UUID;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class q {
    public static final int[] a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            allocate.putInt(0);
        } else {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static String b(ArrayList arrayList) {
        int size = arrayList.size();
        boolean z9 = false;
        String str = null;
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            String str2 = ((u) obj).a.g.s;
            if (s0.m(str2)) {
                return "video/mp4";
            }
            if (s0.i(str2)) {
                z9 = true;
            } else if (s0.k(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        return z9 ? "audio/mp4" : str != null ? str : "application/mp4";
    }

    public static boolean c(int i7, boolean z9) {
        if ((i7 >>> 8) == 3368816) {
            return true;
        }
        if (i7 == 1751476579 && z9) {
            return true;
        }
        for (int i10 = 0; i10 < 29; i10++) {
            if (a[i10] == i7) {
                return true;
            }
        }
        return false;
    }

    public static t3.e d(int i7, x xVar) {
        int m10 = xVar.m();
        if (xVar.m() == 1684108385) {
            xVar.O(8);
            String w10 = xVar.w(m10 - 16);
            return new t3.e("und", w10, w10);
        }
        h2.a.l("MetadataUtil", "Failed to parse comment attribute: " + dd.k.a(i7));
        return null;
    }

    public static t3.a e(x xVar) {
        int m10 = xVar.m();
        if (xVar.m() != 1684108385) {
            h2.a.l("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int m11 = xVar.m();
        byte[] bArr = c.a;
        int i7 = m11 & 16777215;
        String str = i7 == 13 ? "image/jpeg" : i7 == 14 ? "image/png" : null;
        if (str == null) {
            com.google.android.recaptcha.internal.a.o(i7, "Unrecognized cover art flags: ", "MetadataUtil");
            return null;
        }
        xVar.O(4);
        int i10 = m10 - 16;
        byte[] bArr2 = new byte[i10];
        xVar.k(0, i10, bArr2);
        return new t3.a(3, str, null, bArr2);
    }

    public static t3.n f(int i7, x xVar, String str) {
        int m10 = xVar.m();
        if (xVar.m() == 1684108385 && m10 >= 22) {
            xVar.O(10);
            int H = xVar.H();
            if (H > 0) {
                String j3 = jg.g.j(H, "");
                int H2 = xVar.H();
                if (H2 > 0) {
                    j3 = j3 + "/" + H2;
                }
                return new t3.n(str, null, i0.u(j3));
            }
        }
        h2.a.l("MetadataUtil", "Failed to parse index/count attribute: " + dd.k.a(i7));
        return null;
    }

    public static int g(x xVar) {
        int m10 = xVar.m();
        if (xVar.m() == 1684108385) {
            xVar.O(8);
            int i7 = m10 - 16;
            if (i7 == 1) {
                return xVar.A();
            }
            if (i7 == 2) {
                return xVar.H();
            }
            if (i7 == 3) {
                return xVar.D();
            }
            if (i7 == 4 && (xVar.j() & 128) == 0) {
                return xVar.E();
            }
        }
        h2.a.l("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static t3.i h(int i7, String str, x xVar, boolean z9, boolean z10) {
        int g10 = g(xVar);
        if (z10) {
            g10 = Math.min(1, g10);
        }
        if (g10 >= 0) {
            return z9 ? new t3.n(str, null, i0.u(Integer.toString(g10))) : new t3.e("und", str, Integer.toString(g10));
        }
        h2.a.l("MetadataUtil", "Failed to parse uint8 attribute: " + dd.k.a(i7));
        return null;
    }

    public static m6.n i(byte[] bArr) {
        UUID[] uuidArr;
        x xVar = new x(bArr);
        if (xVar.c < 32) {
            return null;
        }
        xVar.N(0);
        int a10 = xVar.a();
        int m10 = xVar.m();
        if (m10 != a10) {
            h2.a.l("PsshAtomUtil", "Advertised atom size (" + m10 + ") does not match buffer size: " + a10);
            return null;
        }
        int m11 = xVar.m();
        if (m11 != 1886614376) {
            com.google.android.recaptcha.internal.a.o(m11, "Atom type is not pssh: ", "PsshAtomUtil");
            return null;
        }
        int e10 = c.e(xVar.m());
        if (e10 > 1) {
            com.google.android.recaptcha.internal.a.o(e10, "Unsupported pssh version: ", "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(xVar.u(), xVar.u());
        if (e10 == 1) {
            int E = xVar.E();
            uuidArr = new UUID[E];
            for (int i7 = 0; i7 < E; i7++) {
                uuidArr[i7] = new UUID(xVar.u(), xVar.u());
            }
        } else {
            uuidArr = null;
        }
        int E2 = xVar.E();
        int a11 = xVar.a();
        if (E2 != a11) {
            h2.a.l("PsshAtomUtil", "Atom data size (" + E2 + ") does not match the bytes left: " + a11);
            return null;
        }
        byte[] bArr2 = new byte[E2];
        xVar.k(0, E2, bArr2);
        m6.n nVar = new m6.n();
        nVar.b = uuid;
        nVar.a = e10;
        nVar.c = bArr2;
        nVar.d = uuidArr;
        return nVar;
    }

    public static byte[] j(UUID uuid, byte[] bArr) {
        m6.n i7 = i(bArr);
        if (i7 == null) {
            return null;
        }
        UUID uuid2 = (UUID) i7.b;
        if (uuid.equals(uuid2)) {
            return (byte[]) i7.c;
        }
        h2.a.l("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
        return null;
    }

    public static t3.n k(int i7, x xVar, String str) {
        int m10 = xVar.m();
        if (xVar.m() == 1684108385) {
            xVar.O(8);
            return new t3.n(str, null, i0.u(xVar.w(m10 - 16)));
        }
        h2.a.l("MetadataUtil", "Failed to parse text attribute: " + dd.k.a(i7));
        return null;
    }

    public static void l(int i7, q0 q0Var, e2.t tVar, q0 q0Var2, q0... q0VarArr) {
        if (q0Var2 == null) {
            q0Var2 = new q0(new p0[0]);
        }
        if (q0Var != null) {
            f0 p10 = i0.p();
            for (p0 p0Var : q0Var.a) {
                if (i2.a.class.isAssignableFrom(p0Var.getClass())) {
                    p10.c((p0) i2.a.class.cast(p0Var));
                }
            }
            g0 listIterator = p10.f().listIterator(0);
            while (listIterator.hasNext()) {
                i2.a aVar = (i2.a) listIterator.next();
                if (!aVar.a.equals("com.android.capture.fps") || i7 == 2) {
                    q0Var2 = q0Var2.a(aVar);
                }
            }
        }
        for (q0 q0Var3 : q0VarArr) {
            q0Var2 = q0Var2.b(q0Var3);
        }
        if (q0Var2.a.length > 0) {
            tVar.k = q0Var2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static f3.g0 m(f3.p pVar, boolean z9, boolean z10) {
        f3.g0 g0Var;
        int i7;
        long j3;
        int i10;
        int i11;
        int i12;
        long j10;
        int i13;
        int[] iArr;
        long length = pVar.getLength();
        long j11 = -1;
        int i14 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j12 = 4096;
        if (i14 != 0 && length <= 4096) {
            j12 = length;
        }
        int i15 = (int) j12;
        x xVar = new x(64);
        int i16 = 0;
        int i17 = 0;
        boolean z11 = false;
        while (i17 < i15) {
            xVar.K(8);
            if (!pVar.k(xVar.a, i16, 8, true)) {
                break;
            }
            long C = xVar.C();
            int m10 = xVar.m();
            if (C == 1) {
                j3 = j11;
                pVar.b(8, 8, xVar.a);
                i11 = 16;
                xVar.M(16);
                C = xVar.u();
                i10 = i17;
            } else {
                j3 = j11;
                if (C == 0) {
                    long length2 = pVar.getLength();
                    if (length2 != j3) {
                        i10 = i17;
                        C = (length2 - pVar.l()) + 8;
                        i11 = 8;
                    }
                }
                i10 = i17;
                i11 = 8;
            }
            long j13 = C;
            long j14 = i11;
            if (j13 < j14) {
                g0Var = null;
                if (m10 != 1718773093 || i11 != 8) {
                    return new s6(m10, j13, i11);
                }
                j13 = j14;
            } else {
                g0Var = null;
            }
            int i18 = i10 + i11;
            if (m10 == 1836019574 || m10 == 1970628964) {
                i15 += (int) j13;
                i12 = i14;
                if (i14 != 0 && i15 > length) {
                    i15 = (int) length;
                }
                if (m10 == 1836019574) {
                    i17 = i18;
                    i14 = i12;
                    j11 = j3;
                    i16 = 0;
                }
            } else {
                i12 = i14;
            }
            if (m10 != 1953653099 && m10 != 1835297121 && m10 != 1835626086) {
                if (m10 != 1836019558 && m10 != 1836475768) {
                    if (m10 == 1835295092) {
                        z11 = true;
                    }
                    if (m10 != 1937007212 || j13 <= 1000000) {
                        j10 = length;
                        if ((i18 + j13) - j14 < i15) {
                            int i19 = (int) (j13 - j14);
                            i17 = i18 + i19;
                            if (m10 != 1718909296) {
                                i13 = 0;
                                if (i19 != 0) {
                                    pVar.m(i19);
                                }
                            } else {
                                if (i19 < 8) {
                                    return new s6(m10, i19, 8);
                                }
                                xVar.K(i19);
                                i13 = 0;
                                pVar.b(0, i19, xVar.a);
                                int m11 = xVar.m();
                                if (c(m11, z10)) {
                                    z11 = true;
                                }
                                xVar.O(4);
                                int a10 = xVar.a() / 4;
                                if (!z11 && a10 > 0) {
                                    iArr = new int[a10];
                                    int i20 = 0;
                                    while (true) {
                                        if (i20 >= a10) {
                                            break;
                                        }
                                        int m12 = xVar.m();
                                        iArr[i20] = m12;
                                        if (c(m12, z10)) {
                                            z11 = true;
                                            break;
                                        }
                                        i20++;
                                    }
                                } else {
                                    iArr = g0Var;
                                }
                                if (!z11) {
                                    return new f5.u(iArr, m11);
                                }
                            }
                        }
                    }
                    i7 = 0;
                    break;
                }
                i7 = 1;
                break;
            }
            j10 = length;
            i13 = 0;
            i17 = i18;
            i16 = i13;
            i14 = i12;
            j11 = j3;
            length = j10;
        }
        g0Var = null;
        i7 = i16;
        return !z11 ? n.a : z9 != i7 ? i7 != 0 ? i.b : i.c : g0Var;
    }
}
