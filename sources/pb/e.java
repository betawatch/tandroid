package pb;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class e {
    public static final ArrayList c = new ArrayList();
    public final CharsetEncoder[] a;
    public final int b;

    static {
        String[] strArr = {"IBM437", "ISO-8859-2", "ISO-8859-3", "ISO-8859-4", "ISO-8859-5", "ISO-8859-6", "ISO-8859-7", "ISO-8859-8", "ISO-8859-9", "ISO-8859-10", "ISO-8859-11", "ISO-8859-13", "ISO-8859-14", "ISO-8859-15", "ISO-8859-16", "windows-1250", "windows-1251", "windows-1252", "windows-1256", "Shift_JIS"};
        for (int i10 = 0; i10 < 20; i10++) {
            String str = strArr[i10];
            if (((c) c.d.get(str)) != null) {
                try {
                    c.add(Charset.forName(str).newEncoder());
                } catch (UnsupportedCharsetException unused) {
                }
            }
        }
    }

    public e(String str, Charset charset) {
        int i10;
        boolean z4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(StandardCharsets.ISO_8859_1.newEncoder());
        int i11 = 0;
        boolean z10 = charset != null && charset.name().startsWith("UTF");
        int i12 = 0;
        while (true) {
            i10 = -1;
            if (i12 >= str.length()) {
                break;
            }
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                CharsetEncoder charsetEncoder = (CharsetEncoder) obj;
                char charAt = str.charAt(i12);
                if (charAt == 65535 || charsetEncoder.canEncode(charAt)) {
                    z4 = true;
                    break;
                }
            }
            z4 = false;
            if (!z4) {
                ArrayList arrayList2 = c;
                int size2 = arrayList2.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size2) {
                        break;
                    }
                    Object obj2 = arrayList2.get(i14);
                    i14++;
                    CharsetEncoder charsetEncoder2 = (CharsetEncoder) obj2;
                    if (charsetEncoder2.canEncode(str.charAt(i12))) {
                        arrayList.add(charsetEncoder2);
                        z4 = true;
                        break;
                    }
                }
            }
            if (!z4) {
                z10 = true;
            }
            i12++;
        }
        if (arrayList.size() != 1 || z10) {
            this.a = new CharsetEncoder[arrayList.size() + 2];
            int size3 = arrayList.size();
            int i15 = 0;
            int i16 = 0;
            while (i16 < size3) {
                Object obj3 = arrayList.get(i16);
                i16++;
                this.a[i15] = (CharsetEncoder) obj3;
                i15++;
            }
            this.a[i15] = StandardCharsets.UTF_8.newEncoder();
            this.a[i15 + 1] = StandardCharsets.UTF_16BE.newEncoder();
        } else {
            this.a = new CharsetEncoder[]{(CharsetEncoder) arrayList.get(0)};
        }
        if (charset != null) {
            while (true) {
                CharsetEncoder[] charsetEncoderArr = this.a;
                if (i11 < charsetEncoderArr.length) {
                    if (charsetEncoderArr[i11] != null && charset.name().equals(this.a[i11].charset().name())) {
                        i10 = i11;
                        break;
                    }
                    i11++;
                } else {
                    break;
                }
            }
        }
        this.b = i10;
    }
}
