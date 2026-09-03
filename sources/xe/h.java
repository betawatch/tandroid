package xe;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.EOFException;
import java.util.logging.Level;
import java.util.logging.Logger;
import vh.w2;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class h extends ve.a {
    public static final Logger s = Logger.getLogger(h.class.getName());
    public byte r;

    public static boolean b(n nVar) {
        boolean z4;
        nVar.mark(3);
        try {
            if (nVar.read() == 73 && nVar.read() == 68) {
                if (nVar.read() == 51) {
                    z4 = true;
                    return z4;
                }
            }
            z4 = false;
            return z4;
        } finally {
            nVar.reset();
        }
    }

    public static b6.h c(f fVar) {
        c b10 = fVar.b();
        fVar.c(3, c.c);
        return new b6.h(5, fVar.d(200, b10), fVar.c((int) fVar.a.e(), b10));
    }

    public static String e(f fVar) {
        return fVar.c((int) fVar.a.e(), fVar.b());
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x0460 A[Catch: all -> 0x0443, TryCatch #1 {all -> 0x0443, blocks: (B:268:0x042c, B:270:0x043e, B:273:0x0456, B:275:0x0460, B:277:0x0477, B:278:0x0494, B:280:0x0498, B:282:0x0490, B:285:0x0445, B:287:0x044d), top: B:267:0x042c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(f fVar) {
        int i10;
        String str;
        BitmapFactory.Options options;
        int i11;
        Bitmap decodeByteArray;
        int i12;
        g gVar = fVar.c;
        Level level = Level.FINEST;
        Logger logger = s;
        if (logger.isLoggable(level)) {
            logger.log(level, "Parsing frame: " + ((String) gVar.h));
        }
        String str2 = (String) gVar.h;
        str2.getClass();
        i10 = 0;
        switch (str2) {
            case "COM":
            case "COMM":
                b6.h c3 = c(fVar);
                if (this.i == null || (str = c3.b) == null || "".equals(str)) {
                    this.i = c3.c;
                    return;
                }
                return;
            case "PIC":
            case "APIC":
                if (this.o == null || this.r != 3) {
                    c b10 = fVar.b();
                    b bVar = fVar.d;
                    if (fVar.b.a == 2) {
                        fVar.c(3, c.c).toUpperCase().getClass();
                    } else {
                        fVar.d(20, c.c);
                    }
                    byte a2 = bVar.a();
                    fVar.d(200, b10);
                    int e = (int) fVar.a.e();
                    byte[] bArr = new byte[e];
                    int i13 = 0;
                    while (i13 < e) {
                        int read = ((com.google.firebase.messaging.d) bVar.a).read(bArr, i13, e - i13);
                        if (read <= 0) {
                            throw new EOFException();
                        }
                        i13 += read;
                    }
                    if (this.o == null || a2 == 3 || a2 == 0) {
                        try {
                            options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            options.inSampleSize = 1;
                            BitmapFactory.decodeByteArray(bArr, 0, e, options);
                            i11 = options.outWidth;
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                        }
                        if (i11 <= 800) {
                            if (options.outHeight > 800) {
                            }
                            options.inJustDecodeBounds = false;
                            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, e, options);
                            this.o = decodeByteArray;
                            if (decodeByteArray != null) {
                                float max = Math.max(decodeByteArray.getWidth(), this.o.getHeight()) / 120.0f;
                                if (max > 0.0f) {
                                    this.p = Bitmap.createScaledBitmap(this.o, (int) (r0.getWidth() / max), (int) (this.o.getHeight() / max), true);
                                } else {
                                    this.p = this.o;
                                }
                                if (this.p == null) {
                                    this.p = this.o;
                                }
                            }
                            this.r = a2;
                            return;
                        }
                        for (int max2 = Math.max(i11, options.outHeight); max2 > 800; max2 /= 2) {
                            options.inSampleSize *= 2;
                        }
                        options.inJustDecodeBounds = false;
                        decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, e, options);
                        this.o = decodeByteArray;
                        if (decodeByteArray != null) {
                        }
                        this.r = a2;
                        return;
                    }
                    return;
                }
                return;
            case "TAL":
            case "TALB":
                this.f = e(fVar);
                return;
            case "TCM":
            case "TCOM":
                this.m = e(fVar);
                return;
            case "TCO":
            case "TCON":
                String e6 = e(fVar);
                if (e6.length() > 0) {
                    this.h = e6;
                    try {
                        if (e6.charAt(0) == '(') {
                            int indexOf = e6.indexOf(41);
                            if (indexOf > 1 && (i10 = w2.a(Integer.parseInt(e6.substring(1, indexOf)))) == 0 && e6.length() > (i12 = indexOf + 1)) {
                                this.h = e6.substring(i12);
                            }
                        } else {
                            i10 = w2.a(Integer.parseInt(e6));
                        }
                        if (i10 != 0) {
                            this.h = w2.b(i10);
                            return;
                        }
                        return;
                    } catch (NumberFormatException unused) {
                        return;
                    }
                }
                return;
            case "TCP":
            case "TCMP":
                "1".equals(e(fVar));
                return;
            case "TCR":
            case "TCOP":
                this.l = e(fVar);
                return;
            case "TLE":
            case "TLEN":
                String e10 = e(fVar);
                try {
                    this.b = Long.valueOf(e10).longValue();
                    return;
                } catch (NumberFormatException unused2) {
                    if (logger.isLoggable(level)) {
                        logger.log(level, "Could not parse track duration: " + e10);
                        return;
                    }
                    return;
                }
            case "TP1":
            case "TPE1":
                this.d = e(fVar);
                return;
            case "TP2":
            case "TPE2":
                this.e = e(fVar);
                return;
            case "TPA":
            case "TPOS":
                String e11 = e(fVar);
                if (e11.length() > 0) {
                    int indexOf2 = e11.indexOf(47);
                    if (indexOf2 < 0) {
                        try {
                            this.k = Short.valueOf(e11).shortValue();
                            return;
                        } catch (NumberFormatException unused3) {
                            if (logger.isLoggable(level)) {
                                logger.log(level, "Could not parse disc number: ".concat(e11));
                                return;
                            }
                            return;
                        }
                    }
                    try {
                        this.k = Short.valueOf(e11.substring(0, indexOf2)).shortValue();
                    } catch (NumberFormatException unused4) {
                        if (logger.isLoggable(level)) {
                            logger.log(level, "Could not parse disc number: ".concat(e11));
                        }
                    }
                    try {
                        Short.valueOf(e11.substring(indexOf2 + 1)).getClass();
                        return;
                    } catch (NumberFormatException unused5) {
                        if (logger.isLoggable(level)) {
                            logger.log(level, "Could not parse number of discs: ".concat(e11));
                            return;
                        }
                        return;
                    }
                }
                return;
            case "TRK":
            case "TRCK":
                String e12 = e(fVar);
                if (e12.length() > 0) {
                    int indexOf3 = e12.indexOf(47);
                    if (indexOf3 < 0) {
                        try {
                            this.j = Short.valueOf(e12).shortValue();
                            return;
                        } catch (NumberFormatException unused6) {
                            if (logger.isLoggable(level)) {
                                logger.log(level, "Could not parse track number: ".concat(e12));
                                return;
                            }
                            return;
                        }
                    }
                    try {
                        this.j = Short.valueOf(e12.substring(0, indexOf3)).shortValue();
                    } catch (NumberFormatException unused7) {
                        if (logger.isLoggable(level)) {
                            logger.log(level, "Could not parse track number: ".concat(e12));
                        }
                    }
                    try {
                        Short.valueOf(e12.substring(indexOf3 + 1)).getClass();
                        return;
                    } catch (NumberFormatException unused8) {
                        if (logger.isLoggable(level)) {
                            logger.log(level, "Could not parse number of tracks: ".concat(e12));
                            return;
                        }
                        return;
                    }
                }
                return;
            case "TT1":
            case "TIT1":
                e(fVar);
                return;
            case "TT2":
            case "TIT2":
                this.c = e(fVar);
                return;
            case "TYE":
            case "TYER":
                String e13 = e(fVar);
                if (e13.length() > 0) {
                    try {
                        this.g = Short.valueOf(e13).shortValue();
                        return;
                    } catch (NumberFormatException unused9) {
                        if (logger.isLoggable(level)) {
                            logger.log(level, "Could not parse year: ".concat(e13));
                            return;
                        }
                        return;
                    }
                }
                return;
            case "ULT":
            case "USLT":
                if (this.n == null) {
                    this.n = c(fVar).c;
                    return;
                }
                return;
            case "TDRC":
                String e14 = e(fVar);
                if (e14.length() >= 4) {
                    try {
                        this.g = Short.valueOf(e14.substring(0, 4)).shortValue();
                        return;
                    } catch (NumberFormatException unused10) {
                        if (logger.isLoggable(level)) {
                            logger.log(level, "Could not parse year from: ".concat(e14));
                            return;
                        }
                        return;
                    }
                }
                return;
            default:
                return;
        }
    }
}
