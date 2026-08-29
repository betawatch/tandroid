package ve;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.firebase.messaging.d;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FilterInputStream;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;
import le.p;
import u3.c;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a extends ue.a {
    public static final Logger s = Logger.getLogger(a.class.getName());
    public final Level r;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0435 A[Catch: Exception -> 0x0418, TryCatch #0 {Exception -> 0x0418, blocks: (B:109:0x03f7, B:111:0x0413, B:114:0x042b, B:116:0x0435, B:118:0x044c, B:119:0x0469, B:121:0x046d, B:122:0x0465, B:126:0x041a, B:128:0x0422), top: B:108:0x03f7 }] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(BufferedInputStream bufferedInputStream) {
        b c3;
        char c6;
        DataInputStream dataInputStream;
        char c10;
        Bitmap decodeByteArray;
        Level level = Level.FINEST;
        this.r = level;
        ?? r6 = 1;
        b bVar = new b(new d((FilterInputStream) bufferedInputStream), null, "", 1 == true ? 1 : 0);
        Logger logger = s;
        if (logger.isLoggable(level)) {
            logger.log(level, bVar.toString());
        }
        b d = bVar.d("ftyp");
        DataInputStream dataInputStream2 = (DataInputStream) d.e;
        if (logger.isLoggable(level)) {
            logger.log(level, d.toString());
        }
        int i10 = 4;
        byte[] bArr = new byte[4];
        dataInputStream2.readFully(bArr);
        String str = new String(bArr, "ISO8859_1");
        int indexOf = str.indexOf(0);
        String trim = (indexOf >= 0 ? str.substring(0, indexOf) : str).trim();
        this.a = trim;
        if (trim.matches("M4V|MP4|mp42|isom")) {
            StringBuilder sb2 = new StringBuilder();
            StringBuffer stringBuffer = new StringBuffer();
            b.h(stringBuffer, d);
            sb2.append(stringBuffer.toString());
            sb2.append(": brand=");
            sb2.append(this.a);
            sb2.append(" (experimental)");
            logger.warning(sb2.toString());
        } else if (!this.a.matches("M4A|M4P")) {
            StringBuilder sb3 = new StringBuilder();
            StringBuffer stringBuffer2 = new StringBuffer();
            b.h(stringBuffer2, d);
            sb3.append(stringBuffer2.toString());
            sb3.append(": brand=");
            sb3.append(this.a);
            sb3.append(" (expected M4A or M4P)");
            logger.warning(sb3.toString());
        }
        String.valueOf(dataInputStream2.readInt());
        do {
            c3 = bVar.c();
        } while (!((String) c3.d).matches("moov"));
        Level level2 = this.r;
        if (logger.isLoggable(level2)) {
            logger.log(level2, c3.toString());
        }
        while (c3.j()) {
            b c11 = c3.c();
            DataInputStream dataInputStream3 = (DataInputStream) c11.e;
            String str2 = (String) c11.d;
            int i11 = 2;
            switch (str2.hashCode()) {
                case 3363941:
                    if (str2.equals("mvhd")) {
                        c6 = 0;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 3568424:
                    if (str2.equals("trak")) {
                        c6 = 1;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 3585340:
                    if (str2.equals("udta")) {
                        c6 = 2;
                        break;
                    }
                    c6 = 65535;
                    break;
                default:
                    c6 = 65535;
                    break;
            }
            switch (c6) {
                case 0:
                    if (logger.isLoggable(level2)) {
                        logger.log(level2, c11.toString());
                    }
                    byte readByte = dataInputStream3.readByte();
                    c11.n(3);
                    c11.n(readByte == r6 ? 16 : 8);
                    int readInt = dataInputStream3.readInt();
                    long readLong = readByte == r6 ? dataInputStream3.readLong() : dataInputStream3.readInt();
                    if (this.b == 0) {
                        this.b = (readLong * 1000) / readInt;
                    } else if (logger.isLoggable(level2)) {
                        dataInputStream = dataInputStream3;
                        long j10 = (readLong * 1000) / readInt;
                        if (Math.abs(this.b - j10) > 2) {
                            logger.log(level2, "mvhd: duration " + this.b + " -> " + j10);
                        }
                        new BigDecimal(String.valueOf((int) dataInputStream.readShort()) + "" + String.valueOf(dataInputStream.readUnsignedShort()));
                        new BigDecimal(String.valueOf((int) dataInputStream.readByte()) + "" + String.valueOf(dataInputStream.readUnsignedByte()));
                        break;
                    }
                    dataInputStream = dataInputStream3;
                    new BigDecimal(String.valueOf((int) dataInputStream.readShort()) + "" + String.valueOf(dataInputStream.readUnsignedShort()));
                    new BigDecimal(String.valueOf((int) dataInputStream.readByte()) + "" + String.valueOf(dataInputStream.readUnsignedByte()));
                case 1:
                    if (logger.isLoggable(level2)) {
                        logger.log(level2, c11.toString());
                    }
                    b k9 = c11.k("mdia");
                    if (logger.isLoggable(level2)) {
                        logger.log(level2, k9.toString());
                    }
                    b d10 = k9.d("mdhd");
                    DataInputStream dataInputStream4 = (DataInputStream) d10.e;
                    if (logger.isLoggable(level2)) {
                        logger.log(level2, d10.toString());
                    }
                    byte readByte2 = dataInputStream4.readByte();
                    d10.n(3);
                    d10.n(readByte2 == r6 ? 16 : 8);
                    int readInt2 = dataInputStream4.readInt();
                    long readLong2 = readByte2 == r6 ? dataInputStream4.readLong() : dataInputStream4.readInt();
                    if (this.b == 0) {
                        this.b = (readLong2 * 1000) / readInt2;
                        break;
                    } else if (logger.isLoggable(level2)) {
                        long j11 = (readLong2 * 1000) / readInt2;
                        if (Math.abs(this.b - j11) > 2) {
                            logger.log(level2, "mdhd: duration " + this.b + " -> " + j11);
                            break;
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                case 2:
                    if (logger.isLoggable(level2)) {
                        logger.log(level2, c11.toString());
                    }
                    while (true) {
                        if (c11.j()) {
                            b c12 = c11.c();
                            if ("meta".equals((String) c12.d)) {
                                if (logger.isLoggable(level2)) {
                                    logger.log(level2, c12.toString());
                                }
                                c12.n(i10);
                                while (true) {
                                    if (c12.j()) {
                                        b c13 = c12.c();
                                        if ("ilst".equals((String) c13.d)) {
                                            if (logger.isLoggable(level2)) {
                                                logger.log(level2, c13.toString());
                                            }
                                            while (c13.j()) {
                                                b c14 = c13.c();
                                                if (logger.isLoggable(level2)) {
                                                    logger.log(level2, c14.toString());
                                                }
                                                if (c14.i() != 0) {
                                                    b k10 = c14.k("data");
                                                    DataInputStream dataInputStream5 = (DataInputStream) k10.e;
                                                    if (logger.isLoggable(level2)) {
                                                        logger.log(level2, k10.toString());
                                                    }
                                                    k10.n(i10);
                                                    k10.n(i10);
                                                    String str3 = (String) ((p) k10.c).d;
                                                    switch (str3.hashCode()) {
                                                        case 2954818:
                                                            if (str3.equals("aART")) {
                                                                c10 = 0;
                                                                break;
                                                            }
                                                            c10 = 65535;
                                                            break;
                                                        case 3059752:
                                                            if (str3.equals("covr")) {
                                                                c10 = 1;
                                                                break;
                                                            }
                                                            c10 = 65535;
                                                            break;
                                                        case 3060304:
                                                            if (str3.equals("cpil")) {
                                                                c10 = 2;
                                                                break;
                                                            }
                                                            c10 = 65535;
                                                            break;
                                                        case 3060591:
                                                            if (str3.equals("cprt")) {
                                                                c10 = 3;
                                                                break;
                                                            }
                                                            c10 = 65535;
                                                            break;
                                                        case 3083677:
                                                            if (str3.equals("disk")) {
                                                                c10 = 4;
                                                                break;
                                                            }
                                                            c10 = 65535;
                                                            break;
                                                        case 3177818:
                                                            if (str3.equals("gnre")) {
                                                                c10 = 5;
                                                                break;
                                                            }
                                                            c10 = 65535;
                                                            break;
                                                        case 3511163:
                                                            if (str3.equals("rtng")) {
                                                                c10 = 6;
                                                                break;
                                                            }
                                                            c10 = 65535;
                                                            break;
                                                        case 3564088:
                                                            if (str3.equals("tmpo")) {
                                                                c10 = 7;
                                                                break;
                                                            }
                                                            c10 = 65535;
                                                            break;
                                                        case 3568737:
                                                            if (str3.equals("trkn")) {
                                                                c10 = '\b';
                                                                break;
                                                            }
                                                            c10 = 65535;
                                                            break;
                                                        case 5099770:
                                                            if (str3.equals("©ART")) {
                                                                c10 = '\t';
                                                                break;
                                                            }
                                                            c10 = 65535;
                                                            break;
                                                        case 5131342:
                                                            if (str3.equals("©alb")) {
                                                                c10 = '\n';
                                                                break;
                                                            }
                                                            c10 = 65535;
                                                            break;
                                                        case 5133313:
                                                            if (str3.equals("©cmt")) {
                                                                c10 = 11;
                                                                break;
                                                            }
                                                            c10 = 65535;
                                                            break;
                                                        case 5133368:
                                                            if (str3.equals("©com")) {
                                                                c10 = '\f';
                                                                break;
                                                            }
                                                            c10 = 65535;
                                                            break;
                                                        case 5133411:
                                                            if (str3.equals("©cpy")) {
                                                                c10 = '\r';
                                                                break;
                                                            }
                                                            c10 = 65535;
                                                            break;
                                                        case 5133907:
                                                            if (str3.equals("©day")) {
                                                                c10 = 14;
                                                                break;
                                                            }
                                                            c10 = 65535;
                                                            break;
                                                        case 5136903:
                                                            if (str3.equals("©gen")) {
                                                                c10 = 15;
                                                                break;
                                                            }
                                                            c10 = 65535;
                                                            break;
                                                        case 5137308:
                                                            if (str3.equals("©grp")) {
                                                                c10 = 16;
                                                                break;
                                                            }
                                                            c10 = 65535;
                                                            break;
                                                        case 5142332:
                                                            if (str3.equals("©lyr")) {
                                                                c10 = 17;
                                                                break;
                                                            }
                                                            c10 = 65535;
                                                            break;
                                                        case 5143505:
                                                            if (str3.equals("©nam")) {
                                                                c10 = 18;
                                                                break;
                                                            }
                                                            c10 = 65535;
                                                            break;
                                                        case 5152688:
                                                            if (str3.equals("©wrt")) {
                                                                c10 = 19;
                                                                break;
                                                            }
                                                            c10 = 65535;
                                                            break;
                                                        default:
                                                            c10 = 65535;
                                                            break;
                                                    }
                                                    switch (c10) {
                                                        case 0:
                                                            this.e = k10.m();
                                                            break;
                                                        case 1:
                                                            try {
                                                                int i12 = (int) k10.i();
                                                                byte[] bArr2 = new byte[i12];
                                                                dataInputStream5.readFully(bArr2);
                                                                BitmapFactory.Options options = new BitmapFactory.Options();
                                                                options.inJustDecodeBounds = r6;
                                                                options.inSampleSize = r6;
                                                                BitmapFactory.decodeByteArray(bArr2, 0, i12, options);
                                                                int i13 = options.outWidth;
                                                                if (i13 <= 800) {
                                                                    if (options.outHeight > 800) {
                                                                    }
                                                                    options.inJustDecodeBounds = false;
                                                                    decodeByteArray = BitmapFactory.decodeByteArray(bArr2, 0, i12, options);
                                                                    this.o = decodeByteArray;
                                                                    if (decodeByteArray != null) {
                                                                        float max = Math.max(decodeByteArray.getWidth(), this.o.getHeight()) / 120.0f;
                                                                        if (max > 0.0f) {
                                                                            this.p = Bitmap.createScaledBitmap(this.o, (int) (r7.getWidth() / max), (int) (this.o.getHeight() / max), r6);
                                                                        } else {
                                                                            this.p = this.o;
                                                                        }
                                                                        if (this.p == null) {
                                                                            this.p = this.o;
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                                for (int max2 = Math.max(i13, options.outHeight); max2 > 800; max2 /= 2) {
                                                                    options.inSampleSize *= 2;
                                                                }
                                                                options.inJustDecodeBounds = false;
                                                                decodeByteArray = BitmapFactory.decodeByteArray(bArr2, 0, i12, options);
                                                                this.o = decodeByteArray;
                                                                if (decodeByteArray != null) {
                                                                }
                                                            } catch (Exception e10) {
                                                                e10.printStackTrace();
                                                                break;
                                                            }
                                                            break;
                                                        case 2:
                                                            dataInputStream5.readBoolean();
                                                            break;
                                                        case 3:
                                                        case '\r':
                                                            String str4 = this.l;
                                                            if (str4 == null || str4.trim().length() == 0) {
                                                                this.l = k10.m();
                                                            }
                                                            break;
                                                        case 4:
                                                            k10.n(i11);
                                                            this.k = dataInputStream5.readShort();
                                                            k10.l();
                                                            break;
                                                        case 5:
                                                            String str5 = this.h;
                                                            if (str5 == null || str5.trim().length() == 0) {
                                                                if (k10.i() == 2) {
                                                                    int a2 = c.a(dataInputStream5.readShort() - r6);
                                                                    if (a2 != 0) {
                                                                        this.h = c.b(a2);
                                                                    }
                                                                } else {
                                                                    this.h = k10.m();
                                                                }
                                                            }
                                                            break;
                                                        case 6:
                                                            dataInputStream5.readByte();
                                                            break;
                                                        case 7:
                                                            k10.l();
                                                            break;
                                                        case '\b':
                                                            k10.n(i11);
                                                            this.j = dataInputStream5.readShort();
                                                            k10.l();
                                                            break;
                                                        case '\t':
                                                            this.d = k10.m();
                                                            break;
                                                        case '\n':
                                                            this.f = k10.m();
                                                            break;
                                                        case 11:
                                                            this.i = k10.m();
                                                            break;
                                                        case '\f':
                                                        case 19:
                                                            String str6 = this.m;
                                                            if (str6 == null || str6.trim().length() == 0) {
                                                                this.m = k10.m();
                                                            }
                                                            break;
                                                        case 14:
                                                            String trim2 = k10.m().trim();
                                                            if (trim2.length() >= i10) {
                                                                try {
                                                                    this.g = Short.valueOf(trim2.substring(0, i10)).shortValue();
                                                                } catch (NumberFormatException unused) {
                                                                }
                                                            }
                                                            break;
                                                        case 15:
                                                            String str7 = this.h;
                                                            if (str7 == null || str7.trim().length() == 0) {
                                                                this.h = k10.m();
                                                            }
                                                            break;
                                                        case 16:
                                                            k10.m();
                                                            break;
                                                        case 17:
                                                            this.n = k10.m();
                                                            break;
                                                        case 18:
                                                            this.c = k10.m();
                                                            break;
                                                    }
                                                    i10 = 4;
                                                    i11 = 2;
                                                } else if (logger.isLoggable(level2)) {
                                                    StringBuilder sb4 = new StringBuilder();
                                                    StringBuffer stringBuffer3 = new StringBuffer();
                                                    b.h(stringBuffer3, c14);
                                                    sb4.append(stringBuffer3.toString());
                                                    sb4.append(": contains no value");
                                                    logger.log(level2, sb4.toString());
                                                }
                                            }
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
            }
            r6 = 1;
            i10 = 4;
        }
    }
}
