package qf;

import e3.s;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import k2.p1;
import m2.t;
import org.telegram.messenger.hs;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.nh;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class l extends of.a {
    public static final Logger r = Logger.getLogger(l.class.getName());

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0211, code lost:
    
        if (r13 <= 0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0215, code lost:
    
        if (r0.f != false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0217, code lost:
    
        r2 = r6.m(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x021b, code lost:
    
        r15.d(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x024b, code lost:
    
        r2.d.J(r2.a.e());
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0221, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x025a, code lost:
    
        r2.d.J(r2.a.e());
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
    public l(BufferedInputStream bufferedInputStream, long j10) {
        long j11;
        long j12;
        long j13;
        String str;
        String str2;
        String str3;
        String str4;
        short s6;
        short s10;
        byte b10;
        byte b11;
        byte b12;
        p7.d dVar;
        Logger logger;
        rf.b bVar;
        int i3;
        Level level = Level.FINEST;
        this.a = "MP3";
        m mVar = new m(bufferedInputStream);
        mVar.d = 0;
        if (g.b(mVar)) {
            Logger logger2 = g.s;
            g gVar = new g();
            if (g.b(mVar)) {
                rf.a aVar = new rf.a((FilterInputStream) mVar);
                h hVar = new h();
                hVar.a = 0;
                hVar.b = 0;
                hVar.c = 0;
                long j14 = aVar.b;
                nh nhVar = new nh(aVar, 13);
                byte[] bArr = new byte[3];
                int i10 = 0;
                for (int i11 = 3; i10 < i11; i11 = 3) {
                    long j15 = j14;
                    int read = ((rf.a) nhVar.b).read(bArr, i10, 3 - i10);
                    if (read <= 0) {
                        throw new EOFException();
                    }
                    i10 += read;
                    j14 = j15;
                }
                long j16 = j14;
                String str5 = new String(bArr, "ISO-8859-1");
                if (!"ID3".equals(str5)) {
                    throw new c("Invalid ID3 identifier: ".concat(str5));
                }
                byte F = nhVar.F();
                hVar.a = F;
                if (F != 2 && F != 3 && F != 4) {
                    throw new c(p1.i(F, "Unsupported ID3v2 version: "));
                }
                byte F2 = nhVar.F();
                byte F3 = nhVar.F();
                int H = nhVar.H();
                hVar.b = H + 10;
                if (F == 2) {
                    hVar.d = (F3 & 128) != 0;
                    hVar.e = (F3 & 64) != 0;
                    b11 = F2;
                } else {
                    hVar.d = (F3 & 128) != 0;
                    if ((F3 & 64) == 0) {
                        b11 = F2;
                        b12 = F3;
                    } else if (F == 3) {
                        int G = nhVar.G();
                        nhVar.F();
                        nhVar.F();
                        nhVar.G();
                        b11 = F2;
                        b12 = F3;
                        nhVar.J(G - 6);
                    } else {
                        b11 = F2;
                        b12 = F3;
                        nhVar.J(nhVar.H() - 4);
                    }
                    if (F >= 4 && (b12 & 16) != 0) {
                        hVar.c = 10;
                        hVar.b = H + 20;
                    }
                }
                int i12 = (int) (aVar.b - j16);
                gVar.a = "ID3";
                String.format("2.%d.%d", Integer.valueOf(F), Integer.valueOf(b11));
                int i13 = hVar.b;
                if (hVar.e) {
                    throw new c("Tag compression is not supported");
                }
                if (F >= 4 || !hVar.d) {
                    logger = logger2;
                    dVar = new p7.d(mVar, i12, (i13 - i12) - hVar.c, hVar);
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
                    boolean z10 = false;
                    int i16 = 0;
                    for (int i17 = 0; i17 < i14; i17++) {
                        byte b13 = bArr2[i17];
                        if (!z10 || b13 != 0) {
                            bArr2[i16] = b13;
                            i16++;
                        }
                        z10 = b13 == -1;
                    }
                    dVar = new p7.d(new ByteArrayInputStream(bArr2, 0, i16), i12, i16, hVar);
                    logger = logger2;
                }
                nh nhVar2 = (nh) dVar.c;
                rf.b bVar2 = (rf.b) dVar.b;
                while (true) {
                    try {
                        if (bVar2.e() <= 10) {
                            bVar = bVar2;
                            break;
                        }
                        f fVar = new f(dVar);
                        String str6 = fVar.a;
                        int i18 = fVar.c;
                        bVar = bVar2;
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
                                nhVar2.J(bVar.e());
                                i3 = hVar.c;
                                if (i3 > 0) {
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
                                j11 = this.b;
                                if (j11 > 0) {
                                }
                                try {
                                    s sVar = new s();
                                    sVar.a = j10 - 128;
                                    this.b = b(mVar, j10, sVar);
                                } catch (i e11) {
                                    Logger logger3 = r;
                                    if (logger3.isLoggable(level)) {
                                        logger3.log(level, "Could not determine MP3 duration", (Throwable) e11);
                                    }
                                }
                                if (this.c == null) {
                                }
                                j12 = mVar.b;
                                j13 = j10 - 128;
                                if (j12 <= j13) {
                                }
                            }
                        }
                        if (i18 <= bVar.e()) {
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
                            nhVar2.J(i18);
                            bVar2 = bVar;
                        } else if (logger.isLoggable(level)) {
                            logger.log(level, "ID3 frame claims to extend frames area");
                        }
                    } catch (c e12) {
                        e = e12;
                        bVar = bVar2;
                    }
                }
                nhVar2.J(bVar.e());
                i3 = hVar.c;
                if (i3 > 0) {
                    mVar.skip(i3);
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
        j11 = this.b;
        if (j11 > 0 || j11 >= 3600000) {
            s sVar2 = new s();
            sVar2.a = j10 - 128;
            this.b = b(mVar, j10, sVar2);
        }
        if (this.c == null && this.f != null && this.d != null) {
            return;
        }
        j12 = mVar.b;
        j13 = j10 - 128;
        if (j12 <= j13) {
            return;
        }
        long j17 = j13 - j12;
        long j18 = 0;
        while (j18 < j17) {
            long skip = mVar.skip(j17 - j18);
            if (skip <= 0) {
                throw new EOFException();
            }
            j18 += skip;
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
                s6 = Short.parseShort(a.b(93, 4, bArr3));
            } catch (NumberFormatException unused) {
                s6 = 0;
            }
            str = a.b(97, 30, bArr3);
            int e13 = f1.e(bArr3[127]);
            r2 = e13 != 0 ? f1.f(e13) : null;
            if (bArr3[125] == 0 && (b10 = bArr3[126]) != 0) {
                s10 = (short) (b10 & 255);
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
                    this.j = s10;
                }
                if (this.g != 0) {
                    this.g = s6;
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
            s6 = 0;
        }
        s10 = 0;
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
    public static long b(m mVar, long j10, s sVar) {
        int[][] iArr;
        int i3;
        int i10;
        int i11;
        long j11;
        char c2;
        int i12;
        t tVar;
        int i13;
        int i14;
        int read;
        int i15;
        int read2;
        long j12;
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
            i3 = 4;
            if (read4 == -1) {
                break;
            }
            if (i18 == 255 && (read4 & hs.B3) == 224) {
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
                j11 = 0;
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
                    c2 = 3;
                    try {
                        int read6 = mVar.read(bArr, i10 + i20, i19 - i20);
                        if (read6 <= 0) {
                            throw new EOFException();
                        }
                        i20 += read6;
                    } catch (EOFException unused) {
                        i11 = 1;
                        i12 = 5;
                        tVar = null;
                        if (tVar != null) {
                        }
                    }
                }
                c2 = 3;
                tVar = new t(23, kVar2, bArr);
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
                if (read7 == 255 && (read8 & hs.d4) == (read4 & hs.d4)) {
                    int read9 = sVar2.a(mVar) ? -1 : mVar.read();
                    int read10 = sVar2.a(mVar) ? -1 : mVar.read();
                    if (read9 == -1 || read10 == -1) {
                        break;
                    }
                    if (new k(read8, read9, read10).d(kVar2)) {
                        mVar.reset();
                        long j13 = i19;
                        long j14 = 0;
                        while (j14 < j13) {
                            long skip = mVar.skip(j13 - j14);
                            if (skip <= 0) {
                                throw new EOFException();
                            }
                            j14 += skip;
                        }
                    }
                }
                mVar.reset();
            }
            i18 = read4;
            read4 = sVar2.a(mVar) ? -1 : mVar.read();
        }
        if (tVar != null) {
            throw new i("No audio frame");
        }
        byte[] bArr2 = (byte[]) tVar.b;
        k kVar3 = (k) tVar.c;
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
        long j15 = a10;
        int c10 = 10000 / ((int) kVar3.c(kVar3.b()));
        int i25 = 0;
        int i26 = i11;
        while (true) {
            k kVar4 = (k) tVar.c;
            if (i26 == c10 && i25 == 0 && j10 > j11) {
                return kVar4.c(j10 - length);
            }
            mVar.mark(i3);
            if (sVar2.a(mVar)) {
                i14 = i3;
                read = i17;
            } else {
                i14 = i3;
                read = mVar.read();
            }
            if (sVar2.a(mVar)) {
                i15 = c10;
                read2 = i17;
            } else {
                i15 = c10;
                read2 = mVar.read();
            }
            if (read == i17 || read2 == i17) {
                j12 = length;
            } else {
                if (read == 255 && (read2 & hs.B3) == 224) {
                    int read11 = sVar2.a(mVar) ? -1 : mVar.read();
                    int read12 = sVar2.a(mVar) ? -1 : mVar.read();
                    j12 = length;
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
                            bArr3[c2] = (byte) read12;
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
                            tVar = new t(23, kVar, bArr3);
                            if (tVar == null) {
                                return (((length2 * 1000) * i26) * 8) / j15;
                            }
                            int a11 = ((k) tVar.c).a();
                            if (a11 != a10) {
                                i25 = i11;
                            }
                            j15 += a11;
                            length2 += ((byte[]) tVar.b).length;
                            i26++;
                            sVar2 = sVar;
                            i12 = i16;
                            i3 = i14;
                            c10 = i15;
                            length = j12;
                            i17 = -1;
                        }
                    }
                } else {
                    j12 = length;
                    i16 = i12;
                }
                mVar.reset();
                tVar = null;
                if (tVar == null) {
                }
            }
            i16 = i12;
            tVar = null;
            if (tVar == null) {
            }
        }
    }
}
