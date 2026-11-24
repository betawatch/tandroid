// default package

import android.text.Layout;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class p2c implements uab {
    public static final Pattern b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern h = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    public static final Pattern n = Pattern.compile("^(\\d+) (\\d+)$");
    public static final o2c r = new o2c(30.0f, 1, 1);
    public final XmlPullParserFactory a;

    public p2c() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.a = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e2) {
            fyb.j("Couldn't create XmlPullParserFactory instance", e2);
            throw null;
        }
    }

    public static r2c a(r2c r2cVar) {
        return r2cVar == null ? new r2c() : r2cVar;
    }

    public static boolean b(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static int c(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = n.matcher(attributeValue);
        if (!matcher.matches()) {
            lad.f("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            int parseInt2 = Integer.parseInt(group2);
            gre.b(parseInt, parseInt2, "Invalid cell resolution %s %s", (parseInt == 0 || parseInt2 == 0) ? false : true);
            return parseInt2;
        } catch (NumberFormatException unused) {
            lad.f("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void d(String str, r2c r2cVar) {
        Matcher matcher;
        String group;
        String str2 = g8c.a;
        String[] split = str.split("\\s+", -1);
        int length = split.length;
        Pattern pattern = d;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (split.length != 2) {
                throw new mab(de9.l(new StringBuilder("Invalid number of entries for fontSize: "), split.length, "."));
            }
            matcher = pattern.matcher(split[1]);
            lad.f("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new mab(tb4.y("Invalid expression for fontSize: '", str, "'."));
        }
        group = matcher.group(3);
        group.getClass();
        switch (group) {
            case "%":
                r2cVar.j = 3;
                break;
            case "em":
                r2cVar.j = 2;
                break;
            case "px":
                r2cVar.j = 1;
                break;
            default:
                throw new mab(tb4.y("Invalid unit for fontSize: '", group, "'."));
        }
        String group2 = matcher.group(1);
        group2.getClass();
        r2cVar.k = Float.parseFloat(group2);
    }

    public static o2c e(XmlPullParser xmlPullParser) {
        float f2;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String str = g8c.a;
            gre.e("frameRateMultiplier doesn't have 2 parts", attributeValue2.split(" ", -1).length == 2);
            f2 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f2 = 1.0f;
        }
        o2c o2cVar = r;
        int i = o2cVar.b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i = Integer.parseInt(attributeValue3);
        }
        int i2 = o2cVar.c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i2 = Integer.parseInt(attributeValue4);
        }
        return new o2c(parseInt * f2, i, i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void g(XmlPullParser xmlPullParser, HashMap hashMap, int i, zw8 zw8Var, HashMap hashMap2, HashMap hashMap3) {
        String a;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        int i2;
        float f8;
        int i3;
        String a2;
        int i4;
        q2c q2cVar;
        char c2;
        String a3;
        r2c r2cVar;
        float parseFloat;
        float parseFloat2;
        String a4;
        r2c r2cVar2;
        String a5;
        r2c r2cVar3;
        String[] split;
        do {
            xmlPullParser.next();
            if (oye.c(xmlPullParser, "style")) {
                String a6 = oye.a(xmlPullParser, "style");
                r2c i5 = i(xmlPullParser, new r2c());
                if (a6 != null) {
                    String trim = a6.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        String str = g8c.a;
                        split = trim.split("\\s+", -1);
                    }
                    for (String str2 : split) {
                        i5.a((r2c) hashMap.get(str2));
                    }
                }
                String str3 = i5.l;
                if (str3 != null) {
                    hashMap.put(str3, i5);
                }
            } else if (oye.c(xmlPullParser, "region")) {
                String a7 = oye.a(xmlPullParser, "id");
                if (a7 != null) {
                    String a8 = oye.a(xmlPullParser, "origin");
                    if (a8 == null && (a5 = oye.a(xmlPullParser, "style")) != null && (r2cVar3 = (r2c) hashMap.get(a5)) != null) {
                        a8 = r2cVar3.t;
                    }
                    int i6 = 2;
                    Pattern pattern = h;
                    Pattern pattern2 = f;
                    if (a8 != null) {
                        Matcher matcher = pattern2.matcher(a8);
                        Matcher matcher2 = pattern.matcher(a8);
                        if (matcher.matches()) {
                            try {
                                String group = matcher.group(1);
                                group.getClass();
                                f4 = Float.parseFloat(group) / 100.0f;
                                String group2 = matcher.group(2);
                                group2.getClass();
                                f3 = Float.parseFloat(group2) / 100.0f;
                                f2 = 100.0f;
                            } catch (NumberFormatException unused) {
                                lad.f("TtmlParser", "Ignoring region with malformed origin: ".concat(a8));
                            }
                        } else if (!matcher2.matches()) {
                            lad.f("TtmlParser", "Ignoring region with unsupported origin: ".concat(a8));
                        } else if (zw8Var == null) {
                            lad.f("TtmlParser", "Ignoring region with missing tts:extent: ".concat(a8));
                        } else {
                            try {
                                String group3 = matcher2.group(1);
                                group3.getClass();
                                int parseInt = Integer.parseInt(group3);
                                String group4 = matcher2.group(2);
                                group4.getClass();
                                f2 = 100.0f;
                                float f9 = parseInt / zw8Var.b;
                                float parseInt2 = Integer.parseInt(group4) / zw8Var.c;
                                f4 = f9;
                                f3 = parseInt2;
                            } catch (NumberFormatException unused2) {
                                lad.f("TtmlParser", "Ignoring region with malformed origin: ".concat(a8));
                            }
                        }
                    } else {
                        f2 = 100.0f;
                        f3 = 0.0f;
                        f4 = 0.0f;
                    }
                    String a9 = oye.a(xmlPullParser, "extent");
                    if (a9 == null && (a4 = oye.a(xmlPullParser, "style")) != null && (r2cVar2 = (r2c) hashMap.get(a4)) != null) {
                        a9 = r2cVar2.u;
                    }
                    if (a9 != null) {
                        Matcher matcher3 = pattern2.matcher(a9);
                        Matcher matcher4 = pattern.matcher(a9);
                        f5 = 1.0f;
                        if (matcher3.matches()) {
                            try {
                                String group5 = matcher3.group(1);
                                group5.getClass();
                                parseFloat = Float.parseFloat(group5) / f2;
                                String group6 = matcher3.group(2);
                                group6.getClass();
                                parseFloat2 = Float.parseFloat(group6) / f2;
                            } catch (NumberFormatException unused3) {
                                oo1.s("Ignoring region with malformed extent: ", a8, "TtmlParser");
                            }
                        } else if (!matcher4.matches()) {
                            oo1.s("Ignoring region with unsupported extent: ", a8, "TtmlParser");
                        } else if (zw8Var == null) {
                            oo1.s("Ignoring region with missing tts:extent: ", a8, "TtmlParser");
                        } else {
                            String group7 = matcher4.group(1);
                            group7.getClass();
                            int parseInt3 = Integer.parseInt(group7);
                            String group8 = matcher4.group(2);
                            group8.getClass();
                            float f10 = parseInt3 / zw8Var.b;
                            parseFloat2 = Integer.parseInt(group8) / zw8Var.c;
                            parseFloat = f10;
                        }
                        f6 = parseFloat;
                        f7 = parseFloat2;
                    } else {
                        f5 = 1.0f;
                        f6 = 1.0f;
                        f7 = 1.0f;
                    }
                    String a10 = oye.a(xmlPullParser, "displayAlign");
                    if (a10 == null && (a3 = oye.a(xmlPullParser, "style")) != null && (r2cVar = (r2c) hashMap.get(a3)) != null) {
                        a10 = r2cVar.v;
                    }
                    if (a10 != null) {
                        String c3 = smd.c(a10);
                        c3.getClass();
                        if (c3.equals("center")) {
                            i2 = i;
                            f8 = f3 + (f7 / 2.0f);
                            i3 = 1;
                        } else if (c3.equals("after")) {
                            i2 = i;
                            f8 = f3 + f7;
                            i3 = 2;
                        }
                        float f11 = f5 / i2;
                        a2 = oye.a(xmlPullParser, "writingMode");
                        if (a2 != null) {
                            String c4 = smd.c(a2);
                            c4.getClass();
                            switch (c4.hashCode()) {
                                case 3694:
                                    if (c4.equals("tb")) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 3553396:
                                    if (c4.equals("tblr")) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 3553576:
                                    if (c4.equals("tbrl")) {
                                        c2 = 2;
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
                                case 1:
                                    i4 = i6;
                                    break;
                                case 2:
                                    i4 = 1;
                                    break;
                            }
                            q2cVar = new q2c(a7, f4, f8, 0, i3, f6, f7, 1, f11, i4);
                            if (q2cVar != null) {
                                hashMap2.put(q2cVar.a, q2cVar);
                            }
                        }
                        i6 = TLObject.FLAG_31;
                        i4 = i6;
                        q2cVar = new q2c(a7, f4, f8, 0, i3, f6, f7, 1, f11, i4);
                        if (q2cVar != null) {
                        }
                    }
                    i2 = i;
                    f8 = f3;
                    i3 = 0;
                    float f112 = f5 / i2;
                    a2 = oye.a(xmlPullParser, "writingMode");
                    if (a2 != null) {
                    }
                    i6 = TLObject.FLAG_31;
                    i4 = i6;
                    q2cVar = new q2c(a7, f4, f8, 0, i3, f6, f7, 1, f112, i4);
                    if (q2cVar != null) {
                    }
                }
                q2cVar = null;
                if (q2cVar != null) {
                }
            } else if (oye.c(xmlPullParser, "metadata")) {
                do {
                    xmlPullParser.next();
                    if (oye.c(xmlPullParser, "image") && (a = oye.a(xmlPullParser, "id")) != null) {
                        hashMap3.put(a, xmlPullParser.nextText());
                    }
                } while (!oye.b(xmlPullParser, "metadata"));
            }
        } while (!oye.b(xmlPullParser, "head"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static n2c h(XmlPullParser xmlPullParser, n2c n2cVar, HashMap hashMap, o2c o2cVar) {
        long j;
        char c2;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        String[] strArr = null;
        r2c i = i(xmlPullParser, null);
        String str = null;
        String str2 = "";
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        long j4 = -9223372036854775807L;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            String attributeName = xmlPullParser.getAttributeName(i2);
            String attributeValue = xmlPullParser.getAttributeValue(i2);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c2 = 5;
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
                    if (hashMap.containsKey(attributeValue)) {
                        str2 = attributeValue;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    j4 = j(attributeValue, o2cVar);
                    break;
                case 2:
                    j3 = j(attributeValue, o2cVar);
                    break;
                case 3:
                    j2 = j(attributeValue, o2cVar);
                    break;
                case 4:
                    String trim = attributeValue.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        String str3 = g8c.a;
                        split = trim.split("\\s+", -1);
                    }
                    if (split.length > 0) {
                        strArr = split;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (attributeValue.startsWith("#")) {
                        str = attributeValue.substring(1);
                        break;
                    } else {
                        break;
                    }
            }
        }
        if (n2cVar != null) {
            long j5 = n2cVar.d;
            if (j5 != -9223372036854775807L) {
                j2 = j2 != -9223372036854775807L ? j2 + j5 : j5;
                if (j3 != -9223372036854775807L) {
                    j3 += j5;
                }
            }
        }
        if (j3 == -9223372036854775807L) {
            if (j4 != -9223372036854775807L) {
                j3 = j2 + j4;
            } else if (n2cVar != null) {
                long j6 = n2cVar.e;
                if (j6 != -9223372036854775807L) {
                    j = j6;
                    return new n2c(xmlPullParser.getName(), null, j2, j, i, strArr, str2, str, n2cVar);
                }
            }
        }
        j = j3;
        return new n2c(xmlPullParser.getName(), null, j2, j, i, strArr, str2, str, n2cVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0240  */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static r2c i(XmlPullParser xmlPullParser, r2c r2cVar) {
        char c2;
        ?? r9;
        boolean z;
        char c3;
        jhb jhbVar;
        int i;
        l7a d2;
        int i2;
        int hashCode;
        int i3;
        int i4;
        char c4;
        int attributeCount = xmlPullParser.getAttributeCount();
        r2c r2cVar2 = r2cVar;
        for (int i5 = 0; i5 < attributeCount; i5++) {
            String attributeValue = xmlPullParser.getAttributeValue(i5);
            String attributeName = xmlPullParser.getAttributeName(i5);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1289044182:
                    if (attributeName.equals("extent")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1008619738:
                    if (attributeName.equals("origin")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        c2 = '\t';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        c2 = '\n';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        c2 = 11;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        c2 = '\f';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        c2 = '\r';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        c2 = 14;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        c2 = 15;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1587328867:
                    if (attributeName.equals("displayAlign")) {
                        c2 = 16;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        c2 = 17;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            Layout.Alignment alignment = null;
            switch (c2) {
                case 0:
                    r2cVar2 = a(r2cVar2);
                    r2cVar2.i = "italic".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 1:
                    r2cVar2 = a(r2cVar2);
                    r2cVar2.u = attributeValue;
                    break;
                case 2:
                    r2cVar2 = a(r2cVar2);
                    r2cVar2.a = attributeValue;
                    break;
                case 3:
                    r2cVar2 = a(r2cVar2);
                    String c5 = smd.c(attributeValue);
                    c5.getClass();
                    switch (c5.hashCode()) {
                        case -1364013995:
                            if (c5.equals("center")) {
                                r9 = false;
                                break;
                            }
                            r9 = -1;
                            break;
                        case 100571:
                            if (c5.equals("end")) {
                                r9 = true;
                                break;
                            }
                            r9 = -1;
                            break;
                        case 3317767:
                            if (c5.equals("left")) {
                                r9 = 2;
                                break;
                            }
                            r9 = -1;
                            break;
                        case 108511772:
                            if (c5.equals("right")) {
                                r9 = 3;
                                break;
                            }
                            r9 = -1;
                            break;
                        case 109757538:
                            if (c5.equals("start")) {
                                r9 = 4;
                                break;
                            }
                            r9 = -1;
                            break;
                        default:
                            r9 = -1;
                            break;
                    }
                    switch (r9) {
                        case 0:
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case 1:
                        case 3:
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case 2:
                        case 4:
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            break;
                    }
                    r2cVar2.o = alignment;
                    break;
                case 4:
                    r2cVar2 = a(r2cVar2);
                    r2cVar2.t = attributeValue;
                    break;
                case 5:
                    String c6 = smd.c(attributeValue);
                    c6.getClass();
                    switch (c6.hashCode()) {
                        case -1461280213:
                            if (c6.equals("nounderline")) {
                                z = false;
                                break;
                            }
                            z = -1;
                            break;
                        case -1026963764:
                            if (c6.equals("underline")) {
                                z = true;
                                break;
                            }
                            z = -1;
                            break;
                        case 913457136:
                            if (c6.equals("nolinethrough")) {
                                z = 2;
                                break;
                            }
                            z = -1;
                            break;
                        case 1679736913:
                            if (c6.equals("linethrough")) {
                                z = 3;
                                break;
                            }
                            z = -1;
                            break;
                        default:
                            z = -1;
                            break;
                    }
                    switch (z) {
                        case false:
                            r2cVar2 = a(r2cVar2);
                            r2cVar2.g = 0;
                            break;
                        case true:
                            r2cVar2 = a(r2cVar2);
                            r2cVar2.g = 1;
                            break;
                        case true:
                            r2cVar2 = a(r2cVar2);
                            r2cVar2.f = 0;
                            break;
                        case true:
                            r2cVar2 = a(r2cVar2);
                            r2cVar2.f = 1;
                            break;
                    }
                case 6:
                    r2cVar2 = a(r2cVar2);
                    r2cVar2.h = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 7:
                    if ("style".equals(xmlPullParser.getName())) {
                        r2cVar2 = a(r2cVar2);
                        r2cVar2.l = attributeValue;
                        break;
                    } else {
                        break;
                    }
                case '\b':
                    String c7 = smd.c(attributeValue);
                    c7.getClass();
                    switch (c7.hashCode()) {
                        case -618561360:
                            if (c7.equals("baseContainer")) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -410956671:
                            if (c7.equals("container")) {
                                c3 = 1;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -250518009:
                            if (c7.equals("delimiter")) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -136074796:
                            if (c7.equals("textContainer")) {
                                c3 = 3;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3016401:
                            if (c7.equals("base")) {
                                c3 = 4;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3556653:
                            if (c7.equals("text")) {
                                c3 = 5;
                                break;
                            }
                            c3 = 65535;
                            break;
                        default:
                            c3 = 65535;
                            break;
                    }
                    switch (c3) {
                        case 0:
                        case 4:
                            r2cVar2 = a(r2cVar2);
                            r2cVar2.m = 2;
                            break;
                        case 1:
                            r2cVar2 = a(r2cVar2);
                            r2cVar2.m = 1;
                            break;
                        case 2:
                            r2cVar2 = a(r2cVar2);
                            r2cVar2.m = 4;
                            break;
                        case 3:
                        case 5:
                            r2cVar2 = a(r2cVar2);
                            r2cVar2.m = 3;
                            break;
                    }
                case '\t':
                    r2cVar2 = a(r2cVar2);
                    try {
                        r2cVar2.b = il2.a(attributeValue, false);
                        r2cVar2.c = true;
                        break;
                    } catch (IllegalArgumentException unused) {
                        oo1.s("Failed parsing color value: ", attributeValue, "TtmlParser");
                        break;
                    }
                case '\n':
                    r2c a = a(r2cVar2);
                    Matcher matcher = e.matcher(attributeValue);
                    float f2 = Float.MAX_VALUE;
                    if (matcher.matches()) {
                        try {
                            String group = matcher.group(1);
                            group.getClass();
                            f2 = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(group)));
                        } catch (NumberFormatException e2) {
                            lad.g("TtmlParser", "Failed to parse shear: " + attributeValue, e2);
                        }
                    } else {
                        oo1.s("Invalid value for shear: ", attributeValue, "TtmlParser");
                    }
                    a.s = f2;
                    r2cVar2 = a;
                    break;
                case 11:
                    String c8 = smd.c(attributeValue);
                    c8.getClass();
                    if (c8.equals("all")) {
                        r2cVar2 = a(r2cVar2);
                        r2cVar2.q = 1;
                        break;
                    } else if (c8.equals("none")) {
                        r2cVar2 = a(r2cVar2);
                        r2cVar2.q = 0;
                        break;
                    } else {
                        break;
                    }
                case '\f':
                    try {
                        r2cVar2 = a(r2cVar2);
                        d(attributeValue, r2cVar2);
                        break;
                    } catch (mab unused2) {
                        oo1.s("Failed parsing fontSize value: ", attributeValue, "TtmlParser");
                        break;
                    }
                case '\r':
                    r2cVar2 = a(r2cVar2);
                    Pattern pattern = jhb.d;
                    if (attributeValue != null) {
                        String c9 = smd.c(attributeValue.trim());
                        if (!c9.isEmpty()) {
                            String[] split = TextUtils.split(c9, jhb.d);
                            int length = split.length;
                            ym5 p = length != 0 ? length != 1 ? ym5.p(split.length, (Object[]) split.clone()) : new tia(split[0]) : d69.s;
                            String str = (String) jle.a(yte.d(jhb.h, p), "outside");
                            int hashCode2 = str.hashCode();
                            if (hashCode2 == -1392885889) {
                                str.equals("before");
                            } else if (hashCode2 != -1106037339) {
                                if (hashCode2 == 92734940 && str.equals("after")) {
                                    i = 2;
                                    d2 = yte.d(jhb.e, p);
                                    if (d2.isEmpty()) {
                                        l7a d3 = yte.d(jhb.g, p);
                                        l7a d4 = yte.d(jhb.f, p);
                                        if (d3.isEmpty() && d4.isEmpty()) {
                                            jhbVar = new jhb(-1, 0, i);
                                        } else {
                                            String str2 = (String) jle.a(d3, "filled");
                                            int hashCode3 = str2.hashCode();
                                            if (hashCode3 == -1274499742) {
                                                str2.equals("filled");
                                            } else if (hashCode3 == 3417674 && str2.equals("open")) {
                                                i2 = 2;
                                                String str3 = (String) jle.a(d4, "circle");
                                                hashCode = str3.hashCode();
                                                if (hashCode != -1360216880) {
                                                    str3.equals("circle");
                                                } else if (hashCode != -905816648) {
                                                    if (hashCode == 99657 && str3.equals("dot")) {
                                                        i3 = 2;
                                                        jhbVar = new jhb(i3, i2, i);
                                                    }
                                                } else if (str3.equals("sesame")) {
                                                    i3 = 3;
                                                    jhbVar = new jhb(i3, i2, i);
                                                }
                                                i3 = 1;
                                                jhbVar = new jhb(i3, i2, i);
                                            }
                                            i2 = 1;
                                            String str32 = (String) jle.a(d4, "circle");
                                            hashCode = str32.hashCode();
                                            if (hashCode != -1360216880) {
                                            }
                                            i3 = 1;
                                            jhbVar = new jhb(i3, i2, i);
                                        }
                                    } else {
                                        String str4 = (String) new js5(d2).next();
                                        int hashCode4 = str4.hashCode();
                                        if (hashCode4 == 3005871) {
                                            str4.equals("auto");
                                        } else if (hashCode4 == 3387192 && str4.equals("none")) {
                                            i4 = 0;
                                            jhbVar = new jhb(i4, 0, i);
                                        }
                                        i4 = -1;
                                        jhbVar = new jhb(i4, 0, i);
                                    }
                                    r2cVar2.r = jhbVar;
                                    break;
                                }
                            } else if (str.equals("outside")) {
                                i = -2;
                                d2 = yte.d(jhb.e, p);
                                if (d2.isEmpty()) {
                                }
                                r2cVar2.r = jhbVar;
                            }
                            i = 1;
                            d2 = yte.d(jhb.e, p);
                            if (d2.isEmpty()) {
                            }
                            r2cVar2.r = jhbVar;
                        }
                    }
                    jhbVar = null;
                    r2cVar2.r = jhbVar;
                    break;
                case 14:
                    String c10 = smd.c(attributeValue);
                    c10.getClass();
                    if (c10.equals("before")) {
                        r2cVar2 = a(r2cVar2);
                        r2cVar2.n = 1;
                        break;
                    } else if (c10.equals("after")) {
                        r2cVar2 = a(r2cVar2);
                        r2cVar2.n = 2;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    r2cVar2 = a(r2cVar2);
                    try {
                        r2cVar2.d = il2.a(attributeValue, false);
                        r2cVar2.e = true;
                        break;
                    } catch (IllegalArgumentException unused3) {
                        oo1.s("Failed parsing background value: ", attributeValue, "TtmlParser");
                        break;
                    }
                case 16:
                    r2cVar2 = a(r2cVar2);
                    r2cVar2.v = attributeValue;
                    break;
                case 17:
                    r2cVar2 = a(r2cVar2);
                    String c11 = smd.c(attributeValue);
                    c11.getClass();
                    switch (c11.hashCode()) {
                        case -1364013995:
                            if (c11.equals("center")) {
                                c4 = 0;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 100571:
                            if (c11.equals("end")) {
                                c4 = 1;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 3317767:
                            if (c11.equals("left")) {
                                c4 = 2;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 108511772:
                            if (c11.equals("right")) {
                                c4 = 3;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 109757538:
                            if (c11.equals("start")) {
                                c4 = 4;
                                break;
                            }
                            c4 = 65535;
                            break;
                        default:
                            c4 = 65535;
                            break;
                    }
                    switch (c4) {
                        case 0:
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case 1:
                        case 3:
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case 2:
                        case 4:
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            break;
                    }
                    r2cVar2.p = alignment;
                    break;
            }
        }
        return r2cVar2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a9, code lost:
    
        if (r13.equals("ms") == false) goto L36;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x00d5. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long j(String str, o2c o2cVar) {
        double d2;
        double d3;
        Matcher matcher = b.matcher(str);
        char c2 = 4;
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            double parseLong = Long.parseLong(group) * 3600;
            matcher.group(2).getClass();
            double parseLong2 = parseLong + (Long.parseLong(r13) * 60);
            matcher.group(3).getClass();
            double parseLong3 = parseLong2 + Long.parseLong(r13);
            String group2 = matcher.group(4);
            return (long) ((parseLong3 + (group2 != null ? Double.parseDouble(group2) : 0.0d) + (matcher.group(5) != null ? Long.parseLong(r13) / o2cVar.a : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / o2cVar.b) / o2cVar.a : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = c.matcher(str);
        if (!matcher2.matches()) {
            throw new mab(b00.h("Malformed time expression: ", str));
        }
        String group3 = matcher2.group(1);
        group3.getClass();
        double parseDouble = Double.parseDouble(group3);
        String group4 = matcher2.group(2);
        group4.getClass();
        switch (group4.hashCode()) {
            case kk7.m1 /* 102 */:
                if (group4.equals("f")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case kk7.o1 /* 104 */:
                if (group4.equals("h")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case kk7.t1 /* 109 */:
                if (group4.equals("m")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case kk7.A1 /* 116 */:
                if (group4.equals("t")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 3494:
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                d2 = o2cVar.a;
                parseDouble /= d2;
                break;
            case 1:
                d3 = 3600.0d;
                parseDouble *= d3;
                break;
            case 2:
                d3 = 60.0d;
                parseDouble *= d3;
                break;
            case 3:
                d2 = o2cVar.c;
                parseDouble /= d2;
                break;
            case 4:
                d2 = 1000.0d;
                parseDouble /= d2;
                break;
        }
        return (long) (parseDouble * 1000000.0d);
    }

    public static zw8 k(XmlPullParser xmlPullParser) {
        String a = oye.a(xmlPullParser, "extent");
        if (a == null) {
            return null;
        }
        Matcher matcher = h.matcher(a);
        if (!matcher.matches()) {
            lad.f("TtmlParser", "Ignoring non-pixel tts extent: ".concat(a));
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new zw8(parseInt, Integer.parseInt(group2), (byte) 7);
        } catch (NumberFormatException unused) {
            lad.f("TtmlParser", "Ignoring malformed tts extent: ".concat(a));
            return null;
        }
    }

    @Override // uab
    public final kab f(int i, int i2, byte[] bArr) {
        kab kabVar;
        kab kabVar2 = null;
        try {
            XmlPullParser newPullParser = this.a.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new q2c("", -3.4028235E38f, -3.4028235E38f, TLObject.FLAG_31, TLObject.FLAG_31, -3.4028235E38f, -3.4028235E38f, TLObject.FLAG_31, -3.4028235E38f, TLObject.FLAG_31));
            newPullParser.setInput(new ByteArrayInputStream(bArr, i, i2), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            int eventType = newPullParser.getEventType();
            o2c o2cVar = r;
            int i3 = 15;
            int i4 = 0;
            gl2 gl2Var = null;
            zw8 zw8Var = null;
            while (eventType != 1) {
                n2c n2cVar = (n2c) arrayDeque.peek();
                if (i4 == 0) {
                    String name = newPullParser.getName();
                    kabVar = kabVar2;
                    if (eventType == 2) {
                        try {
                            if ("tt".equals(name)) {
                                o2cVar = e(newPullParser);
                                i3 = c(newPullParser);
                                zw8Var = k(newPullParser);
                            }
                            o2c o2cVar2 = o2cVar;
                            int i5 = i3;
                            zw8 zw8Var2 = zw8Var;
                            if (b(name)) {
                                if ("head".equals(name)) {
                                    g(newPullParser, hashMap, i5, zw8Var2, hashMap2, hashMap3);
                                } else {
                                    try {
                                        n2c h2 = h(newPullParser, n2cVar, hashMap2, o2cVar2);
                                        arrayDeque.push(h2);
                                        if (n2cVar != null) {
                                            ArrayList arrayList = n2cVar.m;
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                                n2cVar.m = arrayList;
                                            }
                                            arrayList.add(h2);
                                        }
                                    } catch (mab e2) {
                                        lad.g("TtmlParser", "Suppressing parser error", e2);
                                    }
                                }
                                zw8Var = zw8Var2;
                                i3 = i5;
                                o2cVar = o2cVar2;
                            } else {
                                lad.e("TtmlParser", "Ignoring unsupported tag: " + newPullParser.getName());
                            }
                            i4++;
                            zw8Var = zw8Var2;
                            i3 = i5;
                            o2cVar = o2cVar2;
                        } catch (IOException e3) {
                            e = e3;
                            k93.h("Unexpected error when reading input.", e);
                            return kabVar;
                        } catch (XmlPullParserException e4) {
                            e = e4;
                            k93.h("Unable to decode source", e);
                            return kabVar;
                        }
                    } else if (eventType == 4) {
                        n2cVar.getClass();
                        n2c a = n2c.a(newPullParser.getText());
                        ArrayList arrayList2 = n2cVar.m;
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            n2cVar.m = arrayList2;
                        }
                        arrayList2.add(a);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            n2c n2cVar2 = (n2c) arrayDeque.peek();
                            n2cVar2.getClass();
                            gl2Var = new gl2(n2cVar2, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else {
                    kabVar = kabVar2;
                    if (eventType == 2) {
                        i4++;
                    } else if (eventType == 3) {
                        i4--;
                    }
                }
                newPullParser.next();
                eventType = newPullParser.getEventType();
                kabVar2 = kabVar;
            }
            kabVar = kabVar2;
            gl2Var.getClass();
            return gl2Var;
        } catch (IOException e5) {
            e = e5;
            kabVar = kabVar2;
        } catch (XmlPullParserException e6) {
            e = e6;
            kabVar = kabVar2;
        }
    }

    @Override // uab
    public final void l(byte[] bArr, int i, int i2, tab tabVar, us2 us2Var) {
        lne.b(f(i, i2, bArr), tabVar, us2Var);
    }

    @Override // uab
    public final int o() {
        return 1;
    }

    @Override // uab
    public final void reset() {
    }
}
