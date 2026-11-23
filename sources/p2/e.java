package p2;

import a8.ja;
import a8.la;
import a8.xa;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import e2.e0;
import e2.s0;
import e2.t;
import e2.t0;
import e2.u;
import e2.x;
import h2.l0;
import h9.g0;
import h9.i0;
import h9.t1;
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
import org.telegram.messenger.ls;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.md0;
import org.webrtc.MediaStreamTrack;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class e extends DefaultHandler implements b3.r {
    public static final Pattern b = Pattern.compile("(\\d+)(?:/(\\d+))?");
    public static final Pattern c = Pattern.compile("CC([1-4])=.*");
    public static final Pattern d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    public static final int[] e = {2, 1, 2, 2, 2, 2, 1, 2, 2, 1, 1, 1, 1, 2, 1, 1, 2, 2, 2};
    public static final int[] f = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};
    public final XmlPullParserFactory a;

    public e() {
        try {
            this.a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    public static long a(ArrayList arrayList, long j3, long j10, int i7, long j11) {
        int i10;
        if (i7 >= 0) {
            i10 = i7 + 1;
        } else {
            String str = l0.a;
            i10 = (int) ((((j11 - j3) + j10) - 1) / j10);
        }
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(new q(j3, j10));
            j3 += j10;
        }
        return j3;
    }

    public static void b(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() == 2) {
            int i7 = 1;
            while (i7 != 0) {
                xmlPullParser.next();
                if (xmlPullParser.getEventType() == 2) {
                    i7++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i7--;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x008f, code lost:
    
        if (r13 == 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0093, code lost:
    
        r10 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cc, code lost:
    
        if (r13.equals("fa01") == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x019d, code lost:
    
        if (r13 == 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01b0, code lost:
    
        if (r13 < 33) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int c(XmlPullParser xmlPullParser, String str) {
        char c10;
        int parseInt;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = null;
        }
        attributeValue.getClass();
        int i7 = 5;
        char c11 = 4;
        int i10 = 0;
        int i11 = -1;
        switch (attributeValue.hashCode()) {
            case -2128649360:
                if (attributeValue.equals("urn:dts:dash:audio_channel_configuration:2012")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -2060825028:
                if (attributeValue.equals("tag:dolby.com,2015:dash:audio_channel_configuration:2015")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -1352850286:
                if (attributeValue.equals("urn:mpeg:dash:23003:3:audio_channel_configuration:2011")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -1138141449:
                if (attributeValue.equals("tag:dolby.com,2014:dash:audio_channel_configuration:2011")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -986633423:
                if (attributeValue.equals("urn:mpeg:mpegB:cicp:ChannelConfiguration")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case -79006963:
                if (attributeValue.equals("tag:dts.com,2014:dash:audio_channel_configuration:2012")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 312179081:
                if (attributeValue.equals("tag:dts.com,2018:uhd:audio_channel_configuration")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 2036691300:
                if (attributeValue.equals("urn:dolby:dash:audio_channel_configuration:2011")) {
                    c10 = 7;
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
                            if (i10 >= iArr.length) {
                                break;
                            } else {
                                parseInt += ((parseInt2 >> i10) & 1) * iArr[i10];
                                i10++;
                            }
                        }
                    } else {
                        String[] d02 = l0.d0(str);
                        if (d02.length != 0) {
                            List A = new xa(new ob.c(new g9.e('.', 0), 24)).A(ja.c(d02[0].trim()));
                            if (A.size() == 4 && ((String) A.get(0)).equals("ac-4")) {
                                String str2 = (String) A.get(3);
                                str2.getClass();
                                if (!str2.equals("03")) {
                                    if (str2.equals("04")) {
                                        i11 = 21;
                                        break;
                                    }
                                } else {
                                    i11 = 18;
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
                    i11 = Integer.parseInt(attributeValue4);
                    break;
                }
                break;
            case 3:
            case 7:
                String attributeValue5 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue5 != null) {
                    String c12 = ja.c(attributeValue5);
                    c12.getClass();
                    switch (c12.hashCode()) {
                        case 1596796:
                            if (c12.equals("4000")) {
                                c11 = 0;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 2937391:
                            if (c12.equals("a000")) {
                                c11 = 1;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 3094034:
                            if (c12.equals("f800")) {
                                c11 = 2;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 3094035:
                            if (c12.equals("f801")) {
                                c11 = 3;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 3133436:
                            break;
                        default:
                            c11 = 65535;
                            break;
                    }
                    switch (c11) {
                        case 0:
                            i7 = 1;
                            break;
                        case 1:
                            i7 = 2;
                            break;
                        case 3:
                            i7 = 6;
                            break;
                        case 4:
                            i7 = 8;
                            break;
                    }
                    i11 = i7;
                    break;
                }
                i7 = -1;
                i11 = i7;
            case 4:
                String attributeValue6 = xmlPullParser.getAttributeValue(null, "value");
                int parseInt3 = attributeValue6 == null ? -1 : Integer.parseInt(attributeValue6);
                if (parseInt3 >= 0) {
                    int[] iArr2 = f;
                    if (parseInt3 < iArr2.length) {
                        i11 = iArr2[parseInt3];
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
        } while (!h2.a.h(xmlPullParser, "AudioChannelConfiguration"));
        return i11;
    }

    public static long d(XmlPullParser xmlPullParser, long j3) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j3;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public static ArrayList e(XmlPullParser xmlPullParser, ArrayList arrayList, boolean z10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : z10 ? 1 : TLObject.FLAG_31;
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
        } while (!h2.a.h(xmlPullParser, "BaseURL"));
        if (str != null && h2.e.c(str)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = str;
            }
            return h9.o.r(new b(parseInt, parseInt2, str, attributeValue3));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            b bVar = (b) arrayList.get(i7);
            String f10 = h2.e.f(bVar.a, str);
            String str2 = attributeValue3 == null ? f10 : attributeValue3;
            if (z10) {
                parseInt = bVar.c;
                parseInt2 = bVar.d;
                str2 = bVar.b;
            }
            arrayList2.add(new b(parseInt, parseInt2, f10, str2));
        }
        return arrayList2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016f  */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.util.UUID] */
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
        ?? r72;
        String str2;
        String str3;
        ?? r82;
        char c10;
        String str4;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue != null) {
            String c11 = ja.c(attributeValue);
            c11.getClass();
            switch (c11.hashCode()) {
                case -1980789791:
                    if (c11.equals("urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 489446379:
                    if (c11.equals("urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 755418770:
                    if (c11.equals("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1812765994:
                    if (c11.equals("urn:mpeg:dash:mp4protection:2011")) {
                        c10 = 3;
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
                    r72 = e2.l.d;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r82 = str2;
                    break;
                case 1:
                    r72 = e2.l.f;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r82 = str2;
                    break;
                case 2:
                    r72 = e2.l.e;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r82 = str2;
                    break;
                case 3:
                    str = xmlPullParser.getAttributeValue(null, "value");
                    int attributeCount = xmlPullParser.getAttributeCount();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= attributeCount) {
                            str4 = null;
                        } else {
                            String attributeName = xmlPullParser.getAttributeName(i7);
                            int indexOf = attributeName.indexOf(58);
                            if (indexOf != -1) {
                                attributeName = attributeName.substring(indexOf + 1);
                            }
                            if (attributeName.equals("default_KID")) {
                                str4 = xmlPullParser.getAttributeValue(i7);
                            } else {
                                i7++;
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(str4) && !"00000000-0000-0000-0000-000000000000".equals(str4)) {
                        String[] split = str4.split("\\s+");
                        UUID[] uuidArr = new UUID[split.length];
                        for (int i10 = 0; i10 < split.length; i10++) {
                            uuidArr[i10] = UUID.fromString(split[i10]);
                        }
                        r72 = e2.l.c;
                        str3 = null;
                        r82 = z3.p.a(r72, uuidArr, null);
                        break;
                    } else {
                        h2.a.l("MpdParser", "Ignoring <ContentProtection> with schemeIdUri=\"urn:mpeg:dash:mp4protection:2011\" (ClearKey) due to missing required default_KID attribute.");
                        r72 = null;
                        str2 = r72;
                        str3 = str2;
                        r82 = str2;
                        break;
                    }
                    break;
            }
            do {
                xmlPullParser.next();
                if ((!h2.a.i(xmlPullParser, "clearkey:Laurl") || h2.a.i(xmlPullParser, "dashif:Laurl")) && xmlPullParser.next() == 4) {
                    str3 = xmlPullParser.getText();
                    r82 = r82;
                } else if (h2.a.i(xmlPullParser, "ms:laurl")) {
                    str3 = xmlPullParser.getAttributeValue(null, "licenseUrl");
                    r82 = r82;
                } else {
                    if (r82 == 0 && xmlPullParser.getEventType() == 2) {
                        String name = xmlPullParser.getName();
                        int indexOf2 = name.indexOf(58);
                        if (indexOf2 != -1) {
                            name = name.substring(indexOf2 + 1);
                        }
                        if (name.equals("pssh") && xmlPullParser.next() == 4) {
                            byte[] decode = Base64.decode(xmlPullParser.getText(), 0);
                            m6.n i11 = z3.p.i(decode);
                            UUID uuid = i11 == null ? null : (UUID) i11.b;
                            if (uuid == null) {
                                h2.a.l("MpdParser", "Skipping malformed cenc:pssh data");
                                r72 = uuid;
                                r82 = 0;
                            } else {
                                UUID uuid2 = uuid;
                                r82 = decode;
                                r72 = uuid2;
                            }
                        }
                    }
                    if (r82 == 0) {
                        ?? r10 = e2.l.f;
                        if (r10.equals(r72) && h2.a.i(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                            r82 = z3.p.a(r10, null, Base64.decode(xmlPullParser.getText(), 0));
                        }
                    }
                    b(xmlPullParser);
                    r82 = r82;
                }
            } while (!h2.a.h(xmlPullParser, "ContentProtection"));
            return Pair.create(str, r72 != null ? new e2.q(r72, str3, "video/mp4", r82) : null);
        }
        str = null;
        r72 = null;
        str2 = r72;
        str3 = str2;
        r82 = str2;
        do {
            xmlPullParser.next();
            if (h2.a.i(xmlPullParser, "clearkey:Laurl")) {
            }
            str3 = xmlPullParser.getText();
            r82 = r82;
        } while (!h2.a.h(xmlPullParser, "ContentProtection"));
        return Pair.create(str, r72 != null ? new e2.q(r72, str3, "video/mp4", r82) : null);
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
        } while (!h2.a.h(xmlPullParser, str));
        return new f(attributeValue, attributeValue2, str2);
    }

    public static long i(XmlPullParser xmlPullParser, String str, long j3) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j3;
        }
        Matcher matcher = l0.e.matcher(attributeValue);
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
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0ffe A[LOOP:5: B:183:0x0411->B:192:0x0ffe, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0e7a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0ce5 A[LOOP:11: B:353:0x06a6->B:362:0x0ce5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:363:0x090c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:382:0x09d4  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x09e6  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0a09  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0a3e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x13d5 A[LOOP:1: B:35:0x00cd->B:43:0x13d5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x13a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:556:0x09fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c k(XmlPullParser xmlPullParser, Uri uri) {
        int i7;
        boolean z10;
        int i10;
        int i11;
        long j3;
        ArrayList arrayList;
        boolean z11;
        long j10;
        long j11;
        ArrayList arrayList2;
        long j12;
        long j13;
        ArrayList arrayList3;
        long j14;
        ArrayList arrayList4;
        String str;
        String str2;
        ArrayList arrayList5;
        ArrayList arrayList6;
        long j15;
        ArrayList arrayList7;
        String str3;
        String str4;
        long j16;
        long j17;
        String str5;
        String str6;
        ByteArrayOutputStream byteArrayOutputStream;
        String str7;
        long j18;
        String str8;
        String str9;
        long j19;
        String str10;
        long j20;
        ByteArrayOutputStream byteArrayOutputStream2;
        ArrayList arrayList8;
        long j21;
        ArrayList arrayList9;
        ArrayList arrayList10;
        ArrayList arrayList11;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        ArrayList arrayList12;
        ArrayList arrayList13;
        String str18;
        String str19;
        String str20;
        ArrayList arrayList14;
        long j22;
        String str21;
        String str22;
        String str23;
        String str24;
        int i12;
        ArrayList arrayList15;
        ArrayList arrayList16;
        long j23;
        ArrayList arrayList17;
        String str25;
        int i13;
        String str26;
        String str27;
        ArrayList arrayList18;
        int parseInt;
        String str28;
        String str29;
        String str30;
        int parseInt2;
        String str31;
        float f10;
        int parseInt3;
        float f11;
        String str32;
        String str33;
        String str34;
        String str35;
        String str36;
        String str37;
        ArrayList arrayList19;
        int i14;
        String str38;
        int i15;
        int i16;
        ArrayList arrayList20;
        ArrayList arrayList21;
        String str39;
        long j24;
        ArrayList arrayList22;
        long j25;
        String str40;
        ArrayList arrayList23;
        long j26;
        String str41;
        ArrayList arrayList24;
        ArrayList arrayList25;
        String str42;
        s sVar;
        int i17;
        String str43;
        String str44;
        String str45;
        String d2;
        ArrayList arrayList26;
        String str46;
        String str47;
        e2.m mVar;
        int i18;
        long j27;
        ArrayList arrayList27;
        Pair pair;
        int parseInt4;
        String str48;
        int i19;
        int i20;
        String str49;
        long j28;
        String str50;
        m kVar;
        String str51;
        ArrayList arrayList28;
        long j29;
        int i21 = 0;
        String[] strArr = new String[0];
        String str52 = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "profiles");
        if (attributeValue != null) {
            strArr = attributeValue.split(",");
        }
        int length = strArr.length;
        int i22 = 0;
        while (true) {
            i7 = 1;
            if (i22 >= length) {
                z10 = false;
                break;
            }
            if (strArr[i22].startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                z10 = true;
                break;
            }
            i22++;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "availabilityStartTime");
        long j30 = -9223372036854775807L;
        long V = attributeValue2 == null ? -9223372036854775807L : l0.V(attributeValue2);
        long i23 = i(xmlPullParser, "mediaPresentationDuration", -9223372036854775807L);
        long i24 = i(xmlPullParser, "minBufferTime", -9223372036854775807L);
        boolean equals = "dynamic".equals(xmlPullParser.getAttributeValue(null, TeXSymbolParser.TYPE_ATTR));
        long i25 = equals ? i(xmlPullParser, "minimumUpdatePeriod", -9223372036854775807L) : -9223372036854775807L;
        long i26 = equals ? i(xmlPullParser, "timeShiftBufferDepth", -9223372036854775807L) : -9223372036854775807L;
        long i27 = equals ? i(xmlPullParser, "suggestedPresentationDelay", -9223372036854775807L) : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "publishTime");
        long V2 = attributeValue3 == null ? -9223372036854775807L : l0.V(attributeValue3);
        long j31 = equals ? 0L : -9223372036854775807L;
        ArrayList r10 = h9.o.r(new b(z10 ? 1 : TLObject.FLAG_31, 1, uri.toString(), uri.toString()));
        ArrayList arrayList29 = new ArrayList();
        ArrayList arrayList30 = new ArrayList();
        long j32 = equals ? -9223372036854775807L : 0L;
        int i28 = 0;
        int i29 = 0;
        i iVar = null;
        f5.a aVar = null;
        Uri uri2 = null;
        e0 e0Var = null;
        while (true) {
            xmlPullParser.next();
            String str53 = "BaseURL";
            if (h2.a.i(xmlPullParser, "BaseURL")) {
                if (i28 == 0) {
                    j31 = d(xmlPullParser, j31);
                    i28 = i7;
                }
                arrayList30.addAll(e(xmlPullParser, r10, z10));
                arrayList = r10;
                arrayList2 = arrayList30;
                j13 = j32;
                z11 = z10;
                i10 = i21;
                i11 = i7;
                arrayList3 = arrayList29;
                j11 = j30;
            } else {
                i10 = i21;
                i11 = i7;
                String str54 = "lang";
                if (h2.a.i(xmlPullParser, "ProgramInformation")) {
                    String attributeValue4 = xmlPullParser.getAttributeValue(str52, "moreInformationURL");
                    String str55 = attributeValue4 == null ? str52 : attributeValue4;
                    String attributeValue5 = xmlPullParser.getAttributeValue(str52, "lang");
                    String str56 = attributeValue5 == null ? str52 : attributeValue5;
                    String str57 = str52;
                    String str58 = str57;
                    String str59 = str58;
                    while (true) {
                        xmlPullParser.next();
                        j3 = j30;
                        if (h2.a.i(xmlPullParser, "Title")) {
                            str57 = xmlPullParser.nextText();
                        } else if (h2.a.i(xmlPullParser, "Source")) {
                            str58 = xmlPullParser.nextText();
                        } else if (h2.a.i(xmlPullParser, "Copyright")) {
                            str59 = xmlPullParser.nextText();
                        } else {
                            b(xmlPullParser);
                        }
                        String str60 = str57;
                        String str61 = str58;
                        String str62 = str59;
                        if (h2.a.h(xmlPullParser, "ProgramInformation")) {
                            i iVar2 = new i(str60, str61, str62, str55, str56);
                            arrayList = r10;
                            arrayList2 = arrayList30;
                            j13 = j32;
                            z11 = z10;
                            arrayList3 = arrayList29;
                            iVar = iVar2;
                        } else {
                            str57 = str60;
                            str58 = str61;
                            str59 = str62;
                            j30 = j3;
                        }
                    }
                } else {
                    j3 = j30;
                    if (h2.a.i(xmlPullParser, "UTCTiming")) {
                        arrayList = r10;
                        arrayList2 = arrayList30;
                        j13 = j32;
                        aVar = new f5.a(3, xmlPullParser.getAttributeValue(str52, "schemeIdUri"), xmlPullParser.getAttributeValue(str52, "value"));
                    } else if (h2.a.i(xmlPullParser, "Location")) {
                        uri2 = h2.e.g(uri.toString(), xmlPullParser.nextText());
                        arrayList = r10;
                        arrayList2 = arrayList30;
                        j13 = j32;
                    } else {
                        if (h2.a.i(xmlPullParser, "ServiceDescription")) {
                            float f12 = -3.4028235E38f;
                            float f13 = -3.4028235E38f;
                            long j33 = j3;
                            long j34 = j33;
                            long j35 = j34;
                            while (true) {
                                xmlPullParser.next();
                                if (h2.a.i(xmlPullParser, "Latency")) {
                                    arrayList = r10;
                                    String attributeValue6 = xmlPullParser.getAttributeValue(null, "target");
                                    j33 = attributeValue6 == null ? j3 : Long.parseLong(attributeValue6);
                                    String attributeValue7 = xmlPullParser.getAttributeValue(null, "min");
                                    j34 = attributeValue7 == null ? j3 : Long.parseLong(attributeValue7);
                                    String attributeValue8 = xmlPullParser.getAttributeValue(null, "max");
                                    j35 = attributeValue8 == null ? j3 : Long.parseLong(attributeValue8);
                                } else {
                                    arrayList = r10;
                                    if (h2.a.i(xmlPullParser, "PlaybackRate")) {
                                        String attributeValue9 = xmlPullParser.getAttributeValue(null, "min");
                                        f12 = attributeValue9 == null ? -3.4028235E38f : Float.parseFloat(attributeValue9);
                                        String attributeValue10 = xmlPullParser.getAttributeValue(null, "max");
                                        f13 = attributeValue10 == null ? -3.4028235E38f : Float.parseFloat(attributeValue10);
                                    }
                                }
                                long j36 = j33;
                                long j37 = j31;
                                long j38 = j34;
                                long j39 = i26;
                                long j40 = j35;
                                if (h2.a.h(xmlPullParser, "ServiceDescription")) {
                                    e0 e0Var2 = new e0();
                                    e0Var2.a = j36;
                                    e0Var2.b = j38;
                                    e0Var2.c = j40;
                                    e0Var2.d = f12;
                                    e0Var2.e = f13;
                                    e0Var = e0Var2;
                                    z11 = z10;
                                    j31 = j37;
                                    j10 = j39;
                                    j11 = j3;
                                    arrayList2 = arrayList30;
                                    j13 = j32;
                                    arrayList3 = arrayList29;
                                } else {
                                    j35 = j40;
                                    i26 = j39;
                                    r10 = arrayList;
                                    j34 = j38;
                                    j31 = j37;
                                    j33 = j36;
                                }
                            }
                        } else {
                            arrayList = r10;
                            long j41 = j31;
                            long j42 = i26;
                            if (h2.a.i(xmlPullParser, "Period") && i29 == 0) {
                                ArrayList arrayList31 = !arrayList30.isEmpty() ? arrayList30 : arrayList;
                                String str63 = "id";
                                String attributeValue11 = xmlPullParser.getAttributeValue(null, "id");
                                long i30 = i(xmlPullParser, "start", j32);
                                String str64 = "duration";
                                String str65 = "value";
                                long j43 = V != j3 ? V + i30 : j3;
                                long i31 = i(xmlPullParser, "duration", j3);
                                ArrayList arrayList32 = new ArrayList();
                                ArrayList arrayList33 = new ArrayList();
                                ArrayList arrayList34 = new ArrayList();
                                long j44 = j3;
                                String str66 = "schemeIdUri";
                                String str67 = "Period";
                                int i32 = i10;
                                long j45 = j41;
                                s sVar2 = null;
                                while (true) {
                                    xmlPullParser.next();
                                    if (h2.a.i(xmlPullParser, str53)) {
                                        if (i32 == 0) {
                                            j45 = d(xmlPullParser, j45);
                                            i32 = i11;
                                        }
                                        arrayList34.addAll(e(xmlPullParser, arrayList31, z10));
                                        arrayList4 = arrayList31;
                                        str5 = str63;
                                        str = str53;
                                        str4 = str64;
                                        str3 = str65;
                                        z11 = z10;
                                        j14 = j45;
                                        str2 = str54;
                                        j10 = j42;
                                        j16 = j43;
                                        arrayList7 = arrayList32;
                                        arrayList5 = arrayList33;
                                        str6 = str67;
                                        j11 = -9223372036854775807L;
                                        arrayList6 = arrayList34;
                                        arrayList2 = arrayList30;
                                        j17 = i31;
                                        j12 = j41;
                                        j15 = j32;
                                    } else {
                                        j14 = j45;
                                        String str68 = "SegmentTemplate";
                                        if (h2.a.i(xmlPullParser, "AdaptationSet")) {
                                            if (arrayList34.isEmpty()) {
                                                arrayList8 = arrayList31;
                                                arrayList4 = arrayList8;
                                            } else {
                                                arrayList4 = arrayList31;
                                                arrayList8 = arrayList34;
                                            }
                                            String attributeValue12 = xmlPullParser.getAttributeValue(null, str63);
                                            long parseLong = attributeValue12 == null ? -1L : Long.parseLong(attributeValue12);
                                            int g10 = g(xmlPullParser);
                                            String str69 = "AdaptationSet";
                                            String attributeValue13 = xmlPullParser.getAttributeValue(null, "mimeType");
                                            ArrayList arrayList35 = arrayList34;
                                            ArrayList arrayList36 = arrayList30;
                                            String attributeValue14 = xmlPullParser.getAttributeValue(null, "codecs");
                                            long j46 = j32;
                                            String attributeValue15 = xmlPullParser.getAttributeValue(null, "scte214:supplementalCodecs");
                                            String attributeValue16 = xmlPullParser.getAttributeValue(null, "scte214:supplementalProfiles");
                                            String str70 = str64;
                                            String attributeValue17 = xmlPullParser.getAttributeValue(null, "width");
                                            int parseInt5 = attributeValue17 == null ? -1 : Integer.parseInt(attributeValue17);
                                            String str71 = str65;
                                            String attributeValue18 = xmlPullParser.getAttributeValue(null, "height");
                                            int parseInt6 = attributeValue18 == null ? -1 : Integer.parseInt(attributeValue18);
                                            float j47 = j(xmlPullParser, -1.0f);
                                            String str72 = "SegmentList";
                                            String str73 = "SegmentBase";
                                            String attributeValue19 = xmlPullParser.getAttributeValue(null, "audioSamplingRate");
                                            int parseInt7 = attributeValue19 == null ? -1 : Integer.parseInt(attributeValue19);
                                            String attributeValue20 = xmlPullParser.getAttributeValue(null, str54);
                                            String str74 = "audioSamplingRate";
                                            String attributeValue21 = xmlPullParser.getAttributeValue(null, "label");
                                            ArrayList arrayList37 = new ArrayList();
                                            String str75 = attributeValue21;
                                            ArrayList arrayList38 = new ArrayList();
                                            ArrayList arrayList39 = arrayList37;
                                            ArrayList arrayList40 = new ArrayList();
                                            ArrayList arrayList41 = new ArrayList();
                                            float f14 = j47;
                                            ArrayList arrayList42 = new ArrayList();
                                            String str76 = "height";
                                            ArrayList arrayList43 = new ArrayList();
                                            String str77 = "width";
                                            ArrayList arrayList44 = new ArrayList();
                                            String str78 = "scte214:supplementalProfiles";
                                            ArrayList arrayList45 = new ArrayList();
                                            ArrayList arrayList46 = new ArrayList();
                                            String str79 = str63;
                                            String str80 = "mimeType";
                                            String str81 = "codecs";
                                            int i33 = i10;
                                            s sVar3 = sVar2;
                                            long j48 = j44;
                                            long j49 = j14;
                                            String str82 = attributeValue20;
                                            int i34 = -1;
                                            String str83 = "scte214:supplementalCodecs";
                                            int i35 = g10;
                                            String str84 = null;
                                            while (true) {
                                                xmlPullParser.next();
                                                if (h2.a.i(xmlPullParser, str53)) {
                                                    if (i33 == 0) {
                                                        j49 = d(xmlPullParser, j49);
                                                        i33 = i11;
                                                    }
                                                    j21 = j49;
                                                    arrayList46.addAll(e(xmlPullParser, arrayList8, z10));
                                                } else {
                                                    j21 = j49;
                                                    if (h2.a.i(xmlPullParser, "ContentProtection")) {
                                                        Pair f15 = f(xmlPullParser);
                                                        Object obj = f15.first;
                                                        if (obj != null) {
                                                            str84 = (String) obj;
                                                        }
                                                        Object obj2 = f15.second;
                                                        if (obj2 != null) {
                                                            arrayList38.add((e2.q) obj2);
                                                        }
                                                    } else if (h2.a.i(xmlPullParser, "ContentComponent")) {
                                                        String attributeValue22 = xmlPullParser.getAttributeValue(null, str54);
                                                        if (str82 == null) {
                                                            str82 = attributeValue22;
                                                        } else if (attributeValue22 != null) {
                                                            la.p(str82.equals(attributeValue22));
                                                        }
                                                        int g11 = g(xmlPullParser);
                                                        if (i35 == -1) {
                                                            i35 = g11;
                                                        } else if (g11 != -1) {
                                                            la.p(i35 == g11 ? i11 : i10);
                                                        }
                                                        arrayList11 = arrayList8;
                                                        str24 = str82;
                                                        str = str53;
                                                        z11 = z10;
                                                        arrayList9 = arrayList38;
                                                        arrayList10 = arrayList41;
                                                        arrayList7 = arrayList32;
                                                        arrayList5 = arrayList33;
                                                        str13 = str70;
                                                        str14 = str71;
                                                        str22 = str72;
                                                        str23 = str73;
                                                        arrayList17 = arrayList39;
                                                        arrayList16 = arrayList40;
                                                        str15 = str77;
                                                        str16 = str78;
                                                        str17 = str79;
                                                        arrayList12 = arrayList46;
                                                        str18 = str83;
                                                        str19 = str81;
                                                        str20 = str80;
                                                        j22 = j43;
                                                        str21 = attributeValue14;
                                                        arrayList15 = arrayList42;
                                                        j10 = j42;
                                                        j17 = i31;
                                                        arrayList6 = arrayList35;
                                                        arrayList2 = arrayList36;
                                                        i13 = i35;
                                                        str25 = str54;
                                                        j12 = j41;
                                                        str11 = str68;
                                                        j15 = j46;
                                                        arrayList14 = arrayList43;
                                                        arrayList13 = arrayList44;
                                                        str26 = str69;
                                                        if (h2.a.h(xmlPullParser, str26)) {
                                                            ArrayList arrayList47 = new ArrayList(arrayList45.size());
                                                            int i36 = i10;
                                                            while (i36 < arrayList45.size()) {
                                                                ArrayList arrayList48 = arrayList45;
                                                                d dVar = (d) arrayList48.get(i36);
                                                                t a10 = dVar.a.a();
                                                                if (str75 == null || !arrayList17.isEmpty()) {
                                                                    str49 = str75;
                                                                    a10.c = i0.q(arrayList17);
                                                                } else {
                                                                    str49 = str75;
                                                                    a10.b = str49;
                                                                }
                                                                String str85 = dVar.d;
                                                                if (str85 == null) {
                                                                    str85 = str84;
                                                                }
                                                                ArrayList arrayList49 = dVar.e;
                                                                int i37 = i36;
                                                                arrayList49.addAll(arrayList9);
                                                                ArrayList arrayList50 = arrayList17;
                                                                if (arrayList49.isEmpty()) {
                                                                    j28 = j17;
                                                                    str50 = str25;
                                                                    arrayList45 = arrayList48;
                                                                } else {
                                                                    int i38 = i10;
                                                                    while (true) {
                                                                        if (i38 < arrayList49.size()) {
                                                                            e2.q qVar = (e2.q) arrayList49.get(i38);
                                                                            j28 = j17;
                                                                            if (!e2.l.d.equals(qVar.b) || (str51 = qVar.c) == null) {
                                                                                i38++;
                                                                                j17 = j28;
                                                                            } else {
                                                                                arrayList49.remove(i38);
                                                                            }
                                                                        } else {
                                                                            j28 = j17;
                                                                            str51 = null;
                                                                        }
                                                                    }
                                                                    if (str51 != null) {
                                                                        int i39 = i10;
                                                                        while (i39 < arrayList49.size()) {
                                                                            e2.q qVar2 = (e2.q) arrayList49.get(i39);
                                                                            String str86 = str25;
                                                                            if (e2.l.c.equals(qVar2.b) && qVar2.c == null) {
                                                                                arrayList28 = arrayList48;
                                                                                arrayList49.set(i39, new e2.q(e2.l.d, str51, qVar2.d, qVar2.e));
                                                                            } else {
                                                                                arrayList28 = arrayList48;
                                                                            }
                                                                            i39++;
                                                                            arrayList48 = arrayList28;
                                                                            str25 = str86;
                                                                        }
                                                                    }
                                                                    str50 = str25;
                                                                    arrayList45 = arrayList48;
                                                                    for (int size = arrayList49.size() - 1; size >= 0; size--) {
                                                                        e2.q qVar3 = (e2.q) arrayList49.get(size);
                                                                        if (qVar3.e == null) {
                                                                            int i40 = i10;
                                                                            while (true) {
                                                                                if (i40 < arrayList49.size()) {
                                                                                    e2.q qVar4 = (e2.q) arrayList49.get(i40);
                                                                                    if (qVar4.e != null && qVar3.e == null && qVar4.a(qVar3.b)) {
                                                                                        arrayList49.remove(size);
                                                                                    } else {
                                                                                        i40++;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    a10.v = new e2.r(str85, arrayList49);
                                                                }
                                                                ArrayList arrayList51 = dVar.f;
                                                                arrayList51.addAll(arrayList16);
                                                                u uVar = new u(a10);
                                                                i0 i0Var = dVar.b;
                                                                s sVar4 = dVar.c;
                                                                ArrayList arrayList52 = dVar.g;
                                                                ArrayList arrayList53 = dVar.h;
                                                                if (sVar4 instanceof r) {
                                                                    kVar = new l(uVar, i0Var, (r) sVar4, arrayList51, arrayList52, arrayList53);
                                                                } else {
                                                                    if (!(sVar4 instanceof n)) {
                                                                        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
                                                                    }
                                                                    kVar = new k(uVar, i0Var, (n) sVar4, arrayList51, arrayList52, arrayList53);
                                                                }
                                                                arrayList47.add(kVar);
                                                                i36 = i37 + 1;
                                                                str75 = str49;
                                                                arrayList17 = arrayList50;
                                                                str25 = str50;
                                                                j17 = j28;
                                                            }
                                                            str2 = str25;
                                                            i11 = 1;
                                                            arrayList7.add(new a(parseLong, i13, arrayList47, arrayList10, arrayList14, arrayList13));
                                                            j16 = j22;
                                                            str3 = str14;
                                                            str4 = str13;
                                                            str5 = str17;
                                                            j11 = -9223372036854775807L;
                                                        } else {
                                                            i11 = 1;
                                                            str69 = str26;
                                                            arrayList39 = arrayList17;
                                                            arrayList40 = arrayList16;
                                                            str73 = str23;
                                                            arrayList36 = arrayList2;
                                                            arrayList44 = arrayList13;
                                                            arrayList43 = arrayList14;
                                                            arrayList46 = arrayList12;
                                                            j49 = j21;
                                                            arrayList41 = arrayList10;
                                                            arrayList8 = arrayList11;
                                                            str53 = str;
                                                            arrayList32 = arrayList7;
                                                            arrayList33 = arrayList5;
                                                            str71 = str14;
                                                            str70 = str13;
                                                            str72 = str22;
                                                            str68 = str11;
                                                            j46 = j15;
                                                            j41 = j12;
                                                            arrayList38 = arrayList9;
                                                            i31 = j17;
                                                            str54 = str25;
                                                            attributeValue14 = str21;
                                                            i35 = i13;
                                                            str82 = str24;
                                                            arrayList35 = arrayList6;
                                                            j42 = j10;
                                                            arrayList42 = arrayList15;
                                                            z10 = z11;
                                                            j43 = j22;
                                                            str79 = str17;
                                                            str80 = str20;
                                                            str81 = str19;
                                                            str83 = str18;
                                                            str78 = str16;
                                                            str77 = str15;
                                                        }
                                                    } else {
                                                        if (h2.a.i(xmlPullParser, "Role")) {
                                                            arrayList42.add(h(xmlPullParser, "Role"));
                                                        } else {
                                                            String str87 = "AudioChannelConfiguration";
                                                            if (h2.a.i(xmlPullParser, "AudioChannelConfiguration")) {
                                                                i34 = c(xmlPullParser, attributeValue14);
                                                            } else {
                                                                String str88 = "ContentProtection";
                                                                if (h2.a.i(xmlPullParser, "Accessibility")) {
                                                                    arrayList41.add(h(xmlPullParser, "Accessibility"));
                                                                } else if (h2.a.i(xmlPullParser, "EssentialProperty")) {
                                                                    arrayList43.add(h(xmlPullParser, "EssentialProperty"));
                                                                } else {
                                                                    arrayList9 = arrayList38;
                                                                    if (h2.a.i(xmlPullParser, "SupplementalProperty")) {
                                                                        arrayList44.add(h(xmlPullParser, "SupplementalProperty"));
                                                                        arrayList11 = arrayList8;
                                                                        str24 = str82;
                                                                        i12 = i35;
                                                                        str = str53;
                                                                        z11 = z10;
                                                                        arrayList10 = arrayList41;
                                                                        str25 = str54;
                                                                        arrayList7 = arrayList32;
                                                                        arrayList5 = arrayList33;
                                                                        str11 = str68;
                                                                        str12 = str69;
                                                                        str13 = str70;
                                                                        str14 = str71;
                                                                        str22 = str72;
                                                                        str23 = str73;
                                                                        arrayList17 = arrayList39;
                                                                        arrayList16 = arrayList40;
                                                                        str15 = str77;
                                                                        str16 = str78;
                                                                        str17 = str79;
                                                                        j23 = j48;
                                                                        arrayList12 = arrayList46;
                                                                        arrayList13 = arrayList44;
                                                                        str18 = str83;
                                                                        str19 = str81;
                                                                        str20 = str80;
                                                                        j22 = j43;
                                                                        str21 = attributeValue14;
                                                                        arrayList15 = arrayList42;
                                                                        j10 = j42;
                                                                        j17 = i31;
                                                                        arrayList6 = arrayList35;
                                                                        arrayList2 = arrayList36;
                                                                        j12 = j41;
                                                                        j15 = j46;
                                                                        arrayList14 = arrayList43;
                                                                        j48 = j23;
                                                                        i13 = i12;
                                                                        str26 = str12;
                                                                        if (h2.a.h(xmlPullParser, str26)) {
                                                                        }
                                                                    } else {
                                                                        String str89 = str54;
                                                                        arrayList10 = arrayList41;
                                                                        if (h2.a.i(xmlPullParser, "Representation")) {
                                                                            arrayList11 = arrayList8;
                                                                            if (arrayList46.isEmpty()) {
                                                                                str27 = "Representation";
                                                                                arrayList18 = arrayList11;
                                                                            } else {
                                                                                str27 = "Representation";
                                                                                arrayList18 = arrayList46;
                                                                            }
                                                                            String str90 = "SupplementalProperty";
                                                                            String str91 = str79;
                                                                            String str92 = "EssentialProperty";
                                                                            String attributeValue23 = xmlPullParser.getAttributeValue(null, str91);
                                                                            String str93 = str91;
                                                                            String attributeValue24 = xmlPullParser.getAttributeValue(null, "bandwidth");
                                                                            if (attributeValue24 == null) {
                                                                                str28 = str80;
                                                                                parseInt = -1;
                                                                            } else {
                                                                                String str94 = str80;
                                                                                parseInt = Integer.parseInt(attributeValue24);
                                                                                str28 = str94;
                                                                            }
                                                                            String attributeValue25 = xmlPullParser.getAttributeValue(null, str28);
                                                                            String str95 = str81;
                                                                            str20 = str28;
                                                                            String str96 = attributeValue25 == null ? attributeValue13 : attributeValue25;
                                                                            String attributeValue26 = xmlPullParser.getAttributeValue(null, str95);
                                                                            String str97 = str83;
                                                                            str19 = str95;
                                                                            String str98 = attributeValue26 == null ? attributeValue14 : attributeValue26;
                                                                            String attributeValue27 = xmlPullParser.getAttributeValue(null, str97);
                                                                            String str99 = str78;
                                                                            str18 = str97;
                                                                            String str100 = attributeValue27 == null ? attributeValue15 : attributeValue27;
                                                                            String attributeValue28 = xmlPullParser.getAttributeValue(null, str99);
                                                                            String str101 = str77;
                                                                            str16 = str99;
                                                                            String str102 = attributeValue28 == null ? attributeValue16 : attributeValue28;
                                                                            String attributeValue29 = xmlPullParser.getAttributeValue(null, str101);
                                                                            if (attributeValue29 == null) {
                                                                                String str103 = str76;
                                                                                str29 = str101;
                                                                                str30 = str103;
                                                                                parseInt2 = parseInt5;
                                                                            } else {
                                                                                String str104 = str76;
                                                                                str29 = str101;
                                                                                str30 = str104;
                                                                                parseInt2 = Integer.parseInt(attributeValue29);
                                                                            }
                                                                            String attributeValue30 = xmlPullParser.getAttributeValue(null, str30);
                                                                            if (attributeValue30 == null) {
                                                                                float f16 = f14;
                                                                                str31 = str30;
                                                                                f10 = f16;
                                                                                parseInt3 = parseInt6;
                                                                            } else {
                                                                                float f17 = f14;
                                                                                str31 = str30;
                                                                                f10 = f17;
                                                                                parseInt3 = Integer.parseInt(attributeValue30);
                                                                            }
                                                                            String str105 = "InbandEventStream";
                                                                            float j50 = j(xmlPullParser, f10);
                                                                            String str106 = str74;
                                                                            String attributeValue31 = xmlPullParser.getAttributeValue(null, str106);
                                                                            int parseInt8 = attributeValue31 == null ? parseInt7 : Integer.parseInt(attributeValue31);
                                                                            str74 = str106;
                                                                            ArrayList arrayList54 = new ArrayList();
                                                                            ArrayList arrayList55 = new ArrayList();
                                                                            ArrayList arrayList56 = new ArrayList(arrayList43);
                                                                            ArrayList arrayList57 = new ArrayList(arrayList44);
                                                                            ArrayList arrayList58 = new ArrayList();
                                                                            ArrayList arrayList59 = arrayList43;
                                                                            int i41 = parseInt8;
                                                                            String str107 = attributeValue14;
                                                                            int i42 = i35;
                                                                            int i43 = i10;
                                                                            s sVar5 = sVar3;
                                                                            long j51 = j48;
                                                                            int i44 = i34;
                                                                            long j52 = j21;
                                                                            String str108 = null;
                                                                            while (true) {
                                                                                xmlPullParser.next();
                                                                                if (h2.a.i(xmlPullParser, str53)) {
                                                                                    if (i43 == 0) {
                                                                                        j52 = d(xmlPullParser, j52);
                                                                                        i43 = i11;
                                                                                    }
                                                                                    f11 = f10;
                                                                                    arrayList58.addAll(e(xmlPullParser, arrayList18, z10));
                                                                                } else {
                                                                                    f11 = f10;
                                                                                    if (h2.a.i(xmlPullParser, str87)) {
                                                                                        i44 = c(xmlPullParser, str98);
                                                                                    } else {
                                                                                        String str109 = str73;
                                                                                        if (h2.a.i(xmlPullParser, str109)) {
                                                                                            str32 = str87;
                                                                                            str34 = str109;
                                                                                            str35 = str82;
                                                                                            str = str53;
                                                                                            z11 = z10;
                                                                                            str36 = str98;
                                                                                            arrayList7 = arrayList32;
                                                                                            arrayList5 = arrayList33;
                                                                                            str37 = str69;
                                                                                            str13 = str70;
                                                                                            str14 = str71;
                                                                                            str33 = str72;
                                                                                            str15 = str29;
                                                                                            arrayList19 = arrayList45;
                                                                                            i14 = parseInt;
                                                                                            str38 = str88;
                                                                                            str42 = str27;
                                                                                            str17 = str93;
                                                                                            str40 = str105;
                                                                                            i15 = i42;
                                                                                            sVar = o(xmlPullParser, (r) sVar5);
                                                                                            arrayList25 = arrayList57;
                                                                                            i16 = i41;
                                                                                            arrayList12 = arrayList46;
                                                                                            arrayList21 = arrayList58;
                                                                                            arrayList22 = arrayList18;
                                                                                            str11 = str68;
                                                                                            str76 = str31;
                                                                                            str39 = str92;
                                                                                            str43 = str108;
                                                                                            f14 = f11;
                                                                                            j25 = j52;
                                                                                            arrayList13 = arrayList44;
                                                                                            j24 = i31;
                                                                                            j22 = j43;
                                                                                            str21 = str107;
                                                                                            arrayList23 = arrayList54;
                                                                                            arrayList20 = arrayList42;
                                                                                            j12 = j41;
                                                                                            j10 = j42;
                                                                                            arrayList6 = arrayList35;
                                                                                            arrayList2 = arrayList36;
                                                                                            j15 = j46;
                                                                                            arrayList14 = arrayList59;
                                                                                            j26 = j51;
                                                                                            arrayList24 = arrayList56;
                                                                                            i17 = i44;
                                                                                            if (h2.a.h(xmlPullParser, str42)) {
                                                                                                if (s0.i(str96)) {
                                                                                                    if (str36 != null) {
                                                                                                        String[] d02 = l0.d0(str36);
                                                                                                        int length2 = d02.length;
                                                                                                        for (int i45 = i10; i45 < length2; i45++) {
                                                                                                            d2 = s0.d(d02[i45]);
                                                                                                            if (d2 != null && s0.i(d2)) {
                                                                                                                str44 = d2;
                                                                                                                str45 = str96;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    d2 = null;
                                                                                                    str44 = d2;
                                                                                                    str45 = str96;
                                                                                                } else if (s0.m(str96)) {
                                                                                                    if (str36 != null) {
                                                                                                        String[] d03 = l0.d0(str36);
                                                                                                        int length3 = d03.length;
                                                                                                        for (int i46 = i10; i46 < length3; i46++) {
                                                                                                            d2 = s0.d(d03[i46]);
                                                                                                            if (d2 != null && s0.m(d2)) {
                                                                                                                str44 = d2;
                                                                                                                str45 = str96;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    d2 = null;
                                                                                                    str44 = d2;
                                                                                                    str45 = str96;
                                                                                                } else if (s0.l(str96) || s0.k(str96)) {
                                                                                                    str44 = str96;
                                                                                                    str45 = str44;
                                                                                                } else {
                                                                                                    str45 = str96;
                                                                                                    if ("application/mp4".equals(str45)) {
                                                                                                        str44 = s0.d(str36);
                                                                                                        if ("text/vtt".equals(str44)) {
                                                                                                            str44 = "application/x-mp4-vtt";
                                                                                                        }
                                                                                                    } else {
                                                                                                        str44 = null;
                                                                                                    }
                                                                                                }
                                                                                                if ("audio/eac3".equals(str44)) {
                                                                                                    int i47 = i10;
                                                                                                    while (i47 < arrayList25.size()) {
                                                                                                        f fVar = (f) arrayList25.get(i47);
                                                                                                        int i48 = i47;
                                                                                                        String str110 = fVar.a;
                                                                                                        String str111 = fVar.b;
                                                                                                        arrayList26 = arrayList25;
                                                                                                        if (("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str110) && "JOC".equals(str111)) || ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str110) && "ec+3".equals(str111))) {
                                                                                                            str44 = "audio/eac3-joc";
                                                                                                            if ("audio/eac3-joc".equals(str44)) {
                                                                                                                str47 = "ec+3";
                                                                                                                str46 = str100;
                                                                                                                if (s0.j(str47, str46)) {
                                                                                                                    mVar = null;
                                                                                                                } else {
                                                                                                                    e2.m x10 = l0.x(str47, str46, str102);
                                                                                                                    String str112 = str46 != null ? str46 : str47;
                                                                                                                    mVar = x10;
                                                                                                                    str44 = "video/dolby-vision";
                                                                                                                    str47 = str112;
                                                                                                                }
                                                                                                                i18 = i10;
                                                                                                                int i49 = i18;
                                                                                                                while (true) {
                                                                                                                    j27 = j24;
                                                                                                                    if (i18 >= arrayList20.size()) {
                                                                                                                        ArrayList arrayList60 = arrayList20;
                                                                                                                        f fVar2 = (f) arrayList60.get(i18);
                                                                                                                        String str113 = str45;
                                                                                                                        if (ja.a("urn:mpeg:dash:role:2011", fVar2.a)) {
                                                                                                                            String str114 = fVar2.b;
                                                                                                                            i49 |= (str114 != null && (str114.equals("forced_subtitle") || str114.equals("forced-subtitle"))) ? 2 : i10;
                                                                                                                        }
                                                                                                                        i18++;
                                                                                                                        str45 = str113;
                                                                                                                        arrayList20 = arrayList60;
                                                                                                                        j24 = j27;
                                                                                                                    } else {
                                                                                                                        ArrayList arrayList61 = arrayList20;
                                                                                                                        String str115 = str45;
                                                                                                                        int i50 = i10;
                                                                                                                        int i51 = i50;
                                                                                                                        while (i50 < arrayList61.size()) {
                                                                                                                            f fVar3 = (f) arrayList61.get(i50);
                                                                                                                            ArrayList arrayList62 = arrayList61;
                                                                                                                            if (ja.a("urn:mpeg:dash:role:2011", fVar3.a)) {
                                                                                                                                i51 |= m(fVar3.b);
                                                                                                                            }
                                                                                                                            i50++;
                                                                                                                            arrayList61 = arrayList62;
                                                                                                                        }
                                                                                                                        ArrayList arrayList63 = arrayList61;
                                                                                                                        int i52 = i10;
                                                                                                                        int i53 = i52;
                                                                                                                        while (i52 < arrayList10.size()) {
                                                                                                                            ArrayList arrayList64 = arrayList10;
                                                                                                                            int i54 = i52;
                                                                                                                            f fVar4 = (f) arrayList64.get(i52);
                                                                                                                            int i55 = i53;
                                                                                                                            String str116 = fVar4.a;
                                                                                                                            int i56 = i51;
                                                                                                                            String str117 = fVar4.b;
                                                                                                                            if (ja.a("urn:mpeg:dash:role:2011", str116)) {
                                                                                                                                i20 = m(str117);
                                                                                                                            } else if (ja.a("urn:tva:metadata:cs:AudioPurposeCS:2007", fVar4.a)) {
                                                                                                                                if (str117 != null) {
                                                                                                                                    switch (str117.hashCode()) {
                                                                                                                                        case 49:
                                                                                                                                            if (str117.equals("1")) {
                                                                                                                                                i19 = i10;
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                            i19 = -1;
                                                                                                                                            break;
                                                                                                                                        case 50:
                                                                                                                                            if (str117.equals("2")) {
                                                                                                                                                i19 = i11;
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                            i19 = -1;
                                                                                                                                            break;
                                                                                                                                        case ls.o0 /* 51 */:
                                                                                                                                            if (str117.equals("3")) {
                                                                                                                                                i19 = 2;
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                            i19 = -1;
                                                                                                                                            break;
                                                                                                                                        case ls.p0 /* 52 */:
                                                                                                                                            if (str117.equals("4")) {
                                                                                                                                                i19 = 3;
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                            i19 = -1;
                                                                                                                                            break;
                                                                                                                                        case ls.q0 /* 53 */:
                                                                                                                                        default:
                                                                                                                                            i19 = -1;
                                                                                                                                            break;
                                                                                                                                        case ls.r0 /* 54 */:
                                                                                                                                            if (str117.equals("6")) {
                                                                                                                                                i19 = 4;
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                            i19 = -1;
                                                                                                                                            break;
                                                                                                                                    }
                                                                                                                                    switch (i19) {
                                                                                                                                        case 0:
                                                                                                                                            i20 = 512;
                                                                                                                                            break;
                                                                                                                                        case 1:
                                                                                                                                            i20 = 2048;
                                                                                                                                            break;
                                                                                                                                        case 2:
                                                                                                                                            i20 = 4;
                                                                                                                                            break;
                                                                                                                                        case 3:
                                                                                                                                            i20 = 8;
                                                                                                                                            break;
                                                                                                                                        case 4:
                                                                                                                                            i20 = i11;
                                                                                                                                            break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                i20 = i10;
                                                                                                                            } else {
                                                                                                                                i53 = i55;
                                                                                                                                i52 = i54 + 1;
                                                                                                                                arrayList10 = arrayList64;
                                                                                                                                i51 = i56;
                                                                                                                            }
                                                                                                                            i53 = i55 | i20;
                                                                                                                            i52 = i54 + 1;
                                                                                                                            arrayList10 = arrayList64;
                                                                                                                            i51 = i56;
                                                                                                                        }
                                                                                                                        ArrayList arrayList65 = arrayList10;
                                                                                                                        int n10 = i51 | i53 | n(arrayList24) | n(arrayList26);
                                                                                                                        int i57 = i10;
                                                                                                                        while (true) {
                                                                                                                            if (i57 < arrayList24.size()) {
                                                                                                                                f fVar5 = (f) arrayList24.get(i57);
                                                                                                                                arrayList27 = arrayList24;
                                                                                                                                if ((ja.a("http://dashif.org/thumbnail_tile", fVar5.a) || ja.a("http://dashif.org/guidelines/thumbnail_tile", fVar5.a)) && (str48 = fVar5.b) != null) {
                                                                                                                                    String str118 = l0.a;
                                                                                                                                    String[] split = str48.split("x", -1);
                                                                                                                                    if (split.length != 2) {
                                                                                                                                        continue;
                                                                                                                                    } else {
                                                                                                                                        try {
                                                                                                                                            pair = Pair.create(Integer.valueOf(Integer.parseInt(split[i10])), Integer.valueOf(Integer.parseInt(split[i11])));
                                                                                                                                        } catch (NumberFormatException unused) {
                                                                                                                                            continue;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                i57++;
                                                                                                                                arrayList24 = arrayList27;
                                                                                                                            } else {
                                                                                                                                arrayList27 = arrayList24;
                                                                                                                                pair = null;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        t tVar = new t();
                                                                                                                        tVar.a = attributeValue23;
                                                                                                                        tVar.q = s0.n(str115);
                                                                                                                        tVar.r = s0.n(str44);
                                                                                                                        tVar.j = str47;
                                                                                                                        tVar.i = i14;
                                                                                                                        tVar.e = i49;
                                                                                                                        tVar.f = n10;
                                                                                                                        tVar.H = mVar;
                                                                                                                        String str119 = str35;
                                                                                                                        tVar.d = str119;
                                                                                                                        tVar.Q = pair != null ? ((Integer) pair.first).intValue() : -1;
                                                                                                                        tVar.R = pair != null ? ((Integer) pair.second).intValue() : -1;
                                                                                                                        if (s0.m(str44)) {
                                                                                                                            tVar.y = parseInt2;
                                                                                                                            tVar.z = parseInt3;
                                                                                                                            tVar.C = j50;
                                                                                                                        } else {
                                                                                                                            int i58 = parseInt2;
                                                                                                                            int i59 = parseInt3;
                                                                                                                            if (s0.i(str44)) {
                                                                                                                                tVar.J = i17;
                                                                                                                                tVar.K = i16;
                                                                                                                            } else if (s0.l(str44)) {
                                                                                                                                if ("application/cea-608".equals(str44)) {
                                                                                                                                    int i60 = i10;
                                                                                                                                    while (i60 < arrayList65.size()) {
                                                                                                                                        f fVar6 = (f) arrayList65.get(i60);
                                                                                                                                        String str120 = fVar6.a;
                                                                                                                                        String str121 = fVar6.b;
                                                                                                                                        if ("urn:scte:dash:cc:cea-608:2015".equals(str120) && str121 != null) {
                                                                                                                                            Matcher matcher = c.matcher(str121);
                                                                                                                                            if (matcher.matches()) {
                                                                                                                                                parseInt4 = Integer.parseInt(matcher.group(i11));
                                                                                                                                                tVar.O = parseInt4;
                                                                                                                                            } else {
                                                                                                                                                h2.a.l("MpdParser", "Unable to parse CEA-608 channel number from: ".concat(str121));
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        i60++;
                                                                                                                                        i11 = 1;
                                                                                                                                    }
                                                                                                                                    parseInt4 = -1;
                                                                                                                                    tVar.O = parseInt4;
                                                                                                                                } else {
                                                                                                                                    if ("application/cea-708".equals(str44)) {
                                                                                                                                        for (int i61 = i10; i61 < arrayList65.size(); i61++) {
                                                                                                                                            f fVar7 = (f) arrayList65.get(i61);
                                                                                                                                            String str122 = fVar7.a;
                                                                                                                                            String str123 = fVar7.b;
                                                                                                                                            if ("urn:scte:dash:cc:cea-708:2015".equals(str122) && str123 != null) {
                                                                                                                                                Matcher matcher2 = d.matcher(str123);
                                                                                                                                                if (matcher2.matches()) {
                                                                                                                                                    parseInt4 = Integer.parseInt(matcher2.group(1));
                                                                                                                                                    tVar.O = parseInt4;
                                                                                                                                                } else {
                                                                                                                                                    h2.a.l("MpdParser", "Unable to parse CEA-708 service block number from: ".concat(str123));
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    parseInt4 = -1;
                                                                                                                                    tVar.O = parseInt4;
                                                                                                                                }
                                                                                                                            } else if (s0.k(str44)) {
                                                                                                                                tVar.y = i58;
                                                                                                                                tVar.z = i59;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        u uVar2 = new u(tVar);
                                                                                                                        d dVar2 = new d(uVar2, !arrayList21.isEmpty() ? arrayList21 : arrayList22, sVar != null ? sVar : new r(null, 1L, 0L, 0L, 0L), str43, arrayList23, arrayList55, arrayList27, arrayList26);
                                                                                                                        int h = s0.h(uVar2.s);
                                                                                                                        int i62 = i15;
                                                                                                                        if (i62 != -1) {
                                                                                                                            if (h != -1) {
                                                                                                                                la.p(i62 == h ? 1 : i10);
                                                                                                                            }
                                                                                                                            h = i62;
                                                                                                                        }
                                                                                                                        ArrayList arrayList66 = arrayList19;
                                                                                                                        arrayList66.add(dVar2);
                                                                                                                        arrayList45 = arrayList66;
                                                                                                                        str24 = str119;
                                                                                                                        i13 = h;
                                                                                                                        arrayList10 = arrayList65;
                                                                                                                        arrayList15 = arrayList63;
                                                                                                                        arrayList17 = arrayList39;
                                                                                                                        arrayList16 = arrayList40;
                                                                                                                        str25 = str89;
                                                                                                                        j17 = j27;
                                                                                                                        str26 = str37;
                                                                                                                        str22 = str33;
                                                                                                                        str23 = str34;
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            i47 = i48 + 1;
                                                                                                            arrayList25 = arrayList26;
                                                                                                        }
                                                                                                    }
                                                                                                    arrayList26 = arrayList25;
                                                                                                    str44 = "audio/eac3";
                                                                                                    if ("audio/eac3-joc".equals(str44)) {
                                                                                                    }
                                                                                                } else {
                                                                                                    arrayList26 = arrayList25;
                                                                                                }
                                                                                                str46 = str100;
                                                                                                str47 = str36;
                                                                                                if (s0.j(str47, str46)) {
                                                                                                }
                                                                                                i18 = i10;
                                                                                                int i492 = i18;
                                                                                                while (true) {
                                                                                                    j27 = j24;
                                                                                                    if (i18 >= arrayList20.size()) {
                                                                                                    }
                                                                                                    i18++;
                                                                                                    str45 = str113;
                                                                                                    arrayList20 = arrayList60;
                                                                                                    j24 = j27;
                                                                                                }
                                                                                            } else {
                                                                                                arrayList56 = arrayList24;
                                                                                                arrayList57 = arrayList25;
                                                                                                arrayList54 = arrayList23;
                                                                                                long j53 = j24;
                                                                                                i44 = i17;
                                                                                                str27 = str42;
                                                                                                j52 = j25;
                                                                                                str105 = str40;
                                                                                                str88 = str38;
                                                                                                str107 = str21;
                                                                                                arrayList44 = arrayList13;
                                                                                                j51 = j26;
                                                                                                arrayList59 = arrayList14;
                                                                                                arrayList46 = arrayList12;
                                                                                                str87 = str32;
                                                                                                f10 = f14;
                                                                                                str31 = str76;
                                                                                                str108 = str43;
                                                                                                str53 = str;
                                                                                                str98 = str36;
                                                                                                i42 = i15;
                                                                                                arrayList45 = arrayList19;
                                                                                                str82 = str35;
                                                                                                i41 = i16;
                                                                                                str71 = str14;
                                                                                                str70 = str13;
                                                                                                str72 = str33;
                                                                                                str73 = str34;
                                                                                                i11 = 1;
                                                                                                str68 = str11;
                                                                                                arrayList36 = arrayList2;
                                                                                                arrayList35 = arrayList6;
                                                                                                arrayList18 = arrayList22;
                                                                                                str29 = str15;
                                                                                                sVar5 = sVar;
                                                                                                arrayList32 = arrayList7;
                                                                                                str69 = str37;
                                                                                                j42 = j10;
                                                                                                z10 = z11;
                                                                                                arrayList42 = arrayList20;
                                                                                                j46 = j15;
                                                                                                j41 = j12;
                                                                                                i31 = j53;
                                                                                                str93 = str17;
                                                                                                str96 = str96;
                                                                                                j43 = j22;
                                                                                                parseInt = i14;
                                                                                                str92 = str39;
                                                                                                arrayList58 = arrayList21;
                                                                                                arrayList33 = arrayList5;
                                                                                            }
                                                                                        } else {
                                                                                            str32 = str87;
                                                                                            String str124 = str72;
                                                                                            if (h2.a.i(xmlPullParser, str124)) {
                                                                                                arrayList12 = arrayList46;
                                                                                                str = str53;
                                                                                                long d10 = d(xmlPullParser, j51);
                                                                                                str33 = str124;
                                                                                                str34 = str109;
                                                                                                str35 = str82;
                                                                                                str36 = str98;
                                                                                                long j54 = i31;
                                                                                                long j55 = j43;
                                                                                                arrayList7 = arrayList32;
                                                                                                arrayList5 = arrayList33;
                                                                                                str37 = str69;
                                                                                                str13 = str70;
                                                                                                str14 = str71;
                                                                                                str15 = str29;
                                                                                                arrayList19 = arrayList45;
                                                                                                i14 = parseInt;
                                                                                                str38 = str88;
                                                                                                str17 = str93;
                                                                                                str21 = str107;
                                                                                                i15 = i42;
                                                                                                i16 = i41;
                                                                                                ArrayList arrayList67 = arrayList44;
                                                                                                arrayList20 = arrayList42;
                                                                                                arrayList21 = arrayList58;
                                                                                                j12 = j41;
                                                                                                long j56 = j42;
                                                                                                arrayList6 = arrayList35;
                                                                                                arrayList2 = arrayList36;
                                                                                                j15 = j46;
                                                                                                str76 = str31;
                                                                                                str39 = str92;
                                                                                                arrayList14 = arrayList59;
                                                                                                f14 = f11;
                                                                                                j24 = j54;
                                                                                                j26 = d10;
                                                                                                j25 = j52;
                                                                                                arrayList22 = arrayList18;
                                                                                                str11 = str68;
                                                                                                arrayList13 = arrayList67;
                                                                                                j22 = j55;
                                                                                                z11 = z10;
                                                                                                str42 = str27;
                                                                                                str40 = str105;
                                                                                                sVar = p(xmlPullParser, (o) sVar5, j55, j54, j52, d10, j56);
                                                                                                arrayList24 = arrayList56;
                                                                                                arrayList25 = arrayList57;
                                                                                                i17 = i44;
                                                                                                j10 = j56;
                                                                                                str43 = str108;
                                                                                                arrayList23 = arrayList54;
                                                                                            } else {
                                                                                                str33 = str124;
                                                                                                str34 = str109;
                                                                                                str35 = str82;
                                                                                                arrayList12 = arrayList46;
                                                                                                str = str53;
                                                                                                str36 = str98;
                                                                                                long j57 = j43;
                                                                                                arrayList7 = arrayList32;
                                                                                                arrayList5 = arrayList33;
                                                                                                str37 = str69;
                                                                                                str13 = str70;
                                                                                                str14 = str71;
                                                                                                str15 = str29;
                                                                                                arrayList19 = arrayList45;
                                                                                                i14 = parseInt;
                                                                                                str38 = str88;
                                                                                                str17 = str93;
                                                                                                str21 = str107;
                                                                                                i15 = i42;
                                                                                                i16 = i41;
                                                                                                ArrayList arrayList68 = arrayList44;
                                                                                                arrayList20 = arrayList42;
                                                                                                arrayList21 = arrayList58;
                                                                                                long j58 = j42;
                                                                                                arrayList6 = arrayList35;
                                                                                                arrayList2 = arrayList36;
                                                                                                str76 = str31;
                                                                                                str39 = str92;
                                                                                                f14 = f11;
                                                                                                long j59 = j52;
                                                                                                j24 = i31;
                                                                                                String str125 = str68;
                                                                                                j12 = j41;
                                                                                                j15 = j46;
                                                                                                arrayList14 = arrayList59;
                                                                                                if (h2.a.i(xmlPullParser, str125)) {
                                                                                                    j10 = j58;
                                                                                                    long d11 = d(xmlPullParser, j51);
                                                                                                    z11 = z10;
                                                                                                    arrayList22 = arrayList18;
                                                                                                    str11 = str125;
                                                                                                    j25 = j59;
                                                                                                    s q10 = q(xmlPullParser, (p) sVar5, arrayList68, j57, j24, j25, d11, j10);
                                                                                                    arrayList13 = arrayList68;
                                                                                                    j22 = j57;
                                                                                                    j26 = d11;
                                                                                                    str42 = str27;
                                                                                                    str40 = str105;
                                                                                                    sVar = q10;
                                                                                                    arrayList23 = arrayList54;
                                                                                                } else {
                                                                                                    z11 = z10;
                                                                                                    arrayList13 = arrayList68;
                                                                                                    j10 = j58;
                                                                                                    arrayList22 = arrayList18;
                                                                                                    str11 = str125;
                                                                                                    j25 = j59;
                                                                                                    if (h2.a.i(xmlPullParser, str38)) {
                                                                                                        Pair f18 = f(xmlPullParser);
                                                                                                        Object obj3 = f18.first;
                                                                                                        if (obj3 != null) {
                                                                                                            str108 = (String) obj3;
                                                                                                        }
                                                                                                        Object obj4 = f18.second;
                                                                                                        if (obj4 != null) {
                                                                                                            arrayList23 = arrayList54;
                                                                                                            arrayList23.add((e2.q) obj4);
                                                                                                        } else {
                                                                                                            arrayList23 = arrayList54;
                                                                                                        }
                                                                                                        j26 = j51;
                                                                                                        j22 = j57;
                                                                                                        str42 = str27;
                                                                                                        str40 = str105;
                                                                                                        sVar = sVar5;
                                                                                                    } else {
                                                                                                        str40 = str105;
                                                                                                        arrayList23 = arrayList54;
                                                                                                        if (h2.a.i(xmlPullParser, str40)) {
                                                                                                            j26 = j51;
                                                                                                            arrayList55.add(h(xmlPullParser, str40));
                                                                                                            j22 = j57;
                                                                                                            str41 = str90;
                                                                                                            arrayList24 = arrayList56;
                                                                                                        } else {
                                                                                                            j26 = j51;
                                                                                                            ArrayList arrayList69 = arrayList55;
                                                                                                            if (h2.a.i(xmlPullParser, str39)) {
                                                                                                                arrayList55 = arrayList69;
                                                                                                                arrayList24 = arrayList56;
                                                                                                                arrayList24.add(h(xmlPullParser, str39));
                                                                                                                j22 = j57;
                                                                                                                str41 = str90;
                                                                                                            } else {
                                                                                                                arrayList55 = arrayList69;
                                                                                                                str41 = str90;
                                                                                                                arrayList24 = arrayList56;
                                                                                                                if (h2.a.i(xmlPullParser, str41)) {
                                                                                                                    j22 = j57;
                                                                                                                    arrayList25 = arrayList57;
                                                                                                                    arrayList25.add(h(xmlPullParser, str41));
                                                                                                                } else {
                                                                                                                    j22 = j57;
                                                                                                                    arrayList25 = arrayList57;
                                                                                                                    b(xmlPullParser);
                                                                                                                }
                                                                                                                str90 = str41;
                                                                                                                str42 = str27;
                                                                                                                sVar = sVar5;
                                                                                                                i17 = i44;
                                                                                                                str43 = str108;
                                                                                                            }
                                                                                                        }
                                                                                                        arrayList25 = arrayList57;
                                                                                                        str90 = str41;
                                                                                                        str42 = str27;
                                                                                                        sVar = sVar5;
                                                                                                        i17 = i44;
                                                                                                        str43 = str108;
                                                                                                    }
                                                                                                }
                                                                                                arrayList24 = arrayList56;
                                                                                                arrayList25 = arrayList57;
                                                                                                i17 = i44;
                                                                                                str43 = str108;
                                                                                            }
                                                                                            if (h2.a.h(xmlPullParser, str42)) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                str35 = str82;
                                                                                str = str53;
                                                                                z11 = z10;
                                                                                str36 = str98;
                                                                                arrayList7 = arrayList32;
                                                                                arrayList5 = arrayList33;
                                                                                str37 = str69;
                                                                                str13 = str70;
                                                                                str14 = str71;
                                                                                str33 = str72;
                                                                                str34 = str73;
                                                                                str15 = str29;
                                                                                arrayList19 = arrayList45;
                                                                                i14 = parseInt;
                                                                                str38 = str88;
                                                                                str17 = str93;
                                                                                str40 = str105;
                                                                                i15 = i42;
                                                                                sVar = sVar5;
                                                                                arrayList25 = arrayList57;
                                                                                i16 = i41;
                                                                                str32 = str87;
                                                                                arrayList12 = arrayList46;
                                                                                arrayList21 = arrayList58;
                                                                                arrayList22 = arrayList18;
                                                                                str11 = str68;
                                                                                str76 = str31;
                                                                                str39 = str92;
                                                                                str42 = str27;
                                                                                str43 = str108;
                                                                                f14 = f11;
                                                                                j25 = j52;
                                                                                arrayList13 = arrayList44;
                                                                                j24 = i31;
                                                                                j22 = j43;
                                                                                str21 = str107;
                                                                                arrayList23 = arrayList54;
                                                                                arrayList20 = arrayList42;
                                                                                j12 = j41;
                                                                                j10 = j42;
                                                                                arrayList6 = arrayList35;
                                                                                arrayList2 = arrayList36;
                                                                                j15 = j46;
                                                                                arrayList14 = arrayList59;
                                                                                j26 = j51;
                                                                                arrayList24 = arrayList56;
                                                                                i17 = i44;
                                                                                if (h2.a.h(xmlPullParser, str42)) {
                                                                                }
                                                                            }
                                                                        } else {
                                                                            arrayList11 = arrayList8;
                                                                            str = str53;
                                                                            z11 = z10;
                                                                            long j60 = i31;
                                                                            arrayList7 = arrayList32;
                                                                            arrayList5 = arrayList33;
                                                                            str11 = str68;
                                                                            str12 = str69;
                                                                            str13 = str70;
                                                                            str14 = str71;
                                                                            String str126 = str72;
                                                                            str15 = str77;
                                                                            str16 = str78;
                                                                            str17 = str79;
                                                                            arrayList12 = arrayList46;
                                                                            arrayList13 = arrayList44;
                                                                            j12 = j41;
                                                                            j15 = j46;
                                                                            str18 = str83;
                                                                            str19 = str81;
                                                                            str20 = str80;
                                                                            arrayList14 = arrayList43;
                                                                            ArrayList arrayList70 = arrayList42;
                                                                            j10 = j42;
                                                                            j22 = j43;
                                                                            arrayList6 = arrayList35;
                                                                            arrayList2 = arrayList36;
                                                                            String str127 = str73;
                                                                            str21 = attributeValue14;
                                                                            int i63 = i35;
                                                                            if (h2.a.i(xmlPullParser, str127)) {
                                                                                sVar3 = o(xmlPullParser, (r) sVar3);
                                                                                str23 = str127;
                                                                                str24 = str82;
                                                                                i13 = i63;
                                                                                arrayList15 = arrayList70;
                                                                                arrayList17 = arrayList39;
                                                                                arrayList16 = arrayList40;
                                                                                str25 = str89;
                                                                                j17 = j60;
                                                                                str26 = str12;
                                                                                str22 = str126;
                                                                            } else {
                                                                                str22 = str126;
                                                                                if (h2.a.i(xmlPullParser, str22)) {
                                                                                    long d12 = d(xmlPullParser, j48);
                                                                                    str23 = str127;
                                                                                    str24 = str82;
                                                                                    i12 = i63;
                                                                                    arrayList15 = arrayList70;
                                                                                    sVar3 = p(xmlPullParser, (o) sVar3, j22, j60, j21, d12, j10);
                                                                                    j10 = j10;
                                                                                    j17 = j60;
                                                                                    j48 = d12;
                                                                                } else {
                                                                                    str23 = str127;
                                                                                    str24 = str82;
                                                                                    i12 = i63;
                                                                                    arrayList15 = arrayList70;
                                                                                    long j61 = j48;
                                                                                    j17 = j60;
                                                                                    if (h2.a.i(xmlPullParser, str11)) {
                                                                                        long d13 = d(xmlPullParser, j61);
                                                                                        sVar3 = q(xmlPullParser, (p) sVar3, arrayList13, j22, j17, j21, d13, j10);
                                                                                        j48 = d13;
                                                                                    } else {
                                                                                        if (h2.a.i(xmlPullParser, "InbandEventStream")) {
                                                                                            arrayList16 = arrayList40;
                                                                                            arrayList16.add(h(xmlPullParser, "InbandEventStream"));
                                                                                            j23 = j61;
                                                                                            arrayList17 = arrayList39;
                                                                                            str25 = str89;
                                                                                        } else {
                                                                                            arrayList16 = arrayList40;
                                                                                            if (h2.a.i(xmlPullParser, "Label")) {
                                                                                                str25 = str89;
                                                                                                String attributeValue32 = xmlPullParser.getAttributeValue(null, str25);
                                                                                                String str128 = "";
                                                                                                while (true) {
                                                                                                    xmlPullParser.next();
                                                                                                    j23 = j61;
                                                                                                    if (xmlPullParser.getEventType() == 4) {
                                                                                                        str128 = xmlPullParser.getText();
                                                                                                    } else {
                                                                                                        b(xmlPullParser);
                                                                                                    }
                                                                                                    if (h2.a.h(xmlPullParser, "Label")) {
                                                                                                        arrayList17 = arrayList39;
                                                                                                        arrayList17.add(new x(attributeValue32, str128));
                                                                                                    } else {
                                                                                                        j61 = j23;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                j23 = j61;
                                                                                                arrayList17 = arrayList39;
                                                                                                str25 = str89;
                                                                                                if (xmlPullParser.getEventType() == 2) {
                                                                                                    b(xmlPullParser);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        j48 = j23;
                                                                                        i13 = i12;
                                                                                        str26 = str12;
                                                                                    }
                                                                                }
                                                                                arrayList17 = arrayList39;
                                                                                arrayList16 = arrayList40;
                                                                                str25 = str89;
                                                                                i13 = i12;
                                                                                str26 = str12;
                                                                            }
                                                                        }
                                                                        if (h2.a.h(xmlPullParser, str26)) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        arrayList11 = arrayList8;
                                                        str24 = str82;
                                                        i12 = i35;
                                                        str = str53;
                                                        z11 = z10;
                                                        arrayList9 = arrayList38;
                                                        arrayList10 = arrayList41;
                                                        str25 = str54;
                                                        arrayList7 = arrayList32;
                                                        arrayList5 = arrayList33;
                                                        str11 = str68;
                                                        str12 = str69;
                                                        str13 = str70;
                                                        str14 = str71;
                                                        str22 = str72;
                                                        str23 = str73;
                                                        arrayList17 = arrayList39;
                                                        arrayList16 = arrayList40;
                                                        str15 = str77;
                                                        str16 = str78;
                                                        str17 = str79;
                                                        j23 = j48;
                                                        arrayList12 = arrayList46;
                                                        arrayList13 = arrayList44;
                                                        str18 = str83;
                                                        str19 = str81;
                                                        str20 = str80;
                                                        j22 = j43;
                                                        str21 = attributeValue14;
                                                        arrayList15 = arrayList42;
                                                        j10 = j42;
                                                        j17 = i31;
                                                        arrayList6 = arrayList35;
                                                        arrayList2 = arrayList36;
                                                        j12 = j41;
                                                        j15 = j46;
                                                        arrayList14 = arrayList43;
                                                        j48 = j23;
                                                        i13 = i12;
                                                        str26 = str12;
                                                        if (h2.a.h(xmlPullParser, str26)) {
                                                        }
                                                    }
                                                }
                                                arrayList11 = arrayList8;
                                                str24 = str82;
                                                str = str53;
                                                z11 = z10;
                                                arrayList9 = arrayList38;
                                                arrayList10 = arrayList41;
                                                arrayList7 = arrayList32;
                                                arrayList5 = arrayList33;
                                                str13 = str70;
                                                str14 = str71;
                                                str22 = str72;
                                                str23 = str73;
                                                arrayList17 = arrayList39;
                                                arrayList16 = arrayList40;
                                                str15 = str77;
                                                str16 = str78;
                                                str17 = str79;
                                                arrayList12 = arrayList46;
                                                str18 = str83;
                                                str19 = str81;
                                                str20 = str80;
                                                j22 = j43;
                                                str21 = attributeValue14;
                                                arrayList15 = arrayList42;
                                                j10 = j42;
                                                j17 = i31;
                                                arrayList6 = arrayList35;
                                                arrayList2 = arrayList36;
                                                i13 = i35;
                                                str25 = str54;
                                                j12 = j41;
                                                str11 = str68;
                                                j15 = j46;
                                                arrayList14 = arrayList43;
                                                arrayList13 = arrayList44;
                                                str26 = str69;
                                                if (h2.a.h(xmlPullParser, str26)) {
                                                }
                                            }
                                        } else {
                                            arrayList4 = arrayList31;
                                            String str129 = str63;
                                            str = str53;
                                            String str130 = str64;
                                            String str131 = str65;
                                            z11 = z10;
                                            str2 = str54;
                                            j10 = j42;
                                            long j62 = i31;
                                            long j63 = j43;
                                            ArrayList arrayList71 = arrayList32;
                                            arrayList5 = arrayList33;
                                            arrayList6 = arrayList34;
                                            arrayList2 = arrayList30;
                                            j12 = j41;
                                            j15 = j32;
                                            if (h2.a.i(xmlPullParser, "EventStream")) {
                                                String str132 = str66;
                                                String attributeValue33 = xmlPullParser.getAttributeValue(null, str132);
                                                String str133 = attributeValue33 == null ? "" : attributeValue33;
                                                String str134 = str131;
                                                String attributeValue34 = xmlPullParser.getAttributeValue(null, str134);
                                                String str135 = attributeValue34 == null ? "" : attributeValue34;
                                                String attributeValue35 = xmlPullParser.getAttributeValue(null, "timescale");
                                                long parseLong2 = attributeValue35 == null ? 1L : Long.parseLong(attributeValue35);
                                                String attributeValue36 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
                                                long parseLong3 = attributeValue36 == null ? 0L : Long.parseLong(attributeValue36);
                                                ArrayList arrayList72 = new ArrayList();
                                                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream(512);
                                                while (true) {
                                                    xmlPullParser.next();
                                                    if (h2.a.i(xmlPullParser, "Event")) {
                                                        str9 = str129;
                                                        String attributeValue37 = xmlPullParser.getAttributeValue(null, str9);
                                                        long parseLong4 = attributeValue37 == null ? 0L : Long.parseLong(attributeValue37);
                                                        str8 = str130;
                                                        String attributeValue38 = xmlPullParser.getAttributeValue(null, str8);
                                                        long parseLong5 = attributeValue38 == null ? -9223372036854775807L : Long.parseLong(attributeValue38);
                                                        String attributeValue39 = xmlPullParser.getAttributeValue(null, "presentationTime");
                                                        long parseLong6 = attributeValue39 == null ? 0L : Long.parseLong(attributeValue39);
                                                        String str136 = l0.a;
                                                        RoundingMode roundingMode = RoundingMode.DOWN;
                                                        long a02 = l0.a0(parseLong5, 1000L, parseLong2, roundingMode);
                                                        long a03 = l0.a0(parseLong6 - parseLong3, 1000000L, parseLong2, roundingMode);
                                                        arrayList7 = arrayList71;
                                                        j18 = parseLong2;
                                                        str66 = str132;
                                                        String attributeValue40 = xmlPullParser.getAttributeValue(null, "messageData");
                                                        if (attributeValue40 == null) {
                                                            attributeValue40 = null;
                                                        }
                                                        byteArrayOutputStream3.reset();
                                                        XmlSerializer newSerializer = Xml.newSerializer();
                                                        str3 = str134;
                                                        newSerializer.setOutput(byteArrayOutputStream3, StandardCharsets.UTF_8.name());
                                                        xmlPullParser.nextToken();
                                                        while (!h2.a.h(xmlPullParser, "Event")) {
                                                            switch (xmlPullParser.getEventType()) {
                                                                case 0:
                                                                    j20 = parseLong3;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    newSerializer.startDocument(null, Boolean.FALSE);
                                                                    break;
                                                                case 1:
                                                                    j20 = parseLong3;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    newSerializer.endDocument();
                                                                    break;
                                                                case 2:
                                                                    j20 = parseLong3;
                                                                    newSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                                                                    int i64 = i10;
                                                                    while (i64 < xmlPullParser.getAttributeCount()) {
                                                                        newSerializer.attribute(xmlPullParser.getAttributeNamespace(i64), xmlPullParser.getAttributeName(i64), xmlPullParser.getAttributeValue(i64));
                                                                        i64++;
                                                                        byteArrayOutputStream3 = byteArrayOutputStream3;
                                                                    }
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                case 3:
                                                                    j20 = parseLong3;
                                                                    newSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                case 4:
                                                                    newSerializer.text(xmlPullParser.getText());
                                                                    j20 = parseLong3;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                case 5:
                                                                    newSerializer.cdsect(xmlPullParser.getText());
                                                                    j20 = parseLong3;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                case 6:
                                                                    newSerializer.entityRef(xmlPullParser.getText());
                                                                    j20 = parseLong3;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                case 7:
                                                                    newSerializer.ignorableWhitespace(xmlPullParser.getText());
                                                                    j20 = parseLong3;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                case 8:
                                                                    newSerializer.processingInstruction(xmlPullParser.getText());
                                                                    j20 = parseLong3;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                case 9:
                                                                    newSerializer.comment(xmlPullParser.getText());
                                                                    j20 = parseLong3;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                case 10:
                                                                    newSerializer.docdecl(xmlPullParser.getText());
                                                                    j20 = parseLong3;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                default:
                                                                    j20 = parseLong3;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                            }
                                                            xmlPullParser.nextToken();
                                                            byteArrayOutputStream3 = byteArrayOutputStream2;
                                                            parseLong3 = j20;
                                                        }
                                                        j19 = parseLong3;
                                                        byteArrayOutputStream = byteArrayOutputStream3;
                                                        newSerializer.flush();
                                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                        Long valueOf = Long.valueOf(a03);
                                                        if (attributeValue40 != null) {
                                                            byteArray = attributeValue40.getBytes(StandardCharsets.UTF_8);
                                                        }
                                                        str7 = str133;
                                                        str10 = str135;
                                                        arrayList72.add(Pair.create(valueOf, new q3.a(str133, str135, a02, parseLong4, byteArray)));
                                                    } else {
                                                        arrayList7 = arrayList71;
                                                        str66 = str132;
                                                        str3 = str134;
                                                        byteArrayOutputStream = byteArrayOutputStream3;
                                                        str7 = str133;
                                                        j18 = parseLong2;
                                                        str8 = str130;
                                                        str9 = str129;
                                                        j19 = parseLong3;
                                                        str10 = str135;
                                                        b(xmlPullParser);
                                                    }
                                                    if (h2.a.h(xmlPullParser, "EventStream")) {
                                                        long[] jArr = new long[arrayList72.size()];
                                                        q3.a[] aVarArr = new q3.a[arrayList72.size()];
                                                        for (int i65 = i10; i65 < arrayList72.size(); i65++) {
                                                            Pair pair2 = (Pair) arrayList72.get(i65);
                                                            jArr[i65] = ((Long) pair2.first).longValue();
                                                            aVarArr[i65] = (q3.a) pair2.second;
                                                        }
                                                        arrayList5.add(new g(str7, str10, jArr, aVarArr));
                                                        str4 = str8;
                                                        j16 = j63;
                                                        j17 = j62;
                                                        j11 = -9223372036854775807L;
                                                        str5 = str9;
                                                    } else {
                                                        str133 = str7;
                                                        str135 = str10;
                                                        str129 = str9;
                                                        str130 = str8;
                                                        str132 = str66;
                                                        byteArrayOutputStream3 = byteArrayOutputStream;
                                                        parseLong3 = j19;
                                                        str134 = str3;
                                                        arrayList71 = arrayList7;
                                                        parseLong2 = j18;
                                                    }
                                                }
                                            } else {
                                                arrayList7 = arrayList71;
                                                str3 = str131;
                                                str4 = str130;
                                                if (h2.a.i(xmlPullParser, "SegmentBase")) {
                                                    sVar2 = o(xmlPullParser, null);
                                                    arrayList5 = arrayList5;
                                                    str6 = str67;
                                                    j16 = j63;
                                                    j17 = j62;
                                                    j11 = -9223372036854775807L;
                                                    str5 = str129;
                                                } else if (h2.a.i(xmlPullParser, "SegmentList")) {
                                                    j11 = -9223372036854775807L;
                                                    long d14 = d(xmlPullParser, -9223372036854775807L);
                                                    arrayList5 = arrayList5;
                                                    str5 = str129;
                                                    sVar2 = p(xmlPullParser, null, j63, j62, j14, d14, j10);
                                                    j10 = j10;
                                                    j17 = j62;
                                                    j16 = j63;
                                                    j44 = d14;
                                                } else {
                                                    arrayList5 = arrayList5;
                                                    j16 = j63;
                                                    j17 = j62;
                                                    j11 = -9223372036854775807L;
                                                    str5 = str129;
                                                    if (h2.a.i(xmlPullParser, str68)) {
                                                        long d15 = d(xmlPullParser, -9223372036854775807L);
                                                        g0 g0Var = i0.b;
                                                        sVar2 = q(xmlPullParser, null, t1.e, j16, j17, j14, d15, j10);
                                                        j44 = d15;
                                                    } else if (h2.a.i(xmlPullParser, "AssetIdentifier")) {
                                                        h(xmlPullParser, "AssetIdentifier");
                                                    } else {
                                                        b(xmlPullParser);
                                                    }
                                                }
                                            }
                                        }
                                        str6 = str67;
                                    }
                                    if (h2.a.h(xmlPullParser, str6)) {
                                        Pair create = Pair.create(new h(attributeValue11, i30, arrayList7, arrayList5), Long.valueOf(j17));
                                        h hVar = (h) create.first;
                                        if (hVar.b != j11) {
                                            long longValue = ((Long) create.second).longValue();
                                            j29 = longValue == j11 ? j11 : longValue + hVar.b;
                                            arrayList3 = arrayList29;
                                            arrayList3.add(hVar);
                                        } else {
                                            if (!equals) {
                                                throw t0.b("Unable to determine start of period " + arrayList29.size(), null);
                                            }
                                            arrayList3 = arrayList29;
                                            i29 = i11;
                                            j29 = j15;
                                        }
                                        j13 = j29;
                                    } else {
                                        str67 = str6;
                                        j43 = j16;
                                        j32 = j15;
                                        j41 = j12;
                                        j45 = j14;
                                        arrayList31 = arrayList4;
                                        str64 = str4;
                                        str63 = str5;
                                        str54 = str2;
                                        str53 = str;
                                        arrayList32 = arrayList7;
                                        arrayList33 = arrayList5;
                                        i31 = j17;
                                        arrayList30 = arrayList2;
                                        arrayList34 = arrayList6;
                                        j42 = j10;
                                        z10 = z11;
                                        str65 = str3;
                                    }
                                }
                            } else {
                                z11 = z10;
                                j10 = j42;
                                j11 = j3;
                                arrayList2 = arrayList30;
                                j12 = j41;
                                j13 = j32;
                                arrayList3 = arrayList29;
                                b(xmlPullParser);
                            }
                            j31 = j12;
                        }
                        if (!h2.a.h(xmlPullParser, "MPD")) {
                            if (i23 == j11) {
                                if (j13 != j11) {
                                    i23 = j13;
                                } else if (!equals) {
                                    throw t0.b("Unable to determine duration of static manifest.", null);
                                }
                            }
                            if (arrayList3.isEmpty()) {
                                throw t0.b("No periods found.", null);
                            }
                            return new c(V, i23, i24, equals, i25, j10, i27, V2, iVar, aVar, e0Var, uri2, arrayList3);
                        }
                        arrayList29 = arrayList3;
                        i26 = j10;
                        j30 = j11;
                        i21 = i10;
                        i7 = i11;
                        j32 = j13;
                        arrayList30 = arrayList2;
                        r10 = arrayList;
                        z10 = z11;
                        str52 = null;
                    }
                    z11 = z10;
                    arrayList3 = arrayList29;
                }
                j11 = j3;
            }
            j10 = i26;
            if (!h2.a.h(xmlPullParser, "MPD")) {
            }
        }
    }

    public static j l(XmlPullParser xmlPullParser, String str, String str2) {
        long j3;
        long j10;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j3 = Long.parseLong(split[0]);
            if (split.length == 2) {
                j10 = (Long.parseLong(split[1]) - j3) + 1;
                return new j(j3, attributeValue, j10);
            }
        } else {
            j3 = 0;
        }
        j10 = -1;
        return new j(j3, attributeValue, j10);
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
        int i7 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (ja.a("http://dashif.org/guidelines/trickmode", ((f) arrayList.get(i10)).a)) {
                i7 = TLObject.FLAG_14;
            }
        }
        return i7;
    }

    public static r o(XmlPullParser xmlPullParser, r rVar) {
        long j3 = rVar != null ? rVar.b : 1L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j3 = Long.parseLong(attributeValue);
        }
        long j10 = j3;
        long j11 = rVar != null ? rVar.c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j11 = Long.parseLong(attributeValue2);
        }
        long j12 = j11;
        long j13 = rVar != null ? rVar.d : 0L;
        long j14 = rVar != null ? rVar.e : 0L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue3 != null) {
            String[] split = attributeValue3.split("-");
            j13 = Long.parseLong(split[0]);
            j14 = (Long.parseLong(split[1]) - j13) + 1;
        }
        long j15 = j14;
        long j16 = j13;
        j jVar = rVar != null ? rVar.a : null;
        while (true) {
            xmlPullParser.next();
            if (h2.a.i(xmlPullParser, "Initialization")) {
                jVar = l(xmlPullParser, "sourceURL", "range");
            } else {
                b(xmlPullParser);
            }
            j jVar2 = jVar;
            if (h2.a.h(xmlPullParser, "SegmentBase")) {
                return new r(jVar2, j10, j12, j16, j15);
            }
            jVar = jVar2;
        }
    }

    public static o p(XmlPullParser xmlPullParser, o oVar, long j3, long j10, long j11, long j12, long j13) {
        long j14 = oVar != null ? oVar.b : 1L;
        List list = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j14 = Long.parseLong(attributeValue);
        }
        long j15 = j14;
        long j16 = oVar != null ? oVar.c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j16 = Long.parseLong(attributeValue2);
        }
        long j17 = j16;
        long j18 = oVar != null ? oVar.e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j18 = Long.parseLong(attributeValue3);
        }
        long j19 = j18;
        long j20 = oVar != null ? oVar.d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j20 = Long.parseLong(attributeValue4);
        }
        long j21 = j20;
        long j22 = j12 == -9223372036854775807L ? j11 : j12;
        long j23 = j22 == Long.MAX_VALUE ? -9223372036854775807L : j22;
        j jVar = null;
        List list2 = null;
        do {
            xmlPullParser.next();
            if (h2.a.i(xmlPullParser, "Initialization")) {
                jVar = l(xmlPullParser, "sourceURL", "range");
            } else if (h2.a.i(xmlPullParser, "SegmentTimeline")) {
                list2 = r(xmlPullParser, j15, j10);
            } else if (h2.a.i(xmlPullParser, "SegmentURL")) {
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(l(xmlPullParser, "media", "mediaRange"));
            } else {
                b(xmlPullParser);
            }
        } while (!h2.a.h(xmlPullParser, "SegmentList"));
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
        return new o(jVar, j15, j17, j21, j19, list2, j23, list, l0.S(j13), l0.S(j3));
    }

    public static p q(XmlPullParser xmlPullParser, p pVar, List list, long j3, long j10, long j11, long j12, long j13) {
        long j14;
        long j15 = pVar != null ? pVar.b : 1L;
        j jVar = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j15 = Long.parseLong(attributeValue);
        }
        long j16 = j15;
        long j17 = pVar != null ? pVar.c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j17 = Long.parseLong(attributeValue2);
        }
        long j18 = j17;
        long j19 = pVar != null ? pVar.e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j19 = Long.parseLong(attributeValue3);
        }
        long j20 = j19;
        long j21 = pVar != null ? pVar.d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j21 = Long.parseLong(attributeValue4);
        }
        long j22 = j21;
        int i7 = 0;
        while (true) {
            if (i7 >= list.size()) {
                j14 = -1;
                break;
            }
            f fVar = (f) list.get(i7);
            if (ja.a("http://dashif.org/guidelines/last-segment-number", fVar.a)) {
                j14 = Long.parseLong(fVar.b);
                break;
            }
            i7++;
        }
        long j23 = j14;
        long j24 = j12 == -9223372036854775807L ? j11 : j12;
        long j25 = j24 == Long.MAX_VALUE ? -9223372036854775807L : j24;
        md0 s5 = s(xmlPullParser, "media", pVar != null ? pVar.k : null);
        md0 s9 = s(xmlPullParser, "initialization", pVar != null ? pVar.j : null);
        List list2 = null;
        do {
            xmlPullParser.next();
            if (h2.a.i(xmlPullParser, "Initialization")) {
                jVar = l(xmlPullParser, "sourceURL", "range");
            } else if (h2.a.i(xmlPullParser, "SegmentTimeline")) {
                list2 = r(xmlPullParser, j16, j10);
            } else {
                b(xmlPullParser);
            }
        } while (!h2.a.h(xmlPullParser, "SegmentTemplate"));
        if (pVar != null) {
            if (jVar == null) {
                jVar = pVar.a;
            }
            if (list2 == null) {
                list2 = pVar.f;
            }
        }
        return new p(jVar, j16, j18, j22, j23, j20, list2, j25, s9, s5, l0.S(j13), l0.S(j3));
    }

    public static ArrayList r(XmlPullParser xmlPullParser, long j3, long j10) {
        long j11;
        ArrayList arrayList = new ArrayList();
        long j12 = 0;
        long j13 = -9223372036854775807L;
        boolean z10 = false;
        int i7 = 0;
        do {
            xmlPullParser.next();
            if (h2.a.i(xmlPullParser, "S")) {
                String attributeValue = xmlPullParser.getAttributeValue(null, "t");
                long parseLong = attributeValue == null ? -9223372036854775807L : Long.parseLong(attributeValue);
                if (z10) {
                    int i10 = i7;
                    j11 = parseLong;
                    j12 = a(arrayList, j12, j13, i10, j11);
                } else {
                    j11 = parseLong;
                }
                if (j11 != -9223372036854775807L) {
                    j12 = j11;
                }
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "d");
                j13 = attributeValue2 == null ? -9223372036854775807L : Long.parseLong(attributeValue2);
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "r");
                i7 = attributeValue3 == null ? 0 : Integer.parseInt(attributeValue3);
                z10 = true;
            } else {
                b(xmlPullParser);
            }
        } while (!h2.a.h(xmlPullParser, "SegmentTimeline"));
        if (z10) {
            String str = l0.a;
            a(arrayList, j12, j13, i7, l0.a0(j10, j3, 1000L, RoundingMode.DOWN));
        }
        return arrayList;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x0100. Please report as an issue. */
    public static md0 s(XmlPullParser xmlPullParser, String str, md0 md0Var) {
        String str2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return md0Var;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        arrayList.add("");
        int i7 = 0;
        while (i7 < attributeValue.length()) {
            int indexOf = attributeValue.indexOf("$", i7);
            if (indexOf == -1) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(i7));
                i7 = attributeValue.length();
            } else if (indexOf != i7) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(i7, indexOf));
                i7 = indexOf;
            } else if (attributeValue.startsWith("$$", i7)) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + "$");
                i7 += 2;
            } else {
                arrayList3.add("");
                int i10 = i7 + 1;
                int indexOf2 = attributeValue.indexOf("$", i10);
                String substring = attributeValue.substring(i10, indexOf2);
                if (substring.equals("RepresentationID")) {
                    arrayList2.add(1);
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
                            arrayList2.add(2);
                            break;
                        case "Time":
                            arrayList2.add(4);
                            break;
                        case "Bandwidth":
                            arrayList2.add(3);
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid template: ".concat(attributeValue));
                    }
                    arrayList3.set(arrayList2.size() - 1, str2);
                }
                arrayList.add("");
                i7 = indexOf2 + 1;
            }
        }
        return new md0(arrayList, arrayList2, arrayList3, 3);
    }

    @Override // b3.r
    public final Object t(Uri uri, j2.k kVar) {
        try {
            XmlPullParser newPullParser = this.a.newPullParser();
            newPullParser.setInput(kVar, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return k(newPullParser, uri);
            }
            throw t0.b("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e10) {
            if (e10.getDetail() instanceof IOException) {
                throw ((IOException) e10.getDetail());
            }
            throw t0.b(null, e10);
        }
    }
}
