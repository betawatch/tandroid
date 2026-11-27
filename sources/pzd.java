// default package

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class pzd implements Iterable, Serializable {
    public static final pzd c = new pzd(x7e.b);
    public int a = 0;
    public final byte[] b;

    static {
        int i = uwd.a;
    }

    public pzd(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static int k(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            su3.g(qd4.n(i, "Beginning index: ", " < 0"));
            return 0;
        }
        if (i2 < i) {
            su3.g(c00.h(i, i2, "Beginning index larger than ending index: ", ", "));
            return 0;
        }
        su3.g(c00.h(i2, i3, "End index: ", " >= "));
        return 0;
    }

    public static pzd l(int i, int i2, byte[] bArr) {
        k(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new pzd(bArr2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof pzd) && j() == ((pzd) obj).j()) {
            if (j() == 0) {
                return true;
            }
            if (!(obj instanceof pzd)) {
                return obj.equals(this);
            }
            pzd pzdVar = (pzd) obj;
            int i = this.a;
            int i2 = pzdVar.a;
            if (i == 0 || i2 == 0 || i == i2) {
                int j = j();
                if (j > pzdVar.j()) {
                    p3d.b(j, j());
                    return false;
                }
                if (j > pzdVar.j()) {
                    lq5.j(c00.h(j, pzdVar.j(), "Ran off end of other: 0, ", ", "));
                    return false;
                }
                byte[] bArr = pzdVar.b;
                int i3 = 0;
                int i4 = 0;
                while (i3 < j) {
                    if (this.b[i3] == bArr[i4]) {
                        i3++;
                        i4++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public byte h(int i) {
        return this.b[i];
    }

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        int j = j();
        int i2 = j;
        for (int i3 = 0; i3 < j; i3++) {
            i2 = (i2 * 31) + this.b[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.a = i2;
        return i2;
    }

    public byte i(int i) {
        return this.b[i];
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new k51(this);
    }

    public int j() {
        return this.b.length;
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int j = j();
        if (j() <= 50) {
            concat = x6f.a(this);
        } else {
            int k = k(0, 47, j());
            concat = x6f.a(k == 0 ? c : new uyd(k, this.b)).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(j);
        sb.append(" contents=\"");
        return c00.k(sb, concat, "\">");
    }
}
