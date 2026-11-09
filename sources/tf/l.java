package tf;

import f3.s;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.vy;
import org.telegram.ui.ky0;
import sg.i0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class l extends rf.a {
    public static final Logger r = Logger.getLogger(l.class.getName());

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0211, code lost:
    
        if (r13 <= 0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0215, code lost:
    
        if (r0.f != false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0217, code lost:
    
        r2 = r6.s(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x021b, code lost:
    
        r15.d(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x024b, code lost:
    
        r2.d.R(r2.a.e());
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0221, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x025a, code lost:
    
        r2.d.R(r2.a.e());
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0265, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0223, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0228, code lost:
    
        if (r12.isLoggable(r5) != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x022a, code lost:
    
        r12.log(r5, "ID3 exception occured in frame " + r10 + ": " + r0.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:233:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:240:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l(BufferedInputStream bufferedInputStream, long j3) {
        long j10;
        long j11;
        long j12;
        String str;
        String str2;
        String str3;
        String str4;
        short s5;
        short s9;
        byte b10;
        byte b11;
        byte b12;
        ky0 ky0Var;
        Logger logger;
        uf.a aVar;
        int i7;
        Level level = Level.FINEST;
        this.a = "MP3";
        m mVar = new m(bufferedInputStream);
        mVar.d = 0;
        if (g.b(mVar)) {
            Logger logger2 = g.s;
            g gVar = new g();
            if (g.b(mVar)) {
                ab.d dVar = new ab.d((FilterInputStream) mVar);
                h hVar = new h();
                hVar.a = 0;
                hVar.b = 0;
                hVar.c = 0;
                long j13 = dVar.b;
                vy vyVar = new vy(dVar, 19);
                byte[] bArr = new byte[3];
                int i10 = 0;
                for (int i11 = 3; i10 < i11; i11 = 3) {
                    long j14 = j13;
                    int read = ((ab.d) vyVar.b).read(bArr, i10, 3 - i10);
                    if (read <= 0) {
                        throw new EOFException();
                    }
                    i10 += read;
                    j13 = j14;
                }
                long j15 = j13;
                String str5 = new String(bArr, "ISO-8859-1");
                if (!"ID3".equals(str5)) {
                    throw new c("Invalid ID3 identifier: ".concat(str5));
                }
                byte M = vyVar.M();
                hVar.a = M;
                if (M != 2 && M != 3 && M != 4) {
                    throw new c(jg.g.j(M, "Unsupported ID3v2 version: "));
                }
                byte M2 = vyVar.M();
                byte M3 = vyVar.M();
                int P = vyVar.P();
                hVar.b = P + 10;
                if (M == 2) {
                    hVar.d = (M3 & 128) != 0;
                    hVar.e = (M3 & 64) != 0;
                    b11 = M2;
                } else {
                    hVar.d = (M3 & 128) != 0;
                    if ((M3 & 64) == 0) {
                        b11 = M2;
                        b12 = M3;
                    } else if (M == 3) {
                        int O = vyVar.O();
                        vyVar.M();
                        vyVar.M();
                        vyVar.O();
                        b11 = M2;
                        b12 = M3;
                        vyVar.R(O - 6);
                    } else {
                        b11 = M2;
                        b12 = M3;
                        vyVar.R(vyVar.P() - 4);
                    }
                    if (M >= 4 && (b12 & 16) != 0) {
                        hVar.c = 10;
                        hVar.b = P + 20;
                    }
                }
                int i12 = (int) (dVar.b - j15);
                gVar.a = "ID3";
                String.format("2.%d.%d", Integer.valueOf(M), Integer.valueOf(b11));
                int i13 = hVar.b;
                if (hVar.e) {
                    throw new c("Tag compression is not supported");
                }
                if (M >= 4 || !hVar.d) {
                    logger = logger2;
                    ky0Var = new ky0(mVar, i12, (i13 - i12) - hVar.c, hVar);
                } else {
                    int i14 = i13 - i12;
                    byte[] bArr2 = new byte[i14];
                    int i15 = 0;
                    while (i15 < i14) {
                        int read2 = mVar.read(bArr2, i15, i14 - i15);
                        if (read2 <= 0) {
                            throw new EOFException();
                        }
                        i15 += read2;
                    }
                    boolean z9 = false;
                    int i16 = 0;
                    for (int i17 = 0; i17 < i14; i17++) {
                        byte b13 = bArr2[i17];
                        if (!z9 || b13 != 0) {
                            bArr2[i16] = b13;
                            i16++;
                        }
                        z9 = b13 == -1;
                    }
                    ky0Var = new ky0(new ByteArrayInputStream(bArr2, 0, i16), i12, i16, hVar);
                    logger = logger2;
                }
                vy vyVar2 = (vy) ky0Var.d;
                uf.a aVar2 = (uf.a) ky0Var.b;
                while (true) {
                    try {
                        if (aVar2.e() <= 10) {
                            aVar = aVar2;
                            break;
                        }
                        f fVar = new f(ky0Var);
                        String str6 = fVar.a;
                        int i18 = fVar.c;
                        aVar = aVar2;
                        int i19 = 0;
                        while (true) {
                            try {
                                if (i19 >= str6.length()) {
                                    if (i18 == 0) {
                                        break;
                                    }
                                } else if (str6.charAt(0) != 0) {
                                    break;
                                } else {
                                    i19++;
                                }
                            } catch (c e10) {
                                e = e10;
                                if (logger.isLoggable(level)) {
                                    logger.log(level, "ID3 exception occured: " + e.getMessage());
                                }
                                vyVar2.R(aVar.e());
                                i7 = hVar.c;
                                if (i7 > 0) {
                                }
                                this.f = gVar.f;
                                this.e = gVar.e;
                                this.d = gVar.d;
                                this.i = gVar.i;
                                this.o = gVar.o;
                                this.p = gVar.p;
                                this.m = gVar.m;
                                this.l = gVar.l;
                                this.k = gVar.k;
                                this.b = gVar.b;
                                this.h = gVar.h;
                                this.n = gVar.n;
                                this.c = gVar.c;
                                this.j = gVar.j;
                                this.g = gVar.g;
                                j10 = this.b;
                                if (j10 > 0) {
                                }
                                try {
                                    s sVar = new s();
                                    sVar.a = j3 - 128;
                                    this.b = b(mVar, j3, sVar);
                                } catch (i e11) {
                                    Logger logger3 = r;
                                    if (logger3.isLoggable(level)) {
                                        logger3.log(level, "Could not determine MP3 duration", (Throwable) e11);
                                    }
                                }
                                if (this.c == null) {
                                }
                                j11 = mVar.b;
                                j12 = j3 - 128;
                                if (j11 <= j12) {
                                }
                            }
                        }
                        if (i18 <= aVar.e()) {
                            int i20 = 0;
                            while (true) {
                                if (i20 >= str6.length()) {
                                    break;
                                }
                                if ((str6.charAt(i20) < 'A' || str6.charAt(i20) > 'Z') && (str6.charAt(i20) < '0' || str6.charAt(i20) > '9')) {
                                    break;
                                } else {
                                    i20++;
                                }
                            }
                            vyVar2.R(i18);
                            aVar2 = aVar;
                        } else if (logger.isLoggable(level)) {
                            logger.log(level, "ID3 frame claims to extend frames area");
                        }
                    } catch (c e12) {
                        e = e12;
                        aVar = aVar2;
                    }
                }
                vyVar2.R(aVar.e());
                i7 = hVar.c;
                if (i7 > 0) {
                    mVar.skip(i7);
                }
            }
            this.f = gVar.f;
            this.e = gVar.e;
            this.d = gVar.d;
            this.i = gVar.i;
            this.o = gVar.o;
            this.p = gVar.p;
            this.m = gVar.m;
            this.l = gVar.l;
            this.k = gVar.k;
            this.b = gVar.b;
            this.h = gVar.h;
            this.n = gVar.n;
            this.c = gVar.c;
            this.j = gVar.j;
            this.g = gVar.g;
        }
        j10 = this.b;
        if (j10 > 0 || j10 >= 3600000) {
            s sVar2 = new s();
            sVar2.a = j3 - 128;
            this.b = b(mVar, j3, sVar2);
        }
        if (this.c == null && this.f != null && this.d != null) {
            return;
        }
        j11 = mVar.b;
        j12 = j3 - 128;
        if (j11 <= j12) {
            return;
        }
        long j16 = j12 - j11;
        long j17 = 0;
        while (j17 < j16) {
            long skip = mVar.skip(j16 - j17);
            if (skip <= 0) {
                throw new EOFException();
            }
            j17 += skip;
        }
        if (!a.c(bufferedInputStream)) {
            return;
        }
        if (a.c(bufferedInputStream)) {
            byte[] bArr3 = new byte[128];
            int i21 = 0;
            while (i21 < 128) {
                int read3 = bufferedInputStream.read(bArr3, i21, 128 - i21);
                if (read3 <= 0) {
                    throw new EOFException();
                }
                i21 += read3;
            }
            str3 = a.b(3, 30, bArr3);
            str4 = a.b(33, 30, bArr3);
            String b14 = a.b(63, 30, bArr3);
            try {
                s5 = Short.parseShort(a.b(93, 4, bArr3));
            } catch (NumberFormatException unused) {
                s5 = 0;
            }
            str = a.b(97, 30, bArr3);
            int a10 = rf.b.a(bArr3[127]);
            r2 = a10 != 0 ? rf.b.c(a10) : null;
            if (bArr3[125] == 0 && (b10 = bArr3[126]) != 0) {
                s9 = (short) (b10 & 255);
                str2 = r2;
                r2 = b14;
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
                    this.j = s9;
                }
                if (this.g != 0) {
                    this.g = s5;
                    return;
                }
                return;
            }
            str2 = r2;
            r2 = b14;
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            s5 = 0;
        }
        s9 = 0;
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

    /* JADX WARN: Code restructure failed: missing block: B:161:0x00db, code lost:
    
        if (((r5[5] & 255) | ((r5[4] & 255) << 8)) != r9.a) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0038, code lost:
    
        r22 = 1;
        r19 = 0;
        r21 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0036, code lost:
    
        r18 = 2;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0317 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long b(m mVar, long j3, s sVar) {
        int[][] iArr;
        int i7;
        int i10;
        int i11;
        long j10;
        char c10;
        int i12;
        i0 i0Var;
        int i13;
        int i14;
        int read;
        int i15;
        int read2;
        long j11;
        int i16;
        k kVar;
        byte b10;
        int read3;
        s sVar2 = sVar;
        int i17 = -1;
        int read4 = sVar2.a(mVar) ? -1 : mVar.read();
        int i18 = 0;
        while (true) {
            iArr = k.m;
            i7 = 4;
            if (read4 == -1) {
                break;
            }
            if (i18 == 255 && (read4 & qs.B3) == 224) {
                mVar.mark(2);
                int read5 = sVar2.a(mVar) ? -1 : mVar.read();
                if (read5 == -1) {
                    break;
                }
                if (sVar2.a(mVar)) {
                    i10 = 2;
                    read3 = -1;
                } else {
                    i10 = 2;
                    read3 = mVar.read();
                }
                if (read3 == -1) {
                    break;
                }
                j10 = 0;
                k kVar2 = new k(read4, read5, read3);
                mVar.reset();
                mVar.mark(kVar2.b() + 2);
                int b11 = kVar2.b();
                byte[] bArr = new byte[b11];
                bArr[0] = -1;
                bArr[1] = (byte) read4;
                int i19 = b11 - 2;
                int i20 = 0;
                while (i20 < i19) {
                    c10 = 3;
                    try {
                        int read6 = mVar.read(bArr, i10 + i20, i19 - i20);
                        if (read6 <= 0) {
                            throw new EOFException();
                        }
                        i20 += read6;
                    } catch (EOFException unused) {
                        i11 = 1;
                        i12 = 5;
                        i0Var = null;
                        if (i0Var != null) {
                        }
                    }
                }
                c10 = 3;
                i0Var = new i0(kVar2, bArr, false, 2);
                if (kVar2.g == 0 && kVar2.b == 1) {
                    j jVar = new j();
                    jVar.a = (short) -1;
                    jVar.a(bArr[i10]);
                    jVar.a(bArr[3]);
                    i11 = 1;
                    int i21 = iArr[kVar2.e][kVar2.a];
                    for (int i22 = 0; i22 < i21; i22++) {
                        jVar.a(bArr[i22 + 6]);
                    }
                    i12 = 5;
                } else {
                    i11 = 1;
                    i12 = 5;
                }
                int read7 = sVar2.a(mVar) ? -1 : mVar.read();
                int read8 = sVar2.a(mVar) ? -1 : mVar.read();
                if (read7 == -1 || read8 == -1) {
                    break;
                }
                if (read7 == 255 && (read8 & qs.d4) == (read4 & qs.d4)) {
                    int read9 = sVar2.a(mVar) ? -1 : mVar.read();
                    int read10 = sVar2.a(mVar) ? -1 : mVar.read();
                    if (read9 == -1 || read10 == -1) {
                        break;
                    }
                    if (new k(read8, read9, read10).d(kVar2)) {
                        mVar.reset();
                        long j12 = i19;
                        long j13 = 0;
                        while (j13 < j12) {
                            long skip = mVar.skip(j12 - j13);
                            if (skip <= 0) {
                                throw new EOFException();
                            }
                            j13 += skip;
                        }
                    }
                }
                mVar.reset();
            }
            i18 = read4;
            read4 = sVar2.a(mVar) ? -1 : mVar.read();
        }
        if (i0Var != null) {
            throw new i("No audio frame");
        }
        byte[] bArr2 = (byte[]) i0Var.b;
        k kVar3 = (k) i0Var.c;
        int i23 = iArr[kVar3.e][kVar3.a];
        int i24 = i23 + 4;
        if (bArr2.length >= i23 + 16 && i24 >= 0 && bArr2.length >= i23 + 12 && (((b10 = bArr2[i24]) == 88 && bArr2[i23 + 5] == 105 && bArr2[i23 + 6] == 110 && bArr2[i23 + 7] == 103) || (b10 == 73 && bArr2[i23 + 5] == 110 && bArr2[i23 + 6] == 102 && bArr2[i23 + 7] == 111))) {
            if ((bArr2[i23 + 11] & 1) != 0) {
                i13 = (bArr2[i23 + 15] & 255) | ((bArr2[i23 + 12] & 255) << 24) | ((bArr2[i23 + 13] & 255) << 16) | ((bArr2[i23 + 14] & 255) << 8);
            }
            i13 = -1;
        } else {
            if (bArr2.length >= 62 && bArr2[36] == 86 && bArr2[37] == 66 && bArr2[38] == 82 && bArr2[39] == 73) {
                i13 = ((bArr2[50] & 255) << 24) | ((bArr2[51] & 255) << 16) | ((bArr2[52] & 255) << 8) | (bArr2[53] & 255);
            }
            i13 = -1;
        }
        if (i13 > 0) {
            return kVar3.c(i13 * bArr2.length);
        }
        long length = mVar.b - bArr2.length;
        long length2 = bArr2.length;
        int a10 = kVar3.a();
        long j14 = a10;
        int c11 = 10000 / ((int) kVar3.c(kVar3.b()));
        int i25 = 0;
        int i26 = i11;
        while (true) {
            k kVar4 = (k) i0Var.c;
            if (i26 == c11 && i25 == 0 && j3 > j10) {
                return kVar4.c(j3 - length);
            }
            mVar.mark(i7);
            if (sVar2.a(mVar)) {
                i14 = i7;
                read = i17;
            } else {
                i14 = i7;
                read = mVar.read();
            }
            if (sVar2.a(mVar)) {
                i15 = c11;
                read2 = i17;
            } else {
                i15 = c11;
                read2 = mVar.read();
            }
            if (read == i17 || read2 == i17) {
                j11 = length;
            } else {
                if (read == 255 && (read2 & qs.B3) == 224) {
                    int read11 = sVar2.a(mVar) ? -1 : mVar.read();
                    int read12 = sVar2.a(mVar) ? -1 : mVar.read();
                    j11 = length;
                    if (read11 != -1 && read12 != -1) {
                        try {
                            kVar = new k(read2, read11, read12);
                            i16 = i12;
                        } catch (i e10) {
                            int i27 = mVar.d + 1;
                            mVar.d = i27;
                            i16 = i12;
                            if (i27 > i16) {
                                throw e10;
                            }
                            kVar = null;
                        }
                        if (kVar != null && kVar.d(kVar4)) {
                            int b12 = kVar.b();
                            byte[] bArr3 = new byte[b12];
                            bArr3[0] = (byte) read;
                            bArr3[i11] = (byte) read2;
                            bArr3[i10] = (byte) read11;
                            bArr3[c10] = (byte) read12;
                            int i28 = b12 - 4;
                            int i29 = 0;
                            while (i29 < i28) {
                                try {
                                    int read13 = mVar.read(bArr3, i14 + i29, i28 - i29);
                                    if (read13 <= 0) {
                                        throw new EOFException();
                                    }
                                    i29 += read13;
                                } catch (EOFException unused2) {
                                }
                            }
                            i0Var = new i0(kVar, bArr3, false, 2);
                            if (i0Var == null) {
                                return (((length2 * 1000) * i26) * 8) / j14;
                            }
                            int a11 = ((k) i0Var.c).a();
                            if (a11 != a10) {
                                i25 = i11;
                            }
                            j14 += a11;
                            length2 += ((byte[]) i0Var.b).length;
                            i26++;
                            sVar2 = sVar;
                            i12 = i16;
                            i7 = i14;
                            c11 = i15;
                            length = j11;
                            i17 = -1;
                        }
                    }
                } else {
                    j11 = length;
                    i16 = i12;
                }
                mVar.reset();
                i0Var = null;
                if (i0Var == null) {
                }
            }
            i16 = i12;
            i0Var = null;
            if (i0Var == null) {
            }
        }
    }
}
