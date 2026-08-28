package te;

import j3.r0;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import m3.n;
import n2.p;
import org.telegram.ui.Cells.e3;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class l extends re.a {
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
    
        r9 = r6.d(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0222, code lost:
    
        r13.d(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0258, code lost:
    
        r9.d.P(r9.a.e());
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
    
        r9.d.P(r9.a.e());
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
    
        r8.P(r10.e);
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
        t5.c cVar;
        Logger logger;
        ue.a aVar;
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
                p pVar = new p(dVar, 22);
                byte[] bArr = new byte[3];
                int i9 = 0;
                for (int i10 = 3; i9 < i10; i10 = 3) {
                    long j12 = j11;
                    int read = ((com.google.firebase.messaging.d) pVar.b).read(bArr, i9, 3 - i9);
                    if (read <= 0) {
                        throw new EOFException();
                    }
                    i9 += read;
                    j11 = j12;
                }
                long j13 = j11;
                String str5 = new String(bArr, "ISO-8859-1");
                if (!"ID3".equals(str5)) {
                    throw new c("Invalid ID3 identifier: ".concat(str5));
                }
                byte L = pVar.L();
                hVar.a = L;
                if (L != 2 && L != 3 && L != 4) {
                    throw new c(r0.l(L, "Unsupported ID3v2 version: "));
                }
                byte L2 = pVar.L();
                byte L3 = pVar.L();
                int N = pVar.N();
                hVar.b = N + 10;
                if (L == 2) {
                    hVar.d = (L3 & 128) != 0;
                    hVar.e = (L3 & 64) != 0;
                    b11 = L2;
                } else {
                    hVar.d = (L3 & 128) != 0;
                    if ((L3 & 64) == 0) {
                        b11 = L2;
                        b12 = L3;
                    } else if (L == 3) {
                        int M = pVar.M();
                        pVar.L();
                        pVar.L();
                        pVar.M();
                        b11 = L2;
                        b12 = L3;
                        pVar.P(M - 6);
                    } else {
                        b11 = L2;
                        b12 = L3;
                        pVar.P(pVar.N() - 4);
                    }
                    if (L >= 4 && (b12 & 16) != 0) {
                        hVar.c = 10;
                        hVar.b = N + 20;
                    }
                }
                int i11 = (int) (dVar.b - j13);
                gVar2.a = "ID3";
                String.format("2.%d.%d", Integer.valueOf(L), Integer.valueOf(b11));
                int i12 = hVar.b;
                if (hVar.e) {
                    throw new c("Tag compression is not supported");
                }
                if (L >= 4 || !hVar.d) {
                    logger = logger2;
                    cVar = new t5.c(mVar, i11, (i12 - i11) - hVar.c, hVar);
                } else {
                    int i13 = i12 - i11;
                    byte[] bArr2 = new byte[i13];
                    int i14 = 0;
                    while (i14 < i13) {
                        int read2 = mVar.read(bArr2, i14, i13 - i14);
                        if (read2 <= 0) {
                            throw new EOFException();
                        }
                        i14 += read2;
                    }
                    boolean z10 = false;
                    int i15 = 0;
                    for (int i16 = 0; i16 < i13; i16++) {
                        byte b13 = bArr2[i16];
                        if (!z10 || b13 != 0) {
                            bArr2[i15] = b13;
                            i15++;
                        }
                        z10 = b13 == -1;
                    }
                    cVar = new t5.c(new ByteArrayInputStream(bArr2, 0, i15), i11, i15, hVar);
                    logger = logger2;
                }
                p pVar2 = (p) cVar.d;
                ue.a aVar2 = (ue.a) cVar.b;
                while (aVar2.e() > 10) {
                    try {
                        f fVar = new f(cVar);
                        String str6 = (String) fVar.h;
                        int i17 = 0;
                        while (true) {
                            if (i17 >= str6.length()) {
                                if (fVar.e == 0) {
                                    break;
                                }
                            } else if (str6.charAt(0) != 0) {
                                break;
                            } else {
                                i17++;
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
                pVar2.P(aVar.e());
                int i18 = hVar.c;
                if (i18 > 0) {
                    mVar.skip(i18);
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
                n nVar = new n();
                nVar.a = j10 - 128;
                this.b = b(mVar, j10, nVar);
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
            int i19 = 0;
            while (i19 < 128) {
                int read3 = bufferedInputStream.read(bArr3, i19, 128 - i19);
                if (read3 <= 0) {
                    throw new EOFException();
                }
                i19 += read3;
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
            int a2 = ta.b.a(bArr3[127]);
            r3 = a2 != 0 ? ta.b.b(a2) : null;
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
    public static long b(m mVar, long j10, n nVar) {
        int[][] iArr;
        int i9;
        char c10;
        long j11;
        char c11;
        char c12;
        e3 e3Var;
        int i10;
        int i11;
        int read;
        long j12;
        k kVar;
        byte b10;
        n nVar2 = nVar;
        int i12 = -1;
        int read2 = nVar2.a(mVar) ? -1 : mVar.read();
        int i13 = 0;
        while (true) {
            iArr = k.m;
            i9 = 4;
            if (read2 == -1) {
                break;
            }
            if (i13 == 255 && (read2 & 224) == 224) {
                mVar.mark(2);
                int read3 = nVar2.a(mVar) ? -1 : mVar.read();
                if (read3 == -1) {
                    break;
                }
                int read4 = nVar2.a(mVar) ? -1 : mVar.read();
                c10 = 2;
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
                int i14 = b11 - 2;
                int i15 = 0;
                while (i15 < i14) {
                    c11 = 3;
                    try {
                        int read5 = mVar.read(bArr, 2 + i15, i14 - i15);
                        if (read5 <= 0) {
                            throw new EOFException();
                        }
                        i15 += read5;
                    } catch (EOFException unused) {
                        c12 = 1;
                        e3Var = null;
                        if (e3Var != null) {
                        }
                    }
                }
                c11 = 3;
                e3Var = new e3(24, kVar2, bArr);
                if (kVar2.g == 0 && kVar2.b == 1) {
                    j jVar = new j();
                    jVar.a = (short) -1;
                    jVar.a(bArr[2]);
                    jVar.a(bArr[3]);
                    c12 = 1;
                    int i16 = iArr[kVar2.e][kVar2.a];
                    for (int i17 = 0; i17 < i16; i17++) {
                        jVar.a(bArr[i17 + 6]);
                    }
                } else {
                    c12 = 1;
                }
                int read6 = nVar2.a(mVar) ? -1 : mVar.read();
                int read7 = nVar2.a(mVar) ? -1 : mVar.read();
                if (read6 == -1 || read7 == -1) {
                    break;
                }
                if (read6 == 255 && (read7 & 254) == (read2 & 254)) {
                    int read8 = nVar2.a(mVar) ? -1 : mVar.read();
                    int read9 = nVar2.a(mVar) ? -1 : mVar.read();
                    if (read8 == -1 || read9 == -1) {
                        break;
                    }
                    if (new k(read7, read8, read9).d(kVar2)) {
                        mVar.reset();
                        long j13 = i14;
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
            i13 = read2;
            read2 = nVar2.a(mVar) ? -1 : mVar.read();
        }
        if (e3Var != null) {
            throw new i("No audio frame");
        }
        byte[] bArr2 = (byte[]) e3Var.b;
        k kVar3 = (k) e3Var.c;
        int i18 = iArr[kVar3.e][kVar3.a];
        int i19 = i18 + 4;
        if (bArr2.length >= i18 + 16 && i19 >= 0 && bArr2.length >= i18 + 12 && (((b10 = bArr2[i19]) == 88 && bArr2[i18 + 5] == 105 && bArr2[i18 + 6] == 110 && bArr2[i18 + 7] == 103) || (b10 == 73 && bArr2[i18 + 5] == 110 && bArr2[i18 + 6] == 102 && bArr2[i18 + 7] == 111))) {
            if ((bArr2[i18 + 11] & 1) != 0) {
                i10 = (bArr2[i18 + 15] & 255) | ((bArr2[i18 + 12] & 255) << 24) | ((bArr2[i18 + 13] & 255) << 16) | ((bArr2[i18 + 14] & 255) << 8);
            }
            i10 = -1;
        } else {
            if (bArr2.length >= 62 && bArr2[36] == 86 && bArr2[37] == 66 && bArr2[38] == 82 && bArr2[39] == 73) {
                i10 = ((bArr2[50] & 255) << 24) | ((bArr2[51] & 255) << 16) | ((bArr2[52] & 255) << 8) | (bArr2[53] & 255);
            }
            i10 = -1;
        }
        if (i10 > 0) {
            return kVar3.c(i10 * bArr2.length);
        }
        long length = mVar.b - bArr2.length;
        long length2 = bArr2.length;
        int a2 = kVar3.a();
        long j15 = a2;
        int c13 = 10000 / ((int) kVar3.c(kVar3.b()));
        int i20 = 1;
        boolean z10 = false;
        while (true) {
            k kVar4 = (k) e3Var.c;
            if (i20 == c13 && !z10 && j10 > j11) {
                return kVar4.c(j10 - length);
            }
            mVar.mark(i9);
            int read10 = nVar2.a(mVar) ? -1 : mVar.read();
            if (nVar2.a(mVar)) {
                i11 = c13;
                read = -1;
            } else {
                i11 = c13;
                read = mVar.read();
            }
            if (read10 == i12 || read == i12) {
                j12 = length;
            } else {
                if (read10 == 255 && (read & 224) == 224) {
                    int read11 = nVar2.a(mVar) ? -1 : mVar.read();
                    int read12 = nVar2.a(mVar) ? -1 : mVar.read();
                    j12 = length;
                    if (read11 != -1 && read12 != -1) {
                        try {
                            kVar = new k(read, read11, read12);
                        } catch (i e10) {
                            int i21 = mVar.d + 1;
                            mVar.d = i21;
                            if (i21 > 5) {
                                throw e10;
                            }
                            kVar = null;
                        }
                        if (kVar != null && kVar.d(kVar4)) {
                            int b12 = kVar.b();
                            byte[] bArr3 = new byte[b12];
                            bArr3[0] = (byte) read10;
                            bArr3[c12] = (byte) read;
                            bArr3[c10] = (byte) read11;
                            bArr3[c11] = (byte) read12;
                            int i22 = b12 - 4;
                            int i23 = 0;
                            while (i23 < i22) {
                                try {
                                    int read13 = mVar.read(bArr3, 4 + i23, i22 - i23);
                                    if (read13 <= 0) {
                                        throw new EOFException();
                                    }
                                    i23 += read13;
                                } catch (EOFException unused2) {
                                }
                            }
                            e3Var = new e3(24, kVar, bArr3);
                            if (e3Var == null) {
                                return (((length2 * 1000) * i20) * 8) / j15;
                            }
                            int a3 = ((k) e3Var.c).a();
                            if (a3 != a2) {
                                z10 = true;
                            }
                            j15 += a3;
                            length2 += ((byte[]) e3Var.b).length;
                            i20++;
                            nVar2 = nVar;
                            c13 = i11;
                            length = j12;
                            i12 = -1;
                            i9 = 4;
                        }
                    }
                } else {
                    j12 = length;
                }
                mVar.reset();
                e3Var = null;
                if (e3Var == null) {
                }
            }
            e3Var = null;
            if (e3Var == null) {
            }
        }
    }
}
