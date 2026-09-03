package xe;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import kf.k0;
import org.telegram.ui.Components.jb;
import q5.c0;
import vh.w2;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class m extends ve.a {
    public static final Logger r = Logger.getLogger(m.class.getName());

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0212, code lost:
    
        r16 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0216, code lost:
    
        if (r10.e <= 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x021a, code lost:
    
        if (r10.f != false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x021c, code lost:
    
        r9 = r6.h(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0220, code lost:
    
        r13.d(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0256, code lost:
    
        r9.d.d(r9.a.e());
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x022a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x022f, code lost:
    
        if (r12.isLoggable(r5) != false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0231, code lost:
    
        r12.log(r5, "ID3 exception occured in frame " + ((java.lang.String) r10.h) + ": " + r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0228, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0264, code lost:
    
        r9.d.d(r9.a.e());
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x026f, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:241:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:248:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m(BufferedInputStream bufferedInputStream, long j10) {
        long j11;
        long j12;
        long j13;
        String str;
        String str2;
        String str3;
        String str4;
        short s6;
        short s9;
        byte b10;
        h hVar;
        byte b11;
        byte b12;
        s5.m mVar;
        Logger logger;
        ye.a aVar;
        int i10;
        g gVar;
        Level level = Level.FINEST;
        this.a = "MP3";
        n nVar = new n(bufferedInputStream);
        nVar.d = 0;
        if (h.b(nVar)) {
            Logger logger2 = h.s;
            h hVar2 = new h();
            if (h.b(nVar)) {
                com.google.firebase.messaging.d dVar = new com.google.firebase.messaging.d((FilterInputStream) nVar);
                i iVar = new i();
                iVar.a = 0;
                iVar.b = 0;
                iVar.c = 0;
                long j14 = dVar.b;
                b bVar = new b(dVar);
                byte[] bArr = new byte[3];
                int i11 = 0;
                for (int i12 = 3; i11 < i12; i12 = 3) {
                    long j15 = j14;
                    int read = ((com.google.firebase.messaging.d) bVar.a).read(bArr, i11, 3 - i11);
                    if (read <= 0) {
                        throw new EOFException();
                    }
                    i11 += read;
                    j14 = j15;
                }
                long j16 = j14;
                String str5 = new String(bArr, "ISO-8859-1");
                if (!"ID3".equals(str5)) {
                    throw new d("Invalid ID3 identifier: ".concat(str5));
                }
                byte a2 = bVar.a();
                iVar.a = a2;
                if (a2 != 2 && a2 != 3 && a2 != 4) {
                    throw new d(k0.j(a2, "Unsupported ID3v2 version: "));
                }
                byte a10 = bVar.a();
                byte a11 = bVar.a();
                int c3 = bVar.c();
                iVar.b = c3 + 10;
                if (a2 == 2) {
                    iVar.d = (a11 & 128) != 0;
                    iVar.e = (a11 & 64) != 0;
                    b11 = a10;
                } else {
                    iVar.d = (a11 & 128) != 0;
                    if ((a11 & 64) == 0) {
                        b11 = a10;
                        b12 = a11;
                    } else if (a2 == 3) {
                        int b13 = bVar.b();
                        bVar.a();
                        bVar.a();
                        bVar.b();
                        b11 = a10;
                        b12 = a11;
                        bVar.d(b13 - 6);
                    } else {
                        b11 = a10;
                        b12 = a11;
                        bVar.d(bVar.c() - 4);
                    }
                    if (a2 >= 4 && (b12 & 16) != 0) {
                        iVar.c = 10;
                        iVar.b = c3 + 20;
                    }
                }
                int i13 = (int) (dVar.b - j16);
                hVar2.a = "ID3";
                String.format("2.%d.%d", Integer.valueOf(a2), Integer.valueOf(b11));
                int i14 = iVar.b;
                if (iVar.e) {
                    throw new d("Tag compression is not supported");
                }
                if (a2 >= 4 || !iVar.d) {
                    logger = logger2;
                    mVar = new s5.m(nVar, i13, (i14 - i13) - iVar.c, iVar);
                } else {
                    int i15 = i14 - i13;
                    byte[] bArr2 = new byte[i15];
                    int i16 = 0;
                    while (i16 < i15) {
                        int read2 = nVar.read(bArr2, i16, i15 - i16);
                        if (read2 <= 0) {
                            throw new EOFException();
                        }
                        i16 += read2;
                    }
                    boolean z4 = false;
                    int i17 = 0;
                    for (int i18 = 0; i18 < i15; i18++) {
                        byte b14 = bArr2[i18];
                        if (!z4 || b14 != 0) {
                            bArr2[i17] = b14;
                            i17++;
                        }
                        z4 = b14 == -1;
                    }
                    mVar = new s5.m(new ByteArrayInputStream(bArr2, 0, i17), i13, i17, iVar);
                    logger = logger2;
                }
                b bVar2 = (b) mVar.d;
                ye.a aVar2 = (ye.a) mVar.b;
                while (aVar2.e() > 10) {
                    try {
                        gVar = new g(mVar);
                        String str6 = (String) gVar.h;
                        int i19 = 0;
                        while (true) {
                            if (i19 >= str6.length()) {
                                if (gVar.e == 0) {
                                    break;
                                }
                            } else if (str6.charAt(0) != 0) {
                                break;
                            } else {
                                i19++;
                            }
                        }
                        hVar = hVar2;
                        try {
                        } catch (d e) {
                            e = e;
                            aVar = aVar2;
                        }
                    } catch (d e6) {
                        e = e6;
                        aVar = aVar2;
                        hVar = hVar2;
                    }
                    if (gVar.e > aVar2.e()) {
                        if (logger.isLoggable(level)) {
                            logger.log(level, "ID3 frame claims to extend frames area");
                        }
                        aVar = aVar2;
                        bVar2.d(aVar.e());
                        i10 = iVar.c;
                        if (i10 > 0) {
                            nVar.skip(i10);
                        }
                    } else {
                        String str7 = (String) gVar.h;
                        int i20 = 0;
                        while (true) {
                            if (i20 >= str7.length()) {
                                break;
                            }
                            aVar = aVar2;
                            if (str7.charAt(i20) >= 'A') {
                                try {
                                    if (str7.charAt(i20) <= 'Z') {
                                        continue;
                                        i20++;
                                        aVar2 = aVar;
                                    }
                                } catch (d e10) {
                                    e = e10;
                                    if (logger.isLoggable(level)) {
                                        logger.log(level, "ID3 exception occured: " + e.getMessage());
                                    }
                                    bVar2.d(aVar.e());
                                    i10 = iVar.c;
                                    if (i10 > 0) {
                                    }
                                    this.f = hVar.f;
                                    this.e = hVar.e;
                                    this.d = hVar.d;
                                    this.i = hVar.i;
                                    this.o = hVar.o;
                                    this.p = hVar.p;
                                    this.m = hVar.m;
                                    this.l = hVar.l;
                                    this.k = hVar.k;
                                    this.b = hVar.b;
                                    this.h = hVar.h;
                                    this.n = hVar.n;
                                    this.c = hVar.c;
                                    this.j = hVar.j;
                                    this.g = hVar.g;
                                    j11 = this.b;
                                    if (j11 > 0) {
                                    }
                                    try {
                                        jb jbVar = new jb();
                                        jbVar.a = j10 - 128;
                                        this.b = b(nVar, j10, jbVar);
                                    } catch (j e11) {
                                        Logger logger3 = r;
                                        if (logger3.isLoggable(level)) {
                                            logger3.log(level, "Could not determine MP3 duration", (Throwable) e11);
                                        }
                                    }
                                    if (this.c == null) {
                                    }
                                    j12 = nVar.b;
                                    j13 = j10 - 128;
                                    if (j12 <= j13) {
                                    }
                                }
                            }
                            if (str7.charAt(i20) < '0' || str7.charAt(i20) > '9') {
                                break;
                            }
                            i20++;
                            aVar2 = aVar;
                        }
                        bVar2.d(gVar.e);
                        hVar2 = hVar;
                        aVar2 = aVar;
                    }
                }
                aVar = aVar2;
                hVar = hVar2;
                bVar2.d(aVar.e());
                i10 = iVar.c;
                if (i10 > 0) {
                }
            } else {
                hVar = hVar2;
            }
            this.f = hVar.f;
            this.e = hVar.e;
            this.d = hVar.d;
            this.i = hVar.i;
            this.o = hVar.o;
            this.p = hVar.p;
            this.m = hVar.m;
            this.l = hVar.l;
            this.k = hVar.k;
            this.b = hVar.b;
            this.h = hVar.h;
            this.n = hVar.n;
            this.c = hVar.c;
            this.j = hVar.j;
            this.g = hVar.g;
        }
        j11 = this.b;
        if (j11 > 0 || j11 >= 3600000) {
            jb jbVar2 = new jb();
            jbVar2.a = j10 - 128;
            this.b = b(nVar, j10, jbVar2);
        }
        if (this.c == null && this.f != null && this.d != null) {
            return;
        }
        j12 = nVar.b;
        j13 = j10 - 128;
        if (j12 <= j13) {
            return;
        }
        long j17 = j13 - j12;
        long j18 = 0;
        while (j18 < j17) {
            long skip = nVar.skip(j17 - j18);
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
            String b15 = a.b(3, 30, bArr3);
            str4 = a.b(33, 30, bArr3);
            String b16 = a.b(63, 30, bArr3);
            try {
                s6 = Short.parseShort(a.b(93, 4, bArr3));
            } catch (NumberFormatException unused) {
                s6 = 0;
            }
            str = a.b(97, 30, bArr3);
            int a12 = w2.a(bArr3[127]);
            r3 = a12 != 0 ? w2.b(a12) : null;
            if (bArr3[125] == 0 && (b10 = bArr3[126]) != 0) {
                s9 = (short) (b10 & 255);
                str3 = b15;
                str2 = r3;
                r3 = b16;
                if (this.f == null) {
                    this.f = r3;
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
                    this.g = s6;
                    return;
                }
                return;
            }
            str3 = b15;
            str2 = r3;
            r3 = b16;
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            s6 = 0;
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

    /* JADX WARN: Code restructure failed: missing block: B:163:0x00d8, code lost:
    
        if (((r5[5] & 255) | ((r5[4] & 255) << 8)) != r9.a) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0038, code lost:
    
        r19 = 0;
        r21 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0036, code lost:
    
        r18 = 2;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x030e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long b(n nVar, long j10, jb jbVar) {
        int[][] iArr;
        int i10;
        char c3;
        long j11;
        char c10;
        char c11;
        c0 c0Var;
        int i11;
        int i12;
        int read;
        long j12;
        l lVar;
        byte b10;
        jb jbVar2 = jbVar;
        int i13 = -1;
        int read2 = jbVar2.a(nVar) ? -1 : nVar.read();
        int i14 = 0;
        while (true) {
            iArr = l.m;
            i10 = 4;
            if (read2 == -1) {
                break;
            }
            if (i14 == 255 && (read2 & 224) == 224) {
                nVar.mark(2);
                int read3 = jbVar2.a(nVar) ? -1 : nVar.read();
                if (read3 == -1) {
                    break;
                }
                int read4 = jbVar2.a(nVar) ? -1 : nVar.read();
                c3 = 2;
                if (read4 == -1) {
                    break;
                }
                j11 = 0;
                l lVar2 = new l(read2, read3, read4);
                nVar.reset();
                nVar.mark(lVar2.b() + 2);
                int b11 = lVar2.b();
                byte[] bArr = new byte[b11];
                bArr[0] = -1;
                bArr[1] = (byte) read2;
                int i15 = b11 - 2;
                int i16 = 0;
                while (i16 < i15) {
                    c10 = 3;
                    try {
                        int read5 = nVar.read(bArr, 2 + i16, i15 - i16);
                        if (read5 <= 0) {
                            throw new EOFException();
                        }
                        i16 += read5;
                    } catch (EOFException unused) {
                        c11 = 1;
                        c0Var = null;
                        if (c0Var != null) {
                        }
                    }
                }
                c10 = 3;
                c0Var = new c0(lVar2, bArr, false, 19);
                if (lVar2.g == 0 && lVar2.b == 1) {
                    k kVar = new k();
                    kVar.a = (short) -1;
                    kVar.a(bArr[2]);
                    kVar.a(bArr[3]);
                    c11 = 1;
                    int i17 = iArr[lVar2.e][lVar2.a];
                    for (int i18 = 0; i18 < i17; i18++) {
                        kVar.a(bArr[i18 + 6]);
                    }
                } else {
                    c11 = 1;
                }
                int read6 = jbVar2.a(nVar) ? -1 : nVar.read();
                int read7 = jbVar2.a(nVar) ? -1 : nVar.read();
                if (read6 == -1 || read7 == -1) {
                    break;
                }
                if (read6 == 255 && (read7 & 254) == (read2 & 254)) {
                    int read8 = jbVar2.a(nVar) ? -1 : nVar.read();
                    int read9 = jbVar2.a(nVar) ? -1 : nVar.read();
                    if (read8 == -1 || read9 == -1) {
                        break;
                    }
                    if (new l(read7, read8, read9).d(lVar2)) {
                        nVar.reset();
                        long j13 = i15;
                        long j14 = 0;
                        while (j14 < j13) {
                            long skip = nVar.skip(j13 - j14);
                            if (skip <= 0) {
                                throw new EOFException();
                            }
                            j14 += skip;
                        }
                    }
                }
                nVar.reset();
            }
            i14 = read2;
            read2 = jbVar2.a(nVar) ? -1 : nVar.read();
        }
        if (c0Var != null) {
            throw new j("No audio frame");
        }
        byte[] bArr2 = (byte[]) c0Var.c;
        l lVar3 = (l) c0Var.b;
        int i19 = iArr[lVar3.e][lVar3.a];
        int i20 = i19 + 4;
        if (bArr2.length >= i19 + 16 && i20 >= 0 && bArr2.length >= i19 + 12 && (((b10 = bArr2[i20]) == 88 && bArr2[i19 + 5] == 105 && bArr2[i19 + 6] == 110 && bArr2[i19 + 7] == 103) || (b10 == 73 && bArr2[i19 + 5] == 110 && bArr2[i19 + 6] == 102 && bArr2[i19 + 7] == 111))) {
            if ((bArr2[i19 + 11] & 1) != 0) {
                i11 = (bArr2[i19 + 15] & 255) | ((bArr2[i19 + 12] & 255) << 24) | ((bArr2[i19 + 13] & 255) << 16) | ((bArr2[i19 + 14] & 255) << 8);
            }
            i11 = -1;
        } else {
            if (bArr2.length >= 62 && bArr2[36] == 86 && bArr2[37] == 66 && bArr2[38] == 82 && bArr2[39] == 73) {
                i11 = ((bArr2[50] & 255) << 24) | ((bArr2[51] & 255) << 16) | ((bArr2[52] & 255) << 8) | (bArr2[53] & 255);
            }
            i11 = -1;
        }
        if (i11 > 0) {
            return lVar3.c(i11 * bArr2.length);
        }
        long length = nVar.b - bArr2.length;
        long length2 = bArr2.length;
        int a2 = lVar3.a();
        long j15 = a2;
        int c12 = 10000 / ((int) lVar3.c(lVar3.b()));
        int i21 = 1;
        boolean z4 = false;
        while (true) {
            l lVar4 = (l) c0Var.b;
            if (i21 == c12 && !z4 && j10 > j11) {
                return lVar4.c(j10 - length);
            }
            nVar.mark(i10);
            int read10 = jbVar2.a(nVar) ? -1 : nVar.read();
            if (jbVar2.a(nVar)) {
                i12 = c12;
                read = -1;
            } else {
                i12 = c12;
                read = nVar.read();
            }
            if (read10 == i13 || read == i13) {
                j12 = length;
            } else {
                if (read10 == 255 && (read & 224) == 224) {
                    int read11 = jbVar2.a(nVar) ? -1 : nVar.read();
                    int read12 = jbVar2.a(nVar) ? -1 : nVar.read();
                    j12 = length;
                    if (read11 != -1 && read12 != -1) {
                        try {
                            lVar = new l(read, read11, read12);
                        } catch (j e) {
                            int i22 = nVar.d + 1;
                            nVar.d = i22;
                            if (i22 > 5) {
                                throw e;
                            }
                            lVar = null;
                        }
                        if (lVar != null && lVar.d(lVar4)) {
                            int b12 = lVar.b();
                            byte[] bArr3 = new byte[b12];
                            bArr3[0] = (byte) read10;
                            bArr3[c11] = (byte) read;
                            bArr3[c3] = (byte) read11;
                            bArr3[c10] = (byte) read12;
                            int i23 = b12 - 4;
                            int i24 = 0;
                            while (i24 < i23) {
                                try {
                                    int read13 = nVar.read(bArr3, 4 + i24, i23 - i24);
                                    if (read13 <= 0) {
                                        throw new EOFException();
                                    }
                                    i24 += read13;
                                } catch (EOFException unused2) {
                                }
                            }
                            c0Var = new c0(lVar, bArr3, false, 19);
                            if (c0Var == null) {
                                return (((length2 * 1000) * i21) * 8) / j15;
                            }
                            int a10 = ((l) c0Var.b).a();
                            if (a10 != a2) {
                                z4 = true;
                            }
                            j15 += a10;
                            length2 += ((byte[]) c0Var.c).length;
                            i21++;
                            jbVar2 = jbVar;
                            c12 = i12;
                            length = j12;
                            i13 = -1;
                            i10 = 4;
                        }
                    }
                } else {
                    j12 = length;
                }
                nVar.reset();
                c0Var = null;
                if (c0Var == null) {
                }
            }
            c0Var = null;
            if (c0Var == null) {
            }
        }
    }
}
