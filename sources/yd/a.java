package yd;

import c8.ee;
import jg.g;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class a implements Comparable {
    public static final long b;
    public static final long c;
    public static final /* synthetic */ int d = 0;
    public final long a;

    static {
        int i7 = b.a;
        b = ee.a(4611686018427387903L);
        c = ee.a(-4611686018427387903L);
    }

    public static final void a(StringBuilder sb2, int i7, int i10, int i11, String str, boolean z9) {
        CharSequence charSequence;
        sb2.append(i7);
        if (i10 != 0) {
            sb2.append('.');
            String valueOf = String.valueOf(i10);
            j.e(valueOf, "<this>");
            if (i11 < 0) {
                throw new IllegalArgumentException(g.k(i11, "Desired length ", " is less than zero."));
            }
            if (i11 <= valueOf.length()) {
                charSequence = valueOf.subSequence(0, valueOf.length());
            } else {
                StringBuilder sb3 = new StringBuilder(i11);
                int length = i11 - valueOf.length();
                int i12 = 1;
                if (1 <= length) {
                    while (true) {
                        sb3.append('0');
                        if (i12 == length) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
                sb3.append((CharSequence) valueOf);
                charSequence = sb3;
            }
            String obj = charSequence.toString();
            int i13 = -1;
            int length2 = obj.length() - 1;
            if (length2 >= 0) {
                while (true) {
                    int i14 = length2 - 1;
                    if (obj.charAt(length2) != '0') {
                        i13 = length2;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length2 = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            if (z9 || i15 >= 3) {
                sb2.append((CharSequence) obj, 0, ((i13 + 3) / 3) * 3);
            } else {
                sb2.append((CharSequence) obj, 0, i15);
            }
        }
        sb2.append(str);
    }

    public static int b(long j3, long j10) {
        long j11 = j3 ^ j10;
        if (j11 >= 0 && (((int) j11) & 1) != 0) {
            int i7 = (((int) j3) & 1) - (((int) j10) & 1);
            return j3 < 0 ? -i7 : i7;
        }
        if (j3 < j10) {
            return -1;
        }
        return j3 == j10 ? 0 : 1;
    }

    public static final boolean c(long j3) {
        return j3 == b || j3 == c;
    }

    public static final long d(long j3, c unit) {
        j.e(unit, "unit");
        if (j3 == b) {
            return Long.MAX_VALUE;
        }
        if (j3 == c) {
            return Long.MIN_VALUE;
        }
        long j10 = j3 >> 1;
        c sourceUnit = (((int) j3) & 1) == 0 ? c.b : c.c;
        j.e(sourceUnit, "sourceUnit");
        return unit.a.convert(j10, sourceUnit.a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return b(this.a, ((a) obj).a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.a == ((a) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.a;
        return (int) (j3 ^ (j3 >>> 32));
    }

    public final String toString() {
        long j3;
        int d2;
        int i7;
        long j10;
        int i10;
        int i11;
        long j11 = this.a;
        if (j11 == 0) {
            return "0s";
        }
        if (j11 == b) {
            return "Infinity";
        }
        if (j11 == c) {
            return "-Infinity";
        }
        boolean z9 = j11 < 0;
        StringBuilder sb2 = new StringBuilder();
        if (z9) {
            sb2.append('-');
        }
        if (j11 < 0) {
            j11 = (((int) j11) & 1) + ((-(j11 >> 1)) << 1);
            int i12 = b.a;
        }
        long d10 = d(j11, c.h);
        int d11 = c(j11) ? 0 : (int) (d(j11, c.f) % 24);
        if (c(j11)) {
            j3 = 0;
            d2 = 0;
        } else {
            j3 = 0;
            d2 = (int) (d(j11, c.e) % 60);
        }
        int d12 = c(j11) ? 0 : (int) (d(j11, c.d) % 60);
        if (c(j11)) {
            i7 = 1;
            i10 = 0;
        } else {
            if ((((int) j11) & 1) == 1) {
                i7 = 1;
                j10 = ((j11 >> 1) % 1000) * 1000000;
            } else {
                i7 = 1;
                j10 = (j11 >> 1) % 1000000000;
            }
            i10 = (int) j10;
        }
        int i13 = d10 != j3 ? i7 : 0;
        int i14 = d11 != 0 ? i7 : 0;
        int i15 = d2 != 0 ? i7 : 0;
        int i16 = (d12 == 0 && i10 == 0) ? 0 : i7;
        if (i13 != 0) {
            sb2.append(d10);
            sb2.append('d');
            i11 = i7;
        } else {
            i11 = 0;
        }
        if (i14 != 0 || (i13 != 0 && (i15 != 0 || i16 != 0))) {
            int i17 = i11 + 1;
            if (i11 > 0) {
                sb2.append(' ');
            }
            sb2.append(d11);
            sb2.append('h');
            i11 = i17;
        }
        if (i15 != 0 || (i16 != 0 && (i14 != 0 || i13 != 0))) {
            int i18 = i11 + 1;
            if (i11 > 0) {
                sb2.append(' ');
            }
            sb2.append(d2);
            sb2.append('m');
            i11 = i18;
        }
        if (i16 != 0) {
            int i19 = i11 + 1;
            if (i11 > 0) {
                sb2.append(' ');
            }
            if (d12 != 0 || i13 != 0 || i14 != 0 || i15 != 0) {
                a(sb2, d12, i10, 9, "s", false);
            } else if (i10 >= 1000000) {
                a(sb2, i10 / 1000000, i10 % 1000000, 6, "ms", false);
            } else if (i10 >= 1000) {
                a(sb2, i10 / 1000, i10 % 1000, 3, "us", false);
            } else {
                sb2.append(i10);
                sb2.append("ns");
            }
            i11 = i19;
        }
        if (z9 && i11 > i7) {
            sb2.insert(i7, '(').append(')');
        }
        return sb2.toString();
    }
}
