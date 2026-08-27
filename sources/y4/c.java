package y4;

import a9.p;
import af.h;
import android.text.Layout;
import android.text.TextUtils;
import d5.g0;
import h7.d0;
import hh.j4;
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
import p8.c0;
import p8.l;
import p8.r0;
import p8.t0;
import p8.w0;
import r4.g;
import r4.i;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class c extends r4.f {
    public static final Pattern c = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern d = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern e = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern g = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    public static final Pattern h = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    public static final Pattern i = Pattern.compile("^(\\d+) (\\d+)$");
    public static final j4 j = new j4(30.0f, 1, 1);
    public static final com.google.android.gms.internal.cast.a k = new com.google.android.gms.internal.cast.a(15);
    public final XmlPullParserFactory b;

    public c() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.b = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e9) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e9);
        }
    }

    public static f d(f fVar) {
        return fVar == null ? new f() : fVar;
    }

    public static boolean e(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static com.google.android.gms.internal.cast.a f(XmlPullParser xmlPullParser, com.google.android.gms.internal.cast.a aVar) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = i.matcher(attributeValue);
        if (!matcher.matches()) {
            d5.a.K("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return aVar;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            int parseInt2 = Integer.parseInt(group2);
            if (parseInt != 0 && parseInt2 != 0) {
                return new com.google.android.gms.internal.cast.a(parseInt2);
            }
            throw new i("Invalid cell resolution " + parseInt + " " + parseInt2);
        } catch (NumberFormatException unused) {
            d5.a.K("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return aVar;
        }
    }

    public static void g(String str, f fVar) {
        Matcher matcher;
        String group;
        int i10 = g0.a;
        String[] split = str.split("\\s+", -1);
        int length = split.length;
        Pattern pattern = e;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (split.length != 2) {
                throw new i(p.k(split.length, ".", new StringBuilder("Invalid number of entries for fontSize: ")));
            }
            matcher = pattern.matcher(split[1]);
            d5.a.K("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new i(p.m("Invalid expression for fontSize: '", str, "'."));
        }
        group = matcher.group(3);
        group.getClass();
        switch (group) {
            case "%":
                fVar.j = 3;
                break;
            case "em":
                fVar.j = 2;
                break;
            case "px":
                fVar.j = 1;
                break;
            default:
                throw new i(p.m("Invalid unit for fontSize: '", group, "'."));
        }
        String group2 = matcher.group(1);
        group2.getClass();
        fVar.k = Float.parseFloat(group2);
    }

    public static j4 h(XmlPullParser xmlPullParser) {
        float f10;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i10 = g0.a;
            if (attributeValue2.split(" ", -1).length != 2) {
                throw new i("frameRateMultiplier doesn't have 2 parts");
            }
            f10 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f10 = 1.0f;
        }
        j4 j4Var = j;
        int i11 = j4Var.b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i11 = Integer.parseInt(attributeValue3);
        }
        int i12 = j4Var.c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i12 = Integer.parseInt(attributeValue4);
        }
        return new j4(parseInt * f10, i11, i12);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:33:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void i(XmlPullParser xmlPullParser, HashMap hashMap, com.google.android.gms.internal.cast.a aVar, d5.p pVar, HashMap hashMap2, HashMap hashMap3) {
        String t10;
        float parseFloat;
        float parseFloat2;
        float parseFloat3;
        float parseFloat4;
        com.google.android.gms.internal.cast.a aVar2;
        float f10;
        float f11;
        int i10;
        String t11;
        int i11;
        e eVar;
        char c10;
        String[] split;
        do {
            xmlPullParser.next();
            if (d5.a.z(xmlPullParser, "style")) {
                String t12 = d5.a.t(xmlPullParser, "style");
                f k10 = k(xmlPullParser, new f());
                if (t12 != null) {
                    String trim = t12.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        int i12 = g0.a;
                        split = trim.split("\\s+", -1);
                    }
                    for (String str : split) {
                        k10.a((f) hashMap.get(str));
                    }
                }
                String str2 = k10.l;
                if (str2 != null) {
                    hashMap.put(str2, k10);
                }
            } else if (d5.a.z(xmlPullParser, "region")) {
                String t13 = d5.a.t(xmlPullParser, "id");
                if (t13 != null) {
                    String t14 = d5.a.t(xmlPullParser, "origin");
                    if (t14 != null) {
                        Pattern pattern = g;
                        Matcher matcher = pattern.matcher(t14);
                        Pattern pattern2 = h;
                        Matcher matcher2 = pattern2.matcher(t14);
                        if (matcher.matches()) {
                            try {
                                String group = matcher.group(1);
                                group.getClass();
                                parseFloat = Float.parseFloat(group) / 100.0f;
                                String group2 = matcher.group(2);
                                group2.getClass();
                                parseFloat2 = Float.parseFloat(group2) / 100.0f;
                            } catch (NumberFormatException unused) {
                                d5.a.K("TtmlDecoder", "Ignoring region with malformed origin: ".concat(t14));
                            }
                        } else if (!matcher2.matches()) {
                            d5.a.K("TtmlDecoder", "Ignoring region with unsupported origin: ".concat(t14));
                        } else if (pVar == null) {
                            d5.a.K("TtmlDecoder", "Ignoring region with missing tts:extent: ".concat(t14));
                        } else {
                            try {
                                String group3 = matcher2.group(1);
                                group3.getClass();
                                int parseInt = Integer.parseInt(group3);
                                String group4 = matcher2.group(2);
                                group4.getClass();
                                float f12 = parseInt / pVar.a;
                                parseFloat2 = Integer.parseInt(group4) / pVar.b;
                                parseFloat = f12;
                            } catch (NumberFormatException unused2) {
                                d5.a.K("TtmlDecoder", "Ignoring region with malformed origin: ".concat(t14));
                            }
                        }
                        String t15 = d5.a.t(xmlPullParser, "extent");
                        if (t15 != null) {
                            Matcher matcher3 = pattern.matcher(t15);
                            Matcher matcher4 = pattern2.matcher(t15);
                            if (matcher3.matches()) {
                                try {
                                    String group5 = matcher3.group(1);
                                    group5.getClass();
                                    parseFloat3 = Float.parseFloat(group5) / 100.0f;
                                    String group6 = matcher3.group(2);
                                    group6.getClass();
                                    parseFloat4 = Float.parseFloat(group6) / 100.0f;
                                } catch (NumberFormatException unused3) {
                                    d5.a.K("TtmlDecoder", "Ignoring region with malformed extent: ".concat(t14));
                                }
                            } else if (!matcher4.matches()) {
                                d5.a.K("TtmlDecoder", "Ignoring region with unsupported extent: ".concat(t14));
                            } else if (pVar == null) {
                                d5.a.K("TtmlDecoder", "Ignoring region with missing tts:extent: ".concat(t14));
                            } else {
                                try {
                                    String group7 = matcher4.group(1);
                                    group7.getClass();
                                    int parseInt2 = Integer.parseInt(group7);
                                    String group8 = matcher4.group(2);
                                    group8.getClass();
                                    parseFloat3 = parseInt2 / pVar.a;
                                    parseFloat4 = Integer.parseInt(group8) / pVar.b;
                                } catch (NumberFormatException unused4) {
                                    d5.a.K("TtmlDecoder", "Ignoring region with malformed extent: ".concat(t14));
                                }
                            }
                            float f13 = parseFloat3;
                            String t16 = d5.a.t(xmlPullParser, "displayAlign");
                            if (t16 != null) {
                                String b10 = d0.b(t16);
                                b10.getClass();
                                if (b10.equals("center")) {
                                    aVar2 = aVar;
                                    f10 = parseFloat2 + (parseFloat4 / 2.0f);
                                    f11 = parseFloat;
                                    i10 = 1;
                                } else if (b10.equals("after")) {
                                    aVar2 = aVar;
                                    f10 = parseFloat2 + parseFloat4;
                                    f11 = parseFloat;
                                    i10 = 2;
                                }
                                float f14 = 1.0f / aVar2.a;
                                t11 = d5.a.t(xmlPullParser, "writingMode");
                                if (t11 != null) {
                                    String b11 = d0.b(t11);
                                    b11.getClass();
                                    switch (b11.hashCode()) {
                                        case 3694:
                                            if (b11.equals("tb")) {
                                                c10 = 0;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 3553396:
                                            if (b11.equals("tblr")) {
                                                c10 = 1;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 3553576:
                                            if (b11.equals("tbrl")) {
                                                c10 = 2;
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
                                        case 1:
                                            i11 = 2;
                                            break;
                                        case 2:
                                            i11 = 1;
                                            break;
                                    }
                                    eVar = new e(t13, f11, f10, 0, i10, f13, parseFloat4, 1, f14, i11);
                                    if (eVar != null) {
                                        hashMap2.put(eVar.a, eVar);
                                    }
                                }
                                i11 = TLObject.FLAG_31;
                                eVar = new e(t13, f11, f10, 0, i10, f13, parseFloat4, 1, f14, i11);
                                if (eVar != null) {
                                }
                            }
                            aVar2 = aVar;
                            f10 = parseFloat2;
                            f11 = parseFloat;
                            i10 = 0;
                            float f142 = 1.0f / aVar2.a;
                            t11 = d5.a.t(xmlPullParser, "writingMode");
                            if (t11 != null) {
                            }
                            i11 = TLObject.FLAG_31;
                            eVar = new e(t13, f11, f10, 0, i10, f13, parseFloat4, 1, f142, i11);
                            if (eVar != null) {
                            }
                        } else {
                            d5.a.K("TtmlDecoder", "Ignoring region without an extent");
                        }
                    } else {
                        d5.a.K("TtmlDecoder", "Ignoring region without an origin");
                    }
                    eVar = null;
                    if (eVar != null) {
                    }
                }
                eVar = null;
                if (eVar != null) {
                }
            } else if (d5.a.z(xmlPullParser, "metadata")) {
                do {
                    xmlPullParser.next();
                    if (d5.a.z(xmlPullParser, "image") && (t10 = d5.a.t(xmlPullParser, "id")) != null) {
                        hashMap3.put(t10, xmlPullParser.nextText());
                    }
                } while (!d5.a.y(xmlPullParser, "metadata"));
            }
        } while (!d5.a.y(xmlPullParser, "head"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static d j(XmlPullParser xmlPullParser, d dVar, HashMap hashMap, j4 j4Var) {
        long j10;
        char c10;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        String[] strArr = null;
        f k10 = k(xmlPullParser, null);
        String str = null;
        String str2 = "";
        long j11 = -9223372036854775807L;
        long j12 = -9223372036854775807L;
        long j13 = -9223372036854775807L;
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c10 = 5;
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
                    if (!hashMap.containsKey(attributeValue)) {
                        break;
                    } else {
                        str2 = attributeValue;
                        continue;
                    }
                case 1:
                    j13 = l(attributeValue, j4Var);
                    break;
                case 2:
                    j12 = l(attributeValue, j4Var);
                    break;
                case 3:
                    j11 = l(attributeValue, j4Var);
                    break;
                case 4:
                    String trim = attributeValue.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        int i11 = g0.a;
                        split = trim.split("\\s+", -1);
                    }
                    if (split.length > 0) {
                        strArr = split;
                        break;
                    }
                    break;
                case 5:
                    if (attributeValue.startsWith("#")) {
                        str = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (dVar != null) {
            long j14 = dVar.d;
            if (j14 != -9223372036854775807L) {
                if (j11 != -9223372036854775807L) {
                    j11 += j14;
                }
                if (j12 != -9223372036854775807L) {
                    j12 += j14;
                }
            }
        }
        if (j12 == -9223372036854775807L) {
            if (j13 != -9223372036854775807L) {
                j12 = j11 + j13;
            } else if (dVar != null) {
                long j15 = dVar.e;
                if (j15 != -9223372036854775807L) {
                    j10 = j15;
                    return new d(xmlPullParser.getName(), null, j11, j10, k10, strArr, str2, str, dVar);
                }
            }
        }
        j10 = j12;
        return new d(xmlPullParser.getName(), null, j11, j10, k10, strArr, str2, str, dVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0295  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static f k(XmlPullParser xmlPullParser, f fVar) {
        char c10;
        char c11;
        char c12;
        char c13;
        int i10;
        t0 i11;
        int i12;
        int hashCode;
        int i13;
        b bVar;
        int i14;
        char c14;
        int attributeCount = xmlPullParser.getAttributeCount();
        f fVar2 = fVar;
        for (int i15 = 0; i15 < attributeCount; i15++) {
            String attributeValue = xmlPullParser.getAttributeValue(i15);
            String attributeName = xmlPullParser.getAttributeName(i15);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        c10 = 7;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        c10 = '\b';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        c10 = '\t';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        c10 = '\n';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        c10 = 11;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        c10 = '\f';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        c10 = '\r';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        c10 = 14;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            Layout.Alignment alignment = null;
            switch (c10) {
                case 0:
                    fVar2 = d(fVar2);
                    fVar2.i = "italic".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 1:
                    fVar2 = d(fVar2);
                    fVar2.a = attributeValue;
                    break;
                case 2:
                    fVar2 = d(fVar2);
                    String b10 = d0.b(attributeValue);
                    b10.getClass();
                    switch (b10.hashCode()) {
                        case -1364013995:
                            if (b10.equals("center")) {
                                c11 = 0;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 100571:
                            if (b10.equals("end")) {
                                c11 = 1;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 3317767:
                            if (b10.equals("left")) {
                                c11 = 2;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 108511772:
                            if (b10.equals("right")) {
                                c11 = 3;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 109757538:
                            if (b10.equals("start")) {
                                c11 = 4;
                                break;
                            }
                            c11 = 65535;
                            break;
                        default:
                            c11 = 65535;
                            break;
                    }
                    switch (c11) {
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
                    fVar2.o = alignment;
                    break;
                case 3:
                    String b11 = d0.b(attributeValue);
                    b11.getClass();
                    switch (b11.hashCode()) {
                        case -1461280213:
                            if (b11.equals("nounderline")) {
                                c12 = 0;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case -1026963764:
                            if (b11.equals("underline")) {
                                c12 = 1;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case 913457136:
                            if (b11.equals("nolinethrough")) {
                                c12 = 2;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case 1679736913:
                            if (b11.equals("linethrough")) {
                                c12 = 3;
                                break;
                            }
                            c12 = 65535;
                            break;
                        default:
                            c12 = 65535;
                            break;
                    }
                    switch (c12) {
                        case 0:
                            fVar2 = d(fVar2);
                            fVar2.g = 0;
                            break;
                        case 1:
                            fVar2 = d(fVar2);
                            fVar2.g = 1;
                            break;
                        case 2:
                            fVar2 = d(fVar2);
                            fVar2.f = 0;
                            break;
                        case 3:
                            fVar2 = d(fVar2);
                            fVar2.f = 1;
                            break;
                    }
                case 4:
                    fVar2 = d(fVar2);
                    fVar2.h = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 5:
                    if ("style".equals(xmlPullParser.getName())) {
                        fVar2 = d(fVar2);
                        fVar2.l = attributeValue;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    String b12 = d0.b(attributeValue);
                    b12.getClass();
                    switch (b12.hashCode()) {
                        case -618561360:
                            if (b12.equals("baseContainer")) {
                                c13 = 0;
                                break;
                            }
                            c13 = 65535;
                            break;
                        case -410956671:
                            if (b12.equals("container")) {
                                c13 = 1;
                                break;
                            }
                            c13 = 65535;
                            break;
                        case -250518009:
                            if (b12.equals("delimiter")) {
                                c13 = 2;
                                break;
                            }
                            c13 = 65535;
                            break;
                        case -136074796:
                            if (b12.equals("textContainer")) {
                                c13 = 3;
                                break;
                            }
                            c13 = 65535;
                            break;
                        case 3016401:
                            if (b12.equals("base")) {
                                c13 = 4;
                                break;
                            }
                            c13 = 65535;
                            break;
                        case 3556653:
                            if (b12.equals("text")) {
                                c13 = 5;
                                break;
                            }
                            c13 = 65535;
                            break;
                        default:
                            c13 = 65535;
                            break;
                    }
                    switch (c13) {
                        case 0:
                        case 4:
                            fVar2 = d(fVar2);
                            fVar2.m = 2;
                            break;
                        case 1:
                            fVar2 = d(fVar2);
                            fVar2.m = 1;
                            break;
                        case 2:
                            fVar2 = d(fVar2);
                            fVar2.m = 4;
                            break;
                        case 3:
                        case 5:
                            fVar2 = d(fVar2);
                            fVar2.m = 3;
                            break;
                    }
                case 7:
                    fVar2 = d(fVar2);
                    try {
                        fVar2.b = d5.b.a(attributeValue, false);
                        fVar2.c = true;
                        break;
                    } catch (IllegalArgumentException unused) {
                        s3.c.k("Failed parsing color value: ", attributeValue, "TtmlDecoder");
                        break;
                    }
                case '\b':
                    f d10 = d(fVar2);
                    Matcher matcher = f.matcher(attributeValue);
                    float f10 = Float.MAX_VALUE;
                    if (matcher.matches()) {
                        try {
                            String group = matcher.group(1);
                            group.getClass();
                            f10 = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(group)));
                        } catch (NumberFormatException e9) {
                            d5.a.L("TtmlDecoder", "Failed to parse shear: " + attributeValue, e9);
                        }
                    } else {
                        s3.c.k("Invalid value for shear: ", attributeValue, "TtmlDecoder");
                    }
                    d10.s = f10;
                    fVar2 = d10;
                    break;
                case '\t':
                    String b13 = d0.b(attributeValue);
                    b13.getClass();
                    if (b13.equals("all")) {
                        fVar2 = d(fVar2);
                        fVar2.q = 1;
                        break;
                    } else if (b13.equals("none")) {
                        fVar2 = d(fVar2);
                        fVar2.q = 0;
                        break;
                    } else {
                        break;
                    }
                case '\n':
                    try {
                        fVar2 = d(fVar2);
                        g(attributeValue, fVar2);
                        break;
                    } catch (i unused2) {
                        s3.c.k("Failed parsing fontSize value: ", attributeValue, "TtmlDecoder");
                        break;
                    }
                case 11:
                    fVar2 = d(fVar2);
                    Pattern pattern = b.b;
                    if (attributeValue != null) {
                        String b14 = d0.b(attributeValue.trim());
                        if (!b14.isEmpty()) {
                            String[] split = TextUtils.split(b14, b.b);
                            int length = split.length;
                            c0 t10 = length != 0 ? length != 1 ? c0.t(split.length, (Object[]) split.clone()) : new w0(split[0]) : r0.s;
                            String str = (String) l.f(l.i(b.f, t10), "outside");
                            int hashCode2 = str.hashCode();
                            if (hashCode2 != -1392885889) {
                                if (hashCode2 != -1106037339) {
                                    if (hashCode2 == 92734940 && str.equals("after")) {
                                        i10 = 2;
                                        i11 = l.i(b.c, t10);
                                        if (i11.isEmpty()) {
                                            t0 i16 = l.i(b.e, t10);
                                            t0 i17 = l.i(b.d, t10);
                                            if (i16.isEmpty() && i17.isEmpty()) {
                                                bVar = new b(-1, 0, i10);
                                            } else {
                                                String str2 = (String) l.f(i16, "filled");
                                                int hashCode3 = str2.hashCode();
                                                if (hashCode3 == -1274499742) {
                                                    str2.equals("filled");
                                                } else if (hashCode3 == 3417674 && str2.equals("open")) {
                                                    i12 = 2;
                                                    String str3 = (String) l.f(i17, "circle");
                                                    hashCode = str3.hashCode();
                                                    if (hashCode != -1360216880) {
                                                        str3.equals("circle");
                                                    } else if (hashCode != -905816648) {
                                                        if (hashCode == 99657 && str3.equals("dot")) {
                                                            i13 = 2;
                                                            bVar = new b(i13, i12, i10);
                                                        }
                                                    } else if (str3.equals("sesame")) {
                                                        i13 = 3;
                                                        bVar = new b(i13, i12, i10);
                                                    }
                                                    i13 = 1;
                                                    bVar = new b(i13, i12, i10);
                                                }
                                                i12 = 1;
                                                String str32 = (String) l.f(i17, "circle");
                                                hashCode = str32.hashCode();
                                                if (hashCode != -1360216880) {
                                                }
                                                i13 = 1;
                                                bVar = new b(i13, i12, i10);
                                            }
                                        } else {
                                            String str4 = (String) new p8.d0(i11).next();
                                            int hashCode4 = str4.hashCode();
                                            if (hashCode4 == 3005871) {
                                                str4.equals("auto");
                                            } else if (hashCode4 == 3387192 && str4.equals("none")) {
                                                i14 = 0;
                                                bVar = new b(i14, 0, i10);
                                            }
                                            i14 = -1;
                                            bVar = new b(i14, 0, i10);
                                        }
                                    }
                                } else if (str.equals("outside")) {
                                    i10 = -2;
                                    i11 = l.i(b.c, t10);
                                    if (i11.isEmpty()) {
                                    }
                                }
                                fVar2.r = bVar;
                                break;
                            } else {
                                str.equals("before");
                            }
                            i10 = 1;
                            i11 = l.i(b.c, t10);
                            if (i11.isEmpty()) {
                            }
                            fVar2.r = bVar;
                        }
                    }
                    bVar = null;
                    fVar2.r = bVar;
                    break;
                case '\f':
                    String b15 = d0.b(attributeValue);
                    b15.getClass();
                    if (b15.equals("before")) {
                        fVar2 = d(fVar2);
                        fVar2.n = 1;
                        break;
                    } else if (b15.equals("after")) {
                        fVar2 = d(fVar2);
                        fVar2.n = 2;
                        break;
                    } else {
                        break;
                    }
                case '\r':
                    fVar2 = d(fVar2);
                    try {
                        fVar2.d = d5.b.a(attributeValue, false);
                        fVar2.e = true;
                        break;
                    } catch (IllegalArgumentException unused3) {
                        s3.c.k("Failed parsing background value: ", attributeValue, "TtmlDecoder");
                        break;
                    }
                case 14:
                    fVar2 = d(fVar2);
                    String b16 = d0.b(attributeValue);
                    b16.getClass();
                    switch (b16.hashCode()) {
                        case -1364013995:
                            if (b16.equals("center")) {
                                c14 = 0;
                                break;
                            }
                            c14 = 65535;
                            break;
                        case 100571:
                            if (b16.equals("end")) {
                                c14 = 1;
                                break;
                            }
                            c14 = 65535;
                            break;
                        case 3317767:
                            if (b16.equals("left")) {
                                c14 = 2;
                                break;
                            }
                            c14 = 65535;
                            break;
                        case 108511772:
                            if (b16.equals("right")) {
                                c14 = 3;
                                break;
                            }
                            c14 = 65535;
                            break;
                        case 109757538:
                            if (b16.equals("start")) {
                                c14 = 4;
                                break;
                            }
                            c14 = 65535;
                            break;
                        default:
                            c14 = 65535;
                            break;
                    }
                    switch (c14) {
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
                    fVar2.p = alignment;
                    break;
            }
        }
        return fVar2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ad, code lost:
    
        if (r13.equals("ms") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long l(String str, j4 j4Var) {
        double d10;
        double d11;
        Matcher matcher = c.matcher(str);
        char c10 = 4;
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            double parseLong = Long.parseLong(group) * 3600;
            matcher.group(2).getClass();
            double parseLong2 = parseLong + (Long.parseLong(r13) * 60);
            matcher.group(3).getClass();
            double parseLong3 = parseLong2 + Long.parseLong(r13);
            String group2 = matcher.group(4);
            return (long) ((parseLong3 + (group2 != null ? Double.parseDouble(group2) : 0.0d) + (matcher.group(5) != null ? Long.parseLong(r13) / j4Var.a : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / j4Var.b) / j4Var.a : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = d.matcher(str);
        if (!matcher2.matches()) {
            throw new i(s3.c.e("Malformed time expression: ", str));
        }
        String group3 = matcher2.group(1);
        group3.getClass();
        double parseDouble = Double.parseDouble(group3);
        String group4 = matcher2.group(2);
        group4.getClass();
        switch (group4.hashCode()) {
            case 102:
                if (group4.equals("f")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 104:
                if (group4.equals("h")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 109:
                if (group4.equals("m")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 116:
                if (group4.equals("t")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 3494:
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
                d10 = j4Var.a;
                parseDouble /= d10;
                break;
            case 1:
                d11 = 3600.0d;
                break;
            case 2:
                d11 = 60.0d;
                break;
            case 3:
                d10 = j4Var.c;
                parseDouble /= d10;
                break;
            case 4:
                d10 = 1000.0d;
                parseDouble /= d10;
                break;
        }
        parseDouble *= d11;
        return (long) (parseDouble * 1000000.0d);
    }

    public static d5.p m(XmlPullParser xmlPullParser) {
        String t10 = d5.a.t(xmlPullParser, "extent");
        if (t10 == null) {
            return null;
        }
        Matcher matcher = h.matcher(t10);
        if (!matcher.matches()) {
            d5.a.K("TtmlDecoder", "Ignoring non-pixel tts extent: ".concat(t10));
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new d5.p(parseInt, Integer.parseInt(group2));
        } catch (NumberFormatException unused) {
            d5.a.K("TtmlDecoder", "Ignoring malformed tts extent: ".concat(t10));
            return null;
        }
    }

    @Override // r4.f
    public final g c(int i10, boolean z10, byte[] bArr) {
        try {
            XmlPullParser newPullParser = this.b.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new e("", -3.4028235E38f, -3.4028235E38f, TLObject.FLAG_31, TLObject.FLAG_31, -3.4028235E38f, -3.4028235E38f, TLObject.FLAG_31, -3.4028235E38f, TLObject.FLAG_31));
            d5.p pVar = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i10), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            j4 j4Var = j;
            com.google.android.gms.internal.cast.a aVar = k;
            h hVar = null;
            j4 j4Var2 = j4Var;
            com.google.android.gms.internal.cast.a aVar2 = aVar;
            int i11 = 0;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                d dVar = (d) arrayDeque.peek();
                if (i11 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            j4Var2 = h(newPullParser);
                            aVar2 = f(newPullParser, aVar);
                            pVar = m(newPullParser);
                        }
                        j4 j4Var3 = j4Var2;
                        com.google.android.gms.internal.cast.a aVar3 = aVar2;
                        if (e(name)) {
                            if ("head".equals(name)) {
                                i(newPullParser, hashMap, aVar3, pVar, hashMap2, hashMap3);
                            } else {
                                try {
                                    d j10 = j(newPullParser, dVar, hashMap2, j4Var3);
                                    arrayDeque.push(j10);
                                    if (dVar != null) {
                                        if (dVar.m == null) {
                                            dVar.m = new ArrayList();
                                        }
                                        dVar.m.add(j10);
                                    }
                                } catch (i e9) {
                                    d5.a.L("TtmlDecoder", "Suppressing parser error", e9);
                                }
                            }
                            aVar2 = aVar3;
                            j4Var2 = j4Var3;
                        } else {
                            d5.a.v("TtmlDecoder", "Ignoring unsupported tag: " + newPullParser.getName());
                        }
                        i11++;
                        aVar2 = aVar3;
                        j4Var2 = j4Var3;
                    } else if (eventType == 4) {
                        dVar.getClass();
                        d a2 = d.a(newPullParser.getText());
                        if (dVar.m == null) {
                            dVar.m = new ArrayList();
                        }
                        dVar.m.add(a2);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            d dVar2 = (d) arrayDeque.peek();
                            dVar2.getClass();
                            hVar = new h(dVar2, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i11++;
                } else if (eventType == 3) {
                    i11--;
                }
                newPullParser.next();
            }
            if (hVar != null) {
                return hVar;
            }
            throw new i("No TTML subtitles found");
        } catch (IOException e10) {
            throw new IllegalStateException("Unexpected error when reading input.", e10);
        } catch (XmlPullParserException e11) {
            throw new i("Unable to decode source", e11);
        }
    }
}
