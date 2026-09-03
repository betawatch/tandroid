package xe;

import com.google.firebase.messaging.d;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import ne.p;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class b extends p {
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, p pVar, String str, int i10) {
        super(dVar, pVar, str);
        this.g = i10;
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
        return ((ze.a) ((d) this.b)).e();
    }

    public boolean j() {
        b bVar = (b) this.f;
        return (bVar != null ? bVar.i() : 0L) < i();
    }

    public b k(String str) {
        while (i() > 0) {
            b c3 = c();
            if (((String) c3.d).matches(str)) {
                return c3;
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

    public void n(int i10) {
        int i11 = 0;
        while (i11 < i10) {
            int skipBytes = ((DataInputStream) this.e).skipBytes(i10 - i11);
            if (skipBytes <= 0) {
                throw new EOFException();
            }
            i11 += skipBytes;
        }
    }

    @Override // ne.p
    public final String toString() {
        switch (this.g) {
            case 0:
                StringBuffer stringBuffer = new StringBuffer();
                h(stringBuffer, this);
                stringBuffer.append("[off=");
                long j10 = ((d) ((p) this.c).b).b;
                d dVar = (d) this.b;
                stringBuffer.append(j10 - dVar.b);
                stringBuffer.append(",pos=");
                stringBuffer.append(dVar.b);
                stringBuffer.append(",len=");
                ze.a aVar = (ze.a) dVar;
                stringBuffer.append(aVar.e() + aVar.b);
                stringBuffer.append("]");
                return stringBuffer.toString();
            default:
                return android.support.v4.media.a.q(new StringBuilder("mp4[pos="), ((d) this.b).b, "]");
        }
    }
}
