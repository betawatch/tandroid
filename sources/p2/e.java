package p2;

import a8.ga;
import a8.ia;
import a8.wa;
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
import h2.m0;
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
import org.telegram.messenger.m6;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.hy0;
import org.webrtc.MediaStreamTrack;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class e extends DefaultHandler implements b3.q {
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
            String str = m0.a;
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
                        String[] d02 = m0.d0(str);
                        if (d02.length != 0) {
                            List z9 = new wa(new d6.i(new g9.e('.', 0), 28)).z(ga.c(d02[0].trim()));
                            if (z9.size() == 4 && ((String) z9.get(0)).equals("ac-4")) {
                                String str2 = (String) z9.get(3);
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
                    String c12 = ga.c(attributeValue5);
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

    public static ArrayList e(XmlPullParser xmlPullParser, ArrayList arrayList, boolean z9) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : z9 ? 1 : TLObject.FLAG_31;
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
            if (z9) {
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
            String c11 = ga.c(attributeValue);
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
        Matcher matcher = m0.e.matcher(attributeValue);
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
    /* JADX WARN: Code restructure failed: missing block: B:380:0x09de, code lost:
    
        if ("audio/eac3-joc".equals(r3) != false) goto L347;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:191:0x1048 A[LOOP:5: B:182:0x040e->B:191:0x1048, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0ec2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0cee A[LOOP:11: B:352:0x06b3->B:361:0x0cee, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0918 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x1455 A[LOOP:1: B:35:0x00cd->B:43:0x1455, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x1421 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c k(XmlPullParser xmlPullParser, Uri uri) {
        boolean z9;
        boolean z10;
        int i7;
        ArrayList arrayList;
        boolean z11;
        long j3;
        long j10;
        boolean z12;
        long j11;
        long j12;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        String str;
        String str2;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        String str3;
        String str4;
        long j13;
        long j14;
        String str5;
        String str6;
        long j15;
        long j16;
        String str7;
        String str8;
        long j17;
        String str9;
        String str10;
        String str11;
        String str12;
        long j18;
        ArrayList arrayList8;
        long j19;
        ArrayList arrayList9;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        ArrayList arrayList10;
        String str21;
        ArrayList arrayList11;
        ArrayList arrayList12;
        String str22;
        String str23;
        ArrayList arrayList13;
        long j20;
        String str24;
        int i10;
        String str25;
        ArrayList arrayList14;
        ArrayList arrayList15;
        long j21;
        ArrayList arrayList16;
        String str26;
        long j22;
        String str27;
        String str28;
        int i11;
        String str29;
        String str30;
        ArrayList arrayList17;
        int parseInt;
        String str31;
        String str32;
        String str33;
        String str34;
        int parseInt2;
        String str35;
        float f10;
        int parseInt3;
        float f11;
        ArrayList arrayList18;
        String str36;
        String str37;
        ArrayList arrayList19;
        String str38;
        String str39;
        int i12;
        ArrayList arrayList20;
        int i13;
        String str40;
        String str41;
        String str42;
        int i14;
        ArrayList arrayList21;
        float f12;
        ArrayList arrayList22;
        String str43;
        ArrayList arrayList23;
        long j23;
        ArrayList arrayList24;
        long j24;
        String str44;
        String str45;
        String str46;
        ArrayList arrayList25;
        long j25;
        ArrayList arrayList26;
        String str47;
        String str48;
        int i15;
        String str49;
        String str50;
        String d2;
        ArrayList arrayList27;
        String str51;
        e2.m mVar;
        Pair pair;
        int parseInt4;
        String str52;
        int i16;
        int i17;
        String str53;
        int i18;
        ArrayList arrayList28;
        long j26;
        String str54;
        m kVar;
        String str55;
        String str56;
        int i19 = 0;
        String[] strArr = new String[0];
        String str57 = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "profiles");
        if (attributeValue != null) {
            strArr = attributeValue.split(",");
        }
        int length = strArr.length;
        int i20 = 0;
        while (true) {
            z9 = true;
            if (i20 >= length) {
                z10 = false;
                break;
            }
            if (strArr[i20].startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                z10 = true;
                break;
            }
            i20++;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "availabilityStartTime");
        long j27 = -9223372036854775807L;
        long V = attributeValue2 == null ? -9223372036854775807L : m0.V(attributeValue2);
        long i21 = i(xmlPullParser, "mediaPresentationDuration", -9223372036854775807L);
        long i22 = i(xmlPullParser, "minBufferTime", -9223372036854775807L);
        boolean equals = "dynamic".equals(xmlPullParser.getAttributeValue(null, TeXSymbolParser.TYPE_ATTR));
        long i23 = equals ? i(xmlPullParser, "minimumUpdatePeriod", -9223372036854775807L) : -9223372036854775807L;
        long i24 = equals ? i(xmlPullParser, "timeShiftBufferDepth", -9223372036854775807L) : -9223372036854775807L;
        long i25 = equals ? i(xmlPullParser, "suggestedPresentationDelay", -9223372036854775807L) : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "publishTime");
        long V2 = attributeValue3 == null ? -9223372036854775807L : m0.V(attributeValue3);
        long j28 = equals ? 0L : -9223372036854775807L;
        ArrayList r10 = h9.o.r(new b(z10 ? 1 : TLObject.FLAG_31, 1, uri.toString(), uri.toString()));
        ArrayList arrayList29 = new ArrayList();
        ArrayList arrayList30 = new ArrayList();
        long j29 = equals ? -9223372036854775807L : 0L;
        boolean z13 = false;
        boolean z14 = false;
        i iVar = null;
        m6 m6Var = null;
        Uri uri2 = null;
        e0 e0Var = null;
        while (true) {
            xmlPullParser.next();
            String str58 = "BaseURL";
            if (h2.a.i(xmlPullParser, "BaseURL")) {
                if (!z13) {
                    j28 = d(xmlPullParser, j28);
                    z13 = z9;
                }
                arrayList30.addAll(e(xmlPullParser, r10, z10));
                arrayList = r10;
                j3 = j27;
                arrayList2 = arrayList30;
                z11 = z10;
                i7 = i19;
                z12 = z9;
                arrayList3 = arrayList29;
            } else {
                i7 = i19;
                long j30 = j27;
                String str59 = "lang";
                if (h2.a.i(xmlPullParser, "ProgramInformation")) {
                    String attributeValue4 = xmlPullParser.getAttributeValue(str57, "moreInformationURL");
                    String str60 = attributeValue4 == null ? str57 : attributeValue4;
                    String attributeValue5 = xmlPullParser.getAttributeValue(str57, "lang");
                    String str61 = attributeValue5 == null ? str57 : attributeValue5;
                    String str62 = str57;
                    String str63 = str62;
                    String str64 = str63;
                    while (true) {
                        xmlPullParser.next();
                        if (h2.a.i(xmlPullParser, "Title")) {
                            str62 = xmlPullParser.nextText();
                        } else if (h2.a.i(xmlPullParser, "Source")) {
                            str63 = xmlPullParser.nextText();
                        } else if (h2.a.i(xmlPullParser, "Copyright")) {
                            str64 = xmlPullParser.nextText();
                        } else {
                            b(xmlPullParser);
                        }
                        String str65 = str62;
                        String str66 = str63;
                        String str67 = str64;
                        if (h2.a.h(xmlPullParser, "ProgramInformation")) {
                            i iVar2 = new i(str65, str66, str67, str60, str61);
                            arrayList = r10;
                            arrayList2 = arrayList30;
                            z11 = z10;
                            arrayList3 = arrayList29;
                            j3 = j30;
                            iVar = iVar2;
                        } else {
                            str62 = str65;
                            str63 = str66;
                            str64 = str67;
                        }
                    }
                } else {
                    String str68 = "schemeIdUri";
                    if (h2.a.i(xmlPullParser, "UTCTiming")) {
                        arrayList = r10;
                        arrayList2 = arrayList30;
                        m6Var = new m6(1, xmlPullParser.getAttributeValue(str57, "schemeIdUri"), xmlPullParser.getAttributeValue(str57, "value"));
                        z11 = z10;
                        z12 = true;
                        arrayList3 = arrayList29;
                        j3 = j30;
                    } else if (h2.a.i(xmlPullParser, "Location")) {
                        uri2 = h2.e.g(uri.toString(), xmlPullParser.nextText());
                        arrayList = r10;
                        arrayList2 = arrayList30;
                        z11 = z10;
                        arrayList3 = arrayList29;
                        j3 = j30;
                    } else {
                        if (h2.a.i(xmlPullParser, "ServiceDescription")) {
                            long j31 = j30;
                            long j32 = j31;
                            long j33 = j32;
                            float f13 = -3.4028235E38f;
                            float f14 = -3.4028235E38f;
                            while (true) {
                                xmlPullParser.next();
                                if (h2.a.i(xmlPullParser, "Latency")) {
                                    arrayList = r10;
                                    String attributeValue6 = xmlPullParser.getAttributeValue(null, "target");
                                    j31 = attributeValue6 == null ? j30 : Long.parseLong(attributeValue6);
                                    String attributeValue7 = xmlPullParser.getAttributeValue(null, "min");
                                    j32 = attributeValue7 == null ? j30 : Long.parseLong(attributeValue7);
                                    String attributeValue8 = xmlPullParser.getAttributeValue(null, "max");
                                    j33 = attributeValue8 == null ? j30 : Long.parseLong(attributeValue8);
                                } else {
                                    arrayList = r10;
                                    if (h2.a.i(xmlPullParser, "PlaybackRate")) {
                                        String attributeValue9 = xmlPullParser.getAttributeValue(null, "min");
                                        f13 = attributeValue9 == null ? -3.4028235E38f : Float.parseFloat(attributeValue9);
                                        String attributeValue10 = xmlPullParser.getAttributeValue(null, "max");
                                        f14 = attributeValue10 == null ? -3.4028235E38f : Float.parseFloat(attributeValue10);
                                    }
                                }
                                long j34 = j31;
                                long j35 = j28;
                                long j36 = j32;
                                long j37 = i24;
                                long j38 = j33;
                                if (h2.a.h(xmlPullParser, "ServiceDescription")) {
                                    e0 e0Var2 = new e0();
                                    e0Var2.a = j34;
                                    e0Var2.b = j36;
                                    e0Var2.c = j38;
                                    e0Var2.d = f13;
                                    e0Var2.e = f14;
                                    e0Var = e0Var2;
                                    z11 = z10;
                                    j3 = j30;
                                    j28 = j35;
                                    j10 = j37;
                                    z12 = true;
                                    arrayList2 = arrayList30;
                                    arrayList3 = arrayList29;
                                } else {
                                    j33 = j38;
                                    i24 = j37;
                                    r10 = arrayList;
                                    j32 = j36;
                                    j28 = j35;
                                    j31 = j34;
                                }
                            }
                        } else {
                            arrayList = r10;
                            long j39 = j28;
                            long j40 = i24;
                            if (!h2.a.i(xmlPullParser, "Period") || z14) {
                                z11 = z10;
                                j3 = j30;
                                j10 = j40;
                                z12 = true;
                                j11 = j29;
                                j12 = j39;
                                arrayList2 = arrayList30;
                                arrayList3 = arrayList29;
                                b(xmlPullParser);
                            } else {
                                ArrayList arrayList31 = !arrayList30.isEmpty() ? arrayList30 : arrayList;
                                String str69 = "id";
                                String attributeValue11 = xmlPullParser.getAttributeValue(null, "id");
                                long i26 = i(xmlPullParser, "start", j29);
                                String str70 = "duration";
                                long j41 = V != j30 ? V + i26 : j30;
                                long i27 = i(xmlPullParser, "duration", j30);
                                ArrayList arrayList32 = new ArrayList();
                                ArrayList arrayList33 = new ArrayList();
                                ArrayList arrayList34 = new ArrayList();
                                long j42 = j30;
                                String str71 = "value";
                                String str72 = "Period";
                                int i28 = i7;
                                long j43 = j39;
                                s sVar = null;
                                while (true) {
                                    xmlPullParser.next();
                                    if (h2.a.i(xmlPullParser, str58)) {
                                        if (i28 == 0) {
                                            j43 = d(xmlPullParser, j43);
                                            i28 = 1;
                                        }
                                        arrayList34.addAll(e(xmlPullParser, arrayList31, z10));
                                        arrayList4 = arrayList31;
                                        str = str59;
                                        str4 = str69;
                                        str2 = str58;
                                        str5 = str70;
                                        arrayList5 = arrayList34;
                                        z11 = z10;
                                        j13 = i27;
                                        j10 = j40;
                                        j14 = j41;
                                        arrayList7 = arrayList32;
                                        arrayList6 = arrayList33;
                                        str6 = str72;
                                        z12 = true;
                                        j3 = -9223372036854775807L;
                                        j11 = j29;
                                        str3 = str68;
                                        j12 = j39;
                                        arrayList2 = arrayList30;
                                    } else {
                                        long j44 = j43;
                                        String str73 = str68;
                                        if (h2.a.i(xmlPullParser, "AdaptationSet")) {
                                            if (arrayList34.isEmpty()) {
                                                arrayList8 = arrayList31;
                                                arrayList4 = arrayList8;
                                            } else {
                                                arrayList4 = arrayList31;
                                                arrayList8 = arrayList34;
                                            }
                                            String attributeValue12 = xmlPullParser.getAttributeValue(null, str69);
                                            long parseLong = attributeValue12 == null ? -1L : Long.parseLong(attributeValue12);
                                            int g10 = g(xmlPullParser);
                                            String str74 = "SegmentTemplate";
                                            String attributeValue13 = xmlPullParser.getAttributeValue(null, "mimeType");
                                            String str75 = "AdaptationSet";
                                            ArrayList arrayList35 = arrayList30;
                                            String attributeValue14 = xmlPullParser.getAttributeValue(null, "codecs");
                                            long j45 = j29;
                                            String attributeValue15 = xmlPullParser.getAttributeValue(null, "scte214:supplementalCodecs");
                                            String attributeValue16 = xmlPullParser.getAttributeValue(null, "scte214:supplementalProfiles");
                                            String str76 = str70;
                                            String attributeValue17 = xmlPullParser.getAttributeValue(null, "width");
                                            int parseInt5 = attributeValue17 == null ? -1 : Integer.parseInt(attributeValue17);
                                            arrayList5 = arrayList34;
                                            String attributeValue18 = xmlPullParser.getAttributeValue(null, "height");
                                            int parseInt6 = attributeValue18 == null ? -1 : Integer.parseInt(attributeValue18);
                                            float j46 = j(xmlPullParser, -1.0f);
                                            String str77 = "SegmentList";
                                            String str78 = "SegmentBase";
                                            String attributeValue19 = xmlPullParser.getAttributeValue(null, "audioSamplingRate");
                                            int parseInt7 = attributeValue19 == null ? -1 : Integer.parseInt(attributeValue19);
                                            String attributeValue20 = xmlPullParser.getAttributeValue(null, str59);
                                            String str79 = "audioSamplingRate";
                                            String attributeValue21 = xmlPullParser.getAttributeValue(null, "label");
                                            ArrayList arrayList36 = new ArrayList();
                                            String str80 = attributeValue21;
                                            ArrayList arrayList37 = new ArrayList();
                                            ArrayList arrayList38 = new ArrayList();
                                            ArrayList arrayList39 = new ArrayList();
                                            float f15 = j46;
                                            ArrayList arrayList40 = new ArrayList();
                                            String str81 = "height";
                                            ArrayList arrayList41 = new ArrayList();
                                            String str82 = "width";
                                            ArrayList arrayList42 = new ArrayList();
                                            String str83 = "scte214:supplementalProfiles";
                                            ArrayList arrayList43 = new ArrayList();
                                            ArrayList arrayList44 = new ArrayList();
                                            String str84 = "codecs";
                                            String str85 = "mimeType";
                                            ArrayList arrayList45 = arrayList39;
                                            int i29 = i7;
                                            s sVar2 = sVar;
                                            long j47 = j42;
                                            long j48 = j44;
                                            String str86 = attributeValue20;
                                            int i30 = -1;
                                            String str87 = "scte214:supplementalCodecs";
                                            int i31 = g10;
                                            String str88 = null;
                                            while (true) {
                                                xmlPullParser.next();
                                                if (h2.a.i(xmlPullParser, str58)) {
                                                    if (i29 == 0) {
                                                        j48 = d(xmlPullParser, j48);
                                                        i29 = 1;
                                                    }
                                                    j19 = j48;
                                                    arrayList44.addAll(e(xmlPullParser, arrayList8, z10));
                                                } else {
                                                    j19 = j48;
                                                    if (h2.a.i(xmlPullParser, "ContentProtection")) {
                                                        Pair f16 = f(xmlPullParser);
                                                        Object obj = f16.first;
                                                        if (obj != null) {
                                                            str88 = (String) obj;
                                                        }
                                                        Object obj2 = f16.second;
                                                        if (obj2 != null) {
                                                            arrayList37.add((e2.q) obj2);
                                                        }
                                                    } else if (h2.a.i(xmlPullParser, "ContentComponent")) {
                                                        String attributeValue22 = xmlPullParser.getAttributeValue(null, str59);
                                                        if (str86 == null) {
                                                            str86 = attributeValue22;
                                                        } else if (attributeValue22 != null) {
                                                            ia.p(str86.equals(attributeValue22));
                                                        }
                                                        int g11 = g(xmlPullParser);
                                                        if (i31 == -1) {
                                                            i31 = g11;
                                                        } else if (g11 != -1) {
                                                            ia.p(i31 == g11 ? 1 : i7);
                                                        }
                                                    } else {
                                                        if (h2.a.i(xmlPullParser, "Role")) {
                                                            arrayList40.add(h(xmlPullParser, "Role"));
                                                            str13 = str69;
                                                            str23 = str86;
                                                            i10 = i31;
                                                            str2 = str58;
                                                            arrayList9 = arrayList37;
                                                            arrayList7 = arrayList32;
                                                            arrayList6 = arrayList33;
                                                            str24 = str74;
                                                            str14 = str75;
                                                            str26 = attributeValue15;
                                                            str15 = str76;
                                                            str22 = str77;
                                                            str25 = str78;
                                                            str16 = str79;
                                                            arrayList16 = arrayList38;
                                                            str17 = str82;
                                                            str18 = str83;
                                                            arrayList14 = arrayList43;
                                                            str19 = str85;
                                                            arrayList10 = arrayList44;
                                                            arrayList15 = arrayList42;
                                                            z11 = z10;
                                                            j21 = i27;
                                                            j11 = j45;
                                                            str21 = str87;
                                                            arrayList11 = arrayList41;
                                                            str27 = str59;
                                                        } else {
                                                            String str89 = "AudioChannelConfiguration";
                                                            if (h2.a.i(xmlPullParser, "AudioChannelConfiguration")) {
                                                                str13 = str69;
                                                                str23 = str86;
                                                                str2 = str58;
                                                                arrayList9 = arrayList37;
                                                                i30 = c(xmlPullParser, attributeValue14);
                                                                arrayList7 = arrayList32;
                                                                arrayList6 = arrayList33;
                                                                str24 = str74;
                                                                str26 = attributeValue15;
                                                                str15 = str76;
                                                                str22 = str77;
                                                                str25 = str78;
                                                                str16 = str79;
                                                                arrayList16 = arrayList38;
                                                                str17 = str82;
                                                                str18 = str83;
                                                                arrayList14 = arrayList43;
                                                                str19 = str85;
                                                                arrayList10 = arrayList44;
                                                                arrayList15 = arrayList42;
                                                                z11 = z10;
                                                                j21 = i27;
                                                                j11 = j45;
                                                                str21 = str87;
                                                                arrayList11 = arrayList41;
                                                                str27 = str59;
                                                                str29 = str75;
                                                                i11 = i31;
                                                                arrayList12 = arrayList8;
                                                                j12 = j39;
                                                                j14 = j41;
                                                                arrayList2 = arrayList35;
                                                                str20 = attributeValue14;
                                                                arrayList13 = arrayList40;
                                                                j10 = j40;
                                                                if (h2.a.h(xmlPullParser, str29)) {
                                                                    arrayList38 = arrayList16;
                                                                    str59 = str27;
                                                                    str78 = str25;
                                                                    arrayList35 = arrayList2;
                                                                    j39 = j12;
                                                                    attributeValue14 = str20;
                                                                    i31 = i11;
                                                                    arrayList42 = arrayList15;
                                                                    arrayList44 = arrayList10;
                                                                    str87 = str21;
                                                                    arrayList37 = arrayList9;
                                                                    str85 = str19;
                                                                    str79 = str16;
                                                                    str58 = str2;
                                                                    arrayList43 = arrayList14;
                                                                    str76 = str15;
                                                                    str69 = str13;
                                                                    str75 = str29;
                                                                    str77 = str22;
                                                                    attributeValue15 = str26;
                                                                    arrayList41 = arrayList11;
                                                                    str83 = str18;
                                                                    j45 = j11;
                                                                    i27 = j21;
                                                                    str82 = str17;
                                                                    arrayList32 = arrayList7;
                                                                    arrayList33 = arrayList6;
                                                                    boolean z15 = z11;
                                                                    str74 = str24;
                                                                    j48 = j19;
                                                                    long j49 = j14;
                                                                    arrayList8 = arrayList12;
                                                                    j40 = j10;
                                                                    arrayList40 = arrayList13;
                                                                    z10 = z15;
                                                                    str86 = str23;
                                                                    j41 = j49;
                                                                } else {
                                                                    ArrayList arrayList46 = new ArrayList(arrayList14.size());
                                                                    int i32 = i7;
                                                                    while (i32 < arrayList14.size()) {
                                                                        ArrayList arrayList47 = arrayList14;
                                                                        d dVar = (d) arrayList47.get(i32);
                                                                        t a10 = dVar.a.a();
                                                                        if (str80 == null || !arrayList36.isEmpty()) {
                                                                            str53 = str80;
                                                                            a10.c = i0.q(arrayList36);
                                                                        } else {
                                                                            str53 = str80;
                                                                            a10.b = str53;
                                                                        }
                                                                        String str90 = dVar.d;
                                                                        if (str90 == null) {
                                                                            str90 = str88;
                                                                        }
                                                                        ArrayList arrayList48 = dVar.e;
                                                                        ArrayList arrayList49 = arrayList9;
                                                                        arrayList48.addAll(arrayList49);
                                                                        if (arrayList48.isEmpty()) {
                                                                            i18 = i32;
                                                                            arrayList28 = arrayList47;
                                                                            j26 = j14;
                                                                            str80 = str53;
                                                                            str54 = str27;
                                                                        } else {
                                                                            i18 = i32;
                                                                            arrayList28 = arrayList47;
                                                                            int i33 = i7;
                                                                            while (true) {
                                                                                if (i33 < arrayList48.size()) {
                                                                                    e2.q qVar = (e2.q) arrayList48.get(i33);
                                                                                    j26 = j14;
                                                                                    if (!e2.l.d.equals(qVar.b) || (str55 = qVar.c) == null) {
                                                                                        i33++;
                                                                                        j14 = j26;
                                                                                    } else {
                                                                                        arrayList48.remove(i33);
                                                                                    }
                                                                                } else {
                                                                                    j26 = j14;
                                                                                    str55 = null;
                                                                                }
                                                                            }
                                                                            if (str55 != null) {
                                                                                int i34 = i7;
                                                                                while (i34 < arrayList48.size()) {
                                                                                    e2.q qVar2 = (e2.q) arrayList48.get(i34);
                                                                                    String str91 = str53;
                                                                                    if (e2.l.c.equals(qVar2.b) && qVar2.c == null) {
                                                                                        str56 = str27;
                                                                                        arrayList48.set(i34, new e2.q(e2.l.d, str55, qVar2.d, qVar2.e));
                                                                                    } else {
                                                                                        str56 = str27;
                                                                                    }
                                                                                    i34++;
                                                                                    str53 = str91;
                                                                                    str27 = str56;
                                                                                }
                                                                            }
                                                                            str80 = str53;
                                                                            str54 = str27;
                                                                            for (int size = arrayList48.size() - 1; size >= 0; size--) {
                                                                                e2.q qVar3 = (e2.q) arrayList48.get(size);
                                                                                if (qVar3.e == null) {
                                                                                    int i35 = i7;
                                                                                    while (true) {
                                                                                        if (i35 < arrayList48.size()) {
                                                                                            e2.q qVar4 = (e2.q) arrayList48.get(i35);
                                                                                            if (qVar4.e != null && qVar3.e == null && qVar4.a(qVar3.b)) {
                                                                                                arrayList48.remove(size);
                                                                                            } else {
                                                                                                i35++;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            a10.v = new e2.r(str90, arrayList48);
                                                                        }
                                                                        ArrayList arrayList50 = dVar.f;
                                                                        arrayList50.addAll(arrayList16);
                                                                        u uVar = new u(a10);
                                                                        i0 i0Var = dVar.b;
                                                                        s sVar3 = dVar.c;
                                                                        ArrayList arrayList51 = dVar.g;
                                                                        ArrayList arrayList52 = dVar.h;
                                                                        if (sVar3 instanceof r) {
                                                                            kVar = new l(uVar, i0Var, (r) sVar3, arrayList50, arrayList51, arrayList52);
                                                                        } else {
                                                                            if (!(sVar3 instanceof n)) {
                                                                                throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
                                                                            }
                                                                            kVar = new k(uVar, i0Var, (n) sVar3, arrayList50, arrayList51, arrayList52);
                                                                        }
                                                                        arrayList46.add(kVar);
                                                                        i32 = i18 + 1;
                                                                        arrayList9 = arrayList49;
                                                                        arrayList14 = arrayList28;
                                                                        str27 = str54;
                                                                        j14 = j26;
                                                                    }
                                                                    str = str27;
                                                                    z12 = true;
                                                                    arrayList7.add(new a(parseLong, i11, arrayList46, arrayList45, arrayList11, arrayList15));
                                                                    j13 = j21;
                                                                    str3 = str73;
                                                                    str5 = str15;
                                                                    str4 = str13;
                                                                }
                                                            } else {
                                                                String str92 = str59;
                                                                if (h2.a.i(xmlPullParser, "Accessibility")) {
                                                                    arrayList45.add(h(xmlPullParser, "Accessibility"));
                                                                } else if (h2.a.i(xmlPullParser, "EssentialProperty")) {
                                                                    arrayList41.add(h(xmlPullParser, "EssentialProperty"));
                                                                } else {
                                                                    arrayList9 = arrayList37;
                                                                    if (h2.a.i(xmlPullParser, "SupplementalProperty")) {
                                                                        arrayList42.add(h(xmlPullParser, "SupplementalProperty"));
                                                                        str13 = str69;
                                                                        str23 = str86;
                                                                        i10 = i31;
                                                                        str2 = str58;
                                                                        arrayList7 = arrayList32;
                                                                        arrayList6 = arrayList33;
                                                                        str24 = str74;
                                                                        str14 = str75;
                                                                        str26 = attributeValue15;
                                                                        str15 = str76;
                                                                        str22 = str77;
                                                                        str25 = str78;
                                                                        str16 = str79;
                                                                        arrayList16 = arrayList38;
                                                                        str17 = str82;
                                                                        str18 = str83;
                                                                        arrayList14 = arrayList43;
                                                                        str19 = str85;
                                                                        arrayList10 = arrayList44;
                                                                        arrayList15 = arrayList42;
                                                                        z11 = z10;
                                                                        j21 = i27;
                                                                        j11 = j45;
                                                                        str21 = str87;
                                                                        str27 = str92;
                                                                        arrayList11 = arrayList41;
                                                                    } else {
                                                                        String str93 = "SupplementalProperty";
                                                                        String str94 = "Representation";
                                                                        if (h2.a.i(xmlPullParser, "Representation")) {
                                                                            if (arrayList44.isEmpty()) {
                                                                                str30 = "InbandEventStream";
                                                                                arrayList17 = arrayList8;
                                                                            } else {
                                                                                str30 = "InbandEventStream";
                                                                                arrayList17 = arrayList44;
                                                                            }
                                                                            String str95 = "EssentialProperty";
                                                                            String str96 = "ContentProtection";
                                                                            String attributeValue23 = xmlPullParser.getAttributeValue(null, str69);
                                                                            String str97 = str69;
                                                                            String attributeValue24 = xmlPullParser.getAttributeValue(null, "bandwidth");
                                                                            if (attributeValue24 == null) {
                                                                                String str98 = str85;
                                                                                str31 = attributeValue23;
                                                                                str32 = str98;
                                                                                parseInt = -1;
                                                                            } else {
                                                                                parseInt = Integer.parseInt(attributeValue24);
                                                                                String str99 = str85;
                                                                                str31 = attributeValue23;
                                                                                str32 = str99;
                                                                            }
                                                                            String attributeValue25 = xmlPullParser.getAttributeValue(null, str32);
                                                                            String str100 = str84;
                                                                            int i36 = parseInt;
                                                                            String str101 = attributeValue25 == null ? attributeValue13 : attributeValue25;
                                                                            String attributeValue26 = xmlPullParser.getAttributeValue(null, str100);
                                                                            String str102 = str87;
                                                                            String str103 = str100;
                                                                            str19 = str32;
                                                                            String str104 = attributeValue26 == null ? attributeValue14 : attributeValue26;
                                                                            String attributeValue27 = xmlPullParser.getAttributeValue(null, str102);
                                                                            String str105 = str83;
                                                                            str21 = str102;
                                                                            String str106 = attributeValue27 == null ? attributeValue15 : attributeValue27;
                                                                            String attributeValue28 = xmlPullParser.getAttributeValue(null, str105);
                                                                            String str107 = str82;
                                                                            str18 = str105;
                                                                            String str108 = attributeValue28 == null ? attributeValue16 : attributeValue28;
                                                                            String attributeValue29 = xmlPullParser.getAttributeValue(null, str107);
                                                                            if (attributeValue29 == null) {
                                                                                String str109 = str81;
                                                                                str33 = str107;
                                                                                str34 = str109;
                                                                                parseInt2 = parseInt5;
                                                                            } else {
                                                                                String str110 = str81;
                                                                                str33 = str107;
                                                                                str34 = str110;
                                                                                parseInt2 = Integer.parseInt(attributeValue29);
                                                                            }
                                                                            String attributeValue30 = xmlPullParser.getAttributeValue(null, str34);
                                                                            if (attributeValue30 == null) {
                                                                                float f17 = f15;
                                                                                str35 = str34;
                                                                                f10 = f17;
                                                                                parseInt3 = parseInt6;
                                                                            } else {
                                                                                float f18 = f15;
                                                                                str35 = str34;
                                                                                f10 = f18;
                                                                                parseInt3 = Integer.parseInt(attributeValue30);
                                                                            }
                                                                            String str111 = str86;
                                                                            float j50 = j(xmlPullParser, f10);
                                                                            float f19 = f10;
                                                                            String str112 = str79;
                                                                            String attributeValue31 = xmlPullParser.getAttributeValue(null, str112);
                                                                            int parseInt8 = attributeValue31 == null ? parseInt7 : Integer.parseInt(attributeValue31);
                                                                            ArrayList arrayList53 = new ArrayList();
                                                                            ArrayList arrayList54 = new ArrayList();
                                                                            ArrayList arrayList55 = new ArrayList(arrayList41);
                                                                            ArrayList arrayList56 = arrayList41;
                                                                            ArrayList arrayList57 = new ArrayList(arrayList42);
                                                                            ArrayList arrayList58 = new ArrayList();
                                                                            ArrayList arrayList59 = arrayList55;
                                                                            str16 = str112;
                                                                            String str113 = attributeValue14;
                                                                            int i37 = i31;
                                                                            int i38 = i7;
                                                                            s sVar4 = sVar2;
                                                                            long j51 = j47;
                                                                            int i39 = i30;
                                                                            long j52 = j19;
                                                                            String str114 = null;
                                                                            while (true) {
                                                                                xmlPullParser.next();
                                                                                if (h2.a.i(xmlPullParser, str58)) {
                                                                                    if (i38 == 0) {
                                                                                        j52 = d(xmlPullParser, j52);
                                                                                        i38 = 1;
                                                                                    }
                                                                                    f11 = j50;
                                                                                    arrayList58.addAll(e(xmlPullParser, arrayList17, z10));
                                                                                } else {
                                                                                    f11 = j50;
                                                                                    if (h2.a.i(xmlPullParser, str89)) {
                                                                                        i39 = c(xmlPullParser, str104);
                                                                                    } else {
                                                                                        String str115 = str78;
                                                                                        if (h2.a.i(xmlPullParser, str115)) {
                                                                                            arrayList18 = arrayList58;
                                                                                            sVar4 = o(xmlPullParser, (r) sVar4);
                                                                                            str37 = str115;
                                                                                            str2 = str58;
                                                                                            arrayList19 = arrayList17;
                                                                                            str38 = str89;
                                                                                            arrayList7 = arrayList32;
                                                                                            arrayList6 = arrayList33;
                                                                                            str44 = str74;
                                                                                            str39 = str75;
                                                                                            str15 = str76;
                                                                                            str36 = str77;
                                                                                            i12 = parseInt8;
                                                                                            str17 = str33;
                                                                                            arrayList20 = arrayList43;
                                                                                            i13 = i36;
                                                                                            str40 = str92;
                                                                                            str46 = str93;
                                                                                            str41 = str95;
                                                                                            str13 = str97;
                                                                                            str42 = str111;
                                                                                            i14 = i37;
                                                                                            arrayList21 = arrayList53;
                                                                                            i15 = i39;
                                                                                            f12 = f11;
                                                                                            arrayList10 = arrayList44;
                                                                                            arrayList22 = arrayList42;
                                                                                            z11 = z10;
                                                                                            str43 = str104;
                                                                                            str84 = str103;
                                                                                            str81 = str35;
                                                                                            str45 = str30;
                                                                                            f15 = f19;
                                                                                            str48 = str114;
                                                                                            arrayList23 = arrayList54;
                                                                                            arrayList25 = arrayList59;
                                                                                            j25 = j51;
                                                                                            str47 = str94;
                                                                                            arrayList26 = arrayList57;
                                                                                            arrayList12 = arrayList8;
                                                                                            j12 = j39;
                                                                                            j23 = j41;
                                                                                            arrayList2 = arrayList35;
                                                                                            str20 = str113;
                                                                                            arrayList24 = arrayList40;
                                                                                            j24 = i27;
                                                                                            j10 = j40;
                                                                                            j11 = j45;
                                                                                            arrayList11 = arrayList56;
                                                                                            if (h2.a.h(xmlPullParser, str47)) {
                                                                                                if (s0.i(str101)) {
                                                                                                    if (str43 != null) {
                                                                                                        String[] d02 = m0.d0(str43);
                                                                                                        int length2 = d02.length;
                                                                                                        for (int i40 = i7; i40 < length2; i40++) {
                                                                                                            d2 = s0.d(d02[i40]);
                                                                                                            if (d2 != null && s0.i(d2)) {
                                                                                                                str49 = d2;
                                                                                                                str50 = str101;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    d2 = null;
                                                                                                    str49 = d2;
                                                                                                    str50 = str101;
                                                                                                } else if (s0.m(str101)) {
                                                                                                    if (str43 != null) {
                                                                                                        String[] d03 = m0.d0(str43);
                                                                                                        int length3 = d03.length;
                                                                                                        for (int i41 = i7; i41 < length3; i41++) {
                                                                                                            d2 = s0.d(d03[i41]);
                                                                                                            if (d2 != null && s0.m(d2)) {
                                                                                                                str49 = d2;
                                                                                                                str50 = str101;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    d2 = null;
                                                                                                    str49 = d2;
                                                                                                    str50 = str101;
                                                                                                } else if (s0.l(str101) || s0.k(str101)) {
                                                                                                    str49 = str101;
                                                                                                    str50 = str49;
                                                                                                } else {
                                                                                                    str50 = str101;
                                                                                                    if ("application/mp4".equals(str50)) {
                                                                                                        str49 = s0.d(str43);
                                                                                                        if ("text/vtt".equals(str49)) {
                                                                                                            str49 = "application/x-mp4-vtt";
                                                                                                        }
                                                                                                    } else {
                                                                                                        str49 = null;
                                                                                                    }
                                                                                                }
                                                                                                if ("audio/eac3".equals(str49)) {
                                                                                                    int i42 = i7;
                                                                                                    while (true) {
                                                                                                        str51 = "ec+3";
                                                                                                        if (i42 < arrayList26.size()) {
                                                                                                            f fVar = (f) arrayList26.get(i42);
                                                                                                            arrayList27 = arrayList26;
                                                                                                            String str116 = fVar.a;
                                                                                                            String str117 = fVar.b;
                                                                                                            int i43 = i42;
                                                                                                            if ((!"tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str116) || !"JOC".equals(str117)) && (!"tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str116) || !"ec+3".equals(str117))) {
                                                                                                                i42 = i43 + 1;
                                                                                                                arrayList26 = arrayList27;
                                                                                                            }
                                                                                                        } else {
                                                                                                            arrayList27 = arrayList26;
                                                                                                            str49 = "audio/eac3";
                                                                                                        }
                                                                                                    }
                                                                                                    str49 = "audio/eac3-joc";
                                                                                                } else {
                                                                                                    arrayList27 = arrayList26;
                                                                                                }
                                                                                                str51 = str43;
                                                                                                String str118 = str106;
                                                                                                if (s0.j(str51, str118)) {
                                                                                                    e2.m x10 = m0.x(str51, str118, str108);
                                                                                                    String str119 = str118 != null ? str118 : str51;
                                                                                                    str49 = "video/dolby-vision";
                                                                                                    mVar = x10;
                                                                                                    str51 = str119;
                                                                                                } else {
                                                                                                    mVar = null;
                                                                                                }
                                                                                                int i44 = i7;
                                                                                                int i45 = i44;
                                                                                                while (true) {
                                                                                                    long j53 = j23;
                                                                                                    if (i44 < arrayList24.size()) {
                                                                                                        ArrayList arrayList60 = arrayList24;
                                                                                                        f fVar2 = (f) arrayList60.get(i44);
                                                                                                        String str120 = str50;
                                                                                                        if (ga.a("urn:mpeg:dash:role:2011", fVar2.a)) {
                                                                                                            String str121 = fVar2.b;
                                                                                                            i45 |= (str121 != null && (str121.equals("forced_subtitle") || str121.equals("forced-subtitle"))) ? 2 : i7;
                                                                                                        }
                                                                                                        i44++;
                                                                                                        str50 = str120;
                                                                                                        arrayList24 = arrayList60;
                                                                                                        j23 = j53;
                                                                                                    } else {
                                                                                                        ArrayList arrayList61 = arrayList24;
                                                                                                        String str122 = str50;
                                                                                                        int i46 = i7;
                                                                                                        int i47 = i46;
                                                                                                        while (i46 < arrayList61.size()) {
                                                                                                            f fVar3 = (f) arrayList61.get(i46);
                                                                                                            ArrayList arrayList62 = arrayList61;
                                                                                                            if (ga.a("urn:mpeg:dash:role:2011", fVar3.a)) {
                                                                                                                i47 |= m(fVar3.b);
                                                                                                            }
                                                                                                            i46++;
                                                                                                            arrayList61 = arrayList62;
                                                                                                        }
                                                                                                        ArrayList arrayList63 = arrayList61;
                                                                                                        int i48 = i7;
                                                                                                        int i49 = i48;
                                                                                                        while (i48 < arrayList45.size()) {
                                                                                                            ArrayList arrayList64 = arrayList45;
                                                                                                            int i50 = i48;
                                                                                                            f fVar4 = (f) arrayList64.get(i48);
                                                                                                            int i51 = i49;
                                                                                                            String str123 = fVar4.a;
                                                                                                            int i52 = i47;
                                                                                                            String str124 = fVar4.b;
                                                                                                            if (ga.a("urn:mpeg:dash:role:2011", str123)) {
                                                                                                                i17 = m(str124);
                                                                                                            } else if (ga.a("urn:tva:metadata:cs:AudioPurposeCS:2007", fVar4.a)) {
                                                                                                                if (str124 != null) {
                                                                                                                    switch (str124.hashCode()) {
                                                                                                                        case 49:
                                                                                                                            if (str124.equals("1")) {
                                                                                                                                i16 = i7;
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            i16 = -1;
                                                                                                                            break;
                                                                                                                        case 50:
                                                                                                                            if (str124.equals("2")) {
                                                                                                                                i16 = 1;
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            i16 = -1;
                                                                                                                            break;
                                                                                                                        case qs.o0 /* 51 */:
                                                                                                                            if (str124.equals("3")) {
                                                                                                                                i16 = 2;
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            i16 = -1;
                                                                                                                            break;
                                                                                                                        case qs.p0 /* 52 */:
                                                                                                                            if (str124.equals("4")) {
                                                                                                                                i16 = 3;
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            i16 = -1;
                                                                                                                            break;
                                                                                                                        case qs.q0 /* 53 */:
                                                                                                                        default:
                                                                                                                            i16 = -1;
                                                                                                                            break;
                                                                                                                        case qs.r0 /* 54 */:
                                                                                                                            if (str124.equals("6")) {
                                                                                                                                i16 = 4;
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            i16 = -1;
                                                                                                                            break;
                                                                                                                    }
                                                                                                                    switch (i16) {
                                                                                                                        case 0:
                                                                                                                            i17 = 512;
                                                                                                                            break;
                                                                                                                        case 1:
                                                                                                                            i17 = 2048;
                                                                                                                            break;
                                                                                                                        case 2:
                                                                                                                            i17 = 4;
                                                                                                                            break;
                                                                                                                        case 3:
                                                                                                                            i17 = 8;
                                                                                                                            break;
                                                                                                                        case 4:
                                                                                                                            i17 = 1;
                                                                                                                            break;
                                                                                                                    }
                                                                                                                }
                                                                                                                i17 = i7;
                                                                                                            } else {
                                                                                                                i49 = i51;
                                                                                                                i48 = i50 + 1;
                                                                                                                arrayList45 = arrayList64;
                                                                                                                i47 = i52;
                                                                                                            }
                                                                                                            i49 = i51 | i17;
                                                                                                            i48 = i50 + 1;
                                                                                                            arrayList45 = arrayList64;
                                                                                                            i47 = i52;
                                                                                                        }
                                                                                                        ArrayList arrayList65 = arrayList45;
                                                                                                        int n10 = i47 | i49 | n(arrayList25) | n(arrayList27);
                                                                                                        int i53 = i7;
                                                                                                        while (true) {
                                                                                                            if (i53 < arrayList25.size()) {
                                                                                                                f fVar5 = (f) arrayList25.get(i53);
                                                                                                                int i54 = i53;
                                                                                                                if ((ga.a("http://dashif.org/thumbnail_tile", fVar5.a) || ga.a("http://dashif.org/guidelines/thumbnail_tile", fVar5.a)) && (str52 = fVar5.b) != null) {
                                                                                                                    String str125 = m0.a;
                                                                                                                    String[] split = str52.split("x", -1);
                                                                                                                    if (split.length != 2) {
                                                                                                                        continue;
                                                                                                                    } else {
                                                                                                                        try {
                                                                                                                            pair = Pair.create(Integer.valueOf(Integer.parseInt(split[i7])), Integer.valueOf(Integer.parseInt(split[1])));
                                                                                                                        } catch (NumberFormatException unused) {
                                                                                                                            continue;
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                i53 = i54 + 1;
                                                                                                            } else {
                                                                                                                pair = null;
                                                                                                            }
                                                                                                        }
                                                                                                        t tVar = new t();
                                                                                                        tVar.a = str31;
                                                                                                        tVar.q = s0.n(str122);
                                                                                                        tVar.r = s0.n(str49);
                                                                                                        tVar.j = str51;
                                                                                                        tVar.i = i13;
                                                                                                        tVar.e = i45;
                                                                                                        tVar.f = n10;
                                                                                                        tVar.H = mVar;
                                                                                                        String str126 = str42;
                                                                                                        tVar.d = str126;
                                                                                                        tVar.Q = pair != null ? ((Integer) pair.first).intValue() : -1;
                                                                                                        tVar.R = pair != null ? ((Integer) pair.second).intValue() : -1;
                                                                                                        if (s0.m(str49)) {
                                                                                                            tVar.y = parseInt2;
                                                                                                            tVar.z = parseInt3;
                                                                                                            tVar.C = f12;
                                                                                                        } else {
                                                                                                            int i55 = parseInt2;
                                                                                                            int i56 = parseInt3;
                                                                                                            if (s0.i(str49)) {
                                                                                                                tVar.J = i15;
                                                                                                                tVar.K = i12;
                                                                                                            } else if (s0.l(str49)) {
                                                                                                                if ("application/cea-608".equals(str49)) {
                                                                                                                    for (int i57 = i7; i57 < arrayList65.size(); i57++) {
                                                                                                                        f fVar6 = (f) arrayList65.get(i57);
                                                                                                                        String str127 = fVar6.a;
                                                                                                                        String str128 = fVar6.b;
                                                                                                                        if ("urn:scte:dash:cc:cea-608:2015".equals(str127) && str128 != null) {
                                                                                                                            Matcher matcher = c.matcher(str128);
                                                                                                                            if (matcher.matches()) {
                                                                                                                                parseInt4 = Integer.parseInt(matcher.group(1));
                                                                                                                                tVar.O = parseInt4;
                                                                                                                            } else {
                                                                                                                                h2.a.l("MpdParser", "Unable to parse CEA-608 channel number from: ".concat(str128));
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    parseInt4 = -1;
                                                                                                                    tVar.O = parseInt4;
                                                                                                                } else {
                                                                                                                    if ("application/cea-708".equals(str49)) {
                                                                                                                        for (int i58 = i7; i58 < arrayList65.size(); i58++) {
                                                                                                                            f fVar7 = (f) arrayList65.get(i58);
                                                                                                                            String str129 = fVar7.a;
                                                                                                                            String str130 = fVar7.b;
                                                                                                                            if ("urn:scte:dash:cc:cea-708:2015".equals(str129) && str130 != null) {
                                                                                                                                Matcher matcher2 = d.matcher(str130);
                                                                                                                                if (matcher2.matches()) {
                                                                                                                                    parseInt4 = Integer.parseInt(matcher2.group(1));
                                                                                                                                    tVar.O = parseInt4;
                                                                                                                                } else {
                                                                                                                                    h2.a.l("MpdParser", "Unable to parse CEA-708 service block number from: ".concat(str130));
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    parseInt4 = -1;
                                                                                                                    tVar.O = parseInt4;
                                                                                                                }
                                                                                                                str6 = str72;
                                                                                                                j43 = j44;
                                                                                                            } else if (s0.k(str49)) {
                                                                                                                tVar.y = i55;
                                                                                                                tVar.z = i56;
                                                                                                            }
                                                                                                        }
                                                                                                        u uVar2 = new u(tVar);
                                                                                                        d dVar2 = new d(uVar2, !arrayList18.isEmpty() ? arrayList18 : arrayList19, sVar4 != null ? sVar4 : new r(null, 1L, 0L, 0L, 0L), str48, arrayList21, arrayList23, arrayList25, arrayList27);
                                                                                                        int h = s0.h(uVar2.s);
                                                                                                        int i59 = i14;
                                                                                                        if (i59 != -1) {
                                                                                                            if (h != -1) {
                                                                                                                ia.p(i59 == h ? 1 : i7);
                                                                                                            }
                                                                                                            h = i59;
                                                                                                        }
                                                                                                        ArrayList arrayList66 = arrayList20;
                                                                                                        arrayList66.add(dVar2);
                                                                                                        str23 = str126;
                                                                                                        arrayList45 = arrayList65;
                                                                                                        arrayList14 = arrayList66;
                                                                                                        arrayList13 = arrayList63;
                                                                                                        str26 = attributeValue15;
                                                                                                        arrayList16 = arrayList38;
                                                                                                        j14 = j53;
                                                                                                        str27 = str40;
                                                                                                        str29 = str39;
                                                                                                        str22 = str36;
                                                                                                        str25 = str37;
                                                                                                        str24 = str44;
                                                                                                        arrayList15 = arrayList22;
                                                                                                        j21 = j24;
                                                                                                        i11 = h;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                arrayList57 = arrayList26;
                                                                                                arrayList54 = arrayList23;
                                                                                                i39 = i15;
                                                                                                str94 = str47;
                                                                                                str30 = str45;
                                                                                                str93 = str46;
                                                                                                arrayList59 = arrayList25;
                                                                                                arrayList53 = arrayList21;
                                                                                                str95 = str41;
                                                                                                str113 = str20;
                                                                                                arrayList42 = arrayList22;
                                                                                                str104 = str43;
                                                                                                str89 = str38;
                                                                                                arrayList56 = arrayList11;
                                                                                                arrayList44 = arrayList10;
                                                                                                arrayList58 = arrayList18;
                                                                                                j51 = j25;
                                                                                                f19 = f15;
                                                                                                str35 = str81;
                                                                                                str103 = str84;
                                                                                                str114 = str48;
                                                                                                str58 = str2;
                                                                                                arrayList17 = arrayList19;
                                                                                                i37 = i14;
                                                                                                arrayList32 = arrayList7;
                                                                                                arrayList33 = arrayList6;
                                                                                                arrayList43 = arrayList20;
                                                                                                str111 = str42;
                                                                                                i36 = i13;
                                                                                                parseInt8 = i12;
                                                                                                str92 = str40;
                                                                                                str76 = str15;
                                                                                                str77 = str36;
                                                                                                str78 = str37;
                                                                                                str97 = str13;
                                                                                                j45 = j11;
                                                                                                str33 = str17;
                                                                                                i27 = j24;
                                                                                                str75 = str39;
                                                                                                arrayList35 = arrayList2;
                                                                                                j39 = j12;
                                                                                                long j54 = j23;
                                                                                                arrayList8 = arrayList12;
                                                                                                j40 = j10;
                                                                                                arrayList40 = arrayList24;
                                                                                                z10 = z11;
                                                                                                j50 = f12;
                                                                                                str74 = str44;
                                                                                                j41 = j54;
                                                                                            }
                                                                                        } else {
                                                                                            arrayList18 = arrayList58;
                                                                                            String str131 = str77;
                                                                                            if (h2.a.i(xmlPullParser, str131)) {
                                                                                                arrayList10 = arrayList44;
                                                                                                str2 = str58;
                                                                                                long d10 = d(xmlPullParser, j51);
                                                                                                str36 = str131;
                                                                                                str37 = str115;
                                                                                                arrayList19 = arrayList17;
                                                                                                str38 = str89;
                                                                                                long j55 = j41;
                                                                                                arrayList7 = arrayList32;
                                                                                                arrayList6 = arrayList33;
                                                                                                str39 = str75;
                                                                                                str15 = str76;
                                                                                                i12 = parseInt8;
                                                                                                str17 = str33;
                                                                                                arrayList20 = arrayList43;
                                                                                                i13 = i36;
                                                                                                str40 = str92;
                                                                                                str41 = str95;
                                                                                                str13 = str97;
                                                                                                str42 = str111;
                                                                                                str20 = str113;
                                                                                                i14 = i37;
                                                                                                arrayList21 = arrayList53;
                                                                                                f12 = f11;
                                                                                                arrayList22 = arrayList42;
                                                                                                arrayList24 = arrayList40;
                                                                                                str43 = str104;
                                                                                                long j56 = j40;
                                                                                                str84 = str103;
                                                                                                str81 = str35;
                                                                                                f15 = f19;
                                                                                                arrayList23 = arrayList54;
                                                                                                arrayList12 = arrayList8;
                                                                                                long j57 = i27;
                                                                                                j12 = j39;
                                                                                                arrayList2 = arrayList35;
                                                                                                j11 = j45;
                                                                                                arrayList11 = arrayList56;
                                                                                                sVar4 = p(xmlPullParser, (o) sVar4, j55, j57, j52, d10, j56);
                                                                                                j24 = j57;
                                                                                                j23 = j55;
                                                                                                j25 = d10;
                                                                                                str44 = str74;
                                                                                                str46 = str93;
                                                                                                str45 = str30;
                                                                                                str47 = str94;
                                                                                                str48 = str114;
                                                                                                i15 = i39;
                                                                                                arrayList26 = arrayList57;
                                                                                                z11 = z10;
                                                                                                j10 = j56;
                                                                                                arrayList25 = arrayList59;
                                                                                            } else {
                                                                                                str36 = str131;
                                                                                                str37 = str115;
                                                                                                arrayList10 = arrayList44;
                                                                                                str2 = str58;
                                                                                                arrayList19 = arrayList17;
                                                                                                str38 = str89;
                                                                                                arrayList7 = arrayList32;
                                                                                                arrayList6 = arrayList33;
                                                                                                String str132 = str74;
                                                                                                str39 = str75;
                                                                                                str15 = str76;
                                                                                                i12 = parseInt8;
                                                                                                str17 = str33;
                                                                                                arrayList20 = arrayList43;
                                                                                                i13 = i36;
                                                                                                str40 = str92;
                                                                                                str41 = str95;
                                                                                                str13 = str97;
                                                                                                str42 = str111;
                                                                                                i14 = i37;
                                                                                                arrayList21 = arrayList53;
                                                                                                ArrayList arrayList67 = arrayList57;
                                                                                                f12 = f11;
                                                                                                arrayList22 = arrayList42;
                                                                                                str43 = str104;
                                                                                                str84 = str103;
                                                                                                str81 = str35;
                                                                                                f15 = f19;
                                                                                                arrayList23 = arrayList54;
                                                                                                long j58 = j40;
                                                                                                arrayList12 = arrayList8;
                                                                                                j12 = j39;
                                                                                                j23 = j41;
                                                                                                arrayList2 = arrayList35;
                                                                                                str20 = str113;
                                                                                                arrayList24 = arrayList40;
                                                                                                j24 = i27;
                                                                                                j11 = j45;
                                                                                                arrayList11 = arrayList56;
                                                                                                if (h2.a.i(xmlPullParser, str132)) {
                                                                                                    j10 = j58;
                                                                                                    long d11 = d(xmlPullParser, j51);
                                                                                                    str44 = str132;
                                                                                                    z11 = z10;
                                                                                                    long j59 = j52;
                                                                                                    sVar4 = q(xmlPullParser, (p) sVar4, arrayList22, j23, j24, j59, d11, j10);
                                                                                                    j52 = j59;
                                                                                                    j23 = j23;
                                                                                                    j25 = d11;
                                                                                                } else {
                                                                                                    str44 = str132;
                                                                                                    z11 = z10;
                                                                                                    String str133 = str96;
                                                                                                    j10 = j58;
                                                                                                    if (h2.a.i(xmlPullParser, str133)) {
                                                                                                        Pair f20 = f(xmlPullParser);
                                                                                                        Object obj3 = f20.first;
                                                                                                        if (obj3 != null) {
                                                                                                            str114 = (String) obj3;
                                                                                                        }
                                                                                                        Object obj4 = f20.second;
                                                                                                        if (obj4 != null) {
                                                                                                            arrayList21.add((e2.q) obj4);
                                                                                                        }
                                                                                                        str96 = str133;
                                                                                                        j25 = j51;
                                                                                                    } else {
                                                                                                        str45 = str30;
                                                                                                        if (h2.a.i(xmlPullParser, str45)) {
                                                                                                            arrayList23.add(h(xmlPullParser, str45));
                                                                                                            str96 = str133;
                                                                                                            j25 = j51;
                                                                                                            str46 = str93;
                                                                                                            arrayList25 = arrayList59;
                                                                                                        } else if (h2.a.i(xmlPullParser, str41)) {
                                                                                                            arrayList25 = arrayList59;
                                                                                                            arrayList25.add(h(xmlPullParser, str41));
                                                                                                            str96 = str133;
                                                                                                            j25 = j51;
                                                                                                            str46 = str93;
                                                                                                        } else {
                                                                                                            str46 = str93;
                                                                                                            arrayList25 = arrayList59;
                                                                                                            if (h2.a.i(xmlPullParser, str46)) {
                                                                                                                str96 = str133;
                                                                                                                j25 = j51;
                                                                                                                arrayList26 = arrayList67;
                                                                                                                arrayList26.add(h(xmlPullParser, str46));
                                                                                                            } else {
                                                                                                                str96 = str133;
                                                                                                                j25 = j51;
                                                                                                                arrayList26 = arrayList67;
                                                                                                                b(xmlPullParser);
                                                                                                            }
                                                                                                            str47 = str94;
                                                                                                            str48 = str114;
                                                                                                            i15 = i39;
                                                                                                        }
                                                                                                        arrayList26 = arrayList67;
                                                                                                        str47 = str94;
                                                                                                        str48 = str114;
                                                                                                        i15 = i39;
                                                                                                    }
                                                                                                }
                                                                                                str46 = str93;
                                                                                                str45 = str30;
                                                                                                str47 = str94;
                                                                                                str48 = str114;
                                                                                                arrayList25 = arrayList59;
                                                                                                i15 = i39;
                                                                                                arrayList26 = arrayList67;
                                                                                            }
                                                                                            if (h2.a.h(xmlPullParser, str47)) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                str2 = str58;
                                                                                arrayList19 = arrayList17;
                                                                                str38 = str89;
                                                                                arrayList7 = arrayList32;
                                                                                arrayList6 = arrayList33;
                                                                                str44 = str74;
                                                                                str39 = str75;
                                                                                str15 = str76;
                                                                                str36 = str77;
                                                                                str37 = str78;
                                                                                i12 = parseInt8;
                                                                                str17 = str33;
                                                                                arrayList20 = arrayList43;
                                                                                i13 = i36;
                                                                                str40 = str92;
                                                                                str46 = str93;
                                                                                str41 = str95;
                                                                                str13 = str97;
                                                                                str42 = str111;
                                                                                i14 = i37;
                                                                                arrayList21 = arrayList53;
                                                                                f12 = f11;
                                                                                arrayList18 = arrayList58;
                                                                                arrayList10 = arrayList44;
                                                                                arrayList22 = arrayList42;
                                                                                z11 = z10;
                                                                                str43 = str104;
                                                                                str84 = str103;
                                                                                str81 = str35;
                                                                                str45 = str30;
                                                                                f15 = f19;
                                                                                str48 = str114;
                                                                                arrayList23 = arrayList54;
                                                                                arrayList25 = arrayList59;
                                                                                i15 = i39;
                                                                                j25 = j51;
                                                                                str47 = str94;
                                                                                arrayList26 = arrayList57;
                                                                                arrayList12 = arrayList8;
                                                                                j12 = j39;
                                                                                j23 = j41;
                                                                                arrayList2 = arrayList35;
                                                                                str20 = str113;
                                                                                arrayList24 = arrayList40;
                                                                                j24 = i27;
                                                                                j10 = j40;
                                                                                j11 = j45;
                                                                                arrayList11 = arrayList56;
                                                                                if (h2.a.h(xmlPullParser, str47)) {
                                                                                }
                                                                            }
                                                                        } else {
                                                                            str13 = str69;
                                                                            str2 = str58;
                                                                            long j60 = j41;
                                                                            arrayList7 = arrayList32;
                                                                            arrayList6 = arrayList33;
                                                                            String str134 = str74;
                                                                            str14 = str75;
                                                                            str15 = str76;
                                                                            String str135 = str77;
                                                                            str16 = str79;
                                                                            str17 = str82;
                                                                            str18 = str83;
                                                                            str19 = str85;
                                                                            str20 = attributeValue14;
                                                                            arrayList10 = arrayList44;
                                                                            ArrayList arrayList68 = arrayList42;
                                                                            z11 = z10;
                                                                            str21 = str87;
                                                                            ArrayList arrayList69 = arrayList43;
                                                                            int i60 = i31;
                                                                            long j61 = j45;
                                                                            arrayList11 = arrayList41;
                                                                            ArrayList arrayList70 = arrayList40;
                                                                            j10 = j40;
                                                                            String str136 = str78;
                                                                            arrayList12 = arrayList8;
                                                                            j12 = j39;
                                                                            arrayList2 = arrayList35;
                                                                            long j62 = i27;
                                                                            j11 = j61;
                                                                            if (h2.a.i(xmlPullParser, str136)) {
                                                                                sVar2 = o(xmlPullParser, (r) sVar2);
                                                                                str23 = str86;
                                                                                arrayList14 = arrayList69;
                                                                                arrayList13 = arrayList70;
                                                                                str26 = attributeValue15;
                                                                                arrayList16 = arrayList38;
                                                                                j14 = j60;
                                                                                str27 = str92;
                                                                                str22 = str135;
                                                                                str24 = str134;
                                                                                arrayList15 = arrayList68;
                                                                                j21 = j62;
                                                                                i11 = i60;
                                                                                str25 = str136;
                                                                            } else {
                                                                                str22 = str135;
                                                                                if (h2.a.i(xmlPullParser, str22)) {
                                                                                    long d12 = d(xmlPullParser, j47);
                                                                                    str23 = str86;
                                                                                    arrayList13 = arrayList70;
                                                                                    sVar2 = p(xmlPullParser, (o) sVar2, j60, j62, j19, d12, j10);
                                                                                    j10 = j10;
                                                                                    j14 = j60;
                                                                                    j47 = d12;
                                                                                    str26 = attributeValue15;
                                                                                    arrayList16 = arrayList38;
                                                                                    arrayList14 = arrayList69;
                                                                                    str27 = str92;
                                                                                    str29 = str14;
                                                                                    str24 = str134;
                                                                                    arrayList15 = arrayList68;
                                                                                    j21 = j62;
                                                                                    i11 = i60;
                                                                                    str25 = str136;
                                                                                } else {
                                                                                    str23 = str86;
                                                                                    arrayList13 = arrayList70;
                                                                                    long j63 = j47;
                                                                                    j20 = j19;
                                                                                    j14 = j60;
                                                                                    if (h2.a.i(xmlPullParser, str134)) {
                                                                                        long d13 = d(xmlPullParser, j63);
                                                                                        str24 = str134;
                                                                                        str25 = str136;
                                                                                        arrayList14 = arrayList69;
                                                                                        sVar2 = q(xmlPullParser, (p) sVar2, arrayList68, j14, j62, j20, d13, j10);
                                                                                        j21 = j62;
                                                                                        String str137 = attributeValue15;
                                                                                        arrayList15 = arrayList68;
                                                                                        j14 = j14;
                                                                                        str26 = str137;
                                                                                        j19 = j20;
                                                                                        j47 = d13;
                                                                                        arrayList16 = arrayList38;
                                                                                        i11 = i60;
                                                                                        str27 = str92;
                                                                                    } else {
                                                                                        str24 = str134;
                                                                                        i10 = i60;
                                                                                        String str138 = attributeValue15;
                                                                                        str25 = str136;
                                                                                        arrayList14 = arrayList69;
                                                                                        arrayList15 = arrayList68;
                                                                                        j21 = j62;
                                                                                        if (h2.a.i(xmlPullParser, "InbandEventStream")) {
                                                                                            arrayList16 = arrayList38;
                                                                                            arrayList16.add(h(xmlPullParser, "InbandEventStream"));
                                                                                            str26 = str138;
                                                                                            j22 = j63;
                                                                                            str27 = str92;
                                                                                        } else {
                                                                                            arrayList16 = arrayList38;
                                                                                            if (h2.a.i(xmlPullParser, "Label")) {
                                                                                                str26 = str138;
                                                                                                j22 = j63;
                                                                                                str27 = str92;
                                                                                                String attributeValue32 = xmlPullParser.getAttributeValue(null, str27);
                                                                                                String str139 = "";
                                                                                                while (true) {
                                                                                                    xmlPullParser.next();
                                                                                                    String str140 = str139;
                                                                                                    if (xmlPullParser.getEventType() == 4) {
                                                                                                        str28 = xmlPullParser.getText();
                                                                                                    } else {
                                                                                                        b(xmlPullParser);
                                                                                                        str28 = str140;
                                                                                                    }
                                                                                                    if (h2.a.h(xmlPullParser, "Label")) {
                                                                                                        arrayList36.add(new x(attributeValue32, str28));
                                                                                                    } else {
                                                                                                        str139 = str28;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                str26 = str138;
                                                                                                j22 = j63;
                                                                                                str27 = str92;
                                                                                                if (xmlPullParser.getEventType() == 2) {
                                                                                                    b(xmlPullParser);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        j19 = j20;
                                                                                        j47 = j22;
                                                                                        i11 = i10;
                                                                                    }
                                                                                }
                                                                            }
                                                                            str29 = str14;
                                                                        }
                                                                        if (h2.a.h(xmlPullParser, str29)) {
                                                                        }
                                                                    }
                                                                }
                                                                str13 = str69;
                                                                str23 = str86;
                                                                i10 = i31;
                                                                str2 = str58;
                                                                arrayList9 = arrayList37;
                                                                arrayList7 = arrayList32;
                                                                arrayList6 = arrayList33;
                                                                str24 = str74;
                                                                str14 = str75;
                                                                str26 = attributeValue15;
                                                                str15 = str76;
                                                                str22 = str77;
                                                                str25 = str78;
                                                                str16 = str79;
                                                                arrayList16 = arrayList38;
                                                                str17 = str82;
                                                                str18 = str83;
                                                                arrayList14 = arrayList43;
                                                                str19 = str85;
                                                                arrayList10 = arrayList44;
                                                                arrayList15 = arrayList42;
                                                                z11 = z10;
                                                                j21 = i27;
                                                                j11 = j45;
                                                                str21 = str87;
                                                                str27 = str92;
                                                                arrayList11 = arrayList41;
                                                            }
                                                        }
                                                        arrayList12 = arrayList8;
                                                        j12 = j39;
                                                        j14 = j41;
                                                        arrayList2 = arrayList35;
                                                        j22 = j47;
                                                        str20 = attributeValue14;
                                                        arrayList13 = arrayList40;
                                                        j10 = j40;
                                                        j20 = j19;
                                                        j19 = j20;
                                                        j47 = j22;
                                                        i11 = i10;
                                                        str29 = str14;
                                                        if (h2.a.h(xmlPullParser, str29)) {
                                                        }
                                                    }
                                                }
                                                str13 = str69;
                                                str23 = str86;
                                                str2 = str58;
                                                arrayList9 = arrayList37;
                                                arrayList7 = arrayList32;
                                                arrayList6 = arrayList33;
                                                str24 = str74;
                                                str26 = attributeValue15;
                                                str15 = str76;
                                                str22 = str77;
                                                str25 = str78;
                                                str16 = str79;
                                                arrayList16 = arrayList38;
                                                str17 = str82;
                                                str18 = str83;
                                                arrayList14 = arrayList43;
                                                str19 = str85;
                                                arrayList10 = arrayList44;
                                                arrayList15 = arrayList42;
                                                z11 = z10;
                                                j21 = i27;
                                                j11 = j45;
                                                str21 = str87;
                                                arrayList11 = arrayList41;
                                                str27 = str59;
                                                str29 = str75;
                                                i11 = i31;
                                                arrayList12 = arrayList8;
                                                j12 = j39;
                                                j14 = j41;
                                                arrayList2 = arrayList35;
                                                str20 = attributeValue14;
                                                arrayList13 = arrayList40;
                                                j10 = j40;
                                                if (h2.a.h(xmlPullParser, str29)) {
                                                }
                                            }
                                        } else {
                                            arrayList4 = arrayList31;
                                            str = str59;
                                            String str141 = str69;
                                            str2 = str58;
                                            String str142 = str70;
                                            arrayList5 = arrayList34;
                                            z11 = z10;
                                            long j64 = j40;
                                            long j65 = j41;
                                            ArrayList arrayList71 = arrayList32;
                                            arrayList6 = arrayList33;
                                            z12 = true;
                                            long j66 = i27;
                                            j12 = j39;
                                            arrayList2 = arrayList30;
                                            j11 = j29;
                                            if (h2.a.i(xmlPullParser, "EventStream")) {
                                                String str143 = str73;
                                                String attributeValue33 = xmlPullParser.getAttributeValue(null, str143);
                                                String str144 = attributeValue33 == null ? "" : attributeValue33;
                                                String str145 = str71;
                                                String attributeValue34 = xmlPullParser.getAttributeValue(null, str145);
                                                String str146 = attributeValue34 == null ? "" : attributeValue34;
                                                String attributeValue35 = xmlPullParser.getAttributeValue(null, "timescale");
                                                long parseLong2 = attributeValue35 == null ? 1L : Long.parseLong(attributeValue35);
                                                String attributeValue36 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
                                                long parseLong3 = attributeValue36 == null ? 0L : Long.parseLong(attributeValue36);
                                                ArrayList arrayList72 = new ArrayList();
                                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                                                while (true) {
                                                    xmlPullParser.next();
                                                    if (h2.a.i(xmlPullParser, "Event")) {
                                                        str10 = str141;
                                                        String attributeValue37 = xmlPullParser.getAttributeValue(null, str10);
                                                        long parseLong4 = attributeValue37 == null ? 0L : Long.parseLong(attributeValue37);
                                                        j16 = j64;
                                                        str9 = str142;
                                                        String attributeValue38 = xmlPullParser.getAttributeValue(null, str9);
                                                        long parseLong5 = attributeValue38 == null ? -9223372036854775807L : Long.parseLong(attributeValue38);
                                                        String attributeValue39 = xmlPullParser.getAttributeValue(null, "presentationTime");
                                                        long parseLong6 = attributeValue39 == null ? 0L : Long.parseLong(attributeValue39);
                                                        String str147 = m0.a;
                                                        RoundingMode roundingMode = RoundingMode.DOWN;
                                                        long a02 = m0.a0(parseLong5, 1000L, parseLong2, roundingMode);
                                                        long a03 = m0.a0(parseLong6 - parseLong3, 1000000L, parseLong2, roundingMode);
                                                        j17 = parseLong2;
                                                        String attributeValue40 = xmlPullParser.getAttributeValue(null, "messageData");
                                                        if (attributeValue40 == null) {
                                                            attributeValue40 = null;
                                                        }
                                                        byteArrayOutputStream.reset();
                                                        XmlSerializer newSerializer = Xml.newSerializer();
                                                        arrayList7 = arrayList71;
                                                        newSerializer.setOutput(byteArrayOutputStream, StandardCharsets.UTF_8.name());
                                                        xmlPullParser.nextToken();
                                                        while (!h2.a.h(xmlPullParser, "Event")) {
                                                            switch (xmlPullParser.getEventType()) {
                                                                case 0:
                                                                    str11 = str143;
                                                                    str12 = str145;
                                                                    j18 = parseLong3;
                                                                    newSerializer.startDocument(null, Boolean.FALSE);
                                                                    break;
                                                                case 1:
                                                                    str11 = str143;
                                                                    str12 = str145;
                                                                    j18 = parseLong3;
                                                                    newSerializer.endDocument();
                                                                    break;
                                                                case 2:
                                                                    str11 = str143;
                                                                    newSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                                                                    int i61 = i7;
                                                                    while (i61 < xmlPullParser.getAttributeCount()) {
                                                                        newSerializer.attribute(xmlPullParser.getAttributeNamespace(i61), xmlPullParser.getAttributeName(i61), xmlPullParser.getAttributeValue(i61));
                                                                        i61++;
                                                                        str145 = str145;
                                                                        parseLong3 = parseLong3;
                                                                    }
                                                                    str12 = str145;
                                                                    j18 = parseLong3;
                                                                    break;
                                                                case 3:
                                                                    str11 = str143;
                                                                    newSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                                                                    str12 = str145;
                                                                    j18 = parseLong3;
                                                                    break;
                                                                case 4:
                                                                    newSerializer.text(xmlPullParser.getText());
                                                                    str11 = str143;
                                                                    str12 = str145;
                                                                    j18 = parseLong3;
                                                                    break;
                                                                case 5:
                                                                    newSerializer.cdsect(xmlPullParser.getText());
                                                                    str11 = str143;
                                                                    str12 = str145;
                                                                    j18 = parseLong3;
                                                                    break;
                                                                case 6:
                                                                    newSerializer.entityRef(xmlPullParser.getText());
                                                                    str11 = str143;
                                                                    str12 = str145;
                                                                    j18 = parseLong3;
                                                                    break;
                                                                case 7:
                                                                    newSerializer.ignorableWhitespace(xmlPullParser.getText());
                                                                    str11 = str143;
                                                                    str12 = str145;
                                                                    j18 = parseLong3;
                                                                    break;
                                                                case 8:
                                                                    newSerializer.processingInstruction(xmlPullParser.getText());
                                                                    str11 = str143;
                                                                    str12 = str145;
                                                                    j18 = parseLong3;
                                                                    break;
                                                                case 9:
                                                                    newSerializer.comment(xmlPullParser.getText());
                                                                    str11 = str143;
                                                                    str12 = str145;
                                                                    j18 = parseLong3;
                                                                    break;
                                                                case 10:
                                                                    newSerializer.docdecl(xmlPullParser.getText());
                                                                    str11 = str143;
                                                                    str12 = str145;
                                                                    j18 = parseLong3;
                                                                    break;
                                                                default:
                                                                    str11 = str143;
                                                                    str12 = str145;
                                                                    j18 = parseLong3;
                                                                    break;
                                                            }
                                                            xmlPullParser.nextToken();
                                                            str143 = str11;
                                                            str145 = str12;
                                                            parseLong3 = j18;
                                                        }
                                                        str3 = str143;
                                                        str71 = str145;
                                                        j15 = parseLong3;
                                                        newSerializer.flush();
                                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                        Long valueOf = Long.valueOf(a03);
                                                        if (attributeValue40 != null) {
                                                            byteArray = attributeValue40.getBytes(StandardCharsets.UTF_8);
                                                        }
                                                        str7 = str144;
                                                        str8 = str146;
                                                        arrayList72.add(Pair.create(valueOf, new q3.a(str144, str146, a02, parseLong4, byteArray)));
                                                    } else {
                                                        arrayList7 = arrayList71;
                                                        str3 = str143;
                                                        str71 = str145;
                                                        j15 = parseLong3;
                                                        j16 = j64;
                                                        str7 = str144;
                                                        str8 = str146;
                                                        j17 = parseLong2;
                                                        str9 = str142;
                                                        str10 = str141;
                                                        b(xmlPullParser);
                                                    }
                                                    if (h2.a.h(xmlPullParser, "EventStream")) {
                                                        long[] jArr = new long[arrayList72.size()];
                                                        q3.a[] aVarArr = new q3.a[arrayList72.size()];
                                                        for (int i62 = i7; i62 < arrayList72.size(); i62++) {
                                                            Pair pair2 = (Pair) arrayList72.get(i62);
                                                            jArr[i62] = ((Long) pair2.first).longValue();
                                                            aVarArr[i62] = (q3.a) pair2.second;
                                                        }
                                                        arrayList6.add(new g(str7, str8, jArr, aVarArr));
                                                        str4 = str10;
                                                        str5 = str9;
                                                        j10 = j16;
                                                        j13 = j66;
                                                        j14 = j65;
                                                    } else {
                                                        str144 = str7;
                                                        str146 = str8;
                                                        str141 = str10;
                                                        str142 = str9;
                                                        j64 = j16;
                                                        str143 = str3;
                                                        str145 = str71;
                                                        parseLong2 = j17;
                                                        parseLong3 = j15;
                                                        arrayList71 = arrayList7;
                                                    }
                                                }
                                            } else {
                                                arrayList7 = arrayList71;
                                                str3 = str73;
                                                if (h2.a.i(xmlPullParser, "SegmentBase")) {
                                                    sVar = o(xmlPullParser, null);
                                                    arrayList6 = arrayList6;
                                                    str4 = str141;
                                                    str5 = str142;
                                                    j10 = j64;
                                                    j13 = j66;
                                                    str6 = str72;
                                                    j43 = j44;
                                                    j14 = j65;
                                                    j3 = -9223372036854775807L;
                                                } else if (h2.a.i(xmlPullParser, "SegmentList")) {
                                                    long d14 = d(xmlPullParser, -9223372036854775807L);
                                                    arrayList6 = arrayList6;
                                                    j3 = -9223372036854775807L;
                                                    str4 = str141;
                                                    sVar = p(xmlPullParser, null, j65, j66, j44, d14, j64);
                                                    j13 = j66;
                                                    j14 = j65;
                                                    j42 = d14;
                                                    str5 = str142;
                                                    str6 = str72;
                                                    j43 = j44;
                                                    j10 = j64;
                                                } else {
                                                    arrayList6 = arrayList6;
                                                    str4 = str141;
                                                    j13 = j66;
                                                    j14 = j65;
                                                    if (h2.a.i(xmlPullParser, "SegmentTemplate")) {
                                                        long d15 = d(xmlPullParser, -9223372036854775807L);
                                                        g0 g0Var = i0.b;
                                                        j3 = -9223372036854775807L;
                                                        str5 = str142;
                                                        j10 = j64;
                                                        sVar = q(xmlPullParser, null, t1.e, j14, j13, j44, d15, j10);
                                                        j14 = j14;
                                                        j42 = d15;
                                                    } else {
                                                        j3 = -9223372036854775807L;
                                                        str5 = str142;
                                                        j10 = j64;
                                                        if (h2.a.i(xmlPullParser, "AssetIdentifier")) {
                                                            h(xmlPullParser, "AssetIdentifier");
                                                        } else {
                                                            b(xmlPullParser);
                                                        }
                                                    }
                                                    str6 = str72;
                                                    j43 = j44;
                                                }
                                            }
                                        }
                                        j3 = -9223372036854775807L;
                                        str6 = str72;
                                        j43 = j44;
                                    }
                                    if (h2.a.h(xmlPullParser, str6)) {
                                        Pair create = Pair.create(new h(attributeValue11, i26, arrayList7, arrayList6), Long.valueOf(j13));
                                        h hVar = (h) create.first;
                                        if (hVar.b != j3) {
                                            long longValue = ((Long) create.second).longValue();
                                            long j67 = longValue == j3 ? j3 : longValue + hVar.b;
                                            arrayList3 = arrayList29;
                                            arrayList3.add(hVar);
                                            j29 = j67;
                                        } else {
                                            if (!equals) {
                                                throw t0.b("Unable to determine start of period " + arrayList29.size(), null);
                                            }
                                            arrayList3 = arrayList29;
                                            z14 = z12;
                                        }
                                    } else {
                                        str72 = str6;
                                        j29 = j11;
                                        arrayList30 = arrayList2;
                                        j39 = j12;
                                        str68 = str3;
                                        arrayList31 = arrayList4;
                                        i27 = j13;
                                        str70 = str5;
                                        str59 = str;
                                        str69 = str4;
                                        str58 = str2;
                                        arrayList32 = arrayList7;
                                        arrayList33 = arrayList6;
                                        j41 = j14;
                                        j40 = j10;
                                        z10 = z11;
                                        arrayList34 = arrayList5;
                                    }
                                }
                                j28 = j12;
                            }
                            j29 = j11;
                            j28 = j12;
                        }
                        if (!h2.a.h(xmlPullParser, "MPD")) {
                            if (i21 == j3) {
                                if (j29 != j3) {
                                    i21 = j29;
                                } else if (!equals) {
                                    throw t0.b("Unable to determine duration of static manifest.", null);
                                }
                            }
                            if (arrayList3.isEmpty()) {
                                throw t0.b("No periods found.", null);
                            }
                            return new c(V, i21, i22, equals, i23, j10, i25, V2, iVar, m6Var, e0Var, uri2, arrayList3);
                        }
                        arrayList29 = arrayList3;
                        i24 = j10;
                        i19 = i7;
                        z9 = z12;
                        arrayList30 = arrayList2;
                        r10 = arrayList;
                        j27 = j3;
                        z10 = z11;
                        str57 = null;
                    }
                }
                z12 = true;
            }
            j10 = i24;
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
            if (ga.a("http://dashif.org/guidelines/trickmode", ((f) arrayList.get(i10)).a)) {
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
        return new o(jVar, j15, j17, j21, j19, list2, j23, list, m0.S(j13), m0.S(j3));
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
            if (ga.a("http://dashif.org/guidelines/last-segment-number", fVar.a)) {
                j14 = Long.parseLong(fVar.b);
                break;
            }
            i7++;
        }
        long j23 = j14;
        long j24 = j12 == -9223372036854775807L ? j11 : j12;
        long j25 = j24 == Long.MAX_VALUE ? -9223372036854775807L : j24;
        hy0 s5 = s(xmlPullParser, "media", pVar != null ? pVar.k : null);
        hy0 s9 = s(xmlPullParser, "initialization", pVar != null ? pVar.j : null);
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
        return new p(jVar, j16, j18, j22, j23, j20, list2, j25, s9, s5, m0.S(j13), m0.S(j3));
    }

    public static ArrayList r(XmlPullParser xmlPullParser, long j3, long j10) {
        long j11;
        ArrayList arrayList = new ArrayList();
        long j12 = 0;
        long j13 = -9223372036854775807L;
        boolean z9 = false;
        int i7 = 0;
        do {
            xmlPullParser.next();
            if (h2.a.i(xmlPullParser, "S")) {
                String attributeValue = xmlPullParser.getAttributeValue(null, "t");
                long parseLong = attributeValue == null ? -9223372036854775807L : Long.parseLong(attributeValue);
                if (z9) {
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
                z9 = true;
            } else {
                b(xmlPullParser);
            }
        } while (!h2.a.h(xmlPullParser, "SegmentTimeline"));
        if (z9) {
            String str = m0.a;
            a(arrayList, j12, j13, i7, m0.a0(j10, j3, 1000L, RoundingMode.DOWN));
        }
        return arrayList;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x00ff. Please report as an issue. */
    public static hy0 s(XmlPullParser xmlPullParser, String str, hy0 hy0Var) {
        String str2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return hy0Var;
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
        return new hy0(arrayList, arrayList2, arrayList3, 2);
    }

    @Override // b3.q
    public final Object L1(Uri uri, j2.k kVar) {
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
