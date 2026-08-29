package ra;

import j$.util.DesugarTimeZone;
import j7.l1;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class a {
    public static final TimeZone a = DesugarTimeZone.getTimeZone("UTC");

    public static boolean a(String str, int i10, char c3) {
        return i10 < str.length() && str.charAt(i10) == c3;
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
        int i10;
        int i11;
        int i12;
        int i13;
        int length;
        char charAt;
        int length2;
        try {
            int index = parsePosition.getIndex();
            int i14 = index + 4;
            int c3 = c(index, i14, str);
            if (a(str, i14, '-')) {
                i14 = index + 5;
            }
            int i15 = i14 + 2;
            int c6 = c(i14, i15, str);
            if (a(str, i15, '-')) {
                i15 = i14 + 3;
            }
            int i16 = i15 + 2;
            int c10 = c(i15, i16, str);
            boolean a2 = a(str, i16, 'T');
            if (!a2 && str.length() <= i16) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(c3, c6 - 1, c10);
                gregorianCalendar.setLenient(false);
                parsePosition.setIndex(i16);
                return gregorianCalendar.getTime();
            }
            if (a2) {
                int i17 = i15 + 5;
                int c11 = c(i15 + 3, i17, str);
                if (a(str, i17, ':')) {
                    i17 = i15 + 6;
                }
                int i18 = i17 + 2;
                int c12 = c(i17, i18, str);
                if (a(str, i18, ':')) {
                    i18 = i17 + 3;
                }
                if (str.length() > i18 && (charAt = str.charAt(i18)) != 'Z' && charAt != '+' && charAt != '-') {
                    int i19 = i18 + 2;
                    i13 = c(i18, i19, str);
                    if (i13 > 59 && i13 < 63) {
                        i13 = 59;
                    }
                    if (a(str, i19, '.')) {
                        int i20 = i18 + 3;
                        for (int i21 = i18 + 4; i21 < str.length(); i21++) {
                            char charAt2 = str.charAt(i21);
                            if (charAt2 >= '0' && charAt2 <= '9') {
                            }
                            length2 = i21;
                        }
                        length2 = str.length();
                        int min = Math.min(length2, i18 + 6);
                        i12 = c(i20, min, str);
                        int i22 = min - i20;
                        if (i22 == 1) {
                            i12 *= 100;
                        } else if (i22 == 2) {
                            i12 *= 10;
                        }
                        i10 = c11;
                        i16 = length2;
                        i11 = c12;
                    } else {
                        i10 = c11;
                        i16 = i19;
                        i11 = c12;
                        i12 = 0;
                    }
                    if (str.length() > i16) {
                        throw new IllegalArgumentException("No time zone indicator");
                    }
                    char charAt3 = str.charAt(i16);
                    TimeZone timeZone = a;
                    if (charAt3 == 'Z') {
                        length = i16 + 1;
                    } else {
                        if (charAt3 != '+' && charAt3 != '-') {
                            throw new IndexOutOfBoundsException("Invalid time zone indicator '" + charAt3 + "'");
                        }
                        String substring = str.substring(i16);
                        if (substring.length() < 5) {
                            substring = substring + "00";
                        }
                        length = i16 + substring.length();
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
                    gregorianCalendar2.set(1, c3);
                    gregorianCalendar2.set(2, c6 - 1);
                    gregorianCalendar2.set(5, c10);
                    gregorianCalendar2.set(11, i10);
                    gregorianCalendar2.set(12, i11);
                    gregorianCalendar2.set(13, i13);
                    gregorianCalendar2.set(14, i12);
                    parsePosition.setIndex(length);
                    return gregorianCalendar2.getTime();
                }
                i16 = i18;
                i10 = c11;
                i11 = c12;
            } else {
                i10 = 0;
                i11 = 0;
            }
            i12 = 0;
            i13 = 0;
            if (str.length() > i16) {
            }
        } catch (IllegalArgumentException e10) {
            e = e10;
            String str3 = str != null ? null : "\"" + str + '\"';
            message = e.getMessage();
            if (message != null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException(l1.n("Failed to parse date [", str3, "]: ", message), parsePosition.getIndex());
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
            ParseException parseException2 = new ParseException(l1.n("Failed to parse date [", str3, "]: ", message), parsePosition.getIndex());
            parseException2.initCause(e);
            throw parseException2;
        }
    }

    public static int c(int i10, int i11, String str) {
        int i12;
        int i13;
        if (i10 < 0 || i11 > str.length() || i10 > i11) {
            throw new NumberFormatException(str);
        }
        if (i10 < i11) {
            i13 = i10 + 1;
            int digit = Character.digit(str.charAt(i10), 10);
            if (digit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
            }
            i12 = -digit;
        } else {
            i12 = 0;
            i13 = i10;
        }
        while (i13 < i11) {
            int i14 = i13 + 1;
            int digit2 = Character.digit(str.charAt(i13), 10);
            if (digit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
            }
            i12 = (i12 * 10) - digit2;
            i13 = i14;
        }
        return -i12;
    }
}
