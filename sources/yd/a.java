package yd;

import i2.g;
import kotlin.jvm.internal.i;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class a implements Comparable {
    public static final long b;
    public static final long c;
    public static final /* synthetic */ int d = 0;
    public final long a;

    static {
        int i10 = b.a;
        b = Long.MAX_VALUE;
        c = -9223372036854775805L;
    }

    public static final void a(StringBuilder sb2, int i10, int i11, int i12, String str) {
        CharSequence charSequence;
        sb2.append(i10);
        if (i11 != 0) {
            sb2.append('.');
            String valueOf = String.valueOf(i11);
            i.e(valueOf, "<this>");
            if (i12 < 0) {
                throw new IllegalArgumentException(g.j(i12, "Desired length ", " is less than zero."));
            }
            if (i12 <= valueOf.length()) {
                charSequence = valueOf.subSequence(0, valueOf.length());
            } else {
                StringBuilder sb3 = new StringBuilder(i12);
                int length = i12 - valueOf.length();
                int i13 = 1;
                if (1 <= length) {
                    while (true) {
                        sb3.append('0');
                        if (i13 == length) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                }
                sb3.append((CharSequence) valueOf);
                charSequence = sb3;
            }
            String obj = charSequence.toString();
            int i14 = -1;
            int length2 = obj.length() - 1;
            if (length2 >= 0) {
                while (true) {
                    int i15 = length2 - 1;
                    if (obj.charAt(length2) != '0') {
                        i14 = length2;
                        break;
                    } else if (i15 < 0) {
                        break;
                    } else {
                        length2 = i15;
                    }
                }
            }
            int i16 = i14 + 1;
            if (i16 < 3) {
                sb2.append((CharSequence) obj, 0, i16);
            } else {
                sb2.append((CharSequence) obj, 0, ((i14 + 3) / 3) * 3);
            }
        }
        sb2.append(str);
    }

    public static final boolean b(long j3) {
        return j3 == b || j3 == c;
    }

    public static final long c(long j3, c unit) {
        i.e(unit, "unit");
        if (j3 == b) {
            return Long.MAX_VALUE;
        }
        if (j3 == c) {
            return Long.MIN_VALUE;
        }
        long j10 = j3 >> 1;
        c sourceUnit = (((int) j3) & 1) == 0 ? c.b : c.c;
        i.e(sourceUnit, "sourceUnit");
        return unit.a.convert(j10, sourceUnit.a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j3 = ((a) obj).a;
        long j10 = this.a;
        long j11 = j10 ^ j3;
        if (j11 >= 0 && (((int) j11) & 1) != 0) {
            int i10 = (((int) j10) & 1) - (1 & ((int) j3));
            return j10 < 0 ? -i10 : i10;
        }
        if (j10 < j3) {
            return -1;
        }
        return j10 == j3 ? 0 : 1;
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
        int c10;
        int i10;
        long j10;
        int i11;
        int i12;
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
        boolean z10 = j11 < 0;
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append('-');
        }
        if (j11 < 0) {
            j11 = (((int) j11) & 1) + ((-(j11 >> 1)) << 1);
            int i13 = b.a;
        }
        long c11 = c(j11, c.h);
        int c12 = b(j11) ? 0 : (int) (c(j11, c.f) % 24);
        if (b(j11)) {
            j3 = 0;
            c10 = 0;
        } else {
            j3 = 0;
            c10 = (int) (c(j11, c.e) % 60);
        }
        int c13 = b(j11) ? 0 : (int) (c(j11, c.d) % 60);
        if (b(j11)) {
            i11 = 0;
            i10 = 1;
        } else {
            if ((((int) j11) & 1) == 1) {
                i10 = 1;
                j10 = ((j11 >> 1) % MediaDataController.MAX_STYLE_RUNS_COUNT) * MediaController.VIDEO_BITRATE_480;
            } else {
                i10 = 1;
                j10 = (j11 >> 1) % 1000000000;
            }
            i11 = (int) j10;
        }
        boolean z11 = c11 != j3;
        boolean z12 = c12 != 0;
        boolean z13 = c10 != 0;
        boolean z14 = (c13 == 0 && i11 == 0) ? false : true;
        if (z11) {
            sb2.append(c11);
            sb2.append('d');
            i12 = 1;
        } else {
            i12 = 0;
        }
        if (z12 || (z11 && (z13 || z14))) {
            int i14 = i12 + 1;
            if (i12 > 0) {
                sb2.append(' ');
            }
            sb2.append(c12);
            sb2.append('h');
            i12 = i14;
        }
        if (z13 || (z14 && (z12 || z11))) {
            int i15 = i12 + 1;
            if (i12 > 0) {
                sb2.append(' ');
            }
            sb2.append(c10);
            sb2.append('m');
            i12 = i15;
        }
        if (z14) {
            int i16 = i12 + 1;
            if (i12 > 0) {
                sb2.append(' ');
            }
            if (c13 != 0 || z11 || z12 || z13) {
                a(sb2, c13, i11, 9, "s");
            } else if (i11 >= 1000000) {
                a(sb2, i11 / MediaController.VIDEO_BITRATE_480, i11 % MediaController.VIDEO_BITRATE_480, 6, "ms");
            } else if (i11 >= 1000) {
                a(sb2, i11 / MediaDataController.MAX_STYLE_RUNS_COUNT, i11 % MediaDataController.MAX_STYLE_RUNS_COUNT, 3, "us");
            } else {
                sb2.append(i11);
                sb2.append("ns");
            }
            i12 = i16;
        }
        if (z10 && i12 > i10) {
            sb2.insert(i10, '(').append(')');
        }
        return sb2.toString();
    }
}
