package ua;

import a9.p;
import j$.util.Objects;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Reader;
import java.util.Arrays;
import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class a implements Closeable {
    public final Reader a;
    public long n;
    public int r;
    public String s;
    public int[] v;
    public String[] x;
    public int[] y;
    public final char[] b = new char[1024];
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int h = 0;
    public int w = 1;

    static {
        xa.a.d = new xa.a(22);
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.v = iArr;
        iArr[0] = 6;
        this.x = new String[32];
        this.y = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.a = reader;
    }

    public final void A(char c10) {
        do {
            int i10 = this.c;
            int i11 = this.d;
            while (i10 < i11) {
                int i12 = i10 + 1;
                char c11 = this.b[i10];
                if (c11 == c10) {
                    this.c = i12;
                    return;
                }
                if (c11 == '\\') {
                    this.c = i12;
                    z();
                    i10 = this.c;
                    i11 = this.d;
                } else {
                    if (c11 == '\n') {
                        this.e++;
                        this.f = i12;
                    }
                    i10 = i12;
                }
            }
            this.c = i10;
        } while (g(1));
        D("Unterminated string");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0049, code lost:
    
        c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004d, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B() {
        int i10;
        do {
            int i11 = 0;
            while (true) {
                i10 = this.c;
                if (i10 + i11 < this.d) {
                    char c10 = this.b[i10 + i11];
                    if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                        if (c10 != '#') {
                            if (c10 != ',') {
                                if (c10 != '/' && c10 != '=') {
                                    if (c10 != '{' && c10 != '}' && c10 != ':') {
                                        if (c10 != ';') {
                                            switch (c10) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i11++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    this.c = i10 + i11;
                }
            }
            this.c = i10 + i11;
            return;
        } while (g(1));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void C() {
        int i10 = 0;
        do {
            int i11 = this.h;
            if (i11 == 0) {
                i11 = d();
            }
            switch (i11) {
                case 1:
                    y(3);
                    i10++;
                    this.h = 0;
                    break;
                case 2:
                    if (i10 == 0) {
                        this.x[this.w - 1] = null;
                    }
                    this.w--;
                    i10--;
                    this.h = 0;
                    break;
                case 3:
                    y(1);
                    i10++;
                    this.h = 0;
                    break;
                case 4:
                    this.w--;
                    i10--;
                    this.h = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.h = 0;
                    break;
                case 8:
                    A('\'');
                    this.h = 0;
                    break;
                case 9:
                    A('\"');
                    this.h = 0;
                    break;
                case 10:
                    B();
                    this.h = 0;
                    break;
                case 12:
                    A('\'');
                    if (i10 == 0) {
                        this.x[this.w - 1] = "<skipped>";
                    }
                    this.h = 0;
                    break;
                case 13:
                    A('\"');
                    if (i10 == 0) {
                        this.x[this.w - 1] = "<skipped>";
                    }
                    this.h = 0;
                    break;
                case 14:
                    B();
                    if (i10 == 0) {
                        this.x[this.w - 1] = "<skipped>";
                    }
                    this.h = 0;
                    break;
                case 16:
                    this.c += this.r;
                    this.h = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i10 > 0);
        int[] iArr = this.y;
        int i12 = this.w - 1;
        iArr[i12] = iArr[i12] + 1;
    }

    public final void D(String str) {
        StringBuilder o10 = com.google.android.recaptcha.internal.a.o(str);
        o10.append(m());
        o10.append("\nSee ");
        o10.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
        throw new c(o10.toString());
    }

    public final IllegalStateException E(String str) {
        String str2 = x() == 9 ? "adapter-not-null-safe" : "unexpected-json-structure";
        StringBuilder r10 = p.r("Expected ", str, " but was ");
        r10.append(s3.c.n(x()));
        r10.append(m());
        r10.append("\nSee ");
        r10.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new IllegalStateException(r10.toString());
    }

    public void a() {
        int i10 = this.h;
        if (i10 == 0) {
            i10 = d();
        }
        if (i10 != 3) {
            throw E("BEGIN_ARRAY");
        }
        y(1);
        this.y[this.w - 1] = 0;
        this.h = 0;
    }

    public void b() {
        int i10 = this.h;
        if (i10 == 0) {
            i10 = d();
        }
        if (i10 != 1) {
            throw E("BEGIN_OBJECT");
        }
        y(3);
        this.h = 0;
    }

    public final void c() {
        D("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.h = 0;
        this.v[0] = 8;
        this.w = 1;
        this.a.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01a0, code lost:
    
        if (l(r14) != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01a2, code lost:
    
        if (r12 != 2) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01a4, code lost:
    
        if (r13 == false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01aa, code lost:
    
        if (r7 != Long.MIN_VALUE) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01ac, code lost:
    
        if (r19 == false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01b0, code lost:
    
        if (r7 != 0) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01b2, code lost:
    
        if (r19 != false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01b4, code lost:
    
        if (r19 == false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01b7, code lost:
    
        r7 = -r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01b8, code lost:
    
        r24.n = r7;
        r24.c += r9;
        r9 = 15;
        r24.h = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01c4, code lost:
    
        if (r12 == 2) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01c7, code lost:
    
        if (r12 == 4) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01ca, code lost:
    
        if (r12 != 7) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01cc, code lost:
    
        r24.r = r9;
        r9 = 16;
        r24.h = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0117 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01f6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d() {
        int s10;
        String str;
        String str2;
        int i10;
        char c10;
        int i11;
        int[] iArr = this.v;
        int i12 = this.w - 1;
        int i13 = iArr[i12];
        if (i13 == 1) {
            iArr[i12] = 2;
        } else if (i13 == 2) {
            int s11 = s(true);
            if (s11 != 44) {
                if (s11 == 59) {
                    c();
                    throw null;
                }
                if (s11 == 93) {
                    this.h = 4;
                    return 4;
                }
                D("Unterminated array");
                throw null;
            }
        } else {
            if (i13 == 3 || i13 == 5) {
                iArr[i12] = 4;
                if (i13 == 5 && (s10 = s(true)) != 44) {
                    if (s10 == 59) {
                        c();
                        throw null;
                    }
                    if (s10 == 125) {
                        this.h = 2;
                        return 2;
                    }
                    D("Unterminated object");
                    throw null;
                }
                int s12 = s(true);
                if (s12 == 34) {
                    this.h = 13;
                    return 13;
                }
                if (s12 == 39) {
                    c();
                    throw null;
                }
                if (s12 != 125) {
                    c();
                    throw null;
                }
                if (i13 != 5) {
                    this.h = 2;
                    return 2;
                }
                D("Expected name");
                throw null;
            }
            if (i13 == 4) {
                iArr[i12] = 5;
                int s13 = s(true);
                if (s13 != 58) {
                    if (s13 != 61) {
                        D("Expected ':'");
                        throw null;
                    }
                    c();
                    throw null;
                }
            } else if (i13 == 6) {
                iArr[i12] = 7;
            } else {
                if (i13 == 7) {
                    if (s(false) == -1) {
                        this.h = 17;
                        return 17;
                    }
                    c();
                    throw null;
                }
                if (i13 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
            }
        }
        int s14 = s(true);
        if (s14 == 34) {
            this.h = 9;
            return 9;
        }
        if (s14 == 39) {
            c();
            throw null;
        }
        if (s14 != 44 && s14 != 59) {
            if (s14 == 91) {
                this.h = 3;
                return 3;
            }
            if (s14 != 93) {
                if (s14 == 123) {
                    this.h = 1;
                    return 1;
                }
                int i14 = this.c - 1;
                this.c = i14;
                char[] cArr = this.b;
                char c11 = cArr[i14];
                if (c11 == 't' || c11 == 'T') {
                    str = "true";
                    str2 = "TRUE";
                    i10 = 5;
                } else if (c11 == 'f' || c11 == 'F') {
                    str = "false";
                    str2 = "FALSE";
                    i10 = 6;
                } else {
                    if (c11 == 'n' || c11 == 'N') {
                        str = BuildConfig.BETA_URL;
                        str2 = "NULL";
                        i10 = 7;
                    }
                    i10 = 0;
                    if (i10 == 0) {
                        return i10;
                    }
                    int i15 = this.c;
                    int i16 = this.d;
                    long j10 = 0;
                    int i17 = 0;
                    char c12 = 0;
                    boolean z10 = true;
                    boolean z11 = false;
                    while (true) {
                        if (i15 + i17 == i16) {
                            if (i17 == cArr.length) {
                                break;
                            }
                            if (!g(i17 + 1)) {
                                break;
                            }
                            i15 = this.c;
                            i16 = this.d;
                        }
                        char c13 = cArr[i15 + i17];
                        if (c13 != '+') {
                            if (c13 == 'E' || c13 == 'e') {
                                if (c12 != 2 && c12 != 4) {
                                    break;
                                }
                                c12 = 5;
                                i17++;
                            } else if (c13 != '-') {
                                if (c13 == '.') {
                                    if (c12 != 2) {
                                        break;
                                    }
                                    c12 = 3;
                                    i17++;
                                } else {
                                    if (c13 < '0' || c13 > '9') {
                                        break;
                                    }
                                    if (c12 == 1 || c12 == 0) {
                                        j10 = -(c13 - '0');
                                        c12 = 2;
                                    } else if (c12 == 2) {
                                        if (j10 == 0) {
                                            break;
                                        }
                                        long j11 = (10 * j10) - (c13 - '0');
                                        z10 &= j10 > -922337203685477580L || (j10 == -922337203685477580L && j11 < j10);
                                        j10 = j11;
                                    } else if (c12 == 3) {
                                        c12 = 4;
                                    } else if (c12 == 5 || c12 == 6) {
                                        c12 = 7;
                                    }
                                    i17++;
                                }
                            } else if (c12 == 0) {
                                c12 = 1;
                                z11 = true;
                                i17++;
                            } else {
                                if (c12 != 5) {
                                    break;
                                }
                                c12 = 6;
                                i17++;
                            }
                            if (i11 == 0) {
                                return i11;
                            }
                            if (l(cArr[this.c])) {
                                c();
                                throw null;
                            }
                            D("Expected value");
                            throw null;
                        }
                        if (c12 != 5) {
                            break;
                        }
                        c12 = 6;
                        i17++;
                    }
                    i11 = 0;
                    if (i11 == 0) {
                    }
                }
                int length = str.length();
                int i18 = 0;
                while (true) {
                    if (i18 < length) {
                        if ((this.c + i18 >= this.d && !g(i18 + 1)) || ((c10 = cArr[this.c + i18]) != str.charAt(i18) && c10 != str2.charAt(i18))) {
                            break;
                        }
                        i18++;
                    } else if ((this.c + length >= this.d && !g(length + 1)) || !l(cArr[this.c + length])) {
                        this.c += length;
                        this.h = i10;
                    }
                }
                i10 = 0;
                if (i10 == 0) {
                }
            } else if (i13 == 1) {
                this.h = 4;
                return 4;
            }
        }
        if (i13 == 1 || i13 == 2) {
            c();
            throw null;
        }
        D("Unexpected value");
        throw null;
    }

    public void e() {
        int i10 = this.h;
        if (i10 == 0) {
            i10 = d();
        }
        if (i10 != 4) {
            throw E("END_ARRAY");
        }
        int i11 = this.w;
        this.w = i11 - 1;
        int[] iArr = this.y;
        int i12 = i11 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.h = 0;
    }

    public void f() {
        int i10 = this.h;
        if (i10 == 0) {
            i10 = d();
        }
        if (i10 != 2) {
            throw E("END_OBJECT");
        }
        int i11 = this.w;
        int i12 = i11 - 1;
        this.w = i12;
        this.x[i12] = null;
        int[] iArr = this.y;
        int i13 = i11 - 2;
        iArr[i13] = iArr[i13] + 1;
        this.h = 0;
    }

    public final boolean g(int i10) {
        int i11;
        int i12;
        int i13 = this.f;
        int i14 = this.c;
        this.f = i13 - i14;
        int i15 = this.d;
        char[] cArr = this.b;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.d = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.d = 0;
        }
        this.c = 0;
        do {
            int i17 = this.d;
            int read = this.a.read(cArr, i17, cArr.length - i17);
            if (read == -1) {
                return false;
            }
            i11 = this.d + read;
            this.d = i11;
            if (this.e == 0 && (i12 = this.f) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.c++;
                this.f = i12 + 1;
                i10++;
            }
        } while (i11 < i10);
        return true;
    }

    public String h() {
        return i(false);
    }

    public final String i(boolean z10) {
        StringBuilder sb2 = new StringBuilder("$");
        int i10 = 0;
        while (true) {
            int i11 = this.w;
            if (i10 >= i11) {
                return sb2.toString();
            }
            int i12 = this.v[i10];
            switch (i12) {
                case 1:
                case 2:
                    int i13 = this.y[i10];
                    if (z10 && i13 > 0 && i10 == i11 - 1) {
                        i13--;
                    }
                    sb2.append('[');
                    sb2.append(i13);
                    sb2.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb2.append('.');
                    String str = this.x[i10];
                    if (str == null) {
                        break;
                    } else {
                        sb2.append(str);
                        break;
                    }
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError(i0.a.k(i12, "Unknown scope value: "));
            }
            i10++;
        }
    }

    public String j() {
        return i(true);
    }

    public boolean k() {
        int i10 = this.h;
        if (i10 == 0) {
            i10 = d();
        }
        return (i10 == 2 || i10 == 4 || i10 == 17) ? false : true;
    }

    public final boolean l(char c10) {
        if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (c10 != '/' && c10 != '=') {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        c();
        throw null;
    }

    final String m() {
        StringBuilder p6 = com.google.android.recaptcha.internal.a.p(" at line ", this.e + 1, " column ", (this.c - this.f) + 1, " path ");
        p6.append(h());
        return p6.toString();
    }

    public boolean n() {
        int i10 = this.h;
        if (i10 == 0) {
            i10 = d();
        }
        if (i10 == 5) {
            this.h = 0;
            int[] iArr = this.y;
            int i11 = this.w - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        }
        if (i10 != 6) {
            throw E("a boolean");
        }
        this.h = 0;
        int[] iArr2 = this.y;
        int i12 = this.w - 1;
        iArr2[i12] = iArr2[i12] + 1;
        return false;
    }

    public double o() {
        int i10 = this.h;
        if (i10 == 0) {
            i10 = d();
        }
        if (i10 == 15) {
            this.h = 0;
            int[] iArr = this.y;
            int i11 = this.w - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.n;
        }
        if (i10 == 16) {
            this.s = new String(this.b, this.c, this.r);
            this.c += this.r;
        } else if (i10 == 8 || i10 == 9) {
            this.s = u(i10 == 8 ? '\'' : '\"');
        } else if (i10 == 10) {
            this.s = w();
        } else if (i10 != 11) {
            throw E("a double");
        }
        this.h = 11;
        double parseDouble = Double.parseDouble(this.s);
        if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
            D("JSON forbids NaN and infinities: " + parseDouble);
            throw null;
        }
        this.s = null;
        this.h = 0;
        int[] iArr2 = this.y;
        int i12 = this.w - 1;
        iArr2[i12] = iArr2[i12] + 1;
        return parseDouble;
    }

    public int p() {
        int i10 = this.h;
        if (i10 == 0) {
            i10 = d();
        }
        if (i10 == 15) {
            long j10 = this.n;
            int i11 = (int) j10;
            if (j10 != i11) {
                throw new NumberFormatException("Expected an int but was " + this.n + m());
            }
            this.h = 0;
            int[] iArr = this.y;
            int i12 = this.w - 1;
            iArr[i12] = iArr[i12] + 1;
            return i11;
        }
        if (i10 == 16) {
            this.s = new String(this.b, this.c, this.r);
            this.c += this.r;
        } else {
            if (i10 != 8 && i10 != 9 && i10 != 10) {
                throw E("an int");
            }
            if (i10 == 10) {
                this.s = w();
            } else {
                this.s = u(i10 == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.s);
                this.h = 0;
                int[] iArr2 = this.y;
                int i13 = this.w - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.h = 11;
        double parseDouble = Double.parseDouble(this.s);
        int i14 = (int) parseDouble;
        if (i14 != parseDouble) {
            throw new NumberFormatException("Expected an int but was " + this.s + m());
        }
        this.s = null;
        this.h = 0;
        int[] iArr3 = this.y;
        int i15 = this.w - 1;
        iArr3[i15] = iArr3[i15] + 1;
        return i14;
    }

    public long q() {
        int i10 = this.h;
        if (i10 == 0) {
            i10 = d();
        }
        if (i10 == 15) {
            this.h = 0;
            int[] iArr = this.y;
            int i11 = this.w - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.n;
        }
        if (i10 == 16) {
            this.s = new String(this.b, this.c, this.r);
            this.c += this.r;
        } else {
            if (i10 != 8 && i10 != 9 && i10 != 10) {
                throw E("a long");
            }
            if (i10 == 10) {
                this.s = w();
            } else {
                this.s = u(i10 == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.s);
                this.h = 0;
                int[] iArr2 = this.y;
                int i12 = this.w - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.h = 11;
        double parseDouble = Double.parseDouble(this.s);
        long j10 = (long) parseDouble;
        if (j10 != parseDouble) {
            throw new NumberFormatException("Expected a long but was " + this.s + m());
        }
        this.s = null;
        this.h = 0;
        int[] iArr3 = this.y;
        int i13 = this.w - 1;
        iArr3[i13] = iArr3[i13] + 1;
        return j10;
    }

    public String r() {
        String u10;
        int i10 = this.h;
        if (i10 == 0) {
            i10 = d();
        }
        if (i10 == 14) {
            u10 = w();
        } else if (i10 == 12) {
            u10 = u('\'');
        } else {
            if (i10 != 13) {
                throw E("a name");
            }
            u10 = u('\"');
        }
        this.h = 0;
        this.x[this.w - 1] = u10;
        return u10;
    }

    public final int s(boolean z10) {
        int i10 = this.c;
        int i11 = this.d;
        while (true) {
            if (i10 == i11) {
                this.c = i10;
                if (!g(1)) {
                    if (!z10) {
                        return -1;
                    }
                    throw new EOFException("End of input" + m());
                }
                i10 = this.c;
                i11 = this.d;
            }
            int i12 = i10 + 1;
            char c10 = this.b[i10];
            if (c10 == '\n') {
                this.e++;
                this.f = i12;
            } else if (c10 != ' ' && c10 != '\r' && c10 != '\t') {
                if (c10 != '/') {
                    if (c10 != '#') {
                        this.c = i12;
                        return c10;
                    }
                    this.c = i12;
                    c();
                    throw null;
                }
                this.c = i12;
                if (i12 == i11) {
                    this.c = i10;
                    boolean g10 = g(2);
                    this.c++;
                    if (!g10) {
                        return c10;
                    }
                }
                c();
                throw null;
            }
            i10 = i12;
        }
    }

    public void t() {
        int i10 = this.h;
        if (i10 == 0) {
            i10 = d();
        }
        if (i10 != 7) {
            throw E(BuildConfig.BETA_URL);
        }
        this.h = 0;
        int[] iArr = this.y;
        int i11 = this.w - 1;
        iArr[i11] = iArr[i11] + 1;
    }

    public String toString() {
        return getClass().getSimpleName() + m();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        r10.c = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        if (r1 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005b, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006b, code lost:
    
        r1.append(r7, r3, r2 - r3);
        r10.c = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String u(char c10) {
        char[] cArr;
        int i10;
        StringBuilder sb2 = null;
        do {
            int i11 = this.c;
            int i12 = this.d;
            while (true) {
                int i13 = i12;
                int i14 = i11;
                while (true) {
                    cArr = this.b;
                    if (i11 >= i13) {
                        break;
                    }
                    int i15 = i11 + 1;
                    char c11 = cArr[i11];
                    if (c11 == c10) {
                        this.c = i15;
                        int i16 = (i15 - i14) - 1;
                        if (sb2 == null) {
                            return new String(cArr, i14, i16);
                        }
                        sb2.append(cArr, i14, i16);
                        return sb2.toString();
                    }
                    if (c11 == '\\') {
                        break;
                    }
                    if (c11 == '\n') {
                        this.e++;
                        this.f = i15;
                    }
                    i11 = i15;
                }
                sb2.append(cArr, i14, i10);
                sb2.append(z());
                i11 = this.c;
                i12 = this.d;
            }
        } while (g(1));
        D("Unterminated string");
        throw null;
    }

    public String v() {
        String str;
        int i10 = this.h;
        if (i10 == 0) {
            i10 = d();
        }
        if (i10 == 10) {
            str = w();
        } else if (i10 == 8) {
            str = u('\'');
        } else if (i10 == 9) {
            str = u('\"');
        } else if (i10 == 11) {
            str = this.s;
            this.s = null;
        } else if (i10 == 15) {
            str = Long.toString(this.n);
        } else {
            if (i10 != 16) {
                throw E("a string");
            }
            str = new String(this.b, this.c, this.r);
            this.c += this.r;
        }
        this.h = 0;
        int[] iArr = this.y;
        int i11 = this.w - 1;
        iArr[i11] = iArr[i11] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x004b, code lost:
    
        c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x004e, code lost:
    
        throw null;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String w() {
        char[] cArr;
        String sb2;
        int i10 = 0;
        StringBuilder sb3 = null;
        do {
            int i11 = 0;
            while (true) {
                int i12 = this.c;
                int i13 = i12 + i11;
                int i14 = this.d;
                cArr = this.b;
                if (i13 < i14) {
                    char c10 = cArr[i12 + i11];
                    if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                        if (c10 != '#') {
                            if (c10 != ',') {
                                if (c10 != '/' && c10 != '=') {
                                    if (c10 != '{' && c10 != '}' && c10 != ':') {
                                        if (c10 != ';') {
                                            switch (c10) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i11++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (i11 >= cArr.length) {
                    if (sb3 == null) {
                        sb3 = new StringBuilder(Math.max(i11, 16));
                    }
                    sb3.append(cArr, this.c, i11);
                    this.c += i11;
                } else if (g(i11 + 1)) {
                }
            }
            i10 = i11;
            if (sb3 != null) {
                sb2 = new String(cArr, this.c, i10);
            } else {
                sb3.append(cArr, this.c, i10);
                sb2 = sb3.toString();
            }
            this.c += i10;
            return sb2;
        } while (g(1));
        if (sb3 != null) {
        }
        this.c += i10;
        return sb2;
    }

    public int x() {
        int i10 = this.h;
        if (i10 == 0) {
            i10 = d();
        }
        switch (i10) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final void y(int i10) {
        int i11 = this.w;
        int[] iArr = this.v;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.v = Arrays.copyOf(iArr, i12);
            this.y = Arrays.copyOf(this.y, i12);
            this.x = (String[]) Arrays.copyOf(this.x, i12);
        }
        int[] iArr2 = this.v;
        int i13 = this.w;
        this.w = i13 + 1;
        iArr2[i13] = i10;
    }

    public final char z() {
        int i10;
        if (this.c == this.d && !g(1)) {
            D("Unterminated escape sequence");
            throw null;
        }
        int i11 = this.c;
        int i12 = i11 + 1;
        this.c = i12;
        char[] cArr = this.b;
        char c10 = cArr[i11];
        if (c10 == '\n') {
            this.e++;
            this.f = i12;
            return c10;
        }
        if (c10 == '\"' || c10 == '\'' || c10 == '/' || c10 == '\\') {
            return c10;
        }
        if (c10 == 'b') {
            return '\b';
        }
        if (c10 == 'f') {
            return '\f';
        }
        if (c10 == 'n') {
            return '\n';
        }
        if (c10 == 'r') {
            return '\r';
        }
        if (c10 == 't') {
            return '\t';
        }
        if (c10 != 'u') {
            D("Invalid escape sequence");
            throw null;
        }
        if (i11 + 5 > this.d && !g(4)) {
            D("Unterminated escape sequence");
            throw null;
        }
        int i13 = this.c;
        int i14 = i13 + 4;
        int i15 = 0;
        while (i13 < i14) {
            char c11 = cArr[i13];
            int i16 = i15 << 4;
            if (c11 >= '0' && c11 <= '9') {
                i10 = c11 - '0';
            } else if (c11 >= 'a' && c11 <= 'f') {
                i10 = c11 - 'W';
            } else {
                if (c11 < 'A' || c11 > 'F') {
                    D("Malformed Unicode escape \\u".concat(new String(cArr, this.c, 4)));
                    throw null;
                }
                i10 = c11 - '7';
            }
            i15 = i10 + i16;
            i13++;
        }
        this.c += 4;
        return (char) i15;
    }
}
