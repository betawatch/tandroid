package tf;

import java.io.EOFException;
import java.io.InputStream;
import org.telegram.messenger.ou;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class e {
    public static final b7.j e = new b7.j(4);
    public final uf.a a;
    public final h b;
    public final f c;
    public final ou d;

    public e(InputStream inputStream, long j3, int i7, h hVar, f fVar) {
        uf.a aVar = new uf.a(inputStream, j3, i7);
        this.a = aVar;
        this.d = new ou(aVar, 26);
        this.b = hVar;
        this.c = fVar;
    }

    public static String a(byte[] bArr, int i7, b bVar, boolean z10) {
        if (z10) {
            int i10 = 0;
            for (int i11 = 0; i11 < i7; i11++) {
                if (bArr[i11] == 0 && (bVar != b.d || i10 != 0 || i11 % 2 == 0)) {
                    i10++;
                    int i12 = bVar.b;
                    if (i10 == i12) {
                        i7 = (i11 + 1) - i12;
                        break;
                    }
                } else {
                    i10 = 0;
                }
            }
        }
        try {
            String str = new String(bArr, 0, i7, bVar.a.name());
            return (str.length() <= 0 || str.charAt(0) != 65279) ? str : str.substring(1);
        } catch (Exception unused) {
            return "";
        }
    }

    public final b b() {
        byte g12 = this.d.g1();
        if (g12 == 0) {
            return b.c;
        }
        if (g12 == 1) {
            return b.d;
        }
        if (g12 == 2) {
            return b.e;
        }
        if (g12 == 3) {
            return b.f;
        }
        throw new c(i5.c.i(g12, "Invalid encoding: "));
    }

    public final String c(int i7, b bVar) {
        if (i7 > this.a.e()) {
            throw new c(i5.c.i(i7, "Could not read fixed-length string of length: "));
        }
        d dVar = (d) e.get();
        byte[] bArr = dVar.a;
        if (i7 > bArr.length) {
            int length = bArr.length;
            do {
                length *= 2;
            } while (i7 > length);
            dVar.a = new byte[length];
        }
        byte[] bArr2 = dVar.a;
        int i10 = 0;
        while (true) {
            ou ouVar = this.d;
            if (i10 >= i7) {
                ouVar.getClass();
                return a(bArr2, i7, bVar, true);
            }
            int read = ((ab.d) ouVar.b).read(bArr2, i10, i7 - i10);
            if (read <= 0) {
                throw new EOFException();
            }
            i10 += read;
        }
    }

    public final String d(int i7, b bVar) {
        int min = Math.min(i7, (int) this.a.e());
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
            byte g12 = this.d.g1();
            bArr2[i11] = g12;
            if (g12 != 0 || (bVar == b.d && i10 == 0 && i11 % 2 != 0)) {
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
        uf.a aVar = this.a;
        sb2.append(aVar.b);
        sb2.append(", ");
        sb2.append(aVar.e());
        sb2.append(" left]");
        return sb2.toString();
    }
}
