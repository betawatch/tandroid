// default package

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class vi6 extends h00 {
    public static final Logger r = Logger.getLogger(vi6.class.getName());

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0214, code lost:
    
        if (r0.f != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0216, code lost:
    
        r2 = r6.u(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x021a, code lost:
    
        r15.d(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0245, code lost:
    
        r2.d.O(r2.a.e());
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0251, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0252, code lost:
    
        r2.d.O(r2.a.e());
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x025d, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x021e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0223, code lost:
    
        if (r12.isLoggable(r5) != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0225, code lost:
    
        r12.log(r5, "ID3 exception occured in frame " + r10 + ": " + r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0210, code lost:
    
        if (r13 <= 0) goto L118;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:227:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:234:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vi6(BufferedInputStream bufferedInputStream, long j) {
        long j2;
        long j3;
        long j4;
        String str;
        String str2;
        String str3;
        String str4;
        short s;
        short s2;
        byte b;
        boolean z;
        byte b2;
        byte b3;
        int i;
        int i2;
        pm3 pm3Var;
        Logger logger;
        m29 m29Var;
        byte b4;
        Level level = Level.FINEST;
        this.a = "MP3";
        wi6 wi6Var = new wi6(bufferedInputStream);
        wi6Var.d = 0;
        if (ij5.b(wi6Var)) {
            Logger logger2 = ij5.s;
            ij5 ij5Var = new ij5();
            if (ij5.b(wi6Var)) {
                i51 i51Var = new i51((FilterInputStream) wi6Var);
                jj5 jj5Var = new jj5();
                jj5Var.a = 0;
                jj5Var.b = 0;
                jj5Var.c = (byte) 0;
                long j5 = i51Var.b;
                xh4 xh4Var = new xh4((Object) i51Var, (byte) 7);
                byte[] bArr = new byte[3];
                int i3 = 0;
                for (int i4 = 3; i3 < i4; i4 = 3) {
                    long j6 = j5;
                    int read = ((i51) xh4Var.b).read(bArr, i3, 3 - i3);
                    if (read <= 0) {
                        throw new EOFException();
                    }
                    i3 += read;
                    j5 = j6;
                }
                long j7 = j5;
                String str5 = new String(bArr, "ISO-8859-1");
                if (!"ID3".equals(str5)) {
                    throw new ej5("Invalid ID3 identifier: ".concat(str5));
                }
                byte J = xh4Var.J();
                jj5Var.a = J;
                if (J != 2 && J != 3 && J != 4) {
                    throw new ej5(uh9.k(J, "Unsupported ID3v2 version: "));
                }
                byte J2 = xh4Var.J();
                byte J3 = xh4Var.J();
                int L = xh4Var.L();
                int i5 = L + 10;
                jj5Var.b = i5;
                if (J == 2) {
                    boolean z2 = (J3 & 128) != 0;
                    jj5Var.d = (J3 & 64) != 0;
                    z = z2;
                    b2 = J2;
                } else {
                    boolean z3 = (J3 & 128) != 0;
                    if ((J3 & 64) != 0) {
                        z = z3;
                        if (J == 3) {
                            int K = xh4Var.K();
                            xh4Var.J();
                            xh4Var.J();
                            xh4Var.K();
                            b2 = J2;
                            b3 = J3;
                            xh4Var.O(K - 6);
                        } else {
                            b2 = J2;
                            b3 = J3;
                            xh4Var.O(xh4Var.L() - 4);
                        }
                    } else {
                        z = z3;
                        b2 = J2;
                        b3 = J3;
                    }
                    if (J >= 4 && (b3 & 16) != 0) {
                        jj5Var.c = (byte) 10;
                        int i6 = L + 20;
                        jj5Var.b = i6;
                        i = 10;
                        i2 = i6;
                        int i7 = (int) (i51Var.b - j7);
                        ij5Var.a = "ID3";
                        String.format("2.%d.%d", Integer.valueOf(J), Integer.valueOf(b2));
                        if (!jj5Var.d) {
                            throw new ej5("Tag compression is not supported");
                        }
                        if (J >= 4 || !z) {
                            jj5Var = jj5Var;
                            logger = logger2;
                            pm3Var = new pm3(wi6Var, i7, (i2 - i7) - i, jj5Var);
                        } else {
                            int i8 = i2 - i7;
                            byte[] bArr2 = new byte[i8];
                            int i9 = 0;
                            while (i9 < i8) {
                                int read2 = wi6Var.read(bArr2, i9, i8 - i9);
                                if (read2 <= 0) {
                                    throw new EOFException();
                                }
                                i9 += read2;
                            }
                            boolean z4 = false;
                            int i10 = 0;
                            for (int i11 = 0; i11 < i8; i11++) {
                                byte b5 = bArr2[i11];
                                if (!z4 || b5 != 0) {
                                    bArr2[i10] = b5;
                                    i10++;
                                }
                                z4 = b5 == -1;
                            }
                            pm3Var = new pm3(new ByteArrayInputStream(bArr2, 0, i10), i7, i10, jj5Var);
                            logger = logger2;
                        }
                        xh4 xh4Var2 = (xh4) pm3Var.d;
                        m29 m29Var2 = (m29) pm3Var.b;
                        while (true) {
                            try {
                                if (m29Var2.e() <= 10) {
                                    m29Var = m29Var2;
                                    break;
                                }
                                hj5 hj5Var = new hj5(pm3Var);
                                String str6 = hj5Var.a;
                                int i12 = hj5Var.c;
                                m29Var = m29Var2;
                                int i13 = 0;
                                while (true) {
                                    try {
                                        if (i13 >= str6.length()) {
                                            if (i12 == 0) {
                                                break;
                                            }
                                        } else if (str6.charAt(0) != 0) {
                                            break;
                                        } else {
                                            i13++;
                                        }
                                    } catch (ej5 e) {
                                        e = e;
                                        if (logger.isLoggable(level)) {
                                            logger.log(level, "ID3 exception occured: " + e.getMessage());
                                        }
                                        xh4Var2.O(m29Var.e());
                                        b4 = jj5Var.c;
                                        if (b4 > 0) {
                                        }
                                        this.f = ij5Var.f;
                                        this.e = ij5Var.e;
                                        this.d = ij5Var.d;
                                        this.i = ij5Var.i;
                                        this.o = ij5Var.o;
                                        this.p = ij5Var.p;
                                        this.m = ij5Var.m;
                                        this.l = ij5Var.l;
                                        this.k = ij5Var.k;
                                        this.b = ij5Var.b;
                                        this.h = ij5Var.h;
                                        this.n = ij5Var.n;
                                        this.c = ij5Var.c;
                                        this.j = ij5Var.j;
                                        this.g = ij5Var.g;
                                        j2 = this.b;
                                        if (j2 > 0) {
                                        }
                                        try {
                                            v11 v11Var = new v11();
                                            v11Var.a = j - 128;
                                            this.b = b(wi6Var, j, v11Var);
                                        } catch (si6 e2) {
                                            Logger logger3 = r;
                                            if (logger3.isLoggable(level)) {
                                                logger3.log(level, "Could not determine MP3 duration", (Throwable) e2);
                                            }
                                        }
                                        if (this.c == null) {
                                        }
                                        j3 = wi6Var.b;
                                        j4 = j - 128;
                                        if (j3 <= j4) {
                                        }
                                    }
                                }
                                if (i12 <= m29Var.e()) {
                                    int i14 = 0;
                                    while (true) {
                                        if (i14 >= str6.length()) {
                                            break;
                                        }
                                        if ((str6.charAt(i14) < 'A' || str6.charAt(i14) > 'Z') && (str6.charAt(i14) < '0' || str6.charAt(i14) > '9')) {
                                            break;
                                        } else {
                                            i14++;
                                        }
                                    }
                                    xh4Var2.O(i12);
                                    m29Var2 = m29Var;
                                } else if (logger.isLoggable(level)) {
                                    logger.log(level, "ID3 frame claims to extend frames area");
                                }
                            } catch (ej5 e3) {
                                e = e3;
                                m29Var = m29Var2;
                            }
                        }
                        xh4Var2.O(m29Var.e());
                        b4 = jj5Var.c;
                        if (b4 > 0) {
                            wi6Var.skip(b4);
                        }
                    }
                }
                i2 = i5;
                i = 0;
                int i72 = (int) (i51Var.b - j7);
                ij5Var.a = "ID3";
                String.format("2.%d.%d", Integer.valueOf(J), Integer.valueOf(b2));
                if (!jj5Var.d) {
                }
            }
            this.f = ij5Var.f;
            this.e = ij5Var.e;
            this.d = ij5Var.d;
            this.i = ij5Var.i;
            this.o = ij5Var.o;
            this.p = ij5Var.p;
            this.m = ij5Var.m;
            this.l = ij5Var.l;
            this.k = ij5Var.k;
            this.b = ij5Var.b;
            this.h = ij5Var.h;
            this.n = ij5Var.n;
            this.c = ij5Var.c;
            this.j = ij5Var.j;
            this.g = ij5Var.g;
        }
        j2 = this.b;
        if (j2 > 0 || j2 >= 3600000) {
            v11 v11Var2 = new v11();
            v11Var2.a = j - 128;
            this.b = b(wi6Var, j, v11Var2);
        }
        if (this.c == null && this.f != null && this.d != null) {
            return;
        }
        j3 = wi6Var.b;
        j4 = j - 128;
        if (j3 <= j4) {
            return;
        }
        long j8 = j4 - j3;
        long j9 = 0;
        while (j9 < j8) {
            long skip = wi6Var.skip(j8 - j9);
            if (skip <= 0) {
                throw new EOFException();
            }
            j9 += skip;
        }
        if (!cj5.c(bufferedInputStream)) {
            return;
        }
        if (cj5.c(bufferedInputStream)) {
            byte[] bArr3 = new byte[128];
            int i15 = 0;
            while (i15 < 128) {
                int read3 = bufferedInputStream.read(bArr3, i15, 128 - i15);
                if (read3 <= 0) {
                    throw new EOFException();
                }
                i15 += read3;
            }
            str3 = cj5.b(3, 30, bArr3);
            str4 = cj5.b(33, 30, bArr3);
            String b6 = cj5.b(63, 30, bArr3);
            try {
                s = Short.parseShort(cj5.b(93, 4, bArr3));
            } catch (NumberFormatException unused) {
                s = 0;
            }
            str = cj5.b(97, 30, bArr3);
            int b7 = qd4.b(bArr3[127]);
            r2 = b7 != 0 ? qd4.d(b7) : null;
            if (bArr3[125] == 0 && (b = bArr3[126]) != 0) {
                s2 = (short) (b & 255);
                str2 = r2;
                r2 = b6;
                if (this.f == null) {
                    this.f = r2;
                }
                if (this.d == null) {
                    this.d = str4;
                }
                if (this.i == null) {
                    this.i = str;
                }
                if (this.h == null) {
                    this.h = str2;
                }
                if (this.c == null) {
                    this.c = str3;
                }
                if (this.j == 0) {
                    this.j = s2;
                }
                if (this.g != 0) {
                    this.g = s;
                    return;
                }
                return;
            }
            str2 = r2;
            r2 = b6;
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            s = 0;
        }
        s2 = 0;
        if (this.f == null) {
        }
        if (this.d == null) {
        }
        if (this.i == null) {
        }
        if (this.h == null) {
        }
        if (this.c == null) {
        }
        if (this.j == 0) {
        }
        if (this.g != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x00dd, code lost:
    
        if ((((r7[4] & 255) << 8) | (r7[5] & 255)) != r13.a) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x004f, code lost:
    
        r7 = 8;
        r22 = 1;
        r20 = 3;
        r21 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0168, code lost:
    
        r24 = r4 ? 1 : 0;
        r19 = 2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0327 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long b(wi6 wi6Var, long j, v11 v11Var) {
        int[][] iArr;
        byte b;
        int i;
        int i2;
        byte b2;
        int i3;
        char c;
        int i4;
        um4 um4Var;
        int i5;
        int i6;
        long j2;
        int i7;
        ui6 ui6Var;
        byte b3;
        int read;
        v11 v11Var2 = v11Var;
        int i8 = -1;
        int read2 = v11Var2.a(wi6Var) ? -1 : wi6Var.read();
        boolean z = 0;
        int i9 = 0;
        while (true) {
            iArr = ui6.m;
            b = 8;
            if (read2 == -1) {
                break;
            }
            if (i9 == 255 && (read2 & jn7.A3) == 224) {
                wi6Var.mark(2);
                int read3 = v11Var2.a(wi6Var) ? -1 : wi6Var.read();
                if (read3 == -1) {
                    break;
                }
                if (v11Var2.a(wi6Var)) {
                    i2 = 2;
                    read = -1;
                } else {
                    i2 = 2;
                    read = wi6Var.read();
                }
                if (read != -1) {
                    ui6 ui6Var2 = new ui6(read2, read3, read);
                    wi6Var.reset();
                    wi6Var.mark(ui6Var2.b() + 2);
                    int b4 = ui6Var2.b();
                    byte[] bArr = new byte[b4];
                    bArr[z ? 1 : 0] = -1;
                    c = 3;
                    bArr[1] = (byte) read2;
                    int i10 = b4 - 2;
                    int i11 = z ? 1 : 0;
                    while (i11 < i10) {
                        i4 = 5;
                        try {
                            int read4 = wi6Var.read(bArr, i2 + i11, i10 - i11);
                            if (read4 <= 0) {
                                throw new EOFException();
                            }
                            i11 += read4;
                        } catch (EOFException unused) {
                            i = z ? 1 : 0;
                            b2 = 8;
                            i3 = 1;
                            um4Var = null;
                            if (um4Var != null) {
                            }
                        }
                    }
                    i4 = 5;
                    um4Var = new um4(ui6Var2, bArr, z, b);
                    if (ui6Var2.g == 0 && ui6Var2.b == 1) {
                        ti6 ti6Var = new ti6();
                        ti6Var.a = (short) -1;
                        ti6Var.a(bArr[i2]);
                        ti6Var.a(bArr[3]);
                        i3 = 1;
                        int i12 = iArr[ui6Var2.e][ui6Var2.a];
                        int i13 = z ? 1 : 0;
                        int i14 = z;
                        while (i13 < i12) {
                            ti6Var.a(bArr[i13 + 6]);
                            i13++;
                            i14 = i14;
                        }
                        i = i14;
                    } else {
                        i = z ? 1 : 0;
                        i3 = 1;
                    }
                    int read5 = v11Var2.a(wi6Var) ? -1 : wi6Var.read();
                    int read6 = v11Var2.a(wi6Var) ? -1 : wi6Var.read();
                    if (read5 == -1 || read6 == -1) {
                        break;
                    }
                    if (read5 == 255 && (read6 & jn7.c4) == (read2 & jn7.c4)) {
                        int read7 = v11Var2.a(wi6Var) ? -1 : wi6Var.read();
                        int read8 = v11Var2.a(wi6Var) ? -1 : wi6Var.read();
                        if (read7 == -1 || read8 == -1) {
                            break;
                        }
                        if (new ui6(read6, read7, read8).d(ui6Var2)) {
                            wi6Var.reset();
                            long j3 = i10;
                            long j4 = 0;
                            while (j4 < j3) {
                                byte b5 = b;
                                long skip = wi6Var.skip(j3 - j4);
                                if (skip <= 0) {
                                    throw new EOFException();
                                }
                                j4 += skip;
                                b = b5;
                            }
                        }
                    }
                    wi6Var.reset();
                } else {
                    i = z ? 1 : 0;
                    break;
                }
            } else {
                i = z ? 1 : 0;
            }
            i9 = read2;
            read2 = v11Var2.a(wi6Var) ? -1 : wi6Var.read();
            z = i;
        }
        b2 = b;
        if (um4Var != null) {
            throw new si6("No audio frame");
        }
        byte[] bArr2 = (byte[]) um4Var.b;
        ui6 ui6Var3 = (ui6) um4Var.c;
        int i15 = iArr[ui6Var3.e][ui6Var3.a];
        int i16 = i15 + 4;
        if (bArr2.length < i15 + 16 || i16 < 0 || bArr2.length < i15 + 12 || !(((b3 = bArr2[i16]) == 88 && bArr2[i15 + 5] == 105 && bArr2[i15 + 6] == 110 && bArr2[i15 + 7] == 103) || (b3 == 73 && bArr2[i15 + 5] == 110 && bArr2[i15 + 6] == 102 && bArr2[i15 + 7] == 111))) {
            if (bArr2.length >= 62 && bArr2[36] == 86 && bArr2[37] == 66 && bArr2[38] == 82 && bArr2[39] == 73) {
                i5 = (bArr2[53] & 255) | ((bArr2[50] & 255) << 24) | ((bArr2[51] & 255) << 16) | ((bArr2[52] & 255) << b2);
            }
            i5 = -1;
        } else {
            if ((bArr2[i15 + 11] & 1) != 0) {
                i5 = ((bArr2[i15 + 12] & 255) << 24) | ((bArr2[i15 + 13] & 255) << 16) | ((bArr2[i15 + 14] & 255) << b2) | (bArr2[i15 + 15] & 255);
            }
            i5 = -1;
        }
        if (i5 > 0) {
            return ui6Var3.c(i5 * bArr2.length);
        }
        long length = wi6Var.b - bArr2.length;
        long length2 = bArr2.length;
        int a = ui6Var3.a();
        long j5 = a;
        int c2 = 10000 / ((int) ui6Var3.c(ui6Var3.b()));
        int i17 = i3;
        um4 um4Var2 = um4Var;
        int i18 = i;
        while (true) {
            ui6 ui6Var4 = (ui6) um4Var2.c;
            if (i17 == c2 && i18 == 0 && j > 0) {
                return ui6Var4.c(j - length);
            }
            wi6Var.mark(4);
            int i19 = i17;
            int read9 = v11Var2.a(wi6Var) ? i8 : wi6Var.read();
            int read10 = v11Var2.a(wi6Var) ? i8 : wi6Var.read();
            if (read9 == i8 || read10 == i8) {
                i6 = c2;
            } else {
                if (read9 == 255 && (read10 & jn7.A3) == 224) {
                    int read11 = v11Var2.a(wi6Var) ? -1 : wi6Var.read();
                    int read12 = v11Var2.a(wi6Var) ? -1 : wi6Var.read();
                    i6 = c2;
                    if (read11 != -1 && read12 != -1) {
                        try {
                            ui6Var = new ui6(read10, read11, read12);
                            j2 = j5;
                            i7 = i4;
                        } catch (si6 e) {
                            int i20 = wi6Var.d + 1;
                            wi6Var.d = i20;
                            j2 = j5;
                            i7 = i4;
                            if (i20 > i7) {
                                throw e;
                            }
                            ui6Var = null;
                        }
                        if (ui6Var != null && ui6Var.d(ui6Var4)) {
                            int b6 = ui6Var.b();
                            byte[] bArr3 = new byte[b6];
                            bArr3[i] = (byte) read9;
                            bArr3[i3] = (byte) read10;
                            bArr3[i2] = (byte) read11;
                            bArr3[c] = (byte) read12;
                            int i21 = b6 - 4;
                            int i22 = i;
                            while (i22 < i21) {
                                try {
                                    int read13 = wi6Var.read(bArr3, 4 + i22, i21 - i22);
                                    if (read13 <= 0) {
                                        throw new EOFException();
                                    }
                                    i22 += read13;
                                } catch (EOFException unused2) {
                                }
                            }
                            um4Var2 = new um4(ui6Var, bArr3, i, (byte) 8);
                            if (um4Var2 == null) {
                                return (((length2 * 1000) * i19) << c) / j2;
                            }
                            int a2 = ((ui6) um4Var2.c).a();
                            if (a2 != a) {
                                i18 = i3;
                            }
                            length2 += ((byte[]) um4Var2.b).length;
                            v11Var2 = v11Var;
                            i4 = i7;
                            j5 = j2 + a2;
                            c2 = i6;
                            i8 = -1;
                            i = 0;
                            i17 = i19 + 1;
                        }
                    }
                } else {
                    i6 = c2;
                    j2 = j5;
                    i7 = i4;
                }
                wi6Var.reset();
                um4Var2 = null;
                if (um4Var2 == null) {
                }
            }
            j2 = j5;
            i7 = i4;
            um4Var2 = null;
            if (um4Var2 == null) {
            }
        }
    }
}
