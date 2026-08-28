package rb;

import com.google.firebase.messaging.s;
import d5.p;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import lb.h;
import n2.w;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class c {
    public static final int[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};
    public static final Charset b = StandardCharsets.ISO_8859_1;

    /* JADX WARN: Removed duplicated region for block: B:20:0x004d A[LOOP:0: B:13:0x0022->B:20:0x004d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(String str, pb.d dVar, lb.a aVar, Charset charset) {
        int i9;
        int ordinal = dVar.ordinal();
        int i10 = 0;
        if (ordinal == 1) {
            int length = str.length();
            while (i10 < length) {
                int charAt = str.charAt(i10) - '0';
                int i11 = i10 + 2;
                if (i11 < length) {
                    aVar.b(((str.charAt(i10 + 1) - '0') * 10) + (charAt * 100) + (str.charAt(i11) - '0'), 10);
                    i10 += 3;
                } else {
                    i10++;
                    if (i10 < length) {
                        aVar.b((charAt * 10) + (str.charAt(i10) - '0'), 7);
                        i10 = i11;
                    } else {
                        aVar.b(charAt, 4);
                    }
                }
            }
            return;
        }
        if (ordinal == 2) {
            int length2 = str.length();
            while (i10 < length2) {
                char charAt2 = str.charAt(i10);
                int[] iArr = a;
                int i12 = charAt2 < '`' ? iArr[charAt2] : -1;
                if (i12 == -1) {
                    throw new s();
                }
                int i13 = i10 + 1;
                if (i13 < length2) {
                    char charAt3 = str.charAt(i13);
                    int i14 = charAt3 < '`' ? iArr[charAt3] : -1;
                    if (i14 == -1) {
                        throw new s();
                    }
                    aVar.b((i12 * 45) + i14, 11);
                    i10 += 2;
                } else {
                    aVar.b(i12, 6);
                    i10 = i13;
                }
            }
            return;
        }
        if (ordinal == 4) {
            byte[] bytes = str.getBytes(charset);
            int length3 = bytes.length;
            while (i10 < length3) {
                aVar.b(bytes[i10], 8);
                i10++;
            }
            return;
        }
        if (ordinal != 6) {
            throw new s("Invalid mode: " + dVar);
        }
        Charset charset2 = h.b;
        if (charset2 == null) {
            throw new s("SJIS Charset not supported on this platform");
        }
        byte[] bytes2 = str.getBytes(charset2);
        if (bytes2.length % 2 != 0) {
            throw new s("Kanji byte size not even");
        }
        int length4 = bytes2.length - 1;
        while (i10 < length4) {
            int i15 = ((bytes2[i10] & 255) << 8) | (bytes2[i10 + 1] & 255);
            int i16 = 33088;
            if (i15 < 33088 || i15 > 40956) {
                if (i15 < 57408 || i15 > 60351) {
                    i9 = -1;
                    if (i9 != -1) {
                        throw new s("Invalid byte sequence");
                    }
                    aVar.b(((i9 >> 8) * 192) + (i9 & 255), 13);
                    i10 += 2;
                } else {
                    i16 = 49472;
                }
            }
            i9 = i15 - i16;
            if (i9 != -1) {
            }
        }
    }

    public static boolean b(String str) {
        byte[] bytes = str.getBytes(h.b);
        int length = bytes.length;
        if (length % 2 != 0) {
            return false;
        }
        for (int i9 = 0; i9 < length; i9 += 2) {
            int i10 = bytes[i9] & 255;
            if ((i10 < 129 || i10 > 159) && (i10 < 224 || i10 > 235)) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(int i9, pb.e eVar, pb.b bVar) {
        int i10 = eVar.d;
        w wVar = eVar.c[bVar.ordinal()];
        int i11 = wVar.b;
        int i12 = 0;
        for (p pVar : (p[]) wVar.c) {
            i12 += pVar.a;
        }
        return i10 - (i12 * i11) >= (i9 + 7) / 8;
    }
}
