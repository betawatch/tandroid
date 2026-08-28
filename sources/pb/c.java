package pb;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c {
    public static final int[][] c = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};
    public final b a;
    public final byte b;

    public c(int i9) {
        int i10 = (i9 >> 3) & 3;
        if (i10 < 0 || i10 >= 4) {
            throw new IllegalArgumentException();
        }
        this.a = b.d[i10];
        this.b = (byte) (i9 & 7);
    }

    public static c a(int i9, int i10) {
        int bitCount;
        int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i12 = 0;
        for (int i13 = 0; i13 < 32; i13++) {
            int[] iArr = c[i13];
            int i14 = iArr[0];
            if (i14 == i9 || i14 == i10) {
                return new c(iArr[1]);
            }
            int bitCount2 = Integer.bitCount(i9 ^ i14);
            if (bitCount2 < i11) {
                i12 = iArr[1];
                i11 = bitCount2;
            }
            if (i9 != i10 && (bitCount = Integer.bitCount(i14 ^ i10)) < i11) {
                i12 = iArr[1];
                i11 = bitCount;
            }
        }
        if (i11 <= 3) {
            return new c(i12);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && this.b == cVar.b;
    }

    public final int hashCode() {
        return (this.a.ordinal() << 3) | this.b;
    }
}
