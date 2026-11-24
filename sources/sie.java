// default package

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class sie implements Serializable, Iterable {
    public static final sie c = new sie(foe.b);
    public static final ohe d;
    public int a = 0;
    public final byte[] b;

    static {
        d = jee.a() ? new f6d((byte) 3) : new e6d();
    }

    public sie(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static sie j(int i, int i2, byte[] bArr) {
        l(i, i + i2, bArr.length);
        return new sie(d.a(i, i2, bArr));
    }

    public static int l(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("End index: ");
        sb3.append(i2);
        sb3.append(" >= ");
        sb3.append(i3);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sie) || i() != ((sie) obj).i()) {
            return false;
        }
        if (i() == 0) {
            return true;
        }
        if (!(obj instanceof sie)) {
            return obj.equals(this);
        }
        sie sieVar = (sie) obj;
        int i = this.a;
        int i2 = sieVar.a;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int i3 = i();
        if (i3 > sieVar.i()) {
            int i4 = i();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i3);
            sb.append(i4);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i3 > sieVar.i()) {
            int i5 = sieVar.i();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i3);
            sb2.append(", ");
            sb2.append(i5);
            throw new IllegalArgumentException(sb2.toString());
        }
        byte[] bArr = sieVar.b;
        int m = m() + i3;
        int m2 = m();
        int m3 = sieVar.m();
        while (m2 < m) {
            if (this.b[m2] != bArr[m3]) {
                return false;
            }
            m2++;
            m3++;
        }
        return true;
    }

    public byte h(int i) {
        return this.b[i];
    }

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        int i2 = i();
        int m = m();
        int i3 = i2;
        for (int i4 = m; i4 < m + i2; i4++) {
            i3 = (i3 * 31) + this.b[i4];
        }
        if (i3 == 0) {
            i3 = 1;
        }
        this.a = i3;
        return i3;
    }

    public int i() {
        return this.b.length;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new c51(this);
    }

    public byte k(int i) {
        return this.b[i];
    }

    public int m() {
        return 0;
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int i = i();
        if (i() <= 50) {
            concat = c3f.a(this);
        } else {
            int l = l(0, 47, i());
            concat = c3f.a(l == 0 ? c : new zge(this.b, m(), l)).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(i);
        sb.append(" contents=\"");
        return b00.j(sb, concat, "\">");
    }
}
