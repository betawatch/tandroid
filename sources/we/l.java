package we;

import j7.l1;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.telegram.ui.Components.n;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class l extends ue.a {
    public static final Logger r = Logger.getLogger(l.class.getName());

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01fc, code lost:
    
        if (r0.charAt(r14) <= 'Z') goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0228, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0281, code lost:
    
        if (r12.isLoggable(r5) != false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0283, code lost:
    
        r12.log(r5, "ID3 exception occured: " + r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0214, code lost:
    
        r16 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0218, code lost:
    
        if (r10.e <= 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x021c, code lost:
    
        if (r10.f != false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x021e, code lost:
    
        r9 = r6.f(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0222, code lost:
    
        r13.d(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0258, code lost:
    
        r9.d.v(r9.a.e());
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x022c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0231, code lost:
    
        if (r12.isLoggable(r5) != false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0233, code lost:
    
        r12.log(r5, "ID3 exception occured in frame " + ((java.lang.String) r10.h) + ": " + r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x022a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0266, code lost:
    
        r9.d.v(r9.a.e());
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0271, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01d1, code lost:
    
        if (r12.isLoggable(r5) == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01d3, code lost:
    
        r12.log(r5, "ID3 frame claims to extend frames area");
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01d8, code lost:
    
        r16 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01dc, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01dd, code lost:
    
        r16 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01c3, code lost:
    
        r13 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cb, code lost:
    
        if (r10.e <= r9.e()) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01e1, code lost:
    
        r0 = (java.lang.String) r10.h;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01ea, code lost:
    
        if (r14 >= r0.length()) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01f0, code lost:
    
        r16 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01f4, code lost:
    
        if (r0.charAt(r14) < 'A') goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0204, code lost:
    
        if (r0.charAt(r14) < '0') goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x020c, code lost:
    
        if (r0.charAt(r14) <= '9') goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0272, code lost:
    
        r8.v(r10.e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0261, code lost:
    
        r15 = r13;
        r9 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x020f, code lost:
    
        r14 = r14 + 1;
        r9 = r16;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:241:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:248:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l(BufferedInputStream bufferedInputStream, long j10) {
        String str;
        String str2;
        String str3;
        String str4;
        short s10;
        short s11;
        byte b10;
        g gVar;
        byte b11;
        byte b12;
        v5.c cVar;
        Logger logger;
        xe.a aVar;
        Level level = Level.FINEST;
        this.a = "MP3";
        m mVar = new m(bufferedInputStream);
        mVar.d = 0;
        if (g.b(mVar)) {
            Logger logger2 = g.s;
            g gVar2 = new g();
            if (g.b(mVar)) {
                com.google.firebase.messaging.d dVar = new com.google.firebase.messaging.d((FilterInputStream) mVar);
                h hVar = new h();
                hVar.a = 0;
                hVar.b = 0;
                hVar.c = 0;
                long j11 = dVar.b;
                n nVar = new n(dVar, 23);
                byte[] bArr = new byte[3];
                int i10 = 0;
                for (int i11 = 3; i10 < i11; i11 = 3) {
                    long j12 = j11;
                    int read = ((com.google.firebase.messaging.d) nVar.b).read(bArr, i10, 3 - i10);
                    if (read <= 0) {
                        throw new EOFException();
                    }
                    i10 += read;
                    j11 = j12;
                }
                long j13 = j11;
                String str5 = new String(bArr, "ISO-8859-1");
                if (!"ID3".equals(str5)) {
                    throw new c("Invalid ID3 identifier: ".concat(str5));
                }
                byte o10 = nVar.o();
                hVar.a = o10;
                if (o10 != 2 && o10 != 3 && o10 != 4) {
                    throw new c(l1.k(o10, "Unsupported ID3v2 version: "));
                }
                byte o11 = nVar.o();
                byte o12 = nVar.o();
                int r6 = nVar.r();
                hVar.b = r6 + 10;
                if (o10 == 2) {
                    hVar.d = (o12 & 128) != 0;
                    hVar.e = (o12 & 64) != 0;
                    b11 = o11;
                } else {
                    hVar.d = (o12 & 128) != 0;
                    if ((o12 & 64) == 0) {
                        b11 = o11;
                        b12 = o12;
                    } else if (o10 == 3) {
                        int p10 = nVar.p();
                        nVar.o();
                        nVar.o();
                        nVar.p();
                        b11 = o11;
                        b12 = o12;
                        nVar.v(p10 - 6);
                    } else {
                        b11 = o11;
                        b12 = o12;
                        nVar.v(nVar.r() - 4);
                    }
                    if (o10 >= 4 && (b12 & 16) != 0) {
                        hVar.c = 10;
                        hVar.b = r6 + 20;
                    }
                }
                int i12 = (int) (dVar.b - j13);
                gVar2.a = "ID3";
                String.format("2.%d.%d", Integer.valueOf(o10), Integer.valueOf(b11));
                int i13 = hVar.b;
                if (hVar.e) {
                    throw new c("Tag compression is not supported");
                }
                if (o10 >= 4 || !hVar.d) {
                    logger = logger2;
                    cVar = new v5.c(mVar, i12, (i13 - i12) - hVar.c, hVar);
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
                    cVar = new v5.c(new ByteArrayInputStream(bArr2, 0, i16), i12, i16, hVar);
                    logger = logger2;
                }
                n nVar2 = (n) cVar.d;
                xe.a aVar2 = (xe.a) cVar.b;
                while (aVar2.e() > 10) {
                    try {
                        f fVar = new f(cVar);
                        String str6 = (String) fVar.h;
                        int i18 = 0;
                        while (true) {
                            if (i18 >= str6.length()) {
                                if (fVar.e == 0) {
                                    break;
                                }
                            } else if (str6.charAt(0) != 0) {
                                break;
                            } else {
                                i18++;
                            }
                        }
                    } catch (c e10) {
                        e = e10;
                        aVar = aVar2;
                        gVar = gVar2;
                    }
                }
                aVar = aVar2;
                gVar = gVar2;
                nVar2.v(aVar.e());
                int i19 = hVar.c;
                if (i19 > 0) {
                    mVar.skip(i19);
                }
            } else {
                gVar = gVar2;
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
        long j14 = this.b;
        if (j14 > 0 || j14 >= 3600000) {
            try {
                o3.n nVar3 = new o3.n();
                nVar3.a = j10 - 128;
                this.b = b(mVar, j10, nVar3);
            } catch (i e11) {
                Logger logger3 = r;
                if (logger3.isLoggable(level)) {
                    logger3.log(level, "Could not determine MP3 duration", (Throwable) e11);
                }
            }
        }
        if (this.c == null && this.f != null && this.d != null) {
            return;
        }
        long j15 = mVar.b;
        long j16 = j10 - 128;
        if (j15 <= j16) {
            return;
        }
        long j17 = j16 - j15;
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
            int i20 = 0;
            while (i20 < 128) {
                int read3 = bufferedInputStream.read(bArr3, i20, 128 - i20);
                if (read3 <= 0) {
                    throw new EOFException();
                }
                i20 += read3;
            }
            String b14 = a.b(3, 30, bArr3);
            str4 = a.b(33, 30, bArr3);
            String b15 = a.b(63, 30, bArr3);
            try {
                s10 = Short.parseShort(a.b(93, 4, bArr3));
            } catch (NumberFormatException unused) {
                s10 = 0;
            }
            str = a.b(97, 30, bArr3);
            int a2 = u3.c.a(bArr3[127]);
            r3 = a2 != 0 ? u3.c.b(a2) : null;
            if (bArr3[125] == 0 && (b10 = bArr3[126]) != 0) {
                s11 = (short) (b10 & 255);
                str3 = b14;
                str2 = r3;
                r3 = b15;
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
                    this.j = s11;
                }
                if (this.g != 0) {
                    this.g = s10;
                    return;
                }
                return;
            }
            str3 = b14;
            str2 = r3;
            r3 = b15;
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            s10 = 0;
        }
        s11 = 0;
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

    /* JADX WARN: Code restructure failed: missing block: B:163:0x00d7, code lost:
    
        if (((r5[5] & 255) | ((r5[4] & 255) << 8)) != r9.a) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0038, code lost:
    
        r19 = 0;
        r21 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0036, code lost:
    
        r18 = 2;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x030c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long b(m mVar, long j10, o3.n nVar) {
        int[][] iArr;
        int i10;
        char c3;
        long j11;
        char c6;
        char c10;
        v5.n nVar2;
        int i11;
        int i12;
        int read;
        long j12;
        k kVar;
        byte b10;
        o3.n nVar3 = nVar;
        int i13 = -1;
        int read2 = nVar3.a(mVar) ? -1 : mVar.read();
        int i14 = 0;
        while (true) {
            iArr = k.m;
            i10 = 4;
            if (read2 == -1) {
                break;
            }
            if (i14 == 255 && (read2 & 224) == 224) {
                mVar.mark(2);
                int read3 = nVar3.a(mVar) ? -1 : mVar.read();
                if (read3 == -1) {
                    break;
                }
                int read4 = nVar3.a(mVar) ? -1 : mVar.read();
                c3 = 2;
                if (read4 == -1) {
                    break;
                }
                j11 = 0;
                k kVar2 = new k(read2, read3, read4);
                mVar.reset();
                mVar.mark(kVar2.b() + 2);
                int b11 = kVar2.b();
                byte[] bArr = new byte[b11];
                bArr[0] = -1;
                bArr[1] = (byte) read2;
                int i15 = b11 - 2;
                int i16 = 0;
                while (i16 < i15) {
                    c6 = 3;
                    try {
                        int read5 = mVar.read(bArr, 2 + i16, i15 - i16);
                        if (read5 <= 0) {
                            throw new EOFException();
                        }
                        i16 += read5;
                    } catch (EOFException unused) {
                        c10 = 1;
                        nVar2 = null;
                        if (nVar2 != null) {
                        }
                    }
                }
                c6 = 3;
                nVar2 = new v5.n(kVar2, bArr, false, 3);
                if (kVar2.g == 0 && kVar2.b == 1) {
                    j jVar = new j();
                    jVar.a = (short) -1;
                    jVar.a(bArr[2]);
                    jVar.a(bArr[3]);
                    c10 = 1;
                    int i17 = iArr[kVar2.e][kVar2.a];
                    for (int i18 = 0; i18 < i17; i18++) {
                        jVar.a(bArr[i18 + 6]);
                    }
                } else {
                    c10 = 1;
                }
                int read6 = nVar3.a(mVar) ? -1 : mVar.read();
                int read7 = nVar3.a(mVar) ? -1 : mVar.read();
                if (read6 == -1 || read7 == -1) {
                    break;
                }
                if (read6 == 255 && (read7 & 254) == (read2 & 254)) {
                    int read8 = nVar3.a(mVar) ? -1 : mVar.read();
                    int read9 = nVar3.a(mVar) ? -1 : mVar.read();
                    if (read8 == -1 || read9 == -1) {
                        break;
                    }
                    if (new k(read7, read8, read9).d(kVar2)) {
                        mVar.reset();
                        long j13 = i15;
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
            i14 = read2;
            read2 = nVar3.a(mVar) ? -1 : mVar.read();
        }
        if (nVar2 != null) {
            throw new i("No audio frame");
        }
        byte[] bArr2 = (byte[]) nVar2.b;
        k kVar3 = (k) nVar2.c;
        int i19 = iArr[kVar3.e][kVar3.a];
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
            return kVar3.c(i11 * bArr2.length);
        }
        long length = mVar.b - bArr2.length;
        long length2 = bArr2.length;
        int a2 = kVar3.a();
        long j15 = a2;
        int c11 = 10000 / ((int) kVar3.c(kVar3.b()));
        int i21 = 1;
        boolean z10 = false;
        while (true) {
            k kVar4 = (k) nVar2.c;
            if (i21 == c11 && !z10 && j10 > j11) {
                return kVar4.c(j10 - length);
            }
            mVar.mark(i10);
            int read10 = nVar3.a(mVar) ? -1 : mVar.read();
            if (nVar3.a(mVar)) {
                i12 = c11;
                read = -1;
            } else {
                i12 = c11;
                read = mVar.read();
            }
            if (read10 == i13 || read == i13) {
                j12 = length;
            } else {
                if (read10 == 255 && (read & 224) == 224) {
                    int read11 = nVar3.a(mVar) ? -1 : mVar.read();
                    int read12 = nVar3.a(mVar) ? -1 : mVar.read();
                    j12 = length;
                    if (read11 != -1 && read12 != -1) {
                        try {
                            kVar = new k(read, read11, read12);
                        } catch (i e10) {
                            int i22 = mVar.d + 1;
                            mVar.d = i22;
                            if (i22 > 5) {
                                throw e10;
                            }
                            kVar = null;
                        }
                        if (kVar != null && kVar.d(kVar4)) {
                            int b12 = kVar.b();
                            byte[] bArr3 = new byte[b12];
                            bArr3[0] = (byte) read10;
                            bArr3[c10] = (byte) read;
                            bArr3[c3] = (byte) read11;
                            bArr3[c6] = (byte) read12;
                            int i23 = b12 - 4;
                            int i24 = 0;
                            while (i24 < i23) {
                                try {
                                    int read13 = mVar.read(bArr3, 4 + i24, i23 - i24);
                                    if (read13 <= 0) {
                                        throw new EOFException();
                                    }
                                    i24 += read13;
                                } catch (EOFException unused2) {
                                }
                            }
                            nVar2 = new v5.n(kVar, bArr3, false, 3);
                            if (nVar2 == null) {
                                return (((length2 * 1000) * i21) * 8) / j15;
                            }
                            int a10 = ((k) nVar2.c).a();
                            if (a10 != a2) {
                                z10 = true;
                            }
                            j15 += a10;
                            length2 += ((byte[]) nVar2.b).length;
                            i21++;
                            nVar3 = nVar;
                            c11 = i12;
                            length = j12;
                            i13 = -1;
                            i10 = 4;
                        }
                    }
                } else {
                    j12 = length;
                }
                mVar.reset();
                nVar2 = null;
                if (nVar2 == null) {
                }
            }
            nVar2 = null;
            if (nVar2 == null) {
            }
        }
    }
}
