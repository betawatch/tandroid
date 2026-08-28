package te;

import j3.r0;
import java.io.EOFException;
import java.io.InputStream;
import n2.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e {
    public static final ad.b e = new ad.b(3);
    public final ue.a a;
    public final h b;
    public final f c;
    public final p d;

    public e(InputStream inputStream, long j10, int i9, h hVar, f fVar) {
        ue.a aVar = new ue.a(inputStream, j10, i9);
        this.a = aVar;
        this.d = new p(aVar, 22);
        this.b = hVar;
        this.c = fVar;
    }

    public static String a(byte[] bArr, int i9, b bVar, boolean z10) {
        if (z10) {
            int i10 = 0;
            for (int i11 = 0; i11 < i9; i11++) {
                if (bArr[i11] == 0 && (bVar != b.d || i10 != 0 || i11 % 2 == 0)) {
                    i10++;
                    int i12 = bVar.b;
                    if (i10 == i12) {
                        i9 = (i11 + 1) - i12;
                        break;
                    }
                } else {
                    i10 = 0;
                }
            }
        }
        try {
            String str = new String(bArr, 0, i9, bVar.a.name());
            return (str.length() <= 0 || str.charAt(0) != 65279) ? str : str.substring(1);
        } catch (Exception unused) {
            return "";
        }
    }

    public final b b() {
        byte L = this.d.L();
        if (L == 0) {
            return b.c;
        }
        if (L == 1) {
            return b.d;
        }
        if (L == 2) {
            return b.e;
        }
        if (L == 3) {
            return b.f;
        }
        throw new c(r0.l(L, "Invalid encoding: "));
    }

    public final String c(int i9, b bVar) {
        if (i9 > this.a.e()) {
            throw new c(r0.l(i9, "Could not read fixed-length string of length: "));
        }
        d dVar = (d) e.get();
        byte[] bArr = dVar.a;
        if (i9 > bArr.length) {
            int length = bArr.length;
            do {
                length *= 2;
            } while (i9 > length);
            dVar.a = new byte[length];
        }
        byte[] bArr2 = dVar.a;
        int i10 = 0;
        while (true) {
            p pVar = this.d;
            if (i10 >= i9) {
                pVar.getClass();
                return a(bArr2, i9, bVar, true);
            }
            int read = ((com.google.firebase.messaging.d) pVar.b).read(bArr2, i10, i9 - i10);
            if (read <= 0) {
                throw new EOFException();
            }
            i10 += read;
        }
    }

    public final String d(int i9, b bVar) {
        int min = Math.min(i9, (int) this.a.e());
        d dVar = (d) e.get();
        byte[] bArr = dVar.a;
        if (min > bArr.length) {
            int length = bArr.length;
            do {
                length *= 2;
            } while (min > length);
            dVar.a = new byte[length];
        }
        byte[] bArr2 = dVar.a;
        int i10 = 0;
        for (int i11 = 0; i11 < min; i11++) {
            byte L = this.d.L();
            bArr2[i11] = L;
            if (L != 0 || (bVar == b.d && i10 == 0 && i11 % 2 != 0)) {
                i10 = 0;
            } else {
                i10++;
                int i12 = bVar.b;
                if (i10 == i12) {
                    return a(bArr2, (i11 + 1) - i12, bVar, false);
                }
            }
        }
        throw new c("Could not read zero-termiated string");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("id3v2frame[pos=");
        ue.a aVar = this.a;
        sb2.append(aVar.b);
        sb2.append(", ");
        sb2.append(aVar.e());
        sb2.append(" left]");
        return sb2.toString();
    }
}
