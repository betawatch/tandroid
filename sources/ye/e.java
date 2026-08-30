package ye;

import com.google.android.gms.common.api.internal.o1;
import java.io.EOFException;
import java.io.InputStream;
import kh.a2;
import ph.j5;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class e {
    public static final o1 e = new o1(3);
    public final ze.a a;
    public final h b;
    public final f c;
    public final j5 d;

    public e(InputStream inputStream, long j10, int i10, h hVar, f fVar) {
        ze.a aVar = new ze.a(inputStream, j10, i10);
        this.a = aVar;
        this.d = new j5(aVar, 19);
        this.b = hVar;
        this.c = fVar;
    }

    public static String a(byte[] bArr, int i10, b bVar, boolean z4) {
        if (z4) {
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                if (bArr[i12] == 0 && (bVar != b.d || i11 != 0 || i12 % 2 == 0)) {
                    i11++;
                    int i13 = bVar.b;
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
            String str = new String(bArr, 0, i10, bVar.a.name());
            return (str.length() <= 0 || str.charAt(0) != 65279) ? str : str.substring(1);
        } catch (Exception unused) {
            return "";
        }
    }

    public final b b() {
        byte h02 = this.d.h0();
        if (h02 == 0) {
            return b.c;
        }
        if (h02 == 1) {
            return b.d;
        }
        if (h02 == 2) {
            return b.e;
        }
        if (h02 == 3) {
            return b.f;
        }
        throw new c(a2.j(h02, "Invalid encoding: "));
    }

    public final String c(int i10, b bVar) {
        if (i10 > this.a.e()) {
            throw new c(a2.j(i10, "Could not read fixed-length string of length: "));
        }
        d dVar = (d) e.get();
        byte[] bArr = dVar.a;
        if (i10 > bArr.length) {
            int length = bArr.length;
            do {
                length *= 2;
            } while (i10 > length);
            dVar.a = new byte[length];
        }
        byte[] bArr2 = dVar.a;
        int i11 = 0;
        while (true) {
            j5 j5Var = this.d;
            if (i11 >= i10) {
                j5Var.getClass();
                return a(bArr2, i10, bVar, true);
            }
            int read = ((com.google.firebase.messaging.d) j5Var.b).read(bArr2, i11, i10 - i11);
            if (read <= 0) {
                throw new EOFException();
            }
            i11 += read;
        }
    }

    public final String d(int i10, b bVar) {
        int min = Math.min(i10, (int) this.a.e());
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
        int i11 = 0;
        for (int i12 = 0; i12 < min; i12++) {
            byte h02 = this.d.h0();
            bArr2[i12] = h02;
            if (h02 != 0 || (bVar == b.d && i11 == 0 && i12 % 2 != 0)) {
                i11 = 0;
            } else {
                i11++;
                int i13 = bVar.b;
                if (i11 == i13) {
                    return a(bArr2, (i12 + 1) - i13, bVar, false);
                }
            }
        }
        throw new c("Could not read zero-termiated string");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("id3v2frame[pos=");
        ze.a aVar = this.a;
        sb.append(aVar.b);
        sb.append(", ");
        sb.append(aVar.e());
        sb.append(" left]");
        return sb.toString();
    }
}
