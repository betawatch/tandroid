package w3;

import b2.o0;
import b2.p0;
import b2.r0;
import c3.f0;
import com.google.android.gms.internal.vision.e2;
import e2.v;
import e9.i0;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;
import org.telegram.messenger.TranslateController;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public abstract class n {
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

    public static f2.b b(p0 p0Var, String str) {
        int i10 = 0;
        while (true) {
            o0[] o0VarArr = p0Var.a;
            if (i10 >= o0VarArr.length) {
                return null;
            }
            o0 o0Var = o0VarArr[i10];
            if (o0Var instanceof f2.b) {
                f2.b bVar = (f2.b) o0Var;
                if (bVar.a.equals(str)) {
                    return bVar;
                }
            }
            i10++;
        }
    }

    public static String c(ArrayList arrayList) {
        int size = arrayList.size();
        boolean z10 = false;
        String str = null;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            String str2 = ((r) obj).a.g.r;
            if (r0.m(str2)) {
                return "video/mp4";
            }
            if (r0.i(str2)) {
                z10 = true;
            } else if (r0.k(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        return z10 ? "audio/mp4" : str != null ? str : "application/mp4";
    }

    public static boolean d(int i10, boolean z10) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        if (i10 == 1751476579 && z10) {
            return true;
        }
        for (int i11 = 0; i11 < 29; i11++) {
            if (a[i11] == i10) {
                return true;
            }
        }
        return false;
    }

    public static q3.e e(int i10, v vVar) {
        int j3 = vVar.j();
        if (vVar.j() == 1684108385) {
            vVar.K(8);
            String t10 = vVar.t(j3 - 16);
            return new q3.e(TranslateController.UNKNOWN_LANGUAGE, t10, t10);
        }
        e2.a.n("MetadataUtil", "Failed to parse comment attribute: " + dd.k.b(i10));
        return null;
    }

    public static q3.a f(v vVar) {
        int j3 = vVar.j();
        if (vVar.j() != 1684108385) {
            e2.a.n("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int j10 = vVar.j();
        byte[] bArr = c.a;
        int i10 = j10 & 16777215;
        String str = i10 == 13 ? "image/jpeg" : i10 == 14 ? "image/png" : null;
        if (str == null) {
            e2.n(i10, "Unrecognized cover art flags: ", "MetadataUtil");
            return null;
        }
        vVar.K(4);
        int i11 = j3 - 16;
        byte[] bArr2 = new byte[i11];
        vVar.h(0, i11, bArr2);
        return new q3.a(3, str, null, bArr2);
    }

    public static q3.o g(int i10, v vVar, String str) {
        int j3 = vVar.j();
        if (vVar.j() == 1684108385 && j3 >= 22) {
            vVar.K(10);
            int D = vVar.D();
            if (D > 0) {
                String i11 = i2.g.i(D, "");
                int D2 = vVar.D();
                if (D2 > 0) {
                    i11 = i11 + "/" + D2;
                }
                return new q3.o(str, null, i0.z(i11));
            }
        }
        e2.a.n("MetadataUtil", "Failed to parse index/count attribute: " + dd.k.b(i10));
        return null;
    }

    public static int h(v vVar) {
        int j3 = vVar.j();
        if (vVar.j() == 1684108385) {
            vVar.K(8);
            int i10 = j3 - 16;
            if (i10 == 1) {
                return vVar.x();
            }
            if (i10 == 2) {
                return vVar.D();
            }
            if (i10 == 3) {
                return vVar.A();
            }
            if (i10 == 4 && (vVar.a[vVar.b] & 128) == 0) {
                return vVar.B();
            }
        }
        e2.a.n("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static q3.j i(int i10, String str, v vVar, boolean z10, boolean z11) {
        int h = h(vVar);
        if (z11) {
            h = Math.min(1, h);
        }
        if (h >= 0) {
            return z10 ? new q3.o(str, null, i0.z(Integer.toString(h))) : new q3.e(TranslateController.UNKNOWN_LANGUAGE, str, Integer.toString(h));
        }
        e2.a.n("MetadataUtil", "Failed to parse uint8 attribute: " + dd.k.b(i10));
        return null;
    }

    public static j6.l j(byte[] bArr) {
        UUID[] uuidArr;
        v vVar = new v(bArr);
        if (vVar.c < 32) {
            return null;
        }
        vVar.J(0);
        int a2 = vVar.a();
        int j3 = vVar.j();
        if (j3 != a2) {
            e2.a.n("PsshAtomUtil", "Advertised atom size (" + j3 + ") does not match buffer size: " + a2);
            return null;
        }
        int j10 = vVar.j();
        if (j10 != 1886614376) {
            e2.n(j10, "Atom type is not pssh: ", "PsshAtomUtil");
            return null;
        }
        int e7 = c.e(vVar.j());
        if (e7 > 1) {
            e2.n(e7, "Unsupported pssh version: ", "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(vVar.r(), vVar.r());
        if (e7 == 1) {
            int B = vVar.B();
            uuidArr = new UUID[B];
            for (int i10 = 0; i10 < B; i10++) {
                uuidArr[i10] = new UUID(vVar.r(), vVar.r());
            }
        } else {
            uuidArr = null;
        }
        int B2 = vVar.B();
        int a10 = vVar.a();
        if (B2 != a10) {
            e2.a.n("PsshAtomUtil", "Atom data size (" + B2 + ") does not match the bytes left: " + a10);
            return null;
        }
        byte[] bArr2 = new byte[B2];
        vVar.h(0, B2, bArr2);
        j6.l lVar = new j6.l();
        lVar.b = uuid;
        lVar.a = e7;
        lVar.c = bArr2;
        lVar.d = uuidArr;
        return lVar;
    }

    public static byte[] k(UUID uuid, byte[] bArr) {
        j6.l j3 = j(bArr);
        if (j3 == null) {
            return null;
        }
        UUID uuid2 = (UUID) j3.b;
        if (uuid.equals(uuid2)) {
            return (byte[]) j3.c;
        }
        e2.a.n("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
        return null;
    }

    public static q3.o l(int i10, v vVar, String str) {
        int j3 = vVar.j();
        if (vVar.j() == 1684108385) {
            vVar.K(8);
            return new q3.o(str, null, i0.z(vVar.t(j3 - 16)));
        }
        e2.a.n("MetadataUtil", "Failed to parse text attribute: " + dd.k.b(i10));
        return null;
    }

    public static void m(int i10, p0 p0Var, b2.r rVar, p0 p0Var2, p0... p0VarArr) {
        if (p0Var2 == null) {
            p0Var2 = new p0(new o0[0]);
        }
        if (p0Var != null) {
            int i11 = 0;
            while (true) {
                o0[] o0VarArr = p0Var.a;
                if (i11 >= o0VarArr.length) {
                    break;
                }
                o0 o0Var = o0VarArr[i11];
                if (o0Var instanceof f2.b) {
                    f2.b bVar = (f2.b) o0Var;
                    if (!bVar.a.equals("com.android.capture.fps")) {
                        p0Var2 = p0Var2.a(bVar);
                    } else if (i10 == 2) {
                        p0Var2 = p0Var2.a(bVar);
                    }
                }
                i11++;
            }
        }
        for (p0 p0Var3 : p0VarArr) {
            p0Var2 = p0Var2.b(p0Var3);
        }
        if (p0Var2.a.length > 0) {
            rVar.k = p0Var2;
        }
    }

    public static f0 n(c3.p pVar, boolean z10, boolean z11) {
        f0 f0Var;
        boolean z12;
        long j3;
        int i10;
        long j10;
        int i11;
        int[] iArr;
        long length = pVar.getLength();
        long j11 = 4096;
        long j12 = -1;
        if (length != -1 && length <= 4096) {
            j11 = length;
        }
        int i12 = (int) j11;
        v vVar = new v(64);
        int i13 = 0;
        int i14 = 0;
        boolean z13 = false;
        while (i14 < i12) {
            vVar.G(8);
            boolean z14 = true;
            if (!pVar.j(vVar.a, i13, 8, true)) {
                break;
            }
            long z15 = vVar.z();
            int j13 = vVar.j();
            if (z15 == 1) {
                j3 = j12;
                pVar.b(8, 8, vVar.a);
                i11 = 16;
                vVar.I(16);
                i10 = i14;
                j10 = vVar.r();
            } else {
                j3 = j12;
                if (z15 == 0) {
                    long length2 = pVar.getLength();
                    if (length2 != j3) {
                        i10 = i14;
                        z15 = (length2 - pVar.k()) + 8;
                        j10 = z15;
                        i11 = 8;
                    }
                }
                i10 = i14;
                j10 = z15;
                i11 = 8;
            }
            long j14 = i11;
            if (j10 < j14) {
                return new i();
            }
            int i15 = i10 + i11;
            f0Var = null;
            if (j13 == 1836019574) {
                i12 += (int) j10;
                if (length != -1 && i12 > length) {
                    i12 = (int) length;
                }
                i14 = i15;
                j12 = j3;
            } else {
                if (j13 == 1836019558 || j13 == 1836475768) {
                    z12 = true;
                    break;
                }
                if (j13 == 1835295092) {
                    z13 = true;
                }
                long j15 = length;
                if ((i15 + j10) - j14 >= i12) {
                    break;
                }
                int i16 = (int) (j10 - j14);
                i14 = i15 + i16;
                if (j13 == 1718909296) {
                    if (i16 < 8) {
                        return new i();
                    }
                    vVar.G(i16);
                    pVar.b(0, i16, vVar.a);
                    if (d(vVar.j(), z11)) {
                        z13 = true;
                    }
                    vVar.K(4);
                    int a2 = vVar.a() / 4;
                    if (!z13 && a2 > 0) {
                        iArr = new int[a2];
                        int i17 = 0;
                        while (true) {
                            if (i17 >= a2) {
                                z14 = z13;
                                break;
                            }
                            int j16 = vVar.j();
                            iArr[i17] = j16;
                            if (d(j16, z11)) {
                                break;
                            }
                            i17++;
                        }
                    } else {
                        z14 = z13;
                        iArr = null;
                    }
                    if (!z14) {
                        i iVar = new i();
                        if (iArr == null) {
                            int i18 = h9.a.c;
                            return iVar;
                        }
                        int i19 = h9.a.c;
                        if (iArr.length == 0) {
                            return iVar;
                        }
                        new h9.a(Arrays.copyOf(iArr, iArr.length));
                        return iVar;
                    }
                    z13 = z14;
                } else if (i16 != 0) {
                    pVar.l(i16);
                }
                j12 = j3;
                length = j15;
            }
            i13 = 0;
        }
        f0Var = null;
        z12 = false;
        return !z13 ? i.c : z10 != z12 ? z12 ? i.a : i.b : f0Var;
    }
}
