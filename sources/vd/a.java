package vd;

import k2.p1;
import kotlin.jvm.internal.j;
import x7.m5;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a implements Comparable {
    public static final long b;
    public static final long c;
    public static final /* synthetic */ int d = 0;
    public final long a;

    static {
        int i3 = b.a;
        b = m5.a(4611686018427387903L);
        c = m5.a(-4611686018427387903L);
    }

    public static final void a(StringBuilder sb2, int i3, int i10, int i11, String str, boolean z10) {
        CharSequence charSequence;
        sb2.append(i3);
        if (i10 != 0) {
            sb2.append('.');
            String valueOf = String.valueOf(i10);
            j.e(valueOf, "<this>");
            if (i11 < 0) {
                throw new IllegalArgumentException(p1.j(i11, "Desired length ", " is less than zero."));
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
            if (z10 || i15 >= 3) {
                sb2.append((CharSequence) obj, 0, ((i13 + 3) / 3) * 3);
            } else {
                sb2.append((CharSequence) obj, 0, i15);
            }
        }
        sb2.append(str);
    }

    public static int b(long j10, long j11) {
        long j12 = j10 ^ j11;
        if (j12 >= 0 && (((int) j12) & 1) != 0) {
            int i3 = (((int) j10) & 1) - (((int) j11) & 1);
            return j10 < 0 ? -i3 : i3;
        }
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    public static final boolean c(long j10) {
        return j10 == b || j10 == c;
    }

    public static final long d(long j10, c unit) {
        j.e(unit, "unit");
        if (j10 == b) {
            return Long.MAX_VALUE;
        }
        if (j10 == c) {
            return Long.MIN_VALUE;
        }
        long j11 = j10 >> 1;
        c sourceUnit = (((int) j10) & 1) == 0 ? c.b : c.c;
        j.e(sourceUnit, "sourceUnit");
        return unit.a.convert(j11, sourceUnit.a);
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
        long j10 = this.a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        long j10;
        int d10;
        int i3;
        long j11;
        int i10;
        int i11;
        long j12 = this.a;
        if (j12 == 0) {
            return "0s";
        }
        if (j12 == b) {
            return "Infinity";
        }
        if (j12 == c) {
            return "-Infinity";
        }
        boolean z10 = j12 < 0;
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append('-');
        }
        if (j12 < 0) {
            j12 = (((int) j12) & 1) + ((-(j12 >> 1)) << 1);
            int i12 = b.a;
        }
        long d11 = d(j12, c.h);
        int d12 = c(j12) ? 0 : (int) (d(j12, c.f) % 24);
        if (c(j12)) {
            j10 = 0;
            d10 = 0;
        } else {
            j10 = 0;
            d10 = (int) (d(j12, c.e) % 60);
        }
        int d13 = c(j12) ? 0 : (int) (d(j12, c.d) % 60);
        if (c(j12)) {
            i3 = 1;
            i10 = 0;
        } else {
            if ((((int) j12) & 1) == 1) {
                i3 = 1;
                j11 = ((j12 >> 1) % 1000) * 1000000;
            } else {
                i3 = 1;
                j11 = (j12 >> 1) % 1000000000;
            }
            i10 = (int) j11;
        }
        int i13 = d11 != j10 ? i3 : 0;
        int i14 = d12 != 0 ? i3 : 0;
        int i15 = d10 != 0 ? i3 : 0;
        int i16 = (d13 == 0 && i10 == 0) ? 0 : i3;
        if (i13 != 0) {
            sb2.append(d11);
            sb2.append('d');
            i11 = i3;
        } else {
            i11 = 0;
        }
        if (i14 != 0 || (i13 != 0 && (i15 != 0 || i16 != 0))) {
            int i17 = i11 + 1;
            if (i11 > 0) {
                sb2.append(' ');
            }
            sb2.append(d12);
            sb2.append('h');
            i11 = i17;
        }
        if (i15 != 0 || (i16 != 0 && (i14 != 0 || i13 != 0))) {
            int i18 = i11 + 1;
            if (i11 > 0) {
                sb2.append(' ');
            }
            sb2.append(d10);
            sb2.append('m');
            i11 = i18;
        }
        if (i16 != 0) {
            int i19 = i11 + 1;
            if (i11 > 0) {
                sb2.append(' ');
            }
            if (d13 != 0 || i13 != 0 || i14 != 0 || i15 != 0) {
                a(sb2, d13, i10, 9, "s", false);
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
        if (z10 && i11 > i3) {
            sb2.insert(i3, '(').append(')');
        }
        return sb2.toString();
    }
}
