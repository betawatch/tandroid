// default package

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class qg6 extends g00 {
    public static final Logger r = Logger.getLogger(qg6.class.getName());

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0215, code lost:
    
        if (r0.f != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0217, code lost:
    
        r2 = r6.v(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x021b, code lost:
    
        r15.d(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0246, code lost:
    
        r2.d.d0(r2.a.e());
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0252, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0253, code lost:
    
        r2.d.d0(r2.a.e());
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x025e, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x021f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0224, code lost:
    
        if (r12.isLoggable(r5) != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0226, code lost:
    
        r12.log(r5, "ID3 exception occured in frame " + r10 + ": " + r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0211, code lost:
    
        if (r13 <= 0) goto L118;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:227:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:234:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qg6(BufferedInputStream bufferedInputStream, long j) {
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
        xl3 xl3Var;
        Logger logger;
        zy8 zy8Var;
        byte b4;
        Level level = Level.FINEST;
        this.a = "MP3";
        rg6 rg6Var = new rg6(bufferedInputStream);
        rg6Var.d = 0;
        if (gh5.b(rg6Var)) {
            Logger logger2 = gh5.s;
            gh5 gh5Var = new gh5();
            if (gh5.b(rg6Var)) {
                a51 a51Var = new a51((FilterInputStream) rg6Var);
                hh5 hh5Var = new hh5();
                hh5Var.a = 0;
                hh5Var.b = 0;
                hh5Var.c = (byte) 0;
                long j5 = a51Var.b;
                z24 z24Var = new z24((Object) a51Var, (byte) 9);
                byte[] bArr = new byte[3];
                int i3 = 0;
                for (int i4 = 3; i3 < i4; i4 = 3) {
                    long j6 = j5;
                    int read = ((a51) z24Var.b).read(bArr, i3, 3 - i3);
                    if (read <= 0) {
                        throw new EOFException();
                    }
                    i3 += read;
                    j5 = j6;
                }
                long j7 = j5;
                String str5 = new String(bArr, "ISO-8859-1");
                if (!"ID3".equals(str5)) {
                    throw new ch5("Invalid ID3 identifier: ".concat(str5));
                }
                byte Z = z24Var.Z();
                hh5Var.a = Z;
                if (Z != 2 && Z != 3 && Z != 4) {
                    throw new ch5(de9.k(Z, "Unsupported ID3v2 version: "));
                }
                byte Z2 = z24Var.Z();
                byte Z3 = z24Var.Z();
                int c0 = z24Var.c0();
                int i5 = c0 + 10;
                hh5Var.b = i5;
                if (Z == 2) {
                    boolean z2 = (Z3 & 128) != 0;
                    hh5Var.d = (Z3 & 64) != 0;
                    z = z2;
                    b2 = Z2;
                } else {
                    boolean z3 = (Z3 & 128) != 0;
                    if ((Z3 & 64) != 0) {
                        z = z3;
                        if (Z == 3) {
                            int a0 = z24Var.a0();
                            z24Var.Z();
                            z24Var.Z();
                            z24Var.a0();
                            b2 = Z2;
                            b3 = Z3;
                            z24Var.d0(a0 - 6);
                        } else {
                            b2 = Z2;
                            b3 = Z3;
                            z24Var.d0(z24Var.c0() - 4);
                        }
                    } else {
                        z = z3;
                        b2 = Z2;
                        b3 = Z3;
                    }
                    if (Z >= 4 && (b3 & 16) != 0) {
                        hh5Var.c = (byte) 10;
                        int i6 = c0 + 20;
                        hh5Var.b = i6;
                        i = 10;
                        i2 = i6;
                        int i7 = (int) (a51Var.b - j7);
                        gh5Var.a = "ID3";
                        String.format("2.%d.%d", Integer.valueOf(Z), Integer.valueOf(b2));
                        if (!hh5Var.d) {
                            throw new ch5("Tag compression is not supported");
                        }
                        if (Z >= 4 || !z) {
                            hh5Var = hh5Var;
                            logger = logger2;
                            xl3Var = new xl3(rg6Var, i7, (i2 - i7) - i, hh5Var);
                        } else {
                            int i8 = i2 - i7;
                            byte[] bArr2 = new byte[i8];
                            int i9 = 0;
                            while (i9 < i8) {
                                int read2 = rg6Var.read(bArr2, i9, i8 - i9);
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
                            xl3Var = new xl3(new ByteArrayInputStream(bArr2, 0, i10), i7, i10, hh5Var);
                            logger = logger2;
                        }
                        z24 z24Var2 = (z24) xl3Var.d;
                        zy8 zy8Var2 = (zy8) xl3Var.b;
                        while (true) {
                            try {
                                if (zy8Var2.e() <= 10) {
                                    zy8Var = zy8Var2;
                                    break;
                                }
                                fh5 fh5Var = new fh5(xl3Var);
                                String str6 = fh5Var.a;
                                int i12 = fh5Var.c;
                                zy8Var = zy8Var2;
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
                                    } catch (ch5 e) {
                                        e = e;
                                        if (logger.isLoggable(level)) {
                                            logger.log(level, "ID3 exception occured: " + e.getMessage());
                                        }
                                        z24Var2.d0(zy8Var.e());
                                        b4 = hh5Var.c;
                                        if (b4 > 0) {
                                        }
                                        this.f = gh5Var.f;
                                        this.e = gh5Var.e;
                                        this.d = gh5Var.d;
                                        this.i = gh5Var.i;
                                        this.o = gh5Var.o;
                                        this.p = gh5Var.p;
                                        this.m = gh5Var.m;
                                        this.l = gh5Var.l;
                                        this.k = gh5Var.k;
                                        this.b = gh5Var.b;
                                        this.h = gh5Var.h;
                                        this.n = gh5Var.n;
                                        this.c = gh5Var.c;
                                        this.j = gh5Var.j;
                                        this.g = gh5Var.g;
                                        j2 = this.b;
                                        if (j2 > 0) {
                                        }
                                        try {
                                            m11 m11Var = new m11();
                                            m11Var.a = j - 128;
                                            this.b = b(rg6Var, j, m11Var);
                                        } catch (ng6 e2) {
                                            Logger logger3 = r;
                                            if (logger3.isLoggable(level)) {
                                                logger3.log(level, "Could not determine MP3 duration", (Throwable) e2);
                                            }
                                        }
                                        if (this.c == null) {
                                        }
                                        j3 = rg6Var.b;
                                        j4 = j - 128;
                                        if (j3 <= j4) {
                                        }
                                    }
                                }
                                if (i12 <= zy8Var.e()) {
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
                                    z24Var2.d0(i12);
                                    zy8Var2 = zy8Var;
                                } else if (logger.isLoggable(level)) {
                                    logger.log(level, "ID3 frame claims to extend frames area");
                                }
                            } catch (ch5 e3) {
                                e = e3;
                                zy8Var = zy8Var2;
                            }
                        }
                        z24Var2.d0(zy8Var.e());
                        b4 = hh5Var.c;
                        if (b4 > 0) {
                            rg6Var.skip(b4);
                        }
                    }
                }
                i2 = i5;
                i = 0;
                int i72 = (int) (a51Var.b - j7);
                gh5Var.a = "ID3";
                String.format("2.%d.%d", Integer.valueOf(Z), Integer.valueOf(b2));
                if (!hh5Var.d) {
                }
            }
            this.f = gh5Var.f;
            this.e = gh5Var.e;
            this.d = gh5Var.d;
            this.i = gh5Var.i;
            this.o = gh5Var.o;
            this.p = gh5Var.p;
            this.m = gh5Var.m;
            this.l = gh5Var.l;
            this.k = gh5Var.k;
            this.b = gh5Var.b;
            this.h = gh5Var.h;
            this.n = gh5Var.n;
            this.c = gh5Var.c;
            this.j = gh5Var.j;
            this.g = gh5Var.g;
        }
        j2 = this.b;
        if (j2 > 0 || j2 >= 3600000) {
            m11 m11Var2 = new m11();
            m11Var2.a = j - 128;
            this.b = b(rg6Var, j, m11Var2);
        }
        if (this.c == null && this.f != null && this.d != null) {
            return;
        }
        j3 = rg6Var.b;
        j4 = j - 128;
        if (j3 <= j4) {
            return;
        }
        long j8 = j4 - j3;
        long j9 = 0;
        while (j9 < j8) {
            long skip = rg6Var.skip(j8 - j9);
            if (skip <= 0) {
                throw new EOFException();
            }
            j9 += skip;
        }
        if (!ah5.c(bufferedInputStream)) {
            return;
        }
        if (ah5.c(bufferedInputStream)) {
            byte[] bArr3 = new byte[128];
            int i15 = 0;
            while (i15 < 128) {
                int read3 = bufferedInputStream.read(bArr3, i15, 128 - i15);
                if (read3 <= 0) {
                    throw new EOFException();
                }
                i15 += read3;
            }
            str3 = ah5.b(3, 30, bArr3);
            str4 = ah5.b(33, 30, bArr3);
            String b6 = ah5.b(63, 30, bArr3);
            try {
                s = Short.parseShort(ah5.b(93, 4, bArr3));
            } catch (NumberFormatException unused) {
                s = 0;
            }
            str = ah5.b(97, 30, bArr3);
            int b7 = tb4.b(bArr3[127]);
            r2 = b7 != 0 ? tb4.d(b7) : null;
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

    /* JADX WARN: Code restructure failed: missing block: B:160:0x00db, code lost:
    
        if ((((r8[4] & 255) << 8) | (r8[5] & 255)) != r13.a) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x004e, code lost:
    
        r22 = 1;
        r20 = 3;
        r21 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0162, code lost:
    
        r24 = r4 ? 1 : 0;
        r19 = 2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0326 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long b(rg6 rg6Var, long j, m11 m11Var) {
        int[][] iArr;
        int i;
        int i2;
        int i3;
        int i4;
        char c;
        int i5;
        wk4 wk4Var;
        int i6;
        int i7;
        int read;
        int i8;
        long j2;
        int i9;
        pg6 pg6Var;
        byte b;
        int read2;
        m11 m11Var2 = m11Var;
        int i10 = -1;
        int read3 = m11Var2.a(rg6Var) ? -1 : rg6Var.read();
        boolean z = 0;
        int i11 = 0;
        while (true) {
            byte b2 = 7;
            iArr = pg6.m;
            i = 4;
            if (read3 == -1) {
                break;
            }
            if (i11 == 255 && (read3 & kk7.A3) == 224) {
                rg6Var.mark(2);
                int read4 = m11Var2.a(rg6Var) ? -1 : rg6Var.read();
                if (read4 == -1) {
                    break;
                }
                if (m11Var2.a(rg6Var)) {
                    i3 = 2;
                    read2 = -1;
                } else {
                    i3 = 2;
                    read2 = rg6Var.read();
                }
                if (read2 != -1) {
                    pg6 pg6Var2 = new pg6(read3, read4, read2);
                    rg6Var.reset();
                    rg6Var.mark(pg6Var2.b() + 2);
                    int b3 = pg6Var2.b();
                    byte[] bArr = new byte[b3];
                    bArr[z ? 1 : 0] = -1;
                    c = 3;
                    bArr[1] = (byte) read3;
                    int i12 = b3 - 2;
                    int i13 = z ? 1 : 0;
                    while (i13 < i12) {
                        i5 = 5;
                        try {
                            int read5 = rg6Var.read(bArr, i3 + i13, i12 - i13);
                            if (read5 <= 0) {
                                throw new EOFException();
                            }
                            i13 += read5;
                        } catch (EOFException unused) {
                            i2 = z ? 1 : 0;
                            i4 = 1;
                            wk4Var = null;
                            if (wk4Var != null) {
                            }
                        }
                    }
                    i5 = 5;
                    wk4Var = new wk4(pg6Var2, bArr, z, b2);
                    if (pg6Var2.g == 0 && pg6Var2.b == 1) {
                        og6 og6Var = new og6();
                        og6Var.a = (short) -1;
                        og6Var.a(bArr[i3]);
                        og6Var.a(bArr[3]);
                        i4 = 1;
                        int i14 = iArr[pg6Var2.e][pg6Var2.a];
                        int i15 = z ? 1 : 0;
                        int i16 = z;
                        while (i15 < i14) {
                            og6Var.a(bArr[i15 + 6]);
                            i15++;
                            i16 = i16;
                        }
                        i2 = i16;
                    } else {
                        i2 = z ? 1 : 0;
                        i4 = 1;
                    }
                    int read6 = m11Var2.a(rg6Var) ? -1 : rg6Var.read();
                    int read7 = m11Var2.a(rg6Var) ? -1 : rg6Var.read();
                    if (read6 == -1 || read7 == -1) {
                        break;
                    }
                    if (read6 == 255 && (read7 & kk7.c4) == (read3 & kk7.c4)) {
                        int read8 = m11Var2.a(rg6Var) ? -1 : rg6Var.read();
                        int read9 = m11Var2.a(rg6Var) ? -1 : rg6Var.read();
                        if (read8 == -1 || read9 == -1) {
                            break;
                        }
                        if (new pg6(read7, read8, read9).d(pg6Var2)) {
                            rg6Var.reset();
                            long j3 = i12;
                            long j4 = 0;
                            while (j4 < j3) {
                                long skip = rg6Var.skip(j3 - j4);
                                if (skip <= 0) {
                                    throw new EOFException();
                                }
                                j4 += skip;
                            }
                        }
                    }
                    rg6Var.reset();
                } else {
                    i2 = z ? 1 : 0;
                    break;
                }
            } else {
                i2 = z ? 1 : 0;
            }
            i11 = read3;
            read3 = m11Var2.a(rg6Var) ? -1 : rg6Var.read();
            z = i2;
        }
        if (wk4Var != null) {
            throw new ng6("No audio frame");
        }
        byte[] bArr2 = (byte[]) wk4Var.b;
        pg6 pg6Var3 = (pg6) wk4Var.c;
        int i17 = iArr[pg6Var3.e][pg6Var3.a];
        int i18 = i17 + 4;
        if (bArr2.length < i17 + 16 || i18 < 0 || bArr2.length < i17 + 12 || !(((b = bArr2[i18]) == 88 && bArr2[i17 + 5] == 105 && bArr2[i17 + 6] == 110 && bArr2[i17 + 7] == 103) || (b == 73 && bArr2[i17 + 5] == 110 && bArr2[i17 + 6] == 102 && bArr2[i17 + 7] == 111))) {
            if (bArr2.length >= 62 && bArr2[36] == 86 && bArr2[37] == 66 && bArr2[38] == 82 && bArr2[39] == 73) {
                i6 = (bArr2[53] & 255) | ((bArr2[50] & 255) << 24) | ((bArr2[51] & 255) << 16) | ((bArr2[52] & 255) << 8);
            }
            i6 = -1;
        } else {
            if ((bArr2[i17 + 11] & 1) != 0) {
                i6 = ((bArr2[i17 + 12] & 255) << 24) | ((bArr2[i17 + 13] & 255) << 16) | ((bArr2[i17 + 14] & 255) << 8) | (bArr2[i17 + 15] & 255);
            }
            i6 = -1;
        }
        if (i6 > 0) {
            return pg6Var3.c(i6 * bArr2.length);
        }
        long length = rg6Var.b - bArr2.length;
        long length2 = bArr2.length;
        int a = pg6Var3.a();
        long j5 = a;
        int c2 = 10000 / ((int) pg6Var3.c(pg6Var3.b()));
        int i19 = i4;
        wk4 wk4Var2 = wk4Var;
        int i20 = i2;
        while (true) {
            pg6 pg6Var4 = (pg6) wk4Var2.c;
            if (i19 == c2 && i20 == 0 && j > 0) {
                return pg6Var4.c(j - length);
            }
            rg6Var.mark(i);
            if (m11Var2.a(rg6Var)) {
                i7 = i;
                read = i10;
            } else {
                i7 = i;
                read = rg6Var.read();
            }
            int read10 = m11Var2.a(rg6Var) ? i10 : rg6Var.read();
            if (read == i10 || read10 == i10) {
                i8 = c2;
            } else {
                if (read == 255 && (read10 & kk7.A3) == 224) {
                    int read11 = m11Var2.a(rg6Var) ? -1 : rg6Var.read();
                    int read12 = m11Var2.a(rg6Var) ? -1 : rg6Var.read();
                    i8 = c2;
                    if (read11 != -1 && read12 != -1) {
                        try {
                            pg6Var = new pg6(read10, read11, read12);
                            j2 = length;
                            i9 = i5;
                        } catch (ng6 e) {
                            int i21 = rg6Var.d + 1;
                            rg6Var.d = i21;
                            j2 = length;
                            i9 = i5;
                            if (i21 > i9) {
                                throw e;
                            }
                            pg6Var = null;
                        }
                        if (pg6Var != null && pg6Var.d(pg6Var4)) {
                            int b4 = pg6Var.b();
                            byte[] bArr3 = new byte[b4];
                            bArr3[i2] = (byte) read;
                            bArr3[i4] = (byte) read10;
                            bArr3[i3] = (byte) read11;
                            bArr3[c] = (byte) read12;
                            int i22 = b4 - 4;
                            int i23 = i2;
                            while (i23 < i22) {
                                try {
                                    int read13 = rg6Var.read(bArr3, i7 + i23, i22 - i23);
                                    if (read13 <= 0) {
                                        throw new EOFException();
                                    }
                                    i23 += read13;
                                } catch (EOFException unused2) {
                                }
                            }
                            wk4Var2 = new wk4(pg6Var, bArr3, i2, (byte) 7);
                            if (wk4Var2 == null) {
                                return (((length2 * 1000) * i19) << c) / j5;
                            }
                            int a2 = ((pg6) wk4Var2.c).a();
                            if (a2 != a) {
                                i20 = i4;
                            }
                            j5 += a2;
                            length2 += ((byte[]) wk4Var2.b).length;
                            i19++;
                            m11Var2 = m11Var;
                            i5 = i9;
                            i = i7;
                            c2 = i8;
                            length = j2;
                            i10 = -1;
                            i2 = 0;
                        }
                    }
                } else {
                    i8 = c2;
                    j2 = length;
                    i9 = i5;
                }
                rg6Var.reset();
                wk4Var2 = null;
                if (wk4Var2 == null) {
                }
            }
            j2 = length;
            i9 = i5;
            wk4Var2 = null;
            if (wk4Var2 == null) {
            }
        }
    }
}
