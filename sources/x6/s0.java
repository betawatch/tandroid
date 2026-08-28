package x6;

import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class s0 implements Iterable, Serializable {
    public static final s0 c = new s0(t0.a);
    public int a = 0;
    public final byte[] b;

    static {
        int i9 = q0.a;
    }

    public s0(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static int s(int i9, int i10, int i11) {
        int i12 = i10 - i9;
        if ((i9 | i10 | i12 | (i11 - i10)) >= 0) {
            return i12;
        }
        if (i9 < 0) {
            throw new IndexOutOfBoundsException(j3.r0.m(i9, "Beginning index: ", " < 0"));
        }
        if (i10 < i9) {
            throw new IndexOutOfBoundsException(aa.d.k(i9, i10, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(aa.d.k(i10, i11, "End index: ", " >= "));
    }

    public static s0 t(int i9, byte[] bArr) {
        s(0, i9, bArr.length);
        byte[] bArr2 = new byte[i9];
        System.arraycopy(bArr, 0, bArr2, 0, i9);
        return new s0(bArr2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s0) || p() != ((s0) obj).p()) {
            return false;
        }
        if (p() == 0) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return obj.equals(this);
        }
        s0 s0Var = (s0) obj;
        int i9 = this.a;
        int i10 = s0Var.a;
        if (i9 != 0 && i10 != 0 && i9 != i10) {
            return false;
        }
        int p6 = p();
        if (p6 > s0Var.p()) {
            throw new IllegalArgumentException("Length too large: " + p6 + p());
        }
        if (p6 > s0Var.p()) {
            throw new IllegalArgumentException(aa.d.k(p6, s0Var.p(), "Ran off end of other: 0, ", ", "));
        }
        byte[] bArr = s0Var.b;
        int o6 = o() + p6;
        int o9 = o();
        int o10 = s0Var.o();
        while (o9 < o6) {
            if (this.b[o9] != bArr[o10]) {
                return false;
            }
            o9++;
            o10++;
        }
        return true;
    }

    public final int hashCode() {
        int i9 = this.a;
        if (i9 != 0) {
            return i9;
        }
        int p6 = p();
        int o6 = o();
        byte[] bArr = t0.a;
        int i10 = p6;
        for (int i11 = o6; i11 < o6 + p6; i11++) {
            i10 = (i10 * 31) + this.b[i11];
        }
        if (i10 == 0) {
            i10 = 1;
        }
        this.a = i10;
        return i10;
    }

    public byte i(int i9) {
        return this.b[i9];
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.e(this);
    }

    public byte n(int i9) {
        return this.b[i9];
    }

    public int o() {
        return 0;
    }

    public int p() {
        return this.b.length;
    }

    public void q(int i9, byte[] bArr) {
        System.arraycopy(this.b, 0, bArr, 0, i9);
    }

    public final ByteArrayInputStream r() {
        return new ByteArrayInputStream(this.b, o(), p());
    }

    public final String toString() {
        s0 r0Var;
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int p6 = p();
        if (p() <= 50) {
            concat = a.d(this);
        } else {
            int s10 = s(0, 47, p());
            if (s10 == 0) {
                r0Var = c;
            } else {
                r0Var = new r0(this.b, o(), s10);
            }
            concat = a.d(r0Var).concat("...");
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(p6);
        sb2.append(" contents=\"");
        return aa.d.r(sb2, concat, "\">");
    }

    public final byte[] u() {
        int p6 = p();
        if (p6 == 0) {
            return t0.a;
        }
        byte[] bArr = new byte[p6];
        q(p6, bArr);
        return bArr;
    }
}
