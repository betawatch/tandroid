package qf;

import java.io.EOFException;
import java.io.InputStream;
import k2.p1;
import org.telegram.ui.Components.nh;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e {
    public static final a7.j e = new a7.j(4);
    public final rf.b a;
    public final h b;
    public final f c;
    public final nh d;

    public e(InputStream inputStream, long j10, int i3, h hVar, f fVar) {
        rf.b bVar = new rf.b(inputStream, j10, i3);
        this.a = bVar;
        this.d = new nh(bVar, 13);
        this.b = hVar;
        this.c = fVar;
    }

    public static String a(byte[] bArr, int i3, b bVar, boolean z10) {
        if (z10) {
            int i10 = 0;
            for (int i11 = 0; i11 < i3; i11++) {
                if (bArr[i11] == 0 && (bVar != b.d || i10 != 0 || i11 % 2 == 0)) {
                    i10++;
                    int i12 = bVar.b;
                    if (i10 == i12) {
                        i3 = (i11 + 1) - i12;
                        break;
                    }
                } else {
                    i10 = 0;
                }
            }
        }
        try {
            String str = new String(bArr, 0, i3, bVar.a.name());
            return (str.length() <= 0 || str.charAt(0) != 65279) ? str : str.substring(1);
        } catch (Exception unused) {
            return "";
        }
    }

    public final b b() {
        byte F = this.d.F();
        if (F == 0) {
            return b.c;
        }
        if (F == 1) {
            return b.d;
        }
        if (F == 2) {
            return b.e;
        }
        if (F == 3) {
            return b.f;
        }
        throw new c(p1.i(F, "Invalid encoding: "));
    }

    public final String c(int i3, b bVar) {
        if (i3 > this.a.e()) {
            throw new c(p1.i(i3, "Could not read fixed-length string of length: "));
        }
        d dVar = (d) e.get();
        byte[] bArr = dVar.a;
        if (i3 > bArr.length) {
            int length = bArr.length;
            do {
                length *= 2;
            } while (i3 > length);
            dVar.a = new byte[length];
        }
        byte[] bArr2 = dVar.a;
        int i10 = 0;
        while (true) {
            nh nhVar = this.d;
            if (i10 >= i3) {
                nhVar.getClass();
                return a(bArr2, i3, bVar, true);
            }
            int read = ((rf.a) nhVar.b).read(bArr2, i10, i3 - i10);
            if (read <= 0) {
                throw new EOFException();
            }
            i10 += read;
        }
    }

    public final String d(int i3, b bVar) {
        int min = Math.min(i3, (int) this.a.e());
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
            byte F = this.d.F();
            bArr2[i11] = F;
            if (F != 0 || (bVar == b.d && i10 == 0 && i11 % 2 != 0)) {
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
        rf.b bVar = this.a;
        sb2.append(bVar.b);
        sb2.append(", ");
        sb2.append(bVar.e());
        sb2.append(" left]");
        return sb2.toString();
    }
}
