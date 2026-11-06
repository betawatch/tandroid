package sf;

import a8.p0;
import ab.d;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import kf.p;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class b extends p {
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, p pVar, String str, int i7) {
        super(dVar, pVar, str);
        this.g = i7;
    }

    public static void h(StringBuffer stringBuffer, p pVar) {
        p pVar2 = (p) pVar.c;
        if (pVar2 != null) {
            h(stringBuffer, pVar2);
            stringBuffer.append("/");
        }
        stringBuffer.append((String) pVar.d);
    }

    public long i() {
        return ((uf.a) ((d) this.b)).e();
    }

    public boolean j() {
        b bVar = (b) this.f;
        return (bVar != null ? bVar.i() : 0L) < i();
    }

    public b k(String str) {
        while (i() > 0) {
            b c10 = c();
            if (((String) c10.d).matches(str)) {
                return c10;
            }
        }
        throw new IOException("atom type mismatch, not found: ".concat(str));
    }

    public short l() {
        return ((DataInputStream) this.e).readShort();
    }

    public String m() {
        byte[] bArr = new byte[(int) i()];
        ((DataInputStream) this.e).readFully(bArr);
        String str = new String(bArr, "UTF-8");
        int indexOf = str.indexOf(0);
        return indexOf < 0 ? str : str.substring(0, indexOf);
    }

    public void n(int i7) {
        int i10 = 0;
        while (i10 < i7) {
            int skipBytes = ((DataInputStream) this.e).skipBytes(i7 - i10);
            if (skipBytes <= 0) {
                throw new EOFException();
            }
            i10 += skipBytes;
        }
    }

    @Override // kf.p
    public final String toString() {
        switch (this.g) {
            case 0:
                StringBuffer stringBuffer = new StringBuffer();
                h(stringBuffer, this);
                stringBuffer.append("[off=");
                long j3 = ((d) ((p) this.c).b).b;
                d dVar = (d) this.b;
                stringBuffer.append(j3 - dVar.b);
                stringBuffer.append(",pos=");
                stringBuffer.append(dVar.b);
                stringBuffer.append(",len=");
                uf.a aVar = (uf.a) dVar;
                stringBuffer.append(aVar.e() + aVar.b);
                stringBuffer.append("]");
                return stringBuffer.toString();
            default:
                return p0.r(new StringBuilder("mp4[pos="), ((d) this.b).b, "]");
        }
    }
}
