// default package

import java.io.DataInputStream;
import java.io.EOFException;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class xi6 extends yi6 {
    public final /* synthetic */ byte g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xi6(i51 i51Var, yi6 yi6Var, String str, byte b) {
        super(i51Var, yi6Var, str);
        this.g = b;
    }

    public static void h(StringBuffer stringBuffer, yi6 yi6Var) {
        yi6 yi6Var2 = (yi6) yi6Var.c;
        if (yi6Var2 != null) {
            h(stringBuffer, yi6Var2);
            stringBuffer.append("/");
        }
        stringBuffer.append((String) yi6Var.d);
    }

    public final long i() {
        return ((m29) ((i51) this.b)).e();
    }

    public final boolean j() {
        xi6 xi6Var = (xi6) this.f;
        return (xi6Var != null ? xi6Var.i() : 0L) < i();
    }

    public final xi6 k(String str) {
        while (i() > 0) {
            xi6 c = c();
            if (((String) c.d).matches(str)) {
                return c;
            }
        }
        su3.e("atom type mismatch, not found: ".concat(str));
        return null;
    }

    public final short l() {
        return ((DataInputStream) this.e).readShort();
    }

    public final String m() {
        byte[] bArr = new byte[(int) i()];
        ((DataInputStream) this.e).readFully(bArr);
        String str = new String(bArr, "UTF-8");
        int indexOf = str.indexOf(0);
        return indexOf < 0 ? str : str.substring(0, indexOf);
    }

    public final void n(int i) {
        int i2 = 0;
        while (i2 < i) {
            int skipBytes = ((DataInputStream) this.e).skipBytes(i - i2);
            if (skipBytes <= 0) {
                throw new EOFException();
            }
            i2 += skipBytes;
        }
    }

    @Override // yi6
    public final String toString() {
        switch (this.g) {
            case 0:
                StringBuffer stringBuffer = new StringBuffer();
                h(stringBuffer, this);
                stringBuffer.append("[off=");
                long j = ((i51) ((yi6) this.c).b).b;
                i51 i51Var = (i51) this.b;
                stringBuffer.append(j - i51Var.b);
                stringBuffer.append(",pos=");
                stringBuffer.append(i51Var.b);
                stringBuffer.append(",len=");
                m29 m29Var = (m29) i51Var;
                stringBuffer.append(m29Var.e() + m29Var.b);
                stringBuffer.append("]");
                return stringBuffer.toString();
            default:
                return qu6.p(new StringBuilder("mp4[pos="), ((i51) this.b).b, "]");
        }
    }
}
