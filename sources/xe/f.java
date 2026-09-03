package xe;

import com.google.android.gms.common.api.internal.o1;
import java.io.EOFException;
import java.io.InputStream;
import kf.k0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class f {
    public static final o1 e = new o1(3);
    public final ye.a a;
    public final i b;
    public final g c;
    public final b d;

    public f(InputStream inputStream, long j10, int i10, i iVar, g gVar) {
        ye.a aVar = new ye.a(inputStream, j10, i10);
        this.a = aVar;
        this.d = new b(aVar);
        this.b = iVar;
        this.c = gVar;
    }

    public static String a(byte[] bArr, int i10, c cVar, boolean z4) {
        if (z4) {
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                if (bArr[i12] == 0 && (cVar != c.d || i11 != 0 || i12 % 2 == 0)) {
                    i11++;
                    int i13 = cVar.b;
                    if (i11 == i13) {
                        i10 = (i12 + 1) - i13;
                        break;
                    }
                } else {
                    i11 = 0;
                }
            }
        }
        try {
            String str = new String(bArr, 0, i10, cVar.a.name());
            return (str.length() <= 0 || str.charAt(0) != 65279) ? str : str.substring(1);
        } catch (Exception unused) {
            return "";
        }
    }

    public final c b() {
        byte a2 = this.d.a();
        if (a2 == 0) {
            return c.c;
        }
        if (a2 == 1) {
            return c.d;
        }
        if (a2 == 2) {
            return c.e;
        }
        if (a2 == 3) {
            return c.f;
        }
        throw new d(k0.j(a2, "Invalid encoding: "));
    }

    public final String c(int i10, c cVar) {
        if (i10 > this.a.e()) {
            throw new d(k0.j(i10, "Could not read fixed-length string of length: "));
        }
        e eVar = (e) e.get();
        byte[] bArr = eVar.a;
        if (i10 > bArr.length) {
            int length = bArr.length;
            do {
                length *= 2;
            } while (i10 > length);
            eVar.a = new byte[length];
        }
        byte[] bArr2 = eVar.a;
        int i11 = 0;
        while (true) {
            b bVar = this.d;
            if (i11 >= i10) {
                bVar.getClass();
                return a(bArr2, i10, cVar, true);
            }
            int read = ((com.google.firebase.messaging.d) bVar.a).read(bArr2, i11, i10 - i11);
            if (read <= 0) {
                throw new EOFException();
            }
            i11 += read;
        }
    }

    public final String d(int i10, c cVar) {
        int min = Math.min(i10, (int) this.a.e());
        e eVar = (e) e.get();
        byte[] bArr = eVar.a;
        if (min > bArr.length) {
            int length = bArr.length;
            do {
                length *= 2;
            } while (min > length);
            eVar.a = new byte[length];
        }
        byte[] bArr2 = eVar.a;
        int i11 = 0;
        for (int i12 = 0; i12 < min; i12++) {
            byte a2 = this.d.a();
            bArr2[i12] = a2;
            if (a2 != 0 || (cVar == c.d && i11 == 0 && i12 % 2 != 0)) {
                i11 = 0;
            } else {
                i11++;
                int i13 = cVar.b;
                if (i11 == i13) {
                    return a(bArr2, (i12 + 1) - i13, cVar, false);
                }
            }
        }
        throw new d("Could not read zero-termiated string");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("id3v2frame[pos=");
        ye.a aVar = this.a;
        sb.append(aVar.b);
        sb.append(", ");
        sb.append(aVar.e());
        sb.append(" left]");
        return sb.toString();
    }
}
