// default package

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.tgnet.TLObject;
import org.webrtc.MediaStreamTrack;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class v63 extends DefaultHandler implements cx7 {
    public static final Pattern b = Pattern.compile("(\\d+)(?:/(\\d+))?");
    public static final Pattern c = Pattern.compile("CC([1-4])=.*");
    public static final Pattern d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    public static final int[] e = {2, 1, 2, 2, 2, 2, 1, 2, 2, 1, 1, 1, 1, 2, 1, 1, 2, 2, 2};
    public static final int[] f = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};
    public final XmlPullParserFactory a;

    public v63() {
        try {
            this.a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e2) {
            rjb.k("Couldn't create XmlPullParserFactory instance", e2);
            throw null;
        }
    }

    public static long a(ArrayList arrayList, long j, long j2, int i, long j3) {
        int i2;
        if (i >= 0) {
            i2 = i + 1;
        } else {
            String str = hac.a;
            i2 = (int) ((((j3 - j) + j2) - 1) / j2);
        }
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(new ux9(j, j2));
            j += j2;
        }
        return j;
    }

    public static void b(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() == 2) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (xmlPullParser.getEventType() == 2) {
                    i++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i--;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0085, code lost:
    
        if (r13 != 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0198, code lost:
    
        r10 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bb, code lost:
    
        if (r13.equals("fa01") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0183, code lost:
    
        if (r13 == 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0196, code lost:
    
        if (r13 < 33) goto L111;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int c(XmlPullParser xmlPullParser, String str) {
        char c2;
        int parseInt;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = null;
        }
        attributeValue.getClass();
        int i = 5;
        char c3 = 4;
        int i2 = 0;
        int i3 = -1;
        switch (attributeValue.hashCode()) {
            case -2128649360:
                if (attributeValue.equals("urn:dts:dash:audio_channel_configuration:2012")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -2060825028:
                if (attributeValue.equals("tag:dolby.com,2015:dash:audio_channel_configuration:2015")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1352850286:
                if (attributeValue.equals("urn:mpeg:dash:23003:3:audio_channel_configuration:2011")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -1138141449:
                if (attributeValue.equals("tag:dolby.com,2014:dash:audio_channel_configuration:2011")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -986633423:
                if (attributeValue.equals("urn:mpeg:mpegB:cicp:ChannelConfiguration")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -79006963:
                if (attributeValue.equals("tag:dts.com,2014:dash:audio_channel_configuration:2012")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 312179081:
                if (attributeValue.equals("tag:dts.com,2018:uhd:audio_channel_configuration")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 2036691300:
                if (attributeValue.equals("urn:dolby:dash:audio_channel_configuration:2011")) {
                    c2 = 7;
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
            case 5:
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
                parseInt = attributeValue2 == null ? -1 : Integer.parseInt(attributeValue2);
                if (parseInt > 0) {
                    break;
                }
                break;
            case 1:
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue3 != null && attributeValue3.length() == 6) {
                    int parseInt2 = Integer.parseInt(attributeValue3, 16);
                    if ((8388608 & parseInt2) == 0) {
                        parseInt = 0;
                        while (true) {
                            int[] iArr = e;
                            if (i2 >= iArr.length) {
                                break;
                            } else {
                                parseInt += ((parseInt2 >> i2) & 1) * iArr[i2];
                                i2++;
                            }
                        }
                    } else {
                        String[] e0 = hac.e0(str);
                        if (e0.length != 0) {
                            List f0 = new wm4(new oo8(new bl1('.', (byte) 0), (byte) 15)).f0(vod.c(e0[0].trim()));
                            if (f0.size() == 4 && ((String) f0.get(0)).equals("ac-4")) {
                                String str2 = (String) f0.get(3);
                                str2.getClass();
                                if (!str2.equals("03")) {
                                    if (str2.equals("04")) {
                                        i3 = 21;
                                        break;
                                    }
                                } else {
                                    i3 = 18;
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 2:
                String attributeValue4 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue4 != null) {
                    i3 = Integer.parseInt(attributeValue4);
                    break;
                }
                break;
            case 3:
            case 7:
                String attributeValue5 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue5 != null) {
                    String c4 = vod.c(attributeValue5);
                    c4.getClass();
                    switch (c4.hashCode()) {
                        case 1596796:
                            if (c4.equals("4000")) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 2937391:
                            if (c4.equals("a000")) {
                                c3 = 1;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3094034:
                            if (c4.equals("f800")) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3094035:
                            if (c4.equals("f801")) {
                                c3 = 3;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3133436:
                            break;
                        default:
                            c3 = 65535;
                            break;
                    }
                    switch (c3) {
                        case 0:
                            i = 1;
                            break;
                        case 1:
                            i = 2;
                            break;
                        case 3:
                            i = 6;
                            break;
                        case 4:
                            i = 8;
                            break;
                    }
                    i3 = i;
                    break;
                }
                i = -1;
                i3 = i;
            case 4:
                String attributeValue6 = xmlPullParser.getAttributeValue(null, "value");
                int parseInt3 = attributeValue6 == null ? -1 : Integer.parseInt(attributeValue6);
                if (parseInt3 >= 0) {
                    int[] iArr2 = f;
                    if (parseInt3 < iArr2.length) {
                        i3 = iArr2[parseInt3];
                        break;
                    }
                }
                break;
            case 6:
                String attributeValue7 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue7 != null) {
                    parseInt = Integer.bitCount(Integer.parseInt(attributeValue7, 16));
                    break;
                }
                break;
        }
        do {
            xmlPullParser.next();
        } while (!q0f.b(xmlPullParser, "AudioChannelConfiguration"));
        return i3;
    }

    public static long d(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public static ArrayList e(XmlPullParser xmlPullParser, ArrayList arrayList, boolean z) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : z ? 1 : TLObject.FLAG_31;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int parseInt2 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String str = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str = xmlPullParser.getText();
            } else {
                b(xmlPullParser);
            }
        } while (!q0f.b(xmlPullParser, "BaseURL"));
        if (str != null && lze.a(str)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = str;
            }
            return wpe.a(new wh0(parseInt, parseInt2, str, attributeValue3));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            wh0 wh0Var = (wh0) arrayList.get(i);
            String c2 = lze.c(wh0Var.a, str);
            String str2 = attributeValue3 == null ? c2 : attributeValue3;
            if (z) {
                parseInt = wh0Var.c;
                parseInt2 = wh0Var.d;
                str2 = wh0Var.b;
            }
            arrayList2.add(new wh0(parseInt, parseInt2, c2, str2));
        }
        return arrayList2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x016a  */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v25, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v4, types: [byte[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair f(XmlPullParser xmlPullParser) {
        String str;
        ?? r7;
        String str2;
        String str3;
        ?? r8;
        char c2;
        String str4;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue != null) {
            String c3 = vod.c(attributeValue);
            c3.getClass();
            switch (c3.hashCode()) {
                case -1980789791:
                    if (c3.equals("urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 489446379:
                    if (c3.equals("urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 755418770:
                    if (c3.equals("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1812765994:
                    if (c3.equals("urn:mpeg:dash:mp4protection:2011")) {
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
                    r7 = n61.d;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r8 = str2;
                    break;
                case 1:
                    r7 = n61.f;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r8 = str2;
                    break;
                case 2:
                    r7 = n61.e;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r8 = str2;
                    break;
                case 3:
                    str = xmlPullParser.getAttributeValue(null, "value");
                    int attributeCount = xmlPullParser.getAttributeCount();
                    int i = 0;
                    while (true) {
                        if (i >= attributeCount) {
                            str4 = null;
                        } else {
                            String attributeName = xmlPullParser.getAttributeName(i);
                            int indexOf = attributeName.indexOf(58);
                            if (indexOf != -1) {
                                attributeName = attributeName.substring(indexOf + 1);
                            }
                            if (attributeName.equals("default_KID")) {
                                str4 = xmlPullParser.getAttributeValue(i);
                            } else {
                                i++;
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(str4) && !"00000000-0000-0000-0000-000000000000".equals(str4)) {
                        String[] split = str4.split("\\s+");
                        UUID[] uuidArr = new UUID[split.length];
                        for (int i2 = 0; i2 < split.length; i2++) {
                            uuidArr[i2] = UUID.fromString(split[i2]);
                        }
                        r7 = n61.c;
                        str3 = null;
                        r8 = wte.a(r7, uuidArr, null);
                        break;
                    } else {
                        ncd.f("MpdParser", "Ignoring <ContentProtection> with schemeIdUri=\"urn:mpeg:dash:mp4protection:2011\" (ClearKey) due to missing required default_KID attribute.");
                        r7 = null;
                        str2 = r7;
                        str3 = str2;
                        r8 = str2;
                        break;
                    }
            }
            do {
                xmlPullParser.next();
                if ((!q0f.c(xmlPullParser, "clearkey:Laurl") || q0f.c(xmlPullParser, "dashif:Laurl")) && xmlPullParser.next() == 4) {
                    str3 = xmlPullParser.getText();
                    r8 = r8;
                } else if (q0f.c(xmlPullParser, "ms:laurl")) {
                    str3 = xmlPullParser.getAttributeValue(null, "licenseUrl");
                    r8 = r8;
                } else {
                    if (r8 == 0 && xmlPullParser.getEventType() == 2) {
                        String name = xmlPullParser.getName();
                        int indexOf2 = name.indexOf(58);
                        if (indexOf2 != -1) {
                            name = name.substring(indexOf2 + 1);
                        }
                        if (name.equals("pssh") && xmlPullParser.next() == 4) {
                            byte[] decode = Base64.decode(xmlPullParser.getText(), 0);
                            kw8 b2 = wte.b(decode);
                            UUID uuid = b2 == null ? null : (UUID) b2.c;
                            if (uuid == null) {
                                ncd.f("MpdParser", "Skipping malformed cenc:pssh data");
                                r7 = uuid;
                                r8 = 0;
                            } else {
                                UUID uuid2 = uuid;
                                r8 = decode;
                                r7 = uuid2;
                            }
                        }
                    }
                    if (r8 == 0) {
                        ?? r10 = n61.f;
                        if (r10.equals(r7) && q0f.c(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                            r8 = wte.a(r10, null, Base64.decode(xmlPullParser.getText(), 0));
                        }
                    }
                    b(xmlPullParser);
                    r8 = r8;
                }
            } while (!q0f.b(xmlPullParser, "ContentProtection"));
            return Pair.create(str, r7 != null ? new zr3(r7, str3, "video/mp4", r8) : null);
        }
        str = null;
        r7 = null;
        str2 = r7;
        str3 = str2;
        r8 = str2;
        do {
            xmlPullParser.next();
            if (q0f.c(xmlPullParser, "clearkey:Laurl")) {
            }
            str3 = xmlPullParser.getText();
            r8 = r8;
        } while (!q0f.b(xmlPullParser, "ContentProtection"));
        return Pair.create(str, r7 != null ? new zr3(r7, str3, "video/mp4", r8) : null);
    }

    public static int g(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(attributeValue)) {
            return 1;
        }
        if (MediaStreamTrack.VIDEO_TRACK_KIND.equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    public static lf3 h(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "id");
        String str2 = attributeValue3 != null ? attributeValue3 : null;
        do {
            xmlPullParser.next();
        } while (!q0f.b(xmlPullParser, str));
        return new lf3(attributeValue, attributeValue2, str2);
    }

    public static long i(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        Matcher matcher = hac.e.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        boolean isEmpty = TextUtils.isEmpty(matcher.group(1));
        String group = matcher.group(3);
        double parseDouble = group != null ? Double.parseDouble(group) * 3.1556908E7d : 0.0d;
        String group2 = matcher.group(5);
        double parseDouble2 = parseDouble + (group2 != null ? Double.parseDouble(group2) * 2629739.0d : 0.0d);
        String group3 = matcher.group(7);
        double parseDouble3 = parseDouble2 + (group3 != null ? Double.parseDouble(group3) * 86400.0d : 0.0d);
        String group4 = matcher.group(10);
        double parseDouble4 = parseDouble3 + (group4 != null ? Double.parseDouble(group4) * 3600.0d : 0.0d);
        String group5 = matcher.group(12);
        double parseDouble5 = parseDouble4 + (group5 != null ? Double.parseDouble(group5) * 60.0d : 0.0d);
        String group6 = matcher.group(14);
        long parseDouble6 = (long) ((parseDouble5 + (group6 != null ? Double.parseDouble(group6) : 0.0d)) * 1000.0d);
        return !isEmpty ? -parseDouble6 : parseDouble6;
    }

    public static float j(XmlPullParser xmlPullParser, float f2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = b.matcher(attributeValue);
            if (matcher.matches()) {
                int parseInt = Integer.parseInt(matcher.group(1));
                return !TextUtils.isEmpty(matcher.group(2)) ? parseInt / Integer.parseInt(r2) : parseInt;
            }
        }
        return f2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x09ea, code lost:
    
        if ("audio/eac3-joc".equals(r1) != false) goto L344;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0d01 A[LOOP:11: B:355:0x073c->B:363:0x0d01, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:364:0x092c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:378:0x09a5  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x09fb  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0a1d  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0a50 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:571:0x0a10  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x09f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static t63 k(XmlPullParser xmlPullParser, Uri uri) {
        int i;
        boolean z;
        long j;
        long j2;
        long j3;
        int i2;
        long j4;
        ArrayList arrayList;
        String str;
        ArrayList arrayList2;
        ArrayList arrayList3;
        long j5;
        boolean z2;
        long j6;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        long j7;
        String str2;
        String str3;
        String str4;
        ArrayList arrayList7;
        String str5;
        String str6;
        long j8;
        long j9;
        String str7;
        String str8;
        long j10;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        long j11;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        ArrayList arrayList11;
        ArrayList arrayList12;
        ArrayList arrayList13;
        String str14;
        String str15;
        long j12;
        String str16;
        String str17;
        String str18;
        String str19;
        int i3;
        String str20;
        String str21;
        long j13;
        String str22;
        String str23;
        int i4;
        ArrayList arrayList14;
        long j14;
        String str24;
        String str25;
        String str26;
        String str27;
        ArrayList arrayList15;
        String str28;
        String str29;
        int parseInt;
        String str30;
        float f2;
        int parseInt2;
        float f3;
        String str31;
        int i5;
        int i6;
        String str32;
        String str33;
        ArrayList arrayList16;
        String str34;
        int i7;
        String str35;
        long j15;
        String str36;
        ArrayList arrayList17;
        String str37;
        long j16;
        ArrayList arrayList18;
        String str38;
        ArrayList arrayList19;
        long j17;
        String str39;
        ArrayList arrayList20;
        long j18;
        ArrayList arrayList21;
        String str40;
        String str41;
        String str42;
        int i8;
        String str43;
        String str44;
        String d2;
        ArrayList arrayList22;
        String str45;
        String str46;
        tm2 tm2Var;
        int i9;
        long j19;
        ArrayList arrayList23;
        Pair pair;
        int parseInt3;
        String str47;
        int i10;
        int i11;
        String str48;
        int i12;
        String str49;
        long j20;
        ka9 ia9Var;
        String str50;
        long j21;
        lu8 lu8Var;
        s13 s13Var;
        ArrayList arrayList24;
        long j22;
        long j23;
        String[] strArr = new String[0];
        String str51 = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "profiles");
        if (attributeValue != null) {
            strArr = attributeValue.split(",");
        }
        int length = strArr.length;
        int i13 = 0;
        while (true) {
            i = 1;
            if (i13 >= length) {
                z = false;
                break;
            }
            if (strArr[i13].startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                z = true;
                break;
            }
            i13++;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "availabilityStartTime");
        long W = attributeValue2 == null ? -9223372036854775807L : hac.W(attributeValue2);
        long i14 = i(xmlPullParser, "mediaPresentationDuration", -9223372036854775807L);
        long i15 = i(xmlPullParser, "minBufferTime", -9223372036854775807L);
        boolean equals = "dynamic".equals(xmlPullParser.getAttributeValue(null, TeXSymbolParser.TYPE_ATTR));
        if (equals) {
            j2 = i(xmlPullParser, "minimumUpdatePeriod", -9223372036854775807L);
            j = i(xmlPullParser, "timeShiftBufferDepth", -9223372036854775807L);
            j3 = i(xmlPullParser, "suggestedPresentationDelay", -9223372036854775807L);
        } else {
            j = -9223372036854775807L;
            j2 = -9223372036854775807L;
            j3 = -9223372036854775807L;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "publishTime");
        long W2 = attributeValue3 == null ? -9223372036854775807L : hac.W(attributeValue3);
        ArrayList arrayList25 = new ArrayList();
        long j24 = equals ? 0L : -9223372036854775807L;
        String uri2 = uri.toString();
        ArrayList a = wpe.a(new wh0(z ? 1 : TLObject.FLAG_31, 1, uri2, uri2));
        ArrayList arrayList26 = new ArrayList();
        ArrayList arrayList27 = new ArrayList();
        long j25 = -9223372036854775807L;
        long j26 = equals ? -9223372036854775807L : 0L;
        int i16 = 0;
        int i17 = 0;
        lu8 lu8Var2 = null;
        s13 s13Var2 = null;
        vs6 vs6Var = null;
        while (true) {
            xmlPullParser.next();
            String str52 = "BaseURL";
            if (q0f.c(xmlPullParser, "BaseURL")) {
                if (i16 == 0) {
                    j24 = d(xmlPullParser, j24);
                    i16 = i;
                }
                arrayList27.addAll(e(xmlPullParser, a, z));
                arrayList = arrayList25;
                str = uri2;
                arrayList3 = a;
                arrayList2 = arrayList27;
                z2 = z;
                i2 = i;
                j6 = j25;
                arrayList4 = arrayList26;
                lu8Var = lu8Var2;
                s13Var = s13Var2;
            } else {
                i2 = i;
                String str53 = "lang";
                if (q0f.c(xmlPullParser, "ProgramInformation")) {
                    String attributeValue4 = xmlPullParser.getAttributeValue(str51, "moreInformationURL");
                    String str54 = attributeValue4 == null ? str51 : attributeValue4;
                    String attributeValue5 = xmlPullParser.getAttributeValue(str51, "lang");
                    String str55 = attributeValue5 == null ? str51 : attributeValue5;
                    String str56 = str51;
                    String str57 = str56;
                    String str58 = str57;
                    while (true) {
                        xmlPullParser.next();
                        if (q0f.c(xmlPullParser, "Title")) {
                            str56 = xmlPullParser.nextText();
                        } else if (q0f.c(xmlPullParser, "Source")) {
                            str57 = xmlPullParser.nextText();
                        } else if (q0f.c(xmlPullParser, "Copyright")) {
                            str58 = xmlPullParser.nextText();
                        } else {
                            b(xmlPullParser);
                        }
                        String str59 = str56;
                        String str60 = str57;
                        String str61 = str58;
                        if (q0f.b(xmlPullParser, "ProgramInformation")) {
                            lu8 lu8Var3 = new lu8(str59, str60, str61, str54, str55);
                            arrayList = arrayList25;
                            str = uri2;
                            arrayList3 = a;
                            arrayList2 = arrayList27;
                            z2 = z;
                            j6 = j25;
                            arrayList4 = arrayList26;
                            s13Var = s13Var2;
                            lu8Var = lu8Var3;
                        } else {
                            str56 = str59;
                            str57 = str60;
                            str58 = str61;
                        }
                    }
                } else {
                    if (q0f.c(xmlPullParser, "UTCTiming")) {
                        j4 = j24;
                        s13Var = new s13(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, "value"), (byte) 3, false);
                        j6 = j25;
                        arrayList = arrayList25;
                        str = uri2;
                        arrayList3 = a;
                        arrayList2 = arrayList27;
                        z2 = z;
                        arrayList4 = arrayList26;
                        lu8Var = lu8Var2;
                    } else {
                        j4 = j24;
                        if (q0f.c(xmlPullParser, "Location")) {
                            String attributeValue6 = xmlPullParser.getAttributeValue(null, "serviceLocation");
                            Uri parse = Uri.parse(lze.c(uri2, xmlPullParser.nextText()));
                            arrayList25.add(attributeValue6 != null ? new rb6(parse, attributeValue6) : new rb6(parse));
                            arrayList = arrayList25;
                            j5 = j26;
                            str = uri2;
                            arrayList3 = a;
                            arrayList2 = arrayList27;
                            z2 = z;
                            j6 = j25;
                            arrayList4 = arrayList26;
                        } else {
                            if (q0f.c(xmlPullParser, "ServiceDescription")) {
                                long j27 = j25;
                                long j28 = j27;
                                long j29 = j28;
                                float f4 = -3.4028235E38f;
                                float f5 = -3.4028235E38f;
                                while (true) {
                                    xmlPullParser.next();
                                    arrayList = arrayList25;
                                    if (q0f.c(xmlPullParser, "Latency")) {
                                        String attributeValue7 = xmlPullParser.getAttributeValue(null, "target");
                                        long parseLong = attributeValue7 == null ? j25 : Long.parseLong(attributeValue7);
                                        String attributeValue8 = xmlPullParser.getAttributeValue(null, "min");
                                        long parseLong2 = attributeValue8 == null ? j25 : Long.parseLong(attributeValue8);
                                        String attributeValue9 = xmlPullParser.getAttributeValue(null, "max");
                                        long parseLong3 = attributeValue9 == null ? j25 : Long.parseLong(attributeValue9);
                                        str = uri2;
                                        arrayList24 = a;
                                        j27 = parseLong;
                                        j22 = parseLong2;
                                        arrayList2 = arrayList27;
                                        j23 = parseLong3;
                                    } else {
                                        str = uri2;
                                        if (q0f.c(xmlPullParser, "PlaybackRate")) {
                                            String attributeValue10 = xmlPullParser.getAttributeValue(null, "min");
                                            f4 = attributeValue10 == null ? -3.4028235E38f : Float.parseFloat(attributeValue10);
                                            String attributeValue11 = xmlPullParser.getAttributeValue(null, "max");
                                            f5 = attributeValue11 == null ? -3.4028235E38f : Float.parseFloat(attributeValue11);
                                        }
                                        arrayList24 = a;
                                        j22 = j28;
                                        arrayList2 = arrayList27;
                                        j23 = j29;
                                    }
                                    if (q0f.b(xmlPullParser, "ServiceDescription")) {
                                        vs6 vs6Var2 = new vs6();
                                        vs6Var2.a = j27;
                                        vs6Var2.b = j22;
                                        vs6Var2.c = j23;
                                        vs6Var2.d = f4;
                                        vs6Var2.e = f5;
                                        arrayList3 = arrayList24;
                                        vs6Var = vs6Var2;
                                        z2 = z;
                                        j6 = j25;
                                        arrayList4 = arrayList26;
                                    } else {
                                        j29 = j23;
                                        arrayList27 = arrayList2;
                                        a = arrayList24;
                                        j28 = j22;
                                        arrayList25 = arrayList;
                                        uri2 = str;
                                    }
                                }
                            } else {
                                arrayList = arrayList25;
                                str = uri2;
                                ArrayList arrayList28 = a;
                                arrayList2 = arrayList27;
                                String str62 = "Period";
                                if (q0f.c(xmlPullParser, "Period") && i17 == 0) {
                                    ArrayList arrayList29 = !arrayList2.isEmpty() ? arrayList2 : arrayList28;
                                    String str63 = "id";
                                    String attributeValue12 = xmlPullParser.getAttributeValue(null, "id");
                                    long i18 = i(xmlPullParser, "start", j26);
                                    long j30 = W != j25 ? W + i18 : j25;
                                    String str64 = "value";
                                    long j31 = j26;
                                    ArrayList arrayList30 = arrayList28;
                                    long j32 = j25;
                                    long i19 = i(xmlPullParser, "duration", j32);
                                    String str65 = "duration";
                                    ArrayList arrayList31 = new ArrayList();
                                    String str66 = "schemeIdUri";
                                    ArrayList arrayList32 = new ArrayList();
                                    ArrayList arrayList33 = new ArrayList();
                                    long j33 = j32;
                                    long j34 = j4;
                                    int i20 = 0;
                                    wx9 wx9Var = null;
                                    while (true) {
                                        xmlPullParser.next();
                                        if (q0f.c(xmlPullParser, str52)) {
                                            if (i20 == 0) {
                                                j34 = d(xmlPullParser, j34);
                                                i20 = i2;
                                            }
                                            arrayList33.addAll(e(xmlPullParser, arrayList29, z));
                                            arrayList3 = arrayList30;
                                            str6 = str63;
                                            str3 = str52;
                                            z2 = z;
                                            str4 = str53;
                                            arrayList6 = arrayList31;
                                            j34 = j34;
                                            arrayList5 = arrayList33;
                                            j6 = -9223372036854775807L;
                                            long j35 = i19;
                                            str5 = str64;
                                            arrayList7 = arrayList29;
                                            j9 = j35;
                                            long j36 = j30;
                                            str7 = str62;
                                            j8 = j36;
                                        } else {
                                            arrayList5 = arrayList33;
                                            arrayList6 = arrayList31;
                                            String str67 = "AdaptationSet";
                                            String str68 = "SegmentTemplate";
                                            if (q0f.c(xmlPullParser, "AdaptationSet")) {
                                                j7 = j34;
                                                ArrayList arrayList34 = !arrayList5.isEmpty() ? arrayList5 : arrayList29;
                                                String attributeValue13 = xmlPullParser.getAttributeValue(null, str63);
                                                long parseLong4 = attributeValue13 == null ? -1L : Long.parseLong(attributeValue13);
                                                int g = g(xmlPullParser);
                                                arrayList3 = arrayList30;
                                                String str69 = "mimeType";
                                                String attributeValue14 = xmlPullParser.getAttributeValue(null, "mimeType");
                                                String str70 = str62;
                                                ArrayList arrayList35 = arrayList29;
                                                String attributeValue15 = xmlPullParser.getAttributeValue(null, "codecs");
                                                long j37 = j30;
                                                String attributeValue16 = xmlPullParser.getAttributeValue(null, "scte214:supplementalCodecs");
                                                String attributeValue17 = xmlPullParser.getAttributeValue(null, "scte214:supplementalProfiles");
                                                long j38 = j;
                                                String attributeValue18 = xmlPullParser.getAttributeValue(null, "width");
                                                int parseInt4 = attributeValue18 == null ? -1 : Integer.parseInt(attributeValue18);
                                                String attributeValue19 = xmlPullParser.getAttributeValue(null, "height");
                                                int parseInt5 = attributeValue19 == null ? -1 : Integer.parseInt(attributeValue19);
                                                float j39 = j(xmlPullParser, -1.0f);
                                                String str71 = "SegmentList";
                                                String str72 = "SegmentBase";
                                                String attributeValue20 = xmlPullParser.getAttributeValue(null, "audioSamplingRate");
                                                int parseInt6 = attributeValue20 == null ? -1 : Integer.parseInt(attributeValue20);
                                                String attributeValue21 = xmlPullParser.getAttributeValue(null, str53);
                                                String str73 = "audioSamplingRate";
                                                String attributeValue22 = xmlPullParser.getAttributeValue(null, "label");
                                                ArrayList arrayList36 = new ArrayList();
                                                String str74 = attributeValue22;
                                                ArrayList arrayList37 = new ArrayList();
                                                ArrayList arrayList38 = new ArrayList();
                                                ArrayList arrayList39 = new ArrayList();
                                                float f6 = j39;
                                                ArrayList arrayList40 = new ArrayList();
                                                String str75 = "height";
                                                ArrayList arrayList41 = new ArrayList();
                                                String str76 = "width";
                                                ArrayList arrayList42 = new ArrayList();
                                                String str77 = "scte214:supplementalProfiles";
                                                ArrayList arrayList43 = new ArrayList();
                                                ArrayList arrayList44 = new ArrayList();
                                                String str78 = "codecs";
                                                String str79 = "scte214:supplementalCodecs";
                                                ArrayList arrayList45 = arrayList42;
                                                ArrayList arrayList46 = arrayList41;
                                                wx9 wx9Var2 = wx9Var;
                                                long j40 = j33;
                                                int i21 = g;
                                                long j41 = j7;
                                                String str80 = attributeValue21;
                                                int i22 = 0;
                                                String str81 = null;
                                                int i23 = -1;
                                                while (true) {
                                                    xmlPullParser.next();
                                                    if (q0f.c(xmlPullParser, str52)) {
                                                        if (i22 == 0) {
                                                            j41 = d(xmlPullParser, j41);
                                                            i22 = i2;
                                                        }
                                                        arrayList44.addAll(e(xmlPullParser, arrayList34, z));
                                                        String str82 = str71;
                                                        str3 = str52;
                                                        str24 = str53;
                                                        str22 = str82;
                                                        str14 = str80;
                                                        str15 = attributeValue15;
                                                        str6 = str63;
                                                        arrayList10 = arrayList37;
                                                        arrayList12 = arrayList39;
                                                        j9 = i19;
                                                        str21 = str68;
                                                        str2 = str70;
                                                        arrayList7 = arrayList35;
                                                        str23 = str72;
                                                        str16 = str76;
                                                        str17 = str77;
                                                        str18 = str79;
                                                        str19 = str78;
                                                        arrayList13 = arrayList45;
                                                        j12 = j41;
                                                        i3 = 0;
                                                        arrayList8 = arrayList34;
                                                        arrayList11 = arrayList40;
                                                        str20 = str69;
                                                        arrayList9 = arrayList44;
                                                        z2 = z;
                                                        str26 = str67;
                                                        j8 = j37;
                                                        j13 = j38;
                                                        arrayList14 = arrayList38;
                                                    } else {
                                                        arrayList8 = arrayList34;
                                                        if (q0f.c(xmlPullParser, "ContentProtection")) {
                                                            Pair f7 = f(xmlPullParser);
                                                            arrayList9 = arrayList44;
                                                            Object obj = f7.first;
                                                            if (obj != null) {
                                                                str81 = (String) obj;
                                                            }
                                                            Object obj2 = f7.second;
                                                            if (obj2 != null) {
                                                                arrayList37.add((zr3) obj2);
                                                            }
                                                            String str83 = str71;
                                                            str3 = str52;
                                                            str24 = str53;
                                                            str22 = str83;
                                                        } else {
                                                            arrayList9 = arrayList44;
                                                            if (q0f.c(xmlPullParser, "ContentComponent")) {
                                                                String attributeValue23 = xmlPullParser.getAttributeValue(null, str53);
                                                                if (str80 == null) {
                                                                    str80 = attributeValue23;
                                                                } else if (attributeValue23 != null) {
                                                                    jte.p(str80.equals(attributeValue23));
                                                                }
                                                                int g2 = g(xmlPullParser);
                                                                if (i21 == -1) {
                                                                    i21 = g2;
                                                                } else if (g2 != -1) {
                                                                    jte.p(i21 == g2 ? i2 : 0);
                                                                }
                                                                String str84 = str71;
                                                                str3 = str52;
                                                                str24 = str53;
                                                                str22 = str84;
                                                                str14 = str80;
                                                                str15 = attributeValue15;
                                                                str6 = str63;
                                                                j12 = j41;
                                                                arrayList10 = arrayList37;
                                                                arrayList12 = arrayList39;
                                                                j9 = i19;
                                                                str26 = str67;
                                                                str21 = str68;
                                                                str2 = str70;
                                                                arrayList7 = arrayList35;
                                                                str23 = str72;
                                                                arrayList14 = arrayList38;
                                                                str16 = str76;
                                                                str17 = str77;
                                                                str18 = str79;
                                                                str19 = str78;
                                                                arrayList13 = arrayList45;
                                                                i3 = 0;
                                                                arrayList11 = arrayList40;
                                                                str20 = str69;
                                                                z2 = z;
                                                                j8 = j37;
                                                                j13 = j38;
                                                            } else {
                                                                if (q0f.c(xmlPullParser, "Role")) {
                                                                    arrayList40.add(h(xmlPullParser, "Role"));
                                                                } else {
                                                                    String str85 = "AudioChannelConfiguration";
                                                                    if (q0f.c(xmlPullParser, "AudioChannelConfiguration")) {
                                                                        String str86 = str71;
                                                                        str3 = str52;
                                                                        str24 = str53;
                                                                        str22 = str86;
                                                                        i23 = c(xmlPullParser, attributeValue15);
                                                                    } else {
                                                                        String str87 = "ContentProtection";
                                                                        if (q0f.c(xmlPullParser, "Accessibility")) {
                                                                            arrayList39.add(h(xmlPullParser, "Accessibility"));
                                                                        } else if (q0f.c(xmlPullParser, "EssentialProperty")) {
                                                                            arrayList46.add(h(xmlPullParser, "EssentialProperty"));
                                                                            String str88 = str71;
                                                                            str3 = str52;
                                                                            str24 = str53;
                                                                            str22 = str88;
                                                                            str14 = str80;
                                                                            str15 = attributeValue15;
                                                                            str6 = str63;
                                                                            i4 = i21;
                                                                            j12 = j41;
                                                                            arrayList10 = arrayList37;
                                                                            arrayList12 = arrayList39;
                                                                            j9 = i19;
                                                                            str21 = str68;
                                                                            str2 = str70;
                                                                            arrayList7 = arrayList35;
                                                                            str23 = str72;
                                                                            arrayList14 = arrayList38;
                                                                            str16 = str76;
                                                                            str17 = str77;
                                                                            str18 = str79;
                                                                            str19 = str78;
                                                                            arrayList13 = arrayList45;
                                                                            i3 = 0;
                                                                            arrayList11 = arrayList40;
                                                                            str20 = str69;
                                                                            z2 = z;
                                                                            j8 = j37;
                                                                            j13 = j38;
                                                                            j14 = j40;
                                                                            str26 = str67;
                                                                            j40 = j14;
                                                                            i21 = i4;
                                                                        } else {
                                                                            ArrayList arrayList47 = arrayList46;
                                                                            String str89 = "EssentialProperty";
                                                                            arrayList10 = arrayList37;
                                                                            if (q0f.c(xmlPullParser, "SupplementalProperty")) {
                                                                                ArrayList arrayList48 = arrayList45;
                                                                                arrayList48.add(h(xmlPullParser, "SupplementalProperty"));
                                                                                String str90 = str71;
                                                                                str3 = str52;
                                                                                str24 = str53;
                                                                                str22 = str90;
                                                                                arrayList46 = arrayList47;
                                                                                arrayList11 = arrayList40;
                                                                                str14 = str80;
                                                                                str15 = attributeValue15;
                                                                                str6 = str63;
                                                                                i4 = i21;
                                                                                j12 = j41;
                                                                                arrayList13 = arrayList48;
                                                                                arrayList12 = arrayList39;
                                                                                j9 = i19;
                                                                                str21 = str68;
                                                                                str2 = str70;
                                                                                arrayList7 = arrayList35;
                                                                                str23 = str72;
                                                                                arrayList14 = arrayList38;
                                                                                str16 = str76;
                                                                                str17 = str77;
                                                                                str18 = str79;
                                                                                str19 = str78;
                                                                                i3 = 0;
                                                                                str20 = str69;
                                                                                z2 = z;
                                                                                j8 = j37;
                                                                                j13 = j38;
                                                                                j14 = j40;
                                                                                str26 = str67;
                                                                                j40 = j14;
                                                                                i21 = i4;
                                                                            } else {
                                                                                ArrayList arrayList49 = arrayList45;
                                                                                arrayList11 = arrayList40;
                                                                                String str91 = str53;
                                                                                arrayList12 = arrayList39;
                                                                                if (q0f.c(xmlPullParser, "Representation")) {
                                                                                    if (arrayList9.isEmpty()) {
                                                                                        str27 = "Representation";
                                                                                        arrayList15 = arrayList8;
                                                                                    } else {
                                                                                        str27 = "Representation";
                                                                                        arrayList15 = arrayList9;
                                                                                    }
                                                                                    String str92 = str80;
                                                                                    String str93 = "SupplementalProperty";
                                                                                    String attributeValue24 = xmlPullParser.getAttributeValue(null, str63);
                                                                                    str15 = attributeValue15;
                                                                                    String attributeValue25 = xmlPullParser.getAttributeValue(null, "bandwidth");
                                                                                    int parseInt7 = attributeValue25 == null ? -1 : Integer.parseInt(attributeValue25);
                                                                                    String attributeValue26 = xmlPullParser.getAttributeValue(null, str69);
                                                                                    String str94 = str78;
                                                                                    str20 = str69;
                                                                                    String str95 = attributeValue26 == null ? attributeValue14 : attributeValue26;
                                                                                    String attributeValue27 = xmlPullParser.getAttributeValue(null, str94);
                                                                                    String str96 = str79;
                                                                                    str19 = str94;
                                                                                    String str97 = attributeValue27 == null ? str15 : attributeValue27;
                                                                                    String attributeValue28 = xmlPullParser.getAttributeValue(null, str96);
                                                                                    String str98 = str77;
                                                                                    str18 = str96;
                                                                                    String str99 = attributeValue28 == null ? attributeValue16 : attributeValue28;
                                                                                    String attributeValue29 = xmlPullParser.getAttributeValue(null, str98);
                                                                                    String str100 = str76;
                                                                                    str17 = str98;
                                                                                    String str101 = attributeValue29 == null ? attributeValue17 : attributeValue29;
                                                                                    String attributeValue30 = xmlPullParser.getAttributeValue(null, str100);
                                                                                    if (attributeValue30 == null) {
                                                                                        String str102 = str75;
                                                                                        str28 = str100;
                                                                                        str29 = str102;
                                                                                        parseInt = parseInt4;
                                                                                    } else {
                                                                                        String str103 = str75;
                                                                                        str28 = str100;
                                                                                        str29 = str103;
                                                                                        parseInt = Integer.parseInt(attributeValue30);
                                                                                    }
                                                                                    String attributeValue31 = xmlPullParser.getAttributeValue(null, str29);
                                                                                    if (attributeValue31 == null) {
                                                                                        float f8 = f6;
                                                                                        str30 = str29;
                                                                                        f2 = f8;
                                                                                        parseInt2 = parseInt5;
                                                                                    } else {
                                                                                        float f9 = f6;
                                                                                        str30 = str29;
                                                                                        f2 = f9;
                                                                                        parseInt2 = Integer.parseInt(attributeValue31);
                                                                                    }
                                                                                    String str104 = "InbandEventStream";
                                                                                    float j42 = j(xmlPullParser, f2);
                                                                                    String str105 = str73;
                                                                                    String attributeValue32 = xmlPullParser.getAttributeValue(null, str105);
                                                                                    int parseInt8 = attributeValue32 == null ? parseInt6 : Integer.parseInt(attributeValue32);
                                                                                    str73 = str105;
                                                                                    ArrayList arrayList50 = new ArrayList();
                                                                                    ArrayList arrayList51 = new ArrayList();
                                                                                    ArrayList arrayList52 = new ArrayList(arrayList47);
                                                                                    ArrayList arrayList53 = new ArrayList(arrayList49);
                                                                                    ArrayList arrayList54 = new ArrayList();
                                                                                    ArrayList arrayList55 = arrayList47;
                                                                                    arrayList13 = arrayList49;
                                                                                    String str106 = str63;
                                                                                    int i24 = i21;
                                                                                    long j43 = j41;
                                                                                    wx9 wx9Var3 = wx9Var2;
                                                                                    long j44 = j40;
                                                                                    int i25 = i23;
                                                                                    int i26 = 0;
                                                                                    String str107 = null;
                                                                                    while (true) {
                                                                                        xmlPullParser.next();
                                                                                        if (q0f.c(xmlPullParser, str52)) {
                                                                                            if (i26 == 0) {
                                                                                                j43 = d(xmlPullParser, j43);
                                                                                                i26 = i2;
                                                                                            }
                                                                                            f3 = f2;
                                                                                            arrayList54.addAll(e(xmlPullParser, arrayList15, z));
                                                                                        } else {
                                                                                            f3 = f2;
                                                                                            if (q0f.c(xmlPullParser, str85)) {
                                                                                                i25 = c(xmlPullParser, str97);
                                                                                            } else {
                                                                                                String str108 = str72;
                                                                                                if (q0f.c(xmlPullParser, str108)) {
                                                                                                    str72 = str108;
                                                                                                    wx9Var3 = o(xmlPullParser, (vx9) wx9Var3);
                                                                                                } else {
                                                                                                    String str109 = str71;
                                                                                                    if (q0f.c(xmlPullParser, str109)) {
                                                                                                        str32 = str85;
                                                                                                        str3 = str52;
                                                                                                        long d3 = d(xmlPullParser, j44);
                                                                                                        str31 = str109;
                                                                                                        i5 = parseInt8;
                                                                                                        i6 = parseInt7;
                                                                                                        j12 = j41;
                                                                                                        long j45 = i19;
                                                                                                        str2 = str70;
                                                                                                        arrayList7 = arrayList35;
                                                                                                        long j46 = j37;
                                                                                                        long j47 = j38;
                                                                                                        str33 = str108;
                                                                                                        str16 = str28;
                                                                                                        arrayList16 = arrayList43;
                                                                                                        str34 = str92;
                                                                                                        i7 = i24;
                                                                                                        str6 = str106;
                                                                                                        arrayList17 = arrayList15;
                                                                                                        str35 = str97;
                                                                                                        str75 = str30;
                                                                                                        str36 = str89;
                                                                                                        str37 = str87;
                                                                                                        arrayList46 = arrayList55;
                                                                                                        f6 = f3;
                                                                                                        wx9Var3 = p(xmlPullParser, (sx9) wx9Var3, j46, j45, j43, d3, j47);
                                                                                                        j15 = j45;
                                                                                                        j17 = d3;
                                                                                                        j16 = j43;
                                                                                                        str41 = str27;
                                                                                                        str40 = str93;
                                                                                                        str38 = str104;
                                                                                                        str42 = str107;
                                                                                                        arrayList20 = arrayList52;
                                                                                                        j18 = j46;
                                                                                                        arrayList18 = arrayList54;
                                                                                                        str21 = str68;
                                                                                                        arrayList21 = arrayList53;
                                                                                                        i8 = i25;
                                                                                                        z2 = z;
                                                                                                        j13 = j47;
                                                                                                        arrayList19 = arrayList50;
                                                                                                    } else {
                                                                                                        str31 = str109;
                                                                                                        i5 = parseInt8;
                                                                                                        i6 = parseInt7;
                                                                                                        str32 = str85;
                                                                                                        str3 = str52;
                                                                                                        j12 = j41;
                                                                                                        str2 = str70;
                                                                                                        long j48 = j37;
                                                                                                        long j49 = j38;
                                                                                                        str33 = str108;
                                                                                                        arrayList16 = arrayList43;
                                                                                                        str34 = str92;
                                                                                                        i7 = i24;
                                                                                                        str6 = str106;
                                                                                                        long j50 = j43;
                                                                                                        str35 = str97;
                                                                                                        j15 = i19;
                                                                                                        String str110 = str68;
                                                                                                        arrayList7 = arrayList35;
                                                                                                        str16 = str28;
                                                                                                        str36 = str89;
                                                                                                        arrayList46 = arrayList55;
                                                                                                        arrayList17 = arrayList15;
                                                                                                        str75 = str30;
                                                                                                        str37 = str87;
                                                                                                        f6 = f3;
                                                                                                        if (q0f.c(xmlPullParser, str110)) {
                                                                                                            long d4 = d(xmlPullParser, j44);
                                                                                                            ArrayList arrayList56 = arrayList54;
                                                                                                            str21 = str110;
                                                                                                            j16 = j50;
                                                                                                            arrayList18 = arrayList56;
                                                                                                            z2 = z;
                                                                                                            j13 = j49;
                                                                                                            wx9Var3 = q(xmlPullParser, (tx9) wx9Var3, arrayList13, j48, j15, j16, d4, j13);
                                                                                                            j17 = d4;
                                                                                                            str41 = str27;
                                                                                                            str40 = str93;
                                                                                                            str38 = str104;
                                                                                                            str42 = str107;
                                                                                                            arrayList19 = arrayList50;
                                                                                                        } else {
                                                                                                            ArrayList arrayList57 = arrayList54;
                                                                                                            str21 = str110;
                                                                                                            j16 = j50;
                                                                                                            arrayList18 = arrayList57;
                                                                                                            z2 = z;
                                                                                                            j13 = j49;
                                                                                                            if (q0f.c(xmlPullParser, str37)) {
                                                                                                                Pair f10 = f(xmlPullParser);
                                                                                                                Object obj3 = f10.first;
                                                                                                                if (obj3 != null) {
                                                                                                                    str107 = (String) obj3;
                                                                                                                }
                                                                                                                Object obj4 = f10.second;
                                                                                                                if (obj4 != null) {
                                                                                                                    arrayList19 = arrayList50;
                                                                                                                    arrayList19.add((zr3) obj4);
                                                                                                                } else {
                                                                                                                    arrayList19 = arrayList50;
                                                                                                                }
                                                                                                                j17 = j44;
                                                                                                                str41 = str27;
                                                                                                                str40 = str93;
                                                                                                                str38 = str104;
                                                                                                                str42 = str107;
                                                                                                            } else {
                                                                                                                str38 = str104;
                                                                                                                arrayList19 = arrayList50;
                                                                                                                j17 = j44;
                                                                                                                if (q0f.c(xmlPullParser, str38)) {
                                                                                                                    arrayList51.add(h(xmlPullParser, str38));
                                                                                                                    str39 = str93;
                                                                                                                    arrayList20 = arrayList52;
                                                                                                                } else {
                                                                                                                    ArrayList arrayList58 = arrayList51;
                                                                                                                    if (q0f.c(xmlPullParser, str36)) {
                                                                                                                        arrayList51 = arrayList58;
                                                                                                                        arrayList20 = arrayList52;
                                                                                                                        arrayList20.add(h(xmlPullParser, str36));
                                                                                                                        str39 = str93;
                                                                                                                    } else {
                                                                                                                        arrayList51 = arrayList58;
                                                                                                                        str39 = str93;
                                                                                                                        arrayList20 = arrayList52;
                                                                                                                        j18 = j48;
                                                                                                                        if (q0f.c(xmlPullParser, str39)) {
                                                                                                                            arrayList21 = arrayList53;
                                                                                                                            arrayList21.add(h(xmlPullParser, str39));
                                                                                                                        } else {
                                                                                                                            arrayList21 = arrayList53;
                                                                                                                            b(xmlPullParser);
                                                                                                                        }
                                                                                                                        str40 = str39;
                                                                                                                        str41 = str27;
                                                                                                                        str42 = str107;
                                                                                                                        i8 = i25;
                                                                                                                    }
                                                                                                                }
                                                                                                                j18 = j48;
                                                                                                                arrayList21 = arrayList53;
                                                                                                                str40 = str39;
                                                                                                                str41 = str27;
                                                                                                                str42 = str107;
                                                                                                                i8 = i25;
                                                                                                            }
                                                                                                        }
                                                                                                        arrayList20 = arrayList52;
                                                                                                        j18 = j48;
                                                                                                        arrayList21 = arrayList53;
                                                                                                        i8 = i25;
                                                                                                    }
                                                                                                    if (q0f.b(xmlPullParser, str41)) {
                                                                                                        arrayList52 = arrayList20;
                                                                                                        arrayList53 = arrayList21;
                                                                                                        arrayList50 = arrayList19;
                                                                                                        String str111 = str99;
                                                                                                        long j51 = j15;
                                                                                                        str27 = str41;
                                                                                                        i25 = i8;
                                                                                                        j43 = j16;
                                                                                                        str104 = str38;
                                                                                                        str87 = str37;
                                                                                                        arrayList15 = arrayList17;
                                                                                                        j44 = j17;
                                                                                                        str52 = str3;
                                                                                                        f2 = f6;
                                                                                                        str30 = str75;
                                                                                                        str107 = str42;
                                                                                                        str85 = str32;
                                                                                                        i24 = i7;
                                                                                                        arrayList43 = arrayList16;
                                                                                                        parseInt7 = i6;
                                                                                                        str71 = str31;
                                                                                                        str106 = str6;
                                                                                                        i2 = 1;
                                                                                                        j38 = j13;
                                                                                                        j41 = j12;
                                                                                                        z = z2;
                                                                                                        str28 = str16;
                                                                                                        arrayList55 = arrayList46;
                                                                                                        str89 = str36;
                                                                                                        str68 = str21;
                                                                                                        arrayList35 = arrayList7;
                                                                                                        str97 = str35;
                                                                                                        arrayList54 = arrayList18;
                                                                                                        i19 = j51;
                                                                                                        str70 = str2;
                                                                                                        str99 = str111;
                                                                                                        str101 = str101;
                                                                                                        parseInt8 = i5;
                                                                                                        str72 = str33;
                                                                                                        str93 = str40;
                                                                                                        j37 = j18;
                                                                                                        str92 = str34;
                                                                                                    } else if (wf7.i(str95)) {
                                                                                                        if (str35 != null) {
                                                                                                            for (String str112 : hac.e0(str35)) {
                                                                                                                d2 = wf7.d(str112);
                                                                                                                if (d2 != null && wf7.i(d2)) {
                                                                                                                    str43 = d2;
                                                                                                                    str44 = str95;
                                                                                                                    if ("audio/eac3".equals(str43)) {
                                                                                                                        int i27 = 0;
                                                                                                                        while (true) {
                                                                                                                            str45 = "ec+3";
                                                                                                                            if (i27 < arrayList21.size()) {
                                                                                                                                lf3 lf3Var = (lf3) arrayList21.get(i27);
                                                                                                                                int i28 = i27;
                                                                                                                                String str113 = lf3Var.a;
                                                                                                                                String str114 = lf3Var.b;
                                                                                                                                arrayList22 = arrayList21;
                                                                                                                                if ((!"tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str113) || !"JOC".equals(str114)) && (!"tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str113) || !"ec+3".equals(str114))) {
                                                                                                                                    i27 = i28 + 1;
                                                                                                                                    arrayList21 = arrayList22;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                arrayList22 = arrayList21;
                                                                                                                                str43 = "audio/eac3";
                                                                                                                            }
                                                                                                                        }
                                                                                                                        str43 = "audio/eac3-joc";
                                                                                                                    } else {
                                                                                                                        arrayList22 = arrayList21;
                                                                                                                    }
                                                                                                                    str45 = str35;
                                                                                                                    str46 = str99;
                                                                                                                    if (wf7.j(str45, str46)) {
                                                                                                                        tm2 x = hac.x(str45, str46, str101);
                                                                                                                        String str115 = str46 != null ? str46 : str45;
                                                                                                                        tm2Var = x;
                                                                                                                        str43 = "video/dolby-vision";
                                                                                                                        str45 = str115;
                                                                                                                    } else {
                                                                                                                        tm2Var = null;
                                                                                                                    }
                                                                                                                    i9 = 0;
                                                                                                                    int i29 = 0;
                                                                                                                    while (true) {
                                                                                                                        j19 = j15;
                                                                                                                        if (i9 < arrayList11.size()) {
                                                                                                                            ArrayList arrayList59 = arrayList11;
                                                                                                                            lf3 lf3Var2 = (lf3) arrayList59.get(i9);
                                                                                                                            String str116 = str44;
                                                                                                                            if (vod.a("urn:mpeg:dash:role:2011", lf3Var2.a)) {
                                                                                                                                String str117 = lf3Var2.b;
                                                                                                                                i29 |= (str117 == null || !(str117.equals("forced_subtitle") || str117.equals("forced-subtitle"))) ? 0 : 2;
                                                                                                                            }
                                                                                                                            i9++;
                                                                                                                            arrayList11 = arrayList59;
                                                                                                                            str44 = str116;
                                                                                                                            j15 = j19;
                                                                                                                        } else {
                                                                                                                            String str118 = str44;
                                                                                                                            int i30 = 0;
                                                                                                                            int i31 = 0;
                                                                                                                            while (true) {
                                                                                                                                ArrayList arrayList60 = arrayList11;
                                                                                                                                if (i30 < arrayList60.size()) {
                                                                                                                                    lf3 lf3Var3 = (lf3) arrayList60.get(i30);
                                                                                                                                    arrayList11 = arrayList60;
                                                                                                                                    if (vod.a("urn:mpeg:dash:role:2011", lf3Var3.a)) {
                                                                                                                                        i31 |= m(lf3Var3.b);
                                                                                                                                    }
                                                                                                                                    i30++;
                                                                                                                                } else {
                                                                                                                                    arrayList11 = arrayList60;
                                                                                                                                    int i32 = 0;
                                                                                                                                    int i33 = 0;
                                                                                                                                    while (i32 < arrayList12.size()) {
                                                                                                                                        ArrayList arrayList61 = arrayList12;
                                                                                                                                        int i34 = i32;
                                                                                                                                        lf3 lf3Var4 = (lf3) arrayList61.get(i32);
                                                                                                                                        int i35 = i33;
                                                                                                                                        String str119 = lf3Var4.a;
                                                                                                                                        int i36 = i31;
                                                                                                                                        String str120 = lf3Var4.b;
                                                                                                                                        if (vod.a("urn:mpeg:dash:role:2011", str119)) {
                                                                                                                                            i10 = m(str120);
                                                                                                                                        } else if (vod.a("urn:tva:metadata:cs:AudioPurposeCS:2007", lf3Var4.a)) {
                                                                                                                                            if (str120 != null) {
                                                                                                                                                switch (str120.hashCode()) {
                                                                                                                                                    case 49:
                                                                                                                                                        if (str120.equals("1")) {
                                                                                                                                                            i11 = 0;
                                                                                                                                                            break;
                                                                                                                                                        }
                                                                                                                                                        i11 = -1;
                                                                                                                                                        break;
                                                                                                                                                    case 50:
                                                                                                                                                        if (str120.equals("2")) {
                                                                                                                                                            i11 = i2;
                                                                                                                                                            break;
                                                                                                                                                        }
                                                                                                                                                        i11 = -1;
                                                                                                                                                        break;
                                                                                                                                                    case nm7.n0 /* 51 */:
                                                                                                                                                        if (str120.equals("3")) {
                                                                                                                                                            i11 = 2;
                                                                                                                                                            break;
                                                                                                                                                        }
                                                                                                                                                        i11 = -1;
                                                                                                                                                        break;
                                                                                                                                                    case nm7.o0 /* 52 */:
                                                                                                                                                        if (str120.equals("4")) {
                                                                                                                                                            i11 = 3;
                                                                                                                                                            break;
                                                                                                                                                        }
                                                                                                                                                        i11 = -1;
                                                                                                                                                        break;
                                                                                                                                                    case nm7.p0 /* 53 */:
                                                                                                                                                    default:
                                                                                                                                                        i11 = -1;
                                                                                                                                                        break;
                                                                                                                                                    case nm7.q0 /* 54 */:
                                                                                                                                                        if (str120.equals("6")) {
                                                                                                                                                            i11 = 4;
                                                                                                                                                            break;
                                                                                                                                                        }
                                                                                                                                                        i11 = -1;
                                                                                                                                                        break;
                                                                                                                                                }
                                                                                                                                                switch (i11) {
                                                                                                                                                    case 0:
                                                                                                                                                        i10 = 512;
                                                                                                                                                        break;
                                                                                                                                                    case 1:
                                                                                                                                                        i10 = 2048;
                                                                                                                                                        break;
                                                                                                                                                    case 2:
                                                                                                                                                        i10 = 4;
                                                                                                                                                        break;
                                                                                                                                                    case 3:
                                                                                                                                                        i10 = 8;
                                                                                                                                                        break;
                                                                                                                                                    case 4:
                                                                                                                                                        i10 = i2;
                                                                                                                                                        break;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            i10 = 0;
                                                                                                                                        } else {
                                                                                                                                            i33 = i35;
                                                                                                                                            i32 = i34 + 1;
                                                                                                                                            arrayList12 = arrayList61;
                                                                                                                                            i31 = i36;
                                                                                                                                        }
                                                                                                                                        i33 = i35 | i10;
                                                                                                                                        i32 = i34 + 1;
                                                                                                                                        arrayList12 = arrayList61;
                                                                                                                                        i31 = i36;
                                                                                                                                    }
                                                                                                                                    ArrayList arrayList62 = arrayList12;
                                                                                                                                    int n = i31 | i33 | n(arrayList20) | n(arrayList22);
                                                                                                                                    int i37 = 0;
                                                                                                                                    while (true) {
                                                                                                                                        if (i37 < arrayList20.size()) {
                                                                                                                                            lf3 lf3Var5 = (lf3) arrayList20.get(i37);
                                                                                                                                            arrayList23 = arrayList20;
                                                                                                                                            if ((vod.a("http://dashif.org/thumbnail_tile", lf3Var5.a) || vod.a("http://dashif.org/guidelines/thumbnail_tile", lf3Var5.a)) && (str47 = lf3Var5.b) != null) {
                                                                                                                                                String str121 = hac.a;
                                                                                                                                                String[] split = str47.split("x", -1);
                                                                                                                                                if (split.length == 2) {
                                                                                                                                                    i3 = 0;
                                                                                                                                                    try {
                                                                                                                                                        pair = Pair.create(Integer.valueOf(Integer.parseInt(split[0])), Integer.valueOf(Integer.parseInt(split[i2])));
                                                                                                                                                    } catch (NumberFormatException unused) {
                                                                                                                                                        continue;
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    continue;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            i37++;
                                                                                                                                            arrayList20 = arrayList23;
                                                                                                                                        } else {
                                                                                                                                            arrayList23 = arrayList20;
                                                                                                                                            i3 = 0;
                                                                                                                                            pair = null;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    fo4 fo4Var = new fo4();
                                                                                                                                    fo4Var.a = attributeValue24;
                                                                                                                                    fo4Var.r = wf7.n(str118);
                                                                                                                                    fo4Var.s = wf7.n(str43);
                                                                                                                                    fo4Var.k = str45;
                                                                                                                                    fo4Var.j = i6;
                                                                                                                                    fo4Var.e = i29;
                                                                                                                                    fo4Var.f = n;
                                                                                                                                    fo4Var.K = tm2Var;
                                                                                                                                    String str122 = str34;
                                                                                                                                    fo4Var.d = str122;
                                                                                                                                    fo4Var.U = pair != null ? ((Integer) pair.first).intValue() : -1;
                                                                                                                                    fo4Var.V = pair != null ? ((Integer) pair.second).intValue() : -1;
                                                                                                                                    if (wf7.m(str43)) {
                                                                                                                                        fo4Var.z = parseInt;
                                                                                                                                        fo4Var.A = parseInt2;
                                                                                                                                        fo4Var.a(j42);
                                                                                                                                    } else {
                                                                                                                                        int i38 = parseInt;
                                                                                                                                        int i39 = parseInt2;
                                                                                                                                        if (wf7.i(str43)) {
                                                                                                                                            fo4Var.M = i8;
                                                                                                                                            fo4Var.O = i5;
                                                                                                                                        } else if (wf7.l(str43)) {
                                                                                                                                            if ("application/cea-608".equals(str43)) {
                                                                                                                                                int i40 = i3;
                                                                                                                                                while (i40 < arrayList62.size()) {
                                                                                                                                                    lf3 lf3Var6 = (lf3) arrayList62.get(i40);
                                                                                                                                                    String str123 = lf3Var6.a;
                                                                                                                                                    String str124 = lf3Var6.b;
                                                                                                                                                    if ("urn:scte:dash:cc:cea-608:2015".equals(str123) && str124 != null) {
                                                                                                                                                        Matcher matcher = c.matcher(str124);
                                                                                                                                                        if (matcher.matches()) {
                                                                                                                                                            parseInt3 = Integer.parseInt(matcher.group(i2));
                                                                                                                                                            fo4Var.S = parseInt3;
                                                                                                                                                        } else {
                                                                                                                                                            ncd.f("MpdParser", "Unable to parse CEA-608 channel number from: ".concat(str124));
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    i40++;
                                                                                                                                                    i2 = 1;
                                                                                                                                                }
                                                                                                                                                parseInt3 = -1;
                                                                                                                                                fo4Var.S = parseInt3;
                                                                                                                                            } else {
                                                                                                                                                if ("application/cea-708".equals(str43)) {
                                                                                                                                                    for (int i41 = i3; i41 < arrayList62.size(); i41++) {
                                                                                                                                                        lf3 lf3Var7 = (lf3) arrayList62.get(i41);
                                                                                                                                                        String str125 = lf3Var7.a;
                                                                                                                                                        String str126 = lf3Var7.b;
                                                                                                                                                        if ("urn:scte:dash:cc:cea-708:2015".equals(str125) && str126 != null) {
                                                                                                                                                            Matcher matcher2 = d.matcher(str126);
                                                                                                                                                            if (matcher2.matches()) {
                                                                                                                                                                parseInt3 = Integer.parseInt(matcher2.group(1));
                                                                                                                                                                fo4Var.S = parseInt3;
                                                                                                                                                            } else {
                                                                                                                                                                ncd.f("MpdParser", "Unable to parse CEA-708 service block number from: ".concat(str126));
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                parseInt3 = -1;
                                                                                                                                                fo4Var.S = parseInt3;
                                                                                                                                            }
                                                                                                                                            j34 = j7;
                                                                                                                                            str7 = str2;
                                                                                                                                        } else if (wf7.k(str43)) {
                                                                                                                                            fo4Var.z = i38;
                                                                                                                                            fo4Var.A = i39;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    go4 go4Var = new go4(fo4Var);
                                                                                                                                    wx9 vx9Var = wx9Var3 != null ? wx9Var3 : new vx9(null, 1L, 0L, 0L, 0L);
                                                                                                                                    String str127 = go4Var.s;
                                                                                                                                    if (str127 != null && wf7.l(str127) && vx9Var.c != 0) {
                                                                                                                                        vx9Var = vx9Var.a();
                                                                                                                                    }
                                                                                                                                    u63 u63Var = new u63(go4Var, !arrayList18.isEmpty() ? arrayList18 : arrayList17, vx9Var, str42, arrayList19, arrayList51, arrayList23, arrayList22);
                                                                                                                                    i21 = wf7.h(go4Var.t);
                                                                                                                                    int i42 = i7;
                                                                                                                                    if (i42 != -1) {
                                                                                                                                        if (i21 != -1) {
                                                                                                                                            jte.p(i42 == i21 ? 1 : i3);
                                                                                                                                        }
                                                                                                                                        i21 = i42;
                                                                                                                                    }
                                                                                                                                    ArrayList arrayList63 = arrayList16;
                                                                                                                                    arrayList63.add(u63Var);
                                                                                                                                    arrayList43 = arrayList63;
                                                                                                                                    str14 = str122;
                                                                                                                                    arrayList12 = arrayList62;
                                                                                                                                    str26 = str67;
                                                                                                                                    arrayList14 = arrayList38;
                                                                                                                                    str24 = str91;
                                                                                                                                    j8 = j18;
                                                                                                                                    j9 = j19;
                                                                                                                                    str22 = str31;
                                                                                                                                    str23 = str33;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        d2 = null;
                                                                                                        str43 = d2;
                                                                                                        str44 = str95;
                                                                                                        if ("audio/eac3".equals(str43)) {
                                                                                                        }
                                                                                                        str45 = str35;
                                                                                                        str46 = str99;
                                                                                                        if (wf7.j(str45, str46)) {
                                                                                                        }
                                                                                                        i9 = 0;
                                                                                                        int i292 = 0;
                                                                                                        while (true) {
                                                                                                            j19 = j15;
                                                                                                            if (i9 < arrayList11.size()) {
                                                                                                            }
                                                                                                            i9++;
                                                                                                            arrayList11 = arrayList59;
                                                                                                            str44 = str116;
                                                                                                            j15 = j19;
                                                                                                        }
                                                                                                    } else if (wf7.m(str95)) {
                                                                                                        if (str35 != null) {
                                                                                                            for (String str128 : hac.e0(str35)) {
                                                                                                                d2 = wf7.d(str128);
                                                                                                                if (d2 != null && wf7.m(d2)) {
                                                                                                                    str43 = d2;
                                                                                                                    str44 = str95;
                                                                                                                    if ("audio/eac3".equals(str43)) {
                                                                                                                    }
                                                                                                                    str45 = str35;
                                                                                                                    str46 = str99;
                                                                                                                    if (wf7.j(str45, str46)) {
                                                                                                                    }
                                                                                                                    i9 = 0;
                                                                                                                    int i2922 = 0;
                                                                                                                    while (true) {
                                                                                                                        j19 = j15;
                                                                                                                        if (i9 < arrayList11.size()) {
                                                                                                                        }
                                                                                                                        i9++;
                                                                                                                        arrayList11 = arrayList59;
                                                                                                                        str44 = str116;
                                                                                                                        j15 = j19;
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        d2 = null;
                                                                                                        str43 = d2;
                                                                                                        str44 = str95;
                                                                                                        if ("audio/eac3".equals(str43)) {
                                                                                                        }
                                                                                                        str45 = str35;
                                                                                                        str46 = str99;
                                                                                                        if (wf7.j(str45, str46)) {
                                                                                                        }
                                                                                                        i9 = 0;
                                                                                                        int i29222 = 0;
                                                                                                        while (true) {
                                                                                                            j19 = j15;
                                                                                                            if (i9 < arrayList11.size()) {
                                                                                                            }
                                                                                                            i9++;
                                                                                                            arrayList11 = arrayList59;
                                                                                                            str44 = str116;
                                                                                                            j15 = j19;
                                                                                                        }
                                                                                                    } else {
                                                                                                        if (wf7.l(str95) || wf7.k(str95)) {
                                                                                                            str43 = str95;
                                                                                                            str44 = str43;
                                                                                                        } else {
                                                                                                            str44 = str95;
                                                                                                            if ("application/mp4".equals(str44)) {
                                                                                                                str43 = wf7.d(str35);
                                                                                                                if ("text/vtt".equals(str43)) {
                                                                                                                    str43 = "application/x-mp4-vtt";
                                                                                                                }
                                                                                                            } else {
                                                                                                                str43 = null;
                                                                                                            }
                                                                                                        }
                                                                                                        if ("audio/eac3".equals(str43)) {
                                                                                                        }
                                                                                                        str45 = str35;
                                                                                                        str46 = str99;
                                                                                                        if (wf7.j(str45, str46)) {
                                                                                                        }
                                                                                                        i9 = 0;
                                                                                                        int i292222 = 0;
                                                                                                        while (true) {
                                                                                                            j19 = j15;
                                                                                                            if (i9 < arrayList11.size()) {
                                                                                                            }
                                                                                                            i9++;
                                                                                                            arrayList11 = arrayList59;
                                                                                                            str44 = str116;
                                                                                                            j15 = j19;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        i5 = parseInt8;
                                                                                        i6 = parseInt7;
                                                                                        str32 = str85;
                                                                                        j12 = j41;
                                                                                        str2 = str70;
                                                                                        str31 = str71;
                                                                                        str33 = str72;
                                                                                        arrayList16 = arrayList43;
                                                                                        str34 = str92;
                                                                                        i7 = i24;
                                                                                        arrayList19 = arrayList50;
                                                                                        arrayList21 = arrayList53;
                                                                                        i8 = i25;
                                                                                        str6 = str106;
                                                                                        j16 = j43;
                                                                                        str3 = str52;
                                                                                        str35 = str97;
                                                                                        j15 = i19;
                                                                                        arrayList7 = arrayList35;
                                                                                        str16 = str28;
                                                                                        str36 = str89;
                                                                                        str38 = str104;
                                                                                        arrayList46 = arrayList55;
                                                                                        arrayList17 = arrayList15;
                                                                                        str75 = str30;
                                                                                        str37 = str87;
                                                                                        str42 = str107;
                                                                                        f6 = f3;
                                                                                        String str129 = str68;
                                                                                        z2 = z;
                                                                                        j13 = j38;
                                                                                        j17 = j44;
                                                                                        str41 = str27;
                                                                                        arrayList20 = arrayList52;
                                                                                        long j52 = j37;
                                                                                        arrayList18 = arrayList54;
                                                                                        str21 = str129;
                                                                                        str40 = str93;
                                                                                        j18 = j52;
                                                                                        if (q0f.b(xmlPullParser, str41)) {
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    arrayList46 = arrayList47;
                                                                                    arrayList13 = arrayList49;
                                                                                    str14 = str80;
                                                                                    str15 = attributeValue15;
                                                                                    str6 = str63;
                                                                                    int i43 = i21;
                                                                                    j12 = j41;
                                                                                    long j53 = i19;
                                                                                    str2 = str70;
                                                                                    arrayList7 = arrayList35;
                                                                                    long j54 = j37;
                                                                                    String str130 = str71;
                                                                                    str16 = str76;
                                                                                    str17 = str77;
                                                                                    str18 = str79;
                                                                                    str19 = str78;
                                                                                    i3 = 0;
                                                                                    str20 = str69;
                                                                                    str3 = str52;
                                                                                    str21 = str68;
                                                                                    String str131 = str72;
                                                                                    z2 = z;
                                                                                    j13 = j38;
                                                                                    if (q0f.c(xmlPullParser, str131)) {
                                                                                        wx9Var2 = o(xmlPullParser, (vx9) wx9Var2);
                                                                                        str23 = str131;
                                                                                        i21 = i43;
                                                                                        str26 = str67;
                                                                                        arrayList14 = arrayList38;
                                                                                        str24 = str91;
                                                                                        j8 = j54;
                                                                                        j9 = j53;
                                                                                        str22 = str130;
                                                                                    } else {
                                                                                        str22 = str130;
                                                                                        if (q0f.c(xmlPullParser, str22)) {
                                                                                            long d5 = d(xmlPullParser, j40);
                                                                                            str23 = str131;
                                                                                            i4 = i43;
                                                                                            wx9Var2 = p(xmlPullParser, (sx9) wx9Var2, j54, j53, j12, d5, j13);
                                                                                            j9 = j53;
                                                                                            j8 = j54;
                                                                                            j40 = d5;
                                                                                            j13 = j13;
                                                                                        } else {
                                                                                            str23 = str131;
                                                                                            i4 = i43;
                                                                                            long j55 = j40;
                                                                                            j8 = j54;
                                                                                            j9 = j53;
                                                                                            j13 = j13;
                                                                                            if (q0f.c(xmlPullParser, str21)) {
                                                                                                long d6 = d(xmlPullParser, j55);
                                                                                                wx9Var2 = q(xmlPullParser, (tx9) wx9Var2, arrayList13, j8, j9, j12, d6, j13);
                                                                                                j40 = d6;
                                                                                            } else {
                                                                                                if (q0f.c(xmlPullParser, "InbandEventStream")) {
                                                                                                    arrayList14 = arrayList38;
                                                                                                    arrayList14.add(h(xmlPullParser, "InbandEventStream"));
                                                                                                    j14 = j55;
                                                                                                    str24 = str91;
                                                                                                } else {
                                                                                                    arrayList14 = arrayList38;
                                                                                                    j14 = j55;
                                                                                                    if (q0f.c(xmlPullParser, "Label")) {
                                                                                                        str24 = str91;
                                                                                                        String attributeValue33 = xmlPullParser.getAttributeValue(null, str24);
                                                                                                        String str132 = "";
                                                                                                        while (true) {
                                                                                                            xmlPullParser.next();
                                                                                                            String str133 = str132;
                                                                                                            if (xmlPullParser.getEventType() == 4) {
                                                                                                                str25 = xmlPullParser.getText();
                                                                                                            } else {
                                                                                                                b(xmlPullParser);
                                                                                                                str25 = str133;
                                                                                                            }
                                                                                                            if (q0f.b(xmlPullParser, "Label")) {
                                                                                                                arrayList36.add(new sy5(attributeValue33, str25));
                                                                                                            } else {
                                                                                                                str132 = str25;
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        str24 = str91;
                                                                                                        if (xmlPullParser.getEventType() == 2) {
                                                                                                            b(xmlPullParser);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                str26 = str67;
                                                                                                j40 = j14;
                                                                                                i21 = i4;
                                                                                            }
                                                                                        }
                                                                                        str26 = str67;
                                                                                        arrayList14 = arrayList38;
                                                                                        str24 = str91;
                                                                                        i21 = i4;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                String str134 = str71;
                                                                str3 = str52;
                                                                str24 = str53;
                                                                str22 = str134;
                                                                str14 = str80;
                                                                str15 = attributeValue15;
                                                                str6 = str63;
                                                                i4 = i21;
                                                                j12 = j41;
                                                                arrayList10 = arrayList37;
                                                                arrayList12 = arrayList39;
                                                                j9 = i19;
                                                                str21 = str68;
                                                                str2 = str70;
                                                                arrayList7 = arrayList35;
                                                                str23 = str72;
                                                                arrayList14 = arrayList38;
                                                                str16 = str76;
                                                                str17 = str77;
                                                                str18 = str79;
                                                                str19 = str78;
                                                                arrayList13 = arrayList45;
                                                                i3 = 0;
                                                                arrayList11 = arrayList40;
                                                                str20 = str69;
                                                                z2 = z;
                                                                j8 = j37;
                                                                j13 = j38;
                                                                j14 = j40;
                                                                str26 = str67;
                                                                j40 = j14;
                                                                i21 = i4;
                                                            }
                                                        }
                                                        str14 = str80;
                                                        str15 = attributeValue15;
                                                        str6 = str63;
                                                        j12 = j41;
                                                        arrayList10 = arrayList37;
                                                        arrayList12 = arrayList39;
                                                        j9 = i19;
                                                        str26 = str67;
                                                        str21 = str68;
                                                        str2 = str70;
                                                        arrayList7 = arrayList35;
                                                        str23 = str72;
                                                        arrayList14 = arrayList38;
                                                        str16 = str76;
                                                        str17 = str77;
                                                        str18 = str79;
                                                        str19 = str78;
                                                        arrayList13 = arrayList45;
                                                        i3 = 0;
                                                        arrayList11 = arrayList40;
                                                        str20 = str69;
                                                        z2 = z;
                                                        j8 = j37;
                                                        j13 = j38;
                                                    }
                                                    if (q0f.b(xmlPullParser, str26)) {
                                                        ArrayList arrayList64 = new ArrayList(arrayList43.size());
                                                        int i44 = i3;
                                                        while (i44 < arrayList43.size()) {
                                                            ArrayList arrayList65 = arrayList43;
                                                            u63 u63Var2 = (u63) arrayList65.get(i44);
                                                            fo4 a2 = u63Var2.a.a();
                                                            if (str74 == null || !arrayList36.isEmpty()) {
                                                                str48 = str74;
                                                                arrayList43 = arrayList65;
                                                                a2.c = mo5.q(arrayList36);
                                                            } else {
                                                                str48 = str74;
                                                                a2.b = str48;
                                                                arrayList43 = arrayList65;
                                                            }
                                                            String str135 = u63Var2.d;
                                                            if (str135 == null) {
                                                                str135 = str81;
                                                            }
                                                            long j56 = j8;
                                                            ArrayList arrayList66 = u63Var2.e;
                                                            ArrayList arrayList67 = arrayList10;
                                                            arrayList66.addAll(arrayList67);
                                                            arrayList10 = arrayList67;
                                                            long j57 = j9;
                                                            if (arrayList66.isEmpty()) {
                                                                i12 = i21;
                                                                str49 = str24;
                                                                j20 = j13;
                                                            } else {
                                                                int i45 = i3;
                                                                while (true) {
                                                                    if (i45 < arrayList66.size()) {
                                                                        zr3 zr3Var = (zr3) arrayList66.get(i45);
                                                                        i12 = i21;
                                                                        if (!n61.d.equals(zr3Var.b) || (str50 = zr3Var.c) == null) {
                                                                            i45++;
                                                                            i21 = i12;
                                                                        } else {
                                                                            arrayList66.remove(i45);
                                                                        }
                                                                    } else {
                                                                        i12 = i21;
                                                                        str50 = null;
                                                                    }
                                                                }
                                                                if (str50 != null) {
                                                                    int i46 = i3;
                                                                    while (i46 < arrayList66.size()) {
                                                                        zr3 zr3Var2 = (zr3) arrayList66.get(i46);
                                                                        String str136 = str24;
                                                                        if (n61.c.equals(zr3Var2.b) && zr3Var2.c == null) {
                                                                            j21 = j13;
                                                                            arrayList66.set(i46, new zr3(n61.d, str50, zr3Var2.d, zr3Var2.e));
                                                                        } else {
                                                                            j21 = j13;
                                                                        }
                                                                        i46++;
                                                                        j13 = j21;
                                                                        str24 = str136;
                                                                    }
                                                                }
                                                                str49 = str24;
                                                                j20 = j13;
                                                                for (int size = arrayList66.size() - 1; size >= 0; size--) {
                                                                    zr3 zr3Var3 = (zr3) arrayList66.get(size);
                                                                    if (zr3Var3.e == null) {
                                                                        int i47 = i3;
                                                                        while (true) {
                                                                            if (i47 < arrayList66.size()) {
                                                                                zr3 zr3Var4 = (zr3) arrayList66.get(i47);
                                                                                if (zr3Var4.e != null && zr3Var3.e == null && zr3Var4.a(zr3Var3.b)) {
                                                                                    arrayList66.remove(size);
                                                                                } else {
                                                                                    i47++;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                a2.w = new as3(str135, arrayList66);
                                                            }
                                                            ArrayList arrayList68 = u63Var2.f;
                                                            arrayList68.addAll(arrayList14);
                                                            go4 go4Var2 = new go4(a2);
                                                            mo5 mo5Var = u63Var2.b;
                                                            wx9 wx9Var4 = u63Var2.c;
                                                            ArrayList arrayList69 = u63Var2.g;
                                                            ArrayList arrayList70 = u63Var2.h;
                                                            if (wx9Var4 instanceof vx9) {
                                                                ia9Var = new ja9(go4Var2, mo5Var, (vx9) wx9Var4, arrayList68, arrayList69, arrayList70);
                                                            } else {
                                                                if (!(wx9Var4 instanceof rx9)) {
                                                                    u36.j("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
                                                                    return null;
                                                                }
                                                                ia9Var = new ia9(go4Var2, mo5Var, (rx9) wx9Var4, arrayList68, arrayList69, arrayList70);
                                                            }
                                                            arrayList64.add(ia9Var);
                                                            i44++;
                                                            str74 = str48;
                                                            i21 = i12;
                                                            j13 = j20;
                                                            str24 = str49;
                                                            j8 = j56;
                                                            j9 = j57;
                                                        }
                                                        str4 = str24;
                                                        i2 = 1;
                                                        arrayList6.add(new ea(parseLong4, i21, arrayList64, arrayList12, arrayList46, arrayList13));
                                                        str5 = str64;
                                                        j = j13;
                                                    } else {
                                                        j38 = j13;
                                                        i2 = 1;
                                                        String str137 = str22;
                                                        str53 = str24;
                                                        str52 = str3;
                                                        str71 = str137;
                                                        str67 = str26;
                                                        j37 = j8;
                                                        arrayList38 = arrayList14;
                                                        str72 = str23;
                                                        j41 = j12;
                                                        z = z2;
                                                        str69 = str20;
                                                        arrayList40 = arrayList11;
                                                        arrayList34 = arrayList8;
                                                        arrayList44 = arrayList9;
                                                        arrayList37 = arrayList10;
                                                        arrayList45 = arrayList13;
                                                        str80 = str14;
                                                        str70 = str2;
                                                        str68 = str21;
                                                        str78 = str19;
                                                        arrayList39 = arrayList12;
                                                        str79 = str18;
                                                        str77 = str17;
                                                        str76 = str16;
                                                        arrayList35 = arrayList7;
                                                        i19 = j9;
                                                        attributeValue15 = str15;
                                                        str63 = str6;
                                                    }
                                                }
                                            } else {
                                                j7 = j34;
                                                arrayList3 = arrayList30;
                                                str2 = str62;
                                                String str138 = str63;
                                                long j58 = j30;
                                                str3 = str52;
                                                long j59 = j;
                                                str4 = str53;
                                                long j60 = i19;
                                                arrayList7 = arrayList29;
                                                z2 = z;
                                                if (q0f.c(xmlPullParser, "EventStream")) {
                                                    String str139 = str66;
                                                    String attributeValue34 = xmlPullParser.getAttributeValue(null, str139);
                                                    String str140 = attributeValue34 == null ? "" : attributeValue34;
                                                    String str141 = str64;
                                                    String attributeValue35 = xmlPullParser.getAttributeValue(null, str141);
                                                    String str142 = attributeValue35 == null ? "" : attributeValue35;
                                                    String attributeValue36 = xmlPullParser.getAttributeValue(null, "timescale");
                                                    long parseLong5 = attributeValue36 == null ? 1L : Long.parseLong(attributeValue36);
                                                    String attributeValue37 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
                                                    long parseLong6 = attributeValue37 == null ? 0L : Long.parseLong(attributeValue37);
                                                    ArrayList arrayList71 = new ArrayList();
                                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                                                    while (true) {
                                                        xmlPullParser.next();
                                                        if (q0f.c(xmlPullParser, "Event")) {
                                                            str12 = str138;
                                                            String attributeValue38 = xmlPullParser.getAttributeValue(null, str12);
                                                            long parseLong7 = attributeValue38 == null ? 0L : Long.parseLong(attributeValue38);
                                                            str9 = str65;
                                                            String attributeValue39 = xmlPullParser.getAttributeValue(null, str9);
                                                            long parseLong8 = attributeValue39 == null ? -9223372036854775807L : Long.parseLong(attributeValue39);
                                                            String attributeValue40 = xmlPullParser.getAttributeValue(null, "presentationTime");
                                                            long parseLong9 = attributeValue40 == null ? 0L : Long.parseLong(attributeValue40);
                                                            String str143 = hac.a;
                                                            RoundingMode roundingMode = RoundingMode.DOWN;
                                                            long b0 = hac.b0(parseLong8, 1000L, parseLong5, roundingMode);
                                                            long b02 = hac.b0(parseLong9 - parseLong6, 1000000L, parseLong5, roundingMode);
                                                            String attributeValue41 = xmlPullParser.getAttributeValue(null, "messageData");
                                                            if (attributeValue41 == null) {
                                                                attributeValue41 = null;
                                                            }
                                                            byteArrayOutputStream.reset();
                                                            XmlSerializer newSerializer = Xml.newSerializer();
                                                            str66 = str139;
                                                            newSerializer.setOutput(byteArrayOutputStream, StandardCharsets.UTF_8.name());
                                                            xmlPullParser.nextToken();
                                                            while (!q0f.b(xmlPullParser, "Event")) {
                                                                switch (xmlPullParser.getEventType()) {
                                                                    case 0:
                                                                        str13 = str141;
                                                                        j11 = parseLong6;
                                                                        newSerializer.startDocument(null, Boolean.FALSE);
                                                                        break;
                                                                    case 1:
                                                                        str13 = str141;
                                                                        j11 = parseLong6;
                                                                        newSerializer.endDocument();
                                                                        break;
                                                                    case 2:
                                                                        str13 = str141;
                                                                        newSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                                                                        int i48 = 0;
                                                                        while (i48 < xmlPullParser.getAttributeCount()) {
                                                                            newSerializer.attribute(xmlPullParser.getAttributeNamespace(i48), xmlPullParser.getAttributeName(i48), xmlPullParser.getAttributeValue(i48));
                                                                            i48++;
                                                                            parseLong6 = parseLong6;
                                                                        }
                                                                        j11 = parseLong6;
                                                                        break;
                                                                    case 3:
                                                                        str13 = str141;
                                                                        newSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                                                                        j11 = parseLong6;
                                                                        break;
                                                                    case 4:
                                                                        newSerializer.text(xmlPullParser.getText());
                                                                        str13 = str141;
                                                                        j11 = parseLong6;
                                                                        break;
                                                                    case 5:
                                                                        newSerializer.cdsect(xmlPullParser.getText());
                                                                        str13 = str141;
                                                                        j11 = parseLong6;
                                                                        break;
                                                                    case 6:
                                                                        newSerializer.entityRef(xmlPullParser.getText());
                                                                        str13 = str141;
                                                                        j11 = parseLong6;
                                                                        break;
                                                                    case 7:
                                                                        newSerializer.ignorableWhitespace(xmlPullParser.getText());
                                                                        str13 = str141;
                                                                        j11 = parseLong6;
                                                                        break;
                                                                    case 8:
                                                                        newSerializer.processingInstruction(xmlPullParser.getText());
                                                                        str13 = str141;
                                                                        j11 = parseLong6;
                                                                        break;
                                                                    case 9:
                                                                        newSerializer.comment(xmlPullParser.getText());
                                                                        str13 = str141;
                                                                        j11 = parseLong6;
                                                                        break;
                                                                    case 10:
                                                                        newSerializer.docdecl(xmlPullParser.getText());
                                                                        str13 = str141;
                                                                        j11 = parseLong6;
                                                                        break;
                                                                    default:
                                                                        str13 = str141;
                                                                        j11 = parseLong6;
                                                                        break;
                                                                }
                                                                xmlPullParser.nextToken();
                                                                str141 = str13;
                                                                parseLong6 = j11;
                                                            }
                                                            str8 = str141;
                                                            j10 = parseLong6;
                                                            newSerializer.flush();
                                                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                            Long valueOf = Long.valueOf(b02);
                                                            if (attributeValue41 != null) {
                                                                byteArray = attributeValue41.getBytes(StandardCharsets.UTF_8);
                                                            }
                                                            str10 = str140;
                                                            str11 = str142;
                                                            arrayList71.add(Pair.create(valueOf, new u54(str140, str142, b0, parseLong7, byteArray)));
                                                        } else {
                                                            str66 = str139;
                                                            str8 = str141;
                                                            j10 = parseLong6;
                                                            str9 = str65;
                                                            str10 = str140;
                                                            str11 = str142;
                                                            str12 = str138;
                                                            b(xmlPullParser);
                                                        }
                                                        if (q0f.b(xmlPullParser, "EventStream")) {
                                                            long[] jArr = new long[arrayList71.size()];
                                                            u54[] u54VarArr = new u54[arrayList71.size()];
                                                            for (int i49 = 0; i49 < arrayList71.size(); i49++) {
                                                                Pair pair2 = (Pair) arrayList71.get(i49);
                                                                jArr[i49] = ((Long) pair2.first).longValue();
                                                                u54VarArr[i49] = (u54) pair2.second;
                                                            }
                                                            arrayList32.add(new x54(str10, str11, jArr, u54VarArr));
                                                            str5 = str8;
                                                            str6 = str12;
                                                            str65 = str9;
                                                            arrayList6 = arrayList6;
                                                            j = j59;
                                                            j8 = j58;
                                                            j9 = j60;
                                                        } else {
                                                            str141 = str8;
                                                            str140 = str10;
                                                            str142 = str11;
                                                            str138 = str12;
                                                            str65 = str9;
                                                            str139 = str66;
                                                            parseLong6 = j10;
                                                        }
                                                    }
                                                } else {
                                                    String str144 = str65;
                                                    ArrayList arrayList72 = arrayList32;
                                                    if (q0f.c(xmlPullParser, "SegmentBase")) {
                                                        wx9Var = o(xmlPullParser, null);
                                                        str5 = str64;
                                                        arrayList32 = arrayList72;
                                                        str6 = str138;
                                                        str65 = str144;
                                                        arrayList6 = arrayList6;
                                                        j34 = j7;
                                                        j = j59;
                                                        j8 = j58;
                                                        j9 = j60;
                                                        str7 = str2;
                                                        j6 = -9223372036854775807L;
                                                    } else {
                                                        if (q0f.c(xmlPullParser, "SegmentList")) {
                                                            str6 = str138;
                                                            j6 = -9223372036854775807L;
                                                            long d7 = d(xmlPullParser, -9223372036854775807L);
                                                            str5 = str64;
                                                            arrayList32 = arrayList72;
                                                            str65 = str144;
                                                            j = j59;
                                                            wx9Var = p(xmlPullParser, null, j58, j60, j7, d7, j);
                                                            j9 = j60;
                                                            j8 = j58;
                                                            j33 = d7;
                                                            arrayList6 = arrayList6;
                                                        } else {
                                                            str5 = str64;
                                                            arrayList32 = arrayList72;
                                                            str6 = str138;
                                                            str65 = str144;
                                                            j = j59;
                                                            j8 = j58;
                                                            j9 = j60;
                                                            j6 = -9223372036854775807L;
                                                            if (q0f.c(xmlPullParser, str68)) {
                                                                long d8 = d(xmlPullParser, -9223372036854775807L);
                                                                ko5 ko5Var = mo5.b;
                                                                arrayList6 = arrayList6;
                                                                wx9Var = q(xmlPullParser, null, y79.e, j8, j9, j7, d8, j);
                                                                j = j;
                                                                j33 = d8;
                                                            } else {
                                                                arrayList6 = arrayList6;
                                                                if (q0f.c(xmlPullParser, "AssetIdentifier")) {
                                                                    h(xmlPullParser, "AssetIdentifier");
                                                                } else {
                                                                    b(xmlPullParser);
                                                                }
                                                            }
                                                        }
                                                        j34 = j7;
                                                        str7 = str2;
                                                    }
                                                }
                                            }
                                            j6 = -9223372036854775807L;
                                            j34 = j7;
                                            str7 = str2;
                                        }
                                        if (q0f.b(xmlPullParser, str7)) {
                                            Pair create = Pair.create(new h58(attributeValue12, i18, arrayList6, arrayList32), Long.valueOf(j9));
                                            h58 h58Var = (h58) create.first;
                                            if (h58Var.b != j6) {
                                                long longValue = ((Long) create.second).longValue();
                                                long j61 = longValue == j6 ? j6 : longValue + h58Var.b;
                                                arrayList4 = arrayList26;
                                                arrayList4.add(h58Var);
                                                j26 = j61;
                                            } else {
                                                if (!equals) {
                                                    throw bx7.b("Unable to determine start of period " + arrayList26.size(), null);
                                                }
                                                arrayList4 = arrayList26;
                                                i17 = i2;
                                                j26 = j31;
                                            }
                                        } else {
                                            str62 = str7;
                                            j30 = j8;
                                            str64 = str5;
                                            arrayList33 = arrayList5;
                                            arrayList31 = arrayList6;
                                            z = z2;
                                            arrayList30 = arrayList3;
                                            str52 = str3;
                                            str53 = str4;
                                            long j62 = j9;
                                            arrayList29 = arrayList7;
                                            i19 = j62;
                                            str63 = str6;
                                        }
                                    }
                                } else {
                                    arrayList3 = arrayList28;
                                    j5 = j26;
                                    z2 = z;
                                    j6 = j25;
                                    arrayList4 = arrayList26;
                                    b(xmlPullParser);
                                }
                            }
                            lu8Var = lu8Var2;
                            s13Var = s13Var2;
                        }
                        lu8Var = lu8Var2;
                        s13Var = s13Var2;
                        j24 = j4;
                        j26 = j5;
                    }
                    j24 = j4;
                }
            }
            if (q0f.b(xmlPullParser, "MPD")) {
                if (i14 == j6) {
                    if (j26 != j6) {
                        i14 = j26;
                    } else if (!equals) {
                        throw bx7.b("Unable to determine duration of static manifest.", null);
                    }
                }
                if (arrayList4.isEmpty()) {
                    throw bx7.b("No periods found.", null);
                }
                return new t63(W, i14, i15, equals, j2, j, j3, W2, lu8Var, s13Var, vs6Var, arrayList4, arrayList);
            }
            arrayList26 = arrayList4;
            lu8Var2 = lu8Var;
            s13Var2 = s13Var;
            i = i2;
            arrayList27 = arrayList2;
            arrayList25 = arrayList;
            uri2 = str;
            z = z2;
            a = arrayList3;
            j25 = j6;
            str51 = null;
        }
    }

    public static b19 l(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        long j2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j = Long.parseLong(split[0]);
            if (split.length == 2) {
                j2 = (Long.parseLong(split[1]) - j) + 1;
                return new b19(j, attributeValue, j2);
            }
        } else {
            j = 0;
        }
        j2 = -1;
        return new b19(j, attributeValue, j2);
    }

    public static int m(String str) {
        if (str != null) {
            switch (str) {
                case "subtitle":
                case "forced_subtitle":
                case "forced-subtitle":
                    return 128;
                case "description":
                    return 512;
                case "enhanced-audio-intelligibility":
                    return 2048;
                case "alternate":
                    return 2;
                case "dub":
                    return 16;
                case "main":
                    return 1;
                case "sign":
                    return 256;
                case "caption":
                    return 64;
                case "commentary":
                    return 8;
                case "emergency":
                    return 32;
                case "supplementary":
                    return 4;
            }
        }
        return 0;
    }

    public static int n(ArrayList arrayList) {
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (vod.a("http://dashif.org/guidelines/trickmode", ((lf3) arrayList.get(i2)).a)) {
                i = TLObject.FLAG_14;
            }
        }
        return i;
    }

    public static vx9 o(XmlPullParser xmlPullParser, vx9 vx9Var) {
        long j;
        long j2 = vx9Var != null ? vx9Var.b : 1L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j2 = Long.parseLong(attributeValue);
        }
        long j3 = j2;
        long j4 = 0;
        long j5 = vx9Var != null ? vx9Var.c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j5 = Long.parseLong(attributeValue2);
        }
        long j6 = j5;
        if (vx9Var != null) {
            j = vx9Var.d;
            j4 = vx9Var.e;
        } else {
            j = 0;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue3 != null) {
            String[] split = attributeValue3.split("-");
            j = Long.parseLong(split[0]);
            j4 = (Long.parseLong(split[1]) - j) + 1;
        }
        long j7 = j4;
        long j8 = j;
        b19 b19Var = vx9Var != null ? vx9Var.a : null;
        while (true) {
            xmlPullParser.next();
            if (q0f.c(xmlPullParser, "Initialization")) {
                b19Var = l(xmlPullParser, "sourceURL", "range");
            } else {
                b(xmlPullParser);
            }
            b19 b19Var2 = b19Var;
            if (q0f.b(xmlPullParser, "SegmentBase")) {
                return new vx9(b19Var2, j3, j6, j8, j7);
            }
            b19Var = b19Var2;
        }
    }

    public static sx9 p(XmlPullParser xmlPullParser, sx9 sx9Var, long j, long j2, long j3, long j4, long j5) {
        long j6 = sx9Var != null ? sx9Var.b : 1L;
        ArrayList arrayList = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j6 = Long.parseLong(attributeValue);
        }
        long j7 = j6;
        long j8 = sx9Var != null ? sx9Var.c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j8 = Long.parseLong(attributeValue2);
        }
        long j9 = j8;
        long j10 = sx9Var != null ? sx9Var.e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j10 = Long.parseLong(attributeValue3);
        }
        long j11 = j10;
        long j12 = sx9Var != null ? sx9Var.d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j12 = Long.parseLong(attributeValue4);
        }
        long j13 = j12;
        long j14 = j4 == -9223372036854775807L ? j3 : j4;
        long j15 = j14 == Long.MAX_VALUE ? -9223372036854775807L : j14;
        b19 b19Var = null;
        ArrayList arrayList2 = null;
        do {
            xmlPullParser.next();
            if (q0f.c(xmlPullParser, "Initialization")) {
                b19Var = l(xmlPullParser, "sourceURL", "range");
            } else if (q0f.c(xmlPullParser, "SegmentTimeline")) {
                arrayList2 = r(xmlPullParser, j7, j2);
            } else if (q0f.c(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(l(xmlPullParser, "media", "mediaRange"));
            } else {
                b(xmlPullParser);
            }
        } while (!q0f.b(xmlPullParser, "SegmentList"));
        if (sx9Var != null) {
            if (b19Var == null) {
                b19Var = sx9Var.a;
            }
            if (arrayList2 == null) {
                arrayList2 = sx9Var.f;
            }
            if (arrayList == null) {
                arrayList = sx9Var.j;
            }
        }
        return new sx9(b19Var, j7, j9, j13, j11, arrayList2, j15, arrayList, hac.T(j5), hac.T(j));
    }

    public static tx9 q(XmlPullParser xmlPullParser, tx9 tx9Var, List list, long j, long j2, long j3, long j4, long j5) {
        long j6;
        long j7 = tx9Var != null ? tx9Var.b : 1L;
        b19 b19Var = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j7 = Long.parseLong(attributeValue);
        }
        long j8 = j7;
        long j9 = tx9Var != null ? tx9Var.c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j9 = Long.parseLong(attributeValue2);
        }
        long j10 = j9;
        long j11 = tx9Var != null ? tx9Var.e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j11 = Long.parseLong(attributeValue3);
        }
        long j12 = j11;
        long j13 = tx9Var != null ? tx9Var.d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j13 = Long.parseLong(attributeValue4);
        }
        long j14 = j13;
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                j6 = -1;
                break;
            }
            lf3 lf3Var = (lf3) list.get(i);
            if (vod.a("http://dashif.org/guidelines/last-segment-number", lf3Var.a)) {
                j6 = Long.parseLong(lf3Var.b);
                break;
            }
            i++;
        }
        long j15 = j6;
        long j16 = j4 == -9223372036854775807L ? j3 : j4;
        long j17 = j16 == Long.MAX_VALUE ? -9223372036854775807L : j16;
        wm9 s = s(xmlPullParser, "media", tx9Var != null ? tx9Var.k : null);
        wm9 s2 = s(xmlPullParser, "initialization", tx9Var != null ? tx9Var.j : null);
        ArrayList arrayList = null;
        do {
            xmlPullParser.next();
            if (q0f.c(xmlPullParser, "Initialization")) {
                b19Var = l(xmlPullParser, "sourceURL", "range");
            } else if (q0f.c(xmlPullParser, "SegmentTimeline")) {
                arrayList = r(xmlPullParser, j8, j2);
            } else {
                b(xmlPullParser);
            }
        } while (!q0f.b(xmlPullParser, "SegmentTemplate"));
        if (tx9Var != null) {
            if (b19Var == null) {
                b19Var = tx9Var.a;
            }
            if (arrayList == null) {
                arrayList = tx9Var.f;
            }
        }
        return new tx9(b19Var, j8, j10, j14, j15, j12, arrayList, j17, s2, s, hac.T(j5), hac.T(j));
    }

    public static ArrayList r(XmlPullParser xmlPullParser, long j, long j2) {
        long j3;
        ArrayList arrayList = new ArrayList();
        long j4 = 0;
        long j5 = -9223372036854775807L;
        boolean z = false;
        int i = 0;
        do {
            xmlPullParser.next();
            if (q0f.c(xmlPullParser, "S")) {
                String attributeValue = xmlPullParser.getAttributeValue(null, "t");
                long parseLong = attributeValue == null ? -9223372036854775807L : Long.parseLong(attributeValue);
                if (z) {
                    int i2 = i;
                    j3 = parseLong;
                    j4 = a(arrayList, j4, j5, i2, j3);
                } else {
                    j3 = parseLong;
                }
                if (j3 != -9223372036854775807L) {
                    j4 = j3;
                }
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "d");
                j5 = attributeValue2 == null ? -9223372036854775807L : Long.parseLong(attributeValue2);
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "r");
                i = attributeValue3 == null ? 0 : Integer.parseInt(attributeValue3);
                z = true;
            } else {
                b(xmlPullParser);
            }
        } while (!q0f.b(xmlPullParser, "SegmentTimeline"));
        if (z) {
            String str = hac.a;
            a(arrayList, j4, j5, i, hac.b0(j2, j, 1000L, RoundingMode.DOWN));
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x011d, code lost:
    
        switch(r7) {
            case 0: goto L46;
            case 1: goto L45;
            case 2: goto L44;
            default: goto L59;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x012a, code lost:
    
        r14.add(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0143, code lost:
    
        r1.set(r14.size() - 1, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0133, code lost:
    
        r14.add(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x013c, code lost:
    
        r14.add(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0120, code lost:
    
        u36.j("Invalid template: ".concat(r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0129, code lost:
    
        return null;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static wm9 s(XmlPullParser xmlPullParser, String str, wm9 wm9Var) {
        String str2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return wm9Var;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        arrayList.add("");
        int i = 0;
        while (i < attributeValue.length()) {
            int indexOf = attributeValue.indexOf("$", i);
            char c2 = 65535;
            if (indexOf == -1) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(i));
                i = attributeValue.length();
            } else if (indexOf != i) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(i, indexOf));
                i = indexOf;
            } else if (attributeValue.startsWith("$$", i)) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + "$");
                i += 2;
            } else {
                arrayList3.add("");
                int i2 = i + 1;
                int indexOf2 = attributeValue.indexOf("$", i2);
                String substring = attributeValue.substring(i2, indexOf2);
                if (!substring.equals("RepresentationID")) {
                    int indexOf3 = substring.indexOf("%0");
                    if (indexOf3 != -1) {
                        str2 = substring.substring(indexOf3);
                        if (!str2.endsWith("d") && !str2.endsWith("x") && !str2.endsWith("X")) {
                            str2 = str2.concat("d");
                        }
                        substring = substring.substring(0, indexOf3);
                    } else {
                        str2 = "%01d";
                    }
                    switch (substring.hashCode()) {
                        case -1950496919:
                            if (substring.equals("Number")) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case 2606829:
                            if (substring.equals("Time")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case 38199441:
                            if (substring.equals("Bandwidth")) {
                                c2 = 2;
                                break;
                            }
                            break;
                    }
                } else {
                    arrayList2.add(1);
                }
                arrayList.add("");
                i = indexOf2 + 1;
            }
        }
        return new wm9(arrayList, arrayList2, arrayList3, (byte) 11);
    }

    @Override // cx7
    public final Object y(Uri uri, e83 e83Var) {
        try {
            XmlPullParser newPullParser = this.a.newPullParser();
            newPullParser.setInput(e83Var, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return k(newPullParser, uri);
            }
            throw bx7.b("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e2) {
            if (e2.getDetail() instanceof IOException) {
                throw ((IOException) e2.getDetail());
            }
            throw bx7.b(null, e2);
        }
    }
}
