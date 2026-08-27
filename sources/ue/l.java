package ue;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import m3.n;
import org.telegram.ui.i6;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class l extends se.a {
    public static final Logger r = Logger.getLogger(l.class.getName());

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01fc, code lost:
    
        if (r0.charAt(r14) <= 'Z') goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0231, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0284, code lost:
    
        if (r12.isLoggable(r5) != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0286, code lost:
    
        r12.log(r5, "ID3 exception occured: " + r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0214, code lost:
    
        r16 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0218, code lost:
    
        if (r10.e <= 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x021c, code lost:
    
        if (r10.f != false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x021e, code lost:
    
        r9 = r6.f(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0222, code lost:
    
        r13.d(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0225, code lost:
    
        r0 = r9.d;
        r9 = r9.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0233, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0265, code lost:
    
        r9.d.o0(r9.a.e());
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0270, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0235, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x023a, code lost:
    
        if (r12.isLoggable(r5) != false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x023c, code lost:
    
        r12.log(r5, "ID3 exception occured in frame " + ((java.lang.String) r10.h) + ": " + r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0260, code lost:
    
        r0 = r9.d;
        r9 = r9.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01d1, code lost:
    
        if (r12.isLoggable(r5) == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01d3, code lost:
    
        r12.log(r5, "ID3 frame claims to extend frames area");
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01d8, code lost:
    
        r16 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01dc, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01dd, code lost:
    
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
    
        if (r14 >= r0.length()) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01f0, code lost:
    
        r16 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01f4, code lost:
    
        if (r0.charAt(r14) < 'A') goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0204, code lost:
    
        if (r0.charAt(r14) < '0') goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x020c, code lost:
    
        if (r0.charAt(r14) <= '9') goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0271, code lost:
    
        r8.o0(r10.e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x020f, code lost:
    
        r14 = r14 + 1;
        r9 = r16;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:242:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:249:? A[RETURN, SYNTHETIC] */
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
        g gVar2;
        byte b11;
        byte b12;
        u2.b bVar;
        Logger logger;
        ve.a aVar;
        ve.a aVar2;
        n1.d dVar;
        ve.a aVar3;
        Level level = Level.FINEST;
        this.a = "MP3";
        m mVar = new m(bufferedInputStream);
        mVar.d = 0;
        if (g.b(mVar)) {
            Logger logger2 = g.s;
            gVar = new g();
            if (g.b(mVar)) {
                com.google.firebase.messaging.d dVar2 = new com.google.firebase.messaging.d((FilterInputStream) mVar);
                h hVar = new h();
                hVar.a = 0;
                hVar.b = 0;
                hVar.c = 0;
                long j11 = dVar2.b;
                n1.d dVar3 = new n1.d(dVar2, 23);
                byte[] bArr = new byte[3];
                int i10 = 0;
                for (int i11 = 3; i10 < i11; i11 = 3) {
                    long j12 = j11;
                    int read = ((com.google.firebase.messaging.d) dVar3.b).read(bArr, i10, 3 - i10);
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
                byte a02 = dVar3.a0();
                hVar.a = a02;
                if (a02 != 2 && a02 != 3 && a02 != 4) {
                    throw new c(i0.a.k(a02, "Unsupported ID3v2 version: "));
                }
                byte a03 = dVar3.a0();
                byte a04 = dVar3.a0();
                int n02 = dVar3.n0();
                hVar.b = n02 + 10;
                if (a02 == 2) {
                    hVar.d = (a04 & 128) != 0;
                    hVar.e = (a04 & 64) != 0;
                    b11 = a03;
                } else {
                    hVar.d = (a04 & 128) != 0;
                    if ((a04 & 64) == 0) {
                        b11 = a03;
                        b12 = a04;
                    } else if (a02 == 3) {
                        int g02 = dVar3.g0();
                        dVar3.a0();
                        dVar3.a0();
                        dVar3.g0();
                        b11 = a03;
                        b12 = a04;
                        dVar3.o0(g02 - 6);
                    } else {
                        b11 = a03;
                        b12 = a04;
                        dVar3.o0(dVar3.n0() - 4);
                    }
                    if (a02 >= 4 && (b12 & 16) != 0) {
                        hVar.c = 10;
                        hVar.b = n02 + 20;
                    }
                }
                int i12 = (int) (dVar2.b - j13);
                gVar.a = "ID3";
                String.format("2.%d.%d", Integer.valueOf(a02), Integer.valueOf(b11));
                int i13 = hVar.b;
                if (hVar.e) {
                    throw new c("Tag compression is not supported");
                }
                if (a02 >= 4 || !hVar.d) {
                    logger = logger2;
                    bVar = new u2.b(mVar, i12, (i13 - i12) - hVar.c, hVar);
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
                    bVar = new u2.b(new ByteArrayInputStream(bArr2, 0, i16), i12, i16, hVar);
                    logger = logger2;
                }
                n1.d dVar4 = (n1.d) bVar.b;
                aVar = (ve.a) bVar.c;
                while (aVar.e() > 10) {
                    try {
                        f fVar = new f(bVar);
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
                    } catch (c e9) {
                        e = e9;
                        aVar2 = aVar;
                        gVar2 = gVar;
                    }
                }
                aVar2 = aVar;
                gVar2 = gVar;
                dVar4.o0(aVar2.e());
                int i19 = hVar.c;
                if (i19 > 0) {
                    mVar.skip(i19);
                }
            } else {
                gVar2 = gVar;
            }
            this.f = gVar2.f;
            this.e = gVar2.e;
            this.d = gVar2.d;
            this.i = gVar2.i;
            this.o = gVar2.o;
            this.p = gVar2.p;
            this.m = gVar2.m;
            this.l = gVar2.l;
            this.k = gVar2.k;
            this.b = gVar2.b;
            this.h = gVar2.h;
            this.n = gVar2.n;
            this.c = gVar2.c;
            this.j = gVar2.j;
            this.g = gVar2.g;
        }
        long j14 = this.b;
        if (j14 > 0 || j14 >= 3600000) {
            try {
                n nVar = new n();
                nVar.a = j10 - 128;
                this.b = b(mVar, j10, nVar);
            } catch (i e10) {
                Logger logger3 = r;
                if (logger3.isLoggable(level)) {
                    logger3.log(level, "Could not determine MP3 duration", (Throwable) e10);
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
            int a2 = s3.c.a(bArr3[127]);
            r3 = a2 != 0 ? s3.c.b(a2) : null;
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
        dVar.o0(aVar3.e());
        gVar = gVar2;
        aVar = aVar2;
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
        int i10;
        char c10;
        long j11;
        char c11;
        char c12;
        i6 i6Var;
        int i11;
        int i12;
        int read;
        long j12;
        k kVar;
        byte b10;
        n nVar2 = nVar;
        int i13 = -1;
        int read2 = nVar2.a(mVar) ? -1 : mVar.read();
        int i14 = 0;
        while (true) {
            iArr = k.m;
            i10 = 4;
            if (read2 == -1) {
                break;
            }
            if (i14 == 255 && (read2 & 224) == 224) {
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
                int i15 = b11 - 2;
                int i16 = 0;
                while (i16 < i15) {
                    c11 = 3;
                    try {
                        int read5 = mVar.read(bArr, 2 + i16, i15 - i16);
                        if (read5 <= 0) {
                            throw new EOFException();
                        }
                        i16 += read5;
                    } catch (EOFException unused) {
                        c12 = 1;
                        i6Var = null;
                        if (i6Var != null) {
                        }
                    }
                }
                c11 = 3;
                i6Var = new i6(25, kVar2, bArr);
                if (kVar2.g == 0 && kVar2.b == 1) {
                    j jVar = new j();
                    jVar.a = (short) -1;
                    jVar.a(bArr[2]);
                    jVar.a(bArr[3]);
                    c12 = 1;
                    int i17 = iArr[kVar2.e][kVar2.a];
                    for (int i18 = 0; i18 < i17; i18++) {
                        jVar.a(bArr[i18 + 6]);
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
            read2 = nVar2.a(mVar) ? -1 : mVar.read();
        }
        if (i6Var != null) {
            throw new i("No audio frame");
        }
        byte[] bArr2 = (byte[]) i6Var.b;
        k kVar3 = (k) i6Var.c;
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
        int c13 = 10000 / ((int) kVar3.c(kVar3.b()));
        int i21 = 1;
        boolean z10 = false;
        while (true) {
            k kVar4 = (k) i6Var.c;
            if (i21 == c13 && !z10 && j10 > j11) {
                return kVar4.c(j10 - length);
            }
            mVar.mark(i10);
            int read10 = nVar2.a(mVar) ? -1 : mVar.read();
            if (nVar2.a(mVar)) {
                i12 = c13;
                read = -1;
            } else {
                i12 = c13;
                read = mVar.read();
            }
            if (read10 == i13 || read == i13) {
                j12 = length;
            } else {
                if (read10 == 255 && (read & 224) == 224) {
                    int read11 = nVar2.a(mVar) ? -1 : mVar.read();
                    int read12 = nVar2.a(mVar) ? -1 : mVar.read();
                    j12 = length;
                    if (read11 != -1 && read12 != -1) {
                        try {
                            kVar = new k(read, read11, read12);
                        } catch (i e9) {
                            int i22 = mVar.d + 1;
                            mVar.d = i22;
                            if (i22 > 5) {
                                throw e9;
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
                            i6Var = new i6(25, kVar, bArr3);
                            if (i6Var == null) {
                                return (((length2 * 1000) * i21) * 8) / j15;
                            }
                            int a3 = ((k) i6Var.c).a();
                            if (a3 != a2) {
                                z10 = true;
                            }
                            j15 += a3;
                            length2 += ((byte[]) i6Var.b).length;
                            i21++;
                            nVar2 = nVar;
                            c13 = i12;
                            length = j12;
                            i13 = -1;
                            i10 = 4;
                        }
                    }
                } else {
                    j12 = length;
                }
                mVar.reset();
                i6Var = null;
                if (i6Var == null) {
                }
            }
            i6Var = null;
            if (i6Var == null) {
            }
        }
    }
}
