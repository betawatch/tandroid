package va;

import j$.util.Objects;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class b implements Closeable, Flushable {
    public static final Pattern w = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    public static final String[] x = new String[128];
    public static final String[] y;
    public final Writer a;
    public int[] b;
    public int c;
    public na.c d;
    public String e;
    public String f;
    public boolean h;
    public int n;
    public boolean r;
    public String s;
    public boolean v;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            x[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = x;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        y = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public b(Writer writer) {
        int[] iArr = new int[32];
        this.b = iArr;
        this.c = 0;
        if (iArr.length == 0) {
            this.b = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.b;
        int i10 = this.c;
        this.c = i10 + 1;
        iArr2[i10] = 6;
        this.n = 2;
        this.v = true;
        Objects.requireNonNull(writer, "out == null");
        this.a = writer;
        k(na.c.d);
    }

    public final void a() {
        int j10 = j();
        if (j10 == 1) {
            this.b[this.c - 1] = 2;
            h();
            return;
        }
        Writer writer = this.a;
        if (j10 == 2) {
            writer.append((CharSequence) this.f);
            h();
        } else {
            if (j10 == 4) {
                writer.append((CharSequence) this.e);
                this.b[this.c - 1] = 5;
                return;
            }
            if (j10 != 6) {
                if (j10 != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.n != 1) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.b[this.c - 1] = 7;
        }
    }

    public void b() {
        t();
        a();
        int i10 = this.c;
        int[] iArr = this.b;
        if (i10 == iArr.length) {
            this.b = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = this.b;
        int i11 = this.c;
        this.c = i11 + 1;
        iArr2[i11] = 1;
        this.a.write(91);
    }

    public void c() {
        t();
        a();
        int i10 = this.c;
        int[] iArr = this.b;
        if (i10 == iArr.length) {
            this.b = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = this.b;
        int i11 = this.c;
        this.c = i11 + 1;
        iArr2[i11] = 3;
        this.a.write(123);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
        int i10 = this.c;
        if (i10 > 1 || (i10 == 1 && this.b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.c = 0;
    }

    public final void d(char c3, int i10, int i11) {
        int j10 = j();
        if (j10 != i11 && j10 != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.s != null) {
            throw new IllegalStateException("Dangling name: " + this.s);
        }
        this.c--;
        if (j10 == i11) {
            h();
        }
        this.a.write(c3);
    }

    public void e() {
        d(']', 1, 2);
    }

    public void f() {
        d('}', 3, 5);
    }

    public void flush() {
        if (this.c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.a.flush();
    }

    public void g(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.s != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int j10 = j();
        if (j10 != 3 && j10 != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.s = str;
    }

    public final void h() {
        if (this.h) {
            return;
        }
        String str = this.d.a;
        Writer writer = this.a;
        writer.write(str);
        int i10 = this.c;
        for (int i11 = 1; i11 < i10; i11++) {
            writer.write(this.d.b);
        }
    }

    public b i() {
        if (this.s != null) {
            if (!this.v) {
                this.s = null;
                return this;
            }
            t();
        }
        a();
        this.a.write(BuildConfig.BETA_URL);
        return this;
    }

    public final int j() {
        int i10 = this.c;
        if (i10 != 0) {
            return this.b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void k(na.c cVar) {
        Objects.requireNonNull(cVar);
        this.d = cVar;
        this.f = ",";
        if (cVar.c) {
            this.e = ": ";
            if (cVar.a.isEmpty()) {
                this.f = ", ";
            }
        } else {
            this.e = ":";
        }
        this.h = this.d.a.isEmpty() && this.d.b.isEmpty();
    }

    public final void l(int i10) {
        if (i10 == 0) {
            throw null;
        }
        this.n = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(String str) {
        int i10;
        String str2;
        String[] strArr = this.r ? y : x;
        Writer writer = this.a;
        writer.write(34);
        int length = str.length();
        int i11 = 0;
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (charAt < 128) {
                str2 = strArr[charAt];
                i10 = str2 == null ? i10 + 1 : 0;
                if (i11 < i10) {
                    writer.write(str, i11, i10 - i11);
                }
                writer.write(str2);
                i11 = i10 + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i11 < i10) {
                }
                writer.write(str2);
                i11 = i10 + 1;
            }
        }
        if (i11 < length) {
            writer.write(str, i11, length - i11);
        }
        writer.write(34);
    }

    public void n(double d) {
        t();
        if (this.n == 1 || !(Double.isNaN(d) || Double.isInfinite(d))) {
            a();
            this.a.append((CharSequence) Double.toString(d));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
    }

    public void o(long j10) {
        t();
        a();
        this.a.write(Long.toString(j10));
    }

    public void p(Boolean bool) {
        if (bool == null) {
            i();
            return;
        }
        t();
        a();
        this.a.write(bool.booleanValue() ? "true" : "false");
    }

    public void q(Number number) {
        if (number == null) {
            i();
            return;
        }
        t();
        String obj = number.toString();
        if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class && !w.matcher(obj).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
            }
        } else if (this.n != 1) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(obj));
        }
        a();
        this.a.append((CharSequence) obj);
    }

    public void r(String str) {
        if (str == null) {
            i();
            return;
        }
        t();
        a();
        m(str);
    }

    public void s(boolean z10) {
        t();
        a();
        this.a.write(z10 ? "true" : "false");
    }

    public final void t() {
        if (this.s != null) {
            int j10 = j();
            if (j10 == 5) {
                this.a.write(this.f);
            } else if (j10 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            h();
            this.b[this.c - 1] = 4;
            m(this.s);
            this.s = null;
        }
    }
}
