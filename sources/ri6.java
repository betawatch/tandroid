// default package

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ri6 extends g10 {
    public static final Logger r = Logger.getLogger(ri6.class.getName());

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
    
        r2.d.W(r2.a.e());
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0251, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0252, code lost:
    
        r2.d.W(r2.a.e());
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
    public ri6(BufferedInputStream bufferedInputStream, long j) {
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
        in3 in3Var;
        Logger logger;
        a19 a19Var;
        byte b4;
        Level level = Level.FINEST;
        this.a = "MP3";
        si6 si6Var = new si6(bufferedInputStream);
        si6Var.d = 0;
        if (fj5.b(si6Var)) {
            Logger logger2 = fj5.s;
            fj5 fj5Var = new fj5();
            if (fj5.b(si6Var)) {
                h61 h61Var = new h61((FilterInputStream) si6Var);
                gj5 gj5Var = new gj5();
                gj5Var.a = 0;
                gj5Var.b = 0;
                gj5Var.c = (byte) 0;
                long j5 = h61Var.b;
                ai4 ai4Var = new ai4((Object) h61Var, (byte) 7);
                byte[] bArr = new byte[3];
                int i3 = 0;
                for (int i4 = 3; i3 < i4; i4 = 3) {
                    long j6 = j5;
                    int read = ((h61) ai4Var.b).read(bArr, i3, 3 - i3);
                    if (read <= 0) {
                        throw new EOFException();
                    }
                    i3 += read;
                    j5 = j6;
                }
                long j7 = j5;
                String str5 = new String(bArr, "ISO-8859-1");
                if (!"ID3".equals(str5)) {
                    throw new bj5("Invalid ID3 identifier: ".concat(str5));
                }
                byte K = ai4Var.K();
                gj5Var.a = K;
                if (K != 2 && K != 3 && K != 4) {
                    throw new bj5(hg9.j(K, "Unsupported ID3v2 version: "));
                }
                byte K2 = ai4Var.K();
                byte K3 = ai4Var.K();
                int R = ai4Var.R();
                int i5 = R + 10;
                gj5Var.b = i5;
                if (K == 2) {
                    boolean z2 = (K3 & 128) != 0;
                    gj5Var.d = (K3 & 64) != 0;
                    z = z2;
                    b2 = K2;
                } else {
                    boolean z3 = (K3 & 128) != 0;
                    if ((K3 & 64) != 0) {
                        z = z3;
                        if (K == 3) {
                            int P = ai4Var.P();
                            ai4Var.K();
                            ai4Var.K();
                            ai4Var.P();
                            b2 = K2;
                            b3 = K3;
                            ai4Var.W(P - 6);
                        } else {
                            b2 = K2;
                            b3 = K3;
                            ai4Var.W(ai4Var.R() - 4);
                        }
                    } else {
                        z = z3;
                        b2 = K2;
                        b3 = K3;
                    }
                    if (K >= 4 && (b3 & 16) != 0) {
                        gj5Var.c = (byte) 10;
                        int i6 = R + 20;
                        gj5Var.b = i6;
                        i = 10;
                        i2 = i6;
                        int i7 = (int) (h61Var.b - j7);
                        fj5Var.a = "ID3";
                        String.format("2.%d.%d", Integer.valueOf(K), Integer.valueOf(b2));
                        if (!gj5Var.d) {
                            throw new bj5("Tag compression is not supported");
                        }
                        if (K >= 4 || !z) {
                            gj5Var = gj5Var;
                            logger = logger2;
                            in3Var = new in3(si6Var, i7, (i2 - i7) - i, gj5Var);
                        } else {
                            int i8 = i2 - i7;
                            byte[] bArr2 = new byte[i8];
                            int i9 = 0;
                            while (i9 < i8) {
                                int read2 = si6Var.read(bArr2, i9, i8 - i9);
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
                            in3Var = new in3(new ByteArrayInputStream(bArr2, 0, i10), i7, i10, gj5Var);
                            logger = logger2;
                        }
                        ai4 ai4Var2 = (ai4) in3Var.d;
                        a19 a19Var2 = (a19) in3Var.b;
                        while (true) {
                            try {
                                if (a19Var2.e() <= 10) {
                                    a19Var = a19Var2;
                                    break;
                                }
                                ej5 ej5Var = new ej5(in3Var);
                                String str6 = ej5Var.a;
                                int i12 = ej5Var.c;
                                a19Var = a19Var2;
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
                                    } catch (bj5 e) {
                                        e = e;
                                        if (logger.isLoggable(level)) {
                                            logger.log(level, "ID3 exception occured: " + e.getMessage());
                                        }
                                        ai4Var2.W(a19Var.e());
                                        b4 = gj5Var.c;
                                        if (b4 > 0) {
                                        }
                                        this.f = fj5Var.f;
                                        this.e = fj5Var.e;
                                        this.d = fj5Var.d;
                                        this.i = fj5Var.i;
                                        this.o = fj5Var.o;
                                        this.p = fj5Var.p;
                                        this.m = fj5Var.m;
                                        this.l = fj5Var.l;
                                        this.k = fj5Var.k;
                                        this.b = fj5Var.b;
                                        this.h = fj5Var.h;
                                        this.n = fj5Var.n;
                                        this.c = fj5Var.c;
                                        this.j = fj5Var.j;
                                        this.g = fj5Var.g;
                                        j2 = this.b;
                                        if (j2 > 0) {
                                        }
                                        try {
                                            u21 u21Var = new u21();
                                            u21Var.a = j - 128;
                                            this.b = b(si6Var, j, u21Var);
                                        } catch (oi6 e2) {
                                            Logger logger3 = r;
                                            if (logger3.isLoggable(level)) {
                                                logger3.log(level, "Could not determine MP3 duration", (Throwable) e2);
                                            }
                                        }
                                        if (this.c == null) {
                                        }
                                        j3 = si6Var.b;
                                        j4 = j - 128;
                                        if (j3 <= j4) {
                                        }
                                    }
                                }
                                if (i12 <= a19Var.e()) {
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
                                    ai4Var2.W(i12);
                                    a19Var2 = a19Var;
                                } else if (logger.isLoggable(level)) {
                                    logger.log(level, "ID3 frame claims to extend frames area");
                                }
                            } catch (bj5 e3) {
                                e = e3;
                                a19Var = a19Var2;
                            }
                        }
                        ai4Var2.W(a19Var.e());
                        b4 = gj5Var.c;
                        if (b4 > 0) {
                            si6Var.skip(b4);
                        }
                    }
                }
                i2 = i5;
                i = 0;
                int i72 = (int) (h61Var.b - j7);
                fj5Var.a = "ID3";
                String.format("2.%d.%d", Integer.valueOf(K), Integer.valueOf(b2));
                if (!gj5Var.d) {
                }
            }
            this.f = fj5Var.f;
            this.e = fj5Var.e;
            this.d = fj5Var.d;
            this.i = fj5Var.i;
            this.o = fj5Var.o;
            this.p = fj5Var.p;
            this.m = fj5Var.m;
            this.l = fj5Var.l;
            this.k = fj5Var.k;
            this.b = fj5Var.b;
            this.h = fj5Var.h;
            this.n = fj5Var.n;
            this.c = fj5Var.c;
            this.j = fj5Var.j;
            this.g = fj5Var.g;
        }
        j2 = this.b;
        if (j2 > 0 || j2 >= 3600000) {
            u21 u21Var2 = new u21();
            u21Var2.a = j - 128;
            this.b = b(si6Var, j, u21Var2);
        }
        if (this.c == null && this.f != null && this.d != null) {
            return;
        }
        j3 = si6Var.b;
        j4 = j - 128;
        if (j3 <= j4) {
            return;
        }
        long j8 = j4 - j3;
        long j9 = 0;
        while (j9 < j8) {
            long skip = si6Var.skip(j8 - j9);
            if (skip <= 0) {
                throw new EOFException();
            }
            j9 += skip;
        }
        if (!zi5.c(bufferedInputStream)) {
            return;
        }
        if (zi5.c(bufferedInputStream)) {
            byte[] bArr3 = new byte[128];
            int i15 = 0;
            while (i15 < 128) {
                int read3 = bufferedInputStream.read(bArr3, i15, 128 - i15);
                if (read3 <= 0) {
                    throw new EOFException();
                }
                i15 += read3;
            }
            str3 = zi5.b(3, 30, bArr3);
            str4 = zi5.b(33, 30, bArr3);
            String b6 = zi5.b(63, 30, bArr3);
            try {
                s = Short.parseShort(zi5.b(93, 4, bArr3));
            } catch (NumberFormatException unused) {
                s = 0;
            }
            str = zi5.b(97, 30, bArr3);
            int b7 = td4.b(bArr3[127]);
            r2 = b7 != 0 ? td4.d(b7) : null;
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
    public static long b(si6 si6Var, long j, u21 u21Var) {
        int[][] iArr;
        int i;
        int i2;
        int i3;
        int i4;
        char c;
        int i5;
        wm4 wm4Var;
        int i6;
        int i7;
        int read;
        int i8;
        long j2;
        int i9;
        qi6 qi6Var;
        byte b;
        int read2;
        u21 u21Var2 = u21Var;
        int i10 = -1;
        int read3 = u21Var2.a(si6Var) ? -1 : si6Var.read();
        boolean z = 0;
        int i11 = 0;
        while (true) {
            byte b2 = 7;
            iArr = qi6.m;
            i = 4;
            if (read3 == -1) {
                break;
            }
            if (i11 == 255 && (read3 & nm7.A3) == 224) {
                si6Var.mark(2);
                int read4 = u21Var2.a(si6Var) ? -1 : si6Var.read();
                if (read4 == -1) {
                    break;
                }
                if (u21Var2.a(si6Var)) {
                    i3 = 2;
                    read2 = -1;
                } else {
                    i3 = 2;
                    read2 = si6Var.read();
                }
                if (read2 != -1) {
                    qi6 qi6Var2 = new qi6(read3, read4, read2);
                    si6Var.reset();
                    si6Var.mark(qi6Var2.b() + 2);
                    int b3 = qi6Var2.b();
                    byte[] bArr = new byte[b3];
                    bArr[z ? 1 : 0] = -1;
                    c = 3;
                    bArr[1] = (byte) read3;
                    int i12 = b3 - 2;
                    int i13 = z ? 1 : 0;
                    while (i13 < i12) {
                        i5 = 5;
                        try {
                            int read5 = si6Var.read(bArr, i3 + i13, i12 - i13);
                            if (read5 <= 0) {
                                throw new EOFException();
                            }
                            i13 += read5;
                        } catch (EOFException unused) {
                            i2 = z ? 1 : 0;
                            i4 = 1;
                            wm4Var = null;
                            if (wm4Var != null) {
                            }
                        }
                    }
                    i5 = 5;
                    wm4Var = new wm4(qi6Var2, bArr, z, b2);
                    if (qi6Var2.g == 0 && qi6Var2.b == 1) {
                        pi6 pi6Var = new pi6();
                        pi6Var.a = (short) -1;
                        pi6Var.a(bArr[i3]);
                        pi6Var.a(bArr[3]);
                        i4 = 1;
                        int i14 = iArr[qi6Var2.e][qi6Var2.a];
                        int i15 = z ? 1 : 0;
                        int i16 = z;
                        while (i15 < i14) {
                            pi6Var.a(bArr[i15 + 6]);
                            i15++;
                            i16 = i16;
                        }
                        i2 = i16;
                    } else {
                        i2 = z ? 1 : 0;
                        i4 = 1;
                    }
                    int read6 = u21Var2.a(si6Var) ? -1 : si6Var.read();
                    int read7 = u21Var2.a(si6Var) ? -1 : si6Var.read();
                    if (read6 == -1 || read7 == -1) {
                        break;
                    }
                    if (read6 == 255 && (read7 & nm7.c4) == (read3 & nm7.c4)) {
                        int read8 = u21Var2.a(si6Var) ? -1 : si6Var.read();
                        int read9 = u21Var2.a(si6Var) ? -1 : si6Var.read();
                        if (read8 == -1 || read9 == -1) {
                            break;
                        }
                        if (new qi6(read7, read8, read9).d(qi6Var2)) {
                            si6Var.reset();
                            long j3 = i12;
                            long j4 = 0;
                            while (j4 < j3) {
                                long skip = si6Var.skip(j3 - j4);
                                if (skip <= 0) {
                                    throw new EOFException();
                                }
                                j4 += skip;
                            }
                        }
                    }
                    si6Var.reset();
                } else {
                    i2 = z ? 1 : 0;
                    break;
                }
            } else {
                i2 = z ? 1 : 0;
            }
            i11 = read3;
            read3 = u21Var2.a(si6Var) ? -1 : si6Var.read();
            z = i2;
        }
        if (wm4Var != null) {
            throw new oi6("No audio frame");
        }
        byte[] bArr2 = (byte[]) wm4Var.b;
        qi6 qi6Var3 = (qi6) wm4Var.c;
        int i17 = iArr[qi6Var3.e][qi6Var3.a];
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
            return qi6Var3.c(i6 * bArr2.length);
        }
        long length = si6Var.b - bArr2.length;
        long length2 = bArr2.length;
        int a = qi6Var3.a();
        long j5 = a;
        int c2 = 10000 / ((int) qi6Var3.c(qi6Var3.b()));
        int i19 = i4;
        wm4 wm4Var2 = wm4Var;
        int i20 = i2;
        while (true) {
            qi6 qi6Var4 = (qi6) wm4Var2.c;
            if (i19 == c2 && i20 == 0 && j > 0) {
                return qi6Var4.c(j - length);
            }
            si6Var.mark(i);
            if (u21Var2.a(si6Var)) {
                i7 = i;
                read = i10;
            } else {
                i7 = i;
                read = si6Var.read();
            }
            int read10 = u21Var2.a(si6Var) ? i10 : si6Var.read();
            if (read == i10 || read10 == i10) {
                i8 = c2;
            } else {
                if (read == 255 && (read10 & nm7.A3) == 224) {
                    int read11 = u21Var2.a(si6Var) ? -1 : si6Var.read();
                    int read12 = u21Var2.a(si6Var) ? -1 : si6Var.read();
                    i8 = c2;
                    if (read11 != -1 && read12 != -1) {
                        try {
                            qi6Var = new qi6(read10, read11, read12);
                            j2 = length;
                            i9 = i5;
                        } catch (oi6 e) {
                            int i21 = si6Var.d + 1;
                            si6Var.d = i21;
                            j2 = length;
                            i9 = i5;
                            if (i21 > i9) {
                                throw e;
                            }
                            qi6Var = null;
                        }
                        if (qi6Var != null && qi6Var.d(qi6Var4)) {
                            int b4 = qi6Var.b();
                            byte[] bArr3 = new byte[b4];
                            bArr3[i2] = (byte) read;
                            bArr3[i4] = (byte) read10;
                            bArr3[i3] = (byte) read11;
                            bArr3[c] = (byte) read12;
                            int i22 = b4 - 4;
                            int i23 = i2;
                            while (i23 < i22) {
                                try {
                                    int read13 = si6Var.read(bArr3, i7 + i23, i22 - i23);
                                    if (read13 <= 0) {
                                        throw new EOFException();
                                    }
                                    i23 += read13;
                                } catch (EOFException unused2) {
                                }
                            }
                            wm4Var2 = new wm4(qi6Var, bArr3, i2, (byte) 7);
                            if (wm4Var2 == null) {
                                return (((length2 * 1000) * i19) << c) / j5;
                            }
                            int a2 = ((qi6) wm4Var2.c).a();
                            if (a2 != a) {
                                i20 = i4;
                            }
                            j5 += a2;
                            length2 += ((byte[]) wm4Var2.b).length;
                            i19++;
                            u21Var2 = u21Var;
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
                si6Var.reset();
                wm4Var2 = null;
                if (wm4Var2 == null) {
                }
            }
            j2 = length;
            i9 = i5;
            wm4Var2 = null;
            if (wm4Var2 == null) {
            }
        }
    }
}
