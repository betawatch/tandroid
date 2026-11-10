package q7;

import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public class s0 implements Iterable, Serializable {
    public static final s0 c = new s0(t0.a);
    public int a = 0;
    public final byte[] b;

    static {
        int i7 = q0.a;
    }

    public s0(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static int n(int i7, int i10, int i11) {
        int i12 = i10 - i7;
        if ((i7 | i10 | i12 | (i11 - i10)) >= 0) {
            return i12;
        }
        if (i7 < 0) {
            throw new IndexOutOfBoundsException(jg.g.k(i7, "Beginning index: ", " < 0"));
        }
        if (i10 < i7) {
            throw new IndexOutOfBoundsException(a8.p0.m(i7, i10, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(a8.p0.m(i10, i11, "End index: ", " >= "));
    }

    public static s0 o(int i7, byte[] bArr) {
        n(0, i7, bArr.length);
        byte[] bArr2 = new byte[i7];
        System.arraycopy(bArr, 0, bArr2, 0, i7);
        return new s0(bArr2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s0) || k() != ((s0) obj).k()) {
            return false;
        }
        if (k() == 0) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return obj.equals(this);
        }
        s0 s0Var = (s0) obj;
        int i7 = this.a;
        int i10 = s0Var.a;
        if (i7 != 0 && i10 != 0 && i7 != i10) {
            return false;
        }
        int k10 = k();
        if (k10 > s0Var.k()) {
            throw new IllegalArgumentException("Length too large: " + k10 + k());
        }
        if (k10 > s0Var.k()) {
            throw new IllegalArgumentException(a8.p0.m(k10, s0Var.k(), "Ran off end of other: 0, ", ", "));
        }
        byte[] bArr = s0Var.b;
        int j3 = j() + k10;
        int j10 = j();
        int j11 = s0Var.j();
        while (j10 < j3) {
            if (this.b[j10] != bArr[j11]) {
                return false;
            }
            j10++;
            j11++;
        }
        return true;
    }

    public byte f(int i7) {
        return this.b[i7];
    }

    public final int hashCode() {
        int i7 = this.a;
        if (i7 != 0) {
            return i7;
        }
        int k10 = k();
        int j3 = j();
        byte[] bArr = t0.a;
        int i10 = k10;
        for (int i11 = j3; i11 < j3 + k10; i11++) {
            i10 = (i10 * 31) + this.b[i11];
        }
        if (i10 == 0) {
            i10 = 1;
        }
        this.a = i10;
        return i10;
    }

    public byte i(int i7) {
        return this.b[i7];
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.e(this);
    }

    public int j() {
        return 0;
    }

    public int k() {
        return this.b.length;
    }

    public void l(int i7, byte[] bArr) {
        System.arraycopy(this.b, 0, bArr, 0, i7);
    }

    public final ByteArrayInputStream m() {
        return new ByteArrayInputStream(this.b, j(), k());
    }

    public final byte[] p() {
        int k10 = k();
        if (k10 == 0) {
            return t0.a;
        }
        byte[] bArr = new byte[k10];
        l(k10, bArr);
        return bArr;
    }

    public final String toString() {
        s0 r0Var;
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int k10 = k();
        if (k() <= 50) {
            concat = a.d(this);
        } else {
            int n10 = n(0, 47, k());
            if (n10 == 0) {
                r0Var = c;
            } else {
                r0Var = new r0(this.b, j(), n10);
            }
            concat = a.d(r0Var).concat("...");
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(k10);
        sb2.append(" contents=\"");
        return a8.p0.s(sb2, concat, "\">");
    }
}
