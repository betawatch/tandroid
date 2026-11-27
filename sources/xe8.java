// default package

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.text.TextUtils;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Currency;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class xe8 {
    public static final Pattern e = Pattern.compile("^(?:([A-Za-z0-9_-]{1,24})\\.lproj/)?(icon|logo|strip|thumbnail|background|footer)(@[23]x)?\\.png$");
    public static final Pattern f = Pattern.compile("^([A-Za-z0-9_-]{1,24})\\.lproj/pass\\.strings$");
    public static final Pattern g = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})(?:[T ](\\d{2}):(\\d{2})(?::(\\d{2}))?(?:\\.\\d{1,9})?)?\\s*(Z|[+-]\\d{2}(?::?\\d{2})?)?$");
    public static final Pattern h = Pattern.compile("^rgba?\\(\\s*(\\d{1,3})\\s*,\\s*(\\d{1,3})\\s*,\\s*(\\d{1,3})\\s*(?:,\\s*[0-9.]+\\s*)?\\)$");
    public final String a;
    public final float b;
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();

    public xe8(String str, float f2) {
        this.a = str == null ? "en" : str.toLowerCase(Locale.ROOT);
        this.b = f2;
    }

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        return str.length() > 512 ? str.substring(0, 512) : str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static qe8 e(File file, String str, float f2) {
        int i;
        int i2;
        int i3;
        JSONObject jSONObject;
        int i4;
        int i5;
        l3d z6fVar;
        bf0 bf0Var;
        int i6;
        String str2;
        int i7;
        int i8;
        int i9;
        if (!file.isFile()) {
            throw new we8("no file");
        }
        if (file.length() > 2097152) {
            throw new we8("archive too large");
        }
        xe8 xe8Var = new xe8(str, f2);
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                xe8Var.h(bufferedInputStream);
                bufferedInputStream.close();
                HashMap hashMap = xe8Var.c;
                byte[] bArr = (byte[]) hashMap.get("pass.json");
                if (bArr == null) {
                    throw new we8("no pass.json");
                }
                Iterator it = hashMap.keySet().iterator();
                String str3 = null;
                int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                String str4 = null;
                while (true) {
                    i = 0;
                    i2 = 1;
                    if (!it.hasNext()) {
                        break;
                    }
                    String str5 = (String) it.next();
                    Matcher matcher = f.matcher(str5);
                    if (matcher.matches()) {
                        String replace = matcher.group(1).toLowerCase(Locale.ROOT).replace('_', '-');
                        String str6 = xe8Var.a;
                        if (!replace.equals(str6)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(str6);
                            sb.append("-");
                            i = replace.startsWith(sb.toString()) ? 1 : replace.equals("en") ? 2 : replace.startsWith("en-") ? 3 : 4;
                        }
                        if (i < i10) {
                            str4 = str5;
                            i10 = i;
                        }
                    }
                }
                int i11 = 2048;
                if (str4 != null) {
                    byte[] bArr2 = (byte[]) hashMap.get(str4);
                    if (bArr2.length >= 2 && (bArr2[0] & 255) == 255 && (bArr2[1] & 255) == 254) {
                        str2 = new String(bArr2, 2, bArr2.length - 2, Charset.forName("UTF-16LE"));
                    } else if (bArr2.length >= 2 && (bArr2[0] & 255) == 254 && (bArr2[1] & 255) == 255) {
                        str2 = new String(bArr2, 2, bArr2.length - 2, Charset.forName("UTF-16BE"));
                    } else if (bArr2.length >= 2 && bArr2[1] == 0) {
                        str2 = new String(bArr2, Charset.forName("UTF-16LE"));
                    } else if (bArr2.length < 2 || bArr2[0] != 0) {
                        str2 = new String(bArr2, StandardCharsets.UTF_8);
                        if (str2.length() > 0 && str2.charAt(0) == 65279) {
                            str2 = str2.substring(1);
                        }
                    } else {
                        str2 = new String(bArr2, Charset.forName("UTF-16BE"));
                    }
                    int length = str2.length();
                    StringBuilder sb2 = new StringBuilder();
                    StringBuilder sb3 = new StringBuilder();
                    int i12 = 0;
                    while (i12 < length) {
                        HashMap hashMap2 = xe8Var.d;
                        if (hashMap2.size() < i11) {
                            char charAt = str2.charAt(i12);
                            if (charAt == '/' && (i9 = i12 + 1) < length && str2.charAt(i9) == '*') {
                                int indexOf = str2.indexOf("*/", i12 + 2);
                                if (indexOf >= 0) {
                                    i7 = indexOf + 2;
                                    i12 = i7;
                                }
                            } else if (charAt == '/' && (i8 = i12 + 1) < length && str2.charAt(i8) == '/') {
                                int indexOf2 = str2.indexOf(10, i12 + 2);
                                if (indexOf2 >= 0) {
                                    i7 = indexOf2 + 1;
                                    i12 = i7;
                                }
                            } else if (charAt == '\"') {
                                int i13 = i(i12, TLObject.FLAG_12, str2, sb2);
                                if (i13 >= 0) {
                                    i12 = i13;
                                    while (i12 < str2.length() && Character.isWhitespace(str2.charAt(i12))) {
                                        i12++;
                                    }
                                    if (i12 < length && str2.charAt(i12) == '=') {
                                        do {
                                            i12++;
                                            if (i12 >= str2.length()) {
                                                break;
                                            }
                                        } while (Character.isWhitespace(str2.charAt(i12)));
                                        if (i12 < length && str2.charAt(i12) == '\"') {
                                            i7 = i(i12, TLObject.FLAG_13, str2, sb3);
                                            if (i7 >= 0) {
                                                hashMap2.put(sb2.toString(), sb3.toString());
                                                i12 = i7;
                                            }
                                        }
                                    }
                                }
                            } else {
                                i12++;
                            }
                            i11 = 2048;
                        }
                    }
                }
                try {
                    JSONObject g2 = g(bArr);
                    qe8 qe8Var = new qe8();
                    byte[] bArr3 = (byte[]) hashMap.get("manifest.json");
                    if (bArr3 != null) {
                        try {
                            JSONObject g3 = g(bArr3);
                            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                            for (Map.Entry entry : hashMap.entrySet()) {
                                if (!"manifest.json".equals(entry.getKey())) {
                                    String optString = g3.optString((String) entry.getKey(), str3);
                                    if (optString == null) {
                                        break;
                                    }
                                    messageDigest.reset();
                                    byte[] digest = messageDigest.digest((byte[]) entry.getValue());
                                    StringBuilder sb4 = new StringBuilder(digest.length << i2);
                                    for (byte b : digest) {
                                        sb4.append(Character.forDigit((b >> 4) & 15, 16));
                                        sb4.append(Character.forDigit(b & 15, 16));
                                    }
                                    if (!optString.equalsIgnoreCase(sb4.toString())) {
                                        break;
                                    }
                                    str3 = null;
                                    i2 = 1;
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                    xe8Var.j("organizationName", g2);
                    xe8Var.j("description", g2);
                    qe8Var.e = xe8Var.j("logoText", g2);
                    g2.optBoolean("voided", false);
                    qe8Var.b = f(-1, g2.optString("backgroundColor", null));
                    qe8Var.c = f(-16777216, g2.optString("foregroundColor", null));
                    qe8Var.d = f((qe8Var.c & 16777215) | (-1728053248), g2.optString("labelColor", null));
                    String[] strArr = {"boardingPass", "eventTicket", "coupon", "storeCard", "generic"};
                    int[] iArr = {1, 2, 3, 4, 0};
                    int i14 = 0;
                    JSONObject jSONObject2 = null;
                    while (true) {
                        if (i14 >= 5) {
                            break;
                        }
                        jSONObject2 = g2.optJSONObject(strArr[i14]);
                        if (jSONObject2 != null) {
                            qe8Var.a = iArr[i14];
                            break;
                        }
                        i14++;
                    }
                    if (jSONObject2 == null) {
                        throw new we8("no pass style");
                    }
                    jSONObject2.optString("transitType", null);
                    qe8Var.f = xe8Var.b(jSONObject2.optJSONArray("headerFields"));
                    qe8Var.g = xe8Var.b(jSONObject2.optJSONArray("primaryFields"));
                    qe8Var.h = xe8Var.b(jSONObject2.optJSONArray("secondaryFields"));
                    qe8Var.i = xe8Var.b(jSONObject2.optJSONArray("auxiliaryFields"));
                    xe8Var.b(jSONObject2.optJSONArray("backFields"));
                    qe8Var.j = xe8Var.c(jn7.p2, "icon");
                    qe8Var.k = xe8Var.c(480, "logo");
                    qe8Var.l = xe8Var.c(1200, "strip");
                    qe8Var.m = xe8Var.c(360, "thumbnail");
                    qe8Var.n = xe8Var.c(480, "background");
                    qe8Var.o = xe8Var.c(1200, "footer");
                    String str7 = "ISO-8859-1";
                    JSONArray optJSONArray = g2.optJSONArray("barcodes");
                    if (optJSONArray != null) {
                        int i15 = 0;
                        jSONObject = null;
                        while (true) {
                            i3 = i;
                            if (i15 < Math.min(optJSONArray.length(), 8) && jSONObject == null) {
                                JSONObject optJSONObject = optJSONArray.optJSONObject(i15);
                                if (optJSONObject != null) {
                                    String optString2 = optJSONObject.optString("format", "");
                                    optString2.getClass();
                                    switch (optString2.hashCode()) {
                                        case -714226307:
                                            if (optString2.equals("PKBarcodeFormatQR")) {
                                                i6 = i3;
                                                break;
                                            }
                                            i6 = -1;
                                            break;
                                        case -649575634:
                                            if (optString2.equals("PKBarcodeFormatCode128")) {
                                                i6 = 1;
                                                break;
                                            }
                                            i6 = -1;
                                            break;
                                        case -261397443:
                                            if (optString2.equals("PKBarcodeFormatAztec")) {
                                                i6 = 2;
                                                break;
                                            }
                                            i6 = -1;
                                            break;
                                        case 864762020:
                                            if (optString2.equals("PKBarcodeFormatPDF417")) {
                                                i6 = 3;
                                                break;
                                            }
                                            i6 = -1;
                                            break;
                                        default:
                                            i6 = -1;
                                            break;
                                    }
                                    switch (i6) {
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                            jSONObject = optJSONObject;
                                            break;
                                    }
                                }
                                i15++;
                                i = i3;
                            }
                        }
                    } else {
                        i3 = 0;
                        jSONObject = null;
                    }
                    if (jSONObject == null) {
                        jSONObject = g2.optJSONObject("barcode");
                    }
                    if (jSONObject != null) {
                        String optString3 = jSONObject.optString("format", "");
                        optString3.getClass();
                        switch (optString3.hashCode()) {
                            case -714226307:
                                if (optString3.equals("PKBarcodeFormatQR")) {
                                    i4 = i3;
                                    break;
                                }
                                i4 = -1;
                                break;
                            case -649575634:
                                if (optString3.equals("PKBarcodeFormatCode128")) {
                                    i4 = 1;
                                    break;
                                }
                                i4 = -1;
                                break;
                            case -261397443:
                                if (optString3.equals("PKBarcodeFormatAztec")) {
                                    i4 = 2;
                                    break;
                                }
                                i4 = -1;
                                break;
                            case 864762020:
                                if (optString3.equals("PKBarcodeFormatPDF417")) {
                                    i4 = 3;
                                    break;
                                }
                                i4 = -1;
                                break;
                            default:
                                i4 = -1;
                                break;
                        }
                        switch (i4) {
                            case 0:
                                i5 = 1;
                                break;
                            case 1:
                                i5 = 4;
                                break;
                            case 2:
                                i5 = 3;
                                break;
                            case 3:
                                i5 = 2;
                                break;
                            default:
                                i5 = i3;
                                break;
                        }
                        String optString4 = jSONObject.optString("message", null);
                        if (i5 != 0 && !TextUtils.isEmpty(optString4) && optString4.length() <= 2048) {
                            String optString5 = jSONObject.optString("messageEncoding", "iso-8859-1");
                            try {
                                if (Charset.isSupported(optString5)) {
                                    str7 = optString5;
                                }
                            } catch (Exception unused2) {
                            }
                            EnumMap enumMap = new EnumMap(i34.class);
                            enumMap.put((EnumMap) i34.c, (i34) Integer.valueOf(i3));
                            i34 i34Var = i34.b;
                            enumMap.put((EnumMap) i34Var, (i34) str7);
                            if (i5 == 1) {
                                z6fVar = new z6f((byte) 24);
                                enumMap.put((EnumMap) i34.a, (i34) "M");
                                bf0Var = bf0.d;
                            } else if (i5 == 2) {
                                z6fVar = new uif((byte) 22);
                                bf0Var = bf0.c;
                            } else if (i5 != 3) {
                                z6fVar = new xj2();
                                enumMap.remove(i34Var);
                                bf0Var = bf0.b;
                            } else {
                                z6fVar = new rg7((byte) 14);
                                bf0Var = bf0.a;
                            }
                            try {
                                rj0 o = z6fVar.o(optString4, bf0Var, enumMap);
                                int i16 = o.a;
                                int i17 = o.b;
                                if (i16 > 0 && i17 > 0 && i16 <= 1024 && i17 <= 1024) {
                                    Bitmap createBitmap = Bitmap.createBitmap(i16, i17, Bitmap.Config.ALPHA_8);
                                    int rowBytes = createBitmap.getRowBytes();
                                    byte[] bArr4 = new byte[rowBytes * i17];
                                    for (int i18 = i3; i18 < i17; i18++) {
                                        for (int i19 = i3; i19 < i16; i19++) {
                                            if (o.b(i19, i18)) {
                                                bArr4[(i18 * rowBytes) + i19] = -1;
                                            }
                                        }
                                    }
                                    createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr4));
                                    qe8Var.q = createBitmap;
                                    qe8Var.p = i5;
                                    qe8Var.r = a(jSONObject.optString("altText", null));
                                }
                            } catch (Throwable th) {
                                cc4.g(th, true);
                            }
                        }
                    }
                    hashMap.clear();
                    return qe8Var;
                } catch (we8 e2) {
                    throw e2;
                } catch (Exception unused3) {
                    throw new we8("bad pass.json");
                }
            } finally {
            }
        } catch (IOException e3) {
            throw new we8("bad archive: " + e3.getMessage());
        }
    }

    public static int f(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        String trim = str.trim();
        Matcher matcher = h.matcher(trim);
        if (matcher.matches()) {
            return Color.rgb(Math.min(jn7.d4, Integer.parseInt(matcher.group(1))), Math.min(jn7.d4, Integer.parseInt(matcher.group(2))), Math.min(jn7.d4, Integer.parseInt(matcher.group(3))));
        }
        if (!trim.startsWith("#")) {
            return i;
        }
        if (trim.length() != 7 && trim.length() != 4) {
            return i;
        }
        try {
            if (trim.length() == 4) {
                trim = "#" + trim.charAt(1) + trim.charAt(1) + trim.charAt(2) + trim.charAt(2) + trim.charAt(3) + trim.charAt(3);
            }
            return Integer.parseInt(trim.substring(1), 16) | (-16777216);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static JSONObject g(byte[] bArr) {
        String str = new String(bArr, StandardCharsets.UTF_8);
        if (str.length() > 0 && str.charAt(0) == 65279) {
            str = str.substring(1);
        }
        int length = str.length();
        int i = 0;
        boolean z = false;
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (z) {
                if (charAt == '\\') {
                    i++;
                } else if (charAt == '\"') {
                    z = false;
                }
            } else if (charAt == '\"') {
                z = true;
            } else if (charAt == '{' || charAt == '[') {
                i2++;
                if (i2 > 32) {
                    throw new we8("json too deep");
                }
            } else if (charAt == '}' || charAt == ']') {
                i2--;
            }
            i++;
        }
        return new JSONObject(str);
    }

    public static int i(int i, int i2, String str, StringBuilder sb) {
        sb.setLength(0);
        int length = str.length();
        int i3 = i + 1;
        while (true) {
            int i4 = -1;
            if (i3 >= length) {
                break;
            }
            int i5 = i3 + 1;
            char charAt = str.charAt(i3);
            if (charAt != '\"') {
                if (sb.length() >= i2) {
                    break;
                }
                if (charAt != '\\' || i5 >= length) {
                    sb.append(charAt);
                    i3 = i5;
                } else {
                    int i6 = i3 + 2;
                    char charAt2 = str.charAt(i5);
                    if (charAt2 != 'U') {
                        if (charAt2 == 'n') {
                            sb.append('\n');
                        } else if (charAt2 == 'r') {
                            sb.append('\r');
                        } else if (charAt2 == 't') {
                            sb.append('\t');
                        } else if (charAt2 != 'u') {
                            sb.append(charAt2);
                        }
                        i3 = i6;
                    }
                    i3 += 6;
                    if (i3 <= length) {
                        int i7 = 0;
                        int i8 = 0;
                        while (true) {
                            if (i7 >= 4) {
                                i4 = i8;
                                break;
                            }
                            int digit = Character.digit(str.charAt(i6 + i7), 16);
                            if (digit < 0) {
                                break;
                            }
                            i8 = (i8 << 4) | digit;
                            i7++;
                        }
                        if (i4 >= 0) {
                            sb.append((char) i4);
                        }
                    }
                    sb.append(charAt2);
                    i3 = i6;
                }
            } else {
                return i5;
            }
        }
        return -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x01fd, code lost:
    
        if (r1 != null) goto L121;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pe8[] b(JSONArray jSONArray) {
        pe8[] pe8VarArr;
        int i;
        String str;
        String str2;
        boolean z;
        int i2;
        int i3;
        DateFormat timeInstance;
        char c;
        char c2;
        JSONArray jSONArray2 = jSONArray;
        boolean z2 = false;
        if (jSONArray2 == null) {
            return new pe8[0];
        }
        int min = Math.min(jSONArray2.length(), 16);
        pe8[] pe8VarArr2 = new pe8[min];
        int i4 = 0;
        int i5 = 0;
        while (i4 < min) {
            JSONObject optJSONObject = jSONArray2.optJSONObject(i4);
            if (optJSONObject == null) {
                pe8VarArr = pe8VarArr2;
                i = i4;
            } else {
                pe8 pe8Var = new pe8();
                a(optJSONObject.optString("key", ""));
                pe8Var.b = j("label", optJSONObject);
                Object opt = optJSONObject.opt("value");
                String optString = optJSONObject.optString("dateStyle", null);
                String optString2 = optJSONObject.optString("timeStyle", null);
                if (!(opt instanceof String) || (optString == null && optString2 == null)) {
                    pe8VarArr = pe8VarArr2;
                    i = i4;
                } else {
                    boolean optBoolean = optJSONObject.optBoolean("ignoresTimeZone", z2);
                    Matcher matcher = g.matcher(((String) opt).trim());
                    if (matcher.matches()) {
                        TimeZone timeZone = DesugarTimeZone.getTimeZone("UTC");
                        String group = matcher.group(7);
                        int i6 = -1;
                        i = i4;
                        if (group == null || "Z".equals(group)) {
                            str2 = group;
                            z = optBoolean;
                        } else {
                            String replace = group.replace(":", "");
                            str2 = group;
                            z = optBoolean;
                            timeZone = new SimpleTimeZone(((Integer.parseInt(replace.substring(1, 3)) * 60) + (replace.length() >= 5 ? Integer.parseInt(replace.substring(3, 5)) : 0)) * 60000 * (replace.charAt(0) == '-' ? -1 : 1), "pass");
                        }
                        Calendar calendar = Calendar.getInstance(timeZone);
                        calendar.clear();
                        calendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), matcher.group(4) != null ? Integer.parseInt(matcher.group(4)) : 0, matcher.group(5) != null ? Integer.parseInt(matcher.group(5)) : 0, matcher.group(6) != null ? Integer.parseInt(matcher.group(6)) : 0);
                        TimeZone timeZone2 = timeZone;
                        if (optString != null) {
                            switch (optString.hashCode()) {
                                case -391959948:
                                    if (optString.equals("PKDateStyleShort")) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 559261821:
                                    if (optString.equals("PKDateStyleMedium")) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 1095359895:
                                    if (optString.equals("PKDateStyleFull")) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 1095532932:
                                    if (optString.equals("PKDateStyleLong")) {
                                        c2 = 3;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                default:
                                    c2 = 65535;
                                    break;
                            }
                            switch (c2) {
                                case 0:
                                    pe8VarArr = pe8VarArr2;
                                    i3 = 4;
                                    i2 = 3;
                                    break;
                                case 1:
                                    pe8VarArr = pe8VarArr2;
                                    i3 = 4;
                                    i2 = 2;
                                    break;
                                case 2:
                                    pe8VarArr = pe8VarArr2;
                                    i3 = 4;
                                    i2 = 0;
                                    break;
                                case 3:
                                    pe8VarArr = pe8VarArr2;
                                    i3 = 4;
                                    i2 = 1;
                                    break;
                            }
                            if (matcher.group(i3) != null && optString2 != null) {
                                switch (optString2.hashCode()) {
                                    case -391959948:
                                        if (optString2.equals("PKDateStyleShort")) {
                                            c = 0;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 559261821:
                                        if (optString2.equals("PKDateStyleMedium")) {
                                            c = 1;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1095359895:
                                        if (optString2.equals("PKDateStyleFull")) {
                                            c = 2;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1095532932:
                                        if (optString2.equals("PKDateStyleLong")) {
                                            c = 3;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    default:
                                        c = 65535;
                                        break;
                                }
                                switch (c) {
                                    case 0:
                                        i6 = 3;
                                        break;
                                    case 1:
                                        i6 = 2;
                                        break;
                                    case 2:
                                        i6 = 0;
                                        break;
                                    case 3:
                                        i6 = 1;
                                        break;
                                }
                            }
                            int i7 = i6;
                            if (i2 < 0) {
                                timeInstance = i7 >= 0 ? DateFormat.getDateTimeInstance(i2, i7) : DateFormat.getDateInstance(i2);
                            } else if (i7 >= 0) {
                                timeInstance = DateFormat.getTimeInstance(i7);
                            }
                            timeInstance.setTimeZone((!z || str2 == null) ? timeZone2 : TimeZone.getDefault());
                            str = timeInstance.format(calendar.getTime());
                        }
                        pe8VarArr = pe8VarArr2;
                        i2 = -1;
                        i3 = 4;
                        if (matcher.group(i3) != null) {
                            switch (optString2.hashCode()) {
                                case -391959948:
                                    break;
                                case 559261821:
                                    break;
                                case 1095359895:
                                    break;
                                case 1095532932:
                                    break;
                            }
                            switch (c) {
                            }
                        }
                        int i72 = i6;
                        if (i2 < 0) {
                        }
                        timeInstance.setTimeZone((!z || str2 == null) ? timeZone2 : TimeZone.getDefault());
                        str = timeInstance.format(calendar.getTime());
                    } else {
                        pe8VarArr = pe8VarArr2;
                        i = i4;
                    }
                    str = null;
                }
                if (opt instanceof Number) {
                    String optString3 = optJSONObject.optString("currencyCode", null);
                    if (optString3 != null) {
                        try {
                            NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
                            currencyInstance.setCurrency(Currency.getInstance(optString3));
                            str = currencyInstance.format(((Number) opt).doubleValue());
                        } catch (Exception unused) {
                        }
                    } else {
                        str = "PKNumberStylePercent".equals(optJSONObject.optString("numberStyle", "")) ? NumberFormat.getPercentInstance().format(((Number) opt).doubleValue()) : NumberFormat.getInstance().format(((Number) opt).doubleValue());
                    }
                    pe8Var.c = str;
                    String optString4 = optJSONObject.optString("textAlignment", "");
                    pe8Var.a = !"PKTextAlignmentLeft".equals(optString4) ? (byte) 1 : "PKTextAlignmentCenter".equals(optString4) ? (byte) 2 : "PKTextAlignmentRight".equals(optString4) ? (byte) 3 : (byte) 0;
                    if (((String) pe8Var.c) == null || ((String) pe8Var.b) != null) {
                        pe8VarArr[i5] = pe8Var;
                        i5++;
                    }
                }
                str = j("value", optJSONObject);
                pe8Var.c = str;
                String optString42 = optJSONObject.optString("textAlignment", "");
                pe8Var.a = !"PKTextAlignmentLeft".equals(optString42) ? (byte) 1 : "PKTextAlignmentCenter".equals(optString42) ? (byte) 2 : "PKTextAlignmentRight".equals(optString42) ? (byte) 3 : (byte) 0;
                if (((String) pe8Var.c) == null) {
                }
                pe8VarArr[i5] = pe8Var;
                i5++;
            }
            i4 = i + 1;
            jSONArray2 = jSONArray;
            pe8VarArr2 = pe8VarArr;
            z2 = false;
        }
        pe8[] pe8VarArr3 = pe8VarArr2;
        if (i5 == min) {
            return pe8VarArr3;
        }
        pe8[] pe8VarArr4 = new pe8[i5];
        System.arraycopy(pe8VarArr3, 0, pe8VarArr4, 0, i5);
        return pe8VarArr4;
    }

    public final Bitmap c(int i, String str) {
        byte[] bArr;
        char c;
        float f2 = this.b;
        String[] strArr = f2 >= 2.5f ? new String[]{"@3x", "@2x", ""} : f2 >= 1.5f ? new String[]{"@2x", "@3x", ""} : new String[]{"", "@2x", "@3x"};
        HashMap hashMap = this.c;
        Iterator it = hashMap.keySet().iterator();
        char c2 = 65535;
        String str2 = null;
        while (it.hasNext()) {
            Matcher matcher = e.matcher((String) it.next());
            if (matcher.matches() && matcher.group(1) != null && str.equals(matcher.group(2))) {
                String replace = matcher.group(1).toLowerCase(Locale.ROOT).replace('_', '-');
                String str3 = this.a;
                if (replace.equals(str3)) {
                    c = 0;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str3);
                    sb.append("-");
                    c = replace.startsWith(sb.toString()) ? (char) 1 : replace.equals("en") ? (char) 2 : replace.startsWith("en-") ? (char) 3 : (char) 4;
                }
                if (c < c2) {
                    str2 = matcher.group(1);
                    c2 = c;
                }
            }
        }
        int length = strArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                int length2 = strArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        bArr = null;
                        break;
                    }
                    byte[] bArr2 = (byte[]) hashMap.get(str + strArr[i3] + ".png");
                    if (bArr2 != null) {
                        bArr = bArr2;
                        break;
                    }
                    i3++;
                }
            } else {
                String str4 = strArr[i2];
                if (str2 != null && (bArr = (byte[]) hashMap.get(c00.j(str2, ".lproj/", str, str4, ".png"))) != null) {
                    break;
                }
                i2++;
            }
        }
        if (bArr != null) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                int i4 = options.outWidth;
                int i5 = options.outHeight;
                if (i4 > 0 && i5 > 0 && i4 * i5 <= 16777216) {
                    int i6 = 1;
                    while (true) {
                        int i7 = i6 << 1;
                        if (Math.max(i4, i5) / i7 < i) {
                            break;
                        }
                        i6 = i7;
                    }
                    BitmapFactory.Options options2 = new BitmapFactory.Options();
                    options2.inSampleSize = i6;
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options2);
                    if (decodeByteArray != null) {
                        int max = Math.max(decodeByteArray.getWidth(), decodeByteArray.getHeight());
                        if (max <= i) {
                            return decodeByteArray;
                        }
                        float f3 = i / max;
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeByteArray, Math.max(1, Math.round(decodeByteArray.getWidth() * f3)), Math.max(1, Math.round(decodeByteArray.getHeight() * f3)), true);
                        if (createScaledBitmap != decodeByteArray) {
                            decodeByteArray.recycle();
                        }
                        return createScaledBitmap;
                    }
                }
            } catch (Throwable th) {
                cc4.g(th, true);
                return null;
            }
        }
        return null;
    }

    public final boolean d(String str) {
        if (str == null) {
            return true;
        }
        String replace = str.toLowerCase(Locale.ROOT).replace('_', '-');
        String str2 = this.a;
        if (!replace.equals(str2)) {
            if (!replace.startsWith(str2 + "-") && !replace.equals("en") && !replace.startsWith("en-") && !replace.equals("base")) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ad, code lost:
    
        if (r7 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00af, code lost:
    
        r13.c.put(r8, r7.toByteArray());
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad A[EDGE_INSN: B:35:0x00ad->B:36:0x00ad BREAK  A[LOOP:1: B:16:0x0081->B:26:0x0081], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(BufferedInputStream bufferedInputStream) {
        int i;
        int read;
        ZipInputStream zipInputStream = new ZipInputStream(bufferedInputStream);
        HashSet hashSet = new HashSet();
        byte[] bArr = new byte[TLObject.FLAG_14];
        long j = 0;
        int i2 = 0;
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry == null) {
                return;
            }
            i2++;
            if (i2 > 512) {
                throw new we8("too many entries");
            }
            String name = nextEntry.getName();
            if (!hashSet.add(name)) {
                throw new we8("duplicate entry");
            }
            if (!nextEntry.isDirectory()) {
                if ("pass.json".equals(name)) {
                    i = TLObject.FLAG_19;
                } else if ("manifest.json".equals(name)) {
                    i = 131072;
                } else {
                    Matcher matcher = e.matcher(name);
                    if (!matcher.matches()) {
                        Matcher matcher2 = f.matcher(name);
                        if (matcher2.matches() && d(matcher2.group(1))) {
                            i = 262144;
                        }
                    } else if (d(matcher.group(1))) {
                        i = TLObject.FLAG_21;
                    }
                }
                ByteArrayOutputStream byteArrayOutputStream = i <= 0 ? new ByteArrayOutputStream() : null;
                int i3 = 0;
                while (true) {
                    read = zipInputStream.read(bArr);
                    if (read > 0) {
                        break;
                    }
                    j += read;
                    if (j > 16777216) {
                        throw new we8("inflated size limit");
                    }
                    if (byteArrayOutputStream != null) {
                        i3 += read;
                        if (i3 > i) {
                            throw new we8(c00.i("entry too large: ", name));
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                }
            }
            i = 0;
            if (i <= 0) {
            }
            int i32 = 0;
            while (true) {
                read = zipInputStream.read(bArr);
                if (read > 0) {
                }
            }
        }
    }

    public final String j(String str, JSONObject jSONObject) {
        Object opt = jSONObject.opt(str);
        if (!(opt instanceof String)) {
            if (opt instanceof Number) {
                return a(String.valueOf(opt));
            }
            return null;
        }
        String str2 = (String) opt;
        String str3 = (String) this.d.get(str2);
        if (str3 != null) {
            str2 = str3;
        }
        return a(str2);
    }
}
