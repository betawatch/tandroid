// default package

import java.nio.ByteBuffer;
import java.util.UUID;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class tre {
    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length << 4) + 4;
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

    public static ju8 b(byte[] bArr) {
        UUID[] uuidArr;
        xu7 xu7Var = new xu7(bArr);
        if (xu7Var.c < 32) {
            return null;
        }
        xu7Var.N(0);
        int a = xu7Var.a();
        int m = xu7Var.m();
        if (m != a) {
            lad.f("PsshAtomUtil", "Advertised atom size (" + m + ") does not match buffer size: " + a);
            return null;
        }
        int m2 = xu7Var.m();
        if (m2 != 1886614376) {
            b00.o(m2, "Atom type is not pssh: ", "PsshAtomUtil");
            return null;
        }
        int e = ry0.e(xu7Var.m());
        if (e > 1) {
            b00.o(e, "Unsupported pssh version: ", "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(xu7Var.u(), xu7Var.u());
        if (e == 1) {
            int E = xu7Var.E();
            uuidArr = new UUID[E];
            for (int i = 0; i < E; i++) {
                uuidArr[i] = new UUID(xu7Var.u(), xu7Var.u());
            }
        } else {
            uuidArr = null;
        }
        int E2 = xu7Var.E();
        int a2 = xu7Var.a();
        if (E2 == a2) {
            byte[] bArr2 = new byte[E2];
            xu7Var.k(0, E2, bArr2);
            return new ju8(uuid, e, bArr2, uuidArr);
        }
        lad.f("PsshAtomUtil", "Atom data size (" + E2 + ") does not match the bytes left: " + a2);
        return null;
    }

    public static byte[] c(UUID uuid, byte[] bArr) {
        ju8 b = b(bArr);
        if (b == null) {
            return null;
        }
        UUID uuid2 = (UUID) b.c;
        if (uuid.equals(uuid2)) {
            return b.b;
        }
        lad.f("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
        return null;
    }
}
