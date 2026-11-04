package pf;

import a1.g;
import gf.p;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b extends p {
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(rf.a aVar, p pVar, String str, int i3) {
        super(aVar, pVar, str);
        this.g = i3;
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
        return ((rf.b) ((rf.a) this.b)).e();
    }

    public boolean j() {
        b bVar = (b) this.f;
        return (bVar != null ? bVar.i() : 0L) < i();
    }

    public b k(String str) {
        while (i() > 0) {
            b c2 = c();
            if (((String) c2.d).matches(str)) {
                return c2;
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

    public void n(int i3) {
        int i10 = 0;
        while (i10 < i3) {
            int skipBytes = ((DataInputStream) this.e).skipBytes(i3 - i10);
            if (skipBytes <= 0) {
                throw new EOFException();
            }
            i10 += skipBytes;
        }
    }

    @Override // gf.p
    public final String toString() {
        switch (this.g) {
            case 0:
                StringBuffer stringBuffer = new StringBuffer();
                h(stringBuffer, this);
                stringBuffer.append("[off=");
                long j10 = ((rf.a) ((p) this.c).b).b;
                rf.a aVar = (rf.a) this.b;
                stringBuffer.append(j10 - aVar.b);
                stringBuffer.append(",pos=");
                stringBuffer.append(aVar.b);
                stringBuffer.append(",len=");
                rf.b bVar = (rf.b) aVar;
                stringBuffer.append(bVar.e() + bVar.b);
                stringBuffer.append("]");
                return stringBuffer.toString();
            default:
                return g.r(new StringBuilder("mp4[pos="), ((rf.a) this.b).b, "]");
        }
    }
}
