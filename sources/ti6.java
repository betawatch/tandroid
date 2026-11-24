// default package

import java.io.DataInputStream;
import java.io.EOFException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ti6 extends ui6 {
    public final /* synthetic */ byte g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ti6(h61 h61Var, ui6 ui6Var, String str, byte b) {
        super(h61Var, ui6Var, str);
        this.g = b;
    }

    public static void h(StringBuffer stringBuffer, ui6 ui6Var) {
        ui6 ui6Var2 = (ui6) ui6Var.c;
        if (ui6Var2 != null) {
            h(stringBuffer, ui6Var2);
            stringBuffer.append("/");
        }
        stringBuffer.append((String) ui6Var.d);
    }

    public final long i() {
        return ((a19) ((h61) this.b)).e();
    }

    public final boolean j() {
        ti6 ti6Var = (ti6) this.f;
        return (ti6Var != null ? ti6Var.i() : 0L) < i();
    }

    public final ti6 k(String str) {
        while (i() > 0) {
            ti6 c = c();
            if (((String) c.d).matches(str)) {
                return c;
            }
        }
        wa3.d("atom type mismatch, not found: ".concat(str));
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

    @Override // ui6
    public final String toString() {
        switch (this.g) {
            case 0:
                StringBuffer stringBuffer = new StringBuffer();
                h(stringBuffer, this);
                stringBuffer.append("[off=");
                long j = ((h61) ((ui6) this.c).b).b;
                h61 h61Var = (h61) this.b;
                stringBuffer.append(j - h61Var.b);
                stringBuffer.append(",pos=");
                stringBuffer.append(h61Var.b);
                stringBuffer.append(",len=");
                a19 a19Var = (a19) h61Var;
                stringBuffer.append(a19Var.e() + a19Var.b);
                stringBuffer.append("]");
                return stringBuffer.toString();
            default:
                return kt6.q(new StringBuilder("mp4[pos="), ((h61) this.b).b, "]");
        }
    }
}
