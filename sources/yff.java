// default package

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class yff implements Iterable, Serializable {
    public static final yff c = new yff(fhf.b);
    public int a = 0;
    public final byte[] b;

    static {
        int i = off.a;
    }

    public yff(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static void k(int i) {
        if ((47 | (i - 47)) >= 0) {
            return;
        }
        wa3.i(hg9.j(i, "End index: 47 >= "));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof yff) && j() == ((yff) obj).j()) {
            if (j() == 0) {
                return true;
            }
            if (!(obj instanceof yff)) {
                return obj.equals(this);
            }
            yff yffVar = (yff) obj;
            int i = this.a;
            int i2 = yffVar.a;
            if (i == 0 || i2 == 0 || i == i2) {
                int j = j();
                if (j > yffVar.j()) {
                    i2d.b(j, j());
                    return false;
                }
                if (j > yffVar.j()) {
                    u36.j(b10.g(j, yffVar.j(), "Ran off end of other: 0, ", ", "));
                    return false;
                }
                byte[] bArr = yffVar.b;
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
        Charset charset = fhf.a;
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
        return new j61(this);
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
            concat = t6f.a(this);
        } else {
            k(j());
            byte[] bArr = this.b;
            uff uffVar = new uff(bArr);
            k(bArr.length);
            concat = t6f.a(uffVar).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(j);
        sb.append(" contents=\"");
        return b10.j(sb, concat, "\">");
    }
}
