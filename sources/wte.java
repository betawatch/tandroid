// default package

import java.nio.ByteBuffer;
import java.util.UUID;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class wte {
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

    public static kw8 b(byte[] bArr) {
        UUID[] uuidArr;
        yw7 yw7Var = new yw7(bArr);
        if (yw7Var.c < 32) {
            return null;
        }
        yw7Var.N(0);
        int a = yw7Var.a();
        int m = yw7Var.m();
        if (m != a) {
            ncd.f("PsshAtomUtil", "Advertised atom size (" + m + ") does not match buffer size: " + a);
            return null;
        }
        int m2 = yw7Var.m();
        if (m2 != 1886614376) {
            b10.o(m2, "Atom type is not pssh: ", "PsshAtomUtil");
            return null;
        }
        int e = yz0.e(yw7Var.m());
        if (e > 1) {
            b10.o(e, "Unsupported pssh version: ", "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(yw7Var.u(), yw7Var.u());
        if (e == 1) {
            int E = yw7Var.E();
            uuidArr = new UUID[E];
            for (int i = 0; i < E; i++) {
                uuidArr[i] = new UUID(yw7Var.u(), yw7Var.u());
            }
        } else {
            uuidArr = null;
        }
        int E2 = yw7Var.E();
        int a2 = yw7Var.a();
        if (E2 == a2) {
            byte[] bArr2 = new byte[E2];
            yw7Var.k(0, E2, bArr2);
            return new kw8(uuid, e, bArr2, uuidArr);
        }
        ncd.f("PsshAtomUtil", "Atom data size (" + E2 + ") does not match the bytes left: " + a2);
        return null;
    }

    public static byte[] c(UUID uuid, byte[] bArr) {
        kw8 b = b(bArr);
        if (b == null) {
            return null;
        }
        UUID uuid2 = (UUID) b.c;
        if (uuid.equals(uuid2)) {
            return b.b;
        }
        ncd.f("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
        return null;
    }
}
