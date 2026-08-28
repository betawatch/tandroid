package pa;

import j$.util.DesugarTimeZone;
import j3.r0;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class a {
    public static final TimeZone a = DesugarTimeZone.getTimeZone("UTC");

    public static boolean a(String str, int i9, char c10) {
        return i9 < str.length() && str.charAt(i9) == c10;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7 A[Catch: IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, TRY_LEAVE, TryCatch #2 {IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:18:0x005b, B:20:0x006b, B:21:0x006d, B:23:0x0079, B:24:0x007c, B:26:0x0082, B:30:0x008c, B:35:0x009c, B:37:0x00a4, B:38:0x00a8, B:40:0x00ae, B:44:0x00bb, B:48:0x00c6, B:53:0x00f1, B:55:0x00f7, B:59:0x01a9, B:64:0x0109, B:65:0x0124, B:66:0x0125, B:69:0x0142, B:71:0x014f, B:74:0x0158, B:76:0x0177, B:79:0x0186, B:80:0x01a8, B:81:0x0131, B:82:0x01da, B:83:0x01e1, B:84:0x00d6, B:85:0x00d9, B:88:0x00c2), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01da A[Catch: IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, TryCatch #2 {IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:18:0x005b, B:20:0x006b, B:21:0x006d, B:23:0x0079, B:24:0x007c, B:26:0x0082, B:30:0x008c, B:35:0x009c, B:37:0x00a4, B:38:0x00a8, B:40:0x00ae, B:44:0x00bb, B:48:0x00c6, B:53:0x00f1, B:55:0x00f7, B:59:0x01a9, B:64:0x0109, B:65:0x0124, B:66:0x0125, B:69:0x0142, B:71:0x014f, B:74:0x0158, B:76:0x0177, B:79:0x0186, B:80:0x01a8, B:81:0x0131, B:82:0x01da, B:83:0x01e1, B:84:0x00d6, B:85:0x00d9, B:88:0x00c2), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Date b(String str, ParsePosition parsePosition) {
        String message;
        int i9;
        int i10;
        int i11;
        int i12;
        int length;
        char charAt;
        int length2;
        try {
            int index = parsePosition.getIndex();
            int i13 = index + 4;
            int c10 = c(index, i13, str);
            if (a(str, i13, '-')) {
                i13 = index + 5;
            }
            int i14 = i13 + 2;
            int c11 = c(i13, i14, str);
            if (a(str, i14, '-')) {
                i14 = i13 + 3;
            }
            int i15 = i14 + 2;
            int c12 = c(i14, i15, str);
            boolean a2 = a(str, i15, 'T');
            if (!a2 && str.length() <= i15) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(c10, c11 - 1, c12);
                gregorianCalendar.setLenient(false);
                parsePosition.setIndex(i15);
                return gregorianCalendar.getTime();
            }
            if (a2) {
                int i16 = i14 + 5;
                int c13 = c(i14 + 3, i16, str);
                if (a(str, i16, ':')) {
                    i16 = i14 + 6;
                }
                int i17 = i16 + 2;
                int c14 = c(i16, i17, str);
                if (a(str, i17, ':')) {
                    i17 = i16 + 3;
                }
                if (str.length() > i17 && (charAt = str.charAt(i17)) != 'Z' && charAt != '+' && charAt != '-') {
                    int i18 = i17 + 2;
                    i12 = c(i17, i18, str);
                    if (i12 > 59 && i12 < 63) {
                        i12 = 59;
                    }
                    if (a(str, i18, '.')) {
                        int i19 = i17 + 3;
                        for (int i20 = i17 + 4; i20 < str.length(); i20++) {
                            char charAt2 = str.charAt(i20);
                            if (charAt2 >= '0' && charAt2 <= '9') {
                            }
                            length2 = i20;
                        }
                        length2 = str.length();
                        int min = Math.min(length2, i17 + 6);
                        i11 = c(i19, min, str);
                        int i21 = min - i19;
                        if (i21 == 1) {
                            i11 *= 100;
                        } else if (i21 == 2) {
                            i11 *= 10;
                        }
                        i9 = c13;
                        i15 = length2;
                        i10 = c14;
                    } else {
                        i9 = c13;
                        i15 = i18;
                        i10 = c14;
                        i11 = 0;
                    }
                    if (str.length() > i15) {
                        throw new IllegalArgumentException("No time zone indicator");
                    }
                    char charAt3 = str.charAt(i15);
                    TimeZone timeZone = a;
                    if (charAt3 == 'Z') {
                        length = i15 + 1;
                    } else {
                        if (charAt3 != '+' && charAt3 != '-') {
                            throw new IndexOutOfBoundsException("Invalid time zone indicator '" + charAt3 + "'");
                        }
                        String substring = str.substring(i15);
                        if (substring.length() < 5) {
                            substring = substring + "00";
                        }
                        length = i15 + substring.length();
                        if (!substring.equals("+0000") && !substring.equals("+00:00")) {
                            String str2 = "GMT" + substring;
                            timeZone = DesugarTimeZone.getTimeZone(str2);
                            String id2 = timeZone.getID();
                            if (!id2.equals(str2) && !id2.replace(":", "").equals(str2)) {
                                throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone.getID());
                            }
                        }
                    }
                    GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
                    gregorianCalendar2.setLenient(false);
                    gregorianCalendar2.set(1, c10);
                    gregorianCalendar2.set(2, c11 - 1);
                    gregorianCalendar2.set(5, c12);
                    gregorianCalendar2.set(11, i9);
                    gregorianCalendar2.set(12, i10);
                    gregorianCalendar2.set(13, i12);
                    gregorianCalendar2.set(14, i11);
                    parsePosition.setIndex(length);
                    return gregorianCalendar2.getTime();
                }
                i15 = i17;
                i9 = c13;
                i10 = c14;
            } else {
                i9 = 0;
                i10 = 0;
            }
            i11 = 0;
            i12 = 0;
            if (str.length() > i15) {
            }
        } catch (IllegalArgumentException e10) {
            e = e10;
            String str3 = str != null ? null : "\"" + str + '\"';
            message = e.getMessage();
            if (message != null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException(r0.o("Failed to parse date [", str3, "]: ", message), parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        } catch (IndexOutOfBoundsException e11) {
            e = e11;
            if (str != null) {
            }
            message = e.getMessage();
            if (message != null) {
            }
            message = "(" + e.getClass().getName() + ")";
            ParseException parseException2 = new ParseException(r0.o("Failed to parse date [", str3, "]: ", message), parsePosition.getIndex());
            parseException2.initCause(e);
            throw parseException2;
        }
    }

    public static int c(int i9, int i10, String str) {
        int i11;
        int i12;
        if (i9 < 0 || i10 > str.length() || i9 > i10) {
            throw new NumberFormatException(str);
        }
        if (i9 < i10) {
            i12 = i9 + 1;
            int digit = Character.digit(str.charAt(i9), 10);
            if (digit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i9, i10));
            }
            i11 = -digit;
        } else {
            i11 = 0;
            i12 = i9;
        }
        while (i12 < i10) {
            int i13 = i12 + 1;
            int digit2 = Character.digit(str.charAt(i12), 10);
            if (digit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i9, i10));
            }
            i11 = (i11 * 10) - digit2;
            i12 = i13;
        }
        return -i11;
    }
}
