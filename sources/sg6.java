// default package

import java.io.DataInputStream;
import java.io.EOFException;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class sg6 extends tg6 {
    public final /* synthetic */ byte g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sg6(a51 a51Var, tg6 tg6Var, String str, byte b) {
        super(a51Var, tg6Var, str);
        this.g = b;
    }

    public static void h(StringBuffer stringBuffer, tg6 tg6Var) {
        tg6 tg6Var2 = (tg6) tg6Var.c;
        if (tg6Var2 != null) {
            h(stringBuffer, tg6Var2);
            stringBuffer.append("/");
        }
        stringBuffer.append((String) tg6Var.d);
    }

    public final long i() {
        return ((zy8) ((a51) this.b)).e();
    }

    public final boolean j() {
        sg6 sg6Var = (sg6) this.f;
        return (sg6Var != null ? sg6Var.i() : 0L) < i();
    }

    public final sg6 k(String str) {
        while (i() > 0) {
            sg6 c = c();
            if (((String) c.d).matches(str)) {
                return c;
            }
        }
        k93.f("atom type mismatch, not found: ".concat(str));
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

    @Override // tg6
    public final String toString() {
        switch (this.g) {
            case 0:
                StringBuffer stringBuffer = new StringBuffer();
                h(stringBuffer, this);
                stringBuffer.append("[off=");
                long j = ((a51) ((tg6) this.c).b).b;
                a51 a51Var = (a51) this.b;
                stringBuffer.append(j - a51Var.b);
                stringBuffer.append(",pos=");
                stringBuffer.append(a51Var.b);
                stringBuffer.append(",len=");
                zy8 zy8Var = (zy8) a51Var;
                stringBuffer.append(zy8Var.e() + zy8Var.b);
                stringBuffer.append("]");
                return stringBuffer.toString();
            default:
                return ls6.p(new StringBuilder("mp4[pos="), ((a51) this.b).b, "]");
        }
    }
}
