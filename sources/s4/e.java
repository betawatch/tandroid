package s4;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import androidx.car.app.navigation.model.Maneuver;
import b4.e0;
import g5.o0;
import h5.d0;
import j3.m0;
import j3.n0;
import j3.r1;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k7.a7;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.tgnet.TLObject;
import org.webrtc.MediaStreamTrack;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;
import s8.i0;
import s8.v;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class e extends DefaultHandler implements o0 {
    public static final Pattern b = Pattern.compile("(\\d+)(?:/(\\d+))?");
    public static final Pattern c = Pattern.compile("CC([1-4])=.*");
    public static final Pattern d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    public static final int[] e = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};
    public final XmlPullParserFactory a;

    public e() {
        try {
            this.a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e6) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e6);
        }
    }

    public static long a(ArrayList arrayList, long j10, long j11, int i10, long j12) {
        int i11;
        if (i10 >= 0) {
            i11 = i10 + 1;
        } else {
            int i12 = d0.a;
            i11 = (int) ((((j12 - j10) + j11) - 1) / j11);
        }
        for (int i13 = 0; i13 < i11; i13++) {
            arrayList.add(new q(j10, j11));
            j10 += j11;
        }
        return j10;
    }

    public static void b(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() == 2) {
            int i10 = 1;
            while (i10 != 0) {
                xmlPullParser.next();
                if (xmlPullParser.getEventType() == 2) {
                    i10++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i10--;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x008a, code lost:
    
        if (r0 == 0) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x008e, code lost:
    
        r8 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c6, code lost:
    
        if (r0.equals("fa01") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0111, code lost:
    
        if (r0 < 33) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int c(XmlPullParser xmlPullParser) {
        char c3;
        int parseInt;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = null;
        }
        attributeValue.getClass();
        int i10 = 6;
        char c10 = 3;
        int i11 = -1;
        switch (attributeValue.hashCode()) {
            case -2128649360:
                if (attributeValue.equals("urn:dts:dash:audio_channel_configuration:2012")) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            case -1352850286:
                if (attributeValue.equals("urn:mpeg:dash:23003:3:audio_channel_configuration:2011")) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case -1138141449:
                if (attributeValue.equals("tag:dolby.com,2014:dash:audio_channel_configuration:2011")) {
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            case -986633423:
                if (attributeValue.equals("urn:mpeg:mpegB:cicp:ChannelConfiguration")) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            case -79006963:
                if (attributeValue.equals("tag:dts.com,2014:dash:audio_channel_configuration:2012")) {
                    c3 = 4;
                    break;
                }
                c3 = 65535;
                break;
            case 312179081:
                if (attributeValue.equals("tag:dts.com,2018:uhd:audio_channel_configuration")) {
                    c3 = 5;
                    break;
                }
                c3 = 65535;
                break;
            case 2036691300:
                if (attributeValue.equals("urn:dolby:dash:audio_channel_configuration:2011")) {
                    c3 = 6;
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
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
                parseInt = attributeValue2 == null ? -1 : Integer.parseInt(attributeValue2);
                if (parseInt > 0) {
                    break;
                }
                break;
            case 1:
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue3 != null) {
                    i11 = Integer.parseInt(attributeValue3);
                    break;
                }
                break;
            case 2:
            case 6:
                String attributeValue4 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue4 != null) {
                    String b10 = a7.b(attributeValue4);
                    b10.getClass();
                    switch (b10.hashCode()) {
                        case 1596796:
                            if (b10.equals("4000")) {
                                c10 = 0;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 2937391:
                            if (b10.equals("a000")) {
                                c10 = 1;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 3094035:
                            if (b10.equals("f801")) {
                                c10 = 2;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 3133436:
                            break;
                        default:
                            c10 = 65535;
                            break;
                    }
                    switch (c10) {
                        case 0:
                            i10 = 1;
                            break;
                        case 1:
                            i10 = 2;
                            break;
                        case 3:
                            i10 = 8;
                            break;
                    }
                    i11 = i10;
                    break;
                }
                i10 = -1;
                i11 = i10;
            case 3:
                String attributeValue5 = xmlPullParser.getAttributeValue(null, "value");
                int parseInt2 = attributeValue5 == null ? -1 : Integer.parseInt(attributeValue5);
                if (parseInt2 >= 0) {
                    int[] iArr = e;
                    if (parseInt2 < iArr.length) {
                        i11 = iArr[parseInt2];
                        break;
                    }
                }
                break;
            case 5:
                String attributeValue6 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue6 != null) {
                    parseInt = Integer.bitCount(Integer.parseInt(attributeValue6, 16));
                    break;
                }
                break;
        }
        do {
            xmlPullParser.next();
        } while (!h5.a.y(xmlPullParser, "AudioChannelConfiguration"));
        return i11;
    }

    public static long d(XmlPullParser xmlPullParser, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j10;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public static ArrayList e(XmlPullParser xmlPullParser, ArrayList arrayList, boolean z4) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : z4 ? 1 : TLObject.FLAG_31;
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
        } while (!h5.a.y(xmlPullParser, "BaseURL"));
        if (str != null && h5.a.u(str)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = str;
            }
            return s8.l.k(new b(parseInt, parseInt2, str, attributeValue3));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            b bVar = (b) arrayList.get(i10);
            String G = h5.a.G(bVar.a, str);
            String str2 = attributeValue3 == null ? G : attributeValue3;
            if (z4) {
                parseInt = bVar.c;
                parseInt2 = bVar.d;
                str2 = bVar.b;
            }
            arrayList2.add(new b(parseInt, parseInt2, G, str2));
        }
        return arrayList2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00eb  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v14, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.UUID] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair f(XmlPullParser xmlPullParser) {
        String str;
        ?? r62;
        String str2;
        String str3;
        ?? r72;
        char c3;
        String str4;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue != null) {
            String b10 = a7.b(attributeValue);
            b10.getClass();
            switch (b10.hashCode()) {
                case -1980789791:
                    if (b10.equals("urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e")) {
                        c3 = 0;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 489446379:
                    if (b10.equals("urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95")) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 755418770:
                    if (b10.equals("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1812765994:
                    if (b10.equals("urn:mpeg:dash:mp4protection:2011")) {
                        c3 = 3;
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
                    r62 = j3.h.c;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r72 = str2;
                    break;
                case 1:
                    r62 = j3.h.e;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r72 = str2;
                    break;
                case 2:
                    r62 = j3.h.d;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r72 = str2;
                    break;
                case 3:
                    str = xmlPullParser.getAttributeValue(null, "value");
                    int attributeCount = xmlPullParser.getAttributeCount();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= attributeCount) {
                            str4 = null;
                        } else {
                            String attributeName = xmlPullParser.getAttributeName(i10);
                            int indexOf = attributeName.indexOf(58);
                            if (indexOf != -1) {
                                attributeName = attributeName.substring(indexOf + 1);
                            }
                            if (attributeName.equals("default_KID")) {
                                str4 = xmlPullParser.getAttributeValue(i10);
                            } else {
                                i10++;
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(str4) && !"00000000-0000-0000-0000-000000000000".equals(str4)) {
                        String[] split = str4.split("\\s+");
                        UUID[] uuidArr = new UUID[split.length];
                        for (int i11 = 0; i11 < split.length; i11++) {
                            uuidArr[i11] = UUID.fromString(split[i11]);
                        }
                        r62 = j3.h.b;
                        str3 = null;
                        r72 = z3.j.a(r62, uuidArr, null);
                        break;
                    } else {
                        r62 = null;
                        str2 = r62;
                        str3 = str2;
                        r72 = str2;
                        break;
                    }
                    break;
            }
            do {
                xmlPullParser.next();
                if (!h5.a.z(xmlPullParser, "clearkey:Laurl") && xmlPullParser.next() == 4) {
                    str3 = xmlPullParser.getText();
                    r72 = r72;
                } else if (h5.a.z(xmlPullParser, "ms:laurl")) {
                    if (r72 == 0 && xmlPullParser.getEventType() == 2) {
                        String name = xmlPullParser.getName();
                        int indexOf2 = name.indexOf(58);
                        if (indexOf2 != -1) {
                            name = name.substring(indexOf2 + 1);
                        }
                        if (name.equals("pssh") && xmlPullParser.next() == 4) {
                            byte[] decode = Base64.decode(xmlPullParser.getText(), 0);
                            e0 e6 = z3.j.e(decode);
                            UUID uuid = e6 == null ? null : (UUID) e6.c;
                            if (uuid == null) {
                                h5.a.K("MpdParser", "Skipping malformed cenc:pssh data");
                                r62 = uuid;
                                r72 = 0;
                            } else {
                                UUID uuid2 = uuid;
                                r72 = decode;
                                r62 = uuid2;
                            }
                        }
                    }
                    if (r72 == 0) {
                        ?? r92 = j3.h.e;
                        if (r92.equals(r62) && h5.a.z(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                            r72 = z3.j.a(r92, null, Base64.decode(xmlPullParser.getText(), 0));
                        }
                    }
                    b(xmlPullParser);
                    r72 = r72;
                } else {
                    str3 = xmlPullParser.getAttributeValue(null, "licenseUrl");
                    r72 = r72;
                }
            } while (!h5.a.y(xmlPullParser, "ContentProtection"));
            return Pair.create(str, r62 != null ? new o3.f(r62, str3, "video/mp4", r72) : null);
        }
        str = null;
        r62 = null;
        str2 = r62;
        str3 = str2;
        r72 = str2;
        do {
            xmlPullParser.next();
            if (!h5.a.z(xmlPullParser, "clearkey:Laurl")) {
            }
            if (h5.a.z(xmlPullParser, "ms:laurl")) {
            }
        } while (!h5.a.y(xmlPullParser, "ContentProtection"));
        return Pair.create(str, r62 != null ? new o3.f(r62, str3, "video/mp4", r72) : null);
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

    public static f h(XmlPullParser xmlPullParser, String str) {
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
        } while (!h5.a.y(xmlPullParser, str));
        return new f(attributeValue, attributeValue2, str2);
    }

    public static long i(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j10;
        }
        Matcher matcher = d0.h.matcher(attributeValue);
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

    public static float j(XmlPullParser xmlPullParser, float f10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = b.matcher(attributeValue);
            if (matcher.matches()) {
                int parseInt = Integer.parseInt(matcher.group(1));
                return !TextUtils.isEmpty(matcher.group(2)) ? parseInt / Integer.parseInt(r2) : parseInt;
            }
        }
        return f10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x094c, code lost:
    
        if ("audio/eac3-joc".equals(r4) != false) goto L344;
     */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0f11 A[LOOP:5: B:182:0x03fd->B:190:0x0f11, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0da4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0c32 A[LOOP:11: B:343:0x0671->B:351:0x0c32, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0878 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x12f2 A[LOOP:1: B:35:0x00d3->B:43:0x12f2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x12be A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c k(XmlPullParser xmlPullParser, Uri uri) {
        boolean z4;
        long j10;
        ArrayList arrayList;
        long j11;
        ArrayList arrayList2;
        long j12;
        boolean z10;
        ArrayList arrayList3;
        long j13;
        long j14;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        String str;
        long j15;
        String str2;
        String str3;
        String str4;
        long j16;
        long j17;
        ArrayList arrayList7;
        long j18;
        long j19;
        String str5;
        String str6;
        ArrayList arrayList8;
        long j20;
        String str7;
        long j21;
        String str8;
        String str9;
        long j22;
        String str10;
        String str11;
        String str12;
        long j23;
        String str13;
        ArrayList arrayList9;
        ArrayList arrayList10;
        long j24;
        ArrayList arrayList11;
        ArrayList arrayList12;
        ArrayList arrayList13;
        ArrayList arrayList14;
        String str14;
        String str15;
        String str16;
        String str17;
        float f10;
        ArrayList arrayList15;
        ArrayList arrayList16;
        String str18;
        String str19;
        String str20;
        ArrayList arrayList17;
        int i10;
        long j25;
        long j26;
        ArrayList arrayList18;
        String str21;
        String str22;
        String str23;
        ArrayList arrayList19;
        int parseInt;
        String str24;
        String str25;
        String str26;
        int parseInt2;
        String str27;
        float f11;
        int parseInt3;
        int i11;
        String str28;
        String str29;
        ArrayList arrayList20;
        String str30;
        ArrayList arrayList21;
        int i12;
        String str31;
        int i13;
        String str32;
        ArrayList arrayList22;
        String str33;
        ArrayList arrayList23;
        String str34;
        ArrayList arrayList24;
        long j27;
        long j28;
        String str35;
        ArrayList arrayList25;
        ArrayList arrayList26;
        long j29;
        ArrayList arrayList27;
        ArrayList arrayList28;
        long j30;
        String str36;
        s sVar;
        int i14;
        String str37;
        String str38;
        String str39;
        String c3;
        ArrayList arrayList29;
        ArrayList arrayList30;
        String str40;
        ArrayList arrayList31;
        Pair pair;
        int parseInt4;
        String str41;
        char c10;
        int i15;
        int i16;
        String str42;
        ArrayList arrayList32;
        m kVar;
        String str43;
        ArrayList arrayList33;
        String[] strArr = new String[0];
        String str44 = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "profiles");
        if (attributeValue != null) {
            strArr = attributeValue.split(",");
        }
        int length = strArr.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                z4 = false;
                break;
            }
            if (strArr[i17].startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                z4 = true;
                break;
            }
            i17++;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "availabilityStartTime");
        long j31 = -9223372036854775807L;
        long J = attributeValue2 == null ? -9223372036854775807L : d0.J(attributeValue2);
        long i18 = i(xmlPullParser, "mediaPresentationDuration", -9223372036854775807L);
        long i19 = i(xmlPullParser, "minBufferTime", -9223372036854775807L);
        boolean equals = "dynamic".equals(xmlPullParser.getAttributeValue(null, TeXSymbolParser.TYPE_ATTR));
        long i20 = equals ? i(xmlPullParser, "minimumUpdatePeriod", -9223372036854775807L) : -9223372036854775807L;
        long i21 = equals ? i(xmlPullParser, "timeShiftBufferDepth", -9223372036854775807L) : -9223372036854775807L;
        long i22 = equals ? i(xmlPullParser, "suggestedPresentationDelay", -9223372036854775807L) : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "publishTime");
        long J2 = attributeValue3 == null ? -9223372036854775807L : d0.J(attributeValue3);
        long j32 = equals ? 0L : -9223372036854775807L;
        ArrayList k10 = s8.l.k(new b(z4 ? 1 : TLObject.FLAG_31, 1, uri.toString(), uri.toString()));
        ArrayList arrayList34 = new ArrayList();
        ArrayList arrayList35 = new ArrayList();
        long j33 = equals ? -9223372036854775807L : 0L;
        i iVar = null;
        b6.h hVar = null;
        Uri uri2 = null;
        t tVar = null;
        boolean z11 = false;
        boolean z12 = false;
        while (true) {
            xmlPullParser.next();
            String str45 = "BaseURL";
            if (h5.a.z(xmlPullParser, "BaseURL")) {
                if (!z11) {
                    j32 = d(xmlPullParser, j32);
                    z11 = true;
                }
                arrayList35.addAll(e(xmlPullParser, k10, z4));
                arrayList = k10;
                j13 = j31;
                arrayList2 = arrayList35;
                j12 = j33;
                z10 = z4;
                arrayList3 = arrayList34;
            } else {
                char c11 = 1;
                String str46 = "lang";
                if (h5.a.z(xmlPullParser, "ProgramInformation")) {
                    String attributeValue4 = xmlPullParser.getAttributeValue(str44, "moreInformationURL");
                    String str47 = attributeValue4 == null ? str44 : attributeValue4;
                    String attributeValue5 = xmlPullParser.getAttributeValue(str44, "lang");
                    String str48 = attributeValue5 == null ? str44 : attributeValue5;
                    String str49 = str44;
                    String str50 = str49;
                    String str51 = str50;
                    while (true) {
                        xmlPullParser.next();
                        j10 = j31;
                        if (h5.a.z(xmlPullParser, "Title")) {
                            str49 = xmlPullParser.nextText();
                        } else if (h5.a.z(xmlPullParser, "Source")) {
                            str50 = xmlPullParser.nextText();
                        } else if (h5.a.z(xmlPullParser, "Copyright")) {
                            str51 = xmlPullParser.nextText();
                        } else {
                            b(xmlPullParser);
                        }
                        String str52 = str49;
                        String str53 = str50;
                        String str54 = str51;
                        if (h5.a.y(xmlPullParser, "ProgramInformation")) {
                            i iVar2 = new i(str52, str53, str54, str47, str48);
                            arrayList = k10;
                            arrayList2 = arrayList35;
                            j12 = j33;
                            z10 = z4;
                            arrayList3 = arrayList34;
                            iVar = iVar2;
                        } else {
                            str49 = str52;
                            str50 = str53;
                            str51 = str54;
                            j31 = j10;
                        }
                    }
                } else {
                    j10 = j31;
                    if (h5.a.z(xmlPullParser, "UTCTiming")) {
                        arrayList = k10;
                        arrayList2 = arrayList35;
                        j12 = j33;
                        hVar = new b6.h(4, xmlPullParser.getAttributeValue(str44, "schemeIdUri"), xmlPullParser.getAttributeValue(str44, "value"));
                    } else if (h5.a.z(xmlPullParser, "Location")) {
                        uri2 = h5.a.H(uri.toString(), xmlPullParser.nextText());
                        arrayList = k10;
                        arrayList2 = arrayList35;
                        j12 = j33;
                    } else if (h5.a.z(xmlPullParser, "ServiceDescription")) {
                        long j34 = j10;
                        long j35 = j34;
                        long j36 = j35;
                        float f12 = -3.4028235E38f;
                        float f13 = -3.4028235E38f;
                        while (true) {
                            xmlPullParser.next();
                            if (h5.a.z(xmlPullParser, "Latency")) {
                                arrayList = k10;
                                String attributeValue6 = xmlPullParser.getAttributeValue(null, "target");
                                j34 = attributeValue6 == null ? j10 : Long.parseLong(attributeValue6);
                                String attributeValue7 = xmlPullParser.getAttributeValue(null, "min");
                                j35 = attributeValue7 == null ? j10 : Long.parseLong(attributeValue7);
                                String attributeValue8 = xmlPullParser.getAttributeValue(null, "max");
                                j36 = attributeValue8 == null ? j10 : Long.parseLong(attributeValue8);
                            } else {
                                arrayList = k10;
                                if (h5.a.z(xmlPullParser, "PlaybackRate")) {
                                    String attributeValue9 = xmlPullParser.getAttributeValue(null, "min");
                                    f12 = attributeValue9 == null ? -3.4028235E38f : Float.parseFloat(attributeValue9);
                                    String attributeValue10 = xmlPullParser.getAttributeValue(null, "max");
                                    f13 = attributeValue10 == null ? -3.4028235E38f : Float.parseFloat(attributeValue10);
                                }
                            }
                            float f14 = f12;
                            float f15 = f13;
                            long j37 = j34;
                            long j38 = j35;
                            long j39 = j36;
                            if (h5.a.y(xmlPullParser, "ServiceDescription")) {
                                arrayList2 = arrayList35;
                                j12 = j33;
                                z10 = z4;
                                arrayList3 = arrayList34;
                                j13 = j10;
                                tVar = new t(j37, j38, j39, f14, f15);
                            } else {
                                k10 = arrayList;
                                j34 = j37;
                                j35 = j38;
                                j36 = j39;
                                f12 = f14;
                                f13 = f15;
                            }
                        }
                    } else {
                        arrayList = k10;
                        if (!h5.a.z(xmlPullParser, "Period") || z12) {
                            j11 = j32;
                            arrayList2 = arrayList35;
                            j12 = j33;
                            z10 = z4;
                            arrayList3 = arrayList34;
                            j13 = j10;
                            j14 = i21;
                            b(xmlPullParser);
                        } else {
                            ArrayList arrayList36 = !arrayList35.isEmpty() ? arrayList35 : arrayList;
                            String str55 = "id";
                            String str56 = "value";
                            String attributeValue11 = xmlPullParser.getAttributeValue(null, "id");
                            long i23 = i(xmlPullParser, "start", j33);
                            long j40 = J != j10 ? J + i23 : j10;
                            j11 = j32;
                            long i24 = i(xmlPullParser, "duration", j10);
                            String str57 = "Period";
                            ArrayList arrayList37 = new ArrayList();
                            String str58 = "schemeIdUri";
                            ArrayList arrayList38 = new ArrayList();
                            ArrayList arrayList39 = new ArrayList();
                            String str59 = "duration";
                            long j41 = j10;
                            long j42 = j11;
                            s sVar2 = null;
                            boolean z13 = false;
                            while (true) {
                                xmlPullParser.next();
                                if (h5.a.z(xmlPullParser, str45)) {
                                    if (!z13) {
                                        j42 = d(xmlPullParser, j42);
                                        z13 = true;
                                    }
                                    arrayList39.addAll(e(xmlPullParser, arrayList36, z4));
                                    arrayList6 = arrayList36;
                                    str = str55;
                                    j15 = j42;
                                    j12 = j33;
                                    str2 = str45;
                                    z10 = z4;
                                    arrayList4 = arrayList39;
                                    arrayList5 = arrayList37;
                                    str3 = str46;
                                    str4 = str56;
                                    j18 = j40;
                                    str6 = str57;
                                    str5 = str59;
                                    j13 = -9223372036854775807L;
                                    arrayList2 = arrayList35;
                                    j14 = i21;
                                    arrayList7 = arrayList34;
                                    j19 = i24;
                                } else {
                                    arrayList4 = arrayList39;
                                    arrayList5 = arrayList37;
                                    arrayList6 = arrayList36;
                                    if (h5.a.z(xmlPullParser, "AdaptationSet")) {
                                        if (arrayList4.isEmpty()) {
                                            str13 = "SegmentTemplate";
                                            arrayList9 = arrayList6;
                                        } else {
                                            str13 = "SegmentTemplate";
                                            arrayList9 = arrayList4;
                                        }
                                        j15 = j42;
                                        String attributeValue12 = xmlPullParser.getAttributeValue(null, str55);
                                        long parseLong = attributeValue12 == null ? -1L : Long.parseLong(attributeValue12);
                                        int g10 = g(xmlPullParser);
                                        String attributeValue13 = xmlPullParser.getAttributeValue(null, "mimeType");
                                        String str60 = "AdaptationSet";
                                        String attributeValue14 = xmlPullParser.getAttributeValue(null, "codecs");
                                        ArrayList arrayList40 = arrayList35;
                                        String attributeValue15 = xmlPullParser.getAttributeValue(null, "width");
                                        int parseInt5 = attributeValue15 == null ? -1 : Integer.parseInt(attributeValue15);
                                        j12 = j33;
                                        String attributeValue16 = xmlPullParser.getAttributeValue(null, "height");
                                        int parseInt6 = attributeValue16 == null ? -1 : Integer.parseInt(attributeValue16);
                                        float j43 = j(xmlPullParser, -1.0f);
                                        long j44 = i21;
                                        String attributeValue17 = xmlPullParser.getAttributeValue(null, "audioSamplingRate");
                                        int parseInt7 = attributeValue17 == null ? -1 : Integer.parseInt(attributeValue17);
                                        String attributeValue18 = xmlPullParser.getAttributeValue(null, str46);
                                        String attributeValue19 = xmlPullParser.getAttributeValue(null, "label");
                                        ArrayList arrayList41 = new ArrayList();
                                        String str61 = attributeValue19;
                                        ArrayList arrayList42 = new ArrayList();
                                        ArrayList arrayList43 = new ArrayList();
                                        String str62 = "SegmentList";
                                        ArrayList arrayList44 = new ArrayList();
                                        String str63 = "SegmentBase";
                                        ArrayList arrayList45 = new ArrayList();
                                        String str64 = "audioSamplingRate";
                                        ArrayList arrayList46 = new ArrayList();
                                        float f16 = j43;
                                        ArrayList arrayList47 = new ArrayList();
                                        ArrayList arrayList48 = new ArrayList();
                                        String str65 = "height";
                                        String str66 = "mimeType";
                                        String str67 = "codecs";
                                        s sVar3 = sVar2;
                                        long j45 = j41;
                                        long j46 = j15;
                                        int i25 = g10;
                                        boolean z14 = false;
                                        int i26 = -1;
                                        String str68 = "width";
                                        String str69 = attributeValue18;
                                        String str70 = null;
                                        while (true) {
                                            xmlPullParser.next();
                                            if (h5.a.z(xmlPullParser, str45)) {
                                                if (!z14) {
                                                    j46 = d(xmlPullParser, j46);
                                                    z14 = true;
                                                }
                                                arrayList48.addAll(e(xmlPullParser, arrayList9, z4));
                                                str = str55;
                                                i10 = i25;
                                                str19 = str69;
                                                arrayList12 = arrayList41;
                                                str2 = str45;
                                                arrayList13 = arrayList46;
                                                arrayList14 = arrayList45;
                                                arrayList11 = arrayList44;
                                                str3 = str46;
                                                str4 = str56;
                                                j26 = j40;
                                                j17 = i24;
                                                str5 = str59;
                                                str14 = str13;
                                                str15 = str68;
                                                arrayList2 = arrayList40;
                                                str21 = str61;
                                                arrayList18 = arrayList42;
                                                str18 = str62;
                                                str20 = str63;
                                                str17 = str64;
                                                f10 = f16;
                                                arrayList15 = arrayList47;
                                                j46 = j46;
                                                arrayList10 = arrayList9;
                                                arrayList16 = arrayList48;
                                                arrayList17 = arrayList43;
                                                z10 = z4;
                                                arrayList7 = arrayList34;
                                                str22 = str60;
                                            } else {
                                                arrayList10 = arrayList9;
                                                if (h5.a.z(xmlPullParser, "ContentProtection")) {
                                                    Pair f17 = f(xmlPullParser);
                                                    j24 = j46;
                                                    Object obj = f17.first;
                                                    if (obj != null) {
                                                        str70 = (String) obj;
                                                    }
                                                    Object obj2 = f17.second;
                                                    if (obj2 != null) {
                                                        arrayList41.add((o3.f) obj2);
                                                    }
                                                } else {
                                                    j24 = j46;
                                                    if (h5.a.z(xmlPullParser, "ContentComponent")) {
                                                        String attributeValue20 = xmlPullParser.getAttributeValue(null, str46);
                                                        if (str69 == null) {
                                                            str69 = attributeValue20;
                                                        } else if (attributeValue20 != null) {
                                                            h5.a.i(str69.equals(attributeValue20));
                                                        }
                                                        int g11 = g(xmlPullParser);
                                                        if (i25 == -1) {
                                                            i25 = g11;
                                                        } else if (g11 != -1) {
                                                            h5.a.i(i25 == g11);
                                                        }
                                                    } else {
                                                        if (h5.a.z(xmlPullParser, "Role")) {
                                                            arrayList44.add(h(xmlPullParser, "Role"));
                                                        } else {
                                                            String str71 = "AudioChannelConfiguration";
                                                            if (h5.a.z(xmlPullParser, "AudioChannelConfiguration")) {
                                                                i26 = c(xmlPullParser);
                                                            } else if (h5.a.z(xmlPullParser, "Accessibility")) {
                                                                arrayList43.add(h(xmlPullParser, "Accessibility"));
                                                            } else {
                                                                String str72 = "EssentialProperty";
                                                                if (h5.a.z(xmlPullParser, "EssentialProperty")) {
                                                                    arrayList45.add(h(xmlPullParser, "EssentialProperty"));
                                                                } else {
                                                                    str3 = str46;
                                                                    if (h5.a.z(xmlPullParser, "SupplementalProperty")) {
                                                                        arrayList46.add(h(xmlPullParser, "SupplementalProperty"));
                                                                        str = str55;
                                                                        i10 = i25;
                                                                        str19 = str69;
                                                                        arrayList12 = arrayList41;
                                                                        str2 = str45;
                                                                        arrayList13 = arrayList46;
                                                                        arrayList14 = arrayList45;
                                                                        arrayList11 = arrayList44;
                                                                        str4 = str56;
                                                                        j26 = j40;
                                                                        j17 = i24;
                                                                        str5 = str59;
                                                                        str14 = str13;
                                                                        str15 = str68;
                                                                        str16 = str60;
                                                                        arrayList2 = arrayList40;
                                                                        arrayList18 = arrayList42;
                                                                        str18 = str62;
                                                                        str20 = str63;
                                                                        str17 = str64;
                                                                        f10 = f16;
                                                                        arrayList15 = arrayList47;
                                                                        j25 = j45;
                                                                        arrayList16 = arrayList48;
                                                                        arrayList17 = arrayList43;
                                                                        z10 = z4;
                                                                        arrayList7 = arrayList34;
                                                                        j14 = j44;
                                                                        j45 = j25;
                                                                        str21 = str61;
                                                                        j46 = j24;
                                                                        str22 = str16;
                                                                        if (h5.a.y(xmlPullParser, str22)) {
                                                                            i25 = i10;
                                                                            c11 = 1;
                                                                            str60 = str22;
                                                                            arrayList42 = arrayList18;
                                                                            j44 = j14;
                                                                            str63 = str20;
                                                                            str61 = str21;
                                                                            arrayList34 = arrayList7;
                                                                            arrayList40 = arrayList2;
                                                                            arrayList43 = arrayList17;
                                                                            str64 = str17;
                                                                            str68 = str15;
                                                                            z4 = z10;
                                                                            arrayList46 = arrayList13;
                                                                            arrayList48 = arrayList16;
                                                                            arrayList9 = arrayList10;
                                                                            arrayList44 = arrayList11;
                                                                            j40 = j26;
                                                                            i24 = j17;
                                                                            f16 = f10;
                                                                            str69 = str19;
                                                                            str45 = str2;
                                                                            arrayList41 = arrayList12;
                                                                            arrayList47 = arrayList15;
                                                                            str56 = str4;
                                                                            str59 = str5;
                                                                            str55 = str;
                                                                            str62 = str18;
                                                                            str13 = str14;
                                                                            str46 = str3;
                                                                            arrayList45 = arrayList14;
                                                                        } else {
                                                                            ArrayList arrayList49 = new ArrayList(arrayList15.size());
                                                                            int i27 = 0;
                                                                            while (i27 < arrayList15.size()) {
                                                                                ArrayList arrayList50 = arrayList15;
                                                                                d dVar = (d) arrayList50.get(i27);
                                                                                m0 a2 = dVar.a.a();
                                                                                if (str21 != null) {
                                                                                    a2.b = str21;
                                                                                }
                                                                                String str73 = dVar.d;
                                                                                if (str73 == null) {
                                                                                    str73 = str70;
                                                                                }
                                                                                ArrayList arrayList51 = dVar.e;
                                                                                ArrayList arrayList52 = arrayList12;
                                                                                arrayList51.addAll(arrayList52);
                                                                                long j47 = j26;
                                                                                if (arrayList51.isEmpty()) {
                                                                                    i16 = i27;
                                                                                    str42 = str21;
                                                                                    arrayList32 = arrayList50;
                                                                                } else {
                                                                                    int i28 = 0;
                                                                                    while (true) {
                                                                                        if (i28 < arrayList51.size()) {
                                                                                            o3.f fVar = (o3.f) arrayList51.get(i28);
                                                                                            i16 = i27;
                                                                                            if (!j3.h.c.equals(fVar.b) || (str43 = fVar.c) == null) {
                                                                                                i28++;
                                                                                                i27 = i16;
                                                                                            } else {
                                                                                                arrayList51.remove(i28);
                                                                                            }
                                                                                        } else {
                                                                                            i16 = i27;
                                                                                            str43 = null;
                                                                                        }
                                                                                    }
                                                                                    if (str43 != null) {
                                                                                        int i29 = 0;
                                                                                        while (i29 < arrayList51.size()) {
                                                                                            o3.f fVar2 = (o3.f) arrayList51.get(i29);
                                                                                            String str74 = str21;
                                                                                            if (j3.h.b.equals(fVar2.b) && fVar2.c == null) {
                                                                                                arrayList33 = arrayList50;
                                                                                                arrayList51.set(i29, new o3.f(j3.h.c, str43, fVar2.d, fVar2.e));
                                                                                            } else {
                                                                                                arrayList33 = arrayList50;
                                                                                            }
                                                                                            i29++;
                                                                                            str21 = str74;
                                                                                            arrayList50 = arrayList33;
                                                                                        }
                                                                                    }
                                                                                    str42 = str21;
                                                                                    arrayList32 = arrayList50;
                                                                                    for (int size = arrayList51.size() - 1; size >= 0; size--) {
                                                                                        o3.f fVar3 = (o3.f) arrayList51.get(size);
                                                                                        if (fVar3.e == null) {
                                                                                            int i30 = 0;
                                                                                            while (true) {
                                                                                                if (i30 < arrayList51.size()) {
                                                                                                    o3.f fVar4 = (o3.f) arrayList51.get(i30);
                                                                                                    if (fVar4.e != null && fVar3.e == null && fVar4.a(fVar3.b)) {
                                                                                                        arrayList51.remove(size);
                                                                                                    } else {
                                                                                                        i30++;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    a2.r = new o3.g(str73, arrayList51);
                                                                                }
                                                                                ArrayList arrayList53 = dVar.f;
                                                                                arrayList53.addAll(arrayList18);
                                                                                n0 n0Var = new n0(a2);
                                                                                v vVar = dVar.b;
                                                                                s sVar4 = dVar.c;
                                                                                ArrayList arrayList54 = dVar.g;
                                                                                ArrayList arrayList55 = dVar.h;
                                                                                if (sVar4 instanceof r) {
                                                                                    kVar = new l(n0Var, vVar, (r) sVar4, arrayList53, arrayList54, arrayList55);
                                                                                } else {
                                                                                    if (!(sVar4 instanceof n)) {
                                                                                        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
                                                                                    }
                                                                                    kVar = new k(n0Var, vVar, (n) sVar4, arrayList53, arrayList54, arrayList55);
                                                                                }
                                                                                arrayList49.add(kVar);
                                                                                i27 = i16 + 1;
                                                                                arrayList12 = arrayList52;
                                                                                str21 = str42;
                                                                                arrayList15 = arrayList32;
                                                                                j26 = j47;
                                                                            }
                                                                            j16 = j26;
                                                                            c11 = 1;
                                                                            arrayList5.add(new a(parseLong, i10, arrayList49, arrayList17, arrayList14, arrayList13));
                                                                        }
                                                                    } else {
                                                                        arrayList11 = arrayList44;
                                                                        String str75 = "Representation";
                                                                        if (h5.a.z(xmlPullParser, "Representation")) {
                                                                            if (arrayList48.isEmpty()) {
                                                                                str23 = "SupplementalProperty";
                                                                                arrayList19 = arrayList10;
                                                                            } else {
                                                                                str23 = "SupplementalProperty";
                                                                                arrayList19 = arrayList48;
                                                                            }
                                                                            String str76 = "ContentProtection";
                                                                            String str77 = "InbandEventStream";
                                                                            String attributeValue21 = xmlPullParser.getAttributeValue(null, str55);
                                                                            String str78 = str55;
                                                                            String attributeValue22 = xmlPullParser.getAttributeValue(null, "bandwidth");
                                                                            if (attributeValue22 == null) {
                                                                                str24 = str66;
                                                                                parseInt = -1;
                                                                            } else {
                                                                                String str79 = str66;
                                                                                parseInt = Integer.parseInt(attributeValue22);
                                                                                str24 = str79;
                                                                            }
                                                                            String attributeValue23 = xmlPullParser.getAttributeValue(null, str24);
                                                                            String str80 = str67;
                                                                            String str81 = str24;
                                                                            String str82 = attributeValue23 == null ? attributeValue13 : attributeValue23;
                                                                            String attributeValue24 = xmlPullParser.getAttributeValue(null, str80);
                                                                            String str83 = str80;
                                                                            String str84 = str68;
                                                                            String str85 = attributeValue24 == null ? attributeValue14 : attributeValue24;
                                                                            String attributeValue25 = xmlPullParser.getAttributeValue(null, str84);
                                                                            if (attributeValue25 == null) {
                                                                                String str86 = str65;
                                                                                str25 = str84;
                                                                                str26 = str86;
                                                                                parseInt2 = parseInt5;
                                                                            } else {
                                                                                String str87 = str65;
                                                                                str25 = str84;
                                                                                str26 = str87;
                                                                                parseInt2 = Integer.parseInt(attributeValue25);
                                                                            }
                                                                            String attributeValue26 = xmlPullParser.getAttributeValue(null, str26);
                                                                            if (attributeValue26 == null) {
                                                                                float f18 = f16;
                                                                                str27 = str26;
                                                                                f11 = f18;
                                                                                parseInt3 = parseInt6;
                                                                            } else {
                                                                                float f19 = f16;
                                                                                str27 = str26;
                                                                                f11 = f19;
                                                                                parseInt3 = Integer.parseInt(attributeValue26);
                                                                            }
                                                                            float j48 = j(xmlPullParser, f11);
                                                                            f10 = f11;
                                                                            String str88 = str64;
                                                                            String attributeValue27 = xmlPullParser.getAttributeValue(null, str88);
                                                                            int parseInt8 = attributeValue27 == null ? parseInt7 : Integer.parseInt(attributeValue27);
                                                                            ArrayList arrayList56 = new ArrayList();
                                                                            ArrayList arrayList57 = new ArrayList();
                                                                            ArrayList arrayList58 = new ArrayList(arrayList45);
                                                                            arrayList14 = arrayList45;
                                                                            ArrayList arrayList59 = new ArrayList(arrayList46);
                                                                            ArrayList arrayList60 = new ArrayList();
                                                                            int i31 = parseInt8;
                                                                            String str89 = str88;
                                                                            String str90 = str69;
                                                                            ArrayList arrayList61 = arrayList41;
                                                                            s sVar5 = sVar3;
                                                                            long j49 = j45;
                                                                            int i32 = i26;
                                                                            long j50 = j24;
                                                                            boolean z15 = false;
                                                                            String str91 = null;
                                                                            while (true) {
                                                                                xmlPullParser.next();
                                                                                if (h5.a.z(xmlPullParser, str45)) {
                                                                                    if (!z15) {
                                                                                        j50 = d(xmlPullParser, j50);
                                                                                        z15 = true;
                                                                                    }
                                                                                    i11 = i25;
                                                                                    arrayList60.addAll(e(xmlPullParser, arrayList19, z4));
                                                                                } else {
                                                                                    i11 = i25;
                                                                                    if (h5.a.z(xmlPullParser, str71)) {
                                                                                        i32 = c(xmlPullParser);
                                                                                    } else {
                                                                                        String str92 = str63;
                                                                                        if (h5.a.z(xmlPullParser, str92)) {
                                                                                            str63 = str92;
                                                                                            sVar5 = o(xmlPullParser, (r) sVar5);
                                                                                        } else {
                                                                                            String str93 = str62;
                                                                                            if (h5.a.z(xmlPullParser, str93)) {
                                                                                                arrayList16 = arrayList48;
                                                                                                str2 = str45;
                                                                                                long d10 = d(xmlPullParser, j49);
                                                                                                str28 = str93;
                                                                                                arrayList13 = arrayList46;
                                                                                                str4 = str56;
                                                                                                long j51 = j40;
                                                                                                str5 = str59;
                                                                                                str29 = str60;
                                                                                                arrayList2 = arrayList40;
                                                                                                arrayList20 = arrayList42;
                                                                                                str30 = str92;
                                                                                                arrayList21 = arrayList47;
                                                                                                str15 = str25;
                                                                                                i12 = parseInt;
                                                                                                str66 = str81;
                                                                                                str = str78;
                                                                                                str67 = str83;
                                                                                                arrayList12 = arrayList61;
                                                                                                str31 = str90;
                                                                                                str17 = str89;
                                                                                                i13 = i31;
                                                                                                str32 = str71;
                                                                                                ArrayList arrayList62 = arrayList58;
                                                                                                arrayList22 = arrayList19;
                                                                                                arrayList7 = arrayList34;
                                                                                                str14 = str13;
                                                                                                str65 = str27;
                                                                                                str33 = str72;
                                                                                                arrayList23 = arrayList60;
                                                                                                long j52 = i24;
                                                                                                str34 = str76;
                                                                                                arrayList24 = arrayList43;
                                                                                                long j53 = j44;
                                                                                                j27 = j50;
                                                                                                j28 = j52;
                                                                                                j29 = d10;
                                                                                                z10 = z4;
                                                                                                str35 = str77;
                                                                                                sVar = p(xmlPullParser, (o) sVar5, j51, j52, j50, d10, j53);
                                                                                                arrayList25 = arrayList56;
                                                                                                arrayList27 = arrayList62;
                                                                                                arrayList28 = arrayList59;
                                                                                                j30 = j51;
                                                                                                j14 = j53;
                                                                                                str36 = str75;
                                                                                                str37 = str91;
                                                                                                arrayList26 = arrayList57;
                                                                                            } else {
                                                                                                str28 = str93;
                                                                                                arrayList16 = arrayList48;
                                                                                                str2 = str45;
                                                                                                arrayList13 = arrayList46;
                                                                                                str4 = str56;
                                                                                                str5 = str59;
                                                                                                str29 = str60;
                                                                                                arrayList20 = arrayList42;
                                                                                                str30 = str92;
                                                                                                arrayList21 = arrayList47;
                                                                                                str15 = str25;
                                                                                                i12 = parseInt;
                                                                                                str66 = str81;
                                                                                                str = str78;
                                                                                                str67 = str83;
                                                                                                arrayList12 = arrayList61;
                                                                                                str31 = str90;
                                                                                                str17 = str89;
                                                                                                i13 = i31;
                                                                                                str32 = str71;
                                                                                                ArrayList arrayList63 = arrayList58;
                                                                                                arrayList22 = arrayList19;
                                                                                                str14 = str13;
                                                                                                str65 = str27;
                                                                                                str33 = str72;
                                                                                                long j54 = j40;
                                                                                                arrayList2 = arrayList40;
                                                                                                arrayList7 = arrayList34;
                                                                                                arrayList23 = arrayList60;
                                                                                                str34 = str76;
                                                                                                long j55 = i24;
                                                                                                arrayList24 = arrayList43;
                                                                                                long j56 = j44;
                                                                                                j27 = j50;
                                                                                                j28 = j55;
                                                                                                if (h5.a.z(xmlPullParser, str14)) {
                                                                                                    j14 = j56;
                                                                                                    long d11 = d(xmlPullParser, j49);
                                                                                                    z10 = z4;
                                                                                                    j29 = d11;
                                                                                                    str35 = str77;
                                                                                                    sVar = q(xmlPullParser, (p) sVar5, arrayList13, j54, j28, j27, d11, j14);
                                                                                                    arrayList25 = arrayList56;
                                                                                                } else {
                                                                                                    z10 = z4;
                                                                                                    j14 = j56;
                                                                                                    if (h5.a.z(xmlPullParser, str34)) {
                                                                                                        Pair f20 = f(xmlPullParser);
                                                                                                        Object obj3 = f20.first;
                                                                                                        if (obj3 != null) {
                                                                                                            str91 = (String) obj3;
                                                                                                        }
                                                                                                        Object obj4 = f20.second;
                                                                                                        if (obj4 != null) {
                                                                                                            arrayList25 = arrayList56;
                                                                                                            arrayList25.add((o3.f) obj4);
                                                                                                        } else {
                                                                                                            arrayList25 = arrayList56;
                                                                                                        }
                                                                                                        j29 = j49;
                                                                                                        str35 = str77;
                                                                                                        sVar = sVar5;
                                                                                                    } else {
                                                                                                        str35 = str77;
                                                                                                        arrayList25 = arrayList56;
                                                                                                        if (h5.a.z(xmlPullParser, str35)) {
                                                                                                            arrayList26 = arrayList57;
                                                                                                            arrayList26.add(h(xmlPullParser, str35));
                                                                                                            j29 = j49;
                                                                                                            arrayList27 = arrayList63;
                                                                                                        } else {
                                                                                                            arrayList26 = arrayList57;
                                                                                                            if (h5.a.z(xmlPullParser, str33)) {
                                                                                                                j29 = j49;
                                                                                                                arrayList27 = arrayList63;
                                                                                                                arrayList27.add(h(xmlPullParser, str33));
                                                                                                            } else {
                                                                                                                j29 = j49;
                                                                                                                String str94 = str23;
                                                                                                                arrayList27 = arrayList63;
                                                                                                                if (h5.a.z(xmlPullParser, str94)) {
                                                                                                                    f h = h(xmlPullParser, str94);
                                                                                                                    str23 = str94;
                                                                                                                    arrayList28 = arrayList59;
                                                                                                                    arrayList28.add(h);
                                                                                                                } else {
                                                                                                                    str23 = str94;
                                                                                                                    arrayList28 = arrayList59;
                                                                                                                    b(xmlPullParser);
                                                                                                                }
                                                                                                                j30 = j54;
                                                                                                                str36 = str75;
                                                                                                                sVar = sVar5;
                                                                                                                i14 = i32;
                                                                                                                str37 = str91;
                                                                                                                if (h5.a.y(xmlPullParser, str36)) {
                                                                                                                    ArrayList arrayList64 = arrayList24;
                                                                                                                    ArrayList arrayList65 = arrayList27;
                                                                                                                    arrayList56 = arrayList25;
                                                                                                                    s sVar6 = sVar;
                                                                                                                    arrayList57 = arrayList26;
                                                                                                                    str82 = str82;
                                                                                                                    i24 = j28;
                                                                                                                    arrayList59 = arrayList28;
                                                                                                                    i32 = i14;
                                                                                                                    str75 = str36;
                                                                                                                    str72 = str33;
                                                                                                                    arrayList40 = arrayList2;
                                                                                                                    str71 = str32;
                                                                                                                    arrayList46 = arrayList13;
                                                                                                                    arrayList48 = arrayList16;
                                                                                                                    j49 = j29;
                                                                                                                    str27 = str65;
                                                                                                                    str83 = str67;
                                                                                                                    str91 = str37;
                                                                                                                    arrayList58 = arrayList65;
                                                                                                                    i25 = i11;
                                                                                                                    str45 = str2;
                                                                                                                    arrayList61 = arrayList12;
                                                                                                                    arrayList42 = arrayList20;
                                                                                                                    arrayList47 = arrayList21;
                                                                                                                    str90 = str31;
                                                                                                                    i31 = i13;
                                                                                                                    str63 = str30;
                                                                                                                    str62 = str28;
                                                                                                                    str59 = str5;
                                                                                                                    str78 = str;
                                                                                                                    c11 = 1;
                                                                                                                    str89 = str17;
                                                                                                                    str25 = str15;
                                                                                                                    sVar5 = sVar6;
                                                                                                                    str81 = str66;
                                                                                                                    parseInt = i12;
                                                                                                                    str60 = str29;
                                                                                                                    long j57 = j14;
                                                                                                                    arrayList43 = arrayList64;
                                                                                                                    z4 = z10;
                                                                                                                    str13 = str14;
                                                                                                                    arrayList19 = arrayList22;
                                                                                                                    str56 = str4;
                                                                                                                    long j58 = j30;
                                                                                                                    str77 = str35;
                                                                                                                    str76 = str34;
                                                                                                                    arrayList60 = arrayList23;
                                                                                                                    arrayList34 = arrayList7;
                                                                                                                    j50 = j27;
                                                                                                                    j40 = j58;
                                                                                                                    j44 = j57;
                                                                                                                } else {
                                                                                                                    if (h5.o.h(str82)) {
                                                                                                                        if (str85 != null) {
                                                                                                                            for (String str95 : d0.P(str85)) {
                                                                                                                                c3 = h5.o.c(str95);
                                                                                                                                if (c3 != null && h5.o.h(c3)) {
                                                                                                                                    str38 = c3;
                                                                                                                                    str39 = str82;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                        c3 = null;
                                                                                                                        str38 = c3;
                                                                                                                        str39 = str82;
                                                                                                                    } else if (h5.o.j(str82)) {
                                                                                                                        if (str85 != null) {
                                                                                                                            for (String str96 : d0.P(str85)) {
                                                                                                                                c3 = h5.o.c(str96);
                                                                                                                                if (c3 != null && h5.o.j(c3)) {
                                                                                                                                    str38 = c3;
                                                                                                                                    str39 = str82;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                        c3 = null;
                                                                                                                        str38 = c3;
                                                                                                                        str39 = str82;
                                                                                                                    } else if (h5.o.i(str82) || "image".equals(h5.o.f(str82))) {
                                                                                                                        str38 = str82;
                                                                                                                        str39 = str38;
                                                                                                                    } else {
                                                                                                                        str39 = str82;
                                                                                                                        if ("application/mp4".equals(str39)) {
                                                                                                                            str38 = h5.o.c(str85);
                                                                                                                            if ("text/vtt".equals(str38)) {
                                                                                                                                str38 = "application/x-mp4-vtt";
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            str38 = null;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    if ("audio/eac3".equals(str38)) {
                                                                                                                        j17 = j28;
                                                                                                                        int i33 = 0;
                                                                                                                        while (true) {
                                                                                                                            arrayList30 = arrayList25;
                                                                                                                            str40 = "ec+3";
                                                                                                                            if (i33 < arrayList28.size()) {
                                                                                                                                f fVar5 = (f) arrayList28.get(i33);
                                                                                                                                arrayList29 = arrayList28;
                                                                                                                                String str97 = fVar5.a;
                                                                                                                                String str98 = fVar5.b;
                                                                                                                                int i34 = i33;
                                                                                                                                if ((!"tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str97) || !"JOC".equals(str98)) && (!"tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str97) || !"ec+3".equals(str98))) {
                                                                                                                                    i33 = i34 + 1;
                                                                                                                                    arrayList25 = arrayList30;
                                                                                                                                    arrayList28 = arrayList29;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                arrayList29 = arrayList28;
                                                                                                                                str38 = "audio/eac3";
                                                                                                                            }
                                                                                                                        }
                                                                                                                        str38 = "audio/eac3-joc";
                                                                                                                    } else {
                                                                                                                        arrayList29 = arrayList28;
                                                                                                                        j17 = j28;
                                                                                                                        arrayList30 = arrayList25;
                                                                                                                    }
                                                                                                                    str40 = str85;
                                                                                                                    int i35 = 0;
                                                                                                                    int i36 = 0;
                                                                                                                    while (i35 < arrayList11.size()) {
                                                                                                                        ArrayList arrayList66 = arrayList11;
                                                                                                                        int i37 = i35;
                                                                                                                        f fVar6 = (f) arrayList66.get(i35);
                                                                                                                        s sVar7 = sVar;
                                                                                                                        if (a7.a("urn:mpeg:dash:role:2011", fVar6.a)) {
                                                                                                                            String str99 = fVar6.b;
                                                                                                                            i36 |= (str99 != null && (str99.equals("forced_subtitle") || str99.equals("forced-subtitle"))) ? 2 : 0;
                                                                                                                        }
                                                                                                                        i35 = i37 + 1;
                                                                                                                        arrayList11 = arrayList66;
                                                                                                                        sVar = sVar7;
                                                                                                                    }
                                                                                                                    s sVar8 = sVar;
                                                                                                                    ArrayList arrayList67 = arrayList11;
                                                                                                                    int i38 = 0;
                                                                                                                    int i39 = 0;
                                                                                                                    while (i38 < arrayList67.size()) {
                                                                                                                        f fVar7 = (f) arrayList67.get(i38);
                                                                                                                        int i40 = i38;
                                                                                                                        if (a7.a("urn:mpeg:dash:role:2011", fVar7.a)) {
                                                                                                                            i39 |= m(fVar7.b);
                                                                                                                        }
                                                                                                                        i38 = i40 + 1;
                                                                                                                    }
                                                                                                                    arrayList11 = arrayList67;
                                                                                                                    int i41 = 0;
                                                                                                                    int i42 = 0;
                                                                                                                    while (i41 < arrayList24.size()) {
                                                                                                                        ArrayList arrayList68 = arrayList24;
                                                                                                                        int i43 = i41;
                                                                                                                        f fVar8 = (f) arrayList68.get(i41);
                                                                                                                        int i44 = i42;
                                                                                                                        String str100 = fVar8.a;
                                                                                                                        ArrayList arrayList69 = arrayList26;
                                                                                                                        String str101 = fVar8.b;
                                                                                                                        if (a7.a("urn:mpeg:dash:role:2011", str100)) {
                                                                                                                            i15 = m(str101);
                                                                                                                        } else if (a7.a("urn:tva:metadata:cs:AudioPurposeCS:2007", fVar8.a)) {
                                                                                                                            if (str101 != null) {
                                                                                                                                switch (str101.hashCode()) {
                                                                                                                                    case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                                                                                                                                        if (str101.equals("1")) {
                                                                                                                                            c10 = 0;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        c10 = 65535;
                                                                                                                                        break;
                                                                                                                                    case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                                                                                                                        if (str101.equals("2")) {
                                                                                                                                            c10 = 1;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        c10 = 65535;
                                                                                                                                        break;
                                                                                                                                    case 51:
                                                                                                                                        if (str101.equals("3")) {
                                                                                                                                            c10 = 2;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        c10 = 65535;
                                                                                                                                        break;
                                                                                                                                    case 52:
                                                                                                                                        if (str101.equals("4")) {
                                                                                                                                            c10 = 3;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        c10 = 65535;
                                                                                                                                        break;
                                                                                                                                    case 53:
                                                                                                                                    default:
                                                                                                                                        c10 = 65535;
                                                                                                                                        break;
                                                                                                                                    case 54:
                                                                                                                                        if (str101.equals("6")) {
                                                                                                                                            c10 = 4;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        c10 = 65535;
                                                                                                                                        break;
                                                                                                                                }
                                                                                                                                switch (c10) {
                                                                                                                                    case 0:
                                                                                                                                        i15 = 512;
                                                                                                                                        break;
                                                                                                                                    case 1:
                                                                                                                                        i15 = 2048;
                                                                                                                                        break;
                                                                                                                                    case 2:
                                                                                                                                        i15 = 4;
                                                                                                                                        break;
                                                                                                                                    case 3:
                                                                                                                                        i15 = 8;
                                                                                                                                        break;
                                                                                                                                    case 4:
                                                                                                                                        i15 = 1;
                                                                                                                                        break;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            i15 = 0;
                                                                                                                        } else {
                                                                                                                            i42 = i44;
                                                                                                                            i41 = i43 + 1;
                                                                                                                            arrayList24 = arrayList68;
                                                                                                                            arrayList26 = arrayList69;
                                                                                                                        }
                                                                                                                        i42 = i44 | i15;
                                                                                                                        i41 = i43 + 1;
                                                                                                                        arrayList24 = arrayList68;
                                                                                                                        arrayList26 = arrayList69;
                                                                                                                    }
                                                                                                                    ArrayList arrayList70 = arrayList26;
                                                                                                                    ArrayList arrayList71 = arrayList24;
                                                                                                                    int n10 = i39 | i42 | n(arrayList27) | n(arrayList29);
                                                                                                                    int i45 = 0;
                                                                                                                    while (true) {
                                                                                                                        if (i45 < arrayList27.size()) {
                                                                                                                            f fVar9 = (f) arrayList27.get(i45);
                                                                                                                            arrayList31 = arrayList27;
                                                                                                                            if ((a7.a("http://dashif.org/thumbnail_tile", fVar9.a) || a7.a("http://dashif.org/guidelines/thumbnail_tile", fVar9.a)) && (str41 = fVar9.b) != null) {
                                                                                                                                int i46 = d0.a;
                                                                                                                                String[] split = str41.split("x", -1);
                                                                                                                                if (split.length != 2) {
                                                                                                                                    continue;
                                                                                                                                } else {
                                                                                                                                    try {
                                                                                                                                        pair = Pair.create(Integer.valueOf(Integer.parseInt(split[0])), Integer.valueOf(Integer.parseInt(split[c11])));
                                                                                                                                    } catch (NumberFormatException unused) {
                                                                                                                                        continue;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            i45++;
                                                                                                                            arrayList27 = arrayList31;
                                                                                                                        } else {
                                                                                                                            arrayList31 = arrayList27;
                                                                                                                            pair = null;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    m0 m0Var = new m0();
                                                                                                                    m0Var.a = attributeValue21;
                                                                                                                    m0Var.n = str39;
                                                                                                                    m0Var.o = str38;
                                                                                                                    m0Var.h = str40;
                                                                                                                    m0Var.g = i12;
                                                                                                                    m0Var.d = i36;
                                                                                                                    m0Var.e = n10;
                                                                                                                    String str102 = str31;
                                                                                                                    m0Var.c = str102;
                                                                                                                    m0Var.H = pair != null ? ((Integer) pair.first).intValue() : -1;
                                                                                                                    m0Var.I = pair != null ? ((Integer) pair.second).intValue() : -1;
                                                                                                                    if (h5.o.j(str38)) {
                                                                                                                        m0Var.t = parseInt2;
                                                                                                                        m0Var.u = parseInt3;
                                                                                                                        m0Var.v = j48;
                                                                                                                    } else {
                                                                                                                        int i47 = parseInt2;
                                                                                                                        int i48 = parseInt3;
                                                                                                                        if (h5.o.h(str38)) {
                                                                                                                            m0Var.B = i14;
                                                                                                                            m0Var.C = i13;
                                                                                                                        } else if (h5.o.i(str38)) {
                                                                                                                            if ("application/cea-608".equals(str38)) {
                                                                                                                                for (int i49 = 0; i49 < arrayList71.size(); i49++) {
                                                                                                                                    f fVar10 = (f) arrayList71.get(i49);
                                                                                                                                    String str103 = fVar10.a;
                                                                                                                                    String str104 = fVar10.b;
                                                                                                                                    if ("urn:scte:dash:cc:cea-608:2015".equals(str103) && str104 != null) {
                                                                                                                                        Matcher matcher = c.matcher(str104);
                                                                                                                                        if (matcher.matches()) {
                                                                                                                                            parseInt4 = Integer.parseInt(matcher.group(1));
                                                                                                                                            m0Var.G = parseInt4;
                                                                                                                                        } else {
                                                                                                                                            h5.a.K("MpdParser", "Unable to parse CEA-608 channel number from: ".concat(str104));
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                parseInt4 = -1;
                                                                                                                                m0Var.G = parseInt4;
                                                                                                                            } else {
                                                                                                                                if ("application/cea-708".equals(str38)) {
                                                                                                                                    for (int i50 = 0; i50 < arrayList71.size(); i50++) {
                                                                                                                                        f fVar11 = (f) arrayList71.get(i50);
                                                                                                                                        String str105 = fVar11.a;
                                                                                                                                        String str106 = fVar11.b;
                                                                                                                                        if ("urn:scte:dash:cc:cea-708:2015".equals(str105) && str106 != null) {
                                                                                                                                            Matcher matcher2 = d.matcher(str106);
                                                                                                                                            if (matcher2.matches()) {
                                                                                                                                                parseInt4 = Integer.parseInt(matcher2.group(1));
                                                                                                                                                m0Var.G = parseInt4;
                                                                                                                                            } else {
                                                                                                                                                h5.a.K("MpdParser", "Unable to parse CEA-708 service block number from: ".concat(str106));
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                parseInt4 = -1;
                                                                                                                                m0Var.G = parseInt4;
                                                                                                                            }
                                                                                                                            str6 = str57;
                                                                                                                        } else if ("image".equals(h5.o.f(str38))) {
                                                                                                                            m0Var.t = i47;
                                                                                                                            m0Var.u = i48;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    n0 n0Var2 = new n0(m0Var);
                                                                                                                    d dVar2 = new d(n0Var2, !arrayList23.isEmpty() ? arrayList23 : arrayList22, sVar8 != null ? sVar8 : new r(null, 1L, 0L, 0L, 0L), str37, arrayList30, arrayList70, arrayList31, arrayList29);
                                                                                                                    int g12 = h5.o.g(n0Var2.C);
                                                                                                                    int i51 = i11;
                                                                                                                    if (i51 == -1) {
                                                                                                                        i51 = g12;
                                                                                                                    } else if (g12 != -1) {
                                                                                                                        h5.a.i(i51 == g12);
                                                                                                                    }
                                                                                                                    ArrayList arrayList72 = arrayList21;
                                                                                                                    arrayList72.add(dVar2);
                                                                                                                    arrayList15 = arrayList72;
                                                                                                                    str19 = str102;
                                                                                                                    arrayList17 = arrayList71;
                                                                                                                    i10 = i51;
                                                                                                                    str21 = str61;
                                                                                                                    j46 = j24;
                                                                                                                    j26 = j30;
                                                                                                                    arrayList18 = arrayList20;
                                                                                                                    str20 = str30;
                                                                                                                    str18 = str28;
                                                                                                                    str22 = str29;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        arrayList28 = arrayList59;
                                                                                                        j30 = j54;
                                                                                                        str36 = str75;
                                                                                                        sVar = sVar5;
                                                                                                        i14 = i32;
                                                                                                        str37 = str91;
                                                                                                        if (h5.a.y(xmlPullParser, str36)) {
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                arrayList26 = arrayList57;
                                                                                                arrayList27 = arrayList63;
                                                                                                arrayList28 = arrayList59;
                                                                                                j30 = j54;
                                                                                                str36 = str75;
                                                                                                str37 = str91;
                                                                                            }
                                                                                            i14 = i32;
                                                                                            if (h5.a.y(xmlPullParser, str36)) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                str2 = str45;
                                                                                arrayList13 = arrayList46;
                                                                                str4 = str56;
                                                                                str5 = str59;
                                                                                str29 = str60;
                                                                                arrayList20 = arrayList42;
                                                                                str28 = str62;
                                                                                str30 = str63;
                                                                                arrayList21 = arrayList47;
                                                                                str15 = str25;
                                                                                i12 = parseInt;
                                                                                str66 = str81;
                                                                                str = str78;
                                                                                str67 = str83;
                                                                                arrayList12 = arrayList61;
                                                                                str31 = str90;
                                                                                sVar = sVar5;
                                                                                arrayList26 = arrayList57;
                                                                                str17 = str89;
                                                                                i13 = i31;
                                                                                i14 = i32;
                                                                                str32 = str71;
                                                                                arrayList16 = arrayList48;
                                                                                arrayList22 = arrayList19;
                                                                                str14 = str13;
                                                                                str65 = str27;
                                                                                str37 = str91;
                                                                                arrayList25 = arrayList56;
                                                                                j29 = j49;
                                                                                z10 = z4;
                                                                                arrayList27 = arrayList58;
                                                                                arrayList28 = arrayList59;
                                                                                str33 = str72;
                                                                                str36 = str75;
                                                                                long j59 = i24;
                                                                                arrayList24 = arrayList43;
                                                                                j14 = j44;
                                                                                j27 = j50;
                                                                                j28 = j59;
                                                                                str35 = str77;
                                                                                ArrayList arrayList73 = arrayList34;
                                                                                arrayList23 = arrayList60;
                                                                                str34 = str76;
                                                                                j30 = j40;
                                                                                arrayList2 = arrayList40;
                                                                                arrayList7 = arrayList73;
                                                                                if (h5.a.y(xmlPullParser, str36)) {
                                                                                }
                                                                            }
                                                                        } else {
                                                                            str = str55;
                                                                            String str107 = str69;
                                                                            arrayList12 = arrayList41;
                                                                            str2 = str45;
                                                                            arrayList13 = arrayList46;
                                                                            ArrayList arrayList74 = arrayList43;
                                                                            arrayList14 = arrayList45;
                                                                            str4 = str56;
                                                                            long j60 = j40;
                                                                            j17 = i24;
                                                                            str5 = str59;
                                                                            str14 = str13;
                                                                            str15 = str68;
                                                                            str16 = str60;
                                                                            arrayList2 = arrayList40;
                                                                            ArrayList arrayList75 = arrayList42;
                                                                            String str108 = str62;
                                                                            str17 = str64;
                                                                            f10 = f16;
                                                                            arrayList15 = arrayList47;
                                                                            int i52 = i25;
                                                                            arrayList16 = arrayList48;
                                                                            z10 = z4;
                                                                            arrayList7 = arrayList34;
                                                                            j14 = j44;
                                                                            String str109 = str63;
                                                                            if (h5.a.z(xmlPullParser, str109)) {
                                                                                sVar3 = o(xmlPullParser, (r) sVar3);
                                                                                str19 = str107;
                                                                                str20 = str109;
                                                                                arrayList17 = arrayList74;
                                                                                i10 = i52;
                                                                                str21 = str61;
                                                                                j46 = j24;
                                                                                j26 = j60;
                                                                                arrayList18 = arrayList75;
                                                                                str18 = str108;
                                                                            } else {
                                                                                str18 = str108;
                                                                                if (h5.a.z(xmlPullParser, str18)) {
                                                                                    i10 = i52;
                                                                                    long d12 = d(xmlPullParser, j45);
                                                                                    str19 = str107;
                                                                                    str20 = str109;
                                                                                    arrayList17 = arrayList74;
                                                                                    j26 = j60;
                                                                                    sVar3 = p(xmlPullParser, (o) sVar3, j26, j17, j24, d12, j14);
                                                                                    j14 = j14;
                                                                                    j45 = d12;
                                                                                } else {
                                                                                    str19 = str107;
                                                                                    str20 = str109;
                                                                                    arrayList17 = arrayList74;
                                                                                    i10 = i52;
                                                                                    j25 = j45;
                                                                                    j26 = j60;
                                                                                    if (h5.a.z(xmlPullParser, str14)) {
                                                                                        long d13 = d(xmlPullParser, j25);
                                                                                        sVar3 = q(xmlPullParser, (p) sVar3, arrayList13, j26, j17, j24, d13, j14);
                                                                                        j26 = j26;
                                                                                        j45 = d13;
                                                                                    } else {
                                                                                        if (h5.a.z(xmlPullParser, "InbandEventStream")) {
                                                                                            arrayList18 = arrayList75;
                                                                                            arrayList18.add(h(xmlPullParser, "InbandEventStream"));
                                                                                        } else {
                                                                                            arrayList18 = arrayList75;
                                                                                            if (h5.a.z(xmlPullParser, "Label")) {
                                                                                                str21 = "";
                                                                                                do {
                                                                                                    xmlPullParser.next();
                                                                                                    if (xmlPullParser.getEventType() == 4) {
                                                                                                        str21 = xmlPullParser.getText();
                                                                                                    } else {
                                                                                                        b(xmlPullParser);
                                                                                                    }
                                                                                                } while (!h5.a.y(xmlPullParser, "Label"));
                                                                                                j45 = j25;
                                                                                                j46 = j24;
                                                                                                str22 = str16;
                                                                                            } else if (xmlPullParser.getEventType() == 2) {
                                                                                                b(xmlPullParser);
                                                                                            }
                                                                                        }
                                                                                        j45 = j25;
                                                                                        str21 = str61;
                                                                                        j46 = j24;
                                                                                        str22 = str16;
                                                                                    }
                                                                                }
                                                                                str21 = str61;
                                                                                j46 = j24;
                                                                                arrayList18 = arrayList75;
                                                                            }
                                                                            str22 = str16;
                                                                        }
                                                                        if (h5.a.y(xmlPullParser, str22)) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        str = str55;
                                                        i10 = i25;
                                                        str19 = str69;
                                                        arrayList12 = arrayList41;
                                                        str2 = str45;
                                                        arrayList13 = arrayList46;
                                                        arrayList14 = arrayList45;
                                                        arrayList11 = arrayList44;
                                                        str3 = str46;
                                                        str4 = str56;
                                                        j26 = j40;
                                                        j17 = i24;
                                                        str5 = str59;
                                                        str14 = str13;
                                                        str15 = str68;
                                                        str16 = str60;
                                                        arrayList2 = arrayList40;
                                                        arrayList18 = arrayList42;
                                                        str18 = str62;
                                                        str20 = str63;
                                                        str17 = str64;
                                                        f10 = f16;
                                                        arrayList15 = arrayList47;
                                                        j25 = j45;
                                                        arrayList16 = arrayList48;
                                                        arrayList17 = arrayList43;
                                                        z10 = z4;
                                                        arrayList7 = arrayList34;
                                                        j14 = j44;
                                                        j45 = j25;
                                                        str21 = str61;
                                                        j46 = j24;
                                                        str22 = str16;
                                                        if (h5.a.y(xmlPullParser, str22)) {
                                                        }
                                                    }
                                                }
                                                str = str55;
                                                i10 = i25;
                                                str19 = str69;
                                                arrayList12 = arrayList41;
                                                str2 = str45;
                                                arrayList13 = arrayList46;
                                                arrayList14 = arrayList45;
                                                arrayList11 = arrayList44;
                                                str3 = str46;
                                                str4 = str56;
                                                j26 = j40;
                                                j17 = i24;
                                                str5 = str59;
                                                str14 = str13;
                                                str15 = str68;
                                                str22 = str60;
                                                arrayList2 = arrayList40;
                                                str21 = str61;
                                                arrayList18 = arrayList42;
                                                str18 = str62;
                                                str20 = str63;
                                                str17 = str64;
                                                f10 = f16;
                                                arrayList15 = arrayList47;
                                                j46 = j24;
                                                arrayList16 = arrayList48;
                                                arrayList17 = arrayList43;
                                                z10 = z4;
                                                arrayList7 = arrayList34;
                                            }
                                            j14 = j44;
                                            if (h5.a.y(xmlPullParser, str22)) {
                                            }
                                        }
                                    } else {
                                        str = str55;
                                        j15 = j42;
                                        j12 = j33;
                                        str2 = str45;
                                        z10 = z4;
                                        str3 = str46;
                                        str4 = str56;
                                        j16 = j40;
                                        j17 = i24;
                                        String str110 = str59;
                                        ArrayList arrayList76 = arrayList5;
                                        arrayList2 = arrayList35;
                                        long j61 = i21;
                                        arrayList7 = arrayList34;
                                        if (h5.a.z(xmlPullParser, "EventStream")) {
                                            String str111 = str58;
                                            String attributeValue28 = xmlPullParser.getAttributeValue(null, str111);
                                            String str112 = attributeValue28 == null ? "" : attributeValue28;
                                            String str113 = str4;
                                            String attributeValue29 = xmlPullParser.getAttributeValue(null, str113);
                                            String str114 = attributeValue29 == null ? "" : attributeValue29;
                                            String attributeValue30 = xmlPullParser.getAttributeValue(null, "timescale");
                                            long parseLong2 = attributeValue30 == null ? 1L : Long.parseLong(attributeValue30);
                                            String attributeValue31 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
                                            long parseLong3 = attributeValue31 == null ? 0L : Long.parseLong(attributeValue31);
                                            ArrayList arrayList77 = new ArrayList();
                                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                                            while (true) {
                                                xmlPullParser.next();
                                                if (h5.a.z(xmlPullParser, "Event")) {
                                                    str9 = str;
                                                    String attributeValue32 = xmlPullParser.getAttributeValue(null, str9);
                                                    long parseLong4 = attributeValue32 == null ? 0L : Long.parseLong(attributeValue32);
                                                    j20 = j61;
                                                    str8 = str110;
                                                    String attributeValue33 = xmlPullParser.getAttributeValue(null, str8);
                                                    long parseLong5 = attributeValue33 == null ? -9223372036854775807L : Long.parseLong(attributeValue33);
                                                    String attributeValue34 = xmlPullParser.getAttributeValue(null, "presentationTime");
                                                    long parseLong6 = attributeValue34 == null ? 0L : Long.parseLong(attributeValue34);
                                                    long N = d0.N(parseLong5, 1000L, parseLong2);
                                                    long N2 = d0.N(parseLong6 - parseLong3, 1000000L, parseLong2);
                                                    j21 = parseLong2;
                                                    String attributeValue35 = xmlPullParser.getAttributeValue(null, "messageData");
                                                    if (attributeValue35 == null) {
                                                        attributeValue35 = null;
                                                    }
                                                    byteArrayOutputStream.reset();
                                                    XmlSerializer newSerializer = Xml.newSerializer();
                                                    arrayList8 = arrayList76;
                                                    newSerializer.setOutput(byteArrayOutputStream, r8.d.c.name());
                                                    xmlPullParser.nextToken();
                                                    while (!h5.a.y(xmlPullParser, "Event")) {
                                                        switch (xmlPullParser.getEventType()) {
                                                            case 0:
                                                                str11 = str111;
                                                                str12 = str113;
                                                                j23 = parseLong3;
                                                                newSerializer.startDocument(null, Boolean.FALSE);
                                                                break;
                                                            case 1:
                                                                str11 = str111;
                                                                str12 = str113;
                                                                j23 = parseLong3;
                                                                newSerializer.endDocument();
                                                                break;
                                                            case 2:
                                                                str11 = str111;
                                                                newSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                                                                int i53 = 0;
                                                                while (i53 < xmlPullParser.getAttributeCount()) {
                                                                    newSerializer.attribute(xmlPullParser.getAttributeNamespace(i53), xmlPullParser.getAttributeName(i53), xmlPullParser.getAttributeValue(i53));
                                                                    i53++;
                                                                    parseLong3 = parseLong3;
                                                                    str113 = str113;
                                                                }
                                                                str12 = str113;
                                                                j23 = parseLong3;
                                                                break;
                                                            case 3:
                                                                str11 = str111;
                                                                newSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                                                                str12 = str113;
                                                                j23 = parseLong3;
                                                                break;
                                                            case 4:
                                                                newSerializer.text(xmlPullParser.getText());
                                                                str11 = str111;
                                                                str12 = str113;
                                                                j23 = parseLong3;
                                                                break;
                                                            case 5:
                                                                newSerializer.cdsect(xmlPullParser.getText());
                                                                str11 = str111;
                                                                str12 = str113;
                                                                j23 = parseLong3;
                                                                break;
                                                            case 6:
                                                                newSerializer.entityRef(xmlPullParser.getText());
                                                                str11 = str111;
                                                                str12 = str113;
                                                                j23 = parseLong3;
                                                                break;
                                                            case 7:
                                                                newSerializer.ignorableWhitespace(xmlPullParser.getText());
                                                                str11 = str111;
                                                                str12 = str113;
                                                                j23 = parseLong3;
                                                                break;
                                                            case 8:
                                                                newSerializer.processingInstruction(xmlPullParser.getText());
                                                                str11 = str111;
                                                                str12 = str113;
                                                                j23 = parseLong3;
                                                                break;
                                                            case 9:
                                                                newSerializer.comment(xmlPullParser.getText());
                                                                str11 = str111;
                                                                str12 = str113;
                                                                j23 = parseLong3;
                                                                break;
                                                            case 10:
                                                                newSerializer.docdecl(xmlPullParser.getText());
                                                                str11 = str111;
                                                                str12 = str113;
                                                                j23 = parseLong3;
                                                                break;
                                                            default:
                                                                str11 = str111;
                                                                str12 = str113;
                                                                j23 = parseLong3;
                                                                break;
                                                        }
                                                        xmlPullParser.nextToken();
                                                        str111 = str11;
                                                        parseLong3 = j23;
                                                        str113 = str12;
                                                    }
                                                    str58 = str111;
                                                    str4 = str113;
                                                    j22 = parseLong3;
                                                    newSerializer.flush();
                                                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                    Long valueOf = Long.valueOf(N2);
                                                    if (attributeValue35 != null) {
                                                        byteArray = attributeValue35.getBytes(r8.d.c);
                                                    }
                                                    str7 = str112;
                                                    str10 = str114;
                                                    arrayList77.add(Pair.create(valueOf, new g4.a(str112, str114, N, parseLong4, byteArray)));
                                                } else {
                                                    arrayList8 = arrayList76;
                                                    str58 = str111;
                                                    str4 = str113;
                                                    j20 = j61;
                                                    str7 = str112;
                                                    j21 = parseLong2;
                                                    str8 = str110;
                                                    str9 = str;
                                                    j22 = parseLong3;
                                                    str10 = str114;
                                                    b(xmlPullParser);
                                                }
                                                if (h5.a.y(xmlPullParser, "EventStream")) {
                                                    long[] jArr = new long[arrayList77.size()];
                                                    g4.a[] aVarArr = new g4.a[arrayList77.size()];
                                                    for (int i54 = 0; i54 < arrayList77.size(); i54++) {
                                                        Pair pair2 = (Pair) arrayList77.get(i54);
                                                        jArr[i54] = ((Long) pair2.first).longValue();
                                                        aVarArr[i54] = (g4.a) pair2.second;
                                                    }
                                                    arrayList38.add(new g(str7, str10, jArr, aVarArr));
                                                    str5 = str8;
                                                    str = str9;
                                                    arrayList5 = arrayList8;
                                                    j14 = j20;
                                                } else {
                                                    str112 = str7;
                                                    str114 = str10;
                                                    str110 = str8;
                                                    str = str9;
                                                    arrayList76 = arrayList8;
                                                    str111 = str58;
                                                    parseLong3 = j22;
                                                    j61 = j20;
                                                    str113 = str4;
                                                    parseLong2 = j21;
                                                }
                                            }
                                        } else {
                                            ArrayList arrayList78 = arrayList38;
                                            if (h5.a.z(xmlPullParser, "SegmentBase")) {
                                                sVar2 = o(xmlPullParser, null);
                                                arrayList38 = arrayList78;
                                                str5 = str110;
                                                arrayList5 = arrayList76;
                                                str6 = str57;
                                                j14 = j61;
                                                j18 = j16;
                                                j19 = j17;
                                                j13 = -9223372036854775807L;
                                            } else if (h5.a.z(xmlPullParser, "SegmentList")) {
                                                j13 = -9223372036854775807L;
                                                long d14 = d(xmlPullParser, -9223372036854775807L);
                                                arrayList38 = arrayList78;
                                                arrayList5 = arrayList76;
                                                j18 = j16;
                                                sVar2 = p(xmlPullParser, null, j18, j17, j15, d14, j61);
                                                j19 = j17;
                                                j41 = d14;
                                                str5 = str110;
                                                str6 = str57;
                                                j14 = j61;
                                            } else {
                                                arrayList38 = arrayList78;
                                                arrayList5 = arrayList76;
                                                j18 = j16;
                                                j19 = j17;
                                                j13 = -9223372036854775807L;
                                                if (h5.a.z(xmlPullParser, "SegmentTemplate")) {
                                                    long d15 = d(xmlPullParser, -9223372036854775807L);
                                                    s8.t tVar2 = v.b;
                                                    str5 = str110;
                                                    j14 = j61;
                                                    sVar2 = q(xmlPullParser, null, i0.e, j18, j19, j15, d15, j14);
                                                    j18 = j18;
                                                    j41 = d15;
                                                } else {
                                                    str5 = str110;
                                                    j14 = j61;
                                                    if (h5.a.z(xmlPullParser, "AssetIdentifier")) {
                                                        h(xmlPullParser, "AssetIdentifier");
                                                    } else {
                                                        b(xmlPullParser);
                                                    }
                                                }
                                                str6 = str57;
                                            }
                                        }
                                    }
                                    j18 = j16;
                                    j19 = j17;
                                    j13 = -9223372036854775807L;
                                    str6 = str57;
                                }
                                if (h5.a.y(xmlPullParser, str6)) {
                                    Pair create = Pair.create(new h(attributeValue11, i23, arrayList5, arrayList38), Long.valueOf(j19));
                                    h hVar2 = (h) create.first;
                                    if (hVar2.b != j13) {
                                        long longValue = ((Long) create.second).longValue();
                                        long j62 = longValue == j13 ? j13 : longValue + hVar2.b;
                                        arrayList3 = arrayList7;
                                        arrayList3.add(hVar2);
                                        j12 = j62;
                                    } else {
                                        if (!equals) {
                                            throw r1.b("Unable to determine start of period " + arrayList7.size(), null);
                                        }
                                        arrayList3 = arrayList7;
                                        z12 = true;
                                    }
                                } else {
                                    str57 = str6;
                                    i24 = j19;
                                    i21 = j14;
                                    arrayList34 = arrayList7;
                                    arrayList35 = arrayList2;
                                    z4 = z10;
                                    arrayList39 = arrayList4;
                                    arrayList37 = arrayList5;
                                    arrayList36 = arrayList6;
                                    j33 = j12;
                                    str46 = str3;
                                    str45 = str2;
                                    str56 = str4;
                                    str59 = str5;
                                    j40 = j18;
                                    j42 = j15;
                                    str55 = str;
                                }
                            }
                        }
                        j32 = j11;
                        if (!h5.a.y(xmlPullParser, "MPD")) {
                            if (i18 == j13) {
                                if (j12 != j13) {
                                    i18 = j12;
                                } else if (!equals) {
                                    throw r1.b("Unable to determine duration of static manifest.", null);
                                }
                            }
                            if (arrayList3.isEmpty()) {
                                throw r1.b("No periods found.", null);
                            }
                            return new c(J, i18, i19, equals, i20, j14, i22, J2, iVar, hVar, tVar, uri2, arrayList3);
                        }
                        arrayList34 = arrayList3;
                        i21 = j14;
                        j31 = j13;
                        arrayList35 = arrayList2;
                        k10 = arrayList;
                        z4 = z10;
                        j33 = j12;
                        str44 = null;
                    }
                    z10 = z4;
                    arrayList3 = arrayList34;
                }
                j13 = j10;
            }
            j14 = i21;
            if (!h5.a.y(xmlPullParser, "MPD")) {
            }
        }
    }

    public static j l(XmlPullParser xmlPullParser, String str, String str2) {
        long j10;
        long j11;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j10 = Long.parseLong(split[0]);
            if (split.length == 2) {
                j11 = (Long.parseLong(split[1]) - j10) + 1;
                return new j(j10, j11, attributeValue);
            }
        } else {
            j10 = 0;
        }
        j11 = -1;
        return new j(j10, j11, attributeValue);
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
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (a7.a("http://dashif.org/guidelines/trickmode", ((f) arrayList.get(i11)).a)) {
                i10 = 16384;
            }
        }
        return i10;
    }

    public static r o(XmlPullParser xmlPullParser, r rVar) {
        long j10 = rVar != null ? rVar.b : 1L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j10 = Long.parseLong(attributeValue);
        }
        long j11 = j10;
        long j12 = rVar != null ? rVar.c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j12 = Long.parseLong(attributeValue2);
        }
        long j13 = j12;
        long j14 = rVar != null ? rVar.d : 0L;
        long j15 = rVar != null ? rVar.e : 0L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue3 != null) {
            String[] split = attributeValue3.split("-");
            j14 = Long.parseLong(split[0]);
            j15 = (Long.parseLong(split[1]) - j14) + 1;
        }
        long j16 = j15;
        long j17 = j14;
        j jVar = rVar != null ? rVar.a : null;
        while (true) {
            xmlPullParser.next();
            if (h5.a.z(xmlPullParser, "Initialization")) {
                jVar = l(xmlPullParser, "sourceURL", "range");
            } else {
                b(xmlPullParser);
            }
            j jVar2 = jVar;
            if (h5.a.y(xmlPullParser, "SegmentBase")) {
                return new r(jVar2, j11, j13, j17, j16);
            }
            jVar = jVar2;
        }
    }

    public static o p(XmlPullParser xmlPullParser, o oVar, long j10, long j11, long j12, long j13, long j14) {
        long j15 = oVar != null ? oVar.b : 1L;
        List list = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j15 = Long.parseLong(attributeValue);
        }
        long j16 = j15;
        long j17 = oVar != null ? oVar.c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j17 = Long.parseLong(attributeValue2);
        }
        long j18 = j17;
        long j19 = oVar != null ? oVar.e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j19 = Long.parseLong(attributeValue3);
        }
        long j20 = j19;
        long j21 = oVar != null ? oVar.d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j21 = Long.parseLong(attributeValue4);
        }
        long j22 = j21;
        long j23 = j13 == -9223372036854775807L ? j12 : j13;
        long j24 = j23 == Long.MAX_VALUE ? -9223372036854775807L : j23;
        j jVar = null;
        List list2 = null;
        do {
            xmlPullParser.next();
            if (h5.a.z(xmlPullParser, "Initialization")) {
                jVar = l(xmlPullParser, "sourceURL", "range");
            } else if (h5.a.z(xmlPullParser, "SegmentTimeline")) {
                list2 = r(xmlPullParser, j16, j11);
            } else if (h5.a.z(xmlPullParser, "SegmentURL")) {
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(l(xmlPullParser, "media", "mediaRange"));
            } else {
                b(xmlPullParser);
            }
        } while (!h5.a.y(xmlPullParser, "SegmentList"));
        if (oVar != null) {
            if (jVar == null) {
                jVar = oVar.a;
            }
            if (list2 == null) {
                list2 = oVar.f;
            }
            if (list == null) {
                list = oVar.j;
            }
        }
        return new o(jVar, j16, j18, j22, j20, list2, j24, list, d0.G(j14), d0.G(j10));
    }

    public static p q(XmlPullParser xmlPullParser, p pVar, List list, long j10, long j11, long j12, long j13, long j14) {
        long j15;
        long j16 = pVar != null ? pVar.b : 1L;
        j jVar = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j16 = Long.parseLong(attributeValue);
        }
        long j17 = j16;
        long j18 = pVar != null ? pVar.c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j18 = Long.parseLong(attributeValue2);
        }
        long j19 = j18;
        long j20 = pVar != null ? pVar.e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j20 = Long.parseLong(attributeValue3);
        }
        long j21 = j20;
        long j22 = pVar != null ? pVar.d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j22 = Long.parseLong(attributeValue4);
        }
        long j23 = j22;
        int i10 = 0;
        while (true) {
            if (i10 >= list.size()) {
                j15 = -1;
                break;
            }
            f fVar = (f) list.get(i10);
            if (a7.a("http://dashif.org/guidelines/last-segment-number", fVar.a)) {
                j15 = Long.parseLong(fVar.b);
                break;
            }
            i10++;
        }
        long j24 = j15;
        long j25 = j13 == -9223372036854775807L ? j12 : j13;
        long j26 = j25 == Long.MAX_VALUE ? -9223372036854775807L : j25;
        x5.k s6 = s(xmlPullParser, "media", pVar != null ? pVar.k : null);
        x5.k s9 = s(xmlPullParser, "initialization", pVar != null ? pVar.j : null);
        List list2 = null;
        do {
            xmlPullParser.next();
            if (h5.a.z(xmlPullParser, "Initialization")) {
                jVar = l(xmlPullParser, "sourceURL", "range");
            } else if (h5.a.z(xmlPullParser, "SegmentTimeline")) {
                list2 = r(xmlPullParser, j17, j11);
            } else {
                b(xmlPullParser);
            }
        } while (!h5.a.y(xmlPullParser, "SegmentTemplate"));
        if (pVar != null) {
            if (jVar == null) {
                jVar = pVar.a;
            }
            if (list2 == null) {
                list2 = pVar.f;
            }
        }
        return new p(jVar, j17, j19, j23, j24, j21, list2, j26, s9, s6, d0.G(j14), d0.G(j10));
    }

    public static ArrayList r(XmlPullParser xmlPullParser, long j10, long j11) {
        long j12;
        ArrayList arrayList = new ArrayList();
        long j13 = 0;
        long j14 = -9223372036854775807L;
        boolean z4 = false;
        int i10 = 0;
        do {
            xmlPullParser.next();
            if (h5.a.z(xmlPullParser, "S")) {
                String attributeValue = xmlPullParser.getAttributeValue(null, "t");
                long parseLong = attributeValue == null ? -9223372036854775807L : Long.parseLong(attributeValue);
                if (z4) {
                    int i11 = i10;
                    j12 = parseLong;
                    j13 = a(arrayList, j13, j14, i11, j12);
                } else {
                    j12 = parseLong;
                }
                if (j12 != -9223372036854775807L) {
                    j13 = j12;
                }
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "d");
                j14 = attributeValue2 == null ? -9223372036854775807L : Long.parseLong(attributeValue2);
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "r");
                i10 = attributeValue3 == null ? 0 : Integer.parseInt(attributeValue3);
                z4 = true;
            } else {
                b(xmlPullParser);
            }
        } while (!h5.a.y(xmlPullParser, "SegmentTimeline"));
        if (!z4) {
            return arrayList;
        }
        a(arrayList, j13, j14, i10, d0.N(j11, j10, 1000L));
        return arrayList;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x00c3. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.Serializable, java.lang.String[]] */
    public static x5.k s(XmlPullParser xmlPullParser, String str, x5.k kVar) {
        String str2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return kVar;
        }
        ?? r14 = new String[5];
        ?? r02 = new int[4];
        ?? r12 = new String[4];
        r14[0] = "";
        int i10 = 0;
        int i11 = 0;
        while (i10 < attributeValue.length()) {
            int indexOf = attributeValue.indexOf("$", i10);
            if (indexOf == -1) {
                r14[i11] = r14[i11] + attributeValue.substring(i10);
                i10 = attributeValue.length();
            } else if (indexOf != i10) {
                r14[i11] = r14[i11] + attributeValue.substring(i10, indexOf);
                i10 = indexOf;
            } else if (attributeValue.startsWith("$$", i10)) {
                r14[i11] = android.support.v4.media.a.r(new StringBuilder(), r14[i11], "$");
                i10 += 2;
            } else {
                int i12 = i10 + 1;
                int indexOf2 = attributeValue.indexOf("$", i12);
                String substring = attributeValue.substring(i12, indexOf2);
                if (substring.equals("RepresentationID")) {
                    r02[i11] = 1;
                } else {
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
                    substring.getClass();
                    switch (substring) {
                        case "Number":
                            r02[i11] = 2;
                            break;
                        case "Time":
                            r02[i11] = 4;
                            break;
                        case "Bandwidth":
                            r02[i11] = 3;
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid template: ".concat(attributeValue));
                    }
                    r12[i11] = str2;
                }
                i11++;
                r14[i11] = "";
                i10 = indexOf2 + 1;
            }
        }
        return new x5.k((Serializable) r14, (Serializable) r02, (Serializable) r12, i11);
    }

    @Override // g5.o0
    public final Object w(Uri uri, g5.o oVar) {
        try {
            XmlPullParser newPullParser = this.a.newPullParser();
            newPullParser.setInput(oVar, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return k(newPullParser, uri);
            }
            throw r1.b("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e6) {
            throw r1.b(null, e6);
        }
    }
}
