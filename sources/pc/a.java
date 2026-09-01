package pc;

import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class a {
    public final char[] a;
    public final StringReader b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final String[] h;

    public a(String str) {
        StringReader stringReader = new StringReader(str);
        str.getClass();
        this.h = new String[128];
        if (!stringReader.markSupported()) {
            throw new IllegalArgumentException("Must be true");
        }
        this.b = stringReader;
        this.a = new char[4096];
        b();
    }

    public static String c(char[] cArr, String[] strArr, int i10, int i11) {
        if (i11 > 12) {
            return new String(cArr, i10, i11);
        }
        if (i11 < 1) {
            return "";
        }
        int i12 = 0;
        int i13 = i10;
        int i14 = 0;
        int i15 = 0;
        while (i14 < i11) {
            i15 = (i15 * 31) + cArr[i13];
            i14++;
            i13++;
        }
        int length = i15 & (strArr.length - 1);
        String str = strArr[length];
        if (str == null) {
            String str2 = new String(cArr, i10, i11);
            strArr[length] = str2;
            return str2;
        }
        if (i11 == str.length()) {
            int i16 = i10;
            int i17 = i11;
            while (true) {
                int i18 = i17 - 1;
                if (i17 == 0) {
                    return str;
                }
                int i19 = i16 + 1;
                int i20 = i12 + 1;
                if (cArr[i16] != str.charAt(i12)) {
                    break;
                }
                i16 = i19;
                i17 = i18;
                i12 = i20;
            }
        }
        String str3 = new String(cArr, i10, i11);
        strArr[length] = str3;
        return str3;
    }

    public final void a() {
        this.e++;
    }

    public final void b() {
        StringReader stringReader = this.b;
        int i10 = this.e;
        if (i10 < this.d) {
            return;
        }
        try {
            stringReader.skip(i10);
            stringReader.mark(4096);
            int read = stringReader.read(this.a);
            stringReader.reset();
            if (read != -1) {
                this.c = read;
                this.f += this.e;
                this.e = 0;
                this.g = 0;
                if (read > 3072) {
                    read = 3072;
                }
                this.d = read;
            }
        } catch (IOException e6) {
            throw new a7.b(e6);
        }
    }

    public final char d() {
        b();
        int i10 = this.e;
        char c3 = i10 >= this.c ? (char) 65535 : this.a[i10];
        this.e = i10 + 1;
        return c3;
    }

    public final String e() {
        char[] cArr;
        char c3;
        b();
        int i10 = this.e;
        while (true) {
            int i11 = this.e;
            int i12 = this.c;
            cArr = this.a;
            if (i11 >= i12 || (((c3 = cArr[i11]) < 'A' || c3 > 'Z') && ((c3 < 'a' || c3 > 'z') && !Character.isLetter(c3)))) {
                break;
            }
            this.e++;
        }
        return c(cArr, this.h, i10, this.e - i10);
    }

    public final String f(char c3) {
        char[] cArr;
        int i10;
        b();
        int i11 = this.e;
        while (true) {
            int i12 = this.c;
            cArr = this.a;
            if (i11 >= i12) {
                i10 = -1;
                break;
            }
            if (c3 == cArr[i11]) {
                i10 = i11 - this.e;
                break;
            }
            i11++;
        }
        String[] strArr = this.h;
        if (i10 != -1) {
            String c10 = c(cArr, strArr, this.e, i10);
            this.e += i10;
            return c10;
        }
        b();
        int i13 = this.e;
        String c11 = c(cArr, strArr, i13, this.c - i13);
        this.e = this.c;
        return c11;
    }

    public final String g(char... cArr) {
        char[] cArr2;
        b();
        int i10 = this.e;
        int i11 = this.c;
        loop0: while (true) {
            int i12 = this.e;
            cArr2 = this.a;
            if (i12 >= i11) {
                break;
            }
            for (char c3 : cArr) {
                if (cArr2[this.e] == c3) {
                    break loop0;
                }
            }
            this.e++;
        }
        int i13 = this.e;
        return i13 > i10 ? c(cArr2, this.h, i10, i13 - i10) : "";
    }

    public final String h(char... cArr) {
        char[] cArr2;
        b();
        int i10 = this.e;
        int i11 = this.c;
        while (true) {
            int i12 = this.e;
            cArr2 = this.a;
            if (i12 >= i11 || Arrays.binarySearch(cArr, cArr2[i12]) >= 0) {
                break;
            }
            this.e++;
        }
        int i13 = this.e;
        return i13 > i10 ? c(cArr2, this.h, i10, i13 - i10) : "";
    }

    public final char i() {
        b();
        int i10 = this.e;
        if (i10 >= this.c) {
            return (char) 65535;
        }
        return this.a[i10];
    }

    public final boolean j() {
        b();
        return this.e >= this.c;
    }

    public final boolean k(String str) {
        b();
        b();
        int length = str.length();
        if (length <= this.c - this.e) {
            for (int i10 = 0; i10 < length; i10++) {
                if (str.charAt(i10) == this.a[this.e + i10]) {
                }
            }
            this.e = str.length() + this.e;
            return true;
        }
        return false;
    }

    public final boolean l(String str) {
        b();
        int length = str.length();
        if (length <= this.c - this.e) {
            for (int i10 = 0; i10 < length; i10++) {
                if (Character.toUpperCase(str.charAt(i10)) == Character.toUpperCase(this.a[this.e + i10])) {
                }
            }
            this.e = str.length() + this.e;
            return true;
        }
        return false;
    }

    public final boolean m(char c3) {
        return !j() && this.a[this.e] == c3;
    }

    public final boolean n(char... cArr) {
        if (!j()) {
            b();
            char c3 = this.a[this.e];
            for (char c10 : cArr) {
                if (c10 == c3) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean o() {
        if (j()) {
            return false;
        }
        char c3 = this.a[this.e];
        if (c3 < 'A' || c3 > 'Z') {
            return (c3 >= 'a' && c3 <= 'z') || Character.isLetter(c3);
        }
        return true;
    }

    public final int p(String str) {
        b();
        char charAt = str.charAt(0);
        int i10 = this.e;
        while (i10 < this.c) {
            char[] cArr = this.a;
            if (charAt != cArr[i10]) {
                do {
                    i10++;
                    if (i10 >= this.c) {
                        break;
                    }
                } while (charAt != cArr[i10]);
            }
            int i11 = i10 + 1;
            int length = (str.length() + i11) - 1;
            int i12 = this.c;
            if (i10 < i12 && length <= i12) {
                int i13 = i11;
                for (int i14 = 1; i13 < length && str.charAt(i14) == cArr[i13]; i14++) {
                    i13++;
                }
                if (i13 == length) {
                    return i10 - this.e;
                }
            }
            i10 = i11;
        }
        return -1;
    }

    public final void q() {
        this.e--;
    }

    public final String toString() {
        int i10 = this.e;
        return new String(this.a, i10, this.c - i10);
    }
}
