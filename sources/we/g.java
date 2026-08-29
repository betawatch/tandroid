package we;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.EOFException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.telegram.ui.Components.n;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class g extends ue.a {
    public static final Logger s = Logger.getLogger(g.class.getName());
    public byte r;

    public static boolean b(m mVar) {
        boolean z10;
        mVar.mark(3);
        try {
            if (mVar.read() == 73 && mVar.read() == 68) {
                if (mVar.read() == 51) {
                    z10 = true;
                    return z10;
                }
            }
            z10 = false;
            return z10;
        } finally {
            mVar.reset();
        }
    }

    public static d9.c c(e eVar) {
        b b10 = eVar.b();
        eVar.c(3, b.c);
        return new d9.c(4, eVar.d(200, b10), eVar.c((int) eVar.a.e(), b10));
    }

    public static String e(e eVar) {
        return eVar.c((int) eVar.a.e(), eVar.b());
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x0460 A[Catch: all -> 0x0443, TryCatch #1 {all -> 0x0443, blocks: (B:268:0x042c, B:270:0x043e, B:273:0x0456, B:275:0x0460, B:277:0x0477, B:278:0x0494, B:280:0x0498, B:282:0x0490, B:285:0x0445, B:287:0x044d), top: B:267:0x042c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(e eVar) {
        int i10;
        String str;
        BitmapFactory.Options options;
        int i11;
        Bitmap decodeByteArray;
        int i12;
        f fVar = eVar.c;
        Level level = Level.FINEST;
        Logger logger = s;
        if (logger.isLoggable(level)) {
            logger.log(level, "Parsing frame: " + ((String) fVar.h));
        }
        String str2 = (String) fVar.h;
        str2.getClass();
        i10 = 0;
        switch (str2) {
            case "COM":
            case "COMM":
                d9.c c3 = c(eVar);
                if (this.i == null || (str = c3.b) == null || "".equals(str)) {
                    this.i = c3.c;
                    return;
                }
                return;
            case "PIC":
            case "APIC":
                if (this.o == null || this.r != 3) {
                    b b10 = eVar.b();
                    n nVar = eVar.d;
                    if (eVar.b.a == 2) {
                        eVar.c(3, b.c).toUpperCase().getClass();
                    } else {
                        eVar.d(20, b.c);
                    }
                    byte o10 = nVar.o();
                    eVar.d(200, b10);
                    int e10 = (int) eVar.a.e();
                    byte[] bArr = new byte[e10];
                    int i13 = 0;
                    while (i13 < e10) {
                        int read = ((com.google.firebase.messaging.d) nVar.b).read(bArr, i13, e10 - i13);
                        if (read <= 0) {
                            throw new EOFException();
                        }
                        i13 += read;
                    }
                    if (this.o == null || o10 == 3 || o10 == 0) {
                        try {
                            options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            options.inSampleSize = 1;
                            BitmapFactory.decodeByteArray(bArr, 0, e10, options);
                            i11 = options.outWidth;
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                        }
                        if (i11 <= 800) {
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
                            this.r = o10;
                            return;
                        }
                        for (int max2 = Math.max(i11, options.outHeight); max2 > 800; max2 /= 2) {
                            options.inSampleSize *= 2;
                        }
                        options.inJustDecodeBounds = false;
                        decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, e10, options);
                        this.o = decodeByteArray;
                        if (decodeByteArray != null) {
                        }
                        this.r = o10;
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
                            if (indexOf > 1 && (i10 = u3.c.a(Integer.parseInt(e11.substring(1, indexOf)))) == 0 && e11.length() > (i12 = indexOf + 1)) {
                                this.h = e11.substring(i12);
                            }
                        } else {
                            i10 = u3.c.a(Integer.parseInt(e11));
                        }
                        if (i10 != 0) {
                            this.h = u3.c.b(i10);
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
                    this.n = c(eVar).c;
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
