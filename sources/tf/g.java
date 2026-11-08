package tf;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.EOFException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.vy;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class g extends rf.a {
    public static final Logger s = Logger.getLogger(g.class.getName());
    public byte r;

    public static boolean b(m mVar) {
        boolean z9;
        mVar.mark(3);
        try {
            if (mVar.read() == 73 && mVar.read() == 68) {
                if (mVar.read() == 51) {
                    z9 = true;
                    return z9;
                }
            }
            z9 = false;
            return z9;
        } finally {
            mVar.reset();
        }
    }

    public static f5.a c(e eVar) {
        b b10 = eVar.b();
        eVar.c(3, b.c);
        return new f5.a(eVar.d(qs.e3, b10), eVar.c((int) eVar.a.e(), b10), false);
    }

    public static String e(e eVar) {
        return eVar.c((int) eVar.a.e(), eVar.b());
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x0451 A[Catch: all -> 0x0435, TryCatch #3 {all -> 0x0435, blocks: (B:268:0x041e, B:270:0x0430, B:273:0x0447, B:275:0x0451, B:277:0x0468, B:278:0x0485, B:280:0x0489, B:282:0x0481, B:285:0x0437, B:287:0x043f), top: B:267:0x041e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(e eVar) {
        int i7;
        String str;
        BitmapFactory.Options options;
        int i10;
        Bitmap decodeByteArray;
        int i11;
        f fVar = eVar.c;
        Level level = Level.FINEST;
        Logger logger = s;
        if (logger.isLoggable(level)) {
            logger.log(level, "Parsing frame: " + fVar.a);
        }
        String str2 = fVar.a;
        str2.getClass();
        i7 = 0;
        switch (str2) {
            case "COM":
            case "COMM":
                f5.a c10 = c(eVar);
                if (this.i == null || (str = c10.a) == null || "".equals(str)) {
                    this.i = c10.b;
                    return;
                }
                return;
            case "PIC":
            case "APIC":
                if (this.o == null || this.r != 3) {
                    b b10 = eVar.b();
                    vy vyVar = eVar.d;
                    if (eVar.b.a == 2) {
                        eVar.c(3, b.c).toUpperCase().getClass();
                    } else {
                        eVar.d(20, b.c);
                    }
                    byte M = vyVar.M();
                    eVar.d(qs.e3, b10);
                    int e10 = (int) eVar.a.e();
                    byte[] bArr = new byte[e10];
                    int i12 = 0;
                    while (i12 < e10) {
                        int read = ((ab.d) vyVar.b).read(bArr, i12, e10 - i12);
                        if (read <= 0) {
                            throw new EOFException();
                        }
                        i12 += read;
                    }
                    if (this.o == null || M == 3 || M == 0) {
                        try {
                            options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            options.inSampleSize = 1;
                            BitmapFactory.decodeByteArray(bArr, 0, e10, options);
                            i10 = options.outWidth;
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                        }
                        if (i10 <= 800) {
                            if (options.outHeight > 800) {
                            }
                            options.inJustDecodeBounds = false;
                            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, e10, options);
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
                            this.r = M;
                            return;
                        }
                        for (int max2 = Math.max(i10, options.outHeight); max2 > 800; max2 /= 2) {
                            options.inSampleSize *= 2;
                        }
                        options.inJustDecodeBounds = false;
                        decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, e10, options);
                        this.o = decodeByteArray;
                        if (decodeByteArray != null) {
                        }
                        this.r = M;
                        return;
                    }
                    return;
                }
                return;
            case "TAL":
            case "TALB":
                this.f = e(eVar);
                return;
            case "TCM":
            case "TCOM":
                this.m = e(eVar);
                return;
            case "TCO":
            case "TCON":
                String e11 = e(eVar);
                if (e11.length() > 0) {
                    this.h = e11;
                    try {
                        if (e11.charAt(0) == '(') {
                            int indexOf = e11.indexOf(41);
                            if (indexOf > 1 && (i7 = rf.b.a(Integer.parseInt(e11.substring(1, indexOf)))) == 0 && e11.length() > (i11 = indexOf + 1)) {
                                this.h = e11.substring(i11);
                            }
                        } else {
                            i7 = rf.b.a(Integer.parseInt(e11));
                        }
                        if (i7 != 0) {
                            this.h = rf.b.c(i7);
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
                "1".equals(e(eVar));
                return;
            case "TCR":
            case "TCOP":
                this.l = e(eVar);
                return;
            case "TLE":
            case "TLEN":
                String e12 = e(eVar);
                try {
                    this.b = Long.valueOf(e12).longValue();
                    return;
                } catch (NumberFormatException unused2) {
                    if (logger.isLoggable(level)) {
                        logger.log(level, "Could not parse track duration: " + e12);
                        return;
                    }
                    return;
                }
            case "TP1":
            case "TPE1":
                this.d = e(eVar);
                return;
            case "TP2":
            case "TPE2":
                this.e = e(eVar);
                return;
            case "TPA":
            case "TPOS":
                String e13 = e(eVar);
                if (e13.length() > 0) {
                    int indexOf2 = e13.indexOf(47);
                    if (indexOf2 < 0) {
                        try {
                            this.k = Short.valueOf(e13).shortValue();
                            return;
                        } catch (NumberFormatException unused3) {
                            if (logger.isLoggable(level)) {
                                logger.log(level, "Could not parse disc number: ".concat(e13));
                                return;
                            }
                            return;
                        }
                    }
                    try {
                        this.k = Short.valueOf(e13.substring(0, indexOf2)).shortValue();
                    } catch (NumberFormatException unused4) {
                        if (logger.isLoggable(level)) {
                            logger.log(level, "Could not parse disc number: ".concat(e13));
                        }
                    }
                    try {
                        Short.valueOf(e13.substring(indexOf2 + 1)).getClass();
                        return;
                    } catch (NumberFormatException unused5) {
                        if (logger.isLoggable(level)) {
                            logger.log(level, "Could not parse number of discs: ".concat(e13));
                            return;
                        }
                        return;
                    }
                }
                return;
            case "TRK":
            case "TRCK":
                String e14 = e(eVar);
                if (e14.length() > 0) {
                    int indexOf3 = e14.indexOf(47);
                    if (indexOf3 < 0) {
                        try {
                            this.j = Short.valueOf(e14).shortValue();
                            return;
                        } catch (NumberFormatException unused6) {
                            if (logger.isLoggable(level)) {
                                logger.log(level, "Could not parse track number: ".concat(e14));
                                return;
                            }
                            return;
                        }
                    }
                    try {
                        this.j = Short.valueOf(e14.substring(0, indexOf3)).shortValue();
                    } catch (NumberFormatException unused7) {
                        if (logger.isLoggable(level)) {
                            logger.log(level, "Could not parse track number: ".concat(e14));
                        }
                    }
                    try {
                        Short.valueOf(e14.substring(indexOf3 + 1)).getClass();
                        return;
                    } catch (NumberFormatException unused8) {
                        if (logger.isLoggable(level)) {
                            logger.log(level, "Could not parse number of tracks: ".concat(e14));
                            return;
                        }
                        return;
                    }
                }
                return;
            case "TT1":
            case "TIT1":
                e(eVar);
                return;
            case "TT2":
            case "TIT2":
                this.c = e(eVar);
                return;
            case "TYE":
            case "TYER":
                String e15 = e(eVar);
                if (e15.length() > 0) {
                    try {
                        this.g = Short.valueOf(e15).shortValue();
                        return;
                    } catch (NumberFormatException unused9) {
                        if (logger.isLoggable(level)) {
                            logger.log(level, "Could not parse year: ".concat(e15));
                            return;
                        }
                        return;
                    }
                }
                return;
            case "ULT":
            case "USLT":
                if (this.n == null) {
                    this.n = c(eVar).b;
                    return;
                }
                return;
            case "TDRC":
                String e16 = e(eVar);
                if (e16.length() >= 4) {
                    try {
                        this.g = Short.valueOf(e16.substring(0, 4)).shortValue();
                        return;
                    } catch (NumberFormatException unused10) {
                        if (logger.isLoggable(level)) {
                            logger.log(level, "Could not parse year from: ".concat(e16));
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
