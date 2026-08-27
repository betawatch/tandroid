package y6;

import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class s0 implements Iterable, Serializable {
    public static final s0 c = new s0(t0.a);
    public int a = 0;
    public final byte[] b;

    static {
        int i10 = q0.a;
    }

    public s0(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static int s(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(i0.a.l(i10, "Beginning index: ", " < 0"));
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(a9.p.j(i10, i11, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(a9.p.j(i11, i12, "End index: ", " >= "));
    }

    public static s0 t(int i10, byte[] bArr) {
        s(0, i10, bArr.length);
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
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
        int i10 = this.a;
        int i11 = s0Var.a;
        if (i10 != 0 && i11 != 0 && i10 != i11) {
            return false;
        }
        int p6 = p();
        if (p6 > s0Var.p()) {
            throw new IllegalArgumentException("Length too large: " + p6 + p());
        }
        if (p6 > s0Var.p()) {
            throw new IllegalArgumentException(a9.p.j(p6, s0Var.p(), "Ran off end of other: 0, ", ", "));
        }
        byte[] bArr = s0Var.b;
        int o10 = o() + p6;
        int o11 = o();
        int o12 = s0Var.o();
        while (o11 < o10) {
            if (this.b[o11] != bArr[o12]) {
                return false;
            }
            o11++;
            o12++;
        }
        return true;
    }

    public final int hashCode() {
        int i10 = this.a;
        if (i10 != 0) {
            return i10;
        }
        int p6 = p();
        int o10 = o();
        byte[] bArr = t0.a;
        int i11 = p6;
        for (int i12 = o10; i12 < o10 + p6; i12++) {
            i11 = (i11 * 31) + this.b[i12];
        }
        if (i11 == 0) {
            i11 = 1;
        }
        this.a = i11;
        return i11;
    }

    public byte i(int i10) {
        return this.b[i10];
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.e(this);
    }

    public byte n(int i10) {
        return this.b[i10];
    }

    public int o() {
        return 0;
    }

    public int p() {
        return this.b.length;
    }

    public void q(int i10, byte[] bArr) {
        System.arraycopy(this.b, 0, bArr, 0, i10);
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
        return a9.p.p(sb2, concat, "\">");
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
